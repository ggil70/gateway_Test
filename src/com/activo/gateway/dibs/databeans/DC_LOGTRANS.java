/*    */ package com.activo.gateway.dibs.databeans;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ 
/*    */ public class DC_LOGTRANS
/*    */   implements Serializable
/*    */ {
/* 16 */   protected String TRANSCODE = "";
/*    */ 
/* 34 */   protected String TRANSDESC = "";
/*    */ 
/* 53 */   protected String STS = "";
/*    */ 
/*    */   public String getTRANSCODE()
/*    */   {
/* 22 */     return this.TRANSCODE.toUpperCase().trim();
/*    */   }
/*    */ 
/*    */   public void setTRANSCODE(String TRANSCODE)
/*    */   {
/* 29 */     this.TRANSCODE = TRANSCODE;
/*    */   }
/*    */ 
/*    */   public String getTRANSDESC()
/*    */   {
/* 40 */     return this.TRANSDESC.toUpperCase().trim();
/*    */   }
/*    */ 
/*    */   public void setTRANSDESC(String TRANSDESC)
/*    */   {
/* 47 */     this.TRANSDESC = TRANSDESC;
/*    */   }
/*    */ 
/*    */   public String getSTS()
/*    */   {
/* 59 */     return this.STS.toUpperCase().trim();
/*    */   }
/*    */ 
/*    */   public void setSTS(String STS)
/*    */   {
/* 66 */     this.STS = STS;
/*    */   }
/*    */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.databeans.DC_LOGTRANS
 * JD-Core Version:    0.6.0
 */