/**
 * Archivo del Bean para la Solicitud de Chequeras
 * 
 * @author Adverweb <http://www.adverweb.com>
 *
 */


/**
 * Contenedor de clases
 */
package com.activo.gateway.beans;

/**
 * 
 *Clase para manejar la Solicitud de Chequeras
 *
 */
public class INCKBDSJVBean extends ParamsGenerales{

	/**
	 * Parámetro para manejar el Usuario
	 */
	private String DSCKBUSR;
	
	/**
	 * Parámetro para manejar el Número de Cuenta
	 */
	private String DSCKBACC;
	
	/**
	 * Parámetro para manejar el Número de Chequeras a Solicitar
	 */
	private String DSCKBNCK;
	
	/**
	 * Parámetro para manejar la agencia
	 */
	private String DSCKBBRN;
	
	
	
	public String getDSCKBUSR() {
		return DSCKBUSR;
	}
	public void setDSCKBUSR(String dSCKBUSR) {
		DSCKBUSR = dSCKBUSR;
	}
	public String getDSCKBACC() {
		return DSCKBACC;
	}
	public void setDSCKBACC(String dSCKBACC) {
		DSCKBACC = dSCKBACC;
	}
	public String getDSCKBNCK() {
		return DSCKBNCK;
	}
	public void setDSCKBNCK(String dSCKBNCK) {
		DSCKBNCK = dSCKBNCK;
	}
	public String getDSCKBBRN() {
		return DSCKBBRN;
	}
	public void setDSCKBBRN(String dSCKBBRN) {
		DSCKBBRN = dSCKBBRN;
	}
	
}
