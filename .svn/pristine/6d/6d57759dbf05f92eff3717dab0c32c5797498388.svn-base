/*     */ package com.activo.gateway.dibs.messages;
/*     */ 
/*     */ import java.math.BigDecimal;
import java.util.Hashtable;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*     */ 
/*     */ public class VENDSJVMessage extends MessageRecord
/*     */ {
/* 209 */   static final String[] fldnames = { 
/* 210 */     "VENUSR", "VENNUM", "VENNMA", "VENAD1", "VENAD2", "VENAD3", "VENAD4", "VENSTT", "VENZPC", "VENMEM", 
/* 211 */     "VENABA", "VENSHM", "VENFLG" };
/*     */ 
/* 213 */   static final String[] tnames = { 
/* 214 */     "VENUSR", "VENNUM", "VENNMA", "VENAD1", "VENAD2", "VENAD3", "VENAD4", "VENSTT", "VENZPC", "VENMEM", 
/* 215 */     "VENABA", "VENSHM", "VENFLG" };
/*     */   static final String fid = "1060718170002";
/*     */   static final String rid = "4739F1C0604AA";
/*     */   static final String fmtname = "VENDSJV";
/* 220 */   final int FIELDCOUNT = 13;
/* 221 */   private static Hashtable tlookup = new Hashtable();
/*     */   private CharacterField fieldVENUSR;
/*     */   private DecimalField fieldVENNUM;
/*     */   private CharacterField fieldVENNMA;
/*     */   private CharacterField fieldVENAD1;
/*     */   private CharacterField fieldVENAD2;
/*     */   private CharacterField fieldVENAD3;
/*     */   private CharacterField fieldVENAD4;
/*     */   private CharacterField fieldVENSTT;
/*     */   private CharacterField fieldVENZPC;
/*     */   private CharacterField fieldVENMEM;
/*     */   private CharacterField fieldVENABA;
/*     */   private CharacterField fieldVENSHM;
/*     */   private CharacterField fieldVENFLG;
/*     */ 
/*     */   public VENDSJVMessage()
/*     */   {
/*  17 */     this.fieldVENUSR = null;
/*  18 */     this.fieldVENNUM = null;
/*  19 */     this.fieldVENNMA = null;
/*  20 */     this.fieldVENAD1 = null;
/*  21 */     this.fieldVENAD2 = null;
/*  22 */     this.fieldVENAD3 = null;
/*  23 */     this.fieldVENAD4 = null;
/*  24 */     this.fieldVENSTT = null;
/*  25 */     this.fieldVENZPC = null;
/*  26 */     this.fieldVENMEM = null;
/*  27 */     this.fieldVENABA = null;
/*  28 */     this.fieldVENSHM = null;
/*  29 */     this.fieldVENFLG = null;
/*  30 */     createFields();
/*  31 */     initialize();
/*     */   }
/*     */ 
/*     */   protected void createFields()
/*     */   {
/*  36 */     this.recordsize = 275;
/*  37 */     this.fileid = "1060718170002";
/*  38 */     this.recordid = "4739F1C0604AA";
/*  39 */     this.message = new byte[getByteLength()];
/*  40 */     this.formatname = "VENDSJV";
/*  41 */     this.fieldnames = fldnames;
/*  42 */     this.tagnames = tnames;
/*  43 */     this.fields = new MessageField[13];
/*     */      this.fields[0]=this.fieldVENUSR=new CharacterField(this.message, 10, 10, "VENUSR");
/*     */      this.fields[1]=this.fieldVENNUM=new DecimalField(this.message, 20, 10, 0, "VENNUM");
/*     */      this.fields[2]=this.fieldVENNMA=new CharacterField(this.message, 30, 35, "VENNMA");
/*     */      this.fields[3]=this.fieldVENAD1=new CharacterField(this.message, 65, 35, "VENAD1");
/*     */      this.fields[4]=this.fieldVENAD2=new CharacterField(this.message, 100, 35, "VENAD2");
/*     */      this.fields[5]=this.fieldVENAD3=new CharacterField(this.message, 135, 35, "VENAD3");
/*     */      this.fields[6]=this.fieldVENAD4=new CharacterField(this.message, 170, 35, "VENAD4");
/*     */      this.fields[7]=this.fieldVENSTT=new CharacterField(this.message, 205, 2, "VENSTT");
/*     */      this.fields[8]=this.fieldVENZPC=new CharacterField(this.message, 207, 10, "VENZPC");
/*     */      this.fields[9]=this.fieldVENMEM=new CharacterField(this.message, 217, 40, "VENMEM");
/*     */      this.fields[10]=this.fieldVENABA=new CharacterField(this.message, 257, 9, "VENABA");
/*     */      this.fields[11]=this.fieldVENSHM=new CharacterField(this.message, 266, 18, "VENSHM");
/*     */      this.fields[12]=this.fieldVENFLG=new CharacterField(this.message, 284, 1, "VENFLG");
/*  57 */     synchronized (tlookup)
/*     */     {
/*  59 */       if (tlookup.isEmpty())
/*     */       {
/*  61 */         for (int i = 0; i < tnames.length; i++) {
/*  62 */           tlookup.put(tnames[i], new Integer(i));
/*     */         }
/*     */       }
/*     */     }
/*  66 */     this.taglookup = tlookup;
/*     */   }
/*     */ 
/*     */   public void setVENUSR(String newvalue)
/*     */   {
/*  71 */     this.fieldVENUSR.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getVENUSR()
/*     */   {
/*  76 */     return this.fieldVENUSR.getString();
/*     */   }
/*     */ 
/*     */   public void setVENNUM(String newvalue)
/*     */   {
/*  81 */     this.fieldVENNUM.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getVENNUM()
/*     */   {
/*  86 */     return this.fieldVENNUM.getString();
/*     */   }
/*     */ 
/*     */   public void setVENNUM(BigDecimal newvalue)
/*     */   {
/*  91 */     this.fieldVENNUM.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalVENNUM()
/*     */   {
/*  96 */     return this.fieldVENNUM.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setVENNMA(String newvalue)
/*     */   {
/* 101 */     this.fieldVENNMA.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getVENNMA()
/*     */   {
/* 106 */     return this.fieldVENNMA.getString();
/*     */   }
/*     */ 
/*     */   public void setVENAD1(String newvalue)
/*     */   {
/* 111 */     this.fieldVENAD1.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getVENAD1()
/*     */   {
/* 116 */     return this.fieldVENAD1.getString();
/*     */   }
/*     */ 
/*     */   public void setVENAD2(String newvalue)
/*     */   {
/* 121 */     this.fieldVENAD2.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getVENAD2()
/*     */   {
/* 126 */     return this.fieldVENAD2.getString();
/*     */   }
/*     */ 
/*     */   public void setVENAD3(String newvalue)
/*     */   {
/* 131 */     this.fieldVENAD3.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getVENAD3()
/*     */   {
/* 136 */     return this.fieldVENAD3.getString();
/*     */   }
/*     */ 
/*     */   public void setVENAD4(String newvalue)
/*     */   {
/* 141 */     this.fieldVENAD4.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getVENAD4()
/*     */   {
/* 146 */     return this.fieldVENAD4.getString();
/*     */   }
/*     */ 
/*     */   public void setVENSTT(String newvalue)
/*     */   {
/* 151 */     this.fieldVENSTT.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getVENSTT()
/*     */   {
/* 156 */     return this.fieldVENSTT.getString();
/*     */   }
/*     */ 
/*     */   public void setVENZPC(String newvalue)
/*     */   {
/* 161 */     this.fieldVENZPC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getVENZPC()
/*     */   {
/* 166 */     return this.fieldVENZPC.getString();
/*     */   }
/*     */ 
/*     */   public void setVENMEM(String newvalue)
/*     */   {
/* 171 */     this.fieldVENMEM.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getVENMEM()
/*     */   {
/* 176 */     return this.fieldVENMEM.getString();
/*     */   }
/*     */ 
/*     */   public void setVENABA(String newvalue)
/*     */   {
/* 181 */     this.fieldVENABA.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getVENABA()
/*     */   {
/* 186 */     return this.fieldVENABA.getString();
/*     */   }
/*     */ 
/*     */   public void setVENSHM(String newvalue)
/*     */   {
/* 191 */     this.fieldVENSHM.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getVENSHM()
/*     */   {
/* 196 */     return this.fieldVENSHM.getString();
/*     */   }
/*     */ 
/*     */   public void setVENFLG(String newvalue)
/*     */   {
/* 201 */     this.fieldVENFLG.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getVENFLG()
/*     */   {
/* 206 */     return this.fieldVENFLG.getString();
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.VENDSJVMessage
 * JD-Core Version:    0.6.0
 */