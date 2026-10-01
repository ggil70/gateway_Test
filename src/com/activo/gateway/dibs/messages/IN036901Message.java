/*     */ package com.activo.gateway.dibs.messages;
/*     */ 
/*     */ import java.math.BigDecimal;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*     */ 
/*     */ public class IN036901Message extends MessageRecord
/*     */ {
/*  19 */   final int FIELDCOUNT = 6;
/*  20 */   private CharacterField fieldH69USERID = null;
/*  21 */   private CharacterField fieldH69OPECOD = null;
/*  22 */   private CharacterField fieldH69FLGMAS = null;
/*  23 */   private CharacterField fieldE69RATCY1 = null;
/*  24 */   private CharacterField fieldE69RATCY2 = null;
/*  25 */   private DecimalField fieldE69RATAMT = null;
/*     */ 
/*     */   public IN036901Message()
/*     */   {
/*  32 */     createFields();
/*  33 */     initialize();
/*     */   }
/*     */ 
/*     */   protected void createFields()
/*     */   {
/*  42 */     this.recordsize = 38;
/*  43 */     this.fileid = "1060719122009";
/*  44 */     this.recordid = "4C4E8D73D92E2";
/*  45 */     this.message = new byte[getByteLength()];
/*  46 */     this.formatname = "IN036901";
/*  47 */     this.fieldnames = new String[6];
/*  48 */     this.tagnames = new String[6];
/*  49 */     this.fields = new MessageField[6];
/*     */ 
/*  51 */     this.fieldnames[0] = "H69USERID";
/*  52 */     this.tagnames[0] = "H69USERID";
/*     */      this.fields[0]=this.fieldH69USERID=new CharacterField(this.message, 10, 10, "H69USERID");
/*     */ 
/*  55 */     this.fieldnames[1] = "H69OPECOD";
/*  56 */     this.tagnames[1] = "H69OPECOD";
/*     */      this.fields[1]=this.fieldH69OPECOD=new CharacterField(this.message, 20, 4, "H69OPECOD");
/*     */ 
/*  59 */     this.fieldnames[2] = "H69FLGMAS";
/*  60 */     this.tagnames[2] = "H69FLGMAS";
/*     */      this.fields[2]=this.fieldH69FLGMAS=new CharacterField(this.message, 24, 1, "H69FLGMAS");
/*     */ 
/*  63 */     this.fieldnames[3] = "E69RATCY1";
/*  64 */     this.tagnames[3] = "E69RATCY1";
/*     */      this.fields[3]=this.fieldE69RATCY1=new CharacterField(this.message, 25, 3, "E69RATCY1");
/*     */ 
/*  67 */     this.fieldnames[4] = "E69RATCY2";
/*  68 */     this.tagnames[4] = "E69RATCY2";
/*     */      this.fields[4]=this.fieldE69RATCY2=new CharacterField(this.message, 28, 3, "E69RATCY2");
/*     */ 
/*  71 */     this.fieldnames[5] = "E69RATAMT";
/*  72 */     this.tagnames[5] = "E69RATAMT";
/*     */      this.fields[5]=this.fieldE69RATAMT=new DecimalField(this.message, 31, 17, 2, "E69RATAMT");
/*     */   }
/*     */ 
/*     */   public void setH69USERID(String newvalue)
/*     */   {
/*  82 */     this.fieldH69USERID.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getH69USERID()
/*     */   {
/*  90 */     return this.fieldH69USERID.getString();
/*     */   }
/*     */ 
/*     */   public void setH69OPECOD(String newvalue)
/*     */   {
/*  98 */     this.fieldH69OPECOD.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getH69OPECOD()
/*     */   {
/* 106 */     return this.fieldH69OPECOD.getString();
/*     */   }
/*     */ 
/*     */   public void setH69FLGMAS(String newvalue)
/*     */   {
/* 114 */     this.fieldH69FLGMAS.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getH69FLGMAS()
/*     */   {
/* 122 */     return this.fieldH69FLGMAS.getString();
/*     */   }
/*     */ 
/*     */   public void setE69RATCY1(String newvalue)
/*     */   {
/* 130 */     this.fieldE69RATCY1.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getE69RATCY1()
/*     */   {
/* 138 */     return this.fieldE69RATCY1.getString();
/*     */   }
/*     */ 
/*     */   public void setE69RATCY2(String newvalue)
/*     */   {
/* 146 */     this.fieldE69RATCY2.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getE69RATCY2()
/*     */   {
/* 154 */     return this.fieldE69RATCY2.getString();
/*     */   }
/*     */ 
/*     */   public void setE69RATAMT(String newvalue)
/*     */   {
/* 162 */     this.fieldE69RATAMT.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getE69RATAMT()
/*     */   {
/* 170 */     return this.fieldE69RATAMT.getString();
/*     */   }
/*     */ 
/*     */   public void setE69RATAMT(BigDecimal newvalue)
/*     */   {
/* 178 */     this.fieldE69RATAMT.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalE69RATAMT()
/*     */   {
/* 186 */     return this.fieldE69RATAMT.getBigDecimal();
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.IN036901Message
 * JD-Core Version:    0.6.0
 */