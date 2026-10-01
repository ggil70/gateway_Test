/*     */ package com.activo.gateway.dibs.messages;
/*     */ 
/*     */ import java.math.BigDecimal;
import java.util.Hashtable;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*     */ 
/*     */ public class REGISQSTMessage extends MessageRecord
/*     */ {
/*  18 */   static final String[] fldnames = { 
/*  19 */     "RQSOPT", 
/*  20 */     "RQSIDN", 
/*  21 */     "RQSCUN", 
/*  22 */     "RQSNO1", 
/*  23 */     "RQSNO2", 
/*  24 */     "RQSNO3", 
/*  25 */     "RQSNO4", 
/*  26 */     "RQSNO5", 
/*  27 */     "RQSNO6", 
/*  28 */     "RQSVL1", 
/*  29 */     "RQSVL2", 
/*  30 */     "RQSVL3", 
/*  31 */     "RQSVL4", 
/*  32 */     "RQSVL5", 
/*  33 */     "RQSVL6", 
/*  34 */     "RQSRP1", 
/*  35 */     "RQSRP2", 
/*  36 */     "RQSRP3", 
/*  37 */     "RQSRP4", 
/*  38 */     "RQSRP5", 
/*  39 */     "RQSRP6", 
/*  40 */     "RQSDF1", 
/*  41 */     "RQSDF2", 
/*  42 */     "RQSDF3", 
/*  43 */     "RQSDF4", 
/*  44 */     "RQSDF5", 
/*  45 */     "RQSDF6", 
/*  46 */     "RQSCR1", 
/*  47 */     "RQSCR2", 
/*  48 */     "RQSCR3", 
/*  49 */     "RQSCR4", 
/*  50 */     "RQSCR5", 
/*  51 */     "RQSCR6" };
/*     */ 
/*  53 */   static final String[] tnames = { 
/*  54 */     "RQSOPT", 
/*  55 */     "RQSIDN", 
/*  56 */     "RQSCUN", 
/*  57 */     "RQSNO1", 
/*  58 */     "RQSNO2", 
/*  59 */     "RQSNO3", 
/*  60 */     "RQSNO4", 
/*  61 */     "RQSNO5", 
/*  62 */     "RQSNO6", 
/*  63 */     "RQSVL1", 
/*  64 */     "RQSVL2", 
/*  65 */     "RQSVL3", 
/*  66 */     "RQSVL4", 
/*  67 */     "RQSVL5", 
/*  68 */     "RQSVL6", 
/*  69 */     "RQSRP1", 
/*  70 */     "RQSRP2", 
/*  71 */     "RQSRP3", 
/*  72 */     "RQSRP4", 
/*  73 */     "RQSRP5", 
/*  74 */     "RQSRP6", 
/*  75 */     "RQSDF1", 
/*  76 */     "RQSDF2", 
/*  77 */     "RQSDF3", 
/*  78 */     "RQSDF4", 
/*  79 */     "RQSDF5", 
/*  80 */     "RQSDF6", 
/*  81 */     "RQSCR1", 
/*  82 */     "RQSCR2", 
/*  83 */     "RQSCR3", 
/*  84 */     "RQSCR4", 
/*  85 */     "RQSCR5", 
/*  86 */     "RQSCR6" };
/*     */   static final String fid = "1110505153524";
/*     */   static final String rid = "5402094B28D1A";
/*     */   static final String fmtname = "REGISQST";
/*  91 */   final int FIELDCOUNT = 33;
/*  92 */   private static Hashtable tlookup = new Hashtable();
/*  93 */   private DecimalField fieldRQSOPT = null;
/*  94 */   private CharacterField fieldRQSIDN = null;
/*  95 */   private DecimalField fieldRQSCUN = null;
/*  96 */   private DecimalField fieldRQSNO1 = null;
/*  97 */   private DecimalField fieldRQSNO2 = null;
/*  98 */   private DecimalField fieldRQSNO3 = null;
/*  99 */   private DecimalField fieldRQSNO4 = null;
/* 100 */   private DecimalField fieldRQSNO5 = null;
/* 101 */   private DecimalField fieldRQSNO6 = null;
/* 102 */   private CharacterField fieldRQSVL1 = null;
/* 103 */   private CharacterField fieldRQSVL2 = null;
/* 104 */   private CharacterField fieldRQSVL3 = null;
/* 105 */   private CharacterField fieldRQSVL4 = null;
/* 106 */   private CharacterField fieldRQSVL5 = null;
/* 107 */   private CharacterField fieldRQSVL6 = null;
/* 108 */   private CharacterField fieldRQSRP1 = null;
/* 109 */   private CharacterField fieldRQSRP2 = null;
/* 110 */   private CharacterField fieldRQSRP3 = null;
/* 111 */   private CharacterField fieldRQSRP4 = null;
/* 112 */   private CharacterField fieldRQSRP5 = null;
/* 113 */   private CharacterField fieldRQSRP6 = null;
/* 114 */   private CharacterField fieldRQSDF1 = null;
/* 115 */   private CharacterField fieldRQSDF2 = null;
/* 116 */   private CharacterField fieldRQSDF3 = null;
/* 117 */   private CharacterField fieldRQSDF4 = null;
/* 118 */   private CharacterField fieldRQSDF5 = null;
/* 119 */   private CharacterField fieldRQSDF6 = null;
/* 120 */   private CharacterField fieldRQSCR1 = null;
/* 121 */   private CharacterField fieldRQSCR2 = null;
/* 122 */   private CharacterField fieldRQSCR3 = null;
/* 123 */   private CharacterField fieldRQSCR4 = null;
/* 124 */   private CharacterField fieldRQSCR5 = null;
/* 125 */   private CharacterField fieldRQSCR6 = null;
/*     */ 
/*     */   public REGISQSTMessage()
/*     */   {
/* 132 */     createFields();
/* 133 */     initialize();
/*     */   }
/*     */ 
/*     */   protected void createFields()
/*     */   {
/* 142 */     this.recordsize = 778;
/* 143 */     this.fileid = "1110505153524";
/* 144 */     this.recordid = "5402094B28D1A";
/* 145 */     this.message = new byte[getByteLength()];
/* 146 */     this.formatname = "REGISQST";
/* 147 */     this.fieldnames = fldnames;
/* 148 */     this.tagnames = tnames;
/* 149 */     this.fields = new MessageField[33];
/*     */      this.fields[0]=this.fieldRQSOPT=new DecimalField(this.message, 10, 3, 0, "RQSOPT");
/*     */      this.fields[1]=this.fieldRQSIDN=new CharacterField(this.message, 13, 15, "RQSIDN");
/*     */      this.fields[2]=this.fieldRQSCUN=new DecimalField(this.message, 28, 10, 0, "RQSCUN");
/*     */      this.fields[3]=this.fieldRQSNO1=new DecimalField(this.message, 38, 3, 0, "RQSNO1");
/*     */      this.fields[4]=this.fieldRQSNO2=new DecimalField(this.message, 41, 3, 0, "RQSNO2");
/*     */      this.fields[5]=this.fieldRQSNO3=new DecimalField(this.message, 44, 3, 0, "RQSNO3");
/*     */      this.fields[6]=this.fieldRQSNO4=new DecimalField(this.message, 47, 3, 0, "RQSNO4");
/*     */      this.fields[7]=this.fieldRQSNO5=new DecimalField(this.message, 50, 3, 0, "RQSNO5");
/*     */      this.fields[8]=this.fieldRQSNO6=new DecimalField(this.message, 53, 3, 0, "RQSNO6");
/*     */      this.fields[9]=this.fieldRQSVL1=new CharacterField(this.message, 56, 60, "RQSVL1");
/*     */      this.fields[10]=this.fieldRQSVL2=new CharacterField(this.message, 116, 60, "RQSVL2");
/*     */      this.fields[11]=this.fieldRQSVL3=new CharacterField(this.message, 176, 60, "RQSVL3");
/*     */      this.fields[12]=this.fieldRQSVL4=new CharacterField(this.message, 236, 60, "RQSVL4");
/*     */      this.fields[13]=this.fieldRQSVL5=new CharacterField(this.message, 296, 60, "RQSVL5");
/*     */      this.fields[14]=this.fieldRQSVL6=new CharacterField(this.message, 356, 60, "RQSVL6");
/*     */      this.fields[15]=this.fieldRQSRP1=new CharacterField(this.message, 416, 60, "RQSRP1");
/*     */      this.fields[16]=this.fieldRQSRP2=new CharacterField(this.message, 476, 60, "RQSRP2");
/*     */      this.fields[17]=this.fieldRQSRP3=new CharacterField(this.message, 536, 60, "RQSRP3");
/*     */      this.fields[18]=this.fieldRQSRP4=new CharacterField(this.message, 596, 60, "RQSRP4");
/*     */      this.fields[19]=this.fieldRQSRP5=new CharacterField(this.message, 656, 60, "RQSRP5");
/*     */      this.fields[20]=this.fieldRQSRP6=new CharacterField(this.message, 716, 60, "RQSRP6");
/*     */      this.fields[21]=this.fieldRQSDF1=new CharacterField(this.message, 776, 1, "RQSDF1");
/*     */      this.fields[22]=this.fieldRQSDF2=new CharacterField(this.message, 777, 1, "RQSDF2");
/*     */      this.fields[23]=this.fieldRQSDF3=new CharacterField(this.message, 778, 1, "RQSDF3");
/*     */      this.fields[24]=this.fieldRQSDF4=new CharacterField(this.message, 779, 1, "RQSDF4");
/*     */      this.fields[25]=this.fieldRQSDF5=new CharacterField(this.message, 780, 1, "RQSDF5");
/*     */      this.fields[26]=this.fieldRQSDF6=new CharacterField(this.message, 781, 1, "RQSDF6");
/*     */      this.fields[27]=this.fieldRQSCR1=new CharacterField(this.message, 782, 1, "RQSCR1");
/*     */      this.fields[28]=this.fieldRQSCR2=new CharacterField(this.message, 783, 1, "RQSCR2");
/*     */      this.fields[29]=this.fieldRQSCR3=new CharacterField(this.message, 784, 1, "RQSCR3");
/*     */      this.fields[30]=this.fieldRQSCR4=new CharacterField(this.message, 785, 1, "RQSCR4");
/*     */      this.fields[31]=this.fieldRQSCR5=new CharacterField(this.message, 786, 1, "RQSCR5");
/*     */      this.fields[32]=this.fieldRQSCR6=new CharacterField(this.message, 787, 1, "RQSCR6");
/*     */ 
/* 218 */     synchronized (tlookup)
/*     */     {
/* 220 */       if (tlookup.isEmpty())
/*     */       {
/* 222 */         for (int i = 0; i < tnames.length; i++) {
/* 223 */           tlookup.put(tnames[i], new Integer(i));
/*     */         }
/*     */       }
/*     */     }
/* 227 */     this.taglookup = tlookup;
/*     */   }
/*     */ 
/*     */   public void setRQSOPT(String newvalue)
/*     */   {
/* 235 */     this.fieldRQSOPT.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getRQSOPT()
/*     */   {
/* 243 */     return this.fieldRQSOPT.getString();
/*     */   }
/*     */ 
/*     */   public void setRQSOPT(BigDecimal newvalue)
/*     */   {
/* 251 */     this.fieldRQSOPT.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalRQSOPT()
/*     */   {
/* 259 */     return this.fieldRQSOPT.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setRQSIDN(String newvalue)
/*     */   {
/* 267 */     this.fieldRQSIDN.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getRQSIDN()
/*     */   {
/* 275 */     return this.fieldRQSIDN.getString();
/*     */   }
/*     */ 
/*     */   public void setRQSCUN(String newvalue)
/*     */   {
/* 283 */     this.fieldRQSCUN.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getRQSCUN()
/*     */   {
/* 291 */     return this.fieldRQSCUN.getString();
/*     */   }
/*     */ 
/*     */   public void setRQSCUN(BigDecimal newvalue)
/*     */   {
/* 299 */     this.fieldRQSCUN.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalRQSCUN()
/*     */   {
/* 307 */     return this.fieldRQSCUN.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setRQSNO1(String newvalue)
/*     */   {
/* 315 */     this.fieldRQSNO1.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getRQSNO1()
/*     */   {
/* 323 */     return this.fieldRQSNO1.getString();
/*     */   }
/*     */ 
/*     */   public void setRQSNO1(BigDecimal newvalue)
/*     */   {
/* 331 */     this.fieldRQSNO1.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalRQSNO1()
/*     */   {
/* 339 */     return this.fieldRQSNO1.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setRQSNO2(String newvalue)
/*     */   {
/* 347 */     this.fieldRQSNO2.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getRQSNO2()
/*     */   {
/* 355 */     return this.fieldRQSNO2.getString();
/*     */   }
/*     */ 
/*     */   public void setRQSNO2(BigDecimal newvalue)
/*     */   {
/* 363 */     this.fieldRQSNO2.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalRQSNO2()
/*     */   {
/* 371 */     return this.fieldRQSNO2.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setRQSNO3(String newvalue)
/*     */   {
/* 379 */     this.fieldRQSNO3.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getRQSNO3()
/*     */   {
/* 387 */     return this.fieldRQSNO3.getString();
/*     */   }
/*     */ 
/*     */   public void setRQSNO3(BigDecimal newvalue)
/*     */   {
/* 395 */     this.fieldRQSNO3.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalRQSNO3()
/*     */   {
/* 403 */     return this.fieldRQSNO3.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setRQSNO4(String newvalue)
/*     */   {
/* 411 */     this.fieldRQSNO4.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getRQSNO4()
/*     */   {
/* 419 */     return this.fieldRQSNO4.getString();
/*     */   }
/*     */ 
/*     */   public void setRQSNO4(BigDecimal newvalue)
/*     */   {
/* 427 */     this.fieldRQSNO4.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalRQSNO4()
/*     */   {
/* 435 */     return this.fieldRQSNO4.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setRQSNO5(String newvalue)
/*     */   {
/* 443 */     this.fieldRQSNO5.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getRQSNO5()
/*     */   {
/* 451 */     return this.fieldRQSNO5.getString();
/*     */   }
/*     */ 
/*     */   public void setRQSNO5(BigDecimal newvalue)
/*     */   {
/* 459 */     this.fieldRQSNO5.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalRQSNO5()
/*     */   {
/* 467 */     return this.fieldRQSNO5.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setRQSNO6(String newvalue)
/*     */   {
/* 475 */     this.fieldRQSNO6.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getRQSNO6()
/*     */   {
/* 483 */     return this.fieldRQSNO6.getString();
/*     */   }
/*     */ 
/*     */   public void setRQSNO6(BigDecimal newvalue)
/*     */   {
/* 491 */     this.fieldRQSNO6.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalRQSNO6()
/*     */   {
/* 499 */     return this.fieldRQSNO6.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setRQSVL1(String newvalue)
/*     */   {
/* 507 */     this.fieldRQSVL1.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getRQSVL1()
/*     */   {
/* 515 */     return this.fieldRQSVL1.getString();
/*     */   }
/*     */ 
/*     */   public void setRQSVL2(String newvalue)
/*     */   {
/* 523 */     this.fieldRQSVL2.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getRQSVL2()
/*     */   {
/* 531 */     return this.fieldRQSVL2.getString();
/*     */   }
/*     */ 
/*     */   public void setRQSVL3(String newvalue)
/*     */   {
/* 539 */     this.fieldRQSVL3.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getRQSVL3()
/*     */   {
/* 547 */     return this.fieldRQSVL3.getString();
/*     */   }
/*     */ 
/*     */   public void setRQSVL4(String newvalue)
/*     */   {
/* 555 */     this.fieldRQSVL4.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getRQSVL4()
/*     */   {
/* 563 */     return this.fieldRQSVL4.getString();
/*     */   }
/*     */ 
/*     */   public void setRQSVL5(String newvalue)
/*     */   {
/* 571 */     this.fieldRQSVL5.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getRQSVL5()
/*     */   {
/* 579 */     return this.fieldRQSVL5.getString();
/*     */   }
/*     */ 
/*     */   public void setRQSVL6(String newvalue)
/*     */   {
/* 587 */     this.fieldRQSVL6.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getRQSVL6()
/*     */   {
/* 595 */     return this.fieldRQSVL6.getString();
/*     */   }
/*     */ 
/*     */   public void setRQSRP1(String newvalue)
/*     */   {
/* 603 */     this.fieldRQSRP1.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getRQSRP1()
/*     */   {
/* 611 */     return this.fieldRQSRP1.getString();
/*     */   }
/*     */ 
/*     */   public void setRQSRP2(String newvalue)
/*     */   {
/* 619 */     this.fieldRQSRP2.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getRQSRP2()
/*     */   {
/* 627 */     return this.fieldRQSRP2.getString();
/*     */   }
/*     */ 
/*     */   public void setRQSRP3(String newvalue)
/*     */   {
/* 635 */     this.fieldRQSRP3.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getRQSRP3()
/*     */   {
/* 643 */     return this.fieldRQSRP3.getString();
/*     */   }
/*     */ 
/*     */   public void setRQSRP4(String newvalue)
/*     */   {
/* 651 */     this.fieldRQSRP4.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getRQSRP4()
/*     */   {
/* 659 */     return this.fieldRQSRP4.getString();
/*     */   }
/*     */ 
/*     */   public void setRQSRP5(String newvalue)
/*     */   {
/* 667 */     this.fieldRQSRP5.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getRQSRP5()
/*     */   {
/* 675 */     return this.fieldRQSRP5.getString();
/*     */   }
/*     */ 
/*     */   public void setRQSRP6(String newvalue)
/*     */   {
/* 683 */     this.fieldRQSRP6.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getRQSRP6()
/*     */   {
/* 691 */     return this.fieldRQSRP6.getString();
/*     */   }
/*     */ 
/*     */   public void setRQSDF1(String newvalue)
/*     */   {
/* 699 */     this.fieldRQSDF1.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getRQSDF1()
/*     */   {
/* 707 */     return this.fieldRQSDF1.getString();
/*     */   }
/*     */ 
/*     */   public void setRQSDF2(String newvalue)
/*     */   {
/* 715 */     this.fieldRQSDF2.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getRQSDF2()
/*     */   {
/* 723 */     return this.fieldRQSDF2.getString();
/*     */   }
/*     */ 
/*     */   public void setRQSDF3(String newvalue)
/*     */   {
/* 731 */     this.fieldRQSDF3.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getRQSDF3()
/*     */   {
/* 739 */     return this.fieldRQSDF3.getString();
/*     */   }
/*     */ 
/*     */   public void setRQSDF4(String newvalue)
/*     */   {
/* 747 */     this.fieldRQSDF4.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getRQSDF4()
/*     */   {
/* 755 */     return this.fieldRQSDF4.getString();
/*     */   }
/*     */ 
/*     */   public void setRQSDF5(String newvalue)
/*     */   {
/* 763 */     this.fieldRQSDF5.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getRQSDF5()
/*     */   {
/* 771 */     return this.fieldRQSDF5.getString();
/*     */   }
/*     */ 
/*     */   public void setRQSDF6(String newvalue)
/*     */   {
/* 779 */     this.fieldRQSDF6.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getRQSDF6()
/*     */   {
/* 787 */     return this.fieldRQSDF6.getString();
/*     */   }
/*     */ 
/*     */   public void setRQSCR1(String newvalue)
/*     */   {
/* 795 */     this.fieldRQSCR1.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getRQSCR1()
/*     */   {
/* 803 */     return this.fieldRQSCR1.getString();
/*     */   }
/*     */ 
/*     */   public void setRQSCR2(String newvalue)
/*     */   {
/* 811 */     this.fieldRQSCR2.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getRQSCR2()
/*     */   {
/* 819 */     return this.fieldRQSCR2.getString();
/*     */   }
/*     */ 
/*     */   public void setRQSCR3(String newvalue)
/*     */   {
/* 827 */     this.fieldRQSCR3.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getRQSCR3()
/*     */   {
/* 835 */     return this.fieldRQSCR3.getString();
/*     */   }
/*     */ 
/*     */   public void setRQSCR4(String newvalue)
/*     */   {
/* 843 */     this.fieldRQSCR4.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getRQSCR4()
/*     */   {
/* 851 */     return this.fieldRQSCR4.getString();
/*     */   }
/*     */ 
/*     */   public void setRQSCR5(String newvalue)
/*     */   {
/* 859 */     this.fieldRQSCR5.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getRQSCR5()
/*     */   {
/* 867 */     return this.fieldRQSCR5.getString();
/*     */   }
/*     */ 
/*     */   public void setRQSCR6(String newvalue)
/*     */   {
/* 875 */     this.fieldRQSCR6.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getRQSCR6()
/*     */   {
/* 883 */     return this.fieldRQSCR6.getString();
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.REGISQSTMessage
 * JD-Core Version:    0.6.0
 */