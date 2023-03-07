package com.proyectoFinal.ArgentinaPrograma.repository;

import com.proyectoFinal.ArgentinaPrograma.model.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpRepository extends JpaRepository<Experiencia, Long>{
    
} 
