/*     */ package com.activo.gateway.dibs.messages;
/*     */ 
/*     */ import java.math.BigDecimal;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*     */ 
/*     */ public class IN095502Message extends MessageRecord
/*     */ {
/*  19 */   final int FIELDCOUNT = 7;
/*  20 */   private CharacterField fieldIN9552USR = null;
/*  21 */   private DecimalField fieldIN955DAC = null;
/*  22 */   private CharacterField fieldIN955CCY = null;
/*  23 */   private DecimalField fieldIN955AMT = null;
/*  24 */   private CharacterField fieldIN9552TYP = null;
/*  25 */   private CharacterField fieldIN955SAC = null;
/*  26 */   private CharacterField fieldIN955VISA = null;
/*     */ 
/*     */   public IN095502Message()
/*     */   {
/*  33 */     createFields();
/*  34 */     initialize();
/*     */   }
/*     */ 
/*     */   protected void createFields()
/*     */   {
/*  42 */     this.recordsize = 77;
/*  43 */     this.fileid = "1000920164226";
/*  44 */     this.recordid = "46F11762D5FBE";
/*  45 */     this.message = new byte[getByteLength()];
/*  46 */     this.formatname = "IN095502";
/*  47 */     this.fieldnames = new String[7];
/*  48 */     this.tagnames = new String[7];
/*  49 */     this.fields = new MessageField[7];
/*     */ 
/*  51 */     this.fieldnames[0] = "IN9552USR";
/*  52 */     this.tagnames[0] = "IN9552USR";
/*     */      this.fields[0]=this.fieldIN9552USR=new CharacterField(this.message, 10, 10, "IN9552USR");
/*     */ 
/*  55 */     this.fieldnames[1] = "IN955DAC";
/*  56 */     this.tagnames[1] = "IN955DAC";
/*     */      this.fields[1]=this.fieldIN955DAC=new DecimalField(this.message, 20, 13, 0, "IN955DAC");
/*     */ 
/*  59 */     this.fieldnames[2] = "IN955CCY";
/*  60 */     this.tagnames[2] = "IN955CCY";
/*     */      this.fields[2]=this.fieldIN955CCY=new CharacterField(this.message, 33, 3, "IN955CCY");
/*     */ 
/*  63 */     this.fieldnames[3] = "IN955AMT";
/*  64 */     this.tagnames[3] = "IN955AMT";
/*     */      this.fields[3]=this.fieldIN955AMT=new DecimalField(this.message, 36, 15, 2, "IN955AMT");
/*     */ 
/*  67 */     this.fieldnames[4] = "IN9552TYP";
/*  68 */     this.tagnames[4] = "IN9552TYP";
/*     */      this.fields[4]=this.fieldIN9552TYP=new CharacterField(this.message, 51, 2, "IN9552TYP");
/*     */ 
/*  71 */     this.fieldnames[5] = "IN955SAC";
/*  72 */     this.tagnames[5] = "IN955SAC";
/*     */      this.fields[5]=this.fieldIN955SAC=new CharacterField(this.message, 53, 18, "IN955SAC");
/*     */ 
/*  75 */     this.fieldnames[6] = "IN955VISA";
/*  76 */     this.tagnames[6] = "IN955VISA";
/*     */      this.fields[6]=this.fieldIN955VISA=new CharacterField(this.message, 71, 16, "IN955VISA");
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalIN955AMT()
/*     */   {
/*  85 */     return this.fieldIN955AMT.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalIN955DAC()
/*     */   {
/*  92 */     return this.fieldIN955DAC.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public String getIN9552TYP()
/*     */   {
/*  99 */     return this.fieldIN9552TYP.getString();
/*     */   }
/*     */ 
/*     */   public String getIN9552USR()
/*     */   {
/* 106 */     return this.fieldIN9552USR.getString();
/*     */   }
/*     */ 
/*     */   public String getIN955AMT()
/*     */   {
/* 113 */     return this.fieldIN955AMT.getString();
/*     */   }
/*     */ 
/*     */   public String getIN955CCY()
/*     */   {
/* 120 */     return this.fieldIN955CCY.getString();
/*     */   }
/*     */ 
/*     */   public String getIN955DAC()
/*     */   {
/* 127 */     return this.fieldIN955DAC.getString();
/*     */   }
/*     */ 
/*     */   public String getIN955SAC()
/*     */   {
/* 134 */     return this.fieldIN955SAC.getString();
/*     */   }
/*     */ 
/*     */   public String getIN955VISA()
/*     */   {
/* 141 */     return this.fieldIN955VISA.getString();
/*     */   }
/*     */ 
/*     */   public void setIN9552TYP(String newvalue)
/*     */   {
/* 148 */     this.fieldIN9552TYP.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN9552USR(String newvalue)
/*     */   {
/* 155 */     this.fieldIN9552USR.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN955AMT(String newvalue)
/*     */   {
/* 162 */     this.fieldIN955AMT.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN955AMT(BigDecimal newvalue)
/*     */   {
/* 169 */     this.fieldIN955AMT.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN955CCY(String newvalue)
/*     */   {
/* 176 */     this.fieldIN955CCY.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN955DAC(String newvalue)
/*     */   {
/* 183 */     this.fieldIN955DAC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN955DAC(BigDecimal newvalue)
/*     */   {
/* 190 */     this.fieldIN955DAC.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN955SAC(String newvalue)
/*     */   {
/* 197 */     this.fieldIN955SAC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN955VISA(String newvalue)
/*     */   {
/* 204 */     this.fieldIN955VISA.setString(newvalue);
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.IN095502Message
 * JD-Core Version:    0.6.0
 */