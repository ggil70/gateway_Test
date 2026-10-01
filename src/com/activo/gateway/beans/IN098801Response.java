/**
 * Archivo del Bean para manejar la respuesta de la Consulta y Pago Digitel
 * 
 * @author Rosiris Veliz
 *
 */


/**
 * Contenedor de clases
 */
package com.activo.gateway.beans;

/**
 * 
 *Clase para manejar la Respuesta de la Consulta y Pago Digitel
 *
 */

public class IN098801Response extends WSResponse{
	
	private IN098801Bean IN098801;

	private IMSSGDSJVBean[] IMSSGDSJV;

	public IN098801Bean getIN098801() {
		return IN098801;
	}

	public void setIN098801(IN098801Bean iN098801) {
		IN098801 = iN098801;
	}

	public IMSSGDSJVBean[] getIMSSGDSJV() {
		return IMSSGDSJV;
	}

	public void setIMSSGDSJV(IMSSGDSJVBean[] iMSSGDSJV) {
		IMSSGDSJV = iMSSGDSJV;
	}
}
