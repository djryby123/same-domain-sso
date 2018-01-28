package com.djr;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;

public class Demo1Action extends ActionSupport {
    private String gotoUrl;

    public String main() {
        HttpServletRequest request = ServletActionContext.getRequest();
        if(SSOUtil.checkCookie(request)) {
            return SUCCESS;
        }
        gotoUrl = "/demo1/main.action";
        return LOGIN;
    }

    public String getGotoUrl() {
        return gotoUrl;
    }

    public void setGotoUrl(String gotoUrl) {
        this.gotoUrl = gotoUrl;
    }
}
