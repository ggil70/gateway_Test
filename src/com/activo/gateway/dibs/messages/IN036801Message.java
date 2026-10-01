/*     */ package com.activo.gateway.dibs.messages;
/*     */ 
/*     */ import java.math.BigDecimal;
import java.util.Hashtable;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*     */ 
/*     */ public class IN036801Message extends MessageRecord
/*     */ {
/*  20 */   static final String[] fldnames = { 
/*  21 */     "H68USERID", 
/*  22 */     "H68PROGRM", 
/*  23 */     "H68TIMSYS", 
/*  24 */     "H68SCRCOD", 
/*  25 */     "H68OPECOD", 
/*  26 */     "H68FLGMAS", 
/*  27 */     "H68FLGWK1", 
/*  28 */     "H68FLGWK2", 
/*  29 */     "H68FLGWK3", 
/*  30 */     "E68RTRCCY", 
/*  31 */     "E68RTRDTE", 
/*  32 */     "E68RTRMUD", 
/*  33 */     "E68RTREXR", 
/*  34 */     "E68RTRKPR", 
/*  35 */     "E68RTRKSR" };
/*     */ 
/*  37 */   static final String[] tnames = { 
/*  38 */     "H68USERID", 
/*  39 */     "H68PROGRM", 
/*  40 */     "H68TIMSYS", 
/*  41 */     "H68SCRCOD", 
/*  42 */     "H68OPECOD", 
/*  43 */     "H68FLGMAS", 
/*  44 */     "H68FLGWK1", 
/*  45 */     "H68FLGWK2", 
/*  46 */     "H68FLGWK3", 
/*  47 */     "E68RTRCCY", 
/*  48 */     "E68RTRDTE", 
/*  49 */     "E68RTRMUD", 
/*  50 */     "E68RTREXR", 
/*  51 */     "E68RTRKPR", 
/*  52 */     "E68RTRKSR" };
/*     */   static final String fid = "1030213163545";
/*     */   static final String rid = "5EE8AEE82442F";
/*     */   static final String fmtname = "IN036801";
/*  57 */   final int FIELDCOUNT = 15;
/*  58 */   private static Hashtable tlookup = new Hashtable();
/*  59 */   private CharacterField fieldH68USERID = null;
/*  60 */   private CharacterField fieldH68PROGRM = null;
/*  61 */   private CharacterField fieldH68TIMSYS = null;
/*  62 */   private CharacterField fieldH68SCRCOD = null;
/*  63 */   private CharacterField fieldH68OPECOD = null;
/*  64 */   private CharacterField fieldH68FLGMAS = null;
/*  65 */   private CharacterField fieldH68FLGWK1 = null;
/*  66 */   private CharacterField fieldH68FLGWK2 = null;
/*  67 */   private CharacterField fieldH68FLGWK3 = null;
/*  68 */   private CharacterField fieldE68RTRCCY = null;
/*  69 */   private CharacterField fieldE68RTRDTE = null;
/*  70 */   private CharacterField fieldE68RTRMUD = null;
/*  71 */   private DecimalField fieldE68RTREXR = null;
/*  72 */   private DecimalField fieldE68RTRKPR = null;
/*  73 */   private DecimalField fieldE68RTRKSR = null;
/*     */ 
/*     */   public IN036801Message()
/*     */   {
/*  80 */     createFields();
/*  81 */     initialize();
/*     */   }
/*     */ 
/*     */   protected void createFields()
/*     */   {
/*  90 */     this.recordsize = 95;
/*  91 */     this.fileid = "1030213163545";
/*  92 */     this.recordid = "5EE8AEE82442F";
/*  93 */     this.message = new byte[getByteLength()];
/*  94 */     this.formatname = "IN036801";
/*  95 */     this.fieldnames = fldnames;
/*  96 */     this.tagnames = tnames;
/*  97 */     this.fields = new MessageField[15];
/*     */      this.fields[0]=this.fieldH68USERID=new CharacterField(this.message, 10, 10, "H68USERID");
/*     */      this.fields[1]=this.fieldH68PROGRM=new CharacterField(this.message, 20, 10, "H68PROGRM");
/*     */      this.fields[2]=this.fieldH68TIMSYS=new CharacterField(this.message, 30, 12, "H68TIMSYS");
/*     */      this.fields[3]=this.fieldH68SCRCOD=new CharacterField(this.message, 42, 2, "H68SCRCOD");
/*     */      this.fields[4]=this.fieldH68OPECOD=new CharacterField(this.message, 44, 4, "H68OPECOD");
/*     */      this.fields[5]=this.fieldH68FLGMAS=new CharacterField(this.message, 48, 1, "H68FLGMAS");
/*     */      this.fields[6]=this.fieldH68FLGWK1=new CharacterField(this.message, 49, 1, "H68FLGWK1");
/*     */      this.fields[7]=this.fieldH68FLGWK2=new CharacterField(this.message, 50, 1, "H68FLGWK2");
/*     */      this.fields[8]=this.fieldH68FLGWK3=new CharacterField(this.message, 51, 1, "H68FLGWK3");
/*     */      this.fields[9]=this.fieldE68RTRCCY=new CharacterField(this.message, 52, 3, "E68RTRCCY");
/*     */      this.fields[10]=this.fieldE68RTRDTE=new CharacterField(this.message, 55, 8, "E68RTRDTE");
/*     */      this.fields[11]=this.fieldE68RTRMUD=new CharacterField(this.message, 63, 3, "E68RTRMUD");
/*     */      this.fields[12]=this.fieldE68RTREXR=new DecimalField(this.message, 66, 13, 6, "E68RTREXR");
/*     */      this.fields[13]=this.fieldE68RTRKPR=new DecimalField(this.message, 79, 13, 6, "E68RTRKPR");
/*     */      this.fields[14]=this.fieldE68RTRKSR=new DecimalField(this.message, 92, 13, 6, "E68RTRKSR");
/*     */ 
/* 130 */     synchronized (tlookup)
/*     */     {
/* 132 */       if (tlookup.isEmpty())
/*     */       {
/* 134 */         for (int i = 0; i < tnames.length; i++) {
/* 135 */           tlookup.put(tnames[i], new Integer(i));
/*     */         }
/*     */       }
/*     */     }
/* 139 */     this.taglookup = tlookup;
/*     */   }
/*     */ 
/*     */   public void setH68USERID(String newvalue)
/*     */   {
/* 147 */     this.fieldH68USERID.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getH68USERID()
/*     */   {
/* 155 */     return this.fieldH68USERID.getString();
/*     */   }
/*     */ 
/*     */   public void setH68PROGRM(String newvalue)
/*     */   {
/* 163 */     this.fieldH68PROGRM.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getH68PROGRM()
/*     */   {
/* 171 */     return this.fieldH68PROGRM.getString();
/*     */   }
/*     */ 
/*     */   public void setH68TIMSYS(String newvalue)
/*     */   {
/* 179 */     this.fieldH68TIMSYS.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getH68TIMSYS()
/*     */   {
/* 187 */     return this.fieldH68TIMSYS.getString();
/*     */   }
/*     */ 
/*     */   public void setH68SCRCOD(String newvalue)
/*     */   {
/* 195 */     this.fieldH68SCRCOD.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getH68SCRCOD()
/*     */   {
/* 203 */     return this.fieldH68SCRCOD.getString();
/*     */   }
/*     */ 
/*     */   public void setH68OPECOD(String newvalue)
/*     */   {
/* 211 */     this.fieldH68OPECOD.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getH68OPECOD()
/*     */   {
/* 219 */     return this.fieldH68OPECOD.getString();
/*     */   }
/*     */ 
/*     */   public void setH68FLGMAS(String newvalue)
/*     */   {
/* 227 */     this.fieldH68FLGMAS.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getH68FLGMAS()
/*     */   {
/* 235 */     return this.fieldH68FLGMAS.getString();
/*     */   }
/*     */ 
/*     */   public void setH68FLGWK1(String newvalue)
/*     */   {
/* 243 */     this.fieldH68FLGWK1.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getH68FLGWK1()
/*     */   {
/* 251 */     return this.fieldH68FLGWK1.getString();
/*     */   }
/*     */ 
/*     */   public void setH68FLGWK2(String newvalue)
/*     */   {
/* 259 */     this.fieldH68FLGWK2.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getH68FLGWK2()
/*     */   {
/* 267 */     return this.fieldH68FLGWK2.getString();
/*     */   }
/*     */ 
/*     */   public void setH68FLGWK3(String newvalue)
/*     */   {
/* 275 */     this.fieldH68FLGWK3.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getH68FLGWK3()
/*     */   {
/* 283 */     return this.fieldH68FLGWK3.getString();
/*     */   }
/*     */ 
/*     */   public void setE68RTRCCY(String newvalue)
/*     */   {
/* 291 */     this.fieldE68RTRCCY.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getE68RTRCCY()
/*     */   {
/* 299 */     return this.fieldE68RTRCCY.getString();
/*     */   }
/*     */ 
/*     */   public void setE68RTRDTE(String newvalue)
/*     */   {
/* 307 */     this.fieldE68RTRDTE.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getE68RTRDTE()
/*     */   {
/* 315 */     return this.fieldE68RTRDTE.getString();
/*     */   }
/*     */ 
/*     */   public void setE68RTRMUD(String newvalue)
/*     */   {
/* 323 */     this.fieldE68RTRMUD.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getE68RTRMUD()
/*     */   {
/* 331 */     return this.fieldE68RTRMUD.getString();
/*     */   }
/*     */ 
/*     */   public void setE68RTREXR(String newvalue)
/*     */   {
/* 339 */     this.fieldE68RTREXR.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getE68RTREXR()
/*     */   {
/* 347 */     return this.fieldE68RTREXR.getString();
/*     */   }
/*     */ 
/*     */   public void setE68RTREXR(BigDecimal newvalue)
/*     */   {
/* 355 */     this.fieldE68RTREXR.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalE68RTREXR()
/*     */   {
/* 363 */     return this.fieldE68RTREXR.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setE68RTRKPR(String newvalue)
/*     */   {
/* 371 */     this.fieldE68RTRKPR.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getE68RTRKPR()
/*     */   {
/* 379 */     return this.fieldE68RTRKPR.getString();
/*     */   }
/*     */ 
/*     */   public void setE68RTRKPR(BigDecimal newvalue)
/*     */   {
/* 387 */     this.fieldE68RTRKPR.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalE68RTRKPR()
/*     */   {
/* 395 */     return this.fieldE68RTRKPR.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setE68RTRKSR(String newvalue)
/*     */   {
/* 403 */     this.fieldE68RTRKSR.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getE68RTRKSR()
/*     */   {
/* 411 */     return this.fieldE68RTRKSR.getString();
/*     */   }
/*     */ 
/*     */   public void setE68RTRKSR(BigDecimal newvalue)
/*     */   {
/* 419 */     this.fieldE68RTRKSR.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalE68RTRKSR()
/*     */   {
/* 427 */     return this.fieldE68RTRKSR.getBigDecimal();
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.IN036801Message
 * JD-Core Version:    0.6.0
 */