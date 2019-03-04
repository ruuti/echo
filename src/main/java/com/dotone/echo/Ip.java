package com.dotone.echo;

import javax.servlet.http.HttpServletRequest;

public class Ip {

    private HttpServletRequest request;

    public Ip(HttpServletRequest request) {
        this.request = request;
    }

    public String getIp() {
        String ipAddress = request.getHeader("x-forwarded-for");
        if (ipAddress == null) {
            ipAddress = request.getRemoteAddr();
        }
        return ipAddress;
    }

}