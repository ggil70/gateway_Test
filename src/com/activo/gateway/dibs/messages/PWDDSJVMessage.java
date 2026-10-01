/*     */ package com.activo.gateway.dibs.messages;
/*     */ 
/*     */ import java.math.BigDecimal;
import java.util.Hashtable;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*     */ 
/*     */ public class PWDDSJVMessage extends MessageRecord
/*     */ {
/* 317 */   static final String[] fldnames = { 
/* 318 */     "PWDUSR", "PWDPWD", "PWDNPW", "PWDCPW", "PWDNCH", "PWDSTS", "PWDOPR", "PWDCFM", "PWDTRA", "PWDBPA", 
/* 319 */     "PWDLCA", "PWDLNP", "PWDCCP", "PWDMAX", "PWDDTF", "PWDLGT", "PWDCMP", "PWDACL", "PWDINC", "PWDBUC", 
/* 320 */     "PWDGEC", "PWDIAD" };
/*     */ 
/* 322 */   static final String[] tnames = { 
/* 323 */     "PWDUSR", "PWDPWD", "PWDNPW", "PWDCPW", "PWDNCH", "PWDSTS", "PWDOPR", "PWDCFM", "PWDTRA", "PWDBPA", 
/* 324 */     "PWDLCA", "PWDLNP", "PWDCCP", "PWDMAX", "PWDDTF", "PWDLGT", "PWDCMP", "PWDACL", "PWDINC", "PWDBUC", 
/* 325 */     "PWDGEC", "PWDIAD" };
/*     */   static final String fid = "1030218133043";
/*     */   static final String rid = "369AC6E333EB1";
/*     */   static final String fmtname = "PWDDSJV";
/* 330 */   final int FIELDCOUNT = 22;
/* 331 */   private static Hashtable tlookup = new Hashtable();
/*     */   private CharacterField fieldPWDUSR;
/*     */   private CharacterField fieldPWDPWD;
/*     */   private CharacterField fieldPWDNPW;
/*     */   private CharacterField fieldPWDCPW;
/*     */   private CharacterField fieldPWDNCH;
/*     */   private CharacterField fieldPWDSTS;
/*     */   private CharacterField fieldPWDOPR;
/*     */   private CharacterField fieldPWDCFM;
/*     */   private CharacterField fieldPWDTRA;
/*     */   private CharacterField fieldPWDBPA;
/*     */   private CharacterField fieldPWDLCA;
/*     */   private CharacterField fieldPWDLNP;
/*     */   private CharacterField fieldPWDCCP;
/*     */   private DecimalField fieldPWDMAX;
/*     */   private CharacterField fieldPWDDTF;
/*     */   private CharacterField fieldPWDLGT;
/*     */   private CharacterField fieldPWDCMP;
/*     */   private CharacterField fieldPWDACL;
/*     */   private CharacterField fieldPWDINC;
/*     */   private CharacterField fieldPWDBUC;
/*     */   private CharacterField fieldPWDGEC;
/*     */   private CharacterField fieldPWDIAD;
/*     */ 
/*     */   public PWDDSJVMessage()
/*     */   {
/*  17 */     this.fieldPWDUSR = null;
/*  18 */     this.fieldPWDPWD = null;
/*  19 */     this.fieldPWDNPW = null;
/*  20 */     this.fieldPWDCPW = null;
/*  21 */     this.fieldPWDNCH = null;
/*  22 */     this.fieldPWDSTS = null;
/*  23 */     this.fieldPWDOPR = null;
/*  24 */     this.fieldPWDCFM = null;
/*  25 */     this.fieldPWDTRA = null;
/*  26 */     this.fieldPWDBPA = null;
/*  27 */     this.fieldPWDLCA = null;
/*  28 */     this.fieldPWDLNP = null;
/*  29 */     this.fieldPWDCCP = null;
/*  30 */     this.fieldPWDMAX = null;
/*  31 */     this.fieldPWDDTF = null;
/*  32 */     this.fieldPWDLGT = null;
/*  33 */     this.fieldPWDCMP = null;
/*  34 */     this.fieldPWDACL = null;
/*  35 */     this.fieldPWDINC = null;
/*  36 */     this.fieldPWDBUC = null;
/*  37 */     this.fieldPWDGEC = null;
/*  38 */     this.fieldPWDIAD = null;
/*  39 */     createFields();
/*  40 */     initialize();
/*     */   }
/*     */ 
/*     */   protected void createFields()
/*     */   {
/*  45 */     this.recordsize = 131;
/*  46 */     this.fileid = "1030218133043";
/*  47 */     this.recordid = "369AC6E333EB1";
/*  48 */     this.message = new byte[getByteLength()];
/*  49 */     this.formatname = "PWDDSJV";
/*  50 */     this.fieldnames = fldnames;
/*  51 */     this.tagnames = tnames;
/*  52 */     this.fields = new MessageField[22];
/*     */      this.fields[0]=this.fieldPWDUSR=new CharacterField(this.message, 10, 10, "PWDUSR");
/*     */      this.fields[1]=this.fieldPWDPWD=new CharacterField(this.message, 20, 10, "PWDPWD");
/*     */      this.fields[2]=this.fieldPWDNPW=new CharacterField(this.message, 30, 10, "PWDNPW");
/*     */      this.fields[3]=this.fieldPWDCPW=new CharacterField(this.message, 40, 10, "PWDCPW");
/*     */      this.fields[4]=this.fieldPWDNCH=new CharacterField(this.message, 50, 2, "PWDNCH");
/*     */      this.fields[5]=this.fieldPWDSTS=new CharacterField(this.message, 52, 1, "PWDSTS");
/*     */      this.fields[6]=this.fieldPWDOPR=new CharacterField(this.message, 53, 1, "PWDOPR");
/*     */      this.fields[7]=this.fieldPWDCFM=new CharacterField(this.message, 54, 1, "PWDCFM");
/*     */      this.fields[8]=this.fieldPWDTRA=new CharacterField(this.message, 55, 1, "PWDTRA");
/*     */      this.fields[9]=this.fieldPWDBPA=new CharacterField(this.message, 56, 1, "PWDBPA");
/*     */      this.fields[10]=this.fieldPWDLCA=new CharacterField(this.message, 57, 1, "PWDLCA");
/*     */      this.fields[11]=this.fieldPWDLNP=new CharacterField(this.message, 58, 1, "PWDLNP");
/*     */      this.fields[12]=this.fieldPWDCCP=new CharacterField(this.message, 59, 1, "PWDCCP");
/*     */      this.fields[13]=this.fieldPWDMAX=new DecimalField(this.message, 60, 15, 2, "PWDMAX");
/*     */      this.fields[14]=this.fieldPWDDTF=new CharacterField(this.message, 75, 1, "PWDDTF");
/*     */      this.fields[15]=this.fieldPWDLGT=new CharacterField(this.message, 76, 1, "PWDLGT");
/*     */      this.fields[16]=this.fieldPWDCMP=new CharacterField(this.message, 77, 10, "PWDCMP");
/*     */      this.fields[17]=this.fieldPWDACL=new CharacterField(this.message, 87, 2, "PWDACL");
/*     */      this.fields[18]=this.fieldPWDINC=new CharacterField(this.message, 89, 4, "PWDINC");
/*     */      this.fields[19]=this.fieldPWDBUC=new CharacterField(this.message, 93, 4, "PWDBUC");
/*     */      this.fields[20]=this.fieldPWDGEC=new CharacterField(this.message, 97, 4, "PWDGEC");
/*     */      this.fields[21]=this.fieldPWDIAD=new CharacterField(this.message, 101, 40, "PWDIAD");
/*  75 */     synchronized (tlookup)
/*     */     {
/*  77 */       if (tlookup.isEmpty())
/*     */       {
/*  79 */         for (int i = 0; i < tnames.length; i++) {
/*  80 */           tlookup.put(tnames[i], new Integer(i));
/*     */         }
/*     */       }
/*     */     }
/*  84 */     this.taglookup = tlookup;
/*     */   }
/*     */ 
/*     */   public void setPWDUSR(String newvalue)
/*     */   {
/*  89 */     this.fieldPWDUSR.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getPWDUSR()
/*     */   {
/*  94 */     return this.fieldPWDUSR.getString();
/*     */   }
/*     */ 
/*     */   public void setPWDPWD(String newvalue)
/*     */   {
/*  99 */     this.fieldPWDPWD.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getPWDPWD()
/*     */   {
/* 104 */     return this.fieldPWDPWD.getString();
/*     */   }
/*     */ 
/*     */   public void setPWDNPW(String newvalue)
/*     */   {
/* 109 */     this.fieldPWDNPW.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getPWDNPW()
/*     */   {
/* 114 */     return this.fieldPWDNPW.getString();
/*     */   }
/*     */ 
/*     */   public void setPWDCPW(String newvalue)
/*     */   {
/* 119 */     this.fieldPWDCPW.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getPWDCPW()
/*     */   {
/* 124 */     return this.fieldPWDCPW.getString();
/*     */   }
/*     */ 
/*     */   public void setPWDNCH(String newvalue)
/*     */   {
/* 129 */     this.fieldPWDNCH.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getPWDNCH()
/*     */   {
/* 134 */     return this.fieldPWDNCH.getString();
/*     */   }
/*     */ 
/*     */   public void setPWDSTS(String newvalue)
/*     */   {
/* 139 */     this.fieldPWDSTS.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getPWDSTS()
/*     */   {
/* 144 */     return this.fieldPWDSTS.getString();
/*     */   }
/*     */ 
/*     */   public void setPWDOPR(String newvalue)
/*     */   {
/* 149 */     this.fieldPWDOPR.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getPWDOPR()
/*     */   {
/* 154 */     return this.fieldPWDOPR.getString();
/*     */   }
/*     */ 
/*     */   public void setPWDCFM(String newvalue)
/*     */   {
/* 159 */     this.fieldPWDCFM.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getPWDCFM()
/*     */   {
/* 164 */     return this.fieldPWDCFM.getString();
/*     */   }
/*     */ 
/*     */   public void setPWDTRA(String newvalue)
/*     */   {
/* 169 */     this.fieldPWDTRA.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getPWDTRA()
/*     */   {
/* 174 */     return this.fieldPWDTRA.getString();
/*     */   }
/*     */ 
/*     */   public void setPWDBPA(String newvalue)
/*     */   {
/* 179 */     this.fieldPWDBPA.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getPWDBPA()
/*     */   {
/* 184 */     return this.fieldPWDBPA.getString();
/*     */   }
/*     */ 
/*     */   public void setPWDLCA(String newvalue)
/*     */   {
/* 189 */     this.fieldPWDLCA.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getPWDLCA()
/*     */   {
/* 194 */     return this.fieldPWDLCA.getString();
/*     */   }
/*     */ 
/*     */   public void setPWDLNP(String newvalue)
/*     */   {
/* 199 */     this.fieldPWDLNP.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getPWDLNP()
/*     */   {
/* 204 */     return this.fieldPWDLNP.getString();
/*     */   }
/*     */ 
/*     */   public void setPWDCCP(String newvalue)
/*     */   {
/* 209 */     this.fieldPWDCCP.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getPWDCCP()
/*     */   {
/* 214 */     return this.fieldPWDCCP.getString();
/*     */   }
/*     */ 
/*     */   public void setPWDMAX(String newvalue)
/*     */   {
/* 219 */     this.fieldPWDMAX.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getPWDMAX()
/*     */   {
/* 224 */     return this.fieldPWDMAX.getString();
/*     */   }
/*     */ 
/*     */   public void setPWDMAX(BigDecimal newvalue)
/*     */   {
/* 229 */     this.fieldPWDMAX.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalPWDMAX()
/*     */   {
/* 234 */     return this.fieldPWDMAX.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setPWDDTF(String newvalue)
/*     */   {
/* 239 */     this.fieldPWDDTF.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getPWDDTF()
/*     */   {
/* 244 */     return this.fieldPWDDTF.getString();
/*     */   }
/*     */ 
/*     */   public void setPWDLGT(String newvalue)
/*     */   {
/* 249 */     this.fieldPWDLGT.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getPWDLGT()
/*     */   {
/* 254 */     return this.fieldPWDLGT.getString();
/*     */   }
/*     */ 
/*     */   public void setPWDCMP(String newvalue)
/*     */   {
/* 259 */     this.fieldPWDCMP.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getPWDCMP()
/*     */   {
/* 264 */     return this.fieldPWDCMP.getString();
/*     */   }
/*     */ 
/*     */   public void setPWDACL(String newvalue)
/*     */   {
/* 269 */     this.fieldPWDACL.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getPWDACL()
/*     */   {
/* 274 */     return this.fieldPWDACL.getString();
/*     */   }
/*     */ 
/*     */   public void setPWDINC(String newvalue)
/*     */   {
/* 279 */     this.fieldPWDINC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getPWDINC()
/*     */   {
/* 284 */     return this.fieldPWDINC.getString();
/*     */   }
/*     */ 
/*     */   public void setPWDBUC(String newvalue)
/*     */   {
/* 289 */     this.fieldPWDBUC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getPWDBUC()
/*     */   {
/* 294 */     return this.fieldPWDBUC.getString();
/*     */   }
/*     */ 
/*     */   public void setPWDGEC(String newvalue)
/*     */   {
/* 299 */     this.fieldPWDGEC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getPWDGEC()
/*     */   {
/* 304 */     return this.fieldPWDGEC.getString();
/*     */   }
/*     */ 
/*     */   public void setPWDIAD(String newvalue)
/*     */   {
/* 309 */     this.fieldPWDIAD.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getPWDIAD()
/*     */   {
/* 314 */     return this.fieldPWDIAD.getString();
/*     */   }
/*     */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.dibs.messages.PWDDSJVMessage
 * JD-Core Version:    0.6.0
 */