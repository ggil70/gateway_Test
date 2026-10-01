/**
 * Archivo del Bean para manejar la respuesta de la Consulta de Préstamos, Consulta de Movimientos
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
 *Clase para manejar la respuesta de la Consulta de Préstamos, Consulta de Movimientos
 *
 */
public class IN098002Response extends WSResponse{
	
	/**
	 * Parámetro para manejar la Respuesta de la Consulta de Préstamos, Consulta de Movimientos del Préstamo
	 */
	private IN098002Bean[] IN098002;
	

	public IN098002Bean[] getIN098002() {
		return IN098002;
	}

	public void setIN098002(IN098002Bean[] iN098002) {
		IN098002 = iN098002;
	}

}
