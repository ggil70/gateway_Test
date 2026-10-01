/**
 * Archivo del Bean para manejar el request del Resumen de Tarjetas de Crédito
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
 *Clase para manejar los parámetros de entrada del Resumen de Tarjetas de Crédito  
 *
 */
public class CARDSJVBean extends ParamsGenerales{
	
	/**
	 * Parámetro para manejar el usuario
	 */
	private String CARUSR;
	
	/**
	 * Parámetro para manejar el Número de la Tarjeta de Crédito
	 */
	private String CARNUM;
	
	/**
	 * Parámetro para manejar la Moneda
	 */
	private String CARCCY;
	
	/**
	 * Parámetro para manejar el Tipo
	 */
	private String CARTYP;
	
	/**
	 * Parámetro para manejar la Fecha de Apertura, día
	 */
	private String CAROP1;
	
	/**
	 * Parámetro para manejar la Fecha de Apertura, mes
	 */
	private String CAROP2;
	
	/**
	 * Parámetro para manejar la Fecha de Apertura, año
	 */
	private String CAROP3;
	
	/**
	 * Parámetro para manejar la Fecha de Expiración, día
	 */
	private String CARED1;
	
	/**
	 * Parámetro para manejar la Fecha de Expiración, mes
	 */
	private String CARED2;
	
	/**
	 * Parámetro para manejar la Fecha de expiración, año
	 */
	private String CARED3;
	
	/**
	 * Parámetro para manejar la Fecha de Activación, día 
	 */
	private String CARAC1;
	
	/**
	 * Parámetro para manejar la Fecha de Activación, mes
	 */
	private String CARAC2;
	
	/**
	 * Parámetro para manejar la Fecha de Activación, año
	 */
	private String CARAC3;
	
	/**
	 * Parámetro para manejar la Fecha de vencimiento del Pago, día
	 */
	private String CARDU1;
	
	/**
	 * Parámetro para manejar la Fecha de Vencimiento del Pago, mes
	 */
	private String CARDU2;
	
	/**
	 * Parámetro para manejar la Fecha de Vencimiento del Pago, año 
	 */
	private String CARDU3;
	
	/**
	 * Parámetro para manejar la Fecha de Última Facturación, día
	 */
	private String CARLB1;
	
	/**
	 * Parámetro para manejar la Fecha de la Última Facturación, mes
	 */
	private String CARLB2;
	
	/**
	 * Parámetro para manejar la fecha de la Última Facturación, año
	 */
	private String CARLB3;
	
	/**
	 * Parámetro para manejar la Fecha de la Última Mora, día
	 */
	private String CARLM1;
	
	/**
	 * Parámetro para manejar la Fecha de la Última Mora, mes
	 */
	private String CARLM2;
	
	/**
	 * Parámetro para manejar la Fecha de la Úlima Mora, año
	 */
	private String CARLM3;
	
	/**
	 * Parámetro para manejar la Fecha del Último Pago, día
	 */
	private String CARLP1;
	
	/**
	 * Parámetro para manejar la Fecha del Último Pago, mes
	 */
	private String CARLP2;
	
	/**
	 * Parámetro para manejar la Fecha del Último Pago, año
	 */
	private String CARLP3;
	
	/**
	 * Parámetro para manejar el Límete del Crédito
	 */
	private String CARCRL;
	
	/**
	 * Parámetro para manejar el Saldo Disponible
	 */
	private String CARAVC;
	
	/**
	 * Parámetro para manejar el Saldo Actual
	 */
	private String CARBAL;
	
	/**
	 * Parámetro para manejar el Pago Mínimo
	 */
	private String CARPMA;
	
	/**
	 * Parámetro para manejar el Avance de Efectivo
	 */
	private String CARAAD;
	
	/**
	 * Parámetro para manejar el Estatus del Ciclo
	 */
	private String CARCFA;
	
	/**
	 * Parámetro para manejar el Saldo Anterior
	 */
	private String CARLSB;
	
	/**
	 * Parámetro para manejar el Pago EOM
	 */
	private String CARPMC;
	
	/**
	 * Parámetro para manejar el Alias de la Tarjeta de Crédito
	 */
	private String CARNIK;
	
	public String getCARUSR() {
		return CARUSR;
	}
	public void setCARUSR(String cARUSR) {
		CARUSR = cARUSR;
	}
	public String getCARNUM() {
		return CARNUM;
	}
	public void setCARNUM(String cARNUM) {
		CARNUM = cARNUM;
	}
	public String getCARCCY() {
		return CARCCY;
	}
	public void setCARCCY(String cARCCY) {
		CARCCY = cARCCY;
	}
	public String getCARTYP() {
		return CARTYP;
	}
	public void setCARTYP(String cARTYP) {
		CARTYP = cARTYP;
	}
	public String getCAROP1() {
		return CAROP1;
	}
	public void setCAROP1(String cAROP1) {
		CAROP1 = cAROP1;
	}
	public String getCAROP2() {
		return CAROP2;
	}
	public void setCAROP2(String cAROP2) {
		CAROP2 = cAROP2;
	}
	public String getCAROP3() {
		return CAROP3;
	}
	public void setCAROP3(String cAROP3) {
		CAROP3 = cAROP3;
	}
	public String getCARED1() {
		return CARED1;
	}
	public void setCARED1(String cARED1) {
		CARED1 = cARED1;
	}
	public String getCARED2() {
		return CARED2;
	}
	public void setCARED2(String cARED2) {
		CARED2 = cARED2;
	}
	public String getCARED3() {
		return CARED3;
	}
	public void setCARED3(String cARED3) {
		CARED3 = cARED3;
	}
	public String getCARAC1() {
		return CARAC1;
	}
	public void setCARAC1(String cARAC1) {
		CARAC1 = cARAC1;
	}
	public String getCARAC2() {
		return CARAC2;
	}
	public void setCARAC2(String cARAC2) {
		CARAC2 = cARAC2;
	}
	public String getCARAC3() {
		return CARAC3;
	}
	public void setCARAC3(String cARAC3) {
		CARAC3 = cARAC3;
	}
	public String getCARDU1() {
		return CARDU1;
	}
	public void setCARDU1(String cARDU1) {
		CARDU1 = cARDU1;
	}
	public String getCARDU2() {
		return CARDU2;
	}
	public void setCARDU2(String cARDU2) {
		CARDU2 = cARDU2;
	}
	public String getCARDU3() {
		return CARDU3;
	}
	public void setCARDU3(String cARDU3) {
		CARDU3 = cARDU3;
	}
	public String getCARLB1() {
		return CARLB1;
	}
	public void setCARLB1(String cARLB1) {
		CARLB1 = cARLB1;
	}
	public String getCARLB2() {
		return CARLB2;
	}
	public void setCARLB2(String cARLB2) {
		CARLB2 = cARLB2;
	}
	public String getCARLB3() {
		return CARLB3;
	}
	public void setCARLB3(String cARLB3) {
		CARLB3 = cARLB3;
	}
	public String getCARLM1() {
		return CARLM1;
	}
	public void setCARLM1(String cARLM1) {
		CARLM1 = cARLM1;
	}
	public String getCARLM2() {
		return CARLM2;
	}
	public void setCARLM2(String cARLM2) {
		CARLM2 = cARLM2;
	}
	public String getCARLM3() {
		return CARLM3;
	}
	public void setCARLM3(String cARLM3) {
		CARLM3 = cARLM3;
	}
	public String getCARLP1() {
		return CARLP1;
	}
	public void setCARLP1(String cARLP1) {
		CARLP1 = cARLP1;
	}
	public String getCARLP2() {
		return CARLP2;
	}
	public void setCARLP2(String cARLP2) {
		CARLP2 = cARLP2;
	}
	public String getCARLP3() {
		return CARLP3;
	}
	public void setCARLP3(String cARLP3) {
		CARLP3 = cARLP3;
	}
	public String getCARCRL() {
		return CARCRL;
	}
	public void setCARCRL(String cARCRL) {
		CARCRL = cARCRL;
	}
	public String getCARAVC() {
		return CARAVC;
	}
	public void setCARAVC(String cARAVC) {
		CARAVC = cARAVC;
	}
	public String getCARBAL() {
		return CARBAL;
	}
	public void setCARBAL(String cARBAL) {
		CARBAL = cARBAL;
	}
	public String getCARPMA() {
		return CARPMA;
	}
	public void setCARPMA(String cARPMA) {
		CARPMA = cARPMA;
	}
	public String getCARAAD() {
		return CARAAD;
	}
	public void setCARAAD(String cARAAD) {
		CARAAD = cARAAD;
	}
	public String getCARCFA() {
		return CARCFA;
	}
	public void setCARCFA(String cARCFA) {
		CARCFA = cARCFA;
	}
	public String getCARLSB() {
		return CARLSB;
	}
	public void setCARLSB(String cARLSB) {
		CARLSB = cARLSB;
	}
	public String getCARPMC() {
		return CARPMC;
	}
	public void setCARPMC(String cARPMC) {
		CARPMC = cARPMC;
	}
	public String getCARNIK() {
		return CARNIK;
	}
	public void setCARNIK(String cARNIK) {
		CARNIK = cARNIK;
	}
	
	}
