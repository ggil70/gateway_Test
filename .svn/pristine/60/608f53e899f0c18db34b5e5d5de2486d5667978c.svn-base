package com.activo.gateway.beans;

/**
 * Bean con información referente a un extracredito
 *
 * Este bean contiene la información referente a los extracreditos obtenidos por el cliente en una tdc especifica.
 * La información proviene de la tabla B1046BAT.SATCC.SAPF1037 en el AS400
 *
 * @author Miguel Mendez mamendez@bancoactivo.com
 *
 */
public class ExtraCreditoInfoBean extends ParamsGenerales {

	private String numeroTarjeta;
    private String numeroCredito;
    private String estatus;
    private String codigoComercio;
    private String fechaAutorizacion;
    private String fechaUltimoProceso;
    private Double montoTotalCredito;
    private Double montoInicial;
    private Double montoPrimeraCuota;
    private Double montoComision;
    private int numeroCuotas;
    private Double tasa;
    private int periodoGracia;
    private String fechaPeriodoGracia;
    private Double tasaPeriodoGracia;
    private Double saldoPendiente;
    private int cuotasPendientes;
    private Double interesPendiente;
    private Double interesPagado;
    private String contrato;
    private String tipoProd;

    
    public ExtraCreditoInfoBean() {
		
	}

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getTipo(){
        String te = "CONSUMO";
        if("80234708".equals(this.codigoComercio)){
            te = "COMPRA DE SALDO";
        }else if ("80237839".equals(this.codigoComercio)){
            te = "EXTRACRED. CONSUMO EXTERIOR";
        }else if ("80237847".equals(this.codigoComercio) || "80242425".equals(this.codigoComercio)){
            te = "EXTRACRED. EFECTIVO";
        }
        return te;
    }
    public String getNumeroCredito() {
        return numeroCredito;
    }

    public void setNumeroCredito(String numeroCredito) {
        this.numeroCredito = numeroCredito;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public String getCodigoComercio() {
        return codigoComercio;
    }

    public void setCodigoComercio(String codigoComercio) {
        this.codigoComercio = codigoComercio;
    }

    public String getFechaAutorizacion() {
        return fechaAutorizacion;
    }

    public void setFechaAutorizacion(String fechaAutorizacion) {
        this.fechaAutorizacion = fechaAutorizacion;
    }

    public String getFechaUltimoProceso() {
        return fechaUltimoProceso;
    }

    public void setFechaUltimoProceso(String fechaUltimoProceso) {
        this.fechaUltimoProceso = fechaUltimoProceso;
    }

    public Double getMontoTotalCredito() {
        return montoTotalCredito;
    }

    public void setMontoTotalCredito(Double montoTotalCredito) {
        this.montoTotalCredito = montoTotalCredito;
    }

    public Double getMontoInicial() {
        return montoInicial;
    }

    public void setMontoInicial(Double montoInicial) {
        this.montoInicial = montoInicial;
    }

    public Double getMontoPrimeraCuota() {
        return montoPrimeraCuota;
    }

    public void setMontoPrimeraCuota(Double montoPrimeraCuota) {
        this.montoPrimeraCuota = montoPrimeraCuota;
    }

    public Double getMontoComision() {
        return montoComision;
    }

    public void setMontoComision(Double montoComision) {
        this.montoComision = montoComision;
    }

    public int getNumeroCuotas() {
        return numeroCuotas;
    }

    public void setNumeroCuotas(int numeroCuotas) {
        this.numeroCuotas = numeroCuotas;
    }

    public Double getTasa() {
        return tasa;
    }

    public void setTasa(Double tasa) {
        this.tasa = tasa;
    }

    public int getPeriodoGracia() {
        return periodoGracia;
    }

    public void setPeriodoGracia(int periodoGracia) {
        this.periodoGracia = periodoGracia;
    }

    public String getFechaPeriodoGracia() {
        return fechaPeriodoGracia;
    }

    public void setFechaPeriodoGracia(String fechaPeriodoGracia) {
        this.fechaPeriodoGracia = fechaPeriodoGracia;
    }

    public Double getTasaPeriodoGracia() {
        return tasaPeriodoGracia;
    }

    public void setTasaPeriodoGracia(Double tasaPeriodoGracia) {
        this.tasaPeriodoGracia = tasaPeriodoGracia;
    }

    public Double getSaldoPendiente() {
        return saldoPendiente;
    }

    public void setSaldoPendiente(Double saldoPendiente) {
        this.saldoPendiente = saldoPendiente;
    }

    public int getCuotasPendientes() {
        return cuotasPendientes;
    }

    public void setCuotasPendientes(int cuotasPendientes) {
        this.cuotasPendientes = cuotasPendientes;
    }

    public Double getInteresPendiente() {
        return interesPendiente;
    }

    public void setInteresPendiente(Double interesPendiente) {
        this.interesPendiente = interesPendiente;
    }

    public Double getInteresPagado() {
        return interesPagado;
    }

    public void setInteresPagado(Double interesPagado) {
        this.interesPagado = interesPagado;
    }

    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    public String getTipoProd() {
        return tipoProd;
    }

    public void setTipoProd(String tipoProd) {
        this.tipoProd = tipoProd;
    }

}
