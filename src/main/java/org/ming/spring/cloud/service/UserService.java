package org.ming.spring.cloud.service;

import org.ming.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserService {
    @RequestMapping("all")
    List<User> all() {
        List<User> users = new ArrayList<>();

        users.add(new User("liming", "伯通 "));
        users.add(new User("huangrong", "黄容"));

        return users;
    }

    @RequestMapping("users")
    List<User> users() {
        List<User> users = new ArrayList<>();

        users.add(new User("liming", "伯通 "));
        users.add(new User("huangrong", "黄容"));

        return users;
    }

    @RequestMapping(value = "create", method = RequestMethod.POST)
    User create(@RequestBody User user) {
        return user;
    }
}
