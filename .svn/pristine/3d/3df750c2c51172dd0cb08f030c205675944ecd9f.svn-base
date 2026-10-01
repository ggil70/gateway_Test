/*     */ package com.activo.gateway.dibs.messages;
/*     */ 
/*     */ import java.math.BigDecimal;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*     */ 
/*     */ public class EWD0001RMessage extends MessageRecord
/*     */ {
/*  16 */   final int FIELDCOUNT = 3;
/*  17 */   private CharacterField fieldRWDUSR = null;
/*  18 */   private CharacterField fieldRWDSHR = null;
/*  19 */   private DecimalField fieldRWDFRC = null;
/*     */ 
/*     */   public EWD0001RMessage()
/*     */   {
/*  26 */     createFields();
/*  27 */     initialize();
/*  28 */     setFormatNameBytes();
/*     */   }
/*     */ 
/*     */   protected void createFields()
/*     */   {
/*  36 */     this.recordsize = 38;
/*  37 */     this.message = new byte[getByteLength()];
/*  38 */     this.formatname = "EWD0001R";
/*  39 */     this.fieldnames = new String[3];
/*  40 */     this.fields = new MessageField[3];
/*     */ 
/*  42 */     this.fieldnames[0] = "RWDUSR";
/*     */      this.fields[0]=this.fieldRWDUSR=new CharacterField(this.message, 10, 10);
/*     */ 
/*  45 */     this.fieldnames[1] = "RWDSHR";
/*     */      this.fields[1]=this.fieldRWDSHR=new CharacterField(this.message, 20, 20);
/*     */ 
/*  48 */     this.fieldnames[2] = "RWDFRC";
/*     */      this.fields[2]=this.fieldRWDFRC=new DecimalField(this.message, 40, 8, 0);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalRWDFRC()
/*     */   {
/*  57 */     return this.fieldRWDFRC.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public String getRWDFRC()
/*     */   {
/*  64 */     return this.fieldRWDFRC.getString();
/*     */   }
/*     */ 
/*     */   public String getRWDSHR()
/*     */   {
/*  71 */     return this.fieldRWDSHR.getString();
/*     */   }
/*     */ 
/*     */   public String getRWDUSR()
/*     */   {
/*  78 */     return this.fieldRWDUSR.getString();
/*     */   }
/*     */ 
/*     */   public void setRWDFRC(String newvalue)
/*     */   {
/*  85 */     this.fieldRWDFRC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setRWDFRC(BigDecimal newvalue)
/*     */   {
/*  92 */     this.fieldRWDFRC.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setRWDSHR(String newvalue)
/*     */   {
/*  99 */     this.fieldRWDSHR.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setRWDUSR(String newvalue)
/*     */   {
/* 106 */     this.fieldRWDUSR.setString(newvalue);
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.EWD0001RMessage
 * JD-Core Version:    0.6.0
 */