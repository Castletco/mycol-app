package com.mycol.api.service.jpa;

import com.mycol.api.entity.Usuario;
import com.mycol.api.repository.UsuarioRepository;
import com.mycol.api.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService implements IUsuarioService {

    @Autowired
    private UsuarioRepository repoUsuarios;

    @Override
    public List<Usuario> buscarTodos() {
        return repoUsuarios.findAll();
    }

    @Override
    public Usuario guardar(Usuario usuario) {
        return repoUsuarios.save(usuario);
    }

    @Override
    public Usuario buscarPorId(Integer idUsuario) {
        Optional<Usuario> optional = repoUsuarios.findById(idUsuario);
        if (optional.isPresent()) {
            return optional.get();
        }
        return null;
    }

    @Override
    public Usuario buscarPorRut(Integer rutUsuario) {
        return repoUsuarios.findByRut(rutUsuario);
    }

    @Override
    public Usuario buscarPorNombre(String username) {
        return repoUsuarios.findByUsername(username);
    }

    @Override
    public void eliminar(Integer idUsuario) {
        repoUsuarios.deleteById(idUsuario);
    }
}
