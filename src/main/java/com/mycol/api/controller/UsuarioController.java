package com.mycol.api.controller;

import com.mycol.api.entity.Usuario;
import com.mycol.api.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT})
@RequestMapping("/api")
public class UsuarioController {

    @Autowired
    private IUsuarioService serviceUsuarios;

    @GetMapping("/usuarios")
    public List<Usuario> buscarTodos() {
        return serviceUsuarios.buscarTodos();
    }

    @GetMapping("/usuarios/search/{id}")
    public Usuario buscarPorId (@PathVariable("id") int idUsuario) {
        return serviceUsuarios.buscarPorId(idUsuario);
    }

    @GetMapping("/usuarios/searchRut/{rut}")
    public Usuario buscarPorRut (@PathVariable("rut") String rutUsuario) {
        return serviceUsuarios.buscarPorRut(rutUsuario);
    }

    @PostMapping("/usuarios")
    public Usuario guardar (@RequestBody Usuario usuario) {
        return serviceUsuarios.guardar(usuario);
    }

    @PutMapping("/usuarios")
    public Usuario modificar (@RequestBody Usuario usuario) {
        return serviceUsuarios.guardar(usuario);
    }

    @DeleteMapping("/usuarios/{id}")
    public String eliminar (@PathVariable("id") int idUsuario) {
        serviceUsuarios.eliminar(idUsuario);
        return "Registro Usuario Eliminado";
    }
}
