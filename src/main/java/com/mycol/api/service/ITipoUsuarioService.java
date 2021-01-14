package com.mycol.api.service;

import com.mycol.api.entity.TipoUsuario;

import java.util.List;

public interface ITipoUsuarioService {
    List<TipoUsuario> buscarTodos();
    TipoUsuario guardar (TipoUsuario tipoUsuario);
    void eliminar (Integer idTipoUsuario);
}
