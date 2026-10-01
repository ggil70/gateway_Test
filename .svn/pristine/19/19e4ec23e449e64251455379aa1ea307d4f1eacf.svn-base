/*      */ package com.activo.gateway.dibs.messages;
/*      */ 
/*      */ import java.math.BigDecimal;
import java.util.Hashtable;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*      */ 
/*      */ public class ESS205001Message extends MessageRecord
/*      */ {
/*   18 */   static final String[] fldnames = { 
/*   19 */     "H01USERID", 
/*   20 */     "H01PROGRM", 
/*   21 */     "H01TIMSYS", 
/*   22 */     "H01SCRCOD", 
/*   23 */     "H01OPECOD", 
/*   24 */     "H01SUBCOD", 
/*   25 */     "H01FLGMAS", 
/*   26 */     "H01FLGWK1", 
/*   27 */     "H01FLGWK2", 
/*   28 */     "H01FLGWK3", 
/*   29 */     "H01QSTNUM", 
/*   30 */     "E01CUSIDN", 
/*   31 */     "E01CUSCUN", 
/*   32 */     "E01RQSNO1", 
/*   33 */     "E01RQSNO2", 
/*   34 */     "E01RQSNO3", 
/*   35 */     "E01RQSNO4", 
/*   36 */     "E01RQSNO5", 
/*   37 */     "E01RQSNO6", 
/*   38 */     "E01RQSVL1", 
/*   39 */     "E01RQSVL2", 
/*   40 */     "E01RQSVL3", 
/*   41 */     "E01RQSVL4", 
/*   42 */     "E01RQSVL5", 
/*   43 */     "E01RQSVL6", 
/*   44 */     "E01RQSRP1", 
/*   45 */     "E01RQSRP2", 
/*   46 */     "E01RQSRP3", 
/*   47 */     "E01RQSRP4", 
/*   48 */     "E01RQSRP5", 
/*   49 */     "E01RQSRP6", 
/*   50 */     "E01RQSDF1", 
/*   51 */     "E01RQSDF2", 
/*   52 */     "E01RQSDF3", 
/*   53 */     "E01RQSDF4", 
/*   54 */     "E01RQSDF5", 
/*   55 */     "E01RQSDF6", 
/*   56 */     "E01RQSCR1", 
/*   57 */     "E01RQSCR2", 
/*   58 */     "E01RQSCR3", 
/*   59 */     "E01RQSCR4", 
/*   60 */     "E01RQSCR5", 
/*   61 */     "E01RQSCR6", 
/*   62 */     "E01CUSNA1", 
/*   63 */     "E01EUSUSR", 
/*   64 */     "E01EUSSTS", 
/*   65 */     "E01BLKTYP" };
/*      */ 
/*   67 */   static final String[] tnames = { 
/*   68 */     "H01USERID", 
/*   69 */     "H01PROGRM", 
/*   70 */     "H01TIMSYS", 
/*   71 */     "H01SCRCOD", 
/*   72 */     "H01OPECOD", 
/*   73 */     "H01SUBCOD", 
/*   74 */     "H01FLGMAS", 
/*   75 */     "H01FLGWK1", 
/*   76 */     "H01FLGWK2", 
/*   77 */     "H01FLGWK3", 
/*   78 */     "H01QSTNUM", 
/*   79 */     "E01CUSIDN", 
/*   80 */     "E01CUSCUN", 
/*   81 */     "E01RQSNO1", 
/*   82 */     "E01RQSNO2", 
/*   83 */     "E01RQSNO3", 
/*   84 */     "E01RQSNO4", 
/*   85 */     "E01RQSNO5", 
/*   86 */     "E01RQSNO6", 
/*   87 */     "E01RQSVL1", 
/*   88 */     "E01RQSVL2", 
/*   89 */     "E01RQSVL3", 
/*   90 */     "E01RQSVL4", 
/*   91 */     "E01RQSVL5", 
/*   92 */     "E01RQSVL6", 
/*   93 */     "E01RQSRP1", 
/*   94 */     "E01RQSRP2", 
/*   95 */     "E01RQSRP3", 
/*   96 */     "E01RQSRP4", 
/*   97 */     "E01RQSRP5", 
/*   98 */     "E01RQSRP6", 
/*   99 */     "E01RQSDF1", 
/*  100 */     "E01RQSDF2", 
/*  101 */     "E01RQSDF3", 
/*  102 */     "E01RQSDF4", 
/*  103 */     "E01RQSDF5", 
/*  104 */     "E01RQSDF6", 
/*  105 */     "E01RQSCR1", 
/*  106 */     "E01RQSCR2", 
/*  107 */     "E01RQSCR3", 
/*  108 */     "E01RQSCR4", 
/*  109 */     "E01RQSCR5", 
/*  110 */     "E01RQSCR6", 
/*  111 */     "E01CUSNA1", 
/*  112 */     "E01EUSUSR", 
/*  113 */     "E01EUSSTS", 
/*  114 */     "E01BLKTYP" };
/*      */   static final String fid = "1120113143013";
/*      */   static final String rid = "3A43780969C53";
/*      */   static final String fmtname = "ESS205001";
/*  119 */   final int FIELDCOUNT = 47;
/*  120 */   private static Hashtable tlookup = new Hashtable();
/*  121 */   private CharacterField fieldH01USERID = null;
/*  122 */   private CharacterField fieldH01PROGRM = null;
/*  123 */   private CharacterField fieldH01TIMSYS = null;
/*  124 */   private CharacterField fieldH01SCRCOD = null;
/*  125 */   private CharacterField fieldH01OPECOD = null;
/*  126 */   private CharacterField fieldH01SUBCOD = null;
/*  127 */   private CharacterField fieldH01FLGMAS = null;
/*  128 */   private CharacterField fieldH01FLGWK1 = null;
/*  129 */   private CharacterField fieldH01FLGWK2 = null;
/*  130 */   private CharacterField fieldH01FLGWK3 = null;
/*  131 */   private DecimalField fieldH01QSTNUM = null;
/*  132 */   private CharacterField fieldE01CUSIDN = null;
/*  133 */   private DecimalField fieldE01CUSCUN = null;
/*  134 */   private DecimalField fieldE01RQSNO1 = null;
/*  135 */   private DecimalField fieldE01RQSNO2 = null;
/*  136 */   private DecimalField fieldE01RQSNO3 = null;
/*  137 */   private DecimalField fieldE01RQSNO4 = null;
/*  138 */   private DecimalField fieldE01RQSNO5 = null;
/*  139 */   private DecimalField fieldE01RQSNO6 = null;
/*  140 */   private CharacterField fieldE01RQSVL1 = null;
/*  141 */   private CharacterField fieldE01RQSVL2 = null;
/*  142 */   private CharacterField fieldE01RQSVL3 = null;
/*  143 */   private CharacterField fieldE01RQSVL4 = null;
/*  144 */   private CharacterField fieldE01RQSVL5 = null;
/*  145 */   private CharacterField fieldE01RQSVL6 = null;
/*  146 */   private CharacterField fieldE01RQSRP1 = null;
/*  147 */   private CharacterField fieldE01RQSRP2 = null;
/*  148 */   private CharacterField fieldE01RQSRP3 = null;
/*  149 */   private CharacterField fieldE01RQSRP4 = null;
/*  150 */   private CharacterField fieldE01RQSRP5 = null;
/*  151 */   private CharacterField fieldE01RQSRP6 = null;
/*  152 */   private CharacterField fieldE01RQSDF1 = null;
/*  153 */   private CharacterField fieldE01RQSDF2 = null;
/*  154 */   private CharacterField fieldE01RQSDF3 = null;
/*  155 */   private CharacterField fieldE01RQSDF4 = null;
/*  156 */   private CharacterField fieldE01RQSDF5 = null;
/*  157 */   private CharacterField fieldE01RQSDF6 = null;
/*  158 */   private CharacterField fieldE01RQSCR1 = null;
/*  159 */   private CharacterField fieldE01RQSCR2 = null;
/*  160 */   private CharacterField fieldE01RQSCR3 = null;
/*  161 */   private CharacterField fieldE01RQSCR4 = null;
/*  162 */   private CharacterField fieldE01RQSCR5 = null;
/*  163 */   private CharacterField fieldE01RQSCR6 = null;
/*  164 */   private CharacterField fieldE01CUSNA1 = null;
/*  165 */   private CharacterField fieldE01EUSUSR = null;
/*  166 */   private CharacterField fieldE01EUSSTS = null;
/*  167 */   private CharacterField fieldE01BLKTYP = null;
/*      */ 
/*      */   public ESS205001Message()
/*      */   {
/*  174 */     createFields();
/*  175 */     initialize();
/*      */   }
/*      */ 
/*      */   protected void createFields()
/*      */   {
/*  184 */     this.recordsize = 884;
/*  185 */     this.fileid = "1120113143013";
/*  186 */     this.recordid = "3A43780969C53";
/*  187 */     this.message = new byte[getByteLength()];
/*  188 */     this.formatname = "ESS205001";
/*  189 */     this.fieldnames = fldnames;
/*  190 */     this.tagnames = tnames;
/*  191 */     this.fields = new MessageField[47];
/*      */      this.fields[0]=this.fieldH01USERID=new CharacterField(this.message, 10, 10, "H01USERID");
/*      */      this.fields[1]=this.fieldH01PROGRM=new CharacterField(this.message, 20, 10, "H01PROGRM");
/*      */      this.fields[2]=this.fieldH01TIMSYS=new CharacterField(this.message, 30, 12, "H01TIMSYS");
/*      */      this.fields[3]=this.fieldH01SCRCOD=new CharacterField(this.message, 42, 2, "H01SCRCOD");
/*      */      this.fields[4]=this.fieldH01OPECOD=new CharacterField(this.message, 44, 4, "H01OPECOD");
/*      */      this.fields[5]=this.fieldH01SUBCOD=new CharacterField(this.message, 48, 4, "H01SUBCOD");
/*      */      this.fields[6]=this.fieldH01FLGMAS=new CharacterField(this.message, 52, 1, "H01FLGMAS");
/*      */      this.fields[7]=this.fieldH01FLGWK1=new CharacterField(this.message, 53, 1, "H01FLGWK1");
/*      */      this.fields[8]=this.fieldH01FLGWK2=new CharacterField(this.message, 54, 1, "H01FLGWK2");
/*      */      this.fields[9]=this.fieldH01FLGWK3=new CharacterField(this.message, 55, 1, "H01FLGWK3");
/*      */      this.fields[10]=this.fieldH01QSTNUM=new DecimalField(this.message, 56, 3, 0, "H01QSTNUM");
/*      */      this.fields[11]=this.fieldE01CUSIDN=new CharacterField(this.message, 59, 15, "E01CUSIDN");
/*      */      this.fields[12]=this.fieldE01CUSCUN=new DecimalField(this.message, 74, 10, 0, "E01CUSCUN");
/*      */      this.fields[13]=this.fieldE01RQSNO1=new DecimalField(this.message, 84, 3, 0, "E01RQSNO1");
/*      */      this.fields[14]=this.fieldE01RQSNO2=new DecimalField(this.message, 87, 3, 0, "E01RQSNO2");
/*      */      this.fields[15]=this.fieldE01RQSNO3=new DecimalField(this.message, 90, 3, 0, "E01RQSNO3");
/*      */      this.fields[16]=this.fieldE01RQSNO4=new DecimalField(this.message, 93, 3, 0, "E01RQSNO4");
/*      */      this.fields[17]=this.fieldE01RQSNO5=new DecimalField(this.message, 96, 3, 0, "E01RQSNO5");
/*      */      this.fields[18]=this.fieldE01RQSNO6=new DecimalField(this.message, 99, 3, 0, "E01RQSNO6");
/*      */      this.fields[19]=this.fieldE01RQSVL1=new CharacterField(this.message, 102, 60, "E01RQSVL1");
/*      */      this.fields[20]=this.fieldE01RQSVL2=new CharacterField(this.message, 162, 60, "E01RQSVL2");
/*      */      this.fields[21]=this.fieldE01RQSVL3=new CharacterField(this.message, 222, 60, "E01RQSVL3");
/*      */      this.fields[22]=this.fieldE01RQSVL4=new CharacterField(this.message, 282, 60, "E01RQSVL4");
/*      */      this.fields[23]=this.fieldE01RQSVL5=new CharacterField(this.message, 342, 60, "E01RQSVL5");
/*      */      this.fields[24]=this.fieldE01RQSVL6=new CharacterField(this.message, 402, 60, "E01RQSVL6");
/*      */      this.fields[25]=this.fieldE01RQSRP1=new CharacterField(this.message, 462, 60, "E01RQSRP1");
/*      */      this.fields[26]=this.fieldE01RQSRP2=new CharacterField(this.message, 522, 60, "E01RQSRP2");
/*      */      this.fields[27]=this.fieldE01RQSRP3=new CharacterField(this.message, 582, 60, "E01RQSRP3");
/*      */      this.fields[28]=this.fieldE01RQSRP4=new CharacterField(this.message, 642, 60, "E01RQSRP4");
/*      */      this.fields[29]=this.fieldE01RQSRP5=new CharacterField(this.message, 702, 60, "E01RQSRP5");
/*      */      this.fields[30]=this.fieldE01RQSRP6=new CharacterField(this.message, 762, 60, "E01RQSRP6");
/*      */      this.fields[31]=this.fieldE01RQSDF1=new CharacterField(this.message, 822, 1, "E01RQSDF1");
/*      */      this.fields[32]=this.fieldE01RQSDF2=new CharacterField(this.message, 823, 1, "E01RQSDF2");
/*      */      this.fields[33]=this.fieldE01RQSDF3=new CharacterField(this.message, 824, 1, "E01RQSDF3");
/*      */      this.fields[34]=this.fieldE01RQSDF4=new CharacterField(this.message, 825, 1, "E01RQSDF4");
/*      */      this.fields[35]=this.fieldE01RQSDF5=new CharacterField(this.message, 826, 1, "E01RQSDF5");
/*      */      this.fields[36]=this.fieldE01RQSDF6=new CharacterField(this.message, 827, 1, "E01RQSDF6");
/*      */      this.fields[37]=this.fieldE01RQSCR1=new CharacterField(this.message, 828, 1, "E01RQSCR1");
/*      */      this.fields[38]=this.fieldE01RQSCR2=new CharacterField(this.message, 829, 1, "E01RQSCR2");
/*      */      this.fields[39]=this.fieldE01RQSCR3=new CharacterField(this.message, 830, 1, "E01RQSCR3");
/*      */      this.fields[40]=this.fieldE01RQSCR4=new CharacterField(this.message, 831, 1, "E01RQSCR4");
/*      */      this.fields[41]=this.fieldE01RQSCR5=new CharacterField(this.message, 832, 1, "E01RQSCR5");
/*      */      this.fields[42]=this.fieldE01RQSCR6=new CharacterField(this.message, 833, 1, "E01RQSCR6");
/*      */      this.fields[43]=this.fieldE01CUSNA1=new CharacterField(this.message, 834, 45, "E01CUSNA1");
/*      */      this.fields[44]=this.fieldE01EUSUSR=new CharacterField(this.message, 879, 10, "E01EUSUSR");
/*      */      this.fields[45]=this.fieldE01EUSSTS=new CharacterField(this.message, 889, 1, "E01EUSSTS");
/*      */      this.fields[46]=this.fieldE01BLKTYP=new CharacterField(this.message, 890, 4, "E01BLKTYP");
/*      */ 
/*  288 */     synchronized (tlookup)
/*      */     {
/*  290 */       if (tlookup.isEmpty())
/*      */       {
/*  292 */         for (int i = 0; i < tnames.length; i++) {
/*  293 */           tlookup.put(tnames[i], new Integer(i));
/*      */         }
/*      */       }
/*      */     }
/*  297 */     this.taglookup = tlookup;
/*      */   }
/*      */ 
/*      */   public void setH01USERID(String newvalue)
/*      */   {
/*  305 */     this.fieldH01USERID.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getH01USERID()
/*      */   {
/*  313 */     return this.fieldH01USERID.getString();
/*      */   }
/*      */ 
/*      */   public void setH01PROGRM(String newvalue)
/*      */   {
/*  321 */     this.fieldH01PROGRM.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getH01PROGRM()
/*      */   {
/*  329 */     return this.fieldH01PROGRM.getString();
/*      */   }
/*      */ 
/*      */   public void setH01TIMSYS(String newvalue)
/*      */   {
/*  337 */     this.fieldH01TIMSYS.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getH01TIMSYS()
/*      */   {
/*  345 */     return this.fieldH01TIMSYS.getString();
/*      */   }
/*      */ 
/*      */   public void setH01SCRCOD(String newvalue)
/*      */   {
/*  353 */     this.fieldH01SCRCOD.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getH01SCRCOD()
/*      */   {
/*  361 */     return this.fieldH01SCRCOD.getString();
/*      */   }
/*      */ 
/*      */   public void setH01OPECOD(String newvalue)
/*      */   {
/*  369 */     this.fieldH01OPECOD.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getH01OPECOD()
/*      */   {
/*  377 */     return this.fieldH01OPECOD.getString();
/*      */   }
/*      */ 
/*      */   public void setH01SUBCOD(String newvalue)
/*      */   {
/*  385 */     this.fieldH01SUBCOD.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getH01SUBCOD()
/*      */   {
/*  393 */     return this.fieldH01SUBCOD.getString();
/*      */   }
/*      */ 
/*      */   public void setH01FLGMAS(String newvalue)
/*      */   {
/*  401 */     this.fieldH01FLGMAS.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getH01FLGMAS()
/*      */   {
/*  409 */     return this.fieldH01FLGMAS.getString();
/*      */   }
/*      */ 
/*      */   public void setH01FLGWK1(String newvalue)
/*      */   {
/*  417 */     this.fieldH01FLGWK1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getH01FLGWK1()
/*      */   {
/*  425 */     return this.fieldH01FLGWK1.getString();
/*      */   }
/*      */ 
/*      */   public void setH01FLGWK2(String newvalue)
/*      */   {
/*  433 */     this.fieldH01FLGWK2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getH01FLGWK2()
/*      */   {
/*  441 */     return this.fieldH01FLGWK2.getString();
/*      */   }
/*      */ 
/*      */   public void setH01FLGWK3(String newvalue)
/*      */   {
/*  449 */     this.fieldH01FLGWK3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getH01FLGWK3()
/*      */   {
/*  457 */     return this.fieldH01FLGWK3.getString();
/*      */   }
/*      */ 
/*      */   public void setH01QSTNUM(String newvalue)
/*      */   {
/*  465 */     this.fieldH01QSTNUM.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getH01QSTNUM()
/*      */   {
/*  473 */     return this.fieldH01QSTNUM.getString();
/*      */   }
/*      */ 
/*      */   public void setH01QSTNUM(BigDecimal newvalue)
/*      */   {
/*  481 */     this.fieldH01QSTNUM.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalH01QSTNUM()
/*      */   {
/*  489 */     return this.fieldH01QSTNUM.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setE01CUSIDN(String newvalue)
/*      */   {
/*  497 */     this.fieldE01CUSIDN.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01CUSIDN()
/*      */   {
/*  505 */     return this.fieldE01CUSIDN.getString();
/*      */   }
/*      */ 
/*      */   public void setE01CUSCUN(String newvalue)
/*      */   {
/*  513 */     this.fieldE01CUSCUN.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01CUSCUN()
/*      */   {
/*  521 */     return this.fieldE01CUSCUN.getString();
/*      */   }
/*      */ 
/*      */   public void setE01CUSCUN(BigDecimal newvalue)
/*      */   {
/*  529 */     this.fieldE01CUSCUN.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE01CUSCUN()
/*      */   {
/*  537 */     return this.fieldE01CUSCUN.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setE01RQSNO1(String newvalue)
/*      */   {
/*  545 */     this.fieldE01RQSNO1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01RQSNO1()
/*      */   {
/*  553 */     return this.fieldE01RQSNO1.getString();
/*      */   }
/*      */ 
/*      */   public void setE01RQSNO1(BigDecimal newvalue)
/*      */   {
/*  561 */     this.fieldE01RQSNO1.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE01RQSNO1()
/*      */   {
/*  569 */     return this.fieldE01RQSNO1.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setE01RQSNO2(String newvalue)
/*      */   {
/*  577 */     this.fieldE01RQSNO2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01RQSNO2()
/*      */   {
/*  585 */     return this.fieldE01RQSNO2.getString();
/*      */   }
/*      */ 
/*      */   public void setE01RQSNO2(BigDecimal newvalue)
/*      */   {
/*  593 */     this.fieldE01RQSNO2.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE01RQSNO2()
/*      */   {
/*  601 */     return this.fieldE01RQSNO2.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setE01RQSNO3(String newvalue)
/*      */   {
/*  609 */     this.fieldE01RQSNO3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01RQSNO3()
/*      */   {
/*  617 */     return this.fieldE01RQSNO3.getString();
/*      */   }
/*      */ 
/*      */   public void setE01RQSNO3(BigDecimal newvalue)
/*      */   {
/*  625 */     this.fieldE01RQSNO3.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE01RQSNO3()
/*      */   {
/*  633 */     return this.fieldE01RQSNO3.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setE01RQSNO4(String newvalue)
/*      */   {
/*  641 */     this.fieldE01RQSNO4.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01RQSNO4()
/*      */   {
/*  649 */     return this.fieldE01RQSNO4.getString();
/*      */   }
/*      */ 
/*      */   public void setE01RQSNO4(BigDecimal newvalue)
/*      */   {
/*  657 */     this.fieldE01RQSNO4.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE01RQSNO4()
/*      */   {
/*  665 */     return this.fieldE01RQSNO4.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setE01RQSNO5(String newvalue)
/*      */   {
/*  673 */     this.fieldE01RQSNO5.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01RQSNO5()
/*      */   {
/*  681 */     return this.fieldE01RQSNO5.getString();
/*      */   }
/*      */ 
/*      */   public void setE01RQSNO5(BigDecimal newvalue)
/*      */   {
/*  689 */     this.fieldE01RQSNO5.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE01RQSNO5()
/*      */   {
/*  697 */     return this.fieldE01RQSNO5.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setE01RQSNO6(String newvalue)
/*      */   {
/*  705 */     this.fieldE01RQSNO6.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01RQSNO6()
/*      */   {
/*  713 */     return this.fieldE01RQSNO6.getString();
/*      */   }
/*      */ 
/*      */   public void setE01RQSNO6(BigDecimal newvalue)
/*      */   {
/*  721 */     this.fieldE01RQSNO6.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE01RQSNO6()
/*      */   {
/*  729 */     return this.fieldE01RQSNO6.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setE01RQSVL1(String newvalue)
/*      */   {
/*  737 */     this.fieldE01RQSVL1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01RQSVL1()
/*      */   {
/*  745 */     return this.fieldE01RQSVL1.getString();
/*      */   }
/*      */ 
/*      */   public void setE01RQSVL2(String newvalue)
/*      */   {
/*  753 */     this.fieldE01RQSVL2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01RQSVL2()
/*      */   {
/*  761 */     return this.fieldE01RQSVL2.getString();
/*      */   }
/*      */ 
/*      */   public void setE01RQSVL3(String newvalue)
/*      */   {
/*  769 */     this.fieldE01RQSVL3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01RQSVL3()
/*      */   {
/*  777 */     return this.fieldE01RQSVL3.getString();
/*      */   }
/*      */ 
/*      */   public void setE01RQSVL4(String newvalue)
/*      */   {
/*  785 */     this.fieldE01RQSVL4.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01RQSVL4()
/*      */   {
/*  793 */     return this.fieldE01RQSVL4.getString();
/*      */   }
/*      */ 
/*      */   public void setE01RQSVL5(String newvalue)
/*      */   {
/*  801 */     this.fieldE01RQSVL5.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01RQSVL5()
/*      */   {
/*  809 */     return this.fieldE01RQSVL5.getString();
/*      */   }
/*      */ 
/*      */   public void setE01RQSVL6(String newvalue)
/*      */   {
/*  817 */     this.fieldE01RQSVL6.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01RQSVL6()
/*      */   {
/*  825 */     return this.fieldE01RQSVL6.getString();
/*      */   }
/*      */ 
/*      */   public void setE01RQSRP1(String newvalue)
/*      */   {
/*  833 */     this.fieldE01RQSRP1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01RQSRP1()
/*      */   {
/*  841 */     return this.fieldE01RQSRP1.getString();
/*      */   }
/*      */ 
/*      */   public void setE01RQSRP2(String newvalue)
/*      */   {
/*  849 */     this.fieldE01RQSRP2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01RQSRP2()
/*      */   {
/*  857 */     return this.fieldE01RQSRP2.getString();
/*      */   }
/*      */ 
/*      */   public void setE01RQSRP3(String newvalue)
/*      */   {
/*  865 */     this.fieldE01RQSRP3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01RQSRP3()
/*      */   {
/*  873 */     return this.fieldE01RQSRP3.getString();
/*      */   }
/*      */ 
/*      */   public void setE01RQSRP4(String newvalue)
/*      */   {
/*  881 */     this.fieldE01RQSRP4.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01RQSRP4()
/*      */   {
/*  889 */     return this.fieldE01RQSRP4.getString();
/*      */   }
/*      */ 
/*      */   public void setE01RQSRP5(String newvalue)
/*      */   {
/*  897 */     this.fieldE01RQSRP5.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01RQSRP5()
/*      */   {
/*  905 */     return this.fieldE01RQSRP5.getString();
/*      */   }
/*      */ 
/*      */   public void setE01RQSRP6(String newvalue)
/*      */   {
/*  913 */     this.fieldE01RQSRP6.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01RQSRP6()
/*      */   {
/*  921 */     return this.fieldE01RQSRP6.getString();
/*      */   }
/*      */ 
/*      */   public void setE01RQSDF1(String newvalue)
/*      */   {
/*  929 */     this.fieldE01RQSDF1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01RQSDF1()
/*      */   {
/*  937 */     return this.fieldE01RQSDF1.getString();
/*      */   }
/*      */ 
/*      */   public void setE01RQSDF2(String newvalue)
/*      */   {
/*  945 */     this.fieldE01RQSDF2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01RQSDF2()
/*      */   {
/*  953 */     return this.fieldE01RQSDF2.getString();
/*      */   }
/*      */ 
/*      */   public void setE01RQSDF3(String newvalue)
/*      */   {
/*  961 */     this.fieldE01RQSDF3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01RQSDF3()
/*      */   {
/*  969 */     return this.fieldE01RQSDF3.getString();
/*      */   }
/*      */ 
/*      */   public void setE01RQSDF4(String newvalue)
/*      */   {
/*  977 */     this.fieldE01RQSDF4.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01RQSDF4()
/*      */   {
/*  985 */     return this.fieldE01RQSDF4.getString();
/*      */   }
/*      */ 
/*      */   public void setE01RQSDF5(String newvalue)
/*      */   {
/*  993 */     this.fieldE01RQSDF5.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01RQSDF5()
/*      */   {
/* 1001 */     return this.fieldE01RQSDF5.getString();
/*      */   }
/*      */ 
/*      */   public void setE01RQSDF6(String newvalue)
/*      */   {
/* 1009 */     this.fieldE01RQSDF6.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01RQSDF6()
/*      */   {
/* 1017 */     return this.fieldE01RQSDF6.getString();
/*      */   }
/*      */ 
/*      */   public void setE01RQSCR1(String newvalue)
/*      */   {
/* 1025 */     this.fieldE01RQSCR1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01RQSCR1()
/*      */   {
/* 1033 */     return this.fieldE01RQSCR1.getString();
/*      */   }
/*      */ 
/*      */   public void setE01RQSCR2(String newvalue)
/*      */   {
/* 1041 */     this.fieldE01RQSCR2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01RQSCR2()
/*      */   {
/* 1049 */     return this.fieldE01RQSCR2.getString();
/*      */   }
/*      */ 
/*      */   public void setE01RQSCR3(String newvalue)
/*      */   {
/* 1057 */     this.fieldE01RQSCR3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01RQSCR3()
/*      */   {
/* 1065 */     return this.fieldE01RQSCR3.getString();
/*      */   }
/*      */ 
/*      */   public void setE01RQSCR4(String newvalue)
/*      */   {
/* 1073 */     this.fieldE01RQSCR4.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01RQSCR4()
/*      */   {
/* 1081 */     return this.fieldE01RQSCR4.getString();
/*      */   }
/*      */ 
/*      */   public void setE01RQSCR5(String newvalue)
/*      */   {
/* 1089 */     this.fieldE01RQSCR5.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01RQSCR5()
/*      */   {
/* 1097 */     return this.fieldE01RQSCR5.getString();
/*      */   }
/*      */ 
/*      */   public void setE01RQSCR6(String newvalue)
/*      */   {
/* 1105 */     this.fieldE01RQSCR6.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01RQSCR6()
/*      */   {
/* 1113 */     return this.fieldE01RQSCR6.getString();
/*      */   }
/*      */ 
/*      */   public void setE01CUSNA1(String newvalue)
/*      */   {
/* 1121 */     this.fieldE01CUSNA1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01CUSNA1()
/*      */   {
/* 1129 */     return this.fieldE01CUSNA1.getString();
/*      */   }
/*      */ 
/*      */   public void setE01EUSUSR(String newvalue)
/*      */   {
/* 1137 */     this.fieldE01EUSUSR.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01EUSUSR()
/*      */   {
/* 1145 */     return this.fieldE01EUSUSR.getString();
/*      */   }
/*      */ 
/*      */   public void setE01EUSSTS(String newvalue)
/*      */   {
/* 1153 */     this.fieldE01EUSSTS.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01EUSSTS()
/*      */   {
/* 1161 */     return this.fieldE01EUSSTS.getString();
/*      */   }
/*      */ 
/*      */   public void setE01BLKTYP(String newvalue)
/*      */   {
/* 1169 */     this.fieldE01BLKTYP.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01BLKTYP()
/*      */   {
/* 1177 */     return this.fieldE01BLKTYP.getString();
/*      */   }
/*      */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.ESS205001Message
 * JD-Core Version:    0.6.0
 */