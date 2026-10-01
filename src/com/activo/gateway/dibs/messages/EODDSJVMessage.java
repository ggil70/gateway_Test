/*    */ package com.activo.gateway.dibs.messages;
/*    */ 
/*    */ import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*    */ 
/*    */ public class EODDSJVMessage extends MessageRecord
/*    */ {
/* 45 */   final int FIELDCOUNT = 1;
/*    */   private CharacterField fieldEODFLG;
/*    */ 
/*    */   public EODDSJVMessage()
/*    */   {
/* 15 */     this.fieldEODFLG = null;
/* 16 */     createFields();
/* 17 */     initialize();
/*    */   }
/*    */ 
/*    */   protected void createFields()
/*    */   {
/* 22 */     this.recordsize = 1;
/* 23 */     this.fileid = "1000811185246";
/* 24 */     this.recordid = "3592B69C24D82";
/* 25 */     this.message = new byte[getByteLength()];
/* 26 */     this.formatname = "EODDSJV";
/* 27 */     this.fieldnames = new String[1];
/* 28 */     this.tagnames = new String[1];
/* 29 */     this.fields = new MessageField[1];
/* 30 */     this.fieldnames[0] = "EODFLG";
/* 31 */     this.tagnames[0] = "EODFLG";
/*    */      this.fields[0]=this.fieldEODFLG=new CharacterField(this.message, 10, 1, "EODFLG");
/*    */   }
/*    */ 
/*    */   public String getEODFLG()
/*    */   {
/* 37 */     return this.fieldEODFLG.getString();
/*    */   }
/*    */ 
/*    */   public void setEODFLG(String newvalue)
/*    */   {
/* 42 */     this.fieldEODFLG.setString(newvalue);
/*    */   }
/*    */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.EODDSJVMessage
 * JD-Core Version:    0.6.0
 */