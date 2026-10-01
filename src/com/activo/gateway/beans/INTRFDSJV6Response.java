/**
 * Archivo del Bean para Manejar la Respuesta de Transferencias Internas
 * 
 * @author Emsys
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
public class INTRFDSJV6Response extends WSResponse {

	/**
	 * Parámetro para manejar la respuesta de la Tranferencia Interna
	 */
	private INTRFDSJV6Bean[] INTRFDSJV6;
	
	/**
	 * Parámetro para manejar los mensajes del Servicio
	 */
	private IMSSGDSJVBean[] IMSSGDSJV;

	public INTRFDSJV6Bean[] getINTRFDSJV6() {
		return INTRFDSJV6;
	}

	public void setINTRFDSJV6(INTRFDSJV6Bean[] iNTRFDSJV6) {
		INTRFDSJV6 = iNTRFDSJV6;
	}

	public IMSSGDSJVBean[] getIMSSGDSJV() {
		return IMSSGDSJV;
	}

	public void setIMSSGDSJV(IMSSGDSJVBean[] iMSSGDSJV) {
		IMSSGDSJV = iMSSGDSJV;
	}


	
	
}
