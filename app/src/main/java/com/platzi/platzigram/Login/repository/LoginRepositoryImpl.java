package com.platzi.platzigram.Login.repository;

import com.platzi.platzigram.Login.presenter.LoginPresenter;

/**
 * Created by zilikos on 3/9/17.
 */

public class LoginRepositoryImpl implements LoginRepository {

    LoginPresenter presenter;

    public LoginRepositoryImpl(LoginPresenter presenter) {
        this.presenter = presenter;

    }

    @Override
    public void signIn(String username, String password) {
        boolean success = true;
        if (success){
            presenter.loginSuccess();
        }else {
            presenter.loginError("Ocurrió un error");
        }
    }
}
