package com.example.Super.heros;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TypeIncident {
   
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id;

   @Column
   private String name;

   //Id
   public Long getId() {
      return id;
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

}
