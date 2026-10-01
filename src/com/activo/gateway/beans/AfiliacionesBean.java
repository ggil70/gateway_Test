/**
 * Archivo del Bean para la solicitud de las afiliaciones
 * 
 * @author Adverweb <http://www.adverweb.com>
 *
 */


/**
 * Contenedor de clases
 * 
 */package com.activo.gateway.beans;

 
 /**
  * Clase para el manejo de la solicitud de las afiliaciones del usuario
  * 
  */
public class AfiliacionesBean extends ParamsGenerales{
	
	/**
	 * Identificador del usuario
	 */
	private String id_usuario;
	
	/**
	 * Tipo de afiliacion
	 */
	private String tipo_afiliacion;
	
	/**
	 * Tipo de operaciones.
	 */
	private String tipo_operacion;
	
	/**
	 * Numero de Producto
	 */
	private String numero_producto;
	
	
	
	/**
	 * Obtiene el ID del usuario
	 * @return id_usuario
	 */
	public String getId_usuario() {
		return id_usuario;
	}
	
	/**
	 * Asigna el ID del usuario
	 * @param id_usuario
	 */
	public void setId_usuario(String id_usuario) {
		this.id_usuario = id_usuario;
	}
	
	/**
	 * Obtiene el tipo de afiliacion
	 * @return tipo_afiliacion
	 */
	public String getTipo_afiliacion() {
		return tipo_afiliacion;
	}
	
	/**
	 * Asigna el tipo de afiliacion
	 * @param tipo_afiliacion
	 */
	public void setTipo_afiliacion(String tipo_afiliacion) {
		this.tipo_afiliacion = tipo_afiliacion;
	}
	
	/**
	 * Obtiene el tipo de operacion
	 * @return tipo_operacion
	 */
	public String getTipo_operacion() {
		return tipo_operacion;
	}
	
	/**
	 * Asigna el tipo de operacion
	 * @param tipo_operacion
	 */
	public void setTipo_operacion(String tipo_operacion) {
		this.tipo_operacion = tipo_operacion;
	}

	/**
	 * @return the numero_producto
	 */
	public String getNumero_producto() {
		return numero_producto;
	}

	/**
	 * @param numero_producto the numero_producto to set
	 */
	public void setNumero_producto(String numero_producto) {
		this.numero_producto = numero_producto;
	}
	

}
