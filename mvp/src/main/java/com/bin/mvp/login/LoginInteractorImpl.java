package com.bin.mvp.login;


import android.os.Handler;
import android.text.TextUtils;

/**
 * Description
 * <p/>
 * Created by chengbin on 16-4-5 下午11:39.
 * <p/>
 * Email OV5867@163.com
 */
public class LoginInteractorImpl implements LoginInteractor {

    @Override
    public void login(final String username, final String password, final OnLoginFinishedListener listener) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                boolean error = false;

                if (TextUtils.isEmpty(username)) {
                    listener.onUsernameError();
                    error = true;
                }

                if (TextUtils.isEmpty(password)) {
                    listener.onPasswordError();
                    error = true;
                }

                if (!error) {
                    listener.onSuccess();
                }

            }
        }, 2000);
    }

}
