package com.mycol.api.service;

import com.mycol.api.entity.Estado;

import java.util.List;

public interface IEstadoService {
    List<Estado> buscarTodos();
    Estado guardar (Estado estado);
    void eliminar (Integer idEstado);
}
