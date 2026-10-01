/*     */ package com.activo.gateway.dibs.messages;
/*     */ 
/*     */ import java.math.BigDecimal;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*     */ 
/*     */ public class NIKDSJVMessage extends MessageRecord
/*     */ {
/*  19 */   final int FIELDCOUNT = 6;
/*  20 */   private CharacterField fieldNIKUSR = null;
/*  21 */   private CharacterField fieldNIKDSC = null;
/*  22 */   private DecimalField fieldNIKACC = null;
/*  23 */   private CharacterField fieldNIKCCN = null;
/*  24 */   private CharacterField fieldNIKNNM = null;
/*  25 */   private CharacterField fieldNIKTYP = null;
/*     */ 
/*     */   public NIKDSJVMessage()
/*     */   {
/*  32 */     createFields();
/*  33 */     initialize();
/*     */   }
/*     */ 
/*     */   protected void createFields()
/*     */   {
/*  41 */     this.recordsize = 103;
/*  42 */     this.fileid = "1000802211901";
/*  43 */     this.recordid = "39E970BB82A98";
/*  44 */     this.message = new byte[getByteLength()];
/*  45 */     this.formatname = "NIKDSJV";
/*  46 */     this.fieldnames = new String[6];
/*  47 */     this.tagnames = new String[6];
/*  48 */     this.fields = new MessageField[6];
/*     */ 
/*  50 */     this.fieldnames[0] = "NIKUSR";
/*  51 */     this.tagnames[0] = "NIKUSR";
/*     */      this.fields[0]=this.fieldNIKUSR=new CharacterField(this.message, 10, 10, "NIKUSR");
/*     */ 
/*  54 */     this.fieldnames[1] = "NIKDSC";
/*  55 */     this.tagnames[1] = "NIKDSC";
/*     */      this.fields[1]=this.fieldNIKDSC=new CharacterField(this.message, 20, 30, "NIKDSC");
/*     */ 
/*  58 */     this.fieldnames[2] = "NIKACC";
/*  59 */     this.tagnames[2] = "NIKACC";
/*     */      this.fields[2]=this.fieldNIKACC=new DecimalField(this.message, 50, 13, 0, "NIKACC");
/*     */ 
/*  62 */     this.fieldnames[3] = "NIKCCN";
/*  63 */     this.tagnames[3] = "NIKCCN";
/*     */      this.fields[3]=this.fieldNIKCCN=new CharacterField(this.message, 63, 17, "NIKCCN");
/*     */ 
/*  66 */     this.fieldnames[4] = "NIKNNM";
/*  67 */     this.tagnames[4] = "NIKNNM";
/*     */      this.fields[4]=this.fieldNIKNNM=new CharacterField(this.message, 80, 30, "NIKNNM");
/*     */ 
/*  70 */     this.fieldnames[5] = "NIKTYP";
/*  71 */     this.tagnames[5] = "NIKTYP";
/*     */      this.fields[5]=this.fieldNIKTYP=new CharacterField(this.message, 110, 3, "NIKTYP");
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalNIKACC()
/*     */   {
/*  80 */     return this.fieldNIKACC.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public String getNIKACC()
/*     */   {
/*  87 */     return this.fieldNIKACC.getString();
/*     */   }
/*     */ 
/*     */   public String getNIKCCN()
/*     */   {
/*  94 */     return this.fieldNIKCCN.getString();
/*     */   }
/*     */ 
/*     */   public String getNIKDSC()
/*     */   {
/* 101 */     return this.fieldNIKDSC.getString();
/*     */   }
/*     */ 
/*     */   public String getNIKNNM()
/*     */   {
/* 108 */     return this.fieldNIKNNM.getString();
/*     */   }
/*     */ 
/*     */   public String getNIKTYP()
/*     */   {
/* 115 */     return this.fieldNIKTYP.getString();
/*     */   }
/*     */ 
/*     */   public String getNIKUSR()
/*     */   {
/* 122 */     return this.fieldNIKUSR.getString();
/*     */   }
/*     */ 
/*     */   public void setNIKACC(String newvalue)
/*     */   {
/* 129 */     this.fieldNIKACC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setNIKACC(BigDecimal newvalue)
/*     */   {
/* 136 */     this.fieldNIKACC.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setNIKCCN(String newvalue)
/*     */   {
/* 143 */     this.fieldNIKCCN.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setNIKDSC(String newvalue)
/*     */   {
/* 150 */     this.fieldNIKDSC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setNIKNNM(String newvalue)
/*     */   {
/* 157 */     this.fieldNIKNNM.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setNIKTYP(String newvalue)
/*     */   {
/* 164 */     this.fieldNIKTYP.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setNIKUSR(String newvalue)
/*     */   {
/* 171 */     this.fieldNIKUSR.setString(newvalue);
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.NIKDSJVMessage
 * JD-Core Version:    0.6.0
 */