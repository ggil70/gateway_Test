/**
 * Archivo del Bean para el Estado de Cuenta, Búsqueda de Movimientos, Archivo Maestro
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
 *Clase para manejar el Estado de Cuenta, Búsqueda de Movimientos, Archivo Maestro
 *
 */
public class STMRDSJVResponse extends WSResponse {
	
	/**
	 * Parámetro para manejar el Encabezado de la Respuesta en la Consulta de Estados de Cuenta
	 */
	private STMBDSJVBean STMBDSJV;
	
	/**
	 * Parámetro para manejar la Respuesta del Detalle del Movimiento en la Consulta de Estados de Cuenta
	 */
	private STMSDSJVBean[] STMSDSJV;

	public STMSDSJVBean[] getSTMSDSJV() {
		return STMSDSJV;
	}

	public void setSTMSDSJV(STMSDSJVBean[] sTMSDSJV) {
		STMSDSJV = sTMSDSJV;
	}

	public STMBDSJVBean getSTMBDSJV() {
		return STMBDSJV;
	}

	public void setSTMBDSJV(STMBDSJVBean sTMBDSJV) {
		STMBDSJV = sTMBDSJV;
	}
}
