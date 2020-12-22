package com.amethikirana.AmethiKirana.User.Resource;

import com.amethikirana.AmethiKirana.User.Model.userModel;
import com.amethikirana.AmethiKirana.User.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserResource {
    @Autowired
    UserService userService;

    @GetMapping("/")
    public String home() {
        return("Welcome");
    }

    @GetMapping("/signup")
    public String signUpForm() {
        return("SignUpForm");
    }

    @PostMapping("/signup")
    public void signUp(@RequestBody userModel user) {
        userService.addUser(user);
    }

    @GetMapping("/update/{id}")
    public String updateForm() {
        return("UpdateForm");
    }

    @PutMapping("/update/{id}")
    public void updateDetails(@RequestBody userModel user, @PathVariable("id") Integer Id) {
        userService.updateUser(user, Id);
    }

}
