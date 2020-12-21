package com.amethikirana.AmethiKirana.User.Resource;

import com.amethikirana.AmethiKirana.User.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {
    @Autowired
    UserService userService;

    @GetMapping("/")
    public String home() {
        return("Welcome");
    }

    @GetMapping("/user")
    public String user() {
        return("User");
    }

    @GetMapping("/admin")
    public String admin() {
        return("Admin");
    }
}
