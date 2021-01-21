package com.mycol.api.controller;

import com.mycol.api.entity.DatosFamiliares;
import com.mycol.api.service.IDatosFamiliaresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT})
@RequestMapping("/api")
public class DatosFamiliaresController {

    @Autowired
    private IDatosFamiliaresService serviceDatosAdicionales;

    @GetMapping("/datosAdicionales")
    public List<DatosFamiliares> buscarTodos() {
        return serviceDatosAdicionales.buscarTodos();
    }

    @GetMapping("/datosAdicionales/search/{id}")
    public DatosFamiliares buscarPorId (@PathVariable("id") int idDatosAdicionales) {
        return serviceDatosAdicionales.buscarPorId(idDatosAdicionales);
    }

    @GetMapping("/datosAdicionales/searchAlumno/{id}")
    public DatosFamiliares buscarPorIdAlumno (@PathVariable("id") int idAlumno) {
        return serviceDatosAdicionales.buscarPorIdAlumno(idAlumno);
    }

    @PostMapping("/datosAdicionales")
    public DatosFamiliares guardar (DatosFamiliares datosFamiliares) {
        return serviceDatosAdicionales.guardar(datosFamiliares);
    }

    @PutMapping("/datosAdicionales")
    public DatosFamiliares modificar (DatosFamiliares datosFamiliares) {
        return serviceDatosAdicionales.guardar(datosFamiliares);
    }

    @DeleteMapping("/datosAdicionales/{id}")
    public String eliminar (@PathVariable("id") int idDatosAdicionales) {
        serviceDatosAdicionales.eliminar(idDatosAdicionales);
        return "Registro Datos Adicionales Eliminado";
    }
}
