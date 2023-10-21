package com.example.Learning_Spring_Boot;

import java.util.HashMap;

import javax.xml.crypto.Data;

public class DataStorage {
    private HashMap<String,String> store = new HashMap<>();
    public DataStorage(){
        store.put("Mike_Tyson", "Boxer");
        store.put("Bruce_Lee", "Fighter");
        store.put("Lebron James", "BasketBall player");
    }
    public String searchString(String word){
        return store.get(word);
    }
    
}
