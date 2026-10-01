/*      */ package com.activo.gateway.dibs.messages;
/*      */ 
/*      */ import java.math.BigDecimal;
import java.util.Hashtable;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*      */ 
/*      */ public class CCARDTRJVMessage extends MessageRecord
/*      */ {
/*   20 */   static final String[] fldnames = { 
/*   21 */     "CCATRUSR", 
/*   22 */     "CCATRNUM", 
/*   23 */     "CCATROPC", 
/*   24 */     "CCATRTYP", 
/*   25 */     "H01FLGWK1", 
/*   26 */     "H01FLGWK2", 
/*   27 */     "H01FLGWK3", 
/*   28 */     "CCATRAM1", 
/*   29 */     "CCATRAM2", 
/*   30 */     "CCATRAM3", 
/*   31 */     "CCATRAM4", 
/*   32 */     "CCATRAM5", 
/*   33 */     "CCATRAM6", 
/*   34 */     "CCATRAM7", 
/*   35 */     "CCATRAM8", 
/*   36 */     "CCATRAM9", 
/*   37 */     "CCATRAM10", 
/*   38 */     "CCATRAM11", 
/*   39 */     "CCATRAM12", 
/*   40 */     "CCATRAM13", 
/*   41 */     "CCATRAM14", 
/*   42 */     "CCATRAM15", 
/*   43 */     "CCATRAM16", 
/*   44 */     "CCATRAM17", 
/*   45 */     "CCATRAM18", 
/*   46 */     "CCATRAM19", 
/*   47 */     "CCATRAM20", 
/*   48 */     "CCATRAM21", 
/*   49 */     "CCATRAM22", 
/*   50 */     "CCATRAM23", 
/*   51 */     "CCATRAM24", 
/*   52 */     "CCATRAM25", 
/*   53 */     "CCATRAM26", 
/*   54 */     "CCATRAM27", 
/*   55 */     "CCATRAM28", 
/*   56 */     "CCATRAM29", 
/*   57 */     "CCATRAM30", 
/*   58 */     "CCATRAM31", 
/*   59 */     "CCATRAM32", 
/*   60 */     "CCATRAM33", 
/*   61 */     "CCATRAM34", 
/*   62 */     "CCATRAM35", 
/*   63 */     "CCATRAM36", 
/*   64 */     "CCATRAM37", 
/*   65 */     "CCATRAM38", 
/*   66 */     "CCATRAM39", 
/*   67 */     "CCATRAM40", 
/*   68 */     "CCATRAM41", 
/*   69 */     "CCATRAM42", 
/*   70 */     "CCATRAM43", 
/*   71 */     "CCATRAM44", 
/*   72 */     "CCATRAM45", 
/*   73 */     "CCATRAM46", 
/*   74 */     "CCATRAM47", 
/*   75 */     "CCATRAM48", 
/*   76 */     "CCATRAM49", 
/*   77 */     "CCATRAM50", 
/*   78 */     "CCATRAM51", 
/*   79 */     "CCATRAM52", 
/*   80 */     "CCATRAM53", 
/*   81 */     "CCATRAM54", 
/*   82 */     "CCATRAM55", 
/*   83 */     "CCATRAM56", 
/*   84 */     "CCATRAM57", 
/*   85 */     "CCATRAM58", 
/*   86 */     "CCATRAM59", 
/*   87 */     "CCATRAM60", 
/*   88 */     "CCATRAM61", 
/*   89 */     "CCATRAM62", 
/*   90 */     "CCATRAM63", 
/*   91 */     "CCATRAM64", 
/*   92 */     "CCATRAM65", 
/*   93 */     "CCATRAM66", 
/*   94 */     "CCATRAM67", 
/*   95 */     "CCATRAM68", 
/*   96 */     "CCATRAM69", 
/*   97 */     "CCATRAM70", 
/*   98 */     "CCATRAM71", 
/*   99 */     "CCATRAM72", 
/*  100 */     "CCATRAM73", 
/*  101 */     "CCATRAM74", 
/*  102 */     "CCATRAM75", 
/*  103 */     "CCATRAM76", 
/*  104 */     "CCATRAM77", 
/*  105 */     "CCATRAM78", 
/*  106 */     "CCATRAM79", 
/*  107 */     "CCATRAM80", 
/*  108 */     "CCATRDC1", 
/*  109 */     "CCATRDC2", 
/*  110 */     "CCATRDC3", 
/*  111 */     "CCATRDC4", 
/*  112 */     "CCATRDC5", 
/*  113 */     "CCATRDAT", 
/*  114 */     "CCATRPRC", 
/*  115 */     "CCATRTIM", 
/*  116 */     "CCATRDSC", 
/*  117 */     "CCATRAMCR", 
/*  118 */     "CCATRAMDB", 
/*  119 */     "CCATRREF", 
/*  120 */     "CCATADD1", 
/*  121 */     "CCATADD2", 
/*  122 */     "CCATADD3", 
/*  123 */     "CCATADD4", 
/*  124 */     "CCATADD5", 
/*  125 */     "CCATREOF" };
/*      */ 
/*  127 */   static final String[] tnames = { 
/*  128 */     "CCATRUSR", 
/*  129 */     "CCATRNUM", 
/*  130 */     "CCATROPC", 
/*  131 */     "CCATRTYP", 
/*  132 */     "H01FLGWK1", 
/*  133 */     "H01FLGWK2", 
/*  134 */     "H01FLGWK3", 
/*  135 */     "CCATRAM1", 
/*  136 */     "CCATRAM2", 
/*  137 */     "CCATRAM3", 
/*  138 */     "CCATRAM4", 
/*  139 */     "CCATRAM5", 
/*  140 */     "CCATRAM6", 
/*  141 */     "CCATRAM7", 
/*  142 */     "CCATRAM8", 
/*  143 */     "CCATRAM9", 
/*  144 */     "CCATRAM10", 
/*  145 */     "CCATRAM11", 
/*  146 */     "CCATRAM12", 
/*  147 */     "CCATRAM13", 
/*  148 */     "CCATRAM14", 
/*  149 */     "CCATRAM15", 
/*  150 */     "CCATRAM16", 
/*  151 */     "CCATRAM17", 
/*  152 */     "CCATRAM18", 
/*  153 */     "CCATRAM19", 
/*  154 */     "CCATRAM20", 
/*  155 */     "CCATRAM21", 
/*  156 */     "CCATRAM22", 
/*  157 */     "CCATRAM23", 
/*  158 */     "CCATRAM24", 
/*  159 */     "CCATRAM25", 
/*  160 */     "CCATRAM26", 
/*  161 */     "CCATRAM27", 
/*  162 */     "CCATRAM28", 
/*  163 */     "CCATRAM29", 
/*  164 */     "CCATRAM30", 
/*  165 */     "CCATRAM31", 
/*  166 */     "CCATRAM32", 
/*  167 */     "CCATRAM33", 
/*  168 */     "CCATRAM34", 
/*  169 */     "CCATRAM35", 
/*  170 */     "CCATRAM36", 
/*  171 */     "CCATRAM37", 
/*  172 */     "CCATRAM38", 
/*  173 */     "CCATRAM39", 
/*  174 */     "CCATRAM40", 
/*  175 */     "CCATRAM41", 
/*  176 */     "CCATRAM42", 
/*  177 */     "CCATRAM43", 
/*  178 */     "CCATRAM44", 
/*  179 */     "CCATRAM45", 
/*  180 */     "CCATRAM46", 
/*  181 */     "CCATRAM47", 
/*  182 */     "CCATRAM48", 
/*  183 */     "CCATRAM49", 
/*  184 */     "CCATRAM50", 
/*  185 */     "CCATRAM51", 
/*  186 */     "CCATRAM52", 
/*  187 */     "CCATRAM53", 
/*  188 */     "CCATRAM54", 
/*  189 */     "CCATRAM55", 
/*  190 */     "CCATRAM56", 
/*  191 */     "CCATRAM57", 
/*  192 */     "CCATRAM58", 
/*  193 */     "CCATRAM59", 
/*  194 */     "CCATRAM60", 
/*  195 */     "CCATRAM61", 
/*  196 */     "CCATRAM62", 
/*  197 */     "CCATRAM63", 
/*  198 */     "CCATRAM64", 
/*  199 */     "CCATRAM65", 
/*  200 */     "CCATRAM66", 
/*  201 */     "CCATRAM67", 
/*  202 */     "CCATRAM68", 
/*  203 */     "CCATRAM69", 
/*  204 */     "CCATRAM70", 
/*  205 */     "CCATRAM71", 
/*  206 */     "CCATRAM72", 
/*  207 */     "CCATRAM73", 
/*  208 */     "CCATRAM74", 
/*  209 */     "CCATRAM75", 
/*  210 */     "CCATRAM76", 
/*  211 */     "CCATRAM77", 
/*  212 */     "CCATRAM78", 
/*  213 */     "CCATRAM79", 
/*  214 */     "CCATRAM80", 
/*  215 */     "CCATRDC1", 
/*  216 */     "CCATRDC2", 
/*  217 */     "CCATRDC3", 
/*  218 */     "CCATRDC4", 
/*  219 */     "CCATRDC5", 
/*  220 */     "CCATRDAT", 
/*  221 */     "CCATRPRC", 
/*  222 */     "CCATRTIM", 
/*  223 */     "CCATRDSC", 
/*  224 */     "CCATRAMCR", 
/*  225 */     "CCATRAMDB", 
/*  226 */     "CCATRREF", 
/*  227 */     "CCATADD1", 
/*  228 */     "CCATADD2", 
/*  229 */     "CCATADD3", 
/*  230 */     "CCATADD4", 
/*  231 */     "CCATADD5", 
/*  232 */     "CCATREOF" };
/*      */   static final String fid = "1110209154739";
/*      */   static final String rid = "449335F781DCB";
/*      */   static final String fmtname = "CCARDTRJV";
/*  237 */   final int FIELDCOUNT = 105;
/*  238 */   private static Hashtable tlookup = new Hashtable();
/*  239 */   private CharacterField fieldCCATRUSR = null;
/*  240 */   private CharacterField fieldCCATRNUM = null;
/*  241 */   private CharacterField fieldCCATROPC = null;
/*  242 */   private CharacterField fieldCCATRTYP = null;
/*  243 */   private CharacterField fieldH01FLGWK1 = null;
/*  244 */   private CharacterField fieldH01FLGWK2 = null;
/*  245 */   private CharacterField fieldH01FLGWK3 = null;
/*  246 */   private DecimalField fieldCCATRAM1 = null;
/*  247 */   private DecimalField fieldCCATRAM2 = null;
/*  248 */   private DecimalField fieldCCATRAM3 = null;
/*  249 */   private DecimalField fieldCCATRAM4 = null;
/*  250 */   private DecimalField fieldCCATRAM5 = null;
/*  251 */   private DecimalField fieldCCATRAM6 = null;
/*  252 */   private DecimalField fieldCCATRAM7 = null;
/*  253 */   private DecimalField fieldCCATRAM8 = null;
/*  254 */   private DecimalField fieldCCATRAM9 = null;
/*  255 */   private DecimalField fieldCCATRAM10 = null;
/*  256 */   private DecimalField fieldCCATRAM11 = null;
/*  257 */   private DecimalField fieldCCATRAM12 = null;
/*  258 */   private DecimalField fieldCCATRAM13 = null;
/*  259 */   private DecimalField fieldCCATRAM14 = null;
/*  260 */   private DecimalField fieldCCATRAM15 = null;
/*  261 */   private DecimalField fieldCCATRAM16 = null;
/*  262 */   private DecimalField fieldCCATRAM17 = null;
/*  263 */   private DecimalField fieldCCATRAM18 = null;
/*  264 */   private DecimalField fieldCCATRAM19 = null;
/*  265 */   private DecimalField fieldCCATRAM20 = null;
/*  266 */   private DecimalField fieldCCATRAM21 = null;
/*  267 */   private DecimalField fieldCCATRAM22 = null;
/*  268 */   private DecimalField fieldCCATRAM23 = null;
/*  269 */   private DecimalField fieldCCATRAM24 = null;
/*  270 */   private DecimalField fieldCCATRAM25 = null;
/*  271 */   private DecimalField fieldCCATRAM26 = null;
/*  272 */   private DecimalField fieldCCATRAM27 = null;
/*  273 */   private DecimalField fieldCCATRAM28 = null;
/*  274 */   private DecimalField fieldCCATRAM29 = null;
/*  275 */   private DecimalField fieldCCATRAM30 = null;
/*  276 */   private DecimalField fieldCCATRAM31 = null;
/*  277 */   private DecimalField fieldCCATRAM32 = null;
/*  278 */   private DecimalField fieldCCATRAM33 = null;
/*  279 */   private DecimalField fieldCCATRAM34 = null;
/*  280 */   private DecimalField fieldCCATRAM35 = null;
/*  281 */   private DecimalField fieldCCATRAM36 = null;
/*  282 */   private DecimalField fieldCCATRAM37 = null;
/*  283 */   private DecimalField fieldCCATRAM38 = null;
/*  284 */   private DecimalField fieldCCATRAM39 = null;
/*  285 */   private DecimalField fieldCCATRAM40 = null;
/*  286 */   private DecimalField fieldCCATRAM41 = null;
/*  287 */   private DecimalField fieldCCATRAM42 = null;
/*  288 */   private DecimalField fieldCCATRAM43 = null;
/*  289 */   private DecimalField fieldCCATRAM44 = null;
/*  290 */   private DecimalField fieldCCATRAM45 = null;
/*  291 */   private DecimalField fieldCCATRAM46 = null;
/*  292 */   private DecimalField fieldCCATRAM47 = null;
/*  293 */   private DecimalField fieldCCATRAM48 = null;
/*  294 */   private DecimalField fieldCCATRAM49 = null;
/*  295 */   private DecimalField fieldCCATRAM50 = null;
/*  296 */   private DecimalField fieldCCATRAM51 = null;
/*  297 */   private DecimalField fieldCCATRAM52 = null;
/*  298 */   private DecimalField fieldCCATRAM53 = null;
/*  299 */   private DecimalField fieldCCATRAM54 = null;
/*  300 */   private DecimalField fieldCCATRAM55 = null;
/*  301 */   private DecimalField fieldCCATRAM56 = null;
/*  302 */   private DecimalField fieldCCATRAM57 = null;
/*  303 */   private DecimalField fieldCCATRAM58 = null;
/*  304 */   private DecimalField fieldCCATRAM59 = null;
/*  305 */   private DecimalField fieldCCATRAM60 = null;
/*  306 */   private DecimalField fieldCCATRAM61 = null;
/*  307 */   private DecimalField fieldCCATRAM62 = null;
/*  308 */   private DecimalField fieldCCATRAM63 = null;
/*  309 */   private DecimalField fieldCCATRAM64 = null;
/*  310 */   private DecimalField fieldCCATRAM65 = null;
/*  311 */   private DecimalField fieldCCATRAM66 = null;
/*  312 */   private DecimalField fieldCCATRAM67 = null;
/*  313 */   private DecimalField fieldCCATRAM68 = null;
/*  314 */   private DecimalField fieldCCATRAM69 = null;
/*  315 */   private DecimalField fieldCCATRAM70 = null;
/*  316 */   private DecimalField fieldCCATRAM71 = null;
/*  317 */   private DecimalField fieldCCATRAM72 = null;
/*  318 */   private DecimalField fieldCCATRAM73 = null;
/*  319 */   private DecimalField fieldCCATRAM74 = null;
/*  320 */   private DecimalField fieldCCATRAM75 = null;
/*  321 */   private DecimalField fieldCCATRAM76 = null;
/*  322 */   private DecimalField fieldCCATRAM77 = null;
/*  323 */   private DecimalField fieldCCATRAM78 = null;
/*  324 */   private DecimalField fieldCCATRAM79 = null;
/*  325 */   private DecimalField fieldCCATRAM80 = null;
/*  326 */   private CharacterField fieldCCATRDC1 = null;
/*  327 */   private CharacterField fieldCCATRDC2 = null;
/*  328 */   private CharacterField fieldCCATRDC3 = null;
/*  329 */   private CharacterField fieldCCATRDC4 = null;
/*  330 */   private CharacterField fieldCCATRDC5 = null;
/*  331 */   private DecimalField fieldCCATRDAT = null;
/*  332 */   private DecimalField fieldCCATRPRC = null;
/*  333 */   private DecimalField fieldCCATRTIM = null;
/*  334 */   private CharacterField fieldCCATRDSC = null;
/*  335 */   private DecimalField fieldCCATRAMCR = null;
/*  336 */   private DecimalField fieldCCATRAMDB = null;
/*  337 */   private CharacterField fieldCCATRREF = null;
/*  338 */   private CharacterField fieldCCATADD1 = null;
/*  339 */   private CharacterField fieldCCATADD2 = null;
/*  340 */   private CharacterField fieldCCATADD3 = null;
/*  341 */   private CharacterField fieldCCATADD4 = null;
/*  342 */   private CharacterField fieldCCATADD5 = null;
/*  343 */   private CharacterField fieldCCATREOF = null;
/*      */ 
/*      */   public CCARDTRJVMessage()
/*      */   {
/*  350 */     createFields();
/*  351 */     initialize();
/*      */   }
/*      */ 
/*      */   protected void createFields()
/*      */   {
/*  360 */     this.recordsize = 1696;
/*  361 */     this.fileid = "1110209154739";
/*  362 */     this.recordid = "449335F781DCB";
/*  363 */     this.message = new byte[getByteLength()];
/*  364 */     this.formatname = "CCARDTRJV";
/*  365 */     this.fieldnames = fldnames;
/*  366 */     this.tagnames = tnames;
/*  367 */     this.fields = new MessageField[105];
/*      */      this.fields[0]=this.fieldCCATRUSR=new CharacterField(this.message, 10, 10, "CCATRUSR");
/*      */      this.fields[1]=this.fieldCCATRNUM=new CharacterField(this.message, 20, 17, "CCATRNUM");
/*      */      this.fields[2]=this.fieldCCATROPC=new CharacterField(this.message, 37, 2, "CCATROPC");
/*      */      this.fields[3]=this.fieldCCATRTYP=new CharacterField(this.message, 39, 1, "CCATRTYP");
/*      */      this.fields[4]=this.fieldH01FLGWK1=new CharacterField(this.message, 40, 1, "H01FLGWK1");
/*      */      this.fields[5]=this.fieldH01FLGWK2=new CharacterField(this.message, 41, 1, "H01FLGWK2");
/*      */      this.fields[6]=this.fieldH01FLGWK3=new CharacterField(this.message, 42, 1, "H01FLGWK3");
/*      */      this.fields[7]=this.fieldCCATRAM1=new DecimalField(this.message, 43, 14, 2, "CCATRAM1");
/*      */      this.fields[8]=this.fieldCCATRAM2=new DecimalField(this.message, 57, 14, 2, "CCATRAM2");
/*      */      this.fields[9]=this.fieldCCATRAM3=new DecimalField(this.message, 71, 14, 2, "CCATRAM3");
/*      */      this.fields[10]=this.fieldCCATRAM4=new DecimalField(this.message, 85, 14, 2, "CCATRAM4");
/*      */      this.fields[11]=this.fieldCCATRAM5=new DecimalField(this.message, 99, 14, 2, "CCATRAM5");
/*      */      this.fields[12]=this.fieldCCATRAM6=new DecimalField(this.message, 113, 14, 2, "CCATRAM6");
/*      */      this.fields[13]=this.fieldCCATRAM7=new DecimalField(this.message, 127, 14, 2, "CCATRAM7");
/*      */      this.fields[14]=this.fieldCCATRAM8=new DecimalField(this.message, 141, 14, 2, "CCATRAM8");
/*      */      this.fields[15]=this.fieldCCATRAM9=new DecimalField(this.message, 155, 14, 2, "CCATRAM9");
/*      */      this.fields[16]=this.fieldCCATRAM10=new DecimalField(this.message, 169, 14, 2, "CCATRAM10");
/*      */      this.fields[17]=this.fieldCCATRAM11=new DecimalField(this.message, 183, 14, 2, "CCATRAM11");
/*      */      this.fields[18]=this.fieldCCATRAM12=new DecimalField(this.message, 197, 14, 2, "CCATRAM12");
/*      */      this.fields[19]=this.fieldCCATRAM13=new DecimalField(this.message, 211, 14, 2, "CCATRAM13");
/*      */      this.fields[20]=this.fieldCCATRAM14=new DecimalField(this.message, 225, 14, 2, "CCATRAM14");
/*      */      this.fields[21]=this.fieldCCATRAM15=new DecimalField(this.message, 239, 14, 2, "CCATRAM15");
/*      */      this.fields[22]=this.fieldCCATRAM16=new DecimalField(this.message, 253, 14, 2, "CCATRAM16");
/*      */      this.fields[23]=this.fieldCCATRAM17=new DecimalField(this.message, 267, 14, 2, "CCATRAM17");
/*      */      this.fields[24]=this.fieldCCATRAM18=new DecimalField(this.message, 281, 14, 2, "CCATRAM18");
/*      */      this.fields[25]=this.fieldCCATRAM19=new DecimalField(this.message, 295, 14, 2, "CCATRAM19");
/*      */      this.fields[26]=this.fieldCCATRAM20=new DecimalField(this.message, 309, 14, 2, "CCATRAM20");
/*      */      this.fields[27]=this.fieldCCATRAM21=new DecimalField(this.message, 323, 14, 2, "CCATRAM21");
/*      */      this.fields[28]=this.fieldCCATRAM22=new DecimalField(this.message, 337, 14, 2, "CCATRAM22");
/*      */      this.fields[29]=this.fieldCCATRAM23=new DecimalField(this.message, 351, 14, 2, "CCATRAM23");
/*      */      this.fields[30]=this.fieldCCATRAM24=new DecimalField(this.message, 365, 14, 2, "CCATRAM24");
/*      */      this.fields[31]=this.fieldCCATRAM25=new DecimalField(this.message, 379, 14, 2, "CCATRAM25");
/*      */      this.fields[32]=this.fieldCCATRAM26=new DecimalField(this.message, 393, 14, 2, "CCATRAM26");
/*      */      this.fields[33]=this.fieldCCATRAM27=new DecimalField(this.message, 407, 14, 2, "CCATRAM27");
/*      */      this.fields[34]=this.fieldCCATRAM28=new DecimalField(this.message, 421, 14, 2, "CCATRAM28");
/*      */      this.fields[35]=this.fieldCCATRAM29=new DecimalField(this.message, 435, 14, 2, "CCATRAM29");
/*      */      this.fields[36]=this.fieldCCATRAM30=new DecimalField(this.message, 449, 14, 2, "CCATRAM30");
/*      */      this.fields[37]=this.fieldCCATRAM31=new DecimalField(this.message, 463, 14, 2, "CCATRAM31");
/*      */      this.fields[38]=this.fieldCCATRAM32=new DecimalField(this.message, 477, 14, 2, "CCATRAM32");
/*      */      this.fields[39]=this.fieldCCATRAM33=new DecimalField(this.message, 491, 14, 2, "CCATRAM33");
/*      */      this.fields[40]=this.fieldCCATRAM34=new DecimalField(this.message, 505, 14, 2, "CCATRAM34");
/*      */      this.fields[41]=this.fieldCCATRAM35=new DecimalField(this.message, 519, 14, 2, "CCATRAM35");
/*      */      this.fields[42]=this.fieldCCATRAM36=new DecimalField(this.message, 533, 14, 2, "CCATRAM36");
/*      */      this.fields[43]=this.fieldCCATRAM37=new DecimalField(this.message, 547, 14, 2, "CCATRAM37");
/*      */      this.fields[44]=this.fieldCCATRAM38=new DecimalField(this.message, 561, 14, 2, "CCATRAM38");
/*      */      this.fields[45]=this.fieldCCATRAM39=new DecimalField(this.message, 575, 14, 2, "CCATRAM39");
/*      */      this.fields[46]=this.fieldCCATRAM40=new DecimalField(this.message, 589, 14, 2, "CCATRAM40");
/*      */      this.fields[47]=this.fieldCCATRAM41=new DecimalField(this.message, 603, 14, 2, "CCATRAM41");
/*      */      this.fields[48]=this.fieldCCATRAM42=new DecimalField(this.message, 617, 14, 2, "CCATRAM42");
/*      */      this.fields[49]=this.fieldCCATRAM43=new DecimalField(this.message, 631, 14, 2, "CCATRAM43");
/*      */      this.fields[50]=this.fieldCCATRAM44=new DecimalField(this.message, 645, 14, 2, "CCATRAM44");
/*      */      this.fields[51]=this.fieldCCATRAM45=new DecimalField(this.message, 659, 14, 2, "CCATRAM45");
/*      */      this.fields[52]=this.fieldCCATRAM46=new DecimalField(this.message, 673, 14, 2, "CCATRAM46");
/*      */      this.fields[53]=this.fieldCCATRAM47=new DecimalField(this.message, 687, 14, 2, "CCATRAM47");
/*      */      this.fields[54]=this.fieldCCATRAM48=new DecimalField(this.message, 701, 14, 2, "CCATRAM48");
/*      */      this.fields[55]=this.fieldCCATRAM49=new DecimalField(this.message, 715, 14, 2, "CCATRAM49");
/*      */      this.fields[56]=this.fieldCCATRAM50=new DecimalField(this.message, 729, 14, 2, "CCATRAM50");
/*      */      this.fields[57]=this.fieldCCATRAM51=new DecimalField(this.message, 743, 14, 2, "CCATRAM51");
/*      */      this.fields[58]=this.fieldCCATRAM52=new DecimalField(this.message, 757, 14, 2, "CCATRAM52");
/*      */      this.fields[59]=this.fieldCCATRAM53=new DecimalField(this.message, 771, 14, 2, "CCATRAM53");
/*      */      this.fields[60]=this.fieldCCATRAM54=new DecimalField(this.message, 785, 14, 2, "CCATRAM54");
/*      */      this.fields[61]=this.fieldCCATRAM55=new DecimalField(this.message, 799, 14, 2, "CCATRAM55");
/*      */      this.fields[62]=this.fieldCCATRAM56=new DecimalField(this.message, 813, 14, 2, "CCATRAM56");
/*      */      this.fields[63]=this.fieldCCATRAM57=new DecimalField(this.message, 827, 14, 2, "CCATRAM57");
/*      */      this.fields[64]=this.fieldCCATRAM58=new DecimalField(this.message, 841, 14, 2, "CCATRAM58");
/*      */      this.fields[65]=this.fieldCCATRAM59=new DecimalField(this.message, 855, 14, 2, "CCATRAM59");
/*      */      this.fields[66]=this.fieldCCATRAM60=new DecimalField(this.message, 869, 14, 2, "CCATRAM60");
/*      */      this.fields[67]=this.fieldCCATRAM61=new DecimalField(this.message, 883, 14, 2, "CCATRAM61");
/*      */      this.fields[68]=this.fieldCCATRAM62=new DecimalField(this.message, 897, 14, 2, "CCATRAM62");
/*      */      this.fields[69]=this.fieldCCATRAM63=new DecimalField(this.message, 911, 14, 2, "CCATRAM63");
/*      */      this.fields[70]=this.fieldCCATRAM64=new DecimalField(this.message, 925, 14, 2, "CCATRAM64");
/*      */      this.fields[71]=this.fieldCCATRAM65=new DecimalField(this.message, 939, 14, 2, "CCATRAM65");
/*      */      this.fields[72]=this.fieldCCATRAM66=new DecimalField(this.message, 953, 14, 2, "CCATRAM66");
/*      */      this.fields[73]=this.fieldCCATRAM67=new DecimalField(this.message, 967, 14, 2, "CCATRAM67");
/*      */      this.fields[74]=this.fieldCCATRAM68=new DecimalField(this.message, 981, 14, 2, "CCATRAM68");
/*      */      this.fields[75]=this.fieldCCATRAM69=new DecimalField(this.message, 995, 14, 2, "CCATRAM69");
/*      */      this.fields[76]=this.fieldCCATRAM70=new DecimalField(this.message, 1009, 14, 2, "CCATRAM70");
/*      */      this.fields[77]=this.fieldCCATRAM71=new DecimalField(this.message, 1023, 14, 2, "CCATRAM71");
/*      */      this.fields[78]=this.fieldCCATRAM72=new DecimalField(this.message, 1037, 14, 2, "CCATRAM72");
/*      */      this.fields[79]=this.fieldCCATRAM73=new DecimalField(this.message, 1051, 14, 2, "CCATRAM73");
/*      */      this.fields[80]=this.fieldCCATRAM74=new DecimalField(this.message, 1065, 14, 2, "CCATRAM74");
/*      */      this.fields[81]=this.fieldCCATRAM75=new DecimalField(this.message, 1079, 14, 2, "CCATRAM75");
/*      */      this.fields[82]=this.fieldCCATRAM76=new DecimalField(this.message, 1093, 14, 2, "CCATRAM76");
/*      */      this.fields[83]=this.fieldCCATRAM77=new DecimalField(this.message, 1107, 14, 2, "CCATRAM77");
/*      */      this.fields[84]=this.fieldCCATRAM78=new DecimalField(this.message, 1121, 14, 2, "CCATRAM78");
/*      */      this.fields[85]=this.fieldCCATRAM79=new DecimalField(this.message, 1135, 14, 2, "CCATRAM79");
/*      */      this.fields[86]=this.fieldCCATRAM80=new DecimalField(this.message, 1149, 14, 2, "CCATRAM80");
/*      */      this.fields[87]=this.fieldCCATRDC1=new CharacterField(this.message, 1163, 30, "CCATRDC1");
/*      */      this.fields[88]=this.fieldCCATRDC2=new CharacterField(this.message, 1193, 30, "CCATRDC2");
/*      */      this.fields[89]=this.fieldCCATRDC3=new CharacterField(this.message, 1223, 30, "CCATRDC3");
/*      */      this.fields[90]=this.fieldCCATRDC4=new CharacterField(this.message, 1253, 30, "CCATRDC4");
/*      */      this.fields[91]=this.fieldCCATRDC5=new CharacterField(this.message, 1283, 30, "CCATRDC5");
/*      */      this.fields[92]=this.fieldCCATRDAT=new DecimalField(this.message, 1313, 9, 0, "CCATRDAT");
/*      */      this.fields[93]=this.fieldCCATRPRC=new DecimalField(this.message, 1322, 9, 0, "CCATRPRC");
/*      */      this.fields[94]=this.fieldCCATRTIM=new DecimalField(this.message, 1331, 7, 0, "CCATRTIM");
/*      */      this.fields[95]=this.fieldCCATRDSC=new CharacterField(this.message, 1338, 30, "CCATRDSC");
/*      */      this.fields[96]=this.fieldCCATRAMCR=new DecimalField(this.message, 1368, 14, 2, "CCATRAMCR");
/*      */      this.fields[97]=this.fieldCCATRAMDB=new DecimalField(this.message, 1382, 14, 2, "CCATRAMDB");
/*      */      this.fields[98]=this.fieldCCATRREF=new CharacterField(this.message, 1396, 9, "CCATRREF");
/*      */      this.fields[99]=this.fieldCCATADD1=new CharacterField(this.message, 1405, 60, "CCATADD1");
/*      */      this.fields[100]=this.fieldCCATADD2=new CharacterField(this.message, 1465, 60, "CCATADD2");
/*      */      this.fields[101]=this.fieldCCATADD3=new CharacterField(this.message, 1525, 60, "CCATADD3");
/*      */      this.fields[102]=this.fieldCCATADD4=new CharacterField(this.message, 1585, 60, "CCATADD4");
/*      */      this.fields[103]=this.fieldCCATADD5=new CharacterField(this.message, 1645, 60, "CCATADD5");
/*      */      this.fields[104]=this.fieldCCATREOF=new CharacterField(this.message, 1705, 1, "CCATREOF");
/*      */ 
/*  580 */     synchronized (tlookup)
/*      */     {
/*  582 */       if (tlookup.isEmpty())
/*      */       {
/*  584 */         for (int i = 0; i < tnames.length; i++) {
/*  585 */           tlookup.put(tnames[i], new Integer(i));
/*      */         }
/*      */       }
/*      */     }
/*  589 */     this.taglookup = tlookup;
/*      */   }
/*      */ 
/*      */   public void setCCATRUSR(String newvalue)
/*      */   {
/*  597 */     this.fieldCCATRUSR.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRUSR()
/*      */   {
/*  605 */     return this.fieldCCATRUSR.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRNUM(String newvalue)
/*      */   {
/*  613 */     this.fieldCCATRNUM.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRNUM()
/*      */   {
/*  621 */     return this.fieldCCATRNUM.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATROPC(String newvalue)
/*      */   {
/*  629 */     this.fieldCCATROPC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATROPC()
/*      */   {
/*  637 */     return this.fieldCCATROPC.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRTYP(String newvalue)
/*      */   {
/*  645 */     this.fieldCCATRTYP.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRTYP()
/*      */   {
/*  653 */     return this.fieldCCATRTYP.getString();
/*      */   }
/*      */ 
/*      */   public void setH01FLGWK1(String newvalue)
/*      */   {
/*  661 */     this.fieldH01FLGWK1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getH01FLGWK1()
/*      */   {
/*  669 */     return this.fieldH01FLGWK1.getString();
/*      */   }
/*      */ 
/*      */   public void setH01FLGWK2(String newvalue)
/*      */   {
/*  677 */     this.fieldH01FLGWK2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getH01FLGWK2()
/*      */   {
/*  685 */     return this.fieldH01FLGWK2.getString();
/*      */   }
/*      */ 
/*      */   public void setH01FLGWK3(String newvalue)
/*      */   {
/*  693 */     this.fieldH01FLGWK3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getH01FLGWK3()
/*      */   {
/*  701 */     return this.fieldH01FLGWK3.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM1(String newvalue)
/*      */   {
/*  709 */     this.fieldCCATRAM1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRAM1()
/*      */   {
/*  717 */     return this.fieldCCATRAM1.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM1(BigDecimal newvalue)
/*      */   {
/*  725 */     this.fieldCCATRAM1.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRAM1()
/*      */   {
/*  733 */     return this.fieldCCATRAM1.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM2(String newvalue)
/*      */   {
/*  741 */     this.fieldCCATRAM2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRAM2()
/*      */   {
/*  749 */     return this.fieldCCATRAM2.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM2(BigDecimal newvalue)
/*      */   {
/*  757 */     this.fieldCCATRAM2.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRAM2()
/*      */   {
/*  765 */     return this.fieldCCATRAM2.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM3(String newvalue)
/*      */   {
/*  773 */     this.fieldCCATRAM3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRAM3()
/*      */   {
/*  781 */     return this.fieldCCATRAM3.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM3(BigDecimal newvalue)
/*      */   {
/*  789 */     this.fieldCCATRAM3.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRAM3()
/*      */   {
/*  797 */     return this.fieldCCATRAM3.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM4(String newvalue)
/*      */   {
/*  805 */     this.fieldCCATRAM4.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRAM4()
/*      */   {
/*  813 */     return this.fieldCCATRAM4.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM4(BigDecimal newvalue)
/*      */   {
/*  821 */     this.fieldCCATRAM4.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRAM4()
/*      */   {
/*  829 */     return this.fieldCCATRAM4.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM5(String newvalue)
/*      */   {
/*  837 */     this.fieldCCATRAM5.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRAM5()
/*      */   {
/*  845 */     return this.fieldCCATRAM5.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM5(BigDecimal newvalue)
/*      */   {
/*  853 */     this.fieldCCATRAM5.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRAM5()
/*      */   {
/*  861 */     return this.fieldCCATRAM5.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM6(String newvalue)
/*      */   {
/*  869 */     this.fieldCCATRAM6.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRAM6()
/*      */   {
/*  877 */     return this.fieldCCATRAM6.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM6(BigDecimal newvalue)
/*      */   {
/*  885 */     this.fieldCCATRAM6.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRAM6()
/*      */   {
/*  893 */     return this.fieldCCATRAM6.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM7(String newvalue)
/*      */   {
/*  901 */     this.fieldCCATRAM7.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRAM7()
/*      */   {
/*  909 */     return this.fieldCCATRAM7.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM7(BigDecimal newvalue)
/*      */   {
/*  917 */     this.fieldCCATRAM7.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRAM7()
/*      */   {
/*  925 */     return this.fieldCCATRAM7.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM8(String newvalue)
/*      */   {
/*  933 */     this.fieldCCATRAM8.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRAM8()
/*      */   {
/*  941 */     return this.fieldCCATRAM8.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM8(BigDecimal newvalue)
/*      */   {
/*  949 */     this.fieldCCATRAM8.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRAM8()
/*      */   {
/*  957 */     return this.fieldCCATRAM8.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM9(String newvalue)
/*      */   {
/*  965 */     this.fieldCCATRAM9.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRAM9()
/*      */   {
/*  973 */     return this.fieldCCATRAM9.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM9(BigDecimal newvalue)
/*      */   {
/*  981 */     this.fieldCCATRAM9.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRAM9()
/*      */   {
/*  989 */     return this.fieldCCATRAM9.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM10(String newvalue)
/*      */   {
/*  997 */     this.fieldCCATRAM10.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRAM10()
/*      */   {
/* 1005 */     return this.fieldCCATRAM10.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM10(BigDecimal newvalue)
/*      */   {
/* 1013 */     this.fieldCCATRAM10.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRAM10()
/*      */   {
/* 1021 */     return this.fieldCCATRAM10.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM11(String newvalue)
/*      */   {
/* 1029 */     this.fieldCCATRAM11.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRAM11()
/*      */   {
/* 1037 */     return this.fieldCCATRAM11.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM11(BigDecimal newvalue)
/*      */   {
/* 1045 */     this.fieldCCATRAM11.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRAM11()
/*      */   {
/* 1053 */     return this.fieldCCATRAM11.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM12(String newvalue)
/*      */   {
/* 1061 */     this.fieldCCATRAM12.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRAM12()
/*      */   {
/* 1069 */     return this.fieldCCATRAM12.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM12(BigDecimal newvalue)
/*      */   {
/* 1077 */     this.fieldCCATRAM12.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRAM12()
/*      */   {
/* 1085 */     return this.fieldCCATRAM12.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM13(String newvalue)
/*      */   {
/* 1093 */     this.fieldCCATRAM13.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRAM13()
/*      */   {
/* 1101 */     return this.fieldCCATRAM13.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM13(BigDecimal newvalue)
/*      */   {
/* 1109 */     this.fieldCCATRAM13.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRAM13()
/*      */   {
/* 1117 */     return this.fieldCCATRAM13.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM14(String newvalue)
/*      */   {
/* 1125 */     this.fieldCCATRAM14.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRAM14()
/*      */   {
/* 1133 */     return this.fieldCCATRAM14.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM14(BigDecimal newvalue)
/*      */   {
/* 1141 */     this.fieldCCATRAM14.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRAM14()
/*      */   {
/* 1149 */     return this.fieldCCATRAM14.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM15(String newvalue)
/*      */   {
/* 1157 */     this.fieldCCATRAM15.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRAM15()
/*      */   {
/* 1165 */     return this.fieldCCATRAM15.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM15(BigDecimal newvalue)
/*      */   {
/* 1173 */     this.fieldCCATRAM15.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRAM15()
/*      */   {
/* 1181 */     return this.fieldCCATRAM15.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM16(String newvalue)
/*      */   {
/* 1189 */     this.fieldCCATRAM16.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRAM16()
/*      */   {
/* 1197 */     return this.fieldCCATRAM16.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM16(BigDecimal newvalue)
/*      */   {
/* 1205 */     this.fieldCCATRAM16.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRAM16()
/*      */   {
/* 1213 */     return this.fieldCCATRAM16.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM17(String newvalue)
/*      */   {
/* 1221 */     this.fieldCCATRAM17.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRAM17()
/*      */   {
/* 1229 */     return this.fieldCCATRAM17.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM17(BigDecimal newvalue)
/*      */   {
/* 1237 */     this.fieldCCATRAM17.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRAM17()
/*      */   {
/* 1245 */     return this.fieldCCATRAM17.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM18(String newvalue)
/*      */   {
/* 1253 */     this.fieldCCATRAM18.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRAM18()
/*      */   {
/* 1261 */     return this.fieldCCATRAM18.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM18(BigDecimal newvalue)
/*      */   {
/* 1269 */     this.fieldCCATRAM18.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRAM18()
/*      */   {
/* 1277 */     return this.fieldCCATRAM18.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM19(String newvalue)
/*      */   {
/* 1285 */     this.fieldCCATRAM19.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRAM19()
/*      */   {
/* 1293 */     return this.fieldCCATRAM19.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM19(BigDecimal newvalue)
/*      */   {
/* 1301 */     this.fieldCCATRAM19.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRAM19()
/*      */   {
/* 1309 */     return this.fieldCCATRAM19.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM20(String newvalue)
/*      */   {
/* 1317 */     this.fieldCCATRAM20.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRAM20()
/*      */   {
/* 1325 */     return this.fieldCCATRAM20.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM20(BigDecimal newvalue)
/*      */   {
/* 1333 */     this.fieldCCATRAM20.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRAM20()
/*      */   {
/* 1341 */     return this.fieldCCATRAM20.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM21(String newvalue)
/*      */   {
/* 1349 */     this.fieldCCATRAM21.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRAM21()
/*      */   {
/* 1357 */     return this.fieldCCATRAM21.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM21(BigDecimal newvalue)
/*      */   {
/* 1365 */     this.fieldCCATRAM21.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRAM21()
/*      */   {
/* 1373 */     return this.fieldCCATRAM21.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM22(String newvalue)
/*      */   {
/* 1381 */     this.fieldCCATRAM22.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRAM22()
/*      */   {
/* 1389 */     return this.fieldCCATRAM22.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM22(BigDecimal newvalue)
/*      */   {
/* 1397 */     this.fieldCCATRAM22.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRAM22()
/*      */   {
/* 1405 */     return this.fieldCCATRAM22.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM23(String newvalue)
/*      */   {
/* 1413 */     this.fieldCCATRAM23.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRAM23()
/*      */   {
/* 1421 */     return this.fieldCCATRAM23.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM23(BigDecimal newvalue)
/*      */   {
/* 1429 */     this.fieldCCATRAM23.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRAM23()
/*      */   {
/* 1437 */     return this.fieldCCATRAM23.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM24(String newvalue)
/*      */   {
/* 1445 */     this.fieldCCATRAM24.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRAM24()
/*      */   {
/* 1453 */     return this.fieldCCATRAM24.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM24(BigDecimal newvalue)
/*      */   {
/* 1461 */     this.fieldCCATRAM24.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRAM24()
/*      */   {
/* 1469 */     return this.fieldCCATRAM24.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM25(String newvalue)
/*      */   {
/* 1477 */     this.fieldCCATRAM25.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRAM25()
/*      */   {
/* 1485 */     return this.fieldCCATRAM25.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM25(BigDecimal newvalue)
/*      */   {
/* 1493 */     this.fieldCCATRAM25.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRAM25()
/*      */   {
/* 1501 */     return this.fieldCCATRAM25.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM26(String newvalue)
/*      */   {
/* 1509 */     this.fieldCCATRAM26.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRAM26()
/*      */   {
/* 1517 */     return this.fieldCCATRAM26.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM26(BigDecimal newvalue)
/*      */   {
/* 1525 */     this.fieldCCATRAM26.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRAM26()
/*      */   {
/* 1533 */     return this.fieldCCATRAM26.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM27(String newvalue)
/*      */   {
/* 1541 */     this.fieldCCATRAM27.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRAM27()
/*      */   {
/* 1549 */     return this.fieldCCATRAM27.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM27(BigDecimal newvalue)
/*      */   {
/* 1557 */     this.fieldCCATRAM27.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRAM27()
/*      */   {
/* 1565 */     return this.fieldCCATRAM27.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM28(String newvalue)
/*      */   {
/* 1573 */     this.fieldCCATRAM28.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRAM28()
/*      */   {
/* 1581 */     return this.fieldCCATRAM28.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM28(BigDecimal newvalue)
/*      */   {
/* 1589 */     this.fieldCCATRAM28.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRAM28()
/*      */   {
/* 1597 */     return this.fieldCCATRAM28.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM29(String newvalue)
/*      */   {
/* 1605 */     this.fieldCCATRAM29.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRAM29()
/*      */   {
/* 1613 */     return this.fieldCCATRAM29.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM29(BigDecimal newvalue)
/*      */   {
/* 1621 */     this.fieldCCATRAM29.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRAM29()
/*      */   {
/* 1629 */     return this.fieldCCATRAM29.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM30(String newvalue)
/*      */   {
/* 1637 */     this.fieldCCATRAM30.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRAM30()
/*      */   {
/* 1645 */     return this.fieldCCATRAM30.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM30(BigDecimal newvalue)
/*      */   {
/* 1653 */     this.fieldCCATRAM30.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRAM30()
/*      */   {
/* 1661 */     return this.fieldCCATRAM30.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM31(String newvalue)
/*      */   {
/* 1669 */     this.fieldCCATRAM31.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRAM31()
/*      */   {
/* 1677 */     return this.fieldCCATRAM31.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM31(BigDecimal newvalue)
/*      */   {
/* 1685 */     this.fieldCCATRAM31.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRAM31()
/*      */   {
/* 1693 */     return this.fieldCCATRAM31.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM32(String newvalue)
/*      */   {
/* 1701 */     this.fieldCCATRAM32.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRAM32()
/*      */   {
/* 1709 */     return this.fieldCCATRAM32.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM32(BigDecimal newvalue)
/*      */   {
/* 1717 */     this.fieldCCATRAM32.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRAM32()
/*      */   {
/* 1725 */     return this.fieldCCATRAM32.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM33(String newvalue)
/*      */   {
/* 1733 */     this.fieldCCATRAM33.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRAM33()
/*      */   {
/* 1741 */     return this.fieldCCATRAM33.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM33(BigDecimal newvalue)
/*      */   {
/* 1749 */     this.fieldCCATRAM33.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRAM33()
/*      */   {
/* 1757 */     return this.fieldCCATRAM33.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM34(String newvalue)
/*      */   {
/* 1765 */     this.fieldCCATRAM34.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRAM34()
/*      */   {
/* 1773 */     return this.fieldCCATRAM34.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM34(BigDecimal newvalue)
/*      */   {
/* 1781 */     this.fieldCCATRAM34.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRAM34()
/*      */   {
/* 1789 */     return this.fieldCCATRAM34.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM35(String newvalue)
/*      */   {
/* 1797 */     this.fieldCCATRAM35.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRAM35()
/*      */   {
/* 1805 */     return this.fieldCCATRAM35.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM35(BigDecimal newvalue)
/*      */   {
/* 1813 */     this.fieldCCATRAM35.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRAM35()
/*      */   {
/* 1821 */     return this.fieldCCATRAM35.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM36(String newvalue)
/*      */   {
/* 1829 */     this.fieldCCATRAM36.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRAM36()
/*      */   {
/* 1837 */     return this.fieldCCATRAM36.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM36(BigDecimal newvalue)
/*      */   {
/* 1845 */     this.fieldCCATRAM36.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRAM36()
/*      */   {
/* 1853 */     return this.fieldCCATRAM36.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM37(String newvalue)
/*      */   {
/* 1861 */     this.fieldCCATRAM37.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRAM37()
/*      */   {
/* 1869 */     return this.fieldCCATRAM37.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM37(BigDecimal newvalue)
/*      */   {
/* 1877 */     this.fieldCCATRAM37.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRAM37()
/*      */   {
/* 1885 */     return this.fieldCCATRAM37.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM38(String newvalue)
/*      */   {
/* 1893 */     this.fieldCCATRAM38.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRAM38()
/*      */   {
/* 1901 */     return this.fieldCCATRAM38.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM38(BigDecimal newvalue)
/*      */   {
/* 1909 */     this.fieldCCATRAM38.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRAM38()
/*      */   {
/* 1917 */     return this.fieldCCATRAM38.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM39(String newvalue)
/*      */   {
/* 1925 */     this.fieldCCATRAM39.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRAM39()
/*      */   {
/* 1933 */     return this.fieldCCATRAM39.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM39(BigDecimal newvalue)
/*      */   {
/* 1941 */     this.fieldCCATRAM39.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRAM39()
/*      */   {
/* 1949 */     return this.fieldCCATRAM39.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM40(String newvalue)
/*      */   {
/* 1957 */     this.fieldCCATRAM40.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRAM40()
/*      */   {
/* 1965 */     return this.fieldCCATRAM40.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM40(BigDecimal newvalue)
/*      */   {
/* 1973 */     this.fieldCCATRAM40.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRAM40()
/*      */   {
/* 1981 */     return this.fieldCCATRAM40.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM41(String newvalue)
/*      */   {
/* 1989 */     this.fieldCCATRAM41.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRAM41()
/*      */   {
/* 1997 */     return this.fieldCCATRAM41.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM41(BigDecimal newvalue)
/*      */   {
/* 2005 */     this.fieldCCATRAM41.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRAM41()
/*      */   {
/* 2013 */     return this.fieldCCATRAM41.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM42(String newvalue)
/*      */   {
/* 2021 */     this.fieldCCATRAM42.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRAM42()
/*      */   {
/* 2029 */     return this.fieldCCATRAM42.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM42(BigDecimal newvalue)
/*      */   {
/* 2037 */     this.fieldCCATRAM42.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRAM42()
/*      */   {
/* 2045 */     return this.fieldCCATRAM42.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM43(String newvalue)
/*      */   {
/* 2053 */     this.fieldCCATRAM43.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRAM43()
/*      */   {
/* 2061 */     return this.fieldCCATRAM43.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM43(BigDecimal newvalue)
/*      */   {
/* 2069 */     this.fieldCCATRAM43.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRAM43()
/*      */   {
/* 2077 */     return this.fieldCCATRAM43.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM44(String newvalue)
/*      */   {
/* 2085 */     this.fieldCCATRAM44.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRAM44()
/*      */   {
/* 2093 */     return this.fieldCCATRAM44.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM44(BigDecimal newvalue)
/*      */   {
/* 2101 */     this.fieldCCATRAM44.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRAM44()
/*      */   {
/* 2109 */     return this.fieldCCATRAM44.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM45(String newvalue)
/*      */   {
/* 2117 */     this.fieldCCATRAM45.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRAM45()
/*      */   {
/* 2125 */     return this.fieldCCATRAM45.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM45(BigDecimal newvalue)
/*      */   {
/* 2133 */     this.fieldCCATRAM45.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRAM45()
/*      */   {
/* 2141 */     return this.fieldCCATRAM45.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM46(String newvalue)
/*      */   {
/* 2149 */     this.fieldCCATRAM46.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRAM46()
/*      */   {
/* 2157 */     return this.fieldCCATRAM46.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM46(BigDecimal newvalue)
/*      */   {
/* 2165 */     this.fieldCCATRAM46.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRAM46()
/*      */   {
/* 2173 */     return this.fieldCCATRAM46.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM47(String newvalue)
/*      */   {
/* 2181 */     this.fieldCCATRAM47.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRAM47()
/*      */   {
/* 2189 */     return this.fieldCCATRAM47.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM47(BigDecimal newvalue)
/*      */   {
/* 2197 */     this.fieldCCATRAM47.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRAM47()
/*      */   {
/* 2205 */     return this.fieldCCATRAM47.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM48(String newvalue)
/*      */   {
/* 2213 */     this.fieldCCATRAM48.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRAM48()
/*      */   {
/* 2221 */     return this.fieldCCATRAM48.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM48(BigDecimal newvalue)
/*      */   {
/* 2229 */     this.fieldCCATRAM48.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRAM48()
/*      */   {
/* 2237 */     return this.fieldCCATRAM48.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM49(String newvalue)
/*      */   {
/* 2245 */     this.fieldCCATRAM49.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRAM49()
/*      */   {
/* 2253 */     return this.fieldCCATRAM49.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM49(BigDecimal newvalue)
/*      */   {
/* 2261 */     this.fieldCCATRAM49.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRAM49()
/*      */   {
/* 2269 */     return this.fieldCCATRAM49.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM50(String newvalue)
/*      */   {
/* 2277 */     this.fieldCCATRAM50.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRAM50()
/*      */   {
/* 2285 */     return this.fieldCCATRAM50.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM50(BigDecimal newvalue)
/*      */   {
/* 2293 */     this.fieldCCATRAM50.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRAM50()
/*      */   {
/* 2301 */     return this.fieldCCATRAM50.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM51(String newvalue)
/*      */   {
/* 2309 */     this.fieldCCATRAM51.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRAM51()
/*      */   {
/* 2317 */     return this.fieldCCATRAM51.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM51(BigDecimal newvalue)
/*      */   {
/* 2325 */     this.fieldCCATRAM51.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRAM51()
/*      */   {
/* 2333 */     return this.fieldCCATRAM51.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM52(String newvalue)
/*      */   {
/* 2341 */     this.fieldCCATRAM52.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRAM52()
/*      */   {
/* 2349 */     return this.fieldCCATRAM52.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM52(BigDecimal newvalue)
/*      */   {
/* 2357 */     this.fieldCCATRAM52.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRAM52()
/*      */   {
/* 2365 */     return this.fieldCCATRAM52.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM53(String newvalue)
/*      */   {
/* 2373 */     this.fieldCCATRAM53.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRAM53()
/*      */   {
/* 2381 */     return this.fieldCCATRAM53.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM53(BigDecimal newvalue)
/*      */   {
/* 2389 */     this.fieldCCATRAM53.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRAM53()
/*      */   {
/* 2397 */     return this.fieldCCATRAM53.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM54(String newvalue)
/*      */   {
/* 2405 */     this.fieldCCATRAM54.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRAM54()
/*      */   {
/* 2413 */     return this.fieldCCATRAM54.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM54(BigDecimal newvalue)
/*      */   {
/* 2421 */     this.fieldCCATRAM54.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRAM54()
/*      */   {
/* 2429 */     return this.fieldCCATRAM54.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM55(String newvalue)
/*      */   {
/* 2437 */     this.fieldCCATRAM55.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRAM55()
/*      */   {
/* 2445 */     return this.fieldCCATRAM55.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM55(BigDecimal newvalue)
/*      */   {
/* 2453 */     this.fieldCCATRAM55.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRAM55()
/*      */   {
/* 2461 */     return this.fieldCCATRAM55.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM56(String newvalue)
/*      */   {
/* 2469 */     this.fieldCCATRAM56.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRAM56()
/*      */   {
/* 2477 */     return this.fieldCCATRAM56.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM56(BigDecimal newvalue)
/*      */   {
/* 2485 */     this.fieldCCATRAM56.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRAM56()
/*      */   {
/* 2493 */     return this.fieldCCATRAM56.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM57(String newvalue)
/*      */   {
/* 2501 */     this.fieldCCATRAM57.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRAM57()
/*      */   {
/* 2509 */     return this.fieldCCATRAM57.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM57(BigDecimal newvalue)
/*      */   {
/* 2517 */     this.fieldCCATRAM57.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRAM57()
/*      */   {
/* 2525 */     return this.fieldCCATRAM57.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM58(String newvalue)
/*      */   {
/* 2533 */     this.fieldCCATRAM58.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRAM58()
/*      */   {
/* 2541 */     return this.fieldCCATRAM58.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM58(BigDecimal newvalue)
/*      */   {
/* 2549 */     this.fieldCCATRAM58.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRAM58()
/*      */   {
/* 2557 */     return this.fieldCCATRAM58.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM59(String newvalue)
/*      */   {
/* 2565 */     this.fieldCCATRAM59.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRAM59()
/*      */   {
/* 2573 */     return this.fieldCCATRAM59.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM59(BigDecimal newvalue)
/*      */   {
/* 2581 */     this.fieldCCATRAM59.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRAM59()
/*      */   {
/* 2589 */     return this.fieldCCATRAM59.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM60(String newvalue)
/*      */   {
/* 2597 */     this.fieldCCATRAM60.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRAM60()
/*      */   {
/* 2605 */     return this.fieldCCATRAM60.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM60(BigDecimal newvalue)
/*      */   {
/* 2613 */     this.fieldCCATRAM60.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRAM60()
/*      */   {
/* 2621 */     return this.fieldCCATRAM60.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM61(String newvalue)
/*      */   {
/* 2629 */     this.fieldCCATRAM61.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRAM61()
/*      */   {
/* 2637 */     return this.fieldCCATRAM61.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM61(BigDecimal newvalue)
/*      */   {
/* 2645 */     this.fieldCCATRAM61.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRAM61()
/*      */   {
/* 2653 */     return this.fieldCCATRAM61.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM62(String newvalue)
/*      */   {
/* 2661 */     this.fieldCCATRAM62.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRAM62()
/*      */   {
/* 2669 */     return this.fieldCCATRAM62.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM62(BigDecimal newvalue)
/*      */   {
/* 2677 */     this.fieldCCATRAM62.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRAM62()
/*      */   {
/* 2685 */     return this.fieldCCATRAM62.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM63(String newvalue)
/*      */   {
/* 2693 */     this.fieldCCATRAM63.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRAM63()
/*      */   {
/* 2701 */     return this.fieldCCATRAM63.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM63(BigDecimal newvalue)
/*      */   {
/* 2709 */     this.fieldCCATRAM63.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRAM63()
/*      */   {
/* 2717 */     return this.fieldCCATRAM63.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM64(String newvalue)
/*      */   {
/* 2725 */     this.fieldCCATRAM64.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRAM64()
/*      */   {
/* 2733 */     return this.fieldCCATRAM64.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM64(BigDecimal newvalue)
/*      */   {
/* 2741 */     this.fieldCCATRAM64.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRAM64()
/*      */   {
/* 2749 */     return this.fieldCCATRAM64.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM65(String newvalue)
/*      */   {
/* 2757 */     this.fieldCCATRAM65.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRAM65()
/*      */   {
/* 2765 */     return this.fieldCCATRAM65.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM65(BigDecimal newvalue)
/*      */   {
/* 2773 */     this.fieldCCATRAM65.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRAM65()
/*      */   {
/* 2781 */     return this.fieldCCATRAM65.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM66(String newvalue)
/*      */   {
/* 2789 */     this.fieldCCATRAM66.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRAM66()
/*      */   {
/* 2797 */     return this.fieldCCATRAM66.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM66(BigDecimal newvalue)
/*      */   {
/* 2805 */     this.fieldCCATRAM66.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRAM66()
/*      */   {
/* 2813 */     return this.fieldCCATRAM66.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM67(String newvalue)
/*      */   {
/* 2821 */     this.fieldCCATRAM67.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRAM67()
/*      */   {
/* 2829 */     return this.fieldCCATRAM67.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM67(BigDecimal newvalue)
/*      */   {
/* 2837 */     this.fieldCCATRAM67.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRAM67()
/*      */   {
/* 2845 */     return this.fieldCCATRAM67.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM68(String newvalue)
/*      */   {
/* 2853 */     this.fieldCCATRAM68.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRAM68()
/*      */   {
/* 2861 */     return this.fieldCCATRAM68.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM68(BigDecimal newvalue)
/*      */   {
/* 2869 */     this.fieldCCATRAM68.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRAM68()
/*      */   {
/* 2877 */     return this.fieldCCATRAM68.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM69(String newvalue)
/*      */   {
/* 2885 */     this.fieldCCATRAM69.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRAM69()
/*      */   {
/* 2893 */     return this.fieldCCATRAM69.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM69(BigDecimal newvalue)
/*      */   {
/* 2901 */     this.fieldCCATRAM69.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRAM69()
/*      */   {
/* 2909 */     return this.fieldCCATRAM69.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM70(String newvalue)
/*      */   {
/* 2917 */     this.fieldCCATRAM70.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRAM70()
/*      */   {
/* 2925 */     return this.fieldCCATRAM70.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM70(BigDecimal newvalue)
/*      */   {
/* 2933 */     this.fieldCCATRAM70.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRAM70()
/*      */   {
/* 2941 */     return this.fieldCCATRAM70.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM71(String newvalue)
/*      */   {
/* 2949 */     this.fieldCCATRAM71.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRAM71()
/*      */   {
/* 2957 */     return this.fieldCCATRAM71.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM71(BigDecimal newvalue)
/*      */   {
/* 2965 */     this.fieldCCATRAM71.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRAM71()
/*      */   {
/* 2973 */     return this.fieldCCATRAM71.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM72(String newvalue)
/*      */   {
/* 2981 */     this.fieldCCATRAM72.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRAM72()
/*      */   {
/* 2989 */     return this.fieldCCATRAM72.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM72(BigDecimal newvalue)
/*      */   {
/* 2997 */     this.fieldCCATRAM72.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRAM72()
/*      */   {
/* 3005 */     return this.fieldCCATRAM72.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM73(String newvalue)
/*      */   {
/* 3013 */     this.fieldCCATRAM73.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRAM73()
/*      */   {
/* 3021 */     return this.fieldCCATRAM73.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM73(BigDecimal newvalue)
/*      */   {
/* 3029 */     this.fieldCCATRAM73.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRAM73()
/*      */   {
/* 3037 */     return this.fieldCCATRAM73.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM74(String newvalue)
/*      */   {
/* 3045 */     this.fieldCCATRAM74.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRAM74()
/*      */   {
/* 3053 */     return this.fieldCCATRAM74.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM74(BigDecimal newvalue)
/*      */   {
/* 3061 */     this.fieldCCATRAM74.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRAM74()
/*      */   {
/* 3069 */     return this.fieldCCATRAM74.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM75(String newvalue)
/*      */   {
/* 3077 */     this.fieldCCATRAM75.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRAM75()
/*      */   {
/* 3085 */     return this.fieldCCATRAM75.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM75(BigDecimal newvalue)
/*      */   {
/* 3093 */     this.fieldCCATRAM75.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRAM75()
/*      */   {
/* 3101 */     return this.fieldCCATRAM75.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM76(String newvalue)
/*      */   {
/* 3109 */     this.fieldCCATRAM76.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRAM76()
/*      */   {
/* 3117 */     return this.fieldCCATRAM76.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM76(BigDecimal newvalue)
/*      */   {
/* 3125 */     this.fieldCCATRAM76.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRAM76()
/*      */   {
/* 3133 */     return this.fieldCCATRAM76.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM77(String newvalue)
/*      */   {
/* 3141 */     this.fieldCCATRAM77.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRAM77()
/*      */   {
/* 3149 */     return this.fieldCCATRAM77.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM77(BigDecimal newvalue)
/*      */   {
/* 3157 */     this.fieldCCATRAM77.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRAM77()
/*      */   {
/* 3165 */     return this.fieldCCATRAM77.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM78(String newvalue)
/*      */   {
/* 3173 */     this.fieldCCATRAM78.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRAM78()
/*      */   {
/* 3181 */     return this.fieldCCATRAM78.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM78(BigDecimal newvalue)
/*      */   {
/* 3189 */     this.fieldCCATRAM78.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRAM78()
/*      */   {
/* 3197 */     return this.fieldCCATRAM78.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM79(String newvalue)
/*      */   {
/* 3205 */     this.fieldCCATRAM79.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRAM79()
/*      */   {
/* 3213 */     return this.fieldCCATRAM79.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM79(BigDecimal newvalue)
/*      */   {
/* 3221 */     this.fieldCCATRAM79.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRAM79()
/*      */   {
/* 3229 */     return this.fieldCCATRAM79.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM80(String newvalue)
/*      */   {
/* 3237 */     this.fieldCCATRAM80.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRAM80()
/*      */   {
/* 3245 */     return this.fieldCCATRAM80.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAM80(BigDecimal newvalue)
/*      */   {
/* 3253 */     this.fieldCCATRAM80.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRAM80()
/*      */   {
/* 3261 */     return this.fieldCCATRAM80.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRDC1(String newvalue)
/*      */   {
/* 3269 */     this.fieldCCATRDC1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRDC1()
/*      */   {
/* 3277 */     return this.fieldCCATRDC1.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRDC2(String newvalue)
/*      */   {
/* 3285 */     this.fieldCCATRDC2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRDC2()
/*      */   {
/* 3293 */     return this.fieldCCATRDC2.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRDC3(String newvalue)
/*      */   {
/* 3301 */     this.fieldCCATRDC3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRDC3()
/*      */   {
/* 3309 */     return this.fieldCCATRDC3.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRDC4(String newvalue)
/*      */   {
/* 3317 */     this.fieldCCATRDC4.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRDC4()
/*      */   {
/* 3325 */     return this.fieldCCATRDC4.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRDC5(String newvalue)
/*      */   {
/* 3333 */     this.fieldCCATRDC5.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRDC5()
/*      */   {
/* 3341 */     return this.fieldCCATRDC5.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRDAT(String newvalue)
/*      */   {
/* 3349 */     this.fieldCCATRDAT.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRDAT()
/*      */   {
/* 3357 */     return this.fieldCCATRDAT.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRDAT(BigDecimal newvalue)
/*      */   {
/* 3365 */     this.fieldCCATRDAT.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRDAT()
/*      */   {
/* 3373 */     return this.fieldCCATRDAT.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRPRC(String newvalue)
/*      */   {
/* 3381 */     this.fieldCCATRPRC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRPRC()
/*      */   {
/* 3389 */     return this.fieldCCATRPRC.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRPRC(BigDecimal newvalue)
/*      */   {
/* 3397 */     this.fieldCCATRPRC.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRPRC()
/*      */   {
/* 3405 */     return this.fieldCCATRPRC.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRTIM(String newvalue)
/*      */   {
/* 3413 */     this.fieldCCATRTIM.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRTIM()
/*      */   {
/* 3421 */     return this.fieldCCATRTIM.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRTIM(BigDecimal newvalue)
/*      */   {
/* 3429 */     this.fieldCCATRTIM.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRTIM()
/*      */   {
/* 3437 */     return this.fieldCCATRTIM.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRDSC(String newvalue)
/*      */   {
/* 3445 */     this.fieldCCATRDSC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRDSC()
/*      */   {
/* 3453 */     return this.fieldCCATRDSC.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAMCR(String newvalue)
/*      */   {
/* 3461 */     this.fieldCCATRAMCR.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRAMCR()
/*      */   {
/* 3469 */     return this.fieldCCATRAMCR.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAMCR(BigDecimal newvalue)
/*      */   {
/* 3477 */     this.fieldCCATRAMCR.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRAMCR()
/*      */   {
/* 3485 */     return this.fieldCCATRAMCR.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRAMDB(String newvalue)
/*      */   {
/* 3493 */     this.fieldCCATRAMDB.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRAMDB()
/*      */   {
/* 3501 */     return this.fieldCCATRAMDB.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATRAMDB(BigDecimal newvalue)
/*      */   {
/* 3509 */     this.fieldCCATRAMDB.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCCATRAMDB()
/*      */   {
/* 3517 */     return this.fieldCCATRAMDB.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCCATRREF(String newvalue)
/*      */   {
/* 3525 */     this.fieldCCATRREF.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATRREF()
/*      */   {
/* 3533 */     return this.fieldCCATRREF.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATADD1(String newvalue)
/*      */   {
/* 3541 */     this.fieldCCATADD1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATADD1()
/*      */   {
/* 3549 */     return this.fieldCCATADD1.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATADD2(String newvalue)
/*      */   {
/* 3557 */     this.fieldCCATADD2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATADD2()
/*      */   {
/* 3565 */     return this.fieldCCATADD2.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATADD3(String newvalue)
/*      */   {
/* 3573 */     this.fieldCCATADD3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATADD3()
/*      */   {
/* 3581 */     return this.fieldCCATADD3.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATADD4(String newvalue)
/*      */   {
/* 3589 */     this.fieldCCATADD4.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATADD4()
/*      */   {
/* 3597 */     return this.fieldCCATADD4.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATADD5(String newvalue)
/*      */   {
/* 3605 */     this.fieldCCATADD5.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATADD5()
/*      */   {
/* 3613 */     return this.fieldCCATADD5.getString();
/*      */   }
/*      */ 
/*      */   public void setCCATREOF(String newvalue)
/*      */   {
/* 3621 */     this.fieldCCATREOF.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCCATREOF()
/*      */   {
/* 3629 */     return this.fieldCCATREOF.getString();
/*      */   }
/*      */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.CCARDTRJVMessage
 * JD-Core Version:    0.6.0
 */