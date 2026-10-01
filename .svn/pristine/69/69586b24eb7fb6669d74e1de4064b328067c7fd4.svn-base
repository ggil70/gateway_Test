/*      */ package com.activo.gateway.dibs.messages;
/*      */ 
/*      */ import java.math.BigDecimal;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*      */ 
/*      */ public class ECN0030DSMessage extends MessageRecord
/*      */ {
/*   19 */   final int FIELDCOUNT = 145;
/*   20 */   private CharacterField fieldH02USERID = null;
/*   21 */   private CharacterField fieldH02PROGRM = null;
/*   22 */   private CharacterField fieldH02TIMSYS = null;
/*   23 */   private CharacterField fieldH02SCRCOD = null;
/*   24 */   private CharacterField fieldH02OPECOD = null;
/*   25 */   private CharacterField fieldH02FLGMAS = null;
/*   26 */   private CharacterField fieldH02FLGWK1 = null;
/*   27 */   private CharacterField fieldH02FLGWK2 = null;
/*   28 */   private CharacterField fieldH02FLGWK3 = null;
/*   29 */   private CharacterField fieldE02CDRRTB = null;
/*   30 */   private CharacterField fieldE02CDRCCY = null;
/*   31 */   private DecimalField fieldE02CDRDT1 = null;
/*   32 */   private DecimalField fieldE02CDRDT2 = null;
/*   33 */   private DecimalField fieldE02CDRDT3 = null;
/*   34 */   private DecimalField fieldE02CDRMXR = null;
/*   35 */   private DecimalField fieldE02CDRMIR = null;
/*   36 */   private DecimalField fieldE02CDRDPE = null;
/*   37 */   private DecimalField fieldE02CDRPRT = null;
/*   38 */   private DecimalField fieldE02CDD01 = null;
/*   39 */   private DecimalField fieldE02CDD02 = null;
/*   40 */   private DecimalField fieldE02CDD03 = null;
/*   41 */   private DecimalField fieldE02CDD04 = null;
/*   42 */   private DecimalField fieldE02CDD05 = null;
/*   43 */   private DecimalField fieldE02CDD06 = null;
/*   44 */   private DecimalField fieldE02CDD07 = null;
/*   45 */   private DecimalField fieldE02CDD08 = null;
/*   46 */   private DecimalField fieldE02CDD09 = null;
/*   47 */   private DecimalField fieldE02CDD10 = null;
/*   48 */   private DecimalField fieldE02CDD11 = null;
/*   49 */   private DecimalField fieldE02CDD12 = null;
/*   50 */   private DecimalField fieldE02CDD13 = null;
/*   51 */   private DecimalField fieldE02CDD14 = null;
/*   52 */   private DecimalField fieldE02CDD15 = null;
/*   53 */   private DecimalField fieldE02CDUA1 = null;
/*   54 */   private DecimalField fieldE02CDUA2 = null;
/*   55 */   private DecimalField fieldE02CDUA3 = null;
/*   56 */   private DecimalField fieldE02CDUA4 = null;
/*   57 */   private DecimalField fieldE02CDUA5 = null;
/*   58 */   private DecimalField fieldE02CDUA6 = null;
/*   59 */   private DecimalField fieldE02CDUA7 = null;
/*   60 */   private DecimalField fieldE02CL101 = null;
/*   61 */   private DecimalField fieldE02CL102 = null;
/*   62 */   private DecimalField fieldE02CL103 = null;
/*   63 */   private DecimalField fieldE02CL104 = null;
/*   64 */   private DecimalField fieldE02CL105 = null;
/*   65 */   private DecimalField fieldE02CL106 = null;
/*   66 */   private DecimalField fieldE02CL107 = null;
/*   67 */   private DecimalField fieldE02CL108 = null;
/*   68 */   private DecimalField fieldE02CL109 = null;
/*   69 */   private DecimalField fieldE02CL110 = null;
/*   70 */   private DecimalField fieldE02CL111 = null;
/*   71 */   private DecimalField fieldE02CL112 = null;
/*   72 */   private DecimalField fieldE02CL113 = null;
/*   73 */   private DecimalField fieldE02CL114 = null;
/*   74 */   private DecimalField fieldE02CL115 = null;
/*   75 */   private DecimalField fieldE02CL201 = null;
/*   76 */   private DecimalField fieldE02CL202 = null;
/*   77 */   private DecimalField fieldE02CL203 = null;
/*   78 */   private DecimalField fieldE02CL204 = null;
/*   79 */   private DecimalField fieldE02CL205 = null;
/*   80 */   private DecimalField fieldE02CL206 = null;
/*   81 */   private DecimalField fieldE02CL207 = null;
/*   82 */   private DecimalField fieldE02CL208 = null;
/*   83 */   private DecimalField fieldE02CL209 = null;
/*   84 */   private DecimalField fieldE02CL210 = null;
/*   85 */   private DecimalField fieldE02CL211 = null;
/*   86 */   private DecimalField fieldE02CL212 = null;
/*   87 */   private DecimalField fieldE02CL213 = null;
/*   88 */   private DecimalField fieldE02CL214 = null;
/*   89 */   private DecimalField fieldE02CL215 = null;
/*   90 */   private DecimalField fieldE02CL301 = null;
/*   91 */   private DecimalField fieldE02CL302 = null;
/*   92 */   private DecimalField fieldE02CL303 = null;
/*   93 */   private DecimalField fieldE02CL304 = null;
/*   94 */   private DecimalField fieldE02CL305 = null;
/*   95 */   private DecimalField fieldE02CL306 = null;
/*   96 */   private DecimalField fieldE02CL307 = null;
/*   97 */   private DecimalField fieldE02CL308 = null;
/*   98 */   private DecimalField fieldE02CL309 = null;
/*   99 */   private DecimalField fieldE02CL310 = null;
/*  100 */   private DecimalField fieldE02CL311 = null;
/*  101 */   private DecimalField fieldE02CL312 = null;
/*  102 */   private DecimalField fieldE02CL313 = null;
/*  103 */   private DecimalField fieldE02CL314 = null;
/*  104 */   private DecimalField fieldE02CL315 = null;
/*  105 */   private DecimalField fieldE02CL401 = null;
/*  106 */   private DecimalField fieldE02CL402 = null;
/*  107 */   private DecimalField fieldE02CL403 = null;
/*  108 */   private DecimalField fieldE02CL404 = null;
/*  109 */   private DecimalField fieldE02CL405 = null;
/*  110 */   private DecimalField fieldE02CL406 = null;
/*  111 */   private DecimalField fieldE02CL407 = null;
/*  112 */   private DecimalField fieldE02CL408 = null;
/*  113 */   private DecimalField fieldE02CL409 = null;
/*  114 */   private DecimalField fieldE02CL410 = null;
/*  115 */   private DecimalField fieldE02CL411 = null;
/*  116 */   private DecimalField fieldE02CL412 = null;
/*  117 */   private DecimalField fieldE02CL413 = null;
/*  118 */   private DecimalField fieldE02CL414 = null;
/*  119 */   private DecimalField fieldE02CL415 = null;
/*  120 */   private DecimalField fieldE02CL501 = null;
/*  121 */   private DecimalField fieldE02CL502 = null;
/*  122 */   private DecimalField fieldE02CL503 = null;
/*  123 */   private DecimalField fieldE02CL504 = null;
/*  124 */   private DecimalField fieldE02CL505 = null;
/*  125 */   private DecimalField fieldE02CL506 = null;
/*  126 */   private DecimalField fieldE02CL507 = null;
/*  127 */   private DecimalField fieldE02CL508 = null;
/*  128 */   private DecimalField fieldE02CL509 = null;
/*  129 */   private DecimalField fieldE02CL510 = null;
/*  130 */   private DecimalField fieldE02CL511 = null;
/*   */   private DecimalField fieldE02CL512 = null;
/*  132 */   private DecimalField fieldE02CL513 = null;
/*  133 */   private DecimalField fieldE02CL514 = null;
/*  134 */   private DecimalField fieldE02CL515 = null;
/*  135 */   private DecimalField fieldE02CL601 = null;
/*  136 */   private DecimalField fieldE02CL602 = null;
/*  137 */   private DecimalField fieldE02CL603 = null;
/*  138 */   private DecimalField fieldE02CL604 = null;
/*  139 */   private DecimalField fieldE02CL605 = null;
/*  140 */   private DecimalField fieldE02CL606 = null;
/*  141 */   private DecimalField fieldE02CL607 = null;
/*  142 */   private DecimalField fieldE02CL608 = null;
/*  143 */   private DecimalField fieldE02CL609 = null;
/*  144 */   private DecimalField fieldE02CL610 = null;
/*  145 */   private DecimalField fieldE02CL611 = null;
/*  146 */   private DecimalField fieldE02CL612 = null;
/*  147 */   private DecimalField fieldE02CL613 = null;
/*  148 */   private DecimalField fieldE02CL614 = null;
/*  149 */   private DecimalField fieldE02CL615 = null;
/*  150 */   private DecimalField fieldE02CL701 = null;
/*  151 */   private DecimalField fieldE02CL702 = null;
/*  152 */   private DecimalField fieldE02CL703 = null;
/*  153 */   private DecimalField fieldE02CL704 = null;
/*  154 */   private DecimalField fieldE02CL705 = null;
/*  155 */   private DecimalField fieldE02CL706 = null;
/*  156 */   private DecimalField fieldE02CL707 = null;
/*  157 */   private DecimalField fieldE02CL708 = null;
/*  158 */   private DecimalField fieldE02CL709 = null;
/*  159 */   private DecimalField fieldE02CL710 = null;
/*  160 */   private DecimalField fieldE02CL711 = null;
/*  161 */   private DecimalField fieldE02CL712 = null;
/*  162 */   private DecimalField fieldE02CL713 = null;
/*  163 */   private DecimalField fieldE02CL714 = null;
/*  164 */   private DecimalField fieldE02CL715 = null;
/*      */ 
/*      */   public ECN0030DSMessage()
/*      */   {
/*  171 */     createFields();
/*  172 */     initialize();
/*      */   }
/*      */ 
/*      */   protected void createFields()
/*      */   {
/*  180 */     this.recordsize = 1372;
/*  181 */     this.fileid = "1000721110445";
/*  182 */     this.recordid = "43903389A1919";
/*  183 */     this.message = new byte[getByteLength()];
/*  184 */     this.formatname = "ECN0030DS";
/*  185 */     this.fieldnames = new String[145];
/*  186 */     this.tagnames = new String[145];
/*  187 */     this.fields = new MessageField[145];
/*      */ 
/*  189 */     this.fieldnames[0] = "H02USERID";
/*  190 */     this.tagnames[0] = "H02USERID";
/*      */      this.fields[0]=this.fieldH02USERID=new CharacterField(this.message, 10, 10, "H02USERID");
/*      */ 
/*  193 */     this.fieldnames[1] = "H02PROGRM";
/*  194 */     this.tagnames[1] = "H02PROGRM";
/*      */      this.fields[1]=this.fieldH02PROGRM=new CharacterField(this.message, 20, 10, "H02PROGRM");
/*      */ 
/*  197 */     this.fieldnames[2] = "H02TIMSYS";
/*  198 */     this.tagnames[2] = "H02TIMSYS";
/*      */      this.fields[2]=this.fieldH02TIMSYS=new CharacterField(this.message, 30, 12, "H02TIMSYS");
/*      */ 
/*  201 */     this.fieldnames[3] = "H02SCRCOD";
/*  202 */     this.tagnames[3] = "H02SCRCOD";
/*      */      this.fields[3]=this.fieldH02SCRCOD=new CharacterField(this.message, 42, 2, "H02SCRCOD");
/*      */ 
/*  205 */     this.fieldnames[4] = "H02OPECOD";
/*  206 */     this.tagnames[4] = "H02OPECOD";
/*      */      this.fields[4]=this.fieldH02OPECOD=new CharacterField(this.message, 44, 4, "H02OPECOD");
/*      */ 
/*  209 */     this.fieldnames[5] = "H02FLGMAS";
/*  210 */     this.tagnames[5] = "H02FLGMAS";
/*      */      this.fields[5]=this.fieldH02FLGMAS=new CharacterField(this.message, 48, 1, "H02FLGMAS");
/*      */ 
/*  213 */     this.fieldnames[6] = "H02FLGWK1";
/*  214 */     this.tagnames[6] = "H02FLGWK1";
/*      */      this.fields[6]=this.fieldH02FLGWK1=new CharacterField(this.message, 49, 1, "H02FLGWK1");
/*      */ 
/*  217 */     this.fieldnames[7] = "H02FLGWK2";
/*  218 */     this.tagnames[7] = "H02FLGWK2";
/*      */      this.fields[7]=this.fieldH02FLGWK2=new CharacterField(this.message, 50, 1, "H02FLGWK2");
/*      */ 
/*  221 */     this.fieldnames[8] = "H02FLGWK3";
/*  222 */     this.tagnames[8] = "H02FLGWK3";
/*      */      this.fields[8]=this.fieldH02FLGWK3=new CharacterField(this.message, 51, 1, "H02FLGWK3");
/*      */ 
/*  225 */     this.fieldnames[9] = "E02CDRRTB";
/*  226 */     this.tagnames[9] = "E02CDRRTB";
/*      */      this.fields[9]=this.fieldE02CDRRTB=new CharacterField(this.message, 52, 1, "E02CDRRTB");
/*      */ 
/*  229 */     this.fieldnames[10] = "E02CDRCCY";
/*  230 */     this.tagnames[10] = "E02CDRCCY";
/*      */      this.fields[10]=this.fieldE02CDRCCY=new CharacterField(this.message, 53, 3, "E02CDRCCY");
/*      */ 
/*  233 */     this.fieldnames[11] = "E02CDRDT1";
/*  234 */     this.tagnames[11] = "E02CDRDT1";
/*      */      this.fields[11]=this.fieldE02CDRDT1=new DecimalField(this.message, 56, 3, 0, "E02CDRDT1");
/*      */ 
/*  237 */     this.fieldnames[12] = "E02CDRDT2";
/*  238 */     this.tagnames[12] = "E02CDRDT2";
/*      */      this.fields[12]=this.fieldE02CDRDT2=new DecimalField(this.message, 59, 3, 0, "E02CDRDT2");
/*      */ 
/*  241 */     this.fieldnames[13] = "E02CDRDT3";
/*  242 */     this.tagnames[13] = "E02CDRDT3";
/*      */      this.fields[13]=this.fieldE02CDRDT3=new DecimalField(this.message, 62, 3, 0, "E02CDRDT3");
/*      */ 
/*  245 */     this.fieldnames[14] = "E02CDRMXR";
/*  246 */     this.tagnames[14] = "E02CDRMXR";
/*      */      this.fields[14]=this.fieldE02CDRMXR=new DecimalField(this.message, 65, 11, 6, "E02CDRMXR");
/*      */ 
/*  249 */     this.fieldnames[15] = "E02CDRMIR";
/*  250 */     this.tagnames[15] = "E02CDRMIR";
/*      */      this.fields[15]=this.fieldE02CDRMIR=new DecimalField(this.message, 76, 11, 6, "E02CDRMIR");
/*      */ 
/*  253 */     this.fieldnames[16] = "E02CDRDPE";
/*  254 */     this.tagnames[16] = "E02CDRDPE";
/*      */      this.fields[16]=this.fieldE02CDRDPE=new DecimalField(this.message, 87, 4, 0, "E02CDRDPE");
/*      */ 
/*  257 */     this.fieldnames[17] = "E02CDRPRT";
/*  258 */     this.tagnames[17] = "E02CDRPRT";
/*      */      this.fields[17]=this.fieldE02CDRPRT=new DecimalField(this.message, 91, 6, 2, "E02CDRPRT");
/*      */ 
/*  261 */     this.fieldnames[18] = "E02CDD01";
/*  262 */     this.tagnames[18] = "E02CDD01";
/*      */      this.fields[18]=this.fieldE02CDD01=new DecimalField(this.message, 97, 4, 0, "E02CDD01");
/*      */ 
/*  265 */     this.fieldnames[19] = "E02CDD02";
/*  266 */     this.tagnames[19] = "E02CDD02";
/*      */      this.fields[19]=this.fieldE02CDD02=new DecimalField(this.message, 101, 4, 0, "E02CDD02");
/*      */ 
/*  269 */     this.fieldnames[20] = "E02CDD03";
/*  270 */     this.tagnames[20] = "E02CDD03";
/*      */      this.fields[20]=this.fieldE02CDD03=new DecimalField(this.message, 105, 4, 0, "E02CDD03");
/*      */ 
/*  273 */     this.fieldnames[21] = "E02CDD04";
/*  274 */     this.tagnames[21] = "E02CDD04";
/*      */      this.fields[21]=this.fieldE02CDD04=new DecimalField(this.message, 109, 4, 0, "E02CDD04");
/*      */ 
/*  277 */     this.fieldnames[22] = "E02CDD05";
/*  278 */     this.tagnames[22] = "E02CDD05";
/*      */      this.fields[22]=this.fieldE02CDD05=new DecimalField(this.message, 113, 4, 0, "E02CDD05");
/*      */ 
/*  281 */     this.fieldnames[23] = "E02CDD06";
/*  282 */     this.tagnames[23] = "E02CDD06";
/*      */      this.fields[23]=this.fieldE02CDD06=new DecimalField(this.message, 117, 4, 0, "E02CDD06");
/*      */ 
/*  285 */     this.fieldnames[24] = "E02CDD07";
/*  286 */     this.tagnames[24] = "E02CDD07";
/*      */      this.fields[24]=this.fieldE02CDD07=new DecimalField(this.message, 121, 4, 0, "E02CDD07");
/*      */ 
/*  289 */     this.fieldnames[25] = "E02CDD08";
/*  290 */     this.tagnames[25] = "E02CDD08";
/*      */      this.fields[25]=this.fieldE02CDD08=new DecimalField(this.message, 125, 4, 0, "E02CDD08");
/*      */ 
/*  293 */     this.fieldnames[26] = "E02CDD09";
/*  294 */     this.tagnames[26] = "E02CDD09";
/*      */      this.fields[26]=this.fieldE02CDD09=new DecimalField(this.message, 129, 4, 0, "E02CDD09");
/*      */ 
/*  297 */     this.fieldnames[27] = "E02CDD10";
/*  298 */     this.tagnames[27] = "E02CDD10";
/*      */      this.fields[27]=this.fieldE02CDD10=new DecimalField(this.message, 133, 4, 0, "E02CDD10");
/*      */ 
/*  301 */     this.fieldnames[28] = "E02CDD11";
/*  302 */     this.tagnames[28] = "E02CDD11";
/*      */      this.fields[28]=this.fieldE02CDD11=new DecimalField(this.message, 137, 4, 0, "E02CDD11");
/*      */ 
/*  305 */     this.fieldnames[29] = "E02CDD12";
/*  306 */     this.tagnames[29] = "E02CDD12";
/*      */      this.fields[29]=this.fieldE02CDD12=new DecimalField(this.message, 141, 4, 0, "E02CDD12");
/*      */ 
/*  309 */     this.fieldnames[30] = "E02CDD13";
/*  310 */     this.tagnames[30] = "E02CDD13";
/*      */      this.fields[30]=this.fieldE02CDD13=new DecimalField(this.message, 145, 4, 0, "E02CDD13");
/*      */ 
/*  313 */     this.fieldnames[31] = "E02CDD14";
/*  314 */     this.tagnames[31] = "E02CDD14";
/*      */      this.fields[31]=this.fieldE02CDD14=new DecimalField(this.message, 149, 4, 0, "E02CDD14");
/*      */ 
/*  317 */     this.fieldnames[32] = "E02CDD15";
/*  318 */     this.tagnames[32] = "E02CDD15";
/*      */      this.fields[32]=this.fieldE02CDD15=new DecimalField(this.message, 153, 4, 0, "E02CDD15");
/*      */ 
/*  321 */     this.fieldnames[33] = "E02CDUA1";
/*  322 */     this.tagnames[33] = "E02CDUA1";
/*      */      this.fields[33]=this.fieldE02CDUA1=new DecimalField(this.message, 157, 10, 0, "E02CDUA1");
/*      */ 
/*  325 */     this.fieldnames[34] = "E02CDUA2";
/*  326 */     this.tagnames[34] = "E02CDUA2";
/*      */      this.fields[34]=this.fieldE02CDUA2=new DecimalField(this.message, 167, 10, 0, "E02CDUA2");
/*      */ 
/*  329 */     this.fieldnames[35] = "E02CDUA3";
/*  330 */     this.tagnames[35] = "E02CDUA3";
/*      */      this.fields[35]=this.fieldE02CDUA3=new DecimalField(this.message, 177, 10, 0, "E02CDUA3");
/*      */ 
/*  333 */     this.fieldnames[36] = "E02CDUA4";
/*  334 */     this.tagnames[36] = "E02CDUA4";
/*      */      this.fields[36]=this.fieldE02CDUA4=new DecimalField(this.message, 187, 10, 0, "E02CDUA4");
/*      */ 
/*  337 */     this.fieldnames[37] = "E02CDUA5";
/*  338 */     this.tagnames[37] = "E02CDUA5";
/*      */      this.fields[37]=this.fieldE02CDUA5=new DecimalField(this.message, 197, 10, 0, "E02CDUA5");
/*      */ 
/*  341 */     this.fieldnames[38] = "E02CDUA6";
/*  342 */     this.tagnames[38] = "E02CDUA6";
/*      */      this.fields[38]=this.fieldE02CDUA6=new DecimalField(this.message, 207, 10, 0, "E02CDUA6");
/*      */ 
/*  345 */     this.fieldnames[39] = "E02CDUA7";
/*  346 */     this.tagnames[39] = "E02CDUA7";
/*      */      this.fields[39]=this.fieldE02CDUA7=new DecimalField(this.message, 217, 10, 0, "E02CDUA7");
/*      */ 
/*  349 */     this.fieldnames[40] = "E02CL101";
/*  350 */     this.tagnames[40] = "E02CL101";
/*      */      this.fields[40]=this.fieldE02CL101=new DecimalField(this.message, 227, 11, 6, "E02CL101");
/*      */ 
/*  353 */     this.fieldnames[41] = "E02CL102";
/*  354 */     this.tagnames[41] = "E02CL102";
/*      */      this.fields[41]=this.fieldE02CL102=new DecimalField(this.message, 238, 11, 6, "E02CL102");
/*      */ 
/*  357 */     this.fieldnames[42] = "E02CL103";
/*  358 */     this.tagnames[42] = "E02CL103";
/*      */      this.fields[42]=this.fieldE02CL103=new DecimalField(this.message, 249, 11, 6, "E02CL103");
/*      */ 
/*  361 */     this.fieldnames[43] = "E02CL104";
/*  362 */     this.tagnames[43] = "E02CL104";
/*      */      this.fields[43]=this.fieldE02CL104=new DecimalField(this.message, 260, 11, 6, "E02CL104");
/*      */ 
/*  365 */     this.fieldnames[44] = "E02CL105";
/*  366 */     this.tagnames[44] = "E02CL105";
/*      */      this.fields[44]=this.fieldE02CL105=new DecimalField(this.message, 271, 11, 6, "E02CL105");
/*      */ 
/*  369 */     this.fieldnames[45] = "E02CL106";
/*  370 */     this.tagnames[45] = "E02CL106";
/*      */      this.fields[45]=this.fieldE02CL106=new DecimalField(this.message, 282, 11, 6, "E02CL106");
/*      */ 
/*  373 */     this.fieldnames[46] = "E02CL107";
/*  374 */     this.tagnames[46] = "E02CL107";
/*      */      this.fields[46]=this.fieldE02CL107=new DecimalField(this.message, 293, 11, 6, "E02CL107");
/*      */ 
/*  377 */     this.fieldnames[47] = "E02CL108";
/*  378 */     this.tagnames[47] = "E02CL108";
/*      */      this.fields[47]=this.fieldE02CL108=new DecimalField(this.message, 304, 11, 6, "E02CL108");
/*      */ 
/*  381 */     this.fieldnames[48] = "E02CL109";
/*  382 */     this.tagnames[48] = "E02CL109";
/*      */      this.fields[48]=this.fieldE02CL109=new DecimalField(this.message, 315, 11, 6, "E02CL109");
/*      */ 
/*  385 */     this.fieldnames[49] = "E02CL110";
/*  386 */     this.tagnames[49] = "E02CL110";
/*      */      this.fields[49]=this.fieldE02CL110=new DecimalField(this.message, 326, 11, 6, "E02CL110");
/*      */ 
/*  389 */     this.fieldnames[50] = "E02CL111";
/*  390 */     this.tagnames[50] = "E02CL111";
/*      */      this.fields[50]=this.fieldE02CL111=new DecimalField(this.message, 337, 11, 6, "E02CL111");
/*      */ 
/*  393 */     this.fieldnames[51] = "E02CL112";
/*  394 */     this.tagnames[51] = "E02CL112";
/*      */      this.fields[51]=this.fieldE02CL112=new DecimalField(this.message, 348, 11, 6, "E02CL112");
/*      */ 
/*  397 */     this.fieldnames[52] = "E02CL113";
/*  398 */     this.tagnames[52] = "E02CL113";
/*      */      this.fields[52]=this.fieldE02CL113=new DecimalField(this.message, 359, 11, 6, "E02CL113");
/*      */ 
/*  401 */     this.fieldnames[53] = "E02CL114";
/*  402 */     this.tagnames[53] = "E02CL114";
/*      */      this.fields[53]=this.fieldE02CL114=new DecimalField(this.message, 370, 11, 6, "E02CL114");
/*      */ 
/*  405 */     this.fieldnames[54] = "E02CL115";
/*  406 */     this.tagnames[54] = "E02CL115";
/*      */      this.fields[54]=this.fieldE02CL115=new DecimalField(this.message, 381, 11, 6, "E02CL115");
/*      */ 
/*  409 */     this.fieldnames[55] = "E02CL201";
/*  410 */     this.tagnames[55] = "E02CL201";
/*      */      this.fields[55]=this.fieldE02CL201=new DecimalField(this.message, 392, 11, 6, "E02CL201");
/*      */ 
/*  413 */     this.fieldnames[56] = "E02CL202";
/*  414 */     this.tagnames[56] = "E02CL202";
/*      */      this.fields[56]=this.fieldE02CL202=new DecimalField(this.message, 403, 11, 6, "E02CL202");
/*      */ 
/*  417 */     this.fieldnames[57] = "E02CL203";
/*  418 */     this.tagnames[57] = "E02CL203";
/*      */      this.fields[57]=this.fieldE02CL203=new DecimalField(this.message, 414, 11, 6, "E02CL203");
/*      */ 
/*  421 */     this.fieldnames[58] = "E02CL204";
/*  422 */     this.tagnames[58] = "E02CL204";
/*      */      this.fields[58]=this.fieldE02CL204=new DecimalField(this.message, 425, 11, 6, "E02CL204");
/*      */ 
/*  425 */     this.fieldnames[59] = "E02CL205";
/*  426 */     this.tagnames[59] = "E02CL205";
/*      */      this.fields[59]=this.fieldE02CL205=new DecimalField(this.message, 436, 11, 6, "E02CL205");
/*      */ 
/*  429 */     this.fieldnames[60] = "E02CL206";
/*  430 */     this.tagnames[60] = "E02CL206";
/*      */      this.fields[60]=this.fieldE02CL206=new DecimalField(this.message, 447, 11, 6, "E02CL206");
/*      */ 
/*  433 */     this.fieldnames[61] = "E02CL207";
/*  434 */     this.tagnames[61] = "E02CL207";
/*      */      this.fields[61]=this.fieldE02CL207=new DecimalField(this.message, 458, 11, 6, "E02CL207");
/*      */ 
/*  437 */     this.fieldnames[62] = "E02CL208";
/*  438 */     this.tagnames[62] = "E02CL208";
/*      */      this.fields[62]=this.fieldE02CL208=new DecimalField(this.message, 469, 11, 6, "E02CL208");
/*      */ 
/*  441 */     this.fieldnames[63] = "E02CL209";
/*  442 */     this.tagnames[63] = "E02CL209";
/*      */      this.fields[63]=this.fieldE02CL209=new DecimalField(this.message, 480, 11, 6, "E02CL209");
/*      */ 
/*  445 */     this.fieldnames[64] = "E02CL210";
/*  446 */     this.tagnames[64] = "E02CL210";
/*      */      this.fields[64]=this.fieldE02CL210=new DecimalField(this.message, 491, 11, 6, "E02CL210");
/*      */ 
/*  449 */     this.fieldnames[65] = "E02CL211";
/*  450 */     this.tagnames[65] = "E02CL211";
/*      */      this.fields[65]=this.fieldE02CL211=new DecimalField(this.message, 502, 11, 6, "E02CL211");
/*      */ 
/*  453 */     this.fieldnames[66] = "E02CL212";
/*  454 */     this.tagnames[66] = "E02CL212";
/*      */      this.fields[66]=this.fieldE02CL212=new DecimalField(this.message, 513, 11, 6, "E02CL212");
/*      */ 
/*  457 */     this.fieldnames[67] = "E02CL213";
/*  458 */     this.tagnames[67] = "E02CL213";
/*      */      this.fields[67]=this.fieldE02CL213=new DecimalField(this.message, 524, 11, 6, "E02CL213");
/*      */ 
/*  461 */     this.fieldnames[68] = "E02CL214";
/*  462 */     this.tagnames[68] = "E02CL214";
/*      */      this.fields[68]=this.fieldE02CL214=new DecimalField(this.message, 535, 11, 6, "E02CL214");
/*      */ 
/*  465 */     this.fieldnames[69] = "E02CL215";
/*  466 */     this.tagnames[69] = "E02CL215";
/*      */      this.fields[69]=this.fieldE02CL215=new DecimalField(this.message, 546, 11, 6, "E02CL215");
/*      */ 
/*  469 */     this.fieldnames[70] = "E02CL301";
/*  470 */     this.tagnames[70] = "E02CL301";
/*      */      this.fields[70]=this.fieldE02CL301=new DecimalField(this.message, 557, 11, 6, "E02CL301");
/*      */ 
/*  473 */     this.fieldnames[71] = "E02CL302";
/*  474 */     this.tagnames[71] = "E02CL302";
/*      */      this.fields[71]=this.fieldE02CL302=new DecimalField(this.message, 568, 11, 6, "E02CL302");
/*      */ 
/*  477 */     this.fieldnames[72] = "E02CL303";
/*  478 */     this.tagnames[72] = "E02CL303";
/*      */      this.fields[72]=this.fieldE02CL303=new DecimalField(this.message, 579, 11, 6, "E02CL303");
/*      */ 
/*  481 */     this.fieldnames[73] = "E02CL304";
/*  482 */     this.tagnames[73] = "E02CL304";
/*      */      this.fields[73]=this.fieldE02CL304=new DecimalField(this.message, 590, 11, 6, "E02CL304");
/*      */ 
/*  485 */     this.fieldnames[74] = "E02CL305";
/*  486 */     this.tagnames[74] = "E02CL305";
/*      */      this.fields[74]=this.fieldE02CL305=new DecimalField(this.message, 601, 11, 6, "E02CL305");
/*      */ 
/*  489 */     this.fieldnames[75] = "E02CL306";
/*  490 */     this.tagnames[75] = "E02CL306";
/*      */      this.fields[75]=this.fieldE02CL306=new DecimalField(this.message, 612, 11, 6, "E02CL306");
/*      */ 
/*  493 */     this.fieldnames[76] = "E02CL307";
/*  494 */     this.tagnames[76] = "E02CL307";
/*      */      this.fields[76]=this.fieldE02CL307=new DecimalField(this.message, 623, 11, 6, "E02CL307");
/*      */ 
/*  497 */     this.fieldnames[77] = "E02CL308";
/*  498 */     this.tagnames[77] = "E02CL308";
/*      */      this.fields[77]=this.fieldE02CL308=new DecimalField(this.message, 634, 11, 6, "E02CL308");
/*      */ 
/*  501 */     this.fieldnames[78] = "E02CL309";
/*  502 */     this.tagnames[78] = "E02CL309";
/*      */      this.fields[78]=this.fieldE02CL309=new DecimalField(this.message, 645, 11, 6, "E02CL309");
/*      */ 
/*  505 */     this.fieldnames[79] = "E02CL310";
/*  506 */     this.tagnames[79] = "E02CL310";
/*      */      this.fields[79]=this.fieldE02CL310=new DecimalField(this.message, 656, 11, 6, "E02CL310");
/*      */ 
/*  509 */     this.fieldnames[80] = "E02CL311";
/*  510 */     this.tagnames[80] = "E02CL311";
/*      */      this.fields[80]=this.fieldE02CL311=new DecimalField(this.message, 667, 11, 6, "E02CL311");
/*      */ 
/*  513 */     this.fieldnames[81] = "E02CL312";
/*  514 */     this.tagnames[81] = "E02CL312";
/*      */      this.fields[81]=this.fieldE02CL312=new DecimalField(this.message, 678, 11, 6, "E02CL312");
/*      */ 
/*  517 */     this.fieldnames[82] = "E02CL313";
/*  518 */     this.tagnames[82] = "E02CL313";
/*      */      this.fields[82]=this.fieldE02CL313=new DecimalField(this.message, 689, 11, 6, "E02CL313");
/*      */ 
/*  521 */     this.fieldnames[83] = "E02CL314";
/*  522 */     this.tagnames[83] = "E02CL314";
/*      */      this.fields[83]=this.fieldE02CL314=new DecimalField(this.message, 700, 11, 6, "E02CL314");
/*      */ 
/*  525 */     this.fieldnames[84] = "E02CL315";
/*  526 */     this.tagnames[84] = "E02CL315";
/*      */      this.fields[84]=this.fieldE02CL315=new DecimalField(this.message, 711, 11, 6, "E02CL315");
/*      */ 
/*  529 */     this.fieldnames[85] = "E02CL401";
/*  530 */     this.tagnames[85] = "E02CL401";
/*      */      this.fields[85]=this.fieldE02CL401=new DecimalField(this.message, 722, 11, 6, "E02CL401");
/*      */ 
/*  533 */     this.fieldnames[86] = "E02CL402";
/*  534 */     this.tagnames[86] = "E02CL402";
/*      */      this.fields[86]=this.fieldE02CL402=new DecimalField(this.message, 733, 11, 6, "E02CL402");
/*      */ 
/*  537 */     this.fieldnames[87] = "E02CL403";
/*  538 */     this.tagnames[87] = "E02CL403";
/*      */      this.fields[87]=this.fieldE02CL403=new DecimalField(this.message, 744, 11, 6, "E02CL403");
/*      */ 
/*  541 */     this.fieldnames[88] = "E02CL404";
/*  542 */     this.tagnames[88] = "E02CL404";
/*      */      this.fields[88]=this.fieldE02CL404=new DecimalField(this.message, 755, 11, 6, "E02CL404");
/*      */ 
/*  545 */     this.fieldnames[89] = "E02CL405";
/*  546 */     this.tagnames[89] = "E02CL405";
/*      */      this.fields[89]=this.fieldE02CL405=new DecimalField(this.message, 766, 11, 6, "E02CL405");
/*      */ 
/*  549 */     this.fieldnames[90] = "E02CL406";
/*  550 */     this.tagnames[90] = "E02CL406";
/*      */      this.fields[90]=this.fieldE02CL406=new DecimalField(this.message, 777, 11, 6, "E02CL406");
/*      */ 
/*  553 */     this.fieldnames[91] = "E02CL407";
/*  554 */     this.tagnames[91] = "E02CL407";
/*      */      this.fields[91]=this.fieldE02CL407=new DecimalField(this.message, 788, 11, 6, "E02CL407");
/*      */ 
/*  557 */     this.fieldnames[92] = "E02CL408";
/*  558 */     this.tagnames[92] = "E02CL408";
/*      */      this.fields[92]=this.fieldE02CL408=new DecimalField(this.message, 799, 11, 6, "E02CL408");
/*      */ 
/*  561 */     this.fieldnames[93] = "E02CL409";
/*  562 */     this.tagnames[93] = "E02CL409";
/*      */      this.fields[93]=this.fieldE02CL409=new DecimalField(this.message, 810, 11, 6, "E02CL409");
/*      */ 
/*  565 */     this.fieldnames[94] = "E02CL410";
/*  566 */     this.tagnames[94] = "E02CL410";
/*      */      this.fields[94]=this.fieldE02CL410=new DecimalField(this.message, 821, 11, 6, "E02CL410");
/*      */ 
/*  569 */     this.fieldnames[95] = "E02CL411";
/*  570 */     this.tagnames[95] = "E02CL411";
/*      */      this.fields[95]=this.fieldE02CL411=new DecimalField(this.message, 832, 11, 6, "E02CL411");
/*      */ 
/*  573 */     this.fieldnames[96] = "E02CL412";
/*  574 */     this.tagnames[96] = "E02CL412";
/*      */      this.fields[96]=this.fieldE02CL412=new DecimalField(this.message, 843, 11, 6, "E02CL412");
/*      */ 
/*  577 */     this.fieldnames[97] = "E02CL413";
/*  578 */     this.tagnames[97] = "E02CL413";
/*      */      this.fields[97]=this.fieldE02CL413=new DecimalField(this.message, 854, 11, 6, "E02CL413");
/*      */ 
/*  581 */     this.fieldnames[98] = "E02CL414";
/*  582 */     this.tagnames[98] = "E02CL414";
/*      */      this.fields[98]=this.fieldE02CL414=new DecimalField(this.message, 865, 11, 6, "E02CL414");
/*      */ 
/*  585 */     this.fieldnames[99] = "E02CL415";
/*  586 */     this.tagnames[99] = "E02CL415";
/*      */      this.fields[99]=this.fieldE02CL415=new DecimalField(this.message, 876, 11, 6, "E02CL415");
/*      */ 
/*  589 */     this.fieldnames[100] = "E02CL501";
/*  590 */     this.tagnames[100] = "E02CL501";
/*      */      this.fields[100]=this.fieldE02CL501=new DecimalField(this.message, 887, 11, 6, "E02CL501");
/*      */ 
/*  593 */     this.fieldnames[101] = "E02CL502";
/*  594 */     this.tagnames[101] = "E02CL502";
/*      */      this.fields[101]=this.fieldE02CL502=new DecimalField(this.message, 898, 11, 6, "E02CL502");
/*      */ 
/*  597 */     this.fieldnames[102] = "E02CL503";
/*  598 */     this.tagnames[102] = "E02CL503";
/*      */      this.fields[102]=this.fieldE02CL503=new DecimalField(this.message, 909, 11, 6, "E02CL503");
/*      */ 
/*  601 */     this.fieldnames[103] = "E02CL504";
/*  602 */     this.tagnames[103] = "E02CL504";
/*      */      this.fields[103]=this.fieldE02CL504=new DecimalField(this.message, 920, 11, 6, "E02CL504");
/*      */ 
/*  605 */     this.fieldnames[104] = "E02CL505";
/*  606 */     this.tagnames[104] = "E02CL505";
/*      */      this.fields[104]=this.fieldE02CL505=new DecimalField(this.message, 931, 11, 6, "E02CL505");
/*      */ 
/*  609 */     this.fieldnames[105] = "E02CL506";
/*  610 */     this.tagnames[105] = "E02CL506";
/*      */      this.fields[105]=this.fieldE02CL506=new DecimalField(this.message, 942, 11, 6, "E02CL506");
/*      */ 
/*  613 */     this.fieldnames[106] = "E02CL507";
/*  614 */     this.tagnames[106] = "E02CL507";
/*      */      this.fields[106]=this.fieldE02CL507=new DecimalField(this.message, 953, 11, 6, "E02CL507");
/*      */ 
/*  617 */     this.fieldnames[107] = "E02CL508";
/*  618 */     this.tagnames[107] = "E02CL508";
/*      */      this.fields[107]=this.fieldE02CL508=new DecimalField(this.message, 964, 11, 6, "E02CL508");
/*      */ 
/*  621 */     this.fieldnames[108] = "E02CL509";
/*  622 */     this.tagnames[108] = "E02CL509";
/*      */      this.fields[108]=this.fieldE02CL509=new DecimalField(this.message, 975, 11, 6, "E02CL509");
/*      */ 
/*  625 */     this.fieldnames[109] = "E02CL510";
/*  626 */     this.tagnames[109] = "E02CL510";
/*      */      this.fields[109]=this.fieldE02CL510=new DecimalField(this.message, 986, 11, 6, "E02CL510");
/*      */ 
/*  629 */     this.fieldnames[110] = "E02CL511";
/*  630 */     this.tagnames[110] = "E02CL511";
/*      */      this.fields[110]=this.fieldE02CL511=new DecimalField(this.message, 997, 11, 6, "E02CL511");
/*      */ 
/*  633 */     this.fieldnames[111] = "E02CL512";
/*  634 */     this.tagnames[111] = "E02CL512";
/*      */      this.fields[111]=this.fieldE02CL512=new DecimalField(this.message, 1008, 11, 6, "E02CL512");
/*      */ 
/*  637 */     this.fieldnames[112] = "E02CL513";
/*  638 */     this.tagnames[112] = "E02CL513";
/*      */      this.fields[112]=this.fieldE02CL513=new DecimalField(this.message, 1019, 11, 6, "E02CL513");
/*      */ 
/*  641 */     this.fieldnames[113] = "E02CL514";
/*  642 */     this.tagnames[113] = "E02CL514";
/*      */      this.fields[113]=this.fieldE02CL514=new DecimalField(this.message, 1030, 11, 6, "E02CL514");
/*      */ 
/*  645 */     this.fieldnames[114] = "E02CL515";
/*  646 */     this.tagnames[114] = "E02CL515";
/*      */      this.fields[114]=this.fieldE02CL515=new DecimalField(this.message, 1041, 11, 6, "E02CL515");
/*      */ 
/*  649 */     this.fieldnames[115] = "E02CL601";
/*  650 */     this.tagnames[115] = "E02CL601";
/*      */      this.fields[115]=this.fieldE02CL601=new DecimalField(this.message, 1052, 11, 6, "E02CL601");
/*      */ 
/*  653 */     this.fieldnames[116] = "E02CL602";
/*  654 */     this.tagnames[116] = "E02CL602";
/*      */      this.fields[116]=this.fieldE02CL602=new DecimalField(this.message, 1063, 11, 6, "E02CL602");
/*      */ 
/*  657 */     this.fieldnames[117] = "E02CL603";
/*  658 */     this.tagnames[117] = "E02CL603";
/*      */      this.fields[117]=this.fieldE02CL603=new DecimalField(this.message, 1074, 11, 6, "E02CL603");
/*      */ 
/*  661 */     this.fieldnames[118] = "E02CL604";
/*  662 */     this.tagnames[118] = "E02CL604";
/*      */      this.fields[118]=this.fieldE02CL604=new DecimalField(this.message, 1085, 11, 6, "E02CL604");
/*      */ 
/*  665 */     this.fieldnames[119] = "E02CL605";
/*  666 */     this.tagnames[119] = "E02CL605";
/*      */      this.fields[119]=this.fieldE02CL605=new DecimalField(this.message, 1096, 11, 6, "E02CL605");
/*      */ 
/*  669 */     this.fieldnames[120] = "E02CL606";
/*  670 */     this.tagnames[120] = "E02CL606";
/*      */      this.fields[120]=this.fieldE02CL606=new DecimalField(this.message, 1107, 11, 6, "E02CL606");
/*      */ 
/*  673 */     this.fieldnames[121] = "E02CL607";
/*  674 */     this.tagnames[121] = "E02CL607";
/*      */      this.fields[121]=this.fieldE02CL607=new DecimalField(this.message, 1118, 11, 6, "E02CL607");
/*      */ 
/*  677 */     this.fieldnames[122] = "E02CL608";
/*  678 */     this.tagnames[122] = "E02CL608";
/*      */      this.fields[122]=this.fieldE02CL608=new DecimalField(this.message, 1129, 11, 6, "E02CL608");
/*      */ 
/*  681 */     this.fieldnames[123] = "E02CL609";
/*  682 */     this.tagnames[123] = "E02CL609";
/*      */      this.fields[123]=this.fieldE02CL609=new DecimalField(this.message, 1140, 11, 6, "E02CL609");
/*      */ 
/*  685 */     this.fieldnames[124] = "E02CL610";
/*  686 */     this.tagnames[124] = "E02CL610";
/*      */      this.fields[124]=this.fieldE02CL610=new DecimalField(this.message, 1151, 11, 6, "E02CL610");
/*      */ 
/*  689 */     this.fieldnames[125] = "E02CL611";
/*  690 */     this.tagnames[125] = "E02CL611";
/*      */      this.fields[125]=this.fieldE02CL611=new DecimalField(this.message, 1162, 11, 6, "E02CL611");
/*      */ 
/*  693 */     this.fieldnames[126] = "E02CL612";
/*  694 */     this.tagnames[126] = "E02CL612";
/*      */      this.fields[126]=this.fieldE02CL612=new DecimalField(this.message, 1173, 11, 6, "E02CL612");
/*      */ 
/*  697 */     this.fieldnames[127] = "E02CL613";
/*  698 */     this.tagnames[127] = "E02CL613";
/*      */      this.fields[127]=this.fieldE02CL613=new DecimalField(this.message, 1184, 11, 6, "E02CL613");
/*      */ 
/*  701 */     this.fieldnames[128] = "E02CL614";
/*  702 */     this.tagnames[128] = "E02CL614";
/*      */      this.fields[128]=this.fieldE02CL614=new DecimalField(this.message, 1195, 11, 6, "E02CL614");
/*      */ 
/*  705 */     this.fieldnames[129] = "E02CL615";
/*  706 */     this.tagnames[129] = "E02CL615";
/*      */      this.fields[129]=this.fieldE02CL615=new DecimalField(this.message, 1206, 11, 6, "E02CL615");
/*      */ 
/*  709 */     this.fieldnames[130] = "E02CL701";
/*  710 */     this.tagnames[130] = "E02CL701";
/*      */      this.fields[130]=this.fieldE02CL701=new DecimalField(this.message, 1217, 11, 6, "E02CL701");
/*      */ 
/*  713 */     this.fieldnames[131] = "E02CL702";
/*  714 */     this.tagnames[131] = "E02CL702";
/*      */      this.fields[131]=this.fieldE02CL702=new DecimalField(this.message, 1228, 11, 6, "E02CL702");
/*      */ 
/*  717 */     this.fieldnames[132] = "E02CL703";
/*  718 */     this.tagnames[132] = "E02CL703";
/*      */      this.fields[132]=this.fieldE02CL703=new DecimalField(this.message, 1239, 11, 6, "E02CL703");
/*      */ 
/*  721 */     this.fieldnames[133] = "E02CL704";
/*  722 */     this.tagnames[133] = "E02CL704";
/*      */      this.fields[133]=this.fieldE02CL704=new DecimalField(this.message, 1250, 11, 6, "E02CL704");
/*      */ 
/*  725 */     this.fieldnames[134] = "E02CL705";
/*  726 */     this.tagnames[134] = "E02CL705";
/*      */      this.fields[134]=this.fieldE02CL705=new DecimalField(this.message, 1261, 11, 6, "E02CL705");
/*      */ 
/*  729 */     this.fieldnames[135] = "E02CL706";
/*  730 */     this.tagnames[135] = "E02CL706";
/*      */      this.fields[135]=this.fieldE02CL706=new DecimalField(this.message, 1272, 11, 6, "E02CL706");
/*      */ 
/*  733 */     this.fieldnames[136] = "E02CL707";
/*  734 */     this.tagnames[136] = "E02CL707";
/*      */      this.fields[136]=this.fieldE02CL707=new DecimalField(this.message, 1283, 11, 6, "E02CL707");
/*      */ 
/*  737 */     this.fieldnames[137] = "E02CL708";
/*  738 */     this.tagnames[137] = "E02CL708";
/*      */      this.fields[137]=this.fieldE02CL708=new DecimalField(this.message, 1294, 11, 6, "E02CL708");
/*      */ 
/*  741 */     this.fieldnames[138] = "E02CL709";
/*  742 */     this.tagnames[138] = "E02CL709";
/*      */      this.fields[138]=this.fieldE02CL709=new DecimalField(this.message, 1305, 11, 6, "E02CL709");
/*      */ 
/*  745 */     this.fieldnames[139] = "E02CL710";
/*  746 */     this.tagnames[139] = "E02CL710";
/*      */      this.fields[139]=this.fieldE02CL710=new DecimalField(this.message, 6, 11, 6, "E02CL710");
/*      */ 
/*  749 */     this.fieldnames[140] = "E02CL711";
/*  750 */     this.tagnames[140] = "E02CL711";
/*      */      this.fields[140]=this.fieldE02CL711=new DecimalField(this.message, 1327, 11, 6, "E02CL711");
/*      */ 
/*  753 */     this.fieldnames[141] = "E02CL712";
/*  754 */     this.tagnames[141] = "E02CL712";
/*      */      this.fields[141]=this.fieldE02CL712=new DecimalField(this.message, 1338, 11, 6, "E02CL712");
/*      */ 
/*  757 */     this.fieldnames[142] = "E02CL713";
/*  758 */     this.tagnames[142] = "E02CL713";
/*      */      this.fields[142]=this.fieldE02CL713=new DecimalField(this.message, 1349, 11, 6, "E02CL713");
/*      */ 
/*  761 */     this.fieldnames[143] = "E02CL714";
/*  762 */     this.tagnames[143] = "E02CL714";
/*      */      this.fields[143]=this.fieldE02CL714=new DecimalField(this.message, 1360, 11, 6, "E02CL714");
/*      */ 
/*  765 */     this.fieldnames[144] = "E02CL715";
/*  766 */     this.tagnames[144] = "E02CL715";
/*      */      this.fields[144]=this.fieldE02CL715=new DecimalField(this.message, 1371, 11, 6, "E02CL715");
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CDD01()
/*      */   {
/*  775 */     return this.fieldE02CDD01.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CDD02()
/*      */   {
/*  782 */     return this.fieldE02CDD02.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CDD03()
/*      */   {
/*  789 */     return this.fieldE02CDD03.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CDD04()
/*      */   {
/*  796 */     return this.fieldE02CDD04.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CDD05()
/*      */   {
/*  803 */     return this.fieldE02CDD05.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CDD06()
/*      */   {
/*  810 */     return this.fieldE02CDD06.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CDD07()
/*      */   {
/*  817 */     return this.fieldE02CDD07.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CDD08()
/*      */   {
/*  824 */     return this.fieldE02CDD08.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CDD09()
/*      */   {
/*  831 */     return this.fieldE02CDD09.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CDD10()
/*      */   {
/*  838 */     return this.fieldE02CDD10.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CDD11()
/*      */   {
/*  845 */     return this.fieldE02CDD11.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CDD12()
/*      */   {
/*  852 */     return this.fieldE02CDD12.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CDD13()
/*      */   {
/*  859 */     return this.fieldE02CDD13.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CDD14()
/*      */   {
/*  866 */     return this.fieldE02CDD14.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CDD15()
/*      */   {
/*  873 */     return this.fieldE02CDD15.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CDRDPE()
/*      */   {
/*  880 */     return this.fieldE02CDRDPE.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CDRDT1()
/*      */   {
/*  887 */     return this.fieldE02CDRDT1.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CDRDT2()
/*      */   {
/*  894 */     return this.fieldE02CDRDT2.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CDRDT3()
/*      */   {
/*  901 */     return this.fieldE02CDRDT3.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CDRMIR()
/*      */   {
/*  908 */     return this.fieldE02CDRMIR.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CDRMXR()
/*      */   {
/*  915 */     return this.fieldE02CDRMXR.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CDRPRT()
/*      */   {
/*  922 */     return this.fieldE02CDRPRT.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CDUA1()
/*      */   {
/*  929 */     return this.fieldE02CDUA1.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CDUA2()
/*      */   {
/*  936 */     return this.fieldE02CDUA2.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CDUA3()
/*      */   {
/*  943 */     return this.fieldE02CDUA3.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CDUA4()
/*      */   {
/*  950 */     return this.fieldE02CDUA4.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CDUA5()
/*      */   {
/*  957 */     return this.fieldE02CDUA5.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CDUA6()
/*      */   {
/*  964 */     return this.fieldE02CDUA6.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CDUA7()
/*      */   {
/*  971 */     return this.fieldE02CDUA7.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL101()
/*      */   {
/*  978 */     return this.fieldE02CL101.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL102()
/*      */   {
/*  985 */     return this.fieldE02CL102.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL103()
/*      */   {
/*  992 */     return this.fieldE02CL103.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL104()
/*      */   {
/*  999 */     return this.fieldE02CL104.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL105()
/*      */   {
/* 1006 */     return this.fieldE02CL105.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL106()
/*      */   {
/* 1013 */     return this.fieldE02CL106.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL107()
/*      */   {
/* 1020 */     return this.fieldE02CL107.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL108()
/*      */   {
/* 1027 */     return this.fieldE02CL108.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL109()
/*      */   {
/* 1034 */     return this.fieldE02CL109.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL110()
/*      */   {
/* 1041 */     return this.fieldE02CL110.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL111()
/*      */   {
/* 1048 */     return this.fieldE02CL111.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL112()
/*      */   {
/* 1055 */     return this.fieldE02CL112.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL113()
/*      */   {
/* 1062 */     return this.fieldE02CL113.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL114()
/*      */   {
/* 1069 */     return this.fieldE02CL114.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL115()
/*      */   {
/* 1076 */     return this.fieldE02CL115.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL201()
/*      */   {
/* 1083 */     return this.fieldE02CL201.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL202()
/*      */   {
/* 1090 */     return this.fieldE02CL202.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL203()
/*      */   {
/* 1097 */     return this.fieldE02CL203.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL204()
/*      */   {
/* 1104 */     return this.fieldE02CL204.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL205()
/*      */   {
/* 1111 */     return this.fieldE02CL205.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL206()
/*      */   {
/* 1118 */     return this.fieldE02CL206.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL207()
/*      */   {
/* 1125 */     return this.fieldE02CL207.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL208()
/*      */   {
/* 1132 */     return this.fieldE02CL208.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL209()
/*      */   {
/* 1139 */     return this.fieldE02CL209.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL210()
/*      */   {
/* 1146 */     return this.fieldE02CL210.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL211()
/*      */   {
/* 1153 */     return this.fieldE02CL211.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL212()
/*      */   {
/* 1160 */     return this.fieldE02CL212.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL213()
/*      */   {
/* 1167 */     return this.fieldE02CL213.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL214()
/*      */   {
/* 1174 */     return this.fieldE02CL214.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL215()
/*      */   {
/* 1181 */     return this.fieldE02CL215.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL301()
/*      */   {
/* 1188 */     return this.fieldE02CL301.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL302()
/*      */   {
/* 1195 */     return this.fieldE02CL302.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL303()
/*      */   {
/* 1202 */     return this.fieldE02CL303.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL304()
/*      */   {
/* 1209 */     return this.fieldE02CL304.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL305()
/*      */   {
/* 1216 */     return this.fieldE02CL305.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL306()
/*      */   {
/* 1223 */     return this.fieldE02CL306.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL307()
/*      */   {
/* 1230 */     return this.fieldE02CL307.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL308()
/*      */   {
/* 1237 */     return this.fieldE02CL308.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL309()
/*      */   {
/* 1244 */     return this.fieldE02CL309.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL310()
/*      */   {
/* 1251 */     return this.fieldE02CL310.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL311()
/*      */   {
/* 1258 */     return this.fieldE02CL311.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL312()
/*      */   {
/* 1265 */     return this.fieldE02CL312.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL313()
/*      */   {
/* 1272 */     return this.fieldE02CL313.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL314()
/*      */   {
/* 1279 */     return this.fieldE02CL314.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL315()
/*      */   {
/* 1286 */     return this.fieldE02CL315.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL401()
/*      */   {
/* 1293 */     return this.fieldE02CL401.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL402()
/*      */   {
/* 1300 */     return this.fieldE02CL402.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL403()
/*      */   {
/* 1307 */     return this.fieldE02CL403.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL404()
/*      */   {
/* 4 */     return this.fieldE02CL404.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL405()
/*      */   {
/* 1321 */     return this.fieldE02CL405.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL406()
/*      */   {
/* 1328 */     return this.fieldE02CL406.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL407()
/*      */   {
/* 1335 */     return this.fieldE02CL407.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL408()
/*      */   {
/* 1342 */     return this.fieldE02CL408.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL409()
/*      */   {
/* 1349 */     return this.fieldE02CL409.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL410()
/*      */   {
/* 1356 */     return this.fieldE02CL410.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL411()
/*      */   {
/* 1363 */     return this.fieldE02CL411.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL412()
/*      */   {
/* 1370 */     return this.fieldE02CL412.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL413()
/*      */   {
/* 1377 */     return this.fieldE02CL413.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL414()
/*      */   {
/* 1384 */     return this.fieldE02CL414.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL415()
/*      */   {
/* 1391 */     return this.fieldE02CL415.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL501()
/*      */   {
/* 1398 */     return this.fieldE02CL501.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL502()
/*      */   {
/* 1405 */     return this.fieldE02CL502.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL503()
/*      */   {
/* 1412 */     return this.fieldE02CL503.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL504()
/*      */   {
/* 1419 */     return this.fieldE02CL504.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL505()
/*      */   {
/* 1426 */     return this.fieldE02CL505.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL506()
/*      */   {
/* 1433 */     return this.fieldE02CL506.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL507()
/*      */   {
/* 1440 */     return this.fieldE02CL507.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL508()
/*      */   {
/* 1447 */     return this.fieldE02CL508.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL509()
/*      */   {
/* 1454 */     return this.fieldE02CL509.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL510()
/*      */   {
/* 1461 */     return this.fieldE02CL510.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL511()
/*      */   {
/* 1468 */     return this.fieldE02CL511.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL512()
/*      */   {
/* 1475 */     return this.fieldE02CL512.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL513()
/*      */   {
/* 1482 */     return this.fieldE02CL513.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL514()
/*      */   {
/* 1489 */     return this.fieldE02CL514.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL515()
/*      */   {
/* 1496 */     return this.fieldE02CL515.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL601()
/*      */   {
/* 1503 */     return this.fieldE02CL601.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL602()
/*      */   {
/* 1510 */     return this.fieldE02CL602.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL603()
/*      */   {
/* 1517 */     return this.fieldE02CL603.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL604()
/*      */   {
/* 1524 */     return this.fieldE02CL604.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL605()
/*      */   {
/* 1531 */     return this.fieldE02CL605.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL606()
/*      */   {
/* 1538 */     return this.fieldE02CL606.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL607()
/*      */   {
/* 1545 */     return this.fieldE02CL607.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL608()
/*      */   {
/* 1552 */     return this.fieldE02CL608.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL609()
/*      */   {
/* 1559 */     return this.fieldE02CL609.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL610()
/*      */   {
/* 1566 */     return this.fieldE02CL610.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL611()
/*      */   {
/* 1573 */     return this.fieldE02CL611.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL612()
/*      */   {
/* 1580 */     return this.fieldE02CL612.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL613()
/*      */   {
/* 1587 */     return this.fieldE02CL613.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL614()
/*      */   {
/* 1594 */     return this.fieldE02CL614.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL615()
/*      */   {
/* 1601 */     return this.fieldE02CL615.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL701()
/*      */   {
/* 1608 */     return this.fieldE02CL701.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL702()
/*      */   {
/* 1615 */     return this.fieldE02CL702.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL703()
/*      */   {
/* 1622 */     return this.fieldE02CL703.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL704()
/*      */   {
/* 1629 */     return this.fieldE02CL704.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL705()
/*      */   {
/* 1636 */     return this.fieldE02CL705.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL706()
/*      */   {
/* 1643 */     return this.fieldE02CL706.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL707()
/*      */   {
/* 1650 */     return this.fieldE02CL707.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL708()
/*      */   {
/* 1657 */     return this.fieldE02CL708.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL709()
/*      */   {
/* 1664 */     return this.fieldE02CL709.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL710()
/*      */   {
/* 1671 */     return this.fieldE02CL710.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL711()
/*      */   {
/* 1678 */     return this.fieldE02CL711.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL712()
/*      */   {
/* 1685 */     return this.fieldE02CL712.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL713()
/*      */   {
/* 1692 */     return this.fieldE02CL713.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL714()
/*      */   {
/* 1699 */     return this.fieldE02CL714.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE02CL715()
/*      */   {
/* 1706 */     return this.fieldE02CL715.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public String getE02CDD01()
/*      */   {
/* 1713 */     return this.fieldE02CDD01.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CDD02()
/*      */   {
/* 1720 */     return this.fieldE02CDD02.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CDD03()
/*      */   {
/* 1727 */     return this.fieldE02CDD03.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CDD04()
/*      */   {
/* 1734 */     return this.fieldE02CDD04.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CDD05()
/*      */   {
/* 1741 */     return this.fieldE02CDD05.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CDD06()
/*      */   {
/* 1748 */     return this.fieldE02CDD06.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CDD07()
/*      */   {
/* 1755 */     return this.fieldE02CDD07.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CDD08()
/*      */   {
/* 1762 */     return this.fieldE02CDD08.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CDD09()
/*      */   {
/* 1769 */     return this.fieldE02CDD09.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CDD10()
/*      */   {
/* 1776 */     return this.fieldE02CDD10.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CDD11()
/*      */   {
/* 1783 */     return this.fieldE02CDD11.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CDD12()
/*      */   {
/* 1790 */     return this.fieldE02CDD12.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CDD13()
/*      */   {
/* 1797 */     return this.fieldE02CDD13.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CDD14()
/*      */   {
/* 1804 */     return this.fieldE02CDD14.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CDD15()
/*      */   {
/* 1811 */     return this.fieldE02CDD15.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CDRCCY()
/*      */   {
/* 1818 */     return this.fieldE02CDRCCY.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CDRDPE()
/*      */   {
/* 1825 */     return this.fieldE02CDRDPE.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CDRDT1()
/*      */   {
/* 1832 */     return this.fieldE02CDRDT1.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CDRDT2()
/*      */   {
/* 1839 */     return this.fieldE02CDRDT2.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CDRDT3()
/*      */   {
/* 1846 */     return this.fieldE02CDRDT3.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CDRMIR()
/*      */   {
/* 1853 */     return this.fieldE02CDRMIR.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CDRMXR()
/*      */   {
/* 1860 */     return this.fieldE02CDRMXR.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CDRPRT()
/*      */   {
/* 1867 */     return this.fieldE02CDRPRT.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CDRRTB()
/*      */   {
/* 1874 */     return this.fieldE02CDRRTB.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CDUA1()
/*      */   {
/* 1881 */     return this.fieldE02CDUA1.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CDUA2()
/*      */   {
/* 1888 */     return this.fieldE02CDUA2.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CDUA3()
/*      */   {
/* 1895 */     return this.fieldE02CDUA3.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CDUA4()
/*      */   {
/* 1902 */     return this.fieldE02CDUA4.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CDUA5()
/*      */   {
/* 1909 */     return this.fieldE02CDUA5.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CDUA6()
/*      */   {
/* 1916 */     return this.fieldE02CDUA6.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CDUA7()
/*      */   {
/* 1923 */     return this.fieldE02CDUA7.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL101()
/*      */   {
/* 1930 */     return this.fieldE02CL101.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL102()
/*      */   {
/* 1937 */     return this.fieldE02CL102.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL103()
/*      */   {
/* 1944 */     return this.fieldE02CL103.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL104()
/*      */   {
/* 1951 */     return this.fieldE02CL104.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL105()
/*      */   {
/* 1958 */     return this.fieldE02CL105.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL106()
/*      */   {
/* 1965 */     return this.fieldE02CL106.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL107()
/*      */   {
/* 1972 */     return this.fieldE02CL107.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL108()
/*      */   {
/* 1979 */     return this.fieldE02CL108.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL109()
/*      */   {
/* 1986 */     return this.fieldE02CL109.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL110()
/*      */   {
/* 1993 */     return this.fieldE02CL110.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL111()
/*      */   {
/* 2000 */     return this.fieldE02CL111.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL112()
/*      */   {
/* 2007 */     return this.fieldE02CL112.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL113()
/*      */   {
/* 2014 */     return this.fieldE02CL113.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL114()
/*      */   {
/* 2021 */     return this.fieldE02CL114.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL115()
/*      */   {
/* 2028 */     return this.fieldE02CL115.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL201()
/*      */   {
/* 2035 */     return this.fieldE02CL201.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL202()
/*      */   {
/* 2042 */     return this.fieldE02CL202.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL203()
/*      */   {
/* 2049 */     return this.fieldE02CL203.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL204()
/*      */   {
/* 2056 */     return this.fieldE02CL204.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL205()
/*      */   {
/* 2063 */     return this.fieldE02CL205.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL206()
/*      */   {
/* 2070 */     return this.fieldE02CL206.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL207()
/*      */   {
/* 2077 */     return this.fieldE02CL207.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL208()
/*      */   {
/* 2084 */     return this.fieldE02CL208.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL209()
/*      */   {
/* 2091 */     return this.fieldE02CL209.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL210()
/*      */   {
/* 2098 */     return this.fieldE02CL210.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL211()
/*      */   {
/* 2105 */     return this.fieldE02CL211.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL212()
/*      */   {
/* 2112 */     return this.fieldE02CL212.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL213()
/*      */   {
/* 2119 */     return this.fieldE02CL213.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL214()
/*      */   {
/* 2126 */     return this.fieldE02CL214.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL215()
/*      */   {
/* 2133 */     return this.fieldE02CL215.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL301()
/*      */   {
/* 2140 */     return this.fieldE02CL301.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL302()
/*      */   {
/* 2147 */     return this.fieldE02CL302.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL303()
/*      */   {
/* 2154 */     return this.fieldE02CL303.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL304()
/*      */   {
/* 2161 */     return this.fieldE02CL304.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL305()
/*      */   {
/* 2168 */     return this.fieldE02CL305.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL306()
/*      */   {
/* 2175 */     return this.fieldE02CL306.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL307()
/*      */   {
/* 2182 */     return this.fieldE02CL307.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL308()
/*      */   {
/* 2189 */     return this.fieldE02CL308.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL309()
/*      */   {
/* 2196 */     return this.fieldE02CL309.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL310()
/*      */   {
/* 2203 */     return this.fieldE02CL310.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL311()
/*      */   {
/* 2210 */     return this.fieldE02CL311.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL312()
/*      */   {
/* 2217 */     return this.fieldE02CL312.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL313()
/*      */   {
/* 2224 */     return this.fieldE02CL313.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL314()
/*      */   {
/* 2231 */     return this.fieldE02CL314.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL315()
/*      */   {
/* 2238 */     return this.fieldE02CL315.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL401()
/*      */   {
/* 2245 */     return this.fieldE02CL401.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL402()
/*      */   {
/* 2252 */     return this.fieldE02CL402.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL403()
/*      */   {
/* 2259 */     return this.fieldE02CL403.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL404()
/*      */   {
/* 2266 */     return this.fieldE02CL404.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL405()
/*      */   {
/* 2273 */     return this.fieldE02CL405.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL406()
/*      */   {
/* 2280 */     return this.fieldE02CL406.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL407()
/*      */   {
/* 2287 */     return this.fieldE02CL407.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL408()
/*      */   {
/* 2294 */     return this.fieldE02CL408.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL409()
/*      */   {
/* 2301 */     return this.fieldE02CL409.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL410()
/*      */   {
/* 2308 */     return this.fieldE02CL410.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL411()
/*      */   {
/* 2315 */     return this.fieldE02CL411.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL412()
/*      */   {
/* 2322 */     return this.fieldE02CL412.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL413()
/*      */   {
/* 2329 */     return this.fieldE02CL413.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL414()
/*      */   {
/* 2336 */     return this.fieldE02CL414.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL415()
/*      */   {
/* 2343 */     return this.fieldE02CL415.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL501()
/*      */   {
/* 2350 */     return this.fieldE02CL501.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL502()
/*      */   {
/* 2357 */     return this.fieldE02CL502.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL503()
/*      */   {
/* 2364 */     return this.fieldE02CL503.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL504()
/*      */   {
/* 2371 */     return this.fieldE02CL504.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL505()
/*      */   {
/* 2378 */     return this.fieldE02CL505.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL506()
/*      */   {
/* 2385 */     return this.fieldE02CL506.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL507()
/*      */   {
/* 2392 */     return this.fieldE02CL507.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL508()
/*      */   {
/* 2399 */     return this.fieldE02CL508.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL509()
/*      */   {
/* 2406 */     return this.fieldE02CL509.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL510()
/*      */   {
/* 2413 */     return this.fieldE02CL510.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL511()
/*      */   {
/* 2420 */     return this.fieldE02CL511.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL512()
/*      */   {
/* 2427 */     return this.fieldE02CL512.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL513()
/*      */   {
/* 2434 */     return this.fieldE02CL513.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL514()
/*      */   {
/* 2441 */     return this.fieldE02CL514.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL515()
/*      */   {
/* 2448 */     return this.fieldE02CL515.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL601()
/*      */   {
/* 2455 */     return this.fieldE02CL601.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL602()
/*      */   {
/* 2462 */     return this.fieldE02CL602.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL603()
/*      */   {
/* 2469 */     return this.fieldE02CL603.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL604()
/*      */   {
/* 2476 */     return this.fieldE02CL604.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL605()
/*      */   {
/* 2483 */     return this.fieldE02CL605.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL606()
/*      */   {
/* 2490 */     return this.fieldE02CL606.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL607()
/*      */   {
/* 2497 */     return this.fieldE02CL607.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL608()
/*      */   {
/* 2504 */     return this.fieldE02CL608.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL609()
/*      */   {
/* 2511 */     return this.fieldE02CL609.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL610()
/*      */   {
/* 2518 */     return this.fieldE02CL610.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL611()
/*      */   {
/* 2525 */     return this.fieldE02CL611.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL612()
/*      */   {
/* 2532 */     return this.fieldE02CL612.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL613()
/*      */   {
/* 2539 */     return this.fieldE02CL613.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL614()
/*      */   {
/* 2546 */     return this.fieldE02CL614.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL615()
/*      */   {
/* 2553 */     return this.fieldE02CL615.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL701()
/*      */   {
/* 2560 */     return this.fieldE02CL701.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL702()
/*      */   {
/* 2567 */     return this.fieldE02CL702.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL703()
/*      */   {
/* 2574 */     return this.fieldE02CL703.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL704()
/*      */   {
/* 2581 */     return this.fieldE02CL704.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL705()
/*      */   {
/* 2588 */     return this.fieldE02CL705.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL706()
/*      */   {
/* 2595 */     return this.fieldE02CL706.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL707()
/*      */   {
/* 2602 */     return this.fieldE02CL707.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL708()
/*      */   {
/* 2609 */     return this.fieldE02CL708.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL709()
/*      */   {
/* 2616 */     return this.fieldE02CL709.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL710()
/*      */   {
/* 2623 */     return this.fieldE02CL710.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL711()
/*      */   {
/* 2630 */     return this.fieldE02CL711.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL712()
/*      */   {
/* 2637 */     return this.fieldE02CL712.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL713()
/*      */   {
/* 2644 */     return this.fieldE02CL713.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL714()
/*      */   {
/* 2651 */     return this.fieldE02CL714.getString();
/*      */   }
/*      */ 
/*      */   public String getE02CL715()
/*      */   {
/* 2658 */     return this.fieldE02CL715.getString();
/*      */   }
/*      */ 
/*      */   public String getH02FLGMAS()
/*      */   {
/* 2665 */     return this.fieldH02FLGMAS.getString();
/*      */   }
/*      */ 
/*      */   public String getH02FLGWK1()
/*      */   {
/* 2672 */     return this.fieldH02FLGWK1.getString();
/*      */   }
/*      */ 
/*      */   public String getH02FLGWK2()
/*      */   {
/* 2679 */     return this.fieldH02FLGWK2.getString();
/*      */   }
/*      */ 
/*      */   public String getH02FLGWK3()
/*      */   {
/* 2686 */     return this.fieldH02FLGWK3.getString();
/*      */   }
/*      */ 
/*      */   public String getH02OPECOD()
/*      */   {
/* 2693 */     return this.fieldH02OPECOD.getString();
/*      */   }
/*      */ 
/*      */   public String getH02PROGRM()
/*      */   {
/* 2700 */     return this.fieldH02PROGRM.getString();
/*      */   }
/*      */ 
/*      */   public String getH02SCRCOD()
/*      */   {
/* 2707 */     return this.fieldH02SCRCOD.getString();
/*      */   }
/*      */ 
/*      */   public String getH02TIMSYS()
/*      */   {
/* 2714 */     return this.fieldH02TIMSYS.getString();
/*      */   }
/*      */ 
/*      */   public String getH02USERID()
/*      */   {
/* 2721 */     return this.fieldH02USERID.getString();
/*      */   }
/*      */ 
/*      */   public void setE02CDD01(String newvalue)
/*      */   {
/* 2728 */     this.fieldE02CDD01.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CDD01(BigDecimal newvalue)
/*      */   {
/* 2735 */     this.fieldE02CDD01.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CDD02(String newvalue)
/*      */   {
/* 2742 */     this.fieldE02CDD02.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CDD02(BigDecimal newvalue)
/*      */   {
/* 2749 */     this.fieldE02CDD02.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CDD03(String newvalue)
/*      */   {
/* 2756 */     this.fieldE02CDD03.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CDD03(BigDecimal newvalue)
/*      */   {
/* 2763 */     this.fieldE02CDD03.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CDD04(String newvalue)
/*      */   {
/* 2770 */     this.fieldE02CDD04.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CDD04(BigDecimal newvalue)
/*      */   {
/* 2777 */     this.fieldE02CDD04.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CDD05(String newvalue)
/*      */   {
/* 2784 */     this.fieldE02CDD05.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CDD05(BigDecimal newvalue)
/*      */   {
/* 2791 */     this.fieldE02CDD05.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CDD06(String newvalue)
/*      */   {
/* 2798 */     this.fieldE02CDD06.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CDD06(BigDecimal newvalue)
/*      */   {
/* 2805 */     this.fieldE02CDD06.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CDD07(String newvalue)
/*      */   {
/* 2812 */     this.fieldE02CDD07.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CDD07(BigDecimal newvalue)
/*      */   {
/* 2819 */     this.fieldE02CDD07.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CDD08(String newvalue)
/*      */   {
/* 2826 */     this.fieldE02CDD08.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CDD08(BigDecimal newvalue)
/*      */   {
/* 2833 */     this.fieldE02CDD08.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CDD09(String newvalue)
/*      */   {
/* 2840 */     this.fieldE02CDD09.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CDD09(BigDecimal newvalue)
/*      */   {
/* 2847 */     this.fieldE02CDD09.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CDD10(String newvalue)
/*      */   {
/* 2854 */     this.fieldE02CDD10.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CDD10(BigDecimal newvalue)
/*      */   {
/* 2861 */     this.fieldE02CDD10.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CDD11(String newvalue)
/*      */   {
/* 2868 */     this.fieldE02CDD11.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CDD11(BigDecimal newvalue)
/*      */   {
/* 2875 */     this.fieldE02CDD11.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CDD12(String newvalue)
/*      */   {
/* 2882 */     this.fieldE02CDD12.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CDD12(BigDecimal newvalue)
/*      */   {
/* 2889 */     this.fieldE02CDD12.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CDD13(String newvalue)
/*      */   {
/* 2896 */     this.fieldE02CDD13.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CDD13(BigDecimal newvalue)
/*      */   {
/* 2903 */     this.fieldE02CDD13.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CDD14(String newvalue)
/*      */   {
/* 2910 */     this.fieldE02CDD14.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CDD14(BigDecimal newvalue)
/*      */   {
/* 2917 */     this.fieldE02CDD14.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CDD15(String newvalue)
/*      */   {
/* 2924 */     this.fieldE02CDD15.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CDD15(BigDecimal newvalue)
/*      */   {
/* 2931 */     this.fieldE02CDD15.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CDRCCY(String newvalue)
/*      */   {
/* 2938 */     this.fieldE02CDRCCY.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CDRDPE(String newvalue)
/*      */   {
/* 2945 */     this.fieldE02CDRDPE.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CDRDPE(BigDecimal newvalue)
/*      */   {
/* 2952 */     this.fieldE02CDRDPE.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CDRDT1(String newvalue)
/*      */   {
/* 2959 */     this.fieldE02CDRDT1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CDRDT1(BigDecimal newvalue)
/*      */   {
/* 2966 */     this.fieldE02CDRDT1.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CDRDT2(String newvalue)
/*      */   {
/* 2973 */     this.fieldE02CDRDT2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CDRDT2(BigDecimal newvalue)
/*      */   {
/* 2980 */     this.fieldE02CDRDT2.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CDRDT3(String newvalue)
/*      */   {
/* 2987 */     this.fieldE02CDRDT3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CDRDT3(BigDecimal newvalue)
/*      */   {
/* 2994 */     this.fieldE02CDRDT3.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CDRMIR(String newvalue)
/*      */   {
/* 3001 */     this.fieldE02CDRMIR.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CDRMIR(BigDecimal newvalue)
/*      */   {
/* 3008 */     this.fieldE02CDRMIR.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CDRMXR(String newvalue)
/*      */   {
/* 3015 */     this.fieldE02CDRMXR.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CDRMXR(BigDecimal newvalue)
/*      */   {
/* 3022 */     this.fieldE02CDRMXR.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CDRPRT(String newvalue)
/*      */   {
/* 3029 */     this.fieldE02CDRPRT.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CDRPRT(BigDecimal newvalue)
/*      */   {
/* 3036 */     this.fieldE02CDRPRT.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CDRRTB(String newvalue)
/*      */   {
/* 3043 */     this.fieldE02CDRRTB.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CDUA1(String newvalue)
/*      */   {
/* 3050 */     this.fieldE02CDUA1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CDUA1(BigDecimal newvalue)
/*      */   {
/* 3057 */     this.fieldE02CDUA1.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CDUA2(String newvalue)
/*      */   {
/* 3064 */     this.fieldE02CDUA2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CDUA2(BigDecimal newvalue)
/*      */   {
/* 3071 */     this.fieldE02CDUA2.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CDUA3(String newvalue)
/*      */   {
/* 3078 */     this.fieldE02CDUA3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CDUA3(BigDecimal newvalue)
/*      */   {
/* 3085 */     this.fieldE02CDUA3.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CDUA4(String newvalue)
/*      */   {
/* 3092 */     this.fieldE02CDUA4.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CDUA4(BigDecimal newvalue)
/*      */   {
/* 3099 */     this.fieldE02CDUA4.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CDUA5(String newvalue)
/*      */   {
/* 3106 */     this.fieldE02CDUA5.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CDUA5(BigDecimal newvalue)
/*      */   {
/* 3113 */     this.fieldE02CDUA5.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CDUA6(String newvalue)
/*      */   {
/* 3120 */     this.fieldE02CDUA6.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CDUA6(BigDecimal newvalue)
/*      */   {
/* 3127 */     this.fieldE02CDUA6.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CDUA7(String newvalue)
/*      */   {
/* 3134 */     this.fieldE02CDUA7.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CDUA7(BigDecimal newvalue)
/*      */   {
/* 3141 */     this.fieldE02CDUA7.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL101(String newvalue)
/*      */   {
/* 3148 */     this.fieldE02CL101.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL101(BigDecimal newvalue)
/*      */   {
/* 3155 */     this.fieldE02CL101.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL102(String newvalue)
/*      */   {
/* 3162 */     this.fieldE02CL102.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL102(BigDecimal newvalue)
/*      */   {
/* 3169 */     this.fieldE02CL102.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL103(String newvalue)
/*      */   {
/* 3176 */     this.fieldE02CL103.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL103(BigDecimal newvalue)
/*      */   {
/* 3183 */     this.fieldE02CL103.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL104(String newvalue)
/*      */   {
/* 3190 */     this.fieldE02CL104.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL104(BigDecimal newvalue)
/*      */   {
/* 3197 */     this.fieldE02CL104.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL105(String newvalue)
/*      */   {
/* 3204 */     this.fieldE02CL105.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL105(BigDecimal newvalue)
/*      */   {
/* 3211 */     this.fieldE02CL105.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL106(String newvalue)
/*      */   {
/* 3218 */     this.fieldE02CL106.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL106(BigDecimal newvalue)
/*      */   {
/* 3225 */     this.fieldE02CL106.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL107(String newvalue)
/*      */   {
/* 3232 */     this.fieldE02CL107.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL107(BigDecimal newvalue)
/*      */   {
/* 3239 */     this.fieldE02CL107.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL108(String newvalue)
/*      */   {
/* 3246 */     this.fieldE02CL108.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL108(BigDecimal newvalue)
/*      */   {
/* 3253 */     this.fieldE02CL108.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL109(String newvalue)
/*      */   {
/* 3260 */     this.fieldE02CL109.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL109(BigDecimal newvalue)
/*      */   {
/* 3267 */     this.fieldE02CL109.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL110(String newvalue)
/*      */   {
/* 3274 */     this.fieldE02CL110.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL110(BigDecimal newvalue)
/*      */   {
/* 3281 */     this.fieldE02CL110.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL111(String newvalue)
/*      */   {
/* 3288 */     this.fieldE02CL111.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL111(BigDecimal newvalue)
/*      */   {
/* 3295 */     this.fieldE02CL111.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL112(String newvalue)
/*      */   {
/* 3302 */     this.fieldE02CL112.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL112(BigDecimal newvalue)
/*      */   {
/* 3309 */     this.fieldE02CL112.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL113(String newvalue)
/*      */   {
/* 3316 */     this.fieldE02CL113.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL113(BigDecimal newvalue)
/*      */   {
/* 3323 */     this.fieldE02CL113.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL114(String newvalue)
/*      */   {
/* 3330 */     this.fieldE02CL114.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL114(BigDecimal newvalue)
/*      */   {
/* 3337 */     this.fieldE02CL114.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL115(String newvalue)
/*      */   {
/* 3344 */     this.fieldE02CL115.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL115(BigDecimal newvalue)
/*      */   {
/* 3351 */     this.fieldE02CL115.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL201(String newvalue)
/*      */   {
/* 3358 */     this.fieldE02CL201.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL201(BigDecimal newvalue)
/*      */   {
/* 3365 */     this.fieldE02CL201.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL202(String newvalue)
/*      */   {
/* 3372 */     this.fieldE02CL202.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL202(BigDecimal newvalue)
/*      */   {
/* 3379 */     this.fieldE02CL202.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL203(String newvalue)
/*      */   {
/* 3386 */     this.fieldE02CL203.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL203(BigDecimal newvalue)
/*      */   {
/* 3393 */     this.fieldE02CL203.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL204(String newvalue)
/*      */   {
/* 3400 */     this.fieldE02CL204.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL204(BigDecimal newvalue)
/*      */   {
/* 3407 */     this.fieldE02CL204.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL205(String newvalue)
/*      */   {
/* 3414 */     this.fieldE02CL205.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL205(BigDecimal newvalue)
/*      */   {
/* 3421 */     this.fieldE02CL205.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL206(String newvalue)
/*      */   {
/* 3428 */     this.fieldE02CL206.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL206(BigDecimal newvalue)
/*      */   {
/* 3435 */     this.fieldE02CL206.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL207(String newvalue)
/*      */   {
/* 3442 */     this.fieldE02CL207.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL207(BigDecimal newvalue)
/*      */   {
/* 3449 */     this.fieldE02CL207.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL208(String newvalue)
/*      */   {
/* 3456 */     this.fieldE02CL208.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL208(BigDecimal newvalue)
/*      */   {
/* 3463 */     this.fieldE02CL208.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL209(String newvalue)
/*      */   {
/* 3470 */     this.fieldE02CL209.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL209(BigDecimal newvalue)
/*      */   {
/* 3477 */     this.fieldE02CL209.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL210(String newvalue)
/*      */   {
/* 3484 */     this.fieldE02CL210.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL210(BigDecimal newvalue)
/*      */   {
/* 3491 */     this.fieldE02CL210.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL211(String newvalue)
/*      */   {
/* 3498 */     this.fieldE02CL211.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL211(BigDecimal newvalue)
/*      */   {
/* 3505 */     this.fieldE02CL211.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL212(String newvalue)
/*      */   {
/* 3512 */     this.fieldE02CL212.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL212(BigDecimal newvalue)
/*      */   {
/* 3519 */     this.fieldE02CL212.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL213(String newvalue)
/*      */   {
/* 3526 */     this.fieldE02CL213.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL213(BigDecimal newvalue)
/*      */   {
/* 3533 */     this.fieldE02CL213.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL214(String newvalue)
/*      */   {
/* 3540 */     this.fieldE02CL214.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL214(BigDecimal newvalue)
/*      */   {
/* 3547 */     this.fieldE02CL214.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL215(String newvalue)
/*      */   {
/* 3554 */     this.fieldE02CL215.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL215(BigDecimal newvalue)
/*      */   {
/* 3561 */     this.fieldE02CL215.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL301(String newvalue)
/*      */   {
/* 3568 */     this.fieldE02CL301.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL301(BigDecimal newvalue)
/*      */   {
/* 3575 */     this.fieldE02CL301.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL302(String newvalue)
/*      */   {
/* 3582 */     this.fieldE02CL302.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL302(BigDecimal newvalue)
/*      */   {
/* 3589 */     this.fieldE02CL302.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL303(String newvalue)
/*      */   {
/* 3596 */     this.fieldE02CL303.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL303(BigDecimal newvalue)
/*      */   {
/* 3603 */     this.fieldE02CL303.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL304(String newvalue)
/*      */   {
/* 3610 */     this.fieldE02CL304.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL304(BigDecimal newvalue)
/*      */   {
/* 3617 */     this.fieldE02CL304.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL305(String newvalue)
/*      */   {
/* 3624 */     this.fieldE02CL305.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL305(BigDecimal newvalue)
/*      */   {
/* 3631 */     this.fieldE02CL305.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL306(String newvalue)
/*      */   {
/* 3638 */     this.fieldE02CL306.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL306(BigDecimal newvalue)
/*      */   {
/* 3645 */     this.fieldE02CL306.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL307(String newvalue)
/*      */   {
/* 3652 */     this.fieldE02CL307.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL307(BigDecimal newvalue)
/*      */   {
/* 3659 */     this.fieldE02CL307.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL308(String newvalue)
/*      */   {
/* 3666 */     this.fieldE02CL308.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL308(BigDecimal newvalue)
/*      */   {
/* 3673 */     this.fieldE02CL308.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL309(String newvalue)
/*      */   {
/* 3680 */     this.fieldE02CL309.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL309(BigDecimal newvalue)
/*      */   {
/* 3687 */     this.fieldE02CL309.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL310(String newvalue)
/*      */   {
/* 3694 */     this.fieldE02CL310.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL310(BigDecimal newvalue)
/*      */   {
/* 3701 */     this.fieldE02CL310.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL311(String newvalue)
/*      */   {
/* 3708 */     this.fieldE02CL311.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL311(BigDecimal newvalue)
/*      */   {
/* 3715 */     this.fieldE02CL311.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL312(String newvalue)
/*      */   {
/* 3722 */     this.fieldE02CL312.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL312(BigDecimal newvalue)
/*      */   {
/* 3729 */     this.fieldE02CL312.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL313(String newvalue)
/*      */   {
/* 3736 */     this.fieldE02CL313.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL313(BigDecimal newvalue)
/*      */   {
/* 3743 */     this.fieldE02CL313.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL314(String newvalue)
/*      */   {
/* 3750 */     this.fieldE02CL314.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL314(BigDecimal newvalue)
/*      */   {
/* 3757 */     this.fieldE02CL314.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL315(String newvalue)
/*      */   {
/* 3764 */     this.fieldE02CL315.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL315(BigDecimal newvalue)
/*      */   {
/* 3771 */     this.fieldE02CL315.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL401(String newvalue)
/*      */   {
/* 3778 */     this.fieldE02CL401.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL401(BigDecimal newvalue)
/*      */   {
/* 3785 */     this.fieldE02CL401.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL402(String newvalue)
/*      */   {
/* 3792 */     this.fieldE02CL402.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL402(BigDecimal newvalue)
/*      */   {
/* 3799 */     this.fieldE02CL402.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL403(String newvalue)
/*      */   {
/* 3806 */     this.fieldE02CL403.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL403(BigDecimal newvalue)
/*      */   {
/* 3813 */     this.fieldE02CL403.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL404(String newvalue)
/*      */   {
/* 3820 */     this.fieldE02CL404.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL404(BigDecimal newvalue)
/*      */   {
/* 3827 */     this.fieldE02CL404.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL405(String newvalue)
/*      */   {
/* 3834 */     this.fieldE02CL405.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL405(BigDecimal newvalue)
/*      */   {
/* 3841 */     this.fieldE02CL405.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL406(String newvalue)
/*      */   {
/* 3848 */     this.fieldE02CL406.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL406(BigDecimal newvalue)
/*      */   {
/* 3855 */     this.fieldE02CL406.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL407(String newvalue)
/*      */   {
/* 3862 */     this.fieldE02CL407.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL407(BigDecimal newvalue)
/*      */   {
/* 3869 */     this.fieldE02CL407.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL408(String newvalue)
/*      */   {
/* 3876 */     this.fieldE02CL408.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL408(BigDecimal newvalue)
/*      */   {
/* 3883 */     this.fieldE02CL408.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL409(String newvalue)
/*      */   {
/* 3890 */     this.fieldE02CL409.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL409(BigDecimal newvalue)
/*      */   {
/* 3897 */     this.fieldE02CL409.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL410(String newvalue)
/*      */   {
/* 3904 */     this.fieldE02CL410.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL410(BigDecimal newvalue)
/*      */   {
/* 3911 */     this.fieldE02CL410.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL411(String newvalue)
/*      */   {
/* 3918 */     this.fieldE02CL411.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL411(BigDecimal newvalue)
/*      */   {
/* 3925 */     this.fieldE02CL411.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL412(String newvalue)
/*      */   {
/* 3932 */     this.fieldE02CL412.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL412(BigDecimal newvalue)
/*      */   {
/* 3939 */     this.fieldE02CL412.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL413(String newvalue)
/*      */   {
/* 3946 */     this.fieldE02CL413.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL413(BigDecimal newvalue)
/*      */   {
/* 3953 */     this.fieldE02CL413.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL414(String newvalue)
/*      */   {
/* 3960 */     this.fieldE02CL414.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL414(BigDecimal newvalue)
/*      */   {
/* 3967 */     this.fieldE02CL414.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL415(String newvalue)
/*      */   {
/* 3974 */     this.fieldE02CL415.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL415(BigDecimal newvalue)
/*      */   {
/* 3981 */     this.fieldE02CL415.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL501(String newvalue)
/*      */   {
/* 3988 */     this.fieldE02CL501.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL501(BigDecimal newvalue)
/*      */   {
/* 3995 */     this.fieldE02CL501.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL502(String newvalue)
/*      */   {
/* 4002 */     this.fieldE02CL502.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL502(BigDecimal newvalue)
/*      */   {
/* 4009 */     this.fieldE02CL502.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL503(String newvalue)
/*      */   {
/* 4016 */     this.fieldE02CL503.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL503(BigDecimal newvalue)
/*      */   {
/* 4023 */     this.fieldE02CL503.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL504(String newvalue)
/*      */   {
/* 4030 */     this.fieldE02CL504.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL504(BigDecimal newvalue)
/*      */   {
/* 4037 */     this.fieldE02CL504.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL505(String newvalue)
/*      */   {
/* 4044 */     this.fieldE02CL505.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL505(BigDecimal newvalue)
/*      */   {
/* 4051 */     this.fieldE02CL505.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL506(String newvalue)
/*      */   {
/* 4058 */     this.fieldE02CL506.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL506(BigDecimal newvalue)
/*      */   {
/* 4065 */     this.fieldE02CL506.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL507(String newvalue)
/*      */   {
/* 4072 */     this.fieldE02CL507.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL507(BigDecimal newvalue)
/*      */   {
/* 4079 */     this.fieldE02CL507.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL508(String newvalue)
/*      */   {
/* 4086 */     this.fieldE02CL508.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL508(BigDecimal newvalue)
/*      */   {
/* 4093 */     this.fieldE02CL508.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL509(String newvalue)
/*      */   {
/* 4100 */     this.fieldE02CL509.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL509(BigDecimal newvalue)
/*      */   {
/* 4107 */     this.fieldE02CL509.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL510(String newvalue)
/*      */   {
/* 4114 */     this.fieldE02CL510.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL510(BigDecimal newvalue)
/*      */   {
/* 4121 */     this.fieldE02CL510.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL511(String newvalue)
/*      */   {
/* 4128 */     this.fieldE02CL511.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL511(BigDecimal newvalue)
/*      */   {
/* 4135 */     this.fieldE02CL511.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL512(String newvalue)
/*      */   {
/* 4142 */     this.fieldE02CL512.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL512(BigDecimal newvalue)
/*      */   {
/* 4149 */     this.fieldE02CL512.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL513(String newvalue)
/*      */   {
/* 4156 */     this.fieldE02CL513.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL513(BigDecimal newvalue)
/*      */   {
/* 4163 */     this.fieldE02CL513.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL514(String newvalue)
/*      */   {
/* 4170 */     this.fieldE02CL514.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL514(BigDecimal newvalue)
/*      */   {
/* 4177 */     this.fieldE02CL514.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL515(String newvalue)
/*      */   {
/* 4184 */     this.fieldE02CL515.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL515(BigDecimal newvalue)
/*      */   {
/* 4191 */     this.fieldE02CL515.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL601(String newvalue)
/*      */   {
/* 4198 */     this.fieldE02CL601.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL601(BigDecimal newvalue)
/*      */   {
/* 4205 */     this.fieldE02CL601.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL602(String newvalue)
/*      */   {
/* 4212 */     this.fieldE02CL602.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL602(BigDecimal newvalue)
/*      */   {
/* 4219 */     this.fieldE02CL602.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL603(String newvalue)
/*      */   {
/* 4226 */     this.fieldE02CL603.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL603(BigDecimal newvalue)
/*      */   {
/* 4233 */     this.fieldE02CL603.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL604(String newvalue)
/*      */   {
/* 4240 */     this.fieldE02CL604.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL604(BigDecimal newvalue)
/*      */   {
/* 4247 */     this.fieldE02CL604.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL605(String newvalue)
/*      */   {
/* 4254 */     this.fieldE02CL605.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL605(BigDecimal newvalue)
/*      */   {
/* 4261 */     this.fieldE02CL605.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL606(String newvalue)
/*      */   {
/* 4268 */     this.fieldE02CL606.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL606(BigDecimal newvalue)
/*      */   {
/* 4275 */     this.fieldE02CL606.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL607(String newvalue)
/*      */   {
/* 4282 */     this.fieldE02CL607.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL607(BigDecimal newvalue)
/*      */   {
/* 4289 */     this.fieldE02CL607.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL608(String newvalue)
/*      */   {
/* 4296 */     this.fieldE02CL608.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL608(BigDecimal newvalue)
/*      */   {
/* 4303 */     this.fieldE02CL608.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL609(String newvalue)
/*      */   {
/* 4310 */     this.fieldE02CL609.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL609(BigDecimal newvalue)
/*      */   {
/* 4317 */     this.fieldE02CL609.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL610(String newvalue)
/*      */   {
/* 4324 */     this.fieldE02CL610.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL610(BigDecimal newvalue)
/*      */   {
/* 4331 */     this.fieldE02CL610.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL611(String newvalue)
/*      */   {
/* 4338 */     this.fieldE02CL611.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL611(BigDecimal newvalue)
/*      */   {
/* 4345 */     this.fieldE02CL611.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL612(String newvalue)
/*      */   {
/* 4352 */     this.fieldE02CL612.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL612(BigDecimal newvalue)
/*      */   {
/* 4359 */     this.fieldE02CL612.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL613(String newvalue)
/*      */   {
/* 4366 */     this.fieldE02CL613.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL613(BigDecimal newvalue)
/*      */   {
/* 4373 */     this.fieldE02CL613.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL614(String newvalue)
/*      */   {
/* 4380 */     this.fieldE02CL614.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL614(BigDecimal newvalue)
/*      */   {
/* 4387 */     this.fieldE02CL614.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL615(String newvalue)
/*      */   {
/* 4394 */     this.fieldE02CL615.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL615(BigDecimal newvalue)
/*      */   {
/* 4401 */     this.fieldE02CL615.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL701(String newvalue)
/*      */   {
/* 4408 */     this.fieldE02CL701.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL701(BigDecimal newvalue)
/*      */   {
/* 4415 */     this.fieldE02CL701.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL702(String newvalue)
/*      */   {
/* 4422 */     this.fieldE02CL702.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL702(BigDecimal newvalue)
/*      */   {
/* 4429 */     this.fieldE02CL702.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL703(String newvalue)
/*      */   {
/* 4436 */     this.fieldE02CL703.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL703(BigDecimal newvalue)
/*      */   {
/* 4443 */     this.fieldE02CL703.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL704(String newvalue)
/*      */   {
/* 4450 */     this.fieldE02CL704.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL704(BigDecimal newvalue)
/*      */   {
/* 4457 */     this.fieldE02CL704.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL705(String newvalue)
/*      */   {
/* 4464 */     this.fieldE02CL705.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL705(BigDecimal newvalue)
/*      */   {
/* 4471 */     this.fieldE02CL705.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL706(String newvalue)
/*      */   {
/* 4478 */     this.fieldE02CL706.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL706(BigDecimal newvalue)
/*      */   {
/* 4485 */     this.fieldE02CL706.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL707(String newvalue)
/*      */   {
/* 4492 */     this.fieldE02CL707.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL707(BigDecimal newvalue)
/*      */   {
/* 4499 */     this.fieldE02CL707.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL708(String newvalue)
/*      */   {
/* 4506 */     this.fieldE02CL708.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL708(BigDecimal newvalue)
/*      */   {
/* 4513 */     this.fieldE02CL708.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL709(String newvalue)
/*      */   {
/* 4520 */     this.fieldE02CL709.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL709(BigDecimal newvalue)
/*      */   {
/* 4527 */     this.fieldE02CL709.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL710(String newvalue)
/*      */   {
/* 4534 */     this.fieldE02CL710.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL710(BigDecimal newvalue)
/*      */   {
/* 4541 */     this.fieldE02CL710.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL711(String newvalue)
/*      */   {
/* 4548 */     this.fieldE02CL711.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL711(BigDecimal newvalue)
/*      */   {
/* 4555 */     this.fieldE02CL711.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL712(String newvalue)
/*      */   {
/* 4562 */     this.fieldE02CL712.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL712(BigDecimal newvalue)
/*      */   {
/* 4569 */     this.fieldE02CL712.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL713(String newvalue)
/*      */   {
/* 4576 */     this.fieldE02CL713.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL713(BigDecimal newvalue)
/*      */   {
/* 4583 */     this.fieldE02CL713.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL714(String newvalue)
/*      */   {
/* 4590 */     this.fieldE02CL714.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL714(BigDecimal newvalue)
/*      */   {
/* 4597 */     this.fieldE02CL714.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL715(String newvalue)
/*      */   {
/* 4604 */     this.fieldE02CL715.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setE02CL715(BigDecimal newvalue)
/*      */   {
/* 4611 */     this.fieldE02CL715.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public void setH02FLGMAS(String newvalue)
/*      */   {
/* 4618 */     this.fieldH02FLGMAS.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setH02FLGWK1(String newvalue)
/*      */   {
/* 4625 */     this.fieldH02FLGWK1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setH02FLGWK2(String newvalue)
/*      */   {
/* 4632 */     this.fieldH02FLGWK2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setH02FLGWK3(String newvalue)
/*      */   {
/* 4639 */     this.fieldH02FLGWK3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setH02OPECOD(String newvalue)
/*      */   {
/* 4646 */     this.fieldH02OPECOD.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setH02PROGRM(String newvalue)
/*      */   {
/* 4653 */     this.fieldH02PROGRM.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setH02SCRCOD(String newvalue)
/*      */   {
/* 4660 */     this.fieldH02SCRCOD.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setH02TIMSYS(String newvalue)
/*      */   {
/* 4667 */     this.fieldH02TIMSYS.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public void setH02USERID(String newvalue)
/*      */   {
/* 4674 */     this.fieldH02USERID.setString(newvalue);
/*      */   }
/*      */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.ECN0030DSMessage
 * JD-Core Version:    0.6.0
 */