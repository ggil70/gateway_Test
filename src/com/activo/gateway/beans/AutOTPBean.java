package com.activo.gateway.beans;

public class AutOTPBean extends ParamsGenerales {
	//Si viene un valor en RIF es Juridico
	private String rif;
	// Cédula del cliente que se le va a generar el OTP
	private String tipoCedula;
	private String cedula;
	// Código OTP para ser validado contra el IDG
	private String otpCod;

	public AutOTPBean() {
		
	}

	public String getRif() {
		return rif;
	}

	public void setRif(String rif) {
		this.rif = rif;
	}
	
	public String getTipoCedula() {
		return tipoCedula;
	}

	public void setTipoCedula(String tipoCedula) {
		this.tipoCedula = tipoCedula;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getOtpCod() {
		return otpCod;
	}

	public void setOtpCod(String otpCod) {
		this.otpCod = otpCod;
	}
	
	

}
