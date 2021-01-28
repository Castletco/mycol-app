package com.mycol.api.repository;

import com.mycol.api.entity.AnioAcademico;
import com.mycol.api.entity.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MatriculaRepository extends JpaRepository<Matricula, Integer> {
    List<Matricula> findByAnioAcademicoAndEstado (AnioAcademico anioAcademico, int idEstado);
}
