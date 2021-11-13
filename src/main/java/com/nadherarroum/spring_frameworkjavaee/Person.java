package com.nadherarroum.spring_frameworkjavaee;

public class Person {

    private int id;
    private String username;

    public Person() {
        super();
    }

    public Person(int id) {
        this.id = id;
    }

    public Person(String username) {
        this.username = username;
    }

    public Person(int id, String username) {
        this.id = id;
        this.username = username;
    }

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

    public void display(){
        System.out.println("ID : "+id+" "+"Username : "+username);
    }
}
