package com.nadherarroum.spring_frameworkjavaee;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Person {

    private int id;
    private String username;
    private List<String> list;

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

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void display() {
        System.out.println("- ID : " + id +
                "\n" + "- Username : " + username);

        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }

}
