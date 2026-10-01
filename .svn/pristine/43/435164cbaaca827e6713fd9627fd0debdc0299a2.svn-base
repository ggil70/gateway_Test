/*     */ package com.activo.gateway.dibs.messages;
/*     */ 
/*     */ import java.math.BigDecimal;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*     */ 
/*     */ public class IN200001Message extends MessageRecord
/*     */ {
/*  19 */   final int FIELDCOUNT = 16;
/*  20 */   private CharacterField fieldIN201USR = null;
/*  21 */   private DecimalField fieldIN201CUN = null;
/*  22 */   private DecimalField fieldIN201ACC = null;
/*  23 */   private DecimalField fieldIN201SEQ = null;
/*  24 */   private CharacterField fieldIN201DCI = null;
/*  25 */   private DecimalField fieldIN201AMT = null;
/*  26 */   private CharacterField fieldIN201CCY = null;
/*  27 */   private CharacterField fieldIN201FLG = null;
/*  28 */   private DecimalField fieldIN201DTE = null;
/*  29 */   private CharacterField fieldIN201NME = null;
/*  30 */   private CharacterField fieldIN201EC1 = null;
/*  31 */   private CharacterField fieldIN201ED1 = null;
/*  32 */   private CharacterField fieldIN201EC2 = null;
/*  33 */   private CharacterField fieldIN201ED2 = null;
/*  34 */   private CharacterField fieldIN201EOF = null;
/*  35 */   private CharacterField fieldIN201OPR = null;
/*     */ 
/*     */   public IN200001Message()
/*     */   {
/*  42 */     createFields();
/*  43 */     initialize();
/*     */   }
/*     */ 
/*     */   protected void createFields()
/*     */   {
/*  51 */     this.recordsize = 254;
/*  52 */     this.fileid = "1010226173954";
/*  53 */     this.recordid = "3EC35CF887760";
/*  54 */     this.message = new byte[getByteLength()];
/*  55 */     this.formatname = "IN200001";
/*  56 */     this.fieldnames = new String[16];
/*  57 */     this.tagnames = new String[16];
/*  58 */     this.fields = new MessageField[16];
/*     */ 
/*  60 */     this.fieldnames[0] = "IN201USR";
/*  61 */     this.tagnames[0] = "IN201USR";
/*     */      this.fields[0]=this.fieldIN201USR=new CharacterField(this.message, 10, 10, "IN201USR");
/*     */ 
/*  64 */     this.fieldnames[1] = "IN201CUN";
/*  65 */     this.tagnames[1] = "IN201CUN";
/*     */      this.fields[1]=this.fieldIN201CUN=new DecimalField(this.message, 20, 10, 0, "IN201CUN");
/*     */ 
/*  68 */     this.fieldnames[2] = "IN201ACC";
/*  69 */     this.tagnames[2] = "IN201ACC";
/*     */      this.fields[2]=this.fieldIN201ACC=new DecimalField(this.message, 30, 13, 0, "IN201ACC");
/*     */ 
/*  72 */     this.fieldnames[3] = "IN201SEQ";
/*  73 */     this.tagnames[3] = "IN201SEQ";
/*     */      this.fields[3]=this.fieldIN201SEQ=new DecimalField(this.message, 43, 5, 0, "IN201SEQ");
/*     */ 
/*  76 */     this.fieldnames[4] = "IN201DCI";
/*  77 */     this.tagnames[4] = "IN201DCI";
/*     */      this.fields[4]=this.fieldIN201DCI=new CharacterField(this.message, 48, 1, "IN201DCI");
/*     */ 
/*  80 */     this.fieldnames[5] = "IN201AMT";
/*  81 */     this.tagnames[5] = "IN201AMT";
/*     */      this.fields[5]=this.fieldIN201AMT=new DecimalField(this.message, 49, 17, 2, "IN201AMT");
/*     */ 
/*  84 */     this.fieldnames[6] = "IN201CCY";
/*  85 */     this.tagnames[6] = "IN201CCY";
/*     */      this.fields[6]=this.fieldIN201CCY=new CharacterField(this.message, 66, 3, "IN201CCY");
/*     */ 
/*  88 */     this.fieldnames[7] = "IN201FLG";
/*  89 */     this.tagnames[7] = "IN201FLG";
/*     */      this.fields[7]=this.fieldIN201FLG=new CharacterField(this.message, 69, 1, "IN201FLG");
/*     */ 
/*  92 */     this.fieldnames[8] = "IN201DTE";
/*  93 */     this.tagnames[8] = "IN201DTE";
/*     */      this.fields[8]=this.fieldIN201DTE=new DecimalField(this.message, 70, 9, 0, "IN201DTE");
/*     */ 
/*  96 */     this.fieldnames[9] = "IN201NME";
/*  97 */     this.tagnames[9] = "IN201NME";
/*     */      this.fields[9]=this.fieldIN201NME=new CharacterField(this.message, 79, 35, "IN201NME");
/*     */ 
/* 100 */     this.fieldnames[10] = "IN201EC1";
/* 101 */     this.tagnames[10] = "IN201EC1";
/*     */      this.fields[10]=this.fieldIN201EC1=new CharacterField(this.message, 114, 4, "IN201EC1");
/*     */ 
/* 104 */     this.fieldnames[11] = "IN201ED1";
/* 105 */     this.tagnames[11] = "IN201ED1";
/*     */      this.fields[11]=this.fieldIN201ED1=new CharacterField(this.message, 118, 70, "IN201ED1");
/*     */ 
/* 108 */     this.fieldnames[12] = "IN201EC2";
/* 109 */     this.tagnames[12] = "IN201EC2";
/*     */      this.fields[12]=this.fieldIN201EC2=new CharacterField(this.message, 188, 4, "IN201EC2");
/*     */ 
/* 112 */     this.fieldnames[13] = "IN201ED2";
/* 113 */     this.tagnames[13] = "IN201ED2";
/*     */      this.fields[13]=this.fieldIN201ED2=new CharacterField(this.message, 192, 70, "IN201ED2");
/*     */ 
/* 116 */     this.fieldnames[14] = "IN201EOF";
/* 117 */     this.tagnames[14] = "IN201EOF";
/*     */      this.fields[14]=this.fieldIN201EOF=new CharacterField(this.message, 262, 1, "IN201EOF");
/*     */ 
/* 120 */     this.fieldnames[15] = "IN201OPR";
/* 121 */     this.tagnames[15] = "IN201OPR";
/*     */      this.fields[15]=this.fieldIN201OPR=new CharacterField(this.message, 263, 1, "IN201OPR");
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalIN201ACC()
/*     */   {
/* 130 */     return this.fieldIN201ACC.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalIN201AMT()
/*     */   {
/* 137 */     return this.fieldIN201AMT.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalIN201CUN()
/*     */   {
/* 144 */     return this.fieldIN201CUN.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalIN201DTE()
/*     */   {
/* 151 */     return this.fieldIN201DTE.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalIN201SEQ()
/*     */   {
/* 158 */     return this.fieldIN201SEQ.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public String getIN201ACC()
/*     */   {
/* 165 */     return this.fieldIN201ACC.getString();
/*     */   }
/*     */ 
/*     */   public String getIN201AMT()
/*     */   {
/* 172 */     return this.fieldIN201AMT.getString();
/*     */   }
/*     */ 
/*     */   public String getIN201CCY()
/*     */   {
/* 179 */     return this.fieldIN201CCY.getString();
/*     */   }
/*     */ 
/*     */   public String getIN201CUN()
/*     */   {
/* 186 */     return this.fieldIN201CUN.getString();
/*     */   }
/*     */ 
/*     */   public String getIN201DCI()
/*     */   {
/* 193 */     return this.fieldIN201DCI.getString();
/*     */   }
/*     */ 
/*     */   public String getIN201DTE()
/*     */   {
/* 200 */     return this.fieldIN201DTE.getString();
/*     */   }
/*     */ 
/*     */   public String getIN201EC1()
/*     */   {
/* 207 */     return this.fieldIN201EC1.getString();
/*     */   }
/*     */ 
/*     */   public String getIN201EC2()
/*     */   {
/* 214 */     return this.fieldIN201EC2.getString();
/*     */   }
/*     */ 
/*     */   public String getIN201ED1()
/*     */   {
/* 221 */     return this.fieldIN201ED1.getString();
/*     */   }
/*     */ 
/*     */   public String getIN201ED2()
/*     */   {
/* 228 */     return this.fieldIN201ED2.getString();
/*     */   }
/*     */ 
/*     */   public String getIN201EOF()
/*     */   {
/* 235 */     return this.fieldIN201EOF.getString();
/*     */   }
/*     */ 
/*     */   public String getIN201FLG()
/*     */   {
/* 242 */     return this.fieldIN201FLG.getString();
/*     */   }
/*     */ 
/*     */   public String getIN201NME()
/*     */   {
/* 249 */     return this.fieldIN201NME.getString();
/*     */   }
/*     */ 
/*     */   public String getIN201OPR()
/*     */   {
/* 256 */     return this.fieldIN201OPR.getString();
/*     */   }
/*     */ 
/*     */   public String getIN201SEQ()
/*     */   {
/* 263 */     return this.fieldIN201SEQ.getString();
/*     */   }
/*     */ 
/*     */   public String getIN201USR()
/*     */   {
/* 270 */     return this.fieldIN201USR.getString();
/*     */   }
/*     */ 
/*     */   public void setIN201ACC(String newvalue)
/*     */   {
/* 277 */     this.fieldIN201ACC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN201ACC(BigDecimal newvalue)
/*     */   {
/* 284 */     this.fieldIN201ACC.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN201AMT(String newvalue)
/*     */   {
/* 291 */     this.fieldIN201AMT.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN201AMT(BigDecimal newvalue)
/*     */   {
/* 298 */     this.fieldIN201AMT.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN201CCY(String newvalue)
/*     */   {
/* 305 */     this.fieldIN201CCY.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN201CUN(String newvalue)
/*     */   {
/* 312 */     this.fieldIN201CUN.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN201CUN(BigDecimal newvalue)
/*     */   {
/* 319 */     this.fieldIN201CUN.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN201DCI(String newvalue)
/*     */   {
/* 326 */     this.fieldIN201DCI.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN201DTE(String newvalue)
/*     */   {
/* 333 */     this.fieldIN201DTE.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN201DTE(BigDecimal newvalue)
/*     */   {
/* 340 */     this.fieldIN201DTE.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN201EC1(String newvalue)
/*     */   {
/* 347 */     this.fieldIN201EC1.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN201EC2(String newvalue)
/*     */   {
/* 354 */     this.fieldIN201EC2.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN201ED1(String newvalue)
/*     */   {
/* 361 */     this.fieldIN201ED1.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN201ED2(String newvalue)
/*     */   {
/* 368 */     this.fieldIN201ED2.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN201EOF(String newvalue)
/*     */   {
/* 375 */     this.fieldIN201EOF.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN201FLG(String newvalue)
/*     */   {
/* 382 */     this.fieldIN201FLG.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN201NME(String newvalue)
/*     */   {
/* 389 */     this.fieldIN201NME.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN201OPR(String newvalue)
/*     */   {
/* 396 */     this.fieldIN201OPR.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN201SEQ(String newvalue)
/*     */   {
/* 403 */     this.fieldIN201SEQ.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN201SEQ(BigDecimal newvalue)
/*     */   {
/* 410 */     this.fieldIN201SEQ.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN201USR(String newvalue)
/*     */   {
/* 417 */     this.fieldIN201USR.setString(newvalue);
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.IN200001Message
 * JD-Core Version:    0.6.0
 */