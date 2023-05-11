package com.example.Super.heros.Controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Super.heros.HeroSkill;
import com.example.Super.heros.Heros;
import com.example.Super.heros.TypeIncident;
import com.example.Super.heros.Repository.HeroProfileRepository;
import com.example.Super.heros.Repository.HeroSkillsRepository;
import com.example.Super.heros.Repository.TypeIncidentRepository;


@Controller
public class RegisterController {
   
   @Autowired
   TypeIncidentRepository incidentRepository;

   @Autowired
   HeroProfileRepository heroProfileRepository;

   @Autowired
   HeroSkillsRepository heroSkillsRepository;

   @GetMapping("/register")
   public String register(Model model) {
      model.addAttribute("types", incidentRepository.findAll());
      return "register";
   }

   @PostMapping("/createHero") 
   public String registerHero(String nameHero, String passwordHero, String phoneHero, String cityHero, String incidents, Integer level) {
      System.out.println("Name:"+nameHero+",password:"+passwordHero+",phoneHero:"+phoneHero+"cityHero:"+cityHero+",typeIncident:"+incidents+",level:"+level);
      Heros heros = new Heros();
      heros.setName(nameHero);
      heros.setPassword(passwordHero);
      heros.setCity(cityHero);
      heros.setPhone(phoneHero);
      for (String tmp : incidents.split(",")) {
         Optional<TypeIncident> incident = incidentRepository.findById(Long.parseLong(tmp));
         if (incident.isPresent()) {
            HeroSkill heroSkill = new HeroSkill();
            heroSkill.setTypeIncident(incident.get());
            heroSkill.setLevel(1);
            
            heros.getHeroSkills().add(heroSkill); 
         }
      }
      heroProfileRepository.save(heros);

      return "redirect:/heroProfile";   
   }
}
