/**
 * Archivo del Bean para la respuesta del Ingreso de Usuarios en el Archivo EUSER
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
 *Clase para manejar la respuesta del Ingreso de Usuarios en el Archivo EUSER
 *
 */
public class NIBPF3020Response extends WSResponse {
	
	/**
	 * Parámetro para manejar la respuesta del Ingreso de Usuarios en el Archivo EUSER
	 */
	private NIBPF3020Bean NIBPF3020;

	public NIBPF3020Bean getNIBPF3020() {
		return NIBPF3020;
	}

	public void setNIBPF3020(NIBPF3020Bean nIBPF3020) {
		NIBPF3020 = nIBPF3020;
	}
}
