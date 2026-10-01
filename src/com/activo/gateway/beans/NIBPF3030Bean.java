/**
 * Archivo del Bean para el Cambio de Correo Electrónico
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
 *Clase para manejar el Cambio de Correo Electrónico
 *
 */
public class NIBPF3030Bean extends ParamsGenerales{
	
	/**
	 * Parámetro para manejar el Tipo de Identificación del Usuario
	 */
	private String INTNACEM;
	
	/**
	 * Parámetro para manejar el Númeo de Identificación del Usuario
	 */
	private String INTIDEEM;
	
	/**
	 * Parámetro para manejar el e-mail del Usuario
	 */
	private String INTCOREM;
	
	
	public String getINTNACEM() {
		return INTNACEM;
	}
	public void setINTNACEM(String iNTNACEM) {
		INTNACEM = iNTNACEM;
	}
	public String getINTIDEEM() {
		return INTIDEEM;
	}
	public void setINTIDEEM(String iNTIDEEM) {
		INTIDEEM = iNTIDEEM;
	}
	public String getINTCOREM() {
		return INTCOREM;
	}
	public void setINTCOREM(String iNTCOREM) {
		INTCOREM = iNTCOREM;
	}	
}
