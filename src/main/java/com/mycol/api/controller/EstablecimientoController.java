package com.mycol.api.controller;

import com.mycol.api.entity.Establecimiento;
import com.mycol.api.service.IEstablecimientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
@RequestMapping("/api")
public class EstablecimientoController {

    @Autowired
    private IEstablecimientoService serviceEstablecimientos;

    @GetMapping("/establecimientos")
    public List<Establecimiento> buscarTodos() { return serviceEstablecimientos.buscarTodos(); }

    @PostMapping("/establecimientos")
    public Establecimiento guardar (Establecimiento establecimiento) {
        serviceEstablecimientos.guardar(establecimiento);
        return establecimiento;
    }

    @PutMapping("/establecimientos")
    public Establecimiento modificar (Establecimiento establecimiento) {
        serviceEstablecimientos.guardar(establecimiento);
        return establecimiento;
    }

    @DeleteMapping("/establecimientos/{id}")
    public String eliminar (@PathVariable("id") Integer idEstablecimiento) {
        serviceEstablecimientos.eliminar(idEstablecimiento);
        return "Registro Establecimiento Eliminado";
    }
}
