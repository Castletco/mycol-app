package com.mycol.api.controller;

import com.mycol.api.entity.FirmaMatricula;
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
    public Matricula guardar (@RequestBody Matricula matricula) {
        serviceMatriculas.guardar(matricula);
        return matricula;
    }

    @PutMapping("/matriculas")
    public Matricula modificar (@RequestBody Matricula matricula) {
        serviceMatriculas.guardar(matricula);
        return matricula;
    }

    @DeleteMapping("/matriculas/{id}")
    public String eliminar (@PathVariable("id") int idMatricula) {
        serviceMatriculas.eliminar(idMatricula);
        return "Registro Matricula Eliminado";
    }
}
