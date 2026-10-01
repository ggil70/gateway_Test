/*     */ package com.activo.gateway.dibs.messages;
/*     */ 
/*     */ import java.math.BigDecimal;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*     */ 
/*     */ public class CDSDSJVBICMessage extends MessageRecord
/*     */ {
/*  19 */   final int FIELDCOUNT = 12;
/*  20 */   private CharacterField fieldCDSCERUSER = null;
/*  21 */   private DecimalField fieldCDSCERCRT = null;
/*  22 */   private CharacterField fieldCDSCERMDA = null;
/*  23 */   private DecimalField fieldCDSCERMNT = null;
/*  24 */   private DecimalField fieldCDSCERSAL = null;
/*  25 */   private DecimalField fieldCDSCERACM = null;
/*  26 */   private DecimalField fieldCDSCERAMM = null;
/*  27 */   private DecimalField fieldCDSCERFEM = null;
/*  28 */   private DecimalField fieldCDSCERFVL = null;
/*  29 */   private DecimalField fieldCDSCERFVN = null;
/*  30 */   private DecimalField fieldCDSCERTBS = null;
/*  31 */   private CharacterField fieldCDSCERNME = null;
/*     */ 
/*     */   public CDSDSJVBICMessage()
/*     */   {
/*  38 */     createFields();
/*  39 */     initialize();
/*     */   }
/*     */ 
/*     */   protected void createFields()
/*     */   {
/*  48 */     this.recordsize = 187;
/*  49 */     this.fileid = "1011102090334";
/*  50 */     this.recordid = "49BEF4962DFAC";
/*  51 */     this.message = new byte[getByteLength()];
/*  52 */     this.formatname = "CDSDSJVBIC";
/*  53 */     this.fieldnames = new String[12];
/*  54 */     this.tagnames = new String[12];
/*  55 */     this.fields = new MessageField[12];
/*     */ 
/*  57 */     this.fieldnames[0] = "CDSCERUSER";
/*  58 */     this.tagnames[0] = "CDSCERUSER";
/*     */      this.fields[0]=this.fieldCDSCERUSER=new CharacterField(this.message, 10, 10, "CDSCERUSER");
/*     */ 
/*  61 */     this.fieldnames[1] = "CDSCERCRT";
/*  62 */     this.tagnames[1] = "CDSCERCRT";
/*     */      this.fields[1]=this.fieldCDSCERCRT=new DecimalField(this.message, 20, 13, 0, "CDSCERCRT");
/*     */ 
/*  65 */     this.fieldnames[2] = "CDSCERMDA";
/*  66 */     this.tagnames[2] = "CDSCERMDA";
/*     */      this.fields[2]=this.fieldCDSCERMDA=new CharacterField(this.message, 33, 3, "CDSCERMDA");
/*     */ 
/*  69 */     this.fieldnames[3] = "CDSCERMNT";
/*  70 */     this.tagnames[3] = "CDSCERMNT";
/*     */      this.fields[3]=this.fieldCDSCERMNT=new DecimalField(this.message, 36, 15, 2, "CDSCERMNT");
/*     */ 
/*  73 */     this.fieldnames[4] = "CDSCERSAL";
/*  74 */     this.tagnames[4] = "CDSCERSAL";
/*     */      this.fields[4]=this.fieldCDSCERSAL=new DecimalField(this.message, 51, 15, 2, "CDSCERSAL");
/*     */ 
/*  77 */     this.fieldnames[5] = "CDSCERACM";
/*  78 */     this.tagnames[5] = "CDSCERACM";
/*     */      this.fields[5]=this.fieldCDSCERACM=new DecimalField(this.message, 66, 15, 2, "CDSCERACM");
/*     */ 
/*  81 */     this.fieldnames[6] = "CDSCERAMM";
/*  82 */     this.tagnames[6] = "CDSCERAMM";
/*     */      this.fields[6]=this.fieldCDSCERAMM=new DecimalField(this.message, 81, 15, 2, "CDSCERAMM");
/*     */ 
/*  85 */     this.fieldnames[7] = "CDSCERFEM";
/*  86 */     this.tagnames[7] = "CDSCERFEM";
/*     */      this.fields[7]=this.fieldCDSCERFEM=new DecimalField(this.message, 96, 9, 0, "CDSCERFEM");
/*     */ 
/*  89 */     this.fieldnames[8] = "CDSCERFVL";
/*  90 */     this.tagnames[8] = "CDSCERFVL";
/*     */      this.fields[8]=this.fieldCDSCERFVL=new DecimalField(this.message, 105, 9, 0, "CDSCERFVL");
/*     */ 
/*  93 */     this.fieldnames[9] = "CDSCERFVN";
/*  94 */     this.tagnames[9] = "CDSCERFVN";
/*     */      this.fields[9]=this.fieldCDSCERFVN=new DecimalField(this.message, 114, 9, 0, "CDSCERFVN");
/*     */ 
/*  97 */     this.fieldnames[10] = "CDSCERTBS";
/*  98 */     this.tagnames[10] = "CDSCERTBS";
/*     */      this.fields[10]=this.fieldCDSCERTBS=new DecimalField(this.message, 123, 11, 6, "CDSCERTBS");
/*     */ 
/* 101 */     this.fieldnames[11] = "CDSCERNME";
/* 102 */     this.tagnames[11] = "CDSCERNME";
/*     */      this.fields[11]=this.fieldCDSCERNME=new CharacterField(this.message, 134, 63, "CDSCERNME");
/*     */   }
/*     */ 
/*     */   public void setCDSCERUSER(String newvalue)
/*     */   {
/* 112 */     this.fieldCDSCERUSER.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getCDSCERUSER()
/*     */   {
/* 120 */     return this.fieldCDSCERUSER.getString();
/*     */   }
/*     */ 
/*     */   public void setCDSCERCRT(String newvalue)
/*     */   {
/* 128 */     this.fieldCDSCERCRT.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getCDSCERCRT()
/*     */   {
/* 136 */     return this.fieldCDSCERCRT.getString();
/*     */   }
/*     */ 
/*     */   public void setCDSCERCRT(BigDecimal newvalue)
/*     */   {
/* 144 */     this.fieldCDSCERCRT.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalCDSCERCRT()
/*     */   {
/* 152 */     return this.fieldCDSCERCRT.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setCDSCERMDA(String newvalue)
/*     */   {
/* 160 */     this.fieldCDSCERMDA.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getCDSCERMDA()
/*     */   {
/* 168 */     return this.fieldCDSCERMDA.getString();
/*     */   }
/*     */ 
/*     */   public void setCDSCERMNT(String newvalue)
/*     */   {
/* 176 */     this.fieldCDSCERMNT.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getCDSCERMNT()
/*     */   {
/* 184 */     return this.fieldCDSCERMNT.getString();
/*     */   }
/*     */ 
/*     */   public void setCDSCERMNT(BigDecimal newvalue)
/*     */   {
/* 192 */     this.fieldCDSCERMNT.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalCDSCERMNT()
/*     */   {
/* 200 */     return this.fieldCDSCERMNT.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setCDSCERSAL(String newvalue)
/*     */   {
/* 208 */     this.fieldCDSCERSAL.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getCDSCERSAL()
/*     */   {
/* 216 */     return this.fieldCDSCERSAL.getString();
/*     */   }
/*     */ 
/*     */   public void setCDSCERSAL(BigDecimal newvalue)
/*     */   {
/* 224 */     this.fieldCDSCERSAL.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalCDSCERSAL()
/*     */   {
/* 232 */     return this.fieldCDSCERSAL.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setCDSCERACM(String newvalue)
/*     */   {
/* 240 */     this.fieldCDSCERACM.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getCDSCERACM()
/*     */   {
/* 248 */     return this.fieldCDSCERACM.getString();
/*     */   }
/*     */ 
/*     */   public void setCDSCERACM(BigDecimal newvalue)
/*     */   {
/* 256 */     this.fieldCDSCERACM.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalCDSCERACM()
/*     */   {
/* 264 */     return this.fieldCDSCERACM.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setCDSCERAMM(String newvalue)
/*     */   {
/* 272 */     this.fieldCDSCERAMM.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getCDSCERAMM()
/*     */   {
/* 280 */     return this.fieldCDSCERAMM.getString();
/*     */   }
/*     */ 
/*     */   public void setCDSCERAMM(BigDecimal newvalue)
/*     */   {
/* 288 */     this.fieldCDSCERAMM.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalCDSCERAMM()
/*     */   {
/* 296 */     return this.fieldCDSCERAMM.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setCDSCERFEM(String newvalue)
/*     */   {
/* 304 */     this.fieldCDSCERFEM.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getCDSCERFEM()
/*     */   {
/* 312 */     return this.fieldCDSCERFEM.getString();
/*     */   }
/*     */ 
/*     */   public void setCDSCERFEM(BigDecimal newvalue)
/*     */   {
/* 320 */     this.fieldCDSCERFEM.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalCDSCERFEM()
/*     */   {
/* 328 */     return this.fieldCDSCERFEM.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setCDSCERFVL(String newvalue)
/*     */   {
/* 336 */     this.fieldCDSCERFVL.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getCDSCERFVL()
/*     */   {
/* 344 */     return this.fieldCDSCERFVL.getString();
/*     */   }
/*     */ 
/*     */   public void setCDSCERFVL(BigDecimal newvalue)
/*     */   {
/* 352 */     this.fieldCDSCERFVL.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalCDSCERFVL()
/*     */   {
/* 360 */     return this.fieldCDSCERFVL.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setCDSCERFVN(String newvalue)
/*     */   {
/* 368 */     this.fieldCDSCERFVN.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getCDSCERFVN()
/*     */   {
/* 376 */     return this.fieldCDSCERFVN.getString();
/*     */   }
/*     */ 
/*     */   public void setCDSCERFVN(BigDecimal newvalue)
/*     */   {
/* 384 */     this.fieldCDSCERFVN.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalCDSCERFVN()
/*     */   {
/* 392 */     return this.fieldCDSCERFVN.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setCDSCERTBS(String newvalue)
/*     */   {
/* 400 */     this.fieldCDSCERTBS.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getCDSCERTBS()
/*     */   {
/* 408 */     return this.fieldCDSCERTBS.getString();
/*     */   }
/*     */ 
/*     */   public void setCDSCERTBS(BigDecimal newvalue)
/*     */   {
/* 416 */     this.fieldCDSCERTBS.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalCDSCERTBS()
/*     */   {
/* 424 */     return this.fieldCDSCERTBS.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setCDSCERNME(String newvalue)
/*     */   {
/* 432 */     this.fieldCDSCERNME.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getCDSCERNME()
/*     */   {
/* 440 */     return this.fieldCDSCERNME.getString();
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.CDSDSJVBICMessage
 * JD-Core Version:    0.6.0
 */