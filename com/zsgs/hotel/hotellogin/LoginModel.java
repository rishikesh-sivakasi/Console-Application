package com.zsgs.hotel.hotellogin;

import com.zsgs.hotel.dto.Admin;
import com.zsgs.hotel.dto.User;
import com.zsgs.hotel.repository.HotelRepository;

class LoginModel {
    private LoginListener loginListener;

    LoginModel(LoginListener loginListener){
        this.loginListener = loginListener;
    }

    void authenticate(String email, String password){
        if(HotelRepository.getInstance().isUserContains(email)){
            User user = HotelRepository.getInstance().getUser(email);
            if(!password.equals(user.getPassword())){
                loginListener.onLoginFailed("Wrong Password !");
            }else{
                loginListener.onLoginSuccess();
            }
        }
        else if (HotelRepository.getInstance().isAdminContains(email)){
            Admin admin = HotelRepository.getInstance().getAdmin(email);
            if(!password.equals(admin.getPassword())){
                loginListener.onLoginFailed("Wrong Password !");
            }else{
                loginListener.onLoginSuccess();
            }
        }else{
            loginListener.onLoginFailed("Email not found.");
        }
    }
}
