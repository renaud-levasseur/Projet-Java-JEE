package com.example.Super.heros;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Incident {
   
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id;

   @Column
   private String hero;
   
   @Column 
   private Float distance;

   @Column
   private String phone;

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   //Name hero
   public String getHero() {
      return hero;
   }

   public void setHero(String hero) {
      this.hero = hero;
   }

   //Distance
   public Float getDistance() {
      return distance;
   }

   public void setDistance(Float distance) {
      this.distance = distance;
   }

   //Phone
   public Float getPhone() {
      return distance;
   }

   public void setPhone(String phone) {
      this.phone = phone;
   }   

}
