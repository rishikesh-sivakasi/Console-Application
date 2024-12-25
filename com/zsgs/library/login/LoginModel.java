package com.zsgs.library.login;

class LoginModel {
    private LoginView loginView;
    LoginModel(LoginView loginView){
        this.loginView = loginView;
    }

    public void authenticate(String email, String password) {
        if(!email.equals("ZSGS@zsgs.com")){
            loginView.onLoginFailed("Invalid Email");
        }else if(!password.equals("admin")){
            loginView.onLoginFailed("Password is Wrong");
        }else{
            loginView.onLoginSuccess();
        }
    }
}
