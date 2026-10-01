/*     */ package com.activo.gateway.dibs.messages;
/*     */ 
/*     */ import java.math.BigDecimal;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*     */ 
/*     */ public class CKCNFDSJVMessage extends MessageRecord
/*     */ {
/*  19 */   final int FIELDCOUNT = 7;
/*  20 */   private CharacterField fieldCKCUSR = null;
/*  21 */   private DecimalField fieldCKCACC = null;
/*  22 */   private DecimalField fieldCKCNUM = null;
/*  23 */   private DecimalField fieldCKCDT1 = null;
/*  24 */   private DecimalField fieldCKCDT2 = null;
/*  25 */   private DecimalField fieldCKCDT3 = null;
/*  26 */   private CharacterField fieldCKCSTA = null;
/*     */ 
/*     */   public CKCNFDSJVMessage()
/*     */   {
/*  33 */     createFields();
/*  34 */     initialize();
/*     */   }
/*     */ 
/*     */   protected void createFields()
/*     */   {
/*  42 */     this.recordsize = 43;
/*  43 */     this.fileid = "1001011151454";
/*  44 */     this.recordid = "4C7FCEFB54FAC";
/*  45 */     this.message = new byte[getByteLength()];
/*  46 */     this.formatname = "CKCNFDSJV";
/*  47 */     this.fieldnames = new String[7];
/*  48 */     this.tagnames = new String[7];
/*  49 */     this.fields = new MessageField[7];
/*     */ 
/*  51 */     this.fieldnames[0] = "CKCUSR";
/*  52 */     this.tagnames[0] = "CKCUSR";
/*     */      this.fields[0]=this.fieldCKCUSR=new CharacterField(this.message, 10, 10, "CKCUSR");
/*     */ 
/*  55 */     this.fieldnames[1] = "CKCACC";
/*  56 */     this.tagnames[1] = "CKCACC";
/*     */      this.fields[1]=this.fieldCKCACC=new DecimalField(this.message, 20, 13, 0, "CKCACC");
/*     */ 
/*  59 */     this.fieldnames[2] = "CKCNUM";
/*  60 */     this.tagnames[2] = "CKCNUM";
/*     */      this.fields[2]=this.fieldCKCNUM=new DecimalField(this.message, 33, 10, 0, "CKCNUM");
/*     */ 
/*  63 */     this.fieldnames[3] = "CKCDT1";
/*  64 */     this.tagnames[3] = "CKCDT1";
/*     */      this.fields[3]=this.fieldCKCDT1=new DecimalField(this.message, 43, 3, 0, "CKCDT1");
/*     */ 
/*  67 */     this.fieldnames[4] = "CKCDT2";
/*  68 */     this.tagnames[4] = "CKCDT2";
/*     */      this.fields[4]=this.fieldCKCDT2=new DecimalField(this.message, 46, 3, 0, "CKCDT2");
/*     */ 
/*  71 */     this.fieldnames[5] = "CKCDT3";
/*  72 */     this.tagnames[5] = "CKCDT3";
/*     */      this.fields[5]=this.fieldCKCDT3=new DecimalField(this.message, 49, 3, 0, "CKCDT3");
/*     */ 
/*  75 */     this.fieldnames[6] = "CKCSTA";
/*  76 */     this.tagnames[6] = "CKCSTA";
/*     */      this.fields[6]=this.fieldCKCSTA=new CharacterField(this.message, 52, 1, "CKCSTA");
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalCKCACC()
/*     */   {
/*  85 */     return this.fieldCKCACC.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalCKCDT1()
/*     */   {
/*  92 */     return this.fieldCKCDT1.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalCKCDT2()
/*     */   {
/*  99 */     return this.fieldCKCDT2.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalCKCDT3()
/*     */   {
/* 106 */     return this.fieldCKCDT3.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalCKCNUM()
/*     */   {
/* 113 */     return this.fieldCKCNUM.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public String getCKCACC()
/*     */   {
/* 120 */     return this.fieldCKCACC.getString();
/*     */   }
/*     */ 
/*     */   public String getCKCDT1()
/*     */   {
/* 127 */     return this.fieldCKCDT1.getString();
/*     */   }
/*     */ 
/*     */   public String getCKCDT2()
/*     */   {
/* 134 */     return this.fieldCKCDT2.getString();
/*     */   }
/*     */ 
/*     */   public String getCKCDT3()
/*     */   {
/* 141 */     return this.fieldCKCDT3.getString();
/*     */   }
/*     */ 
/*     */   public String getCKCNUM()
/*     */   {
/* 148 */     return this.fieldCKCNUM.getString();
/*     */   }
/*     */ 
/*     */   public String getCKCSTA()
/*     */   {
/* 155 */     return this.fieldCKCSTA.getString();
/*     */   }
/*     */ 
/*     */   public String getCKCUSR()
/*     */   {
/* 162 */     return this.fieldCKCUSR.getString();
/*     */   }
/*     */ 
/*     */   public void setCKCACC(String newvalue)
/*     */   {
/* 169 */     this.fieldCKCACC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setCKCACC(BigDecimal newvalue)
/*     */   {
/* 176 */     this.fieldCKCACC.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setCKCDT1(String newvalue)
/*     */   {
/* 183 */     this.fieldCKCDT1.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setCKCDT1(BigDecimal newvalue)
/*     */   {
/* 190 */     this.fieldCKCDT1.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setCKCDT2(String newvalue)
/*     */   {
/* 197 */     this.fieldCKCDT2.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setCKCDT2(BigDecimal newvalue)
/*     */   {
/* 204 */     this.fieldCKCDT2.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setCKCDT3(String newvalue)
/*     */   {
/* 211 */     this.fieldCKCDT3.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setCKCDT3(BigDecimal newvalue)
/*     */   {
/* 218 */     this.fieldCKCDT3.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setCKCNUM(String newvalue)
/*     */   {
/* 225 */     this.fieldCKCNUM.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setCKCNUM(BigDecimal newvalue)
/*     */   {
/* 232 */     this.fieldCKCNUM.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setCKCSTA(String newvalue)
/*     */   {
/* 239 */     this.fieldCKCSTA.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setCKCUSR(String newvalue)
/*     */   {
/* 246 */     this.fieldCKCUSR.setString(newvalue);
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.CKCNFDSJVMessage
 * JD-Core Version:    0.6.0
 */