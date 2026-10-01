/*      */ package com.activo.gateway.dibs.messages;
/*      */ 
/*      */ import java.math.BigDecimal;
import java.util.Hashtable;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*      */ 
/*      */ public class ECH110001Message extends MessageRecord
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
/*   30 */     "E01ACCTID", 
/*   31 */     "E01ACCTOPN", 
/*   32 */     "E01ACCTYPE", 
/*   33 */     "E01ACTFLG", 
/*   34 */     "E01ADDR1", 
/*   35 */     "E01ADDR2", 
/*   36 */     "E01BANKID", 
/*   37 */     "E01BILLCD", 
/*   38 */     "E01BRANCHI", 
/*   39 */     "E01CHKBKST", 
/*   40 */     "E01CHKNUMS", 
/*   41 */     "E01CITY", 
/*   42 */     "E01COMPANY", 
/*   43 */     "E01DTBIRT1", 
/*   44 */     "E01DTBIRT2", 
/*   45 */     "E01DIVELI1", 
/*   46 */     "E01DIVELI2", 
/*   47 */     "E01FIRSTN1", 
/*   48 */     "E01FIRSTN2", 
/*   49 */     "E01LASTNA1", 
/*   50 */     "E01LASTNA2", 
/*   51 */     "E01LEGALNM", 
/*   52 */     "E01MIDDLE1", 
/*   53 */     "E01MIDDLE2", 
/*   54 */     "E01PARTNER", 
/*   55 */     "E01PASSWRD", 
/*   56 */     "E01PHONE", 
/*   57 */     "E01POSTALC", 
/*   58 */     "E01SPCD", 
/*   59 */     "E01SSN1", 
/*   60 */     "E01SSN2", 
/*   61 */     "E01STATEPR", 
/*   62 */     "E01TAXID", 
/*   63 */     "E01TITLEA1", 
/*   64 */     "E01TITLEA2", 
/*   65 */     "E01TITLEA3", 
/*   66 */     "E01TITLEA4", 
/*   67 */     "E01USERID" };
/*      */ 
/*   69 */   static final String[] tnames = { 
/*   70 */     "H01USERID", 
/*   71 */     "H01PROGRM", 
/*   72 */     "H01TIMSYS", 
/*   73 */     "H01SCRCOD", 
/*   74 */     "H01OPECOD", 
/*   75 */     "H01FLGMAS", 
/*   76 */     "H01FLGWK1", 
/*   77 */     "H01FLGWK2", 
/*   78 */     "H01FLGWK3", 
/*   79 */     "E01ACCTID", 
/*   80 */     "E01ACCTOPN", 
/*   81 */     "E01ACCTYPE", 
/*   82 */     "E01ACTFLG", 
/*   83 */     "E01ADDR1", 
/*   84 */     "E01ADDR2", 
/*   85 */     "E01BANKID", 
/*   86 */     "E01BILLCD", 
/*   87 */     "E01BRANCHI", 
/*   88 */     "E01CHKBKST", 
/*   89 */     "E01CHKNUMS", 
/*   90 */     "E01CITY", 
/*   91 */     "E01COMPANY", 
/*   92 */     "E01DTBIRT1", 
/*   93 */     "E01DTBIRT2", 
/*   94 */     "E01DIVELI1", 
/*   95 */     "E01DIVELI2", 
/*   96 */     "E01FIRSTN1", 
/*   97 */     "E01FIRSTN2", 
/*   98 */     "E01LASTNA1", 
/*   99 */     "E01LASTNA2", 
/*  100 */     "E01LEGALNM", 
/*  101 */     "E01MIDDLE1", 
/*  102 */     "E01MIDDLE2", 
/*  103 */     "E01PARTNER", 
/*  104 */     "E01PASSWRD", 
/*  105 */     "E01PHONE", 
/*  106 */     "E01POSTALC", 
/*  107 */     "E01SPCD", 
/*  108 */     "E01SSN1", 
/*  109 */     "E01SSN2", 
/*  110 */     "E01STATEPR", 
/*  111 */     "E01TAXID", 
/*  112 */     "E01TITLEA1", 
/*  113 */     "E01TITLEA2", 
/*  114 */     "E01TITLEA3", 
/*  115 */     "E01TITLEA4", 
/*  116 */     "E01USERID" };
/*      */   static final String fid = "1040520171705";
/*      */   static final String rid = "50518EC03BB31";
/*      */   static final String fmtname = "ECH110001";
/*  121 */   final int FIELDCOUNT = 47;
/*  122 */   private static Hashtable tlookup = new Hashtable();
/*  123 */   private CharacterField fieldH01USERID = null;
/*  124 */   private CharacterField fieldH01PROGRM = null;
/*  125 */   private CharacterField fieldH01TIMSYS = null;
/*  126 */   private CharacterField fieldH01SCRCOD = null;
/*  127 */   private CharacterField fieldH01OPECOD = null;
/*  128 */   private CharacterField fieldH01FLGMAS = null;
/*  129 */   private CharacterField fieldH01FLGWK1 = null;
/*  130 */   private CharacterField fieldH01FLGWK2 = null;
/*  131 */   private CharacterField fieldH01FLGWK3 = null;
/*  132 */   private DecimalField fieldE01ACCTID = null;
/*  133 */   private DecimalField fieldE01ACCTOPN = null;
/*  134 */   private CharacterField fieldE01ACCTYPE = null;
/*  135 */   private CharacterField fieldE01ACTFLG = null;
/*  136 */   private CharacterField fieldE01ADDR1 = null;
/*  137 */   private CharacterField fieldE01ADDR2 = null;
/*  138 */   private CharacterField fieldE01BANKID = null;
/*  139 */   private CharacterField fieldE01BILLCD = null;
/*  140 */   private CharacterField fieldE01BRANCHI = null;
/*  141 */   private CharacterField fieldE01CHKBKST = null;
/*  142 */   private DecimalField fieldE01CHKNUMS = null;
/*  143 */   private CharacterField fieldE01CITY = null;
/*  144 */   private CharacterField fieldE01COMPANY = null;
/*  145 */   private CharacterField fieldE01DTBIRT1 = null;
/*  146 */   private CharacterField fieldE01DTBIRT2 = null;
/*  147 */   private CharacterField fieldE01DIVELI1 = null;
/*  148 */   private CharacterField fieldE01DIVELI2 = null;
/*  149 */   private CharacterField fieldE01FIRSTN1 = null;
/*  150 */   private CharacterField fieldE01FIRSTN2 = null;
/*  151 */   private CharacterField fieldE01LASTNA1 = null;
/*  152 */   private CharacterField fieldE01LASTNA2 = null;
/*  153 */   private CharacterField fieldE01LEGALNM = null;
/*  154 */   private CharacterField fieldE01MIDDLE1 = null;
/*  155 */   private CharacterField fieldE01MIDDLE2 = null;
/*  156 */   private CharacterField fieldE01PARTNER = null;
/*  157 */   private CharacterField fieldE01PASSWRD = null;
/*  158 */   private CharacterField fieldE01PHONE = null;
/*  159 */   private CharacterField fieldE01POSTALC = null;
/*  160 */   private CharacterField fieldE01SPCD = null;
/*  161 */   private CharacterField fieldE01SSN1 = null;
/*  162 */   private CharacterField fieldE01SSN2 = null;
/*  163 */   private CharacterField fieldE01STATEPR = null;
/*  164 */   private CharacterField fieldE01TAXID = null;
/*  165 */   private CharacterField fieldE01TITLEA1 = null;
/*  166 */   private CharacterField fieldE01TITLEA2 = null;
/*  167 */   private CharacterField fieldE01TITLEA3 = null;
/*  168 */   private CharacterField fieldE01TITLEA4 = null;
/*  169 */   private CharacterField fieldE01USERID = null;
/*      */ 
/*      */   public ECH110001Message()
/*      */   {
/*  176 */     createFields();
/*  177 */     initialize();
/*      */   }
/*      */ 
/*      */   protected void createFields()
/*      */   {
/*  186 */     this.recordsize = 611;
/*  187 */     this.fileid = "1040520171705";
/*  188 */     this.recordid = "50518EC03BB31";
/*  189 */     this.message = new byte[getByteLength()];
/*  190 */     this.formatname = "ECH110001";
/*  191 */     this.fieldnames = fldnames;
/*  192 */     this.tagnames = tnames;
/*  193 */     this.fields = new MessageField[47];
/*      */      this.fields[0]=this.fieldH01USERID=new CharacterField(this.message, 10, 10, "H01USERID");
/*      */      this.fields[1]=this.fieldH01PROGRM=new CharacterField(this.message, 20, 10, "H01PROGRM");
/*      */      this.fields[2]=this.fieldH01TIMSYS=new CharacterField(this.message, 30, 12, "H01TIMSYS");
/*      */      this.fields[3]=this.fieldH01SCRCOD=new CharacterField(this.message, 42, 2, "H01SCRCOD");
/*      */      this.fields[4]=this.fieldH01OPECOD=new CharacterField(this.message, 44, 4, "H01OPECOD");
/*      */      this.fields[5]=this.fieldH01FLGMAS=new CharacterField(this.message, 48, 1, "H01FLGMAS");
/*      */      this.fields[6]=this.fieldH01FLGWK1=new CharacterField(this.message, 49, 1, "H01FLGWK1");
/*      */      this.fields[7]=this.fieldH01FLGWK2=new CharacterField(this.message, 50, 1, "H01FLGWK2");
/*      */      this.fields[8]=this.fieldH01FLGWK3=new CharacterField(this.message, 51, 1, "H01FLGWK3");
/*      */      this.fields[9]=this.fieldE01ACCTID=new DecimalField(this.message, 52, 21, 0, "E01ACCTID");
/*      */      this.fields[10]=this.fieldE01ACCTOPN=new DecimalField(this.message, 73, 5, 0, "E01ACCTOPN");
/*      */      this.fields[11]=this.fieldE01ACCTYPE=new CharacterField(this.message, 78, 3, "E01ACCTYPE");
/*      */      this.fields[12]=this.fieldE01ACTFLG=new CharacterField(this.message, 81, 1, "E01ACTFLG");
/*      */      this.fields[13]=this.fieldE01ADDR1=new CharacterField(this.message, 82, 30, "E01ADDR1");
/*      */      this.fields[14]=this.fieldE01ADDR2=new CharacterField(this.message, 112, 30, "E01ADDR2");
/*      */      this.fields[15]=this.fieldE01BANKID=new CharacterField(this.message, 142, 9, "E01BANKID");
/*      */      this.fields[16]=this.fieldE01BILLCD=new CharacterField(this.message, 151, 1, "E01BILLCD");
/*      */      this.fields[17]=this.fieldE01BRANCHI=new CharacterField(this.message, 152, 5, "E01BRANCHI");
/*      */      this.fields[18]=this.fieldE01CHKBKST=new CharacterField(this.message, 157, 8, "E01CHKBKST");
/*      */      this.fields[19]=this.fieldE01CHKNUMS=new DecimalField(this.message, 165, 6, 0, "E01CHKNUMS");
/*      */      this.fields[20]=this.fieldE01CITY=new CharacterField(this.message, 171, 15, "E01CITY");
/*      */      this.fields[21]=this.fieldE01COMPANY=new CharacterField(this.message, 186, 40, "E01COMPANY");
/*      */      this.fields[22]=this.fieldE01DTBIRT1=new CharacterField(this.message, 226, 10, "E01DTBIRT1");
/*      */      this.fields[23]=this.fieldE01DTBIRT2=new CharacterField(this.message, 236, 10, "E01DTBIRT2");
/*      */      this.fields[24]=this.fieldE01DIVELI1=new CharacterField(this.message, 246, 15, "E01DIVELI1");
/*      */      this.fields[25]=this.fieldE01DIVELI2=new CharacterField(this.message, 261, 15, "E01DIVELI2");
/*      */      this.fields[26]=this.fieldE01FIRSTN1=new CharacterField(this.message, 276, 15, "E01FIRSTN1");
/*      */      this.fields[27]=this.fieldE01FIRSTN2=new CharacterField(this.message, 291, 15, "E01FIRSTN2");
/*      */      this.fields[28]=this.fieldE01LASTNA1=new CharacterField(this.message, 306, 15, "E01LASTNA1");
/*      */      this.fields[29]=this.fieldE01LASTNA2=new CharacterField(this.message, 321, 15, "E01LASTNA2");
/*      */      this.fields[30]=this.fieldE01LEGALNM=new CharacterField(this.message, 336, 40, "E01LEGALNM");
/*      */      this.fields[31]=this.fieldE01MIDDLE1=new CharacterField(this.message, 376, 2, "E01MIDDLE1");
/*      */      this.fields[32]=this.fieldE01MIDDLE2=new CharacterField(this.message, 378, 2, "E01MIDDLE2");
/*      */      this.fields[33]=this.fieldE01PARTNER=new CharacterField(this.message, 380, 15, "E01PARTNER");
/*      */      this.fields[34]=this.fieldE01PASSWRD=new CharacterField(this.message, 395, 8, "E01PASSWRD");
/*      */      this.fields[35]=this.fieldE01PHONE=new CharacterField(this.message, 403, 13, "E01PHONE");
/*      */      this.fields[36]=this.fieldE01POSTALC=new CharacterField(this.message, 416, 10, "E01POSTALC");
/*      */      this.fields[37]=this.fieldE01SPCD=new CharacterField(this.message, 426, 2, "E01SPCD");
/*      */      this.fields[38]=this.fieldE01SSN1=new CharacterField(this.message, 428, 11, "E01SSN1");
/*      */      this.fields[39]=this.fieldE01SSN2=new CharacterField(this.message, 439, 2, "E01SSN2");
/*      */      this.fields[40]=this.fieldE01STATEPR=new CharacterField(this.message, 441, 2, "E01STATEPR");
/*      */      this.fields[41]=this.fieldE01TAXID=new CharacterField(this.message, 443, 10, "E01TAXID");
/*      */      this.fields[42]=this.fieldE01TITLEA1=new CharacterField(this.message, 453, 40, "E01TITLEA1");
/*      */      this.fields[43]=this.fieldE01TITLEA2=new CharacterField(this.message, 493, 40, "E01TITLEA2");
/*      */      this.fields[44]=this.fieldE01TITLEA3=new CharacterField(this.message, 533, 40, "E01TITLEA3");
/*      */      this.fields[45]=this.fieldE01TITLEA4=new CharacterField(this.message, 573, 40, "E01TITLEA4");
/*      */      this.fields[46]=this.fieldE01USERID=new CharacterField(this.message, 613, 8, "E01USERID");
/*      */ 
/*  290 */     synchronized (tlookup)
/*      */     {
/*  292 */       if (tlookup.isEmpty())
/*      */       {
/*  294 */         for (int i = 0; i < tnames.length; i++) {
/*  295 */           tlookup.put(tnames[i], new Integer(i));
/*      */         }
/*      */       }
/*      */     }
/*  299 */     this.taglookup = tlookup;
/*      */   }
/*      */ 
/*      */   public void setH01USERID(String newvalue)
/*      */   {
/*  307 */     this.fieldH01USERID.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getH01USERID()
/*      */   {
/*  315 */     return this.fieldH01USERID.getString();
/*      */   }
/*      */ 
/*      */   public void setH01PROGRM(String newvalue)
/*      */   {
/*  323 */     this.fieldH01PROGRM.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getH01PROGRM()
/*      */   {
/*  331 */     return this.fieldH01PROGRM.getString();
/*      */   }
/*      */ 
/*      */   public void setH01TIMSYS(String newvalue)
/*      */   {
/*  339 */     this.fieldH01TIMSYS.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getH01TIMSYS()
/*      */   {
/*  347 */     return this.fieldH01TIMSYS.getString();
/*      */   }
/*      */ 
/*      */   public void setH01SCRCOD(String newvalue)
/*      */   {
/*  355 */     this.fieldH01SCRCOD.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getH01SCRCOD()
/*      */   {
/*  363 */     return this.fieldH01SCRCOD.getString();
/*      */   }
/*      */ 
/*      */   public void setH01OPECOD(String newvalue)
/*      */   {
/*  371 */     this.fieldH01OPECOD.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getH01OPECOD()
/*      */   {
/*  379 */     return this.fieldH01OPECOD.getString();
/*      */   }
/*      */ 
/*      */   public void setH01FLGMAS(String newvalue)
/*      */   {
/*  387 */     this.fieldH01FLGMAS.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getH01FLGMAS()
/*      */   {
/*  395 */     return this.fieldH01FLGMAS.getString();
/*      */   }
/*      */ 
/*      */   public void setH01FLGWK1(String newvalue)
/*      */   {
/*  403 */     this.fieldH01FLGWK1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getH01FLGWK1()
/*      */   {
/*  411 */     return this.fieldH01FLGWK1.getString();
/*      */   }
/*      */ 
/*      */   public void setH01FLGWK2(String newvalue)
/*      */   {
/*  419 */     this.fieldH01FLGWK2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getH01FLGWK2()
/*      */   {
/*  427 */     return this.fieldH01FLGWK2.getString();
/*      */   }
/*      */ 
/*      */   public void setH01FLGWK3(String newvalue)
/*      */   {
/*  435 */     this.fieldH01FLGWK3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getH01FLGWK3()
/*      */   {
/*  443 */     return this.fieldH01FLGWK3.getString();
/*      */   }
/*      */ 
/*      */   public void setE01ACCTID(String newvalue)
/*      */   {
/*  451 */     this.fieldE01ACCTID.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01ACCTID()
/*      */   {
/*  459 */     return this.fieldE01ACCTID.getString();
/*      */   }
/*      */ 
/*      */   public void setE01ACCTID(BigDecimal newvalue)
/*      */   {
/*  467 */     this.fieldE01ACCTID.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE01ACCTID()
/*      */   {
/*  475 */     return this.fieldE01ACCTID.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setE01ACCTOPN(String newvalue)
/*      */   {
/*  483 */     this.fieldE01ACCTOPN.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01ACCTOPN()
/*      */   {
/*  491 */     return this.fieldE01ACCTOPN.getString();
/*      */   }
/*      */ 
/*      */   public void setE01ACCTOPN(BigDecimal newvalue)
/*      */   {
/*  499 */     this.fieldE01ACCTOPN.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE01ACCTOPN()
/*      */   {
/*  507 */     return this.fieldE01ACCTOPN.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setE01ACCTYPE(String newvalue)
/*      */   {
/*  515 */     this.fieldE01ACCTYPE.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01ACCTYPE()
/*      */   {
/*  523 */     return this.fieldE01ACCTYPE.getString();
/*      */   }
/*      */ 
/*      */   public void setE01ACTFLG(String newvalue)
/*      */   {
/*  531 */     this.fieldE01ACTFLG.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01ACTFLG()
/*      */   {
/*  539 */     return this.fieldE01ACTFLG.getString();
/*      */   }
/*      */ 
/*      */   public void setE01ADDR1(String newvalue)
/*      */   {
/*  547 */     this.fieldE01ADDR1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01ADDR1()
/*      */   {
/*  555 */     return this.fieldE01ADDR1.getString();
/*      */   }
/*      */ 
/*      */   public void setE01ADDR2(String newvalue)
/*      */   {
/*  563 */     this.fieldE01ADDR2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01ADDR2()
/*      */   {
/*  571 */     return this.fieldE01ADDR2.getString();
/*      */   }
/*      */ 
/*      */   public void setE01BANKID(String newvalue)
/*      */   {
/*  579 */     this.fieldE01BANKID.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01BANKID()
/*      */   {
/*  587 */     return this.fieldE01BANKID.getString();
/*      */   }
/*      */ 
/*      */   public void setE01BILLCD(String newvalue)
/*      */   {
/*  595 */     this.fieldE01BILLCD.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01BILLCD()
/*      */   {
/*  603 */     return this.fieldE01BILLCD.getString();
/*      */   }
/*      */ 
/*      */   public void setE01BRANCHI(String newvalue)
/*      */   {
/*  611 */     this.fieldE01BRANCHI.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01BRANCHI()
/*      */   {
/*  619 */     return this.fieldE01BRANCHI.getString();
/*      */   }
/*      */ 
/*      */   public void setE01CHKBKST(String newvalue)
/*      */   {
/*  627 */     this.fieldE01CHKBKST.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01CHKBKST()
/*      */   {
/*  635 */     return this.fieldE01CHKBKST.getString();
/*      */   }
/*      */ 
/*      */   public void setE01CHKNUMS(String newvalue)
/*      */   {
/*  643 */     this.fieldE01CHKNUMS.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01CHKNUMS()
/*      */   {
/*  651 */     return this.fieldE01CHKNUMS.getString();
/*      */   }
/*      */ 
/*      */   public void setE01CHKNUMS(BigDecimal newvalue)
/*      */   {
/*  659 */     this.fieldE01CHKNUMS.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE01CHKNUMS()
/*      */   {
/*  667 */     return this.fieldE01CHKNUMS.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setE01CITY(String newvalue)
/*      */   {
/*  675 */     this.fieldE01CITY.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01CITY()
/*      */   {
/*  683 */     return this.fieldE01CITY.getString();
/*      */   }
/*      */ 
/*      */   public void setE01COMPANY(String newvalue)
/*      */   {
/*  691 */     this.fieldE01COMPANY.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01COMPANY()
/*      */   {
/*  699 */     return this.fieldE01COMPANY.getString();
/*      */   }
/*      */ 
/*      */   public void setE01DTBIRT1(String newvalue)
/*      */   {
/*  707 */     this.fieldE01DTBIRT1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01DTBIRT1()
/*      */   {
/*  715 */     return this.fieldE01DTBIRT1.getString();
/*      */   }
/*      */ 
/*      */   public void setE01DTBIRT2(String newvalue)
/*      */   {
/*  723 */     this.fieldE01DTBIRT2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01DTBIRT2()
/*      */   {
/*  731 */     return this.fieldE01DTBIRT2.getString();
/*      */   }
/*      */ 
/*      */   public void setE01DIVELI1(String newvalue)
/*      */   {
/*  739 */     this.fieldE01DIVELI1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01DIVELI1()
/*      */   {
/*  747 */     return this.fieldE01DIVELI1.getString();
/*      */   }
/*      */ 
/*      */   public void setE01DIVELI2(String newvalue)
/*      */   {
/*  755 */     this.fieldE01DIVELI2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01DIVELI2()
/*      */   {
/*  763 */     return this.fieldE01DIVELI2.getString();
/*      */   }
/*      */ 
/*      */   public void setE01FIRSTN1(String newvalue)
/*      */   {
/*  771 */     this.fieldE01FIRSTN1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01FIRSTN1()
/*      */   {
/*  779 */     return this.fieldE01FIRSTN1.getString();
/*      */   }
/*      */ 
/*      */   public void setE01FIRSTN2(String newvalue)
/*      */   {
/*  787 */     this.fieldE01FIRSTN2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01FIRSTN2()
/*      */   {
/*  795 */     return this.fieldE01FIRSTN2.getString();
/*      */   }
/*      */ 
/*      */   public void setE01LASTNA1(String newvalue)
/*      */   {
/*  803 */     this.fieldE01LASTNA1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01LASTNA1()
/*      */   {
/*  811 */     return this.fieldE01LASTNA1.getString();
/*      */   }
/*      */ 
/*      */   public void setE01LASTNA2(String newvalue)
/*      */   {
/*  819 */     this.fieldE01LASTNA2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01LASTNA2()
/*      */   {
/*  827 */     return this.fieldE01LASTNA2.getString();
/*      */   }
/*      */ 
/*      */   public void setE01LEGALNM(String newvalue)
/*      */   {
/*  835 */     this.fieldE01LEGALNM.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01LEGALNM()
/*      */   {
/*  843 */     return this.fieldE01LEGALNM.getString();
/*      */   }
/*      */ 
/*      */   public void setE01MIDDLE1(String newvalue)
/*      */   {
/*  851 */     this.fieldE01MIDDLE1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01MIDDLE1()
/*      */   {
/*  859 */     return this.fieldE01MIDDLE1.getString();
/*      */   }
/*      */ 
/*      */   public void setE01MIDDLE2(String newvalue)
/*      */   {
/*  867 */     this.fieldE01MIDDLE2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01MIDDLE2()
/*      */   {
/*  875 */     return this.fieldE01MIDDLE2.getString();
/*      */   }
/*      */ 
/*      */   public void setE01PARTNER(String newvalue)
/*      */   {
/*  883 */     this.fieldE01PARTNER.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01PARTNER()
/*      */   {
/*  891 */     return this.fieldE01PARTNER.getString();
/*      */   }
/*      */ 
/*      */   public void setE01PASSWRD(String newvalue)
/*      */   {
/*  899 */     this.fieldE01PASSWRD.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01PASSWRD()
/*      */   {
/*  907 */     return this.fieldE01PASSWRD.getString();
/*      */   }
/*      */ 
/*      */   public void setE01PHONE(String newvalue)
/*      */   {
/*  915 */     this.fieldE01PHONE.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01PHONE()
/*      */   {
/*  923 */     return this.fieldE01PHONE.getString();
/*      */   }
/*      */ 
/*      */   public void setE01POSTALC(String newvalue)
/*      */   {
/*  931 */     this.fieldE01POSTALC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01POSTALC()
/*      */   {
/*  939 */     return this.fieldE01POSTALC.getString();
/*      */   }
/*      */ 
/*      */   public void setE01SPCD(String newvalue)
/*      */   {
/*  947 */     this.fieldE01SPCD.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01SPCD()
/*      */   {
/*  955 */     return this.fieldE01SPCD.getString();
/*      */   }
/*      */ 
/*      */   public void setE01SSN1(String newvalue)
/*      */   {
/*  963 */     this.fieldE01SSN1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01SSN1()
/*      */   {
/*  971 */     return this.fieldE01SSN1.getString();
/*      */   }
/*      */ 
/*      */   public void setE01SSN2(String newvalue)
/*      */   {
/*  979 */     this.fieldE01SSN2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01SSN2()
/*      */   {
/*  987 */     return this.fieldE01SSN2.getString();
/*      */   }
/*      */ 
/*      */   public void setE01STATEPR(String newvalue)
/*      */   {
/*  995 */     this.fieldE01STATEPR.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01STATEPR()
/*      */   {
/* 1003 */     return this.fieldE01STATEPR.getString();
/*      */   }
/*      */ 
/*      */   public void setE01TAXID(String newvalue)
/*      */   {
/* 1011 */     this.fieldE01TAXID.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01TAXID()
/*      */   {
/* 1019 */     return this.fieldE01TAXID.getString();
/*      */   }
/*      */ 
/*      */   public void setE01TITLEA1(String newvalue)
/*      */   {
/* 1027 */     this.fieldE01TITLEA1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01TITLEA1()
/*      */   {
/* 1035 */     return this.fieldE01TITLEA1.getString();
/*      */   }
/*      */ 
/*      */   public void setE01TITLEA2(String newvalue)
/*      */   {
/* 1043 */     this.fieldE01TITLEA2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01TITLEA2()
/*      */   {
/* 1051 */     return this.fieldE01TITLEA2.getString();
/*      */   }
/*      */ 
/*      */   public void setE01TITLEA3(String newvalue)
/*      */   {
/* 1059 */     this.fieldE01TITLEA3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01TITLEA3()
/*      */   {
/* 1067 */     return this.fieldE01TITLEA3.getString();
/*      */   }
/*      */ 
/*      */   public void setE01TITLEA4(String newvalue)
/*      */   {
/* 1075 */     this.fieldE01TITLEA4.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01TITLEA4()
/*      */   {
/* 1083 */     return this.fieldE01TITLEA4.getString();
/*      */   }
/*      */ 
/*      */   public void setE01USERID(String newvalue)
/*      */   {
/* 1091 */     this.fieldE01USERID.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01USERID()
/*      */   {
/* 1099 */     return this.fieldE01USERID.getString();
/*      */   }
/*      */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.ECH110001Message
 * JD-Core Version:    0.6.0
 */