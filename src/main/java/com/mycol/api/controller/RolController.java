package com.mycol.api.controller;

import com.mycol.api.entity.Rol;
import com.mycol.api.service.IRolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT})
@RequestMapping("/api")
public class RolController {

    @Autowired
    private IRolService serviceRoles;

    @GetMapping("/roles")
    public List<Rol> buscarTodos() {
        return serviceRoles.buscarTodos();
    }

    @GetMapping("/roles/edit/{id}")
    public Rol editar (@PathVariable("id") int idRol) {
        return serviceRoles.buscarPorId(idRol);
    }

    @PostMapping("/roles")
    public Rol guardar (@RequestBody Rol rol) {
        return serviceRoles.guardar(rol);
    }

    @PutMapping("/roles")
    public Rol modificar (@RequestBody Rol rol) {
        return serviceRoles.guardar(rol);
    }

    @DeleteMapping("/roles/{id}")
    public String eliminar (@PathVariable("id") int idRol) {
        serviceRoles.eliminar(idRol);
        return "Registro Rol Eliminado";
    }
}
