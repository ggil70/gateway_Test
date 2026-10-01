/*     */ package com.activo.gateway.dibs.messages;
/*     */ 
/*     */ import java.math.BigDecimal;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*     */ 
/*     */ public class ALCDSJVMessage extends MessageRecord
/*     */ {
/*  19 */   final int FIELDCOUNT = 30;
/*  20 */   private CharacterField fieldALCUSER = null;
/*  21 */   private CharacterField fieldALCTYP = null;
/*  22 */   private CharacterField fieldALCPLN = null;
/*  23 */   private DecimalField fieldALCAMT = null;
/*  24 */   private CharacterField fieldALCLNP = null;
/*  25 */   private DecimalField fieldALCACC = null;
/*  26 */   private CharacterField fieldALCAD1 = null;
/*  27 */   private CharacterField fieldALCAD2 = null;
/*  28 */   private CharacterField fieldALCAD3 = null;
/*  29 */   private CharacterField fieldALCAEML = null;
/*  30 */   private DecimalField fieldALCLVY = null;
/*  31 */   private CharacterField fieldALCOWP = null;
/*  32 */   private DecimalField fieldALCMPY = null;
/*  33 */   private DecimalField fieldALCRPY = null;
/*  34 */   private DecimalField fieldALCUPY = null;
/*  35 */   private DecimalField fieldALCHPN = null;
/*  36 */   private DecimalField fieldALCPHN = null;
/*  37 */   private CharacterField fieldALCEMP = null;
/*  38 */   private DecimalField fieldALCHDT1 = null;
/*  39 */   private DecimalField fieldALCHDT2 = null;
/*  40 */   private DecimalField fieldALCHDT3 = null;
/*  41 */   private CharacterField fieldALCJBT = null;
/*  42 */   private CharacterField fieldALCBKR = null;
/*  43 */   private DecimalField fieldALCCAC = null;
/*  44 */   private CharacterField fieldALCCAD1 = null;
/*  45 */   private CharacterField fieldALCCAD2 = null;
/*  46 */   private CharacterField fieldALCCAD3 = null;
/*  47 */   private CharacterField fieldALCCEML = null;
/*  48 */   private DecimalField fieldALCSSN = null;
/*  49 */   private CharacterField fieldALCMMN = null;
/*     */ 
/*     */   public ALCDSJVMessage()
/*     */   {
/*  56 */     createFields();
/*  57 */     initialize();
/*     */   }
/*     */ 
/*     */   protected void createFields()
/*     */   {
/*  65 */     this.recordsize = 484;
/*  66 */     this.fileid = "1000802211753";
/*  67 */     this.recordid = "5A71A46C8130C";
/*  68 */     this.message = new byte[getByteLength()];
/*  69 */     this.formatname = "ALCDSJV";
/*  70 */     this.fieldnames = new String[30];
/*  71 */     this.tagnames = new String[30];
/*  72 */     this.fields = new MessageField[30];
/*     */ 
/*  74 */     this.fieldnames[0] = "ALCUSER";
/*  75 */     this.tagnames[0] = "ALCUSER";
/*     */      this.fields[0]=this.fieldALCUSER=new CharacterField(this.message, 10, 10, "ALCUSER");
/*     */ 
/*  78 */     this.fieldnames[1] = "ALCTYP";
/*  79 */     this.tagnames[1] = "ALCTYP";
/*     */      this.fields[1]=this.fieldALCTYP=new CharacterField(this.message, 20, 1, "ALCTYP");
/*     */ 
/*  82 */     this.fieldnames[2] = "ALCPLN";
/*  83 */     this.tagnames[2] = "ALCPLN";
/*     */      this.fields[2]=this.fieldALCPLN=new CharacterField(this.message, 21, 25, "ALCPLN");
/*     */ 
/*  86 */     this.fieldnames[3] = "ALCAMT";
/*  87 */     this.tagnames[3] = "ALCAMT";
/*     */      this.fields[3]=this.fieldALCAMT=new DecimalField(this.message, 46, 15, 2, "ALCAMT");
/*     */ 
/*  90 */     this.fieldnames[4] = "ALCLNP";
/*  91 */     this.tagnames[4] = "ALCLNP";
/*     */      this.fields[4]=this.fieldALCLNP=new CharacterField(this.message, 61, 1, "ALCLNP");
/*     */ 
/*  94 */     this.fieldnames[5] = "ALCACC";
/*  95 */     this.tagnames[5] = "ALCACC";
/*     */      this.fields[5]=this.fieldALCACC=new DecimalField(this.message, 62, 13, 0, "ALCACC");
/*     */ 
/*  98 */     this.fieldnames[6] = "ALCAD1";
/*  99 */     this.tagnames[6] = "ALCAD1";
/*     */      this.fields[6]=this.fieldALCAD1=new CharacterField(this.message, 75, 30, "ALCAD1");
/*     */ 
/* 102 */     this.fieldnames[7] = "ALCAD2";
/* 103 */     this.tagnames[7] = "ALCAD2";
/*     */      this.fields[7]=this.fieldALCAD2=new CharacterField(this.message, 105, 30, "ALCAD2");
/*     */ 
/* 106 */     this.fieldnames[8] = "ALCAD3";
/* 107 */     this.tagnames[8] = "ALCAD3";
/*     */      this.fields[8]=this.fieldALCAD3=new CharacterField(this.message, 135, 30, "ALCAD3");
/*     */ 
/* 110 */     this.fieldnames[9] = "ALCAEML";
/* 111 */     this.tagnames[9] = "ALCAEML";
/*     */      this.fields[9]=this.fieldALCAEML=new CharacterField(this.message, 165, 25, "ALCAEML");
/*     */ 
/* 114 */     this.fieldnames[10] = "ALCLVY";
/* 115 */     this.tagnames[10] = "ALCLVY";
/*     */      this.fields[10]=this.fieldALCLVY=new DecimalField(this.message, 190, 4, 0, "ALCLVY");
/*     */ 
/* 118 */     this.fieldnames[11] = "ALCOWP";
/* 119 */     this.tagnames[11] = "ALCOWP";
/*     */      this.fields[11]=this.fieldALCOWP=new CharacterField(this.message, 194, 1, "ALCOWP");
/*     */ 
/* 122 */     this.fieldnames[12] = "ALCMPY";
/* 123 */     this.tagnames[12] = "ALCMPY";
/*     */      this.fields[12]=this.fieldALCMPY=new DecimalField(this.message, 195, 15, 2, "ALCMPY");
/*     */ 
/* 126 */     this.fieldnames[13] = "ALCRPY";
/* 127 */     this.tagnames[13] = "ALCRPY";
/*     */      this.fields[13]=this.fieldALCRPY=new DecimalField(this.message, 210, 15, 2, "ALCRPY");
/*     */ 
/* 130 */     this.fieldnames[14] = "ALCUPY";
/* 131 */     this.tagnames[14] = "ALCUPY";
/*     */      this.fields[14]=this.fieldALCUPY=new DecimalField(this.message, 225, 15, 2, "ALCUPY");
/*     */ 
/* 134 */     this.fieldnames[15] = "ALCHPN";
/* 135 */     this.tagnames[15] = "ALCHPN";
/*     */      this.fields[15]=this.fieldALCHPN=new DecimalField(this.message, 240, 12, 0, "ALCHPN");
/*     */ 
/* 138 */     this.fieldnames[16] = "ALCPHN";
/* 139 */     this.tagnames[16] = "ALCPHN";
/*     */      this.fields[16]=this.fieldALCPHN=new DecimalField(this.message, 252, 12, 0, "ALCPHN");
/*     */ 
/* 142 */     this.fieldnames[17] = "ALCEMP";
/* 143 */     this.tagnames[17] = "ALCEMP";
/*     */      this.fields[17]=this.fieldALCEMP=new CharacterField(this.message, 264, 25, "ALCEMP");
/*     */ 
/* 146 */     this.fieldnames[18] = "ALCHDT1";
/* 147 */     this.tagnames[18] = "ALCHDT1";
/*     */      this.fields[18]=this.fieldALCHDT1=new DecimalField(this.message, 289, 3, 0, "ALCHDT1");
/*     */ 
/* 150 */     this.fieldnames[19] = "ALCHDT2";
/* 151 */     this.tagnames[19] = "ALCHDT2";
/*     */      this.fields[19]=this.fieldALCHDT2=new DecimalField(this.message, 292, 3, 0, "ALCHDT2");
/*     */ 
/* 154 */     this.fieldnames[20] = "ALCHDT3";
/* 155 */     this.tagnames[20] = "ALCHDT3";
/*     */      this.fields[20]=this.fieldALCHDT3=new DecimalField(this.message, 295, 5, 0, "ALCHDT3");
/*     */ 
/* 158 */     this.fieldnames[21] = "ALCJBT";
/* 159 */     this.tagnames[21] = "ALCJBT";
/*     */      this.fields[21]=this.fieldALCJBT=new CharacterField(this.message, 300, 25, "ALCJBT");
/*     */ 
/* 162 */     this.fieldnames[22] = "ALCBKR";
/* 163 */     this.tagnames[22] = "ALCBKR";
/*     */      this.fields[22]=this.fieldALCBKR=new CharacterField(this.message, 325, 1, "ALCBKR");
/*     */ 
/* 166 */     this.fieldnames[23] = "ALCCAC";
/* 167 */     this.tagnames[23] = "ALCCAC";
/*     */      this.fields[23]=this.fieldALCCAC=new DecimalField(this.message, 326, 13, 0, "ALCCAC");
/*     */ 
/* 170 */     this.fieldnames[24] = "ALCCAD1";
/* 171 */     this.tagnames[24] = "ALCCAD1";
/*     */      this.fields[24]=this.fieldALCCAD1=new CharacterField(this.message, 339, 30, "ALCCAD1");
/*     */ 
/* 174 */     this.fieldnames[25] = "ALCCAD2";
/* 175 */     this.tagnames[25] = "ALCCAD2";
/*     */      this.fields[25]=this.fieldALCCAD2=new CharacterField(this.message, 369, 30, "ALCCAD2");
/*     */ 
/* 178 */     this.fieldnames[26] = "ALCCAD3";
/* 179 */     this.tagnames[26] = "ALCCAD3";
/*     */      this.fields[26]=this.fieldALCCAD3=new CharacterField(this.message, 399, 30, "ALCCAD3");
/*     */ 
/* 182 */     this.fieldnames[27] = "ALCCEML";
/* 183 */     this.tagnames[27] = "ALCCEML";
/*     */      this.fields[27]=this.fieldALCCEML=new CharacterField(this.message, 429, 25, "ALCCEML");
/*     */ 
/* 186 */     this.fieldnames[28] = "ALCSSN";
/* 187 */     this.tagnames[28] = "ALCSSN";
/*     */      this.fields[28]=this.fieldALCSSN=new DecimalField(this.message, 454, 10, 0, "ALCSSN");
/*     */ 
/* 190 */     this.fieldnames[29] = "ALCMMN";
/* 191 */     this.tagnames[29] = "ALCMMN";
/*     */      this.fields[29]=this.fieldALCMMN=new CharacterField(this.message, 464, 30, "ALCMMN");
/*     */   }
/*     */ 
/*     */   public String getALCACC()
/*     */   {
/* 200 */     return this.fieldALCACC.getString();
/*     */   }
/*     */ 
/*     */   public String getALCAD1()
/*     */   {
/* 207 */     return this.fieldALCAD1.getString();
/*     */   }
/*     */ 
/*     */   public String getALCAD2()
/*     */   {
/* 214 */     return this.fieldALCAD2.getString();
/*     */   }
/*     */ 
/*     */   public String getALCAD3()
/*     */   {
/* 221 */     return this.fieldALCAD3.getString();
/*     */   }
/*     */ 
/*     */   public String getALCAEML()
/*     */   {
/* 228 */     return this.fieldALCAEML.getString();
/*     */   }
/*     */ 
/*     */   public String getALCAMT()
/*     */   {
/* 235 */     return this.fieldALCAMT.getString();
/*     */   }
/*     */ 
/*     */   public String getALCBKR()
/*     */   {
/* 242 */     return this.fieldALCBKR.getString();
/*     */   }
/*     */ 
/*     */   public String getALCCAC()
/*     */   {
/* 249 */     return this.fieldALCCAC.getString();
/*     */   }
/*     */ 
/*     */   public String getALCCAD1()
/*     */   {
/* 256 */     return this.fieldALCCAD1.getString();
/*     */   }
/*     */ 
/*     */   public String getALCCAD2()
/*     */   {
/* 263 */     return this.fieldALCCAD2.getString();
/*     */   }
/*     */ 
/*     */   public String getALCCAD3()
/*     */   {
/* 270 */     return this.fieldALCCAD3.getString();
/*     */   }
/*     */ 
/*     */   public String getALCCEML()
/*     */   {
/* 277 */     return this.fieldALCCEML.getString();
/*     */   }
/*     */ 
/*     */   public String getALCEMP()
/*     */   {
/* 284 */     return this.fieldALCEMP.getString();
/*     */   }
/*     */ 
/*     */   public String getALCHDT1()
/*     */   {
/* 291 */     return this.fieldALCHDT1.getString();
/*     */   }
/*     */ 
/*     */   public String getALCHDT2()
/*     */   {
/* 298 */     return this.fieldALCHDT2.getString();
/*     */   }
/*     */ 
/*     */   public String getALCHDT3()
/*     */   {
/* 305 */     return this.fieldALCHDT3.getString();
/*     */   }
/*     */ 
/*     */   public String getALCHPN()
/*     */   {
/* 312 */     return this.fieldALCHPN.getString();
/*     */   }
/*     */ 
/*     */   public String getALCJBT()
/*     */   {
/* 319 */     return this.fieldALCJBT.getString();
/*     */   }
/*     */ 
/*     */   public String getALCLNP()
/*     */   {
/* 326 */     return this.fieldALCLNP.getString();
/*     */   }
/*     */ 
/*     */   public String getALCLVY()
/*     */   {
/* 333 */     return this.fieldALCLVY.getString();
/*     */   }
/*     */ 
/*     */   public String getALCMMN()
/*     */   {
/* 340 */     return this.fieldALCMMN.getString();
/*     */   }
/*     */ 
/*     */   public String getALCMPY()
/*     */   {
/* 347 */     return this.fieldALCMPY.getString();
/*     */   }
/*     */ 
/*     */   public String getALCOWP()
/*     */   {
/* 354 */     return this.fieldALCOWP.getString();
/*     */   }
/*     */ 
/*     */   public String getALCPHN()
/*     */   {
/* 361 */     return this.fieldALCPHN.getString();
/*     */   }
/*     */ 
/*     */   public String getALCPLN()
/*     */   {
/* 368 */     return this.fieldALCPLN.getString();
/*     */   }
/*     */ 
/*     */   public String getALCRPY()
/*     */   {
/* 375 */     return this.fieldALCRPY.getString();
/*     */   }
/*     */ 
/*     */   public String getALCSSN()
/*     */   {
/* 382 */     return this.fieldALCSSN.getString();
/*     */   }
/*     */ 
/*     */   public String getALCTYP()
/*     */   {
/* 389 */     return this.fieldALCTYP.getString();
/*     */   }
/*     */ 
/*     */   public String getALCUPY()
/*     */   {
/* 396 */     return this.fieldALCUPY.getString();
/*     */   }
/*     */ 
/*     */   public String getALCUSER()
/*     */   {
/* 403 */     return this.fieldALCUSER.getString();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalALCACC()
/*     */   {
/* 410 */     return this.fieldALCACC.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalALCAMT()
/*     */   {
/* 417 */     return this.fieldALCAMT.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalALCCAC()
/*     */   {
/* 424 */     return this.fieldALCCAC.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalALCHDT1()
/*     */   {
/* 431 */     return this.fieldALCHDT1.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalALCHDT2()
/*     */   {
/* 438 */     return this.fieldALCHDT2.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalALCHDT3()
/*     */   {
/* 445 */     return this.fieldALCHDT3.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalALCHPN()
/*     */   {
/* 452 */     return this.fieldALCHPN.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalALCLVY()
/*     */   {
/* 459 */     return this.fieldALCLVY.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalALCMPY()
/*     */   {
/* 466 */     return this.fieldALCMPY.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalALCPHN()
/*     */   {
/* 473 */     return this.fieldALCPHN.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalALCRPY()
/*     */   {
/* 480 */     return this.fieldALCRPY.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalALCSSN()
/*     */   {
/* 487 */     return this.fieldALCSSN.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalALCUPY()
/*     */   {
/* 494 */     return this.fieldALCUPY.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setALCACC(String newvalue)
/*     */   {
/* 501 */     this.fieldALCACC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setALCACC(BigDecimal newvalue)
/*     */   {
/* 508 */     this.fieldALCACC.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setALCAD1(String newvalue)
/*     */   {
/* 515 */     this.fieldALCAD1.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setALCAD2(String newvalue)
/*     */   {
/* 522 */     this.fieldALCAD2.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setALCAD3(String newvalue)
/*     */   {
/* 529 */     this.fieldALCAD3.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setALCAEML(String newvalue)
/*     */   {
/* 536 */     this.fieldALCAEML.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setALCAMT(String newvalue)
/*     */   {
/* 543 */     this.fieldALCAMT.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setALCAMT(BigDecimal newvalue)
/*     */   {
/* 550 */     this.fieldALCAMT.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setALCBKR(String newvalue)
/*     */   {
/* 557 */     this.fieldALCBKR.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setALCCAC(String newvalue)
/*     */   {
/* 564 */     this.fieldALCCAC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setALCCAC(BigDecimal newvalue)
/*     */   {
/* 571 */     this.fieldALCCAC.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setALCCAD1(String newvalue)
/*     */   {
/* 578 */     this.fieldALCCAD1.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setALCCAD2(String newvalue)
/*     */   {
/* 585 */     this.fieldALCCAD2.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setALCCAD3(String newvalue)
/*     */   {
/* 592 */     this.fieldALCCAD3.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setALCCEML(String newvalue)
/*     */   {
/* 599 */     this.fieldALCCEML.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setALCEMP(String newvalue)
/*     */   {
/* 606 */     this.fieldALCEMP.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setALCHDT1(String newvalue)
/*     */   {
/* 613 */     this.fieldALCHDT1.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setALCHDT1(BigDecimal newvalue)
/*     */   {
/* 620 */     this.fieldALCHDT1.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setALCHDT2(String newvalue)
/*     */   {
/* 627 */     this.fieldALCHDT2.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setALCHDT2(BigDecimal newvalue)
/*     */   {
/* 634 */     this.fieldALCHDT2.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setALCHDT3(String newvalue)
/*     */   {
/* 641 */     this.fieldALCHDT3.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setALCHDT3(BigDecimal newvalue)
/*     */   {
/* 648 */     this.fieldALCHDT3.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setALCHPN(String newvalue)
/*     */   {
/* 655 */     this.fieldALCHPN.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setALCHPN(BigDecimal newvalue)
/*     */   {
/* 662 */     this.fieldALCHPN.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setALCJBT(String newvalue)
/*     */   {
/* 669 */     this.fieldALCJBT.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setALCLNP(String newvalue)
/*     */   {
/* 676 */     this.fieldALCLNP.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setALCLVY(String newvalue)
/*     */   {
/* 683 */     this.fieldALCLVY.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setALCLVY(BigDecimal newvalue)
/*     */   {
/* 690 */     this.fieldALCLVY.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setALCMMN(String newvalue)
/*     */   {
/* 697 */     this.fieldALCMMN.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setALCMPY(String newvalue)
/*     */   {
/* 704 */     this.fieldALCMPY.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setALCMPY(BigDecimal newvalue)
/*     */   {
/* 711 */     this.fieldALCMPY.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setALCOWP(String newvalue)
/*     */   {
/* 718 */     this.fieldALCOWP.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setALCPHN(String newvalue)
/*     */   {
/* 725 */     this.fieldALCPHN.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setALCPHN(BigDecimal newvalue)
/*     */   {
/* 732 */     this.fieldALCPHN.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setALCPLN(String newvalue)
/*     */   {
/* 739 */     this.fieldALCPLN.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setALCRPY(String newvalue)
/*     */   {
/* 746 */     this.fieldALCRPY.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setALCRPY(BigDecimal newvalue)
/*     */   {
/* 753 */     this.fieldALCRPY.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setALCSSN(String newvalue)
/*     */   {
/* 760 */     this.fieldALCSSN.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setALCSSN(BigDecimal newvalue)
/*     */   {
/* 767 */     this.fieldALCSSN.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setALCTYP(String newvalue)
/*     */   {
/* 774 */     this.fieldALCTYP.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setALCUPY(String newvalue)
/*     */   {
/* 781 */     this.fieldALCUPY.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setALCUPY(BigDecimal newvalue)
/*     */   {
/* 788 */     this.fieldALCUPY.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setALCUSER(String newvalue)
/*     */   {
/* 795 */     this.fieldALCUSER.setString(newvalue);
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.ALCDSJVMessage
 * JD-Core Version:    0.6.0
 */