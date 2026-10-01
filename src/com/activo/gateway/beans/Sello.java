/**
 * Archivo del Bean para el manejo de los datos de sellos
 * 
 * @author Adverweb <http://www.adverweb.com>
 *
 */


/**
 * Contenedor de clases
 * 
 */
package com.activo.gateway.beans;


/**
 * Clase para el manejo de los datos de sellos
 *
 */
public class Sello {
	
	/**
	 * Identificador del registro del sello
	 * 
	 */
	private int idSello;
	
	/**
	 * Nombre del sello
	 * 
	 */
	private String nombre;
	
	/**
	 * Ruta para obtener la imagen del sello
	 * 
	 */
	private String ruta;

	
	/**
	 * Obtiene el ID del sello
	 * 
	 * @return idSello
	 */
	public int getIdSello() {
		return idSello;
	}

	/**
	 * Asigna el ID del sello
	 * 
	 * @param idSello
	 */
	public void setIdSello(int idSello) {
		this.idSello = idSello;
	}
	

	/**
	 * Obtiene el nombre del sello
	 * 
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Asigna el nombre del sello
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	/**
	 * Obtiene la ruta del sello
	 * 
	 * @return ruta
	 */
	public String getRuta() {
		return ruta;
	}

	/**
	 * Asigna la ruta del sello
	 * 
	 * @param ruta
	 */
	public void setRuta(String ruta) {
		this.ruta = ruta;
	}
	
}
