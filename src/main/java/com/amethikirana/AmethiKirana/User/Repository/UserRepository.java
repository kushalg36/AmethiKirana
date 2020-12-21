package com.amethikirana.AmethiKirana.User.Repository;

import com.amethikirana.AmethiKirana.User.Model.userModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<userModel, Integer> {
    Optional<userModel> findByUserName(String userName);
}