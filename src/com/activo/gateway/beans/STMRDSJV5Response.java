/**
 * Archivo del Bean para el Estado de Cuenta, Búsqueda de Movimientos, Archivo Maestro
 * 
 * @author EMSYS
 *
 */


/**
 * Contenedor de clases
 */
package com.activo.gateway.beans;

/**
 * 
 *Clase para manejar el Estado de Cuenta, Búsqueda de Movimientos, Archivo Maestro P2P
 *
 */
public class STMRDSJV5Response extends WSResponse {
	
		
	/**
	 * Parámetro para manejar la Respuesta del Detalle del Movimiento en la Consulta de Estados de Cuenta
	 */
	private STMSDSJVBean[] STMSDSJV5;

        public STMSDSJVBean[] getSTMSDSJV5() {
            return STMSDSJV5;
        }

        public void setSTMSDSJV5(STMSDSJVBean[] STMSDSJV5) {
            this.STMSDSJV5 = STMSDSJV5;
        }	
	
}
