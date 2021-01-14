package com.mycol.api.controller;

import com.mycol.api.entity.Comuna;
import com.mycol.api.service.IComunaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
@RequestMapping("/api")
public class ComunaController {

    @Autowired
    private IComunaService serviceComunas;

    @GetMapping("/comunas")
    public List<Comuna> buscarTodas() { return serviceComunas.buscarTodas(); }

    @PostMapping("/comunas")
    public Comuna guardar (@RequestBody Comuna comuna) {
        serviceComunas.guardar(comuna);
        return comuna;
    }

    @PutMapping("/comunas")
    public Comuna modificar (@RequestBody Comuna comuna) {
        serviceComunas.guardar(comuna);
        return comuna;
    }

    @DeleteMapping("/comunas/{id}")
    public String eliminar (@PathVariable("id") Integer idComuna) {
        serviceComunas.eliminar(idComuna);
        return "Registro Comuna Eliminado";
    }

}
