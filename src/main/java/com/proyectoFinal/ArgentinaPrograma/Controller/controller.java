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
    
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping ("/experiencia/crear")
    public void agregarExperiencia(@RequestBody Experiencia exp){
        expService.crearExperiencia(exp);
    }
    
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping ("/experiencias/ver")
    @ResponseBody
    public List<Experiencia> verExperiencias(){
        return expService.verExperiencias();
    }
    
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping ("/experiencia/buscar/{id}")
    @ResponseBody
    public Experiencia buscarExp(@PathVariable Long id){
        return expService.buscarExperiencia(id);
    }
    
    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping ("/experiencia/borrar/{id}")
    public void borrarExperiencia(@PathVariable Long id){
        expService.borrarExperiencia(id);
    }
    
    @PostMapping ("/experiencia/editar")
    public void editarExperiencia(@RequestBody Experiencia exp){
        expService.editarExperiencia(exp);
    }
    
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping ("/educacion/ver")
    @ResponseBody
    public List<Educacion> verEducacion(){
        return eduService.verEducacion();
    }
    
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping ("/educacion/buscar/{id}")
    @ResponseBody
    public Educacion buscarEdu(@PathVariable Long id){
        return eduService.buscarEducacion(id);
    }
    
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping ("/educacion/crear")
    public void crearEducacion(@RequestBody Educacion edu){
        eduService.crearEducacion(edu);
    }
    
    @PostMapping ("/educacion/editar")
    public void editarEducacion(@RequestBody Educacion edu){
        eduService.editarEducacion(edu);
    }
    
    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping ("/educacion/borrar/{id}")
    public void borrarEducacion(@PathVariable Long id){
        eduService.borrarEducacion(id);
    }
    
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping ("/proyectos/ver")
    @ResponseBody
    public List<Proyecto> verProyectos(){
        return proyectService.verProyectos();
    }
    
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping ("/proyectos/buscar/{id}")
    @ResponseBody
    public Proyecto buscarProyecto(@PathVariable Long id){
        return proyectService.buscarProyecto(id);
    }
    
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping ("/proyecto/crear")
    public void crearProyecto(@RequestBody Proyecto pro){
        proyectService.crearProyecto(pro);
    }
    
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping ("/proyecto/editar")
    public void editarProyecto(@RequestBody Proyecto pro){
        proyectService.editarProyecto(pro);
    }
    
    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping ("/proyecto/borrar/{id}")
    public void borrarProyecto(@PathVariable Long id){
        proyectService.borrarProyecto(id);
    }
    
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping ("/habilidad/ver")
    @ResponseBody
    public List<Habilidad> verHabilidades(){
        return habService.verHabilidades();
    }
    
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping ("/habilidad/crear")
    public void crearHabilidad(@RequestBody Habilidad hab){
        habService.crearHabilidad(hab);
    }
    
    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping ("/habilidad/borrar/{id}")
    public void borrarHabilidad(@PathVariable Long id){
        habService.borrarHabilidad(id);
    }
    
    @PostMapping ("/habilidad/editar")
    public void editarHabilidad(@RequestBody Habilidad hab){
        habService.editarHabilidad(hab);
    }
    
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping ("/acercade/ver/{id}")
    @ResponseBody
    public AcercaDe getAcercaDe(@PathVariable Long id){
        return acercaService.verAcerdaDe(id);
    }
    
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping ("/acercade/editar")
    public void addAcercaDe(@RequestBody AcercaDe acerca){
        acercaService.addAcercaDe(acerca);
    }
}
