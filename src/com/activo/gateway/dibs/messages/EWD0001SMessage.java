/*     */ package com.activo.gateway.dibs.messages;
/*     */ 
/*     */ import java.math.BigDecimal;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*     */ 
/*     */ public class EWD0001SMessage extends MessageRecord
/*     */ {
/*  16 */   final int FIELDCOUNT = 8;
/*  17 */   private DecimalField fieldSWDCUN = null;
/*  18 */   private CharacterField fieldSWDNA1 = null;
/*  19 */   private CharacterField fieldSWDSHN = null;
/*  20 */   private CharacterField fieldSWDIDN = null;
/*  21 */   private CharacterField fieldSWDTID = null;
/*  22 */   private CharacterField fieldSWDPID = null;
/*  23 */   private DecimalField fieldSWDREC = null;
/*  24 */   private CharacterField fieldSWDOPE = null;
/*     */ 
/*     */   public EWD0001SMessage()
/*     */   {
/*  31 */     createFields();
/*  32 */     initialize();
/*  33 */     setFormatNameBytes();
/*     */   }
/*     */ 
/*     */   protected void createFields()
/*     */   {
/*  41 */     this.recordsize = 102;
/*  42 */     this.message = new byte[getByteLength()];
/*  43 */     this.formatname = "EWD0001S";
/*  44 */     this.fieldnames = new String[8];
/*  45 */     this.fields = new MessageField[8];
/*     */ 
/*  47 */     this.fieldnames[0] = "SWDCUN";
/*     */      this.fields[0]=this.fieldSWDCUN=new DecimalField(this.message, 10, 10, 0);
/*     */ 
/*  50 */     this.fieldnames[1] = "SWDNA1";
/*     */      this.fields[1]=this.fieldSWDNA1=new CharacterField(this.message, 20, 45);
/*     */ 
/*  53 */     this.fieldnames[2] = "SWDSHN";
/*     */      this.fields[2]=this.fieldSWDSHN=new CharacterField(this.message, 65, 15);
/*     */ 
/*  56 */     this.fieldnames[3] = "SWDIDN";
/*     */      this.fields[3]=this.fieldSWDIDN=new CharacterField(this.message, 80, 15);
/*     */ 
/*  59 */     this.fieldnames[4] = "SWDTID";
/*     */      this.fields[4]=this.fieldSWDTID=new CharacterField(this.message, 95, 4);
/*     */ 
/*  62 */     this.fieldnames[5] = "SWDPID";
/*     */      this.fields[5]=this.fieldSWDPID=new CharacterField(this.message, 99, 4);
/*     */ 
/*  65 */     this.fieldnames[6] = "SWDREC";
/*     */      this.fields[6]=this.fieldSWDREC=new DecimalField(this.message, 103, 8, 0);
/*     */ 
/*  68 */     this.fieldnames[7] = "SWDOPE";
/*     */      this.fields[7]=this.fieldSWDOPE=new CharacterField(this.message, 111, 1);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalSWDCUN()
/*     */   {
/*  77 */     return this.fieldSWDCUN.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalSWDREC()
/*     */   {
/*  84 */     return this.fieldSWDREC.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public String getSWDCUN()
/*     */   {
/*  91 */     return this.fieldSWDCUN.getString();
/*     */   }
/*     */ 
/*     */   public String getSWDIDN()
/*     */   {
/*  98 */     return this.fieldSWDIDN.getString();
/*     */   }
/*     */ 
/*     */   public String getSWDNA1()
/*     */   {
/* 105 */     return this.fieldSWDNA1.getString();
/*     */   }
/*     */ 
/*     */   public String getSWDOPE()
/*     */   {
/* 112 */     return this.fieldSWDOPE.getString();
/*     */   }
/*     */ 
/*     */   public String getSWDPID()
/*     */   {
/* 119 */     return this.fieldSWDPID.getString();
/*     */   }
/*     */ 
/*     */   public String getSWDREC()
/*     */   {
/* 126 */     return this.fieldSWDREC.getString();
/*     */   }
/*     */ 
/*     */   public String getSWDSHN()
/*     */   {
/* 133 */     return this.fieldSWDSHN.getString();
/*     */   }
/*     */ 
/*     */   public String getSWDTID()
/*     */   {
/* 140 */     return this.fieldSWDTID.getString();
/*     */   }
/*     */ 
/*     */   public void setSWDCUN(String newvalue)
/*     */   {
/* 147 */     this.fieldSWDCUN.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setSWDCUN(BigDecimal newvalue)
/*     */   {
/* 154 */     this.fieldSWDCUN.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setSWDIDN(String newvalue)
/*     */   {
/* 161 */     this.fieldSWDIDN.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setSWDNA1(String newvalue)
/*     */   {
/* 168 */     this.fieldSWDNA1.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setSWDOPE(String newvalue)
/*     */   {
/* 175 */     this.fieldSWDOPE.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setSWDPID(String newvalue)
/*     */   {
/* 182 */     this.fieldSWDPID.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setSWDREC(String newvalue)
/*     */   {
/* 189 */     this.fieldSWDREC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setSWDREC(BigDecimal newvalue)
/*     */   {
/* 196 */     this.fieldSWDREC.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setSWDSHN(String newvalue)
/*     */   {
/* 203 */     this.fieldSWDSHN.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setSWDTID(String newvalue)
/*     */   {
/* 210 */     this.fieldSWDTID.setString(newvalue);
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.EWD0001SMessage
 * JD-Core Version:    0.6.0
 */