/**
 * Archivo del Bean para manejar el request de los Montos Diferidos y Bloqueados
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
 * Clase para manejar los parámetros de entrada del Resumen de Montos Diferidos y Bloqueados
 *
 */
public class EDD0395DSBean extends ParamsGenerales{
	
	/**
	 * Parámetro para manejar el usuario
	 */
	private String H01USERID;
	private String H01PROGRM;
	private String H01TIMSYS;
	private String H01SCRCOD;
	private String H01OPECOD;
	private String H01FLGMAS;
	private String H01FLGWK1;
	private String H01FLGWK2;
	private String H01FLGWK3;
	
	/**
	 * Parámetro para manejar el Número de Cuenta 
	 */
	private String E01UNCACC;
	
	/**
	 * Parámetro para manejar la Bandera que indica si es Monto Retenido o Diferido 
	 */
	private String E01UNCFLG;
	
	/**
	 * Parámetro para manejar el monto 
	 */
	private String E01UNCAMN;
	private String E01UNCCKN;
	
	/**
	 * Parámetro para manejar el Número de Días 
	 */
	private String E01UNCDYS;
	
	/**
	 * Parámetro para manejar la Fecha, Día 
	 */
	private String E01UNCRD1;
	
	/**
	 * Parámetro para manejar la Fecha, Mes 
	 */
	private String E01UNCRD2;
	
	/**
	 * Parámetro para manejar la Fecha, Año 
	 */
	private String E01UNCRD3;
	
	/**
	 * Parámetro para manejar la Fecha de Vencimiento, Día 
	 */
	private String E01UNCMD1;
	
	/**
	 * Parámetro para manejar la Fecha de Vencimiento, Mes 
	 */
	private String E01UNCMD2;
	
	/**
	 * Parámetro para manejar la Fecha de Vencimiento, Año 
	 */
	private String E01UNCMD3;
	
	/**
	 * Parámetro para manejar la Descripción 
	 */
	private String E01UNCRSN;
	private String E01UNCCUN;
	private String E01UNCSTA;
	private String E01UNCCON;
	private String E01UNCTEL;
	private String E01UNCTSQ;
	private String E01UNCKBK;
	private String E01UNCKBR;
	private String E01UNCKAC;
	private String E01UNCDES;
	private String E01UNCCRM;
	private String E01UNCOBR;
	private String E01UNCHTY;
	private String E01UNCNRM;
	private String E01UNCUSR;
	private String E01UNCFUS;
	private String E01UNCF02;
	
	public String getH01USERID() {
		return H01USERID;
	}
	public void setH01USERID(String h01userid) {
		H01USERID = h01userid;
	}
	public String getH01PROGRM() {
		return H01PROGRM;
	}
	public void setH01PROGRM(String h01progrm) {
		H01PROGRM = h01progrm;
	}
	public String getH01TIMSYS() {
		return H01TIMSYS;
	}
	public void setH01TIMSYS(String h01timsys) {
		H01TIMSYS = h01timsys;
	}
	public String getH01SCRCOD() {
		return H01SCRCOD;
	}
	public void setH01SCRCOD(String h01scrcod) {
		H01SCRCOD = h01scrcod;
	}
	public String getH01OPECOD() {
		return H01OPECOD;
	}
	public void setH01OPECOD(String h01opecod) {
		H01OPECOD = h01opecod;
	}
	public String getH01FLGMAS() {
		return H01FLGMAS;
	}
	public void setH01FLGMAS(String h01flgmas) {
		H01FLGMAS = h01flgmas;
	}
	public String getH01FLGWK1() {
		return H01FLGWK1;
	}
	public void setH01FLGWK1(String h01flgwk1) {
		H01FLGWK1 = h01flgwk1;
	}
	public String getH01FLGWK2() {
		return H01FLGWK2;
	}
	public void setH01FLGWK2(String h01flgwk2) {
		H01FLGWK2 = h01flgwk2;
	}
	public String getH01FLGWK3() {
		return H01FLGWK3;
	}
	public void setH01FLGWK3(String h01flgwk3) {
		H01FLGWK3 = h01flgwk3;
	}
	public String getE01UNCACC() {
		return E01UNCACC;
	}
	public void setE01UNCACC(String e01uncacc) {
		E01UNCACC = e01uncacc;
	}
	public String getE01UNCFLG() {
		return E01UNCFLG;
	}
	public void setE01UNCFLG(String e01uncflg) {
		E01UNCFLG = e01uncflg;
	}
	public String getE01UNCAMN() {
		return E01UNCAMN;
	}
	public void setE01UNCAMN(String e01uncamn) {
		E01UNCAMN = e01uncamn;
	}
	public String getE01UNCCKN() {
		return E01UNCCKN;
	}
	public void setE01UNCCKN(String e01uncckn) {
		E01UNCCKN = e01uncckn;
	}
	public String getE01UNCDYS() {
		return E01UNCDYS;
	}
	public void setE01UNCDYS(String e01uncdys) {
		E01UNCDYS = e01uncdys;
	}
	public String getE01UNCRD1() {
		return E01UNCRD1;
	}
	public void setE01UNCRD1(String e01uncrd1) {
		E01UNCRD1 = e01uncrd1;
	}
	public String getE01UNCRD2() {
		return E01UNCRD2;
	}
	public void setE01UNCRD2(String e01uncrd2) {
		E01UNCRD2 = e01uncrd2;
	}
	public String getE01UNCRD3() {
		return E01UNCRD3;
	}
	public void setE01UNCRD3(String e01uncrd3) {
		E01UNCRD3 = e01uncrd3;
	}
	public String getE01UNCMD1() {
		return E01UNCMD1;
	}
	public void setE01UNCMD1(String e01uncmd1) {
		E01UNCMD1 = e01uncmd1;
	}
	public String getE01UNCMD2() {
		return E01UNCMD2;
	}
	public void setE01UNCMD2(String e01uncmd2) {
		E01UNCMD2 = e01uncmd2;
	}
	public String getE01UNCMD3() {
		return E01UNCMD3;
	}
	public void setE01UNCMD3(String e01uncmd3) {
		E01UNCMD3 = e01uncmd3;
	}
	public String getE01UNCRSN() {
		return E01UNCRSN;
	}
	public void setE01UNCRSN(String e01uncrsn) {
		E01UNCRSN = e01uncrsn;
	}
	public String getE01UNCCUN() {
		return E01UNCCUN;
	}
	public void setE01UNCCUN(String e01unccun) {
		E01UNCCUN = e01unccun;
	}
	public String getE01UNCSTA() {
		return E01UNCSTA;
	}
	public void setE01UNCSTA(String e01uncsta) {
		E01UNCSTA = e01uncsta;
	}
	public String getE01UNCCON() {
		return E01UNCCON;
	}
	public void setE01UNCCON(String e01unccon) {
		E01UNCCON = e01unccon;
	}
	public String getE01UNCTEL() {
		return E01UNCTEL;
	}
	public void setE01UNCTEL(String e01unctel) {
		E01UNCTEL = e01unctel;
	}
	public String getE01UNCTSQ() {
		return E01UNCTSQ;
	}
	public void setE01UNCTSQ(String e01unctsq) {
		E01UNCTSQ = e01unctsq;
	}
	public String getE01UNCKBK() {
		return E01UNCKBK;
	}
	public void setE01UNCKBK(String e01unckbk) {
		E01UNCKBK = e01unckbk;
	}
	public String getE01UNCKBR() {
		return E01UNCKBR;
	}
	public void setE01UNCKBR(String e01unckbr) {
		E01UNCKBR = e01unckbr;
	}
	public String getE01UNCKAC() {
		return E01UNCKAC;
	}
	public void setE01UNCKAC(String e01unckac) {
		E01UNCKAC = e01unckac;
	}
	public String getE01UNCDES() {
		return E01UNCDES;
	}
	public void setE01UNCDES(String e01uncdes) {
		E01UNCDES = e01uncdes;
	}
	public String getE01UNCCRM() {
		return E01UNCCRM;
	}
	public void setE01UNCCRM(String e01unccrm) {
		E01UNCCRM = e01unccrm;
	}
	public String getE01UNCOBR() {
		return E01UNCOBR;
	}
	public void setE01UNCOBR(String e01uncobr) {
		E01UNCOBR = e01uncobr;
	}
	public String getE01UNCHTY() {
		return E01UNCHTY;
	}
	public void setE01UNCHTY(String e01unchty) {
		E01UNCHTY = e01unchty;
	}
	public String getE01UNCNRM() {
		return E01UNCNRM;
	}
	public void setE01UNCNRM(String e01uncnrm) {
		E01UNCNRM = e01uncnrm;
	}
	public String getE01UNCUSR() {
		return E01UNCUSR;
	}
	public void setE01UNCUSR(String e01uncusr) {
		E01UNCUSR = e01uncusr;
	}
	public String getE01UNCFUS() {
		return E01UNCFUS;
	}
	public void setE01UNCFUS(String e01uncfus) {
		E01UNCFUS = e01uncfus;
	}
	public String getE01UNCF02() {
		return E01UNCF02;
	}
	public void setE01UNCF02(String e01uncf02) {
		E01UNCF02 = e01uncf02;
	}

}
