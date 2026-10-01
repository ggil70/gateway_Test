package com.activo.gateway.com;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.net.URL;
import java.security.PrivateKey;

import javax.crypto.Cipher;

import com.activo.gateway.sockets.LoadConfig;
import com.activo.gateway.sockets.MessageContext;
import com.activo.gateway.sockets.MessageRecord;
import com.activo.gateway.sockets.SocketsConn;
import com.activo.gateway.dibs.messages.CBPR00301Message;
import com.activo.gateway.dibs.messages.CBPR00401Message;
import com.activo.gateway.dibs.messages.CBPR00601Message;
import com.activo.gateway.model.Respuestas;
import com.activo.gateway.model.Tarjetas;
import com.activo.gateway.util.Parametros;

public class Helper {
	
	public static String pinblock;
	public static String plainText;
	
	public static int port;
	public static String ip;

	public static void main(String[] args){
	
		String pin="1234";
		String canal="04";
		String idCliente="V015051329";	//cliente  1282994  Tiene dos tarjeta
		//String idCliente="V010157156";cliente 83398  	//No tiene tarjetas
		//String idCliente="V012624295";	//No tiene tarjetas
		//String idCliente="V012140902"; //La de Silmar tiene una tarjeta
		
		inicializarValores();
	
		//Tarjetas tarjetas=getTarjetas(idCliente, canal);
		//System.out.println("Respuesta: "+tarjetas.toString());

		//String tarjeta1= tarjetas.getTarjeta1();
		//String tarjeta2= tarjetas.getTarjeta2();
		
		CBPR00301Message KWPCifrada =getKWPCifrada();
		System.out.println("Respuesta; "+KWPCifrada.toString());
		
		//String pim=Generapinblock("1111222233334444555", pin);
		//System.out.println("Pin Block Resultante: "+pim);
		
		//CBPR00401Message respuestaF = validarPinBlock("04",pim, idCliente, tarjeta1);
		//System.out.println("Respuesta: "+respuestaF);
	}

	//Genera el PinBlock Cifrado con TripleDes
    public static String Generapinblock(String pan, String pin){
    	
		inicializarValores();
		CBPR00301Message respuesta= new CBPR00301Message();
		try {
			respuesta =getKWPCifrada();
		//respuesta.setTRMERR03("0");
		}catch(Exception e) {
			System.out.println("Excepcion: "+e);
		}
    	if(!respuesta.getTRMERR03().equals("0")){
    		return "ERROR";
    	}else{
    	
		String kwpCifrada = respuesta.getTRMCRIP03().trim();
		
		System.out.println("Llave recibida: "+kwpCifrada);
		
		Helper helper= new Helper();
		URL url=helper.getClass().getClassLoader().getResource("clave.key");
		String u=url.toString().substring(6);
		URL url2=helper.getClass().getClassLoader().getResource("private.key");
		String u2=url2.toString().substring(6);	
		
        ObjectInputStream inputStream = null;
        try{
        	//File testfile=new File("clave.key");
            File testfile= new File(u);
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(testfile));
            byte cipherText[] = (byte[])(byte[])ois.readObject();
            ois.close();
            //String PRIVATE_KEY_FILE = "private.key";
            String PRIVATE_KEY_FILE = u2;
            inputStream = new ObjectInputStream(new FileInputStream(PRIVATE_KEY_FILE));
            PrivateKey privateKey = (PrivateKey)inputStream.readObject();
            plainText = decrypt(cipherText, privateKey);
            System.out.println((new StringBuilder()).append("Decrypted Text: ").append(plainText).toString());
        }catch(Exception e){
            e.printStackTrace();
            return "ERROR";
        }
        Block kek = new Block(plainText.substring(0, 16));
        Block kek2 = new Block(plainText.substring(16, 32));
        System.out.println((new StringBuilder()).append("kwp: ").append(kwpCifrada).append(" ").append(pan).toString());
        Block key1 = new Block(kwpCifrada.substring(0, 16));
        Block kwp_b = Utils.tripledesDecrypt(key1, kek, kek2, kek);
        Block key2 = new Block(kwpCifrada.substring(16, 32));
        Block kwp_b2 = Utils.tripledesDecrypt(key2, kek, kek2, kek);
        System.out.println((new StringBuilder()).append("kwp: ").append(kwp_b).append(" ").append(kwp_b2).toString());
        String pin_block4 = (new StringBuilder()).append("04").append(pin).append(Convert.resize("", 8, 'F', false)).append("FF").toString();
        String pan_block = null;
        pan_block = (new StringBuilder()).append("0000").append(pan.substring(pan.length() - 13, pan.length() - 1)).toString();
        String iso0_block = "";
        byte pin_bytes[] = Convert.fromHexDataToBinData(pin_block4.getBytes());
        byte pan_bytes[] = Convert.fromHexDataToBinData(pan_block.getBytes());
        byte iso0_bytes[] = new byte[8];
        
        for(int j = 0; j < 8; j++)
            iso0_bytes[j] = (byte)(pin_bytes[j] ^ pan_bytes[j]);

        iso0_block = new String(Convert.fromBinDataToHexData(iso0_bytes));
        Block iso0_block_1 = new Block(iso0_block);
        Block encrypted_iso0_blockA = Utils.tripledesEncrypt(iso0_block_1, kwp_b, kwp_b2, kwp_b);
        pinblock = encrypted_iso0_blockA.toString();
        System.out.println(pinblock);
        try {
			inputStream.close();
		}catch (IOException e) {
			e.printStackTrace();
			return "ERROR";
		}
        return pinblock;
    }
    }
    
    //Descifra la KEK privada
    public static String decrypt(byte text[], PrivateKey kek){
        byte dectyptedText[] = null;
        try{
            Cipher cipher = Cipher.getInstance("RSA");
            cipher.init(2, kek);
            dectyptedText = cipher.doFinal(text);
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return new String(dectyptedText);
    }

    //Valida el PinBlock resultante contra el AS400
	public static CBPR00401Message validarPinBlock(String canal, String pinB, String idCliente, String pan) {
		
		inicializarValores();
		
		Socket s = null;
        MessageRecord newmessage = null;
        CBPR00401Message respuesta = new CBPR00401Message();
        try {    
            MessageContext mc;
            s = null;
            mc = null;
            try {
            	s = new Socket(ip, port);
            	s.setSoTimeout(60000);
                
                mc = new MessageContext(new DataInputStream(new BufferedInputStream(s.getInputStream())), new DataOutputStream(new BufferedOutputStream(s.getOutputStream())), "com.activo.gateway.dibs.messages");
            } 
            catch (Exception ex) {
                    System.out.println("Read error " + ex);
                    respuesta.setTRMDSC04("Error de comunicacion con el host");
                    respuesta.setTRMERR04("9999");
                    return respuesta;
            }
            try {
            	respuesta = (CBPR00401Message) mc.getMessageRecord("CBPR00401");
            	respuesta.setContext(mc);
            	respuesta.setTRMCAN04("04");
            	respuesta.setTRMTRN04("001");
            	respuesta.setTRMIDN04(idCliente);
            	respuesta.setTRMPAN04(pan);
            	respuesta.setTRMPBL04(pinB);
                
            	System.out.println("Rafaga de salida: "+respuesta.toString());
            	
            	respuesta.send();
                
                System.out.println("Solicitud de reset enviada!"); 
                respuesta.destroy();
            } 
            catch (Exception ex) {
                ex.printStackTrace();
                System.out.println("Error de Comunicacion " + ex);
                respuesta.setTRMDSC04("Error de comunicacion con el host");
                respuesta.setTRMERR04("9999");
                return respuesta;
            }
            try{
	            newmessage =  mc.receiveMessage();
	            System.out.println("Rafaga de respuesta: "+respuesta.toString());
	            
	            return (CBPR00401Message) newmessage;     
	        }catch(IOException ex){
	        	System.out.println("Error de Comunicacion " + ex);
	            respuesta.setTRMDSC04("Error de comunicacion con el host");
	            respuesta.setTRMERR04("9999");
	            return respuesta;	        	
	        }
        } catch (Exception ex) {
        	System.out.println("Error de Comunicacion " + ex);
            respuesta.setTRMDSC04("Error de comunicacion con el host");
            respuesta.setTRMERR04("9999");
            return respuesta;
        }finally{
        	if(s!=null){
            	try {
            		if(!s.isClosed()){
            			s.close();
            		}
				} catch (IOException e) {
					e.printStackTrace();
				}
        	}
        }
	}
	
	
	
	//Metodo para la conexion con el socket IBS
	public static Tarjetas getTarjetas(String idCliente, String canal){
		
		inicializarValores();
			
		Socket s = null;
        MessageRecord newmessage = null;
        CBPR00601Message respuesta = new CBPR00601Message();
        Tarjetas t= new Tarjetas();
        try {    
            MessageContext mc;
            s = null;
            mc = null;
            try {
            	s = new Socket(ip, port);
            	System.out.println("Adress: "+ip+", "+port);
            	s.setSoTimeout(60000);
                
                mc = new MessageContext(new DataInputStream(new BufferedInputStream(s.getInputStream())), new DataOutputStream(new BufferedOutputStream(s.getOutputStream())), "com.activo.gateway.dibs.messages");
            }catch (Exception ex) {
                    System.out.println("Read error " + ex);
                    t.setDescResp("Error de comunicacion con el host");
                    t.setCodResp("9999");
                    return t;
            }
            try {
            	respuesta = (CBPR00601Message) mc.getMessageRecord("CBPR00601");
            	respuesta.setContext(mc);
            	respuesta.setTRMCAN06(canal);
            	respuesta.setTRMTRN06("001");
            	respuesta.setTRMIDN06(idCliente);
                
            	respuesta.send();
                
                System.out.println("Solicitud de tarjetas Enviada!"); 
                respuesta.destroy();
            } 
            catch (Exception ex) {
                ex.printStackTrace();
                System.out.println("Error de Comunicacion " + ex);
                t.setDescResp("Error de comunicacion con el host");
                t.setCodResp("9999");
                return t;
            }           
            try{
	            newmessage =  mc.receiveMessage();
	            System.out.println("Formato: "+newmessage.getFormatName());
	            respuesta= (CBPR00601Message) newmessage;
                t.setDescResp(respuesta.getTRMDSC06().trim());
                t.setCodResp(respuesta.getTRMERR06());
                t.setTarjeta1(respuesta.getTRMTD106());
                t.setTarjeta2(respuesta.getTRMTD206());
                return t;
            }catch(IOException ex){
            	System.out.println("Error de Comunicacion " + ex);
                t.setDescResp("Error de comunicacion con el host");
                t.setCodResp("9999");
                return t;
            }
            
        } catch (Exception ex) {
        	System.out.println("Error de Comunicacion " + ex);
            t.setDescResp("Error de comunicacion con el host");
            t.setCodResp("9999");
            return t;
        }finally{
        	if(s!=null){
            	try {
            		if(!s.isClosed()){
            			s.close();
            		}
				} catch (IOException e) {
					e.printStackTrace();
				}
        	}
        }
	}
	
	
	
	//Obtiene la llave cifrada del AS/400
	public static CBPR00301Message getKWPCifrada(){
		
		inicializarValores();
		
		Socket s = null;
        MessageRecord newmessage = null;
        CBPR00301Message respuesta = new CBPR00301Message();
        try {    
            MessageContext mc;
            s = null;
            mc = null;
            try {
            	s = new Socket(ip, port);
            	s.setSoTimeout(60000);
                
                mc = new MessageContext(new DataInputStream(new BufferedInputStream(s.getInputStream())), new DataOutputStream(new BufferedOutputStream(s.getOutputStream())), "com.activo.gateway.dibs.messages");
            } 
            catch (Exception ex) {
                    System.out.println("Read error " + ex);
                    respuesta.setTRMDSC03("Error de comunicacion con el host");
                    respuesta.setTRMERR03("9999");
                    return respuesta;
            }
            try {
            	respuesta = (CBPR00301Message) mc.getMessageRecord("CBPR00301");
            	respuesta.setContext(mc);
            	respuesta.setTRMCAN03("04");
            	respuesta.setTRMTRN03("001");
                
            	respuesta.send();
                
                System.out.println("Solicitud de llave enviada!"); 
                respuesta.destroy();
            } 
            catch (Exception ex) {
                ex.printStackTrace();
                System.out.println("Error de Comunicacion " + ex);
                respuesta.setTRMDSC03("Error de comunicacion con el host");
                respuesta.setTRMERR03("9999");
                return respuesta;
            }
            try{
	            newmessage =  mc.receiveMessage();
	            System.out.println("Formato: "+newmessage.getFormatName());
	            
	            return (CBPR00301Message) newmessage;     
	        }catch(IOException ex){
	        	System.out.println("Error de Comunicacion " + ex);
	            respuesta.setTRMDSC03("Error de comunicacion con el host");
	            respuesta.setTRMERR03("9999");
	            return respuesta;	        	
	        }
        } catch (Exception ex) {
        	System.out.println("Error de Comunicacion " + ex);
            respuesta.setTRMDSC03("Error de comunicacion con el host");
            respuesta.setTRMERR03("9999");
            return respuesta;
        }finally{
        	if(s!=null){
            	try {
            		if(!s.isClosed()){
            			s.close();
            		}
				} catch (IOException e) {
					e.printStackTrace();
				}
        	}
        }
	}
	
	
	private static void inicializarValores() {
		//LoadConfig loader= new LoadConfig();
                Parametros params = new Parametros();
		try {
			//ip=loader.getPropValue("ip");
                        ip=params.getString("ip");
			//port=Integer.parseInt(loader.getPropValue("port"));
                        port=params.getInt("port8");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
