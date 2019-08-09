package com.liguojing.common.utils;

public class StringUtil {
	public boolean hasLength(String src){
		if (!src.equals("")&& src!=null) {
			return false;
		}
		return true;
	}
	
	public boolean hasText(String src) {
		if (!src.equals(" ")&& src!=null && !src.equals("")) {
			return false;
		}
		return true;
		
	}
	public boolean isMobile(String src){
		String regex ="^1([38]\\d|5[0-35-9]|7[3678])\\d{8}$";
		return src.matches(regex);
		
	}
	public boolean isEmail(String src){
		String regex ="^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$";
		return src.matches(regex);
	}
	public String reverse(String src){
		return new StringBuffer(src).reverse().toString();
		
	}
}
