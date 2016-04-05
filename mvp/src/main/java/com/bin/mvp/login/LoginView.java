package com.bin.mvp.login;

/**
 * Description
 * <p/>
 * Created by chengbin on 16-4-5 下午11:14.
 * <p/>
 * Email OV5867@163.com
 */
public interface LoginView {

    public void showProgress();

    public void hideProgress();

    public void setUsernameError();

    public void setPasswordError();

    public void navigateHome();


}
