package com.zsgs.hotel.hotellogin;

public interface LoginListener {
    public void onLoginFailed(String error);
    public void onLoginSuccess();
}
