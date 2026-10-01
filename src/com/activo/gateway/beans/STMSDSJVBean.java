/**
 * Archivo del Bean para el Estado de Cuenta, Búsqueda de Movimientos (Detalle del Movimiento)
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
 *Clase para manejar el Estado de Cuenta, Búsqueda de Movimientos (Detalle del Movimiento)
 *
 */
public class STMSDSJVBean {
	
	/**
	 * Parámetro para manejar el Usuario
	 */
	private String STMUSR;
	
	/**
	 * Parámetro para manejar el Número de Cuenta
	 */
	private String STMACC;
	
	/**
	 * Parámetro para manejar el Código de Transacción 
	 */
	private String STMCDE;
	
	/**
	 * Parámetro para manejar la Descripción del Movimiento
	 */
	private String STMNAR;
	
	/**
	 * Parámetro para manejar la Fecha de la Transacción, Día
	 */
	private String STMBD1;
	
	/**
	 * Parámetro para manejar la Fecha de la Transacción, Mes
	 */
	private String STMBD2;
	
	/**
	 * Parámetro para manejar la Fecha de la Transacción, Año
	 */
	private String STMBD3;
	
	/**
	 * Parámetro para manejar el Número de Referencia
	 */
	private String STMCKN;
	
	/**
	 * Parámetro para manejar el Saldo Inicial
	 */
	private String STMBBL;
	
	/**
	 * Parámetro para manejar el Monto
	 */
	private String STMAMT;
	
	/**
	 * Parámetro para manejar el Tipo de Movimiento, Crédito = Débito = 0
	 */
	private String STMDCC;
	
	/**
	 * Parámetro para manejar el Saldo Final
	 */
	private String STMEBL;
	
	/**
	 * Parámetro para manejar la Secuencia de Registro
	 */
	private String STMREC;
	private String STMMEM;
	private String STMEND;
	private String STMDRR;
	
	/**
	 * Parámetro para manejar la Descripción Adicional del Movimiento
	 */
	private String STMNNAR;
	private String STMNA1;
	private String STMNA2;
	private String STMNA3;
	private String STMNA4;
	private String STMNA5;
	private String STMNA6;
	private String STMNA7;
	private String STMNA8;
	private String STMNA9;
	
	
	public String getSTMUSR() {
		return STMUSR;
	}
	public void setSTMUSR(String sTMUSR) {
		STMUSR = sTMUSR;
	}
	public String getSTMACC() {
		return STMACC;
	}
	public void setSTMACC(String sTMACC) {
		STMACC = sTMACC;
	}
	public String getSTMCDE() {
		return STMCDE;
	}
	public void setSTMCDE(String sTMCDE) {
		STMCDE = sTMCDE;
	}
	public String getSTMNAR() {
		return STMNAR;
	}
	public void setSTMNAR(String sTMNAR) {
		STMNAR = sTMNAR;
	}
	public String getSTMBD1() {
		return STMBD1;
	}
	public void setSTMBD1(String sTMBD1) {
		STMBD1 = sTMBD1;
	}
	public String getSTMBD2() {
		return STMBD2;
	}
	public void setSTMBD2(String sTMBD2) {
		STMBD2 = sTMBD2;
	}
	public String getSTMBD3() {
		return STMBD3;
	}
	public void setSTMBD3(String sTMBD3) {
		STMBD3 = sTMBD3;
	}
	public String getSTMCKN() {
		return STMCKN;
	}
	public void setSTMCKN(String sTMCKN) {
		STMCKN = sTMCKN;
	}
	public String getSTMBBL() {
		return STMBBL;
	}
	public void setSTMBBL(String sTMBBL) {
		STMBBL = sTMBBL;
	}
	public String getSTMAMT() {
		return STMAMT;
	}
	public void setSTMAMT(String sTMAMT) {
		STMAMT = sTMAMT;
	}
	public String getSTMDCC() {
		return STMDCC;
	}
	public void setSTMDCC(String sTMDCC) {
		STMDCC = sTMDCC;
	}
	public String getSTMEBL() {
		return STMEBL;
	}
	public void setSTMEBL(String sTMEBL) {
		STMEBL = sTMEBL;
	}
	public String getSTMREC() {
		return STMREC;
	}
	public void setSTMREC(String sTMREC) {
		STMREC = sTMREC;
	}
	public String getSTMMEM() {
		return STMMEM;
	}
	public void setSTMMEM(String sTMMEM) {
		STMMEM = sTMMEM;
	}
	public String getSTMEND() {
		return STMEND;
	}
	public void setSTMEND(String sTMEND) {
		STMEND = sTMEND;
	}
	public String getSTMDRR() {
		return STMDRR;
	}
	public void setSTMDRR(String sTMDRR) {
		STMDRR = sTMDRR;
	}
	public String getSTMNNAR() {
		return STMNNAR;
	}
	public void setSTMNNAR(String sTMNNAR) {
		STMNNAR = sTMNNAR;
	}
	public String getSTMNA1() {
		return STMNA1;
	}
	public void setSTMNA1(String sTMNA1) {
		STMNA1 = sTMNA1;
	}
	public String getSTMNA2() {
		return STMNA2;
	}
	public void setSTMNA2(String sTMNA2) {
		STMNA2 = sTMNA2;
	}
	public String getSTMNA3() {
		return STMNA3;
	}
	public void setSTMNA3(String sTMNA3) {
		STMNA3 = sTMNA3;
	}
	public String getSTMNA4() {
		return STMNA4;
	}
	public void setSTMNA4(String sTMNA4) {
		STMNA4 = sTMNA4;
	}
	public String getSTMNA5() {
		return STMNA5;
	}
	public void setSTMNA5(String sTMNA5) {
		STMNA5 = sTMNA5;
	}
	public String getSTMNA6() {
		return STMNA6;
	}
	public void setSTMNA6(String sTMNA6) {
		STMNA6 = sTMNA6;
	}
	public String getSTMNA7() {
		return STMNA7;
	}
	public void setSTMNA7(String sTMNA7) {
		STMNA7 = sTMNA7;
	}
	public String getSTMNA8() {
		return STMNA8;
	}
	public void setSTMNA8(String sTMNA8) {
		STMNA8 = sTMNA8;
	}
	public String getSTMNA9() {
		return STMNA9;
	}
	public void setSTMNA9(String sTMNA9) {
		STMNA9 = sTMNA9;
	}
}
