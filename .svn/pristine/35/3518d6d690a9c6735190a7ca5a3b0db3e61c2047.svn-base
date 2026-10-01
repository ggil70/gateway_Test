/*     */ package com.activo.gateway.dibs.messages;
/*     */ 
/*     */ import java.math.BigDecimal;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*     */ 
/*     */ public class BNKSRDSJVMessage extends MessageRecord
/*     */ {
/*  20 */   final int FIELDCOUNT = 18;
/*  21 */   private CharacterField fieldBNKUSR = null;
/*  22 */   private CharacterField fieldBNKPVI = null;
/*  23 */   private DecimalField fieldBNKFRC = null;
/*  24 */   private CharacterField fieldBNKID = null;
/*  25 */   private CharacterField fieldBNKNME = null;
/*  26 */   private CharacterField fieldBNKAD1 = null;
/*  27 */   private CharacterField fieldBNKCTY = null;
/*  28 */   private CharacterField fieldBNKSTA = null;
/*  29 */   private CharacterField fieldBNKCTR = null;
/*  30 */   private DecimalField fieldBNKBRN = null;
/*  31 */   private CharacterField fieldBNKIN1 = null;
/*  32 */   private CharacterField fieldBNKIN2 = null;
/*  33 */   private CharacterField fieldBNKIN3 = null;
/*  34 */   private CharacterField fieldBNKIN4 = null;
/*  35 */   private CharacterField fieldBNKIN5 = null;
/*  36 */   private CharacterField fieldBNKIN6 = null;
/*  37 */   private DecimalField fieldBNKREC = null;
/*  38 */   private CharacterField fieldBNKRUD = null;
/*     */ 
/*     */   public BNKSRDSJVMessage()
/*     */   {
/*  45 */     createFields();
/*  46 */     initialize();
/*     */   }
/*     */ 
/*     */   protected void createFields()
/*     */   {
/*  55 */     this.recordsize = 305;
/*  56 */     this.fileid = "1040914164819";
/*  57 */     this.recordid = "475FBDE3163BA";
/*  58 */     this.message = new byte[getByteLength()];
/*  59 */     this.formatname = "BNKSRDSJV";
/*  60 */     this.fieldnames = new String[18];
/*  61 */     this.tagnames = new String[18];
/*  62 */     this.fields = new MessageField[18];
/*     */ 
/*  64 */     this.fieldnames[0] = "BNKUSR";
/*  65 */     this.tagnames[0] = "BNKUSR";
/*     */      this.fields[0]=this.fieldBNKUSR=new CharacterField(this.message, 10, 10, "BNKUSR");
/*     */ 
/*  68 */     this.fieldnames[1] = "BNKPVI";
/*  69 */     this.tagnames[1] = "BNKPVI";
/*     */      this.fields[1]=this.fieldBNKPVI=new CharacterField(this.message, 20, 1, "BNKPVI");
/*     */ 
/*  72 */     this.fieldnames[2] = "BNKFRC";
/*  73 */     this.tagnames[2] = "BNKFRC";
/*     */      this.fields[2]=this.fieldBNKFRC=new DecimalField(this.message, 21, 8, 0, "BNKFRC");
/*     */ 
/*  76 */     this.fieldnames[3] = "BNKID";
/*  77 */     this.tagnames[3] = "BNKID";
/*     */      this.fields[3]=this.fieldBNKID=new CharacterField(this.message, 29, 12, "BNKID");
/*     */ 
/*  80 */     this.fieldnames[4] = "BNKNME";
/*  81 */     this.tagnames[4] = "BNKNME";
/*     */      this.fields[4]=this.fieldBNKNME=new CharacterField(this.message, 41, 35, "BNKNME");
/*     */ 
/*  84 */     this.fieldnames[5] = "BNKAD1";
/*  85 */     this.tagnames[5] = "BNKAD1";
/*     */      this.fields[5]=this.fieldBNKAD1=new CharacterField(this.message, 76, 35, "BNKAD1");
/*     */ 
/*  88 */     this.fieldnames[6] = "BNKCTY";
/*  89 */     this.tagnames[6] = "BNKCTY";
/*     */      this.fields[6]=this.fieldBNKCTY=new CharacterField(this.message, 111, 30, "BNKCTY");
/*     */ 
/*  92 */     this.fieldnames[7] = "BNKSTA";
/*  93 */     this.tagnames[7] = "BNKSTA";
/*     */      this.fields[7]=this.fieldBNKSTA=new CharacterField(this.message, 141, 4, "BNKSTA");
/*     */ 
/*  96 */     this.fieldnames[8] = "BNKCTR";
/*  97 */     this.tagnames[8] = "BNKCTR";
/*     */      this.fields[8]=this.fieldBNKCTR=new CharacterField(this.message, 145, 20, "BNKCTR");
/*     */ 
/* 100 */     this.fieldnames[9] = "BNKBRN";
/* 101 */     this.tagnames[9] = "BNKBRN";
/*     */      this.fields[9]=this.fieldBNKBRN=new DecimalField(this.message, 165, 5, 0, "BNKBRN");
/*     */ 
/* 104 */     this.fieldnames[10] = "BNKIN1";
/* 105 */     this.tagnames[10] = "BNKIN1";
/*     */      this.fields[10]=this.fieldBNKIN1=new CharacterField(this.message, 170, 35, "BNKIN1");
/*     */ 
/* 108 */     this.fieldnames[11] = "BNKIN2";
/* 109 */     this.tagnames[11] = "BNKIN2";
/*     */      this.fields[11]=this.fieldBNKIN2=new CharacterField(this.message, 205, 35, "BNKIN2");
/*     */ 
/* 112 */     this.fieldnames[12] = "BNKIN3";
/* 113 */     this.tagnames[12] = "BNKIN3";
/*     */      this.fields[12]=this.fieldBNKIN3=new CharacterField(this.message, 240, 30, "BNKIN3");
/*     */ 
/* 116 */     this.fieldnames[13] = "BNKIN4";
/* 117 */     this.tagnames[13] = "BNKIN4";
/*     */      this.fields[13]=this.fieldBNKIN4=new CharacterField(this.message, 270, 4, "BNKIN4");
/*     */ 
/* 120 */     this.fieldnames[14] = "BNKIN5";
/* 121 */     this.tagnames[14] = "BNKIN5";
/*     */      this.fields[14]=this.fieldBNKIN5=new CharacterField(this.message, 274, 20, "BNKIN5");
/*     */ 
/* 124 */     this.fieldnames[15] = "BNKIN6";
/* 125 */     this.tagnames[15] = "BNKIN6";
/*     */      this.fields[15]=this.fieldBNKIN6=new CharacterField(this.message, 294, 12, "BNKIN6");
/*     */ 
/* 128 */     this.fieldnames[16] = "BNKREC";
/* 129 */     this.tagnames[16] = "BNKREC";
/*     */      this.fields[16]=this.fieldBNKREC=new DecimalField(this.message, 306, 8, 0, "BNKREC");
/*     */ 
/* 132 */     this.fieldnames[17] = "BNKRUD";
/* 133 */     this.tagnames[17] = "BNKRUD";
/*     */      this.fields[17]=this.fieldBNKRUD=new CharacterField(this.message, 314, 1, "BNKRUD");
/*     */   }
/*     */ 
/*     */   public void setBNKUSR(String newvalue)
/*     */   {
/* 143 */     this.fieldBNKUSR.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getBNKUSR()
/*     */   {
/* 151 */     return this.fieldBNKUSR.getString();
/*     */   }
/*     */ 
/*     */   public void setBNKPVI(String newvalue)
/*     */   {
/* 159 */     this.fieldBNKPVI.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getBNKPVI()
/*     */   {
/* 167 */     return this.fieldBNKPVI.getString();
/*     */   }
/*     */ 
/*     */   public void setBNKFRC(String newvalue)
/*     */   {
/* 175 */     this.fieldBNKFRC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getBNKFRC()
/*     */   {
/* 183 */     return this.fieldBNKFRC.getString();
/*     */   }
/*     */ 
/*     */   public void setBNKFRC(BigDecimal newvalue)
/*     */   {
/* 191 */     this.fieldBNKFRC.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalBNKFRC()
/*     */   {
/* 199 */     return this.fieldBNKFRC.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setBNKID(String newvalue)
/*     */   {
/* 207 */     this.fieldBNKID.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getBNKID()
/*     */   {
/* 215 */     return this.fieldBNKID.getString();
/*     */   }
/*     */ 
/*     */   public void setBNKNME(String newvalue)
/*     */   {
/* 223 */     this.fieldBNKNME.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getBNKNME()
/*     */   {
/* 231 */     return this.fieldBNKNME.getString();
/*     */   }
/*     */ 
/*     */   public void setBNKAD1(String newvalue)
/*     */   {
/* 239 */     this.fieldBNKAD1.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getBNKAD1()
/*     */   {
/* 247 */     return this.fieldBNKAD1.getString();
/*     */   }
/*     */ 
/*     */   public void setBNKCTY(String newvalue)
/*     */   {
/* 255 */     this.fieldBNKCTY.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getBNKCTY()
/*     */   {
/* 263 */     return this.fieldBNKCTY.getString();
/*     */   }
/*     */ 
/*     */   public void setBNKSTA(String newvalue)
/*     */   {
/* 271 */     this.fieldBNKSTA.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getBNKSTA()
/*     */   {
/* 279 */     return this.fieldBNKSTA.getString();
/*     */   }
/*     */ 
/*     */   public void setBNKCTR(String newvalue)
/*     */   {
/* 287 */     this.fieldBNKCTR.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getBNKCTR()
/*     */   {
/* 295 */     return this.fieldBNKCTR.getString();
/*     */   }
/*     */ 
/*     */   public void setBNKBRN(String newvalue)
/*     */   {
/* 303 */     this.fieldBNKBRN.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getBNKBRN()
/*     */   {
/* 311 */     return this.fieldBNKBRN.getString();
/*     */   }
/*     */ 
/*     */   public void setBNKBRN(BigDecimal newvalue)
/*     */   {
/* 319 */     this.fieldBNKBRN.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalBNKBRN()
/*     */   {
/* 327 */     return this.fieldBNKBRN.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setBNKIN1(String newvalue)
/*     */   {
/* 335 */     this.fieldBNKIN1.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getBNKIN1()
/*     */   {
/* 343 */     return this.fieldBNKIN1.getString();
/*     */   }
/*     */ 
/*     */   public void setBNKIN2(String newvalue)
/*     */   {
/* 351 */     this.fieldBNKIN2.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getBNKIN2()
/*     */   {
/* 359 */     return this.fieldBNKIN2.getString();
/*     */   }
/*     */ 
/*     */   public void setBNKIN3(String newvalue)
/*     */   {
/* 367 */     this.fieldBNKIN3.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getBNKIN3()
/*     */   {
/* 375 */     return this.fieldBNKIN3.getString();
/*     */   }
/*     */ 
/*     */   public void setBNKIN4(String newvalue)
/*     */   {
/* 383 */     this.fieldBNKIN4.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getBNKIN4()
/*     */   {
/* 391 */     return this.fieldBNKIN4.getString();
/*     */   }
/*     */ 
/*     */   public void setBNKIN5(String newvalue)
/*     */   {
/* 399 */     this.fieldBNKIN5.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getBNKIN5()
/*     */   {
/* 407 */     return this.fieldBNKIN5.getString();
/*     */   }
/*     */ 
/*     */   public void setBNKIN6(String newvalue)
/*     */   {
/* 415 */     this.fieldBNKIN6.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getBNKIN6()
/*     */   {
/* 423 */     return this.fieldBNKIN6.getString();
/*     */   }
/*     */ 
/*     */   public void setBNKREC(String newvalue)
/*     */   {
/* 431 */     this.fieldBNKREC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getBNKREC()
/*     */   {
/* 439 */     return this.fieldBNKREC.getString();
/*     */   }
/*     */ 
/*     */   public void setBNKREC(BigDecimal newvalue)
/*     */   {
/* 447 */     this.fieldBNKREC.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalBNKREC()
/*     */   {
/* 455 */     return this.fieldBNKREC.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setBNKRUD(String newvalue)
/*     */   {
/* 463 */     this.fieldBNKRUD.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getBNKRUD()
/*     */   {
/* 471 */     return this.fieldBNKRUD.getString();
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.BNKSRDSJVMessage
 * JD-Core Version:    0.6.0
 */