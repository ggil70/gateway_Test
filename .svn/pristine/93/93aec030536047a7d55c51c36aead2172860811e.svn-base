/*      */ package com.activo.gateway.dibs.messages;
/*      */ 
/*      */ import java.math.BigDecimal;
import java.util.Hashtable;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*      */ 
/*      */ public class IDL013001Message extends MessageRecord
/*      */ {
/*   18 */   static final String[] fldnames = { 
/*   19 */     "I01DUSER", 
/*   20 */     "I01DPROKEY", 
/*   21 */     "I01DEAPRO", 
/*   22 */     "I01DEABNK", 
/*   23 */     "I01DEABRN", 
/*   24 */     "I01DEACCY", 
/*   25 */     "I01DEATYP", 
/*   26 */     "I01DEAPRI", 
/*   27 */     "I01DEARTE", 
/*   28 */     "I01DEATRM", 
/*   29 */     "I01DEATRC", 
/*   30 */     "I01DEAPPI", 
/*   31 */     "I01PRIACC", 
/*   32 */     "I01DEAIPI", 
/*   33 */     "I01INTACC", 
/*   34 */     "I01DEAIPC", 
/*   35 */     "I01DOFFAC1", 
/*   36 */     "I01DOFFAM1", 
/*   37 */     "I01DOFFAC2", 
/*   38 */     "I01DOFFEXM", 
/*   39 */     "I01DOFFEXY", 
/*   40 */     "I01DOFFAM2", 
/*   41 */     "I01DCUSMA1", 
/*   42 */     "I01DCUSMA2", 
/*   43 */     "I01DCUSMA3", 
/*   44 */     "I01DCUSMA4", 
/*   45 */     "I01DCUSMA5", 
/*   46 */     "I01DCUMTID", 
/*   47 */     "I01DCUMPID", 
/*   48 */     "I01DCUMBNI", 
/*   49 */     "I01DCUMMA1", 
/*   50 */     "I01DCUMMA2", 
/*   51 */     "I01DCUMMA3", 
/*   52 */     "I01DCUMMA4", 
/*   53 */     "I01DCUMMA5", 
/*   54 */     "I01DCUMHPN", 
/*   55 */     "I01DCUMWPN", 
/*   56 */     "I01DSPI01", 
/*   57 */     "I01DSPI02", 
/*   58 */     "I01DSPI03", 
/*   59 */     "I01DSPI04", 
/*   60 */     "I01DSPI05", 
/*   61 */     "I01DSPI06", 
/*   62 */     "I01DSPI07", 
/*   63 */     "I01DSPI08", 
/*   64 */     "I01DSPI09", 
/*   65 */     "I01DSPI10", 
/*   66 */     "I01DSPI11", 
/*   67 */     "I01DSPI12", 
/*   68 */     "I01DSPI13", 
/*   69 */     "I01DSPI14", 
/*   70 */     "I01DSPI15" };
/*      */ 
/*   72 */   static final String[] tnames = { 
/*   73 */     "I01DUSER", 
/*   74 */     "I01DPROKEY", 
/*   75 */     "I01DEAPRO", 
/*   76 */     "I01DEABNK", 
/*   77 */     "I01DEABRN", 
/*   78 */     "I01DEACCY", 
/*   79 */     "I01DEATYP", 
/*   80 */     "I01DEAPRI", 
/*   81 */     "I01DEARTE", 
/*   82 */     "I01DEATRM", 
/*   83 */     "I01DEATRC", 
/*   84 */     "I01DEAPPI", 
/*   85 */     "I01PRIACC", 
/*   86 */     "I01DEAIPI", 
/*   87 */     "I01INTACC", 
/*   88 */     "I01DEAIPC", 
/*   89 */     "I01DOFFAC1", 
/*   90 */     "I01DOFFAM1", 
/*   91 */     "I01DOFFAC2", 
/*   92 */     "I01DOFFEXM", 
/*   93 */     "I01DOFFEXY", 
/*   94 */     "I01DOFFAM2", 
/*   95 */     "I01DCUSMA1", 
/*   96 */     "I01DCUSMA2", 
/*   97 */     "I01DCUSMA3", 
/*   98 */     "I01DCUSMA4", 
/*   99 */     "I01DCUSMA5", 
/*  100 */     "I01DCUMTID", 
/*  101 */     "I01DCUMPID", 
/*  102 */     "I01DCUMBNI", 
/*  103 */     "I01DCUMMA1", 
/*  104 */     "I01DCUMMA2", 
/*  105 */     "I01DCUMMA3", 
/*  106 */     "I01DCUMMA4", 
/*  107 */     "I01DCUMMA5", 
/*  108 */     "I01DCUMHPN", 
/*  109 */     "I01DCUMWPN", 
/*  110 */     "I01DSPI01", 
/*  111 */     "I01DSPI02", 
/*  112 */     "I01DSPI03", 
/*  113 */     "I01DSPI04", 
/*  114 */     "I01DSPI05", 
/*  115 */     "I01DSPI06", 
/*  116 */     "I01DSPI07", 
/*  117 */     "I01DSPI08", 
/*  118 */     "I01DSPI09", 
/*  119 */     "I01DSPI10", 
/*  120 */     "I01DSPI11", 
/*  121 */     "I01DSPI12", 
/*  122 */     "I01DSPI13", 
/*  123 */     "I01DSPI14", 
/*  124 */     "I01DSPI15" };
/*      */   static final String fid = "1020402182455";
/*      */   static final String rid = "3648815F7B5E0";
/*      */   static final String fmtname = "IDL013001";
/*  129 */   final int FIELDCOUNT = 52;
/*  130 */   private static Hashtable tlookup = new Hashtable();
/*  131 */   private CharacterField fieldI01DUSER = null;
/*  132 */   private CharacterField fieldI01DPROKEY = null;
/*  133 */   private CharacterField fieldI01DEAPRO = null;
/*  134 */   private CharacterField fieldI01DEABNK = null;
/*  135 */   private CharacterField fieldI01DEABRN = null;
/*  136 */   private CharacterField fieldI01DEACCY = null;
/*  137 */   private CharacterField fieldI01DEATYP = null;
/*  138 */   private DecimalField fieldI01DEAPRI = null;
/*  139 */   private DecimalField fieldI01DEARTE = null;
/*  140 */   private DecimalField fieldI01DEATRM = null;
/*  141 */   private CharacterField fieldI01DEATRC = null;
/*  142 */   private CharacterField fieldI01DEAPPI = null;
/*  143 */   private DecimalField fieldI01PRIACC = null;
/*  144 */   private CharacterField fieldI01DEAIPI = null;
/*  145 */   private DecimalField fieldI01INTACC = null;
/*  146 */   private CharacterField fieldI01DEAIPC = null;
/*  147 */   private DecimalField fieldI01DOFFAC1 = null;
/*  148 */   private DecimalField fieldI01DOFFAM1 = null;
/*  149 */   private CharacterField fieldI01DOFFAC2 = null;
/*  150 */   private DecimalField fieldI01DOFFEXM = null;
/*  151 */   private DecimalField fieldI01DOFFEXY = null;
/*  152 */   private DecimalField fieldI01DOFFAM2 = null;
/*  153 */   private CharacterField fieldI01DCUSMA1 = null;
/*  154 */   private CharacterField fieldI01DCUSMA2 = null;
/*  155 */   private CharacterField fieldI01DCUSMA3 = null;
/*  156 */   private CharacterField fieldI01DCUSMA4 = null;
/*  157 */   private CharacterField fieldI01DCUSMA5 = null;
/*  158 */   private CharacterField fieldI01DCUMTID = null;
/*  159 */   private CharacterField fieldI01DCUMPID = null;
/*  160 */   private CharacterField fieldI01DCUMBNI = null;
/*  161 */   private CharacterField fieldI01DCUMMA1 = null;
/*  162 */   private CharacterField fieldI01DCUMMA2 = null;
/*  163 */   private CharacterField fieldI01DCUMMA3 = null;
/*  164 */   private CharacterField fieldI01DCUMMA4 = null;
/*  165 */   private CharacterField fieldI01DCUMMA5 = null;
/*  166 */   private DecimalField fieldI01DCUMHPN = null;
/*  167 */   private DecimalField fieldI01DCUMWPN = null;
/*  168 */   private CharacterField fieldI01DSPI01 = null;
/*  169 */   private CharacterField fieldI01DSPI02 = null;
/*  170 */   private CharacterField fieldI01DSPI03 = null;
/*  171 */   private CharacterField fieldI01DSPI04 = null;
/*  172 */   private CharacterField fieldI01DSPI05 = null;
/*  173 */   private CharacterField fieldI01DSPI06 = null;
/*  174 */   private CharacterField fieldI01DSPI07 = null;
/*  175 */   private CharacterField fieldI01DSPI08 = null;
/*  176 */   private CharacterField fieldI01DSPI09 = null;
/*  177 */   private CharacterField fieldI01DSPI10 = null;
/*  178 */   private CharacterField fieldI01DSPI11 = null;
/*  179 */   private CharacterField fieldI01DSPI12 = null;
/*  180 */   private CharacterField fieldI01DSPI13 = null;
/*  181 */   private CharacterField fieldI01DSPI14 = null;
/*  182 */   private CharacterField fieldI01DSPI15 = null;
/*      */ 
/*      */   public IDL013001Message()
/*      */   {
/*  189 */     createFields();
/*  190 */     initialize();
/*      */   }
/*      */ 
/*      */   protected void createFields()
/*      */   {
/*  199 */     this.recordsize = 1782;
/*  200 */     this.fileid = "1020402182455";
/*  201 */     this.recordid = "3648815F7B5E0";
/*  202 */     this.message = new byte[getByteLength()];
/*  203 */     this.formatname = "IDL013001";
/*  204 */     this.fieldnames = fldnames;
/*  205 */     this.tagnames = tnames;
/*  206 */     this.fields = new MessageField[52];
/*      */      this.fields[0]=this.fieldI01DUSER=new CharacterField(this.message, 10, 10, "I01DUSER");
/*      */      this.fields[1]=this.fieldI01DPROKEY=new CharacterField(this.message, 20, 9, "I01DPROKEY");
/*      */      this.fields[2]=this.fieldI01DEAPRO=new CharacterField(this.message, 29, 4, "I01DEAPRO");
/*      */      this.fields[3]=this.fieldI01DEABNK=new CharacterField(this.message, 33, 2, "I01DEABNK");
/*      */      this.fields[4]=this.fieldI01DEABRN=new CharacterField(this.message, 35, 2, "I01DEABRN");
/*      */      this.fields[5]=this.fieldI01DEACCY=new CharacterField(this.message, 37, 2, "I01DEACCY");
/*      */      this.fields[6]=this.fieldI01DEATYP=new CharacterField(this.message, 39, 4, "I01DEATYP");
/*      */      this.fields[7]=this.fieldI01DEAPRI=new DecimalField(this.message, 43, 17, 2, "I01DEAPRI");
/*      */      this.fields[8]=this.fieldI01DEARTE=new DecimalField(this.message, 60, 11, 6, "I01DEARTE");
/*      */      this.fields[9]=this.fieldI01DEATRM=new DecimalField(this.message, 71, 5, 0, "I01DEATRM");
/*      */      this.fields[10]=this.fieldI01DEATRC=new CharacterField(this.message, 76, 1, "I01DEATRC");
/*      */      this.fields[11]=this.fieldI01DEAPPI=new CharacterField(this.message, 77, 1, "I01DEAPPI");
/*      */      this.fields[12]=this.fieldI01PRIACC=new DecimalField(this.message, 78, 13, 0, "I01PRIACC");
/*      */      this.fields[13]=this.fieldI01DEAIPI=new CharacterField(this.message, 91, 1, "I01DEAIPI");
/*      */      this.fields[14]=this.fieldI01INTACC=new DecimalField(this.message, 92, 13, 0, "I01INTACC");
/*      */      this.fields[15]=this.fieldI01DEAIPC=new CharacterField(this.message, 105, 1, "I01DEAIPC");
/*      */      this.fields[16]=this.fieldI01DOFFAC1=new DecimalField(this.message, 106, 13, 0, "I01DOFFAC1");
/*      */      this.fields[17]=this.fieldI01DOFFAM1=new DecimalField(this.message, 119, 17, 2, "I01DOFFAM1");
/*      */      this.fields[18]=this.fieldI01DOFFAC2=new CharacterField(this.message, 136, 16, "I01DOFFAC2");
/*      */      this.fields[19]=this.fieldI01DOFFEXM=new DecimalField(this.message, 152, 3, 0, "I01DOFFEXM");
/*      */      this.fields[20]=this.fieldI01DOFFEXY=new DecimalField(this.message, 155, 3, 0, "I01DOFFEXY");
/*      */      this.fields[21]=this.fieldI01DOFFAM2=new DecimalField(this.message, 158, 17, 2, "I01DOFFAM2");
/*      */      this.fields[22]=this.fieldI01DCUSMA1=new CharacterField(this.message, 175, 45, "I01DCUSMA1");
/*      */      this.fields[23]=this.fieldI01DCUSMA2=new CharacterField(this.message, 220, 35, "I01DCUSMA2");
/*      */      this.fields[24]=this.fieldI01DCUSMA3=new CharacterField(this.message, 255, 35, "I01DCUSMA3");
/*      */      this.fields[25]=this.fieldI01DCUSMA4=new CharacterField(this.message, 290, 35, "I01DCUSMA4");
/*      */      this.fields[26]=this.fieldI01DCUSMA5=new CharacterField(this.message, 325, 35, "I01DCUSMA5");
/*      */      this.fields[27]=this.fieldI01DCUMTID=new CharacterField(this.message, 360, 4, "I01DCUMTID");
/*      */      this.fields[28]=this.fieldI01DCUMPID=new CharacterField(this.message, 364, 4, "I01DCUMPID");
/*      */      this.fields[29]=this.fieldI01DCUMBNI=new CharacterField(this.message, 368, 15, "I01DCUMBNI");
/*      */      this.fields[30]=this.fieldI01DCUMMA1=new CharacterField(this.message, 383, 45, "I01DCUMMA1");
/*      */      this.fields[31]=this.fieldI01DCUMMA2=new CharacterField(this.message, 428, 35, "I01DCUMMA2");
/*      */      this.fields[32]=this.fieldI01DCUMMA3=new CharacterField(this.message, 463, 35, "I01DCUMMA3");
/*      */      this.fields[33]=this.fieldI01DCUMMA4=new CharacterField(this.message, 498, 35, "I01DCUMMA4");
/*      */      this.fields[34]=this.fieldI01DCUMMA5=new CharacterField(this.message, 533, 35, "I01DCUMMA5");
/*      */      this.fields[35]=this.fieldI01DCUMHPN=new DecimalField(this.message, 568, 12, 0, "I01DCUMHPN");
/*      */      this.fields[36]=this.fieldI01DCUMWPN=new DecimalField(this.message, 580, 12, 0, "I01DCUMWPN");
/*      */      this.fields[37]=this.fieldI01DSPI01=new CharacterField(this.message, 592, 80, "I01DSPI01");
/*      */      this.fields[38]=this.fieldI01DSPI02=new CharacterField(this.message, 672, 80, "I01DSPI02");
/*      */      this.fields[39]=this.fieldI01DSPI03=new CharacterField(this.message, 752, 80, "I01DSPI03");
/*      */      this.fields[40]=this.fieldI01DSPI04=new CharacterField(this.message, 832, 80, "I01DSPI04");
/*      */      this.fields[41]=this.fieldI01DSPI05=new CharacterField(this.message, 912, 80, "I01DSPI05");
/*      */      this.fields[42]=this.fieldI01DSPI06=new CharacterField(this.message, 992, 80, "I01DSPI06");
/*      */      this.fields[43]=this.fieldI01DSPI07=new CharacterField(this.message, 1072, 80, "I01DSPI07");
/*      */      this.fields[44]=this.fieldI01DSPI08=new CharacterField(this.message, 1152, 80, "I01DSPI08");
/*      */      this.fields[45]=this.fieldI01DSPI09=new CharacterField(this.message, 1232, 80, "I01DSPI09");
/*      */      this.fields[46]=this.fieldI01DSPI10=new CharacterField(this.message, 1312, 80, "I01DSPI10");
/*      */      this.fields[47]=this.fieldI01DSPI11=new CharacterField(this.message, 1392, 80, "I01DSPI11");
/*      */      this.fields[48]=this.fieldI01DSPI12=new CharacterField(this.message, 1472, 80, "I01DSPI12");
/*      */      this.fields[49]=this.fieldI01DSPI13=new CharacterField(this.message, 1552, 80, "I01DSPI13");
/*      */      this.fields[50]=this.fieldI01DSPI14=new CharacterField(this.message, 1632, 80, "I01DSPI14");
/*      */      this.fields[51]=this.fieldI01DSPI15=new CharacterField(this.message, 1712, 80, "I01DSPI15");
/*      */ 
/*  313 */     synchronized (tlookup)
/*      */     {
/*  315 */       if (tlookup.isEmpty())
/*      */       {
/*  317 */         for (int i = 0; i < tnames.length; i++) {
/*  318 */           tlookup.put(tnames[i], new Integer(i));
/*      */         }
/*      */       }
/*      */     }
/*  322 */     this.taglookup = tlookup;
/*      */   }
/*      */ 
/*      */   public void setI01DUSER(String newvalue)
/*      */   {
/*  330 */     this.fieldI01DUSER.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01DUSER()
/*      */   {
/*  338 */     return this.fieldI01DUSER.getString();
/*      */   }
/*      */ 
/*      */   public void setI01DPROKEY(String newvalue)
/*      */   {
/*  346 */     this.fieldI01DPROKEY.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01DPROKEY()
/*      */   {
/*  354 */     return this.fieldI01DPROKEY.getString();
/*      */   }
/*      */ 
/*      */   public void setI01DEAPRO(String newvalue)
/*      */   {
/*  362 */     this.fieldI01DEAPRO.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01DEAPRO()
/*      */   {
/*  370 */     return this.fieldI01DEAPRO.getString();
/*      */   }
/*      */ 
/*      */   public void setI01DEABNK(String newvalue)
/*      */   {
/*  378 */     this.fieldI01DEABNK.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01DEABNK()
/*      */   {
/*  386 */     return this.fieldI01DEABNK.getString();
/*      */   }
/*      */ 
/*      */   public void setI01DEABRN(String newvalue)
/*      */   {
/*  394 */     this.fieldI01DEABRN.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01DEABRN()
/*      */   {
/*  402 */     return this.fieldI01DEABRN.getString();
/*      */   }
/*      */ 
/*      */   public void setI01DEACCY(String newvalue)
/*      */   {
/*  410 */     this.fieldI01DEACCY.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01DEACCY()
/*      */   {
/*  418 */     return this.fieldI01DEACCY.getString();
/*      */   }
/*      */ 
/*      */   public void setI01DEATYP(String newvalue)
/*      */   {
/*  426 */     this.fieldI01DEATYP.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01DEATYP()
/*      */   {
/*  434 */     return this.fieldI01DEATYP.getString();
/*      */   }
/*      */ 
/*      */   public void setI01DEAPRI(String newvalue)
/*      */   {
/*  442 */     this.fieldI01DEAPRI.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01DEAPRI()
/*      */   {
/*  450 */     return this.fieldI01DEAPRI.getString();
/*      */   }
/*      */ 
/*      */   public void setI01DEAPRI(BigDecimal newvalue)
/*      */   {
/*  458 */     this.fieldI01DEAPRI.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalI01DEAPRI()
/*      */   {
/*  466 */     return this.fieldI01DEAPRI.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setI01DEARTE(String newvalue)
/*      */   {
/*  474 */     this.fieldI01DEARTE.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01DEARTE()
/*      */   {
/*  482 */     return this.fieldI01DEARTE.getString();
/*      */   }
/*      */ 
/*      */   public void setI01DEARTE(BigDecimal newvalue)
/*      */   {
/*  490 */     this.fieldI01DEARTE.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalI01DEARTE()
/*      */   {
/*  498 */     return this.fieldI01DEARTE.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setI01DEATRM(String newvalue)
/*      */   {
/*  506 */     this.fieldI01DEATRM.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01DEATRM()
/*      */   {
/*  514 */     return this.fieldI01DEATRM.getString();
/*      */   }
/*      */ 
/*      */   public void setI01DEATRM(BigDecimal newvalue)
/*      */   {
/*  522 */     this.fieldI01DEATRM.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalI01DEATRM()
/*      */   {
/*  530 */     return this.fieldI01DEATRM.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setI01DEATRC(String newvalue)
/*      */   {
/*  538 */     this.fieldI01DEATRC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01DEATRC()
/*      */   {
/*  546 */     return this.fieldI01DEATRC.getString();
/*      */   }
/*      */ 
/*      */   public void setI01DEAPPI(String newvalue)
/*      */   {
/*  554 */     this.fieldI01DEAPPI.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01DEAPPI()
/*      */   {
/*  562 */     return this.fieldI01DEAPPI.getString();
/*      */   }
/*      */ 
/*      */   public void setI01PRIACC(String newvalue)
/*      */   {
/*  570 */     this.fieldI01PRIACC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01PRIACC()
/*      */   {
/*  578 */     return this.fieldI01PRIACC.getString();
/*      */   }
/*      */ 
/*      */   public void setI01PRIACC(BigDecimal newvalue)
/*      */   {
/*  586 */     this.fieldI01PRIACC.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalI01PRIACC()
/*      */   {
/*  594 */     return this.fieldI01PRIACC.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setI01DEAIPI(String newvalue)
/*      */   {
/*  602 */     this.fieldI01DEAIPI.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01DEAIPI()
/*      */   {
/*  610 */     return this.fieldI01DEAIPI.getString();
/*      */   }
/*      */ 
/*      */   public void setI01INTACC(String newvalue)
/*      */   {
/*  618 */     this.fieldI01INTACC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01INTACC()
/*      */   {
/*  626 */     return this.fieldI01INTACC.getString();
/*      */   }
/*      */ 
/*      */   public void setI01INTACC(BigDecimal newvalue)
/*      */   {
/*  634 */     this.fieldI01INTACC.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalI01INTACC()
/*      */   {
/*  642 */     return this.fieldI01INTACC.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setI01DEAIPC(String newvalue)
/*      */   {
/*  650 */     this.fieldI01DEAIPC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01DEAIPC()
/*      */   {
/*  658 */     return this.fieldI01DEAIPC.getString();
/*      */   }
/*      */ 
/*      */   public void setI01DOFFAC1(String newvalue)
/*      */   {
/*  666 */     this.fieldI01DOFFAC1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01DOFFAC1()
/*      */   {
/*  674 */     return this.fieldI01DOFFAC1.getString();
/*      */   }
/*      */ 
/*      */   public void setI01DOFFAC1(BigDecimal newvalue)
/*      */   {
/*  682 */     this.fieldI01DOFFAC1.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalI01DOFFAC1()
/*      */   {
/*  690 */     return this.fieldI01DOFFAC1.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setI01DOFFAM1(String newvalue)
/*      */   {
/*  698 */     this.fieldI01DOFFAM1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01DOFFAM1()
/*      */   {
/*  706 */     return this.fieldI01DOFFAM1.getString();
/*      */   }
/*      */ 
/*      */   public void setI01DOFFAM1(BigDecimal newvalue)
/*      */   {
/*  714 */     this.fieldI01DOFFAM1.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalI01DOFFAM1()
/*      */   {
/*  722 */     return this.fieldI01DOFFAM1.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setI01DOFFAC2(String newvalue)
/*      */   {
/*  730 */     this.fieldI01DOFFAC2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01DOFFAC2()
/*      */   {
/*  738 */     return this.fieldI01DOFFAC2.getString();
/*      */   }
/*      */ 
/*      */   public void setI01DOFFEXM(String newvalue)
/*      */   {
/*  746 */     this.fieldI01DOFFEXM.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01DOFFEXM()
/*      */   {
/*  754 */     return this.fieldI01DOFFEXM.getString();
/*      */   }
/*      */ 
/*      */   public void setI01DOFFEXM(BigDecimal newvalue)
/*      */   {
/*  762 */     this.fieldI01DOFFEXM.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalI01DOFFEXM()
/*      */   {
/*  770 */     return this.fieldI01DOFFEXM.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setI01DOFFEXY(String newvalue)
/*      */   {
/*  778 */     this.fieldI01DOFFEXY.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01DOFFEXY()
/*      */   {
/*  786 */     return this.fieldI01DOFFEXY.getString();
/*      */   }
/*      */ 
/*      */   public void setI01DOFFEXY(BigDecimal newvalue)
/*      */   {
/*  794 */     this.fieldI01DOFFEXY.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalI01DOFFEXY()
/*      */   {
/*  802 */     return this.fieldI01DOFFEXY.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setI01DOFFAM2(String newvalue)
/*      */   {
/*  810 */     this.fieldI01DOFFAM2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01DOFFAM2()
/*      */   {
/*  818 */     return this.fieldI01DOFFAM2.getString();
/*      */   }
/*      */ 
/*      */   public void setI01DOFFAM2(BigDecimal newvalue)
/*      */   {
/*  826 */     this.fieldI01DOFFAM2.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalI01DOFFAM2()
/*      */   {
/*  834 */     return this.fieldI01DOFFAM2.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setI01DCUSMA1(String newvalue)
/*      */   {
/*  842 */     this.fieldI01DCUSMA1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01DCUSMA1()
/*      */   {
/*  850 */     return this.fieldI01DCUSMA1.getString();
/*      */   }
/*      */ 
/*      */   public void setI01DCUSMA2(String newvalue)
/*      */   {
/*  858 */     this.fieldI01DCUSMA2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01DCUSMA2()
/*      */   {
/*  866 */     return this.fieldI01DCUSMA2.getString();
/*      */   }
/*      */ 
/*      */   public void setI01DCUSMA3(String newvalue)
/*      */   {
/*  874 */     this.fieldI01DCUSMA3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01DCUSMA3()
/*      */   {
/*  882 */     return this.fieldI01DCUSMA3.getString();
/*      */   }
/*      */ 
/*      */   public void setI01DCUSMA4(String newvalue)
/*      */   {
/*  890 */     this.fieldI01DCUSMA4.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01DCUSMA4()
/*      */   {
/*  898 */     return this.fieldI01DCUSMA4.getString();
/*      */   }
/*      */ 
/*      */   public void setI01DCUSMA5(String newvalue)
/*      */   {
/*  906 */     this.fieldI01DCUSMA5.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01DCUSMA5()
/*      */   {
/*  914 */     return this.fieldI01DCUSMA5.getString();
/*      */   }
/*      */ 
/*      */   public void setI01DCUMTID(String newvalue)
/*      */   {
/*  922 */     this.fieldI01DCUMTID.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01DCUMTID()
/*      */   {
/*  930 */     return this.fieldI01DCUMTID.getString();
/*      */   }
/*      */ 
/*      */   public void setI01DCUMPID(String newvalue)
/*      */   {
/*  938 */     this.fieldI01DCUMPID.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01DCUMPID()
/*      */   {
/*  946 */     return this.fieldI01DCUMPID.getString();
/*      */   }
/*      */ 
/*      */   public void setI01DCUMBNI(String newvalue)
/*      */   {
/*  954 */     this.fieldI01DCUMBNI.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01DCUMBNI()
/*      */   {
/*  962 */     return this.fieldI01DCUMBNI.getString();
/*      */   }
/*      */ 
/*      */   public void setI01DCUMMA1(String newvalue)
/*      */   {
/*  970 */     this.fieldI01DCUMMA1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01DCUMMA1()
/*      */   {
/*  978 */     return this.fieldI01DCUMMA1.getString();
/*      */   }
/*      */ 
/*      */   public void setI01DCUMMA2(String newvalue)
/*      */   {
/*  986 */     this.fieldI01DCUMMA2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01DCUMMA2()
/*      */   {
/*  994 */     return this.fieldI01DCUMMA2.getString();
/*      */   }
/*      */ 
/*      */   public void setI01DCUMMA3(String newvalue)
/*      */   {
/* 1002 */     this.fieldI01DCUMMA3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01DCUMMA3()
/*      */   {
/* 1010 */     return this.fieldI01DCUMMA3.getString();
/*      */   }
/*      */ 
/*      */   public void setI01DCUMMA4(String newvalue)
/*      */   {
/* 1018 */     this.fieldI01DCUMMA4.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01DCUMMA4()
/*      */   {
/* 1026 */     return this.fieldI01DCUMMA4.getString();
/*      */   }
/*      */ 
/*      */   public void setI01DCUMMA5(String newvalue)
/*      */   {
/* 1034 */     this.fieldI01DCUMMA5.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01DCUMMA5()
/*      */   {
/* 1042 */     return this.fieldI01DCUMMA5.getString();
/*      */   }
/*      */ 
/*      */   public void setI01DCUMHPN(String newvalue)
/*      */   {
/* 1050 */     this.fieldI01DCUMHPN.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01DCUMHPN()
/*      */   {
/* 1058 */     return this.fieldI01DCUMHPN.getString();
/*      */   }
/*      */ 
/*      */   public void setI01DCUMHPN(BigDecimal newvalue)
/*      */   {
/* 1066 */     this.fieldI01DCUMHPN.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalI01DCUMHPN()
/*      */   {
/* 1074 */     return this.fieldI01DCUMHPN.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setI01DCUMWPN(String newvalue)
/*      */   {
/* 1082 */     this.fieldI01DCUMWPN.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01DCUMWPN()
/*      */   {
/* 1090 */     return this.fieldI01DCUMWPN.getString();
/*      */   }
/*      */ 
/*      */   public void setI01DCUMWPN(BigDecimal newvalue)
/*      */   {
/* 1098 */     this.fieldI01DCUMWPN.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalI01DCUMWPN()
/*      */   {
/* 1106 */     return this.fieldI01DCUMWPN.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setI01DSPI01(String newvalue)
/*      */   {
/* 1114 */     this.fieldI01DSPI01.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01DSPI01()
/*      */   {
/* 1122 */     return this.fieldI01DSPI01.getString();
/*      */   }
/*      */ 
/*      */   public void setI01DSPI02(String newvalue)
/*      */   {
/* 1130 */     this.fieldI01DSPI02.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01DSPI02()
/*      */   {
/* 1138 */     return this.fieldI01DSPI02.getString();
/*      */   }
/*      */ 
/*      */   public void setI01DSPI03(String newvalue)
/*      */   {
/* 1146 */     this.fieldI01DSPI03.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01DSPI03()
/*      */   {
/* 1154 */     return this.fieldI01DSPI03.getString();
/*      */   }
/*      */ 
/*      */   public void setI01DSPI04(String newvalue)
/*      */   {
/* 1162 */     this.fieldI01DSPI04.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01DSPI04()
/*      */   {
/* 1170 */     return this.fieldI01DSPI04.getString();
/*      */   }
/*      */ 
/*      */   public void setI01DSPI05(String newvalue)
/*      */   {
/* 1178 */     this.fieldI01DSPI05.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01DSPI05()
/*      */   {
/* 1186 */     return this.fieldI01DSPI05.getString();
/*      */   }
/*      */ 
/*      */   public void setI01DSPI06(String newvalue)
/*      */   {
/* 1194 */     this.fieldI01DSPI06.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01DSPI06()
/*      */   {
/* 1202 */     return this.fieldI01DSPI06.getString();
/*      */   }
/*      */ 
/*      */   public void setI01DSPI07(String newvalue)
/*      */   {
/* 1210 */     this.fieldI01DSPI07.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01DSPI07()
/*      */   {
/* 1218 */     return this.fieldI01DSPI07.getString();
/*      */   }
/*      */ 
/*      */   public void setI01DSPI08(String newvalue)
/*      */   {
/* 1226 */     this.fieldI01DSPI08.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01DSPI08()
/*      */   {
/* 1234 */     return this.fieldI01DSPI08.getString();
/*      */   }
/*      */ 
/*      */   public void setI01DSPI09(String newvalue)
/*      */   {
/* 1242 */     this.fieldI01DSPI09.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01DSPI09()
/*      */   {
/* 1250 */     return this.fieldI01DSPI09.getString();
/*      */   }
/*      */ 
/*      */   public void setI01DSPI10(String newvalue)
/*      */   {
/* 1258 */     this.fieldI01DSPI10.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01DSPI10()
/*      */   {
/* 1266 */     return this.fieldI01DSPI10.getString();
/*      */   }
/*      */ 
/*      */   public void setI01DSPI11(String newvalue)
/*      */   {
/* 1274 */     this.fieldI01DSPI11.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01DSPI11()
/*      */   {
/* 1282 */     return this.fieldI01DSPI11.getString();
/*      */   }
/*      */ 
/*      */   public void setI01DSPI12(String newvalue)
/*      */   {
/* 1290 */     this.fieldI01DSPI12.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01DSPI12()
/*      */   {
/* 1298 */     return this.fieldI01DSPI12.getString();
/*      */   }
/*      */ 
/*      */   public void setI01DSPI13(String newvalue)
/*      */   {
/* 1306 */     this.fieldI01DSPI13.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01DSPI13()
/*      */   {
/* 1314 */     return this.fieldI01DSPI13.getString();
/*      */   }
/*      */ 
/*      */   public void setI01DSPI14(String newvalue)
/*      */   {
/* 1322 */     this.fieldI01DSPI14.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01DSPI14()
/*      */   {
/* 1330 */     return this.fieldI01DSPI14.getString();
/*      */   }
/*      */ 
/*      */   public void setI01DSPI15(String newvalue)
/*      */   {
/* 1338 */     this.fieldI01DSPI15.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getI01DSPI15()
/*      */   {
/* 1346 */     return this.fieldI01DSPI15.getString();
/*      */   }
/*      */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.IDL013001Message
 * JD-Core Version:    0.6.0
 */