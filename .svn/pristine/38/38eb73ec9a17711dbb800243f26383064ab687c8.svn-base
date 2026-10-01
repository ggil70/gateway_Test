/*      */ package com.activo.gateway.dibs.messages;
/*      */ 
/*      */ import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;

/*      */ import java.math.BigDecimal;
import java.util.Hashtable;
/*      */ 
/*      */ public class ISD008002Message extends MessageRecord
/*      */ {
/*   20 */   static final String[] fldnames = { 
/*   21 */     "I02USER", 
/*   22 */     "I02OPRTYP", 
/*   23 */     "I02LGT", 
/*   24 */     "I02CUN", 
/*   25 */     "I02NA1", 
/*   26 */     "I02NA2", 
/*   27 */     "I02NA3", 
/*   28 */     "I02NA4", 
/*   29 */     "I02CTY", 
/*   30 */     "I02STE", 
/*   31 */     "I02CTR", 
/*   32 */     "I02POB", 
/*   33 */     "I02ZPC", 
/*   34 */     "I02SEX", 
/*   35 */     "I02HPN", 
/*   36 */     "I02PHN", 
/*   37 */     "I02PH1", 
/*   38 */     "I02FAX", 
/*   39 */     "I02IAD", 
/*   40 */     "I02WBS", 
/*   41 */     "I02TIM", 
/*   42 */     "I02RTP", 
/*   43 */     "I0214MAN", 
/*   44 */     "I0224MAN", 
/*   45 */     "I0234MAN", 
/*   46 */     "I0244MAN", 
/*   47 */     "I0254MAN", 
/*   48 */     "I0264MAN", 
/*   49 */     "I0274MAN", 
/*   50 */     "I0284MAN", 
/*   51 */     "I0294MAN", 
/*   52 */     "I02A4MAN", 
/*   53 */     "I0214MA1", 
/*   54 */     "I0224MA1", 
/*   55 */     "I0234MA1", 
/*   56 */     "I0244MA1", 
/*   57 */     "I0254MA1", 
/*   58 */     "I0264MA1", 
/*   59 */     "I0274MA1", 
/*   60 */     "I0284MA1", 
/*   61 */     "I0294MA1", 
/*   62 */     "I02A4MA1", 
/*   63 */     "I0214MA2", 
/*   64 */     "I0224MA2", 
/*   65 */     "I0234MA2", 
/*   66 */     "I0244MA2", 
/*   67 */     "I0254MA2", 
/*   68 */     "I0264MA2", 
/*   69 */     "I0274MA2", 
/*   70 */     "I0284MA2", 
/*   71 */     "I0294MA2", 
/*   72 */     "I02A4MA2", 
/*   73 */     "I0214MA3", 
/*   74 */     "I0224MA3", 
/*   75 */     "I0234MA3", 
/*   76 */     "I0244MA3", 
/*   77 */     "I0254MA3", 
/*   78 */     "I0264MA3", 
/*   79 */     "I0274MA3", 
/*   80 */     "I0284MA3", 
/*   81 */     "I0294MA3", 
/*   82 */     "I02A4MA3", 
/*   83 */     "I0214MA4", 
/*   84 */     "I0224MA4", 
/*   85 */     "I0234MA4", 
/*   86 */     "I0244MA4", 
/*   87 */     "I0254MA4", 
/*   88 */     "I0264MA4", 
/*   89 */     "I0274MA4", 
/*   90 */     "I0284MA4", 
/*   91 */     "I0294MA4", 
/*   92 */     "I02A4MA4", 
/*   93 */     "I0214CTY", 
/*   94 */     "I0224CTY", 
/*   95 */     "I0234CTY", 
/*   96 */     "I0244CTY", 
/*   97 */     "I0254CTY", 
/*   98 */     "I0264CTY", 
/*   99 */     "I0274CTY", 
/*  100 */     "I0284CTY", 
/*  101 */     "I0294CTY", 
/*  102 */     "I02A4CTY", 
/*  103 */     "I0214STE", 
/*  104 */     "I0224STE", 
/*  105 */     "I0234STE", 
/*  106 */     "I0244STE", 
/*  107 */     "I0254STE", 
/*  108 */     "I0264STE", 
/*  109 */     "I0274STE", 
/*  110 */     "I0284STE", 
/*  111 */     "I0294STE", 
/*  112 */     "I02A4STE", 
/*  113 */     "I0214ZPC", 
/*  114 */     "I0224ZPC", 
/*  115 */     "I0234ZPC", 
/*  116 */     "I0244ZPC", 
/*  117 */     "I0254ZPC", 
/*  118 */     "I0264ZPC", 
/*  119 */     "I0274ZPC", 
/*  120 */     "I0284ZPC", 
/*  121 */     "I0294ZPC", 
/*  122 */     "I02A4ZPC", 
/*  123 */     "I0214POB", 
/*  124 */     "I0224POB", 
/*  125 */     "I0234POB", 
/*  126 */     "I0244POB", 
/*  127 */     "I0254POB", 
/*  128 */     "I0264POB", 
/*  129 */     "I0274POB", 
/*  130 */     "I0284POB", 
/*  131 */     "I0294POB", 
/*  132 */     "I02A4POB", 
/*  133 */     "I0214CTR", 
/*  134 */     "I0224CTR", 
/*  135 */     "I0234CTR", 
/*  136 */     "I0244CTR", 
/*  137 */     "I0254CTR", 
/*  138 */     "I0264CTR", 
/*  139 */     "I0274CTR", 
/*  140 */     "I0284CTR", 
/*  141 */     "I0294CTR", 
/*  142 */     "I02A4CTR" };
/*      */ 
/*  144 */   static final String[] tnames = { 
/*  145 */     "I02USER", 
/*  146 */     "I02OPRTYP", 
/*  147 */     "I02LGT", 
/*  148 */     "I02CUN", 
/*  149 */     "I02NA1", 
/*  150 */     "I02NA2", 
/*  151 */     "I02NA3", 
/*  152 */     "I02NA4", 
/*  153 */     "I02CTY", 
/*  154 */     "I02STE", 
/*  155 */     "I02CTR", 
/*  156 */     "I02POB", 
/*  157 */     "I02ZPC", 
/*  158 */     "I02SEX", 
/*  159 */     "I02HPN", 
/*  160 */     "I02PHN", 
/*  161 */     "I02PH1", 
/*  162 */     "I02FAX", 
/*  163 */     "I02IAD", 
/*  164 */     "I02WBS", 
/*  165 */     "I02TIM", 
/*  166 */     "I02RTP", 
/*  167 */     "I0214MAN", 
/*  168 */     "I0224MAN", 
/*  169 */     "I0234MAN", 
/*  170 */     "I0244MAN", 
/*  171 */     "I0254MAN", 
/*  172 */     "I0264MAN", 
/*  173 */     "I0274MAN", 
/*  174 */     "I0284MAN", 
/*  175 */     "I0294MAN", 
/*  176 */     "I02A4MAN", 
/*  177 */     "I0214MA1", 
/*  178 */     "I0224MA1", 
/*  179 */     "I0234MA1", 
/*  180 */     "I0244MA1", 
/*  181 */     "I0254MA1", 
/*  182 */     "I0264MA1", 
/*  183 */     "I0274MA1", 
/*  184 */     "I0284MA1", 
/*  185 */     "I0294MA1", 
/*  186 */     "I02A4MA1", 
/*  187 */     "I0214MA2", 
/*  188 */     "I0224MA2", 
/*  189 */     "I0234MA2", 
/*  190 */     "I0244MA2", 
/*  191 */     "I0254MA2", 
/*  192 */     "I0264MA2", 
/*  193 */     "I0274MA2", 
/*  194 */     "I0284MA2", 
/*  195 */     "I0294MA2", 
/*  196 */     "I02A4MA2", 
/*  197 */     "I0214MA3", 
/*  198 */     "I0224MA3", 
/*  199 */     "I0234MA3", 
/*  200 */     "I0244MA3", 
/*  201 */     "I0254MA3", 
/*  202 */     "I0264MA3", 
/*  203 */     "I0274MA3", 
/*  204 */     "I0284MA3", 
/*  205 */     "I0294MA3", 
/*  206 */     "I02A4MA3", 
/*  207 */     "I0214MA4", 
/*  208 */     "I0224MA4", 
/*  209 */     "I0234MA4", 
/*  210 */     "I0244MA4", 
/*  211 */     "I0254MA4", 
/*  212 */     "I0264MA4", 
/*  213 */     "I0274MA4", 
/*  214 */     "I0284MA4", 
/*  215 */     "I0294MA4", 
/*  216 */     "I02A4MA4", 
/*  217 */     "I0214CTY", 
/*  218 */     "I0224CTY", 
/*  219 */     "I0234CTY", 
/*  220 */     "I0244CTY", 
/*  221 */     "I0254CTY", 
/*  222 */     "I0264CTY", 
/*  223 */     "I0274CTY", 
/*  224 */     "I0284CTY", 
/*  225 */     "I0294CTY", 
/*  226 */     "I02A4CTY", 
/*  227 */     "I0214STE", 
/*  228 */     "I0224STE", 
/*  229 */     "I0234STE", 
/*  230 */     "I0244STE", 
/*  231 */     "I0254STE", 
/*  232 */     "I0264STE", 
/*  233 */     "I0274STE", 
/*  234 */     "I0284STE", 
/*  235 */     "I0294STE", 
/*  236 */     "I02A4STE", 
/*  237 */     "I0214ZPC", 
/*  238 */     "I0224ZPC", 
/*  239 */     "I0234ZPC", 
/*  240 */     "I0244ZPC", 
/*  241 */     "I0254ZPC", 
/*  242 */     "I0264ZPC", 
/*  243 */     "I0274ZPC", 
/*  244 */     "I0284ZPC", 
/*  245 */     "I0294ZPC", 
/*  246 */     "I02A4ZPC", 
/*  247 */     "I0214POB", 
/*  248 */     "I0224POB", 
/*  249 */     "I0234POB", 
/*  250 */     "I0244POB", 
/*  251 */     "I0254POB", 
/*  252 */     "I0264POB", 
/*  253 */     "I0274POB", 
/*  254 */     "I0284POB", 
/*  255 */     "I0294POB", 
/*  256 */     "I02A4POB", 
/*  257 */     "I0214CTR", 
/*  258 */     "I0224CTR", 
/*  259 */     "I0234CTR", 
/*  260 */     "I0244CTR", 
/*  261 */     "I0254CTR", 
/*  262 */     "I0264CTR", 
/*  263 */     "I0274CTR", 
/*  264 */     "I0284CTR", 
/*  265 */     "I0294CTR", 
/*  266 */     "I02A4CTR" };
/*      */   static final String fid = "1050801183359";
/*      */   static final String rid = "424CF957F1AAA";
/*      */   static final String fmtname = "ISD008002";
/*  271 */   final int FIELDCOUNT = 122;
/*  272 */   private static Hashtable tlookup = new Hashtable();
/*  273 */   private CharacterField fieldI02USER = null;
/*  274 */   private CharacterField fieldI02OPRTYP = null;
/*  275 */   private CharacterField fieldI02LGT = null;
/*  276 */   private DecimalField fieldI02CUN = null;
/*  277 */   private CharacterField fieldI02NA1 = null;
/*  278 */   private CharacterField fieldI02NA2 = null;
/*  279 */   private CharacterField fieldI02NA3 = null;
/*  280 */   private CharacterField fieldI02NA4 = null;
/*  281 */   private CharacterField fieldI02CTY = null;
/*  282 */   private CharacterField fieldI02STE = null;
/*  283 */   private CharacterField fieldI02CTR = null;
/*  284 */   private CharacterField fieldI02POB = null;
/*  285 */   private CharacterField fieldI02ZPC = null;
/*  286 */   private CharacterField fieldI02SEX = null;
/*  287 */   private DecimalField fieldI02HPN = null;
/*  288 */   private DecimalField fieldI02PHN = null;
/*  289 */   private DecimalField fieldI02PH1 = null;
/*  290 */   private DecimalField fieldI02FAX = null;
/*  291 */   private CharacterField fieldI02IAD = null;
/*  292 */   private CharacterField fieldI02WBS = null;
/*  293 */   private DecimalField fieldI02TIM = null;
/*  294 */   private CharacterField fieldI02RTP = null;
/*  295 */   private CharacterField fieldI0214MAN = null;
/*  296 */   private CharacterField fieldI0224MAN = null;
/*  297 */   private CharacterField fieldI0234MAN = null;
/*  298 */   private CharacterField fieldI0244MAN = null;
/*  299 */   private CharacterField fieldI0254MAN = null;
/*  300 */   private CharacterField fieldI0264MAN = null;
/*  301 */   private CharacterField fieldI0274MAN = null;
/*  302 */   private CharacterField fieldI0284MAN = null;
/*  303 */   private CharacterField fieldI0294MAN = null;
/*  304 */   private CharacterField fieldI02A4MAN = null;
/*  305 */   private CharacterField fieldI0214MA1 = null;
/*  306 */   private CharacterField fieldI0224MA1 = null;
/*  307 */   private CharacterField fieldI0234MA1 = null;
/*  308 */   private CharacterField fieldI0244MA1 = null;
/*  309 */   private CharacterField fieldI0254MA1 = null;
/*  310 */   private CharacterField fieldI0264MA1 = null;
/*  311 */   private CharacterField fieldI0274MA1 = null;
/*  312 */   private CharacterField fieldI0284MA1 = null;
/*  313 */   private CharacterField fieldI0294MA1 = null;
/*  314 */   private CharacterField fieldI02A4MA1 = null;
/*  315 */   private CharacterField fieldI0214MA2 = null;
/*  316 */   private CharacterField fieldI0224MA2 = null;
/*  317 */   private CharacterField fieldI0234MA2 = null;
/*  318 */   private CharacterField fieldI0244MA2 = null;
/*  319 */   private CharacterField fieldI0254MA2 = null;
/*  320 */   private CharacterField fieldI0264MA2 = null;
/*  321 */   private CharacterField fieldI0274MA2 = null;
/*  322 */   private CharacterField fieldI0284MA2 = null;
/*  323 */   private CharacterField fieldI0294MA2 = null;
/*  324 */   private CharacterField fieldI02A4MA2 = null;
/*  325 */   private CharacterField fieldI0214MA3 = null;
/*  326 */   private CharacterField fieldI0224MA3 = null;
/*  327 */   private CharacterField fieldI0234MA3 = null;
/*  328 */   private CharacterField fieldI0244MA3 = null;
/*  329 */   private CharacterField fieldI0254MA3 = null;
/*  330 */   private CharacterField fieldI0264MA3 = null;
/*  331 */   private CharacterField fieldI0274MA3 = null;
/*  332 */   private CharacterField fieldI0284MA3 = null;
/*  333 */   private CharacterField fieldI0294MA3 = null;
/*  334 */   private CharacterField fieldI02A4MA3 = null;
/*  335 */   private CharacterField fieldI0214MA4 = null;
/*  336 */   private CharacterField fieldI0224MA4 = null;
/*  337 */   private CharacterField fieldI0234MA4 = null;
/*  338 */   private CharacterField fieldI0244MA4 = null;
/*  339 */   private CharacterField fieldI0254MA4 = null;
/*  340 */   private CharacterField fieldI0264MA4 = null;
/*  341 */   private CharacterField fieldI0274MA4 = null;
/*  342 */   private CharacterField fieldI0284MA4 = null;
/*  343 */   private CharacterField fieldI0294MA4 = null;
/*  344 */   private CharacterField fieldI02A4MA4 = null;
/*  345 */   private CharacterField fieldI0214CTY = null;
/*  346 */   private CharacterField fieldI0224CTY = null;
/*  347 */   private CharacterField fieldI0234CTY = null;
/*  348 */   private CharacterField fieldI0244CTY = null;
/*  349 */   private CharacterField fieldI0254CTY = null;
/*  350 */   private CharacterField fieldI0264CTY = null;
/*  351 */   private CharacterField fieldI0274CTY = null;
/*  352 */   private CharacterField fieldI0284CTY = null;
/*  353 */   private CharacterField fieldI0294CTY = null;
/*  354 */   private CharacterField fieldI02A4CTY = null;
/*  355 */   private CharacterField fieldI0214STE = null;
/*  356 */   private CharacterField fieldI0224STE = null;
/*  357 */   private CharacterField fieldI0234STE = null;
/*  358 */   private CharacterField fieldI0244STE = null;
/*  359 */   private CharacterField fieldI0254STE = null;
/*  360 */   private CharacterField fieldI0264STE = null;
/*  361 */   private CharacterField fieldI0274STE = null;
/*  362 */   private CharacterField fieldI0284STE = null;
/*  363 */   private CharacterField fieldI0294STE = null;
/*  364 */   private CharacterField fieldI02A4STE = null;
/*  365 */   private CharacterField fieldI0214ZPC = null;
/*  366 */   private CharacterField fieldI0224ZPC = null;
/*  367 */   private CharacterField fieldI0234ZPC = null;
/*  368 */   private CharacterField fieldI0244ZPC = null;
/*  369 */   private CharacterField fieldI0254ZPC = null;
/*  370 */   private CharacterField fieldI0264ZPC = null;
/*  371 */   private CharacterField fieldI0274ZPC = null;
/*  372 */   private CharacterField fieldI0284ZPC = null;
/*  373 */   private CharacterField fieldI0294ZPC = null;
/*  374 */   private CharacterField fieldI02A4ZPC = null;
/*  375 */   private CharacterField fieldI0214POB = null;
/*  376 */   private CharacterField fieldI0224POB = null;
/*  377 */   private CharacterField fieldI0234POB = null;
/*  378 */   private CharacterField fieldI0244POB = null;
/*  379 */   private CharacterField fieldI0254POB = null;
/*  380 */   private CharacterField fieldI0264POB = null;
/*  381 */   private CharacterField fieldI0274POB = null;
/*  382 */   private CharacterField fieldI0284POB = null;
/*  383 */   private CharacterField fieldI0294POB = null;
/*  384 */   private CharacterField fieldI02A4POB = null;
/*  385 */   private CharacterField fieldI0214CTR = null;
/*  386 */   private CharacterField fieldI0224CTR = null;
/*  387 */   private CharacterField fieldI0234CTR = null;
/*  388 */   private CharacterField fieldI0244CTR = null;
/*  389 */   private CharacterField fieldI0254CTR = null;
/*  390 */   private CharacterField fieldI0264CTR = null;
/*  391 */   private CharacterField fieldI0274CTR = null;
/*  392 */   private CharacterField fieldI0284CTR = null;
/*  393 */   private CharacterField fieldI0294CTR = null;
/*  394 */   private CharacterField fieldI02A4CTR = null;
/*      */ 
/*      */   public ISD008002Message()
/*      */   {
/*  401 */     createFields();
/*  402 */     initialize();
/*      */   }
/*      */ 
/*      */   protected void createFields()
/*      */   {
/*  411 */     this.recordsize = 2694;
/*  412 */     this.fileid = "1050801183359";
/*  413 */     this.recordid = "424CF957F1AAA";
/*  414 */     this.message = new byte[getByteLength()];
/*  415 */     this.formatname = "ISD008002";
/*  416 */     this.fieldnames = fldnames;
/*  417 */     this.tagnames = tnames;
/*  418 */     this.fields = new MessageField[122];
/*      */      this.fields[0]=this.fieldI02USER=new CharacterField(this.message, 10, 10, "I02USER");
/*      */      this.fields[1]=this.fieldI02OPRTYP=new CharacterField(this.message, 20, 1, "I02OPRTYP");
/*      */      this.fields[2]=this.fieldI02LGT=new CharacterField(this.message, 21, 1, "I02LGT");
/*      */      this.fields[3]=this.fieldI02CUN=new DecimalField(this.message, 22, 10, 0, "I02CUN");
/*      */      this.fields[4]=this.fieldI02NA1=new CharacterField(this.message, 32, 45, "I02NA1");
/*      */      this.fields[5]=this.fieldI02NA2=new CharacterField(this.message, 77, 35, "I02NA2");
/*      */      this.fields[6]=this.fieldI02NA3=new CharacterField(this.message, 112, 35, "I02NA3");
/*      */      this.fields[7]=this.fieldI02NA4=new CharacterField(this.message, 147, 35, "I02NA4");
/*      */      this.fields[8]=this.fieldI02CTY=new CharacterField(this.message, 182, 30, "I02CTY");
/*      */      this.fields[9]=this.fieldI02STE=new CharacterField(this.message, 212, 4, "I02STE");
/*      */      this.fields[10]=this.fieldI02CTR=new CharacterField(this.message, 216, 20, "I02CTR");
/*      */      this.fields[11]=this.fieldI02POB=new CharacterField(this.message, 236, 10, "I02POB");
/*      */      this.fields[12]=this.fieldI02ZPC=new CharacterField(this.message, 246, 15, "I02ZPC");
/*      */      this.fields[13]=this.fieldI02SEX=new CharacterField(this.message, 261, 1, "I02SEX");
/*      */      this.fields[14]=this.fieldI02HPN=new DecimalField(this.message, 262, 12, 0, "I02HPN");
/*      */      this.fields[15]=this.fieldI02PHN=new DecimalField(this.message, 274, 12, 0, "I02PHN");
/*      */      this.fields[16]=this.fieldI02PH1=new DecimalField(this.message, 286, 12, 0, "I02PH1");
/*      */      this.fields[17]=this.fieldI02FAX=new DecimalField(this.message, 298, 12, 0, "I02FAX");
/*      */      this.fields[18]=this.fieldI02IAD=new CharacterField(this.message, 310, 40, "I02IAD");
/*      */      this.fields[19]=this.fieldI02WBS=new CharacterField(this.message, 350, 40, "I02WBS");
/*      */      this.fields[20]=this.fieldI02TIM=new DecimalField(this.message, 390, 3, 0, "I02TIM");
/*      */      this.fields[21]=this.fieldI02RTP=new CharacterField(this.message, 393, 1, "I02RTP");
/*      */      this.fields[22]=this.fieldI0214MAN=new CharacterField(this.message, 394, 2, "I0214MAN");
/*      */      this.fields[23]=this.fieldI0224MAN=new CharacterField(this.message, 396, 2, "I0224MAN");
/*      */      this.fields[24]=this.fieldI0234MAN=new CharacterField(this.message, 398, 2, "I0234MAN");
/*      */      this.fields[25]=this.fieldI0244MAN=new CharacterField(this.message, 400, 2, "I0244MAN");
/*      */      this.fields[26]=this.fieldI0254MAN=new CharacterField(this.message, 402, 2, "I0254MAN");
/*      */      this.fields[27]=this.fieldI0264MAN=new CharacterField(this.message, 404, 2, "I0264MAN");
/*      */      this.fields[28]=this.fieldI0274MAN=new CharacterField(this.message, 406, 2, "I0274MAN");
/*      */      this.fields[29]=this.fieldI0284MAN=new CharacterField(this.message, 408, 2, "I0284MAN");
/*      */      this.fields[30]=this.fieldI0294MAN=new CharacterField(this.message, 410, 2, "I0294MAN");
/*      */      this.fields[31]=this.fieldI02A4MAN=new CharacterField(this.message, 412, 2, "I02A4MAN");
/*      */      this.fields[32]=this.fieldI0214MA1=new CharacterField(this.message, 414, 45, "I0214MA1");
/*      */      this.fields[33]=this.fieldI0224MA1=new CharacterField(this.message, 459, 45, "I0224MA1");
/*      */      this.fields[34]=this.fieldI0234MA1=new CharacterField(this.message, 504, 45, "I0234MA1");
/*      */      this.fields[35]=this.fieldI0244MA1=new CharacterField(this.message, 549, 45, "I0244MA1");
/*      */      this.fields[36]=this.fieldI0254MA1=new CharacterField(this.message, 594, 45, "I0254MA1");
/*      */      this.fields[37]=this.fieldI0264MA1=new CharacterField(this.message, 639, 45, "I0264MA1");
/*      */      this.fields[38]=this.fieldI0274MA1=new CharacterField(this.message, 684, 45, "I0274MA1");
/*      */      this.fields[39]=this.fieldI0284MA1=new CharacterField(this.message, 729, 45, "I0284MA1");
/*      */      this.fields[40]=this.fieldI0294MA1=new CharacterField(this.message, 774, 45, "I0294MA1");
/*      */      this.fields[41]=this.fieldI02A4MA1=new CharacterField(this.message, 819, 45, "I02A4MA1");
/*      */      this.fields[42]=this.fieldI0214MA2=new CharacterField(this.message, 864, 35, "I0214MA2");
/*      */      this.fields[43]=this.fieldI0224MA2=new CharacterField(this.message, 899, 35, "I0224MA2");
/*      */      this.fields[44]=this.fieldI0234MA2=new CharacterField(this.message, 934, 35, "I0234MA2");
/*      */      this.fields[45]=this.fieldI0244MA2=new CharacterField(this.message, 969, 35, "I0244MA2");
/*      */      this.fields[46]=this.fieldI0254MA2=new CharacterField(this.message, 1004, 35, "I0254MA2");
/*      */      this.fields[47]=this.fieldI0264MA2=new CharacterField(this.message, 1039, 35, "I0264MA2");
/*      */      this.fields[48]=this.fieldI0274MA2=new CharacterField(this.message, 1074, 35, "I0274MA2");
/*      */      this.fields[49]=this.fieldI0284MA2=new CharacterField(this.message, 1109, 35, "I0284MA2");
/*      */      this.fields[50]=this.fieldI0294MA2=new CharacterField(this.message, 1144, 35, "I0294MA2");
/*      */      this.fields[51]=this.fieldI02A4MA2=new CharacterField(this.message, 1179, 35, "I02A4MA2");
/*      */      this.fields[52]=this.fieldI0214MA3=new CharacterField(this.message, 1214, 35, "I0214MA3");
/*      */      this.fields[53]=this.fieldI0224MA3=new CharacterField(this.message, 1249, 35, "I0224MA3");
/*      */      this.fields[54]=this.fieldI0234MA3=new CharacterField(this.message, 1284, 35, "I0234MA3");
/*      */      this.fields[55]=this.fieldI0244MA3=new CharacterField(this.message, 1319, 35, "I0244MA3");
/*      */      this.fields[56]=this.fieldI0254MA3=new CharacterField(this.message, 1354, 35, "I0254MA3");
/*      */      this.fields[57]=this.fieldI0264MA3=new CharacterField(this.message, 1389, 35, "I0264MA3");
/*      */      this.fields[58]=this.fieldI0274MA3=new CharacterField(this.message, 1424, 35, "I0274MA3");
/*      */      this.fields[59]=this.fieldI0284MA3=new CharacterField(this.message, 1459, 35, "I0284MA3");
/*      */      this.fields[60]=this.fieldI0294MA3=new CharacterField(this.message, 1494, 35, "I0294MA3");
/*      */      this.fields[61]=this.fieldI02A4MA3=new CharacterField(this.message, 1529, 35, "I02A4MA3");
/*      */      this.fields[62]=this.fieldI0214MA4=new CharacterField(this.message, 1564, 35, "I0214MA4");
/*      */      this.fields[63]=this.fieldI0224MA4=new CharacterField(this.message, 1599, 35, "I0224MA4");
/*      */      this.fields[64]=this.fieldI0234MA4=new CharacterField(this.message, 1634, 35, "I0234MA4");
/*      */      this.fields[65]=this.fieldI0244MA4=new CharacterField(this.message, 1669, 35, "I0244MA4");
/*      */      this.fields[66]=this.fieldI0254MA4=new CharacterField(this.message, 1704, 35, "I0254MA4");
/*      */      this.fields[67]=this.fieldI0264MA4=new CharacterField(this.message, 1739, 35, "I0264MA4");
/*      */      this.fields[68]=this.fieldI0274MA4=new CharacterField(this.message, 1774, 35, "I0274MA4");
/*      */      this.fields[69]=this.fieldI0284MA4=new CharacterField(this.message, 1809, 35, "I0284MA4");
/*      */      this.fields[70]=this.fieldI0294MA4=new CharacterField(this.message, 1844, 35, "I0294MA4");
/*      */      this.fields[71]=this.fieldI02A4MA4=new CharacterField(this.message, 1879, 35, "I02A4MA4");
/*      */      this.fields[72]=this.fieldI0214CTY=new CharacterField(this.message, 1914, 30, "I0214CTY");
/*      */      this.fields[73]=this.fieldI0224CTY=new CharacterField(this.message, 1944, 30, "I0224CTY");
/*      */      this.fields[74]=this.fieldI0234CTY=new CharacterField(this.message, 1974, 30, "I0234CTY");
/*      */      this.fields[75]=this.fieldI0244CTY=new CharacterField(this.message, 2004, 30, "I0244CTY");
/*      */      this.fields[76]=this.fieldI0254CTY=new CharacterField(this.message, 2034, 30, "I0254CTY");
/*      */      this.fields[77]=this.fieldI0264CTY=new CharacterField(this.message, 2064, 30, "I0264CTY");
/*      */      this.fields[78]=this.fieldI0274CTY=new CharacterField(this.message, 2094, 30, "I0274CTY");
/*      */      this.fields[79]=this.fieldI0284CTY=new CharacterField(this.message, 2124, 30, "I0284CTY");
/*      */      this.fields[80]=this.fieldI0294CTY=new CharacterField(this.message, 2154, 30, "I0294CTY");
/*      */      this.fields[81]=this.fieldI02A4CTY=new CharacterField(this.message, 2184, 30, "I02A4CTY");
/*      */      this.fields[82]=this.fieldI0214STE=new CharacterField(this.message, 2214, 4, "I0214STE");
/*      */      this.fields[83]=this.fieldI0224STE=new CharacterField(this.message, 2218, 4, "I0224STE");
/*      */      this.fields[84]=this.fieldI0234STE=new CharacterField(this.message, 2222, 4, "I0234STE");
/*      */      this.fields[85]=this.fieldI0244STE=new CharacterField(this.message, 2226, 4, "I0244STE");
/*      */      this.fields[86]=this.fieldI0254STE=new CharacterField(this.message, 2230, 4, "I0254STE");
/*      */      this.fields[87]=this.fieldI0264STE=new CharacterField(this.message, 2234, 4, "I0264STE");
/*      */      this.fields[88]=this.fieldI0274STE=new CharacterField(this.message, 2238, 4, "I0274STE");
/*      */      this.fields[89]=this.fieldI0284STE=new CharacterField(this.message, 2242, 4, "I0284STE");
/*      */      this.fields[90]=this.fieldI0294STE=new CharacterField(this.message, 2246, 4, "I0294STE");
/*      */      this.fields[91]=this.fieldI02A4STE=new CharacterField(this.message, 2250, 4, "I02A4STE");
/*      */      this.fields[92]=this.fieldI0214ZPC=new CharacterField(this.message, 2254, 15, "I0214ZPC");
/*      */      this.fields[93]=this.fieldI0224ZPC=new CharacterField(this.message, 2269, 15, "I0224ZPC");
/*      */      this.fields[94]=this.fieldI0234ZPC=new CharacterField(this.message, 2284, 15, "I0234ZPC");
/*      */      this.fields[95]=this.fieldI0244ZPC=new CharacterField(this.message, 2299, 15, "I0244ZPC");
/*      */      this.fields[96]=this.fieldI0254ZPC=new CharacterField(this.message, 2314, 15, "I0254ZPC");
/*      */      this.fields[97]=this.fieldI0264ZPC=new CharacterField(this.message, 2329, 15, "I0264ZPC");
/*      */      this.fields[98]=this.fieldI0274ZPC=new CharacterField(this.message, 2344, 15, "I0274ZPC");
/*      */      this.fields[99]=this.fieldI0284ZPC=new CharacterField(this.message, 2359, 15, "I0284ZPC");
/*      */      this.fields[100]=this.fieldI0294ZPC=new CharacterField(this.message, 2374, 15, "I0294ZPC");
/*      */      this.fields[101]=this.fieldI02A4ZPC=new CharacterField(this.message, 2389, 15, "I02A4ZPC");
/*      */      this.fields[102]=this.fieldI0214POB=new CharacterField(this.message, 2404, 10, "I0214POB");
/*      */      this.fields[103]=this.fieldI0224POB=new CharacterField(this.message, 2414, 10, "I0224POB");
/*      */      this.fields[104]=this.fieldI0234POB=new CharacterField(this.message, 2424, 10, "I0234POB");
/*      */      this.fields[105]=this.fieldI0244POB=new CharacterField(this.message, 2434, 10, "I0244POB");
/*      */      this.fields[106]=this.fieldI0254POB=new CharacterField(this.message, 2444, 10, "I0254POB");
/*      */      this.fields[107]=this.fieldI0264POB=new CharacterField(this.message, 2454, 10, "I0264POB");
/*      */      this.fields[108]=this.fieldI0274POB=new CharacterField(this.message, 2464, 10, "I0274POB");
/*      */      this.fields[109]=this.fieldI0284POB=new CharacterField(this.message, 2474, 10, "I0284POB");
/*      */      this.fields[110]=this.fieldI0294POB=new CharacterField(this.message, 2484, 10, "I0294POB");
/*      */      this.fields[111]=this.fieldI02A4POB=new CharacterField(this.message, 2494, 10, "I02A4POB");
/*      */      this.fields[112]=this.fieldI0214CTR=new CharacterField(this.message, 2504, 20, "I0214CTR");
/*      */      this.fields[113]=this.fieldI0224CTR=new CharacterField(this.message, 2524, 20, "I0224CTR");
/*      */      this.fields[114]=this.fieldI0234CTR=new CharacterField(this.message, 2544, 20, "I0234CTR");
/*      */      this.fields[115]=this.fieldI0244CTR=new CharacterField(this.message, 2564, 20, "I0244CTR");
/*      */      this.fields[116]=this.fieldI0254CTR=new CharacterField(this.message, 2584, 20, "I0254CTR");
/*      */      this.fields[117]=this.fieldI0264CTR=new CharacterField(this.message, 2604, 20, "I0264CTR");
/*      */      this.fields[118]=this.fieldI0274CTR=new CharacterField(this.message, 2624, 20, "I0274CTR");
/*      */      this.fields[119]=this.fieldI0284CTR=new CharacterField(this.message, 2644, 20, "I0284CTR");
/*      */      this.fields[120]=this.fieldI0294CTR=new CharacterField(this.message, 2664, 20, "I0294CTR");
/*      */      this.fields[121]=this.fieldI02A4CTR=new CharacterField(this.message, 2684, 20, "I02A4CTR");
/*      */ 
/*  665 */     synchronized (tlookup)
/*      */     {
/*  667 */       if (tlookup.isEmpty())
/*      */       {
/*  669 */         for (int i = 0; i < tnames.length; i++) {
/*  670 */           tlookup.put(tnames[i], new Integer(i));
/*      */         }
/*      */       }
/*      */     }
/*  674 */     this.taglookup = tlookup;
/*      */   }
/*      */ 
/*      */   public void setI02USER(String newvalue)
/*      */   {
/*  682 */     this.fieldI02USER.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI02USER()
/*      */   {
/*  690 */     return this.fieldI02USER.getString();
/*      */   }
/*      */ 
/*      */   public void setI02OPRTYP(String newvalue)
/*      */   {
/*  698 */     this.fieldI02OPRTYP.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI02OPRTYP()
/*      */   {
/*  706 */     return this.fieldI02OPRTYP.getString();
/*      */   }
/*      */ 
/*      */   public void setI02LGT(String newvalue)
/*      */   {
/*  714 */     this.fieldI02LGT.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI02LGT()
/*      */   {
/*  722 */     return this.fieldI02LGT.getString();
/*      */   }
/*      */ 
/*      */   public void setI02CUN(String newvalue)
/*      */   {
/*  730 */     this.fieldI02CUN.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI02CUN()
/*      */   {
/*  738 */     return this.fieldI02CUN.getString();
/*      */   }
/*      */ 
/*      */   public void setI02CUN(BigDecimal newvalue)
/*      */   {
/*  746 */     this.fieldI02CUN.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalI02CUN()
/*      */   {
/*  754 */     return this.fieldI02CUN.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setI02NA1(String newvalue)
/*      */   {
/*  762 */     this.fieldI02NA1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI02NA1()
/*      */   {
/*  770 */     return this.fieldI02NA1.getString();
/*      */   }
/*      */ 
/*      */   public void setI02NA2(String newvalue)
/*      */   {
/*  778 */     this.fieldI02NA2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI02NA2()
/*      */   {
/*  786 */     return this.fieldI02NA2.getString();
/*      */   }
/*      */ 
/*      */   public void setI02NA3(String newvalue)
/*      */   {
/*  794 */     this.fieldI02NA3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI02NA3()
/*      */   {
/*  802 */     return this.fieldI02NA3.getString();
/*      */   }
/*      */ 
/*      */   public void setI02NA4(String newvalue)
/*      */   {
/*  810 */     this.fieldI02NA4.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI02NA4()
/*      */   {
/*  818 */     return this.fieldI02NA4.getString();
/*      */   }
/*      */ 
/*      */   public void setI02CTY(String newvalue)
/*      */   {
/*  826 */     this.fieldI02CTY.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI02CTY()
/*      */   {
/*  834 */     return this.fieldI02CTY.getString();
/*      */   }
/*      */ 
/*      */   public void setI02STE(String newvalue)
/*      */   {
/*  842 */     this.fieldI02STE.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI02STE()
/*      */   {
/*  850 */     return this.fieldI02STE.getString();
/*      */   }
/*      */ 
/*      */   public void setI02CTR(String newvalue)
/*      */   {
/*  858 */     this.fieldI02CTR.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI02CTR()
/*      */   {
/*  866 */     return this.fieldI02CTR.getString();
/*      */   }
/*      */ 
/*      */   public void setI02POB(String newvalue)
/*      */   {
/*  874 */     this.fieldI02POB.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI02POB()
/*      */   {
/*  882 */     return this.fieldI02POB.getString();
/*      */   }
/*      */ 
/*      */   public void setI02ZPC(String newvalue)
/*      */   {
/*  890 */     this.fieldI02ZPC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI02ZPC()
/*      */   {
/*  898 */     return this.fieldI02ZPC.getString();
/*      */   }
/*      */ 
/*      */   public void setI02SEX(String newvalue)
/*      */   {
/*  906 */     this.fieldI02SEX.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI02SEX()
/*      */   {
/*  914 */     return this.fieldI02SEX.getString();
/*      */   }
/*      */ 
/*      */   public void setI02HPN(String newvalue)
/*      */   {
/*  922 */     this.fieldI02HPN.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI02HPN()
/*      */   {
/*  930 */     return this.fieldI02HPN.getString();
/*      */   }
/*      */ 
/*      */   public void setI02HPN(BigDecimal newvalue)
/*      */   {
/*  938 */     this.fieldI02HPN.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalI02HPN()
/*      */   {
/*  946 */     return this.fieldI02HPN.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setI02PHN(String newvalue)
/*      */   {
/*  954 */     this.fieldI02PHN.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI02PHN()
/*      */   {
/*  962 */     return this.fieldI02PHN.getString();
/*      */   }
/*      */ 
/*      */   public void setI02PHN(BigDecimal newvalue)
/*      */   {
/*  970 */     this.fieldI02PHN.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalI02PHN()
/*      */   {
/*  978 */     return this.fieldI02PHN.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setI02PH1(String newvalue)
/*      */   {
/*  986 */     this.fieldI02PH1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI02PH1()
/*      */   {
/*  994 */     return this.fieldI02PH1.getString();
/*      */   }
/*      */ 
/*      */   public void setI02PH1(BigDecimal newvalue)
/*      */   {
/* 1002 */     this.fieldI02PH1.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalI02PH1()
/*      */   {
/* 1010 */     return this.fieldI02PH1.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setI02FAX(String newvalue)
/*      */   {
/* 1018 */     this.fieldI02FAX.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI02FAX()
/*      */   {
/* 1026 */     return this.fieldI02FAX.getString();
/*      */   }
/*      */ 
/*      */   public void setI02FAX(BigDecimal newvalue)
/*      */   {
/* 1034 */     this.fieldI02FAX.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalI02FAX()
/*      */   {
/* 1042 */     return this.fieldI02FAX.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setI02IAD(String newvalue)
/*      */   {
/* 1050 */     this.fieldI02IAD.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI02IAD()
/*      */   {
/* 1058 */     return this.fieldI02IAD.getString();
/*      */   }
/*      */ 
/*      */   public void setI02WBS(String newvalue)
/*      */   {
/* 1066 */     this.fieldI02WBS.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI02WBS()
/*      */   {
/* 1074 */     return this.fieldI02WBS.getString();
/*      */   }
/*      */ 
/*      */   public void setI02TIM(String newvalue)
/*      */   {
/* 1082 */     this.fieldI02TIM.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI02TIM()
/*      */   {
/* 1090 */     return this.fieldI02TIM.getString();
/*      */   }
/*      */ 
/*      */   public void setI02TIM(BigDecimal newvalue)
/*      */   {
/* 1098 */     this.fieldI02TIM.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalI02TIM()
/*      */   {
/* 1106 */     return this.fieldI02TIM.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setI02RTP(String newvalue)
/*      */   {
/* 1114 */     this.fieldI02RTP.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI02RTP()
/*      */   {
/* 1122 */     return this.fieldI02RTP.getString();
/*      */   }
/*      */ 
/*      */   public void setI0214MAN(String newvalue)
/*      */   {
/* 1130 */     this.fieldI0214MAN.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0214MAN()
/*      */   {
/* 1138 */     return this.fieldI0214MAN.getString();
/*      */   }
/*      */ 
/*      */   public void setI0224MAN(String newvalue)
/*      */   {
/* 1146 */     this.fieldI0224MAN.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0224MAN()
/*      */   {
/* 1154 */     return this.fieldI0224MAN.getString();
/*      */   }
/*      */ 
/*      */   public void setI0234MAN(String newvalue)
/*      */   {
/* 1162 */     this.fieldI0234MAN.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0234MAN()
/*      */   {
/* 1170 */     return this.fieldI0234MAN.getString();
/*      */   }
/*      */ 
/*      */   public void setI0244MAN(String newvalue)
/*      */   {
/* 1178 */     this.fieldI0244MAN.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0244MAN()
/*      */   {
/* 1186 */     return this.fieldI0244MAN.getString();
/*      */   }
/*      */ 
/*      */   public void setI0254MAN(String newvalue)
/*      */   {
/* 1194 */     this.fieldI0254MAN.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0254MAN()
/*      */   {
/* 1202 */     return this.fieldI0254MAN.getString();
/*      */   }
/*      */ 
/*      */   public void setI0264MAN(String newvalue)
/*      */   {
/* 1210 */     this.fieldI0264MAN.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0264MAN()
/*      */   {
/* 1218 */     return this.fieldI0264MAN.getString();
/*      */   }
/*      */ 
/*      */   public void setI0274MAN(String newvalue)
/*      */   {
/* 1226 */     this.fieldI0274MAN.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0274MAN()
/*      */   {
/* 1234 */     return this.fieldI0274MAN.getString();
/*      */   }
/*      */ 
/*      */   public void setI0284MAN(String newvalue)
/*      */   {
/* 1242 */     this.fieldI0284MAN.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0284MAN()
/*      */   {
/* 1250 */     return this.fieldI0284MAN.getString();
/*      */   }
/*      */ 
/*      */   public void setI0294MAN(String newvalue)
/*      */   {
/* 1258 */     this.fieldI0294MAN.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0294MAN()
/*      */   {
/* 1266 */     return this.fieldI0294MAN.getString();
/*      */   }
/*      */ 
/*      */   public void setI02A4MAN(String newvalue)
/*      */   {
/* 1274 */     this.fieldI02A4MAN.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI02A4MAN()
/*      */   {
/* 1282 */     return this.fieldI02A4MAN.getString();
/*      */   }
/*      */ 
/*      */   public void setI0214MA1(String newvalue)
/*      */   {
/* 1290 */     this.fieldI0214MA1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0214MA1()
/*      */   {
/* 1298 */     return this.fieldI0214MA1.getString();
/*      */   }
/*      */ 
/*      */   public void setI0224MA1(String newvalue)
/*      */   {
/* 1306 */     this.fieldI0224MA1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0224MA1()
/*      */   {
/* 1314 */     return this.fieldI0224MA1.getString();
/*      */   }
/*      */ 
/*      */   public void setI0234MA1(String newvalue)
/*      */   {
/* 1322 */     this.fieldI0234MA1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0234MA1()
/*      */   {
/* 1330 */     return this.fieldI0234MA1.getString();
/*      */   }
/*      */ 
/*      */   public void setI0244MA1(String newvalue)
/*      */   {
/* 1338 */     this.fieldI0244MA1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0244MA1()
/*      */   {
/* 1346 */     return this.fieldI0244MA1.getString();
/*      */   }
/*      */ 
/*      */   public void setI0254MA1(String newvalue)
/*      */   {
/* 1354 */     this.fieldI0254MA1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0254MA1()
/*      */   {
/* 1362 */     return this.fieldI0254MA1.getString();
/*      */   }
/*      */ 
/*      */   public void setI0264MA1(String newvalue)
/*      */   {
/* 1370 */     this.fieldI0264MA1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0264MA1()
/*      */   {
/* 1378 */     return this.fieldI0264MA1.getString();
/*      */   }
/*      */ 
/*      */   public void setI0274MA1(String newvalue)
/*      */   {
/* 1386 */     this.fieldI0274MA1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0274MA1()
/*      */   {
/* 1394 */     return this.fieldI0274MA1.getString();
/*      */   }
/*      */ 
/*      */   public void setI0284MA1(String newvalue)
/*      */   {
/* 1402 */     this.fieldI0284MA1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0284MA1()
/*      */   {
/* 1410 */     return this.fieldI0284MA1.getString();
/*      */   }
/*      */ 
/*      */   public void setI0294MA1(String newvalue)
/*      */   {
/* 1418 */     this.fieldI0294MA1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0294MA1()
/*      */   {
/* 1426 */     return this.fieldI0294MA1.getString();
/*      */   }
/*      */ 
/*      */   public void setI02A4MA1(String newvalue)
/*      */   {
/* 1434 */     this.fieldI02A4MA1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI02A4MA1()
/*      */   {
/* 1442 */     return this.fieldI02A4MA1.getString();
/*      */   }
/*      */ 
/*      */   public void setI0214MA2(String newvalue)
/*      */   {
/* 1450 */     this.fieldI0214MA2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0214MA2()
/*      */   {
/* 1458 */     return this.fieldI0214MA2.getString();
/*      */   }
/*      */ 
/*      */   public void setI0224MA2(String newvalue)
/*      */   {
/* 1466 */     this.fieldI0224MA2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0224MA2()
/*      */   {
/* 1474 */     return this.fieldI0224MA2.getString();
/*      */   }
/*      */ 
/*      */   public void setI0234MA2(String newvalue)
/*      */   {
/* 1482 */     this.fieldI0234MA2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0234MA2()
/*      */   {
/* 1490 */     return this.fieldI0234MA2.getString();
/*      */   }
/*      */ 
/*      */   public void setI0244MA2(String newvalue)
/*      */   {
/* 1498 */     this.fieldI0244MA2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0244MA2()
/*      */   {
/* 1506 */     return this.fieldI0244MA2.getString();
/*      */   }
/*      */ 
/*      */   public void setI0254MA2(String newvalue)
/*      */   {
/* 1514 */     this.fieldI0254MA2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0254MA2()
/*      */   {
/* 1522 */     return this.fieldI0254MA2.getString();
/*      */   }
/*      */ 
/*      */   public void setI0264MA2(String newvalue)
/*      */   {
/* 1530 */     this.fieldI0264MA2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0264MA2()
/*      */   {
/* 1538 */     return this.fieldI0264MA2.getString();
/*      */   }
/*      */ 
/*      */   public void setI0274MA2(String newvalue)
/*      */   {
/* 1546 */     this.fieldI0274MA2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0274MA2()
/*      */   {
/* 1554 */     return this.fieldI0274MA2.getString();
/*      */   }
/*      */ 
/*      */   public void setI0284MA2(String newvalue)
/*      */   {
/* 1562 */     this.fieldI0284MA2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0284MA2()
/*      */   {
/* 1570 */     return this.fieldI0284MA2.getString();
/*      */   }
/*      */ 
/*      */   public void setI0294MA2(String newvalue)
/*      */   {
/* 1578 */     this.fieldI0294MA2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0294MA2()
/*      */   {
/* 1586 */     return this.fieldI0294MA2.getString();
/*      */   }
/*      */ 
/*      */   public void setI02A4MA2(String newvalue)
/*      */   {
/* 1594 */     this.fieldI02A4MA2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI02A4MA2()
/*      */   {
/* 1602 */     return this.fieldI02A4MA2.getString();
/*      */   }
/*      */ 
/*      */   public void setI0214MA3(String newvalue)
/*      */   {
/* 1610 */     this.fieldI0214MA3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0214MA3()
/*      */   {
/* 1618 */     return this.fieldI0214MA3.getString();
/*      */   }
/*      */ 
/*      */   public void setI0224MA3(String newvalue)
/*      */   {
/* 1626 */     this.fieldI0224MA3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0224MA3()
/*      */   {
/* 1634 */     return this.fieldI0224MA3.getString();
/*      */   }
/*      */ 
/*      */   public void setI0234MA3(String newvalue)
/*      */   {
/* 1642 */     this.fieldI0234MA3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0234MA3()
/*      */   {
/* 1650 */     return this.fieldI0234MA3.getString();
/*      */   }
/*      */ 
/*      */   public void setI0244MA3(String newvalue)
/*      */   {
/* 1658 */     this.fieldI0244MA3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0244MA3()
/*      */   {
/* 1666 */     return this.fieldI0244MA3.getString();
/*      */   }
/*      */ 
/*      */   public void setI0254MA3(String newvalue)
/*      */   {
/* 1674 */     this.fieldI0254MA3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0254MA3()
/*      */   {
/* 1682 */     return this.fieldI0254MA3.getString();
/*      */   }
/*      */ 
/*      */   public void setI0264MA3(String newvalue)
/*      */   {
/* 1690 */     this.fieldI0264MA3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0264MA3()
/*      */   {
/* 1698 */     return this.fieldI0264MA3.getString();
/*      */   }
/*      */ 
/*      */   public void setI0274MA3(String newvalue)
/*      */   {
/* 1706 */     this.fieldI0274MA3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0274MA3()
/*      */   {
/* 1714 */     return this.fieldI0274MA3.getString();
/*      */   }
/*      */ 
/*      */   public void setI0284MA3(String newvalue)
/*      */   {
/* 1722 */     this.fieldI0284MA3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0284MA3()
/*      */   {
/* 1730 */     return this.fieldI0284MA3.getString();
/*      */   }
/*      */ 
/*      */   public void setI0294MA3(String newvalue)
/*      */   {
/* 1738 */     this.fieldI0294MA3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0294MA3()
/*      */   {
/* 1746 */     return this.fieldI0294MA3.getString();
/*      */   }
/*      */ 
/*      */   public void setI02A4MA3(String newvalue)
/*      */   {
/* 1754 */     this.fieldI02A4MA3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI02A4MA3()
/*      */   {
/* 1762 */     return this.fieldI02A4MA3.getString();
/*      */   }
/*      */ 
/*      */   public void setI0214MA4(String newvalue)
/*      */   {
/* 1770 */     this.fieldI0214MA4.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0214MA4()
/*      */   {
/* 1778 */     return this.fieldI0214MA4.getString();
/*      */   }
/*      */ 
/*      */   public void setI0224MA4(String newvalue)
/*      */   {
/* 1786 */     this.fieldI0224MA4.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0224MA4()
/*      */   {
/* 1794 */     return this.fieldI0224MA4.getString();
/*      */   }
/*      */ 
/*      */   public void setI0234MA4(String newvalue)
/*      */   {
/* 1802 */     this.fieldI0234MA4.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0234MA4()
/*      */   {
/* 1810 */     return this.fieldI0234MA4.getString();
/*      */   }
/*      */ 
/*      */   public void setI0244MA4(String newvalue)
/*      */   {
/* 1818 */     this.fieldI0244MA4.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0244MA4()
/*      */   {
/* 1826 */     return this.fieldI0244MA4.getString();
/*      */   }
/*      */ 
/*      */   public void setI0254MA4(String newvalue)
/*      */   {
/* 1834 */     this.fieldI0254MA4.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0254MA4()
/*      */   {
/* 1842 */     return this.fieldI0254MA4.getString();
/*      */   }
/*      */ 
/*      */   public void setI0264MA4(String newvalue)
/*      */   {
/* 1850 */     this.fieldI0264MA4.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0264MA4()
/*      */   {
/* 1858 */     return this.fieldI0264MA4.getString();
/*      */   }
/*      */ 
/*      */   public void setI0274MA4(String newvalue)
/*      */   {
/* 1866 */     this.fieldI0274MA4.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0274MA4()
/*      */   {
/* 1874 */     return this.fieldI0274MA4.getString();
/*      */   }
/*      */ 
/*      */   public void setI0284MA4(String newvalue)
/*      */   {
/* 1882 */     this.fieldI0284MA4.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0284MA4()
/*      */   {
/* 1890 */     return this.fieldI0284MA4.getString();
/*      */   }
/*      */ 
/*      */   public void setI0294MA4(String newvalue)
/*      */   {
/* 1898 */     this.fieldI0294MA4.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0294MA4()
/*      */   {
/* 1906 */     return this.fieldI0294MA4.getString();
/*      */   }
/*      */ 
/*      */   public void setI02A4MA4(String newvalue)
/*      */   {
/* 1914 */     this.fieldI02A4MA4.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI02A4MA4()
/*      */   {
/* 1922 */     return this.fieldI02A4MA4.getString();
/*      */   }
/*      */ 
/*      */   public void setI0214CTY(String newvalue)
/*      */   {
/* 1930 */     this.fieldI0214CTY.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0214CTY()
/*      */   {
/* 1938 */     return this.fieldI0214CTY.getString();
/*      */   }
/*      */ 
/*      */   public void setI0224CTY(String newvalue)
/*      */   {
/* 1946 */     this.fieldI0224CTY.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0224CTY()
/*      */   {
/* 1954 */     return this.fieldI0224CTY.getString();
/*      */   }
/*      */ 
/*      */   public void setI0234CTY(String newvalue)
/*      */   {
/* 1962 */     this.fieldI0234CTY.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0234CTY()
/*      */   {
/* 1970 */     return this.fieldI0234CTY.getString();
/*      */   }
/*      */ 
/*      */   public void setI0244CTY(String newvalue)
/*      */   {
/* 1978 */     this.fieldI0244CTY.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0244CTY()
/*      */   {
/* 1986 */     return this.fieldI0244CTY.getString();
/*      */   }
/*      */ 
/*      */   public void setI0254CTY(String newvalue)
/*      */   {
/* 1994 */     this.fieldI0254CTY.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0254CTY()
/*      */   {
/* 2002 */     return this.fieldI0254CTY.getString();
/*      */   }
/*      */ 
/*      */   public void setI0264CTY(String newvalue)
/*      */   {
/* 2010 */     this.fieldI0264CTY.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0264CTY()
/*      */   {
/* 2018 */     return this.fieldI0264CTY.getString();
/*      */   }
/*      */ 
/*      */   public void setI0274CTY(String newvalue)
/*      */   {
/* 2026 */     this.fieldI0274CTY.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0274CTY()
/*      */   {
/* 2034 */     return this.fieldI0274CTY.getString();
/*      */   }
/*      */ 
/*      */   public void setI0284CTY(String newvalue)
/*      */   {
/* 2042 */     this.fieldI0284CTY.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0284CTY()
/*      */   {
/* 2050 */     return this.fieldI0284CTY.getString();
/*      */   }
/*      */ 
/*      */   public void setI0294CTY(String newvalue)
/*      */   {
/* 2058 */     this.fieldI0294CTY.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0294CTY()
/*      */   {
/* 2066 */     return this.fieldI0294CTY.getString();
/*      */   }
/*      */ 
/*      */   public void setI02A4CTY(String newvalue)
/*      */   {
/* 2074 */     this.fieldI02A4CTY.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI02A4CTY()
/*      */   {
/* 2082 */     return this.fieldI02A4CTY.getString();
/*      */   }
/*      */ 
/*      */   public void setI0214STE(String newvalue)
/*      */   {
/* 2090 */     this.fieldI0214STE.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0214STE()
/*      */   {
/* 2098 */     return this.fieldI0214STE.getString();
/*      */   }
/*      */ 
/*      */   public void setI0224STE(String newvalue)
/*      */   {
/* 2106 */     this.fieldI0224STE.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0224STE()
/*      */   {
/* 2114 */     return this.fieldI0224STE.getString();
/*      */   }
/*      */ 
/*      */   public void setI0234STE(String newvalue)
/*      */   {
/* 2122 */     this.fieldI0234STE.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0234STE()
/*      */   {
/* 2130 */     return this.fieldI0234STE.getString();
/*      */   }
/*      */ 
/*      */   public void setI0244STE(String newvalue)
/*      */   {
/* 2138 */     this.fieldI0244STE.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0244STE()
/*      */   {
/* 2146 */     return this.fieldI0244STE.getString();
/*      */   }
/*      */ 
/*      */   public void setI0254STE(String newvalue)
/*      */   {
/* 2154 */     this.fieldI0254STE.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0254STE()
/*      */   {
/* 2162 */     return this.fieldI0254STE.getString();
/*      */   }
/*      */ 
/*      */   public void setI0264STE(String newvalue)
/*      */   {
/* 2170 */     this.fieldI0264STE.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0264STE()
/*      */   {
/* 2178 */     return this.fieldI0264STE.getString();
/*      */   }
/*      */ 
/*      */   public void setI0274STE(String newvalue)
/*      */   {
/* 2186 */     this.fieldI0274STE.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0274STE()
/*      */   {
/* 2194 */     return this.fieldI0274STE.getString();
/*      */   }
/*      */ 
/*      */   public void setI0284STE(String newvalue)
/*      */   {
/* 2202 */     this.fieldI0284STE.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0284STE()
/*      */   {
/* 2210 */     return this.fieldI0284STE.getString();
/*      */   }
/*      */ 
/*      */   public void setI0294STE(String newvalue)
/*      */   {
/* 2218 */     this.fieldI0294STE.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0294STE()
/*      */   {
/* 2226 */     return this.fieldI0294STE.getString();
/*      */   }
/*      */ 
/*      */   public void setI02A4STE(String newvalue)
/*      */   {
/* 2234 */     this.fieldI02A4STE.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI02A4STE()
/*      */   {
/* 2242 */     return this.fieldI02A4STE.getString();
/*      */   }
/*      */ 
/*      */   public void setI0214ZPC(String newvalue)
/*      */   {
/* 2250 */     this.fieldI0214ZPC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0214ZPC()
/*      */   {
/* 2258 */     return this.fieldI0214ZPC.getString();
/*      */   }
/*      */ 
/*      */   public void setI0224ZPC(String newvalue)
/*      */   {
/* 2266 */     this.fieldI0224ZPC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0224ZPC()
/*      */   {
/* 2274 */     return this.fieldI0224ZPC.getString();
/*      */   }
/*      */ 
/*      */   public void setI0234ZPC(String newvalue)
/*      */   {
/* 2282 */     this.fieldI0234ZPC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0234ZPC()
/*      */   {
/* 2290 */     return this.fieldI0234ZPC.getString();
/*      */   }
/*      */ 
/*      */   public void setI0244ZPC(String newvalue)
/*      */   {
/* 2298 */     this.fieldI0244ZPC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0244ZPC()
/*      */   {
/* 2306 */     return this.fieldI0244ZPC.getString();
/*      */   }
/*      */ 
/*      */   public void setI0254ZPC(String newvalue)
/*      */   {
/* 2314 */     this.fieldI0254ZPC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0254ZPC()
/*      */   {
/* 2322 */     return this.fieldI0254ZPC.getString();
/*      */   }
/*      */ 
/*      */   public void setI0264ZPC(String newvalue)
/*      */   {
/* 2330 */     this.fieldI0264ZPC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0264ZPC()
/*      */   {
/* 2338 */     return this.fieldI0264ZPC.getString();
/*      */   }
/*      */ 
/*      */   public void setI0274ZPC(String newvalue)
/*      */   {
/* 2346 */     this.fieldI0274ZPC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0274ZPC()
/*      */   {
/* 2354 */     return this.fieldI0274ZPC.getString();
/*      */   }
/*      */ 
/*      */   public void setI0284ZPC(String newvalue)
/*      */   {
/* 2362 */     this.fieldI0284ZPC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0284ZPC()
/*      */   {
/* 2370 */     return this.fieldI0284ZPC.getString();
/*      */   }
/*      */ 
/*      */   public void setI0294ZPC(String newvalue)
/*      */   {
/* 2378 */     this.fieldI0294ZPC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0294ZPC()
/*      */   {
/* 2386 */     return this.fieldI0294ZPC.getString();
/*      */   }
/*      */ 
/*      */   public void setI02A4ZPC(String newvalue)
/*      */   {
/* 2394 */     this.fieldI02A4ZPC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI02A4ZPC()
/*      */   {
/* 2402 */     return this.fieldI02A4ZPC.getString();
/*      */   }
/*      */ 
/*      */   public void setI0214POB(String newvalue)
/*      */   {
/* 2410 */     this.fieldI0214POB.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0214POB()
/*      */   {
/* 2418 */     return this.fieldI0214POB.getString();
/*      */   }
/*      */ 
/*      */   public void setI0224POB(String newvalue)
/*      */   {
/* 2426 */     this.fieldI0224POB.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0224POB()
/*      */   {
/* 2434 */     return this.fieldI0224POB.getString();
/*      */   }
/*      */ 
/*      */   public void setI0234POB(String newvalue)
/*      */   {
/* 2442 */     this.fieldI0234POB.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0234POB()
/*      */   {
/* 2450 */     return this.fieldI0234POB.getString();
/*      */   }
/*      */ 
/*      */   public void setI0244POB(String newvalue)
/*      */   {
/* 2458 */     this.fieldI0244POB.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0244POB()
/*      */   {
/* 2466 */     return this.fieldI0244POB.getString();
/*      */   }
/*      */ 
/*      */   public void setI0254POB(String newvalue)
/*      */   {
/* 2474 */     this.fieldI0254POB.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0254POB()
/*      */   {
/* 2482 */     return this.fieldI0254POB.getString();
/*      */   }
/*      */ 
/*      */   public void setI0264POB(String newvalue)
/*      */   {
/* 2490 */     this.fieldI0264POB.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0264POB()
/*      */   {
/* 2498 */     return this.fieldI0264POB.getString();
/*      */   }
/*      */ 
/*      */   public void setI0274POB(String newvalue)
/*      */   {
/* 2506 */     this.fieldI0274POB.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0274POB()
/*      */   {
/* 2514 */     return this.fieldI0274POB.getString();
/*      */   }
/*      */ 
/*      */   public void setI0284POB(String newvalue)
/*      */   {
/* 2522 */     this.fieldI0284POB.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0284POB()
/*      */   {
/* 2530 */     return this.fieldI0284POB.getString();
/*      */   }
/*      */ 
/*      */   public void setI0294POB(String newvalue)
/*      */   {
/* 2538 */     this.fieldI0294POB.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0294POB()
/*      */   {
/* 2546 */     return this.fieldI0294POB.getString();
/*      */   }
/*      */ 
/*      */   public void setI02A4POB(String newvalue)
/*      */   {
/* 2554 */     this.fieldI02A4POB.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI02A4POB()
/*      */   {
/* 2562 */     return this.fieldI02A4POB.getString();
/*      */   }
/*      */ 
/*      */   public void setI0214CTR(String newvalue)
/*      */   {
/* 2570 */     this.fieldI0214CTR.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0214CTR()
/*      */   {
/* 2578 */     return this.fieldI0214CTR.getString();
/*      */   }
/*      */ 
/*      */   public void setI0224CTR(String newvalue)
/*      */   {
/* 2586 */     this.fieldI0224CTR.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0224CTR()
/*      */   {
/* 2594 */     return this.fieldI0224CTR.getString();
/*      */   }
/*      */ 
/*      */   public void setI0234CTR(String newvalue)
/*      */   {
/* 2602 */     this.fieldI0234CTR.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0234CTR()
/*      */   {
/* 2610 */     return this.fieldI0234CTR.getString();
/*      */   }
/*      */ 
/*      */   public void setI0244CTR(String newvalue)
/*      */   {
/* 2618 */     this.fieldI0244CTR.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0244CTR()
/*      */   {
/* 2626 */     return this.fieldI0244CTR.getString();
/*      */   }
/*      */ 
/*      */   public void setI0254CTR(String newvalue)
/*      */   {
/* 2634 */     this.fieldI0254CTR.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0254CTR()
/*      */   {
/* 2642 */     return this.fieldI0254CTR.getString();
/*      */   }
/*      */ 
/*      */   public void setI0264CTR(String newvalue)
/*      */   {
/* 2650 */     this.fieldI0264CTR.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0264CTR()
/*      */   {
/* 2658 */     return this.fieldI0264CTR.getString();
/*      */   }
/*      */ 
/*      */   public void setI0274CTR(String newvalue)
/*      */   {
/* 2666 */     this.fieldI0274CTR.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0274CTR()
/*      */   {
/* 2674 */     return this.fieldI0274CTR.getString();
/*      */   }
/*      */ 
/*      */   public void setI0284CTR(String newvalue)
/*      */   {
/* 2682 */     this.fieldI0284CTR.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0284CTR()
/*      */   {
/* 2690 */     return this.fieldI0284CTR.getString();
/*      */   }
/*      */ 
/*      */   public void setI0294CTR(String newvalue)
/*      */   {
/* 2698 */     this.fieldI0294CTR.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI0294CTR()
/*      */   {
/* 2706 */     return this.fieldI0294CTR.getString();
/*      */   }
/*      */ 
/*      */   public void setI02A4CTR(String newvalue)
/*      */   {
/* 2714 */     this.fieldI02A4CTR.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI02A4CTR()
/*      */   {
/* 2722 */     return this.fieldI02A4CTR.getString();
/*      */   }
/*      */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.ISD008002Message
 * JD-Core Version:    0.6.0
 */