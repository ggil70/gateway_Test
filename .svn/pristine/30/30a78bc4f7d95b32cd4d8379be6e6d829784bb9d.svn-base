/*    */ package com.activo.gateway.dibs.messages;
/*    */ 
/*    */ import java.math.BigDecimal;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*    */ 
/*    */ public class IN096001Message extends MessageRecord
/*    */ {
/* 19 */   final int FIELDCOUNT = 2;
/* 20 */   private CharacterField fieldIN96USER = null;
/* 21 */   private DecimalField fieldIN96ACCNUM = null;
/*    */ 
/*    */   public IN096001Message()
/*    */   {
/* 28 */     createFields();
/* 29 */     initialize();
/*    */   }
/*    */ 
/*    */   protected void createFields()
/*    */   {
/* 37 */     this.recordsize = 23;
/* 38 */     this.fileid = "1000907151911";
/* 39 */     this.recordid = "441779BD9272D";
/* 40 */     this.message = new byte[getByteLength()];
/* 41 */     this.formatname = "IN096001";
/* 42 */     this.fieldnames = new String[2];
/* 43 */     this.tagnames = new String[2];
/* 44 */     this.fields = new MessageField[2];
/*    */ 
/* 46 */     this.fieldnames[0] = "IN96USER";
/* 47 */     this.tagnames[0] = "IN96USER";
/*    */      this.fields[0]=this.fieldIN96USER=new CharacterField(this.message, 10, 10, "IN96USER");
/*    */ 
/* 50 */     this.fieldnames[1] = "IN96ACCNUM";
/* 51 */     this.tagnames[1] = "IN96ACCNUM";
/*    */      this.fields[1]=this.fieldIN96ACCNUM=new DecimalField(this.message, 20, 13, 0, "IN96ACCNUM");
/*    */   }
/*    */ 
/*    */   public BigDecimal getBigDecimalIN96ACCNUM()
/*    */   {
/* 60 */     return this.fieldIN96ACCNUM.getBigDecimal();
/*    */   }
/*    */ 
/*    */   public String getIN96ACCNUM()
/*    */   {
/* 67 */     return this.fieldIN96ACCNUM.getString();
/*    */   }
/*    */ 
/*    */   public String getIN96USER()
/*    */   {
/* 74 */     return this.fieldIN96USER.getString();
/*    */   }
/*    */ 
/*    */   public void setIN96ACCNUM(String newvalue)
/*    */   {
/* 81 */     this.fieldIN96ACCNUM.setString(newvalue);
/*    */   }
/*    */ 
/*    */   public void setIN96ACCNUM(BigDecimal newvalue)
/*    */   {
/* 88 */     this.fieldIN96ACCNUM.setBigDecimal(newvalue);
/*    */   }
/*    */ 
/*    */   public void setIN96USER(String newvalue)
/*    */   {
/* 95 */     this.fieldIN96USER.setString(newvalue);
/*    */   }
/*    */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.IN096001Message
 * JD-Core Version:    0.6.0
 */