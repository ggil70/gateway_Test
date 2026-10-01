/*     */ package com.activo.gateway.dibs.messages;
/*     */ 
/*     */ import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*     */ 
/*     */ public class ESS0040DSMessage extends MessageRecord
/*     */ {
/*  17 */   final int FIELDCOUNT = 8;
/*  18 */   private CharacterField fieldESSUSR = null;
/*  19 */   private CharacterField fieldESSTYP = null;
/*  20 */   private CharacterField fieldESSSID = null;
/*  21 */   private CharacterField fieldESSIDE = null;
/*  22 */   private CharacterField fieldESSDSC = null;
/*  23 */   private CharacterField fieldESSIMG = null;
/*  24 */   private CharacterField fieldESSTAD = null;
/*  25 */   private CharacterField fieldESSTPO = null;
/*     */ 
/*     */   public ESS0040DSMessage()
/*     */   {
/*  32 */     createFields();
/*  33 */     initialize();
/*     */   }
/*     */ 
/*     */   protected void createFields()
/*     */   {
/*  41 */     this.recordsize = 410;
/*  42 */     this.fileid = "1001020165204";
/*  43 */     this.recordid = "56D29CD29DBFE";
/*  44 */     this.message = new byte[getByteLength()];
/*  45 */     this.formatname = "ESS0040DS";
/*  46 */     this.fieldnames = new String[8];
/*  47 */     this.tagnames = new String[8];
/*  48 */     this.fields = new MessageField[8];
/*     */ 
/*  50 */     this.fieldnames[0] = "ESSUSR";
/*  51 */     this.tagnames[0] = "ESSUSR";
/*     */      this.fields[0]=this.fieldESSUSR=new CharacterField(this.message, 10, 10, "ESSUSR");
/*     */ 
/*  54 */     this.fieldnames[1] = "ESSTYP";
/*  55 */     this.tagnames[1] = "ESSTYP";
/*     */      this.fields[1]=this.fieldESSTYP=new CharacterField(this.message, 20, 1, "ESSTYP");
/*     */ 
/*  58 */     this.fieldnames[2] = "ESSSID";
/*  59 */     this.tagnames[2] = "ESSSID";
/*     */      this.fields[2]=this.fieldESSSID=new CharacterField(this.message, 21, 6, "ESSSID");
/*     */ 
/*  62 */     this.fieldnames[3] = "ESSIDE";
/*  63 */     this.tagnames[3] = "ESSIDE";
/*     */      this.fields[3]=this.fieldESSIDE=new CharacterField(this.message, 27, 3, "ESSIDE");
/*     */ 
/*  66 */     this.fieldnames[4] = "ESSDSC";
/*  67 */     this.tagnames[4] = "ESSDSC";
/*     */      this.fields[4]=this.fieldESSDSC=new CharacterField(this.message, 30, 35, "ESSDSC");
/*     */ 
/*  70 */     this.fieldnames[5] = "ESSIMG";
/*  71 */     this.tagnames[5] = "ESSIMG";
/*     */      this.fields[5]=this.fieldESSIMG=new CharacterField(this.message, 65, 50, "ESSIMG");
/*     */ 
/*  74 */     this.fieldnames[6] = "ESSTAD";
/*  75 */     this.tagnames[6] = "ESSTAD";
/*     */      this.fields[6]=this.fieldESSTAD=new CharacterField(this.message, 115, 255, "ESSTAD");
/*     */ 
/*  78 */     this.fieldnames[7] = "ESSTPO";
/*  79 */     this.tagnames[7] = "ESSTPO";
/*     */      this.fields[7]=this.fieldESSTPO=new CharacterField(this.message, 370, 50, "ESSTPO");
/*     */   }
/*     */ 
/*     */   public String getESSDSC()
/*     */   {
/*  88 */     return this.fieldESSDSC.getString();
/*     */   }
/*     */ 
/*     */   public String getESSIDE()
/*     */   {
/*  95 */     return this.fieldESSIDE.getString();
/*     */   }
/*     */ 
/*     */   public String getESSIMG()
/*     */   {
/* 102 */     return this.fieldESSIMG.getString();
/*     */   }
/*     */ 
/*     */   public String getESSSID()
/*     */   {
/* 109 */     return this.fieldESSSID.getString();
/*     */   }
/*     */ 
/*     */   public String getESSTAD()
/*     */   {
/* 116 */     return this.fieldESSTAD.getString();
/*     */   }
/*     */ 
/*     */   public String getESSTPO()
/*     */   {
/* 123 */     return this.fieldESSTPO.getString();
/*     */   }
/*     */ 
/*     */   public String getESSTYP()
/*     */   {
/* 130 */     return this.fieldESSTYP.getString();
/*     */   }
/*     */ 
/*     */   public String getESSUSR()
/*     */   {
/* 137 */     return this.fieldESSUSR.getString();
/*     */   }
/*     */ 
/*     */   public void setESSDSC(String newvalue)
/*     */   {
/* 144 */     this.fieldESSDSC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setESSIDE(String newvalue)
/*     */   {
/* 151 */     this.fieldESSIDE.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setESSIMG(String newvalue)
/*     */   {
/* 158 */     this.fieldESSIMG.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setESSSID(String newvalue)
/*     */   {
/* 165 */     this.fieldESSSID.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setESSTAD(String newvalue)
/*     */   {
/* 172 */     this.fieldESSTAD.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setESSTPO(String newvalue)
/*     */   {
/* 179 */     this.fieldESSTPO.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setESSTYP(String newvalue)
/*     */   {
/* 186 */     this.fieldESSTYP.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setESSUSR(String newvalue)
/*     */   {
/* 193 */     this.fieldESSUSR.setString(newvalue);
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.ESS0040DSMessage
 * JD-Core Version:    0.6.0
 */