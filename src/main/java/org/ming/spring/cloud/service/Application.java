package org.ming.spring.cloud.service;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class Application {

    @RequestMapping("/")
    String hello() {
        return "Hello, This is User Service latest version: 1.5";
    }


    @PostConstruct
    void started() {
        TimeZone.setDefault(TimeZone.getTimeZone("Asia/Shanghai"));
    }

    public static void main(String[] args) {
        TimeZone.setDefault(TimeZone.getTimeZone("Asia/Shanghai"));
        new SpringApplicationBuilder(Application.class).web(true).run(args);
    }


}
