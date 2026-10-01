/*     */ package com.activo.gateway.dibs.messages;
/*     */ 
/*     */ import java.math.BigDecimal;
import java.util.Hashtable;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*     */ 
/*     */ public class STMSDSJV5Message extends MessageRecord
/*     */ {
/*  21 */   static final String[] fldnames = { 
/*  22 */     "STMUSR", 
/*  23 */     "STMACC", 
/*  24 */     "STMCDE", 
/*  25 */     "STMNAR", 
/*  26 */     "STMBD1", 
/*  27 */     "STMBD2", 
/*  28 */     "STMBD3", 
/*  29 */     "STMCKN", 
/*  30 */     "STMBBL", 
/*  31 */     "STMAMT", 
/*  32 */     "STMDCC", 
/*  33 */     "STMEBL", 
/*  34 */     "STMREC", 
/*  35 */     "STMMEM", 
/*  36 */     "STMEND", 
/*  37 */     "STMDRR", 
/*  38 */     "STMNNAR", 
/*  39 */     "STMNA1", 
/*  40 */     "STMNA2", 
/*  41 */     "STMNA3", 
/*  42 */     "STMNA4", 
/*  43 */     "STMNA5", 
/*  44 */     "STMNA6", 
/*  45 */     "STMNA7", 
/*  46 */     "STMNA8", 
/*  47 */     "STMNA9" };
/*     */ 
/*  49 */   static final String[] tnames = { 
/*  50 */     "STMUSR", 
/*  51 */     "STMACC", 
/*  52 */     "STMCDE", 
/*  53 */     "STMNAR", 
/*  54 */     "STMBD1", 
/*  55 */     "STMBD2", 
/*  56 */     "STMBD3", 
/*  57 */     "STMCKN", 
/*  58 */     "STMBBL", 
/*  59 */     "STMAMT", 
/*  60 */     "STMDCC", 
/*  61 */     "STMEBL", 
/*  62 */     "STMREC", 
/*  63 */     "STMMEM", 
/*  64 */     "STMEND", 
/*  65 */     "STMDRR", 
/*  66 */     "STMNNAR", 
/*  67 */     "STMNA1", 
/*  68 */     "STMNA2", 
/*  69 */     "STMNA3", 
/*  70 */     "STMNA4", 
/*  71 */     "STMNA5", 
/*  72 */     "STMNA6", 
/*  73 */     "STMNA7", 
/*  74 */     "STMNA8", 
/*  75 */     "STMNA9" };
/*     */   static final String fid = "1180301142926";
/*     */   static final String rid = "3A7D45C35595A";
/*     */   static final String fmtname = "STMSDSJV5";
/*  80 */   final int FIELDCOUNT = 26;
/*  81 */   private static Hashtable tlookup = new Hashtable();
/*  82 */   private CharacterField fieldSTMUSR = null;
/*  83 */   private DecimalField fieldSTMACC = null;
/*  84 */   private CharacterField fieldSTMCDE = null;
/*  85 */   private CharacterField fieldSTMNAR = null;
/*  86 */   private DecimalField fieldSTMBD1 = null;
/*  87 */   private DecimalField fieldSTMBD2 = null;
/*  88 */   private DecimalField fieldSTMBD3 = null;
/*  89 */   private DecimalField fieldSTMCKN = null;
/*  90 */   private DecimalField fieldSTMBBL = null;
/*  91 */   private DecimalField fieldSTMAMT = null;
/*  92 */   private CharacterField fieldSTMDCC = null;
/*  93 */   private DecimalField fieldSTMEBL = null;
/*  94 */   private DecimalField fieldSTMREC = null;
/*  95 */   private CharacterField fieldSTMMEM = null;
/*  96 */   private CharacterField fieldSTMEND = null;
/*  97 */   private DecimalField fieldSTMDRR = null;
/*  98 */   private DecimalField fieldSTMNNAR = null;
/*  99 */   private CharacterField fieldSTMNA1 = null;
/* 100 */   private CharacterField fieldSTMNA2 = null;
/* 101 */   private CharacterField fieldSTMNA3 = null;
/* 102 */   private CharacterField fieldSTMNA4 = null;
/* 103 */   private CharacterField fieldSTMNA5 = null;
/* 104 */   private CharacterField fieldSTMNA6 = null;
/* 105 */   private CharacterField fieldSTMNA7 = null;
/* 106 */   private CharacterField fieldSTMNA8 = null;
/* 107 */   private CharacterField fieldSTMNA9 = null;
/*     */ 
/*     */   public STMSDSJV5Message()
/*     */   {
/* 114 */     createFields();
/* 115 */     initialize();
/*     */   }
/*     */ 
/*     */   protected void createFields()
/*     */   {
/* 124 */     this.recordsize = 420;
/* 125 */     this.fileid = "1180301142926";
/* 126 */     this.recordid = "3A7D45C35595A";
/* 127 */     this.message = new byte[getByteLength()];
/* 128 */     this.formatname = "STMSDSJV5";
/* 129 */     this.fieldnames = fldnames;
/* 130 */     this.tagnames = tnames;
/* 131 */     this.fields = new MessageField[26];
/*     */      this.fields[0]=this.fieldSTMUSR=new CharacterField(this.message, 10, 10, "STMUSR");
/*     */      this.fields[1]=this.fieldSTMACC=new DecimalField(this.message, 20, 13, 0, "STMACC");
/*     */      this.fields[2]=this.fieldSTMCDE=new CharacterField(this.message, 33, 2, "STMCDE");
/*     */      this.fields[3]=this.fieldSTMNAR=new CharacterField(this.message, 35, 30, "STMNAR");
/*     */      this.fields[4]=this.fieldSTMBD1=new DecimalField(this.message, 65, 3, 0, "STMBD1");
/*     */      this.fields[5]=this.fieldSTMBD2=new DecimalField(this.message, 68, 3, 0, "STMBD2");
/*     */      this.fields[6]=this.fieldSTMBD3=new DecimalField(this.message, 71, 3, 0, "STMBD3");
/*     */      this.fields[7]=this.fieldSTMCKN=new DecimalField(this.message, 74, 10, 0, "STMCKN");
/*     */      this.fields[8]=this.fieldSTMBBL=new DecimalField(this.message, 84, 17, 2, "STMBBL");
/*     */      this.fields[9]=this.fieldSTMAMT=new DecimalField(this.message, 101, 17, 2, "STMAMT");
/*     */      this.fields[10]=this.fieldSTMDCC=new CharacterField(this.message, 118, 1, "STMDCC");
/*     */      this.fields[11]=this.fieldSTMEBL=new DecimalField(this.message, 119, 17, 2, "STMEBL");
/*     */      this.fields[12]=this.fieldSTMREC=new DecimalField(this.message, 136, 8, 0, "STMREC");
/*     */      this.fields[13]=this.fieldSTMMEM=new CharacterField(this.message, 144, 4, "STMMEM");
/*     */      this.fields[14]=this.fieldSTMEND=new CharacterField(this.message, 148, 1, "STMEND");
/*     */      this.fields[15]=this.fieldSTMDRR=new DecimalField(this.message, 149, 8, 0, "STMDRR");
/*     */      this.fields[16]=this.fieldSTMNNAR=new DecimalField(this.message, 157, 3, 0, "STMNNAR");
/*     */      this.fields[17]=this.fieldSTMNA1=new CharacterField(this.message, 160, 30, "STMNA1");
/*     */      this.fields[18]=this.fieldSTMNA2=new CharacterField(this.message, 190, 30, "STMNA2");
/*     */      this.fields[19]=this.fieldSTMNA3=new CharacterField(this.message, 220, 30, "STMNA3");
/*     */      this.fields[20]=this.fieldSTMNA4=new CharacterField(this.message, 250, 30, "STMNA4");
/*     */      this.fields[21]=this.fieldSTMNA5=new CharacterField(this.message, 280, 30, "STMNA5");
/*     */      this.fields[22]=this.fieldSTMNA6=new CharacterField(this.message, 310, 30, "STMNA6");
/*     */      this.fields[23]=this.fieldSTMNA7=new CharacterField(this.message, 340, 30, "STMNA7");
/*     */      this.fields[24]=this.fieldSTMNA8=new CharacterField(this.message, 370, 30, "STMNA8");
/*     */      this.fields[25]=this.fieldSTMNA9=new CharacterField(this.message, 400, 30, "STMNA9");
/*     */ 
/* 186 */     synchronized (tlookup)
/*     */     {
/* 188 */       if (tlookup.isEmpty())
/*     */       {
/* 190 */         for (int i = 0; i < tnames.length; i++) {
/* 191 */           tlookup.put(tnames[i], new Integer(i));
/*     */         }
/*     */       }
/*     */     }
/* 195 */     this.taglookup = tlookup;
/*     */   }
/*     */ 
/*     */   public void setSTMUSR(String newvalue)
/*     */   {
/* 203 */     this.fieldSTMUSR.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getSTMUSR()
/*     */   {
/* 211 */     return this.fieldSTMUSR.getString();
/*     */   }
/*     */ 
/*     */   public void setSTMACC(String newvalue)
/*     */   {
/* 219 */     this.fieldSTMACC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getSTMACC()
/*     */   {
/* 227 */     return this.fieldSTMACC.getString();
/*     */   }
/*     */ 
/*     */   public void setSTMACC(BigDecimal newvalue)
/*     */   {
/* 235 */     this.fieldSTMACC.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalSTMACC()
/*     */   {
/* 243 */     return this.fieldSTMACC.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setSTMCDE(String newvalue)
/*     */   {
/* 251 */     this.fieldSTMCDE.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getSTMCDE()
/*     */   {
/* 259 */     return this.fieldSTMCDE.getString();
/*     */   }
/*     */ 
/*     */   public void setSTMNAR(String newvalue)
/*     */   {
/* 267 */     this.fieldSTMNAR.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getSTMNAR()
/*     */   {
/* 275 */     return this.fieldSTMNAR.getString();
/*     */   }
/*     */ 
/*     */   public void setSTMBD1(String newvalue)
/*     */   {
/* 283 */     this.fieldSTMBD1.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getSTMBD1()
/*     */   {
/* 291 */     return this.fieldSTMBD1.getString();
/*     */   }
/*     */ 
/*     */   public void setSTMBD1(BigDecimal newvalue)
/*     */   {
/* 299 */     this.fieldSTMBD1.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalSTMBD1()
/*     */   {
/* 307 */     return this.fieldSTMBD1.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setSTMBD2(String newvalue)
/*     */   {
/* 315 */     this.fieldSTMBD2.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getSTMBD2()
/*     */   {
/* 323 */     return this.fieldSTMBD2.getString();
/*     */   }
/*     */ 
/*     */   public void setSTMBD2(BigDecimal newvalue)
/*     */   {
/* 331 */     this.fieldSTMBD2.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalSTMBD2()
/*     */   {
/* 339 */     return this.fieldSTMBD2.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setSTMBD3(String newvalue)
/*     */   {
/* 347 */     this.fieldSTMBD3.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getSTMBD3()
/*     */   {
/* 355 */     return this.fieldSTMBD3.getString();
/*     */   }
/*     */ 
/*     */   public void setSTMBD3(BigDecimal newvalue)
/*     */   {
/* 363 */     this.fieldSTMBD3.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalSTMBD3()
/*     */   {
/* 371 */     return this.fieldSTMBD3.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setSTMCKN(String newvalue)
/*     */   {
/* 379 */     this.fieldSTMCKN.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getSTMCKN()
/*     */   {
/* 387 */     return this.fieldSTMCKN.getString();
/*     */   }
/*     */ 
/*     */   public void setSTMCKN(BigDecimal newvalue)
/*     */   {
/* 395 */     this.fieldSTMCKN.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalSTMCKN()
/*     */   {
/* 403 */     return this.fieldSTMCKN.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setSTMBBL(String newvalue)
/*     */   {
/* 411 */     this.fieldSTMBBL.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getSTMBBL()
/*     */   {
/* 419 */     return this.fieldSTMBBL.getString();
/*     */   }
/*     */ 
/*     */   public void setSTMBBL(BigDecimal newvalue)
/*     */   {
/* 427 */     this.fieldSTMBBL.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalSTMBBL()
/*     */   {
/* 435 */     return this.fieldSTMBBL.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setSTMAMT(String newvalue)
/*     */   {
/* 443 */     this.fieldSTMAMT.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getSTMAMT()
/*     */   {
/* 451 */     return this.fieldSTMAMT.getString();
/*     */   }
/*     */ 
/*     */   public void setSTMAMT(BigDecimal newvalue)
/*     */   {
/* 459 */     this.fieldSTMAMT.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalSTMAMT()
/*     */   {
/* 467 */     return this.fieldSTMAMT.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setSTMDCC(String newvalue)
/*     */   {
/* 475 */     this.fieldSTMDCC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getSTMDCC()
/*     */   {
/* 483 */     return this.fieldSTMDCC.getString();
/*     */   }
/*     */ 
/*     */   public void setSTMEBL(String newvalue)
/*     */   {
/* 491 */     this.fieldSTMEBL.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getSTMEBL()
/*     */   {
/* 499 */     return this.fieldSTMEBL.getString();
/*     */   }
/*     */ 
/*     */   public void setSTMEBL(BigDecimal newvalue)
/*     */   {
/* 507 */     this.fieldSTMEBL.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalSTMEBL()
/*     */   {
/* 515 */     return this.fieldSTMEBL.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setSTMREC(String newvalue)
/*     */   {
/* 523 */     this.fieldSTMREC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getSTMREC()
/*     */   {
/* 531 */     return this.fieldSTMREC.getString();
/*     */   }
/*     */ 
/*     */   public void setSTMREC(BigDecimal newvalue)
/*     */   {
/* 539 */     this.fieldSTMREC.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalSTMREC()
/*     */   {
/* 547 */     return this.fieldSTMREC.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setSTMMEM(String newvalue)
/*     */   {
/* 555 */     this.fieldSTMMEM.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getSTMMEM()
/*     */   {
/* 563 */     return this.fieldSTMMEM.getString();
/*     */   }
/*     */ 
/*     */   public void setSTMEND(String newvalue)
/*     */   {
/* 571 */     this.fieldSTMEND.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getSTMEND()
/*     */   {
/* 579 */     return this.fieldSTMEND.getString();
/*     */   }
/*     */ 
/*     */   public void setSTMDRR(String newvalue)
/*     */   {
/* 587 */     this.fieldSTMDRR.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getSTMDRR()
/*     */   {
/* 595 */     return this.fieldSTMDRR.getString();
/*     */   }
/*     */ 
/*     */   public void setSTMDRR(BigDecimal newvalue)
/*     */   {
/* 603 */     this.fieldSTMDRR.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalSTMDRR()
/*     */   {
/* 611 */     return this.fieldSTMDRR.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setSTMNNAR(String newvalue)
/*     */   {
/* 619 */     this.fieldSTMNNAR.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getSTMNNAR()
/*     */   {
/* 627 */     return this.fieldSTMNNAR.getString();
/*     */   }
/*     */ 
/*     */   public void setSTMNNAR(BigDecimal newvalue)
/*     */   {
/* 635 */     this.fieldSTMNNAR.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalSTMNNAR()
/*     */   {
/* 643 */     return this.fieldSTMNNAR.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setSTMNA1(String newvalue)
/*     */   {
/* 651 */     this.fieldSTMNA1.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getSTMNA1()
/*     */   {
/* 659 */     return this.fieldSTMNA1.getString();
/*     */   }
/*     */ 
/*     */   public void setSTMNA2(String newvalue)
/*     */   {
/* 667 */     this.fieldSTMNA2.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getSTMNA2()
/*     */   {
/* 675 */     return this.fieldSTMNA2.getString();
/*     */   }
/*     */ 
/*     */   public void setSTMNA3(String newvalue)
/*     */   {
/* 683 */     this.fieldSTMNA3.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getSTMNA3()
/*     */   {
/* 691 */     return this.fieldSTMNA3.getString();
/*     */   }
/*     */ 
/*     */   public void setSTMNA4(String newvalue)
/*     */   {
/* 699 */     this.fieldSTMNA4.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getSTMNA4()
/*     */   {
/* 707 */     return this.fieldSTMNA4.getString();
/*     */   }
/*     */ 
/*     */   public void setSTMNA5(String newvalue)
/*     */   {
/* 715 */     this.fieldSTMNA5.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getSTMNA5()
/*     */   {
/* 723 */     return this.fieldSTMNA5.getString();
/*     */   }
/*     */ 
/*     */   public void setSTMNA6(String newvalue)
/*     */   {
/* 731 */     this.fieldSTMNA6.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getSTMNA6()
/*     */   {
/* 739 */     return this.fieldSTMNA6.getString();
/*     */   }
/*     */ 
/*     */   public void setSTMNA7(String newvalue)
/*     */   {
/* 747 */     this.fieldSTMNA7.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getSTMNA7()
/*     */   {
/* 755 */     return this.fieldSTMNA7.getString();
/*     */   }
/*     */ 
/*     */   public void setSTMNA8(String newvalue)
/*     */   {
/* 763 */     this.fieldSTMNA8.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getSTMNA8()
/*     */   {
/* 771 */     return this.fieldSTMNA8.getString();
/*     */   }
/*     */ 
/*     */   public void setSTMNA9(String newvalue)
/*     */   {
/* 779 */     this.fieldSTMNA9.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getSTMNA9()
/*     */   {
/* 787 */     return this.fieldSTMNA9.getString();
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.STMSDSJV5Message
 * JD-Core Version:    0.6.0
 */