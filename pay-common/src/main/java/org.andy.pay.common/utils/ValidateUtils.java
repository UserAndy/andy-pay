package org.andy.pay.common.utils;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 校验工具类
 */
public class ValidateUtils {

	/**
     * 校验是否合法电子邮箱
     * @param email
     * @return  true 为合法邮箱    false 为非合法邮箱
     */
	public static boolean isEmail(String email) {
		String check = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
		Pattern regex = Pattern.compile(check);
		Matcher matcher = regex.matcher(email);
		return matcher.matches();
	}
	
	/**
	 * 校验是否合法用户名（中文、英文、数字、下划线）
	 * @param userName
	 * @param minLength
	 * @param maxLength
	 * @return
	 */
    public static boolean isLegalUserName(String userName,int minLength,int maxLength) {
        String check = "^[a-zA-Z0-9_\\u4E00-\\u9FA5\\uF900-\\uFA2D]{"+minLength+","+maxLength+"}$";
        Pattern regex = Pattern.compile(check);
        Matcher matcher = regex.matcher(userName);
        return matcher.matches();
    }


    
}
