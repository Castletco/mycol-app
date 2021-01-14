package com.mycol.api.service;

import com.mycol.api.entity.Curso;

import java.util.List;

public interface ICursoService {
    List<Curso> buscarTodos();
    Curso guardar (Curso curso);
    void eliminar (Integer idCurso);
}
