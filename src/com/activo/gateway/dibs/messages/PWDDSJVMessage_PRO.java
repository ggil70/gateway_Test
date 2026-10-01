/*     */ package com.activo.gateway.dibs.messages;
/*     */ 
/*     */ import java.math.BigDecimal;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*     */ 
/*     */ public class PWDDSJVMessage_PRO extends MessageRecord
/*     */ {
/*  19 */   final int FIELDCOUNT = 15;
/*  20 */   private CharacterField fieldPWDUSR = null;
/*  21 */   private CharacterField fieldPWDPWD = null;
/*  22 */   private CharacterField fieldPWDNPW = null;
/*  23 */   private CharacterField fieldPWDCPW = null;
/*  24 */   private CharacterField fieldPWDNCH = null;
/*  25 */   private CharacterField fieldPWDSTS = null;
/*  26 */   private CharacterField fieldPWDOPR = null;
/*  27 */   private CharacterField fieldPWDCFM = null;
/*  28 */   private CharacterField fieldPWDTRA = null;
/*  29 */   private CharacterField fieldPWDBPA = null;
/*  30 */   private CharacterField fieldPWDLCA = null;
/*  31 */   private CharacterField fieldPWDLNP = null;
/*  32 */   private CharacterField fieldPWDCCP = null;
/*  33 */   private DecimalField fieldPWDMAX = null;
/*  34 */   private CharacterField fieldPWDDTF = null;
/*     */ 
/*     */   public PWDDSJVMessage_PRO()
/*     */   {
/*  41 */     createFields();
/*  42 */     initialize();
/*     */   }
/*     */ 
/*     */   protected void createFields()
/*     */   {
/*  50 */     this.recordsize = 66;
/*  51 */     this.fileid = "1000807105011";
/*  52 */     this.recordid = "364BB203A83AE";
/*  53 */     this.message = new byte[getByteLength()];
/*  54 */     this.formatname = "PWDDSJV";
/*  55 */     this.fieldnames = new String[15];
/*  56 */     this.tagnames = new String[15];
/*  57 */     this.fields = new MessageField[15];
/*     */ 
/*  59 */     this.fieldnames[0] = "PWDUSR";
/*  60 */     this.tagnames[0] = "PWDUSR";
/*     */      this.fields[0]=this.fieldPWDUSR=new CharacterField(this.message, 10, 10, "PWDUSR");
/*     */ 
/*  63 */     this.fieldnames[1] = "PWDPWD";
/*  64 */     this.tagnames[1] = "PWDPWD";
/*     */      this.fields[1]=this.fieldPWDPWD=new CharacterField(this.message, 20, 10, "PWDPWD");
/*     */ 
/*  67 */     this.fieldnames[2] = "PWDNPW";
/*  68 */     this.tagnames[2] = "PWDNPW";
/*     */      this.fields[2]=this.fieldPWDNPW=new CharacterField(this.message, 30, 10, "PWDNPW");
/*     */ 
/*  71 */     this.fieldnames[3] = "PWDCPW";
/*  72 */     this.tagnames[3] = "PWDCPW";
/*     */      this.fields[3]=this.fieldPWDCPW=new CharacterField(this.message, 40, 10, "PWDCPW");
/*     */ 
/*  75 */     this.fieldnames[4] = "PWDNCH";
/*  76 */     this.tagnames[4] = "PWDNCH";
/*     */      this.fields[4]=this.fieldPWDNCH=new CharacterField(this.message, 50, 2, "PWDNCH");
/*     */ 
/*  79 */     this.fieldnames[5] = "PWDSTS";
/*  80 */     this.tagnames[5] = "PWDSTS";
/*     */      this.fields[5]=this.fieldPWDSTS=new CharacterField(this.message, 52, 1, "PWDSTS");
/*     */ 
/*  83 */     this.fieldnames[6] = "PWDOPR";
/*  84 */     this.tagnames[6] = "PWDOPR";
/*     */      this.fields[6]=this.fieldPWDOPR=new CharacterField(this.message, 53, 1, "PWDOPR");
/*     */ 
/*  87 */     this.fieldnames[7] = "PWDCFM";
/*  88 */     this.tagnames[7] = "PWDCFM";
/*     */      this.fields[7]=this.fieldPWDCFM=new CharacterField(this.message, 54, 1, "PWDCFM");
/*     */ 
/*  91 */     this.fieldnames[8] = "PWDTRA";
/*  92 */     this.tagnames[8] = "PWDTRA";
/*     */      this.fields[8]=this.fieldPWDTRA=new CharacterField(this.message, 55, 1, "PWDTRA");
/*     */ 
/*  95 */     this.fieldnames[9] = "PWDBPA";
/*  96 */     this.tagnames[9] = "PWDBPA";
/*     */      this.fields[9]=this.fieldPWDBPA=new CharacterField(this.message, 56, 1, "PWDBPA");
/*     */ 
/*  99 */     this.fieldnames[10] = "PWDLCA";
/* 100 */     this.tagnames[10] = "PWDLCA";
/*     */      this.fields[10]=this.fieldPWDLCA=new CharacterField(this.message, 57, 1, "PWDLCA");
/*     */ 
/* 103 */     this.fieldnames[11] = "PWDLNP";
/* 104 */     this.tagnames[11] = "PWDLNP";
/*     */      this.fields[11]=this.fieldPWDLNP=new CharacterField(this.message, 58, 1, "PWDLNP");
/*     */ 
/* 107 */     this.fieldnames[12] = "PWDCCP";
/* 108 */     this.tagnames[12] = "PWDCCP";
/*     */      this.fields[12]=this.fieldPWDCCP=new CharacterField(this.message, 59, 1, "PWDCCP");
/*     */ 
/* 111 */     this.fieldnames[13] = "PWDMAX";
/* 112 */     this.tagnames[13] = "PWDMAX";
/*     */      this.fields[13]=this.fieldPWDMAX=new DecimalField(this.message, 60, 15, 2, "PWDMAX");
/*     */ 
/* 115 */     this.fieldnames[14] = "PWDDTF";
/* 116 */     this.tagnames[14] = "PWDDTF";
/*     */      this.fields[14]=this.fieldPWDDTF=new CharacterField(this.message, 75, 1, "PWDDTF");
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalPWDMAX()
/*     */   {
/* 125 */     return this.fieldPWDMAX.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public String getPWDBPA()
/*     */   {
/* 132 */     return this.fieldPWDBPA.getString();
/*     */   }
/*     */ 
/*     */   public String getPWDCCP()
/*     */   {
/* 139 */     return this.fieldPWDCCP.getString();
/*     */   }
/*     */ 
/*     */   public String getPWDCFM()
/*     */   {
/* 146 */     return this.fieldPWDCFM.getString();
/*     */   }
/*     */ 
/*     */   public String getPWDCPW()
/*     */   {
/* 153 */     return this.fieldPWDCPW.getString();
/*     */   }
/*     */ 
/*     */   public String getPWDDTF()
/*     */   {
/* 160 */     return this.fieldPWDDTF.getString();
/*     */   }
/*     */ 
/*     */   public String getPWDLCA()
/*     */   {
/* 167 */     return this.fieldPWDLCA.getString();
/*     */   }
/*     */ 
/*     */   public String getPWDLNP()
/*     */   {
/* 174 */     return this.fieldPWDLNP.getString();
/*     */   }
/*     */ 
/*     */   public String getPWDMAX()
/*     */   {
/* 181 */     return this.fieldPWDMAX.getString();
/*     */   }
/*     */ 
/*     */   public String getPWDNCH()
/*     */   {
/* 188 */     return this.fieldPWDNCH.getString();
/*     */   }
/*     */ 
/*     */   public String getPWDNPW()
/*     */   {
/* 195 */     return this.fieldPWDNPW.getString();
/*     */   }
/*     */ 
/*     */   public String getPWDOPR()
/*     */   {
/* 202 */     return this.fieldPWDOPR.getString();
/*     */   }
/*     */ 
/*     */   public String getPWDPWD()
/*     */   {
/* 209 */     return this.fieldPWDPWD.getString();
/*     */   }
/*     */ 
/*     */   public String getPWDSTS()
/*     */   {
/* 216 */     return this.fieldPWDSTS.getString();
/*     */   }
/*     */ 
/*     */   public String getPWDTRA()
/*     */   {
/* 223 */     return this.fieldPWDTRA.getString();
/*     */   }
/*     */ 
/*     */   public String getPWDUSR()
/*     */   {
/* 230 */     return this.fieldPWDUSR.getString();
/*     */   }
/*     */ 
/*     */   public void setPWDBPA(String newvalue)
/*     */   {
/* 237 */     this.fieldPWDBPA.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setPWDCCP(String newvalue)
/*     */   {
/* 244 */     this.fieldPWDCCP.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setPWDCFM(String newvalue)
/*     */   {
/* 251 */     this.fieldPWDCFM.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setPWDCPW(String newvalue)
/*     */   {
/* 258 */     this.fieldPWDCPW.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setPWDDTF(String newvalue)
/*     */   {
/* 265 */     this.fieldPWDDTF.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setPWDLCA(String newvalue)
/*     */   {
/* 272 */     this.fieldPWDLCA.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setPWDLNP(String newvalue)
/*     */   {
/* 279 */     this.fieldPWDLNP.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setPWDMAX(String newvalue)
/*     */   {
/* 286 */     this.fieldPWDMAX.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setPWDMAX(BigDecimal newvalue)
/*     */   {
/* 293 */     this.fieldPWDMAX.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public void setPWDNCH(String newvalue)
/*     */   {
/* 300 */     this.fieldPWDNCH.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setPWDNPW(String newvalue)
/*     */   {
/* 307 */     this.fieldPWDNPW.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setPWDOPR(String newvalue)
/*     */   {
/* 314 */     this.fieldPWDOPR.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setPWDPWD(String newvalue)
/*     */   {
/* 321 */     this.fieldPWDPWD.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setPWDSTS(String newvalue)
/*     */   {
/* 328 */     this.fieldPWDSTS.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setPWDTRA(String newvalue)
/*     */   {
/* 335 */     this.fieldPWDTRA.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public void setPWDUSR(String newvalue)
/*     */   {
/* 342 */     this.fieldPWDUSR.setString(newvalue);
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.PWDDSJVMessage_PRO
 * JD-Core Version:    0.6.0
 */