package com.mycol.api.controller;

import com.mycol.api.entity.DatosAdicionales;
import com.mycol.api.service.IDatosAdicionalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT})
@RequestMapping("/api")
public class DatosAdicionalesController {

    @Autowired
    private IDatosAdicionalesService serviceDatosAdicionales;

    @GetMapping("/datosAdicionales")
    public List<DatosAdicionales> buscarTodos() {
        return serviceDatosAdicionales.buscarTodos();
    }

    @GetMapping("/datosAdicionales/search/{id}")
    public DatosAdicionales buscarPorId (@PathVariable("id") int idDatosAdicionales) {
        return serviceDatosAdicionales.buscarPorId(idDatosAdicionales);
    }

    @GetMapping("/datosAdicionales/searchAlumno/{id}")
    public DatosAdicionales buscarPorIdAlumno (@PathVariable("id") int idAlumno) {
        return serviceDatosAdicionales.buscarPorIdAlumno(idAlumno);
    }

    @PostMapping("/datosAdicionales")
    public DatosAdicionales guardar (DatosAdicionales datosAdicionales) {
        return serviceDatosAdicionales.guardar(datosAdicionales);
    }

    @PutMapping("/datosAdicionales")
    public DatosAdicionales modificar (DatosAdicionales datosAdicionales) {
        return serviceDatosAdicionales.guardar(datosAdicionales);
    }

    @DeleteMapping("/datosAdicionales/{id}")
    public String eliminar (@PathVariable("id") int idDatosAdicionales) {
        serviceDatosAdicionales.eliminar(idDatosAdicionales);
        return "Registro Datos Adicionales Eliminado";
    }
}
