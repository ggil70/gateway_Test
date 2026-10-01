/*
 * Bean con informacion referente a la Recarga Billetera Movil
 *
 * Este bean contiene la informacion referente a los datos para una transaccion de recarga.
 *
 * @author Marcel Guglielmelli mguglielmelli@emsys.com
 */
package com.activo.gateway.beans;

public class RecargaBilleteraBean extends ParamsGenerales {
    
    private String cedula;
    private String referencia;
    private String monto; 
    
    public RecargaBilleteraBean() {
		
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }    
        
}
