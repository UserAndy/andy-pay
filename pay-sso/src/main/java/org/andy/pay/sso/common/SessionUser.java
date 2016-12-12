package org.andy.pay.sso.common;

import org.andy.pay.sso.shiro.ShiroUser;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;




/**
 * 当前登录用户信息,可以在bean中调用获取当前登录用户信息,例如 SessionUser.getUserId()获取当前登录人的userId
 */
public class SessionUser {


	public SessionUser() {
	}

	/**
	 * 获取用户
	 * @return
	 */
	public static ShiroUser getShiroUser() {
		Subject user = SecurityUtils.getSubject();
		if(user==null){
			return null;
		}
		ShiroUser shiroUser = (ShiroUser) user.getPrincipal();
		if(shiroUser==null){
			return null;
		}
		return shiroUser;
	}
	

	/**
	 * 获取用户id
	 * @return
	 */
	public static  String getUserId() {
		ShiroUser shiroUser=getShiroUser();
		if(shiroUser==null){
			return null;
		}
		return shiroUser.getId();
	}

	/**
	 * 获取用户名
	 * @return
	 */
	public static String getUserName() {
		ShiroUser shiroUser=getShiroUser();
		if(shiroUser==null){
			return null;
		}
		return shiroUser.getName();
	}

	/**
	 * 获取电子邮箱
	 * @return
	 */
	public static String getEmail() {
		ShiroUser shiroUser=getShiroUser();
		if(shiroUser==null){
			return null;
		}
		return shiroUser.getEmail();
	}

}
