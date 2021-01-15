package com.mycol.api.controller;

import com.mycol.api.entity.Curso;
import com.mycol.api.service.ICursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
@RequestMapping("/cursos")
public class CursoController {

    @Autowired
    private ICursoService serviceCursos;

    @GetMapping("/index")
    public List<Curso> buscarTodos() { return serviceCursos.buscarTodos(); }

    @PostMapping("/save")
    public Curso guardar (@RequestBody Curso curso) {
        serviceCursos.guardar(curso);
        return curso;
    }

    @PutMapping("/update")
    public Curso modificar (@RequestBody Curso curso) {
        serviceCursos.guardar(curso);
        return curso;
    }

    @DeleteMapping("/delete/{id}")
    public String eliminar (@PathVariable("id") Integer idCurso) {
        serviceCursos.eliminar(idCurso);
        return "Registro Curso Eliminado";
    }
}
