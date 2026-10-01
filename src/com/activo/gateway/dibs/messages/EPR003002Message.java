/*     */ package com.activo.gateway.dibs.messages;
/*     */ 
/*     */ import java.math.BigDecimal;
import java.util.Hashtable;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*     */ 
/*     */ public class EPR003002Message extends MessageRecord
/*     */ {
/*  20 */   static final String[] fldnames = { 
/*  21 */     "H02USERID", 
/*  22 */     "H02PROGRM", 
/*  23 */     "H02TIMSYS", 
/*  24 */     "H02SCRCOD", 
/*  25 */     "H02OPECOD", 
/*  26 */     "H02FLGMAS", 
/*  27 */     "H02FLGWK1", 
/*  28 */     "H02FLGWK2", 
/*  29 */     "H02FLGWK3", 
/*  30 */     "E02PRCREF", 
/*  31 */     "E02PRCDAC", 
/*  32 */     "E02PRCDT1", 
/*  33 */     "E02PRCDT2", 
/*  34 */     "E02PRCDT3", 
/*  35 */     "E02PRCAMT", 
/*  36 */     "E02PRCRCD", 
/*  37 */     "E02PRCERR", 
/*  38 */     "E02ACTION" };
/*     */ 
/*  40 */   static final String[] tnames = { 
/*  41 */     "H02USERID", 
/*  42 */     "H02PROGRM", 
/*  43 */     "H02TIMSYS", 
/*  44 */     "H02SCRCOD", 
/*  45 */     "H02OPECOD", 
/*  46 */     "H02FLGMAS", 
/*  47 */     "H02FLGWK1", 
/*  48 */     "H02FLGWK2", 
/*  49 */     "H02FLGWK3", 
/*  50 */     "E02PRCREF", 
/*  51 */     "E02PRCDAC", 
/*  52 */     "E02PRCDT1", 
/*  53 */     "E02PRCDT2", 
/*  54 */     "E02PRCDT3", 
/*  55 */     "E02PRCAMT", 
/*  56 */     "E02PRCRCD", 
/*  57 */     "E02PRCERR", 
/*  58 */     "E02ACTION" };
/*     */   static final String fid = "1060106175112";
/*     */   static final String rid = "4CBFD8B015199";
/*     */   static final String fmtname = "EPR003002";
/*  63 */   final int FIELDCOUNT = 18;
/*  64 */   private static Hashtable tlookup = new Hashtable();
/*  65 */   private CharacterField fieldH02USERID = null;
/*  66 */   private CharacterField fieldH02PROGRM = null;
/*  67 */   private CharacterField fieldH02TIMSYS = null;
/*  68 */   private CharacterField fieldH02SCRCOD = null;
/*  69 */   private CharacterField fieldH02OPECOD = null;
/*  70 */   private CharacterField fieldH02FLGMAS = null;
/*  71 */   private CharacterField fieldH02FLGWK1 = null;
/*  72 */   private CharacterField fieldH02FLGWK2 = null;
/*  73 */   private CharacterField fieldH02FLGWK3 = null;
/*  74 */   private CharacterField fieldE02PRCREF = null;
/*  75 */   private DecimalField fieldE02PRCDAC = null;
/*  76 */   private DecimalField fieldE02PRCDT1 = null;
/*  77 */   private DecimalField fieldE02PRCDT2 = null;
/*  78 */   private DecimalField fieldE02PRCDT3 = null;
/*  79 */   private DecimalField fieldE02PRCAMT = null;
/*  80 */   private DecimalField fieldE02PRCRCD = null;
/*  81 */   private CharacterField fieldE02PRCERR = null;
/*  82 */   private CharacterField fieldE02ACTION = null;
/*     */ 
/*     */   public EPR003002Message()
/*     */   {
/*  89 */     createFields();
/*  90 */     initialize();
/*     */   }
/*     */ 
/*     */   protected void createFields()
/*     */   {
/*  99 */     this.recordsize = 121;
/* 100 */     this.fileid = "1060106175112";
/* 101 */     this.recordid = "4CBFD8B015199";
/* 102 */     this.message = new byte[getByteLength()];
/* 103 */     this.formatname = "EPR003002";
/* 104 */     this.fieldnames = fldnames;
/* 105 */     this.tagnames = tnames;
/* 106 */     this.fields = new MessageField[18];
/*     */      this.fields[0]=this.fieldH02USERID=new CharacterField(this.message, 10, 10, "H02USERID");
/*     */      this.fields[1]=this.fieldH02PROGRM=new CharacterField(this.message, 20, 10, "H02PROGRM");
/*     */      this.fields[2]=this.fieldH02TIMSYS=new CharacterField(this.message, 30, 12, "H02TIMSYS");
/*     */      this.fields[3]=this.fieldH02SCRCOD=new CharacterField(this.message, 42, 2, "H02SCRCOD");
/*     */      this.fields[4]=this.fieldH02OPECOD=new CharacterField(this.message, 44, 4, "H02OPECOD");
/*     */      this.fields[5]=this.fieldH02FLGMAS=new CharacterField(this.message, 48, 1, "H02FLGMAS");
/*     */      this.fields[6]=this.fieldH02FLGWK1=new CharacterField(this.message, 49, 1, "H02FLGWK1");
/*     */      this.fields[7]=this.fieldH02FLGWK2=new CharacterField(this.message, 50, 1, "H02FLGWK2");
/*     */      this.fields[8]=this.fieldH02FLGWK3=new CharacterField(this.message, 51, 1, "H02FLGWK3");
/*     */      this.fields[9]=this.fieldE02PRCREF=new CharacterField(this.message, 52, 20, "E02PRCREF");
/*     */      this.fields[10]=this.fieldE02PRCDAC=new DecimalField(this.message, 72, 10, 0, "E02PRCDAC");
/*     */      this.fields[11]=this.fieldE02PRCDT1=new DecimalField(this.message, 82, 3, 0, "E02PRCDT1");
/*     */      this.fields[12]=this.fieldE02PRCDT2=new DecimalField(this.message, 85, 3, 0, "E02PRCDT2");
/*     */      this.fields[13]=this.fieldE02PRCDT3=new DecimalField(this.message, 88, 3, 0, "E02PRCDT3");
/*     */      this.fields[14]=this.fieldE02PRCAMT=new DecimalField(this.message, 91, 15, 2, "E02PRCAMT");
/*     */      this.fields[15]=this.fieldE02PRCRCD=new DecimalField(this.message, 106, 4, 0, "E02PRCRCD");
/*     */      this.fields[16]=this.fieldE02PRCERR=new CharacterField(this.message, 110, 20, "E02PRCERR");
/*     */      this.fields[17]=this.fieldE02ACTION=new CharacterField(this.message, 130, 1, "E02ACTION");
/*     */ 
/* 145 */     synchronized (tlookup)
/*     */     {
/* 147 */       if (tlookup.isEmpty())
/*     */       {
/* 149 */         for (int i = 0; i < tnames.length; i++) {
/* 150 */           tlookup.put(tnames[i], new Integer(i));
/*     */         }
/*     */       }
/*     */     }
/* 154 */     this.taglookup = tlookup;
/*     */   }
/*     */ 
/*     */   public void setH02USERID(String newvalue)
/*     */   {
/* 162 */     this.fieldH02USERID.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getH02USERID()
/*     */   {
/* 170 */     return this.fieldH02USERID.getString();
/*     */   }
/*     */ 
/*     */   public void setH02PROGRM(String newvalue)
/*     */   {
/* 178 */     this.fieldH02PROGRM.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getH02PROGRM()
/*     */   {
/* 186 */     return this.fieldH02PROGRM.getString();
/*     */   }
/*     */ 
/*     */   public void setH02TIMSYS(String newvalue)
/*     */   {
/* 194 */     this.fieldH02TIMSYS.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getH02TIMSYS()
/*     */   {
/* 202 */     return this.fieldH02TIMSYS.getString();
/*     */   }
/*     */ 
/*     */   public void setH02SCRCOD(String newvalue)
/*     */   {
/* 210 */     this.fieldH02SCRCOD.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getH02SCRCOD()
/*     */   {
/* 218 */     return this.fieldH02SCRCOD.getString();
/*     */   }
/*     */ 
/*     */   public void setH02OPECOD(String newvalue)
/*     */   {
/* 226 */     this.fieldH02OPECOD.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getH02OPECOD()
/*     */   {
/* 234 */     return this.fieldH02OPECOD.getString();
/*     */   }
/*     */ 
/*     */   public void setH02FLGMAS(String newvalue)
/*     */   {
/* 242 */     this.fieldH02FLGMAS.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getH02FLGMAS()
/*     */   {
/* 250 */     return this.fieldH02FLGMAS.getString();
/*     */   }
/*     */ 
/*     */   public void setH02FLGWK1(String newvalue)
/*     */   {
/* 258 */     this.fieldH02FLGWK1.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getH02FLGWK1()
/*     */   {
/* 266 */     return this.fieldH02FLGWK1.getString();
/*     */   }
/*     */ 
/*     */   public void setH02FLGWK2(String newvalue)
/*     */   {
/* 274 */     this.fieldH02FLGWK2.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getH02FLGWK2()
/*     */   {
/* 282 */     return this.fieldH02FLGWK2.getString();
/*     */   }
/*     */ 
/*     */   public void setH02FLGWK3(String newvalue)
/*     */   {
/* 290 */     this.fieldH02FLGWK3.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getH02FLGWK3()
/*     */   {
/* 298 */     return this.fieldH02FLGWK3.getString();
/*     */   }
/*     */ 
/*     */   public void setE02PRCREF(String newvalue)
/*     */   {
/* 306 */     this.fieldE02PRCREF.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getE02PRCREF()
/*     */   {
/* 314 */     return this.fieldE02PRCREF.getString();
/*     */   }
/*     */ 
/*     */   public void setE02PRCDAC(String newvalue)
/*     */   {
/* 322 */     this.fieldE02PRCDAC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getE02PRCDAC()
/*     */   {
/* 330 */     return this.fieldE02PRCDAC.getString();
/*     */   }
/*     */ 
/*     */   public void setE02PRCDAC(BigDecimal newvalue)
/*     */   {
/* 338 */     this.fieldE02PRCDAC.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalE02PRCDAC()
/*     */   {
/* 346 */     return this.fieldE02PRCDAC.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setE02PRCDT1(String newvalue)
/*     */   {
/* 354 */     this.fieldE02PRCDT1.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getE02PRCDT1()
/*     */   {
/* 362 */     return this.fieldE02PRCDT1.getString();
/*     */   }
/*     */ 
/*     */   public void setE02PRCDT1(BigDecimal newvalue)
/*     */   {
/* 370 */     this.fieldE02PRCDT1.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalE02PRCDT1()
/*     */   {
/* 378 */     return this.fieldE02PRCDT1.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setE02PRCDT2(String newvalue)
/*     */   {
/* 386 */     this.fieldE02PRCDT2.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getE02PRCDT2()
/*     */   {
/* 394 */     return this.fieldE02PRCDT2.getString();
/*     */   }
/*     */ 
/*     */   public void setE02PRCDT2(BigDecimal newvalue)
/*     */   {
/* 402 */     this.fieldE02PRCDT2.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalE02PRCDT2()
/*     */   {
/* 410 */     return this.fieldE02PRCDT2.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setE02PRCDT3(String newvalue)
/*     */   {
/* 418 */     this.fieldE02PRCDT3.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getE02PRCDT3()
/*     */   {
/* 426 */     return this.fieldE02PRCDT3.getString();
/*     */   }
/*     */ 
/*     */   public void setE02PRCDT3(BigDecimal newvalue)
/*     */   {
/* 434 */     this.fieldE02PRCDT3.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalE02PRCDT3()
/*     */   {
/* 442 */     return this.fieldE02PRCDT3.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setE02PRCAMT(String newvalue)
/*     */   {
/* 450 */     this.fieldE02PRCAMT.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getE02PRCAMT()
/*     */   {
/* 458 */     return this.fieldE02PRCAMT.getString();
/*     */   }
/*     */ 
/*     */   public void setE02PRCAMT(BigDecimal newvalue)
/*     */   {
/* 466 */     this.fieldE02PRCAMT.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalE02PRCAMT()
/*     */   {
/* 474 */     return this.fieldE02PRCAMT.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setE02PRCRCD(String newvalue)
/*     */   {
/* 482 */     this.fieldE02PRCRCD.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getE02PRCRCD()
/*     */   {
/* 490 */     return this.fieldE02PRCRCD.getString();
/*     */   }
/*     */ 
/*     */   public void setE02PRCRCD(BigDecimal newvalue)
/*     */   {
/* 498 */     this.fieldE02PRCRCD.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalE02PRCRCD()
/*     */   {
/* 506 */     return this.fieldE02PRCRCD.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setE02PRCERR(String newvalue)
/*     */   {
/* 514 */     this.fieldE02PRCERR.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getE02PRCERR()
/*     */   {
/* 522 */     return this.fieldE02PRCERR.getString();
/*     */   }
/*     */ 
/*     */   public void setE02ACTION(String newvalue)
/*     */   {
/* 530 */     this.fieldE02ACTION.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getE02ACTION()
/*     */   {
/* 538 */     return this.fieldE02ACTION.getString();
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.EPR003002Message
 * JD-Core Version:    0.6.0
 */