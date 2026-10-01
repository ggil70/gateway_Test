/*     */ package com.activo.gateway.sockets;
/*     */ 
/*     */ import java.math.BigDecimal;
/*     */ 
/*     */ public class DecimalField extends MessageField
/*     */ {
/*  12 */   BigDecimal decimalvalue = null;
/*     */   int decimals;
/*     */ 
/*     */   public DecimalField(byte[] messagebytes, int fieldstart, int fieldlength, int fielddecimals)
/*     */   {
/*  28 */     super(messagebytes, fieldstart, fieldlength);
/*  29 */     this.decimals = fielddecimals;
/*     */   }
/*     */ 
/*     */   public DecimalField(byte[] messagebytes, int fieldstart, int fieldlength, int fielddecimals, String fieldtag)
/*     */   {
/*  46 */     super(messagebytes, fieldstart, fieldlength, fieldtag);
/*  47 */     this.decimals = fielddecimals;
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimal()
/*     */   {
/*  56 */     if (this.decimalvalue == null) {
/*  57 */       this.decimalvalue = new BigDecimal(new String(this.bytes, this.start, this.length).trim());
/*     */     }
/*  59 */     return this.decimalvalue;
/*     */   }
/*     */ 
/*     */   public int getDecimals()
/*     */   {
/*  68 */     return this.decimals;
/*     */   }
/*     */ 
/*     */   public int getLength()
/*     */   {
/*  79 */     return this.length - 1 - (this.decimals > 0 ? 1 : 0);
/*     */   }
/*     */ 
/*     */   public int getType()
/*     */   {
/*  88 */     return 2;
/*     */   }
/*     */ 
/*     */   public void initialize()
/*     */   {
/*  95 */     initialize((byte)48);
/*  96 */     this.bytes[this.start] = 32;
/*  97 */     if (this.decimals != 0)
/*  98 */       this.bytes[(this.start + this.length - this.decimals - 1)] = 46;
/*     */   }
/*     */ 
/*     */   public String makeString()
/*     */   {
/* 107 */     return getBigDecimal().toString();
/*     */   }
/*     */ 
/*     */   public void reset()
/*     */   {
/* 114 */     super.reset();
/* 115 */     this.decimalvalue = null;
/*     */   }
/*     */ 
/*     */   public void setBigDecimal(BigDecimal value)
/*     */     throws NumberFormatException
/*     */   {
/* 128 */     if (value.scale() == this.decimals)
/* 129 */       this.decimalvalue = value;
/*     */     else {
/* 131 */       this.decimalvalue = value.setScale(this.decimals, 6);
/*     */     }
/* 133 */     String svalue = this.decimalvalue.toString();
/* 134 */     if (svalue.length() > this.length)
/*     */     {
/* 136 */       initialize();
/* 137 */       throw new NumberFormatException("Number too large for field");
/*     */     }
/*     */ 
/* 140 */     setBytes(svalue, (byte)32, 1);
/*     */   }
/*     */ 
/*     */   public void setString(String newvalue)
/*     */     throws IllegalArgumentException
/*     */   {
/* 151 */     setBigDecimal(new BigDecimal(newvalue));
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.sockets.DecimalField
 * JD-Core Version:    0.6.0
 */