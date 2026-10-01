/**
 * Clase repositorio de informacion de fecha feriados
 * 
 * Esta clase funciona como repositorio para extraer la información necesaria de la base de datos correspondiente a los extracreditos
 * de dias feriados.
 * 
 * @author P016301630
 *
 */
package com.activo.gateway.repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import org.apache.log4j.Logger;
import com.activo.gateway.beans.ConsultaFeriadosBean;
import com.activo.gateway.util.Parametros;
import com.activo.gateway.util.Crypto; 

public class ConsultaFeriadosRepo {
    
    String DRIVER; 
    String URL;
    Connection conn;
    PreparedStatement st;
    SimpleDateFormat df;
    String usuario400;
    String pass400;
    private static final Logger log = Logger.getLogger(ConsultaFeriadosRepo.class);
    Parametros params = new Parametros();
    
    public ConsultaFeriadosRepo() {
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
    
    public ConsultaFeriadosBean consultaFecha(String dia, String mes, String ano) throws Exception{

        if("".equals(dia) || "".equals(mes) || "".equals(ano)){
            throw new Exception("Debe ingresar toda la informacion");
        }

        String query = "SELECT holday, holdam, holdad FROM " + params.getString("feriados.tabla.info") + " WHERE holdad = ? and holdam = ? and holday = ?";        
        
        ConsultaFeriadosBean fecha = new ConsultaFeriadosBean();
        
        try {
            this.Connect();
            st = this.conn.prepareStatement(query);
            this.st.setString(1, dia);
            this.st.setString(2, mes);
            this.st.setString(3, ano);

            ResultSet rs = this.st.executeQuery();            
            
            while(rs.next()) {            	
                fecha.setDia(rs.getString("holdad"));
                fecha.setMes(rs.getString("holdam"));
                fecha.setAno(rs.getString("holday"));                
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
        return fecha;
    }
    
}
