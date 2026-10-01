/*      */ package com.activo.gateway.dibs.messages;
/*      */ 
/*      */ import java.math.BigDecimal;
import java.util.Hashtable;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*      */ 
/*      */ public class IIN091801Message extends MessageRecord
/*      */ {
/*   18 */   static final String[] fldnames = { 
/*   19 */     "H01USERID", 
/*   20 */     "H01PROGRM", 
/*   21 */     "H01TIMSYS", 
/*   22 */     "H01SCRCOD", 
/*   23 */     "H01OPECOD", 
/*   24 */     "H01FLGMAS", 
/*   25 */     "H01FLGWK1", 
/*   26 */     "H01FLGWK2", 
/*   27 */     "H01FLGWK3", 
/*   28 */     "I01ACMACC", 
/*   29 */     "I01STADT1", 
/*   30 */     "I01STADT2", 
/*   31 */     "I01STADT3", 
/*   32 */     "I01ACMCUN", 
/*   33 */     "I01CUSNA1", 
/*   34 */     "I01CUSNA2", 
/*   35 */     "I01CUSNA3", 
/*   36 */     "I01CUSNA4", 
/*   37 */     "I01CUSCTY", 
/*   38 */     "I01DSCATY", 
/*   39 */     "I01DSCPRO", 
/*   40 */     "I01DSCOFC", 
/*   41 */     "I01BEGBAL", 
/*   42 */     "I01ENDBAL", 
/*   43 */     "I01BATDT1", 
/*   44 */     "I01BATDT2", 
/*   45 */     "I01BATDT3", 
/*   46 */     "I01VALDT1", 
/*   47 */     "I01VALDT2", 
/*   48 */     "I01VALDT3", 
/*   49 */     "I01TRNCDE", 
/*   50 */     "I01NUMCHK", 
/*   51 */     "I01NARRAT", 
/*   52 */     "I01DEBITS", 
/*   53 */     "I01CREDIT", 
/*   54 */     "I01BALANC", 
/*   55 */     "I01BALGBL", 
/*   56 */     "I01BALUNC", 
/*   57 */     "I01BALHLD", 
/*   58 */     "I01BALNBL", 
/*   59 */     "I01CUSIDN", 
/*   60 */     "I01CUSTID", 
/*   61 */     "I01NUMREC", 
/*   62 */     "I01INDOPE" };
/*      */ 
/*   64 */   static final String[] tnames = { 
/*   65 */     "H01USERID", 
/*   66 */     "H01PROGRM", 
/*   67 */     "H01TIMSYS", 
/*   68 */     "H01SCRCOD", 
/*   69 */     "H01OPECOD", 
/*   70 */     "H01FLGMAS", 
/*   71 */     "H01FLGWK1", 
/*   72 */     "H01FLGWK2", 
/*   73 */     "H01FLGWK3", 
/*   74 */     "I01ACMACC", 
/*   75 */     "I01STADT1", 
/*   76 */     "I01STADT2", 
/*   77 */     "I01STADT3", 
/*   78 */     "I01ACMCUN", 
/*   79 */     "I01CUSNA1", 
/*   80 */     "I01CUSNA2", 
/*   81 */     "I01CUSNA3", 
/*   82 */     "I01CUSNA4", 
/*   83 */     "I01CUSCTY", 
/*   84 */     "I01DSCATY", 
/*   85 */     "I01DSCPRO", 
/*   86 */     "I01DSCOFC", 
/*   87 */     "I01BEGBAL", 
/*   88 */     "I01ENDBAL", 
/*   89 */     "I01BATDT1", 
/*   90 */     "I01BATDT2", 
/*   91 */     "I01BATDT3", 
/*   92 */     "I01VALDT1", 
/*   93 */     "I01VALDT2", 
/*   94 */     "I01VALDT3", 
/*   95 */     "I01TRNCDE", 
/*   96 */     "I01NUMCHK", 
/*   97 */     "I01NARRAT", 
/*   98 */     "I01DEBITS", 
/*   99 */     "I01CREDIT", 
/*  100 */     "I01BALANC", 
/*  101 */     "I01BALGBL", 
/*  102 */     "I01BALUNC", 
/*  103 */     "I01BALHLD", 
/*  104 */     "I01BALNBL", 
/*  105 */     "I01CUSIDN", 
/*  106 */     "I01CUSTID", 
/*  107 */     "I01NUMREC", 
/*  108 */     "I01INDOPE" };
/*      */   static final String fid = "1060616163339";
/*      */   static final String rid = "43F9E67700639";
/*      */   static final String fmtname = "IIN091801";
/*  113 */   final int FIELDCOUNT = 44;
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
/*  124 */   private DecimalField fieldI01ACMACC = null;
/*  125 */   private DecimalField fieldI01STADT1 = null;
/*  126 */   private DecimalField fieldI01STADT2 = null;
/*  127 */   private DecimalField fieldI01STADT3 = null;
/*  128 */   private DecimalField fieldI01ACMCUN = null;
/*  129 */   private CharacterField fieldI01CUSNA1 = null;
/*  130 */   private CharacterField fieldI01CUSNA2 = null;
/*  131 */   private CharacterField fieldI01CUSNA3 = null;
/*  132 */   private CharacterField fieldI01CUSNA4 = null;
/*  133 */   private CharacterField fieldI01CUSCTY = null;
/*  134 */   private CharacterField fieldI01DSCATY = null;
/*  135 */   private CharacterField fieldI01DSCPRO = null;
/*  136 */   private CharacterField fieldI01DSCOFC = null;
/*  137 */   private DecimalField fieldI01BEGBAL = null;
/*  138 */   private DecimalField fieldI01ENDBAL = null;
/*  139 */   private DecimalField fieldI01BATDT1 = null;
/*  140 */   private DecimalField fieldI01BATDT2 = null;
/*  141 */   private DecimalField fieldI01BATDT3 = null;
/*  142 */   private DecimalField fieldI01VALDT1 = null;
/*  143 */   private DecimalField fieldI01VALDT2 = null;
/*  144 */   private DecimalField fieldI01VALDT3 = null;
/*  145 */   private CharacterField fieldI01TRNCDE = null;
/*  146 */   private DecimalField fieldI01NUMCHK = null;
/*  147 */   private CharacterField fieldI01NARRAT = null;
/*  148 */   private DecimalField fieldI01DEBITS = null;
/*  149 */   private DecimalField fieldI01CREDIT = null;
/*  150 */   private DecimalField fieldI01BALANC = null;
/*  151 */   private DecimalField fieldI01BALGBL = null;
/*  152 */   private DecimalField fieldI01BALUNC = null;
/*  153 */   private DecimalField fieldI01BALHLD = null;
/*  154 */   private DecimalField fieldI01BALNBL = null;
/*  155 */   private CharacterField fieldI01CUSIDN = null;
/*  156 */   private CharacterField fieldI01CUSTID = null;
/*  157 */   private DecimalField fieldI01NUMREC = null;
/*  158 */   private CharacterField fieldI01INDOPE = null;
/*      */ 
/*      */   public IIN091801Message()
/*      */   {
/*  165 */     createFields();
/*  166 */     initialize();
/*      */   }
/*      */ 
/*      */   protected void createFields()
/*      */   {
/*  175 */     this.recordsize = 600;
/*  176 */     this.fileid = "1060616163339";
/*  177 */     this.recordid = "43F9E67700639";
/*  178 */     this.message = new byte[getByteLength()];
/*  179 */     this.formatname = "IIN091801";
/*  180 */     this.fieldnames = fldnames;
/*  181 */     this.tagnames = tnames;
/*  182 */     this.fields = new MessageField[44];
/*      */      this.fields[0]=this.fieldH01USERID=new CharacterField(this.message, 10, 10, "H01USERID");
/*      */      this.fields[1]=this.fieldH01PROGRM=new CharacterField(this.message, 20, 10, "H01PROGRM");
/*      */      this.fields[2]=this.fieldH01TIMSYS=new CharacterField(this.message, 30, 12, "H01TIMSYS");
/*      */      this.fields[3]=this.fieldH01SCRCOD=new CharacterField(this.message, 42, 2, "H01SCRCOD");
/*      */      this.fields[4]=this.fieldH01OPECOD=new CharacterField(this.message, 44, 4, "H01OPECOD");
/*      */      this.fields[5]=this.fieldH01FLGMAS=new CharacterField(this.message, 48, 1, "H01FLGMAS");
/*      */      this.fields[6]=this.fieldH01FLGWK1=new CharacterField(this.message, 49, 1, "H01FLGWK1");
/*      */      this.fields[7]=this.fieldH01FLGWK2=new CharacterField(this.message, 50, 1, "H01FLGWK2");
/*      */      this.fields[8]=this.fieldH01FLGWK3=new CharacterField(this.message, 51, 1, "H01FLGWK3");
/*      */      this.fields[9]=this.fieldI01ACMACC=new DecimalField(this.message, 52, 13, 0, "I01ACMACC");
/*      */      this.fields[10]=this.fieldI01STADT1=new DecimalField(this.message, 65, 3, 0, "I01STADT1");
/*      */      this.fields[11]=this.fieldI01STADT2=new DecimalField(this.message, 68, 3, 0, "I01STADT2");
/*      */      this.fields[12]=this.fieldI01STADT3=new DecimalField(this.message, 71, 3, 0, "I01STADT3");
/*      */      this.fields[13]=this.fieldI01ACMCUN=new DecimalField(this.message, 74, 10, 0, "I01ACMCUN");
/*      */      this.fields[14]=this.fieldI01CUSNA1=new CharacterField(this.message, 84, 45, "I01CUSNA1");
/*      */      this.fields[15]=this.fieldI01CUSNA2=new CharacterField(this.message, 129, 35, "I01CUSNA2");
/*      */      this.fields[16]=this.fieldI01CUSNA3=new CharacterField(this.message, 164, 35, "I01CUSNA3");
/*      */      this.fields[17]=this.fieldI01CUSNA4=new CharacterField(this.message, 199, 35, "I01CUSNA4");
/*      */      this.fields[18]=this.fieldI01CUSCTY=new CharacterField(this.message, 234, 30, "I01CUSCTY");
/*      */      this.fields[19]=this.fieldI01DSCATY=new CharacterField(this.message, 264, 35, "I01DSCATY");
/*      */      this.fields[20]=this.fieldI01DSCPRO=new CharacterField(this.message, 299, 35, "I01DSCPRO");
/*      */      this.fields[21]=this.fieldI01DSCOFC=new CharacterField(this.message, 334, 35, "I01DSCOFC");
/*      */      this.fields[22]=this.fieldI01BEGBAL=new DecimalField(this.message, 369, 17, 2, "I01BEGBAL");
/*      */      this.fields[23]=this.fieldI01ENDBAL=new DecimalField(this.message, 386, 17, 2, "I01ENDBAL");
/*      */      this.fields[24]=this.fieldI01BATDT1=new DecimalField(this.message, 403, 3, 0, "I01BATDT1");
/*      */      this.fields[25]=this.fieldI01BATDT2=new DecimalField(this.message, 406, 3, 0, "I01BATDT2");
/*      */      this.fields[26]=this.fieldI01BATDT3=new DecimalField(this.message, 409, 3, 0, "I01BATDT3");
/*      */      this.fields[27]=this.fieldI01VALDT1=new DecimalField(this.message, 412, 3, 0, "I01VALDT1");
/*      */      this.fields[28]=this.fieldI01VALDT2=new DecimalField(this.message, 415, 3, 0, "I01VALDT2");
/*      */      this.fields[29]=this.fieldI01VALDT3=new DecimalField(this.message, 418, 3, 0, "I01VALDT3");
/*      */      this.fields[30]=this.fieldI01TRNCDE=new CharacterField(this.message, 421, 2, "I01TRNCDE");
/*      */      this.fields[31]=this.fieldI01NUMCHK=new DecimalField(this.message, 423, 10, 0, "I01NUMCHK");
/*      */      this.fields[32]=this.fieldI01NARRAT=new CharacterField(this.message, 433, 30, "I01NARRAT");
/*      */      this.fields[33]=this.fieldI01DEBITS=new DecimalField(this.message, 463, 17, 2, "I01DEBITS");
/*      */      this.fields[34]=this.fieldI01CREDIT=new DecimalField(this.message, 480, 17, 2, "I01CREDIT");
/*      */      this.fields[35]=this.fieldI01BALANC=new DecimalField(this.message, 497, 17, 2, "I01BALANC");
/*      */      this.fields[36]=this.fieldI01BALGBL=new DecimalField(this.message, 514, 17, 2, "I01BALGBL");
/*      */      this.fields[37]=this.fieldI01BALUNC=new DecimalField(this.message, 531, 17, 2, "I01BALUNC");
/*      */      this.fields[38]=this.fieldI01BALHLD=new DecimalField(this.message, 548, 17, 2, "I01BALHLD");
/*      */      this.fields[39]=this.fieldI01BALNBL=new DecimalField(this.message, 565, 17, 2, "I01BALNBL");
/*      */      this.fields[40]=this.fieldI01CUSIDN=new CharacterField(this.message, 582, 15, "I01CUSIDN");
/*      */      this.fields[41]=this.fieldI01CUSTID=new CharacterField(this.message, 597, 4, "I01CUSTID");
/*      */      this.fields[42]=this.fieldI01NUMREC=new DecimalField(this.message, 601, 8, 0, "I01NUMREC");
/*      */      this.fields[43]=this.fieldI01INDOPE=new CharacterField(this.message, 609, 1, "I01INDOPE");
/*      */ 
/*  273 */     synchronized (tlookup)
/*      */     {
/*  275 */       if (tlookup.isEmpty())
/*      */       {
/*  277 */         for (int i = 0; i < tnames.length; i++) {
/*  278 */           tlookup.put(tnames[i], new Integer(i));
/*      */         }
/*      */       }
/*      */     }
/*  282 */     this.taglookup = tlookup;
/*      */   }
/*      */ 
/*      */   public void setH01USERID(String newvalue)
/*      */   {
/*  290 */     this.fieldH01USERID.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getH01USERID()
/*      */   {
/*  298 */     return this.fieldH01USERID.getString();
/*      */   }
/*      */ 
/*      */   public void setH01PROGRM(String newvalue)
/*      */   {
/*  306 */     this.fieldH01PROGRM.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getH01PROGRM()
/*      */   {
/*  314 */     return this.fieldH01PROGRM.getString();
/*      */   }
/*      */ 
/*      */   public void setH01TIMSYS(String newvalue)
/*      */   {
/*  322 */     this.fieldH01TIMSYS.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getH01TIMSYS()
/*      */   {
/*  330 */     return this.fieldH01TIMSYS.getString();
/*      */   }
/*      */ 
/*      */   public void setH01SCRCOD(String newvalue)
/*      */   {
/*  338 */     this.fieldH01SCRCOD.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getH01SCRCOD()
/*      */   {
/*  346 */     return this.fieldH01SCRCOD.getString();
/*      */   }
/*      */ 
/*      */   public void setH01OPECOD(String newvalue)
/*      */   {
/*  354 */     this.fieldH01OPECOD.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getH01OPECOD()
/*      */   {
/*  362 */     return this.fieldH01OPECOD.getString();
/*      */   }
/*      */ 
/*      */   public void setH01FLGMAS(String newvalue)
/*      */   {
/*  370 */     this.fieldH01FLGMAS.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getH01FLGMAS()
/*      */   {
/*  378 */     return this.fieldH01FLGMAS.getString();
/*      */   }
/*      */ 
/*      */   public void setH01FLGWK1(String newvalue)
/*      */   {
/*  386 */     this.fieldH01FLGWK1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getH01FLGWK1()
/*      */   {
/*  394 */     return this.fieldH01FLGWK1.getString();
/*      */   }
/*      */ 
/*      */   public void setH01FLGWK2(String newvalue)
/*      */   {
/*  402 */     this.fieldH01FLGWK2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getH01FLGWK2()
/*      */   {
/*  410 */     return this.fieldH01FLGWK2.getString();
/*      */   }
/*      */ 
/*      */   public void setH01FLGWK3(String newvalue)
/*      */   {
/*  418 */     this.fieldH01FLGWK3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getH01FLGWK3()
/*      */   {
/*  426 */     return this.fieldH01FLGWK3.getString();
/*      */   }
/*      */ 
/*      */   public void setI01ACMACC(String newvalue)
/*      */   {
/*  434 */     this.fieldI01ACMACC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01ACMACC()
/*      */   {
/*  442 */     return this.fieldI01ACMACC.getString();
/*      */   }
/*      */ 
/*      */   public void setI01ACMACC(BigDecimal newvalue)
/*      */   {
/*  450 */     this.fieldI01ACMACC.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalI01ACMACC()
/*      */   {
/*  458 */     return this.fieldI01ACMACC.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setI01STADT1(String newvalue)
/*      */   {
/*  466 */     this.fieldI01STADT1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01STADT1()
/*      */   {
/*  474 */     return this.fieldI01STADT1.getString();
/*      */   }
/*      */ 
/*      */   public void setI01STADT1(BigDecimal newvalue)
/*      */   {
/*  482 */     this.fieldI01STADT1.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalI01STADT1()
/*      */   {
/*  490 */     return this.fieldI01STADT1.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setI01STADT2(String newvalue)
/*      */   {
/*  498 */     this.fieldI01STADT2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01STADT2()
/*      */   {
/*  506 */     return this.fieldI01STADT2.getString();
/*      */   }
/*      */ 
/*      */   public void setI01STADT2(BigDecimal newvalue)
/*      */   {
/*  514 */     this.fieldI01STADT2.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalI01STADT2()
/*      */   {
/*  522 */     return this.fieldI01STADT2.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setI01STADT3(String newvalue)
/*      */   {
/*  530 */     this.fieldI01STADT3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01STADT3()
/*      */   {
/*  538 */     return this.fieldI01STADT3.getString();
/*      */   }
/*      */ 
/*      */   public void setI01STADT3(BigDecimal newvalue)
/*      */   {
/*  546 */     this.fieldI01STADT3.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalI01STADT3()
/*      */   {
/*  554 */     return this.fieldI01STADT3.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setI01ACMCUN(String newvalue)
/*      */   {
/*  562 */     this.fieldI01ACMCUN.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01ACMCUN()
/*      */   {
/*  570 */     return this.fieldI01ACMCUN.getString();
/*      */   }
/*      */ 
/*      */   public void setI01ACMCUN(BigDecimal newvalue)
/*      */   {
/*  578 */     this.fieldI01ACMCUN.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalI01ACMCUN()
/*      */   {
/*  586 */     return this.fieldI01ACMCUN.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setI01CUSNA1(String newvalue)
/*      */   {
/*  594 */     this.fieldI01CUSNA1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01CUSNA1()
/*      */   {
/*  602 */     return this.fieldI01CUSNA1.getString();
/*      */   }
/*      */ 
/*      */   public void setI01CUSNA2(String newvalue)
/*      */   {
/*  610 */     this.fieldI01CUSNA2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01CUSNA2()
/*      */   {
/*  618 */     return this.fieldI01CUSNA2.getString();
/*      */   }
/*      */ 
/*      */   public void setI01CUSNA3(String newvalue)
/*      */   {
/*  626 */     this.fieldI01CUSNA3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01CUSNA3()
/*      */   {
/*  634 */     return this.fieldI01CUSNA3.getString();
/*      */   }
/*      */ 
/*      */   public void setI01CUSNA4(String newvalue)
/*      */   {
/*  642 */     this.fieldI01CUSNA4.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01CUSNA4()
/*      */   {
/*  650 */     return this.fieldI01CUSNA4.getString();
/*      */   }
/*      */ 
/*      */   public void setI01CUSCTY(String newvalue)
/*      */   {
/*  658 */     this.fieldI01CUSCTY.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01CUSCTY()
/*      */   {
/*  666 */     return this.fieldI01CUSCTY.getString();
/*      */   }
/*      */ 
/*      */   public void setI01DSCATY(String newvalue)
/*      */   {
/*  674 */     this.fieldI01DSCATY.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01DSCATY()
/*      */   {
/*  682 */     return this.fieldI01DSCATY.getString();
/*      */   }
/*      */ 
/*      */   public void setI01DSCPRO(String newvalue)
/*      */   {
/*  690 */     this.fieldI01DSCPRO.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01DSCPRO()
/*      */   {
/*  698 */     return this.fieldI01DSCPRO.getString();
/*      */   }
/*      */ 
/*      */   public void setI01DSCOFC(String newvalue)
/*      */   {
/*  706 */     this.fieldI01DSCOFC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01DSCOFC()
/*      */   {
/*  714 */     return this.fieldI01DSCOFC.getString();
/*      */   }
/*      */ 
/*      */   public void setI01BEGBAL(String newvalue)
/*      */   {
/*  722 */     this.fieldI01BEGBAL.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01BEGBAL()
/*      */   {
/*  730 */     return this.fieldI01BEGBAL.getString();
/*      */   }
/*      */ 
/*      */   public void setI01BEGBAL(BigDecimal newvalue)
/*      */   {
/*  738 */     this.fieldI01BEGBAL.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalI01BEGBAL()
/*      */   {
/*  746 */     return this.fieldI01BEGBAL.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setI01ENDBAL(String newvalue)
/*      */   {
/*  754 */     this.fieldI01ENDBAL.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01ENDBAL()
/*      */   {
/*  762 */     return this.fieldI01ENDBAL.getString();
/*      */   }
/*      */ 
/*      */   public void setI01ENDBAL(BigDecimal newvalue)
/*      */   {
/*  770 */     this.fieldI01ENDBAL.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalI01ENDBAL()
/*      */   {
/*  778 */     return this.fieldI01ENDBAL.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setI01BATDT1(String newvalue)
/*      */   {
/*  786 */     this.fieldI01BATDT1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01BATDT1()
/*      */   {
/*  794 */     return this.fieldI01BATDT1.getString();
/*      */   }
/*      */ 
/*      */   public void setI01BATDT1(BigDecimal newvalue)
/*      */   {
/*  802 */     this.fieldI01BATDT1.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalI01BATDT1()
/*      */   {
/*  810 */     return this.fieldI01BATDT1.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setI01BATDT2(String newvalue)
/*      */   {
/*  818 */     this.fieldI01BATDT2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01BATDT2()
/*      */   {
/*  826 */     return this.fieldI01BATDT2.getString();
/*      */   }
/*      */ 
/*      */   public void setI01BATDT2(BigDecimal newvalue)
/*      */   {
/*  834 */     this.fieldI01BATDT2.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalI01BATDT2()
/*      */   {
/*  842 */     return this.fieldI01BATDT2.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setI01BATDT3(String newvalue)
/*      */   {
/*  850 */     this.fieldI01BATDT3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01BATDT3()
/*      */   {
/*  858 */     return this.fieldI01BATDT3.getString();
/*      */   }
/*      */ 
/*      */   public void setI01BATDT3(BigDecimal newvalue)
/*      */   {
/*  866 */     this.fieldI01BATDT3.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalI01BATDT3()
/*      */   {
/*  874 */     return this.fieldI01BATDT3.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setI01VALDT1(String newvalue)
/*      */   {
/*  882 */     this.fieldI01VALDT1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01VALDT1()
/*      */   {
/*  890 */     return this.fieldI01VALDT1.getString();
/*      */   }
/*      */ 
/*      */   public void setI01VALDT1(BigDecimal newvalue)
/*      */   {
/*  898 */     this.fieldI01VALDT1.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalI01VALDT1()
/*      */   {
/*  906 */     return this.fieldI01VALDT1.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setI01VALDT2(String newvalue)
/*      */   {
/*  914 */     this.fieldI01VALDT2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01VALDT2()
/*      */   {
/*  922 */     return this.fieldI01VALDT2.getString();
/*      */   }
/*      */ 
/*      */   public void setI01VALDT2(BigDecimal newvalue)
/*      */   {
/*  930 */     this.fieldI01VALDT2.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalI01VALDT2()
/*      */   {
/*  938 */     return this.fieldI01VALDT2.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setI01VALDT3(String newvalue)
/*      */   {
/*  946 */     this.fieldI01VALDT3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01VALDT3()
/*      */   {
/*  954 */     return this.fieldI01VALDT3.getString();
/*      */   }
/*      */ 
/*      */   public void setI01VALDT3(BigDecimal newvalue)
/*      */   {
/*  962 */     this.fieldI01VALDT3.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalI01VALDT3()
/*      */   {
/*  970 */     return this.fieldI01VALDT3.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setI01TRNCDE(String newvalue)
/*      */   {
/*  978 */     this.fieldI01TRNCDE.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01TRNCDE()
/*      */   {
/*  986 */     return this.fieldI01TRNCDE.getString();
/*      */   }
/*      */ 
/*      */   public void setI01NUMCHK(String newvalue)
/*      */   {
/*  994 */     this.fieldI01NUMCHK.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01NUMCHK()
/*      */   {
/* 1002 */     return this.fieldI01NUMCHK.getString();
/*      */   }
/*      */ 
/*      */   public void setI01NUMCHK(BigDecimal newvalue)
/*      */   {
/* 1010 */     this.fieldI01NUMCHK.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalI01NUMCHK()
/*      */   {
/* 1018 */     return this.fieldI01NUMCHK.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setI01NARRAT(String newvalue)
/*      */   {
/* 1026 */     this.fieldI01NARRAT.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01NARRAT()
/*      */   {
/* 1034 */     return this.fieldI01NARRAT.getString();
/*      */   }
/*      */ 
/*      */   public void setI01DEBITS(String newvalue)
/*      */   {
/* 1042 */     this.fieldI01DEBITS.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01DEBITS()
/*      */   {
/* 1050 */     return this.fieldI01DEBITS.getString();
/*      */   }
/*      */ 
/*      */   public void setI01DEBITS(BigDecimal newvalue)
/*      */   {
/* 1058 */     this.fieldI01DEBITS.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalI01DEBITS()
/*      */   {
/* 1066 */     return this.fieldI01DEBITS.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setI01CREDIT(String newvalue)
/*      */   {
/* 1074 */     this.fieldI01CREDIT.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01CREDIT()
/*      */   {
/* 1082 */     return this.fieldI01CREDIT.getString();
/*      */   }
/*      */ 
/*      */   public void setI01CREDIT(BigDecimal newvalue)
/*      */   {
/* 1090 */     this.fieldI01CREDIT.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalI01CREDIT()
/*      */   {
/* 1098 */     return this.fieldI01CREDIT.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setI01BALANC(String newvalue)
/*      */   {
/* 1106 */     this.fieldI01BALANC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01BALANC()
/*      */   {
/* 1114 */     return this.fieldI01BALANC.getString();
/*      */   }
/*      */ 
/*      */   public void setI01BALANC(BigDecimal newvalue)
/*      */   {
/* 1122 */     this.fieldI01BALANC.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalI01BALANC()
/*      */   {
/* 1130 */     return this.fieldI01BALANC.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setI01BALGBL(String newvalue)
/*      */   {
/* 1138 */     this.fieldI01BALGBL.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01BALGBL()
/*      */   {
/* 1146 */     return this.fieldI01BALGBL.getString();
/*      */   }
/*      */ 
/*      */   public void setI01BALGBL(BigDecimal newvalue)
/*      */   {
/* 1154 */     this.fieldI01BALGBL.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalI01BALGBL()
/*      */   {
/* 1162 */     return this.fieldI01BALGBL.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setI01BALUNC(String newvalue)
/*      */   {
/* 1170 */     this.fieldI01BALUNC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01BALUNC()
/*      */   {
/* 1178 */     return this.fieldI01BALUNC.getString();
/*      */   }
/*      */ 
/*      */   public void setI01BALUNC(BigDecimal newvalue)
/*      */   {
/* 1186 */     this.fieldI01BALUNC.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalI01BALUNC()
/*      */   {
/* 1194 */     return this.fieldI01BALUNC.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setI01BALHLD(String newvalue)
/*      */   {
/* 1202 */     this.fieldI01BALHLD.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01BALHLD()
/*      */   {
/* 1210 */     return this.fieldI01BALHLD.getString();
/*      */   }
/*      */ 
/*      */   public void setI01BALHLD(BigDecimal newvalue)
/*      */   {
/* 1218 */     this.fieldI01BALHLD.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalI01BALHLD()
/*      */   {
/* 1226 */     return this.fieldI01BALHLD.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setI01BALNBL(String newvalue)
/*      */   {
/* 1234 */     this.fieldI01BALNBL.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01BALNBL()
/*      */   {
/* 1242 */     return this.fieldI01BALNBL.getString();
/*      */   }
/*      */ 
/*      */   public void setI01BALNBL(BigDecimal newvalue)
/*      */   {
/* 1250 */     this.fieldI01BALNBL.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalI01BALNBL()
/*      */   {
/* 1258 */     return this.fieldI01BALNBL.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setI01CUSIDN(String newvalue)
/*      */   {
/* 1266 */     this.fieldI01CUSIDN.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01CUSIDN()
/*      */   {
/* 1274 */     return this.fieldI01CUSIDN.getString();
/*      */   }
/*      */ 
/*      */   public void setI01CUSTID(String newvalue)
/*      */   {
/* 1282 */     this.fieldI01CUSTID.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01CUSTID()
/*      */   {
/* 1290 */     return this.fieldI01CUSTID.getString();
/*      */   }
/*      */ 
/*      */   public void setI01NUMREC(String newvalue)
/*      */   {
/* 1298 */     this.fieldI01NUMREC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01NUMREC()
/*      */   {
/* 1306 */     return this.fieldI01NUMREC.getString();
/*      */   }
/*      */ 
/*      */   public void setI01NUMREC(BigDecimal newvalue)
/*      */   {
/* 1314 */     this.fieldI01NUMREC.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalI01NUMREC()
/*      */   {
/* 1322 */     return this.fieldI01NUMREC.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setI01INDOPE(String newvalue)
/*      */   {
/* 1330 */     this.fieldI01INDOPE.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01INDOPE()
/*      */   {
/* 1338 */     return this.fieldI01INDOPE.getString();
/*      */   }
/*      */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.IIN091801Message
 * JD-Core Version:    0.6.0
 */