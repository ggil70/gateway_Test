/*      */ package com.activo.gateway.dibs.messages;
/*      */ 
/*      */ import java.math.BigDecimal;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*      */ 
/*      */ public class ESD000005Message extends MessageRecord
/*      */ {
/*   20 */   final int FIELDCOUNT = 53;
/*   21 */   private CharacterField fieldH05USR = null;
/*   22 */   private CharacterField fieldH05PGM = null;
/*   23 */   private CharacterField fieldH05TIM = null;
/*   24 */   private CharacterField fieldH05SCR = null;
/*   25 */   private CharacterField fieldH05OPE = null;
/*   26 */   private CharacterField fieldH05MAS = null;
/*   27 */   private CharacterField fieldH05WK1 = null;
/*   28 */   private CharacterField fieldH05WK2 = null;
/*   29 */   private CharacterField fieldH05WK3 = null;
/*   30 */   private CharacterField fieldE05TYP = null;
/*   31 */   private DecimalField fieldE05ACC = null;
/*   32 */   private DecimalField fieldE05LNE = null;
/*   33 */   private DecimalField fieldE05SEQ = null;
/*   34 */   private CharacterField fieldE15DSC = null;
/*   35 */   private CharacterField fieldE25DSC = null;
/*   36 */   private CharacterField fieldE35DSC = null;
/*   37 */   private CharacterField fieldE45DSC = null;
/*   38 */   private CharacterField fieldE55DSC = null;
/*   39 */   private CharacterField fieldE65DSC = null;
/*   40 */   private CharacterField fieldE75DSC = null;
/*   41 */   private CharacterField fieldE85DSC = null;
/*   42 */   private CharacterField fieldE95DSC = null;
/*   43 */   private CharacterField fieldE05DSC = null;
/*   44 */   private CharacterField fieldEA5DSC = null;
/*   45 */   private CharacterField fieldEB5DSC = null;
/*   46 */   private CharacterField fieldEC5DSC = null;
/*   47 */   private CharacterField fieldED5DSC = null;
/*   48 */   private CharacterField fieldEE5DSC = null;
/*   49 */   private CharacterField fieldEF5DSC = null;
/*   50 */   private CharacterField fieldEG5DSC = null;
/*   51 */   private CharacterField fieldEH5DSC = null;
/*   52 */   private CharacterField fieldEI5DSC = null;
/*   53 */   private CharacterField fieldEJ5DSC = null;
/*   54 */   private DecimalField fieldE15RCN = null;
/*   55 */   private DecimalField fieldE25RCN = null;
/*   56 */   private DecimalField fieldE35RCN = null;
/*   57 */   private DecimalField fieldE45RCN = null;
/*   58 */   private DecimalField fieldE55RCN = null;
/*   59 */   private DecimalField fieldE65RCN = null;
/*   60 */   private DecimalField fieldE75RCN = null;
/*   61 */   private DecimalField fieldE85RCN = null;
/*   62 */   private DecimalField fieldE95RCN = null;
/*   63 */   private DecimalField fieldE05RCN = null;
/*   64 */   private DecimalField fieldEA5RCN = null;
/*   65 */   private DecimalField fieldEB5RCN = null;
/*   66 */   private DecimalField fieldEC5RCN = null;
/*   67 */   private DecimalField fieldED5RCN = null;
/*   68 */   private DecimalField fieldEE5RCN = null;
/*   69 */   private DecimalField fieldEF5RCN = null;
/*   70 */   private DecimalField fieldEG5RCN = null;
/*   71 */   private DecimalField fieldEH5RCN = null;
/*   72 */   private DecimalField fieldEI5RCN = null;
/*   73 */   private DecimalField fieldEJ5RCN = null;
/*      */ 
/*      */   public ESD000005Message()
/*      */   {
/*   80 */     createFields();
/*   81 */     initialize();
/*      */   }
/*      */ 
/*      */   protected void createFields()
/*      */   {
/*   89 */     this.recordsize = 1865;
/*   90 */     this.fileid = "1001020165123";
/*   91 */     this.recordid = "3225D12C5D434";
/*   92 */     this.message = new byte[getByteLength()];
/*   93 */     this.formatname = "ESD000005";
/*   94 */     this.fieldnames = new String[53];
/*   95 */     this.tagnames = new String[53];
/*   96 */     this.fields = new MessageField[53];
/*      */ 
/*   98 */     this.fieldnames[0] = "H05USR";
/*   99 */     this.tagnames[0] = "H05USR";
/*      */      this.fields[0]=this.fieldH05USR=new CharacterField(this.message, 10, 10, "H05USR");
/*      */ 
/*  102 */     this.fieldnames[1] = "H05PGM";
/*  103 */     this.tagnames[1] = "H05PGM";
/*      */      this.fields[1]=this.fieldH05PGM=new CharacterField(this.message, 20, 10, "H05PGM");
/*      */ 
/*  106 */     this.fieldnames[2] = "H05TIM";
/*  107 */     this.tagnames[2] = "H05TIM";
/*      */      this.fields[2]=this.fieldH05TIM=new CharacterField(this.message, 30, 12, "H05TIM");
/*      */ 
/*  110 */     this.fieldnames[3] = "H05SCR";
/*  111 */     this.tagnames[3] = "H05SCR";
/*      */      this.fields[3]=this.fieldH05SCR=new CharacterField(this.message, 42, 2, "H05SCR");
/*      */ 
/*  114 */     this.fieldnames[4] = "H05OPE";
/*  115 */     this.tagnames[4] = "H05OPE";
/*      */      this.fields[4]=this.fieldH05OPE=new CharacterField(this.message, 44, 4, "H05OPE");
/*      */ 
/*  118 */     this.fieldnames[5] = "H05MAS";
/*  119 */     this.tagnames[5] = "H05MAS";
/*      */      this.fields[5]=this.fieldH05MAS=new CharacterField(this.message, 48, 1, "H05MAS");
/*      */ 
/*  122 */     this.fieldnames[6] = "H05WK1";
/*  123 */     this.tagnames[6] = "H05WK1";
/*      */      this.fields[6]=this.fieldH05WK1=new CharacterField(this.message, 49, 1, "H05WK1");
/*      */ 
/*  126 */     this.fieldnames[7] = "H05WK2";
/*  127 */     this.tagnames[7] = "H05WK2";
/*      */      this.fields[7]=this.fieldH05WK2=new CharacterField(this.message, 50, 1, "H05WK2");
/*      */ 
/*  130 */     this.fieldnames[8] = "H05WK3";
/*  131 */     this.tagnames[8] = "H05WK3";
/*      */      this.fields[8]=this.fieldH05WK3=new CharacterField(this.message, 51, 1, "H05WK3");
/*      */ 
/*  134 */     this.fieldnames[9] = "E05TYP";
/*  135 */     this.tagnames[9] = "E05TYP";
/*      */      this.fields[9]=this.fieldE05TYP=new CharacterField(this.message, 52, 1, "E05TYP");
/*      */ 
/*  138 */     this.fieldnames[10] = "E05ACC";
/*  139 */     this.tagnames[10] = "E05ACC";
/*      */      this.fields[10]=this.fieldE05ACC=new DecimalField(this.message, 53, 13, 0, "E05ACC");
/*      */ 
/*  142 */     this.fieldnames[11] = "E05LNE";
/*  143 */     this.tagnames[11] = "E05LNE";
/*      */      this.fields[11]=this.fieldE05LNE=new DecimalField(this.message, 66, 5, 0, "E05LNE");
/*      */ 
/*  146 */     this.fieldnames[12] = "E05SEQ";
/*  147 */     this.tagnames[12] = "E05SEQ";
/*      */      this.fields[12]=this.fieldE05SEQ=new DecimalField(this.message, 71, 4, 0, "E05SEQ");
/*      */ 
/*  150 */     this.fieldnames[13] = "E15DSC";
/*  151 */     this.tagnames[13] = "E15DSC";
/*      */      this.fields[13]=this.fieldE15DSC=new CharacterField(this.message, 75, 80, "E15DSC");
/*      */ 
/*  154 */     this.fieldnames[14] = "E25DSC";
/*  155 */     this.tagnames[14] = "E25DSC";
/*      */      this.fields[14]=this.fieldE25DSC=new CharacterField(this.message, 155, 80, "E25DSC");
/*      */ 
/*  158 */     this.fieldnames[15] = "E35DSC";
/*  159 */     this.tagnames[15] = "E35DSC";
/*      */      this.fields[15]=this.fieldE35DSC=new CharacterField(this.message, 235, 80, "E35DSC");
/*      */ 
/*  162 */     this.fieldnames[16] = "E45DSC";
/*  163 */     this.tagnames[16] = "E45DSC";
/*      */      this.fields[16]=this.fieldE45DSC=new CharacterField(this.message, 315, 80, "E45DSC");
/*      */ 
/*  166 */     this.fieldnames[17] = "E55DSC";
/*  167 */     this.tagnames[17] = "E55DSC";
/*      */      this.fields[17]=this.fieldE55DSC=new CharacterField(this.message, 395, 80, "E55DSC");
/*      */ 
/*  170 */     this.fieldnames[18] = "E65DSC";
/*  171 */     this.tagnames[18] = "E65DSC";
/*      */      this.fields[18]=this.fieldE65DSC=new CharacterField(this.message, 475, 80, "E65DSC");
/*      */ 
/*  174 */     this.fieldnames[19] = "E75DSC";
/*  175 */     this.tagnames[19] = "E75DSC";
/*      */      this.fields[19]=this.fieldE75DSC=new CharacterField(this.message, 555, 80, "E75DSC");
/*      */ 
/*  178 */     this.fieldnames[20] = "E85DSC";
/*  179 */     this.tagnames[20] = "E85DSC";
/*      */      this.fields[20]=this.fieldE85DSC=new CharacterField(this.message, 635, 80, "E85DSC");
/*      */ 
/*  182 */     this.fieldnames[21] = "E95DSC";
/*  183 */     this.tagnames[21] = "E95DSC";
/*      */      this.fields[21]=this.fieldE95DSC=new CharacterField(this.message, 715, 80, "E95DSC");
/*      */ 
/*  186 */     this.fieldnames[22] = "E05DSC";
/*  187 */     this.tagnames[22] = "E05DSC";
/*      */      this.fields[22]=this.fieldE05DSC=new CharacterField(this.message, 795, 80, "E05DSC");
/*      */ 
/*  190 */     this.fieldnames[23] = "EA5DSC";
/*  191 */     this.tagnames[23] = "EA5DSC";
/*      */      this.fields[23]=this.fieldEA5DSC=new CharacterField(this.message, 875, 80, "EA5DSC");
/*      */ 
/*  194 */     this.fieldnames[24] = "EB5DSC";
/*  195 */     this.tagnames[24] = "EB5DSC";
/*      */      this.fields[24]=this.fieldEB5DSC=new CharacterField(this.message, 955, 80, "EB5DSC");
/*      */ 
/*  198 */     this.fieldnames[25] = "EC5DSC";
/*  199 */     this.tagnames[25] = "EC5DSC";
/*      */      this.fields[25]=this.fieldEC5DSC=new CharacterField(this.message, 1035, 80, "EC5DSC");
/*      */ 
/*  202 */     this.fieldnames[26] = "ED5DSC";
/*  203 */     this.tagnames[26] = "ED5DSC";
/*      */      this.fields[26]=this.fieldED5DSC=new CharacterField(this.message, 1115, 80, "ED5DSC");
/*      */ 
/*  206 */     this.fieldnames[27] = "EE5DSC";
/*  207 */     this.tagnames[27] = "EE5DSC";
/*      */      this.fields[27]=this.fieldEE5DSC=new CharacterField(this.message, 1195, 80, "EE5DSC");
/*      */ 
/*  210 */     this.fieldnames[28] = "EF5DSC";
/*  211 */     this.tagnames[28] = "EF5DSC";
/*      */      this.fields[28]=this.fieldEF5DSC=new CharacterField(this.message, 1275, 80, "EF5DSC");
/*      */ 
/*  214 */     this.fieldnames[29] = "EG5DSC";
/*  215 */     this.tagnames[29] = "EG5DSC";
/*      */      this.fields[29]=this.fieldEG5DSC=new CharacterField(this.message, 1355, 80, "EG5DSC");
/*      */ 
/*  218 */     this.fieldnames[30] = "EH5DSC";
/*  219 */     this.tagnames[30] = "EH5DSC";
/*      */      this.fields[30]=this.fieldEH5DSC=new CharacterField(this.message, 1435, 80, "EH5DSC");
/*      */ 
/*  222 */     this.fieldnames[31] = "EI5DSC";
/*  223 */     this.tagnames[31] = "EI5DSC";
/*      */      this.fields[31]=this.fieldEI5DSC=new CharacterField(this.message, 1515, 80, "EI5DSC");
/*      */ 
/*  226 */     this.fieldnames[32] = "EJ5DSC";
/*  227 */     this.tagnames[32] = "EJ5DSC";
/*      */      this.fields[32]=this.fieldEJ5DSC=new CharacterField(this.message, 1595, 80, "EJ5DSC");
/*      */ 
/*  230 */     this.fieldnames[33] = "E15RCN";
/*  231 */     this.tagnames[33] = "E15RCN";
/*      */      this.fields[33]=this.fieldE15RCN=new DecimalField(this.message, 1675, 10, 0, "E15RCN");
/*      */ 
/*  234 */     this.fieldnames[34] = "E25RCN";
/*  235 */     this.tagnames[34] = "E25RCN";
/*      */      this.fields[34]=this.fieldE25RCN=new DecimalField(this.message, 1685, 10, 0, "E25RCN");
/*      */ 
/*  238 */     this.fieldnames[35] = "E35RCN";
/*  239 */     this.tagnames[35] = "E35RCN";
/*      */      this.fields[35]=this.fieldE35RCN=new DecimalField(this.message, 1695, 10, 0, "E35RCN");
/*      */ 
/*  242 */     this.fieldnames[36] = "E45RCN";
/*  243 */     this.tagnames[36] = "E45RCN";
/*      */      this.fields[36]=this.fieldE45RCN=new DecimalField(this.message, 1705, 10, 0, "E45RCN");
/*      */ 
/*  246 */     this.fieldnames[37] = "E55RCN";
/*  247 */     this.tagnames[37] = "E55RCN";
/*      */      this.fields[37]=this.fieldE55RCN=new DecimalField(this.message, 1715, 10, 0, "E55RCN");
/*      */ 
/*  250 */     this.fieldnames[38] = "E65RCN";
/*  251 */     this.tagnames[38] = "E65RCN";
/*      */      this.fields[38]=this.fieldE65RCN=new DecimalField(this.message, 1725, 10, 0, "E65RCN");
/*      */ 
/*  254 */     this.fieldnames[39] = "E75RCN";
/*  255 */     this.tagnames[39] = "E75RCN";
/*      */      this.fields[39]=this.fieldE75RCN=new DecimalField(this.message, 1735, 10, 0, "E75RCN");
/*      */ 
/*  258 */     this.fieldnames[40] = "E85RCN";
/*  259 */     this.tagnames[40] = "E85RCN";
/*      */      this.fields[40]=this.fieldE85RCN=new DecimalField(this.message, 1745, 10, 0, "E85RCN");
/*      */ 
/*  262 */     this.fieldnames[41] = "E95RCN";
/*  263 */     this.tagnames[41] = "E95RCN";
/*      */      this.fields[41]=this.fieldE95RCN=new DecimalField(this.message, 1755, 10, 0, "E95RCN");
/*      */ 
/*  266 */     this.fieldnames[42] = "E05RCN";
/*  267 */     this.tagnames[42] = "E05RCN";
/*      */      this.fields[42]=this.fieldE05RCN=new DecimalField(this.message, 1765, 10, 0, "E05RCN");
/*      */ 
/*  270 */     this.fieldnames[43] = "EA5RCN";
/*  271 */     this.tagnames[43] = "EA5RCN";
/*      */      this.fields[43]=this.fieldEA5RCN=new DecimalField(this.message, 1775, 10, 0, "EA5RCN");
/*      */ 
/*  274 */     this.fieldnames[44] = "EB5RCN";
/*  275 */     this.tagnames[44] = "EB5RCN";
/*      */      this.fields[44]=this.fieldEB5RCN=new DecimalField(this.message, 1785, 10, 0, "EB5RCN");
/*      */ 
/*  278 */     this.fieldnames[45] = "EC5RCN";
/*  279 */     this.tagnames[45] = "EC5RCN";
/*      */      this.fields[45]=this.fieldEC5RCN=new DecimalField(this.message, 1795, 10, 0, "EC5RCN");
/*      */ 
/*  282 */     this.fieldnames[46] = "ED5RCN";
/*  283 */     this.tagnames[46] = "ED5RCN";
/*      */      this.fields[46]=this.fieldED5RCN=new DecimalField(this.message, 1805, 10, 0, "ED5RCN");
/*      */ 
/*  286 */     this.fieldnames[47] = "EE5RCN";
/*  287 */     this.tagnames[47] = "EE5RCN";
/*      */      this.fields[47]=this.fieldEE5RCN=new DecimalField(this.message, 1815, 10, 0, "EE5RCN");
/*      */ 
/*  290 */     this.fieldnames[48] = "EF5RCN";
/*  291 */     this.tagnames[48] = "EF5RCN";
/*      */      this.fields[48]=this.fieldEF5RCN=new DecimalField(this.message, 1825, 10, 0, "EF5RCN");
/*      */ 
/*  294 */     this.fieldnames[49] = "EG5RCN";
/*  295 */     this.tagnames[49] = "EG5RCN";
/*      */      this.fields[49]=this.fieldEG5RCN=new DecimalField(this.message, 1835, 10, 0, "EG5RCN");
/*      */ 
/*  298 */     this.fieldnames[50] = "EH5RCN";
/*  299 */     this.tagnames[50] = "EH5RCN";
/*      */      this.fields[50]=this.fieldEH5RCN=new DecimalField(this.message, 1845, 10, 0, "EH5RCN");
/*      */ 
/*  302 */     this.fieldnames[51] = "EI5RCN";
/*  303 */     this.tagnames[51] = "EI5RCN";
/*      */      this.fields[51]=this.fieldEI5RCN=new DecimalField(this.message, 1855, 10, 0, "EI5RCN");
/*      */ 
/*  306 */     this.fieldnames[52] = "EJ5RCN";
/*  307 */     this.tagnames[52] = "EJ5RCN";
/*      */      this.fields[52]=this.fieldEJ5RCN=new DecimalField(this.message, 1865, 10, 0, "EJ5RCN");
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE05ACC()
/*      */   {
/*  316 */     return this.fieldE05ACC.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE05LNE()
/*      */   {
/*  323 */     return this.fieldE05LNE.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE05RCN()
/*      */   {
/*  330 */     return this.fieldE05RCN.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE05SEQ()
/*      */   {
/*  337 */     return this.fieldE05SEQ.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE15RCN()
/*      */   {
/*  344 */     return this.fieldE15RCN.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE25RCN()
/*      */   {
/*  351 */     return this.fieldE25RCN.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE35RCN()
/*      */   {
/*  358 */     return this.fieldE35RCN.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE45RCN()
/*      */   {
/*  365 */     return this.fieldE45RCN.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE55RCN()
/*      */   {
/*  372 */     return this.fieldE55RCN.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE65RCN()
/*      */   {
/*  379 */     return this.fieldE65RCN.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE75RCN()
/*      */   {
/*  386 */     return this.fieldE75RCN.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE85RCN()
/*      */   {
/*  393 */     return this.fieldE85RCN.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE95RCN()
/*      */   {
/*  400 */     return this.fieldE95RCN.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalEA5RCN()
/*      */   {
/*  407 */     return this.fieldEA5RCN.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalEB5RCN()
/*      */   {
/*  414 */     return this.fieldEB5RCN.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalEC5RCN()
/*      */   {
/*  421 */     return this.fieldEC5RCN.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalED5RCN()
/*      */   {
/*  428 */     return this.fieldED5RCN.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalEE5RCN()
/*      */   {
/*  435 */     return this.fieldEE5RCN.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalEF5RCN()
/*      */   {
/*  442 */     return this.fieldEF5RCN.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalEG5RCN()
/*      */   {
/*  449 */     return this.fieldEG5RCN.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalEH5RCN()
/*      */   {
/*  456 */     return this.fieldEH5RCN.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalEI5RCN()
/*      */   {
/*  463 */     return this.fieldEI5RCN.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalEJ5RCN()
/*      */   {
/*  470 */     return this.fieldEJ5RCN.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public String getE05ACC()
/*      */   {
/*  477 */     return this.fieldE05ACC.getString();
/*      */   }
/*      */ 
/*      */   public String getE05DSC()
/*      */   {
/*  484 */     return this.fieldE05DSC.getString();
/*      */   }
/*      */ 
/*      */   public String getE05LNE()
/*      */   {
/*  491 */     return this.fieldE05LNE.getString();
/*      */   }
/*      */ 
/*      */   public String getE05RCN()
/*      */   {
/*  498 */     return this.fieldE05RCN.getString();
/*      */   }
/*      */ 
/*      */   public String getE05SEQ()
/*      */   {
/*  505 */     return this.fieldE05SEQ.getString();
/*      */   }
/*      */ 
/*      */   public String getE05TYP()
/*      */   {
/*  512 */     return this.fieldE05TYP.getString();
/*      */   }
/*      */ 
/*      */   public String getE15DSC()
/*      */   {
/*  519 */     return this.fieldE15DSC.getString();
/*      */   }
/*      */ 
/*      */   public String getE15RCN()
/*      */   {
/*  526 */     return this.fieldE15RCN.getString();
/*      */   }
/*      */ 
/*      */   public String getE25DSC()
/*      */   {
/*  533 */     return this.fieldE25DSC.getString();
/*      */   }
/*      */ 
/*      */   public String getE25RCN()
/*      */   {
/*  540 */     return this.fieldE25RCN.getString();
/*      */   }
/*      */ 
/*      */   public String getE35DSC()
/*      */   {
/*  547 */     return this.fieldE35DSC.getString();
/*      */   }
/*      */ 
/*      */   public String getE35RCN()
/*      */   {
/*  554 */     return this.fieldE35RCN.getString();
/*      */   }
/*      */ 
/*      */   public String getE45DSC()
/*      */   {
/*  561 */     return this.fieldE45DSC.getString();
/*      */   }
/*      */ 
/*      */   public String getE45RCN()
/*      */   {
/*  568 */     return this.fieldE45RCN.getString();
/*      */   }
/*      */ 
/*      */   public String getE55DSC()
/*      */   {
/*  575 */     return this.fieldE55DSC.getString();
/*      */   }
/*      */ 
/*      */   public String getE55RCN()
/*      */   {
/*  582 */     return this.fieldE55RCN.getString();
/*      */   }
/*      */ 
/*      */   public String getE65DSC()
/*      */   {
/*  589 */     return this.fieldE65DSC.getString();
/*      */   }
/*      */ 
/*      */   public String getE65RCN()
/*      */   {
/*  596 */     return this.fieldE65RCN.getString();
/*      */   }
/*      */ 
/*      */   public String getE75DSC()
/*      */   {
/*  603 */     return this.fieldE75DSC.getString();
/*      */   }
/*      */ 
/*      */   public String getE75RCN()
/*      */   {
/*  610 */     return this.fieldE75RCN.getString();
/*      */   }
/*      */ 
/*      */   public String getE85DSC()
/*      */   {
/*  617 */     return this.fieldE85DSC.getString();
/*      */   }
/*      */ 
/*      */   public String getE85RCN()
/*      */   {
/*  624 */     return this.fieldE85RCN.getString();
/*      */   }
/*      */ 
/*      */   public String getE95DSC()
/*      */   {
/*  631 */     return this.fieldE95DSC.getString();
/*      */   }
/*      */ 
/*      */   public String getE95RCN()
/*      */   {
/*  638 */     return this.fieldE95RCN.getString();
/*      */   }
/*      */ 
/*      */   public String getEA5DSC()
/*      */   {
/*  645 */     return this.fieldEA5DSC.getString();
/*      */   }
/*      */ 
/*      */   public String getEA5RCN()
/*      */   {
/*  652 */     return this.fieldEA5RCN.getString();
/*      */   }
/*      */ 
/*      */   public String getEB5DSC()
/*      */   {
/*  659 */     return this.fieldEB5DSC.getString();
/*      */   }
/*      */ 
/*      */   public String getEB5RCN()
/*      */   {
/*  666 */     return this.fieldEB5RCN.getString();
/*      */   }
/*      */ 
/*      */   public String getEC5DSC()
/*      */   {
/*  673 */     return this.fieldEC5DSC.getString();
/*      */   }
/*      */ 
/*      */   public String getEC5RCN()
/*      */   {
/*  680 */     return this.fieldEC5RCN.getString();
/*      */   }
/*      */ 
/*      */   public String getED5DSC()
/*      */   {
/*  687 */     return this.fieldED5DSC.getString();
/*      */   }
/*      */ 
/*      */   public String getED5RCN()
/*      */   {
/*  694 */     return this.fieldED5RCN.getString();
/*      */   }
/*      */ 
/*      */   public String getEE5DSC()
/*      */   {
/*  701 */     return this.fieldEE5DSC.getString();
/*      */   }
/*      */ 
/*      */   public String getEE5RCN()
/*      */   {
/*  708 */     return this.fieldEE5RCN.getString();
/*      */   }
/*      */ 
/*      */   public String getEF5DSC()
/*      */   {
/*  715 */     return this.fieldEF5DSC.getString();
/*      */   }
/*      */ 
/*      */   public String getEF5RCN()
/*      */   {
/*  722 */     return this.fieldEF5RCN.getString();
/*      */   }
/*      */ 
/*      */   public String getEG5DSC()
/*      */   {
/*  729 */     return this.fieldEG5DSC.getString();
/*      */   }
/*      */ 
/*      */   public String getEG5RCN()
/*      */   {
/*  736 */     return this.fieldEG5RCN.getString();
/*      */   }
/*      */ 
/*      */   public String getEH5DSC()
/*      */   {
/*  743 */     return this.fieldEH5DSC.getString();
/*      */   }
/*      */ 
/*      */   public String getEH5RCN()
/*      */   {
/*  750 */     return this.fieldEH5RCN.getString();
/*      */   }
/*      */ 
/*      */   public String getEI5DSC()
/*      */   {
/*  757 */     return this.fieldEI5DSC.getString();
/*      */   }
/*      */ 
/*      */   public String getEI5RCN()
/*      */   {
/*  764 */     return this.fieldEI5RCN.getString();
/*      */   }
/*      */ 
/*      */   public String getEJ5DSC()
/*      */   {
/*  771 */     return this.fieldEJ5DSC.getString();
/*      */   }
/*      */ 
/*      */   public String getEJ5RCN()
/*      */   {
/*  778 */     return this.fieldEJ5RCN.getString();
/*      */   }
/*      */ 
/*      */   public String getH05MAS()
/*      */   {
/*  785 */     return this.fieldH05MAS.getString();
/*      */   }
/*      */ 
/*      */   public String getH05OPE()
/*      */   {
/*  792 */     return this.fieldH05OPE.getString();
/*      */   }
/*      */ 
/*      */   public String getH05PGM()
/*      */   {
/*  799 */     return this.fieldH05PGM.getString();
/*      */   }
/*      */ 
/*      */   public String getH05SCR()
/*      */   {
/*  806 */     return this.fieldH05SCR.getString();
/*      */   }
/*      */ 
/*      */   public String getH05TIM()
/*      */   {
/*  813 */     return this.fieldH05TIM.getString();
/*      */   }
/*      */ 
/*      */   public String getH05USR()
/*      */   {
/*  820 */     return this.fieldH05USR.getString();
/*      */   }
/*      */ 
/*      */   public String getH05WK1()
/*      */   {
/*  827 */     return this.fieldH05WK1.getString();
/*      */   }
/*      */ 
/*      */   public String getH05WK2()
/*      */   {
/*  834 */     return this.fieldH05WK2.getString();
/*      */   }
/*      */ 
/*      */   public String getH05WK3()
/*      */   {
/*  841 */     return this.fieldH05WK3.getString();
/*      */   }
/*      */ 
/*      */   public void setE05ACC(String newvalue)
/*      */   {
/*  848 */     this.fieldE05ACC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE05ACC(BigDecimal newvalue)
/*      */   {
/*  855 */     this.fieldE05ACC.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE05DSC(String newvalue)
/*      */   {
/*  862 */     this.fieldE05DSC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE05LNE(String newvalue)
/*      */   {
/*  869 */     this.fieldE05LNE.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE05LNE(BigDecimal newvalue)
/*      */   {
/*  876 */     this.fieldE05LNE.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE05RCN(String newvalue)
/*      */   {
/*  883 */     this.fieldE05RCN.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE05RCN(BigDecimal newvalue)
/*      */   {
/*  890 */     this.fieldE05RCN.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE05SEQ(String newvalue)
/*      */   {
/*  897 */     this.fieldE05SEQ.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE05SEQ(BigDecimal newvalue)
/*      */   {
/*  904 */     this.fieldE05SEQ.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE05TYP(String newvalue)
/*      */   {
/*  911 */     this.fieldE05TYP.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE15DSC(String newvalue)
/*      */   {
/*  918 */     this.fieldE15DSC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE15RCN(String newvalue)
/*      */   {
/*  925 */     this.fieldE15RCN.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE15RCN(BigDecimal newvalue)
/*      */   {
/*  932 */     this.fieldE15RCN.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE25DSC(String newvalue)
/*      */   {
/*  939 */     this.fieldE25DSC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE25RCN(String newvalue)
/*      */   {
/*  946 */     this.fieldE25RCN.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE25RCN(BigDecimal newvalue)
/*      */   {
/*  953 */     this.fieldE25RCN.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE35DSC(String newvalue)
/*      */   {
/*  960 */     this.fieldE35DSC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE35RCN(String newvalue)
/*      */   {
/*  967 */     this.fieldE35RCN.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE35RCN(BigDecimal newvalue)
/*      */   {
/*  974 */     this.fieldE35RCN.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE45DSC(String newvalue)
/*      */   {
/*  981 */     this.fieldE45DSC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE45RCN(String newvalue)
/*      */   {
/*  988 */     this.fieldE45RCN.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE45RCN(BigDecimal newvalue)
/*      */   {
/*  995 */     this.fieldE45RCN.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE55DSC(String newvalue)
/*      */   {
/* 1002 */     this.fieldE55DSC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE55RCN(String newvalue)
/*      */   {
/* 1009 */     this.fieldE55RCN.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE55RCN(BigDecimal newvalue)
/*      */   {
/* 1016 */     this.fieldE55RCN.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE65DSC(String newvalue)
/*      */   {
/* 1023 */     this.fieldE65DSC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE65RCN(String newvalue)
/*      */   {
/* 1030 */     this.fieldE65RCN.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE65RCN(BigDecimal newvalue)
/*      */   {
/* 1037 */     this.fieldE65RCN.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE75DSC(String newvalue)
/*      */   {
/* 1044 */     this.fieldE75DSC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE75RCN(String newvalue)
/*      */   {
/* 1051 */     this.fieldE75RCN.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE75RCN(BigDecimal newvalue)
/*      */   {
/* 1058 */     this.fieldE75RCN.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE85DSC(String newvalue)
/*      */   {
/* 1065 */     this.fieldE85DSC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE85RCN(String newvalue)
/*      */   {
/* 1072 */     this.fieldE85RCN.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE85RCN(BigDecimal newvalue)
/*      */   {
/* 1079 */     this.fieldE85RCN.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE95DSC(String newvalue)
/*      */   {
/* 1086 */     this.fieldE95DSC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE95RCN(String newvalue)
/*      */   {
/* 1093 */     this.fieldE95RCN.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE95RCN(BigDecimal newvalue)
/*      */   {
/* 1100 */     this.fieldE95RCN.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setEA5DSC(String newvalue)
/*      */   {
/* 1107 */     this.fieldEA5DSC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setEA5RCN(String newvalue)
/*      */   {
/* 1114 */     this.fieldEA5RCN.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setEA5RCN(BigDecimal newvalue)
/*      */   {
/* 1121 */     this.fieldEA5RCN.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setEB5DSC(String newvalue)
/*      */   {
/* 1128 */     this.fieldEB5DSC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setEB5RCN(String newvalue)
/*      */   {
/* 1135 */     this.fieldEB5RCN.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setEB5RCN(BigDecimal newvalue)
/*      */   {
/* 1142 */     this.fieldEB5RCN.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setEC5DSC(String newvalue)
/*      */   {
/* 1149 */     this.fieldEC5DSC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setEC5RCN(String newvalue)
/*      */   {
/* 1156 */     this.fieldEC5RCN.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setEC5RCN(BigDecimal newvalue)
/*      */   {
/* 1163 */     this.fieldEC5RCN.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setED5DSC(String newvalue)
/*      */   {
/* 1170 */     this.fieldED5DSC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setED5RCN(String newvalue)
/*      */   {
/* 1177 */     this.fieldED5RCN.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setED5RCN(BigDecimal newvalue)
/*      */   {
/* 1184 */     this.fieldED5RCN.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setEE5DSC(String newvalue)
/*      */   {
/* 1191 */     this.fieldEE5DSC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setEE5RCN(String newvalue)
/*      */   {
/* 1198 */     this.fieldEE5RCN.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setEE5RCN(BigDecimal newvalue)
/*      */   {
/* 1205 */     this.fieldEE5RCN.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setEF5DSC(String newvalue)
/*      */   {
/* 1212 */     this.fieldEF5DSC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setEF5RCN(String newvalue)
/*      */   {
/* 1219 */     this.fieldEF5RCN.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setEF5RCN(BigDecimal newvalue)
/*      */   {
/* 1226 */     this.fieldEF5RCN.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setEG5DSC(String newvalue)
/*      */   {
/* 1233 */     this.fieldEG5DSC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setEG5RCN(String newvalue)
/*      */   {
/* 1240 */     this.fieldEG5RCN.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setEG5RCN(BigDecimal newvalue)
/*      */   {
/* 1247 */     this.fieldEG5RCN.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setEH5DSC(String newvalue)
/*      */   {
/* 1254 */     this.fieldEH5DSC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setEH5RCN(String newvalue)
/*      */   {
/* 1261 */     this.fieldEH5RCN.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setEH5RCN(BigDecimal newvalue)
/*      */   {
/* 1268 */     this.fieldEH5RCN.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setEI5DSC(String newvalue)
/*      */   {
/* 1275 */     this.fieldEI5DSC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setEI5RCN(String newvalue)
/*      */   {
/* 1282 */     this.fieldEI5RCN.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setEI5RCN(BigDecimal newvalue)
/*      */   {
/* 1289 */     this.fieldEI5RCN.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setEJ5DSC(String newvalue)
/*      */   {
/* 1296 */     this.fieldEJ5DSC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setEJ5RCN(String newvalue)
/*      */   {
/* 1303 */     this.fieldEJ5RCN.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setEJ5RCN(BigDecimal newvalue)
/*      */   {
/* 1310 */     this.fieldEJ5RCN.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setH05MAS(String newvalue)
/*      */   {
/* 1317 */     this.fieldH05MAS.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setH05OPE(String newvalue)
/*      */   {
/* 1324 */     this.fieldH05OPE.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setH05PGM(String newvalue)
/*      */   {
/* 1331 */     this.fieldH05PGM.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setH05SCR(String newvalue)
/*      */   {
/* 1338 */     this.fieldH05SCR.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setH05TIM(String newvalue)
/*      */   {
/* 1345 */     this.fieldH05TIM.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setH05USR(String newvalue)
/*      */   {
/* 1352 */     this.fieldH05USR.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setH05WK1(String newvalue)
/*      */   {
/* 1359 */     this.fieldH05WK1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setH05WK2(String newvalue)
/*      */   {
/* 1366 */     this.fieldH05WK2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setH05WK3(String newvalue)
/*      */   {
/* 1373 */     this.fieldH05WK3.setString(newvalue);
/*      */   }
/*      */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.ESD000005Message
 * JD-Core Version:    0.6.0
 */