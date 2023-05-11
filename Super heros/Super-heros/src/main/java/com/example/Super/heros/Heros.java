package com.example.Super.heros;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Heros {
   
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id;

   @Column
   private String name;

   @Column
   private String password;

   @Column
   private String city;

   @Column
   private String phone;   

   @OneToMany
   private List<HeroSkill> heroSkills = new ArrayList<>();

   //ID
   public Long getId() {
      return id;
   }

   public void setId(long id) {
      this.id = id;
   }

   public List<HeroSkill> getHeroSkills() {
      return heroSkills;
   }

   public void setTypeIncidents(List<HeroSkill> heroSkills) {
      this.heroSkills = heroSkills;
   }

   public void setId(Long id) {
      this.id = id;
   }

   //Name
   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }
   
   //Password
   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }
 
   //City
   public String getCity() {
      return city;
   }

   public void setCity(String city) {
      this.city = city;
   }

   //Phone
   public String getPhone() {
      return phone;
   }

   public void setPhone(String phone) {
      this.phone = phone;
   }

}
