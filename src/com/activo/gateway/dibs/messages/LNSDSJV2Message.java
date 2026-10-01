/*      */ package com.activo.gateway.dibs.messages;
/*      */ 
/*      */ import java.math.BigDecimal;
import java.util.Hashtable;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*      */ 
/*      */ public class LNSDSJV2Message extends MessageRecord
/*      */ {
/*   18 */   static final String[] fldnames = { 
/*   19 */     "LNSUSR", 
/*   20 */     "LNSACC", 
/*   21 */     "LNSCCY", 
/*   22 */     "LNSPRI", 
/*   23 */     "LNSINT", 
/*   24 */     "LNSLCH", 
/*   25 */     "LNSSCR", 
/*   26 */     "LNSPOF", 
/*   27 */     "LNSPMT", 
/*   28 */     "LNSNOP1", 
/*   29 */     "LNSNOP2", 
/*   30 */     "LNSNOP3", 
/*   31 */     "LNSNXP1", 
/*   32 */     "LNSNXP2", 
/*   33 */     "LNSNXP3", 
/*   34 */     "LNSMAT1", 
/*   35 */     "LNSMAT2", 
/*   36 */     "LNSMAT3", 
/*   37 */     "LNSRTE", 
/*   38 */     "LNSCLI", 
/*   39 */     "LNSIPY", 
/*   40 */     "LNSPPY", 
/*   41 */     "LNSLST1", 
/*   42 */     "LNSLST2", 
/*   43 */     "LNSLST3", 
/*   44 */     "LNSAVB", 
/*   45 */     "LNSTRM", 
/*   46 */     "LNSTRC", 
/*   47 */     "LNSCUOP", 
/*   48 */     "LNSCUOV", 
/*   49 */     "LNSCUOA", 
/*   50 */     "LNSSTS", 
/*   51 */     "LNSFLD1", 
/*   52 */     "LNSFLD2", 
/*   53 */     "LNSFLD3", 
/*   54 */     "LNSTXT1", 
/*   55 */     "LNSTXT2", 
/*   56 */     "LNSTXT3" };
/*      */ 
/*   58 */   static final String[] tnames = { 
/*   59 */     "LNSUSR", 
/*   60 */     "LNSACC", 
/*   61 */     "LNSCCY", 
/*   62 */     "LNSPRI", 
/*   63 */     "LNSINT", 
/*   64 */     "LNSLCH", 
/*   65 */     "LNSSCR", 
/*   66 */     "LNSPOF", 
/*   67 */     "LNSPMT", 
/*   68 */     "LNSNOP1", 
/*   69 */     "LNSNOP2", 
/*   70 */     "LNSNOP3", 
/*   71 */     "LNSNXP1", 
/*   72 */     "LNSNXP2", 
/*   73 */     "LNSNXP3", 
/*   74 */     "LNSMAT1", 
/*   75 */     "LNSMAT2", 
/*   76 */     "LNSMAT3", 
/*   77 */     "LNSRTE", 
/*   78 */     "LNSCLI", 
/*   79 */     "LNSIPY", 
/*   80 */     "LNSPPY", 
/*   81 */     "LNSLST1", 
/*   82 */     "LNSLST2", 
/*   83 */     "LNSLST3", 
/*   84 */     "LNSAVB", 
/*   85 */     "LNSTRM", 
/*   86 */     "LNSTRC", 
/*   87 */     "LNSCUOP", 
/*   88 */     "LNSCUOV", 
/*   89 */     "LNSCUOA", 
/*   90 */     "LNSSTS", 
/*   91 */     "LNSFLD1", 
/*   92 */     "LNSFLD2", 
/*   93 */     "LNSFLD3", 
/*   94 */     "LNSTXT1", 
/*   95 */     "LNSTXT2", 
/*   96 */     "LNSTXT3" };
/*      */   static final String fid = "1080717161512";
/*      */   static final String rid = "678EEAF75B378";
/*      */   static final String fmtname = "LNSDSJV";
/*  101 */   final int FIELDCOUNT = 38;
/*  102 */   private static Hashtable tlookup = new Hashtable();
/*  103 */   private CharacterField fieldLNSUSR = null;
/*  104 */   private DecimalField fieldLNSACC = null;
/*  105 */   private CharacterField fieldLNSCCY = null;
/*  106 */   private DecimalField fieldLNSPRI = null;
/*  107 */   private DecimalField fieldLNSINT = null;
/*  108 */   private DecimalField fieldLNSLCH = null;
/*  109 */   private DecimalField fieldLNSSCR = null;
/*  110 */   private DecimalField fieldLNSPOF = null;
/*  111 */   private DecimalField fieldLNSPMT = null;
/*  112 */   private DecimalField fieldLNSNOP1 = null;
/*  113 */   private DecimalField fieldLNSNOP2 = null;
/*  114 */   private DecimalField fieldLNSNOP3 = null;
/*  115 */   private DecimalField fieldLNSNXP1 = null;
/*  116 */   private DecimalField fieldLNSNXP2 = null;
/*  117 */   private DecimalField fieldLNSNXP3 = null;
/*  118 */   private DecimalField fieldLNSMAT1 = null;
/*  119 */   private DecimalField fieldLNSMAT2 = null;
/*  120 */   private DecimalField fieldLNSMAT3 = null;
/*  121 */   private DecimalField fieldLNSRTE = null;
/*  122 */   private DecimalField fieldLNSCLI = null;
/*  123 */   private DecimalField fieldLNSIPY = null;
/*  124 */   private DecimalField fieldLNSPPY = null;
/*  125 */   private DecimalField fieldLNSLST1 = null;
/*  126 */   private DecimalField fieldLNSLST2 = null;
/*  127 */   private DecimalField fieldLNSLST3 = null;
/*  128 */   private DecimalField fieldLNSAVB = null;
/*  129 */   private DecimalField fieldLNSTRM = null;
/*  130 */   private CharacterField fieldLNSTRC = null;
/*  131 */   private DecimalField fieldLNSCUOP = null;
/*  132 */   private DecimalField fieldLNSCUOV = null;
/*  133 */   private DecimalField fieldLNSCUOA = null;
/*  134 */   private CharacterField fieldLNSSTS = null;
/*  135 */   private DecimalField fieldLNSFLD1 = null;
/*  136 */   private DecimalField fieldLNSFLD2 = null;
/*  137 */   private DecimalField fieldLNSFLD3 = null;
/*  138 */   private CharacterField fieldLNSTXT1 = null;
/*  139 */   private CharacterField fieldLNSTXT2 = null;
/*  140 */   private CharacterField fieldLNSTXT3 = null;
/*      */ 
/*      */   public LNSDSJV2Message()
/*      */   {
/*  147 */     createFields();
/*  148 */     initialize();
/*      */   }
/*      */ 
/*      */   protected void createFields()
/*      */   {
/*  157 */     this.recordsize = 360;
/*  158 */     this.fileid = "1080717161512";
/*  159 */     this.recordid = "678EEAF75B378";
/*  160 */     this.message = new byte[getByteLength()];
/*  161 */     this.formatname = "LNSDSJV2";
/*  162 */     this.fieldnames = fldnames;
/*  163 */     this.tagnames = tnames;
/*  164 */     this.fields = new MessageField[38];
/*      */      this.fields[0]=this.fieldLNSUSR=new CharacterField(this.message, 10, 10, "LNSUSR");
/*      */      this.fields[1]=this.fieldLNSACC=new DecimalField(this.message, 20, 13, 0, "LNSACC");
/*      */      this.fields[2]=this.fieldLNSCCY=new CharacterField(this.message, 33, 3, "LNSCCY");
/*      */      this.fields[3]=this.fieldLNSPRI=new DecimalField(this.message, 36, 15, 2, "LNSPRI");
/*      */      this.fields[4]=this.fieldLNSINT=new DecimalField(this.message, 51, 15, 2, "LNSINT");
/*      */      this.fields[5]=this.fieldLNSLCH=new DecimalField(this.message, 66, 15, 2, "LNSLCH");
/*      */      this.fields[6]=this.fieldLNSSCR=new DecimalField(this.message, 81, 15, 2, "LNSSCR");
/*      */      this.fields[7]=this.fieldLNSPOF=new DecimalField(this.message, 96, 15, 2, "LNSPOF");
/*      */      this.fields[8]=this.fieldLNSPMT=new DecimalField(this.message, 111, 15, 2, "LNSPMT");
/*      */      this.fields[9]=this.fieldLNSNOP1=new DecimalField(this.message, 126, 3, 0, "LNSNOP1");
/*      */      this.fields[10]=this.fieldLNSNOP2=new DecimalField(this.message, 129, 3, 0, "LNSNOP2");
/*      */      this.fields[11]=this.fieldLNSNOP3=new DecimalField(this.message, 132, 3, 0, "LNSNOP3");
/*      */      this.fields[12]=this.fieldLNSNXP1=new DecimalField(this.message, 135, 3, 0, "LNSNXP1");
/*      */      this.fields[13]=this.fieldLNSNXP2=new DecimalField(this.message, 138, 3, 0, "LNSNXP2");
/*      */      this.fields[14]=this.fieldLNSNXP3=new DecimalField(this.message, 141, 3, 0, "LNSNXP3");
/*      */      this.fields[15]=this.fieldLNSMAT1=new DecimalField(this.message, 144, 3, 0, "LNSMAT1");
/*      */      this.fields[16]=this.fieldLNSMAT2=new DecimalField(this.message, 147, 3, 0, "LNSMAT2");
/*      */      this.fields[17]=this.fieldLNSMAT3=new DecimalField(this.message, 150, 3, 0, "LNSMAT3");
/*      */      this.fields[18]=this.fieldLNSRTE=new DecimalField(this.message, 153, 11, 6, "LNSRTE");
/*      */      this.fields[19]=this.fieldLNSCLI=new DecimalField(this.message, 164, 15, 2, "LNSCLI");
/*      */      this.fields[20]=this.fieldLNSIPY=new DecimalField(this.message, 179, 15, 2, "LNSIPY");
/*      */      this.fields[21]=this.fieldLNSPPY=new DecimalField(this.message, 194, 15, 2, "LNSPPY");
/*      */      this.fields[22]=this.fieldLNSLST1=new DecimalField(this.message, 209, 3, 0, "LNSLST1");
/*      */      this.fields[23]=this.fieldLNSLST2=new DecimalField(this.message, 212, 3, 0, "LNSLST2");
/*      */      this.fields[24]=this.fieldLNSLST3=new DecimalField(this.message, 215, 3, 0, "LNSLST3");
/*      */      this.fields[25]=this.fieldLNSAVB=new DecimalField(this.message, 218, 17, 2, "LNSAVB");
/*      */      this.fields[26]=this.fieldLNSTRM=new DecimalField(this.message, 235, 5, 0, "LNSTRM");
/*      */      this.fields[27]=this.fieldLNSTRC=new CharacterField(this.message, 240, 1, "LNSTRC");
/*      */      this.fields[28]=this.fieldLNSCUOP=new DecimalField(this.message, 241, 7, 0, "LNSCUOP");
/*      */      this.fields[29]=this.fieldLNSCUOV=new DecimalField(this.message, 248, 7, 0, "LNSCUOV");
/*      */      this.fields[30]=this.fieldLNSCUOA=new DecimalField(this.message, 255, 7, 0, "LNSCUOA");
/*      */      this.fields[31]=this.fieldLNSSTS=new CharacterField(this.message, 262, 15, "LNSSTS");
/*      */      this.fields[32]=this.fieldLNSFLD1=new DecimalField(this.message, 277, 16, 0, "LNSFLD1");
/*      */      this.fields[33]=this.fieldLNSFLD2=new DecimalField(this.message, 293, 16, 0, "LNSFLD2");
/*      */      this.fields[34]=this.fieldLNSFLD3=new DecimalField(this.message, 309, 16, 0, "LNSFLD3");
/*      */      this.fields[35]=this.fieldLNSTXT1=new CharacterField(this.message, 325, 15, "LNSTXT1");
/*      */      this.fields[36]=this.fieldLNSTXT2=new CharacterField(this.message, 340, 15, "LNSTXT2");
/*      */      this.fields[37]=this.fieldLNSTXT3=new CharacterField(this.message, 355, 15, "LNSTXT3");
/*      */ 
/*  243 */     synchronized (tlookup)
/*      */     {
/*  245 */       if (tlookup.isEmpty())
/*      */       {
/*  247 */         for (int i = 0; i < tnames.length; i++) {
/*  248 */           tlookup.put(tnames[i], new Integer(i));
/*      */         }
/*      */       }
/*      */     }
/*  252 */     this.taglookup = tlookup;
/*      */   }
/*      */ 
/*      */   public void setLNSUSR(String newvalue)
/*      */   {
/*  260 */     this.fieldLNSUSR.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLNSUSR()
/*      */   {
/*  268 */     return this.fieldLNSUSR.getString();
/*      */   }
/*      */ 
/*      */   public void setLNSACC(String newvalue)
/*      */   {
/*  276 */     this.fieldLNSACC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLNSACC()
/*      */   {
/*  284 */     return this.fieldLNSACC.getString();
/*      */   }
/*      */ 
/*      */   public void setLNSACC(BigDecimal newvalue)
/*      */   {
/*  292 */     this.fieldLNSACC.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalLNSACC()
/*      */   {
/*  300 */     return this.fieldLNSACC.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setLNSCCY(String newvalue)
/*      */   {
/*  308 */     this.fieldLNSCCY.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLNSCCY()
/*      */   {
/*  316 */     return this.fieldLNSCCY.getString();
/*      */   }
/*      */ 
/*      */   public void setLNSPRI(String newvalue)
/*      */   {
/*  324 */     this.fieldLNSPRI.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLNSPRI()
/*      */   {
/*  332 */     return this.fieldLNSPRI.getString();
/*      */   }
/*      */ 
/*      */   public void setLNSPRI(BigDecimal newvalue)
/*      */   {
/*  340 */     this.fieldLNSPRI.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalLNSPRI()
/*      */   {
/*  348 */     return this.fieldLNSPRI.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setLNSINT(String newvalue)
/*      */   {
/*  356 */     this.fieldLNSINT.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLNSINT()
/*      */   {
/*  364 */     return this.fieldLNSINT.getString();
/*      */   }
/*      */ 
/*      */   public void setLNSINT(BigDecimal newvalue)
/*      */   {
/*  372 */     this.fieldLNSINT.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalLNSINT()
/*      */   {
/*  380 */     return this.fieldLNSINT.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setLNSLCH(String newvalue)
/*      */   {
/*  388 */     this.fieldLNSLCH.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLNSLCH()
/*      */   {
/*  396 */     return this.fieldLNSLCH.getString();
/*      */   }
/*      */ 
/*      */   public void setLNSLCH(BigDecimal newvalue)
/*      */   {
/*  404 */     this.fieldLNSLCH.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalLNSLCH()
/*      */   {
/*  412 */     return this.fieldLNSLCH.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setLNSSCR(String newvalue)
/*      */   {
/*  420 */     this.fieldLNSSCR.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLNSSCR()
/*      */   {
/*  428 */     return this.fieldLNSSCR.getString();
/*      */   }
/*      */ 
/*      */   public void setLNSSCR(BigDecimal newvalue)
/*      */   {
/*  436 */     this.fieldLNSSCR.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalLNSSCR()
/*      */   {
/*  444 */     return this.fieldLNSSCR.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setLNSPOF(String newvalue)
/*      */   {
/*  452 */     this.fieldLNSPOF.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLNSPOF()
/*      */   {
/*  460 */     return this.fieldLNSPOF.getString();
/*      */   }
/*      */ 
/*      */   public void setLNSPOF(BigDecimal newvalue)
/*      */   {
/*  468 */     this.fieldLNSPOF.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalLNSPOF()
/*      */   {
/*  476 */     return this.fieldLNSPOF.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setLNSPMT(String newvalue)
/*      */   {
/*  484 */     this.fieldLNSPMT.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLNSPMT()
/*      */   {
/*  492 */     return this.fieldLNSPMT.getString();
/*      */   }
/*      */ 
/*      */   public void setLNSPMT(BigDecimal newvalue)
/*      */   {
/*  500 */     this.fieldLNSPMT.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalLNSPMT()
/*      */   {
/*  508 */     return this.fieldLNSPMT.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setLNSNOP1(String newvalue)
/*      */   {
/*  516 */     this.fieldLNSNOP1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLNSNOP1()
/*      */   {
/*  524 */     return this.fieldLNSNOP1.getString();
/*      */   }
/*      */ 
/*      */   public void setLNSNOP1(BigDecimal newvalue)
/*      */   {
/*  532 */     this.fieldLNSNOP1.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalLNSNOP1()
/*      */   {
/*  540 */     return this.fieldLNSNOP1.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setLNSNOP2(String newvalue)
/*      */   {
/*  548 */     this.fieldLNSNOP2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLNSNOP2()
/*      */   {
/*  556 */     return this.fieldLNSNOP2.getString();
/*      */   }
/*      */ 
/*      */   public void setLNSNOP2(BigDecimal newvalue)
/*      */   {
/*  564 */     this.fieldLNSNOP2.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalLNSNOP2()
/*      */   {
/*  572 */     return this.fieldLNSNOP2.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setLNSNOP3(String newvalue)
/*      */   {
/*  580 */     this.fieldLNSNOP3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLNSNOP3()
/*      */   {
/*  588 */     return this.fieldLNSNOP3.getString();
/*      */   }
/*      */ 
/*      */   public void setLNSNOP3(BigDecimal newvalue)
/*      */   {
/*  596 */     this.fieldLNSNOP3.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalLNSNOP3()
/*      */   {
/*  604 */     return this.fieldLNSNOP3.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setLNSNXP1(String newvalue)
/*      */   {
/*  612 */     this.fieldLNSNXP1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLNSNXP1()
/*      */   {
/*  620 */     return this.fieldLNSNXP1.getString();
/*      */   }
/*      */ 
/*      */   public void setLNSNXP1(BigDecimal newvalue)
/*      */   {
/*  628 */     this.fieldLNSNXP1.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalLNSNXP1()
/*      */   {
/*  636 */     return this.fieldLNSNXP1.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setLNSNXP2(String newvalue)
/*      */   {
/*  644 */     this.fieldLNSNXP2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLNSNXP2()
/*      */   {
/*  652 */     return this.fieldLNSNXP2.getString();
/*      */   }
/*      */ 
/*      */   public void setLNSNXP2(BigDecimal newvalue)
/*      */   {
/*  660 */     this.fieldLNSNXP2.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalLNSNXP2()
/*      */   {
/*  668 */     return this.fieldLNSNXP2.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setLNSNXP3(String newvalue)
/*      */   {
/*  676 */     this.fieldLNSNXP3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLNSNXP3()
/*      */   {
/*  684 */     return this.fieldLNSNXP3.getString();
/*      */   }
/*      */ 
/*      */   public void setLNSNXP3(BigDecimal newvalue)
/*      */   {
/*  692 */     this.fieldLNSNXP3.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalLNSNXP3()
/*      */   {
/*  700 */     return this.fieldLNSNXP3.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setLNSMAT1(String newvalue)
/*      */   {
/*  708 */     this.fieldLNSMAT1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLNSMAT1()
/*      */   {
/*  716 */     return this.fieldLNSMAT1.getString();
/*      */   }
/*      */ 
/*      */   public void setLNSMAT1(BigDecimal newvalue)
/*      */   {
/*  724 */     this.fieldLNSMAT1.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalLNSMAT1()
/*      */   {
/*  732 */     return this.fieldLNSMAT1.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setLNSMAT2(String newvalue)
/*      */   {
/*  740 */     this.fieldLNSMAT2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLNSMAT2()
/*      */   {
/*  748 */     return this.fieldLNSMAT2.getString();
/*      */   }
/*      */ 
/*      */   public void setLNSMAT2(BigDecimal newvalue)
/*      */   {
/*  756 */     this.fieldLNSMAT2.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalLNSMAT2()
/*      */   {
/*  764 */     return this.fieldLNSMAT2.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setLNSMAT3(String newvalue)
/*      */   {
/*  772 */     this.fieldLNSMAT3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLNSMAT3()
/*      */   {
/*  780 */     return this.fieldLNSMAT3.getString();
/*      */   }
/*      */ 
/*      */   public void setLNSMAT3(BigDecimal newvalue)
/*      */   {
/*  788 */     this.fieldLNSMAT3.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalLNSMAT3()
/*      */   {
/*  796 */     return this.fieldLNSMAT3.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setLNSRTE(String newvalue)
/*      */   {
/*  804 */     this.fieldLNSRTE.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLNSRTE()
/*      */   {
/*  812 */     return this.fieldLNSRTE.getString();
/*      */   }
/*      */ 
/*      */   public void setLNSRTE(BigDecimal newvalue)
/*      */   {
/*  820 */     this.fieldLNSRTE.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalLNSRTE()
/*      */   {
/*  828 */     return this.fieldLNSRTE.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setLNSCLI(String newvalue)
/*      */   {
/*  836 */     this.fieldLNSCLI.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLNSCLI()
/*      */   {
/*  844 */     return this.fieldLNSCLI.getString();
/*      */   }
/*      */ 
/*      */   public void setLNSCLI(BigDecimal newvalue)
/*      */   {
/*  852 */     this.fieldLNSCLI.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalLNSCLI()
/*      */   {
/*  860 */     return this.fieldLNSCLI.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setLNSIPY(String newvalue)
/*      */   {
/*  868 */     this.fieldLNSIPY.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLNSIPY()
/*      */   {
/*  876 */     return this.fieldLNSIPY.getString();
/*      */   }
/*      */ 
/*      */   public void setLNSIPY(BigDecimal newvalue)
/*      */   {
/*  884 */     this.fieldLNSIPY.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalLNSIPY()
/*      */   {
/*  892 */     return this.fieldLNSIPY.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setLNSPPY(String newvalue)
/*      */   {
/*  900 */     this.fieldLNSPPY.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLNSPPY()
/*      */   {
/*  908 */     return this.fieldLNSPPY.getString();
/*      */   }
/*      */ 
/*      */   public void setLNSPPY(BigDecimal newvalue)
/*      */   {
/*  916 */     this.fieldLNSPPY.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalLNSPPY()
/*      */   {
/*  924 */     return this.fieldLNSPPY.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setLNSLST1(String newvalue)
/*      */   {
/*  932 */     this.fieldLNSLST1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLNSLST1()
/*      */   {
/*  940 */     return this.fieldLNSLST1.getString();
/*      */   }
/*      */ 
/*      */   public void setLNSLST1(BigDecimal newvalue)
/*      */   {
/*  948 */     this.fieldLNSLST1.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalLNSLST1()
/*      */   {
/*  956 */     return this.fieldLNSLST1.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setLNSLST2(String newvalue)
/*      */   {
/*  964 */     this.fieldLNSLST2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLNSLST2()
/*      */   {
/*  972 */     return this.fieldLNSLST2.getString();
/*      */   }
/*      */ 
/*      */   public void setLNSLST2(BigDecimal newvalue)
/*      */   {
/*  980 */     this.fieldLNSLST2.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalLNSLST2()
/*      */   {
/*  988 */     return this.fieldLNSLST2.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setLNSLST3(String newvalue)
/*      */   {
/*  996 */     this.fieldLNSLST3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLNSLST3()
/*      */   {
/* 1004 */     return this.fieldLNSLST3.getString();
/*      */   }
/*      */ 
/*      */   public void setLNSLST3(BigDecimal newvalue)
/*      */   {
/* 1012 */     this.fieldLNSLST3.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalLNSLST3()
/*      */   {
/* 1020 */     return this.fieldLNSLST3.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setLNSAVB(String newvalue)
/*      */   {
/* 1028 */     this.fieldLNSAVB.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLNSAVB()
/*      */   {
/* 1036 */     return this.fieldLNSAVB.getString();
/*      */   }
/*      */ 
/*      */   public void setLNSAVB(BigDecimal newvalue)
/*      */   {
/* 1044 */     this.fieldLNSAVB.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalLNSAVB()
/*      */   {
/* 1052 */     return this.fieldLNSAVB.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setLNSTRM(String newvalue)
/*      */   {
/* 1060 */     this.fieldLNSTRM.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLNSTRM()
/*      */   {
/* 1068 */     return this.fieldLNSTRM.getString();
/*      */   }
/*      */ 
/*      */   public void setLNSTRM(BigDecimal newvalue)
/*      */   {
/* 1076 */     this.fieldLNSTRM.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalLNSTRM()
/*      */   {
/* 1084 */     return this.fieldLNSTRM.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setLNSTRC(String newvalue)
/*      */   {
/* 1092 */     this.fieldLNSTRC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLNSTRC()
/*      */   {
/* 1100 */     return this.fieldLNSTRC.getString();
/*      */   }
/*      */ 
/*      */   public void setLNSCUOP(String newvalue)
/*      */   {
/* 1108 */     this.fieldLNSCUOP.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLNSCUOP()
/*      */   {
/* 1116 */     return this.fieldLNSCUOP.getString();
/*      */   }
/*      */ 
/*      */   public void setLNSCUOP(BigDecimal newvalue)
/*      */   {
/* 1124 */     this.fieldLNSCUOP.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalLNSCUOP()
/*      */   {
/* 1132 */     return this.fieldLNSCUOP.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setLNSCUOV(String newvalue)
/*      */   {
/* 1140 */     this.fieldLNSCUOV.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLNSCUOV()
/*      */   {
/* 1148 */     return this.fieldLNSCUOV.getString();
/*      */   }
/*      */ 
/*      */   public void setLNSCUOV(BigDecimal newvalue)
/*      */   {
/* 1156 */     this.fieldLNSCUOV.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalLNSCUOV()
/*      */   {
/* 1164 */     return this.fieldLNSCUOV.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setLNSCUOA(String newvalue)
/*      */   {
/* 1172 */     this.fieldLNSCUOA.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLNSCUOA()
/*      */   {
/* 1180 */     return this.fieldLNSCUOA.getString();
/*      */   }
/*      */ 
/*      */   public void setLNSCUOA(BigDecimal newvalue)
/*      */   {
/* 1188 */     this.fieldLNSCUOA.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalLNSCUOA()
/*      */   {
/* 1196 */     return this.fieldLNSCUOA.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setLNSSTS(String newvalue)
/*      */   {
/* 1204 */     this.fieldLNSSTS.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLNSSTS()
/*      */   {
/* 1212 */     return this.fieldLNSSTS.getString();
/*      */   }
/*      */ 
/*      */   public void setLNSFLD1(String newvalue)
/*      */   {
/* 1220 */     this.fieldLNSFLD1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLNSFLD1()
/*      */   {
/* 1228 */     return this.fieldLNSFLD1.getString();
/*      */   }
/*      */ 
/*      */   public void setLNSFLD1(BigDecimal newvalue)
/*      */   {
/* 1236 */     this.fieldLNSFLD1.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalLNSFLD1()
/*      */   {
/* 1244 */     return this.fieldLNSFLD1.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setLNSFLD2(String newvalue)
/*      */   {
/* 1252 */     this.fieldLNSFLD2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLNSFLD2()
/*      */   {
/* 1260 */     return this.fieldLNSFLD2.getString();
/*      */   }
/*      */ 
/*      */   public void setLNSFLD2(BigDecimal newvalue)
/*      */   {
/* 1268 */     this.fieldLNSFLD2.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalLNSFLD2()
/*      */   {
/* 1276 */     return this.fieldLNSFLD2.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setLNSFLD3(String newvalue)
/*      */   {
/* 1284 */     this.fieldLNSFLD3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLNSFLD3()
/*      */   {
/* 1292 */     return this.fieldLNSFLD3.getString();
/*      */   }
/*      */ 
/*      */   public void setLNSFLD3(BigDecimal newvalue)
/*      */   {
/* 1300 */     this.fieldLNSFLD3.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalLNSFLD3()
/*      */   {
/* 1308 */     return this.fieldLNSFLD3.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setLNSTXT1(String newvalue)
/*      */   {
/* 1316 */     this.fieldLNSTXT1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLNSTXT1()
/*      */   {
/* 1324 */     return this.fieldLNSTXT1.getString();
/*      */   }
/*      */ 
/*      */   public void setLNSTXT2(String newvalue)
/*      */   {
/* 1332 */     this.fieldLNSTXT2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLNSTXT2()
/*      */   {
/* 1340 */     return this.fieldLNSTXT2.getString();
/*      */   }
/*      */ 
/*      */   public void setLNSTXT3(String newvalue)
/*      */   {
/* 1348 */     this.fieldLNSTXT3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getLNSTXT3()
/*      */   {
/* 1356 */     return this.fieldLNSTXT3.getString();
/*      */   }
/*      */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.LNSDSJVMessage
 * JD-Core Version:    0.6.0
 */