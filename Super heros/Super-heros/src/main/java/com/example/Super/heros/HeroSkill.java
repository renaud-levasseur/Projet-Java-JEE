package com.example.Super.heros;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

@Entity
public class HeroSkill {
   
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id;

   @ManyToOne
   private Heros hero;

   @ManyToOne
   private TypeIncident typeIncident;

   @Column
   private @NotNull @Min(3) @Max(6) Integer level;

   public long getId() {
      return id;
   }

   public void setId(long id) {
      this.id = id;
   }

   public Heros getHero() {
      return hero;
   }

   public void setHero(Heros hero) {
      this.hero = hero;
   }

   public TypeIncident getTypeIncident() {
      return typeIncident;
   }

   public void setTypeIncident(TypeIncident typeIncident) {
      this.typeIncident = typeIncident;
   }

   public Integer getLevel() {
      return level;
   }

   public void setLevel(Integer level) {
      this.level = level;
   }

}
