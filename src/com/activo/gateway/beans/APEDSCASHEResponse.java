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
public class APEDSCASHEResponse extends WSResponse{
	
	/**
	 * Parámetro para manejar la información de la Tarjeta prepagada
	 */
	private APEDSCASHEBean APEDSCASHE;

	
	public APEDSCASHEBean getAPEDSCASHE() {
		return APEDSCASHE;
	}

	public void setAPEDSCASHE(APEDSCASHEBean aPEDSCASHE) {
		APEDSCASHE = aPEDSCASHE;
	}

}
