package com.platzi.platzigram.Login.interactor;

import com.platzi.platzigram.Login.presenter.LoginPresenter;
import com.platzi.platzigram.Login.repository.LoginRepository;
import com.platzi.platzigram.Login.repository.LoginRepositoryImpl;

/**
 * Created by zilikos on 3/9/17.
 */

public class LoginInteractorImpl implements LoginInteractor {

    private LoginPresenter presenter;
    private LoginRepository repository;


    public LoginInteractorImpl(LoginPresenter presenter){
        this.presenter = presenter;
        repository = new LoginRepositoryImpl(presenter);

    }

    @Override
    public void signIn(String username, String password) {
        repository.signIn(username, password);


    }
}
