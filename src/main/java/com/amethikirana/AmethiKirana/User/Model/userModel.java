package com.amethikirana.AmethiKirana.User.Model;


import javax.persistence.*;

@Entity
public class userModel {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer userId;
    private String userName;
    private String userEmail;
    private String Password;
    private String userContact;
    private String userAddress;
    private String sysCreationDate;
    private String sysUpdationDate;
    private String aadharCard;
    private boolean isUserActive;
    private String userAuthority;

    public userModel() {

    }

    public userModel(String userName, String userEmail, String password, String userContact, String userAddress, String sysCreationDate, String sysUpdationDate, String aadharCard, boolean isUserActive, String userAuthority) {
        this.userName = userName;
        this.userEmail = userEmail;
        this.Password = password;
        this.userContact = userContact;
        this.userAddress = userAddress;
        this.sysCreationDate = sysCreationDate;
        this.sysUpdationDate = sysUpdationDate;
        this.aadharCard = aadharCard;
        this.isUserActive = isUserActive;
        this.userAuthority = userAuthority;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getUserContact() {
        return userContact;
    }

    public void setUserContact(String userContact) {
        this.userContact = userContact;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getSysCreationDate() {
        return sysCreationDate;
    }

    public void setSysCreationDate(String sysCreationDate) {
        this.sysCreationDate = sysCreationDate;
    }

    public String getSysUpdationDate() {
        return sysUpdationDate;
    }

    public void setSysUpdationDate(String sysUpdationDate) {
        this.sysUpdationDate = sysUpdationDate;
    }

    public String getAadharCard() {
        return aadharCard;
    }

    public void setAadharCard(String aadharCard) {
        this.aadharCard = aadharCard;
    }

    public boolean getIsUserActive() {
        return isUserActive;
    }

    public void setIsUserActive(boolean isUserActive) {
        this.isUserActive = isUserActive;
    }

    public String getUserAuthority() {
        return userAuthority;
    }

    public void setUserAuthority(String userAuthority) {
        this.userAuthority = userAuthority;
    }
}
