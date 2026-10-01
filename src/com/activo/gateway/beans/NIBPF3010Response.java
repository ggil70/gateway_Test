/**
 * Archivo del Bean para la respuesta de la COnsulta de Datos Básicos
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
 *Clase para manejar la respuesta de la Consulta de Datos Básicos
 *
 */
public class NIBPF3010Response extends WSResponse {
	
	/**
	 * Parámetro para manejar la respuesta de la Consulta de Datos Básicos
	 */
	private NIBPF3010Bean NIBPF3010;

	public NIBPF3010Bean getNIBPF3010() {
		return NIBPF3010;
	}

	public void setNIBPF3010(NIBPF3010Bean nIBPF3010) {
		NIBPF3010 = nIBPF3010;
	}
}
