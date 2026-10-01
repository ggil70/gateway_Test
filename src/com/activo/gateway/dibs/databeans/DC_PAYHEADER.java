/*     */ package com.activo.gateway.dibs.databeans;
/*     */ 
/*     */ import java.io.Serializable;
/*     */
/*     */ public class DC_PAYHEADER
/*     */   implements Serializable
/*     */ {
/*  19 */   protected String ENTITYID = "";
/*     */ 
/*  37 */   protected String REFE = "";
/*     */ 
/*  55 */   protected String ODATE = "";
/*     */ 
/*  73 */   protected String VDATE = "";
/*     */ 
/*  91 */   protected String ADATE = "";
/*     */ 
/* 109 */   protected String OUSER = "";
/*     */ 
/* 127 */   protected String VUSER = "";
/*     */ 
/* 145 */   protected String AUSER = "";
/*     */ 
/* 163 */   protected String NUMAPR = "";
/*     */ 
/* 181 */   protected String STS = "";
/*     */ 
/* 199 */   protected String FLG = "";
/*     */ 
/* 217 */   protected String DEBACC = "";
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
/*     */   public String getREFE()
/*     */   {
/*  43 */     return this.REFE.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setREFE(String REFE)
/*     */   {
/*  50 */     this.REFE = REFE;
/*     */   }
/*     */ 
/*     */   public String getODATE()
/*     */   {
/*  61 */     return this.ODATE.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setODATE(String ODATE)
/*     */   {
/*  68 */     this.ODATE = ODATE;
/*     */   }
/*     */ 
/*     */   public String getVDATE()
/*     */   {
/*  79 */     return this.VDATE.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setVDATE(String VDATE)
/*     */   {
/*  86 */     this.VDATE = VDATE;
/*     */   }
/*     */ 
/*     */   public String getADATE()
/*     */   {
/*  97 */     return this.ADATE.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setADATE(String ADATE)
/*     */   {
/* 104 */     this.ADATE = ADATE;
/*     */   }
/*     */ 
/*     */   public String getOUSER()
/*     */   {
/* 115 */     return this.OUSER.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setOUSER(String OUSER)
/*     */   {
/* 122 */     this.OUSER = OUSER;
/*     */   }
/*     */ 
/*     */   public String getVUSER()
/*     */   {
/* 133 */     return this.VUSER.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setVUSER(String VUSER)
/*     */   {
/* 140 */     this.VUSER = VUSER;
/*     */   }
/*     */ 
/*     */   public String getAUSER()
/*     */   {
/* 151 */     return this.AUSER.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setAUSER(String AUSER)
/*     */   {
/* 158 */     this.AUSER = AUSER;
/*     */   }
/*     */ 
/*     */   public String getNUMAPR()
/*     */   {
/* 169 */     return this.NUMAPR.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setNUMAPR(String NUMAPR)
/*     */   {
/* 176 */     this.NUMAPR = NUMAPR;
/*     */   }
/*     */ 
/*     */   public String getSTS()
/*     */   {
/* 187 */     return this.STS.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setSTS(String STS)
/*     */   {
/* 194 */     this.STS = STS;
/*     */   }
/*     */ 
/*     */   public String getFLG()
/*     */   {
/* 205 */     return this.FLG.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setFLG(String FLG)
/*     */   {
/* 212 */     this.FLG = FLG;
/*     */   }
/*     */ 
/*     */   public String getDEBACC()
/*     */   {
/* 223 */     return this.DEBACC.toUpperCase().trim();
/*     */   }
/*     */ 
/*     */   public void setDEBACC(String DEBACC)
/*     */   {
/* 230 */     this.DEBACC = DEBACC;
/*     */   }
/*     */   public String toString() {
/* 233 */     StringBuffer results = new StringBuffer();
/*     */ 
/* 235 */     results.append(getClass().getName() + "\n");
/* 236 */     results.append("\tENTITYID=" + this.ENTITYID + "\n");
/* 237 */     results.append("\tREFE=" + this.REFE + "\n");
/* 238 */     results.append("\tODATE=" + this.ODATE + "\n");
/* 239 */     results.append("\tVDATE=" + this.VDATE + "\n");
/* 240 */     results.append("\tADATE=" + this.ADATE + "\n");
/* 241 */     results.append("\tOUSER=" + this.OUSER + "\n");
/* 242 */     results.append("\tVUSER=" + this.VUSER + "\n");
/* 243 */     results.append("\tAUSER=" + this.AUSER + "\n");
/* 244 */     results.append("\tNUMAPR=" + this.NUMAPR + "\n");
/* 245 */     results.append("\tSTS=" + this.STS + "\n");
/* 246 */     results.append("\tFLG=" + this.FLG + "\n");
/* 247 */     results.append("\tDEBACC=" + this.DEBACC + "\n");
/*     */ 
/* 249 */     return results.toString();
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.databeans.DC_PAYHEADER
 * JD-Core Version:    0.6.0
 */