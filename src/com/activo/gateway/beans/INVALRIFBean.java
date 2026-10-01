/**
 * Archivo del Bean para Validar un Número de RIF
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
 *Clase para manejar la Validación de un Número de RIF
 *
 */
public class INVALRIFBean extends ParamsGenerales{

	/**
	 * Parámetro para manejar el tipo de RIF
	 */
	private String RSTATUS;  
	
	/**
	 * Parámetro para manejar el Número de RIF
	 */
	private String RNRORIF;  
	
	/**
	 * Parámetro para manejar el Dígito Verificador del Número de RIf
	 */
	private String RDIGITO; 
	
	/**
	 * Parámetro para manejar el Usuario
	 */
	private String XUSUARIO; 
	
	/**
	 * Parámetro para manejar el Número de Tarjeta del Usuario
	 */
	private String XNROTARJ; 
	
	/**
	 * Parámetro para manejar el Número de Cuenta del Usuario
	 */
	private String XNROCTA;
	
	
	
	public String getRSTATUS() {
		return RSTATUS;
	}
	public void setRSTATUS(String rSTATUS) {
		RSTATUS = rSTATUS;
	}
	public String getRNRORIF() {
		return RNRORIF;
	}
	public void setRNRORIF(String rNRORIF) {
		RNRORIF = rNRORIF;
	}
	public String getRDIGITO() {
		return RDIGITO;
	}
	public void setRDIGITO(String rDIGITO) {
		RDIGITO = rDIGITO;
	}
	public String getXUSUARIO() {
		return XUSUARIO;
	}
	public void setXUSUARIO(String xUSUARIO) {
		XUSUARIO = xUSUARIO;
	}
	public String getXNROTARJ() {
		return XNROTARJ;
	}
	public void setXNROTARJ(String xNROTARJ) {
		XNROTARJ = xNROTARJ;
	}
	public String getXNROCTA() {
		return XNROCTA;
	}
	public void setXNROCTA(String xNROCTA) {
		XNROCTA = xNROCTA;
	}
	
}
