package com.jiyun.login.login.model;

/**
 * Created by DELL zhanghuirong on 2018/4/15.
 */

public interface CallBackListener {
    void loginSuccess(String string);

    void loginFail(String string);

}
