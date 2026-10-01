/*     */ package com.activo.gateway.dibs.messages;
/*     */ 
/*     */ import java.math.BigDecimal;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*     */ 
/*     */ public class INSTATISTMessage extends MessageRecord
/*     */ {
/*  19 */   final int FIELDCOUNT = 11;
/*  20 */   private CharacterField fieldINSUSR = null;
/*  21 */   private DecimalField fieldINSADT = null;
/*  22 */   private DecimalField fieldINSTMI = null;
/*  23 */   private DecimalField fieldINSACC = null;
/*  24 */   private DecimalField fieldINSCUN = null;
/*  25 */   private CharacterField fieldINSATY = null;
/*  26 */   private CharacterField fieldINSACT = null;
/*  27 */   private CharacterField fieldINSCCY = null;
/*  28 */   private DecimalField fieldINSAMT = null;
/*  29 */   private CharacterField fieldINSPGM = null;
/*  30 */   private CharacterField fieldINSFMT = null;
/*     */ 
/*     */   public INSTATISTMessage()
/*     */   {
/*  37 */     createFields();
/*  38 */     initialize();
/*     */   }
/*     */ 
/*     */   protected void createFields()
/*     */   {
/*  46 */     this.recordsize = 95;
/*  47 */     this.fileid = "1000803162854";
/*  48 */     this.recordid = "4FC1218A48B3C";
/*  49 */     this.message = new byte[getByteLength()];
/*  50 */     this.formatname = "INSTATIST";
/*  51 */     this.fieldnames = new String[11];
/*  52 */     this.tagnames = new String[11];
/*  53 */     this.fields = new MessageField[11];
/*     */ 
/*  55 */     this.fieldnames[0] = "INSUSR";
/*  56 */     this.tagnames[0] = "INSUSR";
/*     */      this.fields[0]=this.fieldINSUSR=new CharacterField(this.message, 10, 10, "INSUSR");
/*     */ 
/*  59 */     this.fieldnames[1] = "INSADT";
/*  60 */     this.tagnames[1] = "INSADT";
/*     */      this.fields[1]=this.fieldINSADT=new DecimalField(this.message, 20, 9, 0, "INSADT");
/*     */ 
/*  63 */     this.fieldnames[2] = "INSTMI";
/*  64 */     this.tagnames[2] = "INSTMI";
/*     */      this.fields[2]=this.fieldINSTMI=new DecimalField(this.message, 29, 7, 0, "INSTMI");
/*     */ 
/*  67 */     this.fieldnames[3] = "INSACC";
/*  68 */     this.tagnames[3] = "INSACC";
/*     */      this.fields[3]=this.fieldINSACC=new DecimalField(this.message, 36, 13, 0, "INSACC");
/*     */ 
/*  71 */     this.fieldnames[4] = "INSCUN";
/*  72 */     this.tagnames[4] = "INSCUN";
/*     */      this.fields[4]=this.fieldINSCUN=new DecimalField(this.message, 49, 10, 0, "INSCUN");
/*     */ 
/*  75 */     this.fieldnames[5] = "INSATY";
/*  76 */     this.tagnames[5] = "INSATY";
/*     */      this.fields[5]=this.fieldINSATY=new CharacterField(this.message, 59, 4, "INSATY");
/*     */ 
/*  79 */     this.fieldnames[6] = "INSACT";
/*  80 */     this.tagnames[6] = "INSACT";
/*     */      this.fields[6]=this.fieldINSACT=new CharacterField(this.message, 63, 2, "INSACT");
/*     */ 
/*  83 */     this.fieldnames[7] = "INSCCY";
/*  84 */     this.tagnames[7] = "INSCCY";
/*     */      this.fields[7]=this.fieldINSCCY=new CharacterField(this.message, 65, 3, "INSCCY");
/*     */ 
/*  87 */     this.fieldnames[8] = "INSAMT";
/*  88 */     this.tagnames[8] = "INSAMT";
/*     */      this.fields[8]=this.fieldINSAMT=new DecimalField(this.message, 68, 17, 2, "INSAMT");
/*     */ 
/*  91 */     this.fieldnames[9] = "INSPGM";
/*  92 */     this.tagnames[9] = "INSPGM";
/*     */      this.fields[9]=this.fieldINSPGM=new CharacterField(this.message, 85, 10, "INSPGM");
/*     */ 
/*  95 */     this.fieldnames[10] = "INSFMT";
/*  96 */     this.tagnames[10] = "INSFMT";
/*     */      this.fields[10]=this.fieldINSFMT=new CharacterField(this.message, 95, 10, "INSFMT");
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalINSACC()
/*     */   {
/* 105 */     return this.fieldINSACC.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalINSADT()
/*     */   {
/* 112 */     return this.fieldINSADT.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalINSAMT()
/*     */   {
/* 119 */     return this.fieldINSAMT.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalINSCUN()
/*     */   {
/* 126 */     return this.fieldINSCUN.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalINSTMI()
/*     */   {
/* 133 */     return this.fieldINSTMI.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public String getINSACC()
/*     */   {
/* 140 */     return this.fieldINSACC.getString();
/*     */   }
/*     */ 
/*     */   public String getINSACT()
/*     */   {
/* 147 */     return this.fieldINSACT.getString();
/*     */   }
/*     */ 
/*     */   public String getINSADT()
/*     */   {
/* 154 */     return this.fieldINSADT.getString();
/*     */   }
/*     */ 
/*     */   public String getINSAMT()
/*     */   {
/* 161 */     return this.fieldINSAMT.getString();
/*     */   }
/*     */ 
/*     */   public String getINSATY()
/*     */   {
/* 168 */     return this.fieldINSATY.getString();
/*     */   }
/*     */ 
/*     */   public String getINSCCY()
/*     */   {
/* 175 */     return this.fieldINSCCY.getString();
/*     */   }
/*     */ 
/*     */   public String getINSCUN()
/*     */   {
/* 182 */     return this.fieldINSCUN.getString();
/*     */   }
/*     */ 
/*     */   public String getINSFMT()
/*     */   {
/* 189 */     return this.fieldINSFMT.getString();
/*     */   }
/*     */ 
/*     */   public String getINSPGM()
/*     */   {
/* 196 */     return this.fieldINSPGM.getString();
/*     */   }
/*     */ 
/*     */   public String getINSTMI()
/*     */   {
/* 203 */     return this.fieldINSTMI.getString();
/*     */   }
/*     */ 
/*     */   public String getINSUSR()
/*     */   {
/* 210 */     return this.fieldINSUSR.getString();
/*     */   }
/*     */ 
/*     */   public void setINSACC(String newvalue)
/*     */   {
/* 217 */     this.fieldINSACC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setINSACC(BigDecimal newvalue)
/*     */   {
/* 224 */     this.fieldINSACC.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setINSACT(String newvalue)
/*     */   {
/* 231 */     this.fieldINSACT.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setINSADT(String newvalue)
/*     */   {
/* 238 */     this.fieldINSADT.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setINSADT(BigDecimal newvalue)
/*     */   {
/* 245 */     this.fieldINSADT.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setINSAMT(String newvalue)
/*     */   {
/* 252 */     this.fieldINSAMT.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setINSAMT(BigDecimal newvalue)
/*     */   {
/* 259 */     this.fieldINSAMT.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setINSATY(String newvalue)
/*     */   {
/* 266 */     this.fieldINSATY.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setINSCCY(String newvalue)
/*     */   {
/* 273 */     this.fieldINSCCY.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setINSCUN(String newvalue)
/*     */   {
/* 280 */     this.fieldINSCUN.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setINSCUN(BigDecimal newvalue)
/*     */   {
/* 287 */     this.fieldINSCUN.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setINSFMT(String newvalue)
/*     */   {
/* 294 */     this.fieldINSFMT.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setINSPGM(String newvalue)
/*     */   {
/* 301 */     this.fieldINSPGM.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setINSTMI(String newvalue)
/*     */   {
/* 308 */     this.fieldINSTMI.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setINSTMI(BigDecimal newvalue)
/*     */   {
/* 315 */     this.fieldINSTMI.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setINSUSR(String newvalue)
/*     */   {
/* 322 */     this.fieldINSUSR.setString(newvalue);
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.INSTATISTMessage
 * JD-Core Version:    0.6.0
 */