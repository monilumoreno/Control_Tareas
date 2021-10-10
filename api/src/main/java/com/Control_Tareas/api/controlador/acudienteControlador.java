package com.Control_Tareas.api.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

import com.Control_Tareas.api.model.acudiente;
import com.Control_Tareas.api.repositorio.acudienteRepositorio;
@CrossOrigin(origins = "*", maxAge = 360)
@RestController
@RequestMapping("/api") //Las apps modernas usan mvc, la vista es lo visual con lo que el usuario interacciona
//Los controladores reciben las solicitudes y se comunica con la capa del modelo, la logica que es de acceso a datos
//El controller le dice al modelo, estan intentado hacer algo, mira a ver que es lo que hace y si es correcto.....
//El modelo le dice al controlador si es alido o no, y el controlador se encarga de redirigir al usuario o mostrar al usuario mensaje de error
// Todas las solicitudfes que lleguen con /api, mapealas al controlador tal....
//Si creamos un segundo controlador llamemoslo cursos toda solicitud que llegue con /cursos, es mapeada a ese controlador curss...
//Lo mejor es que cada clase tenga su controlador.... evitando colocar todos los controladores en un solo class
public class acudienteControlador {
    @Autowired
    private acudienteRepositorio acudienteRepositorio; //Aqui estamos inicializando los metodos de PersonaRepositorio, si no usaramos spring, 
    //tendriamos ue usar el metodo antiguo clase new class

    @GetMapping("/acudientes")
    public List<acudiente> buscarPersonas() {

        return acudienteRepositorio.findAll();
    }
    @GetMapping("/acudiente/{nombres}")
    public List<acudiente> findByNombres(@PathVariable("nombres") String nombres) {

        return acudienteRepositorio.findByNombres(nombres);
    }
    @PostMapping("/acudiente")
    public acudiente insertarPersonas(@RequestBody acudiente acudiente) {

        return acudienteRepositorio.save(acudiente);
    }
    @DeleteMapping("/acudiente/{id_estudiante}")
    public void eliminarAcudiente(@PathVariable("id_acudiente") Long id) {
        acudienteRepositorio.deleteById(id);
    }
}
