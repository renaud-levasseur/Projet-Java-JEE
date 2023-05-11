package com.example.Super.heros.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
   
   @GetMapping("/login")
   public String login() {
      return "login";
   }

   @PostMapping("/login")
   public String loginHero() {
      return null;  
   }
}
