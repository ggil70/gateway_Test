/**
 * Archivo del Bean para Consulta/Pago de Nómina/Proveedores
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
 *Clase para manejar Transferencias Externas/Pagos de Tarjetas de Crédito Otros Bancos
 *
 */
public class INPYRLSJVBean {

	/**
	 * Parámetro para manejar el Usuario
	 */
	private String PYRUSR;
	
	/**
	 * Parámetro para manejar el Id del Pago (N° de lote, referencia)
	 */
	private String PYRPID;
	
	/**
	 * Parámetro para manejar la Bandera que representa la acción a realizar (00,01,02,04)
	 */
	private String PYROPC;
	
	/**
	 * Parámetro para manejar la Bandera de Fin de Archivo
	 */
	private String PYREOF;
	
	/**
	 * Parámetro para manejar el Estatus de la Transacción
	 */
	private String PYRSTS;
	
	/**
	 * Parámetro para manejar el Tipo de Pago
	 */
	private String PYRTYP;
	
	/**
	 * Parámetro para manejar la Bandera del Pago
	 */
	private String PYRFLG;
	
	/**
	 * Parámetro para manejar el Número de la Cuenta Dédito de la Transacción
	 */
	private String PYRACC;
	
	/**
	 * Parámetro para manejar el Monto de la Transacción
	 */
	private String PYRAMT;
	
	/**
	 * Parámetro para manejar el Número de Pagos
	 */
	private String PYRNUM;
	
	/**
	 * Parámetro para manejar la Fecha de la Operación, Día
	 */
	private String PYRVDD;
	
	/**
	 * Parámetro para manejar la Fecha de la Operación, Mes
	 */
	private String PYRVDM;
	
	/**
	 * Parámetro para manejar la Fecha de la Operación, Año
	 */
	private String PYRVDY;
	
	/**
	 * Parámetro para manejar la Descripción
	 */
	private String PYRERD;
	
	/**
	 * Parámetro para manejar el Nombre del Beneficiario
	 */
	private String PYRBNAM;
	
	/**
	 * Parámetro para manejar la Dirección
	 */
	private String PYRBAD1;
	
	/**
	 * Parámetro para manejar la Dirección
	 */
	private String PYRBAD2;
	
	/**
	 * Parámetro para manejar la Dirección
	 */
	private String PYRBAD3;
	
	/**
	 * Parámetro para manejar la Descripción de la Transacción
	 */
	private String PYRMEM1;
	
	/**
	 * Parámetro para manejar la Descripción
	 */
	private String PYRMEM2;
	
	/**
	 * Parámetro para manejar el Tipo de Pago
	 */
	private String PYRPTYP;
	
	/**
	 * Parámetro para manejar el Número de Cuenta del Beneficiario
	 */
	private String PYRBACC;
	
	/**
	 * Parámetro para manejar el Nombre del Banco Beneficiario
	 */
	private String PYRBBNK;
	
	/**
	 * Parámetro para manejar el Nombre del Banco del Beneficiario
	 */
	private String PYRBBKN;
	private String PYRBBKAD;
	
	/**
	 * Parámetro para manejar
	 */
	private String PYRBBKA2;
	private String PYRIBKID;
	
	/**
	 * Parámetro para manejar el Nombre del Banco Intermediario
	 */
	private String PYRIBKNM;
	
	/**
	 * Parámetro para manejar la Dirección del Banco Intermediario
	 */
	private String PYRIBKAD;
	
	/**
	 * Parámetro para manejar la Dirección del Banco Intermediario
	 */
	private String PYRIBKA2;
	
	/**
	 * Parámetro para manejar la Moneda
	 */
	private String PYRCCY;


	public String getPYRUSR() {
		return PYRUSR;
	}
	public void setPYRUSR(String pYRUSR) {
		PYRUSR = pYRUSR;
	}
	public String getPYRPID() {
		return PYRPID;
	}
	public void setPYRPID(String pYRPID) {
		PYRPID = pYRPID;
	}
	public String getPYROPC() {
		return PYROPC;
	}
	public void setPYROPC(String pYROPC) {
		PYROPC = pYROPC;
	}
	public String getPYREOF() {
		return PYREOF;
	}
	public void setPYREOF(String pYREOF) {
		PYREOF = pYREOF;
	}
	public String getPYRSTS() {
		return PYRSTS;
	}
	public void setPYRSTS(String pYRSTS) {
		PYRSTS = pYRSTS;
	}
	public String getPYRTYP() {
		return PYRTYP;
	}
	public void setPYRTYP(String pYRTYP) {
		PYRTYP = pYRTYP;
	}
	public String getPYRFLG() {
		return PYRFLG;
	}
	public void setPYRFLG(String pYRFLG) {
		PYRFLG = pYRFLG;
	}
	public String getPYRACC() {
		return PYRACC;
	}
	public void setPYRACC(String pYRACC) {
		PYRACC = pYRACC;
	}
	public String getPYRAMT() {
		return PYRAMT;
	}
	public void setPYRAMT(String pYRAMT) {
		PYRAMT = pYRAMT;
	}
	public String getPYRNUM() {
		return PYRNUM;
	}
	public void setPYRNUM(String pYRNUM) {
		PYRNUM = pYRNUM;
	}
	public String getPYRVDD() {
		return PYRVDD;
	}
	public void setPYRVDD(String pYRVDD) {
		PYRVDD = pYRVDD;
	}
	public String getPYRVDM() {
		return PYRVDM;
	}
	public void setPYRVDM(String pYRVDM) {
		PYRVDM = pYRVDM;
	}
	public String getPYRVDY() {
		return PYRVDY;
	}
	public void setPYRVDY(String pYRVDY) {
		PYRVDY = pYRVDY;
	}
	public String getPYRERD() {
		return PYRERD;
	}
	public void setPYRERD(String pYRERD) {
		PYRERD = pYRERD;
	}
	public String getPYRBNAM() {
		return PYRBNAM;
	}
	public void setPYRBNAM(String pYRBNAM) {
		PYRBNAM = pYRBNAM;
	}
	public String getPYRBAD1() {
		return PYRBAD1;
	}
	public void setPYRBAD1(String pYRBAD1) {
		PYRBAD1 = pYRBAD1;
	}
	public String getPYRBAD2() {
		return PYRBAD2;
	}
	public void setPYRBAD2(String pYRBAD2) {
		PYRBAD2 = pYRBAD2;
	}
	public String getPYRBAD3() {
		return PYRBAD3;
	}
	public void setPYRBAD3(String pYRBAD3) {
		PYRBAD3 = pYRBAD3;
	}
	public String getPYRMEM1() {
		return PYRMEM1;
	}
	public void setPYRMEM1(String pYRMEM1) {
		PYRMEM1 = pYRMEM1;
	}
	public String getPYRMEM2() {
		return PYRMEM2;
	}
	public void setPYRMEM2(String pYRMEM2) {
		PYRMEM2 = pYRMEM2;
	}
	public String getPYRPTYP() {
		return PYRPTYP;
	}
	public void setPYRPTYP(String pYRPTYP) {
		PYRPTYP = pYRPTYP;
	}
	public String getPYRBACC() {
		return PYRBACC;
	}
	public void setPYRBACC(String pYRBACC) {
		PYRBACC = pYRBACC;
	}
	public String getPYRBBNK() {
		return PYRBBNK;
	}
	public void setPYRBBNK(String pYRBBNK) {
		PYRBBNK = pYRBBNK;
	}
	public String getPYRBBKN() {
		return PYRBBKN;
	}
	public void setPYRBBKN(String pYRBBKN) {
		PYRBBKN = pYRBBKN;
	}
	public String getPYRBBKAD() {
		return PYRBBKAD;
	}
	public void setPYRBBKAD(String pYRBBKAD) {
		PYRBBKAD = pYRBBKAD;
	}
	public String getPYRBBKA2() {
		return PYRBBKA2;
	}
	public void setPYRBBKA2(String pYRBBKA2) {
		PYRBBKA2 = pYRBBKA2;
	}
	public String getPYRIBKID() {
		return PYRIBKID;
	}
	public void setPYRIBKID(String pYRIBKID) {
		PYRIBKID = pYRIBKID;
	}
	public String getPYRIBKNM() {
		return PYRIBKNM;
	}
	public void setPYRIBKNM(String pYRIBKNM) {
		PYRIBKNM = pYRIBKNM;
	}
	public String getPYRIBKAD() {
		return PYRIBKAD;
	}
	public void setPYRIBKAD(String pYRIBKAD) {
		PYRIBKAD = pYRIBKAD;
	}
	public String getPYRIBKA2() {
		return PYRIBKA2;
	}
	public void setPYRIBKA2(String pYRIBKA2) {
		PYRIBKA2 = pYRIBKA2;
	}
	public String getPYRCCY() {
		return PYRCCY;
	}
	public void setPYRCCY(String pYRCCY) {
		PYRCCY = pYRCCY;
	}

}