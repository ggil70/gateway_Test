/**
 * Archivo del Bean para la respuesta del Cambio de Correo Electrónico
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
 *Clase para manejar la respuesta del Cambio de Correo Electrónico
 *
 */
public class NIBPF3030Response extends WSResponse {
	
	/**
	 * Parámetro para manejar la respuesta del Cambio de Correo Electrónico
	 */
	private NIBPF3030Bean NIBPF3030;

	public NIBPF3030Bean getNIBPF3030() {
		return NIBPF3030;
	}

	public void setNIBPF3030(NIBPF3030Bean nIBPF3030) {
		NIBPF3030 = nIBPF3030;
	}

	
}
