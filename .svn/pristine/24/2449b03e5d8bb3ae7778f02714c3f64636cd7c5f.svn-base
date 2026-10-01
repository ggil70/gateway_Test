/*     */ package com.activo.gateway.dibs.messages;
/*     */ 
/*     */ import java.math.BigDecimal;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*     */ 
/*     */ public class IN098001Message extends MessageRecord
/*     */ {
/*  19 */   final int FIELDCOUNT = 22;
/*  20 */   private CharacterField fieldH01USERID = null;
/*  21 */   private CharacterField fieldH01PROGRM = null;
/*  22 */   private CharacterField fieldH01TIMSYS = null;
/*  23 */   private CharacterField fieldH01SCRCOD = null;
/*  24 */   private CharacterField fieldH01OPECOD = null;
/*  25 */   private CharacterField fieldH01FLGMAS = null;
/*  26 */   private CharacterField fieldH01FLGWK1 = null;
/*  27 */   private CharacterField fieldH01FLGWK2 = null;
/*  28 */   private CharacterField fieldH01FLGWK3 = null;
/*  29 */   private DecimalField fieldE01DEAACC = null;
/*  30 */   private DecimalField fieldE01DEABRN = null;
/*  31 */   private CharacterField fieldE01DEACCY = null;
/*  32 */   private DecimalField fieldE01DEAMEP = null;
/*  33 */   private DecimalField fieldE01DEAMEI = null;
/*  34 */   private DecimalField fieldE01DEAMEM = null;
/*  35 */   private DecimalField fieldE01DEADED = null;
/*  36 */   private DecimalField fieldE01TOTDUE = null;
/*  37 */   private DecimalField fieldE01DEARTE = null;
/*  38 */   private CharacterField fieldE01NICKNM = null;
/*  39 */   private DecimalField fieldE01MATDT1 = null;
/*  40 */   private DecimalField fieldE01MATDT2 = null;
/*  41 */   private DecimalField fieldE01MATDT3 = null;
/*     */ 
/*     */   public IN098001Message()
/*     */   {
/*  48 */     createFields();
/*  49 */     initialize();
/*     */   }
/*     */ 
/*     */   protected void createFields()
/*     */   {
/*  57 */     this.recordsize = 197;
/*  58 */     this.fileid = "1000803180134";
/*  59 */     this.recordid = "4571E5A444806";
/*  60 */     this.message = new byte[getByteLength()];
/*  61 */     this.formatname = "IN098001";
/*  62 */     this.fieldnames = new String[22];
/*  63 */     this.tagnames = new String[22];
/*  64 */     this.fields = new MessageField[22];
/*     */ 
/*  66 */     this.fieldnames[0] = "H01USERID";
/*  67 */     this.tagnames[0] = "H01USERID";
/*     */      this.fields[0]=this.fieldH01USERID=new CharacterField(this.message, 10, 10, "H01USERID");
/*     */ 
/*  70 */     this.fieldnames[1] = "H01PROGRM";
/*  71 */     this.tagnames[1] = "H01PROGRM";
/*     */      this.fields[1]=this.fieldH01PROGRM=new CharacterField(this.message, 20, 10, "H01PROGRM");
/*     */ 
/*  74 */     this.fieldnames[2] = "H01TIMSYS";
/*  75 */     this.tagnames[2] = "H01TIMSYS";
/*     */      this.fields[2]=this.fieldH01TIMSYS=new CharacterField(this.message, 30, 12, "H01TIMSYS");
/*     */ 
/*  78 */     this.fieldnames[3] = "H01SCRCOD";
/*  79 */     this.tagnames[3] = "H01SCRCOD";
/*     */      this.fields[3]=this.fieldH01SCRCOD=new CharacterField(this.message, 42, 2, "H01SCRCOD");
/*     */ 
/*  82 */     this.fieldnames[4] = "H01OPECOD";
/*  83 */     this.tagnames[4] = "H01OPECOD";
/*     */      this.fields[4]=this.fieldH01OPECOD=new CharacterField(this.message, 44, 4, "H01OPECOD");
/*     */ 
/*  86 */     this.fieldnames[5] = "H01FLGMAS";
/*  87 */     this.tagnames[5] = "H01FLGMAS";
/*     */      this.fields[5]=this.fieldH01FLGMAS=new CharacterField(this.message, 48, 1, "H01FLGMAS");
/*     */ 
/*  90 */     this.fieldnames[6] = "H01FLGWK1";
/*  91 */     this.tagnames[6] = "H01FLGWK1";
/*     */      this.fields[6]=this.fieldH01FLGWK1=new CharacterField(this.message, 49, 1, "H01FLGWK1");
/*     */ 
/*  94 */     this.fieldnames[7] = "H01FLGWK2";
/*  95 */     this.tagnames[7] = "H01FLGWK2";
/*     */      this.fields[7]=this.fieldH01FLGWK2=new CharacterField(this.message, 50, 1, "H01FLGWK2");
/*     */ 
/*  98 */     this.fieldnames[8] = "H01FLGWK3";
/*  99 */     this.tagnames[8] = "H01FLGWK3";
/*     */      this.fields[8]=this.fieldH01FLGWK3=new CharacterField(this.message, 51, 1, "H01FLGWK3");
/*     */ 
/* 102 */     this.fieldnames[9] = "E01DEAACC";
/* 103 */     this.tagnames[9] = "E01DEAACC";
/*     */      this.fields[9]=this.fieldE01DEAACC=new DecimalField(this.message, 52, 13, 0, "E01DEAACC");
/*     */ 
/* 106 */     this.fieldnames[10] = "E01DEABRN";
/* 107 */     this.tagnames[10] = "E01DEABRN";
/*     */      this.fields[10]=this.fieldE01DEABRN=new DecimalField(this.message, 65, 4, 0, "E01DEABRN");
/*     */ 
/* 110 */     this.fieldnames[11] = "E01DEACCY";
/* 111 */     this.tagnames[11] = "E01DEACCY";
/*     */      this.fields[11]=this.fieldE01DEACCY=new CharacterField(this.message, 69, 3, "E01DEACCY");
/*     */ 
/* 114 */     this.fieldnames[12] = "E01DEAMEP";
/* 115 */     this.tagnames[12] = "E01DEAMEP";
/*     */      this.fields[12]=this.fieldE01DEAMEP=new DecimalField(this.message, 72, 17, 2, "E01DEAMEP");
/*     */ 
/* 118 */     this.fieldnames[13] = "E01DEAMEI";
/* 119 */     this.tagnames[13] = "E01DEAMEI";
/*     */      this.fields[13]=this.fieldE01DEAMEI=new DecimalField(this.message, 89, 17, 2, "E01DEAMEI");
/*     */ 
/* 122 */     this.fieldnames[14] = "E01DEAMEM";
/* 123 */     this.tagnames[14] = "E01DEAMEM";
/*     */      this.fields[14]=this.fieldE01DEAMEM=new DecimalField(this.message, 106, 17, 2, "E01DEAMEM");
/*     */ 
/* 126 */     this.fieldnames[15] = "E01DEADED";
/* 127 */     this.tagnames[15] = "E01DEADED";
/*     */      this.fields[15]=this.fieldE01DEADED=new DecimalField(this.message, 123, 17, 2, "E01DEADED");
/*     */ 
/* 130 */     this.fieldnames[16] = "E01TOTDUE";
/* 131 */     this.tagnames[16] = "E01TOTDUE";
/*     */      this.fields[16]=this.fieldE01TOTDUE=new DecimalField(this.message, 140, 17, 2, "E01TOTDUE");
/*     */ 
/* 134 */     this.fieldnames[17] = "E01DEARTE";
/* 135 */     this.tagnames[17] = "E01DEARTE";
/*     */      this.fields[17]=this.fieldE01DEARTE=new DecimalField(this.message, 157, 11, 6, "E01DEARTE");
/*     */ 
/* 138 */     this.fieldnames[18] = "E01NICKNM";
/* 139 */     this.tagnames[18] = "E01NICKNM";
/*     */      this.fields[18]=this.fieldE01NICKNM=new CharacterField(this.message, 168, 30, "E01NICKNM");
/*     */ 
/* 142 */     this.fieldnames[19] = "E01MATDT1";
/* 143 */     this.tagnames[19] = "E01MATDT1";
/*     */      this.fields[19]=this.fieldE01MATDT1=new DecimalField(this.message, 198, 3, 0, "E01MATDT1");
/*     */ 
/* 146 */     this.fieldnames[20] = "E01MATDT2";
/* 147 */     this.tagnames[20] = "E01MATDT2";
/*     */      this.fields[20]=this.fieldE01MATDT2=new DecimalField(this.message, 201, 3, 0, "E01MATDT2");
/*     */ 
/* 150 */     this.fieldnames[21] = "E01MATDT3";
/* 151 */     this.tagnames[21] = "E01MATDT3";
/*     */      this.fields[21]=this.fieldE01MATDT3=new DecimalField(this.message, 204, 3, 0, "E01MATDT3");
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalE01DEAACC()
/*     */   {
/* 160 */     return this.fieldE01DEAACC.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalE01DEABRN()
/*     */   {
/* 167 */     return this.fieldE01DEABRN.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalE01DEADED()
/*     */   {
/* 174 */     return this.fieldE01DEADED.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalE01DEAMEI()
/*     */   {
/* 181 */     return this.fieldE01DEAMEI.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalE01DEAMEM()
/*     */   {
/* 188 */     return this.fieldE01DEAMEM.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalE01DEAMEP()
/*     */   {
/* 195 */     return this.fieldE01DEAMEP.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalE01DEARTE()
/*     */   {
/* 202 */     return this.fieldE01DEARTE.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalE01MATDT1()
/*     */   {
/* 209 */     return this.fieldE01MATDT1.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalE01MATDT2()
/*     */   {
/* 216 */     return this.fieldE01MATDT2.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalE01MATDT3()
/*     */   {
/* 223 */     return this.fieldE01MATDT3.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalE01TOTDUE()
/*     */   {
/* 230 */     return this.fieldE01TOTDUE.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public String getE01DEAACC()
/*     */   {
/* 237 */     return this.fieldE01DEAACC.getString();
/*     */   }
/*     */ 
/*     */   public String getE01DEABRN()
/*     */   {
/* 244 */     return this.fieldE01DEABRN.getString();
/*     */   }
/*     */ 
/*     */   public String getE01DEACCY()
/*     */   {
/* 251 */     return this.fieldE01DEACCY.getString();
/*     */   }
/*     */ 
/*     */   public String getE01DEADED()
/*     */   {
/* 258 */     return this.fieldE01DEADED.getString();
/*     */   }
/*     */ 
/*     */   public String getE01DEAMEI()
/*     */   {
/* 265 */     return this.fieldE01DEAMEI.getString();
/*     */   }
/*     */ 
/*     */   public String getE01DEAMEM()
/*     */   {
/* 272 */     return this.fieldE01DEAMEM.getString();
/*     */   }
/*     */ 
/*     */   public String getE01DEAMEP()
/*     */   {
/* 279 */     return this.fieldE01DEAMEP.getString();
/*     */   }
/*     */ 
/*     */   public String getE01DEARTE()
/*     */   {
/* 286 */     return this.fieldE01DEARTE.getString();
/*     */   }
/*     */ 
/*     */   public String getE01MATDT1()
/*     */   {
/* 293 */     return this.fieldE01MATDT1.getString();
/*     */   }
/*     */ 
/*     */   public String getE01MATDT2()
/*     */   {
/* 300 */     return this.fieldE01MATDT2.getString();
/*     */   }
/*     */ 
/*     */   public String getE01MATDT3()
/*     */   {
/* 307 */     return this.fieldE01MATDT3.getString();
/*     */   }
/*     */ 
/*     */   public String getE01NICKNM()
/*     */   {
/* 314 */     return this.fieldE01NICKNM.getString();
/*     */   }
/*     */ 
/*     */   public String getE01TOTDUE()
/*     */   {
/* 321 */     return this.fieldE01TOTDUE.getString();
/*     */   }
/*     */ 
/*     */   public String getH01FLGMAS()
/*     */   {
/* 328 */     return this.fieldH01FLGMAS.getString();
/*     */   }
/*     */ 
/*     */   public String getH01FLGWK1()
/*     */   {
/* 335 */     return this.fieldH01FLGWK1.getString();
/*     */   }
/*     */ 
/*     */   public String getH01FLGWK2()
/*     */   {
/* 342 */     return this.fieldH01FLGWK2.getString();
/*     */   }
/*     */ 
/*     */   public String getH01FLGWK3()
/*     */   {
/* 349 */     return this.fieldH01FLGWK3.getString();
/*     */   }
/*     */ 
/*     */   public String getH01OPECOD()
/*     */   {
/* 356 */     return this.fieldH01OPECOD.getString();
/*     */   }
/*     */ 
/*     */   public String getH01PROGRM()
/*     */   {
/* 363 */     return this.fieldH01PROGRM.getString();
/*     */   }
/*     */ 
/*     */   public String getH01SCRCOD()
/*     */   {
/* 370 */     return this.fieldH01SCRCOD.getString();
/*     */   }
/*     */ 
/*     */   public String getH01TIMSYS()
/*     */   {
/* 377 */     return this.fieldH01TIMSYS.getString();
/*     */   }
/*     */ 
/*     */   public String getH01USERID()
/*     */   {
/* 384 */     return this.fieldH01USERID.getString();
/*     */   }
/*     */ 
/*     */   public void setE01DEAACC(String newvalue)
/*     */   {
/* 391 */     this.fieldE01DEAACC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setE01DEAACC(BigDecimal newvalue)
/*     */   {
/* 398 */     this.fieldE01DEAACC.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setE01DEABRN(String newvalue)
/*     */   {
/* 405 */     this.fieldE01DEABRN.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setE01DEABRN(BigDecimal newvalue)
/*     */   {
/* 412 */     this.fieldE01DEABRN.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setE01DEACCY(String newvalue)
/*     */   {
/* 419 */     this.fieldE01DEACCY.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setE01DEADED(String newvalue)
/*     */   {
/* 426 */     this.fieldE01DEADED.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setE01DEADED(BigDecimal newvalue)
/*     */   {
/* 433 */     this.fieldE01DEADED.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setE01DEAMEI(String newvalue)
/*     */   {
/* 440 */     this.fieldE01DEAMEI.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setE01DEAMEI(BigDecimal newvalue)
/*     */   {
/* 447 */     this.fieldE01DEAMEI.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setE01DEAMEM(String newvalue)
/*     */   {
/* 454 */     this.fieldE01DEAMEM.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setE01DEAMEM(BigDecimal newvalue)
/*     */   {
/* 461 */     this.fieldE01DEAMEM.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setE01DEAMEP(String newvalue)
/*     */   {
/* 468 */     this.fieldE01DEAMEP.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setE01DEAMEP(BigDecimal newvalue)
/*     */   {
/* 475 */     this.fieldE01DEAMEP.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setE01DEARTE(String newvalue)
/*     */   {
/* 482 */     this.fieldE01DEARTE.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setE01DEARTE(BigDecimal newvalue)
/*     */   {
/* 489 */     this.fieldE01DEARTE.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setE01MATDT1(String newvalue)
/*     */   {
/* 496 */     this.fieldE01MATDT1.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setE01MATDT1(BigDecimal newvalue)
/*     */   {
/* 503 */     this.fieldE01MATDT1.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setE01MATDT2(String newvalue)
/*     */   {
/* 510 */     this.fieldE01MATDT2.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setE01MATDT2(BigDecimal newvalue)
/*     */   {
/* 517 */     this.fieldE01MATDT2.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setE01MATDT3(String newvalue)
/*     */   {
/* 524 */     this.fieldE01MATDT3.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setE01MATDT3(BigDecimal newvalue)
/*     */   {
/* 531 */     this.fieldE01MATDT3.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setE01NICKNM(String newvalue)
/*     */   {
/* 538 */     this.fieldE01NICKNM.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setE01TOTDUE(String newvalue)
/*     */   {
/* 545 */     this.fieldE01TOTDUE.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setE01TOTDUE(BigDecimal newvalue)
/*     */   {
/* 552 */     this.fieldE01TOTDUE.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setH01FLGMAS(String newvalue)
/*     */   {
/* 559 */     this.fieldH01FLGMAS.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setH01FLGWK1(String newvalue)
/*     */   {
/* 566 */     this.fieldH01FLGWK1.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setH01FLGWK2(String newvalue)
/*     */   {
/* 573 */     this.fieldH01FLGWK2.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setH01FLGWK3(String newvalue)
/*     */   {
/* 580 */     this.fieldH01FLGWK3.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setH01OPECOD(String newvalue)
/*     */   {
/* 587 */     this.fieldH01OPECOD.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setH01PROGRM(String newvalue)
/*     */   {
/* 594 */     this.fieldH01PROGRM.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setH01SCRCOD(String newvalue)
/*     */   {
/* 601 */     this.fieldH01SCRCOD.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setH01TIMSYS(String newvalue)
/*     */   {
/* 608 */     this.fieldH01TIMSYS.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setH01USERID(String newvalue)
/*     */   {
/* 615 */     this.fieldH01USERID.setString(newvalue);
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.IN098001Message
 * JD-Core Version:    0.6.0
 */