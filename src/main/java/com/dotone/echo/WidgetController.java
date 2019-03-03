package com.dotone.echo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.HashMap;

@RequestMapping("/")
@RestController
public class WidgetController {

    @Autowired

    private HttpServletRequest request;

    @RequestMapping(method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public Widget index() {

        /* Create HashMap from request headers */
        HashMap<String, String> requestHeaders = new HashMap<>();
        Enumeration<String> headerNames = request.getHeaderNames();
        while(headerNames.hasMoreElements()) {
            String headerName = headerNames.nextElement();
            requestHeaders.put(headerName, request.getHeader(headerName));
        }

        return new Widget(request.getHeader("x-forwarded-for"), requestHeaders);
    }
}