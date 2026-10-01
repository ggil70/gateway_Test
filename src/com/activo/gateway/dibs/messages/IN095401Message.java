/*     */ package com.activo.gateway.dibs.messages;
/*     */ 
/*     */ import java.math.BigDecimal;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*     */ 
/*     */ public class IN095401Message extends MessageRecord
/*     */ {
/*  19 */   final int FIELDCOUNT = 10;
/*  20 */   private CharacterField fieldIN954USR = null;
/*  21 */   private DecimalField fieldIN954DAC = null;
/*  22 */   private CharacterField fieldIN954CCY = null;
/*  23 */   private DecimalField fieldIN954AMT = null;
/*  24 */   private CharacterField fieldIN954APL1 = null;
/*  25 */   private CharacterField fieldIN954BNE1 = null;
/*  26 */   private CharacterField fieldIN954BNE2 = null;
/*  27 */   private CharacterField fieldIN954BNF3 = null;
/*  28 */   private CharacterField fieldIN954DTP1 = null;
/*  29 */   private CharacterField fieldIN954DTP2 = null;
/*     */ 
/*     */   public IN095401Message()
/*     */   {
/*  36 */     createFields();
/*  37 */     initialize();
/*     */   }
/*     */ 
/*     */   protected void createFields()
/*     */   {
/*  45 */     this.recordsize = 228;
/*  46 */     this.fileid = "1000907181539";
/*  47 */     this.recordid = "2AB6F3171DBFE";
/*  48 */     this.message = new byte[getByteLength()];
/*  49 */     this.formatname = "IN095401";
/*  50 */     this.fieldnames = new String[10];
/*  51 */     this.tagnames = new String[10];
/*  52 */     this.fields = new MessageField[10];
/*     */ 
/*  54 */     this.fieldnames[0] = "IN954USR";
/*  55 */     this.tagnames[0] = "IN954USR";
/*     */      this.fields[0]=this.fieldIN954USR=new CharacterField(this.message, 10, 10, "IN954USR");
/*     */ 
/*  58 */     this.fieldnames[1] = "IN954DAC";
/*  59 */     this.tagnames[1] = "IN954DAC";
/*     */      this.fields[1]=this.fieldIN954DAC=new DecimalField(this.message, 20, 13, 0, "IN954DAC");
/*     */ 
/*  62 */     this.fieldnames[2] = "IN954CCY";
/*  63 */     this.tagnames[2] = "IN954CCY";
/*     */      this.fields[2]=this.fieldIN954CCY=new CharacterField(this.message, 33, 3, "IN954CCY");
/*     */ 
/*  66 */     this.fieldnames[3] = "IN954AMT";
/*  67 */     this.tagnames[3] = "IN954AMT";
/*     */      this.fields[3]=this.fieldIN954AMT=new DecimalField(this.message, 36, 17, 2, "IN954AMT");
/*     */ 
/*  70 */     this.fieldnames[4] = "IN954APL1";
/*  71 */     this.tagnames[4] = "IN954APL1";
/*     */      this.fields[4]=this.fieldIN954APL1=new CharacterField(this.message, 53, 35, "IN954APL1");
/*     */ 
/*  74 */     this.fieldnames[5] = "IN954BNE1";
/*  75 */     this.tagnames[5] = "IN954BNE1";
/*     */      this.fields[5]=this.fieldIN954BNE1=new CharacterField(this.message, 88, 30, "IN954BNE1");
/*     */ 
/*  78 */     this.fieldnames[6] = "IN954BNE2";
/*  79 */     this.tagnames[6] = "IN954BNE2";
/*     */      this.fields[6]=this.fieldIN954BNE2=new CharacterField(this.message, 118, 30, "IN954BNE2");
/*     */ 
/*  82 */     this.fieldnames[7] = "IN954BNF3";
/*  83 */     this.tagnames[7] = "IN954BNF3";
/*     */      this.fields[7]=this.fieldIN954BNF3=new CharacterField(this.message, 148, 30, "IN954BNF3");
/*     */ 
/*  86 */     this.fieldnames[8] = "IN954DTP1";
/*  87 */     this.tagnames[8] = "IN954DTP1";
/*     */      this.fields[8]=this.fieldIN954DTP1=new CharacterField(this.message, 178, 30, "IN954DTP1");
/*     */ 
/*  90 */     this.fieldnames[9] = "IN954DTP2";
/*  91 */     this.tagnames[9] = "IN954DTP2";
/*     */      this.fields[9]=this.fieldIN954DTP2=new CharacterField(this.message, 208, 30, "IN954DTP2");
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalIN954AMT()
/*     */   {
/* 100 */     return this.fieldIN954AMT.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalIN954DAC()
/*     */   {
/* 107 */     return this.fieldIN954DAC.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public String getIN954AMT()
/*     */   {
/* 114 */     return this.fieldIN954AMT.getString();
/*     */   }
/*     */ 
/*     */   public String getIN954APL1()
/*     */   {
/* 121 */     return this.fieldIN954APL1.getString();
/*     */   }
/*     */ 
/*     */   public String getIN954BNE1()
/*     */   {
/* 128 */     return this.fieldIN954BNE1.getString();
/*     */   }
/*     */ 
/*     */   public String getIN954BNE2()
/*     */   {
/* 135 */     return this.fieldIN954BNE2.getString();
/*     */   }
/*     */ 
/*     */   public String getIN954BNF3()
/*     */   {
/* 142 */     return this.fieldIN954BNF3.getString();
/*     */   }
/*     */ 
/*     */   public String getIN954CCY()
/*     */   {
/* 149 */     return this.fieldIN954CCY.getString();
/*     */   }
/*     */ 
/*     */   public String getIN954DAC()
/*     */   {
/* 156 */     return this.fieldIN954DAC.getString();
/*     */   }
/*     */ 
/*     */   public String getIN954DTP1()
/*     */   {
/* 163 */     return this.fieldIN954DTP1.getString();
/*     */   }
/*     */ 
/*     */   public String getIN954DTP2()
/*     */   {
/* 170 */     return this.fieldIN954DTP2.getString();
/*     */   }
/*     */ 
/*     */   public String getIN954USR()
/*     */   {
/* 177 */     return this.fieldIN954USR.getString();
/*     */   }
/*     */ 
/*     */   public void setIN954AMT(String newvalue)
/*     */   {
/* 184 */     this.fieldIN954AMT.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN954AMT(BigDecimal newvalue)
/*     */   {
/* 191 */     this.fieldIN954AMT.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN954APL1(String newvalue)
/*     */   {
/* 198 */     this.fieldIN954APL1.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN954BNE1(String newvalue)
/*     */   {
/* 205 */     this.fieldIN954BNE1.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN954BNE2(String newvalue)
/*     */   {
/* 212 */     this.fieldIN954BNE2.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN954BNF3(String newvalue)
/*     */   {
/* 219 */     this.fieldIN954BNF3.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN954CCY(String newvalue)
/*     */   {
/* 226 */     this.fieldIN954CCY.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN954DAC(String newvalue)
/*     */   {
/* 233 */     this.fieldIN954DAC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN954DAC(BigDecimal newvalue)
/*     */   {
/* 240 */     this.fieldIN954DAC.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN954DTP1(String newvalue)
/*     */   {
/* 247 */     this.fieldIN954DTP1.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN954DTP2(String newvalue)
/*     */   {
/* 254 */     this.fieldIN954DTP2.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN954USR(String newvalue)
/*     */   {
/* 261 */     this.fieldIN954USR.setString(newvalue);
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.IN095401Message
 * JD-Core Version:    0.6.0
 */