/*     */ package com.activo.gateway.sockets;
/*     */ 
/*     */ import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Hashtable;
/*     */ 
/*     */ public class MessageContext
/*     */ {
/*  15 */   DataInputStream in = null;
/*  16 */   DataOutputStream out = null;
/*  17 */   String messagepackage = null;
/*  18 */   Hashtable classtable = new Hashtable();
/*     */ 
/*     */   public MessageContext()
/*     */   {
/*     */   }
/*     */ 
/*     */   public MessageContext(DataInputStream inputstream, DataOutputStream outputstream)
/*     */   {
/*  37 */     this.in = inputstream;
/*  38 */     this.out = outputstream;
/*     */   }
/*     */ 
/*     */   public MessageContext(DataInputStream inputstream, DataOutputStream outputstream, String packagename)
/*     */   {
/*  53 */     this.in = inputstream;
/*  54 */     this.out = outputstream;
/*  55 */     this.messagepackage = packagename;
/*     */   }
/*     */ 
/*     */   public MessageContext(String packagename)
/*     */   {
/*  65 */     this.messagepackage = packagename;
/*     */   }
/*     */ 
/*     */   public MessageRecord getMessageRecord(String formatname)
/*     */     throws ClassNotFoundException, IllegalAccessException, InstantiationException
/*     */   {
/*  86 */     ClassCache entry = (ClassCache)this.classtable.get(formatname);
/*     */ 
/*  88 */     if (entry == null)
/*     */     {
/*  90 */       entry = new ClassCache(this.messagepackage, formatname + "Message");
/*  91 */       this.classtable.put(formatname, entry);
/*     */     }
/*     */ 
/*  94 */     MessageRecord message = (MessageRecord)entry.getInstance();
/*  95 */     if (message != null) {
/*  96 */       message.setContext(this);
/*     */     }
/*  98 */     return message;
/*     */   }
/*     */ 
/*     */   public MessageRecord receiveMessage()
/*     */     throws IOException
/*     */   {
/* 111 */     return receiveMessage(this.in);
/*     */   }
/*     */ 
/*     */   public MessageRecord receiveMessage(DataInputStream inputstream)
/*     */     throws IOException
/*     */   {
/* 131 */     int length = inputstream.readShort();
/* 132 */     byte[] messagebytes = new byte[length];
/* 133 */     inputstream.readFully(messagebytes);

//System.out.println("Respuesta:");
//System.out.println(new String(messagebytes));
/*     */ 
/* 135 */     if (length < 10) {
/* 136 */       throw new IOException("Message length too short.");
/*     */     }
/* 138 */     String formatname = new String(messagebytes, 0, 10).trim();

MessageRecord message;

/*     */     try
/*     */     {
/* 142 */       message = getMessageRecord(formatname);
/*     */     }
/*     */     catch (Exception e)
/*     */     {

/* 146 */       throw new IOException("Message class error" + e);
/*     */     }
/*     */     
/* 149 */     if (message == null) {
/* 150 */       throw new IOException("Message format " + formatname + " not found.");
/*     */     }
/* 152 */     if (length > 10)
/*     */     {
/* 154 */       message.setMessageBytes(messagebytes);
/* 155 */       message.setEmpty(false);
/*     */     }
/*     */     else
/*     */     {
/* 159 */       message.setEmpty(true);
/*     */     }
/*     */ 
/* 162 */     return message;
/*     */   }
/*     */ 
/*     */   public void returnMessageRecord(MessageRecord message)
/*     */   {
/* 173 */     ClassCache entry = (ClassCache)this.classtable.get(message.getFormatName());
/* 174 */     if (entry != null)
/*     */     {
/* 176 */       message.initialize();
/* 177 */       entry.returnInstance(message);
/*     */     }
/*     */   }
/*     */ 
/*     */   public void sendMessage(MessageRecord message)
/*     */     throws IOException
/*     */   {
/* 189 */     message.send(this.out);
/*     */   }
/*     */ 
/*     */   public void setInputStream(DataInputStream inputstream)
/*     */   {
/* 198 */     this.in = inputstream;
/*     */   }
/*     */ 
/*     */   public void setOutputStream(DataOutputStream outputstream)
/*     */   {
/* 207 */     this.out = outputstream;
/*     */   }
/*     */ 
/*     */   public void setPackage(String packagename)
/*     */   {
/* 216 */     this.messagepackage = packagename;
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.sockets.MessageContext
 * JD-Core Version:    0.6.0
 */