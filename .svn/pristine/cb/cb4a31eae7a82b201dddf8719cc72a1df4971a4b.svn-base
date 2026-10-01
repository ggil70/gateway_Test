package com.activo.gateway.sockets;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;


public class SocketsConn {
	
	private static int port;
	private static String ip;
	
	public SocketsConn(){
		inicializarValores();
	} 
	
	private static void inicializarValores() {
		LoadConfig loader= new LoadConfig();
		try {
			//ip=loader.getPropValue("ip");
			//port=Integer.parseInt(loader.getPropValue("port"));
			
			ip="10.3.1.7";
			port=49070;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	  public String envio(String rafaga){

	        Socket kkSocket = null;
	        InputStream inputStream1 = null;
	        OutputStream outputStream1 = null;
	        DataOutputStream dataOutputStream1 = null;
	        DataInputStream dis = null;
	        InputStreamReader InputStreamReader1 = null;
	        BufferedReader BufferedReader1 = null;
	        
	        String fromServer = "";
	        String fromServeraux = "";
	                
	        try {
				kkSocket = new Socket(ip, port);
		        kkSocket.setSoTimeout(60000);
		        kkSocket.setSoLinger(false, 0);
		                
		        outputStream1 = kkSocket.getOutputStream();
		        dataOutputStream1 = new DataOutputStream(outputStream1);
		        
		        inputStream1 = kkSocket.getInputStream();
	            InputStreamReader1 = new InputStreamReader(inputStream1);
	            BufferedReader1 = new BufferedReader(InputStreamReader1);
	            dis=new DataInputStream(inputStream1);
	            
	            dataOutputStream1.write(rafaga.getBytes());
	            
	            fromServeraux=dis.readUTF();
	            fromServer = (new StringBuilder(String.valueOf(fromServeraux))).toString();
	            
				kkSocket.shutdownInput();
	            kkSocket.shutdownOutput();
	            BufferedReader1.close();
	            dataOutputStream1.close();
	            dis.close();
	            kkSocket.close();
	            
			} catch (UnknownHostException e) {
				e.printStackTrace();
			} catch (IOException e) {
	 			e.printStackTrace();
			}finally{
	            try {
	            	if(!kkSocket.isClosed()){
					kkSocket.shutdownInput();
		            kkSocket.shutdownOutput();
		            kkSocket.close();
	            	}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}	
	        return fromServer;
	    }
	
	  
	  
	  public String envio2(String rafaga){

	        Socket kkSocket = null;
	        InputStream inputStream1 = null;
	        OutputStream outputStream1 = null;
	        DataOutputStream dataOutputStream1 = null;
	        DataInputStream dis = null;
	        InputStreamReader InputStreamReader1 = null;
	        BufferedReader BufferedReader1 = null;
	        
	        String fromServer = "";
	        String fromServeraux = "";
	                
	        try {
				kkSocket = new Socket(ip, port);
		        kkSocket.setSoTimeout(60000);
		        kkSocket.setSoLinger(false, 0);
		                
		        outputStream1 = kkSocket.getOutputStream();
		        dataOutputStream1 = new DataOutputStream(outputStream1);
		        
		        inputStream1 = kkSocket.getInputStream();
	            InputStreamReader1 = new InputStreamReader(inputStream1);
	            BufferedReader1 = new BufferedReader(InputStreamReader1);
	            dis=new DataInputStream(inputStream1);
	            
	            dataOutputStream1.write(rafaga.getBytes());
	            
	            fromServeraux=dis.readLine();  
	            fromServer = (new StringBuilder(String.valueOf(fromServeraux))).toString();
	            
				kkSocket.shutdownInput();
	            kkSocket.shutdownOutput();
	            BufferedReader1.close();
	            dataOutputStream1.close();
	            dis.close();
	            kkSocket.close();
	            
			} catch (UnknownHostException e) {
				e.printStackTrace();
			} catch (IOException e) {
	 			e.printStackTrace();
			}finally{
	            try {
	            	if(!kkSocket.isClosed()){
					kkSocket.shutdownInput();
		            kkSocket.shutdownOutput();
		            kkSocket.close();
	            	}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}	
	        return fromServer;
	    }
	  public String envioPruebaXXX(String rafaga){

	        Socket kkSocket = null;
	        InputStream inputStream1 = null;
	        OutputStream outputStream1 = null;
	        DataOutputStream dataOutputStream1 = null;
	        DataInputStream dis = null;
	        InputStreamReader InputStreamReader1 = null;
	        BufferedReader BufferedReader1 = null;
	        
	        String fromServer = "";
	        String fromServeraux = "";
	                
	        try {
				kkSocket = new Socket(ip, port);
		        kkSocket.setSoTimeout(60000);
		        kkSocket.setSoLinger(false, 0);
		                
		        outputStream1 = kkSocket.getOutputStream();
		        dataOutputStream1 = new DataOutputStream(outputStream1);
		        
		        inputStream1 = kkSocket.getInputStream();
		        
		        //System.out.println("tama;o: "+kkSocket.getReceiveBufferSize());
	            InputStreamReader1 = new InputStreamReader(inputStream1);
	            BufferedReader1 = new BufferedReader(InputStreamReader1);
	            dis=new DataInputStream(inputStream1);
	            
	            dataOutputStream1.write(rafaga.getBytes());
	            
	            int c=0;
	            String crudo="";
	            do{
	            	c=inputStream1.read();
	            	crudo+=(char)c;
	            }while(inputStream1.available()>0);
	                
	            //inputStream1.close();
	            fromServer=crudo;
	            //baos.flush();
	            //baos.close();
				kkSocket.shutdownInput();
	            kkSocket.shutdownOutput();
	            BufferedReader1.close();
	            dataOutputStream1.close();
	            dis.close();
	            kkSocket.close();
	            
	            
			} catch (UnknownHostException e) {
				e.printStackTrace();
			} catch (IOException e) {
	 			e.printStackTrace();
			}finally{
	            try {
	            	if(!kkSocket.isClosed()){
					kkSocket.shutdownInput();
		            kkSocket.shutdownOutput();
		            kkSocket.close();
	            	}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}	
	        return fromServer;
	    }
	
}
