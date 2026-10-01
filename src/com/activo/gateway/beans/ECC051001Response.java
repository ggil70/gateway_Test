/**
 * Archivo del Bean para manejar el response de Saldo Activo
 * 
 * @author MGGY
 *
 */


/**
 * Contenedor de clases
 */
package com.activo.gateway.beans;

/**
 * 
 * Clase para manejar el response de Saldo Activo
 *
 */
public class ECC051001Response extends WSResponse{
	
	/**
	 * Parámetro para manejar la información de la Tarjeta de Crédito
	 */
	private ECC051001Bean[] ECC051001;

	
	public ECC051001Bean[] getECC051001() {
		return ECC051001;
	}

	public void setECC051001(ECC051001Bean[] eCC051001) {
		ECC051001 = eCC051001;
	}

}