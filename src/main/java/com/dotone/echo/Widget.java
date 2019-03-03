package com.dotone.echo;

import java.util.HashMap;

public class Widget {

    private String ip;

    private HashMap headers;

    public Widget(String ip, HashMap headers) {
        this.ip = ip;
        this.headers = headers;
    }

    public String getIp() {
        return ip;
    }

    public HashMap getHeaders() {
        return headers;
    }
}