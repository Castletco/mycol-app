package com.mycol.api.service;

import com.mycol.api.entity.AnioAcademico;
import org.springframework.data.domain.Example;

import java.util.List;

public interface IAnioAcademicoService {

    List<AnioAcademico> buscarTodos();
    AnioAcademico buscarPorId (int idAnioAcademico);
    List<AnioAcademico> buscarPorEstado (int idEstado);
    AnioAcademico guardar (AnioAcademico anioAcademico);
    void eliminar (Integer idAnioAcademico);
}
