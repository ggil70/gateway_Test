package com.activo.gateway.dibs.messages;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;

public class INVALRIF2Message extends MessageRecord {
	final int FIELDCOUNT = 6;
	
	private CharacterField fieldRSTATUS = null;
	private CharacterField fieldRNRORIF = null;
	private CharacterField fieldRDIGITO = null;
	private CharacterField fieldXUSUARIO = null;
	private CharacterField fieldXNROTARJ = null;
	private CharacterField fieldXNROCTA = null;
	
	public INVALRIF2Message(){
		createFields();
		initialize();		
	}
	
	@Override
	protected void createFields() {
		this.recordsize = 54;
		this.fileid = "1130114131029";
		this.recordid = "43A99C3116BD2";
		this.message = new byte[getByteLength()];
		this.formatname = "INVALRIF2";
		this.fieldnames = new String[6];
		this.tagnames = new String[6];
		this.fields = new MessageField[6];
		
		this.fieldnames[0] = "RSTATUS";
		this.tagnames[0] = "RSTATUS";
		this.fields[0] = this.fieldRSTATUS = new CharacterField(this.message, 10, 1, "RSTATUS");
		
		this.fieldnames[1] = "RNRORIF";
		this.tagnames[1] = "RNRORIF";
		this.fields[1] = this.fieldRNRORIF = new CharacterField(this.message, 11, 8, "RNRORIF");
		
		this.fieldnames[2] = "RDIGITO";
		this.tagnames[2] = "RDIGITO";
		this.fields[2] = this.fieldRDIGITO = new CharacterField(this.message, 19, 1, "RDIGITO");
		
		this.fieldnames[3] = "XUSUARIO";
		this.tagnames[3] = "XUSUARIO";
		this.fields[3] = this.fieldXUSUARIO = new CharacterField(this.message, 19, 10, "DIGITO"); 
		  
		this.fieldnames[4] = "XNROTARJ";
		this.tagnames[4] = "XNROTARJ";
		this.fields[4] = this.fieldXNROTARJ = new CharacterField(this.message, 29, 20, "XNROTARJ"); 
		  
		this.fieldnames[5] = "XNROCTA";
		this.tagnames[5] = "XNROCTA";
		this.fields[5] = this.fieldXNROCTA = new CharacterField(this.message, 49, 12,  "XNROCTA"); 
		
	}	
	public String getRSTATUS() {
		return this.fieldRSTATUS.getString();
	}

	public void setRSTATUS(String fieldRSTATUS) {
		this.fieldRSTATUS.setString(fieldRSTATUS);
	}
	
	public String getRNRORIF() {
		return this.fieldRNRORIF.getString();
	}

	public void setRNRORIF(String fieldRNRORIF) {
		this.fieldRNRORIF.setString(fieldRNRORIF);
	}
	
	public String getRDIGITO() {
		return this.fieldRDIGITO.getString();
	}

	public void setRDIGITO(String fieldRDIGITO) {
		this.fieldRDIGITO.setString(fieldRDIGITO);
	}
	
	public String getXUSUARIO() {
		return this.fieldXUSUARIO.getString();
	}

	public void setXUSUARIO(String fieldXUSUARIO) {
		this.fieldXUSUARIO.setString(fieldXUSUARIO);
	}
	
	public String getXNROTARJ() {
		return this.fieldXNROTARJ.getString();
	}

	public void setXNROTARJ(String fieldXNROTARJ) {
		this.fieldXNROTARJ.setString(fieldXNROTARJ);
	}
	
	public String getXNROCTA() {
		return this.fieldXNROCTA.getString();
	}

	public void setXNROCTA(String fieldXNROCTA) {
		this.fieldXNROCTA.setString(fieldXNROCTA);
	}

}
