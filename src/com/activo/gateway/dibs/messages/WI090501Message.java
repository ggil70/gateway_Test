/*     */ package com.activo.gateway.dibs.messages;
/*     */ 
/*     */ import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*     */ 
/*     */ public class WI090501Message extends MessageRecord
/*     */ {
/*  16 */   final int FIELDCOUNT = 5;
/*  17 */   private CharacterField fieldWI905USR = null;
/*  18 */   private CharacterField fieldWI905ACD = null;
/*  19 */   private CharacterField fieldWI905TYP = null;
/*  20 */   private CharacterField fieldWI905DES = null;
/*  21 */   private CharacterField fieldWI905EOF = null;
/*     */ 
/*     */   public WI090501Message()
/*     */   {
/*  28 */     createFields();
/*  29 */     initialize();
/*     */   }
/*     */ 
/*     */   protected void createFields()
/*     */   {
/*  37 */     this.recordsize = 32;
/*  38 */     this.fileid = "1001017145012";
/*  39 */     this.recordid = "516570BBAA353";
/*  40 */     this.message = new byte[getByteLength()];
/*  41 */     this.formatname = "WI090501";
/*  42 */     this.fieldnames = new String[5];
/*  43 */     this.tagnames = new String[5];
/*  44 */     this.fields = new MessageField[5];
/*     */ 
/*  46 */     this.fieldnames[0] = "WI905USR";
/*  47 */     this.tagnames[0] = "WI905USR";
/*     */      this.fields[0]=this.fieldWI905USR=new CharacterField(this.message, 10, 10, "WI905USR");
/*     */ 
/*  50 */     this.fieldnames[1] = "WI905ACD";
/*  51 */     this.tagnames[1] = "WI905ACD";
/*     */      this.fields[1]=this.fieldWI905ACD=new CharacterField(this.message, 20, 2, "WI905ACD");
/*     */ 
/*  54 */     this.fieldnames[2] = "WI905TYP";
/*  55 */     this.tagnames[2] = "WI905TYP";
/*     */      this.fields[2]=this.fieldWI905TYP=new CharacterField(this.message, 22, 4, "WI905TYP");
/*     */ 
/*  58 */     this.fieldnames[3] = "WI905DES";
/*  59 */     this.tagnames[3] = "WI905DES";
/*     */      this.fields[3]=this.fieldWI905DES=new CharacterField(this.message, 26, 15, "WI905DES");
/*     */ 
/*  62 */     this.fieldnames[4] = "WI905EOF";
/*  63 */     this.tagnames[4] = "WI905EOF";
/*     */      this.fields[4]=this.fieldWI905EOF=new CharacterField(this.message, 41, 1, "WI905EOF");
/*     */   }
/*     */ 
/*     */   public String getWI905ACD()
/*     */   {
/*  72 */     return this.fieldWI905ACD.getString();
/*     */   }
/*     */ 
/*     */   public String getWI905DES()
/*     */   {
/*  79 */     return this.fieldWI905DES.getString();
/*     */   }
/*     */ 
/*     */   public String getWI905EOF()
/*     */   {
/*  86 */     return this.fieldWI905EOF.getString();
/*     */   }
/*     */ 
/*     */   public String getWI905TYP()
/*     */   {
/*  93 */     return this.fieldWI905TYP.getString();
/*     */   }
/*     */ 
/*     */   public String getWI905USR()
/*     */   {
/* 100 */     return this.fieldWI905USR.getString();
/*     */   }
/*     */ 
/*     */   public void setWI905ACD(String newvalue)
/*     */   {
/* 107 */     this.fieldWI905ACD.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setWI905DES(String newvalue)
/*     */   {
/* 114 */     this.fieldWI905DES.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setWI905EOF(String newvalue)
/*     */   {
/* 121 */     this.fieldWI905EOF.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setWI905TYP(String newvalue)
/*     */   {
/* 128 */     this.fieldWI905TYP.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setWI905USR(String newvalue)
/*     */   {
/* 135 */     this.fieldWI905USR.setString(newvalue);
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.WI090501Message
 * JD-Core Version:    0.6.0
 */