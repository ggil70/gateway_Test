package com.activo.gateway.util;

import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.apache.log4j.Logger;


public class EmailSender {

	private static final Logger log = Logger.getLogger(EmailSender.class);
	
	
	/**
	 * Método para el envio de correos electrónicos
	 */
	public boolean sendMail(String to, String subject, String mensaje, String footer){
		try
		{
			//Acceso a los parametros de conexion
			Parametros p = new Parametros();

			// Propiedades de la conexión
			Properties props = new Properties();
			props.put("mail.smtp.host", p.getString("host"));
			props.put("mail.smtp.port", p.getString("port"));
			props.put("mail.smtp.user", p.getString("username"));

			
			// Preparamos la sesion
			Session session = Session.getDefaultInstance(props);

			// Construimos el mensaje
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(p.getString("email.from")));
			message.addRecipients(Message.RecipientType.TO, to);
			message.setSubject(subject);
			message.setSentDate(new Date());
			message.setText("<div style = font-family:Arial, Helvetica, sans-serif; font-size:11px;>" + mensaje + "</div><br/><div >"+footer+"</div>", "ISO-8859-1", "html");

			//enviamos el mensaje
			Transport.send(message);
		}
		catch (Exception e){
			log.error("Error en el envio de correo - " + e.getMessage());
			return false;
		}
		return true;
	}

}
