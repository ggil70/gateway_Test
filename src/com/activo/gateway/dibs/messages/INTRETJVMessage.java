/*     */ package com.activo.gateway.dibs.messages;
/*     */ 
/*     */ import java.math.BigDecimal;
import java.util.Hashtable;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*     */ 
/*     */ public class INTRETJVMessage extends MessageRecord
/*     */ {
/*  18 */   static final String[] fldnames = { 
/*  19 */     "INRUSR", 
/*  20 */     "INROPC", 
/*  21 */     "INRACC", 
/*  22 */     "INRAMT", 
/*  23 */     "INRDYS", 
/*  24 */     "INRDSC", 
/*  25 */     "INRCKN", 
/*  26 */     "INRRCO" };
/*     */ 
/*  28 */   static final String[] tnames = { 
/*  29 */     "INRUSR", 
/*  30 */     "INROPC", 
/*  31 */     "INRACC", 
/*  32 */     "INRAMT", 
/*  33 */     "INRDYS", 
/*  34 */     "INRDSC", 
/*  35 */     "INRCKN", 
/*  36 */     "INRRCO" };
/*     */   static final String fid = "1080702121828";
/*     */   static final String rid = "5E9357AF2F1B1";
/*     */   static final String fmtname = "INTRETJV";
/*  41 */   final int FIELDCOUNT = 8;
/*  42 */   private static Hashtable tlookup = new Hashtable();
/*  43 */   private CharacterField fieldINRUSR = null;
/*  44 */   private DecimalField fieldINROPC = null;
/*  45 */   private DecimalField fieldINRACC = null;
/*  46 */   private DecimalField fieldINRAMT = null;
/*  47 */   private DecimalField fieldINRDYS = null;
/*  48 */   private CharacterField fieldINRDSC = null;
/*  49 */   private DecimalField fieldINRCKN = null;
/*  50 */   private DecimalField fieldINRRCO = null;
/*     */ 
/*     */   public INTRETJVMessage()
/*     */   {
/*  57 */     createFields();
/*  58 */     initialize();
/*     */   }
/*     */ 
/*     */   protected void createFields()
/*     */   {
/*  67 */     this.recordsize = 94;
/*  68 */     this.fileid = "1080702121828";
/*  69 */     this.recordid = "5E9357AF2F1B1";
/*  70 */     this.message = new byte[getByteLength()];
/*  71 */     this.formatname = "INTRETJV";
/*  72 */     this.fieldnames = fldnames;
/*  73 */     this.tagnames = tnames;
/*  74 */     this.fields = new MessageField[8];
/*     */      this.fields[0]=this.fieldINRUSR=new CharacterField(this.message, 10, 10, "INRUSR");
/*     */      this.fields[1]=this.fieldINROPC=new DecimalField(this.message, 20, 4, 0, "INROPC");
/*     */      this.fields[2]=this.fieldINRACC=new DecimalField(this.message, 24, 13, 0, "INRACC");
/*     */      this.fields[3]=this.fieldINRAMT=new DecimalField(this.message, 37, 19, 2, "INRAMT");
/*     */      this.fields[4]=this.fieldINRDYS=new DecimalField(this.message, 56, 5, 0, "INRDYS");
/*     */      this.fields[5]=this.fieldINRDSC=new CharacterField(this.message, 61, 30, "INRDSC");
/*     */      this.fields[6]=this.fieldINRCKN=new DecimalField(this.message, 91, 10, 0, "INRCKN");
/*     */      this.fields[7]=this.fieldINRRCO=new DecimalField(this.message, 101, 3, 0, "INRRCO");
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
/*     */   public void setINRUSR(String newvalue)
/*     */   {
/* 110 */     this.fieldINRUSR.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getINRUSR()
/*     */   {
/* 118 */     return this.fieldINRUSR.getString();
/*     */   }
/*     */ 
/*     */   public void setINROPC(String newvalue)
/*     */   {
/* 126 */     this.fieldINROPC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getINROPC()
/*     */   {
/* 134 */     return this.fieldINROPC.getString();
/*     */   }
/*     */ 
/*     */   public void setINROPC(BigDecimal newvalue)
/*     */   {
/* 142 */     this.fieldINROPC.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalINROPC()
/*     */   {
/* 150 */     return this.fieldINROPC.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setINRACC(String newvalue)
/*     */   {
/* 158 */     this.fieldINRACC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getINRACC()
/*     */   {
/* 166 */     return this.fieldINRACC.getString();
/*     */   }
/*     */ 
/*     */   public void setINRACC(BigDecimal newvalue)
/*     */   {
/* 174 */     this.fieldINRACC.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalINRACC()
/*     */   {
/* 182 */     return this.fieldINRACC.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setINRAMT(String newvalue)
/*     */   {
/* 190 */     this.fieldINRAMT.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getINRAMT()
/*     */   {
/* 198 */     return this.fieldINRAMT.getString();
/*     */   }
/*     */ 
/*     */   public void setINRAMT(BigDecimal newvalue)
/*     */   {
/* 206 */     this.fieldINRAMT.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalINRAMT()
/*     */   {
/* 214 */     return this.fieldINRAMT.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setINRDYS(String newvalue)
/*     */   {
/* 222 */     this.fieldINRDYS.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getINRDYS()
/*     */   {
/* 230 */     return this.fieldINRDYS.getString();
/*     */   }
/*     */ 
/*     */   public void setINRDYS(BigDecimal newvalue)
/*     */   {
/* 238 */     this.fieldINRDYS.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalINRDYS()
/*     */   {
/* 246 */     return this.fieldINRDYS.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setINRDSC(String newvalue)
/*     */   {
/* 254 */     this.fieldINRDSC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getINRDSC()
/*     */   {
/* 262 */     return this.fieldINRDSC.getString();
/*     */   }
/*     */ 
/*     */   public void setINRCKN(String newvalue)
/*     */   {
/* 270 */     this.fieldINRCKN.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getINRCKN()
/*     */   {
/* 278 */     return this.fieldINRCKN.getString();
/*     */   }
/*     */ 
/*     */   public void setINRCKN(BigDecimal newvalue)
/*     */   {
/* 286 */     this.fieldINRCKN.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalINRCKN()
/*     */   {
/* 294 */     return this.fieldINRCKN.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setINRRCO(String newvalue)
/*     */   {
/* 302 */     this.fieldINRRCO.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getINRRCO()
/*     */   {
/* 310 */     return this.fieldINRRCO.getString();
/*     */   }
/*     */ 
/*     */   public void setINRRCO(BigDecimal newvalue)
/*     */   {
/* 318 */     this.fieldINRRCO.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalINRRCO()
/*     */   {
/* 326 */     return this.fieldINRRCO.getBigDecimal();
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.INTRETJVMessage
 * JD-Core Version:    0.6.0
 */