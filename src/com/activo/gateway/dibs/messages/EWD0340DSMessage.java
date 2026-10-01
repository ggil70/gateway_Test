/*     */ package com.activo.gateway.dibs.messages;
/*     */ 
/*     */ import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*     */ 
/*     */ public class EWD0340DSMessage extends MessageRecord
/*     */ {
/*  16 */   final int FIELDCOUNT = 5;
/*  17 */   private CharacterField fieldEWDFNM = null;
/*  18 */   private CharacterField fieldEWDMIN = null;
/*  19 */   private CharacterField fieldEWDLNM = null;
/*  20 */   private CharacterField fieldEWDMAD = null;
/*  21 */   private CharacterField fieldEWDOPE = null;
/*     */ 
/*     */   public EWD0340DSMessage()
/*     */   {
/*  28 */     createFields();
/*  29 */     initialize();
/*     */   }
/*     */ 
/*     */   protected void createFields()
/*     */   {
/*  38 */     this.recordsize = 112;
/*  39 */     this.fileid = "1020320102736";
/*  40 */     this.recordid = "3C28E7F8C7ED3";
/*  41 */     this.message = new byte[getByteLength()];
/*  42 */     this.formatname = "EWD0340DS";
/*  43 */     this.fieldnames = new String[5];
/*  44 */     this.tagnames = new String[5];
/*  45 */     this.fields = new MessageField[5];
/*     */ 
/*  47 */     this.fieldnames[0] = "EWDFNM";
/*  48 */     this.tagnames[0] = "EWDFNM";
/*     */      this.fields[0]=this.fieldEWDFNM=new CharacterField(this.message, 10, 25, "EWDFNM");
/*     */ 
/*  51 */     this.fieldnames[1] = "EWDMIN";
/*  52 */     this.tagnames[1] = "EWDMIN";
/*     */      this.fields[1]=this.fieldEWDMIN=new CharacterField(this.message, 35, 1, "EWDMIN");
/*     */ 
/*  55 */     this.fieldnames[2] = "EWDLNM";
/*  56 */     this.tagnames[2] = "EWDLNM";
/*     */      this.fields[2]=this.fieldEWDLNM=new CharacterField(this.message, 36, 25, "EWDLNM");
/*     */ 
/*  59 */     this.fieldnames[3] = "EWDMAD";
/*  60 */     this.tagnames[3] = "EWDMAD";
/*     */      this.fields[3]=this.fieldEWDMAD=new CharacterField(this.message, 61, 60, "EWDMAD");
/*     */ 
/*  63 */     this.fieldnames[4] = "EWDOPE";
/*  64 */     this.tagnames[4] = "EWDOPE";
/*     */      this.fields[4]=this.fieldEWDOPE=new CharacterField(this.message, 121, 1, "EWDOPE");
/*     */   }
/*     */ 
/*     */   public void setEWDFNM(String newvalue)
/*     */   {
/*  74 */     this.fieldEWDFNM.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getEWDFNM()
/*     */   {
/*  82 */     return this.fieldEWDFNM.getString();
/*     */   }
/*     */ 
/*     */   public void setEWDMIN(String newvalue)
/*     */   {
/*  90 */     this.fieldEWDMIN.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getEWDMIN()
/*     */   {
/*  98 */     return this.fieldEWDMIN.getString();
/*     */   }
/*     */ 
/*     */   public void setEWDLNM(String newvalue)
/*     */   {
/* 106 */     this.fieldEWDLNM.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getEWDLNM()
/*     */   {
/* 114 */     return this.fieldEWDLNM.getString();
/*     */   }
/*     */ 
/*     */   public void setEWDMAD(String newvalue)
/*     */   {
/* 122 */     this.fieldEWDMAD.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getEWDMAD()
/*     */   {
/* 130 */     return this.fieldEWDMAD.getString();
/*     */   }
/*     */ 
/*     */   public void setEWDOPE(String newvalue)
/*     */   {
/* 138 */     this.fieldEWDOPE.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getEWDOPE()
/*     */   {
/* 146 */     return this.fieldEWDOPE.getString();
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.EWD0340DSMessage
 * JD-Core Version:    0.6.0
 */