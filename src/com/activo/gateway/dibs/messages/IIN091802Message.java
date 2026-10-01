/*     */ package com.activo.gateway.dibs.messages;
/*     */ 
/*     */ import java.math.BigDecimal;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*     */ 
/*     */ public class IIN091802Message extends MessageRecord
/*     */ {
/*  19 */   final int FIELDCOUNT = 22;
/*  20 */   private CharacterField fieldH02USERID = null;
/*  21 */   private CharacterField fieldH02PROGRM = null;
/*  22 */   private CharacterField fieldH02TIMSYS = null;
/*  23 */   private CharacterField fieldH02SCRCOD = null;
/*  24 */   private CharacterField fieldH02OPECOD = null;
/*  25 */   private CharacterField fieldH02FLGMAS = null;
/*  26 */   private CharacterField fieldH02FLGWK1 = null;
/*  27 */   private CharacterField fieldH02FLGWK2 = null;
/*  28 */   private CharacterField fieldH02FLGWK3 = null;
/*  29 */   private DecimalField fieldI02ACMACC = null;
/*  30 */   private DecimalField fieldI02MATDT1 = null;
/*  31 */   private DecimalField fieldI02MATDT2 = null;
/*  32 */   private DecimalField fieldI02MATDT3 = null;
/*  33 */   private DecimalField fieldI02NUMACC = null;
/*  34 */   private CharacterField fieldI02CURRCY = null;
/*  35 */   private CharacterField fieldI02ACTYPE = null;
/*  36 */   private DecimalField fieldI02ACRATE = null;
/*  37 */   private DecimalField fieldI02BALPRI = null;
/*  38 */   private DecimalField fieldI02BALANC = null;
/*  39 */   private DecimalField fieldI02ACTERM = null;
/*  40 */   private DecimalField fieldI02NUMREC = null;
/*  41 */   private CharacterField fieldI02INDOPE = null;
/*     */ 
/*     */   public IIN091802Message()
/*     */   {
/*  48 */     createFields();
/*  49 */     initialize();
/*     */   }
/*     */ 
/*     */   protected void createFields()
/*     */   {
/*  58 */     this.recordsize = 143;
/*  59 */     this.fileid = "1020417131156";
/*  60 */     this.recordid = "3B4F7C50FE2ED";
/*  61 */     this.message = new byte[getByteLength()];
/*  62 */     this.formatname = "IIN091802";
/*  63 */     this.fieldnames = new String[22];
/*  64 */     this.tagnames = new String[22];
/*  65 */     this.fields = new MessageField[22];
/*     */ 
/*  67 */     this.fieldnames[0] = "H02USERID";
/*  68 */     this.tagnames[0] = "H02USERID";
/*     */      this.fields[0]=this.fieldH02USERID=new CharacterField(this.message, 10, 10, "H02USERID");
/*     */ 
/*  71 */     this.fieldnames[1] = "H02PROGRM";
/*  72 */     this.tagnames[1] = "H02PROGRM";
/*     */      this.fields[1]=this.fieldH02PROGRM=new CharacterField(this.message, 20, 10, "H02PROGRM");
/*     */ 
/*  75 */     this.fieldnames[2] = "H02TIMSYS";
/*  76 */     this.tagnames[2] = "H02TIMSYS";
/*     */      this.fields[2]=this.fieldH02TIMSYS=new CharacterField(this.message, 30, 12, "H02TIMSYS");
/*     */ 
/*  79 */     this.fieldnames[3] = "H02SCRCOD";
/*  80 */     this.tagnames[3] = "H02SCRCOD";
/*     */      this.fields[3]=this.fieldH02SCRCOD=new CharacterField(this.message, 42, 2, "H02SCRCOD");
/*     */ 
/*  83 */     this.fieldnames[4] = "H02OPECOD";
/*  84 */     this.tagnames[4] = "H02OPECOD";
/*     */      this.fields[4]=this.fieldH02OPECOD=new CharacterField(this.message, 44, 4, "H02OPECOD");
/*     */ 
/*  87 */     this.fieldnames[5] = "H02FLGMAS";
/*  88 */     this.tagnames[5] = "H02FLGMAS";
/*     */      this.fields[5]=this.fieldH02FLGMAS=new CharacterField(this.message, 48, 1, "H02FLGMAS");
/*     */ 
/*  91 */     this.fieldnames[6] = "H02FLGWK1";
/*  92 */     this.tagnames[6] = "H02FLGWK1";
/*     */      this.fields[6]=this.fieldH02FLGWK1=new CharacterField(this.message, 49, 1, "H02FLGWK1");
/*     */ 
/*  95 */     this.fieldnames[7] = "H02FLGWK2";
/*  96 */     this.tagnames[7] = "H02FLGWK2";
/*     */      this.fields[7]=this.fieldH02FLGWK2=new CharacterField(this.message, 50, 1, "H02FLGWK2");
/*     */ 
/*  99 */     this.fieldnames[8] = "H02FLGWK3";
/* 100 */     this.tagnames[8] = "H02FLGWK3";
/*     */      this.fields[8]=this.fieldH02FLGWK3=new CharacterField(this.message, 51, 1, "H02FLGWK3");
/*     */ 
/* 103 */     this.fieldnames[9] = "I02ACMACC";
/* 104 */     this.tagnames[9] = "I02ACMACC";
/*     */      this.fields[9]=this.fieldI02ACMACC=new DecimalField(this.message, 52, 13, 0, "I02ACMACC");
/*     */ 
/* 107 */     this.fieldnames[10] = "I02MATDT1";
/* 108 */     this.tagnames[10] = "I02MATDT1";
/*     */      this.fields[10]=this.fieldI02MATDT1=new DecimalField(this.message, 65, 3, 0, "I02MATDT1");
/*     */ 
/* 111 */     this.fieldnames[11] = "I02MATDT2";
/* 112 */     this.tagnames[11] = "I02MATDT2";
/*     */      this.fields[11]=this.fieldI02MATDT2=new DecimalField(this.message, 68, 3, 0, "I02MATDT2");
/*     */ 
/* 115 */     this.fieldnames[12] = "I02MATDT3";
/* 116 */     this.tagnames[12] = "I02MATDT3";
/*     */      this.fields[12]=this.fieldI02MATDT3=new DecimalField(this.message, 71, 3, 0, "I02MATDT3");
/*     */ 
/* 119 */     this.fieldnames[13] = "I02NUMACC";
/* 120 */     this.tagnames[13] = "I02NUMACC";
/*     */      this.fields[13]=this.fieldI02NUMACC=new DecimalField(this.message, 74, 13, 0, "I02NUMACC");
/*     */ 
/* 123 */     this.fieldnames[14] = "I02CURRCY";
/* 124 */     this.tagnames[14] = "I02CURRCY";
/*     */      this.fields[14]=this.fieldI02CURRCY=new CharacterField(this.message, 87, 3, "I02CURRCY");
/*     */ 
/* 127 */     this.fieldnames[15] = "I02ACTYPE";
/* 128 */     this.tagnames[15] = "I02ACTYPE";
/*     */      this.fields[15]=this.fieldI02ACTYPE=new CharacterField(this.message, 90, 4, "I02ACTYPE");
/*     */ 
/* 131 */     this.fieldnames[16] = "I02ACRATE";
/* 132 */     this.tagnames[16] = "I02ACRATE";
/*     */      this.fields[16]=this.fieldI02ACRATE=new DecimalField(this.message, 94, 11, 6, "I02ACRATE");
/*     */ 
/* 135 */     this.fieldnames[17] = "I02BALPRI";
/* 136 */     this.tagnames[17] = "I02BALPRI";
/*     */      this.fields[17]=this.fieldI02BALPRI=new DecimalField(this.message, 105, 17, 2, "I02BALPRI");
/*     */ 
/* 139 */     this.fieldnames[18] = "I02BALANC";
/* 140 */     this.tagnames[18] = "I02BALANC";
/*     */      this.fields[18]=this.fieldI02BALANC=new DecimalField(this.message, 122, 17, 2, "I02BALANC");
/*     */ 
/* 143 */     this.fieldnames[19] = "I02ACTERM";
/* 144 */     this.tagnames[19] = "I02ACTERM";
/*     */      this.fields[19]=this.fieldI02ACTERM=new DecimalField(this.message, 139, 5, 0, "I02ACTERM");
/*     */ 
/* 147 */     this.fieldnames[20] = "I02NUMREC";
/* 148 */     this.tagnames[20] = "I02NUMREC";
/*     */      this.fields[20]=this.fieldI02NUMREC=new DecimalField(this.message, 144, 8, 0, "I02NUMREC");
/*     */ 
/* 151 */     this.fieldnames[21] = "I02INDOPE";
/* 152 */     this.tagnames[21] = "I02INDOPE";
/*     */      this.fields[21]=this.fieldI02INDOPE=new CharacterField(this.message, 152, 1, "I02INDOPE");
/*     */   }
/*     */ 
/*     */   public void setH02USERID(String newvalue)
/*     */   {
/* 162 */     this.fieldH02USERID.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getH02USERID()
/*     */   {
/* 170 */     return this.fieldH02USERID.getString();
/*     */   }
/*     */ 
/*     */   public void setH02PROGRM(String newvalue)
/*     */   {
/* 178 */     this.fieldH02PROGRM.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getH02PROGRM()
/*     */   {
/* 186 */     return this.fieldH02PROGRM.getString();
/*     */   }
/*     */ 
/*     */   public void setH02TIMSYS(String newvalue)
/*     */   {
/* 194 */     this.fieldH02TIMSYS.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getH02TIMSYS()
/*     */   {
/* 202 */     return this.fieldH02TIMSYS.getString();
/*     */   }
/*     */ 
/*     */   public void setH02SCRCOD(String newvalue)
/*     */   {
/* 210 */     this.fieldH02SCRCOD.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getH02SCRCOD()
/*     */   {
/* 218 */     return this.fieldH02SCRCOD.getString();
/*     */   }
/*     */ 
/*     */   public void setH02OPECOD(String newvalue)
/*     */   {
/* 226 */     this.fieldH02OPECOD.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getH02OPECOD()
/*     */   {
/* 234 */     return this.fieldH02OPECOD.getString();
/*     */   }
/*     */ 
/*     */   public void setH02FLGMAS(String newvalue)
/*     */   {
/* 242 */     this.fieldH02FLGMAS.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getH02FLGMAS()
/*     */   {
/* 250 */     return this.fieldH02FLGMAS.getString();
/*     */   }
/*     */ 
/*     */   public void setH02FLGWK1(String newvalue)
/*     */   {
/* 258 */     this.fieldH02FLGWK1.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getH02FLGWK1()
/*     */   {
/* 266 */     return this.fieldH02FLGWK1.getString();
/*     */   }
/*     */ 
/*     */   public void setH02FLGWK2(String newvalue)
/*     */   {
/* 274 */     this.fieldH02FLGWK2.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getH02FLGWK2()
/*     */   {
/* 282 */     return this.fieldH02FLGWK2.getString();
/*     */   }
/*     */ 
/*     */   public void setH02FLGWK3(String newvalue)
/*     */   {
/* 290 */     this.fieldH02FLGWK3.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getH02FLGWK3()
/*     */   {
/* 298 */     return this.fieldH02FLGWK3.getString();
/*     */   }
/*     */ 
/*     */   public void setI02ACMACC(String newvalue)
/*     */   {
/* 306 */     this.fieldI02ACMACC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getI02ACMACC()
/*     */   {
/* 314 */     return this.fieldI02ACMACC.getString();
/*     */   }
/*     */ 
/*     */   public void setI02ACMACC(BigDecimal newvalue)
/*     */   {
/* 322 */     this.fieldI02ACMACC.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalI02ACMACC()
/*     */   {
/* 330 */     return this.fieldI02ACMACC.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setI02MATDT1(String newvalue)
/*     */   {
/* 338 */     this.fieldI02MATDT1.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getI02MATDT1()
/*     */   {
/* 346 */     return this.fieldI02MATDT1.getString();
/*     */   }
/*     */ 
/*     */   public void setI02MATDT1(BigDecimal newvalue)
/*     */   {
/* 354 */     this.fieldI02MATDT1.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalI02MATDT1()
/*     */   {
/* 362 */     return this.fieldI02MATDT1.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setI02MATDT2(String newvalue)
/*     */   {
/* 370 */     this.fieldI02MATDT2.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getI02MATDT2()
/*     */   {
/* 378 */     return this.fieldI02MATDT2.getString();
/*     */   }
/*     */ 
/*     */   public void setI02MATDT2(BigDecimal newvalue)
/*     */   {
/* 386 */     this.fieldI02MATDT2.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalI02MATDT2()
/*     */   {
/* 394 */     return this.fieldI02MATDT2.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setI02MATDT3(String newvalue)
/*     */   {
/* 402 */     this.fieldI02MATDT3.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getI02MATDT3()
/*     */   {
/* 410 */     return this.fieldI02MATDT3.getString();
/*     */   }
/*     */ 
/*     */   public void setI02MATDT3(BigDecimal newvalue)
/*     */   {
/* 418 */     this.fieldI02MATDT3.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalI02MATDT3()
/*     */   {
/* 426 */     return this.fieldI02MATDT3.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setI02NUMACC(String newvalue)
/*     */   {
/* 434 */     this.fieldI02NUMACC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getI02NUMACC()
/*     */   {
/* 442 */     return this.fieldI02NUMACC.getString();
/*     */   }
/*     */ 
/*     */   public void setI02NUMACC(BigDecimal newvalue)
/*     */   {
/* 450 */     this.fieldI02NUMACC.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalI02NUMACC()
/*     */   {
/* 458 */     return this.fieldI02NUMACC.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setI02CURRCY(String newvalue)
/*     */   {
/* 466 */     this.fieldI02CURRCY.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getI02CURRCY()
/*     */   {
/* 474 */     return this.fieldI02CURRCY.getString();
/*     */   }
/*     */ 
/*     */   public void setI02ACTYPE(String newvalue)
/*     */   {
/* 482 */     this.fieldI02ACTYPE.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getI02ACTYPE()
/*     */   {
/* 490 */     return this.fieldI02ACTYPE.getString();
/*     */   }
/*     */ 
/*     */   public void setI02ACRATE(String newvalue)
/*     */   {
/* 498 */     this.fieldI02ACRATE.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getI02ACRATE()
/*     */   {
/* 506 */     return this.fieldI02ACRATE.getString();
/*     */   }
/*     */ 
/*     */   public void setI02ACRATE(BigDecimal newvalue)
/*     */   {
/* 514 */     this.fieldI02ACRATE.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalI02ACRATE()
/*     */   {
/* 522 */     return this.fieldI02ACRATE.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setI02BALPRI(String newvalue)
/*     */   {
/* 530 */     this.fieldI02BALPRI.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getI02BALPRI()
/*     */   {
/* 538 */     return this.fieldI02BALPRI.getString();
/*     */   }
/*     */ 
/*     */   public void setI02BALPRI(BigDecimal newvalue)
/*     */   {
/* 546 */     this.fieldI02BALPRI.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalI02BALPRI()
/*     */   {
/* 554 */     return this.fieldI02BALPRI.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setI02BALANC(String newvalue)
/*     */   {
/* 562 */     this.fieldI02BALANC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getI02BALANC()
/*     */   {
/* 570 */     return this.fieldI02BALANC.getString();
/*     */   }
/*     */ 
/*     */   public void setI02BALANC(BigDecimal newvalue)
/*     */   {
/* 578 */     this.fieldI02BALANC.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalI02BALANC()
/*     */   {
/* 586 */     return this.fieldI02BALANC.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setI02ACTERM(String newvalue)
/*     */   {
/* 594 */     this.fieldI02ACTERM.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getI02ACTERM()
/*     */   {
/* 602 */     return this.fieldI02ACTERM.getString();
/*     */   }
/*     */ 
/*     */   public void setI02ACTERM(BigDecimal newvalue)
/*     */   {
/* 610 */     this.fieldI02ACTERM.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalI02ACTERM()
/*     */   {
/* 618 */     return this.fieldI02ACTERM.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setI02NUMREC(String newvalue)
/*     */   {
/* 626 */     this.fieldI02NUMREC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getI02NUMREC()
/*     */   {
/* 634 */     return this.fieldI02NUMREC.getString();
/*     */   }
/*     */ 
/*     */   public void setI02NUMREC(BigDecimal newvalue)
/*     */   {
/* 642 */     this.fieldI02NUMREC.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalI02NUMREC()
/*     */   {
/* 650 */     return this.fieldI02NUMREC.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setI02INDOPE(String newvalue)
/*     */   {
/* 658 */     this.fieldI02INDOPE.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getI02INDOPE()
/*     */   {
/* 666 */     return this.fieldI02INDOPE.getString();
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.IIN091802Message
 * JD-Core Version:    0.6.0
 */