package com.dotone.echo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RequestMapping(method = RequestMethod.GET)
@RestController
public class IpController {

    @Autowired

    private HttpServletRequest request;

    @RequestMapping(value="/ip.json", produces = { MediaType.APPLICATION_JSON_VALUE})
    public Ip indexJson() {
        return new Ip(request);
    }

    @RequestMapping(value="/ip", produces = { MediaType.TEXT_PLAIN_VALUE})
    public String indexPlain(){
        return new Ip(request).getIp();
    }
}