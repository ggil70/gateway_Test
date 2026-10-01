/*     */ package com.activo.gateway.dibs.messages;
/*     */ 
/*     */ import java.math.BigDecimal;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*     */ 
/*     */ public class IN098501Message extends MessageRecord
/*     */ {
/*  19 */   final int FIELDCOUNT = 8;
/*  20 */   private CharacterField fieldIN985USR = null;
/*  21 */   private CharacterField fieldIN985RCT = null;
/*  22 */   private CharacterField fieldIN985REF = null;
/*  23 */   private DecimalField fieldIN985DTE = null;
/*  24 */   private DecimalField fieldIN985DAC = null;
/*  25 */   private DecimalField fieldIN985CAC = null;
/*  26 */   private DecimalField fieldIN985AMT = null;
/*  27 */   private CharacterField fieldIN985END = null;
/*     */ 
/*     */   public IN098501Message()
/*     */   {
/*  34 */     createFields();
/*  35 */     initialize();
/*     */   }
/*     */ 
/*     */   protected void createFields()
/*     */   {
/*  44 */     this.recordsize = 80;
/*  45 */     this.fileid = "1020321164447";
/*  46 */     this.recordid = "47B8237D6D176";
/*  47 */     this.message = new byte[getByteLength()];
/*  48 */     this.formatname = "IN098501";
/*  49 */     this.fieldnames = new String[8];
/*  50 */     this.tagnames = new String[8];
/*  51 */     this.fields = new MessageField[8];
/*     */ 
/*  53 */     this.fieldnames[0] = "IN985USR";
/*  54 */     this.tagnames[0] = "IN985USR";
/*     */      this.fields[0]=this.fieldIN985USR=new CharacterField(this.message, 10, 10, "IN985USR");
/*     */ 
/*  57 */     this.fieldnames[1] = "IN985RCT";
/*  58 */     this.tagnames[1] = "IN985RCT";
/*     */      this.fields[1]=this.fieldIN985RCT=new CharacterField(this.message, 20, 1, "IN985RCT");
/*     */ 
/*  61 */     this.fieldnames[2] = "IN985REF";
/*  62 */     this.tagnames[2] = "IN985REF";
/*     */      this.fields[2]=this.fieldIN985REF=new CharacterField(this.message, 21, 25, "IN985REF");
/*     */ 
/*  65 */     this.fieldnames[3] = "IN985DTE";
/*  66 */     this.tagnames[3] = "IN985DTE";
/*     */      this.fields[3]=this.fieldIN985DTE=new DecimalField(this.message, 46, 9, 0, "IN985DTE");
/*     */ 
/*  69 */     this.fieldnames[4] = "IN985DAC";
/*  70 */     this.tagnames[4] = "IN985DAC";
/*     */      this.fields[4]=this.fieldIN985DAC=new DecimalField(this.message, 55, 10, 0, "IN985DAC");
/*     */ 
/*  73 */     this.fieldnames[5] = "IN985CAC";
/*  74 */     this.tagnames[5] = "IN985CAC";
/*     */      this.fields[5]=this.fieldIN985CAC=new DecimalField(this.message, 65, 10, 0, "IN985CAC");
/*     */ 
/*  77 */     this.fieldnames[6] = "IN985AMT";
/*  78 */     this.tagnames[6] = "IN985AMT";
/*     */      this.fields[6]=this.fieldIN985AMT=new DecimalField(this.message, 75, 14, 2, "IN985AMT");
/*     */ 
/*  81 */     this.fieldnames[7] = "IN985END";
/*  82 */     this.tagnames[7] = "IN985END";
/*     */      this.fields[7]=this.fieldIN985END=new CharacterField(this.message, 89, 1, "IN985END");
/*     */   }
/*     */ 
/*     */   public void setIN985USR(String newvalue)
/*     */   {
/*  92 */     this.fieldIN985USR.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getIN985USR()
/*     */   {
/* 100 */     return this.fieldIN985USR.getString();
/*     */   }
/*     */ 
/*     */   public void setIN985RCT(String newvalue)
/*     */   {
/* 108 */     this.fieldIN985RCT.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getIN985RCT()
/*     */   {
/* 116 */     return this.fieldIN985RCT.getString();
/*     */   }
/*     */ 
/*     */   public void setIN985REF(String newvalue)
/*     */   {
/* 124 */     this.fieldIN985REF.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getIN985REF()
/*     */   {
/* 132 */     return this.fieldIN985REF.getString();
/*     */   }
/*     */ 
/*     */   public void setIN985DTE(String newvalue)
/*     */   {
/* 140 */     this.fieldIN985DTE.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getIN985DTE()
/*     */   {
/* 148 */     return this.fieldIN985DTE.getString();
/*     */   }
/*     */ 
/*     */   public void setIN985DTE(BigDecimal newvalue)
/*     */   {
/* 156 */     this.fieldIN985DTE.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalIN985DTE()
/*     */   {
/* 164 */     return this.fieldIN985DTE.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setIN985DAC(String newvalue)
/*     */   {
/* 172 */     this.fieldIN985DAC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getIN985DAC()
/*     */   {
/* 180 */     return this.fieldIN985DAC.getString();
/*     */   }
/*     */ 
/*     */   public void setIN985DAC(BigDecimal newvalue)
/*     */   {
/* 188 */     this.fieldIN985DAC.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalIN985DAC()
/*     */   {
/* 196 */     return this.fieldIN985DAC.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setIN985CAC(String newvalue)
/*     */   {
/* 204 */     this.fieldIN985CAC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getIN985CAC()
/*     */   {
/* 212 */     return this.fieldIN985CAC.getString();
/*     */   }
/*     */ 
/*     */   public void setIN985CAC(BigDecimal newvalue)
/*     */   {
/* 220 */     this.fieldIN985CAC.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalIN985CAC()
/*     */   {
/* 228 */     return this.fieldIN985CAC.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setIN985AMT(String newvalue)
/*     */   {
/* 236 */     this.fieldIN985AMT.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getIN985AMT()
/*     */   {
/* 244 */     return this.fieldIN985AMT.getString();
/*     */   }
/*     */ 
/*     */   public void setIN985AMT(BigDecimal newvalue)
/*     */   {
/* 252 */     this.fieldIN985AMT.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalIN985AMT()
/*     */   {
/* 260 */     return this.fieldIN985AMT.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setIN985END(String newvalue)
/*     */   {
/* 268 */     this.fieldIN985END.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getIN985END()
/*     */   {
/* 276 */     return this.fieldIN985END.getString();
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.IN098501Message
 * JD-Core Version:    0.6.0
 */