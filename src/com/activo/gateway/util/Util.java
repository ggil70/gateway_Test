 package com.activo.gateway.util;
 
 import java.io.BufferedReader;
import java.io.FileReader;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import org.apache.commons.lang3.StringUtils;

import com.activo.gateway.beans.EDL890101Bean;
import com.activo.gateway.beans.EDL890101Response;
import com.activo.gateway.beans.NIBPF3010Bean;
import com.activo.gateway.beans.NIBPF3010Response;
import com.activo.gateway.servicios.Core;
import com.activo.gateway.servicios.WSException;


 
 public class Util
 {
   public static Random generator = new Random();
 
   public static String TABLE = "";
   public static String IMG0 = "Img_";
   public static String IMG1 = "Img_";
   public static String IMG2 = "Img_";
   public static String IMG3 = "Img_";
   public static String IMG4 = "Img_";
   public static String IMG5 = "Img_";
   public static String IMG6 = "Img_";
   public static String IMG7 = "Img_";
   public static String IMG8 = "Img_";
   public static String IMG9 = "Img_";
 
   public static int NUM0 = 0;
   public static int NUM1 = 0;
   public static int NUM2 = 0;
   public static int NUM3 = 0;
   public static int NUM4 = 0;
   public static int NUM5 = 0;
   public static int NUM6 = 0;
   public static int NUM7 = 0;
   public static int NUM8 = 0;
   public static int NUM9 = 0;
 
   static int FNUM = getRandom();
 
   public static String addLeftChar(char ch, int len, String str)
   {
     for (int i = str.length(); i < len; i++) {
       str = ch + str;
     }
     return str;
   }
 
   public static String colorCCY(String num)
   {
     if (num.startsWith("-"))
       num = "<FONT COLOR=RED>" + num + "</FONT>";
     return num;
   }
 
   public static String MaskAcc(String numb) {
     String accmask = numb;
     if (numb.trim().length() > 16) {
       String p_parte = numb.substring(0, 4);
       String s_parte = numb.substring(4, 8);
       String t_parte = numb.substring(8, 10);
       String c_parte = numb.substring(10, 16);
       String q_parte = numb.substring(16, numb.length());
       accmask = p_parte + "-" + s_parte + "-" + t_parte + "-" + c_parte + q_parte;
     }
     return accmask;
   }
 
   public static String MaskAccE(String numb) {
     String accmask = numb;
     if (numb.trim().length() > 16) {
       String p_parte = numb.substring(0, 4);
       String s_parte = "XXXX";
       String t_parte = "XX";
       String c_parte = "XXXXXX";
       String q_parte = numb.substring(16, numb.length());
       accmask = p_parte + "-" + s_parte + "-" + t_parte + "-" + c_parte + q_parte;
     }
     return accmask;
   }
 
   public static String MaskCCR(String Card) {
     String accmask = Card;
     if (Card.trim().length() > 12) {
       String p_parte = Card.substring(0, 4);
       String q_parte = Card.substring(12, Card.length());
       accmask = p_parte + "-XXXX-XXXX-" + q_parte;
     }
     return accmask;
   }
   public static String formatAdd(String s1, String s2, String s3) {
     String r = "";
 
     if (!s1.trim().equals("")) {
       r = r + s1.trim() + "<br>";
     }
     if (!s2.trim().equals("")) {
       r = r + s2.trim() + "<br>";
     }
     if (!s3.trim().equals("")) {
       r = r + s3.trim() + "<br>";
     }
     if (r.trim().equals("")) {
       r = "&nbsp;";
     }
     return r;
   }
 
   public static String formatBlank(String s) {
     String r = null;
 
     if (s.trim().equals("&nbsp;")) {
       r = "";
     }
     else {
       r = s.trim();
     }
     return r;
   }
 
   public static String formatCell(String s) {
     String r = null;
     String rs = null;
     String ls = null;
     int pos = 0;
     if (s.trim().equals("")) {
       r = "&nbsp;";
     }
     else {
       s = s.trim();
       while (s.indexOf("'") != -1) {
         pos = s.indexOf("'");
         ls = s.substring(0, pos);
         rs = s.substring(pos + 1, s.length());
         s = ls + "&#39;" + rs;
       }
 
       while (s.indexOf("\"") != -1) {
         pos = s.indexOf("\"");
         ls = s.substring(0, pos);
         rs = s.substring(pos + 1, s.length());
         s = ls + "&#34;" + rs;
       }
       r = s;
     }
     return r;
   }
 
   public static String formatDate(String d1, String d2, String d3)
   {
     d1 = d1.length() == 1 ? "0" + d1 : d1;
     d2 = d2.length() == 1 ? "0" + d2 : d2;
     d3 = d3.length() == 1 ? "0" + d3 : d3;
 
     if ((d1.equals("00")) && (d2.equals("00")) && (d3.equals("00"))) {
       return "&nbsp;";
     }
     return d1 + "/" + d2 + "/" + d3;
   }
 
   public static String formatDateDDMMYYYY(String dd, String mm, String yy)
   {
     dd = dd.length() == 1 ? "0" + dd : dd;
     mm = mm.length() == 1 ? "0" + mm : mm;
     yy = yy.trim().length() < 4 ? "20" + yy : yy;
     return dd + mm + yy;
   }
 
   public static String formatID(String c, String l) {
     String fc = "";
     for (int i = 0; i < 9 - c.length(); i++) {
       fc = fc + "0";
     }
     String fl = "";
     for (int i = 0; i < 4 - l.length(); i++) {
       fl = fl + "0";
     }
     return fc + c + fl + l;
   }
 
   public static String formatYear(int y)
   {
     return formatYear(Integer.toString(y));
   }
 
   public static String formatYear(String y)
   {
     if (y.length() < 4) {
       try {
         int aux = Integer.parseInt(y);
         if (aux == 0) {
           y = "2000";
         }
         else if (aux > 52) {
           y = "19" + y;
         }
         else
           y = "20" + justifyRight(y, 2);
       }
       catch (Exception e)
       {
         y = "";
       }
     }
 
     return y;
   }
 
   public static String justifyLeft(String c, int l)
   {
     String fc = "";
     for (int i = 0; i < l - c.length(); i++) {
       fc = fc + "0";
     }
     return c + fc;
   }
 
   public static String justifyRight(String c, int l) {
     String fc = "";
     for (int i = 0; i < l - c.length(); i++) {
       fc = fc + "0";
     }
     return fc + c;
   }
 
   public static String leftValue(String s)
   {
     int pos = 0;
     for (pos = 0; pos < s.length(); pos++) {
       if (s.charAt(pos) == '_')
         break;
     }
     return s.substring(0, pos);
   }
 
   public static String rightValue(String s)
   {
     int pos = 0;
     for (pos = 0; pos < s.length(); pos++) {
       if (s.charAt(pos) == '_')
         break;
     }
     if (pos == s.length()) {
       return "0";
     }
     return s.substring(pos + 1);
   }
 
   public static String[] splitField(String field, int row, int col)
   {
     String[] result = new String[row];
     for (int i = 0; i < row; i++) {
       result[i] = "";
     }
     if (field.length() > 0) {
       if (field.length() <= col) {
         result[0] = field;
       }
       else {
         int enter = field.length() / col;
         double rest = field.length() % col;
         if (rest > 0.0D) {
           enter++;
         }
         for (int i = 0; i < enter; i++) {
           if (i == enter - 1) {
             result[i] = field.substring(i * col, field.length());
           }
           else {
             result[i] = field.substring(i * col, i * col + col);
           }
         }
       }
     }
 
     return result;
   }
 
   public static String addRightChar(char ch, int len, String str)
   {
     for (int i = str.length(); i < len; i++) {
       str = str + ch;
     }
 
     return str;
   }
 
   public static String concat(String[] s, String ch) {
     String r = "";
 
     int count = 0;
     try {
       while (true) {
         if ((!r.equals("")) && (!s[count].trim().equals("")))
           r = r + ch + s[count].trim();
         else
           r = r + s[count].trim();
         count++;
       }
     }
     catch (Exception localException)
     {
     }
     return r;
   }
 
   public static String concatBR(String[] s) {
     String r = "";
 
     int count = 0;
     try {
       while (true) {
         if ((!r.equals("")) && (!s[count].trim().equals("")))
           r = r + "<BR>" + s[count].trim();
         else
           r = r + s[count].trim();
         count++;
       }
     }
     catch (Exception localException)
     {
     }
     return r;
   }
 
   public static String fcolorDate(String d1, String d2, String d3, String mature)
   {
     d1 = d1.length() == 1 ? "0" + d1 : d1;
     d2 = d2.length() == 1 ? "0" + d2 : d2;
     d3 = d3.length() == 1 ? "0" + d3 : d3;
 
     String date = "";
     String fdate = "";
 
     if ((d1.equals("00")) && (d2.equals("00")) && (d3.equals("00"))) {
       return "&nbsp;";
     }
     date = d1 + "/" + d2 + "/" + d3;
     if (mature == "R") {
       fdate = "<FONT COLOR=RED>" + date + "</FONT>";
     }
     else if (mature == "O") {
       fdate = "<FONT COLOR=ORANGE>" + date + "</FONT>";
     }
     else {
       fdate = d1 + "/" + d2 + "/" + d3;
     }
 
     return fdate;
   }
 
   public static String formatDate(String d)
   {
     d = d.length() == 5 ? "0" + d : d;
     if (d.length() == 6) {
       String d1 = d.substring(0, 2);
       String d2 = d.substring(2, 4);
       String d3 = d.substring(4, 6);
       return d1 + "/" + d2 + "/" + d3;
     }
 
     return "";
   }
 
   public static String trim(String s)
   {
     return s.trim();
   }
 
  /* public static String getCurrentMMDDYY()
   {
     Calendar calendar = Calendar.getInstance();
     String year = calendar.get(1);
     String month = calendar.get(2) + 1;
     String day = calendar.get(5);
 
     year = year.substring(2);
     month = month.length() == 1 ? "0" + month : month;
     day = day.length() == 1 ? "0" + day : day;
 
     return month + "/" + day + "/" + year;
   }*/
 
  /* public static String getCurrentHHMMSS()
   {
     Calendar calendar = Calendar.getInstance();
     String hour = calendar.get(11);
     String minute = calendar.get(12);
     String second = calendar.get(13);
 
     hour = hour.length() == 1 ? "0" + hour : hour;
     minute = minute.length() == 1 ? "0" + minute : minute;
     second = second.length() == 1 ? "0" + second : second;
 
     return hour + ":" + minute + ":" + second;
   }*/
 
   public static int getMonth()
   {
     Calendar calendar = Calendar.getInstance();
     int month = calendar.get(2);
     return month + 1;
   }
 
  /* public static int getYear() {
     Calendar calendar = Calendar.getInstance();
     int year = calendar.get(1);
     String yearstr = year;
     yearstr = yearstr.trim().substring(2);
     return Integer.parseInt(yearstr.trim());
   }*/
 
   public static int getDay() {
     Calendar calendar = Calendar.getInstance();
     int day = calendar.get(5);
     return day;
   }
 
   public static int getHour() {
     Calendar calendar = Calendar.getInstance();
     int hour = calendar.get(11);
     return hour;
   }
 
   public static int getMinute() {
     Calendar calendar = Calendar.getInstance();
     int min = calendar.get(12);
     return min;
   }
 
   public static int getSecond() {
     Calendar calendar = Calendar.getInstance();
     int sec = calendar.get(13);
     return sec;
   }
 
   public static Timestamp getTimestamp() {
     Timestamp ts = new Timestamp(System.currentTimeMillis());
     return ts;
   }
 
   public static String getCurrentYMDHMSS() {
     SimpleDateFormat formatDate = new SimpleDateFormat("yyyyMMddhhmmssSS");
     Date currentTime = new Date();
     String dateString = formatDate.format(currentTime);
     dateString = dateString.length() > 16 ? dateString.substring(0, 16) : dateString;
     return dateString;
   }
 
   public static String formatStr(String mask, double value) {
     DecimalFormat fmt = new DecimalFormat(mask);
     return fmt.format(value);
   }
 
   public static String formatStr(String mask, String value) {
     double dv = Double.parseDouble(value);
     return formatStr(mask, dv);
   }
  /* public static int parseInt(String value) {
     int iv;
     try {
       iv = Integer.parseInt(value);
     }
     catch (Exception e)
     {
       int iv;
       iv = 0;
     }
     return iv;
   }*/
 
   public static String addDot(String number) {
     String result = "";
 
     if (number.length() == 1) {
       number = number + "00";
     }
     result = number.substring(0, number.length() - 2) + "." + number.substring(number.length() - 2);
     return result;
   }
 
   public static String formatCCY_D(String num) {
     String num2 = "";
     String result = "";
     String sign = "";
 
     if (num != "") {
       sign = num.substring(0, 1);
       if (sign.equals("-"))
         num = num.substring(1);
       else {
         sign = "";
       }
       int posi = num.indexOf(".");
       if (posi > -1) {
         int x = num.length();
         int decl = x - (posi + 1);
         if (decl > 2) x = posi + 1 + 2;
         num2 = "." + num.substring(posi + 1, x);
         if (num2.length() < 3)
           num2 = num2 + "0";
         num = num.substring(0, posi);
       }
       else {
         num2 = ".00";
       }
       int count = 0;
       int y = num.length() - 1;
       for (int x = y; x > -1; x--) {
         char nx = num.charAt(x);
         result = nx + result;
         count++;
         if (((count != 3) && (count != 6) && (count != 9) && (count != 12)) || 
           (x <= 0)) continue;
         result = "," + result;
       }
 
       result = sign + result + num2;
     }
     else {
       result = "0.00";
     }
     return result;
   }
 
   public static String formatCCY_C(String num)
   {
     String num2 = "";
     String result = "";
     String sign = "";
 
     if (num != "") {
       sign = num.substring(0, 1);
       if (sign.equals("-"))
         num = num.substring(1);
       else {
         sign = "";
       }
       int posi = num.indexOf(".");
       if (posi > -1) {
         int x = num.length();
         int decl = x - (posi + 1);
         if (decl > 2) x = posi + 1 + 2;
         num2 = "," + num.substring(posi + 1, x);
         if (num2.length() < 3)
           num2 = num2 + "0";
         num = num.substring(0, posi);
       }
       else {
         num2 = ",00";
       }
       int count = 0;
       int y = num.length() - 1;
       for (int x = y; x > -1; x--) {
         char nx = num.charAt(x);
         result = nx + result;
         count++;
         if (((count != 3) && (count != 6) && (count != 9) && (count != 12)) || 
           (x <= 0)) continue;
         result = "." + result;
       }
 
       result = sign + result + num2;
     }
     else {
       result = "0,00";
     }
     return result;
   }
 
   public static String formatCCY(String num, String DPOINT)
   {
     if (DPOINT.equals("2")) {
       return formatCCY_D(num);
     }
 
     return formatCCY_C(num);
   }
 
   public static String formatCCY(double real, String DPOINT)
   {
     if (DPOINT.equals("2")) {
       return formatCCY_D(String.valueOf(real));
     }
 
     return formatCCY_C(String.valueOf(real));
   }
 
   public static String formatCCY(BigDecimal real, String DPOINT)
   {
     if (DPOINT.equals("2")) {
       return formatCCY_D(String.valueOf(real));
     }
 
     return formatCCY_C(String.valueOf(real));
   }
 
   public static String CCY2NUM(String num, String DPOINT)
   {
     if (DPOINT.equals("2")) {
       return takeComa(num);
     }
 
     String dec = "";
     String result = "";
     String sign = "";
     if (num == "")
       return result;
     sign = num.substring(0, 1);
     if (sign == "-")
       num = num.substring(1);
     else {
       sign = "";
     }
     int posi = num.indexOf(",");
     if (posi > -1) {
       int x = num.length();
       dec = num.substring(posi + 1, x);
       if (dec.length() < 2)
         dec = dec + "0";
       dec = "." + dec;
       num = num.substring(0, posi);
     }
     else {
       dec = ".00";
     }
     int y = num.length();
     int count = 0;
     for (count = 0; count < y; count++) {
       char nx = num.charAt(count);
       if (nx != '.') {
         result = result + nx;
       }
     }
     result = sign + result + dec;
     return result;
   }
 
   public static String getDate(String FDate)
   {
     String rdateString = "";
 
     if (FDate.equals("1")) {
       SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yy");
       Date currentTime_1 = new Date();
       rdateString = formatter.format(currentTime_1);
     }
     if (FDate.equals("2")) {
       SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy");
       Date currentTime_1 = new Date();
       rdateString = formatter.format(currentTime_1);
     }
 
     return rdateString;
   }
 
   public static String takeCero(String number) {
     String result = "";
     boolean scero = false;
     int lgt = 0;
 
     scero = number.startsWith("0");
     result = number;
     lgt = number.length();
     while (scero) {
       result = result.substring(1, lgt);
       scero = result.startsWith("0");
       lgt = result.length();
     }
     return result;
   }
 
   public static String formatTime(String t)
   {
     if (t.length() == 5) {
       t = "0" + t;
     }
     if (t.length() == 6) {
       String t1 = t.substring(0, 2);
       String t2 = t.substring(2, 4);
       String t3 = t.substring(4, 6);
 
       return t1 + ":" + t2 + ":" + t3;
     }
 
     return t;
   }
 
   public static String getRefNum()
   {
     SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
     Date currentTime_1 = new Date();
     String rdateString = formatter.format(currentTime_1);
     return rdateString;
   }
 
   public static String getRefNum9() {
     SimpleDateFormat formatter = new SimpleDateFormat("HHmmssSSS");
     Date currentTime_1 = new Date();
     String rdateString = formatter.format(currentTime_1);
     return rdateString;
   }
 
   public static String takeComa(String number) {
     String result = "";
     int posi = number.indexOf(",");
     if (posi > -1) {
       while (posi > -1) {
         result = number.substring(0, posi);
         result = result + number.substring(posi + 1);
         posi = result.indexOf(",");
         number = result;
       }
     }
     else {
       result = number;
     }
     return result;
   }
 
   public static String takeSS(String number) {
     String result = "";
     int posi = number.indexOf("/");
     if (posi > -1) {
       while (posi > -1) {
         result = number.substring(0, posi);
         result = result + number.substring(posi + 1);
         posi = result.indexOf("/");
         number = result;
       }
     }
     else {
       result = number;
     }
     return result;
   }
 
   public static String takeDot(String number) {
     String result = "";
     int posi = number.indexOf(".");
     if (posi > -1) {
       result = number.substring(0, posi);
       result = result + number.substring(posi + 1);
     }
     else {
       result = number + "00";
     }
     return result;
   }
 
  /* public static String getMM()
   {
     Calendar calendar = Calendar.getInstance();
     String month = calendar.get(2) + 1;
 
     month = month.length() == 1 ? "0" + month : month;
 
     return month;
   }*/
 
 /*  public static String getDD()
   {
     Calendar calendar = Calendar.getInstance();
     String day = calendar.get(5);
 
     day = day.length() == 1 ? "0" + day : day;
 
     return day;
   }*/
 
 /*  public static String getYY()
   {
     Calendar calendar = Calendar.getInstance();
     String year = calendar.get(1);
 
     year = year.substring(2);
 
     return year;
   }
 */
  /* public static boolean IsRutValid(String rut)
   {
     rut = rut.toUpperCase();
     int[] factor = { 5, 4, 3, 2, 7, 6, 5, 4, 3, 2 };
     char[] dv = { 'X', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'K', '0' };
     int len = rut.length() - 1;
     int ceros = 10 - len;
     int i = 0;
     if (ceros > 0) {
       for (i = 0; i < ceros; i++)
         rut = "0" + rut;
     }
     int count = 0;
     int suma = 0;
     int auxInt = 0;
     for (count = 0; count < 10; count++) {
       auxInt = parseInt(rut.substring(count, count + 1));
       suma += auxInt * factor[count];
     }
     int index = 11 - suma % 11;
     return rut.charAt(10) == dv[index];
   }
 */
   public static String getRUT(String rut) {
     return rut.substring(0, rut.indexOf("-"));
   }
 
   public static String getDigit(String rut) {
     return rut.substring(rut.indexOf("-") + 1, rut.length());
   }
 
   public static int getDayofWeek(int m, int d, int y)
   {
     m -= 2;
     if (m < 1) {
       m += 12;
       y--;
     }
     int cc = y / 100;
     int yy = y % 100;
     int dow = (d + (int)Math.floor(2.6D * m - 0.2D) - 2 * cc + yy + yy / 4 + cc / 4) % 7;
     if (dow < 0) {
       dow += 7;
     }
     return dow;
   }
 
   public static String getDaySpell(String date, String format) {
     String[] Dias = { "Domingo", "Lunes", "Martes", "Mi√©rcoles", "Jueves", "Viernes", "S√°bado" };
     String[] Days = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
     String result = "";
 
     if (format == "MM/DD/AA") {
       int d = Integer.parseInt(date.substring(3, 5));
       int m = Integer.parseInt(date.substring(0, 2));
       int y = Integer.parseInt(date.substring(6, 8));
       int day = getDayofWeek(m, d, y);
       result = Dias[day];
     }
     if (format == "DD/MM/AA") {
       int m = Integer.parseInt(date.substring(3, 5));
       int d = Integer.parseInt(date.substring(0, 2));
       int y = Integer.parseInt(date.substring(6, 8));
       int day = getDayofWeek(m, d, y);
       result = Dias[day];
     }
     if (format == "MM/DD/YY") {
       int d = Integer.parseInt(date.substring(3, 5));
       int m = Integer.parseInt(date.substring(0, 2));
       int y = Integer.parseInt(date.substring(6, 8));
       int day = getDayofWeek(m, d, y);
       result = Days[day];
     }
     if (format == "DD/MM/YY") {
       int m = Integer.parseInt(date.substring(3, 5));
       int d = Integer.parseInt(date.substring(0, 2));
       int y = Integer.parseInt(date.substring(6, 8));
       int day = getDayofWeek(m, d, y);
       result = Days[day];
     }
     return result;
   }
 
   public static boolean compareYYMMDD(String YY, String DD, String MM, String AYY, String ADD, String AMM)
   {
     boolean rerror = false;
 
     int VYY = Integer.parseInt(YY);
     int VMM = Integer.parseInt(MM);
     int VDD = Integer.parseInt(DD);
 
     int CYY = Integer.parseInt(AYY);
     int CMM = Integer.parseInt(AMM);
     int CDD = Integer.parseInt(ADD);
 
     if (CYY > VYY) {
       rerror = true;
     }
     if ((CMM > VMM) && ((CYY > VYY) || (CYY == VYY))) {
       rerror = true;
     }
     if ((CDD > VDD) && ((CMM > VMM) || (CMM == VMM)) && ((CYY > VYY) || (CYY == VYY))) {
       rerror = true;
     }
 
     if ((VDD == CDD) && (VMM == CMM) && (CYY == VYY)) {
       rerror = false;
     }
 
     return rerror;
   }
 
   public static boolean compareYYMMDDfuture(String YY, String DD, String MM, String AYY, String ADD, String AMM) {
     boolean rerror = false;
 
     int VYY = Integer.parseInt(YY);
     int VMM = Integer.parseInt(MM);
     int VDD = Integer.parseInt(DD);
 
     int CYY = Integer.parseInt(AYY);
     int CMM = Integer.parseInt(AMM);
     int CDD = Integer.parseInt(ADD);
 
     int VDATE = VYY * 10000 + VMM * 100 + VDD;
     int CDATE = CYY * 10000 + CMM * 100 + CDD;
 
     if (VDATE < CDATE) rerror = true;
 
     return rerror;
   }
  /* public static String getYYYY() {
     Calendar calendar = Calendar.getInstance();
     String year = calendar.get(1);
     return year;
   }*/
 
   /*public static String getTDATE() {
     String TDATE = String.valueOf(Integer.parseInt(getYYYY()) * 10000 + Integer.parseInt(getMM()) * 100 + Integer.parseInt(getDD()));
     return TDATE;
   }
 */
   public static String getKEYVAL(int KEYVAL)
   {
     String RTNVAL = "";
 
     switch (KEYVAL) {
     case 1:
       RTNVAL = "A";
       break;
     case 2:
       RTNVAL = "B";
       break;
     case 3:
       RTNVAL = "C";
       break;
     case 4:
       RTNVAL = "D";
       break;
     case 5:
       RTNVAL = "E";
       break;
     case 6:
       RTNVAL = "F";
       break;
     case 7:
       RTNVAL = "G";
       break;
     case 8:
       RTNVAL = "H";
       break;
     case 9:
       RTNVAL = "I";
       break;
     case 10:
       RTNVAL = "J";
       break;
     case 11:
       RTNVAL = "K";
       break;
     case 12:
       RTNVAL = "L";
       break;
     case 13:
       RTNVAL = "M";
       break;
     case 14:
       RTNVAL = "N";
       break;
     case 15:
       RTNVAL = "O";
       break;
     case 16:
       RTNVAL = "P";
       break;
     case 17:
       RTNVAL = "Q";
       break;
     case 18:
       RTNVAL = "R";
       break;
     case 19:
       RTNVAL = "S";
       break;
     case 20:
       RTNVAL = "T";
       break;
     case 21:
       RTNVAL = "U";
       break;
     case 22:
       RTNVAL = "V";
       break;
     case 23:
       RTNVAL = "W";
       break;
     case 24:
       RTNVAL = "X";
       break;
     case 25:
       RTNVAL = "Y";
       break;
     case 26:
       RTNVAL = "Z";
       break;
     case 27:
       RTNVAL = "1";
       break;
     case 28:
       RTNVAL = "2";
       break;
     case 29:
       RTNVAL = "3";
       break;
     case 30:
       RTNVAL = "4";
       break;
     case 31:
       RTNVAL = "5";
       break;
     case 32:
       RTNVAL = "6";
       break;
     case 33:
       RTNVAL = "7";
       break;
     case 34:
       RTNVAL = "8";
       break;
     case 35:
       RTNVAL = "9";
     }
 
     return RTNVAL;
   }
 
   public static String getRandom(int NCHAR) {
     String PASSWORD = "";
     String PASVAL = "";
 
     for (int i = 0; i < NCHAR; i++) {
       Random generator = new Random();
       int NUM = generator.nextInt(34) + 1;
       PASVAL = getKEYVAL(NUM);
 
       while (PASSWORD.indexOf(PASVAL) != -1) {
         NUM = generator.nextInt(34) + 1;
         PASVAL = getKEYVAL(NUM);
       }
 
       PASSWORD = PASSWORD + PASVAL;
     }
 
     return PASSWORD;
   }
 
   public static int getRandom()
   {
     int NUM = generator.nextInt(9) + 1;
 
     return NUM;
   }
 
   public static String getVKeyTop() {
     String TABLE = "";
     String IMG0 = "Img_";
     String LTR0 = "Teclado Virtual - Numero ";
     String IMG1 = "Img_";
     String LTR1 = "Teclado Virtual - Numero ";
     String IMG2 = "Img_";
     String LTR2 = "Teclado Virtual - Numero ";
     String IMG3 = "Img_";
     String LTR3 = "Teclado Virtual - Numero ";
     String IMG4 = "Img_";
     String LTR4 = "Teclado Virtual - Numero ";
     String IMG5 = "Img_";
     String LTR5 = "Teclado Virtual - Numero ";
     String IMG6 = "Img_";
     String LTR6 = "Teclado Virtual - Numero ";
     String IMG7 = "Img_";
     String LTR7 = "Teclado Virtual - Numero ";
     String IMG8 = "Img_";
     String LTR8 = "Teclado Virtual - Numero ";
     String IMG9 = "Img_";
     String LTR9 = "Teclado Virtual - Numero ";
 
     int NUM0 = 0;
     int NUM1 = 0;
     int NUM2 = 0;
     int NUM3 = 0;
     int NUM4 = 0;
     int NUM5 = 0;
     int NUM6 = 0;
     int NUM7 = 0;
     int NUM8 = 0;
     int NUM9 = 0;
 
     int FNUM = getRandom();
 
     int x = 0;
 
     while ((FNUM < 10) && (x < 10)) {
       switch (x) {
       case 0:
         IMG0 = IMG0 + FNUM;
         LTR0 = LTR0 + FNUM;
         NUM0 = FNUM;
         break;
       case 1:
         IMG1 = IMG1 + FNUM;
         LTR1 = LTR1 + FNUM;
         NUM1 = FNUM;
         break;
       case 2:
         IMG2 = IMG2 + FNUM;
         LTR2 = LTR2 + FNUM;
         NUM2 = FNUM;
         break;
       case 3:
         IMG3 = IMG3 + FNUM;
         LTR3 = LTR3 + FNUM;
         NUM3 = FNUM;
         break;
       case 4:
         IMG4 = IMG4 + FNUM;
         LTR4 = LTR4 + FNUM;
         NUM4 = FNUM;
         break;
       case 5:
         IMG5 = IMG5 + FNUM;
         LTR5 = LTR5 + FNUM;
         NUM5 = FNUM;
         break;
       case 6:
         IMG6 = IMG6 + FNUM;
         LTR6 = LTR6 + FNUM;
         NUM6 = FNUM;
         break;
       case 7:
         IMG7 = IMG7 + FNUM;
         LTR7 = LTR7 + FNUM;
         NUM7 = FNUM;
         break;
       case 8:
         IMG8 = IMG8 + FNUM;
         LTR8 = LTR8 + FNUM;
         NUM8 = FNUM;
         break;
       case 9:
         IMG9 = IMG9 + FNUM;
         LTR9 = LTR9 + FNUM;
         NUM9 = FNUM;
       }
 
       FNUM++;
       x++;
     }
 
     FNUM = 0;
 
     while ((FNUM < 10) && (x < 10)) {
       switch (x) {
       case 0:
         IMG0 = IMG0 + FNUM;
         LTR0 = LTR0 + FNUM;
         NUM0 = FNUM;
         break;
       case 1:
         IMG1 = IMG1 + FNUM;
         LTR1 = LTR1 + FNUM;
         NUM1 = FNUM;
         break;
       case 2:
         IMG2 = IMG2 + FNUM;
         LTR2 = LTR2 + FNUM;
         NUM2 = FNUM;
         break;
       case 3:
         IMG3 = IMG3 + FNUM;
         LTR3 = LTR3 + FNUM;
         NUM3 = FNUM;
         break;
       case 4:
         IMG4 = IMG4 + FNUM;
         LTR4 = LTR4 + FNUM;
         NUM4 = FNUM;
         break;
       case 5:
         IMG5 = IMG5 + FNUM;
         LTR5 = LTR5 + FNUM;
         NUM5 = FNUM;
         break;
       case 6:
         IMG6 = IMG6 + FNUM;
         LTR6 = LTR6 + FNUM;
         NUM6 = FNUM;
         break;
       case 7:
         IMG7 = IMG7 + FNUM;
         LTR7 = LTR7 + FNUM;
         NUM7 = FNUM;
         break;
       case 8:
         IMG8 = IMG8 + FNUM;
         LTR8 = LTR8 + FNUM;
         NUM8 = FNUM;
         break;
       case 9:
         IMG9 = IMG9 + FNUM;
         LTR9 = LTR9 + FNUM;
         NUM9 = FNUM;
       }
 
       FNUM++;
       x++;
     }
 
     TABLE = "<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">";
 
     TABLE = TABLE + "<TR>";
     TABLE = TABLE + "<td valign=\"top\"><img name=\"" + 
       IMG0 + 
       "\" src=\"../images/" + 
       IMG0 + 
       ".gif\"  border=\"0\" alt=\"" + 
       LTR0 + 
       "\" title=\"" + 
       LTR0 + 
       "\" onMouseUp=\"JavaScript:anadirLetra ('" + 
       NUM0 + 
       "');\" class=\"botonesEnvio\"></td>";
     TABLE = TABLE + "<td valign=\"top\"><img name=\"" + 
       IMG1 + 
       "\" src=\"../images/" + 
       IMG1 + 
       ".gif\"  border=\"0\" alt=\"" + 
       LTR1 + 
       "\" title=\"" + 
       LTR1 + 
       "\" onMouseUp=\"JavaScript:anadirLetra ('" + 
       NUM1 + 
       "');\" class=\"botonesEnvio\"></td>";
     TABLE = TABLE + "<td valign=\"top\"><img name=\"" + 
       IMG2 + 
       "\" src=\"../images/" + 
       IMG2 + 
       ".gif\"  border=\"0\" alt=\"" + 
       LTR2 + 
       "\" title=\"" + 
       LTR2 + 
       "\" onMouseUp=\"JavaScript:anadirLetra ('" + 
       NUM2 + 
       "');\" class=\"botonesEnvio\"></td>";
     TABLE = TABLE + "<td valign=\"top\"><img name=\"" + 
       IMG3 + 
       "\" src=\"../images/" + 
       IMG3 + 
       ".gif\"  border=\"0\" alt=\"" + 
       LTR3 + 
       "\" title=\"" + 
       LTR3 + 
       "\" onMouseUp=\"JavaScript:anadirLetra ('" + 
       NUM3 + 
       "');\" class=\"botonesEnvio\"></td>";
     TABLE = TABLE + "<td valign=\"top\"><img name=\"" + 
       IMG4 + 
       "\" src=\"../images/" + 
       IMG4 + 
       ".gif\"  border=\"0\" alt=\"" + 
       LTR4 + 
       "\" title=\"" + 
       LTR4 + 
       "\" onMouseUp=\"JavaScript:anadirLetra ('" + 
       NUM4 + 
       "');\" class=\"botonesEnvio\"></td>";
     TABLE = TABLE + "<td valign=\"top\"><img name=\"" + 
       IMG5 + 
       "\" src=\"../images/" + 
       IMG5 + 
       ".gif\"  border=\"0\" alt=\"" + 
       LTR5 + 
       "\" title=\"" + 
       LTR5 + 
       "\" onMouseUp=\"JavaScript:anadirLetra ('" + 
       NUM5 + 
       "');\" class=\"botonesEnvio\"></td>";
     TABLE = TABLE + "<td valign=\"top\"><img name=\"" + 
       IMG6 + 
       "\" src=\"../images/" + 
       IMG6 + 
       ".gif\"  border=\"0\" alt=\"" + 
       LTR6 + 
       "\" title=\"" + 
       LTR6 + 
       "\" onMouseUp=\"JavaScript:anadirLetra ('" + 
       NUM6 + 
       "');\" class=\"botonesEnvio\"></td>";
     TABLE = TABLE + "<td valign=\"top\"><img name=\"" + 
       IMG7 + 
       "\" src=\"../images/" + 
       IMG7 + 
       ".gif\"  border=\"0\" alt=\"" + 
       LTR7 + 
       "\" title=\"" + 
       LTR7 + 
       "\" onMouseUp=\"JavaScript:anadirLetra ('" + 
       NUM7 + 
       "');\" class=\"botonesEnvio\"></td>";
     TABLE = TABLE + "<td valign=\"top\"><img name=\"" + 
       IMG8 + 
       "\" src=\"../images/" + 
       IMG8 + 
       ".gif\"  border=\"0\" alt=\"" + 
       LTR8 + 
       "\" title=\"" + 
       LTR8 + 
       "\" onMouseUp=\"JavaScript:anadirLetra ('" + 
       NUM8 + 
       "');\" class=\"botonesEnvio\"></td>";
     TABLE = TABLE + "<td valign=\"top\"><img name=\"" + 
       IMG9 + 
       "\" src=\"../images/" + 
       IMG9 + 
       ".gif\"  border=\"0\" alt=\"" + 
       LTR9 + 
       "\" title=\"" + 
       LTR9 + 
       "\" onMouseUp=\"JavaScript:anadirLetra ('" + 
       NUM9 + 
       "');\" class=\"botonesEnvio\"></td>";
     TABLE = TABLE + "</TR>";
 
     TABLE = TABLE + "</TABLE>";
     return TABLE;
   }
 
   public static String getTable1()
   {
     getVKey();
 
     TABLE = "<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">";
 
     TABLE += "<TR>";
 
     TABLE = TABLE + "<td valign=\"top\"><img name=\"" + 
       IMG0 + 
       "\" src=\"../images/" + 
       IMG0 + 
       ".gif\"  border=\"0\" " + 
       " onMouseUp=\"JavaScript:anadirLetra ('" + 
       NUM0 + 
       "');\" onMouseOver=\"JavaScript:SHOWA ();\" onmouseout=\"JavaScript:SHOWN ();\"" + 
       " class=\"botonesEnvio\"></td>";
 
     TABLE = TABLE + "<td valign=\"top\"><img name=\"" + 
       IMG1 + 
       "\" src=\"../images/" + 
       IMG1 + 
       ".gif\"  border=\"0\" " + 
       " onMouseUp=\"JavaScript:anadirLetra ('" + 
       NUM1 + 
       "');\" onMouseOver=\"JavaScript:SHOWA ();\" onmouseout=\"JavaScript:SHOWN ();\"" + 
       " class=\"botonesEnvio\"></td>";
 
     TABLE = TABLE + "<td valign=\"top\"><img name=\"" + 
       IMG2 + 
       "\" src=\"../images/" + 
       IMG2 + 
       ".gif\"  border=\"0\" " + 
       " onMouseUp=\"JavaScript:anadirLetra ('" + 
       NUM2 + 
       "');\" onMouseOver=\"JavaScript:SHOWA ();\" onmouseout=\"JavaScript:SHOWN ();\"" + 
       " class=\"botonesEnvio\"></td>";
 
     TABLE = TABLE + "<td valign=\"top\"><img name=\"" + 
       IMG3 + 
       "\" src=\"../images/" + 
       IMG3 + 
       ".gif\"  border=\"0\" " + 
       " onMouseUp=\"JavaScript:anadirLetra ('" + 
       NUM3 + 
       "');\" onMouseOver=\"JavaScript:SHOWA ();\" onmouseout=\"JavaScript:SHOWN ();\"" + 
       " class=\"botonesEnvio\"></td>";
 
     TABLE = TABLE + "<td valign=\"top\"><img name=\"" + 
       IMG4 + 
       "\" src=\"../images/" + 
       IMG4 + 
       ".gif\"  border=\"0\" " + 
       " onMouseUp=\"JavaScript:anadirLetra ('" + 
       NUM4 + 
       "');\" onMouseOver=\"JavaScript:SHOWA ();\" onmouseout=\"JavaScript:SHOWN ();\"" + 
       " class=\"botonesEnvio\"></td>";
 
     TABLE = TABLE + "<td valign=\"top\"><img name=\"" + 
       IMG5 + 
       "\" src=\"../images/" + 
       IMG5 + 
       ".gif\"  border=\"0\" " + 
       " onMouseUp=\"JavaScript:anadirLetra ('" + 
       NUM5 + 
       "');\" onMouseOver=\"JavaScript:SHOWA ();\" onmouseout=\"JavaScript:SHOWN ();\"" + 
       " class=\"botonesEnvio\"></td>";
 
     TABLE = TABLE + "<td valign=\"top\"><img name=\"" + 
       IMG6 + 
       "\" src=\"../images/" + 
       IMG6 + 
       ".gif\"  border=\"0\" " + 
       " onMouseUp=\"JavaScript:anadirLetra ('" + 
       NUM6 + 
       "');\" onMouseOver=\"JavaScript:SHOWA ();\" onmouseout=\"JavaScript:SHOWN ();\"" + 
       " class=\"botonesEnvio\"></td>";
 
     TABLE = TABLE + "<td valign=\"top\"><img name=\"" + 
       IMG7 + 
       "\" src=\"../images/" + 
       IMG7 + 
       ".gif\"  border=\"0\" " + 
       " onMouseUp=\"JavaScript:anadirLetra ('" + 
       NUM7 + 
       "');\" onMouseOver=\"JavaScript:SHOWA ();\" onmouseout=\"JavaScript:SHOWN ();\"" + 
       " class=\"botonesEnvio\"></td>";
 
     TABLE = TABLE + "<td valign=\"top\"><img name=\"" + 
       IMG8 + 
       "\" src=\"../images/" + 
       IMG8 + 
       ".gif\"  border=\"0\" " + 
       " onMouseUp=\"JavaScript:anadirLetra ('" + 
       NUM8 + 
       "');\" onMouseOver=\"JavaScript:SHOWA ();\" onmouseout=\"JavaScript:SHOWN ();\"" + 
       " class=\"botonesEnvio\"></td>";
 
     TABLE = TABLE + "<td valign=\"top\"><img name=\"" + 
       IMG9 + 
       "\" src=\"../images/" + 
       IMG9 + 
       ".gif\"  border=\"0\" " + 
       " onMouseUp=\"JavaScript:anadirLetra ('" + 
       NUM9 + 
       "');\" onMouseOver=\"JavaScript:SHOWA ();\" onmouseout=\"JavaScript:SHOWN ();\"" + 
       " class=\"botonesEnvio\"></td>";
     TABLE += "</TR>";
 
     TABLE += "</TABLE>";
     return TABLE;
   }
 
   public static String getTable2()
   {
     IMG0 = "Img_a";
     IMG1 = "Img_a";
     IMG2 = "Img_a";
     IMG3 = "Img_a";
     IMG4 = "Img_a";
     IMG5 = "Img_a";
     IMG6 = "Img_a";
     IMG7 = "Img_a";
     IMG8 = "Img_a";
     IMG9 = "Img_a";
 
     TABLE = "<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">";
 
     TABLE += "<TR>";
 
     TABLE = TABLE + "<td valign=\"top\"><img name=\"" + 
       IMG0 + 
       "\" src=\"../images/" + 
       IMG0 + 
       ".gif\"  border=\"0\" " + 
       " onMouseUp=\"JavaScript:anadirLetra ('" + 
       NUM0 + 
       "');\" onMouseOver=\"JavaScript:SHOWA ();\" onmouseout=\"JavaScript:SHOWN ();\"" + 
       " class=\"botonesEnvio\"></td>";
 
     TABLE = TABLE + "<td valign=\"top\"><img name=\"" + 
       IMG1 + 
       "\" src=\"../images/" + 
       IMG1 + 
       ".gif\"  border=\"0\" " + 
       " onMouseUp=\"JavaScript:anadirLetra ('" + 
       NUM1 + 
       "');\" onMouseOver=\"JavaScript:SHOWA ();\" onmouseout=\"JavaScript:SHOWN ();\"" + 
       " class=\"botonesEnvio\"></td>";
 
     TABLE = TABLE + "<td valign=\"top\"><img name=\"" + 
       IMG2 + 
       "\" src=\"../images/" + 
       IMG2 + 
       ".gif\"  border=\"0\" " + 
       " onMouseUp=\"JavaScript:anadirLetra ('" + 
       NUM2 + 
       "');\" onMouseOver=\"JavaScript:SHOWA ();\" onmouseout=\"JavaScript:SHOWN ();\"" + 
       " class=\"botonesEnvio\"></td>";
 
     TABLE = TABLE + "<td valign=\"top\"><img name=\"" + 
       IMG3 + 
       "\" src=\"../images/" + 
       IMG3 + 
       ".gif\"  border=\"0\" " + 
       " onMouseUp=\"JavaScript:anadirLetra ('" + 
       NUM3 + 
       "');\" onMouseOver=\"JavaScript:SHOWA ();\" onmouseout=\"JavaScript:SHOWN ();\"" + 
       " class=\"botonesEnvio\"></td>";
 
     TABLE = TABLE + "<td valign=\"top\"><img name=\"" + 
       IMG4 + 
       "\" src=\"../images/" + 
       IMG4 + 
       ".gif\"  border=\"0\" " + 
       " onMouseUp=\"JavaScript:anadirLetra ('" + 
       NUM4 + 
       "');\" onMouseOver=\"JavaScript:SHOWA ();\" onmouseout=\"JavaScript:SHOWN ();\"" + 
       " class=\"botonesEnvio\"></td>";
 
     TABLE = TABLE + "<td valign=\"top\"><img name=\"" + 
       IMG5 + 
       "\" src=\"../images/" + 
       IMG5 + 
       ".gif\"  border=\"0\" " + 
       " onMouseUp=\"JavaScript:anadirLetra ('" + 
       NUM5 + 
       "');\" onMouseOver=\"JavaScript:SHOWA ();\" onmouseout=\"JavaScript:SHOWN ();\"" + 
       " class=\"botonesEnvio\"></td>";
 
     TABLE = TABLE + "<td valign=\"top\"><img name=\"" + 
       IMG6 + 
       "\" src=\"../images/" + 
       IMG6 + 
       ".gif\"  border=\"0\" " + 
       " onMouseUp=\"JavaScript:anadirLetra ('" + 
       NUM6 + 
       "');\" onMouseOver=\"JavaScript:SHOWA ();\" onmouseout=\"JavaScript:SHOWN ();\"" + 
       " class=\"botonesEnvio\"></td>";
 
     TABLE = TABLE + "<td valign=\"top\"><img name=\"" + 
       IMG7 + 
       "\" src=\"../images/" + 
       IMG7 + 
       ".gif\"  border=\"0\" " + 
       " onMouseUp=\"JavaScript:anadirLetra ('" + 
       NUM7 + 
       "');\" onMouseOver=\"JavaScript:SHOWA ();\" onmouseout=\"JavaScript:SHOWN ();\"" + 
       " class=\"botonesEnvio\"></td>";
 
     TABLE = TABLE + "<td valign=\"top\"><img name=\"" + 
       IMG8 + 
       "\" src=\"../images/" + 
       IMG8 + 
       ".gif\"  border=\"0\" " + 
       " onMouseUp=\"JavaScript:anadirLetra ('" + 
       NUM8 + 
       "');\" onMouseOver=\"JavaScript:SHOWA ();\" onmouseout=\"JavaScript:SHOWN ();\"" + 
       " class=\"botonesEnvio\"></td>";
 
     TABLE = TABLE + "<td valign=\"top\"><img name=\"" + 
       IMG9 + 
       "\" src=\"../images/" + 
       IMG9 + 
       ".gif\"  border=\"0\" " + 
       " onMouseUp=\"JavaScript:anadirLetra ('" + 
       NUM9 + 
       "');\" onMouseOver=\"JavaScript:SHOWA ();\" onmouseout=\"JavaScript:SHOWN ();\"" + 
       " class=\"botonesEnvio\"></td>";
     TABLE += "</TR>";
 
     TABLE += "</TABLE>";
     return TABLE;
   }
 
   public static void getVKey() {
     String TABLE = "";
     IMG0 = "Img_";
     IMG1 = "Img_";
     IMG2 = "Img_";
     IMG3 = "Img_";
     IMG4 = "Img_";
     IMG5 = "Img_";
     IMG6 = "Img_";
     IMG7 = "Img_";
     IMG8 = "Img_";
     IMG9 = "Img_";
 
     NUM0 = 0;
     NUM1 = 0;
     NUM2 = 0;
     NUM3 = 0;
     NUM4 = 0;
     NUM5 = 0;
     NUM6 = 0;
     NUM7 = 0;
     NUM8 = 0;
     NUM9 = 0;
 
     int FNUM = getRandom();
 
     int x = 0;
 
     while ((FNUM < 10) && (x < 10)) {
       switch (x) {
       case 0:
         IMG0 += FNUM;
         NUM0 = FNUM;
         break;
       case 1:
         IMG1 += FNUM;
         NUM1 = FNUM;
         break;
       case 2:
         IMG2 += FNUM;
         NUM2 = FNUM;
         break;
       case 3:
         IMG3 += FNUM;
         NUM3 = FNUM;
         break;
       case 4:
         IMG4 += FNUM;
         NUM4 = FNUM;
         break;
       case 5:
         IMG5 += FNUM;
         NUM5 = FNUM;
         break;
       case 6:
         IMG6 += FNUM;
         NUM6 = FNUM;
         break;
       case 7:
         IMG7 += FNUM;
         NUM7 = FNUM;
         break;
       case 8:
         IMG8 += FNUM;
         NUM8 = FNUM;
         break;
       case 9:
         IMG9 += FNUM;
         NUM9 = FNUM;
       }
 
       FNUM++;
       x++;
     }
 
     FNUM = 0;
 
     while ((FNUM < 10) && (x < 10)) {
       switch (x) {
       case 0:
         IMG0 += FNUM;
         NUM0 = FNUM;
         break;
       case 1:
         IMG1 += FNUM;
         NUM1 = FNUM;
         break;
       case 2:
         IMG2 += FNUM;
         NUM2 = FNUM;
         break;
       case 3:
         IMG3 += FNUM;
         NUM3 = FNUM;
         break;
       case 4:
         IMG4 += FNUM;
         NUM4 = FNUM;
         break;
       case 5:
         IMG5 += FNUM;
         NUM5 = FNUM;
         break;
       case 6:
         IMG6 += FNUM;
         NUM6 = FNUM;
         break;
       case 7:
         IMG7 += FNUM;
         NUM7 = FNUM;
         break;
       case 8:
         IMG8 += FNUM;
         NUM8 = FNUM;
         break;
       case 9:
         IMG9 += FNUM;
         NUM9 = FNUM;
       }
 
       FNUM++;
       x++;
     }
   }
 
   public static String getTableA1()
   {
     getVKey();
 
     TABLE = "<table border=\"0\" width=\"72px\" cellpadding=\"0\" cellspacing=\"0\">";
 
     TABLE += "<TR>";
 
     TABLE = TABLE + "<td valign=\"top\"><img name=\"" + 
       IMG0 + 
       "\" src=\"../images/" + 
       IMG0 + 
       ".gif\" width=\"26\" height=\"24\" border=\"0\"\" " + 
       "\" onMouseUp=\"JavaScript:anadirLetra ('" + 
       NUM0 + 
       "');\" onMouseOver=\"JavaScript:SHOWA ();\" onmouseout=\"JavaScript:SHOWN ();\"" + 
       "');\" class=\"botonesEnvio\"></td>";
 
     TABLE = TABLE + "<td valign=\"top\"><img name=\"" + 
       IMG1 + 
       "\" src=\"../images/" + 
       IMG1 + 
       ".gif\" width=\"26\" height=\"24\" border=\"0\"\" " + 
       "\" onMouseUp=\"JavaScript:anadirLetra ('" + 
       NUM1 + 
       "');\" onMouseOver=\"JavaScript:SHOWA ();\" onmouseout=\"JavaScript:SHOWN ();\"" + 
       "');\" class=\"botonesEnvio\"></td>";
 
     TABLE = TABLE + "<td valign=\"top\"><img name=\"" + 
       IMG2 + 
       "\" src=\"../images/" + 
       IMG2 + 
       ".gif\" width=\"26\" height=\"24\" border=\"0\"\" " + 
       "\" onMouseUp=\"JavaScript:anadirLetra ('" + 
       NUM2 + 
       "');\" onMouseOver=\"JavaScript:SHOWA ();\" onmouseout=\"JavaScript:SHOWN ();\"" + 
       "');\" class=\"botonesEnvio\"></td>";
     TABLE += "</TR>";
 
     TABLE += "<TR>";
 
     TABLE = TABLE + "<td valign=\"top\"><img name=\"" + 
       IMG3 + 
       "\" src=\"../images/" + 
       IMG3 + 
       ".gif\" width=\"26\" height=\"24\" border=\"0\"\" " + 
       "\" onMouseUp=\"JavaScript:anadirLetra ('" + 
       NUM3 + 
       "');\" onMouseOver=\"JavaScript:SHOWA ();\" onmouseout=\"JavaScript:SHOWN ();\"" + 
       "');\" class=\"botonesEnvio\"></td>";
 
     TABLE = TABLE + "<td valign=\"top\"><img name=\"" + 
       IMG4 + 
       "\" src=\"../images/" + 
       IMG4 + 
       ".gif\" width=\"26\" height=\"24\" border=\"0\"\" " + 
       "\" onMouseUp=\"JavaScript:anadirLetra ('" + 
       NUM4 + 
       "');\" onMouseOver=\"JavaScript:SHOWA ();\" onmouseout=\"JavaScript:SHOWN ();\"" + 
       "');\" class=\"botonesEnvio\"></td>";
 
     TABLE = TABLE + "<td valign=\"top\"><img name=\"" + 
       IMG5 + 
       "\" src=\"../images/" + 
       IMG5 + 
       ".gif\" width=\"26\" height=\"24\" border=\"0\"\" " + 
       "\" onMouseUp=\"JavaScript:anadirLetra ('" + 
       NUM5 + 
       "');\" onMouseOver=\"JavaScript:SHOWA ();\" onmouseout=\"JavaScript:SHOWN ();\"" + 
       "');\" class=\"botonesEnvio\"></td>";
     TABLE += "</TR>";
 
     TABLE += "<TR>";
 
     TABLE = TABLE + "<td valign=\"top\"><img name=\"" + 
       IMG6 + 
       "\" src=\"../images/" + 
       IMG6 + 
       ".gif\" width=\"26\" height=\"24\" border=\"0\"\" " + 
       "\" onMouseUp=\"JavaScript:anadirLetra ('" + 
       NUM6 + 
       "');\" onMouseOver=\"JavaScript:SHOWA ();\" onmouseout=\"JavaScript:SHOWN ();\"" + 
       "');\" class=\"botonesEnvio\"></td>";
 
     TABLE = TABLE + "<td valign=\"top\"><img name=\"" + 
       IMG7 + 
       "\" src=\"../images/" + 
       IMG7 + 
       ".gif\" width=\"26\" height=\"24\" border=\"0\"\" " + 
       "\" onMouseUp=\"JavaScript:anadirLetra ('" + 
       NUM7 + 
       "');\" onMouseOver=\"JavaScript:SHOWA ();\" onmouseout=\"JavaScript:SHOWN ();\"" + 
       "');\" class=\"botonesEnvio\"></td>";
 
     TABLE = TABLE + "<td valign=\"top\"><img name=\"" + 
       IMG8 + 
       "\" src=\"../images/" + 
       IMG8 + 
       ".gif\" width=\"26\" height=\"24\" border=\"0\"\" " + 
       "\" onMouseUp=\"JavaScript:anadirLetra ('" + 
       NUM8 + 
       "');\" onMouseOver=\"JavaScript:SHOWA ();\" onmouseout=\"JavaScript:SHOWN ();\"" + 
       "');\" class=\"botonesEnvio\"></td>";
     TABLE += "</TR>";
 
     TABLE += "<TR>";
     TABLE += "<td rowspan=\"2\" ><img src=\"../images/spacer.gif\" width=\"26\" height=\"24\" border=\"0\"></td>";
 
     TABLE = TABLE + "<td valign=\"top\"><img name=\"" + 
       IMG9 + 
       "\" src=\"../images/" + 
       IMG9 + 
       ".gif\" width=\"26\" height=\"24\" border=\"0\"\" " + 
       "\" onMouseUp=\"JavaScript:anadirLetra ('" + 
       NUM9 + 
       "');\" onMouseOver=\"JavaScript:SHOWA ();\" onmouseout=\"JavaScript:SHOWN ();\"" + 
       "');\" class=\"botonesEnvio\"></td>";
     TABLE += "<td rowspan=\"2\" ><img src=\"../images/spacer.gif\" width=\"26\" height=\"24\" border=\"0\"></td>";
     TABLE += "</TR>";
 
     TABLE += "</TABLE>";
     return TABLE;
   }
 
   public static String getTableA2()
   {
     IMG0 = "Img_a";
     IMG1 = "Img_a";
     IMG2 = "Img_a";
     IMG3 = "Img_a";
     IMG4 = "Img_a";
     IMG5 = "Img_a";
     IMG6 = "Img_a";
     IMG7 = "Img_a";
     IMG8 = "Img_a";
     IMG9 = "Img_a";
 
     TABLE = "<table border=\"0\" width=\"72px\" cellpadding=\"0\" cellspacing=\"0\">";
 
     TABLE += "<TR>";
 
     TABLE = TABLE + "<td valign=\"top\"><img name=\"" + 
       IMG0 + 
       "\" src=\"../images/" + 
       IMG0 + 
       ".gif\" width=\"26\" height=\"24\" border=\"0\"\" " + 
       "\" onMouseUp=\"JavaScript:anadirLetra ('" + 
       NUM0 + 
       "');\" onMouseOver=\"JavaScript:SHOWA ();\" onmouseout=\"JavaScript:SHOWN ();\"" + 
       "');\" class=\"botonesEnvio\"></td>";
 
     TABLE = TABLE + "<td valign=\"top\"><img name=\"" + 
       IMG1 + 
       "\" src=\"../images/" + 
       IMG1 + 
       ".gif\" width=\"26\" height=\"24\" border=\"0\"\" " + 
       "\" onMouseUp=\"JavaScript:anadirLetra ('" + 
       NUM1 + 
       "');\" onMouseOver=\"JavaScript:SHOWA ();\" onmouseout=\"JavaScript:SHOWN ();\"" + 
       "');\" class=\"botonesEnvio\"></td>";
 
     TABLE = TABLE + "<td valign=\"top\"><img name=\"" + 
       IMG2 + 
       "\" src=\"../images/" + 
       IMG2 + 
       ".gif\" width=\"26\" height=\"24\" border=\"0\"\" " + 
       "\" onMouseUp=\"JavaScript:anadirLetra ('" + 
       NUM2 + 
       "');\" onMouseOver=\"JavaScript:SHOWA ();\" onmouseout=\"JavaScript:SHOWN ();\"" + 
       "');\" class=\"botonesEnvio\"></td>";
     TABLE += "</TR>";
 
     TABLE += "<TR>";
 
     TABLE = TABLE + "<td valign=\"top\"><img name=\"" + 
       IMG3 + 
       "\" src=\"../images/" + 
       IMG3 + 
       ".gif\" width=\"26\" height=\"24\" border=\"0\"\" " + 
       "\" onMouseUp=\"JavaScript:anadirLetra ('" + 
       NUM3 + 
       "');\" onMouseOver=\"JavaScript:SHOWA ();\" onmouseout=\"JavaScript:SHOWN ();\"" + 
       "');\" class=\"botonesEnvio\"></td>";
 
     TABLE = TABLE + "<td valign=\"top\"><img name=\"" + 
       IMG4 + 
       "\" src=\"../images/" + 
       IMG4 + 
       ".gif\" width=\"26\" height=\"24\" border=\"0\"\" " + 
       "\" onMouseUp=\"JavaScript:anadirLetra ('" + 
       NUM4 + 
       "');\" onMouseOver=\"JavaScript:SHOWA ();\" onmouseout=\"JavaScript:SHOWN ();\"" + 
       "');\" class=\"botonesEnvio\"></td>";
 
     TABLE = TABLE + "<td valign=\"top\"><img name=\"" + 
       IMG5 + 
       "\" src=\"../images/" + 
       IMG5 + 
       ".gif\" width=\"26\" height=\"24\" border=\"0\"\" " + 
       "\" onMouseUp=\"JavaScript:anadirLetra ('" + 
       NUM5 + 
       "');\" onMouseOver=\"JavaScript:SHOWA ();\" onmouseout=\"JavaScript:SHOWN ();\"" + 
       "');\" class=\"botonesEnvio\"></td>";
     TABLE += "</TR>";
 
     TABLE += "<TR>";
 
     TABLE = TABLE + "<td valign=\"top\"><img name=\"" + 
       IMG6 + 
       "\" src=\"../images/" + 
       IMG6 + 
       ".gif\" width=\"26\" height=\"24\" border=\"0\"\" " + 
       "\" onMouseUp=\"JavaScript:anadirLetra ('" + 
       NUM6 + 
       "');\" onMouseOver=\"JavaScript:SHOWA ();\" onmouseout=\"JavaScript:SHOWN ();\"" + 
       "');\" class=\"botonesEnvio\"></td>";
 
     TABLE = TABLE + "<td valign=\"top\"><img name=\"" + 
       IMG7 + 
       "\" src=\"../images/" + 
       IMG7 + 
       ".gif\" width=\"26\" height=\"24\" border=\"0\"\" " + 
       "\" onMouseUp=\"JavaScript:anadirLetra ('" + 
       NUM7 + 
       "');\" onMouseOver=\"JavaScript:SHOWA ();\" onmouseout=\"JavaScript:SHOWN ();\"" + 
       "');\" class=\"botonesEnvio\"></td>";
 
     TABLE = TABLE + "<td valign=\"top\"><img name=\"" + 
       IMG8 + 
       "\" src=\"../images/" + 
       IMG8 + 
       ".gif\" width=\"26\" height=\"24\" border=\"0\"\" " + 
       "\" onMouseUp=\"JavaScript:anadirLetra ('" + 
       NUM8 + 
       "');\" onMouseOver=\"JavaScript:SHOWA ();\" onmouseout=\"JavaScript:SHOWN ();\"" + 
       "');\" class=\"botonesEnvio\"></td>";
     TABLE += "</TR>";
 
     TABLE += "<TR>";
     TABLE += "<td rowspan=\"2\" ><img src=\"../images/spacer.gif\" width=\"26\" height=\"24\" border=\"0\"></td>";
 
     TABLE = TABLE + "<td valign=\"top\"><img name=\"" + 
       IMG9 + 
       "\" src=\"../images/" + 
       IMG9 + 
       ".gif\" width=\"26\" height=\"24\" border=\"0\"\" " + 
       "\" onMouseUp=\"JavaScript:anadirLetra ('" + 
       NUM9 + 
       "');\" onMouseOver=\"JavaScript:SHOWA ();\" onmouseout=\"JavaScript:SHOWN ();\"" + 
       "');\" class=\"botonesEnvio\"></td>";
     TABLE += "<td rowspan=\"2\" ><img src=\"../images/spacer.gif\" width=\"26\" height=\"24\" border=\"0\"></td>";
     TABLE += "</TR>";
 
     TABLE += "</TABLE>";
     return TABLE;
   }
 
   public static final double roundDouble(double d, int places)
   {
     BigDecimal bd = new BigDecimal(d);
     double dx = bd.doubleValue();
     double ret = Math.round(dx * Math.pow(10.0D, places)) / Math.pow(10.0D, places);
     return ret;
   }
 
   public static final String formatNum(double d, String fmt) {
     DecimalFormat myFormatter = new DecimalFormat("###,###,###,##0.00");
     String output = myFormatter.format(d);
     return output;
   }
   public static final String formatNum(String s, String fmt) {
     double d = Double.valueOf(s).doubleValue();
     DecimalFormat myFormatter = new DecimalFormat("###,###,###,##0.00");
     String output = myFormatter.format(d);
     return output;
   }
   public static final String formatNumRate(String s) {
     double d = Double.valueOf(s).doubleValue();
     DecimalFormat myFormatter = new DecimalFormat("###,##0.000");
     String output = myFormatter.format(d);
     return output;
   }
   public static String getMonthSpell(String mm, String LNG) {
     String[] Monthes = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" };
     String[] Monthen = { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };
     String[] Monthpo = { "Janeiro", "Fevereiro", "Mar√ßo", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" };
     String[] Monthfr = { "Janvier", "F√©vrier", "Mars", "Avril", "Mai", "Juin", "Juillet", "Ao√ªt", "Septembre", "Octobre", "Novembre", "D√©cembre" };
 
     String result = "";
     int m = Integer.parseInt(mm);
 
     if (LNG.equals("e/"))
       result = Monthen[(m - 1)];
     else if (LNG.equals("s/"))
       result = Monthes[(m - 1)];
     else if (LNG.equals("p/"))
       result = Monthpo[(m - 1)];
     else if (LNG.equals("f/")) {
       result = Monthfr[(m - 1)];
     }
 
     return result;
   }
 
   public static String getMonthSpellShrt(String mm, String LNG) {
     String[] Monthes = { "Ene", "Feb", "Mar", "Abr", "May", "Jun", "Jul", "Ago", "Sep", "Oct", "Nov", "Dic" };
     String[] Monthen = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
     String[] Monthpo = { "Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez" };
     String[] Monthfr = { "Jan", "F√©v", "Mar", "Avr", "Mai", "Juin", "Juil", "Aou", "Sep", "Oct", "Nov", "D√©c" };
 
     String result = "";
     int m = Integer.parseInt(mm);
 
     if (LNG.equals("e/"))
       result = Monthen[(m - 1)];
     else if (LNG.equals("s/"))
       result = Monthes[(m - 1)];
     else if (LNG.equals("p/"))
       result = Monthpo[(m - 1)];
     else if (LNG.equals("f/")) {
       result = Monthfr[(m - 1)];
     }
 
     return result;
   }
 
   public static String getVALCHARS(String INTEXT) {
     String OUTTEXT = "";
     if (INTEXT != null) {
       for (int x = 0; x < INTEXT.length(); x++) {
         char nx = INTEXT.charAt(x);
         String RCHAR = String.valueOf(nx);
         if (((nx <= ')') || (nx >= ':')) && ((nx <= '?') || (nx >= '[')) && ((nx <= '`') || (nx >= '~')) && 
           (nx != ' ') && (nx != '!') && (nx != '$') && (nx != '^') && (nx != '_')) continue;
         OUTTEXT = OUTTEXT + RCHAR;
       }
     }
 
     return OUTTEXT;
   }
 
   public static boolean getValEnterChars(String INTEXT)
   {
     boolean OUTTEXT = false;
     if (INTEXT != null) {
       for (int x = 0; x < INTEXT.length(); x++) {
         char nx = INTEXT.charAt(x);
         String RCHAR = String.valueOf(nx);
 
         if (((nx < '0') || (nx > '9')) && ((nx < 'A') || (nx > 'Z')) && ((nx < 'a') || (nx > 'z')) && (nx != ' ')) {
           OUTTEXT = true;
         }
       }
     }
     return OUTTEXT;
   }
 
   public static String pad(Object str, int padlen, String pad)
   {
     String padding = new String();
     int len = 0;
     if (str != null) {
       len = Math.abs(padlen) - str.toString().length();
       if (len < 1)
         return str.toString().substring(0, Math.abs(padlen));
     } else {
       len = Math.abs(padlen);
     }
     for (int i = 0; i < len; i++)
       padding = padding + pad;
     String RetValue = str + padding;
     if (str == null) RetValue = padding;
     return RetValue;
   }
 
   public static String formatBalance(double balance, int len)
   {
     String ret = "";
     String sig = "+";
     if (balance < 0.0D) {
       sig = "-";
       balance *= -1.0D;
     }
     String txtformat = new String("0");
     for (int i = 0; i < len - 2; i++)
       txtformat = txtformat + "0";
     double Value = balance * 100.0D;
     NumberFormat formatter = new DecimalFormat(txtformat);
     ret = sig + formatter.format(Value);
     return ret;
   }
 
   public static String formatRate(BigDecimal balance, int len) {
     String ret = "";
     String txtformat = new String("0");
     for (int i = 0; i < len - 1; i++)
       txtformat = txtformat + "0";
     double Value = balance.doubleValue() * 1000000.0D;
     NumberFormat formatter = new DecimalFormat(txtformat);
     ret = formatter.format(Value);
     return ret;
   }
   public static String formatDateYYYYMMDD(String pdate) {
     String rdate = "00000000" + pdate;
     rdate = rdate.substring(rdate.length() - 8);
     String xdate = rdate.substring(6) + "-" + rdate.substring(4, 6) + "-" + rdate.substring(0, 4);
     return xdate;
   }
 
   public static boolean ValBNK(String CUENTA_DESTINO, String BANK_CODE)
   {
     boolean accok = true;
     int bankAcc = 0;
     int BankCode = Integer.parseInt(BANK_CODE.trim());
     if (CUENTA_DESTINO.trim().length() > 4) {
       bankAcc = Integer.parseInt(CUENTA_DESTINO.substring(0, 4));
     }
     if (bankAcc != BankCode) {
       accok = false;
     }
     return accok;
   }
 
  /* public static boolean ValACC(String CUENTA_DESTINO)
   {
     boolean accok = true;
     try {
       accnum = new BigDecimal(CUENTA_DESTINO);
     }
     catch (Exception ec)
     {
       BigDecimal accnum;
       accok = false;
     }
     if (CUENTA_DESTINO.length() != 20) {
       accok = false;
     }
     if (accok) {
       String BankOffice = CUENTA_DESTINO.substring(0, 8);
       int factor = 2;
       int residuo = 0;
 
       for (int i = BankOffice.length(); i > 0; i--) {
         residuo = Integer.parseInt(BankOffice.substring(i - 1, i)) * factor + residuo;
         if (factor == 7)
           factor = 2;
         else {
           factor++;
         }
       }
 
       residuo %= 11;
       residuo = 11 - residuo;
       int verificador = 0;
 
       switch (residuo) {
       case 10:
         verificador = 0;
         break;
       case 11:
         verificador = 1;
         break;
       default:
         if (residuo > 11) {
           residuo %= 11;
           verificador = residuo;
         } else {
           verificador = residuo;
         }
       }
 
       if (!String.valueOf(verificador).equals(CUENTA_DESTINO.substring(8, 9))) {
         accok = false;
       }
 
       if (accok) {
         String Office = CUENTA_DESTINO.substring(4, 8);
         String Account = CUENTA_DESTINO.substring(10, 20);
         String OfficeAccount = Office + Account;
 
         factor = 2;
         int residuo1 = 0;
 
         for (int i = OfficeAccount.length(); i > 0; i--) {
           residuo1 = Integer.parseInt(OfficeAccount.substring(i - 1, i)) * factor + residuo1;
           if (factor == 7)
             factor = 2;
           else {
             factor++;
           }
         }
 
         residuo1 %= 11;
         residuo1 = 11 - residuo1;
         int verificador1 = 0;
 
         switch (residuo1) {
         case 10:
           verificador1 = 0;
           break;
         case 11:
           verificador1 = 1;
           break;
         default:
           if (residuo1 > 11) {
             residuo1 %= 11;
             verificador1 = residuo1;
           } else {
             verificador1 = residuo1;
           }
         }
 
         if (!String.valueOf(verificador1).equals(CUENTA_DESTINO.substring(9, 10))) {
           accok = false;
         }
       }
     }
     return accok;
   }*/
 
  /* public static boolean ValID(String IDENT_BENEFI) {
     boolean beneok = true;
 
     String IDL = IDENT_BENEFI.substring(0, 1).toUpperCase();
     String IDL2 = IDENT_BENEFI.substring(1, IDENT_BENEFI.length());
     while (IDL2.length() < 9) {
       IDL2 = "0" + IDL2;
     }
     if ((!IDL.equals("V")) && (!IDL.equals("E")) && (!IDL.equals("J")) && (!IDL.equals("P")) && (!IDL.equals("G"))) {
       beneok = false;
     }
 
     String strTipo = "";
     if (IDL.equals("V"))
       strTipo = "1";
     else if (IDL.equals("E"))
       strTipo = "2";
     else if (IDL.equals("J"))
       strTipo = "3";
     else if (IDL.equals("P"))
       strTipo = "4";
     else
       strTipo = "5";
     try
     {
       idn = new BigDecimal(IDL2);
     }
     catch (Exception ec)
     {
       BigDecimal idn;
       beneok = false;
     }
     if ((beneok) && ((IDL.equals("J")) || (IDL.equals("G")))) {
       String strDC = strTipo + IDL2.substring(0, IDL2.length() - 1);
       int factor = 2;
       int suma = 0;
       for (int i = strDC.length(); i > 0; i--) {
         suma = Integer.parseInt(strDC.substring(i - 1, i)) * factor + suma;
         if (factor == 7)
           factor = 2;
         else {
           factor++;
         }
       }
       int DigControl = 11 - suma % 11;
       if ((DigControl >= 10) || (DigControl < 1)) {
         DigControl = 0;
       }
       if (!String.valueOf(DigControl).equals(IDENT_BENEFI.substring(IDENT_BENEFI.length() - 1, IDENT_BENEFI.length()))) {
         beneok = false;
       }
     }
     return beneok;
   }*/
 
   public static String replaceString(String TextIn, String TextReplace, String newText)
   {
     String newString = TextIn;
     int oldpos = 0;
     int newpos = 0;
     newpos = newString.indexOf(TextReplace, oldpos);
     while (newpos != -1) {
       String oldStr = newString;
       newString = newString.substring(oldpos, newpos);
       newString = newString + newText;
       oldpos = newpos + TextReplace.length();
       newString = newString + oldStr.substring(oldpos, oldStr.length());
       newpos = newString.indexOf(TextReplace, oldpos);
     }
     return newString;
   }
 
   /*public static boolean validCellPhone(String PhoneNum) {
     boolean ok = true;
     try {
       phone = new BigDecimal(PhoneNum.trim());
     }
     catch (Exception ec)
     {
       BigDecimal phone;
       ok = false;
     }
     if (PhoneNum.trim().length() != 11)
       ok = false;
     else {
       try {
         String Carrier = PhoneNum.substring(0, 4);
         if ((!Carrier.equals("0412")) && (!Carrier.equals("0414")) && (!Carrier.equals("0416")) && 
           (!Carrier.equals("0424")) && (!Carrier.equals("0426")))
           ok = false;
       }
       catch (Exception ex) {
         ok = false;
       }
     }
     return ok;
   }*/
 
   public static boolean validEmail(String emailAddress) {
     boolean ok = true;
     int atPos = emailAddress.indexOf("@");
     int dotPos = emailAddress.lastIndexOf(".");
     if (emailAddress.trim().length() < 6) ok = false;
     if (atPos < 2) ok = false;
     if ((dotPos < 0) || (dotPos < atPos)) ok = false;
     if (dotPos - atPos < 2) ok = false;
     if (emailAddress.trim().length() - dotPos < 2) ok = false;
     return ok;
   }
 
   public static String formatCCRNum(String Card) {
     String strCard = Card;
     try {
       strCard = Card.trim().substring(0, 4) + "-" + Card.trim().substring(4, 6) + "**-****-" + Card.trim().substring(Card.trim().length() - 4); } catch (Exception ex) {
       //System.out.println("Util.formatCCRNum Error " + ex);
     }return strCard;
   }
 
   public static String formatAccount(String Account)
   {
     String strAccount = Account;
     try {
       if (Account.length() > 15) {
         String p_parte = "XXXX";
         String s_parte = Account.substring(4, 8);
         String t_parte = "XX";
         String c_parte = "XXXXXX";
         String q_parte = Account.substring(16, Account.length());
         strAccount = p_parte + "-" + s_parte + "-" + t_parte + "-" + c_parte + q_parte;
       } else {
         strAccount = "****" + Account.substring(Account.length() - 4);
       }
     } catch (Exception ex) {
       //System.out.println("Util.formatAccount Error " + ex);
     }return strAccount;
   }
 
   public static String readFile(String file)
   {
     String data = "";
     String line = "";
     try {
       FileReader in = new FileReader(file);
       BufferedReader bf = new BufferedReader(in);
       while ((line = bf.readLine()) != null)
         data = data + line;
     }
     catch (Exception localException) {
     }
     return data;
   }
 
 /*  public static String[] getImagesRandom() {
     String word = "1234567890ABCDEFGHIJKLMNO";
     String[] values = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25" };
     String[] resp = new String[12];
     String newword = "";
 
     Random randGen = new Random();
     boolean[] letter = new boolean[word.length()];
     do {
       int rndnum = randGen.nextInt(word.length());
       if (letter[rndnum] == 0) {
         newword = newword + word.charAt(rndnum);
         letter[rndnum] = true;
       }
     }
     while (newword.length() < word.length());
 
     char[] arrword = newword.substring(0, 12).toCharArray();
     for (int xi = 0; xi < 12; xi++) {
       int xpos = word.indexOf(arrword[xi]);
       resp[xi] = values[xpos];
     }
     return resp;
   }*/
   
   
   /**
    * FunciÛn para retornar el N˙mero de TDC enmascarado, envÌo de correos, AW.
    * @param nroTDC
    * @return
    */
   
   public String enmascaraTDC(String nroTDC){
	   nroTDC=nroTDC.trim();
	   String numero;
	   if(!nroTDC.isEmpty()){
		   numero = nroTDC.substring(0,4)+"-XXXX-XXXX-"+ nroTDC.substring(12,16); 
		   return numero;
	   } else {
		   return "";
	   }
   }

   /**
    * FunciÛn para retornar el N˙mero de Cuenta enmascarado, envÌode correos, AW.
    * @param nroCuenta
    * @return
    */
   public String enmascaraCuenta(String nroCuenta){
	   nroCuenta=nroCuenta.trim();
		String numero;
		if(!nroCuenta.isEmpty()){
			numero =  nroCuenta.substring(0,4)+"******"+ nroCuenta.substring(16,20);
			return numero;
		} else {
			return "";
		}
	}
   
   
   public String completaCuenta(String nro_cuenta) throws WSException{
		
		if(nro_cuenta.length() != 10) return null;
		String numeroCuenta = null;
		Core core = new Core();
		
		EDL890101Bean reqCompleta = new EDL890101Bean();
		reqCompleta.setE01ACC010(nro_cuenta);

		EDL890101Response resCompleta = null;

		resCompleta = core.EDL890101(reqCompleta);
		numeroCuenta = resCompleta.getEDL890101().getE01ACC020();
		if(resCompleta.getError()!=null){
			resCompleta.setError(resCompleta.getError());
		}
		
		return numeroCuenta;
	}
   
 }//Fin de la Clase
