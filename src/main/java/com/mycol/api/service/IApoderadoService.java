package com.mycol.api.service;

import com.mycol.api.entity.Apoderado;

import java.util.List;

public interface IApoderadoService {
    List<Apoderado> buscarTodos ();
    Apoderado guardar (Apoderado apoderado);
    Apoderado buscarPorId (Integer idApoderado);
    void eliminar (Integer idApoderado);
}
