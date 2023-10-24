package com.example.Learning_Spring_Boot;

public class user {
    public int getId(){
        return id; 
    }
    public void setId(int id){
        this.id = id;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    private int id;
    private int age;
    private String name;

    public user(int id,int age, String name) {
        this.id = id
        this.age = age;
        this.name = name;
    }


}
