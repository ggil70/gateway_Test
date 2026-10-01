/*     */ package com.activo.gateway.dibs.messages;
/*     */ 
/*     */ import java.math.BigDecimal;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*     */ 
/*     */ public class EDL030003Message extends MessageRecord
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
/*  29 */   private DecimalField fieldE03NUMACC = null;
/*  30 */   private DecimalField fieldE03INIDT1 = null;
/*  31 */   private DecimalField fieldE03INIDT2 = null;
/*  32 */   private DecimalField fieldE03INIDT3 = null;
/*  33 */   private DecimalField fieldE03ENDDT1 = null;
/*  34 */   private DecimalField fieldE03ENDDT2 = null;
/*  35 */   private DecimalField fieldE03ENDDT3 = null;
/*  36 */   private CharacterField fieldE03TRACDE = null;
/*  37 */   private DecimalField fieldE03PRIAMN = null;
/*  38 */   private DecimalField fieldE03INTRTE = null;
/*  39 */   private DecimalField fieldE03NUMDYS = null;
/*  40 */   private DecimalField fieldE03INTAMN = null;
/*  41 */   private CharacterField fieldE03INDOPE = null;
/*     */ 
/*     */   public EDL030003Message()
/*     */   {
/*  48 */     createFields();
/*  49 */     initialize();
/*     */   }
/*     */ 
/*     */   protected void createFields()
/*     */   {
/*  58 */     this.recordsize = 126;
/*  59 */     this.fileid = "1001020190654";
/*  60 */     this.recordid = "3BD509F504439";
/*  61 */     this.message = new byte[getByteLength()];
/*  62 */     this.formatname = "EDL030003";
/*  63 */     this.fieldnames = new String[22];
/*  64 */     this.tagnames = new String[22];
/*  65 */     this.fields = new MessageField[22];
/*     */ 
/*  67 */     this.fieldnames[0] = "H03USERID";
/*  68 */     this.tagnames[0] = "H03USERID";
/*     */      this.fields[0]=this.fieldH03USERID=new CharacterField(this.message, 10, 10, "H03USERID");
/*     */ 
/*  71 */     this.fieldnames[1] = "H03PROGRM";
/*  72 */     this.tagnames[1] = "H03PROGRM";
/*     */      this.fields[1]=this.fieldH03PROGRM=new CharacterField(this.message, 20, 10, "H03PROGRM");
/*     */ 
/*  75 */     this.fieldnames[2] = "H03TIMSYS";
/*  76 */     this.tagnames[2] = "H03TIMSYS";
/*     */      this.fields[2]=this.fieldH03TIMSYS=new CharacterField(this.message, 30, 12, "H03TIMSYS");
/*     */ 
/*  79 */     this.fieldnames[3] = "H03SCRCOD";
/*  80 */     this.tagnames[3] = "H03SCRCOD";
/*     */      this.fields[3]=this.fieldH03SCRCOD=new CharacterField(this.message, 42, 2, "H03SCRCOD");
/*     */ 
/*  83 */     this.fieldnames[4] = "H03OPECOD";
/*  84 */     this.tagnames[4] = "H03OPECOD";
/*     */      this.fields[4]=this.fieldH03OPECOD=new CharacterField(this.message, 44, 4, "H03OPECOD");
/*     */ 
/*  87 */     this.fieldnames[5] = "H03FLGMAS";
/*  88 */     this.tagnames[5] = "H03FLGMAS";
/*     */      this.fields[5]=this.fieldH03FLGMAS=new CharacterField(this.message, 48, 1, "H03FLGMAS");
/*     */ 
/*  91 */     this.fieldnames[6] = "H03FLGWK1";
/*  92 */     this.tagnames[6] = "H03FLGWK1";
/*     */      this.fields[6]=this.fieldH03FLGWK1=new CharacterField(this.message, 49, 1, "H03FLGWK1");
/*     */ 
/*  95 */     this.fieldnames[7] = "H03FLGWK2";
/*  96 */     this.tagnames[7] = "H03FLGWK2";
/*     */      this.fields[7]=this.fieldH03FLGWK2=new CharacterField(this.message, 50, 1, "H03FLGWK2");
/*     */ 
/*  99 */     this.fieldnames[8] = "H03FLGWK3";
/* 100 */     this.tagnames[8] = "H03FLGWK3";
/*     */      this.fields[8]=this.fieldH03FLGWK3=new CharacterField(this.message, 51, 1, "H03FLGWK3");
/*     */ 
/* 103 */     this.fieldnames[9] = "E03NUMACC";
/* 104 */     this.tagnames[9] = "E03NUMACC";
/*     */      this.fields[9]=this.fieldE03NUMACC=new DecimalField(this.message, 52, 13, 0, "E03NUMACC");
/*     */ 
/* 107 */     this.fieldnames[10] = "E03INIDT1";
/* 108 */     this.tagnames[10] = "E03INIDT1";
/*     */      this.fields[10]=this.fieldE03INIDT1=new DecimalField(this.message, 65, 3, 0, "E03INIDT1");
/*     */ 
/* 111 */     this.fieldnames[11] = "E03INIDT2";
/* 112 */     this.tagnames[11] = "E03INIDT2";
/*     */      this.fields[11]=this.fieldE03INIDT2=new DecimalField(this.message, 68, 3, 0, "E03INIDT2");
/*     */ 
/* 115 */     this.fieldnames[12] = "E03INIDT3";
/* 116 */     this.tagnames[12] = "E03INIDT3";
/*     */      this.fields[12]=this.fieldE03INIDT3=new DecimalField(this.message, 71, 3, 0, "E03INIDT3");
/*     */ 
/* 119 */     this.fieldnames[13] = "E03ENDDT1";
/* 120 */     this.tagnames[13] = "E03ENDDT1";
/*     */      this.fields[13]=this.fieldE03ENDDT1=new DecimalField(this.message, 74, 3, 0, "E03ENDDT1");
/*     */ 
/* 123 */     this.fieldnames[14] = "E03ENDDT2";
/* 124 */     this.tagnames[14] = "E03ENDDT2";
/*     */      this.fields[14]=this.fieldE03ENDDT2=new DecimalField(this.message, 77, 3, 0, "E03ENDDT2");
/*     */ 
/* 127 */     this.fieldnames[15] = "E03ENDDT3";
/* 128 */     this.tagnames[15] = "E03ENDDT3";
/*     */      this.fields[15]=this.fieldE03ENDDT3=new DecimalField(this.message, 80, 3, 0, "E03ENDDT3");
/*     */ 
/* 131 */     this.fieldnames[16] = "E03TRACDE";
/* 132 */     this.tagnames[16] = "E03TRACDE";
/*     */      this.fields[16]=this.fieldE03TRACDE=new CharacterField(this.message, 83, 2, "E03TRACDE");
/*     */ 
/* 135 */     this.fieldnames[17] = "E03PRIAMN";
/* 136 */     this.tagnames[17] = "E03PRIAMN";
/*     */      this.fields[17]=this.fieldE03PRIAMN=new DecimalField(this.message, 85, 17, 2, "E03PRIAMN");
/*     */ 
/* 139 */     this.fieldnames[18] = "E03INTRTE";
/* 140 */     this.tagnames[18] = "E03INTRTE";
/*     */      this.fields[18]=this.fieldE03INTRTE=new DecimalField(this.message, 102, 11, 6, "E03INTRTE");
/*     */ 
/* 143 */     this.fieldnames[19] = "E03NUMDYS";
/* 144 */     this.tagnames[19] = "E03NUMDYS";
/*     */      this.fields[19]=this.fieldE03NUMDYS=new DecimalField(this.message, 113, 5, 0, "E03NUMDYS");
/*     */ 
/* 147 */     this.fieldnames[20] = "E03INTAMN";
/* 148 */     this.tagnames[20] = "E03INTAMN";
/*     */      this.fields[20]=this.fieldE03INTAMN=new DecimalField(this.message, 118, 17, 2, "E03INTAMN");
/*     */ 
/* 151 */     this.fieldnames[21] = "E03INDOPE";
/* 152 */     this.tagnames[21] = "E03INDOPE";
/*     */      this.fields[21]=this.fieldE03INDOPE=new CharacterField(this.message, 135, 1, "E03INDOPE");
/*     */   }
/*     */ 
/*     */   public void setH03USERID(String newvalue)
/*     */   {
/* 162 */     this.fieldH03USERID.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getH03USERID()
/*     */   {
/* 170 */     return this.fieldH03USERID.getString();
/*     */   }
/*     */ 
/*     */   public void setH03PROGRM(String newvalue)
/*     */   {
/* 178 */     this.fieldH03PROGRM.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getH03PROGRM()
/*     */   {
/* 186 */     return this.fieldH03PROGRM.getString();
/*     */   }
/*     */ 
/*     */   public void setH03TIMSYS(String newvalue)
/*     */   {
/* 194 */     this.fieldH03TIMSYS.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getH03TIMSYS()
/*     */   {
/* 202 */     return this.fieldH03TIMSYS.getString();
/*     */   }
/*     */ 
/*     */   public void setH03SCRCOD(String newvalue)
/*     */   {
/* 210 */     this.fieldH03SCRCOD.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getH03SCRCOD()
/*     */   {
/* 218 */     return this.fieldH03SCRCOD.getString();
/*     */   }
/*     */ 
/*     */   public void setH03OPECOD(String newvalue)
/*     */   {
/* 226 */     this.fieldH03OPECOD.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getH03OPECOD()
/*     */   {
/* 234 */     return this.fieldH03OPECOD.getString();
/*     */   }
/*     */ 
/*     */   public void setH03FLGMAS(String newvalue)
/*     */   {
/* 242 */     this.fieldH03FLGMAS.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getH03FLGMAS()
/*     */   {
/* 250 */     return this.fieldH03FLGMAS.getString();
/*     */   }
/*     */ 
/*     */   public void setH03FLGWK1(String newvalue)
/*     */   {
/* 258 */     this.fieldH03FLGWK1.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getH03FLGWK1()
/*     */   {
/* 266 */     return this.fieldH03FLGWK1.getString();
/*     */   }
/*     */ 
/*     */   public void setH03FLGWK2(String newvalue)
/*     */   {
/* 274 */     this.fieldH03FLGWK2.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getH03FLGWK2()
/*     */   {
/* 282 */     return this.fieldH03FLGWK2.getString();
/*     */   }
/*     */ 
/*     */   public void setH03FLGWK3(String newvalue)
/*     */   {
/* 290 */     this.fieldH03FLGWK3.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getH03FLGWK3()
/*     */   {
/* 298 */     return this.fieldH03FLGWK3.getString();
/*     */   }
/*     */ 
/*     */   public void setE03NUMACC(String newvalue)
/*     */   {
/* 306 */     this.fieldE03NUMACC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getE03NUMACC()
/*     */   {
/* 314 */     return this.fieldE03NUMACC.getString();
/*     */   }
/*     */ 
/*     */   public void setE03NUMACC(BigDecimal newvalue)
/*     */   {
/* 322 */     this.fieldE03NUMACC.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalE03NUMACC()
/*     */   {
/* 330 */     return this.fieldE03NUMACC.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setE03INIDT1(String newvalue)
/*     */   {
/* 338 */     this.fieldE03INIDT1.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getE03INIDT1()
/*     */   {
/* 346 */     return this.fieldE03INIDT1.getString();
/*     */   }
/*     */ 
/*     */   public void setE03INIDT1(BigDecimal newvalue)
/*     */   {
/* 354 */     this.fieldE03INIDT1.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalE03INIDT1()
/*     */   {
/* 362 */     return this.fieldE03INIDT1.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setE03INIDT2(String newvalue)
/*     */   {
/* 370 */     this.fieldE03INIDT2.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getE03INIDT2()
/*     */   {
/* 378 */     return this.fieldE03INIDT2.getString();
/*     */   }
/*     */ 
/*     */   public void setE03INIDT2(BigDecimal newvalue)
/*     */   {
/* 386 */     this.fieldE03INIDT2.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalE03INIDT2()
/*     */   {
/* 394 */     return this.fieldE03INIDT2.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setE03INIDT3(String newvalue)
/*     */   {
/* 402 */     this.fieldE03INIDT3.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getE03INIDT3()
/*     */   {
/* 410 */     return this.fieldE03INIDT3.getString();
/*     */   }
/*     */ 
/*     */   public void setE03INIDT3(BigDecimal newvalue)
/*     */   {
/* 418 */     this.fieldE03INIDT3.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalE03INIDT3()
/*     */   {
/* 426 */     return this.fieldE03INIDT3.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setE03ENDDT1(String newvalue)
/*     */   {
/* 434 */     this.fieldE03ENDDT1.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getE03ENDDT1()
/*     */   {
/* 442 */     return this.fieldE03ENDDT1.getString();
/*     */   }
/*     */ 
/*     */   public void setE03ENDDT1(BigDecimal newvalue)
/*     */   {
/* 450 */     this.fieldE03ENDDT1.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalE03ENDDT1()
/*     */   {
/* 458 */     return this.fieldE03ENDDT1.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setE03ENDDT2(String newvalue)
/*     */   {
/* 466 */     this.fieldE03ENDDT2.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getE03ENDDT2()
/*     */   {
/* 474 */     return this.fieldE03ENDDT2.getString();
/*     */   }
/*     */ 
/*     */   public void setE03ENDDT2(BigDecimal newvalue)
/*     */   {
/* 482 */     this.fieldE03ENDDT2.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalE03ENDDT2()
/*     */   {
/* 490 */     return this.fieldE03ENDDT2.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setE03ENDDT3(String newvalue)
/*     */   {
/* 498 */     this.fieldE03ENDDT3.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getE03ENDDT3()
/*     */   {
/* 506 */     return this.fieldE03ENDDT3.getString();
/*     */   }
/*     */ 
/*     */   public void setE03ENDDT3(BigDecimal newvalue)
/*     */   {
/* 514 */     this.fieldE03ENDDT3.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalE03ENDDT3()
/*     */   {
/* 522 */     return this.fieldE03ENDDT3.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setE03TRACDE(String newvalue)
/*     */   {
/* 530 */     this.fieldE03TRACDE.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getE03TRACDE()
/*     */   {
/* 538 */     return this.fieldE03TRACDE.getString();
/*     */   }
/*     */ 
/*     */   public void setE03PRIAMN(String newvalue)
/*     */   {
/* 546 */     this.fieldE03PRIAMN.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getE03PRIAMN()
/*     */   {
/* 554 */     return this.fieldE03PRIAMN.getString();
/*     */   }
/*     */ 
/*     */   public void setE03PRIAMN(BigDecimal newvalue)
/*     */   {
/* 562 */     this.fieldE03PRIAMN.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalE03PRIAMN()
/*     */   {
/* 570 */     return this.fieldE03PRIAMN.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setE03INTRTE(String newvalue)
/*     */   {
/* 578 */     this.fieldE03INTRTE.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getE03INTRTE()
/*     */   {
/* 586 */     return this.fieldE03INTRTE.getString();
/*     */   }
/*     */ 
/*     */   public void setE03INTRTE(BigDecimal newvalue)
/*     */   {
/* 594 */     this.fieldE03INTRTE.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalE03INTRTE()
/*     */   {
/* 602 */     return this.fieldE03INTRTE.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setE03NUMDYS(String newvalue)
/*     */   {
/* 610 */     this.fieldE03NUMDYS.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getE03NUMDYS()
/*     */   {
/* 618 */     return this.fieldE03NUMDYS.getString();
/*     */   }
/*     */ 
/*     */   public void setE03NUMDYS(BigDecimal newvalue)
/*     */   {
/* 626 */     this.fieldE03NUMDYS.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalE03NUMDYS()
/*     */   {
/* 634 */     return this.fieldE03NUMDYS.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setE03INTAMN(String newvalue)
/*     */   {
/* 642 */     this.fieldE03INTAMN.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getE03INTAMN()
/*     */   {
/* 650 */     return this.fieldE03INTAMN.getString();
/*     */   }
/*     */ 
/*     */   public void setE03INTAMN(BigDecimal newvalue)
/*     */   {
/* 658 */     this.fieldE03INTAMN.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalE03INTAMN()
/*     */   {
/* 666 */     return this.fieldE03INTAMN.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setE03INDOPE(String newvalue)
/*     */   {
/* 674 */     this.fieldE03INDOPE.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getE03INDOPE()
/*     */   {
/* 682 */     return this.fieldE03INDOPE.getString();
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.EDL030003Message
 * JD-Core Version:    0.6.0
 */