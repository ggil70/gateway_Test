/*     */ package com.activo.gateway.dibs.messages;
/*     */ 
/*     */ import java.math.BigDecimal;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*     */ 
/*     */ public class IIV031101Message extends MessageRecord
/*     */ {
/*  19 */   final int FIELDCOUNT = 10;
/*  20 */   private CharacterField fieldIV31USER = null;
/*  21 */   private DecimalField fieldIV31IVSCUN = null;
/*  22 */   private CharacterField fieldIV31TYPE = null;
/*  23 */   private CharacterField fieldIV31ISIN = null;
/*  24 */   private DecimalField fieldIV31AVPUP = null;
/*  25 */   private DecimalField fieldIV31QTY = null;
/*  26 */   private DecimalField fieldIV31MKPRI = null;
/*  27 */   private DecimalField fieldIV31PANDL = null;
/*  28 */   private DecimalField fieldIV31PURPR = null;
/*  29 */   private DecimalField fieldIV31FVALUE = null;
/*     */ 
/*     */   public IIV031101Message()
/*     */   {
/*  36 */     createFields();
/*  37 */     initialize();
/*     */   }
/*     */ 
/*     */   protected void createFields()
/*     */   {
/*  45 */     this.recordsize = 124;
/*  46 */     this.fileid = "1010119191539";
/*  47 */     this.recordid = "3314E263FFFE1";
/*  48 */     this.message = new byte[getByteLength()];
/*  49 */     this.formatname = "IIV031101";
/*  50 */     this.fieldnames = new String[10];
/*  51 */     this.tagnames = new String[10];
/*  52 */     this.fields = new MessageField[10];
/*     */ 
/*  54 */     this.fieldnames[0] = "IV31USER";
/*  55 */     this.tagnames[0] = "IV31USER";
/*     */      this.fields[0]=this.fieldIV31USER=new CharacterField(this.message, 10, 10, "IV31USER");
/*     */ 
/*  58 */     this.fieldnames[1] = "IV31IVSCUN";
/*  59 */     this.tagnames[1] = "IV31IVSCUN";
/*     */      this.fields[1]=this.fieldIV31IVSCUN=new DecimalField(this.message, 20, 10, 0, "IV31IVSCUN");
/*     */ 
/*  62 */     this.fieldnames[2] = "IV31TYPE";
/*  63 */     this.tagnames[2] = "IV31TYPE";
/*     */      this.fields[2]=this.fieldIV31TYPE=new CharacterField(this.message, 30, 1, "IV31TYPE");
/*     */ 
/*  66 */     this.fieldnames[3] = "IV31ISIN";
/*  67 */     this.tagnames[3] = "IV31ISIN";
/*     */      this.fields[3]=this.fieldIV31ISIN=new CharacterField(this.message, 31, 12, "IV31ISIN");
/*     */ 
/*  70 */     this.fieldnames[4] = "IV31AVPUP";
/*  71 */     this.tagnames[4] = "IV31AVPUP";
/*     */      this.fields[4]=this.fieldIV31AVPUP=new DecimalField(this.message, 43, 17, 2, "IV31AVPUP");
/*     */ 
/*  74 */     this.fieldnames[5] = "IV31QTY";
/*  75 */     this.tagnames[5] = "IV31QTY";
/*     */      this.fields[5]=this.fieldIV31QTY=new DecimalField(this.message, 60, 6, 0, "IV31QTY");
/*     */ 
/*  78 */     this.fieldnames[6] = "IV31MKPRI";
/*  79 */     this.tagnames[6] = "IV31MKPRI";
/*     */      this.fields[6]=this.fieldIV31MKPRI=new DecimalField(this.message, 66, 17, 2, "IV31MKPRI");
/*     */ 
/*  82 */     this.fieldnames[7] = "IV31PANDL";
/*  83 */     this.tagnames[7] = "IV31PANDL";
/*     */      this.fields[7]=this.fieldIV31PANDL=new DecimalField(this.message, 83, 17, 2, "IV31PANDL");
/*     */ 
/*  86 */     this.fieldnames[8] = "IV31PURPR";
/*  87 */     this.tagnames[8] = "IV31PURPR";
/*     */      this.fields[8]=this.fieldIV31PURPR=new DecimalField(this.message, 100, 17, 2, "IV31PURPR");
/*     */ 
/*  90 */     this.fieldnames[9] = "IV31FVALUE";
/*  91 */     this.tagnames[9] = "IV31FVALUE";
/*     */      this.fields[9]=this.fieldIV31FVALUE=new DecimalField(this.message, 117, 17, 2, "IV31FVALUE");
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalIV31AVPUP()
/*     */   {
/* 100 */     return this.fieldIV31AVPUP.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalIV31FVALUE()
/*     */   {
/* 107 */     return this.fieldIV31FVALUE.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalIV31IVSCUN()
/*     */   {
/* 114 */     return this.fieldIV31IVSCUN.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalIV31MKPRI()
/*     */   {
/* 121 */     return this.fieldIV31MKPRI.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalIV31PANDL()
/*     */   {
/* 128 */     return this.fieldIV31PANDL.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalIV31PURPR()
/*     */   {
/* 135 */     return this.fieldIV31PURPR.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalIV31QTY()
/*     */   {
/* 142 */     return this.fieldIV31QTY.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public String getIV31AVPUP()
/*     */   {
/* 149 */     return this.fieldIV31AVPUP.getString();
/*     */   }
/*     */ 
/*     */   public String getIV31FVALUE()
/*     */   {
/* 156 */     return this.fieldIV31FVALUE.getString();
/*     */   }
/*     */ 
/*     */   public String getIV31ISIN()
/*     */   {
/* 163 */     return this.fieldIV31ISIN.getString();
/*     */   }
/*     */ 
/*     */   public String getIV31IVSCUN()
/*     */   {
/* 170 */     return this.fieldIV31IVSCUN.getString();
/*     */   }
/*     */ 
/*     */   public String getIV31MKPRI()
/*     */   {
/* 177 */     return this.fieldIV31MKPRI.getString();
/*     */   }
/*     */ 
/*     */   public String getIV31PANDL()
/*     */   {
/* 184 */     return this.fieldIV31PANDL.getString();
/*     */   }
/*     */ 
/*     */   public String getIV31PURPR()
/*     */   {
/* 191 */     return this.fieldIV31PURPR.getString();
/*     */   }
/*     */ 
/*     */   public String getIV31QTY()
/*     */   {
/* 198 */     return this.fieldIV31QTY.getString();
/*     */   }
/*     */ 
/*     */   public String getIV31TYPE()
/*     */   {
/* 205 */     return this.fieldIV31TYPE.getString();
/*     */   }
/*     */ 
/*     */   public String getIV31USER()
/*     */   {
/* 212 */     return this.fieldIV31USER.getString();
/*     */   }
/*     */ 
/*     */   public void setIV31AVPUP(String newvalue)
/*     */   {
/* 219 */     this.fieldIV31AVPUP.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIV31AVPUP(BigDecimal newvalue)
/*     */   {
/* 226 */     this.fieldIV31AVPUP.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIV31FVALUE(String newvalue)
/*     */   {
/* 233 */     this.fieldIV31FVALUE.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIV31FVALUE(BigDecimal newvalue)
/*     */   {
/* 240 */     this.fieldIV31FVALUE.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIV31ISIN(String newvalue)
/*     */   {
/* 247 */     this.fieldIV31ISIN.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIV31IVSCUN(String newvalue)
/*     */   {
/* 254 */     this.fieldIV31IVSCUN.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIV31IVSCUN(BigDecimal newvalue)
/*     */   {
/* 261 */     this.fieldIV31IVSCUN.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIV31MKPRI(String newvalue)
/*     */   {
/* 268 */     this.fieldIV31MKPRI.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIV31MKPRI(BigDecimal newvalue)
/*     */   {
/* 275 */     this.fieldIV31MKPRI.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIV31PANDL(String newvalue)
/*     */   {
/* 282 */     this.fieldIV31PANDL.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIV31PANDL(BigDecimal newvalue)
/*     */   {
/* 289 */     this.fieldIV31PANDL.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIV31PURPR(String newvalue)
/*     */   {
/* 296 */     this.fieldIV31PURPR.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIV31PURPR(BigDecimal newvalue)
/*     */   {
/* 303 */     this.fieldIV31PURPR.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIV31QTY(String newvalue)
/*     */   {
/* 310 */     this.fieldIV31QTY.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIV31QTY(BigDecimal newvalue)
/*     */   {
/* 317 */     this.fieldIV31QTY.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIV31TYPE(String newvalue)
/*     */   {
/* 324 */     this.fieldIV31TYPE.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIV31USER(String newvalue)
/*     */   {
/* 331 */     this.fieldIV31USER.setString(newvalue);
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.IIV031101Message
 * JD-Core Version:    0.6.0
 */