/**
 * Archivo del Bean para Manejar la Respuesta de la Consulta del Detalle de un Crédito particular
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
 * Clase para manejar la Respuesta al Consultar el Detalle de un Crédito particular
 *
 */
public class EDL098001Response extends WSResponse {
	
	/**
	 * Parámetro para manejar la cabecera del Detalle de un Crédito particular
	 */
	private EDL098001Bean EDL098001;
	
	/**
	 * Parámetro para manejar el Detalle de un Crédito particular
	 */
	private EDL090002Bean[] EDL090002;
	

	public EDL098001Bean getEDL098001() {
		return EDL098001;
	}

	public void setEDL098001(EDL098001Bean eDL098001) {
		EDL098001 = eDL098001;
	}

	public EDL090002Bean[] getEDL090002() {
		return EDL090002;
	}

	public void setEDL090002(EDL090002Bean[] eDL090002) {
		EDL090002 = eDL090002;
	}
}
