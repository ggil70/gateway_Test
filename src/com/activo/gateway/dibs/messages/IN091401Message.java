/*     */ package com.activo.gateway.dibs.messages;
/*     */ 
/*     */ import java.math.BigDecimal;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*     */ 
/*     */ public class IN091401Message extends MessageRecord
/*     */ {
/*  19 */   final int FIELDCOUNT = 8;
/*  20 */   private CharacterField fieldIN914USR = null;
/*  21 */   private DecimalField fieldIN914ACC = null;
/*  22 */   private DecimalField fieldIN914CKN = null;
/*  23 */   private DecimalField fieldIN914AMT = null;
/*  24 */   private CharacterField fieldIN914TLP = null;
/*  25 */   private CharacterField fieldIN914CONT = null;
/*  26 */   private DecimalField fieldIN914CLAVE = null;
/*  27 */   private CharacterField fieldIN914RETC = null;
/*     */ 
/*     */   public IN091401Message()
/*     */   {
/*  34 */     createFields();
/*  35 */     initialize();
/*     */   }
/*     */ 
/*     */   protected void createFields()
/*     */   {
/*  43 */     this.recordsize = 113;
/*  44 */     this.fileid = "1000802211852";
/*  45 */     this.recordid = "5285A0FDF1A3E";
/*  46 */     this.message = new byte[getByteLength()];
/*  47 */     this.formatname = "IN091401";
/*  48 */     this.fieldnames = new String[8];
/*  49 */     this.tagnames = new String[8];
/*  50 */     this.fields = new MessageField[8];
/*     */ 
/*  52 */     this.fieldnames[0] = "IN914USR";
/*  53 */     this.tagnames[0] = "IN914USR";
/*     */      this.fields[0]=this.fieldIN914USR=new CharacterField(this.message, 10, 10, "IN914USR");
/*     */ 
/*  56 */     this.fieldnames[1] = "IN914ACC";
/*  57 */     this.tagnames[1] = "IN914ACC";
/*     */      this.fields[1]=this.fieldIN914ACC=new DecimalField(this.message, 20, 13, 0, "IN914ACC");
/*     */ 
/*  60 */     this.fieldnames[2] = "IN914CKN";
/*  61 */     this.tagnames[2] = "IN914CKN";
/*     */      this.fields[2]=this.fieldIN914CKN=new DecimalField(this.message, 33, 10, 0, "IN914CKN");
/*     */ 
/*  64 */     this.fieldnames[3] = "IN914AMT";
/*  65 */     this.tagnames[3] = "IN914AMT";
/*     */      this.fields[3]=this.fieldIN914AMT=new DecimalField(this.message, 43, 17, 2, "IN914AMT");
/*     */ 
/*  68 */     this.fieldnames[4] = "IN914TLP";
/*  69 */     this.tagnames[4] = "IN914TLP";
/*     */      this.fields[4]=this.fieldIN914TLP=new CharacterField(this.message, 60, 11, "IN914TLP");
/*     */ 
/*  72 */     this.fieldnames[5] = "IN914CONT";
/*  73 */     this.tagnames[5] = "IN914CONT";
/*     */      this.fields[5]=this.fieldIN914CONT=new CharacterField(this.message, 71, 35, "IN914CONT");
/*     */ 
/*  76 */     this.fieldnames[6] = "IN914CLAVE";
/*  77 */     this.tagnames[6] = "IN914CLAVE";
/*     */      this.fields[6]=this.fieldIN914CLAVE=new DecimalField(this.message, 106, 13, 0, "IN914CLAVE");
/*     */ 
/*  80 */     this.fieldnames[7] = "IN914RETC";
/*  81 */     this.tagnames[7] = "IN914RETC";
/*     */      this.fields[7]=this.fieldIN914RETC=new CharacterField(this.message, 119, 4, "IN914RETC");
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalIN914ACC()
/*     */   {
/*  90 */     return this.fieldIN914ACC.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalIN914AMT()
/*     */   {
/*  97 */     return this.fieldIN914AMT.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalIN914CKN()
/*     */   {
/* 104 */     return this.fieldIN914CKN.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalIN914CLAVE()
/*     */   {
/* 111 */     return this.fieldIN914CLAVE.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public String getIN914ACC()
/*     */   {
/* 118 */     return this.fieldIN914ACC.getString();
/*     */   }
/*     */ 
/*     */   public String getIN914AMT()
/*     */   {
/* 125 */     return this.fieldIN914AMT.getString();
/*     */   }
/*     */ 
/*     */   public String getIN914CKN()
/*     */   {
/* 132 */     return this.fieldIN914CKN.getString();
/*     */   }
/*     */ 
/*     */   public String getIN914CLAVE()
/*     */   {
/* 139 */     return this.fieldIN914CLAVE.getString();
/*     */   }
/*     */ 
/*     */   public String getIN914CONT()
/*     */   {
/* 146 */     return this.fieldIN914CONT.getString();
/*     */   }
/*     */ 
/*     */   public String getIN914RETC()
/*     */   {
/* 153 */     return this.fieldIN914RETC.getString();
/*     */   }
/*     */ 
/*     */   public String getIN914TLP()
/*     */   {
/* 160 */     return this.fieldIN914TLP.getString();
/*     */   }
/*     */ 
/*     */   public String getIN914USR()
/*     */   {
/* 167 */     return this.fieldIN914USR.getString();
/*     */   }
/*     */ 
/*     */   public void setIN914ACC(String newvalue)
/*     */   {
/* 174 */     this.fieldIN914ACC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN914ACC(BigDecimal newvalue)
/*     */   {
/* 181 */     this.fieldIN914ACC.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN914AMT(String newvalue)
/*     */   {
/* 188 */     this.fieldIN914AMT.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN914AMT(BigDecimal newvalue)
/*     */   {
/* 195 */     this.fieldIN914AMT.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN914CKN(String newvalue)
/*     */   {
/* 202 */     this.fieldIN914CKN.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN914CKN(BigDecimal newvalue)
/*     */   {
/* 209 */     this.fieldIN914CKN.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN914CLAVE(String newvalue)
/*     */   {
/* 216 */     this.fieldIN914CLAVE.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN914CLAVE(BigDecimal newvalue)
/*     */   {
/* 223 */     this.fieldIN914CLAVE.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN914CONT(String newvalue)
/*     */   {
/* 230 */     this.fieldIN914CONT.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN914RETC(String newvalue)
/*     */   {
/* 237 */     this.fieldIN914RETC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN914TLP(String newvalue)
/*     */   {
/* 244 */     this.fieldIN914TLP.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN914USR(String newvalue)
/*     */   {
/* 251 */     this.fieldIN914USR.setString(newvalue);
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.IN091401Message
 * JD-Core Version:    0.6.0
 */