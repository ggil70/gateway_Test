/*      */ package com.activo.gateway.dibs.messages;
/*      */ 
/*      */ import java.math.BigDecimal;
import java.util.Hashtable;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*      */ 
/*      */ public class REGISTERMessage extends MessageRecord
/*      */ {
/*   17 */   static final String[] fldnames = { 
/*   18 */     "REGOPT", 
/*   19 */     "REGSUB", 
/*   20 */     "REGUSR", 
/*   21 */     "REGUSP", 
/*   22 */     "REGOPP", 
/*   23 */     "REGIDN", 
/*   24 */     "REGLGT", 
/*   25 */     "REGACN", 
/*   26 */     "REGACP", 
/*   27 */     "REGCON", 
/*   28 */     "REGEML", 
/*   29 */     "REGPAS", 
/*   30 */     "REGQS1", 
/*   31 */     "REGQS2", 
/*   32 */     "REGQS3", 
/*   33 */     "REGAS1", 
/*   34 */     "REGAS2", 
/*   35 */     "REGAS3", 
/*   36 */     "REGFL1", 
/*   37 */     "REGFL2", 
/*   38 */     "REGLI1", 
/*   39 */     "REGLI2", 
/*   40 */     "REGLI3", 
/*   41 */     "REGLI4", 
/*   42 */     "REGAC1", 
/*   43 */     "REGAC2", 
/*   44 */     "REGAC3", 
/*   45 */     "REGAC4", 
/*   46 */     "REGSLI", 
/*   47 */     "REGSLT", 
/*   48 */     "REGSLE", 
/*   49 */     "REGSL4", 
/*   50 */     "REGSAI", 
/*   51 */     "REGSAT", 
/*   52 */     "REGSAE", 
/*   53 */     "REGSA4" };
/*      */ 
/*   55 */   static final String[] tnames = { 
/*   56 */     "REGOPT", 
/*   57 */     "REGSUB", 
/*   58 */     "REGUSR", 
/*   59 */     "REGUSP", 
/*   60 */     "REGOPP", 
/*   61 */     "REGIDN", 
/*   62 */     "REGLGT", 
/*   63 */     "REGACN", 
/*   64 */     "REGACP", 
/*   65 */     "REGCON", 
/*   66 */     "REGEML", 
/*   67 */     "REGPAS", 
/*   68 */     "REGQS1", 
/*   69 */     "REGQS2", 
/*   70 */     "REGQS3", 
/*   71 */     "REGAS1", 
/*   72 */     "REGAS2", 
/*   73 */     "REGAS3", 
/*   74 */     "REGFL1", 
/*   75 */     "REGFL2", 
/*   76 */     "REGLI1", 
/*   77 */     "REGLI2", 
/*   78 */     "REGLI3", 
/*   79 */     "REGLI4", 
/*   80 */     "REGAC1", 
/*   81 */     "REGAC2", 
/*   82 */     "REGAC3", 
/*   83 */     "REGAC4", 
/*   84 */     "REGSLI", 
/*   85 */     "REGSLT", 
/*   86 */     "REGSLE", 
/*   87 */     "REGSL4", 
/*   88 */     "REGSAI", 
/*   89 */     "REGSAT", 
/*   90 */     "REGSAE", 
/*   91 */     "REGSA4" };
/*      */   static final String fid = "1120113131059";
/*      */   static final String rid = "43E99B311AB62";
/*      */   static final String fmtname = "REGISTER";
/*   96 */   final int FIELDCOUNT = 36;
/*   97 */   private static Hashtable tlookup = new Hashtable();
/*   98 */   private DecimalField fieldREGOPT = null;
/*   99 */   private DecimalField fieldREGSUB = null;
/*  100 */   private CharacterField fieldREGUSR = null;
/*  101 */   private CharacterField fieldREGUSP = null;
/*  102 */   private CharacterField fieldREGOPP = null;
/*  103 */   private CharacterField fieldREGIDN = null;
/*  104 */   private CharacterField fieldREGLGT = null;
/*  105 */   private DecimalField fieldREGACN = null;
/*  106 */   private CharacterField fieldREGACP = null;
/*  107 */   private CharacterField fieldREGCON = null;
/*  108 */   private CharacterField fieldREGEML = null;
/*  109 */   private CharacterField fieldREGPAS = null;
/*  110 */   private CharacterField fieldREGQS1 = null;
/*  111 */   private CharacterField fieldREGQS2 = null;
/*  112 */   private CharacterField fieldREGQS3 = null;
/*  113 */   private CharacterField fieldREGAS1 = null;
/*  114 */   private CharacterField fieldREGAS2 = null;
/*  115 */   private CharacterField fieldREGAS3 = null;
/*  116 */   private CharacterField fieldREGFL1 = null;
/*  117 */   private CharacterField fieldREGFL2 = null;
/*  118 */   private DecimalField fieldREGLI1 = null;
/*  119 */   private DecimalField fieldREGLI2 = null;
/*  120 */   private DecimalField fieldREGLI3 = null;
/*  121 */   private DecimalField fieldREGLI4 = null;
/*  122 */   private DecimalField fieldREGAC1 = null;
/*  123 */   private DecimalField fieldREGAC2 = null;
/*  124 */   private DecimalField fieldREGAC3 = null;
/*  125 */   private DecimalField fieldREGAC4 = null;
/*  126 */   private DecimalField fieldREGSLI = null;
/*  127 */   private DecimalField fieldREGSLT = null;
/*  128 */   private DecimalField fieldREGSLE = null;
/*  129 */   private DecimalField fieldREGSL4 = null;
/*  130 */   private DecimalField fieldREGSAI = null;
/*  131 */   private DecimalField fieldREGSAT = null;
/*  132 */   private DecimalField fieldREGSAE = null;
/*  133 */   private DecimalField fieldREGSA4 = null;
/*      */ 
/*      */   public REGISTERMessage()
/*      */   {
/*  140 */     createFields();
/*  141 */     initialize();
/*      */   }
/*      */ 
/*      */   protected void createFields()
/*      */   {
/*  150 */     this.recordsize = 1053;
/*  151 */     this.fileid = "1120113131059";
/*  152 */     this.recordid = "43E99B311AB62";
/*  153 */     this.message = new byte[getByteLength()];
/*  154 */     this.formatname = "REGISTER";
/*  155 */     this.fieldnames = fldnames;
/*  156 */     this.tagnames = tnames;
/*  157 */     this.fields = new MessageField[36];
/*      */      this.fields[0]=this.fieldREGOPT=new DecimalField(this.message, 10, 4, 0, "REGOPT");
/*      */      this.fields[1]=this.fieldREGSUB=new DecimalField(this.message, 14, 3, 0, "REGSUB");
/*      */      this.fields[2]=this.fieldREGUSR=new CharacterField(this.message, 17, 10, "REGUSR");
/*      */      this.fields[3]=this.fieldREGUSP=new CharacterField(this.message, 27, 10, "REGUSP");
/*      */      this.fields[4]=this.fieldREGOPP=new CharacterField(this.message, 37, 10, "REGOPP");
/*      */      this.fields[5]=this.fieldREGIDN=new CharacterField(this.message, 47, 15, "REGIDN");
/*      */      this.fields[6]=this.fieldREGLGT=new CharacterField(this.message, 62, 1, "REGLGT");
/*      */      this.fields[7]=this.fieldREGACN=new DecimalField(this.message, 63, 20, 0, "REGACN");
/*      */      this.fields[8]=this.fieldREGACP=new CharacterField(this.message, 83, 16, "REGACP");
/*      */      this.fields[9]=this.fieldREGCON=new CharacterField(this.message, 99, 35, "REGCON");
/*      */      this.fields[10]=this.fieldREGEML=new CharacterField(this.message, 134, 100, "REGEML");
/*      */      this.fields[11]=this.fieldREGPAS=new CharacterField(this.message, 234, 255, "REGPAS");
/*      */      this.fields[12]=this.fieldREGQS1=new CharacterField(this.message, 489, 50, "REGQS1");
/*      */      this.fields[13]=this.fieldREGQS2=new CharacterField(this.message, 539, 50, "REGQS2");
/*      */      this.fields[14]=this.fieldREGQS3=new CharacterField(this.message, 589, 50, "REGQS3");
/*      */      this.fields[15]=this.fieldREGAS1=new CharacterField(this.message, 639, 50, "REGAS1");
/*      */      this.fields[16]=this.fieldREGAS2=new CharacterField(this.message, 689, 50, "REGAS2");
/*      */      this.fields[17]=this.fieldREGAS3=new CharacterField(this.message, 739, 50, "REGAS3");
/*      */      this.fields[18]=this.fieldREGFL1=new CharacterField(this.message, 789, 1, "REGFL1");
/*      */      this.fields[19]=this.fieldREGFL2=new CharacterField(this.message, 790, 1, "REGFL2");
/*      */      this.fields[20]=this.fieldREGLI1=new DecimalField(this.message, 791, 17, 2, "REGLI1");
/*      */      this.fields[21]=this.fieldREGLI2=new DecimalField(this.message, 808, 17, 2, "REGLI2");
/*      */      this.fields[22]=this.fieldREGLI3=new DecimalField(this.message, 825, 17, 2, "REGLI3");
/*      */      this.fields[23]=this.fieldREGLI4=new DecimalField(this.message, 842, 17, 2, "REGLI4");
/*      */      this.fields[24]=this.fieldREGAC1=new DecimalField(this.message, 859, 17, 2, "REGAC1");
/*      */      this.fields[25]=this.fieldREGAC2=new DecimalField(this.message, 876, 17, 2, "REGAC2");
/*      */      this.fields[26]=this.fieldREGAC3=new DecimalField(this.message, 893, 17, 2, "REGAC3");
/*      */      this.fields[27]=this.fieldREGAC4=new DecimalField(this.message, 910, 17, 2, "REGAC4");
/*      */      this.fields[28]=this.fieldREGSLI=new DecimalField(this.message, 927, 17, 2, "REGSLI");
/*      */      this.fields[29]=this.fieldREGSLT=new DecimalField(this.message, 944, 17, 2, "REGSLT");
/*      */      this.fields[30]=this.fieldREGSLE=new DecimalField(this.message, 961, 17, 2, "REGSLE");
/*      */      this.fields[31]=this.fieldREGSL4=new DecimalField(this.message, 978, 17, 2, "REGSL4");
/*      */      this.fields[32]=this.fieldREGSAI=new DecimalField(this.message, 995, 17, 2, "REGSAI");
/*      */      this.fields[33]=this.fieldREGSAT=new DecimalField(this.message, 1012, 17, 2, "REGSAT");
/*      */      this.fields[34]=this.fieldREGSAE=new DecimalField(this.message, 1029, 17, 2, "REGSAE");
/*      */      this.fields[35]=this.fieldREGSA4=new DecimalField(this.message, 1046, 17, 2, "REGSA4");
/*      */ 
/*  232 */     synchronized (tlookup)
/*      */     {
/*  234 */       if (tlookup.isEmpty())
/*      */       {
/*  236 */         for (int i = 0; i < tnames.length; i++) {
/*  237 */           tlookup.put(tnames[i], new Integer(i));
/*      */         }
/*      */       }
/*      */     }
/*  241 */     this.taglookup = tlookup;
/*      */   }
/*      */ 
/*      */   public void setREGOPT(String newvalue)
/*      */   {
/*  249 */     this.fieldREGOPT.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getREGOPT()
/*      */   {
/*  257 */     return this.fieldREGOPT.getString();
/*      */   }
/*      */ 
/*      */   public void setREGOPT(BigDecimal newvalue)
/*      */   {
/*  265 */     this.fieldREGOPT.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalREGOPT()
/*      */   {
/*  273 */     return this.fieldREGOPT.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setREGSUB(String newvalue)
/*      */   {
/*  281 */     this.fieldREGSUB.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getREGSUB()
/*      */   {
/*  289 */     return this.fieldREGSUB.getString();
/*      */   }
/*      */ 
/*      */   public void setREGSUB(BigDecimal newvalue)
/*      */   {
/*  297 */     this.fieldREGSUB.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalREGSUB()
/*      */   {
/*  305 */     return this.fieldREGSUB.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setREGUSR(String newvalue)
/*      */   {
/*  313 */     this.fieldREGUSR.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getREGUSR()
/*      */   {
/*  321 */     return this.fieldREGUSR.getString();
/*      */   }
/*      */ 
/*      */   public void setREGUSP(String newvalue)
/*      */   {
/*  329 */     this.fieldREGUSP.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getREGUSP()
/*      */   {
/*  337 */     return this.fieldREGUSP.getString();
/*      */   }
/*      */ 
/*      */   public void setREGOPP(String newvalue)
/*      */   {
/*  345 */     this.fieldREGOPP.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getREGOPP()
/*      */   {
/*  353 */     return this.fieldREGOPP.getString();
/*      */   }
/*      */ 
/*      */   public void setREGIDN(String newvalue)
/*      */   {
/*  361 */     this.fieldREGIDN.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getREGIDN()
/*      */   {
/*  369 */     return this.fieldREGIDN.getString();
/*      */   }
/*      */ 
/*      */   public void setREGLGT(String newvalue)
/*      */   {
/*  377 */     this.fieldREGLGT.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getREGLGT()
/*      */   {
/*  385 */     return this.fieldREGLGT.getString();
/*      */   }
/*      */ 
/*      */   public void setREGACN(String newvalue)
/*      */   {
/*  393 */     this.fieldREGACN.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getREGACN()
/*      */   {
/*  401 */     return this.fieldREGACN.getString();
/*      */   }
/*      */ 
/*      */   public void setREGACN(BigDecimal newvalue)
/*      */   {
/*  409 */     this.fieldREGACN.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalREGACN()
/*      */   {
/*  417 */     return this.fieldREGACN.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setREGACP(String newvalue)
/*      */   {
/*  425 */     this.fieldREGACP.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getREGACP()
/*      */   {
/*  433 */     return this.fieldREGACP.getString();
/*      */   }
/*      */ 
/*      */   public void setREGCON(String newvalue)
/*      */   {
/*  441 */     this.fieldREGCON.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getREGCON()
/*      */   {
/*  449 */     return this.fieldREGCON.getString();
/*      */   }
/*      */ 
/*      */   public void setREGEML(String newvalue)
/*      */   {
/*  457 */     this.fieldREGEML.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getREGEML()
/*      */   {
/*  465 */     return this.fieldREGEML.getString();
/*      */   }
/*      */ 
/*      */   public void setREGPAS(String newvalue)
/*      */   {
/*  473 */     this.fieldREGPAS.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getREGPAS()
/*      */   {
/*  481 */     return this.fieldREGPAS.getString();
/*      */   }
/*      */ 
/*      */   public void setREGQS1(String newvalue)
/*      */   {
/*  489 */     this.fieldREGQS1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getREGQS1()
/*      */   {
/*  497 */     return this.fieldREGQS1.getString();
/*      */   }
/*      */ 
/*      */   public void setREGQS2(String newvalue)
/*      */   {
/*  505 */     this.fieldREGQS2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getREGQS2()
/*      */   {
/*  513 */     return this.fieldREGQS2.getString();
/*      */   }
/*      */ 
/*      */   public void setREGQS3(String newvalue)
/*      */   {
/*  521 */     this.fieldREGQS3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getREGQS3()
/*      */   {
/*  529 */     return this.fieldREGQS3.getString();
/*      */   }
/*      */ 
/*      */   public void setREGAS1(String newvalue)
/*      */   {
/*  537 */     this.fieldREGAS1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getREGAS1()
/*      */   {
/*  545 */     return this.fieldREGAS1.getString();
/*      */   }
/*      */ 
/*      */   public void setREGAS2(String newvalue)
/*      */   {
/*  553 */     this.fieldREGAS2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getREGAS2()
/*      */   {
/*  561 */     return this.fieldREGAS2.getString();
/*      */   }
/*      */ 
/*      */   public void setREGAS3(String newvalue)
/*      */   {
/*  569 */     this.fieldREGAS3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getREGAS3()
/*      */   {
/*  577 */     return this.fieldREGAS3.getString();
/*      */   }
/*      */ 
/*      */   public void setREGFL1(String newvalue)
/*      */   {
/*  585 */     this.fieldREGFL1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getREGFL1()
/*      */   {
/*  593 */     return this.fieldREGFL1.getString();
/*      */   }
/*      */ 
/*      */   public void setREGFL2(String newvalue)
/*      */   {
/*  601 */     this.fieldREGFL2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getREGFL2()
/*      */   {
/*  609 */     return this.fieldREGFL2.getString();
/*      */   }
/*      */ 
/*      */   public void setREGLI1(String newvalue)
/*      */   {
/*  617 */     this.fieldREGLI1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getREGLI1()
/*      */   {
/*  625 */     return this.fieldREGLI1.getString();
/*      */   }
/*      */ 
/*      */   public void setREGLI1(BigDecimal newvalue)
/*      */   {
/*  633 */     this.fieldREGLI1.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalREGLI1()
/*      */   {
/*  641 */     return this.fieldREGLI1.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setREGLI2(String newvalue)
/*      */   {
/*  649 */     this.fieldREGLI2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getREGLI2()
/*      */   {
/*  657 */     return this.fieldREGLI2.getString();
/*      */   }
/*      */ 
/*      */   public void setREGLI2(BigDecimal newvalue)
/*      */   {
/*  665 */     this.fieldREGLI2.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalREGLI2()
/*      */   {
/*  673 */     return this.fieldREGLI2.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setREGLI3(String newvalue)
/*      */   {
/*  681 */     this.fieldREGLI3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getREGLI3()
/*      */   {
/*  689 */     return this.fieldREGLI3.getString();
/*      */   }
/*      */ 
/*      */   public void setREGLI3(BigDecimal newvalue)
/*      */   {
/*  697 */     this.fieldREGLI3.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalREGLI3()
/*      */   {
/*  705 */     return this.fieldREGLI3.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setREGLI4(String newvalue)
/*      */   {
/*  713 */     this.fieldREGLI4.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getREGLI4()
/*      */   {
/*  721 */     return this.fieldREGLI4.getString();
/*      */   }
/*      */ 
/*      */   public void setREGLI4(BigDecimal newvalue)
/*      */   {
/*  729 */     this.fieldREGLI4.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalREGLI4()
/*      */   {
/*  737 */     return this.fieldREGLI4.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setREGAC1(String newvalue)
/*      */   {
/*  745 */     this.fieldREGAC1.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getREGAC1()
/*      */   {
/*  753 */     return this.fieldREGAC1.getString();
/*      */   }
/*      */ 
/*      */   public void setREGAC1(BigDecimal newvalue)
/*      */   {
/*  761 */     this.fieldREGAC1.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalREGAC1()
/*      */   {
/*  769 */     return this.fieldREGAC1.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setREGAC2(String newvalue)
/*      */   {
/*  777 */     this.fieldREGAC2.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getREGAC2()
/*      */   {
/*  785 */     return this.fieldREGAC2.getString();
/*      */   }
/*      */ 
/*      */   public void setREGAC2(BigDecimal newvalue)
/*      */   {
/*  793 */     this.fieldREGAC2.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalREGAC2()
/*      */   {
/*  801 */     return this.fieldREGAC2.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setREGAC3(String newvalue)
/*      */   {
/*  809 */     this.fieldREGAC3.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getREGAC3()
/*      */   {
/*  817 */     return this.fieldREGAC3.getString();
/*      */   }
/*      */ 
/*      */   public void setREGAC3(BigDecimal newvalue)
/*      */   {
/*  825 */     this.fieldREGAC3.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalREGAC3()
/*      */   {
/*  833 */     return this.fieldREGAC3.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setREGAC4(String newvalue)
/*      */   {
/*  841 */     this.fieldREGAC4.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getREGAC4()
/*      */   {
/*  849 */     return this.fieldREGAC4.getString();
/*      */   }
/*      */ 
/*      */   public void setREGAC4(BigDecimal newvalue)
/*      */   {
/*  857 */     this.fieldREGAC4.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalREGAC4()
/*      */   {
/*  865 */     return this.fieldREGAC4.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setREGSLI(String newvalue)
/*      */   {
/*  873 */     this.fieldREGSLI.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getREGSLI()
/*      */   {
/*  881 */     return this.fieldREGSLI.getString();
/*      */   }
/*      */ 
/*      */   public void setREGSLI(BigDecimal newvalue)
/*      */   {
/*  889 */     this.fieldREGSLI.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalREGSLI()
/*      */   {
/*  897 */     return this.fieldREGSLI.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setREGSLT(String newvalue)
/*      */   {
/*  905 */     this.fieldREGSLT.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getREGSLT()
/*      */   {
/*  913 */     return this.fieldREGSLT.getString();
/*      */   }
/*      */ 
/*      */   public void setREGSLT(BigDecimal newvalue)
/*      */   {
/*  921 */     this.fieldREGSLT.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalREGSLT()
/*      */   {
/*  929 */     return this.fieldREGSLT.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setREGSLE(String newvalue)
/*      */   {
/*  937 */     this.fieldREGSLE.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getREGSLE()
/*      */   {
/*  945 */     return this.fieldREGSLE.getString();
/*      */   }
/*      */ 
/*      */   public void setREGSLE(BigDecimal newvalue)
/*      */   {
/*  953 */     this.fieldREGSLE.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalREGSLE()
/*      */   {
/*  961 */     return this.fieldREGSLE.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setREGSL4(String newvalue)
/*      */   {
/*  969 */     this.fieldREGSL4.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getREGSL4()
/*      */   {
/*  977 */     return this.fieldREGSL4.getString();
/*      */   }
/*      */ 
/*      */   public void setREGSL4(BigDecimal newvalue)
/*      */   {
/*  985 */     this.fieldREGSL4.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalREGSL4()
/*      */   {
/*  993 */     return this.fieldREGSL4.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setREGSAI(String newvalue)
/*      */   {
/* 1001 */     this.fieldREGSAI.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getREGSAI()
/*      */   {
/* 1009 */     return this.fieldREGSAI.getString();
/*      */   }
/*      */ 
/*      */   public void setREGSAI(BigDecimal newvalue)
/*      */   {
/* 1017 */     this.fieldREGSAI.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalREGSAI()
/*      */   {
/* 1025 */     return this.fieldREGSAI.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setREGSAT(String newvalue)
/*      */   {
/* 1033 */     this.fieldREGSAT.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getREGSAT()
/*      */   {
/* 1041 */     return this.fieldREGSAT.getString();
/*      */   }
/*      */ 
/*      */   public void setREGSAT(BigDecimal newvalue)
/*      */   {
/* 1049 */     this.fieldREGSAT.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalREGSAT()
/*      */   {
/* 1057 */     return this.fieldREGSAT.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setREGSAE(String newvalue)
/*      */   {
/* 1065 */     this.fieldREGSAE.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getREGSAE()
/*      */   {
/* 1073 */     return this.fieldREGSAE.getString();
/*      */   }
/*      */ 
/*      */   public void setREGSAE(BigDecimal newvalue)
/*      */   {
/* 1081 */     this.fieldREGSAE.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalREGSAE()
/*      */   {
/* 1089 */     return this.fieldREGSAE.getBigDecimal();
/*      */   }
/*      */ 
/*      */   public void setREGSA4(String newvalue)
/*      */   {
/* 1097 */     this.fieldREGSA4.setString(newvalue);
/*      */   }
/*      */ 
/*      */   public String getREGSA4()
/*      */   {
/* 1105 */     return this.fieldREGSA4.getString();
/*      */   }
/*      */ 
/*      */   public void setREGSA4(BigDecimal newvalue)
/*      */   {
/* 1113 */     this.fieldREGSA4.setBigDecimal(newvalue);
/*      */   }
/*      */ 
/*      */   public BigDecimal getBigDecimalREGSA4()
/*      */   {
/* 1121 */     return this.fieldREGSA4.getBigDecimal();
/*      */   }
/*      */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.REGISTERMessage
 * JD-Core Version:    0.6.0
 */