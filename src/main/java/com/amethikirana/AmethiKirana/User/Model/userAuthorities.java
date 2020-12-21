package com.amethikirana.AmethiKirana.User.Model;

import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

@Entity
public class userAuthorities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    private String userAuthority;
    @OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private userModel userModelId;

    public userAuthorities() {
    }

    public userAuthorities(Integer id, String userAuthority) {
        Id = id;
        this.userAuthority = userAuthority;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getUserAuthority() {
        return userAuthority;
    }

    public void setUserAuthority(String userAuthority) {
        this.userAuthority = userAuthority;
    }

    public userModel getUserModelId() {
        return userModelId;
    }

    public void setUserModelId(userModel userModelId) {
        this.userModelId = userModelId;
    }
}
