package org.ming.spring.cloud.service;

import org.ming.model.User;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class UserServiceApplication {

    @RequestMapping("/")
    String hello() {
        return "Hello, This is User Service latest version: 1.5";
    }





    public static void main(String[] args) {
        new SpringApplicationBuilder(UserServiceApplication.class).web(true).run(args);
    }


}
