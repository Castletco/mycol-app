package com.mycol.api.controller;

import com.mycol.api.entity.Alumno;
import com.mycol.api.service.IAlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT})
@RequestMapping("/api")
public class AlumnoController {

    @Autowired
    private IAlumnoService serviceAlumnos;

    @GetMapping("/alumnos")
    public List<Alumno> buscarTodos() {
        return serviceAlumnos.buscarTodos();
    }

    @GetMapping("/alumnos/search/{id}")
    public Alumno buscarPorId (@PathVariable("id") int idAlumno) {
        return serviceAlumnos.buscarPorId(idAlumno);
    }

    @PostMapping("/alumnos")
    public Alumno guardar (@RequestBody Alumno alumno) {
        return serviceAlumnos.guardar(alumno);
    }

    @PutMapping("/alumnos")
    public Alumno modificar (Alumno alumno) {
        return serviceAlumnos.guardar(alumno);
    }

    @DeleteMapping("/alumnos/{id}")
    public String eliminar (@PathVariable("id") int idAlumno) {
        serviceAlumnos.eliminar(idAlumno);
        return "Registro Alumno Eliminado";
    }
}
