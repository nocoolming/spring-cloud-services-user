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
        return "Hello, This is Service User";
    }

    @RequestMapping("users")
    List<User> users() {
        List<User> users = new ArrayList<>();

        users.add(new User("liming", "伯通 "));
        users.add(new User("huangrong", "黄容"));

        return users;
    }

    public static void main(String[] args) {
        new SpringApplicationBuilder(UserServiceApplication.class).web(true).run(args);
    }


}
