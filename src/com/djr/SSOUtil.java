package com.djr;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

public class SSOUtil {
    public static final String USERNAME = "user";
    public static final String PASSWORD = "123";

    public static boolean checkLogin(String username,String password) {
        if(USERNAME.equals(username) && PASSWORD.equals(password)) {
            return true;
        }
        return false;
    }

    public static boolean checkCookie(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        if(cookies != null) {
            for(Cookie cookie : cookies) {
                if("ssocookie".equals(cookie.getName()) && "sso".equals(cookie.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }
}
