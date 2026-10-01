/*     */ package com.activo.gateway.dibs.messages;
/*     */ 
/*     */ import java.math.BigDecimal;
import java.util.Hashtable;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*     */ 
/*     */ public class LCRTRNDSJVMessage extends MessageRecord
/*     */ {
/*  20 */   static final String[] fldnames = { 
/*  21 */     "LCRTRUSER", 
/*  22 */     "LCRTRACC", 
/*  23 */     "LCRTRCDE", 
/*  24 */     "LCRTRNAR", 
/*  25 */     "LCRTRBD1", 
/*  26 */     "LCRTRBD2", 
/*  27 */     "LCRTRBD3", 
/*  28 */     "LCRTRBBL", 
/*  29 */     "LCRTRAMT", 
/*  30 */     "LCRTRDCC", 
/*  31 */     "LCRTREBL", 
/*  32 */     "LCRTRREC", 
/*  33 */     "LCRTREND" };
/*     */ 
/*  35 */   static final String[] tnames = { 
/*  36 */     "LCRTRUSER", 
/*  37 */     "LCRTRACC", 
/*  38 */     "LCRTRCDE", 
/*  39 */     "LCRTRNAR", 
/*  40 */     "LCRTRBD1", 
/*  41 */     "LCRTRBD2", 
/*  42 */     "LCRTRBD3", 
/*  43 */     "LCRTRBBL", 
/*  44 */     "LCRTRAMT", 
/*  45 */     "LCRTRDCC", 
/*  46 */     "LCRTREBL", 
/*  47 */     "LCRTRREC", 
/*  48 */     "LCRTREND" };
/*     */   static final String fid = "1050517135805";
/*     */   static final String rid = "4DB03D94A17F4";
/*     */   static final String fmtname = "LCRTRNDSJV";
/*  53 */   final int FIELDCOUNT = 13;
/*  54 */   private static Hashtable tlookup = new Hashtable();
/*  55 */   private CharacterField fieldLCRTRUSER = null;
/*  56 */   private DecimalField fieldLCRTRACC = null;
/*  57 */   private CharacterField fieldLCRTRCDE = null;
/*  58 */   private CharacterField fieldLCRTRNAR = null;
/*  59 */   private DecimalField fieldLCRTRBD1 = null;
/*  60 */   private DecimalField fieldLCRTRBD2 = null;
/*  61 */   private DecimalField fieldLCRTRBD3 = null;
/*  62 */   private DecimalField fieldLCRTRBBL = null;
/*  63 */   private DecimalField fieldLCRTRAMT = null;
/*  64 */   private CharacterField fieldLCRTRDCC = null;
/*  65 */   private DecimalField fieldLCRTREBL = null;
/*  66 */   private DecimalField fieldLCRTRREC = null;
/*  67 */   private CharacterField fieldLCRTREND = null;
/*     */ 
/*     */   public LCRTRNDSJVMessage()
/*     */   {
/*  74 */     createFields();
/*  75 */     initialize();
/*     */   }
/*     */ 
/*     */   protected void createFields()
/*     */   {
/*  84 */     this.recordsize = 125;
/*  85 */     this.fileid = "1050517135805";
/*  86 */     this.recordid = "4DB03D94A17F4";
/*  87 */     this.message = new byte[getByteLength()];
/*  88 */     this.formatname = "LCRTRNDSJV";
/*  89 */     this.fieldnames = fldnames;
/*  90 */     this.tagnames = tnames;
/*  91 */     this.fields = new MessageField[13];
/*     */      this.fields[0]=this.fieldLCRTRUSER=new CharacterField(this.message, 10, 10, "LCRTRUSER");
/*     */      this.fields[1]=this.fieldLCRTRACC=new DecimalField(this.message, 20, 13, 0, "LCRTRACC");
/*     */      this.fields[2]=this.fieldLCRTRCDE=new CharacterField(this.message, 33, 2, "LCRTRCDE");
/*     */      this.fields[3]=this.fieldLCRTRNAR=new CharacterField(this.message, 35, 30, "LCRTRNAR");
/*     */      this.fields[4]=this.fieldLCRTRBD1=new DecimalField(this.message, 65, 3, 0, "LCRTRBD1");
/*     */      this.fields[5]=this.fieldLCRTRBD2=new DecimalField(this.message, 68, 3, 0, "LCRTRBD2");
/*     */      this.fields[6]=this.fieldLCRTRBD3=new DecimalField(this.message, 71, 3, 0, "LCRTRBD3");
/*     */      this.fields[7]=this.fieldLCRTRBBL=new DecimalField(this.message, 74, 17, 2, "LCRTRBBL");
/*     */      this.fields[8]=this.fieldLCRTRAMT=new DecimalField(this.message, 91, 17, 2, "LCRTRAMT");
/*     */      this.fields[9]=this.fieldLCRTRDCC=new CharacterField(this.message, 108, 1, "LCRTRDCC");
/*     */      this.fields[10]=this.fieldLCRTREBL=new DecimalField(this.message, 109, 17, 2, "LCRTREBL");
/*     */      this.fields[11]=this.fieldLCRTRREC=new DecimalField(this.message, 126, 8, 0, "LCRTRREC");
/*     */      this.fields[12]=this.fieldLCRTREND=new CharacterField(this.message, 134, 1, "LCRTREND");
/*     */ 
/* 120 */     synchronized (tlookup)
/*     */     {
/* 122 */       if (tlookup.isEmpty())
/*     */       {
/* 124 */         for (int i = 0; i < tnames.length; i++) {
/* 125 */           tlookup.put(tnames[i], new Integer(i));
/*     */         }
/*     */       }
/*     */     }
/* 129 */     this.taglookup = tlookup;
/*     */   }
/*     */ 
/*     */   public void setLCRTRUSER(String newvalue)
/*     */   {
/* 137 */     this.fieldLCRTRUSER.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getLCRTRUSER()
/*     */   {
/* 145 */     return this.fieldLCRTRUSER.getString();
/*     */   }
/*     */ 
/*     */   public void setLCRTRACC(String newvalue)
/*     */   {
/* 153 */     this.fieldLCRTRACC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getLCRTRACC()
/*     */   {
/* 161 */     return this.fieldLCRTRACC.getString();
/*     */   }
/*     */ 
/*     */   public void setLCRTRACC(BigDecimal newvalue)
/*     */   {
/* 169 */     this.fieldLCRTRACC.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalLCRTRACC()
/*     */   {
/* 177 */     return this.fieldLCRTRACC.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setLCRTRCDE(String newvalue)
/*     */   {
/* 185 */     this.fieldLCRTRCDE.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getLCRTRCDE()
/*     */   {
/* 193 */     return this.fieldLCRTRCDE.getString();
/*     */   }
/*     */ 
/*     */   public void setLCRTRNAR(String newvalue)
/*     */   {
/* 201 */     this.fieldLCRTRNAR.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getLCRTRNAR()
/*     */   {
/* 209 */     return this.fieldLCRTRNAR.getString();
/*     */   }
/*     */ 
/*     */   public void setLCRTRBD1(String newvalue)
/*     */   {
/* 217 */     this.fieldLCRTRBD1.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getLCRTRBD1()
/*     */   {
/* 225 */     return this.fieldLCRTRBD1.getString();
/*     */   }
/*     */ 
/*     */   public void setLCRTRBD1(BigDecimal newvalue)
/*     */   {
/* 233 */     this.fieldLCRTRBD1.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalLCRTRBD1()
/*     */   {
/* 241 */     return this.fieldLCRTRBD1.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setLCRTRBD2(String newvalue)
/*     */   {
/* 249 */     this.fieldLCRTRBD2.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getLCRTRBD2()
/*     */   {
/* 257 */     return this.fieldLCRTRBD2.getString();
/*     */   }
/*     */ 
/*     */   public void setLCRTRBD2(BigDecimal newvalue)
/*     */   {
/* 265 */     this.fieldLCRTRBD2.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalLCRTRBD2()
/*     */   {
/* 273 */     return this.fieldLCRTRBD2.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setLCRTRBD3(String newvalue)
/*     */   {
/* 281 */     this.fieldLCRTRBD3.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getLCRTRBD3()
/*     */   {
/* 289 */     return this.fieldLCRTRBD3.getString();
/*     */   }
/*     */ 
/*     */   public void setLCRTRBD3(BigDecimal newvalue)
/*     */   {
/* 297 */     this.fieldLCRTRBD3.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalLCRTRBD3()
/*     */   {
/* 305 */     return this.fieldLCRTRBD3.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setLCRTRBBL(String newvalue)
/*     */   {
/* 313 */     this.fieldLCRTRBBL.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getLCRTRBBL()
/*     */   {
/* 321 */     return this.fieldLCRTRBBL.getString();
/*     */   }
/*     */ 
/*     */   public void setLCRTRBBL(BigDecimal newvalue)
/*     */   {
/* 329 */     this.fieldLCRTRBBL.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalLCRTRBBL()
/*     */   {
/* 337 */     return this.fieldLCRTRBBL.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setLCRTRAMT(String newvalue)
/*     */   {
/* 345 */     this.fieldLCRTRAMT.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getLCRTRAMT()
/*     */   {
/* 353 */     return this.fieldLCRTRAMT.getString();
/*     */   }
/*     */ 
/*     */   public void setLCRTRAMT(BigDecimal newvalue)
/*     */   {
/* 361 */     this.fieldLCRTRAMT.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalLCRTRAMT()
/*     */   {
/* 369 */     return this.fieldLCRTRAMT.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setLCRTRDCC(String newvalue)
/*     */   {
/* 377 */     this.fieldLCRTRDCC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getLCRTRDCC()
/*     */   {
/* 385 */     return this.fieldLCRTRDCC.getString();
/*     */   }
/*     */ 
/*     */   public void setLCRTREBL(String newvalue)
/*     */   {
/* 393 */     this.fieldLCRTREBL.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getLCRTREBL()
/*     */   {
/* 401 */     return this.fieldLCRTREBL.getString();
/*     */   }
/*     */ 
/*     */   public void setLCRTREBL(BigDecimal newvalue)
/*     */   {
/* 409 */     this.fieldLCRTREBL.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalLCRTREBL()
/*     */   {
/* 417 */     return this.fieldLCRTREBL.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setLCRTRREC(String newvalue)
/*     */   {
/* 425 */     this.fieldLCRTRREC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getLCRTRREC()
/*     */   {
/* 433 */     return this.fieldLCRTRREC.getString();
/*     */   }
/*     */ 
/*     */   public void setLCRTRREC(BigDecimal newvalue)
/*     */   {
/* 441 */     this.fieldLCRTRREC.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalLCRTRREC()
/*     */   {
/* 449 */     return this.fieldLCRTRREC.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setLCRTREND(String newvalue)
/*     */   {
/* 457 */     this.fieldLCRTREND.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getLCRTREND()
/*     */   {
/* 465 */     return this.fieldLCRTREND.getString();
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.LCRTRNDSJVMessage
 * JD-Core Version:    0.6.0
 */