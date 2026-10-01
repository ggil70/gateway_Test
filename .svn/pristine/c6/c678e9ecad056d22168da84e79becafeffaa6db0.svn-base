/*     */ package com.activo.gateway.dibs.messages;
/*     */ 
/*     */ import java.math.BigDecimal;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*     */ 
/*     */ public class IIN098601Message extends MessageRecord
/*     */ {
/*  19 */   final int FIELDCOUNT = 7;
/*  20 */   private CharacterField fieldIN9861USR = null;
/*  21 */   private CharacterField fieldIN9861CCN = null;
/*  22 */   private CharacterField fieldIN9861END = null;
/*  23 */   private CharacterField fieldIN9861FEC = null;
/*  24 */   private DecimalField fieldIN9861INI = null;
/*  25 */   private DecimalField fieldIN9861FIN = null;
/*  26 */   private CharacterField fieldIN9861TEXT = null;
/*     */ 
/*     */   public IIN098601Message()
/*     */   {
/*  33 */     createFields();
/*  34 */     initialize();
/*     */   }
/*     */ 
/*     */   protected void createFields()
/*     */   {
/*  42 */     this.recordsize = 190;
/*  43 */     this.fileid = "1010302130023";
/*  44 */     this.recordid = "4DB26F93AB67A";
/*  45 */     this.message = new byte[getByteLength()];
/*  46 */     this.formatname = "IIN098601";
/*  47 */     this.fieldnames = new String[7];
/*  48 */     this.tagnames = new String[7];
/*  49 */     this.fields = new MessageField[7];
/*     */ 
/*  51 */     this.fieldnames[0] = "IN9861USR";
/*  52 */     this.tagnames[0] = "IN9861USR";
/*     */      this.fields[0]=this.fieldIN9861USR=new CharacterField(this.message, 10, 10, "IN9861USR");
/*     */ 
/*  55 */     this.fieldnames[1] = "IN9861CCN";
/*  56 */     this.tagnames[1] = "IN9861CCN";
/*     */      this.fields[1]=this.fieldIN9861CCN=new CharacterField(this.message, 20, 19, "IN9861CCN");
/*     */ 
/*  59 */     this.fieldnames[2] = "IN9861END";
/*  60 */     this.tagnames[2] = "IN9861END";
/*     */      this.fields[2]=this.fieldIN9861END=new CharacterField(this.message, 39, 1, "IN9861END");
/*     */ 
/*  63 */     this.fieldnames[3] = "IN9861FEC";
/*  64 */     this.tagnames[3] = "IN9861FEC";
/*     */      this.fields[3]=this.fieldIN9861FEC=new CharacterField(this.message, 40, 10, "IN9861FEC");
/*     */ 
/*  67 */     this.fieldnames[4] = "IN9861INI";
/*  68 */     this.tagnames[4] = "IN9861INI";
/*     */      this.fields[4]=this.fieldIN9861INI=new DecimalField(this.message, 50, 9, 0, "IN9861INI");
/*     */ 
/*  71 */     this.fieldnames[5] = "IN9861FIN";
/*  72 */     this.tagnames[5] = "IN9861FIN";
/*     */      this.fields[5]=this.fieldIN9861FIN=new DecimalField(this.message, 59, 9, 0, "IN9861FIN");
/*     */ 
/*  75 */     this.fieldnames[6] = "IN9861TEXT";
/*  76 */     this.tagnames[6] = "IN9861TEXT";
/*     */      this.fields[6]=this.fieldIN9861TEXT=new CharacterField(this.message, 68, 132, "IN9861TEXT");
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalIN9861FIN()
/*     */   {
/*  85 */     return this.fieldIN9861FIN.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalIN9861INI()
/*     */   {
/*  92 */     return this.fieldIN9861INI.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public String getIN9861CCN()
/*     */   {
/*  99 */     return this.fieldIN9861CCN.getString();
/*     */   }
/*     */ 
/*     */   public String getIN9861END()
/*     */   {
/* 106 */     return this.fieldIN9861END.getString();
/*     */   }
/*     */ 
/*     */   public String getIN9861FEC()
/*     */   {
/* 113 */     return this.fieldIN9861FEC.getString();
/*     */   }
/*     */ 
/*     */   public String getIN9861FIN()
/*     */   {
/* 120 */     return this.fieldIN9861FIN.getString();
/*     */   }
/*     */ 
/*     */   public String getIN9861INI()
/*     */   {
/* 127 */     return this.fieldIN9861INI.getString();
/*     */   }
/*     */ 
/*     */   public String getIN9861TEXT()
/*     */   {
/* 134 */     return this.fieldIN9861TEXT.getString();
/*     */   }
/*     */ 
/*     */   public String getIN9861USR()
/*     */   {
/* 141 */     return this.fieldIN9861USR.getString();
/*     */   }
/*     */ 
/*     */   public void setIN9861CCN(String newvalue)
/*     */   {
/* 148 */     this.fieldIN9861CCN.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN9861END(String newvalue)
/*     */   {
/* 155 */     this.fieldIN9861END.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN9861FEC(String newvalue)
/*     */   {
/* 162 */     this.fieldIN9861FEC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN9861FIN(String newvalue)
/*     */   {
/* 169 */     this.fieldIN9861FIN.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN9861FIN(BigDecimal newvalue)
/*     */   {
/* 176 */     this.fieldIN9861FIN.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN9861INI(String newvalue)
/*     */   {
/* 183 */     this.fieldIN9861INI.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN9861INI(BigDecimal newvalue)
/*     */   {
/* 190 */     this.fieldIN9861INI.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN9861TEXT(String newvalue)
/*     */   {
/* 197 */     this.fieldIN9861TEXT.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN9861USR(String newvalue)
/*     */   {
/* 204 */     this.fieldIN9861USR.setString(newvalue);
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.IIN098601Message
 * JD-Core Version:    0.6.0
 */