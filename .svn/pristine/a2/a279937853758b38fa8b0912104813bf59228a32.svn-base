/*     */ package com.activo.gateway.dibs.messages;
/*     */ 
/*     */ import java.math.BigDecimal;
import java.util.Hashtable;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*     */ 
/*     */ public class EWD0013DSMessage extends MessageRecord
/*     */ {
/*  18 */   static final String[] fldnames = { 
/*  19 */     "EWDSHR", 
/*  20 */     "EWDBRN", 
/*  21 */     "EWDNME", 
/*  22 */     "EWDADR", 
/*  23 */     "EWDCIT", 
/*  24 */     "EWDPHN", 
/*  25 */     "EWDDID", 
/*  26 */     "EWDUS1", 
/*  27 */     "EWDUS2", 
/*  28 */     "EWDOPE" };
/*     */ 
/*  30 */   static final String[] tnames = { 
/*  31 */     "EWDSHR", 
/*  32 */     "EWDBRN", 
/*  33 */     "EWDNME", 
/*  34 */     "EWDADR", 
/*  35 */     "EWDCIT", 
/*  36 */     "EWDPHN", 
/*  37 */     "EWDDID", 
/*  38 */     "EWDUS1", 
/*  39 */     "EWDUS2", 
/*  40 */     "EWDOPE" };
/*     */   static final String fid = "1030129190825";
/*     */   static final String rid = "55B4A812EF144";
/*     */   static final String fmtname = "EWD0013DS";
/*  45 */   final int FIELDCOUNT = 10;
/*  46 */   private static Hashtable tlookup = new Hashtable();
/*  47 */   private CharacterField fieldEWDSHR = null;
/*  48 */   private DecimalField fieldEWDBRN = null;
/*  49 */   private CharacterField fieldEWDNME = null;
/*  50 */   private CharacterField fieldEWDADR = null;
/*  51 */   private CharacterField fieldEWDCIT = null;
/*  52 */   private DecimalField fieldEWDPHN = null;
/*  53 */   private CharacterField fieldEWDDID = null;
/*  54 */   private CharacterField fieldEWDUS1 = null;
/*  55 */   private CharacterField fieldEWDUS2 = null;
/*  56 */   private CharacterField fieldEWDOPE = null;
/*     */ 
/*     */   public EWD0013DSMessage()
/*     */   {
/*  63 */     createFields();
/*  64 */     initialize();
/*     */   }
/*     */ 
/*     */   protected void createFields()
/*     */   {
/*  73 */     this.recordsize = 147;
/*  74 */     this.fileid = "1030129190825";
/*  75 */     this.recordid = "55B4A812EF144";
/*  76 */     this.message = new byte[getByteLength()];
/*  77 */     this.formatname = "EWD0013DS";
/*  78 */     this.fieldnames = fldnames;
/*  79 */     this.tagnames = tnames;
/*  80 */     this.fields = new MessageField[10];
/*     */      this.fields[0]=this.fieldEWDSHR=new CharacterField(this.message, 10, 2, "EWDSHR");
/*     */      this.fields[1]=this.fieldEWDBRN=new DecimalField(this.message, 12, 4, 0, "EWDBRN");
/*     */      this.fields[2]=this.fieldEWDNME=new CharacterField(this.message, 16, 35, "EWDNME");
/*     */      this.fields[3]=this.fieldEWDADR=new CharacterField(this.message, 51, 35, "EWDADR");
/*     */      this.fields[4]=this.fieldEWDCIT=new CharacterField(this.message, 86, 35, "EWDCIT");
/*     */      this.fields[5]=this.fieldEWDPHN=new DecimalField(this.message, 121, 12, 0, "EWDPHN");
/*     */      this.fields[6]=this.fieldEWDDID=new CharacterField(this.message, 133, 15, "EWDDID");
/*     */      this.fields[7]=this.fieldEWDUS1=new CharacterField(this.message, 148, 4, "EWDUS1");
/*     */      this.fields[8]=this.fieldEWDUS2=new CharacterField(this.message, 152, 4, "EWDUS2");
/*     */      this.fields[9]=this.fieldEWDOPE=new CharacterField(this.message, 156, 1, "EWDOPE");
/*     */ 
/* 103 */     synchronized (tlookup)
/*     */     {
/* 105 */       if (tlookup.isEmpty())
/*     */       {
/* 107 */         for (int i = 0; i < tnames.length; i++) {
/* 108 */           tlookup.put(tnames[i], new Integer(i));
/*     */         }
/*     */       }
/*     */     }
/* 112 */     this.taglookup = tlookup;
/*     */   }
/*     */ 
/*     */   public void setEWDSHR(String newvalue)
/*     */   {
/* 120 */     this.fieldEWDSHR.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getEWDSHR()
/*     */   {
/* 128 */     return this.fieldEWDSHR.getString();
/*     */   }
/*     */ 
/*     */   public void setEWDBRN(String newvalue)
/*     */   {
/* 136 */     this.fieldEWDBRN.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getEWDBRN()
/*     */   {
/* 144 */     return this.fieldEWDBRN.getString();
/*     */   }
/*     */ 
/*     */   public void setEWDBRN(BigDecimal newvalue)
/*     */   {
/* 152 */     this.fieldEWDBRN.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalEWDBRN()
/*     */   {
/* 160 */     return this.fieldEWDBRN.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setEWDNME(String newvalue)
/*     */   {
/* 168 */     this.fieldEWDNME.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getEWDNME()
/*     */   {
/* 176 */     return this.fieldEWDNME.getString();
/*     */   }
/*     */ 
/*     */   public void setEWDADR(String newvalue)
/*     */   {
/* 184 */     this.fieldEWDADR.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getEWDADR()
/*     */   {
/* 192 */     return this.fieldEWDADR.getString();
/*     */   }
/*     */ 
/*     */   public void setEWDCIT(String newvalue)
/*     */   {
/* 200 */     this.fieldEWDCIT.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getEWDCIT()
/*     */   {
/* 208 */     return this.fieldEWDCIT.getString();
/*     */   }
/*     */ 
/*     */   public void setEWDPHN(String newvalue)
/*     */   {
/* 216 */     this.fieldEWDPHN.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getEWDPHN()
/*     */   {
/* 224 */     return this.fieldEWDPHN.getString();
/*     */   }
/*     */ 
/*     */   public void setEWDPHN(BigDecimal newvalue)
/*     */   {
/* 232 */     this.fieldEWDPHN.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalEWDPHN()
/*     */   {
/* 240 */     return this.fieldEWDPHN.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setEWDDID(String newvalue)
/*     */   {
/* 248 */     this.fieldEWDDID.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getEWDDID()
/*     */   {
/* 256 */     return this.fieldEWDDID.getString();
/*     */   }
/*     */ 
/*     */   public void setEWDUS1(String newvalue)
/*     */   {
/* 264 */     this.fieldEWDUS1.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getEWDUS1()
/*     */   {
/* 272 */     return this.fieldEWDUS1.getString();
/*     */   }
/*     */ 
/*     */   public void setEWDUS2(String newvalue)
/*     */   {
/* 280 */     this.fieldEWDUS2.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getEWDUS2()
/*     */   {
/* 288 */     return this.fieldEWDUS2.getString();
/*     */   }
/*     */ 
/*     */   public void setEWDOPE(String newvalue)
/*     */   {
/* 296 */     this.fieldEWDOPE.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getEWDOPE()
/*     */   {
/* 304 */     return this.fieldEWDOPE.getString();
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.EWD0013DSMessage
 * JD-Core Version:    0.6.0
 */