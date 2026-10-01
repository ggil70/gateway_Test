/**
 * Archivo del Bean para Verificar las Preguntas de Autenticación
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
 *Clase para manejar la Verificación de las Preguntas de Autenticación
 *
 */
public class VerificarPreguntasAutenticacionBean extends ParamsGenerales{
	
	/**
	 * Parámetro para manejar la Nacionalidad del Usuario
	 */
	private String nacionalidad;
	
	/**
	 * Parámetro para manejar el Número de Identificación del Usuario
	 */
	private String numeroIdentificacion;
	
	/**
	 * Parámetro para manejar las Respuestas de las Preguntas de Autenticación
	 */
	private PreguntasBean[] respuestas;

	
	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getNumeroIdentificacion() {
		return numeroIdentificacion;
	}

	public void setNumeroIdentificacion(String numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}

	public PreguntasBean[] getRespuestas() {
		return respuestas;
	}

	public void setRespuestas(PreguntasBean[] respuestas) {
		this.respuestas = respuestas;
	}
	
}
