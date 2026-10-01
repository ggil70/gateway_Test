/**
 * Archivo del Bean para la respuesta de la Consulta de Cash
 * 
 * @author emsys <http://www.emsys-solutions.com>
 *
 */


/**
 * Contenedor de clases
 */
package com.activo.gateway.beans;

/**
 * 
 *Clase para manejar la respuesta de la Consulta Cash
 *
 */
public class IBPINFDATResponse extends WSResponse {
	
	/**
	 * Parámetro para manejar la respuesta de la Consulta Cash
	 */
	private IBPINFDATBean IBPINFDAT;

	public IBPINFDATBean getIBPINFDAT() {
		return IBPINFDAT;
	}

	public void setIBPINFDAT(IBPINFDATBean iBPINFDAT) {
		IBPINFDAT = iBPINFDAT;
	}
}
