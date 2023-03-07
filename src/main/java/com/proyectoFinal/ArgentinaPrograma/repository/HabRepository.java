package com.proyectoFinal.ArgentinaPrograma.repository;

import com.proyectoFinal.ArgentinaPrograma.model.Habilidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabRepository extends JpaRepository<Habilidad, Long> {
    
}
