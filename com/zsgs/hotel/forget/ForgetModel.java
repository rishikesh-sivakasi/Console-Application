package com.zsgs.hotel.forget;

import com.zsgs.hotel.dto.Admin;
import com.zsgs.hotel.dto.User;
import com.zsgs.hotel.hotelsignup.ShowValidateListener;
import com.zsgs.hotel.repository.HotelRepository;

class ForgetModel {
    private ShowValidateListener showValidateListener;
    ForgetModel(ShowValidateListener showValidateListener){
        this.showValidateListener = showValidateListener;
    }
    public void validate(String email, String nickName, String newPassword) {
        if(HotelRepository.getInstance().isAdminContains(email)){
            Admin admin = HotelRepository.getInstance().getAdmin(email);
            if(nickName.equals(admin.getSecurityQuestion())){
                admin.setPassword(newPassword);
                showValidateListener.onSuccess();
            }else{
                showValidateListener.alert("Invalid Nickname !");
            }
        }else if(HotelRepository.getInstance().isUserContains(email)){
            User user = HotelRepository.getInstance().getUser(email);
            if(nickName.equals(user.getSecurityQuestion())){
                user.setPassword(newPassword);
                showValidateListener.onSuccess();
            }else{
                showValidateListener.alert("Invalid Nickname !");
            }
        }else{
            showValidateListener.alert("Invalid Email !");
        }
    }
}
