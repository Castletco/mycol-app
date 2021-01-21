package com.mycol.api.service;

import com.mycol.api.entity.AnioAcademico;

import java.util.List;

public interface IAnioAcademicoService {

    List<AnioAcademico> buscarTodos();
    AnioAcademico buscarPorId (int idAnioAcademico);
    AnioAcademico guardar (AnioAcademico anioAcademico);
    void eliminar (Integer idAnioAcademico);
}
