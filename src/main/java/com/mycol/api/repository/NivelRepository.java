package com.mycol.api.repository;

import com.mycol.api.entity.Nivel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NivelRepository extends JpaRepository<Nivel, Integer> {
    Nivel findByNombreNivel (String nivel);
}
