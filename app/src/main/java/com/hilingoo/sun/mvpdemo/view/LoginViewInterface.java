package com.hilingoo.sun.mvpdemo.view;

/**
 * Author: Diligent.S
 * Time: 2016/9/20 13:29.
 */
public interface LoginViewInterface {

    String getUserName();
    String getPassWord();
    void showProgress();
    void dismissProgress();
    void showLoginFail(String error);
    void goToActivity();
}
