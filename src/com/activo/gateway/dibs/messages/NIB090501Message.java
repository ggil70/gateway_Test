package com.activo.gateway.dibs.messages;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;

public class NIB090501Message extends MessageRecord{

	private CharacterField fieldTUSUARIO = null;
	private CharacterField fieldTNROTARJ = null;
	private CharacterField fieldTNROCTA  = null;
	private CharacterField fieldTCEDRIF  = null;
	private CharacterField fieldTBANCO  = null;
	private CharacterField fieldTDESBANCO  = null;
	
	
	
	
	public NIB090501Message(){
		createFields();
		initialize();		
	}
	
	
	@Override
	protected void createFields() {
		this.recordsize = 93;
		this.fileid = "1130114131027";
		this.recordid = "43A99C3116BD5";
		this.message = new byte[getByteLength()];
		this.formatname = "NIB090501";
		this.fieldnames = new String[6];
		this.tagnames = new String[6];
		this.fields = new MessageField[6];
		
		this.fieldnames[0] = "TUSUARIO";
		this.tagnames[0] = "TUSUARIO";
		this.fields[0] = this.fieldTUSUARIO = new CharacterField(this.message, 10, 10, "TUSUARIO");
		
		this.fieldnames[1] = "TNROTARJ";
		this.tagnames[1] = "TNROTARJ";
		this.fields[1] = this.fieldTNROTARJ = new CharacterField(this.message, 20, 20, "TNROTARJ");
		
		this.fieldnames[2] = "TNROCTA";
		this.tagnames[2] = "TNROCTA";
		this.fields[2] = this.fieldTNROCTA = new CharacterField(this.message, 40, 12, "TNROCTA");
		
		this.fieldnames[3] = "TCEDRIF";
		this.tagnames[3] = "TCEDRIF";
		this.fields[3] = this.fieldTCEDRIF = new CharacterField(this.message, 52, 10, "TCEDRIF");
		
		this.fieldnames[4] = "TBANCO";
		this.tagnames[4] = "TBANCO";
		this.fields[4] = this.fieldTBANCO = new CharacterField(this.message, 62, 10, "TBANCO");
		
		this.fieldnames[5] = "TDESBANCO";
		this.tagnames[5] = "TDESBANCO";
		this.fields[5] = this.fieldTDESBANCO = new CharacterField(this.message, 72, 31, "TDESBANCO");
		
	}

	public String getTUSUARIO() {
		return this.fieldTUSUARIO.getString();
	}

	public void setTUSUARIO(String fieldTUSUARIO) {

		this.fieldTUSUARIO.setString(fieldTUSUARIO);
	}

	public String getTNROTARJ() {
		return this.fieldTNROTARJ.getString();
	}

	public void setTNROTARJ(String fieldTNROTARJ) {

		this.fieldTNROTARJ.setString(fieldTNROTARJ);
	}
	
	public String getTNROCTA() {
		return this.fieldTNROCTA.getString();
	}

	public void setTNROCTA(String fieldTNROCTA) {

		this.fieldTNROCTA.setString(fieldTNROCTA);
	}
	
	public String getTCEDRIF() {
		return this.fieldTCEDRIF.getString();
	}

	public void setTCEDRIF(String fieldTCEDRIF) {

		this.fieldTCEDRIF.setString(fieldTCEDRIF);
	}
	
	public String getTBANCO() {
		return this.fieldTBANCO.getString();
	}

	public void setTBANCO(String fieldTBANCO) {

		this.fieldTBANCO.setString(fieldTBANCO);
	}
	
	public String getTDESBANCO() {
		return this.fieldTDESBANCO.getString();
	}

	public void setTDESBANCO(String fieldTDESBANCO) {

		this.fieldTDESBANCO.setString(fieldTDESBANCO);
	}

}
