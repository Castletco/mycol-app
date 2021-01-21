package com.mycol.api.repository;

import com.mycol.api.entity.DatosFamiliares;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DatosFamiliaresRepositoy extends JpaRepository<DatosFamiliares, Integer> {
    DatosFamiliares findByAlumno (int idAlumno);
}
