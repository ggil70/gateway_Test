/**
 * Archivo del Bean para utilizado para Verificar si un Usuario Existe en DB 
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
 *Clase para manejar la Verificación de la existencia de un Usuario en DB
 *
 */
public class VerificarUsuarioBean extends ParamsGenerales {

	/**
	 * Parámetro para manejar el Tipo de Documento de Identificación del Usuario
	 */
	private String tipoDocumento;
	
	/**
	 * Parámetro para manejar el Número de Documento de Identificación del Usuario
	 */
	private String numeroDocumento;

	/**
	 * Parámetro ara manejar el Login del Usuario cuando se inicia sesión desde Móvil
	 */
	private String login;

		
	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}
	
}
