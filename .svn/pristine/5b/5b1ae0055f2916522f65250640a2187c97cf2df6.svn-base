/*     */ package com.activo.gateway.dibs.messages;
/*     */ 
/*     */ import java.math.BigDecimal;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*     */ 
/*     */ public class ILN006001Message extends MessageRecord
/*     */ {
/*  19 */   final int FIELDCOUNT = 23;
/*  20 */   private CharacterField fieldLN61USER = null;
/*  21 */   private CharacterField fieldLN61TYPE = null;
/*  22 */   private DecimalField fieldLN61LNECUN = null;
/*  23 */   private DecimalField fieldLN61LNENUM = null;
/*  24 */   private CharacterField fieldLN61LNETYL = null;
/*  25 */   private CharacterField fieldLN61LNECCY = null;
/*  26 */   private DecimalField fieldLN61LNEAMN = null;
/*  27 */   private DecimalField fieldLN61LNEREA = null;
/*  28 */   private DecimalField fieldLN61LNEAMU = null;
/*  29 */   private DecimalField fieldLN61LNEOFA = null;
/*  30 */   private DecimalField fieldLN61COLAMT = null;
/*  31 */   private DecimalField fieldLN61LNEOCM = null;
/*  32 */   private DecimalField fieldLN61LNERE1 = null;
/*  33 */   private DecimalField fieldLN61LNERE2 = null;
/*  34 */   private DecimalField fieldLN61LNERE3 = null;
/*  35 */   private CharacterField fieldLN61LNEPUR = null;
/*  36 */   private DecimalField fieldLN61LNEOP1 = null;
/*  37 */   private DecimalField fieldLN61LNEOP2 = null;
/*  38 */   private DecimalField fieldLN61LNEOP3 = null;
/*  39 */   private DecimalField fieldLN61LNEMT1 = null;
/*  40 */   private DecimalField fieldLN61LNEMT2 = null;
/*  41 */   private DecimalField fieldLN61LNEMT3 = null;
/*  42 */   private DecimalField fieldLN61AVAILA = null;
/*     */ 
/*     */   public ILN006001Message()
/*     */   {
/*  49 */     createFields();
/*  50 */     initialize();
/*     */   }
/*     */ 
/*     */   protected void createFields()
/*     */   {
/*  59 */     this.recordsize = 217;
/*  60 */     this.fileid = "1001010192713";
/*  61 */     this.recordid = "4AA69120A3080";
/*  62 */     this.message = new byte[getByteLength()];
/*  63 */     this.formatname = "ILN006001";
/*  64 */     this.fieldnames = new String[23];
/*  65 */     this.tagnames = new String[23];
/*  66 */     this.fields = new MessageField[23];
/*     */ 
/*  68 */     this.fieldnames[0] = "LN61USER";
/*  69 */     this.tagnames[0] = "LN61USER";
/*     */      this.fields[0]=this.fieldLN61USER=new CharacterField(this.message, 10, 10, "LN61USER");
/*     */ 
/*  72 */     this.fieldnames[1] = "LN61TYPE";
/*  73 */     this.tagnames[1] = "LN61TYPE";
/*     */      this.fields[1]=this.fieldLN61TYPE=new CharacterField(this.message, 20, 4, "LN61TYPE");
/*     */ 
/*  76 */     this.fieldnames[2] = "LN61LNECUN";
/*  77 */     this.tagnames[2] = "LN61LNECUN";
/*     */      this.fields[2]=this.fieldLN61LNECUN=new DecimalField(this.message, 24, 10, 0, "LN61LNECUN");
/*     */ 
/*  80 */     this.fieldnames[3] = "LN61LNENUM";
/*  81 */     this.tagnames[3] = "LN61LNENUM";
/*     */      this.fields[3]=this.fieldLN61LNENUM=new DecimalField(this.message, 34, 5, 0, "LN61LNENUM");
/*     */ 
/*  84 */     this.fieldnames[4] = "LN61LNETYL";
/*  85 */     this.tagnames[4] = "LN61LNETYL";
/*     */      this.fields[4]=this.fieldLN61LNETYL=new CharacterField(this.message, 39, 4, "LN61LNETYL");
/*     */ 
/*  88 */     this.fieldnames[5] = "LN61LNECCY";
/*  89 */     this.tagnames[5] = "LN61LNECCY";
/*     */      this.fields[5]=this.fieldLN61LNECCY=new CharacterField(this.message, 43, 3, "LN61LNECCY");
/*     */ 
/*  92 */     this.fieldnames[6] = "LN61LNEAMN";
/*  93 */     this.tagnames[6] = "LN61LNEAMN";
/*     */      this.fields[6]=this.fieldLN61LNEAMN=new DecimalField(this.message, 46, 17, 2, "LN61LNEAMN");
/*     */ 
/*  96 */     this.fieldnames[7] = "LN61LNEREA";
/*  97 */     this.tagnames[7] = "LN61LNEREA";
/*     */      this.fields[7]=this.fieldLN61LNEREA=new DecimalField(this.message, 63, 17, 2, "LN61LNEREA");
/*     */ 
/* 100 */     this.fieldnames[8] = "LN61LNEAMU";
/* 101 */     this.tagnames[8] = "LN61LNEAMU";
/*     */      this.fields[8]=this.fieldLN61LNEAMU=new DecimalField(this.message, 80, 17, 2, "LN61LNEAMU");
/*     */ 
/* 104 */     this.fieldnames[9] = "LN61LNEOFA";
/* 105 */     this.tagnames[9] = "LN61LNEOFA";
/*     */      this.fields[9]=this.fieldLN61LNEOFA=new DecimalField(this.message, 97, 17, 2, "LN61LNEOFA");
/*     */ 
/* 108 */     this.fieldnames[10] = "LN61COLAMT";
/* 109 */     this.tagnames[10] = "LN61COLAMT";
/*     */      this.fields[10]=this.fieldLN61COLAMT=new DecimalField(this.message, 114, 17, 2, "LN61COLAMT");
/*     */ 
/* 112 */     this.fieldnames[11] = "LN61LNEOCM";
/* 113 */     this.tagnames[11] = "LN61LNEOCM";
/*     */      this.fields[11]=this.fieldLN61LNEOCM=new DecimalField(this.message, 131, 17, 2, "LN61LNEOCM");
/*     */ 
/* 116 */     this.fieldnames[12] = "LN61LNERE1";
/* 117 */     this.tagnames[12] = "LN61LNERE1";
/*     */      this.fields[12]=this.fieldLN61LNERE1=new DecimalField(this.message, 148, 3, 0, "LN61LNERE1");
/*     */ 
/* 120 */     this.fieldnames[13] = "LN61LNERE2";
/* 121 */     this.tagnames[13] = "LN61LNERE2";
/*     */      this.fields[13]=this.fieldLN61LNERE2=new DecimalField(this.message, 151, 3, 0, "LN61LNERE2");
/*     */ 
/* 124 */     this.fieldnames[14] = "LN61LNERE3";
/* 125 */     this.tagnames[14] = "LN61LNERE3";
/*     */      this.fields[14]=this.fieldLN61LNERE3=new DecimalField(this.message, 154, 3, 0, "LN61LNERE3");
/*     */ 
/* 128 */     this.fieldnames[15] = "LN61LNEPUR";
/* 129 */     this.tagnames[15] = "LN61LNEPUR";
/*     */      this.fields[15]=this.fieldLN61LNEPUR=new CharacterField(this.message, 157, 35, "LN61LNEPUR");
/*     */ 
/* 132 */     this.fieldnames[16] = "LN61LNEOP1";
/* 133 */     this.tagnames[16] = "LN61LNEOP1";
/*     */      this.fields[16]=this.fieldLN61LNEOP1=new DecimalField(this.message, 192, 3, 0, "LN61LNEOP1");
/*     */ 
/* 136 */     this.fieldnames[17] = "LN61LNEOP2";
/* 137 */     this.tagnames[17] = "LN61LNEOP2";
/*     */      this.fields[17]=this.fieldLN61LNEOP2=new DecimalField(this.message, 195, 3, 0, "LN61LNEOP2");
/*     */ 
/* 140 */     this.fieldnames[18] = "LN61LNEOP3";
/* 141 */     this.tagnames[18] = "LN61LNEOP3";
/*     */      this.fields[18]=this.fieldLN61LNEOP3=new DecimalField(this.message, 198, 3, 0, "LN61LNEOP3");
/*     */ 
/* 144 */     this.fieldnames[19] = "LN61LNEMT1";
/* 145 */     this.tagnames[19] = "LN61LNEMT1";
/*     */      this.fields[19]=this.fieldLN61LNEMT1=new DecimalField(this.message, 201, 3, 0, "LN61LNEMT1");
/*     */ 
/* 148 */     this.fieldnames[20] = "LN61LNEMT2";
/* 149 */     this.tagnames[20] = "LN61LNEMT2";
/*     */      this.fields[20]=this.fieldLN61LNEMT2=new DecimalField(this.message, 204, 3, 0, "LN61LNEMT2");
/*     */ 
/* 152 */     this.fieldnames[21] = "LN61LNEMT3";
/* 153 */     this.tagnames[21] = "LN61LNEMT3";
/*     */      this.fields[21]=this.fieldLN61LNEMT3=new DecimalField(this.message, 207, 3, 0, "LN61LNEMT3");
/*     */ 
/* 156 */     this.fieldnames[22] = "LN61AVAILA";
/* 157 */     this.tagnames[22] = "LN61AVAILA";
/*     */      this.fields[22]=this.fieldLN61AVAILA=new DecimalField(this.message, 210, 17, 2, "LN61AVAILA");
/*     */   }
/*     */ 
/*     */   public void setLN61USER(String newvalue)
/*     */   {
/* 167 */     this.fieldLN61USER.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getLN61USER()
/*     */   {
/* 175 */     return this.fieldLN61USER.getString();
/*     */   }
/*     */ 
/*     */   public void setLN61TYPE(String newvalue)
/*     */   {
/* 183 */     this.fieldLN61TYPE.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getLN61TYPE()
/*     */   {
/* 191 */     return this.fieldLN61TYPE.getString();
/*     */   }
/*     */ 
/*     */   public void setLN61LNECUN(String newvalue)
/*     */   {
/* 199 */     this.fieldLN61LNECUN.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getLN61LNECUN()
/*     */   {
/* 207 */     return this.fieldLN61LNECUN.getString();
/*     */   }
/*     */ 
/*     */   public void setLN61LNECUN(BigDecimal newvalue)
/*     */   {
/* 215 */     this.fieldLN61LNECUN.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalLN61LNECUN()
/*     */   {
/* 223 */     return this.fieldLN61LNECUN.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setLN61LNENUM(String newvalue)
/*     */   {
/* 231 */     this.fieldLN61LNENUM.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getLN61LNENUM()
/*     */   {
/* 239 */     return this.fieldLN61LNENUM.getString();
/*     */   }
/*     */ 
/*     */   public void setLN61LNENUM(BigDecimal newvalue)
/*     */   {
/* 247 */     this.fieldLN61LNENUM.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalLN61LNENUM()
/*     */   {
/* 255 */     return this.fieldLN61LNENUM.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setLN61LNETYL(String newvalue)
/*     */   {
/* 263 */     this.fieldLN61LNETYL.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getLN61LNETYL()
/*     */   {
/* 271 */     return this.fieldLN61LNETYL.getString();
/*     */   }
/*     */ 
/*     */   public void setLN61LNECCY(String newvalue)
/*     */   {
/* 279 */     this.fieldLN61LNECCY.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getLN61LNECCY()
/*     */   {
/* 287 */     return this.fieldLN61LNECCY.getString();
/*     */   }
/*     */ 
/*     */   public void setLN61LNEAMN(String newvalue)
/*     */   {
/* 295 */     this.fieldLN61LNEAMN.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getLN61LNEAMN()
/*     */   {
/* 303 */     return this.fieldLN61LNEAMN.getString();
/*     */   }
/*     */ 
/*     */   public void setLN61LNEAMN(BigDecimal newvalue)
/*     */   {
/* 311 */     this.fieldLN61LNEAMN.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalLN61LNEAMN()
/*     */   {
/* 319 */     return this.fieldLN61LNEAMN.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setLN61LNEREA(String newvalue)
/*     */   {
/* 327 */     this.fieldLN61LNEREA.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getLN61LNEREA()
/*     */   {
/* 335 */     return this.fieldLN61LNEREA.getString();
/*     */   }
/*     */ 
/*     */   public void setLN61LNEREA(BigDecimal newvalue)
/*     */   {
/* 343 */     this.fieldLN61LNEREA.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalLN61LNEREA()
/*     */   {
/* 351 */     return this.fieldLN61LNEREA.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setLN61LNEAMU(String newvalue)
/*     */   {
/* 359 */     this.fieldLN61LNEAMU.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getLN61LNEAMU()
/*     */   {
/* 367 */     return this.fieldLN61LNEAMU.getString();
/*     */   }
/*     */ 
/*     */   public void setLN61LNEAMU(BigDecimal newvalue)
/*     */   {
/* 375 */     this.fieldLN61LNEAMU.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalLN61LNEAMU()
/*     */   {
/* 383 */     return this.fieldLN61LNEAMU.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setLN61LNEOFA(String newvalue)
/*     */   {
/* 391 */     this.fieldLN61LNEOFA.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getLN61LNEOFA()
/*     */   {
/* 399 */     return this.fieldLN61LNEOFA.getString();
/*     */   }
/*     */ 
/*     */   public void setLN61LNEOFA(BigDecimal newvalue)
/*     */   {
/* 407 */     this.fieldLN61LNEOFA.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalLN61LNEOFA()
/*     */   {
/* 415 */     return this.fieldLN61LNEOFA.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setLN61COLAMT(String newvalue)
/*     */   {
/* 423 */     this.fieldLN61COLAMT.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getLN61COLAMT()
/*     */   {
/* 431 */     return this.fieldLN61COLAMT.getString();
/*     */   }
/*     */ 
/*     */   public void setLN61COLAMT(BigDecimal newvalue)
/*     */   {
/* 439 */     this.fieldLN61COLAMT.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalLN61COLAMT()
/*     */   {
/* 447 */     return this.fieldLN61COLAMT.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setLN61LNEOCM(String newvalue)
/*     */   {
/* 455 */     this.fieldLN61LNEOCM.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getLN61LNEOCM()
/*     */   {
/* 463 */     return this.fieldLN61LNEOCM.getString();
/*     */   }
/*     */ 
/*     */   public void setLN61LNEOCM(BigDecimal newvalue)
/*     */   {
/* 471 */     this.fieldLN61LNEOCM.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalLN61LNEOCM()
/*     */   {
/* 479 */     return this.fieldLN61LNEOCM.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setLN61LNERE1(String newvalue)
/*     */   {
/* 487 */     this.fieldLN61LNERE1.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getLN61LNERE1()
/*     */   {
/* 495 */     return this.fieldLN61LNERE1.getString();
/*     */   }
/*     */ 
/*     */   public void setLN61LNERE1(BigDecimal newvalue)
/*     */   {
/* 503 */     this.fieldLN61LNERE1.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalLN61LNERE1()
/*     */   {
/* 511 */     return this.fieldLN61LNERE1.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setLN61LNERE2(String newvalue)
/*     */   {
/* 519 */     this.fieldLN61LNERE2.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getLN61LNERE2()
/*     */   {
/* 527 */     return this.fieldLN61LNERE2.getString();
/*     */   }
/*     */ 
/*     */   public void setLN61LNERE2(BigDecimal newvalue)
/*     */   {
/* 535 */     this.fieldLN61LNERE2.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalLN61LNERE2()
/*     */   {
/* 543 */     return this.fieldLN61LNERE2.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setLN61LNERE3(String newvalue)
/*     */   {
/* 551 */     this.fieldLN61LNERE3.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getLN61LNERE3()
/*     */   {
/* 559 */     return this.fieldLN61LNERE3.getString();
/*     */   }
/*     */ 
/*     */   public void setLN61LNERE3(BigDecimal newvalue)
/*     */   {
/* 567 */     this.fieldLN61LNERE3.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalLN61LNERE3()
/*     */   {
/* 575 */     return this.fieldLN61LNERE3.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setLN61LNEPUR(String newvalue)
/*     */   {
/* 583 */     this.fieldLN61LNEPUR.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getLN61LNEPUR()
/*     */   {
/* 591 */     return this.fieldLN61LNEPUR.getString();
/*     */   }
/*     */ 
/*     */   public void setLN61LNEOP1(String newvalue)
/*     */   {
/* 599 */     this.fieldLN61LNEOP1.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getLN61LNEOP1()
/*     */   {
/* 607 */     return this.fieldLN61LNEOP1.getString();
/*     */   }
/*     */ 
/*     */   public void setLN61LNEOP1(BigDecimal newvalue)
/*     */   {
/* 615 */     this.fieldLN61LNEOP1.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalLN61LNEOP1()
/*     */   {
/* 623 */     return this.fieldLN61LNEOP1.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setLN61LNEOP2(String newvalue)
/*     */   {
/* 631 */     this.fieldLN61LNEOP2.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getLN61LNEOP2()
/*     */   {
/* 639 */     return this.fieldLN61LNEOP2.getString();
/*     */   }
/*     */ 
/*     */   public void setLN61LNEOP2(BigDecimal newvalue)
/*     */   {
/* 647 */     this.fieldLN61LNEOP2.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalLN61LNEOP2()
/*     */   {
/* 655 */     return this.fieldLN61LNEOP2.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setLN61LNEOP3(String newvalue)
/*     */   {
/* 663 */     this.fieldLN61LNEOP3.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getLN61LNEOP3()
/*     */   {
/* 671 */     return this.fieldLN61LNEOP3.getString();
/*     */   }
/*     */ 
/*     */   public void setLN61LNEOP3(BigDecimal newvalue)
/*     */   {
/* 679 */     this.fieldLN61LNEOP3.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalLN61LNEOP3()
/*     */   {
/* 687 */     return this.fieldLN61LNEOP3.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setLN61LNEMT1(String newvalue)
/*     */   {
/* 695 */     this.fieldLN61LNEMT1.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getLN61LNEMT1()
/*     */   {
/* 703 */     return this.fieldLN61LNEMT1.getString();
/*     */   }
/*     */ 
/*     */   public void setLN61LNEMT1(BigDecimal newvalue)
/*     */   {
/* 711 */     this.fieldLN61LNEMT1.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalLN61LNEMT1()
/*     */   {
/* 719 */     return this.fieldLN61LNEMT1.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setLN61LNEMT2(String newvalue)
/*     */   {
/* 727 */     this.fieldLN61LNEMT2.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getLN61LNEMT2()
/*     */   {
/* 735 */     return this.fieldLN61LNEMT2.getString();
/*     */   }
/*     */ 
/*     */   public void setLN61LNEMT2(BigDecimal newvalue)
/*     */   {
/* 743 */     this.fieldLN61LNEMT2.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalLN61LNEMT2()
/*     */   {
/* 751 */     return this.fieldLN61LNEMT2.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setLN61LNEMT3(String newvalue)
/*     */   {
/* 759 */     this.fieldLN61LNEMT3.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getLN61LNEMT3()
/*     */   {
/* 767 */     return this.fieldLN61LNEMT3.getString();
/*     */   }
/*     */ 
/*     */   public void setLN61LNEMT3(BigDecimal newvalue)
/*     */   {
/* 775 */     this.fieldLN61LNEMT3.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalLN61LNEMT3()
/*     */   {
/* 783 */     return this.fieldLN61LNEMT3.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setLN61AVAILA(String newvalue)
/*     */   {
/* 791 */     this.fieldLN61AVAILA.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getLN61AVAILA()
/*     */   {
/* 799 */     return this.fieldLN61AVAILA.getString();
/*     */   }
/*     */ 
/*     */   public void setLN61AVAILA(BigDecimal newvalue)
/*     */   {
/* 807 */     this.fieldLN61AVAILA.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalLN61AVAILA()
/*     */   {
/* 815 */     return this.fieldLN61AVAILA.getBigDecimal();
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.ILN006001Message
 * JD-Core Version:    0.6.0
 */