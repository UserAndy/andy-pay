package org.andy.pay.filter;

import org.andy.pay.contants.UserContant;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.logging.Logger;

/**
 * @description:  登录过滤器,防止用户未登录时的操作
 * @author: Andy
 * @date: 2017-03-01
 * @blog: www.andyqian.com
 */
public class LoginFilter implements Filter{

    private Logger logger = Logger.getLogger(LoginFilter.class.getName());

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest)servletRequest;
        HttpServletResponse response = (HttpServletResponse)servletResponse;
        HttpSession session = request.getSession();
        System.out.println("session  doFilter------>"+session.getId());
        if(!validateUrl(request)) {                            //符合过滤列表,则不过滤
            filterChain.doFilter(request, response);
        }else{
            Object object = session.getAttribute(UserContant.SESSION_USER);			//判断用户session 是否存在
            if(object==null){				//session 不存在
                response.sendRedirect("user/login");
            }else{                                      //表示已登录
                filterChain.doFilter(request, response);
            }
        }
    }

    @Override
    public void destroy() {

    }

    /**
     * 验证url
     * @param request
     * @return  false 表示存在符合选项      true 表示不符合选项
     */
    private boolean validateUrl(HttpServletRequest request){
        //不过滤的url 列表 (该方法待改进)
        String[] arrays = {"login","register","index",".js",".css",".jpg",".png"};
        //
        String uri = request.getRequestURI();		//请求的url地址 (项目路径,不包括协议以及端口)
        boolean flag = true;
        for(String item:arrays){
            if(uri.indexOf(item)!=-1){
                flag = false;
                break;
            }
        }
        return flag;
    }


    /**
     * 没有登录时跳转的页面
     * @param request
     * @return
     */
    private String redirectPath(HttpServletRequest request){
        String path = request.getContextPath();
        String basePath = request.getScheme()+ "://" +request.getServerName()+ ":"+request.getServerPort()+path+ "/user/login" ;
        return basePath;
    }
}
