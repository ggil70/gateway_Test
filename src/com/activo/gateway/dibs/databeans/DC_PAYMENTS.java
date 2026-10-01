/*     */ package com.activo.gateway.dibs.databeans;
/*     */ 
/*     */ import java.io.Serializable;
import java.math.BigDecimal;
/*     */ 
/*     */ public class DC_PAYMENTS
/*     */   implements Serializable
/*     */ {
/*  19 */   protected String DSJINAACC = "";
/*     */ 
/*  37 */   protected String DSJINANM1 = "";
/*     */ 
/*  55 */   protected String DSJINAVNO = "";
/*     */ 
/*  73 */   protected String DSJINAPMT = "";
/*     */ 
/*  91 */   protected BigDecimal DSJINAIAM = new BigDecimal("0");
/*     */ 
/* 109 */   protected String DSJINACCY = "";
/*     */ 
/* 127 */   protected String DSJINAPDM = "";
/*     */ 
/* 145 */   protected String DSJINAPDD = "";
/*     */ 
/* 163 */   protected String DSJINAPDY = "";
/*     */ 
/* 181 */   protected String DSJINAPFR = "";
/*     */ 
/* 199 */   protected String DSJINATOT = "";
/*     */ 
/* 217 */   protected String DSJINAREF = "";
/*     */ 
/* 235 */   protected String DSJINARMK = "";
/*     */ 
/* 253 */   protected String DSJINAOPT = "";
/*     */ 
/* 271 */   protected String DSJINASQN = "";
/*     */ 
/* 289 */   protected String DSJINARCM = "";
/*     */ 
/* 307 */   protected String DSJINARCD = "";
/*     */ 
/* 325 */   protected String DSJINARCY = "";
/*     */ 
/* 343 */   protected String ENTITYID = "";
/*     */ 
/* 361 */   protected String OUSER = "";
/*     */ 
/* 379 */   protected String VUSER = "";
/*     */ 
/* 397 */   protected String AUSER = "";
/*     */ 
/* 415 */   protected String ODATE = "";
/*     */ 
/* 433 */   protected String VDATE = "";
/*     */ 
/* 451 */   protected String ADATE = "";
/*     */ 
/* 469 */   protected int NUMAPR = 0;
/*     */ 
/* 487 */   protected String STS = "";
/*     */ 
/* 505 */   protected String FLG = "";
/*     */ 
/* 523 */   protected String DCIBS_REF = "";
/*     */ 
/* 541 */   protected String VENNMA = "";
/*     */ 
/*     */   public String getDSJINAACC()
/*     */   {
/*  25 */     return this.DSJINAACC.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setDSJINAACC(String DSJINAACC)
/*     */   {
/*  32 */     this.DSJINAACC = DSJINAACC;
/*     */   }
/*     */ 
/*     */   public String getDSJINANM1()
/*     */   {
/*  43 */     return this.DSJINANM1.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setDSJINANM1(String DSJINANM1)
/*     */   {
/*  50 */     this.DSJINANM1 = DSJINANM1;
/*     */   }
/*     */ 
/*     */   public String getDSJINAVNO()
/*     */   {
/*  61 */     return this.DSJINAVNO.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setDSJINAVNO(String DSJINAVNO)
/*     */   {
/*  68 */     this.DSJINAVNO = DSJINAVNO;
/*     */   }
/*     */ 
/*     */   public String getDSJINAPMT()
/*     */   {
/*  79 */     return this.DSJINAPMT.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setDSJINAPMT(String DSJINAPMT)
/*     */   {
/*  86 */     this.DSJINAPMT = DSJINAPMT;
/*     */   }
/*     */ 
/*     */   public BigDecimal getDSJINAIAM()
/*     */   {
/*  97 */     return this.DSJINAIAM;
/*     */   }
/*     */ 
/*     */   public void setDSJINAIAM(BigDecimal DSJINAIAM)
/*     */   {
/* 104 */     this.DSJINAIAM = DSJINAIAM;
/*     */   }
/*     */ 
/*     */   public String getDSJINACCY()
/*     */   {
/* 115 */     return this.DSJINACCY.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setDSJINACCY(String DSJINACCY)
/*     */   {
/* 122 */     this.DSJINACCY = DSJINACCY;
/*     */   }
/*     */ 
/*     */   public String getDSJINAPDM()
/*     */   {
/* 133 */     return this.DSJINAPDM.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setDSJINAPDM(String DSJINAPDM)
/*     */   {
/* 140 */     this.DSJINAPDM = DSJINAPDM;
/*     */   }
/*     */ 
/*     */   public String getDSJINAPDD()
/*     */   {
/* 151 */     return this.DSJINAPDD.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setDSJINAPDD(String DSJINAPDD)
/*     */   {
/* 158 */     this.DSJINAPDD = DSJINAPDD;
/*     */   }
/*     */ 
/*     */   public String getDSJINAPDY()
/*     */   {
/* 169 */     return this.DSJINAPDY.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setDSJINAPDY(String DSJINAPDY)
/*     */   {
/* 176 */     this.DSJINAPDY = DSJINAPDY;
/*     */   }
/*     */ 
/*     */   public String getDSJINAPFR()
/*     */   {
/* 187 */     return this.DSJINAPFR.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setDSJINAPFR(String DSJINAPFR)
/*     */   {
/* 194 */     this.DSJINAPFR = DSJINAPFR;
/*     */   }
/*     */ 
/*     */   public String getDSJINATOT()
/*     */   {
/* 205 */     return this.DSJINATOT.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setDSJINATOT(String DSJINATOT)
/*     */   {
/* 212 */     this.DSJINATOT = DSJINATOT;
/*     */   }
/*     */ 
/*     */   public String getDSJINAREF()
/*     */   {
/* 223 */     return this.DSJINAREF.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setDSJINAREF(String DSJINAREF)
/*     */   {
/* 230 */     this.DSJINAREF = DSJINAREF;
/*     */   }
/*     */ 
/*     */   public String getDSJINARMK()
/*     */   {
/* 241 */     return this.DSJINARMK.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setDSJINARMK(String DSJINARMK)
/*     */   {
/* 248 */     this.DSJINARMK = DSJINARMK;
/*     */   }
/*     */ 
/*     */   public String getDSJINAOPT()
/*     */   {
/* 259 */     return this.DSJINAOPT.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setDSJINAOPT(String DSJINAOPT)
/*     */   {
/* 266 */     this.DSJINAOPT = DSJINAOPT;
/*     */   }
/*     */ 
/*     */   public String getDSJINASQN()
/*     */   {
/* 277 */     return this.DSJINASQN.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setDSJINASQN(String DSJINASQN)
/*     */   {
/* 284 */     this.DSJINASQN = DSJINASQN;
/*     */   }
/*     */ 
/*     */   public String getDSJINARCM()
/*     */   {
/* 295 */     return this.DSJINARCM.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setDSJINARCM(String DSJINARCM)
/*     */   {
/* 302 */     this.DSJINARCM = DSJINARCM;
/*     */   }
/*     */ 
/*     */   public String getDSJINARCD()
/*     */   {
/* 313 */     return this.DSJINARCD.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setDSJINARCD(String DSJINARCD)
/*     */   {
/* 320 */     this.DSJINARCD = DSJINARCD;
/*     */   }
/*     */ 
/*     */   public String getDSJINARCY()
/*     */   {
/* 331 */     return this.DSJINARCY.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setDSJINARCY(String DSJINARCY)
/*     */   {
/* 338 */     this.DSJINARCY = DSJINARCY;
/*     */   }
/*     */ 
/*     */   public String getENTITYID()
/*     */   {
/* 349 */     return this.ENTITYID.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setENTITYID(String ENTITYID)
/*     */   {
/* 356 */     this.ENTITYID = ENTITYID;
/*     */   }
/*     */ 
/*     */   public String getOUSER()
/*     */   {
/* 367 */     return this.OUSER.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setOUSER(String OUSER)
/*     */   {
/* 374 */     this.OUSER = OUSER;
/*     */   }
/*     */ 
/*     */   public String getVUSER()
/*     */   {
/* 385 */     return this.VUSER.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setVUSER(String VUSER)
/*     */   {
/* 392 */     this.VUSER = VUSER;
/*     */   }
/*     */ 
/*     */   public String getAUSER()
/*     */   {
/* 403 */     return this.AUSER.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setAUSER(String AUSER)
/*     */   {
/* 410 */     this.AUSER = AUSER;
/*     */   }
/*     */ 
/*     */   public String getODATE()
/*     */   {
/* 421 */     return this.ODATE.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setODATE(String ODATE)
/*     */   {
/* 428 */     this.ODATE = ODATE;
/*     */   }
/*     */ 
/*     */   public String getVDATE()
/*     */   {
/* 439 */     return this.VDATE.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setVDATE(String VDATE)
/*     */   {
/* 446 */     this.VDATE = VDATE;
/*     */   }
/*     */ 
/*     */   public String getADATE()
/*     */   {
/* 457 */     return this.ADATE.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setADATE(String ADATE)
/*     */   {
/* 464 */     this.ADATE = ADATE;
/*     */   }
/*     */ 
/*     */   public int getNUMAPR()
/*     */   {
/* 475 */     return this.NUMAPR;
/*     */   }
/*     */ 
/*     */   public void setNUMAPR(int NUMAPR)
/*     */   {
/* 482 */     this.NUMAPR = NUMAPR;
/*     */   }
/*     */ 
/*     */   public String getSTS()
/*     */   {
/* 493 */     return this.STS.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setSTS(String STS)
/*     */   {
/* 500 */     this.STS = STS;
/*     */   }
/*     */ 
/*     */   public String getFLG()
/*     */   {
/* 511 */     return this.FLG.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setFLG(String FLG)
/*     */   {
/* 518 */     this.FLG = FLG;
/*     */   }
/*     */ 
/*     */   public String getDCIBS_REF()
/*     */   {
/* 529 */     return this.DCIBS_REF.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setDCIBS_REF(String DCIBS_REF)
/*     */   {
/* 536 */     this.DCIBS_REF = DCIBS_REF;
/*     */   }
/*     */ 
/*     */   public String getVENNMA()
/*     */   {
/* 547 */     return this.VENNMA.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setVENNMA(String VENNMA)
/*     */   {
/* 554 */     this.VENNMA = VENNMA;
/*     */   }
/*     */   public String toString() {
/* 557 */     StringBuffer results = new StringBuffer();
/*     */ 
/* 559 */     results.append(getClass().getName() + "\n");
/* 560 */     results.append("\tDSJINAACC=" + this.DSJINAACC + "\n");
/* 561 */     results.append("\tDSJINANM1=" + this.DSJINANM1 + "\n");
/* 562 */     results.append("\tDSJINAVNO=" + this.DSJINAVNO + "\n");
/* 563 */     results.append("\tDSJINAPMT=" + this.DSJINAPMT + "\n");
/* 564 */     results.append("\tDSJINAIAM=" + this.DSJINAIAM + "\n");
/* 565 */     results.append("\tDSJINACCY=" + this.DSJINACCY + "\n");
/* 566 */     results.append("\tDSJINAPDM=" + this.DSJINAPDM + "\n");
/* 567 */     results.append("\tDSJINAPDD=" + this.DSJINAPDD + "\n");
/* 568 */     results.append("\tDSJINAPDY=" + this.DSJINAPDY + "\n");
/* 569 */     results.append("\tDSJINAPFR=" + this.DSJINAPFR + "\n");
/* 570 */     results.append("\tDSJINATOT=" + this.DSJINATOT + "\n");
/* 571 */     results.append("\tDSJINAREF=" + this.DSJINAREF + "\n");
/* 572 */     results.append("\tDSJINARMK=" + this.DSJINARMK + "\n");
/* 573 */     results.append("\tDSJINAOPT=" + this.DSJINAOPT + "\n");
/* 574 */     results.append("\tDSJINASQN=" + this.DSJINASQN + "\n");
/* 575 */     results.append("\tDSJINARCM=" + this.DSJINARCM + "\n");
/* 576 */     results.append("\tDSJINARCD=" + this.DSJINARCD + "\n");
/* 577 */     results.append("\tDSJINARCY=" + this.DSJINARCY + "\n");
/* 578 */     results.append("\tENTITYID=" + this.ENTITYID + "\n");
/* 579 */     results.append("\tOUSER=" + this.OUSER + "\n");
/* 580 */     results.append("\tVUSER=" + this.VUSER + "\n");
/* 581 */     results.append("\tAUSER=" + this.AUSER + "\n");
/* 582 */     results.append("\tODATE=" + this.ODATE + "\n");
/* 583 */     results.append("\tVDATE=" + this.VDATE + "\n");
/* 584 */     results.append("\tADATE=" + this.ADATE + "\n");
/* 585 */     results.append("\tNUMAPR=" + this.NUMAPR + "\n");
/* 586 */     results.append("\tSTS=" + this.STS + "\n");
/* 587 */     results.append("\tFLG=" + this.FLG + "\n");
/* 588 */     results.append("\tDCIBS_REF=" + this.DCIBS_REF + "\n");
/* 589 */     results.append("\tVENNMA=" + this.VENNMA + "\n");
/*     */ 
/* 591 */     return results.toString();
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.databeans.DC_PAYMENTS
 * JD-Core Version:    0.6.0
 */