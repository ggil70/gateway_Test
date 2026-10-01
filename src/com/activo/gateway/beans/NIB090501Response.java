/**
 * Archivo del Bean para la respuesta de la Validación del BIN de Tarjetas de Crédito
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
 *Clase para manejar la respuesta de la Validación del BIN de Tarjetas de Crédito
 *
 */
public class NIB090501Response  extends WSResponse{
	
	/**
	 * Parámetro para manejar la respuesta de la Validación del BIN de Tarjetas de Crédito
	 */
	private NIB090501Bean NIB090501;

	public NIB090501Bean getNIB090501() {
		return NIB090501;
	}

	public void setNIB090501(NIB090501Bean nIB090501) {
		NIB090501 = nIB090501;
	}

	

}
