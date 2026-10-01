package com.activo.gateway.dibs.messages;
import java.math.BigDecimal;
import java.util.Hashtable;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;

public class AVAN001Message extends MessageRecord
{
  final static String fldnames[] = {
                                     "E01NUMTDC",
                                     "E01NUMCTA",
                                     "E01CLIENT",
                                     "E01MONTO",
                                     "E01CODTRA",
                                     "E01ERROR",
                                     "E01DESERR",
                                     "E01NUMREF"
                                   };
  final static String tnames[] = {
                                   "E01NUMTDC",
                                   "E01NUMCTA",
                                   "E01CLIENT",
                                   "E01MONTO",
                                   "E01CODTRA",
                                   "E01ERROR",
                                   "E01DESERR",
                                   "E01NUMREF"
                                 };
  final static String fid = "1140829160025";
  final static String rid = "4C812DD05CA06";
  final static String fmtname = "AVAN001";
  final int FIELDCOUNT = 8;
  private static Hashtable tlookup = new Hashtable();
  private CharacterField fieldE01NUMTDC = null;
  private CharacterField fieldE01NUMCTA = null;
  private CharacterField fieldE01CLIENT = null;
  private DecimalField fieldE01MONTO = null;
  private CharacterField fieldE01CODTRA = null;
  private CharacterField fieldE01ERROR = null;
  private CharacterField fieldE01DESERR = null;
  private DecimalField fieldE01NUMREF = null;

  /**
  * Constructor for AVAN001Message.
  */
  public AVAN001Message()
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
    recordsize = 96;
    fileid = fid;
    recordid = rid;
    message = new byte[getByteLength()];
    formatname = fmtname;
    fieldnames = fldnames;
    tagnames = tnames;
    fields = new MessageField[FIELDCOUNT];

    fields[0] = fieldE01NUMTDC =
    new CharacterField(message, HEADERSIZE + 0, 16, "E01NUMTDC");
    fields[1] = fieldE01NUMCTA =
    new CharacterField(message, HEADERSIZE + 16, 12, "E01NUMCTA");
    fields[2] = fieldE01CLIENT =
    new CharacterField(message, HEADERSIZE + 28, 9, "E01CLIENT");
    fields[3] = fieldE01MONTO =
    new DecimalField(message, HEADERSIZE + 37, 14, 2, "E01MONTO");
    fields[4] = fieldE01CODTRA =
    new CharacterField(message, HEADERSIZE + 51, 4, "E01CODTRA");
    fields[5] = fieldE01ERROR =
    new CharacterField(message, HEADERSIZE + 55, 1, "E01ERROR");
    fields[6] = fieldE01DESERR =
    new CharacterField(message, HEADERSIZE + 56, 30, "E01DESERR");
    fields[7] = fieldE01NUMREF =
    new DecimalField(message, HEADERSIZE + 86, 10, 0, "E01NUMREF");

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
  * Set field E01NUMTDC using a String value.
  */
  public void setE01NUMTDC(String newvalue)
  {
    fieldE01NUMTDC.setString(newvalue);
  }

  /**
  * Get value of field E01NUMTDC as a String.
  */
  public String getE01NUMTDC()
  {
    return fieldE01NUMTDC.getString();
  }

  /**
  * Set field E01NUMCTA using a String value.
  */
  public void setE01NUMCTA(String newvalue)
  {
    fieldE01NUMCTA.setString(newvalue);
  }

  /**
  * Get value of field E01NUMCTA as a String.
  */
  public String getE01NUMCTA()
  {
    return fieldE01NUMCTA.getString();
  }

  /**
  * Set field E01CLIENT using a String value.
  */
  public void setE01CLIENT(String newvalue)
  {
    fieldE01CLIENT.setString(newvalue);
  }

  /**
  * Get value of field E01CLIENT as a String.
  */
  public String getE01CLIENT()
  {
    return fieldE01CLIENT.getString();
  }

  /**
  * Set field E01MONTO using a String value.
  */
  public void setE01MONTO(String newvalue)
  {
    fieldE01MONTO.setString(newvalue);
  }

  /**
  * Get value of field E01MONTO as a String.
  */
  public String getE01MONTO()
  {
    return fieldE01MONTO.getString();
  }

  /**
  * Set numeric field E01MONTO using a BigDecimal value.
  */
  public void setE01MONTO(BigDecimal newvalue)
  {
    fieldE01MONTO.setBigDecimal(newvalue);
  }

  /**
  * Return value of numeric field E01MONTO as a BigDecimal.
  */
  public BigDecimal getBigDecimalE01MONTO()
  {
    return fieldE01MONTO.getBigDecimal();
  }

  /**
  * Set field E01CODTRA using a String value.
  */
  public void setE01CODTRA(String newvalue)
  {
    fieldE01CODTRA.setString(newvalue);
  }

  /**
  * Get value of field E01CODTRA as a String.
  */
  public String getE01CODTRA()
  {
    return fieldE01CODTRA.getString();
  }

  /**
  * Set field E01ERROR using a String value.
  */
  public void setE01ERROR(String newvalue)
  {
    fieldE01ERROR.setString(newvalue);
  }

  /**
  * Get value of field E01ERROR as a String.
  */
  public String getE01ERROR()
  {
    return fieldE01ERROR.getString();
  }

  /**
  * Set field E01DESERR using a String value.
  */
  public void setE01DESERR(String newvalue)
  {
    fieldE01DESERR.setString(newvalue);
  }

  /**
  * Get value of field E01DESERR as a String.
  */
  public String getE01DESERR()
  {
    return fieldE01DESERR.getString();
  }

  /**
  * Set field E01NUMREF using a String value.
  */
  public void setE01NUMREF(String newvalue)
  {
    fieldE01NUMREF.setString(newvalue);
  }

  /**
  * Get value of field E01NUMREF as a String.
  */
  public String getE01NUMREF()
  {
    return fieldE01NUMREF.getString();
  }

  /**
  * Set numeric field E01NUMREF using a BigDecimal value.
  */
  public void setE01NUMREF(BigDecimal newvalue)
  {
    fieldE01NUMREF.setBigDecimal(newvalue);
  }

  /**
  * Return value of numeric field E01NUMREF as a BigDecimal.
  */
  public BigDecimal getBigDecimalE01NUMREF()
  {
    return fieldE01NUMREF.getBigDecimal();
  }

}
