package com.activo.gateway.beans;

/**
 *
 * @author p016301630
 */
public class ConsultaFeriadosResponse extends WSResponse {
    
    //Retorna verdadero o falso si consigue la fecha en el archivo
    private boolean existe;

    public boolean isExiste() {
        return existe;
    }

    public void setExiste(boolean existe) {
        this.existe = existe;
    }        
    
}
