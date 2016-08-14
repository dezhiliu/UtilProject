package com.ldz.util;

/**
 * String tool class .
 * 
 * @author Jenkin
 */
public class StringUtil {

	/**
	 * if str value is null or blank return true . Otherwise return false .
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isNullOrBlank(String str) {
		if (str == null || str.equals("")) {
			return true;
		}
		return false;
	}

	/**
	 * turn str to uppercase . if str value is null , return null .
	 * 
	 * @param str
	 * @return
	 */
	public static String toUpperCase(String str) {
		if (str == null) {
			return null;
		}
		return str.toUpperCase();
	}

	/**
	 * turn str to lowercase . if str value is null , return null .
	 * 
	 * @param str
	 * @return
	 */
	public static String toLowerCase(String str) {
		if (str == null) {
			return null;
		}
		return str.toLowerCase();
	}
}
