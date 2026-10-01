package com.activo.gateway.util;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import org.apache.axis.encoding.Base64;
import org.apache.log4j.Logger;

public class Crypto{

	private static final Logger log = Logger.getLogger(Crypto.class);
	
	private static Parametros p = new Parametros();
	
	/**
	 * Encriptar una cadena
	 * 
	 * @param input
	 * @return {@link String}
	 */
	public static String crypt(String input){

		String key = p.getString("clave_encriptar");
		
	    byte[] crypted = null;
	    
	    byte[] keyByte = paddingByte(key);

	    try{
	        
	        SecretKeySpec skeySpec = new SecretKeySpec(keyByte, "AES");
	        
	        Cipher cipher = Cipher.getInstance("AES/ECB/NoPadding");
	        
	        cipher.init(Cipher.ENCRYPT_MODE, skeySpec);
	        
	        crypted = cipher.doFinal(paddingByte(input));
	        
	    } catch(Exception e){
	    	log.error("Error al tratar de encriptar - " + e.getMessage());
	    }
	    
	    return Base64.encode(crypted);
	}
	
	/**
	 * Desencriptar una cadena
	 * 
	 * @param input
	 * @return {@link String}
	 */
	public static String decrypt(String input){

		String key = p.getString("clave_encriptar");
		
	    byte[] output_temp = null;

	    byte[] keyByte = paddingByte(key);
	    
	    try{
	    	
	        SecretKeySpec skeySpec = new SecretKeySpec(keyByte, "AES");
	        
	        Cipher cipher = Cipher.getInstance("AES/ECB/NoPadding");
	        
	        cipher.init(Cipher.DECRYPT_MODE, skeySpec);
	        
	        output_temp = cipher.doFinal(Base64.decode(input));
	        
	    } catch(Exception e){
	    	log.error("Error al tratar de desencriptar - " + e.getMessage());
	    }
	    
	    String output = new String(output_temp);
	    
	    return output.trim();
	}
	
	
	/**
	 * Realiza el padding de una cadena para que sea multiplo de 16 y 
	 * devuelve el arreglo de bytes de la cadena.
	 * 
	 * @param cadena
	 * @return
	 */
	private static byte[] paddingByte(String cadena){
		
		StringBuffer str = new StringBuffer(cadena);
		
		while( (str.length()%16) != 0){
			str.append("\0");
		}
		
		byte[] arrayByte = str.toString().getBytes();

		//System.out.println("'" + cadena + "' - New string size: " + str.toString().length());
		return arrayByte;
	}
	
	
}
