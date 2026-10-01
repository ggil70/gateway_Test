package com.activo.gateway.dibs.messages;

import java.math.BigDecimal;
import java.util.Hashtable;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;

public class IN097101Message extends MessageRecord
{
	  final static String fldnames[] = {
          "RSTATUS",
          "RNRORIF",
          "RDIGITO",
          "XUSUARIO",
          "XNROTARJ",
          "XNROCTA"
        };
		final static String tnames[] = {
		        "RSTATUS",
		        "RNRORIF",
		        "RDIGITO",
		        "XUSUARIO",
		        "XNROTARJ",
		        "XNROCTA"
		      };
		final static String fid = "1140526091036";
		final static String rid = "381E9D9BE5DC2";
		final static String fmtname = "IN097101";
		final int FIELDCOUNT = 6;
		private static Hashtable tlookup = new Hashtable();
		private CharacterField fieldRSTATUS = null;
		private CharacterField fieldRNRORIF = null;
		private CharacterField fieldRDIGITO = null;
		private CharacterField fieldXUSUARIO = null;
		private DecimalField fieldXNROTARJ = null;
		private DecimalField fieldXNROCTA = null;
		
		/**
		* Constructor for IN097101Message.
		*/
		public IN097101Message()
		{
		createFields();
		initialize();
		}
		
		/**
		* Create fields for this message.
		* This method implements the abstract method in the MessageRecord superclass.
		*/
		protected void createFields()
		{
		recordsize = 54;
		fileid = fid;
		recordid = rid;
		message = new byte[getByteLength()];
		formatname = fmtname;
		fieldnames = fldnames;
		tagnames = tnames;
		fields = new MessageField[FIELDCOUNT];
		
		fields[0] = fieldRSTATUS =
		new CharacterField(message, HEADERSIZE + 0, 1, "RSTATUS");
		fields[1] = fieldRNRORIF =
		new CharacterField(message, HEADERSIZE + 1, 8, "RNRORIF");
		fields[2] = fieldRDIGITO =
		new CharacterField(message, HEADERSIZE + 9, 1, "RDIGITO");
		fields[3] = fieldXUSUARIO =
		new CharacterField(message, HEADERSIZE + 10, 10, "XUSUARIO");
		fields[4] = fieldXNROTARJ =
		new DecimalField(message, HEADERSIZE + 20, 21, 0, "XNROTARJ");
		fields[5] = fieldXNROCTA =
		new DecimalField(message, HEADERSIZE + 41, 13, 0, "XNROCTA");
		
		synchronized (tlookup)
		{
		if (tlookup.isEmpty())
		{
		for (int i = 0; i < tnames.length; i++)
		tlookup.put(tnames[i], new Integer(i));
		}
		}
		
		taglookup = tlookup;
		}
		
		/**
		* Set field RSTATUS using a String value.
		*/
		public void setRSTATUS(String newvalue)
		{
		fieldRSTATUS.setString(newvalue);
		}
		
		/**
		* Get value of field RSTATUS as a String.
		*/
		public String getRSTATUS()
		{
		return fieldRSTATUS.getString();
		}
		
		/**
		* Set field RNRORIF using a String value.
		*/
		public void setRNRORIF(String newvalue)
		{
		fieldRNRORIF.setString(newvalue);
		}
		
		/**
		* Get value of field RNRORIF as a String.
		*/
		public String getRNRORIF()
		{
		return fieldRNRORIF.getString();
		}
		
		/**
		* Set field RDIGITO using a String value.
		*/
		public void setRDIGITO(String newvalue)
		{
		fieldRDIGITO.setString(newvalue);
		}
		
		/**
		* Get value of field RDIGITO as a String.
		*/
		public String getRDIGITO()
		{
		return fieldRDIGITO.getString();
		}
		
		/**
		* Set field XUSUARIO using a String value.
		*/
		public void setXUSUARIO(String newvalue)
		{
		fieldXUSUARIO.setString(newvalue);
		}
		
		/**
		* Get value of field XUSUARIO as a String.
		*/
		public String getXUSUARIO()
		{
		return fieldXUSUARIO.getString();
		}
		
		/**
		* Set field XNROTARJ using a String value.
		*/
		public void setXNROTARJ(String newvalue)
		{
		fieldXNROTARJ.setString(newvalue);
		}
		
		/**
		* Get value of field XNROTARJ as a String.
		*/
		public String getXNROTARJ()
		{
		return fieldXNROTARJ.getString();
		}
		
		/**
		* Set numeric field XNROTARJ using a BigDecimal value.
		*/
		public void setXNROTARJ(BigDecimal newvalue)
		{
		fieldXNROTARJ.setBigDecimal(newvalue);
		}
		
		/**
		* Return value of numeric field XNROTARJ as a BigDecimal.
		*/
		public BigDecimal getBigDecimalXNROTARJ()
		{
		return fieldXNROTARJ.getBigDecimal();
		}
		
		/**
		* Set field XNROCTA using a String value.
		*/
		public void setXNROCTA(String newvalue)
		{
		fieldXNROCTA.setString(newvalue);
		}
		
		/**
		* Get value of field XNROCTA as a String.
		*/
		public String getXNROCTA()
		{
		return fieldXNROCTA.getString();
		}
		
		/**
		* Set numeric field XNROCTA using a BigDecimal value.
		*/
		public void setXNROCTA(BigDecimal newvalue)
		{
		fieldXNROCTA.setBigDecimal(newvalue);
		}
		
		/**
		* Return value of numeric field XNROCTA as a BigDecimal.
		*/
		public BigDecimal getBigDecimalXNROCTA()
		{
		return fieldXNROCTA.getBigDecimal();
		}

}
