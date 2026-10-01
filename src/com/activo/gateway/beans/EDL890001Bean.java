/**
 * Archivo del Bean para Consultar los Cheques Suspendidos
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
 *Clase para manejar los parámetros de entrada de la Consulta de Cheques Suspendidos
 *
 */
public class EDL890001Bean {

	/**
	 * Parámetro para manejar el Usuario
	 */
	private String	E01USERID;
	
	/**
	 * Parámetro para manejar el Número de Cuenta del Usuario
	 */
	private String	E01CHMACC;
	
	/**
	 * Parámetro para manejar el Número de la Chequera
	 */
	private String	E01CHMNCB;
	
	/**
	 * Parámetro para manejar la Cantidad de Cheques en la Chequera
	 */
	private String	E01CHMNTC;
	
	/**
	 * Parámetro para manejar el Número de Cheque Inicial de la Chequera
	 */
	private String	E01CHMICK;
	
	/**
	 * Parámetro para manejar el Número de Cheque Final de la Chequera
	 */
	private String	E01CHMFCK;
	
	/**
	 * Parámetro para manejar el Número de Cheques Utilizados en la Chequera
	 */
	private String	E01CHMUCK;
	
	/**
	 * Parámetro para manejar el Número de Cheques Disponibles en la Chequera
	 */
	private String	E01CHMDCK;
	
	/**
	 * Parámetro para manejar los Cheques Suspendidos en la Chequera
	 */
	private String	E01CHMSCK;
	
	/**
	 * Parámetro para manejar la Fecha de Activación de la Chequera, Año
	 */
	private String	E01CHMDEY;
	
	/**
	 * Parámetro para manejar la Fecha de Activación de la Chequera, Mes
	 */
	private String	E01CHMDEM;
	
	/**
	 * Parámetro para manejar la Fecha de Activación de la Chequera, Día
	 */
	private String	E01CHMDED;
	
	/**
	 * Parámetro para manejar el Estatus del Cheque Número 1 
	 */
	private String	E01CHMS01;
	
	/**
	 * Parámetro para manejar el Estatus del Cheque Número 2 
	 */
	private String	E01CHMS02;
	
	/**
	 * Parámetro para manejar el Estatus del Cheque Número 3 
	 */
	private String	E01CHMS03;
	
	/**
	 * Parámetro para manejar el Estatus del Cheque Número 4 
	 */
	private String	E01CHMS04;
	
	/**
	 * Parámetro para manejar el Estatus del Cheque Número 5 
	 */
	private String	E01CHMS05;
	
	/**
	 * Parámetro para manejar el Estatus del Cheque Número 6 
	 */
	private String	E01CHMS06;
	
	/**
	 * Parámetro para manejar el Estatus del Cheque Número 7 
	 */
	private String	E01CHMS07;
	
	/**
	 * Parámetro para manejar el Estatus del Cheque Número 8
	 */
	private String	E01CHMS08;
	
	/**
	 * Parámetro para manejar el Estatus del Cheque Número 9  
	 */
	private String	E01CHMS09;
	
	/**
	 * Parámetro para manejar el Estatus del Cheque Número 10  
	 */
	private String	E01CHMS10;
	
	/**
	 * Parámetro para manejar el Estatus del Cheque Número 11  
	 */
	private String	E01CHMS11;
	
	/**
	 * Parámetro para manejar el Estatus del Cheque Número 12  
	 */
	private String	E01CHMS12;
	
	/**
	 * Parámetro para manejar el Estatus del Cheque Número 13
	 */
	private String	E01CHMS13;
	
	/**
	 * Parámetro para manejar el Estatus del Cheque Número 14  
	 */
	private String	E01CHMS14;
	
	/**
	 * Parámetro para manejar el Estatus del Cheque Número 15  
	 */
	private String	E01CHMS15;
	
	/**
	 * Parámetro para manejar el Estatus del Cheque Número 16  
	 */
	private String	E01CHMS16;
	
	/**
	 * Parámetro para manejar el Estatus del Cheque Número 17  
	 */
	private String	E01CHMS17;
	
	/**
	 * Parámetro para manejar el Estatus del Cheque Número 18  
	 */
	private String	E01CHMS18;
	
	/**
	 * Parámetro para manejar el Estatus del Cheque Número 19  
	 */
	private String	E01CHMS19;
	
	/**
	 * Parámetro para manejar el Estatus del Cheque Número 20  
	 */
	private String	E01CHMS20;
	
	/**
	 * Parámetro para manejar el Estatus del Cheque Número 21  
	 */
	private String	E01CHMS21;
	
	/**
	 * Parámetro para manejar el Estatus del Cheque Número 22  
	 */
	private String	E01CHMS22;
	
	/**
	 * Parámetro para manejar el Estatus del Cheque Número 23  
	 */
	private String	E01CHMS23;
	
	/**
	 * Parámetro para manejar el Estatus del Cheque Número 24  
	 */
	private String	E01CHMS24;
	
	/**
	 * Parámetro para manejar el Estatus del Cheque Número 25  
	 */
	private String	E01CHMS25;
	
	/**
	 * Parámetro para manejar el Estatus del Cheque Número 26  
	 */
	private String	E01CHMS26;
	
	/**
	 * Parámetro para manejar el Estatus del Cheque Número 27  
	 */
	private String	E01CHMS27;
	
	/**
	 * Parámetro para manejar el Estatus del Cheque Número 28  
	 */
	private String	E01CHMS28;
	
	/**
	 * Parámetro para manejar el Estatus del Cheque Número 29  
	 */
	private String	E01CHMS29;
	
	/**
	 * Parámetro para manejar el Estatus del Cheque Número 30  
	 */
	private String	E01CHMS30;
	
	/**
	 * Parámetro para manejar el Estatus del Cheque Número 31  
	 */
	private String	E01CHMS31;
	
	/**
	 * Parámetro para manejar el Estatus del Cheque Número 32  
	 */
	private String	E01CHMS32;
	
	/**
	 * Parámetro para manejar el Estatus del Cheque Número 33  
	 */
	private String	E01CHMS33;
	
	/**
	 * Parámetro para manejar el Estatus del Cheque Número 34  
	 */
	private String	E01CHMS34;
	
	/**
	 * Parámetro para manejar el Estatus del Cheque Número 35  
	 */
	private String	E01CHMS35;
	
	/**
	 * Parámetro para manejar el Estatus del Cheque Número 36  
	 */
	private String	E01CHMS36;
	
	/**
	 * Parámetro para manejar el Estatus del Cheque Número 37  
	 */
	private String	E01CHMS37;
	
	/**
	 * Parámetro para manejar el Estatus del Cheque Número 38  
	 */
	private String	E01CHMS38;
	
	/**
	 * Parámetro para manejar el Estatus del Cheque Número 39  
	 */
	private String	E01CHMS39;
	
	/**
	 * Parámetro para manejar el Estatus del Cheque Número 40  
	 */
	private String	E01CHMS40;
	
	/**
	 * Parámetro para manejar el Estatus del Cheque Número 41  
	 */
	private String	E01CHMS41;
	
	/**
	 * Parámetro para manejar el Estatus del Cheque Número 42  
	 */
	private String	E01CHMS42;
	
	/**
	 * Parámetro para manejar el Estatus del Cheque Número 43  
	 */
	private String	E01CHMS43;
	
	/**
	 * Parámetro para manejar el Estatus del Cheque Número 44  
	 */
	private String	E01CHMS44;
	
	/**
	 * Parámetro para manejar el Estatus del Cheque Número 45  
	 */
	private String	E01CHMS45;
	
	/**
	 * Parámetro para manejar el Estatus del Cheque Número 46  
	 */
	private String	E01CHMS46;
	
	/**
	 * Parámetro para manejar el Estatus del Cheque Número 47  
	 */
	private String	E01CHMS47;
	
	/**
	 * Parámetro para manejar el Estatus del Cheque Número 48  
	 */
	private String	E01CHMS48;
	
	/**
	 * Parámetro para manejar el Estatus del Cheque Número 49  
	 */
	private String	E01CHMS49;
	
	/**
	 * Parámetro para manejar el Estatus del Cheque Número 50  
	 */
	private String	E01CHMS50;
	
	/**
	 * Parámetro para manejar el Número de Cheque 1  
	 */
	private String	E01CHMN01;
	
	/**
	 * Parámetro para manejar el Número de Cheque 2  
	 */
	private String	E01CHMN02;
	
	/**
	 * Parámetro para manejar el Número de Cheque 3  
	 */
	private String	E01CHMN03;
	
	/**
	 * Parámetro para manejar el Número de Cheque 4  
	 */
	private String	E01CHMN04;
	
	/**
	 * Parámetro para manejar el Número de Cheque 5  
	 */
	private String	E01CHMN05;
	
	/**
	 * Parámetro para manejar el Número de Cheque 6  
	 */
	private String	E01CHMN06;
	
	/**
	 * Parámetro para manejar el Número de Cheque 7  
	 */
	private String	E01CHMN07;
	
	/**
	 * Parámetro para manejar el Número de Cheque 8  
	 */
	private String	E01CHMN08;
	
	/**
	 * Parámetro para manejar el Número de Cheque 9  
	 */
	private String	E01CHMN09;
	
	/**
	 * Parámetro para manejar el Número de Cheque 10  
	 */
	private String	E01CHMN10;
	
	/**
	 * Parámetro para manejar el Número de Cheque 11  
	 */
	private String	E01CHMN11;
	
	/**
	 * Parámetro para manejar el Número de Cheque 12  
	 */
	private String	E01CHMN12;
	
	/**
	 * Parámetro para manejar el Número de Cheque 13  
	 */
	private String	E01CHMN13;
	
	/**
	 * Parámetro para manejar el Número de Cheque 14  
	 */
	private String	E01CHMN14;
	
	/**
	 * Parámetro para manejar el Número de Cheque 15  
	 */
	private String	E01CHMN15;
	
	/**
	 * Parámetro para manejar el Número de Cheque 16  
	 */
	private String	E01CHMN16;
	
	/**
	 * Parámetro para manejar el Número de Cheque 17  
	 */
	private String	E01CHMN17;
	
	/**
	 * Parámetro para manejar el Número de Cheque 18  
	 */
	private String	E01CHMN18;
	
	/**
	 * Parámetro para manejar el Número de Cheque 19  
	 */
	private String	E01CHMN19;
	
	/**
	 * Parámetro para manejar el Número de Cheque 20  
	 */
	private String	E01CHMN20;
	
	/**
	 * Parámetro para manejar el Número de Cheque 21  
	 */
	private String	E01CHMN21;
	
	/**
	 * Parámetro para manejar el Número de Cheque 22  
	 */
	private String	E01CHMN22;
	
	/**
	 * Parámetro para manejar el Número de Cheque 23  
	 */
	private String	E01CHMN23;
	
	/**
	 * Parámetro para manejar el Número de Cheque 24  
	 */
	private String	E01CHMN24;
	
	/**
	 * Parámetro para manejar el Número de Cheque 25  
	 */
	private String	E01CHMN25;
	
	/**
	 * Parámetro para manejar el Número de Cheque 26  
	 */
	private String	E01CHMN26;
	
	/**
	 * Parámetro para manejar el Número de Cheque 27  
	 */
	private String	E01CHMN27;
	
	/**
	 * Parámetro para manejar el Número de Cheque 28  
	 */
	private String	E01CHMN28;
	
	/**
	 * Parámetro para manejar el Número de Cheque 29  
	 */
	private String	E01CHMN29;
	
	/**
	 * Parámetro para manejar el Número de Cheque 30  
	 */
	private String	E01CHMN30;
	
	/**
	 * Parámetro para manejar el Número de Cheque 31  
	 */
	private String	E01CHMN31;
	
	/**
	 * Parámetro para manejar el Número de Cheque 32  
	 */
	private String	E01CHMN32;
	
	/**
	 * Parámetro para manejar el Número de Cheque 33  
	 */
	private String	E01CHMN33;
	
	/**
	 * Parámetro para manejar el Número de Cheque 34  
	 */
	private String	E01CHMN34;
	
	/**
	 * Parámetro para manejar el Número de Cheque 35  
	 */
	private String	E01CHMN35;
	
	/**
	 * Parámetro para manejar el Número de Cheque 36  
	 */
	private String	E01CHMN36;
	
	/**
	 * Parámetro para manejar el Número de Cheque 37  
	 */
	private String	E01CHMN37;
	
	/**
	 * Parámetro para manejar el Número de Cheque 38  
	 */
	private String	E01CHMN38;
	
	/**
	 * Parámetro para manejar el Número de Cheque 39  
	 */
	private String	E01CHMN39;
	
	/**
	 * Parámetro para manejar el Número de Cheque 40  
	 */
	private String	E01CHMN40;
	
	/**
	 * Parámetro para manejar el Número de Cheque 41  
	 */
	private String	E01CHMN41;
	
	/**
	 * Parámetro para manejar el Número de Cheque 42  
	 */
	private String	E01CHMN42;
	
	/**
	 * Parámetro para manejar el Número de Cheque 43  
	 */
	private String	E01CHMN43;
	
	/**
	 * Parámetro para manejar el Número de Cheque 44  
	 */
	private String	E01CHMN44;
	
	/**
	 * Parámetro para manejar el Número de Cheque 45  
	 */
	private String	E01CHMN45;
	
	/**
	 * Parámetro para manejar el Número de Cheque 46  
	 */
	private String	E01CHMN46;
	
	/**
	 * Parámetro para manejar el Número de Cheque 47  
	 */
	private String	E01CHMN47;
	
	/**
	 * Parámetro para manejar el Número de Cheque 48  
	 */
	private String	E01CHMN48;
	
	/**
	 * Parámetro para manejar el Número de Cheque 49  
	 */
	private String  E01CHMN49;
	
	/**
	 * Parámetro para manejar el Número de Cheque 50  
	 */
	private String	E01CHMN50;


	public String getE01USERID() {
		return E01USERID;
	}
	public void setE01USERID(String e01userid) {
		E01USERID = e01userid;
	}
	public String getE01CHMACC() {
		return E01CHMACC;
	}
	public void setE01CHMACC(String e01chmacc) {
		E01CHMACC = e01chmacc;
	}
	public String getE01CHMNCB() {
		return E01CHMNCB;
	}
	public void setE01CHMNCB(String e01chmncb) {
		E01CHMNCB = e01chmncb;
	}
	public String getE01CHMNTC() {
		return E01CHMNTC;
	}
	public void setE01CHMNTC(String e01chmntc) {
		E01CHMNTC = e01chmntc;
	}
	public String getE01CHMICK() {
		return E01CHMICK;
	}
	public void setE01CHMICK(String e01chmick) {
		E01CHMICK = e01chmick;
	}
	public String getE01CHMFCK() {
		return E01CHMFCK;
	}
	public void setE01CHMFCK(String e01chmfck) {
		E01CHMFCK = e01chmfck;
	}
	public String getE01CHMUCK() {
		return E01CHMUCK;
	}
	public void setE01CHMUCK(String e01chmuck) {
		E01CHMUCK = e01chmuck;
	}
	public String getE01CHMDCK() {
		return E01CHMDCK;
	}
	public void setE01CHMDCK(String e01chmdck) {
		E01CHMDCK = e01chmdck;
	}
	public String getE01CHMSCK() {
		return E01CHMSCK;
	}
	public void setE01CHMSCK(String e01chmsck) {
		E01CHMSCK = e01chmsck;
	}
	public String getE01CHMDEY() {
		return E01CHMDEY;
	}
	public void setE01CHMDEY(String e01chmdey) {
		E01CHMDEY = e01chmdey;
	}
	public String getE01CHMDEM() {
		return E01CHMDEM;
	}
	public void setE01CHMDEM(String e01chmdem) {
		E01CHMDEM = e01chmdem;
	}
	public String getE01CHMDED() {
		return E01CHMDED;
	}
	public void setE01CHMDED(String e01chmded) {
		E01CHMDED = e01chmded;
	}
	public String getE01CHMS01() {
		return E01CHMS01;
	}
	public void setE01CHMS01(String e01chms01) {
		E01CHMS01 = e01chms01;
	}
	public String getE01CHMS02() {
		return E01CHMS02;
	}
	public void setE01CHMS02(String e01chms02) {
		E01CHMS02 = e01chms02;
	}
	public String getE01CHMS03() {
		return E01CHMS03;
	}
	public void setE01CHMS03(String e01chms03) {
		E01CHMS03 = e01chms03;
	}
	public String getE01CHMS04() {
		return E01CHMS04;
	}
	public void setE01CHMS04(String e01chms04) {
		E01CHMS04 = e01chms04;
	}
	public String getE01CHMS05() {
		return E01CHMS05;
	}
	public void setE01CHMS05(String e01chms05) {
		E01CHMS05 = e01chms05;
	}
	public String getE01CHMS06() {
		return E01CHMS06;
	}
	public void setE01CHMS06(String e01chms06) {
		E01CHMS06 = e01chms06;
	}
	public String getE01CHMS07() {
		return E01CHMS07;
	}
	public void setE01CHMS07(String e01chms07) {
		E01CHMS07 = e01chms07;
	}
	public String getE01CHMS08() {
		return E01CHMS08;
	}
	public void setE01CHMS08(String e01chms08) {
		E01CHMS08 = e01chms08;
	}
	public String getE01CHMS09() {
		return E01CHMS09;
	}
	public void setE01CHMS09(String e01chms09) {
		E01CHMS09 = e01chms09;
	}
	public String getE01CHMS10() {
		return E01CHMS10;
	}
	public void setE01CHMS10(String e01chms10) {
		E01CHMS10 = e01chms10;
	}
	public String getE01CHMS11() {
		return E01CHMS11;
	}
	public void setE01CHMS11(String e01chms11) {
		E01CHMS11 = e01chms11;
	}
	public String getE01CHMS12() {
		return E01CHMS12;
	}
	public void setE01CHMS12(String e01chms12) {
		E01CHMS12 = e01chms12;
	}
	public String getE01CHMS13() {
		return E01CHMS13;
	}
	public void setE01CHMS13(String e01chms13) {
		E01CHMS13 = e01chms13;
	}
	public String getE01CHMS14() {
		return E01CHMS14;
	}
	public void setE01CHMS14(String e01chms14) {
		E01CHMS14 = e01chms14;
	}
	public String getE01CHMS15() {
		return E01CHMS15;
	}
	public void setE01CHMS15(String e01chms15) {
		E01CHMS15 = e01chms15;
	}
	public String getE01CHMS16() {
		return E01CHMS16;
	}
	public void setE01CHMS16(String e01chms16) {
		E01CHMS16 = e01chms16;
	}
	public String getE01CHMS17() {
		return E01CHMS17;
	}
	public void setE01CHMS17(String e01chms17) {
		E01CHMS17 = e01chms17;
	}
	public String getE01CHMS18() {
		return E01CHMS18;
	}
	public void setE01CHMS18(String e01chms18) {
		E01CHMS18 = e01chms18;
	}
	public String getE01CHMS19() {
		return E01CHMS19;
	}
	public void setE01CHMS19(String e01chms19) {
		E01CHMS19 = e01chms19;
	}
	public String getE01CHMS20() {
		return E01CHMS20;
	}
	public void setE01CHMS20(String e01chms20) {
		E01CHMS20 = e01chms20;
	}
	public String getE01CHMS21() {
		return E01CHMS21;
	}
	public void setE01CHMS21(String e01chms21) {
		E01CHMS21 = e01chms21;
	}
	public String getE01CHMS22() {
		return E01CHMS22;
	}
	public void setE01CHMS22(String e01chms22) {
		E01CHMS22 = e01chms22;
	}
	public String getE01CHMS23() {
		return E01CHMS23;
	}
	public void setE01CHMS23(String e01chms23) {
		E01CHMS23 = e01chms23;
	}
	public String getE01CHMS24() {
		return E01CHMS24;
	}
	public void setE01CHMS24(String e01chms24) {
		E01CHMS24 = e01chms24;
	}
	public String getE01CHMS25() {
		return E01CHMS25;
	}
	public void setE01CHMS25(String e01chms25) {
		E01CHMS25 = e01chms25;
	}
	public String getE01CHMS26() {
		return E01CHMS26;
	}
	public void setE01CHMS26(String e01chms26) {
		E01CHMS26 = e01chms26;
	}
	public String getE01CHMS27() {
		return E01CHMS27;
	}
	public void setE01CHMS27(String e01chms27) {
		E01CHMS27 = e01chms27;
	}
	public String getE01CHMS28() {
		return E01CHMS28;
	}
	public void setE01CHMS28(String e01chms28) {
		E01CHMS28 = e01chms28;
	}
	public String getE01CHMS29() {
		return E01CHMS29;
	}
	public void setE01CHMS29(String e01chms29) {
		E01CHMS29 = e01chms29;
	}
	public String getE01CHMS30() {
		return E01CHMS30;
	}
	public void setE01CHMS30(String e01chms30) {
		E01CHMS30 = e01chms30;
	}
	public String getE01CHMS31() {
		return E01CHMS31;
	}
	public void setE01CHMS31(String e01chms31) {
		E01CHMS31 = e01chms31;
	}
	public String getE01CHMS32() {
		return E01CHMS32;
	}
	public void setE01CHMS32(String e01chms32) {
		E01CHMS32 = e01chms32;
	}
	public String getE01CHMS33() {
		return E01CHMS33;
	}
	public void setE01CHMS33(String e01chms33) {
		E01CHMS33 = e01chms33;
	}
	public String getE01CHMS34() {
		return E01CHMS34;
	}
	public void setE01CHMS34(String e01chms34) {
		E01CHMS34 = e01chms34;
	}
	public String getE01CHMS35() {
		return E01CHMS35;
	}
	public void setE01CHMS35(String e01chms35) {
		E01CHMS35 = e01chms35;
	}
	public String getE01CHMS36() {
		return E01CHMS36;
	}
	public void setE01CHMS36(String e01chms36) {
		E01CHMS36 = e01chms36;
	}
	public String getE01CHMS37() {
		return E01CHMS37;
	}
	public void setE01CHMS37(String e01chms37) {
		E01CHMS37 = e01chms37;
	}
	public String getE01CHMS38() {
		return E01CHMS38;
	}
	public void setE01CHMS38(String e01chms38) {
		E01CHMS38 = e01chms38;
	}
	public String getE01CHMS39() {
		return E01CHMS39;
	}
	public void setE01CHMS39(String e01chms39) {
		E01CHMS39 = e01chms39;
	}
	public String getE01CHMS40() {
		return E01CHMS40;
	}
	public void setE01CHMS40(String e01chms40) {
		E01CHMS40 = e01chms40;
	}
	public String getE01CHMS41() {
		return E01CHMS41;
	}
	public void setE01CHMS41(String e01chms41) {
		E01CHMS41 = e01chms41;
	}
	public String getE01CHMS42() {
		return E01CHMS42;
	}
	public void setE01CHMS42(String e01chms42) {
		E01CHMS42 = e01chms42;
	}
	public String getE01CHMS43() {
		return E01CHMS43;
	}
	public void setE01CHMS43(String e01chms43) {
		E01CHMS43 = e01chms43;
	}
	public String getE01CHMS44() {
		return E01CHMS44;
	}
	public void setE01CHMS44(String e01chms44) {
		E01CHMS44 = e01chms44;
	}
	public String getE01CHMS45() {
		return E01CHMS45;
	}
	public void setE01CHMS45(String e01chms45) {
		E01CHMS45 = e01chms45;
	}
	public String getE01CHMS46() {
		return E01CHMS46;
	}
	public void setE01CHMS46(String e01chms46) {
		E01CHMS46 = e01chms46;
	}
	public String getE01CHMS47() {
		return E01CHMS47;
	}
	public void setE01CHMS47(String e01chms47) {
		E01CHMS47 = e01chms47;
	}
	public String getE01CHMS48() {
		return E01CHMS48;
	}
	public void setE01CHMS48(String e01chms48) {
		E01CHMS48 = e01chms48;
	}
	public String getE01CHMS49() {
		return E01CHMS49;
	}
	public void setE01CHMS49(String e01chms49) {
		E01CHMS49 = e01chms49;
	}
	public String getE01CHMS50() {
		return E01CHMS50;
	}
	public void setE01CHMS50(String e01chms50) {
		E01CHMS50 = e01chms50;
	}
	public String getE01CHMN01() {
		return E01CHMN01;
	}
	public void setE01CHMN01(String e01chmn01) {
		E01CHMN01 = e01chmn01;
	}
	public String getE01CHMN02() {
		return E01CHMN02;
	}
	public void setE01CHMN02(String e01chmn02) {
		E01CHMN02 = e01chmn02;
	}
	public String getE01CHMN03() {
		return E01CHMN03;
	}
	public void setE01CHMN03(String e01chmn03) {
		E01CHMN03 = e01chmn03;
	}
	public String getE01CHMN04() {
		return E01CHMN04;
	}
	public void setE01CHMN04(String e01chmn04) {
		E01CHMN04 = e01chmn04;
	}
	public String getE01CHMN05() {
		return E01CHMN05;
	}
	public void setE01CHMN05(String e01chmn05) {
		E01CHMN05 = e01chmn05;
	}
	public String getE01CHMN06() {
		return E01CHMN06;
	}
	public void setE01CHMN06(String e01chmn06) {
		E01CHMN06 = e01chmn06;
	}
	public String getE01CHMN07() {
		return E01CHMN07;
	}
	public void setE01CHMN07(String e01chmn07) {
		E01CHMN07 = e01chmn07;
	}
	public String getE01CHMN08() {
		return E01CHMN08;
	}
	public void setE01CHMN08(String e01chmn08) {
		E01CHMN08 = e01chmn08;
	}
	public String getE01CHMN09() {
		return E01CHMN09;
	}
	public void setE01CHMN09(String e01chmn09) {
		E01CHMN09 = e01chmn09;
	}
	public String getE01CHMN10() {
		return E01CHMN10;
	}
	public void setE01CHMN10(String e01chmn10) {
		E01CHMN10 = e01chmn10;
	}
	public String getE01CHMN11() {
		return E01CHMN11;
	}
	public void setE01CHMN11(String e01chmn11) {
		E01CHMN11 = e01chmn11;
	}
	public String getE01CHMN12() {
		return E01CHMN12;
	}
	public void setE01CHMN12(String e01chmn12) {
		E01CHMN12 = e01chmn12;
	}
	public String getE01CHMN13() {
		return E01CHMN13;
	}
	public void setE01CHMN13(String e01chmn13) {
		E01CHMN13 = e01chmn13;
	}
	public String getE01CHMN14() {
		return E01CHMN14;
	}
	public void setE01CHMN14(String e01chmn14) {
		E01CHMN14 = e01chmn14;
	}
	public String getE01CHMN15() {
		return E01CHMN15;
	}
	public void setE01CHMN15(String e01chmn15) {
		E01CHMN15 = e01chmn15;
	}
	public String getE01CHMN16() {
		return E01CHMN16;
	}
	public void setE01CHMN16(String e01chmn16) {
		E01CHMN16 = e01chmn16;
	}
	public String getE01CHMN17() {
		return E01CHMN17;
	}
	public void setE01CHMN17(String e01chmn17) {
		E01CHMN17 = e01chmn17;
	}
	public String getE01CHMN18() {
		return E01CHMN18;
	}
	public void setE01CHMN18(String e01chmn18) {
		E01CHMN18 = e01chmn18;
	}
	public String getE01CHMN19() {
		return E01CHMN19;
	}
	public void setE01CHMN19(String e01chmn19) {
		E01CHMN19 = e01chmn19;
	}
	public String getE01CHMN20() {
		return E01CHMN20;
	}
	public void setE01CHMN20(String e01chmn20) {
		E01CHMN20 = e01chmn20;
	}
	public String getE01CHMN21() {
		return E01CHMN21;
	}
	public void setE01CHMN21(String e01chmn21) {
		E01CHMN21 = e01chmn21;
	}
	public String getE01CHMN22() {
		return E01CHMN22;
	}
	public void setE01CHMN22(String e01chmn22) {
		E01CHMN22 = e01chmn22;
	}
	public String getE01CHMN23() {
		return E01CHMN23;
	}
	public void setE01CHMN23(String e01chmn23) {
		E01CHMN23 = e01chmn23;
	}
	public String getE01CHMN24() {
		return E01CHMN24;
	}
	public void setE01CHMN24(String e01chmn24) {
		E01CHMN24 = e01chmn24;
	}
	public String getE01CHMN25() {
		return E01CHMN25;
	}
	public void setE01CHMN25(String e01chmn25) {
		E01CHMN25 = e01chmn25;
	}
	public String getE01CHMN26() {
		return E01CHMN26;
	}
	public void setE01CHMN26(String e01chmn26) {
		E01CHMN26 = e01chmn26;
	}
	public String getE01CHMN27() {
		return E01CHMN27;
	}
	public void setE01CHMN27(String e01chmn27) {
		E01CHMN27 = e01chmn27;
	}
	public String getE01CHMN28() {
		return E01CHMN28;
	}
	public void setE01CHMN28(String e01chmn28) {
		E01CHMN28 = e01chmn28;
	}
	public String getE01CHMN29() {
		return E01CHMN29;
	}
	public void setE01CHMN29(String e01chmn29) {
		E01CHMN29 = e01chmn29;
	}
	public String getE01CHMN30() {
		return E01CHMN30;
	}
	public void setE01CHMN30(String e01chmn30) {
		E01CHMN30 = e01chmn30;
	}
	public String getE01CHMN31() {
		return E01CHMN31;
	}
	public void setE01CHMN31(String e01chmn31) {
		E01CHMN31 = e01chmn31;
	}
	public String getE01CHMN32() {
		return E01CHMN32;
	}
	public void setE01CHMN32(String e01chmn32) {
		E01CHMN32 = e01chmn32;
	}
	public String getE01CHMN33() {
		return E01CHMN33;
	}
	public void setE01CHMN33(String e01chmn33) {
		E01CHMN33 = e01chmn33;
	}
	public String getE01CHMN34() {
		return E01CHMN34;
	}
	public void setE01CHMN34(String e01chmn34) {
		E01CHMN34 = e01chmn34;
	}
	public String getE01CHMN35() {
		return E01CHMN35;
	}
	public void setE01CHMN35(String e01chmn35) {
		E01CHMN35 = e01chmn35;
	}
	public String getE01CHMN36() {
		return E01CHMN36;
	}
	public void setE01CHMN36(String e01chmn36) {
		E01CHMN36 = e01chmn36;
	}
	public String getE01CHMN37() {
		return E01CHMN37;
	}
	public void setE01CHMN37(String e01chmn37) {
		E01CHMN37 = e01chmn37;
	}
	public String getE01CHMN38() {
		return E01CHMN38;
	}
	public void setE01CHMN38(String e01chmn38) {
		E01CHMN38 = e01chmn38;
	}
	public String getE01CHMN39() {
		return E01CHMN39;
	}
	public void setE01CHMN39(String e01chmn39) {
		E01CHMN39 = e01chmn39;
	}
	public String getE01CHMN40() {
		return E01CHMN40;
	}
	public void setE01CHMN40(String e01chmn40) {
		E01CHMN40 = e01chmn40;
	}
	public String getE01CHMN41() {
		return E01CHMN41;
	}
	public void setE01CHMN41(String e01chmn41) {
		E01CHMN41 = e01chmn41;
	}
	public String getE01CHMN42() {
		return E01CHMN42;
	}
	public void setE01CHMN42(String e01chmn42) {
		E01CHMN42 = e01chmn42;
	}
	public String getE01CHMN43() {
		return E01CHMN43;
	}
	public void setE01CHMN43(String e01chmn43) {
		E01CHMN43 = e01chmn43;
	}
	public String getE01CHMN44() {
		return E01CHMN44;
	}
	public void setE01CHMN44(String e01chmn44) {
		E01CHMN44 = e01chmn44;
	}
	public String getE01CHMN45() {
		return E01CHMN45;
	}
	public void setE01CHMN45(String e01chmn45) {
		E01CHMN45 = e01chmn45;
	}
	public String getE01CHMN46() {
		return E01CHMN46;
	}
	public void setE01CHMN46(String e01chmn46) {
		E01CHMN46 = e01chmn46;
	}
	public String getE01CHMN47() {
		return E01CHMN47;
	}
	public void setE01CHMN47(String e01chmn47) {
		E01CHMN47 = e01chmn47;
	}
	public String getE01CHMN48() {
		return E01CHMN48;
	}
	public void setE01CHMN48(String e01chmn48) {
		E01CHMN48 = e01chmn48;
	}
	public String getE01CHMN49() {
		return E01CHMN49;
	}
	public void setE01CHMN49(String e01chmn49) {
		E01CHMN49 = e01chmn49;
	}
	public String getE01CHMN50() {
		return E01CHMN50;
	}
	public void setE01CHMN50(String e01chmn50) {
		E01CHMN50 = e01chmn50;
	}



}