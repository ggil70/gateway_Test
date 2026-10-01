/*     */ package com.activo.gateway.dibs.messages;
/*     */ 
/*     */ import java.math.BigDecimal;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*     */ 
/*     */ public class IN098301Message extends MessageRecord
/*     */ {
/*  19 */   final int FIELDCOUNT = 5;
/*  20 */   private CharacterField fieldIN983USR = null;
/*  21 */   private CharacterField fieldIN983NUM = null;
/*  22 */   private DecimalField fieldIN983SAL = null;
/*  23 */   private DecimalField fieldIN963CASBK = null;
/*  24 */   private CharacterField fieldIN981ENDFL = null;
/*     */ 
/*     */   public IN098301Message()
/*     */   {
/*  31 */     createFields();
/*  32 */     initialize();
/*     */   }
/*     */ 
/*     */   protected void createFields()
/*     */   {
/*  41 */     this.recordsize = 58;
/*  42 */     this.fileid = "1010514151703";
/*  43 */     this.recordid = "5606F6616DD7C";
/*  44 */     this.message = new byte[getByteLength()];
/*  45 */     this.formatname = "IN098301";
/*  46 */     this.fieldnames = new String[5];
/*  47 */     this.tagnames = new String[5];
/*  48 */     this.fields = new MessageField[5];
/*     */ 
/*  50 */     this.fieldnames[0] = "IN983USR";
/*  51 */     this.tagnames[0] = "IN983USR";
/*     */      this.fields[0]=this.fieldIN983USR=new CharacterField(this.message, 10, 10, "IN983USR");
/*     */ 
/*  54 */     this.fieldnames[1] = "IN983NUM";
/*  55 */     this.tagnames[1] = "IN983NUM";
/*     */      this.fields[1]=this.fieldIN983NUM=new CharacterField(this.message, 20, 19, "IN983NUM");
/*     */ 
/*  58 */     this.fieldnames[2] = "IN983SAL";
/*  59 */     this.tagnames[2] = "IN983SAL";
/*     */      this.fields[2]=this.fieldIN983SAL=new DecimalField(this.message, 39, 14, 2, "IN983SAL");
/*     */ 
/*  62 */     this.fieldnames[3] = "IN963CASBK";
/*  63 */     this.tagnames[3] = "IN963CASBK";
/*     */      this.fields[3]=this.fieldIN963CASBK=new DecimalField(this.message, 53, 14, 2, "IN963CASBK");
/*     */ 
/*  66 */     this.fieldnames[4] = "IN981ENDFL";
/*  67 */     this.tagnames[4] = "IN981ENDFL";
/*     */      this.fields[4]=this.fieldIN981ENDFL=new CharacterField(this.message, 67, 1, "IN981ENDFL");
/*     */   }
/*     */ 
/*     */   public void setIN983USR(String newvalue)
/*     */   {
/*  77 */     this.fieldIN983USR.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getIN983USR()
/*     */   {
/*  85 */     return this.fieldIN983USR.getString();
/*     */   }
/*     */ 
/*     */   public void setIN983NUM(String newvalue)
/*     */   {
/*  93 */     this.fieldIN983NUM.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getIN983NUM()
/*     */   {
/* 101 */     return this.fieldIN983NUM.getString();
/*     */   }
/*     */ 
/*     */   public void setIN983SAL(String newvalue)
/*     */   {
/* 109 */     this.fieldIN983SAL.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getIN983SAL()
/*     */   {
/* 117 */     return this.fieldIN983SAL.getString();
/*     */   }
/*     */ 
/*     */   public void setIN983SAL(BigDecimal newvalue)
/*     */   {
/* 125 */     this.fieldIN983SAL.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalIN983SAL()
/*     */   {
/* 133 */     return this.fieldIN983SAL.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setIN963CASBK(String newvalue)
/*     */   {
/* 141 */     this.fieldIN963CASBK.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getIN963CASBK()
/*     */   {
/* 149 */     return this.fieldIN963CASBK.getString();
/*     */   }
/*     */ 
/*     */   public void setIN963CASBK(BigDecimal newvalue)
/*     */   {
/* 157 */     this.fieldIN963CASBK.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalIN963CASBK()
/*     */   {
/* 165 */     return this.fieldIN963CASBK.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setIN981ENDFL(String newvalue)
/*     */   {
/* 173 */     this.fieldIN981ENDFL.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getIN981ENDFL()
/*     */   {
/* 181 */     return this.fieldIN981ENDFL.getString();
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.IN098301Message
 * JD-Core Version:    0.6.0
 */