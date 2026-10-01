/*     */ package com.activo.gateway.dibs.messages;
/*     */ 
/*     */ import java.math.BigDecimal;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*     */ 
/*     */ public class TST005DSMessage extends MessageRecord
/*     */ {
/*  16 */   final int FIELDCOUNT = 22;
/*  17 */   private CharacterField fieldTSTUSR = null;
/*  18 */   private CharacterField fieldTSTNUM = null;
/*  19 */   private CharacterField fieldTSTCCY = null;
/*  20 */   private DecimalField fieldTSTCD1 = null;
/*  21 */   private DecimalField fieldTSTCD2 = null;
/*  22 */   private DecimalField fieldTSTCD3 = null;
/*  23 */   private DecimalField fieldTSTED1 = null;
/*  24 */   private DecimalField fieldTSTED2 = null;
/*  25 */   private DecimalField fieldTSTED3 = null;
/*  26 */   private DecimalField fieldTSTCRL = null;
/*  27 */   private DecimalField fieldTSTCAL = null;
/*  28 */   private DecimalField fieldTSTAVC = null;
/*  29 */   private DecimalField fieldTSTPM1 = null;
/*  30 */   private DecimalField fieldTSTPM2 = null;
/*  31 */   private DecimalField fieldTSTPM3 = null;
/*  32 */   private DecimalField fieldTSTPBL = null;
/*  33 */   private DecimalField fieldTSTPUR = null;
/*  34 */   private DecimalField fieldTSTPMT = null;
/*  35 */   private DecimalField fieldTSTFNC = null;
/*  36 */   private DecimalField fieldTSTLCH = null;
/*  37 */   private DecimalField fieldTSTBAL = null;
/*  38 */   private DecimalField fieldTSTRTE = null;
/*     */ 
/*     */   public TST005DSMessage()
/*     */   {
/*  45 */     createFields();
/*  46 */     initialize();
/*  47 */     setFormatNameBytes();
/*     */   }
/*     */ 
/*     */   protected void createFields()
/*     */   {
/*  55 */     this.recordsize = 221;
/*  56 */     this.message = new byte[getByteLength()];
/*  57 */     this.formatname = "TST005DS";
/*  58 */     this.fieldnames = new String[22];
/*  59 */     this.fields = new MessageField[22];
/*     */ 
/*  61 */     this.fieldnames[0] = "TSTUSR";
/*     */      this.fields[0]=this.fieldTSTUSR=new CharacterField(this.message, 10, 10);
/*     */ 
/*  64 */     this.fieldnames[1] = "TSTNUM";
/*     */      this.fields[1]=this.fieldTSTNUM=new CharacterField(this.message, 20, 17);
/*     */ 
/*  67 */     this.fieldnames[2] = "TSTCCY";
/*     */      this.fields[2]=this.fieldTSTCCY=new CharacterField(this.message, 37, 3);
/*     */ 
/*  70 */     this.fieldnames[3] = "TSTCD1";
/*     */      this.fields[3]=this.fieldTSTCD1=new DecimalField(this.message, 40, 3, 0);
/*     */ 
/*  73 */     this.fieldnames[4] = "TSTCD2";
/*     */      this.fields[4]=this.fieldTSTCD2=new DecimalField(this.message, 43, 3, 0);
/*     */ 
/*  76 */     this.fieldnames[5] = "TSTCD3";
/*     */      this.fields[5]=this.fieldTSTCD3=new DecimalField(this.message, 46, 3, 0);
/*     */ 
/*  79 */     this.fieldnames[6] = "TSTED1";
/*     */      this.fields[6]=this.fieldTSTED1=new DecimalField(this.message, 49, 3, 0);
/*     */ 
/*  82 */     this.fieldnames[7] = "TSTED2";
/*     */      this.fields[7]=this.fieldTSTED2=new DecimalField(this.message, 52, 3, 0);
/*     */ 
/*  85 */     this.fieldnames[8] = "TSTED3";
/*     */      this.fields[8]=this.fieldTSTED3=new DecimalField(this.message, 55, 3, 0);
/*     */ 
/*  88 */     this.fieldnames[9] = "TSTCRL";
/*     */      this.fields[9]=this.fieldTSTCRL=new DecimalField(this.message, 58, 17, 2);
/*     */ 
/*  91 */     this.fieldnames[10] = "TSTCAL";
/*     */      this.fields[10]=this.fieldTSTCAL=new DecimalField(this.message, 75, 17, 2);
/*     */ 
/*  94 */     this.fieldnames[11] = "TSTAVC";
/*     */      this.fields[11]=this.fieldTSTAVC=new DecimalField(this.message, 92, 17, 2);
/*     */ 
/*  97 */     this.fieldnames[12] = "TSTPM1";
/*     */      this.fields[12]=this.fieldTSTPM1=new DecimalField(this.message, 109, 3, 0);
/*     */ 
/* 100 */     this.fieldnames[13] = "TSTPM2";
/*     */      this.fields[13]=this.fieldTSTPM2=new DecimalField(this.message, 112, 3, 0);
/*     */ 
/* 103 */     this.fieldnames[14] = "TSTPM3";
/*     */      this.fields[14]=this.fieldTSTPM3=new DecimalField(this.message, 115, 3, 0);
/*     */ 
/* 106 */     this.fieldnames[15] = "TSTPBL";
/*     */      this.fields[15]=this.fieldTSTPBL=new DecimalField(this.message, 118, 17, 2);
/*     */ 
/* 109 */     this.fieldnames[16] = "TSTPUR";
/*     */      this.fields[16]=this.fieldTSTPUR=new DecimalField(this.message, 135, 17, 2);
/*     */ 
/* 112 */     this.fieldnames[17] = "TSTPMT";
/*     */      this.fields[17]=this.fieldTSTPMT=new DecimalField(this.message, 152, 17, 2);
/*     */ 
/* 115 */     this.fieldnames[18] = "TSTFNC";
/*     */      this.fields[18]=this.fieldTSTFNC=new DecimalField(this.message, 169, 17, 2);
/*     */ 
/* 118 */     this.fieldnames[19] = "TSTLCH";
/*     */      this.fields[19]=this.fieldTSTLCH=new DecimalField(this.message, 186, 17, 2);
/*     */ 
/* 121 */     this.fieldnames[20] = "TSTBAL";
/*     */      this.fields[20]=this.fieldTSTBAL=new DecimalField(this.message, 203, 17, 2);
/*     */ 
/* 124 */     this.fieldnames[21] = "TSTRTE";
/*     */      this.fields[21]=this.fieldTSTRTE=new DecimalField(this.message, 220, 11, 6);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalTSTAVC()
/*     */   {
/* 133 */     return this.fieldTSTAVC.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalTSTBAL()
/*     */   {
/* 140 */     return this.fieldTSTBAL.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalTSTCAL()
/*     */   {
/* 147 */     return this.fieldTSTCAL.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalTSTCD1()
/*     */   {
/* 154 */     return this.fieldTSTCD1.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalTSTCD2()
/*     */   {
/* 161 */     return this.fieldTSTCD2.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalTSTCD3()
/*     */   {
/* 168 */     return this.fieldTSTCD3.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalTSTCRL()
/*     */   {
/* 175 */     return this.fieldTSTCRL.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalTSTED1()
/*     */   {
/* 182 */     return this.fieldTSTED1.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalTSTED2()
/*     */   {
/* 189 */     return this.fieldTSTED2.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalTSTED3()
/*     */   {
/* 196 */     return this.fieldTSTED3.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalTSTFNC()
/*     */   {
/* 203 */     return this.fieldTSTFNC.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalTSTLCH()
/*     */   {
/* 210 */     return this.fieldTSTLCH.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalTSTPBL()
/*     */   {
/* 217 */     return this.fieldTSTPBL.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalTSTPM1()
/*     */   {
/* 224 */     return this.fieldTSTPM1.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalTSTPM2()
/*     */   {
/* 231 */     return this.fieldTSTPM2.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalTSTPM3()
/*     */   {
/* 238 */     return this.fieldTSTPM3.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalTSTPMT()
/*     */   {
/* 245 */     return this.fieldTSTPMT.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalTSTPUR()
/*     */   {
/* 252 */     return this.fieldTSTPUR.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalTSTRTE()
/*     */   {
/* 259 */     return this.fieldTSTRTE.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public String getTSTAVC()
/*     */   {
/* 266 */     return this.fieldTSTAVC.getString();
/*     */   }
/*     */ 
/*     */   public String getTSTBAL()
/*     */   {
/* 273 */     return this.fieldTSTBAL.getString();
/*     */   }
/*     */ 
/*     */   public String getTSTCAL()
/*     */   {
/* 280 */     return this.fieldTSTCAL.getString();
/*     */   }
/*     */ 
/*     */   public String getTSTCCY()
/*     */   {
/* 287 */     return this.fieldTSTCCY.getString();
/*     */   }
/*     */ 
/*     */   public String getTSTCD1()
/*     */   {
/* 294 */     return this.fieldTSTCD1.getString();
/*     */   }
/*     */ 
/*     */   public String getTSTCD2()
/*     */   {
/* 301 */     return this.fieldTSTCD2.getString();
/*     */   }
/*     */ 
/*     */   public String getTSTCD3()
/*     */   {
/* 308 */     return this.fieldTSTCD3.getString();
/*     */   }
/*     */ 
/*     */   public String getTSTCRL()
/*     */   {
/* 315 */     return this.fieldTSTCRL.getString();
/*     */   }
/*     */ 
/*     */   public String getTSTED1()
/*     */   {
/* 322 */     return this.fieldTSTED1.getString();
/*     */   }
/*     */ 
/*     */   public String getTSTED2()
/*     */   {
/* 329 */     return this.fieldTSTED2.getString();
/*     */   }
/*     */ 
/*     */   public String getTSTED3()
/*     */   {
/* 336 */     return this.fieldTSTED3.getString();
/*     */   }
/*     */ 
/*     */   public String getTSTFNC()
/*     */   {
/* 343 */     return this.fieldTSTFNC.getString();
/*     */   }
/*     */ 
/*     */   public String getTSTLCH()
/*     */   {
/* 350 */     return this.fieldTSTLCH.getString();
/*     */   }
/*     */ 
/*     */   public String getTSTNUM()
/*     */   {
/* 357 */     return this.fieldTSTNUM.getString();
/*     */   }
/*     */ 
/*     */   public String getTSTPBL()
/*     */   {
/* 364 */     return this.fieldTSTPBL.getString();
/*     */   }
/*     */ 
/*     */   public String getTSTPM1()
/*     */   {
/* 371 */     return this.fieldTSTPM1.getString();
/*     */   }
/*     */ 
/*     */   public String getTSTPM2()
/*     */   {
/* 378 */     return this.fieldTSTPM2.getString();
/*     */   }
/*     */ 
/*     */   public String getTSTPM3()
/*     */   {
/* 385 */     return this.fieldTSTPM3.getString();
/*     */   }
/*     */ 
/*     */   public String getTSTPMT()
/*     */   {
/* 392 */     return this.fieldTSTPMT.getString();
/*     */   }
/*     */ 
/*     */   public String getTSTPUR()
/*     */   {
/* 399 */     return this.fieldTSTPUR.getString();
/*     */   }
/*     */ 
/*     */   public String getTSTRTE()
/*     */   {
/* 406 */     return this.fieldTSTRTE.getString();
/*     */   }
/*     */ 
/*     */   public String getTSTUSR()
/*     */   {
/* 413 */     return this.fieldTSTUSR.getString();
/*     */   }
/*     */ 
/*     */   public void setTSTAVC(String newvalue)
/*     */   {
/* 420 */     this.fieldTSTAVC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setTSTAVC(BigDecimal newvalue)
/*     */   {
/* 427 */     this.fieldTSTAVC.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setTSTBAL(String newvalue)
/*     */   {
/* 434 */     this.fieldTSTBAL.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setTSTBAL(BigDecimal newvalue)
/*     */   {
/* 441 */     this.fieldTSTBAL.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setTSTCAL(String newvalue)
/*     */   {
/* 448 */     this.fieldTSTCAL.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setTSTCAL(BigDecimal newvalue)
/*     */   {
/* 455 */     this.fieldTSTCAL.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setTSTCCY(String newvalue)
/*     */   {
/* 462 */     this.fieldTSTCCY.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setTSTCD1(String newvalue)
/*     */   {
/* 469 */     this.fieldTSTCD1.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setTSTCD1(BigDecimal newvalue)
/*     */   {
/* 476 */     this.fieldTSTCD1.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setTSTCD2(String newvalue)
/*     */   {
/* 483 */     this.fieldTSTCD2.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setTSTCD2(BigDecimal newvalue)
/*     */   {
/* 490 */     this.fieldTSTCD2.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setTSTCD3(String newvalue)
/*     */   {
/* 497 */     this.fieldTSTCD3.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setTSTCD3(BigDecimal newvalue)
/*     */   {
/* 504 */     this.fieldTSTCD3.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setTSTCRL(String newvalue)
/*     */   {
/* 511 */     this.fieldTSTCRL.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setTSTCRL(BigDecimal newvalue)
/*     */   {
/* 518 */     this.fieldTSTCRL.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setTSTED1(String newvalue)
/*     */   {
/* 525 */     this.fieldTSTED1.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setTSTED1(BigDecimal newvalue)
/*     */   {
/* 532 */     this.fieldTSTED1.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setTSTED2(String newvalue)
/*     */   {
/* 539 */     this.fieldTSTED2.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setTSTED2(BigDecimal newvalue)
/*     */   {
/* 546 */     this.fieldTSTED2.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setTSTED3(String newvalue)
/*     */   {
/* 553 */     this.fieldTSTED3.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setTSTED3(BigDecimal newvalue)
/*     */   {
/* 560 */     this.fieldTSTED3.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setTSTFNC(String newvalue)
/*     */   {
/* 567 */     this.fieldTSTFNC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setTSTFNC(BigDecimal newvalue)
/*     */   {
/* 574 */     this.fieldTSTFNC.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setTSTLCH(String newvalue)
/*     */   {
/* 581 */     this.fieldTSTLCH.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setTSTLCH(BigDecimal newvalue)
/*     */   {
/* 588 */     this.fieldTSTLCH.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setTSTNUM(String newvalue)
/*     */   {
/* 595 */     this.fieldTSTNUM.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setTSTPBL(String newvalue)
/*     */   {
/* 602 */     this.fieldTSTPBL.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setTSTPBL(BigDecimal newvalue)
/*     */   {
/* 609 */     this.fieldTSTPBL.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setTSTPM1(String newvalue)
/*     */   {
/* 616 */     this.fieldTSTPM1.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setTSTPM1(BigDecimal newvalue)
/*     */   {
/* 623 */     this.fieldTSTPM1.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setTSTPM2(String newvalue)
/*     */   {
/* 630 */     this.fieldTSTPM2.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setTSTPM2(BigDecimal newvalue)
/*     */   {
/* 637 */     this.fieldTSTPM2.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setTSTPM3(String newvalue)
/*     */   {
/* 644 */     this.fieldTSTPM3.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setTSTPM3(BigDecimal newvalue)
/*     */   {
/* 651 */     this.fieldTSTPM3.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setTSTPMT(String newvalue)
/*     */   {
/* 658 */     this.fieldTSTPMT.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setTSTPMT(BigDecimal newvalue)
/*     */   {
/* 665 */     this.fieldTSTPMT.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setTSTPUR(String newvalue)
/*     */   {
/* 672 */     this.fieldTSTPUR.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setTSTPUR(BigDecimal newvalue)
/*     */   {
/* 679 */     this.fieldTSTPUR.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setTSTRTE(String newvalue)
/*     */   {
/* 686 */     this.fieldTSTRTE.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setTSTRTE(BigDecimal newvalue)
/*     */   {
/* 693 */     this.fieldTSTRTE.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setTSTUSR(String newvalue)
/*     */   {
/* 700 */     this.fieldTSTUSR.setString(newvalue);
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.TST005DSMessage
 * JD-Core Version:    0.6.0
 */