package com.mycol.api.controller;

import com.mycol.api.entity.Alumno;
import com.mycol.api.service.IAlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
@RequestMapping("/api")
public class AlumnosController {

    @Autowired
    private IAlumnoService serviceAlumnos;

    @GetMapping("/alumnos")
    public List<Alumno> buscarTodos() { return serviceAlumnos.buscarTodos(); }

    @PostMapping("/alumnos")
    public Alumno guardar (@RequestBody Alumno alumno) {
        serviceAlumnos.guardar(alumno);
        return alumno;
    }

    @PutMapping("/alumnos")
    public Alumno modificar (@RequestBody Alumno alumno) {
        serviceAlumnos.guardar(alumno);
        return alumno;
    }

    @DeleteMapping("alumnos/{id}")
    public String eliminar (@PathVariable("id") Integer idAlumno) {
        serviceAlumnos.eliminar(idAlumno);
        return "Registro Alumno Eliminado";
    }
}
