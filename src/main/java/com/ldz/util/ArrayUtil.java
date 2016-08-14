package com.ldz.util;

/**
 * Array tool class
 * 
 * @author Jenkin
 */
public class ArrayUtil {

	/**
	 * Returns the index of the first occurrence of the specified element in
	 * this array, or -1 if this array does not contain the element.
	 * 
	 * @param elementData
	 * @param o
	 * @return
	 */
	public static int indexOf(Object[] elementData, Object o) {
		int size = elementData.length;
		if (o == null) {
			for (int i = 0; i < size; i++)
				if (elementData[i] == null)
					return i;
		} else {
			for (int i = 0; i < size; i++)
				if (o.equals(elementData[i]))
					return i;
		}
		return -1;
	}
}
