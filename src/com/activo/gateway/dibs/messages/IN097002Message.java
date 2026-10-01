package com.activo.gateway.dibs.messages;

import java.math.BigDecimal;
import java.util.Hashtable;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;

public class IN097002Message extends MessageRecord
{
	  final static String fldnames[] = {
          "IN9702IDUS",
          "IN9702BVDM",
          "IN9702BVDD",
          "IN9702BVDY",
          "IN9702FACC",
          "IN9702ACCT",
          "IN9702TSPI",
          "IN9702NTER",
          "IN9702CAGE",
          "IN9702RIFC",
          "IN9702RIFP",
          "IN9702CFOR",
          "IN9702NPLA",
          "IN9702IDCO",
          "IN9702NCTA",
          "IN9702TCTA",
          "IN9702CRES",
          "IN9702MRES",
          "IN9702ANTI",
          "IN9702ESTA",
          "IN9702PLIQ",
          "IN9702EFEC",
          "IN9702MTOT",
          "IN9702CIMN",
          "IN9702CIML",
          "IN9702CONC",
          "IN9702DESC",
          "IN9702FVCT",
          "IN9702CADU",
          "IN9702NADU",
          "IN9702NEXP",
          "IN9702NPOR",
          "IN9702CCAD",
          "IN9702CSAD",
          "IN9702CING",
          "IN9702CERO",
          "IN9702IT90",
          "IN9702ICAJ",
          "IN9702CTRS",
          "IN9702NTRS",
          "IN9702TXNN",
          "IN9702CSBA",
          "IN9702IOPE",
          "IN9702NAUT",
          "IN9702RSOC",
          "IN9702MIST",
          "IN9702IREC",
          "IN9702MREC",
          "IN9702FILL"
        };
final static String tnames[] = {
        "IN9702IDUS",
        "IN9702BVDM",
        "IN9702BVDD",
        "IN9702BVDY",
        "IN9702FACC",
        "IN9702ACCT",
        "IN9702TSPI",
        "IN9702NTER",
        "IN9702CAGE",
        "IN9702RIFC",
        "IN9702RIFP",
        "IN9702CFOR",
        "IN9702NPLA",
        "IN9702IDCO",
        "IN9702NCTA",
        "IN9702TCTA",
        "IN9702CRES",
        "IN9702MRES",
        "IN9702ANTI",
        "IN9702ESTA",
        "IN9702PLIQ",
        "IN9702EFEC",
        "IN9702MTOT",
        "IN9702CIMN",
        "IN9702CIML",
        "IN9702CONC",
        "IN9702DESC",
        "IN9702FVCT",
        "IN9702CADU",
        "IN9702NADU",
        "IN9702NEXP",
        "IN9702NPOR",
        "IN9702CCAD",
        "IN9702CSAD",
        "IN9702CING",
        "IN9702CERO",
        "IN9702IT90",
        "IN9702ICAJ",
        "IN9702CTRS",
        "IN9702NTRS",
        "IN9702TXNN",
        "IN9702CSBA",
        "IN9702IOPE",
        "IN9702NAUT",
        "IN9702RSOC",
        "IN9702MIST",
        "IN9702IREC",
        "IN9702MREC",
        "IN9702FILL"
      };
final static String fid = "1140708172510";
final static String rid = "41D45BE375154";
final static String fmtname = "IN097002";
final int FIELDCOUNT = 49;
private static Hashtable tlookup = new Hashtable();
private CharacterField fieldIN9702IDUS = null;
private DecimalField fieldIN9702BVDM = null;
private DecimalField fieldIN9702BVDD = null;
private DecimalField fieldIN9702BVDY = null;
private DecimalField fieldIN9702FACC = null;
private DecimalField fieldIN9702ACCT = null;
private CharacterField fieldIN9702TSPI = null;
private CharacterField fieldIN9702NTER = null;
private DecimalField fieldIN9702CAGE = null;
private DecimalField fieldIN9702RIFC = null;
private DecimalField fieldIN9702RIFP = null;
private DecimalField fieldIN9702CFOR = null;
private DecimalField fieldIN9702NPLA = null;
private DecimalField fieldIN9702IDCO = null;
private CharacterField fieldIN9702NCTA = null;
private CharacterField fieldIN9702TCTA = null;
private CharacterField fieldIN9702CRES = null;
private CharacterField fieldIN9702MRES = null;
private DecimalField fieldIN9702ANTI = null;
private CharacterField fieldIN9702ESTA = null;
private DecimalField fieldIN9702PLIQ = null;
private DecimalField fieldIN9702EFEC = null;
private DecimalField fieldIN9702MTOT = null;
private CharacterField fieldIN9702CIMN = null;
private CharacterField fieldIN9702CIML = null;
private CharacterField fieldIN9702CONC = null;
private CharacterField fieldIN9702DESC = null;
private CharacterField fieldIN9702FVCT = null;
private DecimalField fieldIN9702CADU = null;
private CharacterField fieldIN9702NADU = null;
private CharacterField fieldIN9702NEXP = null;
private CharacterField fieldIN9702NPOR = null;
private DecimalField fieldIN9702CCAD = null;
private DecimalField fieldIN9702CSAD = null;
private DecimalField fieldIN9702CING = null;
private DecimalField fieldIN9702CERO = null;
private DecimalField fieldIN9702IT90 = null;
private CharacterField fieldIN9702ICAJ = null;
private DecimalField fieldIN9702CTRS = null;
private DecimalField fieldIN9702NTRS = null;
private DecimalField fieldIN9702TXNN = null;
private DecimalField fieldIN9702CSBA = null;
private CharacterField fieldIN9702IOPE = null;
private CharacterField fieldIN9702NAUT = null;
private CharacterField fieldIN9702RSOC = null;
private CharacterField fieldIN9702MIST = null;
private CharacterField fieldIN9702IREC = null;
private CharacterField fieldIN9702MREC = null;
private CharacterField fieldIN9702FILL = null;

/**
* Constructor for IN097002Message.
*/
public IN097002Message()
{
createFields();
initialize();
}

/**
* Create fields for this message.
* This method implements the abstract method in the MessageRecord superclass.
*/
protected void createFields()
{
recordsize = 828;
fileid = fid;
recordid = rid;
message = new byte[getByteLength()];
formatname = fmtname;
fieldnames = fldnames;
tagnames = tnames;
fields = new MessageField[FIELDCOUNT];

fields[0] = fieldIN9702IDUS =
new CharacterField(message, HEADERSIZE + 0, 10, "IN9702IDUS");
fields[1] = fieldIN9702BVDM =
new DecimalField(message, HEADERSIZE + 10, 3, 0, "IN9702BVDM");
fields[2] = fieldIN9702BVDD =
new DecimalField(message, HEADERSIZE + 13, 3, 0, "IN9702BVDD");
fields[3] = fieldIN9702BVDY =
new DecimalField(message, HEADERSIZE + 16, 3, 0, "IN9702BVDY");
fields[4] = fieldIN9702FACC =
new DecimalField(message, HEADERSIZE + 19, 13, 0, "IN9702FACC");
fields[5] = fieldIN9702ACCT =
new DecimalField(message, HEADERSIZE + 32, 13, 0, "IN9702ACCT");
fields[6] = fieldIN9702TSPI =
new CharacterField(message, HEADERSIZE + 45, 6, "IN9702TSPI");
fields[7] = fieldIN9702NTER =
new CharacterField(message, HEADERSIZE + 51, 4, "IN9702NTER");
fields[8] = fieldIN9702CAGE =
new DecimalField(message, HEADERSIZE + 55, 5, 0, "IN9702CAGE");
fields[9] = fieldIN9702RIFC =
new DecimalField(message, HEADERSIZE + 60, 16, 0, "IN9702RIFC");
fields[10] = fieldIN9702RIFP =
new DecimalField(message, HEADERSIZE + 76, 11, 0, "IN9702RIFP");
fields[11] = fieldIN9702CFOR =
new DecimalField(message, HEADERSIZE + 87, 16, 0, "IN9702CFOR");
fields[12] = fieldIN9702NPLA =
new DecimalField(message, HEADERSIZE + 103, 16, 0, "IN9702NPLA");
fields[13] = fieldIN9702IDCO =
new DecimalField(message, HEADERSIZE + 119, 21, 0, "IN9702IDCO");
fields[14] = fieldIN9702NCTA =
new CharacterField(message, HEADERSIZE + 140, 20, "IN9702NCTA");
fields[15] = fieldIN9702TCTA =
new CharacterField(message, HEADERSIZE + 160, 2, "IN9702TCTA");
fields[16] = fieldIN9702CRES =
new CharacterField(message, HEADERSIZE + 162, 2, "IN9702CRES");
fields[17] = fieldIN9702MRES =
new CharacterField(message, HEADERSIZE + 164, 25, "IN9702MRES");
fields[18] = fieldIN9702ANTI =
new DecimalField(message, HEADERSIZE + 189, 2, 0, "IN9702ANTI");
fields[19] = fieldIN9702ESTA =
new CharacterField(message, HEADERSIZE + 191, 1, "IN9702ESTA");
fields[20] = fieldIN9702PLIQ =
new DecimalField(message, HEADERSIZE + 192, 16, 0, "IN9702PLIQ");
fields[21] = fieldIN9702EFEC =
new DecimalField(message, HEADERSIZE + 208, 17, 2, "IN9702EFEC");
fields[22] = fieldIN9702MTOT =
new DecimalField(message, HEADERSIZE + 225, 17, 2, "IN9702MTOT");
fields[23] = fieldIN9702CIMN =
new CharacterField(message, HEADERSIZE + 242, 5, "IN9702CIMN");
fields[24] = fieldIN9702CIML =
new CharacterField(message, HEADERSIZE + 247, 26, "IN9702CIML");
fields[25] = fieldIN9702CONC =
new CharacterField(message, HEADERSIZE + 273, 80, "IN9702CONC");
fields[26] = fieldIN9702DESC =
new CharacterField(message, HEADERSIZE + 353, 80, "IN9702DESC");
fields[27] = fieldIN9702FVCT =
new CharacterField(message, HEADERSIZE + 433, 8, "IN9702FVCT");
fields[28] = fieldIN9702CADU =
new DecimalField(message, HEADERSIZE + 441, 16, 0, "IN9702CADU");
fields[29] = fieldIN9702NADU =
new CharacterField(message, HEADERSIZE + 457, 80, "IN9702NADU");
fields[30] = fieldIN9702NEXP =
new CharacterField(message, HEADERSIZE + 537, 20, "IN9702NEXP");
fields[31] = fieldIN9702NPOR =
new CharacterField(message, HEADERSIZE + 557, 5, "IN9702NPOR");
fields[32] = fieldIN9702CCAD =
new DecimalField(message, HEADERSIZE + 562, 16, 0, "IN9702CCAD");
fields[33] = fieldIN9702CSAD =
new DecimalField(message, HEADERSIZE + 578, 16, 0, "IN9702CSAD");
fields[34] = fieldIN9702CING =
new DecimalField(message, HEADERSIZE + 594, 16, 0, "IN9702CING");
fields[35] = fieldIN9702CERO =
new DecimalField(message, HEADERSIZE + 610, 17, 2, "IN9702CERO");
fields[36] = fieldIN9702IT90 =
new DecimalField(message, HEADERSIZE + 627, 17, 2, "IN9702IT90");
fields[37] = fieldIN9702ICAJ =
new CharacterField(message, HEADERSIZE + 644, 1, "IN9702ICAJ");
fields[38] = fieldIN9702CTRS =
new DecimalField(message, HEADERSIZE + 645, 5, 0, "IN9702CTRS");
fields[39] = fieldIN9702NTRS =
new DecimalField(message, HEADERSIZE + 650, 8, 0, "IN9702NTRS");
fields[40] = fieldIN9702TXNN =
new DecimalField(message, HEADERSIZE + 658, 7, 0, "IN9702TXNN");
fields[41] = fieldIN9702CSBA =
new DecimalField(message, HEADERSIZE + 665, 11, 0, "IN9702CSBA");
fields[42] = fieldIN9702IOPE =
new CharacterField(message, HEADERSIZE + 676, 1, "IN9702IOPE");
fields[43] = fieldIN9702NAUT =
new CharacterField(message, HEADERSIZE + 677, 6, "IN9702NAUT");
fields[44] = fieldIN9702RSOC =
new CharacterField(message, HEADERSIZE + 683, 37, "IN9702RSOC");
fields[45] = fieldIN9702MIST =
new CharacterField(message, HEADERSIZE + 720, 26, "IN9702MIST");
fields[46] = fieldIN9702IREC =
new CharacterField(message, HEADERSIZE + 746, 2, "IN9702IREC");
fields[47] = fieldIN9702MREC =
new CharacterField(message, HEADERSIZE + 748, 26, "IN9702MREC");
fields[48] = fieldIN9702FILL =
new CharacterField(message, HEADERSIZE + 774, 54, "IN9702FILL");

synchronized (tlookup)
{
if (tlookup.isEmpty())
{
for (int i = 0; i < tnames.length; i++)
tlookup.put(tnames[i], new Integer(i));
}
}

taglookup = tlookup;
}

/**
* Set field IN9702IDUS using a String value.
*/
public void setIN9702IDUS(String newvalue)
{
fieldIN9702IDUS.setString(newvalue);
}

/**
* Get value of field IN9702IDUS as a String.
*/
public String getIN9702IDUS()
{
return fieldIN9702IDUS.getString();
}

/**
* Set field IN9702BVDM using a String value.
*/
public void setIN9702BVDM(String newvalue)
{
fieldIN9702BVDM.setString(newvalue);
}

/**
* Get value of field IN9702BVDM as a String.
*/
public String getIN9702BVDM()
{
return fieldIN9702BVDM.getString();
}

/**
* Set numeric field IN9702BVDM using a BigDecimal value.
*/
public void setIN9702BVDM(BigDecimal newvalue)
{
fieldIN9702BVDM.setBigDecimal(newvalue);
}

/**
* Return value of numeric field IN9702BVDM as a BigDecimal.
*/
public BigDecimal getBigDecimalIN9702BVDM()
{
return fieldIN9702BVDM.getBigDecimal();
}

/**
* Set field IN9702BVDD using a String value.
*/
public void setIN9702BVDD(String newvalue)
{
fieldIN9702BVDD.setString(newvalue);
}

/**
* Get value of field IN9702BVDD as a String.
*/
public String getIN9702BVDD()
{
return fieldIN9702BVDD.getString();
}

/**
* Set numeric field IN9702BVDD using a BigDecimal value.
*/
public void setIN9702BVDD(BigDecimal newvalue)
{
fieldIN9702BVDD.setBigDecimal(newvalue);
}

/**
* Return value of numeric field IN9702BVDD as a BigDecimal.
*/
public BigDecimal getBigDecimalIN9702BVDD()
{
return fieldIN9702BVDD.getBigDecimal();
}

/**
* Set field IN9702BVDY using a String value.
*/
public void setIN9702BVDY(String newvalue)
{
fieldIN9702BVDY.setString(newvalue);
}

/**
* Get value of field IN9702BVDY as a String.
*/
public String getIN9702BVDY()
{
return fieldIN9702BVDY.getString();
}

/**
* Set numeric field IN9702BVDY using a BigDecimal value.
*/
public void setIN9702BVDY(BigDecimal newvalue)
{
fieldIN9702BVDY.setBigDecimal(newvalue);
}

/**
* Return value of numeric field IN9702BVDY as a BigDecimal.
*/
public BigDecimal getBigDecimalIN9702BVDY()
{
return fieldIN9702BVDY.getBigDecimal();
}

/**
* Set field IN9702FACC using a String value.
*/
public void setIN9702FACC(String newvalue)
{
fieldIN9702FACC.setString(newvalue);
}

/**
* Get value of field IN9702FACC as a String.
*/
public String getIN9702FACC()
{
return fieldIN9702FACC.getString();
}

/**
* Set numeric field IN9702FACC using a BigDecimal value.
*/
public void setIN9702FACC(BigDecimal newvalue)
{
fieldIN9702FACC.setBigDecimal(newvalue);
}

/**
* Return value of numeric field IN9702FACC as a BigDecimal.
*/
public BigDecimal getBigDecimalIN9702FACC()
{
return fieldIN9702FACC.getBigDecimal();
}

/**
* Set field IN9702ACCT using a String value.
*/
public void setIN9702ACCT(String newvalue)
{
fieldIN9702ACCT.setString(newvalue);
}

/**
* Get value of field IN9702ACCT as a String.
*/
public String getIN9702ACCT()
{
return fieldIN9702ACCT.getString();
}

/**
* Set numeric field IN9702ACCT using a BigDecimal value.
*/
public void setIN9702ACCT(BigDecimal newvalue)
{
fieldIN9702ACCT.setBigDecimal(newvalue);
}

/**
* Return value of numeric field IN9702ACCT as a BigDecimal.
*/
public BigDecimal getBigDecimalIN9702ACCT()
{
return fieldIN9702ACCT.getBigDecimal();
}

/**
* Set field IN9702TSPI using a String value.
*/
public void setIN9702TSPI(String newvalue)
{
fieldIN9702TSPI.setString(newvalue);
}

/**
* Get value of field IN9702TSPI as a String.
*/
public String getIN9702TSPI()
{
return fieldIN9702TSPI.getString();
}

/**
* Set field IN9702NTER using a String value.
*/
public void setIN9702NTER(String newvalue)
{
fieldIN9702NTER.setString(newvalue);
}

/**
* Get value of field IN9702NTER as a String.
*/
public String getIN9702NTER()
{
return fieldIN9702NTER.getString();
}

/**
* Set field IN9702CAGE using a String value.
*/
public void setIN9702CAGE(String newvalue)
{
fieldIN9702CAGE.setString(newvalue);
}

/**
* Get value of field IN9702CAGE as a String.
*/
public String getIN9702CAGE()
{
return fieldIN9702CAGE.getString();
}

/**
* Set numeric field IN9702CAGE using a BigDecimal value.
*/
public void setIN9702CAGE(BigDecimal newvalue)
{
fieldIN9702CAGE.setBigDecimal(newvalue);
}

/**
* Return value of numeric field IN9702CAGE as a BigDecimal.
*/
public BigDecimal getBigDecimalIN9702CAGE()
{
return fieldIN9702CAGE.getBigDecimal();
}

/**
* Set field IN9702RIFC using a String value.
*/
public void setIN9702RIFC(String newvalue)
{
fieldIN9702RIFC.setString(newvalue);
}

/**
* Get value of field IN9702RIFC as a String.
*/
public String getIN9702RIFC()
{
return fieldIN9702RIFC.getString();
}

/**
* Set numeric field IN9702RIFC using a BigDecimal value.
*/
public void setIN9702RIFC(BigDecimal newvalue)
{
fieldIN9702RIFC.setBigDecimal(newvalue);
}

/**
* Return value of numeric field IN9702RIFC as a BigDecimal.
*/
public BigDecimal getBigDecimalIN9702RIFC()
{
return fieldIN9702RIFC.getBigDecimal();
}

/**
* Set field IN9702RIFP using a String value.
*/
public void setIN9702RIFP(String newvalue)
{
fieldIN9702RIFP.setString(newvalue);
}

/**
* Get value of field IN9702RIFP as a String.
*/
public String getIN9702RIFP()
{
return fieldIN9702RIFP.getString();
}

/**
* Set numeric field IN9702RIFP using a BigDecimal value.
*/
public void setIN9702RIFP(BigDecimal newvalue)
{
fieldIN9702RIFP.setBigDecimal(newvalue);
}

/**
* Return value of numeric field IN9702RIFP as a BigDecimal.
*/
public BigDecimal getBigDecimalIN9702RIFP()
{
return fieldIN9702RIFP.getBigDecimal();
}

/**
* Set field IN9702CFOR using a String value.
*/
public void setIN9702CFOR(String newvalue)
{
fieldIN9702CFOR.setString(newvalue);
}

/**
* Get value of field IN9702CFOR as a String.
*/
public String getIN9702CFOR()
{
return fieldIN9702CFOR.getString();
}

/**
* Set numeric field IN9702CFOR using a BigDecimal value.
*/
public void setIN9702CFOR(BigDecimal newvalue)
{
fieldIN9702CFOR.setBigDecimal(newvalue);
}

/**
* Return value of numeric field IN9702CFOR as a BigDecimal.
*/
public BigDecimal getBigDecimalIN9702CFOR()
{
return fieldIN9702CFOR.getBigDecimal();
}

/**
* Set field IN9702NPLA using a String value.
*/
public void setIN9702NPLA(String newvalue)
{
fieldIN9702NPLA.setString(newvalue);
}

/**
* Get value of field IN9702NPLA as a String.
*/
public String getIN9702NPLA()
{
return fieldIN9702NPLA.getString();
}

/**
* Set numeric field IN9702NPLA using a BigDecimal value.
*/
public void setIN9702NPLA(BigDecimal newvalue)
{
fieldIN9702NPLA.setBigDecimal(newvalue);
}

/**
* Return value of numeric field IN9702NPLA as a BigDecimal.
*/
public BigDecimal getBigDecimalIN9702NPLA()
{
return fieldIN9702NPLA.getBigDecimal();
}

/**
* Set field IN9702IDCO using a String value.
*/
public void setIN9702IDCO(String newvalue)
{
fieldIN9702IDCO.setString(newvalue);
}

/**
* Get value of field IN9702IDCO as a String.
*/
public String getIN9702IDCO()
{
return fieldIN9702IDCO.getString();
}

/**
* Set numeric field IN9702IDCO using a BigDecimal value.
*/
public void setIN9702IDCO(BigDecimal newvalue)
{
fieldIN9702IDCO.setBigDecimal(newvalue);
}

/**
* Return value of numeric field IN9702IDCO as a BigDecimal.
*/
public BigDecimal getBigDecimalIN9702IDCO()
{
return fieldIN9702IDCO.getBigDecimal();
}

/**
* Set field IN9702NCTA using a String value.
*/
public void setIN9702NCTA(String newvalue)
{
fieldIN9702NCTA.setString(newvalue);
}

/**
* Get value of field IN9702NCTA as a String.
*/
public String getIN9702NCTA()
{
return fieldIN9702NCTA.getString();
}

/**
* Set field IN9702TCTA using a String value.
*/
public void setIN9702TCTA(String newvalue)
{
fieldIN9702TCTA.setString(newvalue);
}

/**
* Get value of field IN9702TCTA as a String.
*/
public String getIN9702TCTA()
{
return fieldIN9702TCTA.getString();
}

/**
* Set field IN9702CRES using a String value.
*/
public void setIN9702CRES(String newvalue)
{
fieldIN9702CRES.setString(newvalue);
}

/**
* Get value of field IN9702CRES as a String.
*/
public String getIN9702CRES()
{
return fieldIN9702CRES.getString();
}

/**
* Set field IN9702MRES using a String value.
*/
public void setIN9702MRES(String newvalue)
{
fieldIN9702MRES.setString(newvalue);
}

/**
* Get value of field IN9702MRES as a String.
*/
public String getIN9702MRES()
{
return fieldIN9702MRES.getString();
}

/**
* Set field IN9702ANTI using a String value.
*/
public void setIN9702ANTI(String newvalue)
{
fieldIN9702ANTI.setString(newvalue);
}

/**
* Get value of field IN9702ANTI as a String.
*/
public String getIN9702ANTI()
{
return fieldIN9702ANTI.getString();
}

/**
* Set numeric field IN9702ANTI using a BigDecimal value.
*/
public void setIN9702ANTI(BigDecimal newvalue)
{
fieldIN9702ANTI.setBigDecimal(newvalue);
}

/**
* Return value of numeric field IN9702ANTI as a BigDecimal.
*/
public BigDecimal getBigDecimalIN9702ANTI()
{
return fieldIN9702ANTI.getBigDecimal();
}

/**
* Set field IN9702ESTA using a String value.
*/
public void setIN9702ESTA(String newvalue)
{
fieldIN9702ESTA.setString(newvalue);
}

/**
* Get value of field IN9702ESTA as a String.
*/
public String getIN9702ESTA()
{
return fieldIN9702ESTA.getString();
}

/**
* Set field IN9702PLIQ using a String value.
*/
public void setIN9702PLIQ(String newvalue)
{
fieldIN9702PLIQ.setString(newvalue);
}

/**
* Get value of field IN9702PLIQ as a String.
*/
public String getIN9702PLIQ()
{
return fieldIN9702PLIQ.getString();
}

/**
* Set numeric field IN9702PLIQ using a BigDecimal value.
*/
public void setIN9702PLIQ(BigDecimal newvalue)
{
fieldIN9702PLIQ.setBigDecimal(newvalue);
}

/**
* Return value of numeric field IN9702PLIQ as a BigDecimal.
*/
public BigDecimal getBigDecimalIN9702PLIQ()
{
return fieldIN9702PLIQ.getBigDecimal();
}

/**
* Set field IN9702EFEC using a String value.
*/
public void setIN9702EFEC(String newvalue)
{
fieldIN9702EFEC.setString(newvalue);
}

/**
* Get value of field IN9702EFEC as a String.
*/
public String getIN9702EFEC()
{
return fieldIN9702EFEC.getString();
}

/**
* Set numeric field IN9702EFEC using a BigDecimal value.
*/
public void setIN9702EFEC(BigDecimal newvalue)
{
fieldIN9702EFEC.setBigDecimal(newvalue);
}

/**
* Return value of numeric field IN9702EFEC as a BigDecimal.
*/
public BigDecimal getBigDecimalIN9702EFEC()
{
return fieldIN9702EFEC.getBigDecimal();
}

/**
* Set field IN9702MTOT using a String value.
*/
public void setIN9702MTOT(String newvalue)
{
fieldIN9702MTOT.setString(newvalue);
}

/**
* Get value of field IN9702MTOT as a String.
*/
public String getIN9702MTOT()
{
return fieldIN9702MTOT.getString();
}

/**
* Set numeric field IN9702MTOT using a BigDecimal value.
*/
public void setIN9702MTOT(BigDecimal newvalue)
{
fieldIN9702MTOT.setBigDecimal(newvalue);
}

/**
* Return value of numeric field IN9702MTOT as a BigDecimal.
*/
public BigDecimal getBigDecimalIN9702MTOT()
{
return fieldIN9702MTOT.getBigDecimal();
}

/**
* Set field IN9702CIMN using a String value.
*/
public void setIN9702CIMN(String newvalue)
{
fieldIN9702CIMN.setString(newvalue);
}

/**
* Get value of field IN9702CIMN as a String.
*/
public String getIN9702CIMN()
{
return fieldIN9702CIMN.getString();
}

/**
* Set field IN9702CIML using a String value.
*/
public void setIN9702CIML(String newvalue)
{
fieldIN9702CIML.setString(newvalue);
}

/**
* Get value of field IN9702CIML as a String.
*/
public String getIN9702CIML()
{
return fieldIN9702CIML.getString();
}

/**
* Set field IN9702CONC using a String value.
*/
public void setIN9702CONC(String newvalue)
{
fieldIN9702CONC.setString(newvalue);
}

/**
* Get value of field IN9702CONC as a String.
*/
public String getIN9702CONC()
{
return fieldIN9702CONC.getString();
}

/**
* Set field IN9702DESC using a String value.
*/
public void setIN9702DESC(String newvalue)
{
fieldIN9702DESC.setString(newvalue);
}

/**
* Get value of field IN9702DESC as a String.
*/
public String getIN9702DESC()
{
return fieldIN9702DESC.getString();
}

/**
* Set field IN9702FVCT using a String value.
*/
public void setIN9702FVCT(String newvalue)
{
fieldIN9702FVCT.setString(newvalue);
}

/**
* Get value of field IN9702FVCT as a String.
*/
public String getIN9702FVCT()
{
return fieldIN9702FVCT.getString();
}

/**
* Set field IN9702CADU using a String value.
*/
public void setIN9702CADU(String newvalue)
{
fieldIN9702CADU.setString(newvalue);
}

/**
* Get value of field IN9702CADU as a String.
*/
public String getIN9702CADU()
{
return fieldIN9702CADU.getString();
}

/**
* Set numeric field IN9702CADU using a BigDecimal value.
*/
public void setIN9702CADU(BigDecimal newvalue)
{
fieldIN9702CADU.setBigDecimal(newvalue);
}

/**
* Return value of numeric field IN9702CADU as a BigDecimal.
*/
public BigDecimal getBigDecimalIN9702CADU()
{
return fieldIN9702CADU.getBigDecimal();
}

/**
* Set field IN9702NADU using a String value.
*/
public void setIN9702NADU(String newvalue)
{
fieldIN9702NADU.setString(newvalue);
}

/**
* Get value of field IN9702NADU as a String.
*/
public String getIN9702NADU()
{
return fieldIN9702NADU.getString();
}

/**
* Set field IN9702NEXP using a String value.
*/
public void setIN9702NEXP(String newvalue)
{
fieldIN9702NEXP.setString(newvalue);
}

/**
* Get value of field IN9702NEXP as a String.
*/
public String getIN9702NEXP()
{
return fieldIN9702NEXP.getString();
}

/**
* Set field IN9702NPOR using a String value.
*/
public void setIN9702NPOR(String newvalue)
{
fieldIN9702NPOR.setString(newvalue);
}

/**
* Get value of field IN9702NPOR as a String.
*/
public String getIN9702NPOR()
{
return fieldIN9702NPOR.getString();
}

/**
* Set field IN9702CCAD using a String value.
*/
public void setIN9702CCAD(String newvalue)
{
fieldIN9702CCAD.setString(newvalue);
}

/**
* Get value of field IN9702CCAD as a String.
*/
public String getIN9702CCAD()
{
return fieldIN9702CCAD.getString();
}

/**
* Set numeric field IN9702CCAD using a BigDecimal value.
*/
public void setIN9702CCAD(BigDecimal newvalue)
{
fieldIN9702CCAD.setBigDecimal(newvalue);
}

/**
* Return value of numeric field IN9702CCAD as a BigDecimal.
*/
public BigDecimal getBigDecimalIN9702CCAD()
{
return fieldIN9702CCAD.getBigDecimal();
}

/**
* Set field IN9702CSAD using a String value.
*/
public void setIN9702CSAD(String newvalue)
{
fieldIN9702CSAD.setString(newvalue);
}

/**
* Get value of field IN9702CSAD as a String.
*/
public String getIN9702CSAD()
{
return fieldIN9702CSAD.getString();
}

/**
* Set numeric field IN9702CSAD using a BigDecimal value.
*/
public void setIN9702CSAD(BigDecimal newvalue)
{
fieldIN9702CSAD.setBigDecimal(newvalue);
}

/**
* Return value of numeric field IN9702CSAD as a BigDecimal.
*/
public BigDecimal getBigDecimalIN9702CSAD()
{
return fieldIN9702CSAD.getBigDecimal();
}

/**
* Set field IN9702CING using a String value.
*/
public void setIN9702CING(String newvalue)
{
fieldIN9702CING.setString(newvalue);
}

/**
* Get value of field IN9702CING as a String.
*/
public String getIN9702CING()
{
return fieldIN9702CING.getString();
}

/**
* Set numeric field IN9702CING using a BigDecimal value.
*/
public void setIN9702CING(BigDecimal newvalue)
{
fieldIN9702CING.setBigDecimal(newvalue);
}

/**
* Return value of numeric field IN9702CING as a BigDecimal.
*/
public BigDecimal getBigDecimalIN9702CING()
{
return fieldIN9702CING.getBigDecimal();
}

/**
* Set field IN9702CERO using a String value.
*/
public void setIN9702CERO(String newvalue)
{
fieldIN9702CERO.setString(newvalue);
}

/**
* Get value of field IN9702CERO as a String.
*/
public String getIN9702CERO()
{
return fieldIN9702CERO.getString();
}

/**
* Set numeric field IN9702CERO using a BigDecimal value.
*/
public void setIN9702CERO(BigDecimal newvalue)
{
fieldIN9702CERO.setBigDecimal(newvalue);
}

/**
* Return value of numeric field IN9702CERO as a BigDecimal.
*/
public BigDecimal getBigDecimalIN9702CERO()
{
return fieldIN9702CERO.getBigDecimal();
}

/**
* Set field IN9702IT90 using a String value.
*/
public void setIN9702IT90(String newvalue)
{
fieldIN9702IT90.setString(newvalue);
}

/**
* Get value of field IN9702IT90 as a String.
*/
public String getIN9702IT90()
{
return fieldIN9702IT90.getString();
}

/**
* Set numeric field IN9702IT90 using a BigDecimal value.
*/
public void setIN9702IT90(BigDecimal newvalue)
{
fieldIN9702IT90.setBigDecimal(newvalue);
}

/**
* Return value of numeric field IN9702IT90 as a BigDecimal.
*/
public BigDecimal getBigDecimalIN9702IT90()
{
return fieldIN9702IT90.getBigDecimal();
}

/**
* Set field IN9702ICAJ using a String value.
*/
public void setIN9702ICAJ(String newvalue)
{
fieldIN9702ICAJ.setString(newvalue);
}

/**
* Get value of field IN9702ICAJ as a String.
*/
public String getIN9702ICAJ()
{
return fieldIN9702ICAJ.getString();
}

/**
* Set field IN9702CTRS using a String value.
*/
public void setIN9702CTRS(String newvalue)
{
fieldIN9702CTRS.setString(newvalue);
}

/**
* Get value of field IN9702CTRS as a String.
*/
public String getIN9702CTRS()
{
return fieldIN9702CTRS.getString();
}

/**
* Set numeric field IN9702CTRS using a BigDecimal value.
*/
public void setIN9702CTRS(BigDecimal newvalue)
{
fieldIN9702CTRS.setBigDecimal(newvalue);
}

/**
* Return value of numeric field IN9702CTRS as a BigDecimal.
*/
public BigDecimal getBigDecimalIN9702CTRS()
{
return fieldIN9702CTRS.getBigDecimal();
}

/**
* Set field IN9702NTRS using a String value.
*/
public void setIN9702NTRS(String newvalue)
{
fieldIN9702NTRS.setString(newvalue);
}

/**
* Get value of field IN9702NTRS as a String.
*/
public String getIN9702NTRS()
{
return fieldIN9702NTRS.getString();
}

/**
* Set numeric field IN9702NTRS using a BigDecimal value.
*/
public void setIN9702NTRS(BigDecimal newvalue)
{
fieldIN9702NTRS.setBigDecimal(newvalue);
}

/**
* Return value of numeric field IN9702NTRS as a BigDecimal.
*/
public BigDecimal getBigDecimalIN9702NTRS()
{
return fieldIN9702NTRS.getBigDecimal();
}

/**
* Set field IN9702TXNN using a String value.
*/
public void setIN9702TXNN(String newvalue)
{
fieldIN9702TXNN.setString(newvalue);
}

/**
* Get value of field IN9702TXNN as a String.
*/
public String getIN9702TXNN()
{
return fieldIN9702TXNN.getString();
}

/**
* Set numeric field IN9702TXNN using a BigDecimal value.
*/
public void setIN9702TXNN(BigDecimal newvalue)
{
fieldIN9702TXNN.setBigDecimal(newvalue);
}

/**
* Return value of numeric field IN9702TXNN as a BigDecimal.
*/
public BigDecimal getBigDecimalIN9702TXNN()
{
return fieldIN9702TXNN.getBigDecimal();
}

/**
* Set field IN9702CSBA using a String value.
*/
public void setIN9702CSBA(String newvalue)
{
fieldIN9702CSBA.setString(newvalue);
}

/**
* Get value of field IN9702CSBA as a String.
*/
public String getIN9702CSBA()
{
return fieldIN9702CSBA.getString();
}

/**
* Set numeric field IN9702CSBA using a BigDecimal value.
*/
public void setIN9702CSBA(BigDecimal newvalue)
{
fieldIN9702CSBA.setBigDecimal(newvalue);
}

/**
* Return value of numeric field IN9702CSBA as a BigDecimal.
*/
public BigDecimal getBigDecimalIN9702CSBA()
{
return fieldIN9702CSBA.getBigDecimal();
}

/**
* Set field IN9702IOPE using a String value.
*/
public void setIN9702IOPE(String newvalue)
{
fieldIN9702IOPE.setString(newvalue);
}

/**
* Get value of field IN9702IOPE as a String.
*/
public String getIN9702IOPE()
{
return fieldIN9702IOPE.getString();
}

/**
* Set field IN9702NAUT using a String value.
*/
public void setIN9702NAUT(String newvalue)
{
fieldIN9702NAUT.setString(newvalue);
}

/**
* Get value of field IN9702NAUT as a String.
*/
public String getIN9702NAUT()
{
return fieldIN9702NAUT.getString();
}

/**
* Set field IN9702RSOC using a String value.
*/
public void setIN9702RSOC(String newvalue)
{
fieldIN9702RSOC.setString(newvalue);
}

/**
* Get value of field IN9702RSOC as a String.
*/
public String getIN9702RSOC()
{
return fieldIN9702RSOC.getString();
}

/**
* Set field IN9702MIST using a String value.
*/
public void setIN9702MIST(String newvalue)
{
fieldIN9702MIST.setString(newvalue);
}

/**
* Get value of field IN9702MIST as a String.
*/
public String getIN9702MIST()
{
return fieldIN9702MIST.getString();
}

/**
* Set field IN9702IREC using a String value.
*/
public void setIN9702IREC(String newvalue)
{
fieldIN9702IREC.setString(newvalue);
}

/**
* Get value of field IN9702IREC as a String.
*/
public String getIN9702IREC()
{
return fieldIN9702IREC.getString();
}

/**
* Set field IN9702MREC using a String value.
*/
public void setIN9702MREC(String newvalue)
{
fieldIN9702MREC.setString(newvalue);
}

/**
* Get value of field IN9702MREC as a String.
*/
public String getIN9702MREC()
{
return fieldIN9702MREC.getString();
}

/**
* Set field IN9702FILL using a String value.
*/
public void setIN9702FILL(String newvalue)
{
fieldIN9702FILL.setString(newvalue);
}

/**
* Get value of field IN9702FILL as a String.
*/
public String getIN9702FILL()
{
return fieldIN9702FILL.getString();
}

}
