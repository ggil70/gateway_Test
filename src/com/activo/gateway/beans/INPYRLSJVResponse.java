/**
 * Archivo del Bean para Manejar la Respuesta de Consulta/Pago de Nómina/Proveedores
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
 *Clase para manejar la respuesta de Consulta/Pago de Nómina/Proveedores
 *
 */
public class INPYRLSJVResponse extends WSResponse{

	
	/**
	 * Parámetro para manejar la respuesta de Consulta/Pago de Nómina/Proveedores
	 */
	private INPYRLSJVBean[] INPYRLSJV;
	

	public INPYRLSJVBean[] getINPYRLSJV() {
		return INPYRLSJV;
	}

	public void setINPYRLSJV(INPYRLSJVBean[] iNPYRLSJV) {
		INPYRLSJV = iNPYRLSJV;
	}


	
}
