package com.ldz.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Date tool class .
 * 
 * @author Jenkin
 */
public class DateUtil {

	public static final String DEFAULT_FORMAT = "yyyy-MM-dd HH:mm:ss:SSSZ";

	/**
	 * turn millisecond timeStamp to Date Object
	 * 
	 * @param millisecond
	 * @return
	 */
	public static Date timestamp2Date(long millisecond) {
		return new Date(millisecond);
	}

	/**
	 * turn Date Object to millisecond timeStamp
	 * 
	 * @param date
	 * @return
	 */
	public static long date2Timestamp(Date date) {
		return date.getTime();
	}

	/**
	 * turn Date Object to String use regular format use default regular
	 * yyyy-MM-dd HH:mm:ss:SSSZ
	 * 
	 * @param date
	 * @param format
	 * @return
	 */
	public static String date2String(Date date) {
		return date2String(date, DEFAULT_FORMAT);
	}

	/**
	 * turn Date Object to String use regular format
	 * 
	 * @param date
	 * @param format
	 * @return
	 */
	public static String date2String(Date date, String format) {
		DateFormat df = new SimpleDateFormat(format);
		return df.format(date);
	}

	/**
	 * turn String to Date Object use regular format use default regular
	 * yyyy-MM-dd HH:mm:ss:SSSZ
	 * 
	 * @param date
	 * @param format
	 * @return
	 * @throws ParseException
	 */
	public static Date string2Date(String date) throws ParseException {
		return string2Date(date, DEFAULT_FORMAT);
	}

	/**
	 * turn String to Date Object use regular format
	 * 
	 * @param date
	 * @param format
	 * @return
	 * @throws ParseException
	 */
	public static Date string2Date(String date, String format)
			throws ParseException {
		DateFormat df = new SimpleDateFormat(format);
		return df.parse(date);
	}

	/**
	 * turn millisecond timeStamp to String use default regular yyyy-MM-dd
	 * HH:mm:ss:SSSZ
	 * 
	 * @param millisecond
	 * @param format
	 * @return
	 */
	public static String timestamp2String(long millisecond) {
		return timestamp2String(millisecond, DEFAULT_FORMAT);
	}

	/**
	 * turn millisecond timeStamp to String
	 * 
	 * @param millisecond
	 * @param format
	 * @return
	 */
	public static String timestamp2String(long millisecond, String format) {
		DateFormat df = new SimpleDateFormat(format);
		return df.format(new Date(millisecond));
	}

	/**
	 * turn String to millisecond timeStamp use default regular yyyy-MM-dd
	 * HH:mm:ss:SSSZ
	 * 
	 * @param date
	 * @param format
	 * @return
	 * @throws ParseException
	 */
	public static long string2Timestamp(String date) throws ParseException {
		return string2Timestamp(date, DEFAULT_FORMAT);
	}

	/**
	 * turn String to millisecond timeStamp
	 * 
	 * @param date
	 * @param format
	 * @return
	 * @throws ParseException
	 */
	public static long string2Timestamp(String date, String format)
			throws ParseException {
		DateFormat df = new SimpleDateFormat(format);
		return df.parse(date).getTime();
	}

	/**
	 * compute reduction sub minuend
	 * 
	 * @param reduction
	 * @param minuend
	 * @return
	 * @throws ParseException
	 */
	public static long sub(String reduction, String minuend)
			throws ParseException {
		return sub(reduction, minuend, DEFAULT_FORMAT);
	}

	/**
	 * compute reduction sub minuend
	 * 
	 * @param reduction
	 * @param minuend
	 * @return
	 * @throws ParseException
	 */
	public static long sub(String reduction, String minuend, String format)
			throws ParseException {
		return string2Timestamp(reduction, format)
				- string2Timestamp(minuend, format);
	}

	/**
	 * compute reduction sub minuend
	 * 
	 * @param reduction
	 * @param minuend
	 * @return
	 */
	public static long sub(Date reduction, Date minuend) {
		return date2Timestamp(reduction) - date2Timestamp(minuend);
	}

	/**
	 * compute reduction sub minuend
	 * 
	 * @param reduction
	 * @param minuend
	 * @return
	 */
	public static long sub(long reduction, long minuend) {
		return reduction - minuend;
	}

	/**
	 * compute addend add augend
	 * 
	 * @param reduction
	 * @param minuend
	 * @return
	 * @throws ParseException
	 */
	public static long add(String addend, String augend) throws ParseException {
		return add(addend, augend, DEFAULT_FORMAT);
	}

	/**
	 * compute addend add augend
	 * 
	 * @param reduction
	 * @param minuend
	 * @return
	 * @throws ParseException
	 */
	public static long add(String addend, String augend, String format)
			throws ParseException {
		return string2Timestamp(addend, format)
				+ string2Timestamp(augend, format);
	}

	/**
	 * compute addend add augend
	 * 
	 * @param reduction
	 * @param minuend
	 * @return
	 */
	public static long add(Date addend, Date augend) {
		return date2Timestamp(addend) + date2Timestamp(augend);
	}

	/**
	 * compute addend add augend
	 * 
	 * @param reduction
	 * @param minuend
	 * @return
	 */
	public static long add(long addend, long augend) {
		return addend + augend;
	}

	/**
	 * compare dateOne and dateTwo , if dateOne small , return true , else
	 * return false .
	 * 
	 * @param dateOne
	 * @param dateTwo
	 * @return
	 * @throws ParseException
	 */
	public static boolean before(String dateOne, String dateTwo)
			throws ParseException {
		return before(dateOne, dateTwo, DEFAULT_FORMAT);
	}

	/**
	 * compare dateOne and dateTwo , if dateOne small , return true , else
	 * return false .
	 * 
	 * @param dateOne
	 * @param dateTwo
	 * @return
	 * @throws ParseException
	 */
	public static boolean before(String dateOne, String dateTwo, String format)
			throws ParseException {
		if (string2Timestamp(dateOne, format) < string2Timestamp(dateTwo,
				format)) {
			return true;
		}
		return false;
	}

	/**
	 * compare dateOne and dateTwo , if dateOne bigger , return true , else
	 * return false .
	 * 
	 * @param dateOne
	 * @param dateTwo
	 * @return
	 * @throws ParseException
	 */
	public static boolean after(String dateOne, String dateTwo)
			throws ParseException {
		return after(dateOne, dateTwo, DEFAULT_FORMAT);
	}

	/**
	 * compare dateOne and dateTwo , if dateOne bigger , return true , else
	 * return false .
	 * 
	 * @param dateOne
	 * @param dateTwo
	 * @return
	 * @throws ParseException
	 */
	public static boolean after(String dateOne, String dateTwo, String format)
			throws ParseException {
		if (string2Timestamp(dateOne, format) > string2Timestamp(dateTwo,
				format)) {
			return true;
		}
		return false;
	}

	/**
	 * compare dateOne and dateTwo , if they are equals , return true , else
	 * return false .
	 * 
	 * @param dateOne
	 * @param dateTwo
	 * @return
	 * @throws ParseException
	 */
	public static boolean equal(String dateOne, String dateTwo)
			throws ParseException {
		return equal(dateOne, dateTwo, DEFAULT_FORMAT);
	}

	/**
	 * compare dateOne and dateTwo , if they are equals , return true , else
	 * return false .
	 * 
	 * @param dateOne
	 * @param dateTwo
	 * @return
	 * @throws ParseException
	 */
	public static boolean equal(String dateOne, String dateTwo, String format)
			throws ParseException {
		if (string2Timestamp(dateOne, format) == string2Timestamp(dateTwo,
				format)) {
			return true;
		}
		return false;
	}
}
