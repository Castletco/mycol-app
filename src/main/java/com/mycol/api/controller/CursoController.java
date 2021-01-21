package com.mycol.api.controller;

import com.mycol.api.entity.Curso;
import com.mycol.api.service.ICursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT})
@RequestMapping("/api")
public class CursoController {

    @Autowired
    private ICursoService serviceCursos;

    @GetMapping("/cursos")
    public List<Curso> buscarTodos() {
        return serviceCursos.buscarTodos();
    }

    @GetMapping("/cursos/search/{id}")
    public Curso buscarPorId (@PathVariable("id") int idCurso) {
        return serviceCursos.buscarPorId(idCurso);
    }

    @PostMapping("/cursos")
    public Curso guardar (@RequestBody Curso curso) {
        return serviceCursos.guardar(curso);
    }

    @PutMapping("/cursos")
    public Curso modificar (@RequestBody Curso curso) {
        return serviceCursos.guardar(curso);
    }

    @DeleteMapping("/cursos/{id}")
    public String eliminar (@PathVariable("id") int idCurso) {
        serviceCursos.eliminar(idCurso);
        return "Registro Curso Eliminado";
    }
}
