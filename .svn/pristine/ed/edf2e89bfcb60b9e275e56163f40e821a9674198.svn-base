/*    */ package com.activo.gateway.dibs.messages;
/*    */ 
/*    */ import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*    */ 
/*    */ public class IN096002Message extends MessageRecord
/*    */ {
/* 16 */   final int FIELDCOUNT = 3;
/* 17 */   private CharacterField fieldIN962USR = null;
/* 18 */   private CharacterField fieldIN962CCNUM = null;
/* 19 */   private CharacterField fieldIN962CCTYP = null;
/*    */ 
/*    */   public IN096002Message()
/*    */   {
/* 26 */     createFields();
/* 27 */     initialize();
/*    */   }
/*    */ 
/*    */   protected void createFields()
/*    */   {
/* 35 */     this.recordsize = 29;
/* 36 */     this.fileid = "1000907151911";
/* 37 */     this.recordid = "42C1D91D792FF";
/* 38 */     this.message = new byte[getByteLength()];
/* 39 */     this.formatname = "IN096002";
/* 40 */     this.fieldnames = new String[3];
/* 41 */     this.tagnames = new String[3];
/* 42 */     this.fields = new MessageField[3];
/*    */ 
/* 44 */     this.fieldnames[0] = "IN962USR";
/* 45 */     this.tagnames[0] = "IN962USR";
/*    */      this.fields[0]=this.fieldIN962USR=new CharacterField(this.message, 10, 10, "IN962USR");
/*    */ 
/* 48 */     this.fieldnames[1] = "IN962CCNUM";
/* 49 */     this.tagnames[1] = "IN962CCNUM";
/*    */      this.fields[1]=this.fieldIN962CCNUM=new CharacterField(this.message, 20, 17, "IN962CCNUM");
/*    */ 
/* 52 */     this.fieldnames[2] = "IN962CCTYP";
/* 53 */     this.tagnames[2] = "IN962CCTYP";
/*    */      this.fields[2]=this.fieldIN962CCTYP=new CharacterField(this.message, 37, 2, "IN962CCTYP");
/*    */   }
/*    */ 
/*    */   public String getIN962CCNUM()
/*    */   {
/* 62 */     return this.fieldIN962CCNUM.getString();
/*    */   }
/*    */ 
/*    */   public String getIN962CCTYP()
/*    */   {
/* 69 */     return this.fieldIN962CCTYP.getString();
/*    */   }
/*    */ 
/*    */   public String getIN962USR()
/*    */   {
/* 76 */     return this.fieldIN962USR.getString();
/*    */   }
/*    */ 
/*    */   public void setIN962CCNUM(String newvalue)
/*    */   {
/* 83 */     this.fieldIN962CCNUM.setString(newvalue);
/*    */   }
/*    */ 
/*    */   public void setIN962CCTYP(String newvalue)
/*    */   {
/* 90 */     this.fieldIN962CCTYP.setString(newvalue);
/*    */   }
/*    */ 
/*    */   public void setIN962USR(String newvalue)
/*    */   {
/* 97 */     this.fieldIN962USR.setString(newvalue);
/*    */   }
/*    */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.IN096002Message
 * JD-Core Version:    0.6.0
 */