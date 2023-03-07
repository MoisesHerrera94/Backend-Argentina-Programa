package com.proyectoFinal.ArgentinaPrograma.service;

import com.proyectoFinal.ArgentinaPrograma.model.Habilidad;
import java.util.List;

public interface IHabService {
    public List<Habilidad> verHabilidades();
    public void crearHabilidad(Habilidad hab);
    public void borrarHabilidad(Long id);
    public Habilidad buscarHabilidad(Long id);
    public void editarHabilidad(Habilidad hab);
}
