package com.mycol.api.service;

import com.mycol.api.entity.Rol;

import java.util.List;

public interface IRolService {
    List<Rol> buscarTodos();
    Rol buscarPorId (int idRol);
    Rol guardar (Rol rol);
    void eliminar (Integer idRol);
}
