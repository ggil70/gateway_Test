/**
 * Archivo del Bean para Consultar los Cheques Suspendidos
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
 * Clase para el Manejo de la Respuesta al Consultar los Cheques Suspendidos
 *
 */
public class EDL890001Response extends WSResponse{

	/**
	 * Parámetro para manejar los Cheques Suspendidos de una Chequera
	 */
	private EDL890001Bean[] EDL890001;
	

	public EDL890001Bean[] getEDL890001() {
		return EDL890001;
	}

	public void setEDL890001(EDL890001Bean[] eDL890001) {
		EDL890001 = eDL890001;
	}

}