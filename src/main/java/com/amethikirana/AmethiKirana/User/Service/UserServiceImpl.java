package com.amethikirana.AmethiKirana.User.Service;

import com.amethikirana.AmethiKirana.User.Model.userModel;
import com.amethikirana.AmethiKirana.User.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Autowired
    PasswordEncoder passwordEncooder;

    public void addUser(userModel user){
        user.setPassword(passwordEncooder.encode(user.getPassword()));
        userRepository.save(user);
    }

    public void updateUser(userModel user, Integer Id) {
        user.setUserId(Id);
        userRepository.save(user);
    }
}
