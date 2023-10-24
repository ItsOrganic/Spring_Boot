package com.example.Learning_Spring_Boot;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
   DBuser db = new DBuser();
   @GetMapping("/hi")
   public String sayHi(){
    return "Hello from our server";
   }
   @GetMapping("/search")
   public String search(@RequestParam String q){
      DataStorage db = new DataStorage();
      return db.searchString(q);
   }

   @GetMapping("/users")
   public List<user> getUserList(){
      return db.getUserList();
   }

   @GetMapping("/users/{age}")
   public user getUser(@PathVariable int age){
      return db.getUser(age);
   }
}
