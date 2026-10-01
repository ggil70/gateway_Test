/*     */ package com.activo.gateway.dibs.messages;
/*     */ 
/*     */ import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;

import java.math.BigDecimal;
/*     */ 
/*     */ public class INPMIDSJVMessage extends MessageRecord
/*     */ {
/*  19 */   final int FIELDCOUNT = 20;
/*  20 */   private CharacterField fieldDSJINPUSR = null;
/*  21 */   private DecimalField fieldDSJINPACC = null;
/*  22 */   private CharacterField fieldDSJINPNM1 = null;
/*  23 */   private DecimalField fieldDSJINPVNO = null;
/*  24 */   private CharacterField fieldDSJINPPMT = null;
/*  25 */   private DecimalField fieldDSJINPIAM = null;
/*  26 */   private CharacterField fieldDSJINPCCY = null;
/*  27 */   private DecimalField fieldDSJINPPDM = null;
/*  28 */   private DecimalField fieldDSJINPPDD = null;
/*  29 */   private DecimalField fieldDSJINPPDY = null;
/*  30 */   private CharacterField fieldDSJINPPFR = null;
/*  31 */   private DecimalField fieldDSJINPTOT = null;
/*  32 */   private CharacterField fieldDSJINPREF = null;
/*  33 */   private CharacterField fieldDSJINPRMK = null;
/*  34 */   private CharacterField fieldDSJINPOPT = null;
/*  35 */   private CharacterField fieldDSJINPFIN = null;
/*  36 */   private DecimalField fieldDSJINPSQN = null;
/*  37 */   private DecimalField fieldDSJINPRCM = null;
/*  38 */   private DecimalField fieldDSJINPRCD = null;
/*  39 */   private DecimalField fieldDSJINPRCY = null;
/*     */ 
/*     */   public INPMIDSJVMessage()
/*     */   {
/*  46 */     createFields();
/*  47 */     initialize();
/*     */   }
/*     */ 
/*     */   protected void createFields()
/*     */   {
/*  55 */     this.recordsize = 194;
/*  56 */     this.fileid = "1001004210232";
/*  57 */     this.recordid = "4E0EFFBA023DF";
/*  58 */     this.message = new byte[getByteLength()];
/*  59 */     this.formatname = "INPMIDSJV";
/*  60 */     this.fieldnames = new String[20];
/*  61 */     this.tagnames = new String[20];
/*  62 */     this.fields = new MessageField[20];
/*     */ 
/*  64 */     this.fieldnames[0] = "DSJINPUSR";
/*  65 */     this.tagnames[0] = "DSJINPUSR";
/*     */      this.fields[0]=this.fieldDSJINPUSR=new CharacterField(this.message, 10, 10, "DSJINPUSR");
/*     */ 
/*  68 */     this.fieldnames[1] = "DSJINPACC";
/*  69 */     this.tagnames[1] = "DSJINPACC";
/*     */      this.fields[1]=this.fieldDSJINPACC=new DecimalField(this.message, 20, 13, 0, "DSJINPACC");
/*     */ 
/*  72 */     this.fieldnames[2] = "DSJINPNM1";
/*  73 */     this.tagnames[2] = "DSJINPNM1";
/*     */      this.fields[2]=this.fieldDSJINPNM1=new CharacterField(this.message, 33, 35, "DSJINPNM1");
/*     */ 
/*  76 */     this.fieldnames[3] = "DSJINPVNO";
/*  77 */     this.tagnames[3] = "DSJINPVNO";
/*     */      this.fields[3]=this.fieldDSJINPVNO=new DecimalField(this.message, 68, 10, 0, "DSJINPVNO");
/*     */ 
/*  80 */     this.fieldnames[4] = "DSJINPPMT";
/*  81 */     this.tagnames[4] = "DSJINPPMT";
/*     */      this.fields[4]=this.fieldDSJINPPMT=new CharacterField(this.message, 78, 1, "DSJINPPMT");
/*     */ 
/*  84 */     this.fieldnames[5] = "DSJINPIAM";
/*  85 */     this.tagnames[5] = "DSJINPIAM";
/*     */      this.fields[5]=this.fieldDSJINPIAM=new DecimalField(this.message, 79, 17, 2, "DSJINPIAM");
/*     */ 
/*  88 */     this.fieldnames[6] = "DSJINPCCY";
/*  89 */     this.tagnames[6] = "DSJINPCCY";
/*     */      this.fields[6]=this.fieldDSJINPCCY=new CharacterField(this.message, 96, 3, "DSJINPCCY");
/*     */ 
/*  92 */     this.fieldnames[7] = "DSJINPPDM";
/*  93 */     this.tagnames[7] = "DSJINPPDM";
/*     */      this.fields[7]=this.fieldDSJINPPDM=new DecimalField(this.message, 99, 3, 0, "DSJINPPDM");
/*     */ 
/*  96 */     this.fieldnames[8] = "DSJINPPDD";
/*  97 */     this.tagnames[8] = "DSJINPPDD";
/*     */      this.fields[8]=this.fieldDSJINPPDD=new DecimalField(this.message, 102, 3, 0, "DSJINPPDD");
/*     */ 
/* 100 */     this.fieldnames[9] = "DSJINPPDY";
/* 101 */     this.tagnames[9] = "DSJINPPDY";
/*     */      this.fields[9]=this.fieldDSJINPPDY=new DecimalField(this.message, 105, 3, 0, "DSJINPPDY");
/*     */ 
/* 104 */     this.fieldnames[10] = "DSJINPPFR";
/* 105 */     this.tagnames[10] = "DSJINPPFR";
/*     */      this.fields[10]=this.fieldDSJINPPFR=new CharacterField(this.message, 108, 1, "DSJINPPFR");
/*     */ 
/* 108 */     this.fieldnames[11] = "DSJINPTOT";
/* 109 */     this.tagnames[11] = "DSJINPTOT";
/*     */      this.fields[11]=this.fieldDSJINPTOT=new DecimalField(this.message, 109, 4, 0, "DSJINPTOT");
/*     */ 
/* 112 */     this.fieldnames[12] = "DSJINPREF";
/* 113 */     this.tagnames[12] = "DSJINPREF";
/*     */      this.fields[12]=this.fieldDSJINPREF=new CharacterField(this.message, 113, 30, "DSJINPREF");
/*     */ 
/* 116 */     this.fieldnames[13] = "DSJINPRMK";
/* 117 */     this.tagnames[13] = "DSJINPRMK";
/*     */      this.fields[13]=this.fieldDSJINPRMK=new CharacterField(this.message, 143, 40, "DSJINPRMK");
/*     */ 
/* 120 */     this.fieldnames[14] = "DSJINPOPT";
/* 121 */     this.tagnames[14] = "DSJINPOPT";
/*     */      this.fields[14]=this.fieldDSJINPOPT=new CharacterField(this.message, 183, 1, "DSJINPOPT");
/*     */ 
/* 124 */     this.fieldnames[15] = "DSJINPFIN";
/* 125 */     this.tagnames[15] = "DSJINPFIN";
/*     */      this.fields[15]=this.fieldDSJINPFIN=new CharacterField(this.message, 184, 1, "DSJINPFIN");
/*     */ 
/* 128 */     this.fieldnames[16] = "DSJINPSQN";
/* 129 */     this.tagnames[16] = "DSJINPSQN";
/*     */      this.fields[16]=this.fieldDSJINPSQN=new DecimalField(this.message, 185, 10, 0, "DSJINPSQN");
/*     */ 
/* 132 */     this.fieldnames[17] = "DSJINPRCM";
/* 133 */     this.tagnames[17] = "DSJINPRCM";
/*     */      this.fields[17]=this.fieldDSJINPRCM=new DecimalField(this.message, 195, 3, 0, "DSJINPRCM");
/*     */ 
/* 136 */     this.fieldnames[18] = "DSJINPRCD";
/* 137 */     this.tagnames[18] = "DSJINPRCD";
/*     */      this.fields[18]=this.fieldDSJINPRCD=new DecimalField(this.message, 198, 3, 0, "DSJINPRCD");
/*     */ 
/* 140 */     this.fieldnames[19] = "DSJINPRCY";
/* 141 */     this.tagnames[19] = "DSJINPRCY";
/*     */      this.fields[19]=this.fieldDSJINPRCY=new DecimalField(this.message, 201, 3, 0, "DSJINPRCY");
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalDSJINPACC()
/*     */   {
/* 150 */     return this.fieldDSJINPACC.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalDSJINPIAM()
/*     */   {
/* 157 */     return this.fieldDSJINPIAM.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalDSJINPPDD()
/*     */   {
/* 164 */     return this.fieldDSJINPPDD.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalDSJINPPDM()
/*     */   {
/* 171 */     return this.fieldDSJINPPDM.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalDSJINPPDY()
/*     */   {
/* 178 */     return this.fieldDSJINPPDY.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalDSJINPRCD()
/*     */   {
/* 185 */     return this.fieldDSJINPRCD.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalDSJINPRCM()
/*     */   {
/* 192 */     return this.fieldDSJINPRCM.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalDSJINPRCY()
/*     */   {
/* 199 */     return this.fieldDSJINPRCY.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalDSJINPSQN()
/*     */   {
/* 206 */     return this.fieldDSJINPSQN.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalDSJINPTOT()
/*     */   {
/* 213 */     return this.fieldDSJINPTOT.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalDSJINPVNO()
/*     */   {
/* 220 */     return this.fieldDSJINPVNO.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public String getDSJINPACC()
/*     */   {
/* 227 */     return this.fieldDSJINPACC.getString();
/*     */   }
/*     */ 
/*     */   public String getDSJINPCCY()
/*     */   {
/* 234 */     return this.fieldDSJINPCCY.getString();
/*     */   }
/*     */ 
/*     */   public String getDSJINPFIN()
/*     */   {
/* 241 */     return this.fieldDSJINPFIN.getString();
/*     */   }
/*     */ 
/*     */   public String getDSJINPIAM()
/*     */   {
/* 248 */     return this.fieldDSJINPIAM.getString();
/*     */   }
/*     */ 
/*     */   public String getDSJINPNM1()
/*     */   {
/* 255 */     return this.fieldDSJINPNM1.getString();
/*     */   }
/*     */ 
/*     */   public String getDSJINPOPT()
/*     */   {
/* 262 */     return this.fieldDSJINPOPT.getString();
/*     */   }
/*     */ 
/*     */   public String getDSJINPPDD()
/*     */   {
/* 269 */     return this.fieldDSJINPPDD.getString();
/*     */   }
/*     */ 
/*     */   public String getDSJINPPDM()
/*     */   {
/* 276 */     return this.fieldDSJINPPDM.getString();
/*     */   }
/*     */ 
/*     */   public String getDSJINPPDY()
/*     */   {
/* 283 */     return this.fieldDSJINPPDY.getString();
/*     */   }
/*     */ 
/*     */   public String getDSJINPPFR()
/*     */   {
/* 290 */     return this.fieldDSJINPPFR.getString();
/*     */   }
/*     */ 
/*     */   public String getDSJINPPMT()
/*     */   {
/* 297 */     return this.fieldDSJINPPMT.getString();
/*     */   }
/*     */ 
/*     */   public String getDSJINPRCD()
/*     */   {
/* 304 */     return this.fieldDSJINPRCD.getString();
/*     */   }
/*     */ 
/*     */   public String getDSJINPRCM()
/*     */   {
/* 311 */     return this.fieldDSJINPRCM.getString();
/*     */   }
/*     */ 
/*     */   public String getDSJINPRCY()
/*     */   {
/* 318 */     return this.fieldDSJINPRCY.getString();
/*     */   }
/*     */ 
/*     */   public String getDSJINPREF()
/*     */   {
/* 325 */     return this.fieldDSJINPREF.getString();
/*     */   }
/*     */ 
/*     */   public String getDSJINPRMK()
/*     */   {
/* 332 */     return this.fieldDSJINPRMK.getString();
/*     */   }
/*     */ 
/*     */   public String getDSJINPSQN()
/*     */   {
/* 339 */     return this.fieldDSJINPSQN.getString();
/*     */   }
/*     */ 
/*     */   public String getDSJINPTOT()
/*     */   {
/* 346 */     return this.fieldDSJINPTOT.getString();
/*     */   }
/*     */ 
/*     */   public String getDSJINPUSR()
/*     */   {
/* 353 */     return this.fieldDSJINPUSR.getString();
/*     */   }
/*     */ 
/*     */   public String getDSJINPVNO()
/*     */   {
/* 360 */     return this.fieldDSJINPVNO.getString();
/*     */   }
/*     */ 
/*     */   public void setDSJINPACC(String newvalue)
/*     */   {
/* 367 */     this.fieldDSJINPACC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJINPACC(BigDecimal newvalue)
/*     */   {
/* 374 */     this.fieldDSJINPACC.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJINPCCY(String newvalue)
/*     */   {
/* 381 */     this.fieldDSJINPCCY.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJINPFIN(String newvalue)
/*     */   {
/* 388 */     this.fieldDSJINPFIN.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJINPIAM(String newvalue)
/*     */   {
/* 395 */     this.fieldDSJINPIAM.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJINPIAM(BigDecimal newvalue)
/*     */   {
/* 402 */     this.fieldDSJINPIAM.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJINPNM1(String newvalue)
/*     */   {
/* 409 */     this.fieldDSJINPNM1.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJINPOPT(String newvalue)
/*     */   {
/* 416 */     this.fieldDSJINPOPT.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJINPPDD(String newvalue)
/*     */   {
/* 423 */     this.fieldDSJINPPDD.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJINPPDD(BigDecimal newvalue)
/*     */   {
/* 430 */     this.fieldDSJINPPDD.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJINPPDM(String newvalue)
/*     */   {
/* 437 */     this.fieldDSJINPPDM.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJINPPDM(BigDecimal newvalue)
/*     */   {
/* 444 */     this.fieldDSJINPPDM.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJINPPDY(String newvalue)
/*     */   {
/* 451 */     this.fieldDSJINPPDY.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJINPPDY(BigDecimal newvalue)
/*     */   {
/* 458 */     this.fieldDSJINPPDY.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJINPPFR(String newvalue)
/*     */   {
/* 465 */     this.fieldDSJINPPFR.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJINPPMT(String newvalue)
/*     */   {
/* 472 */     this.fieldDSJINPPMT.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJINPRCD(String newvalue)
/*     */   {
/* 479 */     this.fieldDSJINPRCD.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJINPRCD(BigDecimal newvalue)
/*     */   {
/* 486 */     this.fieldDSJINPRCD.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJINPRCM(String newvalue)
/*     */   {
/* 493 */     this.fieldDSJINPRCM.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJINPRCM(BigDecimal newvalue)
/*     */   {
/* 500 */     this.fieldDSJINPRCM.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJINPRCY(String newvalue)
/*     */   {
/* 507 */     this.fieldDSJINPRCY.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJINPRCY(BigDecimal newvalue)
/*     */   {
/* 514 */     this.fieldDSJINPRCY.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJINPREF(String newvalue)
/*     */   {
/* 521 */     this.fieldDSJINPREF.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJINPRMK(String newvalue)
/*     */   {
/* 528 */     this.fieldDSJINPRMK.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJINPSQN(String newvalue)
/*     */   {
/* 535 */     this.fieldDSJINPSQN.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJINPSQN(BigDecimal newvalue)
/*     */   {
/* 542 */     this.fieldDSJINPSQN.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJINPTOT(String newvalue)
/*     */   {
/* 549 */     this.fieldDSJINPTOT.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJINPTOT(BigDecimal newvalue)
/*     */   {
/* 556 */     this.fieldDSJINPTOT.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJINPUSR(String newvalue)
/*     */   {
/* 563 */     this.fieldDSJINPUSR.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJINPVNO(String newvalue)
/*     */   {
/* 570 */     this.fieldDSJINPVNO.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJINPVNO(BigDecimal newvalue)
/*     */   {
/* 577 */     this.fieldDSJINPVNO.setBigDecimal(newvalue);
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.INPMIDSJVMessage
 * JD-Core Version:    0.6.0
 */