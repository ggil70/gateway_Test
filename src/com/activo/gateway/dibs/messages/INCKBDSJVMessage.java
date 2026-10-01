/*     */ package com.activo.gateway.dibs.messages;
/*     */ 
/*     */ import java.math.BigDecimal;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*     */ 
/*     */ public class INCKBDSJVMessage extends MessageRecord
/*     */ {
/*  19 */   final int FIELDCOUNT = 4;
/*  20 */   private CharacterField fieldDSCKBUSR = null;
/*  21 */   private DecimalField fieldDSCKBACC = null;
/*  22 */   private DecimalField fieldDSCKBNCK = null;
/*  23 */   private DecimalField fieldDSCKBBRN = null;
/*     */ 
/*     */   public INCKBDSJVMessage()
/*     */   {
/*  30 */     createFields();
/*  31 */     initialize();
/*     */   }
/*     */ 
/*     */   protected void createFields()
/*     */   {
/*  39 */     this.recordsize = 32;
/*  40 */     this.fileid = "1000907103726";
/*  41 */     this.recordid = "394729866629C";
/*  42 */     this.message = new byte[getByteLength()];
/*  43 */     this.formatname = "INCKBDSJV";
/*  44 */     this.fieldnames = new String[4];
/*  45 */     this.tagnames = new String[4];
/*  46 */     this.fields = new MessageField[4];
/*     */ 
/*  48 */     this.fieldnames[0] = "DSCKBUSR";
/*  49 */     this.tagnames[0] = "DSCKBUSR";
/*     */      this.fields[0]=this.fieldDSCKBUSR=new CharacterField(this.message, 10, 10, "DSCKBUSR");
/*     */ 
/*  52 */     this.fieldnames[1] = "DSCKBACC";
/*  53 */     this.tagnames[1] = "DSCKBACC";
/*     */      this.fields[1]=this.fieldDSCKBACC=new DecimalField(this.message, 20, 13, 0, "DSCKBACC");
/*     */ 
/*  56 */     this.fieldnames[2] = "DSCKBNCK";
/*  57 */     this.tagnames[2] = "DSCKBNCK";
/*     */      this.fields[2]=this.fieldDSCKBNCK=new DecimalField(this.message, 33, 5, 0, "DSCKBNCK");
/*     */ 
/*  60 */     this.fieldnames[3] = "DSCKBBRN";
/*  61 */     this.tagnames[3] = "DSCKBBRN";
/*     */      this.fields[3]=this.fieldDSCKBBRN=new DecimalField(this.message, 38, 4, 0, "DSCKBBRN");
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalDSCKBACC()
/*     */   {
/*  70 */     return this.fieldDSCKBACC.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalDSCKBBRN()
/*     */   {
/*  77 */     return this.fieldDSCKBBRN.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalDSCKBNCK()
/*     */   {
/*  84 */     return this.fieldDSCKBNCK.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public String getDSCKBACC()
/*     */   {
/*  91 */     return this.fieldDSCKBACC.getString();
/*     */   }
/*     */ 
/*     */   public String getDSCKBBRN()
/*     */   {
/*  98 */     return this.fieldDSCKBBRN.getString();
/*     */   }
/*     */ 
/*     */   public String getDSCKBNCK()
/*     */   {
/* 105 */     return this.fieldDSCKBNCK.getString();
/*     */   }
/*     */ 
/*     */   public String getDSCKBUSR()
/*     */   {
/* 112 */     return this.fieldDSCKBUSR.getString();
/*     */   }
/*     */ 
/*     */   public void setDSCKBACC(String newvalue)
/*     */   {
/* 119 */     this.fieldDSCKBACC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSCKBACC(BigDecimal newvalue)
/*     */   {
/* 126 */     this.fieldDSCKBACC.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSCKBBRN(String newvalue)
/*     */   {
/* 133 */     this.fieldDSCKBBRN.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSCKBBRN(BigDecimal newvalue)
/*     */   {
/* 140 */     this.fieldDSCKBBRN.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSCKBNCK(String newvalue)
/*     */   {
/* 147 */     this.fieldDSCKBNCK.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSCKBNCK(BigDecimal newvalue)
/*     */   {
/* 154 */     this.fieldDSCKBNCK.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSCKBUSR(String newvalue)
/*     */   {
/* 161 */     this.fieldDSCKBUSR.setString(newvalue);
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.INCKBDSJVMessage
 * JD-Core Version:    0.6.0
 */