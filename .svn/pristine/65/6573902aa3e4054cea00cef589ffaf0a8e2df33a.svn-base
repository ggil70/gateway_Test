/*     */ package com.activo.gateway.dibs.messages;
/*     */ 
/*     */ import java.math.BigDecimal;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*     */ 
/*     */ public class INAPCDSJVMessage extends MessageRecord
/*     */ {
/*  19 */   final int FIELDCOUNT = 19;
/*  20 */   private CharacterField fieldDSJINAUSR = null;
/*  21 */   private DecimalField fieldDSJINAACC = null;
/*  22 */   private CharacterField fieldDSJINANM1 = null;
/*  23 */   private DecimalField fieldDSJINAVNO = null;
/*  24 */   private CharacterField fieldDSJINAPMT = null;
/*  25 */   private DecimalField fieldDSJINAIAM = null;
/*  26 */   private CharacterField fieldDSJINACCY = null;
/*  27 */   private DecimalField fieldDSJINAPDM = null;
/*  28 */   private DecimalField fieldDSJINAPDD = null;
/*  29 */   private DecimalField fieldDSJINAPDY = null;
/*  30 */   private CharacterField fieldDSJINAPFR = null;
/*  31 */   private DecimalField fieldDSJINATOT = null;
/*  32 */   private CharacterField fieldDSJINAREF = null;
/*  33 */   private CharacterField fieldDSJINARMK = null;
/*  34 */   private CharacterField fieldDSJINAOPT = null;
/*  35 */   private DecimalField fieldDSJINASQN = null;
/*  36 */   private DecimalField fieldDSJINARCM = null;
/*  37 */   private DecimalField fieldDSJINARCD = null;
/*  38 */   private DecimalField fieldDSJINARCY = null;
/*     */ 
/*     */   public INAPCDSJVMessage()
/*     */   {
/*  45 */     createFields();
/*  46 */     initialize();
/*     */   }
/*     */ 
/*     */   protected void createFields()
/*     */   {
/*  54 */     this.recordsize = 193;
/*  55 */     this.fileid = "1001004210200";
/*  56 */     this.recordid = "3BBBD1E235CD7";
/*  57 */     this.message = new byte[getByteLength()];
/*  58 */     this.formatname = "INAPCDSJV";
/*  59 */     this.fieldnames = new String[19];
/*  60 */     this.tagnames = new String[19];
/*  61 */     this.fields = new MessageField[19];
/*     */ 
/*  63 */     this.fieldnames[0] = "DSJINAUSR";
/*  64 */     this.tagnames[0] = "DSJINAUSR";
/*     */      this.fields[0]=this.fieldDSJINAUSR=new CharacterField(this.message, 10, 10, "DSJINAUSR");
/*     */ 
/*  67 */     this.fieldnames[1] = "DSJINAACC";
/*  68 */     this.tagnames[1] = "DSJINAACC";
/*     */      this.fields[1]=this.fieldDSJINAACC=new DecimalField(this.message, 20, 13, 0, "DSJINAACC");
/*     */ 
/*  71 */     this.fieldnames[2] = "DSJINANM1";
/*  72 */     this.tagnames[2] = "DSJINANM1";
/*     */      this.fields[2]=this.fieldDSJINANM1=new CharacterField(this.message, 33, 35, "DSJINANM1");
/*     */ 
/*  75 */     this.fieldnames[3] = "DSJINAVNO";
/*  76 */     this.tagnames[3] = "DSJINAVNO";
/*     */      this.fields[3]=this.fieldDSJINAVNO=new DecimalField(this.message, 68, 10, 0, "DSJINAVNO");
/*     */ 
/*  79 */     this.fieldnames[4] = "DSJINAPMT";
/*  80 */     this.tagnames[4] = "DSJINAPMT";
/*     */      this.fields[4]=this.fieldDSJINAPMT=new CharacterField(this.message, 78, 1, "DSJINAPMT");
/*     */ 
/*  83 */     this.fieldnames[5] = "DSJINAIAM";
/*  84 */     this.tagnames[5] = "DSJINAIAM";
/*     */      this.fields[5]=this.fieldDSJINAIAM=new DecimalField(this.message, 79, 17, 2, "DSJINAIAM");
/*     */ 
/*  87 */     this.fieldnames[6] = "DSJINACCY";
/*  88 */     this.tagnames[6] = "DSJINACCY";
/*     */      this.fields[6]=this.fieldDSJINACCY=new CharacterField(this.message, 96, 3, "DSJINACCY");
/*     */ 
/*  91 */     this.fieldnames[7] = "DSJINAPDM";
/*  92 */     this.tagnames[7] = "DSJINAPDM";
/*     */      this.fields[7]=this.fieldDSJINAPDM=new DecimalField(this.message, 99, 3, 0, "DSJINAPDM");
/*     */ 
/*  95 */     this.fieldnames[8] = "DSJINAPDD";
/*  96 */     this.tagnames[8] = "DSJINAPDD";
/*     */      this.fields[8]=this.fieldDSJINAPDD=new DecimalField(this.message, 102, 3, 0, "DSJINAPDD");
/*     */ 
/*  99 */     this.fieldnames[9] = "DSJINAPDY";
/* 100 */     this.tagnames[9] = "DSJINAPDY";
/*     */      this.fields[9]=this.fieldDSJINAPDY=new DecimalField(this.message, 105, 3, 0, "DSJINAPDY");
/*     */ 
/* 103 */     this.fieldnames[10] = "DSJINAPFR";
/* 104 */     this.tagnames[10] = "DSJINAPFR";
/*     */      this.fields[10]=this.fieldDSJINAPFR=new CharacterField(this.message, 108, 1, "DSJINAPFR");
/*     */ 
/* 107 */     this.fieldnames[11] = "DSJINATOT";
/* 108 */     this.tagnames[11] = "DSJINATOT";
/*     */      this.fields[11]=this.fieldDSJINATOT=new DecimalField(this.message, 109, 4, 0, "DSJINATOT");
/*     */ 
/* 111 */     this.fieldnames[12] = "DSJINAREF";
/* 112 */     this.tagnames[12] = "DSJINAREF";
/*     */      this.fields[12]=this.fieldDSJINAREF=new CharacterField(this.message, 113, 30, "DSJINAREF");
/*     */ 
/* 115 */     this.fieldnames[13] = "DSJINARMK";
/* 116 */     this.tagnames[13] = "DSJINARMK";
/*     */      this.fields[13]=this.fieldDSJINARMK=new CharacterField(this.message, 143, 40, "DSJINARMK");
/*     */ 
/* 119 */     this.fieldnames[14] = "DSJINAOPT";
/* 120 */     this.tagnames[14] = "DSJINAOPT";
/*     */      this.fields[14]=this.fieldDSJINAOPT=new CharacterField(this.message, 183, 1, "DSJINAOPT");
/*     */ 
/* 123 */     this.fieldnames[15] = "DSJINASQN";
/* 124 */     this.tagnames[15] = "DSJINASQN";
/*     */      this.fields[15]=this.fieldDSJINASQN=new DecimalField(this.message, 184, 10, 0, "DSJINASQN");
/*     */ 
/* 127 */     this.fieldnames[16] = "DSJINARCM";
/* 128 */     this.tagnames[16] = "DSJINARCM";
/*     */      this.fields[16]=this.fieldDSJINARCM=new DecimalField(this.message, 194, 3, 0, "DSJINARCM");
/*     */ 
/* 131 */     this.fieldnames[17] = "DSJINARCD";
/* 132 */     this.tagnames[17] = "DSJINARCD";
/*     */      this.fields[17]=this.fieldDSJINARCD=new DecimalField(this.message, 197, 3, 0, "DSJINARCD");
/*     */ 
/* 135 */     this.fieldnames[18] = "DSJINARCY";
/* 136 */     this.tagnames[18] = "DSJINARCY";
/*     */      this.fields[18]=this.fieldDSJINARCY=new DecimalField(this.message, 200, 3, 0, "DSJINARCY");
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalDSJINAACC()
/*     */   {
/* 145 */     return this.fieldDSJINAACC.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalDSJINAIAM()
/*     */   {
/* 152 */     return this.fieldDSJINAIAM.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalDSJINAPDD()
/*     */   {
/* 159 */     return this.fieldDSJINAPDD.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalDSJINAPDM()
/*     */   {
/* 166 */     return this.fieldDSJINAPDM.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalDSJINAPDY()
/*     */   {
/* 173 */     return this.fieldDSJINAPDY.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalDSJINARCD()
/*     */   {
/* 180 */     return this.fieldDSJINARCD.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalDSJINARCM()
/*     */   {
/* 187 */     return this.fieldDSJINARCM.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalDSJINARCY()
/*     */   {
/* 194 */     return this.fieldDSJINARCY.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalDSJINASQN()
/*     */   {
/* 201 */     return this.fieldDSJINASQN.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalDSJINATOT()
/*     */   {
/* 208 */     return this.fieldDSJINATOT.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalDSJINAVNO()
/*     */   {
/* 215 */     return this.fieldDSJINAVNO.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public String getDSJINAACC()
/*     */   {
/* 222 */     return this.fieldDSJINAACC.getString();
/*     */   }
/*     */ 
/*     */   public String getDSJINACCY()
/*     */   {
/* 229 */     return this.fieldDSJINACCY.getString();
/*     */   }
/*     */ 
/*     */   public String getDSJINAIAM()
/*     */   {
/* 236 */     return this.fieldDSJINAIAM.getString();
/*     */   }
/*     */ 
/*     */   public String getDSJINANM1()
/*     */   {
/* 243 */     return this.fieldDSJINANM1.getString();
/*     */   }
/*     */ 
/*     */   public String getDSJINAOPT()
/*     */   {
/* 250 */     return this.fieldDSJINAOPT.getString();
/*     */   }
/*     */ 
/*     */   public String getDSJINAPDD()
/*     */   {
/* 257 */     return this.fieldDSJINAPDD.getString();
/*     */   }
/*     */ 
/*     */   public String getDSJINAPDM()
/*     */   {
/* 264 */     return this.fieldDSJINAPDM.getString();
/*     */   }
/*     */ 
/*     */   public String getDSJINAPDY()
/*     */   {
/* 271 */     return this.fieldDSJINAPDY.getString();
/*     */   }
/*     */ 
/*     */   public String getDSJINAPFR()
/*     */   {
/* 278 */     return this.fieldDSJINAPFR.getString();
/*     */   }
/*     */ 
/*     */   public String getDSJINAPMT()
/*     */   {
/* 285 */     return this.fieldDSJINAPMT.getString();
/*     */   }
/*     */ 
/*     */   public String getDSJINARCD()
/*     */   {
/* 292 */     return this.fieldDSJINARCD.getString();
/*     */   }
/*     */ 
/*     */   public String getDSJINARCM()
/*     */   {
/* 299 */     return this.fieldDSJINARCM.getString();
/*     */   }
/*     */ 
/*     */   public String getDSJINARCY()
/*     */   {
/* 306 */     return this.fieldDSJINARCY.getString();
/*     */   }
/*     */ 
/*     */   public String getDSJINAREF()
/*     */   {
/* 313 */     return this.fieldDSJINAREF.getString();
/*     */   }
/*     */ 
/*     */   public String getDSJINARMK()
/*     */   {
/* 320 */     return this.fieldDSJINARMK.getString();
/*     */   }
/*     */ 
/*     */   public String getDSJINASQN()
/*     */   {
/* 327 */     return this.fieldDSJINASQN.getString();
/*     */   }
/*     */ 
/*     */   public String getDSJINATOT()
/*     */   {
/* 334 */     return this.fieldDSJINATOT.getString();
/*     */   }
/*     */ 
/*     */   public String getDSJINAUSR()
/*     */   {
/* 341 */     return this.fieldDSJINAUSR.getString();
/*     */   }
/*     */ 
/*     */   public String getDSJINAVNO()
/*     */   {
/* 348 */     return this.fieldDSJINAVNO.getString();
/*     */   }
/*     */ 
/*     */   public void setDSJINAACC(String newvalue)
/*     */   {
/* 355 */     this.fieldDSJINAACC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJINAACC(BigDecimal newvalue)
/*     */   {
/* 362 */     this.fieldDSJINAACC.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJINACCY(String newvalue)
/*     */   {
/* 369 */     this.fieldDSJINACCY.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJINAIAM(String newvalue)
/*     */   {
/* 376 */     this.fieldDSJINAIAM.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJINAIAM(BigDecimal newvalue)
/*     */   {
/* 383 */     this.fieldDSJINAIAM.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJINANM1(String newvalue)
/*     */   {
/* 390 */     this.fieldDSJINANM1.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJINAOPT(String newvalue)
/*     */   {
/* 397 */     this.fieldDSJINAOPT.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJINAPDD(String newvalue)
/*     */   {
/* 404 */     this.fieldDSJINAPDD.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJINAPDD(BigDecimal newvalue)
/*     */   {
/* 411 */     this.fieldDSJINAPDD.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJINAPDM(String newvalue)
/*     */   {
/* 418 */     this.fieldDSJINAPDM.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJINAPDM(BigDecimal newvalue)
/*     */   {
/* 425 */     this.fieldDSJINAPDM.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJINAPDY(String newvalue)
/*     */   {
/* 432 */     this.fieldDSJINAPDY.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJINAPDY(BigDecimal newvalue)
/*     */   {
/* 439 */     this.fieldDSJINAPDY.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJINAPFR(String newvalue)
/*     */   {
/* 446 */     this.fieldDSJINAPFR.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJINAPMT(String newvalue)
/*     */   {
/* 453 */     this.fieldDSJINAPMT.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJINARCD(String newvalue)
/*     */   {
/* 460 */     this.fieldDSJINARCD.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJINARCD(BigDecimal newvalue)
/*     */   {
/* 467 */     this.fieldDSJINARCD.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJINARCM(String newvalue)
/*     */   {
/* 474 */     this.fieldDSJINARCM.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJINARCM(BigDecimal newvalue)
/*     */   {
/* 481 */     this.fieldDSJINARCM.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJINARCY(String newvalue)
/*     */   {
/* 488 */     this.fieldDSJINARCY.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJINARCY(BigDecimal newvalue)
/*     */   {
/* 495 */     this.fieldDSJINARCY.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJINAREF(String newvalue)
/*     */   {
/* 502 */     this.fieldDSJINAREF.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJINARMK(String newvalue)
/*     */   {
/* 509 */     this.fieldDSJINARMK.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJINASQN(String newvalue)
/*     */   {
/* 516 */     this.fieldDSJINASQN.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJINASQN(BigDecimal newvalue)
/*     */   {
/* 523 */     this.fieldDSJINASQN.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJINATOT(String newvalue)
/*     */   {
/* 530 */     this.fieldDSJINATOT.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJINATOT(BigDecimal newvalue)
/*     */   {
/* 537 */     this.fieldDSJINATOT.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJINAUSR(String newvalue)
/*     */   {
/* 544 */     this.fieldDSJINAUSR.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJINAVNO(String newvalue)
/*     */   {
/* 551 */     this.fieldDSJINAVNO.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJINAVNO(BigDecimal newvalue)
/*     */   {
/* 558 */     this.fieldDSJINAVNO.setBigDecimal(newvalue);
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.INAPCDSJVMessage
 * JD-Core Version:    0.6.0
 */