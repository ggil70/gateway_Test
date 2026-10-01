/*      */ package com.activo.gateway.dibs.messages;
/*      */ 
/*      */ import java.math.BigDecimal;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*      */ 
/*      */ public class PRODSJVMessage extends MessageRecord
/*      */ {
/*   19 */   final int FIELDCOUNT = 58;
/*   20 */   private CharacterField fieldPROUSR = null;
/*   21 */   private CharacterField fieldPROFLG = null;
/*   22 */   private CharacterField fieldPROKEY = null;
/*   23 */   private CharacterField fieldPROATY = null;
/*   24 */   private CharacterField fieldPROPRD = null;
/*   25 */   private CharacterField fieldPROSNM = null;
/*   26 */   private DecimalField fieldRTEMOA = null;
/*   27 */   private DecimalField fieldRTEBL1 = null;
/*   28 */   private DecimalField fieldRTECH1 = null;
/*   29 */   private DecimalField fieldRTEMMC = null;
/*   30 */   private DecimalField fieldRTEMBR = null;
/*   31 */   private DecimalField fieldRTEBL2 = null;
/*   32 */   private DecimalField fieldRTECH2 = null;
/*   33 */   private CharacterField fieldRTEBT2 = null;
/*   34 */   private DecimalField fieldRTEBL3 = null;
/*   35 */   private DecimalField fieldRTECH3 = null;
/*   36 */   private CharacterField fieldRTEBUS = null;
/*   37 */   private DecimalField fieldRTEBL4 = null;
/*   38 */   private DecimalField fieldRTECH4 = null;
/*   39 */   private DecimalField fieldRTEMKK = null;
/*   40 */   private DecimalField fieldRTEMKC = null;
/*   41 */   private DecimalField fieldRTEMDA = null;
/*   42 */   private DecimalField fieldRTEMCD = null;
/*   43 */   private DecimalField fieldRTEMKD = null;
/*   44 */   private DecimalField fieldRTEMDC = null;
/*   45 */   private DecimalField fieldRTEICH = null;
/*   46 */   private DecimalField fieldRTEDCH = null;
/*   47 */   private DecimalField fieldRTESPC = null;
/*   48 */   private DecimalField fieldRTEHCH = null;
/*   49 */   private DecimalField fieldRTESTC = null;
/*   50 */   private DecimalField fieldRTEMBM = null;
/*   51 */   private DecimalField fieldRTESCC = null;
/*   52 */   private DecimalField fieldRTECMB = null;
/*   53 */   private DecimalField fieldRTENSC = null;
/*   54 */   private DecimalField fieldRTEUNC = null;
/*   55 */   private DecimalField fieldRTEYRC = null;
/*   56 */   private DecimalField fieldRTEOPC = null;
/*   57 */   private DecimalField fieldRTEOR1 = null;
/*   58 */   private DecimalField fieldRTEDO1 = null;
/*   59 */   private DecimalField fieldRTEOR2 = null;
/*   60 */   private DecimalField fieldRTEDO2 = null;
/*   61 */   private DecimalField fieldRTEOR3 = null;
/*   62 */   private DecimalField fieldRTEDO3 = null;
/*   63 */   private DecimalField fieldRTEOR4 = null;
/*   64 */   private DecimalField fieldRTEDO4 = null;
/*   65 */   private DecimalField fieldRTEOMC = null;
/*   66 */   private DecimalField fieldRTEMKL = null;
/*   67 */   private DecimalField fieldRTEMKR = null;
/*   68 */   private DecimalField fieldRTEMB1 = null;
/*   69 */   private DecimalField fieldRTEMB2 = null;
/*   70 */   private DecimalField fieldRTEMB3 = null;
/*   71 */   private DecimalField fieldRTEMB4 = null;
/*   72 */   private DecimalField fieldRTEMR1 = null;
/*   73 */   private DecimalField fieldRTEMR2 = null;
/*   74 */   private DecimalField fieldRTEMR3 = null;
/*   75 */   private DecimalField fieldRTEMR4 = null;
/*   76 */   private CharacterField fieldRTEBTY = null;
/*   77 */   private CharacterField fieldRTEPSB = null;
/*      */ 
/*      */   public PRODSJVMessage()
/*      */   {
/*   84 */     createFields();
/*   85 */     initialize();
/*      */   }
/*      */ 
/*      */   protected void createFields()
/*      */   {
/*   93 */     this.recordsize = 511;
/*   94 */     this.fileid = "1000922103635";
/*   95 */     this.recordid = "3D2B9F0FB078C";
/*   96 */     this.message = new byte[getByteLength()];
/*   97 */     this.formatname = "PRODSJV";
/*   98 */     this.fieldnames = new String[58];
/*   99 */     this.tagnames = new String[58];
/*  100 */     this.fields = new MessageField[58];
/*      */ 
/*  102 */     this.fieldnames[0] = "PROUSR";
/*  103 */     this.tagnames[0] = "PROUSR";
/*      */      this.fields[0]=this.fieldPROUSR=new CharacterField(this.message, 10, 10, "PROUSR");
/*      */ 
/*  106 */     this.fieldnames[1] = "PROFLG";
/*  107 */     this.tagnames[1] = "PROFLG";
/*      */      this.fields[1]=this.fieldPROFLG=new CharacterField(this.message, 20, 1, "PROFLG");
/*      */ 
/*  110 */     this.fieldnames[2] = "PROKEY";
/*  111 */     this.tagnames[2] = "PROKEY";
/*      */      this.fields[2]=this.fieldPROKEY=new CharacterField(this.message, 21, 9, "PROKEY");
/*      */ 
/*  114 */     this.fieldnames[3] = "PROATY";
/*  115 */     this.tagnames[3] = "PROATY";
/*      */      this.fields[3]=this.fieldPROATY=new CharacterField(this.message, 30, 3, "PROATY");
/*      */ 
/*  118 */     this.fieldnames[4] = "PROPRD";
/*  119 */     this.tagnames[4] = "PROPRD";
/*      */      this.fields[4]=this.fieldPROPRD=new CharacterField(this.message, 33, 4, "PROPRD");
/*      */ 
/*  122 */     this.fieldnames[5] = "PROSNM";
/*  123 */     this.tagnames[5] = "PROSNM";
/*      */      this.fields[5]=this.fieldPROSNM=new CharacterField(this.message, 37, 15, "PROSNM");
/*      */ 
/*  126 */     this.fieldnames[6] = "RTEMOA";
/*  127 */     this.tagnames[6] = "RTEMOA";
/*      */      this.fields[6]=this.fieldRTEMOA=new DecimalField(this.message, 52, 10, 0, "RTEMOA");
/*      */ 
/*  130 */     this.fieldnames[7] = "RTEBL1";
/*  131 */     this.tagnames[7] = "RTEBL1";
/*      */      this.fields[7]=this.fieldRTEBL1=new DecimalField(this.message, 62, 10, 0, "RTEBL1");
/*      */ 
/*  134 */     this.fieldnames[8] = "RTECH1";
/*  135 */     this.tagnames[8] = "RTECH1";
/*      */      this.fields[8]=this.fieldRTECH1=new DecimalField(this.message, 72, 11, 2, "RTECH1");
/*      */ 
/*  138 */     this.fieldnames[9] = "RTEMMC";
/*  139 */     this.tagnames[9] = "RTEMMC";
/*      */      this.fields[9]=this.fieldRTEMMC=new DecimalField(this.message, 83, 11, 2, "RTEMMC");
/*      */ 
/*  142 */     this.fieldnames[10] = "RTEMBR";
/*  143 */     this.tagnames[10] = "RTEMBR";
/*      */      this.fields[10]=this.fieldRTEMBR=new DecimalField(this.message, 94, 10, 0, "RTEMBR");
/*      */ 
/*  146 */     this.fieldnames[11] = "RTEBL2";
/*  147 */     this.tagnames[11] = "RTEBL2";
/*      */      this.fields[11]=this.fieldRTEBL2=new DecimalField(this.message, 104, 10, 0, "RTEBL2");
/*      */ 
/*  150 */     this.fieldnames[12] = "RTECH2";
/*  151 */     this.tagnames[12] = "RTECH2";
/*      */      this.fields[12]=this.fieldRTECH2=new DecimalField(this.message, 114, 11, 2, "RTECH2");
/*      */ 
/*  154 */     this.fieldnames[13] = "RTEBT2";
/*  155 */     this.tagnames[13] = "RTEBT2";
/*      */      this.fields[13]=this.fieldRTEBT2=new CharacterField(this.message, 125, 2, "RTEBT2");
/*      */ 
/*  158 */     this.fieldnames[14] = "RTEBL3";
/*  159 */     this.tagnames[14] = "RTEBL3";
/*      */      this.fields[14]=this.fieldRTEBL3=new DecimalField(this.message, 127, 10, 0, "RTEBL3");
/*      */ 
/*  162 */     this.fieldnames[15] = "RTECH3";
/*  163 */     this.tagnames[15] = "RTECH3";
/*      */      this.fields[15]=this.fieldRTECH3=new DecimalField(this.message, 137, 11, 2, "RTECH3");
/*      */ 
/*  166 */     this.fieldnames[16] = "RTEBUS";
/*  167 */     this.tagnames[16] = "RTEBUS";
/*      */      this.fields[16]=this.fieldRTEBUS=new CharacterField(this.message, 148, 2, "RTEBUS");
/*      */ 
/*  170 */     this.fieldnames[17] = "RTEBL4";
/*  171 */     this.tagnames[17] = "RTEBL4";
/*      */      this.fields[17]=this.fieldRTEBL4=new DecimalField(this.message, 150, 10, 0, "RTEBL4");
/*      */ 
/*  174 */     this.fieldnames[18] = "RTECH4";
/*  175 */     this.tagnames[18] = "RTECH4";
/*      */      this.fields[18]=this.fieldRTECH4=new DecimalField(this.message, 160, 11, 2, "RTECH4");
/*      */ 
/*  178 */     this.fieldnames[19] = "RTEMKK";
/*  179 */     this.tagnames[19] = "RTEMKK";
/*      */      this.fields[19]=this.fieldRTEMKK=new DecimalField(this.message, 171, 4, 0, "RTEMKK");
/*      */ 
/*  182 */     this.fieldnames[20] = "RTEMKC";
/*  183 */     this.tagnames[20] = "RTEMKC";
/*      */      this.fields[20]=this.fieldRTEMKC=new DecimalField(this.message, 175, 11, 2, "RTEMKC");
/*      */ 
/*  186 */     this.fieldnames[21] = "RTEMDA";
/*  187 */     this.tagnames[21] = "RTEMDA";
/*      */      this.fields[21]=this.fieldRTEMDA=new DecimalField(this.message, 186, 4, 0, "RTEMDA");
/*      */ 
/*  190 */     this.fieldnames[22] = "RTEMCD";
/*  191 */     this.tagnames[22] = "RTEMCD";
/*      */      this.fields[22]=this.fieldRTEMCD=new DecimalField(this.message, 190, 11, 2, "RTEMCD");
/*      */ 
/*  194 */     this.fieldnames[23] = "RTEMKD";
/*  195 */     this.tagnames[23] = "RTEMKD";
/*      */      this.fields[23]=this.fieldRTEMKD=new DecimalField(this.message, 201, 4, 0, "RTEMKD");
/*      */ 
/*  198 */     this.fieldnames[24] = "RTEMDC";
/*  199 */     this.tagnames[24] = "RTEMDC";
/*      */      this.fields[24]=this.fieldRTEMDC=new DecimalField(this.message, 205, 11, 2, "RTEMDC");
/*      */ 
/*  202 */     this.fieldnames[25] = "RTEICH";
/*  203 */     this.tagnames[25] = "RTEICH";
/*      */      this.fields[25]=this.fieldRTEICH=new DecimalField(this.message, 216, 11, 2, "RTEICH");
/*      */ 
/*  206 */     this.fieldnames[26] = "RTEDCH";
/*  207 */     this.tagnames[26] = "RTEDCH";
/*      */      this.fields[26]=this.fieldRTEDCH=new DecimalField(this.message, 227, 11, 2, "RTEDCH");
/*      */ 
/*  210 */     this.fieldnames[27] = "RTESPC";
/*  211 */     this.tagnames[27] = "RTESPC";
/*      */      this.fields[27]=this.fieldRTESPC=new DecimalField(this.message, 238, 11, 2, "RTESPC");
/*      */ 
/*  214 */     this.fieldnames[28] = "RTEHCH";
/*  215 */     this.tagnames[28] = "RTEHCH";
/*      */      this.fields[28]=this.fieldRTEHCH=new DecimalField(this.message, 249, 11, 2, "RTEHCH");
/*      */ 
/*  218 */     this.fieldnames[29] = "RTESTC";
/*  219 */     this.tagnames[29] = "RTESTC";
/*      */      this.fields[29]=this.fieldRTESTC=new DecimalField(this.message, 260, 11, 2, "RTESTC");
/*      */ 
/*  222 */     this.fieldnames[30] = "RTEMBM";
/*  223 */     this.tagnames[30] = "RTEMBM";
/*      */      this.fields[30]=this.fieldRTEMBM=new DecimalField(this.message, 271, 10, 0, "RTEMBM");
/*      */ 
/*  226 */     this.fieldnames[31] = "RTESCC";
/*  227 */     this.tagnames[31] = "RTESCC";
/*      */      this.fields[31]=this.fieldRTESCC=new DecimalField(this.message, 281, 11, 2, "RTESCC");
/*      */ 
/*  230 */     this.fieldnames[32] = "RTECMB";
/*  231 */     this.tagnames[32] = "RTECMB";
/*      */      this.fields[32]=this.fieldRTECMB=new DecimalField(this.message, 292, 10, 0, "RTECMB");
/*      */ 
/*  234 */     this.fieldnames[33] = "RTENSC";
/*  235 */     this.tagnames[33] = "RTENSC";
/*      */      this.fields[33]=this.fieldRTENSC=new DecimalField(this.message, 302, 11, 2, "RTENSC");
/*      */ 
/*  238 */     this.fieldnames[34] = "RTEUNC";
/*  239 */     this.tagnames[34] = "RTEUNC";
/*      */      this.fields[34]=this.fieldRTEUNC=new DecimalField(this.message, 313, 11, 2, "RTEUNC");
/*      */ 
/*  242 */     this.fieldnames[35] = "RTEYRC";
/*  243 */     this.tagnames[35] = "RTEYRC";
/*      */      this.fields[35]=this.fieldRTEYRC=new DecimalField(this.message, 324, 11, 2, "RTEYRC");
/*      */ 
/*  246 */     this.fieldnames[36] = "RTEOPC";
/*  247 */     this.tagnames[36] = "RTEOPC";
/*      */      this.fields[36]=this.fieldRTEOPC=new DecimalField(this.message, 335, 11, 2, "RTEOPC");
/*      */ 
/*  250 */     this.fieldnames[37] = "RTEOR1";
/*  251 */     this.tagnames[37] = "RTEOR1";
/*      */      this.fields[37]=this.fieldRTEOR1=new DecimalField(this.message, 346, 11, 6, "RTEOR1");
/*      */ 
/*  254 */     this.fieldnames[38] = "RTEDO1";
/*  255 */     this.tagnames[38] = "RTEDO1";
/*      */      this.fields[38]=this.fieldRTEDO1=new DecimalField(this.message, 357, 3, 0, "RTEDO1");
/*      */ 
/*  258 */     this.fieldnames[39] = "RTEOR2";
/*  259 */     this.tagnames[39] = "RTEOR2";
/*      */      this.fields[39]=this.fieldRTEOR2=new DecimalField(this.message, 360, 11, 6, "RTEOR2");
/*      */ 
/*  262 */     this.fieldnames[40] = "RTEDO2";
/*  263 */     this.tagnames[40] = "RTEDO2";
/*      */      this.fields[40]=this.fieldRTEDO2=new DecimalField(this.message, 371, 3, 0, "RTEDO2");
/*      */ 
/*  266 */     this.fieldnames[41] = "RTEOR3";
/*  267 */     this.tagnames[41] = "RTEOR3";
/*      */      this.fields[41]=this.fieldRTEOR3=new DecimalField(this.message, 374, 11, 6, "RTEOR3");
/*      */ 
/*  270 */     this.fieldnames[42] = "RTEDO3";
/*  271 */     this.tagnames[42] = "RTEDO3";
/*      */      this.fields[42]=this.fieldRTEDO3=new DecimalField(this.message, 385, 3, 0, "RTEDO3");
/*      */ 
/*  274 */     this.fieldnames[43] = "RTEOR4";
/*  275 */     this.tagnames[43] = "RTEOR4";
/*      */      this.fields[43]=this.fieldRTEOR4=new DecimalField(this.message, 388, 11, 6, "RTEOR4");
/*      */ 
/*  278 */     this.fieldnames[44] = "RTEDO4";
/*  279 */     this.tagnames[44] = "RTEDO4";
/*      */      this.fields[44]=this.fieldRTEDO4=new DecimalField(this.message, 399, 3, 0, "RTEDO4");
/*      */ 
/*  282 */     this.fieldnames[45] = "RTEOMC";
/*  283 */     this.tagnames[45] = "RTEOMC";
/*      */      this.fields[45]=this.fieldRTEOMC=new DecimalField(this.message, 402, 11, 2, "RTEOMC");
/*      */ 
/*  286 */     this.fieldnames[46] = "RTEMKL";
/*  287 */     this.tagnames[46] = "RTEMKL";
/*      */      this.fields[46]=this.fieldRTEMKL=new DecimalField(this.message, 413, 10, 0, "RTEMKL");
/*      */ 
/*  290 */     this.fieldnames[47] = "RTEMKR";
/*  291 */     this.tagnames[47] = "RTEMKR";
/*      */      this.fields[47]=this.fieldRTEMKR=new DecimalField(this.message, 423, 11, 6, "RTEMKR");
/*      */ 
/*  294 */     this.fieldnames[48] = "RTEMB1";
/*  295 */     this.tagnames[48] = "RTEMB1";
/*      */      this.fields[48]=this.fieldRTEMB1=new DecimalField(this.message, 434, 10, 0, "RTEMB1");
/*      */ 
/*  298 */     this.fieldnames[49] = "RTEMB2";
/*  299 */     this.tagnames[49] = "RTEMB2";
/*      */      this.fields[49]=this.fieldRTEMB2=new DecimalField(this.message, 444, 10, 0, "RTEMB2");
/*      */ 
/*  302 */     this.fieldnames[50] = "RTEMB3";
/*  303 */     this.tagnames[50] = "RTEMB3";
/*      */      this.fields[50]=this.fieldRTEMB3=new DecimalField(this.message, 454, 10, 0, "RTEMB3");
/*      */ 
/*  306 */     this.fieldnames[51] = "RTEMB4";
/*  307 */     this.tagnames[51] = "RTEMB4";
/*      */      this.fields[51]=this.fieldRTEMB4=new DecimalField(this.message, 464, 10, 0, "RTEMB4");
/*      */ 
/*  310 */     this.fieldnames[52] = "RTEMR1";
/*  311 */     this.tagnames[52] = "RTEMR1";
/*      */      this.fields[52]=this.fieldRTEMR1=new DecimalField(this.message, 474, 11, 6, "RTEMR1");
/*      */ 
/*  314 */     this.fieldnames[53] = "RTEMR2";
/*  315 */     this.tagnames[53] = "RTEMR2";
/*      */      this.fields[53]=this.fieldRTEMR2=new DecimalField(this.message, 485, 11, 6, "RTEMR2");
/*      */ 
/*  318 */     this.fieldnames[54] = "RTEMR3";
/*  319 */     this.tagnames[54] = "RTEMR3";
/*      */      this.fields[54]=this.fieldRTEMR3=new DecimalField(this.message, 496, 11, 6, "RTEMR3");
/*      */ 
/*  322 */     this.fieldnames[55] = "RTEMR4";
/*  323 */     this.tagnames[55] = "RTEMR4";
/*      */      this.fields[55]=this.fieldRTEMR4=new DecimalField(this.message, 507, 11, 6, "RTEMR4");
/*      */ 
/*  326 */     this.fieldnames[56] = "RTEBTY";
/*  327 */     this.tagnames[56] = "RTEBTY";
/*      */      this.fields[56]=this.fieldRTEBTY=new CharacterField(this.message, 518, 2, "RTEBTY");
/*      */ 
/*  330 */     this.fieldnames[57] = "RTEPSB";
/*  331 */     this.tagnames[57] = "RTEPSB";
/*      */      this.fields[57]=this.fieldRTEPSB=new CharacterField(this.message, 520, 1, "RTEPSB");
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalRTEBL1()
/*      */   {
/*  340 */     return this.fieldRTEBL1.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalRTEBL2()
/*      */   {
/*  347 */     return this.fieldRTEBL2.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalRTEBL3()
/*      */   {
/*  354 */     return this.fieldRTEBL3.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalRTEBL4()
/*      */   {
/*  361 */     return this.fieldRTEBL4.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalRTECH1()
/*      */   {
/*  368 */     return this.fieldRTECH1.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalRTECH2()
/*      */   {
/*  375 */     return this.fieldRTECH2.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalRTECH3()
/*      */   {
/*  382 */     return this.fieldRTECH3.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalRTECH4()
/*      */   {
/*  389 */     return this.fieldRTECH4.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalRTECMB()
/*      */   {
/*  396 */     return this.fieldRTECMB.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalRTEDCH()
/*      */   {
/*  403 */     return this.fieldRTEDCH.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalRTEDO1()
/*      */   {
/*  410 */     return this.fieldRTEDO1.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalRTEDO2()
/*      */   {
/*  417 */     return this.fieldRTEDO2.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalRTEDO3()
/*      */   {
/*  424 */     return this.fieldRTEDO3.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalRTEDO4()
/*      */   {
/*  431 */     return this.fieldRTEDO4.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalRTEHCH()
/*      */   {
/*  438 */     return this.fieldRTEHCH.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalRTEICH()
/*      */   {
/*  445 */     return this.fieldRTEICH.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalRTEMB1()
/*      */   {
/*  452 */     return this.fieldRTEMB1.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalRTEMB2()
/*      */   {
/*  459 */     return this.fieldRTEMB2.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalRTEMB3()
/*      */   {
/*  466 */     return this.fieldRTEMB3.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalRTEMB4()
/*      */   {
/*  473 */     return this.fieldRTEMB4.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalRTEMBM()
/*      */   {
/*  480 */     return this.fieldRTEMBM.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalRTEMBR()
/*      */   {
/*  487 */     return this.fieldRTEMBR.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalRTEMCD()
/*      */   {
/*  494 */     return this.fieldRTEMCD.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalRTEMDA()
/*      */   {
/*  501 */     return this.fieldRTEMDA.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalRTEMDC()
/*      */   {
/*  508 */     return this.fieldRTEMDC.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalRTEMKC()
/*      */   {
/*  515 */     return this.fieldRTEMKC.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalRTEMKD()
/*      */   {
/*  522 */     return this.fieldRTEMKD.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalRTEMKK()
/*      */   {
/*  529 */     return this.fieldRTEMKK.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalRTEMKL()
/*      */   {
/*  536 */     return this.fieldRTEMKL.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalRTEMKR()
/*      */   {
/*  543 */     return this.fieldRTEMKR.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalRTEMMC()
/*      */   {
/*  550 */     return this.fieldRTEMMC.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalRTEMOA()
/*      */   {
/*  557 */     return this.fieldRTEMOA.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalRTEMR1()
/*      */   {
/*  564 */     return this.fieldRTEMR1.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalRTEMR2()
/*      */   {
/*  571 */     return this.fieldRTEMR2.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalRTEMR3()
/*      */   {
/*  578 */     return this.fieldRTEMR3.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalRTEMR4()
/*      */   {
/*  585 */     return this.fieldRTEMR4.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalRTENSC()
/*      */   {
/*  592 */     return this.fieldRTENSC.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalRTEOMC()
/*      */   {
/*  599 */     return this.fieldRTEOMC.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalRTEOPC()
/*      */   {
/*  606 */     return this.fieldRTEOPC.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalRTEOR1()
/*      */   {
/*  613 */     return this.fieldRTEOR1.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalRTEOR2()
/*      */   {
/*  620 */     return this.fieldRTEOR2.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalRTEOR3()
/*      */   {
/*  627 */     return this.fieldRTEOR3.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalRTEOR4()
/*      */   {
/*  634 */     return this.fieldRTEOR4.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalRTESCC()
/*      */   {
/*  641 */     return this.fieldRTESCC.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalRTESPC()
/*      */   {
/*  648 */     return this.fieldRTESPC.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalRTESTC()
/*      */   {
/*  655 */     return this.fieldRTESTC.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalRTEUNC()
/*      */   {
/*  662 */     return this.fieldRTEUNC.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalRTEYRC()
/*      */   {
/*  669 */     return this.fieldRTEYRC.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public String getPROATY()
/*      */   {
/*  676 */     return this.fieldPROATY.getString();
/*      */   }
/*      */ 
/*      */   public String getPROFLG()
/*      */   {
/*  683 */     return this.fieldPROFLG.getString();
/*      */   }
/*      */ 
/*      */   public String getPROKEY()
/*      */   {
/*  690 */     return this.fieldPROKEY.getString();
/*      */   }
/*      */ 
/*      */   public String getPROPRD()
/*      */   {
/*  697 */     return this.fieldPROPRD.getString();
/*      */   }
/*      */ 
/*      */   public String getPROSNM()
/*      */   {
/*  704 */     return this.fieldPROSNM.getString();
/*      */   }
/*      */ 
/*      */   public String getPROUSR()
/*      */   {
/*  711 */     return this.fieldPROUSR.getString();
/*      */   }
/*      */ 
/*      */   public String getRTEBL1()
/*      */   {
/*  718 */     return this.fieldRTEBL1.getString();
/*      */   }
/*      */ 
/*      */   public String getRTEBL2()
/*      */   {
/*  725 */     return this.fieldRTEBL2.getString();
/*      */   }
/*      */ 
/*      */   public String getRTEBL3()
/*      */   {
/*  732 */     return this.fieldRTEBL3.getString();
/*      */   }
/*      */ 
/*      */   public String getRTEBL4()
/*      */   {
/*  739 */     return this.fieldRTEBL4.getString();
/*      */   }
/*      */ 
/*      */   public String getRTEBT2()
/*      */   {
/*  746 */     return this.fieldRTEBT2.getString();
/*      */   }
/*      */ 
/*      */   public String getRTEBTY()
/*      */   {
/*  753 */     return this.fieldRTEBTY.getString();
/*      */   }
/*      */ 
/*      */   public String getRTEBUS()
/*      */   {
/*  760 */     return this.fieldRTEBUS.getString();
/*      */   }
/*      */ 
/*      */   public String getRTECH1()
/*      */   {
/*  767 */     return this.fieldRTECH1.getString();
/*      */   }
/*      */ 
/*      */   public String getRTECH2()
/*      */   {
/*  774 */     return this.fieldRTECH2.getString();
/*      */   }
/*      */ 
/*      */   public String getRTECH3()
/*      */   {
/*  781 */     return this.fieldRTECH3.getString();
/*      */   }
/*      */ 
/*      */   public String getRTECH4()
/*      */   {
/*  788 */     return this.fieldRTECH4.getString();
/*      */   }
/*      */ 
/*      */   public String getRTECMB()
/*      */   {
/*  795 */     return this.fieldRTECMB.getString();
/*      */   }
/*      */ 
/*      */   public String getRTEDCH()
/*      */   {
/*  802 */     return this.fieldRTEDCH.getString();
/*      */   }
/*      */ 
/*      */   public String getRTEDO1()
/*      */   {
/*  809 */     return this.fieldRTEDO1.getString();
/*      */   }
/*      */ 
/*      */   public String getRTEDO2()
/*      */   {
/*  816 */     return this.fieldRTEDO2.getString();
/*      */   }
/*      */ 
/*      */   public String getRTEDO3()
/*      */   {
/*  823 */     return this.fieldRTEDO3.getString();
/*      */   }
/*      */ 
/*      */   public String getRTEDO4()
/*      */   {
/*  830 */     return this.fieldRTEDO4.getString();
/*      */   }
/*      */ 
/*      */   public String getRTEHCH()
/*      */   {
/*  837 */     return this.fieldRTEHCH.getString();
/*      */   }
/*      */ 
/*      */   public String getRTEICH()
/*      */   {
/*  844 */     return this.fieldRTEICH.getString();
/*      */   }
/*      */ 
/*      */   public String getRTEMB1()
/*      */   {
/*  851 */     return this.fieldRTEMB1.getString();
/*      */   }
/*      */ 
/*      */   public String getRTEMB2()
/*      */   {
/*  858 */     return this.fieldRTEMB2.getString();
/*      */   }
/*      */ 
/*      */   public String getRTEMB3()
/*      */   {
/*  865 */     return this.fieldRTEMB3.getString();
/*      */   }
/*      */ 
/*      */   public String getRTEMB4()
/*      */   {
/*  872 */     return this.fieldRTEMB4.getString();
/*      */   }
/*      */ 
/*      */   public String getRTEMBM()
/*      */   {
/*  879 */     return this.fieldRTEMBM.getString();
/*      */   }
/*      */ 
/*      */   public String getRTEMBR()
/*      */   {
/*  886 */     return this.fieldRTEMBR.getString();
/*      */   }
/*      */ 
/*      */   public String getRTEMCD()
/*      */   {
/*  893 */     return this.fieldRTEMCD.getString();
/*      */   }
/*      */ 
/*      */   public String getRTEMDA()
/*      */   {
/*  900 */     return this.fieldRTEMDA.getString();
/*      */   }
/*      */ 
/*      */   public String getRTEMDC()
/*      */   {
/*  907 */     return this.fieldRTEMDC.getString();
/*      */   }
/*      */ 
/*      */   public String getRTEMKC()
/*      */   {
/*  914 */     return this.fieldRTEMKC.getString();
/*      */   }
/*      */ 
/*      */   public String getRTEMKD()
/*      */   {
/*  921 */     return this.fieldRTEMKD.getString();
/*      */   }
/*      */ 
/*      */   public String getRTEMKK()
/*      */   {
/*  928 */     return this.fieldRTEMKK.getString();
/*      */   }
/*      */ 
/*      */   public String getRTEMKL()
/*      */   {
/*  935 */     return this.fieldRTEMKL.getString();
/*      */   }
/*      */ 
/*      */   public String getRTEMKR()
/*      */   {
/*  942 */     return this.fieldRTEMKR.getString();
/*      */   }
/*      */ 
/*      */   public String getRTEMMC()
/*      */   {
/*  949 */     return this.fieldRTEMMC.getString();
/*      */   }
/*      */ 
/*      */   public String getRTEMOA()
/*      */   {
/*  956 */     return this.fieldRTEMOA.getString();
/*      */   }
/*      */ 
/*      */   public String getRTEMR1()
/*      */   {
/*  963 */     return this.fieldRTEMR1.getString();
/*      */   }
/*      */ 
/*      */   public String getRTEMR2()
/*      */   {
/*  970 */     return this.fieldRTEMR2.getString();
/*      */   }
/*      */ 
/*      */   public String getRTEMR3()
/*      */   {
/*  977 */     return this.fieldRTEMR3.getString();
/*      */   }
/*      */ 
/*      */   public String getRTEMR4()
/*      */   {
/*  984 */     return this.fieldRTEMR4.getString();
/*      */   }
/*      */ 
/*      */   public String getRTENSC()
/*      */   {
/*  991 */     return this.fieldRTENSC.getString();
/*      */   }
/*      */ 
/*      */   public String getRTEOMC()
/*      */   {
/*  998 */     return this.fieldRTEOMC.getString();
/*      */   }
/*      */ 
/*      */   public String getRTEOPC()
/*      */   {
/* 1005 */     return this.fieldRTEOPC.getString();
/*      */   }
/*      */ 
/*      */   public String getRTEOR1()
/*      */   {
/* 1012 */     return this.fieldRTEOR1.getString();
/*      */   }
/*      */ 
/*      */   public String getRTEOR2()
/*      */   {
/* 1019 */     return this.fieldRTEOR2.getString();
/*      */   }
/*      */ 
/*      */   public String getRTEOR3()
/*      */   {
/* 1026 */     return this.fieldRTEOR3.getString();
/*      */   }
/*      */ 
/*      */   public String getRTEOR4()
/*      */   {
/* 1033 */     return this.fieldRTEOR4.getString();
/*      */   }
/*      */ 
/*      */   public String getRTEPSB()
/*      */   {
/* 1040 */     return this.fieldRTEPSB.getString();
/*      */   }
/*      */ 
/*      */   public String getRTESCC()
/*      */   {
/* 1047 */     return this.fieldRTESCC.getString();
/*      */   }
/*      */ 
/*      */   public String getRTESPC()
/*      */   {
/* 1054 */     return this.fieldRTESPC.getString();
/*      */   }
/*      */ 
/*      */   public String getRTESTC()
/*      */   {
/* 1061 */     return this.fieldRTESTC.getString();
/*      */   }
/*      */ 
/*      */   public String getRTEUNC()
/*      */   {
/* 1068 */     return this.fieldRTEUNC.getString();
/*      */   }
/*      */ 
/*      */   public String getRTEYRC()
/*      */   {
/* 1075 */     return this.fieldRTEYRC.getString();
/*      */   }
/*      */ 
/*      */   public void setPROATY(String newvalue)
/*      */   {
/* 1082 */     this.fieldPROATY.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setPROFLG(String newvalue)
/*      */   {
/* 1089 */     this.fieldPROFLG.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setPROKEY(String newvalue)
/*      */   {
/* 1096 */     this.fieldPROKEY.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setPROPRD(String newvalue)
/*      */   {
/* 1103 */     this.fieldPROPRD.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setPROSNM(String newvalue)
/*      */   {
/* 1110 */     this.fieldPROSNM.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setPROUSR(String newvalue)
/*      */   {
/* 1117 */     this.fieldPROUSR.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTEBL1(String newvalue)
/*      */   {
/* 1124 */     this.fieldRTEBL1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTEBL1(BigDecimal newvalue)
/*      */   {
/* 1131 */     this.fieldRTEBL1.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTEBL2(String newvalue)
/*      */   {
/* 1138 */     this.fieldRTEBL2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTEBL2(BigDecimal newvalue)
/*      */   {
/* 1145 */     this.fieldRTEBL2.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTEBL3(String newvalue)
/*      */   {
/* 1152 */     this.fieldRTEBL3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTEBL3(BigDecimal newvalue)
/*      */   {
/* 1159 */     this.fieldRTEBL3.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTEBL4(String newvalue)
/*      */   {
/* 1166 */     this.fieldRTEBL4.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTEBL4(BigDecimal newvalue)
/*      */   {
/* 1173 */     this.fieldRTEBL4.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTEBT2(String newvalue)
/*      */   {
/* 1180 */     this.fieldRTEBT2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTEBTY(String newvalue)
/*      */   {
/* 1187 */     this.fieldRTEBTY.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTEBUS(String newvalue)
/*      */   {
/* 1194 */     this.fieldRTEBUS.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTECH1(String newvalue)
/*      */   {
/* 1201 */     this.fieldRTECH1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTECH1(BigDecimal newvalue)
/*      */   {
/* 1208 */     this.fieldRTECH1.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTECH2(String newvalue)
/*      */   {
/* 1215 */     this.fieldRTECH2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTECH2(BigDecimal newvalue)
/*      */   {
/* 1222 */     this.fieldRTECH2.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTECH3(String newvalue)
/*      */   {
/* 1229 */     this.fieldRTECH3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTECH3(BigDecimal newvalue)
/*      */   {
/* 1236 */     this.fieldRTECH3.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTECH4(String newvalue)
/*      */   {
/* 1243 */     this.fieldRTECH4.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTECH4(BigDecimal newvalue)
/*      */   {
/* 1250 */     this.fieldRTECH4.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTECMB(String newvalue)
/*      */   {
/* 1257 */     this.fieldRTECMB.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTECMB(BigDecimal newvalue)
/*      */   {
/* 1264 */     this.fieldRTECMB.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTEDCH(String newvalue)
/*      */   {
/* 1271 */     this.fieldRTEDCH.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTEDCH(BigDecimal newvalue)
/*      */   {
/* 1278 */     this.fieldRTEDCH.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTEDO1(String newvalue)
/*      */   {
/* 1285 */     this.fieldRTEDO1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTEDO1(BigDecimal newvalue)
/*      */   {
/* 1292 */     this.fieldRTEDO1.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTEDO2(String newvalue)
/*      */   {
/* 1299 */     this.fieldRTEDO2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTEDO2(BigDecimal newvalue)
/*      */   {
/* 1306 */     this.fieldRTEDO2.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTEDO3(String newvalue)
/*      */   {
/* 1313 */     this.fieldRTEDO3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTEDO3(BigDecimal newvalue)
/*      */   {
/* 1320 */     this.fieldRTEDO3.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTEDO4(String newvalue)
/*      */   {
/* 1327 */     this.fieldRTEDO4.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTEDO4(BigDecimal newvalue)
/*      */   {
/* 1334 */     this.fieldRTEDO4.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTEHCH(String newvalue)
/*      */   {
/* 1341 */     this.fieldRTEHCH.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTEHCH(BigDecimal newvalue)
/*      */   {
/* 1348 */     this.fieldRTEHCH.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTEICH(String newvalue)
/*      */   {
/* 1355 */     this.fieldRTEICH.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTEICH(BigDecimal newvalue)
/*      */   {
/* 1362 */     this.fieldRTEICH.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTEMB1(String newvalue)
/*      */   {
/* 1369 */     this.fieldRTEMB1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTEMB1(BigDecimal newvalue)
/*      */   {
/* 1376 */     this.fieldRTEMB1.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTEMB2(String newvalue)
/*      */   {
/* 1383 */     this.fieldRTEMB2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTEMB2(BigDecimal newvalue)
/*      */   {
/* 1390 */     this.fieldRTEMB2.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTEMB3(String newvalue)
/*      */   {
/* 1397 */     this.fieldRTEMB3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTEMB3(BigDecimal newvalue)
/*      */   {
/* 1404 */     this.fieldRTEMB3.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTEMB4(String newvalue)
/*      */   {
/* 1411 */     this.fieldRTEMB4.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTEMB4(BigDecimal newvalue)
/*      */   {
/* 1418 */     this.fieldRTEMB4.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTEMBM(String newvalue)
/*      */   {
/* 1425 */     this.fieldRTEMBM.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTEMBM(BigDecimal newvalue)
/*      */   {
/* 1432 */     this.fieldRTEMBM.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTEMBR(String newvalue)
/*      */   {
/* 1439 */     this.fieldRTEMBR.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTEMBR(BigDecimal newvalue)
/*      */   {
/* 1446 */     this.fieldRTEMBR.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTEMCD(String newvalue)
/*      */   {
/* 1453 */     this.fieldRTEMCD.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTEMCD(BigDecimal newvalue)
/*      */   {
/* 1460 */     this.fieldRTEMCD.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTEMDA(String newvalue)
/*      */   {
/* 1467 */     this.fieldRTEMDA.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTEMDA(BigDecimal newvalue)
/*      */   {
/* 1474 */     this.fieldRTEMDA.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTEMDC(String newvalue)
/*      */   {
/* 1481 */     this.fieldRTEMDC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTEMDC(BigDecimal newvalue)
/*      */   {
/* 1488 */     this.fieldRTEMDC.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTEMKC(String newvalue)
/*      */   {
/* 1495 */     this.fieldRTEMKC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTEMKC(BigDecimal newvalue)
/*      */   {
/* 1502 */     this.fieldRTEMKC.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTEMKD(String newvalue)
/*      */   {
/* 1509 */     this.fieldRTEMKD.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTEMKD(BigDecimal newvalue)
/*      */   {
/* 1516 */     this.fieldRTEMKD.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTEMKK(String newvalue)
/*      */   {
/* 1523 */     this.fieldRTEMKK.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTEMKK(BigDecimal newvalue)
/*      */   {
/* 1530 */     this.fieldRTEMKK.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTEMKL(String newvalue)
/*      */   {
/* 1537 */     this.fieldRTEMKL.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTEMKL(BigDecimal newvalue)
/*      */   {
/* 1544 */     this.fieldRTEMKL.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTEMKR(String newvalue)
/*      */   {
/* 1551 */     this.fieldRTEMKR.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTEMKR(BigDecimal newvalue)
/*      */   {
/* 1558 */     this.fieldRTEMKR.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTEMMC(String newvalue)
/*      */   {
/* 1565 */     this.fieldRTEMMC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTEMMC(BigDecimal newvalue)
/*      */   {
/* 1572 */     this.fieldRTEMMC.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTEMOA(String newvalue)
/*      */   {
/* 1579 */     this.fieldRTEMOA.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTEMOA(BigDecimal newvalue)
/*      */   {
/* 1586 */     this.fieldRTEMOA.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTEMR1(String newvalue)
/*      */   {
/* 1593 */     this.fieldRTEMR1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTEMR1(BigDecimal newvalue)
/*      */   {
/* 1600 */     this.fieldRTEMR1.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTEMR2(String newvalue)
/*      */   {
/* 1607 */     this.fieldRTEMR2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTEMR2(BigDecimal newvalue)
/*      */   {
/* 1614 */     this.fieldRTEMR2.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTEMR3(String newvalue)
/*      */   {
/* 1621 */     this.fieldRTEMR3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTEMR3(BigDecimal newvalue)
/*      */   {
/* 1628 */     this.fieldRTEMR3.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTEMR4(String newvalue)
/*      */   {
/* 1635 */     this.fieldRTEMR4.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTEMR4(BigDecimal newvalue)
/*      */   {
/* 1642 */     this.fieldRTEMR4.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTENSC(String newvalue)
/*      */   {
/* 1649 */     this.fieldRTENSC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTENSC(BigDecimal newvalue)
/*      */   {
/* 1656 */     this.fieldRTENSC.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTEOMC(String newvalue)
/*      */   {
/* 1663 */     this.fieldRTEOMC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTEOMC(BigDecimal newvalue)
/*      */   {
/* 1670 */     this.fieldRTEOMC.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTEOPC(String newvalue)
/*      */   {
/* 1677 */     this.fieldRTEOPC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTEOPC(BigDecimal newvalue)
/*      */   {
/* 1684 */     this.fieldRTEOPC.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTEOR1(String newvalue)
/*      */   {
/* 1691 */     this.fieldRTEOR1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTEOR1(BigDecimal newvalue)
/*      */   {
/* 1698 */     this.fieldRTEOR1.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTEOR2(String newvalue)
/*      */   {
/* 1705 */     this.fieldRTEOR2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTEOR2(BigDecimal newvalue)
/*      */   {
/* 1712 */     this.fieldRTEOR2.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTEOR3(String newvalue)
/*      */   {
/* 1719 */     this.fieldRTEOR3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTEOR3(BigDecimal newvalue)
/*      */   {
/* 1726 */     this.fieldRTEOR3.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTEOR4(String newvalue)
/*      */   {
/* 1733 */     this.fieldRTEOR4.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTEOR4(BigDecimal newvalue)
/*      */   {
/* 1740 */     this.fieldRTEOR4.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTEPSB(String newvalue)
/*      */   {
/* 1747 */     this.fieldRTEPSB.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTESCC(String newvalue)
/*      */   {
/* 1754 */     this.fieldRTESCC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTESCC(BigDecimal newvalue)
/*      */   {
/* 1761 */     this.fieldRTESCC.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTESPC(String newvalue)
/*      */   {
/* 1768 */     this.fieldRTESPC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTESPC(BigDecimal newvalue)
/*      */   {
/* 1775 */     this.fieldRTESPC.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTESTC(String newvalue)
/*      */   {
/* 1782 */     this.fieldRTESTC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTESTC(BigDecimal newvalue)
/*      */   {
/* 1789 */     this.fieldRTESTC.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTEUNC(String newvalue)
/*      */   {
/* 1796 */     this.fieldRTEUNC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTEUNC(BigDecimal newvalue)
/*      */   {
/* 1803 */     this.fieldRTEUNC.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTEYRC(String newvalue)
/*      */   {
/* 1810 */     this.fieldRTEYRC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setRTEYRC(BigDecimal newvalue)
/*      */   {
/* 1817 */     this.fieldRTEYRC.setBigDecimal(newvalue);
/*      */   }
/*      */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.PRODSJVMessage
 * JD-Core Version:    0.6.0
 */