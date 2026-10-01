/*     */ package com.activo.gateway.dibs.messages;
/*     */ 
/*     */ import java.math.BigDecimal;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*     */ 
/*     */ public class FEMSTDSJVMessage extends MessageRecord
/*     */ {
/*  16 */   final int FIELDCOUNT = 16;
/*  17 */   private CharacterField fieldFEMUSER = null;
/*  18 */   private DecimalField fieldFEMFEMACC = null;
/*  19 */   private CharacterField fieldFEMFEMCCY = null;
/*  20 */   private DecimalField fieldFEMFEMSOA = null;
/*  21 */   private DecimalField fieldFEMFEMEXR = null;
/*  22 */   private DecimalField fieldFEMFEMDD1 = null;
/*  23 */   private DecimalField fieldFEMFEMDD2 = null;
/*  24 */   private DecimalField fieldFEMFEMDD3 = null;
/*  25 */   private DecimalField fieldFEMFEMVD1 = null;
/*  26 */   private DecimalField fieldFEMFEMVD2 = null;
/*  27 */   private DecimalField fieldFEMFEMVD3 = null;
/*  28 */   private CharacterField fieldFEMFEMDCY = null;
/*  29 */   private DecimalField fieldFEMFEMDOA = null;
/*  30 */   private DecimalField fieldFEMFEMDEX = null;
/*  31 */   private CharacterField fieldFEMFEMTHR = null;
/*  32 */   private CharacterField fieldFEMFEMPTP = null;
/*     */ 
/*     */   public FEMSTDSJVMessage()
/*     */   {
/*  39 */     createFields();
/*  40 */     initialize();
/*  41 */     setFormatNameBytes();
/*     */   }
/*     */ 
/*     */   protected void createFields()
/*     */   {
/*  49 */     this.recordsize = 123;
/*  50 */     this.message = new byte[getByteLength()];
/*  51 */     this.formatname = "FEMSTDSJV";
/*  52 */     this.fieldnames = new String[16];
/*  53 */     this.fields = new MessageField[16];
/*     */ 
/*  55 */     this.fieldnames[0] = "FEMUSER";
/*     */      this.fields[0]=this.fieldFEMUSER=new CharacterField(this.message, 10, 10);
/*     */ 
/*  58 */     this.fieldnames[1] = "FEMFEMACC";
/*     */      this.fields[1]=this.fieldFEMFEMACC=new DecimalField(this.message, 20, 13, 0);
/*     */ 
/*  61 */     this.fieldnames[2] = "FEMFEMCCY";
/*     */      this.fields[2]=this.fieldFEMFEMCCY=new CharacterField(this.message, 33, 3);
/*     */ 
/*  64 */     this.fieldnames[3] = "FEMFEMSOA";
/*     */      this.fields[3]=this.fieldFEMFEMSOA=new DecimalField(this.message, 36, 17, 2);
/*     */ 
/*  67 */     this.fieldnames[4] = "FEMFEMEXR";
/*     */      this.fields[4]=this.fieldFEMFEMEXR=new DecimalField(this.message, 53, 13, 6);
/*     */ 
/*  70 */     this.fieldnames[5] = "FEMFEMDD1";
/*     */      this.fields[5]=this.fieldFEMFEMDD1=new DecimalField(this.message, 66, 3, 0);
/*     */ 
/*  73 */     this.fieldnames[6] = "FEMFEMDD2";
/*     */      this.fields[6]=this.fieldFEMFEMDD2=new DecimalField(this.message, 69, 3, 0);
/*     */ 
/*  76 */     this.fieldnames[7] = "FEMFEMDD3";
/*     */      this.fields[7]=this.fieldFEMFEMDD3=new DecimalField(this.message, 72, 3, 0);
/*     */ 
/*  79 */     this.fieldnames[8] = "FEMFEMVD1";
/*     */      this.fields[8]=this.fieldFEMFEMVD1=new DecimalField(this.message, 75, 3, 0);
/*     */ 
/*  82 */     this.fieldnames[9] = "FEMFEMVD2";
/*     */      this.fields[9]=this.fieldFEMFEMVD2=new DecimalField(this.message, 78, 3, 0);
/*     */ 
/*  85 */     this.fieldnames[10] = "FEMFEMVD3";
/*     */      this.fields[10]=this.fieldFEMFEMVD3=new DecimalField(this.message, 81, 3, 0);
/*     */ 
/*  88 */     this.fieldnames[11] = "FEMFEMDCY";
/*     */      this.fields[11]=this.fieldFEMFEMDCY=new CharacterField(this.message, 84, 3);
/*     */ 
/*  91 */     this.fieldnames[12] = "FEMFEMDOA";
/*     */      this.fields[12]=this.fieldFEMFEMDOA=new DecimalField(this.message, 87, 17, 2);
/*     */ 
/*  94 */     this.fieldnames[13] = "FEMFEMDEX";
/*     */      this.fields[13]=this.fieldFEMFEMDEX=new DecimalField(this.message, 104, 13, 6);
/*     */ 
/*  97 */     this.fieldnames[14] = "FEMFEMTHR";
/*     */      this.fields[14]=this.fieldFEMFEMTHR=new CharacterField(this.message, 117, 15);
/*     */ 
/* 100 */     this.fieldnames[15] = "FEMFEMPTP";
/*     */      this.fields[15]=this.fieldFEMFEMPTP=new CharacterField(this.message, 132, 1);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalFEMFEMACC()
/*     */   {
/* 109 */     return this.fieldFEMFEMACC.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalFEMFEMDD1()
/*     */   {
/* 116 */     return this.fieldFEMFEMDD1.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalFEMFEMDD2()
/*     */   {
/* 123 */     return this.fieldFEMFEMDD2.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalFEMFEMDD3()
/*     */   {
/* 130 */     return this.fieldFEMFEMDD3.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalFEMFEMDEX()
/*     */   {
/* 137 */     return this.fieldFEMFEMDEX.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalFEMFEMDOA()
/*     */   {
/* 144 */     return this.fieldFEMFEMDOA.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalFEMFEMEXR()
/*     */   {
/* 151 */     return this.fieldFEMFEMEXR.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalFEMFEMSOA()
/*     */   {
/* 158 */     return this.fieldFEMFEMSOA.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalFEMFEMVD1()
/*     */   {
/* 165 */     return this.fieldFEMFEMVD1.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalFEMFEMVD2()
/*     */   {
/* 172 */     return this.fieldFEMFEMVD2.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalFEMFEMVD3()
/*     */   {
/* 179 */     return this.fieldFEMFEMVD3.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public String getFEMFEMACC()
/*     */   {
/* 186 */     return this.fieldFEMFEMACC.getString();
/*     */   }
/*     */ 
/*     */   public String getFEMFEMCCY()
/*     */   {
/* 193 */     return this.fieldFEMFEMCCY.getString();
/*     */   }
/*     */ 
/*     */   public String getFEMFEMDCY()
/*     */   {
/* 200 */     return this.fieldFEMFEMDCY.getString();
/*     */   }
/*     */ 
/*     */   public String getFEMFEMDD1()
/*     */   {
/* 207 */     return this.fieldFEMFEMDD1.getString();
/*     */   }
/*     */ 
/*     */   public String getFEMFEMDD2()
/*     */   {
/* 214 */     return this.fieldFEMFEMDD2.getString();
/*     */   }
/*     */ 
/*     */   public String getFEMFEMDD3()
/*     */   {
/* 221 */     return this.fieldFEMFEMDD3.getString();
/*     */   }
/*     */ 
/*     */   public String getFEMFEMDEX()
/*     */   {
/* 228 */     return this.fieldFEMFEMDEX.getString();
/*     */   }
/*     */ 
/*     */   public String getFEMFEMDOA()
/*     */   {
/* 235 */     return this.fieldFEMFEMDOA.getString();
/*     */   }
/*     */ 
/*     */   public String getFEMFEMEXR()
/*     */   {
/* 242 */     return this.fieldFEMFEMEXR.getString();
/*     */   }
/*     */ 
/*     */   public String getFEMFEMPTP()
/*     */   {
/* 249 */     return this.fieldFEMFEMPTP.getString();
/*     */   }
/*     */ 
/*     */   public String getFEMFEMSOA()
/*     */   {
/* 256 */     return this.fieldFEMFEMSOA.getString();
/*     */   }
/*     */ 
/*     */   public String getFEMFEMTHR()
/*     */   {
/* 263 */     return this.fieldFEMFEMTHR.getString();
/*     */   }
/*     */ 
/*     */   public String getFEMFEMVD1()
/*     */   {
/* 270 */     return this.fieldFEMFEMVD1.getString();
/*     */   }
/*     */ 
/*     */   public String getFEMFEMVD2()
/*     */   {
/* 277 */     return this.fieldFEMFEMVD2.getString();
/*     */   }
/*     */ 
/*     */   public String getFEMFEMVD3()
/*     */   {
/* 284 */     return this.fieldFEMFEMVD3.getString();
/*     */   }
/*     */ 
/*     */   public String getFEMUSER()
/*     */   {
/* 291 */     return this.fieldFEMUSER.getString();
/*     */   }
/*     */ 
/*     */   public void setFEMFEMACC(String newvalue)
/*     */   {
/* 298 */     this.fieldFEMFEMACC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setFEMFEMACC(BigDecimal newvalue)
/*     */   {
/* 305 */     this.fieldFEMFEMACC.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setFEMFEMCCY(String newvalue)
/*     */   {
/* 312 */     this.fieldFEMFEMCCY.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setFEMFEMDCY(String newvalue)
/*     */   {
/* 319 */     this.fieldFEMFEMDCY.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setFEMFEMDD1(String newvalue)
/*     */   {
/* 326 */     this.fieldFEMFEMDD1.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setFEMFEMDD1(BigDecimal newvalue)
/*     */   {
/* 333 */     this.fieldFEMFEMDD1.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setFEMFEMDD2(String newvalue)
/*     */   {
/* 340 */     this.fieldFEMFEMDD2.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setFEMFEMDD2(BigDecimal newvalue)
/*     */   {
/* 347 */     this.fieldFEMFEMDD2.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setFEMFEMDD3(String newvalue)
/*     */   {
/* 354 */     this.fieldFEMFEMDD3.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setFEMFEMDD3(BigDecimal newvalue)
/*     */   {
/* 361 */     this.fieldFEMFEMDD3.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setFEMFEMDEX(String newvalue)
/*     */   {
/* 368 */     this.fieldFEMFEMDEX.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setFEMFEMDEX(BigDecimal newvalue)
/*     */   {
/* 375 */     this.fieldFEMFEMDEX.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setFEMFEMDOA(String newvalue)
/*     */   {
/* 382 */     this.fieldFEMFEMDOA.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setFEMFEMDOA(BigDecimal newvalue)
/*     */   {
/* 389 */     this.fieldFEMFEMDOA.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setFEMFEMEXR(String newvalue)
/*     */   {
/* 396 */     this.fieldFEMFEMEXR.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setFEMFEMEXR(BigDecimal newvalue)
/*     */   {
/* 403 */     this.fieldFEMFEMEXR.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setFEMFEMPTP(String newvalue)
/*     */   {
/* 410 */     this.fieldFEMFEMPTP.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setFEMFEMSOA(String newvalue)
/*     */   {
/* 417 */     this.fieldFEMFEMSOA.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setFEMFEMSOA(BigDecimal newvalue)
/*     */   {
/* 424 */     this.fieldFEMFEMSOA.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setFEMFEMTHR(String newvalue)
/*     */   {
/* 431 */     this.fieldFEMFEMTHR.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setFEMFEMVD1(String newvalue)
/*     */   {
/* 438 */     this.fieldFEMFEMVD1.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setFEMFEMVD1(BigDecimal newvalue)
/*     */   {
/* 445 */     this.fieldFEMFEMVD1.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setFEMFEMVD2(String newvalue)
/*     */   {
/* 452 */     this.fieldFEMFEMVD2.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setFEMFEMVD2(BigDecimal newvalue)
/*     */   {
/* 459 */     this.fieldFEMFEMVD2.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setFEMFEMVD3(String newvalue)
/*     */   {
/* 466 */     this.fieldFEMFEMVD3.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setFEMFEMVD3(BigDecimal newvalue)
/*     */   {
/* 473 */     this.fieldFEMFEMVD3.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setFEMUSER(String newvalue)
/*     */   {
/* 480 */     this.fieldFEMUSER.setString(newvalue);
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.FEMSTDSJVMessage
 * JD-Core Version:    0.6.0
 */