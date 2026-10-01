/*     */ package com.activo.gateway.dibs.messages;
/*     */ 
/*     */ import java.math.BigDecimal;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*     */ 
/*     */ public class TINQADSJVMessage extends MessageRecord
/*     */ {
/*  19 */   final int FIELDCOUNT = 5;
/*  20 */   private CharacterField fieldTIAUSR = null;
/*  21 */   private DecimalField fieldTIADACC = null;
/*  22 */   private CharacterField fieldTIATYP = null;
/*  23 */   private CharacterField fieldTIAATY = null;
/*  24 */   private CharacterField fieldTIANUM = null;
/*     */ 
/*     */   public TINQADSJVMessage()
/*     */   {
/*  31 */     createFields();
/*  32 */     initialize();
/*     */   }
/*     */ 
/*     */   protected void createFields()
/*     */   {
/*  41 */     this.recordsize = 32;
/*  42 */     this.fileid = "1030110094700";
/*  43 */     this.recordid = "4B97610D2057D";
/*  44 */     this.message = new byte[getByteLength()];
/*  45 */     this.formatname = "TINQADSJV";
/*  46 */     this.fieldnames = new String[5];
/*  47 */     this.tagnames = new String[5];
/*  48 */     this.fields = new MessageField[5];
/*     */ 
/*  50 */     this.fieldnames[0] = "TIAUSR";
/*  51 */     this.tagnames[0] = "TIAUSR";
/*     */      this.fields[0]=this.fieldTIAUSR=new CharacterField(this.message, 10, 10, "TIAUSR");
/*     */ 
/*  54 */     this.fieldnames[1] = "TIADACC";
/*  55 */     this.tagnames[1] = "TIADACC";
/*     */      this.fields[1]=this.fieldTIADACC=new DecimalField(this.message, 20, 13, 0, "TIADACC");
/*     */ 
/*  58 */     this.fieldnames[2] = "TIATYP";
/*  59 */     this.tagnames[2] = "TIATYP";
/*     */      this.fields[2]=this.fieldTIATYP=new CharacterField(this.message, 33, 1, "TIATYP");
/*     */ 
/*  62 */     this.fieldnames[3] = "TIAATY";
/*  63 */     this.tagnames[3] = "TIAATY";
/*     */      this.fields[3]=this.fieldTIAATY=new CharacterField(this.message, 34, 1, "TIAATY");
/*     */ 
/*  66 */     this.fieldnames[4] = "TIANUM";
/*  67 */     this.tagnames[4] = "TIANUM";
/*     */      this.fields[4]=this.fieldTIANUM=new CharacterField(this.message, 35, 7, "TIANUM");
/*     */   }
/*     */ 
/*     */   public void setTIAUSR(String newvalue)
/*     */   {
/*  77 */     this.fieldTIAUSR.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getTIAUSR()
/*     */   {
/*  85 */     return this.fieldTIAUSR.getString();
/*     */   }
/*     */ 
/*     */   public void setTIADACC(String newvalue)
/*     */   {
/*  93 */     this.fieldTIADACC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getTIADACC()
/*     */   {
/* 101 */     return this.fieldTIADACC.getString();
/*     */   }
/*     */ 
/*     */   public void setTIADACC(BigDecimal newvalue)
/*     */   {
/* 109 */     this.fieldTIADACC.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalTIADACC()
/*     */   {
/* 117 */     return this.fieldTIADACC.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setTIATYP(String newvalue)
/*     */   {
/* 125 */     this.fieldTIATYP.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getTIATYP()
/*     */   {
/* 133 */     return this.fieldTIATYP.getString();
/*     */   }
/*     */ 
/*     */   public void setTIAATY(String newvalue)
/*     */   {
/* 141 */     this.fieldTIAATY.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getTIAATY()
/*     */   {
/* 149 */     return this.fieldTIAATY.getString();
/*     */   }
/*     */ 
/*     */   public void setTIANUM(String newvalue)
/*     */   {
/* 157 */     this.fieldTIANUM.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getTIANUM()
/*     */   {
/* 165 */     return this.fieldTIANUM.getString();
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.TINQADSJVMessage
 * JD-Core Version:    0.6.0
 */