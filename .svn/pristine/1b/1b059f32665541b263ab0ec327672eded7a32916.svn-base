/*     */ package com.activo.gateway.dibs.messages;
/*     */ 
/*     */ import java.math.BigDecimal;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*     */ 
/*     */ public class INTRHDSJVMessage extends MessageRecord
/*     */ {
/*  19 */   final int FIELDCOUNT = 9;
/*  20 */   private CharacterField fieldINTUSR = null;
/*  21 */   private DecimalField fieldINTADT = null;
/*  22 */   private DecimalField fieldINTTMI = null;
/*  23 */   private DecimalField fieldINTACC = null;
/*  24 */   private DecimalField fieldINTCUN = null;
/*  25 */   private CharacterField fieldINTATY = null;
/*  26 */   private CharacterField fieldINTACT = null;
/*  27 */   private DecimalField fieldINTAMT = null;
/*  28 */   private CharacterField fieldINTCCY = null;
/*     */ 
/*     */   public INTRHDSJVMessage()
/*     */   {
/*  35 */     createFields();
/*  36 */     initialize();
/*     */   }
/*     */ 
/*     */   protected void createFields()
/*     */   {
/*  44 */     this.recordsize = 74;
/*  45 */     this.fileid = "1000803162909";
/*  46 */     this.recordid = "4969DB77DA746";
/*  47 */     this.message = new byte[getByteLength()];
/*  48 */     this.formatname = "INTRHDSJV";
/*  49 */     this.fieldnames = new String[9];
/*  50 */     this.tagnames = new String[9];
/*  51 */     this.fields = new MessageField[9];
/*     */ 
/*  53 */     this.fieldnames[0] = "INTUSR";
/*  54 */     this.tagnames[0] = "INTUSR";
/*     */      this.fields[0]=this.fieldINTUSR=new CharacterField(this.message, 10, 10, "INTUSR");
/*     */ 
/*  57 */     this.fieldnames[1] = "INTADT";
/*  58 */     this.tagnames[1] = "INTADT";
/*     */      this.fields[1]=this.fieldINTADT=new DecimalField(this.message, 20, 9, 0, "INTADT");
/*     */ 
/*  61 */     this.fieldnames[2] = "INTTMI";
/*  62 */     this.tagnames[2] = "INTTMI";
/*     */      this.fields[2]=this.fieldINTTMI=new DecimalField(this.message, 29, 7, 0, "INTTMI");
/*     */ 
/*  65 */     this.fieldnames[3] = "INTACC";
/*  66 */     this.tagnames[3] = "INTACC";
/*     */      this.fields[3]=this.fieldINTACC=new DecimalField(this.message, 36, 13, 0, "INTACC");
/*     */ 
/*  69 */     this.fieldnames[4] = "INTCUN";
/*  70 */     this.tagnames[4] = "INTCUN";
/*     */      this.fields[4]=this.fieldINTCUN=new DecimalField(this.message, 49, 10, 0, "INTCUN");
/*     */ 
/*  73 */     this.fieldnames[5] = "INTATY";
/*  74 */     this.tagnames[5] = "INTATY";
/*     */      this.fields[5]=this.fieldINTATY=new CharacterField(this.message, 59, 3, "INTATY");
/*     */ 
/*  77 */     this.fieldnames[6] = "INTACT";
/*  78 */     this.tagnames[6] = "INTACT";
/*     */      this.fields[6]=this.fieldINTACT=new CharacterField(this.message, 62, 2, "INTACT");
/*     */ 
/*  81 */     this.fieldnames[7] = "INTAMT";
/*  82 */     this.tagnames[7] = "INTAMT";
/*     */      this.fields[7]=this.fieldINTAMT=new DecimalField(this.message, 64, 17, 2, "INTAMT");
/*     */ 
/*  85 */     this.fieldnames[8] = "INTCCY";
/*  86 */     this.tagnames[8] = "INTCCY";
/*     */      this.fields[8]=this.fieldINTCCY=new CharacterField(this.message, 81, 3, "INTCCY");
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalINTACC()
/*     */   {
/*  95 */     return this.fieldINTACC.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalINTADT()
/*     */   {
/* 102 */     return this.fieldINTADT.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalINTAMT()
/*     */   {
/* 109 */     return this.fieldINTAMT.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalINTCUN()
/*     */   {
/* 116 */     return this.fieldINTCUN.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalINTTMI()
/*     */   {
/* 123 */     return this.fieldINTTMI.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public String getINTACC()
/*     */   {
/* 130 */     return this.fieldINTACC.getString();
/*     */   }
/*     */ 
/*     */   public String getINTACT()
/*     */   {
/* 137 */     return this.fieldINTACT.getString();
/*     */   }
/*     */ 
/*     */   public String getINTADT()
/*     */   {
/* 144 */     return this.fieldINTADT.getString();
/*     */   }
/*     */ 
/*     */   public String getINTAMT()
/*     */   {
/* 151 */     return this.fieldINTAMT.getString();
/*     */   }
/*     */ 
/*     */   public String getINTATY()
/*     */   {
/* 158 */     return this.fieldINTATY.getString();
/*     */   }
/*     */ 
/*     */   public String getINTCCY()
/*     */   {
/* 165 */     return this.fieldINTCCY.getString();
/*     */   }
/*     */ 
/*     */   public String getINTCUN()
/*     */   {
/* 172 */     return this.fieldINTCUN.getString();
/*     */   }
/*     */ 
/*     */   public String getINTTMI()
/*     */   {
/* 179 */     return this.fieldINTTMI.getString();
/*     */   }
/*     */ 
/*     */   public String getINTUSR()
/*     */   {
/* 186 */     return this.fieldINTUSR.getString();
/*     */   }
/*     */ 
/*     */   public void setINTACC(String newvalue)
/*     */   {
/* 193 */     this.fieldINTACC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setINTACC(BigDecimal newvalue)
/*     */   {
/* 200 */     this.fieldINTACC.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setINTACT(String newvalue)
/*     */   {
/* 207 */     this.fieldINTACT.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setINTADT(String newvalue)
/*     */   {
/* 214 */     this.fieldINTADT.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setINTADT(BigDecimal newvalue)
/*     */   {
/* 221 */     this.fieldINTADT.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setINTAMT(String newvalue)
/*     */   {
/* 228 */     this.fieldINTAMT.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setINTAMT(BigDecimal newvalue)
/*     */   {
/* 235 */     this.fieldINTAMT.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setINTATY(String newvalue)
/*     */   {
/* 242 */     this.fieldINTATY.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setINTCCY(String newvalue)
/*     */   {
/* 249 */     this.fieldINTCCY.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setINTCUN(String newvalue)
/*     */   {
/* 256 */     this.fieldINTCUN.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setINTCUN(BigDecimal newvalue)
/*     */   {
/* 263 */     this.fieldINTCUN.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setINTTMI(String newvalue)
/*     */   {
/* 270 */     this.fieldINTTMI.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setINTTMI(BigDecimal newvalue)
/*     */   {
/* 277 */     this.fieldINTTMI.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setINTUSR(String newvalue)
/*     */   {
/* 284 */     this.fieldINTUSR.setString(newvalue);
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.INTRHDSJVMessage
 * JD-Core Version:    0.6.0
 */