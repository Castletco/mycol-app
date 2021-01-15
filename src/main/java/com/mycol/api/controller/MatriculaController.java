package com.mycol.api.controller;

import com.mycol.api.entity.Matricula;
import com.mycol.api.service.IMatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
@RequestMapping("/api")
public class MatriculaController {

    @Autowired
    private IMatriculaService serviceMatriculas;

    @GetMapping("/matriculas")
    public List<Matricula> buscarTodas() { return serviceMatriculas.buscarTodas(); }

    @PostMapping("/matriculas")
    public Matricula guardar (Matricula matricula) {
        serviceMatriculas.guardar(matricula);
        return matricula;
    }

    @PutMapping("/matriculas")
    public Matricula modificar (Matricula matricula) {
        serviceMatriculas.guardar(matricula);
        return matricula;
    }

    @DeleteMapping("/matriculas")
    public String eliminar (Integer idMatricula) {
        serviceMatriculas.eliminar(idMatricula);
        return "Registro Matricula Eliminado";
    }
}
