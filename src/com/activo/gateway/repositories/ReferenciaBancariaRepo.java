package com.activo.gateway.repositories;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Instant;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

import com.activo.gateway.beans.CARDSJVBean;
import com.activo.gateway.beans.CARDSJVResponse;
import com.activo.gateway.beans.NIBPF3010Bean;
import com.activo.gateway.beans.NIBPF3010Response;
import com.activo.gateway.beans.ReferenciaBancariaBean;
import com.activo.gateway.beans.SUMDSJVBean;
import com.activo.gateway.beans.SUMDSJVResponse;
import com.activo.gateway.interfaces.IReferenciaBancaria;
import com.activo.gateway.util.Crypto;
import com.activo.gateway.util.Parametros;
import com.activo.gateway.util.Database;
import com.activo.gateway.servicios.Core;
import com.activo.gateway.servicios.WSException;


/**
 * Clase repositorio de informacion de referencias bancarias
 * 
 * Esta clase funciona como repositorio para extraer la información necesaria para una referencia bancaria
 * 
 * @author Rosiris Veliz rveliz@bancoactivo.com
 *
 */
public class ReferenciaBancariaRepo implements IReferenciaBancaria {
	
	String DRIVER; 
    String URL;
    Connection conn;
    PreparedStatement st;
    SimpleDateFormat df;
    ResultSet rs;
    String usuario400;
    String pass400;
    private static final Logger log = Logger.getLogger(ReferenciaBancariaRepo.class);
    Core servicios = new Core();
    Parametros params = new Parametros();
	
    public ReferenciaBancariaRepo() {
    	this.DRIVER = "com.ibm.as400.access.AS400JDBCDriver";
    	this.URL = "jdbc:as400://"+ params.getString("ip") +"/"+ params.getString("as400.lib.cyfiles") +";naming=system;errors=full";
    	this.df = new SimpleDateFormat("yyyyMMdd");
    	this.conn = null;
    	this.st = null;
    	this.usuario400 = Crypto.decrypt(params.getString("as400.usuario"));
    	this.pass400 = Crypto.decrypt(params.getString("as400.pass"));
	}
    
    private void Connect() throws Exception{
		Class.forName(DRIVER);
		if(this.conn == null){
			this.conn = DriverManager.getConnection(URL, this.usuario400, this.pass400);
		}
    }
	
	@Override
	public ReferenciaBancariaBean getDatosReferencia(ReferenciaBancariaBean req) throws Exception{
		
                    if(req.getNroIdentificacionCliente() == null || "".equals(req.getNroIdentificacionCliente()) || 
        		 req.getTipoCliente() == null || "".equals(req.getTipoCliente())){
            throw new Exception("Numero de identificacion del cliente es obligatorio");
        }else if(req.getTipoProducto().equals("1")  && req.getNumeroProducto().trim().length() != 20){
            throw new Exception("Numero de cuenta debe contener 20 digitos");
        }else if((req.getTipoProducto().equals("1") && req.getTipoReferencia() == null) || (req.getTipoProducto().equals("1") && "".equals(req.getTipoReferencia().trim()))){
            throw new Exception("Tipo de referencia es obligatorio "+ req.getTipoProducto());
        }else if(req.getTipoProducto().equals("2")  && req.getNumeroProducto().trim().length() != 16){
            throw new Exception("Numero de tarjeta debe contener 16 digitos");
        }
		          
		Database bd = new Database();
		ReferenciaBancariaBean datos = new ReferenciaBancariaBean();
		
		try{
			bd.conectar();
			
			String cifra;
			String[] datosFirma;
			Date date = new Date();
	        String fechaHoy = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(date);
                        
	        
	        NIBPF3010Response res3010 = obtenerDatosClienteProducto(req);
			
	        req = obtenerDescripcionProducto(res3010.getNIBPF3010().getIDENTIFICACIONIBS(), req);
        
			datos.setCanal(req.getCanal());
			datos.setIdUsuario(req.getIdUsuario());
	        datos.setNumeroProducto(req.getNumeroProducto());
	    	datos.setNumeroCliente(res3010.getNIBPF3010().getNROCLIENTE());
	    	datos.setNroIdentificacionCliente(req.getNroIdentificacionCliente());
	    	datos.setTipoCliente(req.getTipoCliente());
	    	datos.setTipoProducto(req.getTipoProducto());
	    	datos.setTipoReferencia(req.getTipoReferencia());
	    	datos.setCodProducto(req.getCodProducto());
	    	datos.setDescripcionProducto(req.getDescripcionProducto());
	    	datos.setNombreCliente(res3010.getNIBPF3010().getINTLNADB());
	    	datos.setFechaInicioCliente(res3010.getNIBPF3010().getDISPONIBLE2().substring(0,2)+"/"+
	    								res3010.getNIBPF3010().getDISPONIBLE2().substring(2,4)+"/"+
	    								"20"+res3010.getNIBPF3010().getDISPONIBLE2().substring(4));
	    	datos.setFechaGeneracion(fechaHoy);
	    	datos.setDirigidaA(req.getDirigidaA());
	    	
	    	if("1".equals(req.getTipoReferencia())){
	    		datos.setTipoReferencia("mensual");
	    	}else if("2".equals(req.getTipoReferencia())){
	    		datos.setTipoReferencia("trimestral");
	    	}else{
	    		datos.setTipoReferencia("");
	    	}
	    	
	    	if(res3010.getNIBPF3010().getMONEDA().equals("VEB") || req.getTipoProducto().equals("2")){
	    		datos.setMoneda("BOLÍVARES (Bs)");
	    	}else{
	    		datos.setMoneda("MONEDA EXTRANJERA ("+ res3010.getNIBPF3010().getMONEDA() +")");
	    	}
			
	    	if(req.getTipoProducto().equals("1")){
    
	    		cifra = obtenerPromedioCuenta(req.getNumeroProducto().substring(10), res3010.getNIBPF3010().getNROCLIENTE(), req.getTipoReferencia());
	    	
                }else{
	    		cifra = obtenerLimiteTarjeta(req.getNumeroProducto().trim());
	    	}
	    	
	        datos.setCantCifras(obtenerCantidadCifras(cifra.length()));
	    	datos.setNivelCifras(obtenerNivelCifra(Integer.valueOf(cifra.substring(0,1))));
	    	datos.setCodigoConfirmacion(StringUtils.leftPad(obtenerCodigoConfirmacion(), 9,'0'));
                datosFirma = bd.buscarDatosFirmaReferencia(req.getTipoProducto());
	    	datos.setNombreFirma(datosFirma[0]);
	    	datos.setCargoFirma(datosFirma[1]);
	    	datos.setImagenFirma(datosFirma[2]);
	    	
		}finally{
			bd.cerrar();
		}
            return datos;
	}
	
    public String obtenerPromedioCuenta(String numeroProducto, String numeroCliente, String tipoReferencia) throws Exception{

    	Calendar fecha = new GregorianCalendar();
        int anho = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH);
        int meses = 1, mesInicio, mesFin, anhoInicio, anhoFin;
		Double promedio = 0.0;
		
        if("1".equals(tipoReferencia)){//Mensual
        	if(mes == 0){//Si es Enero el saldo promedio es de Diciembre del año anterior
        		mesInicio = 12;
        		anhoInicio = anho-1;
        		mesFin = 12;
        		anhoFin = anho-1;
        	}else{
        		mesInicio = mes;
        		anhoInicio = anho;
        		mesFin = mes;
        		anhoFin = anho;
        	}
        }else{//Trimestral
        	meses = 3;
        	if(mes == 0){//Si es Enero el saldo promedio es desde Octubre del año anterior
        		mesInicio = 10;
        		anhoInicio = anho-1;
        		mesFin = 12;
        		anhoFin = anho - 1;
        	}else if(mes == 1){//Si es Febrero el saldo promedio es desde Noviembre del año anterior
        		mesInicio = 11;
        		anhoInicio = anho-1;
        		mesFin = mes;
        		anhoFin = anho;
        	}else if(mes == 2){//Si es Marzo el saldo promedio es desde Diciembre del año anterior
        		mesInicio = 12;
        		anhoInicio = anho-1;
        		mesFin = mes;
        		anhoFin = anho;
        	}else{
        		mesInicio = mes-2;
        		anhoInicio = anho;
        		mesFin = mes;
        		anhoFin = anho;
        	}
        }
        
        try {
    		String query = "SELECT CPRAVG FROM " + params.getString("as400.lib.cyfiles") + "." + params.getString("as400.tabla.ref.cuenta") + " WHERE CPRACC = ? AND CPRCUN = ? AND CPRDTM >= ? AND CPRDTM <= ? AND CPRDTY >= ? AND CPRDTY <= ?";

    		this.Connect();
            
            this.st = this.conn.prepareStatement(query);
            this.st.setString(1, numeroProducto);
            this.st.setString(2, numeroCliente);
            this.st.setString(3, String.valueOf(mesInicio));
            this.st.setString(4, String.valueOf(mesFin));
            this.st.setString(5, String.valueOf(anhoInicio));
            this.st.setString(6, String.valueOf(anhoFin));

            this.rs = this.st.executeQuery();
           
            while(rs.next()) {
            	promedio = promedio + this.rs.getDouble("CPRAVG");
            }
            
        } catch (SQLException e) {
            log.error(e.getMessage());
            //log.error(e.getStackTrace());
            throw new Exception("Error en la base de datos - " + e.getErrorCode());
        } catch (Exception e) {
        	log.error(e.getMessage());
        	e.printStackTrace();
            throw new Exception("Ocurrio un error en el servidor");
        } finally {
            try {
            	if(this.rs != null){
            		this.rs.close();
                }
                if(this.st != null){
                    this.st.close();
                }
                if(this.conn != null){
                    this.conn.close();
                }
            } catch (SQLException e) {
            	log.error(e.getMessage());
            }
        }
        
        promedio = (promedio/meses);
        
        return Double.toString(promedio).split("\\.")[0];
    }

    public String obtenerLimiteTarjeta(String numeroProducto) throws Exception{
    	
    	String limite = "";
    	CARDSJVBean req = new CARDSJVBean();
    	Core cr = new Core();
    	CARDSJVResponse res = null;
    	req.setCanal("4");
    	req.setCARNUM(numeroProducto);
    	res = cr.CARDSJV(req);
    	if(res != null){
    		limite = res.getCARDSJV().getCARCRL();
    	}	
    	
    	return limite;
		/*Double limite = 0.0;
		
        try {
    		String query = "SELECT CCMLNL FROM " + params.getString("as400.lib.cyfiles") + "." + params.getString("as400.tabla.ref.tdc") + " WHERE CCMACC = ?";

    		this.Connect();
            
            this.st = this.conn.prepareStatement(query);
            this.st.setLong(1, Long.getLong(numeroProducto));
            
            this.rs = this.st.executeQuery();
           
            while(rs.next()) {
            	limite  = this.rs.getDouble("CCMLNL");
            }
            
        } catch (SQLException e) {
            log.error(e.getMessage());
            throw new Exception("Error en la base de datos - " + e.getErrorCode());
        } catch (Exception e) {
        	log.error(e.getMessage());
        	e.printStackTrace();
            throw new Exception("Ocurrio un error en el servidor");
        } finally {
            try {
            	if(this.rs != null){
            		this.rs.close();
                }
                if(this.st != null){
                    this.st.close();
                }
                if(this.conn != null){
                    this.conn.close();
                }
            } catch (SQLException e) {
            	log.error(e.getMessage());
            }
        }
        return Double.toString(limite).split("\\.")[0];*/
    }
    
    private String obtenerNivelCifra(int digito){
    	
    	if(digito>=1 && digito<=3){
        	return "BAJAS";
        }else if(digito>=4 && digito<=6){
        	return "MEDIAS";
        }else{
        	return "ALTAS";
        }
    	
    }

    private String obtenerCantidadCifras(int cantidad){
    	
        String[] numeros = {"", "UNA", "DOS", "TRES", "CUATRO", "CINCO", "SEIS", "SIETE", 
				"OCHO", "NUEVE", "DIEZ", "ONCE", "DOCE", "TRECE", "CATORCE", 
				"QUINCE", "DIECISEIS", "DIECISIETE", "DIECIOCHO", "DIECINUEVE", "VEINTE"};

        return numeros[cantidad]+" ("+ String.valueOf(cantidad) +")";
    }

    private ReferenciaBancariaBean obtenerDescripcionProducto(String identificacionCliente, ReferenciaBancariaBean req) throws Exception{
    	
    	String codProducto = "", codSubProducto = "", descProducto = "";
    	SUMDSJVBean reqSUM = new SUMDSJVBean();
		SUMDSJVResponse resSUM = null;
		
		reqSUM.setSUMACN(identificacionCliente);
		reqSUM.setSUMFIR("X");
		resSUM = servicios.SUMDSJV(reqSUM);

		SUMDSJVBean productos[] = resSUM.getSUMDSJV();
		SUMDSJVBean producto = null;
		
		for (int i=0; i < productos.length; i++){
			producto = productos[i];
			if(producto.getSUMACN().trim().equals(req.getNumeroProducto().trim())){
				descProducto = producto.getSUMDSC().trim();
				codProducto = producto.getSUMTYP();
				codSubProducto = producto.getSUMUSR();
				break;
			}
		}
		
		if(req.getNumeroProducto().trim().length() == 20 && codProducto.equals("SAV")){
			descProducto = "Cuenta de Ahorros";
		}else if (req.getNumeroProducto().trim().length() == 20 && !codProducto.equals("SAV")){
			descProducto = "Cuenta Corriente";
		}
		
		req.setCodProducto(codSubProducto.trim());
		req.setDescripcionProducto(descProducto);
		
		return req;
    }
    
    public NIBPF3010Response obtenerDatosClienteProducto(ReferenciaBancariaBean req) throws Exception{
    	
    	NIBPF3010Bean req3010 = new NIBPF3010Bean();
		NIBPF3010Response res3010 = null;
		
		if(req.getTipoProducto().equals("1")){
			req3010.setNACIONALIDAD(req.getTipoCliente());
			req3010.setNROIDENTIFICACION(StringUtils.leftPad(req.getNroIdentificacionCliente(), 12,'0'));
			req3010.setNROCUENTA(StringUtils.leftPad(req.getNumeroProducto().substring(10),12,'0'));
			req3010.setNROPARAM("5");
		}else{
			req3010.setNROTDC(req.getNumeroProducto());
			req3010.setNROPARAM("4");
		}
		
		res3010 = servicios.NIBPF3010(req3010);

		if(res3010.getError()!=null){
			throw new Exception("Numero de producto no pertenece al cliente");
		}
		
		String idCliente = req.getTipoCliente()+StringUtils.leftPad(req.getNroIdentificacionCliente(), 9,'0');
		if(!res3010.getNIBPF3010().getIDENTIFICACIONIBS().equals(idCliente)){
			throw new Exception("Numero de producto no pertenece al cliente");
		}
			
		return res3010;
    }

    private String obtenerCodigoConfirmacion(){
    	Database bd = new Database();
    	Random rnd = new Random();
        String codigo;
            
    	rnd.setSeed(Instant.now().toEpochMilli());
           bd.conectar();
           do{
            codigo = String.valueOf((rnd.nextInt(999999999 + 1) + 1));
           }while(!bd.existeReferenciaBancaria(codigo));
           bd.cerrar();
    	return codigo ;
    }
    
}
