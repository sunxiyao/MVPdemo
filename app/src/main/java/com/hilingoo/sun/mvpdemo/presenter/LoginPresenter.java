package com.hilingoo.sun.mvpdemo.presenter;

import android.text.TextUtils;

import com.hilingoo.sun.mvpdemo.model.LoginBusinessImp;
import com.hilingoo.sun.mvpdemo.model.LoginInfo;
import com.hilingoo.sun.mvpdemo.model.LoginModelInterface;
import com.hilingoo.sun.mvpdemo.view.LoginViewInterface;

/**
 * Author: Diligent.S
 * Time: 2016/9/20 13:42.
 */
public class LoginPresenter {
    private final LoginModelInterface loginBusiness;

    private final LoginViewInterface loginViewInterface;

    public LoginPresenter(LoginViewInterface viewInterface){
        this.loginBusiness = new LoginBusinessImp();
        this.loginViewInterface = viewInterface;
    }

    public void login() {
        String userName = loginViewInterface.getUserName();
        String password = loginViewInterface.getPassWord();
        if (TextUtils.isEmpty(userName) || TextUtils.isEmpty(password)) {
            loginViewInterface.showLoginFail("请完善登录信息");
            return;
        }
        loginViewInterface.showProgress();
        loginBusiness.login(userName, password, new CallBack() {
            @Override
            public void onSuccess(LoginInfo info) {
                loginViewInterface.dismissProgress();
                loginViewInterface.goToActivity();
            }

            @Override
            public void onFail(final Throwable error) {
                loginViewInterface.dismissProgress();
                loginViewInterface.showLoginFail(error.getMessage());
            }
        });

    }
    public interface CallBack{

        void onSuccess(LoginInfo info);

        void onFail(Throwable error);
    }
}
