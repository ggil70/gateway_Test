/*     */ package com.activo.gateway.dibs.messages;
/*     */ 
/*     */ import java.math.BigDecimal;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*     */ 
/*     */ public class IDL030001Message extends MessageRecord
/*     */ {
/*  19 */   final int FIELDCOUNT = 21;
/*  20 */   private CharacterField fieldDL31USER = null;
/*  21 */   private DecimalField fieldDL31DEAACC = null;
/*  22 */   private CharacterField fieldDL31DEAPRO = null;
/*  23 */   private CharacterField fieldDL31DEATYP = null;
/*  24 */   private CharacterField fieldDL31DEACCY = null;
/*  25 */   private DecimalField fieldDL31DEAMEP = null;
/*  26 */   private DecimalField fieldDL31DEAMEI = null;
/*  27 */   private DecimalField fieldDL31DEAMEM = null;
/*  28 */   private DecimalField fieldDL31DEADED = null;
/*  29 */   private DecimalField fieldDL31TRAVD1 = null;
/*  30 */   private DecimalField fieldDL31TRAVD2 = null;
/*  31 */   private DecimalField fieldDL31TRAVD3 = null;
/*  32 */   private DecimalField fieldDL31TRABD1 = null;
/*  33 */   private DecimalField fieldDL31TRABD2 = null;
/*  34 */   private DecimalField fieldDL31TRABD3 = null;
/*  35 */   private DecimalField fieldDL31TRAAMT = null;
/*  36 */   private CharacterField fieldDL31TRADCC = null;
/*  37 */   private CharacterField fieldDL31TRANAR = null;
/*  38 */   private CharacterField fieldDL31TRACDE = null;
/*  39 */   private DecimalField fieldDL31BALANC = null;
/*  40 */   private CharacterField fieldDL31TRAAPC = null;
/*     */ 
/*     */   public IDL030001Message()
/*     */   {
/*  47 */     createFields();
/*  48 */     initialize();
/*     */   }
/*     */ 
/*     */   protected void createFields()
/*     */   {
/*  56 */     this.recordsize = 188;
/*  57 */     this.fileid = "1000803111847";
/*  58 */     this.recordid = "3E42E715DE9EC";
/*  59 */     this.message = new byte[getByteLength()];
/*  60 */     this.formatname = "IDL030001";
/*  61 */     this.fieldnames = new String[21];
/*  62 */     this.tagnames = new String[21];
/*  63 */     this.fields = new MessageField[21];
/*     */ 
/*  65 */     this.fieldnames[0] = "DL31USER";
/*  66 */     this.tagnames[0] = "DL31USER";
/*     */      this.fields[0]=this.fieldDL31USER=new CharacterField(this.message, 10, 10, "DL31USER");
/*     */ 
/*  69 */     this.fieldnames[1] = "DL31DEAACC";
/*  70 */     this.tagnames[1] = "DL31DEAACC";
/*     */      this.fields[1]=this.fieldDL31DEAACC=new DecimalField(this.message, 20, 13, 0, "DL31DEAACC");
/*     */ 
/*  73 */     this.fieldnames[2] = "DL31DEAPRO";
/*  74 */     this.tagnames[2] = "DL31DEAPRO";
/*     */      this.fields[2]=this.fieldDL31DEAPRO=new CharacterField(this.message, 33, 4, "DL31DEAPRO");
/*     */ 
/*  77 */     this.fieldnames[3] = "DL31DEATYP";
/*  78 */     this.tagnames[3] = "DL31DEATYP";
/*     */      this.fields[3]=this.fieldDL31DEATYP=new CharacterField(this.message, 37, 4, "DL31DEATYP");
/*     */ 
/*  81 */     this.fieldnames[4] = "DL31DEACCY";
/*  82 */     this.tagnames[4] = "DL31DEACCY";
/*     */      this.fields[4]=this.fieldDL31DEACCY=new CharacterField(this.message, 41, 3, "DL31DEACCY");
/*     */ 
/*  85 */     this.fieldnames[5] = "DL31DEAMEP";
/*  86 */     this.tagnames[5] = "DL31DEAMEP";
/*     */      this.fields[5]=this.fieldDL31DEAMEP=new DecimalField(this.message, 44, 17, 2, "DL31DEAMEP");
/*     */ 
/*  89 */     this.fieldnames[6] = "DL31DEAMEI";
/*  90 */     this.tagnames[6] = "DL31DEAMEI";
/*     */      this.fields[6]=this.fieldDL31DEAMEI=new DecimalField(this.message, 61, 17, 2, "DL31DEAMEI");
/*     */ 
/*  93 */     this.fieldnames[7] = "DL31DEAMEM";
/*  94 */     this.tagnames[7] = "DL31DEAMEM";
/*     */      this.fields[7]=this.fieldDL31DEAMEM=new DecimalField(this.message, 78, 17, 2, "DL31DEAMEM");
/*     */ 
/*  97 */     this.fieldnames[8] = "DL31DEADED";
/*  98 */     this.tagnames[8] = "DL31DEADED";
/*     */      this.fields[8]=this.fieldDL31DEADED=new DecimalField(this.message, 95, 17, 2, "DL31DEADED");
/*     */ 
/* 101 */     this.fieldnames[9] = "DL31TRAVD1";
/* 102 */     this.tagnames[9] = "DL31TRAVD1";
/*     */      this.fields[9]=this.fieldDL31TRAVD1=new DecimalField(this.message, 112, 3, 0, "DL31TRAVD1");
/*     */ 
/* 105 */     this.fieldnames[10] = "DL31TRAVD2";
/* 106 */     this.tagnames[10] = "DL31TRAVD2";
/*     */      this.fields[10]=this.fieldDL31TRAVD2=new DecimalField(this.message, 115, 3, 0, "DL31TRAVD2");
/*     */ 
/* 109 */     this.fieldnames[11] = "DL31TRAVD3";
/* 110 */     this.tagnames[11] = "DL31TRAVD3";
/*     */      this.fields[11]=this.fieldDL31TRAVD3=new DecimalField(this.message, 118, 3, 0, "DL31TRAVD3");
/*     */ 
/* 113 */     this.fieldnames[12] = "DL31TRABD1";
/* 114 */     this.tagnames[12] = "DL31TRABD1";
/*     */      this.fields[12]=this.fieldDL31TRABD1=new DecimalField(this.message, 121, 3, 0, "DL31TRABD1");
/*     */ 
/* 117 */     this.fieldnames[13] = "DL31TRABD2";
/* 118 */     this.tagnames[13] = "DL31TRABD2";
/*     */      this.fields[13]=this.fieldDL31TRABD2=new DecimalField(this.message, 124, 3, 0, "DL31TRABD2");
/*     */ 
/* 121 */     this.fieldnames[14] = "DL31TRABD3";
/* 122 */     this.tagnames[14] = "DL31TRABD3";
/*     */      this.fields[14]=this.fieldDL31TRABD3=new DecimalField(this.message, 127, 3, 0, "DL31TRABD3");
/*     */ 
/* 125 */     this.fieldnames[15] = "DL31TRAAMT";
/* 126 */     this.tagnames[15] = "DL31TRAAMT";
/*     */      this.fields[15]=this.fieldDL31TRAAMT=new DecimalField(this.message, 130, 17, 2, "DL31TRAAMT");
/*     */ 
/* 129 */     this.fieldnames[16] = "DL31TRADCC";
/* 130 */     this.tagnames[16] = "DL31TRADCC";
/*     */      this.fields[16]=this.fieldDL31TRADCC=new CharacterField(this.message, 147, 1, "DL31TRADCC");
/*     */ 
/* 133 */     this.fieldnames[17] = "DL31TRANAR";
/* 134 */     this.tagnames[17] = "DL31TRANAR";
/*     */      this.fields[17]=this.fieldDL31TRANAR=new CharacterField(this.message, 148, 30, "DL31TRANAR");
/*     */ 
/* 137 */     this.fieldnames[18] = "DL31TRACDE";
/* 138 */     this.tagnames[18] = "DL31TRACDE";
/*     */      this.fields[18]=this.fieldDL31TRACDE=new CharacterField(this.message, 178, 2, "DL31TRACDE");
/*     */ 
/* 141 */     this.fieldnames[19] = "DL31BALANC";
/* 142 */     this.tagnames[19] = "DL31BALANC";
/*     */      this.fields[19]=this.fieldDL31BALANC=new DecimalField(this.message, 180, 17, 2, "DL31BALANC");
/*     */ 
/* 145 */     this.fieldnames[20] = "DL31TRAAPC";
/* 146 */     this.tagnames[20] = "DL31TRAAPC";
/*     */      this.fields[20]=this.fieldDL31TRAAPC=new CharacterField(this.message, 197, 1, "DL31TRAAPC");
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalDL31BALANC()
/*     */   {
/* 155 */     return this.fieldDL31BALANC.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalDL31DEAACC()
/*     */   {
/* 162 */     return this.fieldDL31DEAACC.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalDL31DEADED()
/*     */   {
/* 169 */     return this.fieldDL31DEADED.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalDL31DEAMEI()
/*     */   {
/* 176 */     return this.fieldDL31DEAMEI.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalDL31DEAMEM()
/*     */   {
/* 183 */     return this.fieldDL31DEAMEM.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalDL31DEAMEP()
/*     */   {
/* 190 */     return this.fieldDL31DEAMEP.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalDL31TRAAMT()
/*     */   {
/* 197 */     return this.fieldDL31TRAAMT.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalDL31TRABD1()
/*     */   {
/* 204 */     return this.fieldDL31TRABD1.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalDL31TRABD2()
/*     */   {
/* 211 */     return this.fieldDL31TRABD2.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalDL31TRABD3()
/*     */   {
/* 218 */     return this.fieldDL31TRABD3.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalDL31TRAVD1()
/*     */   {
/* 225 */     return this.fieldDL31TRAVD1.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalDL31TRAVD2()
/*     */   {
/* 232 */     return this.fieldDL31TRAVD2.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalDL31TRAVD3()
/*     */   {
/* 239 */     return this.fieldDL31TRAVD3.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public String getDL31BALANC()
/*     */   {
/* 246 */     return this.fieldDL31BALANC.getString();
/*     */   }
/*     */ 
/*     */   public String getDL31DEAACC()
/*     */   {
/* 253 */     return this.fieldDL31DEAACC.getString();
/*     */   }
/*     */ 
/*     */   public String getDL31DEACCY()
/*     */   {
/* 260 */     return this.fieldDL31DEACCY.getString();
/*     */   }
/*     */ 
/*     */   public String getDL31DEADED()
/*     */   {
/* 267 */     return this.fieldDL31DEADED.getString();
/*     */   }
/*     */ 
/*     */   public String getDL31DEAMEI()
/*     */   {
/* 274 */     return this.fieldDL31DEAMEI.getString();
/*     */   }
/*     */ 
/*     */   public String getDL31DEAMEM()
/*     */   {
/* 281 */     return this.fieldDL31DEAMEM.getString();
/*     */   }
/*     */ 
/*     */   public String getDL31DEAMEP()
/*     */   {
/* 288 */     return this.fieldDL31DEAMEP.getString();
/*     */   }
/*     */ 
/*     */   public String getDL31DEAPRO()
/*     */   {
/* 295 */     return this.fieldDL31DEAPRO.getString();
/*     */   }
/*     */ 
/*     */   public String getDL31DEATYP()
/*     */   {
/* 302 */     return this.fieldDL31DEATYP.getString();
/*     */   }
/*     */ 
/*     */   public String getDL31TRAAMT()
/*     */   {
/* 309 */     return this.fieldDL31TRAAMT.getString();
/*     */   }
/*     */ 
/*     */   public String getDL31TRAAPC()
/*     */   {
/* 316 */     return this.fieldDL31TRAAPC.getString();
/*     */   }
/*     */ 
/*     */   public String getDL31TRABD1()
/*     */   {
/* 323 */     return this.fieldDL31TRABD1.getString();
/*     */   }
/*     */ 
/*     */   public String getDL31TRABD2()
/*     */   {
/* 330 */     return this.fieldDL31TRABD2.getString();
/*     */   }
/*     */ 
/*     */   public String getDL31TRABD3()
/*     */   {
/* 337 */     return this.fieldDL31TRABD3.getString();
/*     */   }
/*     */ 
/*     */   public String getDL31TRACDE()
/*     */   {
/* 344 */     return this.fieldDL31TRACDE.getString();
/*     */   }
/*     */ 
/*     */   public String getDL31TRADCC()
/*     */   {
/* 351 */     return this.fieldDL31TRADCC.getString();
/*     */   }
/*     */ 
/*     */   public String getDL31TRANAR()
/*     */   {
/* 358 */     return this.fieldDL31TRANAR.getString();
/*     */   }
/*     */ 
/*     */   public String getDL31TRAVD1()
/*     */   {
/* 365 */     return this.fieldDL31TRAVD1.getString();
/*     */   }
/*     */ 
/*     */   public String getDL31TRAVD2()
/*     */   {
/* 372 */     return this.fieldDL31TRAVD2.getString();
/*     */   }
/*     */ 
/*     */   public String getDL31TRAVD3()
/*     */   {
/* 379 */     return this.fieldDL31TRAVD3.getString();
/*     */   }
/*     */ 
/*     */   public String getDL31USER()
/*     */   {
/* 386 */     return this.fieldDL31USER.getString();
/*     */   }
/*     */ 
/*     */   public void setDL31BALANC(String newvalue)
/*     */   {
/* 393 */     this.fieldDL31BALANC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDL31BALANC(BigDecimal newvalue)
/*     */   {
/* 400 */     this.fieldDL31BALANC.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDL31DEAACC(String newvalue)
/*     */   {
/* 407 */     this.fieldDL31DEAACC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDL31DEAACC(BigDecimal newvalue)
/*     */   {
/* 414 */     this.fieldDL31DEAACC.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDL31DEACCY(String newvalue)
/*     */   {
/* 421 */     this.fieldDL31DEACCY.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDL31DEADED(String newvalue)
/*     */   {
/* 428 */     this.fieldDL31DEADED.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDL31DEADED(BigDecimal newvalue)
/*     */   {
/* 435 */     this.fieldDL31DEADED.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDL31DEAMEI(String newvalue)
/*     */   {
/* 442 */     this.fieldDL31DEAMEI.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDL31DEAMEI(BigDecimal newvalue)
/*     */   {
/* 449 */     this.fieldDL31DEAMEI.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDL31DEAMEM(String newvalue)
/*     */   {
/* 456 */     this.fieldDL31DEAMEM.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDL31DEAMEM(BigDecimal newvalue)
/*     */   {
/* 463 */     this.fieldDL31DEAMEM.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDL31DEAMEP(String newvalue)
/*     */   {
/* 470 */     this.fieldDL31DEAMEP.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDL31DEAMEP(BigDecimal newvalue)
/*     */   {
/* 477 */     this.fieldDL31DEAMEP.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDL31DEAPRO(String newvalue)
/*     */   {
/* 484 */     this.fieldDL31DEAPRO.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDL31DEATYP(String newvalue)
/*     */   {
/* 491 */     this.fieldDL31DEATYP.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDL31TRAAMT(String newvalue)
/*     */   {
/* 498 */     this.fieldDL31TRAAMT.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDL31TRAAMT(BigDecimal newvalue)
/*     */   {
/* 505 */     this.fieldDL31TRAAMT.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDL31TRAAPC(String newvalue)
/*     */   {
/* 512 */     this.fieldDL31TRAAPC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDL31TRABD1(String newvalue)
/*     */   {
/* 519 */     this.fieldDL31TRABD1.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDL31TRABD1(BigDecimal newvalue)
/*     */   {
/* 526 */     this.fieldDL31TRABD1.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDL31TRABD2(String newvalue)
/*     */   {
/* 533 */     this.fieldDL31TRABD2.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDL31TRABD2(BigDecimal newvalue)
/*     */   {
/* 540 */     this.fieldDL31TRABD2.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDL31TRABD3(String newvalue)
/*     */   {
/* 547 */     this.fieldDL31TRABD3.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDL31TRABD3(BigDecimal newvalue)
/*     */   {
/* 554 */     this.fieldDL31TRABD3.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDL31TRACDE(String newvalue)
/*     */   {
/* 561 */     this.fieldDL31TRACDE.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDL31TRADCC(String newvalue)
/*     */   {
/* 568 */     this.fieldDL31TRADCC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDL31TRANAR(String newvalue)
/*     */   {
/* 575 */     this.fieldDL31TRANAR.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDL31TRAVD1(String newvalue)
/*     */   {
/* 582 */     this.fieldDL31TRAVD1.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDL31TRAVD1(BigDecimal newvalue)
/*     */   {
/* 589 */     this.fieldDL31TRAVD1.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDL31TRAVD2(String newvalue)
/*     */   {
/* 596 */     this.fieldDL31TRAVD2.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDL31TRAVD2(BigDecimal newvalue)
/*     */   {
/* 603 */     this.fieldDL31TRAVD2.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDL31TRAVD3(String newvalue)
/*     */   {
/* 610 */     this.fieldDL31TRAVD3.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDL31TRAVD3(BigDecimal newvalue)
/*     */   {
/* 617 */     this.fieldDL31TRAVD3.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setDL31USER(String newvalue)
/*     */   {
/* 624 */     this.fieldDL31USER.setString(newvalue);
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.IDL030001Message
 * JD-Core Version:    0.6.0
 */