/*    */ package com.activo.gateway.dibs.messages;
/*    */ 
/*    */ import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*    */ 
/*    */ public class PRO22DSJVMessage extends MessageRecord
/*    */ {
/* 16 */   final int FIELDCOUNT = 2;
/* 17 */   private CharacterField fieldP22USR = null;
/* 18 */   private CharacterField fieldP22FLG = null;
/*    */ 
/*    */   public PRO22DSJVMessage()
/*    */   {
/* 25 */     createFields();
/* 26 */     initialize();
/*    */   }
/*    */ 
/*    */   protected void createFields()
/*    */   {
/* 35 */     this.recordsize = 11;
/* 36 */     this.fileid = "1030218162905";
/* 37 */     this.recordid = "2AEAEDF829B80";
/* 38 */     this.message = new byte[getByteLength()];
/* 39 */     this.formatname = "PRO22DSJV";
/* 40 */     this.fieldnames = new String[2];
/* 41 */     this.tagnames = new String[2];
/* 42 */     this.fields = new MessageField[2];
/*    */ 
/* 44 */     this.fieldnames[0] = "P22USR";
/* 45 */     this.tagnames[0] = "P22USR";
/*    */      this.fields[0]=this.fieldP22USR=new CharacterField(this.message, 10, 10, "P22USR");
/*    */ 
/* 48 */     this.fieldnames[1] = "P22FLG";
/* 49 */     this.tagnames[1] = "P22FLG";
/*    */      this.fields[1]=this.fieldP22FLG=new CharacterField(this.message, 20, 1, "P22FLG");
/*    */   }
/*    */ 
/*    */   public void setP22USR(String newvalue)
/*    */   {
/* 59 */     this.fieldP22USR.setString(newvalue);
/*    */   }
/*    */ 
/*    */   public String getP22USR()
/*    */   {
/* 67 */     return this.fieldP22USR.getString();
/*    */   }
/*    */ 
/*    */   public void setP22FLG(String newvalue)
/*    */   {
/* 75 */     this.fieldP22FLG.setString(newvalue);
/*    */   }
/*    */ 
/*    */   public String getP22FLG()
/*    */   {
/* 83 */     return this.fieldP22FLG.getString();
/*    */   }
/*    */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.PRO22DSJVMessage
 * JD-Core Version:    0.6.0
 */