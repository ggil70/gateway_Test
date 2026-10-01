/*     */ package com.activo.gateway.dibs.messages;
/*     */ 
/*     */ import java.math.BigDecimal;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*     */ 
/*     */ public class IN098003Message extends MessageRecord
/*     */ {
/*  19 */   final int FIELDCOUNT = 22;
/*  20 */   private CharacterField fieldH03USERID = null;
/*  21 */   private CharacterField fieldH03PROGRM = null;
/*  22 */   private CharacterField fieldH03TIMSYS = null;
/*  23 */   private CharacterField fieldH03SCRCOD = null;
/*  24 */   private CharacterField fieldH03OPECOD = null;
/*  25 */   private CharacterField fieldH03FLGMAS = null;
/*  26 */   private CharacterField fieldH03FLGWK1 = null;
/*  27 */   private CharacterField fieldH03FLGWK2 = null;
/*  28 */   private CharacterField fieldH03FLGWK3 = null;
/*  29 */   private CharacterField fieldE03PAGFLG = null;
/*  30 */   private DecimalField fieldE03PAGACC = null;
/*  31 */   private CharacterField fieldE03PAGCCY = null;
/*  32 */   private DecimalField fieldE03PAGPRI = null;
/*  33 */   private DecimalField fieldE03PAGINT = null;
/*  34 */   private DecimalField fieldE03PAGMOR = null;
/*  35 */   private DecimalField fieldE03PAGREA = null;
/*  36 */   private DecimalField fieldE03PAGIMP = null;
/*  37 */   private DecimalField fieldE03PAGCOM = null;
/*  38 */   private DecimalField fieldE03PAGDED = null;
/*  39 */   private DecimalField fieldE03PAGIVA = null;
/*  40 */   private DecimalField fieldE03PAGTOT = null;
/*  41 */   private DecimalField fieldE03PAGOAC = null;
/*     */ 
/*     */   public IN098003Message()
/*     */   {
/*  48 */     createFields();
/*  49 */     initialize();
/*     */   }
/*     */ 
/*     */   protected void createFields()
/*     */   {
/*  57 */     this.recordsize = 226;
/*  58 */     this.fileid = "1000803180134";
/*  59 */     this.recordid = "2DF523D471A05";
/*  60 */     this.message = new byte[getByteLength()];
/*  61 */     this.formatname = "IN098003";
/*  62 */     this.fieldnames = new String[22];
/*  63 */     this.tagnames = new String[22];
/*  64 */     this.fields = new MessageField[22];
/*     */ 
/*  66 */     this.fieldnames[0] = "H03USERID";
/*  67 */     this.tagnames[0] = "H03USERID";
/*     */      this.fields[0]=this.fieldH03USERID=new CharacterField(this.message, 10, 10, "H03USERID");
/*     */ 
/*  70 */     this.fieldnames[1] = "H03PROGRM";
/*  71 */     this.tagnames[1] = "H03PROGRM";
/*     */      this.fields[1]=this.fieldH03PROGRM=new CharacterField(this.message, 20, 10, "H03PROGRM");
/*     */ 
/*  74 */     this.fieldnames[2] = "H03TIMSYS";
/*  75 */     this.tagnames[2] = "H03TIMSYS";
/*     */      this.fields[2]=this.fieldH03TIMSYS=new CharacterField(this.message, 30, 12, "H03TIMSYS");
/*     */ 
/*  78 */     this.fieldnames[3] = "H03SCRCOD";
/*  79 */     this.tagnames[3] = "H03SCRCOD";
/*     */      this.fields[3]=this.fieldH03SCRCOD=new CharacterField(this.message, 42, 2, "H03SCRCOD");
/*     */ 
/*  82 */     this.fieldnames[4] = "H03OPECOD";
/*  83 */     this.tagnames[4] = "H03OPECOD";
/*     */      this.fields[4]=this.fieldH03OPECOD=new CharacterField(this.message, 44, 4, "H03OPECOD");
/*     */ 
/*  86 */     this.fieldnames[5] = "H03FLGMAS";
/*  87 */     this.tagnames[5] = "H03FLGMAS";
/*     */      this.fields[5]=this.fieldH03FLGMAS=new CharacterField(this.message, 48, 1, "H03FLGMAS");
/*     */ 
/*  90 */     this.fieldnames[6] = "H03FLGWK1";
/*  91 */     this.tagnames[6] = "H03FLGWK1";
/*     */      this.fields[6]=this.fieldH03FLGWK1=new CharacterField(this.message, 49, 1, "H03FLGWK1");
/*     */ 
/*  94 */     this.fieldnames[7] = "H03FLGWK2";
/*  95 */     this.tagnames[7] = "H03FLGWK2";
/*     */      this.fields[7]=this.fieldH03FLGWK2=new CharacterField(this.message, 50, 1, "H03FLGWK2");
/*     */ 
/*  98 */     this.fieldnames[8] = "H03FLGWK3";
/*  99 */     this.tagnames[8] = "H03FLGWK3";
/*     */      this.fields[8]=this.fieldH03FLGWK3=new CharacterField(this.message, 51, 1, "H03FLGWK3");
/*     */ 
/* 102 */     this.fieldnames[9] = "E03PAGFLG";
/* 103 */     this.tagnames[9] = "E03PAGFLG";
/*     */      this.fields[9]=this.fieldE03PAGFLG=new CharacterField(this.message, 52, 2, "E03PAGFLG");
/*     */ 
/* 106 */     this.fieldnames[10] = "E03PAGACC";
/* 107 */     this.tagnames[10] = "E03PAGACC";
/*     */      this.fields[10]=this.fieldE03PAGACC=new DecimalField(this.message, 54, 13, 0, "E03PAGACC");
/*     */ 
/* 110 */     this.fieldnames[11] = "E03PAGCCY";
/* 111 */     this.tagnames[11] = "E03PAGCCY";
/*     */      this.fields[11]=this.fieldE03PAGCCY=new CharacterField(this.message, 67, 3, "E03PAGCCY");
/*     */ 
/* 114 */     this.fieldnames[12] = "E03PAGPRI";
/* 115 */     this.tagnames[12] = "E03PAGPRI";
/*     */      this.fields[12]=this.fieldE03PAGPRI=new DecimalField(this.message, 70, 17, 2, "E03PAGPRI");
/*     */ 
/* 118 */     this.fieldnames[13] = "E03PAGINT";
/* 119 */     this.tagnames[13] = "E03PAGINT";
/*     */      this.fields[13]=this.fieldE03PAGINT=new DecimalField(this.message, 87, 17, 2, "E03PAGINT");
/*     */ 
/* 122 */     this.fieldnames[14] = "E03PAGMOR";
/* 123 */     this.tagnames[14] = "E03PAGMOR";
/*     */      this.fields[14]=this.fieldE03PAGMOR=new DecimalField(this.message, 104, 17, 2, "E03PAGMOR");
/*     */ 
/* 126 */     this.fieldnames[15] = "E03PAGREA";
/* 127 */     this.tagnames[15] = "E03PAGREA";
/*     */      this.fields[15]=this.fieldE03PAGREA=new DecimalField(this.message, 121, 17, 2, "E03PAGREA");
/*     */ 
/* 130 */     this.fieldnames[16] = "E03PAGIMP";
/* 131 */     this.tagnames[16] = "E03PAGIMP";
/*     */      this.fields[16]=this.fieldE03PAGIMP=new DecimalField(this.message, 138, 17, 2, "E03PAGIMP");
/*     */ 
/* 134 */     this.fieldnames[17] = "E03PAGCOM";
/* 135 */     this.tagnames[17] = "E03PAGCOM";
/*     */      this.fields[17]=this.fieldE03PAGCOM=new DecimalField(this.message, 155, 17, 2, "E03PAGCOM");
/*     */ 
/* 138 */     this.fieldnames[18] = "E03PAGDED";
/* 139 */     this.tagnames[18] = "E03PAGDED";
/*     */      this.fields[18]=this.fieldE03PAGDED=new DecimalField(this.message, 172, 17, 2, "E03PAGDED");
/*     */ 
/* 142 */     this.fieldnames[19] = "E03PAGIVA";
/* 143 */     this.tagnames[19] = "E03PAGIVA";
/*     */      this.fields[19]=this.fieldE03PAGIVA=new DecimalField(this.message, 189, 17, 2, "E03PAGIVA");
/*     */ 
/* 146 */     this.fieldnames[20] = "E03PAGTOT";
/* 147 */     this.tagnames[20] = "E03PAGTOT";
/*     */      this.fields[20]=this.fieldE03PAGTOT=new DecimalField(this.message, 206, 17, 2, "E03PAGTOT");
/*     */ 
/* 150 */     this.fieldnames[21] = "E03PAGOAC";
/* 151 */     this.tagnames[21] = "E03PAGOAC";
/*     */      this.fields[21]=this.fieldE03PAGOAC=new DecimalField(this.message, 223, 13, 0, "E03PAGOAC");
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalE03PAGACC()
/*     */   {
/* 160 */     return this.fieldE03PAGACC.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalE03PAGCOM()
/*     */   {
/* 167 */     return this.fieldE03PAGCOM.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalE03PAGDED()
/*     */   {
/* 174 */     return this.fieldE03PAGDED.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalE03PAGIMP()
/*     */   {
/* 181 */     return this.fieldE03PAGIMP.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalE03PAGINT()
/*     */   {
/* 188 */     return this.fieldE03PAGINT.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalE03PAGIVA()
/*     */   {
/* 195 */     return this.fieldE03PAGIVA.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalE03PAGMOR()
/*     */   {
/* 202 */     return this.fieldE03PAGMOR.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalE03PAGOAC()
/*     */   {
/* 209 */     return this.fieldE03PAGOAC.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalE03PAGPRI()
/*     */   {
/* 216 */     return this.fieldE03PAGPRI.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalE03PAGREA()
/*     */   {
/* 223 */     return this.fieldE03PAGREA.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalE03PAGTOT()
/*     */   {
/* 230 */     return this.fieldE03PAGTOT.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public String getE03PAGACC()
/*     */   {
/* 237 */     return this.fieldE03PAGACC.getString();
/*     */   }
/*     */ 
/*     */   public String getE03PAGCCY()
/*     */   {
/* 244 */     return this.fieldE03PAGCCY.getString();
/*     */   }
/*     */ 
/*     */   public String getE03PAGCOM()
/*     */   {
/* 251 */     return this.fieldE03PAGCOM.getString();
/*     */   }
/*     */ 
/*     */   public String getE03PAGDED()
/*     */   {
/* 258 */     return this.fieldE03PAGDED.getString();
/*     */   }
/*     */ 
/*     */   public String getE03PAGFLG()
/*     */   {
/* 265 */     return this.fieldE03PAGFLG.getString();
/*     */   }
/*     */ 
/*     */   public String getE03PAGIMP()
/*     */   {
/* 272 */     return this.fieldE03PAGIMP.getString();
/*     */   }
/*     */ 
/*     */   public String getE03PAGINT()
/*     */   {
/* 279 */     return this.fieldE03PAGINT.getString();
/*     */   }
/*     */ 
/*     */   public String getE03PAGIVA()
/*     */   {
/* 286 */     return this.fieldE03PAGIVA.getString();
/*     */   }
/*     */ 
/*     */   public String getE03PAGMOR()
/*     */   {
/* 293 */     return this.fieldE03PAGMOR.getString();
/*     */   }
/*     */ 
/*     */   public String getE03PAGOAC()
/*     */   {
/* 300 */     return this.fieldE03PAGOAC.getString();
/*     */   }
/*     */ 
/*     */   public String getE03PAGPRI()
/*     */   {
/* 307 */     return this.fieldE03PAGPRI.getString();
/*     */   }
/*     */ 
/*     */   public String getE03PAGREA()
/*     */   {
/* 314 */     return this.fieldE03PAGREA.getString();
/*     */   }
/*     */ 
/*     */   public String getE03PAGTOT()
/*     */   {
/* 321 */     return this.fieldE03PAGTOT.getString();
/*     */   }
/*     */ 
/*     */   public String getH03FLGMAS()
/*     */   {
/* 328 */     return this.fieldH03FLGMAS.getString();
/*     */   }
/*     */ 
/*     */   public String getH03FLGWK1()
/*     */   {
/* 335 */     return this.fieldH03FLGWK1.getString();
/*     */   }
/*     */ 
/*     */   public String getH03FLGWK2()
/*     */   {
/* 342 */     return this.fieldH03FLGWK2.getString();
/*     */   }
/*     */ 
/*     */   public String getH03FLGWK3()
/*     */   {
/* 349 */     return this.fieldH03FLGWK3.getString();
/*     */   }
/*     */ 
/*     */   public String getH03OPECOD()
/*     */   {
/* 356 */     return this.fieldH03OPECOD.getString();
/*     */   }
/*     */ 
/*     */   public String getH03PROGRM()
/*     */   {
/* 363 */     return this.fieldH03PROGRM.getString();
/*     */   }
/*     */ 
/*     */   public String getH03SCRCOD()
/*     */   {
/* 370 */     return this.fieldH03SCRCOD.getString();
/*     */   }
/*     */ 
/*     */   public String getH03TIMSYS()
/*     */   {
/* 377 */     return this.fieldH03TIMSYS.getString();
/*     */   }
/*     */ 
/*     */   public String getH03USERID()
/*     */   {
/* 384 */     return this.fieldH03USERID.getString();
/*     */   }
/*     */ 
/*     */   public void setE03PAGACC(String newvalue)
/*     */   {
/* 391 */     this.fieldE03PAGACC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setE03PAGACC(BigDecimal newvalue)
/*     */   {
/* 398 */     this.fieldE03PAGACC.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setE03PAGCCY(String newvalue)
/*     */   {
/* 405 */     this.fieldE03PAGCCY.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setE03PAGCOM(String newvalue)
/*     */   {
/* 412 */     this.fieldE03PAGCOM.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setE03PAGCOM(BigDecimal newvalue)
/*     */   {
/* 419 */     this.fieldE03PAGCOM.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setE03PAGDED(String newvalue)
/*     */   {
/* 426 */     this.fieldE03PAGDED.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setE03PAGDED(BigDecimal newvalue)
/*     */   {
/* 433 */     this.fieldE03PAGDED.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setE03PAGFLG(String newvalue)
/*     */   {
/* 440 */     this.fieldE03PAGFLG.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setE03PAGIMP(String newvalue)
/*     */   {
/* 447 */     this.fieldE03PAGIMP.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setE03PAGIMP(BigDecimal newvalue)
/*     */   {
/* 454 */     this.fieldE03PAGIMP.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setE03PAGINT(String newvalue)
/*     */   {
/* 461 */     this.fieldE03PAGINT.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setE03PAGINT(BigDecimal newvalue)
/*     */   {
/* 468 */     this.fieldE03PAGINT.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setE03PAGIVA(String newvalue)
/*     */   {
/* 475 */     this.fieldE03PAGIVA.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setE03PAGIVA(BigDecimal newvalue)
/*     */   {
/* 482 */     this.fieldE03PAGIVA.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setE03PAGMOR(String newvalue)
/*     */   {
/* 489 */     this.fieldE03PAGMOR.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setE03PAGMOR(BigDecimal newvalue)
/*     */   {
/* 496 */     this.fieldE03PAGMOR.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setE03PAGOAC(String newvalue)
/*     */   {
/* 503 */     this.fieldE03PAGOAC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setE03PAGOAC(BigDecimal newvalue)
/*     */   {
/* 510 */     this.fieldE03PAGOAC.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setE03PAGPRI(String newvalue)
/*     */   {
/* 517 */     this.fieldE03PAGPRI.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setE03PAGPRI(BigDecimal newvalue)
/*     */   {
/* 524 */     this.fieldE03PAGPRI.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setE03PAGREA(String newvalue)
/*     */   {
/* 531 */     this.fieldE03PAGREA.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setE03PAGREA(BigDecimal newvalue)
/*     */   {
/* 538 */     this.fieldE03PAGREA.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setE03PAGTOT(String newvalue)
/*     */   {
/* 545 */     this.fieldE03PAGTOT.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setE03PAGTOT(BigDecimal newvalue)
/*     */   {
/* 552 */     this.fieldE03PAGTOT.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setH03FLGMAS(String newvalue)
/*     */   {
/* 559 */     this.fieldH03FLGMAS.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setH03FLGWK1(String newvalue)
/*     */   {
/* 566 */     this.fieldH03FLGWK1.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setH03FLGWK2(String newvalue)
/*     */   {
/* 573 */     this.fieldH03FLGWK2.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setH03FLGWK3(String newvalue)
/*     */   {
/* 580 */     this.fieldH03FLGWK3.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setH03OPECOD(String newvalue)
/*     */   {
/* 587 */     this.fieldH03OPECOD.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setH03PROGRM(String newvalue)
/*     */   {
/* 594 */     this.fieldH03PROGRM.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setH03SCRCOD(String newvalue)
/*     */   {
/* 601 */     this.fieldH03SCRCOD.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setH03TIMSYS(String newvalue)
/*     */   {
/* 608 */     this.fieldH03TIMSYS.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setH03USERID(String newvalue)
/*     */   {
/* 615 */     this.fieldH03USERID.setString(newvalue);
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.IN098003Message
 * JD-Core Version:    0.6.0
 */