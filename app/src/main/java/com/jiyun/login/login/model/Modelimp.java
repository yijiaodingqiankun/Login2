package com.jiyun.login.login.model;

import android.text.TextUtils;

/**
 * Created by DELL zhanghuirong on 2018/4/15.
 */

public class Modelimp implements InterfaceModel {
    @Override
    public void getdata(String name, String pass, CallBackListener callBackListener) {
        submit(name, pass, callBackListener);
    }

    private void submit(String name, String pwd, CallBackListener callBackListener) {
        // validate
        //假如账号为空
        if (TextUtils.isEmpty(name)) {
            callBackListener.loginFail("账号不能为空");
            return;
        }

        //假如密码为空
        if (TextUtils.isEmpty(pwd)) {
            callBackListener.loginFail("密码不能为空");
            return;
        }

        // TODO validate success, do something

        if (name.equals("admin") && pwd.equals("123456")) {
            callBackListener.loginSuccess("登录成功");
        } else {
            callBackListener.loginFail("账号或密码错误");
        }

    }
}
