/*     */ package com.activo.gateway.dibs.messages;
/*     */ 
/*     */ import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*     */ 
/*     */ public class PRDLCDSJVMessage extends MessageRecord
/*     */ {
/*  16 */   final int FIELDCOUNT = 11;
/*  17 */   private CharacterField fieldPRDUSR = null;
/*  18 */   private CharacterField fieldPRDKEY = null;
/*  19 */   private CharacterField fieldPRDATY = null;
/*  20 */   private CharacterField fieldPRDPRD = null;
/*  21 */   private CharacterField fieldPRDSNM = null;
/*  22 */   private CharacterField fieldPRDTYP = null;
/*  23 */   private CharacterField fieldPRDAOB = null;
/*  24 */   private CharacterField fieldPRDTRN = null;
/*  25 */   private CharacterField fieldPRDCNF = null;
/*  26 */   private CharacterField fieldPRDPSH = null;
/*  27 */   private CharacterField fieldPRDTSH = null;
/*     */ 
/*     */   public PRDLCDSJVMessage()
/*     */   {
/*  34 */     createFields();
/*  35 */     initialize();
/*     */   }
/*     */ 
/*     */   protected void createFields()
/*     */   {
/*  43 */     this.recordsize = 47;
/*  44 */     this.fileid = "1000802211902";
/*  45 */     this.recordid = "4032B6AA0A017";
/*  46 */     this.message = new byte[getByteLength()];
/*  47 */     this.formatname = "PRDLCDSJV";
/*  48 */     this.fieldnames = new String[11];
/*  49 */     this.tagnames = new String[11];
/*  50 */     this.fields = new MessageField[11];
/*     */ 
/*  52 */     this.fieldnames[0] = "PRDUSR";
/*  53 */     this.tagnames[0] = "PRDUSR";
/*     */      this.fields[0]=this.fieldPRDUSR=new CharacterField(this.message, 10, 10, "PRDUSR");
/*     */ 
/*  56 */     this.fieldnames[1] = "PRDKEY";
/*  57 */     this.tagnames[1] = "PRDKEY";
/*     */      this.fields[1]=this.fieldPRDKEY=new CharacterField(this.message, 20, 9, "PRDKEY");
/*     */ 
/*  60 */     this.fieldnames[2] = "PRDATY";
/*  61 */     this.tagnames[2] = "PRDATY";
/*     */      this.fields[2]=this.fieldPRDATY=new CharacterField(this.message, 29, 3, "PRDATY");
/*     */ 
/*  64 */     this.fieldnames[3] = "PRDPRD";
/*  65 */     this.tagnames[3] = "PRDPRD";
/*     */      this.fields[3]=this.fieldPRDPRD=new CharacterField(this.message, 32, 4, "PRDPRD");
/*     */ 
/*  68 */     this.fieldnames[4] = "PRDSNM";
/*  69 */     this.tagnames[4] = "PRDSNM";
/*     */      this.fields[4]=this.fieldPRDSNM=new CharacterField(this.message, 36, 15, "PRDSNM");
/*     */ 
/*  72 */     this.fieldnames[5] = "PRDTYP";
/*  73 */     this.tagnames[5] = "PRDTYP";
/*     */      this.fields[5]=this.fieldPRDTYP=new CharacterField(this.message, 51, 1, "PRDTYP");
/*     */ 
/*  76 */     this.fieldnames[6] = "PRDAOB";
/*  77 */     this.tagnames[6] = "PRDAOB";
/*     */      this.fields[6]=this.fieldPRDAOB=new CharacterField(this.message, 52, 1, "PRDAOB");
/*     */ 
/*  80 */     this.fieldnames[7] = "PRDTRN";
/*  81 */     this.tagnames[7] = "PRDTRN";
/*     */      this.fields[7]=this.fieldPRDTRN=new CharacterField(this.message, 53, 1, "PRDTRN");
/*     */ 
/*  84 */     this.fieldnames[8] = "PRDCNF";
/*  85 */     this.tagnames[8] = "PRDCNF";
/*     */      this.fields[8]=this.fieldPRDCNF=new CharacterField(this.message, 54, 1, "PRDCNF");
/*     */ 
/*  88 */     this.fieldnames[9] = "PRDPSH";
/*  89 */     this.tagnames[9] = "PRDPSH";
/*     */      this.fields[9]=this.fieldPRDPSH=new CharacterField(this.message, 55, 1, "PRDPSH");
/*     */ 
/*  92 */     this.fieldnames[10] = "PRDTSH";
/*  93 */     this.tagnames[10] = "PRDTSH";
/*     */      this.fields[10]=this.fieldPRDTSH=new CharacterField(this.message, 56, 1, "PRDTSH");
/*     */   }
/*     */ 
/*     */   public String getPRDAOB()
/*     */   {
/* 102 */     return this.fieldPRDAOB.getString();
/*     */   }
/*     */ 
/*     */   public String getPRDATY()
/*     */   {
/* 109 */     return this.fieldPRDATY.getString();
/*     */   }
/*     */ 
/*     */   public String getPRDCNF()
/*     */   {
/* 116 */     return this.fieldPRDCNF.getString();
/*     */   }
/*     */ 
/*     */   public String getPRDKEY()
/*     */   {
/* 123 */     return this.fieldPRDKEY.getString();
/*     */   }
/*     */ 
/*     */   public String getPRDPRD()
/*     */   {
/* 130 */     return this.fieldPRDPRD.getString();
/*     */   }
/*     */ 
/*     */   public String getPRDPSH()
/*     */   {
/* 137 */     return this.fieldPRDPSH.getString();
/*     */   }
/*     */ 
/*     */   public String getPRDSNM()
/*     */   {
/* 144 */     return this.fieldPRDSNM.getString();
/*     */   }
/*     */ 
/*     */   public String getPRDTRN()
/*     */   {
/* 151 */     return this.fieldPRDTRN.getString();
/*     */   }
/*     */ 
/*     */   public String getPRDTSH()
/*     */   {
/* 158 */     return this.fieldPRDTSH.getString();
/*     */   }
/*     */ 
/*     */   public String getPRDTYP()
/*     */   {
/* 165 */     return this.fieldPRDTYP.getString();
/*     */   }
/*     */ 
/*     */   public String getPRDUSR()
/*     */   {
/* 172 */     return this.fieldPRDUSR.getString();
/*     */   }
/*     */ 
/*     */   public void setPRDAOB(String newvalue)
/*     */   {
/* 179 */     this.fieldPRDAOB.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setPRDATY(String newvalue)
/*     */   {
/* 186 */     this.fieldPRDATY.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setPRDCNF(String newvalue)
/*     */   {
/* 193 */     this.fieldPRDCNF.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setPRDKEY(String newvalue)
/*     */   {
/* 200 */     this.fieldPRDKEY.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setPRDPRD(String newvalue)
/*     */   {
/* 207 */     this.fieldPRDPRD.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setPRDPSH(String newvalue)
/*     */   {
/* 214 */     this.fieldPRDPSH.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setPRDSNM(String newvalue)
/*     */   {
/* 221 */     this.fieldPRDSNM.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setPRDTRN(String newvalue)
/*     */   {
/* 228 */     this.fieldPRDTRN.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setPRDTSH(String newvalue)
/*     */   {
/* 235 */     this.fieldPRDTSH.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setPRDTYP(String newvalue)
/*     */   {
/* 242 */     this.fieldPRDTYP.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setPRDUSR(String newvalue)
/*     */   {
/* 249 */     this.fieldPRDUSR.setString(newvalue);
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.PRDLCDSJVMessage
 * JD-Core Version:    0.6.0
 */