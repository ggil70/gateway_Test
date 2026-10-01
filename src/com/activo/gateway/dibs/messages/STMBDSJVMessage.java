/*     */ package com.activo.gateway.dibs.messages;
/*     */ 
/*     */ import java.math.BigDecimal;
import java.util.Hashtable;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*     */ 
/*     */ public class STMBDSJVMessage extends MessageRecord
/*     */ {
/* 775 */   static final String[] fldnames = { 
/* 776 */     "STBUSR", "STBACC", "STBCUN", "STBNA1", "STBCCY", "STBATY", "STBPRO", "STBOFC", "STBMGB", "STBUNC", 
/* 777 */     "STBMNB", "STBHOL", "STBAVL", "STBGAV", "STBNAV", "STBCLI", "STBOIA", "STBIAC", "STBTM1", "STBTM2", 
/* 778 */     "STBTM3", "STBMA1", "STBMA2", "STBMA3", "STBMA4", "STBCTY", "STBCTR", "STBSTE", "STBZPC", "STBPOB", 
/* 779 */     "STBIAD", "STBFAX", "STBMLC", "STBNX1", "STBNX2", "STBNX3", "STBLP1", "STBLP2", "STBLP3", "STBMIP", 
/* 780 */     "STBLSP" };
/*     */ 
/* 782 */   static final String[] tnames = { 
/* 783 */     "STBUSR", "STBACC", "STBCUN", "STBNA1", "STBCCY", "STBATY", "STBPRO", "STBOFC", "STBMGB", "STBUNC", 
/* 784 */     "STBMNB", "STBHOL", "STBAVL", "STBGAV", "STBNAV", "STBCLI", "STBOIA", "STBIAC", "STBTM1", "STBTM2", 
/* 785 */     "STBTM3", "STBMA1", "STBMA2", "STBMA3", "STBMA4", "STBCTY", "STBCTR", "STBSTE", "STBZPC", "STBPOB", 
/* 786 */     "STBIAD", "STBFAX", "STBMLC", "STBNX1", "STBNX2", "STBNX3", "STBLP1", "STBLP2", "STBLP3", "STBMIP", 
/* 787 */     "STBLSP" };
/*     */   static final String fid = "1020621183929";
/*     */   static final String rid = "2D5351D2B24FD";
/*     */   static final String fmtname = "STMBDSJV";
/* 792 */   final int FIELDCOUNT = 41;
/* 793 */   private static Hashtable tlookup = new Hashtable();
/*     */   private CharacterField fieldSTBUSR;
/*     */   private DecimalField fieldSTBACC;
/*     */   private DecimalField fieldSTBCUN;
/*     */   private CharacterField fieldSTBNA1;
/*     */   private CharacterField fieldSTBCCY;
/*     */   private CharacterField fieldSTBATY;
/*     */   private CharacterField fieldSTBPRO;
/*     */   private CharacterField fieldSTBOFC;
/*     */   private DecimalField fieldSTBMGB;
/*     */   private DecimalField fieldSTBUNC;
/*     */   private DecimalField fieldSTBMNB;
/*     */   private DecimalField fieldSTBHOL;
/*     */   private DecimalField fieldSTBAVL;
/*     */   private DecimalField fieldSTBGAV;
/*     */   private DecimalField fieldSTBNAV;
/*     */   private DecimalField fieldSTBCLI;
/*     */   private DecimalField fieldSTBOIA;
/*     */   private DecimalField fieldSTBIAC;
/*     */   private DecimalField fieldSTBTM1;
/*     */   private DecimalField fieldSTBTM2;
/*     */   private DecimalField fieldSTBTM3;
/*     */   private CharacterField fieldSTBMA1;
/*     */   private CharacterField fieldSTBMA2;
/*     */   private CharacterField fieldSTBMA3;
/*     */   private CharacterField fieldSTBMA4;
/*     */   private CharacterField fieldSTBCTY;
/*     */   private CharacterField fieldSTBCTR;
/*     */   private CharacterField fieldSTBSTE;
/*     */   private CharacterField fieldSTBZPC;
/*     */   private CharacterField fieldSTBPOB;
/*     */   private CharacterField fieldSTBIAD;
/*     */   private DecimalField fieldSTBFAX;
/*     */   private CharacterField fieldSTBMLC;
/*     */   private DecimalField fieldSTBNX1;
/*     */   private DecimalField fieldSTBNX2;
/*     */   private DecimalField fieldSTBNX3;
/*     */   private DecimalField fieldSTBLP1;
/*     */   private DecimalField fieldSTBLP2;
/*     */   private DecimalField fieldSTBLP3;
/*     */   private DecimalField fieldSTBMIP;
/*     */   private DecimalField fieldSTBLSP;
/*     */ 
/*     */   public STMBDSJVMessage()
/*     */   {
/*  17 */     this.fieldSTBUSR = null;
/*  18 */     this.fieldSTBACC = null;
/*  19 */     this.fieldSTBCUN = null;
/*  20 */     this.fieldSTBNA1 = null;
/*  21 */     this.fieldSTBCCY = null;
/*  22 */     this.fieldSTBATY = null;
/*  23 */     this.fieldSTBPRO = null;
/*  24 */     this.fieldSTBOFC = null;
/*  25 */     this.fieldSTBMGB = null;
/*  26 */     this.fieldSTBUNC = null;
/*  27 */     this.fieldSTBMNB = null;
/*  28 */     this.fieldSTBHOL = null;
/*  29 */     this.fieldSTBAVL = null;
/*  30 */     this.fieldSTBGAV = null;
/*  31 */     this.fieldSTBNAV = null;
/*  32 */     this.fieldSTBCLI = null;
/*  33 */     this.fieldSTBOIA = null;
/*  34 */     this.fieldSTBIAC = null;
/*  35 */     this.fieldSTBTM1 = null;
/*  36 */     this.fieldSTBTM2 = null;
/*  37 */     this.fieldSTBTM3 = null;
/*  38 */     this.fieldSTBMA1 = null;
/*  39 */     this.fieldSTBMA2 = null;
/*  40 */     this.fieldSTBMA3 = null;
/*  41 */     this.fieldSTBMA4 = null;
/*  42 */     this.fieldSTBCTY = null;
/*  43 */     this.fieldSTBCTR = null;
/*  44 */     this.fieldSTBSTE = null;
/*  45 */     this.fieldSTBZPC = null;
/*  46 */     this.fieldSTBPOB = null;
/*  47 */     this.fieldSTBIAD = null;
/*  48 */     this.fieldSTBFAX = null;
/*  49 */     this.fieldSTBMLC = null;
/*  50 */     this.fieldSTBNX1 = null;
/*  51 */     this.fieldSTBNX2 = null;
/*  52 */     this.fieldSTBNX3 = null;
/*  53 */     this.fieldSTBLP1 = null;
/*  54 */     this.fieldSTBLP2 = null;
/*  55 */     this.fieldSTBLP3 = null;
/*  56 */     this.fieldSTBMIP = null;
/*  57 */     this.fieldSTBLSP = null;
/*  58 */     createFields();
/*  59 */     initialize();
/*     */   }
/*     */ 
/*     */   protected void createFields()
/*     */   {
/*  64 */     this.recordsize = 731;
/*  65 */     this.fileid = "1020621183929";
/*  66 */     this.recordid = "2D5351D2B24FD";
/*  67 */     this.message = new byte[getByteLength()];
/*  68 */     this.formatname = "STMBDSJV";
/*  69 */     this.fieldnames = fldnames;
/*  70 */     this.tagnames = tnames;
/*  71 */     this.fields = new MessageField[41];
/*     */      this.fields[0]=this.fieldSTBUSR=new CharacterField(this.message, 10, 10, "STBUSR");
/*     */      this.fields[1]=this.fieldSTBACC=new DecimalField(this.message, 20, 13, 0, "STBACC");
/*     */      this.fields[2]=this.fieldSTBCUN=new DecimalField(this.message, 33, 10, 0, "STBCUN");
/*     */      this.fields[3]=this.fieldSTBNA1=new CharacterField(this.message, 43, 45, "STBNA1");
/*     */      this.fields[4]=this.fieldSTBCCY=new CharacterField(this.message, 88, 3, "STBCCY");
/*     */      this.fields[5]=this.fieldSTBATY=new CharacterField(this.message, 91, 35, "STBATY");
/*     */      this.fields[6]=this.fieldSTBPRO=new CharacterField(this.message, 126, 35, "STBPRO");
/*     */      this.fields[7]=this.fieldSTBOFC=new CharacterField(this.message, 161, 35, "STBOFC");
/*     */      this.fields[8]=this.fieldSTBMGB=new DecimalField(this.message, 196, 17, 2, "STBMGB");
/*     */      this.fields[9]=this.fieldSTBUNC=new DecimalField(this.message, 213, 17, 2, "STBUNC");
/*     */      this.fields[10]=this.fieldSTBMNB=new DecimalField(this.message, 230, 17, 2, "STBMNB");
/*     */      this.fields[11]=this.fieldSTBHOL=new DecimalField(this.message, 247, 17, 2, "STBHOL");
/*     */      this.fields[12]=this.fieldSTBAVL=new DecimalField(this.message, 264, 17, 2, "STBAVL");
/*     */      this.fields[13]=this.fieldSTBGAV=new DecimalField(this.message, 281, 19, 2, "STBGAV");
/*     */      this.fields[14]=this.fieldSTBNAV=new DecimalField(this.message, 300, 19, 2, "STBNAV");
/*     */      this.fields[15]=this.fieldSTBCLI=new DecimalField(this.message, 319, 12, 0, "STBCLI");
/*     */      this.fields[16]=this.fieldSTBOIA=new DecimalField(this.message, 331, 17, 4, "STBOIA");
/*     */      this.fields[17]=this.fieldSTBIAC=new DecimalField(this.message, 348, 17, 4, "STBIAC");
/*     */      this.fields[18]=this.fieldSTBTM1=new DecimalField(this.message, 365, 3, 0, "STBTM1");
/*     */      this.fields[19]=this.fieldSTBTM2=new DecimalField(this.message, 368, 3, 0, "STBTM2");
/*     */      this.fields[20]=this.fieldSTBTM3=new DecimalField(this.message, 371, 3, 0, "STBTM3");
/*     */      this.fields[21]=this.fieldSTBMA1=new CharacterField(this.message, 374, 45, "STBMA1");
/*     */      this.fields[22]=this.fieldSTBMA2=new CharacterField(this.message, 419, 45, "STBMA2");
/*     */      this.fields[23]=this.fieldSTBMA3=new CharacterField(this.message, 464, 45, "STBMA3");
/*     */      this.fields[24]=this.fieldSTBMA4=new CharacterField(this.message, 509, 45, "STBMA4");
/*     */      this.fields[25]=this.fieldSTBCTY=new CharacterField(this.message, 554, 30, "STBCTY");
/*     */      this.fields[26]=this.fieldSTBCTR=new CharacterField(this.message, 584, 20, "STBCTR");
/*     */      this.fields[27]=this.fieldSTBSTE=new CharacterField(this.message, 604, 4, "STBSTE");
/*     */      this.fields[28]=this.fieldSTBZPC=new CharacterField(this.message, 608, 15, "STBZPC");
/*     */      this.fields[29]=this.fieldSTBPOB=new CharacterField(this.message, 623, 10, "STBPOB");
/*     */      this.fields[30]=this.fieldSTBIAD=new CharacterField(this.message, 633, 40, "STBIAD");
/*     */      this.fields[31]=this.fieldSTBFAX=new DecimalField(this.message, 673, 12, 0, "STBFAX");
/*     */      this.fields[32]=this.fieldSTBMLC=new CharacterField(this.message, 685, 4, "STBMLC");
/*     */      this.fields[33]=this.fieldSTBNX1=new DecimalField(this.message, 689, 3, 0, "STBNX1");
/*     */      this.fields[34]=this.fieldSTBNX2=new DecimalField(this.message, 692, 3, 0, "STBNX2");
/*     */      this.fields[35]=this.fieldSTBNX3=new DecimalField(this.message, 695, 3, 0, "STBNX3");
/*     */      this.fields[36]=this.fieldSTBLP1=new DecimalField(this.message, 698, 3, 0, "STBLP1");
/*     */      this.fields[37]=this.fieldSTBLP2=new DecimalField(this.message, 701, 3, 0, "STBLP2");
/*     */      this.fields[38]=this.fieldSTBLP3=new DecimalField(this.message, 704, 3, 0, "STBLP3");
/*     */      this.fields[39]=this.fieldSTBMIP=new DecimalField(this.message, 707, 17, 2, "STBMIP");
/*     */      this.fields[40]=this.fieldSTBLSP=new DecimalField(this.message, 724, 17, 2, "STBLSP");
/* 113 */     synchronized (tlookup)
/*     */     {
/* 115 */       if (tlookup.isEmpty())
/*     */       {
/* 117 */         for (int i = 0; i < tnames.length; i++) {
/* 118 */           tlookup.put(tnames[i], new Integer(i));
/*     */         }
/*     */       }
/*     */     }
/* 122 */     this.taglookup = tlookup;
/*     */   }
/*     */ 
/*     */   public void setSTBUSR(String newvalue)
/*     */   {
/* 127 */     this.fieldSTBUSR.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getSTBUSR()
/*     */   {
/* 132 */     return this.fieldSTBUSR.getString();
/*     */   }
/*     */ 
/*     */   public void setSTBACC(String newvalue)
/*     */   {
/* 137 */     this.fieldSTBACC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getSTBACC()
/*     */   {
/* 142 */     return this.fieldSTBACC.getString();
/*     */   }
/*     */ 
/*     */   public void setSTBACC(BigDecimal newvalue)
/*     */   {
/* 147 */     this.fieldSTBACC.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalSTBACC()
/*     */   {
/* 152 */     return this.fieldSTBACC.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setSTBCUN(String newvalue)
/*     */   {
/* 157 */     this.fieldSTBCUN.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getSTBCUN()
/*     */   {
/* 162 */     return this.fieldSTBCUN.getString();
/*     */   }
/*     */ 
/*     */   public void setSTBCUN(BigDecimal newvalue)
/*     */   {
/* 167 */     this.fieldSTBCUN.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalSTBCUN()
/*     */   {
/* 172 */     return this.fieldSTBCUN.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setSTBNA1(String newvalue)
/*     */   {
/* 177 */     this.fieldSTBNA1.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getSTBNA1()
/*     */   {
/* 182 */     return this.fieldSTBNA1.getString();
/*     */   }
/*     */ 
/*     */   public void setSTBCCY(String newvalue)
/*     */   {
/* 187 */     this.fieldSTBCCY.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getSTBCCY()
/*     */   {
/* 192 */     return this.fieldSTBCCY.getString();
/*     */   }
/*     */ 
/*     */   public void setSTBATY(String newvalue)
/*     */   {
/* 197 */     this.fieldSTBATY.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getSTBATY()
/*     */   {
/* 202 */     return this.fieldSTBATY.getString();
/*     */   }
/*     */ 
/*     */   public void setSTBPRO(String newvalue)
/*     */   {
/* 207 */     this.fieldSTBPRO.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getSTBPRO()
/*     */   {
/* 212 */     return this.fieldSTBPRO.getString();
/*     */   }
/*     */ 
/*     */   public void setSTBOFC(String newvalue)
/*     */   {
/* 217 */     this.fieldSTBOFC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getSTBOFC()
/*     */   {
/* 222 */     return this.fieldSTBOFC.getString();
/*     */   }
/*     */ 
/*     */   public void setSTBMGB(String newvalue)
/*     */   {
/* 227 */     this.fieldSTBMGB.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getSTBMGB()
/*     */   {
/* 232 */     return this.fieldSTBMGB.getString();
/*     */   }
/*     */ 
/*     */   public void setSTBMGB(BigDecimal newvalue)
/*     */   {
/* 237 */     this.fieldSTBMGB.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalSTBMGB()
/*     */   {
/* 242 */     return this.fieldSTBMGB.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setSTBUNC(String newvalue)
/*     */   {
/* 247 */     this.fieldSTBUNC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getSTBUNC()
/*     */   {
/* 252 */     return this.fieldSTBUNC.getString();
/*     */   }
/*     */ 
/*     */   public void setSTBUNC(BigDecimal newvalue)
/*     */   {
/* 257 */     this.fieldSTBUNC.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalSTBUNC()
/*     */   {
/* 262 */     return this.fieldSTBUNC.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setSTBMNB(String newvalue)
/*     */   {
/* 267 */     this.fieldSTBMNB.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getSTBMNB()
/*     */   {
/* 272 */     return this.fieldSTBMNB.getString();
/*     */   }
/*     */ 
/*     */   public void setSTBMNB(BigDecimal newvalue)
/*     */   {
/* 277 */     this.fieldSTBMNB.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalSTBMNB()
/*     */   {
/* 282 */     return this.fieldSTBMNB.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setSTBHOL(String newvalue)
/*     */   {
/* 287 */     this.fieldSTBHOL.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getSTBHOL()
/*     */   {
/* 292 */     return this.fieldSTBHOL.getString();
/*     */   }
/*     */ 
/*     */   public void setSTBHOL(BigDecimal newvalue)
/*     */   {
/* 297 */     this.fieldSTBHOL.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalSTBHOL()
/*     */   {
/* 302 */     return this.fieldSTBHOL.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setSTBAVL(String newvalue)
/*     */   {
/* 307 */     this.fieldSTBAVL.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getSTBAVL()
/*     */   {
/* 312 */     return this.fieldSTBAVL.getString();
/*     */   }
/*     */ 
/*     */   public void setSTBAVL(BigDecimal newvalue)
/*     */   {
/* 317 */     this.fieldSTBAVL.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalSTBAVL()
/*     */   {
/* 322 */     return this.fieldSTBAVL.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setSTBGAV(String newvalue)
/*     */   {
/* 327 */     this.fieldSTBGAV.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getSTBGAV()
/*     */   {
/* 332 */     return this.fieldSTBGAV.getString();
/*     */   }
/*     */ 
/*     */   public void setSTBGAV(BigDecimal newvalue)
/*     */   {
/* 337 */     this.fieldSTBGAV.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalSTBGAV()
/*     */   {
/* 342 */     return this.fieldSTBGAV.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setSTBNAV(String newvalue)
/*     */   {
/* 347 */     this.fieldSTBNAV.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getSTBNAV()
/*     */   {
/* 352 */     return this.fieldSTBNAV.getString();
/*     */   }
/*     */ 
/*     */   public void setSTBNAV(BigDecimal newvalue)
/*     */   {
/* 357 */     this.fieldSTBNAV.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalSTBNAV()
/*     */   {
/* 362 */     return this.fieldSTBNAV.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setSTBCLI(String newvalue)
/*     */   {
/* 367 */     this.fieldSTBCLI.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getSTBCLI()
/*     */   {
/* 372 */     return this.fieldSTBCLI.getString();
/*     */   }
/*     */ 
/*     */   public void setSTBCLI(BigDecimal newvalue)
/*     */   {
/* 377 */     this.fieldSTBCLI.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalSTBCLI()
/*     */   {
/* 382 */     return this.fieldSTBCLI.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setSTBOIA(String newvalue)
/*     */   {
/* 387 */     this.fieldSTBOIA.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getSTBOIA()
/*     */   {
/* 392 */     return this.fieldSTBOIA.getString();
/*     */   }
/*     */ 
/*     */   public void setSTBOIA(BigDecimal newvalue)
/*     */   {
/* 397 */     this.fieldSTBOIA.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalSTBOIA()
/*     */   {
/* 402 */     return this.fieldSTBOIA.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setSTBIAC(String newvalue)
/*     */   {
/* 407 */     this.fieldSTBIAC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getSTBIAC()
/*     */   {
/* 412 */     return this.fieldSTBIAC.getString();
/*     */   }
/*     */ 
/*     */   public void setSTBIAC(BigDecimal newvalue)
/*     */   {
/* 417 */     this.fieldSTBIAC.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalSTBIAC()
/*     */   {
/* 422 */     return this.fieldSTBIAC.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setSTBTM1(String newvalue)
/*     */   {
/* 427 */     this.fieldSTBTM1.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getSTBTM1()
/*     */   {
/* 432 */     return this.fieldSTBTM1.getString();
/*     */   }
/*     */ 
/*     */   public void setSTBTM1(BigDecimal newvalue)
/*     */   {
/* 437 */     this.fieldSTBTM1.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalSTBTM1()
/*     */   {
/* 442 */     return this.fieldSTBTM1.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setSTBTM2(String newvalue)
/*     */   {
/* 447 */     this.fieldSTBTM2.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getSTBTM2()
/*     */   {
/* 452 */     return this.fieldSTBTM2.getString();
/*     */   }
/*     */ 
/*     */   public void setSTBTM2(BigDecimal newvalue)
/*     */   {
/* 457 */     this.fieldSTBTM2.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalSTBTM2()
/*     */   {
/* 462 */     return this.fieldSTBTM2.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setSTBTM3(String newvalue)
/*     */   {
/* 467 */     this.fieldSTBTM3.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getSTBTM3()
/*     */   {
/* 472 */     return this.fieldSTBTM3.getString();
/*     */   }
/*     */ 
/*     */   public void setSTBTM3(BigDecimal newvalue)
/*     */   {
/* 477 */     this.fieldSTBTM3.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalSTBTM3()
/*     */   {
/* 482 */     return this.fieldSTBTM3.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setSTBMA1(String newvalue)
/*     */   {
/* 487 */     this.fieldSTBMA1.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getSTBMA1()
/*     */   {
/* 492 */     return this.fieldSTBMA1.getString();
/*     */   }
/*     */ 
/*     */   public void setSTBMA2(String newvalue)
/*     */   {
/* 497 */     this.fieldSTBMA2.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getSTBMA2()
/*     */   {
/* 502 */     return this.fieldSTBMA2.getString();
/*     */   }
/*     */ 
/*     */   public void setSTBMA3(String newvalue)
/*     */   {
/* 507 */     this.fieldSTBMA3.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getSTBMA3()
/*     */   {
/* 512 */     return this.fieldSTBMA3.getString();
/*     */   }
/*     */ 
/*     */   public void setSTBMA4(String newvalue)
/*     */   {
/* 517 */     this.fieldSTBMA4.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getSTBMA4()
/*     */   {
/* 522 */     return this.fieldSTBMA4.getString();
/*     */   }
/*     */ 
/*     */   public void setSTBCTY(String newvalue)
/*     */   {
/* 527 */     this.fieldSTBCTY.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getSTBCTY()
/*     */   {
/* 532 */     return this.fieldSTBCTY.getString();
/*     */   }
/*     */ 
/*     */   public void setSTBCTR(String newvalue)
/*     */   {
/* 537 */     this.fieldSTBCTR.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getSTBCTR()
/*     */   {
/* 542 */     return this.fieldSTBCTR.getString();
/*     */   }
/*     */ 
/*     */   public void setSTBSTE(String newvalue)
/*     */   {
/* 547 */     this.fieldSTBSTE.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getSTBSTE()
/*     */   {
/* 552 */     return this.fieldSTBSTE.getString();
/*     */   }
/*     */ 
/*     */   public void setSTBZPC(String newvalue)
/*     */   {
/* 557 */     this.fieldSTBZPC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getSTBZPC()
/*     */   {
/* 562 */     return this.fieldSTBZPC.getString();
/*     */   }
/*     */ 
/*     */   public void setSTBPOB(String newvalue)
/*     */   {
/* 567 */     this.fieldSTBPOB.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getSTBPOB()
/*     */   {
/* 572 */     return this.fieldSTBPOB.getString();
/*     */   }
/*     */ 
/*     */   public void setSTBIAD(String newvalue)
/*     */   {
/* 577 */     this.fieldSTBIAD.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getSTBIAD()
/*     */   {
/* 582 */     return this.fieldSTBIAD.getString();
/*     */   }
/*     */ 
/*     */   public void setSTBFAX(String newvalue)
/*     */   {
/* 587 */     this.fieldSTBFAX.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getSTBFAX()
/*     */   {
/* 592 */     return this.fieldSTBFAX.getString();
/*     */   }
/*     */ 
/*     */   public void setSTBFAX(BigDecimal newvalue)
/*     */   {
/* 597 */     this.fieldSTBFAX.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalSTBFAX()
/*     */   {
/* 602 */     return this.fieldSTBFAX.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setSTBMLC(String newvalue)
/*     */   {
/* 607 */     this.fieldSTBMLC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getSTBMLC()
/*     */   {
/* 612 */     return this.fieldSTBMLC.getString();
/*     */   }
/*     */ 
/*     */   public void setSTBNX1(String newvalue)
/*     */   {
/* 617 */     this.fieldSTBNX1.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getSTBNX1()
/*     */   {
/* 622 */     return this.fieldSTBNX1.getString();
/*     */   }
/*     */ 
/*     */   public void setSTBNX1(BigDecimal newvalue)
/*     */   {
/* 627 */     this.fieldSTBNX1.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalSTBNX1()
/*     */   {
/* 632 */     return this.fieldSTBNX1.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setSTBNX2(String newvalue)
/*     */   {
/* 637 */     this.fieldSTBNX2.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getSTBNX2()
/*     */   {
/* 642 */     return this.fieldSTBNX2.getString();
/*     */   }
/*     */ 
/*     */   public void setSTBNX2(BigDecimal newvalue)
/*     */   {
/* 647 */     this.fieldSTBNX2.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalSTBNX2()
/*     */   {
/* 652 */     return this.fieldSTBNX2.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setSTBNX3(String newvalue)
/*     */   {
/* 657 */     this.fieldSTBNX3.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getSTBNX3()
/*     */   {
/* 662 */     return this.fieldSTBNX3.getString();
/*     */   }
/*     */ 
/*     */   public void setSTBNX3(BigDecimal newvalue)
/*     */   {
/* 667 */     this.fieldSTBNX3.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalSTBNX3()
/*     */   {
/* 672 */     return this.fieldSTBNX3.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setSTBLP1(String newvalue)
/*     */   {
/* 677 */     this.fieldSTBLP1.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getSTBLP1()
/*     */   {
/* 682 */     return this.fieldSTBLP1.getString();
/*     */   }
/*     */ 
/*     */   public void setSTBLP1(BigDecimal newvalue)
/*     */   {
/* 687 */     this.fieldSTBLP1.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalSTBLP1()
/*     */   {
/* 692 */     return this.fieldSTBLP1.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setSTBLP2(String newvalue)
/*     */   {
/* 697 */     this.fieldSTBLP2.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getSTBLP2()
/*     */   {
/* 702 */     return this.fieldSTBLP2.getString();
/*     */   }
/*     */ 
/*     */   public void setSTBLP2(BigDecimal newvalue)
/*     */   {
/* 707 */     this.fieldSTBLP2.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalSTBLP2()
/*     */   {
/* 712 */     return this.fieldSTBLP2.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setSTBLP3(String newvalue)
/*     */   {
/* 717 */     this.fieldSTBLP3.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getSTBLP3()
/*     */   {
/* 722 */     return this.fieldSTBLP3.getString();
/*     */   }
/*     */ 
/*     */   public void setSTBLP3(BigDecimal newvalue)
/*     */   {
/* 727 */     this.fieldSTBLP3.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalSTBLP3()
/*     */   {
/* 732 */     return this.fieldSTBLP3.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setSTBMIP(String newvalue)
/*     */   {
/* 737 */     this.fieldSTBMIP.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getSTBMIP()
/*     */   {
/* 742 */     return this.fieldSTBMIP.getString();
/*     */   }
/*     */ 
/*     */   public void setSTBMIP(BigDecimal newvalue)
/*     */   {
/* 747 */     this.fieldSTBMIP.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalSTBMIP()
/*     */   {
/* 752 */     return this.fieldSTBMIP.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setSTBLSP(String newvalue)
/*     */   {
/* 757 */     this.fieldSTBLSP.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getSTBLSP()
/*     */   {
/* 762 */     return this.fieldSTBLSP.getString();
/*     */   }
/*     */ 
/*     */   public void setSTBLSP(BigDecimal newvalue)
/*     */   {
/* 767 */     this.fieldSTBLSP.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalSTBLSP()
/*     */   {
/* 772 */     return this.fieldSTBLSP.getBigDecimal();
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.STMBDSJVMessage
 * JD-Core Version:    0.6.0
 */