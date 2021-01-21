package com.mycol.api.controller;

import com.mycol.api.entity.Nivel;
import com.mycol.api.service.INivelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT})
@RequestMapping("/api")
public class NivelController {

    @Autowired
    private INivelService serviceNiveles;

    @GetMapping("/niveles")
    public List<Nivel> buscarTodos() {
        return serviceNiveles.buscarTodos();
    }

    @GetMapping("/niveles/search/{id}")
    public Nivel buscarPorId (@PathVariable("id") int idNivel) {
        return serviceNiveles.buscarPorId(idNivel);
    }

    @PostMapping("/niveles")
    public Nivel guardar (@RequestBody Nivel nivel) {
        return serviceNiveles.guardar(nivel);
    }

    @PutMapping("/niveles")
    public Nivel modificar (@RequestBody Nivel nivel) {
        return serviceNiveles.guardar(nivel);
    }

    @DeleteMapping("/niveles/{id}")
    public String eliminar (@PathVariable("id") int idNivel) {
        serviceNiveles.eliminar(idNivel);
        return "Registro Nivel Eliminado";
    }
}
