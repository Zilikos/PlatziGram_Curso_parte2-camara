package com.platzi.platzigram.Login.presenter;

import com.platzi.platzigram.Login.interactor.LoginInteractor;
import com.platzi.platzigram.Login.interactor.LoginInteractorImpl;
import com.platzi.platzigram.Login.view.LoginView;

/**
 * Created by zilikos on 3/9/17.
 */

public class LoginPresenterImpl implements LoginPresenter{

    private LoginView loginView;
    private LoginInteractor interactor;

    public LoginPresenterImpl(LoginView loginView) {
        this.loginView = loginView;
        interactor = new LoginInteractorImpl(this);
    }

    @Override
    public void signIn(String username, String password) {
        loginView.disableInputs();
        loginView.showProgressBar();
        interactor.signIn(username,password);


    }

    @Override
    public void loginSuccess() {
        loginView.goHome();

        loginView.hideProgressBar();

    }

    @Override
    public void loginError(String error) {
        loginView.enableInputs();
        loginView.hideProgressBar();
        loginView.loginError(error);



    }
}
