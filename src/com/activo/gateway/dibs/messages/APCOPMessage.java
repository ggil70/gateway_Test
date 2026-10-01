/*     */ package com.activo.gateway.dibs.messages;
/*     */ 
/*     */ import java.math.BigDecimal;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*     */ 
/*     */ public class APCOPMessage extends MessageRecord
/*     */ {
/*  19 */   final int FIELDCOUNT = 12;
/*  20 */   private CharacterField fieldAPCUSR = null;
/*  21 */   private CharacterField fieldAPCTYP = null;
/*  22 */   private DecimalField fieldAPCAMT = null;
/*  23 */   private DecimalField fieldAPCACC = null;
/*  24 */   private CharacterField fieldAPCSPI = null;
/*  25 */   private CharacterField fieldAPCSP2 = null;
/*  26 */   private CharacterField fieldAPCSP3 = null;
/*  27 */   private DecimalField fieldAPCMPY = null;
/*  28 */   private DecimalField fieldAPCRPY = null;
/*  29 */   private DecimalField fieldAPCUPY = null;
/*  30 */   private DecimalField fieldAPCHPN = null;
/*  31 */   private DecimalField fieldAPCPHN = null;
/*     */ 
/*     */   public APCOPMessage()
/*     */   {
/*  38 */     createFields();
/*  39 */     initialize();
/*     */   }
/*     */ 
/*     */   protected void createFields()
/*     */   {
/*  47 */     this.recordsize = 185;
/*  48 */     this.fileid = "1000516091545";
/*  49 */     this.recordid = "4F5CDD3649143";
/*  50 */     this.message = new byte[getByteLength()];
/*  51 */     this.formatname = "APCOP";
/*  52 */     this.fieldnames = new String[12];
/*  53 */     this.tagnames = new String[12];
/*  54 */     this.fields = new MessageField[12];
/*     */ 
/*  56 */     this.fieldnames[0] = "APCUSR";
/*  57 */     this.tagnames[0] = "APCUSR";
/*     */      this.fields[0]=this.fieldAPCUSR=new CharacterField(this.message, 10, 10, "APCUSR");
/*     */ 
/*  60 */     this.fieldnames[1] = "APCTYP";
/*  61 */     this.tagnames[1] = "APCTYP";
/*     */      this.fields[1]=this.fieldAPCTYP=new CharacterField(this.message, 20, 25, "APCTYP");
/*     */ 
/*  64 */     this.fieldnames[2] = "APCAMT";
/*  65 */     this.tagnames[2] = "APCAMT";
/*     */      this.fields[2]=this.fieldAPCAMT=new DecimalField(this.message, 45, 15, 2, "APCAMT");
/*     */ 
/*  68 */     this.fieldnames[3] = "APCACC";
/*  69 */     this.tagnames[3] = "APCACC";
/*     */      this.fields[3]=this.fieldAPCACC=new DecimalField(this.message, 60, 10, 0, "APCACC");
/*     */ 
/*  72 */     this.fieldnames[4] = "APCSPI";
/*  73 */     this.tagnames[4] = "APCSPI";
/*     */      this.fields[4]=this.fieldAPCSPI=new CharacterField(this.message, 70, 30, "APCSPI");
/*     */ 
/*  76 */     this.fieldnames[5] = "APCSP2";
/*  77 */     this.tagnames[5] = "APCSP2";
/*     */      this.fields[5]=this.fieldAPCSP2=new CharacterField(this.message, 100, 30, "APCSP2");
/*     */ 
/*  80 */     this.fieldnames[6] = "APCSP3";
/*  81 */     this.tagnames[6] = "APCSP3";
/*     */      this.fields[6]=this.fieldAPCSP3=new CharacterField(this.message, 130, 30, "APCSP3");
/*     */ 
/*  84 */     this.fieldnames[7] = "APCMPY";
/*  85 */     this.tagnames[7] = "APCMPY";
/*     */      this.fields[7]=this.fieldAPCMPY=new DecimalField(this.message, 160, 3, 0, "APCMPY");
/*     */ 
/*  88 */     this.fieldnames[8] = "APCRPY";
/*  89 */     this.tagnames[8] = "APCRPY";
/*     */      this.fields[8]=this.fieldAPCRPY=new DecimalField(this.message, 163, 3, 0, "APCRPY");
/*     */ 
/*  92 */     this.fieldnames[9] = "APCUPY";
/*  93 */     this.tagnames[9] = "APCUPY";
/*     */      this.fields[9]=this.fieldAPCUPY=new DecimalField(this.message, 166, 5, 0, "APCUPY");
/*     */ 
/*  96 */     this.fieldnames[10] = "APCHPN";
/*  97 */     this.tagnames[10] = "APCHPN";
/*     */      this.fields[10]=this.fieldAPCHPN=new DecimalField(this.message, 171, 12, 0, "APCHPN");
/*     */ 
/* 100 */     this.fieldnames[11] = "APCPHN";
/* 101 */     this.tagnames[11] = "APCPHN";
/*     */      this.fields[11]=this.fieldAPCPHN=new DecimalField(this.message, 183, 12, 0, "APCPHN");
/*     */   }
/*     */ 
/*     */   public String getAPCACC()
/*     */   {
/* 110 */     return this.fieldAPCACC.getString();
/*     */   }
/*     */ 
/*     */   public String getAPCAMT()
/*     */   {
/* 117 */     return this.fieldAPCAMT.getString();
/*     */   }
/*     */ 
/*     */   public String getAPCHPN()
/*     */   {
/* 124 */     return this.fieldAPCHPN.getString();
/*     */   }
/*     */ 
/*     */   public String getAPCMPY()
/*     */   {
/* 131 */     return this.fieldAPCMPY.getString();
/*     */   }
/*     */ 
/*     */   public String getAPCPHN()
/*     */   {
/* 138 */     return this.fieldAPCPHN.getString();
/*     */   }
/*     */ 
/*     */   public String getAPCRPY()
/*     */   {
/* 145 */     return this.fieldAPCRPY.getString();
/*     */   }
/*     */ 
/*     */   public String getAPCSP2()
/*     */   {
/* 152 */     return this.fieldAPCSP2.getString();
/*     */   }
/*     */ 
/*     */   public String getAPCSP3()
/*     */   {
/* 159 */     return this.fieldAPCSP3.getString();
/*     */   }
/*     */ 
/*     */   public String getAPCSPI()
/*     */   {
/* 166 */     return this.fieldAPCSPI.getString();
/*     */   }
/*     */ 
/*     */   public String getAPCTYP()
/*     */   {
/* 173 */     return this.fieldAPCTYP.getString();
/*     */   }
/*     */ 
/*     */   public String getAPCUPY()
/*     */   {
/* 180 */     return this.fieldAPCUPY.getString();
/*     */   }
/*     */ 
/*     */   public String getAPCUSR()
/*     */   {
/* 187 */     return this.fieldAPCUSR.getString();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalAPCACC()
/*     */   {
/* 194 */     return this.fieldAPCACC.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalAPCAMT()
/*     */   {
/* 201 */     return this.fieldAPCAMT.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalAPCHPN()
/*     */   {
/* 208 */     return this.fieldAPCHPN.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalAPCMPY()
/*     */   {
/* 215 */     return this.fieldAPCMPY.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalAPCPHN()
/*     */   {
/* 222 */     return this.fieldAPCPHN.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalAPCRPY()
/*     */   {
/* 229 */     return this.fieldAPCRPY.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalAPCUPY()
/*     */   {
/* 236 */     return this.fieldAPCUPY.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setAPCACC(String newvalue)
/*     */   {
/* 243 */     this.fieldAPCACC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setAPCACC(BigDecimal newvalue)
/*     */   {
/* 250 */     this.fieldAPCACC.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setAPCAMT(String newvalue)
/*     */   {
/* 257 */     this.fieldAPCAMT.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setAPCAMT(BigDecimal newvalue)
/*     */   {
/* 264 */     this.fieldAPCAMT.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setAPCHPN(String newvalue)
/*     */   {
/* 271 */     this.fieldAPCHPN.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setAPCHPN(BigDecimal newvalue)
/*     */   {
/* 278 */     this.fieldAPCHPN.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setAPCMPY(String newvalue)
/*     */   {
/* 285 */     this.fieldAPCMPY.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setAPCMPY(BigDecimal newvalue)
/*     */   {
/* 292 */     this.fieldAPCMPY.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setAPCPHN(String newvalue)
/*     */   {
/* 299 */     this.fieldAPCPHN.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setAPCPHN(BigDecimal newvalue)
/*     */   {
/* 306 */     this.fieldAPCPHN.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setAPCRPY(String newvalue)
/*     */   {
/* 313 */     this.fieldAPCRPY.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setAPCRPY(BigDecimal newvalue)
/*     */   {
/* 320 */     this.fieldAPCRPY.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setAPCSP2(String newvalue)
/*     */   {
/* 327 */     this.fieldAPCSP2.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setAPCSP3(String newvalue)
/*     */   {
/* 334 */     this.fieldAPCSP3.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setAPCSPI(String newvalue)
/*     */   {
/* 341 */     this.fieldAPCSPI.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setAPCTYP(String newvalue)
/*     */   {
/* 348 */     this.fieldAPCTYP.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setAPCUPY(String newvalue)
/*     */   {
/* 355 */     this.fieldAPCUPY.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setAPCUPY(BigDecimal newvalue)
/*     */   {
/* 362 */     this.fieldAPCUPY.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setAPCUSR(String newvalue)
/*     */   {
/* 369 */     this.fieldAPCUSR.setString(newvalue);
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.APCOPMessage
 * JD-Core Version:    0.6.0
 */