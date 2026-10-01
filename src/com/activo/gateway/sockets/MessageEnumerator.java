/*    */ package com.activo.gateway.sockets;
/*    */ 
/*    */ import java.util.Enumeration;
import java.util.NoSuchElementException;
/*    */ 
/*    */ public class MessageEnumerator
/*    */   implements Enumeration
/*    */ {
/*    */   MessageRecord myrec;
/*    */   int fcount;
/*    */   int fpos;
/*    */ 
/*    */   protected MessageEnumerator(MessageRecord mr)
/*    */   {
/* 14 */     this.myrec = mr;
/* 15 */     this.fcount = this.myrec.getFieldCount();
/* 16 */     this.fpos = 0;
/*    */   }
/*    */ 
/*    */   public boolean hasMoreElements() {
/* 20 */     return this.fpos < this.fcount;
/*    */   }
/*    */ 
/*    */   public Object nextElement() throws NoSuchElementException {
/* 24 */     if (this.fpos >= this.fcount) {
/* 25 */       throw new NoSuchElementException();
/*    */     }
/* 27 */     return this.myrec.getField(this.fpos++);
/*    */   }
/*    */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.sockets.MessageEnumerator
 * JD-Core Version:    0.6.0
 */