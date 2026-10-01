/*     */ package com.activo.gateway.sockets;
/*     */ 
/*     */ public abstract class MessageField
/*     */ {
/*     */   byte[] bytes;
/*     */   int start;
/*     */   int length;
/*  12 */   String stringvalue = null;
/*  13 */   String tag = null;
/*     */   public static final int CHARACTERFIELD = 1;
/*     */   public static final int DECIMALFIELD = 2;
/*     */   public static final int ALIGNLEFT = 0;
/*     */   public static final int ALIGNRIGHT = 1;
/*     */ 
/*     */   public MessageField(byte[] messagebytes, int fieldstart, int fieldlength)
/*     */   {
/*  33 */     this.bytes = messagebytes;
/*  34 */     this.start = fieldstart;
/*  35 */     this.length = fieldlength;
/*     */   }
/*     */ 
/*     */   public MessageField(byte[] messagebytes, int fieldstart, int fieldlength, String fieldtag)
/*     */   {
/*  51 */     this(messagebytes, fieldstart, fieldlength);
/*  52 */     this.tag = fieldtag;
/*     */   }
/*     */ 
/*     */   public int getDecimals()
/*     */   {
/*  61 */     return -1;
/*     */   }
/*     */ 
/*     */   public int getLength()
/*     */   {
/*  71 */     return this.length;
/*     */   }
/*     */ 
/*     */   public String getString()
/*     */   {
/*  80 */     if (this.stringvalue == null) {
/*  81 */       this.stringvalue = makeString();
/*     */     }
/*  83 */     return this.stringvalue;
/*     */   }
/*     */ 
/*     */   public String getTag()
/*     */   {
/*  92 */     return this.tag;
/*     */   }
/*     */ 
/*     */   public abstract int getType();
/*     */ 
/*     */   public abstract void initialize();
/*     */ 
/*     */   public void initialize(byte value)
/*     */   {
/* 109 */     for (int i = 0; i < this.length; i++) {
/* 110 */       this.bytes[(i + this.start)] = value;
/*     */     }
/* 112 */     reset();
/*     */   }
/*     */ 
/*     */   abstract String makeString();
/*     */ 
/*     */   public void reset()
/*     */   {
/* 123 */     this.stringvalue = null;
/*     */   }
/*     */ 
/*     */   public void reset(byte[] messagebytes)
/*     */   {
/* 132 */     this.bytes = messagebytes;
/* 133 */     reset();
/*     */   }
/*     */ 
/*     */   public void setBytes(String newvalue, byte pad, int alignment)
/*     */     throws IllegalArgumentException
/*     */   {
/* 145 */     byte[] rawbytes = newvalue.getBytes();
/*     */ 
/* 147 */     if (alignment == 1)
/*     */     {
/* 149 */       int sourcepos = rawbytes.length - 1;
/* 150 */       int destpos = this.start + this.length - 1;
/*     */ 
/* 152 */       for (int i = 0; i < this.length; i++)
/* 153 */         this.bytes[(destpos - i)] = (i <= sourcepos ? rawbytes[(sourcepos - i)] : pad);
/*     */     }
/*     */     else
/*     */     {
/* 157 */       int rawlength = rawbytes.length;
/*     */ 
/* 159 */       for (int i = 0; i < this.length; i++) {
/* 160 */         this.bytes[(this.start + i)] = (i < rawlength ? rawbytes[i] : pad);
/*     */       }
/*     */     }
/* 163 */     this.stringvalue = null;
/*     */ 
/* 165 */     if (rawbytes.length > this.length)
/* 166 */       throw new IllegalArgumentException("Value too long for field");
/*     */   }
/*     */ 
/*     */   public void setMessageBytes(byte[] messagebytes)
/*     */   {
/* 175 */     this.bytes = messagebytes;
/* 176 */     reset();
/*     */   }
/*     */ 
/*     */   public abstract void setString(String paramString)
/*     */     throws IllegalArgumentException;
/*     */ 
/*     */   public void setTag(String fieldtag)
/*     */   {
/* 193 */     this.tag = fieldtag;
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.sockets.MessageField
 * JD-Core Version:    0.6.0
 */