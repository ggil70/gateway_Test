package com.activo.gateway.beans;


/**
 * Bean con información referente a un movimiento de un extracredito
 *
 * Este bean contiene la información referente a los movimientos de un extracredito.
 * La información proviene de la tabla B1046BAT.SATCC.SAPF1038 en el AS400
 *
 * @author Miguel Mendez mamendez@bancoactivo.com
 *
 */
public class MovimientoExtracreditoBean extends ParamsGenerales {
    private String fechaMovimiento;
    private Double tasaMes;
    private String concepto;
    private Double monto;
    private Double saldoAnterior;
    private Double interesesAnterior;
    private Double nuevoSaldo;
    private Double interesesGenerados;
    private Double interesesCancelados;
    private int cuotasCanceladas;

    public String getFechaMovimiento() {
        return fechaMovimiento;
    }

    public void setFechaMovimiento(String fechaMovimiento) {
        this.fechaMovimiento = fechaMovimiento;
    }

    public Double getTasaMes() {
        return tasaMes;
    }

    public void setTasaMes(Double tasaMes) {
        this.tasaMes = tasaMes;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public Double getSaldoAnterior() {
        return saldoAnterior;
    }

    public void setSaldoAnterior(Double saldoAnterior) {
        this.saldoAnterior = saldoAnterior;
    }

    public Double getInteresesAnterior() {
        return interesesAnterior;
    }

    public void setInteresesAnterior(Double interesesAnterior) {
        this.interesesAnterior = interesesAnterior;
    }

    public Double getNuevoSaldo() {
        return nuevoSaldo;
    }

    public void setNuevoSaldo(Double nuevoSaldo) {
        this.nuevoSaldo = nuevoSaldo;
    }

    public Double getInteresesGenerados() {
        return interesesGenerados;
    }

    public void setInteresesGenerados(Double interesesGenerados) {
        this.interesesGenerados = interesesGenerados;
    }

    public Double getInteresesCancelados() {
        return interesesCancelados;
    }

    public void setInteresesCancelados(Double interesesCancelados) {
        this.interesesCancelados = interesesCancelados;
    }

    public int getCuotasCanceladas() {
        return cuotasCanceladas;
    }

    public void setCuotasCanceladas(int cuotasCanceladas) {
        this.cuotasCanceladas = cuotasCanceladas;
    }
}
