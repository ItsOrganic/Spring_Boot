package com.example.Learning_Spring_Boot;

import java.util.ArrayList;
import java.util.List;

public class DBuser {
    private List<user> userList = new ArrayList<user>();

    public DBuser(){
        userList.add(new user(1,18,"Adam"));
        userList.add(new user(2,22,"Jordan"));
    }
    
    public List<user> getUserList(){
        return userList;
    }
    public user getUser(int id){
        for(user use : userList){
            if(use.getId()==id)
                return use;
        }
        return null;
    }
}
