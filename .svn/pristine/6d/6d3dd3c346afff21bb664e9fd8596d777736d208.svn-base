package com.activo.gateway.dibs.messages;

import java.math.BigDecimal;
import java.util.Hashtable;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;

public class IN097001Message extends MessageRecord
{
	  final static String fldnames[] = {
          "IN9701IDUS",
          "IN9701BVDM",
          "IN9701BVDD",
          "IN9701BVDY",
          "IN9701TSPI",
          "IN9701NTER",
          "IN9701CAGE",
          "IN9701RIFC",
          "IN9701RIFP",
          "IN9701CFOR",
          "IN9701NPLA",
          "IN9701IDCO",
          "IN9701NCTA",
          "IN9701TCTA",
          "IN9701CRES",
          "IN9701MRES",
          "IN9701ANTI",
          "IN9701ESTA",
          "IN9701PLIQ",
          "IN9701MTOT",
          "IN9701CIMN",
          "IN9701CIML",
          "IN9701CONC",
          "IN9701DESC",
          "IN9701FVCT",
          "IN9701CADU",
          "IN9701NADU",
          "IN9701NEXP",
          "IN9701NPOR",
          "IN9701UFUT",
          "IN9701EOF1"
        };
final static String tnames[] = {
        "IN9701IDUS",
        "IN9701BVDM",
        "IN9701BVDD",
        "IN9701BVDY",
        "IN9701TSPI",
        "IN9701NTER",
        "IN9701CAGE",
        "IN9701RIFC",
        "IN9701RIFP",
        "IN9701CFOR",
        "IN9701NPLA",
        "IN9701IDCO",
        "IN9701NCTA",
        "IN9701TCTA",
        "IN9701CRES",
        "IN9701MRES",
        "IN9701ANTI",
        "IN9701ESTA",
        "IN9701PLIQ",
        "IN9701MTOT",
        "IN9701CIMN",
        "IN9701CIML",
        "IN9701CONC",
        "IN9701DESC",
        "IN9701FVCT",
        "IN9701CADU",
        "IN9701NADU",
        "IN9701NEXP",
        "IN9701NPOR",
        "IN9701UFUT",
        "IN9701EOF1"
      };
final static String fid = "1140708125534";
final static String rid = "3E9F8D35CC631";
final static String fmtname = "IN097001";
final int FIELDCOUNT = 31;
private static Hashtable tlookup = new Hashtable();
private CharacterField fieldIN9701IDUS = null;
private DecimalField fieldIN9701BVDM = null;
private DecimalField fieldIN9701BVDD = null;
private DecimalField fieldIN9701BVDY = null;
private CharacterField fieldIN9701TSPI = null;
private CharacterField fieldIN9701NTER = null;
private CharacterField fieldIN9701CAGE = null;
private DecimalField fieldIN9701RIFC = null;
private CharacterField fieldIN9701RIFP = null;
private CharacterField fieldIN9701CFOR = null;
private CharacterField fieldIN9701NPLA = null;
private CharacterField fieldIN9701IDCO = null;
private CharacterField fieldIN9701NCTA = null;
private CharacterField fieldIN9701TCTA = null;
private CharacterField fieldIN9701CRES = null;
private CharacterField fieldIN9701MRES = null;
private DecimalField fieldIN9701ANTI = null;
private CharacterField fieldIN9701ESTA = null;
private CharacterField fieldIN9701PLIQ = null;
private DecimalField fieldIN9701MTOT = null;
private CharacterField fieldIN9701CIMN = null;
private CharacterField fieldIN9701CIML = null;
private CharacterField fieldIN9701CONC = null;
private CharacterField fieldIN9701DESC = null;
private CharacterField fieldIN9701FVCT = null;
private CharacterField fieldIN9701CADU = null;
private CharacterField fieldIN9701NADU = null;
private CharacterField fieldIN9701NEXP = null;
private CharacterField fieldIN9701NPOR = null;
private CharacterField fieldIN9701UFUT = null;
private CharacterField fieldIN9701EOF1 = null;

/**
* Constructor for IN097001Message.
*/
public IN097001Message()
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
recordsize = 580;
fileid = fid;
recordid = rid;
message = new byte[getByteLength()];
formatname = fmtname;
fieldnames = fldnames;
tagnames = tnames;
fields = new MessageField[FIELDCOUNT];

fields[0] = fieldIN9701IDUS =
new CharacterField(message, HEADERSIZE + 0, 10, "IN9701IDUS");
fields[1] = fieldIN9701BVDM =
new DecimalField(message, HEADERSIZE + 10, 3, 0, "IN9701BVDM");
fields[2] = fieldIN9701BVDD =
new DecimalField(message, HEADERSIZE + 13, 3, 0, "IN9701BVDD");
fields[3] = fieldIN9701BVDY =
new DecimalField(message, HEADERSIZE + 16, 3, 0, "IN9701BVDY");
fields[4] = fieldIN9701TSPI =
new CharacterField(message, HEADERSIZE + 19, 6, "IN9701TSPI");
fields[5] = fieldIN9701NTER =
new CharacterField(message, HEADERSIZE + 25, 8, "IN9701NTER");
fields[6] = fieldIN9701CAGE =
new CharacterField(message, HEADERSIZE + 33, 4, "IN9701CAGE");
fields[7] = fieldIN9701RIFC =
new DecimalField(message, HEADERSIZE + 37, 11, 0, "IN9701RIFC");
fields[8] = fieldIN9701RIFP =
new CharacterField(message, HEADERSIZE + 48, 10, "IN9701RIFP");
fields[9] = fieldIN9701CFOR =
new CharacterField(message, HEADERSIZE + 58, 5, "IN9701CFOR");
fields[10] = fieldIN9701NPLA =
new CharacterField(message, HEADERSIZE + 63, 10, "IN9701NPLA");
fields[11] = fieldIN9701IDCO =
new CharacterField(message, HEADERSIZE + 73, 20, "IN9701IDCO");
fields[12] = fieldIN9701NCTA =
new CharacterField(message, HEADERSIZE + 93, 20, "IN9701NCTA");
fields[13] = fieldIN9701TCTA =
new CharacterField(message, HEADERSIZE + 113, 2, "IN9701TCTA");
fields[14] = fieldIN9701CRES =
new CharacterField(message, HEADERSIZE + 115, 2, "IN9701CRES");
fields[15] = fieldIN9701MRES =
new CharacterField(message, HEADERSIZE + 117, 25, "IN9701MRES");
fields[16] = fieldIN9701ANTI =
new DecimalField(message, HEADERSIZE + 142, 2, 0, "IN9701ANTI");
fields[17] = fieldIN9701ESTA =
new CharacterField(message, HEADERSIZE + 144, 1, "IN9701ESTA");
fields[18] = fieldIN9701PLIQ =
new CharacterField(message, HEADERSIZE + 145, 8, "IN9701PLIQ");
fields[19] = fieldIN9701MTOT =
new DecimalField(message, HEADERSIZE + 153, 19, 2, "IN9701MTOT");
fields[20] = fieldIN9701CIMN =
new CharacterField(message, HEADERSIZE + 172, 5, "IN9701CIMN");
fields[21] = fieldIN9701CIML =
new CharacterField(message, HEADERSIZE + 177, 26, "IN9701CIML");
fields[22] = fieldIN9701CONC =
new CharacterField(message, HEADERSIZE + 203, 80, "IN9701CONC");
fields[23] = fieldIN9701DESC =
new CharacterField(message, HEADERSIZE + 283, 80, "IN9701DESC");
fields[24] = fieldIN9701FVCT =
new CharacterField(message, HEADERSIZE + 363, 8, "IN9701FVCT");
fields[25] = fieldIN9701CADU =
new CharacterField(message, HEADERSIZE + 371, 6, "IN9701CADU");
fields[26] = fieldIN9701NADU =
new CharacterField(message, HEADERSIZE + 377, 80, "IN9701NADU");
fields[27] = fieldIN9701NEXP =
new CharacterField(message, HEADERSIZE + 457, 20, "IN9701NEXP");
fields[28] = fieldIN9701NPOR =
new CharacterField(message, HEADERSIZE + 477, 5, "IN9701NPOR");
fields[29] = fieldIN9701UFUT =
new CharacterField(message, HEADERSIZE + 482, 97, "IN9701UFUT");
fields[30] = fieldIN9701EOF1 =
new CharacterField(message, HEADERSIZE + 579, 1, "IN9701EOF1");

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
* Set field IN9701IDUS using a String value.
*/
public void setIN9701IDUS(String newvalue)
{
fieldIN9701IDUS.setString(newvalue);
}

/**
* Get value of field IN9701IDUS as a String.
*/
public String getIN9701IDUS()
{
return fieldIN9701IDUS.getString();
}

/**
* Set field IN9701BVDM using a String value.
*/
public void setIN9701BVDM(String newvalue)
{
fieldIN9701BVDM.setString(newvalue);
}

/**
* Get value of field IN9701BVDM as a String.
*/
public String getIN9701BVDM()
{
return fieldIN9701BVDM.getString();
}

/**
* Set numeric field IN9701BVDM using a BigDecimal value.
*/
public void setIN9701BVDM(BigDecimal newvalue)
{
fieldIN9701BVDM.setBigDecimal(newvalue);
}

/**
* Return value of numeric field IN9701BVDM as a BigDecimal.
*/
public BigDecimal getBigDecimalIN9701BVDM()
{
return fieldIN9701BVDM.getBigDecimal();
}

/**
* Set field IN9701BVDD using a String value.
*/
public void setIN9701BVDD(String newvalue)
{
fieldIN9701BVDD.setString(newvalue);
}

/**
* Get value of field IN9701BVDD as a String.
*/
public String getIN9701BVDD()
{
return fieldIN9701BVDD.getString();
}

/**
* Set numeric field IN9701BVDD using a BigDecimal value.
*/
public void setIN9701BVDD(BigDecimal newvalue)
{
fieldIN9701BVDD.setBigDecimal(newvalue);
}

/**
* Return value of numeric field IN9701BVDD as a BigDecimal.
*/
public BigDecimal getBigDecimalIN9701BVDD()
{
return fieldIN9701BVDD.getBigDecimal();
}

/**
* Set field IN9701BVDY using a String value.
*/
public void setIN9701BVDY(String newvalue)
{
fieldIN9701BVDY.setString(newvalue);
}

/**
* Get value of field IN9701BVDY as a String.
*/
public String getIN9701BVDY()
{
return fieldIN9701BVDY.getString();
}

/**
* Set numeric field IN9701BVDY using a BigDecimal value.
*/
public void setIN9701BVDY(BigDecimal newvalue)
{
fieldIN9701BVDY.setBigDecimal(newvalue);
}

/**
* Return value of numeric field IN9701BVDY as a BigDecimal.
*/
public BigDecimal getBigDecimalIN9701BVDY()
{
return fieldIN9701BVDY.getBigDecimal();
}

/**
* Set field IN9701TSPI using a String value.
*/
public void setIN9701TSPI(String newvalue)
{
fieldIN9701TSPI.setString(newvalue);
}

/**
* Get value of field IN9701TSPI as a String.
*/
public String getIN9701TSPI()
{
return fieldIN9701TSPI.getString();
}

/**
* Set field IN9701NTER using a String value.
*/
public void setIN9701NTER(String newvalue)
{
fieldIN9701NTER.setString(newvalue);
}

/**
* Get value of field IN9701NTER as a String.
*/
public String getIN9701NTER()
{
return fieldIN9701NTER.getString();
}

/**
* Set field IN9701CAGE using a String value.
*/
public void setIN9701CAGE(String newvalue)
{
fieldIN9701CAGE.setString(newvalue);
}

/**
* Get value of field IN9701CAGE as a String.
*/
public String getIN9701CAGE()
{
return fieldIN9701CAGE.getString();
}

/**
* Set field IN9701RIFC using a String value.
*/
public void setIN9701RIFC(String newvalue)
{
fieldIN9701RIFC.setString(newvalue);
}

/**
* Get value of field IN9701RIFC as a String.
*/
public String getIN9701RIFC()
{
return fieldIN9701RIFC.getString();
}

/**
* Set numeric field IN9701RIFC using a BigDecimal value.
*/
public void setIN9701RIFC(BigDecimal newvalue)
{
fieldIN9701RIFC.setBigDecimal(newvalue);
}

/**
* Return value of numeric field IN9701RIFC as a BigDecimal.
*/
public BigDecimal getBigDecimalIN9701RIFC()
{
return fieldIN9701RIFC.getBigDecimal();
}

/**
* Set field IN9701RIFP using a String value.
*/
public void setIN9701RIFP(String newvalue)
{
fieldIN9701RIFP.setString(newvalue);
}

/**
* Get value of field IN9701RIFP as a String.
*/
public String getIN9701RIFP()
{
return fieldIN9701RIFP.getString();
}

/**
* Set field IN9701CFOR using a String value.
*/
public void setIN9701CFOR(String newvalue)
{
fieldIN9701CFOR.setString(newvalue);
}

/**
* Get value of field IN9701CFOR as a String.
*/
public String getIN9701CFOR()
{
return fieldIN9701CFOR.getString();
}

/**
* Set field IN9701NPLA using a String value.
*/
public void setIN9701NPLA(String newvalue)
{
fieldIN9701NPLA.setString(newvalue);
}

/**
* Get value of field IN9701NPLA as a String.
*/
public String getIN9701NPLA()
{
return fieldIN9701NPLA.getString();
}

/**
* Set field IN9701IDCO using a String value.
*/
public void setIN9701IDCO(String newvalue)
{
fieldIN9701IDCO.setString(newvalue);
}

/**
* Get value of field IN9701IDCO as a String.
*/
public String getIN9701IDCO()
{
return fieldIN9701IDCO.getString();
}

/**
* Set field IN9701NCTA using a String value.
*/
public void setIN9701NCTA(String newvalue)
{
fieldIN9701NCTA.setString(newvalue);
}

/**
* Get value of field IN9701NCTA as a String.
*/
public String getIN9701NCTA()
{
return fieldIN9701NCTA.getString();
}

/**
* Set field IN9701TCTA using a String value.
*/
public void setIN9701TCTA(String newvalue)
{
fieldIN9701TCTA.setString(newvalue);
}

/**
* Get value of field IN9701TCTA as a String.
*/
public String getIN9701TCTA()
{
return fieldIN9701TCTA.getString();
}

/**
* Set field IN9701CRES using a String value.
*/
public void setIN9701CRES(String newvalue)
{
fieldIN9701CRES.setString(newvalue);
}

/**
* Get value of field IN9701CRES as a String.
*/
public String getIN9701CRES()
{
return fieldIN9701CRES.getString();
}

/**
* Set field IN9701MRES using a String value.
*/
public void setIN9701MRES(String newvalue)
{
fieldIN9701MRES.setString(newvalue);
}

/**
* Get value of field IN9701MRES as a String.
*/
public String getIN9701MRES()
{
return fieldIN9701MRES.getString();
}

/**
* Set field IN9701ANTI using a String value.
*/
public void setIN9701ANTI(String newvalue)
{
fieldIN9701ANTI.setString(newvalue);
}

/**
* Get value of field IN9701ANTI as a String.
*/
public String getIN9701ANTI()
{
return fieldIN9701ANTI.getString();
}

/**
* Set numeric field IN9701ANTI using a BigDecimal value.
*/
public void setIN9701ANTI(BigDecimal newvalue)
{
fieldIN9701ANTI.setBigDecimal(newvalue);
}

/**
* Return value of numeric field IN9701ANTI as a BigDecimal.
*/
public BigDecimal getBigDecimalIN9701ANTI()
{
return fieldIN9701ANTI.getBigDecimal();
}

/**
* Set field IN9701ESTA using a String value.
*/
public void setIN9701ESTA(String newvalue)
{
fieldIN9701ESTA.setString(newvalue);
}

/**
* Get value of field IN9701ESTA as a String.
*/
public String getIN9701ESTA()
{
return fieldIN9701ESTA.getString();
}

/**
* Set field IN9701PLIQ using a String value.
*/
public void setIN9701PLIQ(String newvalue)
{
fieldIN9701PLIQ.setString(newvalue);
}

/**
* Get value of field IN9701PLIQ as a String.
*/
public String getIN9701PLIQ()
{
return fieldIN9701PLIQ.getString();
}

/**
* Set field IN9701MTOT using a String value.
*/
public void setIN9701MTOT(String newvalue)
{
fieldIN9701MTOT.setString(newvalue);
}

/**
* Get value of field IN9701MTOT as a String.
*/
public String getIN9701MTOT()
{
return fieldIN9701MTOT.getString();
}

/**
* Set numeric field IN9701MTOT using a BigDecimal value.
*/
public void setIN9701MTOT(BigDecimal newvalue)
{
fieldIN9701MTOT.setBigDecimal(newvalue);
}

/**
* Return value of numeric field IN9701MTOT as a BigDecimal.
*/
public BigDecimal getBigDecimalIN9701MTOT()
{
return fieldIN9701MTOT.getBigDecimal();
}

/**
* Set field IN9701CIMN using a String value.
*/
public void setIN9701CIMN(String newvalue)
{
fieldIN9701CIMN.setString(newvalue);
}

/**
* Get value of field IN9701CIMN as a String.
*/
public String getIN9701CIMN()
{
return fieldIN9701CIMN.getString();
}

/**
* Set field IN9701CIML using a String value.
*/
public void setIN9701CIML(String newvalue)
{
fieldIN9701CIML.setString(newvalue);
}

/**
* Get value of field IN9701CIML as a String.
*/
public String getIN9701CIML()
{
return fieldIN9701CIML.getString();
}

/**
* Set field IN9701CONC using a String value.
*/
public void setIN9701CONC(String newvalue)
{
fieldIN9701CONC.setString(newvalue);
}

/**
* Get value of field IN9701CONC as a String.
*/
public String getIN9701CONC()
{
return fieldIN9701CONC.getString();
}

/**
* Set field IN9701DESC using a String value.
*/
public void setIN9701DESC(String newvalue)
{
fieldIN9701DESC.setString(newvalue);
}

/**
* Get value of field IN9701DESC as a String.
*/
public String getIN9701DESC()
{
return fieldIN9701DESC.getString();
}

/**
* Set field IN9701FVCT using a String value.
*/
public void setIN9701FVCT(String newvalue)
{
fieldIN9701FVCT.setString(newvalue);
}

/**
* Get value of field IN9701FVCT as a String.
*/
public String getIN9701FVCT()
{
return fieldIN9701FVCT.getString();
}

/**
* Set field IN9701CADU using a String value.
*/
public void setIN9701CADU(String newvalue)
{
fieldIN9701CADU.setString(newvalue);
}

/**
* Get value of field IN9701CADU as a String.
*/
public String getIN9701CADU()
{
return fieldIN9701CADU.getString();
}

/**
* Set field IN9701NADU using a String value.
*/
public void setIN9701NADU(String newvalue)
{
fieldIN9701NADU.setString(newvalue);
}

/**
* Get value of field IN9701NADU as a String.
*/
public String getIN9701NADU()
{
return fieldIN9701NADU.getString();
}

/**
* Set field IN9701NEXP using a String value.
*/
public void setIN9701NEXP(String newvalue)
{
fieldIN9701NEXP.setString(newvalue);
}

/**
* Get value of field IN9701NEXP as a String.
*/
public String getIN9701NEXP()
{
return fieldIN9701NEXP.getString();
}

/**
* Set field IN9701NPOR using a String value.
*/
public void setIN9701NPOR(String newvalue)
{
fieldIN9701NPOR.setString(newvalue);
}

/**
* Get value of field IN9701NPOR as a String.
*/
public String getIN9701NPOR()
{
return fieldIN9701NPOR.getString();
}

/**
* Set field IN9701UFUT using a String value.
*/
public void setIN9701UFUT(String newvalue)
{
fieldIN9701UFUT.setString(newvalue);
}

/**
* Get value of field IN9701UFUT as a String.
*/
public String getIN9701UFUT()
{
return fieldIN9701UFUT.getString();
}

/**
* Set field IN9701EOF1 using a String value.
*/
public void setIN9701EOF1(String newvalue)
{
fieldIN9701EOF1.setString(newvalue);
}

/**
* Get value of field IN9701EOF1 as a String.
*/
public String getIN9701EOF1()
{
return fieldIN9701EOF1.getString();
}

}
