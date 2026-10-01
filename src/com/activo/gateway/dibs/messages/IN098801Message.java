package com.activo.gateway.dibs.messages;

import java.math.BigDecimal;
import java.util.Hashtable;
import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;

public class IN098801Message extends MessageRecord
{
  final static String fldnames[] = {
                                     "IN988NCLT",
                                     "IN988IDUS",
                                     "IN988TYPE",
                                     "IN988CHAN",
                                     "IN988BRAN",
                                     "IN988CTER",
                                     "IN988CSER",
                                     "IN988CARE",
                                     "IN988NTLF",
                                     "IN988AMNT",
                                     "IN988FACC",
                                     "IN988CCDI",
                                     "IN988CCTR",
                                     "IN988CCMY",
                                     "IN988CTRA",
                                     "IN988BVDM",
                                     "IN988BVDD",
                                     "IN988BVDY",
                                     "IN988FFAC",
                                     "IN988PFAC",
                                     "IN988TSER",
                                     "IN988MFAC",
                                     "IN988MDEU",
                                     "IN988DS1",
                                     "IN988DS2",
                                     "IN988IPCLT",
                                     "IN988AMTAJ",
                                     "IN988REAAJ",
                                     "IN988FI1",
                                     "IN988FI2"
                                   };
  final static String tnames[] = {
                                   "IN988NCLT",
                                   "IN988IDUS",
                                   "IN988TYPE",
                                   "IN988CHAN",
                                   "IN988BRAN",
                                   "IN988CTER",
                                   "IN988CSER",
                                   "IN988CARE",
                                   "IN988NTLF",
                                   "IN988AMNT",
                                   "IN988FACC",
                                   "IN988CCDI",
                                   "IN988CCTR",
                                   "IN988CCMY",
                                   "IN988CTRA",
                                   "IN988BVDM",
                                   "IN988BVDD",
                                   "IN988BVDY",
                                   "IN988FFAC",
                                   "IN988PFAC",
                                   "IN988TSER",
                                   "IN988MFAC",
                                   "IN988MDEU",
                                   "IN988DS1",
                                   "IN988DS2",
                                   "IN988IPCLT",
                                   "IN988AMTAJ",
                                   "IN988REAAJ",
                                   "IN988FI1",
                                   "IN988FI2"
                                 };
  final static String fid = "1160616113630";
  final static String rid = "482CCD084FAF2";
  final static String fmtname = "IN098801";
  final int FIELDCOUNT = 30;
  private static Hashtable tlookup = new Hashtable();
  private DecimalField fieldIN988NCLT = null;
  private CharacterField fieldIN988IDUS = null;
  private DecimalField fieldIN988TYPE = null;
  private DecimalField fieldIN988CHAN = null;
  private DecimalField fieldIN988BRAN = null;
  private CharacterField fieldIN988CTER = null;
  private DecimalField fieldIN988CSER = null;
  private DecimalField fieldIN988CARE = null;
  private DecimalField fieldIN988NTLF = null;
  private DecimalField fieldIN988AMNT = null;
  private DecimalField fieldIN988FACC = null;
  private DecimalField fieldIN988CCDI = null;
  private DecimalField fieldIN988CCTR = null;
  private DecimalField fieldIN988CCMY = null;
  private DecimalField fieldIN988CTRA = null;
  private DecimalField fieldIN988BVDM = null;
  private DecimalField fieldIN988BVDD = null;
  private DecimalField fieldIN988BVDY = null;
  private DecimalField fieldIN988FFAC = null;
  private DecimalField fieldIN988PFAC = null;
  private DecimalField fieldIN988TSER = null;
  private DecimalField fieldIN988MFAC = null;
  private DecimalField fieldIN988MDEU = null;
  private CharacterField fieldIN988DS1 = null;
  private CharacterField fieldIN988DS2 = null;
  private CharacterField fieldIN988IPCLT = null;
  private DecimalField fieldIN988AMTAJ = null;
  private CharacterField fieldIN988REAAJ = null;
  private CharacterField fieldIN988FI1 = null;
  private CharacterField fieldIN988FI2 = null;

  /**
  * Constructor for IN098801Message.
  */
  public IN098801Message()
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
    recordsize = 385;
    fileid = fid;
    recordid = rid;
    message = new byte[getByteLength()];
    formatname = fmtname;
    fieldnames = fldnames;
    tagnames = tnames;
    fields = new MessageField[FIELDCOUNT];

    fields[0] = fieldIN988NCLT =
    new DecimalField(message, HEADERSIZE + 0, 10, 0, "IN988NCLT");
    fields[1] = fieldIN988IDUS =
    new CharacterField(message, HEADERSIZE + 10, 15, "IN988IDUS");
    fields[2] = fieldIN988TYPE =
    new DecimalField(message, HEADERSIZE + 25, 3, 0, "IN988TYPE");
    fields[3] = fieldIN988CHAN =
    new DecimalField(message, HEADERSIZE + 28, 3, 0, "IN988CHAN");
    fields[4] = fieldIN988BRAN =
    new DecimalField(message, HEADERSIZE + 31, 5, 0, "IN988BRAN");
    fields[5] = fieldIN988CTER =
    new CharacterField(message, HEADERSIZE + 36, 7, "IN988CTER");
    fields[6] = fieldIN988CSER =
    new DecimalField(message, HEADERSIZE + 43, 3, 0, "IN988CSER");
    fields[7] = fieldIN988CARE =
    new DecimalField(message, HEADERSIZE + 46, 5, 0, "IN988CARE");
    fields[8] = fieldIN988NTLF =
    new DecimalField(message, HEADERSIZE + 51, 8, 0, "IN988NTLF");
    fields[9] = fieldIN988AMNT =
    new DecimalField(message, HEADERSIZE + 59, 17, 2, "IN988AMNT");
    fields[10] = fieldIN988FACC =
    new DecimalField(message, HEADERSIZE + 76, 13, 0, "IN988FACC");
    fields[11] = fieldIN988CCDI =
    new DecimalField(message, HEADERSIZE + 89, 10, 0, "IN988CCDI");
    fields[12] = fieldIN988CCTR =
    new DecimalField(message, HEADERSIZE + 99, 10, 0, "IN988CCTR");
    fields[13] = fieldIN988CCMY =
    new DecimalField(message, HEADERSIZE + 109, 10, 0, "IN988CCMY");
    fields[14] = fieldIN988CTRA =
    new DecimalField(message, HEADERSIZE + 119, 10, 0, "IN988CTRA");
    fields[15] = fieldIN988BVDM =
    new DecimalField(message, HEADERSIZE + 129, 3, 0, "IN988BVDM");
    fields[16] = fieldIN988BVDD =
    new DecimalField(message, HEADERSIZE + 132, 3, 0, "IN988BVDD");
    fields[17] = fieldIN988BVDY =
    new DecimalField(message, HEADERSIZE + 135, 3, 0, "IN988BVDY");
    fields[18] = fieldIN988FFAC =
    new DecimalField(message, HEADERSIZE + 138, 9, 0, "IN988FFAC");
    fields[19] = fieldIN988PFAC =
    new DecimalField(message, HEADERSIZE + 147, 7, 0, "IN988PFAC");
    fields[20] = fieldIN988TSER =
    new DecimalField(message, HEADERSIZE + 154, 3, 0, "IN988TSER");
    fields[21] = fieldIN988MFAC =
    new DecimalField(message, HEADERSIZE + 157, 17, 2, "IN988MFAC");
    fields[22] = fieldIN988MDEU =
    new DecimalField(message, HEADERSIZE + 174, 17, 2, "IN988MDEU");
    fields[23] = fieldIN988DS1 =
    new CharacterField(message, HEADERSIZE + 191, 40, "IN988DS1");
    fields[24] = fieldIN988DS2 =
    new CharacterField(message, HEADERSIZE + 231, 40, "IN988DS2");
    fields[25] = fieldIN988IPCLT =
    new CharacterField(message, HEADERSIZE + 271, 15, "IN988IPCLT");
    fields[26] = fieldIN988AMTAJ =
    new DecimalField(message, HEADERSIZE + 286, 17, 2, "IN988AMTAJ");
    fields[27] = fieldIN988REAAJ =
    new CharacterField(message, HEADERSIZE + 303, 2, "IN988REAAJ");
    fields[28] = fieldIN988FI1 =
    new CharacterField(message, HEADERSIZE + 305, 40, "IN988FI1");
    fields[29] = fieldIN988FI2 =
    new CharacterField(message, HEADERSIZE + 345, 40, "IN988FI2");

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
  * Set field IN988NCLT using a String value.
  */
  public void setIN988NCLT(String newvalue)
  {
    fieldIN988NCLT.setString(newvalue);
  }

  /**
  * Get value of field IN988NCLT as a String.
  */
  public String getIN988NCLT()
  {
    return fieldIN988NCLT.getString();
  }

  /**
  * Set numeric field IN988NCLT using a BigDecimal value.
  */
  public void setIN988NCLT(BigDecimal newvalue)
  {
    fieldIN988NCLT.setBigDecimal(newvalue);
  }

  /**
  * Return value of numeric field IN988NCLT as a BigDecimal.
  */
  public BigDecimal getBigDecimalIN988NCLT()
  {
    return fieldIN988NCLT.getBigDecimal();
  }

  /**
  * Set field IN988IDUS using a String value.
  */
  public void setIN988IDUS(String newvalue)
  {
    fieldIN988IDUS.setString(newvalue);
  }

  /**
  * Get value of field IN988IDUS as a String.
  */
  public String getIN988IDUS()
  {
    return fieldIN988IDUS.getString();
  }

  /**
  * Set field IN988TYPE using a String value.
  */
  public void setIN988TYPE(String newvalue)
  {
    fieldIN988TYPE.setString(newvalue);
  }

  /**
  * Get value of field IN988TYPE as a String.
  */
  public String getIN988TYPE()
  {
    return fieldIN988TYPE.getString();
  }

  /**
  * Set numeric field IN988TYPE using a BigDecimal value.
  */
  public void setIN988TYPE(BigDecimal newvalue)
  {
    fieldIN988TYPE.setBigDecimal(newvalue);
  }

  /**
  * Return value of numeric field IN988TYPE as a BigDecimal.
  */
  public BigDecimal getBigDecimalIN988TYPE()
  {
    return fieldIN988TYPE.getBigDecimal();
  }

  /**
  * Set field IN988CHAN using a String value.
  */
  public void setIN988CHAN(String newvalue)
  {
    fieldIN988CHAN.setString(newvalue);
  }

  /**
  * Get value of field IN988CHAN as a String.
  */
  public String getIN988CHAN()
  {
    return fieldIN988CHAN.getString();
  }

  /**
  * Set numeric field IN988CHAN using a BigDecimal value.
  */
  public void setIN988CHAN(BigDecimal newvalue)
  {
    fieldIN988CHAN.setBigDecimal(newvalue);
  }

  /**
  * Return value of numeric field IN988CHAN as a BigDecimal.
  */
  public BigDecimal getBigDecimalIN988CHAN()
  {
    return fieldIN988CHAN.getBigDecimal();
  }

  /**
  * Set field IN988BRAN using a String value.
  */
  public void setIN988BRAN(String newvalue)
  {
    fieldIN988BRAN.setString(newvalue);
  }

  /**
  * Get value of field IN988BRAN as a String.
  */
  public String getIN988BRAN()
  {
    return fieldIN988BRAN.getString();
  }

  /**
  * Set numeric field IN988BRAN using a BigDecimal value.
  */
  public void setIN988BRAN(BigDecimal newvalue)
  {
    fieldIN988BRAN.setBigDecimal(newvalue);
  }

  /**
  * Return value of numeric field IN988BRAN as a BigDecimal.
  */
  public BigDecimal getBigDecimalIN988BRAN()
  {
    return fieldIN988BRAN.getBigDecimal();
  }

  /**
  * Set field IN988CTER using a String value.
  */
  public void setIN988CTER(String newvalue)
  {
    fieldIN988CTER.setString(newvalue);
  }

  /**
  * Get value of field IN988CTER as a String.
  */
  public String getIN988CTER()
  {
    return fieldIN988CTER.getString();
  }

  /**
  * Set field IN988CSER using a String value.
  */
  public void setIN988CSER(String newvalue)
  {
    fieldIN988CSER.setString(newvalue);
  }

  /**
  * Get value of field IN988CSER as a String.
  */
  public String getIN988CSER()
  {
    return fieldIN988CSER.getString();
  }

  /**
  * Set numeric field IN988CSER using a BigDecimal value.
  */
  public void setIN988CSER(BigDecimal newvalue)
  {
    fieldIN988CSER.setBigDecimal(newvalue);
  }

  /**
  * Return value of numeric field IN988CSER as a BigDecimal.
  */
  public BigDecimal getBigDecimalIN988CSER()
  {
    return fieldIN988CSER.getBigDecimal();
  }

  /**
  * Set field IN988CARE using a String value.
  */
  public void setIN988CARE(String newvalue)
  {
    fieldIN988CARE.setString(newvalue);
  }

  /**
  * Get value of field IN988CARE as a String.
  */
  public String getIN988CARE()
  {
    return fieldIN988CARE.getString();
  }

  /**
  * Set numeric field IN988CARE using a BigDecimal value.
  */
  public void setIN988CARE(BigDecimal newvalue)
  {
    fieldIN988CARE.setBigDecimal(newvalue);
  }

  /**
  * Return value of numeric field IN988CARE as a BigDecimal.
  */
  public BigDecimal getBigDecimalIN988CARE()
  {
    return fieldIN988CARE.getBigDecimal();
  }

  /**
  * Set field IN988NTLF using a String value.
  */
  public void setIN988NTLF(String newvalue)
  {
    fieldIN988NTLF.setString(newvalue);
  }

  /**
  * Get value of field IN988NTLF as a String.
  */
  public String getIN988NTLF()
  {
    return fieldIN988NTLF.getString();
  }

  /**
  * Set numeric field IN988NTLF using a BigDecimal value.
  */
  public void setIN988NTLF(BigDecimal newvalue)
  {
    fieldIN988NTLF.setBigDecimal(newvalue);
  }

  /**
  * Return value of numeric field IN988NTLF as a BigDecimal.
  */
  public BigDecimal getBigDecimalIN988NTLF()
  {
    return fieldIN988NTLF.getBigDecimal();
  }

  /**
  * Set field IN988AMNT using a String value.
  */
  public void setIN988AMNT(String newvalue)
  {
    fieldIN988AMNT.setString(newvalue);
  }

  /**
  * Get value of field IN988AMNT as a String.
  */
  public String getIN988AMNT()
  {
    return fieldIN988AMNT.getString();
  }

  /**
  * Set numeric field IN988AMNT using a BigDecimal value.
  */
  public void setIN988AMNT(BigDecimal newvalue)
  {
    fieldIN988AMNT.setBigDecimal(newvalue);
  }

  /**
  * Return value of numeric field IN988AMNT as a BigDecimal.
  */
  public BigDecimal getBigDecimalIN988AMNT()
  {
    return fieldIN988AMNT.getBigDecimal();
  }

  /**
  * Set field IN988FACC using a String value.
  */
  public void setIN988FACC(String newvalue)
  {
    fieldIN988FACC.setString(newvalue);
  }

  /**
  * Get value of field IN988FACC as a String.
  */
  public String getIN988FACC()
  {
    return fieldIN988FACC.getString();
  }

  /**
  * Set numeric field IN988FACC using a BigDecimal value.
  */
  public void setIN988FACC(BigDecimal newvalue)
  {
    fieldIN988FACC.setBigDecimal(newvalue);
  }

  /**
  * Return value of numeric field IN988FACC as a BigDecimal.
  */
  public BigDecimal getBigDecimalIN988FACC()
  {
    return fieldIN988FACC.getBigDecimal();
  }

  /**
  * Set field IN988CCDI using a String value.
  */
  public void setIN988CCDI(String newvalue)
  {
    fieldIN988CCDI.setString(newvalue);
  }

  /**
  * Get value of field IN988CCDI as a String.
  */
  public String getIN988CCDI()
  {
    return fieldIN988CCDI.getString();
  }

  /**
  * Set numeric field IN988CCDI using a BigDecimal value.
  */
  public void setIN988CCDI(BigDecimal newvalue)
  {
    fieldIN988CCDI.setBigDecimal(newvalue);
  }

  /**
  * Return value of numeric field IN988CCDI as a BigDecimal.
  */
  public BigDecimal getBigDecimalIN988CCDI()
  {
    return fieldIN988CCDI.getBigDecimal();
  }

  /**
  * Set field IN988CCTR using a String value.
  */
  public void setIN988CCTR(String newvalue)
  {
    fieldIN988CCTR.setString(newvalue);
  }

  /**
  * Get value of field IN988CCTR as a String.
  */
  public String getIN988CCTR()
  {
    return fieldIN988CCTR.getString();
  }

  /**
  * Set numeric field IN988CCTR using a BigDecimal value.
  */
  public void setIN988CCTR(BigDecimal newvalue)
  {
    fieldIN988CCTR.setBigDecimal(newvalue);
  }

  /**
  * Return value of numeric field IN988CCTR as a BigDecimal.
  */
  public BigDecimal getBigDecimalIN988CCTR()
  {
    return fieldIN988CCTR.getBigDecimal();
  }

  /**
  * Set field IN988CCMY using a String value.
  */
  public void setIN988CCMY(String newvalue)
  {
    fieldIN988CCMY.setString(newvalue);
  }

  /**
  * Get value of field IN988CCMY as a String.
  */
  public String getIN988CCMY()
  {
    return fieldIN988CCMY.getString();
  }

  /**
  * Set numeric field IN988CCMY using a BigDecimal value.
  */
  public void setIN988CCMY(BigDecimal newvalue)
  {
    fieldIN988CCMY.setBigDecimal(newvalue);
  }

  /**
  * Return value of numeric field IN988CCMY as a BigDecimal.
  */
  public BigDecimal getBigDecimalIN988CCMY()
  {
    return fieldIN988CCMY.getBigDecimal();
  }

  /**
  * Set field IN988CTRA using a String value.
  */
  public void setIN988CTRA(String newvalue)
  {
    fieldIN988CTRA.setString(newvalue);
  }

  /**
  * Get value of field IN988CTRA as a String.
  */
  public String getIN988CTRA()
  {
    return fieldIN988CTRA.getString();
  }

  /**
  * Set numeric field IN988CTRA using a BigDecimal value.
  */
  public void setIN988CTRA(BigDecimal newvalue)
  {
    fieldIN988CTRA.setBigDecimal(newvalue);
  }

  /**
  * Return value of numeric field IN988CTRA as a BigDecimal.
  */
  public BigDecimal getBigDecimalIN988CTRA()
  {
    return fieldIN988CTRA.getBigDecimal();
  }

  /**
  * Set field IN988BVDM using a String value.
  */
  public void setIN988BVDM(String newvalue)
  {
    fieldIN988BVDM.setString(newvalue);
  }

  /**
  * Get value of field IN988BVDM as a String.
  */
  public String getIN988BVDM()
  {
    return fieldIN988BVDM.getString();
  }

  /**
  * Set numeric field IN988BVDM using a BigDecimal value.
  */
  public void setIN988BVDM(BigDecimal newvalue)
  {
    fieldIN988BVDM.setBigDecimal(newvalue);
  }

  /**
  * Return value of numeric field IN988BVDM as a BigDecimal.
  */
  public BigDecimal getBigDecimalIN988BVDM()
  {
    return fieldIN988BVDM.getBigDecimal();
  }

  /**
  * Set field IN988BVDD using a String value.
  */
  public void setIN988BVDD(String newvalue)
  {
    fieldIN988BVDD.setString(newvalue);
  }

  /**
  * Get value of field IN988BVDD as a String.
  */
  public String getIN988BVDD()
  {
    return fieldIN988BVDD.getString();
  }

  /**
  * Set numeric field IN988BVDD using a BigDecimal value.
  */
  public void setIN988BVDD(BigDecimal newvalue)
  {
    fieldIN988BVDD.setBigDecimal(newvalue);
  }

  /**
  * Return value of numeric field IN988BVDD as a BigDecimal.
  */
  public BigDecimal getBigDecimalIN988BVDD()
  {
    return fieldIN988BVDD.getBigDecimal();
  }

  /**
  * Set field IN988BVDY using a String value.
  */
  public void setIN988BVDY(String newvalue)
  {
    fieldIN988BVDY.setString(newvalue);
  }

  /**
  * Get value of field IN988BVDY as a String.
  */
  public String getIN988BVDY()
  {
    return fieldIN988BVDY.getString();
  }

  /**
  * Set numeric field IN988BVDY using a BigDecimal value.
  */
  public void setIN988BVDY(BigDecimal newvalue)
  {
    fieldIN988BVDY.setBigDecimal(newvalue);
  }

  /**
  * Return value of numeric field IN988BVDY as a BigDecimal.
  */
  public BigDecimal getBigDecimalIN988BVDY()
  {
    return fieldIN988BVDY.getBigDecimal();
  }

  /**
  * Set field IN988FFAC using a String value.
  */
  public void setIN988FFAC(String newvalue)
  {
    fieldIN988FFAC.setString(newvalue);
  }

  /**
  * Get value of field IN988FFAC as a String.
  */
  public String getIN988FFAC()
  {
    return fieldIN988FFAC.getString();
  }

  /**
  * Set numeric field IN988FFAC using a BigDecimal value.
  */
  public void setIN988FFAC(BigDecimal newvalue)
  {
    fieldIN988FFAC.setBigDecimal(newvalue);
  }

  /**
  * Return value of numeric field IN988FFAC as a BigDecimal.
  */
  public BigDecimal getBigDecimalIN988FFAC()
  {
    return fieldIN988FFAC.getBigDecimal();
  }

  /**
  * Set field IN988PFAC using a String value.
  */
  public void setIN988PFAC(String newvalue)
  {
    fieldIN988PFAC.setString(newvalue);
  }

  /**
  * Get value of field IN988PFAC as a String.
  */
  public String getIN988PFAC()
  {
    return fieldIN988PFAC.getString();
  }

  /**
  * Set numeric field IN988PFAC using a BigDecimal value.
  */
  public void setIN988PFAC(BigDecimal newvalue)
  {
    fieldIN988PFAC.setBigDecimal(newvalue);
  }

  /**
  * Return value of numeric field IN988PFAC as a BigDecimal.
  */
  public BigDecimal getBigDecimalIN988PFAC()
  {
    return fieldIN988PFAC.getBigDecimal();
  }

  /**
  * Set field IN988TSER using a String value.
  */
  public void setIN988TSER(String newvalue)
  {
    fieldIN988TSER.setString(newvalue);
  }

  /**
  * Get value of field IN988TSER as a String.
  */
  public String getIN988TSER()
  {
    return fieldIN988TSER.getString();
  }

  /**
  * Set numeric field IN988TSER using a BigDecimal value.
  */
  public void setIN988TSER(BigDecimal newvalue)
  {
    fieldIN988TSER.setBigDecimal(newvalue);
  }

  /**
  * Return value of numeric field IN988TSER as a BigDecimal.
  */
  public BigDecimal getBigDecimalIN988TSER()
  {
    return fieldIN988TSER.getBigDecimal();
  }

  /**
  * Set field IN988MFAC using a String value.
  */
  public void setIN988MFAC(String newvalue)
  {
    fieldIN988MFAC.setString(newvalue);
  }

  /**
  * Get value of field IN988MFAC as a String.
  */
  public String getIN988MFAC()
  {
    return fieldIN988MFAC.getString();
  }

  /**
  * Set numeric field IN988MFAC using a BigDecimal value.
  */
  public void setIN988MFAC(BigDecimal newvalue)
  {
    fieldIN988MFAC.setBigDecimal(newvalue);
  }

  /**
  * Return value of numeric field IN988MFAC as a BigDecimal.
  */
  public BigDecimal getBigDecimalIN988MFAC()
  {
    return fieldIN988MFAC.getBigDecimal();
  }

  /**
  * Set field IN988MDEU using a String value.
  */
  public void setIN988MDEU(String newvalue)
  {
    fieldIN988MDEU.setString(newvalue);
  }

  /**
  * Get value of field IN988MDEU as a String.
  */
  public String getIN988MDEU()
  {
    return fieldIN988MDEU.getString();
  }

  /**
  * Set numeric field IN988MDEU using a BigDecimal value.
  */
  public void setIN988MDEU(BigDecimal newvalue)
  {
    fieldIN988MDEU.setBigDecimal(newvalue);
  }

  /**
  * Return value of numeric field IN988MDEU as a BigDecimal.
  */
  public BigDecimal getBigDecimalIN988MDEU()
  {
    return fieldIN988MDEU.getBigDecimal();
  }

  /**
  * Set field IN988DS1 using a String value.
  */
  public void setIN988DS1(String newvalue)
  {
    fieldIN988DS1.setString(newvalue);
  }

  /**
  * Get value of field IN988DS1 as a String.
  */
  public String getIN988DS1()
  {
    return fieldIN988DS1.getString();
  }

  /**
  * Set field IN988DS2 using a String value.
  */
  public void setIN988DS2(String newvalue)
  {
    fieldIN988DS2.setString(newvalue);
  }

  /**
  * Get value of field IN988DS2 as a String.
  */
  public String getIN988DS2()
  {
    return fieldIN988DS2.getString();
  }

  /**
  * Set field IN988IPCLT using a String value.
  */
  public void setIN988IPCLT(String newvalue)
  {
    fieldIN988IPCLT.setString(newvalue);
  }

  /**
  * Get value of field IN988IPCLT as a String.
  */
  public String getIN988IPCLT()
  {
    return fieldIN988IPCLT.getString();
  }

  /**
  * Set field IN988AMTAJ using a String value.
  */
  public void setIN988AMTAJ(String newvalue)
  {
    fieldIN988AMTAJ.setString(newvalue);
  }

  /**
  * Get value of field IN988AMTAJ as a String.
  */
  public String getIN988AMTAJ()
  {
    return fieldIN988AMTAJ.getString();
  }

  /**
  * Set numeric field IN988AMTAJ using a BigDecimal value.
  */
  public void setIN988AMTAJ(BigDecimal newvalue)
  {
    fieldIN988AMTAJ.setBigDecimal(newvalue);
  }

  /**
  * Return value of numeric field IN988AMTAJ as a BigDecimal.
  */
  public BigDecimal getBigDecimalIN988AMTAJ()
  {
    return fieldIN988AMTAJ.getBigDecimal();
  }

  /**
  * Set field IN988REAAJ using a String value.
  */
  public void setIN988REAAJ(String newvalue)
  {
    fieldIN988REAAJ.setString(newvalue);
  }

  /**
  * Get value of field IN988REAAJ as a String.
  */
  public String getIN988REAAJ()
  {
    return fieldIN988REAAJ.getString();
  }

  /**
  * Set field IN988FI1 using a String value.
  */
  public void setIN988FI1(String newvalue)
  {
    fieldIN988FI1.setString(newvalue);
  }

  /**
  * Get value of field IN988FI1 as a String.
  */
  public String getIN988FI1()
  {
    return fieldIN988FI1.getString();
  }

  /**
  * Set field IN988FI2 using a String value.
  */
  public void setIN988FI2(String newvalue)
  {
    fieldIN988FI2.setString(newvalue);
  }

  /**
  * Get value of field IN988FI2 as a String.
  */
  public String getIN988FI2()
  {
    return fieldIN988FI2.getString();
  }

}
