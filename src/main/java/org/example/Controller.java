package org.example;

public class Controller extends UserController{
    public  User AddUser(){
        User user = new User();
        user.setFIO(addFIO());
        user.setDateOfBirth(addDateOfBirth());
        user.setPhoneNum(addPhonenum());
        user.setGender(addGender());

        return user;
    }
}
