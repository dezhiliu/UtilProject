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
	public static long Date2Timestamp(Date date) {
		return date.getTime();
	}

	/**
	 * turn Date Object to String use regular format
	 * 
	 * @param date
	 * @param format
	 * @return
	 */
	public static String Date2String(Date date) {
		return Date2String(date, DEFAULT_FORMAT);
	}

	/**
	 * turn Date Object to String use regular format
	 * 
	 * @param date
	 * @param format
	 * @return
	 */
	public static String Date2String(Date date, String format) {
		DateFormat simformat = new SimpleDateFormat(format);
		return simformat.format(date);
	}

	/**
	 * turn String to Date Object use regular format
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
		DateFormat simformat = new SimpleDateFormat(format);
		return simformat.parse(date);
	}
}
