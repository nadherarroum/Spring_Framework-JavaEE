package com.nadherarroum.spring_frameworkjavaee;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Person {

    private int id;
    private String username;
    private Addresses addresses;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Addresses getAddresses() {
        return addresses;
    }

    public void setAddresses(Addresses addresses) {
        this.addresses = addresses;
    }

    public void display() {
        System.out.println("- ID : " + id +
                "\n" + "- Username : " + username +
                "\n- Addresses : "+addresses.infoAddress());
    }

}
