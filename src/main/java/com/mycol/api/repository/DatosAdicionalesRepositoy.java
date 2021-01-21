package com.mycol.api.repository;

import com.mycol.api.entity.DatosAdicionales;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DatosAdicionalesRepositoy extends JpaRepository<DatosAdicionales, Integer> {
    DatosAdicionales findByAlumno (int idAlumno);
}
