/*     */ package com.activo.gateway.dibs.messages;
/*     */ 
/*     */ import java.math.BigDecimal;
import java.util.Hashtable;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*     */ 
/*     */ public class STMRDSJVMessage extends MessageRecord
/*     */ {
/*  21 */   static final String[] fldnames = { 
/*  22 */     "RSTUSR", 
/*  23 */     "RSTACC", 
/*  24 */     "RSTCAF", 
/*  25 */     "RSTFD1", 
/*  26 */     "RSTFD2", 
/*  27 */     "RSTFD3", 
/*  28 */     "RSTTD1", 
/*  29 */     "RSTTD2", 
/*  30 */     "RSTTD3", 
/*  31 */     "RSTFCK", 
/*  32 */     "RSTTCK", 
/*  33 */     "RSTFAM", 
/*  34 */     "RSTTAM", 
/*  35 */     "RSTFRC", 
/*  36 */     "RSTFBL" };
/*     */ 
/*  38 */   static final String[] tnames = { 
/*  39 */     "RSTUSR", 
/*  40 */     "RSTACC", 
/*  41 */     "RSTCAF", 
/*  42 */     "RSTFD1", 
/*  43 */     "RSTFD2", 
/*  44 */     "RSTFD3", 
/*  45 */     "RSTTD1", 
/*  46 */     "RSTTD2", 
/*  47 */     "RSTTD3", 
/*  48 */     "RSTFCK", 
/*  49 */     "RSTTCK", 
/*  50 */     "RSTFAM", 
/*  51 */     "RSTTAM", 
/*  52 */     "RSTFRC", 
/*  53 */     "RSTFBL" };
/*     */   static final String fid = "1071019113830";
/*     */   static final String rid = "428723E1DBE71";
/*     */   static final String fmtname = "STMRDSJV";
/*  58 */   final int FIELDCOUNT = 15;
/*  59 */   private static Hashtable tlookup = new Hashtable();
/*  60 */   private CharacterField fieldRSTUSR = null;
/*  61 */   private DecimalField fieldRSTACC = null;
/*  62 */   private CharacterField fieldRSTCAF = null;
/*  63 */   private DecimalField fieldRSTFD1 = null;
/*  64 */   private DecimalField fieldRSTFD2 = null;
/*  65 */   private DecimalField fieldRSTFD3 = null;
/*  66 */   private DecimalField fieldRSTTD1 = null;
/*  67 */   private DecimalField fieldRSTTD2 = null;
/*  68 */   private DecimalField fieldRSTTD3 = null;
/*  69 */   private DecimalField fieldRSTFCK = null;
/*  70 */   private DecimalField fieldRSTTCK = null;
/*  71 */   private DecimalField fieldRSTFAM = null;
/*  72 */   private DecimalField fieldRSTTAM = null;
/*  73 */   private DecimalField fieldRSTFRC = null;
/*  74 */   private DecimalField fieldRSTFBL = null;
/*     */ 
/*     */   public STMRDSJVMessage()
/*     */   {
/*  81 */     createFields();
/*  82 */     initialize();
/*     */   }
/*     */ 
/*     */   protected void createFields()
/*     */   {
/*  91 */     this.recordsize = 121;
/*  92 */     this.fileid = "1071019113830";
/*  93 */     this.recordid = "428723E1DBE71";
/*  94 */     this.message = new byte[getByteLength()];
/*  95 */     this.formatname = "STMRDSJV";
/*  96 */     this.fieldnames = fldnames;
/*  97 */     this.tagnames = tnames;
/*  98 */     this.fields = new MessageField[15];
/*     */      this.fields[0]=this.fieldRSTUSR=new CharacterField(this.message, 10, 10, "RSTUSR");
/*     */      this.fields[1]=this.fieldRSTACC=new DecimalField(this.message, 20, 13, 0, "RSTACC");
/*     */      this.fields[2]=this.fieldRSTCAF=new CharacterField(this.message, 33, 1, "RSTCAF");
/*     */      this.fields[3]=this.fieldRSTFD1=new DecimalField(this.message, 34, 3, 0, "RSTFD1");
/*     */      this.fields[4]=this.fieldRSTFD2=new DecimalField(this.message, 37, 3, 0, "RSTFD2");
/*     */      this.fields[5]=this.fieldRSTFD3=new DecimalField(this.message, 40, 3, 0, "RSTFD3");
/*     */      this.fields[6]=this.fieldRSTTD1=new DecimalField(this.message, 43, 3, 0, "RSTTD1");
/*     */      this.fields[7]=this.fieldRSTTD2=new DecimalField(this.message, 46, 3, 0, "RSTTD2");
/*     */      this.fields[8]=this.fieldRSTTD3=new DecimalField(this.message, 49, 3, 0, "RSTTD3");
/*     */      this.fields[9]=this.fieldRSTFCK=new DecimalField(this.message, 52, 10, 0, "RSTFCK");
/*     */      this.fields[10]=this.fieldRSTTCK=new DecimalField(this.message, 62, 10, 0, "RSTTCK");
/*     */      this.fields[11]=this.fieldRSTFAM=new DecimalField(this.message, 72, 17, 2, "RSTFAM");
/*     */      this.fields[12]=this.fieldRSTTAM=new DecimalField(this.message, 89, 17, 2, "RSTTAM");
/*     */      this.fields[13]=this.fieldRSTFRC=new DecimalField(this.message, 106, 8, 0, "RSTFRC");
/*     */      this.fields[14]=this.fieldRSTFBL=new DecimalField(this.message, 114, 17, 2, "RSTFBL");
/*     */ 
/* 131 */     synchronized (tlookup)
/*     */     {
/* 133 */       if (tlookup.isEmpty())
/*     */       {
/* 135 */         for (int i = 0; i < tnames.length; i++) {
/* 136 */           tlookup.put(tnames[i], new Integer(i));
/*     */         }
/*     */       }
/*     */     }
/* 140 */     this.taglookup = tlookup;
/*     */   }
/*     */ 
/*     */   public void setRSTUSR(String newvalue)
/*     */   {
/* 148 */     this.fieldRSTUSR.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getRSTUSR()
/*     */   {
/* 156 */     return this.fieldRSTUSR.getString();
/*     */   }
/*     */ 
/*     */   public void setRSTACC(String newvalue)
/*     */   {
/* 164 */     this.fieldRSTACC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getRSTACC()
/*     */   {
/* 172 */     return this.fieldRSTACC.getString();
/*     */   }
/*     */ 
/*     */   public void setRSTACC(BigDecimal newvalue)
/*     */   {
/* 180 */     this.fieldRSTACC.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalRSTACC()
/*     */   {
/* 188 */     return this.fieldRSTACC.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setRSTCAF(String newvalue)
/*     */   {
/* 196 */     this.fieldRSTCAF.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getRSTCAF()
/*     */   {
/* 204 */     return this.fieldRSTCAF.getString();
/*     */   }
/*     */ 
/*     */   public void setRSTFD1(String newvalue)
/*     */   {
/* 212 */     this.fieldRSTFD1.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getRSTFD1()
/*     */   {
/* 220 */     return this.fieldRSTFD1.getString();
/*     */   }
/*     */ 
/*     */   public void setRSTFD1(BigDecimal newvalue)
/*     */   {
/* 228 */     this.fieldRSTFD1.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalRSTFD1()
/*     */   {
/* 236 */     return this.fieldRSTFD1.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setRSTFD2(String newvalue)
/*     */   {
/* 244 */     this.fieldRSTFD2.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getRSTFD2()
/*     */   {
/* 252 */     return this.fieldRSTFD2.getString();
/*     */   }
/*     */ 
/*     */   public void setRSTFD2(BigDecimal newvalue)
/*     */   {
/* 260 */     this.fieldRSTFD2.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalRSTFD2()
/*     */   {
/* 268 */     return this.fieldRSTFD2.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setRSTFD3(String newvalue)
/*     */   {
/* 276 */     this.fieldRSTFD3.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getRSTFD3()
/*     */   {
/* 284 */     return this.fieldRSTFD3.getString();
/*     */   }
/*     */ 
/*     */   public void setRSTFD3(BigDecimal newvalue)
/*     */   {
/* 292 */     this.fieldRSTFD3.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalRSTFD3()
/*     */   {
/* 300 */     return this.fieldRSTFD3.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setRSTTD1(String newvalue)
/*     */   {
/* 308 */     this.fieldRSTTD1.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getRSTTD1()
/*     */   {
/* 316 */     return this.fieldRSTTD1.getString();
/*     */   }
/*     */ 
/*     */   public void setRSTTD1(BigDecimal newvalue)
/*     */   {
/* 324 */     this.fieldRSTTD1.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalRSTTD1()
/*     */   {
/* 332 */     return this.fieldRSTTD1.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setRSTTD2(String newvalue)
/*     */   {
/* 340 */     this.fieldRSTTD2.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getRSTTD2()
/*     */   {
/* 348 */     return this.fieldRSTTD2.getString();
/*     */   }
/*     */ 
/*     */   public void setRSTTD2(BigDecimal newvalue)
/*     */   {
/* 356 */     this.fieldRSTTD2.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalRSTTD2()
/*     */   {
/* 364 */     return this.fieldRSTTD2.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setRSTTD3(String newvalue)
/*     */   {
/* 372 */     this.fieldRSTTD3.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getRSTTD3()
/*     */   {
/* 380 */     return this.fieldRSTTD3.getString();
/*     */   }
/*     */ 
/*     */   public void setRSTTD3(BigDecimal newvalue)
/*     */   {
/* 388 */     this.fieldRSTTD3.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalRSTTD3()
/*     */   {
/* 396 */     return this.fieldRSTTD3.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setRSTFCK(String newvalue)
/*     */   {
/* 404 */     this.fieldRSTFCK.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getRSTFCK()
/*     */   {
/* 412 */     return this.fieldRSTFCK.getString();
/*     */   }
/*     */ 
/*     */   public void setRSTFCK(BigDecimal newvalue)
/*     */   {
/* 420 */     this.fieldRSTFCK.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalRSTFCK()
/*     */   {
/* 428 */     return this.fieldRSTFCK.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setRSTTCK(String newvalue)
/*     */   {
/* 436 */     this.fieldRSTTCK.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getRSTTCK()
/*     */   {
/* 444 */     return this.fieldRSTTCK.getString();
/*     */   }
/*     */ 
/*     */   public void setRSTTCK(BigDecimal newvalue)
/*     */   {
/* 452 */     this.fieldRSTTCK.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalRSTTCK()
/*     */   {
/* 460 */     return this.fieldRSTTCK.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setRSTFAM(String newvalue)
/*     */   {
/* 468 */     this.fieldRSTFAM.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getRSTFAM()
/*     */   {
/* 476 */     return this.fieldRSTFAM.getString();
/*     */   }
/*     */ 
/*     */   public void setRSTFAM(BigDecimal newvalue)
/*     */   {
/* 484 */     this.fieldRSTFAM.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalRSTFAM()
/*     */   {
/* 492 */     return this.fieldRSTFAM.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setRSTTAM(String newvalue)
/*     */   {
/* 500 */     this.fieldRSTTAM.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getRSTTAM()
/*     */   {
/* 508 */     return this.fieldRSTTAM.getString();
/*     */   }
/*     */ 
/*     */   public void setRSTTAM(BigDecimal newvalue)
/*     */   {
/* 516 */     this.fieldRSTTAM.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalRSTTAM()
/*     */   {
/* 524 */     return this.fieldRSTTAM.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setRSTFRC(String newvalue)
/*     */   {
/* 532 */     this.fieldRSTFRC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getRSTFRC()
/*     */   {
/* 540 */     return this.fieldRSTFRC.getString();
/*     */   }
/*     */ 
/*     */   public void setRSTFRC(BigDecimal newvalue)
/*     */   {
/* 548 */     this.fieldRSTFRC.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalRSTFRC()
/*     */   {
/* 556 */     return this.fieldRSTFRC.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setRSTFBL(String newvalue)
/*     */   {
/* 564 */     this.fieldRSTFBL.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getRSTFBL()
/*     */   {
/* 572 */     return this.fieldRSTFBL.getString();
/*     */   }
/*     */ 
/*     */   public void setRSTFBL(BigDecimal newvalue)
/*     */   {
/* 580 */     this.fieldRSTFBL.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalRSTFBL()
/*     */   {
/* 588 */     return this.fieldRSTFBL.getBigDecimal();
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.STMRDSJVMessage
 * JD-Core Version:    0.6.0
 */