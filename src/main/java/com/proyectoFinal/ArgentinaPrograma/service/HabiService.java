package com.proyectoFinal.ArgentinaPrograma.service;

import com.proyectoFinal.ArgentinaPrograma.model.Habilidad;
import com.proyectoFinal.ArgentinaPrograma.repository.HabRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabiService implements IHabService {

    @Autowired
    public HabRepository habRepo;
    
    @Override
    public List<Habilidad> verHabilidades() {
        return habRepo.findAll();
    }

    @Override
    public void crearHabilidad(Habilidad hab) {
        habRepo.save(hab);
    }

    @Override
    public void borrarHabilidad(Long id) {
        habRepo.deleteById(id);
    }

    @Override
    public Habilidad buscarHabilidad(Long id) {
        return habRepo.findById(id).orElse(null);
    }

    @Override
    public void editarHabilidad(Habilidad hab) {
        habRepo.save(hab);
    }
    
}
