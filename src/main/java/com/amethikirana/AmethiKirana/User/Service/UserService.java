package com.amethikirana.AmethiKirana.User.Service;

import com.amethikirana.AmethiKirana.User.Model.userModel;

public interface UserService {

    public void addUser(userModel user);

    public void updateUser(userModel user, Integer Id);

}
