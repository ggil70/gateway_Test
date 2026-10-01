/**
 * Archivo del Bean para manejar la respuesta al Verificar la existencia de un Usuario en DB
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
 *Clase para manejar la Respuesta al Verificar la existencia de un Usuario en DB
 *
 */
public class VerificarUsuarioResponse extends WSResponse{
	
	/**
	 * Parámetro que indica si existeo no el usuario en la DB
	 */
	private boolean existe;
	
	/**
	 * Parámetro que indica el Estatus de Acceso del Usuario en DB (si existe el usuario)
	 */
	private String estatusAcceso;
	
	/**
	 * Parámetro para el manejo del tipo de documento, creado para Móvil
	 */
	private String tipoDocumento;
	
	/**
	 * Parámetro para el manejo del número de documento, creado para Móvil
	 */
	private String numeroDocumento;
	
	/**
	 * Parámetro para el manejo del tipo rif, usuarios jurídicos, creado para Móvil 
	 */
	private String tipoRif;
	
	/**
	 * Parámetro para el manejo del RIF, usuario jurídicos, creado para Móvil
	 */
	private String rif;
	
	/**
	 * Parámetro que indica el Estatus de la Sesion del Usuario en DB (si el usuario esta conectado por algun canal)
	 */
	private int estatusSesion;
	
	
	
	public String getEstatusAcceso() {
		return estatusAcceso;
	}

	public void setEstatusAcceso(String estatusAcceso) {
		this.estatusAcceso = estatusAcceso;
	}

	public boolean isExiste() {
		return existe;
	}

	public void setExiste(boolean existe) {
		this.existe = existe;
	}

	/**
	 * @return the tipoDocumento
	 */
	public String getTipoDocumento() {
		return tipoDocumento;
	}

	/**
	 * @param tipoDocumento the tipoDocumento to set
	 */
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	/**
	 * @return the numeroDocumento
	 */
	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	/**
	 * @param numeroDocumento the numeroDocumento to set
	 */
	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	/**
	 * @return the tipoRif
	 */
	public String getTipoRif() {
		return tipoRif;
	}

	/**
	 * @param tipoRif the tipoRif to set
	 */
	public void setTipoRif(String tipoRif) {
		this.tipoRif = tipoRif;
	}

	/**
	 * @return the rif
	 */
	public String getRif() {
		return rif;
	}

	/**
	 * @param rif the rif to set
	 */
	public void setRif(String rif) {
		this.rif = rif;
	}

	/**
	 * @return the estatusSesion
	 */
	public int getEstatusSesion() {
		return estatusSesion;
	}

	/**
	 * @param estatusSesion the estatusSesion to set
	 */
	public void setEstatusSesion(int estatusSesion) {
		this.estatusSesion = estatusSesion;
	}

	
}
