package com.activo.gateway.util;

import java.util.regex.Pattern;

import com.activo.gateway.beans.NIBPF3010Bean;
import com.activo.gateway.beans.SUMDSJVBean;

public class Validador {
	private String codigoError = "";
	
	private String descripcionError = "";
	
	private NIBPF3010Bean datosBasicos;
	
	private SUMDSJVBean[] cuentas;
	
	private String nroIdentificacion;
	
	private String[] secuencias = new String[]{
		"01234567890",
		"abcdefghijklmnñopqrstuvwxyz"
	};
	
	public String getCodigoError() {
		return codigoError;
	}

	public String getDescripcionError() {
		return descripcionError;
	}

	public NIBPF3010Bean getDatosBasicos() {
		return datosBasicos;
	}

	public void setDatosBasicos(NIBPF3010Bean datosBasicos) {
		this.datosBasicos = datosBasicos;
	}

	public String getNroIdentificacion() {
		return nroIdentificacion;
	}

	public void setNroIdentificacion(String nroIdentificacion) {
		this.nroIdentificacion = nroIdentificacion;
	}

	public SUMDSJVBean[] getCuentas() {
		return cuentas;
	}

	public void setCuentas(SUMDSJVBean[] cuentas) {
		this.cuentas = cuentas;
	}

	private boolean hasSequence(String needle, int tamanoSecuencia){
		for(int j = 0; j < secuencias.length; j++){
			for(int i = 0; i < secuencias[j].length()-tamanoSecuencia;i++){
				String x = secuencias[j].substring(i, i+tamanoSecuencia);
				
				if(needle.indexOf(x)>=0){
					return true;
				}
			}
		}
		
		return false;
	}
	
	public boolean expiracionContrasena(String canal, Integer dias){
		codigoError = "";
		descripcionError = "";
		
		if("4".equals(canal)){
			if(dias==null){
				codigoError = "37905";
				descripcionError = "La expiracion no puede ser vacía";				
			} else if(dias != 30 && dias != 60 && dias != 90){
				codigoError = "87601";
				descripcionError = "La cantidad de días de expiración debe ser 30, 60 o 90";
			}
		} else if("1".equals(canal)){
			if(dias==null){
				codigoError = "37905";
				descripcionError = "La expiracion no puede ser vacía";				
			} else if(dias < 90){
				codigoError = "67829";
				descripcionError = "La cantidad de días de expiración debe ser mayor o igual que 90";
			}
		} else {
			codigoError = "96904";
			descripcionError = "Canal inválido";
		}
		
		if(!"".equals(codigoError)){
			return false;
		} else {
			return true;
		}
	}
	
	public boolean contrasena(String canal, String contrasena){
		codigoError = "";
		descripcionError = "";
		
		if("4".equals(canal) || "2".equals(canal)){
			if(contrasena==null || "".equals(contrasena)){
				codigoError = "37905";
				descripcionError = "La contraseña no puede ser vacía";				
			} else if(contrasena.length()<8){
				codigoError = "48081";
				descripcionError = "La contraseña debe tener más de 8 caracteres";
			} else if(contrasena.length()>12){
				codigoError = "53368";
				descripcionError = "La contraseña debe tener menos de 12 caracteres";
			} else if(hasSequence(contrasena,3)){
				codigoError = "75302";
				descripcionError = "No se aceptan secuencias";
			} else if(Pattern.matches("^(.)\\1\\1+", contrasena)){
				codigoError = "68087";
				descripcionError = "No se aceptan repeticiones";
			} else if(!Pattern.matches("^[a-zA-Z0-9 \\!\\@\\.\\$\\*\\^\\{\\}\\+\\-]*$", contrasena)){
				codigoError = "45908";
				descripcionError = "Caracter(es) inválidos";
			} else if(!Pattern.matches("[0-9]+", contrasena)){
				codigoError = "85154";
				descripcionError = "Introduzca por lo menos un número";				
			} else if(!Pattern.matches("[a-zA-Z]+", contrasena)){
				codigoError = "85154";
				descripcionError = "Introduzca por lo menos una letra";				
			}
		} else if("1".equals(canal)){
			if(contrasena==null || "".equals(contrasena)){
				codigoError = "37905";
				descripcionError = "La contraseña no puede ser vacía";				
			} else if(contrasena.length()!=4){
				codigoError = "82454";
				descripcionError = "La contraseña debe ser de 4 caracteres";
			} else if(!Pattern.matches("^\\d{4}$", contrasena)){
				codigoError = "49608";
				descripcionError = "La contraseña debe ser numérica";
			} else if(hasSequence(contrasena,4)){
				codigoError = "75302";
				descripcionError = "No se aceptan secuencias";
			} else if(Pattern.matches("^(.)\\1\\1+", contrasena)){
				codigoError = "68087";
				descripcionError = "No se aceptan repeticiones";
			} else if(nroIdentificacion != null && contrasena.indexOf(nroIdentificacion.trim().substring(0, 4))>=0){
				codigoError = "73910";
				descripcionError = "No se aceptan los primeros cuatro números de la cédula en la clave";
			} else if(nroIdentificacion != null && contrasena.indexOf(nroIdentificacion.trim().substring(nroIdentificacion.trim().length()-4))>=0){
				codigoError = "39338";
				descripcionError = "No se aceptan los últimos cuatro números de la cédula en la clave";				
			}else if(datosBasicos != null && datosBasicos.getNROCELULAR() != null && contrasena.indexOf(datosBasicos.getNROCELULAR().substring(0,4))>=0){
				codigoError = "72070";
				descripcionError = "No se aceptan los primeros cuatro números del celular en la clave";
			} else if(datosBasicos != null && datosBasicos.getNROCELULAR() != null && contrasena.indexOf(datosBasicos.getNROCELULAR().substring(datosBasicos.getNROCELULAR().length()-4))>=0){
				codigoError = "26721";
				descripcionError = "No se aceptan los últimos cuatro números del celular en la clave";				
			} else if(datosBasicos != null && datosBasicos.getNROFAX() != null && contrasena.indexOf(datosBasicos.getNROFAX().substring(0,4))>=0){
				codigoError = "83443";
				descripcionError = "No se aceptan los primeros cuatro números del fax en la clave";
			} else if(datosBasicos != null && datosBasicos.getNROFAX() != null  && contrasena.indexOf(datosBasicos.getNROFAX().substring(datosBasicos.getNROFAX().length()-4))>=0){
				codigoError = "11134";
				descripcionError = "No se aceptan los últimos cuatro números del fax en la clave";				
			} else if(datosBasicos != null && datosBasicos.getNROHAB() != null  && contrasena.indexOf(datosBasicos.getNROHAB().substring(0,4))>=0){
				codigoError = "48018";
				descripcionError = "No se aceptan los primeros cuatro números de habitación en la clave";
			} else if(datosBasicos != null && datosBasicos.getNROHAB() != null  && contrasena.indexOf(datosBasicos.getNROHAB().substring(datosBasicos.getNROHAB().length()-4))>=0){
				codigoError = "45076";
				descripcionError = "No se aceptan los últimos cuatro números de habitación en la clave";				
			} else if(datosBasicos != null && datosBasicos.getNROOFICINA() != null  && contrasena.indexOf(datosBasicos.getNROOFICINA().substring(0,4))>=0){
				codigoError = "48618";
				descripcionError = "No se aceptan los primeros cuatro números de oficina en la clave";
			} else if(datosBasicos != null && datosBasicos.getNROOFICINA() != null  && contrasena.indexOf(datosBasicos.getNROOFICINA().substring(datosBasicos.getNROOFICINA().length()-4))>=0){
				codigoError = "45077";
				descripcionError = "No se aceptan los últimos cuatro números de oficina en la clave";				
			}
			
			if("".equals(codigoError) && datosBasicos != null && datosBasicos.getFECHANAC() != null && datosBasicos.getFECHANAC().trim().length()==8){
				String dd = datosBasicos.getFECHANAC().substring(0,2);
				String mm = datosBasicos.getFECHANAC().substring(2,4);
				String yy = datosBasicos.getFECHANAC().substring(6,8);
				
				if(
					contrasena.indexOf(dd+mm)>=0 ||
					contrasena.indexOf(mm+dd)>=0 ||
					contrasena.indexOf(dd+yy)>=0 ||
					contrasena.indexOf(yy+dd)>=0 ||
					contrasena.indexOf(mm+yy)>=0 ||
					contrasena.indexOf(yy+mm)>=0
				){
					codigoError = "26787";
					descripcionError = "No se acepta la fecha de nacimiento en la clave";					
				}
			}
		} else {
			codigoError = "96904";
			descripcionError = "Canal inválido";
		}
		
		if(!"".equals(codigoError)){
			return false;
		} else {
			return true;
		}
	}
}
