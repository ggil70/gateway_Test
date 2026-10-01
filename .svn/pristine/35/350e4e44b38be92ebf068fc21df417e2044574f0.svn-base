/*     */ package com.activo.gateway.dibs.messages;
/*     */ 
/*     */ import java.math.BigDecimal;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*     */ 
/*     */ public class IIN091201Message extends MessageRecord
/*     */ {
/*  19 */   final int FIELDCOUNT = 5;
/*  20 */   private CharacterField fieldIN912USR = null;
/*  21 */   private DecimalField fieldIN912CUN = null;
/*  22 */   private DecimalField fieldIN912BDAY = null;
/*  23 */   private CharacterField fieldIN912INDN = null;
/*  24 */   private CharacterField fieldIN912PWD = null;
/*     */ 
/*     */   public IIN091201Message()
/*     */   {
/*  31 */     createFields();
/*  32 */     initialize();
/*     */   }
/*     */ 
/*     */   protected void createFields()
/*     */   {
/*  41 */     this.recordsize = 54;
/*  42 */     this.fileid = "1011024175955";
/*  43 */     this.recordid = "4C911DA05456D";
/*  44 */     this.message = new byte[getByteLength()];
/*  45 */     this.formatname = "IIN091201";
/*  46 */     this.fieldnames = new String[5];
/*  47 */     this.tagnames = new String[5];
/*  48 */     this.fields = new MessageField[5];
/*     */ 
/*  50 */     this.fieldnames[0] = "IN912USR";
/*  51 */     this.tagnames[0] = "IN912USR";
/*     */      this.fields[0]=this.fieldIN912USR=new CharacterField(this.message, 10, 10, "IN912USR");
/*     */ 
/*  54 */     this.fieldnames[1] = "IN912CUN";
/*  55 */     this.tagnames[1] = "IN912CUN";
/*     */      this.fields[1]=this.fieldIN912CUN=new DecimalField(this.message, 20, 10, 0, "IN912CUN");
/*     */ 
/*  58 */     this.fieldnames[2] = "IN912BDAY";
/*  59 */     this.tagnames[2] = "IN912BDAY";
/*     */      this.fields[2]=this.fieldIN912BDAY=new DecimalField(this.message, 30, 9, 0, "IN912BDAY");
/*     */ 
/*  62 */     this.fieldnames[3] = "IN912INDN";
/*  63 */     this.tagnames[3] = "IN912INDN";
/*     */      this.fields[3]=this.fieldIN912INDN=new CharacterField(this.message, 39, 15, "IN912INDN");
/*     */ 
/*  66 */     this.fieldnames[4] = "IN912PWD";
/*  67 */     this.tagnames[4] = "IN912PWD";
/*     */      this.fields[4]=this.fieldIN912PWD=new CharacterField(this.message, 54, 10, "IN912PWD");
/*     */   }
/*     */ 
/*     */   public void setIN912USR(String newvalue)
/*     */   {
/*  77 */     this.fieldIN912USR.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getIN912USR()
/*     */   {
/*  85 */     return this.fieldIN912USR.getString();
/*     */   }
/*     */ 
/*     */   public void setIN912CUN(String newvalue)
/*     */   {
/*  93 */     this.fieldIN912CUN.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getIN912CUN()
/*     */   {
/* 101 */     return this.fieldIN912CUN.getString();
/*     */   }
/*     */ 
/*     */   public void setIN912CUN(BigDecimal newvalue)
/*     */   {
/* 109 */     this.fieldIN912CUN.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalIN912CUN()
/*     */   {
/* 117 */     return this.fieldIN912CUN.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setIN912BDAY(String newvalue)
/*     */   {
/* 125 */     this.fieldIN912BDAY.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getIN912BDAY()
/*     */   {
/* 133 */     return this.fieldIN912BDAY.getString();
/*     */   }
/*     */ 
/*     */   public void setIN912BDAY(BigDecimal newvalue)
/*     */   {
/* 141 */     this.fieldIN912BDAY.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalIN912BDAY()
/*     */   {
/* 149 */     return this.fieldIN912BDAY.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setIN912INDN(String newvalue)
/*     */   {
/* 157 */     this.fieldIN912INDN.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getIN912INDN()
/*     */   {
/* 165 */     return this.fieldIN912INDN.getString();
/*     */   }
/*     */ 
/*     */   public void setIN912PWD(String newvalue)
/*     */   {
/* 173 */     this.fieldIN912PWD.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getIN912PWD()
/*     */   {
/* 181 */     return this.fieldIN912PWD.getString();
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.IIN091201Message
 * JD-Core Version:    0.6.0
 */