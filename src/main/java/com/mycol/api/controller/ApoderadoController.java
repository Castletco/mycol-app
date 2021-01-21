package com.mycol.api.controller;

import com.mycol.api.entity.Apoderado;
import com.mycol.api.service.IApoderadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
@RequestMapping("/api")
public class ApoderadoController {

    @Autowired
    private IApoderadoService serviceApoderados;

    @GetMapping("/apoderados")
    public List<Apoderado> buscarTodos() { return serviceApoderados.buscarTodos(); }

    @GetMapping("/apoderados/search/{id}")
    public Apoderado buscarPorId(@PathVariable("id") int idApoderado) {
        return serviceApoderados.buscarPorId(idApoderado);
    }

    @PostMapping("/apoderados")
    public Apoderado guardar (@RequestBody Apoderado apoderado) {
        serviceApoderados.guardar(apoderado);
        return apoderado;
    }

    @PutMapping("/apoderados")
    public Apoderado modificar (@RequestBody Apoderado apoderado) {
        serviceApoderados.guardar(apoderado);
        return apoderado;
    }

    @DeleteMapping("/apoderados/{id}")
    public String eliminar (@PathVariable("id") Integer idApoderado) {
        serviceApoderados.eliminar(idApoderado);
        return "Registro Apoderado Eliminado";
    }
}
