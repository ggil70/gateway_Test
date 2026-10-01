/*     */ package com.activo.gateway.dibs.messages;
/*     */ 
/*     */ import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*     */ 
/*     */ public class ELEHDRMessage extends MessageRecord
/*     */ {
/*  16 */   final int FIELDCOUNT = 9;
/*  17 */   private CharacterField fieldUSERID = null;
/*  18 */   private CharacterField fieldPROGRM = null;
/*  19 */   private CharacterField fieldTIMSYS = null;
/*  20 */   private CharacterField fieldSCRCOD = null;
/*  21 */   private CharacterField fieldOPECOD = null;
/*  22 */   private CharacterField fieldFLGMAS = null;
/*  23 */   private CharacterField fieldFLGWK1 = null;
/*  24 */   private CharacterField fieldFLGWK2 = null;
/*  25 */   private CharacterField fieldFLGWK3 = null;
/*     */ 
/*     */   public ELEHDRMessage()
/*     */   {
/*  32 */     createFields();
/*  33 */     initialize();
/*     */   }
/*     */ 
/*     */   protected void createFields()
/*     */   {
/*  41 */     this.recordsize = 42;
/*  42 */     this.fileid = "1000721111018";
/*  43 */     this.recordid = "527B93C3E7C36";
/*  44 */     this.message = new byte[getByteLength()];
/*  45 */     this.formatname = "ELEHDR";
/*  46 */     this.fieldnames = new String[9];
/*  47 */     this.tagnames = new String[9];
/*  48 */     this.fields = new MessageField[9];
/*     */ 
/*  50 */     this.fieldnames[0] = "USERID";
/*  51 */     this.tagnames[0] = "USERID";
/*     */      this.fields[0]=this.fieldUSERID=new CharacterField(this.message, 10, 10, "USERID");
/*     */ 
/*  54 */     this.fieldnames[1] = "PROGRM";
/*  55 */     this.tagnames[1] = "PROGRM";
/*     */      this.fields[1]=this.fieldPROGRM=new CharacterField(this.message, 20, 10, "PROGRM");
/*     */ 
/*  58 */     this.fieldnames[2] = "TIMSYS";
/*  59 */     this.tagnames[2] = "TIMSYS";
/*     */      this.fields[2]=this.fieldTIMSYS=new CharacterField(this.message, 30, 12, "TIMSYS");
/*     */ 
/*  62 */     this.fieldnames[3] = "SCRCOD";
/*  63 */     this.tagnames[3] = "SCRCOD";
/*     */      this.fields[3]=this.fieldSCRCOD=new CharacterField(this.message, 42, 2, "SCRCOD");
/*     */ 
/*  66 */     this.fieldnames[4] = "OPECOD";
/*  67 */     this.tagnames[4] = "OPECOD";
/*     */      this.fields[4]=this.fieldOPECOD=new CharacterField(this.message, 44, 4, "OPECOD");
/*     */ 
/*  70 */     this.fieldnames[5] = "FLGMAS";
/*  71 */     this.tagnames[5] = "FLGMAS";
/*     */      this.fields[5]=this.fieldFLGMAS=new CharacterField(this.message, 48, 1, "FLGMAS");
/*     */ 
/*  74 */     this.fieldnames[6] = "FLGWK1";
/*  75 */     this.tagnames[6] = "FLGWK1";
/*     */      this.fields[6]=this.fieldFLGWK1=new CharacterField(this.message, 49, 1, "FLGWK1");
/*     */ 
/*  78 */     this.fieldnames[7] = "FLGWK2";
/*  79 */     this.tagnames[7] = "FLGWK2";
/*     */      this.fields[7]=this.fieldFLGWK2=new CharacterField(this.message, 50, 1, "FLGWK2");
/*     */ 
/*  82 */     this.fieldnames[8] = "FLGWK3";
/*  83 */     this.tagnames[8] = "FLGWK3";
/*     */      this.fields[8]=this.fieldFLGWK3=new CharacterField(this.message, 51, 1, "FLGWK3");
/*     */   }
/*     */ 
/*     */   public String getFLGMAS()
/*     */   {
/*  92 */     return this.fieldFLGMAS.getString();
/*     */   }
/*     */ 
/*     */   public String getFLGWK1()
/*     */   {
/*  99 */     return this.fieldFLGWK1.getString();
/*     */   }
/*     */ 
/*     */   public String getFLGWK2()
/*     */   {
/* 106 */     return this.fieldFLGWK2.getString();
/*     */   }
/*     */ 
/*     */   public String getFLGWK3()
/*     */   {
/* 113 */     return this.fieldFLGWK3.getString();
/*     */   }
/*     */ 
/*     */   public String getOPECOD()
/*     */   {
/* 120 */     return this.fieldOPECOD.getString();
/*     */   }
/*     */ 
/*     */   public String getPROGRM()
/*     */   {
/* 127 */     return this.fieldPROGRM.getString();
/*     */   }
/*     */ 
/*     */   public String getSCRCOD()
/*     */   {
/* 134 */     return this.fieldSCRCOD.getString();
/*     */   }
/*     */ 
/*     */   public String getTIMSYS()
/*     */   {
/* 141 */     return this.fieldTIMSYS.getString();
/*     */   }
/*     */ 
/*     */   public String getUSERID()
/*     */   {
/* 148 */     return this.fieldUSERID.getString();
/*     */   }
/*     */ 
/*     */   public void setFLGMAS(String newvalue)
/*     */   {
/* 155 */     this.fieldFLGMAS.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setFLGWK1(String newvalue)
/*     */   {
/* 162 */     this.fieldFLGWK1.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setFLGWK2(String newvalue)
/*     */   {
/* 169 */     this.fieldFLGWK2.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setFLGWK3(String newvalue)
/*     */   {
/* 176 */     this.fieldFLGWK3.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setOPECOD(String newvalue)
/*     */   {
/* 183 */     this.fieldOPECOD.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setPROGRM(String newvalue)
/*     */   {
/* 190 */     this.fieldPROGRM.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setSCRCOD(String newvalue)
/*     */   {
/* 197 */     this.fieldSCRCOD.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setTIMSYS(String newvalue)
/*     */   {
/* 204 */     this.fieldTIMSYS.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setUSERID(String newvalue)
/*     */   {
/* 211 */     this.fieldUSERID.setString(newvalue);
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.ELEHDRMessage
 * JD-Core Version:    0.6.0
 */