/*     */ package com.activo.gateway.dibs.messages;
/*     */ 
/*     */ import java.math.BigDecimal;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*     */ 
/*     */ public class IN095601Message extends MessageRecord
/*     */ {
/*  19 */   final int FIELDCOUNT = 15;
/*  20 */   private CharacterField fieldIN956EUSR = null;
/*  21 */   private DecimalField fieldIN956VNUM = null;
/*  22 */   private CharacterField fieldIN956VNME = null;
/*  23 */   private DecimalField fieldIN956DRAC = null;
/*  24 */   private DecimalField fieldIN956PYMT = null;
/*  25 */   private CharacterField fieldIN956PCCY = null;
/*  26 */   private DecimalField fieldIN956DAT1 = null;
/*  27 */   private DecimalField fieldIN956DAT2 = null;
/*  28 */   private DecimalField fieldIN956DAT3 = null;
/*  29 */   private CharacterField fieldIN956DSV1 = null;
/*  30 */   private CharacterField fieldIN956DSV2 = null;
/*  31 */   private CharacterField fieldIN956DSV3 = null;
/*  32 */   private CharacterField fieldIN956DSV4 = null;
/*  33 */   private CharacterField fieldIN956DSV5 = null;
/*  34 */   private CharacterField fieldIN956DSV6 = null;
/*     */ 
/*     */   public IN095601Message()
/*     */   {
/*  41 */     createFields();
/*  42 */     initialize();
/*     */   }
/*     */ 
/*     */   protected void createFields()
/*     */   {
/*  50 */     this.recordsize = 217;
/*  51 */     this.fileid = "1000907131747";
/*  52 */     this.recordid = "3E03A65794938";
/*  53 */     this.message = new byte[getByteLength()];
/*  54 */     this.formatname = "IN095601";
/*  55 */     this.fieldnames = new String[15];
/*  56 */     this.tagnames = new String[15];
/*  57 */     this.fields = new MessageField[15];
/*     */ 
/*  59 */     this.fieldnames[0] = "IN956EUSR";
/*  60 */     this.tagnames[0] = "IN956EUSR";
/*     */      this.fields[0]=this.fieldIN956EUSR=new CharacterField(this.message, 10, 10, "IN956EUSR");
/*     */ 
/*  63 */     this.fieldnames[1] = "IN956VNUM";
/*  64 */     this.tagnames[1] = "IN956VNUM";
/*     */      this.fields[1]=this.fieldIN956VNUM=new DecimalField(this.message, 20, 10, 0, "IN956VNUM");
/*     */ 
/*  67 */     this.fieldnames[2] = "IN956VNME";
/*  68 */     this.tagnames[2] = "IN956VNME";
/*     */      this.fields[2]=this.fieldIN956VNME=new CharacterField(this.message, 30, 35, "IN956VNME");
/*     */ 
/*  71 */     this.fieldnames[3] = "IN956DRAC";
/*  72 */     this.tagnames[3] = "IN956DRAC";
/*     */      this.fields[3]=this.fieldIN956DRAC=new DecimalField(this.message, 65, 13, 0, "IN956DRAC");
/*     */ 
/*  75 */     this.fieldnames[4] = "IN956PYMT";
/*  76 */     this.tagnames[4] = "IN956PYMT";
/*     */      this.fields[4]=this.fieldIN956PYMT=new DecimalField(this.message, 78, 17, 2, "IN956PYMT");
/*     */ 
/*  79 */     this.fieldnames[5] = "IN956PCCY";
/*  80 */     this.tagnames[5] = "IN956PCCY";
/*     */      this.fields[5]=this.fieldIN956PCCY=new CharacterField(this.message, 95, 3, "IN956PCCY");
/*     */ 
/*  83 */     this.fieldnames[6] = "IN956DAT1";
/*  84 */     this.tagnames[6] = "IN956DAT1";
/*     */      this.fields[6]=this.fieldIN956DAT1=new DecimalField(this.message, 98, 3, 0, "IN956DAT1");
/*     */ 
/*  87 */     this.fieldnames[7] = "IN956DAT2";
/*  88 */     this.tagnames[7] = "IN956DAT2";
/*     */      this.fields[7]=this.fieldIN956DAT2=new DecimalField(this.message, 101, 3, 0, "IN956DAT2");
/*     */ 
/*  91 */     this.fieldnames[8] = "IN956DAT3";
/*  92 */     this.tagnames[8] = "IN956DAT3";
/*     */      this.fields[8]=this.fieldIN956DAT3=new DecimalField(this.message, 104, 3, 0, "IN956DAT3");
/*     */ 
/*  95 */     this.fieldnames[9] = "IN956DSV1";
/*  96 */     this.tagnames[9] = "IN956DSV1";
/*     */      this.fields[9]=this.fieldIN956DSV1=new CharacterField(this.message, 107, 20, "IN956DSV1");
/*     */ 
/*  99 */     this.fieldnames[10] = "IN956DSV2";
/* 100 */     this.tagnames[10] = "IN956DSV2";
/*     */      this.fields[10]=this.fieldIN956DSV2=new CharacterField(this.message, 127, 20, "IN956DSV2");
/*     */ 
/* 103 */     this.fieldnames[11] = "IN956DSV3";
/* 104 */     this.tagnames[11] = "IN956DSV3";
/*     */      this.fields[11]=this.fieldIN956DSV3=new CharacterField(this.message, 147, 20, "IN956DSV3");
/*     */ 
/* 107 */     this.fieldnames[12] = "IN956DSV4";
/* 108 */     this.tagnames[12] = "IN956DSV4";
/*     */      this.fields[12]=this.fieldIN956DSV4=new CharacterField(this.message, 167, 20, "IN956DSV4");
/*     */ 
/* 111 */     this.fieldnames[13] = "IN956DSV5";
/* 112 */     this.tagnames[13] = "IN956DSV5";
/*     */      this.fields[13]=this.fieldIN956DSV5=new CharacterField(this.message, 187, 20, "IN956DSV5");
/*     */ 
/* 115 */     this.fieldnames[14] = "IN956DSV6";
/* 116 */     this.tagnames[14] = "IN956DSV6";
/*     */      this.fields[14]=this.fieldIN956DSV6=new CharacterField(this.message, 207, 20, "IN956DSV6");
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalIN956DAT1()
/*     */   {
/* 125 */     return this.fieldIN956DAT1.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalIN956DAT2()
/*     */   {
/* 132 */     return this.fieldIN956DAT2.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalIN956DAT3()
/*     */   {
/* 139 */     return this.fieldIN956DAT3.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalIN956DRAC()
/*     */   {
/* 146 */     return this.fieldIN956DRAC.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalIN956PYMT()
/*     */   {
/* 153 */     return this.fieldIN956PYMT.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalIN956VNUM()
/*     */   {
/* 160 */     return this.fieldIN956VNUM.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public String getIN956DAT1()
/*     */   {
/* 167 */     return this.fieldIN956DAT1.getString();
/*     */   }
/*     */ 
/*     */   public String getIN956DAT2()
/*     */   {
/* 174 */     return this.fieldIN956DAT2.getString();
/*     */   }
/*     */ 
/*     */   public String getIN956DAT3()
/*     */   {
/* 181 */     return this.fieldIN956DAT3.getString();
/*     */   }
/*     */ 
/*     */   public String getIN956DRAC()
/*     */   {
/* 188 */     return this.fieldIN956DRAC.getString();
/*     */   }
/*     */ 
/*     */   public String getIN956DSV1()
/*     */   {
/* 195 */     return this.fieldIN956DSV1.getString();
/*     */   }
/*     */ 
/*     */   public String getIN956DSV2()
/*     */   {
/* 202 */     return this.fieldIN956DSV2.getString();
/*     */   }
/*     */ 
/*     */   public String getIN956DSV3()
/*     */   {
/* 209 */     return this.fieldIN956DSV3.getString();
/*     */   }
/*     */ 
/*     */   public String getIN956DSV4()
/*     */   {
/* 216 */     return this.fieldIN956DSV4.getString();
/*     */   }
/*     */ 
/*     */   public String getIN956DSV5()
/*     */   {
/* 223 */     return this.fieldIN956DSV5.getString();
/*     */   }
/*     */ 
/*     */   public String getIN956DSV6()
/*     */   {
/* 230 */     return this.fieldIN956DSV6.getString();
/*     */   }
/*     */ 
/*     */   public String getIN956EUSR()
/*     */   {
/* 237 */     return this.fieldIN956EUSR.getString();
/*     */   }
/*     */ 
/*     */   public String getIN956PCCY()
/*     */   {
/* 244 */     return this.fieldIN956PCCY.getString();
/*     */   }
/*     */ 
/*     */   public String getIN956PYMT()
/*     */   {
/* 251 */     return this.fieldIN956PYMT.getString();
/*     */   }
/*     */ 
/*     */   public String getIN956VNME()
/*     */   {
/* 258 */     return this.fieldIN956VNME.getString();
/*     */   }
/*     */ 
/*     */   public String getIN956VNUM()
/*     */   {
/* 265 */     return this.fieldIN956VNUM.getString();
/*     */   }
/*     */ 
/*     */   public void setIN956DAT1(String newvalue)
/*     */   {
/* 272 */     this.fieldIN956DAT1.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN956DAT1(BigDecimal newvalue)
/*     */   {
/* 279 */     this.fieldIN956DAT1.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN956DAT2(String newvalue)
/*     */   {
/* 286 */     this.fieldIN956DAT2.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN956DAT2(BigDecimal newvalue)
/*     */   {
/* 293 */     this.fieldIN956DAT2.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN956DAT3(String newvalue)
/*     */   {
/* 300 */     this.fieldIN956DAT3.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN956DAT3(BigDecimal newvalue)
/*     */   {
/* 307 */     this.fieldIN956DAT3.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN956DRAC(String newvalue)
/*     */   {
/* 314 */     this.fieldIN956DRAC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN956DRAC(BigDecimal newvalue)
/*     */   {
/* 321 */     this.fieldIN956DRAC.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN956DSV1(String newvalue)
/*     */   {
/* 328 */     this.fieldIN956DSV1.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN956DSV2(String newvalue)
/*     */   {
/* 335 */     this.fieldIN956DSV2.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN956DSV3(String newvalue)
/*     */   {
/* 342 */     this.fieldIN956DSV3.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN956DSV4(String newvalue)
/*     */   {
/* 349 */     this.fieldIN956DSV4.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN956DSV5(String newvalue)
/*     */   {
/* 356 */     this.fieldIN956DSV5.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN956DSV6(String newvalue)
/*     */   {
/* 363 */     this.fieldIN956DSV6.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN956EUSR(String newvalue)
/*     */   {
/* 370 */     this.fieldIN956EUSR.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN956PCCY(String newvalue)
/*     */   {
/* 377 */     this.fieldIN956PCCY.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN956PYMT(String newvalue)
/*     */   {
/* 384 */     this.fieldIN956PYMT.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN956PYMT(BigDecimal newvalue)
/*     */   {
/* 391 */     this.fieldIN956PYMT.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN956VNME(String newvalue)
/*     */   {
/* 398 */     this.fieldIN956VNME.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN956VNUM(String newvalue)
/*     */   {
/* 405 */     this.fieldIN956VNUM.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN956VNUM(BigDecimal newvalue)
/*     */   {
/* 412 */     this.fieldIN956VNUM.setBigDecimal(newvalue);
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.IN095601Message
 * JD-Core Version:    0.6.0
 */