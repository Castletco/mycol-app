package com.mycol.api.controller;

import com.mycol.api.entity.Profesor;
import com.mycol.api.service.IProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT})
@RequestMapping("/api")
public class ProfesorController {

    @Autowired
    private IProfesorService serviceProfesores;

    @GetMapping("/profesores")
    public List<Profesor> buscarTodos() {
        return serviceProfesores.buscarTodos();
    }

    @GetMapping("/profesores/edit/{id}")
    public Profesor editar (@PathVariable("id") int idProfesor) {
        return serviceProfesores.buscarPorId(idProfesor);
    }

    @PostMapping("/profesores")
    public Profesor guardar (@RequestBody Profesor profesor) {
        return serviceProfesores.guardar(profesor);
    }

    @PutMapping("/profesores")
    public Profesor editar (@RequestBody Profesor profesor) {
        return serviceProfesores.guardar(profesor);
    }

    @DeleteMapping("/profesores/{id}")
    public String eliminar (@PathVariable("id") int idProfesor) {
        serviceProfesores.eliminar(idProfesor);
        return "Registro Profesor Eliminado";
    }
}
