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
 *Clase para manejar la respuesta de la Consulta/Pago de Servicios de CANTV
 *
 */
public class IN098401Response extends WSResponse{

	/**
	 * Parámetro para manejar la respuesta de la Consulta/Pago de Servicios de CANTV
	 */
	private IN098401Bean IN098401;
	
	
	/**
	 * Parámetro para manejar los mensajes del Servicio
	 */
	private IMSSGDSJVBean[] IMSSGDSJV;
	

	public IN098401Bean getIN098401() {
		return IN098401;
	}

	public void setIN098401(IN098401Bean iN098401) {
		IN098401 = iN098401;
	}

	public IMSSGDSJVBean[] getIMSSGDSJV() {
		return IMSSGDSJV;
	}

	public void setIMSSGDSJV(IMSSGDSJVBean[] iMSSGDSJV) {
		IMSSGDSJV = iMSSGDSJV;
	}
	

		
}
