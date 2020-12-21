package com.amethikirana.AmethiKirana.User.Model;

import org.hibernate.annotations.GeneratorType;
import org.hibernate.annotations.ManyToAny;

import javax.persistence.*;

@Entity
public class userDtlsUpdtReq {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer updateId;
    private String updationDetails;
    private String sysCreationDate;
    @ManyToOne
    private userModel userModelId;

    public userDtlsUpdtReq() {
    }

    public userDtlsUpdtReq(String updationDetails, String sysCreationDate) {
        this.updationDetails = updationDetails;
        this.sysCreationDate = sysCreationDate;
    }

    public Integer getUpdateId() {
        return updateId;
    }

    public void setUpdateId(Integer updateId) {
        this.updateId = updateId;
    }

    public String getUpdationDetails() {
        return updationDetails;
    }

    public void setUpdationDetails(String updationDetails) {
        this.updationDetails = updationDetails;
    }

    public String getSysCreationDate() {
        return sysCreationDate;
    }

    public void setSysCreationDate(String sysCreationDate) {
        this.sysCreationDate = sysCreationDate;
    }

    public userModel getUserModelId() {
        return userModelId;
    }

    public void setUserModelId(userModel userModelId) {
        this.userModelId = userModelId;
    }
}
