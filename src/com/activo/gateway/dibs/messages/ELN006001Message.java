/*      */ package com.activo.gateway.dibs.messages;
/*      */ 
/*      */ import java.math.BigDecimal;
import java.util.Hashtable;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*      */ 
/*      */ public class ELN006001Message extends MessageRecord
/*      */ {
/*   20 */   static final String[] fldnames = { 
/*   21 */     "H01USERID", 
/*   22 */     "H01PROGRM", 
/*   23 */     "H01TIMSYS", 
/*   24 */     "H01SCRCOD", 
/*   25 */     "H01OPECOD", 
/*   26 */     "H01FLGMAS", 
/*   27 */     "H01FLGWK1", 
/*   28 */     "H01FLGWK2", 
/*   29 */     "H01FLGWK3", 
/*   30 */     "E01LNECUN", 
/*   31 */     "E01LNENUM", 
/*   32 */     "E01CUSNA1", 
/*   33 */     "E01LNETYL", 
/*   34 */     "E01LNEBNK", 
/*   35 */     "E01LNEBRN", 
/*   36 */     "E01LNECCY", 
/*   37 */     "E01LNEGLN", 
/*   38 */     "E01LNEAMN", 
/*   39 */     "E01LNEREA", 
/*   40 */     "E01LNEAMU", 
/*   41 */     "E01LNEOFA", 
/*   42 */     "E01LNEBAL", 
/*   43 */     "E01LNECLT", 
/*   44 */     "E01LNECYT", 
/*   45 */     "E01LNEOCM", 
/*   46 */     "E01LNEAVN", 
/*   47 */     "E01LNEAVU", 
/*   48 */     "E01LNEOP1", 
/*   49 */     "E01LNEOP2", 
/*   50 */     "E01LNEOP3", 
/*   51 */     "E01LNEMT1", 
/*   52 */     "E01LNEMT2", 
/*   53 */     "E01LNEMT3", 
/*   54 */     "E01LNERV1", 
/*   55 */     "E01LNERV2", 
/*   56 */     "E01LNERV3", 
/*   57 */     "E01LNERE1", 
/*   58 */     "E01LNERE2", 
/*   59 */     "E01LNERE3", 
/*   60 */     "E01LNEPUR", 
/*   61 */     "E01LNEABY", 
/*   62 */     "E01LNEOFC", 
/*   63 */     "E01DSCOFC" };
/*      */ 
/*   65 */   static final String[] tnames = { 
/*   66 */     "H01USERID", 
/*   67 */     "H01PROGRM", 
/*   68 */     "H01TIMSYS", 
/*   69 */     "H01SCRCOD", 
/*   70 */     "H01OPECOD", 
/*   71 */     "H01FLGMAS", 
/*   72 */     "H01FLGWK1", 
/*   73 */     "H01FLGWK2", 
/*   74 */     "H01FLGWK3", 
/*   75 */     "E01LNECUN", 
/*   76 */     "E01LNENUM", 
/*   77 */     "E01CUSNA1", 
/*   78 */     "E01LNETYL", 
/*   79 */     "E01LNEBNK", 
/*   80 */     "E01LNEBRN", 
/*   81 */     "E01LNECCY", 
/*   82 */     "E01LNEGLN", 
/*   83 */     "E01LNEAMN", 
/*   84 */     "E01LNEREA", 
/*   85 */     "E01LNEAMU", 
/*   86 */     "E01LNEOFA", 
/*   87 */     "E01LNEBAL", 
/*   88 */     "E01LNECLT", 
/*   89 */     "E01LNECYT", 
/*   90 */     "E01LNEOCM", 
/*   91 */     "E01LNEAVN", 
/*   92 */     "E01LNEAVU", 
/*   93 */     "E01LNEOP1", 
/*   94 */     "E01LNEOP2", 
/*   95 */     "E01LNEOP3", 
/*   96 */     "E01LNEMT1", 
/*   97 */     "E01LNEMT2", 
/*   98 */     "E01LNEMT3", 
/*   99 */     "E01LNERV1", 
/*  100 */     "E01LNERV2", 
/*  101 */     "E01LNERV3", 
/*  102 */     "E01LNERE1", 
/*  103 */     "E01LNERE2", 
/*  104 */     "E01LNERE3", 
/*  105 */     "E01LNEPUR", 
/*  106 */     "E01LNEABY", 
/*  107 */     "E01LNEOFC", 
/*  108 */     "E01DSCOFC" };
/*      */   static final String fid = "1010809171032";
/*      */   static final String rid = "42B84BCFAB84D";
/*      */   static final String fmtname = "ELN006001";
/*  113 */   final int FIELDCOUNT = 43;
/*  114 */   private static Hashtable tlookup = new Hashtable();
/*  115 */   private CharacterField fieldH01USERID = null;
/*  116 */   private CharacterField fieldH01PROGRM = null;
/*  117 */   private CharacterField fieldH01TIMSYS = null;
/*  118 */   private CharacterField fieldH01SCRCOD = null;
/*  119 */   private CharacterField fieldH01OPECOD = null;
/*  120 */   private CharacterField fieldH01FLGMAS = null;
/*  121 */   private CharacterField fieldH01FLGWK1 = null;
/*  122 */   private CharacterField fieldH01FLGWK2 = null;
/*  123 */   private CharacterField fieldH01FLGWK3 = null;
/*  124 */   private DecimalField fieldE01LNECUN = null;
/*  125 */   private DecimalField fieldE01LNENUM = null;
/*  126 */   private CharacterField fieldE01CUSNA1 = null;
/*  127 */   private CharacterField fieldE01LNETYL = null;
/*  128 */   private CharacterField fieldE01LNEBNK = null;
/*  129 */   private DecimalField fieldE01LNEBRN = null;
/*  130 */   private CharacterField fieldE01LNECCY = null;
/*  131 */   private DecimalField fieldE01LNEGLN = null;
/*  132 */   private DecimalField fieldE01LNEAMN = null;
/*  133 */   private DecimalField fieldE01LNEREA = null;
/*  134 */   private DecimalField fieldE01LNEAMU = null;
/*  135 */   private DecimalField fieldE01LNEOFA = null;
/*  136 */   private DecimalField fieldE01LNEBAL = null;
/*  137 */   private DecimalField fieldE01LNECLT = null;
/*  138 */   private DecimalField fieldE01LNECYT = null;
/*  139 */   private DecimalField fieldE01LNEOCM = null;
/*  140 */   private DecimalField fieldE01LNEAVN = null;
/*  141 */   private DecimalField fieldE01LNEAVU = null;
/*  142 */   private DecimalField fieldE01LNEOP1 = null;
/*  143 */   private DecimalField fieldE01LNEOP2 = null;
/*  144 */   private DecimalField fieldE01LNEOP3 = null;
/*  145 */   private DecimalField fieldE01LNEMT1 = null;
/*  146 */   private DecimalField fieldE01LNEMT2 = null;
/*  147 */   private DecimalField fieldE01LNEMT3 = null;
/*  148 */   private DecimalField fieldE01LNERV1 = null;
/*  149 */   private DecimalField fieldE01LNERV2 = null;
/*  150 */   private DecimalField fieldE01LNERV3 = null;
/*  151 */   private DecimalField fieldE01LNERE1 = null;
/*  152 */   private DecimalField fieldE01LNERE2 = null;
/*  153 */   private DecimalField fieldE01LNERE3 = null;
/*  154 */   private CharacterField fieldE01LNEPUR = null;
/*  155 */   private CharacterField fieldE01LNEABY = null;
/*  156 */   private CharacterField fieldE01LNEOFC = null;
/*  157 */   private CharacterField fieldE01DSCOFC = null;
/*      */ 
/*      */   public ELN006001Message()
/*      */   {
/*  164 */     createFields();
/*  165 */     initialize();
/*      */   }
/*      */ 
/*      */   protected void createFields()
/*      */   {
/*  174 */     this.recordsize = 437;
/*  175 */     this.fileid = "1010809171032";
/*  176 */     this.recordid = "42B84BCFAB84D";
/*  177 */     this.message = new byte[getByteLength()];
/*  178 */     this.formatname = "ELN006001";
/*  179 */     this.fieldnames = fldnames;
/*  180 */     this.tagnames = tnames;
/*  181 */     this.fields = new MessageField[43];
/*      */      this.fields[0]=this.fieldH01USERID=new CharacterField(this.message, 10, 10, "H01USERID");
/*      */      this.fields[1]=this.fieldH01PROGRM=new CharacterField(this.message, 20, 10, "H01PROGRM");
/*      */      this.fields[2]=this.fieldH01TIMSYS=new CharacterField(this.message, 30, 12, "H01TIMSYS");
/*      */      this.fields[3]=this.fieldH01SCRCOD=new CharacterField(this.message, 42, 2, "H01SCRCOD");
/*      */      this.fields[4]=this.fieldH01OPECOD=new CharacterField(this.message, 44, 4, "H01OPECOD");
/*      */      this.fields[5]=this.fieldH01FLGMAS=new CharacterField(this.message, 48, 1, "H01FLGMAS");
/*      */      this.fields[6]=this.fieldH01FLGWK1=new CharacterField(this.message, 49, 1, "H01FLGWK1");
/*      */      this.fields[7]=this.fieldH01FLGWK2=new CharacterField(this.message, 50, 1, "H01FLGWK2");
/*      */      this.fields[8]=this.fieldH01FLGWK3=new CharacterField(this.message, 51, 1, "H01FLGWK3");
/*      */      this.fields[9]=this.fieldE01LNECUN=new DecimalField(this.message, 52, 10, 0, "E01LNECUN");
/*      */      this.fields[10]=this.fieldE01LNENUM=new DecimalField(this.message, 62, 5, 0, "E01LNENUM");
/*      */      this.fields[11]=this.fieldE01CUSNA1=new CharacterField(this.message, 67, 45, "E01CUSNA1");
/*      */      this.fields[12]=this.fieldE01LNETYL=new CharacterField(this.message, 112, 4, "E01LNETYL");
/*      */      this.fields[13]=this.fieldE01LNEBNK=new CharacterField(this.message, 116, 2, "E01LNEBNK");
/*      */      this.fields[14]=this.fieldE01LNEBRN=new DecimalField(this.message, 118, 4, 0, "E01LNEBRN");
/*      */      this.fields[15]=this.fieldE01LNECCY=new CharacterField(this.message, 122, 3, "E01LNECCY");
/*      */      this.fields[16]=this.fieldE01LNEGLN=new DecimalField(this.message, 125, 17, 0, "E01LNEGLN");
/*      */      this.fields[17]=this.fieldE01LNEAMN=new DecimalField(this.message, 142, 17, 2, "E01LNEAMN");
/*      */      this.fields[18]=this.fieldE01LNEREA=new DecimalField(this.message, 159, 17, 2, "E01LNEREA");
/*      */      this.fields[19]=this.fieldE01LNEAMU=new DecimalField(this.message, 176, 17, 2, "E01LNEAMU");
/*      */      this.fields[20]=this.fieldE01LNEOFA=new DecimalField(this.message, 193, 17, 2, "E01LNEOFA");
/*      */      this.fields[21]=this.fieldE01LNEBAL=new DecimalField(this.message, 210, 17, 2, "E01LNEBAL");
/*      */      this.fields[22]=this.fieldE01LNECLT=new DecimalField(this.message, 227, 17, 2, "E01LNECLT");
/*      */      this.fields[23]=this.fieldE01LNECYT=new DecimalField(this.message, 244, 17, 2, "E01LNECYT");
/*      */      this.fields[24]=this.fieldE01LNEOCM=new DecimalField(this.message, 261, 17, 2, "E01LNEOCM");
/*      */      this.fields[25]=this.fieldE01LNEAVN=new DecimalField(this.message, 278, 17, 2, "E01LNEAVN");
/*      */      this.fields[26]=this.fieldE01LNEAVU=new DecimalField(this.message, 295, 17, 2, "E01LNEAVU");
/*      */      this.fields[27]=this.fieldE01LNEOP1=new DecimalField(this.message, 312, 3, 0, "E01LNEOP1");
/*      */      this.fields[28]=this.fieldE01LNEOP2=new DecimalField(this.message, 315, 3, 0, "E01LNEOP2");
/*      */      this.fields[29]=this.fieldE01LNEOP3=new DecimalField(this.message, 318, 3, 0, "E01LNEOP3");
/*      */      this.fields[30]=this.fieldE01LNEMT1=new DecimalField(this.message, 321, 3, 0, "E01LNEMT1");
/*      */      this.fields[31]=this.fieldE01LNEMT2=new DecimalField(this.message, 324, 3, 0, "E01LNEMT2");
/*      */      this.fields[32]=this.fieldE01LNEMT3=new DecimalField(this.message, 327, 3, 0, "E01LNEMT3");
/*      */      this.fields[33]=this.fieldE01LNERV1=new DecimalField(this.message, 330, 3, 0, "E01LNERV1");
/*      */      this.fields[34]=this.fieldE01LNERV2=new DecimalField(this.message, 333, 3, 0, "E01LNERV2");
/*      */      this.fields[35]=this.fieldE01LNERV3=new DecimalField(this.message, 336, 3, 0, "E01LNERV3");
/*      */      this.fields[36]=this.fieldE01LNERE1=new DecimalField(this.message, 339, 3, 0, "E01LNERE1");
/*      */      this.fields[37]=this.fieldE01LNERE2=new DecimalField(this.message, 342, 3, 0, "E01LNERE2");
/*      */      this.fields[38]=this.fieldE01LNERE3=new DecimalField(this.message, 345, 3, 0, "E01LNERE3");
/*      */      this.fields[39]=this.fieldE01LNEPUR=new CharacterField(this.message, 348, 35, "E01LNEPUR");
/*      */      this.fields[40]=this.fieldE01LNEABY=new CharacterField(this.message, 383, 25, "E01LNEABY");
/*      */      this.fields[41]=this.fieldE01LNEOFC=new CharacterField(this.message, 408, 4, "E01LNEOFC");
/*      */      this.fields[42]=this.fieldE01DSCOFC=new CharacterField(this.message, 412, 35, "E01DSCOFC");
/*      */ 
/*  270 */     synchronized (tlookup)
/*      */     {
/*  272 */       if (tlookup.isEmpty())
/*      */       {
/*  274 */         for (int i = 0; i < tnames.length; i++) {
/*  275 */           tlookup.put(tnames[i], new Integer(i));
/*      */         }
/*      */       }
/*      */     }
/*  279 */     this.taglookup = tlookup;
/*      */   }
/*      */ 
/*      */   public void setH01USERID(String newvalue)
/*      */   {
/*  287 */     this.fieldH01USERID.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getH01USERID()
/*      */   {
/*  295 */     return this.fieldH01USERID.getString();
/*      */   }
/*      */ 
/*      */   public void setH01PROGRM(String newvalue)
/*      */   {
/*  303 */     this.fieldH01PROGRM.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getH01PROGRM()
/*      */   {
/*  311 */     return this.fieldH01PROGRM.getString();
/*      */   }
/*      */ 
/*      */   public void setH01TIMSYS(String newvalue)
/*      */   {
/*  319 */     this.fieldH01TIMSYS.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getH01TIMSYS()
/*      */   {
/*  327 */     return this.fieldH01TIMSYS.getString();
/*      */   }
/*      */ 
/*      */   public void setH01SCRCOD(String newvalue)
/*      */   {
/*  335 */     this.fieldH01SCRCOD.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getH01SCRCOD()
/*      */   {
/*  343 */     return this.fieldH01SCRCOD.getString();
/*      */   }
/*      */ 
/*      */   public void setH01OPECOD(String newvalue)
/*      */   {
/*  351 */     this.fieldH01OPECOD.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getH01OPECOD()
/*      */   {
/*  359 */     return this.fieldH01OPECOD.getString();
/*      */   }
/*      */ 
/*      */   public void setH01FLGMAS(String newvalue)
/*      */   {
/*  367 */     this.fieldH01FLGMAS.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getH01FLGMAS()
/*      */   {
/*  375 */     return this.fieldH01FLGMAS.getString();
/*      */   }
/*      */ 
/*      */   public void setH01FLGWK1(String newvalue)
/*      */   {
/*  383 */     this.fieldH01FLGWK1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getH01FLGWK1()
/*      */   {
/*  391 */     return this.fieldH01FLGWK1.getString();
/*      */   }
/*      */ 
/*      */   public void setH01FLGWK2(String newvalue)
/*      */   {
/*  399 */     this.fieldH01FLGWK2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getH01FLGWK2()
/*      */   {
/*  407 */     return this.fieldH01FLGWK2.getString();
/*      */   }
/*      */ 
/*      */   public void setH01FLGWK3(String newvalue)
/*      */   {
/*  415 */     this.fieldH01FLGWK3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getH01FLGWK3()
/*      */   {
/*  423 */     return this.fieldH01FLGWK3.getString();
/*      */   }
/*      */ 
/*      */   public void setE01LNECUN(String newvalue)
/*      */   {
/*  431 */     this.fieldE01LNECUN.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01LNECUN()
/*      */   {
/*  439 */     return this.fieldE01LNECUN.getString();
/*      */   }
/*      */ 
/*      */   public void setE01LNECUN(BigDecimal newvalue)
/*      */   {
/*  447 */     this.fieldE01LNECUN.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE01LNECUN()
/*      */   {
/*  455 */     return this.fieldE01LNECUN.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setE01LNENUM(String newvalue)
/*      */   {
/*  463 */     this.fieldE01LNENUM.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01LNENUM()
/*      */   {
/*  471 */     return this.fieldE01LNENUM.getString();
/*      */   }
/*      */ 
/*      */   public void setE01LNENUM(BigDecimal newvalue)
/*      */   {
/*  479 */     this.fieldE01LNENUM.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE01LNENUM()
/*      */   {
/*  487 */     return this.fieldE01LNENUM.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setE01CUSNA1(String newvalue)
/*      */   {
/*  495 */     this.fieldE01CUSNA1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01CUSNA1()
/*      */   {
/*  503 */     return this.fieldE01CUSNA1.getString();
/*      */   }
/*      */ 
/*      */   public void setE01LNETYL(String newvalue)
/*      */   {
/*  511 */     this.fieldE01LNETYL.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01LNETYL()
/*      */   {
/*  519 */     return this.fieldE01LNETYL.getString();
/*      */   }
/*      */ 
/*      */   public void setE01LNEBNK(String newvalue)
/*      */   {
/*  527 */     this.fieldE01LNEBNK.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01LNEBNK()
/*      */   {
/*  535 */     return this.fieldE01LNEBNK.getString();
/*      */   }
/*      */ 
/*      */   public void setE01LNEBRN(String newvalue)
/*      */   {
/*  543 */     this.fieldE01LNEBRN.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01LNEBRN()
/*      */   {
/*  551 */     return this.fieldE01LNEBRN.getString();
/*      */   }
/*      */ 
/*      */   public void setE01LNEBRN(BigDecimal newvalue)
/*      */   {
/*  559 */     this.fieldE01LNEBRN.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE01LNEBRN()
/*      */   {
/*  567 */     return this.fieldE01LNEBRN.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setE01LNECCY(String newvalue)
/*      */   {
/*  575 */     this.fieldE01LNECCY.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01LNECCY()
/*      */   {
/*  583 */     return this.fieldE01LNECCY.getString();
/*      */   }
/*      */ 
/*      */   public void setE01LNEGLN(String newvalue)
/*      */   {
/*  591 */     this.fieldE01LNEGLN.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01LNEGLN()
/*      */   {
/*  599 */     return this.fieldE01LNEGLN.getString();
/*      */   }
/*      */ 
/*      */   public void setE01LNEGLN(BigDecimal newvalue)
/*      */   {
/*  607 */     this.fieldE01LNEGLN.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE01LNEGLN()
/*      */   {
/*  615 */     return this.fieldE01LNEGLN.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setE01LNEAMN(String newvalue)
/*      */   {
/*  623 */     this.fieldE01LNEAMN.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01LNEAMN()
/*      */   {
/*  631 */     return this.fieldE01LNEAMN.getString();
/*      */   }
/*      */ 
/*      */   public void setE01LNEAMN(BigDecimal newvalue)
/*      */   {
/*  639 */     this.fieldE01LNEAMN.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE01LNEAMN()
/*      */   {
/*  647 */     return this.fieldE01LNEAMN.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setE01LNEREA(String newvalue)
/*      */   {
/*  655 */     this.fieldE01LNEREA.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01LNEREA()
/*      */   {
/*  663 */     return this.fieldE01LNEREA.getString();
/*      */   }
/*      */ 
/*      */   public void setE01LNEREA(BigDecimal newvalue)
/*      */   {
/*  671 */     this.fieldE01LNEREA.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE01LNEREA()
/*      */   {
/*  679 */     return this.fieldE01LNEREA.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setE01LNEAMU(String newvalue)
/*      */   {
/*  687 */     this.fieldE01LNEAMU.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01LNEAMU()
/*      */   {
/*  695 */     return this.fieldE01LNEAMU.getString();
/*      */   }
/*      */ 
/*      */   public void setE01LNEAMU(BigDecimal newvalue)
/*      */   {
/*  703 */     this.fieldE01LNEAMU.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE01LNEAMU()
/*      */   {
/*  711 */     return this.fieldE01LNEAMU.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setE01LNEOFA(String newvalue)
/*      */   {
/*  719 */     this.fieldE01LNEOFA.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01LNEOFA()
/*      */   {
/*  727 */     return this.fieldE01LNEOFA.getString();
/*      */   }
/*      */ 
/*      */   public void setE01LNEOFA(BigDecimal newvalue)
/*      */   {
/*  735 */     this.fieldE01LNEOFA.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE01LNEOFA()
/*      */   {
/*  743 */     return this.fieldE01LNEOFA.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setE01LNEBAL(String newvalue)
/*      */   {
/*  751 */     this.fieldE01LNEBAL.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01LNEBAL()
/*      */   {
/*  759 */     return this.fieldE01LNEBAL.getString();
/*      */   }
/*      */ 
/*      */   public void setE01LNEBAL(BigDecimal newvalue)
/*      */   {
/*  767 */     this.fieldE01LNEBAL.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE01LNEBAL()
/*      */   {
/*  775 */     return this.fieldE01LNEBAL.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setE01LNECLT(String newvalue)
/*      */   {
/*  783 */     this.fieldE01LNECLT.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01LNECLT()
/*      */   {
/*  791 */     return this.fieldE01LNECLT.getString();
/*      */   }
/*      */ 
/*      */   public void setE01LNECLT(BigDecimal newvalue)
/*      */   {
/*  799 */     this.fieldE01LNECLT.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE01LNECLT()
/*      */   {
/*  807 */     return this.fieldE01LNECLT.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setE01LNECYT(String newvalue)
/*      */   {
/*  815 */     this.fieldE01LNECYT.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01LNECYT()
/*      */   {
/*  823 */     return this.fieldE01LNECYT.getString();
/*      */   }
/*      */ 
/*      */   public void setE01LNECYT(BigDecimal newvalue)
/*      */   {
/*  831 */     this.fieldE01LNECYT.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE01LNECYT()
/*      */   {
/*  839 */     return this.fieldE01LNECYT.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setE01LNEOCM(String newvalue)
/*      */   {
/*  847 */     this.fieldE01LNEOCM.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01LNEOCM()
/*      */   {
/*  855 */     return this.fieldE01LNEOCM.getString();
/*      */   }
/*      */ 
/*      */   public void setE01LNEOCM(BigDecimal newvalue)
/*      */   {
/*  863 */     this.fieldE01LNEOCM.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE01LNEOCM()
/*      */   {
/*  871 */     return this.fieldE01LNEOCM.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setE01LNEAVN(String newvalue)
/*      */   {
/*  879 */     this.fieldE01LNEAVN.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01LNEAVN()
/*      */   {
/*  887 */     return this.fieldE01LNEAVN.getString();
/*      */   }
/*      */ 
/*      */   public void setE01LNEAVN(BigDecimal newvalue)
/*      */   {
/*  895 */     this.fieldE01LNEAVN.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE01LNEAVN()
/*      */   {
/*  903 */     return this.fieldE01LNEAVN.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setE01LNEAVU(String newvalue)
/*      */   {
/*  911 */     this.fieldE01LNEAVU.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01LNEAVU()
/*      */   {
/*  919 */     return this.fieldE01LNEAVU.getString();
/*      */   }
/*      */ 
/*      */   public void setE01LNEAVU(BigDecimal newvalue)
/*      */   {
/*  927 */     this.fieldE01LNEAVU.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE01LNEAVU()
/*      */   {
/*  935 */     return this.fieldE01LNEAVU.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setE01LNEOP1(String newvalue)
/*      */   {
/*  943 */     this.fieldE01LNEOP1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01LNEOP1()
/*      */   {
/*  951 */     return this.fieldE01LNEOP1.getString();
/*      */   }
/*      */ 
/*      */   public void setE01LNEOP1(BigDecimal newvalue)
/*      */   {
/*  959 */     this.fieldE01LNEOP1.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE01LNEOP1()
/*      */   {
/*  967 */     return this.fieldE01LNEOP1.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setE01LNEOP2(String newvalue)
/*      */   {
/*  975 */     this.fieldE01LNEOP2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01LNEOP2()
/*      */   {
/*  983 */     return this.fieldE01LNEOP2.getString();
/*      */   }
/*      */ 
/*      */   public void setE01LNEOP2(BigDecimal newvalue)
/*      */   {
/*  991 */     this.fieldE01LNEOP2.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE01LNEOP2()
/*      */   {
/*  999 */     return this.fieldE01LNEOP2.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setE01LNEOP3(String newvalue)
/*      */   {
/* 1007 */     this.fieldE01LNEOP3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01LNEOP3()
/*      */   {
/* 1015 */     return this.fieldE01LNEOP3.getString();
/*      */   }
/*      */ 
/*      */   public void setE01LNEOP3(BigDecimal newvalue)
/*      */   {
/* 1023 */     this.fieldE01LNEOP3.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE01LNEOP3()
/*      */   {
/* 1031 */     return this.fieldE01LNEOP3.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setE01LNEMT1(String newvalue)
/*      */   {
/* 1039 */     this.fieldE01LNEMT1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01LNEMT1()
/*      */   {
/* 1047 */     return this.fieldE01LNEMT1.getString();
/*      */   }
/*      */ 
/*      */   public void setE01LNEMT1(BigDecimal newvalue)
/*      */   {
/* 1055 */     this.fieldE01LNEMT1.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE01LNEMT1()
/*      */   {
/* 1063 */     return this.fieldE01LNEMT1.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setE01LNEMT2(String newvalue)
/*      */   {
/* 1071 */     this.fieldE01LNEMT2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01LNEMT2()
/*      */   {
/* 1079 */     return this.fieldE01LNEMT2.getString();
/*      */   }
/*      */ 
/*      */   public void setE01LNEMT2(BigDecimal newvalue)
/*      */   {
/* 1087 */     this.fieldE01LNEMT2.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE01LNEMT2()
/*      */   {
/* 1095 */     return this.fieldE01LNEMT2.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setE01LNEMT3(String newvalue)
/*      */   {
/* 1103 */     this.fieldE01LNEMT3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01LNEMT3()
/*      */   {
/* 1111 */     return this.fieldE01LNEMT3.getString();
/*      */   }
/*      */ 
/*      */   public void setE01LNEMT3(BigDecimal newvalue)
/*      */   {
/* 1119 */     this.fieldE01LNEMT3.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE01LNEMT3()
/*      */   {
/* 1127 */     return this.fieldE01LNEMT3.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setE01LNERV1(String newvalue)
/*      */   {
/* 1135 */     this.fieldE01LNERV1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01LNERV1()
/*      */   {
/* 1143 */     return this.fieldE01LNERV1.getString();
/*      */   }
/*      */ 
/*      */   public void setE01LNERV1(BigDecimal newvalue)
/*      */   {
/* 1151 */     this.fieldE01LNERV1.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE01LNERV1()
/*      */   {
/* 1159 */     return this.fieldE01LNERV1.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setE01LNERV2(String newvalue)
/*      */   {
/* 1167 */     this.fieldE01LNERV2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01LNERV2()
/*      */   {
/* 1175 */     return this.fieldE01LNERV2.getString();
/*      */   }
/*      */ 
/*      */   public void setE01LNERV2(BigDecimal newvalue)
/*      */   {
/* 1183 */     this.fieldE01LNERV2.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE01LNERV2()
/*      */   {
/* 1191 */     return this.fieldE01LNERV2.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setE01LNERV3(String newvalue)
/*      */   {
/* 1199 */     this.fieldE01LNERV3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01LNERV3()
/*      */   {
/* 1207 */     return this.fieldE01LNERV3.getString();
/*      */   }
/*      */ 
/*      */   public void setE01LNERV3(BigDecimal newvalue)
/*      */   {
/* 1215 */     this.fieldE01LNERV3.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE01LNERV3()
/*      */   {
/* 1223 */     return this.fieldE01LNERV3.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setE01LNERE1(String newvalue)
/*      */   {
/* 1231 */     this.fieldE01LNERE1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01LNERE1()
/*      */   {
/* 1239 */     return this.fieldE01LNERE1.getString();
/*      */   }
/*      */ 
/*      */   public void setE01LNERE1(BigDecimal newvalue)
/*      */   {
/* 1247 */     this.fieldE01LNERE1.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE01LNERE1()
/*      */   {
/* 1255 */     return this.fieldE01LNERE1.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setE01LNERE2(String newvalue)
/*      */   {
/* 1263 */     this.fieldE01LNERE2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01LNERE2()
/*      */   {
/* 1271 */     return this.fieldE01LNERE2.getString();
/*      */   }
/*      */ 
/*      */   public void setE01LNERE2(BigDecimal newvalue)
/*      */   {
/* 1279 */     this.fieldE01LNERE2.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE01LNERE2()
/*      */   {
/* 1287 */     return this.fieldE01LNERE2.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setE01LNERE3(String newvalue)
/*      */   {
/* 1295 */     this.fieldE01LNERE3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01LNERE3()
/*      */   {
/* 1303 */     return this.fieldE01LNERE3.getString();
/*      */   }
/*      */ 
/*      */   public void setE01LNERE3(BigDecimal newvalue)
/*      */   {
/* 1311 */     this.fieldE01LNERE3.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE01LNERE3()
/*      */   {
/* 1319 */     return this.fieldE01LNERE3.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setE01LNEPUR(String newvalue)
/*      */   {
/* 1327 */     this.fieldE01LNEPUR.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01LNEPUR()
/*      */   {
/* 1335 */     return this.fieldE01LNEPUR.getString();
/*      */   }
/*      */ 
/*      */   public void setE01LNEABY(String newvalue)
/*      */   {
/* 1343 */     this.fieldE01LNEABY.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01LNEABY()
/*      */   {
/* 1351 */     return this.fieldE01LNEABY.getString();
/*      */   }
/*      */ 
/*      */   public void setE01LNEOFC(String newvalue)
/*      */   {
/* 1359 */     this.fieldE01LNEOFC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01LNEOFC()
/*      */   {
/* 1367 */     return this.fieldE01LNEOFC.getString();
/*      */   }
/*      */ 
/*      */   public void setE01DSCOFC(String newvalue)
/*      */   {
/* 1375 */     this.fieldE01DSCOFC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01DSCOFC()
/*      */   {
/* 1383 */     return this.fieldE01DSCOFC.getString();
/*      */   }
/*      */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.ELN006001Message
 * JD-Core Version:    0.6.0
 */