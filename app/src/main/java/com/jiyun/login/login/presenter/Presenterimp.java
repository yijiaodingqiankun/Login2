package com.jiyun.login.login.presenter;

import com.diancanwang.dell.diancanwang.login.model.CallBackListener;
import com.diancanwang.dell.diancanwang.login.model.InterfaceModel;
import com.diancanwang.dell.diancanwang.login.model.Modelimp;
import com.diancanwang.dell.diancanwang.login.view.InterfaceLogin;

/**
 * Created by DELL zhanghuirong on 2018/4/15.
 */

public class Presenterimp implements InterfacePresenter, CallBackListener {
    private InterfaceModel interfaceModel;
    private InterfaceLogin interfaceLogin;

    public Presenterimp(InterfaceLogin interfaceLogin) {
        this.interfaceLogin = interfaceLogin;
        interfaceModel = new Modelimp();
    }


    @Override
    public void loginSuccess(String string) {
        interfaceLogin.loginSuccess(string);
    }

    @Override
    public void loginFail(String string) {
        interfaceLogin.loginFail(string);
    }

    @Override
    public void send(String name, String pass) {
        interfaceModel.getdata(name, pass, this);
    }
}
