/*     */ package com.activo.gateway.dibs.messages;
/*     */ 
/*     */ import java.math.BigDecimal;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*     */ 
/*     */ public class IIN098600Message extends MessageRecord
/*     */ {
/*  19 */   final int FIELDCOUNT = 6;
/*  20 */   private CharacterField fieldIN9860USR = null;
/*  21 */   private CharacterField fieldIN9860CCN = null;
/*  22 */   private CharacterField fieldIN9860END = null;
/*  23 */   private CharacterField fieldIN9860FEC = null;
/*  24 */   private DecimalField fieldIN9860INI = null;
/*  25 */   private DecimalField fieldIN9860FIN = null;
/*     */ 
/*     */   public IIN098600Message()
/*     */   {
/*  32 */     createFields();
/*  33 */     initialize();
/*     */   }
/*     */ 
/*     */   protected void createFields()
/*     */   {
/*  41 */     this.recordsize = 58;
/*  42 */     this.fileid = "1010302132616";
/*  43 */     this.recordid = "41A853C7C585C";
/*  44 */     this.message = new byte[getByteLength()];
/*  45 */     this.formatname = "IIN098600";
/*  46 */     this.fieldnames = new String[6];
/*  47 */     this.tagnames = new String[6];
/*  48 */     this.fields = new MessageField[6];
/*     */ 
/*  50 */     this.fieldnames[0] = "IN9860USR";
/*  51 */     this.tagnames[0] = "IN9860USR";
/*     */      this.fields[0]=this.fieldIN9860USR=new CharacterField(this.message, 10, 10, "IN9860USR");
/*     */ 
/*  54 */     this.fieldnames[1] = "IN9860CCN";
/*  55 */     this.tagnames[1] = "IN9860CCN";
/*     */      this.fields[1]=this.fieldIN9860CCN=new CharacterField(this.message, 20, 19, "IN9860CCN");
/*     */ 
/*  58 */     this.fieldnames[2] = "IN9860END";
/*  59 */     this.tagnames[2] = "IN9860END";
/*     */      this.fields[2]=this.fieldIN9860END=new CharacterField(this.message, 39, 1, "IN9860END");
/*     */ 
/*  62 */     this.fieldnames[3] = "IN9860FEC";
/*  63 */     this.tagnames[3] = "IN9860FEC";
/*     */      this.fields[3]=this.fieldIN9860FEC=new CharacterField(this.message, 40, 10, "IN9860FEC");
/*     */ 
/*  66 */     this.fieldnames[4] = "IN9860INI";
/*  67 */     this.tagnames[4] = "IN9860INI";
/*     */      this.fields[4]=this.fieldIN9860INI=new DecimalField(this.message, 50, 9, 0, "IN9860INI");
/*     */ 
/*  70 */     this.fieldnames[5] = "IN9860FIN";
/*  71 */     this.tagnames[5] = "IN9860FIN";
/*     */      this.fields[5]=this.fieldIN9860FIN=new DecimalField(this.message, 59, 9, 0, "IN9860FIN");
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalIN9860FIN()
/*     */   {
/*  80 */     return this.fieldIN9860FIN.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalIN9860INI()
/*     */   {
/*  87 */     return this.fieldIN9860INI.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public String getIN9860CCN()
/*     */   {
/*  94 */     return this.fieldIN9860CCN.getString();
/*     */   }
/*     */ 
/*     */   public String getIN9860END()
/*     */   {
/* 101 */     return this.fieldIN9860END.getString();
/*     */   }
/*     */ 
/*     */   public String getIN9860FEC()
/*     */   {
/* 108 */     return this.fieldIN9860FEC.getString();
/*     */   }
/*     */ 
/*     */   public String getIN9860FIN()
/*     */   {
/* 115 */     return this.fieldIN9860FIN.getString();
/*     */   }
/*     */ 
/*     */   public String getIN9860INI()
/*     */   {
/* 122 */     return this.fieldIN9860INI.getString();
/*     */   }
/*     */ 
/*     */   public String getIN9860USR()
/*     */   {
/* 129 */     return this.fieldIN9860USR.getString();
/*     */   }
/*     */ 
/*     */   public void setIN9860CCN(String newvalue)
/*     */   {
/* 136 */     this.fieldIN9860CCN.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN9860END(String newvalue)
/*     */   {
/* 143 */     this.fieldIN9860END.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN9860FEC(String newvalue)
/*     */   {
/* 150 */     this.fieldIN9860FEC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN9860FIN(String newvalue)
/*     */   {
/* 157 */     this.fieldIN9860FIN.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN9860FIN(BigDecimal newvalue)
/*     */   {
/* 164 */     this.fieldIN9860FIN.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN9860INI(String newvalue)
/*     */   {
/* 171 */     this.fieldIN9860INI.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN9860INI(BigDecimal newvalue)
/*     */   {
/* 178 */     this.fieldIN9860INI.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN9860USR(String newvalue)
/*     */   {
/* 185 */     this.fieldIN9860USR.setString(newvalue);
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.IIN098600Message
 * JD-Core Version:    0.6.0
 */