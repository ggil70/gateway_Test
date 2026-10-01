/*     */ package com.activo.gateway.dibs.messages;
/*     */ 
/*     */ import java.util.Hashtable;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*     */ 
/*     */ public class EPR003001Message extends MessageRecord
/*     */ {
/*  18 */   static final String[] fldnames = { 
/*  19 */     "H01USERID", 
/*  20 */     "H01PROGRM", 
/*  21 */     "H01TIMSYS", 
/*  22 */     "H01SCRCOD", 
/*  23 */     "H01OPECOD", 
/*  24 */     "H01FLGMAS", 
/*  25 */     "H01FLGWK1", 
/*  26 */     "H01FLGWK2", 
/*  27 */     "H01FLGWK3", 
/*  28 */     "E01REF", 
/*  29 */     "E01DATA" };
/*     */ 
/*  31 */   static final String[] tnames = { 
/*  32 */     "H01USERID", 
/*  33 */     "H01PROGRM", 
/*  34 */     "H01TIMSYS", 
/*  35 */     "H01SCRCOD", 
/*  36 */     "H01OPECOD", 
/*  37 */     "H01FLGMAS", 
/*  38 */     "H01FLGWK1", 
/*  39 */     "H01FLGWK2", 
/*  40 */     "H01FLGWK3", 
/*  41 */     "E01REF", 
/*  42 */     "E01DATA" };
/*     */   static final String fid = "1060109175438";
/*     */   static final String rid = "406484FF2F8F2";
/*     */   static final String fmtname = "EPR003001";
/*  47 */   final int FIELDCOUNT = 11;
/*  48 */   private static Hashtable tlookup = new Hashtable();
/*  49 */   private CharacterField fieldH01USERID = null;
/*  50 */   private CharacterField fieldH01PROGRM = null;
/*  51 */   private CharacterField fieldH01TIMSYS = null;
/*  52 */   private CharacterField fieldH01SCRCOD = null;
/*  53 */   private CharacterField fieldH01OPECOD = null;
/*  54 */   private CharacterField fieldH01FLGMAS = null;
/*  55 */   private CharacterField fieldH01FLGWK1 = null;
/*  56 */   private CharacterField fieldH01FLGWK2 = null;
/*  57 */   private CharacterField fieldH01FLGWK3 = null;
/*  58 */   private CharacterField fieldE01REF = null;
/*  59 */   private CharacterField fieldE01DATA = null;
/*     */ 
/*     */   public EPR003001Message()
/*     */   {
/*  66 */     createFields();
/*  67 */     initialize();
/*     */   }
/*     */ 
/*     */   protected void createFields()
/*     */   {
/*  76 */     this.recordsize = 1060;
/*  77 */     this.fileid = "1060109175438";
/*  78 */     this.recordid = "406484FF2F8F2";
/*  79 */     this.message = new byte[getByteLength()];
/*  80 */     this.formatname = "EPR003001";
/*  81 */     this.fieldnames = fldnames;
/*  82 */     this.tagnames = tnames;
/*  83 */     this.fields = new MessageField[11];
/*     */      this.fields[0]=this.fieldH01USERID=new CharacterField(this.message, 10, 10, "H01USERID");
/*     */      this.fields[1]=this.fieldH01PROGRM=new CharacterField(this.message, 20, 10, "H01PROGRM");
/*     */      this.fields[2]=this.fieldH01TIMSYS=new CharacterField(this.message, 30, 12, "H01TIMSYS");
/*     */      this.fields[3]=this.fieldH01SCRCOD=new CharacterField(this.message, 42, 2, "H01SCRCOD");
/*     */      this.fields[4]=this.fieldH01OPECOD=new CharacterField(this.message, 44, 4, "H01OPECOD");
/*     */      this.fields[5]=this.fieldH01FLGMAS=new CharacterField(this.message, 48, 1, "H01FLGMAS");
/*     */      this.fields[6]=this.fieldH01FLGWK1=new CharacterField(this.message, 49, 1, "H01FLGWK1");
/*     */      this.fields[7]=this.fieldH01FLGWK2=new CharacterField(this.message, 50, 1, "H01FLGWK2");
/*     */      this.fields[8]=this.fieldH01FLGWK3=new CharacterField(this.message, 51, 1, "H01FLGWK3");
/*     */      this.fields[9]=this.fieldE01REF=new CharacterField(this.message, 52, 20, "E01REF");
/*     */      this.fields[10]=this.fieldE01DATA=new CharacterField(this.message, 72, 998, "E01DATA");
/*     */ 
/* 108 */     synchronized (tlookup)
/*     */     {
/* 110 */       if (tlookup.isEmpty())
/*     */       {
/* 112 */         for (int i = 0; i < tnames.length; i++) {
/* 113 */           tlookup.put(tnames[i], new Integer(i));
/*     */         }
/*     */       }
/*     */     }
/* 117 */     this.taglookup = tlookup;
/*     */   }
/*     */ 
/*     */   public void setH01USERID(String newvalue)
/*     */   {
/* 125 */     this.fieldH01USERID.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getH01USERID()
/*     */   {
/* 133 */     return this.fieldH01USERID.getString();
/*     */   }
/*     */ 
/*     */   public void setH01PROGRM(String newvalue)
/*     */   {
/* 141 */     this.fieldH01PROGRM.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getH01PROGRM()
/*     */   {
/* 149 */     return this.fieldH01PROGRM.getString();
/*     */   }
/*     */ 
/*     */   public void setH01TIMSYS(String newvalue)
/*     */   {
/* 157 */     this.fieldH01TIMSYS.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getH01TIMSYS()
/*     */   {
/* 165 */     return this.fieldH01TIMSYS.getString();
/*     */   }
/*     */ 
/*     */   public void setH01SCRCOD(String newvalue)
/*     */   {
/* 173 */     this.fieldH01SCRCOD.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getH01SCRCOD()
/*     */   {
/* 181 */     return this.fieldH01SCRCOD.getString();
/*     */   }
/*     */ 
/*     */   public void setH01OPECOD(String newvalue)
/*     */   {
/* 189 */     this.fieldH01OPECOD.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getH01OPECOD()
/*     */   {
/* 197 */     return this.fieldH01OPECOD.getString();
/*     */   }
/*     */ 
/*     */   public void setH01FLGMAS(String newvalue)
/*     */   {
/* 205 */     this.fieldH01FLGMAS.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getH01FLGMAS()
/*     */   {
/* 213 */     return this.fieldH01FLGMAS.getString();
/*     */   }
/*     */ 
/*     */   public void setH01FLGWK1(String newvalue)
/*     */   {
/* 221 */     this.fieldH01FLGWK1.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getH01FLGWK1()
/*     */   {
/* 229 */     return this.fieldH01FLGWK1.getString();
/*     */   }
/*     */ 
/*     */   public void setH01FLGWK2(String newvalue)
/*     */   {
/* 237 */     this.fieldH01FLGWK2.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getH01FLGWK2()
/*     */   {
/* 245 */     return this.fieldH01FLGWK2.getString();
/*     */   }
/*     */ 
/*     */   public void setH01FLGWK3(String newvalue)
/*     */   {
/* 253 */     this.fieldH01FLGWK3.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getH01FLGWK3()
/*     */   {
/* 261 */     return this.fieldH01FLGWK3.getString();
/*     */   }
/*     */ 
/*     */   public void setE01REF(String newvalue)
/*     */   {
/* 269 */     this.fieldE01REF.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getE01REF()
/*     */   {
/* 277 */     return this.fieldE01REF.getString();
/*     */   }
/*     */ 
/*     */   public void setE01DATA(String newvalue)
/*     */   {
/* 285 */     this.fieldE01DATA.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getE01DATA()
/*     */   {
/* 293 */     return this.fieldE01DATA.getString();
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.EPR003001Message
 * JD-Core Version:    0.6.0
 */