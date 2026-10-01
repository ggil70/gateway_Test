/*     */ package com.activo.gateway.dibs.databeans;
/*     */ 
/*     */ import java.io.Serializable;
import java.math.BigDecimal;
/*     */ 
/*     */ public class DC_PAYROLL_HEADER
/*     */   implements Serializable
/*     */ {
/*  21 */   protected String ENTITYID = "";
/*     */ 
/*  39 */   protected String DCIBS_REF = "";
/*     */ 
/*  57 */   protected String ODATE = "";
/*     */ 
/*  75 */   protected String VDATE = "";
/*     */ 
/*  93 */   protected String ADATE = "";
/*     */ 
/* 111 */   protected String OUSER = "";
/*     */ 
/* 129 */   protected String VUSER = "";
/*     */ 
/* 147 */   protected String AUSER = "";
/*     */ 
/* 165 */   protected int NUMAPR = 0;
/*     */ 
/* 183 */   protected String STS = "";
/*     */ 
/* 201 */   protected String VDD = "";
/*     */ 
/* 219 */   protected String VMM = "";
/*     */ 
/* 237 */   protected String VYY = "";
/*     */ 
/* 255 */   protected BigDecimal TOT_AMT = new BigDecimal("0");
/*     */ 
/* 273 */   protected int NUM_OF_RECORDS = 0;
/*     */ 
/* 289 */   protected String DESCRIPTION = " ";
/*     */ 
/* 306 */   protected String ACT = "";
/*     */ 
/* 324 */   protected String DEBITACC = "";
/*     */ 
/* 343 */   protected String TYPE = "";
/*     */ 
/* 362 */   protected String SUBTYPE = "";
/*     */ 
/* 381 */   protected String APV_FLG = "";
/*     */ 
/* 397 */   String LOTE = "";
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
/*     */   public String getDCIBS_REF()
/*     */   {
/*  45 */     return this.DCIBS_REF.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setDCIBS_REF(String DCIBS_REF)
/*     */   {
/*  52 */     this.DCIBS_REF = DCIBS_REF;
/*     */   }
/*     */ 
/*     */   public String getODATE()
/*     */   {
/*  63 */     return this.ODATE.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setODATE(String ODATE)
/*     */   {
/*  70 */     this.ODATE = ODATE;
/*     */   }
/*     */ 
/*     */   public String getVDATE()
/*     */   {
/*  81 */     return this.VDATE.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setVDATE(String VDATE)
/*     */   {
/*  88 */     this.VDATE = VDATE;
/*     */   }
/*     */ 
/*     */   public String getADATE()
/*     */   {
/*  99 */     return this.ADATE.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setADATE(String ADATE)
/*     */   {
/* 106 */     this.ADATE = ADATE;
/*     */   }
/*     */ 
/*     */   public String getOUSER()
/*     */   {
/* 117 */     return this.OUSER.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setOUSER(String OUSER)
/*     */   {
/* 124 */     this.OUSER = OUSER;
/*     */   }
/*     */ 
/*     */   public String getVUSER()
/*     */   {
/* 135 */     return this.VUSER.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setVUSER(String VUSER)
/*     */   {
/* 142 */     this.VUSER = VUSER;
/*     */   }
/*     */ 
/*     */   public String getAUSER()
/*     */   {
/* 153 */     return this.AUSER.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setAUSER(String AUSER)
/*     */   {
/* 160 */     this.AUSER = AUSER;
/*     */   }
/*     */ 
/*     */   public int getNUMAPR()
/*     */   {
/* 171 */     return this.NUMAPR;
/*     */   }
/*     */ 
/*     */   public void setNUMAPR(int NUMAPR)
/*     */   {
/* 178 */     this.NUMAPR = NUMAPR;
/*     */   }
/*     */ 
/*     */   public String getSTS()
/*     */   {
/* 189 */     return this.STS.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setSTS(String STS)
/*     */   {
/* 196 */     this.STS = STS;
/*     */   }
/*     */ 
/*     */   public String getVDD()
/*     */   {
/* 207 */     return this.VDD.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setVDD(String VDD)
/*     */   {
/* 214 */     this.VDD = VDD;
/*     */   }
/*     */ 
/*     */   public String getVMM()
/*     */   {
/* 225 */     return this.VMM.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setVMM(String VMM)
/*     */   {
/* 232 */     this.VMM = VMM;
/*     */   }
/*     */ 
/*     */   public String getVYY()
/*     */   {
/* 243 */     return this.VYY.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setVYY(String VYY)
/*     */   {
/* 250 */     this.VYY = VYY;
/*     */   }
/*     */ 
/*     */   public BigDecimal getTOT_AMT()
/*     */   {
/* 261 */     return this.TOT_AMT;
/*     */   }
/*     */ 
/*     */   public void setTOT_AMT(BigDecimal TOT_AMT)
/*     */   {
/* 268 */     this.TOT_AMT = TOT_AMT;
/*     */   }
/*     */ 
/*     */   public int getNUM_OF_RECORDS()
/*     */   {
/* 279 */     return this.NUM_OF_RECORDS;
/*     */   }
/*     */ 
/*     */   public void setNUM_OF_RECORDS(int NUM_OF_RECORDS)
/*     */   {
/* 286 */     this.NUM_OF_RECORDS = NUM_OF_RECORDS;
/*     */   }
/*     */ 
/*     */   public String getDESCRIPTION()
/*     */   {
/* 294 */     return this.DESCRIPTION;
/*     */   }
/*     */ 
/*     */   public void setDESCRIPTION(String string)
/*     */   {
/* 301 */     this.DESCRIPTION = string;
/*     */   }
/*     */ 
/*     */   public String getACT()
/*     */   {
/* 312 */     return this.ACT.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setACT(String ACT)
/*     */   {
/* 319 */     this.ACT = ACT;
/*     */   }
/*     */ 
/*     */   public String getDEBITACC()
/*     */   {
/* 330 */     return this.DEBITACC.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setDEBITACC(String DEBITACC)
/*     */   {
/* 337 */     this.DEBITACC = DEBITACC;
/*     */   }
/*     */ 
/*     */   public String getTYPE()
/*     */   {
/* 349 */     return this.TYPE.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setTYPE(String TYPE)
/*     */   {
/* 356 */     this.TYPE = TYPE;
/*     */   }
/*     */ 
/*     */   public String getSUBTYPE()
/*     */   {
/* 368 */     return this.SUBTYPE.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setSUBTYPE(String SUBTYPE)
/*     */   {
/* 375 */     this.SUBTYPE = SUBTYPE;
/*     */   }
/*     */ 
/*     */   public String getAPV_FLG()
/*     */   {
/* 387 */     return this.APV_FLG;
/*     */   }
/*     */ 
/*     */   public void setAPV_FLG(String APV_FLG)
/*     */   {
/* 394 */     this.APV_FLG = APV_FLG;
/*     */   }
/*     */ 
/*     */   public String getLOTE()
/*     */   {
/* 403 */     return this.LOTE;
/*     */   }
/*     */ 
/*     */   public void setLOTE(String string)
/*     */   {
/* 410 */     this.LOTE = string;
/*     */   }
/*     */ 
/*     */   public String toString() {
/* 414 */     StringBuffer results = new StringBuffer();
/*     */ 
/* 416 */     results.append(getClass().getName() + "\n");
/* 417 */     results.append("\tENTITYID=" + this.ENTITYID + "\n");
/* 418 */     results.append("\tDCIBS_REF=" + this.DCIBS_REF + "\n");
/* 419 */     results.append("\tODATE=" + this.ODATE + "\n");
/* 420 */     results.append("\tVDATE=" + this.VDATE + "\n");
/* 421 */     results.append("\tADATE=" + this.ADATE + "\n");
/* 422 */     results.append("\tOUSER=" + this.OUSER + "\n");
/* 423 */     results.append("\tVUSER=" + this.VUSER + "\n");
/* 424 */     results.append("\tAUSER=" + this.AUSER + "\n");
/* 425 */     results.append("\tNUMAPR=" + this.NUMAPR + "\n");
/* 426 */     results.append("\tSTS=" + this.STS + "\n");
/* 427 */     results.append("\tVDD=" + this.VDD + "\n");
/* 428 */     results.append("\tVMM=" + this.VMM + "\n");
/* 429 */     results.append("\tVYY=" + this.VYY + "\n");
/* 430 */     results.append("\tTOT_AMT=" + this.TOT_AMT + "\n");
/* 431 */     results.append("\tNUM_OF_RECORDS=" + this.NUM_OF_RECORDS + "\n");
/* 432 */     results.append("\tDESCRIPTION=" + this.DESCRIPTION + "\n");
/* 433 */     results.append("\tLOTE=" + this.LOTE + "\n");
/* 434 */     results.append("\tACT=" + this.ACT + "\n");
/* 435 */     results.append("\tDEBITACC=" + this.DEBITACC + "\n");
/* 436 */     results.append("\tTYPE=" + this.TYPE + "\n");
/* 437 */     results.append("\tSUBTYPE=" + this.TYPE + "\n");
/* 438 */     results.append("\tAPV_FLG=" + this.APV_FLG + "\n");
/* 439 */     return results.toString();
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.databeans.DC_PAYROLL_HEADER
 * JD-Core Version:    0.6.0
 */