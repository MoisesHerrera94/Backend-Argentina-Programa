package com.proyectoFinal.ArgentinaPrograma.service;

import com.proyectoFinal.ArgentinaPrograma.model.Proyecto;
import java.util.List;

public interface IProyectService {
    public List<Proyecto> verProyectos();
    public void crearProyecto(Proyecto pro);
    public void borrarProyecto(Long id);
    public void editarProyecto(Proyecto pro);
    public Proyecto buscarProyecto(Long id);
}
