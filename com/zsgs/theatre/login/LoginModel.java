package com.zsgs.theatre.login;

class LoginModel {
    private LoginView loginView;

    LoginModel(LoginView loginView){
        this.loginView = loginView;
    }

    public void authenticate(String email, String password) {
        if(!email.equals("ZSGS@zsgs.com")){
            loginView.onLoginFailed("Wrong Email !");
        }else if (!password.equals("admin")){
            loginView.onLoginFailed("Wrong Password !");
        }else{
            loginView.onLoginSuccess();
        }
    }
}
