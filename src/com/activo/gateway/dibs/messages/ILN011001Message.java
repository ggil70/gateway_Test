/*     */ package com.activo.gateway.dibs.messages;
/*     */ 
/*     */ import java.math.BigDecimal;
import java.util.Hashtable;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*     */ 
/*     */ public class ILN011001Message extends MessageRecord
/*     */ {
/*  20 */   static final String[] fldnames = { 
/*  21 */     "LN10USER", 
/*  22 */     "LN10LNECUN", 
/*  23 */     "LN10LNENUM", 
/*  24 */     "LN10ACCTYP", 
/*  25 */     "LN10PRDCDE", 
/*  26 */     "LN10CURREN", 
/*  27 */     "LN10ACCNUM", 
/*  28 */     "LN10BALANC", 
/*  29 */     "LN10INTAMT", 
/*  30 */     "LN10DESCRI", 
/*  31 */     "LN10LNEMT1", 
/*  32 */     "LN10LNEMT2", 
/*  33 */     "LN10LNEMT3", 
/*  34 */     "LN10STATUS", 
/*  35 */     "LN10ACCNIK", 
/*  36 */     "LN10ENDMSG" };
/*     */ 
/*  38 */   static final String[] tnames = { 
/*  39 */     "LN10USER", 
/*  40 */     "LN10LNECUN", 
/*  41 */     "LN10LNENUM", 
/*  42 */     "LN10ACCTYP", 
/*  43 */     "LN10PRDCDE", 
/*  44 */     "LN10CURREN", 
/*  45 */     "LN10ACCNUM", 
/*  46 */     "LN10BALANC", 
/*  47 */     "LN10INTAMT", 
/*  48 */     "LN10DESCRI", 
/*  49 */     "LN10LNEMT1", 
/*  50 */     "LN10LNEMT2", 
/*  51 */     "LN10LNEMT3", 
/*  52 */     "LN10STATUS", 
/*  53 */     "LN10ACCNIK", 
/*  54 */     "LN10ENDMSG" };
/*     */   static final String fid = "1030211145123";
/*     */   static final String rid = "4359C141D3AD6";
/*     */   static final String fmtname = "ILN011001";
/*  59 */   final int FIELDCOUNT = 16;
/*  60 */   private static Hashtable tlookup = new Hashtable();
/*  61 */   private CharacterField fieldLN10USER = null;
/*  62 */   private DecimalField fieldLN10LNECUN = null;
/*  63 */   private DecimalField fieldLN10LNENUM = null;
/*  64 */   private CharacterField fieldLN10ACCTYP = null;
/*  65 */   private CharacterField fieldLN10PRDCDE = null;
/*  66 */   private CharacterField fieldLN10CURREN = null;
/*  67 */   private DecimalField fieldLN10ACCNUM = null;
/*  68 */   private DecimalField fieldLN10BALANC = null;
/*  69 */   private DecimalField fieldLN10INTAMT = null;
/*  70 */   private CharacterField fieldLN10DESCRI = null;
/*  71 */   private DecimalField fieldLN10LNEMT1 = null;
/*  72 */   private DecimalField fieldLN10LNEMT2 = null;
/*  73 */   private DecimalField fieldLN10LNEMT3 = null;
/*  74 */   private CharacterField fieldLN10STATUS = null;
/*  75 */   private CharacterField fieldLN10ACCNIK = null;
/*  76 */   private CharacterField fieldLN10ENDMSG = null;
/*     */ 
/*     */   public ILN011001Message()
/*     */   {
/*  83 */     createFields();
/*  84 */     initialize();
/*     */   }
/*     */ 
/*     */   protected void createFields()
/*     */   {
/*  93 */     this.recordsize = 154;
/*  94 */     this.fileid = "1030211145123";
/*  95 */     this.recordid = "4359C141D3AD6";
/*  96 */     this.message = new byte[getByteLength()];
/*  97 */     this.formatname = "ILN011001";
/*  98 */     this.fieldnames = fldnames;
/*  99 */     this.tagnames = tnames;
/* 100 */     this.fields = new MessageField[16];
/*     */      this.fields[0]=this.fieldLN10USER=new CharacterField(this.message, 10, 10, "LN10USER");
/*     */      this.fields[1]=this.fieldLN10LNECUN=new DecimalField(this.message, 20, 10, 0, "LN10LNECUN");
/*     */      this.fields[2]=this.fieldLN10LNENUM=new DecimalField(this.message, 30, 5, 0, "LN10LNENUM");
/*     */      this.fields[3]=this.fieldLN10ACCTYP=new CharacterField(this.message, 35, 4, "LN10ACCTYP");
/*     */      this.fields[4]=this.fieldLN10PRDCDE=new CharacterField(this.message, 39, 4, "LN10PRDCDE");
/*     */      this.fields[5]=this.fieldLN10CURREN=new CharacterField(this.message, 43, 3, "LN10CURREN");
/*     */      this.fields[6]=this.fieldLN10ACCNUM=new DecimalField(this.message, 46, 13, 0, "LN10ACCNUM");
/*     */      this.fields[7]=this.fieldLN10BALANC=new DecimalField(this.message, 59, 17, 2, "LN10BALANC");
/*     */      this.fields[8]=this.fieldLN10INTAMT=new DecimalField(this.message, 76, 17, 2, "LN10INTAMT");
/*     */      this.fields[9]=this.fieldLN10DESCRI=new CharacterField(this.message, 93, 30, "LN10DESCRI");
/*     */      this.fields[10]=this.fieldLN10LNEMT1=new DecimalField(this.message, 123, 3, 0, "LN10LNEMT1");
/*     */      this.fields[11]=this.fieldLN10LNEMT2=new DecimalField(this.message, 126, 3, 0, "LN10LNEMT2");
/*     */      this.fields[12]=this.fieldLN10LNEMT3=new DecimalField(this.message, 129, 3, 0, "LN10LNEMT3");
/*     */      this.fields[13]=this.fieldLN10STATUS=new CharacterField(this.message, 132, 1, "LN10STATUS");
/*     */      this.fields[14]=this.fieldLN10ACCNIK=new CharacterField(this.message, 133, 30, "LN10ACCNIK");
/*     */      this.fields[15]=this.fieldLN10ENDMSG=new CharacterField(this.message, 163, 1, "LN10ENDMSG");
/*     */ 
/* 135 */     synchronized (tlookup)
/*     */     {
/* 137 */       if (tlookup.isEmpty())
/*     */       {
/* 139 */         for (int i = 0; i < tnames.length; i++) {
/* 140 */           tlookup.put(tnames[i], new Integer(i));
/*     */         }
/*     */       }
/*     */     }
/* 144 */     this.taglookup = tlookup;
/*     */   }
/*     */ 
/*     */   public void setLN10USER(String newvalue)
/*     */   {
/* 152 */     this.fieldLN10USER.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getLN10USER()
/*     */   {
/* 160 */     return this.fieldLN10USER.getString();
/*     */   }
/*     */ 
/*     */   public void setLN10LNECUN(String newvalue)
/*     */   {
/* 168 */     this.fieldLN10LNECUN.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getLN10LNECUN()
/*     */   {
/* 176 */     return this.fieldLN10LNECUN.getString();
/*     */   }
/*     */ 
/*     */   public void setLN10LNECUN(BigDecimal newvalue)
/*     */   {
/* 184 */     this.fieldLN10LNECUN.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalLN10LNECUN()
/*     */   {
/* 192 */     return this.fieldLN10LNECUN.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setLN10LNENUM(String newvalue)
/*     */   {
/* 200 */     this.fieldLN10LNENUM.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getLN10LNENUM()
/*     */   {
/* 208 */     return this.fieldLN10LNENUM.getString();
/*     */   }
/*     */ 
/*     */   public void setLN10LNENUM(BigDecimal newvalue)
/*     */   {
/* 216 */     this.fieldLN10LNENUM.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalLN10LNENUM()
/*     */   {
/* 224 */     return this.fieldLN10LNENUM.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setLN10ACCTYP(String newvalue)
/*     */   {
/* 232 */     this.fieldLN10ACCTYP.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getLN10ACCTYP()
/*     */   {
/* 240 */     return this.fieldLN10ACCTYP.getString();
/*     */   }
/*     */ 
/*     */   public void setLN10PRDCDE(String newvalue)
/*     */   {
/* 248 */     this.fieldLN10PRDCDE.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getLN10PRDCDE()
/*     */   {
/* 256 */     return this.fieldLN10PRDCDE.getString();
/*     */   }
/*     */ 
/*     */   public void setLN10CURREN(String newvalue)
/*     */   {
/* 264 */     this.fieldLN10CURREN.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getLN10CURREN()
/*     */   {
/* 272 */     return this.fieldLN10CURREN.getString();
/*     */   }
/*     */ 
/*     */   public void setLN10ACCNUM(String newvalue)
/*     */   {
/* 280 */     this.fieldLN10ACCNUM.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getLN10ACCNUM()
/*     */   {
/* 288 */     return this.fieldLN10ACCNUM.getString();
/*     */   }
/*     */ 
/*     */   public void setLN10ACCNUM(BigDecimal newvalue)
/*     */   {
/* 296 */     this.fieldLN10ACCNUM.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalLN10ACCNUM()
/*     */   {
/* 304 */     return this.fieldLN10ACCNUM.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setLN10BALANC(String newvalue)
/*     */   {
/* 312 */     this.fieldLN10BALANC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getLN10BALANC()
/*     */   {
/* 320 */     return this.fieldLN10BALANC.getString();
/*     */   }
/*     */ 
/*     */   public void setLN10BALANC(BigDecimal newvalue)
/*     */   {
/* 328 */     this.fieldLN10BALANC.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalLN10BALANC()
/*     */   {
/* 336 */     return this.fieldLN10BALANC.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setLN10INTAMT(String newvalue)
/*     */   {
/* 344 */     this.fieldLN10INTAMT.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getLN10INTAMT()
/*     */   {
/* 352 */     return this.fieldLN10INTAMT.getString();
/*     */   }
/*     */ 
/*     */   public void setLN10INTAMT(BigDecimal newvalue)
/*     */   {
/* 360 */     this.fieldLN10INTAMT.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalLN10INTAMT()
/*     */   {
/* 368 */     return this.fieldLN10INTAMT.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setLN10DESCRI(String newvalue)
/*     */   {
/* 376 */     this.fieldLN10DESCRI.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getLN10DESCRI()
/*     */   {
/* 384 */     return this.fieldLN10DESCRI.getString();
/*     */   }
/*     */ 
/*     */   public void setLN10LNEMT1(String newvalue)
/*     */   {
/* 392 */     this.fieldLN10LNEMT1.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getLN10LNEMT1()
/*     */   {
/* 400 */     return this.fieldLN10LNEMT1.getString();
/*     */   }
/*     */ 
/*     */   public void setLN10LNEMT1(BigDecimal newvalue)
/*     */   {
/* 408 */     this.fieldLN10LNEMT1.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalLN10LNEMT1()
/*     */   {
/* 416 */     return this.fieldLN10LNEMT1.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setLN10LNEMT2(String newvalue)
/*     */   {
/* 424 */     this.fieldLN10LNEMT2.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getLN10LNEMT2()
/*     */   {
/* 432 */     return this.fieldLN10LNEMT2.getString();
/*     */   }
/*     */ 
/*     */   public void setLN10LNEMT2(BigDecimal newvalue)
/*     */   {
/* 440 */     this.fieldLN10LNEMT2.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalLN10LNEMT2()
/*     */   {
/* 448 */     return this.fieldLN10LNEMT2.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setLN10LNEMT3(String newvalue)
/*     */   {
/* 456 */     this.fieldLN10LNEMT3.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getLN10LNEMT3()
/*     */   {
/* 464 */     return this.fieldLN10LNEMT3.getString();
/*     */   }
/*     */ 
/*     */   public void setLN10LNEMT3(BigDecimal newvalue)
/*     */   {
/* 472 */     this.fieldLN10LNEMT3.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalLN10LNEMT3()
/*     */   {
/* 480 */     return this.fieldLN10LNEMT3.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setLN10STATUS(String newvalue)
/*     */   {
/* 488 */     this.fieldLN10STATUS.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getLN10STATUS()
/*     */   {
/* 496 */     return this.fieldLN10STATUS.getString();
/*     */   }
/*     */ 
/*     */   public void setLN10ACCNIK(String newvalue)
/*     */   {
/* 504 */     this.fieldLN10ACCNIK.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getLN10ACCNIK()
/*     */   {
/* 512 */     return this.fieldLN10ACCNIK.getString();
/*     */   }
/*     */ 
/*     */   public void setLN10ENDMSG(String newvalue)
/*     */   {
/* 520 */     this.fieldLN10ENDMSG.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getLN10ENDMSG()
/*     */   {
/* 528 */     return this.fieldLN10ENDMSG.getString();
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.ILN011001Message
 * JD-Core Version:    0.6.0
 */