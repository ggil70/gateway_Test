/*      */ package com.activo.gateway.dibs.messages;
/*      */ 
/*      */ import java.math.BigDecimal;
import java.util.Hashtable;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*      */ 
/*      */ public class TINQDSJV2Message extends MessageRecord
/*      */ {
/*   17 */   static final String[] fldnames = { 
/*   18 */     "TINUSR", 
/*   19 */     "TINDACC", 
/*   20 */     "TINTYP", 
/*   21 */     "TINRID", 
/*   22 */     "TINRNM", 
/*   23 */     "TINSID", 
/*   24 */     "TINSNM", 
/*   25 */     "TINATY", 
/*   26 */     "TINDCY", 
/*   27 */     "TINREF", 
/*   28 */     "TINIMD", 
/*   29 */     "TINOMD", 
/*   30 */     "TINID1", 
/*   31 */     "TINID2", 
/*   32 */     "TINID3", 
/*   33 */     "TINITM", 
/*   34 */     "TINVD1", 
/*   35 */     "TINVD2", 
/*   36 */     "TINVD3", 
/*   37 */     "TINRD1", 
/*   38 */     "TINRD2", 
/*   39 */     "TINRD3", 
/*   40 */     "TINTRM", 
/*   41 */     "TINAMT", 
/*   42 */     "TINCAM", 
/*   43 */     "TINCOA", 
/*   44 */     "TINCACC", 
/*   45 */     "TINCCY", 
/*   46 */     "TINNUM", 
/*   47 */     "TINOC1", 
/*   48 */     "TINOC2", 
/*   49 */     "TINOC3", 
/*   50 */     "TINOC4", 
/*   51 */     "TINOC5", 
/*   52 */     "TINOB1", 
/*   53 */     "TINOB2", 
/*   54 */     "TINOB3", 
/*   55 */     "TINOB4", 
/*   56 */     "TINOB5", 
/*   57 */     "TINBC1", 
/*   58 */     "TINBC2", 
/*   59 */     "TINBC3", 
/*   60 */     "TINBC4", 
/*   61 */     "TINBC5", 
/*   62 */     "TINBB1", 
/*   63 */     "TINBB2", 
/*   64 */     "TINBB3", 
/*   65 */     "TINBB4", 
/*   66 */     "TINBB5", 
/*   67 */     "TINBRF", 
/*   68 */     "TINIB1", 
/*   69 */     "TINIB2", 
/*   70 */     "TINIB3", 
/*   71 */     "TINIB4", 
/*   72 */     "TINIB5", 
/*   73 */     "TINOBI1", 
/*   74 */     "TINOBI2", 
/*   75 */     "TINOBI3", 
/*   76 */     "TINOBI4", 
/*   77 */     "TINBBI1", 
/*   78 */     "TINBBI2", 
/*   79 */     "TINBBI3", 
/*   80 */     "TINBBI4", 
/*   81 */     "TINCOI4", 
/*   82 */     "TINCHB" };
/*      */ 
/*   84 */   static final String[] tnames = { 
/*   85 */     "TINUSR", 
/*   86 */     "TINDACC", 
/*   87 */     "TINTYP", 
/*   88 */     "TINRID", 
/*   89 */     "TINRNM", 
/*   90 */     "TINSID", 
/*   91 */     "TINSNM", 
/*   92 */     "TINATY", 
/*   93 */     "TINDCY", 
/*   94 */     "TINREF", 
/*   95 */     "TINIMD", 
/*   96 */     "TINOMD", 
/*   97 */     "TINID1", 
/*   98 */     "TINID2", 
/*   99 */     "TINID3", 
/*  100 */     "TINITM", 
/*  101 */     "TINVD1", 
/*  102 */     "TINVD2", 
/*  103 */     "TINVD3", 
/*  104 */     "TINRD1", 
/*  105 */     "TINRD2", 
/*  106 */     "TINRD3", 
/*  107 */     "TINTRM", 
/*  108 */     "TINAMT", 
/*  109 */     "TINCAM", 
/*  110 */     "TINCOA", 
/*  111 */     "TINCACC", 
/*  112 */     "TINCCY", 
/*  113 */     "TINNUM", 
/*  114 */     "TINOC1", 
/*  115 */     "TINOC2", 
/*  116 */     "TINOC3", 
/*  117 */     "TINOC4", 
/*  118 */     "TINOC5", 
/*  119 */     "TINOB1", 
/*  120 */     "TINOB2", 
/*  121 */     "TINOB3", 
/*  122 */     "TINOB4", 
/*  123 */     "TINOB5", 
/*  124 */     "TINBC1", 
/*  125 */     "TINBC2", 
/*  126 */     "TINBC3", 
/*  127 */     "TINBC4", 
/*  128 */     "TINBC5", 
/*  129 */     "TINBB1", 
/*  130 */     "TINBB2", 
/*  131 */     "TINBB3", 
/*  132 */     "TINBB4", 
/*  133 */     "TINBB5", 
/*  134 */     "TINBRF", 
/*  135 */     "TINIB1", 
/*  136 */     "TINIB2", 
/*  137 */     "TINIB3", 
/*  138 */     "TINIB4", 
/*  139 */     "TINIB5", 
/*  140 */     "TINOBI1", 
/*  141 */     "TINOBI2", 
/*  142 */     "TINOBI3", 
/*  143 */     "TINOBI4", 
/*  144 */     "TINBBI1", 
/*  145 */     "TINBBI2", 
/*  146 */     "TINBBI3", 
/*  147 */     "TINBBI4", 
/*  148 */     "TINCOI4", 
/*  149 */     "TINCHB" };
/*      */   static final String fid = "1110614152858";
/*      */   static final String rid = "423BA75A6C162";
/*      */   static final String fmtname = "TINQDSJV2";
/*  154 */   final int FIELDCOUNT = 65;
/*  155 */   private static Hashtable tlookup = new Hashtable();
/*  156 */   private CharacterField fieldTINUSR = null;
/*  157 */   private DecimalField fieldTINDACC = null;
/*  158 */   private CharacterField fieldTINTYP = null;
/*  159 */   private CharacterField fieldTINRID = null;
/*  160 */   private CharacterField fieldTINRNM = null;
/*  161 */   private CharacterField fieldTINSID = null;
/*  162 */   private CharacterField fieldTINSNM = null;
/*  163 */   private CharacterField fieldTINATY = null;
/*  164 */   private CharacterField fieldTINDCY = null;
/*  165 */   private CharacterField fieldTINREF = null;
/*  166 */   private CharacterField fieldTINIMD = null;
/*  167 */   private CharacterField fieldTINOMD = null;
/*  168 */   private DecimalField fieldTINID1 = null;
/*  169 */   private DecimalField fieldTINID2 = null;
/*  170 */   private DecimalField fieldTINID3 = null;
/*  171 */   private DecimalField fieldTINITM = null;
/*  172 */   private DecimalField fieldTINVD1 = null;
/*  173 */   private DecimalField fieldTINVD2 = null;
/*  174 */   private DecimalField fieldTINVD3 = null;
/*  175 */   private DecimalField fieldTINRD1 = null;
/*  176 */   private DecimalField fieldTINRD2 = null;
/*  177 */   private DecimalField fieldTINRD3 = null;
/*  178 */   private DecimalField fieldTINTRM = null;
/*  179 */   private DecimalField fieldTINAMT = null;
/*  180 */   private DecimalField fieldTINCAM = null;
/*  181 */   private DecimalField fieldTINCOA = null;
/*  182 */   private DecimalField fieldTINCACC = null;
/*  183 */   private CharacterField fieldTINCCY = null;
/*  184 */   private CharacterField fieldTINNUM = null;
/*  185 */   private CharacterField fieldTINOC1 = null;
/*  186 */   private CharacterField fieldTINOC2 = null;
/*  187 */   private CharacterField fieldTINOC3 = null;
/*  188 */   private CharacterField fieldTINOC4 = null;
/*  189 */   private CharacterField fieldTINOC5 = null;
/*  190 */   private CharacterField fieldTINOB1 = null;
/*  191 */   private CharacterField fieldTINOB2 = null;
/*  192 */   private CharacterField fieldTINOB3 = null;
/*  193 */   private CharacterField fieldTINOB4 = null;
/*  194 */   private CharacterField fieldTINOB5 = null;
/*  195 */   private CharacterField fieldTINBC1 = null;
/*  196 */   private CharacterField fieldTINBC2 = null;
/*  197 */   private CharacterField fieldTINBC3 = null;
/*  198 */   private CharacterField fieldTINBC4 = null;
/*  199 */   private CharacterField fieldTINBC5 = null;
/*  200 */   private CharacterField fieldTINBB1 = null;
/*  201 */   private CharacterField fieldTINBB2 = null;
/*  202 */   private CharacterField fieldTINBB3 = null;
/*  203 */   private CharacterField fieldTINBB4 = null;
/*  204 */   private CharacterField fieldTINBB5 = null;
/*  205 */   private CharacterField fieldTINBRF = null;
/*  206 */   private CharacterField fieldTINIB1 = null;
/*  207 */   private CharacterField fieldTINIB2 = null;
/*  208 */   private CharacterField fieldTINIB3 = null;
/*  209 */   private CharacterField fieldTINIB4 = null;
/*  210 */   private CharacterField fieldTINIB5 = null;
/*  211 */   private CharacterField fieldTINOBI1 = null;
/*  212 */   private CharacterField fieldTINOBI2 = null;
/*  213 */   private CharacterField fieldTINOBI3 = null;
/*  214 */   private CharacterField fieldTINOBI4 = null;
/*  215 */   private CharacterField fieldTINBBI1 = null;
/*  216 */   private CharacterField fieldTINBBI2 = null;
/*  217 */   private CharacterField fieldTINBBI3 = null;
/*  218 */   private CharacterField fieldTINBBI4 = null;
/*  219 */   private CharacterField fieldTINCOI4 = null;
/*  220 */   private CharacterField fieldTINCHB = null;
/*      */ 
/*      */   public TINQDSJV2Message()
/*      */   {
/*  227 */     createFields();
/*  228 */     initialize();
/*      */   }
/*      */ 
/*      */   protected void createFields()
/*      */   {
/*  237 */     this.recordsize = 1484;
/*  238 */     this.fileid = "1110614152858";
/*  239 */     this.recordid = "423BA75A6C162";
/*  240 */     this.message = new byte[getByteLength()];
/*  241 */     this.formatname = "TINQDSJV2";
/*  242 */     this.fieldnames = fldnames;
/*  243 */     this.tagnames = tnames;
/*  244 */     this.fields = new MessageField[65];
/*      */      this.fields[0]=this.fieldTINUSR=new CharacterField(this.message, 10, 10, "TINUSR");
/*      */      this.fields[1]=this.fieldTINDACC=new DecimalField(this.message, 20, 13, 0, "TINDACC");
/*      */      this.fields[2]=this.fieldTINTYP=new CharacterField(this.message, 33, 1, "TINTYP");
/*      */      this.fields[3]=this.fieldTINRID=new CharacterField(this.message, 34, 12, "TINRID");
/*      */      this.fields[4]=this.fieldTINRNM=new CharacterField(this.message, 46, 18, "TINRNM");
/*      */      this.fields[5]=this.fieldTINSID=new CharacterField(this.message, 64, 12, "TINSID");
/*      */      this.fields[6]=this.fieldTINSNM=new CharacterField(this.message, 76, 18, "TINSNM");
/*      */      this.fields[7]=this.fieldTINATY=new CharacterField(this.message, 94, 1, "TINATY");
/*      */      this.fields[8]=this.fieldTINDCY=new CharacterField(this.message, 95, 3, "TINDCY");
/*      */      this.fields[9]=this.fieldTINREF=new CharacterField(this.message, 98, 16, "TINREF");
/*      */      this.fields[10]=this.fieldTINIMD=new CharacterField(this.message, 114, 22, "TINIMD");
/*      */      this.fields[11]=this.fieldTINOMD=new CharacterField(this.message, 136, 34, "TINOMD");
/*      */      this.fields[12]=this.fieldTINID1=new DecimalField(this.message, 170, 3, 0, "TINID1");
/*      */      this.fields[13]=this.fieldTINID2=new DecimalField(this.message, 173, 3, 0, "TINID2");
/*      */      this.fields[14]=this.fieldTINID3=new DecimalField(this.message, 176, 3, 0, "TINID3");
/*      */      this.fields[15]=this.fieldTINITM=new DecimalField(this.message, 179, 7, 0, "TINITM");
/*      */      this.fields[16]=this.fieldTINVD1=new DecimalField(this.message, 186, 3, 0, "TINVD1");
/*      */      this.fields[17]=this.fieldTINVD2=new DecimalField(this.message, 189, 3, 0, "TINVD2");
/*      */      this.fields[18]=this.fieldTINVD3=new DecimalField(this.message, 192, 3, 0, "TINVD3");
/*      */      this.fields[19]=this.fieldTINRD1=new DecimalField(this.message, 195, 3, 0, "TINRD1");
/*      */      this.fields[20]=this.fieldTINRD2=new DecimalField(this.message, 198, 3, 0, "TINRD2");
/*      */      this.fields[21]=this.fieldTINRD3=new DecimalField(this.message, 201, 3, 0, "TINRD3");
/*      */      this.fields[22]=this.fieldTINTRM=new DecimalField(this.message, 204, 7, 0, "TINTRM");
/*      */      this.fields[23]=this.fieldTINAMT=new DecimalField(this.message, 211, 17, 2, "TINAMT");
/*      */      this.fields[24]=this.fieldTINCAM=new DecimalField(this.message, 228, 17, 2, "TINCAM");
/*      */      this.fields[25]=this.fieldTINCOA=new DecimalField(this.message, 245, 17, 2, "TINCOA");
/*      */      this.fields[26]=this.fieldTINCACC=new DecimalField(this.message, 262, 13, 0, "TINCACC");
/*      */      this.fields[27]=this.fieldTINCCY=new CharacterField(this.message, 275, 3, "TINCCY");
/*      */      this.fields[28]=this.fieldTINNUM=new CharacterField(this.message, 278, 9, "TINNUM");
/*      */      this.fields[29]=this.fieldTINOC1=new CharacterField(this.message, 287, 35, "TINOC1");
/*      */      this.fields[30]=this.fieldTINOC2=new CharacterField(this.message, 322, 35, "TINOC2");
/*      */      this.fields[31]=this.fieldTINOC3=new CharacterField(this.message, 357, 35, "TINOC3");
/*      */      this.fields[32]=this.fieldTINOC4=new CharacterField(this.message, 392, 35, "TINOC4");
/*      */      this.fields[33]=this.fieldTINOC5=new CharacterField(this.message, 427, 35, "TINOC5");
/*      */      this.fields[34]=this.fieldTINOB1=new CharacterField(this.message, 462, 35, "TINOB1");
/*      */      this.fields[35]=this.fieldTINOB2=new CharacterField(this.message, 497, 35, "TINOB2");
/*      */      this.fields[36]=this.fieldTINOB3=new CharacterField(this.message, 532, 35, "TINOB3");
/*      */      this.fields[37]=this.fieldTINOB4=new CharacterField(this.message, 567, 35, "TINOB4");
/*      */      this.fields[38]=this.fieldTINOB5=new CharacterField(this.message, 602, 35, "TINOB5");
/*      */      this.fields[39]=this.fieldTINBC1=new CharacterField(this.message, 637, 35, "TINBC1");
/*      */      this.fields[40]=this.fieldTINBC2=new CharacterField(this.message, 672, 35, "TINBC2");
/*      */      this.fields[41]=this.fieldTINBC3=new CharacterField(this.message, 707, 35, "TINBC3");
/*      */      this.fields[42]=this.fieldTINBC4=new CharacterField(this.message, 742, 35, "TINBC4");
/*      */      this.fields[43]=this.fieldTINBC5=new CharacterField(this.message, 777, 35, "TINBC5");
/*      */      this.fields[44]=this.fieldTINBB1=new CharacterField(this.message, 812, 35, "TINBB1");
/*      */      this.fields[45]=this.fieldTINBB2=new CharacterField(this.message, 847, 35, "TINBB2");
/*      */      this.fields[46]=this.fieldTINBB3=new CharacterField(this.message, 882, 35, "TINBB3");
/*      */      this.fields[47]=this.fieldTINBB4=new CharacterField(this.message, 917, 35, "TINBB4");
/*      */      this.fields[48]=this.fieldTINBB5=new CharacterField(this.message, 952, 35, "TINBB5");
/*      */      this.fields[49]=this.fieldTINBRF=new CharacterField(this.message, 987, 16, "TINBRF");
/*      */      this.fields[50]=this.fieldTINIB1=new CharacterField(this.message, 1003, 35, "TINIB1");
/*      */      this.fields[51]=this.fieldTINIB2=new CharacterField(this.message, 1038, 35, "TINIB2");
/*      */      this.fields[52]=this.fieldTINIB3=new CharacterField(this.message, 1073, 35, "TINIB3");
/*      */      this.fields[53]=this.fieldTINIB4=new CharacterField(this.message, 1108, 35, "TINIB4");
/*      */      this.fields[54]=this.fieldTINIB5=new CharacterField(this.message, 1143, 35, "TINIB5");
/*      */      this.fields[55]=this.fieldTINOBI1=new CharacterField(this.message, 1178, 35, "TINOBI1");
/*      */      this.fields[56]=this.fieldTINOBI2=new CharacterField(this.message, 1213, 35, "TINOBI2");
/*      */      this.fields[57]=this.fieldTINOBI3=new CharacterField(this.message, 1248, 35, "TINOBI3");
/*      */      this.fields[58]=this.fieldTINOBI4=new CharacterField(this.message, 1283, 35, "TINOBI4");
/*      */      this.fields[59]=this.fieldTINBBI1=new CharacterField(this.message, 1318, 35, "TINBBI1");
/*      */      this.fields[60]=this.fieldTINBBI2=new CharacterField(this.message, 1353, 35, "TINBBI2");
/*      */      this.fields[61]=this.fieldTINBBI3=new CharacterField(this.message, 1388, 35, "TINBBI3");
/*      */      this.fields[62]=this.fieldTINBBI4=new CharacterField(this.message, 1423, 35, "TINBBI4");
/*      */      this.fields[63]=this.fieldTINCOI4=new CharacterField(this.message, 1458, 35, "TINCOI4");
/*      */      this.fields[64]=this.fieldTINCHB=new CharacterField(this.message, 1493, 1, "TINCHB");
/*      */ 
/*  377 */     synchronized (tlookup)
/*      */     {
/*  379 */       if (tlookup.isEmpty())
/*      */       {
/*  381 */         for (int i = 0; i < tnames.length; i++) {
/*  382 */           tlookup.put(tnames[i], new Integer(i));
/*      */         }
/*      */       }
/*      */     }
/*  386 */     this.taglookup = tlookup;
/*      */   }
/*      */ 
/*      */   public void setTINUSR(String newvalue)
/*      */   {
/*  394 */     this.fieldTINUSR.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getTINUSR()
/*      */   {
/*  402 */     return this.fieldTINUSR.getString();
/*      */   }
/*      */ 
/*      */   public void setTINDACC(String newvalue)
/*      */   {
/*  410 */     this.fieldTINDACC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getTINDACC()
/*      */   {
/*  418 */     return this.fieldTINDACC.getString();
/*      */   }
/*      */ 
/*      */   public void setTINDACC(BigDecimal newvalue)
/*      */   {
/*  426 */     this.fieldTINDACC.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalTINDACC()
/*      */   {
/*  434 */     return this.fieldTINDACC.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setTINTYP(String newvalue)
/*      */   {
/*  442 */     this.fieldTINTYP.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getTINTYP()
/*      */   {
/*  450 */     return this.fieldTINTYP.getString();
/*      */   }
/*      */ 
/*      */   public void setTINRID(String newvalue)
/*      */   {
/*  458 */     this.fieldTINRID.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getTINRID()
/*      */   {
/*  466 */     return this.fieldTINRID.getString();
/*      */   }
/*      */ 
/*      */   public void setTINRNM(String newvalue)
/*      */   {
/*  474 */     this.fieldTINRNM.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getTINRNM()
/*      */   {
/*  482 */     return this.fieldTINRNM.getString();
/*      */   }
/*      */ 
/*      */   public void setTINSID(String newvalue)
/*      */   {
/*  490 */     this.fieldTINSID.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getTINSID()
/*      */   {
/*  498 */     return this.fieldTINSID.getString();
/*      */   }
/*      */ 
/*      */   public void setTINSNM(String newvalue)
/*      */   {
/*  506 */     this.fieldTINSNM.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getTINSNM()
/*      */   {
/*  514 */     return this.fieldTINSNM.getString();
/*      */   }
/*      */ 
/*      */   public void setTINATY(String newvalue)
/*      */   {
/*  522 */     this.fieldTINATY.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getTINATY()
/*      */   {
/*  530 */     return this.fieldTINATY.getString();
/*      */   }
/*      */ 
/*      */   public void setTINDCY(String newvalue)
/*      */   {
/*  538 */     this.fieldTINDCY.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getTINDCY()
/*      */   {
/*  546 */     return this.fieldTINDCY.getString();
/*      */   }
/*      */ 
/*      */   public void setTINREF(String newvalue)
/*      */   {
/*  554 */     this.fieldTINREF.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getTINREF()
/*      */   {
/*  562 */     return this.fieldTINREF.getString();
/*      */   }
/*      */ 
/*      */   public void setTINIMD(String newvalue)
/*      */   {
/*  570 */     this.fieldTINIMD.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getTINIMD()
/*      */   {
/*  578 */     return this.fieldTINIMD.getString();
/*      */   }
/*      */ 
/*      */   public void setTINOMD(String newvalue)
/*      */   {
/*  586 */     this.fieldTINOMD.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getTINOMD()
/*      */   {
/*  594 */     return this.fieldTINOMD.getString();
/*      */   }
/*      */ 
/*      */   public void setTINID1(String newvalue)
/*      */   {
/*  602 */     this.fieldTINID1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getTINID1()
/*      */   {
/*  610 */     return this.fieldTINID1.getString();
/*      */   }
/*      */ 
/*      */   public void setTINID1(BigDecimal newvalue)
/*      */   {
/*  618 */     this.fieldTINID1.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalTINID1()
/*      */   {
/*  626 */     return this.fieldTINID1.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setTINID2(String newvalue)
/*      */   {
/*  634 */     this.fieldTINID2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getTINID2()
/*      */   {
/*  642 */     return this.fieldTINID2.getString();
/*      */   }
/*      */ 
/*      */   public void setTINID2(BigDecimal newvalue)
/*      */   {
/*  650 */     this.fieldTINID2.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalTINID2()
/*      */   {
/*  658 */     return this.fieldTINID2.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setTINID3(String newvalue)
/*      */   {
/*  666 */     this.fieldTINID3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getTINID3()
/*      */   {
/*  674 */     return this.fieldTINID3.getString();
/*      */   }
/*      */ 
/*      */   public void setTINID3(BigDecimal newvalue)
/*      */   {
/*  682 */     this.fieldTINID3.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalTINID3()
/*      */   {
/*  690 */     return this.fieldTINID3.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setTINITM(String newvalue)
/*      */   {
/*  698 */     this.fieldTINITM.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getTINITM()
/*      */   {
/*  706 */     return this.fieldTINITM.getString();
/*      */   }
/*      */ 
/*      */   public void setTINITM(BigDecimal newvalue)
/*      */   {
/*  714 */     this.fieldTINITM.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalTINITM()
/*      */   {
/*  722 */     return this.fieldTINITM.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setTINVD1(String newvalue)
/*      */   {
/*  730 */     this.fieldTINVD1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getTINVD1()
/*      */   {
/*  738 */     return this.fieldTINVD1.getString();
/*      */   }
/*      */ 
/*      */   public void setTINVD1(BigDecimal newvalue)
/*      */   {
/*  746 */     this.fieldTINVD1.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalTINVD1()
/*      */   {
/*  754 */     return this.fieldTINVD1.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setTINVD2(String newvalue)
/*      */   {
/*  762 */     this.fieldTINVD2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getTINVD2()
/*      */   {
/*  770 */     return this.fieldTINVD2.getString();
/*      */   }
/*      */ 
/*      */   public void setTINVD2(BigDecimal newvalue)
/*      */   {
/*  778 */     this.fieldTINVD2.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalTINVD2()
/*      */   {
/*  786 */     return this.fieldTINVD2.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setTINVD3(String newvalue)
/*      */   {
/*  794 */     this.fieldTINVD3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getTINVD3()
/*      */   {
/*  802 */     return this.fieldTINVD3.getString();
/*      */   }
/*      */ 
/*      */   public void setTINVD3(BigDecimal newvalue)
/*      */   {
/*  810 */     this.fieldTINVD3.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalTINVD3()
/*      */   {
/*  818 */     return this.fieldTINVD3.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setTINRD1(String newvalue)
/*      */   {
/*  826 */     this.fieldTINRD1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getTINRD1()
/*      */   {
/*  834 */     return this.fieldTINRD1.getString();
/*      */   }
/*      */ 
/*      */   public void setTINRD1(BigDecimal newvalue)
/*      */   {
/*  842 */     this.fieldTINRD1.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalTINRD1()
/*      */   {
/*  850 */     return this.fieldTINRD1.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setTINRD2(String newvalue)
/*      */   {
/*  858 */     this.fieldTINRD2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getTINRD2()
/*      */   {
/*  866 */     return this.fieldTINRD2.getString();
/*      */   }
/*      */ 
/*      */   public void setTINRD2(BigDecimal newvalue)
/*      */   {
/*  874 */     this.fieldTINRD2.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalTINRD2()
/*      */   {
/*  882 */     return this.fieldTINRD2.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setTINRD3(String newvalue)
/*      */   {
/*  890 */     this.fieldTINRD3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getTINRD3()
/*      */   {
/*  898 */     return this.fieldTINRD3.getString();
/*      */   }
/*      */ 
/*      */   public void setTINRD3(BigDecimal newvalue)
/*      */   {
/*  906 */     this.fieldTINRD3.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalTINRD3()
/*      */   {
/*  914 */     return this.fieldTINRD3.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setTINTRM(String newvalue)
/*      */   {
/*  922 */     this.fieldTINTRM.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getTINTRM()
/*      */   {
/*  930 */     return this.fieldTINTRM.getString();
/*      */   }
/*      */ 
/*      */   public void setTINTRM(BigDecimal newvalue)
/*      */   {
/*  938 */     this.fieldTINTRM.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalTINTRM()
/*      */   {
/*  946 */     return this.fieldTINTRM.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setTINAMT(String newvalue)
/*      */   {
/*  954 */     this.fieldTINAMT.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getTINAMT()
/*      */   {
/*  962 */     return this.fieldTINAMT.getString();
/*      */   }
/*      */ 
/*      */   public void setTINAMT(BigDecimal newvalue)
/*      */   {
/*  970 */     this.fieldTINAMT.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalTINAMT()
/*      */   {
/*  978 */     return this.fieldTINAMT.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setTINCAM(String newvalue)
/*      */   {
/*  986 */     this.fieldTINCAM.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getTINCAM()
/*      */   {
/*  994 */     return this.fieldTINCAM.getString();
/*      */   }
/*      */ 
/*      */   public void setTINCAM(BigDecimal newvalue)
/*      */   {
/* 1002 */     this.fieldTINCAM.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalTINCAM()
/*      */   {
/* 1010 */     return this.fieldTINCAM.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setTINCOA(String newvalue)
/*      */   {
/* 1018 */     this.fieldTINCOA.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getTINCOA()
/*      */   {
/* 1026 */     return this.fieldTINCOA.getString();
/*      */   }
/*      */ 
/*      */   public void setTINCOA(BigDecimal newvalue)
/*      */   {
/* 1034 */     this.fieldTINCOA.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalTINCOA()
/*      */   {
/* 1042 */     return this.fieldTINCOA.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setTINCACC(String newvalue)
/*      */   {
/* 1050 */     this.fieldTINCACC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getTINCACC()
/*      */   {
/* 1058 */     return this.fieldTINCACC.getString();
/*      */   }
/*      */ 
/*      */   public void setTINCACC(BigDecimal newvalue)
/*      */   {
/* 1066 */     this.fieldTINCACC.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalTINCACC()
/*      */   {
/* 1074 */     return this.fieldTINCACC.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setTINCCY(String newvalue)
/*      */   {
/* 1082 */     this.fieldTINCCY.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getTINCCY()
/*      */   {
/* 1090 */     return this.fieldTINCCY.getString();
/*      */   }
/*      */ 
/*      */   public void setTINNUM(String newvalue)
/*      */   {
/* 1098 */     this.fieldTINNUM.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getTINNUM()
/*      */   {
/* 1106 */     return this.fieldTINNUM.getString();
/*      */   }
/*      */ 
/*      */   public void setTINOC1(String newvalue)
/*      */   {
/* 1114 */     this.fieldTINOC1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getTINOC1()
/*      */   {
/* 1122 */     return this.fieldTINOC1.getString();
/*      */   }
/*      */ 
/*      */   public void setTINOC2(String newvalue)
/*      */   {
/* 1130 */     this.fieldTINOC2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getTINOC2()
/*      */   {
/* 1138 */     return this.fieldTINOC2.getString();
/*      */   }
/*      */ 
/*      */   public void setTINOC3(String newvalue)
/*      */   {
/* 1146 */     this.fieldTINOC3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getTINOC3()
/*      */   {
/* 1154 */     return this.fieldTINOC3.getString();
/*      */   }
/*      */ 
/*      */   public void setTINOC4(String newvalue)
/*      */   {
/* 1162 */     this.fieldTINOC4.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getTINOC4()
/*      */   {
/* 1170 */     return this.fieldTINOC4.getString();
/*      */   }
/*      */ 
/*      */   public void setTINOC5(String newvalue)
/*      */   {
/* 1178 */     this.fieldTINOC5.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getTINOC5()
/*      */   {
/* 1186 */     return this.fieldTINOC5.getString();
/*      */   }
/*      */ 
/*      */   public void setTINOB1(String newvalue)
/*      */   {
/* 1194 */     this.fieldTINOB1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getTINOB1()
/*      */   {
/* 1202 */     return this.fieldTINOB1.getString();
/*      */   }
/*      */ 
/*      */   public void setTINOB2(String newvalue)
/*      */   {
/* 1210 */     this.fieldTINOB2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getTINOB2()
/*      */   {
/* 1218 */     return this.fieldTINOB2.getString();
/*      */   }
/*      */ 
/*      */   public void setTINOB3(String newvalue)
/*      */   {
/* 1226 */     this.fieldTINOB3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getTINOB3()
/*      */   {
/* 1234 */     return this.fieldTINOB3.getString();
/*      */   }
/*      */ 
/*      */   public void setTINOB4(String newvalue)
/*      */   {
/* 1242 */     this.fieldTINOB4.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getTINOB4()
/*      */   {
/* 1250 */     return this.fieldTINOB4.getString();
/*      */   }
/*      */ 
/*      */   public void setTINOB5(String newvalue)
/*      */   {
/* 1258 */     this.fieldTINOB5.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getTINOB5()
/*      */   {
/* 1266 */     return this.fieldTINOB5.getString();
/*      */   }
/*      */ 
/*      */   public void setTINBC1(String newvalue)
/*      */   {
/* 1274 */     this.fieldTINBC1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getTINBC1()
/*      */   {
/* 1282 */     return this.fieldTINBC1.getString();
/*      */   }
/*      */ 
/*      */   public void setTINBC2(String newvalue)
/*      */   {
/* 1290 */     this.fieldTINBC2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getTINBC2()
/*      */   {
/* 1298 */     return this.fieldTINBC2.getString();
/*      */   }
/*      */ 
/*      */   public void setTINBC3(String newvalue)
/*      */   {
/* 1306 */     this.fieldTINBC3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getTINBC3()
/*      */   {
/* 1314 */     return this.fieldTINBC3.getString();
/*      */   }
/*      */ 
/*      */   public void setTINBC4(String newvalue)
/*      */   {
/* 1322 */     this.fieldTINBC4.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getTINBC4()
/*      */   {
/* 1330 */     return this.fieldTINBC4.getString();
/*      */   }
/*      */ 
/*      */   public void setTINBC5(String newvalue)
/*      */   {
/* 1338 */     this.fieldTINBC5.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getTINBC5()
/*      */   {
/* 1346 */     return this.fieldTINBC5.getString();
/*      */   }
/*      */ 
/*      */   public void setTINBB1(String newvalue)
/*      */   {
/* 1354 */     this.fieldTINBB1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getTINBB1()
/*      */   {
/* 1362 */     return this.fieldTINBB1.getString();
/*      */   }
/*      */ 
/*      */   public void setTINBB2(String newvalue)
/*      */   {
/* 1370 */     this.fieldTINBB2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getTINBB2()
/*      */   {
/* 1378 */     return this.fieldTINBB2.getString();
/*      */   }
/*      */ 
/*      */   public void setTINBB3(String newvalue)
/*      */   {
/* 1386 */     this.fieldTINBB3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getTINBB3()
/*      */   {
/* 1394 */     return this.fieldTINBB3.getString();
/*      */   }
/*      */ 
/*      */   public void setTINBB4(String newvalue)
/*      */   {
/* 1402 */     this.fieldTINBB4.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getTINBB4()
/*      */   {
/* 1410 */     return this.fieldTINBB4.getString();
/*      */   }
/*      */ 
/*      */   public void setTINBB5(String newvalue)
/*      */   {
/* 1418 */     this.fieldTINBB5.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getTINBB5()
/*      */   {
/* 1426 */     return this.fieldTINBB5.getString();
/*      */   }
/*      */ 
/*      */   public void setTINBRF(String newvalue)
/*      */   {
/* 1434 */     this.fieldTINBRF.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getTINBRF()
/*      */   {
/* 1442 */     return this.fieldTINBRF.getString();
/*      */   }
/*      */ 
/*      */   public void setTINIB1(String newvalue)
/*      */   {
/* 1450 */     this.fieldTINIB1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getTINIB1()
/*      */   {
/* 1458 */     return this.fieldTINIB1.getString();
/*      */   }
/*      */ 
/*      */   public void setTINIB2(String newvalue)
/*      */   {
/* 1466 */     this.fieldTINIB2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getTINIB2()
/*      */   {
/* 1474 */     return this.fieldTINIB2.getString();
/*      */   }
/*      */ 
/*      */   public void setTINIB3(String newvalue)
/*      */   {
/* 1482 */     this.fieldTINIB3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getTINIB3()
/*      */   {
/* 1490 */     return this.fieldTINIB3.getString();
/*      */   }
/*      */ 
/*      */   public void setTINIB4(String newvalue)
/*      */   {
/* 1498 */     this.fieldTINIB4.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getTINIB4()
/*      */   {
/* 1506 */     return this.fieldTINIB4.getString();
/*      */   }
/*      */ 
/*      */   public void setTINIB5(String newvalue)
/*      */   {
/* 1514 */     this.fieldTINIB5.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getTINIB5()
/*      */   {
/* 1522 */     return this.fieldTINIB5.getString();
/*      */   }
/*      */ 
/*      */   public void setTINOBI1(String newvalue)
/*      */   {
/* 1530 */     this.fieldTINOBI1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getTINOBI1()
/*      */   {
/* 1538 */     return this.fieldTINOBI1.getString();
/*      */   }
/*      */ 
/*      */   public void setTINOBI2(String newvalue)
/*      */   {
/* 1546 */     this.fieldTINOBI2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getTINOBI2()
/*      */   {
/* 1554 */     return this.fieldTINOBI2.getString();
/*      */   }
/*      */ 
/*      */   public void setTINOBI3(String newvalue)
/*      */   {
/* 1562 */     this.fieldTINOBI3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getTINOBI3()
/*      */   {
/* 1570 */     return this.fieldTINOBI3.getString();
/*      */   }
/*      */ 
/*      */   public void setTINOBI4(String newvalue)
/*      */   {
/* 1578 */     this.fieldTINOBI4.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getTINOBI4()
/*      */   {
/* 1586 */     return this.fieldTINOBI4.getString();
/*      */   }
/*      */ 
/*      */   public void setTINBBI1(String newvalue)
/*      */   {
/* 1594 */     this.fieldTINBBI1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getTINBBI1()
/*      */   {
/* 1602 */     return this.fieldTINBBI1.getString();
/*      */   }
/*      */ 
/*      */   public void setTINBBI2(String newvalue)
/*      */   {
/* 1610 */     this.fieldTINBBI2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getTINBBI2()
/*      */   {
/* 1618 */     return this.fieldTINBBI2.getString();
/*      */   }
/*      */ 
/*      */   public void setTINBBI3(String newvalue)
/*      */   {
/* 1626 */     this.fieldTINBBI3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getTINBBI3()
/*      */   {
/* 1634 */     return this.fieldTINBBI3.getString();
/*      */   }
/*      */ 
/*      */   public void setTINBBI4(String newvalue)
/*      */   {
/* 1642 */     this.fieldTINBBI4.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getTINBBI4()
/*      */   {
/* 1650 */     return this.fieldTINBBI4.getString();
/*      */   }
/*      */ 
/*      */   public void setTINCOI4(String newvalue)
/*      */   {
/* 1658 */     this.fieldTINCOI4.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getTINCOI4()
/*      */   {
/* 1666 */     return this.fieldTINCOI4.getString();
/*      */   }
/*      */ 
/*      */   public void setTINCHB(String newvalue)
/*      */   {
/* 1674 */     this.fieldTINCHB.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getTINCHB()
/*      */   {
/* 1682 */     return this.fieldTINCHB.getString();
/*      */   }
/*      */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.TINQDSJVMessage
 * JD-Core Version:    0.6.0
 */