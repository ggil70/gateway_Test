/*      */ package com.activo.gateway.dibs.messages;
/*      */ 
/*      */ import java.math.BigDecimal;
import java.util.Hashtable;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*      */ 
/*      */ public class ISD008001Message extends MessageRecord
/*      */ {
/*   20 */   static final String[] fldnames = { 
/*   21 */     "I01USER", 
/*   22 */     "I01OPRTYP", 
/*   23 */     "I01LGT", 
/*   24 */     "I01CUN", 
/*   25 */     "I01NA1", 
/*   26 */     "I01NA2", 
/*   27 */     "I01NA3", 
/*   28 */     "I01NA4", 
/*   29 */     "I01CTY", 
/*   30 */     "I01STE", 
/*   31 */     "I01CTR", 
/*   32 */     "I01POB", 
/*   33 */     "I01ZPC", 
/*   34 */     "I01MST", 
/*   35 */     "I01HPN", 
/*   36 */     "I01PHN", 
/*   37 */     "I01PH1", 
/*   38 */     "I01FAX", 
/*   39 */     "I01IAD", 
/*   40 */     "I01WBS", 
/*   41 */     "I01NSO", 
/*   42 */     "I01CP1", 
/*   43 */     "I01CP2", 
/*   44 */     "I01CP3", 
/*   45 */     "I01TIM", 
/*   46 */     "I11RTP", 
/*   47 */     "I0114MAN", 
/*   48 */     "I0124MAN", 
/*   49 */     "I0134MAN", 
/*   50 */     "I0144MAN", 
/*   51 */     "I0154MAN", 
/*   52 */     "I0164MAN", 
/*   53 */     "I0174MAN", 
/*   54 */     "I0184MAN", 
/*   55 */     "I0194MAN", 
/*   56 */     "I01A4MAN", 
/*   57 */     "I0114MA1", 
/*   58 */     "I0124MA1", 
/*   59 */     "I0134MA1", 
/*   60 */     "I0144MA1", 
/*   61 */     "I0154MA1", 
/*   62 */     "I0164MA1", 
/*   63 */     "I0174MA1", 
/*   64 */     "I0184MA1", 
/*   65 */     "I0194MA1", 
/*   66 */     "I01A4MA1", 
/*   67 */     "I0114MA2", 
/*   68 */     "I0124MA2", 
/*   69 */     "I0134MA2", 
/*   70 */     "I0144MA2", 
/*   71 */     "I0154MA2", 
/*   72 */     "I0164MA2", 
/*   73 */     "I0174MA2", 
/*   74 */     "I0184MA2", 
/*   75 */     "I0194MA2", 
/*   76 */     "I01A4MA2", 
/*   77 */     "I0114MA3", 
/*   78 */     "I0124MA3", 
/*   79 */     "I0134MA3", 
/*   80 */     "I0144MA3", 
/*   81 */     "I0154MA3", 
/*   82 */     "I0164MA3", 
/*   83 */     "I0174MA3", 
/*   84 */     "I0184MA3", 
/*   85 */     "I0194MA3", 
/*   86 */     "I01A4MA3", 
/*   87 */     "I0114MA4", 
/*   88 */     "I0124MA4", 
/*   89 */     "I0134MA4", 
/*   90 */     "I0144MA4", 
/*   91 */     "I0154MA4", 
/*   92 */     "I0164MA4", 
/*   93 */     "I0174MA4", 
/*   94 */     "I0184MA4", 
/*   95 */     "I0194MA4", 
/*   96 */     "I01A4MA4", 
/*   97 */     "I0114CTY", 
/*   98 */     "I0124CTY", 
/*   99 */     "I0134CTY", 
/*  100 */     "I0144CTY", 
/*  101 */     "I0154CTY", 
/*  102 */     "I0164CTY", 
/*  103 */     "I0174CTY", 
/*  104 */     "I0184CTY", 
/*  105 */     "I0194CTY", 
/*  106 */     "I01A4CTY", 
/*  107 */     "I0114STE", 
/*  108 */     "I0124STE", 
/*  109 */     "I0134STE", 
/*  110 */     "I0144STE", 
/*  111 */     "I0154STE", 
/*  112 */     "I0164STE", 
/*  113 */     "I0174STE", 
/*  114 */     "I0184STE", 
/*  115 */     "I0194STE", 
/*  116 */     "I01A4STE", 
/*  117 */     "I0114ZPC", 
/*  118 */     "I0124ZPC", 
/*  119 */     "I0134ZPC", 
/*  120 */     "I0144ZPC", 
/*  121 */     "I0154ZPC", 
/*  122 */     "I0164ZPC", 
/*  123 */     "I0174ZPC", 
/*  124 */     "I0184ZPC", 
/*  125 */     "I0194ZPC", 
/*  126 */     "I01A4ZPC", 
/*  127 */     "I0114POB", 
/*  128 */     "I0124POB", 
/*  129 */     "I0134POB", 
/*  130 */     "I0144POB", 
/*  131 */     "I0154POB", 
/*  132 */     "I0164POB", 
/*  133 */     "I0174POB", 
/*  134 */     "I0184POB", 
/*  135 */     "I0194POB", 
/*  136 */     "I01A4POB", 
/*  137 */     "I0114CTR", 
/*  138 */     "I0124CTR", 
/*  139 */     "I0134CTR", 
/*  140 */     "I0144CTR", 
/*  141 */     "I0154CTR", 
/*  142 */     "I0164CTR", 
/*  143 */     "I0174CTR", 
/*  144 */     "I0184CTR", 
/*  145 */     "I0194CTR", 
/*  146 */     "I01A4CTR" };
/*      */ 
/*  148 */   static final String[] tnames = { 
/*  149 */     "I01USER", 
/*  150 */     "I01OPRTYP", 
/*  151 */     "I01LGT", 
/*  152 */     "I01CUN", 
/*  153 */     "I01NA1", 
/*  154 */     "I01NA2", 
/*  155 */     "I01NA3", 
/*  156 */     "I01NA4", 
/*  157 */     "I01CTY", 
/*  158 */     "I01STE", 
/*  159 */     "I01CTR", 
/*  160 */     "I01POB", 
/*  161 */     "I01ZPC", 
/*  162 */     "I01MST", 
/*  163 */     "I01HPN", 
/*  164 */     "I01PHN", 
/*  165 */     "I01PH1", 
/*  166 */     "I01FAX", 
/*  167 */     "I01IAD", 
/*  168 */     "I01WBS", 
/*  169 */     "I01NSO", 
/*  170 */     "I01CP1", 
/*  171 */     "I01CP2", 
/*  172 */     "I01CP3", 
/*  173 */     "I01TIM", 
/*  174 */     "I11RTP", 
/*  175 */     "I0114MAN", 
/*  176 */     "I0124MAN", 
/*  177 */     "I0134MAN", 
/*  178 */     "I0144MAN", 
/*  179 */     "I0154MAN", 
/*  180 */     "I0164MAN", 
/*  181 */     "I0174MAN", 
/*  182 */     "I0184MAN", 
/*  183 */     "I0194MAN", 
/*  184 */     "I01A4MAN", 
/*  185 */     "I0114MA1", 
/*  186 */     "I0124MA1", 
/*  187 */     "I0134MA1", 
/*  188 */     "I0144MA1", 
/*  189 */     "I0154MA1", 
/*  190 */     "I0164MA1", 
/*  191 */     "I0174MA1", 
/*  192 */     "I0184MA1", 
/*  193 */     "I0194MA1", 
/*  194 */     "I01A4MA1", 
/*  195 */     "I0114MA2", 
/*  196 */     "I0124MA2", 
/*  197 */     "I0134MA2", 
/*  198 */     "I0144MA2", 
/*  199 */     "I0154MA2", 
/*  200 */     "I0164MA2", 
/*  201 */     "I0174MA2", 
/*  202 */     "I0184MA2", 
/*  203 */     "I0194MA2", 
/*  204 */     "I01A4MA2", 
/*  205 */     "I0114MA3", 
/*  206 */     "I0124MA3", 
/*  207 */     "I0134MA3", 
/*  208 */     "I0144MA3", 
/*  209 */     "I0154MA3", 
/*  210 */     "I0164MA3", 
/*  211 */     "I0174MA3", 
/*  212 */     "I0184MA3", 
/*  213 */     "I0194MA3", 
/*  214 */     "I01A4MA3", 
/*  215 */     "I0114MA4", 
/*  216 */     "I0124MA4", 
/*  217 */     "I0134MA4", 
/*  218 */     "I0144MA4", 
/*  219 */     "I0154MA4", 
/*  220 */     "I0164MA4", 
/*  221 */     "I0174MA4", 
/*  222 */     "I0184MA4", 
/*  223 */     "I0194MA4", 
/*  224 */     "I01A4MA4", 
/*  225 */     "I0114CTY", 
/*  226 */     "I0124CTY", 
/*  227 */     "I0134CTY", 
/*  228 */     "I0144CTY", 
/*  229 */     "I0154CTY", 
/*  230 */     "I0164CTY", 
/*  231 */     "I0174CTY", 
/*  232 */     "I0184CTY", 
/*  233 */     "I0194CTY", 
/*  234 */     "I01A4CTY", 
/*  235 */     "I0114STE", 
/*  236 */     "I0124STE", 
/*  237 */     "I0134STE", 
/*  238 */     "I0144STE", 
/*  239 */     "I0154STE", 
/*  240 */     "I0164STE", 
/*  241 */     "I0174STE", 
/*  242 */     "I0184STE", 
/*  243 */     "I0194STE", 
/*  244 */     "I01A4STE", 
/*  245 */     "I0114ZPC", 
/*  246 */     "I0124ZPC", 
/*  247 */     "I0134ZPC", 
/*  248 */     "I0144ZPC", 
/*  249 */     "I0154ZPC", 
/*  250 */     "I0164ZPC", 
/*  251 */     "I0174ZPC", 
/*  252 */     "I0184ZPC", 
/*  253 */     "I0194ZPC", 
/*  254 */     "I01A4ZPC", 
/*  255 */     "I0114POB", 
/*  256 */     "I0124POB", 
/*  257 */     "I0134POB", 
/*  258 */     "I0144POB", 
/*  259 */     "I0154POB", 
/*  260 */     "I0164POB", 
/*  261 */     "I0174POB", 
/*  262 */     "I0184POB", 
/*  263 */     "I0194POB", 
/*  264 */     "I01A4POB", 
/*  265 */     "I0114CTR", 
/*  266 */     "I0124CTR", 
/*  267 */     "I0134CTR", 
/*  268 */     "I0144CTR", 
/*  269 */     "I0154CTR", 
/*  270 */     "I0164CTR", 
/*  271 */     "I0174CTR", 
/*  272 */     "I0184CTR", 
/*  273 */     "I0194CTR", 
/*  274 */     "I01A4CTR" };
/*      */   static final String fid = "1050801183357";
/*      */   static final String rid = "3C39F11150D24";
/*      */   static final String fmtname = "ISD008001";
/*  279 */   final int FIELDCOUNT = 126;
/*  280 */   private static Hashtable tlookup = new Hashtable();
/*  281 */   private CharacterField fieldI01USER = null;
/*  282 */   private CharacterField fieldI01OPRTYP = null;
/*  283 */   private CharacterField fieldI01LGT = null;
/*  284 */   private DecimalField fieldI01CUN = null;
/*  285 */   private CharacterField fieldI01NA1 = null;
/*  286 */   private CharacterField fieldI01NA2 = null;
/*  287 */   private CharacterField fieldI01NA3 = null;
/*  288 */   private CharacterField fieldI01NA4 = null;
/*  289 */   private CharacterField fieldI01CTY = null;
/*  290 */   private CharacterField fieldI01STE = null;
/*  291 */   private CharacterField fieldI01CTR = null;
/*  292 */   private CharacterField fieldI01POB = null;
/*  293 */   private CharacterField fieldI01ZPC = null;
/*  294 */   private CharacterField fieldI01MST = null;
/*  295 */   private DecimalField fieldI01HPN = null;
/*  296 */   private DecimalField fieldI01PHN = null;
/*  297 */   private DecimalField fieldI01PH1 = null;
/*  298 */   private DecimalField fieldI01FAX = null;
/*  299 */   private CharacterField fieldI01IAD = null;
/*  300 */   private CharacterField fieldI01WBS = null;
/*  301 */   private DecimalField fieldI01NSO = null;
/*  302 */   private CharacterField fieldI01CP1 = null;
/*  303 */   private CharacterField fieldI01CP2 = null;
/*  304 */   private CharacterField fieldI01CP3 = null;
/*  305 */   private DecimalField fieldI01TIM = null;
/*  306 */   private CharacterField fieldI11RTP = null;
/*  307 */   private CharacterField fieldI0114MAN = null;
/*  308 */   private CharacterField fieldI0124MAN = null;
/*  309 */   private CharacterField fieldI0134MAN = null;
/*  310 */   private CharacterField fieldI0144MAN = null;
/*  311 */   private CharacterField fieldI0154MAN = null;
/*  312 */   private CharacterField fieldI0164MAN = null;
/*  313 */   private CharacterField fieldI0174MAN = null;
/*  314 */   private CharacterField fieldI0184MAN = null;
/*  315 */   private CharacterField fieldI0194MAN = null;
/*  316 */   private CharacterField fieldI01A4MAN = null;
/*  317 */   private CharacterField fieldI0114MA1 = null;
/*  318 */   private CharacterField fieldI0124MA1 = null;
/*  319 */   private CharacterField fieldI0134MA1 = null;
/*  320 */   private CharacterField fieldI0144MA1 = null;
/*  321 */   private CharacterField fieldI0154MA1 = null;
/*  322 */   private CharacterField fieldI0164MA1 = null;
/*  323 */   private CharacterField fieldI0174MA1 = null;
/*  324 */   private CharacterField fieldI0184MA1 = null;
/*  325 */   private CharacterField fieldI0194MA1 = null;
/*  326 */   private CharacterField fieldI01A4MA1 = null;
/*  327 */   private CharacterField fieldI0114MA2 = null;
/*  328 */   private CharacterField fieldI0124MA2 = null;
/*  329 */   private CharacterField fieldI0134MA2 = null;
/*  330 */   private CharacterField fieldI0144MA2 = null;
/*  331 */   private CharacterField fieldI0154MA2 = null;
/*  332 */   private CharacterField fieldI0164MA2 = null;
/*  333 */   private CharacterField fieldI0174MA2 = null;
/*  334 */   private CharacterField fieldI0184MA2 = null;
/*  335 */   private CharacterField fieldI0194MA2 = null;
/*  336 */   private CharacterField fieldI01A4MA2 = null;
/*  337 */   private CharacterField fieldI0114MA3 = null;
/*  338 */   private CharacterField fieldI0124MA3 = null;
/*  339 */   private CharacterField fieldI0134MA3 = null;
/*  340 */   private CharacterField fieldI0144MA3 = null;
/*  341 */   private CharacterField fieldI0154MA3 = null;
/*  342 */   private CharacterField fieldI0164MA3 = null;
/*  343 */   private CharacterField fieldI0174MA3 = null;
/*  344 */   private CharacterField fieldI0184MA3 = null;
/*  345 */   private CharacterField fieldI0194MA3 = null;
/*  346 */   private CharacterField fieldI01A4MA3 = null;
/*  347 */   private CharacterField fieldI0114MA4 = null;
/*  348 */   private CharacterField fieldI0124MA4 = null;
/*  349 */   private CharacterField fieldI0134MA4 = null;
/*  350 */   private CharacterField fieldI0144MA4 = null;
/*  351 */   private CharacterField fieldI0154MA4 = null;
/*  352 */   private CharacterField fieldI0164MA4 = null;
/*  353 */   private CharacterField fieldI0174MA4 = null;
/*  354 */   private CharacterField fieldI0184MA4 = null;
/*  355 */   private CharacterField fieldI0194MA4 = null;
/*  356 */   private CharacterField fieldI01A4MA4 = null;
/*  357 */   private CharacterField fieldI0114CTY = null;
/*  358 */   private CharacterField fieldI0124CTY = null;
/*  359 */   private CharacterField fieldI0134CTY = null;
/*  360 */   private CharacterField fieldI0144CTY = null;
/*  361 */   private CharacterField fieldI0154CTY = null;
/*  362 */   private CharacterField fieldI0164CTY = null;
/*  363 */   private CharacterField fieldI0174CTY = null;
/*  364 */   private CharacterField fieldI0184CTY = null;
/*  365 */   private CharacterField fieldI0194CTY = null;
/*  366 */   private CharacterField fieldI01A4CTY = null;
/*  367 */   private CharacterField fieldI0114STE = null;
/*  368 */   private CharacterField fieldI0124STE = null;
/*  369 */   private CharacterField fieldI0134STE = null;
/*  370 */   private CharacterField fieldI0144STE = null;
/*  371 */   private CharacterField fieldI0154STE = null;
/*  372 */   private CharacterField fieldI0164STE = null;
/*  373 */   private CharacterField fieldI0174STE = null;
/*  374 */   private CharacterField fieldI0184STE = null;
/*  375 */   private CharacterField fieldI0194STE = null;
/*  376 */   private CharacterField fieldI01A4STE = null;
/*  377 */   private CharacterField fieldI0114ZPC = null;
/*  378 */   private CharacterField fieldI0124ZPC = null;
/*  379 */   private CharacterField fieldI0134ZPC = null;
/*  380 */   private CharacterField fieldI0144ZPC = null;
/*  381 */   private CharacterField fieldI0154ZPC = null;
/*  382 */   private CharacterField fieldI0164ZPC = null;
/*  383 */   private CharacterField fieldI0174ZPC = null;
/*  384 */   private CharacterField fieldI0184ZPC = null;
/*  385 */   private CharacterField fieldI0194ZPC = null;
/*  386 */   private CharacterField fieldI01A4ZPC = null;
/*  387 */   private CharacterField fieldI0114POB = null;
/*  388 */   private CharacterField fieldI0124POB = null;
/*  389 */   private CharacterField fieldI0134POB = null;
/*  390 */   private CharacterField fieldI0144POB = null;
/*  391 */   private CharacterField fieldI0154POB = null;
/*  392 */   private CharacterField fieldI0164POB = null;
/*  393 */   private CharacterField fieldI0174POB = null;
/*  394 */   private CharacterField fieldI0184POB = null;
/*  395 */   private CharacterField fieldI0194POB = null;
/*  396 */   private CharacterField fieldI01A4POB = null;
/*  397 */   private CharacterField fieldI0114CTR = null;
/*  398 */   private CharacterField fieldI0124CTR = null;
/*  399 */   private CharacterField fieldI0134CTR = null;
/*  400 */   private CharacterField fieldI0144CTR = null;
/*  401 */   private CharacterField fieldI0154CTR = null;
/*  402 */   private CharacterField fieldI0164CTR = null;
/*  403 */   private CharacterField fieldI0174CTR = null;
/*  404 */   private CharacterField fieldI0184CTR = null;
/*  405 */   private CharacterField fieldI0194CTR = null;
/*  406 */   private CharacterField fieldI01A4CTR = null;
/*      */ 
/*      */   public ISD008001Message()
/*      */   {
/*  413 */     createFields();
/*  414 */     initialize();
/*      */   }
/*      */ 
/*      */   protected void createFields()
/*      */   {
/*  423 */     this.recordsize = 2772;
/*  424 */     this.fileid = "1050801183357";
/*  425 */     this.recordid = "3C39F11150D24";
/*  426 */     this.message = new byte[getByteLength()];
/*  427 */     this.formatname = "ISD008001";
/*  428 */     this.fieldnames = fldnames;
/*  429 */     this.tagnames = tnames;
/*  430 */     this.fields = new MessageField[126];
/*      */      this.fields[0]=this.fieldI01USER=new CharacterField(this.message, 10, 10, "I01USER");
/*      */      this.fields[1]=this.fieldI01OPRTYP=new CharacterField(this.message, 20, 1, "I01OPRTYP");
/*      */      this.fields[2]=this.fieldI01LGT=new CharacterField(this.message, 21, 1, "I01LGT");
/*      */      this.fields[3]=this.fieldI01CUN=new DecimalField(this.message, 22, 10, 0, "I01CUN");
/*      */      this.fields[4]=this.fieldI01NA1=new CharacterField(this.message, 32, 45, "I01NA1");
/*      */      this.fields[5]=this.fieldI01NA2=new CharacterField(this.message, 77, 35, "I01NA2");
/*      */      this.fields[6]=this.fieldI01NA3=new CharacterField(this.message, 112, 35, "I01NA3");
/*      */      this.fields[7]=this.fieldI01NA4=new CharacterField(this.message, 147, 35, "I01NA4");
/*      */      this.fields[8]=this.fieldI01CTY=new CharacterField(this.message, 182, 30, "I01CTY");
/*      */      this.fields[9]=this.fieldI01STE=new CharacterField(this.message, 212, 4, "I01STE");
/*      */      this.fields[10]=this.fieldI01CTR=new CharacterField(this.message, 216, 20, "I01CTR");
/*      */      this.fields[11]=this.fieldI01POB=new CharacterField(this.message, 236, 10, "I01POB");
/*      */      this.fields[12]=this.fieldI01ZPC=new CharacterField(this.message, 246, 15, "I01ZPC");
/*      */      this.fields[13]=this.fieldI01MST=new CharacterField(this.message, 261, 1, "I01MST");
/*      */      this.fields[14]=this.fieldI01HPN=new DecimalField(this.message, 262, 12, 0, "I01HPN");
/*      */      this.fields[15]=this.fieldI01PHN=new DecimalField(this.message, 274, 12, 0, "I01PHN");
/*      */      this.fields[16]=this.fieldI01PH1=new DecimalField(this.message, 286, 12, 0, "I01PH1");
/*      */      this.fields[17]=this.fieldI01FAX=new DecimalField(this.message, 298, 12, 0, "I01FAX");
/*      */      this.fields[18]=this.fieldI01IAD=new CharacterField(this.message, 310, 40, "I01IAD");
/*      */      this.fields[19]=this.fieldI01WBS=new CharacterField(this.message, 350, 40, "I01WBS");
/*      */      this.fields[20]=this.fieldI01NSO=new DecimalField(this.message, 390, 3, 0, "I01NSO");
/*      */      this.fields[21]=this.fieldI01CP1=new CharacterField(this.message, 393, 30, "I01CP1");
/*      */      this.fields[22]=this.fieldI01CP2=new CharacterField(this.message, 423, 30, "I01CP2");
/*      */      this.fields[23]=this.fieldI01CP3=new CharacterField(this.message, 453, 15, "I01CP3");
/*      */      this.fields[24]=this.fieldI01TIM=new DecimalField(this.message, 468, 3, 0, "I01TIM");
/*      */      this.fields[25]=this.fieldI11RTP=new CharacterField(this.message, 471, 1, "I11RTP");
/*      */      this.fields[26]=this.fieldI0114MAN=new CharacterField(this.message, 472, 2, "I0114MAN");
/*      */      this.fields[27]=this.fieldI0124MAN=new CharacterField(this.message, 474, 2, "I0124MAN");
/*      */      this.fields[28]=this.fieldI0134MAN=new CharacterField(this.message, 476, 2, "I0134MAN");
/*      */      this.fields[29]=this.fieldI0144MAN=new CharacterField(this.message, 478, 2, "I0144MAN");
/*      */      this.fields[30]=this.fieldI0154MAN=new CharacterField(this.message, 480, 2, "I0154MAN");
/*      */      this.fields[31]=this.fieldI0164MAN=new CharacterField(this.message, 482, 2, "I0164MAN");
/*      */      this.fields[32]=this.fieldI0174MAN=new CharacterField(this.message, 484, 2, "I0174MAN");
/*      */      this.fields[33]=this.fieldI0184MAN=new CharacterField(this.message, 486, 2, "I0184MAN");
/*      */      this.fields[34]=this.fieldI0194MAN=new CharacterField(this.message, 488, 2, "I0194MAN");
/*      */      this.fields[35]=this.fieldI01A4MAN=new CharacterField(this.message, 490, 2, "I01A4MAN");
/*      */      this.fields[36]=this.fieldI0114MA1=new CharacterField(this.message, 492, 45, "I0114MA1");
/*      */      this.fields[37]=this.fieldI0124MA1=new CharacterField(this.message, 537, 45, "I0124MA1");
/*      */      this.fields[38]=this.fieldI0134MA1=new CharacterField(this.message, 582, 45, "I0134MA1");
/*      */      this.fields[39]=this.fieldI0144MA1=new CharacterField(this.message, 627, 45, "I0144MA1");
/*      */      this.fields[40]=this.fieldI0154MA1=new CharacterField(this.message, 672, 45, "I0154MA1");
/*      */      this.fields[41]=this.fieldI0164MA1=new CharacterField(this.message, 717, 45, "I0164MA1");
/*      */      this.fields[42]=this.fieldI0174MA1=new CharacterField(this.message, 762, 45, "I0174MA1");
/*      */      this.fields[43]=this.fieldI0184MA1=new CharacterField(this.message, 807, 45, "I0184MA1");
/*      */      this.fields[44]=this.fieldI0194MA1=new CharacterField(this.message, 852, 45, "I0194MA1");
/*      */      this.fields[45]=this.fieldI01A4MA1=new CharacterField(this.message, 897, 45, "I01A4MA1");
/*      */      this.fields[46]=this.fieldI0114MA2=new CharacterField(this.message, 942, 35, "I0114MA2");
/*      */      this.fields[47]=this.fieldI0124MA2=new CharacterField(this.message, 977, 35, "I0124MA2");
/*      */      this.fields[48]=this.fieldI0134MA2=new CharacterField(this.message, 1012, 35, "I0134MA2");
/*      */      this.fields[49]=this.fieldI0144MA2=new CharacterField(this.message, 1047, 35, "I0144MA2");
/*      */      this.fields[50]=this.fieldI0154MA2=new CharacterField(this.message, 1082, 35, "I0154MA2");
/*      */      this.fields[51]=this.fieldI0164MA2=new CharacterField(this.message, 1117, 35, "I0164MA2");
/*      */      this.fields[52]=this.fieldI0174MA2=new CharacterField(this.message, 1152, 35, "I0174MA2");
/*      */      this.fields[53]=this.fieldI0184MA2=new CharacterField(this.message, 1187, 35, "I0184MA2");
/*      */      this.fields[54]=this.fieldI0194MA2=new CharacterField(this.message, 1222, 35, "I0194MA2");
/*      */      this.fields[55]=this.fieldI01A4MA2=new CharacterField(this.message, 1257, 35, "I01A4MA2");
/*      */      this.fields[56]=this.fieldI0114MA3=new CharacterField(this.message, 1292, 35, "I0114MA3");
/*      */      this.fields[57]=this.fieldI0124MA3=new CharacterField(this.message, 1327, 35, "I0124MA3");
/*      */      this.fields[58]=this.fieldI0134MA3=new CharacterField(this.message, 1362, 35, "I0134MA3");
/*      */      this.fields[59]=this.fieldI0144MA3=new CharacterField(this.message, 1397, 35, "I0144MA3");
/*      */      this.fields[60]=this.fieldI0154MA3=new CharacterField(this.message, 1432, 35, "I0154MA3");
/*      */      this.fields[61]=this.fieldI0164MA3=new CharacterField(this.message, 1467, 35, "I0164MA3");
/*      */      this.fields[62]=this.fieldI0174MA3=new CharacterField(this.message, 1502, 35, "I0174MA3");
/*      */      this.fields[63]=this.fieldI0184MA3=new CharacterField(this.message, 1537, 35, "I0184MA3");
/*      */      this.fields[64]=this.fieldI0194MA3=new CharacterField(this.message, 1572, 35, "I0194MA3");
/*      */      this.fields[65]=this.fieldI01A4MA3=new CharacterField(this.message, 1607, 35, "I01A4MA3");
/*      */      this.fields[66]=this.fieldI0114MA4=new CharacterField(this.message, 1642, 35, "I0114MA4");
/*      */      this.fields[67]=this.fieldI0124MA4=new CharacterField(this.message, 1677, 35, "I0124MA4");
/*      */      this.fields[68]=this.fieldI0134MA4=new CharacterField(this.message, 1712, 35, "I0134MA4");
/*      */      this.fields[69]=this.fieldI0144MA4=new CharacterField(this.message, 1747, 35, "I0144MA4");
/*      */      this.fields[70]=this.fieldI0154MA4=new CharacterField(this.message, 1782, 35, "I0154MA4");
/*      */      this.fields[71]=this.fieldI0164MA4=new CharacterField(this.message, 1817, 35, "I0164MA4");
/*      */      this.fields[72]=this.fieldI0174MA4=new CharacterField(this.message, 1852, 35, "I0174MA4");
/*      */      this.fields[73]=this.fieldI0184MA4=new CharacterField(this.message, 1887, 35, "I0184MA4");
/*      */      this.fields[74]=this.fieldI0194MA4=new CharacterField(this.message, 1922, 35, "I0194MA4");
/*      */      this.fields[75]=this.fieldI01A4MA4=new CharacterField(this.message, 1957, 35, "I01A4MA4");
/*      */      this.fields[76]=this.fieldI0114CTY=new CharacterField(this.message, 1992, 30, "I0114CTY");
/*      */      this.fields[77]=this.fieldI0124CTY=new CharacterField(this.message, 2022, 30, "I0124CTY");
/*      */      this.fields[78]=this.fieldI0134CTY=new CharacterField(this.message, 2052, 30, "I0134CTY");
/*      */      this.fields[79]=this.fieldI0144CTY=new CharacterField(this.message, 2082, 30, "I0144CTY");
/*      */      this.fields[80]=this.fieldI0154CTY=new CharacterField(this.message, 2112, 30, "I0154CTY");
/*      */      this.fields[81]=this.fieldI0164CTY=new CharacterField(this.message, 2142, 30, "I0164CTY");
/*      */      this.fields[82]=this.fieldI0174CTY=new CharacterField(this.message, 2172, 30, "I0174CTY");
/*      */      this.fields[83]=this.fieldI0184CTY=new CharacterField(this.message, 2202, 30, "I0184CTY");
/*      */      this.fields[84]=this.fieldI0194CTY=new CharacterField(this.message, 2232, 30, "I0194CTY");
/*      */      this.fields[85]=this.fieldI01A4CTY=new CharacterField(this.message, 2262, 30, "I01A4CTY");
/*      */      this.fields[86]=this.fieldI0114STE=new CharacterField(this.message, 2292, 4, "I0114STE");
/*      */      this.fields[87]=this.fieldI0124STE=new CharacterField(this.message, 2296, 4, "I0124STE");
/*      */      this.fields[88]=this.fieldI0134STE=new CharacterField(this.message, 2300, 4, "I0134STE");
/*      */      this.fields[89]=this.fieldI0144STE=new CharacterField(this.message, 2304, 4, "I0144STE");
/*      */      this.fields[90]=this.fieldI0154STE=new CharacterField(this.message, 2308, 4, "I0154STE");
/*      */      this.fields[91]=this.fieldI0164STE=new CharacterField(this.message, 2312, 4, "I0164STE");
/*      */      this.fields[92]=this.fieldI0174STE=new CharacterField(this.message, 2316, 4, "I0174STE");
/*      */      this.fields[93]=this.fieldI0184STE=new CharacterField(this.message, 2320, 4, "I0184STE");
/*      */      this.fields[94]=this.fieldI0194STE=new CharacterField(this.message, 2324, 4, "I0194STE");
/*      */      this.fields[95]=this.fieldI01A4STE=new CharacterField(this.message, 2328, 4, "I01A4STE");
/*      */      this.fields[96]=this.fieldI0114ZPC=new CharacterField(this.message, 2332, 15, "I0114ZPC");
/*      */      this.fields[97]=this.fieldI0124ZPC=new CharacterField(this.message, 2347, 15, "I0124ZPC");
/*      */      this.fields[98]=this.fieldI0134ZPC=new CharacterField(this.message, 2362, 15, "I0134ZPC");
/*      */      this.fields[99]=this.fieldI0144ZPC=new CharacterField(this.message, 2377, 15, "I0144ZPC");
/*      */      this.fields[100]=this.fieldI0154ZPC=new CharacterField(this.message, 2392, 15, "I0154ZPC");
/*      */      this.fields[101]=this.fieldI0164ZPC=new CharacterField(this.message, 2407, 15, "I0164ZPC");
/*      */      this.fields[102]=this.fieldI0174ZPC=new CharacterField(this.message, 2422, 15, "I0174ZPC");
/*      */      this.fields[103]=this.fieldI0184ZPC=new CharacterField(this.message, 2437, 15, "I0184ZPC");
/*      */      this.fields[104]=this.fieldI0194ZPC=new CharacterField(this.message, 2452, 15, "I0194ZPC");
/*      */      this.fields[105]=this.fieldI01A4ZPC=new CharacterField(this.message, 2467, 15, "I01A4ZPC");
/*      */      this.fields[106]=this.fieldI0114POB=new CharacterField(this.message, 2482, 10, "I0114POB");
/*      */      this.fields[107]=this.fieldI0124POB=new CharacterField(this.message, 2492, 10, "I0124POB");
/*      */      this.fields[108]=this.fieldI0134POB=new CharacterField(this.message, 2502, 10, "I0134POB");
/*      */      this.fields[109]=this.fieldI0144POB=new CharacterField(this.message, 2512, 10, "I0144POB");
/*      */      this.fields[110]=this.fieldI0154POB=new CharacterField(this.message, 2522, 10, "I0154POB");
/*      */      this.fields[111]=this.fieldI0164POB=new CharacterField(this.message, 2532, 10, "I0164POB");
/*      */      this.fields[112]=this.fieldI0174POB=new CharacterField(this.message, 2542, 10, "I0174POB");
/*      */      this.fields[113]=this.fieldI0184POB=new CharacterField(this.message, 2552, 10, "I0184POB");
/*      */      this.fields[114]=this.fieldI0194POB=new CharacterField(this.message, 2562, 10, "I0194POB");
/*      */      this.fields[115]=this.fieldI01A4POB=new CharacterField(this.message, 2572, 10, "I01A4POB");
/*      */      this.fields[116]=this.fieldI0114CTR=new CharacterField(this.message, 2582, 20, "I0114CTR");
/*      */      this.fields[117]=this.fieldI0124CTR=new CharacterField(this.message, 2602, 20, "I0124CTR");
/*      */      this.fields[118]=this.fieldI0134CTR=new CharacterField(this.message, 2622, 20, "I0134CTR");
/*      */      this.fields[119]=this.fieldI0144CTR=new CharacterField(this.message, 2642, 20, "I0144CTR");
/*      */      this.fields[120]=this.fieldI0154CTR=new CharacterField(this.message, 2662, 20, "I0154CTR");
/*      */      this.fields[121]=this.fieldI0164CTR=new CharacterField(this.message, 2682, 20, "I0164CTR");
/*      */      this.fields[122]=this.fieldI0174CTR=new CharacterField(this.message, 2702, 20, "I0174CTR");
/*      */      this.fields[123]=this.fieldI0184CTR=new CharacterField(this.message, 2722, 20, "I0184CTR");
/*      */      this.fields[124]=this.fieldI0194CTR=new CharacterField(this.message, 2742, 20, "I0194CTR");
/*      */      this.fields[125]=this.fieldI01A4CTR=new CharacterField(this.message, 2762, 20, "I01A4CTR");
/*      */ 
/*  685 */     synchronized (tlookup)
/*      */     {
/*  687 */       if (tlookup.isEmpty())
/*      */       {
/*  689 */         for (int i = 0; i < tnames.length; i++) {
/*  690 */           tlookup.put(tnames[i], new Integer(i));
/*      */         }
/*      */       }
/*      */     }
/*  694 */     this.taglookup = tlookup;
/*      */   }
/*      */ 
/*      */   public void setI01USER(String newvalue)
/*      */   {
/*  702 */     this.fieldI01USER.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01USER()
/*      */   {
/*  710 */     return this.fieldI01USER.getString();
/*      */   }
/*      */ 
/*      */   public void setI01OPRTYP(String newvalue)
/*      */   {
/*  718 */     this.fieldI01OPRTYP.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01OPRTYP()
/*      */   {
/*  726 */     return this.fieldI01OPRTYP.getString();
/*      */   }
/*      */ 
/*      */   public void setI01LGT(String newvalue)
/*      */   {
/*  734 */     this.fieldI01LGT.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01LGT()
/*      */   {
/*  742 */     return this.fieldI01LGT.getString();
/*      */   }
/*      */ 
/*      */   public void setI01CUN(String newvalue)
/*      */   {
/*  750 */     this.fieldI01CUN.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01CUN()
/*      */   {
/*  758 */     return this.fieldI01CUN.getString();
/*      */   }
/*      */ 
/*      */   public void setI01CUN(BigDecimal newvalue)
/*      */   {
/*  766 */     this.fieldI01CUN.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalI01CUN()
/*      */   {
/*  774 */     return this.fieldI01CUN.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setI01NA1(String newvalue)
/*      */   {
/*  782 */     this.fieldI01NA1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01NA1()
/*      */   {
/*  790 */     return this.fieldI01NA1.getString();
/*      */   }
/*      */ 
/*      */   public void setI01NA2(String newvalue)
/*      */   {
/*  798 */     this.fieldI01NA2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01NA2()
/*      */   {
/*  806 */     return this.fieldI01NA2.getString();
/*      */   }
/*      */ 
/*      */   public void setI01NA3(String newvalue)
/*      */   {
/*  814 */     this.fieldI01NA3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01NA3()
/*      */   {
/*  822 */     return this.fieldI01NA3.getString();
/*      */   }
/*      */ 
/*      */   public void setI01NA4(String newvalue)
/*      */   {
/*  830 */     this.fieldI01NA4.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01NA4()
/*      */   {
/*  838 */     return this.fieldI01NA4.getString();
/*      */   }
/*      */ 
/*      */   public void setI01CTY(String newvalue)
/*      */   {
/*  846 */     this.fieldI01CTY.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01CTY()
/*      */   {
/*  854 */     return this.fieldI01CTY.getString();
/*      */   }
/*      */ 
/*      */   public void setI01STE(String newvalue)
/*      */   {
/*  862 */     this.fieldI01STE.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01STE()
/*      */   {
/*  870 */     return this.fieldI01STE.getString();
/*      */   }
/*      */ 
/*      */   public void setI01CTR(String newvalue)
/*      */   {
/*  878 */     this.fieldI01CTR.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01CTR()
/*      */   {
/*  886 */     return this.fieldI01CTR.getString();
/*      */   }
/*      */ 
/*      */   public void setI01POB(String newvalue)
/*      */   {
/*  894 */     this.fieldI01POB.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01POB()
/*      */   {
/*  902 */     return this.fieldI01POB.getString();
/*      */   }
/*      */ 
/*      */   public void setI01ZPC(String newvalue)
/*      */   {
/*  910 */     this.fieldI01ZPC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01ZPC()
/*      */   {
/*  918 */     return this.fieldI01ZPC.getString();
/*      */   }
/*      */ 
/*      */   public void setI01MST(String newvalue)
/*      */   {
/*  926 */     this.fieldI01MST.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01MST()
/*      */   {
/*  934 */     return this.fieldI01MST.getString();
/*      */   }
/*      */ 
/*      */   public void setI01HPN(String newvalue)
/*      */   {
/*  942 */     this.fieldI01HPN.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01HPN()
/*      */   {
/*  950 */     return this.fieldI01HPN.getString();
/*      */   }
/*      */ 
/*      */   public void setI01HPN(BigDecimal newvalue)
/*      */   {
/*  958 */     this.fieldI01HPN.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalI01HPN()
/*      */   {
/*  966 */     return this.fieldI01HPN.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setI01PHN(String newvalue)
/*      */   {
/*  974 */     this.fieldI01PHN.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01PHN()
/*      */   {
/*  982 */     return this.fieldI01PHN.getString();
/*      */   }
/*      */ 
/*      */   public void setI01PHN(BigDecimal newvalue)
/*      */   {
/*  990 */     this.fieldI01PHN.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalI01PHN()
/*      */   {
/*  998 */     return this.fieldI01PHN.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setI01PH1(String newvalue)
/*      */   {
/* 1006 */     this.fieldI01PH1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01PH1()
/*      */   {
/* 1014 */     return this.fieldI01PH1.getString();
/*      */   }
/*      */ 
/*      */   public void setI01PH1(BigDecimal newvalue)
/*      */   {
/* 1022 */     this.fieldI01PH1.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalI01PH1()
/*      */   {
/* 1030 */     return this.fieldI01PH1.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setI01FAX(String newvalue)
/*      */   {
/* 1038 */     this.fieldI01FAX.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01FAX()
/*      */   {
/* 1046 */     return this.fieldI01FAX.getString();
/*      */   }
/*      */ 
/*      */   public void setI01FAX(BigDecimal newvalue)
/*      */   {
/* 1054 */     this.fieldI01FAX.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalI01FAX()
/*      */   {
/* 1062 */     return this.fieldI01FAX.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setI01IAD(String newvalue)
/*      */   {
/* 1070 */     this.fieldI01IAD.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01IAD()
/*      */   {
/* 1078 */     return this.fieldI01IAD.getString();
/*      */   }
/*      */ 
/*      */   public void setI01WBS(String newvalue)
/*      */   {
/* 1086 */     this.fieldI01WBS.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01WBS()
/*      */   {
/* 1094 */     return this.fieldI01WBS.getString();
/*      */   }
/*      */ 
/*      */   public void setI01NSO(String newvalue)
/*      */   {
/* 1102 */     this.fieldI01NSO.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01NSO()
/*      */   {
/* 1110 */     return this.fieldI01NSO.getString();
/*      */   }
/*      */ 
/*      */   public void setI01NSO(BigDecimal newvalue)
/*      */   {
/* 1118 */     this.fieldI01NSO.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalI01NSO()
/*      */   {
/* 1126 */     return this.fieldI01NSO.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setI01CP1(String newvalue)
/*      */   {
/* 1134 */     this.fieldI01CP1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01CP1()
/*      */   {
/* 1142 */     return this.fieldI01CP1.getString();
/*      */   }
/*      */ 
/*      */   public void setI01CP2(String newvalue)
/*      */   {
/* 1150 */     this.fieldI01CP2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01CP2()
/*      */   {
/* 1158 */     return this.fieldI01CP2.getString();
/*      */   }
/*      */ 
/*      */   public void setI01CP3(String newvalue)
/*      */   {
/* 1166 */     this.fieldI01CP3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01CP3()
/*      */   {
/* 1174 */     return this.fieldI01CP3.getString();
/*      */   }
/*      */ 
/*      */   public void setI01TIM(String newvalue)
/*      */   {
/* 1182 */     this.fieldI01TIM.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01TIM()
/*      */   {
/* 1190 */     return this.fieldI01TIM.getString();
/*      */   }
/*      */ 
/*      */   public void setI01TIM(BigDecimal newvalue)
/*      */   {
/* 1198 */     this.fieldI01TIM.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalI01TIM()
/*      */   {
/* 1206 */     return this.fieldI01TIM.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setI11RTP(String newvalue)
/*      */   {
/* 1214 */     this.fieldI11RTP.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI11RTP()
/*      */   {
/* 1222 */     return this.fieldI11RTP.getString();
/*      */   }
/*      */ 
/*      */   public void setI0114MAN(String newvalue)
/*      */   {
/* 1230 */     this.fieldI0114MAN.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0114MAN()
/*      */   {
/* 1238 */     return this.fieldI0114MAN.getString();
/*      */   }
/*      */ 
/*      */   public void setI0124MAN(String newvalue)
/*      */   {
/* 1246 */     this.fieldI0124MAN.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0124MAN()
/*      */   {
/* 1254 */     return this.fieldI0124MAN.getString();
/*      */   }
/*      */ 
/*      */   public void setI0134MAN(String newvalue)
/*      */   {
/* 1262 */     this.fieldI0134MAN.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0134MAN()
/*      */   {
/* 1270 */     return this.fieldI0134MAN.getString();
/*      */   }
/*      */ 
/*      */   public void setI0144MAN(String newvalue)
/*      */   {
/* 1278 */     this.fieldI0144MAN.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0144MAN()
/*      */   {
/* 1286 */     return this.fieldI0144MAN.getString();
/*      */   }
/*      */ 
/*      */   public void setI0154MAN(String newvalue)
/*      */   {
/* 1294 */     this.fieldI0154MAN.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0154MAN()
/*      */   {
/* 1302 */     return this.fieldI0154MAN.getString();
/*      */   }
/*      */ 
/*      */   public void setI0164MAN(String newvalue)
/*      */   {
/* 1310 */     this.fieldI0164MAN.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0164MAN()
/*      */   {
/* 1318 */     return this.fieldI0164MAN.getString();
/*      */   }
/*      */ 
/*      */   public void setI0174MAN(String newvalue)
/*      */   {
/* 1326 */     this.fieldI0174MAN.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0174MAN()
/*      */   {
/* 1334 */     return this.fieldI0174MAN.getString();
/*      */   }
/*      */ 
/*      */   public void setI0184MAN(String newvalue)
/*      */   {
/* 1342 */     this.fieldI0184MAN.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0184MAN()
/*      */   {
/* 1350 */     return this.fieldI0184MAN.getString();
/*      */   }
/*      */ 
/*      */   public void setI0194MAN(String newvalue)
/*      */   {
/* 1358 */     this.fieldI0194MAN.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0194MAN()
/*      */   {
/* 1366 */     return this.fieldI0194MAN.getString();
/*      */   }
/*      */ 
/*      */   public void setI01A4MAN(String newvalue)
/*      */   {
/* 1374 */     this.fieldI01A4MAN.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01A4MAN()
/*      */   {
/* 1382 */     return this.fieldI01A4MAN.getString();
/*      */   }
/*      */ 
/*      */   public void setI0114MA1(String newvalue)
/*      */   {
/* 1390 */     this.fieldI0114MA1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0114MA1()
/*      */   {
/* 1398 */     return this.fieldI0114MA1.getString();
/*      */   }
/*      */ 
/*      */   public void setI0124MA1(String newvalue)
/*      */   {
/* 1406 */     this.fieldI0124MA1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0124MA1()
/*      */   {
/* 1414 */     return this.fieldI0124MA1.getString();
/*      */   }
/*      */ 
/*      */   public void setI0134MA1(String newvalue)
/*      */   {
/* 1422 */     this.fieldI0134MA1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0134MA1()
/*      */   {
/* 1430 */     return this.fieldI0134MA1.getString();
/*      */   }
/*      */ 
/*      */   public void setI0144MA1(String newvalue)
/*      */   {
/* 1438 */     this.fieldI0144MA1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0144MA1()
/*      */   {
/* 1446 */     return this.fieldI0144MA1.getString();
/*      */   }
/*      */ 
/*      */   public void setI0154MA1(String newvalue)
/*      */   {
/* 1454 */     this.fieldI0154MA1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0154MA1()
/*      */   {
/* 1462 */     return this.fieldI0154MA1.getString();
/*      */   }
/*      */ 
/*      */   public void setI0164MA1(String newvalue)
/*      */   {
/* 1470 */     this.fieldI0164MA1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0164MA1()
/*      */   {
/* 1478 */     return this.fieldI0164MA1.getString();
/*      */   }
/*      */ 
/*      */   public void setI0174MA1(String newvalue)
/*      */   {
/* 1486 */     this.fieldI0174MA1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0174MA1()
/*      */   {
/* 1494 */     return this.fieldI0174MA1.getString();
/*      */   }
/*      */ 
/*      */   public void setI0184MA1(String newvalue)
/*      */   {
/* 1502 */     this.fieldI0184MA1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0184MA1()
/*      */   {
/* 1510 */     return this.fieldI0184MA1.getString();
/*      */   }
/*      */ 
/*      */   public void setI0194MA1(String newvalue)
/*      */   {
/* 1518 */     this.fieldI0194MA1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0194MA1()
/*      */   {
/* 1526 */     return this.fieldI0194MA1.getString();
/*      */   }
/*      */ 
/*      */   public void setI01A4MA1(String newvalue)
/*      */   {
/* 1534 */     this.fieldI01A4MA1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01A4MA1()
/*      */   {
/* 1542 */     return this.fieldI01A4MA1.getString();
/*      */   }
/*      */ 
/*      */   public void setI0114MA2(String newvalue)
/*      */   {
/* 1550 */     this.fieldI0114MA2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0114MA2()
/*      */   {
/* 1558 */     return this.fieldI0114MA2.getString();
/*      */   }
/*      */ 
/*      */   public void setI0124MA2(String newvalue)
/*      */   {
/* 1566 */     this.fieldI0124MA2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0124MA2()
/*      */   {
/* 1574 */     return this.fieldI0124MA2.getString();
/*      */   }
/*      */ 
/*      */   public void setI0134MA2(String newvalue)
/*      */   {
/* 1582 */     this.fieldI0134MA2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0134MA2()
/*      */   {
/* 1590 */     return this.fieldI0134MA2.getString();
/*      */   }
/*      */ 
/*      */   public void setI0144MA2(String newvalue)
/*      */   {
/* 1598 */     this.fieldI0144MA2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0144MA2()
/*      */   {
/* 1606 */     return this.fieldI0144MA2.getString();
/*      */   }
/*      */ 
/*      */   public void setI0154MA2(String newvalue)
/*      */   {
/* 1614 */     this.fieldI0154MA2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0154MA2()
/*      */   {
/* 1622 */     return this.fieldI0154MA2.getString();
/*      */   }
/*      */ 
/*      */   public void setI0164MA2(String newvalue)
/*      */   {
/* 1630 */     this.fieldI0164MA2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0164MA2()
/*      */   {
/* 1638 */     return this.fieldI0164MA2.getString();
/*      */   }
/*      */ 
/*      */   public void setI0174MA2(String newvalue)
/*      */   {
/* 1646 */     this.fieldI0174MA2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0174MA2()
/*      */   {
/* 1654 */     return this.fieldI0174MA2.getString();
/*      */   }
/*      */ 
/*      */   public void setI0184MA2(String newvalue)
/*      */   {
/* 1662 */     this.fieldI0184MA2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0184MA2()
/*      */   {
/* 1670 */     return this.fieldI0184MA2.getString();
/*      */   }
/*      */ 
/*      */   public void setI0194MA2(String newvalue)
/*      */   {
/* 1678 */     this.fieldI0194MA2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0194MA2()
/*      */   {
/* 1686 */     return this.fieldI0194MA2.getString();
/*      */   }
/*      */ 
/*      */   public void setI01A4MA2(String newvalue)
/*      */   {
/* 1694 */     this.fieldI01A4MA2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01A4MA2()
/*      */   {
/* 1702 */     return this.fieldI01A4MA2.getString();
/*      */   }
/*      */ 
/*      */   public void setI0114MA3(String newvalue)
/*      */   {
/* 1710 */     this.fieldI0114MA3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0114MA3()
/*      */   {
/* 1718 */     return this.fieldI0114MA3.getString();
/*      */   }
/*      */ 
/*      */   public void setI0124MA3(String newvalue)
/*      */   {
/* 1726 */     this.fieldI0124MA3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0124MA3()
/*      */   {
/* 1734 */     return this.fieldI0124MA3.getString();
/*      */   }
/*      */ 
/*      */   public void setI0134MA3(String newvalue)
/*      */   {
/* 1742 */     this.fieldI0134MA3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0134MA3()
/*      */   {
/* 1750 */     return this.fieldI0134MA3.getString();
/*      */   }
/*      */ 
/*      */   public void setI0144MA3(String newvalue)
/*      */   {
/* 1758 */     this.fieldI0144MA3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0144MA3()
/*      */   {
/* 1766 */     return this.fieldI0144MA3.getString();
/*      */   }
/*      */ 
/*      */   public void setI0154MA3(String newvalue)
/*      */   {
/* 1774 */     this.fieldI0154MA3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0154MA3()
/*      */   {
/* 1782 */     return this.fieldI0154MA3.getString();
/*      */   }
/*      */ 
/*      */   public void setI0164MA3(String newvalue)
/*      */   {
/* 1790 */     this.fieldI0164MA3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0164MA3()
/*      */   {
/* 1798 */     return this.fieldI0164MA3.getString();
/*      */   }
/*      */ 
/*      */   public void setI0174MA3(String newvalue)
/*      */   {
/* 1806 */     this.fieldI0174MA3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0174MA3()
/*      */   {
/* 1814 */     return this.fieldI0174MA3.getString();
/*      */   }
/*      */ 
/*      */   public void setI0184MA3(String newvalue)
/*      */   {
/* 1822 */     this.fieldI0184MA3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0184MA3()
/*      */   {
/* 1830 */     return this.fieldI0184MA3.getString();
/*      */   }
/*      */ 
/*      */   public void setI0194MA3(String newvalue)
/*      */   {
/* 1838 */     this.fieldI0194MA3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0194MA3()
/*      */   {
/* 1846 */     return this.fieldI0194MA3.getString();
/*      */   }
/*      */ 
/*      */   public void setI01A4MA3(String newvalue)
/*      */   {
/* 1854 */     this.fieldI01A4MA3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01A4MA3()
/*      */   {
/* 1862 */     return this.fieldI01A4MA3.getString();
/*      */   }
/*      */ 
/*      */   public void setI0114MA4(String newvalue)
/*      */   {
/* 1870 */     this.fieldI0114MA4.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0114MA4()
/*      */   {
/* 1878 */     return this.fieldI0114MA4.getString();
/*      */   }
/*      */ 
/*      */   public void setI0124MA4(String newvalue)
/*      */   {
/* 1886 */     this.fieldI0124MA4.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0124MA4()
/*      */   {
/* 1894 */     return this.fieldI0124MA4.getString();
/*      */   }
/*      */ 
/*      */   public void setI0134MA4(String newvalue)
/*      */   {
/* 1902 */     this.fieldI0134MA4.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0134MA4()
/*      */   {
/* 1910 */     return this.fieldI0134MA4.getString();
/*      */   }
/*      */ 
/*      */   public void setI0144MA4(String newvalue)
/*      */   {
/* 1918 */     this.fieldI0144MA4.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0144MA4()
/*      */   {
/* 1926 */     return this.fieldI0144MA4.getString();
/*      */   }
/*      */ 
/*      */   public void setI0154MA4(String newvalue)
/*      */   {
/* 1934 */     this.fieldI0154MA4.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0154MA4()
/*      */   {
/* 1942 */     return this.fieldI0154MA4.getString();
/*      */   }
/*      */ 
/*      */   public void setI0164MA4(String newvalue)
/*      */   {
/* 1950 */     this.fieldI0164MA4.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0164MA4()
/*      */   {
/* 1958 */     return this.fieldI0164MA4.getString();
/*      */   }
/*      */ 
/*      */   public void setI0174MA4(String newvalue)
/*      */   {
/* 1966 */     this.fieldI0174MA4.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0174MA4()
/*      */   {
/* 1974 */     return this.fieldI0174MA4.getString();
/*      */   }
/*      */ 
/*      */   public void setI0184MA4(String newvalue)
/*      */   {
/* 1982 */     this.fieldI0184MA4.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0184MA4()
/*      */   {
/* 1990 */     return this.fieldI0184MA4.getString();
/*      */   }
/*      */ 
/*      */   public void setI0194MA4(String newvalue)
/*      */   {
/* 1998 */     this.fieldI0194MA4.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0194MA4()
/*      */   {
/* 2006 */     return this.fieldI0194MA4.getString();
/*      */   }
/*      */ 
/*      */   public void setI01A4MA4(String newvalue)
/*      */   {
/* 2014 */     this.fieldI01A4MA4.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01A4MA4()
/*      */   {
/* 2022 */     return this.fieldI01A4MA4.getString();
/*      */   }
/*      */ 
/*      */   public void setI0114CTY(String newvalue)
/*      */   {
/* 2030 */     this.fieldI0114CTY.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0114CTY()
/*      */   {
/* 2038 */     return this.fieldI0114CTY.getString();
/*      */   }
/*      */ 
/*      */   public void setI0124CTY(String newvalue)
/*      */   {
/* 2046 */     this.fieldI0124CTY.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0124CTY()
/*      */   {
/* 2054 */     return this.fieldI0124CTY.getString();
/*      */   }
/*      */ 
/*      */   public void setI0134CTY(String newvalue)
/*      */   {
/* 2062 */     this.fieldI0134CTY.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0134CTY()
/*      */   {
/* 2070 */     return this.fieldI0134CTY.getString();
/*      */   }
/*      */ 
/*      */   public void setI0144CTY(String newvalue)
/*      */   {
/* 2078 */     this.fieldI0144CTY.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0144CTY()
/*      */   {
/* 2086 */     return this.fieldI0144CTY.getString();
/*      */   }
/*      */ 
/*      */   public void setI0154CTY(String newvalue)
/*      */   {
/* 2094 */     this.fieldI0154CTY.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0154CTY()
/*      */   {
/* 2102 */     return this.fieldI0154CTY.getString();
/*      */   }
/*      */ 
/*      */   public void setI0164CTY(String newvalue)
/*      */   {
/* 2110 */     this.fieldI0164CTY.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0164CTY()
/*      */   {
/* 2118 */     return this.fieldI0164CTY.getString();
/*      */   }
/*      */ 
/*      */   public void setI0174CTY(String newvalue)
/*      */   {
/* 2126 */     this.fieldI0174CTY.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0174CTY()
/*      */   {
/* 2134 */     return this.fieldI0174CTY.getString();
/*      */   }
/*      */ 
/*      */   public void setI0184CTY(String newvalue)
/*      */   {
/* 2142 */     this.fieldI0184CTY.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0184CTY()
/*      */   {
/* 2150 */     return this.fieldI0184CTY.getString();
/*      */   }
/*      */ 
/*      */   public void setI0194CTY(String newvalue)
/*      */   {
/* 2158 */     this.fieldI0194CTY.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0194CTY()
/*      */   {
/* 2166 */     return this.fieldI0194CTY.getString();
/*      */   }
/*      */ 
/*      */   public void setI01A4CTY(String newvalue)
/*      */   {
/* 2174 */     this.fieldI01A4CTY.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01A4CTY()
/*      */   {
/* 2182 */     return this.fieldI01A4CTY.getString();
/*      */   }
/*      */ 
/*      */   public void setI0114STE(String newvalue)
/*      */   {
/* 2190 */     this.fieldI0114STE.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0114STE()
/*      */   {
/* 2198 */     return this.fieldI0114STE.getString();
/*      */   }
/*      */ 
/*      */   public void setI0124STE(String newvalue)
/*      */   {
/* 2206 */     this.fieldI0124STE.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0124STE()
/*      */   {
/* 2214 */     return this.fieldI0124STE.getString();
/*      */   }
/*      */ 
/*      */   public void setI0134STE(String newvalue)
/*      */   {
/* 2222 */     this.fieldI0134STE.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0134STE()
/*      */   {
/* 2230 */     return this.fieldI0134STE.getString();
/*      */   }
/*      */ 
/*      */   public void setI0144STE(String newvalue)
/*      */   {
/* 2238 */     this.fieldI0144STE.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0144STE()
/*      */   {
/* 2246 */     return this.fieldI0144STE.getString();
/*      */   }
/*      */ 
/*      */   public void setI0154STE(String newvalue)
/*      */   {
/* 2254 */     this.fieldI0154STE.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0154STE()
/*      */   {
/* 2262 */     return this.fieldI0154STE.getString();
/*      */   }
/*      */ 
/*      */   public void setI0164STE(String newvalue)
/*      */   {
/* 2270 */     this.fieldI0164STE.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0164STE()
/*      */   {
/* 2278 */     return this.fieldI0164STE.getString();
/*      */   }
/*      */ 
/*      */   public void setI0174STE(String newvalue)
/*      */   {
/* 2286 */     this.fieldI0174STE.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0174STE()
/*      */   {
/* 2294 */     return this.fieldI0174STE.getString();
/*      */   }
/*      */ 
/*      */   public void setI0184STE(String newvalue)
/*      */   {
/* 2302 */     this.fieldI0184STE.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0184STE()
/*      */   {
/* 2310 */     return this.fieldI0184STE.getString();
/*      */   }
/*      */ 
/*      */   public void setI0194STE(String newvalue)
/*      */   {
/* 2318 */     this.fieldI0194STE.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0194STE()
/*      */   {
/* 2326 */     return this.fieldI0194STE.getString();
/*      */   }
/*      */ 
/*      */   public void setI01A4STE(String newvalue)
/*      */   {
/* 2334 */     this.fieldI01A4STE.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01A4STE()
/*      */   {
/* 2342 */     return this.fieldI01A4STE.getString();
/*      */   }
/*      */ 
/*      */   public void setI0114ZPC(String newvalue)
/*      */   {
/* 2350 */     this.fieldI0114ZPC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0114ZPC()
/*      */   {
/* 2358 */     return this.fieldI0114ZPC.getString();
/*      */   }
/*      */ 
/*      */   public void setI0124ZPC(String newvalue)
/*      */   {
/* 2366 */     this.fieldI0124ZPC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0124ZPC()
/*      */   {
/* 2374 */     return this.fieldI0124ZPC.getString();
/*      */   }
/*      */ 
/*      */   public void setI0134ZPC(String newvalue)
/*      */   {
/* 2382 */     this.fieldI0134ZPC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0134ZPC()
/*      */   {
/* 2390 */     return this.fieldI0134ZPC.getString();
/*      */   }
/*      */ 
/*      */   public void setI0144ZPC(String newvalue)
/*      */   {
/* 2398 */     this.fieldI0144ZPC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0144ZPC()
/*      */   {
/* 2406 */     return this.fieldI0144ZPC.getString();
/*      */   }
/*      */ 
/*      */   public void setI0154ZPC(String newvalue)
/*      */   {
/* 2414 */     this.fieldI0154ZPC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0154ZPC()
/*      */   {
/* 2422 */     return this.fieldI0154ZPC.getString();
/*      */   }
/*      */ 
/*      */   public void setI0164ZPC(String newvalue)
/*      */   {
/* 2430 */     this.fieldI0164ZPC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0164ZPC()
/*      */   {
/* 2438 */     return this.fieldI0164ZPC.getString();
/*      */   }
/*      */ 
/*      */   public void setI0174ZPC(String newvalue)
/*      */   {
/* 2446 */     this.fieldI0174ZPC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0174ZPC()
/*      */   {
/* 2454 */     return this.fieldI0174ZPC.getString();
/*      */   }
/*      */ 
/*      */   public void setI0184ZPC(String newvalue)
/*      */   {
/* 2462 */     this.fieldI0184ZPC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0184ZPC()
/*      */   {
/* 2470 */     return this.fieldI0184ZPC.getString();
/*      */   }
/*      */ 
/*      */   public void setI0194ZPC(String newvalue)
/*      */   {
/* 2478 */     this.fieldI0194ZPC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0194ZPC()
/*      */   {
/* 2486 */     return this.fieldI0194ZPC.getString();
/*      */   }
/*      */ 
/*      */   public void setI01A4ZPC(String newvalue)
/*      */   {
/* 2494 */     this.fieldI01A4ZPC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01A4ZPC()
/*      */   {
/* 2502 */     return this.fieldI01A4ZPC.getString();
/*      */   }
/*      */ 
/*      */   public void setI0114POB(String newvalue)
/*      */   {
/* 2510 */     this.fieldI0114POB.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0114POB()
/*      */   {
/* 2518 */     return this.fieldI0114POB.getString();
/*      */   }
/*      */ 
/*      */   public void setI0124POB(String newvalue)
/*      */   {
/* 2526 */     this.fieldI0124POB.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0124POB()
/*      */   {
/* 2534 */     return this.fieldI0124POB.getString();
/*      */   }
/*      */ 
/*      */   public void setI0134POB(String newvalue)
/*      */   {
/* 2542 */     this.fieldI0134POB.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0134POB()
/*      */   {
/* 2550 */     return this.fieldI0134POB.getString();
/*      */   }
/*      */ 
/*      */   public void setI0144POB(String newvalue)
/*      */   {
/* 2558 */     this.fieldI0144POB.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0144POB()
/*      */   {
/* 2566 */     return this.fieldI0144POB.getString();
/*      */   }
/*      */ 
/*      */   public void setI0154POB(String newvalue)
/*      */   {
/* 2574 */     this.fieldI0154POB.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0154POB()
/*      */   {
/* 2582 */     return this.fieldI0154POB.getString();
/*      */   }
/*      */ 
/*      */   public void setI0164POB(String newvalue)
/*      */   {
/* 2590 */     this.fieldI0164POB.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0164POB()
/*      */   {
/* 2598 */     return this.fieldI0164POB.getString();
/*      */   }
/*      */ 
/*      */   public void setI0174POB(String newvalue)
/*      */   {
/* 2606 */     this.fieldI0174POB.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0174POB()
/*      */   {
/* 2614 */     return this.fieldI0174POB.getString();
/*      */   }
/*      */ 
/*      */   public void setI0184POB(String newvalue)
/*      */   {
/* 2622 */     this.fieldI0184POB.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0184POB()
/*      */   {
/* 2630 */     return this.fieldI0184POB.getString();
/*      */   }
/*      */ 
/*      */   public void setI0194POB(String newvalue)
/*      */   {
/* 2638 */     this.fieldI0194POB.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0194POB()
/*      */   {
/* 2646 */     return this.fieldI0194POB.getString();
/*      */   }
/*      */ 
/*      */   public void setI01A4POB(String newvalue)
/*      */   {
/* 2654 */     this.fieldI01A4POB.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01A4POB()
/*      */   {
/* 2662 */     return this.fieldI01A4POB.getString();
/*      */   }
/*      */ 
/*      */   public void setI0114CTR(String newvalue)
/*      */   {
/* 2670 */     this.fieldI0114CTR.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0114CTR()
/*      */   {
/* 2678 */     return this.fieldI0114CTR.getString();
/*      */   }
/*      */ 
/*      */   public void setI0124CTR(String newvalue)
/*      */   {
/* 2686 */     this.fieldI0124CTR.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0124CTR()
/*      */   {
/* 2694 */     return this.fieldI0124CTR.getString();
/*      */   }
/*      */ 
/*      */   public void setI0134CTR(String newvalue)
/*      */   {
/* 2702 */     this.fieldI0134CTR.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0134CTR()
/*      */   {
/* 2710 */     return this.fieldI0134CTR.getString();
/*      */   }
/*      */ 
/*      */   public void setI0144CTR(String newvalue)
/*      */   {
/* 2718 */     this.fieldI0144CTR.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0144CTR()
/*      */   {
/* 2726 */     return this.fieldI0144CTR.getString();
/*      */   }
/*      */ 
/*      */   public void setI0154CTR(String newvalue)
/*      */   {
/* 2734 */     this.fieldI0154CTR.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0154CTR()
/*      */   {
/* 2742 */     return this.fieldI0154CTR.getString();
/*      */   }
/*      */ 
/*      */   public void setI0164CTR(String newvalue)
/*      */   {
/* 2750 */     this.fieldI0164CTR.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0164CTR()
/*      */   {
/* 2758 */     return this.fieldI0164CTR.getString();
/*      */   }
/*      */ 
/*      */   public void setI0174CTR(String newvalue)
/*      */   {
/* 2766 */     this.fieldI0174CTR.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0174CTR()
/*      */   {
/* 2774 */     return this.fieldI0174CTR.getString();
/*      */   }
/*      */ 
/*      */   public void setI0184CTR(String newvalue)
/*      */   {
/* 2782 */     this.fieldI0184CTR.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0184CTR()
/*      */   {
/* 2790 */     return this.fieldI0184CTR.getString();
/*      */   }
/*      */ 
/*      */   public void setI0194CTR(String newvalue)
/*      */   {
/* 2798 */     this.fieldI0194CTR.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0194CTR()
/*      */   {
/* 2806 */     return this.fieldI0194CTR.getString();
/*      */   }
/*      */ 
/*      */   public void setI01A4CTR(String newvalue)
/*      */   {
/* 2814 */     this.fieldI01A4CTR.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01A4CTR()
/*      */   {
/* 2822 */     return this.fieldI01A4CTR.getString();
/*      */   }
/*      */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.ISD008001Message
 * JD-Core Version:    0.6.0
 */