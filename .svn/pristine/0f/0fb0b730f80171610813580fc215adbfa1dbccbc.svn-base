/*     */ package com.activo.gateway.dibs.messages;
/*     */ 
/*     */ import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*     */ 
/*     */ public class IN095501Message extends MessageRecord
/*     */ {
/*  16 */   final int FIELDCOUNT = 4;
/*  17 */   private CharacterField fieldIN9551USR = null;
/*  18 */   private CharacterField fieldIN9551TYP = null;
/*  19 */   private CharacterField fieldIN9551ACC = null;
/*  20 */   private CharacterField fieldIN9551EOF = null;
/*     */ 
/*     */   public IN095501Message()
/*     */   {
/*  27 */     createFields();
/*  28 */     initialize();
/*     */   }
/*     */ 
/*     */   protected void createFields()
/*     */   {
/*  36 */     this.recordsize = 31;
/*  37 */     this.fileid = "1000920164225";
/*  38 */     this.recordid = "2B4463D8DFD5F";
/*  39 */     this.message = new byte[getByteLength()];
/*  40 */     this.formatname = "IN095501";
/*  41 */     this.fieldnames = new String[4];
/*  42 */     this.tagnames = new String[4];
/*  43 */     this.fields = new MessageField[4];
/*     */ 
/*  45 */     this.fieldnames[0] = "IN9551USR";
/*  46 */     this.tagnames[0] = "IN9551USR";
/*     */      this.fields[0]=this.fieldIN9551USR=new CharacterField(this.message, 10, 10, "IN9551USR");
/*     */ 
/*  49 */     this.fieldnames[1] = "IN9551TYP";
/*  50 */     this.tagnames[1] = "IN9551TYP";
/*     */      this.fields[1]=this.fieldIN9551TYP=new CharacterField(this.message, 20, 2, "IN9551TYP");
/*     */ 
/*  53 */     this.fieldnames[2] = "IN9551ACC";
/*  54 */     this.tagnames[2] = "IN9551ACC";
/*     */      this.fields[2]=this.fieldIN9551ACC=new CharacterField(this.message, 22, 18, "IN9551ACC");
/*     */ 
/*  57 */     this.fieldnames[3] = "IN9551EOF";
/*  58 */     this.tagnames[3] = "IN9551EOF";
/*     */      this.fields[3]=this.fieldIN9551EOF=new CharacterField(this.message, 40, 1, "IN9551EOF");
/*     */   }
/*     */ 
/*     */   public String getIN9551ACC()
/*     */   {
/*  67 */     return this.fieldIN9551ACC.getString();
/*     */   }
/*     */ 
/*     */   public String getIN9551EOF()
/*     */   {
/*  74 */     return this.fieldIN9551EOF.getString();
/*     */   }
/*     */ 
/*     */   public String getIN9551TYP()
/*     */   {
/*  81 */     return this.fieldIN9551TYP.getString();
/*     */   }
/*     */ 
/*     */   public String getIN9551USR()
/*     */   {
/*  88 */     return this.fieldIN9551USR.getString();
/*     */   }
/*     */ 
/*     */   public void setIN9551ACC(String newvalue)
/*     */   {
/*  95 */     this.fieldIN9551ACC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN9551EOF(String newvalue)
/*     */   {
/* 102 */     this.fieldIN9551EOF.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN9551TYP(String newvalue)
/*     */   {
/* 109 */     this.fieldIN9551TYP.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setIN9551USR(String newvalue)
/*     */   {
/* 116 */     this.fieldIN9551USR.setString(newvalue);
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.IN095501Message
 * JD-Core Version:    0.6.0
 */