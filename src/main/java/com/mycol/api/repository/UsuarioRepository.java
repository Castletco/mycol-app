package com.mycol.api.repository;

import com.mycol.api.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    Usuario findByUsername (String username);
    Usuario findByRut (Integer rutUsuario);
}
