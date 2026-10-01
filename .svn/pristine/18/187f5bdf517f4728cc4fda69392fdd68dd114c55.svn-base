package com.activo.gateway.repositories;

import java.util.List;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import org.apache.log4j.Logger;
import com.activo.gateway.beans.ExtraCreditoInfoBean;
import com.activo.gateway.beans.MovimientoExtracreditoBean;
import com.activo.gateway.interfaces.IExtraCreditoRepo;
import com.activo.gateway.util.Parametros;
import com.activo.gateway.util.Crypto; 


/**
 * Clase repositorio de informacion de extracreditos
 * 
 * Esta clase funciona como repositorio para extraer la información necesaria de la base de datos correspondiente a los extracreditos
 * de una tdc especifica.
 * 
 * @author P011203513
 *
 */
public class ExtraCreditoRepo implements IExtraCreditoRepo {
	
	String DRIVER; 
    String URL;
    Connection conn;
    PreparedStatement st;
    SimpleDateFormat df;
    String usuario400;
    String pass400;
    private static final Logger log = Logger.getLogger(ExtraCreditoRepo.class);
    Parametros params = new Parametros();
	

    public ExtraCreditoRepo() {
    	this.DRIVER = "com.ibm.as400.access.AS400JDBCDriver";
    	this.URL = "jdbc:as400://"+ params.getString("ip") +"/SATCC;naming=system;errors=full";
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
    public List<ExtraCreditoInfoBean> getExtraCreditos(String numTarjeta) throws Exception{

        if(numTarjeta.length() != 16){
            throw new Exception("Numero de tarjeta debe contener 16 digitos");
        }

        String query = "select * from " + params.getString("extracredito.tabla.info") + " WHERE STSMIC in ('P','A') and TRJMIC = ? ";
        ArrayList<ExtraCreditoInfoBean> extCreds = new ArrayList<ExtraCreditoInfoBean>();

        try {
            this.Connect();
            st = this.conn.prepareStatement(query);
            this.st.setString(1, numTarjeta);

            ResultSet rs = this.st.executeQuery();

            while(rs.next()) {
            	ExtraCreditoInfoBean ext = new ExtraCreditoInfoBean();
                ext.setNumeroTarjeta(rs.getString("TRJMIC"));
                ext.setNumeroCredito(rs.getString("NICMIC"));
                ext.setEstatus(rs.getString("STSMIC"));
                ext.setCodigoComercio(rs.getString("COMMIC"));
                ext.setFechaAutorizacion(rs.getString("FAUMIC"));
                ext.setFechaUltimoProceso(rs.getString("FUPMIC"));
                ext.setMontoTotalCredito(rs.getDouble("MTTMIC"));
                ext.setMontoInicial(rs.getDouble("MTIMIC"));
                ext.setMontoPrimeraCuota(rs.getDouble("MPCMIC"));
                ext.setMontoComision(rs.getDouble("MTCMIC"));
                ext.setNumeroCuotas(rs.getInt("NCIMIC"));
                ext.setTasa(rs.getDouble("VTIMIC"));
                ext.setPeriodoGracia(rs.getInt("MPGMIC"));
                ext.setFechaPeriodoGracia(rs.getString("VPGMIC"));
                ext.setTasaPeriodoGracia(rs.getDouble("TPGMIC"));
                ext.setSaldoPendiente(rs.getDouble("SPPMIC"));
                ext.setCuotasPendientes(rs.getInt("NCPMIC"));
                ext.setInteresPendiente(rs.getDouble("IPPMIC"));
                ext.setInteresPagado(rs.getDouble("INTMIC"));
                ext.setTipoProd(rs.getString("TIPMIC"));

                extCreds.add(ext);
            }

        }
        catch (SQLException e) {
            log.error(e.getMessage());
            throw new Exception("Error en la base de datos - " + e.getErrorCode());
        } catch (ClassNotFoundException e) {
        	log.error(e.getMessage());
            throw new Exception("Ocurrio un error en el servidor");
        } finally {
            try {
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
        return extCreds;
    }

    @Override
    public List<MovimientoExtracreditoBean> getMovimientosExtraCredito(ExtraCreditoInfoBean ext) throws Exception{
        if(ext.getNumeroTarjeta().length() != 16 || ext.getNumeroCredito() == null || "".equals(ext.getNumeroCredito())){
            throw new Exception("Es necesario el numero de tarjeta y el numero de credito en en objeto ExtraCreditoBean");
        }

        String query = "select * from " + params.getString("extracredito.tabla.detalle") + " where TRJDIC = ? and NICDIC = ?";
        ArrayList<MovimientoExtracreditoBean> movList = new ArrayList<MovimientoExtracreditoBean>();

        try{
            this.Connect();
            this.st = conn.prepareStatement(query);

            this.st.setString(1, ext.getNumeroTarjeta());
            this.st.setString(2, ext.getNumeroCredito());

            ResultSet rs = this.st.executeQuery();

            while(rs.next()){
                MovimientoExtracreditoBean mov = new MovimientoExtracreditoBean();
                mov.setFechaMovimiento(rs.getString("FIGDIC"));
                mov.setTasaMes(rs.getDouble("TIMDIC"));
                mov.setConcepto(rs.getString("CONDIC"));
                mov.setMonto(rs.getDouble("MTCDIC"));
                mov.setSaldoAnterior(rs.getDouble("SPPDIC"));
                mov.setInteresesAnterior(rs.getDouble("IPPDIC"));
                mov.setNuevoSaldo(rs.getDouble("SPNDIC"));
                mov.setInteresesGenerados(rs.getDouble("IGMDIC"));
                mov.setInteresesCancelados(rs.getDouble("ICMDIC"));
                mov.setCuotasCanceladas(rs.getInt("NCCDIC"));

                movList.add(mov);
            }

        }catch (SQLException e) {
        	log.error(e.getMessage());
        	throw new Exception("Error en la base de datos - " + e.getErrorCode());
        } catch (ClassNotFoundException e) {
        	log.error(e.getMessage());
        	throw new Exception("Ocurrio un error en el servidor");
        } finally {
        	try {
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

        return movList;
    }
}
