/*     */ package com.activo.gateway.dibs.databeans;
/*     */ 
/*     */ import java.io.Serializable;
import java.math.BigDecimal;
/*     */ 
/*     */ public class DC_UP_BENE
/*     */   implements Serializable
/*     */ {
/*  19 */   protected String ENTITYID = "";
/*     */ 
/*  37 */   protected String TYPE = "";
/*     */ 
/*  55 */   protected String SUBTYPE = "";
/*     */ 
/*  73 */   protected String STS = "";
/*     */ 
/*  91 */   protected String CREDITACC = "";
/*     */ 
/* 109 */   protected String CCY = "";
/*     */ 
/* 127 */   protected String BENE_NAME = "";
/*     */ 
/* 145 */   protected String BENE_ADD1 = "";
/*     */ 
/* 163 */   protected String BENE_ADD2 = "";
/*     */ 
/* 181 */   protected String BENE_ADD3 = "";
/*     */ 
/* 199 */   protected String BENE_MEMO1 = "";
/*     */ 
/* 217 */   protected String BENE_MEMO2 = "";
/*     */ 
/* 235 */   protected String BENE_MEMO3 = "";
/*     */ 
/* 253 */   protected String BENE_BANK_ID = "";
/*     */ 
/* 271 */   protected String BENE_BANK_NAME = "";
/*     */ 
/* 289 */   protected String BENE_BANK_ADD1 = "";
/*     */ 
/* 307 */   protected String BENE_BANK_ADD2 = "";
/*     */ 
/* 325 */   protected String BENE_BANK_ADD3 = "";
/*     */ 
/* 343 */   protected String INT_BANK_ID = "";
/*     */ 
/* 361 */   protected String INT_BANK_NAME = "";
/*     */ 
/* 379 */   protected String INT_BANK_ADD1 = "";
/*     */ 
/* 397 */   protected String INT_BANK_ADD2 = "";
/*     */ 
/* 415 */   protected String INT_BANK_ADD3 = "";
/*     */ 
/* 433 */   protected String INT_BANK_CHARGE = "";
/*     */ 
/* 451 */   protected String ACT = "";
/*     */ 
/* 469 */   protected int BENE_NUM = 0;
/*     */ 
/* 487 */   protected BigDecimal AMOUNT = null;
/*     */ 
/*     */   public String getENTITYID()
/*     */   {
/*  25 */     return this.ENTITYID.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setENTITYID(String ENTITYID)
/*     */   {
/*  32 */     this.ENTITYID = ENTITYID;
/*     */   }
/*     */ 
/*     */   public String getTYPE()
/*     */   {
/*  43 */     return this.TYPE.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setTYPE(String TYPE)
/*     */   {
/*  50 */     this.TYPE = TYPE;
/*     */   }
/*     */ 
/*     */   public String getSUBTYPE()
/*     */   {
/*  61 */     return this.SUBTYPE.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setSUBTYPE(String SUBTYPE)
/*     */   {
/*  68 */     this.SUBTYPE = SUBTYPE;
/*     */   }
/*     */ 
/*     */   public String getSTS()
/*     */   {
/*  79 */     return this.STS.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setSTS(String STS)
/*     */   {
/*  86 */     this.STS = STS;
/*     */   }
/*     */ 
/*     */   public String getCREDITACC()
/*     */   {
/*  97 */     return this.CREDITACC.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setCREDITACC(String CREDITACC)
/*     */   {
/* 104 */     this.CREDITACC = CREDITACC;
/*     */   }
/*     */ 
/*     */   public String getCCY()
/*     */   {
/* 115 */     return this.CCY.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setCCY(String CCY)
/*     */   {
/* 122 */     this.CCY = CCY;
/*     */   }
/*     */ 
/*     */   public String getBENE_NAME()
/*     */   {
/* 133 */     return this.BENE_NAME.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setBENE_NAME(String BENE_NAME)
/*     */   {
/* 140 */     this.BENE_NAME = BENE_NAME;
/*     */   }
/*     */ 
/*     */   public String getBENE_ADD1()
/*     */   {
/* 151 */     return this.BENE_ADD1.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setBENE_ADD1(String BENE_ADD1)
/*     */   {
/* 158 */     this.BENE_ADD1 = BENE_ADD1;
/*     */   }
/*     */ 
/*     */   public String getBENE_ADD2()
/*     */   {
/* 169 */     return this.BENE_ADD2.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setBENE_ADD2(String BENE_ADD2)
/*     */   {
/* 176 */     this.BENE_ADD2 = BENE_ADD2;
/*     */   }
/*     */ 
/*     */   public String getBENE_ADD3()
/*     */   {
/* 187 */     return this.BENE_ADD3.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setBENE_ADD3(String BENE_ADD3)
/*     */   {
/* 194 */     this.BENE_ADD3 = BENE_ADD3;
/*     */   }
/*     */ 
/*     */   public String getBENE_MEMO1()
/*     */   {
/* 205 */     return this.BENE_MEMO1.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setBENE_MEMO1(String BENE_MEMO1)
/*     */   {
/* 212 */     this.BENE_MEMO1 = BENE_MEMO1;
/*     */   }
/*     */ 
/*     */   public String getBENE_MEMO2()
/*     */   {
/* 223 */     return this.BENE_MEMO2.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setBENE_MEMO2(String BENE_MEMO2)
/*     */   {
/* 230 */     this.BENE_MEMO2 = BENE_MEMO2;
/*     */   }
/*     */ 
/*     */   public String getBENE_MEMO3()
/*     */   {
/* 241 */     return this.BENE_MEMO3.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setBENE_MEMO3(String BENE_MEMO3)
/*     */   {
/* 248 */     this.BENE_MEMO3 = BENE_MEMO3;
/*     */   }
/*     */ 
/*     */   public String getBENE_BANK_ID()
/*     */   {
/* 259 */     return this.BENE_BANK_ID.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setBENE_BANK_ID(String BENE_BANK_ID)
/*     */   {
/* 266 */     this.BENE_BANK_ID = BENE_BANK_ID;
/*     */   }
/*     */ 
/*     */   public String getBENE_BANK_NAME()
/*     */   {
/* 277 */     return this.BENE_BANK_NAME.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setBENE_BANK_NAME(String BENE_BANK_NAME)
/*     */   {
/* 284 */     this.BENE_BANK_NAME = BENE_BANK_NAME;
/*     */   }
/*     */ 
/*     */   public String getBENE_BANK_ADD1()
/*     */   {
/* 295 */     return this.BENE_BANK_ADD1.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setBENE_BANK_ADD1(String BENE_BANK_ADD1)
/*     */   {
/* 302 */     this.BENE_BANK_ADD1 = BENE_BANK_ADD1;
/*     */   }
/*     */ 
/*     */   public String getBENE_BANK_ADD2()
/*     */   {
/* 313 */     return this.BENE_BANK_ADD2.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setBENE_BANK_ADD2(String BENE_BANK_ADD2)
/*     */   {
/* 320 */     this.BENE_BANK_ADD2 = BENE_BANK_ADD2;
/*     */   }
/*     */ 
/*     */   public String getBENE_BANK_ADD3()
/*     */   {
/* 331 */     return this.BENE_BANK_ADD3.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setBENE_BANK_ADD3(String BENE_BANK_ADD3)
/*     */   {
/* 338 */     this.BENE_BANK_ADD3 = BENE_BANK_ADD3;
/*     */   }
/*     */ 
/*     */   public String getINT_BANK_ID()
/*     */   {
/* 349 */     return this.INT_BANK_ID.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setINT_BANK_ID(String INT_BANK_ID)
/*     */   {
/* 356 */     this.INT_BANK_ID = INT_BANK_ID;
/*     */   }
/*     */ 
/*     */   public String getINT_BANK_NAME()
/*     */   {
/* 367 */     return this.INT_BANK_NAME.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setINT_BANK_NAME(String INT_BANK_NAME)
/*     */   {
/* 374 */     this.INT_BANK_NAME = INT_BANK_NAME;
/*     */   }
/*     */ 
/*     */   public String getINT_BANK_ADD1()
/*     */   {
/* 385 */     return this.INT_BANK_ADD1.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setINT_BANK_ADD1(String INT_BANK_ADD1)
/*     */   {
/* 392 */     this.INT_BANK_ADD1 = INT_BANK_ADD1;
/*     */   }
/*     */ 
/*     */   public String getINT_BANK_ADD2()
/*     */   {
/* 403 */     return this.INT_BANK_ADD2.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setINT_BANK_ADD2(String INT_BANK_ADD2)
/*     */   {
/* 410 */     this.INT_BANK_ADD2 = INT_BANK_ADD2;
/*     */   }
/*     */ 
/*     */   public String getINT_BANK_ADD3()
/*     */   {
/* 421 */     return this.INT_BANK_ADD3.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setINT_BANK_ADD3(String INT_BANK_ADD3)
/*     */   {
/* 428 */     this.INT_BANK_ADD3 = INT_BANK_ADD3;
/*     */   }
/*     */ 
/*     */   public String getINT_BANK_CHARGE()
/*     */   {
/* 439 */     return this.INT_BANK_CHARGE.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setINT_BANK_CHARGE(String INT_BANK_CHARGE)
/*     */   {
/* 446 */     this.INT_BANK_CHARGE = INT_BANK_CHARGE;
/*     */   }
/*     */ 
/*     */   public String getACT()
/*     */   {
/* 457 */     return this.ACT.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setACT(String ACT)
/*     */   {
/* 464 */     this.ACT = ACT;
/*     */   }
/*     */ 
/*     */   public int getBENE_NUM()
/*     */   {
/* 475 */     return this.BENE_NUM;
/*     */   }
/*     */ 
/*     */   public void setBENE_NUM(int BENE_NUM)
/*     */   {
/* 482 */     this.BENE_NUM = BENE_NUM;
/*     */   }
/*     */ 
/*     */   public BigDecimal getAMOUNT()
/*     */   {
/* 493 */     return this.AMOUNT;
/*     */   }
/*     */ 
/*     */   public void setAMOUNT(BigDecimal AMOUNT)
/*     */   {
/* 500 */     this.AMOUNT = AMOUNT;
/*     */   }
/*     */   public String toString() {
/* 503 */     StringBuffer results = new StringBuffer();
/*     */ 
/* 505 */     results.append(getClass().getName() + "\n");
/* 506 */     results.append("\tENTITYID=" + this.ENTITYID + "\n");
/* 507 */     results.append("\tTYPE=" + this.TYPE + "\n");
/* 508 */     results.append("\tSUBTYPE=" + this.SUBTYPE + "\n");
/* 509 */     results.append("\tSTS=" + this.STS + "\n");
/* 510 */     results.append("\tCREDITACC=" + this.CREDITACC + "\n");
/* 511 */     results.append("\tCCY=" + this.CCY + "\n");
/* 512 */     results.append("\tBENE_NAME=" + this.BENE_NAME + "\n");
/* 513 */     results.append("\tBENE_ADD1=" + this.BENE_ADD1 + "\n");
/* 514 */     results.append("\tBENE_ADD2=" + this.BENE_ADD2 + "\n");
/* 515 */     results.append("\tBENE_ADD3=" + this.BENE_ADD3 + "\n");
/* 516 */     results.append("\tBENE_MEMO1=" + this.BENE_MEMO1 + "\n");
/* 517 */     results.append("\tBENE_MEMO2=" + this.BENE_MEMO2 + "\n");
/* 518 */     results.append("\tBENE_MEMO3=" + this.BENE_MEMO3 + "\n");
/* 519 */     results.append("\tBENE_BANK_ID=" + this.BENE_BANK_ID + "\n");
/* 520 */     results.append("\tBENE_BANK_NAME=" + this.BENE_BANK_NAME + "\n");
/* 521 */     results.append("\tBENE_BANK_ADD1=" + this.BENE_BANK_ADD1 + "\n");
/* 522 */     results.append("\tBENE_BANK_ADD2=" + this.BENE_BANK_ADD2 + "\n");
/* 523 */     results.append("\tBENE_BANK_ADD3=" + this.BENE_BANK_ADD3 + "\n");
/* 524 */     results.append("\tINT_BANK_ID=" + this.INT_BANK_ID + "\n");
/* 525 */     results.append("\tINT_BANK_NAME=" + this.INT_BANK_NAME + "\n");
/* 526 */     results.append("\tINT_BANK_ADD1=" + this.INT_BANK_ADD1 + "\n");
/* 527 */     results.append("\tINT_BANK_ADD2=" + this.INT_BANK_ADD2 + "\n");
/* 528 */     results.append("\tINT_BANK_ADD3=" + this.INT_BANK_ADD3 + "\n");
/* 529 */     results.append("\tINT_BANK_CHARGE=" + this.INT_BANK_CHARGE + "\n");
/* 530 */     results.append("\tACT=" + this.ACT + "\n");
/* 531 */     results.append("\tBENE_NUM=" + this.BENE_NUM + "\n");
/* 532 */     results.append("\tAMOUNT=" + this.AMOUNT + "\n");
/*     */ 
/* 534 */     return results.toString();
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.databeans.DC_UP_BENE
 * JD-Core Version:    0.6.0
 */