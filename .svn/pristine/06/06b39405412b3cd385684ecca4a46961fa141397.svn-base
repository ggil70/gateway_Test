/*     */ package com.activo.gateway.dibs.messages;
/*     */ 
/*     */ import java.math.BigDecimal;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*     */ 
/*     */ public class IMSSGDSJVMessage extends MessageRecord
/*     */ {
/*  19 */   final int FIELDCOUNT = 11;
/*  20 */   private CharacterField fieldDSJIMSUSR = null;
/*  21 */   private DecimalField fieldDSJNUM = null;
/*  22 */   private CharacterField fieldDSJIMSPRD = null;
/*  23 */   private DecimalField fieldDSJIMSCUN = null;
/*  24 */   private DecimalField fieldDSJIMSSDTE = null;
/*  25 */   private DecimalField fieldDSJIMSSTIM = null;
/*  26 */   private CharacterField fieldDSJIMSTXT = null;
/*  27 */   private CharacterField fieldDSJIMSLNKT = null;
/*  28 */   private CharacterField fieldDSJIMSKEY = null;
/*  29 */   private CharacterField fieldDSJIMSNME = null;
/*  30 */   private CharacterField fieldDSJIMSFIN = null;
/*     */ 
/*     */   public IMSSGDSJVMessage()
/*     */   {
/*  37 */     createFields();
/*  38 */     initialize();
/*     */   }
/*     */ 
/*     */   protected void createFields()
/*     */   {
/*  46 */     this.recordsize = 207;
/*  47 */     this.fileid = "1000802211812";
/*  48 */     this.recordid = "399AD3A53A3D3";
/*  49 */     this.message = new byte[getByteLength()];
/*  50 */     this.formatname = "IMSSGDSJV";
/*  51 */     this.fieldnames = new String[11];
/*  52 */     this.tagnames = new String[11];
/*  53 */     this.fields = new MessageField[11];
/*     */ 
/*  55 */     this.fieldnames[0] = "DSJIMSUSR";
/*  56 */     this.tagnames[0] = "DSJIMSUSR";
/*     */      this.fields[0]=this.fieldDSJIMSUSR=new CharacterField(this.message, 10, 10, "DSJIMSUSR");
/*     */ 
/*  59 */     this.fieldnames[1] = "DSJNUM";
/*  60 */     this.tagnames[1] = "DSJNUM";
/*     */      this.fields[1]=this.fieldDSJNUM=new DecimalField(this.message, 20, 7, 0, "DSJNUM");
/*     */ 
/*  63 */     this.fieldnames[2] = "DSJIMSPRD";
/*  64 */     this.tagnames[2] = "DSJIMSPRD";
/*     */      this.fields[2]=this.fieldDSJIMSPRD=new CharacterField(this.message, 27, 4, "DSJIMSPRD");
/*     */ 
/*  67 */     this.fieldnames[3] = "DSJIMSCUN";
/*  68 */     this.tagnames[3] = "DSJIMSCUN";
/*     */      this.fields[3]=this.fieldDSJIMSCUN=new DecimalField(this.message, 31, 10, 0, "DSJIMSCUN");
/*     */ 
/*  71 */     this.fieldnames[4] = "DSJIMSSDTE";
/*  72 */     this.tagnames[4] = "DSJIMSSDTE";
/*     */      this.fields[4]=this.fieldDSJIMSSDTE=new DecimalField(this.message, 41, 9, 0, "DSJIMSSDTE");
/*     */ 
/*  75 */     this.fieldnames[5] = "DSJIMSSTIM";
/*  76 */     this.tagnames[5] = "DSJIMSSTIM";
/*     */      this.fields[5]=this.fieldDSJIMSSTIM=new DecimalField(this.message, 50, 7, 0, "DSJIMSSTIM");
/*     */ 
/*  79 */     this.fieldnames[6] = "DSJIMSTXT";
/*  80 */     this.tagnames[6] = "DSJIMSTXT";
/*     */      this.fields[6]=this.fieldDSJIMSTXT=new CharacterField(this.message, 57, 80, "DSJIMSTXT");
/*     */ 
/*  83 */     this.fieldnames[7] = "DSJIMSLNKT";
/*  84 */     this.tagnames[7] = "DSJIMSLNKT";
/*     */      this.fields[7]=this.fieldDSJIMSLNKT=new CharacterField(this.message, 137, 2, "DSJIMSLNKT");
/*     */ 
/*  87 */     this.fieldnames[8] = "DSJIMSKEY";
/*  88 */     this.tagnames[8] = "DSJIMSKEY";
/*     */      this.fields[8]=this.fieldDSJIMSKEY=new CharacterField(this.message, 139, 32, "DSJIMSKEY");
/*     */ 
/*  91 */     this.fieldnames[9] = "DSJIMSNME";
/*  92 */     this.tagnames[9] = "DSJIMSNME";
/*     */      this.fields[9]=this.fieldDSJIMSNME=new CharacterField(this.message, 171, 45, "DSJIMSNME");
/*     */ 
/*  95 */     this.fieldnames[10] = "DSJIMSFIN";
/*  96 */     this.tagnames[10] = "DSJIMSFIN";
/*     */      this.fields[10]=this.fieldDSJIMSFIN=new CharacterField(this.message, 216, 1, "DSJIMSFIN");
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalDSJIMSCUN()
/*     */   {
/* 105 */     return this.fieldDSJIMSCUN.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalDSJIMSSDTE()
/*     */   {
/* 112 */     return this.fieldDSJIMSSDTE.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalDSJIMSSTIM()
/*     */   {
/* 119 */     return this.fieldDSJIMSSTIM.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalDSJNUM()
/*     */   {
/* 126 */     return this.fieldDSJNUM.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public String getDSJIMSCUN()
/*     */   {
/* 133 */     return this.fieldDSJIMSCUN.getString();
/*     */   }
/*     */ 
/*     */   public String getDSJIMSFIN()
/*     */   {
/* 140 */     return this.fieldDSJIMSFIN.getString();
/*     */   }
/*     */ 
/*     */   public String getDSJIMSKEY()
/*     */   {
/* 147 */     return this.fieldDSJIMSKEY.getString();
/*     */   }
/*     */ 
/*     */   public String getDSJIMSLNKT()
/*     */   {
/* 154 */     return this.fieldDSJIMSLNKT.getString();
/*     */   }
/*     */ 
/*     */   public String getDSJIMSNME()
/*     */   {
/* 161 */     return this.fieldDSJIMSNME.getString();
/*     */   }
/*     */ 
/*     */   public String getDSJIMSPRD()
/*     */   {
/* 168 */     return this.fieldDSJIMSPRD.getString();
/*     */   }
/*     */ 
/*     */   public String getDSJIMSSDTE()
/*     */   {
/* 175 */     return this.fieldDSJIMSSDTE.getString();
/*     */   }
/*     */ 
/*     */   public String getDSJIMSSTIM()
/*     */   {
/* 182 */     return this.fieldDSJIMSSTIM.getString();
/*     */   }
/*     */ 
/*     */   public String getDSJIMSTXT()
/*     */   {
/* 189 */     return this.fieldDSJIMSTXT.getString();
/*     */   }
/*     */ 
/*     */   public String getDSJIMSUSR()
/*     */   {
/* 196 */     return this.fieldDSJIMSUSR.getString();
/*     */   }
/*     */ 
/*     */   public String getDSJNUM()
/*     */   {
/* 203 */     return this.fieldDSJNUM.getString();
/*     */   }
/*     */ 
/*     */   public void setDSJIMSCUN(String newvalue)
/*     */   {
/* 210 */     this.fieldDSJIMSCUN.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJIMSCUN(BigDecimal newvalue)
/*     */   {
/* 217 */     this.fieldDSJIMSCUN.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJIMSFIN(String newvalue)
/*     */   {
/* 224 */     this.fieldDSJIMSFIN.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJIMSKEY(String newvalue)
/*     */   {
/* 231 */     this.fieldDSJIMSKEY.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJIMSLNKT(String newvalue)
/*     */   {
/* 238 */     this.fieldDSJIMSLNKT.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJIMSNME(String newvalue)
/*     */   {
/* 245 */     this.fieldDSJIMSNME.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJIMSPRD(String newvalue)
/*     */   {
/* 252 */     this.fieldDSJIMSPRD.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJIMSSDTE(String newvalue)
/*     */   {
/* 259 */     this.fieldDSJIMSSDTE.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJIMSSDTE(BigDecimal newvalue)
/*     */   {
/* 266 */     this.fieldDSJIMSSDTE.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJIMSSTIM(String newvalue)
/*     */   {
/* 273 */     this.fieldDSJIMSSTIM.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJIMSSTIM(BigDecimal newvalue)
/*     */   {
/* 280 */     this.fieldDSJIMSSTIM.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJIMSTXT(String newvalue)
/*     */   {
/* 287 */     this.fieldDSJIMSTXT.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJIMSUSR(String newvalue)
/*     */   {
/* 294 */     this.fieldDSJIMSUSR.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJNUM(String newvalue)
/*     */   {
/* 301 */     this.fieldDSJNUM.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJNUM(BigDecimal newvalue)
/*     */   {
/* 308 */     this.fieldDSJNUM.setBigDecimal(newvalue);
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.IMSSGDSJVMessage
 * JD-Core Version:    0.6.0
 */