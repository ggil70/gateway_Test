/*      */ package com.activo.gateway.dibs.messages;
/*      */ 
/*      */ import java.math.BigDecimal;
import java.util.Hashtable;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*      */ 
/*      */ public class ESS2060DSMessage extends MessageRecord
/*      */ {
/*   22 */   static final String[] fldnames = { 
/*   23 */     "H01USER", 
/*   24 */     "H01OPCODE", 
/*   25 */     "H01FLAG", 
/*   26 */     "E01REQNO", 
/*   27 */     "E01RDATE", 
/*   28 */     "E01NAME", 
/*   29 */     "E01DOC", 
/*   30 */     "E01EMAIL", 
/*   31 */     "E01PHN1", 
/*   32 */     "E01PHN2", 
/*   33 */     "E01ADDR1", 
/*   34 */     "E01ADDR2", 
/*   35 */     "E01ADDR3", 
/*   36 */     "E01ACCN1", 
/*   37 */     "E01ACCN2", 
/*   38 */     "E01ACCN3", 
/*   39 */     "E01ACCT1", 
/*   40 */     "E01ACCT2", 
/*   41 */     "E01ACCT3", 
/*   42 */     "E01REPN1", 
/*   43 */     "E01REPN2", 
/*   44 */     "E01REPN3", 
/*   45 */     "E01REPD1", 
/*   46 */     "E01REPD2", 
/*   47 */     "E01REPD3", 
/*   48 */     "E01REPC1", 
/*   49 */     "E01REPC2", 
/*   50 */     "E01REPC3", 
/*   51 */     "E01USERR", 
/*   52 */     "E01PASSW", 
/*   53 */     "E01PASSWK", 
/*   54 */     "E01ACTPIN", 
/*   55 */     "E01OBSER1", 
/*   56 */     "E01OBSER2", 
/*   57 */     "E01OBSER3", 
/*   58 */     "E01OBSER4", 
/*   59 */     "E01OFIC1", 
/*   60 */     "E01OFIC2", 
/*   61 */     "E01OFCD1", 
/*   62 */     "E01OFCD2", 
/*   63 */     "E01STATUS" };
/*      */ 
/*   65 */   static final String[] tnames = { 
/*   66 */     "H01USER", 
/*   67 */     "H01OPCODE", 
/*   68 */     "H01FLAG", 
/*   69 */     "E01REQNO", 
/*   70 */     "E01RDATE", 
/*   71 */     "E01NAME", 
/*   72 */     "E01DOC", 
/*   73 */     "E01EMAIL", 
/*   74 */     "E01PHN1", 
/*   75 */     "E01PHN2", 
/*   76 */     "E01ADDR1", 
/*   77 */     "E01ADDR2", 
/*   78 */     "E01ADDR3", 
/*   79 */     "E01ACCN1", 
/*   80 */     "E01ACCN2", 
/*   81 */     "E01ACCN3", 
/*   82 */     "E01ACCT1", 
/*   83 */     "E01ACCT2", 
/*   84 */     "E01ACCT3", 
/*   85 */     "E01REPN1", 
/*   86 */     "E01REPN2", 
/*   87 */     "E01REPN3", 
/*   88 */     "E01REPD1", 
/*   89 */     "E01REPD2", 
/*   90 */     "E01REPD3", 
/*   91 */     "E01REPC1", 
/*   92 */     "E01REPC2", 
/*   93 */     "E01REPC3", 
/*   94 */     "E01USERR", 
/*   95 */     "E01PASSW", 
/*   96 */     "E01PASSWK", 
/*   97 */     "E01ACTPIN", 
/*   98 */     "E01OBSER1", 
/*   99 */     "E01OBSER2", 
/*  100 */     "E01OBSER3", 
/*  101 */     "E01OBSER4", 
/*  102 */     "E01OFIC1", 
/*  103 */     "E01OFIC2", 
/*  104 */     "E01OFCD1", 
/*  105 */     "E01OFCD2", 
/*  106 */     "E01STATUS" };
/*      */   static final String fid = "1071010152410";
/*      */   static final String rid = "47F906FFFA3CC";
/*      */   static final String fmtname = "ESS2060DS";
/*  111 */   final int FIELDCOUNT = 41;
/*  112 */   private static Hashtable tlookup = new Hashtable();
/*  113 */   private CharacterField fieldH01USER = null;
/*  114 */   private CharacterField fieldH01OPCODE = null;
/*  115 */   private CharacterField fieldH01FLAG = null;
/*  116 */   private DecimalField fieldE01REQNO = null;
/*  117 */   private DecimalField fieldE01RDATE = null;
/*  118 */   private CharacterField fieldE01NAME = null;
/*  119 */   private CharacterField fieldE01DOC = null;
/*  120 */   private CharacterField fieldE01EMAIL = null;
/*  121 */   private CharacterField fieldE01PHN1 = null;
/*  122 */   private CharacterField fieldE01PHN2 = null;
/*  123 */   private CharacterField fieldE01ADDR1 = null;
/*  124 */   private CharacterField fieldE01ADDR2 = null;
/*  125 */   private CharacterField fieldE01ADDR3 = null;
/*  126 */   private DecimalField fieldE01ACCN1 = null;
/*  127 */   private DecimalField fieldE01ACCN2 = null;
/*  128 */   private DecimalField fieldE01ACCN3 = null;
/*  129 */   private CharacterField fieldE01ACCT1 = null;
/*  130 */   private CharacterField fieldE01ACCT2 = null;
/*  131 */   private CharacterField fieldE01ACCT3 = null;
/*  132 */   private CharacterField fieldE01REPN1 = null;
/*  133 */   private CharacterField fieldE01REPN2 = null;
/*  134 */   private CharacterField fieldE01REPN3 = null;
/*  135 */   private CharacterField fieldE01REPD1 = null;
/*  136 */   private CharacterField fieldE01REPD2 = null;
/*  137 */   private CharacterField fieldE01REPD3 = null;
/*  138 */   private CharacterField fieldE01REPC1 = null;
/*  139 */   private CharacterField fieldE01REPC2 = null;
/*  140 */   private CharacterField fieldE01REPC3 = null;
/*  141 */   private CharacterField fieldE01USERR = null;
/*  142 */   private CharacterField fieldE01PASSW = null;
/*  143 */   private CharacterField fieldE01PASSWK = null;
/*  144 */   private CharacterField fieldE01ACTPIN = null;
/*  145 */   private CharacterField fieldE01OBSER1 = null;
/*  146 */   private CharacterField fieldE01OBSER2 = null;
/*  147 */   private CharacterField fieldE01OBSER3 = null;
/*  148 */   private CharacterField fieldE01OBSER4 = null;
/*  149 */   private CharacterField fieldE01OFIC1 = null;
/*  150 */   private CharacterField fieldE01OFIC2 = null;
/*  151 */   private DecimalField fieldE01OFCD1 = null;
/*  152 */   private DecimalField fieldE01OFCD2 = null;
/*  153 */   private CharacterField fieldE01STATUS = null;
/*      */ 
/*      */   public ESS2060DSMessage()
/*      */   {
/*  160 */     createFields();
/*  161 */     initialize();
/*      */   }
/*      */ 
/*      */   protected void createFields()
/*      */   {
/*  170 */     this.recordsize = 949;
/*  171 */     this.fileid = "1071010152410";
/*  172 */     this.recordid = "47F906FFFA3CC";
/*  173 */     this.message = new byte[getByteLength()];
/*  174 */     this.formatname = "ESS2060DS";
/*  175 */     this.fieldnames = fldnames;
/*  176 */     this.tagnames = tnames;
/*  177 */     this.fields = new MessageField[41];
/*      */      this.fields[0]=this.fieldH01USER=new CharacterField(this.message, 10, 10, "H01USER");
/*      */      this.fields[1]=this.fieldH01OPCODE=new CharacterField(this.message, 20, 2, "H01OPCODE");
/*      */      this.fields[2]=this.fieldH01FLAG=new CharacterField(this.message, 22, 1, "H01FLAG");
/*      */      this.fields[3]=this.fieldE01REQNO=new DecimalField(this.message, 23, 10, 0, "E01REQNO");
/*      */      this.fields[4]=this.fieldE01RDATE=new DecimalField(this.message, 33, 9, 0, "E01RDATE");
/*      */      this.fields[5]=this.fieldE01NAME=new CharacterField(this.message, 42, 60, "E01NAME");
/*      */      this.fields[6]=this.fieldE01DOC=new CharacterField(this.message, 102, 20, "E01DOC");
/*      */      this.fields[7]=this.fieldE01EMAIL=new CharacterField(this.message, 122, 60, "E01EMAIL");
/*      */      this.fields[8]=this.fieldE01PHN1=new CharacterField(this.message, 182, 15, "E01PHN1");
/*      */      this.fields[9]=this.fieldE01PHN2=new CharacterField(this.message, 197, 15, "E01PHN2");
/*      */      this.fields[10]=this.fieldE01ADDR1=new CharacterField(this.message, 212, 40, "E01ADDR1");
/*      */      this.fields[11]=this.fieldE01ADDR2=new CharacterField(this.message, 252, 40, "E01ADDR2");
/*      */      this.fields[12]=this.fieldE01ADDR3=new CharacterField(this.message, 292, 40, "E01ADDR3");
/*      */      this.fields[13]=this.fieldE01ACCN1=new DecimalField(this.message, 332, 17, 0, "E01ACCN1");
/*      */      this.fields[14]=this.fieldE01ACCN2=new DecimalField(this.message, 349, 17, 0, "E01ACCN2");
/*      */      this.fields[15]=this.fieldE01ACCN3=new DecimalField(this.message, 366, 17, 0, "E01ACCN3");
/*      */      this.fields[16]=this.fieldE01ACCT1=new CharacterField(this.message, 383, 15, "E01ACCT1");
/*      */      this.fields[17]=this.fieldE01ACCT2=new CharacterField(this.message, 398, 15, "E01ACCT2");
/*      */      this.fields[18]=this.fieldE01ACCT3=new CharacterField(this.message, 413, 15, "E01ACCT3");
/*      */      this.fields[19]=this.fieldE01REPN1=new CharacterField(this.message, 428, 45, "E01REPN1");
/*      */      this.fields[20]=this.fieldE01REPN2=new CharacterField(this.message, 473, 45, "E01REPN2");
/*      */      this.fields[21]=this.fieldE01REPN3=new CharacterField(this.message, 518, 45, "E01REPN3");
/*      */      this.fields[22]=this.fieldE01REPD1=new CharacterField(this.message, 563, 15, "E01REPD1");
/*      */      this.fields[23]=this.fieldE01REPD2=new CharacterField(this.message, 578, 15, "E01REPD2");
/*      */      this.fields[24]=this.fieldE01REPD3=new CharacterField(this.message, 593, 15, "E01REPD3");
/*      */      this.fields[25]=this.fieldE01REPC1=new CharacterField(this.message, 608, 15, "E01REPC1");
/*      */      this.fields[26]=this.fieldE01REPC2=new CharacterField(this.message, 623, 15, "E01REPC2");
/*      */      this.fields[27]=this.fieldE01REPC3=new CharacterField(this.message, 638, 15, "E01REPC3");
/*      */      this.fields[28]=this.fieldE01USERR=new CharacterField(this.message, 653, 10, "E01USERR");
/*      */      this.fields[29]=this.fieldE01PASSW=new CharacterField(this.message, 663, 10, "E01PASSW");
/*      */      this.fields[30]=this.fieldE01PASSWK=new CharacterField(this.message, 673, 1, "E01PASSWK");
/*      */      this.fields[31]=this.fieldE01ACTPIN=new CharacterField(this.message, 674, 6, "E01ACTPIN");
/*      */      this.fields[32]=this.fieldE01OBSER1=new CharacterField(this.message, 680, 60, "E01OBSER1");
/*      */      this.fields[33]=this.fieldE01OBSER2=new CharacterField(this.message, 740, 60, "E01OBSER2");
/*      */      this.fields[34]=this.fieldE01OBSER3=new CharacterField(this.message, 800, 60, "E01OBSER3");
/*      */      this.fields[35]=this.fieldE01OBSER4=new CharacterField(this.message, 860, 60, "E01OBSER4");
/*      */      this.fields[36]=this.fieldE01OFIC1=new CharacterField(this.message, 920, 10, "E01OFIC1");
/*      */      this.fields[37]=this.fieldE01OFIC2=new CharacterField(this.message, 930, 10, "E01OFIC2");
/*      */      this.fields[38]=this.fieldE01OFCD1=new DecimalField(this.message, 940, 9, 0, "E01OFCD1");
/*      */      this.fields[39]=this.fieldE01OFCD2=new DecimalField(this.message, 949, 9, 0, "E01OFCD2");
/*      */      this.fields[40]=this.fieldE01STATUS=new CharacterField(this.message, 958, 1, "E01STATUS");
/*      */ 
/*  262 */     synchronized (tlookup)
/*      */     {
/*  264 */       if (tlookup.isEmpty())
/*      */       {
/*  266 */         for (int i = 0; i < tnames.length; i++) {
/*  267 */           tlookup.put(tnames[i], new Integer(i));
/*      */         }
/*      */       }
/*      */     }
/*  271 */     this.taglookup = tlookup;
/*      */   }
/*      */ 
/*      */   public void setH01USER(String newvalue)
/*      */   {
/*  279 */     this.fieldH01USER.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getH01USER()
/*      */   {
/*  287 */     return this.fieldH01USER.getString();
/*      */   }
/*      */ 
/*      */   public void setH01OPCODE(String newvalue)
/*      */   {
/*  295 */     this.fieldH01OPCODE.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getH01OPCODE()
/*      */   {
/*  303 */     return this.fieldH01OPCODE.getString();
/*      */   }
/*      */ 
/*      */   public void setH01FLAG(String newvalue)
/*      */   {
/*  311 */     this.fieldH01FLAG.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getH01FLAG()
/*      */   {
/*  319 */     return this.fieldH01FLAG.getString();
/*      */   }
/*      */ 
/*      */   public void setE01REQNO(String newvalue)
/*      */   {
/*  327 */     this.fieldE01REQNO.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01REQNO()
/*      */   {
/*  335 */     return this.fieldE01REQNO.getString();
/*      */   }
/*      */ 
/*      */   public void setE01REQNO(BigDecimal newvalue)
/*      */   {
/*  343 */     this.fieldE01REQNO.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE01REQNO()
/*      */   {
/*  351 */     return this.fieldE01REQNO.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setE01RDATE(String newvalue)
/*      */   {
/*  359 */     this.fieldE01RDATE.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01RDATE()
/*      */   {
/*  367 */     return this.fieldE01RDATE.getString();
/*      */   }
/*      */ 
/*      */   public void setE01RDATE(BigDecimal newvalue)
/*      */   {
/*  375 */     this.fieldE01RDATE.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE01RDATE()
/*      */   {
/*  383 */     return this.fieldE01RDATE.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setE01NAME(String newvalue)
/*      */   {
/*  391 */     this.fieldE01NAME.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01NAME()
/*      */   {
/*  399 */     return this.fieldE01NAME.getString();
/*      */   }
/*      */ 
/*      */   public void setE01DOC(String newvalue)
/*      */   {
/*  407 */     this.fieldE01DOC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01DOC()
/*      */   {
/*  415 */     return this.fieldE01DOC.getString();
/*      */   }
/*      */ 
/*      */   public void setE01EMAIL(String newvalue)
/*      */   {
/*  423 */     this.fieldE01EMAIL.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01EMAIL()
/*      */   {
/*  431 */     return this.fieldE01EMAIL.getString();
/*      */   }
/*      */ 
/*      */   public void setE01PHN1(String newvalue)
/*      */   {
/*  439 */     this.fieldE01PHN1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01PHN1()
/*      */   {
/*  447 */     return this.fieldE01PHN1.getString();
/*      */   }
/*      */ 
/*      */   public void setE01PHN2(String newvalue)
/*      */   {
/*  455 */     this.fieldE01PHN2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01PHN2()
/*      */   {
/*  463 */     return this.fieldE01PHN2.getString();
/*      */   }
/*      */ 
/*      */   public void setE01ADDR1(String newvalue)
/*      */   {
/*  471 */     this.fieldE01ADDR1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01ADDR1()
/*      */   {
/*  479 */     return this.fieldE01ADDR1.getString();
/*      */   }
/*      */ 
/*      */   public void setE01ADDR2(String newvalue)
/*      */   {
/*  487 */     this.fieldE01ADDR2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01ADDR2()
/*      */   {
/*  495 */     return this.fieldE01ADDR2.getString();
/*      */   }
/*      */ 
/*      */   public void setE01ADDR3(String newvalue)
/*      */   {
/*  503 */     this.fieldE01ADDR3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01ADDR3()
/*      */   {
/*  511 */     return this.fieldE01ADDR3.getString();
/*      */   }
/*      */ 
/*      */   public void setE01ACCN1(String newvalue)
/*      */   {
/*  519 */     this.fieldE01ACCN1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01ACCN1()
/*      */   {
/*  527 */     return this.fieldE01ACCN1.getString();
/*      */   }
/*      */ 
/*      */   public void setE01ACCN1(BigDecimal newvalue)
/*      */   {
/*  535 */     this.fieldE01ACCN1.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE01ACCN1()
/*      */   {
/*  543 */     return this.fieldE01ACCN1.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setE01ACCN2(String newvalue)
/*      */   {
/*  551 */     this.fieldE01ACCN2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01ACCN2()
/*      */   {
/*  559 */     return this.fieldE01ACCN2.getString();
/*      */   }
/*      */ 
/*      */   public void setE01ACCN2(BigDecimal newvalue)
/*      */   {
/*  567 */     this.fieldE01ACCN2.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE01ACCN2()
/*      */   {
/*  575 */     return this.fieldE01ACCN2.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setE01ACCN3(String newvalue)
/*      */   {
/*  583 */     this.fieldE01ACCN3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01ACCN3()
/*      */   {
/*  591 */     return this.fieldE01ACCN3.getString();
/*      */   }
/*      */ 
/*      */   public void setE01ACCN3(BigDecimal newvalue)
/*      */   {
/*  599 */     this.fieldE01ACCN3.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE01ACCN3()
/*      */   {
/*  607 */     return this.fieldE01ACCN3.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setE01ACCT1(String newvalue)
/*      */   {
/*  615 */     this.fieldE01ACCT1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01ACCT1()
/*      */   {
/*  623 */     return this.fieldE01ACCT1.getString();
/*      */   }
/*      */ 
/*      */   public void setE01ACCT2(String newvalue)
/*      */   {
/*  631 */     this.fieldE01ACCT2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01ACCT2()
/*      */   {
/*  639 */     return this.fieldE01ACCT2.getString();
/*      */   }
/*      */ 
/*      */   public void setE01ACCT3(String newvalue)
/*      */   {
/*  647 */     this.fieldE01ACCT3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01ACCT3()
/*      */   {
/*  655 */     return this.fieldE01ACCT3.getString();
/*      */   }
/*      */ 
/*      */   public void setE01REPN1(String newvalue)
/*      */   {
/*  663 */     this.fieldE01REPN1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01REPN1()
/*      */   {
/*  671 */     return this.fieldE01REPN1.getString();
/*      */   }
/*      */ 
/*      */   public void setE01REPN2(String newvalue)
/*      */   {
/*  679 */     this.fieldE01REPN2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01REPN2()
/*      */   {
/*  687 */     return this.fieldE01REPN2.getString();
/*      */   }
/*      */ 
/*      */   public void setE01REPN3(String newvalue)
/*      */   {
/*  695 */     this.fieldE01REPN3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01REPN3()
/*      */   {
/*  703 */     return this.fieldE01REPN3.getString();
/*      */   }
/*      */ 
/*      */   public void setE01REPD1(String newvalue)
/*      */   {
/*  711 */     this.fieldE01REPD1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01REPD1()
/*      */   {
/*  719 */     return this.fieldE01REPD1.getString();
/*      */   }
/*      */ 
/*      */   public void setE01REPD2(String newvalue)
/*      */   {
/*  727 */     this.fieldE01REPD2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01REPD2()
/*      */   {
/*  735 */     return this.fieldE01REPD2.getString();
/*      */   }
/*      */ 
/*      */   public void setE01REPD3(String newvalue)
/*      */   {
/*  743 */     this.fieldE01REPD3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01REPD3()
/*      */   {
/*  751 */     return this.fieldE01REPD3.getString();
/*      */   }
/*      */ 
/*      */   public void setE01REPC1(String newvalue)
/*      */   {
/*  759 */     this.fieldE01REPC1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01REPC1()
/*      */   {
/*  767 */     return this.fieldE01REPC1.getString();
/*      */   }
/*      */ 
/*      */   public void setE01REPC2(String newvalue)
/*      */   {
/*  775 */     this.fieldE01REPC2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01REPC2()
/*      */   {
/*  783 */     return this.fieldE01REPC2.getString();
/*      */   }
/*      */ 
/*      */   public void setE01REPC3(String newvalue)
/*      */   {
/*  791 */     this.fieldE01REPC3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01REPC3()
/*      */   {
/*  799 */     return this.fieldE01REPC3.getString();
/*      */   }
/*      */ 
/*      */   public void setE01USERR(String newvalue)
/*      */   {
/*  807 */     this.fieldE01USERR.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01USERR()
/*      */   {
/*  815 */     return this.fieldE01USERR.getString();
/*      */   }
/*      */ 
/*      */   public void setE01PASSW(String newvalue)
/*      */   {
/*  823 */     this.fieldE01PASSW.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01PASSW()
/*      */   {
/*  831 */     return this.fieldE01PASSW.getString();
/*      */   }
/*      */ 
/*      */   public void setE01PASSWK(String newvalue)
/*      */   {
/*  839 */     this.fieldE01PASSWK.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01PASSWK()
/*      */   {
/*  847 */     return this.fieldE01PASSWK.getString();
/*      */   }
/*      */ 
/*      */   public void setE01ACTPIN(String newvalue)
/*      */   {
/*  855 */     this.fieldE01ACTPIN.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01ACTPIN()
/*      */   {
/*  863 */     return this.fieldE01ACTPIN.getString();
/*      */   }
/*      */ 
/*      */   public void setE01OBSER1(String newvalue)
/*      */   {
/*  871 */     this.fieldE01OBSER1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01OBSER1()
/*      */   {
/*  879 */     return this.fieldE01OBSER1.getString();
/*      */   }
/*      */ 
/*      */   public void setE01OBSER2(String newvalue)
/*      */   {
/*  887 */     this.fieldE01OBSER2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01OBSER2()
/*      */   {
/*  895 */     return this.fieldE01OBSER2.getString();
/*      */   }
/*      */ 
/*      */   public void setE01OBSER3(String newvalue)
/*      */   {
/*  903 */     this.fieldE01OBSER3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01OBSER3()
/*      */   {
/*  911 */     return this.fieldE01OBSER3.getString();
/*      */   }
/*      */ 
/*      */   public void setE01OBSER4(String newvalue)
/*      */   {
/*  919 */     this.fieldE01OBSER4.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01OBSER4()
/*      */   {
/*  927 */     return this.fieldE01OBSER4.getString();
/*      */   }
/*      */ 
/*      */   public void setE01OFIC1(String newvalue)
/*      */   {
/*  935 */     this.fieldE01OFIC1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01OFIC1()
/*      */   {
/*  943 */     return this.fieldE01OFIC1.getString();
/*      */   }
/*      */ 
/*      */   public void setE01OFIC2(String newvalue)
/*      */   {
/*  951 */     this.fieldE01OFIC2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01OFIC2()
/*      */   {
/*  959 */     return this.fieldE01OFIC2.getString();
/*      */   }
/*      */ 
/*      */   public void setE01OFCD1(String newvalue)
/*      */   {
/*  967 */     this.fieldE01OFCD1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01OFCD1()
/*      */   {
/*  975 */     return this.fieldE01OFCD1.getString();
/*      */   }
/*      */ 
/*      */   public void setE01OFCD1(BigDecimal newvalue)
/*      */   {
/*  983 */     this.fieldE01OFCD1.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE01OFCD1()
/*      */   {
/*  991 */     return this.fieldE01OFCD1.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setE01OFCD2(String newvalue)
/*      */   {
/*  999 */     this.fieldE01OFCD2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01OFCD2()
/*      */   {
/* 1007 */     return this.fieldE01OFCD2.getString();
/*      */   }
/*      */ 
/*      */   public void setE01OFCD2(BigDecimal newvalue)
/*      */   {
/* 1015 */     this.fieldE01OFCD2.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE01OFCD2()
/*      */   {
/* 1023 */     return this.fieldE01OFCD2.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setE01STATUS(String newvalue)
/*      */   {
/* 1031 */     this.fieldE01STATUS.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01STATUS()
/*      */   {
/* 1039 */     return this.fieldE01STATUS.getString();
/*      */   }
/*      */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.ESS2060DSMessage
 * JD-Core Version:    0.6.0
 */