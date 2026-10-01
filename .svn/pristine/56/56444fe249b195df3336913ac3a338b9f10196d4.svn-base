/*     */ package com.activo.gateway.dibs.messages;
/*     */ 
/*     */ import java.math.BigDecimal;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*     */ 
/*     */ public class IN098002Message extends MessageRecord
/*     */ {
/*  19 */   final int FIELDCOUNT = 18;
/*  20 */   private CharacterField fieldH02USERID = null;
/*  21 */   private CharacterField fieldH02PROGRM = null;
/*  22 */   private CharacterField fieldH02TIMSYS = null;
/*  23 */   private CharacterField fieldH02SCRCOD = null;
/*  24 */   private CharacterField fieldH02OPECOD = null;
/*  25 */   private CharacterField fieldH02FLGMAS = null;
/*  26 */   private CharacterField fieldH02FLGWK1 = null;
/*  27 */   private CharacterField fieldH02FLGWK2 = null;
/*  28 */   private CharacterField fieldH02FLGWK3 = null;
/*  29 */   private DecimalField fieldE02DEAACC = null;
/*  30 */   private DecimalField fieldE02PYMDT1 = null;
/*  31 */   private DecimalField fieldE02PYMDT2 = null;
/*  32 */   private DecimalField fieldE02PYMDT3 = null;
/*  33 */   private DecimalField fieldE02DLPPRI = null;
/*  34 */   private DecimalField fieldE02DLPINT = null;
/*  35 */   private DecimalField fieldE02DLPMOR = null;
/*  36 */   private DecimalField fieldE02DLPDED = null;
/*  37 */   private CharacterField fieldE02PYMSTS = null;
/*     */ 
/*     */   public IN098002Message()
/*     */   {
/*  44 */     createFields();
/*  45 */     initialize();
/*     */   }
/*     */ 
/*     */   protected void createFields()
/*     */   {
/*  53 */     this.recordsize = 142;
/*  54 */     this.fileid = "1001005130855";
/*  55 */     this.recordid = "4F240902BCCBE";
/*  56 */     this.message = new byte[getByteLength()];
/*  57 */     this.formatname = "IN098002";
/*  58 */     this.fieldnames = new String[18];
/*  59 */     this.tagnames = new String[18];
/*  60 */     this.fields = new MessageField[18];
/*     */ 
/*  62 */     this.fieldnames[0] = "H02USERID";
/*  63 */     this.tagnames[0] = "H02USERID";
/*     */      this.fields[0]=this.fieldH02USERID=new CharacterField(this.message, 10, 10, "H02USERID");
/*     */ 
/*  66 */     this.fieldnames[1] = "H02PROGRM";
/*  67 */     this.tagnames[1] = "H02PROGRM";
/*     */      this.fields[1]=this.fieldH02PROGRM=new CharacterField(this.message, 20, 10, "H02PROGRM");
/*     */ 
/*  70 */     this.fieldnames[2] = "H02TIMSYS";
/*  71 */     this.tagnames[2] = "H02TIMSYS";
/*     */      this.fields[2]=this.fieldH02TIMSYS=new CharacterField(this.message, 30, 12, "H02TIMSYS");
/*     */ 
/*  74 */     this.fieldnames[3] = "H02SCRCOD";
/*  75 */     this.tagnames[3] = "H02SCRCOD";
/*     */      this.fields[3]=this.fieldH02SCRCOD=new CharacterField(this.message, 42, 2, "H02SCRCOD");
/*     */ 
/*  78 */     this.fieldnames[4] = "H02OPECOD";
/*  79 */     this.tagnames[4] = "H02OPECOD";
/*     */      this.fields[4]=this.fieldH02OPECOD=new CharacterField(this.message, 44, 4, "H02OPECOD");
/*     */ 
/*  82 */     this.fieldnames[5] = "H02FLGMAS";
/*  83 */     this.tagnames[5] = "H02FLGMAS";
/*     */      this.fields[5]=this.fieldH02FLGMAS=new CharacterField(this.message, 48, 1, "H02FLGMAS");
/*     */ 
/*  86 */     this.fieldnames[6] = "H02FLGWK1";
/*  87 */     this.tagnames[6] = "H02FLGWK1";
/*     */      this.fields[6]=this.fieldH02FLGWK1=new CharacterField(this.message, 49, 1, "H02FLGWK1");
/*     */ 
/*  90 */     this.fieldnames[7] = "H02FLGWK2";
/*  91 */     this.tagnames[7] = "H02FLGWK2";
/*     */      this.fields[7]=this.fieldH02FLGWK2=new CharacterField(this.message, 50, 1, "H02FLGWK2");
/*     */ 
/*  94 */     this.fieldnames[8] = "H02FLGWK3";
/*  95 */     this.tagnames[8] = "H02FLGWK3";
/*     */      this.fields[8]=this.fieldH02FLGWK3=new CharacterField(this.message, 51, 1, "H02FLGWK3");
/*     */ 
/*  98 */     this.fieldnames[9] = "E02DEAACC";
/*  99 */     this.tagnames[9] = "E02DEAACC";
/*     */      this.fields[9]=this.fieldE02DEAACC=new DecimalField(this.message, 52, 13, 0, "E02DEAACC");
/*     */ 
/* 102 */     this.fieldnames[10] = "E02PYMDT1";
/* 103 */     this.tagnames[10] = "E02PYMDT1";
/*     */      this.fields[10]=this.fieldE02PYMDT1=new DecimalField(this.message, 65, 3, 0, "E02PYMDT1");
/*     */ 
/* 106 */     this.fieldnames[11] = "E02PYMDT2";
/* 107 */     this.tagnames[11] = "E02PYMDT2";
/*     */      this.fields[11]=this.fieldE02PYMDT2=new DecimalField(this.message, 68, 3, 0, "E02PYMDT2");
/*     */ 
/* 110 */     this.fieldnames[12] = "E02PYMDT3";
/* 111 */     this.tagnames[12] = "E02PYMDT3";
/*     */      this.fields[12]=this.fieldE02PYMDT3=new DecimalField(this.message, 71, 3, 0, "E02PYMDT3");
/*     */ 
/* 114 */     this.fieldnames[13] = "E02DLPPRI";
/* 115 */     this.tagnames[13] = "E02DLPPRI";
/*     */      this.fields[13]=this.fieldE02DLPPRI=new DecimalField(this.message, 74, 17, 2, "E02DLPPRI");
/*     */ 
/* 118 */     this.fieldnames[14] = "E02DLPINT";
/* 119 */     this.tagnames[14] = "E02DLPINT";
/*     */      this.fields[14]=this.fieldE02DLPINT=new DecimalField(this.message, 91, 17, 2, "E02DLPINT");
/*     */ 
/* 122 */     this.fieldnames[15] = "E02DLPMOR";
/* 123 */     this.tagnames[15] = "E02DLPMOR";
/*     */      this.fields[15]=this.fieldE02DLPMOR=new DecimalField(this.message, 108, 17, 2, "E02DLPMOR");
/*     */ 
/* 126 */     this.fieldnames[16] = "E02DLPDED";
/* 127 */     this.tagnames[16] = "E02DLPDED";
/*     */      this.fields[16]=this.fieldE02DLPDED=new DecimalField(this.message, 125, 17, 2, "E02DLPDED");
/*     */ 
/* 130 */     this.fieldnames[17] = "E02PYMSTS";
/* 131 */     this.tagnames[17] = "E02PYMSTS";
/*     */      this.fields[17]=this.fieldE02PYMSTS=new CharacterField(this.message, 142, 10, "E02PYMSTS");
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalE02DEAACC()
/*     */   {
/* 140 */     return this.fieldE02DEAACC.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalE02DLPDED()
/*     */   {
/* 147 */     return this.fieldE02DLPDED.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalE02DLPINT()
/*     */   {
/* 154 */     return this.fieldE02DLPINT.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalE02DLPMOR()
/*     */   {
/* 161 */     return this.fieldE02DLPMOR.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalE02DLPPRI()
/*     */   {
/* 168 */     return this.fieldE02DLPPRI.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalE02PYMDT1()
/*     */   {
/* 175 */     return this.fieldE02PYMDT1.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalE02PYMDT2()
/*     */   {
/* 182 */     return this.fieldE02PYMDT2.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalE02PYMDT3()
/*     */   {
/* 189 */     return this.fieldE02PYMDT3.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public String getE02DEAACC()
/*     */   {
/* 196 */     return this.fieldE02DEAACC.getString();
/*     */   }
/*     */ 
/*     */   public String getE02DLPDED()
/*     */   {
/* 203 */     return this.fieldE02DLPDED.getString();
/*     */   }
/*     */ 
/*     */   public String getE02DLPINT()
/*     */   {
/* 210 */     return this.fieldE02DLPINT.getString();
/*     */   }
/*     */ 
/*     */   public String getE02DLPMOR()
/*     */   {
/* 217 */     return this.fieldE02DLPMOR.getString();
/*     */   }
/*     */ 
/*     */   public String getE02DLPPRI()
/*     */   {
/* 224 */     return this.fieldE02DLPPRI.getString();
/*     */   }
/*     */ 
/*     */   public String getE02PYMDT1()
/*     */   {
/* 231 */     return this.fieldE02PYMDT1.getString();
/*     */   }
/*     */ 
/*     */   public String getE02PYMDT2()
/*     */   {
/* 238 */     return this.fieldE02PYMDT2.getString();
/*     */   }
/*     */ 
/*     */   public String getE02PYMDT3()
/*     */   {
/* 245 */     return this.fieldE02PYMDT3.getString();
/*     */   }
/*     */ 
/*     */   public String getE02PYMSTS()
/*     */   {
/* 252 */     return this.fieldE02PYMSTS.getString();
/*     */   }
/*     */ 
/*     */   public String getH02FLGMAS()
/*     */   {
/* 259 */     return this.fieldH02FLGMAS.getString();
/*     */   }
/*     */ 
/*     */   public String getH02FLGWK1()
/*     */   {
/* 266 */     return this.fieldH02FLGWK1.getString();
/*     */   }
/*     */ 
/*     */   public String getH02FLGWK2()
/*     */   {
/* 273 */     return this.fieldH02FLGWK2.getString();
/*     */   }
/*     */ 
/*     */   public String getH02FLGWK3()
/*     */   {
/* 280 */     return this.fieldH02FLGWK3.getString();
/*     */   }
/*     */ 
/*     */   public String getH02OPECOD()
/*     */   {
/* 287 */     return this.fieldH02OPECOD.getString();
/*     */   }
/*     */ 
/*     */   public String getH02PROGRM()
/*     */   {
/* 294 */     return this.fieldH02PROGRM.getString();
/*     */   }
/*     */ 
/*     */   public String getH02SCRCOD()
/*     */   {
/* 301 */     return this.fieldH02SCRCOD.getString();
/*     */   }
/*     */ 
/*     */   public String getH02TIMSYS()
/*     */   {
/* 308 */     return this.fieldH02TIMSYS.getString();
/*     */   }
/*     */ 
/*     */   public String getH02USERID()
/*     */   {
/* 315 */     return this.fieldH02USERID.getString();
/*     */   }
/*     */ 
/*     */   public void setE02DEAACC(String newvalue)
/*     */   {
/* 322 */     this.fieldE02DEAACC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setE02DEAACC(BigDecimal newvalue)
/*     */   {
/* 329 */     this.fieldE02DEAACC.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setE02DLPDED(String newvalue)
/*     */   {
/* 336 */     this.fieldE02DLPDED.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setE02DLPDED(BigDecimal newvalue)
/*     */   {
/* 343 */     this.fieldE02DLPDED.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setE02DLPINT(String newvalue)
/*     */   {
/* 350 */     this.fieldE02DLPINT.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setE02DLPINT(BigDecimal newvalue)
/*     */   {
/* 357 */     this.fieldE02DLPINT.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setE02DLPMOR(String newvalue)
/*     */   {
/* 364 */     this.fieldE02DLPMOR.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setE02DLPMOR(BigDecimal newvalue)
/*     */   {
/* 371 */     this.fieldE02DLPMOR.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setE02DLPPRI(String newvalue)
/*     */   {
/* 378 */     this.fieldE02DLPPRI.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setE02DLPPRI(BigDecimal newvalue)
/*     */   {
/* 385 */     this.fieldE02DLPPRI.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setE02PYMDT1(String newvalue)
/*     */   {
/* 392 */     this.fieldE02PYMDT1.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setE02PYMDT1(BigDecimal newvalue)
/*     */   {
/* 399 */     this.fieldE02PYMDT1.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setE02PYMDT2(String newvalue)
/*     */   {
/* 406 */     this.fieldE02PYMDT2.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setE02PYMDT2(BigDecimal newvalue)
/*     */   {
/* 413 */     this.fieldE02PYMDT2.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setE02PYMDT3(String newvalue)
/*     */   {
/* 420 */     this.fieldE02PYMDT3.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setE02PYMDT3(BigDecimal newvalue)
/*     */   {
/* 427 */     this.fieldE02PYMDT3.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setE02PYMSTS(String newvalue)
/*     */   {
/* 434 */     this.fieldE02PYMSTS.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setH02FLGMAS(String newvalue)
/*     */   {
/* 441 */     this.fieldH02FLGMAS.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setH02FLGWK1(String newvalue)
/*     */   {
/* 448 */     this.fieldH02FLGWK1.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setH02FLGWK2(String newvalue)
/*     */   {
/* 455 */     this.fieldH02FLGWK2.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setH02FLGWK3(String newvalue)
/*     */   {
/* 462 */     this.fieldH02FLGWK3.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setH02OPECOD(String newvalue)
/*     */   {
/* 469 */     this.fieldH02OPECOD.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setH02PROGRM(String newvalue)
/*     */   {
/* 476 */     this.fieldH02PROGRM.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setH02SCRCOD(String newvalue)
/*     */   {
/* 483 */     this.fieldH02SCRCOD.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setH02TIMSYS(String newvalue)
/*     */   {
/* 490 */     this.fieldH02TIMSYS.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setH02USERID(String newvalue)
/*     */   {
/* 497 */     this.fieldH02USERID.setString(newvalue);
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.IN098002Message
 * JD-Core Version:    0.6.0
 */