package com.activo.gateway.model;

public class Solicitud {
	
	private String numeroTarjeta;
	private String pinActual;
	private String pinNuevo;
	private String canal;
	private String idCliente;
	
	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}
	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}
	public String getPinActual() {
		return pinActual;
	}
	public void setPinActual(String pinActual) {
		this.pinActual = pinActual;
	}
	public String getPinNuevo() {
		return pinNuevo;
	}
	public void setPinNuevo(String pinNuevo) {
		this.pinNuevo = pinNuevo;
	}
	public String getCanal() {
		return canal;
	}
	public void setCanal(String canal) {
		this.canal = canal;
	}
	public String getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}
	
	
	

}
