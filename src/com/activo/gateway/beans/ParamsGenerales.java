/**
 * Archivo del Bean para el Manejo de Parámetros Generales 
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
 *Clase para manejar Parámetros Generales
 *
 */
public class ParamsGenerales {
	
	/**
	 * Parámetro para manejar el Canal
	 */
	private String canal;

	public String getCanal() {
		return canal;
	}

	public void setCanal(String canal) {
		canal = canal.trim();
		this.canal = (canal.length()==0 ?  "4" : canal);
	}
	
	

}
