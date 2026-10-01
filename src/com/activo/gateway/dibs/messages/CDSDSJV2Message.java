/*     */ package com.activo.gateway.dibs.messages;
/*     */ 
/*     */ import java.math.BigDecimal;
import java.util.Hashtable;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;
/*     */ 
/*     */ public class CDSDSJV2Message extends MessageRecord
/*     */ {
/* 277 */   static final String[] fldnames = { 
/* 278 */     "CDSUSER", "CDSDEAACC", "CDSDEACCY", "CDSDEAMEP", "CDSDEAIPY", "CDSINTMAT", "CDSMATDTE1", "CDSMATDTE2", "CDSMATDTE3", "CDSDEARTE", 
/* 279 */     "CDSLSYIPD", "CDSPRDNME" ,"CDSSTATUS" ,"CDSOPEDAT1", "CDSOPEDAT2", "CDSOPEDAT3", "CDSTERLOAN"};

/* 281 */   static final String[] tnames = { 
/* 282 */     "CDSUSER", "CDSDEAACC", "CDSDEACCY", "CDSDEAMEP", "CDSDEAIPY", "CDSINTMAT", "CDSMATDTE1", "CDSMATDTE2", "CDSMATDTE3", "CDSDEARTE", 
/* 283 */     "CDSLSYIPD", "CDSPRDNME","CDSSTATUS" ,"CDSOPEDAT1", "CDSOPEDAT2", "CDSOPEDAT3", "CDSTERLOAN" };

/*     */   static final String fid = "1020402182226";
/*     */   static final String rid = "4D5AAFEC55B71";
/*     */   static final String fmtname = "CDSDSJV2";
/* 288 */   final int FIELDCOUNT = 17;
/* 289 */   private static Hashtable tlookup = new Hashtable();
/*     */   private CharacterField fieldCDSUSER;
/*     */   private DecimalField fieldCDSDEAACC;
/*     */   private CharacterField fieldCDSDEACCY;
/*     */   private DecimalField fieldCDSDEAMEP;
/*     */   private DecimalField fieldCDSDEAIPY;
/*     */   private DecimalField fieldCDSINTMAT;
/*     */   private DecimalField fieldCDSMATDTE1;
/*     */   private DecimalField fieldCDSMATDTE2;
/*     */   private DecimalField fieldCDSMATDTE3;
/*     */   private DecimalField fieldCDSDEARTE;
/*     */   private DecimalField fieldCDSLSYIPD;
/*     */   private CharacterField fieldCDSPRDNME;
/*     */   private CharacterField fieldCDSSTATUS;
/*     */   private DecimalField fieldCDSOPEDAT1;
/*     */   private DecimalField fieldCDSOPEDAT2;
/*     */   private DecimalField fieldCDSOPEDAT3;
/*     */   private DecimalField fieldCDSTERLOAN;
/*     */ 
/*     */   public CDSDSJV2Message()
/*     */   {
/*  17 */     this.fieldCDSUSER = null;
/*  18 */     this.fieldCDSDEAACC = null;
/*  19 */     this.fieldCDSDEACCY = null;
/*  20 */     this.fieldCDSDEAMEP = null;
/*  21 */     this.fieldCDSDEAIPY = null;
/*  22 */     this.fieldCDSINTMAT = null;
/*  23 */     this.fieldCDSMATDTE1 = null;
/*  24 */     this.fieldCDSMATDTE2 = null;
/*  25 */     this.fieldCDSMATDTE3 = null;
/*  26 */     this.fieldCDSDEARTE = null;
/*  27 */     this.fieldCDSLSYIPD = null;
/*  28 */     this.fieldCDSPRDNME = null;
/*  28 */     this.fieldCDSSTATUS = null;
/*  28 */     this.fieldCDSOPEDAT1 = null;
/*  28 */     this.fieldCDSOPEDAT2 = null;
/*  28 */     this.fieldCDSOPEDAT3 = null;
/*  28 */     this.fieldCDSTERLOAN = null;
			
/*  29 */     createFields();
/*  30 */     initialize();
/*     */   }
/*     */ 
/*     */   protected void createFields()
/*     */   {
/*  35 */     this.recordsize = 184;
/*  36 */     this.fileid = "1020402182226";
/*  37 */     this.recordid = "4D5AAFEC55B71";
/*  38 */     this.message = new byte[getByteLength()];
/*  39 */     this.formatname = "CDSDSJV2";
/*  40 */     this.fieldnames = fldnames;
/*  41 */     this.tagnames = tnames;
/*  42 */     this.fields = new MessageField[17];
				this.fields[0] = fieldCDSUSER =   new CharacterField(message, HEADERSIZE + 0, 10, "CDSUSER");
				this.fields[1] = fieldCDSDEAACC =  new DecimalField(message, HEADERSIZE + 10, 13, 0, "CDSDEAACC");
				this.fields[2] = fieldCDSDEACCY =  new CharacterField(message, HEADERSIZE + 23, 3, "CDSDEACCY");
				this.fields[3] = fieldCDSDEAMEP =  new DecimalField(message, HEADERSIZE + 26, 15, 2, "CDSDEAMEP");
				this.fields[4] = fieldCDSDEAIPY =   new DecimalField(message, HEADERSIZE + 41, 15, 2, "CDSDEAIPY");
				this.fields[5] = fieldCDSINTMAT =   new DecimalField(message, HEADERSIZE + 56, 15, 2, "CDSINTMAT");
				this.fields[6] = fieldCDSMATDTE1 =   new DecimalField(message, HEADERSIZE + 71, 3, 0, "CDSMATDTE1");
				this.fields[7] = fieldCDSMATDTE2 =   new DecimalField(message, HEADERSIZE + 74, 3, 0, "CDSMATDTE2");
				this.fields[8] = fieldCDSMATDTE3 =   new DecimalField(message, HEADERSIZE + 77, 3, 0, "CDSMATDTE3");
				this.fields[9] = fieldCDSDEARTE =   new DecimalField(message, HEADERSIZE + 80, 11, 6, "CDSDEARTE");
				this.fields[10] = fieldCDSLSYIPD =   new DecimalField(message, HEADERSIZE + 91, 15, 2, "CDSLSYIPD");
				this.fields[11] = fieldCDSPRDNME =   new CharacterField(message, HEADERSIZE + 106, 63, "CDSPRDNME");
				this.fields[12] = fieldCDSSTATUS =   new CharacterField(message, HEADERSIZE + 169, 1, "CDSSTATUS");
				this.fields[13] = fieldCDSOPEDAT1 =   new DecimalField(message, HEADERSIZE + 170, 3, 0, "CDSOPEDAT1");
				this.fields[14] = fieldCDSOPEDAT2 =   new DecimalField(message, HEADERSIZE + 173, 3, 0, "CDSOPEDAT2");
				this.fields[15] = fieldCDSOPEDAT3 =   new DecimalField(message, HEADERSIZE + 176, 3, 0, "CDSOPEDAT3");
				this.fields[16] = fieldCDSTERLOAN =   new DecimalField(message, HEADERSIZE + 179, 5, 0, "CDSTERLOAN");

/*  55 */     synchronized (tlookup)
/*     */     {
/*  57 */       if (tlookup.isEmpty())
/*     */       {
/*  59 */         for (int i = 0; i < tnames.length; i++) {
/*  60 */           tlookup.put(tnames[i], new Integer(i));
/*     */         }
/*     */       }
/*     */     }
/*  64 */     this.taglookup = tlookup;
/*     */   }
/*     */ 
/*     */   public void setCDSUSER(String newvalue)
/*     */   {
/*  69 */     this.fieldCDSUSER.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getCDSUSER()
/*     */   {
/*  74 */     return this.fieldCDSUSER.getString();
/*     */   }
/*     */ 
/*     */   public void setCDSDEAACC(String newvalue)
/*     */   {
/*  79 */     this.fieldCDSDEAACC.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getCDSDEAACC()
/*     */   {
/*  84 */     return this.fieldCDSDEAACC.getString();
/*     */   }
/*     */ 
/*     */   public void setCDSDEAACC(BigDecimal newvalue)
/*     */   {
/*  89 */     this.fieldCDSDEAACC.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalCDSDEAACC()
/*     */   {
/*  94 */     return this.fieldCDSDEAACC.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setCDSDEACCY(String newvalue)
/*     */   {
/*  99 */     this.fieldCDSDEACCY.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getCDSDEACCY()
/*     */   {
/* 104 */     return this.fieldCDSDEACCY.getString();
/*     */   }
/*     */ 
/*     */   public void setCDSDEAMEP(String newvalue)
/*     */   {
/* 109 */     this.fieldCDSDEAMEP.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getCDSDEAMEP()
/*     */   {
/* 114 */     return this.fieldCDSDEAMEP.getString();
/*     */   }
/*     */ 
/*     */   public void setCDSDEAMEP(BigDecimal newvalue)
/*     */   {
/* 119 */     this.fieldCDSDEAMEP.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalCDSDEAMEP()
/*     */   {
/* 124 */     return this.fieldCDSDEAMEP.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setCDSDEAIPY(String newvalue)
/*     */   {
/* 129 */     this.fieldCDSDEAIPY.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getCDSDEAIPY()
/*     */   {
/* 134 */     return this.fieldCDSDEAIPY.getString();
/*     */   }
/*     */ 
/*     */   public void setCDSDEAIPY(BigDecimal newvalue)
/*     */   {
/* 139 */     this.fieldCDSDEAIPY.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalCDSDEAIPY()
/*     */   {
/* 144 */     return this.fieldCDSDEAIPY.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setCDSINTMAT(String newvalue)
/*     */   {
/* 149 */     this.fieldCDSINTMAT.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getCDSINTMAT()
/*     */   {
/* 154 */     return this.fieldCDSINTMAT.getString();
/*     */   }
/*     */ 
/*     */   public void setCDSINTMAT(BigDecimal newvalue)
/*     */   {
/* 159 */     this.fieldCDSINTMAT.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalCDSINTMAT()
/*     */   {
/* 164 */     return this.fieldCDSINTMAT.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setCDSMATDTE1(String newvalue)
/*     */   {
/* 169 */     this.fieldCDSMATDTE1.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getCDSMATDTE1()
/*     */   {
/* 174 */     return this.fieldCDSMATDTE1.getString();
/*     */   }
/*     */ 
/*     */   public void setCDSMATDTE1(BigDecimal newvalue)
/*     */   {
/* 179 */     this.fieldCDSMATDTE1.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalCDSMATDTE1()
/*     */   {
/* 184 */     return this.fieldCDSMATDTE1.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setCDSMATDTE2(String newvalue)
/*     */   {
/* 189 */     this.fieldCDSMATDTE2.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getCDSMATDTE2()
/*     */   {
/* 194 */     return this.fieldCDSMATDTE2.getString();
/*     */   }
/*     */ 
/*     */   public void setCDSMATDTE2(BigDecimal newvalue)
/*     */   {
/* 199 */     this.fieldCDSMATDTE2.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalCDSMATDTE2()
/*     */   {
/* 204 */     return this.fieldCDSMATDTE2.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setCDSMATDTE3(String newvalue)
/*     */   {
/* 209 */     this.fieldCDSMATDTE3.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getCDSMATDTE3()
/*     */   {
/* 214 */     return this.fieldCDSMATDTE3.getString();
/*     */   }
/*     */ 
/*     */   public void setCDSMATDTE3(BigDecimal newvalue)
/*     */   {
/* 219 */     this.fieldCDSMATDTE3.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalCDSMATDTE3()
/*     */   {
/* 224 */     return this.fieldCDSMATDTE3.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setCDSDEARTE(String newvalue)
/*     */   {
/* 229 */     this.fieldCDSDEARTE.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getCDSDEARTE()
/*     */   {
/* 234 */     return this.fieldCDSDEARTE.getString();
/*     */   }
/*     */ 
/*     */   public void setCDSDEARTE(BigDecimal newvalue)
/*     */   {
/* 239 */     this.fieldCDSDEARTE.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalCDSDEARTE()
/*     */   {
/* 244 */     return this.fieldCDSDEARTE.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setCDSLSYIPD(String newvalue)
/*     */   {
/* 249 */     this.fieldCDSLSYIPD.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getCDSLSYIPD()
/*     */   {
/* 254 */     return this.fieldCDSLSYIPD.getString();
/*     */   }
/*     */ 
/*     */   public void setCDSLSYIPD(BigDecimal newvalue)
/*     */   {
/* 259 */     this.fieldCDSLSYIPD.setBigDecimal(newvalue);
/*     */   }
/*     */ 
/*     */   public BigDecimal getBigDecimalCDSLSYIPD()
/*     */   {
/* 264 */     return this.fieldCDSLSYIPD.getBigDecimal();
/*     */   }
/*     */ 
/*     */   public void setCDSPRDNME(String newvalue)
/*     */   {
/* 269 */     this.fieldCDSPRDNME.setString(newvalue);
/*     */   }
/*     */ 
/*     */   public String getCDSPRDNME()
/*     */   {
/* 274 */     return this.fieldCDSPRDNME.getString();
/*     */   }

/**
 * Set field CDSSTATUS using a String value.
 */
 public void setCDSSTATUS(String newvalue)
 {
   fieldCDSSTATUS.setString(newvalue);
 }

 /**
 * Get value of field CDSSTATUS as a String.
 */
 public String getCDSSTATUS()
 {
   return fieldCDSSTATUS.getString();
 }

 /**
 * Set field CDSOPEDAT1 using a String value.
 */
 public void setCDSOPEDAT1(String newvalue)
 {
   fieldCDSOPEDAT1.setString(newvalue);
 }

 /**
 * Get value of field CDSOPEDAT1 as a String.
 */
 public String getCDSOPEDAT1()
 {
   return fieldCDSOPEDAT1.getString();
 }

 /**
 * Set numeric field CDSOPEDAT1 using a BigDecimal value.
 */
 public void setCDSOPEDAT1(BigDecimal newvalue)
 {
   fieldCDSOPEDAT1.setBigDecimal(newvalue);
 }

 /**
 * Return value of numeric field CDSOPEDAT1 as a BigDecimal.
 */
 public BigDecimal getBigDecimalCDSOPEDAT1()
 {
   return fieldCDSOPEDAT1.getBigDecimal();
 }

 /**
 * Set field CDSOPEDAT2 using a String value.
 */
 public void setCDSOPEDAT2(String newvalue)
 {
   fieldCDSOPEDAT2.setString(newvalue);
 }

 /**
 * Get value of field CDSOPEDAT2 as a String.
 */
 public String getCDSOPEDAT2()
 {
   return fieldCDSOPEDAT2.getString();
 }

 /**
 * Set numeric field CDSOPEDAT2 using a BigDecimal value.
 */
 public void setCDSOPEDAT2(BigDecimal newvalue)
 {
   fieldCDSOPEDAT2.setBigDecimal(newvalue);
 }

 /**
 * Return value of numeric field CDSOPEDAT2 as a BigDecimal.
 */
 public BigDecimal getBigDecimalCDSOPEDAT2()
 {
   return fieldCDSOPEDAT2.getBigDecimal();
 }

 /**
 * Set field CDSOPEDAT3 using a String value.
 */
 public void setCDSOPEDAT3(String newvalue)
 {
   fieldCDSOPEDAT3.setString(newvalue);
 }

 /**
 * Get value of field CDSOPEDAT3 as a String.
 */
 public String getCDSOPEDAT3()
 {
   return fieldCDSOPEDAT3.getString();
 }

 /**
 * Set numeric field CDSOPEDAT3 using a BigDecimal value.
 */
 public void setCDSOPEDAT3(BigDecimal newvalue)
 {
   fieldCDSOPEDAT3.setBigDecimal(newvalue);
 }

 /**
 * Return value of numeric field CDSOPEDAT3 as a BigDecimal.
 */
 public BigDecimal getBigDecimalCDSOPEDAT3()
 {
   return fieldCDSOPEDAT3.getBigDecimal();
 }

 /**
 * Set field CDSTERLOAN using a String value.
 */
 public void setCDSTERLOAN(String newvalue)
 {
   fieldCDSTERLOAN.setString(newvalue);
 }

 /**
 * Get value of field CDSTERLOAN as a String.
 */
 public String getCDSTERLOAN()
 {
   return fieldCDSTERLOAN.getString();
 }

 /**
 * Set numeric field CDSTERLOAN using a BigDecimal value.
 */
 public void setCDSTERLOAN(BigDecimal newvalue)
 {
   fieldCDSTERLOAN.setBigDecimal(newvalue);
 }

 /**
 * Return value of numeric field CDSTERLOAN as a BigDecimal.
 */
 public BigDecimal getBigDecimalCDSTERLOAN()
 {
   return fieldCDSTERLOAN.getBigDecimal();
 }

/*     */ }

