package com.activo.gateway.beans;


public class AdelantoEfectivoResponse extends WSResponse{
	// El tipo de mensaje será 0100 si es solicitud de consulta de saldo y 0110 si es respuesta de consulta de saldo
	private String tipoMensaje; 
	private String numTarjeta;
	private String cuentaAbono;
	private String numCliente;
	private String emailCliente;
	private String nombreCliente;

	// monto es utilizado cuando se hace la solicitud de avance de efectivo.
	private String monto;


	// El código de autorización asignado por el ente emisor
	private String codigoAutorizacion;

	// Código que indica si la transacción fue aprobada o negada, los codigos usados están especificados en la documentación
	// de Credicard, Mensajeria Adelanto Efectivo v 1.8. consultar el documento
	private String codigoRespuesta;
	private String respuesta;
	private String montoConsultaSaldo;
	
	private String dataExtraFinanciamiento;
	private String numReferencia;

	public AdelantoEfectivoResponse() {

	}

	// Getters y Setters
	
	public String getNombreCliente() {
		return nombreCliente;
	}


	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	
	public String getEmailCliente() {
		return emailCliente;
	}


	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}
	
	
	public String getNumCliente() {
		return numCliente;
	}


	public void setNumCliente(String numCliente) {
		this.numCliente = numCliente;
	}
	
	public String getRespuesta() {
		return respuesta;
	}


	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}
	
	public String getTipoMensaje() {
		return tipoMensaje;
	}

	public void setTipoMensaje(String tipoMensaje) {
		this.tipoMensaje = tipoMensaje;
	}

	public String getNumTarjeta() {
		return numTarjeta;
	}

	public void setNumTarjeta(String numTarjeta) {
		this.numTarjeta = numTarjeta;
	}

	public String getMonto() {
		return monto;
	}

	public void setMonto(String monto) {
		this.monto = monto;
	}


	public String getCodigoAutorizacion() {
		return codigoAutorizacion;
	}

	public void setCodigoAutorizacion(String codigoAutorizacion) {
		this.codigoAutorizacion = codigoAutorizacion;
	}

	public String getCodigoRespuesta() {
		return codigoRespuesta;
	}

	public void setCodigoRespuesta(String codigoRespuesta) {
		this.codigoRespuesta = codigoRespuesta;
	}

	public String getMontoConsultaSaldo() {
		return montoConsultaSaldo;
	}

	public void setMontoConsultaSaldo(String montoConsultaSaldo) {
		this.montoConsultaSaldo = montoConsultaSaldo;
	}
	
	public String getDataExtraFinanciamiento() {
		return dataExtraFinanciamiento;
	}


	public void setDataExtraFinanciamiento(String dataExtraFinanciamiento) {
		this.dataExtraFinanciamiento = dataExtraFinanciamiento;
	}
	
	public String getNumReferencia() {
		return numReferencia;
	}


	public void setNumReferencia(String numReferencia) {
		this.numReferencia = numReferencia;
	}
	
	public String getCuentaAbono() {
		return cuentaAbono;
	}


	public void setCuentaAbono(String cuentaAbono) {
		this.cuentaAbono = cuentaAbono;
	}
}
