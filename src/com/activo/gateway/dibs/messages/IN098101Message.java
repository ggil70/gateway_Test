/*     */ package com.activo.gateway.dibs.messages;
/*     */ 
/*     */ import java.math.BigDecimal;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*     */ 
/*     */ public class IN098101Message extends MessageRecord
/*     */ {
/*  19 */   final int FIELDCOUNT = 13;
/*  20 */   private CharacterField fieldIN981USR = null;
/*  21 */   private CharacterField fieldIN981CRNUM = null;
/*  22 */   private CharacterField fieldIN981CCY = null;
/*  23 */   private DecimalField fieldIN981CRELI = null;
/*  24 */   private DecimalField fieldIN981BALNC = null;
/*  25 */   private DecimalField fieldIN981AVAIL = null;
/*  26 */   private DecimalField fieldIN981PAYOF = null;
/*  27 */   private DecimalField fieldIN981MINPY = null;
/*  28 */   private DecimalField fieldIN981DTE1 = null;
/*  29 */   private DecimalField fieldIN981DTE2 = null;
/*  30 */   private DecimalField fieldIN981DTE3 = null;
/*  31 */   private CharacterField fieldIN981NICKN = null;
/*  32 */   private CharacterField fieldIN981ENDFL = null;
/*     */ 
/*     */   public IN098101Message()
/*     */   {
/*  39 */     createFields();
/*  40 */     initialize();
/*     */   }
/*     */ 
/*     */   protected void createFields()
/*     */   {
/*  49 */     this.recordsize = 155;
/*  50 */     this.fileid = "1020930101302";
/*  51 */     this.recordid = "49456105EBA48";
/*  52 */     this.message = new byte[getByteLength()];
/*  53 */     this.formatname = "IN098101";
/*  54 */     this.fieldnames = new String[13];
/*  55 */     this.tagnames = new String[13];
/*  56 */     this.fields = new MessageField[13];
/*     */ 
/*  58 */     this.fieldnames[0] = "IN981USR";
/*  59 */     this.tagnames[0] = "IN981USR";
/*     */      this.fields[0]=this.fieldIN981USR=new CharacterField(this.message, 10, 10, "IN981USR");
/*     */ 
/*  62 */     this.fieldnames[1] = "IN981CRNUM";
/*  63 */     this.tagnames[1] = "IN981CRNUM";
/*     */      this.fields[1]=this.fieldIN981CRNUM=new CharacterField(this.message, 20, 17, "IN981CRNUM");
/*     */ 
/*  66 */     this.fieldnames[2] = "IN981CCY";
/*  67 */     this.tagnames[2] = "IN981CCY";
/*     */      this.fields[2]=this.fieldIN981CCY=new CharacterField(this.message, 37, 3, "IN981CCY");
/*     */ 
/*  70 */     this.fieldnames[3] = "IN981CRELI";
/*  71 */     this.tagnames[3] = "IN981CRELI";
/*     */      this.fields[3]=this.fieldIN981CRELI=new DecimalField(this.message, 40, 17, 2, "IN981CRELI");
/*     */ 
/*  74 */     this.fieldnames[4] = "IN981BALNC";
/*  75 */     this.tagnames[4] = "IN981BALNC";
/*     */      this.fields[4]=this.fieldIN981BALNC=new DecimalField(this.message, 57, 17, 2, "IN981BALNC");
/*     */ 
/*  78 */     this.fieldnames[5] = "IN981AVAIL";
/*  79 */     this.tagnames[5] = "IN981AVAIL";
/*     */      this.fields[5]=this.fieldIN981AVAIL=new DecimalField(this.message, 74, 17, 2, "IN981AVAIL");
/*     */ 
/*  82 */     this.fieldnames[6] = "IN981PAYOF";
/*  83 */     this.tagnames[6] = "IN981PAYOF";
/*     */      this.fields[6]=this.fieldIN981PAYOF=new DecimalField(this.message, 91, 17, 2, "IN981PAYOF");
/*     */ 
/*  86 */     this.fieldnames[7] = "IN981MINPY";
/*  87 */     this.tagnames[7] = "IN981MINPY";
/*     */      this.fields[7]=this.fieldIN981MINPY=new DecimalField(this.message, 108, 17, 2, "IN981MINPY");
/*     */ 
/*  90 */     this.fieldnames[8] = "IN981DTE1";
/*  91 */     this.tagnames[8] = "IN981DTE1";
/*     */      this.fields[8]=this.fieldIN981DTE1=new DecimalField(this.message, 125, 3, 0, "IN981DTE1");
/*     */ 
/*  94 */     this.fieldnames[9] = "IN981DTE2";
/*  95 */     this.tagnames[9] = "IN981DTE2";
/*     */      this.fields[9]=this.fieldIN981DTE2=new DecimalField(this.message, 128, 3, 0, "IN981DTE2");
/*     */ 
/*  98 */     this.fieldnames[10] = "IN981DTE3";
/*  99 */     this.tagnames[10] = "IN981DTE3";
/*     */      this.fields[10]=this.fieldIN981DTE3=new DecimalField(this.message, 131, 3, 0, "IN981DTE3");
/*     */ 
/* 102 */     this.fieldnames[11] = "IN981NICKN";
/* 103 */     this.tagnames[11] = "IN981NICKN";
/*     */      this.fields[11]=this.fieldIN981NICKN=new CharacterField(this.message, 134, 30, "IN981NICKN");
/*     */ 
/* 106 */     this.fieldnames[12] = "IN981ENDFL";
/* 107 */     this.tagnames[12] = "IN981ENDFL";
/*     */      this.fields[12]=this.fieldIN981ENDFL=new CharacterField(this.message, 164, 1, "IN981ENDFL");
/*     */   }
/*     */ 
/*     */   public void setIN981USR(String newvalue)
/*     */   {
/* 117 */     this.fieldIN981USR.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getIN981USR()
/*     */   {
/* 125 */     return this.fieldIN981USR.getString();
/*     */   }
/*     */ 
/*     */   public void setIN981CRNUM(String newvalue)
/*     */   {
/* 133 */     this.fieldIN981CRNUM.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getIN981CRNUM()
/*     */   {
/* 141 */     return this.fieldIN981CRNUM.getString();
/*     */   }
/*     */ 
/*     */   public void setIN981CCY(String newvalue)
/*     */   {
/* 149 */     this.fieldIN981CCY.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getIN981CCY()
/*     */   {
/* 157 */     return this.fieldIN981CCY.getString();
/*     */   }
/*     */ 
/*     */   public void setIN981CRELI(String newvalue)
/*     */   {
/* 165 */     this.fieldIN981CRELI.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getIN981CRELI()
/*     */   {
/* 173 */     return this.fieldIN981CRELI.getString();
/*     */   }
/*     */ 
/*     */   public void setIN981CRELI(BigDecimal newvalue)
/*     */   {
/* 181 */     this.fieldIN981CRELI.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalIN981CRELI()
/*     */   {
/* 189 */     return this.fieldIN981CRELI.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setIN981BALNC(String newvalue)
/*     */   {
/* 197 */     this.fieldIN981BALNC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getIN981BALNC()
/*     */   {
/* 205 */     return this.fieldIN981BALNC.getString();
/*     */   }
/*     */ 
/*     */   public void setIN981BALNC(BigDecimal newvalue)
/*     */   {
/* 213 */     this.fieldIN981BALNC.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalIN981BALNC()
/*     */   {
/* 221 */     return this.fieldIN981BALNC.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setIN981AVAIL(String newvalue)
/*     */   {
/* 229 */     this.fieldIN981AVAIL.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getIN981AVAIL()
/*     */   {
/* 237 */     return this.fieldIN981AVAIL.getString();
/*     */   }
/*     */ 
/*     */   public void setIN981AVAIL(BigDecimal newvalue)
/*     */   {
/* 245 */     this.fieldIN981AVAIL.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalIN981AVAIL()
/*     */   {
/* 253 */     return this.fieldIN981AVAIL.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setIN981PAYOF(String newvalue)
/*     */   {
/* 261 */     this.fieldIN981PAYOF.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getIN981PAYOF()
/*     */   {
/* 269 */     return this.fieldIN981PAYOF.getString();
/*     */   }
/*     */ 
/*     */   public void setIN981PAYOF(BigDecimal newvalue)
/*     */   {
/* 277 */     this.fieldIN981PAYOF.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalIN981PAYOF()
/*     */   {
/* 285 */     return this.fieldIN981PAYOF.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setIN981MINPY(String newvalue)
/*     */   {
/* 293 */     this.fieldIN981MINPY.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getIN981MINPY()
/*     */   {
/* 301 */     return this.fieldIN981MINPY.getString();
/*     */   }
/*     */ 
/*     */   public void setIN981MINPY(BigDecimal newvalue)
/*     */   {
/* 309 */     this.fieldIN981MINPY.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalIN981MINPY()
/*     */   {
/* 317 */     return this.fieldIN981MINPY.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setIN981DTE1(String newvalue)
/*     */   {
/* 325 */     this.fieldIN981DTE1.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getIN981DTE1()
/*     */   {
/* 333 */     return this.fieldIN981DTE1.getString();
/*     */   }
/*     */ 
/*     */   public void setIN981DTE1(BigDecimal newvalue)
/*     */   {
/* 341 */     this.fieldIN981DTE1.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalIN981DTE1()
/*     */   {
/* 349 */     return this.fieldIN981DTE1.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setIN981DTE2(String newvalue)
/*     */   {
/* 357 */     this.fieldIN981DTE2.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getIN981DTE2()
/*     */   {
/* 365 */     return this.fieldIN981DTE2.getString();
/*     */   }
/*     */ 
/*     */   public void setIN981DTE2(BigDecimal newvalue)
/*     */   {
/* 373 */     this.fieldIN981DTE2.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalIN981DTE2()
/*     */   {
/* 381 */     return this.fieldIN981DTE2.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setIN981DTE3(String newvalue)
/*     */   {
/* 389 */     this.fieldIN981DTE3.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getIN981DTE3()
/*     */   {
/* 397 */     return this.fieldIN981DTE3.getString();
/*     */   }
/*     */ 
/*     */   public void setIN981DTE3(BigDecimal newvalue)
/*     */   {
/* 405 */     this.fieldIN981DTE3.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalIN981DTE3()
/*     */   {
/* 413 */     return this.fieldIN981DTE3.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setIN981NICKN(String newvalue)
/*     */   {
/* 421 */     this.fieldIN981NICKN.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getIN981NICKN()
/*     */   {
/* 429 */     return this.fieldIN981NICKN.getString();
/*     */   }
/*     */ 
/*     */   public void setIN981ENDFL(String newvalue)
/*     */   {
/* 437 */     this.fieldIN981ENDFL.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getIN981ENDFL()
/*     */   {
/* 445 */     return this.fieldIN981ENDFL.getString();
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.IN098101Message
 * JD-Core Version:    0.6.0
 */