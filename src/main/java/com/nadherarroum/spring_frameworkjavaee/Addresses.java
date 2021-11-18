package com.nadherarroum.spring_frameworkjavaee;

public class Addresses {

    private String phone;
    private String email;
    private String country;
    private String city;
    private String streetNum;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreetNum() {
        return streetNum;
    }

    public void setStreetNum(String streetNum) {
        this.streetNum = streetNum;
    }

    public String infoAddress(){
        return (
                "\n\t> Phone : " + phone +
                "\n\t> Email :" + email +
                "\n\t> Country : " + country +
                "\n\t> City : "+city +
                "\n\t> Street Number : " + streetNum
        );
    }

}
