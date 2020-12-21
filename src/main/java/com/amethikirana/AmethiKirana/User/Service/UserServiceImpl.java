package com.amethikirana.AmethiKirana.User.Service;

import com.amethikirana.AmethiKirana.User.Model.userDtlsUpdtReq;
import com.amethikirana.AmethiKirana.User.Model.userModel;
import com.amethikirana.AmethiKirana.User.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

}
