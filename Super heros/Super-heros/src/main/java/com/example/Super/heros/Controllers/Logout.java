package com.example.Super.heros.Controllers;

import org.springframework.web.bind.annotation.GetMapping;

public class Logout {
   
   @GetMapping("/logout")
   public String home() {
      return "home";
   }
}
