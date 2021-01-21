package com.mycol.api.controller;

import com.mycol.api.entity.AnioAcademico;
import com.mycol.api.entity.Matricula;
import com.mycol.api.service.IAnioAcademicoService;
import com.mycol.api.service.IMatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
@RequestMapping("/api")
public class AnioAcademicoController {

    @Autowired
    private IAnioAcademicoService serviceAnioAcademico;

    @Autowired
    private IMatriculaService serviceMatriculas;

    @GetMapping("/anioAcademico")
    public List<AnioAcademico> buscarTodos() { return serviceAnioAcademico.buscarTodos(); }

    @GetMapping("/anioAcademico/search/{id}")
    public AnioAcademico buscarPorId (@PathVariable("id") int idAnioAcademico) {
        return serviceAnioAcademico.buscarPorId(idAnioAcademico);
    }

    @GetMapping("/anioAcademico/searchEstado/{id}")
    public AnioAcademico buscarPorEstado (@PathVariable("id") int idEstado) {
        return serviceAnioAcademico.buscarPorEstado(idEstado);
    }

    @PostMapping("/anioAcademico")
    public AnioAcademico guardar (@RequestBody AnioAcademico anioAcademico) {
        serviceAnioAcademico.guardar(anioAcademico);
        return anioAcademico;
    }

    @PutMapping("/anioAcademico")
    public AnioAcademico modificar (@RequestBody AnioAcademico anioAcademico) {
        serviceAnioAcademico.guardar(anioAcademico);
        return anioAcademico;
    }

    @DeleteMapping("/anioAcademico/{id}")
    public String eliminar (@PathVariable("id") Integer idAnioAcademico) {
        serviceAnioAcademico.eliminar(idAnioAcademico);
        return "Registro AnioAcademico Eliminado";
    }
}
