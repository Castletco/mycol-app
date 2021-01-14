package com.mycol.api.controller;

import com.mycol.api.entity.DatosFamiliares;
import com.mycol.api.service.IDatosFamiliaresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
@RequestMapping("/api")
public class DatosFamiliaresController {

    @Autowired
    private IDatosFamiliaresService serviceDatosFamiliares;

    @GetMapping("/datosFamiliares")
    public List<DatosFamiliares> buscarTodos() { return serviceDatosFamiliares.buscarTodos(); }

    @PostMapping("/datosFamiliares")
    public DatosFamiliares guardar (@RequestBody DatosFamiliares datosFamiliares) {
        serviceDatosFamiliares.guardar(datosFamiliares);
        return datosFamiliares;
    }

    @PutMapping("/datosFamiliares")
    public DatosFamiliares modificar (@RequestBody DatosFamiliares datosFamiliares) {
        serviceDatosFamiliares.guardar(datosFamiliares);
        return datosFamiliares;
    }

    @DeleteMapping("/datosFamiliares/{id}")
    public String eliminar (@PathVariable("id") Integer idDatosFamiliares) {
        serviceDatosFamiliares.eliminar(idDatosFamiliares);
        return "Registro Datos Familiares Eliminado";
    }
}
