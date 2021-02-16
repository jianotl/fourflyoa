package com.org.fourfly.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.zip.CRC32;

public class HashUtil {
	static char[] hexDigits = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
			'A', 'B', 'C', 'D', 'E', 'F' };

	/**
	 * 计算MD5值
	 * @param bytes
	 * @return
	 */
	public static String calcMd5(byte[] bytes) {
		try {
			MessageDigest md5 = MessageDigest.getInstance("MD5");
			md5.update(bytes);
			byte[] md5Array = md5.digest();
			return bytesToHex(md5Array);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return "";
	}

	/**
	 * 计算CRC32值
	 * @param bytes
	 * @return
	 */
	public static String calcCrc32(byte[] bytes) {
		CRC32 crc32 = new CRC32();
		crc32.update(bytes);
		long crc32Value = crc32.getValue();
		return int32ToHex((int)crc32Value);
	}

	// 通过位运算 将字节数组到十六进制的转换
	public static String bytesToHex(byte[] byteArray) {
		char[] resultCharArray = new char[byteArray.length * 2];
		int index = 0;
		for (byte b : byteArray) {
			resultCharArray[index++] = hexDigits[b >>> 4 & 0xf];
			resultCharArray[index++] = hexDigits[b & 0xf];
		}
		return new String(resultCharArray);
	}

	// 通过位运算 将字节数组到十六进制的转换
	public static String int32ToHex(int value) {
		char resultCharArray[] = {'0','0','0','0','0','0','0','0'};
		int index = resultCharArray.length - 1;
		while (value != 0 && index >= 0) {
			resultCharArray[index] = hexDigits[value & 0xf];
			//
			value = value >>> 4;
			index--;
		}
		return new String(resultCharArray);
	}
}
