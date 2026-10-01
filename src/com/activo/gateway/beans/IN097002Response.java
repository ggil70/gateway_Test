/**
 * Archivo del Bean para manejar la respuesta de los pagos de compromisos del seniat
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
 *Clase para manejar la Respuesta de los pagos de compromisos del seniat
 *
 */
public class IN097002Response extends WSResponse {
	
	private IN097002Bean IN097002;
	
	public IN097002Bean getIN097002() {
		return IN097002;
	}

	public void setIN097002(IN097002Bean iN097002) {
		IN097002 = iN097002;
	}
}
