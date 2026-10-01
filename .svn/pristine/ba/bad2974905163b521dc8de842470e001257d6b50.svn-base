import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.sql.Timestamp;
import java.util.GregorianCalendar;

import com.activo.gateway.util.Crypto;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		
		//INVALRIF();
		//NIBPF3000();
		//NIBPF3010();
		//NIBPF3020();
		//NIBPF3030();
		//NIBPF3040();
		//NIBPF3050();
		//CDSDSJV();
		//INTRFDSJV();
		//CUENTACCC();
		//NIB096602();
		//EDL090001();
		//NIB090501();
		//encriptacion();
		//NIB2090PF();
		//ECC051001();
		//IIN091801();
		//IN097001();
		//IN097002();
		//IN097101();
                STMRDSJV5();
		
	}
	
	public static void ECC051001() throws Exception {


		//StringBuilder message = new StringBuilder("NIBPF3010                                                                                                                                                                                                                                                                                                                                                                                                                                   006000444712                         2");

		StringBuilder message = new StringBuilder();

		message.append(
				"ECC051001                                          2000114136");

		while (message.length() < 192) {
			try {
				Socket s = new Socket("10.0.0.6", 7405);

				DataInputStream in = new DataInputStream(
						new BufferedInputStream(s.getInputStream()));

				DataOutputStream out = new DataOutputStream(
						new BufferedOutputStream(s.getOutputStream()));

				out.writeShort(message.length());

				out.write(message.toString().getBytes());

				out.flush();
				int length = in.readShort();

				byte[] messagebytes = new byte[length];

				in.readFully(messagebytes);
				System.out.println("bien con " + message.length());

				System.out.println(message);

				System.out.println(new String(messagebytes));

				in.close();
				out.close();

				s.close();
				break;
			} catch (Exception ex) {
				System.out.println("mal: " + message.length());
				message.append(' ');
				//message.deleteCharAt(message.length()-1).append(" 1");
			}
		}

	}
	
	public static void NIB2090PF() throws Exception {


		//StringBuilder message = new StringBuilder("NIBPF3010                                                                                                                                                                                                                                                                                                                                                                                                                                   006000444712                         2");

		StringBuilder message = new StringBuilder();

		message.append(
				"NIB2090PF LES150772  0001V007945509     123456789");

		while (message.length() < 250) {
			try {
				Socket s = new Socket("10.0.0.6", 7406);

				DataInputStream in = new DataInputStream(
						new BufferedInputStream(s.getInputStream()));

				DataOutputStream out = new DataOutputStream(
						new BufferedOutputStream(s.getOutputStream()));

				out.writeShort(message.length());

				out.write(message.toString().getBytes());

				out.flush();
				int length = in.readShort();

				byte[] messagebytes = new byte[length];

				in.readFully(messagebytes);
				System.out.println("bien con " + message.length());

				System.out.println(message);

				System.out.println(new String(messagebytes));

				in.close();
				out.close();

				s.close();
				break;
			} catch (Exception ex) {
				System.out.println("mal: " + message.length());
				message.append(' ');
				//message.deleteCharAt(message.length()-1).append(" 1");
			}
		}

	}
	
	public static void encriptacion() throws Exception {

		String source = "logintest1";
		
		String encriptado = Crypto.crypt(source);
		
		System.out.println(encriptado);
		
		System.out.println(Crypto.decrypt("1Xz4YNNhs9tIgnG5J/Ch7A=="));
	}
	
	
	public static void NIB090501() throws Exception{



		StringBuilder message = new StringBuilder(100);



		message.append("NIB090501 ");

		message.append("0006931448");

		message.append("49663816012819730000");

		message.append("000000000000");

		message.append("0000000000");

		message.append("0000");   

		message.append("                                     ");                      



		System.out.println(message.length());
		System.out.println(message);

		while (message.length() < 105) {
			try {
				Socket s = new Socket("10.0.0.6", 7400);



				DataInputStream in   = new DataInputStream(new BufferedInputStream(s.getInputStream()));

				DataOutputStream out = new DataOutputStream(new BufferedOutputStream(s.getOutputStream()));



				out.writeShort(message.length());

				out.write(message.toString().getBytes());

				out.flush();



				int length = in.readShort();

				byte[] messagebytes = new byte[length];

				in.readFully(messagebytes);

				System.out.println("bien con " + message.length());

				System.out.println(message);
				System.out.println(new String(messagebytes));
				
				while(true){
					length = in.readShort();
					
					messagebytes = new byte[length];
					
					in.readFully(messagebytes);
					System.out.println(new String(messagebytes));
				}

			} catch (Exception ex) {
				System.out.println("mal: "+message.length());
				message.append(' ');
			}
		}

}

	
	/*public static void NIB090501() throws Exception {

		StringBuilder message = new StringBuilder(100);

		while (message.length() < 60)
			message.append(' ');

		/*message.replace(0, 10, "NIB090501  ");

		message.replace(10, 10, "0012389732");

		message.replace(20, 20, "00005401334212340738");
		
		 message.append("NIB090501 ");

         message.append("J302809231");

         message.append("62753400021542030480");

         message.append("000000000000");

         message.append("0000000000");

         message.append("0000");   

         message.append("                                     ");     



		System.out.println(message.length());

		System.out.println(message);

		Socket s = new Socket("10.0.0.6", 7400);

		DataInputStream in = new DataInputStream(new BufferedInputStream(
				s.getInputStream()));

		DataOutputStream out = new DataOutputStream(new BufferedOutputStream(
				s.getOutputStream()));

		out.writeShort(message.length());

		out.write(message.toString().getBytes());

		out.flush();

		int length = in.readShort();

		byte[] messagebytes = new byte[length];

		in.readFully(messagebytes);

		System.out.println(new String(messagebytes));

	}*/
	
	public static void EDL090001() throws Exception {
		StringBuilder message = new StringBuilder("EDL090001 0010826059                                0210000008035");
		while (message.length() < 220) {
			message.append(' ');
		}
		
		while (message.length() < 300) {
			try {
				Socket s = new Socket("10.0.0.6", 7401);
		
				DataInputStream in = new DataInputStream(
						new BufferedInputStream(s.getInputStream()));
		
				DataOutputStream out = new DataOutputStream(
						new BufferedOutputStream(s.getOutputStream()));
		
				out.writeShort(message.length());
		
				out.write(message.toString().getBytes());
		
				out.flush();
		
				int length = in.readShort();
		
				byte[] messagebytes = new byte[length];
				
				in.readFully(messagebytes);
				System.out.println("bien con " + message.length());
		
				System.out.println(message);
		
				System.out.println(new String(messagebytes));
				
				while(true){
					length = in.readShort();
					
					messagebytes = new byte[length];
					
					in.readFully(messagebytes);
					System.out.println(new String(messagebytes));
				}
		/*
				in.close();
				out.close();
		
				s.close();
				break;*/
			} catch (Exception ex) {
				System.out.println("mal: "+message.length());
				message.append(' ');
			}
		}
	}
	
	public static void NIB096602() throws Exception {
		StringBuilder message = new StringBuilder("NIB096602");
		
		while (message.length() < 792) {
			try {
				Socket s = new Socket("10.0.0.6", 7400);
		
				DataInputStream in = new DataInputStream(
						new BufferedInputStream(s.getInputStream()));
		
				DataOutputStream out = new DataOutputStream(
						new BufferedOutputStream(s.getOutputStream()));
		
				out.writeShort(message.length());
		
				out.write(message.toString().getBytes());
		
				out.flush();
		
				int length = in.readShort();
		
				byte[] messagebytes = new byte[length];
				
				in.readFully(messagebytes);
				System.out.println("bien con " + message.length());
		
				System.out.println(message);
		
				System.out.println(new String(messagebytes));
		
				in.close();
				out.close();
		
				s.close();	
			} catch (Exception ex) {
				System.out.println("mal: "+message.length());
				message.append(' ');
			}
		}
	}

	public static void NIBPF3000() throws Exception {
		StringBuilder message = new StringBuilder("NIBPF3000 VEN000010546229");
	
		while (message.length() < 525) {
			message.append(' ');
		}
		
		while (message.length() < 526) {
			try {
				Socket s = new Socket("10.0.0.6", 7400);
		
				DataInputStream in = new DataInputStream(
						new BufferedInputStream(s.getInputStream()));
		
				DataOutputStream out = new DataOutputStream(
						new BufferedOutputStream(s.getOutputStream()));
		
				out.writeShort(message.length());
		
				out.write(message.toString().getBytes());
		
				out.flush();
				
				while(true){
			
					int length = in.readShort();
			
					byte[] messagebytes = new byte[length];
					
					in.readFully(messagebytes);
			
					System.out.println(new String(messagebytes));
				
				}
			} catch (Exception ex) {
				System.out.println("mal: "+message.length());
				message.append(' ');
			}
		}
	}

	public static void NIBPF3010() throws Exception {

		//StringBuilder message = new StringBuilder("NIBPF3010                                                                                                                                                                                                                                                                                                                                                                                                                                   006000444712                         2");
		
		StringBuilder message = new StringBuilder();
		
		message.append(
"NIBPF3010 VEN000012389732																																																																																																								                           1");

		while (message.length() < 700) {
			try {
				Socket s = new Socket("10.0.0.6", 7404);

				DataInputStream in = new DataInputStream(
						new BufferedInputStream(s.getInputStream()));

				DataOutputStream out = new DataOutputStream(
						new BufferedOutputStream(s.getOutputStream()));

				out.writeShort(message.length());

				out.write(message.toString().getBytes());

				out.flush();
				int length = in.readShort();

				byte[] messagebytes = new byte[length];

				in.readFully(messagebytes);
				System.out.println("bien con " + message.length());

				System.out.println(message);

				System.out.println(new String(messagebytes));

				in.close();
				out.close();

				s.close();
				break;
			} catch (Exception ex) {
				System.out.println("mal: " + message.length());
				message.append(' ');
				//message.deleteCharAt(message.length()-1).append(" 1");
			}
		}
	}

	public static void NIBPF3020() throws Exception {

		StringBuilder message = new StringBuilder("NIBPF3020 VEN000005299740");

		while (message.length() < 100) {
			try {
				Socket s = new Socket("10.0.0.6", 7400);

				DataInputStream in = new DataInputStream(
						new BufferedInputStream(s.getInputStream()));

				DataOutputStream out = new DataOutputStream(
						new BufferedOutputStream(s.getOutputStream()));

				out.writeShort(message.length());

				out.write(message.toString().getBytes());

				out.flush();
				int length = in.readShort();

				byte[] messagebytes = new byte[length];

				in.readFully(messagebytes);
				System.out.println("bien con " + message.length());

				System.out.println(message);

				System.out.println(new String(messagebytes));

				in.close();
				out.close();

				s.close();
				break;
			} catch (Exception ex) {
				System.out.println("mal: " + message.length());

				message.append(' ');
			}
		}
	}

	public static void NIBPF3030() throws Exception {
		StringBuilder message = new StringBuilder("NIBPF3030 VEN000012389732rjprado@gmail.com                       ");
	/*
		while (message.length() < 500) {
			message.append(' ');
		}*/
		
		while (message.length() < 100) {
			try {
				Socket s = new Socket("10.0.0.6", 7400);
		
				DataInputStream in = new DataInputStream(
						new BufferedInputStream(s.getInputStream()));
		
				DataOutputStream out = new DataOutputStream(
						new BufferedOutputStream(s.getOutputStream()));
		
				out.writeShort(message.length());
		
				out.write(message.toString().getBytes());
		
				out.flush();
		
				int length = in.readShort();
		
				byte[] messagebytes = new byte[length];
				
				in.readFully(messagebytes);
				System.out.println("bien con " + message.length());
		
				System.out.println(message);
		
				System.out.println(new String(messagebytes));
		
				in.close();
				out.close();
		
				s.close();	
			} catch (Exception ex) {
				System.out.println("mal: "+message.length());
				message.append(' ');
			}
		}
	}

	public static void NIBPF3040() throws Exception {
		StringBuilder message = new StringBuilder("NIBPF3040 VEN00001238973204142391650");
	/*
		while (message.length() < 500) {
			message.append(' ');
		}*/
		
		while (message.length() < 100) {
			try {
				Socket s = new Socket("10.0.0.6", 7400);
		
				DataInputStream in = new DataInputStream(
						new BufferedInputStream(s.getInputStream()));
		
				DataOutputStream out = new DataOutputStream(
						new BufferedOutputStream(s.getOutputStream()));
		
				out.writeShort(message.length());
		
				out.write(message.toString().getBytes());
		
				out.flush();
		
				int length = in.readShort();
		
				byte[] messagebytes = new byte[length];
				
				in.readFully(messagebytes);
				System.out.println("bien con " + message.length());
		
				System.out.println(message);
		
				System.out.println(new String(messagebytes));
		
				in.close();
				out.close();
		
				s.close();	
			} catch (Exception ex) {
				System.out.println("mal: "+message.length());
				message.append(' ');
			}
		}
	}

	public static void NIBPF3050() throws Exception {
		StringBuilder message = new StringBuilder("NIBPF3050 VEN000012389732000000000000000000000000000000000000000000000000000000000000");
	/*
		while (message.length() < 500) {
			message.append(' ');
		}*/
		
		while (message.length() < 120) {
			try {
				Socket s = new Socket("10.0.0.6", 7400);
		
				DataInputStream in = new DataInputStream(
						new BufferedInputStream(s.getInputStream()));
		
				DataOutputStream out = new DataOutputStream(
						new BufferedOutputStream(s.getOutputStream()));
		
				out.writeShort(message.length());
		
				out.write(message.toString().getBytes());
		
				out.flush();
		
				int length = in.readShort();
		
				byte[] messagebytes = new byte[length];
				
				in.readFully(messagebytes);
				System.out.println("bien con " + message.length());
		
				System.out.println(message);
		
				System.out.println(new String(messagebytes));
		
				in.close();
				out.close();
		
				s.close();	
			} catch (Exception ex) {
				System.out.println("mal: "+message.length());
				message.append(' ');
			}
		}
	}

	public static void CUENTACCC() throws Exception {
		StringBuilder message = new StringBuilder("CUENTACCC 006000444712");
	/*
		while (message.length() < 500) {
			message.append(' ');
		}*/
		
		while (message.length() < 120) {
			try {
				Socket s = new Socket("10.0.0.6", 7400);
		
				DataInputStream in = new DataInputStream(
						new BufferedInputStream(s.getInputStream()));
		
				DataOutputStream out = new DataOutputStream(
						new BufferedOutputStream(s.getOutputStream()));
		
				out.writeShort(message.length());
		
				out.write(message.toString().getBytes());
		
				out.flush();
		
				int length = in.readShort();
		
				byte[] messagebytes = new byte[length];
				
				in.readFully(messagebytes);
				System.out.println("bien con " + message.length());
		
				System.out.println(message);
		
				System.out.println(new String(messagebytes));
		
				in.close();
				out.close();
		
				s.close();	
			} catch (Exception ex) {
				System.out.println("mal: "+message.length());
				message.append(' ');
			}
		}
	}

	public static void INTRFDSJV() throws Exception {
		StringBuilder message = new StringBuilder(
				"INTRFDSJV 5299740      2000247341   2000114136        5000.00 0 000000000");

		while (message.length() < 200) {
			try {
				System.out.println(message.length());

				Socket s = new Socket("10.0.0.6", 7400);

				DataInputStream in = new DataInputStream(
						new BufferedInputStream(s.getInputStream()));

				DataOutputStream out = new DataOutputStream(
						new BufferedOutputStream(s.getOutputStream()));

				out.write(message.toString().getBytes());

				out.flush();

				int length = in.readShort();

				byte[] messagebytes = new byte[length];

				in.readFully(messagebytes);
				System.out.println("bien con " + message.length());

				System.out.println(message);

				System.out.println(new String(messagebytes));

				in.close();
				out.close();

				s.close();
				break;
			} catch (Exception ex) {
				System.out.println("mal: " + message.length());
				message.append(' ');
			}
		}
	}

	public static void CDSDSJV() throws Exception {
		StringBuilder message = new StringBuilder(
				"CDSDSJV   J307894873   1000070521VEB 00000000000.00 00000000000.00 00000000000.00 00 00 00 000.000000 00000000000.00");

		while (message.length() < 200) {
			try {
				System.out.println(message.length());

				Socket s = new Socket("10.0.0.6", 7400);

				DataInputStream in = new DataInputStream(
						new BufferedInputStream(s.getInputStream()));

				DataOutputStream out = new DataOutputStream(
						new BufferedOutputStream(s.getOutputStream()));

				out.writeShort(message.length());

				out.write(message.toString().getBytes());

				out.flush();

				int length = in.readShort();

				byte[] messagebytes = new byte[length];

				in.readFully(messagebytes);
				System.out.println("bien con " + message.length());

				System.out.println(message);

				System.out.println(new String(messagebytes));

				in.close();
				out.close();

				s.close();
				break;
			} catch (Exception ex) {
				System.out.println("mal: " + message.length());
				message.append(' ');
			}
		}
	}

	public static void tiempo() {
		/* 435 */GregorianCalendar gc = new GregorianCalendar();
		/* 436 */gc.setTimeInMillis(System.currentTimeMillis());
		/* 437 */gc.add(10, 4);
		/* 438 */gc.add(12, 32);
		/*     */
		/* 440 */Timestamp ts = new Timestamp(gc.getTimeInMillis());
		/* 441 */StringBuffer sb1 = new StringBuffer(ts.toString());
		/* 442 */sb1.replace(10, 11, "T");
		/* 443 */sb1.replace(19, 23, "Z");
		/* 444 */System.out.println("Timestamp=" + sb1.toString());
		/* 445 */System.out.println("Nonce=" + ts.getTime());
	}

	public static void NIBPF3010_EXACTO() throws Exception {
		String message = "NIBPF3010 VEN000012389732                                                                                                                                                                                                                                                                                                                                                                                                                                                        1";

		System.out.println(message.length());

		Socket s = new Socket("10.0.0.6", 7400);

		DataInputStream in = new DataInputStream(new BufferedInputStream(
				s.getInputStream()));

		DataOutputStream out = new DataOutputStream(new BufferedOutputStream(
				s.getOutputStream()));

		out.writeShort(message.length());

		out.write(message.toString().getBytes());

		out.flush();

		int length = in.readShort();

		byte[] messagebytes = new byte[length];

		in.readFully(messagebytes);
		System.out.println("bien con " + message.length());

		System.out.println(message);

		System.out.println(new String(messagebytes));

		in.close();
		out.close();

		s.close();

	}

	public static void INVALRIF() throws Exception {

		StringBuilder message = new StringBuilder();

		message.append("INVALRIF2  V157620173");

		while (message.length() < 65) {
			try {
				Socket s = new Socket("10.0.0.6", 7800);

				DataInputStream in = new DataInputStream(
						new BufferedInputStream(s.getInputStream()));

				DataOutputStream out = new DataOutputStream(
						new BufferedOutputStream(s.getOutputStream()));

				out.writeShort(message.length());

				out.write(message.toString().getBytes());

				out.flush();
				int length = in.readShort();

				byte[] messagebytes = new byte[length];

				in.readFully(messagebytes);
				System.out.println("bien con " + message.length());

				System.out.println(message);

				System.out.println(new String(messagebytes));

				in.close();
				out.close();

				s.close();
				break;
			} catch (Exception ex) {
				System.out.println("mal: " + message.length());
				message.append(' ');
			}
		}
	}

	public static void IIN091801() throws Exception {


		StringBuilder message = new StringBuilder();

		message.append("IIN091801                                   0000    2000354395      31 2  14");

		while (message.length() < 615) {
			try {
				Socket s = new Socket("10.0.0.6", 7105);

				DataInputStream in = new DataInputStream(
						new BufferedInputStream(s.getInputStream()));

				DataOutputStream out = new DataOutputStream(
						new BufferedOutputStream(s.getOutputStream()));

				out.writeShort(message.length());

				out.write(message.toString().getBytes());

				out.flush();
				int length = in.readShort();

				byte[] messagebytes = new byte[length];

				in.readFully(messagebytes);
				System.out.println("bien con " + message.length());

				System.out.println(message);

				System.out.println(new String(messagebytes));

				in.close();
				out.close();

				s.close();
				break;
			} catch (Exception ex) {
				System.out.println("mal: " + message.length());
				message.append(' ');
			}
		}

	}
	
	public static void IN097002() throws Exception {


		StringBuilder message = new StringBuilder();

		message.append("IN097002 000122787 5  21 14 2000354395                0000000000000000000001019077221 99026           00000000000000001019077221                      122013          12345.67         12345.67");

		while (message.length() < 505) {
			try {
				Socket s = new Socket("10.0.0.6", 7405);

				DataInputStream in = new DataInputStream(
						new BufferedInputStream(s.getInputStream()));

				DataOutputStream out = new DataOutputStream(
						new BufferedOutputStream(s.getOutputStream()));

				out.writeShort(message.length());

				out.write(message.toString().getBytes());

				out.flush();
				int length = in.readShort();

				byte[] messagebytes = new byte[length];

				in.readFully(messagebytes);
				System.out.println("bien con " + message.length());

				System.out.println(message);

				System.out.println(new String(messagebytes));

				in.close();
				out.close();

				s.close();
				break;
			} catch (Exception ex) {
				System.out.println("mal: " + message.length());
				message.append(' ');
			}
		}

	}
	
	public static void IN097001() throws Exception {


		StringBuilder message = new StringBuilder();

		message.append("IN097001 000122787 5  21 14 1019077221 1019077221");

		while (message.length() < 605) {
			try {
				Socket s = new Socket("10.0.0.6", 7405);

				DataInputStream in = new DataInputStream(
						new BufferedInputStream(s.getInputStream()));

				DataOutputStream out = new DataOutputStream(
						new BufferedOutputStream(s.getOutputStream()));

				out.writeShort(message.length());

				out.write(message.toString().getBytes());

				out.flush();
				int length = in.readShort();

				byte[] messagebytes = new byte[length];

				in.readFully(messagebytes);
				System.out.println("bien con " + message.length());

				System.out.println(message);

				System.out.println(new String(messagebytes));

				in.close();
				out.close();

				s.close();
				break;
			} catch (Exception ex) {
				System.out.println("mal: " + message.length());
				message.append(' ');
			}
		}

	}

	public static void IN097101() throws Exception {

		StringBuilder message = new StringBuilder();

		message.append("IN097101  V15762017");

		while (message.length() < 65) {
			try {
				Socket s = new Socket("10.0.0.6", 7405);

				DataInputStream in = new DataInputStream(
						new BufferedInputStream(s.getInputStream()));

				DataOutputStream out = new DataOutputStream(
						new BufferedOutputStream(s.getOutputStream()));

				out.writeShort(message.length());

				out.write(message.toString().getBytes());

				out.flush();
				int length = in.readShort();

				byte[] messagebytes = new byte[length];

				in.readFully(messagebytes);
				System.out.println("bien con " + message.length());

				System.out.println(message);

				System.out.println(new String(messagebytes));

				in.close();
				out.close();

				s.close();
				break;
			} catch (Exception ex) {
				System.out.println("mal: " + message.length());
				message.append(' ');
			}
		}
	}
        
        
        public static void STMRDSJV5() throws Exception {
		
                StringBuilder message = new StringBuilder();
		
		message.append("STMRDSJV5          0060004659581");

		while (message.length() < 600) {
			try {
				System.out.println(message.length());

				Socket s = new Socket("10.3.0.7", 7307);

				DataInputStream in = new DataInputStream(
						new BufferedInputStream(s.getInputStream()));

				DataOutputStream out = new DataOutputStream(
						new BufferedOutputStream(s.getOutputStream()));

				out.write(message.toString().getBytes());

				out.flush();

				int length = in.readShort();

				byte[] messagebytes = new byte[length];

				in.readFully(messagebytes);
				System.out.println("bien con " + message.length());

				System.out.println(message);

				System.out.println(new String(messagebytes));

				in.close();
				out.close();

				s.close();
				break;
			} catch (Exception ex) {
				System.out.println("mal: " + message.length());
				message.append(' ');
			}
		}
	}
	
}
