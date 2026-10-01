package com.activo.gateway.util;



import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.apache.log4j.Logger;




/**
 * @author P011203513
 * 
 * Clase que encapsula el envio de sms a traves del servicio ofrecido por stored procedures
 *
 */
public class SmsSP {
	
	private String smsDbHost = ""; // Host del servidor SQL Server
	private String smsDbName = ""; // Nombre de la Base de datos
	private String smsDbSp = "";  // Nombre del Stored Procedure
	private String smsDbUser = ""; // Nombre del usuario de la Base de Datos
	private String smsDbPwd = ""; // Password del Usuario de la Base de Datos
	private String numcel = ""; // Numero de Celular incluyendo el 0
	private String canal1 = ""; // Canal del mensaje (Ver Plantilla de Códigos)
	private String cuenta = ""; // Nº Cuenta (últimos 4)
	private String fecha = ""; // YYYYMMDD
	private String hora = ""; // HHMMSS
	private String monto = ""; // Monto de la Operación
	private String cheque = ""; // Cheque
	private String priori = ""; // Prioridad
	private String xrnde11 = ""; // Campos Claves
	private String xrnde38 = ""; // Campos Claves
	private String fectim = ""; //Campos Claves (Fecha
	private String refnum = ""; // Referencia
	private String tipcre = ""; // Valor 00000
	private String act = ""; // Si el Nº de  cuenta empieza por (4 ó 6)  es Corriente sino es cuenta de Ahorro (Valor 2, 4 o 6)
	private static final Logger log = Logger.getLogger(Database.class);
	private Connection conn;
	
	public SmsSP() {
		Parametros p = new Parametros();
		DateFormat df = new SimpleDateFormat("YYYYMMdd");
		DateFormat tf = new SimpleDateFormat("HHmmss");
		Calendar calendar = Calendar.getInstance();
		Date hoy = calendar.getTime();
		this.smsDbHost = p.getString("sms.db.host");
		this.smsDbName = p.getString("sms.db.name");
		this.smsDbPwd = Crypto.decrypt(p.getString("sms.db.pwd"));
		this.smsDbSp = p.getString("sms.db.sp");
		this.smsDbUser = Crypto.decrypt(p.getString("sms.db.user"));
		this.priori = "1";
		this.tipcre = "00000";
		this.fecha = df.format(hoy);
		this.hora = tf.format(hoy);
		this.monto = "0";
		this.cheque = "0";
		
	}

	/**
	 * Realiza el envio del SMSs.
	 * Se debe haber indicado el numero de celular en el atributo numcel y la plantilla del
	 * mensaje en el atributo canal1 antes de enviar el sms.
	 * @return {@link Boolean}
	 */
	
	public boolean enviaSms(){
		boolean exito = true;
		CallableStatement proc_stmt = null;
		// Validamos que tenga los parametros necesarios
		if(this.canal1 == "" || this.numcel == "" || this.fecha == "" || this.hora == ""){
			log.error("SMSSP - Parametros insuficientes");
			exito = false;
		}
		if(this.conectar()){
			try {
				int res = 0;
				proc_stmt = this.conn.prepareCall("{ call "+this.smsDbSp+"(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) }");
				
				proc_stmt.setString("numcel", this.numcel);
				proc_stmt.setString("canal1", this.canal1);
				proc_stmt.setString("cuenta", this.cuenta);
				proc_stmt.setString("fecha", this.fecha);
				proc_stmt.setString("hora", this.hora);
				proc_stmt.setString("monto", this.monto);
				proc_stmt.setString("cheque", this.cheque);
				proc_stmt.setString("priori", this.priori);
				proc_stmt.setString("xrnde11", this.xrnde11);
				proc_stmt.setString("xrnde38", this.xrnde38);
				proc_stmt.setString("fectim", this.fectim);
				proc_stmt.setString("refnum", this.refnum);
				proc_stmt.setString("tipcre", this.tipcre);
				proc_stmt.setString("act", this.act);
				proc_stmt.setInt("result", res);
				log.info("SMSSP - Enviando el SMS");
				if(proc_stmt.execute()){
					res = proc_stmt.getInt("@result");
					if (res == 0){
						log.error("SMSSP - Error al enviar el SMS");
						exito = false;
					}
				}
			} catch (SQLException e) {
				log.error("SMSSP - "+e.getMessage());
				exito = false;
			}finally{
				proc_stmt = null;
				this.cerrar();
			}
		}
		
		return exito;
	}
	
	
	/**
	 * Realiza la conexion a la base de datos.
	 * @return {@link Boolean}
	 */
	public boolean conectar(){
		try {
			Parametros p = new Parametros();
			String urlDB = "jdbc:sqlserver://" + this.smsDbHost + ";databaseName=" + this.smsDbName ;
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverManager.getConnection(urlDB, this.smsDbUser, this.smsDbPwd);
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
	
	// Getters y Setters
	public String getSmsDbHost() {
		return smsDbHost;
	}


	public void setSmsDbHost(String smsDbHost) {
		this.smsDbHost = smsDbHost;
	}


	public String getSmsDbName() {
		return smsDbName;
	}


	public void setSmsDbName(String smsDbName) {
		this.smsDbName = smsDbName;
	}


	public String getSmsDbSp() {
		return smsDbSp;
	}


	public void setSmsDbSp(String smsDbSp) {
		this.smsDbSp = smsDbSp;
	}


	public String getSmsDbUser() {
		return smsDbUser;
	}


	public void setSmsDbUser(String smsDbUser) {
		this.smsDbUser = smsDbUser;
	}


	public String getSmsDbPwd() {
		return smsDbPwd;
	}


	public void setSmsDbPwd(String smsDbPwd) {
		this.smsDbPwd = smsDbPwd;
	}


	public String getNumcel() {
		return numcel;
	}


	public void setNumcel(String numcel) {
		this.numcel = numcel;
	}


	public String getCanal1() {
		return canal1;
	}


	public void setCanal1(String canal1) {
		this.canal1 = canal1;
	}


	public String getCuenta() {
		return cuenta;
	}


	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}


	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	public String getHora() {
		return hora;
	}


	public void setHora(String hora) {
		this.hora = hora;
	}


	public String getMonto() {
		return monto;
	}


	public void setMonto(String monto) {
		this.monto = monto;
	}


	public String getCheque() {
		return cheque;
	}


	public void setCheque(String cheque) {
		this.cheque = cheque;
	}


	public String getPriori() {
		return priori;
	}


	public void setPriori(String priori) {
		this.priori = priori;
	}


	public String getXrnde11() {
		return xrnde11;
	}


	public void setXrnde11(String xrnde11) {
		this.xrnde11 = xrnde11;
	}


	public String getXrnde38() {
		return xrnde38;
	}


	public void setXrnde38(String xrnde38) {
		this.xrnde38 = xrnde38;
	}


	public String getFectim() {
		return fectim;
	}


	public void setFectim(String fectim) {
		this.fectim = fectim;
	}


	public String getRefnum() {
		return refnum;
	}


	public void setRefnum(String refnum) {
		this.refnum = refnum;
	}


	public String getTipcre() {
		return tipcre;
	}


	public void setTipcre(String tipcre) {
		this.tipcre = tipcre;
	}


	public String getAct() {
		return act;
	}


	public void setAct(String act) {
		this.act = act;
	}

}
