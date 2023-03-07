package com.proyectoFinal.ArgentinaPrograma.repository;

import com.proyectoFinal.ArgentinaPrograma.model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EduRepository extends JpaRepository<Educacion, Long> {
    
}
