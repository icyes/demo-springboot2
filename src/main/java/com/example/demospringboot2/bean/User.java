package com.example.demospringboot2.bean;

public class User {
    private String name;
    private Number age;

    public User(String name, Number age){
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public Number getAge() {
        return age;
    }

    public void setAge(Number age) {
        this.age = age;
    }
}
