/*      */ package com.activo.gateway.dibs.messages;
/*      */ 
/*      */ import java.math.BigDecimal;
import java.util.Hashtable;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*      */ 
/*      */ public class EDC001001Message extends MessageRecord
/*      */ {
/*   21 */   static final String[] fldnames = { 
/*   22 */     "H01USERIDC", 
/*   23 */     "H01PROGRMC", 
/*   24 */     "H01TIMSYSC", 
/*   25 */     "H01SCRCODC", 
/*   26 */     "H01OPECODC", 
/*   27 */     "H01FLGMASC", 
/*   28 */     "H01FLGWK1C", 
/*   29 */     "H01FLGWK2C", 
/*   30 */     "H01FLGWK3C", 
/*   31 */     "E01DCMPRO", 
/*   32 */     "E01DCMATY", 
/*   33 */     "E01DCMOAM", 
/*   34 */     "E01DCMCKN", 
/*   35 */     "E01DCMSTY", 
/*   36 */     "E01DCMTYP", 
/*   37 */     "E01DCMORF", 
/*   38 */     "E01DCMDRF", 
/*   39 */     "E01DCMDR1", 
/*   40 */     "E01DCMDR2", 
/*   41 */     "E01DCMDR3", 
/*   42 */     "E01DCMDR4", 
/*   43 */     "E01DCMINT1", 
/*   44 */     "E01DCMINT2", 
/*   45 */     "E01DCMINT3", 
/*   46 */     "E01DCMINT4", 
/*   47 */     "E01DCMMED", 
/*   48 */     "E01DCMMCO", 
/*   49 */     "E01DCMVSL", 
/*   50 */     "E01DCMSHF", 
/*   51 */     "E01DCMSHT", 
/*   52 */     "E01DCMBLN", 
/*   53 */     "E01DCMBDM", 
/*   54 */     "E01DCMBDD", 
/*   55 */     "E01DCMBDY", 
/*   56 */     "E01DCMAG1", 
/*   57 */     "E01DCMAG2", 
/*   58 */     "E01DCMAG3", 
/*   59 */     "E01DCMAG4", 
/*   60 */     "E01DCMMAM", 
/*   61 */     "E01DCMMAD", 
/*   62 */     "E01DCMMAY", 
/*   63 */     "E01DCMDD1", 
/*   64 */     "E01DCMDD2", 
/*   65 */     "E01DCMDD3", 
/*   66 */     "E01DCMDD4", 
/*   67 */     "E01DCMDD5", 
/*   68 */     "E01DCMDD6", 
/*   69 */     "E01DCMDD7", 
/*   70 */     "E01DCMDD8", 
/*   71 */     "E01DCMDD9", 
/*   72 */     "E01DCMD01", 
/*   73 */     "E01DCMD02", 
/*   74 */     "E01DCMD03", 
/*   75 */     "E01DCMD04", 
/*   76 */     "E01DCMD05", 
/*   77 */     "E01DCMD06", 
/*   78 */     "E01DCMD07", 
/*   79 */     "E01DCMD08", 
/*   80 */     "E01DCMD09" };
/*      */ 
/*   82 */   static final String[] tnames = { 
/*   83 */     "H01USERIDC", 
/*   84 */     "H01PROGRMC", 
/*   85 */     "H01TIMSYSC", 
/*   86 */     "H01SCRCODC", 
/*   87 */     "H01OPECODC", 
/*   88 */     "H01FLGMASC", 
/*   89 */     "H01FLGWK1C", 
/*   90 */     "H01FLGWK2C", 
/*   91 */     "H01FLGWK3C", 
/*   92 */     "E01DCMPRO", 
/*   93 */     "E01DCMATY", 
/*   94 */     "E01DCMOAM", 
/*   95 */     "E01DCMCKN", 
/*   96 */     "E01DCMSTY", 
/*   97 */     "E01DCMTYP", 
/*   98 */     "E01DCMORF", 
/*   99 */     "E01DCMDRF", 
/*  100 */     "E01DCMDR1", 
/*  101 */     "E01DCMDR2", 
/*  102 */     "E01DCMDR3", 
/*  103 */     "E01DCMDR4", 
/*  104 */     "E01DCMINT1", 
/*  105 */     "E01DCMINT2", 
/*  106 */     "E01DCMINT3", 
/*  107 */     "E01DCMINT4", 
/*  108 */     "E01DCMMED", 
/*  109 */     "E01DCMMCO", 
/*  110 */     "E01DCMVSL", 
/*  111 */     "E01DCMSHF", 
/*  112 */     "E01DCMSHT", 
/*  113 */     "E01DCMBLN", 
/*  114 */     "E01DCMBDM", 
/*  115 */     "E01DCMBDD", 
/*  116 */     "E01DCMBDY", 
/*  117 */     "E01DCMAG1", 
/*  118 */     "E01DCMAG2", 
/*  119 */     "E01DCMAG3", 
/*  120 */     "E01DCMAG4", 
/*  121 */     "E01DCMMAM", 
/*  122 */     "E01DCMMAD", 
/*  123 */     "E01DCMMAY", 
/*  124 */     "E01DCMDD1", 
/*  125 */     "E01DCMDD2", 
/*  126 */     "E01DCMDD3", 
/*  127 */     "E01DCMDD4", 
/*  128 */     "E01DCMDD5", 
/*  129 */     "E01DCMDD6", 
/*  130 */     "E01DCMDD7", 
/*  131 */     "E01DCMDD8", 
/*  132 */     "E01DCMDD9", 
/*  133 */     "E01DCMD01", 
/*  134 */     "E01DCMD02", 
/*  135 */     "E01DCMD03", 
/*  136 */     "E01DCMD04", 
/*  137 */     "E01DCMD05", 
/*  138 */     "E01DCMD06", 
/*  139 */     "E01DCMD07", 
/*  140 */     "E01DCMD08", 
/*  141 */     "E01DCMD09" };
/*      */   static final String fid = "1040220170520";
/*      */   static final String rid = "56E0101936B67";
/*      */   static final String fmtname = "EDC001001";
/*  146 */   final int FIELDCOUNT = 59;
/*  147 */   private static Hashtable tlookup = new Hashtable();
/*  148 */   private CharacterField fieldH01USERIDC = null;
/*  149 */   private CharacterField fieldH01PROGRMC = null;
/*  150 */   private CharacterField fieldH01TIMSYSC = null;
/*  151 */   private CharacterField fieldH01SCRCODC = null;
/*  152 */   private CharacterField fieldH01OPECODC = null;
/*  153 */   private CharacterField fieldH01FLGMASC = null;
/*  154 */   private CharacterField fieldH01FLGWK1C = null;
/*  155 */   private CharacterField fieldH01FLGWK2C = null;
/*  156 */   private CharacterField fieldH01FLGWK3C = null;
/*  157 */   private CharacterField fieldE01DCMPRO = null;
/*  158 */   private CharacterField fieldE01DCMATY = null;
/*  159 */   private DecimalField fieldE01DCMOAM = null;
/*  160 */   private DecimalField fieldE01DCMCKN = null;
/*  161 */   private CharacterField fieldE01DCMSTY = null;
/*  162 */   private CharacterField fieldE01DCMTYP = null;
/*  163 */   private CharacterField fieldE01DCMORF = null;
/*  164 */   private CharacterField fieldE01DCMDRF = null;
/*  165 */   private CharacterField fieldE01DCMDR1 = null;
/*  166 */   private CharacterField fieldE01DCMDR2 = null;
/*  167 */   private CharacterField fieldE01DCMDR3 = null;
/*  168 */   private CharacterField fieldE01DCMDR4 = null;
/*  169 */   private CharacterField fieldE01DCMINT1 = null;
/*  170 */   private CharacterField fieldE01DCMINT2 = null;
/*  171 */   private CharacterField fieldE01DCMINT3 = null;
/*  172 */   private CharacterField fieldE01DCMINT4 = null;
/*  173 */   private CharacterField fieldE01DCMMED = null;
/*  174 */   private CharacterField fieldE01DCMMCO = null;
/*  175 */   private CharacterField fieldE01DCMVSL = null;
/*  176 */   private CharacterField fieldE01DCMSHF = null;
/*  177 */   private CharacterField fieldE01DCMSHT = null;
/*  178 */   private CharacterField fieldE01DCMBLN = null;
/*  179 */   private DecimalField fieldE01DCMBDM = null;
/*  180 */   private DecimalField fieldE01DCMBDD = null;
/*  181 */   private DecimalField fieldE01DCMBDY = null;
/*  182 */   private CharacterField fieldE01DCMAG1 = null;
/*  183 */   private CharacterField fieldE01DCMAG2 = null;
/*  184 */   private CharacterField fieldE01DCMAG3 = null;
/*  185 */   private CharacterField fieldE01DCMAG4 = null;
/*  186 */   private DecimalField fieldE01DCMMAM = null;
/*  187 */   private DecimalField fieldE01DCMMAD = null;
/*  188 */   private DecimalField fieldE01DCMMAY = null;
/*  189 */   private CharacterField fieldE01DCMDD1 = null;
/*  190 */   private CharacterField fieldE01DCMDD2 = null;
/*  191 */   private CharacterField fieldE01DCMDD3 = null;
/*  192 */   private CharacterField fieldE01DCMDD4 = null;
/*  193 */   private CharacterField fieldE01DCMDD5 = null;
/*  194 */   private CharacterField fieldE01DCMDD6 = null;
/*  195 */   private CharacterField fieldE01DCMDD7 = null;
/*  196 */   private CharacterField fieldE01DCMDD8 = null;
/*  197 */   private CharacterField fieldE01DCMDD9 = null;
/*  198 */   private DecimalField fieldE01DCMD01 = null;
/*  199 */   private DecimalField fieldE01DCMD02 = null;
/*  200 */   private DecimalField fieldE01DCMD03 = null;
/*  201 */   private DecimalField fieldE01DCMD04 = null;
/*  202 */   private DecimalField fieldE01DCMD05 = null;
/*  203 */   private DecimalField fieldE01DCMD06 = null;
/*  204 */   private DecimalField fieldE01DCMD07 = null;
/*  205 */   private DecimalField fieldE01DCMD08 = null;
/*  206 */   private DecimalField fieldE01DCMD09 = null;
/*      */ 
/*      */   public EDC001001Message()
/*      */   {
/*  213 */     createFields();
/*  214 */     initialize();
/*      */   }
/*      */ 
/*      */   protected void createFields()
/*      */   {
/*  223 */     this.recordsize = 725;
/*  224 */     this.fileid = "1040220170520";
/*  225 */     this.recordid = "56E0101936B67";
/*  226 */     this.message = new byte[getByteLength()];
/*  227 */     this.formatname = "EDC001001";
/*  228 */     this.fieldnames = fldnames;
/*  229 */     this.tagnames = tnames;
/*  230 */     this.fields = new MessageField[59];
/*      */      this.fields[0]=this.fieldH01USERIDC=new CharacterField(this.message, 10, 10, "H01USERIDC");
/*      */      this.fields[1]=this.fieldH01PROGRMC=new CharacterField(this.message, 20, 10, "H01PROGRMC");
/*      */      this.fields[2]=this.fieldH01TIMSYSC=new CharacterField(this.message, 30, 12, "H01TIMSYSC");
/*      */      this.fields[3]=this.fieldH01SCRCODC=new CharacterField(this.message, 42, 2, "H01SCRCODC");
/*      */      this.fields[4]=this.fieldH01OPECODC=new CharacterField(this.message, 44, 4, "H01OPECODC");
/*      */      this.fields[5]=this.fieldH01FLGMASC=new CharacterField(this.message, 48, 1, "H01FLGMASC");
/*      */      this.fields[6]=this.fieldH01FLGWK1C=new CharacterField(this.message, 49, 1, "H01FLGWK1C");
/*      */      this.fields[7]=this.fieldH01FLGWK2C=new CharacterField(this.message, 50, 1, "H01FLGWK2C");
/*      */      this.fields[8]=this.fieldH01FLGWK3C=new CharacterField(this.message, 51, 1, "H01FLGWK3C");
/*      */      this.fields[9]=this.fieldE01DCMPRO=new CharacterField(this.message, 52, 4, "E01DCMPRO");
/*      */      this.fields[10]=this.fieldE01DCMATY=new CharacterField(this.message, 56, 4, "E01DCMATY");
/*      */      this.fields[11]=this.fieldE01DCMOAM=new DecimalField(this.message, 60, 17, 2, "E01DCMOAM");
/*      */      this.fields[12]=this.fieldE01DCMCKN=new DecimalField(this.message, 77, 10, 0, "E01DCMCKN");
/*      */      this.fields[13]=this.fieldE01DCMSTY=new CharacterField(this.message, 87, 1, "E01DCMSTY");
/*      */      this.fields[14]=this.fieldE01DCMTYP=new CharacterField(this.message, 88, 1, "E01DCMTYP");
/*      */      this.fields[15]=this.fieldE01DCMORF=new CharacterField(this.message, 89, 16, "E01DCMORF");
/*      */      this.fields[16]=this.fieldE01DCMDRF=new CharacterField(this.message, 105, 16, "E01DCMDRF");
/*      */      this.fields[17]=this.fieldE01DCMDR1=new CharacterField(this.message, 121, 35, "E01DCMDR1");
/*      */      this.fields[18]=this.fieldE01DCMDR2=new CharacterField(this.message, 156, 35, "E01DCMDR2");
/*      */      this.fields[19]=this.fieldE01DCMDR3=new CharacterField(this.message, 191, 35, "E01DCMDR3");
/*      */      this.fields[20]=this.fieldE01DCMDR4=new CharacterField(this.message, 226, 35, "E01DCMDR4");
/*      */      this.fields[21]=this.fieldE01DCMINT1=new CharacterField(this.message, 261, 35, "E01DCMINT1");
/*      */      this.fields[22]=this.fieldE01DCMINT2=new CharacterField(this.message, 296, 35, "E01DCMINT2");
/*      */      this.fields[23]=this.fieldE01DCMINT3=new CharacterField(this.message, 331, 35, "E01DCMINT3");
/*      */      this.fields[24]=this.fieldE01DCMINT4=new CharacterField(this.message, 366, 35, "E01DCMINT4");
/*      */      this.fields[25]=this.fieldE01DCMMED=new CharacterField(this.message, 401, 35, "E01DCMMED");
/*      */      this.fields[26]=this.fieldE01DCMMCO=new CharacterField(this.message, 436, 1, "E01DCMMCO");
/*      */      this.fields[27]=this.fieldE01DCMVSL=new CharacterField(this.message, 437, 20, "E01DCMVSL");
/*      */      this.fields[28]=this.fieldE01DCMSHF=new CharacterField(this.message, 457, 25, "E01DCMSHF");
/*      */      this.fields[29]=this.fieldE01DCMSHT=new CharacterField(this.message, 482, 25, "E01DCMSHT");
/*      */      this.fields[30]=this.fieldE01DCMBLN=new CharacterField(this.message, 507, 16, "E01DCMBLN");
/*      */      this.fields[31]=this.fieldE01DCMBDM=new DecimalField(this.message, 523, 3, 0, "E01DCMBDM");
/*      */      this.fields[32]=this.fieldE01DCMBDD=new DecimalField(this.message, 526, 3, 0, "E01DCMBDD");
/*      */      this.fields[33]=this.fieldE01DCMBDY=new DecimalField(this.message, 529, 3, 0, "E01DCMBDY");
/*      */      this.fields[34]=this.fieldE01DCMAG1=new CharacterField(this.message, 532, 35, "E01DCMAG1");
/*      */      this.fields[35]=this.fieldE01DCMAG2=new CharacterField(this.message, 567, 35, "E01DCMAG2");
/*      */      this.fields[36]=this.fieldE01DCMAG3=new CharacterField(this.message, 602, 35, "E01DCMAG3");
/*      */      this.fields[37]=this.fieldE01DCMAG4=new CharacterField(this.message, 637, 35, "E01DCMAG4");
/*      */      this.fields[38]=this.fieldE01DCMMAM=new DecimalField(this.message, 672, 3, 0, "E01DCMMAM");
/*      */      this.fields[39]=this.fieldE01DCMMAD=new DecimalField(this.message, 675, 3, 0, "E01DCMMAD");
/*      */      this.fields[40]=this.fieldE01DCMMAY=new DecimalField(this.message, 678, 3, 0, "E01DCMMAY");
/*      */      this.fields[41]=this.fieldE01DCMDD1=new CharacterField(this.message, 681, 3, "E01DCMDD1");
/*      */      this.fields[42]=this.fieldE01DCMDD2=new CharacterField(this.message, 684, 3, "E01DCMDD2");
/*      */      this.fields[43]=this.fieldE01DCMDD3=new CharacterField(this.message, 687, 3, "E01DCMDD3");
/*      */      this.fields[44]=this.fieldE01DCMDD4=new CharacterField(this.message, 690, 3, "E01DCMDD4");
/*      */      this.fields[45]=this.fieldE01DCMDD5=new CharacterField(this.message, 693, 3, "E01DCMDD5");
/*      */      this.fields[46]=this.fieldE01DCMDD6=new CharacterField(this.message, 696, 3, "E01DCMDD6");
/*      */      this.fields[47]=this.fieldE01DCMDD7=new CharacterField(this.message, 699, 3, "E01DCMDD7");
/*      */      this.fields[48]=this.fieldE01DCMDD8=new CharacterField(this.message, 702, 3, "E01DCMDD8");
/*      */      this.fields[49]=this.fieldE01DCMDD9=new CharacterField(this.message, 705, 3, "E01DCMDD9");
/*      */      this.fields[50]=this.fieldE01DCMD01=new DecimalField(this.message, 708, 3, 0, "E01DCMD01");
/*      */      this.fields[51]=this.fieldE01DCMD02=new DecimalField(this.message, 711, 3, 0, "E01DCMD02");
/*      */      this.fields[52]=this.fieldE01DCMD03=new DecimalField(this.message, 714, 3, 0, "E01DCMD03");
/*      */      this.fields[53]=this.fieldE01DCMD04=new DecimalField(this.message, 717, 3, 0, "E01DCMD04");
/*      */      this.fields[54]=this.fieldE01DCMD05=new DecimalField(this.message, 720, 3, 0, "E01DCMD05");
/*      */      this.fields[55]=this.fieldE01DCMD06=new DecimalField(this.message, 723, 3, 0, "E01DCMD06");
/*      */      this.fields[56]=this.fieldE01DCMD07=new DecimalField(this.message, 726, 3, 0, "E01DCMD07");
/*      */      this.fields[57]=this.fieldE01DCMD08=new DecimalField(this.message, 729, 3, 0, "E01DCMD08");
/*      */      this.fields[58]=this.fieldE01DCMD09=new DecimalField(this.message, 732, 3, 0, "E01DCMD09");
/*      */ 
/*  351 */     synchronized (tlookup)
/*      */     {
/*  353 */       if (tlookup.isEmpty())
/*      */       {
/*  355 */         for (int i = 0; i < tnames.length; i++) {
/*  356 */           tlookup.put(tnames[i], new Integer(i));
/*      */         }
/*      */       }
/*      */     }
/*  360 */     this.taglookup = tlookup;
/*      */   }
/*      */ 
/*      */   public void setH01USERIDC(String newvalue)
/*      */   {
/*  368 */     this.fieldH01USERIDC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getH01USERIDC()
/*      */   {
/*  376 */     return this.fieldH01USERIDC.getString();
/*      */   }
/*      */ 
/*      */   public void setH01PROGRMC(String newvalue)
/*      */   {
/*  384 */     this.fieldH01PROGRMC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getH01PROGRMC()
/*      */   {
/*  392 */     return this.fieldH01PROGRMC.getString();
/*      */   }
/*      */ 
/*      */   public void setH01TIMSYSC(String newvalue)
/*      */   {
/*  400 */     this.fieldH01TIMSYSC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getH01TIMSYSC()
/*      */   {
/*  408 */     return this.fieldH01TIMSYSC.getString();
/*      */   }
/*      */ 
/*      */   public void setH01SCRCODC(String newvalue)
/*      */   {
/*  416 */     this.fieldH01SCRCODC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getH01SCRCODC()
/*      */   {
/*  424 */     return this.fieldH01SCRCODC.getString();
/*      */   }
/*      */ 
/*      */   public void setH01OPECODC(String newvalue)
/*      */   {
/*  432 */     this.fieldH01OPECODC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getH01OPECODC()
/*      */   {
/*  440 */     return this.fieldH01OPECODC.getString();
/*      */   }
/*      */ 
/*      */   public void setH01FLGMASC(String newvalue)
/*      */   {
/*  448 */     this.fieldH01FLGMASC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getH01FLGMASC()
/*      */   {
/*  456 */     return this.fieldH01FLGMASC.getString();
/*      */   }
/*      */ 
/*      */   public void setH01FLGWK1C(String newvalue)
/*      */   {
/*  464 */     this.fieldH01FLGWK1C.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getH01FLGWK1C()
/*      */   {
/*  472 */     return this.fieldH01FLGWK1C.getString();
/*      */   }
/*      */ 
/*      */   public void setH01FLGWK2C(String newvalue)
/*      */   {
/*  480 */     this.fieldH01FLGWK2C.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getH01FLGWK2C()
/*      */   {
/*  488 */     return this.fieldH01FLGWK2C.getString();
/*      */   }
/*      */ 
/*      */   public void setH01FLGWK3C(String newvalue)
/*      */   {
/*  496 */     this.fieldH01FLGWK3C.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getH01FLGWK3C()
/*      */   {
/*  504 */     return this.fieldH01FLGWK3C.getString();
/*      */   }
/*      */ 
/*      */   public void setE01DCMPRO(String newvalue)
/*      */   {
/*  512 */     this.fieldE01DCMPRO.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01DCMPRO()
/*      */   {
/*  520 */     return this.fieldE01DCMPRO.getString();
/*      */   }
/*      */ 
/*      */   public void setE01DCMATY(String newvalue)
/*      */   {
/*  528 */     this.fieldE01DCMATY.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01DCMATY()
/*      */   {
/*  536 */     return this.fieldE01DCMATY.getString();
/*      */   }
/*      */ 
/*      */   public void setE01DCMOAM(String newvalue)
/*      */   {
/*  544 */     this.fieldE01DCMOAM.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01DCMOAM()
/*      */   {
/*  552 */     return this.fieldE01DCMOAM.getString();
/*      */   }
/*      */ 
/*      */   public void setE01DCMOAM(BigDecimal newvalue)
/*      */   {
/*  560 */     this.fieldE01DCMOAM.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE01DCMOAM()
/*      */   {
/*  568 */     return this.fieldE01DCMOAM.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setE01DCMCKN(String newvalue)
/*      */   {
/*  576 */     this.fieldE01DCMCKN.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01DCMCKN()
/*      */   {
/*  584 */     return this.fieldE01DCMCKN.getString();
/*      */   }
/*      */ 
/*      */   public void setE01DCMCKN(BigDecimal newvalue)
/*      */   {
/*  592 */     this.fieldE01DCMCKN.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE01DCMCKN()
/*      */   {
/*  600 */     return this.fieldE01DCMCKN.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setE01DCMSTY(String newvalue)
/*      */   {
/*  608 */     this.fieldE01DCMSTY.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01DCMSTY()
/*      */   {
/*  616 */     return this.fieldE01DCMSTY.getString();
/*      */   }
/*      */ 
/*      */   public void setE01DCMTYP(String newvalue)
/*      */   {
/*  624 */     this.fieldE01DCMTYP.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01DCMTYP()
/*      */   {
/*  632 */     return this.fieldE01DCMTYP.getString();
/*      */   }
/*      */ 
/*      */   public void setE01DCMORF(String newvalue)
/*      */   {
/*  640 */     this.fieldE01DCMORF.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01DCMORF()
/*      */   {
/*  648 */     return this.fieldE01DCMORF.getString();
/*      */   }
/*      */ 
/*      */   public void setE01DCMDRF(String newvalue)
/*      */   {
/*  656 */     this.fieldE01DCMDRF.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01DCMDRF()
/*      */   {
/*  664 */     return this.fieldE01DCMDRF.getString();
/*      */   }
/*      */ 
/*      */   public void setE01DCMDR1(String newvalue)
/*      */   {
/*  672 */     this.fieldE01DCMDR1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01DCMDR1()
/*      */   {
/*  680 */     return this.fieldE01DCMDR1.getString();
/*      */   }
/*      */ 
/*      */   public void setE01DCMDR2(String newvalue)
/*      */   {
/*  688 */     this.fieldE01DCMDR2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01DCMDR2()
/*      */   {
/*  696 */     return this.fieldE01DCMDR2.getString();
/*      */   }
/*      */ 
/*      */   public void setE01DCMDR3(String newvalue)
/*      */   {
/*  704 */     this.fieldE01DCMDR3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01DCMDR3()
/*      */   {
/*  712 */     return this.fieldE01DCMDR3.getString();
/*      */   }
/*      */ 
/*      */   public void setE01DCMDR4(String newvalue)
/*      */   {
/*  720 */     this.fieldE01DCMDR4.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01DCMDR4()
/*      */   {
/*  728 */     return this.fieldE01DCMDR4.getString();
/*      */   }
/*      */ 
/*      */   public void setE01DCMINT1(String newvalue)
/*      */   {
/*  736 */     this.fieldE01DCMINT1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01DCMINT1()
/*      */   {
/*  744 */     return this.fieldE01DCMINT1.getString();
/*      */   }
/*      */ 
/*      */   public void setE01DCMINT2(String newvalue)
/*      */   {
/*  752 */     this.fieldE01DCMINT2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01DCMINT2()
/*      */   {
/*  760 */     return this.fieldE01DCMINT2.getString();
/*      */   }
/*      */ 
/*      */   public void setE01DCMINT3(String newvalue)
/*      */   {
/*  768 */     this.fieldE01DCMINT3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01DCMINT3()
/*      */   {
/*  776 */     return this.fieldE01DCMINT3.getString();
/*      */   }
/*      */ 
/*      */   public void setE01DCMINT4(String newvalue)
/*      */   {
/*  784 */     this.fieldE01DCMINT4.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01DCMINT4()
/*      */   {
/*  792 */     return this.fieldE01DCMINT4.getString();
/*      */   }
/*      */ 
/*      */   public void setE01DCMMED(String newvalue)
/*      */   {
/*  800 */     this.fieldE01DCMMED.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01DCMMED()
/*      */   {
/*  808 */     return this.fieldE01DCMMED.getString();
/*      */   }
/*      */ 
/*      */   public void setE01DCMMCO(String newvalue)
/*      */   {
/*  816 */     this.fieldE01DCMMCO.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01DCMMCO()
/*      */   {
/*  824 */     return this.fieldE01DCMMCO.getString();
/*      */   }
/*      */ 
/*      */   public void setE01DCMVSL(String newvalue)
/*      */   {
/*  832 */     this.fieldE01DCMVSL.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01DCMVSL()
/*      */   {
/*  840 */     return this.fieldE01DCMVSL.getString();
/*      */   }
/*      */ 
/*      */   public void setE01DCMSHF(String newvalue)
/*      */   {
/*  848 */     this.fieldE01DCMSHF.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01DCMSHF()
/*      */   {
/*  856 */     return this.fieldE01DCMSHF.getString();
/*      */   }
/*      */ 
/*      */   public void setE01DCMSHT(String newvalue)
/*      */   {
/*  864 */     this.fieldE01DCMSHT.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01DCMSHT()
/*      */   {
/*  872 */     return this.fieldE01DCMSHT.getString();
/*      */   }
/*      */ 
/*      */   public void setE01DCMBLN(String newvalue)
/*      */   {
/*  880 */     this.fieldE01DCMBLN.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01DCMBLN()
/*      */   {
/*  888 */     return this.fieldE01DCMBLN.getString();
/*      */   }
/*      */ 
/*      */   public void setE01DCMBDM(String newvalue)
/*      */   {
/*  896 */     this.fieldE01DCMBDM.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01DCMBDM()
/*      */   {
/*  904 */     return this.fieldE01DCMBDM.getString();
/*      */   }
/*      */ 
/*      */   public void setE01DCMBDM(BigDecimal newvalue)
/*      */   {
/*  912 */     this.fieldE01DCMBDM.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE01DCMBDM()
/*      */   {
/*  920 */     return this.fieldE01DCMBDM.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setE01DCMBDD(String newvalue)
/*      */   {
/*  928 */     this.fieldE01DCMBDD.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01DCMBDD()
/*      */   {
/*  936 */     return this.fieldE01DCMBDD.getString();
/*      */   }
/*      */ 
/*      */   public void setE01DCMBDD(BigDecimal newvalue)
/*      */   {
/*  944 */     this.fieldE01DCMBDD.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE01DCMBDD()
/*      */   {
/*  952 */     return this.fieldE01DCMBDD.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setE01DCMBDY(String newvalue)
/*      */   {
/*  960 */     this.fieldE01DCMBDY.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01DCMBDY()
/*      */   {
/*  968 */     return this.fieldE01DCMBDY.getString();
/*      */   }
/*      */ 
/*      */   public void setE01DCMBDY(BigDecimal newvalue)
/*      */   {
/*  976 */     this.fieldE01DCMBDY.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE01DCMBDY()
/*      */   {
/*  984 */     return this.fieldE01DCMBDY.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setE01DCMAG1(String newvalue)
/*      */   {
/*  992 */     this.fieldE01DCMAG1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01DCMAG1()
/*      */   {
/* 1000 */     return this.fieldE01DCMAG1.getString();
/*      */   }
/*      */ 
/*      */   public void setE01DCMAG2(String newvalue)
/*      */   {
/* 1008 */     this.fieldE01DCMAG2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01DCMAG2()
/*      */   {
/* 1016 */     return this.fieldE01DCMAG2.getString();
/*      */   }
/*      */ 
/*      */   public void setE01DCMAG3(String newvalue)
/*      */   {
/* 1024 */     this.fieldE01DCMAG3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01DCMAG3()
/*      */   {
/* 1032 */     return this.fieldE01DCMAG3.getString();
/*      */   }
/*      */ 
/*      */   public void setE01DCMAG4(String newvalue)
/*      */   {
/* 1040 */     this.fieldE01DCMAG4.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01DCMAG4()
/*      */   {
/* 1048 */     return this.fieldE01DCMAG4.getString();
/*      */   }
/*      */ 
/*      */   public void setE01DCMMAM(String newvalue)
/*      */   {
/* 1056 */     this.fieldE01DCMMAM.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01DCMMAM()
/*      */   {
/* 1064 */     return this.fieldE01DCMMAM.getString();
/*      */   }
/*      */ 
/*      */   public void setE01DCMMAM(BigDecimal newvalue)
/*      */   {
/* 1072 */     this.fieldE01DCMMAM.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE01DCMMAM()
/*      */   {
/* 1080 */     return this.fieldE01DCMMAM.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setE01DCMMAD(String newvalue)
/*      */   {
/* 1088 */     this.fieldE01DCMMAD.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01DCMMAD()
/*      */   {
/* 1096 */     return this.fieldE01DCMMAD.getString();
/*      */   }
/*      */ 
/*      */   public void setE01DCMMAD(BigDecimal newvalue)
/*      */   {
/* 1104 */     this.fieldE01DCMMAD.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE01DCMMAD()
/*      */   {
/* 1112 */     return this.fieldE01DCMMAD.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setE01DCMMAY(String newvalue)
/*      */   {
/* 1120 */     this.fieldE01DCMMAY.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01DCMMAY()
/*      */   {
/* 1128 */     return this.fieldE01DCMMAY.getString();
/*      */   }
/*      */ 
/*      */   public void setE01DCMMAY(BigDecimal newvalue)
/*      */   {
/* 1136 */     this.fieldE01DCMMAY.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE01DCMMAY()
/*      */   {
/* 1144 */     return this.fieldE01DCMMAY.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setE01DCMDD1(String newvalue)
/*      */   {
/* 1152 */     this.fieldE01DCMDD1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01DCMDD1()
/*      */   {
/* 1160 */     return this.fieldE01DCMDD1.getString();
/*      */   }
/*      */ 
/*      */   public void setE01DCMDD2(String newvalue)
/*      */   {
/* 1168 */     this.fieldE01DCMDD2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01DCMDD2()
/*      */   {
/* 1176 */     return this.fieldE01DCMDD2.getString();
/*      */   }
/*      */ 
/*      */   public void setE01DCMDD3(String newvalue)
/*      */   {
/* 1184 */     this.fieldE01DCMDD3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01DCMDD3()
/*      */   {
/* 1192 */     return this.fieldE01DCMDD3.getString();
/*      */   }
/*      */ 
/*      */   public void setE01DCMDD4(String newvalue)
/*      */   {
/* 1200 */     this.fieldE01DCMDD4.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01DCMDD4()
/*      */   {
/* 1208 */     return this.fieldE01DCMDD4.getString();
/*      */   }
/*      */ 
/*      */   public void setE01DCMDD5(String newvalue)
/*      */   {
/* 1216 */     this.fieldE01DCMDD5.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01DCMDD5()
/*      */   {
/* 1224 */     return this.fieldE01DCMDD5.getString();
/*      */   }
/*      */ 
/*      */   public void setE01DCMDD6(String newvalue)
/*      */   {
/* 1232 */     this.fieldE01DCMDD6.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01DCMDD6()
/*      */   {
/* 1240 */     return this.fieldE01DCMDD6.getString();
/*      */   }
/*      */ 
/*      */   public void setE01DCMDD7(String newvalue)
/*      */   {
/* 1248 */     this.fieldE01DCMDD7.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01DCMDD7()
/*      */   {
/* 1256 */     return this.fieldE01DCMDD7.getString();
/*      */   }
/*      */ 
/*      */   public void setE01DCMDD8(String newvalue)
/*      */   {
/* 1264 */     this.fieldE01DCMDD8.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01DCMDD8()
/*      */   {
/* 1272 */     return this.fieldE01DCMDD8.getString();
/*      */   }
/*      */ 
/*      */   public void setE01DCMDD9(String newvalue)
/*      */   {
/* 1280 */     this.fieldE01DCMDD9.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01DCMDD9()
/*      */   {
/* 1288 */     return this.fieldE01DCMDD9.getString();
/*      */   }
/*      */ 
/*      */   public void setE01DCMD01(String newvalue)
/*      */   {
/* 1296 */     this.fieldE01DCMD01.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01DCMD01()
/*      */   {
/* 1304 */     return this.fieldE01DCMD01.getString();
/*      */   }
/*      */ 
/*      */   public void setE01DCMD01(BigDecimal newvalue)
/*      */   {
/* 1312 */     this.fieldE01DCMD01.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE01DCMD01()
/*      */   {
/* 1320 */     return this.fieldE01DCMD01.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setE01DCMD02(String newvalue)
/*      */   {
/* 1328 */     this.fieldE01DCMD02.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01DCMD02()
/*      */   {
/* 1336 */     return this.fieldE01DCMD02.getString();
/*      */   }
/*      */ 
/*      */   public void setE01DCMD02(BigDecimal newvalue)
/*      */   {
/* 1344 */     this.fieldE01DCMD02.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE01DCMD02()
/*      */   {
/* 1352 */     return this.fieldE01DCMD02.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setE01DCMD03(String newvalue)
/*      */   {
/* 1360 */     this.fieldE01DCMD03.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01DCMD03()
/*      */   {
/* 1368 */     return this.fieldE01DCMD03.getString();
/*      */   }
/*      */ 
/*      */   public void setE01DCMD03(BigDecimal newvalue)
/*      */   {
/* 1376 */     this.fieldE01DCMD03.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE01DCMD03()
/*      */   {
/* 1384 */     return this.fieldE01DCMD03.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setE01DCMD04(String newvalue)
/*      */   {
/* 1392 */     this.fieldE01DCMD04.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01DCMD04()
/*      */   {
/* 1400 */     return this.fieldE01DCMD04.getString();
/*      */   }
/*      */ 
/*      */   public void setE01DCMD04(BigDecimal newvalue)
/*      */   {
/* 1408 */     this.fieldE01DCMD04.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE01DCMD04()
/*      */   {
/* 1416 */     return this.fieldE01DCMD04.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setE01DCMD05(String newvalue)
/*      */   {
/* 1424 */     this.fieldE01DCMD05.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01DCMD05()
/*      */   {
/* 1432 */     return this.fieldE01DCMD05.getString();
/*      */   }
/*      */ 
/*      */   public void setE01DCMD05(BigDecimal newvalue)
/*      */   {
/* 1440 */     this.fieldE01DCMD05.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE01DCMD05()
/*      */   {
/* 1448 */     return this.fieldE01DCMD05.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setE01DCMD06(String newvalue)
/*      */   {
/* 1456 */     this.fieldE01DCMD06.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01DCMD06()
/*      */   {
/* 1464 */     return this.fieldE01DCMD06.getString();
/*      */   }
/*      */ 
/*      */   public void setE01DCMD06(BigDecimal newvalue)
/*      */   {
/* 1472 */     this.fieldE01DCMD06.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE01DCMD06()
/*      */   {
/* 1480 */     return this.fieldE01DCMD06.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setE01DCMD07(String newvalue)
/*      */   {
/* 1488 */     this.fieldE01DCMD07.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01DCMD07()
/*      */   {
/* 1496 */     return this.fieldE01DCMD07.getString();
/*      */   }
/*      */ 
/*      */   public void setE01DCMD07(BigDecimal newvalue)
/*      */   {
/* 1504 */     this.fieldE01DCMD07.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE01DCMD07()
/*      */   {
/* 1512 */     return this.fieldE01DCMD07.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setE01DCMD08(String newvalue)
/*      */   {
/* 1520 */     this.fieldE01DCMD08.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01DCMD08()
/*      */   {
/* 1528 */     return this.fieldE01DCMD08.getString();
/*      */   }
/*      */ 
/*      */   public void setE01DCMD08(BigDecimal newvalue)
/*      */   {
/* 1536 */     this.fieldE01DCMD08.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE01DCMD08()
/*      */   {
/* 1544 */     return this.fieldE01DCMD08.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setE01DCMD09(String newvalue)
/*      */   {
/* 1552 */     this.fieldE01DCMD09.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getE01DCMD09()
/*      */   {
/* 1560 */     return this.fieldE01DCMD09.getString();
/*      */   }
/*      */ 
/*      */   public void setE01DCMD09(BigDecimal newvalue)
/*      */   {
/* 1568 */     this.fieldE01DCMD09.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalE01DCMD09()
/*      */   {
/* 1576 */     return this.fieldE01DCMD09.getBigDecimal();
/*      */   }
/*      */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.EDC001001Message
 * JD-Core Version:    0.6.0
 */