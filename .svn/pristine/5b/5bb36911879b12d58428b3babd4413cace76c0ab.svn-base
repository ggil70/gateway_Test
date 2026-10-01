package com.activo.gateway.dibs.messages;

import java.io.*;
import java.math.*;

import java.util.*;

import com.activo.gateway.sockets.CharacterField;
import com.activo.gateway.sockets.DecimalField;
import com.activo.gateway.sockets.MessageField;
import com.activo.gateway.sockets.MessageRecord;


public class EDL890101Message extends MessageRecord
{
	final static String[] fldnames = {
		"E01USERID",
		"E01ACC010",
		"E01ACC020"
	};
	final static String[] tnames = {
		"E01USERID",
		"E01ACC010",
		"E01ACC020"
	};
	final static String fid = "1121011173411";
	final static String rid = "3B801A8123BAB";
	final static String fmtname = "EDL890101";
	final int FIELDCOUNT = 3;
	private static Hashtable tlookup = new Hashtable();
	private CharacterField fieldE01USERID = null;
	private DecimalField fieldE01ACC010 = null;
	private DecimalField fieldE01ACC020 = null;


	public EDL890101Message()
	{
		createFields();
		initialize();
	}

	
	protected void createFields()
	{
		recordsize = 44;
		fileid = fid;
		recordid = rid;
		message = new byte[getByteLength()];
		formatname = fmtname;
		fieldnames = fldnames;
		tagnames = tnames;
		fields = new MessageField[3];

		fields[0] = fieldE01USERID =
			new CharacterField(message, HEADERSIZE + 0, 10, "E01USERID");
		fields[1] = fieldE01ACC010 =
			new DecimalField(message, HEADERSIZE + 10, 13, 0, "E01ACC010");
		fields[2] = fieldE01ACC020 =
			new DecimalField(message, HEADERSIZE + 23, 21, 0, "E01ACC020");

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
	 * Set field E01USERID using a String value.
	 */
	public void setE01USERID(String newvalue)
	{
		fieldE01USERID.setString(newvalue);
	}

	/**
	 * Get value of field E01USERID as a String.
	 */
	public String getE01USERID()
	{
		return fieldE01USERID.getString();
	}

	/**
	 * Set field E01ACC010 using a String value.
	 */
	public void setE01ACC010(String newvalue)
	{
		fieldE01ACC010.setString(newvalue);
	}

	/**
	 * Get value of field E01ACC010 as a String.
	 */
	public String getE01ACC010()
	{
		return fieldE01ACC010.getString();
	}

	/**
	 * Set numeric field E01ACC010 using a BigDecimal value.
	 */
	public void setE01ACC010(BigDecimal newvalue)
	{
		fieldE01ACC010.setBigDecimal(newvalue);
	}

	/**
	 * Return value of numeric field E01ACC010 as a BigDecimal.
	 */
	public BigDecimal getBigDecimalE01ACC010()
	{
		return fieldE01ACC010.getBigDecimal();
	}

	/**
	 * Set field E01ACC020 using a String value.
	 */
	public void setE01ACC020(String newvalue)
	{
		fieldE01ACC020.setString(newvalue);
	}

	/**
	 * Get value of field E01ACC020 as a String.
	 */
	public String getE01ACC020()
	{
		return fieldE01ACC020.getString();
	}

	/**
	 * Set numeric field E01ACC020 using a BigDecimal value.
	 */
	public void setE01ACC020(BigDecimal newvalue)
	{
		fieldE01ACC020.setBigDecimal(newvalue);
	}

	/**
	 * Return value of numeric field E01ACC020 as a BigDecimal.
	 */
	public BigDecimal getBigDecimalE01ACC020()
	{
		return fieldE01ACC020.getBigDecimal();
	}

}

