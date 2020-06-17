package com.niamh.conferencedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//if jar this class must extend SpringBootServletInitializer. provides web.xml file and context
public class ConferenceDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConferenceDemoApplication.class, args);
    }

}
