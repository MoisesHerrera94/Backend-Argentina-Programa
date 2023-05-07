package com.proyectoFinal.ArgentinaPrograma.Controller;

import com.proyectoFinal.ArgentinaPrograma.model.AcercaDe;
import com.proyectoFinal.ArgentinaPrograma.model.Educacion;
import com.proyectoFinal.ArgentinaPrograma.model.Experiencia;
import com.proyectoFinal.ArgentinaPrograma.model.Habilidad;
import com.proyectoFinal.ArgentinaPrograma.model.Proyecto;
import com.proyectoFinal.ArgentinaPrograma.service.IAcercaService;
import com.proyectoFinal.ArgentinaPrograma.service.IEduService;
import com.proyectoFinal.ArgentinaPrograma.service.IExpService;
import com.proyectoFinal.ArgentinaPrograma.service.IHabService;
import com.proyectoFinal.ArgentinaPrograma.service.IProyectService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class controller {
    
    @Autowired
    private IExpService expService;
    
    @Autowired
    private IEduService eduService;
    
    @Autowired
    private IProyectService proyectService;
    
    @Autowired
    private IHabService habService;
    
    @Autowired
    private IAcercaService acercaService;
    
    @PostMapping ("/experiencia/crear")
    public void agregarExperiencia(@RequestBody Experiencia exp){
        expService.crearExperiencia(exp);
    }
    
    @GetMapping ("/experiencias/ver")
    @ResponseBody
    public List<Experiencia> verExperiencias(){
        return expService.verExperiencias();
    }
    
    @GetMapping ("/experiencia/buscar/{id}")
    @ResponseBody
    public Experiencia buscarExp(@PathVariable Long id){
        return expService.buscarExperiencia(id);
    }
    
    @DeleteMapping ("/experiencia/borrar/{id}")
    public void borrarExperiencia(@PathVariable Long id){
        expService.borrarExperiencia(id);
    }
    
    @PostMapping ("/experiencia/editar")
    public void editarExperiencia(@RequestBody Experiencia exp){
        expService.editarExperiencia(exp);
    }
    
    @GetMapping ("/educacion/ver")
    @ResponseBody
    public List<Educacion> verEducacion(){
        return eduService.verEducacion();
    }
   
    @GetMapping ("/educacion/buscar/{id}")
    @ResponseBody
    public Educacion buscarEdu(@PathVariable Long id){
        return eduService.buscarEducacion(id);
    }
    
    @PostMapping ("/educacion/crear")
    public void crearEducacion(@RequestBody Educacion edu){
        eduService.crearEducacion(edu);
    }
    
    @PostMapping ("/educacion/editar")
    public void editarEducacion(@RequestBody Educacion edu){
        eduService.editarEducacion(edu);
    }
    
    @DeleteMapping ("/educacion/borrar/{id}")
    public void borrarEducacion(@PathVariable Long id){
        eduService.borrarEducacion(id);
    }
    
    @GetMapping ("/proyectos/ver")
    @ResponseBody
    public List<Proyecto> verProyectos(){
        return proyectService.verProyectos();
    }
    
    @GetMapping ("/proyectos/buscar/{id}")
    @ResponseBody
    public Proyecto buscarProyecto(@PathVariable Long id){
        return proyectService.buscarProyecto(id);
    }
    
    @PostMapping ("/proyecto/crear")
    public void crearProyecto(@RequestBody Proyecto pro){
        proyectService.crearProyecto(pro);
    }
    
    @PostMapping ("/proyecto/editar")
    public void editarProyecto(@RequestBody Proyecto pro){
        proyectService.editarProyecto(pro);
    }
    
    @DeleteMapping ("/proyecto/borrar/{id}")
    public void borrarProyecto(@PathVariable Long id){
        proyectService.borrarProyecto(id);
    }
    
    @GetMapping ("/habilidad/ver")
    @ResponseBody
    public List<Habilidad> verHabilidades(){
        return habService.verHabilidades();
    }
    
    @PostMapping ("/habilidad/crear")
    public void crearHabilidad(@RequestBody Habilidad hab){
        habService.crearHabilidad(hab);
    }
    
    @DeleteMapping ("/habilidad/borrar/{id}")
    public void borrarHabilidad(@PathVariable Long id){
        habService.borrarHabilidad(id);
    }
    
    @PostMapping ("/habilidad/editar")
    public void editarHabilidad(@RequestBody Habilidad hab){
        habService.editarHabilidad(hab);
    }
    
    @GetMapping ("/acercade/ver/{id}")
    @ResponseBody
    public AcercaDe getAcercaDe(@PathVariable Long id){
        return acercaService.verAcerdaDe(id);
    }
    
    @PostMapping ("/acercade/editar")
    public void addAcercaDe(@RequestBody AcercaDe acerca){
        acercaService.addAcercaDe(acerca);
    }
}
