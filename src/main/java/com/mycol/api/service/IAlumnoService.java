package com.mycol.api.service;

import com.mycol.api.entity.Alumno;

import java.util.List;

public interface IAlumnoService {
    List<Alumno> buscarTodos();
    Alumno guardar (Alumno alumno);
    void eliminar (Integer idAlumno);
}
