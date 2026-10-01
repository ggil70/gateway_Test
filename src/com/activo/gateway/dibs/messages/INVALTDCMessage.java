package com.activo.gateway.dibs.messages;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;

public class INVALTDCMessage extends MessageRecord{

	final int FIELDCOUNT = 3;
	private CharacterField fieldRUSUARIO = null;
	private CharacterField fieldRNROTARJ = null;
	private CharacterField fieldRNROCTA = null;
	private CharacterField fieldRCEDRIF = null;
	

	public INVALTDCMessage(){

		createFields();
		initialize();

	}

	protected void createFields() {


		this.recordsize = 113;
		this.fileid = "1010723174610";
		this.recordid = "51C52040E1EE4";
		this.message = new byte[getByteLength()];
		this.formatname = "PRUEBAINT";
		this.fieldnames = new String[3];
		this.tagnames = new String[3];
		this.fields = new MessageField[3];

		this.fieldnames[0] = "RUSUARIO";
		this.tagnames[0] = "RUSUARIO";
		this.fields[0]=this.fieldRUSUARIO=new CharacterField(this.message, 10, 1, "RUSUARIO");

		this.fieldnames[1] = "RNROTARJ";
		this.tagnames[1] = "RNROTARJ";
		this.fields[1]=this.fieldRNROTARJ=new CharacterField(this.message, 11, 20, "RNROTARJ");

		this.fieldnames[2] = "RNROCTA";
		this.tagnames[2] = "RNROCTA";
		this.fields[2]=this.fieldRNROCTA=new CharacterField(this.message, 31, 16, "RNROCTA");
		
		this.fieldnames[2] = "RCEDRIF";
		this.tagnames[2] = "RCEDRIF";
		this.fields[2]=this.fieldRCEDRIF=new CharacterField(this.message, 31, 8, "RCEDRIF");

	}
	
	public void setRCEDRIF(String newvalue) {

		this.fieldRCEDRIF.setString(newvalue);

	}

	public String getRCEDRIF(){

		return this.fieldRCEDRIF.getString();

	}

	public void setRUSUARIO(String newvalue) {

		this.fieldRUSUARIO.setString(newvalue);

	}

	public String getRUSUARIO(){

		return this.fieldRUSUARIO.getString();

	}

	
	public void setRNROTARJ(String newvalue) {

		this.fieldRNROTARJ.setString(newvalue);

	}

	public String getRNROTARJ(){

		return this.fieldRNROTARJ.getString();

	}
	
	public void setRNROCTA(String newvalue) {

		this.fieldRNROCTA.setString(newvalue);

	}

	public String getRNROCTA(){

		return this.fieldRNROCTA.getString();

	}

}
