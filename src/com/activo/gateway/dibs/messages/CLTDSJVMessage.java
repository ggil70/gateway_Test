/*     */ package com.activo.gateway.dibs.messages;
/*     */ 
/*     */ import java.math.BigDecimal;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*     */ 
/*     */ public class CLTDSJVMessage extends MessageRecord
/*     */ {
/*  19 */   final int FIELDCOUNT = 39;
/*  20 */   private CharacterField fieldCLTUSER = null;
/*  21 */   private CharacterField fieldCLTFLG = null;
/*  22 */   private DecimalField fieldCLTDCMACC = null;
/*  23 */   private CharacterField fieldCLTDCMCCY = null;
/*  24 */   private CharacterField fieldCLTDCMTYP = null;
/*  25 */   private CharacterField fieldCLTDCMSTY = null;
/*  26 */   private CharacterField fieldCLTDCMSTS = null;
/*  27 */   private CharacterField fieldCLTDCMRDF = null;
/*  28 */   private DecimalField fieldCLTDCMOAM = null;
/*  29 */   private DecimalField fieldCLTDCMAMN = null;
/*  30 */   private DecimalField fieldCLTISSDT1 = null;
/*  31 */   private DecimalField fieldCLTISSDT2 = null;
/*  32 */   private DecimalField fieldCLTISSDT3 = null;
/*  33 */   private DecimalField fieldCLTEXPDT1 = null;
/*  34 */   private DecimalField fieldCLTEXPDT2 = null;
/*  35 */   private DecimalField fieldCLTEXPDT3 = null;
/*  36 */   private CharacterField fieldCLTDCMORF = null;
/*  37 */   private CharacterField fieldCLTDCMDRF = null;
/*  38 */   private DecimalField fieldCLTDCMCKN = null;
/*  39 */   private CharacterField fieldCLTDCMDR1 = null;
/*  40 */   private CharacterField fieldCLTDCMDR2 = null;
/*  41 */   private CharacterField fieldCLTDCMDR3 = null;
/*  42 */   private CharacterField fieldCLTDCMDR4 = null;
/*  43 */   private CharacterField fieldCLTDCMDW1 = null;
/*  44 */   private CharacterField fieldCLTDCMDW2 = null;
/*  45 */   private CharacterField fieldCLTDCMDW3 = null;
/*  46 */   private CharacterField fieldCLTDCMDW4 = null;
/*  47 */   private CharacterField fieldCLTDCMRB1 = null;
/*  48 */   private CharacterField fieldCLTDCMRB2 = null;
/*  49 */   private CharacterField fieldCLTDCMRB3 = null;
/*  50 */   private CharacterField fieldCLTDCMRB4 = null;
/*  51 */   private CharacterField fieldCLTDCMCL1 = null;
/*  52 */   private CharacterField fieldCLTDCMCL2 = null;
/*  53 */   private CharacterField fieldCLTDCMCL3 = null;
/*  54 */   private CharacterField fieldCLTDCMCL4 = null;
/*  55 */   private CharacterField fieldCLTDCMAG1 = null;
/*  56 */   private CharacterField fieldCLTDCMAG2 = null;
/*  57 */   private CharacterField fieldCLTDCMAG3 = null;
/*  58 */   private CharacterField fieldCLTDCMAG4 = null;
/*     */ 
/*     */   public CLTDSJVMessage()
/*     */   {
/*  65 */     createFields();
/*  66 */     initialize();
/*     */   }
/*     */ 
/*     */   protected void createFields()
/*     */   {
/*  74 */     this.recordsize = 821;
/*  75 */     this.fileid = "1000802211800";
/*  76 */     this.recordid = "30345E25DDDAA";
/*  77 */     this.message = new byte[getByteLength()];
/*  78 */     this.formatname = "CLTDSJV";
/*  79 */     this.fieldnames = new String[39];
/*  80 */     this.tagnames = new String[39];
/*  81 */     this.fields = new MessageField[39];
/*     */ 
/*  83 */     this.fieldnames[0] = "CLTUSER";
/*  84 */     this.tagnames[0] = "CLTUSER";
/*     */      this.fields[0]=this.fieldCLTUSER=new CharacterField(this.message, 10, 10, "CLTUSER");
/*     */ 
/*  87 */     this.fieldnames[1] = "CLTFLG";
/*  88 */     this.tagnames[1] = "CLTFLG";
/*     */      this.fields[1]=this.fieldCLTFLG=new CharacterField(this.message, 20, 1, "CLTFLG");
/*     */ 
/*  91 */     this.fieldnames[2] = "CLTDCMACC";
/*  92 */     this.tagnames[2] = "CLTDCMACC";
/*     */      this.fields[2]=this.fieldCLTDCMACC=new DecimalField(this.message, 21, 13, 0, "CLTDCMACC");
/*     */ 
/*  95 */     this.fieldnames[3] = "CLTDCMCCY";
/*  96 */     this.tagnames[3] = "CLTDCMCCY";
/*     */      this.fields[3]=this.fieldCLTDCMCCY=new CharacterField(this.message, 34, 3, "CLTDCMCCY");
/*     */ 
/*  99 */     this.fieldnames[4] = "CLTDCMTYP";
/* 100 */     this.tagnames[4] = "CLTDCMTYP";
/*     */      this.fields[4]=this.fieldCLTDCMTYP=new CharacterField(this.message, 37, 1, "CLTDCMTYP");
/*     */ 
/* 103 */     this.fieldnames[5] = "CLTDCMSTY";
/* 104 */     this.tagnames[5] = "CLTDCMSTY";
/*     */      this.fields[5]=this.fieldCLTDCMSTY=new CharacterField(this.message, 38, 1, "CLTDCMSTY");
/*     */ 
/* 107 */     this.fieldnames[6] = "CLTDCMSTS";
/* 108 */     this.tagnames[6] = "CLTDCMSTS";
/*     */      this.fields[6]=this.fieldCLTDCMSTS=new CharacterField(this.message, 39, 1, "CLTDCMSTS");
/*     */ 
/* 111 */     this.fieldnames[7] = "CLTDCMRDF";
/* 112 */     this.tagnames[7] = "CLTDCMRDF";
/*     */      this.fields[7]=this.fieldCLTDCMRDF=new CharacterField(this.message, 40, 1, "CLTDCMRDF");
/*     */ 
/* 115 */     this.fieldnames[8] = "CLTDCMOAM";
/* 116 */     this.tagnames[8] = "CLTDCMOAM";
/*     */      this.fields[8]=this.fieldCLTDCMOAM=new DecimalField(this.message, 41, 15, 2, "CLTDCMOAM");
/*     */ 
/* 119 */     this.fieldnames[9] = "CLTDCMAMN";
/* 120 */     this.tagnames[9] = "CLTDCMAMN";
/*     */      this.fields[9]=this.fieldCLTDCMAMN=new DecimalField(this.message, 56, 15, 2, "CLTDCMAMN");
/*     */ 
/* 123 */     this.fieldnames[10] = "CLTISSDT1";
/* 124 */     this.tagnames[10] = "CLTISSDT1";
/*     */      this.fields[10]=this.fieldCLTISSDT1=new DecimalField(this.message, 71, 3, 0, "CLTISSDT1");
/*     */ 
/* 127 */     this.fieldnames[11] = "CLTISSDT2";
/* 128 */     this.tagnames[11] = "CLTISSDT2";
/*     */      this.fields[11]=this.fieldCLTISSDT2=new DecimalField(this.message, 74, 3, 0, "CLTISSDT2");
/*     */ 
/* 131 */     this.fieldnames[12] = "CLTISSDT3";
/* 132 */     this.tagnames[12] = "CLTISSDT3";
/*     */      this.fields[12]=this.fieldCLTISSDT3=new DecimalField(this.message, 77, 3, 0, "CLTISSDT3");
/*     */ 
/* 135 */     this.fieldnames[13] = "CLTEXPDT1";
/* 136 */     this.tagnames[13] = "CLTEXPDT1";
/*     */      this.fields[13]=this.fieldCLTEXPDT1=new DecimalField(this.message, 80, 3, 0, "CLTEXPDT1");
/*     */ 
/* 139 */     this.fieldnames[14] = "CLTEXPDT2";
/* 140 */     this.tagnames[14] = "CLTEXPDT2";
/*     */      this.fields[14]=this.fieldCLTEXPDT2=new DecimalField(this.message, 83, 3, 0, "CLTEXPDT2");
/*     */ 
/* 143 */     this.fieldnames[15] = "CLTEXPDT3";
/* 144 */     this.tagnames[15] = "CLTEXPDT3";
/*     */      this.fields[15]=this.fieldCLTEXPDT3=new DecimalField(this.message, 86, 3, 0, "CLTEXPDT3");
/*     */ 
/* 147 */     this.fieldnames[16] = "CLTDCMORF";
/* 148 */     this.tagnames[16] = "CLTDCMORF";
/*     */      this.fields[16]=this.fieldCLTDCMORF=new CharacterField(this.message, 89, 16, "CLTDCMORF");
/*     */ 
/* 151 */     this.fieldnames[17] = "CLTDCMDRF";
/* 152 */     this.tagnames[17] = "CLTDCMDRF";
/*     */      this.fields[17]=this.fieldCLTDCMDRF=new CharacterField(this.message, 105, 16, "CLTDCMDRF");
/*     */ 
/* 155 */     this.fieldnames[18] = "CLTDCMCKN";
/* 156 */     this.tagnames[18] = "CLTDCMCKN";
/*     */      this.fields[18]=this.fieldCLTDCMCKN=new DecimalField(this.message, 121, 10, 0, "CLTDCMCKN");
/*     */ 
/* 159 */     this.fieldnames[19] = "CLTDCMDR1";
/* 160 */     this.tagnames[19] = "CLTDCMDR1";
/*     */      this.fields[19]=this.fieldCLTDCMDR1=new CharacterField(this.message, 131, 35, "CLTDCMDR1");
/*     */ 
/* 163 */     this.fieldnames[20] = "CLTDCMDR2";
/* 164 */     this.tagnames[20] = "CLTDCMDR2";
/*     */      this.fields[20]=this.fieldCLTDCMDR2=new CharacterField(this.message, 166, 35, "CLTDCMDR2");
/*     */ 
/* 167 */     this.fieldnames[21] = "CLTDCMDR3";
/* 168 */     this.tagnames[21] = "CLTDCMDR3";
/*     */      this.fields[21]=this.fieldCLTDCMDR3=new CharacterField(this.message, 201, 35, "CLTDCMDR3");
/*     */ 
/* 171 */     this.fieldnames[22] = "CLTDCMDR4";
/* 172 */     this.tagnames[22] = "CLTDCMDR4";
/*     */      this.fields[22]=this.fieldCLTDCMDR4=new CharacterField(this.message, 236, 35, "CLTDCMDR4");
/*     */ 
/* 175 */     this.fieldnames[23] = "CLTDCMDW1";
/* 176 */     this.tagnames[23] = "CLTDCMDW1";
/*     */      this.fields[23]=this.fieldCLTDCMDW1=new CharacterField(this.message, 271, 35, "CLTDCMDW1");
/*     */ 
/* 179 */     this.fieldnames[24] = "CLTDCMDW2";
/* 180 */     this.tagnames[24] = "CLTDCMDW2";
/*     */      this.fields[24]=this.fieldCLTDCMDW2=new CharacterField(this.message, 306, 35, "CLTDCMDW2");
/*     */ 
/* 183 */     this.fieldnames[25] = "CLTDCMDW3";
/* 184 */     this.tagnames[25] = "CLTDCMDW3";
/*     */      this.fields[25]=this.fieldCLTDCMDW3=new CharacterField(this.message, 341, 35, "CLTDCMDW3");
/*     */ 
/* 187 */     this.fieldnames[26] = "CLTDCMDW4";
/* 188 */     this.tagnames[26] = "CLTDCMDW4";
/*     */      this.fields[26]=this.fieldCLTDCMDW4=new CharacterField(this.message, 376, 35, "CLTDCMDW4");
/*     */ 
/* 191 */     this.fieldnames[27] = "CLTDCMRB1";
/* 192 */     this.tagnames[27] = "CLTDCMRB1";
/*     */      this.fields[27]=this.fieldCLTDCMRB1=new CharacterField(this.message, 411, 35, "CLTDCMRB1");
/*     */ 
/* 195 */     this.fieldnames[28] = "CLTDCMRB2";
/* 196 */     this.tagnames[28] = "CLTDCMRB2";
/*     */      this.fields[28]=this.fieldCLTDCMRB2=new CharacterField(this.message, 446, 35, "CLTDCMRB2");
/*     */ 
/* 199 */     this.fieldnames[29] = "CLTDCMRB3";
/* 200 */     this.tagnames[29] = "CLTDCMRB3";
/*     */      this.fields[29]=this.fieldCLTDCMRB3=new CharacterField(this.message, 481, 35, "CLTDCMRB3");
/*     */ 
/* 203 */     this.fieldnames[30] = "CLTDCMRB4";
/* 204 */     this.tagnames[30] = "CLTDCMRB4";
/*     */      this.fields[30]=this.fieldCLTDCMRB4=new CharacterField(this.message, 516, 35, "CLTDCMRB4");
/*     */ 
/* 207 */     this.fieldnames[31] = "CLTDCMCL1";
/* 208 */     this.tagnames[31] = "CLTDCMCL1";
/*     */      this.fields[31]=this.fieldCLTDCMCL1=new CharacterField(this.message, 551, 35, "CLTDCMCL1");
/*     */ 
/* 211 */     this.fieldnames[32] = "CLTDCMCL2";
/* 212 */     this.tagnames[32] = "CLTDCMCL2";
/*     */      this.fields[32]=this.fieldCLTDCMCL2=new CharacterField(this.message, 586, 35, "CLTDCMCL2");
/*     */ 
/* 215 */     this.fieldnames[33] = "CLTDCMCL3";
/* 216 */     this.tagnames[33] = "CLTDCMCL3";
/*     */      this.fields[33]=this.fieldCLTDCMCL3=new CharacterField(this.message, 621, 35, "CLTDCMCL3");
/*     */ 
/* 219 */     this.fieldnames[34] = "CLTDCMCL4";
/* 220 */     this.tagnames[34] = "CLTDCMCL4";
/*     */      this.fields[34]=this.fieldCLTDCMCL4=new CharacterField(this.message, 656, 35, "CLTDCMCL4");
/*     */ 
/* 223 */     this.fieldnames[35] = "CLTDCMAG1";
/* 224 */     this.tagnames[35] = "CLTDCMAG1";
/*     */      this.fields[35]=this.fieldCLTDCMAG1=new CharacterField(this.message, 691, 35, "CLTDCMAG1");
/*     */ 
/* 227 */     this.fieldnames[36] = "CLTDCMAG2";
/* 228 */     this.tagnames[36] = "CLTDCMAG2";
/*     */      this.fields[36]=this.fieldCLTDCMAG2=new CharacterField(this.message, 726, 35, "CLTDCMAG2");
/*     */ 
/* 231 */     this.fieldnames[37] = "CLTDCMAG3";
/* 232 */     this.tagnames[37] = "CLTDCMAG3";
/*     */      this.fields[37]=this.fieldCLTDCMAG3=new CharacterField(this.message, 761, 35, "CLTDCMAG3");
/*     */ 
/* 235 */     this.fieldnames[38] = "CLTDCMAG4";
/* 236 */     this.tagnames[38] = "CLTDCMAG4";
/*     */      this.fields[38]=this.fieldCLTDCMAG4=new CharacterField(this.message, 796, 35, "CLTDCMAG4");
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalCLTDCMACC()
/*     */   {
/* 245 */     return this.fieldCLTDCMACC.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalCLTDCMAMN()
/*     */   {
/* 252 */     return this.fieldCLTDCMAMN.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalCLTDCMCKN()
/*     */   {
/* 259 */     return this.fieldCLTDCMCKN.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalCLTDCMOAM()
/*     */   {
/* 266 */     return this.fieldCLTDCMOAM.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalCLTEXPDT1()
/*     */   {
/* 273 */     return this.fieldCLTEXPDT1.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalCLTEXPDT2()
/*     */   {
/* 280 */     return this.fieldCLTEXPDT2.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalCLTEXPDT3()
/*     */   {
/* 287 */     return this.fieldCLTEXPDT3.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalCLTISSDT1()
/*     */   {
/* 294 */     return this.fieldCLTISSDT1.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalCLTISSDT2()
/*     */   {
/* 301 */     return this.fieldCLTISSDT2.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalCLTISSDT3()
/*     */   {
/* 308 */     return this.fieldCLTISSDT3.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public String getCLTDCMACC()
/*     */   {
/* 315 */     return this.fieldCLTDCMACC.getString();
/*     */   }
/*     */ 
/*     */   public String getCLTDCMAG1()
/*     */   {
/* 322 */     return this.fieldCLTDCMAG1.getString();
/*     */   }
/*     */ 
/*     */   public String getCLTDCMAG2()
/*     */   {
/* 329 */     return this.fieldCLTDCMAG2.getString();
/*     */   }
/*     */ 
/*     */   public String getCLTDCMAG3()
/*     */   {
/* 336 */     return this.fieldCLTDCMAG3.getString();
/*     */   }
/*     */ 
/*     */   public String getCLTDCMAG4()
/*     */   {
/* 343 */     return this.fieldCLTDCMAG4.getString();
/*     */   }
/*     */ 
/*     */   public String getCLTDCMAMN()
/*     */   {
/* 350 */     return this.fieldCLTDCMAMN.getString();
/*     */   }
/*     */ 
/*     */   public String getCLTDCMCCY()
/*     */   {
/* 357 */     return this.fieldCLTDCMCCY.getString();
/*     */   }
/*     */ 
/*     */   public String getCLTDCMCKN()
/*     */   {
/* 364 */     return this.fieldCLTDCMCKN.getString();
/*     */   }
/*     */ 
/*     */   public String getCLTDCMCL1()
/*     */   {
/* 371 */     return this.fieldCLTDCMCL1.getString();
/*     */   }
/*     */ 
/*     */   public String getCLTDCMCL2()
/*     */   {
/* 378 */     return this.fieldCLTDCMCL2.getString();
/*     */   }
/*     */ 
/*     */   public String getCLTDCMCL3()
/*     */   {
/* 385 */     return this.fieldCLTDCMCL3.getString();
/*     */   }
/*     */ 
/*     */   public String getCLTDCMCL4()
/*     */   {
/* 392 */     return this.fieldCLTDCMCL4.getString();
/*     */   }
/*     */ 
/*     */   public String getCLTDCMDR1()
/*     */   {
/* 399 */     return this.fieldCLTDCMDR1.getString();
/*     */   }
/*     */ 
/*     */   public String getCLTDCMDR2()
/*     */   {
/* 406 */     return this.fieldCLTDCMDR2.getString();
/*     */   }
/*     */ 
/*     */   public String getCLTDCMDR3()
/*     */   {
/* 413 */     return this.fieldCLTDCMDR3.getString();
/*     */   }
/*     */ 
/*     */   public String getCLTDCMDR4()
/*     */   {
/* 420 */     return this.fieldCLTDCMDR4.getString();
/*     */   }
/*     */ 
/*     */   public String getCLTDCMDRF()
/*     */   {
/* 427 */     return this.fieldCLTDCMDRF.getString();
/*     */   }
/*     */ 
/*     */   public String getCLTDCMDW1()
/*     */   {
/* 434 */     return this.fieldCLTDCMDW1.getString();
/*     */   }
/*     */ 
/*     */   public String getCLTDCMDW2()
/*     */   {
/* 441 */     return this.fieldCLTDCMDW2.getString();
/*     */   }
/*     */ 
/*     */   public String getCLTDCMDW3()
/*     */   {
/* 448 */     return this.fieldCLTDCMDW3.getString();
/*     */   }
/*     */ 
/*     */   public String getCLTDCMDW4()
/*     */   {
/* 455 */     return this.fieldCLTDCMDW4.getString();
/*     */   }
/*     */ 
/*     */   public String getCLTDCMOAM()
/*     */   {
/* 462 */     return this.fieldCLTDCMOAM.getString();
/*     */   }
/*     */ 
/*     */   public String getCLTDCMORF()
/*     */   {
/* 469 */     return this.fieldCLTDCMORF.getString();
/*     */   }
/*     */ 
/*     */   public String getCLTDCMRB1()
/*     */   {
/* 476 */     return this.fieldCLTDCMRB1.getString();
/*     */   }
/*     */ 
/*     */   public String getCLTDCMRB2()
/*     */   {
/* 483 */     return this.fieldCLTDCMRB2.getString();
/*     */   }
/*     */ 
/*     */   public String getCLTDCMRB3()
/*     */   {
/* 490 */     return this.fieldCLTDCMRB3.getString();
/*     */   }
/*     */ 
/*     */   public String getCLTDCMRB4()
/*     */   {
/* 497 */     return this.fieldCLTDCMRB4.getString();
/*     */   }
/*     */ 
/*     */   public String getCLTDCMRDF()
/*     */   {
/* 504 */     return this.fieldCLTDCMRDF.getString();
/*     */   }
/*     */ 
/*     */   public String getCLTDCMSTS()
/*     */   {
/* 511 */     return this.fieldCLTDCMSTS.getString();
/*     */   }
/*     */ 
/*     */   public String getCLTDCMSTY()
/*     */   {
/* 518 */     return this.fieldCLTDCMSTY.getString();
/*     */   }
/*     */ 
/*     */   public String getCLTDCMTYP()
/*     */   {
/* 525 */     return this.fieldCLTDCMTYP.getString();
/*     */   }
/*     */ 
/*     */   public String getCLTEXPDT1()
/*     */   {
/* 532 */     return this.fieldCLTEXPDT1.getString();
/*     */   }
/*     */ 
/*     */   public String getCLTEXPDT2()
/*     */   {
/* 539 */     return this.fieldCLTEXPDT2.getString();
/*     */   }
/*     */ 
/*     */   public String getCLTEXPDT3()
/*     */   {
/* 546 */     return this.fieldCLTEXPDT3.getString();
/*     */   }
/*     */ 
/*     */   public String getCLTFLG()
/*     */   {
/* 553 */     return this.fieldCLTFLG.getString();
/*     */   }
/*     */ 
/*     */   public String getCLTISSDT1()
/*     */   {
/* 560 */     return this.fieldCLTISSDT1.getString();
/*     */   }
/*     */ 
/*     */   public String getCLTISSDT2()
/*     */   {
/* 567 */     return this.fieldCLTISSDT2.getString();
/*     */   }
/*     */ 
/*     */   public String getCLTISSDT3()
/*     */   {
/* 574 */     return this.fieldCLTISSDT3.getString();
/*     */   }
/*     */ 
/*     */   public String getCLTUSER()
/*     */   {
/* 581 */     return this.fieldCLTUSER.getString();
/*     */   }
/*     */ 
/*     */   public void setCLTDCMACC(String newvalue)
/*     */   {
/* 588 */     this.fieldCLTDCMACC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setCLTDCMACC(BigDecimal newvalue)
/*     */   {
/* 595 */     this.fieldCLTDCMACC.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setCLTDCMAG1(String newvalue)
/*     */   {
/* 602 */     this.fieldCLTDCMAG1.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setCLTDCMAG2(String newvalue)
/*     */   {
/* 609 */     this.fieldCLTDCMAG2.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setCLTDCMAG3(String newvalue)
/*     */   {
/* 616 */     this.fieldCLTDCMAG3.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setCLTDCMAG4(String newvalue)
/*     */   {
/* 623 */     this.fieldCLTDCMAG4.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setCLTDCMAMN(String newvalue)
/*     */   {
/* 630 */     this.fieldCLTDCMAMN.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setCLTDCMAMN(BigDecimal newvalue)
/*     */   {
/* 637 */     this.fieldCLTDCMAMN.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setCLTDCMCCY(String newvalue)
/*     */   {
/* 644 */     this.fieldCLTDCMCCY.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setCLTDCMCKN(String newvalue)
/*     */   {
/* 651 */     this.fieldCLTDCMCKN.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setCLTDCMCKN(BigDecimal newvalue)
/*     */   {
/* 658 */     this.fieldCLTDCMCKN.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setCLTDCMCL1(String newvalue)
/*     */   {
/* 665 */     this.fieldCLTDCMCL1.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setCLTDCMCL2(String newvalue)
/*     */   {
/* 672 */     this.fieldCLTDCMCL2.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setCLTDCMCL3(String newvalue)
/*     */   {
/* 679 */     this.fieldCLTDCMCL3.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setCLTDCMCL4(String newvalue)
/*     */   {
/* 686 */     this.fieldCLTDCMCL4.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setCLTDCMDR1(String newvalue)
/*     */   {
/* 693 */     this.fieldCLTDCMDR1.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setCLTDCMDR2(String newvalue)
/*     */   {
/* 700 */     this.fieldCLTDCMDR2.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setCLTDCMDR3(String newvalue)
/*     */   {
/* 707 */     this.fieldCLTDCMDR3.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setCLTDCMDR4(String newvalue)
/*     */   {
/* 714 */     this.fieldCLTDCMDR4.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setCLTDCMDRF(String newvalue)
/*     */   {
/* 721 */     this.fieldCLTDCMDRF.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setCLTDCMDW1(String newvalue)
/*     */   {
/* 728 */     this.fieldCLTDCMDW1.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setCLTDCMDW2(String newvalue)
/*     */   {
/* 735 */     this.fieldCLTDCMDW2.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setCLTDCMDW3(String newvalue)
/*     */   {
/* 742 */     this.fieldCLTDCMDW3.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setCLTDCMDW4(String newvalue)
/*     */   {
/* 749 */     this.fieldCLTDCMDW4.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setCLTDCMOAM(String newvalue)
/*     */   {
/* 756 */     this.fieldCLTDCMOAM.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setCLTDCMOAM(BigDecimal newvalue)
/*     */   {
/* 763 */     this.fieldCLTDCMOAM.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setCLTDCMORF(String newvalue)
/*     */   {
/* 770 */     this.fieldCLTDCMORF.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setCLTDCMRB1(String newvalue)
/*     */   {
/* 777 */     this.fieldCLTDCMRB1.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setCLTDCMRB2(String newvalue)
/*     */   {
/* 784 */     this.fieldCLTDCMRB2.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setCLTDCMRB3(String newvalue)
/*     */   {
/* 791 */     this.fieldCLTDCMRB3.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setCLTDCMRB4(String newvalue)
/*     */   {
/* 798 */     this.fieldCLTDCMRB4.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setCLTDCMRDF(String newvalue)
/*     */   {
/* 805 */     this.fieldCLTDCMRDF.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setCLTDCMSTS(String newvalue)
/*     */   {
/* 812 */     this.fieldCLTDCMSTS.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setCLTDCMSTY(String newvalue)
/*     */   {
/* 819 */     this.fieldCLTDCMSTY.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setCLTDCMTYP(String newvalue)
/*     */   {
/* 826 */     this.fieldCLTDCMTYP.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setCLTEXPDT1(String newvalue)
/*     */   {
/* 833 */     this.fieldCLTEXPDT1.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setCLTEXPDT1(BigDecimal newvalue)
/*     */   {
/* 840 */     this.fieldCLTEXPDT1.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setCLTEXPDT2(String newvalue)
/*     */   {
/* 847 */     this.fieldCLTEXPDT2.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setCLTEXPDT2(BigDecimal newvalue)
/*     */   {
/* 854 */     this.fieldCLTEXPDT2.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setCLTEXPDT3(String newvalue)
/*     */   {
/* 861 */     this.fieldCLTEXPDT3.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setCLTEXPDT3(BigDecimal newvalue)
/*     */   {
/* 868 */     this.fieldCLTEXPDT3.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setCLTFLG(String newvalue)
/*     */   {
/* 875 */     this.fieldCLTFLG.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setCLTISSDT1(String newvalue)
/*     */   {
/* 882 */     this.fieldCLTISSDT1.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setCLTISSDT1(BigDecimal newvalue)
/*     */   {
/* 889 */     this.fieldCLTISSDT1.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setCLTISSDT2(String newvalue)
/*     */   {
/* 896 */     this.fieldCLTISSDT2.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setCLTISSDT2(BigDecimal newvalue)
/*     */   {
/* 903 */     this.fieldCLTISSDT2.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setCLTISSDT3(String newvalue)
/*     */   {
/* 910 */     this.fieldCLTISSDT3.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setCLTISSDT3(BigDecimal newvalue)
/*     */   {
/* 917 */     this.fieldCLTISSDT3.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setCLTUSER(String newvalue)
/*     */   {
/* 924 */     this.fieldCLTUSER.setString(newvalue);
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.CLTDSJVMessage
 * JD-Core Version:    0.6.0
 */