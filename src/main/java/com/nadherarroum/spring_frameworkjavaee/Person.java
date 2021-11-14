package com.nadherarroum.spring_frameworkjavaee;

import java.util.Iterator;
import java.util.List;

public class Person {

    private int id;
    private String username;
    //private Addresses addresses;
    private List<String> technology;


    public Person() {
        super();
    }
/*
    public Person(int id, String username, Addresses addresses) {
        this.id = id;
        this.username = username;
        this.addresses = addresses;
    }
 */
public Person(int id, String username, List<String> technology) {
    this.id = id;
    this.username = username;
    this.technology = technology;
}

    public void display(){
        System.out.println("- ID : "+id+"\n"+"- Username : "+username);
        //System.out.println(addresses.infoAddress());

        Iterator<String> it = technology.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
