package com.activo.gateway.dibs.messages;
import java.math.BigDecimal;
import java.util.Hashtable;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;

public class EXTA001Message extends MessageRecord
{
  final static String fldnames[] = {
                                     "E01TIPMSG",
                                     "E02NUMTDC",
                                     "E02CLIENT",
                                     "E01FECHA",
                                     "E02MONTO",
                                     "E01SERIAL",
                                     "E01CANAL",
                                     "E01CODIGO",
                                     "E01CUENTA",
                                     "E01APLICA",
                                     "E01CEDULA",
                                     "E01RETCOD",
                                     "E01AUTCOD",
                                     "E01NUMMES",
                                     "E01COMISI",
                                     "E01PLAZO1",
                                     "E01MONTO1",
                                     "E01PLAZO2",
                                     "E01MONTO2",
                                     "E01PLAZO3",
                                     "E01MONTO3",
                                     "E01PLAZO4",
                                     "E01MONTO4",
                                     "E01PLAZO5",
                                     "E01MONTO5",
                                     "E01PRICUO",
                                     "E01NROCON",
                                     "E01DISPON",
                                     "E01REVERS",
                                     "E01CVV",
                                     "E01LIBRE",
                                     "E02ERROR",
                                     "E02DESERR",
                                     "E02NUMREF"
                                   };
  final static String tnames[] = {
                                   "E01TIPMSG",
                                   "E02NUMTDC",
                                   "E02CLIENT",
                                   "E01FECHA",
                                   "E02MONTO",
                                   "E01SERIAL",
                                   "E01CANAL",
                                   "E01CODIGO",
                                   "E01CUENTA",
                                   "E01APLICA",
                                   "E01CEDULA",
                                   "E01RETCOD",
                                   "E01AUTCOD",
                                   "E01NUMMES",
                                   "E01COMISI",
                                   "E01PLAZO1",
                                   "E01MONTO1",
                                   "E01PLAZO2",
                                   "E01MONTO2",
                                   "E01PLAZO3",
                                   "E01MONTO3",
                                   "E01PLAZO4",
                                   "E01MONTO4",
                                   "E01PLAZO5",
                                   "E01MONTO5",
                                   "E01PRICUO",
                                   "E01NROCON",
                                   "E01DISPON",
                                   "E01REVERS",
                                   "E01CVV",
                                   "E01LIBRE",
                                   "E02ERROR",
                                   "E02DESERR",
                                   "E02NUMREF"
                                 };
  final static String fid = "1141029102315";
  final static String rid = "3CEC6A267D662";
  final static String fmtname = "EXTA001";
  final int FIELDCOUNT = 34;
  private static Hashtable tlookup = new Hashtable();
  private CharacterField fieldE01TIPMSG = null;
  private CharacterField fieldE02NUMTDC = null;
  private DecimalField fieldE02CLIENT = null;
  private DecimalField fieldE01FECHA = null;
  private DecimalField fieldE02MONTO = null;
  private DecimalField fieldE01SERIAL = null;
  private DecimalField fieldE01CANAL = null;
  private DecimalField fieldE01CODIGO = null;
  private DecimalField fieldE01CUENTA = null;
  private DecimalField fieldE01APLICA = null;
  private DecimalField fieldE01CEDULA = null;
  private CharacterField fieldE01RETCOD = null;
  private CharacterField fieldE01AUTCOD = null;
  private DecimalField fieldE01NUMMES = null;
  private DecimalField fieldE01COMISI = null;
  private DecimalField fieldE01PLAZO1 = null;
  private DecimalField fieldE01MONTO1 = null;
  private DecimalField fieldE01PLAZO2 = null;
  private DecimalField fieldE01MONTO2 = null;
  private DecimalField fieldE01PLAZO3 = null;
  private DecimalField fieldE01MONTO3 = null;
  private DecimalField fieldE01PLAZO4 = null;
  private DecimalField fieldE01MONTO4 = null;
  private DecimalField fieldE01PLAZO5 = null;
  private DecimalField fieldE01MONTO5 = null;
  private DecimalField fieldE01PRICUO = null;
  private DecimalField fieldE01NROCON = null;
  private DecimalField fieldE01DISPON = null;
  private CharacterField fieldE01REVERS = null;
  private DecimalField fieldE01CVV = null;
  private CharacterField fieldE01LIBRE = null;
  private CharacterField fieldE02ERROR = null;
  private CharacterField fieldE02DESERR = null;
  private DecimalField fieldE02NUMREF = null;

  /**
  * Constructor for EXTA001Message.
  */
  public EXTA001Message()
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
    recordsize = 299;
    fileid = fid;
    recordid = rid;
    message = new byte[getByteLength()];
    formatname = fmtname;
    fieldnames = fldnames;
    tagnames = tnames;
    fields = new MessageField[FIELDCOUNT];

    fields[0] = fieldE01TIPMSG =
    new CharacterField(message, HEADERSIZE + 0, 1, "E01TIPMSG");
    fields[1] = fieldE02NUMTDC =
    new CharacterField(message, HEADERSIZE + 1, 16, "E02NUMTDC");
    fields[2] = fieldE02CLIENT =
    new DecimalField(message, HEADERSIZE + 17, 10, 0, "E02CLIENT");
    fields[3] = fieldE01FECHA =
    new DecimalField(message, HEADERSIZE + 27, 7, 0, "E01FECHA");
    fields[4] = fieldE02MONTO =
    new DecimalField(message, HEADERSIZE + 34, 14, 2, "E02MONTO");
    fields[5] = fieldE01SERIAL =
    new DecimalField(message, HEADERSIZE + 48, 7, 0, "E01SERIAL");
    fields[6] = fieldE01CANAL =
    new DecimalField(message, HEADERSIZE + 55, 3, 0, "E01CANAL");
    fields[7] = fieldE01CODIGO =
    new DecimalField(message, HEADERSIZE + 58, 4, 0, "E01CODIGO");
    fields[8] = fieldE01CUENTA =
    new DecimalField(message, HEADERSIZE + 62, 21, 0, "E01CUENTA");
    fields[9] = fieldE01APLICA =
    new DecimalField(message, HEADERSIZE + 83, 4, 0, "E01APLICA");
    fields[10] = fieldE01CEDULA =
    new DecimalField(message, HEADERSIZE + 87, 11, 0, "E01CEDULA");
    fields[11] = fieldE01RETCOD =
    new CharacterField(message, HEADERSIZE + 98, 4, "E01RETCOD");
    fields[12] = fieldE01AUTCOD =
    new CharacterField(message, HEADERSIZE + 102, 6, "E01AUTCOD");
    fields[13] = fieldE01NUMMES =
    new DecimalField(message, HEADERSIZE + 108, 3, 0, "E01NUMMES");
    fields[14] = fieldE01COMISI =
    new DecimalField(message, HEADERSIZE + 111, 14, 2, "E01COMISI");
    fields[15] = fieldE01PLAZO1 =
    new DecimalField(message, HEADERSIZE + 125, 3, 0, "E01PLAZO1");
    fields[16] = fieldE01MONTO1 =
    new DecimalField(message, HEADERSIZE + 128, 14, 2, "E01MONTO1");
    fields[17] = fieldE01PLAZO2 =
    new DecimalField(message, HEADERSIZE + 142, 3, 0, "E01PLAZO2");
    fields[18] = fieldE01MONTO2 =
    new DecimalField(message, HEADERSIZE + 145, 14, 2, "E01MONTO2");
    fields[19] = fieldE01PLAZO3 =
    new DecimalField(message, HEADERSIZE + 159, 3, 0, "E01PLAZO3");
    fields[20] = fieldE01MONTO3 =
    new DecimalField(message, HEADERSIZE + 162, 14, 2, "E01MONTO3");
    fields[21] = fieldE01PLAZO4 =
    new DecimalField(message, HEADERSIZE + 176, 3, 0, "E01PLAZO4");
    fields[22] = fieldE01MONTO4 =
    new DecimalField(message, HEADERSIZE + 179, 14, 2, "E01MONTO4");
    fields[23] = fieldE01PLAZO5 =
    new DecimalField(message, HEADERSIZE + 193, 3, 0, "E01PLAZO5");
    fields[24] = fieldE01MONTO5 =
    new DecimalField(message, HEADERSIZE + 196, 14, 2, "E01MONTO5");
    fields[25] = fieldE01PRICUO =
    new DecimalField(message, HEADERSIZE + 210, 14, 2, "E01PRICUO");
    fields[26] = fieldE01NROCON =
    new DecimalField(message, HEADERSIZE + 224, 9, 0, "E01NROCON");
    fields[27] = fieldE01DISPON =
    new DecimalField(message, HEADERSIZE + 233, 13, 0, "E01DISPON");
    fields[28] = fieldE01REVERS =
    new CharacterField(message, HEADERSIZE + 246, 1, "E01REVERS");
    fields[29] = fieldE01CVV =
    new DecimalField(message, HEADERSIZE + 247, 5, 0, "E01CVV");
    fields[30] = fieldE01LIBRE =
    new CharacterField(message, HEADERSIZE + 252, 6, "E01LIBRE");
    fields[31] = fieldE02ERROR =
    new CharacterField(message, HEADERSIZE + 258, 1, "E02ERROR");
    fields[32] = fieldE02DESERR =
    new CharacterField(message, HEADERSIZE + 259, 30, "E02DESERR");
    fields[33] = fieldE02NUMREF =
    new DecimalField(message, HEADERSIZE + 289, 10, 0, "E02NUMREF");

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
  * Set field E01TIPMSG using a String value.
  */
  public void setE01TIPMSG(String newvalue)
  {
    fieldE01TIPMSG.setString(newvalue);
  }

  /**
  * Get value of field E01TIPMSG as a String.
  */
  public String getE01TIPMSG()
  {
    return fieldE01TIPMSG.getString();
  }

  /**
  * Set field E02NUMTDC using a String value.
  */
  public void setE02NUMTDC(String newvalue)
  {
    fieldE02NUMTDC.setString(newvalue);
  }

  /**
  * Get value of field E02NUMTDC as a String.
  */
  public String getE02NUMTDC()
  {
    return fieldE02NUMTDC.getString();
  }

  /**
  * Set field E02CLIENT using a String value.
  */
  public void setE02CLIENT(String newvalue)
  {
    fieldE02CLIENT.setString(newvalue);
  }

  /**
  * Get value of field E02CLIENT as a String.
  */
  public String getE02CLIENT()
  {
    return fieldE02CLIENT.getString();
  }

  /**
  * Set numeric field E02CLIENT using a BigDecimal value.
  */
  public void setE02CLIENT(BigDecimal newvalue)
  {
    fieldE02CLIENT.setBigDecimal(newvalue);
  }

  /**
  * Return value of numeric field E02CLIENT as a BigDecimal.
  */
  public BigDecimal getBigDecimalE02CLIENT()
  {
    return fieldE02CLIENT.getBigDecimal();
  }

  /**
  * Set field E01FECHA using a String value.
  */
  public void setE01FECHA(String newvalue)
  {
    fieldE01FECHA.setString(newvalue);
  }

  /**
  * Get value of field E01FECHA as a String.
  */
  public String getE01FECHA()
  {
    return fieldE01FECHA.getString();
  }

  /**
  * Set numeric field E01FECHA using a BigDecimal value.
  */
  public void setE01FECHA(BigDecimal newvalue)
  {
    fieldE01FECHA.setBigDecimal(newvalue);
  }

  /**
  * Return value of numeric field E01FECHA as a BigDecimal.
  */
  public BigDecimal getBigDecimalE01FECHA()
  {
    return fieldE01FECHA.getBigDecimal();
  }

  /**
  * Set field E02MONTO using a String value.
  */
  public void setE02MONTO(String newvalue)
  {
    fieldE02MONTO.setString(newvalue);
  }

  /**
  * Get value of field E02MONTO as a String.
  */
  public String getE02MONTO()
  {
    return fieldE02MONTO.getString();
  }

  /**
  * Set numeric field E02MONTO using a BigDecimal value.
  */
  public void setE02MONTO(BigDecimal newvalue)
  {
    fieldE02MONTO.setBigDecimal(newvalue);
  }

  /**
  * Return value of numeric field E02MONTO as a BigDecimal.
  */
  public BigDecimal getBigDecimalE02MONTO()
  {
    return fieldE02MONTO.getBigDecimal();
  }

  /**
  * Set field E01SERIAL using a String value.
  */
  public void setE01SERIAL(String newvalue)
  {
    fieldE01SERIAL.setString(newvalue);
  }

  /**
  * Get value of field E01SERIAL as a String.
  */
  public String getE01SERIAL()
  {
    return fieldE01SERIAL.getString();
  }

  /**
  * Set numeric field E01SERIAL using a BigDecimal value.
  */
  public void setE01SERIAL(BigDecimal newvalue)
  {
    fieldE01SERIAL.setBigDecimal(newvalue);
  }

  /**
  * Return value of numeric field E01SERIAL as a BigDecimal.
  */
  public BigDecimal getBigDecimalE01SERIAL()
  {
    return fieldE01SERIAL.getBigDecimal();
  }

  /**
  * Set field E01CANAL using a String value.
  */
  public void setE01CANAL(String newvalue)
  {
    fieldE01CANAL.setString(newvalue);
  }

  /**
  * Get value of field E01CANAL as a String.
  */
  public String getE01CANAL()
  {
    return fieldE01CANAL.getString();
  }

  /**
  * Set numeric field E01CANAL using a BigDecimal value.
  */
  public void setE01CANAL(BigDecimal newvalue)
  {
    fieldE01CANAL.setBigDecimal(newvalue);
  }

  /**
  * Return value of numeric field E01CANAL as a BigDecimal.
  */
  public BigDecimal getBigDecimalE01CANAL()
  {
    return fieldE01CANAL.getBigDecimal();
  }

  /**
  * Set field E01CODIGO using a String value.
  */
  public void setE01CODIGO(String newvalue)
  {
    fieldE01CODIGO.setString(newvalue);
  }

  /**
  * Get value of field E01CODIGO as a String.
  */
  public String getE01CODIGO()
  {
    return fieldE01CODIGO.getString();
  }

  /**
  * Set numeric field E01CODIGO using a BigDecimal value.
  */
  public void setE01CODIGO(BigDecimal newvalue)
  {
    fieldE01CODIGO.setBigDecimal(newvalue);
  }

  /**
  * Return value of numeric field E01CODIGO as a BigDecimal.
  */
  public BigDecimal getBigDecimalE01CODIGO()
  {
    return fieldE01CODIGO.getBigDecimal();
  }

  /**
  * Set field E01CUENTA using a String value.
  */
  public void setE01CUENTA(String newvalue)
  {
    fieldE01CUENTA.setString(newvalue);
  }

  /**
  * Get value of field E01CUENTA as a String.
  */
  public String getE01CUENTA()
  {
    return fieldE01CUENTA.getString();
  }

  /**
  * Set numeric field E01CUENTA using a BigDecimal value.
  */
  public void setE01CUENTA(BigDecimal newvalue)
  {
    fieldE01CUENTA.setBigDecimal(newvalue);
  }

  /**
  * Return value of numeric field E01CUENTA as a BigDecimal.
  */
  public BigDecimal getBigDecimalE01CUENTA()
  {
    return fieldE01CUENTA.getBigDecimal();
  }

  /**
  * Set field E01APLICA using a String value.
  */
  public void setE01APLICA(String newvalue)
  {
    fieldE01APLICA.setString(newvalue);
  }

  /**
  * Get value of field E01APLICA as a String.
  */
  public String getE01APLICA()
  {
    return fieldE01APLICA.getString();
  }

  /**
  * Set numeric field E01APLICA using a BigDecimal value.
  */
  public void setE01APLICA(BigDecimal newvalue)
  {
    fieldE01APLICA.setBigDecimal(newvalue);
  }

  /**
  * Return value of numeric field E01APLICA as a BigDecimal.
  */
  public BigDecimal getBigDecimalE01APLICA()
  {
    return fieldE01APLICA.getBigDecimal();
  }

  /**
  * Set field E01CEDULA using a String value.
  */
  public void setE01CEDULA(String newvalue)
  {
    fieldE01CEDULA.setString(newvalue);
  }

  /**
  * Get value of field E01CEDULA as a String.
  */
  public String getE01CEDULA()
  {
    return fieldE01CEDULA.getString();
  }

  /**
  * Set numeric field E01CEDULA using a BigDecimal value.
  */
  public void setE01CEDULA(BigDecimal newvalue)
  {
    fieldE01CEDULA.setBigDecimal(newvalue);
  }

  /**
  * Return value of numeric field E01CEDULA as a BigDecimal.
  */
  public BigDecimal getBigDecimalE01CEDULA()
  {
    return fieldE01CEDULA.getBigDecimal();
  }

  /**
  * Set field E01RETCOD using a String value.
  */
  public void setE01RETCOD(String newvalue)
  {
    fieldE01RETCOD.setString(newvalue);
  }

  /**
  * Get value of field E01RETCOD as a String.
  */
  public String getE01RETCOD()
  {
    return fieldE01RETCOD.getString();
  }

  /**
  * Set field E01AUTCOD using a String value.
  */
  public void setE01AUTCOD(String newvalue)
  {
    fieldE01AUTCOD.setString(newvalue);
  }

  /**
  * Get value of field E01AUTCOD as a String.
  */
  public String getE01AUTCOD()
  {
    return fieldE01AUTCOD.getString();
  }

  /**
  * Set field E01NUMMES using a String value.
  */
  public void setE01NUMMES(String newvalue)
  {
    fieldE01NUMMES.setString(newvalue);
  }

  /**
  * Get value of field E01NUMMES as a String.
  */
  public String getE01NUMMES()
  {
    return fieldE01NUMMES.getString();
  }

  /**
  * Set numeric field E01NUMMES using a BigDecimal value.
  */
  public void setE01NUMMES(BigDecimal newvalue)
  {
    fieldE01NUMMES.setBigDecimal(newvalue);
  }

  /**
  * Return value of numeric field E01NUMMES as a BigDecimal.
  */
  public BigDecimal getBigDecimalE01NUMMES()
  {
    return fieldE01NUMMES.getBigDecimal();
  }

  /**
  * Set field E01COMISI using a String value.
  */
  public void setE01COMISI(String newvalue)
  {
    fieldE01COMISI.setString(newvalue);
  }

  /**
  * Get value of field E01COMISI as a String.
  */
  public String getE01COMISI()
  {
    return fieldE01COMISI.getString();
  }

  /**
  * Set numeric field E01COMISI using a BigDecimal value.
  */
  public void setE01COMISI(BigDecimal newvalue)
  {
    fieldE01COMISI.setBigDecimal(newvalue);
  }

  /**
  * Return value of numeric field E01COMISI as a BigDecimal.
  */
  public BigDecimal getBigDecimalE01COMISI()
  {
    return fieldE01COMISI.getBigDecimal();
  }

  /**
  * Set field E01PLAZO1 using a String value.
  */
  public void setE01PLAZO1(String newvalue)
  {
    fieldE01PLAZO1.setString(newvalue);
  }

  /**
  * Get value of field E01PLAZO1 as a String.
  */
  public String getE01PLAZO1()
  {
    return fieldE01PLAZO1.getString();
  }

  /**
  * Set numeric field E01PLAZO1 using a BigDecimal value.
  */
  public void setE01PLAZO1(BigDecimal newvalue)
  {
    fieldE01PLAZO1.setBigDecimal(newvalue);
  }

  /**
  * Return value of numeric field E01PLAZO1 as a BigDecimal.
  */
  public BigDecimal getBigDecimalE01PLAZO1()
  {
    return fieldE01PLAZO1.getBigDecimal();
  }

  /**
  * Set field E01MONTO1 using a String value.
  */
  public void setE01MONTO1(String newvalue)
  {
    fieldE01MONTO1.setString(newvalue);
  }

  /**
  * Get value of field E01MONTO1 as a String.
  */
  public String getE01MONTO1()
  {
    return fieldE01MONTO1.getString();
  }

  /**
  * Set numeric field E01MONTO1 using a BigDecimal value.
  */
  public void setE01MONTO1(BigDecimal newvalue)
  {
    fieldE01MONTO1.setBigDecimal(newvalue);
  }

  /**
  * Return value of numeric field E01MONTO1 as a BigDecimal.
  */
  public BigDecimal getBigDecimalE01MONTO1()
  {
    return fieldE01MONTO1.getBigDecimal();
  }

  /**
  * Set field E01PLAZO2 using a String value.
  */
  public void setE01PLAZO2(String newvalue)
  {
    fieldE01PLAZO2.setString(newvalue);
  }

  /**
  * Get value of field E01PLAZO2 as a String.
  */
  public String getE01PLAZO2()
  {
    return fieldE01PLAZO2.getString();
  }

  /**
  * Set numeric field E01PLAZO2 using a BigDecimal value.
  */
  public void setE01PLAZO2(BigDecimal newvalue)
  {
    fieldE01PLAZO2.setBigDecimal(newvalue);
  }

  /**
  * Return value of numeric field E01PLAZO2 as a BigDecimal.
  */
  public BigDecimal getBigDecimalE01PLAZO2()
  {
    return fieldE01PLAZO2.getBigDecimal();
  }

  /**
  * Set field E01MONTO2 using a String value.
  */
  public void setE01MONTO2(String newvalue)
  {
    fieldE01MONTO2.setString(newvalue);
  }

  /**
  * Get value of field E01MONTO2 as a String.
  */
  public String getE01MONTO2()
  {
    return fieldE01MONTO2.getString();
  }

  /**
  * Set numeric field E01MONTO2 using a BigDecimal value.
  */
  public void setE01MONTO2(BigDecimal newvalue)
  {
    fieldE01MONTO2.setBigDecimal(newvalue);
  }

  /**
  * Return value of numeric field E01MONTO2 as a BigDecimal.
  */
  public BigDecimal getBigDecimalE01MONTO2()
  {
    return fieldE01MONTO2.getBigDecimal();
  }

  /**
  * Set field E01PLAZO3 using a String value.
  */
  public void setE01PLAZO3(String newvalue)
  {
    fieldE01PLAZO3.setString(newvalue);
  }

  /**
  * Get value of field E01PLAZO3 as a String.
  */
  public String getE01PLAZO3()
  {
    return fieldE01PLAZO3.getString();
  }

  /**
  * Set numeric field E01PLAZO3 using a BigDecimal value.
  */
  public void setE01PLAZO3(BigDecimal newvalue)
  {
    fieldE01PLAZO3.setBigDecimal(newvalue);
  }

  /**
  * Return value of numeric field E01PLAZO3 as a BigDecimal.
  */
  public BigDecimal getBigDecimalE01PLAZO3()
  {
    return fieldE01PLAZO3.getBigDecimal();
  }

  /**
  * Set field E01MONTO3 using a String value.
  */
  public void setE01MONTO3(String newvalue)
  {
    fieldE01MONTO3.setString(newvalue);
  }

  /**
  * Get value of field E01MONTO3 as a String.
  */
  public String getE01MONTO3()
  {
    return fieldE01MONTO3.getString();
  }

  /**
  * Set numeric field E01MONTO3 using a BigDecimal value.
  */
  public void setE01MONTO3(BigDecimal newvalue)
  {
    fieldE01MONTO3.setBigDecimal(newvalue);
  }

  /**
  * Return value of numeric field E01MONTO3 as a BigDecimal.
  */
  public BigDecimal getBigDecimalE01MONTO3()
  {
    return fieldE01MONTO3.getBigDecimal();
  }

  /**
  * Set field E01PLAZO4 using a String value.
  */
  public void setE01PLAZO4(String newvalue)
  {
    fieldE01PLAZO4.setString(newvalue);
  }

  /**
  * Get value of field E01PLAZO4 as a String.
  */
  public String getE01PLAZO4()
  {
    return fieldE01PLAZO4.getString();
  }

  /**
  * Set numeric field E01PLAZO4 using a BigDecimal value.
  */
  public void setE01PLAZO4(BigDecimal newvalue)
  {
    fieldE01PLAZO4.setBigDecimal(newvalue);
  }

  /**
  * Return value of numeric field E01PLAZO4 as a BigDecimal.
  */
  public BigDecimal getBigDecimalE01PLAZO4()
  {
    return fieldE01PLAZO4.getBigDecimal();
  }

  /**
  * Set field E01MONTO4 using a String value.
  */
  public void setE01MONTO4(String newvalue)
  {
    fieldE01MONTO4.setString(newvalue);
  }

  /**
  * Get value of field E01MONTO4 as a String.
  */
  public String getE01MONTO4()
  {
    return fieldE01MONTO4.getString();
  }

  /**
  * Set numeric field E01MONTO4 using a BigDecimal value.
  */
  public void setE01MONTO4(BigDecimal newvalue)
  {
    fieldE01MONTO4.setBigDecimal(newvalue);
  }

  /**
  * Return value of numeric field E01MONTO4 as a BigDecimal.
  */
  public BigDecimal getBigDecimalE01MONTO4()
  {
    return fieldE01MONTO4.getBigDecimal();
  }

  /**
  * Set field E01PLAZO5 using a String value.
  */
  public void setE01PLAZO5(String newvalue)
  {
    fieldE01PLAZO5.setString(newvalue);
  }

  /**
  * Get value of field E01PLAZO5 as a String.
  */
  public String getE01PLAZO5()
  {
    return fieldE01PLAZO5.getString();
  }

  /**
  * Set numeric field E01PLAZO5 using a BigDecimal value.
  */
  public void setE01PLAZO5(BigDecimal newvalue)
  {
    fieldE01PLAZO5.setBigDecimal(newvalue);
  }

  /**
  * Return value of numeric field E01PLAZO5 as a BigDecimal.
  */
  public BigDecimal getBigDecimalE01PLAZO5()
  {
    return fieldE01PLAZO5.getBigDecimal();
  }

  /**
  * Set field E01MONTO5 using a String value.
  */
  public void setE01MONTO5(String newvalue)
  {
    fieldE01MONTO5.setString(newvalue);
  }

  /**
  * Get value of field E01MONTO5 as a String.
  */
  public String getE01MONTO5()
  {
    return fieldE01MONTO5.getString();
  }

  /**
  * Set numeric field E01MONTO5 using a BigDecimal value.
  */
  public void setE01MONTO5(BigDecimal newvalue)
  {
    fieldE01MONTO5.setBigDecimal(newvalue);
  }

  /**
  * Return value of numeric field E01MONTO5 as a BigDecimal.
  */
  public BigDecimal getBigDecimalE01MONTO5()
  {
    return fieldE01MONTO5.getBigDecimal();
  }

  /**
  * Set field E01PRICUO using a String value.
  */
  public void setE01PRICUO(String newvalue)
  {
    fieldE01PRICUO.setString(newvalue);
  }

  /**
  * Get value of field E01PRICUO as a String.
  */
  public String getE01PRICUO()
  {
    return fieldE01PRICUO.getString();
  }

  /**
  * Set numeric field E01PRICUO using a BigDecimal value.
  */
  public void setE01PRICUO(BigDecimal newvalue)
  {
    fieldE01PRICUO.setBigDecimal(newvalue);
  }

  /**
  * Return value of numeric field E01PRICUO as a BigDecimal.
  */
  public BigDecimal getBigDecimalE01PRICUO()
  {
    return fieldE01PRICUO.getBigDecimal();
  }

  /**
  * Set field E01NROCON using a String value.
  */
  public void setE01NROCON(String newvalue)
  {
    fieldE01NROCON.setString(newvalue);
  }

  /**
  * Get value of field E01NROCON as a String.
  */
  public String getE01NROCON()
  {
    return fieldE01NROCON.getString();
  }

  /**
  * Set numeric field E01NROCON using a BigDecimal value.
  */
  public void setE01NROCON(BigDecimal newvalue)
  {
    fieldE01NROCON.setBigDecimal(newvalue);
  }

  /**
  * Return value of numeric field E01NROCON as a BigDecimal.
  */
  public BigDecimal getBigDecimalE01NROCON()
  {
    return fieldE01NROCON.getBigDecimal();
  }

  /**
  * Set field E01DISPON using a String value.
  */
  public void setE01DISPON(String newvalue)
  {
    fieldE01DISPON.setString(newvalue);
  }

  /**
  * Get value of field E01DISPON as a String.
  */
  public String getE01DISPON()
  {
    return fieldE01DISPON.getString();
  }

  /**
  * Set numeric field E01DISPON using a BigDecimal value.
  */
  public void setE01DISPON(BigDecimal newvalue)
  {
    fieldE01DISPON.setBigDecimal(newvalue);
  }

  /**
  * Return value of numeric field E01DISPON as a BigDecimal.
  */
  public BigDecimal getBigDecimalE01DISPON()
  {
    return fieldE01DISPON.getBigDecimal();
  }

  /**
  * Set field E01REVERS using a String value.
  */
  public void setE01REVERS(String newvalue)
  {
    fieldE01REVERS.setString(newvalue);
  }

  /**
  * Get value of field E01REVERS as a String.
  */
  public String getE01REVERS()
  {
    return fieldE01REVERS.getString();
  }

  /**
  * Set field E01CVV using a String value.
  */
  public void setE01CVV(String newvalue)
  {
    fieldE01CVV.setString(newvalue);
  }

  /**
  * Get value of field E01CVV as a String.
  */
  public String getE01CVV()
  {
    return fieldE01CVV.getString();
  }

  /**
  * Set numeric field E01CVV using a BigDecimal value.
  */
  public void setE01CVV(BigDecimal newvalue)
  {
    fieldE01CVV.setBigDecimal(newvalue);
  }

  /**
  * Return value of numeric field E01CVV as a BigDecimal.
  */
  public BigDecimal getBigDecimalE01CVV()
  {
    return fieldE01CVV.getBigDecimal();
  }

  /**
  * Set field E01LIBRE using a String value.
  */
  public void setE01LIBRE(String newvalue)
  {
    fieldE01LIBRE.setString(newvalue);
  }

  /**
  * Get value of field E01LIBRE as a String.
  */
  public String getE01LIBRE()
  {
    return fieldE01LIBRE.getString();
  }

  /**
  * Set field E02ERROR using a String value.
  */
  public void setE02ERROR(String newvalue)
  {
    fieldE02ERROR.setString(newvalue);
  }

  /**
  * Get value of field E02ERROR as a String.
  */
  public String getE02ERROR()
  {
    return fieldE02ERROR.getString();
  }

  /**
  * Set field E02DESERR using a String value.
  */
  public void setE02DESERR(String newvalue)
  {
    fieldE02DESERR.setString(newvalue);
  }

  /**
  * Get value of field E02DESERR as a String.
  */
  public String getE02DESERR()
  {
    return fieldE02DESERR.getString();
  }

  /**
  * Set field E02NUMREF using a String value.
  */
  public void setE02NUMREF(String newvalue)
  {
    fieldE02NUMREF.setString(newvalue);
  }

  /**
  * Get value of field E02NUMREF as a String.
  */
  public String getE02NUMREF()
  {
    return fieldE02NUMREF.getString();
  }

  /**
  * Set numeric field E02NUMREF using a BigDecimal value.
  */
  public void setE02NUMREF(BigDecimal newvalue)
  {
    fieldE02NUMREF.setBigDecimal(newvalue);
  }

  /**
  * Return value of numeric field E02NUMREF as a BigDecimal.
  */
  public BigDecimal getBigDecimalE02NUMREF()
  {
    return fieldE02NUMREF.getBigDecimal();
  }

}