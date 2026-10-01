/*     */ package com.activo.gateway.dibs.messages;
/*     */ 
/*     */ import java.math.BigDecimal;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*     */ 
/*     */ public class POSCVALDSMessage extends MessageRecord
/*     */ {
/*  19 */   final int FIELDCOUNT = 13;
/*  20 */   private CharacterField fieldPRMBNK = null;
/*  21 */   private DecimalField fieldPRMBRN = null;
/*  22 */   private CharacterField fieldPRMCCY = null;
/*  23 */   private DecimalField fieldPRMAMT = null;
/*  24 */   private CharacterField fieldPRMDCC = null;
/*  25 */   private DecimalField fieldPRMEXR = null;
/*  26 */   private CharacterField fieldPRMTYP = null;
/*  27 */   private CharacterField fieldPRMPRO = null;
/*  28 */   private CharacterField fieldPRMFIL = null;
/*  29 */   private CharacterField fieldPRMOBK = null;
/*  30 */   private DecimalField fieldPRMOBR = null;
/*  31 */   private DecimalField fieldPRMKBT = null;
/*  32 */   private DecimalField fieldPRMKSQ = null;
/*     */ 
/*     */   public POSCVALDSMessage()
/*     */   {
/*  39 */     createFields();
/*  40 */     initialize();
/*     */   }
/*     */ 
/*     */   protected void createFields()
/*     */   {
/*  48 */     this.recordsize = 60;
/*  49 */     this.fileid = "1000510143609";
/*  50 */     this.recordid = "46163E04A48DD";
/*  51 */     this.message = new byte[getByteLength()];
/*  52 */     this.formatname = "POSCVALDS";
/*  53 */     this.fieldnames = new String[13];
/*  54 */     this.tagnames = new String[13];
/*  55 */     this.fields = new MessageField[13];
/*     */ 
/*  57 */     this.fieldnames[0] = "PRMBNK";
/*  58 */     this.tagnames[0] = "PRMBNK";
/*     */      this.fields[0]=this.fieldPRMBNK=new CharacterField(this.message, 10, 2, "PRMBNK");
/*     */ 
/*  61 */     this.fieldnames[1] = "PRMBRN";
/*  62 */     this.tagnames[1] = "PRMBRN";
/*     */      this.fields[1]=this.fieldPRMBRN=new DecimalField(this.message, 12, 4, 0, "PRMBRN");
/*     */ 
/*  65 */     this.fieldnames[2] = "PRMCCY";
/*  66 */     this.tagnames[2] = "PRMCCY";
/*     */      this.fields[2]=this.fieldPRMCCY=new CharacterField(this.message, 16, 3, "PRMCCY");
/*     */ 
/*  69 */     this.fieldnames[3] = "PRMAMT";
/*  70 */     this.tagnames[3] = "PRMAMT";
/*     */      this.fields[3]=this.fieldPRMAMT=new DecimalField(this.message, 19, 17, 2, "PRMAMT");
/*     */ 
/*  73 */     this.fieldnames[4] = "PRMDCC";
/*  74 */     this.tagnames[4] = "PRMDCC";
/*     */      this.fields[4]=this.fieldPRMDCC=new CharacterField(this.message, 36, 1, "PRMDCC");
/*     */ 
/*  77 */     this.fieldnames[5] = "PRMEXR";
/*  78 */     this.tagnames[5] = "PRMEXR";
/*     */      this.fields[5]=this.fieldPRMEXR=new DecimalField(this.message, 37, 13, 6, "PRMEXR");
/*     */ 
/*  81 */     this.fieldnames[6] = "PRMTYP";
/*  82 */     this.tagnames[6] = "PRMTYP";
/*     */      this.fields[6]=this.fieldPRMTYP=new CharacterField(this.message, 50, 1, "PRMTYP");
/*     */ 
/*  85 */     this.fieldnames[7] = "PRMPRO";
/*  86 */     this.tagnames[7] = "PRMPRO";
/*     */      this.fields[7]=this.fieldPRMPRO=new CharacterField(this.message, 51, 1, "PRMPRO");
/*     */ 
/*  89 */     this.fieldnames[8] = "PRMFIL";
/*  90 */     this.tagnames[8] = "PRMFIL";
/*     */      this.fields[8]=this.fieldPRMFIL=new CharacterField(this.message, 52, 1, "PRMFIL");
/*     */ 
/*  93 */     this.fieldnames[9] = "PRMOBK";
/*  94 */     this.tagnames[9] = "PRMOBK";
/*     */      this.fields[9]=this.fieldPRMOBK=new CharacterField(this.message, 53, 2, "PRMOBK");
/*     */ 
/*  97 */     this.fieldnames[10] = "PRMOBR";
/*  98 */     this.tagnames[10] = "PRMOBR";
/*     */      this.fields[10]=this.fieldPRMOBR=new DecimalField(this.message, 55, 4, 0, "PRMOBR");
/*     */ 
/* 101 */     this.fieldnames[11] = "PRMKBT";
/* 102 */     this.tagnames[11] = "PRMKBT";
/*     */      this.fields[11]=this.fieldPRMKBT=new DecimalField(this.message, 59, 5, 0, "PRMKBT");
/*     */ 
/* 105 */     this.fieldnames[12] = "PRMKSQ";
/* 106 */     this.tagnames[12] = "PRMKSQ";
/*     */      this.fields[12]=this.fieldPRMKSQ=new DecimalField(this.message, 64, 6, 0, "PRMKSQ");
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalPRMAMT()
/*     */   {
/* 115 */     return this.fieldPRMAMT.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalPRMBRN()
/*     */   {
/* 122 */     return this.fieldPRMBRN.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalPRMEXR()
/*     */   {
/* 129 */     return this.fieldPRMEXR.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalPRMKBT()
/*     */   {
/* 136 */     return this.fieldPRMKBT.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalPRMKSQ()
/*     */   {
/* 143 */     return this.fieldPRMKSQ.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalPRMOBR()
/*     */   {
/* 150 */     return this.fieldPRMOBR.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public String getPRMAMT()
/*     */   {
/* 157 */     return this.fieldPRMAMT.getString();
/*     */   }
/*     */ 
/*     */   public String getPRMBNK()
/*     */   {
/* 164 */     return this.fieldPRMBNK.getString();
/*     */   }
/*     */ 
/*     */   public String getPRMBRN()
/*     */   {
/* 171 */     return this.fieldPRMBRN.getString();
/*     */   }
/*     */ 
/*     */   public String getPRMCCY()
/*     */   {
/* 178 */     return this.fieldPRMCCY.getString();
/*     */   }
/*     */ 
/*     */   public String getPRMDCC()
/*     */   {
/* 185 */     return this.fieldPRMDCC.getString();
/*     */   }
/*     */ 
/*     */   public String getPRMEXR()
/*     */   {
/* 192 */     return this.fieldPRMEXR.getString();
/*     */   }
/*     */ 
/*     */   public String getPRMFIL()
/*     */   {
/* 199 */     return this.fieldPRMFIL.getString();
/*     */   }
/*     */ 
/*     */   public String getPRMKBT()
/*     */   {
/* 206 */     return this.fieldPRMKBT.getString();
/*     */   }
/*     */ 
/*     */   public String getPRMKSQ()
/*     */   {
/* 213 */     return this.fieldPRMKSQ.getString();
/*     */   }
/*     */ 
/*     */   public String getPRMOBK()
/*     */   {
/* 220 */     return this.fieldPRMOBK.getString();
/*     */   }
/*     */ 
/*     */   public String getPRMOBR()
/*     */   {
/* 227 */     return this.fieldPRMOBR.getString();
/*     */   }
/*     */ 
/*     */   public String getPRMPRO()
/*     */   {
/* 234 */     return this.fieldPRMPRO.getString();
/*     */   }
/*     */ 
/*     */   public String getPRMTYP()
/*     */   {
/* 241 */     return this.fieldPRMTYP.getString();
/*     */   }
/*     */ 
/*     */   public void setPRMAMT(String newvalue)
/*     */   {
/* 248 */     this.fieldPRMAMT.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setPRMAMT(BigDecimal newvalue)
/*     */   {
/* 255 */     this.fieldPRMAMT.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setPRMBNK(String newvalue)
/*     */   {
/* 262 */     this.fieldPRMBNK.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setPRMBRN(String newvalue)
/*     */   {
/* 269 */     this.fieldPRMBRN.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setPRMBRN(BigDecimal newvalue)
/*     */   {
/* 276 */     this.fieldPRMBRN.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setPRMCCY(String newvalue)
/*     */   {
/* 283 */     this.fieldPRMCCY.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setPRMDCC(String newvalue)
/*     */   {
/* 290 */     this.fieldPRMDCC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setPRMEXR(String newvalue)
/*     */   {
/* 297 */     this.fieldPRMEXR.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setPRMEXR(BigDecimal newvalue)
/*     */   {
/* 304 */     this.fieldPRMEXR.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setPRMFIL(String newvalue)
/*     */   {
/* 311 */     this.fieldPRMFIL.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setPRMKBT(String newvalue)
/*     */   {
/* 318 */     this.fieldPRMKBT.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setPRMKBT(BigDecimal newvalue)
/*     */   {
/* 325 */     this.fieldPRMKBT.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setPRMKSQ(String newvalue)
/*     */   {
/* 332 */     this.fieldPRMKSQ.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setPRMKSQ(BigDecimal newvalue)
/*     */   {
/* 339 */     this.fieldPRMKSQ.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setPRMOBK(String newvalue)
/*     */   {
/* 346 */     this.fieldPRMOBK.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setPRMOBR(String newvalue)
/*     */   {
/* 353 */     this.fieldPRMOBR.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setPRMOBR(BigDecimal newvalue)
/*     */   {
/* 360 */     this.fieldPRMOBR.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setPRMPRO(String newvalue)
/*     */   {
/* 367 */     this.fieldPRMPRO.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setPRMTYP(String newvalue)
/*     */   {
/* 374 */     this.fieldPRMTYP.setString(newvalue);
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.POSCVALDSMessage
 * JD-Core Version:    0.6.0
 */