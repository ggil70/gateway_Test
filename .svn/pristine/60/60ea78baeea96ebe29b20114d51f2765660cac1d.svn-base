/*     */ package com.activo.gateway.sockets;
/*     */ 
/*     */ import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
/*     */ 
/*     */ public abstract class MessageRecord
/*     */ {
/*  14 */   MessageContext mycontext = null;
/*  15 */   boolean isempty = false;
/*     */ 
/*  17 */   protected String formatname = null;
/*     */ 
/*  19 */   protected byte[] message = null;
/*     */ 
/*  21 */   protected MessageField[] fields = null;
/*     */ 
/*  23 */   protected String[] fieldnames = null;
/*     */ 
/*  25 */   protected String[] tagnames = null;
/*     */ 
/*  27 */   protected Hashtable taglookup = null;
/*     */ 
/*  29 */   protected int recordsize = 0;
/*     */ 
/*  31 */   protected String fileid = null;
/*     */ 
/*  33 */   protected String recordid = null;
/*     */ 
/*  36 */   protected final int FORMATNAMESIZE = 10;
/*     */ 
/*  38 */   protected final int HEADERSIZE = 10;
/*     */ 
/*     */   protected abstract void createFields();
/*     */ 
/*     */   public void destroy()
/*     */   {
/*  51 */     if (this.mycontext != null)
/*  52 */       this.mycontext.returnMessageRecord(this);
/*     */   }
/*     */ 
/*     */   public Enumeration fieldEnumeration()
/*     */   {
/*  61 */     return new MessageEnumerator(this);
/*     */   }
/*     */ 
/*     */   public int getByteLength()
/*     */   {
/*  70 */     return 10 + this.recordsize;
/*     */   }
/*     */ 
/*     */   public MessageField getField(int number)
/*     */   {
/*  81 */     return this.fields[number];
/*     */   }
/*     */ 
/*     */   public MessageField getField(String tag)
/*     */   {
/*  92 */     return (MessageField)this.taglookup.get(tag);
/*     */   }
/*     */ 
/*     */   public int getFieldCount()
/*     */   {
/* 101 */     return this.fields.length;
/*     */   }
/*     */ 
/*     */   public String getFieldString(String tag)
/*     */   {
/* 112 */     return getField(tag).getString();
/*     */   }
/*     */ 
/*     */   public String getFileID()
/*     */   {
/* 121 */     return this.fileid;
/*     */   }
/*     */ 
/*     */   public String getFormatName()
/*     */   {
/* 130 */     return this.formatname;
/*     */   }
/*     */ 
/*     */   public String getRecordLevelID()
/*     */   {
/* 139 */     return this.recordid;
/*     */   }
/*     */ 
/*     */   public void initialize()
/*     */   {
/* 146 */     if (this.message == null) {
/* 147 */       this.message = new byte[getByteLength()];
/*     */     }
/* 149 */     setFormatNameBytes();
/*     */ 
/* 151 */     if (this.tagnames == null)
/*     */     {
/* 153 */       this.tagnames = new String[this.fields.length];
/*     */ 
/* 155 */       for (int i = 0; i < this.fields.length; i++)
/*     */       {
/* 157 */         this.tagnames[i] = this.fieldnames[i];
/* 158 */         this.fields[i].setTag(this.tagnames[i]);
/*     */       }
/*     */     }
/*     */ 
/* 162 */     if (this.taglookup == null)
/*     */     {
/* 164 */       this.taglookup = new Hashtable(this.fields.length);
/* 165 */       for (int i = 0; i < this.fields.length; i++) {
/* 166 */         this.taglookup.put(this.tagnames[i], this.fields[i]);
/*     */       }
/*     */     }
/* 169 */     for (int i = 0; i < this.fields.length; i++)
/* 170 */       this.fields[i].initialize();
/*     */   }
/*     */ 
/*     */   public boolean isEmpty()
/*     */   {
/* 179 */     return this.isempty;
/*     */   }
/*     */ 
/*     */   public void reset()
/*     */   {
/* 186 */     for (int i = 0; i < this.fields.length; i++)
/* 187 */       this.fields[i].reset(this.message);
/*     */   }
/*     */ 
/*     */   public void send()
/*     */     throws IOException
/*     */   {
/* 196 */     if (this.mycontext != null)
/* 197 */       this.mycontext.sendMessage(this);
/*     */     else
/* 199 */       throw new IOException("No MessageContext set for this message.");
/*     */   }
/*     */ 
/*     */   public void send(DataOutputStream outputstream)
/*     */     throws IOException
/*     */   {
/* 210 */     if (this.message != null)
/*     */     {
/* 212 */       if (this.isempty)
/*     */       {
/* 214 */         outputstream.writeShort(10);
/* 215 */         outputstream.write(this.message, 0, 10);
/*     */       }
/*     */       else
/*     */       {
					//System.out.println("Peticion:");
					//System.out.println("tamaño: "+message.length);
					//System.out.println(new String(message));
/* 219 */         outputstream.writeShort(this.message.length);
/* 220 */         outputstream.write(this.message);
/*     */       }
/* 222 */       outputstream.flush();
/*     */     }
/*     */   }
/*     */ 
/*     */   public void setContext(MessageContext context)
/*     */   {
/* 233 */     this.mycontext = context;
/*     */   }
/*     */ 
/*     */   public void setEmpty(boolean emptystate)
/*     */   {
/* 242 */     this.isempty = emptystate;
/*     */   }
/*     */ 
/*     */   protected void setFormatNameBytes()
/*     */   {
/* 249 */     byte[] fbytes = this.formatname.getBytes();
/*     */ 
/* 251 */     for (int i = 0; i < 10; i++)
/* 252 */       this.message[i] = (i < fbytes.length ? fbytes[i] : 32);
/*     */   }
/*     */ 
/*     */   public void setMessageBytes(byte[] messagebytes)
/*     */     throws IOException
/*     */   {
/* 263 */     if (messagebytes.length != getByteLength()) {
/* 264 */       throw new IOException("Message length mismatch");
/*     */     }
/* 266 */     this.message = messagebytes;
/* 267 */     reset();
/*     */   }
/*     */ 
/*     */   public String toString()
/*     */   {
/* 277 */     StringBuffer sb = new StringBuffer(1000);
/*     */ 
/* 279 */     sb.append(this.formatname);
/* 280 */     sb.append("Message");
/*     */ 
/* 282 */     if (this.isempty) {
/* 283 */       sb.append(":Empty");
/*     */     }
/*     */     else {
/* 286 */       for (int i = 0; i < this.fields.length; i++)
/*     */       {
/* 288 */         sb.append(":");
/* 289 */         sb.append(this.fieldnames[i]);
/* 290 */         sb.append("=<");
/* 291 */         sb.append(this.fields[i].getString());
/* 292 */         sb.append(">");
/*     */       }
/*     */     }
/*     */ 
/* 296 */     return sb.toString();
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.sockets.MessageRecord
 * JD-Core Version:    0.6.0
 */