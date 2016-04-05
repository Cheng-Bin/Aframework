package com.bin.mvp.login;

/**
 * Description
 * <p/>
 * Created by chengbin on 16-4-5 下午11:35.
 * <p/>
 * Email OV5867@163.com
 */
public interface LoginInteractor {

   public interface  OnLoginFinishedListener {
       void onUsernameError();
       void onPasswordError();
       void onSuccess();
   }

    public void login(String username, String password, OnLoginFinishedListener listener);

}
