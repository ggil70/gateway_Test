/*     */ package com.activo.gateway.dibs.messages;
/*     */ 
/*     */ import java.math.BigDecimal;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*     */ 
/*     */ public class ECLI00101Message extends MessageRecord
/*     */ {
/*  16 */   final int FIELDCOUNT = 16;
/*  17 */   private CharacterField fieldH01USR = null;
/*  18 */   private CharacterField fieldH01PGM = null;
/*  19 */   private CharacterField fieldH01TIM = null;
/*  20 */   private CharacterField fieldH01SCR = null;
/*  21 */   private CharacterField fieldH01OPE = null;
/*  22 */   private CharacterField fieldH01MAS = null;
/*  23 */   private CharacterField fieldH01WK1 = null;
/*  24 */   private CharacterField fieldH01WK2 = null;
/*  25 */   private CharacterField fieldH01WK3 = null;
/*  26 */   private DecimalField fieldE01CUN = null;
/*  27 */   private CharacterField fieldE01NA1 = null;
/*  28 */   private CharacterField fieldE01NA2 = null;
/*  29 */   private CharacterField fieldE01NA3 = null;
/*  30 */   private CharacterField fieldE01NA4 = null;
/*  31 */   private CharacterField fieldE01CTY = null;
/*  32 */   private CharacterField fieldE01CTR = null;
/*     */ 
/*     */   public ECLI00101Message()
/*     */   {
/*  39 */     createFields();
/*  40 */     initialize();
/*  41 */     setFormatNameBytes();
/*     */   }
/*     */ 
/*     */   protected void createFields()
/*     */   {
/*  49 */     this.recordsize = 252;
/*  50 */     this.message = new byte[getByteLength()];
/*  51 */     this.formatname = "ECLI00101";
/*  52 */     this.fieldnames = new String[16];
/*  53 */     this.fields = new MessageField[16];
/*     */ 
/*  55 */     this.fieldnames[0] = "H01USR";
/*     */      this.fields[0]=this.fieldH01USR=new CharacterField(this.message, 10, 10);
/*     */ 
/*  58 */     this.fieldnames[1] = "H01PGM";
/*     */      this.fields[1]=this.fieldH01PGM=new CharacterField(this.message, 20, 10);
/*     */ 
/*  61 */     this.fieldnames[2] = "H01TIM";
/*     */      this.fields[2]=this.fieldH01TIM=new CharacterField(this.message, 30, 12);
/*     */ 
/*  64 */     this.fieldnames[3] = "H01SCR";
/*     */      this.fields[3]=this.fieldH01SCR=new CharacterField(this.message, 42, 2);
/*     */ 
/*  67 */     this.fieldnames[4] = "H01OPE";
/*     */      this.fields[4]=this.fieldH01OPE=new CharacterField(this.message, 44, 4);
/*     */ 
/*  70 */     this.fieldnames[5] = "H01MAS";
/*     */      this.fields[5]=this.fieldH01MAS=new CharacterField(this.message, 48, 1);
/*     */ 
/*  73 */     this.fieldnames[6] = "H01WK1";
/*     */      this.fields[6]=this.fieldH01WK1=new CharacterField(this.message, 49, 1);
/*     */ 
/*  76 */     this.fieldnames[7] = "H01WK2";
/*     */      this.fields[7]=this.fieldH01WK2=new CharacterField(this.message, 50, 1);
/*     */ 
/*  79 */     this.fieldnames[8] = "H01WK3";
/*     */      this.fields[8]=this.fieldH01WK3=new CharacterField(this.message, 51, 1);
/*     */ 
/*  82 */     this.fieldnames[9] = "E01CUN";
/*     */      this.fields[9]=this.fieldE01CUN=new DecimalField(this.message, 52, 10, 0);
/*     */ 
/*  85 */     this.fieldnames[10] = "E01NA1";
/*     */      this.fields[10]=this.fieldE01NA1=new CharacterField(this.message, 62, 45);
/*     */ 
/*  88 */     this.fieldnames[11] = "E01NA2";
/*     */      this.fields[11]=this.fieldE01NA2=new CharacterField(this.message, 107, 35);
/*     */ 
/*  91 */     this.fieldnames[12] = "E01NA3";
/*     */      this.fields[12]=this.fieldE01NA3=new CharacterField(this.message, 142, 35);
/*     */ 
/*  94 */     this.fieldnames[13] = "E01NA4";
/*     */      this.fields[13]=this.fieldE01NA4=new CharacterField(this.message, 177, 35);
/*     */ 
/*  97 */     this.fieldnames[14] = "E01CTY";
/*     */      this.fields[14]=this.fieldE01CTY=new CharacterField(this.message, 212, 30);
/*     */ 
/* 100 */     this.fieldnames[15] = "E01CTR";
/*     */      this.fields[15]=this.fieldE01CTR=new CharacterField(this.message, 242, 20);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalE01CUN()
/*     */   {
/* 109 */     return this.fieldE01CUN.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public String getE01CTR()
/*     */   {
/* 116 */     return this.fieldE01CTR.getString();
/*     */   }
/*     */ 
/*     */   public String getE01CTY()
/*     */   {
/* 123 */     return this.fieldE01CTY.getString();
/*     */   }
/*     */ 
/*     */   public String getE01CUN()
/*     */   {
/* 130 */     return this.fieldE01CUN.getString();
/*     */   }
/*     */ 
/*     */   public String getE01NA1()
/*     */   {
/* 137 */     return this.fieldE01NA1.getString();
/*     */   }
/*     */ 
/*     */   public String getE01NA2()
/*     */   {
/* 144 */     return this.fieldE01NA2.getString();
/*     */   }
/*     */ 
/*     */   public String getE01NA3()
/*     */   {
/* 151 */     return this.fieldE01NA3.getString();
/*     */   }
/*     */ 
/*     */   public String getE01NA4()
/*     */   {
/* 158 */     return this.fieldE01NA4.getString();
/*     */   }
/*     */ 
/*     */   public String getH01MAS()
/*     */   {
/* 165 */     return this.fieldH01MAS.getString();
/*     */   }
/*     */ 
/*     */   public String getH01OPE()
/*     */   {
/* 172 */     return this.fieldH01OPE.getString();
/*     */   }
/*     */ 
/*     */   public String getH01PGM()
/*     */   {
/* 179 */     return this.fieldH01PGM.getString();
/*     */   }
/*     */ 
/*     */   public String getH01SCR()
/*     */   {
/* 186 */     return this.fieldH01SCR.getString();
/*     */   }
/*     */ 
/*     */   public String getH01TIM()
/*     */   {
/* 193 */     return this.fieldH01TIM.getString();
/*     */   }
/*     */ 
/*     */   public String getH01USR()
/*     */   {
/* 200 */     return this.fieldH01USR.getString();
/*     */   }
/*     */ 
/*     */   public String getH01WK1()
/*     */   {
/* 207 */     return this.fieldH01WK1.getString();
/*     */   }
/*     */ 
/*     */   public String getH01WK2()
/*     */   {
/* 214 */     return this.fieldH01WK2.getString();
/*     */   }
/*     */ 
/*     */   public String getH01WK3()
/*     */   {
/* 221 */     return this.fieldH01WK3.getString();
/*     */   }
/*     */ 
/*     */   public void setE01CTR(String newvalue)
/*     */   {
/* 228 */     this.fieldE01CTR.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setE01CTY(String newvalue)
/*     */   {
/* 235 */     this.fieldE01CTY.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setE01CUN(String newvalue)
/*     */   {
/* 242 */     this.fieldE01CUN.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setE01CUN(BigDecimal newvalue)
/*     */   {
/* 249 */     this.fieldE01CUN.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setE01NA1(String newvalue)
/*     */   {
/* 256 */     this.fieldE01NA1.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setE01NA2(String newvalue)
/*     */   {
/* 263 */     this.fieldE01NA2.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setE01NA3(String newvalue)
/*     */   {
/* 270 */     this.fieldE01NA3.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setE01NA4(String newvalue)
/*     */   {
/* 277 */     this.fieldE01NA4.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setH01MAS(String newvalue)
/*     */   {
/* 284 */     this.fieldH01MAS.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setH01OPE(String newvalue)
/*     */   {
/* 291 */     this.fieldH01OPE.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setH01PGM(String newvalue)
/*     */   {
/* 298 */     this.fieldH01PGM.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setH01SCR(String newvalue)
/*     */   {
/* 305 */     this.fieldH01SCR.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setH01TIM(String newvalue)
/*     */   {
/* 312 */     this.fieldH01TIM.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setH01USR(String newvalue)
/*     */   {
/* 319 */     this.fieldH01USR.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setH01WK1(String newvalue)
/*     */   {
/* 326 */     this.fieldH01WK1.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setH01WK2(String newvalue)
/*     */   {
/* 333 */     this.fieldH01WK2.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setH01WK3(String newvalue)
/*     */   {
/* 340 */     this.fieldH01WK3.setString(newvalue);
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.ECLI00101Message
 * JD-Core Version:    0.6.0
 */