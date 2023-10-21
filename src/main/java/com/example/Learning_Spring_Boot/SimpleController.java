package com.example.Learning_Spring_Boot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
   @GetMapping("/hi")
   public String sayHi(){
    return "Hello from our server";
   }
   @GetMapping("/search")
   public String search(@RequestParam String q){
      DataStorage db = new DataStorage();
      return db.searchString(q);
   }
}
