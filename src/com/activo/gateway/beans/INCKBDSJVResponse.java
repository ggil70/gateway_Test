/**
 * Archivo del Bean para manejar la respuesta de la Solicitud de Chequeras
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
 *Clase para manejar la respuesta de la Solicitud de Chequeras
 *
 */
public class INCKBDSJVResponse extends WSResponse{

	/**
	 * Parámetro para manejar la Respuesta de la Solicitud de Chequeras
	 */
	private INCKBDSJVBean[] INCKBDSJV;

	
	/**
	 * Parámetro para manejar los mensajes arrojados por el servicio
	 */
	private IMSSGDSJVBean[] IMSSGDSJV;

	public INCKBDSJVBean[] getINCKBDSJV() {
		return INCKBDSJV;
	}

	public void setINCKBDSJV(INCKBDSJVBean[] iNCKBDSJV) {
		INCKBDSJV = iNCKBDSJV;
	}

	public IMSSGDSJVBean[] getIMSSGDSJV() {
		return IMSSGDSJV;
	}

	public void setIMSSGDSJV(IMSSGDSJVBean[] iMSSGDSJV) {
		IMSSGDSJV = iMSSGDSJV;
	}
	
}
