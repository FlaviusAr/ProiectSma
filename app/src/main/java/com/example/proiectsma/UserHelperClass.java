package com.example.proiectsma;

public class UserHelperClass {
    String firstname, lastname, phone, city;
    public UserHelperClass() {
    }


    public UserHelperClass(String firstname, String lastname, String phone, String city) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone = phone;
        this.city = city;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
