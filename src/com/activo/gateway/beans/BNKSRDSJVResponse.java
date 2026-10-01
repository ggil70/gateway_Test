/**
 * Archivo del Bean para manejar el response del Listado de Bancos
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
 * Clase para manejar el response del Listado de Bancos
 *
 */
public class BNKSRDSJVResponse extends WSResponse{
	
	/**
	 * Parámetro para manejar el Listado de Bancos dentro de un arreglo
	 */
	private BNKSRDSJVBean[] BNKSRDSJV;
	
	
	/**
	 * Parámetro para manejar la Descripción Externa de Mensajes dentro de un arreglo
	 */
	private IMSSGDSJVBean[] IMSSGDSJV;
	

	public IMSSGDSJVBean[] getIMSSGDSJV() {
		return IMSSGDSJV;
	}

	public void setIMSSGDSJV(IMSSGDSJVBean[] iMSSGDSJV) {
		IMSSGDSJV = iMSSGDSJV;
	}

	public BNKSRDSJVBean[] getBNKSRDSJV() {
		return BNKSRDSJV;
	}

	public void setBNKSRDSJV(BNKSRDSJVBean[] bNKSRDSJV) {
		BNKSRDSJV = bNKSRDSJV;
	}
	

}
