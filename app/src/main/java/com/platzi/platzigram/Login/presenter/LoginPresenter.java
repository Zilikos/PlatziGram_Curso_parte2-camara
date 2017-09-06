package com.platzi.platzigram.Login.presenter;

/**
 * Created by zilikos on 3/9/17.
 */

public interface LoginPresenter {
    void signIn(String username, String password); //esto interactiua cpon el interactor
    void loginSuccess();
    void loginError(String error);


}
