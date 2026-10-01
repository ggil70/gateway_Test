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
 * Clase para manejar el response del Resumen de Tarjetas de Crédito
 *
 */
public class CARDSJVResponse extends WSResponse{
	
	/**
	 * Parámetro para manejar la información de la Tarjeta de Crédito
	 */
	private CARDSJVBean CARDSJV;

	
	public CARDSJVBean getCARDSJV() {
		return CARDSJV;
	}

	public void setCARDSJV(CARDSJVBean cARDSJV) {
		CARDSJV = cARDSJV;
	}

}
