package com.hk.util;

public class Util {

	final static int[] sizeTable = { 9, 99, 999, 9999, 99999, 999999, 9999999,
			99999999, 999999999, Integer.MAX_VALUE };

	// 判断数字的位数
	public static int getNumberCount(Integer x) {
		for (int i = 0;; i++) {
			if (x <= sizeTable[i]) {
				return i + 1;
			}
		}
	}
}
