package com.nadherarroum.spring_frameworkjavaee;

public class Addresses {

    private String phone;
    private String email;
    private String country;
    private String city;
    private String streetNum;

    public Addresses(String phone, String email, String country, String city, String streetNum) {
        super();
        this.phone = phone;
        this.email = email;
        this.country = country;
        this.city = city;
        this.streetNum = streetNum;
    }

    public String infoAddress(){
        return (
                "- Phone : " + phone +
                "\n- Email :" + email +
                "\n- Country : " + country +
                "\n- City : "+city +
                "\n- Street Number : " + streetNum
        );
    }

}
