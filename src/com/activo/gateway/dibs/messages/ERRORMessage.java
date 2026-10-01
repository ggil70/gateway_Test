/*     */ package com.activo.gateway.dibs.messages;
/*     */ 
/*     */ import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*     */ 
/*     */ public class ERRORMessage extends MessageRecord
/*     */ {
/*  13 */   final int FIELDCOUNT = 10;
/*  14 */   private CharacterField fieldERR001 = null;
/*  15 */   private CharacterField fieldERR002 = null;
/*  16 */   private CharacterField fieldERR003 = null;
/*  17 */   private CharacterField fieldERR004 = null;
/*  18 */   private CharacterField fieldERR005 = null;
/*  19 */   private CharacterField fieldERR006 = null;
/*  20 */   private CharacterField fieldERR007 = null;
/*  21 */   private CharacterField fieldERR008 = null;
/*  22 */   private CharacterField fieldERR009 = null;
/*  23 */   private CharacterField fieldERR010 = null;
/*     */ 
/*     */   public ERRORMessage()
/*     */   {
/*  30 */     createFields();
/*  31 */     initialize();
/*  32 */     setFormatNameBytes();
/*     */   }
/*     */ 
/*     */   protected void createFields()
/*     */   {
/*  40 */     this.recordsize = 40;
/*  41 */     this.message = new byte[getByteLength()];
/*  42 */     this.formatname = "ERROR";
/*  43 */     this.fieldnames = new String[10];
/*  44 */     this.fields = new MessageField[10];
/*     */ 
/*  46 */     this.fieldnames[0] = "ERR001";
/*     */      this.fields[0]=this.fieldERR001=new CharacterField(this.message, 10, 4);
/*     */ 
/*  49 */     this.fieldnames[1] = "ERR002";
/*     */      this.fields[1]=this.fieldERR002=new CharacterField(this.message, 14, 4);
/*     */ 
/*  52 */     this.fieldnames[2] = "ERR003";
/*     */      this.fields[2]=this.fieldERR003=new CharacterField(this.message, 18, 4);
/*     */ 
/*  55 */     this.fieldnames[3] = "ERR004";
/*     */      this.fields[3]=this.fieldERR004=new CharacterField(this.message, 22, 4);
/*     */ 
/*  58 */     this.fieldnames[4] = "ERR005";
/*     */      this.fields[4]=this.fieldERR005=new CharacterField(this.message, 26, 4);
/*     */ 
/*  61 */     this.fieldnames[5] = "ERR006";
/*     */      this.fields[5]=this.fieldERR006=new CharacterField(this.message, 30, 4);
/*     */ 
/*  64 */     this.fieldnames[6] = "ERR007";
/*     */      this.fields[6]=this.fieldERR007=new CharacterField(this.message, 34, 4);
/*     */ 
/*  67 */     this.fieldnames[7] = "ERR008";
/*     */      this.fields[7]=this.fieldERR008=new CharacterField(this.message, 38, 4);
/*     */ 
/*  70 */     this.fieldnames[8] = "ERR009";
/*     */      this.fields[8]=this.fieldERR009=new CharacterField(this.message, 42, 4);
/*     */ 
/*  73 */     this.fieldnames[9] = "ERR010";
/*     */      this.fields[9]=this.fieldERR010=new CharacterField(this.message, 46, 4);
/*     */   }
/*     */ 
/*     */   public String getERR001()
/*     */   {
/*  82 */     return this.fieldERR001.getString();
/*     */   }
/*     */ 
/*     */   public String getERR002()
/*     */   {
/*  89 */     return this.fieldERR002.getString();
/*     */   }
/*     */ 
/*     */   public String getERR003()
/*     */   {
/*  96 */     return this.fieldERR003.getString();
/*     */   }
/*     */ 
/*     */   public String getERR004()
/*     */   {
/* 103 */     return this.fieldERR004.getString();
/*     */   }
/*     */ 
/*     */   public String getERR005()
/*     */   {
/* 110 */     return this.fieldERR005.getString();
/*     */   }
/*     */ 
/*     */   public String getERR006()
/*     */   {
/* 117 */     return this.fieldERR006.getString();
/*     */   }
/*     */ 
/*     */   public String getERR007()
/*     */   {
/* 124 */     return this.fieldERR007.getString();
/*     */   }
/*     */ 
/*     */   public String getERR008()
/*     */   {
/* 131 */     return this.fieldERR008.getString();
/*     */   }
/*     */ 
/*     */   public String getERR009()
/*     */   {
/* 138 */     return this.fieldERR009.getString();
/*     */   }
/*     */ 
/*     */   public String getERR010()
/*     */   {
/* 145 */     return this.fieldERR010.getString();
/*     */   }
/*     */ 
/*     */   public void setERR001(String newvalue)
/*     */   {
/* 152 */     this.fieldERR001.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setERR002(String newvalue)
/*     */   {
/* 159 */     this.fieldERR002.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setERR003(String newvalue)
/*     */   {
/* 166 */     this.fieldERR003.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setERR004(String newvalue)
/*     */   {
/* 173 */     this.fieldERR004.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setERR005(String newvalue)
/*     */   {
/* 180 */     this.fieldERR005.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setERR006(String newvalue)
/*     */   {
/* 187 */     this.fieldERR006.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setERR007(String newvalue)
/*     */   {
/* 194 */     this.fieldERR007.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setERR008(String newvalue)
/*     */   {
/* 201 */     this.fieldERR008.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setERR009(String newvalue)
/*     */   {
/* 208 */     this.fieldERR009.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setERR010(String newvalue)
/*     */   {
/* 215 */     this.fieldERR010.setString(newvalue);
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.ERRORMessage
 * JD-Core Version:    0.6.0
 */