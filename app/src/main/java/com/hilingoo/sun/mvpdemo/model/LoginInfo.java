package com.hilingoo.sun.mvpdemo.model;

/**
 * Author: Diligent.S
 * Time: 2016/9/20 13:27.
 */
public class LoginInfo {
    private String userName;
    private String passWord;

    public LoginInfo() {
    }

    public LoginInfo(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
