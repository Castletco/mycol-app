package com.mycol.api.controller;

import com.mycol.api.entity.AnioAcademico;
import com.mycol.api.service.IAnioAcademicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
@RequestMapping("/anioAcademico")
public class AnioAcademicoController {

    @Autowired
    private IAnioAcademicoService serviceAnioAcademico;

    @GetMapping("/index")
    public List<AnioAcademico> buscarTodos() { return serviceAnioAcademico.buscarTodos(); }

    @PostMapping("/save")
    public AnioAcademico guardar (@RequestBody AnioAcademico anioAcademico) {
        serviceAnioAcademico.guardar(anioAcademico);
        return anioAcademico;
    }

    @PutMapping("/update")
    public AnioAcademico modificar (AnioAcademico anioAcademico) {
        serviceAnioAcademico.guardar(anioAcademico);
        return anioAcademico;
    }

    @DeleteMapping("/delete/{id}")
    public String eliminar (@PathVariable("id") Integer idAnioAcademico) {
        serviceAnioAcademico.eliminar(idAnioAcademico);
        return "Registro AnioAcademico Eliminado";
    }
}
