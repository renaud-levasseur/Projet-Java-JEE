package com.example.Super.heros.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Super.heros.Repository.TypeIncidentRepository;

@Controller
public class CreateIncidentController {

   @Autowired
   TypeIncidentRepository incidentRepository;
   
   @GetMapping("/create-incident")
   public String createIncident(Model model) {
      model.addAttribute("types", incidentRepository.findAll());
      return "createIncident";
   }

   @PostMapping("/create-incident")
   public String declareIncident(String name, @ModelAttribute String incident) {
      return incident;
   }

}
