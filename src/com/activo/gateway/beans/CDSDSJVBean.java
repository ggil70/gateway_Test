/**
 * Archivo del Bean para manejar el request del Resumen de Inversiones o Depósitos a Plazo
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
 *Clase para manejar los parámetros de entrada del Resumen de Inversiones o Depósitos a Plazo  
 *
 */
public class CDSDSJVBean extends ParamsGenerales{
	
	/**
	 * Parámetro para manejar el usuario
	 */
	private String CDSUSER;
	
	/**
	 * Parámetro para manejar el Número de Inversión o Depósito
	 */
	private String CDSDEAACC;
	
	/**
	 * Parámetro para manejar la Moneda
	 */
	private String CDSDEACCY;
	
	/**
	 * Parámetro para manejar el Monto de la Inversión
	 */
	private String CDSDEAMEP;
	
	/**
	 * Parámetro para manejar los Intereses Pagados
	 */
	private String CDSDEAIPY;
	
	/**
	 * Parámetro para manejar los Intereses
	 */
	private String CDSINTMAT;
	
	/**
	 * Parámetro para manejar la Fecha de Vencimiento, Día
	 */
	private String CDSMATDTE1;
	
	/**
	 * Parámetro para manejar la Fecha de Vencimiento, Mes
	 */
	private String CDSMATDTE2;
	
	/**
	 * Parámetro para manejar la Fecha de Vencimiento, Año
	 */
	private String CDSMATDTE3;
	
	/**
	 * Parámetro para manejar la Tasa de Interés 
	 */
	private String CDSDEARTE;
	
	/**
	 * Parámetro para manejar los Intereses Pagados el Año Padado
	 */
	private String CDSLSYIPD;
	
	/**
	 * Parámetro para manejar el Nombre de la Inversión o Alias
	 */
	private String CDSPRDNME;
	
	/**
	 * Parámetro para manejar el Estatus de la Inversión
	 */
	private String CDSSTATUS;
	
	/**
	 * Parámetro para manejar la Fecha de Apertura de la Inversión, Día
	 */
	private String CDSOPEDAT1;
	
	/**
	 * Parámetro para manejar la Fceha de la Apertura de la Inversión, Mes
	 */
	private String CDSOPEDAT2;
	
	/**
	 * Parámetro para manejar la Fecha de la Apertura de la Iversión, Año
	 */
	private String CDSOPEDAT3;
	
	/**
	 * Parámetro para manejar el Plazo de la Inversión
	 */
	private String CDSTERLOAN;
	
	
	
	public String getCDSSTATUS() {
		return CDSSTATUS;
	}
	public void setCDSSTATUS(String cDSSTATUS) {
		CDSSTATUS = cDSSTATUS;
	}
	public String getCDSOPEDAT1() {
		return CDSOPEDAT1;
	}
	public void setCDSOPEDAT1(String cDSOPEDAT1) {
		CDSOPEDAT1 = cDSOPEDAT1;
	}
	public String getCDSOPEDAT2() {
		return CDSOPEDAT2;
	}
	public void setCDSOPEDAT2(String cDSOPEDAT2) {
		CDSOPEDAT2 = cDSOPEDAT2;
	}
	public String getCDSOPEDAT3() {
		return CDSOPEDAT3;
	}
	public void setCDSOPEDAT3(String cDSOPEDAT3) {
		CDSOPEDAT3 = cDSOPEDAT3;
	}
	public String getCDSTERLOAN() {
		return CDSTERLOAN;
	}
	public void setCDSTERLOAN(String cDSTERLOAN) {
		CDSTERLOAN = cDSTERLOAN;
	}
	public String getCDSUSER() {
		return CDSUSER;
	}
	public void setCDSUSER(String cDSUSER) {
		CDSUSER = cDSUSER;
	}
	public String getCDSDEAACC() {
		return CDSDEAACC;
	}
	public void setCDSDEAACC(String cDSDEAACC) {
		CDSDEAACC = cDSDEAACC;
	}
	public String getCDSDEACCY() {
		return CDSDEACCY;
	}
	public void setCDSDEACCY(String cDSDEACCY) {
		CDSDEACCY = cDSDEACCY;
	}
	public String getCDSDEAMEP() {
		return CDSDEAMEP;
	}
	public void setCDSDEAMEP(String cDSDEAMEP) {
		CDSDEAMEP = cDSDEAMEP;
	}
	public String getCDSDEAIPY() {
		return CDSDEAIPY;
	}
	public void setCDSDEAIPY(String cDSDEAIPY) {
		CDSDEAIPY = cDSDEAIPY;
	}
	public String getCDSINTMAT() {
		return CDSINTMAT;
	}
	public void setCDSINTMAT(String cDSINTMAT) {
		CDSINTMAT = cDSINTMAT;
	}
	public String getCDSMATDTE1() {
		return CDSMATDTE1;
	}
	public void setCDSMATDTE1(String cDSMATDTE1) {
		CDSMATDTE1 = cDSMATDTE1;
	}
	public String getCDSMATDTE2() {
		return CDSMATDTE2;
	}
	public void setCDSMATDTE2(String cDSMATDTE2) {
		CDSMATDTE2 = cDSMATDTE2;
	}
	public String getCDSMATDTE3() {
		return CDSMATDTE3;
	}
	public void setCDSMATDTE3(String cDSMATDTE3) {
		CDSMATDTE3 = cDSMATDTE3;
	}
	public String getCDSDEARTE() {
		return CDSDEARTE;
	}
	public void setCDSDEARTE(String cDSDEARTE) {
		CDSDEARTE = cDSDEARTE;
	}
	public String getCDSLSYIPD() {
		return CDSLSYIPD;
	}
	public void setCDSLSYIPD(String cDSLSYIPD) {
		CDSLSYIPD = cDSLSYIPD;
	}
	public String getCDSPRDNME() {
		return CDSPRDNME;
	}
	public void setCDSPRDNME(String cDSPRDNME) {
		CDSPRDNME = cDSPRDNME;
	}

}
