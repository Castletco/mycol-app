package com.mycol.api.service.jpa;

import com.mycol.api.entity.Rol;
import com.mycol.api.repository.RolRepository;
import com.mycol.api.service.IRolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RolService implements IRolService {

    @Autowired
    private RolRepository repoRoles;

    @Override
    public List<Rol> buscarTodos() {
        return repoRoles.findAll();
    }

    @Override
    public Rol buscarPorId(int idRol) {
        Optional<Rol> optional = repoRoles.findById(idRol);
        if (optional.isPresent()) {
            return optional.get();
        }
        return null;
    }

    @Override
    public Rol guardar(Rol rol) {
        return repoRoles.save(rol);
    }

    @Override
    public void eliminar(Integer idRol) {
        repoRoles.deleteById(idRol);
    }
}
