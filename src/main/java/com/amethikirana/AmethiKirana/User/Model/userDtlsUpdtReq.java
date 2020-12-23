package com.amethikirana.AmethiKirana.User.Model;

import javax.persistence.*;

@Entity
public class userDtlsUpdtReq {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer updateId;
    private String updateDetails;
    private String sysCreationDate;
    @ManyToOne
    private userModel userModelId;

    public userDtlsUpdtReq() {
    }

    public userDtlsUpdtReq(String updateDetails, String sysCreationDate) {
        this.updateDetails = updateDetails;
        this.sysCreationDate = sysCreationDate;
    }

    public Integer getUpdateId() {
        return updateId;
    }

    public void setUpdateId(Integer updateId) {
        this.updateId = updateId;
    }

    public String getUpdateDetails() {
        return updateDetails;
    }

    public void setUpdateDetails(String updateDetails) {
        this.updateDetails = updateDetails;
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
