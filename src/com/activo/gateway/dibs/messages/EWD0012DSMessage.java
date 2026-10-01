/*     */ package com.activo.gateway.dibs.messages;
/*     */ 
/*     */ import java.math.BigDecimal;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*     */ 
/*     */ public class EWD0012DSMessage extends MessageRecord
/*     */ {
/*  20 */   final int FIELDCOUNT = 5;
/*  21 */   private CharacterField fieldEWDSHR = null;
/*  22 */   private CharacterField fieldEWDCCY = null;
/*  23 */   private CharacterField fieldEWDDSC = null;
/*  24 */   private DecimalField fieldEWDEXR = null;
/*  25 */   private CharacterField fieldEWDOPE = null;
/*     */ 
/*     */   public EWD0012DSMessage()
/*     */   {
/*  32 */     createFields();
/*  33 */     initialize();
/*     */   }
/*     */ 
/*     */   protected void createFields()
/*     */   {
/*  42 */     this.recordsize = 54;
/*  43 */     this.fileid = "1001020190845";
/*  44 */     this.recordid = "37533BD2B1C1D";
/*  45 */     this.message = new byte[getByteLength()];
/*  46 */     this.formatname = "EWD0012DS";
/*  47 */     this.fieldnames = new String[5];
/*  48 */     this.tagnames = new String[5];
/*  49 */     this.fields = new MessageField[5];
/*     */ 
/*  51 */     this.fieldnames[0] = "EWDSHR";
/*  52 */     this.tagnames[0] = "EWDSHR";
/*     */      this.fields[0]=this.fieldEWDSHR=new CharacterField(this.message, 10, 2, "EWDSHR");
/*     */ 
/*  55 */     this.fieldnames[1] = "EWDCCY";
/*  56 */     this.tagnames[1] = "EWDCCY";
/*     */      this.fields[1]=this.fieldEWDCCY=new CharacterField(this.message, 12, 3, "EWDCCY");
/*     */ 
/*  59 */     this.fieldnames[2] = "EWDDSC";
/*  60 */     this.tagnames[2] = "EWDDSC";
/*     */      this.fields[2]=this.fieldEWDDSC=new CharacterField(this.message, 15, 35, "EWDDSC");
/*     */ 
/*  63 */     this.fieldnames[3] = "EWDEXR";
/*  64 */     this.tagnames[3] = "EWDEXR";
/*     */      this.fields[3]=this.fieldEWDEXR=new DecimalField(this.message, 50, 13, 6, "EWDEXR");
/*     */ 
/*  67 */     this.fieldnames[4] = "EWDOPE";
/*  68 */     this.tagnames[4] = "EWDOPE";
/*     */      this.fields[4]=this.fieldEWDOPE=new CharacterField(this.message, 63, 1, "EWDOPE");
/*     */   }
/*     */ 
/*     */   public void setEWDSHR(String newvalue)
/*     */   {
/*  78 */     this.fieldEWDSHR.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getEWDSHR()
/*     */   {
/*  86 */     return this.fieldEWDSHR.getString();
/*     */   }
/*     */ 
/*     */   public void setEWDCCY(String newvalue)
/*     */   {
/*  94 */     this.fieldEWDCCY.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getEWDCCY()
/*     */   {
/* 102 */     return this.fieldEWDCCY.getString();
/*     */   }
/*     */ 
/*     */   public void setEWDDSC(String newvalue)
/*     */   {
/* 110 */     this.fieldEWDDSC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getEWDDSC()
/*     */   {
/* 118 */     return this.fieldEWDDSC.getString();
/*     */   }
/*     */ 
/*     */   public void setEWDEXR(String newvalue)
/*     */   {
/* 126 */     this.fieldEWDEXR.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getEWDEXR()
/*     */   {
/* 134 */     return this.fieldEWDEXR.getString();
/*     */   }
/*     */ 
/*     */   public void setEWDEXR(BigDecimal newvalue)
/*     */   {
/* 142 */     this.fieldEWDEXR.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalEWDEXR()
/*     */   {
/* 150 */     return this.fieldEWDEXR.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setEWDOPE(String newvalue)
/*     */   {
/* 158 */     this.fieldEWDOPE.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getEWDOPE()
/*     */   {
/* 166 */     return this.fieldEWDOPE.getString();
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.EWD0012DSMessage
 * JD-Core Version:    0.6.0
 */