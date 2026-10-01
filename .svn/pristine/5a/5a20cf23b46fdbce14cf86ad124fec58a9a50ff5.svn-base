/*     */ package com.activo.gateway.dibs.messages;
/*     */ 
/*     */ import java.math.BigDecimal;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*     */ 
/*     */ public class ICH017001Message extends MessageRecord
/*     */ {
/*  19 */   final int FIELDCOUNT = 5;
/*  20 */   private CharacterField fieldICH170USR = null;
/*  21 */   private DecimalField fieldICH170ACC = null;
/*  22 */   private DecimalField fieldICH170INC = null;
/*  23 */   private DecimalField fieldICH170FIN = null;
/*  24 */   private CharacterField fieldICH170STA = null;
/*     */ 
/*     */   public ICH017001Message()
/*     */   {
/*  31 */     createFields();
/*  32 */     initialize();
/*     */   }
/*     */ 
/*     */   protected void createFields()
/*     */   {
/*  41 */     this.recordsize = 44;
/*  42 */     this.fileid = "1010921114936";
/*  43 */     this.recordid = "42BFEB4C93A15";
/*  44 */     this.message = new byte[getByteLength()];
/*  45 */     this.formatname = "ICH017001";
/*  46 */     this.fieldnames = new String[5];
/*  47 */     this.tagnames = new String[5];
/*  48 */     this.fields = new MessageField[5];
/*     */ 
/*  50 */     this.fieldnames[0] = "ICH170USR";
/*  51 */     this.tagnames[0] = "ICH170USR";
/*     */      this.fields[0]=this.fieldICH170USR=new CharacterField(this.message, 10, 10, "ICH170USR");
/*     */ 
/*  54 */     this.fieldnames[1] = "ICH170ACC";
/*  55 */     this.tagnames[1] = "ICH170ACC";
/*     */      this.fields[1]=this.fieldICH170ACC=new DecimalField(this.message, 20, 13, 0, "ICH170ACC");
/*     */ 
/*  58 */     this.fieldnames[2] = "ICH170INC";
/*  59 */     this.tagnames[2] = "ICH170INC";
/*     */      this.fields[2]=this.fieldICH170INC=new DecimalField(this.message, 33, 10, 0, "ICH170INC");
/*     */ 
/*  62 */     this.fieldnames[3] = "ICH170FIN";
/*  63 */     this.tagnames[3] = "ICH170FIN";
/*     */      this.fields[3]=this.fieldICH170FIN=new DecimalField(this.message, 43, 10, 0, "ICH170FIN");
/*     */ 
/*  66 */     this.fieldnames[4] = "ICH170STA";
/*  67 */     this.tagnames[4] = "ICH170STA";
/*     */      this.fields[4]=this.fieldICH170STA=new CharacterField(this.message, 53, 1, "ICH170STA");
/*     */   }
/*     */ 
/*     */   public void setICH170USR(String newvalue)
/*     */   {
/*  77 */     this.fieldICH170USR.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getICH170USR()
/*     */   {
/*  85 */     return this.fieldICH170USR.getString();
/*     */   }
/*     */ 
/*     */   public void setICH170ACC(String newvalue)
/*     */   {
/*  93 */     this.fieldICH170ACC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getICH170ACC()
/*     */   {
/* 101 */     return this.fieldICH170ACC.getString();
/*     */   }
/*     */ 
/*     */   public void setICH170ACC(BigDecimal newvalue)
/*     */   {
/* 109 */     this.fieldICH170ACC.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalICH170ACC()
/*     */   {
/* 117 */     return this.fieldICH170ACC.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setICH170INC(String newvalue)
/*     */   {
/* 125 */     this.fieldICH170INC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getICH170INC()
/*     */   {
/* 133 */     return this.fieldICH170INC.getString();
/*     */   }
/*     */ 
/*     */   public void setICH170INC(BigDecimal newvalue)
/*     */   {
/* 141 */     this.fieldICH170INC.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalICH170INC()
/*     */   {
/* 149 */     return this.fieldICH170INC.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setICH170FIN(String newvalue)
/*     */   {
/* 157 */     this.fieldICH170FIN.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getICH170FIN()
/*     */   {
/* 165 */     return this.fieldICH170FIN.getString();
/*     */   }
/*     */ 
/*     */   public void setICH170FIN(BigDecimal newvalue)
/*     */   {
/* 173 */     this.fieldICH170FIN.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalICH170FIN()
/*     */   {
/* 181 */     return this.fieldICH170FIN.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setICH170STA(String newvalue)
/*     */   {
/* 189 */     this.fieldICH170STA.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getICH170STA()
/*     */   {
/* 197 */     return this.fieldICH170STA.getString();
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.ICH017001Message
 * JD-Core Version:    0.6.0
 */