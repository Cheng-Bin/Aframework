package com.bin.mvp.login;

/**
 * Description
 * <p/>
 * Created by chengbin on 16-4-5 下午11:20.
 * <p/>
 * Email OV5867@163.com
 */
public interface LoginPresenter {


    public void validateCredentials(String username, String password);

    public void onDestroy();



}
