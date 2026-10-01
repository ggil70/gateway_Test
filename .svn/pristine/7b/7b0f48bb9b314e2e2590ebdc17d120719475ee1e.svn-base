package com.activo.gateway.dibs.messages;


import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;

public class NIBPF3010Message extends MessageRecord {
	final int FIELDCOUNT = 43;
	private CharacterField fieldNACIONALIDAD = null;
	private CharacterField fieldNROIDENTIFICACION = null;
	private CharacterField fieldIDENTIFICACIONIBS = null;
	private CharacterField fieldPRIMERNOMBRE = null;
	private CharacterField fieldSEGUNDONOMBRE = null;
	private CharacterField fieldPRIMERAPELLIDO = null;
	private CharacterField fieldSEGUNDOAPELLIDO = null;
	private CharacterField fieldTIPOID = null;
	private CharacterField fieldRIF = null;
	private CharacterField fieldDIRECCION01 = null;
	private CharacterField fieldDIRECCION02 = null;
	private CharacterField fieldDIRECCION03 = null;
	private CharacterField fieldDIRECCION04 = null;
	private CharacterField fieldESTADO = null;
	private CharacterField fieldZONAPOSTAL = null;
	private CharacterField fieldPAIS = null;
	private CharacterField fieldSEXO = null;
	private CharacterField fieldESTADOCIVIL = null;
	private CharacterField fieldNIVELESTUDIO = null;
	private CharacterField fieldFECHANAC = null;
	private CharacterField fieldNROCELULAR = null;
	private CharacterField fieldNROOFICINA = null;
	private CharacterField fieldNROHAB = null;
	private CharacterField fieldNROFAX = null;
	private CharacterField fieldTDD = null;
	private CharacterField fieldNROCUENTA = null;
	private CharacterField fieldNROCLIENTE = null;
	private CharacterField fieldNROTDC = null;
	private CharacterField fieldNROPARAM = null;
	private CharacterField fieldSTSCUENTA = null;
	private CharacterField fieldDESCSTSCUENTA = null;
	private CharacterField fieldSTSTDC = null;
	private CharacterField fieldDESCSTSTDC = null;
	private CharacterField fieldSTSTDD = null;
	private CharacterField fieldDESCSTSTDD = null;
	private CharacterField fieldDISPONIBLE1 = null;
	private CharacterField fieldDISPONIBLE2 = null;
	private CharacterField fieldDISPONIBLE3 = null;
	private CharacterField fieldINTLNADB = null;
	private CharacterField fieldINTLIDCL = null;
	private CharacterField fieldINMONEDA = null;
	private CharacterField fieldINTFIL01 = null;
	private CharacterField fieldINTFIL02 = null;
	
	public NIBPF3010Message() {
		createFields();
		initialize();
	}

	@Override
	protected void createFields(){
		this.recordsize = 679;
		this.fileid = "1140410113457";
		this.recordid = "2B193101EA303";
		this.message = new byte[getByteLength()];
		this.formatname = "NIBPF3010";
		this.fieldnames = new String[FIELDCOUNT];
		this.tagnames = new String[FIELDCOUNT];
		this.fields = new MessageField[FIELDCOUNT];
		
		this.fieldnames[0] = "NACIONALIDAD";
		this.tagnames[0] = "NACIONALIDAD";
		this.fields[0] = this.fieldNACIONALIDAD = new CharacterField(this.message, 10, 3, "NACIONALIDAD");
		
		this.fieldnames[1] = "NROIDENTIFICACION";
		this.tagnames[1] = "NROIDENTIFICACION";
		this.fields[1] = this.fieldNROIDENTIFICACION = new CharacterField(this.message, 13, 12, "NROIDENTIFICACION");
		
		this.fieldnames[2] = "IDENTIFICACIONIBS";
		this.tagnames[2] = "IDENTIFICACIONIBS";
		this.fields[2] = this.fieldIDENTIFICACIONIBS = new CharacterField(this.message, 25, 15, "IDENTIFICACIONIBS");
		
		this.fieldnames[3] = "PRIMERNOMBRE";
		this.tagnames[3] = "PRIMERNOMBRE";
		this.fields[3] = this.fieldPRIMERNOMBRE = new CharacterField(this.message, 40, 30, "PRIMERNOMBRE");
		
		this.fieldnames[4] = "SEGUNDONOMBRE";
		this.tagnames[4] = "SEGUNDONOMBRE";
		this.fields[4] = this.fieldSEGUNDONOMBRE = new CharacterField(this.message, 70, 30, "SEGUNDONOMBRE");
		
		this.fieldnames[5] = "PRIMERAPELLIDO";
		this.tagnames[5] = "PRIMERAPELLIDO";
		this.fields[5] = this.fieldPRIMERAPELLIDO = new CharacterField(this.message, 100, 30, "PRIMERAPELLIDO");
		
		this.fieldnames[6] = "SEGUNDOAPELLIDO";
		this.tagnames[6] = "SEGUNDOAPELLIDO";
		this.fields[6] = this.fieldSEGUNDOAPELLIDO = new CharacterField(this.message, 130, 30, "SEGUNDOAPELLIDO");
		
		this.fieldnames[7] = "TIPOID";
		this.tagnames[7] = "TIPOID";
		this.fields[7] = this.fieldTIPOID = new CharacterField(this.message, 160, 4, "TIPOID");
		
		this.fieldnames[8] = "RIF";
		this.tagnames[8] = "RIF";
		this.fields[8] = this.fieldRIF = new CharacterField(this.message, 164, 15, "RIF");
		
		this.fieldnames[9] = "DIRECCION01";
		this.tagnames[9] = "DIRECCION01";
		this.fields[9] = this.fieldDIRECCION01 = new CharacterField(this.message, 179, 35, "DIRECCION01");
		
		this.fieldnames[10] = "DIRECCION02";
		this.tagnames[10] = "DIRECCION02";
		this.fields[10] = this.fieldDIRECCION02 = new CharacterField(this.message, 214, 35, "DIRECCION02");
		
		this.fieldnames[11] = "DIRECCION03";
		this.tagnames[11] = "DIRECCION03";
		this.fields[11] = this.fieldDIRECCION03 = new CharacterField(this.message, 249, 35, "DIRECCION03");
		
		this.fieldnames[12] = "DIRECCION04";
		this.tagnames[12] = "DIRECCION04";
		this.fields[12] = this.fieldDIRECCION04 = new CharacterField(this.message, 284, 30, "DIRECCION04");
		
		this.fieldnames[13] = "ESTADO";
		this.tagnames[13] = "ESTADO";
		this.fields[13] = this.fieldESTADO = new CharacterField(this.message, 314, 4, "ESTADO");
		
		this.fieldnames[14] = "ZONAPOSTAL";
		this.tagnames[14] = "ZONAPOSTAL";
		this.fields[14] = this.fieldZONAPOSTAL = new CharacterField(this.message, 318, 15, "ZONAPOSTAL");
		
		this.fieldnames[15] = "PAIS";
		this.tagnames[15] = "PAIS";
		this.fields[15] = this.fieldPAIS = new CharacterField(this.message, 333, 20, "PAIS");
		
		this.fieldnames[16] = "SEXO";
		this.tagnames[16] = "SEXO";
		this.fields[16] = this.fieldSEXO = new CharacterField(this.message, 353, 1, "SEXO");
		
		this.fieldnames[17] = "ESTADOCIVIL";
		this.tagnames[17] = "ESTADOCIVIL";
		this.fields[17] = this.fieldESTADOCIVIL = new CharacterField(this.message, 354, 1, "ESTADOCIVIL");
		
		this.fieldnames[18] = "NIVELESTUDIO";
		this.tagnames[18] = "NIVELESTUDIO";
		this.fields[18] = this.fieldNIVELESTUDIO = new CharacterField(this.message, 355, 1, "NIVELESTUDIO");
		
		this.fieldnames[19] = "FECHANAC";
		this.tagnames[19] = "FECHANAC";
		this.fields[19] = this.fieldFECHANAC = new CharacterField(this.message, 356, 8, "FECHANAC");
		
		this.fieldnames[20] = "NROCELULAR";
		this.tagnames[20] = "NROCELULAR";
		this.fields[20] = this.fieldNROCELULAR = new CharacterField(this.message, 364, 11, "NROCELULAR");
		
		this.fieldnames[21] = "NROOFICINA";
		this.tagnames[21] = "NROOFICINA";
		this.fields[21] = this.fieldNROOFICINA = new CharacterField(this.message, 375, 11, "NROOFICINA");
		
		this.fieldnames[22] = "NROHAB";
		this.tagnames[22] = "NROHAB";
		this.fields[22] = this.fieldNROHAB = new CharacterField(this.message, 386, 11, "NROHAB");
		
		this.fieldnames[23] = "NROFAX";
		this.tagnames[23] = "NROFAX";
		this.fields[23] = this.fieldNROFAX = new CharacterField(this.message, 397, 11, "NROFAX");
		
		this.fieldnames[24] = "TDD";
		this.tagnames[24] = "TDD";
		this.fields[24] = this.fieldTDD = new CharacterField(this.message, 408, 20, "TDD");
		
		this.fieldnames[25] = "NROCUENTA";
		this.tagnames[25] = "NROCUENTA";
		this.fields[25] = this.fieldNROCUENTA = new CharacterField(this.message, 428, 12, "NROCUENTA");
		
		this.fieldnames[26] = "NROCLIENTE";
		this.tagnames[26] = "NROCLIENTE";
		this.fields[26] = this.fieldNROCLIENTE = new CharacterField(this.message, 440, 9, "NROCLIENTE");
		
		this.fieldnames[27] = "NROTDC";
		this.tagnames[27] = "NROTDC";
		this.fields[27] = this.fieldNROTDC = new CharacterField(this.message, 449, 16, "NROTDC");
		
		this.fieldnames[28] = "NROPARAM";
		this.tagnames[28] = "NROPARAM";
		this.fields[28] = this.fieldNROPARAM = new CharacterField(this.message, 465, 1, "NROPARAM");
		
		this.fieldnames[29] = "STSCUENTA";
		this.tagnames[29] = "STSCUENTA";
		this.fields[29] = this.fieldSTSCUENTA = new CharacterField(this.message, 466, 1, "STSCUENTA");
		
		this.fieldnames[30] = "DESCSTSCUENTA";
		this.tagnames[30] = "DESCSTSCUENTA";
		this.fields[30] = this.fieldDESCSTSCUENTA = new CharacterField(this.message, 467, 20, "DESCSTSCUENTA");
		
		this.fieldnames[31] = "STSTDC";
		this.tagnames[31] = "STSTDC";
		this.fields[31] = this.fieldSTSTDC = new CharacterField(this.message, 487, 2, "STSTDC");
		
		this.fieldnames[32] = "DESCSTSTDC";
		this.tagnames[32] = "DESCSTSTDC";
		this.fields[32] = this.fieldDESCSTSTDC = new CharacterField(this.message, 489, 20, "DESCSTSTDC");
		
		this.fieldnames[33] = "STSTDD";
		this.tagnames[33] = "STSTDD";
		this.fields[33] = this.fieldSTSTDD = new CharacterField(this.message, 509, 1, "STSTDD");
		
		this.fieldnames[34] = "DESCSTSTDD";
		this.tagnames[34] = "DESCSTSTDD";
		this.fields[34] = this.fieldDESCSTSTDD = new CharacterField(this.message, 510, 20, "DESCSTSTDD");
		
		this.fieldnames[35] = "DISPONIBLE1";
		this.tagnames[35] = "DISPONIBLE1";
		this.fields[35] = this.fieldDISPONIBLE1 = new CharacterField(this.message, 530, 10, "DISPONIBLE1");
		
		this.fieldnames[36] = "DISPONIBLE2";
		this.tagnames[36] = "DISPONIBLE2";
		this.fields[36] = this.fieldDISPONIBLE2 = new CharacterField(this.message, 540, 20, "DISPONIBLE2");
		
		this.fieldnames[37] = "DISPONIBLE3";
		this.tagnames[37] = "DISPONIBLE3";
		this.fields[37] = this.fieldDISPONIBLE3 = new CharacterField(this.message, 560, 40, "DISPONIBLE3");
		
		this.fieldnames[38] = "INTLNADB";
		this.tagnames[38] = "INTLNADB";
		this.fields[38] = this.fieldINTLNADB = new CharacterField(this.message, 600, 45, "INTLNADB");
		
		this.fieldnames[39] = "INTLIDCL";
		this.tagnames[39] = "INTLIDCL";
		this.fields[39] = this.fieldINTLIDCL = new CharacterField(this.message, 645, 21, "INTLIDCL");

		this.fieldnames[40] = "INMONEDA";
		this.tagnames[40] = "INMONEDA";
		this.fields[40] = this.fieldINMONEDA = new CharacterField(this.message, 666, 3, "INMONEDA");
		
		this.fieldnames[41] = "INTFIL01";
		this.tagnames[41] = "INTFIL01";
		this.fields[41] = this.fieldINTFIL01  = new CharacterField(this.message, 669, 10, "INTFIL01");

		this.fieldnames[42] = "INTFIL02";
		this.tagnames[42] = "INTFIL02";
		this.fields[42] = this.fieldINTFIL02  = new CharacterField(this.message, 679, 10, "INTFIL02");

	}

	public String getNACIONALIDAD(){
		return fieldNACIONALIDAD.getString();
	}

	public void setNACIONALIDAD(String NACIONALIDAD){
		fieldNACIONALIDAD.setString(NACIONALIDAD);
	}

	public String getNROIDENTIFICACION(){
		return fieldNROIDENTIFICACION.getString();
	}

	public void setNROIDENTIFICACION(String NROIDENTIFICACION){
		fieldNROIDENTIFICACION.setString(NROIDENTIFICACION);
	}

	public String getIDENTIFICACIONIBS(){
		return fieldIDENTIFICACIONIBS.getString();
	}

	public void setIDENTIFICACIONIBS(String IDENTIFICACIONIBS){
		fieldIDENTIFICACIONIBS.setString(IDENTIFICACIONIBS);
	}

	public String getPRIMERNOMBRE(){
		return fieldPRIMERNOMBRE.getString();
	}

	public void setPRIMERNOMBRE(String PRIMERNOMBRE){
		fieldPRIMERNOMBRE.setString(PRIMERNOMBRE);
	}

	public String getSEGUNDONOMBRE(){
		return fieldSEGUNDONOMBRE.getString();
	}

	public void setSEGUNDONOMBRE(String SEGUNDONOMBRE){
		fieldSEGUNDONOMBRE.setString(SEGUNDONOMBRE);
	}

	public String getPRIMERAPELLIDO(){
		return fieldPRIMERAPELLIDO.getString();
	}

	public void setPRIMERAPELLIDO(String PRIMERAPELLIDO){
		fieldPRIMERAPELLIDO.setString(PRIMERAPELLIDO);
	}

	public String getSEGUNDOAPELLIDO(){
		return fieldSEGUNDOAPELLIDO.getString();
	}

	public void setSEGUNDOAPELLIDO(String SEGUNDOAPELLIDO){
		fieldSEGUNDOAPELLIDO.setString(SEGUNDOAPELLIDO);
	}

	public String getTIPOID(){
		return fieldTIPOID.getString();
	}

	public void setTIPOID(String TIPOID){
		fieldTIPOID.setString(TIPOID);
	}

	public String getRIF(){
		return fieldRIF.getString();
	}

	public void setRIF(String RIF){
		fieldRIF.setString(RIF);
	}

	public String getDIRECCION01(){
		return fieldDIRECCION01.getString();
	}

	public void setDIRECCION01(String DIRECCION01){
		fieldDIRECCION01.setString(DIRECCION01);
	}

	public String getDIRECCION02(){
		return fieldDIRECCION02.getString();
	}

	public void setDIRECCION02(String DIRECCION02){
		fieldDIRECCION02.setString(DIRECCION02);
	}

	public String getDIRECCION03(){
		return fieldDIRECCION03.getString();
	}

	public void setDIRECCION03(String DIRECCION03){
		fieldDIRECCION03.setString(DIRECCION03);
	}

	public String getDIRECCION04(){
		return fieldDIRECCION04.getString();
	}

	public void setDIRECCION04(String DIRECCION04){
		fieldDIRECCION04.setString(DIRECCION04);
	}

	public String getESTADO(){
		return fieldESTADO.getString();
	}

	public void setESTADO(String ESTADO){
		fieldESTADO.setString(ESTADO);
	}

	public String getZONAPOSTAL(){
		return fieldZONAPOSTAL.getString();
	}

	public void setZONAPOSTAL(String ZONAPOSTAL){
		fieldZONAPOSTAL.setString(ZONAPOSTAL);
	}

	public String getPAIS(){
		return fieldPAIS.getString();
	}

	public void setPAIS(String PAIS){
		fieldPAIS.setString(PAIS);
	}

	public String getSEXO(){
		return fieldSEXO.getString();
	}

	public void setSEXO(String SEXO){
		fieldSEXO.setString(SEXO);
	}

	public String getESTADOCIVIL(){
		return fieldESTADOCIVIL.getString();
	}

	public void setESTADOCIVIL(String ESTADOCIVIL){
		fieldESTADOCIVIL.setString(ESTADOCIVIL);
	}

	public String getNIVELESTUDIO(){
		return fieldNIVELESTUDIO.getString();
	}

	public void setNIVELESTUDIO(String NIVELESTUDIO){
		fieldNIVELESTUDIO.setString(NIVELESTUDIO);
	}

	public String getFECHANAC(){
		return fieldFECHANAC.getString();
	}

	public void setFECHANAC(String FECHANAC){
		fieldFECHANAC.setString(FECHANAC);
	}

	public String getNROCELULAR(){
		return fieldNROCELULAR.getString();
	}

	public void setNROCELULAR(String NROCELULAR){
		fieldNROCELULAR.setString(NROCELULAR);
	}

	public String getNROOFICINA(){
		return fieldNROOFICINA.getString();
	}

	public void setNROOFICINA(String NROOFICINA){
		fieldNROOFICINA.setString(NROOFICINA);
	}

	public String getNROHAB(){
		return fieldNROHAB.getString();
	}

	public void setNROHAB(String NROHAB){
		fieldNROHAB.setString(NROHAB);
	}

	public String getNROFAX(){
		return fieldNROFAX.getString();
	}

	public void setNROFAX(String NROFAX){
		fieldNROFAX.setString(NROFAX);
	}

	public String getTDD(){
		return fieldTDD.getString();
	}

	public void setTDD(String TDD){
		fieldTDD.setString(TDD);
	}

	public String getNROCUENTA(){
		return fieldNROCUENTA.getString();
	}

	public void setNROCUENTA(String NROCUENTA){
		fieldNROCUENTA.setString(NROCUENTA);
	}

	public String getNROCLIENTE(){
		return fieldNROCLIENTE.getString();
	}

	public void setNROCLIENTE(String NROCLIENTE){
		fieldNROCLIENTE.setString(NROCLIENTE);
	}

	public String getNROTDC(){
		return fieldNROTDC.getString();
	}

	public void setNROTDC(String NROTDC){
		fieldNROTDC.setString(NROTDC);
	}

	public String getNROPARAM(){
		return fieldNROPARAM.getString();
	}

	public void setNROPARAM(String NROPARAM){
		fieldNROPARAM.setString(NROPARAM);
	}
	
	public String getSTSCUENTA(){
		return fieldSTSCUENTA.getString();
	}

	public void setSTSCUENTA(String STSCUENTA){
		fieldSTSCUENTA.setString(STSCUENTA);
	}

	public String getDESCSTSCUENTA(){
		return fieldDESCSTSCUENTA.getString();
	}

	public void setDESCSTSCUENTA(String DESCSTSCUENTA){
		fieldDESCSTSCUENTA.setString(DESCSTSCUENTA);
	}

	public String getSTSTDC(){
		return fieldSTSTDC.getString();
	}

	public void setSTSTDC(String STSTDC){
		fieldSTSTDC.setString(STSTDC);
	}

	public String getDESCSTSTDC(){
		return fieldDESCSTSTDC.getString();
	}

	public void setDESCSTSTDC(String DESCSTSTDC){
		fieldDESCSTSTDC.setString(DESCSTSTDC);
	}

	public String getSTSTDD(){
		return fieldSTSTDD.getString();
	}

	public void setSTSTDD(String STSTDD){
		fieldSTSTDD.setString(STSTDD);
	}

	public String getDESCSTSTDD(){
		return fieldDESCSTSTDD.getString();
	}

	public void setDESCSTSTDD(String DESCSTSTDD){
		fieldDESCSTSTDD.setString(DESCSTSTDD);
	}

	public String getDISPONIBLE1(){
		return fieldDISPONIBLE1.getString();
	}

	public void setDISPONIBLE1(String DISPONIBLE1){
		fieldDISPONIBLE1.setString(DISPONIBLE1);
	}

	public String getDISPONIBLE2(){
		return fieldDISPONIBLE2.getString();
	}

	public void setDISPONIBLE2(String DISPONIBLE2){
		fieldDISPONIBLE2.setString(DISPONIBLE2);
	}

	public String getDISPONIBLE3(){
		return fieldDISPONIBLE3.getString();
	}

	public void setDISPONIBLE3(String DISPONIBLE3){
		fieldDISPONIBLE3.setString(DISPONIBLE3);
	}
	
	public String getINTLNADB(){
		return fieldINTLNADB.getString();
	}

	public void setINTLNADB(String INTLNADB){
		fieldINTLNADB.setString(INTLNADB);
	}
	
	public String getINTLIDCL(){
		return fieldINTLIDCL.getString();
	}

	public void setINTLIDCL(String INTLIDCL){
		fieldINTLIDCL.setString(INTLIDCL);
	}
	
	public String getINMONEDA(){
		return fieldINMONEDA.getString();
	}

	public void setINMONEDA(String MONEDA){
		fieldINMONEDA.setString(MONEDA);
	}

	public String getINTFIL01(){
		return fieldINTFIL01.getString();
	}

	public void setINTFIL01(String iNTFIL01){
		fieldINTFIL01.setString(iNTFIL01);
	}

	public String getINTFIL02(){
		return fieldINTFIL02.getString();
	}

	public void setINTFIL02(String iNTFIL02){
		fieldINTFIL02.setString(iNTFIL02);
	}
}