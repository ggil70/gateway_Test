package com.activo.gateway.dibs.messages;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;

public class NIBPF3000Message extends MessageRecord {
	final int FIELDCOUNT = 5;
	private CharacterField fieldNACIONALIDAD = null;
	private CharacterField fieldNROIDENTIFICACION = null;
	private CharacterField fieldNROPREGUNTA = null;
	private CharacterField fieldTIPORESPUESTA = null;
	private CharacterField fieldRESPUESTA = null;
	
	public NIBPF3000Message() {
		createFields();
		initialize();
	}

	@Override
	protected void createFields(){
		this.recordsize = 515;
		this.fileid = "1130114131029";
		this.recordid = "43A99C3116BD2";
		this.message = new byte[getByteLength()];
		this.formatname = "NIBPF3000";
		this.fieldnames = new String[5];
		this.tagnames = new String[5];
		this.fields = new MessageField[5];
		
		this.fieldnames[0] = "NACIONALIDAD";
		this.tagnames[0] = "NACIONALIDAD";
		this.fields[0] = this.fieldNACIONALIDAD = new CharacterField(this.message, 10, 3, "NACIONALIDAD");
		
		this.fieldnames[1] = "NROIDENTIFICACION";
		this.tagnames[1] = "NROIDENTIFICACION";
		this.fields[1] = this.fieldNROIDENTIFICACION = new CharacterField(this.message, 13, 12, "NROIDENTIFICACION");
		
		this.fieldnames[2] = "NROPREGUNTA";
		this.tagnames[2] = "NROPREGUNTA";
		this.fields[2] = this.fieldNROPREGUNTA = new CharacterField(this.message, 25, 3, "NROPREGUNTA");
		
		this.fieldnames[3] = "TIPORESPUESTA";
		this.tagnames[3] = "TIPORESPUESTA";
		this.fields[3] = this.fieldTIPORESPUESTA = new CharacterField(this.message, 29, 1, "TIPORESPUESTA");
		
		this.fieldnames[4] = "RESPUESTA";
		this.tagnames[4] = "RESPUESTA";
		this.fields[4] = this.fieldRESPUESTA = new CharacterField(this.message, 31, 479, "RESPUESTA");
	}

	public String getNACIONALIDAD() {
		return fieldNACIONALIDAD.getString();
	}

	public void setNACIONALIDAD(String fieldNACIONALIDAD) {
		this.fieldNACIONALIDAD.setString(fieldNACIONALIDAD);
	}

	public String getNROIDENTIFICACION() {
		return fieldNROIDENTIFICACION.getString();
	}

	public void setNROIDENTIFICACION(String fieldNROIDENTIFICACION) {
		this.fieldNROIDENTIFICACION.setString(fieldNROIDENTIFICACION);
	}

	public String getNROPREGUNTA() {
		return fieldNROPREGUNTA.getString();
	}

	public void setNROPREGUNTA(String fieldNROPREGUNTA) {
		this.fieldNROPREGUNTA.setString(fieldNROPREGUNTA);
	}

	public String getTIPORESPUESTA() {
		return fieldTIPORESPUESTA.getString();
	}

	public void setTIPORESPUESTA(String fieldTIPORESPUESTA) {
		this.fieldTIPORESPUESTA.setString(fieldTIPORESPUESTA);
	}

	public String getRESPUESTA() {
		return fieldRESPUESTA.getString();
	}

	public void setRESPUESTA(String fieldRESPUESTA) {
		this.fieldRESPUESTA.setString(fieldRESPUESTA);
	}

}
