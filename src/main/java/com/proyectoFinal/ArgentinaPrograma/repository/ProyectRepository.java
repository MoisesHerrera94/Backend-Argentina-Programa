package com.proyectoFinal.ArgentinaPrograma.repository;

import com.proyectoFinal.ArgentinaPrograma.model.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProyectRepository extends JpaRepository<Proyecto, Long>{
    
}
