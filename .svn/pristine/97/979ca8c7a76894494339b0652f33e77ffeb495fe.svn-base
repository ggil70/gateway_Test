/*     */ package com.activo.gateway.dibs.messages;
/*     */ 
/*     */ import java.math.BigDecimal;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*     */ 
/*     */ public class HEADRMessage extends MessageRecord
/*     */ {
/*  19 */   final int FIELDCOUNT = 5;
/*  20 */   private CharacterField fieldHEAUSR = null;
/*  21 */   private CharacterField fieldHEAPGM = null;
/*  22 */   private DecimalField fieldHEATCD = null;
/*  23 */   private DecimalField fieldHEATIM = null;
/*  24 */   private CharacterField fieldHEAOPC = null;
/*     */ 
/*     */   public HEADRMessage()
/*     */   {
/*  31 */     createFields();
/*  32 */     initialize();
/*     */   }
/*     */ 
/*     */   protected void createFields()
/*     */   {
/*  40 */     this.recordsize = 41;
/*  41 */     this.fileid = "1000803141332";
/*  42 */     this.recordid = "388C4232BD8CC";
/*  43 */     this.message = new byte[getByteLength()];
/*  44 */     this.formatname = "HEADR";
/*  45 */     this.fieldnames = new String[5];
/*  46 */     this.tagnames = new String[5];
/*  47 */     this.fields = new MessageField[5];
/*     */ 
/*  49 */     this.fieldnames[0] = "HEAUSR";
/*  50 */     this.tagnames[0] = "HEAUSR";
/*     */      this.fields[0]=this.fieldHEAUSR=new CharacterField(this.message, 10, 10, "HEAUSR");
/*     */ 
/*  53 */     this.fieldnames[1] = "HEAPGM";
/*  54 */     this.tagnames[1] = "HEAPGM";
/*     */      this.fields[1]=this.fieldHEAPGM=new CharacterField(this.message, 20, 10, "HEAPGM");
/*     */ 
/*  57 */     this.fieldnames[2] = "HEATCD";
/*  58 */     this.tagnames[2] = "HEATCD";
/*     */      this.fields[2]=this.fieldHEATCD=new DecimalField(this.message, 30, 5, 0, "HEATCD");
/*     */ 
/*  61 */     this.fieldnames[3] = "HEATIM";
/*  62 */     this.tagnames[3] = "HEATIM";
/*     */      this.fields[3]=this.fieldHEATIM=new DecimalField(this.message, 35, 13, 0, "HEATIM");
/*     */ 
/*  65 */     this.fieldnames[4] = "HEAOPC";
/*  66 */     this.tagnames[4] = "HEAOPC";
/*     */      this.fields[4]=this.fieldHEAOPC=new CharacterField(this.message, 48, 3, "HEAOPC");
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalHEATCD()
/*     */   {
/*  75 */     return this.fieldHEATCD.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalHEATIM()
/*     */   {
/*  82 */     return this.fieldHEATIM.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public String getHEAOPC()
/*     */   {
/*  89 */     return this.fieldHEAOPC.getString();
/*     */   }
/*     */ 
/*     */   public String getHEAPGM()
/*     */   {
/*  96 */     return this.fieldHEAPGM.getString();
/*     */   }
/*     */ 
/*     */   public String getHEATCD()
/*     */   {
/* 103 */     return this.fieldHEATCD.getString();
/*     */   }
/*     */ 
/*     */   public String getHEATIM()
/*     */   {
/* 110 */     return this.fieldHEATIM.getString();
/*     */   }
/*     */ 
/*     */   public String getHEAUSR()
/*     */   {
/* 117 */     return this.fieldHEAUSR.getString();
/*     */   }
/*     */ 
/*     */   public void setHEAOPC(String newvalue)
/*     */   {
/* 124 */     this.fieldHEAOPC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setHEAPGM(String newvalue)
/*     */   {
/* 131 */     this.fieldHEAPGM.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setHEATCD(String newvalue)
/*     */   {
/* 138 */     this.fieldHEATCD.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setHEATCD(BigDecimal newvalue)
/*     */   {
/* 145 */     this.fieldHEATCD.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setHEATIM(String newvalue)
/*     */   {
/* 152 */     this.fieldHEATIM.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setHEATIM(BigDecimal newvalue)
/*     */   {
/* 159 */     this.fieldHEATIM.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setHEAUSR(String newvalue)
/*     */   {
/* 166 */     this.fieldHEAUSR.setString(newvalue);
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.HEADRMessage
 * JD-Core Version:    0.6.0
 */