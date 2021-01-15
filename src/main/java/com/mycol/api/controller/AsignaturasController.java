package com.mycol.api.controller;

import com.mycol.api.entity.Asignatura;
import com.mycol.api.service.IAsignaturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin (origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
@RequestMapping("/asignaturas")
public class AsignaturasController {

    @Autowired
    private IAsignaturaService serviceAsignaturas;

    @GetMapping("/index")
    public List<Asignatura> bustarTodas() {
        return serviceAsignaturas.buscarTodos();
    }

    @PostMapping("/save")
    public Asignatura guardar (@RequestBody Asignatura asignatura) {
        serviceAsignaturas.guardar(asignatura);
        return asignatura;
    }

    @PutMapping("/update")
    public Asignatura modificar (@RequestBody Asignatura asignatura){
        serviceAsignaturas.guardar(asignatura);
        return asignatura;
    }

    @DeleteMapping("/delete/{id}")
    public String eliminar (@PathVariable("id") Integer idAsignatura) {
        serviceAsignaturas.eliminar(idAsignatura);
        return "Registro Asignaturas Eliminado";
    }
}
