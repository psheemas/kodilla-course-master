package com.kodilla.good.patterns.challenges;

public class User {
    private String userName;
    private String userSurname;
    private String userMail;
    private String userPhoneNumber;
    private String userAddress;

    public User(String userName, String userSurname, String userMail, String userPhoneNumber, String userAddress) {
        this.userName = userName;
        this.userSurname = userSurname;
        this.userMail = userMail;
        this.userPhoneNumber = userPhoneNumber;
        this.userAddress = userAddress;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public String getUserMail() {
        return userMail;
    }

    public String getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public String getUserAddress() {
        return userAddress;
    }
}
