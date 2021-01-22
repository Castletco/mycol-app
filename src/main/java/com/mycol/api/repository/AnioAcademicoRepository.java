package com.mycol.api.repository;

import com.mycol.api.entity.AnioAcademico;
import com.mycol.api.entity.Estado;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AnioAcademicoRepository extends JpaRepository<AnioAcademico, Integer> {
    List<AnioAcademico> findByEstado (Estado estado);
}
