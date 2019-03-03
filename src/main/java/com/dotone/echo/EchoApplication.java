package com.dotone.echo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class EchoApplication {

    public static void main(String[] args) {

        SpringApplication.run(EchoApplication.class, args);
    }

}