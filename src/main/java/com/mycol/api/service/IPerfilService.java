package com.mycol.api.service;

import com.mycol.api.entity.Perfil;

import java.util.List;

public interface IPerfilService {
    List<Perfil> buscarTodos();
    Perfil guardar (Perfil perfil);
    void eliminar (Integer idPerfil);
}
