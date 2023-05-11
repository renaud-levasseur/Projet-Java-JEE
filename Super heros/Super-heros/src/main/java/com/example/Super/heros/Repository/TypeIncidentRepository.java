package com.example.Super.heros.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Super.heros.TypeIncident;

@Repository
public interface TypeIncidentRepository extends JpaRepository<TypeIncident, Long> {


}