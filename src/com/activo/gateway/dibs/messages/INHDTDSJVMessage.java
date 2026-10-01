/*     */ package com.activo.gateway.dibs.messages;
/*     */ 
/*     */ import java.math.BigDecimal;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*     */ 
/*     */ public class INHDTDSJVMessage extends MessageRecord
/*     */ {
/*  19 */   final int FIELDCOUNT = 9;
/*  20 */   private CharacterField fieldDSJINDUSR = null;
/*  21 */   private DecimalField fieldDSJINDVNO = null;
/*  22 */   private CharacterField fieldDSJINDNME = null;
/*  23 */   private DecimalField fieldDSJINDPDM = null;
/*  24 */   private DecimalField fieldDSJINDPDD = null;
/*  25 */   private DecimalField fieldDSJINDPDY = null;
/*  26 */   private DecimalField fieldDSJINDIAM = null;
/*  27 */   private CharacterField fieldDSJINDREF = null;
/*  28 */   private CharacterField fieldDSJINDFIM = null;
/*     */ 
/*     */   public INHDTDSJVMessage()
/*     */   {
/*  35 */     createFields();
/*  36 */     initialize();
/*     */   }
/*     */ 
/*     */   protected void createFields()
/*     */   {
/*  44 */     this.recordsize = 112;
/*  45 */     this.fileid = "1001004210209";
/*  46 */     this.recordid = "46FCFCCB90E5B";
/*  47 */     this.message = new byte[getByteLength()];
/*  48 */     this.formatname = "INHDTDSJV";
/*  49 */     this.fieldnames = new String[9];
/*  50 */     this.tagnames = new String[9];
/*  51 */     this.fields = new MessageField[9];
/*     */ 
/*  53 */     this.fieldnames[0] = "DSJINDUSR";
/*  54 */     this.tagnames[0] = "DSJINDUSR";
/*     */      this.fields[0]=this.fieldDSJINDUSR=new CharacterField(this.message, 10, 10, "DSJINDUSR");
/*     */ 
/*  57 */     this.fieldnames[1] = "DSJINDVNO";
/*  58 */     this.tagnames[1] = "DSJINDVNO";
/*     */      this.fields[1]=this.fieldDSJINDVNO=new DecimalField(this.message, 20, 10, 0, "DSJINDVNO");
/*     */ 
/*  61 */     this.fieldnames[2] = "DSJINDNME";
/*  62 */     this.tagnames[2] = "DSJINDNME";
/*     */      this.fields[2]=this.fieldDSJINDNME=new CharacterField(this.message, 30, 35, "DSJINDNME");
/*     */ 
/*  65 */     this.fieldnames[3] = "DSJINDPDM";
/*  66 */     this.tagnames[3] = "DSJINDPDM";
/*     */      this.fields[3]=this.fieldDSJINDPDM=new DecimalField(this.message, 65, 3, 0, "DSJINDPDM");
/*     */ 
/*  69 */     this.fieldnames[4] = "DSJINDPDD";
/*  70 */     this.tagnames[4] = "DSJINDPDD";
/*     */      this.fields[4]=this.fieldDSJINDPDD=new DecimalField(this.message, 68, 3, 0, "DSJINDPDD");
/*     */ 
/*  73 */     this.fieldnames[5] = "DSJINDPDY";
/*  74 */     this.tagnames[5] = "DSJINDPDY";
/*     */      this.fields[5]=this.fieldDSJINDPDY=new DecimalField(this.message, 71, 3, 0, "DSJINDPDY");
/*     */ 
/*  77 */     this.fieldnames[6] = "DSJINDIAM";
/*  78 */     this.tagnames[6] = "DSJINDIAM";
/*     */      this.fields[6]=this.fieldDSJINDIAM=new DecimalField(this.message, 74, 17, 2, "DSJINDIAM");
/*     */ 
/*  81 */     this.fieldnames[7] = "DSJINDREF";
/*  82 */     this.tagnames[7] = "DSJINDREF";
/*     */      this.fields[7]=this.fieldDSJINDREF=new CharacterField(this.message, 91, 30, "DSJINDREF");
/*     */ 
/*  85 */     this.fieldnames[8] = "DSJINDFIM";
/*  86 */     this.tagnames[8] = "DSJINDFIM";
/*     */      this.fields[8]=this.fieldDSJINDFIM=new CharacterField(this.message, 121, 1, "DSJINDFIM");
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalDSJINDIAM()
/*     */   {
/*  95 */     return this.fieldDSJINDIAM.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalDSJINDPDD()
/*     */   {
/* 102 */     return this.fieldDSJINDPDD.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalDSJINDPDM()
/*     */   {
/* 109 */     return this.fieldDSJINDPDM.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalDSJINDPDY()
/*     */   {
/* 116 */     return this.fieldDSJINDPDY.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalDSJINDVNO()
/*     */   {
/* 123 */     return this.fieldDSJINDVNO.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public String getDSJINDFIM()
/*     */   {
/* 130 */     return this.fieldDSJINDFIM.getString();
/*     */   }
/*     */ 
/*     */   public String getDSJINDIAM()
/*     */   {
/* 137 */     return this.fieldDSJINDIAM.getString();
/*     */   }
/*     */ 
/*     */   public String getDSJINDNME()
/*     */   {
/* 144 */     return this.fieldDSJINDNME.getString();
/*     */   }
/*     */ 
/*     */   public String getDSJINDPDD()
/*     */   {
/* 151 */     return this.fieldDSJINDPDD.getString();
/*     */   }
/*     */ 
/*     */   public String getDSJINDPDM()
/*     */   {
/* 158 */     return this.fieldDSJINDPDM.getString();
/*     */   }
/*     */ 
/*     */   public String getDSJINDPDY()
/*     */   {
/* 165 */     return this.fieldDSJINDPDY.getString();
/*     */   }
/*     */ 
/*     */   public String getDSJINDREF()
/*     */   {
/* 172 */     return this.fieldDSJINDREF.getString();
/*     */   }
/*     */ 
/*     */   public String getDSJINDUSR()
/*     */   {
/* 179 */     return this.fieldDSJINDUSR.getString();
/*     */   }
/*     */ 
/*     */   public String getDSJINDVNO()
/*     */   {
/* 186 */     return this.fieldDSJINDVNO.getString();
/*     */   }
/*     */ 
/*     */   public void setDSJINDFIM(String newvalue)
/*     */   {
/* 193 */     this.fieldDSJINDFIM.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJINDIAM(String newvalue)
/*     */   {
/* 200 */     this.fieldDSJINDIAM.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJINDIAM(BigDecimal newvalue)
/*     */   {
/* 207 */     this.fieldDSJINDIAM.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJINDNME(String newvalue)
/*     */   {
/* 214 */     this.fieldDSJINDNME.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJINDPDD(String newvalue)
/*     */   {
/* 221 */     this.fieldDSJINDPDD.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJINDPDD(BigDecimal newvalue)
/*     */   {
/* 228 */     this.fieldDSJINDPDD.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJINDPDM(String newvalue)
/*     */   {
/* 235 */     this.fieldDSJINDPDM.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJINDPDM(BigDecimal newvalue)
/*     */   {
/* 242 */     this.fieldDSJINDPDM.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJINDPDY(String newvalue)
/*     */   {
/* 249 */     this.fieldDSJINDPDY.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJINDPDY(BigDecimal newvalue)
/*     */   {
/* 256 */     this.fieldDSJINDPDY.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJINDREF(String newvalue)
/*     */   {
/* 263 */     this.fieldDSJINDREF.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJINDUSR(String newvalue)
/*     */   {
/* 270 */     this.fieldDSJINDUSR.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJINDVNO(String newvalue)
/*     */   {
/* 277 */     this.fieldDSJINDVNO.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDSJINDVNO(BigDecimal newvalue)
/*     */   {
/* 284 */     this.fieldDSJINDVNO.setBigDecimal(newvalue);
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.INHDTDSJVMessage
 * JD-Core Version:    0.6.0
 */