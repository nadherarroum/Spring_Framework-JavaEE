package com.nadherarroum.spring_frameworkjavaee;

public class Person {

    private int id;
    private String username;
    private Addresses addresses;


    public Person() {
        super();
    }

    public Person(int id, String username, Addresses addresses) {
        this.id = id;
        this.username = username;
        this.addresses = addresses;
    }


    public void display(){
        System.out.println("- ID : "+id+"\n"+"- Username : "+username);
        System.out.println(addresses.infoAddress());
    }
}
