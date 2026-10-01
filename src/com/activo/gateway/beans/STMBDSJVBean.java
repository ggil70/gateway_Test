/**
 * Archivo del Bean para el Estado de Cuenta, Búsqueda de Movimientos (Encabezado de la Respuesta)
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
 *Clase para manejar el Estado de Cuenta, Búsqueda de Movimientos
 *
 */
public class STMBDSJVBean {
	
	/**
	 * Parámetro para manejar el Usuario
	 */
	private String STBUSR;
	
	/**
	 * Parámetro para manejar el Número de Cuenta
	 */
	private String STBACC;
	
	/**
	 * Parámetro para manejar el Número de Cliente
	 */
	private String STBCUN;
	
	/**
	 * Parámetro para manejar el Nombre del Cliente
	 */
	private String STBNA1;
	
	/**
	 * Parámetro para manejar la Moneda
	 */
	private String STBCCY;
	private String STBATY;
	
	/**
	 * Parámetro para manejar la Descripción del Producto
	 */
	private String STBPRO;
	private String STBOFC;
	private String STBMGB;
	
	/**
	 * Parámetro para manejar el Saldo Diferido
	 */
	private String STBUNC;
	
	/**
	 * Parámetro para manejar el Saldo Neto
	 */
	private String STBMNB;
	
	/**
	 * Parámetro para manejar el Monto Retenido
	 */
	private String STBHOL;
	
	/**
	 * Parámetro para manejar el Saldo Disponible
	 */
	private String STBAVL;
	private String STBGAV;
	private String STBNAV;
	private String STBCLI;
	private String STBOIA;
	private String STBIAC;
	
	/**
	 * Parámetro para manejar la Fecha, Día
	 */
	private String STBTM1;
	
	/**
	 * Parámetro para manejar la Fecha, Mes
	 */
	private String STBTM2;
	
	/**
	 * Parámetro para manejar la Fecha, Año
	 */
	private String STBTM3;
	
	/**
	 * Parámetro para manejar la Dirección Postal del Cliente
	 */
	private String STBMA1;
	
	/**
	 * Parámetro para manejar la Dirección Postal del Cliente
	 */
	private String STBMA2;
	
	/**
	 * Parámetro para manejar la Dirección Postal del Cliente
	 */
	private String STBMA3;
	
	/**
	 * Parámetro para manejar la Dirección Postal del Cliente
	 */
	private String STBMA4;
	
	/**
	 * Parámetro para manejar la Ciudad de Residencia del Cliente
	 */
	private String STBCTY;
	
	/**
	 * Parámetro para manejar el Pais de Residencia del Cliente
	 */
	private String STBCTR;
	private String STBSTE;
	
	/**
	 * Parámetro para manejar la Zona Postal
	 */
	private String STBZPC;
	private String STBPOB;
	
	/**
	 * Parámetro para manejar la Dirección de Correo electrónico del Cliente
	 */
	private String STBIAD;
	private String STBFAX;
	private String STBMLC;
	private String STBNX1;
	private String STBNX2;
	private String STBNX3;
	private String STBLP1;
	private String STBLP2;
	private String STBLP3;
	private String STBMIP;
	private String STBLSP;
	
	public String getSTBUSR() {
		return STBUSR;
	}
	public void setSTBUSR(String sTBUSR) {
		STBUSR = sTBUSR;
	}
	public String getSTBACC() {
		return STBACC;
	}
	public void setSTBACC(String sTBACC) {
		STBACC = sTBACC;
	}
	public String getSTBCUN() {
		return STBCUN;
	}
	public void setSTBCUN(String sTBCUN) {
		STBCUN = sTBCUN;
	}
	public String getSTBNA1() {
		return STBNA1;
	}
	public void setSTBNA1(String sTBNA1) {
		STBNA1 = sTBNA1;
	}
	public String getSTBCCY() {
		return STBCCY;
	}
	public void setSTBCCY(String sTBCCY) {
		STBCCY = sTBCCY;
	}
	public String getSTBATY() {
		return STBATY;
	}
	public void setSTBATY(String sTBATY) {
		STBATY = sTBATY;
	}
	public String getSTBPRO() {
		return STBPRO;
	}
	public void setSTBPRO(String sTBPRO) {
		STBPRO = sTBPRO;
	}
	public String getSTBOFC() {
		return STBOFC;
	}
	public void setSTBOFC(String sTBOFC) {
		STBOFC = sTBOFC;
	}
	public String getSTBMGB() {
		return STBMGB;
	}
	public void setSTBMGB(String sTBMGB) {
		STBMGB = sTBMGB;
	}
	public String getSTBUNC() {
		return STBUNC;
	}
	public void setSTBUNC(String sTBUNC) {
		STBUNC = sTBUNC;
	}
	public String getSTBMNB() {
		return STBMNB;
	}
	public void setSTBMNB(String sTBMNB) {
		STBMNB = sTBMNB;
	}
	public String getSTBHOL() {
		return STBHOL;
	}
	public void setSTBHOL(String sTBHOL) {
		STBHOL = sTBHOL;
	}
	public String getSTBAVL() {
		return STBAVL;
	}
	public void setSTBAVL(String sTBAVL) {
		STBAVL = sTBAVL;
	}
	public String getSTBGAV() {
		return STBGAV;
	}
	public void setSTBGAV(String sTBGAV) {
		STBGAV = sTBGAV;
	}
	public String getSTBNAV() {
		return STBNAV;
	}
	public void setSTBNAV(String sTBNAV) {
		STBNAV = sTBNAV;
	}
	public String getSTBCLI() {
		return STBCLI;
	}
	public void setSTBCLI(String sTBCLI) {
		STBCLI = sTBCLI;
	}
	public String getSTBOIA() {
		return STBOIA;
	}
	public void setSTBOIA(String sTBOIA) {
		STBOIA = sTBOIA;
	}
	public String getSTBIAC() {
		return STBIAC;
	}
	public void setSTBIAC(String sTBIAC) {
		STBIAC = sTBIAC;
	}
	public String getSTBTM1() {
		return STBTM1;
	}
	public void setSTBTM1(String sTBTM1) {
		STBTM1 = sTBTM1;
	}
	public String getSTBTM2() {
		return STBTM2;
	}
	public void setSTBTM2(String sTBTM2) {
		STBTM2 = sTBTM2;
	}
	public String getSTBTM3() {
		return STBTM3;
	}
	public void setSTBTM3(String sTBTM3) {
		STBTM3 = sTBTM3;
	}
	public String getSTBMA1() {
		return STBMA1;
	}
	public void setSTBMA1(String sTBMA1) {
		STBMA1 = sTBMA1;
	}
	public String getSTBMA2() {
		return STBMA2;
	}
	public void setSTBMA2(String sTBMA2) {
		STBMA2 = sTBMA2;
	}
	public String getSTBMA3() {
		return STBMA3;
	}
	public void setSTBMA3(String sTBMA3) {
		STBMA3 = sTBMA3;
	}
	public String getSTBMA4() {
		return STBMA4;
	}
	public void setSTBMA4(String sTBMA4) {
		STBMA4 = sTBMA4;
	}
	public String getSTBCTY() {
		return STBCTY;
	}
	public void setSTBCTY(String sTBCTY) {
		STBCTY = sTBCTY;
	}
	public String getSTBCTR() {
		return STBCTR;
	}
	public void setSTBCTR(String sTBCTR) {
		STBCTR = sTBCTR;
	}
	public String getSTBSTE() {
		return STBSTE;
	}
	public void setSTBSTE(String sTBSTE) {
		STBSTE = sTBSTE;
	}
	public String getSTBZPC() {
		return STBZPC;
	}
	public void setSTBZPC(String sTBZPC) {
		STBZPC = sTBZPC;
	}
	public String getSTBPOB() {
		return STBPOB;
	}
	public void setSTBPOB(String sTBPOB) {
		STBPOB = sTBPOB;
	}
	public String getSTBIAD() {
		return STBIAD;
	}
	public void setSTBIAD(String sTBIAD) {
		STBIAD = sTBIAD;
	}
	public String getSTBFAX() {
		return STBFAX;
	}
	public void setSTBFAX(String sTBFAX) {
		STBFAX = sTBFAX;
	}
	public String getSTBMLC() {
		return STBMLC;
	}
	public void setSTBMLC(String sTBMLC) {
		STBMLC = sTBMLC;
	}
	public String getSTBNX1() {
		return STBNX1;
	}
	public void setSTBNX1(String sTBNX1) {
		STBNX1 = sTBNX1;
	}
	public String getSTBNX2() {
		return STBNX2;
	}
	public void setSTBNX2(String sTBNX2) {
		STBNX2 = sTBNX2;
	}
	public String getSTBNX3() {
		return STBNX3;
	}
	public void setSTBNX3(String sTBNX3) {
		STBNX3 = sTBNX3;
	}
	public String getSTBLP1() {
		return STBLP1;
	}
	public void setSTBLP1(String sTBLP1) {
		STBLP1 = sTBLP1;
	}
	public String getSTBLP2() {
		return STBLP2;
	}
	public void setSTBLP2(String sTBLP2) {
		STBLP2 = sTBLP2;
	}
	public String getSTBLP3() {
		return STBLP3;
	}
	public void setSTBLP3(String sTBLP3) {
		STBLP3 = sTBLP3;
	}
	public String getSTBMIP() {
		return STBMIP;
	}
	public void setSTBMIP(String sTBMIP) {
		STBMIP = sTBMIP;
	}
	public String getSTBLSP() {
		return STBLSP;
	}
	public void setSTBLSP(String sTBLSP) {
		STBLSP = sTBLSP;
	}

}
