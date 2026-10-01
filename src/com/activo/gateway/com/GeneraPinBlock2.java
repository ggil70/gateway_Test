package com.activo.gateway.com;

import java.net.*;
import java.io.*;
 


public class GeneraPinBlock2{


    public static void main(String[] args) throws IOException {

    //InputStreamReader isr=new InputStreamReader(System.in);
    //BufferedReader br= new BufferedReader(isr);

// PIN en claro de longitud 4
    String pin = "";
// Tarjeta del cliente
    String pan = "";
// Clave de trabajo de longitud doble encriptada bajo la parent configurada
    String kwp = "";
// Entradas via lote
    kwp = args[0]; 
    pan = args[1];
    pin = args[2];

    System.out.println(args[0]);       
    System.out.println(args[1]);       
    System.out.println(args[2]);       

    //System.out.println("Introduzca el Pan de la Tarjeta = " + " pulse RETURN");
    //pan = br.readLine();

    //System.out.println("Introduzca su PIN = " + " pulse RETURN");
    //pin = br.readLine();


    String vale = calculapinblock2(pan, pin, kwp);
    System.out.println(vale);       

  }
    private static String calculapinblock2 (String pan, String pin, String kwp)
   
    {

// KEK utilizada como parent para la KWP de longitud doble
     Block kek1 = new Block("0123456789ABCDEF");
     Block kek2 = new Block("0123456789ABCDEF");

     Block kwp_b1 = new Block(kwp.substring(0,16));
     Block kwp_b2 = new Block(kwp.substring(16,32));


// Desencripta la kwp
     kwp_b1 = Utils.tripledesDecrypt ( kwp_b1, kek1, kek2, kek1);
     kwp_b2 = Utils.tripledesDecrypt ( kwp_b2, kek1, kek2, kek1);

//Se genera el PinBlock y se encripta

        String pin_block4 = "0" + "4" + pin + Convert.resize("", 8 - (4 - 4), 'F', false) + "FF";
        String pan_block = null;
        pan_block = "0000" + pan.substring(pan.length() - 13, pan.length() - 1);
 
        String iso0_block = "";
        byte pin_bytes[] = Convert.fromHexDataToBinData(pin_block4.getBytes());
        byte pan_bytes[] = Convert.fromHexDataToBinData(pan_block.getBytes());
        byte iso0_bytes[] = new byte[8];
        for(int j = 0; j < 8; j++)
            iso0_bytes[j] = (byte)(pin_bytes[j] ^ pan_bytes[j]);

        iso0_block = new String(Convert.fromBinDataToHexData(iso0_bytes));
        //System.out.println (iso0_block );
       Block iso0_block_1 = new Block(iso0_block );

       Block encrypted_iso0_blockA = Utils.tripledesEncrypt ( iso0_block_1, kwp_b1, kwp_b2, kwp_b1); 

       String encrypted_pin_block4 = encrypted_iso0_blockA.toString();
       return encrypted_pin_block4;
       // Se termina la generacion del Pin Block

    }

 }
 
 //FK
//Key length [1,2,3]: 1
//Key Type: 000
//Key Scheme: 0
//Component type [X,H,E,S]: X
//Enter number of components (2-9): 2
//Enter component #1: A4C27C944C5237C7
//Enter component #2: 0000000000000000
//Encrypted key: 306DCECD489A126C 
//Key check value: 96C3 78
//Key (clear): B004403225DCFD62
//Check value: 5DD4CDF96A849614
//=== [BU],   ends 22:00:28.117 =======
