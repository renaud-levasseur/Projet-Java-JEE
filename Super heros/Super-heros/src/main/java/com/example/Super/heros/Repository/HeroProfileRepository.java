package com.example.Super.heros.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Super.heros.Heros;

@Repository
public interface HeroProfileRepository extends JpaRepository<Heros, Long> {


}