package com.proyectoFinal.ArgentinaPrograma.service;

import com.proyectoFinal.ArgentinaPrograma.model.AcercaDe;
import com.proyectoFinal.ArgentinaPrograma.repository.AcercaDeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AcercaDeService implements IAcercaService{

    @Autowired
    public AcercaDeRepository acercaRepo;

    @Override
    public AcercaDe verAcerdaDe(Long id) {
        return acercaRepo.findById(id).orElse(null);
    }

    @Override
    public void addAcercaDe(AcercaDe acerca) {
        acercaRepo.save(acerca);
    }  
}
