/**
 * Archivo del Bean para Manejar la Respuesta del Pago de las Tarjetas de Crédito Propias/Terceros
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
 * Clase para manejar la Respuesta del Pago de las Tarjetas de Crédito Propias/Terceros
 *
 */
public class IN098102Response extends WSResponse{
	
	/**
	 * Parámetro para manejar la información del Pago de las Tarjetas de Crédito Propias/Terceros 
	 */
	private IN098102Bean[] IN098102;
	
	/**
	 * Parámetro para manejar los mensajes en los Pagos de las Tarjetas de Crédito Propias/Terceros 
	 */	
	private IMSSGDSJVBean[] IMSSGDSJV;

	public IMSSGDSJVBean[] getIMSSGDSJV() {
		return IMSSGDSJV;
	}

	public void setIMSSGDSJV(IMSSGDSJVBean[] iMSSGDSJV) {
		IMSSGDSJV = iMSSGDSJV;
	}

	public IN098102Bean[] getIN098102() {
		return IN098102;
	}

	public void setIN098102(IN098102Bean[] iN098102) {
		IN098102 = iN098102;
	}

}
