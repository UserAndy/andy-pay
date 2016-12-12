package org.andy.pay.common.utils;

import java.security.MessageDigest;
import java.util.Arrays;

/**
 * 加密工具类
 * @author Andy
 *
 */
public class EncryptUtils {
	
	/**
	 * MD5加密  32位加密
	 * @param str	待加密的字符串
	 * @return		加密后的字符串  32位小写加密后的数据
	 */
	public static String EncryptMD5(String str){
		StringBuffer buffer = new StringBuffer();
		try {
			MessageDigest digest = MessageDigest.getInstance("MD5");
			/// 添加要进行计算摘要的信息,使用 plainText 的 byte 数组更新摘要。
			digest.update(str.getBytes("utf-8"));
			//计算出摘要
			byte array[] = digest.digest();
			int i;
			for (int offset = 0; offset < array.length; offset++) {
				i = array[offset];
				if (i < 0) {
					i += 256;
				}
				if (i < 16) {
					buffer.append("0");
				}
				// 将整型 十进制 i 转换为16位，用十六进制参数表示的无符号整数值的字符串表示形式。
				buffer.append(Integer.toHexString(i));
			}
			//32位加密
			str = buffer.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		//16位加密
		//str = buffer.toString().md5Strstring(8,24);;
		//计算出
		return str;
	}
	
	/**
	 * 字符串通过SHA1加密
	 * @param result	   待加密的字符串
	 * @return			 加密后的字符串
	 */
	public static String EncryptSHA1(String result){
		String digest = new SHA1().getDigestOfString(result.getBytes()).toLowerCase();
		return digest;
	}


	/**
	 * base　64位　加密
	 * @param b
	 * @return
	 */
	public static String base64Encode(byte b[]) {
		int code = 0;
		StringBuffer sb = new StringBuffer((b.length - 1) / 3 << 6);
		for (int i = 0; i < b.length; i++) {
			code |= b[i] << 16 - (i % 3) * 8 & 255 << 16 - (i % 3) * 8;
			if (i % 3 == 2 || i == b.length - 1) {
				sb.append(Base64Code[(code & 0xfc0000) >>> 18]);
				sb.append(Base64Code[(code & 0x3f000) >>> 12]);
				sb.append(Base64Code[(code & 0xfc0) >>> 6]);
				sb.append(Base64Code[code & 0x3f]);
				code = 0;
			}
		}

		if (b.length % 3 > 0)
			sb.setCharAt(sb.length() - 1, '=');
		if (b.length % 3 == 1)
			sb.setCharAt(sb.length() - 2, '=');
		return sb.toString();
	}

	/**
	 * 解码　　base 64位解密
	 * @param code
	 * @return
	 */
	public static byte[] base64Decode(String code) {
		if (code == null)
			return null;
		int len = code.length();
		if (len % 4 != 0)
			throw new IllegalArgumentException(
					"Base64 string length must be 4*n");
		if (code.length() == 0)
			return new byte[0];
		int pad = 0;
		if (code.charAt(len - 1) == '=')
			pad++;
		if (code.charAt(len - 2) == '=')
			pad++;
		int retLen = (len / 4) * 3 - pad;
		byte ret[] = new byte[retLen];
		for (int i = 0; i < len; i += 4) {
			int j = (i / 4) * 3;
			char ch1 = code.charAt(i);
			char ch2 = code.charAt(i + 1);
			char ch3 = code.charAt(i + 2);
			char ch4 = code.charAt(i + 3);
			int tmp = Base64Decode[ch1] << 18 | Base64Decode[ch2] << 12
					| Base64Decode[ch3] << 6 | Base64Decode[ch4];
			ret[j] = (byte) ((tmp & 0xff0000) >> 16);
			if (i < len - 4) {
				ret[j + 1] = (byte) ((tmp & 0xff00) >> 8);
				ret[j + 2] = (byte) (tmp & 0xff);
				continue;
			}
			if (j + 1 < retLen)
				ret[j + 1] = (byte) ((tmp & 0xff00) >> 8);
			if (j + 2 < retLen)
				ret[j + 2] = (byte) (tmp & 0xff);
		}
		return ret;
	}

	private static char Base64Code[] = { 'A', 'B', 'C', 'D', 'E', 'F', 'G',
			'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
			'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g',
			'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
			'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6',
			'7', '8', '9', '+', '/' };

	private static byte Base64Decode[] = { -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			62, -1, 63, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1,
			-1, 0, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13,
			14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1,
			-1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41,
			42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1 };


}
