package com.emr.springmvcbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages = "com.emr.springmvcbootdemo")
public class SpringMvcBootDemoApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringMvcBootDemoApplication.class);
    }


    public static void main(String[] args) {
        SpringApplication.run(SpringMvcBootDemoApplication.class, args);
    }

}
