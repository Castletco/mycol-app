package com.mycol.api.controller;

import com.mycol.api.entity.Asignatura;
import com.mycol.api.service.IAsignaturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin (origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
@RequestMapping("/api")
public class AsignaturasController {

    @Autowired
    private IAsignaturaService serviceAsignaturas;

    @GetMapping("/asignaturas")
    public List<Asignatura> buscarTodas() {
        return serviceAsignaturas.buscarTodos();
    }

    @GetMapping("/asignaturas/edit/{id}")
    public Asignatura editar (@PathVariable("id") int idAsignatura) {
        return serviceAsignaturas.buscarPorId(idAsignatura);
    }

    @PostMapping("/asignaturas")
    public Asignatura guardar (@RequestBody Asignatura asignatura) {
        serviceAsignaturas.guardar(asignatura);
        return asignatura;
    }

    @PutMapping("/asignaturas")
    public Asignatura modificar (@RequestBody Asignatura asignatura){
        serviceAsignaturas.guardar(asignatura);
        return asignatura;
    }

    @DeleteMapping("/asignaturas/{id}")
    public String eliminar (@PathVariable("id") Integer idAsignatura) {
        serviceAsignaturas.eliminar(idAsignatura);
        return "Registro Asignaturas Eliminado";
    }
}
