/*      */ package com.activo.gateway.dibs.messages;
/*      */ 
/*      */ import java.math.BigDecimal;
import java.util.Hashtable;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*      */ 
/*      */ public class ELEERRMessage extends MessageRecord
/*      */ {
/*   21 */   static final String[] fldnames = { 
/*   22 */     "ERRNUM", 
/*   23 */     "ERNU01", 
/*   24 */     "ERNU02", 
/*   25 */     "ERNU03", 
/*   26 */     "ERNU04", 
/*   27 */     "ERNU05", 
/*   28 */     "ERNU06", 
/*   29 */     "ERNU07", 
/*   30 */     "ERNU08", 
/*   31 */     "ERNU09", 
/*   32 */     "ERNU10", 
/*   33 */     "ERDS01", 
/*   34 */     "ERDS02", 
/*   35 */     "ERDS03", 
/*   36 */     "ERDS04", 
/*   37 */     "ERDS05", 
/*   38 */     "ERDS06", 
/*   39 */     "ERDS07", 
/*   40 */     "ERDS08", 
/*   41 */     "ERDS09", 
/*   42 */     "ERDS10", 
/*   43 */     "ERDF01", 
/*   44 */     "ERDF02", 
/*   45 */     "ERDF03", 
/*   46 */     "ERDF04", 
/*   47 */     "ERDF05", 
/*   48 */     "ERDF06", 
/*   49 */     "ERDF07", 
/*   50 */     "ERDF08", 
/*   51 */     "ERDF09", 
/*   52 */     "ERDF10", 
/*   53 */     "ERDR01", 
/*   54 */     "ERDR02", 
/*   55 */     "ERDR03", 
/*   56 */     "ERDR04", 
/*   57 */     "ERDR05", 
/*   58 */     "ERDR06", 
/*   59 */     "ERDR07", 
/*   60 */     "ERDR08", 
/*   61 */     "ERDR09", 
/*   62 */     "ERDR10", 
/*   63 */     "ERWRNG", 
/*   64 */     "ERWF01", 
/*   65 */     "ERWF02", 
/*   66 */     "ERWF03", 
/*   67 */     "ERWF04", 
/*   68 */     "ERWF05", 
/*   69 */     "ERWF06", 
/*   70 */     "ERWF07", 
/*   71 */     "ERWF08", 
/*   72 */     "ERWF09", 
/*   73 */     "ERWF10" };
/*      */ 
/*   75 */   static final String[] tnames = { 
/*   76 */     "ERRNUM", 
/*   77 */     "ERNU01", 
/*   78 */     "ERNU02", 
/*   79 */     "ERNU03", 
/*   80 */     "ERNU04", 
/*   81 */     "ERNU05", 
/*   82 */     "ERNU06", 
/*   83 */     "ERNU07", 
/*   84 */     "ERNU08", 
/*   85 */     "ERNU09", 
/*   86 */     "ERNU10", 
/*   87 */     "ERDS01", 
/*   88 */     "ERDS02", 
/*   89 */     "ERDS03", 
/*   90 */     "ERDS04", 
/*   91 */     "ERDS05", 
/*   92 */     "ERDS06", 
/*   93 */     "ERDS07", 
/*   94 */     "ERDS08", 
/*   95 */     "ERDS09", 
/*   96 */     "ERDS10", 
/*   97 */     "ERDF01", 
/*   98 */     "ERDF02", 
/*   99 */     "ERDF03", 
/*  100 */     "ERDF04", 
/*  101 */     "ERDF05", 
/*  102 */     "ERDF06", 
/*  103 */     "ERDF07", 
/*  104 */     "ERDF08", 
/*  105 */     "ERDF09", 
/*  106 */     "ERDF10", 
/*  107 */     "ERDR01", 
/*  108 */     "ERDR02", 
/*  109 */     "ERDR03", 
/*  110 */     "ERDR04", 
/*  111 */     "ERDR05", 
/*  112 */     "ERDR06", 
/*  113 */     "ERDR07", 
/*  114 */     "ERDR08", 
/*  115 */     "ERDR09", 
/*  116 */     "ERDR10", 
/*  117 */     "ERWRNG", 
/*  118 */     "ERWF01", 
/*  119 */     "ERWF02", 
/*  120 */     "ERWF03", 
/*  121 */     "ERWF04", 
/*  122 */     "ERWF05", 
/*  123 */     "ERWF06", 
/*  124 */     "ERWF07", 
/*  125 */     "ERWF08", 
/*  126 */     "ERWF09", 
/*  127 */     "ERWF10" };
/*      */   static final String fid = "1040601162212";
/*      */   static final String rid = "44FFC5E87DFD5";
/*      */   static final String fmtname = "ELEERR";
/*  132 */   final int FIELDCOUNT = 52;
/*  133 */   private static Hashtable tlookup = new Hashtable();
/*  134 */   private DecimalField fieldERRNUM = null;
/*  135 */   private CharacterField fieldERNU01 = null;
/*  136 */   private CharacterField fieldERNU02 = null;
/*  137 */   private CharacterField fieldERNU03 = null;
/*  138 */   private CharacterField fieldERNU04 = null;
/*  139 */   private CharacterField fieldERNU05 = null;
/*  140 */   private CharacterField fieldERNU06 = null;
/*  141 */   private CharacterField fieldERNU07 = null;
/*  142 */   private CharacterField fieldERNU08 = null;
/*  143 */   private CharacterField fieldERNU09 = null;
/*  144 */   private CharacterField fieldERNU10 = null;
/*  145 */   private CharacterField fieldERDS01 = null;
/*  146 */   private CharacterField fieldERDS02 = null;
/*  147 */   private CharacterField fieldERDS03 = null;
/*  148 */   private CharacterField fieldERDS04 = null;
/*  149 */   private CharacterField fieldERDS05 = null;
/*  150 */   private CharacterField fieldERDS06 = null;
/*  151 */   private CharacterField fieldERDS07 = null;
/*  152 */   private CharacterField fieldERDS08 = null;
/*  153 */   private CharacterField fieldERDS09 = null;
/*  154 */   private CharacterField fieldERDS10 = null;
/*  155 */   private CharacterField fieldERDF01 = null;
/*  156 */   private CharacterField fieldERDF02 = null;
/*  157 */   private CharacterField fieldERDF03 = null;
/*  158 */   private CharacterField fieldERDF04 = null;
/*  159 */   private CharacterField fieldERDF05 = null;
/*  160 */   private CharacterField fieldERDF06 = null;
/*  161 */   private CharacterField fieldERDF07 = null;
/*  162 */   private CharacterField fieldERDF08 = null;
/*  163 */   private CharacterField fieldERDF09 = null;
/*  164 */   private CharacterField fieldERDF10 = null;
/*  165 */   private DecimalField fieldERDR01 = null;
/*  166 */   private DecimalField fieldERDR02 = null;
/*  167 */   private DecimalField fieldERDR03 = null;
/*  168 */   private DecimalField fieldERDR04 = null;
/*  169 */   private DecimalField fieldERDR05 = null;
/*  170 */   private DecimalField fieldERDR06 = null;
/*  171 */   private DecimalField fieldERDR07 = null;
/*  172 */   private DecimalField fieldERDR08 = null;
/*  173 */   private DecimalField fieldERDR09 = null;
/*  174 */   private DecimalField fieldERDR10 = null;
/*  175 */   private CharacterField fieldERWRNG = null;
/*  176 */   private CharacterField fieldERWF01 = null;
/*  177 */   private CharacterField fieldERWF02 = null;
/*  178 */   private CharacterField fieldERWF03 = null;
/*  179 */   private CharacterField fieldERWF04 = null;
/*  180 */   private CharacterField fieldERWF05 = null;
/*  181 */   private CharacterField fieldERWF06 = null;
/*  182 */   private CharacterField fieldERWF07 = null;
/*  183 */   private CharacterField fieldERWF08 = null;
/*  184 */   private CharacterField fieldERWF09 = null;
/*  185 */   private CharacterField fieldERWF10 = null;
/*      */ 
/*      */   public ELEERRMessage()
/*      */   {
/*  192 */     createFields();
/*  193 */     initialize();
/*      */   }
/*      */ 
/*      */   protected void createFields()
/*      */   {
/*  202 */     this.recordsize = 904;
/*  203 */     this.fileid = "1040601162212";
/*  204 */     this.recordid = "44FFC5E87DFD5";
/*  205 */     this.message = new byte[getByteLength()];
/*  206 */     this.formatname = "ELEERR";
/*  207 */     this.fieldnames = fldnames;
/*  208 */     this.tagnames = tnames;
/*  209 */     this.fields = new MessageField[52];
/*      */      this.fields[0]=this.fieldERRNUM=new DecimalField(this.message, 10, 3, 0, "ERRNUM");
/*      */      this.fields[1]=this.fieldERNU01=new CharacterField(this.message, 13, 4, "ERNU01");
/*      */      this.fields[2]=this.fieldERNU02=new CharacterField(this.message, 17, 4, "ERNU02");
/*      */      this.fields[3]=this.fieldERNU03=new CharacterField(this.message, 21, 4, "ERNU03");
/*      */      this.fields[4]=this.fieldERNU04=new CharacterField(this.message, 25, 4, "ERNU04");
/*      */      this.fields[5]=this.fieldERNU05=new CharacterField(this.message, 29, 4, "ERNU05");
/*      */      this.fields[6]=this.fieldERNU06=new CharacterField(this.message, 33, 4, "ERNU06");
/*      */      this.fields[7]=this.fieldERNU07=new CharacterField(this.message, 37, 4, "ERNU07");
/*      */      this.fields[8]=this.fieldERNU08=new CharacterField(this.message, 41, 4, "ERNU08");
/*      */      this.fields[9]=this.fieldERNU09=new CharacterField(this.message, 45, 4, "ERNU09");
/*      */      this.fields[10]=this.fieldERNU10=new CharacterField(this.message, 49, 4, "ERNU10");
/*      */      this.fields[11]=this.fieldERDS01=new CharacterField(this.message, 53, 70, "ERDS01");
/*      */      this.fields[12]=this.fieldERDS02=new CharacterField(this.message, 123, 70, "ERDS02");
/*      */      this.fields[13]=this.fieldERDS03=new CharacterField(this.message, 193, 70, "ERDS03");
/*      */      this.fields[14]=this.fieldERDS04=new CharacterField(this.message, 263, 70, "ERDS04");
/*      */      this.fields[15]=this.fieldERDS05=new CharacterField(this.message, 333, 70, "ERDS05");
/*      */      this.fields[16]=this.fieldERDS06=new CharacterField(this.message, 403, 70, "ERDS06");
/*      */      this.fields[17]=this.fieldERDS07=new CharacterField(this.message, 473, 70, "ERDS07");
/*      */      this.fields[18]=this.fieldERDS08=new CharacterField(this.message, 543, 70, "ERDS08");
/*      */      this.fields[19]=this.fieldERDS09=new CharacterField(this.message, 613, 70, "ERDS09");
/*      */      this.fields[20]=this.fieldERDS10=new CharacterField(this.message, 683, 70, "ERDS10");
/*      */      this.fields[21]=this.fieldERDF01=new CharacterField(this.message, 753, 10, "ERDF01");
/*      */      this.fields[22]=this.fieldERDF02=new CharacterField(this.message, 763, 10, "ERDF02");
/*      */      this.fields[23]=this.fieldERDF03=new CharacterField(this.message, 773, 10, "ERDF03");
/*      */      this.fields[24]=this.fieldERDF04=new CharacterField(this.message, 783, 10, "ERDF04");
/*      */      this.fields[25]=this.fieldERDF05=new CharacterField(this.message, 793, 10, "ERDF05");
/*      */      this.fields[26]=this.fieldERDF06=new CharacterField(this.message, 803, 10, "ERDF06");
/*      */      this.fields[27]=this.fieldERDF07=new CharacterField(this.message, 813, 10, "ERDF07");
/*      */      this.fields[28]=this.fieldERDF08=new CharacterField(this.message, 823, 10, "ERDF08");
/*      */      this.fields[29]=this.fieldERDF09=new CharacterField(this.message, 833, 10, "ERDF09");
/*      */      this.fields[30]=this.fieldERDF10=new CharacterField(this.message, 843, 10, "ERDF10");
/*      */      this.fields[31]=this.fieldERDR01=new DecimalField(this.message, 853, 5, 0, "ERDR01");
/*      */      this.fields[32]=this.fieldERDR02=new DecimalField(this.message, 858, 5, 0, "ERDR02");
/*      */      this.fields[33]=this.fieldERDR03=new DecimalField(this.message, 863, 5, 0, "ERDR03");
/*      */      this.fields[34]=this.fieldERDR04=new DecimalField(this.message, 868, 5, 0, "ERDR04");
/*      */      this.fields[35]=this.fieldERDR05=new DecimalField(this.message, 873, 5, 0, "ERDR05");
/*      */      this.fields[36]=this.fieldERDR06=new DecimalField(this.message, 878, 5, 0, "ERDR06");
/*      */      this.fields[37]=this.fieldERDR07=new DecimalField(this.message, 883, 5, 0, "ERDR07");
/*      */      this.fields[38]=this.fieldERDR08=new DecimalField(this.message, 888, 5, 0, "ERDR08");
/*      */      this.fields[39]=this.fieldERDR09=new DecimalField(this.message, 893, 5, 0, "ERDR09");
/*      */      this.fields[40]=this.fieldERDR10=new DecimalField(this.message, 898, 5, 0, "ERDR10");
/*      */      this.fields[41]=this.fieldERWRNG=new CharacterField(this.message, 903, 1, "ERWRNG");
/*      */      this.fields[42]=this.fieldERWF01=new CharacterField(this.message, 904, 1, "ERWF01");
/*      */      this.fields[43]=this.fieldERWF02=new CharacterField(this.message, 905, 1, "ERWF02");
/*      */      this.fields[44]=this.fieldERWF03=new CharacterField(this.message, 906, 1, "ERWF03");
/*      */      this.fields[45]=this.fieldERWF04=new CharacterField(this.message, 907, 1, "ERWF04");
/*      */      this.fields[46]=this.fieldERWF05=new CharacterField(this.message, 908, 1, "ERWF05");
/*      */      this.fields[47]=this.fieldERWF06=new CharacterField(this.message, 909, 1, "ERWF06");
/*      */      this.fields[48]=this.fieldERWF07=new CharacterField(this.message, 910, 1, "ERWF07");
/*      */      this.fields[49]=this.fieldERWF08=new CharacterField(this.message, 911, 1, "ERWF08");
/*      */      this.fields[50]=this.fieldERWF09=new CharacterField(this.message, 912, 1, "ERWF09");
/*      */      this.fields[51]=this.fieldERWF10=new CharacterField(this.message, 913, 1, "ERWF10");
/*      */ 
/*  316 */     synchronized (tlookup)
/*      */     {
/*  318 */       if (tlookup.isEmpty())
/*      */       {
/*  320 */         for (int i = 0; i < tnames.length; i++) {
/*  321 */           tlookup.put(tnames[i], new Integer(i));
/*      */         }
/*      */       }
/*      */     }
/*  325 */     this.taglookup = tlookup;
/*      */   }
/*      */ 
/*      */   public void setERRNUM(String newvalue)
/*      */   {
/*  333 */     this.fieldERRNUM.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getERRNUM()
/*      */   {
/*  341 */     return this.fieldERRNUM.getString();
/*      */   }
/*      */ 
/*      */   public void setERRNUM(BigDecimal newvalue)
/*      */   {
/*  349 */     this.fieldERRNUM.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalERRNUM()
/*      */   {
/*  357 */     return this.fieldERRNUM.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setERNU01(String newvalue)
/*      */   {
/*  365 */     this.fieldERNU01.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getERNU01()
/*      */   {
/*  373 */     return this.fieldERNU01.getString();
/*      */   }
/*      */ 
/*      */   public void setERNU02(String newvalue)
/*      */   {
/*  381 */     this.fieldERNU02.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getERNU02()
/*      */   {
/*  389 */     return this.fieldERNU02.getString();
/*      */   }
/*      */ 
/*      */   public void setERNU03(String newvalue)
/*      */   {
/*  397 */     this.fieldERNU03.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getERNU03()
/*      */   {
/*  405 */     return this.fieldERNU03.getString();
/*      */   }
/*      */ 
/*      */   public void setERNU04(String newvalue)
/*      */   {
/*  413 */     this.fieldERNU04.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getERNU04()
/*      */   {
/*  421 */     return this.fieldERNU04.getString();
/*      */   }
/*      */ 
/*      */   public void setERNU05(String newvalue)
/*      */   {
/*  429 */     this.fieldERNU05.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getERNU05()
/*      */   {
/*  437 */     return this.fieldERNU05.getString();
/*      */   }
/*      */ 
/*      */   public void setERNU06(String newvalue)
/*      */   {
/*  445 */     this.fieldERNU06.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getERNU06()
/*      */   {
/*  453 */     return this.fieldERNU06.getString();
/*      */   }
/*      */ 
/*      */   public void setERNU07(String newvalue)
/*      */   {
/*  461 */     this.fieldERNU07.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getERNU07()
/*      */   {
/*  469 */     return this.fieldERNU07.getString();
/*      */   }
/*      */ 
/*      */   public void setERNU08(String newvalue)
/*      */   {
/*  477 */     this.fieldERNU08.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getERNU08()
/*      */   {
/*  485 */     return this.fieldERNU08.getString();
/*      */   }
/*      */ 
/*      */   public void setERNU09(String newvalue)
/*      */   {
/*  493 */     this.fieldERNU09.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getERNU09()
/*      */   {
/*  501 */     return this.fieldERNU09.getString();
/*      */   }
/*      */ 
/*      */   public void setERNU10(String newvalue)
/*      */   {
/*  509 */     this.fieldERNU10.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getERNU10()
/*      */   {
/*  517 */     return this.fieldERNU10.getString();
/*      */   }
/*      */ 
/*      */   public void setERDS01(String newvalue)
/*      */   {
/*  525 */     this.fieldERDS01.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getERDS01()
/*      */   {
/*  533 */     return this.fieldERDS01.getString();
/*      */   }
/*      */ 
/*      */   public void setERDS02(String newvalue)
/*      */   {
/*  541 */     this.fieldERDS02.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getERDS02()
/*      */   {
/*  549 */     return this.fieldERDS02.getString();
/*      */   }
/*      */ 
/*      */   public void setERDS03(String newvalue)
/*      */   {
/*  557 */     this.fieldERDS03.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getERDS03()
/*      */   {
/*  565 */     return this.fieldERDS03.getString();
/*      */   }
/*      */ 
/*      */   public void setERDS04(String newvalue)
/*      */   {
/*  573 */     this.fieldERDS04.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getERDS04()
/*      */   {
/*  581 */     return this.fieldERDS04.getString();
/*      */   }
/*      */ 
/*      */   public void setERDS05(String newvalue)
/*      */   {
/*  589 */     this.fieldERDS05.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getERDS05()
/*      */   {
/*  597 */     return this.fieldERDS05.getString();
/*      */   }
/*      */ 
/*      */   public void setERDS06(String newvalue)
/*      */   {
/*  605 */     this.fieldERDS06.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getERDS06()
/*      */   {
/*  613 */     return this.fieldERDS06.getString();
/*      */   }
/*      */ 
/*      */   public void setERDS07(String newvalue)
/*      */   {
/*  621 */     this.fieldERDS07.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getERDS07()
/*      */   {
/*  629 */     return this.fieldERDS07.getString();
/*      */   }
/*      */ 
/*      */   public void setERDS08(String newvalue)
/*      */   {
/*  637 */     this.fieldERDS08.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getERDS08()
/*      */   {
/*  645 */     return this.fieldERDS08.getString();
/*      */   }
/*      */ 
/*      */   public void setERDS09(String newvalue)
/*      */   {
/*  653 */     this.fieldERDS09.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getERDS09()
/*      */   {
/*  661 */     return this.fieldERDS09.getString();
/*      */   }
/*      */ 
/*      */   public void setERDS10(String newvalue)
/*      */   {
/*  669 */     this.fieldERDS10.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getERDS10()
/*      */   {
/*  677 */     return this.fieldERDS10.getString();
/*      */   }
/*      */ 
/*      */   public void setERDF01(String newvalue)
/*      */   {
/*  685 */     this.fieldERDF01.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getERDF01()
/*      */   {
/*  693 */     return this.fieldERDF01.getString();
/*      */   }
/*      */ 
/*      */   public void setERDF02(String newvalue)
/*      */   {
/*  701 */     this.fieldERDF02.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getERDF02()
/*      */   {
/*  709 */     return this.fieldERDF02.getString();
/*      */   }
/*      */ 
/*      */   public void setERDF03(String newvalue)
/*      */   {
/*  717 */     this.fieldERDF03.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getERDF03()
/*      */   {
/*  725 */     return this.fieldERDF03.getString();
/*      */   }
/*      */ 
/*      */   public void setERDF04(String newvalue)
/*      */   {
/*  733 */     this.fieldERDF04.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getERDF04()
/*      */   {
/*  741 */     return this.fieldERDF04.getString();
/*      */   }
/*      */ 
/*      */   public void setERDF05(String newvalue)
/*      */   {
/*  749 */     this.fieldERDF05.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getERDF05()
/*      */   {
/*  757 */     return this.fieldERDF05.getString();
/*      */   }
/*      */ 
/*      */   public void setERDF06(String newvalue)
/*      */   {
/*  765 */     this.fieldERDF06.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getERDF06()
/*      */   {
/*  773 */     return this.fieldERDF06.getString();
/*      */   }
/*      */ 
/*      */   public void setERDF07(String newvalue)
/*      */   {
/*  781 */     this.fieldERDF07.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getERDF07()
/*      */   {
/*  789 */     return this.fieldERDF07.getString();
/*      */   }
/*      */ 
/*      */   public void setERDF08(String newvalue)
/*      */   {
/*  797 */     this.fieldERDF08.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getERDF08()
/*      */   {
/*  805 */     return this.fieldERDF08.getString();
/*      */   }
/*      */ 
/*      */   public void setERDF09(String newvalue)
/*      */   {
/*  813 */     this.fieldERDF09.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getERDF09()
/*      */   {
/*  821 */     return this.fieldERDF09.getString();
/*      */   }
/*      */ 
/*      */   public void setERDF10(String newvalue)
/*      */   {
/*  829 */     this.fieldERDF10.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getERDF10()
/*      */   {
/*  837 */     return this.fieldERDF10.getString();
/*      */   }
/*      */ 
/*      */   public void setERDR01(String newvalue)
/*      */   {
/*  845 */     this.fieldERDR01.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getERDR01()
/*      */   {
/*  853 */     return this.fieldERDR01.getString();
/*      */   }
/*      */ 
/*      */   public void setERDR01(BigDecimal newvalue)
/*      */   {
/*  861 */     this.fieldERDR01.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalERDR01()
/*      */   {
/*  869 */     return this.fieldERDR01.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setERDR02(String newvalue)
/*      */   {
/*  877 */     this.fieldERDR02.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getERDR02()
/*      */   {
/*  885 */     return this.fieldERDR02.getString();
/*      */   }
/*      */ 
/*      */   public void setERDR02(BigDecimal newvalue)
/*      */   {
/*  893 */     this.fieldERDR02.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalERDR02()
/*      */   {
/*  901 */     return this.fieldERDR02.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setERDR03(String newvalue)
/*      */   {
/*  909 */     this.fieldERDR03.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getERDR03()
/*      */   {
/*  917 */     return this.fieldERDR03.getString();
/*      */   }
/*      */ 
/*      */   public void setERDR03(BigDecimal newvalue)
/*      */   {
/*  925 */     this.fieldERDR03.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalERDR03()
/*      */   {
/*  933 */     return this.fieldERDR03.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setERDR04(String newvalue)
/*      */   {
/*  941 */     this.fieldERDR04.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getERDR04()
/*      */   {
/*  949 */     return this.fieldERDR04.getString();
/*      */   }
/*      */ 
/*      */   public void setERDR04(BigDecimal newvalue)
/*      */   {
/*  957 */     this.fieldERDR04.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalERDR04()
/*      */   {
/*  965 */     return this.fieldERDR04.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setERDR05(String newvalue)
/*      */   {
/*  973 */     this.fieldERDR05.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getERDR05()
/*      */   {
/*  981 */     return this.fieldERDR05.getString();
/*      */   }
/*      */ 
/*      */   public void setERDR05(BigDecimal newvalue)
/*      */   {
/*  989 */     this.fieldERDR05.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalERDR05()
/*      */   {
/*  997 */     return this.fieldERDR05.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setERDR06(String newvalue)
/*      */   {
/* 1005 */     this.fieldERDR06.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getERDR06()
/*      */   {
/* 1013 */     return this.fieldERDR06.getString();
/*      */   }
/*      */ 
/*      */   public void setERDR06(BigDecimal newvalue)
/*      */   {
/* 1021 */     this.fieldERDR06.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalERDR06()
/*      */   {
/* 1029 */     return this.fieldERDR06.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setERDR07(String newvalue)
/*      */   {
/* 1037 */     this.fieldERDR07.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getERDR07()
/*      */   {
/* 1045 */     return this.fieldERDR07.getString();
/*      */   }
/*      */ 
/*      */   public void setERDR07(BigDecimal newvalue)
/*      */   {
/* 1053 */     this.fieldERDR07.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalERDR07()
/*      */   {
/* 1061 */     return this.fieldERDR07.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setERDR08(String newvalue)
/*      */   {
/* 1069 */     this.fieldERDR08.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getERDR08()
/*      */   {
/* 1077 */     return this.fieldERDR08.getString();
/*      */   }
/*      */ 
/*      */   public void setERDR08(BigDecimal newvalue)
/*      */   {
/* 1085 */     this.fieldERDR08.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalERDR08()
/*      */   {
/* 1093 */     return this.fieldERDR08.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setERDR09(String newvalue)
/*      */   {
/* 1101 */     this.fieldERDR09.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getERDR09()
/*      */   {
/* 1109 */     return this.fieldERDR09.getString();
/*      */   }
/*      */ 
/*      */   public void setERDR09(BigDecimal newvalue)
/*      */   {
/* 1117 */     this.fieldERDR09.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalERDR09()
/*      */   {
/* 1125 */     return this.fieldERDR09.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setERDR10(String newvalue)
/*      */   {
/* 1133 */     this.fieldERDR10.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getERDR10()
/*      */   {
/* 1141 */     return this.fieldERDR10.getString();
/*      */   }
/*      */ 
/*      */   public void setERDR10(BigDecimal newvalue)
/*      */   {
/* 1149 */     this.fieldERDR10.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalERDR10()
/*      */   {
/* 1157 */     return this.fieldERDR10.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setERWRNG(String newvalue)
/*      */   {
/* 1165 */     this.fieldERWRNG.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getERWRNG()
/*      */   {
/* 1173 */     return this.fieldERWRNG.getString();
/*      */   }
/*      */ 
/*      */   public void setERWF01(String newvalue)
/*      */   {
/* 1181 */     this.fieldERWF01.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getERWF01()
/*      */   {
/* 1189 */     return this.fieldERWF01.getString();
/*      */   }
/*      */ 
/*      */   public void setERWF02(String newvalue)
/*      */   {
/* 1197 */     this.fieldERWF02.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getERWF02()
/*      */   {
/* 1205 */     return this.fieldERWF02.getString();
/*      */   }
/*      */ 
/*      */   public void setERWF03(String newvalue)
/*      */   {
/* 1213 */     this.fieldERWF03.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getERWF03()
/*      */   {
/* 1221 */     return this.fieldERWF03.getString();
/*      */   }
/*      */ 
/*      */   public void setERWF04(String newvalue)
/*      */   {
/* 1229 */     this.fieldERWF04.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getERWF04()
/*      */   {
/* 1237 */     return this.fieldERWF04.getString();
/*      */   }
/*      */ 
/*      */   public void setERWF05(String newvalue)
/*      */   {
/* 1245 */     this.fieldERWF05.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getERWF05()
/*      */   {
/* 1253 */     return this.fieldERWF05.getString();
/*      */   }
/*      */ 
/*      */   public void setERWF06(String newvalue)
/*      */   {
/* 1261 */     this.fieldERWF06.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getERWF06()
/*      */   {
/* 1269 */     return this.fieldERWF06.getString();
/*      */   }
/*      */ 
/*      */   public void setERWF07(String newvalue)
/*      */   {
/* 1277 */     this.fieldERWF07.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getERWF07()
/*      */   {
/* 1285 */     return this.fieldERWF07.getString();
/*      */   }
/*      */ 
/*      */   public void setERWF08(String newvalue)
/*      */   {
/* 1293 */     this.fieldERWF08.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getERWF08()
/*      */   {
/* 1301 */     return this.fieldERWF08.getString();
/*      */   }
/*      */ 
/*      */   public void setERWF09(String newvalue)
/*      */   {
/* 1309 */     this.fieldERWF09.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getERWF09()
/*      */   {
/* 1317 */     return this.fieldERWF09.getString();
/*      */   }
/*      */ 
/*      */   public void setERWF10(String newvalue)
/*      */   {
/* 1325 */     this.fieldERWF10.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getERWF10()
/*      */   {
/* 1333 */     return this.fieldERWF10.getString();
/*      */   }
/*      */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.ELEERRMessage
 * JD-Core Version:    0.6.0
 */