package com.mycol.api.repository;

import com.mycol.api.entity.Comuna;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComunaRepository extends JpaRepository<Comuna, Integer> {
    Comuna findByName(String name);
}
