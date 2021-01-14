package com.mycol.api.service;

import com.mycol.api.entity.Matricula;

import java.util.List;

public interface IMatriculaService {
    List<Matricula> buscarTodas();
    Matricula guardar (Matricula matricula);
    void eliminar (Integer idMatricula);
}
