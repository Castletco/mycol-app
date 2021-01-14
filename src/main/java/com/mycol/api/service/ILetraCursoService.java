package com.mycol.api.service;

import com.mycol.api.entity.LetraCurso;

import java.util.List;

public interface ILetraCursoService {
    List<LetraCurso> buscarTodas();
    LetraCurso guardar (LetraCurso letraCurso);
    void eliminar (Integer idLetraCurso);
}
