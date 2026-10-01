/**
 * Archivo del Bean para la respuesta de las Preguntas de Autenticación
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
 *Clase para manejar la respuesta de las Preguntas de Autenticación
 *
 */
public class NIBPF3000Response extends WSResponse {
	
	/**
	 * Parámetro para manejar la respuesta de las Preguntas de Autenticación
	 */
	private NIBPF3000Bean[] preguntas;

	public NIBPF3000Bean[] getPreguntas() {
		return preguntas;
	}

	public void setPreguntas(NIBPF3000Bean[] preguntas) {
		this.preguntas = preguntas;
	}

}
