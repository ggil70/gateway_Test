/*     */ package com.activo.gateway.dibs.databeans;
/*     */ 
/*     */ import java.io.Serializable;
import java.math.BigDecimal;
/*     */ 
/*     */ public class DC_TRANSFER
/*     */   implements Serializable
/*     */ {
/*  21 */   protected String ENTITYID = "";
/*     */ 
/*  39 */   protected String TYPE = "";
/*     */ 
/*  57 */   protected String SUBTYPE = "";
/*     */ 
/*  75 */   protected BigDecimal AMOUNT = new BigDecimal("0");
/*     */ 
/*  93 */   protected String CCY = "";
/*     */ 
/* 111 */   protected String DEBITACC = "";
/*     */ 
/* 129 */   protected String CREDITACC = "";
/*     */ 
/* 147 */   protected String BENE_NAME = "";
/*     */ 
/* 165 */   protected String BENE_ADD1 = "";
/*     */ 
/* 183 */   protected String BENE_ADD2 = "";
/*     */ 
/* 201 */   protected String BENE_BANK_ID = "";
/*     */ 
/* 219 */   protected String BENE_BANK_NAME = "";
/*     */ 
/* 237 */   protected String BENE_BANK_ADD1 = "";
/*     */ 
/* 255 */   protected String BENE_BANK_ADD2 = "";
/*     */ 
/* 273 */   protected String INT_BANK_NAME = "";
/*     */ 
/* 291 */   protected String INT_BANK_ADD1 = "";
/*     */ 
/* 309 */   protected String INT_BANK_ADD2 = "";
/*     */ 
/* 327 */   protected String BENE_MEMO1 = "";
/*     */ 
/* 345 */   protected String STS = "";
/*     */ 
/* 363 */   protected String INT_BANK_CHARGE = "";
/*     */ 
/* 381 */   protected String DCIBS_REF = "";
/*     */ 
/* 399 */   protected String BENE_BANK_ADD3 = "";
/*     */ 
/* 417 */   protected String BENE_MEMO2 = "";
/*     */ 
/* 435 */   protected String BENE_MEMO3 = "";
/*     */ 
/* 453 */   protected String BNKA3TRF = "";
/*     */ 
/* 471 */   protected String INT_BANK_ADD3 = "";
/*     */ 
/* 489 */   protected String INT_BANK_ID = "";
/*     */ 
/* 507 */   protected String ODATE = "";
/*     */ 
/* 525 */   protected String VDATE = "";
/*     */ 
/* 543 */   protected String ADATE = "";
/*     */ 
/* 561 */   protected String OUSER = "";
/*     */ 
/* 579 */   protected String VUSER = "";
/*     */ 
/* 597 */   protected String AUSER = "";
/*     */ 
/* 615 */   protected int NUMAPR = 0;
/*     */ 
/* 633 */   protected String VALUE_DATE_DD = "";
/*     */ 
/* 651 */   protected String VALUE_DATE_MM = "";
/*     */ 
/* 669 */   protected String VALUE_DATE_YY = "";
/*     */ 
/* 687 */   protected String ACT = "";
/*     */ 
/* 705 */   protected String TMP = "";
/*     */ 
/*     */   public String getENTITYID()
/*     */   {
/*  27 */     return this.ENTITYID.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setENTITYID(String ENTITYID)
/*     */   {
/*  34 */     this.ENTITYID = ENTITYID;
/*     */   }
/*     */ 
/*     */   public String getTYPE()
/*     */   {
/*  45 */     return this.TYPE.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setTYPE(String TYPE)
/*     */   {
/*  52 */     this.TYPE = TYPE;
/*     */   }
/*     */ 
/*     */   public String getSUBTYPE()
/*     */   {
/*  63 */     return this.SUBTYPE.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setSUBTYPE(String SUBTYPE)
/*     */   {
/*  70 */     this.SUBTYPE = SUBTYPE;
/*     */   }
/*     */ 
/*     */   public BigDecimal getAMOUNT()
/*     */   {
/*  81 */     return this.AMOUNT;
/*     */   }
/*     */ 
/*     */   public void setAMOUNT(BigDecimal AMOUNT)
/*     */   {
/*  88 */     this.AMOUNT = AMOUNT;
/*     */   }
/*     */ 
/*     */   public String getCCY()
/*     */   {
/*  99 */     return this.CCY.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setCCY(String CCY)
/*     */   {
/* 106 */     this.CCY = CCY;
/*     */   }
/*     */ 
/*     */   public String getDEBITACC()
/*     */   {
/* 117 */     return this.DEBITACC.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setDEBITACC(String DEBITACC)
/*     */   {
/* 124 */     this.DEBITACC = DEBITACC;
/*     */   }
/*     */ 
/*     */   public String getCREDITACC()
/*     */   {
/* 135 */     return this.CREDITACC.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setCREDITACC(String CREDITACC)
/*     */   {
/* 142 */     this.CREDITACC = CREDITACC;
/*     */   }
/*     */ 
/*     */   public String getBENE_NAME()
/*     */   {
/* 153 */     return this.BENE_NAME.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setBENE_NAME(String BENE_NAME)
/*     */   {
/* 160 */     this.BENE_NAME = BENE_NAME;
/*     */   }
/*     */ 
/*     */   public String getBENE_ADD1()
/*     */   {
/* 171 */     return this.BENE_ADD1.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setBENE_ADD1(String BENE_ADD1)
/*     */   {
/* 178 */     this.BENE_ADD1 = BENE_ADD1;
/*     */   }
/*     */ 
/*     */   public String getBENE_ADD2()
/*     */   {
/* 189 */     return this.BENE_ADD2.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setBENE_ADD2(String BENE_ADD2)
/*     */   {
/* 196 */     this.BENE_ADD2 = BENE_ADD2;
/*     */   }
/*     */ 
/*     */   public String getBENE_BANK_ID()
/*     */   {
/* 207 */     return this.BENE_BANK_ID.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setBENE_BANK_ID(String BENE_BANK_ID)
/*     */   {
/* 214 */     this.BENE_BANK_ID = BENE_BANK_ID;
/*     */   }
/*     */ 
/*     */   public String getBENE_BANK_NAME()
/*     */   {
/* 225 */     return this.BENE_BANK_NAME.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setBENE_BANK_NAME(String BENE_BANK_NAME)
/*     */   {
/* 232 */     this.BENE_BANK_NAME = BENE_BANK_NAME;
/*     */   }
/*     */ 
/*     */   public String getBENE_BANK_ADD1()
/*     */   {
/* 243 */     return this.BENE_BANK_ADD1.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setBENE_BANK_ADD1(String BENE_BANK_ADD1)
/*     */   {
/* 250 */     this.BENE_BANK_ADD1 = BENE_BANK_ADD1;
/*     */   }
/*     */ 
/*     */   public String getBENE_BANK_ADD2()
/*     */   {
/* 261 */     return this.BENE_BANK_ADD2.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setBENE_BANK_ADD2(String BENE_BANK_ADD2)
/*     */   {
/* 268 */     this.BENE_BANK_ADD2 = BENE_BANK_ADD2;
/*     */   }
/*     */ 
/*     */   public String getINT_BANK_NAME()
/*     */   {
/* 279 */     return this.INT_BANK_NAME.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setINT_BANK_NAME(String INT_BANK_NAME)
/*     */   {
/* 286 */     this.INT_BANK_NAME = INT_BANK_NAME;
/*     */   }
/*     */ 
/*     */   public String getINT_BANK_ADD1()
/*     */   {
/* 297 */     return this.INT_BANK_ADD1.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setINT_BANK_ADD1(String INT_BANK_ADD1)
/*     */   {
/* 304 */     this.INT_BANK_ADD1 = INT_BANK_ADD1;
/*     */   }
/*     */ 
/*     */   public String getINT_BANK_ADD2()
/*     */   {
/* 315 */     return this.INT_BANK_ADD2.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setINT_BANK_ADD2(String INT_BANK_ADD2)
/*     */   {
/* 322 */     this.INT_BANK_ADD2 = INT_BANK_ADD2;
/*     */   }
/*     */ 
/*     */   public String getBENE_MEMO1()
/*     */   {
/* 333 */     return this.BENE_MEMO1.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setBENE_MEMO1(String BENE_MEMO1)
/*     */   {
/* 340 */     this.BENE_MEMO1 = BENE_MEMO1;
/*     */   }
/*     */ 
/*     */   public String getSTS()
/*     */   {
/* 351 */     return this.STS.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setSTS(String STS)
/*     */   {
/* 358 */     this.STS = STS;
/*     */   }
/*     */ 
/*     */   public String getINT_BANK_CHARGE()
/*     */   {
/* 369 */     return this.INT_BANK_CHARGE.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setINT_BANK_CHARGE(String INT_BANK_CHARGE)
/*     */   {
/* 376 */     this.INT_BANK_CHARGE = INT_BANK_CHARGE;
/*     */   }
/*     */ 
/*     */   public String getDCIBS_REF()
/*     */   {
/* 387 */     return this.DCIBS_REF.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setDCIBS_REF(String DCIBS_REF)
/*     */   {
/* 394 */     this.DCIBS_REF = DCIBS_REF;
/*     */   }
/*     */ 
/*     */   public String getBENE_BANK_ADD3()
/*     */   {
/* 405 */     return this.BENE_BANK_ADD3.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setBENE_BANK_ADD3(String BENE_BANK_ADD3)
/*     */   {
/* 412 */     this.BENE_BANK_ADD3 = BENE_BANK_ADD3;
/*     */   }
/*     */ 
/*     */   public String getBENE_MEMO2()
/*     */   {
/* 423 */     return this.BENE_MEMO2.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setBENE_MEMO2(String BENE_MEMO2)
/*     */   {
/* 430 */     this.BENE_MEMO2 = BENE_MEMO2;
/*     */   }
/*     */ 
/*     */   public String getBENE_MEMO3()
/*     */   {
/* 441 */     return this.BENE_MEMO3.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setBENE_MEMO3(String BENE_MEMO3)
/*     */   {
/* 448 */     this.BENE_MEMO3 = BENE_MEMO3;
/*     */   }
/*     */ 
/*     */   public String getBNKA3TRF()
/*     */   {
/* 459 */     return this.BNKA3TRF.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setBNKA3TRF(String BNKA3TRF)
/*     */   {
/* 466 */     this.BNKA3TRF = BNKA3TRF;
/*     */   }
/*     */ 
/*     */   public String getINT_BANK_ADD3()
/*     */   {
/* 477 */     return this.INT_BANK_ADD3.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setINT_BANK_ADD3(String INT_BANK_ADD3)
/*     */   {
/* 484 */     this.INT_BANK_ADD3 = INT_BANK_ADD3;
/*     */   }
/*     */ 
/*     */   public String getINT_BANK_ID()
/*     */   {
/* 495 */     return this.INT_BANK_ID.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setINT_BANK_ID(String INT_BANK_ID)
/*     */   {
/* 502 */     this.INT_BANK_ID = INT_BANK_ID;
/*     */   }
/*     */ 
/*     */   public String getODATE()
/*     */   {
/* 513 */     return this.ODATE.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setODATE(String ODATE)
/*     */   {
/* 520 */     this.ODATE = ODATE;
/*     */   }
/*     */ 
/*     */   public String getVDATE()
/*     */   {
/* 531 */     return this.VDATE.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setVDATE(String VDATE)
/*     */   {
/* 538 */     this.VDATE = VDATE;
/*     */   }
/*     */ 
/*     */   public String getADATE()
/*     */   {
/* 549 */     return this.ADATE.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setADATE(String ADATE)
/*     */   {
/* 556 */     this.ADATE = ADATE;
/*     */   }
/*     */ 
/*     */   public String getOUSER()
/*     */   {
/* 567 */     return this.OUSER.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setOUSER(String OUSER)
/*     */   {
/* 574 */     this.OUSER = OUSER;
/*     */   }
/*     */ 
/*     */   public String getVUSER()
/*     */   {
/* 585 */     return this.VUSER.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setVUSER(String VUSER)
/*     */   {
/* 592 */     this.VUSER = VUSER;
/*     */   }
/*     */ 
/*     */   public String getAUSER()
/*     */   {
/* 603 */     return this.AUSER.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setAUSER(String AUSER)
/*     */   {
/* 610 */     this.AUSER = AUSER;
/*     */   }
/*     */ 
/*     */   public int getNUMAPR()
/*     */   {
/* 621 */     return this.NUMAPR;
/*     */   }
/*     */ 
/*     */   public void setNUMAPR(int NUMAPR)
/*     */   {
/* 628 */     this.NUMAPR = NUMAPR;
/*     */   }
/*     */ 
/*     */   public String getVALUE_DATE_DD()
/*     */   {
/* 639 */     return this.VALUE_DATE_DD.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setVALUE_DATE_DD(String VALUE_DATE_DD)
/*     */   {
/* 646 */     this.VALUE_DATE_DD = VALUE_DATE_DD;
/*     */   }
/*     */ 
/*     */   public String getVALUE_DATE_MM()
/*     */   {
/* 657 */     return this.VALUE_DATE_MM.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setVALUE_DATE_MM(String VALUE_DATE_MM)
/*     */   {
/* 664 */     this.VALUE_DATE_MM = VALUE_DATE_MM;
/*     */   }
/*     */ 
/*     */   public String getVALUE_DATE_YY()
/*     */   {
/* 675 */     return this.VALUE_DATE_YY.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setVALUE_DATE_YY(String VALUE_DATE_YY)
/*     */   {
/* 682 */     this.VALUE_DATE_YY = VALUE_DATE_YY;
/*     */   }
/*     */ 
/*     */   public String getACT()
/*     */   {
/* 693 */     return this.ACT.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setACT(String ACT)
/*     */   {
/* 700 */     this.ACT = ACT;
/*     */   }
/*     */ 
/*     */   public String getTMP()
/*     */   {
/* 711 */     return this.TMP.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setTMP(String TMP)
/*     */   {
/* 718 */     this.TMP = TMP;
/*     */   }
/*     */   public String toString() {
/* 721 */     StringBuffer results = new StringBuffer();
/*     */ 
/* 723 */     results.append(getClass().getName() + "\n");
/* 724 */     results.append("\tENTITYID=" + this.ENTITYID + "\n");
/* 725 */     results.append("\tTYPE=" + this.TYPE + "\n");
/* 726 */     results.append("\tSUBTYPE=" + this.SUBTYPE + "\n");
/* 727 */     results.append("\tAMOUNT=" + this.AMOUNT + "\n");
/* 728 */     results.append("\tCCY=" + this.CCY + "\n");
/* 729 */     results.append("\tDEBITACC=" + this.DEBITACC + "\n");
/* 730 */     results.append("\tCREDITACC=" + this.CREDITACC + "\n");
/* 731 */     results.append("\tBENE_NAME=" + this.BENE_NAME + "\n");
/* 732 */     results.append("\tBENE_ADD1=" + this.BENE_ADD1 + "\n");
/* 733 */     results.append("\tBENE_ADD2=" + this.BENE_ADD2 + "\n");
/* 734 */     results.append("\tBENE_BANK_ID=" + this.BENE_BANK_ID + "\n");
/* 735 */     results.append("\tBENE_BANK_NAME=" + this.BENE_BANK_NAME + "\n");
/* 736 */     results.append("\tBENE_BANK_ADD1=" + this.BENE_BANK_ADD1 + "\n");
/* 737 */     results.append("\tBENE_BANK_ADD2=" + this.BENE_BANK_ADD2 + "\n");
/* 738 */     results.append("\tINT_BANK_NAME=" + this.INT_BANK_NAME + "\n");
/* 739 */     results.append("\tINT_BANK_ADD1=" + this.INT_BANK_ADD1 + "\n");
/* 740 */     results.append("\tINT_BANK_ADD2=" + this.INT_BANK_ADD2 + "\n");
/* 741 */     results.append("\tBENE_MEMO1=" + this.BENE_MEMO1 + "\n");
/* 742 */     results.append("\tSTS=" + this.STS + "\n");
/* 743 */     results.append("\tINT_BANK_CHARGE=" + this.INT_BANK_CHARGE + "\n");
/* 744 */     results.append("\tDCIBS_REF=" + this.DCIBS_REF + "\n");
/* 745 */     results.append("\tBENE_BANK_ADD3=" + this.BENE_BANK_ADD3 + "\n");
/* 746 */     results.append("\tBENE_MEMO2=" + this.BENE_MEMO2 + "\n");
/* 747 */     results.append("\tBENE_MEMO3=" + this.BENE_MEMO3 + "\n");
/* 748 */     results.append("\tBNKA3TRF=" + this.BNKA3TRF + "\n");
/* 749 */     results.append("\tINT_BANK_ADD3=" + this.INT_BANK_ADD3 + "\n");
/* 750 */     results.append("\tINT_BANK_ID=" + this.INT_BANK_ID + "\n");
/* 751 */     results.append("\tODATE=" + this.ODATE + "\n");
/* 752 */     results.append("\tVDATE=" + this.VDATE + "\n");
/* 753 */     results.append("\tADATE=" + this.ADATE + "\n");
/* 754 */     results.append("\tOUSER=" + this.OUSER + "\n");
/* 755 */     results.append("\tVUSER=" + this.VUSER + "\n");
/* 756 */     results.append("\tAUSER=" + this.AUSER + "\n");
/* 757 */     results.append("\tNUMAPR=" + this.NUMAPR + "\n");
/* 758 */     results.append("\tVALUE_DATE_DD=" + this.VALUE_DATE_DD + "\n");
/* 759 */     results.append("\tVALUE_DATE_MM=" + this.VALUE_DATE_MM + "\n");
/* 760 */     results.append("\tVALUE_DATE_YY=" + this.VALUE_DATE_YY + "\n");
/* 761 */     results.append("\tACT=" + this.ACT + "\n");
/* 762 */     results.append("\tTMP=" + this.TMP + "\n");
/*     */ 
/* 764 */     return results.toString();
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.databeans.DC_TRANSFER
 * JD-Core Version:    0.6.0
 */