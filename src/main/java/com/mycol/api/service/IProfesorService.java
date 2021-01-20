package com.mycol.api.service;

import com.mycol.api.entity.Profesor;

import java.util.List;

public interface IProfesorService {
    List<Profesor> buscarTodos();
    Profesor guardar (Profesor profesor);
    Profesor buscarPorId (int idProfesor);
    Profesor buscarPorNombre(String nombre);
    void eliminar (Integer idProfesor);
}
