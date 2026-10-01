package com.activo.gateway.beans;

/*
 * Bean con informacion referente a la Respuesta del Reverso Billetera Movil
 *
 *
 * @author Marcel Guglielmelli mguglielmelli@emsys.com
 */
public class ReversoBilleteraResponse extends WSResponse {
       
    private String mensaje;
    private int codigo;

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }        
    
}
