package com.proyectoFinal.ArgentinaPrograma.repository;

import com.proyectoFinal.ArgentinaPrograma.model.AcercaDe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcercaDeRepository extends JpaRepository<AcercaDe, Long>{
    
}
