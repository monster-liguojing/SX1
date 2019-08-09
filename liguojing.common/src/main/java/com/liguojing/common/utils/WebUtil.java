package com.liguojing.common.utils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

public class WebUtil {
	public static String getString(HttpServletRequest request,String defaultValue){
	String requestURL = "localhost:8080/list?name=zhangsan";
	String result = requestURL.substring(requestURL.lastIndexOf("="+1));
	if(result instanceof String){
		return result;
	}
		return defaultValue;
		
	}
	public int getInt(HttpServletRequest request,String name,int defaultValue){
	String requestURL = "localhost:8080/list?ahe=100";
	String result = requestURL.substring(requestURL.lastIndexOf("=")+1);
	Integer parseInt = Integer.parseInt(result);
	if (requestURL.indexOf(name)== -1 || !(parseInt instanceof Integer)) {
		return defaultValue;
	}
		return 0;
		
	}
	//方法4：获取当前请求地址，注意参数不能丢 
	public String getUrl(HttpServletRequest request){
	    //实现代码
		return request.getRequestURI();
	}
	
	//方法5：给定一个Cookie名获得取Cookie值 
	public String getCookieValue(Cookie cookie){
	    //实现代码
		return cookie.getValue();
	}
}
