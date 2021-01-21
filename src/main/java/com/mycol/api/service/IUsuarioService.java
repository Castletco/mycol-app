package com.mycol.api.service;

import com.mycol.api.entity.Usuario;

import java.util.List;

public interface IUsuarioService {
    List<Usuario> buscarTodos();
    Usuario guardar (Usuario usuario);
    Usuario buscarPorId (Integer idUsuario);
    Usuario buscarPorRut (Integer rutUsuario);
    Usuario buscarPorNombre (String username);
    void eliminar (Integer idUsuario);
}
