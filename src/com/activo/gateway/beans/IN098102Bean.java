/**
 * Archivo del Bean para Pagar las Tarjetas de Crédito Propias/Terceros
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
 *Clase para manejar el Pago de Tarjetas de Crédito Propias/Terceros
 *
 */
public class IN098102Bean extends ParamsGenerales{

	/**
	 * Parámetro para manejar el Usuario
	 */
	private String IN982USR;

	/**
	 * Parámetro para manejar el Número de Tarjeta de Crédito
	 */
	private String IN982CRNUM;

	/**
	 * Parámetro para manejar la Cuenta Débito de la Operación
	 */
	private String IN982DEBAC;

	/**
	 * Parámetro para manejar el Monto del Pago
	 */
	private String IN982PAYAM;

	/**
	 * Parámetro para manejar la Moneda
	 */
	private String IN982CCY;

	/**
	 * Parámetro para manejar la Fecha del Pago, Día
	 */
	private String IN982DTE1;

	/**
	 * Parámetro para manejar la Fecha del Pago, Mes
	 */
	private String IN982DTE2;

	/**
	 * Parámetro para manejar la Fecha del Pago, Año
	 */
	private String IN982DTE3;

	/**
	 * Parámetro que representa una Bandera para manejar el Fin de Archivo en la consulta
	 */
	private String IN982ENDFL;
        
        /**
	 * Parámetro que representa una Bandera para manejar el Fin de Archivo en la consulta
	 */
	private String IN982IPACT;

	//Campos para el envío de correo electrónico.

	private String descTipoTransaccion;

	private String descTipoOperacion;

	private String nombreBeneficiario;

	private String concepto;

	private String emailBeneficiario;

	private String id_usuario;

	private String operacion;

	public String getIN982USR() {
		return IN982USR;
	}
	public void setIN982USR(String iN982USR) {
		IN982USR = iN982USR;
	}
	public String getIN982CRNUM() {
		return IN982CRNUM;
	}
	public void setIN982CRNUM(String iN982CRNUM) {
		IN982CRNUM = iN982CRNUM;
	}
	public String getIN982DEBAC() {
		return IN982DEBAC;
	}
	public void setIN982DEBAC(String iN982DEBAC) {
		IN982DEBAC = iN982DEBAC;
	}
	public String getIN982PAYAM() {
		return IN982PAYAM;
	}
	public void setIN982PAYAM(String iN982PAYAM) {
		IN982PAYAM = iN982PAYAM;
	}
	public String getIN982CCY() {
		return IN982CCY;
	}
	public void setIN982CCY(String iN982CCY) {
		IN982CCY = iN982CCY;
	}
	public String getIN982DTE1() {
		return IN982DTE1;
	}
	public void setIN982DTE1(String iN982DTE1) {
		IN982DTE1 = iN982DTE1;
	}
	public String getIN982DTE2() {
		return IN982DTE2;
	}
	public void setIN982DTE2(String iN982DTE2) {
		IN982DTE2 = iN982DTE2;
	}
	public String getIN982DTE3() {
		return IN982DTE3;
	}
	public void setIN982DTE3(String iN982DTE3) {
		IN982DTE3 = iN982DTE3;
	}
	public String getIN982ENDFL() {
		return IN982ENDFL;
	}
	public void setIN982ENDFL(String iN982ENDFL) {
		IN982ENDFL = iN982ENDFL;
	}
	/**
	 * @return the descTipoTransaccion
	 */
	public String getDescTipoTransaccion() {
		return descTipoTransaccion;
	}
	/**
	 * @param descTipoTransaccion the descTipoTransaccion to set
	 */
	public void setDescTipoTransaccion(String descTipoTransaccion) {
		this.descTipoTransaccion = descTipoTransaccion;
	}
	/**
	 * @return the descTipoOperacion
	 */
	public String getDescTipoOperacion() {
		return descTipoOperacion;
	}
	/**
	 * @param descTipoOperacion the descTipoOperacion to set
	 */
	public void setDescTipoOperacion(String descTipoOperacion) {
		this.descTipoOperacion = descTipoOperacion;
	}
	/**
	 * @return the nombreBeneficiario
	 */
	public String getNombreBeneficiario() {
		return nombreBeneficiario;
	}
	/**
	 * @param nombreBeneficiario the nombreBeneficiario to set
	 */
	public void setNombreBeneficiario(String nombreBeneficiario) {
		this.nombreBeneficiario = nombreBeneficiario;
	}
	/**
	 * @return the concepto
	 */
	public String getConcepto() {
		return concepto;
	}
	/**
	 * @param concepto the concepto to set
	 */
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	/**
	 * @return the emailBeneficiario
	 */
	public String getEmailBeneficiario() {
		return emailBeneficiario;
	}
	/**
	 * @param emailBeneficiario the emailBeneficiario to set
	 */
	public void setEmailBeneficiario(String emailBeneficiario) {
		this.emailBeneficiario = emailBeneficiario;
	}
	/**
	 * @return the id_usuario
	 */
	public String getId_usuario() {
		return id_usuario;
	}
	/**
	 * @param id_usuario the id_usuario to set
	 */
	public void setId_usuario(String id_usuario) {
		this.id_usuario = id_usuario;
	}
	/**
	 * @return the operacion
	 */
	public String getOperacion() {
		return operacion;
	}
	/**
	 * @param operacion the operacion to set
	 */
	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}

        public String getIN982IPACT() {
            return IN982IPACT;
        }

        public void setIN982IPACT(String IN982IPACT) {
            this.IN982IPACT = IN982IPACT;
        }

}
