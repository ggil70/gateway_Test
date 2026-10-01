/*     */ package com.activo.gateway.dibs.messages;
/*     */ 
/*     */ import java.math.BigDecimal;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*     */ 
/*     */ public class FIDEICOMIMessage extends MessageRecord
/*     */ {
/*  19 */   final int FIELDCOUNT = 8;
/*  20 */   private CharacterField fieldFIDEUSER = null;
/*  21 */   private DecimalField fieldFIDACC = null;
/*  22 */   private CharacterField fieldFIDCCY = null;
/*  23 */   private DecimalField fieldFIDBALANC = null;
/*  24 */   private DecimalField fieldFIDPROFIT = null;
/*  25 */   private DecimalField fieldFIDAMOUNT = null;
/*  26 */   private DecimalField fieldFIDRATE = null;
/*  27 */   private CharacterField fieldFIDNNM = null;
/*     */ 
/*     */   public FIDEICOMIMessage()
/*     */   {
/*  34 */     createFields();
/*  35 */     initialize();
/*     */   }
/*     */ 
/*     */   protected void createFields()
/*     */   {
/*  44 */     this.recordsize = 118;
/*  45 */     this.fileid = "1010723174610";
/*  46 */     this.recordid = "51C52040E1EE4";
/*  47 */     this.message = new byte[getByteLength()];
/*  48 */     this.formatname = "FIDEICOMI";
/*  49 */     this.fieldnames = new String[8];
/*  50 */     this.tagnames = new String[8];
/*  51 */     this.fields = new MessageField[8];
/*     */ 
/*  53 */     this.fieldnames[0] = "FIDEUSER";
/*  54 */     this.tagnames[0] = "FIDEUSER";
/*     */      this.fields[0]=this.fieldFIDEUSER=new CharacterField(this.message, 10, 10, "FIDEUSER");
/*     */ 
/*  57 */     this.fieldnames[1] = "FIDACC";
/*  58 */     this.tagnames[1] = "FIDACC";
/*     */      this.fields[1]=this.fieldFIDACC=new DecimalField(this.message, 20, 13, 0, "FIDACC");
/*     */ 
/*  61 */     this.fieldnames[2] = "FIDCCY";
/*  62 */     this.tagnames[2] = "FIDCCY";
/*     */      this.fields[2]=this.fieldFIDCCY=new CharacterField(this.message, 33, 3, "FIDCCY");
/*     */ 
/*  65 */     this.fieldnames[3] = "FIDBALANC";
/*  66 */     this.tagnames[3] = "FIDBALANC";
/*     */      this.fields[3]=this.fieldFIDBALANC=new DecimalField(this.message, 36, 17, 2, "FIDBALANC");
/*     */ 
/*  69 */     this.fieldnames[4] = "FIDPROFIT";
/*  70 */     this.tagnames[4] = "FIDPROFIT";
/*     */      this.fields[4]=this.fieldFIDPROFIT=new DecimalField(this.message, 53, 17, 2, "FIDPROFIT");
/*     */ 
/*  73 */     this.fieldnames[5] = "FIDAMOUNT";
/*  74 */     this.tagnames[5] = "FIDAMOUNT";
/*     */      this.fields[5]=this.fieldFIDAMOUNT=new DecimalField(this.message, 70, 17, 2, "FIDAMOUNT");
/*     */ 
/*  77 */     this.fieldnames[6] = "FIDRATE";
/*  78 */     this.tagnames[6] = "FIDRATE";
/*     */      this.fields[6]=this.fieldFIDRATE=new DecimalField(this.message, 87, 11, 6, "FIDRATE");
/*     */ 
/*  81 */     this.fieldnames[7] = "FIDNNM";
/*  82 */     this.tagnames[7] = "FIDNNM";
/*     */      this.fields[7]=this.fieldFIDNNM=new CharacterField(this.message, 98, 30, "FIDNNM");
/*     */   }
/*     */ 
/*     */   public void setFIDEUSER(String newvalue)
/*     */   {
/*  92 */     this.fieldFIDEUSER.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getFIDEUSER()
/*     */   {
/* 100 */     return this.fieldFIDEUSER.getString();
/*     */   }
/*     */ 
/*     */   public void setFIDACC(String newvalue)
/*     */   {
/* 108 */     this.fieldFIDACC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getFIDACC()
/*     */   {
/* 116 */     return this.fieldFIDACC.getString();
/*     */   }
/*     */ 
/*     */   public void setFIDACC(BigDecimal newvalue)
/*     */   {
/* 124 */     this.fieldFIDACC.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalFIDACC()
/*     */   {
/* 132 */     return this.fieldFIDACC.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setFIDCCY(String newvalue)
/*     */   {
/* 140 */     this.fieldFIDCCY.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getFIDCCY()
/*     */   {
/* 148 */     return this.fieldFIDCCY.getString();
/*     */   }
/*     */ 
/*     */   public void setFIDBALANC(String newvalue)
/*     */   {
/* 156 */     this.fieldFIDBALANC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getFIDBALANC()
/*     */   {
/* 164 */     return this.fieldFIDBALANC.getString();
/*     */   }
/*     */ 
/*     */   public void setFIDBALANC(BigDecimal newvalue)
/*     */   {
/* 172 */     this.fieldFIDBALANC.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalFIDBALANC()
/*     */   {
/* 180 */     return this.fieldFIDBALANC.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setFIDPROFIT(String newvalue)
/*     */   {
/* 188 */     this.fieldFIDPROFIT.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getFIDPROFIT()
/*     */   {
/* 196 */     return this.fieldFIDPROFIT.getString();
/*     */   }
/*     */ 
/*     */   public void setFIDPROFIT(BigDecimal newvalue)
/*     */   {
/* 204 */     this.fieldFIDPROFIT.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalFIDPROFIT()
/*     */   {
/* 212 */     return this.fieldFIDPROFIT.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setFIDAMOUNT(String newvalue)
/*     */   {
/* 220 */     this.fieldFIDAMOUNT.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getFIDAMOUNT()
/*     */   {
/* 228 */     return this.fieldFIDAMOUNT.getString();
/*     */   }
/*     */ 
/*     */   public void setFIDAMOUNT(BigDecimal newvalue)
/*     */   {
/* 236 */     this.fieldFIDAMOUNT.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalFIDAMOUNT()
/*     */   {
/* 244 */     return this.fieldFIDAMOUNT.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setFIDRATE(String newvalue)
/*     */   {
/* 252 */     this.fieldFIDRATE.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getFIDRATE()
/*     */   {
/* 260 */     return this.fieldFIDRATE.getString();
/*     */   }
/*     */ 
/*     */   public void setFIDRATE(BigDecimal newvalue)
/*     */   {
/* 268 */     this.fieldFIDRATE.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalFIDRATE()
/*     */   {
/* 276 */     return this.fieldFIDRATE.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setFIDNNM(String newvalue)
/*     */   {
/* 284 */     this.fieldFIDNNM.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getFIDNNM()
/*     */   {
/* 292 */     return this.fieldFIDNNM.getString();
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.FIDEICOMIMessage
 * JD-Core Version:    0.6.0
 */