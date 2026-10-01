/*     */ package com.activo.gateway.dibs.messages;
/*     */ 
/*     */ import java.math.BigDecimal;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*     */ 
/*     */ public class PWDCDSJVMessage extends MessageRecord
/*     */ {
/*  19 */   final int FIELDCOUNT = 18;
/*  20 */   private CharacterField fieldPWDCCMP = null;
/*  21 */   private CharacterField fieldPWDCUSR = null;
/*  22 */   private CharacterField fieldPWDCPWD = null;
/*  23 */   private CharacterField fieldPWDCNPW = null;
/*  24 */   private CharacterField fieldPWDCCPW = null;
/*  25 */   private CharacterField fieldPWDCNCH = null;
/*  26 */   private CharacterField fieldPWDCSTS = null;
/*  27 */   private CharacterField fieldPWDCOPR = null;
/*  28 */   private CharacterField fieldPWDCCFM = null;
/*  29 */   private CharacterField fieldPWDCTRA = null;
/*  30 */   private CharacterField fieldPWDCBPA = null;
/*  31 */   private CharacterField fieldPWDCLCA = null;
/*  32 */   private CharacterField fieldPWDCLNP = null;
/*  33 */   private CharacterField fieldPWDCCCP = null;
/*  34 */   private DecimalField fieldPWDCMAX = null;
/*  35 */   private CharacterField fieldPWDCDTF = null;
/*  36 */   private CharacterField fieldPWDCLGT = null;
/*  37 */   private CharacterField fieldPWDCACL = null;
/*     */ 
/*     */   public PWDCDSJVMessage()
/*     */   {
/*  44 */     createFields();
/*  45 */     initialize();
/*     */   }
/*     */ 
/*     */   protected void createFields()
/*     */   {
/*  54 */     this.recordsize = 79;
/*  55 */     this.fileid = "1020531175241";
/*  56 */     this.recordid = "439A39549D973";
/*  57 */     this.message = new byte[getByteLength()];
/*  58 */     this.formatname = "PWDCDSJV";
/*  59 */     this.fieldnames = new String[18];
/*  60 */     this.tagnames = new String[18];
/*  61 */     this.fields = new MessageField[18];
/*     */ 
/*  63 */     this.fieldnames[0] = "PWDCCMP";
/*  64 */     this.tagnames[0] = "PWDCCMP";
/*     */      this.fields[0]=this.fieldPWDCCMP=new CharacterField(this.message, 10, 10, "PWDCCMP");
/*     */ 
/*  67 */     this.fieldnames[1] = "PWDCUSR";
/*  68 */     this.tagnames[1] = "PWDCUSR";
/*     */      this.fields[1]=this.fieldPWDCUSR=new CharacterField(this.message, 20, 10, "PWDCUSR");
/*     */ 
/*  71 */     this.fieldnames[2] = "PWDCPWD";
/*  72 */     this.tagnames[2] = "PWDCPWD";
/*     */      this.fields[2]=this.fieldPWDCPWD=new CharacterField(this.message, 30, 10, "PWDCPWD");
/*     */ 
/*  75 */     this.fieldnames[3] = "PWDCNPW";
/*  76 */     this.tagnames[3] = "PWDCNPW";
/*     */      this.fields[3]=this.fieldPWDCNPW=new CharacterField(this.message, 40, 10, "PWDCNPW");
/*     */ 
/*  79 */     this.fieldnames[4] = "PWDCCPW";
/*  80 */     this.tagnames[4] = "PWDCCPW";
/*     */      this.fields[4]=this.fieldPWDCCPW=new CharacterField(this.message, 50, 10, "PWDCCPW");
/*     */ 
/*  83 */     this.fieldnames[5] = "PWDCNCH";
/*  84 */     this.tagnames[5] = "PWDCNCH";
/*     */      this.fields[5]=this.fieldPWDCNCH=new CharacterField(this.message, 60, 2, "PWDCNCH");
/*     */ 
/*  87 */     this.fieldnames[6] = "PWDCSTS";
/*  88 */     this.tagnames[6] = "PWDCSTS";
/*     */      this.fields[6]=this.fieldPWDCSTS=new CharacterField(this.message, 62, 1, "PWDCSTS");
/*     */ 
/*  91 */     this.fieldnames[7] = "PWDCOPR";
/*  92 */     this.tagnames[7] = "PWDCOPR";
/*     */      this.fields[7]=this.fieldPWDCOPR=new CharacterField(this.message, 63, 1, "PWDCOPR");
/*     */ 
/*  95 */     this.fieldnames[8] = "PWDCCFM";
/*  96 */     this.tagnames[8] = "PWDCCFM";
/*     */      this.fields[8]=this.fieldPWDCCFM=new CharacterField(this.message, 64, 1, "PWDCCFM");
/*     */ 
/*  99 */     this.fieldnames[9] = "PWDCTRA";
/* 100 */     this.tagnames[9] = "PWDCTRA";
/*     */      this.fields[9]=this.fieldPWDCTRA=new CharacterField(this.message, 65, 1, "PWDCTRA");
/*     */ 
/* 103 */     this.fieldnames[10] = "PWDCBPA";
/* 104 */     this.tagnames[10] = "PWDCBPA";
/*     */      this.fields[10]=this.fieldPWDCBPA=new CharacterField(this.message, 66, 1, "PWDCBPA");
/*     */ 
/* 107 */     this.fieldnames[11] = "PWDCLCA";
/* 108 */     this.tagnames[11] = "PWDCLCA";
/*     */      this.fields[11]=this.fieldPWDCLCA=new CharacterField(this.message, 67, 1, "PWDCLCA");
/*     */ 
/* 111 */     this.fieldnames[12] = "PWDCLNP";
/* 112 */     this.tagnames[12] = "PWDCLNP";
/*     */      this.fields[12]=this.fieldPWDCLNP=new CharacterField(this.message, 68, 1, "PWDCLNP");
/*     */ 
/* 115 */     this.fieldnames[13] = "PWDCCCP";
/* 116 */     this.tagnames[13] = "PWDCCCP";
/*     */      this.fields[13]=this.fieldPWDCCCP=new CharacterField(this.message, 69, 1, "PWDCCCP");
/*     */ 
/* 119 */     this.fieldnames[14] = "PWDCMAX";
/* 120 */     this.tagnames[14] = "PWDCMAX";
/*     */      this.fields[14]=this.fieldPWDCMAX=new DecimalField(this.message, 70, 15, 2, "PWDCMAX");
/*     */ 
/* 123 */     this.fieldnames[15] = "PWDCDTF";
/* 124 */     this.tagnames[15] = "PWDCDTF";
/*     */      this.fields[15]=this.fieldPWDCDTF=new CharacterField(this.message, 85, 1, "PWDCDTF");
/*     */ 
/* 127 */     this.fieldnames[16] = "PWDCLGT";
/* 128 */     this.tagnames[16] = "PWDCLGT";
/*     */      this.fields[16]=this.fieldPWDCLGT=new CharacterField(this.message, 86, 1, "PWDCLGT");
/*     */ 
/* 131 */     this.fieldnames[17] = "PWDCACL";
/* 132 */     this.tagnames[17] = "PWDCACL";
/*     */      this.fields[17]=this.fieldPWDCACL=new CharacterField(this.message, 87, 2, "PWDCACL");
/*     */   }
/*     */ 
/*     */   public void setPWDCCMP(String newvalue)
/*     */   {
/* 142 */     this.fieldPWDCCMP.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getPWDCCMP()
/*     */   {
/* 150 */     return this.fieldPWDCCMP.getString();
/*     */   }
/*     */ 
/*     */   public void setPWDCUSR(String newvalue)
/*     */   {
/* 158 */     this.fieldPWDCUSR.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getPWDCUSR()
/*     */   {
/* 166 */     return this.fieldPWDCUSR.getString();
/*     */   }
/*     */ 
/*     */   public void setPWDCPWD(String newvalue)
/*     */   {
/* 174 */     this.fieldPWDCPWD.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getPWDCPWD()
/*     */   {
/* 182 */     return this.fieldPWDCPWD.getString();
/*     */   }
/*     */ 
/*     */   public void setPWDCNPW(String newvalue)
/*     */   {
/* 190 */     this.fieldPWDCNPW.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getPWDCNPW()
/*     */   {
/* 198 */     return this.fieldPWDCNPW.getString();
/*     */   }
/*     */ 
/*     */   public void setPWDCCPW(String newvalue)
/*     */   {
/* 206 */     this.fieldPWDCCPW.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getPWDCCPW()
/*     */   {
/* 214 */     return this.fieldPWDCCPW.getString();
/*     */   }
/*     */ 
/*     */   public void setPWDCNCH(String newvalue)
/*     */   {
/* 222 */     this.fieldPWDCNCH.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getPWDCNCH()
/*     */   {
/* 230 */     return this.fieldPWDCNCH.getString();
/*     */   }
/*     */ 
/*     */   public void setPWDCSTS(String newvalue)
/*     */   {
/* 238 */     this.fieldPWDCSTS.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getPWDCSTS()
/*     */   {
/* 246 */     return this.fieldPWDCSTS.getString();
/*     */   }
/*     */ 
/*     */   public void setPWDCOPR(String newvalue)
/*     */   {
/* 254 */     this.fieldPWDCOPR.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getPWDCOPR()
/*     */   {
/* 262 */     return this.fieldPWDCOPR.getString();
/*     */   }
/*     */ 
/*     */   public void setPWDCCFM(String newvalue)
/*     */   {
/* 270 */     this.fieldPWDCCFM.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getPWDCCFM()
/*     */   {
/* 278 */     return this.fieldPWDCCFM.getString();
/*     */   }
/*     */ 
/*     */   public void setPWDCTRA(String newvalue)
/*     */   {
/* 286 */     this.fieldPWDCTRA.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getPWDCTRA()
/*     */   {
/* 294 */     return this.fieldPWDCTRA.getString();
/*     */   }
/*     */ 
/*     */   public void setPWDCBPA(String newvalue)
/*     */   {
/* 302 */     this.fieldPWDCBPA.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getPWDCBPA()
/*     */   {
/* 310 */     return this.fieldPWDCBPA.getString();
/*     */   }
/*     */ 
/*     */   public void setPWDCLCA(String newvalue)
/*     */   {
/* 318 */     this.fieldPWDCLCA.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getPWDCLCA()
/*     */   {
/* 326 */     return this.fieldPWDCLCA.getString();
/*     */   }
/*     */ 
/*     */   public void setPWDCLNP(String newvalue)
/*     */   {
/* 334 */     this.fieldPWDCLNP.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getPWDCLNP()
/*     */   {
/* 342 */     return this.fieldPWDCLNP.getString();
/*     */   }
/*     */ 
/*     */   public void setPWDCCCP(String newvalue)
/*     */   {
/* 350 */     this.fieldPWDCCCP.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getPWDCCCP()
/*     */   {
/* 358 */     return this.fieldPWDCCCP.getString();
/*     */   }
/*     */ 
/*     */   public void setPWDCMAX(String newvalue)
/*     */   {
/* 366 */     this.fieldPWDCMAX.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getPWDCMAX()
/*     */   {
/* 374 */     return this.fieldPWDCMAX.getString();
/*     */   }
/*     */ 
/*     */   public void setPWDCMAX(BigDecimal newvalue)
/*     */   {
/* 382 */     this.fieldPWDCMAX.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalPWDCMAX()
/*     */   {
/* 390 */     return this.fieldPWDCMAX.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setPWDCDTF(String newvalue)
/*     */   {
/* 398 */     this.fieldPWDCDTF.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getPWDCDTF()
/*     */   {
/* 406 */     return this.fieldPWDCDTF.getString();
/*     */   }
/*     */ 
/*     */   public void setPWDCLGT(String newvalue)
/*     */   {
/* 414 */     this.fieldPWDCLGT.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getPWDCLGT()
/*     */   {
/* 422 */     return this.fieldPWDCLGT.getString();
/*     */   }
/*     */ 
/*     */   public void setPWDCACL(String newvalue)
/*     */   {
/* 430 */     this.fieldPWDCACL.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getPWDCACL()
/*     */   {
/* 438 */     return this.fieldPWDCACL.getString();
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.PWDCDSJVMessage
 * JD-Core Version:    0.6.0
 */