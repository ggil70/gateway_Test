/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.activo.gateway.beans;

/**
 *
 * @author P021102096
 */
public class CobroComisionResponse extends WSResponse{
    
    private CobroComisionBean DatosCOM;

    public CobroComisionBean getDatosCOM() {
        return DatosCOM;
    }

    public void setDatosCOM(CobroComisionBean DatosCOM) {
        this.DatosCOM = DatosCOM;
    }

   

   
}
