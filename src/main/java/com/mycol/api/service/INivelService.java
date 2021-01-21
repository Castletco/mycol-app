package com.mycol.api.service;

import com.mycol.api.entity.Nivel;

import java.util.List;

public interface INivelService {
    List<Nivel> buscarTodos();
    Nivel buscarPorId (int idNivel);
    Nivel guardar (Nivel nivel);
    void eliminar (Integer idNivel);
}
