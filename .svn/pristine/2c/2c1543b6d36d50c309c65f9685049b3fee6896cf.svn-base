/*     */ package com.activo.gateway.dibs.messages;
/*     */ 
/*     */ import java.math.BigDecimal;
import java.util.Hashtable;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*     */ 
/*     */ public class IN0982012Message extends MessageRecord
/*     */ {
/*  18 */   static final String[] fldnames = { 
/*  19 */     "IN982USR1", 
/*  20 */     "IN982FACC", 
/*  21 */     "IN982TACC", 
/*  22 */     "INT982AMT", 
/*  23 */     "INT982DTP", 
/*  24 */     "INT982DTP1", 
/*  25 */     "INT982DTP2", 
/*  26 */     "INT982TYPE" };
/*     */ 
/*  28 */   static final String[] tnames = { 
/*  29 */     "IN982USR1", 
/*  30 */     "IN982FACC", 
/*  31 */     "IN982TACC", 
/*  32 */     "INT982AMT", 
/*  33 */     "INT982DTP", 
/*  34 */     "INT982DTP1", 
/*  35 */     "INT982DTP2", 
/*  36 */     "INT982TYPE" };
/*     */   static final String fid = "1080702182958";
/*     */   static final String rid = "3FC0801B6309E";
/*     */   static final String fmtname = "IN0982012";
/*  41 */   final int FIELDCOUNT = 8;
/*  42 */   private static Hashtable tlookup = new Hashtable();
/*  43 */   private CharacterField fieldIN982USR1 = null;
/*  44 */   private DecimalField fieldIN982FACC = null;
/*  45 */   private DecimalField fieldIN982TACC = null;
/*  46 */   private DecimalField fieldINT982AMT = null;
/*  47 */   private CharacterField fieldINT982DTP = null;
/*  48 */   private CharacterField fieldINT982DTP1 = null;
/*  49 */   private CharacterField fieldINT982DTP2 = null;
/*  50 */   private DecimalField fieldINT982TYPE = null;
/*     */ 
/*     */   public IN0982012Message()
/*     */   {
/*  57 */     createFields();
/*  58 */     initialize();
/*     */   }
/*     */ 
/*     */   protected void createFields()
/*     */   {
/*  67 */     this.recordsize = 143;
/*  68 */     this.fileid = "1080702182958";
/*  69 */     this.recordid = "3FC0801B6309E";
/*  70 */     this.message = new byte[getByteLength()];
/*  71 */     this.formatname = "IN0982012";
/*  72 */     this.fieldnames = fldnames;
/*  73 */     this.tagnames = tnames;
/*  74 */     this.fields = new MessageField[8];
/*     */      this.fields[0]=this.fieldIN982USR1=new CharacterField(this.message, 10, 10, "IN982USR1");
/*     */      this.fields[1]=this.fieldIN982FACC=new DecimalField(this.message, 20, 13, 0, "IN982FACC");
/*     */      this.fields[2]=this.fieldIN982TACC=new DecimalField(this.message, 33, 13, 0, "IN982TACC");
/*     */      this.fields[3]=this.fieldINT982AMT=new DecimalField(this.message, 46, 15, 2, "INT982AMT");
/*     */      this.fields[4]=this.fieldINT982DTP=new CharacterField(this.message, 61, 30, "INT982DTP");
/*     */      this.fields[5]=this.fieldINT982DTP1=new CharacterField(this.message, 91, 30, "INT982DTP1");
/*     */      this.fields[6]=this.fieldINT982DTP2=new CharacterField(this.message, 121, 30, "INT982DTP2");
/*     */      this.fields[7]=this.fieldINT982TYPE=new DecimalField(this.message, 151, 2, 0, "INT982TYPE");
/*     */ 
/*  93 */     synchronized (tlookup)
/*     */     {
/*  95 */       if (tlookup.isEmpty())
/*     */       {
/*  97 */         for (int i = 0; i < tnames.length; i++) {
/*  98 */           tlookup.put(tnames[i], new Integer(i));
/*     */         }
/*     */       }
/*     */     }
/* 102 */     this.taglookup = tlookup;
/*     */   }
/*     */ 
/*     */   public void setIN982USR1(String newvalue)
/*     */   {
/* 110 */     this.fieldIN982USR1.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getIN982USR1()
/*     */   {
/* 118 */     return this.fieldIN982USR1.getString();
/*     */   }
/*     */ 
/*     */   public void setIN982FACC(String newvalue)
/*     */   {
/* 126 */     this.fieldIN982FACC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getIN982FACC()
/*     */   {
/* 134 */     return this.fieldIN982FACC.getString();
/*     */   }
/*     */ 
/*     */   public void setIN982FACC(BigDecimal newvalue)
/*     */   {
/* 142 */     this.fieldIN982FACC.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalIN982FACC()
/*     */   {
/* 150 */     return this.fieldIN982FACC.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setIN982TACC(String newvalue)
/*     */   {
/* 158 */     this.fieldIN982TACC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getIN982TACC()
/*     */   {
/* 166 */     return this.fieldIN982TACC.getString();
/*     */   }
/*     */ 
/*     */   public void setIN982TACC(BigDecimal newvalue)
/*     */   {
/* 174 */     this.fieldIN982TACC.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalIN982TACC()
/*     */   {
/* 182 */     return this.fieldIN982TACC.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setINT982AMT(String newvalue)
/*     */   {
/* 190 */     this.fieldINT982AMT.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getINT982AMT()
/*     */   {
/* 198 */     return this.fieldINT982AMT.getString();
/*     */   }
/*     */ 
/*     */   public void setINT982AMT(BigDecimal newvalue)
/*     */   {
/* 206 */     this.fieldINT982AMT.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalINT982AMT()
/*     */   {
/* 214 */     return this.fieldINT982AMT.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setINT982DTP(String newvalue)
/*     */   {
/* 222 */     this.fieldINT982DTP.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getINT982DTP()
/*     */   {
/* 230 */     return this.fieldINT982DTP.getString();
/*     */   }
/*     */ 
/*     */   public void setINT982DTP1(String newvalue)
/*     */   {
/* 238 */     this.fieldINT982DTP1.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getINT982DTP1()
/*     */   {
/* 246 */     return this.fieldINT982DTP1.getString();
/*     */   }
/*     */ 
/*     */   public void setINT982DTP2(String newvalue)
/*     */   {
/* 254 */     this.fieldINT982DTP2.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getINT982DTP2()
/*     */   {
/* 262 */     return this.fieldINT982DTP2.getString();
/*     */   }
/*     */ 
/*     */   public void setINT982TYPE(String newvalue)
/*     */   {
/* 270 */     this.fieldINT982TYPE.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getINT982TYPE()
/*     */   {
/* 278 */     return this.fieldINT982TYPE.getString();
/*     */   }
/*     */ 
/*     */   public void setINT982TYPE(BigDecimal newvalue)
/*     */   {
/* 286 */     this.fieldINT982TYPE.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalINT982TYPE()
/*     */   {
/* 294 */     return this.fieldINT982TYPE.getBigDecimal();
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.IN098201Message
 * JD-Core Version:    0.6.0
 */