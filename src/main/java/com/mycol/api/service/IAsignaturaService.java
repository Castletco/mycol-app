package com.mycol.api.service;

import com.mycol.api.entity.Asignatura;

import java.util.List;

public interface IAsignaturaService {
    List<Asignatura> buscarTodos();
    Asignatura guardar (Asignatura asignatura);
    void eliminar (Integer idAsignatura);
}
