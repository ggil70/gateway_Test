/*      */ package com.activo.gateway.dibs.databeans;
/*      */ 
/*      */ import java.io.Serializable;
import java.math.BigDecimal;
/*      */ 
/*      */ public class DC_LETCRDAMD
/*      */   implements Serializable
/*      */ {
/*   21 */   protected String ENTITYID = "";
/*      */ 
/*   39 */   protected String STS = "";
/*      */ 
/*   57 */   protected String PRDLCR = "";
/*      */ 
/*   75 */   protected String DCIBS_REF = "";
/*      */ 
/*   93 */   protected String AMD_REF = "";
/*      */ 
/*  111 */   protected String LCR_REF = "";
/*      */ 
/*  129 */   protected String AMD_NUM = "";
/*      */ 
/*  147 */   protected String BNFLCR1 = "";
/*      */ 
/*  165 */   protected String BNFLCR2 = "";
/*      */ 
/*  183 */   protected String BNFLCR3 = "";
/*      */ 
/*  201 */   protected String BNFLCR4 = "";
/*      */ 
/*  219 */   protected BigDecimal AMTLCR = new BigDecimal("0");
/*      */ 
/*  237 */   protected String INDAMT = "";
/*      */ 
/*  255 */   protected BigDecimal AMDAMT = new BigDecimal("0");
/*      */ 
/*  273 */   protected String SHPFROM = "";
/*      */ 
/*  291 */   protected String AMTADD1 = "";
/*      */ 
/*  309 */   protected String AMTADD2 = "";
/*      */ 
/*  327 */   protected String AMTADD3 = "";
/*      */ 
/*  345 */   protected String AMTADD4 = "";
/*      */ 
/*  363 */   protected String EXPPLC = "";
/*      */ 
/*  381 */   protected String NAVLCR = "";
/*      */ 
/*  399 */   protected String DFTLCR1 = "";
/*      */ 
/*  417 */   protected String DFTLCR2 = "";
/*      */ 
/*  435 */   protected String DFTLCR3 = "";
/*      */ 
/*  453 */   protected String DRWLCR = "";
/*      */ 
/*  471 */   protected String SHPTRM = "";
/*      */ 
/*  489 */   protected String SHPTO = "";
/*      */ 
/*  507 */   protected String OTHCHG1 = "";
/*      */ 
/*  525 */   protected String OTHCHG2 = "";
/*      */ 
/*  543 */   protected String OTHCHG3 = "";
/*      */ 
/*  561 */   protected String OTHCHG4 = "";
/*      */ 
/*  579 */   protected String NARR1 = "";
/*      */ 
/*  597 */   protected String NARR2 = "";
/*      */ 
/*  615 */   protected String NARR3 = "";
/*      */ 
/*  633 */   protected String NARR4 = "";
/*      */ 
/*  651 */   protected String SHPPER1 = "";
/*      */ 
/*  669 */   protected String SHPPER2 = "";
/*      */ 
/*  687 */   protected String SHPPER3 = "";
/*      */ 
/*  705 */   protected String SHPPER4 = "";
/*      */ 
/*  723 */   protected String SNDREC1 = "";
/*      */ 
/*  741 */   protected String SNDREC2 = "";
/*      */ 
/*  759 */   protected String SNDREC3 = "";
/*      */ 
/*  777 */   protected String SNDREC4 = "";
/*      */ 
/*  795 */   protected String ODATE = "";
/*      */ 
/*  813 */   protected String VDATE = "";
/*      */ 
/*  831 */   protected String ADATE = "";
/*      */ 
/*  849 */   protected String OUSER = "";
/*      */ 
/*  867 */   protected String VUSER = "";
/*      */ 
/*  885 */   protected String AUSER = "";
/*      */ 
/*  903 */   protected String FLAG = "";
/*      */ 
/*  921 */   protected int NUMAPR = 0;
/*      */ 
/*  939 */   protected String EXPDT1 = "";
/*      */ 
/*  957 */   protected String EXPDT2 = "";
/*      */ 
/*  975 */   protected String EXPDT3 = "";
/*      */ 
/*  993 */   protected String LSHDT1 = "";
/*      */ 
/* 1011 */   protected String LSHDT2 = "";
/*      */ 
/* 1029 */   protected String LSHDT3 = "";
/*      */ 
/* 1047 */   protected String ISSDT1 = "";
/*      */ 
/* 1065 */   protected String ISSDT2 = "";
/*      */ 
/* 1083 */   protected String ISSDT3 = "";
/*      */ 
/* 1101 */   protected String AMDDT1 = "";
/*      */ 
/* 1119 */   protected String AMDDT2 = "";
/*      */ 
/* 1137 */   protected String AMDDT3 = "";
/*      */ 
/*      */   public String getENTITYID()
/*      */   {
/*   27 */     return this.ENTITYID.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setENTITYID(String ENTITYID)
/*      */   {
/*   34 */     this.ENTITYID = ENTITYID;
/*      */   }
/*      */ 
/*      */   public String getSTS()
/*      */   {
/*   45 */     return this.STS.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setSTS(String STS)
/*      */   {
/*   52 */     this.STS = STS;
/*      */   }
/*      */ 
/*      */   public String getPRDLCR()
/*      */   {
/*   63 */     return this.PRDLCR.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setPRDLCR(String PRDLCR)
/*      */   {
/*   70 */     this.PRDLCR = PRDLCR;
/*      */   }
/*      */ 
/*      */   public String getDCIBS_REF()
/*      */   {
/*   81 */     return this.DCIBS_REF.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setDCIBS_REF(String DCIBS_REF)
/*      */   {
/*   88 */     this.DCIBS_REF = DCIBS_REF;
/*      */   }
/*      */ 
/*      */   public String getAMD_REF()
/*      */   {
/*   99 */     return this.AMD_REF.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setAMD_REF(String AMD_REF)
/*      */   {
/*  106 */     this.AMD_REF = AMD_REF;
/*      */   }
/*      */ 
/*      */   public String getLCR_REF()
/*      */   {
/*  117 */     return this.LCR_REF.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setLCR_REF(String LCR_REF)
/*      */   {
/*  124 */     this.LCR_REF = LCR_REF;
/*      */   }
/*      */ 
/*      */   public String getAMD_NUM()
/*      */   {
/*  135 */     return this.AMD_NUM.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setAMD_NUM(String AMD_NUM)
/*      */   {
/*  142 */     this.AMD_NUM = AMD_NUM;
/*      */   }
/*      */ 
/*      */   public String getBNFLCR1()
/*      */   {
/*  153 */     return this.BNFLCR1.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setBNFLCR1(String BNFLCR1)
/*      */   {
/*  160 */     this.BNFLCR1 = BNFLCR1;
/*      */   }
/*      */ 
/*      */   public String getBNFLCR2()
/*      */   {
/*  171 */     return this.BNFLCR2.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setBNFLCR2(String BNFLCR2)
/*      */   {
/*  178 */     this.BNFLCR2 = BNFLCR2;
/*      */   }
/*      */ 
/*      */   public String getBNFLCR3()
/*      */   {
/*  189 */     return this.BNFLCR3.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setBNFLCR3(String BNFLCR3)
/*      */   {
/*  196 */     this.BNFLCR3 = BNFLCR3;
/*      */   }
/*      */ 
/*      */   public String getBNFLCR4()
/*      */   {
/*  207 */     return this.BNFLCR4.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setBNFLCR4(String BNFLCR4)
/*      */   {
/*  214 */     this.BNFLCR4 = BNFLCR4;
/*      */   }
/*      */ 
/*      */   public BigDecimal getAMTLCR()
/*      */   {
/*  225 */     return this.AMTLCR;
/*      */   }
/*      */ 
/*      */   public void setAMTLCR(BigDecimal AMTLCR)
/*      */   {
/*  232 */     this.AMTLCR = AMTLCR;
/*      */   }
/*      */ 
/*      */   public String getINDAMT()
/*      */   {
/*  243 */     return this.INDAMT.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setINDAMT(String INDAMT)
/*      */   {
/*  250 */     this.INDAMT = INDAMT;
/*      */   }
/*      */ 
/*      */   public BigDecimal getAMDAMT()
/*      */   {
/*  261 */     return this.AMDAMT;
/*      */   }
/*      */ 
/*      */   public void setAMDAMT(BigDecimal AMDAMT)
/*      */   {
/*  268 */     this.AMDAMT = AMDAMT;
/*      */   }
/*      */ 
/*      */   public String getSHPFROM()
/*      */   {
/*  279 */     return this.SHPFROM.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setSHPFROM(String SHPFROM)
/*      */   {
/*  286 */     this.SHPFROM = SHPFROM;
/*      */   }
/*      */ 
/*      */   public String getAMTADD1()
/*      */   {
/*  297 */     return this.AMTADD1.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setAMTADD1(String AMTADD1)
/*      */   {
/*  304 */     this.AMTADD1 = AMTADD1;
/*      */   }
/*      */ 
/*      */   public String getAMTADD2()
/*      */   {
/*  315 */     return this.AMTADD2.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setAMTADD2(String AMTADD2)
/*      */   {
/*  322 */     this.AMTADD2 = AMTADD2;
/*      */   }
/*      */ 
/*      */   public String getAMTADD3()
/*      */   {
/*  333 */     return this.AMTADD3.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setAMTADD3(String AMTADD3)
/*      */   {
/*  340 */     this.AMTADD3 = AMTADD3;
/*      */   }
/*      */ 
/*      */   public String getAMTADD4()
/*      */   {
/*  351 */     return this.AMTADD4.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setAMTADD4(String AMTADD4)
/*      */   {
/*  358 */     this.AMTADD4 = AMTADD4;
/*      */   }
/*      */ 
/*      */   public String getEXPPLC()
/*      */   {
/*  369 */     return this.EXPPLC.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setEXPPLC(String EXPPLC)
/*      */   {
/*  376 */     this.EXPPLC = EXPPLC;
/*      */   }
/*      */ 
/*      */   public String getNAVLCR()
/*      */   {
/*  387 */     return this.NAVLCR.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setNAVLCR(String NAVLCR)
/*      */   {
/*  394 */     this.NAVLCR = NAVLCR;
/*      */   }
/*      */ 
/*      */   public String getDFTLCR1()
/*      */   {
/*  405 */     return this.DFTLCR1.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setDFTLCR1(String DFTLCR1)
/*      */   {
/*  412 */     this.DFTLCR1 = DFTLCR1;
/*      */   }
/*      */ 
/*      */   public String getDFTLCR2()
/*      */   {
/*  423 */     return this.DFTLCR2.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setDFTLCR2(String DFTLCR2)
/*      */   {
/*  430 */     this.DFTLCR2 = DFTLCR2;
/*      */   }
/*      */ 
/*      */   public String getDFTLCR3()
/*      */   {
/*  441 */     return this.DFTLCR3.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setDFTLCR3(String DFTLCR3)
/*      */   {
/*  448 */     this.DFTLCR3 = DFTLCR3;
/*      */   }
/*      */ 
/*      */   public String getDRWLCR()
/*      */   {
/*  459 */     return this.DRWLCR.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setDRWLCR(String DRWLCR)
/*      */   {
/*  466 */     this.DRWLCR = DRWLCR;
/*      */   }
/*      */ 
/*      */   public String getSHPTRM()
/*      */   {
/*  477 */     return this.SHPTRM.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setSHPTRM(String SHPTRM)
/*      */   {
/*  484 */     this.SHPTRM = SHPTRM;
/*      */   }
/*      */ 
/*      */   public String getSHPTO()
/*      */   {
/*  495 */     return this.SHPTO.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setSHPTO(String SHPTO)
/*      */   {
/*  502 */     this.SHPTO = SHPTO;
/*      */   }
/*      */ 
/*      */   public String getOTHCHG1()
/*      */   {
/*  513 */     return this.OTHCHG1.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setOTHCHG1(String OTHCHG1)
/*      */   {
/*  520 */     this.OTHCHG1 = OTHCHG1;
/*      */   }
/*      */ 
/*      */   public String getOTHCHG2()
/*      */   {
/*  531 */     return this.OTHCHG2.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setOTHCHG2(String OTHCHG2)
/*      */   {
/*  538 */     this.OTHCHG2 = OTHCHG2;
/*      */   }
/*      */ 
/*      */   public String getOTHCHG3()
/*      */   {
/*  549 */     return this.OTHCHG3.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setOTHCHG3(String OTHCHG3)
/*      */   {
/*  556 */     this.OTHCHG3 = OTHCHG3;
/*      */   }
/*      */ 
/*      */   public String getOTHCHG4()
/*      */   {
/*  567 */     return this.OTHCHG4.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setOTHCHG4(String OTHCHG4)
/*      */   {
/*  574 */     this.OTHCHG4 = OTHCHG4;
/*      */   }
/*      */ 
/*      */   public String getNARR1()
/*      */   {
/*  585 */     return this.NARR1.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setNARR1(String NARR1)
/*      */   {
/*  592 */     this.NARR1 = NARR1;
/*      */   }
/*      */ 
/*      */   public String getNARR2()
/*      */   {
/*  603 */     return this.NARR2.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setNARR2(String NARR2)
/*      */   {
/*  610 */     this.NARR2 = NARR2;
/*      */   }
/*      */ 
/*      */   public String getNARR3()
/*      */   {
/*  621 */     return this.NARR3.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setNARR3(String NARR3)
/*      */   {
/*  628 */     this.NARR3 = NARR3;
/*      */   }
/*      */ 
/*      */   public String getNARR4()
/*      */   {
/*  639 */     return this.NARR4.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setNARR4(String NARR4)
/*      */   {
/*  646 */     this.NARR4 = NARR4;
/*      */   }
/*      */ 
/*      */   public String getSHPPER1()
/*      */   {
/*  657 */     return this.SHPPER1.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setSHPPER1(String SHPPER1)
/*      */   {
/*  664 */     this.SHPPER1 = SHPPER1;
/*      */   }
/*      */ 
/*      */   public String getSHPPER2()
/*      */   {
/*  675 */     return this.SHPPER2.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setSHPPER2(String SHPPER2)
/*      */   {
/*  682 */     this.SHPPER2 = SHPPER2;
/*      */   }
/*      */ 
/*      */   public String getSHPPER3()
/*      */   {
/*  693 */     return this.SHPPER3.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setSHPPER3(String SHPPER3)
/*      */   {
/*  700 */     this.SHPPER3 = SHPPER3;
/*      */   }
/*      */ 
/*      */   public String getSHPPER4()
/*      */   {
/*  711 */     return this.SHPPER4.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setSHPPER4(String SHPPER4)
/*      */   {
/*  718 */     this.SHPPER4 = SHPPER4;
/*      */   }
/*      */ 
/*      */   public String getSNDREC1()
/*      */   {
/*  729 */     return this.SNDREC1.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setSNDREC1(String SNDREC1)
/*      */   {
/*  736 */     this.SNDREC1 = SNDREC1;
/*      */   }
/*      */ 
/*      */   public String getSNDREC2()
/*      */   {
/*  747 */     return this.SNDREC2.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setSNDREC2(String SNDREC2)
/*      */   {
/*  754 */     this.SNDREC2 = SNDREC2;
/*      */   }
/*      */ 
/*      */   public String getSNDREC3()
/*      */   {
/*  765 */     return this.SNDREC3.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setSNDREC3(String SNDREC3)
/*      */   {
/*  772 */     this.SNDREC3 = SNDREC3;
/*      */   }
/*      */ 
/*      */   public String getSNDREC4()
/*      */   {
/*  783 */     return this.SNDREC4.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setSNDREC4(String SNDREC4)
/*      */   {
/*  790 */     this.SNDREC4 = SNDREC4;
/*      */   }
/*      */ 
/*      */   public String getODATE()
/*      */   {
/*  801 */     return this.ODATE.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setODATE(String ODATE)
/*      */   {
/*  808 */     this.ODATE = ODATE;
/*      */   }
/*      */ 
/*      */   public String getVDATE()
/*      */   {
/*  819 */     return this.VDATE.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setVDATE(String VDATE)
/*      */   {
/*  826 */     this.VDATE = VDATE;
/*      */   }
/*      */ 
/*      */   public String getADATE()
/*      */   {
/*  837 */     return this.ADATE.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setADATE(String ADATE)
/*      */   {
/*  844 */     this.ADATE = ADATE;
/*      */   }
/*      */ 
/*      */   public String getOUSER()
/*      */   {
/*  855 */     return this.OUSER.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setOUSER(String OUSER)
/*      */   {
/*  862 */     this.OUSER = OUSER;
/*      */   }
/*      */ 
/*      */   public String getVUSER()
/*      */   {
/*  873 */     return this.VUSER.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setVUSER(String VUSER)
/*      */   {
/*  880 */     this.VUSER = VUSER;
/*      */   }
/*      */ 
/*      */   public String getAUSER()
/*      */   {
/*  891 */     return this.AUSER.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setAUSER(String AUSER)
/*      */   {
/*  898 */     this.AUSER = AUSER;
/*      */   }
/*      */ 
/*      */   public String getFLAG()
/*      */   {
/*  909 */     return this.FLAG.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setFLAG(String FLAG)
/*      */   {
/*  916 */     this.FLAG = FLAG;
/*      */   }
/*      */ 
/*      */   public int getNUMAPR()
/*      */   {
/*  927 */     return this.NUMAPR;
/*      */   }
/*      */ 
/*      */   public void setNUMAPR(int NUMAPR)
/*      */   {
/*  934 */     this.NUMAPR = NUMAPR;
/*      */   }
/*      */ 
/*      */   public String getEXPDT1()
/*      */   {
/*  945 */     return this.EXPDT1.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setEXPDT1(String EXPDT1)
/*      */   {
/*  952 */     this.EXPDT1 = EXPDT1;
/*      */   }
/*      */ 
/*      */   public String getEXPDT2()
/*      */   {
/*  963 */     return this.EXPDT2.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setEXPDT2(String EXPDT2)
/*      */   {
/*  970 */     this.EXPDT2 = EXPDT2;
/*      */   }
/*      */ 
/*      */   public String getEXPDT3()
/*      */   {
/*  981 */     return this.EXPDT3.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setEXPDT3(String EXPDT3)
/*      */   {
/*  988 */     this.EXPDT3 = EXPDT3;
/*      */   }
/*      */ 
/*      */   public String getLSHDT1()
/*      */   {
/*  999 */     return this.LSHDT1.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setLSHDT1(String LSHDT1)
/*      */   {
/* 1006 */     this.LSHDT1 = LSHDT1;
/*      */   }
/*      */ 
/*      */   public String getLSHDT2()
/*      */   {
/* 1017 */     return this.LSHDT2.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setLSHDT2(String LSHDT2)
/*      */   {
/* 1024 */     this.LSHDT2 = LSHDT2;
/*      */   }
/*      */ 
/*      */   public String getLSHDT3()
/*      */   {
/* 1035 */     return this.LSHDT3.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setLSHDT3(String LSHDT3)
/*      */   {
/* 1042 */     this.LSHDT3 = LSHDT3;
/*      */   }
/*      */ 
/*      */   public String getISSDT1()
/*      */   {
/* 1053 */     return this.ISSDT1.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setISSDT1(String ISSDT1)
/*      */   {
/* 1060 */     this.ISSDT1 = ISSDT1;
/*      */   }
/*      */ 
/*      */   public String getISSDT2()
/*      */   {
/* 1071 */     return this.ISSDT2.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setISSDT2(String ISSDT2)
/*      */   {
/* 1078 */     this.ISSDT2 = ISSDT2;
/*      */   }
/*      */ 
/*      */   public String getISSDT3()
/*      */   {
/* 1089 */     return this.ISSDT3.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setISSDT3(String ISSDT3)
/*      */   {
/* 1096 */     this.ISSDT3 = ISSDT3;
/*      */   }
/*      */ 
/*      */   public String getAMDDT1()
/*      */   {
/* 1107 */     return this.AMDDT1.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setAMDDT1(String AMDDT1)
/*      */   {
/* 1114 */     this.AMDDT1 = AMDDT1;
/*      */   }
/*      */ 
/*      */   public String getAMDDT2()
/*      */   {
/* 1125 */     return this.AMDDT2.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setAMDDT2(String AMDDT2)
/*      */   {
/* 1132 */     this.AMDDT2 = AMDDT2;
/*      */   }
/*      */ 
/*      */   public String getAMDDT3()
/*      */   {
/* 1143 */     return this.AMDDT3.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setAMDDT3(String AMDDT3)
/*      */   {
/* 1150 */     this.AMDDT3 = AMDDT3;
/*      */   }
/*      */   public String toString() {
/* 1153 */     StringBuffer results = new StringBuffer();
/*      */ 
/* 1155 */     results.append(getClass().getName() + "\n");
/* 1156 */     results.append("\tENTITYID=" + this.ENTITYID + "\n");
/* 1157 */     results.append("\tSTS=" + this.STS + "\n");
/* 1158 */     results.append("\tPRDLCR=" + this.PRDLCR + "\n");
/* 1159 */     results.append("\tDCIBS_REF=" + this.DCIBS_REF + "\n");
/* 1160 */     results.append("\tAMD_REF=" + this.AMD_REF + "\n");
/* 1161 */     results.append("\tLCR_REF=" + this.LCR_REF + "\n");
/* 1162 */     results.append("\tAMD_NUM=" + this.AMD_NUM + "\n");
/* 1163 */     results.append("\tBNFLCR1=" + this.BNFLCR1 + "\n");
/* 1164 */     results.append("\tBNFLCR2=" + this.BNFLCR2 + "\n");
/* 1165 */     results.append("\tBNFLCR3=" + this.BNFLCR3 + "\n");
/* 1166 */     results.append("\tBNFLCR4=" + this.BNFLCR4 + "\n");
/* 1167 */     results.append("\tAMTLCR=" + this.AMTLCR + "\n");
/* 1168 */     results.append("\tINDAMT=" + this.INDAMT + "\n");
/* 1169 */     results.append("\tAMDAMT=" + this.AMDAMT + "\n");
/* 1170 */     results.append("\tSHPFROM=" + this.SHPFROM + "\n");
/* 1171 */     results.append("\tAMTADD1=" + this.AMTADD1 + "\n");
/* 1172 */     results.append("\tAMTADD2=" + this.AMTADD2 + "\n");
/* 1173 */     results.append("\tAMTADD3=" + this.AMTADD3 + "\n");
/* 1174 */     results.append("\tAMTADD4=" + this.AMTADD4 + "\n");
/* 1175 */     results.append("\tEXPPLC=" + this.EXPPLC + "\n");
/* 1176 */     results.append("\tNAVLCR=" + this.NAVLCR + "\n");
/* 1177 */     results.append("\tDFTLCR1=" + this.DFTLCR1 + "\n");
/* 1178 */     results.append("\tDFTLCR2=" + this.DFTLCR2 + "\n");
/* 1179 */     results.append("\tDFTLCR3=" + this.DFTLCR3 + "\n");
/* 1180 */     results.append("\tDRWLCR=" + this.DRWLCR + "\n");
/* 1181 */     results.append("\tSHPTRM=" + this.SHPTRM + "\n");
/* 1182 */     results.append("\tSHPTO=" + this.SHPTO + "\n");
/* 1183 */     results.append("\tOTHCHG1=" + this.OTHCHG1 + "\n");
/* 1184 */     results.append("\tOTHCHG2=" + this.OTHCHG2 + "\n");
/* 1185 */     results.append("\tOTHCHG3=" + this.OTHCHG3 + "\n");
/* 1186 */     results.append("\tOTHCHG4=" + this.OTHCHG4 + "\n");
/* 1187 */     results.append("\tNARR1=" + this.NARR1 + "\n");
/* 1188 */     results.append("\tNARR2=" + this.NARR2 + "\n");
/* 1189 */     results.append("\tNARR3=" + this.NARR3 + "\n");
/* 1190 */     results.append("\tNARR4=" + this.NARR4 + "\n");
/* 1191 */     results.append("\tSHPPER1=" + this.SHPPER1 + "\n");
/* 1192 */     results.append("\tSHPPER2=" + this.SHPPER2 + "\n");
/* 1193 */     results.append("\tSHPPER3=" + this.SHPPER3 + "\n");
/* 1194 */     results.append("\tSHPPER4=" + this.SHPPER4 + "\n");
/* 1195 */     results.append("\tSNDREC1=" + this.SNDREC1 + "\n");
/* 1196 */     results.append("\tSNDREC2=" + this.SNDREC2 + "\n");
/* 1197 */     results.append("\tSNDREC3=" + this.SNDREC3 + "\n");
/* 1198 */     results.append("\tSNDREC4=" + this.SNDREC4 + "\n");
/* 1199 */     results.append("\tODATE=" + this.ODATE + "\n");
/* 1200 */     results.append("\tVDATE=" + this.VDATE + "\n");
/* 1201 */     results.append("\tADATE=" + this.ADATE + "\n");
/* 1202 */     results.append("\tOUSER=" + this.OUSER + "\n");
/* 1203 */     results.append("\tVUSER=" + this.VUSER + "\n");
/* 1204 */     results.append("\tAUSER=" + this.AUSER + "\n");
/* 1205 */     results.append("\tFLAG=" + this.FLAG + "\n");
/* 1206 */     results.append("\tNUMAPR=" + this.NUMAPR + "\n");
/* 1207 */     results.append("\tEXPDT1=" + this.EXPDT1 + "\n");
/* 1208 */     results.append("\tEXPDT2=" + this.EXPDT2 + "\n");
/* 1209 */     results.append("\tEXPDT3=" + this.EXPDT3 + "\n");
/* 1210 */     results.append("\tLSHDT1=" + this.LSHDT1 + "\n");
/* 1211 */     results.append("\tLSHDT2=" + this.LSHDT2 + "\n");
/* 1212 */     results.append("\tLSHDT3=" + this.LSHDT3 + "\n");
/* 1213 */     results.append("\tISSDT1=" + this.ISSDT1 + "\n");
/* 1214 */     results.append("\tISSDT2=" + this.ISSDT2 + "\n");
/* 1215 */     results.append("\tISSDT3=" + this.ISSDT3 + "\n");
/* 1216 */     results.append("\tAMDDT1=" + this.AMDDT1 + "\n");
/* 1217 */     results.append("\tAMDDT2=" + this.AMDDT2 + "\n");
/* 1218 */     results.append("\tAMDDT3=" + this.AMDDT3 + "\n");
/*      */ 
/* 1220 */     return results.toString();
/*      */   }
/*      */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.databeans.DC_LETCRDAMD
 * JD-Core Version:    0.6.0
 */