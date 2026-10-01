/*     */ package com.activo.gateway.dibs.messages;
/*     */ 
/*     */ import java.math.BigDecimal;
import java.util.Hashtable;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*     */ 
/*     */ public class SUMDSJVMessage extends MessageRecord
/*     */ {
/* 193 */   static final String[] fldnames = { 
/* 194 */     "SUMUSR", "SUMFLG", "SUMTYP", "SUMDSC", "SUMACN", "SUMBAL", "SUMAVB", "SUMCCY", "SUMNNM", "SUMFIR" };
/*     */ 
/* 196 */   static final String[] tnames = { 
/* 197 */     "SUMUSR", "SUMFLG", "SUMTYP", "SUMDSC", "SUMACN", "SUMBAL", "SUMAVB", "SUMCCY", "SUMNNM", "SUMFIR" };
/*     */   static final String fid = "1060316094032";
/*     */   static final String rid = "36661EC088C99";
/*     */   static final String fmtname = "SUMDSJV";
/* 202 */   final int FIELDCOUNT = 10;
/* 203 */   private static Hashtable tlookup = new Hashtable();
/*     */   private CharacterField fieldSUMUSR;
/*     */   private DecimalField fieldSUMFLG;
/*     */   private CharacterField fieldSUMTYP;
/*     */   private CharacterField fieldSUMDSC;
/*     */   private CharacterField fieldSUMACN;
/*     */   private DecimalField fieldSUMBAL;
/*     */   private DecimalField fieldSUMAVB;
/*     */   private CharacterField fieldSUMCCY;
/*     */   private CharacterField fieldSUMNNM;
/*     */   private CharacterField fieldSUMFIR;
/*     */ 
/*     */   public SUMDSJVMessage()
/*     */   {
/*  17 */     this.fieldSUMUSR = null;
/*  18 */     this.fieldSUMFLG = null;
/*  19 */     this.fieldSUMTYP = null;
/*  20 */     this.fieldSUMDSC = null;
/*  21 */     this.fieldSUMACN = null;
/*  22 */     this.fieldSUMBAL = null;
/*  23 */     this.fieldSUMAVB = null;
/*  24 */     this.fieldSUMCCY = null;
/*  25 */     this.fieldSUMNNM = null;
/*  26 */     this.fieldSUMFIR = null;
/*  27 */     createFields();
/*  28 */     initialize();
/*     */   }
/*     */ 
/*     */   protected void createFields()
/*     */   {
/*  33 */     this.recordsize = 134;
/*  34 */     this.fileid = "1060316094032";
/*  35 */     this.recordid = "36661EC088C99";
/*  36 */     this.message = new byte[getByteLength()];
/*  37 */     this.formatname = "SUMDSJV";
/*  38 */     this.fieldnames = fldnames;
/*  39 */     this.tagnames = tnames;
/*  40 */     this.fields = new MessageField[10];
/*     */      this.fields[0]=this.fieldSUMUSR=new CharacterField(this.message, 10, 10, "SUMUSR");
/*     */      this.fields[1]=this.fieldSUMFLG=new DecimalField(this.message, 20, 3, 0, "SUMFLG");
/*     */      this.fields[2]=this.fieldSUMTYP=new CharacterField(this.message, 23, 3, "SUMTYP");
/*     */      this.fields[3]=this.fieldSUMDSC=new CharacterField(this.message, 26, 30, "SUMDSC");
/*     */      this.fields[4]=this.fieldSUMACN=new CharacterField(this.message, 56, 20, "SUMACN");
/*     */      this.fields[5]=this.fieldSUMBAL=new DecimalField(this.message, 76, 17, 2, "SUMBAL");
/*     */      this.fields[6]=this.fieldSUMAVB=new DecimalField(this.message, 93, 17, 2, "SUMAVB");
/*     */      this.fields[7]=this.fieldSUMCCY=new CharacterField(this.message, 110, 3, "SUMCCY");
/*     */      this.fields[8]=this.fieldSUMNNM=new CharacterField(this.message, 113, 30, "SUMNNM");
/*     */      this.fields[9]=this.fieldSUMFIR=new CharacterField(this.message, 143, 1, "SUMFIR");
/*  51 */     synchronized (tlookup)
/*     */     {
/*  53 */       if (tlookup.isEmpty())
/*     */       {
/*  55 */         for (int i = 0; i < tnames.length; i++) {
/*  56 */           tlookup.put(tnames[i], new Integer(i));
/*     */         }
/*     */       }
/*     */     }
/*  60 */     this.taglookup = tlookup;
/*     */   }
/*     */ 
/*     */   public void setSUMUSR(String newvalue)
/*     */   {
/*  65 */     this.fieldSUMUSR.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getSUMUSR()
/*     */   {
/*  70 */     return this.fieldSUMUSR.getString();
/*     */   }
/*     */ 
/*     */   public void setSUMFLG(String newvalue)
/*     */   {
/*  75 */     this.fieldSUMFLG.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getSUMFLG()
/*     */   {
/*  80 */     return this.fieldSUMFLG.getString();
/*     */   }
/*     */ 
/*     */   public void setSUMFLG(BigDecimal newvalue)
/*     */   {
/*  85 */     this.fieldSUMFLG.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalSUMFLG()
/*     */   {
/*  90 */     return this.fieldSUMFLG.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setSUMTYP(String newvalue)
/*     */   {
/*  95 */     this.fieldSUMTYP.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getSUMTYP()
/*     */   {
/* 100 */     return this.fieldSUMTYP.getString();
/*     */   }
/*     */ 
/*     */   public void setSUMDSC(String newvalue)
/*     */   {
/* 105 */     this.fieldSUMDSC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getSUMDSC()
/*     */   {
/* 110 */     return this.fieldSUMDSC.getString();
/*     */   }
/*     */ 
/*     */   public void setSUMACN(String newvalue)
/*     */   {
/* 115 */     this.fieldSUMACN.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getSUMACN()
/*     */   {
/* 120 */     return this.fieldSUMACN.getString();
/*     */   }
/*     */ 
/*     */   public void setSUMBAL(String newvalue)
/*     */   {
/* 125 */     this.fieldSUMBAL.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getSUMBAL()
/*     */   {
/* 130 */     return this.fieldSUMBAL.getString();
/*     */   }
/*     */ 
/*     */   public void setSUMBAL(BigDecimal newvalue)
/*     */   {
/* 135 */     this.fieldSUMBAL.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalSUMBAL()
/*     */   {
/* 140 */     return this.fieldSUMBAL.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setSUMAVB(String newvalue)
/*     */   {
/* 145 */     this.fieldSUMAVB.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getSUMAVB()
/*     */   {
/* 150 */     return this.fieldSUMAVB.getString();
/*     */   }
/*     */ 
/*     */   public void setSUMAVB(BigDecimal newvalue)
/*     */   {
/* 155 */     this.fieldSUMAVB.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalSUMAVB()
/*     */   {
/* 160 */     return this.fieldSUMAVB.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setSUMCCY(String newvalue)
/*     */   {
/* 165 */     this.fieldSUMCCY.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getSUMCCY()
/*     */   {
/* 170 */     return this.fieldSUMCCY.getString();
/*     */   }
/*     */ 
/*     */   public void setSUMNNM(String newvalue)
/*     */   {
/* 175 */     this.fieldSUMNNM.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getSUMNNM()
/*     */   {
/* 180 */     return this.fieldSUMNNM.getString();
/*     */   }
/*     */ 
/*     */   public void setSUMFIR(String newvalue)
/*     */   {
/* 185 */     this.fieldSUMFIR.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getSUMFIR()
/*     */   {
/* 190 */     return this.fieldSUMFIR.getString();
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.SUMDSJVMessage
 * JD-Core Version:    0.6.0
 */