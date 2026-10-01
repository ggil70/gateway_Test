/**
 * Contenedor de clases
 */
package com.activo.gateway.beans;

/**
 * 
 * Clase para manejar el response del SAREN
 *
 */
public class IN800101Response extends WSResponse{
	
	/**
	 * Parámetro para manejar la información de SAREN
	 */
	private IN800101Bean IN800101;

	
	public IN800101Bean getIN800101() {
		return IN800101;
	}

	public void setIN800101(IN800101Bean iN800101) {
		IN800101 = iN800101;
	}

}
