/*    */ package com.activo.gateway.sockets;
/*    */ 
/*    */ public class CharacterField extends MessageField
/*    */ {
/*    */   public CharacterField(byte[] messagebytes, int fieldstart, int fieldlength)
/*    */   {
/* 22 */     super(messagebytes, fieldstart, fieldlength);
/*    */   }
/*    */ 
/*    */   public CharacterField(byte[] messagebytes, int fieldstart, int fieldlength, String fieldtag)
/*    */   {
/* 37 */     super(messagebytes, fieldstart, fieldlength, fieldtag);
/*    */   }
/*    */ 
/*    */   public int getType()
/*    */   {
/* 46 */     return 1;
/*    */   }
/*    */ 
/*    */   public void initialize()
/*    */   {
/* 53 */     initialize((byte)32);
/*    */   }
/*    */ 
/*    */   String makeString()
/*    */   {
/* 62 */     return new String(this.bytes, this.start, this.length);
/*    */   }
/*    */ 
/*    */   public void setString(String newvalue)
/*    */     throws IllegalArgumentException
/*    */   {
/* 73 */     setBytes(newvalue, (byte)32, 0);
/*    */   }
/*    */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.sockets.CharacterField
 * JD-Core Version:    0.6.0
 */