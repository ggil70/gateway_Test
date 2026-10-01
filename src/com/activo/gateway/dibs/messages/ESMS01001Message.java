/*     */ package com.activo.gateway.dibs.messages;
/*     */ 
/*     */ import java.util.Hashtable;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*     */ 
/*     */ public class ESMS01001Message extends MessageRecord
/*     */ {
/*  19 */   static final String[] fldnames = { 
/*  20 */     "H01USERID", 
/*  21 */     "H01PROGRM", 
/*  22 */     "H01TIMSYS", 
/*  23 */     "H01SCRCOD", 
/*  24 */     "H01OPECOD", 
/*  25 */     "H01FLGMAS", 
/*  26 */     "H01FLGWK1", 
/*  27 */     "H01FLGWK2", 
/*  28 */     "H01FLGWK3", 
/*  29 */     "E01CODTRN", 
/*  30 */     "E01NARTRN" };
/*     */ 
/*  32 */   static final String[] tnames = { 
/*  33 */     "H01USERID", 
/*  34 */     "H01PROGRM", 
/*  35 */     "H01TIMSYS", 
/*  36 */     "H01SCRCOD", 
/*  37 */     "H01OPECOD", 
/*  38 */     "H01FLGMAS", 
/*  39 */     "H01FLGWK1", 
/*  40 */     "H01FLGWK2", 
/*  41 */     "H01FLGWK3", 
/*  42 */     "E01CODTRN", 
/*  43 */     "E01NARTRN" };
/*     */   static final String fid = "1100830163327";
/*     */   static final String rid = "56383E6D8B7DE";
/*     */   static final String fmtname = "ESMS01001";
/*  48 */   final int FIELDCOUNT = 11;
/*  49 */   private static Hashtable tlookup = new Hashtable();
/*  50 */   private CharacterField fieldH01USERID = null;
/*  51 */   private CharacterField fieldH01PROGRM = null;
/*  52 */   private CharacterField fieldH01TIMSYS = null;
/*  53 */   private CharacterField fieldH01SCRCOD = null;
/*  54 */   private CharacterField fieldH01OPECOD = null;
/*  55 */   private CharacterField fieldH01FLGMAS = null;
/*  56 */   private CharacterField fieldH01FLGWK1 = null;
/*  57 */   private CharacterField fieldH01FLGWK2 = null;
/*  58 */   private CharacterField fieldH01FLGWK3 = null;
/*  59 */   private CharacterField fieldE01CODTRN = null;
/*  60 */   private CharacterField fieldE01NARTRN = null;
/*     */ 
/*     */   public ESMS01001Message()
/*     */   {
/*  67 */     createFields();
/*  68 */     initialize();
/*     */   }
/*     */ 
/*     */   protected void createFields()
/*     */   {
/*  77 */     this.recordsize = 81;
/*  78 */     this.fileid = "1100830163327";
/*  79 */     this.recordid = "56383E6D8B7DE";
/*  80 */     this.message = new byte[getByteLength()];
/*  81 */     this.formatname = "ESMS01001";
/*  82 */     this.fieldnames = fldnames;
/*  83 */     this.tagnames = tnames;
/*  84 */     this.fields = new MessageField[11];
/*     */      this.fields[0]=this.fieldH01USERID=new CharacterField(this.message, 10, 10, "H01USERID");
/*     */      this.fields[1]=this.fieldH01PROGRM=new CharacterField(this.message, 20, 10, "H01PROGRM");
/*     */      this.fields[2]=this.fieldH01TIMSYS=new CharacterField(this.message, 30, 12, "H01TIMSYS");
/*     */      this.fields[3]=this.fieldH01SCRCOD=new CharacterField(this.message, 42, 2, "H01SCRCOD");
/*     */      this.fields[4]=this.fieldH01OPECOD=new CharacterField(this.message, 44, 4, "H01OPECOD");
/*     */      this.fields[5]=this.fieldH01FLGMAS=new CharacterField(this.message, 48, 1, "H01FLGMAS");
/*     */      this.fields[6]=this.fieldH01FLGWK1=new CharacterField(this.message, 49, 1, "H01FLGWK1");
/*     */      this.fields[7]=this.fieldH01FLGWK2=new CharacterField(this.message, 50, 1, "H01FLGWK2");
/*     */      this.fields[8]=this.fieldH01FLGWK3=new CharacterField(this.message, 51, 1, "H01FLGWK3");
/*     */      this.fields[9]=this.fieldE01CODTRN=new CharacterField(this.message, 52, 4, "E01CODTRN");
/*     */      this.fields[10]=this.fieldE01NARTRN=new CharacterField(this.message, 56, 35, "E01NARTRN");
/*     */ 
/* 109 */     synchronized (tlookup)
/*     */     {
/* 111 */       if (tlookup.isEmpty())
/*     */       {
/* 113 */         for (int i = 0; i < tnames.length; i++) {
/* 114 */           tlookup.put(tnames[i], new Integer(i));
/*     */         }
/*     */       }
/*     */     }
/* 118 */     this.taglookup = tlookup;
/*     */   }
/*     */ 
/*     */   public void setH01USERID(String newvalue)
/*     */   {
/* 126 */     this.fieldH01USERID.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getH01USERID()
/*     */   {
/* 134 */     return this.fieldH01USERID.getString();
/*     */   }
/*     */ 
/*     */   public void setH01PROGRM(String newvalue)
/*     */   {
/* 142 */     this.fieldH01PROGRM.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getH01PROGRM()
/*     */   {
/* 150 */     return this.fieldH01PROGRM.getString();
/*     */   }
/*     */ 
/*     */   public void setH01TIMSYS(String newvalue)
/*     */   {
/* 158 */     this.fieldH01TIMSYS.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getH01TIMSYS()
/*     */   {
/* 166 */     return this.fieldH01TIMSYS.getString();
/*     */   }
/*     */ 
/*     */   public void setH01SCRCOD(String newvalue)
/*     */   {
/* 174 */     this.fieldH01SCRCOD.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getH01SCRCOD()
/*     */   {
/* 182 */     return this.fieldH01SCRCOD.getString();
/*     */   }
/*     */ 
/*     */   public void setH01OPECOD(String newvalue)
/*     */   {
/* 190 */     this.fieldH01OPECOD.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getH01OPECOD()
/*     */   {
/* 198 */     return this.fieldH01OPECOD.getString();
/*     */   }
/*     */ 
/*     */   public void setH01FLGMAS(String newvalue)
/*     */   {
/* 206 */     this.fieldH01FLGMAS.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getH01FLGMAS()
/*     */   {
/* 214 */     return this.fieldH01FLGMAS.getString();
/*     */   }
/*     */ 
/*     */   public void setH01FLGWK1(String newvalue)
/*     */   {
/* 222 */     this.fieldH01FLGWK1.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getH01FLGWK1()
/*     */   {
/* 230 */     return this.fieldH01FLGWK1.getString();
/*     */   }
/*     */ 
/*     */   public void setH01FLGWK2(String newvalue)
/*     */   {
/* 238 */     this.fieldH01FLGWK2.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getH01FLGWK2()
/*     */   {
/* 246 */     return this.fieldH01FLGWK2.getString();
/*     */   }
/*     */ 
/*     */   public void setH01FLGWK3(String newvalue)
/*     */   {
/* 254 */     this.fieldH01FLGWK3.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getH01FLGWK3()
/*     */   {
/* 262 */     return this.fieldH01FLGWK3.getString();
/*     */   }
/*     */ 
/*     */   public void setE01CODTRN(String newvalue)
/*     */   {
/* 270 */     this.fieldE01CODTRN.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getE01CODTRN()
/*     */   {
/* 278 */     return this.fieldE01CODTRN.getString();
/*     */   }
/*     */ 
/*     */   public void setE01NARTRN(String newvalue)
/*     */   {
/* 286 */     this.fieldE01NARTRN.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getE01NARTRN()
/*     */   {
/* 294 */     return this.fieldE01NARTRN.getString();
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.ESMS01001Message
 * JD-Core Version:    0.6.0
 */