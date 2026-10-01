/*     */ package com.activo.gateway.dibs.messages;
/*     */ 
/*     */ import java.math.BigDecimal;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*     */ 
/*     */ public class PHREGISTERMessage extends MessageRecord
/*     */ {
/*  19 */   final int FIELDCOUNT = 3;
/*  20 */   private CharacterField fieldREGUSR = null;
/*  21 */   private DecimalField fieldREGACC = null;
/*  22 */   private DecimalField fieldREGPIN = null;
/*     */ 
/*     */   public PHREGISTERMessage()
/*     */   {
/*  29 */     createFields();
/*  30 */     initialize();
/*     */   }
/*     */ 
/*     */   protected void createFields()
/*     */   {
/*  38 */     this.recordsize = 30;
/*  39 */     this.fileid = "1000922165745";
/*  40 */     this.recordid = "25F359930FE58";
/*  41 */     this.message = new byte[getByteLength()];
/*  42 */     this.formatname = "PHREGISTER";
/*  43 */     this.fieldnames = new String[3];
/*  44 */     this.tagnames = new String[3];
/*  45 */     this.fields = new MessageField[3];
/*     */ 
/*  47 */     this.fieldnames[0] = "REGUSR";
/*  48 */     this.tagnames[0] = "REGUSR";
/*     */      this.fields[0]=this.fieldREGUSR=new CharacterField(this.message, 10, 10, "REGUSR");
/*     */ 
/*  51 */     this.fieldnames[1] = "REGACC";
/*  52 */     this.tagnames[1] = "REGACC";
/*     */      this.fields[1]=this.fieldREGACC=new DecimalField(this.message, 20, 13, 0, "REGACC");
/*     */ 
/*  55 */     this.fieldnames[2] = "REGPIN";
/*  56 */     this.tagnames[2] = "REGPIN";
/*     */      this.fields[2]=this.fieldREGPIN=new DecimalField(this.message, 33, 7, 0, "REGPIN");
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalREGACC()
/*     */   {
/*  65 */     return this.fieldREGACC.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalREGPIN()
/*     */   {
/*  72 */     return this.fieldREGPIN.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public String getREGACC()
/*     */   {
/*  79 */     return this.fieldREGACC.getString();
/*     */   }
/*     */ 
/*     */   public String getREGPIN()
/*     */   {
/*  86 */     return this.fieldREGPIN.getString();
/*     */   }
/*     */ 
/*     */   public String getREGUSR()
/*     */   {
/*  93 */     return this.fieldREGUSR.getString();
/*     */   }
/*     */ 
/*     */   public void setREGACC(String newvalue)
/*     */   {
/* 100 */     this.fieldREGACC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setREGACC(BigDecimal newvalue)
/*     */   {
/* 107 */     this.fieldREGACC.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setREGPIN(String newvalue)
/*     */   {
/* 114 */     this.fieldREGPIN.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setREGPIN(BigDecimal newvalue)
/*     */   {
/* 121 */     this.fieldREGPIN.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setREGUSR(String newvalue)
/*     */   {
/* 128 */     this.fieldREGUSR.setString(newvalue);
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.PHREGISTERMessage
 * JD-Core Version:    0.6.0
 */