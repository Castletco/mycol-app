package com.mycol.api.controller;

import com.mycol.api.entity.Matricula;
import com.mycol.api.service.IMatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
@RequestMapping("/matriculas")
public class MatriculaController {

    @Autowired
    private IMatriculaService serviceMatriculas;

    @GetMapping("/index")
    public List<Matricula> buscarTodas() { return serviceMatriculas.buscarTodas(); }

    @PostMapping("/save")
    public Matricula guardar (Matricula matricula) {
        serviceMatriculas.guardar(matricula);
        return matricula;
    }

    @PutMapping("/update")
    public Matricula modificar (Matricula matricula) {
        serviceMatriculas.guardar(matricula);
        return matricula;
    }

    @DeleteMapping("/delete")
    public String eliminar (Integer idMatricula) {
        serviceMatriculas.eliminar(idMatricula);
        return "Registro Matricula Eliminado";
    }
}
