/*      */ package com.activo.gateway.dibs.messages;
/*      */ 
/*      */ import java.math.BigDecimal;
import java.util.Hashtable;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*      */ 
/*      */ public class CARDSJVMessage extends MessageRecord
/*      */ {
/*   18 */   static final String[] fldnames = { 
/*   19 */     "CARUSR", 
/*   20 */     "CARNUM", 
/*   21 */     "CARCCY", 
/*   22 */     "CARTYP", 
/*   23 */     "CAROP1", 
/*   24 */     "CAROP2", 
/*   25 */     "CAROP3", 
/*   26 */     "CARED1", 
/*   27 */     "CARED2", 
/*   28 */     "CARED3", 
/*   29 */     "CARAC1", 
/*   30 */     "CARAC2", 
/*   31 */     "CARAC3", 
/*   32 */     "CARDU1", 
/*   33 */     "CARDU2", 
/*   34 */     "CARDU3", 
/*   35 */     "CARLB1", 
/*   36 */     "CARLB2", 
/*   37 */     "CARLB3", 
/*   38 */     "CARLM1", 
/*   39 */     "CARLM2", 
/*   40 */     "CARLM3", 
/*   41 */     "CARLP1", 
/*   42 */     "CARLP2", 
/*   43 */     "CARLP3", 
/*   44 */     "CARCRL", 
/*   45 */     "CARAVC", 
/*   46 */     "CARBAL", 
/*   47 */     "CARPMA", 
/*   48 */     "CARAAD", 
/*   49 */     "CARCFA", 
/*   50 */     "CARLSB", 
/*   51 */     "CARPMC", 
/*   52 */     "CARNIK" };
/*      */ 
/*   54 */   static final String[] tnames = { 
/*   55 */     "CARUSR", 
/*   56 */     "CARNUM", 
/*   57 */     "CARCCY", 
/*   58 */     "CARTYP", 
/*   59 */     "CAROP1", 
/*   60 */     "CAROP2", 
/*   61 */     "CAROP3", 
/*   62 */     "CARED1", 
/*   63 */     "CARED2", 
/*   64 */     "CARED3", 
/*   65 */     "CARAC1", 
/*   66 */     "CARAC2", 
/*   67 */     "CARAC3", 
/*   68 */     "CARDU1", 
/*   69 */     "CARDU2", 
/*   70 */     "CARDU3", 
/*   71 */     "CARLB1", 
/*   72 */     "CARLB2", 
/*   73 */     "CARLB3", 
/*   74 */     "CARLM1", 
/*   75 */     "CARLM2", 
/*   76 */     "CARLM3", 
/*   77 */     "CARLP1", 
/*   78 */     "CARLP2", 
/*   79 */     "CARLP3", 
/*   80 */     "CARCRL", 
/*   81 */     "CARAVC", 
/*   82 */     "CARBAL", 
/*   83 */     "CARPMA", 
/*   84 */     "CARAAD", 
/*   85 */     "CARCFA", 
/*   86 */     "CARLSB", 
/*   87 */     "CARPMC", 
/*   88 */     "CARNIK" };
/*      */   static final String fid = "1060530191305";
/*      */   static final String rid = "59F2C61B20677";
/*      */   static final String fmtname = "CARDSJV";
/*   93 */   final int FIELDCOUNT = 34;
/*   94 */   private static Hashtable tlookup = new Hashtable();
/*   95 */   private CharacterField fieldCARUSR = null;
/*   96 */   private CharacterField fieldCARNUM = null;
/*   97 */   private CharacterField fieldCARCCY = null;
/*   98 */   private CharacterField fieldCARTYP = null;
/*   99 */   private DecimalField fieldCAROP1 = null;
/*  100 */   private DecimalField fieldCAROP2 = null;
/*  101 */   private DecimalField fieldCAROP3 = null;
/*  102 */   private DecimalField fieldCARED1 = null;
/*  103 */   private DecimalField fieldCARED2 = null;
/*  104 */   private DecimalField fieldCARED3 = null;
/*  105 */   private DecimalField fieldCARAC1 = null;
/*  106 */   private DecimalField fieldCARAC2 = null;
/*  107 */   private DecimalField fieldCARAC3 = null;
/*  108 */   private DecimalField fieldCARDU1 = null;
/*  109 */   private DecimalField fieldCARDU2 = null;
/*  110 */   private DecimalField fieldCARDU3 = null;
/*  111 */   private DecimalField fieldCARLB1 = null;
/*  112 */   private DecimalField fieldCARLB2 = null;
/*  113 */   private DecimalField fieldCARLB3 = null;
/*  114 */   private DecimalField fieldCARLM1 = null;
/*  115 */   private DecimalField fieldCARLM2 = null;
/*  116 */   private DecimalField fieldCARLM3 = null;
/*  117 */   private DecimalField fieldCARLP1 = null;
/*  118 */   private DecimalField fieldCARLP2 = null;
/*  119 */   private DecimalField fieldCARLP3 = null;
/*  120 */   private DecimalField fieldCARCRL = null;
/*  121 */   private DecimalField fieldCARAVC = null;
/*  122 */   private DecimalField fieldCARBAL = null;
/*  123 */   private DecimalField fieldCARPMA = null;
/*  124 */   private DecimalField fieldCARAAD = null;
/*  125 */   private CharacterField fieldCARCFA = null;
/*  126 */   private DecimalField fieldCARLSB = null;
/*  127 */   private DecimalField fieldCARPMC = null;
/*  128 */   private CharacterField fieldCARNIK = null;
/*      */ 
/*      */   public CARDSJVMessage()
/*      */   {
/*  135 */     createFields();
/*  136 */     initialize();
/*      */   }
/*      */ 
/*      */   protected void createFields()
/*      */   {
/*  145 */     this.recordsize = 264;
/*  146 */     this.fileid = "1060530191305";
/*  147 */     this.recordid = "59F2C61B20677";
/*  148 */     this.message = new byte[getByteLength()];
/*  149 */     this.formatname = "CARDSJV";
/*  150 */     this.fieldnames = fldnames;
/*  151 */     this.tagnames = tnames;
/*  152 */     this.fields = new MessageField[34];
/*      */      this.fields[0]=this.fieldCARUSR=new CharacterField(this.message, 10, 10, "CARUSR");
/*      */      this.fields[1]=this.fieldCARNUM=new CharacterField(this.message, 20, 20, "CARNUM");
/*      */      this.fields[2]=this.fieldCARCCY=new CharacterField(this.message, 40, 3, "CARCCY");
/*      */      this.fields[3]=this.fieldCARTYP=new CharacterField(this.message, 43, 3, "CARTYP");
/*      */      this.fields[4]=this.fieldCAROP1=new DecimalField(this.message, 46, 3, 0, "CAROP1");
/*      */      this.fields[5]=this.fieldCAROP2=new DecimalField(this.message, 49, 3, 0, "CAROP2");
/*      */      this.fields[6]=this.fieldCAROP3=new DecimalField(this.message, 52, 5, 0, "CAROP3");
/*      */      this.fields[7]=this.fieldCARED1=new DecimalField(this.message, 57, 3, 0, "CARED1");
/*      */      this.fields[8]=this.fieldCARED2=new DecimalField(this.message, 60, 3, 0, "CARED2");
/*      */      this.fields[9]=this.fieldCARED3=new DecimalField(this.message, 63, 5, 0, "CARED3");
/*      */      this.fields[10]=this.fieldCARAC1=new DecimalField(this.message, 68, 3, 0, "CARAC1");
/*      */      this.fields[11]=this.fieldCARAC2=new DecimalField(this.message, 71, 3, 0, "CARAC2");
/*      */      this.fields[12]=this.fieldCARAC3=new DecimalField(this.message, 74, 5, 0, "CARAC3");
/*      */      this.fields[13]=this.fieldCARDU1=new DecimalField(this.message, 79, 3, 0, "CARDU1");
/*      */      this.fields[14]=this.fieldCARDU2=new DecimalField(this.message, 82, 3, 0, "CARDU2");
/*      */      this.fields[15]=this.fieldCARDU3=new DecimalField(this.message, 85, 5, 0, "CARDU3");
/*      */      this.fields[16]=this.fieldCARLB1=new DecimalField(this.message, 90, 3, 0, "CARLB1");
/*      */      this.fields[17]=this.fieldCARLB2=new DecimalField(this.message, 93, 3, 0, "CARLB2");
/*      */      this.fields[18]=this.fieldCARLB3=new DecimalField(this.message, 96, 5, 0, "CARLB3");
/*      */      this.fields[19]=this.fieldCARLM1=new DecimalField(this.message, 101, 3, 0, "CARLM1");
/*      */      this.fields[20]=this.fieldCARLM2=new DecimalField(this.message, 104, 3, 0, "CARLM2");
/*      */      this.fields[21]=this.fieldCARLM3=new DecimalField(this.message, 107, 5, 0, "CARLM3");
/*      */      this.fields[22]=this.fieldCARLP1=new DecimalField(this.message, 112, 3, 0, "CARLP1");
/*      */      this.fields[23]=this.fieldCARLP2=new DecimalField(this.message, 115, 3, 0, "CARLP2");
/*      */      this.fields[24]=this.fieldCARLP3=new DecimalField(this.message, 118, 5, 0, "CARLP3");
/*      */      this.fields[25]=this.fieldCARCRL=new DecimalField(this.message, 123, 17, 2, "CARCRL");
/*      */      this.fields[26]=this.fieldCARAVC=new DecimalField(this.message, 140, 17, 2, "CARAVC");
/*      */      this.fields[27]=this.fieldCARBAL=new DecimalField(this.message, 157, 17, 2, "CARBAL");
/*      */      this.fields[28]=this.fieldCARPMA=new DecimalField(this.message, 174, 17, 2, "CARPMA");
/*      */      this.fields[29]=this.fieldCARAAD=new DecimalField(this.message, 191, 17, 2, "CARAAD");
/*      */      this.fields[30]=this.fieldCARCFA=new CharacterField(this.message, 208, 2, "CARCFA");
/*      */      this.fields[31]=this.fieldCARLSB=new DecimalField(this.message, 210, 17, 2, "CARLSB");
/*      */      this.fields[32]=this.fieldCARPMC=new DecimalField(this.message, 227, 17, 2, "CARPMC");
/*      */      this.fields[33]=this.fieldCARNIK=new CharacterField(this.message, 244, 30, "CARNIK");
/*      */ 
/*  223 */     synchronized (tlookup)
/*      */     {
/*  225 */       if (tlookup.isEmpty())
/*      */       {
/*  227 */         for (int i = 0; i < tnames.length; i++) {
/*  228 */           tlookup.put(tnames[i], new Integer(i));
/*      */         }
/*      */       }
/*      */     }
/*  232 */     this.taglookup = tlookup;
/*      */   }
/*      */ 
/*      */   public void setCARUSR(String newvalue)
/*      */   {
/*  240 */     this.fieldCARUSR.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCARUSR()
/*      */   {
/*  248 */     return this.fieldCARUSR.getString();
/*      */   }
/*      */ 
/*      */   public void setCARNUM(String newvalue)
/*      */   {
/*  256 */     this.fieldCARNUM.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCARNUM()
/*      */   {
/*  264 */     return this.fieldCARNUM.getString();
/*      */   }
/*      */ 
/*      */   public void setCARCCY(String newvalue)
/*      */   {
/*  272 */     this.fieldCARCCY.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCARCCY()
/*      */   {
/*  280 */     return this.fieldCARCCY.getString();
/*      */   }
/*      */ 
/*      */   public void setCARTYP(String newvalue)
/*      */   {
/*  288 */     this.fieldCARTYP.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCARTYP()
/*      */   {
/*  296 */     return this.fieldCARTYP.getString();
/*      */   }
/*      */ 
/*      */   public void setCAROP1(String newvalue)
/*      */   {
/*  304 */     this.fieldCAROP1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCAROP1()
/*      */   {
/*  312 */     return this.fieldCAROP1.getString();
/*      */   }
/*      */ 
/*      */   public void setCAROP1(BigDecimal newvalue)
/*      */   {
/*  320 */     this.fieldCAROP1.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCAROP1()
/*      */   {
/*  328 */     return this.fieldCAROP1.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCAROP2(String newvalue)
/*      */   {
/*  336 */     this.fieldCAROP2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCAROP2()
/*      */   {
/*  344 */     return this.fieldCAROP2.getString();
/*      */   }
/*      */ 
/*      */   public void setCAROP2(BigDecimal newvalue)
/*      */   {
/*  352 */     this.fieldCAROP2.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCAROP2()
/*      */   {
/*  360 */     return this.fieldCAROP2.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCAROP3(String newvalue)
/*      */   {
/*  368 */     this.fieldCAROP3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCAROP3()
/*      */   {
/*  376 */     return this.fieldCAROP3.getString();
/*      */   }
/*      */ 
/*      */   public void setCAROP3(BigDecimal newvalue)
/*      */   {
/*  384 */     this.fieldCAROP3.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCAROP3()
/*      */   {
/*  392 */     return this.fieldCAROP3.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCARED1(String newvalue)
/*      */   {
/*  400 */     this.fieldCARED1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCARED1()
/*      */   {
/*  408 */     return this.fieldCARED1.getString();
/*      */   }
/*      */ 
/*      */   public void setCARED1(BigDecimal newvalue)
/*      */   {
/*  416 */     this.fieldCARED1.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCARED1()
/*      */   {
/*  424 */     return this.fieldCARED1.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCARED2(String newvalue)
/*      */   {
/*  432 */     this.fieldCARED2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCARED2()
/*      */   {
/*  440 */     return this.fieldCARED2.getString();
/*      */   }
/*      */ 
/*      */   public void setCARED2(BigDecimal newvalue)
/*      */   {
/*  448 */     this.fieldCARED2.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCARED2()
/*      */   {
/*  456 */     return this.fieldCARED2.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCARED3(String newvalue)
/*      */   {
/*  464 */     this.fieldCARED3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCARED3()
/*      */   {
/*  472 */     return this.fieldCARED3.getString();
/*      */   }
/*      */ 
/*      */   public void setCARED3(BigDecimal newvalue)
/*      */   {
/*  480 */     this.fieldCARED3.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCARED3()
/*      */   {
/*  488 */     return this.fieldCARED3.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCARAC1(String newvalue)
/*      */   {
/*  496 */     this.fieldCARAC1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCARAC1()
/*      */   {
/*  504 */     return this.fieldCARAC1.getString();
/*      */   }
/*      */ 
/*      */   public void setCARAC1(BigDecimal newvalue)
/*      */   {
/*  512 */     this.fieldCARAC1.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCARAC1()
/*      */   {
/*  520 */     return this.fieldCARAC1.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCARAC2(String newvalue)
/*      */   {
/*  528 */     this.fieldCARAC2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCARAC2()
/*      */   {
/*  536 */     return this.fieldCARAC2.getString();
/*      */   }
/*      */ 
/*      */   public void setCARAC2(BigDecimal newvalue)
/*      */   {
/*  544 */     this.fieldCARAC2.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCARAC2()
/*      */   {
/*  552 */     return this.fieldCARAC2.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCARAC3(String newvalue)
/*      */   {
/*  560 */     this.fieldCARAC3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCARAC3()
/*      */   {
/*  568 */     return this.fieldCARAC3.getString();
/*      */   }
/*      */ 
/*      */   public void setCARAC3(BigDecimal newvalue)
/*      */   {
/*  576 */     this.fieldCARAC3.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCARAC3()
/*      */   {
/*  584 */     return this.fieldCARAC3.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCARDU1(String newvalue)
/*      */   {
/*  592 */     this.fieldCARDU1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCARDU1()
/*      */   {
/*  600 */     return this.fieldCARDU1.getString();
/*      */   }
/*      */ 
/*      */   public void setCARDU1(BigDecimal newvalue)
/*      */   {
/*  608 */     this.fieldCARDU1.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCARDU1()
/*      */   {
/*  616 */     return this.fieldCARDU1.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCARDU2(String newvalue)
/*      */   {
/*  624 */     this.fieldCARDU2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCARDU2()
/*      */   {
/*  632 */     return this.fieldCARDU2.getString();
/*      */   }
/*      */ 
/*      */   public void setCARDU2(BigDecimal newvalue)
/*      */   {
/*  640 */     this.fieldCARDU2.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCARDU2()
/*      */   {
/*  648 */     return this.fieldCARDU2.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCARDU3(String newvalue)
/*      */   {
/*  656 */     this.fieldCARDU3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCARDU3()
/*      */   {
/*  664 */     return this.fieldCARDU3.getString();
/*      */   }
/*      */ 
/*      */   public void setCARDU3(BigDecimal newvalue)
/*      */   {
/*  672 */     this.fieldCARDU3.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCARDU3()
/*      */   {
/*  680 */     return this.fieldCARDU3.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCARLB1(String newvalue)
/*      */   {
/*  688 */     this.fieldCARLB1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCARLB1()
/*      */   {
/*  696 */     return this.fieldCARLB1.getString();
/*      */   }
/*      */ 
/*      */   public void setCARLB1(BigDecimal newvalue)
/*      */   {
/*  704 */     this.fieldCARLB1.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCARLB1()
/*      */   {
/*  712 */     return this.fieldCARLB1.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCARLB2(String newvalue)
/*      */   {
/*  720 */     this.fieldCARLB2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCARLB2()
/*      */   {
/*  728 */     return this.fieldCARLB2.getString();
/*      */   }
/*      */ 
/*      */   public void setCARLB2(BigDecimal newvalue)
/*      */   {
/*  736 */     this.fieldCARLB2.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCARLB2()
/*      */   {
/*  744 */     return this.fieldCARLB2.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCARLB3(String newvalue)
/*      */   {
/*  752 */     this.fieldCARLB3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCARLB3()
/*      */   {
/*  760 */     return this.fieldCARLB3.getString();
/*      */   }
/*      */ 
/*      */   public void setCARLB3(BigDecimal newvalue)
/*      */   {
/*  768 */     this.fieldCARLB3.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCARLB3()
/*      */   {
/*  776 */     return this.fieldCARLB3.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCARLM1(String newvalue)
/*      */   {
/*  784 */     this.fieldCARLM1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCARLM1()
/*      */   {
/*  792 */     return this.fieldCARLM1.getString();
/*      */   }
/*      */ 
/*      */   public void setCARLM1(BigDecimal newvalue)
/*      */   {
/*  800 */     this.fieldCARLM1.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCARLM1()
/*      */   {
/*  808 */     return this.fieldCARLM1.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCARLM2(String newvalue)
/*      */   {
/*  816 */     this.fieldCARLM2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCARLM2()
/*      */   {
/*  824 */     return this.fieldCARLM2.getString();
/*      */   }
/*      */ 
/*      */   public void setCARLM2(BigDecimal newvalue)
/*      */   {
/*  832 */     this.fieldCARLM2.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCARLM2()
/*      */   {
/*  840 */     return this.fieldCARLM2.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCARLM3(String newvalue)
/*      */   {
/*  848 */     this.fieldCARLM3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCARLM3()
/*      */   {
/*  856 */     return this.fieldCARLM3.getString();
/*      */   }
/*      */ 
/*      */   public void setCARLM3(BigDecimal newvalue)
/*      */   {
/*  864 */     this.fieldCARLM3.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCARLM3()
/*      */   {
/*  872 */     return this.fieldCARLM3.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCARLP1(String newvalue)
/*      */   {
/*  880 */     this.fieldCARLP1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCARLP1()
/*      */   {
/*  888 */     return this.fieldCARLP1.getString();
/*      */   }
/*      */ 
/*      */   public void setCARLP1(BigDecimal newvalue)
/*      */   {
/*  896 */     this.fieldCARLP1.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCARLP1()
/*      */   {
/*  904 */     return this.fieldCARLP1.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCARLP2(String newvalue)
/*      */   {
/*  912 */     this.fieldCARLP2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCARLP2()
/*      */   {
/*  920 */     return this.fieldCARLP2.getString();
/*      */   }
/*      */ 
/*      */   public void setCARLP2(BigDecimal newvalue)
/*      */   {
/*  928 */     this.fieldCARLP2.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCARLP2()
/*      */   {
/*  936 */     return this.fieldCARLP2.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCARLP3(String newvalue)
/*      */   {
/*  944 */     this.fieldCARLP3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCARLP3()
/*      */   {
/*  952 */     return this.fieldCARLP3.getString();
/*      */   }
/*      */ 
/*      */   public void setCARLP3(BigDecimal newvalue)
/*      */   {
/*  960 */     this.fieldCARLP3.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCARLP3()
/*      */   {
/*  968 */     return this.fieldCARLP3.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCARCRL(String newvalue)
/*      */   {
/*  976 */     this.fieldCARCRL.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCARCRL()
/*      */   {
/*  984 */     return this.fieldCARCRL.getString();
/*      */   }
/*      */ 
/*      */   public void setCARCRL(BigDecimal newvalue)
/*      */   {
/*  992 */     this.fieldCARCRL.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCARCRL()
/*      */   {
/* 1000 */     return this.fieldCARCRL.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCARAVC(String newvalue)
/*      */   {
/* 1008 */     this.fieldCARAVC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCARAVC()
/*      */   {
/* 1016 */     return this.fieldCARAVC.getString();
/*      */   }
/*      */ 
/*      */   public void setCARAVC(BigDecimal newvalue)
/*      */   {
/* 1024 */     this.fieldCARAVC.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCARAVC()
/*      */   {
/* 1032 */     return this.fieldCARAVC.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCARBAL(String newvalue)
/*      */   {
/* 1040 */     this.fieldCARBAL.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCARBAL()
/*      */   {
/* 1048 */     return this.fieldCARBAL.getString();
/*      */   }
/*      */ 
/*      */   public void setCARBAL(BigDecimal newvalue)
/*      */   {
/* 1056 */     this.fieldCARBAL.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCARBAL()
/*      */   {
/* 1064 */     return this.fieldCARBAL.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCARPMA(String newvalue)
/*      */   {
/* 1072 */     this.fieldCARPMA.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCARPMA()
/*      */   {
/* 1080 */     return this.fieldCARPMA.getString();
/*      */   }
/*      */ 
/*      */   public void setCARPMA(BigDecimal newvalue)
/*      */   {
/* 1088 */     this.fieldCARPMA.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCARPMA()
/*      */   {
/* 1096 */     return this.fieldCARPMA.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCARAAD(String newvalue)
/*      */   {
/* 1104 */     this.fieldCARAAD.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCARAAD()
/*      */   {
/* 1112 */     return this.fieldCARAAD.getString();
/*      */   }
/*      */ 
/*      */   public void setCARAAD(BigDecimal newvalue)
/*      */   {
/* 1120 */     this.fieldCARAAD.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCARAAD()
/*      */   {
/* 1128 */     return this.fieldCARAAD.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCARCFA(String newvalue)
/*      */   {
/* 1136 */     this.fieldCARCFA.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCARCFA()
/*      */   {
/* 1144 */     return this.fieldCARCFA.getString();
/*      */   }
/*      */ 
/*      */   public void setCARLSB(String newvalue)
/*      */   {
/* 1152 */     this.fieldCARLSB.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCARLSB()
/*      */   {
/* 1160 */     return this.fieldCARLSB.getString();
/*      */   }
/*      */ 
/*      */   public void setCARLSB(BigDecimal newvalue)
/*      */   {
/* 1168 */     this.fieldCARLSB.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCARLSB()
/*      */   {
/* 1176 */     return this.fieldCARLSB.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCARPMC(String newvalue)
/*      */   {
/* 1184 */     this.fieldCARPMC.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCARPMC()
/*      */   {
/* 1192 */     return this.fieldCARPMC.getString();
/*      */   }
/*      */ 
/*      */   public void setCARPMC(BigDecimal newvalue)
/*      */   {
/* 1200 */     this.fieldCARPMC.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalCARPMC()
/*      */   {
/* 1208 */     return this.fieldCARPMC.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setCARNIK(String newvalue)
/*      */   {
/* 1216 */     this.fieldCARNIK.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getCARNIK()
/*      */   {
/* 1224 */     return this.fieldCARNIK.getString();
/*      */   }
/*      */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.CARDSJVMessage
 * JD-Core Version:    0.6.0
 */