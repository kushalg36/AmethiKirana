package com.amethikirana.AmethiKirana.User.Service;

import com.amethikirana.AmethiKirana.Exception.AuthException;
import com.amethikirana.AmethiKirana.User.Model.userModel;
import com.amethikirana.AmethiKirana.User.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    public void addUser(userModel user) throws AuthException{
        if(user.getUserName().length() == 0 || user.getPassword().length() == 0 || user.getUserAddress().length() == 0 || user.getUserEmail().length() == 0 )
        {
            throw new AuthException("One or more required fields are null");
        }
        else if(user.getUserContact().length()!=10){
            throw new AuthException("Phone number is not equal to 10 digits");
        }
        else if(user.getAadharCard().length()!=12) {
            throw new AuthException("Aadhar Card is not equal to 12 digits");
        }
        String email = user.getUserEmail().toLowerCase();
        Integer countOfEmail = userRepository.countByUserEmail(email);
        if(countOfEmail > 0){
            throw new AuthException("Email Already exists");
        }
        String username = user.getUserName();
        Integer countOfUsername = userRepository.countByUserName(username);
        if(countOfUsername > 0) {
            throw new AuthException("Username already exist");
        }
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
    }

    public void updateUser(userModel user, Integer Id) throws AuthException {

        if(user.getUserName() == null || user.getPassword() == null || user.getUserAddress() == null || user.getUserEmail() == null )
        {
            throw new AuthException("One or more required fields are null");
        }
        if(user.getUserContact().length()!=10){
            throw new AuthException("Phone number is not equal to 10 digits");
        }
        else if(user.getAadharCard().length()!=12) {
            throw new AuthException("Aadhar Card is not equal to 12 digits");
        }
        String email = user.getUserEmail().toLowerCase();
        Integer countOfEmail = userRepository.countByUserEmail(email);
        if(countOfEmail > 1){
            throw new AuthException("Email Already exists");
        }
        String username = user.getUserName();
        Integer countOfUsername = userRepository.countByUserName(username);
        if(countOfUsername > 1) {
            throw new AuthException("Username already exist");
        }
        user.setUserId(Id);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setSysCreationDate(userRepository.findById(Id).get().getSysCreationDate());
        userRepository.save(user);
    }
}
