/**
 * Archivo del Bean para manejar el response del Resumen de Tarjetas de Crédito
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
 * Clase para manejar el response del Resumen de Tarjetas prepagada
 *
 */
public class MCBIOSEPFEResponse extends WSResponse{
	
	/**
	 * Parámetro para manejar la información de la Tarjeta prepagada
	 */
	private MCBIOSEPFEBean MCBIOSEPFE;

	
	public MCBIOSEPFEBean getMCBIOSEPFE() {
		return MCBIOSEPFE;
	}

	public void setMCBIOSEPFE(MCBIOSEPFEBean mCBIOSEPFE) {
		MCBIOSEPFE = mCBIOSEPFE;
	}

}
