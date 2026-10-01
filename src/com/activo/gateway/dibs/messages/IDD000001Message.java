/*      */ package com.activo.gateway.dibs.messages;
/*      */ 
/*      */ import java.math.BigDecimal;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*      */ 
/*      */ public class IDD000001Message extends MessageRecord
/*      */ {
/*   19 */   final int FIELDCOUNT = 58;
/*   20 */   private CharacterField fieldI01USER = null;
/*   21 */   private CharacterField fieldI01PROKEY = null;
/*   22 */   private CharacterField fieldI01ACMPRO = null;
/*   23 */   private CharacterField fieldI01ACMBNK = null;
/*   24 */   private CharacterField fieldI01ACMBRN = null;
/*   25 */   private CharacterField fieldI01ACMCCY = null;
/*   26 */   private CharacterField fieldI01ACMATY = null;
/*   27 */   private CharacterField fieldI01ACMSTF = null;
/*   28 */   private CharacterField fieldI01ACMSDY = null;
/*   29 */   private CharacterField fieldI01ACMATM = null;
/*   30 */   private DecimalField fieldI01ACMNCH = null;
/*   31 */   private CharacterField fieldI01ACMHSF = null;
/*   32 */   private DecimalField fieldI01OFFAC1 = null;
/*   33 */   private DecimalField fieldI01OFFAM1 = null;
/*   34 */   private DecimalField fieldI01LDMCDP = null;
/*   35 */   private DecimalField fieldI01LDMCDA = null;
/*   36 */   private DecimalField fieldI01LDMKDP = null;
/*   37 */   private DecimalField fieldI01LDMKDA = null;
/*   38 */   private DecimalField fieldI01LDMCWD = null;
/*   39 */   private DecimalField fieldI01LDMCWA = null;
/*   40 */   private DecimalField fieldI01LDMCPY = null;
/*   41 */   private DecimalField fieldI01LDMCPA = null;
/*   42 */   private DecimalField fieldI01LDMTIN = null;
/*   43 */   private DecimalField fieldI01LDMTIA = null;
/*   44 */   private DecimalField fieldI01LDMTRV = null;
/*   45 */   private DecimalField fieldI01LDMTRA = null;
/*   46 */   private DecimalField fieldI01LDMGAV = null;
/*   47 */   private DecimalField fieldI01LDMNAV = null;
/*   48 */   private CharacterField fieldI01CUSMA1 = null;
/*   49 */   private CharacterField fieldI01CUSMA2 = null;
/*   50 */   private CharacterField fieldI01CUSMA3 = null;
/*   51 */   private CharacterField fieldI01CUSMA4 = null;
/*   52 */   private CharacterField fieldI01CUSMA5 = null;
/*   53 */   private CharacterField fieldI01CUMTID = null;
/*   54 */   private CharacterField fieldI01CUMPID = null;
/*   55 */   private CharacterField fieldI01CUMBNI = null;
/*   56 */   private CharacterField fieldI01CUMMA1 = null;
/*   57 */   private CharacterField fieldI01CUMMA2 = null;
/*   58 */   private CharacterField fieldI01CUMMA3 = null;
/*   59 */   private CharacterField fieldI01CUMMA4 = null;
/*   60 */   private CharacterField fieldI01CUMMA5 = null;
/*   61 */   private DecimalField fieldI01CUMHPN = null;
/*   62 */   private DecimalField fieldI01CUMWPN = null;
/*   63 */   private CharacterField fieldI01SPI01 = null;
/*   64 */   private CharacterField fieldI01SPI02 = null;
/*   65 */   private CharacterField fieldI01SPI03 = null;
/*   66 */   private CharacterField fieldI01SPI04 = null;
/*   67 */   private CharacterField fieldI01SPI05 = null;
/*   68 */   private CharacterField fieldI01SPI06 = null;
/*   69 */   private CharacterField fieldI01SPI07 = null;
/*   70 */   private CharacterField fieldI01SPI08 = null;
/*   71 */   private CharacterField fieldI01SPI09 = null;
/*   72 */   private CharacterField fieldI01SPI10 = null;
/*   73 */   private CharacterField fieldI01SPI11 = null;
/*   74 */   private CharacterField fieldI01SPI12 = null;
/*   75 */   private CharacterField fieldI01SPI13 = null;
/*   76 */   private CharacterField fieldI01SPI14 = null;
/*   77 */   private CharacterField fieldI01SPI15 = null;
/*      */ 
/*      */   public IDD000001Message()
/*      */   {
/*   84 */     createFields();
/*   85 */     initialize();
/*      */   }
/*      */ 
/*      */   protected void createFields()
/*      */   {
/*   94 */     this.recordsize = 1820;
/*   95 */     this.fileid = "1010413132023";
/*   96 */     this.recordid = "44A57DB3BF35E";
/*   97 */     this.message = new byte[getByteLength()];
/*   98 */     this.formatname = "IDD000001";
/*   99 */     this.fieldnames = new String[58];
/*  100 */     this.tagnames = new String[58];
/*  101 */     this.fields = new MessageField[58];
/*      */ 
/*  103 */     this.fieldnames[0] = "I01USER";
/*  104 */     this.tagnames[0] = "I01USER";
/*      */      this.fields[0]=this.fieldI01USER=new CharacterField(this.message, 10, 10, "I01USER");
/*      */ 
/*  107 */     this.fieldnames[1] = "I01PROKEY";
/*  108 */     this.tagnames[1] = "I01PROKEY";
/*      */      this.fields[1]=this.fieldI01PROKEY=new CharacterField(this.message, 20, 9, "I01PROKEY");
/*      */ 
/*  111 */     this.fieldnames[2] = "I01ACMPRO";
/*  112 */     this.tagnames[2] = "I01ACMPRO";
/*      */      this.fields[2]=this.fieldI01ACMPRO=new CharacterField(this.message, 29, 4, "I01ACMPRO");
/*      */ 
/*  115 */     this.fieldnames[3] = "I01ACMBNK";
/*  116 */     this.tagnames[3] = "I01ACMBNK";
/*      */      this.fields[3]=this.fieldI01ACMBNK=new CharacterField(this.message, 33, 1, "I01ACMBNK");
/*      */ 
/*  119 */     this.fieldnames[4] = "I01ACMBRN";
/*  120 */     this.tagnames[4] = "I01ACMBRN";
/*      */      this.fields[4]=this.fieldI01ACMBRN=new CharacterField(this.message, 34, 1, "I01ACMBRN");
/*      */ 
/*  123 */     this.fieldnames[5] = "I01ACMCCY";
/*  124 */     this.tagnames[5] = "I01ACMCCY";
/*      */      this.fields[5]=this.fieldI01ACMCCY=new CharacterField(this.message, 35, 1, "I01ACMCCY");
/*      */ 
/*  127 */     this.fieldnames[6] = "I01ACMATY";
/*  128 */     this.tagnames[6] = "I01ACMATY";
/*      */      this.fields[6]=this.fieldI01ACMATY=new CharacterField(this.message, 36, 3, "I01ACMATY");
/*      */ 
/*  131 */     this.fieldnames[7] = "I01ACMSTF";
/*  132 */     this.tagnames[7] = "I01ACMSTF";
/*      */      this.fields[7]=this.fieldI01ACMSTF=new CharacterField(this.message, 39, 1, "I01ACMSTF");
/*      */ 
/*  135 */     this.fieldnames[8] = "I01ACMSDY";
/*  136 */     this.tagnames[8] = "I01ACMSDY";
/*      */      this.fields[8]=this.fieldI01ACMSDY=new CharacterField(this.message, 40, 2, "I01ACMSDY");
/*      */ 
/*  139 */     this.fieldnames[9] = "I01ACMATM";
/*  140 */     this.tagnames[9] = "I01ACMATM";
/*      */      this.fields[9]=this.fieldI01ACMATM=new CharacterField(this.message, 42, 1, "I01ACMATM");
/*      */ 
/*  143 */     this.fieldnames[10] = "I01ACMNCH";
/*  144 */     this.tagnames[10] = "I01ACMNCH";
/*      */      this.fields[10]=this.fieldI01ACMNCH=new DecimalField(this.message, 43, 3, 0, "I01ACMNCH");
/*      */ 
/*  147 */     this.fieldnames[11] = "I01ACMHSF";
/*  148 */     this.tagnames[11] = "I01ACMHSF";
/*      */      this.fields[11]=this.fieldI01ACMHSF=new CharacterField(this.message, 46, 1, "I01ACMHSF");
/*      */ 
/*  151 */     this.fieldnames[12] = "I01OFFAC1";
/*  152 */     this.tagnames[12] = "I01OFFAC1";
/*      */      this.fields[12]=this.fieldI01OFFAC1=new DecimalField(this.message, 47, 13, 0, "I01OFFAC1");
/*      */ 
/*  155 */     this.fieldnames[13] = "I01OFFAM1";
/*  156 */     this.tagnames[13] = "I01OFFAM1";
/*      */      this.fields[13]=this.fieldI01OFFAM1=new DecimalField(this.message, 60, 17, 2, "I01OFFAM1");
/*      */ 
/*  159 */     this.fieldnames[14] = "I01LDMCDP";
/*  160 */     this.tagnames[14] = "I01LDMCDP";
/*      */      this.fields[14]=this.fieldI01LDMCDP=new DecimalField(this.message, 77, 6, 0, "I01LDMCDP");
/*      */ 
/*  163 */     this.fieldnames[15] = "I01LDMCDA";
/*  164 */     this.tagnames[15] = "I01LDMCDA";
/*      */      this.fields[15]=this.fieldI01LDMCDA=new DecimalField(this.message, 83, 15, 2, "I01LDMCDA");
/*      */ 
/*  167 */     this.fieldnames[16] = "I01LDMKDP";
/*  168 */     this.tagnames[16] = "I01LDMKDP";
/*      */      this.fields[16]=this.fieldI01LDMKDP=new DecimalField(this.message, 98, 6, 0, "I01LDMKDP");
/*      */ 
/*  171 */     this.fieldnames[17] = "I01LDMKDA";
/*  172 */     this.tagnames[17] = "I01LDMKDA";
/*      */      this.fields[17]=this.fieldI01LDMKDA=new DecimalField(this.message, 104, 15, 2, "I01LDMKDA");
/*      */ 
/*  175 */     this.fieldnames[18] = "I01LDMCWD";
/*  176 */     this.tagnames[18] = "I01LDMCWD";
/*      */      this.fields[18]=this.fieldI01LDMCWD=new DecimalField(this.message, 119, 6, 0, "I01LDMCWD");
/*      */ 
/*  179 */     this.fieldnames[19] = "I01LDMCWA";
/*  180 */     this.tagnames[19] = "I01LDMCWA";
/*      */      this.fields[19]=this.fieldI01LDMCWA=new DecimalField(this.message, 125, 15, 2, "I01LDMCWA");
/*      */ 
/*  183 */     this.fieldnames[20] = "I01LDMCPY";
/*  184 */     this.tagnames[20] = "I01LDMCPY";
/*      */      this.fields[20]=this.fieldI01LDMCPY=new DecimalField(this.message, 140, 6, 0, "I01LDMCPY");
/*      */ 
/*  187 */     this.fieldnames[21] = "I01LDMCPA";
/*  188 */     this.tagnames[21] = "I01LDMCPA";
/*      */      this.fields[21]=this.fieldI01LDMCPA=new DecimalField(this.message, 146, 15, 2, "I01LDMCPA");
/*      */ 
/*  191 */     this.fieldnames[22] = "I01LDMTIN";
/*  192 */     this.tagnames[22] = "I01LDMTIN";
/*      */      this.fields[22]=this.fieldI01LDMTIN=new DecimalField(this.message, 161, 6, 0, "I01LDMTIN");
/*      */ 
/*  195 */     this.fieldnames[23] = "I01LDMTIA";
/*  196 */     this.tagnames[23] = "I01LDMTIA";
/*      */      this.fields[23]=this.fieldI01LDMTIA=new DecimalField(this.message, 167, 15, 2, "I01LDMTIA");
/*      */ 
/*  199 */     this.fieldnames[24] = "I01LDMTRV";
/*  200 */     this.tagnames[24] = "I01LDMTRV";
/*      */      this.fields[24]=this.fieldI01LDMTRV=new DecimalField(this.message, 182, 6, 0, "I01LDMTRV");
/*      */ 
/*  203 */     this.fieldnames[25] = "I01LDMTRA";
/*  204 */     this.tagnames[25] = "I01LDMTRA";
/*      */      this.fields[25]=this.fieldI01LDMTRA=new DecimalField(this.message, 188, 15, 2, "I01LDMTRA");
/*      */ 
/*  207 */     this.fieldnames[26] = "I01LDMGAV";
/*  208 */     this.tagnames[26] = "I01LDMGAV";
/*      */      this.fields[26]=this.fieldI01LDMGAV=new DecimalField(this.message, 203, 15, 2, "I01LDMGAV");
/*      */ 
/*  211 */     this.fieldnames[27] = "I01LDMNAV";
/*  212 */     this.tagnames[27] = "I01LDMNAV";
/*      */      this.fields[27]=this.fieldI01LDMNAV=new DecimalField(this.message, 218, 15, 2, "I01LDMNAV");
/*      */ 
/*  215 */     this.fieldnames[28] = "I01CUSMA1";
/*  216 */     this.tagnames[28] = "I01CUSMA1";
/*      */      this.fields[28]=this.fieldI01CUSMA1=new CharacterField(this.message, 233, 35, "I01CUSMA1");
/*      */ 
/*  219 */     this.fieldnames[29] = "I01CUSMA2";
/*  220 */     this.tagnames[29] = "I01CUSMA2";
/*      */      this.fields[29]=this.fieldI01CUSMA2=new CharacterField(this.message, 268, 35, "I01CUSMA2");
/*      */ 
/*  223 */     this.fieldnames[30] = "I01CUSMA3";
/*  224 */     this.tagnames[30] = "I01CUSMA3";
/*      */      this.fields[30]=this.fieldI01CUSMA3=new CharacterField(this.message, 303, 35, "I01CUSMA3");
/*      */ 
/*  227 */     this.fieldnames[31] = "I01CUSMA4";
/*  228 */     this.tagnames[31] = "I01CUSMA4";
/*      */      this.fields[31]=this.fieldI01CUSMA4=new CharacterField(this.message, 338, 35, "I01CUSMA4");
/*      */ 
/*  231 */     this.fieldnames[32] = "I01CUSMA5";
/*  232 */     this.tagnames[32] = "I01CUSMA5";
/*      */      this.fields[32]=this.fieldI01CUSMA5=new CharacterField(this.message, 373, 35, "I01CUSMA5");
/*      */ 
/*  235 */     this.fieldnames[33] = "I01CUMTID";
/*  236 */     this.tagnames[33] = "I01CUMTID";
/*      */      this.fields[33]=this.fieldI01CUMTID=new CharacterField(this.message, 408, 4, "I01CUMTID");
/*      */ 
/*  239 */     this.fieldnames[34] = "I01CUMPID";
/*  240 */     this.tagnames[34] = "I01CUMPID";
/*      */      this.fields[34]=this.fieldI01CUMPID=new CharacterField(this.message, 412, 4, "I01CUMPID");
/*      */ 
/*  243 */     this.fieldnames[35] = "I01CUMBNI";
/*  244 */     this.tagnames[35] = "I01CUMBNI";
/*      */      this.fields[35]=this.fieldI01CUMBNI=new CharacterField(this.message, 416, 15, "I01CUMBNI");
/*      */ 
/*  247 */     this.fieldnames[36] = "I01CUMMA1";
/*  248 */     this.tagnames[36] = "I01CUMMA1";
/*      */      this.fields[36]=this.fieldI01CUMMA1=new CharacterField(this.message, 431, 35, "I01CUMMA1");
/*      */ 
/*  251 */     this.fieldnames[37] = "I01CUMMA2";
/*  252 */     this.tagnames[37] = "I01CUMMA2";
/*      */      this.fields[37]=this.fieldI01CUMMA2=new CharacterField(this.message, 466, 35, "I01CUMMA2");
/*      */ 
/*  255 */     this.fieldnames[38] = "I01CUMMA3";
/*  256 */     this.tagnames[38] = "I01CUMMA3";
/*      */      this.fields[38]=this.fieldI01CUMMA3=new CharacterField(this.message, 501, 35, "I01CUMMA3");
/*      */ 
/*  259 */     this.fieldnames[39] = "I01CUMMA4";
/*  260 */     this.tagnames[39] = "I01CUMMA4";
/*      */      this.fields[39]=this.fieldI01CUMMA4=new CharacterField(this.message, 536, 35, "I01CUMMA4");
/*      */ 
/*  263 */     this.fieldnames[40] = "I01CUMMA5";
/*  264 */     this.tagnames[40] = "I01CUMMA5";
/*      */      this.fields[40]=this.fieldI01CUMMA5=new CharacterField(this.message, 571, 35, "I01CUMMA5");
/*      */ 
/*  267 */     this.fieldnames[41] = "I01CUMHPN";
/*  268 */     this.tagnames[41] = "I01CUMHPN";
/*      */      this.fields[41]=this.fieldI01CUMHPN=new DecimalField(this.message, 606, 12, 0, "I01CUMHPN");
/*      */ 
/*  271 */     this.fieldnames[42] = "I01CUMWPN";
/*  272 */     this.tagnames[42] = "I01CUMWPN";
/*      */      this.fields[42]=this.fieldI01CUMWPN=new DecimalField(this.message, 618, 12, 0, "I01CUMWPN");
/*      */ 
/*  275 */     this.fieldnames[43] = "I01SPI01";
/*  276 */     this.tagnames[43] = "I01SPI01";
/*      */      this.fields[43]=this.fieldI01SPI01=new CharacterField(this.message, 630, 80, "I01SPI01");
/*      */ 
/*  279 */     this.fieldnames[44] = "I01SPI02";
/*  280 */     this.tagnames[44] = "I01SPI02";
/*      */      this.fields[44]=this.fieldI01SPI02=new CharacterField(this.message, 710, 80, "I01SPI02");
/*      */ 
/*  283 */     this.fieldnames[45] = "I01SPI03";
/*  284 */     this.tagnames[45] = "I01SPI03";
/*      */      this.fields[45]=this.fieldI01SPI03=new CharacterField(this.message, 790, 80, "I01SPI03");
/*      */ 
/*  287 */     this.fieldnames[46] = "I01SPI04";
/*  288 */     this.tagnames[46] = "I01SPI04";
/*      */      this.fields[46]=this.fieldI01SPI04=new CharacterField(this.message, 870, 80, "I01SPI04");
/*      */ 
/*  291 */     this.fieldnames[47] = "I01SPI05";
/*  292 */     this.tagnames[47] = "I01SPI05";
/*      */      this.fields[47]=this.fieldI01SPI05=new CharacterField(this.message, 950, 80, "I01SPI05");
/*      */ 
/*  295 */     this.fieldnames[48] = "I01SPI06";
/*  296 */     this.tagnames[48] = "I01SPI06";
/*      */      this.fields[48]=this.fieldI01SPI06=new CharacterField(this.message, 1030, 80, "I01SPI06");
/*      */ 
/*  299 */     this.fieldnames[49] = "I01SPI07";
/*  300 */     this.tagnames[49] = "I01SPI07";
/*      */      this.fields[49]=this.fieldI01SPI07=new CharacterField(this.message, 1110, 80, "I01SPI07");
/*      */ 
/*  303 */     this.fieldnames[50] = "I01SPI08";
/*  304 */     this.tagnames[50] = "I01SPI08";
/*      */      this.fields[50]=this.fieldI01SPI08=new CharacterField(this.message, 1190, 80, "I01SPI08");
/*      */ 
/*  307 */     this.fieldnames[51] = "I01SPI09";
/*  308 */     this.tagnames[51] = "I01SPI09";
/*      */      this.fields[51]=this.fieldI01SPI09=new CharacterField(this.message, 1270, 80, "I01SPI09");
/*      */ 
/*  311 */     this.fieldnames[52] = "I01SPI10";
/*  312 */     this.tagnames[52] = "I01SPI10";
/*      */      this.fields[52]=this.fieldI01SPI10=new CharacterField(this.message, 1350, 80, "I01SPI10");
/*      */ 
/*  315 */     this.fieldnames[53] = "I01SPI11";
/*  316 */     this.tagnames[53] = "I01SPI11";
/*      */      this.fields[53]=this.fieldI01SPI11=new CharacterField(this.message, 1430, 80, "I01SPI11");
/*      */ 
/*  319 */     this.fieldnames[54] = "I01SPI12";
/*  320 */     this.tagnames[54] = "I01SPI12";
/*      */      this.fields[54]=this.fieldI01SPI12=new CharacterField(this.message, 1510, 80, "I01SPI12");
/*      */ 
/*  323 */     this.fieldnames[55] = "I01SPI13";
/*  324 */     this.tagnames[55] = "I01SPI13";
/*      */      this.fields[55]=this.fieldI01SPI13=new CharacterField(this.message, 1590, 80, "I01SPI13");
/*      */ 
/*  327 */     this.fieldnames[56] = "I01SPI14";
/*  328 */     this.tagnames[56] = "I01SPI14";
/*      */      this.fields[56]=this.fieldI01SPI14=new CharacterField(this.message, 1670, 80, "I01SPI14");
/*      */ 
/*  331 */     this.fieldnames[57] = "I01SPI15";
/*  332 */     this.tagnames[57] = "I01SPI15";
/*      */      this.fields[57]=this.fieldI01SPI15=new CharacterField(this.message, 1750, 80, "I01SPI15");
/*      */   }
/*      */ 
/*      */   public void setI01USER(String newvalue)
/*      */   {
/*  342 */     this.fieldI01USER.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01USER()
/*      */   {
/*  350 */     return this.fieldI01USER.getString();
/*      */   }
/*      */ 
/*      */   public void setI01PROKEY(String newvalue)
/*      */   {
/*  358 */     this.fieldI01PROKEY.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01PROKEY()
/*      */   {
/*  366 */     return this.fieldI01PROKEY.getString();
/*      */   }
/*      */ 
/*      */   public void setI01ACMPRO(String newvalue)
/*      */   {
/*  374 */     this.fieldI01ACMPRO.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01ACMPRO()
/*      */   {
/*  382 */     return this.fieldI01ACMPRO.getString();
/*      */   }
/*      */ 
/*      */   public void setI01ACMBNK(String newvalue)
/*      */   {
/*  390 */     this.fieldI01ACMBNK.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01ACMBNK()
/*      */   {
/*  398 */     return this.fieldI01ACMBNK.getString();
/*      */   }
/*      */ 
/*      */   public void setI01ACMBRN(String newvalue)
/*      */   {
/*  406 */     this.fieldI01ACMBRN.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01ACMBRN()
/*      */   {
/*  414 */     return this.fieldI01ACMBRN.getString();
/*      */   }
/*      */ 
/*      */   public void setI01ACMCCY(String newvalue)
/*      */   {
/*  422 */     this.fieldI01ACMCCY.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01ACMCCY()
/*      */   {
/*  430 */     return this.fieldI01ACMCCY.getString();
/*      */   }
/*      */ 
/*      */   public void setI01ACMATY(String newvalue)
/*      */   {
/*  438 */     this.fieldI01ACMATY.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01ACMATY()
/*      */   {
/*  446 */     return this.fieldI01ACMATY.getString();
/*      */   }
/*      */ 
/*      */   public void setI01ACMSTF(String newvalue)
/*      */   {
/*  454 */     this.fieldI01ACMSTF.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01ACMSTF()
/*      */   {
/*  462 */     return this.fieldI01ACMSTF.getString();
/*      */   }
/*      */ 
/*      */   public void setI01ACMSDY(String newvalue)
/*      */   {
/*  470 */     this.fieldI01ACMSDY.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01ACMSDY()
/*      */   {
/*  478 */     return this.fieldI01ACMSDY.getString();
/*      */   }
/*      */ 
/*      */   public void setI01ACMATM(String newvalue)
/*      */   {
/*  486 */     this.fieldI01ACMATM.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01ACMATM()
/*      */   {
/*  494 */     return this.fieldI01ACMATM.getString();
/*      */   }
/*      */ 
/*      */   public void setI01ACMNCH(String newvalue)
/*      */   {
/*  502 */     this.fieldI01ACMNCH.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01ACMNCH()
/*      */   {
/*  510 */     return this.fieldI01ACMNCH.getString();
/*      */   }
/*      */ 
/*      */   public void setI01ACMNCH(BigDecimal newvalue)
/*      */   {
/*  518 */     this.fieldI01ACMNCH.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalI01ACMNCH()
/*      */   {
/*  526 */     return this.fieldI01ACMNCH.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setI01ACMHSF(String newvalue)
/*      */   {
/*  534 */     this.fieldI01ACMHSF.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01ACMHSF()
/*      */   {
/*  542 */     return this.fieldI01ACMHSF.getString();
/*      */   }
/*      */ 
/*      */   public void setI01OFFAC1(String newvalue)
/*      */   {
/*  550 */     this.fieldI01OFFAC1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01OFFAC1()
/*      */   {
/*  558 */     return this.fieldI01OFFAC1.getString();
/*      */   }
/*      */ 
/*      */   public void setI01OFFAC1(BigDecimal newvalue)
/*      */   {
/*  566 */     this.fieldI01OFFAC1.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalI01OFFAC1()
/*      */   {
/*  574 */     return this.fieldI01OFFAC1.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setI01OFFAM1(String newvalue)
/*      */   {
/*  582 */     this.fieldI01OFFAM1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01OFFAM1()
/*      */   {
/*  590 */     return this.fieldI01OFFAM1.getString();
/*      */   }
/*      */ 
/*      */   public void setI01OFFAM1(BigDecimal newvalue)
/*      */   {
/*  598 */     this.fieldI01OFFAM1.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalI01OFFAM1()
/*      */   {
/*  606 */     return this.fieldI01OFFAM1.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setI01LDMCDP(String newvalue)
/*      */   {
/*  614 */     this.fieldI01LDMCDP.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01LDMCDP()
/*      */   {
/*  622 */     return this.fieldI01LDMCDP.getString();
/*      */   }
/*      */ 
/*      */   public void setI01LDMCDP(BigDecimal newvalue)
/*      */   {
/*  630 */     this.fieldI01LDMCDP.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalI01LDMCDP()
/*      */   {
/*  638 */     return this.fieldI01LDMCDP.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setI01LDMCDA(String newvalue)
/*      */   {
/*  646 */     this.fieldI01LDMCDA.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01LDMCDA()
/*      */   {
/*  654 */     return this.fieldI01LDMCDA.getString();
/*      */   }
/*      */ 
/*      */   public void setI01LDMCDA(BigDecimal newvalue)
/*      */   {
/*  662 */     this.fieldI01LDMCDA.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalI01LDMCDA()
/*      */   {
/*  670 */     return this.fieldI01LDMCDA.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setI01LDMKDP(String newvalue)
/*      */   {
/*  678 */     this.fieldI01LDMKDP.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01LDMKDP()
/*      */   {
/*  686 */     return this.fieldI01LDMKDP.getString();
/*      */   }
/*      */ 
/*      */   public void setI01LDMKDP(BigDecimal newvalue)
/*      */   {
/*  694 */     this.fieldI01LDMKDP.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalI01LDMKDP()
/*      */   {
/*  702 */     return this.fieldI01LDMKDP.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setI01LDMKDA(String newvalue)
/*      */   {
/*  710 */     this.fieldI01LDMKDA.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01LDMKDA()
/*      */   {
/*  718 */     return this.fieldI01LDMKDA.getString();
/*      */   }
/*      */ 
/*      */   public void setI01LDMKDA(BigDecimal newvalue)
/*      */   {
/*  726 */     this.fieldI01LDMKDA.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalI01LDMKDA()
/*      */   {
/*  734 */     return this.fieldI01LDMKDA.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setI01LDMCWD(String newvalue)
/*      */   {
/*  742 */     this.fieldI01LDMCWD.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01LDMCWD()
/*      */   {
/*  750 */     return this.fieldI01LDMCWD.getString();
/*      */   }
/*      */ 
/*      */   public void setI01LDMCWD(BigDecimal newvalue)
/*      */   {
/*  758 */     this.fieldI01LDMCWD.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalI01LDMCWD()
/*      */   {
/*  766 */     return this.fieldI01LDMCWD.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setI01LDMCWA(String newvalue)
/*      */   {
/*  774 */     this.fieldI01LDMCWA.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01LDMCWA()
/*      */   {
/*  782 */     return this.fieldI01LDMCWA.getString();
/*      */   }
/*      */ 
/*      */   public void setI01LDMCWA(BigDecimal newvalue)
/*      */   {
/*  790 */     this.fieldI01LDMCWA.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalI01LDMCWA()
/*      */   {
/*  798 */     return this.fieldI01LDMCWA.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setI01LDMCPY(String newvalue)
/*      */   {
/*  806 */     this.fieldI01LDMCPY.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01LDMCPY()
/*      */   {
/*  814 */     return this.fieldI01LDMCPY.getString();
/*      */   }
/*      */ 
/*      */   public void setI01LDMCPY(BigDecimal newvalue)
/*      */   {
/*  822 */     this.fieldI01LDMCPY.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalI01LDMCPY()
/*      */   {
/*  830 */     return this.fieldI01LDMCPY.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setI01LDMCPA(String newvalue)
/*      */   {
/*  838 */     this.fieldI01LDMCPA.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01LDMCPA()
/*      */   {
/*  846 */     return this.fieldI01LDMCPA.getString();
/*      */   }
/*      */ 
/*      */   public void setI01LDMCPA(BigDecimal newvalue)
/*      */   {
/*  854 */     this.fieldI01LDMCPA.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalI01LDMCPA()
/*      */   {
/*  862 */     return this.fieldI01LDMCPA.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setI01LDMTIN(String newvalue)
/*      */   {
/*  870 */     this.fieldI01LDMTIN.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01LDMTIN()
/*      */   {
/*  878 */     return this.fieldI01LDMTIN.getString();
/*      */   }
/*      */ 
/*      */   public void setI01LDMTIN(BigDecimal newvalue)
/*      */   {
/*  886 */     this.fieldI01LDMTIN.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalI01LDMTIN()
/*      */   {
/*  894 */     return this.fieldI01LDMTIN.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setI01LDMTIA(String newvalue)
/*      */   {
/*  902 */     this.fieldI01LDMTIA.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01LDMTIA()
/*      */   {
/*  910 */     return this.fieldI01LDMTIA.getString();
/*      */   }
/*      */ 
/*      */   public void setI01LDMTIA(BigDecimal newvalue)
/*      */   {
/*  918 */     this.fieldI01LDMTIA.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalI01LDMTIA()
/*      */   {
/*  926 */     return this.fieldI01LDMTIA.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setI01LDMTRV(String newvalue)
/*      */   {
/*  934 */     this.fieldI01LDMTRV.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01LDMTRV()
/*      */   {
/*  942 */     return this.fieldI01LDMTRV.getString();
/*      */   }
/*      */ 
/*      */   public void setI01LDMTRV(BigDecimal newvalue)
/*      */   {
/*  950 */     this.fieldI01LDMTRV.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalI01LDMTRV()
/*      */   {
/*  958 */     return this.fieldI01LDMTRV.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setI01LDMTRA(String newvalue)
/*      */   {
/*  966 */     this.fieldI01LDMTRA.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01LDMTRA()
/*      */   {
/*  974 */     return this.fieldI01LDMTRA.getString();
/*      */   }
/*      */ 
/*      */   public void setI01LDMTRA(BigDecimal newvalue)
/*      */   {
/*  982 */     this.fieldI01LDMTRA.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalI01LDMTRA()
/*      */   {
/*  990 */     return this.fieldI01LDMTRA.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setI01LDMGAV(String newvalue)
/*      */   {
/*  998 */     this.fieldI01LDMGAV.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01LDMGAV()
/*      */   {
/* 1006 */     return this.fieldI01LDMGAV.getString();
/*      */   }
/*      */ 
/*      */   public void setI01LDMGAV(BigDecimal newvalue)
/*      */   {
/* 1014 */     this.fieldI01LDMGAV.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalI01LDMGAV()
/*      */   {
/* 1022 */     return this.fieldI01LDMGAV.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setI01LDMNAV(String newvalue)
/*      */   {
/* 1030 */     this.fieldI01LDMNAV.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01LDMNAV()
/*      */   {
/* 1038 */     return this.fieldI01LDMNAV.getString();
/*      */   }
/*      */ 
/*      */   public void setI01LDMNAV(BigDecimal newvalue)
/*      */   {
/* 1046 */     this.fieldI01LDMNAV.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalI01LDMNAV()
/*      */   {
/* 1054 */     return this.fieldI01LDMNAV.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setI01CUSMA1(String newvalue)
/*      */   {
/* 1062 */     this.fieldI01CUSMA1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01CUSMA1()
/*      */   {
/* 1070 */     return this.fieldI01CUSMA1.getString();
/*      */   }
/*      */ 
/*      */   public void setI01CUSMA2(String newvalue)
/*      */   {
/* 1078 */     this.fieldI01CUSMA2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01CUSMA2()
/*      */   {
/* 1086 */     return this.fieldI01CUSMA2.getString();
/*      */   }
/*      */ 
/*      */   public void setI01CUSMA3(String newvalue)
/*      */   {
/* 1094 */     this.fieldI01CUSMA3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01CUSMA3()
/*      */   {
/* 1102 */     return this.fieldI01CUSMA3.getString();
/*      */   }
/*      */ 
/*      */   public void setI01CUSMA4(String newvalue)
/*      */   {
/* 1110 */     this.fieldI01CUSMA4.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01CUSMA4()
/*      */   {
/* 1118 */     return this.fieldI01CUSMA4.getString();
/*      */   }
/*      */ 
/*      */   public void setI01CUSMA5(String newvalue)
/*      */   {
/* 1126 */     this.fieldI01CUSMA5.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01CUSMA5()
/*      */   {
/* 1134 */     return this.fieldI01CUSMA5.getString();
/*      */   }
/*      */ 
/*      */   public void setI01CUMTID(String newvalue)
/*      */   {
/* 1142 */     this.fieldI01CUMTID.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01CUMTID()
/*      */   {
/* 1150 */     return this.fieldI01CUMTID.getString();
/*      */   }
/*      */ 
/*      */   public void setI01CUMPID(String newvalue)
/*      */   {
/* 1158 */     this.fieldI01CUMPID.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01CUMPID()
/*      */   {
/* 1166 */     return this.fieldI01CUMPID.getString();
/*      */   }
/*      */ 
/*      */   public void setI01CUMBNI(String newvalue)
/*      */   {
/* 1174 */     this.fieldI01CUMBNI.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01CUMBNI()
/*      */   {
/* 1182 */     return this.fieldI01CUMBNI.getString();
/*      */   }
/*      */ 
/*      */   public void setI01CUMMA1(String newvalue)
/*      */   {
/* 1190 */     this.fieldI01CUMMA1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01CUMMA1()
/*      */   {
/* 1198 */     return this.fieldI01CUMMA1.getString();
/*      */   }
/*      */ 
/*      */   public void setI01CUMMA2(String newvalue)
/*      */   {
/* 1206 */     this.fieldI01CUMMA2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01CUMMA2()
/*      */   {
/* 1214 */     return this.fieldI01CUMMA2.getString();
/*      */   }
/*      */ 
/*      */   public void setI01CUMMA3(String newvalue)
/*      */   {
/* 1222 */     this.fieldI01CUMMA3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01CUMMA3()
/*      */   {
/* 1230 */     return this.fieldI01CUMMA3.getString();
/*      */   }
/*      */ 
/*      */   public void setI01CUMMA4(String newvalue)
/*      */   {
/* 1238 */     this.fieldI01CUMMA4.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01CUMMA4()
/*      */   {
/* 1246 */     return this.fieldI01CUMMA4.getString();
/*      */   }
/*      */ 
/*      */   public void setI01CUMMA5(String newvalue)
/*      */   {
/* 1254 */     this.fieldI01CUMMA5.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01CUMMA5()
/*      */   {
/* 1262 */     return this.fieldI01CUMMA5.getString();
/*      */   }
/*      */ 
/*      */   public void setI01CUMHPN(String newvalue)
/*      */   {
/* 1270 */     this.fieldI01CUMHPN.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01CUMHPN()
/*      */   {
/* 1278 */     return this.fieldI01CUMHPN.getString();
/*      */   }
/*      */ 
/*      */   public void setI01CUMHPN(BigDecimal newvalue)
/*      */   {
/* 1286 */     this.fieldI01CUMHPN.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalI01CUMHPN()
/*      */   {
/* 1294 */     return this.fieldI01CUMHPN.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setI01CUMWPN(String newvalue)
/*      */   {
/* 1302 */     this.fieldI01CUMWPN.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01CUMWPN()
/*      */   {
/* 1310 */     return this.fieldI01CUMWPN.getString();
/*      */   }
/*      */ 
/*      */   public void setI01CUMWPN(BigDecimal newvalue)
/*      */   {
/* 1318 */     this.fieldI01CUMWPN.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalI01CUMWPN()
/*      */   {
/* 1326 */     return this.fieldI01CUMWPN.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setI01SPI01(String newvalue)
/*      */   {
/* 1334 */     this.fieldI01SPI01.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01SPI01()
/*      */   {
/* 1342 */     return this.fieldI01SPI01.getString();
/*      */   }
/*      */ 
/*      */   public void setI01SPI02(String newvalue)
/*      */   {
/* 1350 */     this.fieldI01SPI02.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01SPI02()
/*      */   {
/* 1358 */     return this.fieldI01SPI02.getString();
/*      */   }
/*      */ 
/*      */   public void setI01SPI03(String newvalue)
/*      */   {
/* 1366 */     this.fieldI01SPI03.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01SPI03()
/*      */   {
/* 1374 */     return this.fieldI01SPI03.getString();
/*      */   }
/*      */ 
/*      */   public void setI01SPI04(String newvalue)
/*      */   {
/* 1382 */     this.fieldI01SPI04.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01SPI04()
/*      */   {
/* 1390 */     return this.fieldI01SPI04.getString();
/*      */   }
/*      */ 
/*      */   public void setI01SPI05(String newvalue)
/*      */   {
/* 1398 */     this.fieldI01SPI05.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01SPI05()
/*      */   {
/* 1406 */     return this.fieldI01SPI05.getString();
/*      */   }
/*      */ 
/*      */   public void setI01SPI06(String newvalue)
/*      */   {
/* 1414 */     this.fieldI01SPI06.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01SPI06()
/*      */   {
/* 1422 */     return this.fieldI01SPI06.getString();
/*      */   }
/*      */ 
/*      */   public void setI01SPI07(String newvalue)
/*      */   {
/* 1430 */     this.fieldI01SPI07.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01SPI07()
/*      */   {
/* 1438 */     return this.fieldI01SPI07.getString();
/*      */   }
/*      */ 
/*      */   public void setI01SPI08(String newvalue)
/*      */   {
/* 1446 */     this.fieldI01SPI08.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01SPI08()
/*      */   {
/* 1454 */     return this.fieldI01SPI08.getString();
/*      */   }
/*      */ 
/*      */   public void setI01SPI09(String newvalue)
/*      */   {
/* 1462 */     this.fieldI01SPI09.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01SPI09()
/*      */   {
/* 1470 */     return this.fieldI01SPI09.getString();
/*      */   }
/*      */ 
/*      */   public void setI01SPI10(String newvalue)
/*      */   {
/* 1478 */     this.fieldI01SPI10.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01SPI10()
/*      */   {
/* 1486 */     return this.fieldI01SPI10.getString();
/*      */   }
/*      */ 
/*      */   public void setI01SPI11(String newvalue)
/*      */   {
/* 1494 */     this.fieldI01SPI11.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01SPI11()
/*      */   {
/* 1502 */     return this.fieldI01SPI11.getString();
/*      */   }
/*      */ 
/*      */   public void setI01SPI12(String newvalue)
/*      */   {
/* 1510 */     this.fieldI01SPI12.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01SPI12()
/*      */   {
/* 1518 */     return this.fieldI01SPI12.getString();
/*      */   }
/*      */ 
/*      */   public void setI01SPI13(String newvalue)
/*      */   {
/* 1526 */     this.fieldI01SPI13.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01SPI13()
/*      */   {
/* 1534 */     return this.fieldI01SPI13.getString();
/*      */   }
/*      */ 
/*      */   public void setI01SPI14(String newvalue)
/*      */   {
/* 1542 */     this.fieldI01SPI14.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01SPI14()
/*      */   {
/* 1550 */     return this.fieldI01SPI14.getString();
/*      */   }
/*      */ 
/*      */   public void setI01SPI15(String newvalue)
/*      */   {
/* 1558 */     this.fieldI01SPI15.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01SPI15()
/*      */   {
/* 1566 */     return this.fieldI01SPI15.getString();
/*      */   }
/*      */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.IDD000001Message
 * JD-Core Version:    0.6.0
 */