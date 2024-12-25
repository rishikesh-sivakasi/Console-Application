package com.zsgs.hotel.hotelsignup;

import com.zsgs.hotel.dto.Admin;
import com.zsgs.hotel.dto.User;
import com.zsgs.hotel.repository.HotelRepository;

class SignupModel {
    private ShowValidateListener showValidateListener;
    SignupModel(ShowValidateListener showValidateListener){
        this.showValidateListener = showValidateListener;
    }

    public void validate(String name, String email, String password,String role, String phoneNumber, String securityQuestion) {
        if (name == null || name.trim().isEmpty()) {
            showValidateListener.alert("Name must not be null or empty");
        }

        if (email == null || !email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$")) {
            showValidateListener.alert("Invalid email ! ");
        }

        if (password == null || password.trim().isEmpty()) {
            showValidateListener.alert("Password must not be null or empty");
        }

        if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) {
            showValidateListener.alert("PhoneNumber must not be 10 digits");
        }

        if(securityQuestion == null || securityQuestion.trim().isEmpty()){
            showValidateListener.alert("securityQuestion must not be null or empty");
        }


        if(role.equals("admin")){
            if (!HotelRepository.getInstance().isAdminContains(email)){
                boolean isAdded = HotelRepository.getInstance().addAdmin(new Admin(name,email,password,role,phoneNumber,securityQuestion));
                if(isAdded){
                    showValidateListener.onSuccess();
                }else{
                    showValidateListener.alert("Something went wrong");
                }
            }
        }else {
            if (!HotelRepository.getInstance().isUserContains(email)) {
                boolean isAdded = HotelRepository.getInstance().addUser(new User(name, email, password, role, phoneNumber, securityQuestion));
                if(isAdded){
                    showValidateListener.onSuccess();
                }else{
                    showValidateListener.alert("Something went wrong");
                }
            }
        }


    }

}
