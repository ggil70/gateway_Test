/**
 * Archivo del Bean para Validar BIN de Tarjetas de Crédito
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
 *Clase para manejar la Validadción del BIN de tarjetas de Crédito
 *
 */
public class NIB090501Bean extends ParamsGenerales{
	
	/**
	 * Parámetro para manejar el Usuario
	 */
	private String TUSUARIO;
	
	/**
	 * Parámetro para manejar el Número de Tarjeta de Crédito
	 */
	private String TNROTARJ ;
	
	/**
	 * Parámetro para manejar el Número de Cuenta
	 */
	private String TNROCTA;
	
	/**
	 * Parámetro para manejar el Número de RIF
	 */
	private String TCEDRIF;
	
	/**
	 * Parámetro para manejar el Número del Banco
	 */
	private String TBANCO;
	
	/**
	 * Parámetro para manejar la Descripción del Banco, Nombre del Banco
	 */
	private String TDESBANCO;
	
	
	public String getTUSUARIO() {
		return TUSUARIO;
	}
	public void setTUSUARIO(String tUSUARIO) {
		TUSUARIO = tUSUARIO;
	}
	public String getTNROTARJ() {
		return TNROTARJ;
	}
	public void setTNROTARJ(String tNROTARJ) {
		TNROTARJ = tNROTARJ;
	}
	public String getTNROCTA() {
		return TNROCTA;
	}
	public void setTNROCTA(String tNROCTA) {
		TNROCTA = tNROCTA;
	}
	public String getTCEDRIF() {
		return TCEDRIF;
	}
	public void setTCEDRIF(String tCEDRIF) {
		TCEDRIF = tCEDRIF;
	}
	public String getTBANCO() {
		return TBANCO;
	}
	public void setTBANCO(String tBANCO) {
		TBANCO = tBANCO;
	}
	public String getTDESBANCO() {
		return TDESBANCO;
	}
	public void setTDESBANCO(String tDESBANCO) {
		TDESBANCO = tDESBANCO;
	}
	
	

}
