package com.proyectoFinal.ArgentinaPrograma.service;

import com.proyectoFinal.ArgentinaPrograma.model.Proyecto;
import com.proyectoFinal.ArgentinaPrograma.repository.ProyectRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectService implements IProyectService{
    
    @Autowired
    public ProyectRepository proyectoRepo;

    @Override
    public List<Proyecto> verProyectos() {
        return proyectoRepo.findAll();
    }

    @Override
    public void crearProyecto(Proyecto pro) {
        proyectoRepo.save(pro);
    }

    @Override
    public void borrarProyecto(Long id) {
        proyectoRepo.deleteById(id);
    }

    @Override
    public void editarProyecto(Proyecto pro) {
        proyectoRepo.save(pro);
    }

    @Override
    public Proyecto buscarProyecto(Long id) {
        return proyectoRepo.findById(id).orElse(null);
    }
}
