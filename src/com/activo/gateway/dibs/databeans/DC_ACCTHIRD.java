/*     */ package com.activo.gateway.dibs.databeans;
/*     */ 
/*     */ import java.io.Serializable;
import java.math.BigDecimal;


/*     */ 
/*     */ public class DC_ACCTHIRD
/*     */   implements Serializable
/*     */ {
/*   9 */   protected String ENTITYID = "";
/*  10 */   protected String BENEACC = "";
/*  11 */   protected String ACCNUMMASK = "";
/*  12 */   protected String NICKNAME = "";
/*  13 */   protected String BENENAME = "";
/*  14 */   protected String BENEADD1 = "";
/*  15 */   protected String BENEADD2 = "";
/*  16 */   protected String CEDULA = "";
/*  17 */   protected String PHONE = "";
/*  18 */   protected String BNKNAME = "";
/*  19 */   protected String BNKADD1 = "";
/*  20 */   protected String BNKADD2 = "";
/*  21 */   protected String BNKADD3 = "";
/*  22 */   protected String BNKCODE = "";
/*  23 */   protected String TRANSTYPE = "";
/*  24 */   protected String FLG = "";
/*  25 */   protected BigDecimal RECNUM = new BigDecimal("0");
/*  26 */   protected String EMAIL = "";
/*  27 */   protected String LASTUPDATE = "";
/*     */ 
/*     */   public String getACCNUMMASK()
/*     */   {
/*  35 */     return this.ACCNUMMASK;
/*     */   }
/*     */ 
/*     */   public String getBENEACC()
/*     */   {
/*  42 */     return this.BENEACC;
/*     */   }
/*     */ 
/*     */   public String getBENEADD1()
/*     */   {
/*  49 */     return this.BENEADD1;
/*     */   }
/*     */ 
/*     */   public String getBENEADD2()
/*     */   {
/*  56 */     return this.BENEADD2;
/*     */   }
/*     */ 
/*     */   public String getBENENAME()
/*     */   {
/*  63 */     return this.BENENAME;
/*     */   }
/*     */ 
/*     */   public String getBNKADD1()
/*     */   {
/*  70 */     return this.BNKADD1;
/*     */   }
/*     */ 
/*     */   public String getBNKADD2()
/*     */   {
/*  77 */     return this.BNKADD2;
/*     */   }
/*     */ 
/*     */   public String getBNKADD3()
/*     */   {
/*  84 */     return this.BNKADD3;
/*     */   }
/*     */ 
/*     */   public String getBNKCODE()
/*     */   {
/*  91 */     return this.BNKCODE;
/*     */   }
/*     */ 
/*     */   public String getBNKNAME()
/*     */   {
/*  99 */     return this.BNKNAME;
/*     */   }
/*     */ 
/*     */   public String getCEDULA()
/*     */   {
/* 106 */     return this.CEDULA;
/*     */   }
/*     */ 
/*     */   public String getEMAIL()
/*     */   {
/* 113 */     return this.EMAIL;
/*     */   }
/*     */ 
/*     */   public String getENTITYID()
/*     */   {
/* 120 */     return this.ENTITYID;
/*     */   }
/*     */ 
/*     */   public String getFLG()
/*     */   {
/* 127 */     return this.FLG;
/*     */   }
/*     */ 
/*     */   public String getLASTUPDATE()
/*     */   {
/* 134 */     return this.LASTUPDATE;
/*     */   }
/*     */ 
/*     */   public String getNICKNAME()
/*     */   {
/* 141 */     return this.NICKNAME;
/*     */   }
/*     */ 
/*     */   public String getPHONE()
/*     */   {
/* 148 */     return this.PHONE;
/*     */   }
/*     */ 
/*     */   public BigDecimal getRECNUM()
/*     */   {
/* 155 */     return this.RECNUM;
/*     */   }
/*     */ 
/*     */   public String getTRANSTYPE()
/*     */   {
/* 162 */     return this.TRANSTYPE;
/*     */   }
/*     */ 
/*     */   public void setACCNUMMASK(String string)
/*     */   {
/* 169 */     this.ACCNUMMASK = string;
/*     */   }
/*     */ 
/*     */   public void setBENEACC(String string)
/*     */   {
/* 176 */     this.BENEACC = string;
/*     */   }
/*     */ 
/*     */   public void setBENEADD1(String string)
/*     */   {
/* 183 */     this.BENEADD1 = string;
/*     */   }
/*     */ 
/*     */   public void setBENEADD2(String string)
/*     */   {
/* 190 */     this.BENEADD2 = string;
/*     */   }
/*     */ 
/*     */   public void setBENENAME(String string)
/*     */   {
/* 197 */     this.BENENAME = string;
/*     */   }
/*     */ 
/*     */   public void setBNKADD1(String string)
/*     */   {
/* 204 */     this.BNKADD1 = string;
/*     */   }
/*     */ 
/*     */   public void setBNKADD2(String string)
/*     */   {
/* 211 */     this.BNKADD2 = string;
/*     */   }
/*     */ 
/*     */   public void setBNKADD3(String string)
/*     */   {
/* 218 */     this.BNKADD3 = string;
/*     */   }
/*     */ 
/*     */   public void setBNKCODE(String string)
/*     */   {
/* 225 */     this.BNKCODE = string;
/*     */   }
/*     */ 
/*     */   public void setBNKNAME(String string)
/*     */   {
/* 233 */     this.BNKNAME = string;
/*     */   }
/*     */ 
/*     */   public void setCEDULA(String string)
/*     */   {
/* 240 */     this.CEDULA = string;
/*     */   }
/*     */ 
/*     */   public void setEMAIL(String string)
/*     */   {
/* 247 */     this.EMAIL = string;
/*     */   }
/*     */ 
/*     */   public void setENTITYID(String string)
/*     */   {
/* 254 */     this.ENTITYID = string;
/*     */   }
/*     */ 
/*     */   public void setFLG(String string)
/*     */   {
/* 261 */     this.FLG = string;
/*     */   }
/*     */ 
/*     */   public void setLASTUPDATE(String string)
/*     */   {
/* 268 */     this.LASTUPDATE = string;
/*     */   }
/*     */ 
/*     */   public void setNICKNAME(String string)
/*     */   {
/* 275 */     this.NICKNAME = string;
/*     */   }
/*     */ 
/*     */   public void setPHONE(String string)
/*     */   {
/* 282 */     this.PHONE = string;
/*     */   }
/*     */ 
/*     */   public void setRECNUM(BigDecimal decimal)
/*     */   {
/* 289 */     this.RECNUM = decimal;
/*     */   }
/*     */ 
/*     */   public void setTRANSTYPE(String string)
/*     */   {
/* 296 */     this.TRANSTYPE = string;
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.databeans.DC_ACCTHIRD
 * JD-Core Version:    0.6.0
 */