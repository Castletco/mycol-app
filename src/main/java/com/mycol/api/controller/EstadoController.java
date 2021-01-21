package com.mycol.api.controller;

import com.mycol.api.entity.Estado;
import com.mycol.api.service.IEstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT})
@RequestMapping("/api")
public class EstadoController {

    @Autowired
    private IEstadoService serviceEstados;

    @GetMapping("/estados")
    public List<Estado> buscarTodos() {
        return serviceEstados.buscarTodos();
    }

    @GetMapping("/estados/edit({id}")
    public Estado editar (@PathVariable("id") int idEstado) {
        return serviceEstados.buscarPorId(idEstado);
    }

    @PostMapping("/estados")
    public Estado guardar (@RequestBody Estado estado) {
        return serviceEstados.guardar(estado);
    }

    @PutMapping("/estados")
    public Estado modificar (@RequestBody Estado estado) {
        return serviceEstados.guardar(estado);
    }

    @DeleteMapping("/estados/{id}")
    public String eliminar (@PathVariable("id") int idEstado) {
        serviceEstados.eliminar(idEstado);
        return "Registro Estado Eliminado";
    }
}
