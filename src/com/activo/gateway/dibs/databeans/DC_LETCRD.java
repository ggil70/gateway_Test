/*      */ package com.activo.gateway.dibs.databeans;
/*      */ 
/*      */ import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
/*      */ 
/*      */ public class DC_LETCRD
/*      */   implements Serializable
/*      */ {
/*   21 */   protected String ENTITYID = "";
/*      */ 
/*   39 */   protected String REFLCR = "";
/*      */ 
/*   57 */   protected String TREFLCR = "";
/*      */ 
/*   75 */   protected String PRDLCR = "";
/*      */ 
/*   93 */   protected String CLSLCR = "";
/*      */ 
/*  111 */   protected String CNFLCR = "";
/*      */ 
/*  129 */   protected String APPLCR1 = "";
/*      */ 
/*  147 */   protected String APPLCR2 = "";
/*      */ 
/*  165 */   protected String APPLCR3 = "";
/*      */ 
/*  183 */   protected String APPLCR4 = "";
/*      */ 
/*  201 */   protected String APPACC = "";
/*      */ 
/*  219 */   protected String BNFLCR1 = "";
/*      */ 
/*  237 */   protected String BNFLCR2 = "";
/*      */ 
/*  255 */   protected String BNFLCR3 = "";
/*      */ 
/*  273 */   protected String BNFLCR4 = "";
/*      */ 
/*  291 */   protected BigDecimal AMTLCR = new BigDecimal("0");
/*      */ 
/*  309 */   protected String CCYLCR = "";
/*      */ 
/*  327 */   protected String MAXLCR = "";
/*      */ 
/*  345 */   protected BigDecimal ABPLCR = new BigDecimal("0");
/*      */ 
/*  363 */   protected BigDecimal ABMLCR = new BigDecimal("0");
/*      */ 
/*  381 */   protected String AMTADD1 = "";
/*      */ 
/*  399 */   protected String AMTADD2 = "";
/*      */ 
/*  417 */   protected String AMTADD3 = "";
/*      */ 
/*  435 */   protected String AMTADD4 = "";
/*      */ 
/*  453 */   protected String EXPPLC = "";
/*      */ 
/*  471 */   protected String NAVLCR = "";
/*      */ 
/*  489 */   protected String DFTLCR1 = "";
/*      */ 
/*  507 */   protected String DFTLCR2 = "";
/*      */ 
/*  525 */   protected String DFTLCR3 = "";
/*      */ 
/*  543 */   protected String DRWLCR = "";
/*      */ 
/*  561 */   protected String SHPTRM = "";
/*      */ 
/*  579 */   protected String PSHLCR = "";
/*      */ 
/*  597 */   protected String TSHLCR = "";
/*      */ 
/*  615 */   protected String OTHCHG1 = "";
/*      */ 
/*  633 */   protected String OTHCHG2 = "";
/*      */ 
/*  651 */   protected String OTHCHG3 = "";
/*      */ 
/*  669 */   protected String OTHCHG4 = "";
/*      */ 
/*  687 */   protected String ADVBNK1 = "";
/*      */ 
/*  705 */   protected String ADVBNK2 = "";
/*      */ 
/*  723 */   protected String ADVBNK3 = "";
/*      */ 
/*  741 */   protected String ADVBNK4 = "";
/*      */ 
/*  759 */   protected String PERPRE1 = "";
/*      */ 
/*  777 */   protected String PERPRE2 = "";
/*      */ 
/*  795 */   protected String PERPRE3 = "";
/*      */ 
/*  813 */   protected String PERPRE4 = "";
/*      */ 
/*  831 */   protected String LANG = "";
/*      */ 
/*  849 */   protected Timestamp DTTM = null;
/*      */ 
/*  867 */   protected String STS = "";
/*      */ 
/*  885 */   protected String DCIBS_REF = "";
/*      */ 
/*  903 */   protected String ODATE = "";
/*      */ 
/*  921 */   protected String VDATE = "";
/*      */ 
/*  939 */   protected String ADATE = "";
/*      */ 
/*  957 */   protected String OUSER = "";
/*      */ 
/*  975 */   protected String VUSER = "";
/*      */ 
/*  993 */   protected String AUSER = "";
/*      */ 
/* 1011 */   protected int NUMAPR = 0;
/*      */ 
/* 1029 */   protected String LCR_REF = "";
/*      */ 
/* 1047 */   protected double PERTOLP = 0.0D;
/*      */ 
/* 1065 */   protected String DRAF1 = "";
/*      */ 
/* 1083 */   protected String DRAF2 = "";
/*      */ 
/* 1101 */   protected String DRAF3 = "";
/*      */ 
/* 1119 */   protected String DRAWEE = "";
/*      */ 
/* 1137 */   protected String DPAY1 = "";
/*      */ 
/* 1155 */   protected String DPAY2 = "";
/*      */ 
/* 1173 */   protected String DPAY3 = "";
/*      */ 
/* 1191 */   protected String DPAY4 = "";
/*      */ 
/* 1209 */   protected String MPAY1 = "";
/*      */ 
/* 1227 */   protected String MPAY2 = "";
/*      */ 
/* 1245 */   protected String MPAY3 = "";
/*      */ 
/* 1263 */   protected String SHPFROM = "";
/*      */ 
/* 1281 */   protected String SHPTO = "";
/*      */ 
/* 1299 */   protected String MERDES1 = "";
/*      */ 
/* 1317 */   protected String MERDES2 = "";
/*      */ 
/* 1335 */   protected String MERDES3 = "";
/*      */ 
/* 1353 */   protected String MERDES4 = "";
/*      */ 
/* 1371 */   protected String REQDOC1 = "";
/*      */ 
/* 1389 */   protected String REQDOC2 = "";
/*      */ 
/* 1407 */   protected String REQDOC3 = "";
/*      */ 
/* 1425 */   protected String REQDOC4 = "";
/*      */ 
/* 1443 */   protected String ADDCON1 = "";
/*      */ 
/* 1461 */   protected String ADDCON2 = "";
/*      */ 
/* 1479 */   protected String ADDCON3 = "";
/*      */ 
/* 1497 */   protected String ADDCON4 = "";
/*      */ 
/* 1515 */   protected String DEBACC = "";
/*      */ 
/* 1533 */   protected double PERTOLM = 0.0D;
/*      */ 
/* 1551 */   protected String ISSDT1 = "";
/*      */ 
/* 1569 */   protected String ISSDT2 = "";
/*      */ 
/* 1587 */   protected String ISSDT3 = "";
/*      */ 
/* 1605 */   protected String LSHDT1 = "";
/*      */ 
/* 1623 */   protected String LSHDT2 = "";
/*      */ 
/* 1641 */   protected String LSHDT3 = "";
/*      */ 
/* 1659 */   protected String EXPDT1 = "";
/*      */ 
/* 1677 */   protected String EXPDT2 = "";
/*      */ 
/* 1695 */   protected String EXPDT3 = "";
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
/*      */   public String getREFLCR()
/*      */   {
/*   45 */     return this.REFLCR.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setREFLCR(String REFLCR)
/*      */   {
/*   52 */     this.REFLCR = REFLCR;
/*      */   }
/*      */ 
/*      */   public String getTREFLCR()
/*      */   {
/*   63 */     return this.TREFLCR.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setTREFLCR(String TREFLCR)
/*      */   {
/*   70 */     this.TREFLCR = TREFLCR;
/*      */   }
/*      */ 
/*      */   public String getPRDLCR()
/*      */   {
/*   81 */     return this.PRDLCR.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setPRDLCR(String PRDLCR)
/*      */   {
/*   88 */     this.PRDLCR = PRDLCR;
/*      */   }
/*      */ 
/*      */   public String getCLSLCR()
/*      */   {
/*   99 */     return this.CLSLCR.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setCLSLCR(String CLSLCR)
/*      */   {
/*  106 */     this.CLSLCR = CLSLCR;
/*      */   }
/*      */ 
/*      */   public String getCNFLCR()
/*      */   {
/*  117 */     return this.CNFLCR.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setCNFLCR(String CNFLCR)
/*      */   {
/*  124 */     this.CNFLCR = CNFLCR;
/*      */   }
/*      */ 
/*      */   public String getAPPLCR1()
/*      */   {
/*  135 */     return this.APPLCR1.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setAPPLCR1(String APPLCR1)
/*      */   {
/*  142 */     this.APPLCR1 = APPLCR1;
/*      */   }
/*      */ 
/*      */   public String getAPPLCR2()
/*      */   {
/*  153 */     return this.APPLCR2.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setAPPLCR2(String APPLCR2)
/*      */   {
/*  160 */     this.APPLCR2 = APPLCR2;
/*      */   }
/*      */ 
/*      */   public String getAPPLCR3()
/*      */   {
/*  171 */     return this.APPLCR3.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setAPPLCR3(String APPLCR3)
/*      */   {
/*  178 */     this.APPLCR3 = APPLCR3;
/*      */   }
/*      */ 
/*      */   public String getAPPLCR4()
/*      */   {
/*  189 */     return this.APPLCR4.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setAPPLCR4(String APPLCR4)
/*      */   {
/*  196 */     this.APPLCR4 = APPLCR4;
/*      */   }
/*      */ 
/*      */   public String getAPPACC()
/*      */   {
/*  207 */     return this.APPACC.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setAPPACC(String APPACC)
/*      */   {
/*  214 */     this.APPACC = APPACC;
/*      */   }
/*      */ 
/*      */   public String getBNFLCR1()
/*      */   {
/*  225 */     return this.BNFLCR1.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setBNFLCR1(String BNFLCR1)
/*      */   {
/*  232 */     this.BNFLCR1 = BNFLCR1;
/*      */   }
/*      */ 
/*      */   public String getBNFLCR2()
/*      */   {
/*  243 */     return this.BNFLCR2.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setBNFLCR2(String BNFLCR2)
/*      */   {
/*  250 */     this.BNFLCR2 = BNFLCR2;
/*      */   }
/*      */ 
/*      */   public String getBNFLCR3()
/*      */   {
/*  261 */     return this.BNFLCR3.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setBNFLCR3(String BNFLCR3)
/*      */   {
/*  268 */     this.BNFLCR3 = BNFLCR3;
/*      */   }
/*      */ 
/*      */   public String getBNFLCR4()
/*      */   {
/*  279 */     return this.BNFLCR4.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setBNFLCR4(String BNFLCR4)
/*      */   {
/*  286 */     this.BNFLCR4 = BNFLCR4;
/*      */   }
/*      */ 
/*      */   public BigDecimal getAMTLCR()
/*      */   {
/*  297 */     return this.AMTLCR;
/*      */   }
/*      */ 
/*      */   public void setAMTLCR(BigDecimal AMTLCR)
/*      */   {
/*  304 */     this.AMTLCR = AMTLCR;
/*      */   }
/*      */ 
/*      */   public String getCCYLCR()
/*      */   {
/*  315 */     return this.CCYLCR.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setCCYLCR(String CCYLCR)
/*      */   {
/*  322 */     this.CCYLCR = CCYLCR;
/*      */   }
/*      */ 
/*      */   public String getMAXLCR()
/*      */   {
/*  333 */     return this.MAXLCR.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setMAXLCR(String MAXLCR)
/*      */   {
/*  340 */     this.MAXLCR = MAXLCR;
/*      */   }
/*      */ 
/*      */   public BigDecimal getABPLCR()
/*      */   {
/*  351 */     return this.ABPLCR;
/*      */   }
/*      */ 
/*      */   public void setABPLCR(BigDecimal ABPLCR)
/*      */   {
/*  358 */     this.ABPLCR = ABPLCR;
/*      */   }
/*      */ 
/*      */   public BigDecimal getABMLCR()
/*      */   {
/*  369 */     return this.ABMLCR;
/*      */   }
/*      */ 
/*      */   public void setABMLCR(BigDecimal ABMLCR)
/*      */   {
/*  376 */     this.ABMLCR = ABMLCR;
/*      */   }
/*      */ 
/*      */   public String getAMTADD1()
/*      */   {
/*  387 */     return this.AMTADD1.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setAMTADD1(String AMTADD1)
/*      */   {
/*  394 */     this.AMTADD1 = AMTADD1;
/*      */   }
/*      */ 
/*      */   public String getAMTADD2()
/*      */   {
/*  405 */     return this.AMTADD2.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setAMTADD2(String AMTADD2)
/*      */   {
/*  412 */     this.AMTADD2 = AMTADD2;
/*      */   }
/*      */ 
/*      */   public String getAMTADD3()
/*      */   {
/*  423 */     return this.AMTADD3.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setAMTADD3(String AMTADD3)
/*      */   {
/*  430 */     this.AMTADD3 = AMTADD3;
/*      */   }
/*      */ 
/*      */   public String getAMTADD4()
/*      */   {
/*  441 */     return this.AMTADD4.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setAMTADD4(String AMTADD4)
/*      */   {
/*  448 */     this.AMTADD4 = AMTADD4;
/*      */   }
/*      */ 
/*      */   public String getEXPPLC()
/*      */   {
/*  459 */     return this.EXPPLC.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setEXPPLC(String EXPPLC)
/*      */   {
/*  466 */     this.EXPPLC = EXPPLC;
/*      */   }
/*      */ 
/*      */   public String getNAVLCR()
/*      */   {
/*  477 */     return this.NAVLCR.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setNAVLCR(String NAVLCR)
/*      */   {
/*  484 */     this.NAVLCR = NAVLCR;
/*      */   }
/*      */ 
/*      */   public String getDFTLCR1()
/*      */   {
/*  495 */     return this.DFTLCR1.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setDFTLCR1(String DFTLCR1)
/*      */   {
/*  502 */     this.DFTLCR1 = DFTLCR1;
/*      */   }
/*      */ 
/*      */   public String getDFTLCR2()
/*      */   {
/*  513 */     return this.DFTLCR2.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setDFTLCR2(String DFTLCR2)
/*      */   {
/*  520 */     this.DFTLCR2 = DFTLCR2;
/*      */   }
/*      */ 
/*      */   public String getDFTLCR3()
/*      */   {
/*  531 */     return this.DFTLCR3.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setDFTLCR3(String DFTLCR3)
/*      */   {
/*  538 */     this.DFTLCR3 = DFTLCR3;
/*      */   }
/*      */ 
/*      */   public String getDRWLCR()
/*      */   {
/*  549 */     return this.DRWLCR.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setDRWLCR(String DRWLCR)
/*      */   {
/*  556 */     this.DRWLCR = DRWLCR;
/*      */   }
/*      */ 
/*      */   public String getSHPTRM()
/*      */   {
/*  567 */     return this.SHPTRM.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setSHPTRM(String SHPTRM)
/*      */   {
/*  574 */     this.SHPTRM = SHPTRM;
/*      */   }
/*      */ 
/*      */   public String getPSHLCR()
/*      */   {
/*  585 */     return this.PSHLCR.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setPSHLCR(String PSHLCR)
/*      */   {
/*  592 */     this.PSHLCR = PSHLCR;
/*      */   }
/*      */ 
/*      */   public String getTSHLCR()
/*      */   {
/*  603 */     return this.TSHLCR.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setTSHLCR(String TSHLCR)
/*      */   {
/*  610 */     this.TSHLCR = TSHLCR;
/*      */   }
/*      */ 
/*      */   public String getOTHCHG1()
/*      */   {
/*  621 */     return this.OTHCHG1.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setOTHCHG1(String OTHCHG1)
/*      */   {
/*  628 */     this.OTHCHG1 = OTHCHG1;
/*      */   }
/*      */ 
/*      */   public String getOTHCHG2()
/*      */   {
/*  639 */     return this.OTHCHG2.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setOTHCHG2(String OTHCHG2)
/*      */   {
/*  646 */     this.OTHCHG2 = OTHCHG2;
/*      */   }
/*      */ 
/*      */   public String getOTHCHG3()
/*      */   {
/*  657 */     return this.OTHCHG3.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setOTHCHG3(String OTHCHG3)
/*      */   {
/*  664 */     this.OTHCHG3 = OTHCHG3;
/*      */   }
/*      */ 
/*      */   public String getOTHCHG4()
/*      */   {
/*  675 */     return this.OTHCHG4.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setOTHCHG4(String OTHCHG4)
/*      */   {
/*  682 */     this.OTHCHG4 = OTHCHG4;
/*      */   }
/*      */ 
/*      */   public String getADVBNK1()
/*      */   {
/*  693 */     return this.ADVBNK1.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setADVBNK1(String ADVBNK1)
/*      */   {
/*  700 */     this.ADVBNK1 = ADVBNK1;
/*      */   }
/*      */ 
/*      */   public String getADVBNK2()
/*      */   {
/*  711 */     return this.ADVBNK2.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setADVBNK2(String ADVBNK2)
/*      */   {
/*  718 */     this.ADVBNK2 = ADVBNK2;
/*      */   }
/*      */ 
/*      */   public String getADVBNK3()
/*      */   {
/*  729 */     return this.ADVBNK3.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setADVBNK3(String ADVBNK3)
/*      */   {
/*  736 */     this.ADVBNK3 = ADVBNK3;
/*      */   }
/*      */ 
/*      */   public String getADVBNK4()
/*      */   {
/*  747 */     return this.ADVBNK4.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setADVBNK4(String ADVBNK4)
/*      */   {
/*  754 */     this.ADVBNK4 = ADVBNK4;
/*      */   }
/*      */ 
/*      */   public String getPERPRE1()
/*      */   {
/*  765 */     return this.PERPRE1.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setPERPRE1(String PERPRE1)
/*      */   {
/*  772 */     this.PERPRE1 = PERPRE1;
/*      */   }
/*      */ 
/*      */   public String getPERPRE2()
/*      */   {
/*  783 */     return this.PERPRE2.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setPERPRE2(String PERPRE2)
/*      */   {
/*  790 */     this.PERPRE2 = PERPRE2;
/*      */   }
/*      */ 
/*      */   public String getPERPRE3()
/*      */   {
/*  801 */     return this.PERPRE3.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setPERPRE3(String PERPRE3)
/*      */   {
/*  808 */     this.PERPRE3 = PERPRE3;
/*      */   }
/*      */ 
/*      */   public String getPERPRE4()
/*      */   {
/*  819 */     return this.PERPRE4.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setPERPRE4(String PERPRE4)
/*      */   {
/*  826 */     this.PERPRE4 = PERPRE4;
/*      */   }
/*      */ 
/*      */   public String getLANG()
/*      */   {
/*  837 */     return this.LANG.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setLANG(String LANG)
/*      */   {
/*  844 */     this.LANG = LANG;
/*      */   }
/*      */ 
/*      */   public Timestamp getDTTM()
/*      */   {
/*  855 */     return this.DTTM;
/*      */   }
/*      */ 
/*      */   public void setDTTM(Timestamp DTTM)
/*      */   {
/*  862 */     this.DTTM = DTTM;
/*      */   }
/*      */ 
/*      */   public String getSTS()
/*      */   {
/*  873 */     return this.STS.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setSTS(String STS)
/*      */   {
/*  880 */     this.STS = STS;
/*      */   }
/*      */ 
/*      */   public String getDCIBS_REF()
/*      */   {
/*  891 */     return this.DCIBS_REF.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setDCIBS_REF(String DCIBS_REF)
/*      */   {
/*  898 */     this.DCIBS_REF = DCIBS_REF;
/*      */   }
/*      */ 
/*      */   public String getODATE()
/*      */   {
/*  909 */     return this.ODATE.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setODATE(String ODATE)
/*      */   {
/*  916 */     this.ODATE = ODATE;
/*      */   }
/*      */ 
/*      */   public String getVDATE()
/*      */   {
/*  927 */     return this.VDATE.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setVDATE(String VDATE)
/*      */   {
/*  934 */     this.VDATE = VDATE;
/*      */   }
/*      */ 
/*      */   public String getADATE()
/*      */   {
/*  945 */     return this.ADATE.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setADATE(String ADATE)
/*      */   {
/*  952 */     this.ADATE = ADATE;
/*      */   }
/*      */ 
/*      */   public String getOUSER()
/*      */   {
/*  963 */     return this.OUSER.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setOUSER(String OUSER)
/*      */   {
/*  970 */     this.OUSER = OUSER;
/*      */   }
/*      */ 
/*      */   public String getVUSER()
/*      */   {
/*  981 */     return this.VUSER.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setVUSER(String VUSER)
/*      */   {
/*  988 */     this.VUSER = VUSER;
/*      */   }
/*      */ 
/*      */   public String getAUSER()
/*      */   {
/*  999 */     return this.AUSER.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setAUSER(String AUSER)
/*      */   {
/* 1006 */     this.AUSER = AUSER;
/*      */   }
/*      */ 
/*      */   public int getNUMAPR()
/*      */   {
/* 1017 */     return this.NUMAPR;
/*      */   }
/*      */ 
/*      */   public void setNUMAPR(int NUMAPR)
/*      */   {
/* 1024 */     this.NUMAPR = NUMAPR;
/*      */   }
/*      */ 
/*      */   public String getLCR_REF()
/*      */   {
/* 1035 */     return this.LCR_REF.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setLCR_REF(String LCR_REF)
/*      */   {
/* 1042 */     this.LCR_REF = LCR_REF;
/*      */   }
/*      */ 
/*      */   public double getPERTOLP()
/*      */   {
/* 1053 */     return this.PERTOLP;
/*      */   }
/*      */ 
/*      */   public void setPERTOLP(double PERTOLP)
/*      */   {
/* 1060 */     this.PERTOLP = PERTOLP;
/*      */   }
/*      */ 
/*      */   public String getDRAF1()
/*      */   {
/* 1071 */     return this.DRAF1.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setDRAF1(String DRAF1)
/*      */   {
/* 1078 */     this.DRAF1 = DRAF1;
/*      */   }
/*      */ 
/*      */   public String getDRAF2()
/*      */   {
/* 1089 */     return this.DRAF2.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setDRAF2(String DRAF2)
/*      */   {
/* 1096 */     this.DRAF2 = DRAF2;
/*      */   }
/*      */ 
/*      */   public String getDRAF3()
/*      */   {
/* 1107 */     return this.DRAF3.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setDRAF3(String DRAF3)
/*      */   {
/* 1114 */     this.DRAF3 = DRAF3;
/*      */   }
/*      */ 
/*      */   public String getDRAWEE()
/*      */   {
/* 1125 */     return this.DRAWEE.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setDRAWEE(String DRAWEE)
/*      */   {
/* 1132 */     this.DRAWEE = DRAWEE;
/*      */   }
/*      */ 
/*      */   public String getDPAY1()
/*      */   {
/* 1143 */     return this.DPAY1.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setDPAY1(String DPAY1)
/*      */   {
/* 1150 */     this.DPAY1 = DPAY1;
/*      */   }
/*      */ 
/*      */   public String getDPAY2()
/*      */   {
/* 1161 */     return this.DPAY2.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setDPAY2(String DPAY2)
/*      */   {
/* 1168 */     this.DPAY2 = DPAY2;
/*      */   }
/*      */ 
/*      */   public String getDPAY3()
/*      */   {
/* 1179 */     return this.DPAY3.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setDPAY3(String DPAY3)
/*      */   {
/* 1186 */     this.DPAY3 = DPAY3;
/*      */   }
/*      */ 
/*      */   public String getDPAY4()
/*      */   {
/* 1197 */     return this.DPAY4.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setDPAY4(String DPAY4)
/*      */   {
/* 1204 */     this.DPAY4 = DPAY4;
/*      */   }
/*      */ 
/*      */   public String getMPAY1()
/*      */   {
/* 1215 */     return this.MPAY1.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setMPAY1(String MPAY1)
/*      */   {
/* 1222 */     this.MPAY1 = MPAY1;
/*      */   }
/*      */ 
/*      */   public String getMPAY2()
/*      */   {
/* 1233 */     return this.MPAY2.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setMPAY2(String MPAY2)
/*      */   {
/* 1240 */     this.MPAY2 = MPAY2;
/*      */   }
/*      */ 
/*      */   public String getMPAY3()
/*      */   {
/* 1251 */     return this.MPAY3.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setMPAY3(String MPAY3)
/*      */   {
/* 1258 */     this.MPAY3 = MPAY3;
/*      */   }
/*      */ 
/*      */   public String getSHPFROM()
/*      */   {
/* 1269 */     return this.SHPFROM.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setSHPFROM(String SHPFROM)
/*      */   {
/* 1276 */     this.SHPFROM = SHPFROM;
/*      */   }
/*      */ 
/*      */   public String getSHPTO()
/*      */   {
/* 1287 */     return this.SHPTO.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setSHPTO(String SHPTO)
/*      */   {
/* 1294 */     this.SHPTO = SHPTO;
/*      */   }
/*      */ 
/*      */   public String getMERDES1()
/*      */   {
/* 1305 */     return this.MERDES1.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setMERDES1(String MERDES1)
/*      */   {
/* 1312 */     this.MERDES1 = MERDES1;
/*      */   }
/*      */ 
/*      */   public String getMERDES2()
/*      */   {
/* 1323 */     return this.MERDES2.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setMERDES2(String MERDES2)
/*      */   {
/* 1330 */     this.MERDES2 = MERDES2;
/*      */   }
/*      */ 
/*      */   public String getMERDES3()
/*      */   {
/* 1341 */     return this.MERDES3.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setMERDES3(String MERDES3)
/*      */   {
/* 1348 */     this.MERDES3 = MERDES3;
/*      */   }
/*      */ 
/*      */   public String getMERDES4()
/*      */   {
/* 1359 */     return this.MERDES4.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setMERDES4(String MERDES4)
/*      */   {
/* 1366 */     this.MERDES4 = MERDES4;
/*      */   }
/*      */ 
/*      */   public String getREQDOC1()
/*      */   {
/* 1377 */     return this.REQDOC1.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setREQDOC1(String REQDOC1)
/*      */   {
/* 1384 */     this.REQDOC1 = REQDOC1;
/*      */   }
/*      */ 
/*      */   public String getREQDOC2()
/*      */   {
/* 1395 */     return this.REQDOC2.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setREQDOC2(String REQDOC2)
/*      */   {
/* 1402 */     this.REQDOC2 = REQDOC2;
/*      */   }
/*      */ 
/*      */   public String getREQDOC3()
/*      */   {
/* 1413 */     return this.REQDOC3.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setREQDOC3(String REQDOC3)
/*      */   {
/* 1420 */     this.REQDOC3 = REQDOC3;
/*      */   }
/*      */ 
/*      */   public String getREQDOC4()
/*      */   {
/* 1431 */     return this.REQDOC4.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setREQDOC4(String REQDOC4)
/*      */   {
/* 1438 */     this.REQDOC4 = REQDOC4;
/*      */   }
/*      */ 
/*      */   public String getADDCON1()
/*      */   {
/* 1449 */     return this.ADDCON1.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setADDCON1(String ADDCON1)
/*      */   {
/* 1456 */     this.ADDCON1 = ADDCON1;
/*      */   }
/*      */ 
/*      */   public String getADDCON2()
/*      */   {
/* 1467 */     return this.ADDCON2.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setADDCON2(String ADDCON2)
/*      */   {
/* 1474 */     this.ADDCON2 = ADDCON2;
/*      */   }
/*      */ 
/*      */   public String getADDCON3()
/*      */   {
/* 1485 */     return this.ADDCON3.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setADDCON3(String ADDCON3)
/*      */   {
/* 1492 */     this.ADDCON3 = ADDCON3;
/*      */   }
/*      */ 
/*      */   public String getADDCON4()
/*      */   {
/* 1503 */     return this.ADDCON4.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setADDCON4(String ADDCON4)
/*      */   {
/* 1510 */     this.ADDCON4 = ADDCON4;
/*      */   }
/*      */ 
/*      */   public String getDEBACC()
/*      */   {
/* 1521 */     return this.DEBACC.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setDEBACC(String DEBACC)
/*      */   {
/* 1528 */     this.DEBACC = DEBACC;
/*      */   }
/*      */ 
/*      */   public double getPERTOLM()
/*      */   {
/* 1539 */     return this.PERTOLM;
/*      */   }
/*      */ 
/*      */   public void setPERTOLM(double PERTOLM)
/*      */   {
/* 1546 */     this.PERTOLM = PERTOLM;
/*      */   }
/*      */ 
/*      */   public String getISSDT1()
/*      */   {
/* 1557 */     return this.ISSDT1.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setISSDT1(String ISSDT1)
/*      */   {
/* 1564 */     this.ISSDT1 = ISSDT1;
/*      */   }
/*      */ 
/*      */   public String getISSDT2()
/*      */   {
/* 1575 */     return this.ISSDT2.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setISSDT2(String ISSDT2)
/*      */   {
/* 1582 */     this.ISSDT2 = ISSDT2;
/*      */   }
/*      */ 
/*      */   public String getISSDT3()
/*      */   {
/* 1593 */     return this.ISSDT3.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setISSDT3(String ISSDT3)
/*      */   {
/* 1600 */     this.ISSDT3 = ISSDT3;
/*      */   }
/*      */ 
/*      */   public String getLSHDT1()
/*      */   {
/* 1611 */     return this.LSHDT1.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setLSHDT1(String LSHDT1)
/*      */   {
/* 1618 */     this.LSHDT1 = LSHDT1;
/*      */   }
/*      */ 
/*      */   public String getLSHDT2()
/*      */   {
/* 1629 */     return this.LSHDT2.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setLSHDT2(String LSHDT2)
/*      */   {
/* 1636 */     this.LSHDT2 = LSHDT2;
/*      */   }
/*      */ 
/*      */   public String getLSHDT3()
/*      */   {
/* 1647 */     return this.LSHDT3.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setLSHDT3(String LSHDT3)
/*      */   {
/* 1654 */     this.LSHDT3 = LSHDT3;
/*      */   }
/*      */ 
/*      */   public String getEXPDT1()
/*      */   {
/* 1665 */     return this.EXPDT1.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setEXPDT1(String EXPDT1)
/*      */   {
/* 1672 */     this.EXPDT1 = EXPDT1;
/*      */   }
/*      */ 
/*      */   public String getEXPDT2()
/*      */   {
/* 1683 */     return this.EXPDT2.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setEXPDT2(String EXPDT2)
/*      */   {
/* 1690 */     this.EXPDT2 = EXPDT2;
/*      */   }
/*      */ 
/*      */   public String getEXPDT3()
/*      */   {
/* 1701 */     return this.EXPDT3.toUpperCase().trim();
/*      */   }
/*      */ 
/*      */   public void setEXPDT3(String EXPDT3)
/*      */   {
/* 1708 */     this.EXPDT3 = EXPDT3;
/*      */   }
/*      */   public String toString() {
/* 1711 */     StringBuffer results = new StringBuffer();
/*      */ 
/* 1713 */     results.append(getClass().getName() + "\n");
/* 1714 */     results.append("\tENTITYID=" + this.ENTITYID + "\n");
/* 1715 */     results.append("\tREFLCR=" + this.REFLCR + "\n");
/* 1716 */     results.append("\tTREFLCR=" + this.TREFLCR + "\n");
/* 1717 */     results.append("\tPRDLCR=" + this.PRDLCR + "\n");
/* 1718 */     results.append("\tCLSLCR=" + this.CLSLCR + "\n");
/* 1719 */     results.append("\tCNFLCR=" + this.CNFLCR + "\n");
/* 1720 */     results.append("\tAPPLCR1=" + this.APPLCR1 + "\n");
/* 1721 */     results.append("\tAPPLCR2=" + this.APPLCR2 + "\n");
/* 1722 */     results.append("\tAPPLCR3=" + this.APPLCR3 + "\n");
/* 1723 */     results.append("\tAPPLCR4=" + this.APPLCR4 + "\n");
/* 1724 */     results.append("\tAPPACC=" + this.APPACC + "\n");
/* 1725 */     results.append("\tBNFLCR1=" + this.BNFLCR1 + "\n");
/* 1726 */     results.append("\tBNFLCR2=" + this.BNFLCR2 + "\n");
/* 1727 */     results.append("\tBNFLCR3=" + this.BNFLCR3 + "\n");
/* 1728 */     results.append("\tBNFLCR4=" + this.BNFLCR4 + "\n");
/* 1729 */     results.append("\tAMTLCR=" + this.AMTLCR + "\n");
/* 1730 */     results.append("\tCCYLCR=" + this.CCYLCR + "\n");
/* 1731 */     results.append("\tMAXLCR=" + this.MAXLCR + "\n");
/* 1732 */     results.append("\tABPLCR=" + this.ABPLCR + "\n");
/* 1733 */     results.append("\tABMLCR=" + this.ABMLCR + "\n");
/* 1734 */     results.append("\tAMTADD1=" + this.AMTADD1 + "\n");
/* 1735 */     results.append("\tAMTADD2=" + this.AMTADD2 + "\n");
/* 1736 */     results.append("\tAMTADD3=" + this.AMTADD3 + "\n");
/* 1737 */     results.append("\tAMTADD4=" + this.AMTADD4 + "\n");
/* 1738 */     results.append("\tEXPPLC=" + this.EXPPLC + "\n");
/* 1739 */     results.append("\tNAVLCR=" + this.NAVLCR + "\n");
/* 1740 */     results.append("\tDFTLCR1=" + this.DFTLCR1 + "\n");
/* 1741 */     results.append("\tDFTLCR2=" + this.DFTLCR2 + "\n");
/* 1742 */     results.append("\tDFTLCR3=" + this.DFTLCR3 + "\n");
/* 1743 */     results.append("\tDRWLCR=" + this.DRWLCR + "\n");
/* 1744 */     results.append("\tSHPTRM=" + this.SHPTRM + "\n");
/* 1745 */     results.append("\tPSHLCR=" + this.PSHLCR + "\n");
/* 1746 */     results.append("\tTSHLCR=" + this.TSHLCR + "\n");
/* 1747 */     results.append("\tOTHCHG1=" + this.OTHCHG1 + "\n");
/* 1748 */     results.append("\tOTHCHG2=" + this.OTHCHG2 + "\n");
/* 1749 */     results.append("\tOTHCHG3=" + this.OTHCHG3 + "\n");
/* 1750 */     results.append("\tOTHCHG4=" + this.OTHCHG4 + "\n");
/* 1751 */     results.append("\tADVBNK1=" + this.ADVBNK1 + "\n");
/* 1752 */     results.append("\tADVBNK2=" + this.ADVBNK2 + "\n");
/* 1753 */     results.append("\tADVBNK3=" + this.ADVBNK3 + "\n");
/* 1754 */     results.append("\tADVBNK4=" + this.ADVBNK4 + "\n");
/* 1755 */     results.append("\tPERPRE1=" + this.PERPRE1 + "\n");
/* 1756 */     results.append("\tPERPRE2=" + this.PERPRE2 + "\n");
/* 1757 */     results.append("\tPERPRE3=" + this.PERPRE3 + "\n");
/* 1758 */     results.append("\tPERPRE4=" + this.PERPRE4 + "\n");
/* 1759 */     results.append("\tLANG=" + this.LANG + "\n");
/* 1760 */     results.append("\tDTTM=" + this.DTTM + "\n");
/* 1761 */     results.append("\tSTS=" + this.STS + "\n");
/* 1762 */     results.append("\tDCIBS_REF=" + this.DCIBS_REF + "\n");
/* 1763 */     results.append("\tODATE=" + this.ODATE + "\n");
/* 1764 */     results.append("\tVDATE=" + this.VDATE + "\n");
/* 1765 */     results.append("\tADATE=" + this.ADATE + "\n");
/* 1766 */     results.append("\tOUSER=" + this.OUSER + "\n");
/* 1767 */     results.append("\tVUSER=" + this.VUSER + "\n");
/* 1768 */     results.append("\tAUSER=" + this.AUSER + "\n");
/* 1769 */     results.append("\tNUMAPR=" + this.NUMAPR + "\n");
/* 1770 */     results.append("\tLCR_REF=" + this.LCR_REF + "\n");
/* 1771 */     results.append("\tPERTOLP=" + this.PERTOLP + "\n");
/* 1772 */     results.append("\tDRAF1=" + this.DRAF1 + "\n");
/* 1773 */     results.append("\tDRAF2=" + this.DRAF2 + "\n");
/* 1774 */     results.append("\tDRAF3=" + this.DRAF3 + "\n");
/* 1775 */     results.append("\tDRAWEE=" + this.DRAWEE + "\n");
/* 1776 */     results.append("\tDPAY1=" + this.DPAY1 + "\n");
/* 1777 */     results.append("\tDPAY2=" + this.DPAY2 + "\n");
/* 1778 */     results.append("\tDPAY3=" + this.DPAY3 + "\n");
/* 1779 */     results.append("\tDPAY4=" + this.DPAY4 + "\n");
/* 1780 */     results.append("\tMPAY1=" + this.MPAY1 + "\n");
/* 1781 */     results.append("\tMPAY2=" + this.MPAY2 + "\n");
/* 1782 */     results.append("\tMPAY3=" + this.MPAY3 + "\n");
/* 1783 */     results.append("\tSHPFROM=" + this.SHPFROM + "\n");
/* 1784 */     results.append("\tSHPTO=" + this.SHPTO + "\n");
/* 1785 */     results.append("\tMERDES1=" + this.MERDES1 + "\n");
/* 1786 */     results.append("\tMERDES2=" + this.MERDES2 + "\n");
/* 1787 */     results.append("\tMERDES3=" + this.MERDES3 + "\n");
/* 1788 */     results.append("\tMERDES4=" + this.MERDES4 + "\n");
/* 1789 */     results.append("\tREQDOC1=" + this.REQDOC1 + "\n");
/* 1790 */     results.append("\tREQDOC2=" + this.REQDOC2 + "\n");
/* 1791 */     results.append("\tREQDOC3=" + this.REQDOC3 + "\n");
/* 1792 */     results.append("\tREQDOC4=" + this.REQDOC4 + "\n");
/* 1793 */     results.append("\tADDCON1=" + this.ADDCON1 + "\n");
/* 1794 */     results.append("\tADDCON2=" + this.ADDCON2 + "\n");
/* 1795 */     results.append("\tADDCON3=" + this.ADDCON3 + "\n");
/* 1796 */     results.append("\tADDCON4=" + this.ADDCON4 + "\n");
/* 1797 */     results.append("\tDEBACC=" + this.DEBACC + "\n");
/* 1798 */     results.append("\tPERTOLM=" + this.PERTOLM + "\n");
/* 1799 */     results.append("\tISSDT1=" + this.ISSDT1 + "\n");
/* 1800 */     results.append("\tISSDT2=" + this.ISSDT2 + "\n");
/* 1801 */     results.append("\tISSDT3=" + this.ISSDT3 + "\n");
/* 1802 */     results.append("\tLSHDT1=" + this.LSHDT1 + "\n");
/* 1803 */     results.append("\tLSHDT2=" + this.LSHDT2 + "\n");
/* 1804 */     results.append("\tLSHDT3=" + this.LSHDT3 + "\n");
/* 1805 */     results.append("\tEXPDT1=" + this.EXPDT1 + "\n");
/* 1806 */     results.append("\tEXPDT2=" + this.EXPDT2 + "\n");
/* 1807 */     results.append("\tEXPDT3=" + this.EXPDT3 + "\n");
/*      */ 
/* 1809 */     return results.toString();
/*      */   }
/*      */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.databeans.DC_LETCRD
 * JD-Core Version:    0.6.0
 */