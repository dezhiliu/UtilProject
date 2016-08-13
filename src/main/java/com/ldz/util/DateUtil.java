package com.ldz.util;

import java.util.Date;

/**
 * Date tool class .
 * 
 * @author Jenkin
 */
public class DateUtil {

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
}
