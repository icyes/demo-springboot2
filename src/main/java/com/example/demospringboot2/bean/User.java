package com.example.demospringboot2.bean;

public class User {
    private String name;
    private Number age;
    private Pet pet;
    
    public User(String name, Number age) {
        this.name = name;
        this.age = age;
    }
    
    public Pet getPet() {
        return this.pet;
    }
    
    public void setPet(Pet pet) {
        this.pet = pet;
    }
    
    public String getName() {
        return this.name;
    }
    
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Number getAge() {
        return this.age;
    }
    
    public void setAge(Number age) {
        this.age = age;
    }
    
    @Override
    public String toString() {
        return "User{" + "name='" + this.name + '\'' + ", age=" + this.age + ", pet=" + this.pet + '}';
    }
}
