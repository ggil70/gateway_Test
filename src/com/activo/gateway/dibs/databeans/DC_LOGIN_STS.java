/*    */ package com.activo.gateway.dibs.databeans;
/*    */ 
/*    */ import java.io.Serializable;
import java.sql.Timestamp;
/*    */ 
/*    */ public class DC_LOGIN_STS
/*    */   implements Serializable
/*    */ {
/* 18 */   protected String ENTITYID = "";
/*    */ 
/* 36 */   protected String USERID = "";
/*    */ 
/* 54 */   protected String STS = "";
/*    */   protected Timestamp TIME;
/*    */ 
/*    */   public String getENTITYID()
/*    */   {
/* 24 */     return this.ENTITYID.toUpperCase().trim();
/*    */   }
/*    */ 
/*    */   public void setENTITYID(String ENTITYID)
/*    */   {
/* 31 */     this.ENTITYID = ENTITYID;
/*    */   }
/*    */ 
/*    */   public String getUSERID()
/*    */   {
/* 42 */     return this.USERID.toUpperCase().trim();
/*    */   }
/*    */ 
/*    */   public void setUSERID(String USERID)
/*    */   {
/* 49 */     this.USERID = USERID;
/*    */   }
/*    */ 
/*    */   public String getSTS()
/*    */   {
/* 60 */     return this.STS.toUpperCase().trim();
/*    */   }
/*    */ 
/*    */   public void setSTS(String STS)
/*    */   {
/* 67 */     this.STS = STS;
/*    */   }
/*    */ 
/*    */   public Timestamp getTIME()
/*    */   {
/* 74 */     return this.TIME;
/*    */   }
/*    */ 
/*    */   public void setTime(Timestamp time)
/*    */   {
/* 79 */     this.TIME = time;
/*    */   }
/*    */ 
/*    */   public String toString() {
/* 83 */     StringBuffer results = new StringBuffer();
/*    */ 
/* 85 */     results.append(getClass().getName() + "\n");
/* 86 */     results.append("\tENTITYID=" + this.ENTITYID + "\n");
/* 87 */     results.append("\tUSERID=" + this.USERID + "\n");
/* 88 */     results.append("\tSTS=" + this.STS + "\n");
/* 89 */     results.append("\tTIME=" + this.TIME + "\n");
/*    */ 
/* 91 */     return results.toString();
/*    */   }
/*    */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.databeans.DC_LOGIN_STS
 * JD-Core Version:    0.6.0
 */