/*      */ package com.activo.gateway.dibs.messages;
/*      */ 
/*      */ import com.activo.gateway.sockets.CharacterField;
/*      */ import com.activo.gateway.sockets.DecimalField;
/*      */ import com.activo.gateway.sockets.MessageField;
/*      */ import com.activo.gateway.sockets.MessageRecord;
/*      */ import java.math.BigDecimal;
/*      */ 
/*      */ public class EDD0395DSMessage extends MessageRecord
/*      */ {
/*   19 */   final int FIELDCOUNT = 37;
/*   20 */   private CharacterField fieldH01USERID = null;
/*   21 */   private CharacterField fieldH01PROGRM = null;
/*   22 */   private CharacterField fieldH01TIMSYS = null;
/*   23 */   private CharacterField fieldH01SCRCOD = null;
/*   24 */   private CharacterField fieldH01OPECOD = null;
/*   25 */   private CharacterField fieldH01FLGMAS = null;
/*   26 */   private CharacterField fieldH01FLGWK1 = null;
/*   27 */   private CharacterField fieldH01FLGWK2 = null;
/*   28 */   private CharacterField fieldH01FLGWK3 = null;
/*   29 */   private DecimalField fieldE01UNCACC = null;
/*   30 */   private CharacterField fieldE01UNCFLG = null;
/*   31 */   private DecimalField fieldE01UNCAMN = null;
/*   32 */   private DecimalField fieldE01UNCCKN = null;
/*   33 */   private DecimalField fieldE01UNCDYS = null;
/*   34 */   private DecimalField fieldE01UNCRD1 = null;
/*   35 */   private DecimalField fieldE01UNCRD2 = null;
/*   36 */   private DecimalField fieldE01UNCRD3 = null;
/*   37 */   private DecimalField fieldE01UNCMD1 = null;
/*   38 */   private DecimalField fieldE01UNCMD2 = null;
/*   39 */   private DecimalField fieldE01UNCMD3 = null;
/*   40 */   private CharacterField fieldE01UNCRSN = null;
/*   41 */   private DecimalField fieldE01UNCCUN = null;
/*   42 */   private CharacterField fieldE01UNCSTA = null;
/*   43 */   private CharacterField fieldE01UNCCON = null;
/*   44 */   private CharacterField fieldE01UNCTEL = null;
/*   45 */   private DecimalField fieldE01UNCTSQ = null;
/*   46 */   private CharacterField fieldE01UNCKBK = null;
/*   47 */   private CharacterField fieldE01UNCKBR = null;
/*   48 */   private CharacterField fieldE01UNCKAC = null;
/*   49 */   private CharacterField fieldE01UNCDES = null;
/*   50 */   private CharacterField fieldE01UNCCRM = null;
/*   51 */   private DecimalField fieldE01UNCOBR = null;
/*   52 */   private CharacterField fieldE01UNCHTY = null;
/*   53 */   private DecimalField fieldE01UNCNRM = null;
/*   54 */   private CharacterField fieldE01UNCUSR = null;
/*   55 */   private CharacterField fieldE01UNCFUS = null;
/*   56 */   private CharacterField fieldE01UNCF02 = null;
/*      */ 
/*      */   public EDD0395DSMessage()
/*      */   {
/*   63 */     createFields();
/*   64 */     initialize();
/*      */   }
/*      */ 
/*      */   protected void createFields()
/*      */   {
/*   73 */     this.recordsize = 207;
/*   74 */     this.fileid = "1010906184741";
/*   75 */     this.recordid = "563E131AAECBD";
/*   76 */     this.message = new byte[getByteLength()];
/*   77 */     this.formatname = "EDD0395DS";
/*   78 */     this.fieldnames = new String[37];
/*   79 */     this.tagnames = new String[37];
/*   80 */     this.fields = new MessageField[37];
/*      */ 
/*   82 */     this.fieldnames[0] = "H01USERID";
/*   83 */     this.tagnames[0] = "H01USERID";
/*      */      this.fields[0]=this.fieldH01USERID=new CharacterField(this.message, 10, 10, "H01USERID");
/*      */ 
/*   86 */     this.fieldnames[1] = "H01PROGRM";
/*   87 */     this.tagnames[1] = "H01PROGRM";
/*      */      this.fields[1]=this.fieldH01PROGRM=new CharacterField(this.message, 20, 10, "H01PROGRM");
/*      */ 
/*   90 */     this.fieldnames[2] = "H01TIMSYS";
/*   91 */     this.tagnames[2] = "H01TIMSYS";
/*      */      this.fields[2]=this.fieldH01TIMSYS=new CharacterField(this.message, 30, 12, "H01TIMSYS");
/*      */ 
/*   94 */     this.fieldnames[3] = "H01SCRCOD";
/*   95 */     this.tagnames[3] = "H01SCRCOD";
/*      */      this.fields[3]=this.fieldH01SCRCOD=new CharacterField(this.message, 42, 2, "H01SCRCOD");
/*      */ 
/*   98 */     this.fieldnames[4] = "H01OPECOD";
/*   99 */     this.tagnames[4] = "H01OPECOD";
/*      */      this.fields[4]=this.fieldH01OPECOD=new CharacterField(this.message, 44, 4, "H01OPECOD");
/*      */ 
/*  102 */     this.fieldnames[5] = "H01FLGMAS";
/*  103 */     this.tagnames[5] = "H01FLGMAS";
/*      */      this.fields[5]=this.fieldH01FLGMAS=new CharacterField(this.message, 48, 1, "H01FLGMAS");
/*      */ 
/*  106 */     this.fieldnames[6] = "H01FLGWK1";
/*  107 */     this.tagnames[6] = "H01FLGWK1";
/*      */      this.fields[6]=this.fieldH01FLGWK1=new CharacterField(this.message, 49, 1, "H01FLGWK1");
/*      */ 
/*  110 */     this.fieldnames[7] = "H01FLGWK2";
/*  111 */     this.tagnames[7] = "H01FLGWK2";
/*      */      this.fields[7]=this.fieldH01FLGWK2=new CharacterField(this.message, 50, 1, "H01FLGWK2");
/*      */ 
/*  114 */     this.fieldnames[8] = "H01FLGWK3";
/*  115 */     this.tagnames[8] = "H01FLGWK3";
/*      */      this.fields[8]=this.fieldH01FLGWK3=new CharacterField(this.message, 51, 1, "H01FLGWK3");
/*      */ 
/*  118 */     this.fieldnames[9] = "E01UNCACC";
/*  119 */     this.tagnames[9] = "E01UNCACC";
/*      */      this.fields[9]=this.fieldE01UNCACC=new DecimalField(this.message, 52, 13, 0, "E01UNCACC");
/*      */ 
/*  122 */     this.fieldnames[10] = "E01UNCFLG";
/*  123 */     this.tagnames[10] = "E01UNCFLG";
/*      */      this.fields[10]=this.fieldE01UNCFLG=new CharacterField(this.message, 65, 1, "E01UNCFLG");
/*      */ 
/*  126 */     this.fieldnames[11] = "E01UNCAMN";
/*  127 */     this.tagnames[11] = "E01UNCAMN";
/*      */      this.fields[11]=this.fieldE01UNCAMN=new DecimalField(this.message, 66, 17, 2, "E01UNCAMN");
/*      */ 
/*  130 */     this.fieldnames[12] = "E01UNCCKN";
/*  131 */     this.tagnames[12] = "E01UNCCKN";
/*      */      this.fields[12]=this.fieldE01UNCCKN=new DecimalField(this.message, 83, 10, 0, "E01UNCCKN");
/*      */ 
/*  134 */     this.fieldnames[13] = "E01UNCDYS";
/*  135 */     this.tagnames[13] = "E01UNCDYS";
/*      */      this.fields[13]=this.fieldE01UNCDYS=new DecimalField(this.message, 93, 5, 0, "E01UNCDYS");
/*      */ 
/*  138 */     this.fieldnames[14] = "E01UNCRD1";
/*  139 */     this.tagnames[14] = "E01UNCRD1";
/*      */      this.fields[14]=this.fieldE01UNCRD1=new DecimalField(this.message, 98, 3, 0, "E01UNCRD1");
/*      */ 
/*  142 */     this.fieldnames[15] = "E01UNCRD2";
/*  143 */     this.tagnames[15] = "E01UNCRD2";
/*      */      this.fields[15]=this.fieldE01UNCRD2=new DecimalField(this.message, 101, 3, 0, "E01UNCRD2");
/*      */ 
/*  146 */     this.fieldnames[16] = "E01UNCRD3";
/*  147 */     this.tagnames[16] = "E01UNCRD3";
/*      */      this.fields[16]=this.fieldE01UNCRD3=new DecimalField(this.message, 104, 3, 0, "E01UNCRD3");
/*      */ 
/*  150 */     this.fieldnames[17] = "E01UNCMD1";
/*  151 */     this.tagnames[17] = "E01UNCMD1";
/*      */      this.fields[17]=this.fieldE01UNCMD1=new DecimalField(this.message, 107, 3, 0, "E01UNCMD1");
/*      */ 
/*  154 */     this.fieldnames[18] = "E01UNCMD2";
/*  155 */     this.tagnames[18] = "E01UNCMD2";
/*      */      this.fields[18]=this.fieldE01UNCMD2=new DecimalField(this.message, 110, 3, 0, "E01UNCMD2");
/*      */ 
/*  158 */     this.fieldnames[19] = "E01UNCMD3";
/*  159 */     this.tagnames[19] = "E01UNCMD3";
/*      */      this.fields[19]=this.fieldE01UNCMD3=new DecimalField(this.message, 113, 3, 0, "E01UNCMD3");
/*      */ 
/*  162 */     this.fieldnames[20] = "E01UNCRSN";
/*  163 */     this.tagnames[20] = "E01UNCRSN";
/*      */      this.fields[20]=this.fieldE01UNCRSN=new CharacterField(this.message, 116, 15, "E01UNCRSN");
/*      */ 
/*  166 */     this.fieldnames[21] = "E01UNCCUN";
/*  167 */     this.tagnames[21] = "E01UNCCUN";
/*      */      this.fields[21]=this.fieldE01UNCCUN=new DecimalField(this.message, 131, 10, 0, "E01UNCCUN");
/*      */ 
/*  170 */     this.fieldnames[22] = "E01UNCSTA";
/*  171 */     this.tagnames[22] = "E01UNCSTA";
/*      */      this.fields[22]=this.fieldE01UNCSTA=new CharacterField(this.message, 141, 1, "E01UNCSTA");
/*      */ 
/*  174 */     this.fieldnames[23] = "E01UNCCON";
/*  175 */     this.tagnames[23] = "E01UNCCON";
/*      */      this.fields[23]=this.fieldE01UNCCON=new CharacterField(this.message, 142, 4, "E01UNCCON");
/*      */ 
/*  178 */     this.fieldnames[24] = "E01UNCTEL";
/*  179 */     this.tagnames[24] = "E01UNCTEL";
/*      */      this.fields[24]=this.fieldE01UNCTEL=new CharacterField(this.message, 146, 7, "E01UNCTEL");
/*      */ 
/*  182 */     this.fieldnames[25] = "E01UNCTSQ";
/*  183 */     this.tagnames[25] = "E01UNCTSQ";
/*      */      this.fields[25]=this.fieldE01UNCTSQ=new DecimalField(this.message, 153, 6, 0, "E01UNCTSQ");
/*      */ 
/*  186 */     this.fieldnames[26] = "E01UNCKBK";
/*  187 */     this.tagnames[26] = "E01UNCKBK";
/*      */      this.fields[26]=this.fieldE01UNCKBK=new CharacterField(this.message, 159, 4, "E01UNCKBK");
/*      */ 
/*  190 */     this.fieldnames[27] = "E01UNCKBR";
/*  191 */     this.tagnames[27] = "E01UNCKBR";
/*      */      this.fields[27]=this.fieldE01UNCKBR=new CharacterField(this.message, 163, 4, "E01UNCKBR");
/*      */ 
/*  194 */     this.fieldnames[28] = "E01UNCKAC";
/*  195 */     this.tagnames[28] = "E01UNCKAC";
/*      */      this.fields[28]=this.fieldE01UNCKAC=new CharacterField(this.message, 167, 15, "E01UNCKAC");
/*      */ 
/*  198 */     this.fieldnames[29] = "E01UNCDES";
/*  199 */     this.tagnames[29] = "E01UNCDES";
/*      */      this.fields[29]=this.fieldE01UNCDES=new CharacterField(this.message, 182, 5, "E01UNCDES");
/*      */ 
/*  202 */     this.fieldnames[30] = "E01UNCCRM";
/*  203 */     this.tagnames[30] = "E01UNCCRM";
/*      */      this.fields[30]=this.fieldE01UNCCRM=new CharacterField(this.message, 187, 3, "E01UNCCRM");
/*      */ 
/*  206 */     this.fieldnames[31] = "E01UNCOBR";
/*  207 */     this.tagnames[31] = "E01UNCOBR";
/*      */      this.fields[31]=this.fieldE01UNCOBR=new DecimalField(this.message, 190, 4, 0, "E01UNCOBR");
/*      */ 
/*  210 */     this.fieldnames[32] = "E01UNCHTY";
/*  211 */     this.tagnames[32] = "E01UNCHTY";
/*      */      this.fields[32]=this.fieldE01UNCHTY=new CharacterField(this.message, 194, 4, "E01UNCHTY");
/*      */ 
/*  214 */     this.fieldnames[33] = "E01UNCNRM";
/*  215 */     this.tagnames[33] = "E01UNCNRM";
/*      */      this.fields[33]=this.fieldE01UNCNRM=new DecimalField(this.message, 198, 13, 0, "E01UNCNRM");
/*      */ 
/*  218 */     this.fieldnames[34] = "E01UNCUSR";
/*  219 */     this.tagnames[34] = "E01UNCUSR";
/*      */      this.fields[34]=this.fieldE01UNCUSR=new CharacterField(this.message, 211, 4, "E01UNCUSR");
/*      */ 
/*  222 */     this.fieldnames[35] = "E01UNCFUS";
/*  223 */     this.tagnames[35] = "E01UNCFUS";
/*      */      this.fields[35]=this.fieldE01UNCFUS=new CharacterField(this.message, 215, 1, "E01UNCFUS");
/*      */ 
/*  226 */     this.fieldnames[36] = "E01UNCF02";
/*  227 */     this.tagnames[36] = "E01UNCF02";
/*      */      this.fields[36]=this.fieldE01UNCF02=new CharacterField(this.message, 216, 1, "E01UNCF02");
/*      */   }
/*      */ 
/*      */   public void setH01USERID(String newvalue)
/*      */   {
/*  237 */     this.fieldH01USERID.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getH01USERID()
/*      */   {
/*  245 */     return this.fieldH01USERID.getString();
/*      */   }
/*      */ 
/*      */   public void setH01PROGRM(String newvalue)
/*      */   {
/*  253 */     this.fieldH01PROGRM.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getH01PROGRM()
/*      */   {
/*  261 */     return this.fieldH01PROGRM.getString();
/*      */   }
/*      */ 
/*      */   public void setH01TIMSYS(String newvalue)
/*      */   {
/*  269 */     this.fieldH01TIMSYS.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getH01TIMSYS()
/*      */   {
/*  277 */     return this.fieldH01TIMSYS.getString();
/*      */   }
/*      */ 
/*      */   public void setH01SCRCOD(String newvalue)
/*      */   {
/*  285 */     this.fieldH01SCRCOD.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getH01SCRCOD()
/*      */   {
/*  293 */     return this.fieldH01SCRCOD.getString();
/*      */   }
/*      */ 
/*      */   public void setH01OPECOD(String newvalue)
/*      */   {
/*  301 */     this.fieldH01OPECOD.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getH01OPECOD()
/*      */   {
/*  309 */     return this.fieldH01OPECOD.getString();
/*      */   }
/*      */ 
/*      */   public void setH01FLGMAS(String newvalue)
/*      */   {
/*  317 */     this.fieldH01FLGMAS.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getH01FLGMAS()
/*      */   {
/*  325 */     return this.fieldH01FLGMAS.getString();
/*      */   }
/*      */ 
/*      */   public void setH01FLGWK1(String newvalue)
/*      */   {
/*  333 */     this.fieldH01FLGWK1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getH01FLGWK1()
/*      */   {
/*  341 */     return this.fieldH01FLGWK1.getString();
/*      */   }
/*      */ 
/*      */   public void setH01FLGWK2(String newvalue)
/*      */   {
/*  349 */     this.fieldH01FLGWK2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getH01FLGWK2()
/*      */   {
/*  357 */     return this.fieldH01FLGWK2.getString();
/*      */   }
/*      */ 
/*      */   public void setH01FLGWK3(String newvalue)
/*      */   {
/*  365 */     this.fieldH01FLGWK3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getH01FLGWK3()
/*      */   {
/*  373 */     return this.fieldH01FLGWK3.getString();
/*      */   }
/*      */ 
/*      */   public void setE01UNCACC(String newvalue)
/*      */   {
/*  381 */     this.fieldE01UNCACC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01UNCACC()
/*      */   {
/*  389 */     return this.fieldE01UNCACC.getString();
/*      */   }
/*      */ 
/*      */   public void setE01UNCACC(BigDecimal newvalue)
/*      */   {
/*  397 */     this.fieldE01UNCACC.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE01UNCACC()
/*      */   {
/*  405 */     return this.fieldE01UNCACC.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setE01UNCFLG(String newvalue)
/*      */   {
/*  413 */     this.fieldE01UNCFLG.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01UNCFLG()
/*      */   {
/*  421 */     return this.fieldE01UNCFLG.getString();
/*      */   }
/*      */ 
/*      */   public void setE01UNCAMN(String newvalue)
/*      */   {
/*  429 */     this.fieldE01UNCAMN.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01UNCAMN()
/*      */   {
/*  437 */     return this.fieldE01UNCAMN.getString();
/*      */   }
/*      */ 
/*      */   public void setE01UNCAMN(BigDecimal newvalue)
/*      */   {
/*  445 */     this.fieldE01UNCAMN.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE01UNCAMN()
/*      */   {
/*  453 */     return this.fieldE01UNCAMN.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setE01UNCCKN(String newvalue)
/*      */   {
/*  461 */     this.fieldE01UNCCKN.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01UNCCKN()
/*      */   {
/*  469 */     return this.fieldE01UNCCKN.getString();
/*      */   }
/*      */ 
/*      */   public void setE01UNCCKN(BigDecimal newvalue)
/*      */   {
/*  477 */     this.fieldE01UNCCKN.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE01UNCCKN()
/*      */   {
/*  485 */     return this.fieldE01UNCCKN.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setE01UNCDYS(String newvalue)
/*      */   {
/*  493 */     this.fieldE01UNCDYS.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01UNCDYS()
/*      */   {
/*  501 */     return this.fieldE01UNCDYS.getString();
/*      */   }
/*      */ 
/*      */   public void setE01UNCDYS(BigDecimal newvalue)
/*      */   {
/*  509 */     this.fieldE01UNCDYS.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE01UNCDYS()
/*      */   {
/*  517 */     return this.fieldE01UNCDYS.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setE01UNCRD1(String newvalue)
/*      */   {
/*  525 */     this.fieldE01UNCRD1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01UNCRD1()
/*      */   {
/*  533 */     return this.fieldE01UNCRD1.getString();
/*      */   }
/*      */ 
/*      */   public void setE01UNCRD1(BigDecimal newvalue)
/*      */   {
/*  541 */     this.fieldE01UNCRD1.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE01UNCRD1()
/*      */   {
/*  549 */     return this.fieldE01UNCRD1.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setE01UNCRD2(String newvalue)
/*      */   {
/*  557 */     this.fieldE01UNCRD2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01UNCRD2()
/*      */   {
/*  565 */     return this.fieldE01UNCRD2.getString();
/*      */   }
/*      */ 
/*      */   public void setE01UNCRD2(BigDecimal newvalue)
/*      */   {
/*  573 */     this.fieldE01UNCRD2.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE01UNCRD2()
/*      */   {
/*  581 */     return this.fieldE01UNCRD2.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setE01UNCRD3(String newvalue)
/*      */   {
/*  589 */     this.fieldE01UNCRD3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01UNCRD3()
/*      */   {
/*  597 */     return this.fieldE01UNCRD3.getString();
/*      */   }
/*      */ 
/*      */   public void setE01UNCRD3(BigDecimal newvalue)
/*      */   {
/*  605 */     this.fieldE01UNCRD3.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE01UNCRD3()
/*      */   {
/*  613 */     return this.fieldE01UNCRD3.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setE01UNCMD1(String newvalue)
/*      */   {
/*  621 */     this.fieldE01UNCMD1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01UNCMD1()
/*      */   {
/*  629 */     return this.fieldE01UNCMD1.getString();
/*      */   }
/*      */ 
/*      */   public void setE01UNCMD1(BigDecimal newvalue)
/*      */   {
/*  637 */     this.fieldE01UNCMD1.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE01UNCMD1()
/*      */   {
/*  645 */     return this.fieldE01UNCMD1.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setE01UNCMD2(String newvalue)
/*      */   {
/*  653 */     this.fieldE01UNCMD2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01UNCMD2()
/*      */   {
/*  661 */     return this.fieldE01UNCMD2.getString();
/*      */   }
/*      */ 
/*      */   public void setE01UNCMD2(BigDecimal newvalue)
/*      */   {
/*  669 */     this.fieldE01UNCMD2.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE01UNCMD2()
/*      */   {
/*  677 */     return this.fieldE01UNCMD2.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setE01UNCMD3(String newvalue)
/*      */   {
/*  685 */     this.fieldE01UNCMD3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01UNCMD3()
/*      */   {
/*  693 */     return this.fieldE01UNCMD3.getString();
/*      */   }
/*      */ 
/*      */   public void setE01UNCMD3(BigDecimal newvalue)
/*      */   {
/*  701 */     this.fieldE01UNCMD3.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE01UNCMD3()
/*      */   {
/*  709 */     return this.fieldE01UNCMD3.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setE01UNCRSN(String newvalue)
/*      */   {
/*  717 */     this.fieldE01UNCRSN.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01UNCRSN()
/*      */   {
/*  725 */     return this.fieldE01UNCRSN.getString();
/*      */   }
/*      */ 
/*      */   public void setE01UNCCUN(String newvalue)
/*      */   {
/*  733 */     this.fieldE01UNCCUN.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01UNCCUN()
/*      */   {
/*  741 */     return this.fieldE01UNCCUN.getString();
/*      */   }
/*      */ 
/*      */   public void setE01UNCCUN(BigDecimal newvalue)
/*      */   {
/*  749 */     this.fieldE01UNCCUN.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE01UNCCUN()
/*      */   {
/*  757 */     return this.fieldE01UNCCUN.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setE01UNCSTA(String newvalue)
/*      */   {
/*  765 */     this.fieldE01UNCSTA.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01UNCSTA()
/*      */   {
/*  773 */     return this.fieldE01UNCSTA.getString();
/*      */   }
/*      */ 
/*      */   public void setE01UNCCON(String newvalue)
/*      */   {
/*  781 */     this.fieldE01UNCCON.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01UNCCON()
/*      */   {
/*  789 */     return this.fieldE01UNCCON.getString();
/*      */   }
/*      */ 
/*      */   public void setE01UNCTEL(String newvalue)
/*      */   {
/*  797 */     this.fieldE01UNCTEL.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01UNCTEL()
/*      */   {
/*  805 */     return this.fieldE01UNCTEL.getString();
/*      */   }
/*      */ 
/*      */   public void setE01UNCTSQ(String newvalue)
/*      */   {
/*  813 */     this.fieldE01UNCTSQ.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01UNCTSQ()
/*      */   {
/*  821 */     return this.fieldE01UNCTSQ.getString();
/*      */   }
/*      */ 
/*      */   public void setE01UNCTSQ(BigDecimal newvalue)
/*      */   {
/*  829 */     this.fieldE01UNCTSQ.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE01UNCTSQ()
/*      */   {
/*  837 */     return this.fieldE01UNCTSQ.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setE01UNCKBK(String newvalue)
/*      */   {
/*  845 */     this.fieldE01UNCKBK.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01UNCKBK()
/*      */   {
/*  853 */     return this.fieldE01UNCKBK.getString();
/*      */   }
/*      */ 
/*      */   public void setE01UNCKBR(String newvalue)
/*      */   {
/*  861 */     this.fieldE01UNCKBR.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01UNCKBR()
/*      */   {
/*  869 */     return this.fieldE01UNCKBR.getString();
/*      */   }
/*      */ 
/*      */   public void setE01UNCKAC(String newvalue)
/*      */   {
/*  877 */     this.fieldE01UNCKAC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01UNCKAC()
/*      */   {
/*  885 */     return this.fieldE01UNCKAC.getString();
/*      */   }
/*      */ 
/*      */   public void setE01UNCDES(String newvalue)
/*      */   {
/*  893 */     this.fieldE01UNCDES.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01UNCDES()
/*      */   {
/*  901 */     return this.fieldE01UNCDES.getString();
/*      */   }
/*      */ 
/*      */   public void setE01UNCCRM(String newvalue)
/*      */   {
/*  909 */     this.fieldE01UNCCRM.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01UNCCRM()
/*      */   {
/*  917 */     return this.fieldE01UNCCRM.getString();
/*      */   }
/*      */ 
/*      */   public void setE01UNCOBR(String newvalue)
/*      */   {
/*  925 */     this.fieldE01UNCOBR.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01UNCOBR()
/*      */   {
/*  933 */     return this.fieldE01UNCOBR.getString();
/*      */   }
/*      */ 
/*      */   public void setE01UNCOBR(BigDecimal newvalue)
/*      */   {
/*  941 */     this.fieldE01UNCOBR.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE01UNCOBR()
/*      */   {
/*  949 */     return this.fieldE01UNCOBR.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setE01UNCHTY(String newvalue)
/*      */   {
/*  957 */     this.fieldE01UNCHTY.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01UNCHTY()
/*      */   {
/*  965 */     return this.fieldE01UNCHTY.getString();
/*      */   }
/*      */ 
/*      */   public void setE01UNCNRM(String newvalue)
/*      */   {
/*  973 */     this.fieldE01UNCNRM.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01UNCNRM()
/*      */   {
/*  981 */     return this.fieldE01UNCNRM.getString();
/*      */   }
/*      */ 
/*      */   public void setE01UNCNRM(BigDecimal newvalue)
/*      */   {
/*  989 */     this.fieldE01UNCNRM.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE01UNCNRM()
/*      */   {
/*  997 */     return this.fieldE01UNCNRM.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setE01UNCUSR(String newvalue)
/*      */   {
/* 1005 */     this.fieldE01UNCUSR.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01UNCUSR()
/*      */   {
/* 1013 */     return this.fieldE01UNCUSR.getString();
/*      */   }
/*      */ 
/*      */   public void setE01UNCFUS(String newvalue)
/*      */   {
/* 1021 */     this.fieldE01UNCFUS.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01UNCFUS()
/*      */   {
/* 1029 */     return this.fieldE01UNCFUS.getString();
/*      */   }
/*      */ 
/*      */   public void setE01UNCF02(String newvalue)
/*      */   {
/* 1037 */     this.fieldE01UNCF02.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01UNCF02()
/*      */   {
/* 1045 */     return this.fieldE01UNCF02.getString();
/*      */   }
/*      */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.datapro.dibs.messages.EDD0395DSMessage
 * JD-Core Version:    0.6.0
 */