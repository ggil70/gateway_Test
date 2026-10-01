/*      */ package com.activo.gateway.dibs.messages;
/*      */ 
/*      */ import java.math.BigDecimal;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*      */ 
/*      */ public class CCARDDSJVMessage extends MessageRecord
/*      */ {
/*   19 */   final int FIELDCOUNT = 36;
/*   20 */   private CharacterField fieldCCAUSER = null;
/*   21 */   private CharacterField fieldCCACCANUM = null;
/*   22 */   private CharacterField fieldCCACCACCY = null;
/*   23 */   private DecimalField fieldCCACCACD1 = null;
/*   24 */   private DecimalField fieldCCACCACD2 = null;
/*   25 */   private DecimalField fieldCCACCACD3 = null;
/*   26 */   private DecimalField fieldCCACCAED1 = null;
/*   27 */   private DecimalField fieldCCACCAED2 = null;
/*   28 */   private DecimalField fieldCCACCAED3 = null;
/*   29 */   private DecimalField fieldCCACCACRL = null;
/*   30 */   private DecimalField fieldCCACCACAL = null;
/*   31 */   private DecimalField fieldCCACCAAVC = null;
/*   32 */   private DecimalField fieldCCACCAPM1 = null;
/*   33 */   private DecimalField fieldCCACCAPM2 = null;
/*   34 */   private DecimalField fieldCCACCAPM3 = null;
/*   35 */   private DecimalField fieldCCACCAPBC = null;
/*   36 */   private DecimalField fieldCCACCAPBD = null;
/*   37 */   private DecimalField fieldCCACCAPUC = null;
/*   38 */   private DecimalField fieldCCACCAPUD = null;
/*   39 */   private DecimalField fieldCCACCAPMC = null;
/*   40 */   private DecimalField fieldCCACCAPMD = null;
/*   41 */   private DecimalField fieldCCACCAFNC = null;
/*   42 */   private DecimalField fieldCCACCAFND = null;
/*   43 */   private DecimalField fieldCCACCALCC = null;
/*   44 */   private DecimalField fieldCCACCALCD = null;
/*   45 */   private DecimalField fieldCCACCABAC = null;
/*   46 */   private DecimalField fieldCCACCABAD = null;
/*   47 */   private DecimalField fieldCCACCAMPC = null;
/*   48 */   private DecimalField fieldCCACCAMPD = null;
/*   49 */   private DecimalField fieldCCACCAPCC = null;
/*   50 */   private DecimalField fieldCCACCAPCD = null;
/*   51 */   private DecimalField fieldCCACCAPTC = null;
/*   52 */   private DecimalField fieldCCACCAPTD = null;
/*   53 */   private DecimalField fieldCCACCAHLD = null;
/*   54 */   private CharacterField fieldCCACCASTA = null;
/*   55 */   private DecimalField fieldCCACCARTE = null;
/*      */ 
/*      */   public CCARDDSJVMessage()
/*      */   {
/*   62 */     createFields();
/*   63 */     initialize();
/*      */   }
/*      */ 
/*      */   protected void createFields()
/*      */   {
/*   71 */     this.recordsize = 405;
/*   72 */     this.fileid = "1000816125228";
/*   73 */     this.recordid = "3CA6A87846F87";
/*   74 */     this.message = new byte[getByteLength()];
/*   75 */     this.formatname = "CCARDDSJV";
/*   76 */     this.fieldnames = new String[36];
/*   77 */     this.tagnames = new String[36];
/*   78 */     this.fields = new MessageField[36];
/*      */ 
/*   80 */     this.fieldnames[0] = "CCAUSER";
/*   81 */     this.tagnames[0] = "CCAUSER";
/*      */      this.fields[0]=this.fieldCCAUSER=new CharacterField(this.message, 10, 10, "CCAUSER");
/*      */ 
/*   84 */     this.fieldnames[1] = "CCACCANUM";
/*   85 */     this.tagnames[1] = "CCACCANUM";
/*      */      this.fields[1]=this.fieldCCACCANUM=new CharacterField(this.message, 20, 17, "CCACCANUM");
/*      */ 
/*   88 */     this.fieldnames[2] = "CCACCACCY";
/*   89 */     this.tagnames[2] = "CCACCACCY";
/*      */      this.fields[2]=this.fieldCCACCACCY=new CharacterField(this.message, 37, 3, "CCACCACCY");
/*      */ 
/*   92 */     this.fieldnames[3] = "CCACCACD1";
/*   93 */     this.tagnames[3] = "CCACCACD1";
/*      */      this.fields[3]=this.fieldCCACCACD1=new DecimalField(this.message, 40, 3, 0, "CCACCACD1");
/*      */ 
/*   96 */     this.fieldnames[4] = "CCACCACD2";
/*   97 */     this.tagnames[4] = "CCACCACD2";
/*      */      this.fields[4]=this.fieldCCACCACD2=new DecimalField(this.message, 43, 3, 0, "CCACCACD2");
/*      */ 
/*  100 */     this.fieldnames[5] = "CCACCACD3";
/*  101 */     this.tagnames[5] = "CCACCACD3";
/*      */      this.fields[5]=this.fieldCCACCACD3=new DecimalField(this.message, 46, 3, 0, "CCACCACD3");
/*      */ 
/*  104 */     this.fieldnames[6] = "CCACCAED1";
/*  105 */     this.tagnames[6] = "CCACCAED1";
/*      */      this.fields[6]=this.fieldCCACCAED1=new DecimalField(this.message, 49, 3, 0, "CCACCAED1");
/*      */ 
/*  108 */     this.fieldnames[7] = "CCACCAED2";
/*  109 */     this.tagnames[7] = "CCACCAED2";
/*      */      this.fields[7]=this.fieldCCACCAED2=new DecimalField(this.message, 52, 3, 0, "CCACCAED2");
/*      */ 
/*  112 */     this.fieldnames[8] = "CCACCAED3";
/*  113 */     this.tagnames[8] = "CCACCAED3";
/*      */      this.fields[8]=this.fieldCCACCAED3=new DecimalField(this.message, 55, 3, 0, "CCACCAED3");
/*      */ 
/*  116 */     this.fieldnames[9] = "CCACCACRL";
/*  117 */     this.tagnames[9] = "CCACCACRL";
/*      */      this.fields[9]=this.fieldCCACCACRL=new DecimalField(this.message, 58, 15, 2, "CCACCACRL");
/*      */ 
/*  120 */     this.fieldnames[10] = "CCACCACAL";
/*  121 */     this.tagnames[10] = "CCACCACAL";
/*      */      this.fields[10]=this.fieldCCACCACAL=new DecimalField(this.message, 73, 15, 2, "CCACCACAL");
/*      */ 
/*  124 */     this.fieldnames[11] = "CCACCAAVC";
/*  125 */     this.tagnames[11] = "CCACCAAVC";
/*      */      this.fields[11]=this.fieldCCACCAAVC=new DecimalField(this.message, 88, 15, 2, "CCACCAAVC");
/*      */ 
/*  128 */     this.fieldnames[12] = "CCACCAPM1";
/*  129 */     this.tagnames[12] = "CCACCAPM1";
/*      */      this.fields[12]=this.fieldCCACCAPM1=new DecimalField(this.message, 103, 5, 2, "CCACCAPM1");
/*      */ 
/*  132 */     this.fieldnames[13] = "CCACCAPM2";
/*  133 */     this.tagnames[13] = "CCACCAPM2";
/*      */      this.fields[13]=this.fieldCCACCAPM2=new DecimalField(this.message, 108, 5, 2, "CCACCAPM2");
/*      */ 
/*  136 */     this.fieldnames[14] = "CCACCAPM3";
/*  137 */     this.tagnames[14] = "CCACCAPM3";
/*      */      this.fields[14]=this.fieldCCACCAPM3=new DecimalField(this.message, 113, 5, 2, "CCACCAPM3");
/*      */ 
/*  140 */     this.fieldnames[15] = "CCACCAPBC";
/*  141 */     this.tagnames[15] = "CCACCAPBC";
/*      */      this.fields[15]=this.fieldCCACCAPBC=new DecimalField(this.message, 118, 15, 2, "CCACCAPBC");
/*      */ 
/*  144 */     this.fieldnames[16] = "CCACCAPBD";
/*  145 */     this.tagnames[16] = "CCACCAPBD";
/*      */      this.fields[16]=this.fieldCCACCAPBD=new DecimalField(this.message, 133, 15, 2, "CCACCAPBD");
/*      */ 
/*  148 */     this.fieldnames[17] = "CCACCAPUC";
/*  149 */     this.tagnames[17] = "CCACCAPUC";
/*      */      this.fields[17]=this.fieldCCACCAPUC=new DecimalField(this.message, 148, 15, 2, "CCACCAPUC");
/*      */ 
/*  152 */     this.fieldnames[18] = "CCACCAPUD";
/*  153 */     this.tagnames[18] = "CCACCAPUD";
/*      */      this.fields[18]=this.fieldCCACCAPUD=new DecimalField(this.message, 163, 15, 2, "CCACCAPUD");
/*      */ 
/*  156 */     this.fieldnames[19] = "CCACCAPMC";
/*  157 */     this.tagnames[19] = "CCACCAPMC";
/*      */      this.fields[19]=this.fieldCCACCAPMC=new DecimalField(this.message, 178, 15, 2, "CCACCAPMC");
/*      */ 
/*  160 */     this.fieldnames[20] = "CCACCAPMD";
/*  161 */     this.tagnames[20] = "CCACCAPMD";
/*      */      this.fields[20]=this.fieldCCACCAPMD=new DecimalField(this.message, 193, 15, 2, "CCACCAPMD");
/*      */ 
/*  164 */     this.fieldnames[21] = "CCACCAFNC";
/*  165 */     this.tagnames[21] = "CCACCAFNC";
/*      */      this.fields[21]=this.fieldCCACCAFNC=new DecimalField(this.message, 208, 15, 2, "CCACCAFNC");
/*      */ 
/*  168 */     this.fieldnames[22] = "CCACCAFND";
/*  169 */     this.tagnames[22] = "CCACCAFND";
/*      */      this.fields[22]=this.fieldCCACCAFND=new DecimalField(this.message, 223, 15, 2, "CCACCAFND");
/*      */ 
/*  172 */     this.fieldnames[23] = "CCACCALCC";
/*  173 */     this.tagnames[23] = "CCACCALCC";
/*      */      this.fields[23]=this.fieldCCACCALCC=new DecimalField(this.message, 238, 15, 2, "CCACCALCC");
/*      */ 
/*  176 */     this.fieldnames[24] = "CCACCALCD";
/*  177 */     this.tagnames[24] = "CCACCALCD";
/*      */      this.fields[24]=this.fieldCCACCALCD=new DecimalField(this.message, 253, 15, 2, "CCACCALCD");
/*      */ 
/*  180 */     this.fieldnames[25] = "CCACCABAC";
/*  181 */     this.tagnames[25] = "CCACCABAC";
/*      */      this.fields[25]=this.fieldCCACCABAC=new DecimalField(this.message, 268, 15, 2, "CCACCABAC");
/*      */ 
/*  184 */     this.fieldnames[26] = "CCACCABAD";
/*  185 */     this.tagnames[26] = "CCACCABAD";
/*      */      this.fields[26]=this.fieldCCACCABAD=new DecimalField(this.message, 283, 15, 2, "CCACCABAD");
/*      */ 
/*  188 */     this.fieldnames[27] = "CCACCAMPC";
/*  189 */     this.tagnames[27] = "CCACCAMPC";
/*      */      this.fields[27]=this.fieldCCACCAMPC=new DecimalField(this.message, 298, 15, 2, "CCACCAMPC");
/*      */ 
/*  192 */     this.fieldnames[28] = "CCACCAMPD";
/*  193 */     this.tagnames[28] = "CCACCAMPD";
/*      */      this.fields[28]=this.fieldCCACCAMPD=new DecimalField(this.message, 313, 15, 2, "CCACCAMPD");
/*      */ 
/*  196 */     this.fieldnames[29] = "CCACCAPCC";
/*  197 */     this.tagnames[29] = "CCACCAPCC";
/*      */      this.fields[29]=this.fieldCCACCAPCC=new DecimalField(this.message, 328, 15, 2, "CCACCAPCC");
/*      */ 
/*  200 */     this.fieldnames[30] = "CCACCAPCD";
/*  201 */     this.tagnames[30] = "CCACCAPCD";
/*      */      this.fields[30]=this.fieldCCACCAPCD=new DecimalField(this.message, 343, 15, 2, "CCACCAPCD");
/*      */ 
/*  204 */     this.fieldnames[31] = "CCACCAPTC";
/*  205 */     this.tagnames[31] = "CCACCAPTC";
/*      */      this.fields[31]=this.fieldCCACCAPTC=new DecimalField(this.message, 358, 15, 2, "CCACCAPTC");
/*      */ 
/*  208 */     this.fieldnames[32] = "CCACCAPTD";
/*  209 */     this.tagnames[32] = "CCACCAPTD";
/*      */      this.fields[32]=this.fieldCCACCAPTD=new DecimalField(this.message, 373, 15, 2, "CCACCAPTD");
/*      */ 
/*  212 */     this.fieldnames[33] = "CCACCAHLD";
/*  213 */     this.tagnames[33] = "CCACCAHLD";
/*      */      this.fields[33]=this.fieldCCACCAHLD=new DecimalField(this.message, 388, 15, 2, "CCACCAHLD");
/*      */ 
/*  216 */     this.fieldnames[34] = "CCACCASTA";
/*  217 */     this.tagnames[34] = "CCACCASTA";
/*      */      this.fields[34]=this.fieldCCACCASTA=new CharacterField(this.message, 403, 1, "CCACCASTA");
/*      */ 
/*  220 */     this.fieldnames[35] = "CCACCARTE";
/*  221 */     this.tagnames[35] = "CCACCARTE";
/*      */      this.fields[35]=this.fieldCCACCARTE=new DecimalField(this.message, 404, 11, 6, "CCACCARTE");
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCACCAAVC()
/*      */   {
/*  230 */     return this.fieldCCACCAAVC.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCACCABAC()
/*      */   {
/*  237 */     return this.fieldCCACCABAC.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCACCABAD()
/*      */   {
/*  244 */     return this.fieldCCACCABAD.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCACCACAL()
/*      */   {
/*  251 */     return this.fieldCCACCACAL.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCACCACD1()
/*      */   {
/*  258 */     return this.fieldCCACCACD1.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCACCACD2()
/*      */   {
/*  265 */     return this.fieldCCACCACD2.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCACCACD3()
/*      */   {
/*  272 */     return this.fieldCCACCACD3.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCACCACRL()
/*      */   {
/*  279 */     return this.fieldCCACCACRL.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCACCAED1()
/*      */   {
/*  286 */     return this.fieldCCACCAED1.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCACCAED2()
/*      */   {
/*  293 */     return this.fieldCCACCAED2.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCACCAED3()
/*      */   {
/*  300 */     return this.fieldCCACCAED3.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCACCAFNC()
/*      */   {
/*  307 */     return this.fieldCCACCAFNC.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCACCAFND()
/*      */   {
/*  314 */     return this.fieldCCACCAFND.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCACCAHLD()
/*      */   {
/*  321 */     return this.fieldCCACCAHLD.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCACCALCC()
/*      */   {
/*  328 */     return this.fieldCCACCALCC.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCACCALCD()
/*      */   {
/*  335 */     return this.fieldCCACCALCD.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCACCAMPC()
/*      */   {
/*  342 */     return this.fieldCCACCAMPC.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCACCAMPD()
/*      */   {
/*  349 */     return this.fieldCCACCAMPD.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCACCAPBC()
/*      */   {
/*  356 */     return this.fieldCCACCAPBC.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCACCAPBD()
/*      */   {
/*  363 */     return this.fieldCCACCAPBD.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCACCAPCC()
/*      */   {
/*  370 */     return this.fieldCCACCAPCC.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCACCAPCD()
/*      */   {
/*  377 */     return this.fieldCCACCAPCD.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCACCAPM1()
/*      */   {
/*  384 */     return this.fieldCCACCAPM1.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCACCAPM2()
/*      */   {
/*  391 */     return this.fieldCCACCAPM2.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCACCAPM3()
/*      */   {
/*  398 */     return this.fieldCCACCAPM3.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCACCAPMC()
/*      */   {
/*  405 */     return this.fieldCCACCAPMC.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCACCAPMD()
/*      */   {
/*  412 */     return this.fieldCCACCAPMD.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCACCAPTC()
/*      */   {
/*  419 */     return this.fieldCCACCAPTC.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCACCAPTD()
/*      */   {
/*  426 */     return this.fieldCCACCAPTD.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCACCAPUC()
/*      */   {
/*  433 */     return this.fieldCCACCAPUC.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCACCAPUD()
/*      */   {
/*  440 */     return this.fieldCCACCAPUD.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCACCARTE()
/*      */   {
/*  447 */     return this.fieldCCACCARTE.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public String getCCACCAAVC()
/*      */   {
/*  454 */     return this.fieldCCACCAAVC.getString();
/*      */   }
/*      */ 
/*      */   public String getCCACCABAC()
/*      */   {
/*  461 */     return this.fieldCCACCABAC.getString();
/*      */   }
/*      */ 
/*      */   public String getCCACCABAD()
/*      */   {
/*  468 */     return this.fieldCCACCABAD.getString();
/*      */   }
/*      */ 
/*      */   public String getCCACCACAL()
/*      */   {
/*  475 */     return this.fieldCCACCACAL.getString();
/*      */   }
/*      */ 
/*      */   public String getCCACCACCY()
/*      */   {
/*  482 */     return this.fieldCCACCACCY.getString();
/*      */   }
/*      */ 
/*      */   public String getCCACCACD1()
/*      */   {
/*  489 */     return this.fieldCCACCACD1.getString();
/*      */   }
/*      */ 
/*      */   public String getCCACCACD2()
/*      */   {
/*  496 */     return this.fieldCCACCACD2.getString();
/*      */   }
/*      */ 
/*      */   public String getCCACCACD3()
/*      */   {
/*  503 */     return this.fieldCCACCACD3.getString();
/*      */   }
/*      */ 
/*      */   public String getCCACCACRL()
/*      */   {
/*  510 */     return this.fieldCCACCACRL.getString();
/*      */   }
/*      */ 
/*      */   public String getCCACCAED1()
/*      */   {
/*  517 */     return this.fieldCCACCAED1.getString();
/*      */   }
/*      */ 
/*      */   public String getCCACCAED2()
/*      */   {
/*  524 */     return this.fieldCCACCAED2.getString();
/*      */   }
/*      */ 
/*      */   public String getCCACCAED3()
/*      */   {
/*  531 */     return this.fieldCCACCAED3.getString();
/*      */   }
/*      */ 
/*      */   public String getCCACCAFNC()
/*      */   {
/*  538 */     return this.fieldCCACCAFNC.getString();
/*      */   }
/*      */ 
/*      */   public String getCCACCAFND()
/*      */   {
/*  545 */     return this.fieldCCACCAFND.getString();
/*      */   }
/*      */ 
/*      */   public String getCCACCAHLD()
/*      */   {
/*  552 */     return this.fieldCCACCAHLD.getString();
/*      */   }
/*      */ 
/*      */   public String getCCACCALCC()
/*      */   {
/*  559 */     return this.fieldCCACCALCC.getString();
/*      */   }
/*      */ 
/*      */   public String getCCACCALCD()
/*      */   {
/*  566 */     return this.fieldCCACCALCD.getString();
/*      */   }
/*      */ 
/*      */   public String getCCACCAMPC()
/*      */   {
/*  573 */     return this.fieldCCACCAMPC.getString();
/*      */   }
/*      */ 
/*      */   public String getCCACCAMPD()
/*      */   {
/*  580 */     return this.fieldCCACCAMPD.getString();
/*      */   }
/*      */ 
/*      */   public String getCCACCANUM()
/*      */   {
/*  587 */     return this.fieldCCACCANUM.getString();
/*      */   }
/*      */ 
/*      */   public String getCCACCAPBC()
/*      */   {
/*  594 */     return this.fieldCCACCAPBC.getString();
/*      */   }
/*      */ 
/*      */   public String getCCACCAPBD()
/*      */   {
/*  601 */     return this.fieldCCACCAPBD.getString();
/*      */   }
/*      */ 
/*      */   public String getCCACCAPCC()
/*      */   {
/*  608 */     return this.fieldCCACCAPCC.getString();
/*      */   }
/*      */ 
/*      */   public String getCCACCAPCD()
/*      */   {
/*  615 */     return this.fieldCCACCAPCD.getString();
/*      */   }
/*      */ 
/*      */   public String getCCACCAPM1()
/*      */   {
/*  622 */     return this.fieldCCACCAPM1.getString();
/*      */   }
/*      */ 
/*      */   public String getCCACCAPM2()
/*      */   {
/*  629 */     return this.fieldCCACCAPM2.getString();
/*      */   }
/*      */ 
/*      */   public String getCCACCAPM3()
/*      */   {
/*  636 */     return this.fieldCCACCAPM3.getString();
/*      */   }
/*      */ 
/*      */   public String getCCACCAPMC()
/*      */   {
/*  643 */     return this.fieldCCACCAPMC.getString();
/*      */   }
/*      */ 
/*      */   public String getCCACCAPMD()
/*      */   {
/*  650 */     return this.fieldCCACCAPMD.getString();
/*      */   }
/*      */ 
/*      */   public String getCCACCAPTC()
/*      */   {
/*  657 */     return this.fieldCCACCAPTC.getString();
/*      */   }
/*      */ 
/*      */   public String getCCACCAPTD()
/*      */   {
/*  664 */     return this.fieldCCACCAPTD.getString();
/*      */   }
/*      */ 
/*      */   public String getCCACCAPUC()
/*      */   {
/*  671 */     return this.fieldCCACCAPUC.getString();
/*      */   }
/*      */ 
/*      */   public String getCCACCAPUD()
/*      */   {
/*  678 */     return this.fieldCCACCAPUD.getString();
/*      */   }
/*      */ 
/*      */   public String getCCACCARTE()
/*      */   {
/*  685 */     return this.fieldCCACCARTE.getString();
/*      */   }
/*      */ 
/*      */   public String getCCACCASTA()
/*      */   {
/*  692 */     return this.fieldCCACCASTA.getString();
/*      */   }
/*      */ 
/*      */   public String getCCAUSER()
/*      */   {
/*  699 */     return this.fieldCCAUSER.getString();
/*      */   }
/*      */ 
/*      */   public void setCCACCAAVC(String newvalue)
/*      */   {
/*  706 */     this.fieldCCACCAAVC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setCCACCAAVC(BigDecimal newvalue)
/*      */   {
/*  713 */     this.fieldCCACCAAVC.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setCCACCABAC(String newvalue)
/*      */   {
/*  720 */     this.fieldCCACCABAC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setCCACCABAC(BigDecimal newvalue)
/*      */   {
/*  727 */     this.fieldCCACCABAC.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setCCACCABAD(String newvalue)
/*      */   {
/*  734 */     this.fieldCCACCABAD.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setCCACCABAD(BigDecimal newvalue)
/*      */   {
/*  741 */     this.fieldCCACCABAD.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setCCACCACAL(String newvalue)
/*      */   {
/*  748 */     this.fieldCCACCACAL.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setCCACCACAL(BigDecimal newvalue)
/*      */   {
/*  755 */     this.fieldCCACCACAL.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setCCACCACCY(String newvalue)
/*      */   {
/*  762 */     this.fieldCCACCACCY.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setCCACCACD1(String newvalue)
/*      */   {
/*  769 */     this.fieldCCACCACD1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setCCACCACD1(BigDecimal newvalue)
/*      */   {
/*  776 */     this.fieldCCACCACD1.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setCCACCACD2(String newvalue)
/*      */   {
/*  783 */     this.fieldCCACCACD2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setCCACCACD2(BigDecimal newvalue)
/*      */   {
/*  790 */     this.fieldCCACCACD2.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setCCACCACD3(String newvalue)
/*      */   {
/*  797 */     this.fieldCCACCACD3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setCCACCACD3(BigDecimal newvalue)
/*      */   {
/*  804 */     this.fieldCCACCACD3.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setCCACCACRL(String newvalue)
/*      */   {
/*  811 */     this.fieldCCACCACRL.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setCCACCACRL(BigDecimal newvalue)
/*      */   {
/*  818 */     this.fieldCCACCACRL.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setCCACCAED1(String newvalue)
/*      */   {
/*  825 */     this.fieldCCACCAED1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setCCACCAED1(BigDecimal newvalue)
/*      */   {
/*  832 */     this.fieldCCACCAED1.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setCCACCAED2(String newvalue)
/*      */   {
/*  839 */     this.fieldCCACCAED2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setCCACCAED2(BigDecimal newvalue)
/*      */   {
/*  846 */     this.fieldCCACCAED2.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setCCACCAED3(String newvalue)
/*      */   {
/*  853 */     this.fieldCCACCAED3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setCCACCAED3(BigDecimal newvalue)
/*      */   {
/*  860 */     this.fieldCCACCAED3.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setCCACCAFNC(String newvalue)
/*      */   {
/*  867 */     this.fieldCCACCAFNC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setCCACCAFNC(BigDecimal newvalue)
/*      */   {
/*  874 */     this.fieldCCACCAFNC.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setCCACCAFND(String newvalue)
/*      */   {
/*  881 */     this.fieldCCACCAFND.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setCCACCAFND(BigDecimal newvalue)
/*      */   {
/*  888 */     this.fieldCCACCAFND.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setCCACCAHLD(String newvalue)
/*      */   {
/*  895 */     this.fieldCCACCAHLD.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setCCACCAHLD(BigDecimal newvalue)
/*      */   {
/*  902 */     this.fieldCCACCAHLD.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setCCACCALCC(String newvalue)
/*      */   {
/*  909 */     this.fieldCCACCALCC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setCCACCALCC(BigDecimal newvalue)
/*      */   {
/*  916 */     this.fieldCCACCALCC.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setCCACCALCD(String newvalue)
/*      */   {
/*  923 */     this.fieldCCACCALCD.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setCCACCALCD(BigDecimal newvalue)
/*      */   {
/*  930 */     this.fieldCCACCALCD.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setCCACCAMPC(String newvalue)
/*      */   {
/*  937 */     this.fieldCCACCAMPC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setCCACCAMPC(BigDecimal newvalue)
/*      */   {
/*  944 */     this.fieldCCACCAMPC.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setCCACCAMPD(String newvalue)
/*      */   {
/*  951 */     this.fieldCCACCAMPD.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setCCACCAMPD(BigDecimal newvalue)
/*      */   {
/*  958 */     this.fieldCCACCAMPD.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setCCACCANUM(String newvalue)
/*      */   {
/*  965 */     this.fieldCCACCANUM.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setCCACCAPBC(String newvalue)
/*      */   {
/*  972 */     this.fieldCCACCAPBC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setCCACCAPBC(BigDecimal newvalue)
/*      */   {
/*  979 */     this.fieldCCACCAPBC.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setCCACCAPBD(String newvalue)
/*      */   {
/*  986 */     this.fieldCCACCAPBD.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setCCACCAPBD(BigDecimal newvalue)
/*      */   {
/*  993 */     this.fieldCCACCAPBD.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setCCACCAPCC(String newvalue)
/*      */   {
/* 1000 */     this.fieldCCACCAPCC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setCCACCAPCC(BigDecimal newvalue)
/*      */   {
/* 1007 */     this.fieldCCACCAPCC.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setCCACCAPCD(String newvalue)
/*      */   {
/* 1014 */     this.fieldCCACCAPCD.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setCCACCAPCD(BigDecimal newvalue)
/*      */   {
/* 1021 */     this.fieldCCACCAPCD.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setCCACCAPM1(String newvalue)
/*      */   {
/* 1028 */     this.fieldCCACCAPM1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setCCACCAPM1(BigDecimal newvalue)
/*      */   {
/* 1035 */     this.fieldCCACCAPM1.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setCCACCAPM2(String newvalue)
/*      */   {
/* 1042 */     this.fieldCCACCAPM2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setCCACCAPM2(BigDecimal newvalue)
/*      */   {
/* 1049 */     this.fieldCCACCAPM2.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setCCACCAPM3(String newvalue)
/*      */   {
/* 1056 */     this.fieldCCACCAPM3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setCCACCAPM3(BigDecimal newvalue)
/*      */   {
/* 1063 */     this.fieldCCACCAPM3.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setCCACCAPMC(String newvalue)
/*      */   {
/* 1070 */     this.fieldCCACCAPMC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setCCACCAPMC(BigDecimal newvalue)
/*      */   {
/* 1077 */     this.fieldCCACCAPMC.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setCCACCAPMD(String newvalue)
/*      */   {
/* 1084 */     this.fieldCCACCAPMD.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setCCACCAPMD(BigDecimal newvalue)
/*      */   {
/* 1091 */     this.fieldCCACCAPMD.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setCCACCAPTC(String newvalue)
/*      */   {
/* 1098 */     this.fieldCCACCAPTC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setCCACCAPTC(BigDecimal newvalue)
/*      */   {
/* 1105 */     this.fieldCCACCAPTC.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setCCACCAPTD(String newvalue)
/*      */   {
/* 1112 */     this.fieldCCACCAPTD.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setCCACCAPTD(BigDecimal newvalue)
/*      */   {
/* 1119 */     this.fieldCCACCAPTD.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setCCACCAPUC(String newvalue)
/*      */   {
/* 1126 */     this.fieldCCACCAPUC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setCCACCAPUC(BigDecimal newvalue)
/*      */   {
/* 1133 */     this.fieldCCACCAPUC.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setCCACCAPUD(String newvalue)
/*      */   {
/* 1140 */     this.fieldCCACCAPUD.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setCCACCAPUD(BigDecimal newvalue)
/*      */   {
/* 1147 */     this.fieldCCACCAPUD.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setCCACCARTE(String newvalue)
/*      */   {
/* 1154 */     this.fieldCCACCARTE.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setCCACCARTE(BigDecimal newvalue)
/*      */   {
/* 1161 */     this.fieldCCACCARTE.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setCCACCASTA(String newvalue)
/*      */   {
/* 1168 */     this.fieldCCACCASTA.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setCCAUSER(String newvalue)
/*      */   {
/* 1175 */     this.fieldCCAUSER.setString(newvalue);
/*      */   }
/*      */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.CCARDDSJVMessage
 * JD-Core Version:    0.6.0
 */