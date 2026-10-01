/*     */ package com.activo.gateway.dibs.messages;
/*     */ 
/*     */ import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;

/*     */ import java.math.BigDecimal;
import java.util.Hashtable;
/*     */ 
/*     */ public class INPYRLSJVMessage extends MessageRecord
/*     */ {
/*  20 */   static final String[] fldnames = { 
/*  21 */     "PYRUSR", 
/*  22 */     "PYRPID", 
/*  23 */     "PYROPC", 
/*  24 */     "PYREOF", 
/*  25 */     "PYRSTS", 
/*  26 */     "PYRTYP", 
/*  27 */     "PYRFLG", 
/*  28 */     "PYRACC", 
/*  29 */     "PYRAMT", 
/*  30 */     "PYRNUM", 
/*  31 */     "PYRVDD", 
/*  32 */     "PYRVDM", 
/*  33 */     "PYRVDY", 
/*  34 */     "PYRERD", 
/*  35 */     "PYRBNAM", 
/*  36 */     "PYRBAD1", 
/*  37 */     "PYRBAD2", 
/*  38 */     "PYRBAD3", 
/*  39 */     "PYRMEM1", 
/*  40 */     "PYRMEM2", 
/*  41 */     "PYRPTYP", 
/*  42 */     "PYRBACC", 
/*  43 */     "PYRBBNK", 
/*  44 */     "PYRBBKN", 
/*  45 */     "PYRBBKAD", 
/*  46 */     "PYRBBKA2", 
/*  47 */     "PYRIBKID", 
/*  48 */     "PYRIBKNM", 
/*  49 */     "PYRIBKAD", 
/*  50 */     "PYRIBKA2", 
/*  51 */     "PYRCCY" };
/*     */ 
/*  53 */   static final String[] tnames = { 
/*  54 */     "PYRUSR", 
/*  55 */     "PYRPID", 
/*  56 */     "PYROPC", 
/*  57 */     "PYREOF", 
/*  58 */     "PYRSTS", 
/*  59 */     "PYRTYP", 
/*  60 */     "PYRFLG", 
/*  61 */     "PYRACC", 
/*  62 */     "PYRAMT", 
/*  63 */     "PYRNUM", 
/*  64 */     "PYRVDD", 
/*  65 */     "PYRVDM", 
/*  66 */     "PYRVDY", 
/*  67 */     "PYRERD", 
/*  68 */     "PYRBNAM", 
/*  69 */     "PYRBAD1", 
/*  70 */     "PYRBAD2", 
/*  71 */     "PYRBAD3", 
/*  72 */     "PYRMEM1", 
/*  73 */     "PYRMEM2", 
/*  74 */     "PYRPTYP", 
/*  75 */     "PYRBACC", 
/*  76 */     "PYRBBNK", 
/*  77 */     "PYRBBKN", 
/*  78 */     "PYRBBKAD", 
/*  79 */     "PYRBBKA2", 
/*  80 */     "PYRIBKID", 
/*  81 */     "PYRIBKNM", 
/*  82 */     "PYRIBKAD", 
/*  83 */     "PYRIBKA2", 
/*  84 */     "PYRCCY" };
/*     */   static final String fid = "1100708150253";
/*     */   static final String rid = "42F3714404DB1";
/*     */   static final String fmtname = "INPYRLSJV";
/*  89 */   final int FIELDCOUNT = 31;
/*  90 */   private static Hashtable tlookup = new Hashtable();
/*  91 */   private CharacterField fieldPYRUSR = null;
/*  92 */   private CharacterField fieldPYRPID = null;
/*  93 */   private CharacterField fieldPYROPC = null;
/*  94 */   private CharacterField fieldPYREOF = null;
/*  95 */   private CharacterField fieldPYRSTS = null;
/*  96 */   private CharacterField fieldPYRTYP = null;
/*  97 */   private CharacterField fieldPYRFLG = null;
/*  98 */   private DecimalField fieldPYRACC = null;
/*  99 */   private DecimalField fieldPYRAMT = null;
/* 100 */   private DecimalField fieldPYRNUM = null;
/* 101 */   private DecimalField fieldPYRVDD = null;
/* 102 */   private DecimalField fieldPYRVDM = null;
/* 103 */   private DecimalField fieldPYRVDY = null;
/* 104 */   private CharacterField fieldPYRERD = null;
/* 105 */   private CharacterField fieldPYRBNAM = null;
/* 106 */   private CharacterField fieldPYRBAD1 = null;
/* 107 */   private CharacterField fieldPYRBAD2 = null;
/* 108 */   private CharacterField fieldPYRBAD3 = null;
/* 109 */   private CharacterField fieldPYRMEM1 = null;
/* 110 */   private CharacterField fieldPYRMEM2 = null;
/* 111 */   private CharacterField fieldPYRPTYP = null;
/* 112 */   private CharacterField fieldPYRBACC = null;
/* 113 */   private CharacterField fieldPYRBBNK = null;
/* 114 */   private CharacterField fieldPYRBBKN = null;
/* 115 */   private CharacterField fieldPYRBBKAD = null;
/* 116 */   private CharacterField fieldPYRBBKA2 = null;
/* 117 */   private CharacterField fieldPYRIBKID = null;
/* 118 */   private CharacterField fieldPYRIBKNM = null;
/* 119 */   private CharacterField fieldPYRIBKAD = null;
/* 120 */   private CharacterField fieldPYRIBKA2 = null;
/* 121 */   private CharacterField fieldPYRCCY = null;
/*     */ 
/*     */   public INPYRLSJVMessage()
/*     */   {
/* 128 */     createFields();
/* 129 */     initialize();
/*     */   }
/*     */ 
/*     */   protected void createFields()
/*     */   {
/* 138 */     this.recordsize = 595;
/* 139 */     this.fileid = "1100708150253";
/* 140 */     this.recordid = "42F3714404DB1";
/* 141 */     this.message = new byte[getByteLength()];
/* 142 */     this.formatname = "INPYRLSJV";
/* 143 */     this.fieldnames = fldnames;
/* 144 */     this.tagnames = tnames;
/* 145 */     this.fields = new MessageField[31];
/*     */      this.fields[0]=this.fieldPYRUSR=new CharacterField(this.message, 10, 10, "PYRUSR");
/*     */      this.fields[1]=this.fieldPYRPID=new CharacterField(this.message, 20, 15, "PYRPID");
/*     */      this.fields[2]=this.fieldPYROPC=new CharacterField(this.message, 35, 2, "PYROPC");
/*     */      this.fields[3]=this.fieldPYREOF=new CharacterField(this.message, 37, 1, "PYREOF");
/*     */      this.fields[4]=this.fieldPYRSTS=new CharacterField(this.message, 38, 1, "PYRSTS");
/*     */      this.fields[5]=this.fieldPYRTYP=new CharacterField(this.message, 39, 1, "PYRTYP");
/*     */      this.fields[6]=this.fieldPYRFLG=new CharacterField(this.message, 40, 1, "PYRFLG");
/*     */      this.fields[7]=this.fieldPYRACC=new DecimalField(this.message, 41, 13, 0, "PYRACC");
/*     */      this.fields[8]=this.fieldPYRAMT=new DecimalField(this.message, 54, 19, 2, "PYRAMT");
/*     */      this.fields[9]=this.fieldPYRNUM=new DecimalField(this.message, 73, 7, 0, "PYRNUM");
/*     */      this.fields[10]=this.fieldPYRVDD=new DecimalField(this.message, 80, 3, 0, "PYRVDD");
/*     */      this.fields[11]=this.fieldPYRVDM=new DecimalField(this.message, 83, 3, 0, "PYRVDM");
/*     */      this.fields[12]=this.fieldPYRVDY=new DecimalField(this.message, 86, 3, 0, "PYRVDY");
/*     */      this.fields[13]=this.fieldPYRERD=new CharacterField(this.message, 89, 40, "PYRERD");
/*     */      this.fields[14]=this.fieldPYRBNAM=new CharacterField(this.message, 129, 40, "PYRBNAM");
/*     */      this.fields[15]=this.fieldPYRBAD1=new CharacterField(this.message, 169, 40, "PYRBAD1");
/*     */      this.fields[16]=this.fieldPYRBAD2=new CharacterField(this.message, 209, 40, "PYRBAD2");
/*     */      this.fields[17]=this.fieldPYRBAD3=new CharacterField(this.message, 249, 40, "PYRBAD3");
/*     */      this.fields[18]=this.fieldPYRMEM1=new CharacterField(this.message, 289, 40, "PYRMEM1");
/*     */      this.fields[19]=this.fieldPYRMEM2=new CharacterField(this.message, 329, 40, "PYRMEM2");
/*     */      this.fields[20]=this.fieldPYRPTYP=new CharacterField(this.message, 369, 1, "PYRPTYP");
/*     */      this.fields[21]=this.fieldPYRBACC=new CharacterField(this.message, 370, 34, "PYRBACC");
/*     */      this.fields[22]=this.fieldPYRBBNK=new CharacterField(this.message, 404, 9, "PYRBBNK");
/*     */      this.fields[23]=this.fieldPYRBBKN=new CharacterField(this.message, 413, 30, "PYRBBKN");
/*     */      this.fields[24]=this.fieldPYRBBKAD=new CharacterField(this.message, 443, 30, "PYRBBKAD");
/*     */      this.fields[25]=this.fieldPYRBBKA2=new CharacterField(this.message, 473, 30, "PYRBBKA2");
/*     */      this.fields[26]=this.fieldPYRIBKID=new CharacterField(this.message, 503, 9, "PYRIBKID");
/*     */      this.fields[27]=this.fieldPYRIBKNM=new CharacterField(this.message, 512, 30, "PYRIBKNM");
/*     */      this.fields[28]=this.fieldPYRIBKAD=new CharacterField(this.message, 542, 30, "PYRIBKAD");
/*     */      this.fields[29]=this.fieldPYRIBKA2=new CharacterField(this.message, 572, 30, "PYRIBKA2");
/*     */      this.fields[30]=this.fieldPYRCCY=new CharacterField(this.message, 602, 3, "PYRCCY");
/*     */ 
/* 210 */     synchronized (tlookup)
/*     */     {
/* 212 */       if (tlookup.isEmpty())
/*     */       {
/* 214 */         for (int i = 0; i < tnames.length; i++) {
/* 215 */           tlookup.put(tnames[i], new Integer(i));
/*     */         }
/*     */       }
/*     */     }
/* 219 */     this.taglookup = tlookup;
/*     */   }
/*     */ 
/*     */   public void setPYRUSR(String newvalue)
/*     */   {
/* 227 */     this.fieldPYRUSR.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getPYRUSR()
/*     */   {
/* 235 */     return this.fieldPYRUSR.getString();
/*     */   }
/*     */ 
/*     */   public void setPYRPID(String newvalue)
/*     */   {
/* 243 */     this.fieldPYRPID.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getPYRPID()
/*     */   {
/* 251 */     return this.fieldPYRPID.getString();
/*     */   }
/*     */ 
/*     */   public void setPYROPC(String newvalue)
/*     */   {
/* 259 */     this.fieldPYROPC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getPYROPC()
/*     */   {
/* 267 */     return this.fieldPYROPC.getString();
/*     */   }
/*     */ 
/*     */   public void setPYREOF(String newvalue)
/*     */   {
/* 275 */     this.fieldPYREOF.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getPYREOF()
/*     */   {
/* 283 */     return this.fieldPYREOF.getString();
/*     */   }
/*     */ 
/*     */   public void setPYRSTS(String newvalue)
/*     */   {
/* 291 */     this.fieldPYRSTS.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getPYRSTS()
/*     */   {
/* 299 */     return this.fieldPYRSTS.getString();
/*     */   }
/*     */ 
/*     */   public void setPYRTYP(String newvalue)
/*     */   {
/* 307 */     this.fieldPYRTYP.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getPYRTYP()
/*     */   {
/* 315 */     return this.fieldPYRTYP.getString();
/*     */   }
/*     */ 
/*     */   public void setPYRFLG(String newvalue)
/*     */   {
/* 323 */     this.fieldPYRFLG.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getPYRFLG()
/*     */   {
/* 331 */     return this.fieldPYRFLG.getString();
/*     */   }
/*     */ 
/*     */   public void setPYRACC(String newvalue)
/*     */   {
/* 339 */     this.fieldPYRACC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getPYRACC()
/*     */   {
/* 347 */     return this.fieldPYRACC.getString();
/*     */   }
/*     */ 
/*     */   public void setPYRACC(BigDecimal newvalue)
/*     */   {
/* 355 */     this.fieldPYRACC.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalPYRACC()
/*     */   {
/* 363 */     return this.fieldPYRACC.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setPYRAMT(String newvalue)
/*     */   {
/* 371 */     this.fieldPYRAMT.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getPYRAMT()
/*     */   {
/* 379 */     return this.fieldPYRAMT.getString();
/*     */   }
/*     */ 
/*     */   public void setPYRAMT(BigDecimal newvalue)
/*     */   {
/* 387 */     this.fieldPYRAMT.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalPYRAMT()
/*     */   {
/* 395 */     return this.fieldPYRAMT.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setPYRNUM(String newvalue)
/*     */   {
/* 403 */     this.fieldPYRNUM.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getPYRNUM()
/*     */   {
/* 411 */     return this.fieldPYRNUM.getString();
/*     */   }
/*     */ 
/*     */   public void setPYRNUM(BigDecimal newvalue)
/*     */   {
/* 419 */     this.fieldPYRNUM.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalPYRNUM()
/*     */   {
/* 427 */     return this.fieldPYRNUM.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setPYRVDD(String newvalue)
/*     */   {
/* 435 */     this.fieldPYRVDD.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getPYRVDD()
/*     */   {
/* 443 */     return this.fieldPYRVDD.getString();
/*     */   }
/*     */ 
/*     */   public void setPYRVDD(BigDecimal newvalue)
/*     */   {
/* 451 */     this.fieldPYRVDD.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalPYRVDD()
/*     */   {
/* 459 */     return this.fieldPYRVDD.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setPYRVDM(String newvalue)
/*     */   {
/* 467 */     this.fieldPYRVDM.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getPYRVDM()
/*     */   {
/* 475 */     return this.fieldPYRVDM.getString();
/*     */   }
/*     */ 
/*     */   public void setPYRVDM(BigDecimal newvalue)
/*     */   {
/* 483 */     this.fieldPYRVDM.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalPYRVDM()
/*     */   {
/* 491 */     return this.fieldPYRVDM.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setPYRVDY(String newvalue)
/*     */   {
/* 499 */     this.fieldPYRVDY.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getPYRVDY()
/*     */   {
/* 507 */     return this.fieldPYRVDY.getString();
/*     */   }
/*     */ 
/*     */   public void setPYRVDY(BigDecimal newvalue)
/*     */   {
/* 515 */     this.fieldPYRVDY.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalPYRVDY()
/*     */   {
/* 523 */     return this.fieldPYRVDY.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setPYRERD(String newvalue)
/*     */   {
/* 531 */     this.fieldPYRERD.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getPYRERD()
/*     */   {
/* 539 */     return this.fieldPYRERD.getString();
/*     */   }
/*     */ 
/*     */   public void setPYRBNAM(String newvalue)
/*     */   {
/* 547 */     this.fieldPYRBNAM.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getPYRBNAM()
/*     */   {
/* 555 */     return this.fieldPYRBNAM.getString();
/*     */   }
/*     */ 
/*     */   public void setPYRBAD1(String newvalue)
/*     */   {
/* 563 */     this.fieldPYRBAD1.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getPYRBAD1()
/*     */   {
/* 571 */     return this.fieldPYRBAD1.getString();
/*     */   }
/*     */ 
/*     */   public void setPYRBAD2(String newvalue)
/*     */   {
/* 579 */     this.fieldPYRBAD2.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getPYRBAD2()
/*     */   {
/* 587 */     return this.fieldPYRBAD2.getString();
/*     */   }
/*     */ 
/*     */   public void setPYRBAD3(String newvalue)
/*     */   {
/* 595 */     this.fieldPYRBAD3.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getPYRBAD3()
/*     */   {
/* 603 */     return this.fieldPYRBAD3.getString();
/*     */   }
/*     */ 
/*     */   public void setPYRMEM1(String newvalue)
/*     */   {
/* 611 */     this.fieldPYRMEM1.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getPYRMEM1()
/*     */   {
/* 619 */     return this.fieldPYRMEM1.getString();
/*     */   }
/*     */ 
/*     */   public void setPYRMEM2(String newvalue)
/*     */   {
/* 627 */     this.fieldPYRMEM2.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getPYRMEM2()
/*     */   {
/* 635 */     return this.fieldPYRMEM2.getString();
/*     */   }
/*     */ 
/*     */   public void setPYRPTYP(String newvalue)
/*     */   {
/* 643 */     this.fieldPYRPTYP.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getPYRPTYP()
/*     */   {
/* 651 */     return this.fieldPYRPTYP.getString();
/*     */   }
/*     */ 
/*     */   public void setPYRBACC(String newvalue)
/*     */   {
/* 659 */     this.fieldPYRBACC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getPYRBACC()
/*     */   {
/* 667 */     return this.fieldPYRBACC.getString();
/*     */   }
/*     */ 
/*     */   public void setPYRBBNK(String newvalue)
/*     */   {
/* 675 */     this.fieldPYRBBNK.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getPYRBBNK()
/*     */   {
/* 683 */     return this.fieldPYRBBNK.getString();
/*     */   }
/*     */ 
/*     */   public void setPYRBBKN(String newvalue)
/*     */   {
/* 691 */     this.fieldPYRBBKN.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getPYRBBKN()
/*     */   {
/* 699 */     return this.fieldPYRBBKN.getString();
/*     */   }
/*     */ 
/*     */   public void setPYRBBKAD(String newvalue)
/*     */   {
/* 707 */     this.fieldPYRBBKAD.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getPYRBBKAD()
/*     */   {
/* 715 */     return this.fieldPYRBBKAD.getString();
/*     */   }
/*     */ 
/*     */   public void setPYRBBKA2(String newvalue)
/*     */   {
/* 723 */     this.fieldPYRBBKA2.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getPYRBBKA2()
/*     */   {
/* 731 */     return this.fieldPYRBBKA2.getString();
/*     */   }
/*     */ 
/*     */   public void setPYRIBKID(String newvalue)
/*     */   {
/* 739 */     this.fieldPYRIBKID.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getPYRIBKID()
/*     */   {
/* 747 */     return this.fieldPYRIBKID.getString();
/*     */   }
/*     */ 
/*     */   public void setPYRIBKNM(String newvalue)
/*     */   {
/* 755 */     this.fieldPYRIBKNM.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getPYRIBKNM()
/*     */   {
/* 763 */     return this.fieldPYRIBKNM.getString();
/*     */   }
/*     */ 
/*     */   public void setPYRIBKAD(String newvalue)
/*     */   {
/* 771 */     this.fieldPYRIBKAD.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getPYRIBKAD()
/*     */   {
/* 779 */     return this.fieldPYRIBKAD.getString();
/*     */   }
/*     */ 
/*     */   public void setPYRIBKA2(String newvalue)
/*     */   {
/* 787 */     this.fieldPYRIBKA2.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getPYRIBKA2()
/*     */   {
/* 795 */     return this.fieldPYRIBKA2.getString();
/*     */   }
/*     */ 
/*     */   public void setPYRCCY(String newvalue)
/*     */   {
/* 803 */     this.fieldPYRCCY.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getPYRCCY()
/*     */   {
/* 811 */     return this.fieldPYRCCY.getString();
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.INPYRLSJVMessage
 * JD-Core Version:    0.6.0
 */