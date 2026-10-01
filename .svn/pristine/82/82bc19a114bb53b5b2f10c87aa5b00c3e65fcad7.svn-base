/*     */ package com.activo.gateway.dibs.messages;
/*     */ 
/*     */ import java.math.BigDecimal;
import java.util.Hashtable;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*     */ 
/*     */ public class ESMS01002Message extends MessageRecord
/*     */ {
/*  18 */   static final String[] fldnames = { 
/*  19 */     "H02USERID", 
/*  20 */     "H02PROGRM", 
/*  21 */     "H02TIMSYS", 
/*  22 */     "H02SCRCOD", 
/*  23 */     "H02OPECOD", 
/*  24 */     "H02FLGMAS", 
/*  25 */     "H02FLGWK1", 
/*  26 */     "H02FLGWK2", 
/*  27 */     "H02FLGWK3", 
/*  28 */     "E02AFICUN", 
/*  29 */     "E02AFIIDN", 
/*  30 */     "E02AFICLI", 
/*  31 */     "E02AFIPHN", 
/*  32 */     "E02AFICNL", 
/*  33 */     "E02AFIOPE", 
/*  34 */     "E02AFISTS", 
/*  35 */     "E02AFINCC", 
/*  36 */     "E02AFIDSC" };
/*     */ 
/*  38 */   static final String[] tnames = { 
/*  39 */     "H02USERID", 
/*  40 */     "H02PROGRM", 
/*  41 */     "H02TIMSYS", 
/*  42 */     "H02SCRCOD", 
/*  43 */     "H02OPECOD", 
/*  44 */     "H02FLGMAS", 
/*  45 */     "H02FLGWK1", 
/*  46 */     "H02FLGWK2", 
/*  47 */     "H02FLGWK3", 
/*  48 */     "E02AFICUN", 
/*  49 */     "E02AFIIDN", 
/*  50 */     "E02AFICLI", 
/*  51 */     "E02AFIPHN", 
/*  52 */     "E02AFICNL", 
/*  53 */     "E02AFIOPE", 
/*  54 */     "E02AFISTS", 
/*  55 */     "E02AFINCC", 
/*  56 */     "E02AFIDSC" };
/*     */   static final String fid = "1101015123305";
/*     */   static final String rid = "423C953B17C2F";
/*     */   static final String fmtname = "ESMS01002";
/*  61 */   final int FIELDCOUNT = 18;
/*  62 */   private static Hashtable tlookup = new Hashtable();
/*  63 */   private CharacterField fieldH02USERID = null;
/*  64 */   private CharacterField fieldH02PROGRM = null;
/*  65 */   private CharacterField fieldH02TIMSYS = null;
/*  66 */   private CharacterField fieldH02SCRCOD = null;
/*  67 */   private CharacterField fieldH02OPECOD = null;
/*  68 */   private CharacterField fieldH02FLGMAS = null;
/*  69 */   private CharacterField fieldH02FLGWK1 = null;
/*  70 */   private CharacterField fieldH02FLGWK2 = null;
/*  71 */   private CharacterField fieldH02FLGWK3 = null;
/*  72 */   private DecimalField fieldE02AFICUN = null;
/*  73 */   private CharacterField fieldE02AFIIDN = null;
/*  74 */   private CharacterField fieldE02AFICLI = null;
/*  75 */   private DecimalField fieldE02AFIPHN = null;
/*  76 */   private CharacterField fieldE02AFICNL = null;
/*  77 */   private DecimalField fieldE02AFIOPE = null;
/*  78 */   private CharacterField fieldE02AFISTS = null;
/*  79 */   private DecimalField fieldE02AFINCC = null;
/*  80 */   private CharacterField fieldE02AFIDSC = null;
/*     */ 
/*     */   public ESMS01002Message()
/*     */   {
/*  87 */     createFields();
/*  88 */     initialize();
/*     */   }
/*     */ 
/*     */   protected void createFields()
/*     */   {
/*  97 */     this.recordsize = 192;
/*  98 */     this.fileid = "1101015123305";
/*  99 */     this.recordid = "423C953B17C2F";
/* 100 */     this.message = new byte[getByteLength()];
/* 101 */     this.formatname = "ESMS01002";
/* 102 */     this.fieldnames = fldnames;
/* 103 */     this.tagnames = tnames;
/* 104 */     this.fields = new MessageField[18];
/*     */      this.fields[0]=this.fieldH02USERID=new CharacterField(this.message, 10, 10, "H02USERID");
/*     */      this.fields[1]=this.fieldH02PROGRM=new CharacterField(this.message, 20, 10, "H02PROGRM");
/*     */      this.fields[2]=this.fieldH02TIMSYS=new CharacterField(this.message, 30, 12, "H02TIMSYS");
/*     */      this.fields[3]=this.fieldH02SCRCOD=new CharacterField(this.message, 42, 2, "H02SCRCOD");
/*     */      this.fields[4]=this.fieldH02OPECOD=new CharacterField(this.message, 44, 4, "H02OPECOD");
/*     */      this.fields[5]=this.fieldH02FLGMAS=new CharacterField(this.message, 48, 1, "H02FLGMAS");
/*     */      this.fields[6]=this.fieldH02FLGWK1=new CharacterField(this.message, 49, 1, "H02FLGWK1");
/*     */      this.fields[7]=this.fieldH02FLGWK2=new CharacterField(this.message, 50, 1, "H02FLGWK2");
/*     */      this.fields[8]=this.fieldH02FLGWK3=new CharacterField(this.message, 51, 1, "H02FLGWK3");
/*     */      this.fields[9]=this.fieldE02AFICUN=new DecimalField(this.message, 52, 10, 0, "E02AFICUN");
/*     */      this.fields[10]=this.fieldE02AFIIDN=new CharacterField(this.message, 62, 15, "E02AFIIDN");
/*     */      this.fields[11]=this.fieldE02AFICLI=new CharacterField(this.message, 77, 45, "E02AFICLI");
/*     */      this.fields[12]=this.fieldE02AFIPHN=new DecimalField(this.message, 122, 12, 0, "E02AFIPHN");
/*     */      this.fields[13]=this.fieldE02AFICNL=new CharacterField(this.message, 134, 1, "E02AFICNL");
/*     */      this.fields[14]=this.fieldE02AFIOPE=new DecimalField(this.message, 135, 3, 0, "E02AFIOPE");
/*     */      this.fields[15]=this.fieldE02AFISTS=new CharacterField(this.message, 138, 1, "E02AFISTS");
/*     */      this.fields[16]=this.fieldE02AFINCC=new DecimalField(this.message, 139, 13, 0, "E02AFINCC");
/*     */      this.fields[17]=this.fieldE02AFIDSC=new CharacterField(this.message, 152, 50, "E02AFIDSC");
/*     */ 
/* 143 */     synchronized (tlookup)
/*     */     {
/* 145 */       if (tlookup.isEmpty())
/*     */       {
/* 147 */         for (int i = 0; i < tnames.length; i++) {
/* 148 */           tlookup.put(tnames[i], new Integer(i));
/*     */         }
/*     */       }
/*     */     }
/* 152 */     this.taglookup = tlookup;
/*     */   }
/*     */ 
/*     */   public void setH02USERID(String newvalue)
/*     */   {
/* 160 */     this.fieldH02USERID.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getH02USERID()
/*     */   {
/* 168 */     return this.fieldH02USERID.getString();
/*     */   }
/*     */ 
/*     */   public void setH02PROGRM(String newvalue)
/*     */   {
/* 176 */     this.fieldH02PROGRM.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getH02PROGRM()
/*     */   {
/* 184 */     return this.fieldH02PROGRM.getString();
/*     */   }
/*     */ 
/*     */   public void setH02TIMSYS(String newvalue)
/*     */   {
/* 192 */     this.fieldH02TIMSYS.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getH02TIMSYS()
/*     */   {
/* 200 */     return this.fieldH02TIMSYS.getString();
/*     */   }
/*     */ 
/*     */   public void setH02SCRCOD(String newvalue)
/*     */   {
/* 208 */     this.fieldH02SCRCOD.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getH02SCRCOD()
/*     */   {
/* 216 */     return this.fieldH02SCRCOD.getString();
/*     */   }
/*     */ 
/*     */   public void setH02OPECOD(String newvalue)
/*     */   {
/* 224 */     this.fieldH02OPECOD.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getH02OPECOD()
/*     */   {
/* 232 */     return this.fieldH02OPECOD.getString();
/*     */   }
/*     */ 
/*     */   public void setH02FLGMAS(String newvalue)
/*     */   {
/* 240 */     this.fieldH02FLGMAS.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getH02FLGMAS()
/*     */   {
/* 248 */     return this.fieldH02FLGMAS.getString();
/*     */   }
/*     */ 
/*     */   public void setH02FLGWK1(String newvalue)
/*     */   {
/* 256 */     this.fieldH02FLGWK1.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getH02FLGWK1()
/*     */   {
/* 264 */     return this.fieldH02FLGWK1.getString();
/*     */   }
/*     */ 
/*     */   public void setH02FLGWK2(String newvalue)
/*     */   {
/* 272 */     this.fieldH02FLGWK2.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getH02FLGWK2()
/*     */   {
/* 280 */     return this.fieldH02FLGWK2.getString();
/*     */   }
/*     */ 
/*     */   public void setH02FLGWK3(String newvalue)
/*     */   {
/* 288 */     this.fieldH02FLGWK3.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getH02FLGWK3()
/*     */   {
/* 296 */     return this.fieldH02FLGWK3.getString();
/*     */   }
/*     */ 
/*     */   public void setE02AFICUN(String newvalue)
/*     */   {
/* 304 */     this.fieldE02AFICUN.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getE02AFICUN()
/*     */   {
/* 312 */     return this.fieldE02AFICUN.getString();
/*     */   }
/*     */ 
/*     */   public void setE02AFICUN(BigDecimal newvalue)
/*     */   {
/* 320 */     this.fieldE02AFICUN.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalE02AFICUN()
/*     */   {
/* 328 */     return this.fieldE02AFICUN.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setE02AFIIDN(String newvalue)
/*     */   {
/* 336 */     this.fieldE02AFIIDN.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getE02AFIIDN()
/*     */   {
/* 344 */     return this.fieldE02AFIIDN.getString();
/*     */   }
/*     */ 
/*     */   public void setE02AFICLI(String newvalue)
/*     */   {
/* 352 */     this.fieldE02AFICLI.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getE02AFICLI()
/*     */   {
/* 360 */     return this.fieldE02AFICLI.getString();
/*     */   }
/*     */ 
/*     */   public void setE02AFIPHN(String newvalue)
/*     */   {
/* 368 */     this.fieldE02AFIPHN.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getE02AFIPHN()
/*     */   {
/* 376 */     return this.fieldE02AFIPHN.getString();
/*     */   }
/*     */ 
/*     */   public void setE02AFIPHN(BigDecimal newvalue)
/*     */   {
/* 384 */     this.fieldE02AFIPHN.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalE02AFIPHN()
/*     */   {
/* 392 */     return this.fieldE02AFIPHN.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setE02AFICNL(String newvalue)
/*     */   {
/* 400 */     this.fieldE02AFICNL.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getE02AFICNL()
/*     */   {
/* 408 */     return this.fieldE02AFICNL.getString();
/*     */   }
/*     */ 
/*     */   public void setE02AFIOPE(String newvalue)
/*     */   {
/* 416 */     this.fieldE02AFIOPE.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getE02AFIOPE()
/*     */   {
/* 424 */     return this.fieldE02AFIOPE.getString();
/*     */   }
/*     */ 
/*     */   public void setE02AFIOPE(BigDecimal newvalue)
/*     */   {
/* 432 */     this.fieldE02AFIOPE.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalE02AFIOPE()
/*     */   {
/* 440 */     return this.fieldE02AFIOPE.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setE02AFISTS(String newvalue)
/*     */   {
/* 448 */     this.fieldE02AFISTS.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getE02AFISTS()
/*     */   {
/* 456 */     return this.fieldE02AFISTS.getString();
/*     */   }
/*     */ 
/*     */   public void setE02AFINCC(String newvalue)
/*     */   {
/* 464 */     this.fieldE02AFINCC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getE02AFINCC()
/*     */   {
/* 472 */     return this.fieldE02AFINCC.getString();
/*     */   }
/*     */ 
/*     */   public void setE02AFINCC(BigDecimal newvalue)
/*     */   {
/* 480 */     this.fieldE02AFINCC.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalE02AFINCC()
/*     */   {
/* 488 */     return this.fieldE02AFINCC.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setE02AFIDSC(String newvalue)
/*     */   {
/* 496 */     this.fieldE02AFIDSC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getE02AFIDSC()
/*     */   {
/* 504 */     return this.fieldE02AFIDSC.getString();
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.ESMS01002Message
 * JD-Core Version:    0.6.0
 */