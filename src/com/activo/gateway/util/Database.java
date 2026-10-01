package com.activo.gateway.util;

import java.sql.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

import com.activo.gateway.beans.Afiliaciones;
import com.activo.gateway.beans.LimitesGenerales;
import com.activo.gateway.beans.NIB090501Bean;
import com.activo.gateway.beans.NIB090501Response;
import com.activo.gateway.beans.PreguntasBean;
import com.activo.gateway.beans.Sello;
import com.activo.gateway.beans.Usuario;
import com.activo.gateway.servicios.WSException;
import com.activo.gateway.servicios.Core;

public class Database{
	private String codigoError = "";

	private String descripcionError = "";

	private static final Logger log = Logger.getLogger(Database.class);

	private Connection conn;
	private Connection connSII;	

	public String getCodigoError() {
		return codigoError;
	}

	public void setCodigoError(String codigoError) {
		this.codigoError = codigoError;
	}

	public String getDescripcionError() {
		return descripcionError;
	}

	public void setDescripcionError(String descripcionError) {
		this.descripcionError = descripcionError;
	}

	/**
	 * Realiza la conexion a la base de datos.
	 * @return {@link Boolean}
	 */
	public boolean conectar(){
		try {
			Parametros p = new Parametros();
			String urlDB = "jdbc:sqlserver://" + p.getString("DBserver") + ";databaseName=" + p.getString("DBbasedatos") ;
			String usuarioDB = Crypto.decrypt(p.getString("DBlogin"));
			String claveDB = Crypto.decrypt(p.getString("DBacceso"));

			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverManager.getConnection(urlDB, usuarioDB, claveDB);
			return true;

		} catch (Exception e) {
			log.error("Error en la conexión - " + e.getMessage());
			return false;
		}
	}

	/**
	 * Cierra la conexion a la base de datos
	 */
	public void cerrar(){  
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				log.error("Error en el cierre de la conexión - " + e.getMessage());
			}
			conn = null;
		}
	}

	/**
	 * Realiza la conexion a la base de datos SICAD II.
	 * @return {@link Boolean}
	 */
	public boolean conectarSII(){
		try {
			Parametros p = new Parametros();
			String urlDB = "jdbc:sqlserver://" + p.getString("DBserverSII") + ";instanceName=" + p.getString("DBinstanciaSII") + ";databaseName=" + p.getString("DBbasedatosSII") ;
			String usuarioDB = Crypto.decrypt(p.getString("DBloginSII"));
			String claveDB = Crypto.decrypt(p.getString("DBaccesoSII"));

			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			connSII = DriverManager.getConnection(urlDB, usuarioDB, claveDB);
			return true;

		} catch (Exception e) {
			log.error("Error en la conexión - " + e.getMessage());
			return false;
		}
	}

	/**
	 * Cierra la conexion a la base de datos SICAD II
	 */
	public void cerrarSII(){  
		if (connSII != null) {
			try {
				connSII.close();
			} catch (SQLException e) {
				log.error("Error en el cierre de la conexión - " + e.getMessage());
			}
			connSII = null;
		}
	}


	/**
	 * Busca la data de la pregunta por medio de codigo
	 * 
	 * @param codigo
	 * @return {@link PreguntasBean}
	 * @throws Exception
	 */
	public Map<String,PreguntasBean> obtenerPreguntas() throws SQLException {
		PreparedStatement stmt = null;
		ResultSet rs = null;

		Map<String, PreguntasBean> preguntas = new LinkedHashMap<String, PreguntasBean>();

		try{

			stmt = conn.prepareStatement("SELECT p1.*, p2.codigo as codigo_padre FROM preguntas_autenticacion p1 left join preguntas_autenticacion p2 on p1.pregunta_padre_id=p2.id");
			rs = stmt.executeQuery();

			while(rs.next()){
				PreguntasBean p = new PreguntasBean();
				p.setCodigo(rs.getString("codigo"));
				p.setPregunta(rs.getString("pregunta"));
				p.setFormularioMaxlength(rs.getInt("tamano"));
				p.setFormularioTipo(rs.getString("tipo"));
				p.setEstatus(rs.getString("estatus"));
				p.setCodigoPadre(rs.getString("codigo_padre"));
				preguntas.put(p.getCodigo(), p);
			}
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					;
				}
				rs = null;
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					;
				}
				stmt = null;
			}
		}

		return preguntas;
	}


	/**
	 * Almacena las preguntas que se realizaron al usuario en caso de haber fallado al menos una.
	 * 
	 * @param preguntas
	 * @param tipoCed
	 * @param cedula
	 * @throws SQLException 
	 */
	public void guardarPreguntasIncorrectas(PreguntasBean[] preguntas, String tipoCed, String cedula) throws SQLException{
		PreparedStatement stmt = null;
		ResultSet rs = null;

		try {
			String numero = Crypto.crypt(tipoCed.trim().toUpperCase() + StringUtils.leftPad(cedula.trim(),12,'0'));

			stmt = conn.prepareStatement("SELECT COUNT(id) FROM preguntas_autenticacion_fallidas WHERE cedula = ?");
			stmt.setString(1, numero);
			rs = stmt.executeQuery();
			rs.next();

			if( rs.getInt(1)==0 ){
				stmt.close();
				rs.close();

				stmt = conn.prepareStatement("INSERT INTO preguntas_autenticacion_fallidas (cedula, codigo_pregunta, tipo_respuesta) VALUES(?,?,?)");

				for (int i = 0; i < preguntas.length; i++) {
					stmt.setString(1, numero);
					stmt.setString(2, preguntas[i].getCodigo());
					stmt.setString(3, preguntas[i].getTipoRespuesta());
					stmt.addBatch();
				}

				stmt.executeBatch();
			}
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					;
				}
				rs = null;
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					;
				}
				stmt = null;
			}
		}
	}


	/**
	 * Busca las preguntas fallidas del usuario
	 * 
	 * @param tipoCed
	 * @param cedula
	 * @return
	 * @throws Exception
	 */
	public List<PreguntasBean> obtenerPreguntasFallidas(String tipoCed, String cedula) throws SQLException{
		PreparedStatement stmt = null;
		ResultSet rs = null;

		try{	
			List<PreguntasBean> preguntas = new ArrayList<PreguntasBean>();

			String numero = Crypto.crypt(tipoCed.trim().toUpperCase() + StringUtils.leftPad(cedula.trim(),12,'0'));

			stmt = conn.prepareStatement("SELECT codigo_pregunta, tipo_respuesta FROM preguntas_autenticacion_fallidas WHERE cedula = ?");
			stmt.setString(1, numero);

			rs = stmt.executeQuery();
			while( rs.next() ){
				PreguntasBean p = new PreguntasBean();
				p.setCodigo(rs.getString(1));
				p.setTipoRespuesta(rs.getString(2));
				preguntas.add(p);
			}

			return preguntas;
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					;
				}
				rs = null;
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					;
				}
				stmt = null;
			}
		}
	}


	/**
	 * Para eliminar las preguntas fallidas de un cliente
	 * 
	 * @param tipoCed
	 * @param cedula
	 * @throws SQLException 
	 */
	public void eliminarPreguntasFallidas(String tipoCed, String cedula) throws SQLException {
		PreparedStatement stmt = null;

		try{		
			String numero = Crypto.crypt(tipoCed.trim().toUpperCase() + StringUtils.leftPad(cedula.trim(),12,'0'));
			stmt = conn.prepareStatement("DELETE FROM preguntas_autenticacion_fallidas WHERE cedula = ?");
			stmt.setString(1, numero);
			stmt.executeUpdate();
		} finally {
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					;
				}
				stmt = null;
			}
		}
	}


	/**
	 * Para el bloqueo de usuario en IVR
	 * 
	 * @param tipoCedula
	 * @param cedula
	 * @throws SQLException 
	 */
	public void cambiarEstatusUsuario(String canal, String tipoCedula, String cedula, String nombreCompleto, String registro, String acceso) throws SQLException{
		PreparedStatement stmt = null,stmt2 = null,stmt3 = null,stmt4 = null,stmt5 = null;
		ResultSet rs = null, rs2 = null;
		Parametros p = new Parametros();
		String idUsuario = "";
		int canalUsuario;

		try{
			String numeroCedula = Crypto.crypt(cedula);

			StringBuilder set = new StringBuilder();
			
			if(canal.equals("2") || canal.equals("4")){
				canalUsuario = p.getInt("canalIB");
			}else{
				canalUsuario = p.getInt("canalIVR");
			}

			stmt = conn.prepareStatement("select * from usuarios where tipo_cedula = ? and cedula = ?");			
			stmt.setString(1, tipoCedula);
			stmt.setString(2,numeroCedula);	

			rs = stmt.executeQuery();

			boolean existe = rs.next();

			String sql = "", sql2 = "";

			if(existe){

				idUsuario = rs.getString("id");
				rs.close();
				stmt.close();

				stmt2 = conn.prepareStatement("select * from usuarios_canales where usuario_id = ? and canal_id = ?");
				stmt2.setString(1, idUsuario);
				stmt2.setInt(2, canalUsuario);

				rs2 = stmt2.executeQuery();
				boolean existe2 = rs2.next();
				rs2.close();

				if(existe2){

					if(registro!=null){
						set.append("estatus_registro = ?");
					}

					if(acceso!=null){
						if(set.length()>0) set.append(", ");

						set.append("estatus_acceso=?");
					}

					sql = "UPDATE usuarios_canales SET "+set.toString()+" where usuario_id = ? and canal_id = ?";

					stmt3 = conn.prepareStatement(sql);

					if(registro!=null && acceso!=null){	
						stmt3.setString(1, registro);	
						stmt3.setString(2, acceso);	
						stmt3.setString(3, idUsuario);
						stmt3.setInt(4, canalUsuario);	
					} else if(registro!=null){
						stmt3.setString(1, registro);	
						stmt3.setString(2, idUsuario);		
						stmt3.setInt(3, canalUsuario);
					} else if(acceso != null){
						stmt3.setString(1, acceso);	
						stmt3.setString(2, idUsuario);	
						stmt3.setInt(3, canalUsuario);
					}

					stmt3.executeUpdate();

				}else{

					sql2 = "insert into usuarios_canales (usuario_id, estatus_registro, estatus_acceso, canal_id) values (?,?,?,?) ";
					stmt4 = conn.prepareStatement(sql2);
					stmt4.setString(1, idUsuario);
					stmt4.setString(2, registro);
					stmt4.setString(3, acceso);
					stmt4.setInt(4, canalUsuario);
					stmt4.executeUpdate();
				}


			} else if(registro!=null){
				int key = 0;
				sql = "insert into usuarios(tipo_cedula, cedula, nombre) values(?,?,?)";
				stmt5 = conn.prepareStatement(sql, stmt.RETURN_GENERATED_KEYS);
				stmt5.setString(1, tipoCedula);
				stmt5.setString(2, numeroCedula);
				stmt5.setString(3, nombreCompleto);

				int i = stmt5.executeUpdate();

				ResultSet keys = stmt5.getGeneratedKeys();  
				keys.next();  
				key = keys.getInt(1);  

				if(i > 0){
					sql2 = "insert into usuarios_canales (usuario_id, estatus_registro, estatus_acceso, canal_id) values (?,?,?,?) ";
					stmt4 = conn.prepareStatement(sql2);
					stmt4.setInt(1, key);
					stmt4.setString(2, registro);
					stmt4.setString(3, acceso);
					stmt4.setInt(4, canalUsuario);
					stmt4.executeUpdate();
				}
			}

		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					;
				}
				rs = null;
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					;
				}
				stmt = null;
			}
		}

	}

	/**
	 * Verifica que un usuario se encuentre en la base de datos y devuelve el id, tipo de documento y cedula.
	 * 
	 * @param cedula
	 * @param tipo
         * @param canal
         * @param login
	 * @return
	 * @throws SQLException 
	 */
	public Usuario[] buscarUsuario(String tipo, String cedula, String canal, String login) throws SQLException {

		PreparedStatement stmt = null, stmtParametro = null, stmtUpdateSesion = null;
		ResultSet rs = null, rs1 = null;
                String codigoParametro = null;
                Date fechaActual = new Date(); 
                long lnMilisegundos = fechaActual.getTime();
                java.sql.Timestamp sqlTimestamp = new java.sql.Timestamp(lnMilisegundos);
                Calendar calendar = Calendar.getInstance();                

		try{			
			String numeroCedula = Crypto.crypt(cedula);
                        String loginUsuario = Crypto.crypt(login);
                                
			if(canal == null){
                            stmt = conn.prepareStatement("SELECT id, tipo_cedula, cedula FROM usuarios WHERE tipo_cedula = ? and cedula = ? and rif is null");
                            stmt.setString(1, tipo);
                            stmt.setString(2, numeroCedula);
			} else {
                                                                                    
                            switch (canal) {
                                case "1":  
                                    stmt = conn.prepareStatement("SELECT usuarios.id, usuarios.tipo_cedula, usuarios.cedula, usuarios_canales.estatus_registro, usuarios_canales.estatus_acceso, usuarios_canales.inicio_sesion, usuarios.tipo_rif, usuarios.rif, usuarios.login, usuarios_canales.fecha_hora_sesion, usuarios.nombre, usuarios_canales.fecha_hora_ultima_interaccion FROM usuarios inner join usuarios_canales on usuarios.id = usuarios_canales.usuario_id WHERE usuarios.tipo_cedula = ? and usuarios.cedula = ? and usuarios_canales.canal_id = ? and usuarios.rif is null");
                                    stmt.setString(1, tipo);
                                    stmt.setString(2, numeroCedula);
                                    stmt.setString(3, canal);
                                    break;
                                case "2":
                                    codigoParametro = "tiempo_session";
                                    stmt = conn.prepareStatement("SELECT usuarios.id, usuarios.tipo_cedula, usuarios.cedula, usuarios_canales.estatus_registro, usuarios_canales.estatus_acceso, usuarios_canales.inicio_sesion, usuarios.tipo_rif, usuarios.rif, usuarios.login, usuarios_canales.fecha_hora_sesion, usuarios.nombre, usuarios_canales.fecha_hora_ultima_interaccion FROM usuarios inner join usuarios_canales on usuarios.id = usuarios_canales.usuario_id WHERE usuarios.login = ? and usuarios_canales.canal_id = ? and usuarios.rif is null");
                                    stmt.setString(1, loginUsuario);                                    
                                    stmt.setString(2, canal);
                                    break;
                                case "4":
                                    codigoParametro = "tiempo_session";
                                    stmt = conn.prepareStatement("SELECT usuarios.id, usuarios.tipo_cedula, usuarios.cedula, usuarios_canales.estatus_registro, usuarios_canales.estatus_acceso, usuarios_canales.inicio_sesion, usuarios.tipo_rif, usuarios.rif, usuarios.login, usuarios_canales.fecha_hora_sesion, usuarios.nombre, usuarios_canales.fecha_hora_ultima_interaccion FROM usuarios inner join usuarios_canales on usuarios.id = usuarios_canales.usuario_id WHERE usuarios.login = ? and usuarios_canales.canal_id = ? and usuarios.rif is null");
                                    stmt.setString(1, loginUsuario);                                    
                                    stmt.setString(2, canal);
                                    break;
                                case "5":
                                    codigoParametro = "tiempo_session_pagoactivo";
                                    stmt = conn.prepareStatement("SELECT usuarios.id, usuarios.tipo_cedula, usuarios.cedula, usuarios_canales.estatus_registro, usuarios_canales.estatus_acceso, usuarios_canales.inicio_sesion, usuarios.tipo_rif, usuarios.rif, usuarios.login, usuarios_canales.fecha_hora_sesion, usuarios.nombre, usuarios_canales.fecha_hora_ultima_interaccion FROM usuarios inner join usuarios_canales on usuarios.id = usuarios_canales.usuario_id WHERE usuarios.login = ? and usuarios_canales.canal_id = ? and usuarios.rif is null");
                                    stmt.setString(1, loginUsuario);                                    
                                    stmt.setString(2, canal);
                                    break;
                                default: String error = "Canal Invalido";
                                break;
                            }
                            
                        }                            											

			rs = stmt.executeQuery();

			List<Usuario> usuarios = new ArrayList<Usuario>();

			while(rs.next()){
                            Usuario u = new Usuario();
                            u.setId(rs.getInt(1));
                            u.setTipoCedula(rs.getString(2));
                            u.setCedula(rs.getString(3));
                            u.setTipo_rif(rs.getString(7));
                            u.setRif(rs.getString(8));
                            u.setLogin(rs.getString(9));
                            u.setNombreApellido(rs.getString(11));
                               
                            if(canal != null){
                                
                                u.setEstatusSesion(rs.getInt(6));
                                
                                /*Verifico si el usuario tiene mas del tiempo de sesion inactivo por salida incorrecta
                                  actualizo la sesion en BD    
                                */
                                stmtParametro = conn.prepareStatement("select valor from parametros where codigo = '"+ codigoParametro +"'");
                                rs1 = stmtParametro.executeQuery();  
                                while(rs1.next()){
                                    if(rs.getInt(6) == 1){                                        
                                        int valor = rs1.getInt(1);
                                        calendar.setTime(rs.getTimestamp(10));
                                        calendar.add(Calendar.MINUTE, valor);                                    
                                        //lo que más quieras sumar
                                        Date fechaSalida = calendar.getTime();
                                        if(sqlTimestamp.compareTo(fechaSalida)>0){
                                            if("5".equals(canal)){
                                                stmtUpdateSesion = conn.prepareStatement("UPDATE usuarios_canales SET inicio_sesion = 0, estatus_acceso = 'A' WHERE usuario_id = "+ rs.getInt(1) +" and canal_id = "+ canal +"");
                                                stmtUpdateSesion.executeUpdate();
                                                u.setEstatusAcceso("A");
                                                u.setEstatusSesion(0); 
                                            }else{
                                                stmtUpdateSesion = conn.prepareStatement("UPDATE usuarios_canales SET inicio_sesion = 0 WHERE usuario_id = "+ rs.getInt(1) +" and canal_id = "+ canal +"");
                                                stmtUpdateSesion.executeUpdate();
                                                u.setEstatusAcceso(rs.getString(5));
                                                u.setEstatusSesion(0); 
                                            }                                            
                                        }else{
                                            stmtUpdateSesion = conn.prepareStatement("UPDATE usuarios_canales SET estatus_acceso = 'DS' WHERE usuario_id = "+ rs.getInt(1) +" and canal_id = "+ canal +"");
                                            stmtUpdateSesion.executeUpdate();
                                            u.setEstatusAcceso("DS");
                                        }   
                                    }else{
                                        u.setEstatusAcceso(rs.getString(5));
                                    }                                                                     
                                }  
                                
                                u.setEstatusRegistro(rs.getString(4));                                                            
                                u.setFechaHoraSesion(rs.getTimestamp(10));
                                u.setFechaHoraUltimaconexion(rs.getTimestamp(12));
                            }

                            usuarios.add(u);
			}
                        
			return usuarios.toArray(new Usuario[]{});
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					;
				}
				rs = null;
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					;
				}
				stmt = null;
			}
		}
	}


	/**
	 * Verifica que un usuario se encuentre en la base de datos y devuelve el id, tipo de documento y cedula. Para servicio SUMDSJV
	 * 
	 * @param cedula
	 * @param tipo
	 * @return
	 * @throws WSException 
	 * @throws SQLException 
	 */
	public Usuario[] buscarUsuarioSUMDSJV(String tipo_documento, String documento, String canal){

		PreparedStatement stmt = null;
		ResultSet rs = null;
		List<Usuario> usuarios = new ArrayList<Usuario>();
		Usuario u = new Usuario();
		try{			
			String numeroDocumento = Crypto.crypt(documento);
			String sql = null;
			if("V".equals(tipo_documento) || "P".equals(tipo_documento) || "E".equals(tipo_documento)){
				sql = "SELECT id, tipo_cedula, cedula FROM usuarios WHERE tipo_cedula = '" + tipo_documento + "' and cedula = '" + numeroDocumento + "'";
				stmt = conn.prepareStatement(sql);
			}else if("J".equals(tipo_documento) || ("G".equals(tipo_documento) || "V".equals(tipo_documento))){
				sql = "SELECT id, tipo_cedula, cedula, tipo_rif, rif FROM usuarios WHERE tipo_rif = '" + tipo_documento+ "' and rif = '"+ numeroDocumento + "'";
				stmt = conn.prepareStatement(sql);		
			}

			rs = stmt.executeQuery();
			boolean recorrerRespuesta = rs.next();

			if(recorrerRespuesta){

				u.setId(rs.getInt(1));

				if("V".equals(tipo_documento) || ("P".equals(tipo_documento) || "E".equals(tipo_documento))){
					u.setTipoCedula(rs.getString(2));
					u.setCedula(rs.getString(3));
				}else if("J".equals(tipo_documento) || ("G".equals(tipo_documento) || "V".equals(tipo_documento))){
					u.setTipoCedula(rs.getString(3));
					u.setCedula(rs.getString(4));
				}
				usuarios.add(u);
				return usuarios.toArray(new Usuario[]{});

			}else{
				return new Usuario[]{};
			}


		}  catch (Exception e) {
			log.error("Consulta Usuarios SUMDSJV - " + e.getMessage(),e);
			return new Usuario[]{};
		} 
	}


	/**
	 * Verifica que un usuario se encuentre en la base de datos y devuelve los datos necesarios
	 * 
         * @param login
         * @param canal
	 * @return	 
	 */
	public Usuario[] buscarUsuarioCHECK0USER(String login, String canal){

		PreparedStatement stmt = null, stmtParametro = null, stmtUpdateSesion = null;
		ResultSet rs = null, rs1 = null;
                String codigoParametro = null;
                Date fechaActual = new Date(); 
                long lnMilisegundos = fechaActual.getTime();
                java.sql.Timestamp sqlTimestamp = new java.sql.Timestamp(lnMilisegundos);
                Calendar calendar = Calendar.getInstance();                

		try{						
                    String loginUsuario = Crypto.crypt(login);

                    switch (canal) {                            
                        case "2":
                            codigoParametro = "tiempo_session";
                            stmt = conn.prepareStatement("SELECT usuarios.id, usuarios.tipo_cedula, usuarios.cedula, usuarios_canales.estatus_registro, usuarios_canales.estatus_acceso, usuarios_canales.inicio_sesion, usuarios.tipo_rif, usuarios.rif, usuarios.login, usuarios_canales.fecha_hora_sesion FROM usuarios inner join usuarios_canales on usuarios.id = usuarios_canales.usuario_id WHERE usuarios.login = ? and usuarios_canales.canal_id = ? and usuarios.rif is null");
                            stmt.setString(1, loginUsuario);                                    
                            stmt.setString(2, canal);
                            break;
                        case "4":
                            codigoParametro = "tiempo_session";
                            stmt = conn.prepareStatement("SELECT usuarios.id, usuarios.tipo_cedula, usuarios.cedula, usuarios_canales.estatus_registro, usuarios_canales.estatus_acceso, usuarios_canales.inicio_sesion, usuarios.tipo_rif, usuarios.rif, usuarios.login, usuarios_canales.fecha_hora_sesion FROM usuarios inner join usuarios_canales on usuarios.id = usuarios_canales.usuario_id WHERE usuarios.login = ? and usuarios_canales.canal_id = ? and usuarios.rif is null");
                            stmt.setString(1, loginUsuario);                                    
                            stmt.setString(2, canal);
                            break;
                        case "5":
                            codigoParametro = "tiempo_session_pagoactivo";
                            stmt = conn.prepareStatement("SELECT usuarios.id, usuarios.tipo_cedula, usuarios.cedula, usuarios_canales.estatus_registro, usuarios_canales.estatus_acceso, usuarios_canales.inicio_sesion, usuarios.tipo_rif, usuarios.rif, usuarios.login, usuarios_canales.fecha_hora_sesion FROM usuarios inner join usuarios_canales on usuarios.id = usuarios_canales.usuario_id WHERE usuarios.login = ? and usuarios_canales.canal_id = ? and usuarios.rif is null");
                            stmt.setString(1, loginUsuario);                                    
                            stmt.setString(2, canal);
                            break;
                        default: String error = "Canal Invalido";
                        break;
                    }
                                                                                											
                    rs = stmt.executeQuery();

                    List<Usuario> usuarios = new ArrayList<Usuario>();

                    while(rs.next()){
                        Usuario u = new Usuario();
                        u.setId(rs.getInt(1));
                        u.setTipoCedula(rs.getString(2));
                        u.setCedula(Crypto.decrypt(rs.getString(3)));
                        u.setTipo_rif(rs.getString(7));
                        if(rs.getString(8)!=null){
                            u.setRif(Crypto.decrypt(rs.getString(8)));
                        }else{
                            u.setRif(rs.getString(8));
                        }                        
                        u.setLogin(rs.getString(9));                                                                                                                                                                    

                        if(canal != null){

                            u.setEstatusSesion(rs.getInt(6));

                            /*Verifico el tiempo de sesion y actualizo la sesion en BD */
                            stmtParametro = conn.prepareStatement("select valor from parametros where codigo = '"+ codigoParametro +"'");
                            rs1 = stmtParametro.executeQuery();  
                            while(rs1.next()){
                                int valor = rs1.getInt(1);
                                calendar.setTime(rs.getTimestamp(10));
                                calendar.add(Calendar.MINUTE, valor);                                                                    
                                Date fechaSalida = calendar.getTime();
                                
                                if(sqlTimestamp.compareTo(fechaSalida)<0 && rs.getInt(6) == 1){
                                    stmtUpdateSesion = conn.prepareStatement("UPDATE usuarios_canales SET fecha_hora_sesion = '"+ sqlTimestamp +"' WHERE usuario_id = "+ rs.getInt(1) +" and canal_id = "+ canal +"");
                                    stmtUpdateSesion.executeUpdate();                                    
                                }else{
                                    u.setEstatusSesion(2);
                                }                      
                            }  

                            u.setEstatusRegistro(rs.getString(4));
                            u.setEstatusAcceso(rs.getString(5));                                
                            u.setFechaHoraSesion(rs.getTimestamp(10));
                        }

                        usuarios.add(u);
                    }

                    return usuarios.toArray(new Usuario[]{});

		}  catch (Exception e) {
			log.error("Consulta Usuarios CHECK0USER - " + e.getMessage(),e);
			return new Usuario[]{};
		} 
	}



	public int crearUsuario(String tipoCedula, String cedula, String canal, String nombreCompleto) throws SQLException{
		PreparedStatement stmt = null, stmt2 = null, stmt3 = null;
		ResultSet rs = null;

		try {
			Usuario[] u = buscarUsuario(tipoCedula,cedula, null, null);		

			String numeroCedula = Crypto.crypt(cedula);
			int idUsuario = 0;
			
			Date fechaActual = new Date(); 
	        long lnMilisegundos = fechaActual.getTime();
	        java.sql.Timestamp sqlTimestamp = new java.sql.Timestamp(lnMilisegundos);
	        
	        if(u.length == 0){
				stmt = conn.prepareStatement("insert into usuarios(tipo_cedula,cedula, nombre) values(?,?,?)", stmt.RETURN_GENERATED_KEYS);
				stmt.setString(1, tipoCedula);
				stmt.setString(2, numeroCedula);
				stmt.setString(3, nombreCompleto);
				int i = stmt.executeUpdate();
				ResultSet keys = stmt.getGeneratedKeys();  

				keys.next();  
				idUsuario = keys.getInt(1);  

				if(i > 0){
					stmt2 = conn.prepareStatement("insert into usuarios_canales (usuario_id,canal_id,estatus_acceso, estatus_registro, fecha_creacion) values(?,?,'A','A',?)");
					stmt2.setInt(1, idUsuario);
					stmt2.setString(2, canal);
					stmt2.setString(3, sqlTimestamp.toString());
					stmt2.execute();
				}

				return idUsuario;
			} else if(u.length == 1){
				idUsuario = u[0].getId();

				//se busca el usuario indicando el canal
				u = buscarUsuario(tipoCedula,cedula, canal, null);
				if(u.length == 1){
					if(u[0].getEstatusRegistro() == null || "".equals(u[0].getEstatusRegistro())){
						stmt = conn.prepareStatement("update usuarios_canales set estatus_registro='A', estatus_acceso='A', fecha_creacion=? where canal_id = ? AND usuario_id in (select id from usuarios where tipo_cedula = ? and cedula = ?)");
						stmt.setString(1, sqlTimestamp.toString());
						stmt.setString(2, canal);
						stmt.setString(3, tipoCedula);
						stmt.setString(4, numeroCedula);
						int c = stmt.executeUpdate();

						if(c > 0){
							return idUsuario;
						} else {
							codigoError = "19465";
							descripcionError = "Error SQL: No se actualizaron registros al cambiar el status";
							return 0;
						}

					} else if("A".equals(u[0].getEstatusRegistro())){
						return idUsuario;					
					} else if("B".equals(u[0].getEstatusRegistro())){
						codigoError = "32835";
						descripcionError = "No se pudo crear el usuario, ya que está bloqueado para registro IVR";
						return 0;
					} else {
						codigoError = "32835";
						descripcionError = "No se pudo crear el usuario, ya que se encuentra en estatus "+u[0].getEstatusRegistro();
						return 0;					
					}
				}else{
					stmt3 = conn.prepareStatement("insert into usuarios_canales (usuario_id,canal_id,estatus_acceso, estatus_registro, fecha_creacion) values(?,?,'A','A',?)");
					stmt3.setInt(1, idUsuario);
					stmt3.setString(2, canal);
					stmt3.setString(3, sqlTimestamp.toString());
					stmt3.execute();
					return idUsuario;
				}
			} else {
				codigoError = "92015";
				descripcionError = "No se pudo crear el usuario, ya que existen varios con la misma cédula";
				return 0;
			}
		} catch(Exception ex){
			codigoError = "-1";
			descripcionError = ex.getMessage();
			return 0;
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					;
				}
				rs = null;
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					;
				}
				stmt = null;
			}
			if (stmt2 != null) {
				try {
					stmt2.close();
				} catch (SQLException e) {
					;
				}
				stmt2 = null;
			}
			if (stmt3 != null) {
				try {
					stmt3.close();
				} catch (SQLException e) {
					;
				}
				stmt3 = null;
			}
		}
	}


	/**
	 * Busca y retorna todos los sellos existentes en base de datos
	 * 
	 * @return Sello[] Arreglo con la informacion de los sellos
	 * @throws SQLException
	 */
	public Sello[] buscarSellos() throws SQLException {
		PreparedStatement stmt = null;

		ResultSet rs = null;

		Parametros p = new Parametros();

		String ruta = p.getString("ws_controller");

		try {
			stmt = conn.prepareStatement("SELECT id, nombre FROM sellos");

			rs = stmt.executeQuery();

			List<Sello> sellos = new ArrayList<Sello>();

			while(rs.next()){
				Sello s = new Sello();
				s.setIdSello(rs.getInt(1));
				s.setNombre(rs.getString(2));
				s.setRuta(ruta+"buscar_imagen/"+rs.getString(1));
				sellos.add(s);
			}

			return sellos.toArray(new Sello[]{});

		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					;
				}
				rs = null;
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					;
				}
				stmt = null;
			}
		}
	}

	/**
	 * Verifica y recupera el alias de los productos de la base de datos.
	 * 
	 * @param id_usuario
	 * @param numeroProducto
	 * @return
	 * @throws SQLException 
	 */
	public String buscarAlias(int usuario_id, String numero_producto, String canal) {

		PreparedStatement stmt = null;
		ResultSet rs = null;

		String producto = Crypto.crypt(numero_producto);

		String resumenProductos = null;
		try{
			String sql ="SELECT alias FROM alias_producto WHERE usuario_id = "+usuario_id+" and cuenta = '"+producto+"' and alias is not null";

			stmt = conn.prepareStatement(sql);

			rs = stmt.executeQuery();

			while(rs.next()){
				if(!"".equals(rs.getString(1))){
					resumenProductos = Crypto.decrypt(rs.getString(1));
				}else{
					resumenProductos = "";
				}

			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return resumenProductos;


	}

	/**
	 * Verifica y recupera las afiliaciones de un usuario en particular
	 * 
	 * @param id_usuario
	 * @param numeroProducto
	 * @return
	 * @throws SQLException
	 * @throws WSException  
	 */
	public Afiliaciones[] buscarAfiliaciones(String id_usuario,String tipo_operacion, String tipo_afiliacion, String canal) throws SQLException{

		PreparedStatement stmt = null;
		ResultSet rs = null;
		String sql = null;

		try{	
			if((!StringUtils.isEmpty(tipo_afiliacion)) && (!StringUtils.isEmpty(tipo_operacion))){
				sql =	"SELECT afiliaciones.id, afiliaciones.alias, afiliaciones.numero_cuenta, afiliaciones.nombre_beneficiario, " +
						"afiliaciones.tipo_cedula,afiliaciones.cedula, afiliaciones.email, afiliaciones.monto_maximo, afiliaciones.tipo_rif, " +
						"afiliaciones.rif, acumulado_transaccion.acumulado_internas, acumulado_transaccion.acumulado_internas_terceros, " +
						"acumulado_transaccion.acumulado_externas, acumulado_transaccion.acumulado_externas_terceros, afiliaciones.tipo_afiliacion " +
						"FROM afiliaciones full outer join acumulado_transaccion ON afiliaciones.usuario_id = acumulado_transaccion.usuario_id " +
						"WHERE afiliaciones.usuario_id = " + id_usuario + " and afiliaciones.tipo_operacion = '" + tipo_operacion + "' " +
						"and afiliaciones.tipo_afiliacion = '" + tipo_afiliacion+"'";
			}else{
				sql = "SELECT afiliaciones.id, afiliaciones.alias, afiliaciones.numero_cuenta, afiliaciones.nombre_beneficiario, " +
						"afiliaciones.tipo_cedula,afiliaciones.cedula, afiliaciones.email, afiliaciones.monto_maximo, afiliaciones.tipo_rif, " +
						"afiliaciones.rif, acumulado_transaccion.acumulado_internas, acumulado_transaccion.acumulado_internas_terceros, " +
						"acumulado_transaccion.acumulado_externas, acumulado_transaccion.acumulado_externas_terceros, afiliaciones.tipo_afiliacion " +
						"FROM afiliaciones full outer join acumulado_transaccion ON afiliaciones.usuario_id = acumulado_transaccion.usuario_id " +
						"WHERE afiliaciones.usuario_id = " + id_usuario + " and afiliaciones.tipo_afiliacion != 'a'";;
			}

			stmt = conn.prepareStatement(sql);

			rs = stmt.executeQuery();

			List<Afiliaciones> afiliaciones = new ArrayList<Afiliaciones>();
			
			String numero_cuenta, nombre_beneficiario, acumuladoTotal, aInternas, aInternasTerceros, aExternas, aExternasTerceros, montoMaximo;
			double totalSumatoria;
			Afiliaciones a;
			DecimalFormat formatear;
			while(rs.next()){
				a = new Afiliaciones();
				formatear = new DecimalFormat("#0.00");
				totalSumatoria =0; 
				acumuladoTotal = null;
				aInternas = null;
				aInternasTerceros = null;
				aExternas = null;
				aExternasTerceros = null;
				montoMaximo = null;

				a.setId_afiliacion(rs.getString(1));
				
				numero_cuenta = Crypto.decrypt(rs.getString(3));
				nombre_beneficiario = Crypto.decrypt(rs.getString(4)).toUpperCase();
				//Si la afiliación no tiene alias, se le coloca concatenado 
				//el banco y el beneficiario de la cuenta
				if((rs.getString(2))!= null && !(rs.getString(2)).isEmpty()){
					a.setAlias((Crypto.decrypt(rs.getString(2))).toUpperCase());
				}else{
					String cod_banco = "0";
					if ("P".equals(rs.getString(15)) || "p".equals(rs.getString(15))){
						//se llama al servicio que devuelve los datos del banco dado un número de tarjeta
						try{
							NIB090501Bean reqBanco = new NIB090501Bean();
							reqBanco.setTNROTARJ(numero_cuenta);
							NIB090501Response resBanco = new NIB090501Response();
							resBanco = new Core().NIB090501(reqBanco);
							String respuesta = (resBanco.getNIB090501().getTBANCO()).trim();
							cod_banco = respuesta.substring(3);
						}catch(WSException wse){}
					}else{
						cod_banco = numero_cuenta.trim().substring(0, 4);
					}
					String alias_banco = buscarAliasBanco(Integer.parseInt(cod_banco));
					a.setAlias((alias_banco + "/" + nombre_beneficiario).toUpperCase());
				}
				if((rs.getString(10))!= null && !(rs.getString(10)).isEmpty()){
					a.setRif_beneficiario(Crypto.decrypt(rs.getString(10)));
				}
				aInternas = formatear.format(rs.getDouble(11));
				aInternasTerceros = formatear.format(rs.getDouble(12));
				aExternas = formatear.format(rs.getDouble(13));
				aExternasTerceros = formatear.format(rs.getDouble(14));
				montoMaximo = formatear.format(rs.getDouble(8));

				a.setNumero_cuenta(numero_cuenta);
				a.setNombre_beneficiario(nombre_beneficiario);
				a.setEmail_beneficiario(Crypto.decrypt(rs.getString(7)));
				a.setTipo_cedula_beneficiario(rs.getString(5));
				a.setCedula_beneficiaio(Crypto.decrypt(rs.getString(6)));
				a.setMonto_maximo(montoMaximo);
				a.setTipo_rif_beneficiario(rs.getString(9));



				a.setAcumulado_internas(aInternas);
				a.setAcumulado_internas_terceros(aInternasTerceros);
				a.setAcumulado_externas(aExternas);
				a.setAcumulado_externas_terceros(aExternasTerceros);

				totalSumatoria = rs.getDouble(13) + rs.getDouble(14); 

				acumuladoTotal = formatear.format(totalSumatoria);

				a.setTotal_acumulado_externas(acumuladoTotal);

				afiliaciones.add(a);
			}

			return afiliaciones.toArray(new Afiliaciones[]{});
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					;
				}
				rs = null;
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					;
				}
				stmt = null;
			}
		}
	}


	/**
	 * Verifica y recupera los límites del usuario de la base de datos.
	 * 
	 * @param id_usuario
	 * @param numeroProducto
	 * @return
	 * @throws SQLException 
	 */
	public LimitesGenerales[] buscarLimitesGeneral(String canal, String usuario_id)throws SQLException {

		PreparedStatement stmt1 = null,stmt2 = null,stmt3 = null,stmt4 = null, stmt5 = null;
		ResultSet rs1 = null,rs2 = null,rs3 = null,rs4 = null, rs5 = null;

		String sql1,sql2,sql3,sql4, sql5;
		
		List<LimitesGenerales> usuarios = new ArrayList<LimitesGenerales>();
		String  limiteInternasUsuarios, limiteExternasUsuarios;
		LimitesGenerales u = new LimitesGenerales();
		String limiteIntenasGeneralNatural, limiteExternasGeneralNatural, limiteInternasGeneralJuridico, limiteExternasGeneralJuridico;
		try{
			
			sql5 = "select limite_internas_terceros, limite_externas from usuarios_canales where usuario_id = "+ usuario_id;
			
			stmt5 = conn.prepareStatement(sql5);rs5 = stmt5.executeQuery();
			
			while(rs5.next()){
				limiteInternasUsuarios = rs5.getString("limite_internas_terceros");
				if(!rs5.wasNull()){
					u.setLimiteInternasGeneralNatural(rs5.getDouble(1));
				}else{
					sql1 = "select valor, codigo from parametros where codigo = 'limite_internas_terceros'";
					stmt1 = conn.prepareStatement(sql1);rs1 = stmt1.executeQuery();
					
					while(rs1.next()){
						limiteIntenasGeneralNatural = rs1.getString("codigo");
						if(rs1.wasNull()){
							u.setLimiteInternasGeneralNatural(0);
						}else{
							u.setLimiteInternasGeneralNatural(rs1.getDouble(1));
						}
					}
					
				}
				limiteExternasUsuarios = rs5.getString("limite_externas");
				if(!rs5.wasNull()){
					u.setLimiteExternasGeneralNatural(rs5.getDouble(2));
				}else{
					sql2 = "select valor, codigo from parametros where codigo = 'limite_externas'";
					stmt2 = conn.prepareStatement(sql2);rs2 = stmt2.executeQuery();
					
					while(rs2.next()){
						limiteExternasGeneralNatural = rs2.getString("codigo");
						if(rs2.wasNull()){
							u.setLimiteExternasGeneralNatural(0);
						}else{
							u.setLimiteExternasGeneralNatural(rs2.getDouble(1));
						}
					}
					
				}
			}
			
			//traerme los límites generales de la tabla parametros
			
			
			sql3 = "select valor, codigo from parametros where codigo = 'limite_internas_terceros_J'";
			sql4 = "select valor, codigo from parametros where codigo = 'limite_externas_J'";

			stmt3 = conn.prepareStatement(sql3);rs3 = stmt3.executeQuery();
			stmt4 = conn.prepareStatement(sql4);rs4 = stmt4.executeQuery();

			while(rs3.next()){
				limiteInternasGeneralJuridico = rs3.getString("codigo");
				if(rs3.wasNull()){
					u.setLimiteInternasGeneralJuridico(0);
				}else{
					u.setLimiteInternasGeneralJuridico(rs3.getDouble(1));
				}
			}
			while(rs4.next()){
				limiteExternasGeneralJuridico = rs4.getString("codigo");
				if(rs4.wasNull()){
					u.setLimiteExternasGeneralJuridico(0);
				}else{
					u.setLimiteExternasGeneralJuridico(rs4.getDouble(1));
				}
			}

			usuarios.add(u);

			return usuarios.toArray(new LimitesGenerales[]{});

		} finally {
			;
		}
	}

	/**
	 * Verifica y recupera el tipo y documento de identificación para el servicio de trasnferencias para móvil.
	 * 
	 * @param id_usuario
	 * @param numeroProducto
	 * @return
	 * @throws SQLException 
	 */
	public String buscarEmailUsuario(String id) throws Exception{

		PreparedStatement stmt = null;
		ResultSet rs = null;
		String email = null;
		try{
			stmt = conn.prepareStatement("SELECT email_principal, tipo_rif, rif, rol_juridico_id FROM usuarios WHERE id = ?");
			stmt.setString(1, id);

			rs = stmt.executeQuery();

			while(rs.next()){
				
				if((rs.getString(2) == null && rs.getString(3) == null) || (rs.getString(2) != null && rs.getString(3) != null && "2".equals(rs.getString(4)))){
					if(rs.getString(1) != null && !"".equals(rs.getString(1))){
						email = Crypto.decrypt(rs.getString(1));
					}else{
						email = "";
					}
				}else if(rs.getString(2) != null && rs.getString(3) != null && !"2".equals(rs.getString(4))){
					
					stmt = conn.prepareStatement("SELECT email_principal FROM usuarios WHERE rol_juridico_id = 1 AND tipo_rif = ? and rif = ?");
					stmt.setString(1, rs.getString(2));
					stmt.setString(2, rs.getString(3));
					
					rs = stmt.executeQuery();
					
					while(rs.next()){
						if(rs.getString(1) != null && !"".equals(rs.getString(1))){
							email = Crypto.decrypt(rs.getString(1));
						}else{
							email = "";
						}
					}
				}

			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			rs.close();stmt.close();
		}
		return email;
	}


	/**
	 * Verifica y recupera el mensaje para armar el cuerpo del correo dependiendo del tipo de transacción.
	 * 
	 * @param id_usuario
	 * @param numeroProducto
	 * @return
	 * @throws SQLException 
	 */
	public String buscarMensajeCorreo(String mensajeUsuario) {

		PreparedStatement stmt = null;
		ResultSet rs = null;
		String mensaje = null;

		try{
			stmt = conn.prepareStatement("SELECT mensaje_usuario from textos where codigo = ?");
			stmt.setString(1, mensajeUsuario);

			rs = stmt.executeQuery();

			while(rs.next()){
				if(!"".equals(rs.getString(1))){
					mensaje = rs.getString(1);
				}else{
					mensaje= "";
				}

			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return mensaje;


	}


	/**
	 * Verifica y recupera el contenido del footer para el envío de correos
	 * 
	 * @param id_usuario
	 * @param numeroProducto
	 * @return
	 * @throws SQLException 
	 */
	public String buscarFooterCorreos(String mensajes) {

		PreparedStatement stmt = null;
		ResultSet rs = null;
		String footer = null;

		try{
			stmt = conn.prepareStatement("SELECT mensaje_usuario from textos where codigo = ?");
			stmt.setString(1, mensajes);

			rs = stmt.executeQuery();

			while(rs.next()){
				if(!"".equals(rs.getString(1))){
					footer = rs.getString(1);
				}else{
					footer= "";
				}

			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return footer;


	}



	/**
	 * Verifica y recupera el monto máximo de una afiliación en particular
	 * 
	 * @param id_usuario
	 * @param numeroProducto
	 * @return
	 * @throws SQLException 
	 */
	public double buscarMontoMaximoAfiliacion(String id_usuario, String canal, String numeroProducto) {

		PreparedStatement stmt = null;
		ResultSet rs = null;
		String producto = Crypto.crypt(numeroProducto),sql;
		double  montoMaximo = 0;
		try{			

			sql ="SELECT id, monto_maximo from afiliaciones where usuario_id = "+id_usuario+" and numero_cuenta = '" + producto + "'";
			
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			String monto;
			boolean encontro = rs.next();

			if(encontro){
				monto = rs.getString("monto_maximo");
				if(!rs.wasNull()){
					montoMaximo = rs.getDouble(2);
				}else{
					montoMaximo = 0;
				}
			}else{
				montoMaximo = 0;
			}

		}catch(SQLException e){
			e.printStackTrace();
		}

		return montoMaximo;


	}


	/**
	 * Verifica y recupera las afiliaciones de un usuario en particular
	 * 
	 * @param id_usuario
	 * @param numeroProducto
	 * @return
	 * @throws SQLException 
	 */
	public Afiliaciones[] buscarAcumulados(String id_usuario, String canal) throws SQLException{

		PreparedStatement stmt = null;
		ResultSet rs = null;
		String sql = null;
		try{	

			stmt = conn.prepareStatement("SELECT acumulado_internas, acumulado_internas_terceros, acumulado_externas, acumulado_externas_terceros" +
					" from acumulado_transaccion where usuario_id = ? and fecha = CONVERT(DATE,GETDATE(),103)");

			stmt.setString(1, id_usuario);

			rs = stmt.executeQuery();

			List<Afiliaciones> afiliaciones = new ArrayList<Afiliaciones>();
			String  acumuladoInternas, acumuladoInternasTerceros, acumuladoExternas, acumuladoExternasTerceros;
			while(rs.next()){
				Afiliaciones a = new Afiliaciones();
				a.setId_afiliacion(rs.getString(1));
				acumuladoInternas = rs.getString("acumulado_internas");
				if(!rs.wasNull()){
					a.setAcumulado_internas(rs.getString(1));
				}

				acumuladoInternasTerceros = rs.getString("acumulado_internas_terceros");
				if(!rs.wasNull()){
					a.setAcumulado_internas_terceros(rs.getString(2));
				}

				acumuladoExternas = rs.getString("acumulado_externas");
				if(!rs.wasNull()){
					a.setAcumulado_externas(rs.getString(3));
				}

				acumuladoExternasTerceros = rs.getString("acumulado_externas_terceros");
				if(!rs.wasNull()){
					a.setAcumulado_externas_terceros(rs.getString(4));
				}

				afiliaciones.add(a);
			}

			return afiliaciones.toArray(new Afiliaciones[]{});
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					;
				}
				rs = null;
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					;
				}
				stmt = null;
			}
		}
	}



	/**
	 * Verifica y recupera el alias de los productos de la base de datos.
	 * 
	 * @param id_usuario
	 * @param numeroProducto
	 * @return
	 * @throws SQLException 
	 */
	public String buscarTipoRIF(String usuario_id, String canal) {

		PreparedStatement stmt = null;
		ResultSet rs = null;


		String tipoRif = null;
		try{
			String sql ="SELECT tipo_rif FROM usuarios WHERE id = "+usuario_id;

			stmt = conn.prepareStatement(sql);

			rs = stmt.executeQuery();

			while(rs.next()){
				tipoRif = rs.getString("tipo_rif");
				if(!rs.wasNull()){
					tipoRif = rs.getString(1);
				}else{
					tipoRif = "";
				}

			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return tipoRif;


	}

	public boolean actualizaAcumulado(String usuario_id, double acumulado, int tipoAcumulado, Calendar date){

		PreparedStatement stmt = null, stmt2 = null;
		ResultSet rs = null;
		Afiliaciones[] acumuladoDia = null;
		double blanqueo = 0;

		try {
			Usuario[] u = verificaAcumulado(usuario_id);
			acumuladoDia = buscarAcumulados(usuario_id, "4");
			Calendar hoy = Calendar.getInstance();
			int anio = hoy.get(Calendar.YEAR);
			int mes = hoy.get(Calendar.MONTH)+ 1;
			int dia = hoy.get(Calendar.DATE);
			String fecha = anio+"-"+mes+"-"+dia;
			if(u.length == 0){
				if(tipoAcumulado == 2){
					stmt = conn.prepareStatement("insert into acumulado_transaccion(usuario_id,acumulado_internas_terceros, fecha) values(?,?,?)");
					stmt.setString(1, usuario_id);
					stmt.setDouble(2, acumulado);
					stmt.setString(3, fecha);
				}else if(tipoAcumulado == 3){
					stmt = conn.prepareStatement("insert into acumulado_transaccion(usuario_id,acumulado_externas,fecha) values(?,?,?)");
					stmt.setString(1, usuario_id);
					stmt.setDouble(2, acumulado);
					stmt.setString(3, fecha);
					
				}
			}else if(u.length == 1){
				if(acumuladoDia.length != 0){
					if(tipoAcumulado == 2){
						stmt = conn.prepareStatement("update acumulado_transaccion set acumulado_internas_terceros = "+acumulado+" where usuario_id =" + usuario_id);
					}else if(tipoAcumulado == 3){
						stmt = conn.prepareStatement("update acumulado_transaccion set acumulado_externas = "+acumulado+" where usuario_id =" + usuario_id);
					}
				}else if (acumuladoDia.length == 0){
					if(tipoAcumulado == 2){
						stmt = conn.prepareStatement("update acumulado_transaccion set acumulado_externas = "+blanqueo+", acumulado_internas_terceros = "+acumulado+", fecha = '"+fecha+"' where usuario_id =" + usuario_id);
					}else if(tipoAcumulado == 3){
						stmt = conn.prepareStatement("update acumulado_transaccion set acumulado_internas_terceros = "+blanqueo+", acumulado_externas = "+acumulado+", fecha = '"+fecha+"' where usuario_id =" + usuario_id);
					}
				}
			}
			
			int c = stmt.executeUpdate();

			if(c > 0){
				return true;
			} else {
				codigoError = "19465";
				descripcionError = "Error SQL: No se actualizaron registros al cambiar el status";
				return false;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;		
	}


	public Usuario[] verificaAcumulado(String usuario_id) throws SQLException {

		PreparedStatement stmt = null;
		ResultSet rs = null;

		try{			

			stmt = conn.prepareStatement("SELECT usuario_id from acumulado_transaccion where usuario_id = " + usuario_id);

			rs = stmt.executeQuery();

			List<Usuario> usuarios = new ArrayList<Usuario>();

			while(rs.next()){
				Usuario u = new Usuario();
				u.setAcumulado(rs.getInt(1));

				usuarios.add(u);
			}

			return usuarios.toArray(new Usuario[]{});
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					;
				}
				rs = null;
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					;
				}
				stmt = null;
			}
		}
	}

	/**
	 * Obtiene la abreviación (alias) del nombre del banco dado sus cuatro dígitos de código
	 * @param cod_banco
	 * @return alias_banco
	 * @exception SQLException 
	 * @author Rosiris Veliz 04/02/2014
	 */
	public String buscarAliasBanco(int cod_banco) {

		PreparedStatement stmt 	= null;
		ResultSet rs 			= null;
		String sql, alias_banco = "";
		
		try{
			sql = "SELECT alias FROM bancos WHERE codigo = " + cod_banco;
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();

			while(rs.next()){
				if(!"".equals(rs.getString(1))){
					alias_banco = rs.getString(1);
				}
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return alias_banco;
	}

	/**
	 * Verifica si el cliente realizo alguna solicitud de sicad II
	 * @param numero del cliente
	 * @return  "V" si el cliente realizo alguna solicitud de SICAD II
	 * 			"F" si el cliente no ha realizado solicitudes de SICAD II
	 * @throws SQLException 
	 */

	public String realizoSolicitudSICADII(String numCliente) throws Exception{

		PreparedStatement stmt = null;
		ResultSet rs = null;
		String sql, resp = "F";
		
		try{
			sql = "SELECT count(*) FROM dbo.sd_tran_sicad where ts_cliente = " + numCliente + " and ts_canal = 'SICAD2'";
			stmt = connSII.prepareStatement(sql);
			rs = stmt.executeQuery();

			while(rs.next()){
				if(rs.getInt(1) != 0){
					resp = "V";
				}
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return resp;
	}
	
	public boolean insertarAuditoria(int usuario_id, int transaccion_id, String canal, String ip, String user_agent, String descripcion){

		PreparedStatement stmt = null;
		String sql = "";
		
		try {
                    Date fechaActual = new Date(); 
                    long lnMilisegundos = fechaActual.getTime();
                    java.sql.Timestamp sqlTimestamp = new java.sql.Timestamp(lnMilisegundos);
	        
                    ip = Crypto.crypt(ip);
                    user_agent = Crypto.crypt(user_agent);
                    descripcion = Crypto.crypt(descripcion);
			
                    sql = "INSERT INTO logs (usuario_id, transaccion_id, fecha_hora, canal, ip, user_agent, descripcion) VALUES (?,?,?,?,?,?,?)";
                    stmt = conn.prepareStatement(sql);
                    stmt.setInt(1, usuario_id);
                    stmt.setDouble(2, transaccion_id);
                    stmt.setString(3, sqlTimestamp.toString());
                    stmt.setInt(4, Integer.parseInt(canal));
                    stmt.setString(5, ip);
                    stmt.setString(6, user_agent);
                    stmt.setString(7, descripcion);

                    int c = stmt.executeUpdate();

                    if(c > 0){
                            return true;
                    } else {
                            codigoError = "19465";
                            descripcionError = "Error SQL: No se inserto registro de auditoria";
                            return false;
                    }
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;		
	}
	
	public void actualizarUltInteraccion(int idUsuario, String canal) throws SQLException{
		
		PreparedStatement stmt = null;
		
		try{
                    			
                    Date fechaActual = new Date(); 
                    long lnMilisegundos = fechaActual.getTime();
                    java.sql.Timestamp sqlTimestamp = new java.sql.Timestamp(lnMilisegundos);
                    
                    String sql = "UPDATE usuarios_canales SET fecha_hora_ultima_interaccion = ?, inicio_sesion = ?, fecha_hora_sesion = ? WHERE usuario_id = ? and canal_id = ?";

                    stmt = conn.prepareStatement(sql);
                    stmt.setString(1, sqlTimestamp.toString());
                    stmt.setInt(2, 1);
                    stmt.setString(3, sqlTimestamp.toString());
                    stmt.setInt(4, idUsuario);		
                    stmt.setInt(5, Integer.parseInt(canal));
					
                    stmt.executeUpdate();
                    
		}catch(Throwable e){
			e.printStackTrace();
		} finally {
			stmt.close();
		}
	}

	/**
	 * Actualiza la sesion de un usuario segun el canal
	 * 
         * @param canal
         * @param estatus
	 * @param documento
	 * @param tipoDocumento
         * @param login
	 * @return	 
	 * @throws SQLException 
	 */
	public int actualizarSesion(int canal, int estatus, String tipoDocumento, String documento, String login, String ip) throws SQLException{

		PreparedStatement stmt 	= null;
		String sql = null;
		String update = null;
		String documentoEncript = null;
		String loginEncript = null;
		int resultado = -1;
		int idUsuario = 0;
		ResultSet rs = null;
		
		try{
                    documentoEncript = Crypto.crypt(documento);
                    loginEncript = Crypto.crypt(login);						

                    //query para el id del usuario al que voy a actualizar la sesion
                    sql = "SELECT usuarios.id FROM usuarios WHERE usuarios.login = '" + loginEncript + "'";
                    if("V".equals(tipoDocumento) || "E".equals(tipoDocumento) || "P".equals(tipoDocumento)){
                        sql = sql + " AND usuarios.tipo_cedula = '" + tipoDocumento + "' AND usuarios.cedula = '" + documentoEncript + "'";
                    }else{
                        sql = sql + " AND usuarios.tipo_rif = '" + tipoDocumento + "' AND usuarios.rif = '" + documentoEncript + "'";
                    }

                    stmt = conn.prepareStatement(sql);
                    rs = stmt.executeQuery();

                    if (rs.next()){
                        if(!"".equals(rs.getString(1)))
                            idUsuario = rs.getInt(1);
                        else
                            resultado = -2;
                    }else{
                        resultado = -2;
                    }
                    
                    if(canal==5){
                        update = "UPDATE usuarios_canales SET inicio_sesion = " + estatus + ", estatus_acceso = 'A' WHERE usuarios_canales.canal_id = " + canal + " AND usuario_id = " + idUsuario;
                    }else{
                        update = "UPDATE usuarios_canales SET inicio_sesion = " + estatus + " WHERE usuarios_canales.canal_id = " + canal + " AND usuario_id = " + idUsuario;
                    }                    

                    stmt = conn.prepareStatement(update);	
                    resultado = stmt.executeUpdate();
		    
                    this.insertarAuditoria(idUsuario, 2, String.valueOf(canal), ip, "Servicios", "Fin de Sesion");
                    
		}  catch (Exception e) {
                    log.error("db.actualizarSesion - " + e.getMessage(), e);
                    return resultado;
		} 
                
		return resultado;
	}
}