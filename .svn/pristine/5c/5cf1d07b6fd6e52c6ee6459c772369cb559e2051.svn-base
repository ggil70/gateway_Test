/*     */ package com.activo.gateway.dibs.messages;
/*     */ 
/*     */ import java.math.BigDecimal;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*     */ 
/*     */ public class SVENDSJVMessage extends MessageRecord
/*     */ {
/*  19 */   final int FIELDCOUNT = 14;
/*  20 */   private CharacterField fieldVENUSR = null;
/*  21 */   private DecimalField fieldVENNUM = null;
/*  22 */   private CharacterField fieldVENNMA = null;
/*  23 */   private CharacterField fieldVENAD1 = null;
/*  24 */   private CharacterField fieldVENAD2 = null;
/*  25 */   private CharacterField fieldVENAD3 = null;
/*  26 */   private CharacterField fieldVENAD4 = null;
/*  27 */   private CharacterField fieldVENSV1 = null;
/*  28 */   private CharacterField fieldVENSV2 = null;
/*  29 */   private CharacterField fieldVENSV3 = null;
/*  30 */   private CharacterField fieldVENSV4 = null;
/*  31 */   private CharacterField fieldVENSV5 = null;
/*  32 */   private CharacterField fieldVENSV6 = null;
/*  33 */   private CharacterField fieldVENFLG = null;
/*     */ 
/*     */   public SVENDSJVMessage()
/*     */   {
/*  40 */     createFields();
/*  41 */     initialize();
/*     */   }
/*     */ 
/*     */   protected void createFields()
/*     */   {
/*  49 */     this.recordsize = 316;
/*  50 */     this.fileid = "1000906173251";
/*  51 */     this.recordid = "6459EB19ED688";
/*  52 */     this.message = new byte[getByteLength()];
/*  53 */     this.formatname = "SVENDSJV";
/*  54 */     this.fieldnames = new String[14];
/*  55 */     this.tagnames = new String[14];
/*  56 */     this.fields = new MessageField[14];
/*     */ 
/*  58 */     this.fieldnames[0] = "VENUSR";
/*  59 */     this.tagnames[0] = "VENUSR";
/*     */      this.fields[0]=this.fieldVENUSR=new CharacterField(this.message, 10, 10, "VENUSR");
/*     */ 
/*  62 */     this.fieldnames[1] = "VENNUM";
/*  63 */     this.tagnames[1] = "VENNUM";
/*     */      this.fields[1]=this.fieldVENNUM=new DecimalField(this.message, 20, 10, 0, "VENNUM");
/*     */ 
/*  66 */     this.fieldnames[2] = "VENNMA";
/*  67 */     this.tagnames[2] = "VENNMA";
/*     */      this.fields[2]=this.fieldVENNMA=new CharacterField(this.message, 30, 35, "VENNMA");
/*     */ 
/*  70 */     this.fieldnames[3] = "VENAD1";
/*  71 */     this.tagnames[3] = "VENAD1";
/*     */      this.fields[3]=this.fieldVENAD1=new CharacterField(this.message, 65, 35, "VENAD1");
/*     */ 
/*  74 */     this.fieldnames[4] = "VENAD2";
/*  75 */     this.tagnames[4] = "VENAD2";
/*     */      this.fields[4]=this.fieldVENAD2=new CharacterField(this.message, 100, 35, "VENAD2");
/*     */ 
/*  78 */     this.fieldnames[5] = "VENAD3";
/*  79 */     this.tagnames[5] = "VENAD3";
/*     */      this.fields[5]=this.fieldVENAD3=new CharacterField(this.message, 135, 35, "VENAD3");
/*     */ 
/*  82 */     this.fieldnames[6] = "VENAD4";
/*  83 */     this.tagnames[6] = "VENAD4";
/*     */      this.fields[6]=this.fieldVENAD4=new CharacterField(this.message, 170, 35, "VENAD4");
/*     */ 
/*  86 */     this.fieldnames[7] = "VENSV1";
/*  87 */     this.tagnames[7] = "VENSV1";
/*     */      this.fields[7]=this.fieldVENSV1=new CharacterField(this.message, 205, 20, "VENSV1");
/*     */ 
/*  90 */     this.fieldnames[8] = "VENSV2";
/*  91 */     this.tagnames[8] = "VENSV2";
/*     */      this.fields[8]=this.fieldVENSV2=new CharacterField(this.message, 225, 20, "VENSV2");
/*     */ 
/*  94 */     this.fieldnames[9] = "VENSV3";
/*  95 */     this.tagnames[9] = "VENSV3";
/*     */      this.fields[9]=this.fieldVENSV3=new CharacterField(this.message, 245, 20, "VENSV3");
/*     */ 
/*  98 */     this.fieldnames[10] = "VENSV4";
/*  99 */     this.tagnames[10] = "VENSV4";
/*     */      this.fields[10]=this.fieldVENSV4=new CharacterField(this.message, 265, 20, "VENSV4");
/*     */ 
/* 102 */     this.fieldnames[11] = "VENSV5";
/* 103 */     this.tagnames[11] = "VENSV5";
/*     */      this.fields[11]=this.fieldVENSV5=new CharacterField(this.message, 285, 20, "VENSV5");
/*     */ 
/* 106 */     this.fieldnames[12] = "VENSV6";
/* 107 */     this.tagnames[12] = "VENSV6";
/*     */      this.fields[12]=this.fieldVENSV6=new CharacterField(this.message, 305, 20, "VENSV6");
/*     */ 
/* 110 */     this.fieldnames[13] = "VENFLG";
/* 111 */     this.tagnames[13] = "VENFLG";
/*     */      this.fields[13]=this.fieldVENFLG=new CharacterField(this.message, 325, 1, "VENFLG");
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalVENNUM()
/*     */   {
/* 120 */     return this.fieldVENNUM.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public String getVENAD1()
/*     */   {
/* 127 */     return this.fieldVENAD1.getString();
/*     */   }
/*     */ 
/*     */   public String getVENAD2()
/*     */   {
/* 134 */     return this.fieldVENAD2.getString();
/*     */   }
/*     */ 
/*     */   public String getVENAD3()
/*     */   {
/* 141 */     return this.fieldVENAD3.getString();
/*     */   }
/*     */ 
/*     */   public String getVENAD4()
/*     */   {
/* 148 */     return this.fieldVENAD4.getString();
/*     */   }
/*     */ 
/*     */   public String getVENFLG()
/*     */   {
/* 155 */     return this.fieldVENFLG.getString();
/*     */   }
/*     */ 
/*     */   public String getVENNMA()
/*     */   {
/* 162 */     return this.fieldVENNMA.getString();
/*     */   }
/*     */ 
/*     */   public String getVENNUM()
/*     */   {
/* 169 */     return this.fieldVENNUM.getString();
/*     */   }
/*     */ 
/*     */   public String getVENSV1()
/*     */   {
/* 176 */     return this.fieldVENSV1.getString();
/*     */   }
/*     */ 
/*     */   public String getVENSV2()
/*     */   {
/* 183 */     return this.fieldVENSV2.getString();
/*     */   }
/*     */ 
/*     */   public String getVENSV3()
/*     */   {
/* 190 */     return this.fieldVENSV3.getString();
/*     */   }
/*     */ 
/*     */   public String getVENSV4()
/*     */   {
/* 197 */     return this.fieldVENSV4.getString();
/*     */   }
/*     */ 
/*     */   public String getVENSV5()
/*     */   {
/* 204 */     return this.fieldVENSV5.getString();
/*     */   }
/*     */ 
/*     */   public String getVENSV6()
/*     */   {
/* 211 */     return this.fieldVENSV6.getString();
/*     */   }
/*     */ 
/*     */   public String getVENUSR()
/*     */   {
/* 218 */     return this.fieldVENUSR.getString();
/*     */   }
/*     */ 
/*     */   public void setVENAD1(String newvalue)
/*     */   {
/* 225 */     this.fieldVENAD1.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setVENAD2(String newvalue)
/*     */   {
/* 232 */     this.fieldVENAD2.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setVENAD3(String newvalue)
/*     */   {
/* 239 */     this.fieldVENAD3.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setVENAD4(String newvalue)
/*     */   {
/* 246 */     this.fieldVENAD4.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setVENFLG(String newvalue)
/*     */   {
/* 253 */     this.fieldVENFLG.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setVENNMA(String newvalue)
/*     */   {
/* 260 */     this.fieldVENNMA.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setVENNUM(String newvalue)
/*     */   {
/* 267 */     this.fieldVENNUM.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setVENNUM(BigDecimal newvalue)
/*     */   {
/* 274 */     this.fieldVENNUM.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setVENSV1(String newvalue)
/*     */   {
/* 281 */     this.fieldVENSV1.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setVENSV2(String newvalue)
/*     */   {
/* 288 */     this.fieldVENSV2.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setVENSV3(String newvalue)
/*     */   {
/* 295 */     this.fieldVENSV3.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setVENSV4(String newvalue)
/*     */   {
/* 302 */     this.fieldVENSV4.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setVENSV5(String newvalue)
/*     */   {
/* 309 */     this.fieldVENSV5.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setVENSV6(String newvalue)
/*     */   {
/* 316 */     this.fieldVENSV6.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setVENUSR(String newvalue)
/*     */   {
/* 323 */     this.fieldVENUSR.setString(newvalue);
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.SVENDSJVMessage
 * JD-Core Version:    0.6.0
 */