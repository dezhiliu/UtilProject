package com.ldz.util;

/**
 * String tool class .
 * 
 * @author Administrator
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
}
