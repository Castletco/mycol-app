package com.mycol.api.repository;

import com.mycol.api.entity.AnioAcademico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnioAcademicoRepository extends JpaRepository<AnioAcademico, Integer> {
    AnioAcademico findByEstado (int idEstado);
}
