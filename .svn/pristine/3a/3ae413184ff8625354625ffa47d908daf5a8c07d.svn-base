/*      */ package com.activo.gateway.dibs.messages;
/*      */ 
/*      */ import java.math.BigDecimal;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*      */ 
/*      */ public class LCRDSJVMessage extends MessageRecord
/*      */ {
/*   21 */   final int FIELDCOUNT = 37;
/*   22 */   private CharacterField fieldLCRUSER = null;
/*   23 */   private CharacterField fieldLCRFLG = null;
/*   24 */   private DecimalField fieldLCRLCMACC = null;
/*   25 */   private CharacterField fieldLCRLCMCCY = null;
/*   26 */   private CharacterField fieldLCRLCMTYP = null;
/*   27 */   private DecimalField fieldLCRLCMOAM = null;
/*   28 */   private DecimalField fieldLCRLCMAMN = null;
/*   29 */   private DecimalField fieldLCRISSDT1 = null;
/*   30 */   private DecimalField fieldLCRISSDT2 = null;
/*   31 */   private DecimalField fieldLCRISSDT3 = null;
/*   32 */   private DecimalField fieldLCREXPDT1 = null;
/*   33 */   private DecimalField fieldLCREXPDT2 = null;
/*   34 */   private DecimalField fieldLCREXPDT3 = null;
/*   35 */   private CharacterField fieldLCRLCMTNR = null;
/*   36 */   private CharacterField fieldLCRLCMORF = null;
/*   37 */   private CharacterField fieldLCRLCMTRF = null;
/*   38 */   private CharacterField fieldLCRLCMAP1 = null;
/*   39 */   private CharacterField fieldLCRLCMAP2 = null;
/*   40 */   private CharacterField fieldLCRLCMAP3 = null;
/*   41 */   private CharacterField fieldLCRLCMBN1 = null;
/*   42 */   private CharacterField fieldLCRLCMBN2 = null;
/*   43 */   private CharacterField fieldLCRLCMBN3 = null;
/*   44 */   private CharacterField fieldLCRLCMCB1 = null;
/*   45 */   private CharacterField fieldLCRLCMCB2 = null;
/*   46 */   private CharacterField fieldLCRLCMCB3 = null;
/*   47 */   private CharacterField fieldLCRLCMIB1 = null;
/*   48 */   private CharacterField fieldLCRLCMIB2 = null;
/*   49 */   private CharacterField fieldLCRLCMIB3 = null;
/*   50 */   private CharacterField fieldLCRLCMAB1 = null;
/*   51 */   private CharacterField fieldLCRLCMAB2 = null;
/*   52 */   private CharacterField fieldLCRLCMAB3 = null;
/*   53 */   private DecimalField fieldLCRLCMLAN = null;
/*   54 */   private CharacterField fieldLCRLCMSHF = null;
/*   55 */   private CharacterField fieldLCRLCMSHT = null;
/*   56 */   private DecimalField fieldLCRSHPDT1 = null;
/*   57 */   private DecimalField fieldLCRSHPDT2 = null;
/*   58 */   private DecimalField fieldLCRSHPDT3 = null;
/*      */ 
/*      */   public LCRDSJVMessage()
/*      */   {
/*   65 */     createFields();
/*   66 */     initialize();
/*      */   }
/*      */ 
/*      */   protected void createFields()
/*      */   {
/*   75 */     this.recordsize = 768;
/*   76 */     this.fileid = "1040714105617";
/*   77 */     this.recordid = "420A415286C3C";
/*   78 */     this.message = new byte[getByteLength()];
/*   79 */     this.formatname = "LCRDSJV";
/*   80 */     this.fieldnames = new String[37];
/*   81 */     this.tagnames = new String[37];
/*   82 */     this.fields = new MessageField[37];
/*      */ 
/*   84 */     this.fieldnames[0] = "LCRUSER";
/*   85 */     this.tagnames[0] = "LCRUSER";
/*      */      this.fields[0]=this.fieldLCRUSER=new CharacterField(this.message, 10, 10, "LCRUSER");
/*      */ 
/*   88 */     this.fieldnames[1] = "LCRFLG";
/*   89 */     this.tagnames[1] = "LCRFLG";
/*      */      this.fields[1]=this.fieldLCRFLG=new CharacterField(this.message, 20, 1, "LCRFLG");
/*      */ 
/*   92 */     this.fieldnames[2] = "LCRLCMACC";
/*   93 */     this.tagnames[2] = "LCRLCMACC";
/*      */      this.fields[2]=this.fieldLCRLCMACC=new DecimalField(this.message, 21, 13, 0, "LCRLCMACC");
/*      */ 
/*   96 */     this.fieldnames[3] = "LCRLCMCCY";
/*   97 */     this.tagnames[3] = "LCRLCMCCY";
/*      */      this.fields[3]=this.fieldLCRLCMCCY=new CharacterField(this.message, 34, 3, "LCRLCMCCY");
/*      */ 
/*  100 */     this.fieldnames[4] = "LCRLCMTYP";
/*  101 */     this.tagnames[4] = "LCRLCMTYP";
/*      */      this.fields[4]=this.fieldLCRLCMTYP=new CharacterField(this.message, 37, 1, "LCRLCMTYP");
/*      */ 
/*  104 */     this.fieldnames[5] = "LCRLCMOAM";
/*  105 */     this.tagnames[5] = "LCRLCMOAM";
/*      */      this.fields[5]=this.fieldLCRLCMOAM=new DecimalField(this.message, 38, 15, 2, "LCRLCMOAM");
/*      */ 
/*  108 */     this.fieldnames[6] = "LCRLCMAMN";
/*  109 */     this.tagnames[6] = "LCRLCMAMN";
/*      */      this.fields[6]=this.fieldLCRLCMAMN=new DecimalField(this.message, 53, 15, 2, "LCRLCMAMN");
/*      */ 
/*  112 */     this.fieldnames[7] = "LCRISSDT1";
/*  113 */     this.tagnames[7] = "LCRISSDT1";
/*      */      this.fields[7]=this.fieldLCRISSDT1=new DecimalField(this.message, 68, 3, 0, "LCRISSDT1");
/*      */ 
/*  116 */     this.fieldnames[8] = "LCRISSDT2";
/*  117 */     this.tagnames[8] = "LCRISSDT2";
/*      */      this.fields[8]=this.fieldLCRISSDT2=new DecimalField(this.message, 71, 3, 0, "LCRISSDT2");
/*      */ 
/*  120 */     this.fieldnames[9] = "LCRISSDT3";
/*  121 */     this.tagnames[9] = "LCRISSDT3";
/*      */      this.fields[9]=this.fieldLCRISSDT3=new DecimalField(this.message, 74, 3, 0, "LCRISSDT3");
/*      */ 
/*  124 */     this.fieldnames[10] = "LCREXPDT1";
/*  125 */     this.tagnames[10] = "LCREXPDT1";
/*      */      this.fields[10]=this.fieldLCREXPDT1=new DecimalField(this.message, 77, 3, 0, "LCREXPDT1");
/*      */ 
/*  128 */     this.fieldnames[11] = "LCREXPDT2";
/*  129 */     this.tagnames[11] = "LCREXPDT2";
/*      */      this.fields[11]=this.fieldLCREXPDT2=new DecimalField(this.message, 80, 3, 0, "LCREXPDT2");
/*      */ 
/*  132 */     this.fieldnames[12] = "LCREXPDT3";
/*  133 */     this.tagnames[12] = "LCREXPDT3";
/*      */      this.fields[12]=this.fieldLCREXPDT3=new DecimalField(this.message, 83, 3, 0, "LCREXPDT3");
/*      */ 
/*  136 */     this.fieldnames[13] = "LCRLCMTNR";
/*  137 */     this.tagnames[13] = "LCRLCMTNR";
/*      */      this.fields[13]=this.fieldLCRLCMTNR=new CharacterField(this.message, 86, 1, "LCRLCMTNR");
/*      */ 
/*  140 */     this.fieldnames[14] = "LCRLCMORF";
/*  141 */     this.tagnames[14] = "LCRLCMORF";
/*      */      this.fields[14]=this.fieldLCRLCMORF=new CharacterField(this.message, 87, 12, "LCRLCMORF");
/*      */ 
/*  144 */     this.fieldnames[15] = "LCRLCMTRF";
/*  145 */     this.tagnames[15] = "LCRLCMTRF";
/*      */      this.fields[15]=this.fieldLCRLCMTRF=new CharacterField(this.message, 99, 12, "LCRLCMTRF");
/*      */ 
/*  148 */     this.fieldnames[16] = "LCRLCMAP1";
/*  149 */     this.tagnames[16] = "LCRLCMAP1";
/*      */      this.fields[16]=this.fieldLCRLCMAP1=new CharacterField(this.message, 111, 35, "LCRLCMAP1");
/*      */ 
/*  152 */     this.fieldnames[17] = "LCRLCMAP2";
/*  153 */     this.tagnames[17] = "LCRLCMAP2";
/*      */      this.fields[17]=this.fieldLCRLCMAP2=new CharacterField(this.message, 146, 35, "LCRLCMAP2");
/*      */ 
/*  156 */     this.fieldnames[18] = "LCRLCMAP3";
/*  157 */     this.tagnames[18] = "LCRLCMAP3";
/*      */      this.fields[18]=this.fieldLCRLCMAP3=new CharacterField(this.message, 181, 35, "LCRLCMAP3");
/*      */ 
/*  160 */     this.fieldnames[19] = "LCRLCMBN1";
/*  161 */     this.tagnames[19] = "LCRLCMBN1";
/*      */      this.fields[19]=this.fieldLCRLCMBN1=new CharacterField(this.message, 216, 35, "LCRLCMBN1");
/*      */ 
/*  164 */     this.fieldnames[20] = "LCRLCMBN2";
/*  165 */     this.tagnames[20] = "LCRLCMBN2";
/*      */      this.fields[20]=this.fieldLCRLCMBN2=new CharacterField(this.message, 251, 35, "LCRLCMBN2");
/*      */ 
/*  168 */     this.fieldnames[21] = "LCRLCMBN3";
/*  169 */     this.tagnames[21] = "LCRLCMBN3";
/*      */      this.fields[21]=this.fieldLCRLCMBN3=new CharacterField(this.message, 286, 35, "LCRLCMBN3");
/*      */ 
/*  172 */     this.fieldnames[22] = "LCRLCMCB1";
/*  173 */     this.tagnames[22] = "LCRLCMCB1";
/*      */      this.fields[22]=this.fieldLCRLCMCB1=new CharacterField(this.message, 321, 35, "LCRLCMCB1");
/*      */ 
/*  176 */     this.fieldnames[23] = "LCRLCMCB2";
/*  177 */     this.tagnames[23] = "LCRLCMCB2";
/*      */      this.fields[23]=this.fieldLCRLCMCB2=new CharacterField(this.message, 356, 35, "LCRLCMCB2");
/*      */ 
/*  180 */     this.fieldnames[24] = "LCRLCMCB3";
/*  181 */     this.tagnames[24] = "LCRLCMCB3";
/*      */      this.fields[24]=this.fieldLCRLCMCB3=new CharacterField(this.message, 391, 35, "LCRLCMCB3");
/*      */ 
/*  184 */     this.fieldnames[25] = "LCRLCMIB1";
/*  185 */     this.tagnames[25] = "LCRLCMIB1";
/*      */      this.fields[25]=this.fieldLCRLCMIB1=new CharacterField(this.message, 426, 35, "LCRLCMIB1");
/*      */ 
/*  188 */     this.fieldnames[26] = "LCRLCMIB2";
/*  189 */     this.tagnames[26] = "LCRLCMIB2";
/*      */      this.fields[26]=this.fieldLCRLCMIB2=new CharacterField(this.message, 461, 35, "LCRLCMIB2");
/*      */ 
/*  192 */     this.fieldnames[27] = "LCRLCMIB3";
/*  193 */     this.tagnames[27] = "LCRLCMIB3";
/*      */      this.fields[27]=this.fieldLCRLCMIB3=new CharacterField(this.message, 496, 35, "LCRLCMIB3");
/*      */ 
/*  196 */     this.fieldnames[28] = "LCRLCMAB1";
/*  197 */     this.tagnames[28] = "LCRLCMAB1";
/*      */      this.fields[28]=this.fieldLCRLCMAB1=new CharacterField(this.message, 531, 35, "LCRLCMAB1");
/*      */ 
/*  200 */     this.fieldnames[29] = "LCRLCMAB2";
/*  201 */     this.tagnames[29] = "LCRLCMAB2";
/*      */      this.fields[29]=this.fieldLCRLCMAB2=new CharacterField(this.message, 566, 35, "LCRLCMAB2");
/*      */ 
/*  204 */     this.fieldnames[30] = "LCRLCMAB3";
/*  205 */     this.tagnames[30] = "LCRLCMAB3";
/*      */      this.fields[30]=this.fieldLCRLCMAB3=new CharacterField(this.message, 601, 35, "LCRLCMAB3");
/*      */ 
/*  208 */     this.fieldnames[31] = "LCRLCMLAN";
/*  209 */     this.tagnames[31] = "LCRLCMLAN";
/*      */      this.fields[31]=this.fieldLCRLCMLAN=new DecimalField(this.message, 636, 3, 0, "LCRLCMLAN");
/*      */ 
/*  212 */     this.fieldnames[32] = "LCRLCMSHF";
/*  213 */     this.tagnames[32] = "LCRLCMSHF";
/*      */      this.fields[32]=this.fieldLCRLCMSHF=new CharacterField(this.message, 639, 65, "LCRLCMSHF");
/*      */ 
/*  216 */     this.fieldnames[33] = "LCRLCMSHT";
/*  217 */     this.tagnames[33] = "LCRLCMSHT";
/*      */      this.fields[33]=this.fieldLCRLCMSHT=new CharacterField(this.message, 704, 65, "LCRLCMSHT");
/*      */ 
/*  220 */     this.fieldnames[34] = "LCRSHPDT1";
/*  221 */     this.tagnames[34] = "LCRSHPDT1";
/*      */      this.fields[34]=this.fieldLCRSHPDT1=new DecimalField(this.message, 769, 3, 0, "LCRSHPDT1");
/*      */ 
/*  224 */     this.fieldnames[35] = "LCRSHPDT2";
/*  225 */     this.tagnames[35] = "LCRSHPDT2";
/*      */      this.fields[35]=this.fieldLCRSHPDT2=new DecimalField(this.message, 772, 3, 0, "LCRSHPDT2");
/*      */ 
/*  228 */     this.fieldnames[36] = "LCRSHPDT3";
/*  229 */     this.tagnames[36] = "LCRSHPDT3";
/*      */      this.fields[36]=this.fieldLCRSHPDT3=new DecimalField(this.message, 775, 3, 0, "LCRSHPDT3");
/*      */   }
/*      */ 
/*      */   public void setLCRUSER(String newvalue)
/*      */   {
/*  239 */     this.fieldLCRUSER.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRUSER()
/*      */   {
/*  247 */     return this.fieldLCRUSER.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRFLG(String newvalue)
/*      */   {
/*  255 */     this.fieldLCRFLG.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRFLG()
/*      */   {
/*  263 */     return this.fieldLCRFLG.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRLCMACC(String newvalue)
/*      */   {
/*  271 */     this.fieldLCRLCMACC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRLCMACC()
/*      */   {
/*  279 */     return this.fieldLCRLCMACC.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRLCMACC(BigDecimal newvalue)
/*      */   {
/*  287 */     this.fieldLCRLCMACC.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalLCRLCMACC()
/*      */   {
/*  295 */     return this.fieldLCRLCMACC.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setLCRLCMCCY(String newvalue)
/*      */   {
/*  303 */     this.fieldLCRLCMCCY.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRLCMCCY()
/*      */   {
/*  311 */     return this.fieldLCRLCMCCY.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRLCMTYP(String newvalue)
/*      */   {
/*  319 */     this.fieldLCRLCMTYP.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRLCMTYP()
/*      */   {
/*  327 */     return this.fieldLCRLCMTYP.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRLCMOAM(String newvalue)
/*      */   {
/*  335 */     this.fieldLCRLCMOAM.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRLCMOAM()
/*      */   {
/*  343 */     return this.fieldLCRLCMOAM.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRLCMOAM(BigDecimal newvalue)
/*      */   {
/*  351 */     this.fieldLCRLCMOAM.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalLCRLCMOAM()
/*      */   {
/*  359 */     return this.fieldLCRLCMOAM.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setLCRLCMAMN(String newvalue)
/*      */   {
/*  367 */     this.fieldLCRLCMAMN.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRLCMAMN()
/*      */   {
/*  375 */     return this.fieldLCRLCMAMN.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRLCMAMN(BigDecimal newvalue)
/*      */   {
/*  383 */     this.fieldLCRLCMAMN.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalLCRLCMAMN()
/*      */   {
/*  391 */     return this.fieldLCRLCMAMN.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setLCRISSDT1(String newvalue)
/*      */   {
/*  399 */     this.fieldLCRISSDT1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRISSDT1()
/*      */   {
/*  407 */     return this.fieldLCRISSDT1.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRISSDT1(BigDecimal newvalue)
/*      */   {
/*  415 */     this.fieldLCRISSDT1.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalLCRISSDT1()
/*      */   {
/*  423 */     return this.fieldLCRISSDT1.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setLCRISSDT2(String newvalue)
/*      */   {
/*  431 */     this.fieldLCRISSDT2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRISSDT2()
/*      */   {
/*  439 */     return this.fieldLCRISSDT2.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRISSDT2(BigDecimal newvalue)
/*      */   {
/*  447 */     this.fieldLCRISSDT2.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalLCRISSDT2()
/*      */   {
/*  455 */     return this.fieldLCRISSDT2.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setLCRISSDT3(String newvalue)
/*      */   {
/*  463 */     this.fieldLCRISSDT3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRISSDT3()
/*      */   {
/*  471 */     return this.fieldLCRISSDT3.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRISSDT3(BigDecimal newvalue)
/*      */   {
/*  479 */     this.fieldLCRISSDT3.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalLCRISSDT3()
/*      */   {
/*  487 */     return this.fieldLCRISSDT3.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setLCREXPDT1(String newvalue)
/*      */   {
/*  495 */     this.fieldLCREXPDT1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCREXPDT1()
/*      */   {
/*  503 */     return this.fieldLCREXPDT1.getString();
/*      */   }
/*      */ 
/*      */   public void setLCREXPDT1(BigDecimal newvalue)
/*      */   {
/*  511 */     this.fieldLCREXPDT1.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalLCREXPDT1()
/*      */   {
/*  519 */     return this.fieldLCREXPDT1.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setLCREXPDT2(String newvalue)
/*      */   {
/*  527 */     this.fieldLCREXPDT2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCREXPDT2()
/*      */   {
/*  535 */     return this.fieldLCREXPDT2.getString();
/*      */   }
/*      */ 
/*      */   public void setLCREXPDT2(BigDecimal newvalue)
/*      */   {
/*  543 */     this.fieldLCREXPDT2.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalLCREXPDT2()
/*      */   {
/*  551 */     return this.fieldLCREXPDT2.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setLCREXPDT3(String newvalue)
/*      */   {
/*  559 */     this.fieldLCREXPDT3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCREXPDT3()
/*      */   {
/*  567 */     return this.fieldLCREXPDT3.getString();
/*      */   }
/*      */ 
/*      */   public void setLCREXPDT3(BigDecimal newvalue)
/*      */   {
/*  575 */     this.fieldLCREXPDT3.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalLCREXPDT3()
/*      */   {
/*  583 */     return this.fieldLCREXPDT3.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setLCRLCMTNR(String newvalue)
/*      */   {
/*  591 */     this.fieldLCRLCMTNR.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRLCMTNR()
/*      */   {
/*  599 */     return this.fieldLCRLCMTNR.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRLCMORF(String newvalue)
/*      */   {
/*  607 */     this.fieldLCRLCMORF.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRLCMORF()
/*      */   {
/*  615 */     return this.fieldLCRLCMORF.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRLCMTRF(String newvalue)
/*      */   {
/*  623 */     this.fieldLCRLCMTRF.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRLCMTRF()
/*      */   {
/*  631 */     return this.fieldLCRLCMTRF.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRLCMAP1(String newvalue)
/*      */   {
/*  639 */     this.fieldLCRLCMAP1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRLCMAP1()
/*      */   {
/*  647 */     return this.fieldLCRLCMAP1.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRLCMAP2(String newvalue)
/*      */   {
/*  655 */     this.fieldLCRLCMAP2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRLCMAP2()
/*      */   {
/*  663 */     return this.fieldLCRLCMAP2.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRLCMAP3(String newvalue)
/*      */   {
/*  671 */     this.fieldLCRLCMAP3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRLCMAP3()
/*      */   {
/*  679 */     return this.fieldLCRLCMAP3.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRLCMBN1(String newvalue)
/*      */   {
/*  687 */     this.fieldLCRLCMBN1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRLCMBN1()
/*      */   {
/*  695 */     return this.fieldLCRLCMBN1.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRLCMBN2(String newvalue)
/*      */   {
/*  703 */     this.fieldLCRLCMBN2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRLCMBN2()
/*      */   {
/*  711 */     return this.fieldLCRLCMBN2.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRLCMBN3(String newvalue)
/*      */   {
/*  719 */     this.fieldLCRLCMBN3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRLCMBN3()
/*      */   {
/*  727 */     return this.fieldLCRLCMBN3.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRLCMCB1(String newvalue)
/*      */   {
/*  735 */     this.fieldLCRLCMCB1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRLCMCB1()
/*      */   {
/*  743 */     return this.fieldLCRLCMCB1.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRLCMCB2(String newvalue)
/*      */   {
/*  751 */     this.fieldLCRLCMCB2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRLCMCB2()
/*      */   {
/*  759 */     return this.fieldLCRLCMCB2.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRLCMCB3(String newvalue)
/*      */   {
/*  767 */     this.fieldLCRLCMCB3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRLCMCB3()
/*      */   {
/*  775 */     return this.fieldLCRLCMCB3.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRLCMIB1(String newvalue)
/*      */   {
/*  783 */     this.fieldLCRLCMIB1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRLCMIB1()
/*      */   {
/*  791 */     return this.fieldLCRLCMIB1.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRLCMIB2(String newvalue)
/*      */   {
/*  799 */     this.fieldLCRLCMIB2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRLCMIB2()
/*      */   {
/*  807 */     return this.fieldLCRLCMIB2.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRLCMIB3(String newvalue)
/*      */   {
/*  815 */     this.fieldLCRLCMIB3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRLCMIB3()
/*      */   {
/*  823 */     return this.fieldLCRLCMIB3.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRLCMAB1(String newvalue)
/*      */   {
/*  831 */     this.fieldLCRLCMAB1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRLCMAB1()
/*      */   {
/*  839 */     return this.fieldLCRLCMAB1.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRLCMAB2(String newvalue)
/*      */   {
/*  847 */     this.fieldLCRLCMAB2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRLCMAB2()
/*      */   {
/*  855 */     return this.fieldLCRLCMAB2.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRLCMAB3(String newvalue)
/*      */   {
/*  863 */     this.fieldLCRLCMAB3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRLCMAB3()
/*      */   {
/*  871 */     return this.fieldLCRLCMAB3.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRLCMLAN(String newvalue)
/*      */   {
/*  879 */     this.fieldLCRLCMLAN.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRLCMLAN()
/*      */   {
/*  887 */     return this.fieldLCRLCMLAN.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRLCMLAN(BigDecimal newvalue)
/*      */   {
/*  895 */     this.fieldLCRLCMLAN.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalLCRLCMLAN()
/*      */   {
/*  903 */     return this.fieldLCRLCMLAN.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setLCRLCMSHF(String newvalue)
/*      */   {
/*  911 */     this.fieldLCRLCMSHF.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRLCMSHF()
/*      */   {
/*  919 */     return this.fieldLCRLCMSHF.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRLCMSHT(String newvalue)
/*      */   {
/*  927 */     this.fieldLCRLCMSHT.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRLCMSHT()
/*      */   {
/*  935 */     return this.fieldLCRLCMSHT.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRSHPDT1(String newvalue)
/*      */   {
/*  943 */     this.fieldLCRSHPDT1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRSHPDT1()
/*      */   {
/*  951 */     return this.fieldLCRSHPDT1.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRSHPDT1(BigDecimal newvalue)
/*      */   {
/*  959 */     this.fieldLCRSHPDT1.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalLCRSHPDT1()
/*      */   {
/*  967 */     return this.fieldLCRSHPDT1.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setLCRSHPDT2(String newvalue)
/*      */   {
/*  975 */     this.fieldLCRSHPDT2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRSHPDT2()
/*      */   {
/*  983 */     return this.fieldLCRSHPDT2.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRSHPDT2(BigDecimal newvalue)
/*      */   {
/*  991 */     this.fieldLCRSHPDT2.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalLCRSHPDT2()
/*      */   {
/*  999 */     return this.fieldLCRSHPDT2.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setLCRSHPDT3(String newvalue)
/*      */   {
/* 1007 */     this.fieldLCRSHPDT3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLCRSHPDT3()
/*      */   {
/* 1015 */     return this.fieldLCRSHPDT3.getString();
/*      */   }
/*      */ 
/*      */   public void setLCRSHPDT3(BigDecimal newvalue)
/*      */   {
/* 1023 */     this.fieldLCRSHPDT3.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalLCRSHPDT3()
/*      */   {
/* 1031 */     return this.fieldLCRSHPDT3.getBigDecimal();
/*      */   }
/*      */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.LCRDSJVMessage
 * JD-Core Version:    0.6.0
 */