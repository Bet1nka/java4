package org.example;

import java.util.Arrays;

public class User {
    private String [] FIO;
    private String  DateOfBirth;
    private long PhoneNum;
    private char Gender;

    public User() {
    }

    public String[] getFIO() {
        return FIO;
    }

    public void setFIO(String[] FIO) {
        this.FIO = FIO;
    }

    public void setDateOfBirth(String dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public void setPhoneNum(long phoneNum) {
        PhoneNum = phoneNum;
    }

    public void setGender(char gender) {
        Gender = gender;
    }

    @Override
    public String toString() {
        return "ФИО=" + Arrays.toString(FIO) +
                ", Дата рождения='" + DateOfBirth + '\'' +
                ", Номер телефона=" + PhoneNum +
                ", Пол=" + Gender +';';
    }
}
