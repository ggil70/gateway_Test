/**
 * Archivo del Bean para la Consulta de Préstamos, Consulta de Movimientos
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
 *Clase para manejar la Consulta de Préstamos, Consulta de Movimientos
 *
 */
public class IN098002Bean extends ParamsGenerales{
	
	/**
	 * Parámetro para manejar el Usuario
	 */
	private String H02USERID;
	
	/**
	 * Parámetro para manejar el Número de Préstamo
	 */
	private String E02DEAACC;
	
	
	private String H02PROGRM;
	private String H02TIMSYS;
	private String H02SCRCOD;
	private String H02OPECOD;
	private String H02FLGMAS;
	private String H02FLGWK1;
	private String H02FLGWK2;
	private String H02FLGWK3;
	private String E02PYMDT1;
	private String E02PYMDT2;
	private String E02PYMDT3;
	private String E02DLPPRI;
	private String E02DLPINT;
	private String E02DLPMOR;
	private String E02DLPDED;
	private String E02PYMSTS;
	
	
	public String getH02USERID() {
		return H02USERID;
	}
	public void setH02USERID(String h02userid) {
		H02USERID = h02userid;
	}
	public String getH02PROGRM() {
		return H02PROGRM;
	}
	public void setH02PROGRM(String h02progrm) {
		H02PROGRM = h02progrm;
	}
	public String getH02TIMSYS() {
		return H02TIMSYS;
	}
	public void setH02TIMSYS(String h02timsys) {
		H02TIMSYS = h02timsys;
	}
	public String getH02SCRCOD() {
		return H02SCRCOD;
	}
	public void setH02SCRCOD(String h02scrcod) {
		H02SCRCOD = h02scrcod;
	}
	public String getH02OPECOD() {
		return H02OPECOD;
	}
	public void setH02OPECOD(String h02opecod) {
		H02OPECOD = h02opecod;
	}
	public String getH02FLGMAS() {
		return H02FLGMAS;
	}
	public void setH02FLGMAS(String h02flgmas) {
		H02FLGMAS = h02flgmas;
	}
	public String getH02FLGWK1() {
		return H02FLGWK1;
	}
	public void setH02FLGWK1(String h02flgwk1) {
		H02FLGWK1 = h02flgwk1;
	}
	public String getH02FLGWK2() {
		return H02FLGWK2;
	}
	public void setH02FLGWK2(String h02flgwk2) {
		H02FLGWK2 = h02flgwk2;
	}
	public String getH02FLGWK3() {
		return H02FLGWK3;
	}
	public void setH02FLGWK3(String h02flgwk3) {
		H02FLGWK3 = h02flgwk3;
	}
	public String getE02DEAACC() {
		return E02DEAACC;
	}
	public void setE02DEAACC(String e02deaacc) {
		E02DEAACC = e02deaacc;
	}
	public String getE02PYMDT1() {
		return E02PYMDT1;
	}
	public void setE02PYMDT1(String e02pymdt1) {
		E02PYMDT1 = e02pymdt1;
	}
	public String getE02PYMDT2() {
		return E02PYMDT2;
	}
	public void setE02PYMDT2(String e02pymdt2) {
		E02PYMDT2 = e02pymdt2;
	}
	public String getE02PYMDT3() {
		return E02PYMDT3;
	}
	public void setE02PYMDT3(String e02pymdt3) {
		E02PYMDT3 = e02pymdt3;
	}
	public String getE02DLPPRI() {
		return E02DLPPRI;
	}
	public void setE02DLPPRI(String e02dlppri) {
		E02DLPPRI = e02dlppri;
	}
	public String getE02DLPINT() {
		return E02DLPINT;
	}
	public void setE02DLPINT(String e02dlpint) {
		E02DLPINT = e02dlpint;
	}
	public String getE02DLPMOR() {
		return E02DLPMOR;
	}
	public void setE02DLPMOR(String e02dlpmor) {
		E02DLPMOR = e02dlpmor;
	}
	public String getE02DLPDED() {
		return E02DLPDED;
	}
	public void setE02DLPDED(String e02dlpded) {
		E02DLPDED = e02dlpded;
	}
	public String getE02PYMSTS() {
		return E02PYMSTS;
	}
	public void setE02PYMSTS(String e02pymsts) {
		E02PYMSTS = e02pymsts;
	}

}
