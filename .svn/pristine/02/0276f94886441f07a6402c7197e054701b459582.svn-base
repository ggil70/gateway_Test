package com.activo.gateway.servicios;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Hashtable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.xml.rpc.ServiceException;
import org.apache.axis.configuration.FileProvider;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import wsdl.adminV8.ig.com.entrust.AdminServiceFault;
import wsdl.adminV8.ig.com.entrust.AdminService_PortType;
import wsdl.adminV8.ig.com.entrust.AdminService_ServiceLocator;
import wsdl.adminV8.ig.com.entrust.UserCreateCallParms;
import wsdl.adminV8.ig.com.entrust.UserGetCallParms;
import wsdl.adminV8.ig.com.entrust.UserGetParms;
import wsdl.adminV8.ig.com.entrust.UserOTPCreateCallParms;
import wsdl.adminV8.ig.com.entrust.UserOTPDeleteCallParms;
import wsdl.adminV8.ig.com.entrust.UserOTPFilter;
import wsdl.adminV8.ig.com.entrust.UserOTPGetCallParms;
import wsdl.adminV8.ig.com.entrust.UserOTPInfo;
import wsdl.adminV8.ig.com.entrust.UserOTPParms;
import wsdl.adminV8.ig.com.entrust.UserParms;
import wsdl.adminV8.ig.com.entrust.UserPasswordCreateExCallParms;
import wsdl.adminV8.ig.com.entrust.UserPasswordParms;
import wsdl.adminV8.ig.com.entrust.UserPasswordSetExCallParms;
import wsdl.adminV8.ig.com.entrust.UserSetCallParms;
import wsdl.authenticationV8.ig.com.entrust.AuthenticateGenericChallengeExCallParms;
import wsdl.authenticationV8.ig.com.entrust.AuthenticationPasswordChangeRequiredFaultEx;
import wsdl.authenticationV8.ig.com.entrust.AuthenticationServiceFault;
import wsdl.authenticationV8.ig.com.entrust.AuthenticationService_PortType;
import wsdl.authenticationV8.ig.com.entrust.AuthenticationService_ServiceLocator;
import wsdl.authenticationV8.ig.com.entrust.AuthenticationSystemFault;
import wsdl.authenticationV8.ig.com.entrust.GenericAuthenticateParmsEx;
import wsdl.authenticationV8.ig.com.entrust.GenericChallengeEx;
import wsdl.authenticationV8.ig.com.entrust.GenericChallengeParmsEx;
import wsdl.authenticationV8.ig.com.entrust.GetGenericChallengeExCallParms;
import wsdl.authenticationV8.ig.com.entrust.Response;
import com.activo.gateway.beans.*;
import com.activo.gateway.com.Helper;
import com.activo.gateway.interfaces.IExtraCreditoRepo;
import com.activo.gateway.dibs.messages.BNKSRDSJVMessage;
import com.activo.gateway.dibs.messages.CARDSJVMessage;
import com.activo.gateway.dibs.messages.CCARDTRJVMessage;
import com.activo.gateway.dibs.messages.CDSDSJV2Message;
import com.activo.gateway.dibs.messages.ECC051001Message;
import com.activo.gateway.dibs.messages.EDD0395DSMessage;
import com.activo.gateway.dibs.messages.EDL090001Message;
import com.activo.gateway.dibs.messages.EDL090002Message;
import com.activo.gateway.dibs.messages.EDL090003Message;
import com.activo.gateway.dibs.messages.EDL098001Message;
import com.activo.gateway.dibs.messages.EDL890001Message;
import com.activo.gateway.dibs.messages.EDL890101Message;
import com.activo.gateway.dibs.messages.ELEERRMessage;
import com.activo.gateway.dibs.messages.IIN091801Message;
import com.activo.gateway.dibs.messages.ILN006001Message;
import com.activo.gateway.dibs.messages.IMSSGDSJVMessage;
import com.activo.gateway.dibs.messages.IN097001Message;
import com.activo.gateway.dibs.messages.IN097002Message;
import com.activo.gateway.dibs.messages.IN097101Message;
import com.activo.gateway.dibs.messages.IN098002Message;
import com.activo.gateway.dibs.messages.IN098101Message;
import com.activo.gateway.dibs.messages.IN098102Message;
import com.activo.gateway.dibs.messages.IN098401Message;
import com.activo.gateway.dibs.messages.IN098801Message;
import com.activo.gateway.dibs.messages.INCKBDSJVMessage;
import com.activo.gateway.dibs.messages.INEXTDSJV2Message;
import com.activo.gateway.dibs.messages.INPYRLSJVMessage;
import com.activo.gateway.dibs.messages.INTRFDSJV2Message;
import com.activo.gateway.dibs.messages.INVALRIF2Message;
import com.activo.gateway.dibs.messages.INVALTDCMessage;
import com.activo.gateway.dibs.messages.LNSDSJV2Message;
import com.activo.gateway.dibs.messages.NIB090501Message;
import com.activo.gateway.dibs.messages.NIB2090PFMessage;
import com.activo.gateway.dibs.messages.NIBPF3000Message;
import com.activo.gateway.dibs.messages.NIBPF3010Message;
import com.activo.gateway.dibs.messages.NIBPF3020Message;
import com.activo.gateway.dibs.messages.NIBPF3030Message;
import com.activo.gateway.dibs.messages.NIBPF3040Message;
import com.activo.gateway.dibs.messages.NIBPF3050Message;
import com.activo.gateway.dibs.messages.NIKDSJVMessage;
import com.activo.gateway.dibs.messages.PWDDSJVMessage;
import com.activo.gateway.dibs.messages.REGISTERMessage;
import com.activo.gateway.dibs.messages.STMBDSJVMessage;
import com.activo.gateway.dibs.messages.STMRDSJVMessage;
import com.activo.gateway.dibs.messages.STMSDSJVMessage;
import com.activo.gateway.dibs.messages.STOPDSJV2Message;
import com.activo.gateway.dibs.messages.SUMDSJV2Message;
import com.activo.gateway.dibs.messages.TINQDSJV2Message;
import com.activo.gateway.dibs.messages.AVAN001Message;
import com.activo.gateway.dibs.messages.CBPR00401Message;
import com.activo.gateway.dibs.messages.EXTA001Message;
import com.activo.gateway.dibs.messages.IBPINFDATMessage;
import com.activo.gateway.dibs.messages.IN096201Message;
import com.activo.gateway.dibs.messages.IN098102LMessage;
import com.activo.gateway.dibs.messages.INEXTDSJV5Message;
import com.activo.gateway.dibs.messages.INTRFDSJV5Message;
import com.activo.gateway.dibs.messages.INTRFDSJV6Message;
import com.activo.gateway.dibs.messages.STMRDSJV5Message;
import com.activo.gateway.dibs.messages.STMSDSJV5Message;
import com.activo.gateway.dibs.messages.SUMDSJV3EMessage;
import com.activo.gateway.dibs.messages.SUMDSJV3SMessage;
import com.activo.gateway.dibs.messages.SUMDSJV4EMessage;
import com.activo.gateway.dibs.messages.SUMDSJV4SMessage;
import com.activo.gateway.dibs.messages.IN206001Message;
import com.activo.gateway.dibs.messages.IN206101Message;
import com.activo.gateway.dibs.messages.APEDSCASHEMessage;
import com.activo.gateway.model.Respuestas;
import com.activo.gateway.model.Solicitud;
import com.activo.gateway.model.Tarjetas;
import com.activo.gateway.repositories.ConsultaFeriadosRepo;
import com.activo.gateway.repositories.ExtraCreditoRepo;
import com.activo.gateway.sockets.MessageContext;
import com.activo.gateway.sockets.MessageRecord;
import com.activo.gateway.util.Crypto;
import com.activo.gateway.util.Database;
import com.activo.gateway.util.EmailSender;
import com.activo.gateway.util.EntradaCache;
import com.activo.gateway.util.Parametros;
import com.activo.gateway.util.SHA1;
import com.activo.gateway.util.SmsSP;
import com.activo.gateway.util.Util;
import com.activo.gateway.util.Validador;
import com.activo.gateway.dibs.messages.IN096202Message;
import com.activo.gateway.dibs.messages.IN208001Message;
import com.activo.gateway.dibs.messages.IN800101Message;
import com.activo.gateway.dibs.messages.MCBIOSEPFEMessage;
import com.activo.gateway.dibs.messages.NIBMENU01Message;
import com.activo.gateway.dibs.messages.NIBVCDI01Message;
import com.activo.gateway.dibs.messages.NIBVINT01Message;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.HttpURLConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.math.BigDecimal;
import java.util.logging.Level;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Core {
    
	private static final Logger log = Logger.getLogger(Core.class);
	// declarar cache para consulta de cantv
	private static final Hashtable<String, EntradaCache<IN098401Response>> cacheCantv = new Hashtable();
        // Token Celupagos
        private static String TokenCelupagos = "";
	/**
	 * Manejo de errores 
	 * @param res, newmessage
	 * @param newmessage
	 */
	private void manejarError(WSResponse res, ELEERRMessage newmessage) {
		res.setError(new ELEERR());
		res.getError().setERRNUM(((ELEERRMessage) newmessage).getERRNUM());
		res.getError().setERNU01(((ELEERRMessage) newmessage).getERNU01());
		res.getError().setERNU02(((ELEERRMessage) newmessage).getERNU02());
		res.getError().setERNU03(((ELEERRMessage) newmessage).getERNU03());
		res.getError().setERNU04(((ELEERRMessage) newmessage).getERNU04());
		res.getError().setERNU05(((ELEERRMessage) newmessage).getERNU05());
		res.getError().setERNU06(((ELEERRMessage) newmessage).getERNU06());
		res.getError().setERNU07(((ELEERRMessage) newmessage).getERNU07());
		res.getError().setERNU08(((ELEERRMessage) newmessage).getERNU08());
		res.getError().setERNU09(((ELEERRMessage) newmessage).getERNU09());
		res.getError().setERNU10(((ELEERRMessage) newmessage).getERNU10());
		res.getError().setERDS01(((ELEERRMessage) newmessage).getERDS01());
		res.getError().setERDS02(((ELEERRMessage) newmessage).getERDS02());
		res.getError().setERDS03(((ELEERRMessage) newmessage).getERDS03());
		res.getError().setERDS04(((ELEERRMessage) newmessage).getERDS04());
		res.getError().setERDS05(((ELEERRMessage) newmessage).getERDS05());
		res.getError().setERDS06(((ELEERRMessage) newmessage).getERDS06());
		res.getError().setERDS07(((ELEERRMessage) newmessage).getERDS07());
		res.getError().setERDS08(((ELEERRMessage) newmessage).getERDS08());
		res.getError().setERDS09(((ELEERRMessage) newmessage).getERDS09());
		res.getError().setERDS10(((ELEERRMessage) newmessage).getERDS10());
		res.getError().setERDF01(((ELEERRMessage) newmessage).getERDF01());
		res.getError().setERDF02(((ELEERRMessage) newmessage).getERDF02());
		res.getError().setERDF03(((ELEERRMessage) newmessage).getERDF03());
		res.getError().setERDF04(((ELEERRMessage) newmessage).getERDF04());
		res.getError().setERDF05(((ELEERRMessage) newmessage).getERDF05());
		res.getError().setERDF06(((ELEERRMessage) newmessage).getERDF06());
		res.getError().setERDF07(((ELEERRMessage) newmessage).getERDF07());
		res.getError().setERDF08(((ELEERRMessage) newmessage).getERDF08());
		res.getError().setERDF09(((ELEERRMessage) newmessage).getERDF09());
		res.getError().setERDF10(((ELEERRMessage) newmessage).getERDF10());
		res.getError().setERDR01(((ELEERRMessage) newmessage).getERDR01());
		res.getError().setERDR02(((ELEERRMessage) newmessage).getERDR02());
		res.getError().setERDR03(((ELEERRMessage) newmessage).getERDR03());
		res.getError().setERDR04(((ELEERRMessage) newmessage).getERDR04());
		res.getError().setERDR05(((ELEERRMessage) newmessage).getERDR05());
		res.getError().setERDR06(((ELEERRMessage) newmessage).getERDR06());
		res.getError().setERDR07(((ELEERRMessage) newmessage).getERDR07());
		res.getError().setERDR08(((ELEERRMessage) newmessage).getERDR08());
		res.getError().setERDR09(((ELEERRMessage) newmessage).getERDR09());
		res.getError().setERDR10(((ELEERRMessage) newmessage).getERDR10());
		res.getError().setERWRNG(((ELEERRMessage) newmessage).getERWRNG());
		res.getError().setERWF01(((ELEERRMessage) newmessage).getERWF01());
		res.getError().setERWF02(((ELEERRMessage) newmessage).getERWF02());
		res.getError().setERWF03(((ELEERRMessage) newmessage).getERWF03());
		res.getError().setERWF04(((ELEERRMessage) newmessage).getERWF04());
		res.getError().setERWF05(((ELEERRMessage) newmessage).getERWF05());
		res.getError().setERWF06(((ELEERRMessage) newmessage).getERWF06());
		res.getError().setERWF07(((ELEERRMessage) newmessage).getERWF07());
		res.getError().setERWF08(((ELEERRMessage) newmessage).getERWF08());
		res.getError().setERWF09(((ELEERRMessage) newmessage).getERWF09());
		res.getError().setERWF10(((ELEERRMessage) newmessage).getERWF10());
	}		
	
	public AdelantoEfectivoResponse consultaSaldoExtraCredito(AdelantoEfectivoBean req) throws WSException
	{
		
		log.info("Invocando consultaSaldoExtraCredito");
		Parametros params = new Parametros();
		AdelantoEfectivoResponse res = new AdelantoEfectivoResponse();
		Socket s = null;
		try {
			
			s = new Socket(params.getString("ip"), params.getInt("port3"));
			s.setSoTimeout(params.getInt("timeout"));
			MessageContext mc = new MessageContext(new DataInputStream(new BufferedInputStream(s.getInputStream())), new DataOutputStream(
					new BufferedOutputStream(s.getOutputStream())), "com.activo.gateway.dibs.messages");
			EXTA001Message message = (EXTA001Message) mc.getMessageRecord("EXTA001");
			
			// La consulta de saldo avance extracredito solo requiere el numero de tarjeta, numero de cliente
			if(req.getNumTarjeta()!=null && !req.getNumTarjeta().equals("")) message.setE02NUMTDC(req.getNumTarjeta());
			if(req.getNumCliente()!=null && !req.getNumCliente().equals("")) message.setE02CLIENT(req.getNumCliente());
			if(req.getMonto()!=null && !req.getMonto().equals("")) message.setE02MONTO(req.getMonto());
						
			// Codigo que indica la transaccion a realizar
			message.setE01TIPMSG("C");
			message.setE02ERROR("");
			message.setE01CANAL("00");
			message.setE01CODIGO("001");
			
			message.send();
			message.destroy();
			MessageRecord newmessage = mc.receiveMessage();
						
			// Manejamos los errores si existen
			if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("0"))) {
				manejarError(res, ((ELEERRMessage) newmessage));
				log.error("EXTA001 - Consulta de saldo ExtraCredito: " +"Error: "+ res.getError().getERNU01() + " - " + res.getError().getERDS01() + " - Canal " + req.getCanal());
				return res;
			} else if (newmessage.getFormatName().equals("EXTA001")) {
				String e = ((EXTA001Message) newmessage).getE02ERROR().trim();
				
				if("".equals(e)){
					// La consulta fue satisfactoria
					res.setCodigoRespuesta("00");
					res.setRespuesta("APROBADO");
					res.setNumTarjeta(((EXTA001Message) newmessage).getE02NUMTDC());
					res.setTipoMensaje("0110");
					res.setMontoConsultaSaldo(((EXTA001Message) newmessage).getE02MONTO());
				}
				else
				{
					res.setCodigoRespuesta(((EXTA001Message) newmessage).getE02ERROR());
					res.setRespuesta(((EXTA001Message) newmessage).getE02DESERR());
				}
				
			}
			
			
		} catch (Exception ex) {
			log.error("Consulta Saldo ExtraCredito - " + ex.getMessage() + " - Canal " + req.getCanal(), ex);
			throw new WSException(ex);
		}
		finally {
			if (s != null)
				try {
					s.close();
				} catch (IOException ex) {
				}
		}
		log.info("Consulta Saldo ExtraCredito - res: " + res.getCodigoRespuesta());
		return res;
	}
	
	public AdelantoEfectivoResponse avanceExtraCredito(AdelantoEfectivoBean req) throws WSException{
		
		log.info("Invocando avanceExtraCredito");
		Parametros params = new Parametros();
		AdelantoEfectivoResponse res = new AdelantoEfectivoResponse();
		Socket s = null;
		
		try {
			
			s = new Socket(params.getString("ip"), params.getInt("port3"));
			s.setSoTimeout(params.getInt("timeout"));
			MessageContext mc = new MessageContext(new DataInputStream(new BufferedInputStream(s.getInputStream())), new DataOutputStream(
					new BufferedOutputStream(s.getOutputStream())), "com.activo.gateway.dibs.messages");
			EXTA001Message message = (EXTA001Message) mc.getMessageRecord("EXTA001");
			
			// El avance de efectivo requiere el numero de tarjeta, numero de cliente, monto del avance, la cuenta de abono y el plazo de financiamiento (dataExtraCredito)
			if(req.getNumTarjeta()!=null && !req.getNumTarjeta().equals("")) message.setE02NUMTDC(req.getNumTarjeta());
			if(req.getNumCliente()!=null && !req.getNumCliente().equals("")) message.setE02CLIENT(req.getNumCliente());
			if(req.getMonto()!=null && !req.getMonto().equals("")) message.setE02MONTO(req.getMonto());
			if(req.getCuentaAbono()!=null && !req.getCuentaAbono().equals("")) message.setE01CUENTA(req.getCuentaAbono());
			if(req.getDataExtraFinanciamiento()!=null && !req.getDataExtraFinanciamiento().equals("")) message.setE01NUMMES(req.getDataExtraFinanciamiento());
			
			// Codigo que indica la transaccion a realizar
			message.setE01TIPMSG("P");
			message.setE02ERROR("");
			message.setE01CANAL("00");
			message.setE01CODIGO("001");
			
			message.send();
			message.destroy();
			MessageRecord newmessage = mc.receiveMessage();
						
			// Manejamos los errores si existen
			if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("0"))) {
				manejarError(res, ((ELEERRMessage) newmessage));
				log.error("EXTA001 - Avance ExtraCredito: " +"Error: "+ res.getError().getERNU01() + " - " + res.getError().getERDS01() + " - Canal " + req.getCanal());
				return res;
			} else if (newmessage.getFormatName().equals("EXTA001")) {
				String e = ((EXTA001Message) newmessage).getE02ERROR().trim();
				if("".equals(e))
				{
					// El avance fue satisfactorio
					res.setCodigoRespuesta("00");
					res.setRespuesta("APROBADO");
					
					
					// Enviamos el correo electronico
					EmailSender emailSender = new EmailSender();
					Database db = new Database();
					if (db.conectar()) {
						String to = req.getEmailCliente();
						String subject = "Notificación de Aprobación de ExtraCrédito Efectivo";
						String m = db.buscarMensajeCorreo("email_avance_efectivo");
						String mensaje = String.format(m, req.getNombreCliente(), "Aprobación de ExtraCrédito Efectivo", ((EXTA001Message) newmessage).getE02MONTO());
						String footer = db.buscarFooterCorreos("footer_correos");
						if(!emailSender.sendMail(to, subject, mensaje, footer))
						{
							// No se logro enviar el correo
							res.setError(new ELEERR());
							res.getError().setERRNUM("2");
							res.getError().setERNU02("Error al enviar el correo electrónico");
							log.error("Error, no se pudo enviar el correo electronico de ExtraCrédito Efectivo - Canal: " + req.getCanal());
						} 
					}	
				}
				else
				{
					res.setCodigoRespuesta(((EXTA001Message) newmessage).getE02ERROR());
					res.setRespuesta(((EXTA001Message) newmessage).getE02DESERR());
				}
				
				res.setNumTarjeta(((EXTA001Message) newmessage).getE02NUMTDC());
				res.setNumReferencia(((EXTA001Message) newmessage).getE02NUMREF());
				// en dataExtraFinanciamiento estamos enviando el monto del primer pago
				res.setDataExtraFinanciamiento(((EXTA001Message) newmessage).getE02MONTO());
				res.setTipoMensaje("0210");
				res.setMonto(req.getMonto());
			}
			
			
		} catch (Exception e) {
			log.error("ExtraCredito Efectivo - " + e.getMessage() + " - Canal " + req.getCanal(),e);
			throw new WSException(e);
		}
		finally {
			if (s != null)
				try {
					s.close();
				} 
				catch (IOException e) {
					}
		}
		log.info("ExtraCredito Efectivo - res: " + res.getCodigoRespuesta());
		return res;
	}
	
	public AdelantoEfectivoResponse consultaSaldoAvance(AdelantoEfectivoBean req) throws WSException
	{
		log.info("Invocando consultaSaldoAvance");
		Parametros params = new Parametros();
		AdelantoEfectivoResponse res = new AdelantoEfectivoResponse();
		Socket s = null;
		try {
			
			s = new Socket(params.getString("ip"), params.getInt("port3"));
			s.setSoTimeout(params.getInt("timeout"));
			MessageContext mc = new MessageContext(new DataInputStream(new BufferedInputStream(s.getInputStream())), new DataOutputStream(
					new BufferedOutputStream(s.getOutputStream())), "com.activo.gateway.dibs.messages");
			AVAN001Message message = (AVAN001Message) mc.getMessageRecord("AVAN001");
			
			// La consulta de saldo avance efectivo solo requiere el numero de tarjeta y numero de cliente
			if(req.getNumTarjeta()!=null && !req.getNumTarjeta().equals("")) message.setE01NUMTDC(req.getNumTarjeta());
			if(req.getNumCliente()!=null && !req.getNumCliente().equals("")) message.setE01CLIENT(req.getNumCliente());
			
			// Codigo que indica la transaccion a realizar
			message.setE01CODTRA("0001");
			message.setE01ERROR("");
			message.send();
			message.destroy();
			MessageRecord newmessage = mc.receiveMessage();
			
			// Manejamos los errores si existen
			if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("0"))) {
				manejarError(res, ((ELEERRMessage) newmessage));
				log.error("AVAN001 - Consulta de saldo Avance Efectivo: " +"Error: "+ res.getError().getERNU01() + " - " + res.getError().getERDS01() + " - Canal " + req.getCanal());
				return res;
			} else if (newmessage.getFormatName().equals("AVAN001")) {
				String e = ((AVAN001Message) newmessage).getE01ERROR().trim();
				
				if("".equals(e)){
					// La consulta fue satisfactoria
					res.setCodigoRespuesta("00");
					res.setRespuesta("APROBADO");
					res.setNumTarjeta(((AVAN001Message) newmessage).getE01NUMTDC());
					res.setTipoMensaje("0110");
					res.setMontoConsultaSaldo(((AVAN001Message) newmessage).getE01MONTO());
				}
				else
				{
					res.setCodigoRespuesta(((AVAN001Message) newmessage).getE01ERROR());
					res.setRespuesta(((AVAN001Message) newmessage).getE01DESERR());
				}
				
			}
			
			
		} catch (Exception ex) {
			log.error("Consulta Saldo Avance Efectivo - " + ex.getMessage() + " - Canal " + req.getCanal(), ex);
			throw new WSException(ex);
		}
		finally {
			if (s != null)
				try {
					s.close();
				} catch (IOException ex) {
				}
		}
		log.info("Consulta Saldo Avance Efectivo - res: " + res.getCodigoRespuesta());
		return res;
		
	}
	
	public AdelantoEfectivoResponse avanceEfectivo(AdelantoEfectivoBean req) throws WSException{
		
		log.info("Invocando avanceEfectivo");
		Parametros params = new Parametros();
		AdelantoEfectivoResponse res = new AdelantoEfectivoResponse();
		Socket s = null;
		try {
			
			s = new Socket(params.getString("ip"), params.getInt("port3"));
			s.setSoTimeout(params.getInt("timeout"));
			MessageContext mc = new MessageContext(new DataInputStream(new BufferedInputStream(s.getInputStream())), new DataOutputStream(
					new BufferedOutputStream(s.getOutputStream())), "com.activo.gateway.dibs.messages");
			AVAN001Message message = (AVAN001Message) mc.getMessageRecord("AVAN001");
			
			// El avance de efectivo requiere el numero de tarjeta, numero de cliente, monto del avance, y la cuenta de abono
			if(req.getNumTarjeta()!=null && !req.getNumTarjeta().equals("")) message.setE01NUMTDC(req.getNumTarjeta());
			if(req.getNumCliente()!=null && !req.getNumCliente().equals("")) message.setE01CLIENT(req.getNumCliente());
			if(req.getMonto()!=null && !req.getMonto().equals("")) message.setE01MONTO(req.getMonto());
			if(req.getCuentaAbono()!=null && !req.getCuentaAbono().equals("")) message.setE01NUMCTA(req.getCuentaAbono());
			
			// Codigo que indica la transaccion a realizar
			message.setE01CODTRA("0002");
			message.setE01ERROR("");
			
			message.send();
			message.destroy();
			MessageRecord newmessage = mc.receiveMessage();
			
			// Manejamos los errores si existen
			if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("0"))) {
				manejarError(res, ((ELEERRMessage) newmessage));
				log.error("AVAN001 - Avance Efectivo: " +"Error: "+ res.getError().getERNU01() + " - " + res.getError().getERDS01() + " - Canal " + req.getCanal());
				return res;
			} else if (newmessage.getFormatName().equals("AVAN001")) {
				String e = ((AVAN001Message) newmessage).getE01ERROR().trim();
				if("".equals(e))
				{
					// El avance fue satisfactorio
					res.setCodigoRespuesta("00");
					res.setRespuesta("APROBADO");
					
					
					// Enviamos el correo electronico
					EmailSender emailSender = new EmailSender();
					Database db = new Database();
					if (db.conectar()) {
						String to = req.getEmailCliente();
						String subject = "Notificación de Aprobación de Avance de Efectivo";
						String m = db.buscarMensajeCorreo("email_avance_efectivo");
						String mensaje = String.format(m, req.getNombreCliente(), "Aprobación Avance de Efectivo Activo", ((AVAN001Message) newmessage).getE01MONTO());
						String footer = db.buscarFooterCorreos("footer_correos");
						if(!emailSender.sendMail(to, subject, mensaje, footer))
						{
							// No se logro enviar el correo
							res.setError(new ELEERR());
							res.getError().setERRNUM("2");
							res.getError().setERNU02("Error al enviar el correo electrónico");
							log.error("Error, no se pudo enviar el correo electronico Avance de Efectivo - Canal: " + req.getCanal());
						}
					}	
				}
				else
				{
					res.setCodigoRespuesta(((AVAN001Message) newmessage).getE01ERROR());
					res.setRespuesta(((AVAN001Message) newmessage).getE01DESERR());
				}
				
				res.setNumTarjeta(((AVAN001Message) newmessage).getE01NUMTDC());
				res.setNumReferencia(((AVAN001Message) newmessage).getE01NUMREF());
				res.setTipoMensaje("0210");
				res.setMonto(((AVAN001Message) newmessage).getE01MONTO());
			}
			
			
		} catch (Exception e) {
			log.error("Avance Efectivo - " + e.getMessage() + " - Canal " + req.getCanal(),e);
			throw new WSException(e);
		}
		finally {
			if (s != null)
				try {
					s.close();
				} 
				catch (IOException e) {
					}
		}
		log.info("Avance Efectivo - res: " + res.getCodigoRespuesta());
		return res;
	}
	
	/**
	 * Servicio para listar los Estados de Cuenta, Históricos.
	 * @param req
	 * @return
	 * @throws WSException
	 */
	public IIN091801Response IIN091801(IIN091801Bean req) throws WSException {
		log.info("Invocando IIN091801");
		Parametros params = new Parametros();
		Socket s = null;
		IIN091801Response res = new IIN091801Response();
		try {
			s = new Socket(params.getString("ip"), params.getInt("port1") + 1);
			s.setSoTimeout(params.getInt("timeout"));
			MessageContext mc = new MessageContext(new DataInputStream(new BufferedInputStream(s.getInputStream())), new DataOutputStream(
					new BufferedOutputStream(s.getOutputStream())), "com.activo.gateway.dibs.messages");
			IIN091801Message message = (IIN091801Message) mc.getMessageRecord("IIN091801");
			if(req.getH01USERID() != null && !"".equals(req.getH01USERID()))message.setH01USERID(req.getH01USERID());
			if(req.getH01PROGRM() != null && !"".equals(req.getH01PROGRM()))message.setH01PROGRM(req.getH01PROGRM());
			if(req.getH01TIMSYS() != null && !"".equals(req.getH01TIMSYS()))message.setH01TIMSYS(req.getH01TIMSYS());
			if(req.getH01SCRCOD() != null && !"".equals(req.getH01SCRCOD()))message.setH01SCRCOD(req.getH01SCRCOD());
			if(req.getH01OPECOD() != null && !"".equals(req.getH01OPECOD()))message.setH01OPECOD(req.getH01OPECOD());
			if(req.getH01FLGMAS() != null && !"".equals(req.getH01FLGMAS()))message.setH01FLGMAS(req.getH01FLGMAS());
			if(req.getH01FLGWK1() != null && !"".equals(req.getH01FLGWK1()))message.setH01FLGWK1(req.getH01FLGWK1());
			if(req.getH01FLGWK2() != null && !"".equals(req.getH01FLGWK2()))message.setH01FLGWK2(req.getH01FLGWK2());
			if(req.getH01FLGWK3() != null && !"".equals(req.getH01FLGWK3()))message.setH01FLGWK3(req.getH01FLGWK3());
			if(req.getI01ACMACC() != null && !"".equals(req.getI01ACMACC()))message.setI01ACMACC(req.getI01ACMACC());
			if(req.getI01STADT1() != null && !"".equals(req.getI01STADT1()))message.setI01STADT1(req.getI01STADT1());
			if(req.getI01STADT2() != null && !"".equals(req.getI01STADT2()))message.setI01STADT2(req.getI01STADT2());
			if(req.getI01STADT3() != null && !"".equals(req.getI01STADT3()))message.setI01STADT3(req.getI01STADT3());
			if(req.getI01ACMCUN() != null && !"".equals(req.getI01ACMCUN()))message.setI01ACMCUN(req.getI01ACMCUN());
			if(req.getI01CUSNA1() != null && !"".equals(req.getI01CUSNA1()))message.setI01CUSNA1(req.getI01CUSNA1());
			if(req.getI01CUSNA2() != null && !"".equals(req.getI01CUSNA2()))message.setI01CUSNA2(req.getI01CUSNA2());
			if(req.getI01CUSNA3() != null && !"".equals(req.getI01CUSNA3()))message.setI01CUSNA3(req.getI01CUSNA3());
			if(req.getI01CUSNA4() != null && !"".equals(req.getI01CUSNA4()))message.setI01CUSNA4(req.getI01CUSNA4());
			if(req.getI01CUSCTY() != null && !"".equals(req.getI01CUSCTY()))message.setI01CUSCTY(req.getI01CUSCTY());
			if(req.getI01DSCATY() != null && !"".equals(req.getI01DSCATY()))message.setI01DSCATY(req.getI01DSCATY());
			if(req.getI01DSCPRO() != null && !"".equals(req.getI01DSCPRO()))message.setI01DSCPRO(req.getI01DSCPRO());
			if(req.getI01DSCOFC() != null && !"".equals(req.getI01DSCOFC()))message.setI01DSCOFC(req.getI01DSCOFC());
			if(req.getI01BEGBAL() != null && !"".equals(req.getI01BEGBAL()))message.setI01BEGBAL(req.getI01BEGBAL());
			if(req.getI01ENDBAL() != null && !"".equals(req.getI01ENDBAL()))message.setI01ENDBAL(req.getI01ENDBAL());
			if(req.getI01BATDT1() != null && !"".equals(req.getI01BATDT1()))message.setI01BATDT1(req.getI01BATDT1());
			if(req.getI01BATDT2() != null && !"".equals(req.getI01BATDT2()))message.setI01BATDT2(req.getI01BATDT2());
			if(req.getI01BATDT3() != null && !"".equals(req.getI01BATDT3()))message.setI01BATDT3(req.getI01BATDT3());
			if(req.getI01VALDT1() != null && !"".equals(req.getI01VALDT1()))message.setI01VALDT1(req.getI01VALDT1());
			if(req.getI01VALDT2() != null && !"".equals(req.getI01VALDT2()))message.setI01VALDT2(req.getI01VALDT2());
			if(req.getI01VALDT3() != null && !"".equals(req.getI01VALDT3()))message.setI01VALDT3(req.getI01VALDT3());
			if(req.getI01TRNCDE() != null && !"".equals(req.getI01TRNCDE()))message.setI01TRNCDE(req.getI01TRNCDE());
			if(req.getI01NUMCHK() != null && !"".equals(req.getI01NUMCHK()))message.setI01NUMCHK(req.getI01NUMCHK());
			if(req.getI01NARRAT() != null && !"".equals(req.getI01NARRAT()))message.setI01NARRAT(req.getI01NARRAT());
			if(req.getI01DEBITS() != null && !"".equals(req.getI01DEBITS()))message.setI01DEBITS(req.getI01DEBITS());
			if(req.getI01CREDIT() != null && !"".equals(req.getI01CREDIT()))message.setI01CREDIT(req.getI01CREDIT());
			if(req.getI01BALANC() != null && !"".equals(req.getI01BALANC()))message.setI01BALANC(req.getI01BALANC());
			if(req.getI01BALGBL() != null && !"".equals(req.getI01BALGBL()))message.setI01BALGBL(req.getI01BALGBL());
			if(req.getI01BALUNC() != null && !"".equals(req.getI01BALUNC()))message.setI01BALUNC(req.getI01BALUNC());
			if(req.getI01BALHLD() != null && !"".equals(req.getI01BALHLD()))message.setI01BALHLD(req.getI01BALHLD());
			if(req.getI01BALNBL() != null && !"".equals(req.getI01BALNBL()))message.setI01BALNBL(req.getI01BALNBL());
			if(req.getI01CUSIDN() != null && !"".equals(req.getI01CUSIDN()))message.setI01CUSIDN(req.getI01CUSIDN());
			if(req.getI01CUSTID() != null && !"".equals(req.getI01CUSTID()))message.setI01CUSTID(req.getI01CUSTID());
			if(req.getI01NUMREC() != null && !"".equals(req.getI01NUMREC()))message.setI01NUMREC(req.getI01NUMREC());
			if(req.getI01INDOPE() != null && !"".equals(req.getI01INDOPE()))message.setI01INDOPE(req.getI01INDOPE());
			message.send();
			message.destroy();
			MessageRecord newmessage = mc.receiveMessage();
			if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("0"))) {
				manejarError(res, ((ELEERRMessage) newmessage));
				log.error("IIN091801 - Historico de transacciones: " +"Error: "+ res.getError().getERNU01() + " - " + res.getError().getERDS01() + " - Canal " + req.getCanal());
				return res;
			} else if (newmessage.getFormatName().equals("IIN091801")) {
				List<IIN091801Bean> x = new ArrayList<IIN091801Bean>();
				boolean GoIn = !((IIN091801Message) newmessage).getI01INDOPE().equals("*");
				while (GoIn) {
					IIN091801Bean bean = new IIN091801Bean();
					bean.setH01USERID(((IIN091801Message) newmessage).getH01USERID());
					bean.setH01PROGRM(((IIN091801Message) newmessage).getH01PROGRM());
					bean.setH01TIMSYS(((IIN091801Message) newmessage).getH01TIMSYS());
					bean.setH01SCRCOD(((IIN091801Message) newmessage).getH01SCRCOD());
					bean.setH01OPECOD(req.getH01OPECOD()); //Se toma el del request, porque en el response esta devolviendo la moneda
					bean.setH01FLGMAS(((IIN091801Message) newmessage).getH01FLGMAS());
					bean.setH01FLGWK1(((IIN091801Message) newmessage).getH01FLGWK1());
					bean.setH01FLGWK2(((IIN091801Message) newmessage).getH01FLGWK2());
					bean.setH01FLGWK3(((IIN091801Message) newmessage).getH01FLGWK3());
					bean.setI01ACMACC(((IIN091801Message) newmessage).getI01ACMACC());
					bean.setI01STADT1(((IIN091801Message) newmessage).getI01STADT1());
					bean.setI01STADT2(((IIN091801Message) newmessage).getI01STADT2());
					bean.setI01STADT3(((IIN091801Message) newmessage).getI01STADT3());
					bean.setI01ACMCUN(((IIN091801Message) newmessage).getI01ACMCUN());
					bean.setI01CUSNA1(((IIN091801Message) newmessage).getI01CUSNA1());
					bean.setI01CUSNA2(((IIN091801Message) newmessage).getI01CUSNA2());
					bean.setI01CUSNA3(((IIN091801Message) newmessage).getI01CUSNA3());
					bean.setI01CUSNA4(((IIN091801Message) newmessage).getI01CUSNA4());
					bean.setI01CUSCTY(((IIN091801Message) newmessage).getI01CUSCTY());
					bean.setI01DSCATY(((IIN091801Message) newmessage).getI01DSCATY());
					bean.setI01DSCPRO(((IIN091801Message) newmessage).getI01DSCPRO());
					bean.setI01DSCOFC(((IIN091801Message) newmessage).getI01DSCOFC());
					bean.setI01BEGBAL(((IIN091801Message) newmessage).getI01BEGBAL());
					bean.setI01ENDBAL(((IIN091801Message) newmessage).getI01ENDBAL());
					bean.setI01BATDT1(((IIN091801Message) newmessage).getI01BATDT1());
					bean.setI01BATDT2(((IIN091801Message) newmessage).getI01BATDT2());
					bean.setI01BATDT3(((IIN091801Message) newmessage).getI01BATDT3());
					bean.setI01VALDT1(((IIN091801Message) newmessage).getI01VALDT1());
					bean.setI01VALDT2(((IIN091801Message) newmessage).getI01VALDT2());
					bean.setI01VALDT3(((IIN091801Message) newmessage).getI01VALDT3());
					bean.setI01TRNCDE(((IIN091801Message) newmessage).getI01TRNCDE());
					bean.setI01NUMCHK(((IIN091801Message) newmessage).getI01NUMCHK());
					bean.setI01NARRAT(((IIN091801Message) newmessage).getI01NARRAT());
					bean.setI01DEBITS(((IIN091801Message) newmessage).getI01DEBITS());
					bean.setI01CREDIT(((IIN091801Message) newmessage).getI01CREDIT());
					bean.setI01BALANC(((IIN091801Message) newmessage).getI01BALANC());
					bean.setI01BALGBL(((IIN091801Message) newmessage).getI01BALGBL());
					bean.setI01BALUNC(((IIN091801Message) newmessage).getI01BALUNC());
					bean.setI01BALHLD(((IIN091801Message) newmessage).getI01BALHLD());
					bean.setI01BALNBL(((IIN091801Message) newmessage).getI01BALNBL());
					bean.setI01CUSIDN(((IIN091801Message) newmessage).getI01CUSIDN());
					bean.setI01CUSTID(((IIN091801Message) newmessage).getI01CUSTID());
					bean.setI01ACMCCY(((IIN091801Message) newmessage).getH01OPECOD());
					bean.setI01NUMREC(((IIN091801Message) newmessage).getI01NUMREC());
					bean.setI01INDOPE(((IIN091801Message) newmessage).getI01INDOPE());
					x.add(bean);
					newmessage = mc.receiveMessage();
					if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("0"))) {
						log.error("IIN091801 - Historico de transacciones: " + res.getError().getERNU01() + " - " + res.getError().getERDS01());
						manejarError(res, ((ELEERRMessage) newmessage));
						return res;
					}
					GoIn = !((IIN091801Message) newmessage).getI01INDOPE().equals("*");
				}
				res.setIIN091801(x.toArray(new IIN091801Bean[0]));
			}
			
			
		} catch (Exception e) {
			log.error("Historico de transacciones - " + e.getMessage() + " - Canal " + req.getCanal(),e);
			throw new WSException(e);
		} finally {
			if (s != null)
				try {
					s.close();
				} catch (IOException e) {
				}
		}
		log.error("IIN091801 - res: " + res);
		return res;
	}
        
	/**
	 * Servicio para la búsqueda avanzada de movimientos, por mes o por fechas, nro de cheques o montos.
	 * @param req
	 * @return
	 * @throws WSException
	 */
	public STMRDSJVResponse STMRDSJV(STMRDSJVBean req) throws WSException {
		log.info("Invocando STMRDSJV");
		Parametros params = new Parametros();
		STMRDSJVResponse res = new STMRDSJVResponse();
		Socket s = null;
		try {
			s = new Socket(params.getString("ip"), params.getInt("port7"));
			s.setSoTimeout(params.getInt("timeout"));
			MessageContext mc = new MessageContext(new DataInputStream(new BufferedInputStream(s.getInputStream())), new DataOutputStream(
					new BufferedOutputStream(s.getOutputStream())), "com.activo.gateway.dibs.messages");
			STMRDSJVMessage message = null;
			message = (STMRDSJVMessage) mc.getMessageRecord("STMRDSJV");
			if(req.getRSTUSR() != null && !"".equals(req.getRSTUSR()))message.setRSTUSR(req.getRSTUSR());
			if(req.getRSTACC() != null && !"".equals(req.getRSTACC()))message.setRSTACC(req.getRSTACC());
			if(req.getRSTCAF() != null && !"".equals(req.getRSTCAF()))message.setRSTCAF(req.getRSTCAF());
			if(req.getRSTFD1() != null && !"".equals(req.getRSTFD1()))message.setRSTFD1(req.getRSTFD1());
			if(req.getRSTFD2() != null && !"".equals(req.getRSTFD2()))message.setRSTFD2(req.getRSTFD2());
			if(req.getRSTFD3() != null && !"".equals(req.getRSTFD3()))message.setRSTFD3(req.getRSTFD3());
			if(req.getRSTTD1() != null && !"".equals(req.getRSTTD1()))message.setRSTTD1(req.getRSTTD1());
			if(req.getRSTTD2() != null && !"".equals(req.getRSTTD2()))message.setRSTTD2(req.getRSTTD2());
			if(req.getRSTTD3() != null && !"".equals(req.getRSTTD3()))message.setRSTTD3(req.getRSTTD3());
			if(req.getRSTFCK() != null && !"".equals(req.getRSTFCK()))message.setRSTFCK(req.getRSTFCK());
			if(req.getRSTTCK() != null && !"".equals(req.getRSTTCK()))message.setRSTTCK(req.getRSTTCK());
			if(req.getRSTFAM() != null && !"".equals(req.getRSTFAM()))message.setRSTFAM(req.getRSTFAM());
			if(req.getRSTTAM() != null && !"".equals(req.getRSTTAM()))message.setRSTTAM(req.getRSTTAM());
			if(req.getRSTFRC() != null && !"".equals(req.getRSTFRC()))message.setRSTFRC(req.getRSTFRC());
			if(req.getRSTFBL() != null && !"".equals(req.getRSTFBL()))message.setRSTFBL(req.getRSTFBL());
			message.send();
			message.destroy();
			MessageRecord newmessage = mc.receiveMessage();
			if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("0"))) {
				manejarError(res, ((ELEERRMessage) newmessage));
				log.error("STMRDSJV - Detalle de la Cuenta: " +"Error: "+ res.getError().getERNU01() + " - " + res.getError().getERDS01() + " - Canal " + req.getCanal());
				return res;
			} else {
				newmessage = mc.receiveMessage();
				if (newmessage.getFormatName().equals("STMBDSJV")) {
					STMBDSJVMessage statementBasic = (STMBDSJVMessage) newmessage;
					STMBDSJVBean bean = new STMBDSJVBean();
					bean.setSTBUSR(statementBasic.getSTBUSR());
					bean.setSTBACC(statementBasic.getSTBACC());
					bean.setSTBCUN(statementBasic.getSTBCUN());
					bean.setSTBNA1(statementBasic.getSTBNA1());
					bean.setSTBCCY(statementBasic.getSTBCCY());
					bean.setSTBATY(statementBasic.getSTBATY());
					bean.setSTBPRO(statementBasic.getSTBPRO());
					bean.setSTBOFC(statementBasic.getSTBOFC());
					bean.setSTBMGB(statementBasic.getSTBMGB());
					bean.setSTBUNC(statementBasic.getSTBUNC());
					bean.setSTBMNB(statementBasic.getSTBMNB());
					bean.setSTBHOL(statementBasic.getSTBHOL());
					bean.setSTBAVL(statementBasic.getSTBAVL());
					bean.setSTBGAV(statementBasic.getSTBGAV());
					bean.setSTBNAV(statementBasic.getSTBNAV());
					bean.setSTBCLI(statementBasic.getSTBCLI());
					bean.setSTBOIA(statementBasic.getSTBOIA());
					bean.setSTBIAC(statementBasic.getSTBIAC());
					bean.setSTBTM1(statementBasic.getSTBTM1());
					bean.setSTBTM2(statementBasic.getSTBTM2());
					bean.setSTBTM3(statementBasic.getSTBTM3());
					bean.setSTBMA1(statementBasic.getSTBMA1());
					bean.setSTBMA2(statementBasic.getSTBMA2());
					bean.setSTBMA3(statementBasic.getSTBMA3());
					bean.setSTBMA4(statementBasic.getSTBMA4());
					bean.setSTBCTY(statementBasic.getSTBCTY());
					bean.setSTBCTR(statementBasic.getSTBCTR());
					bean.setSTBSTE(statementBasic.getSTBSTE());
					bean.setSTBZPC(statementBasic.getSTBZPC());
					bean.setSTBPOB(statementBasic.getSTBPOB());
					bean.setSTBIAD(statementBasic.getSTBIAD());
					bean.setSTBFAX(statementBasic.getSTBFAX());
					bean.setSTBMLC(statementBasic.getSTBMLC());
					bean.setSTBNX1(statementBasic.getSTBNX1());
					bean.setSTBNX2(statementBasic.getSTBNX2());
					bean.setSTBNX3(statementBasic.getSTBNX3());
					bean.setSTBLP1(statementBasic.getSTBLP1());
					bean.setSTBLP2(statementBasic.getSTBLP2());
					bean.setSTBLP3(statementBasic.getSTBLP3());
					bean.setSTBMIP(statementBasic.getSTBMIP());
					bean.setSTBLSP(statementBasic.getSTBLSP());
					res.setSTMBDSJV(bean);
				}
				newmessage = mc.receiveMessage();
				if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("0"))) {
					manejarError(res, ((ELEERRMessage) newmessage));
					return res;
				}
				if (newmessage.getFormatName().equals("STMSDSJV")) {
					List<STMSDSJVBean> x = new ArrayList<STMSDSJVBean>();
					for (boolean GoIn = !((STMSDSJVMessage) newmessage).getSTMREC().equals("9999999"); GoIn; GoIn = !((STMSDSJVMessage) newmessage)
							.getSTMREC().equals("9999999")) {
						STMSDSJVBean bean = new STMSDSJVBean();
						bean.setSTMUSR(((STMSDSJVMessage) newmessage).getSTMUSR());
						bean.setSTMACC(((STMSDSJVMessage) newmessage).getSTMACC());
						bean.setSTMCDE(((STMSDSJVMessage) newmessage).getSTMCDE());
						bean.setSTMNAR(((STMSDSJVMessage) newmessage).getSTMNAR());
						bean.setSTMBD1(((STMSDSJVMessage) newmessage).getSTMBD1());
						bean.setSTMBD2(((STMSDSJVMessage) newmessage).getSTMBD2());
						bean.setSTMBD3(((STMSDSJVMessage) newmessage).getSTMBD3());
						bean.setSTMCKN(((STMSDSJVMessage) newmessage).getSTMCKN());
						bean.setSTMBBL(((STMSDSJVMessage) newmessage).getSTMBBL());
						bean.setSTMAMT(((STMSDSJVMessage) newmessage).getSTMAMT());
						bean.setSTMDCC(((STMSDSJVMessage) newmessage).getSTMDCC());
						bean.setSTMEBL(((STMSDSJVMessage) newmessage).getSTMEBL());
						bean.setSTMREC(((STMSDSJVMessage) newmessage).getSTMREC());
						bean.setSTMMEM(((STMSDSJVMessage) newmessage).getSTMMEM());
						bean.setSTMEND(((STMSDSJVMessage) newmessage).getSTMEND());
						bean.setSTMDRR(((STMSDSJVMessage) newmessage).getSTMDRR());
						bean.setSTMNNAR(((STMSDSJVMessage) newmessage).getSTMNNAR());
						bean.setSTMNA1(((STMSDSJVMessage) newmessage).getSTMNA1());
						bean.setSTMNA2(((STMSDSJVMessage) newmessage).getSTMNA2());
						bean.setSTMNA3(((STMSDSJVMessage) newmessage).getSTMNA3());
						bean.setSTMNA4(((STMSDSJVMessage) newmessage).getSTMNA4());
						bean.setSTMNA5(((STMSDSJVMessage) newmessage).getSTMNA5());
						bean.setSTMNA6(((STMSDSJVMessage) newmessage).getSTMNA6());
						bean.setSTMNA7(((STMSDSJVMessage) newmessage).getSTMNA7());
						bean.setSTMNA8(((STMSDSJVMessage) newmessage).getSTMNA8());
						bean.setSTMNA9(((STMSDSJVMessage) newmessage).getSTMNA9());
						x.add(bean);
						newmessage = mc.receiveMessage();
						if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("0"))) {
							manejarError(res, ((ELEERRMessage) newmessage));
							return res;
						}
					}
					res.setSTMSDSJV(x.toArray(new STMSDSJVBean[0]));
				}
			}
		} catch (Exception e) {
			log.error("STMRDSJV - Detalle de Cuenta - " + e.getMessage() + " - Canal " + req.getCanal(),e);
			throw new WSException(e);
		} finally {
			if (s != null)
				try {
					s.close();
				} catch (IOException e) {
				}
		}
		return res;
	}
        
        /**
         * Servicio para detalle de un credito UVCC / UVCP en particular
         */
        public SUMDSJV4Response SUMDSJV4(SUMDSJV4Bean req) throws WSException{
            log.info("Invocando SUMDSJV4");
            Socket s = null;
            SUMDSJV4Response res = new SUMDSJV4Response();
            List<SUMDSJV4Bean> x = new ArrayList<SUMDSJV4Bean>();
            try{
                Parametros params = new Parametros();
			MessageContext mc;
			s = new Socket(params.getString("ip"), params.getInt("port7"));
			s.setSoTimeout(params.getInt("timeout"));
			mc = new MessageContext(new DataInputStream(new BufferedInputStream(s.getInputStream())), new DataOutputStream(
					new BufferedOutputStream(s.getOutputStream())), "com.activo.gateway.dibs.messages");
			SUMDSJV4EMessage message = (SUMDSJV4EMessage) mc.getMessageRecord("SUMDSJV4E");
                        if(req.getSUMACC4() != null && !"".equals(req.getSUMACC4()))message.setSUMACC4(req.getSUMACC4());
                        message.send();
			message.destroy();
                        
                        MessageRecord newmessage = mc.receiveMessage();
                        SUMDSJV4SMessage newmessage1 = (SUMDSJV4SMessage) newmessage;
                        SUMDSJV4Bean bean = new SUMDSJV4Bean();
                        bean.setSUMACCS4(newmessage1.getSUMACCS4());
                        bean.setSUMCUNS4(newmessage1.getSUMCUNS4());
                        bean.setSUMMTOCBS(newmessage1.getSUMMTOCBS());
                        bean.setSUMMTOCUVC(newmessage1.getSUMMTOCUVC());
                        bean.setSUMMTOIBS(newmessage1.getSUMMTOIBS());
                        bean.setSUMMTOIUVC(newmessage1.getSUMMTOIUVC());
                        bean.setSUMSDD4(newmessage1.getSUMSDD4());
                        bean.setSUMSMM4(newmessage1.getSUMSMM4());
                        bean.setSUMSYY4(newmessage1.getSUMSYY4());
                        x.add(bean);
                        res.setSUMDSJV4(x.toArray(new SUMDSJV4Bean[0]));
                        
            }catch(Exception e){
                log.error("SUMDSJV4 - Detalle UCVV - UVCP - " + e.getMessage(),e);
                throw new WSException(e);
            }finally {
			if (s != null)
				try {
					s.close();
				} catch (IOException e){
				}
		}
            return res;
        }
        
        /**
         * Servicio para consolidado de montos UCVV / UCVP 
         */
        public SUMDSJV3Response SUMDSJV3(SUMDSJV3Bean req) throws WSException{
            log.info("Invocando SUMDSJV3");
            Socket s = null;
            SUMDSJV3Response res = new SUMDSJV3Response();
            List<SUMDSJV3Bean> x = new ArrayList<SUMDSJV3Bean>();
            try{
                Parametros params = new Parametros();
			MessageContext mc;
			s = new Socket(params.getString("ip"), params.getInt("port7"));
			s.setSoTimeout(params.getInt("timeout"));
			mc = new MessageContext(new DataInputStream(new BufferedInputStream(s.getInputStream())), new DataOutputStream(
					new BufferedOutputStream(s.getOutputStream())), "com.activo.gateway.dibs.messages");
			SUMDSJV3EMessage message = (SUMDSJV3EMessage) mc.getMessageRecord("SUMDSJV3E");
                        //List<SUMDSJV3SBean> x = new ArrayList<SUMDSJV3SBean>();
                        if(req.getSUMUSR3()!= null && !"".equals(req.getSUMUSR3())) message.setSUMUSR3(req.getSUMUSR3());
                        message.send();
			message.destroy();
                        
                        MessageRecord newmessage = mc.receiveMessage();
                        SUMDSJV3SMessage newmessage1 = (SUMDSJV3SMessage) newmessage;
                        
                        for (boolean GoIn = !"".equals(newmessage1.getSUMUSRS3().trim()); GoIn; GoIn = !"".equals(newmessage1.getSUMUSRS3().trim())) {
                            SUMDSJV3Bean bean = new SUMDSJV3Bean();
                            bean.setSUMCBSR3(newmessage1.getSUMCBSR3());
                            bean.setSUMSDBBSR3(newmessage1.getSUMSDBBSR3());
                            bean.setSUMSCUVCC3(newmessage1.getSUMSCUVCC3());
                            bean.setSUMSDUVCC3(newmessage1.getSUMSDUVCC3());
                            bean.setSUMUSRS3(newmessage1.getSUMUSRS3());
                            bean.setSUMACCS3(newmessage1.getSUMACCS3());
                            bean.setSUMCBS3(newmessage1.getSUMCBS3());
                            bean.setSUMCOBS3(newmessage1.getSUMCOBS3());
                            x.add(bean);
                            newmessage = mc.receiveMessage();
                            newmessage1 = (SUMDSJV3SMessage) newmessage;
                        }
                        res.setSUMDSJV3(x.toArray(new SUMDSJV3Bean[0]));
            }catch(Exception e){
                log.error("SUMDSJV3 - Montos UCVV - UVCP - " + e.getMessage(),e);
                throw new WSException(e);
            } finally {
			if (s != null)
				try {
					s.close();
				} catch (IOException e){
				}
		}
            return res;
        }
        
	/**
	 * Servicio para que lista los productos que posee el cliente, consolidado de productos.
	 * @param req
	 * @return
	 * @throws WSException
	 * @throws SocketException 
	 */
	public SUMDSJVResponse SUMDSJV(SUMDSJVBean req) throws WSException{
		log.info("Invocando SUMDSJV2");
		Socket s = null;
		SUMDSJVResponse res = new SUMDSJVResponse();
		Database db = new Database();
		String tipoDocumento = null, documento = null, documentoI = null;
		try {
			Parametros params = new Parametros();
			MessageContext mc;
			s = new Socket(params.getString("ip"), params.getInt("port7"));
			s.setSoTimeout(params.getInt("timeout"));
			mc = new MessageContext(new DataInputStream(new BufferedInputStream(s.getInputStream())), new DataOutputStream(
					new BufferedOutputStream(s.getOutputStream())), "com.activo.gateway.dibs.messages");
			SUMDSJV2Message message = null;
			List<SUMDSJVBean> x = new ArrayList<SUMDSJVBean>();
			List<ILN006001Bean> y = new ArrayList<ILN006001Bean>();
			String producto = null;
			message = (SUMDSJV2Message) mc.getMessageRecord("SUMDSJV2");
			if(req.getSUMUSR() != null && !"".equals(req.getSUMUSR()))message.setSUMUSR(req.getSUMUSR());
			if(req.getSUMFLG() != null && !"".equals(req.getSUMFLG()))message.setSUMFLG(req.getSUMFLG());
			if(req.getSUMTYP() != null && !"".equals(req.getSUMTYP()))message.setSUMTYP(req.getSUMTYP());
			if(req.getSUMDSC() != null && !"".equals(req.getSUMDSC()))message.setSUMDSC(req.getSUMDSC());
			if(req.getSUMACN() != null && !"".equals(req.getSUMACN()))message.setSUMACN(req.getSUMACN());
			if(req.getSUMBAL() != null && !"".equals(req.getSUMBAL()))message.setSUMBAL(req.getSUMBAL());
			if(req.getSUMAVB() != null && !"".equals(req.getSUMAVB()))message.setSUMAVB(req.getSUMAVB());
			if(req.getSUMCCY() != null && !"".equals(req.getSUMCCY()))message.setSUMCCY(req.getSUMCCY());
			if(req.getSUMNNM() != null && !"".equals(req.getSUMNNM()))message.setSUMNNM(req.getSUMNNM());
			if(req.getSUMFIR() != null && !"".equals(req.getSUMFIR()))message.setSUMFIR(req.getSUMFIR());
			if(req.getSUMNEM()!= null && !"".equals(req.getSUMNEM()))message.setSUMNEM(req.getSUMNEM());
			message.send();
			message.destroy();
			//obtenemos el tipo de documento y documento de identificación de la consulta
			boolean bandera = false;
			if(req.getSUMACN() != null && !"".equals(req.getSUMACN()) && "X".equals(req.getSUMFIR())){
				bandera = true;
				tipoDocumento = req.getSUMACN().substring(0, 1);
				documento = req.getSUMACN().substring(1);
				int docI = 0;
				if(!"P".equals(tipoDocumento)){
					docI = Integer.parseInt(documento);
					documentoI = Integer.toString(docI);
				}else{
					documentoI = req.getSUMACN().substring(1);
				}
			}
			Usuario[] usuario;
			String p = null;
			MessageRecord newmessage = mc.receiveMessage();
			if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("0"))) {
				manejarError(res, ((ELEERRMessage) newmessage));
				log.error("SUMDSJV - Resumen de Productos: " +"Error: "+ res.getError().getERNU01() + " - " + res.getError().getERDS01() + "- Canal " + req.getCanal());
				return res;
			}	
			SUMDSJV2Message newmessage2 = (SUMDSJV2Message) newmessage;
			for (boolean GoIn = newmessage2.getSUMFLG().equals("1") || newmessage2.getSUMFLG().equals("2"); GoIn; GoIn = newmessage2.getSUMFLG()
					.equals("1") || newmessage2.getSUMFLG().equals("2")) {
				SUMDSJVBean bean = new SUMDSJVBean();
				bean.setSUMUSR(newmessage2.getSUMUSR());
				bean.setSUMFLG(newmessage2.getSUMFLG());
				bean.setSUMTYP(newmessage2.getSUMTYP());
				bean.setSUMDSC(newmessage2.getSUMDSC());
				bean.setSUMACN(newmessage2.getSUMACN());
				bean.setSUMBAL(newmessage2.getSUMBAL());
				bean.setSUMAVB(newmessage2.getSUMAVB());
				bean.setSUMCCY(newmessage2.getSUMCCY());
				bean.setSUMNNM(newmessage2.getSUMNNM());
				bean.setSUMFIR(newmessage2.getSUMFIR());
				bean.setSUMAST(newmessage2.getSUMAST());
				bean.setSUMF01(newmessage2.getSUMF01());
				bean.setSUMF02(newmessage2.getSUMF02());
				//Recuperar el alias de la base de datos
				producto = newmessage2.getSUMACN().trim();
				if(bandera){
					if(db.conectar()){
						try {
							usuario = db.buscarUsuarioSUMDSJV(tipoDocumento,documentoI, req.getCanal());
							if("".equals(usuario)){
								res.getError().setERRNUM("1");
								res.getError().setERNU01("-3");
								res.getError().setERDS01("Usuario no existe");
								log.error(res.getError().getERDS01());
								bean.setSUMNEM("");
								return res;
							}else if(usuario.length > 0){
								p =	db.buscarAlias(usuario[0].getId(),producto, req.getCanal());
								bean.setSUMNEM(p);
							}
						} catch (Exception e) {
							res.getError().setERRNUM("1");
							res.getError().setERNU01("60962");
							res.getError().setERDS01(e.getMessage());
							log.error(e);
							return res;
						}	
					}else{// error al conectar
						res.getError().setERRNUM("1");
						res.getError().setERNU01("-1");
						res.getError().setERDS01("Error en la conexión");
					}
				}
				bean.setSUMNEM(p);
				x.add(bean);
				newmessage2 = (SUMDSJV2Message) mc.receiveMessage();
			}
			newmessage = mc.receiveMessage();
			if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("0"))) {
				manejarError(res, ((ELEERRMessage) newmessage));
				return res;
			}
			//
			ILN006001Message newmessage3 = (ILN006001Message) newmessage;
			for (boolean GoIn = !newmessage3.getLN61LNECCY().equals("***"); GoIn; GoIn = !newmessage3.getLN61LNECCY().equals("***")) {
				ILN006001Bean bean2 = new ILN006001Bean();
				bean2.setLN61USER(newmessage3.getLN61USER());
				bean2.setLN61TYPE(newmessage3.getLN61TYPE());
				bean2.setLN61LNECUN(newmessage3.getLN61LNECUN());
				bean2.setLN61LNENUM(newmessage3.getLN61LNENUM());
				bean2.setLN61LNETYL(newmessage3.getLN61LNETYL());
				bean2.setLN61LNECCY(newmessage3.getLN61LNECCY());
				bean2.setLN61LNEAMN(newmessage3.getLN61LNEAMN());
				bean2.setLN61LNEREA(newmessage3.getLN61LNEREA());
				bean2.setLN61LNEAMU(newmessage3.getLN61LNEAMU());
				bean2.setLN61LNEOFA(newmessage3.getLN61LNEOFA());
				bean2.setLN61COLAMT(newmessage3.getLN61COLAMT());
				bean2.setLN61LNEOCM(newmessage3.getLN61LNEOCM());
				bean2.setLN61LNERE1(newmessage3.getLN61LNERE1());
				bean2.setLN61LNERE2(newmessage3.getLN61LNERE2());
				bean2.setLN61LNERE3(newmessage3.getLN61LNERE3());
				bean2.setLN61LNEPUR(newmessage3.getLN61LNEPUR());
				bean2.setLN61LNEOP1(newmessage3.getLN61LNEOP1());
				bean2.setLN61LNEOP2(newmessage3.getLN61LNEOP2());
				bean2.setLN61LNEOP3(newmessage3.getLN61LNEOP3());
				bean2.setLN61LNEMT1(newmessage3.getLN61LNEMT1());
				bean2.setLN61LNEMT2(newmessage3.getLN61LNEMT2());
				bean2.setLN61LNEMT3(newmessage3.getLN61LNEMT3());
				bean2.setLN61AVAILA(newmessage3.getLN61AVAILA());
				y.add(bean2);
				newmessage = mc.receiveMessage();
				if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("0"))) {
					manejarError(res, ((ELEERRMessage) newmessage));
					return res;
				}
				newmessage3 = (ILN006001Message) newmessage;
			}
			res.setSUMDSJV(x.toArray(new SUMDSJVBean[0]));
			res.setILN006001(y.toArray(new ILN006001Bean[0]));
		} catch (Exception e) { 
			log.error("SUMDSJV - Resumen de productos - " + e.getMessage() + " - Canal " + req.getCanal(),e);
			throw new WSException(e);
		} finally {
			if (s != null)
				try {
					s.close();
				} catch (IOException e){
				}
		}
		return res;
	}
	/**
	 * Servicio utilizado para el Cambio de password.
	 * @param req
	 * @return
	 * @throws WSException
	 */
	public PWDDSJVResponse PWDDSJV(PWDDSJVBean req) throws WSException {
		log.info("Invocando PWDDSJV");
		Socket s = null;
		PWDDSJVResponse res = new PWDDSJVResponse();
		try {
			Parametros params = new Parametros();
			MessageContext mc;
			s = new Socket(params.getString("ip"), params.getInt("port1"));
			s.setSoTimeout(params.getInt("timeout"));
			mc = new MessageContext(new DataInputStream(new BufferedInputStream(s.getInputStream())), new DataOutputStream(
					new BufferedOutputStream(s.getOutputStream())), "com.activo.gateway.dibs.messages");
			PWDDSJVMessage message;
			message = (PWDDSJVMessage) mc.getMessageRecord("PWDDSJV");
			if(req.getPWDUSR() != null && !"".equals(req.getPWDUSR()))
				message.setPWDUSR(req.getPWDUSR());
			if(req.getPWDPWD() != null && !"".equals(req.getPWDPWD()))
				message.setPWDPWD(req.getPWDPWD());
			if(req.getPWDNPW() != null && !"".equals(req.getPWDNPW()))
				message.setPWDNPW(req.getPWDNPW());
			if(req.getPWDCPW() != null && !"".equals(req.getPWDCPW()))
				message.setPWDCPW(req.getPWDCPW());
			if(req.getPWDNCH() != null && !"".equals(req.getPWDNCH()))
				message.setPWDNCH(req.getPWDNCH());
			if(req.getPWDSTS() != null && !"".equals(req.getPWDSTS()))
				message.setPWDSTS(req.getPWDSTS());
			if(req.getPWDOPR() != null && !"".equals(req.getPWDOPR()))
				message.setPWDOPR(req.getPWDOPR());
			if(req.getPWDCFM() != null && !"".equals(req.getPWDCFM()))
				message.setPWDCFM(req.getPWDCFM());
			if(req.getPWDTRA() != null && !"".equals(req.getPWDTRA()))
				message.setPWDTRA(req.getPWDTRA());
			if(req.getPWDBPA() != null && !"".equals(req.getPWDBPA()))
				message.setPWDBPA(req.getPWDBPA());
			if(req.getPWDLCA() != null && !"".equals(req.getPWDLCA()))
				message.setPWDLCA(req.getPWDLCA());
			if(req.getPWDLNP() != null && !"".equals(req.getPWDLNP()))
				message.setPWDLNP(req.getPWDLNP());
			if(req.getPWDCCP() != null && !"".equals(req.getPWDCCP()))
				message.setPWDCCP(req.getPWDCCP());
			if(req.getPWDMAX() != null && !"".equals(req.getPWDMAX()))
				message.setPWDMAX(req.getPWDMAX());
			if(req.getPWDDTF() != null && !"".equals(req.getPWDDTF()))
				message.setPWDDTF(req.getPWDDTF());
			if(req.getPWDLGT() != null && !"".equals(req.getPWDLGT()))
				message.setPWDLGT(req.getPWDLGT());
			if(req.getPWDCMP() != null && !"".equals(req.getPWDCMP()))
				message.setPWDCMP(req.getPWDCMP());
			if(req.getPWDACL() != null && !"".equals(req.getPWDACL()))
				message.setPWDACL(req.getPWDACL());
			if(req.getPWDINC() != null && !"".equals(req.getPWDINC()))
				message.setPWDINC(req.getPWDINC());
			if(req.getPWDBUC() != null && !"".equals(req.getPWDBUC()))
				message.setPWDBUC(req.getPWDBUC());
			if(req.getPWDGEC() != null && !"".equals(req.getPWDGEC()))
				message.setPWDGEC(req.getPWDGEC());
			if(req.getPWDIAD() != null && !"".equals(req.getPWDIAD()))
				message.setPWDIAD(req.getPWDIAD());
			message.send();
			message.destroy();
			MessageRecord newmessage = mc.receiveMessage();
			if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("0"))) {
				manejarError(res, ((ELEERRMessage) newmessage));
				return res;
			}
			PWDDSJVMessage newmessage2 = (PWDDSJVMessage) newmessage;
			res.setPWDDSJV(new PWDDSJVBean());
			res.getPWDDSJV().setPWDUSR(newmessage2.getPWDUSR());
			res.getPWDDSJV().setPWDPWD(newmessage2.getPWDPWD());
			res.getPWDDSJV().setPWDNPW(newmessage2.getPWDNPW());
			res.getPWDDSJV().setPWDCPW(newmessage2.getPWDCPW());
			res.getPWDDSJV().setPWDNCH(newmessage2.getPWDNCH());
			res.getPWDDSJV().setPWDSTS(newmessage2.getPWDSTS());
			res.getPWDDSJV().setPWDOPR(newmessage2.getPWDOPR());
			res.getPWDDSJV().setPWDCFM(newmessage2.getPWDCFM());
			res.getPWDDSJV().setPWDTRA(newmessage2.getPWDTRA());
			res.getPWDDSJV().setPWDBPA(newmessage2.getPWDBPA());
			res.getPWDDSJV().setPWDLCA(newmessage2.getPWDLCA());
			res.getPWDDSJV().setPWDLNP(newmessage2.getPWDLNP());
			res.getPWDDSJV().setPWDCCP(newmessage2.getPWDCCP());
			res.getPWDDSJV().setPWDMAX(newmessage2.getPWDMAX());
			res.getPWDDSJV().setPWDDTF(newmessage2.getPWDDTF());
			res.getPWDDSJV().setPWDLGT(newmessage2.getPWDLGT());
			res.getPWDDSJV().setPWDCMP(newmessage2.getPWDCMP());
			res.getPWDDSJV().setPWDACL(newmessage2.getPWDACL());
			res.getPWDDSJV().setPWDINC(newmessage2.getPWDINC());
			res.getPWDDSJV().setPWDBUC(newmessage2.getPWDBUC());
			res.getPWDDSJV().setPWDGEC(newmessage2.getPWDGEC());
			res.getPWDDSJV().setPWDIAD(newmessage2.getPWDIAD());
		} catch (Exception e) {
			log.error(e);
			throw new WSException(e);
		} finally {
			if (s != null)
				try {
					s.close();
				} catch (IOException e) {
				}
		}
		return res;
	}
	/**
	 * Servicio para el Manejo de mensajes.
	 * * @param req
	 * @return
	 * @throws WSException
	 */
	public IMSSGDSJVResponse IMSSGDSJV(IMSSGDSJVBean req) throws WSException {
		log.info("Invocando IMSSGDSJV");
		Socket s = null;
		IMSSGDSJVResponse res = new IMSSGDSJVResponse();
		try {
			Parametros params = new Parametros();
			MessageContext mc;
			s = new Socket(params.getString("ip"), params.getInt("port1"));
			s.setSoTimeout(params.getInt("timeout"));
			mc = new MessageContext(new DataInputStream(new BufferedInputStream(s.getInputStream())), new DataOutputStream(
					new BufferedOutputStream(s.getOutputStream())), "com.activo.gateway.dibs.messages");
			IMSSGDSJVMessage message = (IMSSGDSJVMessage) mc.getMessageRecord("IMSSGDSJV");
			if(req.getDSJIMSUSR() != null && !"".equals(req.getDSJIMSUSR()))message.setDSJIMSUSR(req.getDSJIMSUSR());
			if(req.getDSJNUM() != null && !"".equals(req.getDSJNUM()))message.setDSJNUM(req.getDSJNUM());
			if(req.getDSJIMSPRD() != null && !"".equals(req.getDSJIMSPRD()))message.setDSJIMSPRD(req.getDSJIMSPRD());
			if(req.getDSJIMSCUN() != null && !"".equals(req.getDSJIMSCUN()))message.setDSJIMSCUN(req.getDSJIMSCUN());
			if(req.getDSJIMSSDTE() != null && !"".equals(req.getDSJIMSSDTE()))message.setDSJIMSSDTE(req.getDSJIMSSDTE());
			if(req.getDSJIMSSTIM() != null && !"".equals(req.getDSJIMSSTIM()))message.setDSJIMSSTIM(req.getDSJIMSSTIM());
			if(req.getDSJIMSTXT() != null && !"".equals(req.getDSJIMSTXT()))message.setDSJIMSTXT(req.getDSJIMSTXT());
			if(req.getDSJIMSLNKT() != null && !"".equals(req.getDSJIMSLNKT()))message.setDSJIMSLNKT(req.getDSJIMSLNKT());
			if(req.getDSJIMSKEY() != null && !"".equals(req.getDSJIMSKEY()))message.setDSJIMSKEY(req.getDSJIMSKEY());
			if(req.getDSJIMSNME() != null && !"".equals(req.getDSJIMSNME()))message.setDSJIMSNME(req.getDSJIMSNME());
			if(req.getDSJIMSFIN() != null && !"".equals(req.getDSJIMSFIN()))message.setDSJIMSFIN(req.getDSJIMSFIN());
			message.send();
			message.destroy();
			MessageRecord newmessage = mc.receiveMessage();
			if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("0"))) {
				manejarError(res, ((ELEERRMessage) newmessage));
				return res;
			}
			IMSSGDSJVMessage newmessage2 = (IMSSGDSJVMessage) newmessage;
			res.setIMSSGDSJV(new IMSSGDSJVBean());
			res.getIMSSGDSJV().setDSJIMSUSR(newmessage2.getDSJIMSUSR());
			res.getIMSSGDSJV().setDSJNUM(newmessage2.getDSJNUM());
			res.getIMSSGDSJV().setDSJIMSPRD(newmessage2.getDSJIMSPRD());
			res.getIMSSGDSJV().setDSJIMSCUN(newmessage2.getDSJIMSCUN());
			res.getIMSSGDSJV().setDSJIMSSDTE(newmessage2.getDSJIMSSDTE());
			res.getIMSSGDSJV().setDSJIMSSTIM(newmessage2.getDSJIMSSTIM());
			res.getIMSSGDSJV().setDSJIMSTXT(newmessage2.getDSJIMSTXT());
			res.getIMSSGDSJV().setDSJIMSLNKT(newmessage2.getDSJIMSLNKT());
			res.getIMSSGDSJV().setDSJIMSKEY(newmessage2.getDSJIMSKEY());
			res.getIMSSGDSJV().setDSJIMSNME(newmessage2.getDSJIMSNME());
			res.getIMSSGDSJV().setDSJIMSFIN(newmessage2.getDSJIMSFIN());
		} catch (Exception e) {
			log.error(e);
			throw new WSException(e);
		} finally {
			if (s != null)
				try {
					s.close();
				} catch (IOException e) {
				}
		}
		return res;
	}
	/**
	 * Servicio para la Consuta de Préstamos, Detalle del crédito.
	 *  @param req
	 * @return
	 * @throws WSException
	 */
	public LNSDSJVResponse LNSDSJV(LNSDSJVBean req) throws WSException {
		log.info("Invocando LNSDSJV");
		Parametros params = new Parametros();
		Socket s = null;
		LNSDSJVResponse res = new LNSDSJVResponse();
		try {
			MessageContext mc;
			s = new Socket(params.getString("ip"), params.getInt("port1"));
			s.setSoTimeout(params.getInt("timeout"));
			mc = new MessageContext(new DataInputStream(new BufferedInputStream(s.getInputStream())), new DataOutputStream(
					new BufferedOutputStream(s.getOutputStream())), "com.activo.gateway.dibs.messages");
			LNSDSJV2Message message = (LNSDSJV2Message) mc.getMessageRecord("LNSDSJV2");
			if(req.getLNSUSR() != null && !"".equals(req.getLNSUSR()))message.setLNSUSR(req.getLNSUSR());
			if(req.getLNSACC() != null && !"".equals(req.getLNSACC()))message.setLNSACC(req.getLNSACC());
			if(req.getLNSCCY() != null && !"".equals(req.getLNSCCY()))message.setLNSCCY(req.getLNSCCY());
			if(req.getLNSPRI() != null && !"".equals(req.getLNSPRI()))message.setLNSPRI(req.getLNSPRI());
			if(req.getLNSINT() != null && !"".equals(req.getLNSINT()))message.setLNSINT(req.getLNSINT());
			if(req.getLNSLCH() != null && !"".equals(req.getLNSLCH()))message.setLNSLCH(req.getLNSLCH());
			if(req.getLNSSCR() != null && !"".equals(req.getLNSSCR()))message.setLNSSCR(req.getLNSSCR());
			if(req.getLNSPOF() != null && !"".equals(req.getLNSPOF()))message.setLNSPOF(req.getLNSPOF());
			if(req.getLNSPMT() != null && !"".equals(req.getLNSPMT()))message.setLNSPMT(req.getLNSPMT());
			if(req.getLNSNOP1() != null && !"".equals(req.getLNSNOP1()))message.setLNSNOP1(req.getLNSNOP1());
			if(req.getLNSNOP2() != null && !"".equals(req.getLNSNOP2()))message.setLNSNOP2(req.getLNSNOP2());
			if(req.getLNSNOP3() != null && !"".equals(req.getLNSNOP3()))message.setLNSNOP3(req.getLNSNOP3());
			if(req.getLNSNXP1() != null && !"".equals(req.getLNSNXP1()))message.setLNSNXP1(req.getLNSNXP1());
			if(req.getLNSNXP2() != null && !"".equals(req.getLNSNXP2()))message.setLNSNXP2(req.getLNSNXP2());
			if(req.getLNSNXP3() != null && !"".equals(req.getLNSNXP3()))message.setLNSNXP3(req.getLNSNXP3());
			if(req.getLNSMAT1() != null && !"".equals(req.getLNSMAT1()))message.setLNSMAT1(req.getLNSMAT1());
			if(req.getLNSMAT2() != null && !"".equals(req.getLNSMAT2()))message.setLNSMAT2(req.getLNSMAT2());
			if(req.getLNSMAT3() != null && !"".equals(req.getLNSMAT3()))message.setLNSMAT3(req.getLNSMAT3());
			if(req.getLNSRTE() != null && !"".equals(req.getLNSRTE()))message.setLNSRTE(req.getLNSRTE());
			if(req.getLNSCLI() != null && !"".equals(req.getLNSCLI()))message.setLNSCLI(req.getLNSCLI());
			if(req.getLNSIPY() != null && !"".equals(req.getLNSIPY()))message.setLNSIPY(req.getLNSIPY());
			if(req.getLNSPPY() != null && !"".equals(req.getLNSPPY()))message.setLNSPPY(req.getLNSPPY());
			if(req.getLNSLST1() != null && !"".equals(req.getLNSLST1()))message.setLNSLST1(req.getLNSLST1());
			if(req.getLNSLST2() != null && !"".equals(req.getLNSLST2()))message.setLNSLST2(req.getLNSLST2());
			if(req.getLNSLST3() != null && !"".equals(req.getLNSLST3()))message.setLNSLST3(req.getLNSLST3());
			if(req.getLNSAVB() != null && !"".equals(req.getLNSAVB()))message.setLNSAVB(req.getLNSAVB());
			if(req.getLNSTRM() != null && !"".equals(req.getLNSTRM()))message.setLNSTRM(req.getLNSTRM());
			if(req.getLNSTRC() != null && !"".equals(req.getLNSTRC()))message.setLNSTRC(req.getLNSTRC());
			if(req.getLNSCUOP() != null && !"".equals(req.getLNSCUOP()))message.setLNSCUOP(req.getLNSCUOP());
			if(req.getLNSCUOV() != null && !"".equals(req.getLNSCUOV()))message.setLNSCUOV(req.getLNSCUOV());
			if(req.getLNSCUOA() != null && !"".equals(req.getLNSCUOA()))message.setLNSCUOA(req.getLNSCUOA());
			if(req.getLNSSTS() != null && !"".equals(req.getLNSSTS()))message.setLNSSTS(req.getLNSSTS());
			if(req.getLNSFLD1() != null && !"".equals(req.getLNSFLD1()))message.setLNSFLD1(req.getLNSFLD1());
			if(req.getLNSFLD2() != null && !"".equals(req.getLNSFLD2()))message.setLNSFLD2(req.getLNSFLD2());
			if(req.getLNSFLD3() != null && !"".equals(req.getLNSFLD3()))message.setLNSFLD3(req.getLNSFLD3());
			if(req.getLNSTXT1() != null && !"".equals(req.getLNSTXT1()))message.setLNSTXT1(req.getLNSTXT1());
			if(req.getLNSTXT2() != null && !"".equals(req.getLNSTXT2()))message.setLNSTXT2(req.getLNSTXT2());
			if(req.getLNSTXT3() != null && !"".equals(req.getLNSTXT3()))message.setLNSTXT3(req.getLNSTXT3());
			message.send();
			message.destroy();
			MessageRecord newmessage = mc.receiveMessage();
			res.setLNSDSJV(new LNSDSJVBean());
			if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("0"))) {
				manejarError(res, ((ELEERRMessage) newmessage));
				log.error("LNSDSJV - Detalle de Prestamo: " + " Error: "+ res.getError().getERNU01() + " - " + res.getError().getERDS01() + "- Canal " + req.getCanal());
				return res;
			}else if (newmessage.getFormatName().equals("LNSDSJV2")){
				message = (LNSDSJV2Message) newmessage;
				res.getLNSDSJV().setLNSUSR(message.getLNSUSR());
				res.getLNSDSJV().setLNSACC(message.getLNSACC());
				res.getLNSDSJV().setLNSCCY(message.getLNSCCY());
				res.getLNSDSJV().setLNSPRI(message.getLNSPRI());
				res.getLNSDSJV().setLNSINT(message.getLNSINT());
				res.getLNSDSJV().setLNSLCH(message.getLNSLCH());
				res.getLNSDSJV().setLNSSCR(message.getLNSSCR());
				res.getLNSDSJV().setLNSPOF(message.getLNSPOF());
				res.getLNSDSJV().setLNSPMT(message.getLNSPMT());
				res.getLNSDSJV().setLNSNOP1(message.getLNSNOP1());
				res.getLNSDSJV().setLNSNOP2(message.getLNSNOP2());
				res.getLNSDSJV().setLNSNOP3(message.getLNSNOP3());
				res.getLNSDSJV().setLNSNXP1(message.getLNSNXP1());
				res.getLNSDSJV().setLNSNXP2(message.getLNSNXP2());
				res.getLNSDSJV().setLNSNXP3(message.getLNSNXP3());
				res.getLNSDSJV().setLNSMAT1(message.getLNSMAT1());
				res.getLNSDSJV().setLNSMAT2(message.getLNSMAT2());
				res.getLNSDSJV().setLNSMAT3(message.getLNSMAT3());
				res.getLNSDSJV().setLNSRTE(message.getLNSRTE());
				res.getLNSDSJV().setLNSCLI(message.getLNSCLI());
				res.getLNSDSJV().setLNSIPY(message.getLNSIPY());
				res.getLNSDSJV().setLNSPPY(message.getLNSPPY());
				res.getLNSDSJV().setLNSLST1(message.getLNSLST1());
				res.getLNSDSJV().setLNSLST2(message.getLNSLST2());
				res.getLNSDSJV().setLNSLST3(message.getLNSLST3());
				res.getLNSDSJV().setLNSAVB(message.getLNSAVB());
				res.getLNSDSJV().setLNSTRM(message.getLNSTRM());
				res.getLNSDSJV().setLNSTRC(message.getLNSTRC());
				res.getLNSDSJV().setLNSCUOP(message.getLNSCUOP());
				res.getLNSDSJV().setLNSCUOV(message.getLNSCUOV());
				res.getLNSDSJV().setLNSCUOA(message.getLNSCUOA());
				res.getLNSDSJV().setLNSSTS(message.getLNSSTS());
				res.getLNSDSJV().setLNSFLD1(message.getLNSFLD1());
				res.getLNSDSJV().setLNSFLD2(message.getLNSFLD2());
				res.getLNSDSJV().setLNSFLD3(message.getLNSFLD3());
				res.getLNSDSJV().setLNSTXT1(message.getLNSTXT1());
				res.getLNSDSJV().setLNSTXT2(message.getLNSTXT2());
				res.getLNSDSJV().setLNSTXT3(message.getLNSTXT3());
			}
		} catch (Exception e) {
			log.error("LNSDSJV - Detalle de Prestamo - " + e.getMessage() + " - Canal " + req.getCanal(),e );
			throw new WSException(e);
		} finally {
			if (s != null)
				try {
					s.close();
				} catch (IOException e) {
				}
		}
		return res;
	}
	/**
	 * Servicio para la Consulta de Préstamos.
	 * @param req
	 * @return
	 * @throws WSException
	 */
	public IN098002Response IN098002(IN098002Bean req) throws WSException{
		log.info("Invocando IN098002");
		Parametros params = new Parametros();
		Socket s = null;
		IN098002Response res = new IN098002Response();
		try {
			MessageContext mc;
			s = new Socket(params.getString("ip"), params.getInt("port1")+1);
			s.setSoTimeout(params.getInt("timeout"));
			mc = new MessageContext(new DataInputStream(new BufferedInputStream(s.getInputStream())), new DataOutputStream(
					new BufferedOutputStream(s.getOutputStream())), "com.activo.gateway.dibs.messages");
			IN098002Message message = (IN098002Message) mc.getMessageRecord("IN098002");
			if(req.getH02USERID() != null && !"".equals(req.getH02USERID()))message.setH02USERID(req.getH02USERID());
			if(req.getH02PROGRM() != null && !"".equals(req.getH02PROGRM()))message.setH02PROGRM(req.getH02PROGRM());
			if(req.getH02TIMSYS() != null && !"".equals(req.getH02TIMSYS()))message.setH02TIMSYS(req.getH02TIMSYS());
			if(req.getH02SCRCOD() != null && !"".equals(req.getH02SCRCOD()))message.setH02SCRCOD(req.getH02SCRCOD());
			if(req.getH02OPECOD() != null && !"".equals(req.getH02OPECOD()))message.setH02OPECOD(req.getH02OPECOD());
			if(req.getH02FLGMAS() != null && !"".equals(req.getH02FLGMAS()))message.setH02FLGMAS(req.getH02FLGMAS());
			if(req.getH02FLGWK1() != null && !"".equals(req.getH02FLGWK1()))message.setH02FLGWK1(req.getH02FLGWK1());
			if(req.getH02FLGWK2() != null && !"".equals(req.getH02FLGWK2()))message.setH02FLGWK2(req.getH02FLGWK2());
			if(req.getH02FLGWK3() != null && !"".equals(req.getH02FLGWK3()))message.setH02FLGWK3(req.getH02FLGWK3());
			if(req.getE02DEAACC() != null && !"".equals(req.getE02DEAACC()))message.setE02DEAACC(req.getE02DEAACC());
			if(req.getE02PYMDT1() != null && !"".equals(req.getE02PYMDT1()))message.setE02PYMDT1(req.getE02PYMDT1());
			if(req.getE02PYMDT2() != null && !"".equals(req.getE02PYMDT2()))message.setE02PYMDT2(req.getE02PYMDT2());
			if(req.getE02PYMDT3() != null && !"".equals(req.getE02PYMDT3()))message.setE02PYMDT3(req.getE02PYMDT3());
			if(req.getE02DLPPRI() != null && !"".equals(req.getE02DLPPRI()))message.setE02DLPPRI(req.getE02DLPPRI());
			if(req.getE02DLPINT() != null && !"".equals(req.getE02DLPINT()))message.setE02DLPINT(req.getE02DLPINT());
			if(req.getE02DLPMOR() != null && !"".equals(req.getE02DLPMOR()))message.setE02DLPMOR(req.getE02DLPMOR());
			if(req.getE02DLPDED() != null && !"".equals(req.getE02DLPDED()))message.setE02DLPDED(req.getE02DLPDED());
			if(req.getE02PYMSTS() != null && !"".equals(req.getE02PYMSTS()))message.setE02PYMSTS(req.getE02PYMSTS());
			message.send();
			message.destroy();
			MessageRecord newmessage = mc.receiveMessage();
			if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("0"))) {
				manejarError(res, ((ELEERRMessage) newmessage));
				log.error("IN098002 - Consulta Cronograma de Pagos: " + " Error: "+ res.getError().getERNU01() + " - " + res.getError().getERDS01() + " - Canal " + req.getCanal());
				return res;
			} else if (newmessage.getFormatName().equals("IN098002")) {
				List<IN098002Bean> x = new ArrayList<IN098002Bean>();
				boolean GoIn = !((IN098002Message)newmessage).getH02FLGMAS().equals("*");
				while (GoIn) {
					IN098002Bean bean = new IN098002Bean();
					bean.setH02USERID(((IN098002Message) newmessage).getH02USERID());
					bean.setH02PROGRM(((IN098002Message) newmessage).getH02PROGRM());
					bean.setH02TIMSYS(((IN098002Message) newmessage).getH02TIMSYS());
					bean.setH02SCRCOD(((IN098002Message) newmessage).getH02SCRCOD());
					bean.setH02OPECOD(((IN098002Message) newmessage).getH02OPECOD());
					bean.setH02FLGMAS(((IN098002Message) newmessage).getH02FLGMAS());
					bean.setH02FLGWK1(((IN098002Message) newmessage).getH02FLGWK1());
					bean.setH02FLGWK2(((IN098002Message) newmessage).getH02FLGWK2());
					bean.setH02FLGWK3(((IN098002Message) newmessage).getH02FLGWK3());
					bean.setE02DEAACC(((IN098002Message) newmessage).getE02DEAACC());
					bean.setE02PYMDT1(((IN098002Message) newmessage).getE02PYMDT1());
					bean.setE02PYMDT2(((IN098002Message) newmessage).getE02PYMDT2());
					bean.setE02PYMDT3(((IN098002Message) newmessage).getE02PYMDT3());
					bean.setE02DLPPRI(((IN098002Message) newmessage).getE02DLPPRI());
					bean.setE02DLPINT(((IN098002Message) newmessage).getE02DLPINT());
					bean.setE02DLPMOR(((IN098002Message) newmessage).getE02DLPMOR());
					bean.setE02DLPDED(((IN098002Message) newmessage).getE02DLPDED());
					bean.setE02PYMSTS(((IN098002Message) newmessage).getE02PYMSTS());
					x.add(bean);
					newmessage = mc.receiveMessage();
					if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("0"))) {
						manejarError(res, ((ELEERRMessage) newmessage));
						return res;
					}
					GoIn = !((IN098002Message)newmessage).getH02FLGMAS().equals("*");
				}
				res.setIN098002(x.toArray(new IN098002Bean[0]));
			}
		} catch (Exception e) {
			log.error("IN098002 - Consulta Cronograma de Pagos - " + e.getMessage() + " - Canal " + req.getCanal(),e);
			throw new WSException(e);
		} finally {
			if (s != null)
				try {
					s.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		return res;
	}
	/**
	 * Servicio para la Suspensión de Cheques, Chequeras.
	 * @param req
	 * @return
	 * @throws WSException
	 */
	public STOPDSJVResponse STOPDSJV(STOPDSJVBean req) throws WSException {
		log.info("Invocando STOPDSJV");
		Parametros params = new Parametros();
		Socket s = null;
		STOPDSJVResponse res = new STOPDSJVResponse();
		try {
			MessageContext mc;
			s = new Socket(params.getString("ip"), params.getInt("port1"));
			s.setSoTimeout(params.getInt("timeout"));
			mc = new MessageContext(new DataInputStream(new BufferedInputStream(s.getInputStream())), new DataOutputStream(
					new BufferedOutputStream(s.getOutputStream())), "com.activo.gateway.dibs.messages");
			STOPDSJV2Message message = (STOPDSJV2Message) mc.getMessageRecord("STOPDSJV2");
			if(req.getSTOSTPUSER() != null && !"".equals(req.getSTOSTPUSER()))message.setSTOSTPUSER(req.getSTOSTPUSER());
			if(req.getSTOSTPACC() != null && !"".equals(req.getSTOSTPACC()))message.setSTOSTPACC(req.getSTOSTPACC());
			if(req.getSTOSTPRMK() != null && !"".equals(req.getSTOSTPRMK()))message.setSTOSTPRMK(req.getSTOSTPRMK());
			if(req.getSTOSTPDT1() != null && !"".equals(req.getSTOSTPDT1()))message.setSTOSTPDT1(req.getSTOSTPDT1());
			if(req.getSTOSTPDT2() != null && !"".equals(req.getSTOSTPDT2()))message.setSTOSTPDT2(req.getSTOSTPDT2());
			if(req.getSTOSTPDT3() != null && !"".equals(req.getSTOSTPDT3()))message.setSTOSTPDT3(req.getSTOSTPDT3());
			if(req.getSTOSTPFCK() != null && !"".equals(req.getSTOSTPFCK()))message.setSTOSTPFCK(req.getSTOSTPFCK());
			if(req.getSTOSTPTCK() != null && !"".equals(req.getSTOSTPTCK()))message.setSTOSTPTCK(req.getSTOSTPTCK());
			if(req.getSTOSTPAMT() != null && !"".equals(req.getSTOSTPAMT()))message.setSTOSTPAMT(req.getSTOSTPAMT());
			if(req.getSTOSTPPTS() != null && !"".equals(req.getSTOSTPPTS()))message.setSTOSTPPTS(req.getSTOSTPPTS());
			if(req.getSTOSTPFLG() != null && !"".equals(req.getSTOSTPFLG()))message.setSTOSTPFLG(req.getSTOSTPFLG());
			if(req.getSTOSTPNRE() != null && !"".equals(req.getSTOSTPNRE()))message.setSTOSTPNRE(req.getSTOSTPNRE());
			if(req.getSTOSTPF01() != null && !"".equals(req.getSTOSTPF01()))message.setSTOSTPF01(req.getSTOSTPF01());
			if(req.getSTOSTPF02() != null && !"".equals(req.getSTOSTPF02()))message.setSTOSTPF02(req.getSTOSTPF02());
			message.send();
			message.destroy();
			MessageRecord newmessage = mc.receiveMessage();
			if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("0"))) {
				manejarError(res, ((ELEERRMessage) newmessage));
				log.error("STOPDSJV - Suspension de Cheques: " + " Error: "+ res.getError().getERNU01() + " - " + res.getError().getERDS01()+" - Canal " + req.getCanal());
				return res;
			}
			newmessage = mc.receiveMessage();
			if (newmessage.getFormatName().equals("STOPDSJV2")) {
				List<STOPDSJVBean> x = new ArrayList<STOPDSJVBean>();
				boolean GoIn = !((STOPDSJV2Message) newmessage).getSTOSTPTCK().equals("999999999");
				while (GoIn) {
					STOPDSJVBean bean = new STOPDSJVBean();
					bean.setSTOSTPUSER(((STOPDSJV2Message) newmessage).getSTOSTPUSER());
					bean.setSTOSTPACC(((STOPDSJV2Message) newmessage).getSTOSTPACC());
					bean.setSTOSTPRMK(((STOPDSJV2Message) newmessage).getSTOSTPRMK());
					bean.setSTOSTPDT1(((STOPDSJV2Message) newmessage).getSTOSTPDT1());
					bean.setSTOSTPDT2(((STOPDSJV2Message) newmessage).getSTOSTPDT2());
					bean.setSTOSTPDT3(((STOPDSJV2Message) newmessage).getSTOSTPDT3());
					bean.setSTOSTPFCK(((STOPDSJV2Message) newmessage).getSTOSTPFCK());
					bean.setSTOSTPTCK(((STOPDSJV2Message) newmessage).getSTOSTPTCK());
					bean.setSTOSTPAMT(((STOPDSJV2Message) newmessage).getSTOSTPAMT());
					bean.setSTOSTPPTS(((STOPDSJV2Message) newmessage).getSTOSTPPTS());
					bean.setSTOSTPFLG(((STOPDSJV2Message) newmessage).getSTOSTPFLG());
					bean.setSTOSTPNRE(((STOPDSJV2Message) newmessage).getSTOSTPNRE());
					bean.setSTOSTPF01(((STOPDSJV2Message) newmessage).getSTOSTPF01());
					bean.setSTOSTPF02(((STOPDSJV2Message) newmessage).getSTOSTPF02());
					x.add(bean);
					newmessage = mc.receiveMessage();
					if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("0"))) {
						manejarError(res, ((ELEERRMessage) newmessage));
						return res;
					}
					GoIn = !((STOPDSJV2Message)newmessage).getSTOSTPTCK().equals("999999999");
				}
				res.setSTOPDSJV(x.toArray(new STOPDSJVBean[0]));
			}
		} catch (Exception e) {
			log.error("STOPDSJV - Suspension de Cheques - " + e.getMessage() + " - Canal " + req.getCanal(),e);
			throw new WSException(e);
		} finally {
			if (s != null)
				try {
					s.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		return res;
	}
	/**
	 * Servicio para la Búsqueda de la TDC que posee un cliente.
	 * @param req
	 * @return
	 * @throws WSException 
	 */
	public CARDSJVResponse CARDSJV(CARDSJVBean req) throws WSException {
		log.info("Invocando CARDSJV");
		Parametros params = new Parametros();
		Socket s = null;
		CARDSJVResponse res = new CARDSJVResponse();
		
		try {
			MessageContext mc;
			s = new Socket(params.getString("ip"), params.getInt("port1"));
			s.setSoTimeout(params.getInt("timeout"));
			mc = new MessageContext(new DataInputStream(new BufferedInputStream(s.getInputStream())), new DataOutputStream(
					new BufferedOutputStream(s.getOutputStream())), "com.activo.gateway.dibs.messages");
			CARDSJVMessage message = (CARDSJVMessage) mc.getMessageRecord("CARDSJV");
			if(req.getCARUSR() != null && !"".equals(req.getCARUSR()))message.setCARUSR(req.getCARUSR());
			if(req.getCARNUM() != null && !"".equals(req.getCARNUM()))message.setCARNUM(req.getCARNUM());
			if(req.getCARCCY() != null && !"".equals(req.getCARCCY()))message.setCARCCY(req.getCARCCY());
			if(req.getCARTYP() != null && !"".equals(req.getCARTYP()))message.setCARTYP(req.getCARTYP());
			if(req.getCAROP1() != null && !"".equals(req.getCAROP1()))message.setCAROP1(req.getCAROP1());
			if(req.getCAROP2() != null && !"".equals(req.getCAROP2()))message.setCAROP2(req.getCAROP2());
			if(req.getCAROP3() != null && !"".equals(req.getCAROP3()))message.setCAROP3(req.getCAROP3());
			if(req.getCARED1() != null && !"".equals(req.getCARED1()))message.setCARED1(req.getCARED1());
			if(req.getCARED2() != null && !"".equals(req.getCARED2()))message.setCARED2(req.getCARED2());
			if(req.getCARED3() != null && !"".equals(req.getCARED3()))message.setCARED3(req.getCARED3());
			if(req.getCARAC1() != null && !"".equals(req.getCARAC1()))message.setCARAC1(req.getCARAC1());
			if(req.getCARAC2() != null && !"".equals(req.getCARAC2()))message.setCARAC2(req.getCARAC2());
			if(req.getCARAC3() != null && !"".equals(req.getCARAC3()))message.setCARAC3(req.getCARAC3());
			if(req.getCARDU1() != null && !"".equals(req.getCARDU1()))message.setCARDU1(req.getCARDU1());
			if(req.getCARDU2() != null && !"".equals(req.getCARDU2()))message.setCARDU2(req.getCARDU2());
			if(req.getCARDU3() != null && !"".equals(req.getCARDU3()))message.setCARDU3(req.getCARDU3());
			if(req.getCARLB1() != null && !"".equals(req.getCARLB1()))message.setCARLB1(req.getCARLB1());
			if(req.getCARLB2() != null && !"".equals(req.getCARLB2()))message.setCARLB2(req.getCARLB2());
			if(req.getCARLB3() != null && !"".equals(req.getCARLB3()))message.setCARLB3(req.getCARLB3());
			if(req.getCARLM1() != null && !"".equals(req.getCARLM1()))message.setCARLM1(req.getCARLM1());
			if(req.getCARLM2() != null && !"".equals(req.getCARLM2()))message.setCARLM2(req.getCARLM2());
			if(req.getCARLM3() != null && !"".equals(req.getCARLM3()))message.setCARLM3(req.getCARLM3());
			if(req.getCARLP1() != null && !"".equals(req.getCARLP1()))message.setCARLP1(req.getCARLP1());
			if(req.getCARLP2() != null && !"".equals(req.getCARLP2()))message.setCARLP2(req.getCARLP2());
			if(req.getCARLP3() != null && !"".equals(req.getCARLP3()))message.setCARLP3(req.getCARLP3());
			if(req.getCARCRL() != null && !"".equals(req.getCARCRL()))message.setCARCRL(req.getCARCRL());
			if(req.getCARAVC() != null && !"".equals(req.getCARAVC()))message.setCARAVC(req.getCARAVC());
			if(req.getCARBAL() != null && !"".equals(req.getCARBAL()))message.setCARBAL(req.getCARBAL());
			if(req.getCARPMA() != null && !"".equals(req.getCARPMA()))message.setCARPMA(req.getCARPMA());
			if(req.getCARAAD() != null && !"".equals(req.getCARAAD()))message.setCARAAD(req.getCARAAD());
			if(req.getCARCFA() != null && !"".equals(req.getCARCFA()))message.setCARCFA(req.getCARCFA());
			if(req.getCARLSB() != null && !"".equals(req.getCARLSB()))message.setCARLSB(req.getCARLSB());
			if(req.getCARPMC() != null && !"".equals(req.getCARPMC()))message.setCARPMC(req.getCARPMC());
			if(req.getCARNIK() != null && !"".equals(req.getCARNIK()))message.setCARNIK(req.getCARNIK());
			message.send();
			message.destroy();
			MessageRecord newmessage = mc.receiveMessage();
			if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("0"))) {
				manejarError(res, ((ELEERRMessage) newmessage));
				log.error("CARDSJV - Detalle de TDC: " + " Error: "+ res.getError().getERNU01() + " - " + res.getError().getERDS01() + " - Canal " + req.getCanal());
				return res;
			}
			CARDSJVMessage newmessage2 = (CARDSJVMessage) newmessage;
			res.setCARDSJV(new CARDSJVBean());
			
			
			float totalCarbal= 0;
			float carp = 0 , totalCarp = 0;
		
			
			//Llamada al servicio CCARDTRJV para cálculo de saldos pendientes por ejecutar
			try {
				CCARDTRJVBean reqCCAR = new CCARDTRJVBean();
				reqCCAR.setCCATRNUM(req.getCARNUM());
				reqCCAR.setCCATROPC("TR");
				CCARDTRJVResponse resCCAR =  this.CCARDTRJV(reqCCAR);
				if(resCCAR.getError() == null){
					if(resCCAR.getCCARDTRJV().length > 0){
						for (CCARDTRJVBean cc : resCCAR.getCCARDTRJV()) {
							if("X".equals(cc.getH01FLGWK3())){															
								carp += Float.parseFloat(cc.getCCATRAMCR());
							}
						}
					} else{
						
						res.getCARDSJV().setCARPMA(newmessage2.getCARPMA());
						res.getCARDSJV().setCARBAL(newmessage2.getCARBAL());
					}
					if(resCCAR.getError()!=null){
						res.setError(resCCAR.getError());
						return res;
					}
					
					//Total de restar los abonos - pago mínimo
					
					totalCarp = Math.max(0,Float.parseFloat(newmessage2.getCARPMA()) - carp);
					DecimalFormat DCCARPMA = new DecimalFormat("0.00");
					String VLR = DCCARPMA.format(totalCarp);
					res.getCARDSJV().setCARPMA((VLR.replace(",", ".")));
					
					//Total saldo - deuda
					totalCarbal = Float.parseFloat(newmessage2.getCARBAL()) - carp;
					String VLR2 = DCCARPMA.format(totalCarbal);
					res.getCARDSJV().setCARBAL((VLR2.replace(",", ".")));
				} 
					else{
					res.getCARDSJV().setCARPMA(newmessage2.getCARPMA());
					res.getCARDSJV().setCARBAL(newmessage2.getCARBAL());
					
				}
			}catch(Exception e){
				log.error("CCARDTRJV - Saldo TDC - " + e.getMessage() + " - Canal " + req.getCanal(),e);
			}
			res.getCARDSJV().setCARUSR(newmessage2.getCARUSR());
			res.getCARDSJV().setCARNUM(newmessage2.getCARNUM());
			res.getCARDSJV().setCARCCY(newmessage2.getCARCCY());
			res.getCARDSJV().setCARTYP(newmessage2.getCARTYP());
			res.getCARDSJV().setCAROP1(newmessage2.getCAROP1());
			res.getCARDSJV().setCAROP2(newmessage2.getCAROP2());
			res.getCARDSJV().setCAROP3(newmessage2.getCAROP3());
			res.getCARDSJV().setCARED1(newmessage2.getCARED1());
			res.getCARDSJV().setCARED2(newmessage2.getCARED2());
			res.getCARDSJV().setCARED3(newmessage2.getCARED3());
			res.getCARDSJV().setCARAC1(newmessage2.getCARAC1());
			res.getCARDSJV().setCARAC2(newmessage2.getCARAC2());
			res.getCARDSJV().setCARAC3(newmessage2.getCARAC3());
			res.getCARDSJV().setCARDU1(newmessage2.getCARDU1());
			res.getCARDSJV().setCARDU2(newmessage2.getCARDU2());
			res.getCARDSJV().setCARDU3(newmessage2.getCARDU3());
			res.getCARDSJV().setCARLB1(newmessage2.getCARLB1());
			res.getCARDSJV().setCARLB2(newmessage2.getCARLB2());
			res.getCARDSJV().setCARLB3(newmessage2.getCARLB3());
			res.getCARDSJV().setCARLM1(newmessage2.getCARLM1());
			res.getCARDSJV().setCARLM2(newmessage2.getCARLM2());
			res.getCARDSJV().setCARLM3(newmessage2.getCARLM3());
			res.getCARDSJV().setCARLP1(newmessage2.getCARLP1());
			res.getCARDSJV().setCARLP2(newmessage2.getCARLP2());
			res.getCARDSJV().setCARLP3(newmessage2.getCARLP3());
			res.getCARDSJV().setCARCRL(newmessage2.getCARCRL());
			res.getCARDSJV().setCARAVC(newmessage2.getCARAVC());
			res.getCARDSJV().setCARAAD(newmessage2.getCARAAD());
			res.getCARDSJV().setCARCFA(newmessage2.getCARCFA());
			res.getCARDSJV().setCARLSB(newmessage2.getCARLSB());
			res.getCARDSJV().setCARPMC(newmessage2.getCARPMC());
			res.getCARDSJV().setCARNIK(newmessage2.getCARNIK());
		} catch (Exception e) {
			log.error("CARDSJV - Detalle de TDC - " + e.getMessage() + " - Canal " + req.getCanal(),e);
			throw new WSException(e);
		} finally {
			if (s != null)
				try {
					s.close();
				} catch (IOException e) {
				}
		}
		return res;
	}
	/**
	 * Servicio para consultar los Movimientos de una TDC en partitular.
	 *  @param req 
	 *  @return
	 *  @throws WSException 
	 */
	public CCARDTRJVResponse CCARDTRJV(CCARDTRJVBean req) throws WSException {
		log.info("Invocando CCARDTRJV");
		Socket s = null;
		CCARDTRJVResponse res = new CCARDTRJVResponse();
		try {
			Parametros params = new Parametros();
			MessageContext mc;
			s = new Socket(params.getString("ip"), params.getInt("port1")+1);
			s.setSoTimeout(params.getInt("timeout"));
			mc = new MessageContext(new DataInputStream(new BufferedInputStream(s.getInputStream())), new DataOutputStream(
					new BufferedOutputStream(s.getOutputStream())), "com.activo.gateway.dibs.messages");
			CCARDTRJVMessage message = (CCARDTRJVMessage) mc.getMessageRecord("CCARDTRJV");
			if(req.getCCATRUSR() != null && !"".equals(req.getCCATRUSR()))message.setCCATRUSR(req.getCCATRUSR());
			if(req.getCCATRNUM() != null && !"".equals(req.getCCATRNUM()))message.setCCATRNUM(req.getCCATRNUM());
			if(req.getCCATROPC() != null && !"".equals(req.getCCATROPC()))message.setCCATROPC(req.getCCATROPC());
			if(req.getCCATRTYP() != null && !"".equals(req.getCCATRTYP()))message.setCCATRTYP(req.getCCATRTYP());
			if(req.getH01FLGWK1() != null && !"".equals(req.getH01FLGWK1()))message.setH01FLGWK1(req.getH01FLGWK1());
			if(req.getH01FLGWK2() != null && !"".equals(req.getH01FLGWK2()))message.setH01FLGWK2(req.getH01FLGWK2());
			if(req.getH01FLGWK3() != null && !"".equals(req.getH01FLGWK3()))message.setH01FLGWK3(req.getH01FLGWK3());
			if(req.getCCATRAM1() != null && !"".equals(req.getCCATRAM1()))message.setCCATRAM1(req.getCCATRAM1());
			if(req.getCCATRAM2() != null && !"".equals(req.getCCATRAM2()))message.setCCATRAM2(req.getCCATRAM2());
			if(req.getCCATRAM3() != null && !"".equals(req.getCCATRAM3()))message.setCCATRAM3(req.getCCATRAM3());
			if(req.getCCATRAM4() != null && !"".equals(req.getCCATRAM4()))message.setCCATRAM4(req.getCCATRAM4());
			if(req.getCCATRAM5() != null && !"".equals(req.getCCATRAM5()))message.setCCATRAM5(req.getCCATRAM5());
			if(req.getCCATRAM6() != null && !"".equals(req.getCCATRAM6()))message.setCCATRAM6(req.getCCATRAM6());
			if(req.getCCATRAM7() != null && !"".equals(req.getCCATRAM7()))message.setCCATRAM7(req.getCCATRAM7());
			if(req.getCCATRAM8() != null && !"".equals(req.getCCATRAM8()))message.setCCATRAM8(req.getCCATRAM8());
			if(req.getCCATRAM9() != null && !"".equals(req.getCCATRAM9()))message.setCCATRAM9(req.getCCATRAM9());
			if(req.getCCATRAM10() != null && !"".equals(req.getCCATRAM10()))message.setCCATRAM10(req.getCCATRAM10());
			if(req.getCCATRAM11() != null && !"".equals(req.getCCATRAM11()))message.setCCATRAM11(req.getCCATRAM11());
			if(req.getCCATRAM12() != null && !"".equals(req.getCCATRAM12()))message.setCCATRAM12(req.getCCATRAM12());
			if(req.getCCATRAM13() != null && !"".equals(req.getCCATRAM13()))message.setCCATRAM13(req.getCCATRAM13());
			if(req.getCCATRAM14() != null && !"".equals(req.getCCATRAM14()))message.setCCATRAM14(req.getCCATRAM14());
			if(req.getCCATRAM15() != null && !"".equals(req.getCCATRAM15()))message.setCCATRAM15(req.getCCATRAM15());
			if(req.getCCATRAM16() != null && !"".equals(req.getCCATRAM16()))message.setCCATRAM16(req.getCCATRAM16());
			if(req.getCCATRAM17() != null && !"".equals(req.getCCATRAM17()))message.setCCATRAM17(req.getCCATRAM17());
			if(req.getCCATRAM18() != null && !"".equals(req.getCCATRAM18()))message.setCCATRAM18(req.getCCATRAM18());
			if(req.getCCATRAM19() != null && !"".equals(req.getCCATRAM19()))message.setCCATRAM19(req.getCCATRAM19());
			if(req.getCCATRAM20() != null && !"".equals(req.getCCATRAM20()))message.setCCATRAM20(req.getCCATRAM20());
			if(req.getCCATRAM21() != null && !"".equals(req.getCCATRAM21()))message.setCCATRAM21(req.getCCATRAM21());
			if(req.getCCATRAM22() != null && !"".equals(req.getCCATRAM22()))message.setCCATRAM22(req.getCCATRAM22());
			if(req.getCCATRAM23() != null && !"".equals(req.getCCATRAM23()))message.setCCATRAM23(req.getCCATRAM23());
			if(req.getCCATRAM24() != null && !"".equals(req.getCCATRAM24()))message.setCCATRAM24(req.getCCATRAM24());
			if(req.getCCATRAM25() != null && !"".equals(req.getCCATRAM25()))message.setCCATRAM25(req.getCCATRAM25());
			if(req.getCCATRAM26() != null && !"".equals(req.getCCATRAM26()))message.setCCATRAM26(req.getCCATRAM26());
			if(req.getCCATRAM26() != null && !"".equals(req.getCCATRAM26()))message.setCCATRAM26(req.getCCATRAM26());
			if(req.getCCATRAM27() != null && !"".equals(req.getCCATRAM27()))message.setCCATRAM27(req.getCCATRAM27());
			if(req.getCCATRAM28() != null && !"".equals(req.getCCATRAM28()))message.setCCATRAM28(req.getCCATRAM28());
			if(req.getCCATRAM29() != null && !"".equals(req.getCCATRAM29()))message.setCCATRAM29(req.getCCATRAM29());
			if(req.getCCATRAM30() != null && !"".equals(req.getCCATRAM30()))message.setCCATRAM30(req.getCCATRAM30());
			if(req.getCCATRAM31() != null && !"".equals(req.getCCATRAM31()))message.setCCATRAM31(req.getCCATRAM31());
			if(req.getCCATRAM32() != null && !"".equals(req.getCCATRAM32()))message.setCCATRAM32(req.getCCATRAM32());
			if(req.getCCATRAM33() != null && !"".equals(req.getCCATRAM33()))message.setCCATRAM33(req.getCCATRAM33());
			if(req.getCCATRAM34() != null && !"".equals(req.getCCATRAM34()))message.setCCATRAM34(req.getCCATRAM34());
			if(req.getCCATRAM35() != null && !"".equals(req.getCCATRAM35()))message.setCCATRAM35(req.getCCATRAM35());
			if(req.getCCATRAM36() != null && !"".equals(req.getCCATRAM36()))message.setCCATRAM36(req.getCCATRAM36());
			if(req.getCCATRAM37() != null && !"".equals(req.getCCATRAM37()))message.setCCATRAM37(req.getCCATRAM37());
			if(req.getCCATRAM38() != null && !"".equals(req.getCCATRAM38()))message.setCCATRAM38(req.getCCATRAM38());
			if(req.getCCATRAM39() != null && !"".equals(req.getCCATRAM39()))message.setCCATRAM39(req.getCCATRAM39());
			if(req.getCCATRAM40() != null && !"".equals(req.getCCATRAM40()))message.setCCATRAM40(req.getCCATRAM40());
			if(req.getCCATRAM41() != null && !"".equals(req.getCCATRAM41()))message.setCCATRAM41(req.getCCATRAM41());
			if(req.getCCATRAM42() != null && !"".equals(req.getCCATRAM42()))message.setCCATRAM42(req.getCCATRAM42());
			if(req.getCCATRAM43() != null && !"".equals(req.getCCATRAM43()))message.setCCATRAM43(req.getCCATRAM43());
			if(req.getCCATRAM44() != null && !"".equals(req.getCCATRAM44()))message.setCCATRAM44(req.getCCATRAM44());
			if(req.getCCATRAM45() != null && !"".equals(req.getCCATRAM45()))message.setCCATRAM45(req.getCCATRAM45());
			if(req.getCCATRAM46() != null && !"".equals(req.getCCATRAM46()))message.setCCATRAM46(req.getCCATRAM46());
			if(req.getCCATRAM47() != null && !"".equals(req.getCCATRAM47()))message.setCCATRAM47(req.getCCATRAM47());
			if(req.getCCATRAM48() != null && !"".equals(req.getCCATRAM48()))message.setCCATRAM48(req.getCCATRAM48());
			if(req.getCCATRAM49() != null && !"".equals(req.getCCATRAM49()))message.setCCATRAM49(req.getCCATRAM49());
			if(req.getCCATRAM50() != null && !"".equals(req.getCCATRAM50()))message.setCCATRAM50(req.getCCATRAM50());
			if(req.getCCATRAM51() != null && !"".equals(req.getCCATRAM51()))message.setCCATRAM51(req.getCCATRAM51());
			if(req.getCCATRAM52() != null && !"".equals(req.getCCATRAM52()))message.setCCATRAM52(req.getCCATRAM52());
			if(req.getCCATRAM53() != null && !"".equals(req.getCCATRAM53()))message.setCCATRAM53(req.getCCATRAM53());
			if(req.getCCATRAM54() != null && !"".equals(req.getCCATRAM54()))message.setCCATRAM54(req.getCCATRAM54());
			if(req.getCCATRAM55() != null && !"".equals(req.getCCATRAM55()))message.setCCATRAM55(req.getCCATRAM55());
			if(req.getCCATRAM56() != null && !"".equals(req.getCCATRAM56()))message.setCCATRAM56(req.getCCATRAM56());
			if(req.getCCATRAM57() != null && !"".equals(req.getCCATRAM57()))message.setCCATRAM57(req.getCCATRAM57());
			if(req.getCCATRAM58() != null && !"".equals(req.getCCATRAM58()))message.setCCATRAM58(req.getCCATRAM58());
			if(req.getCCATRAM59() != null && !"".equals(req.getCCATRAM59()))message.setCCATRAM59(req.getCCATRAM59());
			if(req.getCCATRAM60() != null && !"".equals(req.getCCATRAM60()))message.setCCATRAM60(req.getCCATRAM60());
			if(req.getCCATRAM61() != null && !"".equals(req.getCCATRAM61()))message.setCCATRAM61(req.getCCATRAM61());
			if(req.getCCATRAM62() != null && !"".equals(req.getCCATRAM62()))message.setCCATRAM62(req.getCCATRAM62());
			if(req.getCCATRAM63() != null && !"".equals(req.getCCATRAM63()))message.setCCATRAM63(req.getCCATRAM63());
			if(req.getCCATRAM64() != null && !"".equals(req.getCCATRAM64()))message.setCCATRAM64(req.getCCATRAM64());
			if(req.getCCATRAM65() != null && !"".equals(req.getCCATRAM65()))message.setCCATRAM65(req.getCCATRAM65());
			if(req.getCCATRAM66() != null && !"".equals(req.getCCATRAM66()))message.setCCATRAM66(req.getCCATRAM66());
			if(req.getCCATRAM67() != null && !"".equals(req.getCCATRAM67()))message.setCCATRAM67(req.getCCATRAM67());
			if(req.getCCATRAM68() != null && !"".equals(req.getCCATRAM68()))message.setCCATRAM68(req.getCCATRAM68());
			if(req.getCCATRAM69() != null && !"".equals(req.getCCATRAM69()))message.setCCATRAM69(req.getCCATRAM69());
			if(req.getCCATRAM70() != null && !"".equals(req.getCCATRAM70()))message.setCCATRAM70(req.getCCATRAM70());
			if(req.getCCATRAM71() != null && !"".equals(req.getCCATRAM71()))message.setCCATRAM71(req.getCCATRAM71());
			if(req.getCCATRAM72() != null && !"".equals(req.getCCATRAM72()))message.setCCATRAM72(req.getCCATRAM72());
			if(req.getCCATRAM73() != null && !"".equals(req.getCCATRAM73()))message.setCCATRAM73(req.getCCATRAM73());
			if(req.getCCATRAM74() != null && !"".equals(req.getCCATRAM74()))message.setCCATRAM74(req.getCCATRAM74());
			if(req.getCCATRAM75() != null && !"".equals(req.getCCATRAM75()))message.setCCATRAM75(req.getCCATRAM75());
			if(req.getCCATRAM76() != null && !"".equals(req.getCCATRAM76()))message.setCCATRAM76(req.getCCATRAM76());
			if(req.getCCATRAM77() != null && !"".equals(req.getCCATRAM77()))message.setCCATRAM77(req.getCCATRAM77());
			if(req.getCCATRAM78() != null && !"".equals(req.getCCATRAM78()))message.setCCATRAM78(req.getCCATRAM78());
			if(req.getCCATRAM79() != null && !"".equals(req.getCCATRAM79()))message.setCCATRAM79(req.getCCATRAM79());
			if(req.getCCATRAM80() != null && !"".equals(req.getCCATRAM80()))message.setCCATRAM80(req.getCCATRAM80());
			if(req.getCCATRDC1() != null && !"".equals(req.getCCATRDC1()))message.setCCATRDC1(req.getCCATRDC1());
			if(req.getCCATRDC2() != null && !"".equals(req.getCCATRDC2()))message.setCCATRDC2(req.getCCATRDC2());
			if(req.getCCATRDC3() != null && !"".equals(req.getCCATRDC3()))message.setCCATRDC3(req.getCCATRDC3());
			if(req.getCCATRDC4() != null && !"".equals(req.getCCATRDC4()))message.setCCATRDC4(req.getCCATRDC4());
			if(req.getCCATRDC5() != null && !"".equals(req.getCCATRDC5()))message.setCCATRDC5(req.getCCATRDC5());
			if(req.getCCATRDAT() != null && !"".equals(req.getCCATRDAT()))message.setCCATRDAT(req.getCCATRDAT());
			if(req.getCCATRPRC() != null && !"".equals(req.getCCATRPRC()))message.setCCATRPRC(req.getCCATRPRC());
			if(req.getCCATRTIM() != null && !"".equals(req.getCCATRTIM()))message.setCCATRTIM(req.getCCATRTIM());
			if(req.getCCATRDSC() != null && !"".equals(req.getCCATRDSC()))message.setCCATRDSC(req.getCCATRDSC());
			if(req.getCCATRAMCR() != null && !"".equals(req.getCCATRAMCR()))message.setCCATRAMCR(req.getCCATRAMCR());
			if(req.getCCATRAMDB() != null && !"".equals(req.getCCATRAMDB()))message.setCCATRAMDB(req.getCCATRAMDB());
			if(req.getCCATRREF() != null && !"".equals(req.getCCATRREF()))message.setCCATRREF(req.getCCATRREF());	
			if(req.getCCATADD1() != null && !"".equals(req.getCCATADD1()))message.setCCATADD1(req.getCCATADD1());	
			if(req.getCCATADD2() != null && !"".equals(req.getCCATADD2()))message.setCCATADD2(req.getCCATADD2());	
			if(req.getCCATADD3() != null && !"".equals(req.getCCATADD3()))message.setCCATADD3(req.getCCATADD3());	
			if(req.getCCATADD4() != null && !"".equals(req.getCCATADD4()))message.setCCATADD4(req.getCCATADD4());	
			if(req.getCCATADD5() != null && !"".equals(req.getCCATADD5()))message.setCCATADD5(req.getCCATADD5());	
			if(req.getCCATREOF() != null && !"".equals(req.getCCATREOF()))message.setCCATREOF(req.getCCATREOF());	
			message.send();
			message.destroy();
			MessageRecord newmessage = mc.receiveMessage();
			if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("0"))) {
				manejarError(res, ((ELEERRMessage) newmessage));
				log.error("CCARDTRJV - Movimientos de TDC: " + " Error: "+ res.getError().getERNU01() + " - " + res.getError().getERDS01() + " - Canal " + req.getCanal());
				return res;
			} else if (newmessage.getFormatName().equals("CCARDTRJV")) {
				List<CCARDTRJVBean> x = new ArrayList<CCARDTRJVBean>();
				boolean GoIn = !((CCARDTRJVMessage)newmessage).getCCATREOF().equals("*");
				while (GoIn) {
					CCARDTRJVBean bean = new CCARDTRJVBean();
					bean.setCCATRUSR(((CCARDTRJVMessage) newmessage).getCCATRUSR());
					bean.setCCATRNUM(((CCARDTRJVMessage) newmessage).getCCATRNUM());
					bean.setCCATROPC(((CCARDTRJVMessage) newmessage).getCCATROPC());
					bean.setCCATRTYP(((CCARDTRJVMessage) newmessage).getCCATRTYP());
					bean.setH01FLGWK1(((CCARDTRJVMessage) newmessage).getH01FLGWK1());
					bean.setH01FLGWK2(((CCARDTRJVMessage) newmessage).getH01FLGWK2());
					bean.setH01FLGWK3(((CCARDTRJVMessage) newmessage).getH01FLGWK3());
					bean.setCCATRAM1(((CCARDTRJVMessage) newmessage).getCCATRAM1());
					bean.setCCATRAM2(((CCARDTRJVMessage) newmessage).getCCATRAM2());
					bean.setCCATRAM3(((CCARDTRJVMessage) newmessage).getCCATRAM3());
					bean.setCCATRAM4(((CCARDTRJVMessage) newmessage).getCCATRAM4());
					bean.setCCATRAM5(((CCARDTRJVMessage) newmessage).getCCATRAM5());
					bean.setCCATRAM6(((CCARDTRJVMessage) newmessage).getCCATRAM6());
					bean.setCCATRAM7(((CCARDTRJVMessage) newmessage).getCCATRAM7());
					bean.setCCATRAM8(((CCARDTRJVMessage) newmessage).getCCATRAM8());
					bean.setCCATRAM9(((CCARDTRJVMessage) newmessage).getCCATRAM9());
					bean.setCCATRAM10(((CCARDTRJVMessage) newmessage).getCCATRAM10());
					bean.setCCATRAM11(((CCARDTRJVMessage) newmessage).getCCATRAM11());
					bean.setCCATRAM12(((CCARDTRJVMessage) newmessage).getCCATRAM12());
					bean.setCCATRAM13(((CCARDTRJVMessage) newmessage).getCCATRAM13());
					bean.setCCATRAM14(((CCARDTRJVMessage) newmessage).getCCATRAM14());
					bean.setCCATRAM15(((CCARDTRJVMessage) newmessage).getCCATRAM15());
					bean.setCCATRAM16(((CCARDTRJVMessage) newmessage).getCCATRAM16());
					bean.setCCATRAM17(((CCARDTRJVMessage) newmessage).getCCATRAM17());
					bean.setCCATRAM18(((CCARDTRJVMessage) newmessage).getCCATRAM18());
					bean.setCCATRAM19(((CCARDTRJVMessage) newmessage).getCCATRAM19());
					bean.setCCATRAM20(((CCARDTRJVMessage) newmessage).getCCATRAM20());
					bean.setCCATRAM21(((CCARDTRJVMessage) newmessage).getCCATRAM21());
					bean.setCCATRAM22(((CCARDTRJVMessage) newmessage).getCCATRAM22());
					bean.setCCATRAM23(((CCARDTRJVMessage) newmessage).getCCATRAM23());
					bean.setCCATRAM24(((CCARDTRJVMessage) newmessage).getCCATRAM24());
					bean.setCCATRAM25(((CCARDTRJVMessage) newmessage).getCCATRAM25());
					bean.setCCATRAM26(((CCARDTRJVMessage) newmessage).getCCATRAM26());
					bean.setCCATRAM27(((CCARDTRJVMessage) newmessage).getCCATRAM27());
					bean.setCCATRAM28(((CCARDTRJVMessage) newmessage).getCCATRAM28());
					bean.setCCATRAM29(((CCARDTRJVMessage) newmessage).getCCATRAM29());
					bean.setCCATRAM30(((CCARDTRJVMessage) newmessage).getCCATRAM30());
					bean.setCCATRAM31(((CCARDTRJVMessage) newmessage).getCCATRAM31());
					bean.setCCATRAM32(((CCARDTRJVMessage) newmessage).getCCATRAM32());
					bean.setCCATRAM33(((CCARDTRJVMessage) newmessage).getCCATRAM33());
					bean.setCCATRAM34(((CCARDTRJVMessage) newmessage).getCCATRAM34());
					bean.setCCATRAM35(((CCARDTRJVMessage) newmessage).getCCATRAM35());
					bean.setCCATRAM36(((CCARDTRJVMessage) newmessage).getCCATRAM36());
					bean.setCCATRAM37(((CCARDTRJVMessage) newmessage).getCCATRAM37());
					bean.setCCATRAM38(((CCARDTRJVMessage) newmessage).getCCATRAM38());
					bean.setCCATRAM39(((CCARDTRJVMessage) newmessage).getCCATRAM39());
					bean.setCCATRAM40(((CCARDTRJVMessage) newmessage).getCCATRAM40());
					bean.setCCATRAM41(((CCARDTRJVMessage) newmessage).getCCATRAM41());
					bean.setCCATRAM42(((CCARDTRJVMessage) newmessage).getCCATRAM42());
					bean.setCCATRAM43(((CCARDTRJVMessage) newmessage).getCCATRAM43());
					bean.setCCATRAM44(((CCARDTRJVMessage) newmessage).getCCATRAM44());
					bean.setCCATRAM45(((CCARDTRJVMessage) newmessage).getCCATRAM45());
					bean.setCCATRAM46(((CCARDTRJVMessage) newmessage).getCCATRAM46());
					bean.setCCATRAM47(((CCARDTRJVMessage) newmessage).getCCATRAM47());
					bean.setCCATRAM48(((CCARDTRJVMessage) newmessage).getCCATRAM48());
					bean.setCCATRAM49(((CCARDTRJVMessage) newmessage).getCCATRAM49());
					bean.setCCATRAM50(((CCARDTRJVMessage) newmessage).getCCATRAM50());
					bean.setCCATRAM51(((CCARDTRJVMessage) newmessage).getCCATRAM51());
					bean.setCCATRAM52(((CCARDTRJVMessage) newmessage).getCCATRAM52());
					bean.setCCATRAM53(((CCARDTRJVMessage) newmessage).getCCATRAM53());
					bean.setCCATRAM54(((CCARDTRJVMessage) newmessage).getCCATRAM54());
					bean.setCCATRAM55(((CCARDTRJVMessage) newmessage).getCCATRAM55());
					bean.setCCATRAM56(((CCARDTRJVMessage) newmessage).getCCATRAM56());
					bean.setCCATRAM57(((CCARDTRJVMessage) newmessage).getCCATRAM57());
					bean.setCCATRAM58(((CCARDTRJVMessage) newmessage).getCCATRAM58());
					bean.setCCATRAM59(((CCARDTRJVMessage) newmessage).getCCATRAM59());
					bean.setCCATRAM60(((CCARDTRJVMessage) newmessage).getCCATRAM60());
					bean.setCCATRAM61(((CCARDTRJVMessage) newmessage).getCCATRAM61());
					bean.setCCATRAM62(((CCARDTRJVMessage) newmessage).getCCATRAM62());
					bean.setCCATRAM63(((CCARDTRJVMessage) newmessage).getCCATRAM63());
					bean.setCCATRAM64(((CCARDTRJVMessage) newmessage).getCCATRAM64());
					bean.setCCATRAM65(((CCARDTRJVMessage) newmessage).getCCATRAM65());
					bean.setCCATRAM66(((CCARDTRJVMessage) newmessage).getCCATRAM66());
					bean.setCCATRAM67(((CCARDTRJVMessage) newmessage).getCCATRAM67());
					bean.setCCATRAM68(((CCARDTRJVMessage) newmessage).getCCATRAM68());
					bean.setCCATRAM69(((CCARDTRJVMessage) newmessage).getCCATRAM69());
					bean.setCCATRAM70(((CCARDTRJVMessage) newmessage).getCCATRAM70());
					bean.setCCATRAM71(((CCARDTRJVMessage) newmessage).getCCATRAM71());
					bean.setCCATRAM72(((CCARDTRJVMessage) newmessage).getCCATRAM72());
					bean.setCCATRAM73(((CCARDTRJVMessage) newmessage).getCCATRAM73());
					bean.setCCATRAM74(((CCARDTRJVMessage) newmessage).getCCATRAM74());
					bean.setCCATRAM75(((CCARDTRJVMessage) newmessage).getCCATRAM75());
					bean.setCCATRAM76(((CCARDTRJVMessage) newmessage).getCCATRAM76());
					bean.setCCATRAM77(((CCARDTRJVMessage) newmessage).getCCATRAM77());
					bean.setCCATRAM78(((CCARDTRJVMessage) newmessage).getCCATRAM78());
					bean.setCCATRAM79(((CCARDTRJVMessage) newmessage).getCCATRAM79());
					bean.setCCATRAM80(((CCARDTRJVMessage) newmessage).getCCATRAM80());
					bean.setCCATRDC1(((CCARDTRJVMessage) newmessage).getCCATRDC1());
					bean.setCCATRDC2(((CCARDTRJVMessage) newmessage).getCCATRDC2());
					bean.setCCATRDC3(((CCARDTRJVMessage) newmessage).getCCATRDC3());
					bean.setCCATRDC4(((CCARDTRJVMessage) newmessage).getCCATRDC4());
					bean.setCCATRDC5(((CCARDTRJVMessage) newmessage).getCCATRDC5());
					bean.setCCATRDAT(((CCARDTRJVMessage) newmessage).getCCATRDAT());
					bean.setCCATRPRC(((CCARDTRJVMessage) newmessage).getCCATRPRC());
					bean.setCCATRTIM(((CCARDTRJVMessage) newmessage).getCCATRTIM());
					bean.setCCATRDSC(((CCARDTRJVMessage) newmessage).getCCATRDSC());
					bean.setCCATRAMCR(((CCARDTRJVMessage) newmessage).getCCATRAMCR());
					bean.setCCATRAMDB(((CCARDTRJVMessage) newmessage).getCCATRAMDB());
					bean.setCCATRREF(((CCARDTRJVMessage) newmessage).getCCATRREF());
					bean.setCCATADD1(((CCARDTRJVMessage) newmessage).getCCATADD1());
					bean.setCCATADD2(((CCARDTRJVMessage) newmessage).getCCATADD2());
					bean.setCCATADD3(((CCARDTRJVMessage) newmessage).getCCATADD3());
					bean.setCCATADD4(((CCARDTRJVMessage) newmessage).getCCATADD4());
					bean.setCCATADD5(((CCARDTRJVMessage) newmessage).getCCATADD5());
					bean.setCCATREOF(((CCARDTRJVMessage) newmessage).getCCATREOF());
					x.add(bean);
					newmessage = mc.receiveMessage();
					if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("0"))) {
						manejarError(res, ((ELEERRMessage) newmessage));
						return res;
					}
					message = (CCARDTRJVMessage)newmessage;
					GoIn = !((CCARDTRJVMessage)newmessage).getCCATREOF().equals("*");
				}
				res.setCCARDTRJV(x.toArray(new CCARDTRJVBean[0]));
			}
		} catch (Exception e) {
			log.error("CCARDTRJV - Movimientos de TDC - " + e.getMessage() + " - Canal " + req.getCanal(),e);
			throw new WSException(e);
		} finally {
			if (s != null)
				try {
					s.close();
				} catch (IOException e) {
				}
		}
		return res;
	}
	/** 
	 * Servicio para la Solicitud de Chequeras.
	 * @param req
	 * @return
	 * @throws WSException 
	 */
	public INCKBDSJVResponse INCKBDSJV(INCKBDSJVBean req) throws WSException {
		log.info("Invocando INCKBDSJV");
		Parametros params = new Parametros();
		Socket s = null;
		INCKBDSJVResponse res = new INCKBDSJVResponse();
		try {
			MessageContext mc;
			s = new Socket(params.getString("ip"), params.getInt("port1"));
			s.setSoTimeout(params.getInt("timeout"));
			mc = new MessageContext(new DataInputStream(new BufferedInputStream(s.getInputStream())), new DataOutputStream(
					new BufferedOutputStream(s.getOutputStream())), "com.activo.gateway.dibs.messages");
			INCKBDSJVMessage message = (INCKBDSJVMessage) mc.getMessageRecord("INCKBDSJV");
			List<IMSSGDSJVBean> x = new ArrayList<IMSSGDSJVBean>();
			if(req.getDSCKBUSR() != null && !"".equals(req.getDSCKBUSR()))message.setDSCKBUSR(req.getDSCKBUSR());
			if(req.getDSCKBACC() != null && !"".equals(req.getDSCKBACC()))message.setDSCKBACC(req.getDSCKBACC());
			if(req.getDSCKBNCK() != null && !"".equals(req.getDSCKBNCK()))message.setDSCKBNCK(req.getDSCKBNCK());
			if(req.getDSCKBBRN() != null && !"".equals(req.getDSCKBBRN()))message.setDSCKBBRN(req.getDSCKBBRN());
			message.send();
			message.destroy();
			MessageRecord newmessage = mc.receiveMessage();
			if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("0"))) {
				manejarError(res, ((ELEERRMessage) newmessage));
				log.error("INCKBDSJV - Solicitud de Chequeras: " + " Error: "+ res.getError().getERNU01() + " - " + res.getError().getERDS01().trim()+" - "+res.getError().getERDS05() + " - Canal " + req.getCanal());
				return res;
			} else {
				if (newmessage.getFormatName().equals("IMSSGDSJV")) {
					boolean	 GoIn = ((IMSSGDSJVMessage)newmessage).getDSJIMSFIN().equals("0");
					while (GoIn) {
						IMSSGDSJVBean bean = new IMSSGDSJVBean();
						bean.setDSJIMSUSR(((IMSSGDSJVMessage) newmessage).getDSJIMSUSR());
						bean.setDSJNUM(((IMSSGDSJVMessage) newmessage).getDSJNUM());
						bean.setDSJIMSPRD(((IMSSGDSJVMessage) newmessage).getDSJIMSPRD());
						bean.setDSJIMSCUN(((IMSSGDSJVMessage) newmessage).getDSJIMSCUN());
						bean.setDSJIMSSDTE(((IMSSGDSJVMessage) newmessage).getDSJIMSSDTE());
						bean.setDSJIMSSTIM(((IMSSGDSJVMessage) newmessage).getDSJIMSSTIM());
						bean.setDSJIMSTXT(((IMSSGDSJVMessage) newmessage).getDSJIMSTXT());
						bean.setDSJIMSLNKT(((IMSSGDSJVMessage) newmessage).getDSJIMSLNKT());
						bean.setDSJIMSKEY(((IMSSGDSJVMessage) newmessage).getDSJIMSKEY());
						bean.setDSJIMSNME(((IMSSGDSJVMessage) newmessage).getDSJIMSNME());
						bean.setDSJIMSFIN(((IMSSGDSJVMessage) newmessage).getDSJIMSFIN());
						x.add(bean);
						newmessage = mc.receiveMessage();
						if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("0"))) {
							manejarError(res, ((ELEERRMessage) newmessage));
							return res;
						}
						GoIn = ((IMSSGDSJVMessage)newmessage).getDSJIMSFIN().equals("0");
					}
					res.setIMSSGDSJV(x.toArray(new IMSSGDSJVBean[0]));
				}
			}
		} catch (Exception e) {
			log.error("INCKBDSJV - Solicitud de Chequeras - " + e.getMessage() + " - Canal " + req.getCanal(),e);
			throw new WSException(e);
		} finally {
			if (s != null)
				try {
					s.close();
				} catch (IOException e) {
				}
		}
		return res;
	}
	/**
	 * Servicio para realizar Transferencias Internas.
	 * @param req
	 * @return
	 * @throws WSException 
	 */
	public INTRFDSJVResponse INTRFDSJV(INTRFDSJVBean req) throws WSException {
		log.info("Invocando INTRFDSJV");
		Parametros params = new Parametros();
		Socket s = null;
		INTRFDSJVResponse res = new INTRFDSJVResponse();
                
		try {
                    if (req.getCanal().equals("4")) req.setCanal("0"+req.getCanal());
			MessageContext mc;
			s = new Socket(params.getString("ip"), params.getInt("port1"));
			s.setSoTimeout(params.getInt("timeout"));
			mc = new MessageContext(new DataInputStream(new BufferedInputStream(s.getInputStream())), new DataOutputStream(
					new BufferedOutputStream(s.getOutputStream())), "com.activo.gateway.dibs.messages");
			INTRFDSJV5Message message = (INTRFDSJV5Message) mc.getMessageRecord("INTRFDSJV5");
			List<IMSSGDSJVBean> x = new ArrayList<IMSSGDSJVBean>();
			if(req.getINTUSR() != null && !"".equals(req.getINTUSR()))message.setINTUSR5(req.getINTUSR());
			if(req.getINTFRMACC() != null && !"".equals(req.getINTFRMACC()))message.setINTFRMACC5(req.getINTFRMACC());
			if(req.getINTTOACC() != null && !"".equals(req.getINTTOACC()))message.setINTTOACC5(req.getINTTOACC());
			if(req.getINTTRFAMT() != null && !"".equals(req.getINTTRFAMT()))message.setINTTRFAMT5(req.getINTTRFAMT());
			if(req.getINTTYPE() != null && !"".equals(req.getINTTYPE()))message.setINTTYPE5(req.getINTTYPE());
			if(req.getINTREF() != null && !"".equals(req.getINTREF()))message.setINTREF5(req.getINTREF());
			if(req.getINTDESC() != null && !"".equals(req.getINTDESC()))message.setINTDESC5(req.getINTDESC().trim());
			if(req.getINTIPACT() != null && !"".equals(req.getINTIPACT()))message.setINTIPACT(req.getINTIPACT());                        
                        if(req.getINTUSER() != null && !"".equals(req.getINTUSER()))message.setINTUSER(req.getINTUSER());
			if(req.getINTPASWD() != null && !"".equals(req.getINTPASWD()))message.setINTPASWD(req.getINTPASWD());
                        if(req.getCanal() != null && !"".equals(req.getCanal()))message.setINTCANAL5(req.getCanal());
                        
                        message.send();
			message.destroy();
			MessageRecord newmessage = mc.receiveMessage();
			if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("*"))) {
				manejarError(res, ((ELEERRMessage) newmessage));
				if(!(res.getError().getERRNUM().equals("0"))){
					log.error("INTRFDSJV - Transferencias internas: " + " Error: "+ res.getError().getERNU01() + " - " + res.getError().getERDS01());
					return res;
				} 
				//Si es una transferencia a terceros en activo se envia mensaje
				if("t".equals(req.getOperacion())){
					String mensaje = "13";
					//Se llama al servicio de envio de mensajes de texto
					ENVIASMS(req.getCanal(), mensaje, req.getINTTRFAMT(), req.getINTFRMACC(), res.getError().getERDF01().trim(), null, null, null);
				}
			}
		} catch (Exception e) {
			log.error("INTRFDSJV - Transferencias internas - " + e.getMessage(),e);
			throw new WSException(e);
		} finally {
			if (s != null)
				try {
					s.close();
				} catch (IOException e) {
				}
		}
		return res;
	}
	/**
	 * Servicio para realizar Transferencias Internas - Duplicado para ser consumido desde Banca Móvil.
	 * @param req
	 * @return
	 * @throws WSException 
	 */
	public INTRFDSJVResponse INTRFDSJVMOVIL(INTRFDSJVBean req) throws WSException {
		log.info("Invocando INTRFDSJV");
		Parametros params = new Parametros();
		Socket s = null;
		INTRFDSJVResponse res = new INTRFDSJVResponse();
		res.setError(new ELEERR());
		res.getError().setERRNUM("0");
		res.getError().setERNU01("0");
		
		//si el numCanal es 4
		String canalCompleto = "Internet Banking";
		if("1".equals(req.getCanal())){
			canalCompleto = "Atencion Activa";
		}else if("3".equals(req.getCanal())){
			canalCompleto = "Agencia";
		}else if("2".equals(req.getCanal())){
			canalCompleto = "Movil Banking";
		}
		try {
			MessageContext mc;
			s = new Socket(params.getString("ip"), params.getInt("port1"));
			s.setSoTimeout(params.getInt("timeout"));
			mc = new MessageContext(new DataInputStream(new BufferedInputStream(s.getInputStream())), new DataOutputStream(
					new BufferedOutputStream(s.getOutputStream())), "com.activo.gateway.dibs.messages");
			INTRFDSJV2Message message = (INTRFDSJV2Message) mc.getMessageRecord("INTRFDSJV2");
			List<IMSSGDSJVBean> x = new ArrayList<IMSSGDSJVBean>();
			if(req.getINTUSR() != null && !"".equals(req.getINTUSR()))message.setINTUSR(req.getINTUSR());
			if(req.getINTFRMACC() != null && !"".equals(req.getINTFRMACC()))message.setINTFRMACC(req.getINTFRMACC());
			if(req.getINTTOACC() != null && !"".equals(req.getINTTOACC()))message.setINTTOACC(req.getINTTOACC());
			if(req.getINTTRFAMT() != null && !"".equals(req.getINTTRFAMT()))message.setINTTRFAMT(req.getINTTRFAMT());
			if(req.getINTTYPE() != null && !"".equals(req.getINTTYPE()))message.setINTTYPE(req.getINTTYPE());
			if(req.getINTREF() != null && !"".equals(req.getINTREF()))message.setINTREF(req.getINTREF());
			if(req.getINTDESC() != null && !"".equals(req.getINTDESC()))message.setINTDESC(req.getINTDESC());
			if(req.getINTIPACT() != null && !"".equals(req.getINTIPACT()))message.setINTDESC(req.getINTIPACT());
                        
                        log.error("INTRFDSJVMOVIL - canal: " + req.getCanal());
			Database db = new Database();
			Parametros p = new Parametros();
			LimitesGenerales[] limitesGeneralNatural =null;
			String  tipoRIF = null;
			double acumulado =0, limiteInternasGeneral = 0;
			Afiliaciones[] acumuladoInterna= null;
			Util u = new Util();
			EmailSender envioemail = new EmailSender();
			double monto_maximo= 0, montoAcu = 0;
			String numeroCuenta = req.getINTTOACC();
			numeroCuenta = numeroCuenta.replaceFirst ("^0*", "");
			numeroCuenta =StringUtils.leftPad(u.completaCuenta(numeroCuenta),20,'0');
			boolean usuario = false;
			String nuevoAcumulado = null, nuevoAcumuladoMonto = null;
			DecimalFormatSymbols simbolos = new DecimalFormatSymbols();
			simbolos.setDecimalSeparator('.');
			DecimalFormat df = new DecimalFormat("0.00",simbolos);
			if(db.conectar()){
				//Verifico si es un usuario juridico
				tipoRIF = db.buscarTipoRIF(req.getId_usuario(), req.getCanal());
				//Consulto límites del usuario en la base de datos
				limitesGeneralNatural = db.buscarLimitesGeneral(req.getCanal(), req.getId_usuario());
				if(StringUtils.isEmpty(tipoRIF)){
					if(limitesGeneralNatural[0].getLimiteInternasGeneralNatural() != 0){
						limiteInternasGeneral = limitesGeneralNatural[0].getLimiteInternasGeneralNatural();
					}
				}else{
					if(limitesGeneralNatural[0].getLimiteInternasGeneralJuridico() != 0){
						limiteInternasGeneral = limitesGeneralNatural[0].getLimiteInternasGeneralJuridico();
					}
				}
				
				if(!"p".equals(req.getOperacion())){
					if(limiteInternasGeneral != 0){
						if(Double.parseDouble(req.getINTTRFAMT()) > limiteInternasGeneral){
							res.getError().setERRNUM("1");
							res.getError().setERNU01("1");
							res.getError().setERDS01("El monto de la transacción no puede ser mayor al límite general definido");
							log.error(res.getError().getERDS01());
							return res;
						}else{
							//Consulto el monto maximo
							monto_maximo = db.buscarMontoMaximoAfiliacion(req.getId_usuario(),req.getCanal(), numeroCuenta);
							
								if(monto_maximo > 0){
									if(Double.parseDouble(req.getINTTRFAMT()) > (monto_maximo)){
										res.getError().setERRNUM("1");
										res.getError().setERNU01("2");
										res.getError().setERDS01("El monto de la transacción no puede ser mayor al monto máximo de la afiliación");
										log.error(res.getError().getERDS01());
										return res;
									}else{
										//Consulto los acumulados
										acumuladoInterna = db.buscarAcumulados(req.getId_usuario(), req.getCanal());
										acumulado = 0;
										
										if(acumuladoInterna.length != 0){
											
											acumulado = Double.parseDouble(acumuladoInterna[0].getAcumulado_internas_terceros());
											nuevoAcumulado = df.format(acumulado);
											montoAcu = (Double.parseDouble(req.getINTTRFAMT()) + Double.parseDouble(nuevoAcumulado));
											nuevoAcumuladoMonto = df.format(limiteInternasGeneral);
											if(req.getOperacion() != "p"){
												if(montoAcu > limiteInternasGeneral){
													res.getError().setERRNUM("1");
													res.getError().setERNU01("3");
													res.getError().setERDS01("El monto de la transacción supera el límite acumulado");
													log.error(res.getError().getERDS01());
													return res;
												}
											}
										}else{
											nuevoAcumulado = "0";
											montoAcu = (Double.parseDouble(req.getINTTRFAMT()) + Double.parseDouble(nuevoAcumulado));
											nuevoAcumuladoMonto = "0";
										}
									}
								}						
						}
					}else{						
							//Consulto el monto maximo
							monto_maximo = db.buscarMontoMaximoAfiliacion(req.getId_usuario(),req.getCanal(), numeroCuenta);
							if(monto_maximo > 0){
								if(Double.parseDouble(req.getINTTRFAMT()) > (monto_maximo)){
									res.getError().setERRNUM("1");
									res.getError().setERNU01("2");
									res.getError().setERDS01("El monto de la transacción no puede ser mayor al monto máximo de la afiliación");
									log.error(res.getError().getERDS01());
									return res;
								}
							}
							acumuladoInterna = db.buscarAcumulados(req.getId_usuario(), req.getCanal());
							if(acumuladoInterna.length != 0){
								acumulado = Double.parseDouble(acumuladoInterna[0].getAcumulado_internas_terceros());
								nuevoAcumulado = df.format(acumulado);
								montoAcu = (Double.parseDouble(req.getINTTRFAMT()) + Double.parseDouble(nuevoAcumulado));
								nuevoAcumuladoMonto = df.format(limiteInternasGeneral);
								
							}else{
								
								acumulado = 0;
								nuevoAcumulado = "0";
								montoAcu = (Double.parseDouble(req.getINTTRFAMT()) + acumulado);
								nuevoAcumuladoMonto = df.format(limiteInternasGeneral);
								
							}						
					}
				}
							}//fin llamada base de datos
			message.send();
			message.destroy();
			MessageRecord newmessage = mc.receiveMessage();
			if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("*"))) {
				manejarError(res, ((ELEERRMessage) newmessage));
				if(!(res.getError().getERRNUM().equals("0"))){
					log.error("INTRFDSJV - Transferencias internas - Banca Movil: " + " Error: "+ res.getError().getERNU01() + " - " + res.getError().getERDS01());
					return res;
				} 
				Calendar xxx = Calendar.getInstance();
				if(db.conectar()){
					if(!"p".equals(req.getOperacion())){
						usuario = db.actualizaAcumulado(req.getId_usuario(), montoAcu, 2,xxx);
					}
				}
				String ordenante = null, beneficiario = null, footer = null,emailPrincipalUsuario= null;
				String nombreUsuario ="";
				if(db.conectar()){
					//buscamos los cuerpos de los mensajes, ordenante, beneficiario
					ordenante = db.buscarMensajeCorreo("email_transferencia_ordenante");
					beneficiario = db.buscarMensajeCorreo("email_transferencia_beneficiario");
					//buscamos el footer del correo
					footer = db.buscarFooterCorreos("footer_correos");
					emailPrincipalUsuario = db.buscarEmailUsuario(req.getId_usuario());
					NIBPF3010Bean req3010 = new NIBPF3010Bean();
					req3010.setNROCUENTA(StringUtils.leftPad(req.getINTFRMACC(),12,'0'));
					req3010.setNROPARAM("2");
					NIBPF3010Response resNibpf3010 = null;
					resNibpf3010 = NIBPF3010(req3010);
					nombreUsuario = resNibpf3010.getNIBPF3010().getINTLNADB();
					if(resNibpf3010.getError()!=null){
						res.setError(resNibpf3010.getError());
						return res;
					}
				}
				boolean envioCorreoOrdenante = false, envioCorreoBeneficiario = false;
				if(ordenante != null && beneficiario != null){
					SimpleDateFormat formateador = new SimpleDateFormat("dd'/'MM'/'yy HH:mm:ss", new Locale("ES"));
					Calendar fechaDate = Calendar.getInstance();
					String fecha = formateador.format(fechaDate.getTime());
					String cuentaOrigen = req.getINTFRMACC().trim();
					String cuentaDestino = req.getINTTOACC().trim();
					cuentaDestino = cuentaDestino.replaceFirst ("^0*", "");
					cuentaOrigen = StringUtils.leftPad(u.completaCuenta(cuentaOrigen),20,'0');
					cuentaDestino =StringUtils.leftPad(u.completaCuenta(cuentaDestino),20,'0');
					DecimalFormat formatear = new DecimalFormat("#0.00");
					String montoT = null;
					montoT =  formatear.format(Double.parseDouble(req.getINTTRFAMT().trim()));
					String subject = "Notificación Transferencia";
					
					String mensajeOrdenante = String.format(ordenante,nombreUsuario.trim(), 
															canalCompleto,
															req.getDescTipoTransaccion().trim(),
															req.getDescTipoOperacion().trim(), 
															u.enmascaraCuenta(cuentaOrigen),
															u.enmascaraCuenta(cuentaDestino),
															p.getString("bancoEmail"),
															req.getNombreBeneficiario().trim(),
															montoT,fecha,
															req.getINTDESC().trim(),
															res.getError().getERDF01().trim());
					String mensajeBeneficiario = String.format(beneficiario,req.getNombreBeneficiario().trim(),
							nombreUsuario.trim(), u.enmascaraCuenta(cuentaDestino), p.getString("bancoEmail"),
							montoT, req.getINTDESC().trim());;
							if("t".equals(req.getOperacion())){
								envioCorreoOrdenante = envioemail.sendMail(emailPrincipalUsuario, subject, mensajeOrdenante,footer);
								envioCorreoBeneficiario = envioemail.sendMail(req.getEmailBeneficiario(), subject, mensajeBeneficiario, footer);
								if(!envioCorreoOrdenante){
									res.getError().setERRNUM("1");
									res.getError().setERNU01("-1");
									res.getError().setERDS01("Error, no se pudo enviar el correo electronico Ordenante");
									log.error("Error, no se pudo enviar el correo electronico Ordenante- Canal: " + req.getCanal());
								}
								if(!envioCorreoBeneficiario){
									res.getError().setERRNUM("1");
									res.getError().setERNU01("-2");
									res.getError().setERDS01("Error, no se pudo enviar el correo electronico Beneficiario");
									log.error("Error, no se pudo enviar el correo electronico Beneficiario- Canal: " + req.getCanal());
								}
							}
				}else {
					res.getError().setERRNUM("1");
					res.getError().setERNU01("-3");
					res.getError().setERDS01("Error al armar el correo electronico");
					log.error("Correo no enviado, no se encontro cuerpo del mensaje - Canal: " + req.getCanal());
				}
				//Si es una transferencia a terceros en activo se envia mensaje
				if("t".equals(req.getOperacion())){
					String mensaje = "13";
					//Se llama al servicio de envio de mensajes de texto
					ENVIASMS(req.getCanal(), mensaje, req.getINTTRFAMT(), req.getINTFRMACC(), res.getError().getERDF01().trim(), null, null, null);
				}
				
			}
		} catch (Exception e) {
			log.error("INTRFDSJV - Transferencias internas- Banca Movil - " + e.getMessage(),e);
			throw new WSException(e);
		} finally {
			if (s != null)
				try {
					s.close();
				} catch (IOException e) {
				}
		}
		return res;
	}
	/**
	 * Servicio para realizar Transferencias Externas y  Pago de TDC Otros Bancos.
	 * @param req
	 * @return
	 * @throws WSException 
	 */
	public INEXTDSJVResponse INEXTDSJV(INEXTDSJVBean req) throws WSException {
		log.info("Invocando INEXTDSJV");
		Socket s = null;
		INEXTDSJVResponse res = new INEXTDSJVResponse();
		try {
                    if (req.getCanal().equals("4")) req.setCanal("0"+req.getCanal());
			Parametros params = new Parametros();
			MessageContext mc;
			s = new Socket(params.getString("ip"), params.getInt("port1"));
			s.setSoTimeout(params.getInt("timeout"));
			mc = new MessageContext(new DataInputStream(new BufferedInputStream(s.getInputStream())), new DataOutputStream(
					new BufferedOutputStream(s.getOutputStream())), "com.activo.gateway.dibs.messages");
			INEXTDSJV5Message message;
			message = (INEXTDSJV5Message) mc.getMessageRecord("INEXTDSJV5");
			List<IMSSGDSJVBean> x = new ArrayList<IMSSGDSJVBean>();
			if(req.getINEUSR() != null && !"".equals(req.getINEUSR()))message.setINEUSR5(req.getINEUSR());
			if(req.getINEVDT1() != null && !"".equals(req.getINEVDT1()))message.setINEVDT15(req.getINEVDT1());
			if(req.getINEVDT2() != null && !"".equals(req.getINEVDT2()))message.setINEVDT25(req.getINEVDT2());
			if(req.getINEVDT3() != null && !"".equals(req.getINEVDT3()))message.setINEVDT35(req.getINEVDT3());
			if(req.getINEAMT() != null && !"".equals(req.getINEAMT()))message.setINEAMT5(req.getINEAMT());
			if(req.getINECCY() != null && !"".equals(req.getINECCY()))message.setINECCY5(req.getINECCY());
			if(req.getINEFRMACC() != null && !"".equals(req.getINEFRMACC()))message.setINEFRMACC5(req.getINEFRMACC());
			if(req.getINEFAD1() != null && !"".equals(req.getINEFAD1()))message.setINEFAD15(req.getINEFAD1());
			if(req.getINEFAD2() != null && !"".equals(req.getINEFAD2()))message.setINEFAD25(req.getINEFAD2());
			if(req.getINEFAD3() != null && !"".equals(req.getINEFAD3()))message.setINEFAD35(req.getINEFAD3());
			if(req.getINEBNFACC() != null && !"".equals(req.getINEBNFACC()))message.setINEBNFACC5(req.getINEBNFACC());
			if(req.getINEBNFAD1() != null && !"".equals(req.getINEBNFAD1()))message.setINEBNFAD15(req.getINEBNFAD1());
			if(req.getINEBNFAD2() != null && !"".equals(req.getINEBNFAD2()))message.setINEBNFAD25(req.getINEBNFAD2());
			if(req.getINEBNFAD3() != null && !"".equals(req.getINEBNFAD3()))message.setINEBNFAD35(req.getINEBNFAD3());
			if(req.getINEXPMTV() != null && !"".equals(req.getINEXPMTV()))message.setINEXPMTV5(req.getINEXPMTV());
			if(req.getINEBNKID() != null && !"".equals(req.getINEBNKID()))message.setINEBNKID5(req.getINEBNKID());
			if(req.getINEBNKSN() != null && !"".equals(req.getINEBNKSN()))message.setINEBNKSN5(req.getINEBNKSN());
			if(req.getINEBNKAD1() != null && !"".equals(req.getINEBNKAD1()))message.setINEBNKAD15(req.getINEBNKAD1());
			if(req.getINEBNKAD2() != null && !"".equals(req.getINEBNKAD2()))message.setINEBNKAD25(req.getINEBNKAD2());
			if(req.getINEBNKAD3() != null && !"".equals(req.getINEBNKAD3()))message.setINEBNKAD35(req.getINEBNKAD3());
			if(req.getINEBNKAD4() != null && !"".equals(req.getINEBNKAD4()))message.setINEBNKAD45(req.getINEBNKAD4());
			if(req.getINEIBNKID() != null && !"".equals(req.getINEIBNKID()))message.setINEIBNKID5(req.getINEIBNKID());
			if(req.getINEINTAD1() != null && !"".equals(req.getINEINTAD1()))message.setINEINTAD15(req.getINEINTAD1());
			if(req.getINEINTAD2() != null && !"".equals(req.getINEINTAD2()))message.setINEINTAD25(req.getINEINTAD2());
			if(req.getINEINTAD3() != null && !"".equals(req.getINEINTAD3()))message.setINEINTAD35(req.getINEINTAD3());
			if(req.getINEINTAD4() != null && !"".equals(req.getINEINTAD4()))message.setINEINTAD45(req.getINEINTAD4());
			if(req.getINEDTP1() != null && !"".equals(req.getINEDTP1()))message.setINEDTP15(req.getINEDTP1());
			if(req.getINEDTP2() != null && !"".equals(req.getINEDTP2()))message.setINEDTP25(req.getINEDTP2());
			if(req.getINEDTP3() != null && !"".equals(req.getINEDTP3()))message.setINEDTP35(req.getINEDTP3());
			if(req.getINECKN() != null && !"".equals(req.getINECKN()))message.setINECKN5(req.getINECKN());
			if(req.getINESFMT() != null && !"".equals(req.getINESFMT()))message.setINESFMT5(req.getINESFMT());
			if(req.getINEFFEE() != null && !"".equals(req.getINEFFEE()))message.setINEFFEE5(req.getINEFFEE());
                        if(req.getINEDIP() != null && !"".equals(req.getINEDIP()))message.setINEDIP(req.getINEDIP());
                        if(req.getCanal() != null && !"".equals(req.getCanal()))message.setINECNL5(req.getCanal());
			
                        message.send();
			message.destroy();
			MessageRecord newmessage = mc.receiveMessage();
			if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("*"))) {
				manejarError(res, ((ELEERRMessage) newmessage));
				
				if(!(res.getError().getERRNUM().equals("0"))){
					log.error("INEXTDSJV - Transferencias externas: " + " Error: "+ res.getError().getERNU01() + " - " + res.getError().getERDS01() + " - Canal " + req.getCanal());
					return res;
				}
				
				String mensaje = "";
				if(req.getINEDTP1().substring(0,4).equals("0225") && "t".equals(req.getOperacion())){//el pago de tdc es a terceros
					mensaje = "20";
				}else if(req.getINEDTP1().substring(0,4).equals("0225") && "t".equals(req.getOperacion())){//el pago de tdc es a mismo titular
					mensaje = "19";
				}else if(req.getINEDTP1().substring(0,4).equals("0227")){//la transf es a terceros
					mensaje = "14";
				}else if(req.getINEDTP1().substring(0,4).equals("0220")){//la transf es a mismo titular
					mensaje = "21";
				}
				
				//se llama al servicio de envio de mensajes de texto
				ENVIASMS(req.getCanal(), mensaje, req.getINEAMT(), req.getINEFRMACC(), res.getError().getERDF01().trim(), null, null, null);
			}
		} catch (Exception e) {
			log.error("INEXTDSJV - Transferencias externas - " + e.getMessage() + " - Canal " + req.getCanal(),e);
			throw new WSException(e);
		} finally {
			if (s != null)
				try {
					s.close();
				} catch (IOException e) {
				}
		}
		return res;
	}
	/**
	 * Servicio para realizar Transferencias Externas y  Pago de TDC Otros Bancos.
	 * @param req
	 * @return
	 * @throws WSException 
	 */
	public INEXTDSJVResponse INEXTDSJVMOVIL(INEXTDSJVBean req) throws WSException {
		log.info("Invocando INEXTDSJV");
		Socket s = null;
		INEXTDSJVResponse res = new INEXTDSJVResponse();
		res.setError(new ELEERR());
		res.getError().setERRNUM("0");
		res.getError().setERNU01("0");
		//si el numCanal es 4
		String canalCompleto = "Internet Banking";
		if("1".equals(req.getCanal())){
			canalCompleto = "Atencion Activa";
		}else if("3".equals(req.getCanal())){
			canalCompleto = "Agencia";
		}else if("2".equals(req.getCanal())){
			canalCompleto = "Movil Banking";
		}
		try {
			Parametros params = new Parametros();
			MessageContext mc;
			s = new Socket(params.getString("ip"), params.getInt("port1"));
			s.setSoTimeout(params.getInt("timeout"));
			mc = new MessageContext(new DataInputStream(new BufferedInputStream(s.getInputStream())), new DataOutputStream(
					new BufferedOutputStream(s.getOutputStream())), "com.activo.gateway.dibs.messages");
			INEXTDSJV2Message message;
			message = (INEXTDSJV2Message) mc.getMessageRecord("INEXTDSJV2");
			List<IMSSGDSJVBean> x = new ArrayList<IMSSGDSJVBean>();
			if(req.getINEUSR() != null && !"".equals(req.getINEUSR()))message.setINEUSR(req.getINEUSR());
			if(req.getINEVDT1() != null && !"".equals(req.getINEVDT1()))message.setINEVDT1(req.getINEVDT1());
			if(req.getINEVDT2() != null && !"".equals(req.getINEVDT2()))message.setINEVDT2(req.getINEVDT2());
			if(req.getINEVDT3() != null && !"".equals(req.getINEVDT3()))message.setINEVDT3(req.getINEVDT3());
			if(req.getINEAMT() != null && !"".equals(req.getINEAMT()))message.setINEAMT(req.getINEAMT());
			if(req.getINECCY() != null && !"".equals(req.getINECCY()))message.setINECCY(req.getINECCY());
			if(req.getINEFRMACC() != null && !"".equals(req.getINEFRMACC()))message.setINEFRMACC(req.getINEFRMACC());
			if(req.getINEFAD1() != null && !"".equals(req.getINEFAD1()))message.setINEFAD1(req.getINEFAD1());
			if(req.getINEFAD2() != null && !"".equals(req.getINEFAD2()))message.setINEFAD2(req.getINEFAD2());
			if(req.getINEFAD3() != null && !"".equals(req.getINEFAD3()))message.setINEFAD3(req.getINEFAD3());
			if(req.getINEBNFACC() != null && !"".equals(req.getINEBNFACC()))message.setINEBNFACC(req.getINEBNFACC());
			if(req.getINEBNFAD1() != null && !"".equals(req.getINEBNFAD1()))message.setINEBNFAD1(req.getINEBNFAD1());
			if(req.getINEBNFAD2() != null && !"".equals(req.getINEBNFAD2()))message.setINEBNFAD2(req.getINEBNFAD2());
			if(req.getINEBNFAD3() != null && !"".equals(req.getINEBNFAD3()))message.setINEBNFAD3(req.getINEBNFAD3());
			if(req.getINEXPMTV() != null && !"".equals(req.getINEXPMTV()))message.setINEXPMTV(req.getINEXPMTV());
			if(req.getINEBNKID() != null && !"".equals(req.getINEBNKID()))message.setINEBNKID(req.getINEBNKID());
			if(req.getINEBNKSN() != null && !"".equals(req.getINEBNKSN()))message.setINEBNKSN(req.getINEBNKSN());
			if(req.getINEBNKAD1() != null && !"".equals(req.getINEBNKAD1()))message.setINEBNKAD1(req.getINEBNKAD1());
			if(req.getINEBNKAD2() != null && !"".equals(req.getINEBNKAD2()))message.setINEBNKAD2(req.getINEBNKAD2());
			if(req.getINEBNKAD3() != null && !"".equals(req.getINEBNKAD3()))message.setINEBNKAD3(req.getINEBNKAD3());
			if(req.getINEBNKAD4() != null && !"".equals(req.getINEBNKAD4()))message.setINEBNKAD4(req.getINEBNKAD4());
			if(req.getINEIBNKID() != null && !"".equals(req.getINEIBNKID()))message.setINEIBNKID(req.getINEIBNKID());
			if(req.getINEINTAD1() != null && !"".equals(req.getINEINTAD1()))message.setINEINTAD1(req.getINEINTAD1());
			if(req.getINEINTAD2() != null && !"".equals(req.getINEINTAD2()))message.setINEINTAD2(req.getINEINTAD2());
			if(req.getINEINTAD3() != null && !"".equals(req.getINEINTAD3()))message.setINEINTAD3(req.getINEINTAD3());
			if(req.getINEINTAD4() != null && !"".equals(req.getINEINTAD4()))message.setINEINTAD4(req.getINEINTAD4());
			if(req.getINEDTP1() != null && !"".equals(req.getINEDTP1()))message.setINEDTP1(req.getINEDTP1());
			if(req.getINEDTP2() != null && !"".equals(req.getINEDTP2()))message.setINEDTP2(req.getINEDTP2());
			if(req.getINEDTP3() != null && !"".equals(req.getINEDTP3()))message.setINEDTP3(req.getINEDTP3());
			if(req.getINECKN() != null && !"".equals(req.getINECKN()))message.setINECKN(req.getINECKN());
			if(req.getINESFMT() != null && !"".equals(req.getINESFMT()))message.setINESFMT(req.getINESFMT());
			if(req.getINEFFEE() != null && !"".equals(req.getINEFFEE()))message.setINEFFEE(req.getINEFFEE());			
                        
                        log.error("INEXTDSJVMOVIL - canal: " + req.getCanal());
			//Para la validación de los limites y montos del usuario
			Database db = new Database();
			Parametros p = new Parametros();
			LimitesGenerales[] limitesGeneralNatural =null;
			String tipoRIF = null, nombreBanco = null, v= null, nomBanco  = null;;
			ArrayList<String> banco = new ArrayList<String>();
			double limiteExternasGeneral = 0, acumulado, montoM = 0;
			String resultAcumulado = null;
			double monto_maximo = 0, montoTotal = 0;
			boolean usuario = false;
			Afiliaciones[] acumuladoInterna= null;
			Util u = new Util();
			EmailSender envioemail = new EmailSender();
			String bandera = null;
			boolean envioCorreoOrdenante = false,envioCorreoBeneficiario = false; 
			//Formatear monto
			DecimalFormatSymbols simbolos = new DecimalFormatSymbols();
			simbolos.setDecimalSeparator('.');
			DecimalFormat formatear = new DecimalFormat("#0.00", simbolos);
			String montoT = null;
			montoT =  formatear.format(Double.parseDouble(req.getINEAMT().trim()));
			String  montoPagar =req.getINEAMT();
			if(db.conectar()){
				//Verifico si es un usuario juridico
				tipoRIF = db.buscarTipoRIF(req.getId_usuario(), req.getCanal());
				//Consulto límites del usuario en la base de datos
				limitesGeneralNatural = db.buscarLimitesGeneral(req.getCanal(), req.getId_usuario());
				if("".equals(tipoRIF)){
					if(limitesGeneralNatural[0].getLimiteInternasGeneralNatural() >= 0){
						limiteExternasGeneral = limitesGeneralNatural[0].getLimiteExternasGeneralNatural();
					}
				}else{
					if(limitesGeneralNatural[0].getLimiteInternasGeneralJuridico() >= 0){
						limiteExternasGeneral = limitesGeneralNatural[0].getLimiteExternasGeneralJuridico();
					}
				}
				if(Double.parseDouble(montoT) > limiteExternasGeneral){
					res.getError().setERRNUM("1");
					res.getError().setERNU01("1");
					res.getError().setERDS01("El monto de la transacción no puede ser mayor al límite general definido");
					log.error(res.getError().getERDS01());
					return res;
				}else{
					//Consulto el monto maximo
					monto_maximo = db.buscarMontoMaximoAfiliacion(req.getId_usuario(),req.getCanal(), req.getINEBNFACC());
					if(!"".equals(monto_maximo)){
						if((Double.parseDouble(montoT)) > monto_maximo){
							res.getError().setERRNUM("1");
							res.getError().setERNU01("2");
							res.getError().setERDS01("El monto de la transacción no puede ser mayor al monto máximo de la afiliación");
							log.error(res.getError().getERDS01());
							return res;
						}else{
							//Consulto los acumulados
							acumuladoInterna = db.buscarAcumulados(req.getId_usuario(), req.getCanal());
							if(acumuladoInterna.length != 0){
								double acumuladoExternas = Double.valueOf(acumuladoInterna[0].getAcumulado_externas()); 
								acumulado = acumuladoExternas;
								montoTotal = (Double.parseDouble(montoT) + acumulado);
								if(limiteExternasGeneral < montoTotal){
									res.getError().setERRNUM("1");
									res.getError().setERNU01("3");
									res.getError().setERDS01("El monto de la transacción supera el límite acumulado");
									log.error(res.getError().getERDS01());
									return res;
								}
							}else{
								acumulado = 0;
								montoTotal = (Double.parseDouble(montoT) + acumulado);
						}
					}
				}
			}
			}//fin llamada base de datos
			message.send();
			message.destroy();
			MessageRecord newmessage = mc.receiveMessage();
			if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("*"))) {
				manejarError(res, ((ELEERRMessage) newmessage));
				
				if(!(res.getError().getERRNUM().equals("0"))){
					log.error("INEXTDSJV - Transferencias externas: " + " Error: "+ res.getError().getERNU01() + " - " + res.getError().getERDS01() + " - Canal " + req.getCanal());
					return res;
				} 
					Calendar fechaDate = Calendar.getInstance();
					if(db.conectar()){
						if("p".equals(req.getOperacion())){
							usuario = db.actualizaAcumulado(req.getId_usuario(), montoTotal, 3, fechaDate);
						}else{
							usuario = db.actualizaAcumulado(req.getId_usuario(), montoTotal, 3, fechaDate);
						}
					}
					if("pagotdc".equals(req.getTipoPago())){
						bandera = "tdc";
						NIB090501Bean reqBanco = new NIB090501Bean();
						String tdc =req.getINEBNFACC();
						tdc = StringUtils.rightPad(tdc, 20, "0");
						reqBanco.setTNROTARJ(tdc);
						NIB090501Response resBanco = new NIB090501Response();
						resBanco = NIB090501(reqBanco);
						nomBanco = resBanco.getNIB090501().getTDESBANCO();
					}else if("transferencia".equals(req.getTipoPago())){
						bandera = "transferencia";
						//Incorporado para el envío de correos, recuperar el nombre del banco según el número de cuenta que especifique el usuario
						BNKSRDSJVBean reqBanco = new BNKSRDSJVBean();
						reqBanco.setBNKPVI("F");
						BNKSRDSJVResponse resBanco = this.BNKSRDSJV(reqBanco);
						resBanco = BNKSRDSJV(reqBanco);
						if(resBanco.getError() == null){
							for (BNKSRDSJVBean cc : resBanco.getBNKSRDSJV()) {
								String idBanco = cc.getBNKID().trim();							
								String numeroBanco = idBanco.substring(5,9);
								String cuentaDestino = req.getINEBNFACC().substring(0, 4);
								if(numeroBanco.equals(cuentaDestino)){
									nomBanco = cc.getBNKNME();
									break;
								}
							}   
						}
					}	
					String ordenante = null, beneficiario = null, footer = null, emailPrincipalUsuario = null;
					String nombreUsuario ="";
					if(db.conectar()){
						if("pagotdc".equals(req.getTipoPago())){
							//buscamos el cuerpo del mensaje
							ordenante = db.buscarMensajeCorreo("email_pagostdc_ordenante");
							beneficiario = db.buscarMensajeCorreo("email_pagostdc_beneficiario");
						}else{
							ordenante = db.buscarMensajeCorreo("email_transferencia_ordenante");
							beneficiario = db.buscarMensajeCorreo("email_transferencia_beneficiario");
						}
						//buscamos el footer del correo
						footer = db.buscarFooterCorreos("footer_correos");
						emailPrincipalUsuario = db.buscarEmailUsuario(req.getId_usuario());
						NIBPF3010Bean req3010 = new NIBPF3010Bean();
						req3010.setNROCUENTA(StringUtils.leftPad(req.getINEFRMACC(),12,'0'));
						req3010.setNROPARAM("2");
						NIBPF3010Response resNibpf3010 = null;
						resNibpf3010 = NIBPF3010(req3010);
						nombreUsuario = resNibpf3010.getNIBPF3010().getINTLNADB();
						if(resNibpf3010.getError()!=null){
							res.setError(resNibpf3010.getError());
							return res;
						}
					}
					if(ordenante != null && beneficiario != null){
						SimpleDateFormat formateador = new SimpleDateFormat("dd'/'MM'/'yy HH:mm:ss", new Locale("ES"));
						Calendar fechaD = Calendar.getInstance();
						String fecha = formateador.format(fechaD.getTime());
						String subject = null, mensajeOrdenante = null, mensajeBeneficiario = null;
						//Completar cuenta 20
						String cuentaOrigen = req.getINEFRMACC();
						cuentaOrigen = u.completaCuenta(cuentaOrigen);
						cuentaOrigen = StringUtils.leftPad(cuentaOrigen, 20, '0');
						if(bandera.equals("transferencia")){
							subject = "Notificación Transferencia";
						mensajeOrdenante = String.format(ordenante,nombreUsuario.trim(), 
														canalCompleto,
														req.getDescTipoTransaccion().trim(), 
														req.getDescTipoOperacion().trim(), 
														u.enmascaraCuenta(cuentaOrigen),
														u.enmascaraCuenta(req.getINEBNFACC()),
														p.getString("bancoEmail"), 
														req.getNombreBeneficiario().trim(),
														montoT,fecha, 
														req.getINEDTP2()+" "+req.getINEDTP3().trim(),
														res.getError().getERDF01().trim());  
							mensajeBeneficiario = String.format(beneficiario,req.getNombreBeneficiario().trim(), nombreUsuario.trim(), u.enmascaraCuenta(req.getINEBNFACC()),
									p.getString("bancoEmail"), montoT, req.getINEDTP2()+" "+req.getINEDTP3().trim());
						}else{
							subject = "Notificación Pago Tarjeta de Crédito";
						mensajeOrdenante = String.format(ordenante,nombreUsuario.trim(), 
														canalCompleto,
														req.getDescTipoTransaccion().trim(), 
														req.getDescTipoOperacion().trim(), 
														u.enmascaraCuenta(cuentaOrigen),
														u.enmascaraTDC(req.getINEBNFACC()),
														nomBanco.trim(), req.getNombreBeneficiario().trim(),
														montoT,fecha, 
														req.getINEDTP2()+" "+req.getINEDTP3().trim(),
														res.getError().getERDF01().trim());  
							mensajeBeneficiario = String.format(beneficiario,req.getNombreBeneficiario().trim(), nombreUsuario.trim(), u.enmascaraTDC(req.getINEBNFACC()),
									nomBanco.trim(), montoT, req.getINEDTP2()+" "+req.getINEDTP3().trim());
						}
						if("p".equals(req.getOperacion())){
							envioCorreoOrdenante = envioemail.sendMail(emailPrincipalUsuario, subject, mensajeOrdenante,footer);
							if(!envioCorreoOrdenante){
								res.getError().setERRNUM("1");
								res.getError().setERNU01("-1");
								res.getError().setERDS01("Error, no se pudo enviar el correo electronico Ordenante");
								log.error("Error, no se pudo enviar el correo electronico Ordenante- Canal: " + req.getCanal());
							}
						}else{
							if("t".equals(req.getOperacion())){
								envioCorreoOrdenante = envioemail.sendMail(emailPrincipalUsuario, subject, mensajeOrdenante,footer);
								envioCorreoBeneficiario = envioemail.sendMail(req.getEmailBeneficiario(), subject, mensajeBeneficiario, footer);
								if(!envioCorreoOrdenante){
									res.getError().setERRNUM("1");
									res.getError().setERNU01("-1");
									res.getError().setERDS01("Error, no se pudo enviar el correo electronico Ordenante");
									log.error("Error, no se pudo enviar el correo electronico Beneficiario- Canal: " + req.getCanal());
								}
								if(!envioCorreoBeneficiario){
									res.getError().setERRNUM("1");
									res.getError().setERNU01("-2");
									res.getError().setERDS01("Error, no se pudo enviar el correo electronico Beneficiario");
									log.error("Error, no se pudo enviar el correo electronico Beneficiario- Canal: " + req.getCanal());
								}	
							}
						}
					}else {
						res.getError().setERRNUM("1");
						res.getError().setERNU01("-1");
						res.getError().setERDS01("Error al armar el correo electronico");
						log.error("Correo no enviado, no se encontro cuerpo del mensaje - Canal: " + req.getCanal());
					}
				String mensaje = "";
				if(req.getINEDTP1().substring(0,4).equals("0225") && "t".equals(req.getOperacion())){//el pago de tdc es a terceros
					mensaje = "20";
				}else if(req.getINEDTP1().substring(0,4).equals("0225") && "t".equals(req.getOperacion())){//el pago de tdc es a mismo titular
					mensaje = "19";
				}else if(req.getINEDTP1().substring(0,4).equals("0227")){//la transf es a terceros
					mensaje = "14";
				}else if(req.getINEDTP1().substring(0,4).equals("0220")){//la transf es a mismo titular
					mensaje = "21";
				}
				
				//se llama al servicio de envio de mensajes de texto
				ENVIASMS(req.getCanal(), mensaje, req.getINEAMT(), req.getINEFRMACC(), res.getError().getERDF01().trim(), null, null, null);
				
			}
		} catch (Exception e) {
			log.error("INEXTDSJV - Transferencias externas - " + e.getMessage() + " - Canal " + req.getCanal(),e);
			throw new WSException(e);
		} finally {
			if (s != null)
				try {
					s.close();
				} catch (IOException e) {
				}
		}
		return res;
	}
	/**
	 * Servicio que permite Consultar las Transacciones Internas y Externas de un cliente.
	 * @param req
	 * @return
	 * @throws WSException   
	 */
	public TINQDSJVResponse TINQDSJV(TINQDSJVBean req) throws WSException{
		log.info("Invocando TINQDSJV");
		Socket s = null;
		TINQDSJVResponse res = new TINQDSJVResponse();
		try {
			Parametros params = new Parametros();
			MessageContext mc;
			s = new Socket(params.getString("ip"), params.getInt("port1"));
			s.setSoTimeout(params.getInt("timeout"));
			mc = new MessageContext(new DataInputStream(new BufferedInputStream(s.getInputStream())), new DataOutputStream(
					new BufferedOutputStream(s.getOutputStream())), "com.activo.gateway.dibs.messages");
			TINQDSJV2Message message;
			message = (TINQDSJV2Message) mc.getMessageRecord("TINQDSJV2");
			if(req.getTINUSR() != null && !"".equals(req.getTINUSR()))message.setTINUSR(req.getTINUSR());
			if(req.getTINDACC() != null && !"".equals(req.getTINDACC()))message.setTINDACC(req.getTINDACC());
			if(req.getTINTYP() != null && !"".equals(req.getTINTYP()))message.setTINTYP(req.getTINTYP());
			if(req.getTINRID() != null && !"".equals(req.getTINRID()))message.setTINRID(req.getTINRID());
			if(req.getTINRNM() != null && !"".equals(req.getTINRNM()))message.setTINRNM(req.getTINRNM());
			if(req.getTINSID() != null && !"".equals(req.getTINSID()))message.setTINSID(req.getTINSID());
			if(req.getTINSNM() != null && !"".equals(req.getTINSNM()))message.setTINSNM(req.getTINSNM());
			if(req.getTINATY() != null && !"".equals(req.getTINATY()))message.setTINATY(req.getTINATY());
			if(req.getTINDCY() != null && !"".equals(req.getTINDCY()))message.setTINDCY(req.getTINDCY());
			if(req.getTINREF() != null && !"".equals(req.getTINREF()))message.setTINREF(req.getTINREF());
			if(req.getTINIMD() != null && !"".equals(req.getTINIMD()))message.setTINIMD(req.getTINIMD());
			if(req.getTINOMD() != null && !"".equals(req.getTINOMD()))message.setTINOMD(req.getTINOMD());
			if(req.getTINID1() != null && !"".equals(req.getTINID1()))message.setTINID1(req.getTINID1());
			if(req.getTINID2() != null && !"".equals(req.getTINID2()))message.setTINID2(req.getTINID2());
			if(req.getTINID3() != null && !"".equals(req.getTINID3()))message.setTINID3(req.getTINID3());
			if(req.getTINVD1() != null && !"".equals(req.getTINVD1()))message.setTINVD1(req.getTINVD1());
			if(req.getTINVD2() != null && !"".equals(req.getTINVD2()))message.setTINVD2(req.getTINVD2());
			if(req.getTINVD3() != null && !"".equals(req.getTINVD3()))message.setTINVD3(req.getTINVD3());
			if(req.getTINRD1() != null && !"".equals(req.getTINRD1()))message.setTINRD1(req.getTINRD1());
			if(req.getTINRD2() != null && !"".equals(req.getTINRD2()))message.setTINRD2(req.getTINRD2());
			if(req.getTINRD3() != null && !"".equals(req.getTINRD3()))message.setTINRD3(req.getTINRD3());
			if(req.getTINTRM() != null && !"".equals(req.getTINTRM()))message.setTINTRM(req.getTINTRM());
			if(req.getTINAMT() != null && !"".equals(req.getTINAMT()))message.setTINAMT(req.getTINAMT());
			if(req.getTINCAM() != null && !"".equals(req.getTINCAM()))message.setTINCAM(req.getTINCAM());
			if(req.getTINCOA() != null && !"".equals(req.getTINCOA()))message.setTINCOA(req.getTINCOA());
			if(req.getTINCACC() != null && !"".equals(req.getTINCACC()))message.setTINCACC(req.getTINCACC());
			if(req.getTINCCY() != null && !"".equals(req.getTINCCY()))message.setTINCCY(req.getTINCCY());
			if(req.getTINNUM() != null && !"".equals(req.getTINNUM()))message.setTINNUM(req.getTINNUM());
			if(req.getTINOC1() != null && !"".equals(req.getTINOC1()))message.setTINOC1(req.getTINOC1());
			if(req.getTINOC2() != null && !"".equals(req.getTINOC2()))message.setTINOC2(req.getTINOC2());
			if(req.getTINOC3() != null && !"".equals(req.getTINOC3()))message.setTINOC3(req.getTINOC3());
			if(req.getTINOC4() != null && !"".equals(req.getTINOC4()))message.setTINOC4(req.getTINOC4());
			if(req.getTINOC5() != null && !"".equals(req.getTINOC5()))message.setTINOC5(req.getTINOC5());
			if(req.getTINOB1() != null && !"".equals(req.getTINOB1()))message.setTINOB1(req.getTINOB1());
			if(req.getTINOB2() != null && !"".equals(req.getTINOB2()))message.setTINOB2(req.getTINOB2());
			if(req.getTINOB3() != null && !"".equals(req.getTINOB3()))message.setTINOB3(req.getTINOB3());
			if(req.getTINOB4() != null && !"".equals(req.getTINOB4()))message.setTINOB4(req.getTINOB4());
			if(req.getTINOB5() != null && !"".equals(req.getTINOB5()))message.setTINOB5(req.getTINOB5());
			if(req.getTINBC1() != null && !"".equals(req.getTINBC1()))message.setTINBC1(req.getTINBC1());
			if(req.getTINBC2() != null && !"".equals(req.getTINBC2()))message.setTINBC2(req.getTINBC2());
			if(req.getTINBC3() != null && !"".equals(req.getTINBC3()))message.setTINBC3(req.getTINBC3());
			if(req.getTINBC4() != null && !"".equals(req.getTINBC4()))message.setTINBC4(req.getTINBC4());
			if(req.getTINBC5() != null && !"".equals(req.getTINBC5()))message.setTINBC5(req.getTINBC5());
			if(req.getTINBB1() != null && !"".equals(req.getTINBB1()))message.setTINBB1(req.getTINBB1());
			if(req.getTINBB2() != null && !"".equals(req.getTINBB2()))message.setTINBB2(req.getTINBB2());
			if(req.getTINBB3() != null && !"".equals(req.getTINBB3()))message.setTINBB3(req.getTINBB3());
			if(req.getTINBB4() != null && !"".equals(req.getTINBB4()))message.setTINBB4(req.getTINBB4());
			if(req.getTINBB5() != null && !"".equals(req.getTINBB5()))message.setTINBB5(req.getTINBB5());
			if(req.getTINBRF() != null && !"".equals(req.getTINBRF()))message.setTINBRF(req.getTINBRF());
			if(req.getTINIB1() != null && !"".equals(req.getTINIB1()))message.setTINIB1(req.getTINIB1());
			if(req.getTINIB2() != null && !"".equals(req.getTINIB2()))message.setTINIB2(req.getTINIB2());
			if(req.getTINIB3() != null && !"".equals(req.getTINIB3()))message.setTINIB3(req.getTINIB3());
			if(req.getTINIB4() != null && !"".equals(req.getTINIB4()))message.setTINIB4(req.getTINIB4());
			if(req.getTINIB5() != null && !"".equals(req.getTINIB5()))message.setTINIB5(req.getTINIB5());
			if(req.getTINOBI1() != null && !"".equals(req.getTINOBI1()))message.setTINOBI1(req.getTINOBI1());
			if(req.getTINOBI2() != null && !"".equals(req.getTINOBI2()))message.setTINOBI2(req.getTINOBI2());
			if(req.getTINOBI3() != null && !"".equals(req.getTINOBI3()))message.setTINOBI3(req.getTINOBI3());
			if(req.getTINOBI4() != null && !"".equals(req.getTINOBI4()))message.setTINOBI4(req.getTINOBI4());
			if(req.getTINBBI1() != null && !"".equals(req.getTINBBI1()))message.setTINBBI1(req.getTINBBI1());
			if(req.getTINBBI2() != null && !"".equals(req.getTINBBI2()))message.setTINBBI2(req.getTINBBI2());
			if(req.getTINBBI3() != null && !"".equals(req.getTINBBI3()))message.setTINBBI3(req.getTINBBI3());
			if(req.getTINBBI4() != null && !"".equals(req.getTINBBI4()))message.setTINBBI4(req.getTINBBI4());
			if(req.getTINCOI4() != null && !"".equals(req.getTINCOI4()))message.setTINCOI4(req.getTINCOI4());
			if(req.getTINCHB() != null && !"".equals(req.getTINCHB()))message.setTINCHB(req.getTINCHB());
			message.send();
			message.destroy();
			MessageRecord newmessage = mc.receiveMessage();
			if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("0"))) {
				manejarError(res, ((ELEERRMessage) newmessage));
				log.error("TINQDSJV - Consulta Transacciones: " + " Error: "+ res.getError().getERNU01() + " - " + res.getError().getERDS01() + " - Canal " + req.getCanal());
				return res;
			} else if (newmessage.getFormatName().equals("TINQDSJV2")) {
				List<TINQDSJVBean> x = new ArrayList<TINQDSJVBean>();
				boolean GoIn = !((TINQDSJV2Message)newmessage).getTINTYP().equals("9");
				while (GoIn) {
					TINQDSJVBean bean = new TINQDSJVBean();
					bean.setTINUSR(((TINQDSJV2Message) newmessage).getTINUSR());
					bean.setTINDACC(((TINQDSJV2Message) newmessage).getTINDACC());
					bean.setTINTYP(((TINQDSJV2Message) newmessage).getTINTYP());
					bean.setTINRID(((TINQDSJV2Message) newmessage).getTINRID());
					bean.setTINRNM(((TINQDSJV2Message) newmessage).getTINRNM());
					bean.setTINSID(((TINQDSJV2Message) newmessage).getTINSID());
					bean.setTINSNM(((TINQDSJV2Message) newmessage).getTINSNM());
					bean.setTINATY(((TINQDSJV2Message) newmessage).getTINATY());
					bean.setTINDCY(((TINQDSJV2Message) newmessage).getTINDCY());
					bean.setTINREF(((TINQDSJV2Message) newmessage).getTINREF());
					bean.setTINIMD(((TINQDSJV2Message) newmessage).getTINIMD());
					bean.setTINOMD(((TINQDSJV2Message) newmessage).getTINOMD());
					bean.setTINID1(((TINQDSJV2Message) newmessage).getTINID1());
					bean.setTINID2(((TINQDSJV2Message) newmessage).getTINID2());
					bean.setTINID3(((TINQDSJV2Message) newmessage).getTINID3());
					bean.setTINITM(((TINQDSJV2Message) newmessage).getTINITM());
					bean.setTINVD1(((TINQDSJV2Message) newmessage).getTINVD1());
					bean.setTINVD2(((TINQDSJV2Message) newmessage).getTINVD2());
					bean.setTINVD3(((TINQDSJV2Message) newmessage).getTINVD3());
					bean.setTINRD1(((TINQDSJV2Message) newmessage).getTINRD1());
					bean.setTINRD2(((TINQDSJV2Message) newmessage).getTINRD2());
					bean.setTINRD3(((TINQDSJV2Message) newmessage).getTINRD3());
					bean.setTINTRM(((TINQDSJV2Message) newmessage).getTINTRM());
					bean.setTINAMT(((TINQDSJV2Message) newmessage).getTINAMT());
					bean.setTINCOA(((TINQDSJV2Message) newmessage).getTINCOA());
					bean.setTINCACC(((TINQDSJV2Message) newmessage).getTINCACC());
					bean.setTINCCY(((TINQDSJV2Message) newmessage).getTINCCY());
					bean.setTINOC1(((TINQDSJV2Message) newmessage).getTINOC1());
					bean.setTINOC2(((TINQDSJV2Message) newmessage).getTINOC2());
					bean.setTINOC3(((TINQDSJV2Message) newmessage).getTINOC3());
					bean.setTINOC4(((TINQDSJV2Message) newmessage).getTINOC4());
					bean.setTINOC5(((TINQDSJV2Message) newmessage).getTINOC5());
					bean.setTINOB1(((TINQDSJV2Message) newmessage).getTINOB1());
					bean.setTINOB2(((TINQDSJV2Message) newmessage).getTINOB2());
					bean.setTINOB3(((TINQDSJV2Message) newmessage).getTINOB3());
					bean.setTINOB4(((TINQDSJV2Message) newmessage).getTINOB4());
					bean.setTINOB5(((TINQDSJV2Message) newmessage).getTINOB5());
					bean.setTINBC1(((TINQDSJV2Message) newmessage).getTINBC1());
					bean.setTINBC2(((TINQDSJV2Message) newmessage).getTINBC2());
					bean.setTINBC3(((TINQDSJV2Message) newmessage).getTINBC3());
					bean.setTINBC4(((TINQDSJV2Message) newmessage).getTINBC4());
					bean.setTINBC5(((TINQDSJV2Message) newmessage).getTINBC5());
					bean.setTINBB1(((TINQDSJV2Message) newmessage).getTINBB1());
					bean.setTINBB2(((TINQDSJV2Message) newmessage).getTINBB2());
					bean.setTINBB3(((TINQDSJV2Message) newmessage).getTINBB3());
					bean.setTINBB4(((TINQDSJV2Message) newmessage).getTINBB4());
					bean.setTINBB5(((TINQDSJV2Message) newmessage).getTINBB5());
					bean.setTINBRF(((TINQDSJV2Message) newmessage).getTINBRF());
					bean.setTINIB1(((TINQDSJV2Message) newmessage).getTINIB1());
					bean.setTINIB2(((TINQDSJV2Message) newmessage).getTINIB2());
					bean.setTINIB3(((TINQDSJV2Message) newmessage).getTINIB3());
					bean.setTINIB4(((TINQDSJV2Message) newmessage).getTINIB4());
					bean.setTINIB5(((TINQDSJV2Message) newmessage).getTINIB5());
					bean.setTINOBI1(((TINQDSJV2Message) newmessage).getTINOBI1());
					bean.setTINOBI2(((TINQDSJV2Message) newmessage).getTINOBI2());
					bean.setTINOBI3(((TINQDSJV2Message) newmessage).getTINOBI3());
					bean.setTINOBI4(((TINQDSJV2Message) newmessage).getTINOBI4());
					bean.setTINBBI1(((TINQDSJV2Message) newmessage).getTINBBI1());
					bean.setTINBBI2(((TINQDSJV2Message) newmessage).getTINBBI2());
					bean.setTINBBI3(((TINQDSJV2Message) newmessage).getTINBBI3());
					bean.setTINBBI4(((TINQDSJV2Message) newmessage).getTINBBI4());
					bean.setTINCOI4(((TINQDSJV2Message) newmessage).getTINCOI4());
					bean.setTINCHB(((TINQDSJV2Message) newmessage).getTINCHB());
					bean.setTINNUM(((TINQDSJV2Message) newmessage).getTINNUM());
					x.add(bean);
					newmessage = mc.receiveMessage();
					if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("0"))) {
						manejarError(res, ((ELEERRMessage) newmessage));
						return res;
					}
					GoIn = !((TINQDSJV2Message)newmessage).getTINTYP().equals("9");
				}
				res.setTINQDSJV(x.toArray(new TINQDSJVBean[0]));
			}
		} catch (Exception e) {
			log.error("TINQDSJV - Consulta transacciones - " + e.getMessage() + " - Canal " + req.getCanal(),e);
			throw new WSException(e);
		} finally {
			if (s != null)
				try {
					s.close();
				} catch (IOException e) {
				}
		}
		return res;
	}
	/**
	 * Servicio que permite Consultar el Detalle de una Trasnsacción Interna/Externa en particular.
	 * @param req
	 * @return
	 * @throws WSException
	 */
	public TINQDSJVResponse TINQDSJV2(TINQDSJVBean req) throws WSException{
		log.info("Invocando TINQDSJV2");
		Socket s = null;
		TINQDSJVResponse res = new TINQDSJVResponse();
		try {
			Parametros params = new Parametros();
			MessageContext mc;
			s = new Socket(params.getString("ip"), params.getInt("port1"));
			s.setSoTimeout(params.getInt("timeout"));
			mc = new MessageContext(new DataInputStream(new BufferedInputStream(s.getInputStream())), new DataOutputStream(
					new BufferedOutputStream(s.getOutputStream())), "com.activo.gateway.dibs.messages");
			TINQDSJV2Message message;
			message = (TINQDSJV2Message) mc.getMessageRecord("TINQDSJV2");
			if(req.getTINUSR() != null && !"".equals(req.getTINUSR()))message.setTINUSR(req.getTINUSR());
			if(req.getTINDACC() != null && !"".equals(req.getTINDACC()))message.setTINDACC(req.getTINDACC());
			if(req.getTINTYP() != null && !"".equals(req.getTINTYP()))message.setTINTYP(req.getTINTYP());
			if(req.getTINRID() != null && !"".equals(req.getTINRID()))message.setTINRID(req.getTINRID());
			if(req.getTINRNM() != null && !"".equals(req.getTINRNM()))message.setTINRNM(req.getTINRNM());
			if(req.getTINSID() != null && !"".equals(req.getTINSID()))message.setTINSID(req.getTINSID());
			if(req.getTINSNM() != null && !"".equals(req.getTINSNM()))message.setTINSNM(req.getTINSNM());
			if(req.getTINATY() != null && !"".equals(req.getTINATY()))message.setTINATY(req.getTINATY());
			if(req.getTINDCY() != null && !"".equals(req.getTINDCY()))message.setTINDCY(req.getTINDCY());
			if(req.getTINREF() != null && !"".equals(req.getTINREF()))message.setTINREF(req.getTINREF());
			if(req.getTINIMD() != null && !"".equals(req.getTINIMD()))message.setTINIMD(req.getTINIMD());
			if(req.getTINOMD() != null && !"".equals(req.getTINOMD()))message.setTINOMD(req.getTINOMD());
			if(req.getTINID1() != null && !"".equals(req.getTINID1()))message.setTINID1(req.getTINID1());
			if(req.getTINID2() != null && !"".equals(req.getTINID2()))message.setTINID2(req.getTINID2());
			if(req.getTINID3() != null && !"".equals(req.getTINID3()))message.setTINID3(req.getTINID3());
			if(req.getTINVD1() != null && !"".equals(req.getTINVD1()))message.setTINVD1(req.getTINVD1());
			if(req.getTINVD2() != null && !"".equals(req.getTINVD2()))message.setTINVD2(req.getTINVD2());
			if(req.getTINVD3() != null && !"".equals(req.getTINVD3()))message.setTINVD3(req.getTINVD3());
			if(req.getTINRD1() != null && !"".equals(req.getTINRD1()))message.setTINRD1(req.getTINRD1());
			if(req.getTINRD2() != null && !"".equals(req.getTINRD2()))message.setTINRD2(req.getTINRD2());
			if(req.getTINRD3() != null && !"".equals(req.getTINRD3()))message.setTINRD3(req.getTINRD3());
			if(req.getTINTRM() != null && !"".equals(req.getTINTRM()))message.setTINTRM(req.getTINTRM());
			if(req.getTINAMT() != null && !"".equals(req.getTINAMT()))message.setTINAMT(req.getTINAMT());
			if(req.getTINCAM() != null && !"".equals(req.getTINCAM()))message.setTINCAM(req.getTINCAM());
			if(req.getTINCOA() != null && !"".equals(req.getTINCOA()))message.setTINCOA(req.getTINCOA());
			if(req.getTINCACC() != null && !"".equals(req.getTINCACC()))message.setTINCACC(req.getTINCACC());
			if(req.getTINCCY() != null && !"".equals(req.getTINCCY()))message.setTINCCY(req.getTINCCY());
			if(req.getTINNUM() != null && !"".equals(req.getTINNUM()))message.setTINNUM(req.getTINNUM());
			if(req.getTINOC1() != null && !"".equals(req.getTINOC1()))message.setTINOC1(req.getTINOC1());
			if(req.getTINOC2() != null && !"".equals(req.getTINOC2()))message.setTINOC2(req.getTINOC2());
			if(req.getTINOC3() != null && !"".equals(req.getTINOC3()))message.setTINOC3(req.getTINOC3());
			if(req.getTINOC4() != null && !"".equals(req.getTINOC4()))message.setTINOC4(req.getTINOC4());
			if(req.getTINOC5() != null && !"".equals(req.getTINOC5()))message.setTINOC5(req.getTINOC5());
			if(req.getTINOB1() != null && !"".equals(req.getTINOB1()))message.setTINOB1(req.getTINOB1());
			if(req.getTINOB2() != null && !"".equals(req.getTINOB2()))message.setTINOB2(req.getTINOB2());
			if(req.getTINOB3() != null && !"".equals(req.getTINOB3()))message.setTINOB3(req.getTINOB3());
			if(req.getTINOB4() != null && !"".equals(req.getTINOB4()))message.setTINOB4(req.getTINOB4());
			if(req.getTINOB5() != null && !"".equals(req.getTINOB5()))message.setTINOB5(req.getTINOB5());
			if(req.getTINBC1() != null && !"".equals(req.getTINBC1()))message.setTINBC1(req.getTINBC1());
			if(req.getTINBC2() != null && !"".equals(req.getTINBC2()))message.setTINBC2(req.getTINBC2());
			if(req.getTINBC3() != null && !"".equals(req.getTINBC3()))message.setTINBC3(req.getTINBC3());
			if(req.getTINBC4() != null && !"".equals(req.getTINBC4()))message.setTINBC4(req.getTINBC4());
			if(req.getTINBC5() != null && !"".equals(req.getTINBC5()))message.setTINBC5(req.getTINBC5());
			if(req.getTINBB1() != null && !"".equals(req.getTINBB1()))message.setTINBB1(req.getTINBB1());
			if(req.getTINBB2() != null && !"".equals(req.getTINBB2()))message.setTINBB2(req.getTINBB2());
			if(req.getTINBB3() != null && !"".equals(req.getTINBB3()))message.setTINBB3(req.getTINBB3());
			if(req.getTINBB4() != null && !"".equals(req.getTINBB4()))message.setTINBB4(req.getTINBB4());
			if(req.getTINBB5() != null && !"".equals(req.getTINBB5()))message.setTINBB5(req.getTINBB5());
			if(req.getTINBRF() != null && !"".equals(req.getTINBRF()))message.setTINBRF(req.getTINBRF());
			if(req.getTINIB1() != null && !"".equals(req.getTINIB1()))message.setTINIB1(req.getTINIB1());
			if(req.getTINIB2() != null && !"".equals(req.getTINIB2()))message.setTINIB2(req.getTINIB2());
			if(req.getTINIB3() != null && !"".equals(req.getTINIB3()))message.setTINIB3(req.getTINIB3());
			if(req.getTINIB4() != null && !"".equals(req.getTINIB4()))message.setTINIB4(req.getTINIB4());
			if(req.getTINIB5() != null && !"".equals(req.getTINIB5()))message.setTINIB5(req.getTINIB5());
			if(req.getTINOBI1() != null && !"".equals(req.getTINOBI1()))message.setTINOBI1(req.getTINOBI1());
			if(req.getTINOBI2() != null && !"".equals(req.getTINOBI2()))message.setTINOBI2(req.getTINOBI2());
			if(req.getTINOBI3() != null && !"".equals(req.getTINOBI3()))message.setTINOBI3(req.getTINOBI3());
			if(req.getTINOBI4() != null && !"".equals(req.getTINOBI4()))message.setTINOBI4(req.getTINOBI4());
			if(req.getTINBBI1() != null && !"".equals(req.getTINBBI1()))message.setTINBBI1(req.getTINBBI1());
			if(req.getTINBBI2() != null && !"".equals(req.getTINBBI2()))message.setTINBBI2(req.getTINBBI2());
			if(req.getTINBBI3() != null && !"".equals(req.getTINBBI3()))message.setTINBBI3(req.getTINBBI3());
			if(req.getTINBBI4() != null && !"".equals(req.getTINBBI4()))message.setTINBBI4(req.getTINBBI4());
			if(req.getTINCOI4() != null && !"".equals(req.getTINCOI4()))message.setTINCOI4(req.getTINCOI4());
			if(req.getTINCHB() != null && !"".equals(req.getTINCHB()))message.setTINCHB(req.getTINCHB());
			message.send();
			message.destroy();
			MessageRecord newmessage = mc.receiveMessage();
			if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("0"))) {
				manejarError(res, ((ELEERRMessage) newmessage));
				log.error("TINQDSJV - Consulta Transacciones: " + " Error: "+ res.getError().getERNU01() + " - " + res.getError().getERDS01() + " - Canal " + req.getCanal());
				return res;
			}
			else{
				if(newmessage.getFormatName().equals("TINQDSJV2")){
					message = (TINQDSJV2Message)newmessage;
					res.setTINQDSJV2(new TINQDSJVBean());
					res.getTINQDSJV2().setTINUSR(message.getTINUSR());
					res.getTINQDSJV2().setTINDACC(message.getTINDACC());
					res.getTINQDSJV2().setTINTYP(message.getTINTYP());
					res.getTINQDSJV2().setTINRID(message.getTINRID());
					res.getTINQDSJV2().setTINRNM(message.getTINRNM());
					res.getTINQDSJV2().setTINSID(message.getTINSID());
					res.getTINQDSJV2().setTINSNM(message.getTINSNM());
					res.getTINQDSJV2().setTINATY(message.getTINATY());
					res.getTINQDSJV2().setTINDCY(message.getTINDCY());
					res.getTINQDSJV2().setTINREF(message.getTINREF());
					res.getTINQDSJV2().setTINIMD(message.getTINIMD());
					res.getTINQDSJV2().setTINOMD(message.getTINOMD());
					res.getTINQDSJV2().setTINID1(message.getTINID1());
					res.getTINQDSJV2().setTINID2(message.getTINID2());
					res.getTINQDSJV2().setTINID3(message.getTINID3());
					res.getTINQDSJV2().setTINITM(message.getTINITM());
					res.getTINQDSJV2().setTINVD1(message.getTINVD1());
					res.getTINQDSJV2().setTINVD2(message.getTINVD2());
					res.getTINQDSJV2().setTINVD3(message.getTINVD3());
					res.getTINQDSJV2().setTINRD1(message.getTINRD1());
					res.getTINQDSJV2().setTINRD2(message.getTINRD2());
					res.getTINQDSJV2().setTINRD3(message.getTINRD3());
					res.getTINQDSJV2().setTINTRM(message.getTINTRM());
					res.getTINQDSJV2().setTINAMT(message.getTINAMT());
					res.getTINQDSJV2().setTINCAM(message.getTINCAM());
					res.getTINQDSJV2().setTINCOA(message.getTINCOA());
					res.getTINQDSJV2().setTINCACC(message.getTINCACC());
					res.getTINQDSJV2().setTINCCY(message.getTINCCY());
					res.getTINQDSJV2().setTINNUM(message.getTINNUM());
					res.getTINQDSJV2().setTINOC1(message.getTINOC1());
					res.getTINQDSJV2().setTINOC2(message.getTINOC2());
					res.getTINQDSJV2().setTINOC3(message.getTINOC3());
					res.getTINQDSJV2().setTINOC4(message.getTINOC4());
					res.getTINQDSJV2().setTINOC5(message.getTINOC5());
					res.getTINQDSJV2().setTINOB1(message.getTINOB1());
					res.getTINQDSJV2().setTINOB2(message.getTINOB2());
					res.getTINQDSJV2().setTINOB3(message.getTINOB3());
					res.getTINQDSJV2().setTINOB4(message.getTINOB4());
					res.getTINQDSJV2().setTINOB5(message.getTINOB5());
					res.getTINQDSJV2().setTINBC1(message.getTINBC1());
					res.getTINQDSJV2().setTINBC2(message.getTINBC2());
					res.getTINQDSJV2().setTINBC3(message.getTINBC3());
					res.getTINQDSJV2().setTINBC4(message.getTINBC4());
					res.getTINQDSJV2().setTINBC5(message.getTINBC5());
					res.getTINQDSJV2().setTINBB1(message.getTINBB1());
					res.getTINQDSJV2().setTINBB2(message.getTINBB2());
					res.getTINQDSJV2().setTINBB3(message.getTINBB3());
					res.getTINQDSJV2().setTINBB4(message.getTINBB4());
					res.getTINQDSJV2().setTINBB5(message.getTINBB5());
					res.getTINQDSJV2().setTINBRF(message.getTINBRF());
					res.getTINQDSJV2().setTINIB1(message.getTINIB1());
					res.getTINQDSJV2().setTINIB2(message.getTINIB2());
					res.getTINQDSJV2().setTINIB3(message.getTINIB3());
					res.getTINQDSJV2().setTINIB4(message.getTINIB4());
					res.getTINQDSJV2().setTINIB5(message.getTINIB5());
					res.getTINQDSJV2().setTINOBI1(message.getTINOBI1());
					res.getTINQDSJV2().setTINOBI2(message.getTINOBI2());
					res.getTINQDSJV2().setTINOBI3(message.getTINOBI3());
					res.getTINQDSJV2().setTINOBI4(message.getTINOBI4());
					res.getTINQDSJV2().setTINBBI1(message.getTINBBI1());
					res.getTINQDSJV2().setTINBBI2(message.getTINBBI2());
					res.getTINQDSJV2().setTINBBI3(message.getTINBBI3());
					res.getTINQDSJV2().setTINBBI4(message.getTINBBI4());
					res.getTINQDSJV2().setTINCOI4(message.getTINCOI4());
					res.getTINQDSJV2().setTINCHB(message.getTINCHB());
				}
			}
		} catch (Exception e) {
			log.error("TINQDSJV - Consulta transaccion - " + e.getMessage() + " - Canal " + req.getCanal(),e);
			throw new WSException(e);
		} finally {
			if (s != null)
				try {
					s.close();
				} catch (IOException e) {
				}
		}
		return res;
	}
	/**
	 * Servicio para Listar TDC Propias para realizar el Pago.
	 * @param req
	 * @return
	 * @throws WSException
	 */
	public IN098101Response IN098101(IN098101Bean req) throws WSException{
		log.info("Invocando IN098101");
		Socket s = null;
		IN098101Response res = new IN098101Response();
		try {
			Parametros params = new Parametros();
			MessageContext mc;
			IN098101Message statementBasic;
			List<IN098101Bean> x = new ArrayList<IN098101Bean>();
			s = new Socket(params.getString("ip"), params.getInt("port1")+1);
			s.setSoTimeout(params.getInt("timeout"));
			mc = new MessageContext(new DataInputStream(new BufferedInputStream(s.getInputStream())), new DataOutputStream(
					new BufferedOutputStream(s.getOutputStream())), "com.activo.gateway.dibs.messages");
			IN098101Message message = (IN098101Message) mc.getMessageRecord("IN098101");
			if(req.getIN981USR() != null && !"".equals(req.getIN981USR()))message.setIN981USR(req.getIN981USR());
			if(req.getIN981CRNUM() != null && !"".equals(req.getIN981CRNUM()))message.setIN981CRNUM(req.getIN981CRNUM());
			if(req.getIN981CCY() != null && !"".equals(req.getIN981CCY()))message.setIN981CCY(req.getIN981CCY());
			if(req.getIN981CRELI() != null && !"".equals(req.getIN981CRELI()))message.setIN981CRELI(req.getIN981CRELI());
			if(req.getIN981BALNC() != null && !"".equals(req.getIN981BALNC()))message.setIN981BALNC(req.getIN981BALNC());
			if(req.getIN981AVAIL() != null && !"".equals(req.getIN981AVAIL()))message.setIN981AVAIL(req.getIN981AVAIL());
			if(req.getIN981PAYOF() != null && !"".equals(req.getIN981PAYOF()))message.setIN981PAYOF(req.getIN981PAYOF());
			if(req.getIN981MINPY() != null && !"".equals(req.getIN981MINPY()))message.setIN981MINPY(req.getIN981MINPY());
			if(req.getIN981DTE1() != null && !"".equals(req.getIN981DTE1()))message.setIN981DTE1(req.getIN981DTE1());
			if(req.getIN981DTE2() != null && !"".equals(req.getIN981DTE2()))message.setIN981DTE2(req.getIN981DTE2());
			if(req.getIN981DTE3() != null && !"".equals(req.getIN981DTE3()))message.setIN981DTE3(req.getIN981DTE3());
			if(req.getIN981NICKN() != null && !"".equals(req.getIN981NICKN()))message.setIN981NICKN(req.getIN981NICKN());
			if(req.getIN981ENDFL() != null && !"".equals(req.getIN981ENDFL()))message.setIN981ENDFL(req.getIN981ENDFL());
			message.send();
			message.destroy();
			MessageRecord newmessage = mc.receiveMessage();
			if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("0"))) {
				manejarError(res, ((ELEERRMessage) newmessage));
				log.error("IN098101 - Detalle TDC Propias/Terceros: " + " Error: "+ res.getError().getERNU01() + " - " + res.getError().getERDS01() + " - Canal " + req.getCanal());
				return res;
			} else {							
				
				if (newmessage.getFormatName().equals("IN098101")) {
					statementBasic = (IN098101Message) newmessage;
					boolean Go = !message.getIN981ENDFL().equals("*");
					while (Go) {
						IN098101Bean bean = new IN098101Bean();						
						
						float totalPagoM = 0;
						float pagos = 0;
						//Llamada al servicio CCARDTRJV para cálculo de saldos pendientes por ejecutar
						try {
							CCARDTRJVBean reqCCAR = new CCARDTRJVBean();
							reqCCAR.setCCATRNUM(statementBasic.getIN981CRNUM());
							reqCCAR.setCCATROPC("TR");
							CCARDTRJVResponse resCCAR =  this.CCARDTRJV(reqCCAR);
							if(resCCAR.getError() == null){
								if(resCCAR.getCCARDTRJV().length > 0){
									for (CCARDTRJVBean cc : resCCAR.getCCARDTRJV()) {
										if("X".equals(cc.getH01FLGWK3())){															
											pagos += Float.parseFloat(cc.getCCATRAMCR());
										}
									}
								}else{
									bean.setIN981MINPY(statementBasic.getIN981MINPY());									
								}
								if(resCCAR.getError()!=null){
									res.setError(resCCAR.getError());
									return res;
								}
								//Total de restar el pago mínimo - abonos realizados
								totalPagoM = Math.max(0,Float.parseFloat(statementBasic.getIN981MINPY()) - pagos);
								bean.setIN981MINPY(Float.toString(totalPagoM));								
							}else{
								bean.setIN981MINPY(statementBasic.getIN981MINPY());								
							}
						}catch(Exception e){
							log.error("CCARDTRJV - Saldo TDC - " + e.getMessage() + " - Canal " + req.getCanal(),e);
						}
						
						bean.setIN981USR(statementBasic.getIN981USR());
						bean.setIN981CRNUM(statementBasic.getIN981CRNUM());
						bean.setIN981CCY(statementBasic.getIN981CCY());
						bean.setIN981CRELI(statementBasic.getIN981CRELI());
						bean.setIN981BALNC(statementBasic.getIN981BALNC());
						bean.setIN981AVAIL(statementBasic.getIN981AVAIL());
						bean.setIN981PAYOF(statementBasic.getIN981PAYOF());						
						bean.setIN981DTE1(statementBasic.getIN981DTE1());
						bean.setIN981DTE2(statementBasic.getIN981DTE2());
						bean.setIN981DTE3(statementBasic.getIN981DTE3());
						bean.setIN981NICKN(statementBasic.getIN981NICKN());
						bean.setIN981ENDFL(statementBasic.getIN981ENDFL());
						bean.setIN981USR(statementBasic.getIN981USR());
						x.add(bean);    
						newmessage = mc.receiveMessage();	
						statementBasic = (IN098101Message) newmessage;
						Go = !statementBasic.getIN981ENDFL().equals("*");
					}
					res.setIN098101(x.toArray(new IN098101Bean[0]));
				}
			}
		} catch (Exception e) {
			log.error("IN098101 - Detalle TDC Propias/Terceros - " + e.getMessage() + " - Canal " + req.getCanal(),e);
			throw new WSException(e);
		} finally {
			if (s != null)
				try {
					s.close();
				} catch (IOException e) {
				}
		}
		return res;
	}
	/**
	 * Servicio para el Pago de TDC Propias/Terceros.
	 * @param req
	 * @return
	 * @throws WSException
	 */
	public IN098102Response IN098102(IN098102Bean req) throws WSException{
		log.info("Invocando IN098102");
		Socket s = null;
		boolean GoIn = false;
		IN098102Response res = new IN098102Response();
		try {
                    if (req.getCanal().equals("4")) req.setCanal("0"+req.getCanal());
			Parametros params = new Parametros();
			MessageContext mc;
			List<IMSSGDSJVBean> x = new ArrayList<IMSSGDSJVBean>();
			s = new Socket(params.getString("ip"), params.getInt("port1")+1);
			s.setSoTimeout(params.getInt("timeout"));
			mc = new MessageContext(new DataInputStream(new BufferedInputStream(s.getInputStream())), new DataOutputStream(
					new BufferedOutputStream(s.getOutputStream())), "com.activo.gateway.dibs.messages");
			IN098102LMessage message = (IN098102LMessage) mc.getMessageRecord("IN098102L");
			if(req.getIN982USR() != null && !"".equals(req.getIN982USR()))message.setIN982USRL(req.getIN982USR());
			if(req.getIN982CRNUM() != null && !"".equals(req.getIN982CRNUM()))message.setIN982CRNUL(req.getIN982CRNUM());
			if(req.getIN982DEBAC() != null && !"".equals(req.getIN982DEBAC()))message.setIN982DEBAL(req.getIN982DEBAC());
			if(req.getIN982PAYAM() != null && !"".equals(req.getIN982PAYAM()))message.setIN982PAYAL(req.getIN982PAYAM());
			if(req.getIN982CCY() != null && !"".equals(req.getIN982CCY()))message.setIN982CCYL(req.getIN982CCY());
			if(req.getIN982DTE1() != null && !"".equals(req.getIN982DTE1()))message.setIN982DTE1L(req.getIN982DTE1());
			if(req.getIN982DTE2() != null && !"".equals(req.getIN982DTE2()))message.setIN982DTE2L(req.getIN982DTE2());
			if(req.getIN982DTE3() != null && !"".equals(req.getIN982DTE3()))message.setIN982DTE3L(req.getIN982DTE3());
			if(req.getIN982ENDFL() != null && !"".equals(req.getIN982ENDFL()))message.setIN982ENDF5(req.getIN982ENDFL());
                        if(req.getIN982IPACT() != null && !"".equals(req.getIN982IPACT()))message.setIN982IPACT(req.getIN982IPACT());
                        if(req.getCanal() != null && !"".equals(req.getCanal()))message.setIN982CANAL(req.getCanal());
                        
			message.send();
			message.destroy();
			MessageRecord newmessage = mc.receiveMessage();
			if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("0"))) {
				manejarError(res, ((ELEERRMessage) newmessage));
				
				if(!(res.getError().getERNU01().trim().equals(""))){
					log.error("IN098102 - Pago TDC Propias/Terceros: " + " Error: "+ res.getError().getERNU01() + " - " + res.getError().getERDS01() + " - Canal " + req.getCanal());
					return res;
				}
				
				String mensaje; 
				//si es una pago de tdc a terceros en activo se envia mensaje de texto
				if("t".equals(req.getOperacion())){
					mensaje = "16";
				}else{
					mensaje = "15";
				}
				//se llama al servicio de envio de mensajes de texto
				ENVIASMS(req.getCanal(), mensaje, req.getIN982PAYAM(), req.getIN982DEBAC(), res.getError().getERDF01().trim(), null, null, null);
			} 
			
		} catch (Exception e) {
			log.error("IN098102 - Pago TDC Propias/Terceros - " + e.getMessage() + " - Canal " + req.getCanal(),e);
			throw new WSException(e);
		} finally {
			if (s != null)
				try {
					s.close();
				} catch (IOException e) {
				}
		}
		return res;
	}
	/**
	 * Servicio para el Pago de TDC Propias/Terceros.
	 * @param req
	 * @return
	 * @throws WSException
	 */
	public IN098102Response IN098102MOVIL(IN098102Bean req) throws WSException{
		log.info("Invocando IN098102MOVIL");
		Socket s = null;
		boolean GoIn = false;
		IN098102Response res = new IN098102Response();
                res.setError(new ELEERR());
		res.getError().setERRNUM("0");
		res.getError().setERNU01("0");
		
		//si el numCanal es 4
		String canalCompleto = "Activo en Línea";
		if("1".equals(req.getCanal())){
			canalCompleto = "Atencion Activa";
		}else if("3".equals(req.getCanal())){
			canalCompleto = "Agencia";
		}else if("2".equals(req.getCanal())){
			canalCompleto = "Movil Banking";
		}
		try {
			Parametros params = new Parametros();
			MessageContext mc;
			List<IMSSGDSJVBean> x = new ArrayList<IMSSGDSJVBean>();
			s = new Socket(params.getString("ip"), params.getInt("port1")+1);
			s.setSoTimeout(params.getInt("timeout"));
			mc = new MessageContext(new DataInputStream(new BufferedInputStream(s.getInputStream())), new DataOutputStream(
					new BufferedOutputStream(s.getOutputStream())), "com.activo.gateway.dibs.messages");
			IN098102Message message = (IN098102Message) mc.getMessageRecord("IN098102");
			if(req.getIN982USR() != null && !"".equals(req.getIN982USR()))message.setIN982USR(req.getIN982USR());
			if(req.getIN982CRNUM() != null && !"".equals(req.getIN982CRNUM()))message.setIN982CRNUM(req.getIN982CRNUM());
			if(req.getIN982DEBAC() != null && !"".equals(req.getIN982DEBAC()))message.setIN982DEBAC(req.getIN982DEBAC());
			if(req.getIN982PAYAM() != null && !"".equals(req.getIN982PAYAM()))message.setIN982PAYAM(req.getIN982PAYAM());
			if(req.getIN982CCY() != null && !"".equals(req.getIN982CCY()))message.setIN982CCY(req.getIN982CCY());
			if(req.getIN982DTE1() != null && !"".equals(req.getIN982DTE1()))message.setIN982DTE1(req.getIN982DTE1());
			if(req.getIN982DTE2() != null && !"".equals(req.getIN982DTE2()))message.setIN982DTE2(req.getIN982DTE2());
			if(req.getIN982DTE3() != null && !"".equals(req.getIN982DTE3()))message.setIN982DTE3(req.getIN982DTE3());
			if(req.getIN982ENDFL() != null && !"".equals(req.getIN982ENDFL()))message.setIN982ENDFL(req.getIN982ENDFL());			
                        
                        log.error("IN098102MOVIL - canal: " + req.getCanal());
			//verificar acumulados
			Database db = new Database();
			Parametros p = new Parametros();
			LimitesGenerales[] limitesGeneralNatural =null;
			String   tipoRIF = null;
			double acumulado =0, limiteInternasGeneral = 0;
			double monto_maximo= 0, montoAcu = 0;
			boolean usuario = false;
			Afiliaciones[] acumuladoInterna= null;
			Util u = new Util();
			EmailSender envioemail = new EmailSender();
			if(db.conectar()){
				//Verifico si es un usuario juridico
				tipoRIF = db.buscarTipoRIF(req.getId_usuario(), req.getCanal());
				//Consulto límites del usuario en la base de datos
				limitesGeneralNatural = db.buscarLimitesGeneral(req.getCanal(), req.getId_usuario());
				if("".equals(tipoRIF)){
					if(limitesGeneralNatural[0].getLimiteInternasGeneralNatural() != 0){
						limiteInternasGeneral = limitesGeneralNatural[0].getLimiteInternasGeneralNatural();
					}
				}else{
					if(limitesGeneralNatural[0].getLimiteInternasGeneralJuridico() != 0){
						limiteInternasGeneral = limitesGeneralNatural[0].getLimiteInternasGeneralJuridico();
					}
				}
				
				if(!"p".equals(req.getOperacion())){
					if(limiteInternasGeneral != 0){
						if(Double.parseDouble(req.getIN982PAYAM()) > limiteInternasGeneral){
							res.getError().setERRNUM("1");
							res.getError().setERNU01("1");
							res.getError().setERDS01("El monto de la transacción no puede ser mayor al límite definido");
							log.error(res.getError().getERDS01());
							return res;
						}else{
							//Consulto el monto maximo
							monto_maximo = db.buscarMontoMaximoAfiliacion(req.getId_usuario(),req.getCanal(), req.getIN982CRNUM());
							if(!"".equals(monto_maximo)){
								if(Double.parseDouble(req.getIN982PAYAM()) > (monto_maximo)){
									res.getError().setERRNUM("1");
									res.getError().setERNU01("2");
									res.getError().setERDS01("El monto de la transacción no puede ser mayor al monto máximo de la afiliación");
									log.error(res.getError().getERDS01());
									return res;
								}else{
									//Consulto los acumulados
									acumuladoInterna = db.buscarAcumulados(req.getId_usuario(), req.getCanal());
									if(acumuladoInterna.length != 0){
										acumulado = Double.parseDouble(acumuladoInterna[0].getAcumulado_internas_terceros());
										montoAcu = (Double.parseDouble(req.getIN982PAYAM()) + acumulado);
										
										if(montoAcu > limiteInternasGeneral){
											res.getError().setERRNUM("1");
											res.getError().setERNU01("3");
											res.getError().setERDS01("El monto de la transacción supera el límite acumulado");
											log.error(res.getError().getERDS01());
											return res;
										}
										
									}else{
										acumulado = 0;
										montoAcu = (Double.parseDouble(req.getIN982PAYAM()) + acumulado);
									}
								}
							}
						}
					}else{				
							
						//Consulto el monto maximo
						monto_maximo = db.buscarMontoMaximoAfiliacion(req.getId_usuario(),req.getCanal(), req.getIN982CRNUM());
						if(monto_maximo > 0){
							if(Double.parseDouble(req.getIN982PAYAM()) > (monto_maximo)){
								res.getError().setERRNUM("1");
								res.getError().setERNU01("2");
								res.getError().setERDS01("El monto de la transacción no puede ser mayor al monto máximo de la afiliación");
								log.error(res.getError().getERDS01());
								return res;
							}
						}
						
						acumuladoInterna = db.buscarAcumulados(req.getId_usuario(), req.getCanal());
						
						if(acumuladoInterna.length != 0){
							acumulado = Double.parseDouble(acumuladoInterna[0].getAcumulado_internas_terceros());
							montoAcu = (Double.parseDouble(req.getIN982PAYAM()) + acumulado);
							
						}else{							
							acumulado = 0;						
							montoAcu = (Double.parseDouble(req.getIN982PAYAM()) + acumulado);							
						}										
					}
				}
				
			}//fin llamada base de datos	
			message.send();
			message.destroy();
			MessageRecord newmessage = mc.receiveMessage();
			if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("0"))) {
				manejarError(res, ((ELEERRMessage) newmessage));
				
				if(!(res.getError().getERNU01().trim().equals(""))){
					log.error("IN098102MOVIL - Pago TDC Propias/Terceros: " + " Error: "+ res.getError().getERNU01() + " - " + res.getError().getERDS01() + " - Canal " + req.getCanal());
					return res;
				} 
				
				String ordenante = null, footer = null,emailPrincipalUsuario= null, beneficiario = null;
				String nombreUsuario ="";
				if(db.conectar()){
					Calendar xxx = Calendar.getInstance();
					if(!"p".equals(req.getOperacion())){
						usuario = db.actualizaAcumulado(req.getId_usuario(), montoAcu, 2,xxx);
					}
					//buscamos el cuerpo del mensaje
					ordenante = db.buscarMensajeCorreo("email_pagostdc_ordenante");
					beneficiario = db.buscarMensajeCorreo("email_pagostdc_beneficiario");
					//buscamos el footer del correo
					footer = db.buscarFooterCorreos("footer_correos");
					emailPrincipalUsuario = db.buscarEmailUsuario(req.getId_usuario());
					NIBPF3010Bean req3010 = new NIBPF3010Bean();
					req3010.setNROCUENTA(StringUtils.leftPad(req.getIN982DEBAC(),12,'0'));
					req3010.setNROPARAM("2");
					NIBPF3010Response resNibpf3010 = null;
					resNibpf3010 = NIBPF3010(req3010);
					nombreUsuario = resNibpf3010.getNIBPF3010().getINTLNADB();
					if(resNibpf3010.getError()!=null){
						res.setError(resNibpf3010.getError());
						return res;
					}
				}
				boolean envioCorreoOrdenante = false, envioCorreoBeneficiario = false; 
				if(ordenante != null && beneficiario != null){
					SimpleDateFormat formateador = new SimpleDateFormat("dd'/'MM'/'yy HH:mm:ss", new Locale("ES"));
					Calendar fechaDate = Calendar.getInstance();
					String fecha = formateador.format(fechaDate.getTime());
					DecimalFormat formatear = new DecimalFormat("#0.00");	
					String montoT = null;
					montoT =  formatear.format(Double.parseDouble(req.getIN982PAYAM().trim()));
					String cuentaOrigen = req.getIN982DEBAC().trim();
					//cuentaOrigen = u.completaCuenta(cuentaOrigen);
					cuentaOrigen = StringUtils.leftPad(u.completaCuenta(cuentaOrigen), 20, '0');
					String subject = "Notificación Pago Tarjeta de Crédito";
					String mensajeOrdenante = String.format(ordenante,nombreUsuario.trim(), 
										canalCompleto,
										req.getDescTipoTransaccion().trim(), 
										req.getDescTipoOperacion().trim(), 
										u.enmascaraCuenta(cuentaOrigen),
										u.enmascaraTDC(req.getIN982CRNUM()).trim(),
										p.getString("bancoEmail"), 
										req.getNombreBeneficiario().trim(),
										montoT,fecha, "PAGO TDC "+ u.enmascaraTDC(req.getIN982CRNUM()),
										res.getError().getERDF01().trim());
					String mensajeBeneficiario = String.format(beneficiario,req.getNombreBeneficiario().trim(), nombreUsuario.trim(), u.enmascaraTDC(req.getIN982CRNUM()), p.getString("bancoEmail"),
							montoT, "PAGO TDC " + u.enmascaraTDC(req.getIN982CRNUM()));
					if("t".equals(req.getOperacion())){
						envioCorreoOrdenante = envioemail.sendMail(emailPrincipalUsuario, subject, mensajeOrdenante,footer);
						envioCorreoBeneficiario = envioemail.sendMail(req.getEmailBeneficiario(), subject, mensajeBeneficiario, footer);
						if(!envioCorreoOrdenante){
							res.getError().setERRNUM("1");
							res.getError().setERNU01("-1");
							res.getError().setERDS01("Error, no se pudo enviar el correo electronico Ordenante");
							log.error("Error, no se pudo enviar el correo electronico Ordenante - Canal: " + req.getCanal());
						}
						if(!envioCorreoBeneficiario){
							res.getError().setERRNUM("1");
							res.getError().setERNU01("-1");
							res.getError().setERDS01("Error, no se pudo enviar el correo electronico Beneficiario");
							log.error("Error, no se pudo enviar el correo electronico Beneficiario - Canal: " + req.getCanal());
						}
					}
				}else {
					res.getError().setERRNUM("1");
					res.getError().setERNU01("-1");
					res.getError().setERDS01("Error al armar el correo electronico");
					log.error("Correo no enviado, no se encontro cuerpo del mensaje - Canal: " + req.getCanal());
				}
				
				String mensaje; 
				//si es una pago de tdc a terceros en activo se envia mensaje de texto
				if("t".equals(req.getOperacion())){
					mensaje = "16";
				}else{
					mensaje = "15";
				}
				//se llama al servicio de envio de mensajes de texto
				ENVIASMS(req.getCanal(), mensaje, req.getIN982PAYAM(), req.getIN982DEBAC(), res.getError().getERDF01().trim(), null, null, null);
				
			}
		} catch (Exception e) {
			log.error("IN098102 - Pago TDC Propias/Terceros - " + e.getMessage() + " - Canal " + req.getCanal(),e);
			throw new WSException(e);
		} finally {
			if (s != null)
				try {
					s.close();
				} catch (IOException e) {
				}
		}
		return res;
	}
	/**
	 * Servicio para asignar y modicficar el alias de los productos.
	 * @param req
	 * @return
	 * @throws WSException
	 */
	public NIKDSJVResponse NIKDSJV(NIKDSJVBean req) throws WSException {
		log.info("Invocando NIKDSJV");
		Socket s = null;
		NIKDSJVResponse res = new NIKDSJVResponse();
		try {
			Parametros params = new Parametros();
			MessageContext mc;
			s = new Socket(params.getString("ip"), params.getInt("port1"));
			s.setSoTimeout(params.getInt("timeout"));
			mc = new MessageContext(new DataInputStream(new BufferedInputStream(s.getInputStream())), new DataOutputStream(
					new BufferedOutputStream(s.getOutputStream())), "com.activo.gateway.dibs.messages");
			NIKDSJVMessage message = (NIKDSJVMessage) mc.getMessageRecord("NIKDSJV");
			if(req.getNIKUSR() != null && !"".equals(req.getNIKUSR()))message.setNIKUSR(req.getNIKUSR());
			if(req.getNIKDSC() != null && !"".equals(req.getNIKDSC()))message.setNIKDSC(req.getNIKDSC());
			if(req.getNIKACC() != null && !"".equals(req.getNIKACC()))message.setNIKACC(req.getNIKACC());
			if(req.getNIKCCN() != null && !"".equals(req.getNIKCCN()))message.setNIKCCN(req.getNIKCCN());
			if(req.getNIKNNM() != null && !"".equals(req.getNIKNNM()))message.setNIKNNM(req.getNIKNNM());
			if(req.getNIKTYP() != null && !"".equals(req.getNIKTYP()))message.setNIKTYP(req.getNIKTYP());
			message.send();
			message.destroy();
			MessageRecord newmessage = mc.receiveMessage();
			if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("0"))) {
				manejarError(res, ((ELEERRMessage) newmessage));
				log.error("NIKDSJV - Asignacion de Alias: " + " Error: "+ res.getError().getERNU01() + " - " + res.getError().getERDS01() + " - Canal " + req.getCanal());
				return res;
			}
			NIKDSJVMessage newmessage2 = (NIKDSJVMessage) newmessage;
			res.setNIKDSJV(new NIKDSJVBean());
			res.getNIKDSJV().setNIKUSR(newmessage2.getNIKUSR());
			res.getNIKDSJV().setNIKDSC(newmessage2.getNIKDSC());
			res.getNIKDSJV().setNIKACC(newmessage2.getNIKACC());
			res.getNIKDSJV().setNIKCCN(newmessage2.getNIKCCN());
			res.getNIKDSJV().setNIKNNM(newmessage2.getNIKNNM());
			res.getNIKDSJV().setNIKTYP(newmessage2.getNIKTYP());
		} catch (Exception e) {
			log.error("NIKDSJV - Asignacion de alias - " + e.getMessage() + " - Canal " + req.getCanal(),e);
			throw new WSException(e);
		} finally {
			if (s != null)
				try {
					s.close();
				} catch (IOException e) {
				}
		}
		return res;
	}
	/**
	 * Servicio que permite mostrar el Listado de Bancos.
	 * @param req
	 * @return
	 * @throws WSException
	 */
	public BNKSRDSJVResponse BNKSRDSJV(BNKSRDSJVBean req) throws WSException{
		log.info("Invocando BNKSRDSJV");
		Socket s = null;
		BNKSRDSJVResponse res = new BNKSRDSJVResponse();
		try {
			Parametros params = new Parametros();
			MessageContext mc;
			List<BNKSRDSJVBean> x = new ArrayList<BNKSRDSJVBean>();
			s = new Socket(params.getString("ip"), params.getInt("port1"));
			s.setSoTimeout(params.getInt("timeout"));
			mc = new MessageContext(new DataInputStream(new BufferedInputStream(s.getInputStream())), new DataOutputStream(
					new BufferedOutputStream(s.getOutputStream())), "com.activo.gateway.dibs.messages");
			BNKSRDSJVMessage message = (BNKSRDSJVMessage) mc.getMessageRecord("BNKSRDSJV");
			if(req.getBNKUSR() != null && !"".equals(req.getBNKUSR()))message.setBNKUSR(req.getBNKUSR());
			if(req.getBNKPVI() != null && !"".equals(req.getBNKPVI()))message.setBNKPVI(req.getBNKPVI());
			if(req.getBNKFRC() != null && !"".equals(req.getBNKFRC()))message.setBNKFRC(req.getBNKFRC());
			if(req.getBNKID() != null && !"".equals(req.getBNKID()))message.setBNKID(req.getBNKID());
			if(req.getBNKNME() != null && !"".equals(req.getBNKNME()))message.setBNKNME(req.getBNKNME());
			if(req.getBNKAD1() != null && !"".equals(req.getBNKAD1()))message.setBNKAD1(req.getBNKAD1());
			if(req.getBNKCTY() != null && !"".equals(req.getBNKCTY()))message.setBNKCTY(req.getBNKCTY());
			if(req.getBNKSTA() != null && !"".equals(req.getBNKSTA()))message.setBNKSTA(req.getBNKSTA());
			if(req.getBNKCTR() != null && !"".equals(req.getBNKCTR()))message.setBNKCTR(req.getBNKCTR());
			if(req.getBNKBRN() != null && !"".equals(req.getBNKBRN()))message.setBNKBRN(req.getBNKBRN());
			if(req.getBNKIN1() != null && !"".equals(req.getBNKIN1()))message.setBNKIN1(req.getBNKIN1());
			if(req.getBNKIN2() != null && !"".equals(req.getBNKIN2()))message.setBNKIN2(req.getBNKIN2());
			if(req.getBNKIN3() != null && !"".equals(req.getBNKIN3()))message.setBNKIN3(req.getBNKIN3());
			if(req.getBNKIN4() != null && !"".equals(req.getBNKIN4()))message.setBNKIN4(req.getBNKIN4());
			if(req.getBNKIN5() != null && !"".equals(req.getBNKIN5()))message.setBNKIN5(req.getBNKIN5());
			if(req.getBNKIN6() != null && !"".equals(req.getBNKIN6()))message.setBNKIN6(req.getBNKIN6());
			if(req.getBNKREC() != null && !"".equals(req.getBNKREC()))message.setBNKREC(req.getBNKREC());
			if(req.getBNKRUD() != null && !"".equals(req.getBNKRUD()))message.setBNKRUD(req.getBNKRUD());
			message.send();
			message.destroy();
			MessageRecord newmessage = mc.receiveMessage();
			if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("0"))) {
				manejarError(res, ((ELEERRMessage) newmessage));
				log.error("BNKSRDSJV - Listado de Bancos: " + " Error: "+ res.getError().getERNU01() + " - " + res.getError().getERDS01() + " - Canal " + req.getCanal());
				return res;
			} else if (newmessage.getFormatName().equals("BNKSRDSJV")) {
				boolean GoIn = ((BNKSRDSJVMessage)newmessage).getBNKRUD().equals("*");
				while (!GoIn) {
					BNKSRDSJVBean bean = new BNKSRDSJVBean();
					bean.setBNKUSR(((BNKSRDSJVMessage) newmessage).getBNKUSR());
					bean.setBNKPVI(((BNKSRDSJVMessage) newmessage).getBNKPVI());
					bean.setBNKFRC(((BNKSRDSJVMessage) newmessage).getBNKFRC());
					bean.setBNKID(((BNKSRDSJVMessage) newmessage).getBNKID());
					bean.setBNKNME(((BNKSRDSJVMessage) newmessage).getBNKNME());
					bean.setBNKAD1(((BNKSRDSJVMessage) newmessage).getBNKAD1());
					bean.setBNKCTY(((BNKSRDSJVMessage) newmessage).getBNKCTY());
					bean.setBNKSTA(((BNKSRDSJVMessage) newmessage).getBNKSTA());
					bean.setBNKCTR(((BNKSRDSJVMessage) newmessage).getBNKCTR());
					bean.setBNKBRN(((BNKSRDSJVMessage) newmessage).getBNKBRN());
					bean.setBNKIN1(((BNKSRDSJVMessage) newmessage).getBNKIN1());
					bean.setBNKIN2(((BNKSRDSJVMessage) newmessage).getBNKIN2());
					bean.setBNKIN3(((BNKSRDSJVMessage) newmessage).getBNKIN3());
					bean.setBNKIN4(((BNKSRDSJVMessage) newmessage).getBNKIN4());
					bean.setBNKIN5(((BNKSRDSJVMessage) newmessage).getBNKIN5());
					bean.setBNKIN6(((BNKSRDSJVMessage) newmessage).getBNKIN6());
					bean.setBNKREC(((BNKSRDSJVMessage) newmessage).getBNKREC());
					bean.setBNKRUD(((BNKSRDSJVMessage) newmessage).getBNKRUD());
					x.add(bean);
					newmessage = mc.receiveMessage();
					GoIn = ((BNKSRDSJVMessage)newmessage).getBNKRUD().equals("*");
				}
				res.setBNKSRDSJV(x.toArray(new BNKSRDSJVBean[0]));
			}
		} catch (Exception e) {
			log.error("BNKSRDSJV - Listado de bancos - " + e.getMessage() + " - Canal " + req.getCanal(),e);
			throw new WSException(e);
		} finally {
			if (s != null)
				try {
					s.close();
				} catch (IOException e) {
				}
		}
		return res;
	}
	/**
	 * Servicio para consultar el detalle de depósitos a plazo.
	 * @param req
	 * @return
	 * @throws WSException
	 */
	public CDSDSJVResponse CDSDSJV(CDSDSJVBean req) throws WSException {
		log.info("Invocando CDSDSJV");
		Parametros params = new Parametros();
		Socket s = null;
		CDSDSJVResponse res = new CDSDSJVResponse();
		try {
			MessageContext mc;
			s = new Socket(params.getString("ip"), params.getInt("port1"));
			s.setSoTimeout(params.getInt("timeout"));
			mc = new MessageContext(new DataInputStream(new BufferedInputStream(s.getInputStream())), new DataOutputStream(
					new BufferedOutputStream(s.getOutputStream())), "com.activo.gateway.dibs.messages");
			CDSDSJV2Message message = (CDSDSJV2Message) mc.getMessageRecord("CDSDSJV2");
			if(req.getCDSUSER() != null && !"".equals(req.getCDSUSER()))message.setCDSUSER(req.getCDSUSER());
			if(req.getCDSDEAACC() != null && !"".equals(req.getCDSDEAACC()))message.setCDSDEAACC(req.getCDSDEAACC());
			if(req.getCDSDEACCY() != null && !"".equals(req.getCDSDEACCY()))message.setCDSDEACCY(req.getCDSDEACCY());
			if(req.getCDSDEAMEP() != null && !"".equals(req.getCDSDEAMEP()))message.setCDSDEAMEP(req.getCDSDEAMEP());
			if(req.getCDSDEAIPY() != null && !"".equals(req.getCDSDEAIPY()))message.setCDSDEAIPY(req.getCDSDEAIPY());
			if(req.getCDSINTMAT() != null && !"".equals(req.getCDSINTMAT()))message.setCDSINTMAT(req.getCDSINTMAT());
			if(req.getCDSMATDTE1() != null && !"".equals(req.getCDSMATDTE1()))message.setCDSMATDTE1(req.getCDSMATDTE1());
			if(req.getCDSMATDTE2() != null && !"".equals(req.getCDSMATDTE2()))message.setCDSMATDTE2(req.getCDSMATDTE2());
			if(req.getCDSMATDTE3() != null && !"".equals(req.getCDSMATDTE3()))message.setCDSMATDTE3(req.getCDSMATDTE3());
			if(req.getCDSDEARTE() != null && !"".equals(req.getCDSDEARTE()))message.setCDSDEARTE(req.getCDSDEARTE());
			if(req.getCDSLSYIPD() != null && !"".equals(req.getCDSLSYIPD()))message.setCDSLSYIPD(req.getCDSLSYIPD());
			if(req.getCDSPRDNME() != null && !"".equals(req.getCDSPRDNME()))message.setCDSPRDNME(req.getCDSPRDNME());
			if(req.getCDSSTATUS() != null && !"".equals(req.getCDSSTATUS()))message.setCDSSTATUS(req.getCDSSTATUS());
			if(req.getCDSOPEDAT1() != null && !"".equals(req.getCDSOPEDAT1()))message.setCDSOPEDAT1(req.getCDSOPEDAT1());
			if(req.getCDSOPEDAT2() != null && !"".equals(req.getCDSOPEDAT2()))message.setCDSOPEDAT2(req.getCDSOPEDAT2());
			if(req.getCDSOPEDAT3() != null && !"".equals(req.getCDSOPEDAT3()))message.setCDSOPEDAT3(req.getCDSOPEDAT3());
			if(req.getCDSTERLOAN() != null && !"".equals(req.getCDSTERLOAN()))message.setCDSTERLOAN(req.getCDSTERLOAN());
			message.send();
			message.destroy();
			MessageRecord newmessage = mc.receiveMessage();
			if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("0"))) {
				manejarError(res, ((ELEERRMessage) newmessage));
				log.error("CDSDSJV - Detalle Depositos a Plazo: " + " Error: "+ res.getError().getERNU01() + " - " + res.getError().getERDS01() + " - Canal " + req.getCanal());
				return res;
			}
			CDSDSJV2Message newmessage2 = (CDSDSJV2Message) newmessage;
			res.setCDSDSJS(new CDSDSJVBean());
			res.getCDSDSJS().setCDSUSER(newmessage2.getCDSUSER());
			res.getCDSDSJS().setCDSDEAACC(newmessage2.getCDSDEAACC());
			res.getCDSDSJS().setCDSDEACCY(newmessage2.getCDSDEACCY());
			res.getCDSDSJS().setCDSDEAMEP(newmessage2.getCDSDEAMEP());
			res.getCDSDSJS().setCDSDEAIPY(newmessage2.getCDSDEAIPY());
			res.getCDSDSJS().setCDSINTMAT(newmessage2.getCDSINTMAT());
			res.getCDSDSJS().setCDSMATDTE1(newmessage2.getCDSMATDTE1());
			res.getCDSDSJS().setCDSMATDTE2(newmessage2.getCDSMATDTE2());
			res.getCDSDSJS().setCDSMATDTE3(newmessage2.getCDSMATDTE3());
			res.getCDSDSJS().setCDSDEARTE(newmessage2.getCDSDEARTE());
			res.getCDSDSJS().setCDSLSYIPD(newmessage2.getCDSLSYIPD());
			res.getCDSDSJS().setCDSPRDNME(newmessage2.getCDSPRDNME());
			res.getCDSDSJS().setCDSSTATUS(newmessage2.getCDSSTATUS());
			res.getCDSDSJS().setCDSOPEDAT1(newmessage2.getCDSOPEDAT1());
			res.getCDSDSJS().setCDSOPEDAT2(newmessage2.getCDSOPEDAT2());
			res.getCDSDSJS().setCDSOPEDAT3(newmessage2.getCDSOPEDAT3());
			res.getCDSDSJS().setCDSTERLOAN(newmessage2.getCDSTERLOAN());
		} catch (Exception e) {
			log.error("CDSDSJV - Detalle deposito a plazo - " + e.getMessage() + " - Canal " + req.getCanal(),e);
			throw new WSException(e);
		} finally {
			if (s != null)
				try {
					s.close();
				} catch (IOException e) {
				}
		}
		return res;
	}
	/*************NUEVOS SERVIVIOS ADVERWEB*********************************/
	/**
	 * Servicio para validar el BIN de una TDC en particular.
	 * @param req
	 * @return
	 * @throws WSException
	 */
	public INVALTDCResponse INVALTDC(INVALTDCBean req) throws WSException{
		log.info("Invocando PRUEBAINT");
		Socket s = null;
		INVALTDCResponse res = new INVALTDCResponse();
		try {
			Parametros params = new Parametros();
			MessageContext mc;
			s = new Socket(params.getString("ip"), params.getInt("port1"));
			s.setSoTimeout(params.getInt("timeout"));
			mc = new MessageContext(new DataInputStream(new BufferedInputStream(s.getInputStream())), new DataOutputStream(
					new BufferedOutputStream(s.getOutputStream())), "com.activo.gateway.dibs.messages");
			INVALTDCMessage message;
			message = (INVALTDCMessage) mc.getMessageRecord("INVALTDC");
			if(req.getRUSUARIO() != null && !"".equals(req.getRUSUARIO()))message.setRUSUARIO(req.getRUSUARIO());
			if(req.getRNROTARJ() != null && !"".equals(req.getRNROTARJ()))message.setRNROTARJ(req.getRNROTARJ());
			if(req.getRNROCTA() != null && !"".equals(req.getRNROCTA()))message.setRNROCTA(req.getRNROCTA());
			if(req.getRCEDRIF() != null && !"".equals(req.getRCEDRIF()))message.setRCEDRIF(req.getRCEDRIF());
			message.send();
			message.destroy();
			MessageRecord newmessage = mc.receiveMessage();
			if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("0"))) {
				manejarError(res, ((ELEERRMessage) newmessage));
				return res;
			}
			INVALTDCMessage newmessage2 = (INVALTDCMessage) newmessage;
			res.setINVALTDC(new INVALTDCBean());
			res.getINVALTDC().setRUSUARIO(newmessage2.getRUSUARIO());
			res.getINVALTDC().setRNROTARJ(newmessage2.getRNROTARJ());
			res.getINVALTDC().setRNROCTA(newmessage2.getRNROCTA());
			res.getINVALTDC().setRCEDRIF(newmessage2.getRCEDRIF());
		} catch (Exception e) {
			log.error(e);
			throw new WSException(e);
		} finally {
			if (s != null)
				try {
					s.close();
				} catch (IOException e) {
				}
		}
		return res;
	}
	/**
	 * Servicio para validar el RIF de un Cliente en particular.
	 * @param req
	 * @return
	 * @throws WSException
	 */
	public INVALRIFResponse INVALRIF(INVALRIFBean req) throws WSException{
		log.info("Invocando INVALRIF");
		Socket s = null;
		INVALRIFResponse res = new INVALRIFResponse();
		try {
			Parametros params = new Parametros();
			MessageContext mc;
			s = new Socket(params.getString("ip"), params.getInt("port1"));
			s.setSoTimeout(params.getInt("timeout"));
			mc = new MessageContext(new DataInputStream(new BufferedInputStream(s.getInputStream())), new DataOutputStream(
					new BufferedOutputStream(s.getOutputStream())), "com.activo.gateway.dibs.messages");
			INVALRIF2Message message;
			message = (INVALRIF2Message) mc.getMessageRecord("INVALRIF2");
			if(req.getRSTATUS() != null && !"".equals(req.getRSTATUS()))message.setRSTATUS(req.getRSTATUS());
			if(req.getRNRORIF() != null && !"".equals(req.getRNRORIF()))message.setRNRORIF(req.getRNRORIF());
			if(req.getRDIGITO() != null && !"".equals(req.getRDIGITO()))message.setRDIGITO(req.getRDIGITO());
			if(req.getXUSUARIO() != null && !"".equals(req.getXUSUARIO()))message.setXUSUARIO(req.getXUSUARIO());
			if(req.getXNROTARJ() != null && !"".equals(req.getXNROTARJ()))message.setXNROTARJ(req.getXNROTARJ());
			if(req.getXNROCTA() != null && !"".equals(req.getXNROCTA()))message.setXNROCTA(req.getXNROCTA());
			message.send();
			message.destroy();
			MessageRecord newmessage = mc.receiveMessage();
			if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("0"))) {
				manejarError(res, ((ELEERRMessage) newmessage));
				log.error("INVALRIF - validacion de RIF: " + " Error: "+ res.getError().getERNU01() + " - " + res.getError().getERDS01() + " - Canal " + req.getCanal());
				return res;
			}
			INVALRIF2Message newmessage2 = (INVALRIF2Message) newmessage;
			res.setINVALRIF(new INVALRIFBean());
			res.getINVALRIF().setRSTATUS(newmessage2.getRSTATUS());
			res.getINVALRIF().setRNRORIF(newmessage2.getRNRORIF());
			res.getINVALRIF().setRDIGITO(newmessage2.getRDIGITO());
			res.getINVALRIF().setXUSUARIO(newmessage2.getXUSUARIO());
			res.getINVALRIF().setXNROTARJ(newmessage2.getXNROTARJ());
			res.getINVALRIF().setXNROCTA(newmessage2.getXNROCTA());
		} catch (Exception e) {
			log.error("INVALRIF - Validacion de RIF - " + e.getMessage() + " - Canal " + req.getCanal(),e);
			throw new WSException(e);
		} finally {
			if (s != null)
				try {
					s.close();
				} catch (IOException e) {
				}
		}
		return res;
	}	
	/**
	 * Servicio para validar el BIN de una TDC en particular.
	 * @param req
	 * @return
	 * @throws WSException
	 */
	public NIB090501Response NIB090501(NIB090501Bean req) throws WSException{
		log.info("Invocando NIB090501");
		Socket s = null;
		NIB090501Response res = new NIB090501Response();
		try {
			Parametros params = new Parametros();
			MessageContext mc;
			s = new Socket(params.getString("ip"), params.getInt("port1"));
			s.setSoTimeout(params.getInt("timeout"));
			mc = new MessageContext(new DataInputStream(new BufferedInputStream(s.getInputStream())), new DataOutputStream(
					new BufferedOutputStream(s.getOutputStream())), "com.activo.gateway.dibs.messages");
			NIB090501Message message;
			message = (NIB090501Message) mc.getMessageRecord("NIB090501");
			if(req.getTUSUARIO() != null && !"".equals(req.getTUSUARIO()))message.setTUSUARIO(req.getTUSUARIO());
			if(req.getTNROTARJ() != null && !"".equals(req.getTNROTARJ()))message.setTNROTARJ(req.getTNROTARJ());
			if(req.getTNROCTA() != null && !"".equals(req.getTNROCTA()))message.setTNROCTA(req.getTNROCTA());
			if(req.getTCEDRIF() != null && !"".equals(req.getTCEDRIF()))message.setTCEDRIF(req.getTCEDRIF());
			if(req.getTBANCO() != null && !"".equals(req.getTBANCO()))message.setTBANCO(req.getTBANCO());
			if(req.getTDESBANCO() != null && !"".equals(req.getTDESBANCO()))message.setTDESBANCO(req.getTDESBANCO());
			message.send();
			message.destroy();
			MessageRecord newmessage = mc.receiveMessage();
			if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("0"))) {
				manejarError(res, ((ELEERRMessage) newmessage));
				log.error("NIB090501 - Validar BIN TDC: " + " Error: "+ res.getError().getERNU01() + " - " + res.getError().getERDS01() + " - Canal " + req.getCanal());
				return res;
			}
			NIB090501Message newmessage2 = (NIB090501Message) newmessage;
			res.setNIB090501(new NIB090501Bean());
			res.getNIB090501().setTUSUARIO(newmessage2.getTUSUARIO());
			res.getNIB090501().setTNROTARJ(newmessage2.getTNROTARJ());
			res.getNIB090501().setTNROCTA(newmessage2.getTNROCTA());
			res.getNIB090501().setTCEDRIF(newmessage2.getTCEDRIF());
			res.getNIB090501().setTBANCO(newmessage2.getTBANCO());
			res.getNIB090501().setTDESBANCO(newmessage2.getTDESBANCO());
		} catch (Exception e) {
			log.error("NIB090501 - Validar BIN TDC - " + e.getMessage() + " - Canal " + req.getCanal(),e);
			throw new WSException(e);
		} finally {
			if (s != null)
				try {
					s.close();
				} catch (IOException e) {
				}
		}
		return res;
	}	
	/**
	 * Servicio para la Consulta de Saldos Diferidos y BLoqueados de una cuenta en particular.
	 * @param req
	 * @return
	 * @throws WSException
	 */
	public EDD0395DSResponse EDD0395DS(EDD0395DSBean req) throws WSException{
		log.info("Invocando EDD0395DS");
		Socket s = null;
		EDD0395DSResponse res = new EDD0395DSResponse();
		try {
			Parametros params = new Parametros();
			MessageContext mc;
			s = new Socket(params.getString("ip"), params.getInt("port2"));
			s.setSoTimeout(params.getInt("timeout"));
			mc = new MessageContext(new DataInputStream(new BufferedInputStream(s.getInputStream())), new DataOutputStream(
					new BufferedOutputStream(s.getOutputStream())), "com.activo.gateway.dibs.messages");
			EDD0395DSMessage message;
			message = (EDD0395DSMessage)mc.getMessageRecord("EDD0395DS");
			if(req.getH01USERID() != null && !"".equals(req.getH01USERID()))message.setH01USERID(req.getH01USERID());
			if(req.getH01PROGRM() != null && !"".equals(req.getH01PROGRM()))message.setH01PROGRM(req.getH01PROGRM());
			if(req.getH01TIMSYS() != null && !"".equals(req.getH01TIMSYS()))message.setH01TIMSYS(req.getH01TIMSYS());
			if(req.getH01SCRCOD() != null && !"".equals(req.getH01SCRCOD()))message.setH01SCRCOD(req.getH01SCRCOD());
			if(req.getH01OPECOD() != null && !"".equals(req.getH01OPECOD()))message.setH01OPECOD(req.getH01OPECOD());
			if(req.getH01FLGMAS() != null && !"".equals(req.getH01FLGMAS()))message.setH01FLGMAS(req.getH01FLGMAS());
			if(req.getH01FLGWK1() != null && !"".equals(req.getH01FLGWK1()))message.setH01FLGWK1(req.getH01FLGWK1());
			if(req.getH01FLGWK2() != null && !"".equals(req.getH01FLGWK2()))message.setH01FLGWK2(req.getH01FLGWK2());
			if(req.getH01FLGWK3() != null && !"".equals(req.getH01FLGWK3()))message.setH01FLGWK3(req.getH01FLGWK3());
			if(req.getE01UNCACC() != null && !"".equals(req.getE01UNCACC()))message.setE01UNCACC(req.getE01UNCACC());
			if(req.getE01UNCFLG() != null && !"".equals(req.getE01UNCFLG()))message.setE01UNCFLG(req.getE01UNCFLG());
			if(req.getE01UNCAMN() != null && !"".equals(req.getE01UNCAMN()))message.setE01UNCAMN(req.getE01UNCAMN());
			if(req.getE01UNCCKN() != null && !"".equals(req.getE01UNCCKN()))message.setE01UNCCKN(req.getE01UNCCKN());
			if(req.getE01UNCDYS() != null && !"".equals(req.getE01UNCDYS()))message.setE01UNCDYS(req.getE01UNCDYS());
			if(req.getE01UNCRD1() != null && !"".equals(req.getE01UNCRD1()))message.setE01UNCRD1(req.getE01UNCRD1());
			if(req.getE01UNCRD2() != null && !"".equals(req.getE01UNCRD2()))message.setE01UNCRD2(req.getE01UNCRD2());
			if(req.getE01UNCRD3() != null && !"".equals(req.getE01UNCRD3()))message.setE01UNCRD3(req.getE01UNCRD3());
			if(req.getE01UNCMD1() != null && !"".equals(req.getE01UNCMD1()))message.setE01UNCMD1(req.getE01UNCMD1());
			if(req.getE01UNCMD2() != null && !"".equals(req.getE01UNCMD2()))message.setE01UNCMD2(req.getE01UNCMD2());
			if(req.getE01UNCMD3() != null && !"".equals(req.getE01UNCMD3()))message.setE01UNCMD3(req.getE01UNCMD3());
			if(req.getE01UNCRSN() != null && !"".equals(req.getE01UNCRSN()))message.setE01UNCRSN(req.getE01UNCRSN());
			if(req.getE01UNCCUN() != null && !"".equals(req.getE01UNCCUN()))message.setE01UNCCUN(req.getE01UNCCUN());
			if(req.getE01UNCSTA() != null && !"".equals(req.getE01UNCSTA()))message.setE01UNCSTA(req.getE01UNCSTA());
			if(req.getE01UNCCON() != null && !"".equals(req.getE01UNCCON()))message.setE01UNCCON(req.getE01UNCCON());
			if(req.getE01UNCTEL() != null && !"".equals(req.getE01UNCTEL()))message.setE01UNCTEL(req.getE01UNCTEL());
			if(req.getE01UNCTSQ() != null && !"".equals(req.getE01UNCTSQ()))message.setE01UNCTSQ(req.getE01UNCTSQ());
			if(req.getE01UNCKBK() != null && !"".equals(req.getE01UNCKBK()))message.setE01UNCKBK(req.getE01UNCKBK());
			if(req.getE01UNCKBR() != null && !"".equals(req.getE01UNCKBR()))message.setE01UNCKBR(req.getE01UNCKBR());
			if(req.getE01UNCKAC() != null && !"".equals(req.getE01UNCKAC()))message.setE01UNCKAC(req.getE01UNCKAC());
			if(req.getE01UNCDES() != null && !"".equals(req.getE01UNCDES()))message.setE01UNCDES(req.getE01UNCDES());
			if(req.getE01UNCCRM() != null && !"".equals(req.getE01UNCCRM()))message.setE01UNCCRM(req.getE01UNCCRM());
			if(req.getE01UNCOBR() != null && !"".equals(req.getE01UNCOBR()))message.setE01UNCOBR(req.getE01UNCOBR());
			if(req.getE01UNCHTY() != null && !"".equals(req.getE01UNCHTY()))message.setE01UNCHTY(req.getE01UNCHTY());
			if(req.getE01UNCNRM() != null && !"".equals(req.getE01UNCNRM()))message.setE01UNCNRM(req.getE01UNCNRM());
			if(req.getE01UNCUSR() != null && !"".equals(req.getE01UNCUSR()))message.setE01UNCUSR(req.getE01UNCUSR());
			if(req.getE01UNCFUS() != null && !"".equals(req.getE01UNCFUS()))message.setE01UNCFUS(req.getE01UNCFUS());
			if(req.getE01UNCF02() != null && !"".equals(req.getE01UNCF02()))message.setE01UNCF02(req.getE01UNCF02());
			message.send();
			message.destroy();
			MessageRecord newmessage = mc.receiveMessage();
			if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("0"))) {
				manejarError(res, ((ELEERRMessage) newmessage));
				log.error("EDD0395DS - Saldos Diferidos y Bloqueados" + " Error: "+ res.getError().getERNU01() + " - " + res.getError().getERDS01() + " - Canal " + req.getCanal());
				return res;
			} else {
				if (newmessage.getFormatName().equals("EDD0395DS")) {
					List<EDD0395DSBean> y = new ArrayList<EDD0395DSBean>();
					for (boolean GoIn = ((EDD0395DSMessage)newmessage).getH01FLGMAS().equals("*"); !GoIn; GoIn = ((EDD0395DSMessage)newmessage).getH01FLGMAS().equals("*"))
					{
						EDD0395DSBean bean = new EDD0395DSBean();
						bean.setH01USERID(((EDD0395DSMessage) newmessage).getH01USERID());
						bean.setH01PROGRM(((EDD0395DSMessage) newmessage).getH01PROGRM());
						bean.setH01TIMSYS(((EDD0395DSMessage) newmessage).getH01TIMSYS());
						bean.setH01SCRCOD(((EDD0395DSMessage) newmessage).getH01SCRCOD());
						bean.setH01OPECOD(((EDD0395DSMessage) newmessage).getH01OPECOD());
						bean.setH01FLGMAS(((EDD0395DSMessage) newmessage).getH01FLGMAS());
						bean.setH01FLGWK1(((EDD0395DSMessage) newmessage).getH01FLGWK1());
						bean.setH01FLGWK2(((EDD0395DSMessage) newmessage).getH01FLGWK2());
						bean.setH01FLGWK3(((EDD0395DSMessage) newmessage).getH01FLGWK3());
						bean.setE01UNCACC(((EDD0395DSMessage) newmessage).getE01UNCACC());
						bean.setE01UNCFLG(((EDD0395DSMessage) newmessage).getE01UNCFLG());
						bean.setE01UNCAMN(((EDD0395DSMessage) newmessage).getE01UNCAMN());
						bean.setE01UNCCKN(((EDD0395DSMessage) newmessage).getE01UNCCKN());
						bean.setE01UNCDYS(((EDD0395DSMessage) newmessage).getE01UNCDYS());
						bean.setE01UNCRD1(((EDD0395DSMessage) newmessage).getE01UNCRD1());
						bean.setE01UNCRD2(((EDD0395DSMessage) newmessage).getE01UNCRD2());
						bean.setE01UNCRD3(((EDD0395DSMessage) newmessage).getE01UNCRD3());
						bean.setE01UNCMD1(((EDD0395DSMessage) newmessage).getE01UNCMD1());
						bean.setE01UNCMD2(((EDD0395DSMessage) newmessage).getE01UNCMD2());
						bean.setE01UNCMD3(((EDD0395DSMessage) newmessage).getE01UNCMD3());
						bean.setE01UNCRSN(((EDD0395DSMessage) newmessage).getE01UNCRSN());
						bean.setE01UNCCUN(((EDD0395DSMessage) newmessage).getE01UNCCUN());
						bean.setE01UNCSTA(((EDD0395DSMessage) newmessage).getE01UNCSTA());
						bean.setE01UNCCON(((EDD0395DSMessage) newmessage).getE01UNCCON());
						bean.setE01UNCTEL(((EDD0395DSMessage) newmessage).getE01UNCTEL());
						bean.setE01UNCTSQ(((EDD0395DSMessage) newmessage).getE01UNCTSQ());
						bean.setE01UNCKBK(((EDD0395DSMessage) newmessage).getE01UNCKBK());
						bean.setE01UNCKBR(((EDD0395DSMessage) newmessage).getE01UNCKBR());
						bean.setE01UNCKAC(((EDD0395DSMessage) newmessage).getE01UNCKAC());
						bean.setE01UNCDES(((EDD0395DSMessage) newmessage).getE01UNCDES());
						bean.setE01UNCCRM(((EDD0395DSMessage) newmessage).getE01UNCCRM());
						bean.setE01UNCOBR(((EDD0395DSMessage) newmessage).getE01UNCOBR());
						bean.setE01UNCHTY(((EDD0395DSMessage) newmessage).getE01UNCHTY());
						bean.setE01UNCNRM(((EDD0395DSMessage) newmessage).getE01UNCNRM());
						bean.setE01UNCUSR(((EDD0395DSMessage) newmessage).getE01UNCUSR());
						bean.setE01UNCFUS(((EDD0395DSMessage) newmessage).getE01UNCFUS());
						bean.setE01UNCF02(((EDD0395DSMessage) newmessage).getE01UNCF02());
						y.add(bean);    
						newmessage = mc.receiveMessage();	
					}
					res.setEDD0395DS(y.toArray(new EDD0395DSBean[0]));
				}
			}
		} catch (Exception e) {
			log.error("EDD0395DS - Saldos Diferidos y Bloqueados - " + e.getMessage() + " - Canal " + req.getCanal(),e);
			throw new WSException(e);
		} finally {
			if (s != null)
				try {
					s.close();
				} catch (IOException e) {
				}
		}
		return res;
	}
	/**
	 * Servicio para consultar las Preguntas de Autenticación.
	 * @param req
	 * @return
	 * @throws WSException
	 */
	public NIBPF3000Response NIBPF3000(NIBPF3000Bean req) throws WSException{
		log.info("Invocando NIBPF3000");
		Socket s = null;
		NIBPF3000Response res = new NIBPF3000Response();
		try {
			Parametros params = new Parametros();
			MessageContext mc;
			s = new Socket(params.getString("ip"), params.getInt("port7"));
			s.setSoTimeout(params.getInt("timeout"));
			mc = new MessageContext(new DataInputStream(new BufferedInputStream(s.getInputStream())), new DataOutputStream(
					new BufferedOutputStream(s.getOutputStream())), "com.activo.gateway.dibs.messages");
			NIBPF3000Message message;
			message = (NIBPF3000Message)mc.getMessageRecord("NIBPF3000");
			if(req.getNACIONALIDAD()!=null && !"".equals(req.getNACIONALIDAD()))message.setNACIONALIDAD(req.getNACIONALIDAD());
			if(req.getNROIDENTIFICACION()!=null && !"".equals(req.getNROIDENTIFICACION()))message.setNROIDENTIFICACION(req.getNROIDENTIFICACION());
			message.send();
			message.destroy();
			MessageRecord newmessage = mc.receiveMessage();
			if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("0"))) {
				manejarError(res, ((ELEERRMessage) newmessage));
				log.error("NIBPF3000 - Preguntas de autenticacion " + " Error: "+ res.getError().getERNU01() + " - " + res.getError().getERDS01() + " - Canal " + req.getCanal());
				return res;
			} else {
				if (newmessage.getFormatName().equals("NIBPF3000")) {
					List<NIBPF3000Bean> y = new ArrayList<NIBPF3000Bean>();
					NIBPF3000Message msg = (NIBPF3000Message) newmessage;
					for (int i = 0; i < 60; i++)
					{
						NIBPF3000Bean bean = new NIBPF3000Bean();
						bean.setNACIONALIDAD(msg.getNACIONALIDAD());
						bean.setNROIDENTIFICACION(msg.getNROIDENTIFICACION());
						bean.setNROPREGUNTA(msg.getNROPREGUNTA());
						bean.setTIPORESPUESTA(msg.getTIPORESPUESTA());
						bean.setRESPUESTA(msg.getRESPUESTA());
						if("001".equals(bean.getNROPREGUNTA())){
							bean.setFechaNacimiento(bean.getRESPUESTA().substring(0,10));
						} else if("002".equals(bean.getNROPREGUNTA())){
							bean.setUltimos4CtaCte(bean.getRESPUESTA().substring(0,4));
							bean.setDirEstadoCuenta(bean.getRESPUESTA().substring(5,185));
						} else if("003".equals(bean.getNROPREGUNTA())){
							bean.setFranquicia(bean.getRESPUESTA().substring(0,1));
							bean.setUltimos4Tdc(bean.getRESPUESTA().substring(2,6));
							bean.setDirEstadoCuentaTDC(bean.getRESPUESTA().substring(7,127));
						} else if("004".equals(bean.getNROPREGUNTA())){
							bean.setNroCtaAhorro(bean.getRESPUESTA().substring(0,20));
							bean.setCotitularesCtaAhorro(bean.getRESPUESTA().substring(21,22));
						} else if("005".equals(bean.getNROPREGUNTA())){
							bean.setNroCtaCte(bean.getRESPUESTA().substring(0,20));
							bean.setCotitularesCtaCte(bean.getRESPUESTA().substring(21,22));
						} else if("006".equals(bean.getNROPREGUNTA())){
							bean.setPoseeCtaAhorro(bean.getRESPUESTA().substring(0,1));
						} else if("06A".equals(bean.getNROPREGUNTA())){
							bean.setUltimos4CtaAhorro(bean.getRESPUESTA().substring(0,4));
						} else if("06B".equals(bean.getNROPREGUNTA())){
							bean.setNroLibreta(bean.getRESPUESTA().substring(0,8));
						} else if("007".equals(bean.getNROPREGUNTA())){
							bean.setPoseeCtaCte(bean.getRESPUESTA().substring(0,1));
						} else if("07A".equals(bean.getNROPREGUNTA())){
							bean.setUltimos4CtaCte(bean.getRESPUESTA().substring(0,4));
						} else if("07B".equals(bean.getNROPREGUNTA())){
							ArrayList<String> cheques = new ArrayList<String>();
							for(int k = 0; k+9 < bean.getRESPUESTA().length();k+=9){
								String cheque = bean.getRESPUESTA().substring(k,8+k).trim();
								if(!"".equals(cheque)){
									cheques.add(cheque);
								}
							}
							bean.setCheques(cheques.toArray(new String[0]));
						} else if("008".equals(bean.getNROPREGUNTA())){
							bean.setPoseeTdcVisa(bean.getRESPUESTA().substring(0,1));
						} else if("08A".equals(bean.getNROPREGUNTA())){
							bean.setUltimos4TdcVisa(bean.getRESPUESTA().substring(0,4));
						} else if("08B".equals(bean.getNROPREGUNTA())){
							bean.setFechaVencTdcVisa(bean.getRESPUESTA().substring(0,4));
						} else if("009".equals(bean.getNROPREGUNTA())){
							bean.setPoseeTdcMaster(bean.getRESPUESTA().substring(0,1));
						} else if("09A".equals(bean.getNROPREGUNTA())){
							bean.setUltimos4TdcMaster(bean.getRESPUESTA().substring(0,4));
						} else if("09B".equals(bean.getNROPREGUNTA())){
							bean.setFechaVencTdcMaster(bean.getRESPUESTA().substring(0,8));
						} else if("010".equals(bean.getNROPREGUNTA())){
							bean.setPoseeCtaTdd(bean.getRESPUESTA().substring(0,1));
						} else if("10A".equals(bean.getNROPREGUNTA())){
							bean.setUltimos4Tdd(bean.getRESPUESTA().substring(0,4));
						} else if("10B".equals(bean.getNROPREGUNTA())){
							bean.setFechaVecnTdd(bean.getRESPUESTA().substring(0,4));
						} else if("011".equals(bean.getNROPREGUNTA())){
							bean.setNroTlfCelular(bean.getRESPUESTA().substring(0,11));
						} else if("012".equals(bean.getNROPREGUNTA())){
							bean.setNroTlfOficina(bean.getRESPUESTA().substring(0,11));
						} else if("013".equals(bean.getNROPREGUNTA())){
							bean.setNroTlfResidencia(bean.getRESPUESTA().substring(0,11));
						} else if("014".equals(bean.getNROPREGUNTA())){
							bean.setTipoProducto(bean.getRESPUESTA().substring(0,4));
							bean.setUltimos4Cta(bean.getRESPUESTA().substring(5,9));
							bean.setNombreOfcApertura(bean.getRESPUESTA().substring(10,45));
						} else if("022".equals(bean.getNROPREGUNTA())){
							bean.setNroCtaCte(bean.getRESPUESTA().substring(0,20));
						} else if("023".equals(bean.getNROPREGUNTA())){
							bean.setNroCtaAhorro(bean.getRESPUESTA().substring(0,20));
						} else if("027".equals(bean.getNROPREGUNTA())){
							//Busco el numero de cliente
							NIBPF3010Bean req3010 = new NIBPF3010Bean();
							req3010.setNACIONALIDAD(req.getNACIONALIDAD());
							req3010.setNROIDENTIFICACION(StringUtils.leftPad(req.getNROIDENTIFICACION(),12,'0'));
							req3010.setNROPARAM("1");
							NIBPF3010Response resNibpf3010 = null;
							resNibpf3010 = NIBPF3010(req3010);
							String numCliente = resNibpf3010.getNIBPF3010().getNROCLIENTE();
							Database db = new Database();
							String resp = "F";
							
							if(db.conectarSII()){
								resp = db.realizoSolicitudSICADII(numCliente);
							}
							
							bean.setTIPORESPUESTA(resp);
						}
						y.add(bean);    
						if("027".equals(bean.getNROPREGUNTA())) break;
						newmessage = mc.receiveMessage();
						msg = (NIBPF3000Message) newmessage;
					}
					res.setPreguntas(y.toArray(new NIBPF3000Bean[0]));				
				}
			}
		}catch (Exception e) {
			log.error("NIBPF3000 - Preguntas de autenticacion - " + e.getMessage() + " - Canal " + req.getCanal(),e);
			throw new WSException(e);
		} finally {
			if (s != null)
				try {
					s.close();
				} catch (IOException e) {
				}
		}
		return res;			
	}
	/**
	 * Servicio para la consulta de los Datos Básicos de un cliente en particular.
	 * @param req
	 * @return
	 * @throws WSException
	 */
	public NIBPF3010Response NIBPF3010(NIBPF3010Bean req) throws WSException{
		log.info("Invocando NIBPF3010");
		Socket s = null;
		NIBPF3010Response res = new NIBPF3010Response();
		try {
			Parametros params = new Parametros();
			MessageContext mc;
			s = new Socket(params.getString("ip"), params.getInt("port7"));
			s.setSoTimeout(params.getInt("timeout"));
			mc = new MessageContext(new DataInputStream(new BufferedInputStream(s.getInputStream())), new DataOutputStream(
					new BufferedOutputStream(s.getOutputStream())), "com.activo.gateway.dibs.messages");
			NIBPF3010Message message;
			message = (NIBPF3010Message)mc.getMessageRecord("NIBPF3010");
			if(req.getNACIONALIDAD()!=null && !"".equals(req.getNACIONALIDAD()))message.setNACIONALIDAD(req.getNACIONALIDAD());
			if(req.getNROIDENTIFICACION()!=null && !"".equals(req.getNROIDENTIFICACION()))message.setNROIDENTIFICACION(req.getNROIDENTIFICACION());
			if(req.getNROCUENTA() != null && !"".equals(req.getNROCUENTA())) message.setNROCUENTA(req.getNROCUENTA());
			if(req.getNROCLIENTE() != null && !"".equals(req.getNROCLIENTE())) message.setNROCLIENTE(req.getNROCLIENTE());
			if(req.getNROTDC() != null && !"".equals(req.getNROTDC())) message.setNROTDC(req.getNROTDC());
			if(req.getNROPARAM() != null && !"".equals(req.getNROPARAM())) message.setNROPARAM(req.getNROPARAM());
			//Para buscar el id del usuario en la base de datos
			String nacionalidad = null;
			int identificacion = 0;
			String nroIdentificacion = null;
			boolean bandera = false;
			if((!StringUtils.isEmpty(req.getNACIONALIDAD())) && (!StringUtils.isEmpty(req.getNROIDENTIFICACION()))){
				bandera = true;
				nacionalidad = req.getNACIONALIDAD();
				if("P".equals(nacionalidad)){
					nroIdentificacion = req.getNROIDENTIFICACION();
				}else{
					identificacion = Integer.parseInt(req.getNROIDENTIFICACION());
					nroIdentificacion = Integer.toString(identificacion);
				}
			}
			Database db = new Database();
			Usuario[] usuario = null;
			message.send();
			message.destroy();
			MessageRecord newmessage = mc.receiveMessage();
			if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("0"))) {
				manejarError(res, ((ELEERRMessage) newmessage));
				log.error("NIBPF3010 - Datos Basicos " + " Error: "+ res.getError().getERNU01() + " - " + res.getError().getERDS01() + " - Canal " + req.getCanal());
				return res;
			} else {
				if (newmessage.getFormatName().equals("NIBPF3010")) {
					NIBPF3010Message msg = (NIBPF3010Message) newmessage;
					NIBPF3010Bean bean = new NIBPF3010Bean();
					res.setNIBPF3010(bean);
					bean.setNACIONALIDAD(msg.getNACIONALIDAD().trim());
					bean.setNROIDENTIFICACION(msg.getNROIDENTIFICACION().trim());
					bean.setIDENTIFICACIONIBS(msg.getIDENTIFICACIONIBS().trim());
					bean.setPRIMERNOMBRE(msg.getPRIMERNOMBRE().trim());
					bean.setSEGUNDONOMBRE(msg.getSEGUNDONOMBRE().trim());
					bean.setPRIMERAPELLIDO(msg.getPRIMERAPELLIDO().trim());
					bean.setSEGUNDOAPELLIDO(msg.getSEGUNDOAPELLIDO().trim());
					bean.setTIPOID(msg.getTIPOID().trim());
					bean.setRIF(msg.getRIF().trim());
					bean.setDIRECCION01(msg.getDIRECCION01().trim());
					bean.setDIRECCION02(msg.getDIRECCION02().trim());
					bean.setDIRECCION03(msg.getDIRECCION03().trim());
					bean.setDIRECCION04(msg.getDIRECCION04().trim());
					bean.setESTADO(msg.getESTADO().trim());
					bean.setZONAPOSTAL(msg.getZONAPOSTAL().trim());
					bean.setPAIS(msg.getPAIS().trim());
					bean.setSEXO(msg.getSEXO().trim());
					bean.setESTADOCIVIL(msg.getESTADOCIVIL().trim());
					bean.setNIVELESTUDIO(msg.getNIVELESTUDIO().trim());
					bean.setFECHANAC(msg.getFECHANAC().trim());
					bean.setNROCELULAR(msg.getNROCELULAR().trim());
					bean.setNROOFICINA(msg.getNROOFICINA().trim());
					bean.setNROHAB(msg.getNROHAB().trim());
					bean.setNROFAX(msg.getNROFAX().trim());
					bean.setTDD(msg.getTDD().trim());	
					bean.setNROCUENTA(msg.getNROCUENTA().trim());
					bean.setNROCLIENTE(msg.getNROCLIENTE().trim());
					bean.setNROTDC(msg.getNROTDC().trim());
					bean.setNROPARAM(msg.getNROPARAM().trim());
					bean.setSTSCUENTA(msg.getSTSCUENTA().trim());
					bean.setDESCSTSCUENTA(msg.getDESCSTSCUENTA().trim());
					bean.setSTSTDC(msg.getSTSTDC().trim());
					bean.setDESCSTSTDC(msg.getDESCSTSTDC().trim());
					bean.setSTSTDD(msg.getSTSTDD().trim());
					bean.setDESCSTSTDD(msg.getDESCSTSTDD().trim());
					bean.setDISPONIBLE1(msg.getDISPONIBLE1().trim());
					bean.setDISPONIBLE2(msg.getDISPONIBLE2().trim());
					bean.setDISPONIBLE3(msg.getDISPONIBLE3().trim());
					bean.setINTLNADB(msg.getINTLNADB().trim());
					bean.setMONEDA(msg.getINMONEDA().trim());
					bean.setINTFIL01(msg.getINTFIL01().trim());
					bean.setINTFIL02(msg.getINTFIL02().trim());
					//Recuperar el id del usuario de la base de datos
					if(bandera){
						if(db.conectar()){
							try {
								usuario = db.buscarUsuarioSUMDSJV(nacionalidad,nroIdentificacion, req.getCanal());
								if(usuario.length > 0){
									bean.setINTLIDCL(usuario[0].getId());
								}else if("0".equals(usuario)){
									res.getError().setERRNUM("1");
									res.getError().setERNU01("-3");
									res.getError().setERDS01("Usuario no existe");
									log.error(res.getError().getERDS01());
									return res;
								}
							} catch (Exception e) {
								res.getError().setERRNUM("1");
								res.getError().setERNU01("60962");
								res.getError().setERDS01(e.getMessage());
								log.error(e);
								return res;
							}	
						}else{// error al conectar
							res.getError().setERRNUM("1");
							res.getError().setERNU01("-1");
							res.getError().setERDS01("Error en la conexión");
						}
					}else{
						bean.setINTLIDCL(0);
					}
				}
			}
		} catch (Exception e) {
			log.error("NIBPF3010 - Datos Basicos - " + e.getMessage() + " - Canal " + req.getCanal(),e);
			throw new WSException(e);
		} finally {
			if (s != null)
				try {
					s.close();
				} catch (IOException e) {
				}
		}
		return res;
	}
	/**
	 * Servicio para crear un usuario.
	 * @param req
	 * @return
	 * @throws WSException
	 */
	public NIBPF3020Response NIBPF3020(NIBPF3020Bean req) throws WSException{
		log.info("Invocando NIBPF3020");
		Socket s = null;
		NIBPF3020Response res = new NIBPF3020Response();
		try {
			Parametros params = new Parametros();
			MessageContext mc;
			s = new Socket(params.getString("ip"), params.getInt("port7"));
			s.setSoTimeout(params.getInt("timeout"));
			mc = new MessageContext(new DataInputStream(new BufferedInputStream(s.getInputStream())), new DataOutputStream(
					new BufferedOutputStream(s.getOutputStream())), "com.activo.gateway.dibs.messages");
			NIBPF3020Message message;
			message = (NIBPF3020Message)mc.getMessageRecord("NIBPF3020");
			if(req.getINTNACEU() != null && !"".equals(req.getINTNACEU())) message.setINTNACEU(req.getINTNACEU());
			if(req.getINTIDEEU() != null && !"".equals(req.getINTIDEEU())) message.setINTIDEEU(req.getINTIDEEU());			
			message.send();
			message.destroy();
			MessageRecord newmessage = mc.receiveMessage();
			if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("0"))) {
				manejarError(res, ((ELEERRMessage) newmessage));
				log.error("NIBPF3020 - Crear Usuario " + " Error: "+ res.getError().getERNU01() + " - " + res.getError().getERDS01() + " - Canal " + req.getCanal());
				return res;
			} else {
				if (newmessage.getFormatName().equals("NIBPF3020")) {
					NIBPF3020Message msg = (NIBPF3020Message) newmessage;
					NIBPF3020Bean bean = new NIBPF3020Bean();
					res.setNIBPF3020(bean);
					bean.setINTNACEU(msg.getINTNACEU());
					bean.setINTIDEEU(msg.getINTIDEEU());
				}
			}
		}catch (Exception e) {
			log.error("NIBPF3020 - Crear Usuario - " + e.getMessage() + " - Canal " + req.getCanal(),e);
			throw new WSException(e);
		} finally {
			if (s != null)
				try {
					s.close();
				} catch (IOException e) {
				}
		}
		return res;
	}
	/**
	 * Servicio para la Creación/Modificación del email.
	 * @param req
	 * @return
	 * @throws WSException
	 */
	public NIBPF3030Response NIBPF3030(NIBPF3030Bean req) throws WSException{
		log.info("Invocando NIBPF3030");
		Socket s = null;
		NIBPF3030Response res = new NIBPF3030Response();
		try {
			Parametros params = new Parametros();
			MessageContext mc;
			s = new Socket(params.getString("ip"), params.getInt("port7"));
			s.setSoTimeout(params.getInt("timeout"));
			mc = new MessageContext(new DataInputStream(new BufferedInputStream(s.getInputStream())), new DataOutputStream(
					new BufferedOutputStream(s.getOutputStream())), "com.activo.gateway.dibs.messages");
			NIBPF3030Message message;
			message = (NIBPF3030Message)mc.getMessageRecord("NIBPF3030");
			if(req.getINTNACEM() != null && !"".equals(req.getINTNACEM())) message.setINTNACEM(req.getINTNACEM());
			if(req.getINTIDEEM() != null && !"".equals(req.getINTIDEEM())) message.setINTIDEEM(req.getINTIDEEM());
			if(req.getINTCOREM() != null && !"".equals(req.getINTCOREM())) message.setINTCOREM(req.getINTCOREM());
			message.send();
			message.destroy();
			MessageRecord newmessage = mc.receiveMessage();
			if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("0"))) {
				manejarError(res, ((ELEERRMessage) newmessage));
				log.error("NIBPF3030 - Crear/Modificar " + " Error: "+ res.getError().getERNU01() + " - " + res.getError().getERDS01() + " - Canal " + req.getCanal());
				return res;
			} else {
				if (newmessage.getFormatName().equals("NIBPF3030")) {
					NIBPF3030Message msg = (NIBPF3030Message) newmessage;
					NIBPF3030Bean bean = new NIBPF3030Bean();
					res.setNIBPF3030(bean);
					bean.setINTNACEM(msg.getINTNACEM());
					bean.setINTIDEEM(msg.getINTIDEEM());
					bean.setINTCOREM(msg.getINTCOREM());
				}
			}
		}catch (Exception e) {
			log.error("NIBPF3030 - Crear/Modificar Correo - " + e.getMessage() + " - Canal " + req.getCanal(),e);
			throw new WSException(e);
		} finally {
			if (s != null)
				try {
					s.close();
				} catch (IOException e) {
				}
		}
		return res;
	}
	/**
	 * Servicio para Crear, Modificar Nro de Teléfono.
	 * @param req
	 * @return
	 * @throws WSException
	 */
	public NIBPF3040Response NIBPF3040(NIBPF3040Bean req) throws WSException{
		log.info("Invocando NIBPF3040");
		Socket s = null;
		NIBPF3040Response res = new NIBPF3040Response();
		try {
			Parametros params = new Parametros();
			MessageContext mc;
			s = new Socket(params.getString("ip"), params.getInt("port7"));
			s.setSoTimeout(params.getInt("timeout"));
			mc = new MessageContext(new DataInputStream(new BufferedInputStream(s.getInputStream())), new DataOutputStream(
					new BufferedOutputStream(s.getOutputStream())), "com.activo.gateway.dibs.messages");
			NIBPF3040Message message;
			message = (NIBPF3040Message)mc.getMessageRecord("NIBPF3040");
			if(req.getINTNACTC() != null && !"".equals(req.getINTNACTC())) message.setINTNACTC(req.getINTNACTC());
			if(req.getINTIDETC() != null && !"".equals(req.getINTIDETC())) message.setINTIDETC(req.getINTIDETC());
			if(req.getINTNTCTC() != null && !"".equals(req.getINTNTCTC())) message.setINTNTCTC(req.getINTNTCTC());
			message.send();
			message.destroy();
			MessageRecord newmessage = mc.receiveMessage();
			if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("0"))) {
				manejarError(res, ((ELEERRMessage) newmessage));
				log.error("NIBPF3040 - Crear/Modificar Telefono " + " Error: "+ res.getError().getERNU01() + " - " + res.getError().getERDS01() + " - Canal " + req.getCanal());
				return res;
			} else {
				if (newmessage.getFormatName().equals("NIBPF3040")) {
					NIBPF3040Message msg = (NIBPF3040Message) newmessage;
					NIBPF3040Bean bean = new NIBPF3040Bean();
					res.setNIBPF3040(bean);
					bean.setINTNACTC(msg.getINTNACTC());
					bean.setINTIDETC(msg.getINTIDETC());
					bean.setINTNTCTC(msg.getINTNTCTC());
				}
			}
		}catch (Exception e) {
			log.error("NIBPF3040 - Crear/Modificar Telefono - " + e.getMessage() + " - Canal " + req.getCanal(),e);
			throw new WSException(e);
		} finally {
			if (s != null)
				try {
					s.close();
				} catch (IOException e) {
				}
		}
		return res;
	}
	/**
	 * Servicio para Crear, Modificar Límites.
	 * @param req
	 * @return
	 * @throws WSException
	 */
	public NIBPF3050Response NIBPF3050(NIBPF3050Bean req) throws WSException{
		log.info("Invocando NIBPF3050");
		Socket s = null;
		NIBPF3050Response res = new NIBPF3050Response();
		try {
			Parametros params = new Parametros();
			MessageContext mc;
			s = new Socket(params.getString("ip"), params.getInt("port7"));
			s.setSoTimeout(params.getInt("timeout"));
			mc = new MessageContext(new DataInputStream(new BufferedInputStream(s.getInputStream())), new DataOutputStream(
					new BufferedOutputStream(s.getOutputStream())), "com.activo.gateway.dibs.messages");
			NIBPF3050Message message;
			message = (NIBPF3050Message)mc.getMessageRecord("NIBPF3050");
			if(req.getINTNACLI() != null && !"".equals(req.getINTNACLI())) message.setINTNACLI(req.getINTNACLI());
			if(req.getINTIDELI() != null && !"".equals(req.getINTIDELI())) message.setINTIDELI(req.getINTIDELI());
			if(req.getINTMLELI() != null && !"".equals(req.getINTMLELI())) message.setINTMLELI(req.getINTMLELI());
			if(req.getINTCLELI() != null && !"".equals(req.getINTCLELI())) message.setINTCLELI(req.getINTCLELI());
			if(req.getINTMLILI() != null && !"".equals(req.getINTMLILI())) message.setINTMLILI(req.getINTMLILI());
			if(req.getINTCLILI() != null && !"".equals(req.getINTCLILI())) message.setINTCLILI(req.getINTCLILI());						
			message.send();
			message.destroy();
			MessageRecord newmessage = mc.receiveMessage();
			if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("0"))) {
				manejarError(res, ((ELEERRMessage) newmessage));
				log.error("NIBPF3050 - Crear/Modificar Limites " + " Error: "+ res.getError().getERNU01() + " - " + res.getError().getERDS01() + " - Canal " + req.getCanal());
				return res;
			} else {
				if (newmessage.getFormatName().equals("NIBPF3050")) {
					NIBPF3050Message msg = (NIBPF3050Message) newmessage;
					NIBPF3050Bean bean = new NIBPF3050Bean();
					res.setNIBPF3050(bean);
					bean.setINTNACLI(msg.getINTNACLI());
					bean.setINTIDELI(msg.getINTIDELI());
					bean.setINTMLELI(msg.getINTMLELI());
					bean.setINTCLELI(msg.getINTCLELI());
					bean.setINTMLILI(msg.getINTMLILI());
					bean.setINTCLILI(msg.getINTCLILI());
				}
			}
		}catch (Exception e) {
			log.error("NIBPF3050 - Crear/Modificar Limites - " + e.getMessage() + " - Canal " + req.getCanal(),e);
			throw new WSException(e);
		} finally {
			if (s != null)
				try {
					s.close();
				} catch (IOException e) {
				}
		}
		return res;
	}
	/**
	 * NOMBRE DE ESTE SERVICIO!!!
	 * @param req
	 * @return
	 * @throws WSException
	 */
	public EDL090001Response EDL090001(EDL090001Bean req) throws WSException{
		log.info("Invocando EDL090001");
		EDL090001Response res = new EDL090001Response();
		Socket s = null;
		try {
			Parametros params = new Parametros();
			MessageContext mc;
			s = new Socket(params.getString("ip"), params.getInt("port1")+1);
			s.setSoTimeout(params.getInt("timeout"));
			mc = new MessageContext(new DataInputStream(new BufferedInputStream(s.getInputStream())), new DataOutputStream(
					new BufferedOutputStream(s.getOutputStream())), "com.activo.gateway.dibs.messages");
			EDL090001Message message;
			message = (EDL090001Message)mc.getMessageRecord("EDL090001");
			if(req.getH01USERID()!=null && !"".equals(req.getH01USERID())) message.setH01USERID(req.getH01USERID());
			if(req.getH01PROGRM()!=null && !"".equals(req.getH01PROGRM())) message.setH01PROGRM(req.getH01PROGRM());
			if(req.getH01TIMSYS()!=null && !"".equals(req.getH01TIMSYS())) message.setH01TIMSYS(req.getH01TIMSYS());
			if(req.getH01SCRCOD()!=null && !"".equals(req.getH01SCRCOD())) message.setH01SCRCOD(req.getH01SCRCOD());
			if(req.getH01OPECOD()!=null && !"".equals(req.getH01OPECOD())) message.setH01OPECOD(req.getH01OPECOD());
			if(req.getH01FLGMAS()!=null && !"".equals(req.getH01FLGMAS())) message.setH01FLGMAS(req.getH01FLGMAS());
			if(req.getH01FLGWK1()!=null && !"".equals(req.getH01FLGWK1())) message.setH01FLGWK1(req.getH01FLGWK1());
			if(req.getH01FLGWK2()!=null && !"".equals(req.getH01FLGWK2())) message.setH01FLGWK2(req.getH01FLGWK2());
			if(req.getH01FLGWK3()!=null && !"".equals(req.getH01FLGWK3())) message.setH01FLGWK3(req.getH01FLGWK3());
			if(req.getE01DEAACC()!=null && !"".equals(req.getE01DEAACC())) message.setE01DEAACC(req.getE01DEAACC());
			if(req.getE01DEAACD()!=null && !"".equals(req.getE01DEAACD())) message.setE01DEAACD(req.getE01DEAACD());
			if(req.getE01DEAPRO()!=null && !"".equals(req.getE01DEAPRO())) message.setE01DEAPRO(req.getE01DEAPRO());
			if(req.getE01DEACUN()!=null && !"".equals(req.getE01DEACUN())) message.setE01DEACUN(req.getE01DEACUN());
			if(req.getE01CUSNA1()!=null && !"".equals(req.getE01CUSNA1())) message.setE01CUSNA1(req.getE01CUSNA1());
			if(req.getE01DEABNK()!=null && !"".equals(req.getE01DEABNK())) message.setE01DEABNK(req.getE01DEABNK());
			if(req.getE01DEABRN()!=null && !"".equals(req.getE01DEABRN())) message.setE01DEABRN(req.getE01DEABRN());
			if(req.getE01DEACCY()!=null && !"".equals(req.getE01DEACCY())) message.setE01DEACCY(req.getE01DEACCY());
			if(req.getE01DEAGLN()!=null && !"".equals(req.getE01DEAGLN())) message.setE01DEAGLN(req.getE01DEAGLN());
			if(req.getE01DEACCN()!=null && !"".equals(req.getE01DEACCN())) message.setE01DEACCN(req.getE01DEACCN());
			if(req.getE01DEATYP()!=null && !"".equals(req.getE01DEATYP())) message.setE01DEATYP(req.getE01DEATYP());
			if(req.getE01DEAOAM()!=null && !"".equals(req.getE01DEAOAM())) message.setE01DEAOAM(req.getE01DEAOAM());
			if(req.getE01DEARTE()!=null && !"".equals(req.getE01DEARTE())) message.setE01DEARTE(req.getE01DEARTE());
			if(req.getE01DEABAS()!=null && !"".equals(req.getE01DEABAS())) message.setE01DEABAS(req.getE01DEABAS());
			if(req.getE01DEAICT()!=null && !"".equals(req.getE01DEAICT())) message.setE01DEAICT(req.getE01DEAICT());
			if(req.getE01OPEND1()!=null && !"".equals(req.getE01OPEND1())) message.setE01OPEND1(req.getE01OPEND1());
			if(req.getE01OPEND2()!=null && !"".equals(req.getE01OPEND2())) message.setE01OPEND2(req.getE01OPEND2());
			if(req.getE01OPEND3()!=null && !"".equals(req.getE01OPEND3())) message.setE01OPEND3(req.getE01OPEND3());
			if(req.getE01MATUR1()!=null && !"".equals(req.getE01MATUR1())) message.setE01MATUR1(req.getE01MATUR1());
			if(req.getE01MATUR2()!=null && !"".equals(req.getE01MATUR2())) message.setE01MATUR2(req.getE01MATUR2());
			if(req.getE01MATUR3()!=null && !"".equals(req.getE01MATUR3())) message.setE01MATUR3(req.getE01MATUR3());
			if(req.getE01LSTCL1()!=null && !"".equals(req.getE01LSTCL1())) message.setE01LSTCL1(req.getE01LSTCL1());
			if(req.getE01LSTCL2()!=null && !"".equals(req.getE01LSTCL2())) message.setE01LSTCL2(req.getE01LSTCL2());
			if(req.getE01LSTCL3()!=null && !"".equals(req.getE01LSTCL3())) message.setE01LSTCL3(req.getE01LSTCL3());		
			message.send();
			message.destroy();
			MessageRecord newmessage = mc.receiveMessage();
			if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("0"))) {
				manejarError(res, ((ELEERRMessage) newmessage));
				log.error("EDL090001 -  " + " Error: "+ res.getError().getERNU01() + " - " + res.getError().getERDS01() + " - Canal " + req.getCanal());
				return res;
			} else {
				if (newmessage.getFormatName().equals("EDL090001")) {
					EDL090001Message msg = (EDL090001Message) newmessage;
					EDL090001Bean bean = new EDL090001Bean();
					res.setEDL090001(bean);
					bean.setH01USERID(msg.getH01USERID());
					bean.setH01PROGRM(msg.getH01PROGRM());
					bean.setH01TIMSYS(msg.getH01TIMSYS());
					bean.setH01SCRCOD(msg.getH01SCRCOD());
					bean.setH01OPECOD(msg.getH01OPECOD());
					bean.setH01FLGMAS(msg.getH01FLGMAS());
					bean.setH01FLGWK1(msg.getH01FLGWK1());
					bean.setH01FLGWK2(msg.getH01FLGWK2());
					bean.setH01FLGWK3(msg.getH01FLGWK3());
					bean.setE01DEAACC(msg.getE01DEAACC());
					bean.setE01DEAACD(msg.getE01DEAACD());
					bean.setE01DEAPRO(msg.getE01DEAPRO());
					bean.setE01DEACUN(msg.getE01DEACUN());
					bean.setE01CUSNA1(msg.getE01CUSNA1());
					bean.setE01DEABNK(msg.getE01DEABNK());
					bean.setE01DEABRN(msg.getE01DEABRN());
					bean.setE01DEACCY(msg.getE01DEACCY());
					bean.setE01DEAGLN(msg.getE01DEAGLN());
					bean.setE01DEACCN(msg.getE01DEACCN());
					bean.setE01DEATYP(msg.getE01DEATYP());
					bean.setE01DEAOAM(msg.getE01DEAOAM());
					bean.setE01DEARTE(msg.getE01DEARTE());
					bean.setE01DEABAS(msg.getE01DEABAS());
					bean.setE01DEAICT(msg.getE01DEAICT());
					bean.setE01OPEND1(msg.getE01OPEND1());
					bean.setE01OPEND2(msg.getE01OPEND2());
					bean.setE01OPEND3(msg.getE01OPEND3());
					bean.setE01MATUR1(msg.getE01MATUR1());
					bean.setE01MATUR2(msg.getE01MATUR2());
					bean.setE01MATUR3(msg.getE01MATUR3());
					bean.setE01LSTCL1(msg.getE01LSTCL1());
					bean.setE01LSTCL2(msg.getE01LSTCL2());
					bean.setE01LSTCL3(msg.getE01LSTCL3());	
					newmessage = mc.receiveMessage();
					if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("0"))) {
						manejarError(res, ((ELEERRMessage) newmessage));
						log.error("EDL090001 -  " + " Error: "+ res.getError().getERNU01() + " - " + res.getError().getERDS01() + " - Canal " + req.getCanal());
						return res;
					} else {
						if (newmessage.getFormatName().equals("EDL090002")) {
							EDL090002Message msg2 = (EDL090002Message) newmessage;
							List<EDL090002Bean> y = new ArrayList<EDL090002Bean>();
							while(!msg2.getE02ENDFLD().equals("*"))
							{
								EDL090002Bean bean2 = new EDL090002Bean();
								bean2.setH02USERID(msg2.getH02USERID());
								bean2.setH02PROGRM(msg2.getH02PROGRM());
								bean2.setH02TIMSYS(msg2.getH02TIMSYS());
								bean2.setH02SCRCOD(msg2.getH02SCRCOD());
								bean2.setH02OPECOD(msg2.getH02OPECOD());
								bean2.setH02FLGMAS(msg2.getH02FLGMAS());
								bean2.setH02FLGWK1(msg2.getH02FLGWK1());
								bean2.setH02FLGWK2(msg2.getH02FLGWK2());
								bean2.setH02FLGWK3(msg2.getH02FLGWK3());
								bean2.setE02DLPACC(msg2.getE02DLPACC());
								bean2.setE02DLPPNU(msg2.getE02DLPPNU());
								bean2.setE02DLPPD1(msg2.getE02DLPPD1());
								bean2.setE02DLPPD2(msg2.getE02DLPPD2());
								bean2.setE02DLPPD3(msg2.getE02DLPPD3());
								bean2.setE02DLPPRN(msg2.getE02DLPPRN());
								bean2.setE02DLPINT(msg2.getE02DLPINT());
								bean2.setE02DLPOTH(msg2.getE02DLPOTH());
								bean2.setE02DLPTOT(msg2.getE02DLPTOT());
								bean2.setE02DLPBAL(msg2.getE02DLPBAL());
								bean2.setE02DLPSTS(msg2.getE02DLPSTS());
								bean2.setE02DLPVEN(msg2.getE02DLPVEN());
								bean2.setE02DLPDT1(msg2.getE02DLPDT1());
								bean2.setE02DLPDT2(msg2.getE02DLPDT2());
								bean2.setE02DLPDT3(msg2.getE02DLPDT3());
								bean2.setE02DLPPAG(msg2.getE02DLPPAG());
								bean2.setE02ENDFLD(msg2.getE02ENDFLD());
								bean2.setE02DESC01(msg2.getE02DESC01());
								bean2.setE02DESC02(msg2.getE02DESC02());
								bean2.setE02DESC03(msg2.getE02DESC03());
								bean2.setE02DESC04(msg2.getE02DESC04());
								bean2.setE02DESC05(msg2.getE02DESC05());
								bean2.setE02DESC06(msg2.getE02DESC06());
								bean2.setE02DESC07(msg2.getE02DESC07());
								bean2.setE02DESC08(msg2.getE02DESC08());
								bean2.setE02DESC09(msg2.getE02DESC09());
								bean2.setE02DESC10(msg2.getE02DESC10());
								bean2.setE02DESC11(msg2.getE02DESC11());
								bean2.setE02DESC12(msg2.getE02DESC12());
								bean2.setE02DESC13(msg2.getE02DESC13());
								bean2.setE02DESC14(msg2.getE02DESC14());
								bean2.setE02DESC15(msg2.getE02DESC15());
								bean2.setE02DESC16(msg2.getE02DESC16());
								bean2.setE02DESC17(msg2.getE02DESC17());
								bean2.setE02DESC18(msg2.getE02DESC18());
								bean2.setE02DESC19(msg2.getE02DESC19());
								bean2.setE02DESC20(msg2.getE02DESC20());
								bean2.setE02AMNT01(msg2.getE02AMNT01());
								bean2.setE02AMNT02(msg2.getE02AMNT02());
								bean2.setE02AMNT03(msg2.getE02AMNT03());
								bean2.setE02AMNT04(msg2.getE02AMNT04());
								bean2.setE02AMNT05(msg2.getE02AMNT05());
								bean2.setE02AMNT06(msg2.getE02AMNT06());
								bean2.setE02AMNT07(msg2.getE02AMNT07());
								bean2.setE02AMNT08(msg2.getE02AMNT08());
								bean2.setE02AMNT09(msg2.getE02AMNT09());
								bean2.setE02AMNT10(msg2.getE02AMNT10());
								bean2.setE02AMNT11(msg2.getE02AMNT11());
								bean2.setE02AMNT12(msg2.getE02AMNT12());
								bean2.setE02AMNT13(msg2.getE02AMNT13());
								bean2.setE02AMNT14(msg2.getE02AMNT14());
								bean2.setE02AMNT15(msg2.getE02AMNT15());
								bean2.setE02AMNT16(msg2.getE02AMNT16());
								bean2.setE02AMNT17(msg2.getE02AMNT17());
								bean2.setE02AMNT18(msg2.getE02AMNT18());
								bean2.setE02AMNT19(msg2.getE02AMNT19());
								bean2.setE02AMNT20(msg2.getE02AMNT20());
								bean2.setE02PAID01(msg2.getE02PAID01());
								bean2.setE02PAID02(msg2.getE02PAID02());
								bean2.setE02PAID03(msg2.getE02PAID03());
								bean2.setE02PAID04(msg2.getE02PAID04());
								bean2.setE02PAID05(msg2.getE02PAID05());
								bean2.setE02PAID06(msg2.getE02PAID06());
								bean2.setE02PAID07(msg2.getE02PAID07());
								bean2.setE02PAID08(msg2.getE02PAID08());
								bean2.setE02PAID09(msg2.getE02PAID09());
								bean2.setE02PAID10(msg2.getE02PAID10());
								bean2.setE02PAID11(msg2.getE02PAID11());
								bean2.setE02PAID12(msg2.getE02PAID12());
								bean2.setE02PAID13(msg2.getE02PAID13());
								bean2.setE02PAID14(msg2.getE02PAID14());
								bean2.setE02PAID15(msg2.getE02PAID15());
								bean2.setE02PAID16(msg2.getE02PAID16());
								bean2.setE02PAID17(msg2.getE02PAID17());
								bean2.setE02PAID18(msg2.getE02PAID18());
								bean2.setE02PAID19(msg2.getE02PAID19());
								bean2.setE02PAID20(msg2.getE02PAID20());
								bean2.setE02TOAMNT(msg2.getE02TOAMNT());
								bean2.setE02TOPAID(msg2.getE02TOPAID());								
								y.add(bean2);   
								newmessage = mc.receiveMessage();	
								msg2 = (EDL090002Message) newmessage;
							}
							res.setEDL090002(y.toArray(new EDL090002Bean[0]));
						}
						newmessage = mc.receiveMessage();
						if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("0"))) {
							manejarError(res, ((ELEERRMessage) newmessage));
							log.error("EDL090001 -  " + " Error: "+ res.getError().getERNU01() + " - " + res.getError().getERDS01() + " - Canal " + req.getCanal());
							return res;
						} else {
							if (newmessage.getFormatName().equals("EDL090003")) {
								EDL090003Message msg3 = (EDL090003Message) newmessage;
								List<EDL090003Bean> y = new ArrayList<EDL090003Bean>();
								while(!msg3.getE03ENDFLD().equals("*"))
								{
									EDL090003Bean bean3 = new EDL090003Bean();
									bean3.setH03USERID(msg3.getH03USERID());
									bean3.setH03PROGRM(msg3.getH03PROGRM());
									bean3.setH03TIMSYS(msg3.getH03TIMSYS());
									bean3.setH03SCRCOD(msg3.getH03SCRCOD());
									bean3.setH03OPECOD(msg3.getH03OPECOD());
									bean3.setH03FLGMAS(msg3.getH03FLGMAS());
									bean3.setH03FLGWK1(msg3.getH03FLGWK1());
									bean3.setH03FLGWK2(msg3.getH03FLGWK2());
									bean3.setH03FLGWK3(msg3.getH03FLGWK3());
									bean3.setE03DLPACC(msg3.getE03DLPACC());
									bean3.setE03DLPPNU(msg3.getE03DLPPNU());
									bean3.setE03DLPPD1(msg3.getE03DLPPD1());
									bean3.setE03DLPPD2(msg3.getE03DLPPD2());
									bean3.setE03DLPPD3(msg3.getE03DLPPD3());
									bean3.setE03DLPPRN(msg3.getE03DLPPRN());
									bean3.setE03DLPINT(msg3.getE03DLPINT());
									bean3.setE03DLPTOT(msg3.getE03DLPTOT());
									bean3.setE03DLPBAL(msg3.getE03DLPBAL());
									bean3.setE03DLPSTS(msg3.getE03DLPSTS());
									bean3.setE03DLPVEN(msg3.getE03DLPVEN());
									bean3.setE03ENDFLD(msg3.getE03ENDFLD());
									y.add(bean3);   
									newmessage = mc.receiveMessage();	
									msg3 = (EDL090003Message) newmessage;
								}
								res.setEDL090003(y.toArray(new EDL090003Bean[0]));
							}
						}						
					}
				}
			}
		}catch (Exception e) {
			log.error("EDL90001 - " + e.getMessage() + " - Canal " + req.getCanal(),e);
			throw new WSException(e);
		} finally {
			if (s != null)
				try {
					s.close();
				} catch (IOException e) {
				}
		}
		return res;
	}
	/**
	 * Servicio para Consultar el Detalle de un Crédito particular.
	 * @param req
	 * @return
	 * @throws WSException
	 */
	public EDL098001Response EDL098001(EDL098001Bean req) throws WSException{
		log.info("Invocando EDL098001");
		EDL098001Response res = new EDL098001Response();
		Socket s = null;
		try {
			Parametros params = new Parametros();
			MessageContext mc;
			s = new Socket(params.getString("ip"), params.getInt("port1")+1);
			s.setSoTimeout(params.getInt("timeout"));
			mc = new MessageContext(new DataInputStream(new BufferedInputStream(s.getInputStream())), new DataOutputStream(
					new BufferedOutputStream(s.getOutputStream())), "com.activo.gateway.dibs.messages");
			EDL098001Message message;
			message = (EDL098001Message)mc.getMessageRecord("EDL098001");
			if(req.getH01USERID() != null && !"".equals(req.getH01USERID())) message.setH01USERID(req.getH01USERID());
			if(req.getH01PROGRM() != null && !"".equals(req.getH01PROGRM())) message.setH01PROGRM(req.getH01PROGRM());
			if(req.getH01TIMSYS() != null && !"".equals(req.getH01TIMSYS())) message.setH01TIMSYS(req.getH01TIMSYS());
			if(req.getH01SCRCOD() != null && !"".equals(req.getH01SCRCOD())) message.setH01SCRCOD(req.getH01SCRCOD());
			if(req.getH01OPECOD() != null && !"".equals(req.getH01OPECOD())) message.setH01OPECOD(req.getH01OPECOD());
			if(req.getH01FLGMAS() != null && !"".equals(req.getH01FLGMAS())) message.setH01FLGMAS(req.getH01FLGMAS());
			if(req.getH01FLGWK1() != null && !"".equals(req.getH01FLGWK1())) message.setH01FLGWK1(req.getH01FLGWK1());
			if(req.getH01FLGWK2() != null && !"".equals(req.getH01FLGWK2())) message.setH01FLGWK2(req.getH01FLGWK2());
			if(req.getH01FLGWK3() != null && !"".equals(req.getH01FLGWK3())) message.setH01FLGWK3(req.getH01FLGWK3());
			if(req.getE01DEAACC() != null && !"".equals(req.getE01DEAACC())) message.setE01DEAACC(req.getE01DEAACC());
			if(req.getE01DEAACD() != null && !"".equals(req.getE01DEAACD())) message.setE01DEAACD(req.getE01DEAACD());
			if(req.getE01DEAPRO() != null && !"".equals(req.getE01DEAPRO())) message.setE01DEAPRO(req.getE01DEAPRO());
			if(req.getE01DEACUN() != null && !"".equals(req.getE01DEACUN())) message.setE01DEACUN(req.getE01DEACUN());
			if(req.getE01CUSNA1() != null && !"".equals(req.getE01CUSNA1())) message.setE01CUSNA1(req.getE01CUSNA1());
			if(req.getE01DEABNK() != null && !"".equals(req.getE01DEABNK())) message.setE01DEABNK(req.getE01DEABNK());
			if(req.getE01DEABRN() != null && !"".equals(req.getE01DEABRN())) message.setE01DEABRN(req.getE01DEABRN());
			if(req.getE01DEACCY() != null && !"".equals(req.getE01DEACCY())) message.setE01DEACCY(req.getE01DEACCY());
			if(req.getE01DEAGLN() != null && !"".equals(req.getE01DEAGLN())) message.setE01DEAGLN(req.getE01DEAGLN());
			if(req.getE01DEACCN() != null && !"".equals(req.getE01DEACCN())) message.setE01DEACCN(req.getE01DEACCN());
			if(req.getE01DEATYP() != null && !"".equals(req.getE01DEATYP())) message.setE01DEATYP(req.getE01DEATYP());
			if(req.getE01DEAOAM() != null && !"".equals(req.getE01DEAOAM())) message.setE01DEAOAM(req.getE01DEAOAM());
			if(req.getE01DEARTE() != null && !"".equals(req.getE01DEARTE())) message.setE01DEARTE(req.getE01DEARTE());
			if(req.getE01DEABAS() != null && !"".equals(req.getE01DEABAS())) message.setE01DEABAS(req.getE01DEABAS());
			if(req.getE01DEAICT() != null && !"".equals(req.getE01DEAICT())) message.setE01DEAICT(req.getE01DEAICT());
			if(req.getE01OPEND1() != null && !"".equals(req.getE01OPEND1())) message.setE01OPEND1(req.getE01OPEND1());
			if(req.getE01OPEND2() != null && !"".equals(req.getE01OPEND2())) message.setE01OPEND2(req.getE01OPEND2());
			if(req.getE01OPEND3() != null && !"".equals(req.getE01OPEND3())) message.setE01OPEND3(req.getE01OPEND3());
			if(req.getE01MATUR1() != null && !"".equals(req.getE01MATUR1())) message.setE01MATUR1(req.getE01MATUR1());
			if(req.getE01MATUR2() != null && !"".equals(req.getE01MATUR2())) message.setE01MATUR2(req.getE01MATUR2());
			if(req.getE01MATUR3() != null && !"".equals(req.getE01MATUR3())) message.setE01MATUR3(req.getE01MATUR3());
			if(req.getE01LSTCL1() != null && !"".equals(req.getE01LSTCL1())) message.setE01LSTCL1(req.getE01LSTCL1());
			if(req.getE01LSTCL2() != null && !"".equals(req.getE01LSTCL2())) message.setE01LSTCL2(req.getE01LSTCL2());
			if(req.getE01LSTCL3() != null && !"".equals(req.getE01LSTCL3())) message.setE01LSTCL3(req.getE01LSTCL3());
			if(req.getE01DEASTS() != null && !"".equals(req.getE01DEASTS())) message.setE01DEASTS(req.getE01DEASTS());
			if(req.getE01DEATRM() != null && !"".equals(req.getE01DEATRM())) message.setE01DEATRM(req.getE01DEATRM());
			if(req.getE01DEATRC() != null && !"".equals(req.getE01DEATRC())) message.setE01DEATRC(req.getE01DEATRC());
			if(req.getE01DEAPDU() != null && !"".equals(req.getE01DEAPDU())) message.setE01DEAPDU(req.getE01DEAPDU());
			if(req.getE01DEAIDU() != null && !"".equals(req.getE01DEAIDU())) message.setE01DEAIDU(req.getE01DEAIDU());
			if(req.getE01DEATDU() != null && !"".equals(req.getE01DEATDU())) message.setE01DEATDU(req.getE01DEATDU());
			if(req.getE01DEAMEP() != null && !"".equals(req.getE01DEAMEP())) message.setE01DEAMEP(req.getE01DEAMEP());
			if(req.getE01DEATOT() != null && !"".equals(req.getE01DEATOT())) message.setE01DEATOT(req.getE01DEATOT());
			if(req.getE01DEAFRM() != null && !"".equals(req.getE01DEAFRM())) message.setE01DEAFRM(req.getE01DEAFRM());
			if(req.getE01DEAFRC() != null && !"".equals(req.getE01DEAFRC())) message.setE01DEAFRC(req.getE01DEAFRC());
			if(req.getE01APCDSC() != null && !"".equals(req.getE01APCDSC())) message.setE01APCDSC(req.getE01APCDSC());
			if(req.getE01DEATCP() != null && !"".equals(req.getE01DEATCP())) message.setE01DEATCP(req.getE01DEATCP());
			if(req.getE01DEATCV() != null && !"".equals(req.getE01DEATCV())) message.setE01DEATCV(req.getE01DEATCV());
			if(req.getE01DEAMPX() != null && !"".equals(req.getE01DEAMPX())) message.setE01DEAMPX(req.getE01DEAMPX());
			if(req.getE01DEAMPP() != null && !"".equals(req.getE01DEAMPP())) message.setE01DEAMPP(req.getE01DEAMPP());
			if(req.getE01DEAMPP1() != null && !"".equals(req.getE01DEAMPP1())) message.setE01DEAMPP1(req.getE01DEAMPP1());
			if(req.getE01DEAMPP2() != null && !"".equals(req.getE01DEAMPP2())) message.setE01DEAMPP2(req.getE01DEAMPP2());
			if(req.getE01DEAMPP3() != null && !"".equals(req.getE01DEAMPP3())) message.setE01DEAMPP3(req.getE01DEAMPP3());
			if(req.getE01DEAOAMR() != null && !"".equals(req.getE01DEAOAMR())) message.setE01DEAOAMR(req.getE01DEAOAMR());
			if(req.getE01DEAACCR() != null && !"".equals(req.getE01DEAACCR())) message.setE01DEAACCR(req.getE01DEAACCR());
			if(req.getE01DEAMEI() != null && !"".equals(req.getE01DEAMEI())) message.setE01DEAMEI(req.getE01DEAMEI());
			if(req.getE01DEAMEM() != null && !"".equals(req.getE01DEAMEM())) message.setE01DEAMEM(req.getE01DEAMEM());
			if(req.getE01DEADLC() != null && !"".equals(req.getE01DEADLC())) message.setE01DEADLC(req.getE01DEADLC());
			message.send();
			message.destroy();
			MessageRecord newmessage = mc.receiveMessage();
			if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("0"))) {
				manejarError(res, ((ELEERRMessage) newmessage));
				log.error("EDL098001 - Crear/Modificar Limites " + " Error: "+ res.getError().getERNU01() + " - " + res.getError().getERDS01() + " - Canal " + req.getCanal());
				return res;
			} else if (newmessage.getFormatName().equals("EDL090002")) {
				EDL090002Message msg2 = (EDL090002Message) newmessage;
				List<EDL090002Bean> y = new ArrayList<EDL090002Bean>();
				while(!msg2.getE02ENDFLD().equals("*"))
				{
					EDL090002Bean bean2 = new EDL090002Bean();
					bean2.setH02USERID(msg2.getH02USERID());
					bean2.setH02PROGRM(msg2.getH02PROGRM());
					bean2.setH02TIMSYS(msg2.getH02TIMSYS());
					bean2.setH02SCRCOD(msg2.getH02SCRCOD());
					bean2.setH02OPECOD(msg2.getH02OPECOD());
					bean2.setH02FLGMAS(msg2.getH02FLGMAS());
					bean2.setH02FLGWK1(msg2.getH02FLGWK1());
					bean2.setH02FLGWK2(msg2.getH02FLGWK2());
					bean2.setH02FLGWK3(msg2.getH02FLGWK3());
					bean2.setE02DLPACC(msg2.getE02DLPACC());
					bean2.setE02DLPPNU(msg2.getE02DLPPNU());
					bean2.setE02DLPPD1(msg2.getE02DLPPD1());
					bean2.setE02DLPPD2(msg2.getE02DLPPD2());
					bean2.setE02DLPPD3(msg2.getE02DLPPD3());
					bean2.setE02DLPPRN(msg2.getE02DLPPRN());
					bean2.setE02DLPINT(msg2.getE02DLPINT());
					bean2.setE02DLPOTH(msg2.getE02DLPOTH());
					bean2.setE02DLPTOT(msg2.getE02DLPTOT());
					bean2.setE02DLPBAL(msg2.getE02DLPBAL());
					bean2.setE02DLPSTS(msg2.getE02DLPSTS());
					bean2.setE02DLPVEN(msg2.getE02DLPVEN());
					bean2.setE02DLPDT1(msg2.getE02DLPDT1());
					bean2.setE02DLPDT2(msg2.getE02DLPDT2());
					bean2.setE02DLPDT3(msg2.getE02DLPDT3());
					bean2.setE02DLPPAG(msg2.getE02DLPPAG());
					bean2.setE02ENDFLD(msg2.getE02ENDFLD());
					bean2.setE02DESC01(msg2.getE02DESC01());
					bean2.setE02DESC02(msg2.getE02DESC02());
					bean2.setE02DESC03(msg2.getE02DESC03());
					bean2.setE02DESC04(msg2.getE02DESC04());
					bean2.setE02DESC05(msg2.getE02DESC05());
					bean2.setE02DESC06(msg2.getE02DESC06());
					bean2.setE02DESC07(msg2.getE02DESC07());
					bean2.setE02DESC08(msg2.getE02DESC08());
					bean2.setE02DESC09(msg2.getE02DESC09());
					bean2.setE02DESC10(msg2.getE02DESC10());
					bean2.setE02DESC11(msg2.getE02DESC11());
					bean2.setE02DESC12(msg2.getE02DESC12());
					bean2.setE02DESC13(msg2.getE02DESC13());
					bean2.setE02DESC14(msg2.getE02DESC14());
					bean2.setE02DESC15(msg2.getE02DESC15());
					bean2.setE02DESC16(msg2.getE02DESC16());
					bean2.setE02DESC17(msg2.getE02DESC17());
					bean2.setE02DESC18(msg2.getE02DESC18());
					bean2.setE02DESC19(msg2.getE02DESC19());
					bean2.setE02DESC20(msg2.getE02DESC20());
					bean2.setE02AMNT01(msg2.getE02AMNT01());
					bean2.setE02AMNT02(msg2.getE02AMNT02());
					bean2.setE02AMNT03(msg2.getE02AMNT03());
					bean2.setE02AMNT04(msg2.getE02AMNT04());
					bean2.setE02AMNT05(msg2.getE02AMNT05());
					bean2.setE02AMNT06(msg2.getE02AMNT06());
					bean2.setE02AMNT07(msg2.getE02AMNT07());
					bean2.setE02AMNT08(msg2.getE02AMNT08());
					bean2.setE02AMNT09(msg2.getE02AMNT09());
					bean2.setE02AMNT10(msg2.getE02AMNT10());
					bean2.setE02AMNT11(msg2.getE02AMNT11());
					bean2.setE02AMNT12(msg2.getE02AMNT12());
					bean2.setE02AMNT13(msg2.getE02AMNT13());
					bean2.setE02AMNT14(msg2.getE02AMNT14());
					bean2.setE02AMNT15(msg2.getE02AMNT15());
					bean2.setE02AMNT16(msg2.getE02AMNT16());
					bean2.setE02AMNT17(msg2.getE02AMNT17());
					bean2.setE02AMNT18(msg2.getE02AMNT18());
					bean2.setE02AMNT19(msg2.getE02AMNT19());
					bean2.setE02AMNT20(msg2.getE02AMNT20());
					bean2.setE02PAID01(msg2.getE02PAID01());
					bean2.setE02PAID02(msg2.getE02PAID02());
					bean2.setE02PAID03(msg2.getE02PAID03());
					bean2.setE02PAID04(msg2.getE02PAID04());
					bean2.setE02PAID05(msg2.getE02PAID05());
					bean2.setE02PAID06(msg2.getE02PAID06());
					bean2.setE02PAID07(msg2.getE02PAID07());
					bean2.setE02PAID08(msg2.getE02PAID08());
					bean2.setE02PAID09(msg2.getE02PAID09());
					bean2.setE02PAID10(msg2.getE02PAID10());
					bean2.setE02PAID11(msg2.getE02PAID11());
					bean2.setE02PAID12(msg2.getE02PAID12());
					bean2.setE02PAID13(msg2.getE02PAID13());
					bean2.setE02PAID14(msg2.getE02PAID14());
					bean2.setE02PAID15(msg2.getE02PAID15());
					bean2.setE02PAID16(msg2.getE02PAID16());
					bean2.setE02PAID17(msg2.getE02PAID17());
					bean2.setE02PAID18(msg2.getE02PAID18());
					bean2.setE02PAID19(msg2.getE02PAID19());
					bean2.setE02PAID20(msg2.getE02PAID20());
					bean2.setE02TOAMNT(msg2.getE02TOAMNT());
					bean2.setE02TOPAID(msg2.getE02TOPAID());								
					y.add(bean2);   
					newmessage = mc.receiveMessage();	
					msg2 = (EDL090002Message) newmessage;
				}
				res.setEDL090002(y.toArray(new EDL090002Bean[0]));
			}
			newmessage = mc.receiveMessage();
			if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("0"))) {
				manejarError(res, ((ELEERRMessage) newmessage));
				log.error("EDL090002 - Crear/Modificar Limites " + " Error: "+ res.getError().getERNU01() + " - " + res.getError().getERDS01() + " - Canal " + req.getCanal());
				return res;
			} else {
				if (newmessage.getFormatName().equals("EDL098001")) {
					EDL098001Message msg = (EDL098001Message) newmessage;
					EDL098001Bean bean = new EDL098001Bean();
					res.setEDL098001(bean);
					bean.setH01USERID(msg.getH01USERID());
					bean.setH01PROGRM(msg.getH01PROGRM());
					bean.setH01TIMSYS(msg.getH01TIMSYS());
					bean.setH01SCRCOD(msg.getH01SCRCOD());
					bean.setH01OPECOD(msg.getH01OPECOD());
					bean.setH01FLGMAS(msg.getH01FLGMAS());
					bean.setH01FLGWK1(msg.getH01FLGWK1());
					bean.setH01FLGWK2(msg.getH01FLGWK2());
					bean.setH01FLGWK3(msg.getH01FLGWK3());
					bean.setE01DEAACC(msg.getE01DEAACC());
					bean.setE01DEAACD(msg.getE01DEAACD());
					bean.setE01DEAPRO(msg.getE01DEAPRO());
					bean.setE01DEACUN(msg.getE01DEACUN());
					bean.setE01CUSNA1(msg.getE01CUSNA1());
					bean.setE01DEABNK(msg.getE01DEABNK());
					bean.setE01DEABRN(msg.getE01DEABRN());
					bean.setE01DEACCY(msg.getE01DEACCY());
					bean.setE01DEAGLN(msg.getE01DEAGLN());
					bean.setE01DEACCN(msg.getE01DEACCN());
					bean.setE01DEATYP(msg.getE01DEATYP());
					bean.setE01DEAOAM(msg.getE01DEAOAM());
					bean.setE01DEARTE(msg.getE01DEARTE());
					bean.setE01DEABAS(msg.getE01DEABAS());
					bean.setE01DEAICT(msg.getE01DEAICT());
					bean.setE01OPEND1(msg.getE01OPEND1());
					bean.setE01OPEND2(msg.getE01OPEND2());
					bean.setE01OPEND3(msg.getE01OPEND3());
					bean.setE01MATUR1(msg.getE01MATUR1());
					bean.setE01MATUR2(msg.getE01MATUR2());
					bean.setE01MATUR3(msg.getE01MATUR3());
					bean.setE01LSTCL1(msg.getE01LSTCL1());
					bean.setE01LSTCL2(msg.getE01LSTCL2());
					bean.setE01LSTCL3(msg.getE01LSTCL3());
					bean.setE01DEASTS(msg.getE01DEASTS());
					bean.setE01DEATRM(msg.getE01DEATRM());
					bean.setE01DEATRC(msg.getE01DEATRC());
					bean.setE01DEAPDU(msg.getE01DEAPDU());
					bean.setE01DEAIDU(msg.getE01DEAIDU());
					bean.setE01DEATDU(msg.getE01DEATDU());
					bean.setE01DEAMEP(msg.getE01DEAMEP());
					bean.setE01DEATOT(msg.getE01DEATOT());
					bean.setE01DEAFRM(msg.getE01DEAFRM());
					bean.setE01DEAFRC(msg.getE01DEAFRC());
					bean.setE01APCDSC(msg.getE01APCDSC());
					bean.setE01DEATCP(msg.getE01DEATCP());
					bean.setE01DEATCV(msg.getE01DEATCV());
					bean.setE01DEAMPX(msg.getE01DEAMPX());
					bean.setE01DEAMPP(msg.getE01DEAMPP());
					bean.setE01DEAMPP1(msg.getE01DEAMPP1());
					bean.setE01DEAMPP2(msg.getE01DEAMPP2());
					bean.setE01DEAMPP3(msg.getE01DEAMPP3());
					bean.setE01DEAOAMR(msg.getE01DEAOAMR());
					bean.setE01DEAACCR(msg.getE01DEAACCR());
					bean.setE01DEAMEI(msg.getE01DEAMEI());
					bean.setE01DEAMEM(msg.getE01DEAMEM());
					bean.setE01DEADLC(msg.getE01DEADLC());
				}
			}
		}catch (Exception e) {
			log.error("EDL090001 - Crear/Modificar Limites - " + e.getMessage() + " - Canal " + req.getCanal(),e);
			throw new WSException(e);
		} finally {
			if (s != null)
				try {
					s.close();
				} catch (IOException e) {
				}
		}
		return res;
	}
	/**
	 * Servicio para Completar Cuenta 20 BancoActivo.
	 * @param req
	 * @return
	 * @throws WSException
	 */
	public EDL890101Response EDL890101(EDL890101Bean req) throws WSException{
		log.info("Invocando EDL890101");
		Socket s = null;
		EDL890101Response res = new EDL890101Response();
		try {
			Parametros params = new Parametros();
			MessageContext mc;
			s = new Socket(params.getString("ip"), params.getInt("port1")+1);
			s.setSoTimeout(params.getInt("timeout"));
			mc = new MessageContext(new DataInputStream(new BufferedInputStream(s.getInputStream())), new DataOutputStream(
					new BufferedOutputStream(s.getOutputStream())), "com.activo.gateway.dibs.messages");
			EDL890101Message message;
			message = (EDL890101Message) mc.getMessageRecord("EDL890101");
			if(req.getE01USERID() != null && !"".equals(req.getE01USERID()))message.setE01USERID(req.getE01USERID());
			if(req.getE01ACC010() != null && !"".equals(req.getE01ACC010()))message.setE01ACC010(req.getE01ACC010());
			if(req.getE01ACC020() != null && !"".equals(req.getE01ACC020()))message.setE01ACC020(req.getE01ACC020());
			message.send();
			message.destroy();
			MessageRecord newmessage = mc.receiveMessage();
			if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("0"))) {
				manejarError(res, ((ELEERRMessage) newmessage));
				log.error("EDL890101 - Completar Cuenta 20 " + " Error: "+ res.getError().getERNU01() + " - " + res.getError().getERDS01() + " - Canal " + req.getCanal());
				return res;
			}
			EDL890101Message newmessage2 = (EDL890101Message) newmessage;
			res.setEDL890101(new EDL890101Bean());
			res.getEDL890101().setE01USERID(newmessage2.getE01USERID());
			res.getEDL890101().setE01ACC010(newmessage2.getE01ACC010());
			res.getEDL890101().setE01ACC020(newmessage2.getE01ACC020());
		} catch (Exception e) {
			log.error("EDL890101 - Crear/Modificar Limites - " + e.getMessage() + " - Canal " + req.getCanal(),e);
			throw new WSException(e);
		} finally {
			if (s != null)
				try {
					s.close();
				} catch (IOException e) {
				}
		}
		return res;
	}
	/**
	 * Servicio para Consultar los Cheques Suspendidos, Cheques Disponibles.
	 * @param req
	 * @return
	 * @throws WSException
	 */
	public EDL890001Response EDL890001(EDL890001Bean req) throws WSException{
		log.info("Invocando EDL890001");
		Socket s = null;
		EDL890001Response res = new EDL890001Response();
		try {
			Parametros params = new Parametros();
			MessageContext mc;
			s = new Socket(params.getString("ip"), params.getInt("port1")+1);
			s.setSoTimeout(params.getInt("timeout"));
			mc = new MessageContext(new DataInputStream(new BufferedInputStream(s.getInputStream())), new DataOutputStream(
					new BufferedOutputStream(s.getOutputStream())), "com.activo.gateway.dibs.messages");
			EDL890001Message message;
			message = (EDL890001Message) mc.getMessageRecord("EDL890001");
			if(req.getE01USERID() != null && !"".equals(req.getE01USERID()))message.setE01USERID(req.getE01USERID());
			if(req.getE01CHMACC() != null && !"".equals(req.getE01CHMACC()))message.setE01CHMACC(req.getE01CHMACC());
			if(req.getE01CHMNTC() != null && !"".equals(req.getE01CHMNTC()))message.setE01CHMNTC(req.getE01CHMNTC());
			if(req.getE01CHMICK() != null && !"".equals(req.getE01CHMICK()))message.setE01CHMICK(req.getE01CHMICK());
			if(req.getE01CHMFCK() != null && !"".equals(req.getE01CHMFCK()))message.setE01CHMFCK(req.getE01CHMFCK());
			if(req.getE01CHMUCK() != null && !"".equals(req.getE01CHMUCK()))message.setE01CHMUCK(req.getE01CHMUCK());
			if(req.getE01CHMDCK() != null && !"".equals(req.getE01CHMDCK()))message.setE01CHMDCK(req.getE01CHMDCK());
			if(req.getE01CHMSCK() != null && !"".equals(req.getE01CHMSCK()))message.setE01CHMSCK(req.getE01CHMSCK());
			if(req.getE01CHMDEY() != null && !"".equals(req.getE01CHMDEY()))message.setE01CHMDEY(req.getE01CHMDEY());
			if(req.getE01CHMDEM() != null && !"".equals(req.getE01CHMDEM()))message.setE01CHMDEM(req.getE01CHMDEM());
			if(req.getE01CHMDED() != null && !"".equals(req.getE01CHMDED()))message.setE01CHMDED(req.getE01CHMDED());
			if(req.getE01CHMS01() != null && !"".equals(req.getE01CHMS01()))message.setE01CHMS01(req.getE01CHMS01());
			if(req.getE01CHMS02() != null && !"".equals(req.getE01CHMS02()))message.setE01CHMS02(req.getE01CHMS02());
			if(req.getE01CHMS03() != null && !"".equals(req.getE01CHMS03()))message.setE01CHMS03(req.getE01CHMS03());
			if(req.getE01CHMS04() != null && !"".equals(req.getE01CHMS04()))message.setE01CHMS04(req.getE01CHMS04());
			if(req.getE01CHMS05() != null && !"".equals(req.getE01CHMS05()))message.setE01CHMS05(req.getE01CHMS05());
			if(req.getE01CHMS06() != null && !"".equals(req.getE01CHMS06()))message.setE01CHMS06(req.getE01CHMS06());
			if(req.getE01CHMS07() != null && !"".equals(req.getE01CHMS07()))message.setE01CHMS07(req.getE01CHMS07());
			if(req.getE01CHMS08() != null && !"".equals(req.getE01CHMS08()))message.setE01CHMS08(req.getE01CHMS08());
			if(req.getE01CHMS09() != null && !"".equals(req.getE01CHMS09()))message.setE01CHMS09(req.getE01CHMS09());
			if(req.getE01CHMS10() != null && !"".equals(req.getE01CHMS10()))message.setE01CHMS10(req.getE01CHMS10());
			if(req.getE01CHMS11() != null && !"".equals(req.getE01CHMS11()))message.setE01CHMS11(req.getE01CHMS11());
			if(req.getE01CHMS12() != null && !"".equals(req.getE01CHMS12()))message.setE01CHMS12(req.getE01CHMS12());
			if(req.getE01CHMS13() != null && !"".equals(req.getE01CHMS13()))message.setE01CHMS13(req.getE01CHMS13());
			if(req.getE01CHMS14() != null && !"".equals(req.getE01CHMS14()))message.setE01CHMS14(req.getE01CHMS14());
			if(req.getE01CHMS15() != null && !"".equals(req.getE01CHMS15()))message.setE01CHMS15(req.getE01CHMS15());
			if(req.getE01CHMS16() != null && !"".equals(req.getE01CHMS16()))message.setE01CHMS16(req.getE01CHMS16());
			if(req.getE01CHMS17() != null && !"".equals(req.getE01CHMS17()))message.setE01CHMS17(req.getE01CHMS17());
			if(req.getE01CHMS18() != null && !"".equals(req.getE01CHMS18()))message.setE01CHMS18(req.getE01CHMS18());
			if(req.getE01CHMS19() != null && !"".equals(req.getE01CHMS19()))message.setE01CHMS19(req.getE01CHMS19());
			if(req.getE01CHMS20() != null && !"".equals(req.getE01CHMS20()))message.setE01CHMS20(req.getE01CHMS20());
			if(req.getE01CHMS21() != null && !"".equals(req.getE01CHMS21()))message.setE01CHMS21(req.getE01CHMS21());
			if(req.getE01CHMS22() != null && !"".equals(req.getE01CHMS22()))message.setE01CHMS22(req.getE01CHMS22());
			if(req.getE01CHMS23() != null && !"".equals(req.getE01CHMS23()))message.setE01CHMS23(req.getE01CHMS23());
			if(req.getE01CHMS24() != null && !"".equals(req.getE01CHMS24()))message.setE01CHMS24(req.getE01CHMS24());
			if(req.getE01CHMS25() != null && !"".equals(req.getE01CHMS25()))message.setE01CHMS25(req.getE01CHMS25());
			if(req.getE01CHMS26() != null && !"".equals(req.getE01CHMS26()))message.setE01CHMS26(req.getE01CHMS26());
			if(req.getE01CHMS27() != null && !"".equals(req.getE01CHMS27()))message.setE01CHMS27(req.getE01CHMS27());
			if(req.getE01CHMS28() != null && !"".equals(req.getE01CHMS28()))message.setE01CHMS28(req.getE01CHMS28());
			if(req.getE01CHMS29() != null && !"".equals(req.getE01CHMS29()))message.setE01CHMS29(req.getE01CHMS29());
			if(req.getE01CHMS30() != null && !"".equals(req.getE01CHMS30()))message.setE01CHMS30(req.getE01CHMS30());
			if(req.getE01CHMS31() != null && !"".equals(req.getE01CHMS31()))message.setE01CHMS31(req.getE01CHMS31());
			if(req.getE01CHMS32() != null && !"".equals(req.getE01CHMS32()))message.setE01CHMS32(req.getE01CHMS32());
			if(req.getE01CHMS33() != null && !"".equals(req.getE01CHMS33()))message.setE01CHMS33(req.getE01CHMS33());
			if(req.getE01CHMS34() != null && !"".equals(req.getE01CHMS34()))message.setE01CHMS34(req.getE01CHMS34());
			if(req.getE01CHMS35() != null && !"".equals(req.getE01CHMS35()))message.setE01CHMS35(req.getE01CHMS35());
			if(req.getE01CHMS36() != null && !"".equals(req.getE01CHMS36()))message.setE01CHMS36(req.getE01CHMS36());
			if(req.getE01CHMS37() != null && !"".equals(req.getE01CHMS37()))message.setE01CHMS37(req.getE01CHMS37());
			if(req.getE01CHMS38() != null && !"".equals(req.getE01CHMS38()))message.setE01CHMS38(req.getE01CHMS38());
			if(req.getE01CHMS39() != null && !"".equals(req.getE01CHMS39()))message.setE01CHMS39(req.getE01CHMS39());
			if(req.getE01CHMS40() != null && !"".equals(req.getE01CHMS40()))message.setE01CHMS40(req.getE01CHMS40());
			if(req.getE01CHMS41() != null && !"".equals(req.getE01CHMS41()))message.setE01CHMS41(req.getE01CHMS41());
			if(req.getE01CHMS42() != null && !"".equals(req.getE01CHMS42()))message.setE01CHMS42(req.getE01CHMS42());
			if(req.getE01CHMS43() != null && !"".equals(req.getE01CHMS43()))message.setE01CHMS43(req.getE01CHMS43());
			if(req.getE01CHMS44() != null && !"".equals(req.getE01CHMS44()))message.setE01CHMS44(req.getE01CHMS44());
			if(req.getE01CHMS45() != null && !"".equals(req.getE01CHMS45()))message.setE01CHMS45(req.getE01CHMS45());
			if(req.getE01CHMS46() != null && !"".equals(req.getE01CHMS46()))message.setE01CHMS46(req.getE01CHMS46());
			if(req.getE01CHMS47() != null && !"".equals(req.getE01CHMS47()))message.setE01CHMS47(req.getE01CHMS47());
			if(req.getE01CHMS48() != null && !"".equals(req.getE01CHMS48()))message.setE01CHMS48(req.getE01CHMS48());
			if(req.getE01CHMS49() != null && !"".equals(req.getE01CHMS49()))message.setE01CHMS49(req.getE01CHMS49());
			if(req.getE01CHMS50() != null && !"".equals(req.getE01CHMS50()))message.setE01CHMS50(req.getE01CHMS50());
			if(req.getE01CHMN01() != null && !"".equals(req.getE01CHMN01()))message.setE01CHMN01(req.getE01CHMN01());
			if(req.getE01CHMN02() != null && !"".equals(req.getE01CHMN02()))message.setE01CHMN02(req.getE01CHMN02());
			if(req.getE01CHMN03() != null && !"".equals(req.getE01CHMN03()))message.setE01CHMN03(req.getE01CHMN03());
			if(req.getE01CHMN04() != null && !"".equals(req.getE01CHMN04()))message.setE01CHMN04(req.getE01CHMN04());
			if(req.getE01CHMN05() != null && !"".equals(req.getE01CHMN05()))message.setE01CHMN05(req.getE01CHMN05());
			if(req.getE01CHMN06() != null && !"".equals(req.getE01CHMN06()))message.setE01CHMN06(req.getE01CHMN06());
			if(req.getE01CHMN07() != null && !"".equals(req.getE01CHMN07()))message.setE01CHMN07(req.getE01CHMN07());
			if(req.getE01CHMN08() != null && !"".equals(req.getE01CHMN08()))message.setE01CHMN08(req.getE01CHMN08());
			if(req.getE01CHMN09() != null && !"".equals(req.getE01CHMN09()))message.setE01CHMN09(req.getE01CHMN09());
			if(req.getE01CHMN10() != null && !"".equals(req.getE01CHMN10()))message.setE01CHMN10(req.getE01CHMN10());
			if(req.getE01CHMN11() != null && !"".equals(req.getE01CHMN11()))message.setE01CHMN11(req.getE01CHMN11());
			if(req.getE01CHMN12() != null && !"".equals(req.getE01CHMN12()))message.setE01CHMN12(req.getE01CHMN12());
			if(req.getE01CHMN13() != null && !"".equals(req.getE01CHMN13()))message.setE01CHMN13(req.getE01CHMN13());
			if(req.getE01CHMN14() != null && !"".equals(req.getE01CHMN14()))message.setE01CHMN14(req.getE01CHMN14());
			if(req.getE01CHMN15() != null && !"".equals(req.getE01CHMN15()))message.setE01CHMN15(req.getE01CHMN15());
			if(req.getE01CHMN16() != null && !"".equals(req.getE01CHMN16()))message.setE01CHMN16(req.getE01CHMN16());
			if(req.getE01CHMN17() != null && !"".equals(req.getE01CHMN17()))message.setE01CHMN17(req.getE01CHMN17());
			if(req.getE01CHMN18() != null && !"".equals(req.getE01CHMN18()))message.setE01CHMN18(req.getE01CHMN18());
			if(req.getE01CHMN19() != null && !"".equals(req.getE01CHMN19()))message.setE01CHMN19(req.getE01CHMN19());
			if(req.getE01CHMN20() != null && !"".equals(req.getE01CHMN20()))message.setE01CHMN20(req.getE01CHMN20());
			if(req.getE01CHMN21() != null && !"".equals(req.getE01CHMN21()))message.setE01CHMN21(req.getE01CHMN21());
			if(req.getE01CHMN22() != null && !"".equals(req.getE01CHMN22()))message.setE01CHMN22(req.getE01CHMN22());
			if(req.getE01CHMN23() != null && !"".equals(req.getE01CHMN23()))message.setE01CHMN23(req.getE01CHMN23());
			if(req.getE01CHMN24() != null && !"".equals(req.getE01CHMN24()))message.setE01CHMN24(req.getE01CHMN24());
			if(req.getE01CHMN25() != null && !"".equals(req.getE01CHMN25()))message.setE01CHMN25(req.getE01CHMN25());
			if(req.getE01CHMN26() != null && !"".equals(req.getE01CHMN26()))message.setE01CHMN26(req.getE01CHMN26());
			if(req.getE01CHMN27() != null && !"".equals(req.getE01CHMN27()))message.setE01CHMN27(req.getE01CHMN27());
			if(req.getE01CHMN28() != null && !"".equals(req.getE01CHMN28()))message.setE01CHMN28(req.getE01CHMN28());
			if(req.getE01CHMN29() != null && !"".equals(req.getE01CHMN29()))message.setE01CHMN29(req.getE01CHMN29());
			if(req.getE01CHMN30() != null && !"".equals(req.getE01CHMN30()))message.setE01CHMN30(req.getE01CHMN30());
			if(req.getE01CHMN31() != null && !"".equals(req.getE01CHMN31()))message.setE01CHMN31(req.getE01CHMN31());
			if(req.getE01CHMN32() != null && !"".equals(req.getE01CHMN32()))message.setE01CHMN32(req.getE01CHMN32());
			if(req.getE01CHMN33() != null && !"".equals(req.getE01CHMN33()))message.setE01CHMN33(req.getE01CHMN33());
			if(req.getE01CHMN34() != null && !"".equals(req.getE01CHMN34()))message.setE01CHMN34(req.getE01CHMN34());
			if(req.getE01CHMN35() != null && !"".equals(req.getE01CHMN35()))message.setE01CHMN35(req.getE01CHMN35());
			if(req.getE01CHMN36() != null && !"".equals(req.getE01CHMN36()))message.setE01CHMN36(req.getE01CHMN36());
			if(req.getE01CHMN37() != null && !"".equals(req.getE01CHMN37()))message.setE01CHMN37(req.getE01CHMN37());
			if(req.getE01CHMN38() != null && !"".equals(req.getE01CHMN38()))message.setE01CHMN38(req.getE01CHMN38());
			if(req.getE01CHMN39() != null && !"".equals(req.getE01CHMN39()))message.setE01CHMN39(req.getE01CHMN39());
			if(req.getE01CHMN40() != null && !"".equals(req.getE01CHMN40()))message.setE01CHMN40(req.getE01CHMN40());
			if(req.getE01CHMN41() != null && !"".equals(req.getE01CHMN41()))message.setE01CHMN41(req.getE01CHMN41());
			if(req.getE01CHMN42() != null && !"".equals(req.getE01CHMN42()))message.setE01CHMN42(req.getE01CHMN42());
			if(req.getE01CHMN43() != null && !"".equals(req.getE01CHMN43()))message.setE01CHMN43(req.getE01CHMN43());
			if(req.getE01CHMN44() != null && !"".equals(req.getE01CHMN44()))message.setE01CHMN44(req.getE01CHMN44());
			if(req.getE01CHMN45() != null && !"".equals(req.getE01CHMN45()))message.setE01CHMN45(req.getE01CHMN45());
			if(req.getE01CHMN46() != null && !"".equals(req.getE01CHMN46()))message.setE01CHMN46(req.getE01CHMN46());
			if(req.getE01CHMN47() != null && !"".equals(req.getE01CHMN47()))message.setE01CHMN47(req.getE01CHMN47());
			if(req.getE01CHMN48() != null && !"".equals(req.getE01CHMN48()))message.setE01CHMN48(req.getE01CHMN48());
			if(req.getE01CHMN49() != null && !"".equals(req.getE01CHMN49()))message.setE01CHMN49(req.getE01CHMN49());
			if(req.getE01CHMN50() != null && !"".equals(req.getE01CHMN50()))message.setE01CHMN50(req.getE01CHMN50());		
			message.send();
			message.destroy();
			MessageRecord newmessage = mc.receiveMessage();
			if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("0"))) {
				manejarError(res, ((ELEERRMessage) newmessage));
				return res;
			}else if (newmessage.getFormatName().equals("EDL890001")) {
				List<EDL890001Bean> x = new ArrayList<EDL890001Bean>();
				boolean GoIn = !((EDL890001Message) newmessage).getE01CHMS50().equals("*");
				while (GoIn) {
					EDL890001Bean bean = new EDL890001Bean();				
					bean.setE01USERID(((EDL890001Message)newmessage).getE01USERID());
					bean.setE01CHMACC(((EDL890001Message)newmessage).getE01CHMACC());
					bean.setE01CHMNTC(((EDL890001Message)newmessage).getE01CHMNTC());
					bean.setE01CHMICK(((EDL890001Message)newmessage).getE01CHMICK());
					bean.setE01CHMFCK(((EDL890001Message)newmessage).getE01CHMFCK());
					bean.setE01CHMUCK(((EDL890001Message)newmessage).getE01CHMUCK());
					bean.setE01CHMDCK(((EDL890001Message)newmessage).getE01CHMDCK());
					bean.setE01CHMSCK(((EDL890001Message)newmessage).getE01CHMSCK());
					bean.setE01CHMDEY(((EDL890001Message)newmessage).getE01CHMDEY());
					bean.setE01CHMDEM(((EDL890001Message)newmessage).getE01CHMDEM());
					bean.setE01CHMDED(((EDL890001Message)newmessage).getE01CHMDED());
					bean.setE01CHMS01(((EDL890001Message)newmessage).getE01CHMS01());
					bean.setE01CHMS02(((EDL890001Message)newmessage).getE01CHMS02());
					bean.setE01CHMS03(((EDL890001Message)newmessage).getE01CHMS03());
					bean.setE01CHMS04(((EDL890001Message)newmessage).getE01CHMS04());
					bean.setE01CHMS05(((EDL890001Message)newmessage).getE01CHMS05());
					bean.setE01CHMS06(((EDL890001Message)newmessage).getE01CHMS06());
					bean.setE01CHMS07(((EDL890001Message)newmessage).getE01CHMS07());
					bean.setE01CHMS08(((EDL890001Message)newmessage).getE01CHMS08());
					bean.setE01CHMS09(((EDL890001Message)newmessage).getE01CHMS09());
					bean.setE01CHMS10(((EDL890001Message)newmessage).getE01CHMS10());
					bean.setE01CHMS11(((EDL890001Message)newmessage).getE01CHMS11());
					bean.setE01CHMS12(((EDL890001Message)newmessage).getE01CHMS12());
					bean.setE01CHMS13(((EDL890001Message)newmessage).getE01CHMS13());
					bean.setE01CHMS14(((EDL890001Message)newmessage).getE01CHMS14());
					bean.setE01CHMS15(((EDL890001Message)newmessage).getE01CHMS15());
					bean.setE01CHMS16(((EDL890001Message)newmessage).getE01CHMS16());
					bean.setE01CHMS17(((EDL890001Message)newmessage).getE01CHMS17());
					bean.setE01CHMS18(((EDL890001Message)newmessage).getE01CHMS18());
					bean.setE01CHMS19(((EDL890001Message)newmessage).getE01CHMS19());
					bean.setE01CHMS20(((EDL890001Message)newmessage).getE01CHMS20());
					bean.setE01CHMS21(((EDL890001Message)newmessage).getE01CHMS21());
					bean.setE01CHMS22(((EDL890001Message)newmessage).getE01CHMS22());
					bean.setE01CHMS23(((EDL890001Message)newmessage).getE01CHMS23());
					bean.setE01CHMS24(((EDL890001Message)newmessage).getE01CHMS24());
					bean.setE01CHMS25(((EDL890001Message)newmessage).getE01CHMS25());
					bean.setE01CHMS26(((EDL890001Message)newmessage).getE01CHMS26());
					bean.setE01CHMS27(((EDL890001Message)newmessage).getE01CHMS27());
					bean.setE01CHMS28(((EDL890001Message)newmessage).getE01CHMS28());
					bean.setE01CHMS29(((EDL890001Message)newmessage).getE01CHMS29());
					bean.setE01CHMS30(((EDL890001Message)newmessage).getE01CHMS30());
					bean.setE01CHMS31(((EDL890001Message)newmessage).getE01CHMS31());
					bean.setE01CHMS32(((EDL890001Message)newmessage).getE01CHMS32());
					bean.setE01CHMS33(((EDL890001Message)newmessage).getE01CHMS33());
					bean.setE01CHMS34(((EDL890001Message)newmessage).getE01CHMS34());
					bean.setE01CHMS35(((EDL890001Message)newmessage).getE01CHMS35());
					bean.setE01CHMS36(((EDL890001Message)newmessage).getE01CHMS36());
					bean.setE01CHMS37(((EDL890001Message)newmessage).getE01CHMS37());
					bean.setE01CHMS38(((EDL890001Message)newmessage).getE01CHMS38());
					bean.setE01CHMS39(((EDL890001Message)newmessage).getE01CHMS39());
					bean.setE01CHMS40(((EDL890001Message)newmessage).getE01CHMS40());
					bean.setE01CHMS41(((EDL890001Message)newmessage).getE01CHMS41());
					bean.setE01CHMS42(((EDL890001Message)newmessage).getE01CHMS42());
					bean.setE01CHMS43(((EDL890001Message)newmessage).getE01CHMS43());
					bean.setE01CHMS44(((EDL890001Message)newmessage).getE01CHMS44());
					bean.setE01CHMS45(((EDL890001Message)newmessage).getE01CHMS45());
					bean.setE01CHMS46(((EDL890001Message)newmessage).getE01CHMS46());
					bean.setE01CHMS47(((EDL890001Message)newmessage).getE01CHMS47());
					bean.setE01CHMS48(((EDL890001Message)newmessage).getE01CHMS48());
					bean.setE01CHMS49(((EDL890001Message)newmessage).getE01CHMS49());
					bean.setE01CHMS50(((EDL890001Message)newmessage).getE01CHMS50());
					bean.setE01CHMN01(((EDL890001Message)newmessage).getE01CHMN01());
					bean.setE01CHMN02(((EDL890001Message)newmessage).getE01CHMN02());
					bean.setE01CHMN03(((EDL890001Message)newmessage).getE01CHMN03());
					bean.setE01CHMN04(((EDL890001Message)newmessage).getE01CHMN04());
					bean.setE01CHMN05(((EDL890001Message)newmessage).getE01CHMN05());
					bean.setE01CHMN06(((EDL890001Message)newmessage).getE01CHMN06());
					bean.setE01CHMN07(((EDL890001Message)newmessage).getE01CHMN07());
					bean.setE01CHMN08(((EDL890001Message)newmessage).getE01CHMN08());
					bean.setE01CHMN09(((EDL890001Message)newmessage).getE01CHMN09());
					bean.setE01CHMN10(((EDL890001Message)newmessage).getE01CHMN10());
					bean.setE01CHMN11(((EDL890001Message)newmessage).getE01CHMN11());
					bean.setE01CHMN12(((EDL890001Message)newmessage).getE01CHMN12());
					bean.setE01CHMN13(((EDL890001Message)newmessage).getE01CHMN13());
					bean.setE01CHMN14(((EDL890001Message)newmessage).getE01CHMN14());
					bean.setE01CHMN15(((EDL890001Message)newmessage).getE01CHMN15());
					bean.setE01CHMN16(((EDL890001Message)newmessage).getE01CHMN16());
					bean.setE01CHMN17(((EDL890001Message)newmessage).getE01CHMN17());
					bean.setE01CHMN18(((EDL890001Message)newmessage).getE01CHMN18());
					bean.setE01CHMN19(((EDL890001Message)newmessage).getE01CHMN19());
					bean.setE01CHMN20(((EDL890001Message)newmessage).getE01CHMN20());
					bean.setE01CHMN21(((EDL890001Message)newmessage).getE01CHMN21());
					bean.setE01CHMN22(((EDL890001Message)newmessage).getE01CHMN22());
					bean.setE01CHMN23(((EDL890001Message)newmessage).getE01CHMN23());
					bean.setE01CHMN24(((EDL890001Message)newmessage).getE01CHMN24());
					bean.setE01CHMN25(((EDL890001Message)newmessage).getE01CHMN25());
					bean.setE01CHMN26(((EDL890001Message)newmessage).getE01CHMN26());
					bean.setE01CHMN27(((EDL890001Message)newmessage).getE01CHMN27());
					bean.setE01CHMN28(((EDL890001Message)newmessage).getE01CHMN28());
					bean.setE01CHMN29(((EDL890001Message)newmessage).getE01CHMN29());
					bean.setE01CHMN30(((EDL890001Message)newmessage).getE01CHMN30());
					bean.setE01CHMN31(((EDL890001Message)newmessage).getE01CHMN31());
					bean.setE01CHMN32(((EDL890001Message)newmessage).getE01CHMN32());
					bean.setE01CHMN33(((EDL890001Message)newmessage).getE01CHMN33());
					bean.setE01CHMN34(((EDL890001Message)newmessage).getE01CHMN34());
					bean.setE01CHMN35(((EDL890001Message)newmessage).getE01CHMN35());
					bean.setE01CHMN36(((EDL890001Message)newmessage).getE01CHMN36());
					bean.setE01CHMN37(((EDL890001Message)newmessage).getE01CHMN37());
					bean.setE01CHMN38(((EDL890001Message)newmessage).getE01CHMN38());
					bean.setE01CHMN39(((EDL890001Message)newmessage).getE01CHMN39());
					bean.setE01CHMN40(((EDL890001Message)newmessage).getE01CHMN40());
					bean.setE01CHMN41(((EDL890001Message)newmessage).getE01CHMN41());
					bean.setE01CHMN42(((EDL890001Message)newmessage).getE01CHMN42());
					bean.setE01CHMN43(((EDL890001Message)newmessage).getE01CHMN43());
					bean.setE01CHMN44(((EDL890001Message)newmessage).getE01CHMN44());
					bean.setE01CHMN45(((EDL890001Message)newmessage).getE01CHMN45());
					bean.setE01CHMN46(((EDL890001Message)newmessage).getE01CHMN46());
					bean.setE01CHMN47(((EDL890001Message)newmessage).getE01CHMN47());
					bean.setE01CHMN48(((EDL890001Message)newmessage).getE01CHMN48());
					bean.setE01CHMN49(((EDL890001Message)newmessage).getE01CHMN49());
					bean.setE01CHMN50(((EDL890001Message)newmessage).getE01CHMN50());
					x.add(bean);
					newmessage = mc.receiveMessage();
					if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("0"))) {
						log.error("EDL890001 - Consulta Cheques Suspendidos: " + res.getError().getERNU01() + " - " + res.getError().getERDS01());
						manejarError(res, ((ELEERRMessage) newmessage));
						return res;
					}
					GoIn = !((EDL890001Message) newmessage).getE01CHMS50().equals("*");
				}
				res.setEDL890001(x.toArray(new EDL890001Bean[0]));
			}
		} catch (Exception e) {
			log.error(e);
			throw new WSException(e);
		} finally {
			if (s != null)
				try {
					s.close();
				} catch (IOException e) {
				}
		}
		return res;
	}
	/**
	 * Servicio para crear la contraseña.
	 * @param req
	 * @return
	 */
	public CambiarContrasenaResponse crearContrasena(CambiarContrasenaBean req){
		Parametros param = new Parametros();
		String canal = "IB";
		String canalCompleto = "Internet Banking";
		String mensaje = "30";
		String ip = "";
		String user_agent = "";
		Validador val = new Validador();
		val.setNroIdentificacion(req.getCedula());
		CambiarContrasenaResponse res = new CambiarContrasenaResponse();
		res.setError(new ELEERR());
		res.getError().setERRNUM("0");
		Database db = new Database();
		db.conectar();
		String nombreCompleto ="";
		try{
			NIBPF3010Bean req3010 = new NIBPF3010Bean();
			req3010.setCanal(req.getCanal());
			req3010.setNACIONALIDAD(req.getTipoCedula());
			req3010.setNROIDENTIFICACION(StringUtils.leftPad(req.getCedula(),12,'0'));
			req3010.setNROPARAM("1");
			NIBPF3010Response resNibpf3010 = null;
			try {
				resNibpf3010 = NIBPF3010(req3010);
				nombreCompleto = Crypto.crypt(resNibpf3010.getNIBPF3010().getPRIMERNOMBRE().trim() +' '+ resNibpf3010.getNIBPF3010().getSEGUNDONOMBRE().trim() + ' ' + resNibpf3010.getNIBPF3010().getPRIMERAPELLIDO().trim() + ' '+ resNibpf3010.getNIBPF3010().getSEGUNDOAPELLIDO().trim());
				if(resNibpf3010.getError()!=null){
					res.setError(resNibpf3010.getError());
					return res;
				}
				val.setDatosBasicos(resNibpf3010.getNIBPF3010());
			} catch (WSException e1) {
				res.getError().setERRNUM("1");
				res.getError().setERNU01("50682");
				res.getError().setERDS01(e1.getMessage());
				log.error(e1);
				return res;			
			}
			SUMDSJVBean reqSumdsjv = new SUMDSJVBean();
			reqSumdsjv.setSUMACN(resNibpf3010.getNIBPF3010().getIDENTIFICACIONIBS());
			reqSumdsjv.setSUMFIR("X");
			SUMDSJVResponse resSumdsjv = null;
			try {
				resSumdsjv = SUMDSJV(reqSumdsjv);
				if(resSumdsjv.getError()!=null){
					res.setError(resSumdsjv.getError());
					return res;
				}
				val.setCuentas(resSumdsjv.getSUMDSJV());
			} catch (WSException e1) {
				res.getError().setERRNUM("1");
				res.getError().setERNU01("50682");
				res.getError().setERDS01(e1.getMessage());
				log.error(e1);
				return res;
			}
			AdminService_ServiceLocator loc = new AdminService_ServiceLocator(new FileProvider("client_deploy.wsdd"));
			if(
					!val.contrasena(req.getCanal(), req.getContrasena()) ||
					!val.expiracionContrasena(req.getCanal(), req.getDiasExpiracion())
					){
				res.getError().setERRNUM("1");
				res.getError().setERNU01(val.getCodigoError());
				res.getError().setERDS01(val.getDescripcionError());				
			} else if(req.isConfirmada()){
				try {
					int idUsuario = db.crearUsuario(req.getTipoCedula(),req.getCedula(), req.getCanal(), nombreCompleto);
					if(idUsuario != 0){
						String url = param.getString("Idg_admin_url");
						AdminService_PortType adminService = loc.getAdminService(new URL(url));
						String userid = Crypto.decrypt(param.getString("Idg_group"))+"/"+req.getTipoCedula()+req.getCedula();
						try {
							UserGetCallParms userGetCallParms = new UserGetCallParms(userid, new UserGetParms());
							adminService.userGet(userGetCallParms);
						} catch(AdminServiceFault e){
							if("USER_NOT_EXIST".equals(e.getErrorCode())){
								UserCreateCallParms userCreateCallParms = new UserCreateCallParms();
								userCreateCallParms.setUserid(req.getTipoCedula()+req.getCedula());
								UserParms parms = new UserParms();
								parms.setGroup(Crypto.decrypt(param.getString("Idg_group")));
								userCreateCallParms.setParms(parms);
								adminService.userCreate(userCreateCallParms);
							} else {
								throw e;
							}
						}						
						UserPasswordCreateExCallParms p = new UserPasswordCreateExCallParms();
						p.setUserid(userid);
						if("1".equals(req.getCanal())){
							p.setPasswordName(Crypto.decrypt(param.getString("nombre_password_ivr")));
							canal = "IVR";
							canalCompleto = "Atencion Activa";
							ip = "00";	
							user_agent = "Call Center";
							mensaje = "55";
							db.insertarAuditoria(idUsuario, 100043, req.getCanal(), ip, user_agent, "Crear Contrasena");
						}
						UserPasswordParms parms = new UserPasswordParms();
						parms.setPassword(req.getContrasena());
						parms.setDaysToExpiry(req.getDiasExpiracion());
						parms.setChangeRequired(false);
						p.setParms(parms);
						adminService.userPasswordCreateEx(p);
						
						Calendar fecha = new GregorianCalendar();
				        int año = fecha.get(Calendar.YEAR);
				        int mes = fecha.get(Calendar.MONTH);
				        int dia = fecha.get(Calendar.DAY_OF_MONTH);
				        int hora = fecha.get(Calendar.HOUR_OF_DAY);
				        int minuto = fecha.get(Calendar.MINUTE);
				        int segundo = fecha.get(Calendar.SECOND);
				        String diaS = null;
				        String mesS = null;
				        String minutoS = null;
				        String horaS = null;
				        String segundoS = null;
						
				        if(dia<10) diaS = "0"+String.valueOf(dia);
				        else diaS = String.valueOf(dia);
				        if(mes+1<10) mesS = "0"+String.valueOf(mes+1);
				        else mesS = String.valueOf(mes+1);
				        if(hora<10) horaS = "0"+String.valueOf(hora);
				        else horaS = String.valueOf(hora);
				        if(minuto<10) minutoS = "0"+String.valueOf(minuto);
				        else minutoS = String.valueOf(minuto);
				        if(segundo<10) segundoS = "0"+String.valueOf(segundo);
				        else segundoS = String.valueOf(segundo);
				        
				        String fecha1 = String.valueOf(año)+mesS+diaS; 
						String hora1 =  horaS+minutoS+segundoS; 
						
						//ENVIO DE MENSAJE SMS
						if(resNibpf3010.getNIBPF3010().getNROCELULAR() != null && !"00000000000".equals(resNibpf3010.getNIBPF3010().getNROCELULAR().trim())){
							// Enviamos el SMS si tiene numero de celular
							SmsSP sms = new SmsSP();
							
							sms.setCanal1(mensaje);
							sms.setNumcel(resNibpf3010.getNIBPF3010().getNROCELULAR());
							sms.setXrnde38(canal);
							sms.setFectim(canalCompleto);
							sms.setFecha(fecha1);
							sms.setHora(hora1);
							
							if(!sms.enviaSms()){
								log.error("crearContrasena - Error de envío SMS para el usuario: "+ req.getCedula());
							}
						} else {
							res.getError().setERRNUM("1");
							res.getError().setERNU01("2");
							res.getError().setERDS01("crearContrasena - Cliente no posee info para el envío del SMS: "+ req.getCedula());
						}
					}
				} catch (ServiceException e) {
					res.getError().setERRNUM("1");
					res.getError().setERNU01("90027");
					res.getError().setERDS01(e.getMessage());
					log.error(e);
				} catch (AdminServiceFault e) {
					res.getError().setERRNUM("1");
					res.getError().setERNU01(e.getInternalCode());
					res.getError().setERDS01(e.getErrorMessage());
					log.error(e);
				} catch (RemoteException e) {
					res.getError().setERRNUM("1");
					res.getError().setERNU01("99447");
					res.getError().setERDS01(e.getMessage());
					log.error(e);
				} catch (MalformedURLException e) {
					res.getError().setERRNUM("1");
					res.getError().setERNU01("30137");
					res.getError().setERDS01(e.getMessage());
					log.error(e);
				} catch (SQLException e) {
					res.getError().setERRNUM("1");
					res.getError().setERNU01("60962");
					res.getError().setERDS01(e.getMessage());
					log.error(e);
				}
			}
		} finally {
			db.cerrar();
		}
		return res;
	}
	/**
	 * Servicio para cambiar la contraseña.
	 * @param req
	 * @return
	 */
	public CambiarContrasenaResponse cambiarContrasena(CambiarContrasenaBean req){
		Parametros param = new Parametros();
		String canal = "IB";
		String canalCompleto = "Internet Banking";
		int idUsuario;
		String ip = "";
		String mensaje = "18";
		String user_agent = "";
		
		Validador val = new Validador();
		val.setNroIdentificacion(req.getCedula());
		CambiarContrasenaResponse res = new CambiarContrasenaResponse();
		res.setError(new ELEERR());
		res.getError().setERRNUM("0");
		Database db = new Database();
		db.conectar();
		try{
			NIBPF3010Bean req3010 = new NIBPF3010Bean();
			req3010.setCanal(req.getCanal());
			req3010.setNACIONALIDAD(req.getTipoCedula());
			req3010.setNROIDENTIFICACION(StringUtils.leftPad(req.getCedula(),12,'0'));
			req3010.setNROPARAM("1");
			NIBPF3010Response resNibpf3010 = null;
			try {
				resNibpf3010 = NIBPF3010(req3010);
				if(resNibpf3010.getError()!=null){
					res.setError(resNibpf3010.getError());
					return res;
				}
				val.setDatosBasicos(resNibpf3010.getNIBPF3010());
			} catch (WSException e1) {
				res.getError().setERRNUM("1");
				res.getError().setERNU01("50682");
				res.getError().setERDS01(e1.getMessage());
				log.error(e1);
				return res;			
			}
			SUMDSJVBean reqSumdsjv = new SUMDSJVBean();
			reqSumdsjv.setSUMACN(resNibpf3010.getNIBPF3010().getIDENTIFICACIONIBS());
			reqSumdsjv.setSUMFIR("X");
			SUMDSJVResponse resSumdsjv = null;
			try {
				resSumdsjv = SUMDSJV(reqSumdsjv);
				if(resSumdsjv.getError()!=null){
					res.setError(resSumdsjv.getError());
					return res;
				}
				val.setCuentas(resSumdsjv.getSUMDSJV());
			} catch (WSException e1) {
				res.getError().setERRNUM("1");
				res.getError().setERNU01("50682");
				res.getError().setERDS01(e1.getMessage());
				log.error(e1);
				return res;
			}
			try {
				Usuario[] usuario = db.buscarUsuario(req.getTipoCedula(), req.getCedula(), req.getCanal(), null);
				if(usuario.length!=1){
					res.getError().setERRNUM("1");
					res.getError().setERNU01("-3");
					res.getError().setERDS01("Usuario no existe");
					log.error(res.getError().getERDS01());
					return res;
				} else{ 
					idUsuario = usuario[0].getId();
					
					if(!"A".equals(usuario[0].getEstatusRegistro())){
						res.getError().setERRNUM("1");
						res.getError().setERNU01("-4");
						res.getError().setERDS01("Usuario no registrado");
	
						log.error(res.getError().getERDS01());
	
						return res;
					}
				}
			} catch (SQLException e) {
				res.getError().setERRNUM("1");
				res.getError().setERNU01("60962");
				res.getError().setERDS01(e.getMessage());
				log.error(e);
				return res;
			}		
			AdminService_ServiceLocator loc = new AdminService_ServiceLocator(new FileProvider("client_deploy.wsdd"));
			if(
					!val.contrasena(req.getCanal(), req.getContrasena()) ||
					!val.expiracionContrasena(req.getCanal(), req.getDiasExpiracion())
					){
				res.getError().setERRNUM("1");
				res.getError().setERNU01(val.getCodigoError());
				res.getError().setERDS01(val.getDescripcionError());				
			} else if(req.isConfirmada()){
				try {
					AdminService_PortType adminService = loc.getAdminService(new URL(param.getString("Idg_admin_url")));
					UserPasswordSetExCallParms p = new UserPasswordSetExCallParms();
					p.setUserid(Crypto.decrypt(param.getString("Idg_group"))+"/"+req.getTipoCedula()+req.getCedula());
					if("1".equals(req.getCanal())){
						p.setPasswordName(Crypto.decrypt(param.getString("nombre_password_ivr")));
						canal = "IVR";
						canalCompleto = "Atencion Activa";
						mensaje = "56";
						ip = "00";	
						user_agent = "Call Center";
						db.insertarAuditoria(idUsuario, 15, req.getCanal(), ip, user_agent, "Cambiar Contrasena");
					}
					UserPasswordParms parms = new UserPasswordParms();
					parms.setPassword(req.getContrasena());
					parms.setDaysToExpiry(req.getDiasExpiracion());
					parms.setChangeRequired(false);
					p.setParms(parms);
					adminService.userPasswordSetEx(p);
					
					Calendar fecha = new GregorianCalendar();
			        int año = fecha.get(Calendar.YEAR);
			        int mes = fecha.get(Calendar.MONTH);
			        int dia = fecha.get(Calendar.DAY_OF_MONTH);
			        int hora = fecha.get(Calendar.HOUR_OF_DAY);
			        int minuto = fecha.get(Calendar.MINUTE);
			        int segundo = fecha.get(Calendar.SECOND);
			        String diaS = null;
			        String mesS = null;
			        String minutoS = null;
			        String horaS = null;
			        String segundoS = null;
					
			        if(dia<10) diaS = "0"+String.valueOf(dia);
			        else diaS = String.valueOf(dia);
			        if(mes+1<10) mesS = "0"+String.valueOf(mes+1);
			        else mesS = String.valueOf(mes+1);
			        if(hora<10) horaS = "0"+String.valueOf(hora);
			        else horaS = String.valueOf(hora);
			        if(minuto<10) minutoS = "0"+String.valueOf(minuto);
			        else minutoS = String.valueOf(minuto);
			        if(segundo<10) segundoS = "0"+String.valueOf(segundo);
			        else segundoS = String.valueOf(segundo);
			        
			        String fecha1 = String.valueOf(año)+mesS+diaS; 
					String hora1 =  horaS+minutoS+segundoS; 
										
					//ENVIO DE MENSAJE SMS
					if(resNibpf3010.getNIBPF3010().getNROCELULAR() != null && !"00000000000".equals(resNibpf3010.getNIBPF3010().getNROCELULAR().trim())){
						// Enviamos el SMS si tiene numero de celular
						SmsSP sms = new SmsSP();
						sms.setCanal1(mensaje);
						sms.setNumcel(resNibpf3010.getNIBPF3010().getNROCELULAR());
						sms.setXrnde38(canal);
						sms.setFectim(canalCompleto);
						sms.setFecha(fecha1);
						sms.setHora(hora1);
						if(!sms.enviaSms()){
							log.error("cambiarContrasena - Error de envío SMS para el usuario: "+ req.getCedula());
						}
					} else {
						res.getError().setERRNUM("1");
						res.getError().setERNU01("2");
						res.getError().setERDS01("cambiarContrasena - Cliente no posee info para el envío del SMS: "+ req.getCedula());
					}
					
					
				} catch (ServiceException e) {
					res.getError().setERRNUM("1");
					res.getError().setERNU01("90027");
					res.getError().setERDS01(e.getMessage());
					log.error(e);
				} catch (AdminServiceFault e) {
					res.getError().setERRNUM("1");
					res.getError().setERNU01(e.getInternalCode());
					res.getError().setERDS01(e.getErrorMessage());
					log.error(e);
				} catch (RemoteException e) {
					res.getError().setERRNUM("1");
					res.getError().setERNU01("99447");
					res.getError().setERDS01(e.getMessage());
					log.error(e);
				} catch (MalformedURLException e) {
					res.getError().setERRNUM("1");
					res.getError().setERNU01("30137");
					res.getError().setERDS01(e.getMessage());
					log.error(e);
				}
			}
		}finally{
			db.cerrar();
		}
		return res;
	}
	/**
	 * Realiza la busqueda de las preguntas de autenticacion de un cliente 
	 * 
	 * @param PreguntasAutenticacionBean req 
	 * @return PreguntasAutenticacionResponse res
	 * @throws WSException
	 */
	public PreguntasAutenticacionResponse PREG0AUT(PreguntasAutenticacionBean req) throws WSException{
		log.info("Invocando PREG0AUT");
		PreguntasAutenticacionResponse res = new PreguntasAutenticacionResponse();
                String tdd = "";
		if(req.getCantidad()==0 || req.getNacionalidad()==null || req.getNumeroIdentificacion()==null){
			return res;
		}
		res.setError(new ELEERR());
		res.getError().setERRNUM("0");		
		Database db = new Database();
		// Conexion a la base de datos
		if(db.conectar()){
			try {
                                //Invocando datos basicos
                                NIBPF3010Bean req3010 = new NIBPF3010Bean();
				req3010.setCanal(req.getCanal());
				req3010.setNACIONALIDAD(req.getNacionalidad());
				req3010.setNROIDENTIFICACION(StringUtils.leftPad(req.getNumeroIdentificacion(),12,'0'));
				req3010.setNROPARAM("1");
				NIBPF3010Response resNibpf3010 = null;
				try {
                                    resNibpf3010 = NIBPF3010(req3010);
                                    if(resNibpf3010.getError()==null){
                                        tdd = resNibpf3010.getNIBPF3010().getTDD().trim();
                                    }					
				} catch (WSException e1) {
                                    res.getError().setERRNUM("1");
                                    res.getError().setERNU01("50682");
                                    res.getError().setERDS01(e1.getMessage());
                                    log.error(e1);
                                    return res;			
				}
                                
				// Invocacion del servicio
				NIBPF3000Bean reqPreg = new NIBPF3000Bean();
				reqPreg.setCanal(req.getCanal());
				reqPreg.setNACIONALIDAD(req.getNacionalidad());
				reqPreg.setNROIDENTIFICACION(StringUtils.leftPad(req.getNumeroIdentificacion(),12,'0'));
				NIBPF3000Response respPreg = this.NIBPF3000(reqPreg);
				if(respPreg.getError() == null){
					NIBPF3000Bean[] array_preg = respPreg.getPreguntas();
					List<PreguntasBean> preguntas = new ArrayList<PreguntasBean>();
					List<PreguntasBean> preguntasTemp = new ArrayList<PreguntasBean>();
					List<PreguntasBean> subpreguntas = new ArrayList<PreguntasBean>();
					Map<String, PreguntasBean> preguntasDb = db.obtenerPreguntas();
					// Recorre cada pregunta del servicio
					for (NIBPF3000Bean p : array_preg) {
						// Busca la informacion en la base de datos
						PreguntasBean preg = preguntasDb.get(p.getNROPREGUNTA());
						// ignorar la pregunta si no esta en bd
						if(preg==null) continue; 
						// ignorar la pregunta si no está activa
						if(!"a".equals(preg.getEstatus())) continue; 
						PreguntasBean preg2 = new PreguntasBean();
						preg2.setCodigo(preg.getCodigo());
						preg2.setCodigoPadre(preg.getCodigoPadre());
						preg2.setTipoRespuesta(preg.getTipoRespuesta());
						preg2.setFormularioMaxlength(preg.getFormularioMaxlength());
						preg2.setFormularioTipo(preg.getFormularioTipo());
						preg2.setPregunta(preg.getPregunta());
						preg2.setEstatus(preg.getEstatus());
						// Completa la pregunta dependiendo del tipo
						if(p.getNROPREGUNTA().equals("001")){
							String nuevaFecha = p.getFechaNacimiento().substring(0, 6)+p.getFechaNacimiento().substring(8);
							String texto = String.format(preg.getPregunta().trim(), nuevaFecha);
							preg2.setPregunta(texto);
							preg2.setTipoRespuesta(p.getTIPORESPUESTA());
							preg2.setVariable(p.getFechaNacimiento().substring(0, 6)+p.getFechaNacimiento().substring(8));
							preguntasTemp.add(preg2);
						}else if(p.getNROPREGUNTA().equals("002")){
							if("1".equals(req.getCanal())) continue;
							String texto = String.format(preg.getPregunta().trim(), p.getDirEstadoCuenta().trim());
							preg2.setPregunta(texto);
							preg2.setTipoRespuesta(p.getTIPORESPUESTA());
							preguntasTemp.add(preg2);
						}else if(p.getNROPREGUNTA().equals("003")){
							if("1".equals(req.getCanal())) continue;
							String texto = String.format(preg.getPregunta().trim(), p.getDirEstadoCuentaTDC().trim());
							preg2.setPregunta(texto);
							preg2.setTipoRespuesta(p.getTIPORESPUESTA());
							preguntasTemp.add(preg2);
						}else if(p.getNROPREGUNTA().equals("004")){
							String cta = p.getNroCtaAhorro().trim();
							cta = cta.substring(0,4)+"******"+cta.substring(cta.length()-4);
							String texto = String.format(preg.getPregunta().trim(), cta );
							preg2.setPregunta(texto);							
							preg2.setTipoRespuesta(p.getTIPORESPUESTA());
							preg2.setVariable(cta.substring(cta.length()-4));
							preguntasTemp.add(preg2);
						}else if(p.getNROPREGUNTA().equals("005")){
							String cta = p.getNroCtaCte().trim();
							cta = cta.substring(0,4)+"******"+cta.substring(cta.length()-4);
							String texto = String.format(preg.getPregunta().trim(), cta );
							preg2.setPregunta(texto);							
							preg2.setTipoRespuesta(p.getTIPORESPUESTA());
							preg2.setVariable(cta.substring(cta.length()-4));
							preguntasTemp.add(preg2);
						}else if(p.getNROPREGUNTA().equals("010")){							
							if("".equals(tdd)) continue;
							preg2.setTipoRespuesta(p.getTIPORESPUESTA());
							preguntasTemp.add(preg2);
						}else if(
                                                    p.getNROPREGUNTA().equals("006") || p.getNROPREGUNTA().equals("007") || 
                                                    p.getNROPREGUNTA().equals("008") || p.getNROPREGUNTA().equals("009") || 
                                                    p.getNROPREGUNTA().equals("015") ||
                                                    p.getNROPREGUNTA().equals("016") || p.getNROPREGUNTA().equals("017") ||
                                                    p.getNROPREGUNTA().equals("018") || p.getNROPREGUNTA().equals("019") ||
                                                    p.getNROPREGUNTA().equals("020") || p.getNROPREGUNTA().equals("021") ||
                                                    p.getNROPREGUNTA().equals("024") || p.getNROPREGUNTA().equals("025") ||
                                                    p.getNROPREGUNTA().equals("026") || p.getNROPREGUNTA().equals("027")){
							preg2.setTipoRespuesta(p.getTIPORESPUESTA());
							preguntasTemp.add(preg2);
						}else if(p.getNROPREGUNTA().equals("011")){
							String cadena = p.getNroTlfCelular().trim();
							if("00000000000".equals(cadena)) continue;
							String texto = String.format(preg.getPregunta().trim(), cadena.substring(cadena.length()-4));
							preg2.setPregunta(texto);
							preg2.setTipoRespuesta(p.getTIPORESPUESTA());
							preg2.setVariable(cadena.substring(cadena.length()-4));
							preguntasTemp.add(preg2);
						}else if(p.getNROPREGUNTA().equals("012")){
							String cadena = p.getNroTlfOficina().trim();
							if("00000000000".equals(cadena)) continue;
							String texto = String.format(preg.getPregunta().trim(), cadena.substring(cadena.length()-4));
							preg2.setPregunta(texto);
							preg2.setTipoRespuesta(p.getTIPORESPUESTA());
							preg2.setVariable(cadena.substring(cadena.length()-4));
							preguntasTemp.add(preg2);
						}else if(p.getNROPREGUNTA().equals("013")){
							String cadena = p.getNroTlfResidencia().trim();
							if("00000000000".equals(cadena)) continue;
							String texto = String.format(preg.getPregunta().trim(), cadena.substring(cadena.length()-4));
							preg2.setPregunta(texto);
							preg2.setTipoRespuesta(p.getTIPORESPUESTA());
							preg2.setVariable(cadena.substring(cadena.length()-4));
							preguntasTemp.add(preg2);
						}else if(p.getNROPREGUNTA().equals("014")){
							if("1".equals(req.getCanal())) continue;
							String texto = String.format(preg.getPregunta().trim(), p.getNombreOfcApertura().trim());
							preg2.setPregunta(texto);
							preg2.setTipoRespuesta(p.getTIPORESPUESTA());
							preguntasTemp.add(preg2);
						}else if(p.getNROPREGUNTA().equals("022")){
							String cta = p.getNroCtaCte().trim();
							cta = cta.substring(0,4)+"******"+cta.substring(cta.length()-4);
							String texto = String.format(preg.getPregunta().trim(), cta);
							preg2.setPregunta(texto);							
							preg2.setTipoRespuesta(p.getTIPORESPUESTA());
							preg2.setVariable(cta.substring(cta.length()-4));
							preguntasTemp.add(preg2);
						}else if(p.getNROPREGUNTA().equals("023")){
							String cta = p.getNroCtaAhorro().trim();
							cta = cta.substring(0,4)+"******"+cta.substring(cta.length()-4);
							String texto = String.format(preg.getPregunta().trim(), cta);
							preg2.setPregunta(texto);							
							preg2.setTipoRespuesta(p.getTIPORESPUESTA());
							preg2.setVariable(cta.substring(cta.length()-4));
							preguntasTemp.add(preg2);
						}else{ // Subpreguntas
                                                        if("10A".equals(preg.getCodigo()) || "10B".equals(preg.getCodigo())){
                                                            if(!"".equals(tdd)){
                                                                preg2.setTipoRespuesta(p.getTIPORESPUESTA());
                                                                subpreguntas.add(preg2);
                                                            }                                                            
                                                        }else if(!"07B".equals(preg.getCodigo()) || p.getCheques().length > 0){
                                                            preg2.setTipoRespuesta(p.getTIPORESPUESTA());
                                                            subpreguntas.add(preg2);
							}
						}
					}
					// Hacer un filtro para corregir un error en el AS400
					// ya que para la pregunta 014 puede traer la versión falsa con
					// el mismo valor que la versión verdadera
					Iterator<PreguntasBean> it = preguntasTemp.iterator();
					while(it.hasNext()){
						PreguntasBean p = it.next();
						if("014".equals(p.getCodigo()) && "F".equals(p.getTipoRespuesta())){
							boolean encontrado = false;
							for(PreguntasBean p2 : preguntasTemp){
								if(
										"014".equals(p2.getCodigo()) &&
										"V".equals(p2.getTipoRespuesta()) &&
										p2.getPregunta().equals(p.getPregunta())
										){
									encontrado = true;
									break;
								}
							}
							if(encontrado){
								it.remove();
							}
						}
					}					
					// Verifica si el usuario fallo la autenticacion con anterioridad
					// En caso de que hubiera fallado antes se devuelve las mismas preguntas
					List<PreguntasBean> preguntasFalladas = db.obtenerPreguntasFallidas(req.getNacionalidad(), req.getNumeroIdentificacion());
					int totalAgregadas = 0;
					if(preguntasFalladas!=null && preguntasFalladas.size()>0){	
						// Recorre las preguntas fallidas
						for(PreguntasBean x : preguntasFalladas){
							// Verifica la cantidad agregada
							if(totalAgregadas < req.getCantidad()){
								// Buscar la pregunta por codigo y tipo
								for(PreguntasBean y : preguntasTemp){								
									if(
											x.getCodigo().equals(y.getCodigo()) &&
											x.getTipoRespuesta().equals(y.getTipoRespuesta())
											){
										preguntas.add(y);
										totalAgregadas++;
										break;
									}
								}
							}
							// verifica si ya existen preguntas agregadas
							if(preguntas.size() > 0){
								PreguntasBean temp = null;
								// recorre las preguntas
								for (PreguntasBean p : preguntas){
									// recorre las subpreguntas
									for (PreguntasBean sub : subpreguntas) {
										// verifica que el padre haya sido agregado y se encuentre como fallida
										if(sub.getCodigoPadre().equals(p.getCodigo()) 
												&& sub.getCodigo().equals(x.getCodigo()) 
												&& sub.getTipoRespuesta().equals(x.getTipoRespuesta())){
											temp = sub;
											break;
										}
									}
								}
								if(temp!= null) preguntas.add(temp);
							}
						}
					}
					// Completar las preguntas en caso de que sea necesario
					Collections.shuffle(preguntasTemp);
					Collections.shuffle(subpreguntas);
					for(PreguntasBean p : preguntasTemp){
						if(totalAgregadas >= req.getCantidad()) break;
						boolean yaAgregada = false;
						// Verifica si ya esta incluida la pregunta
						for(PreguntasBean x : preguntas){
							if(x.getCodigo().equals(p.getCodigo())){
								yaAgregada = true;
								break;
							}
						}
						// En caso de no estar includa, la agrega
						if(!yaAgregada){
							// Agrega la pregunta
							preguntas.add(p);
							totalAgregadas++;
							// Verifica si tiene una subpregunta y agregarla
							for (PreguntasBean  sub : subpreguntas) {
								if(p.getCodigo().equals(sub.getCodigoPadre())){
									preguntas.add(sub);
									break;
								}
							}
						}
					}
					//Collections.shuffle(preguntas);
					// Asigna la respuesta
					res.setPreguntas(preguntas.toArray(new PreguntasBean[0]));
				} else {
					res.getError().setERRNUM(respPreg.getError().getERRNUM());
					res.getError().setERNU01(respPreg.getError().getERNU01());
					res.getError().setERDS01(respPreg.getError().getERDS01());
				}
			} catch (SQLException e) {
				res.getError().setERRNUM("1");
				res.getError().setERNU01("-2");
				res.getError().setERDS01("Error al tratar de buscar las preguntas de autenticacion");
				log.error(e);
			} finally{
				// Cierre de la conexion
				db.cerrar();
			}
		} else { // error al conectar
			res.getError().setERRNUM("1");
			res.getError().setERNU01("-1");
			res.getError().setERDS01("Error en la conexión");
		}
		if("0".equals(res.getError().getERRNUM())){
			res.setError(null);
		}
		// Fin de la invocacion
		log.info("Fin invocacion PREG0AUT");
		return res;
	}
	/**
	 * Verifica las preguntas de autenticacion 
	 * 
	 * @param VerificarPreguntasAutenticacionBean req
	 * @return PreguntasAutenticacionResponse res
	 * @throws WSException
	 */
	public PreguntasAutenticacionResponse CHECK0PREG0AUT(VerificarPreguntasAutenticacionBean req) throws WSException{
		log.info("Invocando CHECK0PREG0AUT");
		PreguntasAutenticacionResponse res = new PreguntasAutenticacionResponse();
		if(req.getRespuestas()==null  || req.getNacionalidad()==null || req.getNumeroIdentificacion()==null){
			return res;
		}
		ELEERRMessage error = new ELEERRMessage();
		Database db = new Database();
		String respTemp = "";
		boolean flagResp = false;
		// Conexion a la base de datos
		if(db.conectar()){
			try{
				// Invocacion del servicio
				NIBPF3000Bean reqPreg = new NIBPF3000Bean();
				reqPreg.setCanal(req.getCanal());
				reqPreg.setNACIONALIDAD(req.getNacionalidad());
				reqPreg.setNROIDENTIFICACION(StringUtils.leftPad(req.getNumeroIdentificacion(),12,'0'));
				NIBPF3000Response respPreg = this.NIBPF3000(reqPreg);
				if(respPreg.getError() == null){
					NIBPF3000Bean[] array_preg = respPreg.getPreguntas();
					PreguntasBean[] array_resp = req.getRespuestas();
					// Recorre cada respuesta
					for(PreguntasBean r : array_resp){
						// Recorre cada pregunta del servicio
						for (NIBPF3000Bean p : array_preg) {
							// Si el codigo es diferente continua con la siguiente pregunta
							if(!r.getCodigo().equals(p.getNROPREGUNTA()) || !r.getTipoRespuesta().equals(p.getTIPORESPUESTA()) ) continue;
							// Verifica el tipo de respuesta
							if( 
									r.getCodigo().equals("001") || r.getCodigo().equals("002") || 
									r.getCodigo().equals("003") || r.getCodigo().equals("011") || 
									r.getCodigo().equals("012") || r.getCodigo().equals("013") || 
									r.getCodigo().equals("014") || r.getCodigo().equals("015") || 
									r.getCodigo().equals("016") || r.getCodigo().equals("017") ||
									r.getCodigo().equals("018") || r.getCodigo().equals("019") ||
									r.getCodigo().equals("020") || r.getCodigo().equals("021") ||
									r.getCodigo().equals("024") || r.getCodigo().equals("025") ||
									r.getCodigo().equals("026") || r.getCodigo().equals("027")){
								respTemp = "V".equals(p.getTIPORESPUESTA()) ? "S" : "N";
								flagResp = r.getRespuesta().toUpperCase().equals(respTemp);
							} else if(
									r.getCodigo().equals("006") || r.getCodigo().equals("007") || 
									r.getCodigo().equals("008") || r.getCodigo().equals("009") || 
									r.getCodigo().equals("010")
									){
								respTemp = p.getRESPUESTA().trim();
								flagResp = r.getRespuesta().toUpperCase().equals(respTemp);
							} else if( r.getCodigo().equals("004") ) {
								respTemp = p.getCotitularesCtaAhorro().trim();
								if("V".equals(p.getTIPORESPUESTA()) && r.getRespuesta().toUpperCase().equals(respTemp)){
									flagResp = true;
								} else if("F".equals(p.getTIPORESPUESTA()) && r.getRespuesta().toUpperCase().equals("N")){
									flagResp = true;
								} else {
									flagResp = false;
								}
							} else if( r.getCodigo().equals("005") ) {
								respTemp = p.getCotitularesCtaCte().trim();
								if("V".equals(p.getTIPORESPUESTA()) && r.getRespuesta().toUpperCase().equals(respTemp)){
									flagResp = true;
								} else if("F".equals(p.getTIPORESPUESTA()) && r.getRespuesta().toUpperCase().equals("N")){
									flagResp = true;
								} else {
									flagResp = false;
								}
							} else if( r.getCodigo().equals("022") ||  r.getCodigo().equals("023")) {
								respTemp = p.getRESPUESTA().substring(21,22).trim().toUpperCase();
								if("V".equals(p.getTIPORESPUESTA()) && r.getRespuesta().toUpperCase().equals(respTemp)){
									flagResp = true;
								} else if("F".equals(p.getTIPORESPUESTA()) && r.getRespuesta().toUpperCase().equals("N")){
									flagResp = true;
								} else {
									flagResp = false;
								}
							} else if(
									r.getCodigo().equals("06A") || 
									r.getCodigo().equals("07A") ||  
									r.getCodigo().equals("08A") || r.getCodigo().equals("08B") ||
									r.getCodigo().equals("09A") || r.getCodigo().equals("09B") ||
									r.getCodigo().equals("10A") || r.getCodigo().equals("10B")
									){
								respTemp = p.getRESPUESTA().trim();
								flagResp = r.getRespuesta().equals(respTemp);
							} else if( r.getCodigo().equals("06B") ){ 								
								try{
									int r1 = Integer.parseInt(p.getRESPUESTA().trim());
									int r2 = Integer.parseInt(r.getRespuesta());
									flagResp = r1 == r2;
								} catch(NumberFormatException ex){
									flagResp = false;
								}
							} else if(r.getCodigo().equals("07B")){
								// Verifica el numero de cheque
								String[] cheques = p.getCheques();
								for(int i=0; i<cheques.length; i++){
									flagResp = cheques[i].equals(r.getRespuesta());
									if(flagResp) break;
								}
							}
							if(flagResp) break;
						}	
						// si la respuesta es incorrecta no sigue con el recorrido
						if(!flagResp) break;
					}
					if(flagResp){
						error.setERRNUM("0");
						try {
							db.eliminarPreguntasFallidas(req.getNacionalidad(), req.getNumeroIdentificacion());
						} catch (SQLException e) {
							error.setERRNUM("1");
							error.setERNU01("-1");
							error.setERDS01("Error al eliminar las preguntas fallidas de la base de datos");
							log.error(e);
						}
					} else{
						error.setERRNUM("1");
						error.setERNU01("-2");
						error.setERDS01("Respuesta incorrecta.");
						try {
							db.guardarPreguntasIncorrectas(req.getRespuestas(), req.getNacionalidad(), req.getNumeroIdentificacion());
						} catch (SQLException e) {
							error.setERRNUM("1");
							error.setERNU01("-1");
							error.setERDS01("Error al guardar las preguntas fallidas en la base de datos");
							log.error(e);
						}
					}
				}
				else{ // error en el servicio
					error.setERRNUM(respPreg.getError().getERRNUM());
					error.setERNU01(respPreg.getError().getERNU01());
					error.setERDS01(respPreg.getError().getERDS01());
					log.error(error.getERDS01() + " - " + " - Canal " + req.getCanal() );
				}
			}finally{
				db.cerrar();
			}
		}
		else{ // error al conectar
			error.setERRNUM("1");
			error.setERNU01("-1");
			error.setERDS01("Error en la conexión");
		}
		// establece el mensaje de error
		manejarError(res, error);
		// Cierre de la conexion
		db.cerrar();
		// Fin de la invocacion
		log.info("Fin invocacion CHECK0PREG0AUT");
		return res;
	}
	/**
	 * Bloqueo usuario IVR
	 * @param req
	 * @return
	 * @throws WSException
	 */
	public BloqueoIVRResponse BLOQUEOIVR(BloqueoIVRBean req) throws WSException{
		log.info("Invocando BLOQUEOIVR");
		BloqueoIVRResponse res = new BloqueoIVRResponse();
		String canal = "IB";
		String canalCompleto = "Internet Banking";
		String mensaje = "52";
		
		if(req.getTipoCedula()==null || req.getCedula()==null){
			return res;
		}
		ELEERRMessage error = new ELEERRMessage();
		Database db = new Database();
		Validador val = new Validador();
		String nombreCompleto = "";
		if(db.conectar()){
			try {
				NIBPF3010Bean req3010 = new NIBPF3010Bean();
				req3010.setCanal(req.getCanal());
				req3010.setNACIONALIDAD(req.getTipoCedula());
				req3010.setNROIDENTIFICACION(StringUtils.leftPad(req.getCedula(),12,'0'));
				req3010.setNROPARAM("1");
				NIBPF3010Response resNibpf3010 = null;
				try {
					resNibpf3010 = NIBPF3010(req3010);
					nombreCompleto = Crypto.crypt(resNibpf3010.getNIBPF3010().getPRIMERNOMBRE().trim() +' '+ resNibpf3010.getNIBPF3010().getSEGUNDONOMBRE().trim() + ' ' + resNibpf3010.getNIBPF3010().getPRIMERAPELLIDO().trim() + ' '+ resNibpf3010.getNIBPF3010().getSEGUNDOAPELLIDO().trim());
					if(resNibpf3010.getError()!=null){
						res.setError(resNibpf3010.getError());
						return res;
					}
					val.setDatosBasicos(resNibpf3010.getNIBPF3010());
				} catch (WSException e1) {
					res.getError().setERRNUM("1");
					res.getError().setERNU01("50682");
					res.getError().setERDS01(e1.getMessage());
					log.error(e1);
					return res;			
				}
				db.cambiarEstatusUsuario(
						req.getCanal(),
						req.getTipoCedula(),
						req.getCedula(),
						nombreCompleto,
						req.getRegistro(),
						req.getAcceso()
						);
		
				if("1".equals(req.getCanal())){
					canal = "IVR";
					canalCompleto = "Atencion Activa";
					mensaje = "57";
				
					
				Calendar fecha = new GregorianCalendar();
		        int año = fecha.get(Calendar.YEAR);
		        int mes = fecha.get(Calendar.MONTH);
		        int dia = fecha.get(Calendar.DAY_OF_MONTH);
		        int hora = fecha.get(Calendar.HOUR_OF_DAY);
		        int minuto = fecha.get(Calendar.MINUTE);
		        int segundo = fecha.get(Calendar.SECOND);
		        String diaS = null;
		        String mesS = null;
		        String minutoS = null;
		        String horaS = null;
		        String segundoS = null;
				
		        if(dia<10) diaS = "0"+String.valueOf(dia);
		        else diaS = String.valueOf(dia);
		        if(mes+1<10) mesS = "0"+String.valueOf(mes+1);
		        else mesS = String.valueOf(mes+1);
		        if(hora<10) horaS = "0"+String.valueOf(hora);
		        else horaS = String.valueOf(hora);
		        if(minuto<10) minutoS = "0"+String.valueOf(minuto);
		        else minutoS = String.valueOf(minuto);
		        if(segundo<10) segundoS = "0"+String.valueOf(segundo);
		        else segundoS = String.valueOf(segundo);
		        
		        String fecha1 = String.valueOf(año)+mesS+diaS; 
				String hora1 =  horaS+minutoS+segundoS; 
				
				//ENVIO DE MENSAJE SMS
				if(resNibpf3010.getNIBPF3010().getNROCELULAR() != null && !"00000000000".equals(resNibpf3010.getNIBPF3010().getNROCELULAR().trim())){
					// Enviamos el SMS si tiene numero de celular
					SmsSP sms = new SmsSP();
					sms.setCanal1(mensaje);
					sms.setNumcel(resNibpf3010.getNIBPF3010().getNROCELULAR());
					sms.setXrnde38(canal);
					sms.setFectim(canalCompleto);
					sms.setFecha(fecha1);
					sms.setHora(hora1);
					if(!sms.enviaSms()){
						log.error("BLOQUEOIVR - Error de envío SMS para el usuario: "+ req.getCedula());
					}
				} else {
					res.getError().setERRNUM("1");
					res.getError().setERNU01("2");
					res.getError().setERDS01("BLOQUEOIVR - Cliente no posee info para el envío del SMS: "+ req.getCedula());
					}
				}
				
			} catch (SQLException e) {
				error.setERRNUM("1");
				error.setERNU01("-1");
				error.setERDS01("Error SQL al desbloquear usuario");
				log.error(e);
			} finally {
				db.cerrar();
			}
		} else { // error al conectar a la base de datos
			error.setERRNUM("1");
			error.setERNU01("-1");
			error.setERDS01("Error en la conexión a la Base de Datos");
		}
		// manejo del error
		manejarError(res, error);
		// Cierre conexion
		db.cerrar();
		// Fin de la invocacion
		log.info("Fin invocacion BLOQUEOIVR");
		return res;
	}
	/**
	 * Bloqueo usuario IVR
	 * @param req
	 * @return
	 * @throws WSException
	 */
	public BloqueoIVRResponse DESBLOQUEOIVR(BloqueoIVRBean req) throws WSException{
		log.info("Invocando DESBLOQUEOIVR");
		BloqueoIVRResponse res = new BloqueoIVRResponse();
		if(req.getTipoCedula()==null || req.getCedula()==null){
			return res;
		}
		res.setError(new ELEERR());
		res.getError().setERRNUM("0");
		Database db = new Database();
		Validador val = new Validador();
		String nombreCompleto = "";
		if(db.conectar()){
			try {
				Parametros param = new Parametros();
				String url = param.getString("Idg_admin_url");
				AdminService_ServiceLocator loc = new AdminService_ServiceLocator(new FileProvider("client_deploy.wsdd"));
				NIBPF3010Bean req3010 = new NIBPF3010Bean();
				req3010.setCanal(req.getCanal());
				req3010.setNACIONALIDAD(req.getTipoCedula());
				req3010.setNROIDENTIFICACION(StringUtils.leftPad(req.getCedula(),12,'0'));
				req3010.setNROPARAM("1");
				NIBPF3010Response resNibpf3010 = null;
				try {
					resNibpf3010 = NIBPF3010(req3010);
					nombreCompleto = Crypto.crypt(resNibpf3010.getNIBPF3010().getPRIMERNOMBRE().trim() +' '+ resNibpf3010.getNIBPF3010().getSEGUNDONOMBRE().trim() + ' ' + resNibpf3010.getNIBPF3010().getPRIMERAPELLIDO().trim() + ' '+ resNibpf3010.getNIBPF3010().getSEGUNDOAPELLIDO().trim());
					if(resNibpf3010.getError()!=null){
						res.setError(resNibpf3010.getError());
						return res;
					}
					val.setDatosBasicos(resNibpf3010.getNIBPF3010());
				} catch (WSException e1) {
					res.getError().setERRNUM("1");
					res.getError().setERNU01("50682");
					res.getError().setERDS01(e1.getMessage());
					log.error(e1);
					return res;			
				}
				db.cambiarEstatusUsuario(req.getCanal(), req.getTipoCedula(), req.getCedula(),nombreCompleto, req.getRegistro(), req.getAcceso());
				AdminService_PortType adminService = loc.getAdminService(new URL(url));
				UserSetCallParms userSetCallParms = new UserSetCallParms();
				userSetCallParms.setUserid(Crypto.decrypt(param.getString("Idg_group"))+"/"+req.getTipoCedula()+req.getCedula());
				UserParms parms = new UserParms();
				parms.setClearlockout(true);
				userSetCallParms.setParms(parms);
				adminService.userSet(userSetCallParms);
			} catch (ServiceException e) {
				res.getError().setERRNUM("1");
				res.getError().setERNU01("90027");
				res.getError().setERDS01(e.getMessage());
				log.error(e);
			} catch (AdminServiceFault e) {
				res.getError().setERRNUM("1");
				res.getError().setERNU01(e.getInternalCode());
				res.getError().setERDS01(e.getErrorMessage());
				log.error(e);
			} catch (RemoteException e) {
				res.getError().setERRNUM("1");
				res.getError().setERNU01("99447");
				res.getError().setERDS01(e.getMessage());
				log.error(e);
			} catch (MalformedURLException e) {
				res.getError().setERRNUM("1");
				res.getError().setERNU01("30137");
				res.getError().setERDS01(e.getMessage());
				log.error(e);
			} catch (SQLException e1) {
				res.getError().setERRNUM("1");
				res.getError().setERNU01("-1");
				res.getError().setERDS01("Error SQL al desbloquear usuario");
				log.error(e1);
			} finally{
				db.cerrar();
			}
		}else{ // error al conectar a la base de datos
			res.getError().setERRNUM("1");
			res.getError().setERNU01("-1");
			res.getError().setERDS01("Error en la conexión a la Base de Datos");
		}
		// Fin de la invocacion
		log.info("Fin invocacion DESBLOQUEOIVR");
		return res;
	}
	/**
	 * Para verificar si hay un registro en la BD según el numero de documento
	 * 
	 * @param VerificarUsuarioBean req
	 * @return VerificarUsuarioResponse
	 */
	public VerificarUsuarioResponse CHECK0USER(VerificarUsuarioBean req) {
		
                log.info("Invocando CHECK0USER");
		VerificarUsuarioResponse res = new VerificarUsuarioResponse();
		res.setError(new ELEERR());
		res.getError().setERRNUM("0");
		if( req == null) {
			res.getError().setERRNUM("1");
			res.getError().setERNU01("59515");
			res.getError().setERDS01("Parámetros insuficientes");
		}
		Database db = new Database();
		// Conexion a la BD
		if(db.conectar()){
			try {
				Usuario[] usuarios = null;
                                
				if("2".equals(req.getCanal()) || "4".equals(req.getCanal()) || "5".equals(req.getCanal())){					
                                    usuarios = db.buscarUsuarioCHECK0USER(req.getLogin(), req.getCanal());
				}else if("1".equals(req.getCanal())){
                                    usuarios = db.buscarUsuario(req.getTipoDocumento(),req.getNumeroDocumento(), req.getCanal(),null);
				}
                                
				if(usuarios.length==0){ // No encontro data
					res.getError().setERRNUM("1");
					res.getError().setERNU01("-3");
					res.getError().setERDS01("Usuario no encontrado");
				} else if(usuarios.length>1){
					res.getError().setERRNUM("1");
					res.getError().setERNU01("-4");
					res.getError().setERDS01("Multiples registros encontrados");
				} else {
					if("1".equals(req.getCanal())){
                                            if(usuarios[0].getEstatusRegistro() == null){
                                                    res.getError().setERRNUM("1");
                                                    res.getError().setERNU01("33461");
                                                    res.getError().setERDS01("Usuario no registrado en IVR");
                                            } else if("A".equals(usuarios[0].getEstatusRegistro())){
                                                    res.setExiste(true);
                                                    res.setEstatusAcceso(usuarios[0].getEstatusAcceso());
                                                    res.setEstatusSesion(usuarios[0].getEstatusSesion());
                                            } else {
                                                    res.getError().setERRNUM("1");
                                                    res.getError().setERNU01("16501");
                                                    res.getError().setERDS01("Usuario bloqueado en IVR");
                                                    res.setEstatusAcceso(usuarios[0].getEstatusRegistro());
                                                    res.setEstatusSesion(usuarios[0].getEstatusSesion());
                                            }
					} else if("2".equals(req.getCanal()) || "4".equals(req.getCanal()) || "5".equals(req.getCanal())){
						
                                            if(usuarios[0].getEstatusRegistro()==null){
                                                    res.getError().setERRNUM("1");
                                                    res.getError().setERNU01("33461");
                                                    res.getError().setERDS01("Usuario no registrado");
                                            }else if("B".equals(usuarios[0].getEstatusRegistro())){
                                                    res.getError().setERRNUM("1");
                                                    res.getError().setERNU01("74517");
                                                    res.getError().setERDS01("Registro de usuario bloqueado");                                                        
                                            }else if(!"A".equals(usuarios[0].getEstatusRegistro())){
                                                    res.getError().setERRNUM("1");
                                                    res.getError().setERNU01("-4");
                                                    res.getError().setERDS01("Usuario no registrado");                                                                                                                
                                            }else if("A".equals(usuarios[0].getEstatusAcceso())){
                                                    res.setExiste(true);
                                                    res.setEstatusAcceso(usuarios[0].getEstatusAcceso());
                                                    res.setTipoDocumento(usuarios[0].getTipoCedula());
                                                    res.setNumeroDocumento(usuarios[0].getCedula());
                                                    res.setTipoRif(usuarios[0].getTipo_rif());
                                                    res.setRif(usuarios[0].getRif());	
                                                    res.setEstatusSesion(usuarios[0].getEstatusSesion());
                                            } else {
                                                    res.getError().setERRNUM("1");
                                                    res.getError().setERNU01("16501");
                                                    res.getError().setERDS01("Usuario bloqueado");
                                                    res.setExiste(true);
                                                    res.setEstatusAcceso(usuarios[0].getEstatusAcceso());
                                                    res.setTipoDocumento(usuarios[0].getTipoCedula());
                                                    res.setNumeroDocumento(usuarios[0].getCedula());
                                                    res.setTipoRif(usuarios[0].getTipo_rif());
                                                    res.setRif(usuarios[0].getRif());
                                                    res.setEstatusSesion(usuarios[0].getEstatusSesion());
                                            }
					}
				}
			} catch (SQLException e) {
				res.getError().setERRNUM("1");
				res.getError().setERNU01("-1");
				res.getError().setERDS01("Error SQL al buscar usuario");
				log.error(e);
			} finally {
				db.cerrar();
			}
		} else { // error al conectar
			res.getError().setERRNUM("1");
			res.getError().setERNU01("-1");
			res.getError().setERDS01("Error en la conexión");
		}
		// Fin de la invocacion
		log.info("Fin invocacion CHECK0USER");
		return res;
	}
	
	/**
	 * Metodo que crea y envía un OTP al usuario especificado en el request
	 * Si el usuario posee numero de celular en el registro, se envia un SMS
	 * Si el usuario posee email en el registro, se envia un email
	 * @author P011203513
	 * @param AutOTPBean req
	 * @return AutOTPResponse
	 */
	
	public AutOTPResponse creaEnviaOTP(AutOTPBean req){
		log.info("Invocando creaEnviaOTP");
		AutOTPResponse res = new AutOTPResponse();
		HashMap <String,String> canales = new HashMap<String, String>();
		canales.put("1", "IVR");
		canales.put("2", "MB");
		canales.put("4", "IB");
		
		res.setError(new ELEERR());
		res.getError().setERRNUM("0");
		
		// Validamos que vienen todos los parametros necesarios
		if(req.getCedula() == null || req.getTipoCedula() == null || req.getCanal() == null ||
				"".equals(req.getCedula().trim()) || "".equals(req.getTipoCedula().trim()) ||  "".equals(req.getCanal().trim())){
			res.getError().setERRNUM("1");
			res.getError().setERNU01("5");
			res.getError().setERDS01("Parametros insuficientes");
			log.error("creaEnviaOTP - Parametros insuficientes");
			return res;
		}
		
		Parametros params = new Parametros();
		String userId = Crypto.decrypt(params.getString("Idg_group"))+"/"+req.getTipoCedula()+req.getCedula();
		String otpString = ""; // OTP creado
		UserOTPInfo[] otp = null;// Para guardar los otp que existan
		boolean enviados = false;
		try
		{
			// Obtenemos la información del usuario
			NIBPF3010Bean req3010 = new NIBPF3010Bean();
			req3010.setNROPARAM("1");
			req3010.setNACIONALIDAD(req.getTipoCedula());
			// Cuando viene un valor en rif es porque es juridico 
			String nroidentificacion = ("".equals(req.getRif()) || req.getRif() == null) ? StringUtils.leftPad(req.getCedula(),12,'0') : StringUtils.leftPad(req.getRif(),12,'0');
			req3010.setNROIDENTIFICACION(nroidentificacion);
			NIBPF3010Response res3010 = this.NIBPF3010(req3010);
			if(res3010.getError()!=null){
				log.error(res3010.getError().getERDS01());
				if("0608".equals(res3010.getError().getERNU01())){
					res.getError().setERRNUM("1");
					res.getError().setERNU01("1");
					res.getError().setERDS01("Usuario no existe");
					log.error("creaEnviaOTP - Usuario no existe");
				}else{
					res.getError().setERRNUM("1");
					res.getError().setERNU01("6");
					res.getError().setERDS01("Error General");
					log.error("creaEnviaOTP - Error General");
				}
				
				return res;
			}
			
			if((res3010.getNIBPF3010().getDISPONIBLE3() == null || "".equals(res3010.getNIBPF3010().getDISPONIBLE3().trim())) && 
					(res3010.getNIBPF3010().getNROCELULAR() == null || "00000000000".equals(res3010.getNIBPF3010().getNROCELULAR().trim()))){
				log.error("creaEnviaOTP - Cliente no posee info para el envío del OTP");
				res.getError().setERRNUM("1");
				res.getError().setERNU01("2");
				res.getError().setERDS01("Cliente no posee info para el envío del OTP");
				return res;
			}
			
			
			// Creamos el acceso al servico de IDGAdmin
			AdminService_ServiceLocator locator = new AdminService_ServiceLocator(new FileProvider("client_deploy.wsdd"));
			locator.setAdminServiceEndpointAddress(params.getString("Idg_admin_url")); 
			AdminService_PortType adminService = locator.getAdminService();
			UserOTPParms userOTPParms = new UserOTPParms();
			
			try{
				// Obtenemos los OTP que tenga creados el usuario
				UserOTPGetCallParms userOTPGetCallParms = new UserOTPGetCallParms();
				userOTPGetCallParms.setUserid(userId);
				userOTPGetCallParms.setFilter(new UserOTPFilter());
				otp = adminService.userOTPGet(userOTPGetCallParms);
			}catch(AdminServiceFault ex){
				if("USER_DOES_NOT_EXIST".equals(ex.getErrorCode())){
					res.getError().setERRNUM("1");
					res.getError().setERNU01("1");
					res.getError().setERDS01("Usuario no existe");
					log.error("creaEnviaOTP - "+ex.getErrorMessage());
					return res;
				}
				else if("USER_LOCKED".equals(ex.getErrorCode())){
					res.getError().setERRNUM("1");
					res.getError().setERNU01("7");
					res.getError().setERDS01("Usuario esta bloqueado");
					log.error("creaEnviaOTP - "+ex.getErrorMessage());
					return res;
				}else{
					log.error("creaEnviaOTP - "+ex.getErrorMessage());
				}
			}finally{
				// Si ya tiene creados los eliminamos para poder crear uno nuevo
				if (otp != null && otp.length >= 0){
					UserOTPDeleteCallParms userOTPDeleteCallParms = new UserOTPDeleteCallParms();
					userOTPDeleteCallParms.setUserid(userId);
					userOTPDeleteCallParms.setFilter(new UserOTPFilter());
					adminService.userOTPDelete(userOTPDeleteCallParms);
					otp = null;
					
				}
			}
			
			try{
				// Creamos un nuevo OTP
				UserOTPCreateCallParms userOTPCreateCallParms = new UserOTPCreateCallParms();
				userOTPCreateCallParms.setUserid(userId);
				userOTPCreateCallParms.setParms(userOTPParms);
				otp = adminService.userOTPCreate(userOTPCreateCallParms);
				if (otp != null && otp.length == 1)
				{
					// Obtuvimos un OTP para el usuario
					
					if (otp[0].getOTP() != null)
					{
						otpString = otp[0].getOTP();
						log.info("creaEnviaOTP - Se genero un OTP para el usuario " + userId);
						
						
						// Envio de OTP via SMS y email
						if(res3010.getNIBPF3010().getNROCELULAR() != null && !"00000000000".equals(res3010.getNIBPF3010().getNROCELULAR().trim())){
							// Enviamos el SMS si tiene numero de celular
							SmsSP sms = new SmsSP();
							sms.setCanal1("41");
							sms.setTipcre(canales.containsKey(req.getCanal()) ? canales.get(req.getCanal()) : "IB");
							sms.setNumcel(res3010.getNIBPF3010().getNROCELULAR());
							sms.setCheque(otpString);
							if(sms.enviaSms()){
								log.info("creaEnviaOTP - Se envio SMS con el OTP para el usuario "+ userId +" canal: "+canales.get(req.getCanal()));
								enviados = true;
							}else
								log.error("creaEnviaOTP - Error de envío SMS con el OTP para el usuario "+ userId);
						}
						
						if(res3010.getNIBPF3010().getDISPONIBLE3() != null && !"".equals(res3010.getNIBPF3010().getDISPONIBLE3())){
							// Enviamos el email si tiene numero de email
							EmailSender emailSender = new EmailSender();
							Database db = new Database();
							if (db.conectar()) {
								String to = res3010.getNIBPF3010().getDISPONIBLE3();
								String nombreCliente = res3010.getNIBPF3010().getINTLNADB();
								String subject = "Notificación de código de autorización electrónica";
								String m = db.buscarMensajeCorreo("email.otp");
								String mensaje = String.format(m, nombreCliente, otpString);
								String footer = db.buscarFooterCorreos("footer_correos");
								if(emailSender.sendMail(to, subject, mensaje, footer))
								{
									log.info("creaEnviaOTP - Se envio email con el OTP para el usuario "+ userId);
									enviados = true;
								}else
									log.error("creaEnviaOTP - Error de envío de email con el OTP para el usuario "+ userId);
									
							}	
						}
					}
				}
				// Si no se pudo enviar el OTP por ningun canal
				if(!enviados){
					res.getError().setERRNUM("1");
					res.getError().setERNU01("4");
					res.getError().setERDS01("Error enviando el OTP");
					log.error("creaEnviaOTP - Error enviando el OTP");
				}
			}catch(AdminServiceFault ex){
				log.error("No se pudo crear el OTP "+ex.getErrorMessage());
				res.getError().setERRNUM("1");
				res.getError().setERNU01("3");
				res.getError().setERDS01("No se pudo generar el OTP");
			}
		}
		catch (ServiceException se)
		{
			log.error("creaEnviaOTP - No se pudo crear el OTP "+se.getMessage());
			res.getError().setERRNUM("1");
			res.getError().setERNU01("3");
			res.getError().setERDS01("No se pudo generar el OTP");
		} catch (RemoteException e) {
			log.error("creaEnviaOTP - No se pudo crear el OTP "+e.getMessage());
			res.getError().setERRNUM("1");
			res.getError().setERNU01("3");
			res.getError().setERDS01("No se pudo generar el OTP");
		}catch(Exception e){
			log.error("creaEnviaOTP - No se pudo crear el OTP "+e.getMessage());
			res.getError().setERRNUM("1");
			res.getError().setERNU01("3");
			res.getError().setERDS01("No se pudo generar el OTP");
		}
		
		return res;
	}
	/**
	 * Metodo que valida un OTP al usuario especificado en el request
	 * Si el OTP es el correcto y no ha expirado entonces es valido
	 * @author P011203513
	 * @param AutOTPBean req
	 * @return AutOTPResponse
	 */
	public AutOTPResponse validaOTP(AutOTPBean req){
		log.info("Invocando validaOTP");
		AutOTPResponse res = new AutOTPResponse();
		res.setError(new ELEERR());
		res.getError().setERRNUM("0");
		
		// Validamos que vienen todos los parametros necesarios
		if(req.getCedula() == null || req.getTipoCedula() == null || req.getCanal() == null || req.getOtpCod() == null ||
				"".equals(req.getCedula().trim()) || "".equals(req.getTipoCedula().trim()) || "".equals(req.getCanal().trim()) || "".equals(req.getOtpCod().trim())){
			res.getError().setERRNUM("1");
			res.getError().setERNU01("5");
			res.getError().setERDS01("Parametros insuficientes");
			log.error("validaOTP - Parametros insuficientes");
			return res;
		}
		
		Parametros params = new Parametros();
		String userId = Crypto.decrypt(params.getString("Idg_group"))+"/"+req.getTipoCedula()+req.getCedula();
		try{
			// Creamos el acceso al servico de IDGAuth
			AuthenticationService_ServiceLocator loc = new AuthenticationService_ServiceLocator();
			loc.setAuthenticationServiceEndpointAddress(params.getString("Idg_auth_url"));
			AuthenticationService_PortType authService = loc.getAuthenticationService();
			
			// Para realizar la autenticacion
			GenericAuthenticateParmsEx gaParams = new GenericAuthenticateParmsEx();
			gaParams.setAuthenticationType("OTP");
			Response response = new Response();
			response.setResponse(new String[]{req.getOtpCod()});
			AuthenticateGenericChallengeExCallParms auth = new AuthenticateGenericChallengeExCallParms();
			auth.setUserId(userId);
			auth.setParms(gaParams);
			auth.setResponse(response);
			// Intentamos autenticar
			authService.authenticateGenericChallengeEx(auth);
		}catch(AuthenticationServiceFault ex){
			if("INVALID_RESPONSE".equals(ex.getErrorCode()) ){
				res.getError().setERRNUM("1");
				res.getError().setERNU01("2");
				res.getError().setERDS01("EL OTP no es valido");
				log.error("validaOTP - "+ex.getErrorMessage());
	
			}
			else if("OTP_EXPIRED".equals(ex.getErrorCode()) ){
				res.getError().setERRNUM("1");
				res.getError().setERNU01("4");
				res.getError().setERDS01("EL OTP ha expirado");
				log.error("validaOTP - "+ex.getErrorMessage());
	
			}
			else if("USER_DOES_NOT_EXIST".equals(ex.getErrorCode())){
				res.getError().setERRNUM("1");
				res.getError().setERNU01("1");
				res.getError().setERDS01("Usuario no existe");
				log.error("validaOTP - "+ex.getErrorMessage());
			}
			else if("USER_LOCKED".equals(ex.getErrorCode())){
				res.getError().setERRNUM("1");
				res.getError().setERNU01("3");
				res.getError().setERDS01("Usuario esta bloqueado");
				log.error("validaOTP - "+ex.getErrorMessage());
			}else{
				res.getError().setERRNUM("1");
				res.getError().setERNU01("6");
				res.getError().setERDS01("Error General");
				log.error("validaOTP - "+ex.getErrorMessage());
			}
			
		} catch (AuthenticationPasswordChangeRequiredFaultEx e) {
			res.getError().setERRNUM("1");
			res.getError().setERNU01("6");
			res.getError().setERDS01("Error General");
			log.error("validaOTP - "+e.getErrorMessage());
		} catch (AuthenticationSystemFault e) {
			res.getError().setERRNUM("1");
			res.getError().setERNU01("6");
			res.getError().setERDS01("Error General");
			log.error("validaOTP - "+e.getErrorMessage());
		} catch (RemoteException e) {
			res.getError().setERRNUM("1");
			res.getError().setERNU01("6");
			res.getError().setERDS01("Error General");
			log.error("validaOTP - "+e.getMessage());
		} catch (ServiceException e) {
			res.getError().setERRNUM("1");
			res.getError().setERNU01("6");
			res.getError().setERDS01("Error General");
			log.error("validaOTP - "+e.getMessage());
		}
		
		return res;
		
	}
	/**
	 * Proceso para la autenticacion del Usuario
	 * 
	 * @param AutenticarIVRBean req
	 * @return AutenticarIVRResponse
	 */
	public AutenticarIVRResponse AUTENTICAIVR(AutenticarIVRBean req) {
		
                log.info("Invocando AUTENTICAIVR");
		AutenticarIVRResponse res = new AutenticarIVRResponse();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
		Usuario[] usuario;
		
                if((req ==null || req.getCanal()==null) || ((req.getTipoDocumento()==null && req.getNumeroDocumento()==null) && (req.getLogin()==null))) {
                    res.getError().setERRNUM("1");
                    res.getError().setERNU01("-5");
                    res.getError().setERDS01("Debe ingresar los campos solicitados");
                    return res;                    
                }
                
		res.setError(new ELEERR());
		res.getError().setERRNUM("0");
		res.getError().setERNU01("0");
		Database db = new Database();
		if(db.conectar()){			
			try {			
				usuario = db.buscarUsuario(req.getTipoDocumento(), req.getNumeroDocumento(), req.getCanal(), req.getLogin());
                                
				if(usuario.length!=1){
                                    if("5".equals(req.getCanal())){
                                       usuario = db.buscarUsuario(req.getTipoDocumento(), req.getNumeroDocumento(), "4", req.getLogin());                                       
                                       if(usuario.length!=1){ 
                                            res.getError().setERRNUM("1");                                           
                                            res.getError().setERNU01("-3");
                                            res.getError().setERDS01("Usuario no existe");
                                            log.error(res.getError().getERDS01());
                                            return res;
                                       }else{
                                            res.getError().setERRNUM("1");
                                            res.getError().setERNU01("-6");
                                            res.getError().setERDS01("Usuario no Afiliado en P2P");
                                            log.error(res.getError().getERDS01());
                                            return res;                                            
                                       }
                                    }else{
                                        res.getError().setERRNUM("1");
					res.getError().setERNU01("-3");
					res.getError().setERDS01("Usuario no existe");
					log.error(res.getError().getERDS01());
					return res;
                                    }					
                                }
                                
				if("B".equals(usuario[0].getEstatusRegistro())){
					res.getError().setERRNUM("1");
					res.getError().setERNU01("74517");
					res.getError().setERDS01("Registro de usuario bloqueado");
					log.error(res.getError().getERDS01());
					return res;
				} else if(!"A".equals(usuario[0].getEstatusRegistro())){
					res.getError().setERRNUM("1");
					res.getError().setERNU01("-4");
					res.getError().setERDS01("Usuario no registrado");
					log.error(res.getError().getERDS01());
					return res;
				}
                                
                                if("5".equals(req.getCanal()) && "DS".equals(usuario[0].getEstatusAcceso())){
                                        res.getError().setERRNUM("1");
					res.getError().setERNU01("75971");
					res.getError().setERDS01("Usuario Bloqueado Doble Sesion");
					log.error(res.getError().getERDS01());
					return res;
                                }else if(!"A".equals(usuario[0].getEstatusAcceso())){
					res.getError().setERRNUM("1");
					res.getError().setERNU01("75970");
					res.getError().setERDS01("Usuario bloqueado");
					log.error(res.getError().getERDS01());
					return res;
				}
				// Validacion de la clave
				Validador validador = new Validador();
	
				if("1".equals(req.getCanal()) && !validador.contrasena(req.getCanal(), req.getClaveIVR()) ){
					res.getError().setERRNUM("1");
					res.getError().setERNU01(validador.getCodigoError());
					res.getError().setERDS01(validador.getDescripcionError());
					return res;
				} else {
					try{
						Parametros params = new Parametros();
	
						AuthenticationService_ServiceLocator loc = new AuthenticationService_ServiceLocator();
						loc.setAuthenticationServiceEndpointAddress(params.getString("Idg_auth_url"));
						AuthenticationService_PortType authService = loc.getAuthenticationService();
	
						// Para verificar si existe el password del canal
						GenericChallengeParmsEx gcParams = new GenericChallengeParmsEx();
						gcParams.setAuthenticationType("PASSWORD");
                                                if("1".equals(req.getCanal())){
                                                    gcParams.setPasswordName(Crypto.decrypt(params.getString("nombre_password_ivr")));
                                                }						
	
						GetGenericChallengeExCallParms gc = new GetGenericChallengeExCallParms();
                                                if(usuario[0].getTipo_rif()!=null){
                                                    gc.setUserId(Crypto.decrypt(params.getString("Idg_group"))+"/"+usuario[0].getTipo_rif()+Crypto.decrypt(usuario[0].getRif())+usuario[0].getTipoCedula()+Crypto.decrypt(usuario[0].getCedula())+Crypto.decrypt(usuario[0].getLogin()));
                                                }else{
                                                    gc.setUserId(Crypto.decrypt(params.getString("Idg_group"))+"/"+usuario[0].getTipoCedula()+Crypto.decrypt(usuario[0].getCedula()));
                                                }						
						gc.setParms(gcParams);
	
						// Invocacion del WS
						GenericChallengeEx resIDG = authService.getGenericChallengeEx(gc);
						res.setFechaExpiracion(sdf.format(resIDG.getPasswordChallenge().getExpiryDate().getTime()));
                                                
						// Para realizar la autenticacion
						GenericAuthenticateParmsEx gaParams = new GenericAuthenticateParmsEx();
						gaParams.setAuthenticationType(gcParams.getAuthenticationType());
						if("1".equals(req.getCanal())){
                                                    gaParams.setPasswordName(gcParams.getPasswordName());
                                                }
                                                
						Response response = new Response();
						response.setResponse(new String[]{req.getClaveIVR()});
	
						AuthenticateGenericChallengeExCallParms auth = new AuthenticateGenericChallengeExCallParms();
						auth.setUserId(gc.getUserId());
						auth.setParms(gaParams);
						auth.setResponse(response);
	
						// Invocacion del WS
						authService.authenticateGenericChallengeEx(auth);
						
                                                //Si el usuario no tiene una sesion activa inserto ultima interacción, valores de sesion y bitacora en la BD
                                                if(usuario[0].getEstatusSesion()==0){                                                    
                                                    db.actualizarUltInteraccion(usuario[0].getId(), req.getCanal());
                                                    db.insertarAuditoria(usuario[0].getId(), 1, req.getCanal(), req.getIp(), "Servicios", "Inicio de Sesion");
                                                }						
                                                
                                                res.setEstatusRegistro(usuario[0].getEstatusRegistro());
                                                res.setEstatusAcceso(usuario[0].getEstatusAcceso());
                                                res.setEstatusSesion(usuario[0].getEstatusSesion());
                                                if(usuario[0].getTipo_rif()!=null){ 
                                                    res.setIdentificacion(usuario[0].getTipo_rif()+"-"+Crypto.decrypt(usuario[0].getRif()));
                                                }else{
                                                    res.setIdentificacion(usuario[0].getTipoCedula()+"-"+Crypto.decrypt(usuario[0].getCedula()));
                                                }
                                                res.setNombreApellido(Crypto.decrypt(usuario[0].getNombreApellido()));                                                                                                  
                                                res.setFechaUltimaConexion(sdf.format(usuario[0].getFechaHoraUltimaconexion()));
                                                
					} catch (ServiceException e) {
						res.getError().setERRNUM("1");
						res.getError().setERNU01("90027");
						res.getError().setERDS01(e.getMessage());
						return res;
					} catch (AuthenticationServiceFault e) {
						res.getError().setERRNUM("1");
						res.getError().setERNU01(e.getInternalCode());
						res.getError().setERDS01(e.getErrorMessage());
						return res;
					} catch (RemoteException e) {
						res.getError().setERRNUM("1");
						res.getError().setERNU01("99447");
						res.getError().setERDS01(e.getMessage());
						return res;
					} catch (Exception e){}//No se hace nada porque seria una exception de la actualización de la interacción, la autenticación si se realiza
				}
			} catch (Exception e) {
				res.getError().setERRNUM("1");
				res.getError().setERNU01("-2");
				res.getError().setERDS01( "Error inesperado " + e.getMessage());
				log.error(res.getError().getERDS01());
				return res;
			} finally {
				// Cierre conexion
				db.cerrar();
			}
		} else { // error al conectar
			res.getError().setERRNUM("1");
			res.getError().setERNU01("-1");
			res.getError().setERDS01("Error en la conexión");
			return res;
		}
		// Fin de la invocacion
		log.info("Fin invocacion AUTENTICAIVR");
		return res;
	}
	/**
	 * Servicio para el Pago de Proveedores/Nómina.
	 * @param req
	 * @return
	 * @throws WSException
	 */
	public INPYRLSJVResponse INPYRLSJV(INPYRLSJVBean req) throws WSException{
		log.info("Invocando INPYRLSJV");
		Socket s = null;
		INPYRLSJVResponse res = new INPYRLSJVResponse();
		try {
			Parametros params = new Parametros();
			MessageContext mc;
			s = new Socket(params.getString("ip"), params.getInt("port1") + 2);
			s.setSoTimeout(params.getInt("timeout"));
			mc = new MessageContext(new DataInputStream(new BufferedInputStream(s.getInputStream())), new DataOutputStream(
					new BufferedOutputStream(s.getOutputStream())), "com.activo.gateway.dibs.messages");
			INPYRLSJVMessage message;
			message = (INPYRLSJVMessage) mc.getMessageRecord("INPYRLSJV");
			if(req.getPYRUSR() != null && !"".equals(req.getPYRUSR()))message.setPYRUSR(req.getPYRUSR());
			if(req.getPYRPID() != null && !"".equals(req.getPYRPID()))message.setPYRPID(req.getPYRPID());
			if(req.getPYROPC() != null && !"".equals(req.getPYROPC()))message.setPYROPC(req.getPYROPC());
			if(req.getPYREOF() != null && !"".equals(req.getPYREOF()))message.setPYREOF(req.getPYREOF());
			if(req.getPYRSTS() != null && !"".equals(req.getPYRSTS()))message.setPYRSTS(req.getPYRSTS());
			if(req.getPYRTYP() != null && !"".equals(req.getPYRTYP()))message.setPYRTYP(req.getPYRTYP());
			if(req.getPYRFLG() != null && !"".equals(req.getPYRFLG()))message.setPYRFLG(req.getPYRFLG());
			if(req.getPYRACC() != null && !"".equals(req.getPYRACC()))message.setPYRACC(req.getPYRACC());
			if(req.getPYRAMT() != null && !"".equals(req.getPYRAMT()))message.setPYRAMT(req.getPYRAMT());
			if(req.getPYRNUM() != null && !"".equals(req.getPYRNUM()))message.setPYRNUM(req.getPYRNUM());
			if(req.getPYRVDD() != null && !"".equals(req.getPYRVDD()))message.setPYRVDD(req.getPYRVDD());
			if(req.getPYRVDM() != null && !"".equals(req.getPYRVDM()))message.setPYRVDM(req.getPYRVDM());
			if(req.getPYRVDY() != null && !"".equals(req.getPYRVDY()))message.setPYRVDY(req.getPYRVDY());
			if(req.getPYRERD() != null && !"".equals(req.getPYRERD()))message.setPYRERD(req.getPYRERD());
			if(req.getPYRBNAM() != null && !"".equals(req.getPYRBNAM()))message.setPYRBNAM(req.getPYRBNAM());
			if(req.getPYRBAD1() != null && !"".equals(req.getPYRBAD1()))message.setPYRBAD1(req.getPYRBAD1());
			if(req.getPYRBAD2() != null && !"".equals(req.getPYRBAD2()))message.setPYRBAD2(req.getPYRBAD2());
			if(req.getPYRBAD3() != null && !"".equals(req.getPYRBAD3()))message.setPYRBAD3(req.getPYRBAD3());
			if(req.getPYRMEM1() != null && !"".equals(req.getPYRMEM1()))message.setPYRMEM1(req.getPYRMEM1());
			if(req.getPYRMEM2() != null && !"".equals(req.getPYRMEM2()))message.setPYRMEM2(req.getPYRMEM2());
			if(req.getPYRPTYP() != null && !"".equals(req.getPYRPTYP()))message.setPYRPTYP(req.getPYRPTYP());
			if(req.getPYRBACC() != null && !"".equals(req.getPYRBACC()))message.setPYRBACC(req.getPYRBACC());
			if(req.getPYRBBNK() != null && !"".equals(req.getPYRBBNK()))message.setPYRBBNK(req.getPYRBBNK());
			if(req.getPYRBBKN() != null && !"".equals(req.getPYRBBKN()))message.setPYRBBKN(req.getPYRBBKN());
			if(req.getPYRBBKAD() != null && !"".equals(req.getPYRBBKAD()))message.setPYRBBKAD(req.getPYRBBKAD());
			if(req.getPYRBBKA2() != null && !"".equals(req.getPYRBBKA2()))message.setPYRBBKA2(req.getPYRBBKA2());
			if(req.getPYRIBKID() != null && !"".equals(req.getPYRIBKID()))message.setPYRIBKID(req.getPYRIBKID());
			if(req.getPYRIBKNM() != null && !"".equals(req.getPYRIBKNM()))message.setPYRIBKNM(req.getPYRIBKNM());
			if(req.getPYRIBKAD() != null && !"".equals(req.getPYRIBKAD()))message.setPYRIBKAD(req.getPYRIBKAD());
			if(req.getPYRIBKA2() != null && !"".equals(req.getPYRIBKA2()))message.setPYRIBKA2(req.getPYRIBKA2());
			if(req.getPYRCCY() != null && !"".equals(req.getPYRCCY()))message.setPYRCCY(req.getPYRCCY());
			message.send();
			message.destroy();
			MessageRecord	 newmessage = mc.receiveMessage();
			boolean  GoIn = ((ELEERRMessage)newmessage).getERRNUM().equals("0");
			if ((newmessage.getFormatName().equals("ELEERR")) && (!GoIn)) {
				manejarError(res, ((ELEERRMessage) newmessage));
				log.error("INPYRLSJV - Pago de Nomina/Proveedores: " + " Error: "+ res.getError().getERNU01() + " - " + res.getError().getERDS01());
				return res;
			} else if (newmessage.getFormatName().equals("INPYRLSJV")) {
				List<INPYRLSJVBean> x = new ArrayList<INPYRLSJVBean>();
				while (GoIn) {
					INPYRLSJVBean bean = new INPYRLSJVBean();
					bean.setPYRUSR(((INPYRLSJVMessage) newmessage).getPYRUSR());
					bean.setPYRPID(((INPYRLSJVMessage) newmessage).getPYRPID());
					bean.setPYROPC(((INPYRLSJVMessage) newmessage).getPYROPC());
					bean.setPYREOF(((INPYRLSJVMessage) newmessage).getPYREOF());
					bean.setPYRSTS(((INPYRLSJVMessage) newmessage).getPYRSTS());
					bean.setPYRTYP(((INPYRLSJVMessage) newmessage).getPYRTYP());
					bean.setPYRFLG(((INPYRLSJVMessage) newmessage).getPYRFLG());
					bean.setPYRACC(((INPYRLSJVMessage) newmessage).getPYRACC());
					bean.setPYRAMT(((INPYRLSJVMessage) newmessage).getPYRAMT());
					bean.setPYRNUM(((INPYRLSJVMessage) newmessage).getPYRNUM());
					bean.setPYRVDD(((INPYRLSJVMessage) newmessage).getPYRVDD());
					bean.setPYRVDM(((INPYRLSJVMessage) newmessage).getPYRVDM());
					bean.setPYRVDY(((INPYRLSJVMessage) newmessage).getPYRVDY());
					bean.setPYRERD(((INPYRLSJVMessage) newmessage).getPYRERD());
					bean.setPYRBNAM(((INPYRLSJVMessage) newmessage).getPYRBNAM());
					bean.setPYRBAD1(((INPYRLSJVMessage) newmessage).getPYRBAD1());	
					bean.setPYRBAD2(((INPYRLSJVMessage) newmessage).getPYRBAD2());	
					bean.setPYRBAD3(((INPYRLSJVMessage) newmessage).getPYRBAD3());	
					bean.setPYRMEM1(((INPYRLSJVMessage) newmessage).getPYRMEM1());	
					bean.setPYRMEM2(((INPYRLSJVMessage) newmessage).getPYRMEM2());	
					bean.setPYRPTYP(((INPYRLSJVMessage) newmessage).getPYRPTYP());	
					bean.setPYRBACC(((INPYRLSJVMessage) newmessage).getPYRBACC());	
					bean.setPYRBBNK(((INPYRLSJVMessage) newmessage).getPYRBBNK());	
					bean.setPYRBBKN(((INPYRLSJVMessage) newmessage).getPYRBBKN());	
					bean.setPYRBBKAD(((INPYRLSJVMessage) newmessage).getPYRBBKAD());	
					bean.setPYRBBKA2(((INPYRLSJVMessage) newmessage).getPYRBBKA2());	
					bean.setPYRIBKID(((INPYRLSJVMessage) newmessage).getPYRIBKID());	
					bean.setPYRIBKNM(((INPYRLSJVMessage) newmessage).getPYRIBKNM());	
					bean.setPYRIBKAD(((INPYRLSJVMessage) newmessage).getPYRIBKAD());	
					bean.setPYRIBKA2(((INPYRLSJVMessage) newmessage).getPYRIBKA2());	
					bean.setPYRCCY(((INPYRLSJVMessage) newmessage).getPYRCCY());						
					x.add(bean);
					newmessage = mc.receiveMessage();
					if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("0"))) {
						manejarError(res, ((ELEERRMessage) newmessage));
						return res;
					}
					GoIn = ((ELEERRMessage)newmessage).getERRNUM().equals("0");
				}
				res.setINPYRLSJV(x.toArray(new INPYRLSJVBean[0]));		
			}
		} catch (Exception e) {
			log.error(" INPYRLSJV - Pago Nomina/Proveedores - " + e.getMessage(),e);
			throw new WSException(e);
		} finally {
			if (s != null)
				try {
					s.close();
				} catch (IOException e) {
				}
		}
		return res;
	}
	/**
	 * Servicio para el Segumiento de Gestión, consulta de pagos de nóminas y proveedores.
	 * @param req
	 * @return
	 * @throws WSException
	 */
	public INPYRLSJVResponse INPYRLSJV2(INPYRLSJVBean req) throws WSException{
		log.info("Invocando INPYRLSJV");
		Socket s = null;
		INPYRLSJVResponse res = new INPYRLSJVResponse();
		try {
			Parametros params = new Parametros();
			MessageContext mc;
			s = new Socket(params.getString("ip"), params.getInt("port1") + 2);
			s.setSoTimeout(params.getInt("timeout"));
			mc = new MessageContext(new DataInputStream(new BufferedInputStream(s.getInputStream())), new DataOutputStream(
					new BufferedOutputStream(s.getOutputStream())), "com.activo.gateway.dibs.messages");
			INPYRLSJVMessage message;
			message = (INPYRLSJVMessage) mc.getMessageRecord("INPYRLSJV");
			if(req.getPYRUSR() != null && !"".equals(req.getPYRUSR()))message.setPYRUSR(req.getPYRUSR());
			if(req.getPYRPID() != null && !"".equals(req.getPYRPID()))message.setPYRPID(req.getPYRPID());
			if(req.getPYROPC() != null && !"".equals(req.getPYROPC()))message.setPYROPC(req.getPYROPC());
			if(req.getPYREOF() != null && !"".equals(req.getPYREOF()))message.setPYREOF(req.getPYREOF());
			if(req.getPYRSTS() != null && !"".equals(req.getPYRSTS()))message.setPYRSTS(req.getPYRSTS());
			if(req.getPYRTYP() != null && !"".equals(req.getPYRTYP()))message.setPYRTYP(req.getPYRTYP());
			if(req.getPYRFLG() != null && !"".equals(req.getPYRFLG()))message.setPYRFLG(req.getPYRFLG());
			if(req.getPYRACC() != null && !"".equals(req.getPYRACC()))message.setPYRACC(req.getPYRACC());
			if(req.getPYRAMT() != null && !"".equals(req.getPYRAMT()))message.setPYRAMT(req.getPYRAMT());
			if(req.getPYRNUM() != null && !"".equals(req.getPYRNUM()))message.setPYRNUM(req.getPYRNUM());
			if(req.getPYRVDD() != null && !"".equals(req.getPYRVDD()))message.setPYRVDD(req.getPYRVDD());
			if(req.getPYRVDM() != null && !"".equals(req.getPYRVDM()))message.setPYRVDM(req.getPYRVDM());
			if(req.getPYRVDY() != null && !"".equals(req.getPYRVDY()))message.setPYRVDY(req.getPYRVDY());
			if(req.getPYRERD() != null && !"".equals(req.getPYRERD()))message.setPYRERD(req.getPYRERD());
			if(req.getPYRBNAM() != null && !"".equals(req.getPYRBNAM()))message.setPYRBNAM(req.getPYRBNAM());
			if(req.getPYRBAD1() != null && !"".equals(req.getPYRBAD1()))message.setPYRBAD1(req.getPYRBAD1());
			if(req.getPYRBAD2() != null && !"".equals(req.getPYRBAD2()))message.setPYRBAD2(req.getPYRBAD2());
			if(req.getPYRBAD3() != null && !"".equals(req.getPYRBAD3()))message.setPYRBAD3(req.getPYRBAD3());
			if(req.getPYRMEM1() != null && !"".equals(req.getPYRMEM1()))message.setPYRMEM1(req.getPYRMEM1());
			if(req.getPYRMEM2() != null && !"".equals(req.getPYRMEM2()))message.setPYRMEM2(req.getPYRMEM2());
			if(req.getPYRPTYP() != null && !"".equals(req.getPYRPTYP()))message.setPYRPTYP(req.getPYRPTYP());
			if(req.getPYRBACC() != null && !"".equals(req.getPYRBACC()))message.setPYRBACC(req.getPYRBACC());
			if(req.getPYRBBNK() != null && !"".equals(req.getPYRBBNK()))message.setPYRBBNK(req.getPYRBBNK());
			if(req.getPYRBBKN() != null && !"".equals(req.getPYRBBKN()))message.setPYRBBKN(req.getPYRBBKN());
			if(req.getPYRBBKAD() != null && !"".equals(req.getPYRBBKAD()))message.setPYRBBKAD(req.getPYRBBKAD());
			if(req.getPYRBBKA2() != null && !"".equals(req.getPYRBBKA2()))message.setPYRBBKA2(req.getPYRBBKA2());
			if(req.getPYRIBKID() != null && !"".equals(req.getPYRIBKID()))message.setPYRIBKID(req.getPYRIBKID());
			if(req.getPYRIBKNM() != null && !"".equals(req.getPYRIBKNM()))message.setPYRIBKNM(req.getPYRIBKNM());
			if(req.getPYRIBKAD() != null && !"".equals(req.getPYRIBKAD()))message.setPYRIBKAD(req.getPYRIBKAD());
			if(req.getPYRIBKA2() != null && !"".equals(req.getPYRIBKA2()))message.setPYRIBKA2(req.getPYRIBKA2());
			if(req.getPYRCCY() != null && !"".equals(req.getPYRCCY()))message.setPYRCCY(req.getPYRCCY());
			message.send();
			message.destroy();
			MessageRecord	 newmessage = mc.receiveMessage();
			if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("0"))) {
				manejarError(res, ((ELEERRMessage) newmessage));
				log.error("INPYRLSJV - Seguimiento de Gestion: " + " Error: "+ res.getError().getERNU01() + " - " + res.getError().getERDS01());
				return res;
			} else if (newmessage.getFormatName().equals("INPYRLSJV")) {
				message = (INPYRLSJVMessage) newmessage;
				boolean GoIn = message.getPYREOF().equals("*");
				List<INPYRLSJVBean> x = new ArrayList<INPYRLSJVBean>();
				while (!GoIn) {
					INPYRLSJVBean bean = new INPYRLSJVBean();
					bean.setPYRUSR(((INPYRLSJVMessage) newmessage).getPYRUSR());
					bean.setPYRPID(((INPYRLSJVMessage) newmessage).getPYRPID());
					bean.setPYROPC(((INPYRLSJVMessage) newmessage).getPYROPC());
					bean.setPYREOF(((INPYRLSJVMessage) newmessage).getPYREOF());
					bean.setPYRSTS(((INPYRLSJVMessage) newmessage).getPYRSTS());
					bean.setPYRTYP(((INPYRLSJVMessage) newmessage).getPYRTYP());
					bean.setPYRFLG(((INPYRLSJVMessage) newmessage).getPYRFLG());
					bean.setPYRACC(((INPYRLSJVMessage) newmessage).getPYRACC());
					bean.setPYRAMT(((INPYRLSJVMessage) newmessage).getPYRAMT());
					bean.setPYRNUM(((INPYRLSJVMessage) newmessage).getPYRNUM());
					bean.setPYRVDD(((INPYRLSJVMessage) newmessage).getPYRVDD());
					bean.setPYRVDM(((INPYRLSJVMessage) newmessage).getPYRVDM());
					bean.setPYRVDY(((INPYRLSJVMessage) newmessage).getPYRVDY());
					bean.setPYRERD(((INPYRLSJVMessage) newmessage).getPYRERD());
					bean.setPYRBNAM(((INPYRLSJVMessage) newmessage).getPYRBNAM());
					bean.setPYRBAD1(((INPYRLSJVMessage) newmessage).getPYRBAD1());
					bean.setPYRBAD2(((INPYRLSJVMessage) newmessage).getPYRBAD2());
					bean.setPYRBAD3(((INPYRLSJVMessage) newmessage).getPYRBAD3());
					bean.setPYRMEM1(((INPYRLSJVMessage) newmessage).getPYRMEM1());
					bean.setPYRMEM2(((INPYRLSJVMessage) newmessage).getPYRMEM2());
					bean.setPYRPTYP(((INPYRLSJVMessage) newmessage).getPYRPTYP());
					bean.setPYRBACC(((INPYRLSJVMessage) newmessage).getPYRBACC());
					bean.setPYRBBNK(((INPYRLSJVMessage) newmessage).getPYRBBNK());
					bean.setPYRBBKN(((INPYRLSJVMessage) newmessage).getPYRBBKN());
					bean.setPYRBBKAD(((INPYRLSJVMessage) newmessage).getPYRBBKAD());
					bean.setPYRBBKA2(((INPYRLSJVMessage) newmessage).getPYRBBKA2());
					bean.setPYRIBKID(((INPYRLSJVMessage) newmessage).getPYRIBKID());
					bean.setPYRIBKNM(((INPYRLSJVMessage) newmessage).getPYRIBKNM());
					bean.setPYRIBKAD(((INPYRLSJVMessage) newmessage).getPYRIBKAD());
					bean.setPYRIBKA2(((INPYRLSJVMessage) newmessage).getPYRIBKA2());
					bean.setPYRCCY(((INPYRLSJVMessage) newmessage).getPYRCCY());
					x.add(bean);
					newmessage = mc.receiveMessage();
					message = (INPYRLSJVMessage) newmessage;
					GoIn = message.getPYREOF().equals("*");
				}
				res.setINPYRLSJV(x.toArray(new INPYRLSJVBean[0]));
			}
		} catch (Exception e) {
			log.error("INPYRLSJV - Seguimiento de gestion - " + e.getMessage(),e);
			throw new WSException(e);
		} finally {
			if (s != null)
				try {
					s.close();
				} catch (IOException e) {
				}
		}
		return res;
	}
	/**
	 * Servicio para la Consulta de Servicios CANTV.
	 * @param req
	 * @return
	 * @throws WSException
	 */
	public IN098401Response IN098401(IN098401Bean req) throws WSException{
		log.info("Invocando IN098401");
		Parametros param = new Parametros();
		String cacheKey;
		if("X".equals(req.getIN984ABA())){
			cacheKey = req.getIN984ARE()+req.getIN984TLF(); // Esta es la clave con que se guarda en cache, creo que deberia ser el nro de contrato
		}else{
			
			cacheKey = "";
		}
					
		// verificar si tenemos respuesta en cache
		if(cacheCantv.containsKey(cacheKey)){
			EntradaCache<IN098401Response> resCache = cacheCantv.get(cacheKey);
			// cacular la fecha maxima de cache valido
			// le coloque una hora, verifica si ese es el tiempo
			Calendar fecha = Calendar.getInstance();
			fecha.add(Calendar.SECOND, -(param.getInt("tiempoCache"))); // restar una hora a la fecha actual
			// verificar que la respuesta en cache no haya vencido
			if(resCache.getFechaCreacion().after(fecha.getTime()) && !"".equals(cacheKey)){
				log.info("Usando cache de consulta cantv para "+cacheKey);
				return resCache.getValor();
			}
		}
		
		Socket s = null;
		IN098401Response res = new IN098401Response();
		try {
			Parametros params = new Parametros();
			MessageContext mc;
			s = new Socket(params.getString("ip"), params.getInt("port1"));
			s.setSoTimeout(params.getInt("timeout"));
			mc = new MessageContext(new DataInputStream(new BufferedInputStream(s.getInputStream())), new DataOutputStream(
					new BufferedOutputStream(s.getOutputStream())), "com.activo.gateway.dibs.messages");
			IN098401Message message = (IN098401Message) mc.getMessageRecord("IN098401");
			if(req.getIN984ABA() != null && !"".equals(req.getIN984ABA()))message.setIN984ABA(req.getIN984ABA());
			if(req.getIN984ACCT() != null && !"".equals(req.getIN984ACCT()))message.setIN984ACCT(req.getIN984ACCT());
			if(req.getIN984AMNT() != null && !"".equals(req.getIN984AMNT()))message.setIN984AMNT(req.getIN984AMNT());
			if(req.getIN984AMT() != null && !"".equals(req.getIN984AMT()))message.setIN984AMT(req.getIN984AMT());
			if(req.getIN984ARE() != null && !"".equals(req.getIN984ARE()))message.setIN984ARE(req.getIN984ARE());
			if(req.getIN984AUT() != null && !"".equals(req.getIN984AUT()))message.setIN984AUT(req.getIN984AUT());
			if(req.getIN984AVL() != null && !"".equals(req.getIN984AVL()))message.setIN984AVL(req.getIN984AVL());
			if(req.getIN984BVDD() != null && !"".equals(req.getIN984BVDD()))message.setIN984BVDD(req.getIN984BVDD());
			if(req.getIN984BVDM() != null && !"".equals(req.getIN984BVDM()))message.setIN984BVDM(req.getIN984BVDM());
			if(req.getIN984BVDY() != null && !"".equals(req.getIN984BVDY()))message.setIN984BVDY(req.getIN984BVDY());
			if(req.getIN984CON() != null && !"".equals(req.getIN984CON()))message.setIN984CON(req.getIN984CON());
			if(req.getIN984DAT() != null && !"".equals(req.getIN984DAT()))message.setIN984DAT(req.getIN984DAT());
			if(req.getIN984DS1() != null && !"".equals(req.getIN984DS1()))message.setIN984DS1(req.getIN984DS1());
			if(req.getIN984DS2() != null && !"".equals(req.getIN984DS2()))message.setIN984DS2(req.getIN984DS2());
			if(req.getIN984EXP() != null && !"".equals(req.getIN984EXP()))message.setIN984EXP(req.getIN984EXP());
			if(req.getIN984FACC() != null && !"".equals(req.getIN984FACC()))message.setIN984FACC(req.getIN984FACC());
			if(req.getIN984PER() != null && !"".equals(req.getIN984PER()))message.setIN984PER(req.getIN984PER());
			if(req.getIN984PVIA() != null && !"".equals(req.getIN984PVIA()))message.setIN984PVIA(req.getIN984PVIA());
			if(req.getIN984SER() != null && !"".equals(req.getIN984SER()))message.setIN984SER(req.getIN984SER());
			if(req.getIN984TLF() != null && !"".equals(req.getIN984TLF()))message.setIN984TLF(req.getIN984TLF());
			if(req.getIN984TYPE() != null && !"".equals(req.getIN984TYPE()))message.setIN984TYPE(req.getIN984TYPE());
			if(req.getIN984USR1() != null && !"".equals(req.getIN984USR1()))message.setIN984USR1(req.getIN984USR1());
			message.send();
			message.destroy();
			MessageRecord newmessage = mc.receiveMessage();
			if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("0"))) {
				manejarError(res, ((ELEERRMessage) newmessage));
				log.error("IN098401 - Pago Servicios CANTV: " + " Error: "+ res.getError().getERNU01() + " - " + res.getError().getERDS01() + " - Canal " + req.getCanal());
				return res;
			} else {
				res.setIN098401(new IN098401Bean());
				newmessage = mc.receiveMessage();
				if (newmessage.getFormatName().equals("IN098401")){
					message = (IN098401Message) newmessage;
					res.getIN098401().setIN984ABA(message.getIN984ABA());
					res.getIN098401().setIN984ACCT(message.getIN984ACCT());
					res.getIN098401().setIN984AMNT(message.getIN984AMNT());
					res.getIN098401().setIN984AMT(message.getIN984AMT());
					res.getIN098401().setIN984ARE(message.getIN984ARE());
					res.getIN098401().setIN984AUT(message.getIN984AUT());
					res.getIN098401().setIN984AVL(message.getIN984AVL());
					res.getIN098401().setIN984BVDD(message.getIN984BVDD());
					res.getIN098401().setIN984BVDM(message.getIN984BVDM());
					res.getIN098401().setIN984BVDY(message.getIN984BVDY());
					res.getIN098401().setIN984CON(message.getIN984CON());
					res.getIN098401().setIN984DAT(message.getIN984DAT());
					res.getIN098401().setIN984DS1(message.getIN984DS1());
					res.getIN098401().setIN984DS2(message.getIN984DS2());
					res.getIN098401().setIN984EXP(message.getIN984EXP());
					res.getIN098401().setIN984FACC(message.getIN984FACC());
					res.getIN098401().setIN984PER(message.getIN984PER());
					res.getIN098401().setIN984PVIA(message.getIN984PVIA());
					res.getIN098401().setIN984SER(message.getIN984SER());
					res.getIN098401().setIN984TLF(message.getIN984TLF());
					res.getIN098401().setIN984TYPE(message.getIN984TYPE());
					res.getIN098401().setIN984USR1(message.getIN984USR1());
				}
			}
		} catch (Exception e) {
			log.error("IN098401 - Pago Servicios CANTV - " + e.getMessage() + " - Canal " + req.getCanal(),e);
			throw new WSException(e);
		} finally {
			if (s != null)
				try {
					s.close();
				} catch (IOException e) {
				}
		}
		// Crear el objeto a guardar en cache
		EntradaCache<IN098401Response> resCache = new EntradaCache<IN098401Response>();
		resCache.setFechaCreacion(new Date()); // Establecer la fecha de creación
		resCache.setValor(res); // Guardar la respuesta del servicio en la propiedad de la entrada
		cacheCantv.put(cacheKey, resCache); // Guardar en cache
		return res;
	}
	/**
	 * Servicio para el Pago de Servicios CANTV.
	 * @param req
	 * @return
	 * @throws WSException
	 */
	public IN098401Response IN0984012(IN098401Bean req) throws WSException{
		log.info("Invocando IN0984012");
		Socket s = null;
		IN098401Response res = new IN098401Response();
		try {
			Parametros params = new Parametros();
			MessageContext mc;
			s = new Socket(params.getString("ip"), params.getInt("port1"));
			s.setSoTimeout(params.getInt("timeout"));
			mc = new MessageContext(new DataInputStream(new BufferedInputStream(s.getInputStream())), new DataOutputStream(
					new BufferedOutputStream(s.getOutputStream())), "com.activo.gateway.dibs.messages");
			IN098401Message message = (IN098401Message) mc.getMessageRecord("IN098401");
			List<IMSSGDSJVBean> x = new ArrayList<IMSSGDSJVBean>();
			if(req.getIN984ABA() != null && !"".equals(req.getIN984ABA()))message.setIN984ABA(req.getIN984ABA());
			if(req.getIN984ACCT() != null && !"".equals(req.getIN984ACCT()))message.setIN984ACCT(req.getIN984ACCT());
			if(req.getIN984AMNT() != null && !"".equals(req.getIN984AMNT()))message.setIN984AMNT(req.getIN984AMNT());
			if(req.getIN984AMT() != null && !"".equals(req.getIN984AMT()))message.setIN984AMT(req.getIN984AMT());
			if(req.getIN984ARE() != null && !"".equals(req.getIN984ARE()))message.setIN984ARE(req.getIN984ARE());
			if(req.getIN984AUT() != null && !"".equals(req.getIN984AUT()))message.setIN984AUT(req.getIN984AUT());
			if(req.getIN984AVL() != null && !"".equals(req.getIN984AVL()))message.setIN984AVL(req.getIN984AVL());
			if(req.getIN984BVDD() != null && !"".equals(req.getIN984BVDD()))message.setIN984BVDD(req.getIN984BVDD());
			if(req.getIN984BVDM() != null && !"".equals(req.getIN984BVDM()))message.setIN984BVDM(req.getIN984BVDM());
			if(req.getIN984BVDY() != null && !"".equals(req.getIN984BVDY()))message.setIN984BVDY(req.getIN984BVDY());
			if(req.getIN984CON() != null && !"".equals(req.getIN984CON()))message.setIN984CON(req.getIN984CON());
			if(req.getIN984DAT() != null && !"".equals(req.getIN984DAT()))message.setIN984DAT(req.getIN984DAT());
			if(req.getIN984DS1() != null && !"".equals(req.getIN984DS1()))message.setIN984DS1(req.getIN984DS1());
			if(req.getIN984DS2() != null && !"".equals(req.getIN984DS2()))message.setIN984DS2(req.getIN984DS2());
			if(req.getIN984EXP() != null && !"".equals(req.getIN984EXP()))message.setIN984EXP(req.getIN984EXP());
			if(req.getIN984FACC() != null && !"".equals(req.getIN984FACC()))message.setIN984FACC(req.getIN984FACC());
			if(req.getIN984PER() != null && !"".equals(req.getIN984PER()))message.setIN984PER(req.getIN984PER());
			if(req.getIN984PVIA() != null && !"".equals(req.getIN984PVIA()))message.setIN984PVIA(req.getIN984PVIA());
			if(req.getIN984SER() != null && !"".equals(req.getIN984SER()))message.setIN984SER(req.getIN984SER());
			if(req.getIN984TLF() != null && !"".equals(req.getIN984TLF()))message.setIN984TLF(req.getIN984TLF());
			if(req.getIN984TYPE() != null && !"".equals(req.getIN984TYPE()))message.setIN984TYPE(req.getIN984TYPE());
			if(req.getIN984USR1() != null && !"".equals(req.getIN984USR1()))message.setIN984USR1(req.getIN984USR1());
			message.send();
			message.destroy();
			MessageRecord newmessage = mc.receiveMessage();
			res.setIN098401(new IN098401Bean());
			if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("*"))) {
				manejarError(res, ((ELEERRMessage) newmessage));
				if(!(res.getError().getERRNUM().equals("0"))){
					log.error("IN0984012 - Pago Servicios CANTV: " + " Error: "+ res.getError().getERNU01() + " - " + res.getError().getERDS01());
					return res;
				} else {
					newmessage = mc.receiveMessage();
					if (newmessage.getFormatName().equals("IMSSGDSJV")) {
						boolean	 GoIn = ((IMSSGDSJVMessage)newmessage).getDSJIMSFIN().equals("0");
						while (GoIn){
							IMSSGDSJVBean bean2 = new IMSSGDSJVBean();
							bean2.setDSJIMSUSR(((IMSSGDSJVMessage) newmessage).getDSJIMSUSR());
							bean2.setDSJNUM(((IMSSGDSJVMessage) newmessage).getDSJNUM());
							bean2.setDSJIMSPRD(((IMSSGDSJVMessage) newmessage).getDSJIMSPRD());
							bean2.setDSJIMSCUN(((IMSSGDSJVMessage) newmessage).getDSJIMSCUN());
							bean2.setDSJIMSSDTE(((IMSSGDSJVMessage) newmessage).getDSJIMSSDTE());
							bean2.setDSJIMSSTIM(((IMSSGDSJVMessage) newmessage).getDSJIMSSTIM());
							bean2.setDSJIMSTXT(((IMSSGDSJVMessage) newmessage).getDSJIMSTXT());
							bean2.setDSJIMSLNKT(((IMSSGDSJVMessage) newmessage).getDSJIMSLNKT());
							bean2.setDSJIMSKEY(((IMSSGDSJVMessage) newmessage).getDSJIMSKEY());
							bean2.setDSJIMSNME(((IMSSGDSJVMessage) newmessage).getDSJIMSNME());
							bean2.setDSJIMSFIN(((IMSSGDSJVMessage) newmessage).getDSJIMSFIN());
							x.add(bean2);
							newmessage = mc.receiveMessage();
							if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("0"))) {
								manejarError(res, ((ELEERRMessage) newmessage));
								return res;
							}
							GoIn = ((IMSSGDSJVMessage)newmessage).getDSJIMSFIN().equals("0");
						}
						res.setIMSSGDSJV(x.toArray(new IMSSGDSJVBean[0]));
					}
					newmessage = mc.receiveMessage();
					if (newmessage.getFormatName().equals("IN098401")){
						IN098401Message msg = (IN098401Message) newmessage;
						IN098401Bean bean = new IN098401Bean();
						res.setIN098401(bean);
						bean.setIN984ABA(msg.getIN984ABA());
						bean.setIN984ACCT(msg.getIN984ACCT());
						bean.setIN984AMNT(msg.getIN984AMNT());
						bean.setIN984AMT(msg.getIN984AMT());
						bean.setIN984ARE(msg.getIN984ARE());
						bean.setIN984AUT(msg.getIN984AUT());
						bean.setIN984AVL(msg.getIN984AVL());
						bean.setIN984BVDD(msg.getIN984BVDD());
						bean.setIN984BVDM(msg.getIN984BVDM());
						bean.setIN984BVDY(msg.getIN984BVDY());
						bean.setIN984CON(msg.getIN984CON());
						bean.setIN984DAT(msg.getIN984DAT());
						bean.setIN984DS1(msg.getIN984DS1());
						bean.setIN984DS2(msg.getIN984DS2());
						bean.setIN984EXP(msg.getIN984EXP());
						bean.setIN984FACC(msg.getIN984FACC());
						bean.setIN984PER(msg.getIN984PER());
						bean.setIN984PVIA(msg.getIN984PVIA());
						bean.setIN984SER(msg.getIN984SER());
						bean.setIN984TLF(msg.getIN984TLF());
						bean.setIN984TYPE(msg.getIN984TYPE());
						bean.setIN984USR1(msg.getIN984USR1());
					}
				}
			}
		} catch (Exception e) {
			log.error("IN0984012 - Pago Servicios CANTV - " + e.getMessage(),e);
			throw new WSException(e);
		} finally {
			if (s != null)
				try {
					s.close();
				} catch (IOException e) {
				}
		}
		return res;
	}
	/**
	 * Servicio para la obtener el listado de los sellos
	 * 
	 * @param req Parámetros con los datos de petición 
	 * @return SellosResponse Respuesta del webservice
	 * @throws WSException
	 */
	public SellosResponse LISTADOSELLOS(SelloBean req) throws WSException{
		log.info("Invocando LISTADOSELLOS");
		SellosResponse res = new SellosResponse();
		res.setError(new ELEERR());
		res.getError().setERRNUM("0");		
		Database db = new Database();
		// Conexion a la base de datos
		if(db.conectar()){
			try {
				Sello[] sellos = db.buscarSellos();
				if(sellos.length==0){ // No encontro data
					res.getError().setERRNUM("1");
					res.getError().setERNU01("-3");
					res.getError().setERDS01("Sellos no encontrados");
				}
				else{
					res.setSellos(sellos);
				}
			} catch (SQLException e) {
				res.getError().setERRNUM("1");
				res.getError().setERNU01("-1");
				res.getError().setERDS01("Error SQL al buscar sellos");
				log.error(e);
			} finally {
				db.cerrar();
			}
		}
		else { // error al conectar
			res.getError().setERRNUM("1");
			res.getError().setERNU01("-1");
			res.getError().setERDS01("Error en la conexión");
		}
		if("0".equals(res.getError().getERRNUM())){
			res.setError(null);
		}
		// Fin de la invocacion
		log.info("Fin invocacion LISTADOSELLOS");
		return res;
	}
	/**
	 * Servicio para encriptar una cadena de texto por medio del algoritmo SHA1
	 * 
	 * @param request Parámetros con los datos de petición 
	 * @return Sha1Response Respuesta del webservice
	 * @throws WSException
	 */
	public Sha1Response SHA1Encrypt(Sha1Bean req) throws WSException{
		log.info("Invocando SHA1Encrypt");
		Sha1Response res = new Sha1Response();
		if( req ==null || req.getTexto()==null) return res;
		SHA1 encrypt = new SHA1();
		String texto = req.getTexto().trim();
		// verifica si utiliza el formato de salida del encriptado por defecto o el modificado
		if(req.isModificado()){
			encrypt.clear();
			Parametros p = new Parametros();
			encrypt.setHEXTAB(p.getString("hextab"));
			texto = Util.getVALCHARS(texto);
		}
		encrypt.update(texto);
		encrypt.finalize();
		res.setEncriptado(encrypt.toString().trim());
		// Fin de la invocacion
		log.info("Fin invocacion SHA1Encrypt");
		return res;
	}
	/**
	 * Para verificar las afiliaciones que tiene un usuario y montos límites de las mismas
	 * 
	 * @param ConsultaAfiliacionesRequest req
	 * @return ConsultaAfiliacionesResponse
	 */
	public AfiliacionesResponse BUSCARAFILIACIONES(AfiliacionesBean req)  throws WSException{
		log.info("Invocando BUSCARAFILIACIONES");
		AfiliacionesResponse res = new AfiliacionesResponse();
		res.setError(new ELEERR());
		res.getError().setERRNUM("0");		
		Database db = new Database();
		// Conexion a la BD
		if(db.conectar()){
			try {
				Afiliaciones[] afiliaciones; 
				afiliaciones = db.buscarAfiliaciones(req.getId_usuario(), req.getTipo_operacion(), req.getTipo_afiliacion(), req.getCanal());
				if(afiliaciones.length == 0){ // No encontro data
					res.getError().setERRNUM("1");
					res.getError().setERNU01("-5");
					res.getError().setERDS01("Afiliaciones no encontradas");
				} else{
					res.setAfiliaciones(afiliaciones);
				}
			} catch (SQLException e) {
				res.getError().setERRNUM("1");
				res.getError().setERNU01("-6");
				res.getError().setERDS01("Error SQL al buscar las afiliaciones");
				log.error(e);
			} finally {
				db.cerrar();
			}
		} else { // error al conectar
			res.getError().setERRNUM("1");
			res.getError().setERNU01("-1");
			res.getError().setERDS01("Error en la conexión");
		}
		if("0".equals(res.getError().getERRNUM())){
			res.setError(null);
		}
		// Fin de la invocacion
		log.info("Fin invocacion BUSCARAFILIACIONES");
		return res;
	}//fin consultaafiliaciones
	/**
	 * Para verificar las afiliaciones que tiene un usuario y montos límites de las mismas
	 * 
	 * @param ConsultaAfiliacionesRequest req
	 * @return ConsultaAfiliacionesResponse
	 */
	public LimitesGeneralesResponse BUSCARLIMITESGENERAL(LimitesGeneralesBean req)  throws WSException{
		log.info("Invocando BUSCARLIMITESGENERALES");
		LimitesGeneralesResponse res = new LimitesGeneralesResponse();
		res.setError(new ELEERR());
		res.getError().setERRNUM("0");		
		Database db = new Database();
		// Conexion a la BD
		if(db.conectar()){
			try {
				LimitesGenerales[] limites;
				limites = db.buscarLimitesGeneral(req.getCanal(), null);
				if(limites.length == 0){ // No encontro data
					res.getError().setERRNUM("1");
					res.getError().setERNU01("-5");
					res.getError().setERDS01("Limites no encontrados");
				} else{
					res.setLimite(limites);
				}
			} catch (SQLException e) {
				res.getError().setERRNUM("1");
				res.getError().setERNU01("-6");
				res.getError().setERDS01("Error SQL al buscar los limites generales");
				log.error(e);
			} finally {
				db.cerrar();
			}
		} else { // error al conectar
			res.getError().setERRNUM("1");
			res.getError().setERNU01("-1");
			res.getError().setERDS01("Error en la conexión");
		}
		if("0".equals(res.getError().getERRNUM())){
			res.setError(null);
		}
		// Fin de la invocacion
		log.info("Fin invocacion BUSCARLIMITESGENERALES");
		return res;
	}//fin buscar limites generales
	/**
	 * Servicio para el manejo del proceso de Auditoría Externa, Consulta las Empresas Participantes en el Proceso
	 * @param req
	 * @return 
	 * @throws WSException
	 */
	public NIB2090PFResponse NIB2090PFEMPRESAS(NIB2090PFBean req) throws WSException{
		log.info("InvocaNDO NIB2090PFEMPRESAS");
		NIB2090PFResponse res = new NIB2090PFResponse();
		Socket s = null;
		try {
			Parametros params = new Parametros();
			MessageContext mc;
			List<NIB2090PFBean> lista = new ArrayList<NIB2090PFBean>();
			s = new Socket(params.getString("ip"), params.getInt("port3"));
			s.setSoTimeout(params.getInt("timeout"));
			mc = new MessageContext(new DataInputStream(new BufferedInputStream(s.getInputStream())), new DataOutputStream(
					new BufferedOutputStream(s.getOutputStream())), "com.activo.gateway.dibs.messages");
			NIB2090PFMessage message;
			message = (NIB2090PFMessage) mc.getMessageRecord("NIB2090PF");
			if(req.getAUDCUN() != null && !"".equals(req.getAUDCUN()))message.setAUDCUN(req.getAUDCUN());
			if(req.getAUDIDN() != null && !"".equals(req.getAUDIDN()))message.setAUDIDN(req.getAUDIDN());
			if(req.getAUDNAM() != null && !"".equals(req.getAUDNAM()))message.setAUDNAM(req.getAUDNAM());
			if(req.getAUDOPC() != null && !"".equals(req.getAUDOPC()))message.setAUDOPC(req.getAUDOPC());
			if(req.getAUDUSR() != null && !"".equals(req.getAUDUSR()))message.setAUDUSR(req.getAUDUSR());
			if(req.getAUDEMP() != null && !"".equals(req.getAUDEMP()))message.setAUDEMP(req.getAUDEMP());
			if(req.getAUDNEM() != null && !"".equals(req.getAUDNEM()))message.setAUDNEM(req.getAUDNEM());
			if(req.getAUDCAN() != null && !"".equals(req.getAUDCAN()))message.setAUDCAN(req.getAUDCAN());
			if(req.getAUDCAM() != null && !"".equals(req.getAUDCAM()))message.setAUDCAM(req.getAUDCAM());
			if(req.getAUDERR() != null && !"".equals(req.getAUDERR()))message.setAUDERR(req.getAUDERR());
			if(req.getAUDCDE() != null && !"".equals(req.getAUDCDE()))message.setAUDCDE(req.getAUDCDE());
			message.send();
			message.destroy();
			MessageRecord newmessage = mc.receiveMessage();
			if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("0"))) {
				manejarError(res, ((ELEERRMessage) newmessage));
				log.error("NIB2090PF - Auditores Externos " + " Error: "+ res.getError().getERNU01() + " - " + res.getError().getERDS01() + " - Canal " + req.getCanal());
				return res;
			} else {
				if (newmessage.getFormatName().equals("NIB2090PF")) {
					boolean GoIn = !((NIB2090PFMessage) newmessage).getAUDEMP().equals("999");
					while (GoIn) {
						NIB2090PFBean bean = new NIB2090PFBean();
						bean.setAUDCUN(((NIB2090PFMessage) newmessage).getAUDCUN());
						bean.setAUDEMP(((NIB2090PFMessage) newmessage).getAUDEMP());
						bean.setAUDIDN(((NIB2090PFMessage) newmessage).getAUDIDN());
						bean.setAUDNAM(((NIB2090PFMessage) newmessage).getAUDNAM());
						bean.setAUDNEM(((NIB2090PFMessage) newmessage).getAUDNEM());
						bean.setAUDOPC(((NIB2090PFMessage) newmessage).getAUDOPC());
						bean.setAUDUSR(((NIB2090PFMessage) newmessage).getAUDUSR());	
						bean.setAUDCAN(((NIB2090PFMessage) newmessage).getAUDCAN());	
						bean.setAUDCAM(((NIB2090PFMessage) newmessage).getAUDCAM());	
						bean.setAUDERR(((NIB2090PFMessage) newmessage).getAUDERR());
						bean.setAUDCDE(((NIB2090PFMessage) newmessage).getAUDCDE());
						lista.add(bean);
						newmessage = mc.receiveMessage();
						GoIn = !((NIB2090PFMessage) newmessage).getAUDEMP().equals("999");
					}
					res.setNIB2090PF(lista.toArray(new NIB2090PFBean[0]));
				}
			}
		} catch (Exception e) {
			log.error("NIB2090PFEMPRESAS - Auditores Externos - " + e.getMessage() + " - Canal " + req.getCanal(),e);
			throw new WSException(e);
		} finally {
			if (s != null)
				try {
					s.close();
				} catch (IOException e) {
				}
		}
		return res;
	}
	/**
	 * Servicio para el manejo del proceso de Auditoría Externa, consulta los usuarios y actualiza el voto en el AS400 
	 * @param req
	 * @return
	 * @throws WSException
	 */
	public NIB2090PFResponse NIB2090PF(NIB2090PFBean req) throws WSException{
		log.info("InvocaNDO NIB2090PF");
		NIB2090PFResponse res = new NIB2090PFResponse();
		Socket s = null;
		try {
			Parametros params = new Parametros();
			MessageContext mc;
			s = new Socket(params.getString("ip"), params.getInt("port3"));
			s.setSoTimeout(params.getInt("timeout"));
			mc = new MessageContext(new DataInputStream(new BufferedInputStream(s.getInputStream())), new DataOutputStream(
					new BufferedOutputStream(s.getOutputStream())), "com.activo.gateway.dibs.messages");
			NIB2090PFMessage message;
			message = (NIB2090PFMessage) mc.getMessageRecord("NIB2090PF");
			if(req.getAUDCUN() != null && !"".equals(req.getAUDCUN()))message.setAUDCUN(req.getAUDCUN());
			if(req.getAUDIDN() != null && !"".equals(req.getAUDIDN()))message.setAUDIDN(req.getAUDIDN());
			if(req.getAUDNAM() != null && !"".equals(req.getAUDNAM()))message.setAUDNAM(req.getAUDNAM());
			if(req.getAUDOPC() != null && !"".equals(req.getAUDOPC()))message.setAUDOPC(req.getAUDOPC());
			if(req.getAUDUSR() != null && !"".equals(req.getAUDUSR()))message.setAUDUSR(req.getAUDUSR());
			if(req.getAUDEMP() != null && !"".equals(req.getAUDEMP()))message.setAUDEMP(req.getAUDEMP());
			if(req.getAUDNEM() != null && !"".equals(req.getAUDNEM()))message.setAUDNEM(req.getAUDNEM());
			if(req.getAUDCAN() != null && !"".equals(req.getAUDCAN()))message.setAUDCAN(req.getAUDCAN());
			if(req.getAUDCAM() != null && !"".equals(req.getAUDCAM()))message.setAUDCAM(req.getAUDCAM());
			if(req.getAUDERR() != null && !"".equals(req.getAUDERR()))message.setAUDERR(req.getAUDERR());
			if(req.getAUDCDE() != null && !"".equals(req.getAUDCDE()))message.setAUDCDE(req.getAUDCDE());
			message.send();
			message.destroy();
			MessageRecord newmessage = mc.receiveMessage();
			if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("0"))) {
				manejarError(res, ((ELEERRMessage) newmessage));
				log.error("NIB2090PF - Auditores Externos " + " Error: "+ res.getError().getERNU01() + " - " + res.getError().getERDS01() + " - Canal " + req.getCanal());
				return res;
			} else {
				if (newmessage.getFormatName().equals("NIB2090PF")) {
					NIB2090PFMessage msg = (NIB2090PFMessage) newmessage;
					NIB2090PFBean bean = new NIB2090PFBean();
					res.setNIB2090PF_2(bean);
					bean.setAUDCUN(msg.getAUDCUN().trim());
					bean.setAUDIDN(msg.getAUDIDN().trim());
					bean.setAUDNAM(msg.getAUDNAM().trim());
					bean.setAUDOPC(msg.getAUDOPC().trim());
					bean.setAUDUSR(msg.getAUDUSR().trim());
					bean.setAUDEMP(msg.getAUDEMP().trim());
					bean.setAUDNEM(msg.getAUDNEM().trim());
					bean.setAUDCAN(msg.getAUDCAN().trim());
					bean.setAUDCAM(msg.getAUDCAM().trim());
					bean.setAUDERR(msg.getAUDERR().trim());
					bean.setAUDCDE(msg.getAUDCDE().trim());
				}
			}
		} catch (Exception e) {
			log.error("NIB2090PF - Auditores Externos - " + e.getMessage() + " - Canal " + req.getCanal(),e);
			throw new WSException(e);
		} finally {
			if (s != null)
				try {
					s.close();
				} catch (IOException e) {
				}
		}
		return res;
	}
	/**
	 * Servicio para el manejo de Saldo Activo, consulta las afiliaciones y actualiza en el AS400
	 * @param req
	 * @return 
	 * @throws WSException
	 */
	public ECC051001Response ECC051001(ECC051001Bean req) throws WSException{
		log.info("Invocando ECC051001");
		ECC051001Response res = new ECC051001Response();
		Socket s = null;
		try {
			Parametros params = new Parametros();
			MessageContext mc;
			List<ECC051001Bean> lista = new ArrayList<ECC051001Bean>();
			s = new Socket(params.getString("ip"), params.getInt("port1") + 1);
			s.setSoTimeout(params.getInt("timeout"));
			mc = new MessageContext(new DataInputStream(new BufferedInputStream(s.getInputStream())), new DataOutputStream(
					new BufferedOutputStream(s.getOutputStream())), "com.activo.gateway.dibs.messages");
			ECC051001Message message;
			message = (ECC051001Message) mc.getMessageRecord("ECC051001");
			if(req.getH01USERID() != null && !"".equals(req.getH01USERID()))message.setH01USERID(req.getH01USERID());
			if(req.getH01PROGRM() != null && !"".equals(req.getH01PROGRM()))message.setH01PROGRM(req.getH01PROGRM());
			if(req.getH01TIMSYS() != null && !"".equals(req.getH01TIMSYS()))message.setH01TIMSYS(req.getH01TIMSYS());
			if(req.getH01SCRCOD() != null && !"".equals(req.getH01SCRCOD()))message.setH01SCRCOD(req.getH01SCRCOD());
			if(req.getH01OPECOD() != null && !"".equals(req.getH01OPECOD()))message.setH01OPECOD(req.getH01OPECOD());
			if(req.getH01FLGMAS() != null && !"".equals(req.getH01FLGMAS()))message.setH01FLGMAS(req.getH01FLGMAS());
			if(req.getH01FLGWK1() != null && !"".equals(req.getH01FLGWK1()))message.setH01FLGWK1(req.getH01FLGWK1());
			if(req.getH01FLGWK2() != null && !"".equals(req.getH01FLGWK2()))message.setH01FLGWK2(req.getH01FLGWK2());
			if(req.getH01FLGWK3() != null && !"".equals(req.getH01FLGWK3()))message.setH01FLGWK3(req.getH01FLGWK3());
			if(req.getE01PATCUN() != null && !"".equals(req.getE01PATCUN()))message.setE01PATCUN(req.getE01PATCUN());
			if(req.getE01PATACC() != null && !"".equals(req.getE01PATACC()))message.setE01PATACC(req.getE01PATACC());
			if(req.getE01PATTDC() != null && !"".equals(req.getE01PATTDC()))message.setE01PATTDC(req.getE01PATTDC());
			if(req.getE01PATNAM() != null && !"".equals(req.getE01PATNAM()))message.setE01PATNAM(req.getE01PATNAM());
			if(req.getE01PATSTS() != null && !"".equals(req.getE01PATSTS()))message.setE01PATSTS(req.getE01PATSTS());
			if(req.getE01PATOUS() != null && !"".equals(req.getE01PATOUS()))message.setE01PATOUS(req.getE01PATOUS());
			if(req.getE01PATODT() != null && !"".equals(req.getE01PATODT()))message.setE01PATODT(req.getE01PATODT());
			if(req.getE01PATCUS() != null && !"".equals(req.getE01PATCUS()))message.setE01PATCUS(req.getE01PATCUS());
			if(req.getE01PATCDT() != null && !"".equals(req.getE01PATCDT()))message.setE01PATCDT(req.getE01PATCDT());
			if(req.getE01PATTDA() != null && !"".equals(req.getE01PATTDA()))message.setE01PATTDA(req.getE01PATTDA());
			if(req.getE01PATSTA() != null && !"".equals(req.getE01PATSTA()))message.setE01PATSTA(req.getE01PATSTA());								  			  									  			  			  			  			  			  					  
			message.send();
			message.destroy();
			MessageRecord newmessage = mc.receiveMessage();
			if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("0"))) {
				manejarError(res, ((ELEERRMessage) newmessage));
				log.error("ECC051001 - Saldo Activo " + " Error: "+ res.getError().getERNU01() + " - " + res.getError().getERDS01() + " - Canal " + req.getCanal());
				return res;
			} else {
				if (newmessage.getFormatName().equals("ECC051001")) {
					boolean GoIn = !((ECC051001Message) newmessage).getH01FLGMAS().equals("*");
					while (GoIn) {
						ECC051001Bean bean = new ECC051001Bean();
						bean.setH01USERID(((ECC051001Message) newmessage).getH01USERID());
						bean.setH01PROGRM(((ECC051001Message) newmessage).getH01PROGRM());						
						bean.setH01TIMSYS(((ECC051001Message) newmessage).getH01TIMSYS());
						bean.setH01SCRCOD(((ECC051001Message) newmessage).getH01SCRCOD());
						bean.setH01OPECOD(((ECC051001Message) newmessage).getH01OPECOD());
						bean.setH01FLGMAS(((ECC051001Message) newmessage).getH01FLGMAS());
						bean.setH01FLGWK1(((ECC051001Message) newmessage).getH01FLGWK1());
						bean.setH01FLGWK2(((ECC051001Message) newmessage).getH01FLGWK2());
						bean.setH01FLGWK3(((ECC051001Message) newmessage).getH01FLGWK3());
						bean.setE01PATCUN(((ECC051001Message) newmessage).getE01PATCUN());
						bean.setE01PATACC(((ECC051001Message) newmessage).getE01PATACC());
						bean.setE01PATTDC(((ECC051001Message) newmessage).getE01PATTDC());
						bean.setE01PATNAM(((ECC051001Message) newmessage).getE01PATNAM());
						bean.setE01PATSTS(((ECC051001Message) newmessage).getE01PATSTS());
						bean.setE01PATOUS(((ECC051001Message) newmessage).getE01PATOUS());
						bean.setE01PATODT(((ECC051001Message) newmessage).getE01PATODT());
						bean.setE01PATCUS(((ECC051001Message) newmessage).getE01PATCUS());
						bean.setE01PATCDT(((ECC051001Message) newmessage).getE01PATCDT());
						bean.setE01PATTDA(((ECC051001Message) newmessage).getE01PATTDA());
						bean.setE01PATSTA(((ECC051001Message) newmessage).getE01PATSTA());
						
						lista.add(bean);
						newmessage = mc.receiveMessage();
						GoIn = !((ECC051001Message) newmessage).getH01FLGMAS().equals("*");
					}
					res.setECC051001(lista.toArray(new ECC051001Bean[0]));
				}
			}
		} catch (Exception e) {
			log.error("ECC051001 - Saldo Activo - " + e.getMessage() + " - Canal " + req.getCanal(),e);
			throw new WSException(e);
		} finally {
			if (s != null)
				try {
					s.close();
				} catch (IOException e) {
				}
		}
		return res;
	}
	/**
	 * Servicio para consultar los compromisos de pago del seniat
	 *  @param req 
	 *  @return
	 *  @throws WSException 
	 */
	public IN097001Response IN097001(IN097001Bean req) throws WSException {
		log.info("Invocando IN097001");
		Socket s = null;
		IN097001Response res = new IN097001Response();
		try {
			Parametros params = new Parametros();
			MessageContext mc;
			s = new Socket(params.getString("ip"), params.getInt("port1")+1);
			s.setSoTimeout(120000); 
			mc = new MessageContext(new DataInputStream(new BufferedInputStream(s.getInputStream())), new DataOutputStream(
					new BufferedOutputStream(s.getOutputStream())), "com.activo.gateway.dibs.messages");
			IN097001Message message = (IN097001Message) mc.getMessageRecord("IN097001");
			if(req.getIN9701IDUS() != null && !"".equals(req.getIN9701IDUS()))message.setIN9701IDUS(req.getIN9701IDUS());
			if(req.getIN9701BVDM() != null && !"".equals(req.getIN9701BVDM()))message.setIN9701BVDM(req.getIN9701BVDM());
			if(req.getIN9701BVDD() != null && !"".equals(req.getIN9701BVDD()))message.setIN9701BVDD(req.getIN9701BVDD());
			if(req.getIN9701BVDY() != null && !"".equals(req.getIN9701BVDY()))message.setIN9701BVDY(req.getIN9701BVDY());
			if(req.getIN9701RIFC() != null && !"".equals(req.getIN9701RIFC()))message.setIN9701RIFC(req.getIN9701RIFC());
			if(req.getIN9701RIFP() != null && !"".equals(req.getIN9701RIFP()))message.setIN9701RIFP(req.getIN9701RIFP());
			if(req.getIN9701TSPI() != null && !"".equals(req.getIN9701TSPI()))message.setIN9701TSPI(req.getIN9701TSPI());
			if(req.getIN9701NTER() != null && !"".equals(req.getIN9701NTER()))message.setIN9701NTER(req.getIN9701NTER());
			message.send();
			message.destroy();
			MessageRecord newmessage = mc.receiveMessage();
			if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("0"))) {
				manejarError(res, ((ELEERRMessage) newmessage));
				log.error("IN097001 - Compromisos de Pago SENIAT: " + " Error: "+ res.getError().getERNU01() + " - " + res.getError().getERDS01() + " - Canal " + req.getCanal());
				return res;
			} else if (newmessage.getFormatName().equals("IN097001")) {
				List<IN097001Bean> x = new ArrayList<IN097001Bean>();
				boolean GoIn = !((IN097001Message)newmessage).getIN9701EOF1().equals("*");
				while (GoIn) {
					IN097001Bean bean = new IN097001Bean();
					bean.setIN9701IDUS(((IN097001Message) newmessage).getIN9701IDUS());
					bean.setIN9701BVDM(((IN097001Message) newmessage).getIN9701BVDM());
					bean.setIN9701BVDD(((IN097001Message) newmessage).getIN9701BVDD());
					bean.setIN9701BVDY(((IN097001Message) newmessage).getIN9701BVDY());
					bean.setIN9701RIFC(((IN097001Message) newmessage).getIN9701RIFC());
					bean.setIN9701RIFP(((IN097001Message) newmessage).getIN9701RIFP());
					bean.setIN9701TSPI(((IN097001Message) newmessage).getIN9701TSPI());
					bean.setIN9701NTER(((IN097001Message) newmessage).getIN9701NTER());
					bean.setIN9701CRES(((IN097001Message) newmessage).getIN9701CRES());
					bean.setIN9701MRES(((IN097001Message) newmessage).getIN9701MRES());
					
					bean.setIN9701IDCO(((IN097001Message) newmessage).getIN9701IDCO());
					bean.setIN9701ANTI(((IN097001Message) newmessage).getIN9701ANTI());
					bean.setIN9701ESTA(((IN097001Message) newmessage).getIN9701ESTA());
					bean.setIN9701NCTA(((IN097001Message) newmessage).getIN9701NCTA());
					bean.setIN9701TCTA(((IN097001Message) newmessage).getIN9701TCTA());
					bean.setIN9701CFOR(((IN097001Message) newmessage).getIN9701CFOR());
					bean.setIN9701NPLA(((IN097001Message) newmessage).getIN9701NPLA());
					bean.setIN9701CAGE(((IN097001Message) newmessage).getIN9701CAGE());
					bean.setIN9701PLIQ(((IN097001Message) newmessage).getIN9701PLIQ());
					bean.setIN9701MTOT(((IN097001Message) newmessage).getIN9701MTOT());
					bean.setIN9701CIMN(((IN097001Message) newmessage).getIN9701CIMN());
					bean.setIN9701CIML(((IN097001Message) newmessage).getIN9701CIML());
					bean.setIN9701CONC(((IN097001Message) newmessage).getIN9701CONC());
					bean.setIN9701DESC(((IN097001Message) newmessage).getIN9701DESC());
					bean.setIN9701FVCT(((IN097001Message) newmessage).getIN9701FVCT());
					bean.setIN9701CADU(((IN097001Message) newmessage).getIN9701CADU());
					bean.setIN9701NADU(((IN097001Message) newmessage).getIN9701NADU());
					bean.setIN9701NEXP(((IN097001Message) newmessage).getIN9701NEXP());
					bean.setIN9701NPOR(((IN097001Message) newmessage).getIN9701NPOR());
					bean.setIN9701UFUT(((IN097001Message) newmessage).getIN9701UFUT());
					bean.setIN9701EOF1(((IN097001Message) newmessage).getIN9701EOF1());
					x.add(bean);
					newmessage = mc.receiveMessage();
					if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("0"))) {
						manejarError(res, ((ELEERRMessage) newmessage));
						return res;
					}
					message = (IN097001Message)newmessage;
					GoIn = !((IN097001Message)newmessage).getIN9701EOF1().equals("*");
				}
				res.setIN097001(x.toArray(new IN097001Bean[0]));
			}
		} catch (SocketTimeoutException e) {
			ELEERR error = new ELEERR();
			error.setERRNUM("1");
			error.setERNU01("ST1");
			error.setERDS01("IN097001 - SocketTimeoutException " + e.getMessage());
			res.setError(error);			
		} catch (Exception e) {
			log.error("IN097001 - Compromisos de Pago Seniat - " + e.getMessage() + " - Canal " + req.getCanal(),e);
			throw new WSException(e);
		} finally {
			if (s != null)
				try {
					s.close();
				} catch (IOException e) {
				}
		}
		return res;
	}
	
	/**
	 * Servicio para el Pago de TDC Propias/Terceros.
	 * @param req
	 * @return
	 * @throws WSException
	 */
	public IN097002Response IN097002(IN097002Bean req) throws WSException{
		log.info("Invocando IN097002");
		Socket s = null;
		IN097002Response res = new IN097002Response();
		try {
			Parametros params = new Parametros();
			MessageContext mc;
			s = new Socket(params.getString("ip"), params.getInt("port1")+1);
			s.setSoTimeout(180000);
			mc = new MessageContext(new DataInputStream(new BufferedInputStream(s.getInputStream())), new DataOutputStream(
					new BufferedOutputStream(s.getOutputStream())), "com.activo.gateway.dibs.messages");
			IN097002Message message = (IN097002Message) mc.getMessageRecord("IN097002");
			if(req.getIN9702IDUS() != null && !"".equals(req.getIN9702IDUS()))message.setIN9702IDUS(req.getIN9702IDUS());
			if(req.getIN9702BVDM() != null && !"".equals(req.getIN9702BVDM()))message.setIN9702BVDM(req.getIN9702BVDM());
			if(req.getIN9702BVDD() != null && !"".equals(req.getIN9702BVDD()))message.setIN9702BVDD(req.getIN9702BVDD());
			if(req.getIN9702BVDY() != null && !"".equals(req.getIN9702BVDY()))message.setIN9702BVDY(req.getIN9702BVDY());
			if(req.getIN9702FACC() != null && !"".equals(req.getIN9702FACC()))message.setIN9702FACC(req.getIN9702FACC());
			if(req.getIN9702ACCT() != null && !"".equals(req.getIN9702ACCT()))message.setIN9702ACCT(req.getIN9702ACCT());
			if(req.getIN9702IDCO() != null && !"".equals(req.getIN9702IDCO()))message.setIN9702IDCO(req.getIN9702IDCO());
			if(req.getIN9702RIFP() != null && !"".equals(req.getIN9702RIFP()))message.setIN9702RIFP(req.getIN9702RIFP());
			if(req.getIN9702CFOR() != null && !"".equals(req.getIN9702CFOR()))message.setIN9702CFOR(req.getIN9702CFOR());
			if(req.getIN9702NPLA() != null && !"".equals(req.getIN9702NPLA()))message.setIN9702NPLA(req.getIN9702NPLA());
			if(req.getIN9702RIFC() != null && !"".equals(req.getIN9702RIFC()))message.setIN9702RIFC(req.getIN9702RIFC());
			if(req.getIN9702CING() != null && !"".equals(req.getIN9702CING()))message.setIN9702CING(req.getIN9702CING());
			if(req.getIN9702PLIQ() != null && !"".equals(req.getIN9702PLIQ()))message.setIN9702PLIQ(req.getIN9702PLIQ());
			if(req.getIN9702EFEC() != null && !"".equals(req.getIN9702EFEC()))message.setIN9702EFEC(req.getIN9702EFEC());
			if(req.getIN9702MTOT() != null && !"".equals(req.getIN9702MTOT()))message.setIN9702MTOT(req.getIN9702MTOT());
			if(req.getIN9702CADU() != null && !"".equals(req.getIN9702CADU()))message.setIN9702CADU(req.getIN9702CADU());
			if(req.getIN9702CCAD() != null && !"".equals(req.getIN9702CCAD()))message.setIN9702CCAD(req.getIN9702CCAD());
			if(req.getIN9702CSAD() != null && !"".equals(req.getIN9702CSAD()))message.setIN9702CSAD(req.getIN9702CSAD());
			if(req.getIN9702CERO() != null && !"".equals(req.getIN9702CERO()))message.setIN9702CERO(req.getIN9702CERO());
			if(req.getIN9702IT90() != null && !"".equals(req.getIN9702IT90()))message.setIN9702IT90(req.getIN9702IT90());
			if(req.getIN9702CAGE() != null && !"".equals(req.getIN9702CAGE()))message.setIN9702CAGE(req.getIN9702CAGE());
			if(req.getIN9702NTER() != null && !"".equals(req.getIN9702NTER()))message.setIN9702NTER(req.getIN9702NTER());
			if(req.getIN9702ICAJ() != null && !"".equals(req.getIN9702ICAJ()))message.setIN9702ICAJ(req.getIN9702ICAJ());
			if(req.getIN9702CTRS() != null && !"".equals(req.getIN9702CTRS()))message.setIN9702CTRS(req.getIN9702CTRS());
			if(req.getIN9702CRES() != null && !"".equals(req.getIN9702CRES()))message.setIN9702CRES(req.getIN9702CRES());
			if(req.getIN9702MRES() != null && !"".equals(req.getIN9702MRES()))message.setIN9702MRES(req.getIN9702MRES());
			if(req.getIN9702NTRS() != null && !"".equals(req.getIN9702NTRS()))message.setIN9702NTRS(req.getIN9702NTRS());
			if(req.getIN9702TXNN() != null && !"".equals(req.getIN9702TXNN()))message.setIN9702TXNN(req.getIN9702TXNN());
			if(req.getIN9702CSBA() != null && !"".equals(req.getIN9702CSBA()))message.setIN9702CSBA(req.getIN9702CSBA());
			if(req.getIN9702IOPE() != null && !"".equals(req.getIN9702IOPE()))message.setIN9702IOPE(req.getIN9702IOPE());
			if(req.getIN9702NAUT() != null && !"".equals(req.getIN9702NAUT()))message.setIN9702NAUT(req.getIN9702NAUT());
			if(req.getIN9702RSOC() != null && !"".equals(req.getIN9702RSOC()))message.setIN9702RSOC(req.getIN9702RSOC());
			if(req.getIN9702MIST() != null && !"".equals(req.getIN9702MIST()))message.setIN9702MIST(req.getIN9702MIST());
			if(req.getIN9702IREC() != null && !"".equals(req.getIN9702IREC()))message.setIN9702IREC(req.getIN9702IREC());
			if(req.getIN9702MREC() != null && !"".equals(req.getIN9702MREC()))message.setIN9702MREC(req.getIN9702MREC());
			if(req.getIN9702FILL() != null && !"".equals(req.getIN9702FILL()))message.setIN9702FILL(req.getIN9702FILL());
			if(req.getIN9702TSPI() != null && !"".equals(req.getIN9702TSPI()))message.setIN9702TSPI(req.getIN9702TSPI());
			if(req.getIN9702NCTA() != null && !"".equals(req.getIN9702NCTA()))message.setIN9702NCTA(req.getIN9702NCTA());
			if(req.getIN9702TCTA() != null && !"".equals(req.getIN9702TCTA()))message.setIN9702TCTA(req.getIN9702TCTA());
			if(req.getIN9702ANTI() != null && !"".equals(req.getIN9702ANTI()))message.setIN9702ANTI(req.getIN9702ANTI());
			if(req.getIN9702ESTA() != null && !"".equals(req.getIN9702ESTA()))message.setIN9702ESTA(req.getIN9702ESTA());
			if(req.getIN9702CIMN() != null && !"".equals(req.getIN9702CIMN()))message.setIN9702CIMN(req.getIN9702CIMN());
			if(req.getIN9702CIML() != null && !"".equals(req.getIN9702CIML()))message.setIN9702CIML(req.getIN9702CIML());
			if(req.getIN9702CONC() != null && !"".equals(req.getIN9702CONC()))message.setIN9702CONC(req.getIN9702CONC());
			if(req.getIN9702DESC() != null && !"".equals(req.getIN9702DESC()))message.setIN9702DESC(req.getIN9702DESC());
			if(req.getIN9702FVCT() != null && !"".equals(req.getIN9702FVCT()))message.setIN9702FVCT(req.getIN9702FVCT());
			if(req.getIN9702NADU() != null && !"".equals(req.getIN9702NADU()))message.setIN9702NADU(req.getIN9702NADU());
			if(req.getIN9702NEXP() != null && !"".equals(req.getIN9702NEXP()))message.setIN9702NEXP(req.getIN9702NEXP());
			if(req.getIN9702NPOR() != null && !"".equals(req.getIN9702NPOR()))message.setIN9702NPOR(req.getIN9702NPOR());
			
			message.send();
			message.destroy();
			MessageRecord newmessage = mc.receiveMessage();
			if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("*"))) {
				manejarError(res, ((ELEERRMessage) newmessage));
				if(!(res.getError().getERRNUM().equals("0"))){
					log.error("IN097002 - Pago Compromisos Seniat - Error: "+ res.getError().getERNU01() + " - " + res.getError().getERDS01() + " - Canal " + req.getCanal());
					return res;
				} else {
					if (newmessage.getFormatName().equals("IMSSGDSJV")) {
				
						List<IMSSGDSJVBean> x = new ArrayList<IMSSGDSJVBean>();
						boolean GoIn = ((IMSSGDSJVMessage)newmessage).getDSJIMSFIN().equals("0");
						
						while (GoIn) {
							IMSSGDSJVBean bean2 = new IMSSGDSJVBean();
			
							bean2.setDSJIMSUSR(((IMSSGDSJVMessage) newmessage).getDSJIMSUSR());
							bean2.setDSJNUM(((IMSSGDSJVMessage) newmessage).getDSJNUM());
							bean2.setDSJIMSPRD(((IMSSGDSJVMessage) newmessage).getDSJIMSPRD());
							bean2.setDSJIMSCUN(((IMSSGDSJVMessage) newmessage).getDSJIMSCUN());
							bean2.setDSJIMSSDTE(((IMSSGDSJVMessage) newmessage).getDSJIMSSDTE());
							bean2.setDSJIMSSTIM(((IMSSGDSJVMessage) newmessage).getDSJIMSSTIM());
							bean2.setDSJIMSTXT(((IMSSGDSJVMessage) newmessage).getDSJIMSTXT());
							bean2.setDSJIMSLNKT(((IMSSGDSJVMessage) newmessage).getDSJIMSLNKT());
							bean2.setDSJIMSKEY(((IMSSGDSJVMessage) newmessage).getDSJIMSKEY());
							bean2.setDSJIMSNME(((IMSSGDSJVMessage) newmessage).getDSJIMSNME());
							bean2.setDSJIMSFIN(((IMSSGDSJVMessage) newmessage).getDSJIMSFIN());
			
							x.add(bean2);
							newmessage = mc.receiveMessage();
			
							if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("0"))) {
								manejarError(res, ((ELEERRMessage) newmessage));
								return res;
							}
							GoIn = ((IMSSGDSJVMessage)newmessage).getDSJIMSFIN().equals("0");
						}
					}
				}
			}
		} catch (SocketTimeoutException e) {
			ELEERR error = new ELEERR();
			error.setERRNUM("1");
			error.setERNU01("ST1");
			error.setERDS01("IN097002 - SocketTimeoutException " + e.getMessage());
			res.setError(error);			
		} catch (Exception e) {
			log.error("IN097002 - Pago Compromisos Seniat - " + e.getMessage() + " - Canal " + req.getCanal(),e);
			throw new WSException(e);
		} finally {
			if (s != null)
				try {
					s.close();
				} catch (IOException e) {}
		}
		return res;
	}	
	
	/**
	 * Servicio para validar el RIF de un Cliente en particular.
	 * @param req
	 * @return
	 * @throws WSException
	 */
	public IN097101Response IN097101(IN097101Bean req) throws WSException{
		log.info("Invocando IN097101");
		Socket s = null;
		IN097101Response res = new IN097101Response();
		try {
			Parametros params = new Parametros();
			MessageContext mc;
			s = new Socket(params.getString("ip"), params.getInt("port1")+1);
			s.setSoTimeout(params.getInt("timeout"));
			mc = new MessageContext(new DataInputStream(new BufferedInputStream(s.getInputStream())), new DataOutputStream(
					new BufferedOutputStream(s.getOutputStream())), "com.activo.gateway.dibs.messages");
			IN097101Message message;
			message = (IN097101Message) mc.getMessageRecord("IN097101");
			if(req.getRSTATUS() != null && !"".equals(req.getRSTATUS()))message.setRSTATUS(req.getRSTATUS());
			if(req.getRNRORIF() != null && !"".equals(req.getRNRORIF()))message.setRNRORIF(req.getRNRORIF());
			if(req.getRDIGITO() != null && !"".equals(req.getRDIGITO()))message.setRDIGITO(req.getRDIGITO());
			if(req.getXUSUARIO() != null && !"".equals(req.getXUSUARIO()))message.setXUSUARIO(req.getXUSUARIO());
			if(req.getXNROTARJ() != null && !"".equals(req.getXNROTARJ()))message.setXNROTARJ(req.getXNROTARJ());
			if(req.getXNROCTA() != null && !"".equals(req.getXNROCTA()))message.setXNROCTA(req.getXNROCTA());
			message.send();
			message.destroy();
			MessageRecord newmessage = mc.receiveMessage();
			if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("0"))) {
				manejarError(res, ((ELEERRMessage) newmessage));
				log.error("IN097101 - Generación de Digito RIF: " + " Error: "+ res.getError().getERNU01() + " - " + res.getError().getERDS01() + " - Canal " + req.getCanal());
				return res;
			}
			IN097101Message newmessage2 = (IN097101Message) newmessage;
			res.setINVALRIF(new IN097101Bean());
			res.getINVALRIF().setRSTATUS(newmessage2.getRSTATUS());
			res.getINVALRIF().setRNRORIF(newmessage2.getRNRORIF());
			res.getINVALRIF().setRDIGITO(newmessage2.getRDIGITO());
			res.getINVALRIF().setXUSUARIO(newmessage2.getXUSUARIO());
			res.getINVALRIF().setXNROTARJ(newmessage2.getXNROTARJ());
			res.getINVALRIF().setXNROCTA(newmessage2.getXNROCTA());
		} catch (Exception e) {
			log.error("IN097101 - Generación de Digito RIF - " + e.getMessage() + " - Canal " + req.getCanal(),e);
			throw new WSException(e);
		} finally {
			if (s != null)
				try {
					s.close();
				} catch (IOException e) {
				}
		}
		return res;
	}
	/**
	 * Servicio para la creación de usuario desde el IBS.
	 * @param req
	 * @return
	 * @throws WSException
	 */
	public RegisterResponse REGISTER(RegisterBean req) throws WSException {
		log.info("Invocando REGISTER");
	
		Socket s = null;
	
		RegisterResponse res = new RegisterResponse();
	
		try {
			Parametros params = new Parametros();
	
			MessageContext mc;
	
			s = new Socket(params.getString("ip"), params.getInt("port1"));
			s.setSoTimeout(params.getInt("timeout"));
	
			mc = new MessageContext(new DataInputStream(new BufferedInputStream(s.getInputStream())), new DataOutputStream(
					new BufferedOutputStream(s.getOutputStream())), "com.activo.gateway.dibs.messages");
	
			REGISTERMessage message = (REGISTERMessage) mc.getMessageRecord("REGISTER");
			if(req.getREGOPT() != null && !"".equals(req.getREGOPT()))
				message.setREGOPT(req.getREGOPT());
			if(req.getREGSUB() != null && !"".equals(req.getREGSUB()))
				message.setREGSUB(req.getREGSUB());
			if(req.getREGUSR() != null && !"".equals(req.getREGUSR()))
				message.setREGUSR(req.getREGUSR());
			if(req.getREGUSP() != null && !"".equals(req.getREGUSP()))
				message.setREGUSP(req.getREGUSP());
			if(req.getREGOPP() != null && !"".equals(req.getREGOPP()))
				message.setREGOPP(req.getREGOPP());
			if(req.getREGIDN() != null && !"".equals(req.getREGIDN()))
				message.setREGIDN(req.getREGIDN());
			if(req.getREGLGT() != null && !"".equals(req.getREGLGT()))
				message.setREGLGT(req.getREGLGT());
			if(req.getREGACN() != null && !"".equals(req.getREGACN()))
				message.setREGACN(req.getREGACN());
			if(req.getREGACP() != null && !"".equals(req.getREGACP()))
				message.setREGACP(req.getREGACP());
			if(req.getREGCON() != null && !"".equals(req.getREGCON()))
				message.setREGCON(req.getREGCON());
			if(req.getREGEML() != null && !"".equals(req.getREGEML()))
				message.setREGEML(req.getREGEML());
			if(req.getREGPAS() != null && !"".equals(req.getREGPAS()))
				message.setREGPAS(req.getREGPAS());
			if(req.getREGQS1() != null && !"".equals(req.getREGQS1()))
				message.setREGQS1(req.getREGQS1());
			if(req.getREGQS2() != null && !"".equals(req.getREGQS2()))
				message.setREGQS2(req.getREGQS2());
			if(req.getREGQS3() != null && !"".equals(req.getREGQS3()))
				message.setREGQS3(req.getREGQS3());
			if(req.getREGAS1() != null && !"".equals(req.getREGAS1()))
				message.setREGAS1(req.getREGAS1());
			if(req.getREGAS2() != null && !"".equals(req.getREGAS2()))
				message.setREGAS2(req.getREGAS2());
			if(req.getREGAS3() != null && !"".equals(req.getREGAS3()))
				message.setREGAS3(req.getREGAS3());
			if(req.getREGFL1() != null && !"".equals(req.getREGFL1()))
				message.setREGFL1(req.getREGFL1());
			if(req.getREGFL2() != null && !"".equals(req.getREGFL2()))
				message.setREGFL2(req.getREGFL2());
			if(req.getREGLI1() != null && !"".equals(req.getREGLI1()))
				message.setREGLI1(req.getREGLI1());
			if(req.getREGLI2() != null && !"".equals(req.getREGLI2()))
				message.setREGLI2(req.getREGLI2());
			if(req.getREGLI3() != null && !"".equals(req.getREGLI3()))
				message.setREGLI3(req.getREGLI3());
			if(req.getREGLI4() != null && !"".equals(req.getREGLI4()))
				message.setREGLI4(req.getREGLI4());
			if(req.getREGAC1() != null && !"".equals(req.getREGAC1()))
				message.setREGAC1(req.getREGAC1());
			if(req.getREGAC2() != null && !"".equals(req.getREGAC2()))
				message.setREGAC2(req.getREGAC2());
			if(req.getREGAC3() != null && !"".equals(req.getREGAC3()))
				message.setREGAC3(req.getREGAC3());
			if(req.getREGAC4() != null && !"".equals(req.getREGAC4()))
				message.setREGAC4(req.getREGAC4());
			if(req.getREGSLI() != null && !"".equals(req.getREGSLI()))
				message.setREGSLI(req.getREGSLI());
			if(req.getREGSLT() != null && !"".equals(req.getREGSLT()))
				message.setREGSLT(req.getREGSLT());
			if(req.getREGSLE() != null && !"".equals(req.getREGSLE()))
				message.setREGSLE(req.getREGSLE());
			if(req.getREGSL4() != null && !"".equals(req.getREGSL4()))
				message.setREGSL4(req.getREGSL4());
			if(req.getREGSAI() != null && !"".equals(req.getREGSAI()))
				message.setREGSAI(req.getREGSAI());
			if(req.getREGSAT() != null && !"".equals(req.getREGSAT()))
				message.setREGSAT(req.getREGSAT());
			if(req.getREGSAE() != null && !"".equals(req.getREGSAE()))
				message.setREGSAE(req.getREGSAE());
			if(req.getREGSA4() != null && !"".equals(req.getREGSA4()))
				message.setREGSA4(req.getREGSA4());
	
			message.send();
			message.destroy();
	
			MessageRecord newmessage = mc.receiveMessage();
	
			res.setRegister(new RegisterBean());
	
			if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("0"))) {
				res.getRegister().setREGFL2("Y");
				manejarError(res, ((ELEERRMessage) newmessage));
				return res;
			}
	
			newmessage = mc.receiveMessage();
	
			if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("0"))) {
				res.getRegister().setREGFL2("Y");
				manejarError(res, ((ELEERRMessage) newmessage));
				return res;
			}
	
			message = (REGISTERMessage) newmessage;
	
			res.getRegister().setREGAC1(message.getREGAC1());
			res.getRegister().setREGAC2(message.getREGAC2());
			res.getRegister().setREGAC3(message.getREGAC3());
			res.getRegister().setREGAC4(message.getREGAC4());
			res.getRegister().setREGACN(message.getREGACN());
			res.getRegister().setREGACP(message.getREGACP());
			res.getRegister().setREGAS1(message.getREGAS1());
			res.getRegister().setREGAS2(message.getREGAS2());
			res.getRegister().setREGAS3(message.getREGAS3());
			res.getRegister().setREGCON(message.getREGCON());
			res.getRegister().setREGEML(message.getREGEML());
			res.getRegister().setREGFL1(message.getREGFL1());
			res.getRegister().setREGFL2(message.getREGFL2());
			res.getRegister().setREGIDN(message.getREGIDN());
			res.getRegister().setREGLGT(message.getREGLGT());
			res.getRegister().setREGLI1(message.getREGLI1());
			res.getRegister().setREGLI2(message.getREGLI2());
			res.getRegister().setREGLI3(message.getREGLI3());
			res.getRegister().setREGLI4(message.getREGLI4());
			res.getRegister().setREGOPP(message.getREGOPP());
			res.getRegister().setREGPAS(message.getREGPAS());
			res.getRegister().setREGQS1(message.getREGQS1());
			res.getRegister().setREGQS2(message.getREGQS2());
			res.getRegister().setREGQS3(message.getREGQS3());
			res.getRegister().setREGSA4(message.getREGSA4());
			res.getRegister().setREGSAE(message.getREGSAE());
			res.getRegister().setREGSAI(message.getREGSAI());
			res.getRegister().setREGSAT(message.getREGSAT());
			res.getRegister().setREGSL4(message.getREGSL4());
			res.getRegister().setREGSLE(message.getREGSLE());
			res.getRegister().setREGSLI(message.getREGSLI());
			res.getRegister().setREGSLT(message.getREGSLT());
			res.getRegister().setREGSUB(message.getREGSUB());
			res.getRegister().setREGUSP(message.getREGUSP());
			res.getRegister().setREGUSR(message.getREGUSR());
	
		} catch (Exception e) {
			log.error(e);
			throw new WSException(e);
		} finally {
			if (s != null)
				try {
					s.close();
				} catch (IOException e) {
				}
		}
	
		return res;
	}
        
	/**
	 * Servicio para consulta o pago de digitel
	 * @param req
	 * @return
	 * @throws WSException
	 */
	public IN098801Response IN098801(IN098801Bean req) throws WSException{
		log.info("Invocando IN098801");
		Socket s = null;
		IN098801Response res = new IN098801Response();
		try {
			Parametros params = new Parametros();
			MessageContext mc;
			s = new Socket(params.getString("ip"), params.getInt("port1")+1);
			s.setSoTimeout(params.getInt("timeout"));
			mc = new MessageContext(new DataInputStream(new BufferedInputStream(s.getInputStream())), new DataOutputStream(
					new BufferedOutputStream(s.getOutputStream())), "com.activo.gateway.dibs.messages");
			IN098801Message message;
			message = (IN098801Message) mc.getMessageRecord("IN098801");
			if(req.getIN988IDUS() != null && !"".equals(req.getIN988IDUS()))message.setIN988IDUS(req.getIN988IDUS());
			if(req.getIN988FACC() != null && !"".equals(req.getIN988FACC()))message.setIN988FACC(req.getIN988FACC());
			if(req.getIN988TYPE() != null && !"".equals(req.getIN988TYPE()))message.setIN988TYPE(req.getIN988TYPE());
			if(req.getIN988AMNT() != null && !"".equals(req.getIN988AMNT()))message.setIN988AMNT(req.getIN988AMNT());
			if(req.getIN988BVDM() != null && !"".equals(req.getIN988BVDM()))message.setIN988BVDM(req.getIN988BVDM());
			if(req.getIN988BVDD() != null && !"".equals(req.getIN988BVDD()))message.setIN988BVDD(req.getIN988BVDD());
			if(req.getIN988BVDY() != null && !"".equals(req.getIN988BVDY()))message.setIN988BVDY(req.getIN988BVDY());
			if(req.getIN988FFAC() != null && !"".equals(req.getIN988FFAC()))message.setIN988FFAC(req.getIN988FFAC());
			if(req.getIN988PFAC() != null && !"".equals(req.getIN988PFAC()))message.setIN988PFAC(req.getIN988PFAC());
			if(req.getIN988CSER() != null && !"".equals(req.getIN988CSER()))message.setIN988CSER(req.getIN988CSER());
			if(req.getIN988CARE() != null && !"".equals(req.getIN988CARE()))message.setIN988CARE(req.getIN988CARE());
			if(req.getIN988NTLF() != null && !"".equals(req.getIN988NTLF()))message.setIN988NTLF(req.getIN988NTLF());
			if(req.getIN988MFAC() != null && !"".equals(req.getIN988MFAC()))message.setIN988MFAC(req.getIN988MFAC());
			if(req.getIN988MDEU() != null && !"".equals(req.getIN988MDEU()))message.setIN988MDEU(req.getIN988MDEU());
			if(req.getIN988DS1() != null && !"".equals(req.getIN988DS1()))message.setIN988DS1(req.getIN988DS1());
			if(req.getIN988DS2() != null && !"".equals(req.getIN988DS2()))message.setIN988DS2(req.getIN988DS2());
			if(req.getIN988NCLT() != null && !"".equals(req.getIN988NCLT()))message.setIN988NCLT(req.getIN988NCLT());
			if(req.getIN988CHAN() != null && !"".equals(req.getIN988CHAN()))message.setIN988CHAN(req.getIN988CHAN());
			if(req.getIN988BRAN() != null && !"".equals(req.getIN988BRAN()))message.setIN988BRAN(req.getIN988BRAN());
			if(req.getIN988CTER() != null && !"".equals(req.getIN988CTER()))message.setIN988CTER(req.getIN988CTER());
			if(req.getIN988TSER() != null && !"".equals(req.getIN988TSER()))message.setIN988TSER(req.getIN988TSER());
			if(req.getIN988CCDI() != null && !"".equals(req.getIN988CCDI()))message.setIN988CCDI(req.getIN988CCDI());
			if(req.getIN988CCTR() != null && !"".equals(req.getIN988CCTR()))message.setIN988CCTR(req.getIN988CCTR());
			if(req.getIN988CCMY() != null && !"".equals(req.getIN988CCMY()))message.setIN988CCMY(req.getIN988CCMY());
			if(req.getIN988CTRA() != null && !"".equals(req.getIN988CTRA()))message.setIN988CTRA(req.getIN988CTRA());                        
                        if(req.getIN988IPCLT() != null && !"".equals(req.getIN988IPCLT()))message.setIN988IPCLT(req.getIN988IPCLT());
			if(req.getIN988AMTAJ() != null && !"".equals(req.getIN988AMTAJ()))message.setIN988AMTAJ(req.getIN988AMTAJ());
			if(req.getIN988REAAJ() != null && !"".equals(req.getIN988REAAJ()))message.setIN988REAAJ(req.getIN988REAAJ());
			if(req.getIN988FI1() != null && !"".equals(req.getIN988FI1()))message.setIN988FI1(req.getIN988FI1());
			if(req.getIN988FI2() != null && !"".equals(req.getIN988FI2()))message.setIN988FI2(req.getIN988FI2());                                                                                      
			
			message.send();
			message.destroy();
			MessageRecord newmessage = mc.receiveMessage();
			if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("0"))) {
				manejarError(res, ((ELEERRMessage) newmessage));
				log.error("IN098801 - Consulta y Pago Servicios: " + " Error: "+ res.getError().getERNU01() + " - " + res.getError().getERDS01() + " - Canal " + req.getCanal());
				return res;
			} else if (newmessage.getFormatName().equals("IN098801")) {
				
					IN098801Bean bean = new IN098801Bean();
					bean.setIN988IDUS(((IN098801Message) newmessage).getIN988IDUS());
					bean.setIN988FACC(((IN098801Message) newmessage).getIN988FACC());
					bean.setIN988TYPE(((IN098801Message) newmessage).getIN988TYPE());
					bean.setIN988AMNT(((IN098801Message) newmessage).getIN988AMNT());
					bean.setIN988BVDM(((IN098801Message) newmessage).getIN988BVDM());
					bean.setIN988BVDD(((IN098801Message) newmessage).getIN988BVDD());
					bean.setIN988BVDY(((IN098801Message) newmessage).getIN988BVDY());
					bean.setIN988FFAC(((IN098801Message) newmessage).getIN988FFAC());
					bean.setIN988PFAC(((IN098801Message) newmessage).getIN988PFAC());
					bean.setIN988CSER(((IN098801Message) newmessage).getIN988CSER());
					bean.setIN988CARE(((IN098801Message) newmessage).getIN988CARE());
					bean.setIN988NTLF(((IN098801Message) newmessage).getIN988NTLF());
					bean.setIN988MFAC(((IN098801Message) newmessage).getIN988MFAC());
					bean.setIN988MDEU(((IN098801Message) newmessage).getIN988MDEU());
					bean.setIN988DS1(((IN098801Message) newmessage).getIN988DS1());
					bean.setIN988DS2(((IN098801Message) newmessage).getIN988DS2());
					bean.setIN988NCLT(((IN098801Message) newmessage).getIN988NCLT());
					bean.setIN988CHAN(((IN098801Message) newmessage).getIN988CHAN());
					bean.setIN988BRAN(((IN098801Message) newmessage).getIN988BRAN());
					bean.setIN988CTER(((IN098801Message) newmessage).getIN988CTER());
					bean.setIN988TSER(((IN098801Message) newmessage).getIN988TSER());
					bean.setIN988CCDI(((IN098801Message) newmessage).getIN988CCDI());
					bean.setIN988CCTR(((IN098801Message) newmessage).getIN988CCTR());
					bean.setIN988CCMY(((IN098801Message) newmessage).getIN988CCMY());
					bean.setIN988CTRA(((IN098801Message) newmessage).getIN988CTRA());                                        
                                        bean.setIN988IPCLT(((IN098801Message) newmessage).getIN988IPCLT());
					bean.setIN988AMTAJ(((IN098801Message) newmessage).getIN988AMTAJ());
					bean.setIN988REAAJ(((IN098801Message) newmessage).getIN988REAAJ());
					bean.setIN988FI1(((IN098801Message) newmessage).getIN988FI1());
					bean.setIN988FI2(((IN098801Message) newmessage).getIN988FI2());
					res.setIN098801(bean);
				}
		} catch (Exception e) {
			log.error("IN098801 - Consulta y Pago Servicios - " + e.getMessage() + " - Canal " + req.getCanal(),e);
			throw new WSException(e);
		} finally {
			if (s != null)
				try {
					s.close();
				} catch (IOException e) {
				}
		}
		return res;
	}	
        
        
	/**
	 * Servicio para actualizar la sesion del usuario.
	 * @param req
	 * @return
	 */
	public ActualizaSesionResponse ActualizaSesion(ActualizaSesionBean req){
		
                log.info("Invocando ActualizaSesion");
		ActualizaSesionResponse res = new ActualizaSesionResponse();
		int resultado = -1;
		Database db = new Database();
		
		res.setError(new ELEERR());
		res.getError().setERRNUM("0");
                
		try{
                    
                    if(req ==null) {
                        res.getError().setERRNUM("1");
                        res.getError().setERNU01("59515");
                        res.getError().setERDS01("Parametros insuficientes");
                        log.error(res.getError().getERDS01());
                    }

                    db.conectar();
                    resultado = db.actualizarSesion(req.getCanal(), req.getEstatus(), req.getTipoDocumento(), req.getDocumento(), req.getLogin(), req.getIp());
                    
                    if(resultado == -2 || resultado == 0){
                        res.getError().setERRNUM("1");
                        res.getError().setERNU01("-3");
                        res.getError().setERDS01("Usuario no existe");
                        log.error(res.getError().getERDS01());
                        return res;
                    } else if(resultado == -1){
                        res.getError().setERRNUM("1");
                        res.getError().setERNU01("-4");
                        res.getError().setERDS01("Error inesperado en la funcion de llamada de BD");
                        log.error(res.getError().getERDS01());
                        return res;
                    }                                        
                    
		} catch (SQLException e) {
                    res.getError().setERRNUM("1");
                    res.getError().setERNU01("60962");
                    res.getError().setERDS01(e.getMessage());

                    log.error(res.getError().getERDS01());
                    return res;
		} finally {
                    db.cerrar();
		}
                
		return res;
	}
	/**
	 * Servicio para envio de mensajes de texto
	 * @param req
	 * @return
	 * @throws WSException
	 */
	public void ENVIASMS(String numCanal, String mensaje, String monto, String ctaOrigen, String referencia, String ctaDestino, String tipoCedula, String cedula) throws WSException{
		
		log.info("Invocando ENVIASMS");
		log.error("ENVIASMS - canal: " + numCanal);
		String diaS, mesS, minutoS, horaS, segundoS, canal, canalCompleto = null;
		
		NIBPF3010Bean req3010 = new NIBPF3010Bean();
		NIBPF3010Response resNibpf3010 = null;
		
		//Busco la información del cliente de la cuenta para sacar el num cel
		if(ctaOrigen != null){
			req3010.setNROCUENTA("00"+ctaOrigen);
			req3010.setNROPARAM("2");
		}else if(tipoCedula != null && cedula != null){
			req3010.setNACIONALIDAD(tipoCedula);
			req3010.setNROIDENTIFICACION(StringUtils.leftPad(cedula,12,'0'));
			req3010.setNROPARAM("1");		
		}
		resNibpf3010 = NIBPF3010(req3010);
	
		if(resNibpf3010.getError() == null){
			//Obtengo fecha y hora
			Calendar fecha = new GregorianCalendar();
	        int año = fecha.get(Calendar.YEAR);
	        int mes = fecha.get(Calendar.MONTH);
	        int dia = fecha.get(Calendar.DAY_OF_MONTH);
	        int hora = fecha.get(Calendar.HOUR_OF_DAY);
	        int minuto = fecha.get(Calendar.MINUTE);
	        int segundo = fecha.get(Calendar.SECOND);
	        
	        if(dia<10) diaS = "0"+String.valueOf(dia);
	        else diaS = String.valueOf(dia);
	        if(mes+1<10) mesS = "0"+String.valueOf(mes+1);
	        else mesS = String.valueOf(mes+1);
	        if(hora<10) horaS = "0"+String.valueOf(hora);
	        else horaS = String.valueOf(hora);
	        if(minuto<10) minutoS = "0"+String.valueOf(minuto);
	        else minutoS = String.valueOf(minuto);
	        if(segundo<10) segundoS = "0"+String.valueOf(segundo);
	        else segundoS = String.valueOf(segundo);
	        
	        String fecha1 = String.valueOf(año)+mesS+diaS; 
			String hora1 =  horaS+minutoS+segundoS;
			
			//si el numCanal es 4
			canal = "IB";
			canalCompleto = "Internet Banking";
			if("1".equals(numCanal)){
				canal = "IVR";
				canalCompleto = "Atencion Activa";
			}else if("3".equals(numCanal)){
				canal = "AG";
				canalCompleto = "Agencia";
			}else if("2".equals(numCanal)){
				canal = "MB";
				canalCompleto = "Movil Banking";
			}
			
	        if(resNibpf3010.getNIBPF3010().getNROCELULAR() != null && !"00000000000".equals(resNibpf3010.getNIBPF3010().getNROCELULAR().trim())){
				// Enviamos el SMS si tiene numero de celular
				SmsSP sms = new SmsSP();
				
				sms.setCanal1(mensaje);
				sms.setNumcel(resNibpf3010.getNIBPF3010().getNROCELULAR());
				sms.setXrnde38(canal);
				sms.setFectim(canalCompleto);
				sms.setFecha(fecha1);
				sms.setHora(hora1);
				sms.setMonto(monto);
				sms.setCuenta(ctaOrigen.substring(ctaOrigen.length()-4));
				sms.setRefnum(referencia.substring(referencia.length()-4));
				
				if(!sms.enviaSms()){
					log.error("ENVIASMS - Error de envío SMS para el usuario: "+ resNibpf3010.getNIBPF3010().getIDENTIFICACIONIBS());
				}
			}
		} 
	}
	
	/**
	 * obtieneExtracreditosInfo Obtiene el listado con iformación sobre los extracreditos activos en una tarjeta de crédito
	 * 
	 * Una tarjeta de crédito posee una linea paralela la cual puede ser utilizada para obtener extracreditos, con este metodo buscamos los
	 * extracréditos que posea la tarjeta de crédito especificada en el ExtraCredtioInfoBean req, si no posee extracréditos el
	 * listado es vacio
	 * 
	 * @param ExtraCreditoInfoBean req
	 * @return ExtraCreditoInfoResponse
	 * @throws WSException
	 */
	public ExtraCreditoInfoResponse obtieneExtracreditosInfo(ExtraCreditoInfoBean req) throws WSException
	{
		log.info("Invocando obtieneExtracreditosInfo");
		ExtraCreditoInfoResponse res = new ExtraCreditoInfoResponse();
		IExtraCreditoRepo repo = new ExtraCreditoRepo();
		
		try {
			List<ExtraCreditoInfoBean> extracreditos = repo.getExtraCreditos(req.getNumeroTarjeta());
			res.setExtInfo(extracreditos);
		} catch (Exception e) {
			log.error("obtieneExtracreditosInfo - " + e.getMessage() + " - Canal " + req.getCanal());
			throw new WSException(e);
		}
		return res;
	}
	
	/**
	 * obtieneMovimientosExtraCredito Obtiene la información detallada sobre el extracredito
	 * 
	 * Se obtiene la información detallada de los movimientos realizados sobre un extracrédito especifico. 
	 *  
	 * @param ExtraCreditoInfoBean req
	 * @return ExtraCreditoInfoResponse
	 * @throws WSException
	 */
	public MovimientosExtraCreditoResponse obtieneMovimientosExtraCredito(ExtraCreditoInfoBean req) throws WSException
	{
		log.info("Invocando obtieneMovimientosExtraCredito");
		MovimientosExtraCreditoResponse res = new MovimientosExtraCreditoResponse();
		IExtraCreditoRepo repo = new ExtraCreditoRepo();
		
		try {
			List<MovimientoExtracreditoBean> movimientos = repo.getMovimientosExtraCredito(req);
			res.setMovimientos(movimientos);
		} catch (Exception e) {
			log.error("obtieneMovimientosExtraCredito - " + e.getMessage() + " - Canal " + req.getCanal());
			throw new WSException(e);
		}
		return res;
	}
	
	   /**
	 * validaFechaFeriados Valida si una fecha es feriado o no
	 * 
	 * @param ConsultaFeriadosBean req
	 * @return ConsultaFeriadosResponse
	 * @throws WSException
	 */
	public ConsultaFeriadosResponse validaFechaFeriados(ConsultaFeriadosBean req) throws WSException
	{
		log.info("Invocando validaFechaFeriados");
		ConsultaFeriadosResponse res = new ConsultaFeriadosResponse();
		ConsultaFeriadosRepo repo = new ConsultaFeriadosRepo();
		
		try {
			ConsultaFeriadosBean fecha = repo.consultaFecha(req.getDia(),req.getMes(),req.getAno());
			if(fecha.getDia()==null){
                            res.setExiste(false);
                        }else{
                            res.setExiste(true);
                        }                            
                        
		} catch (Exception e) {
			log.error("validaFechaFeriados - " + e.getMessage());
			throw new WSException(e);
		}
		return res;
	}	        		
	
        /**
	 * Servicio para la búsqueda avanzada de movimientos P2P, por mes.
	 * @param req
	 * @return
	 * @throws WSException
	 */
	public STMRDSJV5Response STMRDSJV5(STMRDSJV5Bean req) throws WSException {
		
                log.info("Invocando STMRDSJV5");
		Parametros params = new Parametros();
		STMRDSJV5Response res = new STMRDSJV5Response();
		Socket s = null;
		try {
			s = new Socket(params.getString("ip"), params.getInt("port7"));
			s.setSoTimeout(params.getInt("timeout"));
			MessageContext mc = new MessageContext(new DataInputStream(new BufferedInputStream(s.getInputStream())), new DataOutputStream(
					new BufferedOutputStream(s.getOutputStream())), "com.activo.gateway.dibs.messages");
			STMRDSJV5Message message = null;
			message = (STMRDSJV5Message) mc.getMessageRecord("STMRDSJV5");
			if(req.getRSTUSR5() != null && !"".equals(req.getRSTUSR5()))message.setRSTUSR5(req.getRSTUSR5());
			if(req.getRSTACC5() != null && !"".equals(req.getRSTACC5()))message.setRSTACC5(req.getRSTACC5());
			if(req.getRSTCAF5() != null && !"".equals(req.getRSTCAF5()))message.setRSTCAF5(req.getRSTCAF5());
			if(req.getRSTFD15() != null && !"".equals(req.getRSTFD15()))message.setRSTFD15(req.getRSTFD15());
			if(req.getRSTFD25() != null && !"".equals(req.getRSTFD25()))message.setRSTFD25(req.getRSTFD25());
			if(req.getRSTFD35() != null && !"".equals(req.getRSTFD35()))message.setRSTFD35(req.getRSTFD35());
			if(req.getRSTTD15() != null && !"".equals(req.getRSTTD15()))message.setRSTTD15(req.getRSTTD15());
			if(req.getRSTTD25() != null && !"".equals(req.getRSTTD25()))message.setRSTTD25(req.getRSTTD25());
			if(req.getRSTTD35() != null && !"".equals(req.getRSTTD35()))message.setRSTTD35(req.getRSTTD35());
			if(req.getRSTFCK5() != null && !"".equals(req.getRSTFCK5()))message.setRSTFCK5(req.getRSTFCK5());
			if(req.getRSTTCK5() != null && !"".equals(req.getRSTTCK5()))message.setRSTTCK5(req.getRSTTCK5());
			if(req.getRSTFAM5() != null && !"".equals(req.getRSTFAM5()))message.setRSTFAM5(req.getRSTFAM5());
			if(req.getRSTTAM5() != null && !"".equals(req.getRSTTAM5()))message.setRSTTAM5(req.getRSTTAM5());
			if(req.getRSTFRC5() != null && !"".equals(req.getRSTFRC5()))message.setRSTFRC5(req.getRSTFRC5());
			if(req.getRSTFBL5() != null && !"".equals(req.getRSTFBL5()))message.setRSTFBL5(req.getRSTFBL5());
			message.send();
			message.destroy();
			MessageRecord newmessage = mc.receiveMessage();
			if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("0"))) {
				manejarError(res, ((ELEERRMessage) newmessage));
				log.error("STMRDSJV5 - Detalle P2P: " +"Error: "+ res.getError().getERNU01() + " - " + res.getError().getERDS01() + " - Canal " + req.getCanal());
				return res;
			} else {				
				newmessage = mc.receiveMessage();				
				if (newmessage.getFormatName().equals("STMSDSJV5")) {
					List<STMSDSJVBean> x = new ArrayList<STMSDSJVBean>();
					for (boolean GoIn = !((STMSDSJV5Message) newmessage).getSTMREC().equals("9999999"); GoIn; GoIn = !((STMSDSJV5Message) newmessage)
							.getSTMREC().equals("9999999")) {
						STMSDSJVBean bean = new STMSDSJVBean();
						bean.setSTMUSR(((STMSDSJV5Message) newmessage).getSTMUSR());
						bean.setSTMACC(((STMSDSJV5Message) newmessage).getSTMACC());
						bean.setSTMCDE(((STMSDSJV5Message) newmessage).getSTMCDE());
						bean.setSTMNAR(((STMSDSJV5Message) newmessage).getSTMNAR());
						bean.setSTMBD1(((STMSDSJV5Message) newmessage).getSTMBD1());
						bean.setSTMBD2(((STMSDSJV5Message) newmessage).getSTMBD2());
						bean.setSTMBD3(((STMSDSJV5Message) newmessage).getSTMBD3());
						bean.setSTMCKN(((STMSDSJV5Message) newmessage).getSTMCKN());
						bean.setSTMBBL(((STMSDSJV5Message) newmessage).getSTMBBL());
						bean.setSTMAMT(((STMSDSJV5Message) newmessage).getSTMAMT());
						bean.setSTMDCC(((STMSDSJV5Message) newmessage).getSTMDCC());
						bean.setSTMEBL(((STMSDSJV5Message) newmessage).getSTMEBL());
						bean.setSTMREC(((STMSDSJV5Message) newmessage).getSTMREC());
						bean.setSTMMEM(((STMSDSJV5Message) newmessage).getSTMMEM());
						bean.setSTMEND(((STMSDSJV5Message) newmessage).getSTMEND());
						bean.setSTMDRR(((STMSDSJV5Message) newmessage).getSTMDRR());
						bean.setSTMNNAR(((STMSDSJV5Message) newmessage).getSTMNNAR());
						bean.setSTMNA1(((STMSDSJV5Message) newmessage).getSTMNA1());
						bean.setSTMNA2(((STMSDSJV5Message) newmessage).getSTMNA2());
						bean.setSTMNA3(((STMSDSJV5Message) newmessage).getSTMNA3());
						bean.setSTMNA4(((STMSDSJV5Message) newmessage).getSTMNA4());
						bean.setSTMNA5(((STMSDSJV5Message) newmessage).getSTMNA5());
						bean.setSTMNA6(((STMSDSJV5Message) newmessage).getSTMNA6());
						bean.setSTMNA7(((STMSDSJV5Message) newmessage).getSTMNA7());
						bean.setSTMNA8(((STMSDSJV5Message) newmessage).getSTMNA8());
						bean.setSTMNA9(((STMSDSJV5Message) newmessage).getSTMNA9());
						x.add(bean);
						newmessage = mc.receiveMessage();
						if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("0"))) {
							manejarError(res, ((ELEERRMessage) newmessage));
							return res;
						}
					}
					res.setSTMSDSJV5(x.toArray(new STMSDSJVBean[0]));
				}
			}
		} catch (Exception e) {
			log.error("STMRDSJV5 - Detalle P2P - " + e.getMessage() + " - Canal " + req.getCanal(),e);
			throw new WSException(e);
		} finally {
			if (s != null)
				try {
					s.close();
				} catch (IOException e) {
				}
		}
		return res;
	}        
        
        /**
	 * Servicio para consulta de cash
	 * @param req
	 * @return
	 * @throws WSException
	 */
	public IBPINFDATResponse IBPINFDAT(IBPINFDATBean req) throws WSException{
		
            log.info("Invocando IBPINFDAT");
            Socket s = null;
            IBPINFDATResponse res = new IBPINFDATResponse();

            try {
                    Parametros params = new Parametros();
                    MessageContext mc;
                    s = new Socket(params.getString("ip"), params.getInt("port3"));
                    s.setSoTimeout(params.getInt("timeout"));
                    mc = new MessageContext(new DataInputStream(new BufferedInputStream(s.getInputStream())), new DataOutputStream(
                                    new BufferedOutputStream(s.getOutputStream())), "com.activo.gateway.dibs.messages");
                    IBPINFDATMessage message;
                    message = (IBPINFDATMessage) mc.getMessageRecord("IBPINFDAT");
                    if(req.getIBPUSR() != null && !"".equals(req.getIBPUSR()))message.setIBPUSR(req.getIBPUSR());
                    if(req.getIBPPID() != null && !"".equals(req.getIBPPID()))message.setIBPPID(req.getIBPPID());
                    if(req.getIBPVDD() != null && !"".equals(req.getIBPVDD()))message.setIBPVDD(req.getIBPVDD());
                    if(req.getIBPVDM() != null && !"".equals(req.getIBPVDM()))message.setIBPVDM(req.getIBPVDM());
                    if(req.getIBPVDY() != null && !"".equals(req.getIBPVDY()))message.setIBPVDY(req.getIBPVDY());
                    if(req.getIBPNUM() != null && !"".equals(req.getIBPNUM()))message.setIBPNUM(req.getIBPNUM());
                    if(req.getIBPMTO() != null && !"".equals(req.getIBPMTO()))message.setIBPMTO(req.getIBPMTO());
                    if(req.getIBPMTE() != null && !"".equals(req.getIBPMTE()))message.setIBPMTE(req.getIBPMTE());
                    if(req.getIBPMTP() != null && !"".equals(req.getIBPMTP()))message.setIBPMTP(req.getIBPMTP());
                    if(req.getIBPMTR() != null && !"".equals(req.getIBPMTR()))message.setIBPMTR(req.getIBPMTR());
                    if(req.getIBPSTS() != null && !"".equals(req.getIBPSTS()))message.setIBPSTS(req.getIBPSTS());
                    message.send();
                    message.destroy();
                    MessageRecord newmessage = mc.receiveMessage();
                    if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("0"))) {
                            manejarError(res, ((ELEERRMessage) newmessage));
                            log.error("IBPINFDAT - Consulta Cash: " + " Error: "+ res.getError().getERNU01() + " - " + res.getError().getERDS01() + " - Canal " + req.getCanal());
                            return res;
                    } else if (newmessage.getFormatName().equals("IBPINFDAT")) {

                        IBPINFDATBean bean = new IBPINFDATBean();
                        bean.setIBPUSR(((IBPINFDATMessage) newmessage).getIBPUSR());
                        bean.setIBPPID(((IBPINFDATMessage) newmessage).getIBPPID());
                        bean.setIBPVDD(((IBPINFDATMessage) newmessage).getIBPVDD());
                        bean.setIBPVDM(((IBPINFDATMessage) newmessage).getIBPVDM());
                        bean.setIBPVDY(((IBPINFDATMessage) newmessage).getIBPVDY());
                        bean.setIBPNUM(((IBPINFDATMessage) newmessage).getIBPNUM());
                        bean.setIBPMTO(((IBPINFDATMessage) newmessage).getIBPMTO());
                        bean.setIBPMTE(((IBPINFDATMessage) newmessage).getIBPMTE());
                        bean.setIBPMTP(((IBPINFDATMessage) newmessage).getIBPMTP());
                        bean.setIBPMTR(((IBPINFDATMessage) newmessage).getIBPMTR());
                        bean.setIBPSTS(((IBPINFDATMessage) newmessage).getIBPSTS());
                        res.setIBPINFDAT(bean);
                    }
            } catch (Exception e) {
                log.error("IBPINFDAT - Consulta Cash - " + e.getMessage() + " - Canal " + req.getCanal(),e);
                throw new WSException(e);
            } finally {
                if (s != null)
                try {
                    s.close();
                } catch (IOException e) {
                }
            }
            return res;
	}

        /**
	 * Servicio para recarga Inter / DIgitel 
	 * @param req
	 * @return
	 * @throws WSException
	 */
	public IN096201Response IN096201(IN096201Bean req) throws WSException{
            log.info("Invocando IN096201");
            Socket s = null;
            IN096201Response res = new IN096201Response();
            String reqlog = " IN962CANA: " +req.getIN962CANA()+ " \n IN962CDEB: "+req.getIN962CDEB()
                    +" \n IN962CKN: "+req.getIN962CKN()+ " \n IN962DIP: "+req.getIN962DIP()
                    +" \n IN962IDDG: "+req.getIN962IDDG() +" \n IN962IDPR: "+req.getIN962IDPR()
                    +" \n IN962NROT: "+req.getIN962NROT()+" \n IN962REV: "+req.getIN962REV()
                    +" \n IN962USER: "+req.getIN962USER() + " \n IN962MONT: "+req.getIN962MONT().toString()
                    +" \n IN962REV: "+req.getIN962REV() + " \n IN962CKN: "+req.getIN962CKN()
                    +" \n IN962RP1: "+req.getIN962RP1() + " \n IN962RP2: "+req.getIN962RP2();
            try {
                Parametros params = new Parametros();
                MessageContext mc;
                s = new Socket(params.getString("ip"), params.getInt("port7"));
                s.setSoTimeout(params.getInt("timeout"));
                mc = new MessageContext(new DataInputStream(new BufferedInputStream(s.getInputStream())), new DataOutputStream(
                        new BufferedOutputStream(s.getOutputStream())), "com.activo.gateway.dibs.messages");
                IN096201Message message;
                message = (IN096201Message) mc.getMessageRecord("IN096201");

                if(req.getIN962USER()!= null && !"".equals(req.getIN962USER()))message.setIN962USER(req.getIN962USER());
                if(req.getIN962CDEB()!= null && !"".equals(req.getIN962CDEB()))message.setIN962CDEB(req.getIN962CDEB());
                if(req.getIN962NROT()!= null && !"".equals(req.getIN962NROT()))message.setIN962NROT(req.getIN962NROT());
                if(req.getIN962IDPR()!= null && !"".equals(req.getIN962IDPR()))message.setIN962IDPR(req.getIN962IDPR());
                if(req.getIN962IDDG()!= null && !"".equals(req.getIN962IDDG()))message.setIN962IDDG(req.getIN962IDDG());
                if(req.getIN962MONT()!= null && !"".equals(req.getIN962MONT()))message.setIN962MONT(String.valueOf((req.getIN962MONT())));
                if(req.getIN962CANA()!= null && !"".equals(req.getIN962CANA()))message.setIN962CANA(req.getIN962CANA());
                if(req.getIN962DIP()!= null && !"".equals(req.getIN962DIP()))message.setIN962DIP(req.getIN962DIP());
                if(req.getIN962REV()!= null && !"".equals(req.getIN962REV()))message.setIN962REV(req.getIN962REV());
                if(req.getIN962CKN()!= null && !"".equals(req.getIN962CKN()))message.setIN962CKN(req.getIN962CKN());                
                
                message.send();
                message.destroy();
                MessageRecord newmessage = mc.receiveMessage();
                String c = newmessage.getFormatName();
                if (!((ELEERRMessage) newmessage).getERRNUM().equals("2")) {
                    manejarError(res, ((ELEERRMessage) newmessage));
                    log.error("IN096201 - Recarga Inter/Digitel: " + " Error: "+ res.getError().getERNU01() + " - " 
                            + res.getError().getERDS01() + " - Canal " + req.getIN962CANA()
                            + "\n " + reqlog);
                    return res;
                }else {
                    manejarError(res, ((ELEERRMessage) newmessage));
                }
            } catch (Exception e) {
                log.error("IN096201 - Recarga Inter/Digitel - " + e.getMessage() + " - Canal " + req.getIN962CANA()
                        + "\n " + reqlog,e);
                throw new WSException(e);
            } finally {
                if (s != null)
                try {
                    s.close();
                } catch (IOException e) {
                }
            }
            return res;
	}
        
        /**
	 * Servicio para reverso Inter / DIgitel 
	 * @param req
	 * @return
	 * @throws WSException
	 */
	public IN096201Response IN096202(IN096201Bean req) throws WSException{
            log.info("Invocando IN096201");
            Socket s = null;
            IN096201Response res = new IN096201Response();
            String reqlog = " IN962CANA: " +req.getIN962CANA()+ " \n IN962CDEB: "+req.getIN962CDEB()
                    +" \n IN962CKN: "+req.getIN962CKN()+ " \n IN962DIP: "+req.getIN962DIP()
                    +" \n IN962IDDG: "+req.getIN962IDDG() +" \n IN962IDPR: "+req.getIN962IDPR()
                    +" \n IN962NROT: "+req.getIN962NROT()+" \n IN962REV: "+req.getIN962REV()
                    +" \n IN962USER: "+req.getIN962USER() + " \n IN962MONT: "+req.getIN962MONT().toString()
                    +" \n IN962REV: "+req.getIN962REV() + " \n IN962CKN: "+req.getIN962CKN()
                    +" \n IN962RP1: "+req.getIN962RP1() + " \n IN962RP2: "+req.getIN962RP2();
            try {
                Parametros params = new Parametros();
                MessageContext mc;
                s = new Socket(params.getString("ip"), params.getInt("port7"));
                s.setSoTimeout(params.getInt("timeout"));
                mc = new MessageContext(new DataInputStream(new BufferedInputStream(s.getInputStream())), new DataOutputStream(
                        new BufferedOutputStream(s.getOutputStream())), "com.activo.gateway.dibs.messages");
                IN096202Message message;
                message = (IN096202Message) mc.getMessageRecord("IN096202");

                if(req.getIN962CDEB()!= null && !"".equals(req.getIN962CDEB()))message.setIN902CDEB(req.getIN962CDEB());
                if(req.getIN962NROT()!= null && !"".equals(req.getIN962NROT()))message.setIN902NROT(req.getIN962NROT());
                if(req.getIN962IDPR()!= null && !"".equals(req.getIN962IDPR()))message.setIN902IDPR(req.getIN962IDPR());
                if(req.getIN962IDDG()!= null && !"".equals(req.getIN962IDDG()))message.setIN902IDDG(req.getIN962IDDG());
                if(req.getIN962MONT()!= null && !"".equals(req.getIN962MONT()))message.setIN902MONT(String.valueOf((req.getIN962MONT())));
                if(req.getIN962REV()!= null && !"".equals(req.getIN962REV()))message.setIN902REV(req.getIN962REV());
                if(req.getIN962CKN()!= null && !"".equals(req.getIN962CKN()))message.setIN902CKN(req.getIN962CKN());
                if(req.getIN962RP1()!= null && !"".equals(req.getIN962RP1()))message.setIN902RP1(req.getIN962RP1());
                if(req.getIN962RP2()!= null && !"".equals(req.getIN962RP2()))message.setIN902RP2(req.getIN962RP2());
                
                message.send();
                message.destroy();
                MessageRecord newmessage = mc.receiveMessage();
                String c = newmessage.getFormatName();
                if (!((ELEERRMessage) newmessage).getERRNUM().equals("2")) {
                    manejarError(res, ((ELEERRMessage) newmessage));
                    log.error("IN096201 - Recarga Inter/Digitel: " + " Error: "+ res.getError().getERNU01() + " - " 
                            + res.getError().getERDS01() + " - Canal " + req.getIN962CANA()
                            + "\n " + reqlog);
                    return res;
                }else {
                    manejarError(res, ((ELEERRMessage) newmessage));
                }
            } catch (Exception e) {
                log.error("IN096201 - Recarga Inter/Digitel - " + e.getMessage() + " - Canal " + req.getIN962CANA()
                        + "\n " + reqlog,e);
                throw new WSException(e);
            } finally {
                if (s != null)
                try {
                    s.close();
                } catch (IOException e) {
                }
            }
            return res;
	}
        
        //Metodo para la obtencion de las tajetas activas del cliente solicitante
	public Tarjetas getTarjetas(String idCliente, String canal){
		return Helper.getTarjetas(idCliente, canal);
	}
	
	//Reset de PIN en caso de olvido no requiere PIN anterior
	public Respuestas resetPin(Solicitud sol){
		Respuestas r= new Respuestas();
                //DESENCRIPTAMOS PIN ACTUAL Y PIN NUEVO
                sol.setPinActual(Crypto.decrypt(sol.getPinActual()));
                sol.setPinNuevo(Crypto.decrypt(sol.getPinNuevo()));
		String pinBlock= Helper.Generapinblock(sol.getNumeroTarjeta(), sol.getPinNuevo());
		if(pinBlock.equals("ERROR")){
			r.setCodRespuesta("9998");
			r.setDescRespuesta("Error recuparando la llave");
			return r;
		}else{
			CBPR00401Message resp=Helper.validarPinBlock(sol.getCanal(), pinBlock, sol.getIdCliente(), sol.getNumeroTarjeta());
			r.setCodRespuesta(resp.getTRMERR04());
			r.setDescRespuesta(resp.getTRMDSC04().trim());
			return r;
		}
	}
        
        //Servicio para autenticar con CELUPAGOS
        public boolean AutenticaCelupagos (String compania, String servicio) throws WSException{
            log.info("Invocando AutenticaCelupagos");
            
            StringBuilder parametrosurl = new StringBuilder(); 
            byte [] datospost;
            AutenticaCelupagoBean autcelu = new AutenticaCelupagoBean();
            

            try{
                Parametros params = new Parametros();
                URL url = null;
                url = new URL(params.getString("aut"));
                if (compania.equals("1"))
                    parametrosurl.append("username="+params.getString("usercelu")+"&password="+params.getString("passcelu")+"&compania="+compania+"servicio="+servicio);
                
                if (compania.equals("2"))
                    parametrosurl.append("username="+params.getString("usercelu")+"&password="+params.getString("passcelu")+"&compania="+compania);
                
                datospost = parametrosurl.toString().getBytes("UTF-8");
                HttpURLConnection con = (HttpURLConnection) url.openConnection();
                con.setRequestMethod("POST");
                con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                con.setRequestProperty("Content-Length", String.valueOf(datospost.length));
                con.setDoOutput(true);
                con.getOutputStream().write(datospost);
                
                if (con.getResponseCode() != 200){
                    TokenCelupagos = con.getResponseCode() + " " + con.getResponseMessage();
                    log.error("AutenticaCelupagos - ERROR "+ con.getResponseCode() + " - " + con.getResponseMessage());
                    return false;
                }
                
                Reader in = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));
                StringBuilder apiresponse = new StringBuilder();
                for(int res=0;(res = in.read()) >=0;) 
                    apiresponse.append((char)res);
                in.close();
                ObjectMapper obj = new ObjectMapper();
                JSONObject apires = new JSONObject(apiresponse.toString());
                if (!apires.isNull("access_token"))
                    autcelu = obj.readValue(apiresponse.toString(), AutenticaCelupagoBean.class);
                else{
                    JSONObject obj2 = apires.getJSONObject("message");
                    TokenCelupagos = obj2.get("errorCode")+" - "+obj2.get("message");
                    log.error("AutenticaCelupagos - Excepcion "+ TokenCelupagos);
                    return false;
                }
                
                if("404".equals(autcelu.getStatusCode())){
                    TokenCelupagos = autcelu.getStatusCode() + " " + autcelu.getMessage();
                    log.error("AutenticaCelupagos - Excepcion "+ TokenCelupagos);
                    return false;
                }
                TokenCelupagos = autcelu.getAccess_token();
                
            }catch(Exception e){
                TokenCelupagos = e.toString();
                log.error("AutenticaCelupagos - Excepcion "+ e.toString());
                return false;
            }
            return true;
        }
        
        /**Servicio para consultar con CELUPAGOS
         * numero de telefono(DIGITEL)
         * cedula o contrato (INTER) 
         */
        public CelupagosResponse ConsultaCelupagos(CelupagosRequest req)throws WSException{
            log.info("Invocando ConsultaCelupagos");
            CelupagosBean consulta = new CelupagosBean();
            CelupagosResponse res = new CelupagosResponse();
            List<CelupagosBean> arreglo = new ArrayList<CelupagosBean>();
            StringBuilder parametrosurl = new StringBuilder();
            byte [] datospost;
            String reqlog = " Compania: " +req.getCompania()+ " \n Contrato: "+req.getNrocontrato()
                    +" \n Documento: "+req.getNrodocumento()+ " \n Telefono: "+req.getTelefono()+" \n Operacion: "+req.getOpe();
            
            //AUTENTICAMOS
            try{    
                if(!AutenticaCelupagos(req.getCompania(), req.getServicio())){
                    consulta.setMessage(TokenCelupagos);
                    consulta.setErrorCode("89");
                    arreglo.add(consulta);
                    res.setcelupagos(arreglo.toArray(new CelupagosBean[0]));
                    log.error("ConsultaCelupagos - "+consulta.getMessage());
                    return res;
                }
            }catch(Exception e){
                consulta.setMessage("Excepcion autenticando - "+e.toString());
                consulta.setErrorCode("89");
                arreglo.add(consulta);
                res.setcelupagos(arreglo.toArray(new CelupagosBean[0]));
                log.error("ConsultaCelupagos - "+consulta.getMessage());
                return res;
            }
            
            //CONSULTAMOS
            try{    
                URL url = null;
                Parametros params = new Parametros();
                url = new URL(params.getString("con"));
                if (req.getCompania().equals("1"))
                    parametrosurl.append("token="+TokenCelupagos+"&compania="+req.getCompania()+"&telefono="+req.getTelefono());
                
                if (req.getCompania().equals("2")){
                    if (req.getNrodocumento() != null && !"".equals(req.getNrodocumento()))
                        parametrosurl.append("token="+TokenCelupagos+"&compania="+req.getCompania()+"&documento="+req.getNrodocumento());
                    
                    if (req.getNrocontrato()!= null && !"".equals(req.getNrocontrato()))
                        parametrosurl.append("token="+TokenCelupagos+"&compania="+req.getCompania()+"&contrato="+req.getNrocontrato());
                }
                                
                datospost = parametrosurl.toString().getBytes("UTF-8");
                HttpURLConnection con = (HttpURLConnection) url.openConnection();
                con.setRequestMethod("GET");
                con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                con.setDoOutput(true);
                con.getOutputStream().write(datospost);
                
                if (con.getResponseCode() != 200){
                    if (con.getResponseCode() == 400 || con.getResponseCode() == 500){
                        BufferedReader in = new BufferedReader(new InputStreamReader(con.getErrorStream(), "UTF-8"));
                        String linea;
                        StringBuffer apiresponse = new StringBuffer();
                        while((linea = in.readLine()) != null){
                            apiresponse.append(linea);
                        }
                        in.close();
                        //respuesta de error INTER y DIGITEL 
                        JSONObject apires = new JSONObject(apiresponse.toString());
                        JSONObject apireserror = apires.getJSONObject("message");
                        if (apireserror.get("errorCode") instanceof String)
                            consulta.setErrorCode(apireserror.getString("errorCode"));
                        else
                            consulta.setErrorCode(String.valueOf(apireserror.getInt("errorCode")));
                        consulta.setMessage(apireserror.getString("message"));
                        arreglo.add(consulta);
                        res.setcelupagos(arreglo.toArray(new CelupagosBean[0]));
                        log.error("ConsultaCelupagos - ERROR "+ con.getResponseCode()+" - "+con.getResponseMessage()+"\n"+reqlog);
                        return res;
                    }else{
                        consulta.setErrorCode(String.valueOf(con.getResponseCode()));
                        consulta.setMessage(con.getResponseMessage());
                        arreglo.add(consulta);
                        res.setcelupagos(arreglo.toArray(new CelupagosBean[0]));
                        log.error("ConsultaCelupagos - ERROR "+ con.getResponseCode()+" - "+con.getResponseMessage()+"\n"+reqlog);
                        return res;
                    }
                }
                
                BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));
                String linea;
                StringBuffer apiresponse = new StringBuffer();
                while((linea = in.readLine()) != null){
                    apiresponse.append(linea);
                }
                in.close();
                //RESPUESTA EXITOSA DE DIGITEL
                if (req.getCompania().equals("1")){
                    JSONObject apires = new JSONObject(apiresponse.toString());
                    if (!apires.isNull("message")){
                        JSONObject apireserror = apires.getJSONObject("message");
                        if (apireserror.get("errorCode") instanceof String)
                            consulta.setErrorCode(apireserror.getString("errorCode"));
                        else
                            consulta.setErrorCode(String.valueOf(apireserror.getInt("errorCode")));
                        consulta.setMessage(apireserror.getString("message"));
                    }
                    if (!apires.isNull("reference")){
                        ObjectMapper apireserror = new ObjectMapper();
                        consulta = apireserror.readValue(apiresponse.toString(), CelupagosBean.class);
                    }

                    arreglo.add(consulta);
                    res.setcelupagos(arreglo.toArray(new CelupagosBean[0]));
                }
                //RESPUESTAS DE INTER
                if (req.getCompania().equals("2")){
                    //RESPUESTA CONSULTA POR DOCUMENTO
                    if (!"".equals(req.getNrodocumento())){
                        JSONObject apires = new JSONObject(apiresponse.toString());
                        JSONArray contrato = apires.getJSONArray("contracts");
                        for (int i = 0; i < contrato.length() ; i++){
                            JSONObject contratores = contrato.getJSONObject(i);
                            ObjectMapper obj = new ObjectMapper();
                            consulta = obj.readValue(String.valueOf(contratores), CelupagosBean.class);
                            arreglo.add(i,consulta);
                        }
                        res.setcelupagos(arreglo.toArray(new CelupagosBean[0]));
                    }
                    //RESPUESTA CONSULTA POR CONTRATO
                    if (!"".equals(req.getNrocontrato())){
                        JSONObject apires = new JSONObject(apiresponse.toString());
                        //RESPUETA EXITOSA
                        if (apires.getString("errorCode").equals("1")){
                            consulta.setOwner(apires.getString("owner"));
                            consulta.setDocumentNumber(apires.getString("documentNumber"));
                            consulta.setContractType(apires.getString("contractType"));
                            consulta.setRent(apires.getDouble("rent"));
                            consulta.setTotal(apires.getDouble("total"));
                            consulta.setImporte(apires.getDouble("import"));
                            consulta.setImportPerContDay(apires.getDouble("importPerContDay"));
                            consulta.setErrorCode(apires.getString("errorCode"));
                            consulta.setMessage(apires.getString("message"));
                            arreglo.add(consulta);
                            res.setcelupagos(arreglo.toArray(new CelupagosBean[0]));
                        }
                        //RESPUESTA ERROR
                        if (!apires.getString("errorCode").equals("1")){
                            consulta.setErrorCode(apires.getString("errorCode"));
                            consulta.setMessage(apires.getString("message"));
                            arreglo.add(consulta);
                            res.setcelupagos(arreglo.toArray(new CelupagosBean[0]));
                        }
                    }
                }
                 
            }catch(Exception e){
                consulta.setErrorCode("89");
                consulta.setMessage("Excepcion - "+e.toString());
                arreglo.add(consulta);
                res.setcelupagos(arreglo.toArray(new CelupagosBean[0]));
                log.error("ConsultaCelupagos - "+consulta.getMessage()+"\n"+reqlog);
                return res;
            }
            
            return res;
        }
        
        /**Servicio para recargar con CELUPAGOS
         * INTER Y DIGITEL
        */
        public CelupagosResponse RecargaCelupagos (CelupagosRequest req) throws WSException{
            log.info("Invocando RecargaCelupagos");
            byte [] datospost;
            CelupagosBean consulta = new CelupagosBean();
            IN096201Bean bean = new IN096201Bean();
            CelupagosResponse res = new CelupagosResponse();
            List<CelupagosBean> arreglo = new ArrayList<CelupagosBean>();
            StringBuilder parametrosurl = new StringBuilder();
            
            String reqlog = " Compania: " +req.getCompania()+ " \n Contrato: "+req.getNrocontrato()
                    +" \n Documento: "+req.getNrodocumento()+ " \n Telefono: "+req.getTelefono()+" \n Operacion: "+req.getOpe()
                    +" \n Canal: "+req.getCanal()+" \n Cuenta debito: "+req.getCuentadebito()+" \n IP: "+req.getIp()
                    +" \n Monto: "+req.getMonto().toString() + " \n Servicio: "+req.getServicio()
                    +" \n ReferenciaD: "+req.getReferenciaD() +" \n Reverso: "+req.getReverso()
                    +" \n Refreverso: "+req.getRefreverso();
            
            //AUTENTICAMOS
            try{    
                if(!AutenticaCelupagos(req.getCompania(), req.getServicio())){
                    consulta.setMessage(TokenCelupagos);
                    consulta.setErrorCode("89");
                    arreglo.add(consulta);
                    res.setcelupagos(arreglo.toArray(new CelupagosBean[0]));
                    log.error("ConsultaCelupagos - "+consulta.getMessage());
                    return res;
                }
            }catch(Exception e){
                consulta.setMessage("Excepcion autenticando - "+e.toString());
                consulta.setErrorCode("89");
                arreglo.add(consulta);
                res.setcelupagos(arreglo.toArray(new CelupagosBean[0]));
                log.error("ConsultaCelupagos - "+consulta.getMessage());
                return res;
            }
            //RECARGAMOS
            try{
                //Armamos request que va al 400
                bean.setIN962USER((req.getNrodocumento().trim()));
                bean.setIN962CDEB(req.getCuentadebito());
                if ("1".equals(req.getCompania())){
                    bean.setIN962NROT(req.getTelefono());
                    if ("1".equals(req.getServicio()))
                        bean.setIN962IDPR("03");
                    
                    if ("2".equals(req.getServicio()))
                        bean.setIN962IDPR("02");
                    
                }
                if ("2".equals(req.getCompania())){
                    bean.setIN962NROT(req.getNrocontrato());
                    bean.setIN962IDPR("04");
                }
                bean.setIN962IDDG(req.getReferenciaD());
                bean.setIN962MONT(req.getMonto());
                bean.setIN962CANA(req.getCanal());
                bean.setIN962DIP(req.getIp().trim());
                bean.setIN962REV(req.getReverso());
                bean.setIN962CKN(req.getRefreverso());
                IN096201Response in09bean = new IN096201Response();
                //llamada al servicio del 400
                in09bean = IN096201(bean);
                //Si el debito en 400 es exitoso
                if ("2".equals(in09bean.getError().getERRNUM())){
                    String referenciab = in09bean.getError().getERDS02().trim();
                    //armamos el URL
                    URL url = null;
                    Parametros params = new Parametros();
                   
                    url = new URL(params.getString("rec"));
                    if (req.getCompania().equals("1")){
                        if (req.getServicio().equals("1")){
                            if(req.getCanal().equals("06"))
                                parametrosurl.append("token="+TokenCelupagos+"&compania="+req.getCompania()+"&servicio="
                                            +req.getServicio()+"&amount="+req.getMonto()+"&phone="+req.getTelefono()
                                            +"&reference="+referenciab+"&canal=bancamovil");
                            else if (req.getCanal().equals("04"))
                                parametrosurl.append("token="+TokenCelupagos+"&compania="+req.getCompania()+"&servicio="
                                            +req.getServicio()+"&amount="+req.getMonto()+"&phone="+req.getTelefono()
                                            +"&reference="+referenciab+"&canal=web");
                            else 
                                parametrosurl.append("token="+TokenCelupagos+"&compania="+req.getCompania()+"&servicio="
                                            +req.getServicio()+"&amount="+req.getMonto()+"&phone="+req.getTelefono()
                                            +"&reference="+referenciab+"&canal=pos");
                        }
                        if (req.getServicio().equals("2")){
                            if (req.getCanal().equals("06"))
                                parametrosurl.append("token="+TokenCelupagos+"&compania="+req.getCompania()+"&servicio="
                                            +req.getServicio()+"&amount="+req.getMonto()+"&phone="+req.getTelefono()
                                            +"&reference="+req.getReferenciaD()+"&agency_reference="+referenciab+"&canal=bancamovil");
                            else if (req.getCanal().equals("04"))
                                parametrosurl.append("token="+TokenCelupagos+"&compania="+req.getCompania()+"&servicio="
                                            +req.getServicio()+"&amount="+req.getMonto()+"&phone="+req.getTelefono()
                                            +"&reference="+req.getReferenciaD()+"&agency_reference="+referenciab+"&canal=web");
                            else 
                                parametrosurl.append("token="+TokenCelupagos+"&compania="+req.getCompania()+"&servicio="
                                            +req.getServicio()+"&amount="+req.getMonto()+"&phone="+req.getTelefono()
                                            +"&reference="+req.getReferenciaD()+"&agency_reference="+referenciab+"&canal=pos");
                        }
                    }
                    
                    if (req.getCompania().equals("2")){
                        if(req.getCanal().equals("06"))
                            parametrosurl.append("token="+TokenCelupagos+"&compania="+req.getCompania()+"&servicio="
                                            +req.getServicio()+"&amount="+req.getMonto()+"&contract="+req.getNrocontrato()
                                            +"&reference="+referenciab+"&canal=bancamovil");
                        else if (req.getCanal().equals("04"))
                            parametrosurl.append("token="+TokenCelupagos+"&compania="+req.getCompania()+"&servicio="
                                            +req.getServicio()+"&amount="+req.getMonto()+"&contract="+req.getNrocontrato()
                                            +"&reference="+referenciab+"&canal=web");
                        else
                            parametrosurl.append("token="+TokenCelupagos+"&compania="+req.getCompania()+"&servicio="
                                            +req.getServicio()+"&amount="+req.getMonto()+"&contract="+req.getNrocontrato()
                                            +"&reference="+referenciab+"&canal=pos");
                    }
                    
                    datospost = parametrosurl.toString().getBytes("UTF-8");

                    HttpURLConnection con = (HttpURLConnection) url.openConnection();
                    //propiedades del URL
                    con.setRequestMethod("POST");
                    con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                    con.setDoOutput(true);
                    //VAMOS A CELUPAGOS
                    con.getOutputStream().write(datospost);
                    
                    if (con.getResponseCode() != 200){  //SI LA RESPUESTA DE CULPAGOS NO ES EXISTOSA
                        if (con.getResponseCode() == 400 || con.getResponseCode() == 500){
                            BufferedReader in = new BufferedReader(new InputStreamReader(con.getErrorStream(), "UTF-8"));
                            String linea;
                            StringBuffer apiresponse = new StringBuffer();
                            while((linea = in.readLine()) != null){
                                apiresponse.append(linea);
                            }
                            in.close();
                            //RESPUESTA DE ERROR DE DIGITEL
                            JSONObject apires = new JSONObject(apiresponse.toString());
                            JSONObject message = apires.getJSONObject("message");
                        
                            if (message.get("errorCode") instanceof String){    //mensaje de digitel
                                consulta.setErrorCode(message.getString("errorCode"));
                                consulta.setReference(message.getString("reference"));
                            }else   //mensaje de celupagos
                                consulta.setErrorCode(String.valueOf(message.getInt("errorCode")));
                        
                            consulta.setMessage(message.getString("message"));
                            consulta.setReferenciab(in09bean.getError().getERDS02().trim());
                            log.error("RecargaCelupagos - ERROR "+ con.getResponseCode() + " - " + con.getResponseMessage()+"\n"+reqlog);
                        }else{
                            consulta.setErrorCode(String.valueOf(con.getResponseCode()));
                            consulta.setMessage(con.getResponseMessage());
                            consulta.setReferenciab(in09bean.getError().getERDS02().trim());
                            log.error("RecargaCelupagos - ERROR "+ con.getResponseCode() + " - " + con.getResponseMessage()+"\n"+reqlog);
                        }
                        //APLICAMOS REVERSO EN EL 400
                        bean.setIN962CDEB(req.getCuentadebito());
                        bean.setIN962MONT(req.getMonto());
                        if ("1".equals(req.getCompania())){
                            bean.setIN962NROT(req.getTelefono());
                            if ("1".equals(req.getServicio())){
                                bean.setIN962IDPR("03");
                                bean.setIN962RP1(consulta.getErrorCode());
                            }
                            if ("2".equals(req.getServicio())){
                                bean.setIN962IDPR("02");
                                bean.setIN962RP2(consulta.getErrorCode());
                            }
                        }
                        if ("2".equals(req.getCompania())){
                            bean.setIN962NROT(req.getNrocontrato());
                            bean.setIN962IDPR("04");
                            if (("204").equals(consulta.getErrorCode()))bean.setIN962RP1("13");
                            else if (("3001").equals(consulta.getErrorCode()))bean.setIN962RP1("40");
                            else if (("3003").equals(consulta.getErrorCode()))bean.setIN962RP1("21");
                            else bean.setIN962RP1(consulta.getErrorCode().substring(1));
                        }
                        bean.setIN962IDDG(req.getReferenciaD());
                        bean.setIN962REV("Y");
                        bean.setIN962CKN(referenciab);
                        IN096201Response revin09bean = new IN096201Response();
                        //llamada al servicio del 400
                        revin09bean = IN096202(bean);
                        //SI EL REVERSO ES EXITOSO
                        if ("2".equals(revin09bean.getError().getERRNUM())){
                            arreglo.add(consulta);
                            res.setcelupagos(arreglo.toArray(new CelupagosBean[0]));
                            log.error("RecargaCelupagos - Reverso - "+consulta.getMessage()+"\n"+reqlog);
                            return res;
                        }else{
                            consulta.setErrorCode("89");
                            consulta.setMessage("Error aplicando reverso");
                            arreglo.add(consulta);
                            res.setcelupagos(arreglo.toArray(new CelupagosBean[0]));
                            log.error("RecargaCelupagos - "+consulta.getMessage()+"\n"+reqlog);
                            return res;
                        }
                    }
                
                    BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));
                    String linea;
                    StringBuffer apiresponse = new StringBuffer();
                    while((linea = in.readLine()) != null){
                        apiresponse.append(linea);
                    }
                    in.close();
                    //RESPUESTA EXITOSA INTER Y DIGITEL
                    JSONObject obj = new JSONObject(apiresponse.toString());
                    if(!obj.isNull("errorCode")){
                        //MANEJAMOS ERROR DE INTER
                        if("-".equals(obj.getString("errorCode").substring(0, 1))){
                            //ARMAMOS REQUEST PARA REVERSO EN EL 400
                            bean.setIN962CDEB(req.getCuentadebito());
                            bean.setIN962MONT(req.getMonto());
                            if ("1".equals(req.getCompania())){
                                bean.setIN962NROT(req.getTelefono());
                                if ("1".equals(req.getServicio())){
                                    bean.setIN962IDPR("03");
                                    bean.setIN962RP1(obj.getString("errorCode"));
                                }
                                if ("2".equals(req.getServicio())){
                                    bean.setIN962IDPR("02");
                                    bean.setIN962RP2(obj.getString("errorCode"));
                                }
                            }
                            if ("2".equals(req.getCompania())){
                                bean.setIN962NROT(req.getNrocontrato());
                                bean.setIN962IDPR("04");
                                if (("204").equals(obj.getString("errorCode")))bean.setIN962RP1("13");
                                else if (("3001").equals(obj.getString("errorCode")))bean.setIN962RP1("40");
                                else if (("3003").equals(obj.getString("errorCode")))bean.setIN962RP1("21");
                                else bean.setIN962RP1(obj.getString("errorCode").substring(1));
                            }
                            bean.setIN962IDDG(req.getReferenciaD());
                            bean.setIN962REV("Y");
                            bean.setIN962CKN(referenciab);
                            IN096201Response revin09bean = new IN096201Response();
                            //llamada al servicio del 400
                            revin09bean = IN096202(bean);
                            //SI EL REVERSO ES EXITOSO
                            if ("2".equals(revin09bean.getError().getERRNUM())){
                                consulta.setErrorCode(obj.getString("errorCode"));
                                consulta.setMessage(obj.getString("message"));
                                arreglo.add(consulta);
                                res.setcelupagos(arreglo.toArray(new CelupagosBean[0]));
                                log.error("RecargaCelupagos - "+consulta.getMessage()+"\n"+reqlog);
                                return res;
                            }else{
                                consulta.setErrorCode("89");
                                consulta.setMessage("Error aplicando reverso");
                                arreglo.add(consulta);
                                res.setcelupagos(arreglo.toArray(new CelupagosBean[0]));
                                log.error("RecargaCelupagos - "+consulta.getMessage()+"\n"+reqlog);
                                return res;
                            }
                        }
                        ObjectMapper apires = new ObjectMapper();
                        consulta = apires.readValue(apiresponse.toString(), CelupagosBean.class);
                        consulta.setReferenciab(referenciab);
                        arreglo.add(consulta);
                        res.setcelupagos(arreglo.toArray(new CelupagosBean[0]));
                        return res;
                    }

                    //MANEJAMOS EL ERROR DE COMUNICACION ENTRE API BANCO Y API CELUPAGOS PARA APLICAR REVERSO
                    //Y RESPUESTA NO EXISTOSA INTER Y DIGITEL
                    if(!obj.isNull("statusCode") || !obj.isNull("message")){
                        if(!obj.isNull("message")){
                            JSONObject obj2 = new JSONObject(obj.getJSONObject("message").toString());
                            consulta.setMessage(obj2.getString("message"));
                            if (obj2.get("errorCode") instanceof String)
                                consulta.setErrorCode(obj2.getString("errorCode"));
                            else
                                consulta.setErrorCode(String.valueOf(obj2.getInt("errorCode")));
                            
                            if ("1".equals(req.getCompania())){
                                if ("1".equals(req.getServicio()))
                                    bean.setIN962RP1(consulta.getErrorCode());
                                
                                if ("2".equals(req.getServicio()))
                                    bean.setIN962RP2(consulta.getErrorCode());
                            }
                            
                            if ("2".equals(req.getCompania())){
                                if (("204").equals(consulta.getErrorCode()))bean.setIN962RP1("13");
                                else if (("3001").equals(consulta.getErrorCode()))bean.setIN962RP1("40");
                                else if (("3003").equals(consulta.getErrorCode()))bean.setIN962RP1("21");
                                else bean.setIN962RP1(consulta.getErrorCode().substring(1));
                            }
                        }
                        if(!obj.isNull("statusCode")){
                            ObjectMapper apires = new ObjectMapper();
                            consulta = apires.readValue(apiresponse.toString(), CelupagosBean.class);
                            consulta.setReferenciab(referenciab);
                            //arreglo.add(consulta);
                        }
                        //APLICAMOS REVERSO EN EL 400
                        bean.setIN962CDEB(req.getCuentadebito());
                        bean.setIN962MONT(req.getMonto());
                        if ("1".equals(req.getCompania())){
                            bean.setIN962NROT(req.getTelefono());
                            if ("1".equals(req.getServicio()))
                                bean.setIN962IDPR("03");
                            
                            if ("2".equals(req.getServicio()))
                                bean.setIN962IDPR("02");
                        }
                        if ("2".equals(req.getCompania())){
                            bean.setIN962NROT(req.getNrocontrato());
                            bean.setIN962IDPR("04");
                        }
                        bean.setIN962IDDG(req.getReferenciaD());
                        bean.setIN962REV("Y");
                        bean.setIN962CKN(referenciab);
                        IN096201Response revin09bean = new IN096201Response();
                        //llamada al servicio del 400
                        revin09bean = IN096202(bean);
                        //SI EL REVERSO NO ES EXITOSO
                        if (!"2".equals(revin09bean.getError().getERRNUM())){
                            consulta.setErrorCode("89");
                            consulta.setMessage("Error aplicando reverso");
                            arreglo.add(consulta);
                            res.setcelupagos(arreglo.toArray(new CelupagosBean[0]));
                            log.error("RecargaCelupagos - "+consulta.getMessage()+"\n"+reqlog);
                            return res;
                        }else{
                            log.error("RecargaCelupagos - "+consulta.getMessage()+"\n"+reqlog);
                            arreglo.add(consulta);
                        }
                    }
                    res.setcelupagos(arreglo.toArray(new CelupagosBean[0]));
                }else{ // Si el debito en el 400 es fallido
                    consulta.setErrorCode("89");
                    consulta.setMessage(in09bean.getError().getERDS01());
                    arreglo.add(consulta);
                    res.setcelupagos(arreglo.toArray(new CelupagosBean[0]));
                    log.error("RecargaCelupagos - "+consulta.getMessage()+"\n"+reqlog);
                }
                
            }catch(Exception e){
                consulta.setErrorCode("89");
                consulta.setMessage("Excepcion - "+e.toString());
                arreglo.add(consulta);
                res.setcelupagos(arreglo.toArray(new CelupagosBean[0]));
                log.error("RecargaCelupagos - "+consulta.getMessage()+"\n"+reqlog);
                return res;
            }
            
            return res;
        }
        
        public CelupagosResponse Celupagos(CelupagosRequest req) throws WSException{
        log.info("Invocando Celupagos");
        List <CelupagosBean> arreglo = new ArrayList<CelupagosBean>();
        CelupagosResponse res = new CelupagosResponse();
        CelupagosBean bean = new CelupagosBean();
        // VALIDAMOS OPERACION //
        if (req.getOpe() == null || req.getOpe().equals("")){
            bean.setMessage("Operacion no valida");
            bean.setErrorCode("89");
            arreglo.add(bean);
            res.setcelupagos(arreglo.toArray(new CelupagosBean[0]));
            return res;
        }// VALIDAMOS COMPAÑIA //
        if (req.getCompania() == null || "".equals(req.getCompania())){
            bean.setMessage("Comañina no valida");
            bean.setErrorCode("89");
            arreglo.add(bean);
            res.setcelupagos(arreglo.toArray(new CelupagosBean[0]));
            return res;
        // VALIDACIONES PARA INTER //
        }else if (req.getCompania().equals("2")){
            // VALIDAMOS CONTRATO Y DOCUMENTOID //
            if ((req.getNrocontrato() == null || "".equals(req.getNrocontrato())) && 
                    (req.getNrodocumento() == null || "".equals(req.getNrodocumento()))){
                bean.setMessage("Documento o contrato no valido");
                bean.setErrorCode("89");
                arreglo.add(bean);
                res.setcelupagos(arreglo.toArray(new CelupagosBean[0]));
                return res;
            }
            //si la operacion es consulta validamos que venga SOLO el documentoID o el contrato
            if ("1".equals(req.getOpe()))
                if (!"".equals(req.getNrodocumento()) && !"".equals(req.getNrocontrato())){
                    bean.setMessage("Documento o contrato no valido");
                    bean.setErrorCode("89");
                    arreglo.add(bean);
                    res.setcelupagos(arreglo.toArray(new CelupagosBean[0]));
                    return res;
                }
        // VALIDACIONE DE DIGITEL //
        }else if (req.getCompania().equals("1")){
            // VALIDAMOS TELEFONO //
            if (req.getTelefono() == null || "".equals(req.getTelefono())){
                bean.setMessage("Telefono no valido");
                bean.setErrorCode("89");
                arreglo.add(bean);
                res.setcelupagos(arreglo.toArray(new CelupagosBean[0]));
                return res;
            }
            //si la operacion es recarga validamos referencias
            if ("2".equals(req.getOpe())){
                //si el servicio es postpago validamos referencia de DIGITEL
                if ("2".equals(req.getServicio()))
                    if (req.getReferenciaD() == null || "".equals(req.getReferenciaD())){
                        bean.setMessage("Referencia digitel no valida");
                        bean.setErrorCode("89");
                        arreglo.add(bean);
                        res.setcelupagos(arreglo.toArray(new CelupagosBean[0]));
                        return res;
                    }
            }
        }
        
        if (req.getOpe().equals("1"))
            res = ConsultaCelupagos(req);
            
        if (req.getOpe().equals("2"))
            res = RecargaCelupagos(req);
        
        return res;
        }
        
	/**
	 * Servicio para realizar Transferencias Internas Moneda Extranjera.
	 * @param req
	 * @return
	 * @throws WSException 
	 */
	public INTRFDSJV6Response INTRFDSJV6(INTRFDSJV6Bean req) throws WSException {
            log.info("Invocando INTRFDSJV6");
            Parametros params = new Parametros();
            Socket s = null;
            INTRFDSJV6Response res = new INTRFDSJV6Response();
            try {
                    MessageContext mc;
                    s = new Socket(params.getString("ip"), params.getInt("port1"));
                    s.setSoTimeout(params.getInt("timeout"));
                    mc = new MessageContext(new DataInputStream(new BufferedInputStream(s.getInputStream())), new DataOutputStream(
                                    new BufferedOutputStream(s.getOutputStream())), "com.activo.gateway.dibs.messages");
                    INTRFDSJV6Message message = (INTRFDSJV6Message) mc.getMessageRecord("INTRFDSJV6");
                    List<IMSSGDSJVBean> x = new ArrayList<IMSSGDSJVBean>();
                    if(req.getINTUSR6() != null && !"".equals(req.getINTUSR6()))message.setINTUSR(req.getINTUSR6());
                    if(req.getINTFRMACC6() != null && !"".equals(req.getINTFRMACC6()))message.setINTFRMACC(req.getINTFRMACC6());
                    if(req.getINTTOACC6() != null && !"".equals(req.getINTTOACC6()))message.setINTTOACC(req.getINTTOACC6());
                    if(req.getINTTRFAMT6() != null && !"".equals(req.getINTTRFAMT6()))message.setINTTRFAMT(req.getINTTRFAMT6());
                    if(req.getINTTYPE6() != null && !"".equals(req.getINTTYPE6()))message.setINTTYPE(req.getINTTYPE6());
                    if(req.getINTREF6() != null && !"".equals(req.getINTREF6()))message.setINTREF(req.getINTREF6());
                    if(req.getINTDESC6() != null && !"".equals(req.getINTDESC6()))message.setINTDESC(req.getINTDESC6());			
                    if(req.getINTCANAL6()!= null && !"".equals(req.getINTCANAL6()))message.setINTCANAL(req.getINTCANAL6());
                    if(req.getINTCCY6()!= null && !"".equals(req.getINTCCY6()))message.setINTCCY(req.getINTCCY6());
                    if(req.getINTDIP6()!= null && !"".equals(req.getINTDIP6()))message.setINTDIP(req.getINTDIP6());

                    message.send();
                    message.destroy();
                    MessageRecord newmessage = mc.receiveMessage();
                    if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("*"))) {
                            manejarError(res, ((ELEERRMessage) newmessage));
                            if(!(res.getError().getERRNUM().equals("0"))){
                                    log.error("INTRFDSJV6 - Transferencias internas Moneda Extranjera: " + " Error: "+ res.getError().getERNU01() + " - " + res.getError().getERDS01());
                                    return res;
                            } 
                            //Si es una transferencia a terceros en activo se envia mensaje
                            if("t".equals(req.getOperacion())){
                                    String mensaje = "13";
                                    //Se llama al servicio de envio de mensajes de texto
                                    ENVIASMS(req.getCanal(), mensaje, req.getINTTRFAMT6(), req.getINTFRMACC6(), res.getError().getERDF01().trim(), null, null, null);
                            }
                    }
            } catch (Exception e) {
                    log.error("INTRFDSJV6 - Transferencias internas Moneda Extranjera- " + e.getMessage(),e);
                    throw new WSException(e);
            } finally {
                    if (s != null)
                            try {
                                    s.close();
                            } catch (IOException e) {
                            }
            }
            return res;
	}
        
        /**
	 * Servicio para Afiliacion/Modificacion/Eliminacion/Consulta C2P
	 * @param req
	 * @return
	 * @throws WSException
	 */
	public IN208001Response IN208001(IN208001Bean req) throws WSException{
		
            log.info("Invocando IN208001");
            Socket s = null;
            IN208001Response res = new IN208001Response();

            try {
                Parametros params = new Parametros();
                MessageContext mc;
                s = new Socket(params.getString("ip"), params.getInt("port3"));
                s.setSoTimeout(params.getInt("timeout"));
                mc = new MessageContext(new DataInputStream(new BufferedInputStream(s.getInputStream())), new DataOutputStream(
                                new BufferedOutputStream(s.getOutputStream())), "com.activo.gateway.dibs.messages");
                IN208001Message message;
                message = (IN208001Message) mc.getMessageRecord("IN208001");
                if(req.getIN2080OPC() != null && !"".equals(req.getIN2080OPC()))message.setIN2080OPC(req.getIN2080OPC());
                if(req.getIN2080USE() != null && !"".equals(req.getIN2080USE()))message.setIN2080USE(req.getIN2080USE());
                if(req.getIN2080IDN() != null && !"".equals(req.getIN2080IDN()))message.setIN2080IDN(req.getIN2080IDN());
                if(req.getIN2080ACC() != null && !"".equals(req.getIN2080ACC()))message.setIN2080ACC(req.getIN2080ACC());
                if(req.getIN2080COD() != null && !"".equals(req.getIN2080COD()))message.setIN2080COD(req.getIN2080COD());
                if(req.getIN2080FAF() != null && !"".equals(req.getIN2080FAF()))message.setIN2080FAF(req.getIN2080FAF());
                if(req.getIN2080ERR() != null && !"".equals(req.getIN2080ERR()))message.setIN2080ERR(req.getIN2080ERR());
                if(req.getIN2080MSE() != null && !"".equals(req.getIN2080MSE()))message.setIN2080MSE(req.getIN2080MSE());
                message.send();
                message.destroy();
                MessageRecord newmessage = mc.receiveMessage();
                if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("0"))) {
                        manejarError(res, ((ELEERRMessage) newmessage));
                        log.error("IN208001 - C2P: " + " Error: "+ res.getError().getERNU01() + " - " + res.getError().getERDS01() + " - Canal " + req.getCanal());
                        return res;
                } else if (newmessage.getFormatName().equals("IN208001")) {

                    IN208001Bean bean = new IN208001Bean();
                    bean.setIN2080OPC(((IN208001Message) newmessage).getIN2080OPC());
                    bean.setIN2080USE(((IN208001Message) newmessage).getIN2080USE());
                    bean.setIN2080IDN(((IN208001Message) newmessage).getIN2080IDN());
                    bean.setIN2080ACC(((IN208001Message) newmessage).getIN2080ACC());
                    bean.setIN2080COD(((IN208001Message) newmessage).getIN2080COD());
                    bean.setIN2080FAF(((IN208001Message) newmessage).getIN2080FAF());
                    bean.setIN2080ERR(((IN208001Message) newmessage).getIN2080ERR());
                    bean.setIN2080MSE(((IN208001Message) newmessage).getIN2080MSE());
                    res.setIN208001(bean);
                }
            } catch (Exception e) {
                log.error("IN208001 - C2P - " + e.getMessage() + " - Canal " + req.getCanal(),e);
                throw new WSException(e);
            } finally {
                if (s != null)
                try {
                    s.close();
                } catch (IOException e) {
                }
            }
            return res;
	}
        
       
        /**
	 * Servicio para la Validacion/Bloqueo y Desbloqueo/Mesa de Cambio.
	 * @param req
	 * @return
	 * @throws WSException
	 */
	public NIBVCDI01Response NIBVCDI01(NIBVCDI01Bean req) throws WSException{
            
            log.info("Invocando NIBVCRI01");
            Socket s = null;
            NIBVCDI01Response res = new NIBVCDI01Response();
            
            try {
                Parametros params = new Parametros();
                MessageContext mc;
                s = new Socket(params.getString("ip"), params.getInt("port1"));
                s.setSoTimeout(params.getInt("timeout"));
                mc = new MessageContext(new DataInputStream(new BufferedInputStream(s.getInputStream())), new DataOutputStream(
                                new BufferedOutputStream(s.getOutputStream())), "com.activo.gateway.dibs.messages");
                NIBVCDI01Message message;
                message = (NIBVCDI01Message)mc.getMessageRecord("NIBVCDI01");
                if(req.getINVCTIPO() != null && !"".equals(req.getINVCTIPO())) message.setINVCTIPO(req.getINVCTIPO());
                if(req.getINVCPROC() != null && !"".equals(req.getINVCPROC())) message.setINVCPROC(req.getINVCPROC());			
                if(req.getINVCDOTR() != null && !"".equals(req.getINVCDOTR())) message.setINVCDOTR(req.getINVCDOTR());
                if(req.getINVCDDTR() != null && !"".equals(req.getINVCDDTR())) message.setINVCDDTR(req.getINVCDDTR());
                if(req.getINVCNACI() != null && !"".equals(req.getINVCNACI())) message.setINVCNACI(req.getINVCNACI());
                if(req.getINVCCEDU() != null && !"".equals(req.getINVCCEDU())) message.setINVCCEDU(req.getINVCCEDU());
                if(req.getINVCCTAO() != null && !"".equals(req.getINVCCTAO())) message.setINVCCTAO(req.getINVCCTAO());
                if(req.getINVCCTAD() != null && !"".equals(req.getINVCCTAD())) message.setINVCCTAD(req.getINVCCTAD());
                if(req.getINVCMTOO() != null && !"".equals(req.getINVCMTOO())) message.setINVCMTOO(req.getINVCMTOO());
                if(req.getINVCMTOD() != null && !"".equals(req.getINVCMTOD())) message.setINVCMTOD(req.getINVCMTOD());
                if(req.getINVCTBCV() != null && !"".equals(req.getINVCTBCV())) message.setINVCTBCV(req.getINVCTBCV());
                if(req.getINVCTCLI() != null && !"".equals(req.getINVCTCLI())) message.setINVCTCLI(req.getINVCTCLI());
                if(req.getINVCREFE() != null && !"".equals(req.getINVCREFE())) message.setINVCREFE(req.getINVCREFE());
                if(req.getINVCCDRE() != null && !"".equals(req.getINVCCDRE())) message.setINVCCDRE(req.getINVCCDRE());                                
                if(req.getINVCCTAC() != null && !"".equals(req.getINVCCTAC())) message.setINVCCTAC(req.getINVCCTAC());
                if(req.getINVCMTOC() != null && !"".equals(req.getINVCMTOC())) message.setINVCMTOC(req.getINVCMTOC());
                if(req.getINVCMTRE() != null && !"".equals(req.getINVCMTRE())) message.setINVCMTRE(req.getINVCMTRE());
                if(req.getINVPORCO() != null && !"".equals(req.getINVPORCO())) message.setINVPORCO(req.getINVPORCO());
                
                message.send();
                message.destroy();
                MessageRecord newmessage = mc.receiveMessage();
                if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("0"))) {
                    manejarError(res, ((ELEERRMessage) newmessage));
                    log.error("NIBVCDI01 - Mesa de Cambio " + " Error: "+ res.getError().getERNU01() + " - " + res.getError().getERDS01() + " - Canal " + req.getCanal());
                    return res;
                } else {
                    if (newmessage.getFormatName().equals("NIBVCDI01")) {
                        NIBVCDI01Message msg = (NIBVCDI01Message) newmessage;
                        NIBVCDI01Bean bean = new NIBVCDI01Bean();
                        res.setNIBVCDI01(bean);
                        bean.setINVCTIPO(msg.getINVCTIPO());
                        bean.setINVCPROC(msg.getINVCPROC());
                        bean.setINVCDOTR(msg.getINVCDOTR());
                        bean.setINVCDDTR(msg.getINVCDDTR());
                        bean.setINVCNACI(msg.getINVCNACI());
                        bean.setINVCCEDU(msg.getINVCCEDU());
                        bean.setINVCCTAO(msg.getINVCCTAO());
                        bean.setINVCCTAD(msg.getINVCCTAD());
                        bean.setINVCMTOO(msg.getINVCMTOO());
                        bean.setINVCMTOD(msg.getINVCMTOD());
                        bean.setINVCTBCV(msg.getINVCTBCV());
                        bean.setINVCTCLI(msg.getINVCTCLI());
                        bean.setINVCREFE(msg.getINVCREFE());
                        bean.setINVCCDRE(msg.getINVCCDRE());                        
                        bean.setINVCCTAC(msg.getINVCCTAC());
                        bean.setINVCMTOC(msg.getINVCMTOC());
                        bean.setINVCMTRE(msg.getINVCMTRE());
                        bean.setINVPORCO(msg.getINVPORCO());
                    }
                }
            }catch (Exception e) {
                    log.error("NIBVCDI01 - Mesa de Cambio  - " + e.getMessage() + " - Canal " + req.getCanal(),e);
                    throw new WSException(e);
            } finally {
                if (s != null)
                try {
                        s.close();
                } catch (IOException e) {
                }
            }
            return res;
	}
        
        /**
	 * Servicio para la Intervencion Cambiaria.
	 * @param req
	 * @return
	 * @throws WSException
	 */
	public NIBVINT01Response NIBVINT01(NIBVINT01Bean req) throws WSException{
            
            log.info("Invocando NIBVINT01");
            Socket s = null;
            NIBVINT01Response res = new NIBVINT01Response();
            
            try {
                Parametros params = new Parametros();
                MessageContext mc;
                s = new Socket(params.getString("ip"), params.getInt("port1"));
                s.setSoTimeout(params.getInt("timeout"));
                mc = new MessageContext(new DataInputStream(new BufferedInputStream(s.getInputStream())), new DataOutputStream(
                                new BufferedOutputStream(s.getOutputStream())), "com.activo.gateway.dibs.messages");
                NIBVINT01Message message;
                message = (NIBVINT01Message)mc.getMessageRecord("NIBVINT01");
                if(req.getINTCTIPO() != null && !"".equals(req.getINTCTIPO())) message.setINTCTIPO(req.getINTCTIPO());
                if(req.getINTCPROC() != null && !"".equals(req.getINTCPROC())) message.setINTCPROC(req.getINTCPROC());			
                if(req.getINTCDOTR() != null && !"".equals(req.getINTCDOTR())) message.setINTCDOTR(req.getINTCDOTR());
                if(req.getINTCDDTR() != null && !"".equals(req.getINTCDDTR())) message.setINTCDDTR(req.getINTCDDTR());
                if(req.getINTCNACI() != null && !"".equals(req.getINTCNACI())) message.setINTCNACI(req.getINTCNACI());
                if(req.getINTCCEDU() != null && !"".equals(req.getINTCCEDU())) message.setINTCCEDU(req.getINTCCEDU());
                if(req.getINTCCTAO() != null && !"".equals(req.getINTCCTAO())) message.setINTCCTAO(req.getINTCCTAO());
                if(req.getINTCCTAD() != null && !"".equals(req.getINTCCTAD())) message.setINTCCTAD(req.getINTCCTAD());
                if(req.getINTCCTAC() != null && !"".equals(req.getINTCCTAC())) message.setINTCCTAC(req.getINTCCTAC());
                if(req.getINTCMTOO() != null && !"".equals(req.getINTCMTOO())) message.setINTCMTOO(req.getINTCMTOO());
                if(req.getINTCMTOD() != null && !"".equals(req.getINTCMTOD())) message.setINTCMTOD(req.getINTCMTOD());
                if(req.getINTCMTOC() != null && !"".equals(req.getINTCMTOC())) message.setINTCMTOC(req.getINTCMTOC());
                if(req.getINTCTBCV() != null && !"".equals(req.getINTCTBCV())) message.setINTCTBCV(req.getINTCTBCV());
                if(req.getINTCTCLI() != null && !"".equals(req.getINTCTCLI())) message.setINTCTCLI(req.getINTCTCLI());                                
                if(req.getINTCREFE() != null && !"".equals(req.getINTCREFE())) message.setINTCREFE(req.getINTCREFE());
                if(req.getINTCCDRE() != null && !"".equals(req.getINTCCDRE())) message.setINTCCDRE(req.getINTCCDRE());
                if(req.getINTCINTE() != null && !"".equals(req.getINTCINTE())) message.setINTCINTE(req.getINTCINTE());
                if(req.getINTCFIIN() != null && !"".equals(req.getINTCFIIN())) message.setINTCFIIN(req.getINTCFIIN());			
                if(req.getINTCFFIN() != null && !"".equals(req.getINTCFFIN())) message.setINTCFFIN(req.getINTCFFIN());
                if(req.getINTCFVAL() != null && !"".equals(req.getINTCFVAL())) message.setINTCFVAL(req.getINTCFVAL());
                if(req.getINTCFPRO() != null && !"".equals(req.getINTCFPRO())) message.setINTCFPRO(req.getINTCFPRO());
                if(req.getINTCHPRO() != null && !"".equals(req.getINTCHPRO())) message.setINTCHPRO(req.getINTCHPRO());
                if(req.getINTCFENB() != null && !"".equals(req.getINTCFENB())) message.setINTCFENB(req.getINTCFENB());
                if(req.getINTCSTAU() != null && !"".equals(req.getINTCSTAU())) message.setINTCSTAU(req.getINTCSTAU());
                if(req.getINTCORIF() != null && !"".equals(req.getINTCORIF())) message.setINTCORIF(req.getINTCORIF());
                if(req.getINTCDESF() != null && !"".equals(req.getINTCDESF())) message.setINTCDESF(req.getINTCDESF());
                
                message.send();
                message.destroy();
                MessageRecord newmessage = mc.receiveMessage();
                if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("0"))) {
                    manejarError(res, ((ELEERRMessage) newmessage));
                    log.error("NIBVINT01 - Intervencion Cambiaria " + " Error: "+ res.getError().getERNU01() + " - " + res.getError().getERDS01() + " - Canal " + req.getCanal());
                    return res;
                } else {
                    if (newmessage.getFormatName().equals("NIBVINT01")) {
                        NIBVINT01Message msg = (NIBVINT01Message) newmessage;
                        NIBVINT01Bean bean = new NIBVINT01Bean();
                        res.setNIBVINT01(bean);
                        bean.setINTCTIPO(msg.getINTCTIPO());
                        bean.setINTCPROC(msg.getINTCPROC());
                        bean.setINTCDOTR(msg.getINTCDOTR());
                        bean.setINTCDDTR(msg.getINTCDDTR());
                        bean.setINTCNACI(msg.getINTCNACI());
                        bean.setINTCCEDU(msg.getINTCCEDU());
                        bean.setINTCCTAO(msg.getINTCCTAO());
                        bean.setINTCCTAD(msg.getINTCCTAD());
                        bean.setINTCCTAC(msg.getINTCCTAC());
                        bean.setINTCMTOO(msg.getINTCMTOO());
                        bean.setINTCMTOD(msg.getINTCMTOD());
                        bean.setINTCMTOC(msg.getINTCMTOC());
                        bean.setINTCTBCV(msg.getINTCTBCV());
                        bean.setINTCTCLI(msg.getINTCTCLI());                        
                        bean.setINTCREFE(msg.getINTCREFE());
                        bean.setINTCCDRE(msg.getINTCCDRE());
                        bean.setINTCINTE(msg.getINTCINTE());
                        bean.setINTCFIIN(msg.getINTCFIIN());
                        bean.setINTCFFIN(msg.getINTCFFIN());
                        bean.setINTCFVAL(msg.getINTCFVAL());
                        bean.setINTCFPRO(msg.getINTCFPRO());
                        bean.setINTCHPRO(msg.getINTCHPRO());
                        bean.setINTCFENB(msg.getINTCFENB());
                        bean.setINTCSTAU(msg.getINTCSTAU());
                        bean.setINTCORIF(msg.getINTCORIF());
                        bean.setINTCDESF(msg.getINTCDESF());
                    }
                }
            }catch (Exception e) {
                    log.error("NIBVINT01 - Intervencion Cambiaria  - " + e.getMessage() + " - Canal " + req.getCanal(),e);
                    throw new WSException(e);
            } finally {
                if (s != null)
                try {
                        s.close();
                } catch (IOException e) {
                }
            }
            return res;
	}
        /**
	 * Servicio para  devolver las comisiones a cobrar tanto por Emisión como por  Recarga.
	 * @param req
	 * @return
	 * @throws WSException
	 */
        public IN206001Response IN206001(IN206001Bean req) throws WSException{
            
            log.info("Invocando IN206001");
            Socket s = null;
            IN206001Response res = new IN206001Response();
            
            try {
                Parametros params = new Parametros();
                MessageContext mc;
                s = new Socket(params.getString("ip"), params.getInt("port9"));
                s.setSoTimeout(params.getInt("timeout"));
                mc = new MessageContext(new DataInputStream(new BufferedInputStream(s.getInputStream())), new DataOutputStream(
                                new BufferedOutputStream(s.getOutputStream())), "com.activo.gateway.dibs.messages");
                IN206001Message message;
                message = (IN206001Message)mc.getMessageRecord("IN206001");
                if(req.getIN2060COD() != null && !"".equals(req.getIN2060COD())) message.setIN2060COD(req.getIN2060COD());
                if(req.getIN2060COM() != null && !"".equals(req.getIN2060COM())) message.setIN2060COM(req.getIN2060COM());          
                if(req.getIN2060TIP() != null && !"".equals(req.getIN2060TIP())) message.setIN2060TIP(req.getIN2060TIP());
                if(req.getIN2060EXR() != null && !"".equals(req.getIN2060EXR())) message.setIN2060EXR(req.getIN2060EXR());
                if(req.getIN2060CCY() != null && !"".equals(req.getIN2060CCY())) message.setIN2060CCY(req.getIN2060CCY());
                if(req.getIN2060ERR() != null && !"".equals(req.getIN2060ERR())) message.setIN2060ERR(req.getIN2060ERR());
                if(req.getIN2060MSE() != null && !"".equals(req.getIN2060MSE())) message.setIN2060MSE(req.getIN2060MSE());
                             
                message.send();
                message.destroy();
                MessageRecord newmessage = mc.receiveMessage();
                if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("0"))) {
                    manejarError(res, ((ELEERRMessage) newmessage));
                    log.error("IN206001 - Tasa Tarjeta Prepagada " + " Error: "+ res.getError().getERNU01() + " - " + res.getError().getERDS01() + " - Canal " + req.getCanal());
                    return res;
                } else {
                    if (newmessage.getFormatName().equals("IN206001")) {
                       IN206001Message msg = (IN206001Message) newmessage;
                        IN206001Bean bean = new IN206001Bean();
                        res.setIN206001(bean);
                        bean.setIN2060COD(msg.getIN2060COD());
                        bean.setIN2060COM(msg.getIN2060COM());
                        bean.setIN2060TIP(msg.getIN2060TIP());
                        bean.setIN2060EXR(msg.getIN2060EXR());
                        bean.setIN2060CCY(msg.getIN2060CCY());
                        bean.setIN2060ERR(msg.getIN2060ERR());
                        bean.setIN2060MSE(msg.getIN2060MSE());
                    }
                }
            }catch (Exception e) {
                    log.error("IN206001 - Tasa Tarjeta Prepagada  - " + e.getMessage() + " - Canal " + req.getCanal(),e);
                    throw new WSException(e);
            } finally {
                if (s != null)
                try {
                        s.close();
                } catch (IOException e) {
                }
            }
            return res;
	}
                 /**
	 * Servicio para  Cobro de Comisiones y Recargas
	 * @param req
	 * @return
	 * @throws WSException
	 */
        public IN206101Response IN206101(IN206101Bean req) throws WSException{
            
            log.info("Invocando IN206101");
            Socket s = null;
            IN206101Response res = new IN206101Response();
            
            try {
                Parametros params = new Parametros();
                MessageContext mc;
                s = new Socket(params.getString("ip"), params.getInt("port9"));
                //s = new Socket(params.getString("ip"), params.getInt("port4"));
                s.setSoTimeout(params.getInt("timeout"));
                mc = new MessageContext(new DataInputStream(new BufferedInputStream(s.getInputStream())), new DataOutputStream(
                                new BufferedOutputStream(s.getOutputStream())), "com.activo.gateway.dibs.messages");
                IN206101Message message;
                message = (IN206101Message)mc.getMessageRecord("IN206101");
                if(req.getIN2061COD() != null && !"".equals(req.getIN2061COD())) message.setIN2061COD(req.getIN2061COD());
                if(req.getIN2061CDB() != null && !"".equals(req.getIN2061CDB())) message.setIN2061CDB(req.getIN2061CDB());          
                if(req.getIN2061CCY() != null && !"".equals(req.getIN2061CCY())) message.setIN2061CCY(req.getIN2061CCY());
                if(req.getIN2061CAN() != null && !"".equals(req.getIN2061CAN())) message.setIN2061CAN(req.getIN2061CAN());
                if(req.getIN2061DIP() != null && !"".equals(req.getIN2061DIP())) message.setIN2061DIP(req.getIN2061DIP());
                if(req.getIN2061COM() != null && !"".equals(req.getIN2061COM())) message.setIN2061COM(req.getIN2061COM());
                if(req.getIN2061MRE() != null && !"".equals(req.getIN2061MRE())) message.setIN2061MRE(req.getIN2061MRE());
                if(req.getIN2061TDC() != null && !"".equals(req.getIN2061TDC())) message.setIN2061TDC(req.getIN2061TDC());
                if(req.getIN2061ERR() != null && !"".equals(req.getIN2061ERR())) message.setIN2061ERR(req.getIN2061ERR());
                if(req.getIN2061MSE() != null && !"".equals(req.getIN2061MSE())) message.setIN2061MSE(req.getIN2061MSE());
                             
                message.send();
                message.destroy();
                MessageRecord newmessage = mc.receiveMessage();
                if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("0"))) {
                    manejarError(res, ((ELEERRMessage) newmessage));
                    log.error("IN206101 - Recarga y Comision tarjeta prepagada " + " Error: "+ res.getError().getERNU01() + " - " + res.getError().getERDS01() + " - Canal " + req.getCanal());
                    return res;
                } else {
                    if (newmessage.getFormatName().equals("IN206101")) {
                       IN206101Message msg = (IN206101Message) newmessage;
                        IN206101Bean bean = new IN206101Bean();
                        log.error("IN206101 - Recarga y Comision tarjeta prepagada " + res);
                        bean.setIN2061COD(msg.getIN2061COD());
                        bean.setIN2061CDB(msg.getIN2061CDB());
                        bean.setIN2061CCY(msg.getIN2061CCY());
                        bean.setIN2061CAN(msg.getIN2061CAN());
                        bean.setIN2061DIP(msg.getIN2061DIP());
                        bean.setIN2061COM(msg.getIN2061COM());
                        bean.setIN2061MRE(msg.getIN2061MRE());
                        bean.setIN2061TDC(msg.getIN2061TDC());
                        bean.setIN2061ERR(msg.getIN2061ERR());
                        bean.setIN2061MSE(msg.getIN2061MSE());
                        res.setIN206101(bean);
                        
                       
                    }
                }
            }catch (Exception e) {
                    log.error("IN206101 - Comision y recarga Tarjeta Prepagada  - " + e.getMessage() + " - Canal " + req.getCanal(),e);
                    throw new WSException(e);
            } finally {
                if (s != null)
                try {
                        s.close();
                } catch (IOException e) {
                }
            }
            return res;
	}
         /**
	 * Servicio para Menudeo.
	 * @param req
	 * @return
	 * @throws WSException
	 */
	public NIBMENU01Response NIBMENU01(NIBMENU01Bean req) throws WSException{
            
            log.info("Invocando NIBMENU01");
            Socket s = null;
            NIBMENU01Response res = new NIBMENU01Response();
            
            try {
                Parametros params = new Parametros();
                MessageContext mc;
                s = new Socket(params.getString("ip"), params.getInt("port1"));
                s.setSoTimeout(params.getInt("timeout"));
                mc = new MessageContext(new DataInputStream(new BufferedInputStream(s.getInputStream())), new DataOutputStream(
                                new BufferedOutputStream(s.getOutputStream())), "com.activo.gateway.dibs.messages");
                NIBMENU01Message message;
                message = (NIBMENU01Message)mc.getMessageRecord("NIBMENU01");
                if(req.getNIBMTIPO() != null && !"".equals(req.getNIBMTIPO())) message.setNIBMTIPO(req.getNIBMTIPO());
                if(req.getNIBMPROC() != null && !"".equals(req.getNIBMPROC())) message.setNIBMPROC(req.getNIBMPROC());			
                if(req.getNIBMDOTR() != null && !"".equals(req.getNIBMDOTR())) message.setNIBMDOTR(req.getNIBMDOTR());
                if(req.getNIBMDDTR() != null && !"".equals(req.getNIBMDDTR())) message.setNIBMDDTR(req.getNIBMDDTR());
                if(req.getNIBMNACI() != null && !"".equals(req.getNIBMNACI())) message.setNIBMNACI(req.getNIBMNACI());
                if(req.getNIBMCEDU() != null && !"".equals(req.getNIBMCEDU())) message.setNIBMCEDU(req.getNIBMCEDU());
                if(req.getNIBMCTAO() != null && !"".equals(req.getNIBMCTAO())) message.setNIBMCTAO(req.getNIBMCTAO());
                if(req.getNIBMCTAD() != null && !"".equals(req.getNIBMCTAD())) message.setNIBMCTAD(req.getNIBMCTAD());
                if(req.getNIBMCTAC() != null && !"".equals(req.getNIBMCTAC())) message.setNIBMCTAC(req.getNIBMCTAC());
                if(req.getNIBMMTOO() != null && !"".equals(req.getNIBMMTOO())) message.setNIBMMTOO(req.getNIBMMTOO());
                if(req.getNIBMMTOD() != null && !"".equals(req.getNIBMMTOD())) message.setNIBMMTOD(req.getNIBMMTOD());
                if(req.getNIBMMTOC() != null && !"".equals(req.getNIBMMTOC())) message.setNIBMMTOC(req.getNIBMMTOC());
                if(req.getNIBMTBCV() != null && !"".equals(req.getNIBMTBCV())) message.setNIBMTBCV(req.getNIBMTBCV());
                if(req.getNIBMTCLI() != null && !"".equals(req.getNIBMTCLI())) message.setNIBMTCLI(req.getNIBMTCLI());                                
                if(req.getNIBMREFE() != null && !"".equals(req.getNIBMREFE())) message.setNIBMREFE(req.getNIBMREFE());
                if(req.getNIBMCDRE() != null && !"".equals(req.getNIBMCDRE())) message.setNIBMCDRE(req.getNIBMCDRE());
                if(req.getNIBMINTE() != null && !"".equals(req.getNIBMINTE())) message.setNIBMINTE(req.getNIBMINTE());
                if(req.getNIBMFIIN() != null && !"".equals(req.getNIBMFIIN())) message.setNIBMFIIN(req.getNIBMFIIN());
                if(req.getNIBMFVAL() != null && !"".equals(req.getNIBMFVAL())) message.setNIBMFVAL(req.getNIBMFVAL());
                if(req.getNIBMFPRO() != null && !"".equals(req.getNIBMFPRO())) message.setNIBMFPRO(req.getNIBMFPRO());
                if(req.getNIBMHPRO() != null && !"".equals(req.getNIBMHPRO())) message.setNIBMHPRO(req.getNIBMHPRO());
                if(req.getNIBMFENB() != null && !"".equals(req.getNIBMFENB())) message.setNIBMFENB(req.getNIBMFENB());
                if(req.getNIBMSTAU() != null && !"".equals(req.getNIBMSTAU())) message.setNIBMSTAU(req.getNIBMSTAU());
                if(req.getNIBMORIF() != null && !"".equals(req.getNIBMORIF())) message.setNIBMORIF(req.getNIBMORIF());
                if(req.getNIBMDESF() != null && !"".equals(req.getNIBMDESF())) message.setNIBMDESF(req.getNIBMDESF());


                message.send();
                message.destroy();
                MessageRecord newmessage = mc.receiveMessage();
                if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("0"))) {
                    manejarError(res, ((ELEERRMessage) newmessage));
                    log.error("NIBMENU01 - MENUDEO " + " Error: "+ res.getError().getERNU01() + " - " + res.getError().getERDS01() + " - Canal " + req.getCanal());
                    return res;
                } else {
                    if (newmessage.getFormatName().equals("NIBMENU01")) {
                        NIBMENU01Message msg = (NIBMENU01Message) newmessage;
                        NIBMENU01Bean bean = new NIBMENU01Bean();
                        res.setNIBMENU01(bean);
                        bean.setNIBMTIPO(msg.getNIBMTIPO());
                        bean.setNIBMPROC(msg.getNIBMPROC());
                        bean.setNIBMDOTR(msg.getNIBMDOTR());
                        bean.setNIBMDDTR(msg.getNIBMDDTR());
                        bean.setNIBMNACI(msg.getNIBMNACI());
                        bean.setNIBMCEDU(msg.getNIBMCEDU());
                        bean.setNIBMCTAO(msg.getNIBMCTAO());
                        bean.setNIBMCTAD(msg.getNIBMCTAD());
                        bean.setNIBMCTAC(msg.getNIBMCTAC());
                        bean.setNIBMMTOO(msg.getNIBMMTOO());
                        bean.setNIBMMTOD(msg.getNIBMMTOD());
                        bean.setNIBMMTOC(msg.getNIBMMTOC());
                        bean.setNIBMTBCV(msg.getNIBMTBCV());
                        bean.setNIBMTCLI(msg.getNIBMTCLI());                        
                        bean.setNIBMREFE(msg.getNIBMREFE());
                        bean.setNIBMCDRE(msg.getNIBMCDRE());
                        bean.setNIBMINTE(msg.getNIBMINTE());
                        bean.setNIBMFIIN(msg.getNIBMFIIN());
                        bean.setNIBMFFIN(msg.getNIBMFFIN());
                        bean.setNIBMFVAL(msg.getNIBMFVAL());
                        bean.setNIBMFPRO(msg.getNIBMFPRO());
                        bean.setNIBMFENB(msg.getNIBMFENB());
                        bean.setNIBMSTAU(msg.getNIBMSTAU());
                        bean.setNIBMORIF(msg.getNIBMORIF());
                        bean.setNIBMDESF(msg.getNIBMDESF());
                        
                    }
                }
            }catch (Exception e) {
                    log.error("NIBMENU01 - MENUDEO  - " + e.getMessage() + " - Canal " + req.getCanal(),e);
                    throw new WSException(e);
            } finally {
                if (s != null)
                try {
                        s.close();
                } catch (IOException e) {
                }
            }
            return res;
	}
            /**
	 * Servicio para crear cuenta cash ME.
	 * @param req
	 * @return
	 * @throws WSException
	 */
        public APEDSCASHEResponse APEDSCASHE(APEDSCASHEBean req) throws WSException{
            
            log.info("Invocando APEDSCASHE");
            Socket s = null;
            APEDSCASHEResponse res = new APEDSCASHEResponse();
            
            try {
                Parametros params = new Parametros();
                MessageContext mc;
                s = new Socket(params.getString("ip"), params.getInt("port7"));
                s.setSoTimeout(params.getInt("timeout"));
                mc = new MessageContext(new DataInputStream(new BufferedInputStream(s.getInputStream())), new DataOutputStream(
                                new BufferedOutputStream(s.getOutputStream())), "com.activo.gateway.dibs.messages");
                APEDSCASHEMessage message;
                message = (APEDSCASHEMessage)mc.getMessageRecord("APEDSCASHE");
                if(req.getAPEUSRE() != null && !"".equals(req.getAPEUSRE())) message.setAPEUSRE(req.getAPEUSRE());
                if(req.getAPEACCS() != null && !"".equals(req.getAPEACCS())) message.setAPEACCS(req.getAPEACCS());          
                if(req.getAPERESP() != null && !"".equals(req.getAPERESP())) message.setAPERESP(req.getAPERESP());
                
                message.send();
                message.destroy();
                MessageRecord newmessage = mc.receiveMessage();
                if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("0"))) {
                    manejarError(res, ((ELEERRMessage) newmessage));
                    log.error("APEDSCASHE - Apertura de Cuenta Cash ME " + " Error: "+ res.getError().getERNU01() + " - " + res.getError().getERDS01() + " - Canal " + req.getCanal());
                    return res;
                } else {
                    if (newmessage.getFormatName().equals("APEDSCASHE")) {
                       APEDSCASHEMessage msg = (APEDSCASHEMessage) newmessage;
                        APEDSCASHEBean bean = new APEDSCASHEBean();
                        res.setAPEDSCASHE(bean);
                        bean.setAPEUSRE(msg.getAPEUSRE());
                        bean.setAPEACCS(msg.getAPEACCS());
                        bean.setAPERESP(msg.getAPERESP());

                    }
                }
            }catch (Exception e) {
                    log.error("APEDSCASHE - Apertura de Cuenta Cash ME - " + e.getMessage() + " - Canal " + req.getCanal(),e);
                    throw new WSException(e);
            } finally {
                if (s != null)
                try {
                        s.close();
                } catch (IOException e) {
                }
            }
            return res;
	}
        /**
	 * Servicio para la Tasa.
	 * @param req
	 * @return
	 * @throws WSException
	 */
	public MCBIOSEPFEResponse MCBIOSEPFE(MCBIOSEPFEBean req) throws WSException{
            
            log.info("Invocando MCBIOSEPFE");
            Socket s = null;
            MCBIOSEPFEResponse res = new MCBIOSEPFEResponse();
            
            try {
                Parametros params = new Parametros();
                MessageContext mc;
                s = new Socket(params.getString("ip"), params.getInt("port7"));
                s.setSoTimeout(params.getInt("timeout"));
                mc = new MessageContext(new DataInputStream(new BufferedInputStream(s.getInputStream())), new DataOutputStream(
                 new BufferedOutputStream(s.getOutputStream())), "com.activo.gateway.dibs.messages");
                MCBIOSEPFEMessage message;
                message = (MCBIOSEPFEMessage)mc.getMessageRecord("MCBIOSEPFE");
                if(req.getMC_TIP() != null && !"".equals(req.getMC_TIP())) message.setMC_TIP(req.getMC_TIP());
                if(req.getMC_ID() != null && !"".equals(req.getMC_ID())) message.setMC_ID(req.getMC_ID());			
                if(req.getMC_TASVCHS() != null && !"".equals(req.getMC_TASVCHS())) message.setMC_TASVCHS(req.getMC_TASVCHS());
                if(req.getMC_TASCCHS() != null && !"".equals(req.getMC_TASCCHS())) message.setMC_TASCCHS(req.getMC_TASCCHS());
                if(req.getMC_COMVCHS() != null && !"".equals(req.getMC_COMVCHS())) message.setMC_COMVCHS(req.getMC_COMVCHS());
                if(req.getMC_COMCCHS() != null && !"".equals(req.getMC_COMCCHS())) message.setMC_COMCCHS(req.getMC_COMCCHS());
                if(req.getMC_DISVCHS() != null && !"".equals(req.getMC_DISVCHS())) message.setMC_DISVCHS(req.getMC_DISVCHS());
                if(req.getMC_DISCCHS() != null && !"".equals(req.getMC_DISCCHS())) message.setMC_DISCCHS(req.getMC_DISCCHS());
                if(req.getMC_TASVELE() != null && !"".equals(req.getMC_TASVELE())) message.setMC_TASVELE(req.getMC_TASVELE());
                if(req.getMC_TASCELE() != null && !"".equals(req.getMC_TASCELE())) message.setMC_TASCELE(req.getMC_TASCELE());
                if(req.getMC_COMVELE() != null && !"".equals(req.getMC_COMVELE())) message.setMC_COMVELE(req.getMC_COMVELE());
                if(req.getMC_COMCELE() != null && !"".equals(req.getMC_COMCELE())) message.setMC_COMCELE(req.getMC_COMCELE());
                if(req.getMC_DISVELE() != null && !"".equals(req.getMC_DISVELE())) message.setMC_DISVELE(req.getMC_DISVELE());			
                if(req.getMC_DISCELE() != null && !"".equals(req.getMC_DISCELE())) message.setMC_DISCELE(req.getMC_DISCELE());
                if(req.getMC_TASVEUR() != null && !"".equals(req.getMC_TASVEUR())) message.setMC_TASVEUR(req.getMC_TASVEUR());
                if(req.getMC_TASCEUR() != null && !"".equals(req.getMC_TASCEUR())) message.setMC_TASCEUR(req.getMC_TASCEUR());
                if(req.getMC_COMVEUR() != null && !"".equals(req.getMC_COMVEUR())) message.setMC_COMVEUR(req.getMC_COMVEUR());
                if(req.getMC_COMCEUR() != null && !"".equals(req.getMC_COMCEUR())) message.setMC_COMCEUR(req.getMC_COMCEUR());
                if(req.getMC_DISVEUR() != null && !"".equals(req.getMC_DISVEUR())) message.setMC_DISVEUR(req.getMC_DISVEUR());
                if(req.getMC_DISCEUR() != null && !"".equals(req.getMC_DISCEUR())) message.setMC_DISCEUR(req.getMC_DISCEUR());
                
                message.send();
                message.destroy();
                MessageRecord newmessage = mc.receiveMessage();
                if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("0"))) {
                    manejarError(res, ((ELEERRMessage) newmessage));
                    log.error("MCBIOSEPFE - Tasa " + " Error: "+ res.getError().getERNU01() + " - " + res.getError().getERDS01() + " - Canal " + req.getCanal());
                    return res;
                } else {
                    if (newmessage.getFormatName().equals("MCBIOSEPFE")) {
                        MCBIOSEPFEMessage msg = (MCBIOSEPFEMessage) newmessage;
                        MCBIOSEPFEBean bean = new MCBIOSEPFEBean();
                        res.setMCBIOSEPFE(bean);
                        bean.setMC_TIP(msg.getMC_TIP());
                        bean.setMC_ID(msg.getMC_ID());
                        bean.setMC_TASVCHS(msg.getMC_TASVCHS());
                        bean.setMC_TASCCHS(msg.getMC_TASCCHS());
                        bean.setMC_COMVCHS(msg.getMC_COMVCHS());
                        bean.setMC_COMCCHS(msg.getMC_COMCCHS());
                        bean.setMC_DISVCHS(msg.getMC_DISVCHS());
                        bean.setMC_DISCCHS(msg.getMC_DISCCHS());
                        bean.setMC_TASVELE(msg.getMC_TASVELE());
                        bean.setMC_TASCELE(msg.getMC_TASCELE());
                        bean.setMC_COMVELE(msg.getMC_COMVELE());
                        bean.setMC_COMCELE(msg.getMC_COMCELE());
                        bean.setMC_DISVELE(msg.getMC_DISVELE());
                        bean.setMC_DISCELE(msg.getMC_DISCELE());
                        bean.setMC_TASVEUR(msg.getMC_TASVEUR());
                        bean.setMC_TASCEUR(msg.getMC_TASCEUR());
                        bean.setMC_COMVEUR(msg.getMC_COMVEUR());
                        bean.setMC_COMCEUR(msg.getMC_COMCEUR());
                        bean.setMC_DISVEUR(msg.getMC_DISVEUR());
                        bean.setMC_DISCEUR(msg.getMC_DISCEUR());
                        
                    }
                }
            }catch (Exception e) {
                    log.error("MCBIOSEPFE - Tasa  - " + e.getMessage() + " - Canal " + req.getCanal(),e);
                    throw new WSException(e);
            } finally {
                if (s != null)
                try {
                        s.close();
                } catch (IOException e) {
                }
            }
            return res;
	}
        
             /**
	 * Servicio para  Cobro y Reverso SAREN
	 * @param req
	 * @return
	 * @throws WSException
	 */
        public IN800101Response IN800101(IN800101Bean req) throws WSException{
            
            log.info("Invocando IN800101");
            Socket s = null;
            IN800101Response res = new IN800101Response();
            
            try {
                Parametros params = new Parametros();
                MessageContext mc;
                s = new Socket(params.getString("ip"), params.getInt("port8"));
                s.setSoTimeout(params.getInt("timeout"));
                mc = new MessageContext(new DataInputStream(new BufferedInputStream(s.getInputStream())), new DataOutputStream(
                                new BufferedOutputStream(s.getOutputStream())), "com.activo.gateway.dibs.messages");
                IN800101Message message;

                message = (IN800101Message)mc.getMessageRecord("IN800101");

                if(req.getIN8001ACC() != null && !"".equals(req.getIN8001ACC())) message.setIN8001ACC(req.getIN8001ACC());
                if(req.getIN8001CCY() != null && !"".equals(req.getIN8001CCY())) message.setIN8001CCY(req.getIN8001CCY());          
                if(req.getIN8001PUB() != null && !"".equals(req.getIN8001PUB())) message.setIN8001PUB(req.getIN8001PUB());
                if(req.getIN8001MTO() != null && !"".equals(req.getIN8001MTO())) message.setIN8001MTO(req.getIN8001MTO());
                if(req.getIN8001ACT() != null && !"".equals(req.getIN8001ACT())) message.setIN8001ACT(req.getIN8001ACT());
                if(req.getIN8001NAC() != null && !"".equals(req.getIN8001NAC())) message.setIN8001NAC(req.getIN8001NAC());
                if(req.getIN8001CED() != null && !"".equals(req.getIN8001CED())) message.setIN8001CED(req.getIN8001CED());
                if(req.getIN8001NOM() != null && !"".equals(req.getIN8001NOM())) message.setIN8001NOM(req.getIN8001NOM());
                if(req.getIN8001APE() != null && !"".equals(req.getIN8001APE())) message.setIN8001APE(req.getIN8001APE());
                if(req.getIN8001OFI() != null && !"".equals(req.getIN8001OFI())) message.setIN8001OFI(req.getIN8001OFI());
                if(req.getIN8001FEM() != null && !"".equals(req.getIN8001FEM())) message.setIN8001FEM(req.getIN8001FEM());
                if(req.getIN8001CAN() != null && !"".equals(req.getIN8001CAN())) message.setIN8001CAN(req.getIN8001CAN());
                if(req.getIN8001DIP() != null && !"".equals(req.getIN8001DIP())) message.setIN8001DIP(req.getIN8001DIP());
                if(req.getIN8001USR() != null && !"".equals(req.getIN8001USR())) message.setIN8001USR(req.getIN8001USR());
                if(req.getIN8001IRV() != null && !"".equals(req.getIN8001IRV())) message.setIN8001IRV(req.getIN8001IRV());
                if(req.getIN8001AVA() != null && !"".equals(req.getIN8001AVA())) message.setIN8001AVA(req.getIN8001AVA());
                if(req.getIN8001CES() != null && !"".equals(req.getIN8001CES())) message.setIN8001CES(req.getIN8001CES());
                if(req.getIN8001CKN() != null && !"".equals(req.getIN8001CKN())) message.setIN8001CKN(req.getIN8001CKN());


                if(req.getIN8001ERR() != null && !"".equals(req.getIN8001ERR())) message.setIN8001ERR(req.getIN8001ERR());

                if(req.getIN8001MSE() != null && !"".equals(req.getIN8001MSE())) message.setIN8001MSE(req.getIN8001MSE());

                message.send();
                message.destroy();
                MessageRecord newmessage = mc.receiveMessage();
                if ((newmessage.getFormatName().equals("ELEERR")) && (!((ELEERRMessage) newmessage).getERRNUM().equals("0"))) {
                    manejarError(res, ((ELEERRMessage) newmessage));
                    log.error("IN800101 - Cobro Reverso SAREN " + " Error: "+ res.getError().getERNU01() + " - " + res.getError().getERDS01() + " - Canal " + req.getCanal());
                    return res;
                } else {
                    if (newmessage.getFormatName().equals("IN800101")) {
                       IN800101Message msg = (IN800101Message) newmessage;
                        IN800101Bean bean = new IN800101Bean();
                        log.error("IN800101 - Cobro y Reverso SAREN " + res);
                        bean.setIN8001ACC(msg.getIN8001ACC());
                        bean.setIN8001CCY(msg.getIN8001CCY());
                        bean.setIN8001PUB(msg.getIN8001PUB());
                        bean.setIN8001MTO(msg.getIN8001MTO());
                        bean.setIN8001ACT(msg.getIN8001ACT());
                        bean.setIN8001NAC(msg.getIN8001NAC());
                        bean.setIN8001CED(msg.getIN8001CED());
                        bean.setIN8001NOM(msg.getIN8001NOM());
                        bean.setIN8001APE(msg.getIN8001APE());
                        bean.setIN8001OFI(msg.getIN8001OFI());
                        bean.setIN8001FEM(msg.getIN8001FEM());
                        bean.setIN8001CAN(msg.getIN8001CAN());
                        bean.setIN8001DIP(msg.getIN8001DIP());
                        bean.setIN8001USR(msg.getIN8001USR());
                        bean.setIN8001IRV(msg.getIN8001IRV());
                        bean.setIN8001AVA(msg.getIN8001AVA());
                        bean.setIN8001CES(msg.getIN8001CES());
                        bean.setIN8001CKN(msg.getIN8001CKN());

                        bean.setIN8001ERR(msg.getIN8001ERR());
                        bean.setIN8001MSE(msg.getIN8001MSE());
                        res.setIN800101(bean);
                      
                    }
                }
            }catch (Exception e) {
                    log.error("IN800101 - Cobro y reverso SAREN  - " + e.getMessage() + " - Canal " + req.getCanal(),e);
                    throw new WSException(e);
            } finally {
                if (s != null)
                try {
                        s.close();
                } catch (IOException e) {
                }
            }
            return res;
	}
}