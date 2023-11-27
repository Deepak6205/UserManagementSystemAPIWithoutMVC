package com.example.UserManagementSystem;

public class UserEntity {
    private Integer userId;
    private String userName;
    private String userAddress;
    private String userNumber;

    public UserEntity(Integer userId, String userName, String userAddress,String userNumber){
        this.userId=userId;
        this.userName=userName;
        this.userAddress=userAddress;
        this.userNumber=userNumber;
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

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber;
    }
}
