package com.nadherarroum.spring_frameworkjavaee;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Person {

    private int id;
    private String username;
    private Map<String,String> map;

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

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void display() {
        System.out.println("- ID : " + id +
                "\n" + "- Username : " + username);

        Set<Map.Entry<String, String>> set = map.entrySet();

        Iterator<Map.Entry<String, String>> it = set.iterator();
        while (it.hasNext()){
            Map.Entry<String, String>entry = it.next();
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }

}
