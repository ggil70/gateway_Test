/*     */ package com.activo.gateway.dibs.messages;
/*     */ 
/*     */ import java.math.BigDecimal;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*     */ 
/*     */ public class IN096501Message extends MessageRecord
/*     */ {
/*  19 */   final int FIELDCOUNT = 3;
/*  20 */   private CharacterField fieldIN965USER = null;
/*  21 */   private DecimalField fieldIN965CKNUM = null;
/*  22 */   private CharacterField fieldIN965CKSTS = null;
/*     */ 
/*     */   public IN096501Message()
/*     */   {
/*  29 */     createFields();
/*  30 */     initialize();
/*     */   }
/*     */ 
/*     */   protected void createFields()
/*     */   {
/*  39 */     this.recordsize = 21;
/*  40 */     this.fileid = "1040304184801";
/*  41 */     this.recordid = "4155AB35F4600";
/*  42 */     this.message = new byte[getByteLength()];
/*  43 */     this.formatname = "IN096501";
/*  44 */     this.fieldnames = new String[3];
/*  45 */     this.tagnames = new String[3];
/*  46 */     this.fields = new MessageField[3];
/*     */ 
/*  48 */     this.fieldnames[0] = "IN965USER";
/*  49 */     this.tagnames[0] = "IN965USER";
/*     */      this.fields[0]=this.fieldIN965USER=new CharacterField(this.message, 10, 10, "IN965USER");
/*     */ 
/*  52 */     this.fieldnames[1] = "IN965CKNUM";
/*  53 */     this.tagnames[1] = "IN965CKNUM";
/*     */      this.fields[1]=this.fieldIN965CKNUM=new DecimalField(this.message, 20, 10, 0, "IN965CKNUM");
/*     */ 
/*  56 */     this.fieldnames[2] = "IN965CKSTS";
/*  57 */     this.tagnames[2] = "IN965CKSTS";
/*     */      this.fields[2]=this.fieldIN965CKSTS=new CharacterField(this.message, 30, 1, "IN965CKSTS");
/*     */   }
/*     */ 
/*     */   public void setIN965USER(String newvalue)
/*     */   {
/*  67 */     this.fieldIN965USER.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getIN965USER()
/*     */   {
/*  75 */     return this.fieldIN965USER.getString();
/*     */   }
/*     */ 
/*     */   public void setIN965CKNUM(String newvalue)
/*     */   {
/*  83 */     this.fieldIN965CKNUM.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getIN965CKNUM()
/*     */   {
/*  91 */     return this.fieldIN965CKNUM.getString();
/*     */   }
/*     */ 
/*     */   public void setIN965CKNUM(BigDecimal newvalue)
/*     */   {
/*  99 */     this.fieldIN965CKNUM.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalIN965CKNUM()
/*     */   {
/* 107 */     return this.fieldIN965CKNUM.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setIN965CKSTS(String newvalue)
/*     */   {
/* 115 */     this.fieldIN965CKSTS.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getIN965CKSTS()
/*     */   {
/* 123 */     return this.fieldIN965CKSTS.getString();
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.IN096501Message
 * JD-Core Version:    0.6.0
 */