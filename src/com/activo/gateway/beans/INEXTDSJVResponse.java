/**
 * Archivo del Bean para Manejar la Respuesta de Transferencias Externas/Pagos de Tarjetas de Crédito Otros Bancos
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
 *Clase para manejar la respuesta de Transferencias Externas/Pagos de Tarjetas de Crédito Otros Bancos
 *
 */
public class INEXTDSJVResponse extends WSResponse {

	/**
	 * Parámetro para manejar la respuesta de la Tranferencia Externa/Pago de Tarjetas de Crédito
	 */
	private INEXTDSJVBean[] INEXTDSJV;
	
	/**
	 * Parámetro para manejar los mensajes del Servicio
	 */
	private IMSSGDSJVBean[] IMSSGDSJV;

	public INEXTDSJVBean[] getINEXTDSJV() {
		return INEXTDSJV;
	}

	public void setINEXTDSJV(INEXTDSJVBean[] iNEXTDSJV) {
		INEXTDSJV = iNEXTDSJV;
	}

	public IMSSGDSJVBean[] getIMSSGDSJV() {
		return IMSSGDSJV;
	}

	public void setIMSSGDSJV(IMSSGDSJVBean[] iMSSGDSJV) {
		IMSSGDSJV = iMSSGDSJV;
	}

	
	
}
