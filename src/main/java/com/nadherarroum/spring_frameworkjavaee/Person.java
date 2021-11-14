package com.nadherarroum.spring_frameworkjavaee;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Person {

    private int id;
    private String username;
    private Addresses addresses;
    //private List<String> technology;
    //private Map<String,String> technology;

    public Person() {
        super();
    }

    public Person(int id, String username) {
        this.id = id;
        this.username = username;
    }

    public Person(int id, String username, Addresses addresses) {
        this.id = id;
        this.username = username;
        this.addresses = addresses;
    }

    /*
    public Person(int id, String username, List<String> technology) {
        this.id = id;
        this.username = username;
        this.technology = technology;
    }
     */

    /*
    public Person(int id, String username, Map<String,String> technology) {
        this.id = id;
        this.username = username;
        this.technology = technology;
    }
     */
    public void display(){
        System.out.println("- ID : "+id+"\n"+"- Username : "+username);
        System.out.println("- Address : \n"+addresses.infoAddress());

        /*
        Iterator<String> it = technology.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
         */

        /*
        Set<Map.Entry<String,String>> set = technology.entrySet();
        Iterator<Map.Entry<String,String>> it = set.iterator();
        while (it.hasNext()){
            Map.Entry<String,String> entry = it.next();
            System.out.println("> Technology :\t"+entry.getKey()+"\n\t- "+entry.getValue());
        }
         */

    }
}
