package com.hilingoo.sun.mvpdemo.model;

import com.hilingoo.sun.mvpdemo.presenter.LoginPresenter;

/**
 * Author: Diligent.S
 * Time: 2016/9/20 13:40.
 */
public interface LoginModelInterface {
    void login(String userName,String password,LoginPresenter.CallBack callBack);
}
