/*     */ package com.activo.gateway.dibs.databeans;
/*     */ 
/*     */ import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
/*     */
/*     */ public class DC_USRGRPITM
/*     */   implements Serializable
/*     */ {
/*  21 */   protected String ENTITYID = "";
/*     */ 
/*  39 */   protected int GRPID = 0;
/*     */ 
/*  57 */   protected int MMID = 0;
/*     */ 
/*  75 */   protected int CMID = 0;
/*     */ 
/*  93 */   protected String STATUS = "";
/*     */ 
/* 111 */   protected Timestamp DTTM = null;
/*     */ 
/* 129 */   protected int APPLEVEL = 0;
/*     */ 
/* 147 */   protected BigDecimal LMTAMNT = new BigDecimal("0");
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
/*     */   public int getGRPID()
/*     */   {
/*  45 */     return this.GRPID;
/*     */   }
/*     */ 
/*     */   public void setGRPID(int GRPID)
/*     */   {
/*  52 */     this.GRPID = GRPID;
/*     */   }
/*     */ 
/*     */   public int getMMID()
/*     */   {
/*  63 */     return this.MMID;
/*     */   }
/*     */ 
/*     */   public void setMMID(int MMID)
/*     */   {
/*  70 */     this.MMID = MMID;
/*     */   }
/*     */ 
/*     */   public int getCMID()
/*     */   {
/*  81 */     return this.CMID;
/*     */   }
/*     */ 
/*     */   public void setCMID(int CMID)
/*     */   {
/*  88 */     this.CMID = CMID;
/*     */   }
/*     */ 
/*     */   public String getSTATUS()
/*     */   {
/*  99 */     return this.STATUS.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setSTATUS(String STATUS)
/*     */   {
/* 106 */     this.STATUS = STATUS;
/*     */   }
/*     */ 
/*     */   public Timestamp getDTTM()
/*     */   {
/* 117 */     return this.DTTM;
/*     */   }
/*     */ 
/*     */   public void setDTTM(Timestamp DTTM)
/*     */   {
/* 124 */     this.DTTM = DTTM;
/*     */   }
/*     */ 
/*     */   public int getAPPLEVEL()
/*     */   {
/* 135 */     return this.APPLEVEL;
/*     */   }
/*     */ 
/*     */   public void setAPPLEVEL(int APPLEVEL)
/*     */   {
/* 142 */     this.APPLEVEL = APPLEVEL;
/*     */   }
/*     */ 
/*     */   public BigDecimal getLMTAMNT()
/*     */   {
/* 153 */     return this.LMTAMNT;
/*     */   }
/*     */ 
/*     */   public void setLMTAMNT(BigDecimal LMTAMNT)
/*     */   {
/* 160 */     this.LMTAMNT = LMTAMNT;
/*     */   }
/*     */   public String toString() {
/* 163 */     StringBuffer results = new StringBuffer();
/*     */ 
/* 165 */     results.append(getClass().getName() + "\n");
/* 166 */     results.append("\tENTITYID=" + this.ENTITYID + "\n");
/* 167 */     results.append("\tGRPID=" + this.GRPID + "\n");
/* 168 */     results.append("\tMMID=" + this.MMID + "\n");
/* 169 */     results.append("\tCMID=" + this.CMID + "\n");
/* 170 */     results.append("\tSTATUS=" + this.STATUS + "\n");
/* 171 */     results.append("\tDTTM=" + this.DTTM + "\n");
/* 172 */     results.append("\tAPPLEVEL=" + this.APPLEVEL + "\n");
/* 173 */     results.append("\tLMTAMNT=" + this.LMTAMNT + "\n");
/*     */ 
/* 175 */     return results.toString();
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.databeans.DC_USRGRPITM
 * JD-Core Version:    0.6.0
 */