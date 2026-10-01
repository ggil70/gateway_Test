/*     */ package com.activo.gateway.dibs.messages;
/*     */ 
/*     */ import java.math.BigDecimal;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*     */ 
/*     */ public class DIGIPRDSJVMessage extends MessageRecord
/*     */ {
/*  19 */   final int FIELDCOUNT = 34;
/*  20 */   private CharacterField fieldDGPROOT = null;
/*  21 */   private CharacterField fieldDGPOPE = null;
/*  22 */   private DecimalField fieldDGPCUN = null;
/*  23 */   private CharacterField fieldDGPUSR = null;
/*  24 */   private DecimalField fieldDGPACD = null;
/*  25 */   private DecimalField fieldDGPLAC = null;
/*  26 */   private CharacterField fieldDGPSTS = null;
/*  27 */   private DecimalField fieldDGPBRN = null;
/*  28 */   private CharacterField fieldDGPBRD = null;
/*  29 */   private DecimalField fieldDGPACC = null;
/*  30 */   private DecimalField fieldDGPAC2 = null;
/*  31 */   private DecimalField fieldDGPAC3 = null;
/*  32 */   private DecimalField fieldDGPAC4 = null;
/*  33 */   private DecimalField fieldDGPAC5 = null;
/*  34 */   private CharacterField fieldDGPFNA = null;
/*  35 */   private CharacterField fieldDGPSNA = null;
/*  36 */   private CharacterField fieldDGPLN1 = null;
/*  37 */   private CharacterField fieldDGPLN2 = null;
/*  38 */   private CharacterField fieldDGPNA1 = null;
/*  39 */   private CharacterField fieldDGPNA2 = null;
/*  40 */   private CharacterField fieldDGPNA3 = null;
/*  41 */   private CharacterField fieldDGPNA4 = null;
/*  42 */   private CharacterField fieldDGPCTY = null;
/*  43 */   private CharacterField fieldDGPSTE = null;
/*  44 */   private CharacterField fieldDGPSTN = null;
/*  45 */   private CharacterField fieldDGPZPC = null;
/*  46 */   private CharacterField fieldDGPCTR = null;
/*  47 */   private CharacterField fieldDGPSEX = null;
/*  48 */   private CharacterField fieldDGPTYP = null;
/*  49 */   private CharacterField fieldDGPCCL = null;
/*  50 */   private DecimalField fieldDGPHPN = null;
/*  51 */   private DecimalField fieldDGPPHN = null;
/*  52 */   private DecimalField fieldDGPPH1 = null;
/*  53 */   private DecimalField fieldDGPFAX = null;
/*     */ 
/*     */   public DIGIPRDSJVMessage()
/*     */   {
/*  60 */     createFields();
/*  61 */     initialize();
/*     */   }
/*     */ 
/*     */   protected void createFields()
/*     */   {
/*  70 */     this.recordsize = 554;
/*  71 */     this.fileid = "1061204180718";
/*  72 */     this.recordid = "5A4C7B52FA1E3";
/*  73 */     this.message = new byte[getByteLength()];
/*  74 */     this.formatname = "DIGIPRDSJV";
/*  75 */     this.fieldnames = new String[34];
/*  76 */     this.tagnames = new String[34];
/*  77 */     this.fields = new MessageField[34];
/*     */ 
/*  79 */     this.fieldnames[0] = "DGPROOT";
/*  80 */     this.tagnames[0] = "DGPROOT";
/*     */      this.fields[0]=this.fieldDGPROOT=new CharacterField(this.message, 10, 10, "DGPROOT");
/*     */ 
/*  83 */     this.fieldnames[1] = "DGPOPE";
/*  84 */     this.tagnames[1] = "DGPOPE";
/*     */      this.fields[1]=this.fieldDGPOPE=new CharacterField(this.message, 20, 2, "DGPOPE");
/*     */ 
/*  87 */     this.fieldnames[2] = "DGPCUN";
/*  88 */     this.tagnames[2] = "DGPCUN";
/*     */      this.fields[2]=this.fieldDGPCUN=new DecimalField(this.message, 22, 10, 0, "DGPCUN");
/*     */ 
/*  91 */     this.fieldnames[3] = "DGPUSR";
/*  92 */     this.tagnames[3] = "DGPUSR";
/*     */      this.fields[3]=this.fieldDGPUSR=new CharacterField(this.message, 32, 10, "DGPUSR");
/*     */ 
/*  95 */     this.fieldnames[4] = "DGPACD";
/*  96 */     this.tagnames[4] = "DGPACD";
/*     */      this.fields[4]=this.fieldDGPACD=new DecimalField(this.message, 42, 9, 0, "DGPACD");
/*     */ 
/*  99 */     this.fieldnames[5] = "DGPLAC";
/* 100 */     this.tagnames[5] = "DGPLAC";
/*     */      this.fields[5]=this.fieldDGPLAC=new DecimalField(this.message, 51, 9, 0, "DGPLAC");
/*     */ 
/* 103 */     this.fieldnames[6] = "DGPSTS";
/* 104 */     this.tagnames[6] = "DGPSTS";
/*     */      this.fields[6]=this.fieldDGPSTS=new CharacterField(this.message, 60, 1, "DGPSTS");
/*     */ 
/* 107 */     this.fieldnames[7] = "DGPBRN";
/* 108 */     this.tagnames[7] = "DGPBRN";
/*     */      this.fields[7]=this.fieldDGPBRN=new DecimalField(this.message, 61, 4, 0, "DGPBRN");
/*     */ 
/* 111 */     this.fieldnames[8] = "DGPBRD";
/* 112 */     this.tagnames[8] = "DGPBRD";
/*     */      this.fields[8]=this.fieldDGPBRD=new CharacterField(this.message, 65, 30, "DGPBRD");
/*     */ 
/* 115 */     this.fieldnames[9] = "DGPACC";
/* 116 */     this.tagnames[9] = "DGPACC";
/*     */      this.fields[9]=this.fieldDGPACC=new DecimalField(this.message, 95, 13, 0, "DGPACC");
/*     */ 
/* 119 */     this.fieldnames[10] = "DGPAC2";
/* 120 */     this.tagnames[10] = "DGPAC2";
/*     */      this.fields[10]=this.fieldDGPAC2=new DecimalField(this.message, 108, 13, 0, "DGPAC2");
/*     */ 
/* 123 */     this.fieldnames[11] = "DGPAC3";
/* 124 */     this.tagnames[11] = "DGPAC3";
/*     */      this.fields[11]=this.fieldDGPAC3=new DecimalField(this.message, 121, 13, 0, "DGPAC3");
/*     */ 
/* 127 */     this.fieldnames[12] = "DGPAC4";
/* 128 */     this.tagnames[12] = "DGPAC4";
/*     */      this.fields[12]=this.fieldDGPAC4=new DecimalField(this.message, 134, 13, 0, "DGPAC4");
/*     */ 
/* 131 */     this.fieldnames[13] = "DGPAC5";
/* 132 */     this.tagnames[13] = "DGPAC5";
/*     */      this.fields[13]=this.fieldDGPAC5=new DecimalField(this.message, 147, 13, 0, "DGPAC5");
/*     */ 
/* 135 */     this.fieldnames[14] = "DGPFNA";
/* 136 */     this.tagnames[14] = "DGPFNA";
/*     */      this.fields[14]=this.fieldDGPFNA=new CharacterField(this.message, 160, 30, "DGPFNA");
/*     */ 
/* 139 */     this.fieldnames[15] = "DGPSNA";
/* 140 */     this.tagnames[15] = "DGPSNA";
/*     */      this.fields[15]=this.fieldDGPSNA=new CharacterField(this.message, 190, 30, "DGPSNA");
/*     */ 
/* 143 */     this.fieldnames[16] = "DGPLN1";
/* 144 */     this.tagnames[16] = "DGPLN1";
/*     */      this.fields[16]=this.fieldDGPLN1=new CharacterField(this.message, 220, 30, "DGPLN1");
/*     */ 
/* 147 */     this.fieldnames[17] = "DGPLN2";
/* 148 */     this.tagnames[17] = "DGPLN2";
/*     */      this.fields[17]=this.fieldDGPLN2=new CharacterField(this.message, 250, 30, "DGPLN2");
/*     */ 
/* 151 */     this.fieldnames[18] = "DGPNA1";
/* 152 */     this.tagnames[18] = "DGPNA1";
/*     */      this.fields[18]=this.fieldDGPNA1=new CharacterField(this.message, 280, 45, "DGPNA1");
/*     */ 
/* 155 */     this.fieldnames[19] = "DGPNA2";
/* 156 */     this.tagnames[19] = "DGPNA2";
/*     */      this.fields[19]=this.fieldDGPNA2=new CharacterField(this.message, 325, 35, "DGPNA2");
/*     */ 
/* 159 */     this.fieldnames[20] = "DGPNA3";
/* 160 */     this.tagnames[20] = "DGPNA3";
/*     */      this.fields[20]=this.fieldDGPNA3=new CharacterField(this.message, 360, 35, "DGPNA3");
/*     */ 
/* 163 */     this.fieldnames[21] = "DGPNA4";
/* 164 */     this.tagnames[21] = "DGPNA4";
/*     */      this.fields[21]=this.fieldDGPNA4=new CharacterField(this.message, 395, 35, "DGPNA4");
/*     */ 
/* 167 */     this.fieldnames[22] = "DGPCTY";
/* 168 */     this.tagnames[22] = "DGPCTY";
/*     */      this.fields[22]=this.fieldDGPCTY=new CharacterField(this.message, 430, 30, "DGPCTY");
/*     */ 
/* 171 */     this.fieldnames[23] = "DGPSTE";
/* 172 */     this.tagnames[23] = "DGPSTE";
/*     */      this.fields[23]=this.fieldDGPSTE=new CharacterField(this.message, 460, 3, "DGPSTE");
/*     */ 
/* 175 */     this.fieldnames[24] = "DGPSTN";
/* 176 */     this.tagnames[24] = "DGPSTN";
/*     */      this.fields[24]=this.fieldDGPSTN=new CharacterField(this.message, 463, 20, "DGPSTN");
/*     */ 
/* 179 */     this.fieldnames[25] = "DGPZPC";
/* 180 */     this.tagnames[25] = "DGPZPC";
/*     */      this.fields[25]=this.fieldDGPZPC=new CharacterField(this.message, 483, 10, "DGPZPC");
/*     */ 
/* 183 */     this.fieldnames[26] = "DGPCTR";
/* 184 */     this.tagnames[26] = "DGPCTR";
/*     */      this.fields[26]=this.fieldDGPCTR=new CharacterField(this.message, 493, 20, "DGPCTR");
/*     */ 
/* 187 */     this.fieldnames[27] = "DGPSEX";
/* 188 */     this.tagnames[27] = "DGPSEX";
/*     */      this.fields[27]=this.fieldDGPSEX=new CharacterField(this.message, 513, 1, "DGPSEX");
/*     */ 
/* 191 */     this.fieldnames[28] = "DGPTYP";
/* 192 */     this.tagnames[28] = "DGPTYP";
/*     */      this.fields[28]=this.fieldDGPTYP=new CharacterField(this.message, 514, 1, "DGPTYP");
/*     */ 
/* 195 */     this.fieldnames[29] = "DGPCCL";
/* 196 */     this.tagnames[29] = "DGPCCL";
/*     */      this.fields[29]=this.fieldDGPCCL=new CharacterField(this.message, 515, 1, "DGPCCL");
/*     */ 
/* 199 */     this.fieldnames[30] = "DGPHPN";
/* 200 */     this.tagnames[30] = "DGPHPN";
/*     */      this.fields[30]=this.fieldDGPHPN=new DecimalField(this.message, 516, 12, 0, "DGPHPN");
/*     */ 
/* 203 */     this.fieldnames[31] = "DGPPHN";
/* 204 */     this.tagnames[31] = "DGPPHN";
/*     */      this.fields[31]=this.fieldDGPPHN=new DecimalField(this.message, 528, 12, 0, "DGPPHN");
/*     */ 
/* 207 */     this.fieldnames[32] = "DGPPH1";
/* 208 */     this.tagnames[32] = "DGPPH1";
/*     */      this.fields[32]=this.fieldDGPPH1=new DecimalField(this.message, 540, 12, 0, "DGPPH1");
/*     */ 
/* 211 */     this.fieldnames[33] = "DGPFAX";
/* 212 */     this.tagnames[33] = "DGPFAX";
/*     */      this.fields[33]=this.fieldDGPFAX=new DecimalField(this.message, 552, 12, 0, "DGPFAX");
/*     */   }
/*     */ 
/*     */   public void setDGPROOT(String newvalue)
/*     */   {
/* 222 */     this.fieldDGPROOT.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getDGPROOT()
/*     */   {
/* 230 */     return this.fieldDGPROOT.getString();
/*     */   }
/*     */ 
/*     */   public void setDGPOPE(String newvalue)
/*     */   {
/* 238 */     this.fieldDGPOPE.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getDGPOPE()
/*     */   {
/* 246 */     return this.fieldDGPOPE.getString();
/*     */   }
/*     */ 
/*     */   public void setDGPCUN(String newvalue)
/*     */   {
/* 254 */     this.fieldDGPCUN.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getDGPCUN()
/*     */   {
/* 262 */     return this.fieldDGPCUN.getString();
/*     */   }
/*     */ 
/*     */   public void setDGPCUN(BigDecimal newvalue)
/*     */   {
/* 270 */     this.fieldDGPCUN.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalDGPCUN()
/*     */   {
/* 278 */     return this.fieldDGPCUN.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setDGPUSR(String newvalue)
/*     */   {
/* 286 */     this.fieldDGPUSR.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getDGPUSR()
/*     */   {
/* 294 */     return this.fieldDGPUSR.getString();
/*     */   }
/*     */ 
/*     */   public void setDGPACD(String newvalue)
/*     */   {
/* 302 */     this.fieldDGPACD.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getDGPACD()
/*     */   {
/* 310 */     return this.fieldDGPACD.getString();
/*     */   }
/*     */ 
/*     */   public void setDGPACD(BigDecimal newvalue)
/*     */   {
/* 318 */     this.fieldDGPACD.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalDGPACD()
/*     */   {
/* 326 */     return this.fieldDGPACD.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setDGPLAC(String newvalue)
/*     */   {
/* 334 */     this.fieldDGPLAC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getDGPLAC()
/*     */   {
/* 342 */     return this.fieldDGPLAC.getString();
/*     */   }
/*     */ 
/*     */   public void setDGPLAC(BigDecimal newvalue)
/*     */   {
/* 350 */     this.fieldDGPLAC.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalDGPLAC()
/*     */   {
/* 358 */     return this.fieldDGPLAC.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setDGPSTS(String newvalue)
/*     */   {
/* 366 */     this.fieldDGPSTS.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getDGPSTS()
/*     */   {
/* 374 */     return this.fieldDGPSTS.getString();
/*     */   }
/*     */ 
/*     */   public void setDGPBRN(String newvalue)
/*     */   {
/* 382 */     this.fieldDGPBRN.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getDGPBRN()
/*     */   {
/* 390 */     return this.fieldDGPBRN.getString();
/*     */   }
/*     */ 
/*     */   public void setDGPBRN(BigDecimal newvalue)
/*     */   {
/* 398 */     this.fieldDGPBRN.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalDGPBRN()
/*     */   {
/* 406 */     return this.fieldDGPBRN.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setDGPBRD(String newvalue)
/*     */   {
/* 414 */     this.fieldDGPBRD.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getDGPBRD()
/*     */   {
/* 422 */     return this.fieldDGPBRD.getString();
/*     */   }
/*     */ 
/*     */   public void setDGPACC(String newvalue)
/*     */   {
/* 430 */     this.fieldDGPACC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getDGPACC()
/*     */   {
/* 438 */     return this.fieldDGPACC.getString();
/*     */   }
/*     */ 
/*     */   public void setDGPACC(BigDecimal newvalue)
/*     */   {
/* 446 */     this.fieldDGPACC.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalDGPACC()
/*     */   {
/* 454 */     return this.fieldDGPACC.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setDGPAC2(String newvalue)
/*     */   {
/* 462 */     this.fieldDGPAC2.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getDGPAC2()
/*     */   {
/* 470 */     return this.fieldDGPAC2.getString();
/*     */   }
/*     */ 
/*     */   public void setDGPAC2(BigDecimal newvalue)
/*     */   {
/* 478 */     this.fieldDGPAC2.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalDGPAC2()
/*     */   {
/* 486 */     return this.fieldDGPAC2.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setDGPAC3(String newvalue)
/*     */   {
/* 494 */     this.fieldDGPAC3.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getDGPAC3()
/*     */   {
/* 502 */     return this.fieldDGPAC3.getString();
/*     */   }
/*     */ 
/*     */   public void setDGPAC3(BigDecimal newvalue)
/*     */   {
/* 510 */     this.fieldDGPAC3.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalDGPAC3()
/*     */   {
/* 518 */     return this.fieldDGPAC3.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setDGPAC4(String newvalue)
/*     */   {
/* 526 */     this.fieldDGPAC4.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getDGPAC4()
/*     */   {
/* 534 */     return this.fieldDGPAC4.getString();
/*     */   }
/*     */ 
/*     */   public void setDGPAC4(BigDecimal newvalue)
/*     */   {
/* 542 */     this.fieldDGPAC4.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalDGPAC4()
/*     */   {
/* 550 */     return this.fieldDGPAC4.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setDGPAC5(String newvalue)
/*     */   {
/* 558 */     this.fieldDGPAC5.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getDGPAC5()
/*     */   {
/* 566 */     return this.fieldDGPAC5.getString();
/*     */   }
/*     */ 
/*     */   public void setDGPAC5(BigDecimal newvalue)
/*     */   {
/* 574 */     this.fieldDGPAC5.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalDGPAC5()
/*     */   {
/* 582 */     return this.fieldDGPAC5.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setDGPFNA(String newvalue)
/*     */   {
/* 590 */     this.fieldDGPFNA.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getDGPFNA()
/*     */   {
/* 598 */     return this.fieldDGPFNA.getString();
/*     */   }
/*     */ 
/*     */   public void setDGPSNA(String newvalue)
/*     */   {
/* 606 */     this.fieldDGPSNA.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getDGPSNA()
/*     */   {
/* 614 */     return this.fieldDGPSNA.getString();
/*     */   }
/*     */ 
/*     */   public void setDGPLN1(String newvalue)
/*     */   {
/* 622 */     this.fieldDGPLN1.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getDGPLN1()
/*     */   {
/* 630 */     return this.fieldDGPLN1.getString();
/*     */   }
/*     */ 
/*     */   public void setDGPLN2(String newvalue)
/*     */   {
/* 638 */     this.fieldDGPLN2.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getDGPLN2()
/*     */   {
/* 646 */     return this.fieldDGPLN2.getString();
/*     */   }
/*     */ 
/*     */   public void setDGPNA1(String newvalue)
/*     */   {
/* 654 */     this.fieldDGPNA1.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getDGPNA1()
/*     */   {
/* 662 */     return this.fieldDGPNA1.getString();
/*     */   }
/*     */ 
/*     */   public void setDGPNA2(String newvalue)
/*     */   {
/* 670 */     this.fieldDGPNA2.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getDGPNA2()
/*     */   {
/* 678 */     return this.fieldDGPNA2.getString();
/*     */   }
/*     */ 
/*     */   public void setDGPNA3(String newvalue)
/*     */   {
/* 686 */     this.fieldDGPNA3.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getDGPNA3()
/*     */   {
/* 694 */     return this.fieldDGPNA3.getString();
/*     */   }
/*     */ 
/*     */   public void setDGPNA4(String newvalue)
/*     */   {
/* 702 */     this.fieldDGPNA4.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getDGPNA4()
/*     */   {
/* 710 */     return this.fieldDGPNA4.getString();
/*     */   }
/*     */ 
/*     */   public void setDGPCTY(String newvalue)
/*     */   {
/* 718 */     this.fieldDGPCTY.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getDGPCTY()
/*     */   {
/* 726 */     return this.fieldDGPCTY.getString();
/*     */   }
/*     */ 
/*     */   public void setDGPSTE(String newvalue)
/*     */   {
/* 734 */     this.fieldDGPSTE.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getDGPSTE()
/*     */   {
/* 742 */     return this.fieldDGPSTE.getString();
/*     */   }
/*     */ 
/*     */   public void setDGPSTN(String newvalue)
/*     */   {
/* 750 */     this.fieldDGPSTN.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getDGPSTN()
/*     */   {
/* 758 */     return this.fieldDGPSTN.getString();
/*     */   }
/*     */ 
/*     */   public void setDGPZPC(String newvalue)
/*     */   {
/* 766 */     this.fieldDGPZPC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getDGPZPC()
/*     */   {
/* 774 */     return this.fieldDGPZPC.getString();
/*     */   }
/*     */ 
/*     */   public void setDGPCTR(String newvalue)
/*     */   {
/* 782 */     this.fieldDGPCTR.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getDGPCTR()
/*     */   {
/* 790 */     return this.fieldDGPCTR.getString();
/*     */   }
/*     */ 
/*     */   public void setDGPSEX(String newvalue)
/*     */   {
/* 798 */     this.fieldDGPSEX.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getDGPSEX()
/*     */   {
/* 806 */     return this.fieldDGPSEX.getString();
/*     */   }
/*     */ 
/*     */   public void setDGPTYP(String newvalue)
/*     */   {
/* 814 */     this.fieldDGPTYP.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getDGPTYP()
/*     */   {
/* 822 */     return this.fieldDGPTYP.getString();
/*     */   }
/*     */ 
/*     */   public void setDGPCCL(String newvalue)
/*     */   {
/* 830 */     this.fieldDGPCCL.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getDGPCCL()
/*     */   {
/* 838 */     return this.fieldDGPCCL.getString();
/*     */   }
/*     */ 
/*     */   public void setDGPHPN(String newvalue)
/*     */   {
/* 846 */     this.fieldDGPHPN.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getDGPHPN()
/*     */   {
/* 854 */     return this.fieldDGPHPN.getString();
/*     */   }
/*     */ 
/*     */   public void setDGPHPN(BigDecimal newvalue)
/*     */   {
/* 862 */     this.fieldDGPHPN.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalDGPHPN()
/*     */   {
/* 870 */     return this.fieldDGPHPN.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setDGPPHN(String newvalue)
/*     */   {
/* 878 */     this.fieldDGPPHN.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getDGPPHN()
/*     */   {
/* 886 */     return this.fieldDGPPHN.getString();
/*     */   }
/*     */ 
/*     */   public void setDGPPHN(BigDecimal newvalue)
/*     */   {
/* 894 */     this.fieldDGPPHN.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalDGPPHN()
/*     */   {
/* 902 */     return this.fieldDGPPHN.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setDGPPH1(String newvalue)
/*     */   {
/* 910 */     this.fieldDGPPH1.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getDGPPH1()
/*     */   {
/* 918 */     return this.fieldDGPPH1.getString();
/*     */   }
/*     */ 
/*     */   public void setDGPPH1(BigDecimal newvalue)
/*     */   {
/* 926 */     this.fieldDGPPH1.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalDGPPH1()
/*     */   {
/* 934 */     return this.fieldDGPPH1.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setDGPFAX(String newvalue)
/*     */   {
/* 942 */     this.fieldDGPFAX.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getDGPFAX()
/*     */   {
/* 950 */     return this.fieldDGPFAX.getString();
/*     */   }
/*     */ 
/*     */   public void setDGPFAX(BigDecimal newvalue)
/*     */   {
/* 958 */     this.fieldDGPFAX.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalDGPFAX()
/*     */   {
/* 966 */     return this.fieldDGPFAX.getBigDecimal();
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.DIGIPRDSJVMessage
 * JD-Core Version:    0.6.0
 */