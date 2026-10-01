/*     */ package com.activo.gateway.dibs.messages;
/*     */ 
/*     */ import java.math.BigDecimal;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*     */ 
/*     */ public class INHSUDSJVMessage extends MessageRecord
/*     */ {
/*  19 */   final int FIELDCOUNT = 10;
/*  20 */   private CharacterField fieldDSJINHUSR = null;
/*  21 */   private DecimalField fieldDSJINHVNO = null;
/*  22 */   private CharacterField fieldDSJINHNME = null;
/*  23 */   private DecimalField fieldDSJINHLDM = null;
/*  24 */   private DecimalField fieldDSJINHLDD = null;
/*  25 */   private DecimalField fieldDSJINHLDY = null;
/*  26 */   private DecimalField fieldDSJINHYTD = null;
/*  27 */   private DecimalField fieldDSJINHLTD = null;
/*  28 */   private DecimalField fieldDSJINHLPA = null;
/*  29 */   private CharacterField fieldDSJINHFIM = null;
/*     */ 
/*     */   public INHSUDSJVMessage()
/*     */   {
/*  36 */     createFields();
/*  37 */     initialize();
/*     */   }
/*     */ 
/*     */   protected void createFields()
/*     */   {
/*  46 */     this.recordsize = 110;
/*  47 */     this.fileid = "1010413114830";
/*  48 */     this.recordid = "35F1885489016";
/*  49 */     this.message = new byte[getByteLength()];
/*  50 */     this.formatname = "INHSUDSJV";
/*  51 */     this.fieldnames = new String[10];
/*  52 */     this.tagnames = new String[10];
/*  53 */     this.fields = new MessageField[10];
/*     */ 
/*  55 */     this.fieldnames[0] = "DSJINHUSR";
/*  56 */     this.tagnames[0] = "DSJINHUSR";
/*     */      this.fields[0]=this.fieldDSJINHUSR=new CharacterField(this.message, 10, 10, "DSJINHUSR");
/*     */ 
/*  59 */     this.fieldnames[1] = "DSJINHVNO";
/*  60 */     this.tagnames[1] = "DSJINHVNO";
/*     */      this.fields[1]=this.fieldDSJINHVNO=new DecimalField(this.message, 20, 10, 0, "DSJINHVNO");
/*     */ 
/*  63 */     this.fieldnames[2] = "DSJINHNME";
/*  64 */     this.tagnames[2] = "DSJINHNME";
/*     */      this.fields[2]=this.fieldDSJINHNME=new CharacterField(this.message, 30, 35, "DSJINHNME");
/*     */ 
/*  67 */     this.fieldnames[3] = "DSJINHLDM";
/*  68 */     this.tagnames[3] = "DSJINHLDM";
/*     */      this.fields[3]=this.fieldDSJINHLDM=new DecimalField(this.message, 65, 3, 0, "DSJINHLDM");
/*     */ 
/*  71 */     this.fieldnames[4] = "DSJINHLDD";
/*  72 */     this.tagnames[4] = "DSJINHLDD";
/*     */      this.fields[4]=this.fieldDSJINHLDD=new DecimalField(this.message, 68, 3, 0, "DSJINHLDD");
/*     */ 
/*  75 */     this.fieldnames[5] = "DSJINHLDY";
/*  76 */     this.tagnames[5] = "DSJINHLDY";
/*     */      this.fields[5]=this.fieldDSJINHLDY=new DecimalField(this.message, 71, 3, 0, "DSJINHLDY");
/*     */ 
/*  79 */     this.fieldnames[6] = "DSJINHYTD";
/*  80 */     this.tagnames[6] = "DSJINHYTD";
/*     */      this.fields[6]=this.fieldDSJINHYTD=new DecimalField(this.message, 74, 15, 2, "DSJINHYTD");
/*     */ 
/*  83 */     this.fieldnames[7] = "DSJINHLTD";
/*  84 */     this.tagnames[7] = "DSJINHLTD";
/*     */      this.fields[7]=this.fieldDSJINHLTD=new DecimalField(this.message, 89, 15, 2, "DSJINHLTD");
/*     */ 
/*  87 */     this.fieldnames[8] = "DSJINHLPA";
/*  88 */     this.tagnames[8] = "DSJINHLPA";
/*     */      this.fields[8]=this.fieldDSJINHLPA=new DecimalField(this.message, 104, 15, 2, "DSJINHLPA");
/*     */ 
/*  91 */     this.fieldnames[9] = "DSJINHFIM";
/*  92 */     this.tagnames[9] = "DSJINHFIM";
/*     */      this.fields[9]=this.fieldDSJINHFIM=new CharacterField(this.message, 119, 1, "DSJINHFIM");
/*     */   }
/*     */ 
/*     */   public void setDSJINHUSR(String newvalue)
/*     */   {
/* 102 */     this.fieldDSJINHUSR.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getDSJINHUSR()
/*     */   {
/* 110 */     return this.fieldDSJINHUSR.getString();
/*     */   }
/*     */ 
/*     */   public void setDSJINHVNO(String newvalue)
/*     */   {
/* 118 */     this.fieldDSJINHVNO.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getDSJINHVNO()
/*     */   {
/* 126 */     return this.fieldDSJINHVNO.getString();
/*     */   }
/*     */ 
/*     */   public void setDSJINHVNO(BigDecimal newvalue)
/*     */   {
/* 134 */     this.fieldDSJINHVNO.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalDSJINHVNO()
/*     */   {
/* 142 */     return this.fieldDSJINHVNO.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setDSJINHNME(String newvalue)
/*     */   {
/* 150 */     this.fieldDSJINHNME.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getDSJINHNME()
/*     */   {
/* 158 */     return this.fieldDSJINHNME.getString();
/*     */   }
/*     */ 
/*     */   public void setDSJINHLDM(String newvalue)
/*     */   {
/* 166 */     this.fieldDSJINHLDM.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getDSJINHLDM()
/*     */   {
/* 174 */     return this.fieldDSJINHLDM.getString();
/*     */   }
/*     */ 
/*     */   public void setDSJINHLDM(BigDecimal newvalue)
/*     */   {
/* 182 */     this.fieldDSJINHLDM.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalDSJINHLDM()
/*     */   {
/* 190 */     return this.fieldDSJINHLDM.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setDSJINHLDD(String newvalue)
/*     */   {
/* 198 */     this.fieldDSJINHLDD.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getDSJINHLDD()
/*     */   {
/* 206 */     return this.fieldDSJINHLDD.getString();
/*     */   }
/*     */ 
/*     */   public void setDSJINHLDD(BigDecimal newvalue)
/*     */   {
/* 214 */     this.fieldDSJINHLDD.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalDSJINHLDD()
/*     */   {
/* 222 */     return this.fieldDSJINHLDD.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setDSJINHLDY(String newvalue)
/*     */   {
/* 230 */     this.fieldDSJINHLDY.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getDSJINHLDY()
/*     */   {
/* 238 */     return this.fieldDSJINHLDY.getString();
/*     */   }
/*     */ 
/*     */   public void setDSJINHLDY(BigDecimal newvalue)
/*     */   {
/* 246 */     this.fieldDSJINHLDY.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalDSJINHLDY()
/*     */   {
/* 254 */     return this.fieldDSJINHLDY.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setDSJINHYTD(String newvalue)
/*     */   {
/* 262 */     this.fieldDSJINHYTD.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getDSJINHYTD()
/*     */   {
/* 270 */     return this.fieldDSJINHYTD.getString();
/*     */   }
/*     */ 
/*     */   public void setDSJINHYTD(BigDecimal newvalue)
/*     */   {
/* 278 */     this.fieldDSJINHYTD.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalDSJINHYTD()
/*     */   {
/* 286 */     return this.fieldDSJINHYTD.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setDSJINHLTD(String newvalue)
/*     */   {
/* 294 */     this.fieldDSJINHLTD.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getDSJINHLTD()
/*     */   {
/* 302 */     return this.fieldDSJINHLTD.getString();
/*     */   }
/*     */ 
/*     */   public void setDSJINHLTD(BigDecimal newvalue)
/*     */   {
/* 310 */     this.fieldDSJINHLTD.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalDSJINHLTD()
/*     */   {
/* 318 */     return this.fieldDSJINHLTD.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setDSJINHLPA(String newvalue)
/*     */   {
/* 326 */     this.fieldDSJINHLPA.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getDSJINHLPA()
/*     */   {
/* 334 */     return this.fieldDSJINHLPA.getString();
/*     */   }
/*     */ 
/*     */   public void setDSJINHLPA(BigDecimal newvalue)
/*     */   {
/* 342 */     this.fieldDSJINHLPA.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalDSJINHLPA()
/*     */   {
/* 350 */     return this.fieldDSJINHLPA.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setDSJINHFIM(String newvalue)
/*     */   {
/* 358 */     this.fieldDSJINHFIM.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getDSJINHFIM()
/*     */   {
/* 366 */     return this.fieldDSJINHFIM.getString();
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.INHSUDSJVMessage
 * JD-Core Version:    0.6.0
 */