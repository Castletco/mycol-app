package com.mycol.api.service;

import com.mycol.api.entity.Matricula;
import org.springframework.data.domain.Example;

import java.util.List;

public interface IMatriculaService {
    List<Matricula> buscarTodas();
    Matricula buscarPorId(int idMatricula);
    List<Matricula> buscarPorAnioAcademico (int idAnioAcademico);
    Matricula guardar (Matricula matricula);
    void eliminar (Integer idMatricula);
}
