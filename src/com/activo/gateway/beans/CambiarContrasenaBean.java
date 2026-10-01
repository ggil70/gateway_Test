/**
 * Archivo del Bean para la Creación y Cambio de Contraseña
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
 *Clase para manejar la Creación y Cambio de Contraseña
 *
 */
public class CambiarContrasenaBean extends ParamsGenerales {
	
	/**
	 * Parámetro para manejar el Tipo de Documento de Identificación del Usuario
	 */
	private String tipoCedula;
	
	/**
	 * Parámetro para manejar el Número de Identificación del Usuario
	 */
	private String cedula;
	
	/**
	 * Parámetro para manejar la Contraseña del Usuario
	 */
	private String contrasena;
	
	/**
	 * Parámetro para manejar los Días de Expiración de la Contraseña
	 */
	private Integer diasExpiracion;
	
	/**
	 * Parámetro que indica si la fue o no confirmada la contraseña
	 */
	private boolean confirmada;

	public boolean isConfirmada() {
		return confirmada;
	}

	public void setConfirmada(boolean confirmada) {
		this.confirmada = confirmada;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public Integer getDiasExpiracion() {
		return diasExpiracion;
	}

	public void setDiasExpiracion(Integer diasExpiracion) {
		this.diasExpiracion = diasExpiracion;
	}

	public String getTipoCedula() {
		return tipoCedula;
	}

	public void setTipoCedula(String tipoCedula) {
		this.tipoCedula = tipoCedula;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
}
