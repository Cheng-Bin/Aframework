package com.bin.mvp.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.bin.mvp.R;
import com.bin.mvp.main.MainActivity;

public class LoginActivity extends AppCompatActivity implements LoginView, View.OnClickListener {

    private LoginPresenter loginPresenter;


    private EditText username;
    private EditText password;
    private Button loginButton;
    private ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginPresenter = new LoginPresenterImpl(this);
        initView();
    }


    private void initView() {
        username = (EditText) this.findViewById(R.id.username);
        password = (EditText)this.findViewById(R.id.password);
        progressBar = (ProgressBar) this.findViewById(R.id.progress);
        loginButton = (Button) this.findViewById(R.id.loginButton);
        loginButton.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
         loginPresenter.validateCredentials(
                                         username.getText().toString(),
                                         password.getText().toString());
    }


    @Override
    public void showProgress() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgress() {
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void setUsernameError() {
        username.setError("用户名错误");
    }

    @Override
    public void setPasswordError() {
        password.setError("用户名错误");
    }

    @Override
    public void navigateHome() {
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        loginPresenter.onDestroy();
    }


}
