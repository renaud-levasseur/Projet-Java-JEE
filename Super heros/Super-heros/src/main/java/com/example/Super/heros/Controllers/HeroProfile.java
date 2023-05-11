package com.example.Super.heros.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HeroProfile {
   
   @GetMapping("/hero-profile")
   public String home() {
      return "heroProfile";
   }
}
