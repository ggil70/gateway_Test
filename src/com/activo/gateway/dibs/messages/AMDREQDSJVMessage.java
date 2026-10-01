/*      */ package com.activo.gateway.dibs.messages;
/*      */ 
/*      */ import java.math.BigDecimal;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*      */ 
/*      */ public class AMDREQDSJVMessage extends MessageRecord
/*      */ {
/*   20 */   final int FIELDCOUNT = 88;
/*   21 */   private CharacterField fieldAMDUSER = null;
/*   22 */   private CharacterField fieldAMDREF = null;
/*   23 */   private CharacterField fieldAMDTRF = null;
/*   24 */   private DecimalField fieldAMDLCR = null;
/*   25 */   private DecimalField fieldAMDLAN = null;
/*   26 */   private CharacterField fieldAMDBN1 = null;
/*   27 */   private CharacterField fieldAMDBN2 = null;
/*   28 */   private CharacterField fieldAMDBN3 = null;
/*   29 */   private CharacterField fieldAMDBN4 = null;
/*   30 */   private DecimalField fieldAMDAD1 = null;
/*   31 */   private DecimalField fieldAMDAD2 = null;
/*   32 */   private DecimalField fieldAMDAD3 = null;
/*   33 */   private DecimalField fieldAMDED1 = null;
/*   34 */   private DecimalField fieldAMDED2 = null;
/*   35 */   private DecimalField fieldAMDED3 = null;
/*   36 */   private CharacterField fieldAMDIDA = null;
/*   37 */   private DecimalField fieldAMDAMT = null;
/*   38 */   private DecimalField fieldAMDSD1 = null;
/*   39 */   private DecimalField fieldAMDSD2 = null;
/*   40 */   private DecimalField fieldAMDSD3 = null;
/*   41 */   private CharacterField fieldAMDSHF = null;
/*   42 */   private CharacterField fieldAMDSHT = null;
/*   43 */   private CharacterField fieldAMDAC1 = null;
/*   44 */   private CharacterField fieldAMDAC2 = null;
/*   45 */   private CharacterField fieldAMDAC3 = null;
/*   46 */   private CharacterField fieldAMDAC4 = null;
/*   47 */   private CharacterField fieldLCRNR01 = null;
/*   48 */   private CharacterField fieldLCRNR02 = null;
/*   49 */   private CharacterField fieldLCRNR03 = null;
/*   50 */   private CharacterField fieldLCRNR04 = null;
/*   51 */   private CharacterField fieldLCRNR05 = null;
/*   52 */   private CharacterField fieldLCRNR06 = null;
/*   53 */   private CharacterField fieldLCRNR07 = null;
/*   54 */   private CharacterField fieldLCRNR08 = null;
/*   55 */   private CharacterField fieldLCRNR09 = null;
/*   56 */   private CharacterField fieldLCRNR10 = null;
/*   57 */   private CharacterField fieldLCRNR11 = null;
/*   58 */   private CharacterField fieldLCRNR12 = null;
/*   59 */   private CharacterField fieldLCRNR13 = null;
/*   60 */   private CharacterField fieldLCRNR14 = null;
/*   61 */   private CharacterField fieldLCRNR15 = null;
/*   62 */   private CharacterField fieldLCRNR16 = null;
/*   63 */   private CharacterField fieldLCRNR17 = null;
/*   64 */   private CharacterField fieldLCRNR18 = null;
/*   65 */   private CharacterField fieldLCRNR19 = null;
/*   66 */   private CharacterField fieldLCRNR20 = null;
/*   67 */   private CharacterField fieldLCRNR21 = null;
/*   68 */   private CharacterField fieldLCRNR22 = null;
/*   69 */   private CharacterField fieldLCRNR23 = null;
/*   70 */   private CharacterField fieldLCRNR24 = null;
/*   71 */   private CharacterField fieldLCRNR25 = null;
/*   72 */   private CharacterField fieldLCRNR26 = null;
/*   73 */   private CharacterField fieldLCRNR27 = null;
/*   74 */   private CharacterField fieldLCRNR28 = null;
/*   75 */   private CharacterField fieldLCRNR29 = null;
/*   76 */   private CharacterField fieldLCRNR30 = null;
/*   77 */   private CharacterField fieldLCRNR31 = null;
/*   78 */   private CharacterField fieldLCRNR32 = null;
/*   79 */   private CharacterField fieldLCRNR33 = null;
/*   80 */   private CharacterField fieldLCRNR34 = null;
/*   81 */   private CharacterField fieldLCRNR35 = null;
/*   82 */   private CharacterField fieldLCRNR36 = null;
/*   83 */   private CharacterField fieldLCRNR37 = null;
/*   84 */   private CharacterField fieldLCRNR38 = null;
/*   85 */   private CharacterField fieldLCRNR39 = null;
/*   86 */   private CharacterField fieldLCRNR40 = null;
/*   87 */   private CharacterField fieldLCRNR41 = null;
/*   88 */   private CharacterField fieldLCRNR42 = null;
/*   89 */   private CharacterField fieldLCRNR43 = null;
/*   90 */   private CharacterField fieldLCRNR44 = null;
/*   91 */   private CharacterField fieldLCRNR45 = null;
/*   92 */   private CharacterField fieldLCRNR46 = null;
/*   93 */   private CharacterField fieldLCRNR47 = null;
/*   94 */   private CharacterField fieldLCRNR48 = null;
/*   95 */   private CharacterField fieldLCRNR49 = null;
/*   96 */   private CharacterField fieldLCRNR50 = null;
/*   97 */   private CharacterField fieldLCRSHP1 = null;
/*   98 */   private CharacterField fieldLCRSHP2 = null;
/*   99 */   private CharacterField fieldLCRSHP3 = null;
/*  100 */   private CharacterField fieldLCRSHP4 = null;
/*  101 */   private CharacterField fieldLCRSHP5 = null;
/*  102 */   private CharacterField fieldLCRSHP6 = null;
/*  103 */   private CharacterField fieldLCRSTR1 = null;
/*  104 */   private CharacterField fieldLCRSTR2 = null;
/*  105 */   private CharacterField fieldLCRSTR3 = null;
/*  106 */   private CharacterField fieldLCRSTR4 = null;
/*  107 */   private CharacterField fieldLCRSTR5 = null;
/*  108 */   private CharacterField fieldLCRSTR6 = null;
/*      */ 
/*      */   public AMDREQDSJVMessage()
/*      */   {
/*  115 */     createFields();
/*  116 */     initialize();
/*      */   }
/*      */ 
/*      */   protected void createFields()
/*      */   {
/*  125 */     this.recordsize = 2801;
/*  126 */     this.fileid = "1040914164819";
/*  127 */     this.recordid = "4EEC502CE2B2E";
/*  128 */     this.message = new byte[getByteLength()];
/*  129 */     this.formatname = "AMDREQDSJV";
/*  130 */     this.fieldnames = new String[88];
/*  131 */     this.tagnames = new String[88];
/*  132 */     this.fields = new MessageField[88];
/*      */ 
/*  134 */     this.fieldnames[0] = "AMDUSER";
/*  135 */     this.tagnames[0] = "AMDUSER";
/*      */      this.fields[0]=this.fieldAMDUSER=new CharacterField(this.message, 10, 10, "AMDUSER");
/*      */ 
/*  138 */     this.fieldnames[1] = "AMDREF";
/*  139 */     this.tagnames[1] = "AMDREF";
/*      */      this.fields[1]=this.fieldAMDREF=new CharacterField(this.message, 20, 16, "AMDREF");
/*      */ 
/*  142 */     this.fieldnames[2] = "AMDTRF";
/*  143 */     this.tagnames[2] = "AMDTRF";
/*      */      this.fields[2]=this.fieldAMDTRF=new CharacterField(this.message, 36, 16, "AMDTRF");
/*      */ 
/*  146 */     this.fieldnames[3] = "AMDLCR";
/*  147 */     this.tagnames[3] = "AMDLCR";
/*      */      this.fields[3]=this.fieldAMDLCR=new DecimalField(this.message, 52, 13, 0, "AMDLCR");
/*      */ 
/*  150 */     this.fieldnames[4] = "AMDLAN";
/*  151 */     this.tagnames[4] = "AMDLAN";
/*      */      this.fields[4]=this.fieldAMDLAN=new DecimalField(this.message, 65, 3, 0, "AMDLAN");
/*      */ 
/*  154 */     this.fieldnames[5] = "AMDBN1";
/*  155 */     this.tagnames[5] = "AMDBN1";
/*      */      this.fields[5]=this.fieldAMDBN1=new CharacterField(this.message, 68, 35, "AMDBN1");
/*      */ 
/*  158 */     this.fieldnames[6] = "AMDBN2";
/*  159 */     this.tagnames[6] = "AMDBN2";
/*      */      this.fields[6]=this.fieldAMDBN2=new CharacterField(this.message, 103, 35, "AMDBN2");
/*      */ 
/*  162 */     this.fieldnames[7] = "AMDBN3";
/*  163 */     this.tagnames[7] = "AMDBN3";
/*      */      this.fields[7]=this.fieldAMDBN3=new CharacterField(this.message, 138, 35, "AMDBN3");
/*      */ 
/*  166 */     this.fieldnames[8] = "AMDBN4";
/*  167 */     this.tagnames[8] = "AMDBN4";
/*      */      this.fields[8]=this.fieldAMDBN4=new CharacterField(this.message, 173, 35, "AMDBN4");
/*      */ 
/*  170 */     this.fieldnames[9] = "AMDAD1";
/*  171 */     this.tagnames[9] = "AMDAD1";
/*      */      this.fields[9]=this.fieldAMDAD1=new DecimalField(this.message, 208, 3, 0, "AMDAD1");
/*      */ 
/*  174 */     this.fieldnames[10] = "AMDAD2";
/*  175 */     this.tagnames[10] = "AMDAD2";
/*      */      this.fields[10]=this.fieldAMDAD2=new DecimalField(this.message, 211, 3, 0, "AMDAD2");
/*      */ 
/*  178 */     this.fieldnames[11] = "AMDAD3";
/*  179 */     this.tagnames[11] = "AMDAD3";
/*      */      this.fields[11]=this.fieldAMDAD3=new DecimalField(this.message, 214, 3, 0, "AMDAD3");
/*      */ 
/*  182 */     this.fieldnames[12] = "AMDED1";
/*  183 */     this.tagnames[12] = "AMDED1";
/*      */      this.fields[12]=this.fieldAMDED1=new DecimalField(this.message, 217, 3, 0, "AMDED1");
/*      */ 
/*  186 */     this.fieldnames[13] = "AMDED2";
/*  187 */     this.tagnames[13] = "AMDED2";
/*      */      this.fields[13]=this.fieldAMDED2=new DecimalField(this.message, 220, 3, 0, "AMDED2");
/*      */ 
/*  190 */     this.fieldnames[14] = "AMDED3";
/*  191 */     this.tagnames[14] = "AMDED3";
/*      */      this.fields[14]=this.fieldAMDED3=new DecimalField(this.message, 223, 3, 0, "AMDED3");
/*      */ 
/*  194 */     this.fieldnames[15] = "AMDIDA";
/*  195 */     this.tagnames[15] = "AMDIDA";
/*      */      this.fields[15]=this.fieldAMDIDA=new CharacterField(this.message, 226, 1, "AMDIDA");
/*      */ 
/*  198 */     this.fieldnames[16] = "AMDAMT";
/*  199 */     this.tagnames[16] = "AMDAMT";
/*      */      this.fields[16]=this.fieldAMDAMT=new DecimalField(this.message, 227, 15, 2, "AMDAMT");
/*      */ 
/*  202 */     this.fieldnames[17] = "AMDSD1";
/*  203 */     this.tagnames[17] = "AMDSD1";
/*      */      this.fields[17]=this.fieldAMDSD1=new DecimalField(this.message, 242, 3, 0, "AMDSD1");
/*      */ 
/*  206 */     this.fieldnames[18] = "AMDSD2";
/*  207 */     this.tagnames[18] = "AMDSD2";
/*      */      this.fields[18]=this.fieldAMDSD2=new DecimalField(this.message, 245, 3, 0, "AMDSD2");
/*      */ 
/*  210 */     this.fieldnames[19] = "AMDSD3";
/*  211 */     this.tagnames[19] = "AMDSD3";
/*      */      this.fields[19]=this.fieldAMDSD3=new DecimalField(this.message, 248, 3, 0, "AMDSD3");
/*      */ 
/*  214 */     this.fieldnames[20] = "AMDSHF";
/*  215 */     this.tagnames[20] = "AMDSHF";
/*      */      this.fields[20]=this.fieldAMDSHF=new CharacterField(this.message, 251, 35, "AMDSHF");
/*      */ 
/*  218 */     this.fieldnames[21] = "AMDSHT";
/*  219 */     this.tagnames[21] = "AMDSHT";
/*      */      this.fields[21]=this.fieldAMDSHT=new CharacterField(this.message, 286, 35, "AMDSHT");
/*      */ 
/*  222 */     this.fieldnames[22] = "AMDAC1";
/*  223 */     this.tagnames[22] = "AMDAC1";
/*      */      this.fields[22]=this.fieldAMDAC1=new CharacterField(this.message, 321, 35, "AMDAC1");
/*      */ 
/*  226 */     this.fieldnames[23] = "AMDAC2";
/*  227 */     this.tagnames[23] = "AMDAC2";
/*      */      this.fields[23]=this.fieldAMDAC2=new CharacterField(this.message, 356, 35, "AMDAC2");
/*      */ 
/*  230 */     this.fieldnames[24] = "AMDAC3";
/*  231 */     this.tagnames[24] = "AMDAC3";
/*      */      this.fields[24]=this.fieldAMDAC3=new CharacterField(this.message, 391, 35, "AMDAC3");
/*      */ 
/*  234 */     this.fieldnames[25] = "AMDAC4";
/*  235 */     this.tagnames[25] = "AMDAC4";
/*      */      this.fields[25]=this.fieldAMDAC4=new CharacterField(this.message, 426, 35, "AMDAC4");
/*      */ 
/*  238 */     this.fieldnames[26] = "LCRNR01";
/*  239 */     this.tagnames[26] = "LCRNR01";
/*      */      this.fields[26]=this.fieldLCRNR01=new CharacterField(this.message, 461, 35, "LCRNR01");
/*      */ 
/*  242 */     this.fieldnames[27] = "LCRNR02";
/*  243 */     this.tagnames[27] = "LCRNR02";
/*      */      this.fields[27]=this.fieldLCRNR02=new CharacterField(this.message, 496, 35, "LCRNR02");
/*      */ 
/*  246 */     this.fieldnames[28] = "LCRNR03";
/*  247 */     this.tagnames[28] = "LCRNR03";
/*      */      this.fields[28]=this.fieldLCRNR03=new CharacterField(this.message, 531, 35, "LCRNR03");
/*      */ 
/*  250 */     this.fieldnames[29] = "LCRNR04";
/*  251 */     this.tagnames[29] = "LCRNR04";
/*      */      this.fields[29]=this.fieldLCRNR04=new CharacterField(this.message, 566, 35, "LCRNR04");
/*      */ 
/*  254 */     this.fieldnames[30] = "LCRNR05";
/*  255 */     this.tagnames[30] = "LCRNR05";
/*      */      this.fields[30]=this.fieldLCRNR05=new CharacterField(this.message, 601, 35, "LCRNR05");
/*      */ 
/*  258 */     this.fieldnames[31] = "LCRNR06";
/*  259 */     this.tagnames[31] = "LCRNR06";
/*      */      this.fields[31]=this.fieldLCRNR06=new CharacterField(this.message, 636, 35, "LCRNR06");
/*      */ 
/*  262 */     this.fieldnames[32] = "LCRNR07";
/*  263 */     this.tagnames[32] = "LCRNR07";
/*      */      this.fields[32]=this.fieldLCRNR07=new CharacterField(this.message, 671, 35, "LCRNR07");
/*      */ 
/*  266 */     this.fieldnames[33] = "LCRNR08";
/*  267 */     this.tagnames[33] = "LCRNR08";
/*      */      this.fields[33]=this.fieldLCRNR08=new CharacterField(this.message, 706, 35, "LCRNR08");
/*      */ 
/*  270 */     this.fieldnames[34] = "LCRNR09";
/*  271 */     this.tagnames[34] = "LCRNR09";
/*      */      this.fields[34]=this.fieldLCRNR09=new CharacterField(this.message, 741, 35, "LCRNR09");
/*      */ 
/*  274 */     this.fieldnames[35] = "LCRNR10";
/*  275 */     this.tagnames[35] = "LCRNR10";
/*      */      this.fields[35]=this.fieldLCRNR10=new CharacterField(this.message, 776, 35, "LCRNR10");
/*      */ 
/*  278 */     this.fieldnames[36] = "LCRNR11";
/*  279 */     this.tagnames[36] = "LCRNR11";
/*      */      this.fields[36]=this.fieldLCRNR11=new CharacterField(this.message, 811, 35, "LCRNR11");
/*      */ 
/*  282 */     this.fieldnames[37] = "LCRNR12";
/*  283 */     this.tagnames[37] = "LCRNR12";
/*      */      this.fields[37]=this.fieldLCRNR12=new CharacterField(this.message, 846, 35, "LCRNR12");
/*      */ 
/*  286 */     this.fieldnames[38] = "LCRNR13";
/*  287 */     this.tagnames[38] = "LCRNR13";
/*      */      this.fields[38]=this.fieldLCRNR13=new CharacterField(this.message, 881, 35, "LCRNR13");
/*      */ 
/*  290 */     this.fieldnames[39] = "LCRNR14";
/*  291 */     this.tagnames[39] = "LCRNR14";
/*      */      this.fields[39]=this.fieldLCRNR14=new CharacterField(this.message, 916, 35, "LCRNR14");
/*      */ 
/*  294 */     this.fieldnames[40] = "LCRNR15";
/*  295 */     this.tagnames[40] = "LCRNR15";
/*      */      this.fields[40]=this.fieldLCRNR15=new CharacterField(this.message, 951, 35, "LCRNR15");
/*      */ 
/*  298 */     this.fieldnames[41] = "LCRNR16";
/*  299 */     this.tagnames[41] = "LCRNR16";
/*      */      this.fields[41]=this.fieldLCRNR16=new CharacterField(this.message, 986, 35, "LCRNR16");
/*      */ 
/*  302 */     this.fieldnames[42] = "LCRNR17";
/*  303 */     this.tagnames[42] = "LCRNR17";
/*      */      this.fields[42]=this.fieldLCRNR17=new CharacterField(this.message, 1021, 35, "LCRNR17");
/*      */ 
/*  306 */     this.fieldnames[43] = "LCRNR18";
/*  307 */     this.tagnames[43] = "LCRNR18";
/*      */      this.fields[43]=this.fieldLCRNR18=new CharacterField(this.message, 1056, 35, "LCRNR18");
/*      */ 
/*  310 */     this.fieldnames[44] = "LCRNR19";
/*  311 */     this.tagnames[44] = "LCRNR19";
/*      */      this.fields[44]=this.fieldLCRNR19=new CharacterField(this.message, 1091, 35, "LCRNR19");
/*      */ 
/*  314 */     this.fieldnames[45] = "LCRNR20";
/*  315 */     this.tagnames[45] = "LCRNR20";
/*      */      this.fields[45]=this.fieldLCRNR20=new CharacterField(this.message, 1126, 35, "LCRNR20");
/*      */ 
/*  318 */     this.fieldnames[46] = "LCRNR21";
/*  319 */     this.tagnames[46] = "LCRNR21";
/*      */      this.fields[46]=this.fieldLCRNR21=new CharacterField(this.message, 1161, 35, "LCRNR21");
/*      */ 
/*  322 */     this.fieldnames[47] = "LCRNR22";
/*  323 */     this.tagnames[47] = "LCRNR22";
/*      */      this.fields[47]=this.fieldLCRNR22=new CharacterField(this.message, 1196, 35, "LCRNR22");
/*      */ 
/*  326 */     this.fieldnames[48] = "LCRNR23";
/*  327 */     this.tagnames[48] = "LCRNR23";
/*      */      this.fields[48]=this.fieldLCRNR23=new CharacterField(this.message, 1231, 35, "LCRNR23");
/*      */ 
/*  330 */     this.fieldnames[49] = "LCRNR24";
/*  331 */     this.tagnames[49] = "LCRNR24";
/*      */      this.fields[49]=this.fieldLCRNR24=new CharacterField(this.message, 1266, 35, "LCRNR24");
/*      */ 
/*  334 */     this.fieldnames[50] = "LCRNR25";
/*  335 */     this.tagnames[50] = "LCRNR25";
/*      */      this.fields[50]=this.fieldLCRNR25=new CharacterField(this.message, 1301, 35, "LCRNR25");
/*      */ 
/*  338 */     this.fieldnames[51] = "LCRNR26";
/*  339 */     this.tagnames[51] = "LCRNR26";
/*      */      this.fields[51]=this.fieldLCRNR26=new CharacterField(this.message, 1336, 35, "LCRNR26");
/*      */ 
/*  342 */     this.fieldnames[52] = "LCRNR27";
/*  343 */     this.tagnames[52] = "LCRNR27";
/*      */      this.fields[52]=this.fieldLCRNR27=new CharacterField(this.message, 1371, 35, "LCRNR27");
/*      */ 
/*  346 */     this.fieldnames[53] = "LCRNR28";
/*  347 */     this.tagnames[53] = "LCRNR28";
/*      */      this.fields[53]=this.fieldLCRNR28=new CharacterField(this.message, 1406, 35, "LCRNR28");
/*      */ 
/*  350 */     this.fieldnames[54] = "LCRNR29";
/*  351 */     this.tagnames[54] = "LCRNR29";
/*      */      this.fields[54]=this.fieldLCRNR29=new CharacterField(this.message, 1441, 35, "LCRNR29");
/*      */ 
/*  354 */     this.fieldnames[55] = "LCRNR30";
/*  355 */     this.tagnames[55] = "LCRNR30";
/*      */      this.fields[55]=this.fieldLCRNR30=new CharacterField(this.message, 1476, 35, "LCRNR30");
/*      */ 
/*  358 */     this.fieldnames[56] = "LCRNR31";
/*  359 */     this.tagnames[56] = "LCRNR31";
/*      */      this.fields[56]=this.fieldLCRNR31=new CharacterField(this.message, 1511, 35, "LCRNR31");
/*      */ 
/*  362 */     this.fieldnames[57] = "LCRNR32";
/*  363 */     this.tagnames[57] = "LCRNR32";
/*      */      this.fields[57]=this.fieldLCRNR32=new CharacterField(this.message, 1546, 35, "LCRNR32");
/*      */ 
/*  366 */     this.fieldnames[58] = "LCRNR33";
/*  367 */     this.tagnames[58] = "LCRNR33";
/*      */      this.fields[58]=this.fieldLCRNR33=new CharacterField(this.message, 1581, 35, "LCRNR33");
/*      */ 
/*  370 */     this.fieldnames[59] = "LCRNR34";
/*  371 */     this.tagnames[59] = "LCRNR34";
/*      */      this.fields[59]=this.fieldLCRNR34=new CharacterField(this.message, 1616, 35, "LCRNR34");
/*      */ 
/*  374 */     this.fieldnames[60] = "LCRNR35";
/*  375 */     this.tagnames[60] = "LCRNR35";
/*      */      this.fields[60]=this.fieldLCRNR35=new CharacterField(this.message, 1651, 35, "LCRNR35");
/*      */ 
/*  378 */     this.fieldnames[61] = "LCRNR36";
/*  379 */     this.tagnames[61] = "LCRNR36";
/*      */      this.fields[61]=this.fieldLCRNR36=new CharacterField(this.message, 1686, 35, "LCRNR36");
/*      */ 
/*  382 */     this.fieldnames[62] = "LCRNR37";
/*  383 */     this.tagnames[62] = "LCRNR37";
/*      */      this.fields[62]=this.fieldLCRNR37=new CharacterField(this.message, 1721, 35, "LCRNR37");
/*      */ 
/*  386 */     this.fieldnames[63] = "LCRNR38";
/*  387 */     this.tagnames[63] = "LCRNR38";
/*      */      this.fields[63]=this.fieldLCRNR38=new CharacterField(this.message, 1756, 35, "LCRNR38");
/*      */ 
/*  390 */     this.fieldnames[64] = "LCRNR39";
/*  391 */     this.tagnames[64] = "LCRNR39";
/*      */      this.fields[64]=this.fieldLCRNR39=new CharacterField(this.message, 1791, 35, "LCRNR39");
/*      */ 
/*  394 */     this.fieldnames[65] = "LCRNR40";
/*  395 */     this.tagnames[65] = "LCRNR40";
/*      */      this.fields[65]=this.fieldLCRNR40=new CharacterField(this.message, 1826, 35, "LCRNR40");
/*      */ 
/*  398 */     this.fieldnames[66] = "LCRNR41";
/*  399 */     this.tagnames[66] = "LCRNR41";
/*      */      this.fields[66]=this.fieldLCRNR41=new CharacterField(this.message, 1861, 35, "LCRNR41");
/*      */ 
/*  402 */     this.fieldnames[67] = "LCRNR42";
/*  403 */     this.tagnames[67] = "LCRNR42";
/*      */      this.fields[67]=this.fieldLCRNR42=new CharacterField(this.message, 1896, 35, "LCRNR42");
/*      */ 
/*  406 */     this.fieldnames[68] = "LCRNR43";
/*  407 */     this.tagnames[68] = "LCRNR43";
/*      */      this.fields[68]=this.fieldLCRNR43=new CharacterField(this.message, 1931, 35, "LCRNR43");
/*      */ 
/*  410 */     this.fieldnames[69] = "LCRNR44";
/*  411 */     this.tagnames[69] = "LCRNR44";
/*      */      this.fields[69]=this.fieldLCRNR44=new CharacterField(this.message, 1966, 35, "LCRNR44");
/*      */ 
/*  414 */     this.fieldnames[70] = "LCRNR45";
/*  415 */     this.tagnames[70] = "LCRNR45";
/*      */      this.fields[70]=this.fieldLCRNR45=new CharacterField(this.message, 2001, 35, "LCRNR45");
/*      */ 
/*  418 */     this.fieldnames[71] = "LCRNR46";
/*  419 */     this.tagnames[71] = "LCRNR46";
/*      */      this.fields[71]=this.fieldLCRNR46=new CharacterField(this.message, 2036, 35, "LCRNR46");
/*      */ 
/*  422 */     this.fieldnames[72] = "LCRNR47";
/*  423 */     this.tagnames[72] = "LCRNR47";
/*      */      this.fields[72]=this.fieldLCRNR47=new CharacterField(this.message, 2071, 35, "LCRNR47");
/*      */ 
/*  426 */     this.fieldnames[73] = "LCRNR48";
/*  427 */     this.tagnames[73] = "LCRNR48";
/*      */      this.fields[73]=this.fieldLCRNR48=new CharacterField(this.message, 2106, 35, "LCRNR48");
/*      */ 
/*  430 */     this.fieldnames[74] = "LCRNR49";
/*  431 */     this.tagnames[74] = "LCRNR49";
/*      */      this.fields[74]=this.fieldLCRNR49=new CharacterField(this.message, 2141, 35, "LCRNR49");
/*      */ 
/*  434 */     this.fieldnames[75] = "LCRNR50";
/*  435 */     this.tagnames[75] = "LCRNR50";
/*      */      this.fields[75]=this.fieldLCRNR50=new CharacterField(this.message, 2176, 35, "LCRNR50");
/*      */ 
/*  438 */     this.fieldnames[76] = "LCRSHP1";
/*  439 */     this.tagnames[76] = "LCRSHP1";
/*      */      this.fields[76]=this.fieldLCRSHP1=new CharacterField(this.message, 2211, 65, "LCRSHP1");
/*      */ 
/*  442 */     this.fieldnames[77] = "LCRSHP2";
/*  443 */     this.tagnames[77] = "LCRSHP2";
/*      */      this.fields[77]=this.fieldLCRSHP2=new CharacterField(this.message, 2276, 65, "LCRSHP2");
/*      */ 
/*  446 */     this.fieldnames[78] = "LCRSHP3";
/*  447 */     this.tagnames[78] = "LCRSHP3";
/*      */      this.fields[78]=this.fieldLCRSHP3=new CharacterField(this.message, 2341, 65, "LCRSHP3");
/*      */ 
/*  450 */     this.fieldnames[79] = "LCRSHP4";
/*  451 */     this.tagnames[79] = "LCRSHP4";
/*      */      this.fields[79]=this.fieldLCRSHP4=new CharacterField(this.message, 2406, 65, "LCRSHP4");
/*      */ 
/*  454 */     this.fieldnames[80] = "LCRSHP5";
/*  455 */     this.tagnames[80] = "LCRSHP5";
/*      */      this.fields[80]=this.fieldLCRSHP5=new CharacterField(this.message, 2471, 65, "LCRSHP5");
/*      */ 
/*  458 */     this.fieldnames[81] = "LCRSHP6";
/*  459 */     this.tagnames[81] = "LCRSHP6";
/*      */      this.fields[81]=this.fieldLCRSHP6=new CharacterField(this.message, 2536, 65, "LCRSHP6");
/*      */ 
/*  462 */     this.fieldnames[82] = "LCRSTR1";
/*  463 */     this.tagnames[82] = "LCRSTR1";
/*      */      this.fields[82]=this.fieldLCRSTR1=new CharacterField(this.message, 2601, 35, "LCRSTR1");
/*      */ 
/*  466 */     this.fieldnames[83] = "LCRSTR2";
/*  467 */     this.tagnames[83] = "LCRSTR2";
/*      */      this.fields[83]=this.fieldLCRSTR2=new CharacterField(this.message, 2636, 35, "LCRSTR2");
/*      */ 
/*  470 */     this.fieldnames[84] = "LCRSTR3";
/*  471 */     this.tagnames[84] = "LCRSTR3";
/*      */      this.fields[84]=this.fieldLCRSTR3=new CharacterField(this.message, 2671, 35, "LCRSTR3");
/*      */ 
/*  474 */     this.fieldnames[85] = "LCRSTR4";
/*  475 */     this.tagnames[85] = "LCRSTR4";
/*      */      this.fields[85]=this.fieldLCRSTR4=new CharacterField(this.message, 2706, 35, "LCRSTR4");
/*      */ 
/*  478 */     this.fieldnames[86] = "LCRSTR5";
/*  479 */     this.tagnames[86] = "LCRSTR5";
/*      */      this.fields[86]=this.fieldLCRSTR5=new CharacterField(this.message, 2741, 35, "LCRSTR5");
/*      */ 
/*  482 */     this.fieldnames[87] = "LCRSTR6";
/*  483 */     this.tagnames[87] = "LCRSTR6";
/*      */      this.fields[87]=this.fieldLCRSTR6=new CharacterField(this.message, 2776, 35, "LCRSTR6");
/*      */   }
/*      */ 
/*      */   public void setAMDUSER(String newvalue)
/*      */   {
/*  493 */     this.fieldAMDUSER.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getAMDUSER()
/*      */   {
/*  501 */     return this.fieldAMDUSER.getString();
/*      */   }
/*      */ 
/*      */   public void setAMDREF(String newvalue)
/*      */   {
/*  509 */     this.fieldAMDREF.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getAMDREF()
/*      */   {
/*  517 */     return this.fieldAMDREF.getString();
/*      */   }
/*      */ 
/*      */   public void setAMDTRF(String newvalue)
/*      */   {
/*  525 */     this.fieldAMDTRF.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getAMDTRF()
/*      */   {
/*  533 */     return this.fieldAMDTRF.getString();
/*      */   }
/*      */ 
/*      */   public void setAMDLCR(String newvalue)
/*      */   {
/*  541 */     this.fieldAMDLCR.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getAMDLCR()
/*      */   {
/*  549 */     return this.fieldAMDLCR.getString();
/*      */   }
/*      */ 
/*      */   public void setAMDLCR(BigDecimal newvalue)
/*      */   {
/*  557 */     this.fieldAMDLCR.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalAMDLCR()
/*      */   {
/*  565 */     return this.fieldAMDLCR.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setAMDLAN(String newvalue)
/*      */   {
/*  573 */     this.fieldAMDLAN.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getAMDLAN()
/*      */   {
/*  581 */     return this.fieldAMDLAN.getString();
/*      */   }
/*      */ 
/*      */   public void setAMDLAN(BigDecimal newvalue)
/*      */   {
/*  589 */     this.fieldAMDLAN.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalAMDLAN()
/*      */   {
/*  597 */     return this.fieldAMDLAN.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setAMDBN1(String newvalue)
/*      */   {
/*  605 */     this.fieldAMDBN1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getAMDBN1()
/*      */   {
/*  613 */     return this.fieldAMDBN1.getString();
/*      */   }
/*      */ 
/*      */   public void setAMDBN2(String newvalue)
/*      */   {
/*  621 */     this.fieldAMDBN2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getAMDBN2()
/*      */   {
/*  629 */     return this.fieldAMDBN2.getString();
/*      */   }
/*      */ 
/*      */   public void setAMDBN3(String newvalue)
/*      */   {
/*  637 */     this.fieldAMDBN3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getAMDBN3()
/*      */   {
/*  645 */     return this.fieldAMDBN3.getString();
/*      */   }
/*      */ 
/*      */   public void setAMDBN4(String newvalue)
/*      */   {
/*  653 */     this.fieldAMDBN4.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getAMDBN4()
/*      */   {
/*  661 */     return this.fieldAMDBN4.getString();
/*      */   }
/*      */ 
/*      */   public void setAMDAD1(String newvalue)
/*      */   {
/*  669 */     this.fieldAMDAD1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getAMDAD1()
/*      */   {
/*  677 */     return this.fieldAMDAD1.getString();
/*      */   }
/*      */ 
/*      */   public void setAMDAD1(BigDecimal newvalue)
/*      */   {
/*  685 */     this.fieldAMDAD1.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalAMDAD1()
/*      */   {
/*  693 */     return this.fieldAMDAD1.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setAMDAD2(String newvalue)
/*      */   {
/*  701 */     this.fieldAMDAD2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getAMDAD2()
/*      */   {
/*  709 */     return this.fieldAMDAD2.getString();
/*      */   }
/*      */ 
/*      */   public void setAMDAD2(BigDecimal newvalue)
/*      */   {
/*  717 */     this.fieldAMDAD2.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalAMDAD2()
/*      */   {
/*  725 */     return this.fieldAMDAD2.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setAMDAD3(String newvalue)
/*      */   {
/*  733 */     this.fieldAMDAD3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getAMDAD3()
/*      */   {
/*  741 */     return this.fieldAMDAD3.getString();
/*      */   }
/*      */ 
/*      */   public void setAMDAD3(BigDecimal newvalue)
/*      */   {
/*  749 */     this.fieldAMDAD3.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalAMDAD3()
/*      */   {
/*  757 */     return this.fieldAMDAD3.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setAMDED1(String newvalue)
/*      */   {
/*  765 */     this.fieldAMDED1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getAMDED1()
/*      */   {
/*  773 */     return this.fieldAMDED1.getString();
/*      */   }
/*      */ 
/*      */   public void setAMDED1(BigDecimal newvalue)
/*      */   {
/*  781 */     this.fieldAMDED1.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalAMDED1()
/*      */   {
/*  789 */     return this.fieldAMDED1.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setAMDED2(String newvalue)
/*      */   {
/*  797 */     this.fieldAMDED2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getAMDED2()
/*      */   {
/*  805 */     return this.fieldAMDED2.getString();
/*      */   }
/*      */ 
/*      */   public void setAMDED2(BigDecimal newvalue)
/*      */   {
/*  813 */     this.fieldAMDED2.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalAMDED2()
/*      */   {
/*  821 */     return this.fieldAMDED2.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setAMDED3(String newvalue)
/*      */   {
/*  829 */     this.fieldAMDED3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getAMDED3()
/*      */   {
/*  837 */     return this.fieldAMDED3.getString();
/*      */   }
/*      */ 
/*      */   public void setAMDED3(BigDecimal newvalue)
/*      */   {
/*  845 */     this.fieldAMDED3.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalAMDED3()
/*      */   {
/*  853 */     return this.fieldAMDED3.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setAMDIDA(String newvalue)
/*      */   {
/*  861 */     this.fieldAMDIDA.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getAMDIDA()
/*      */   {
/*  869 */     return this.fieldAMDIDA.getString();
/*      */   }
/*      */ 
/*      */   public void setAMDAMT(String newvalue)
/*      */   {
/*  877 */     this.fieldAMDAMT.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getAMDAMT()
/*      */   {
/*  885 */     return this.fieldAMDAMT.getString();
/*      */   }
/*      */ 
/*      */   public void setAMDAMT(BigDecimal newvalue)
/*      */   {
/*  893 */     this.fieldAMDAMT.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalAMDAMT()
/*      */   {
/*  901 */     return this.fieldAMDAMT.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setAMDSD1(String newvalue)
/*      */   {
/*  909 */     this.fieldAMDSD1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getAMDSD1()
/*      */   {
/*  917 */     return this.fieldAMDSD1.getString();
/*      */   }
/*      */ 
/*      */   public void setAMDSD1(BigDecimal newvalue)
/*      */   {
/*  925 */     this.fieldAMDSD1.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalAMDSD1()
/*      */   {
/*  933 */     return this.fieldAMDSD1.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setAMDSD2(String newvalue)
/*      */   {
/*  941 */     this.fieldAMDSD2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getAMDSD2()
/*      */   {
/*  949 */     return this.fieldAMDSD2.getString();
/*      */   }
/*      */ 
/*      */   public void setAMDSD2(BigDecimal newvalue)
/*      */   {
/*  957 */     this.fieldAMDSD2.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalAMDSD2()
/*      */   {
/*  965 */     return this.fieldAMDSD2.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setAMDSD3(String newvalue)
/*      */   {
/*  973 */     this.fieldAMDSD3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getAMDSD3()
/*      */   {
/*  981 */     return this.fieldAMDSD3.getString();
/*      */   }
/*      */ 
/*      */   public void setAMDSD3(BigDecimal newvalue)
/*      */   {
/*  989 */     this.fieldAMDSD3.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalAMDSD3()
/*      */   {
/*  997 */     return this.fieldAMDSD3.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setAMDSHF(String newvalue)
/*      */   {
/* 1005 */     this.fieldAMDSHF.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getAMDSHF()
/*      */   {
/* 1013 */     return this.fieldAMDSHF.getString();
/*      */   }
/*      */ 
/*      */   public void setAMDSHT(String newvalue)
/*      */   {
/* 1021 */     this.fieldAMDSHT.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getAMDSHT()
/*      */   {
/* 1029 */     return this.fieldAMDSHT.getString();
/*      */   }
/*      */ 
/*      */   public void setAMDAC1(String newvalue)
/*      */   {
/* 1037 */     this.fieldAMDAC1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getAMDAC1()
/*      */   {
/* 1045 */     return this.fieldAMDAC1.getString();
/*      */   }
/*      */ 
/*      */   public void setAMDAC2(String newvalue)
/*      */   {
/* 1053 */     this.fieldAMDAC2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getAMDAC2()
/*      */   {
/* 1061 */     return this.fieldAMDAC2.getString();
/*      */   }
/*      */ 
/*      */   public void setAMDAC3(String newvalue)
/*      */   {
/* 1069 */     this.fieldAMDAC3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getAMDAC3()
/*      */   {
/* 1077 */     return this.fieldAMDAC3.getString();
/*      */   }
/*      */ 
/*      */   public void setAMDAC4(String newvalue)
/*      */   {
/* 1085 */     this.fieldAMDAC4.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getAMDAC4()
/*      */   {
/* 1093 */     return this.fieldAMDAC4.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRNR01(String newvalue)
/*      */   {
/* 1101 */     this.fieldLCRNR01.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRNR01()
/*      */   {
/* 1109 */     return this.fieldLCRNR01.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRNR02(String newvalue)
/*      */   {
/* 1117 */     this.fieldLCRNR02.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRNR02()
/*      */   {
/* 1125 */     return this.fieldLCRNR02.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRNR03(String newvalue)
/*      */   {
/* 1133 */     this.fieldLCRNR03.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRNR03()
/*      */   {
/* 1141 */     return this.fieldLCRNR03.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRNR04(String newvalue)
/*      */   {
/* 1149 */     this.fieldLCRNR04.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRNR04()
/*      */   {
/* 1157 */     return this.fieldLCRNR04.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRNR05(String newvalue)
/*      */   {
/* 1165 */     this.fieldLCRNR05.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRNR05()
/*      */   {
/* 1173 */     return this.fieldLCRNR05.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRNR06(String newvalue)
/*      */   {
/* 1181 */     this.fieldLCRNR06.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRNR06()
/*      */   {
/* 1189 */     return this.fieldLCRNR06.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRNR07(String newvalue)
/*      */   {
/* 1197 */     this.fieldLCRNR07.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRNR07()
/*      */   {
/* 1205 */     return this.fieldLCRNR07.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRNR08(String newvalue)
/*      */   {
/* 1213 */     this.fieldLCRNR08.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRNR08()
/*      */   {
/* 1221 */     return this.fieldLCRNR08.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRNR09(String newvalue)
/*      */   {
/* 1229 */     this.fieldLCRNR09.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRNR09()
/*      */   {
/* 1237 */     return this.fieldLCRNR09.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRNR10(String newvalue)
/*      */   {
/* 1245 */     this.fieldLCRNR10.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRNR10()
/*      */   {
/* 1253 */     return this.fieldLCRNR10.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRNR11(String newvalue)
/*      */   {
/* 1261 */     this.fieldLCRNR11.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRNR11()
/*      */   {
/* 1269 */     return this.fieldLCRNR11.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRNR12(String newvalue)
/*      */   {
/* 1277 */     this.fieldLCRNR12.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRNR12()
/*      */   {
/* 1285 */     return this.fieldLCRNR12.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRNR13(String newvalue)
/*      */   {
/* 1293 */     this.fieldLCRNR13.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRNR13()
/*      */   {
/* 1301 */     return this.fieldLCRNR13.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRNR14(String newvalue)
/*      */   {
/* 1309 */     this.fieldLCRNR14.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRNR14()
/*      */   {
/* 1317 */     return this.fieldLCRNR14.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRNR15(String newvalue)
/*      */   {
/* 1325 */     this.fieldLCRNR15.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRNR15()
/*      */   {
/* 1333 */     return this.fieldLCRNR15.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRNR16(String newvalue)
/*      */   {
/* 1341 */     this.fieldLCRNR16.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRNR16()
/*      */   {
/* 1349 */     return this.fieldLCRNR16.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRNR17(String newvalue)
/*      */   {
/* 1357 */     this.fieldLCRNR17.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRNR17()
/*      */   {
/* 1365 */     return this.fieldLCRNR17.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRNR18(String newvalue)
/*      */   {
/* 1373 */     this.fieldLCRNR18.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRNR18()
/*      */   {
/* 1381 */     return this.fieldLCRNR18.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRNR19(String newvalue)
/*      */   {
/* 1389 */     this.fieldLCRNR19.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRNR19()
/*      */   {
/* 1397 */     return this.fieldLCRNR19.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRNR20(String newvalue)
/*      */   {
/* 1405 */     this.fieldLCRNR20.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRNR20()
/*      */   {
/* 1413 */     return this.fieldLCRNR20.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRNR21(String newvalue)
/*      */   {
/* 1421 */     this.fieldLCRNR21.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRNR21()
/*      */   {
/* 1429 */     return this.fieldLCRNR21.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRNR22(String newvalue)
/*      */   {
/* 1437 */     this.fieldLCRNR22.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRNR22()
/*      */   {
/* 1445 */     return this.fieldLCRNR22.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRNR23(String newvalue)
/*      */   {
/* 1453 */     this.fieldLCRNR23.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRNR23()
/*      */   {
/* 1461 */     return this.fieldLCRNR23.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRNR24(String newvalue)
/*      */   {
/* 1469 */     this.fieldLCRNR24.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRNR24()
/*      */   {
/* 1477 */     return this.fieldLCRNR24.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRNR25(String newvalue)
/*      */   {
/* 1485 */     this.fieldLCRNR25.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRNR25()
/*      */   {
/* 1493 */     return this.fieldLCRNR25.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRNR26(String newvalue)
/*      */   {
/* 1501 */     this.fieldLCRNR26.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRNR26()
/*      */   {
/* 1509 */     return this.fieldLCRNR26.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRNR27(String newvalue)
/*      */   {
/* 1517 */     this.fieldLCRNR27.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRNR27()
/*      */   {
/* 1525 */     return this.fieldLCRNR27.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRNR28(String newvalue)
/*      */   {
/* 1533 */     this.fieldLCRNR28.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRNR28()
/*      */   {
/* 1541 */     return this.fieldLCRNR28.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRNR29(String newvalue)
/*      */   {
/* 1549 */     this.fieldLCRNR29.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRNR29()
/*      */   {
/* 1557 */     return this.fieldLCRNR29.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRNR30(String newvalue)
/*      */   {
/* 1565 */     this.fieldLCRNR30.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRNR30()
/*      */   {
/* 1573 */     return this.fieldLCRNR30.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRNR31(String newvalue)
/*      */   {
/* 1581 */     this.fieldLCRNR31.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRNR31()
/*      */   {
/* 1589 */     return this.fieldLCRNR31.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRNR32(String newvalue)
/*      */   {
/* 1597 */     this.fieldLCRNR32.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRNR32()
/*      */   {
/* 1605 */     return this.fieldLCRNR32.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRNR33(String newvalue)
/*      */   {
/* 1613 */     this.fieldLCRNR33.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRNR33()
/*      */   {
/* 1621 */     return this.fieldLCRNR33.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRNR34(String newvalue)
/*      */   {
/* 1629 */     this.fieldLCRNR34.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRNR34()
/*      */   {
/* 1637 */     return this.fieldLCRNR34.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRNR35(String newvalue)
/*      */   {
/* 1645 */     this.fieldLCRNR35.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRNR35()
/*      */   {
/* 1653 */     return this.fieldLCRNR35.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRNR36(String newvalue)
/*      */   {
/* 1661 */     this.fieldLCRNR36.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRNR36()
/*      */   {
/* 1669 */     return this.fieldLCRNR36.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRNR37(String newvalue)
/*      */   {
/* 1677 */     this.fieldLCRNR37.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRNR37()
/*      */   {
/* 1685 */     return this.fieldLCRNR37.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRNR38(String newvalue)
/*      */   {
/* 1693 */     this.fieldLCRNR38.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRNR38()
/*      */   {
/* 1701 */     return this.fieldLCRNR38.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRNR39(String newvalue)
/*      */   {
/* 1709 */     this.fieldLCRNR39.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRNR39()
/*      */   {
/* 1717 */     return this.fieldLCRNR39.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRNR40(String newvalue)
/*      */   {
/* 1725 */     this.fieldLCRNR40.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRNR40()
/*      */   {
/* 1733 */     return this.fieldLCRNR40.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRNR41(String newvalue)
/*      */   {
/* 1741 */     this.fieldLCRNR41.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRNR41()
/*      */   {
/* 1749 */     return this.fieldLCRNR41.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRNR42(String newvalue)
/*      */   {
/* 1757 */     this.fieldLCRNR42.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRNR42()
/*      */   {
/* 1765 */     return this.fieldLCRNR42.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRNR43(String newvalue)
/*      */   {
/* 1773 */     this.fieldLCRNR43.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRNR43()
/*      */   {
/* 1781 */     return this.fieldLCRNR43.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRNR44(String newvalue)
/*      */   {
/* 1789 */     this.fieldLCRNR44.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRNR44()
/*      */   {
/* 1797 */     return this.fieldLCRNR44.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRNR45(String newvalue)
/*      */   {
/* 1805 */     this.fieldLCRNR45.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRNR45()
/*      */   {
/* 1813 */     return this.fieldLCRNR45.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRNR46(String newvalue)
/*      */   {
/* 1821 */     this.fieldLCRNR46.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRNR46()
/*      */   {
/* 1829 */     return this.fieldLCRNR46.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRNR47(String newvalue)
/*      */   {
/* 1837 */     this.fieldLCRNR47.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRNR47()
/*      */   {
/* 1845 */     return this.fieldLCRNR47.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRNR48(String newvalue)
/*      */   {
/* 1853 */     this.fieldLCRNR48.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRNR48()
/*      */   {
/* 1861 */     return this.fieldLCRNR48.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRNR49(String newvalue)
/*      */   {
/* 1869 */     this.fieldLCRNR49.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRNR49()
/*      */   {
/* 1877 */     return this.fieldLCRNR49.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRNR50(String newvalue)
/*      */   {
/* 1885 */     this.fieldLCRNR50.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRNR50()
/*      */   {
/* 1893 */     return this.fieldLCRNR50.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRSHP1(String newvalue)
/*      */   {
/* 1901 */     this.fieldLCRSHP1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRSHP1()
/*      */   {
/* 1909 */     return this.fieldLCRSHP1.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRSHP2(String newvalue)
/*      */   {
/* 1917 */     this.fieldLCRSHP2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRSHP2()
/*      */   {
/* 1925 */     return this.fieldLCRSHP2.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRSHP3(String newvalue)
/*      */   {
/* 1933 */     this.fieldLCRSHP3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRSHP3()
/*      */   {
/* 1941 */     return this.fieldLCRSHP3.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRSHP4(String newvalue)
/*      */   {
/* 1949 */     this.fieldLCRSHP4.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRSHP4()
/*      */   {
/* 1957 */     return this.fieldLCRSHP4.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRSHP5(String newvalue)
/*      */   {
/* 1965 */     this.fieldLCRSHP5.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRSHP5()
/*      */   {
/* 1973 */     return this.fieldLCRSHP5.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRSHP6(String newvalue)
/*      */   {
/* 1981 */     this.fieldLCRSHP6.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRSHP6()
/*      */   {
/* 1989 */     return this.fieldLCRSHP6.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRSTR1(String newvalue)
/*      */   {
/* 1997 */     this.fieldLCRSTR1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRSTR1()
/*      */   {
/* 2005 */     return this.fieldLCRSTR1.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRSTR2(String newvalue)
/*      */   {
/* 2013 */     this.fieldLCRSTR2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRSTR2()
/*      */   {
/* 2021 */     return this.fieldLCRSTR2.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRSTR3(String newvalue)
/*      */   {
/* 2029 */     this.fieldLCRSTR3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRSTR3()
/*      */   {
/* 2037 */     return this.fieldLCRSTR3.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRSTR4(String newvalue)
/*      */   {
/* 2045 */     this.fieldLCRSTR4.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRSTR4()
/*      */   {
/* 2053 */     return this.fieldLCRSTR4.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRSTR5(String newvalue)
/*      */   {
/* 2061 */     this.fieldLCRSTR5.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRSTR5()
/*      */   {
/* 2069 */     return this.fieldLCRSTR5.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRSTR6(String newvalue)
/*      */   {
/* 2077 */     this.fieldLCRSTR6.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRSTR6()
/*      */   {
/* 2085 */     return this.fieldLCRSTR6.getString();
/*      */   }
/*      */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.AMDREQDSJVMessage
 * JD-Core Version:    0.6.0
 */