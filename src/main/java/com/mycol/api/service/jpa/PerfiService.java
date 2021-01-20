package com.mycol.api.service.jpa;

import com.mycol.api.entity.Perfil;
import com.mycol.api.repository.PerfilRepository;
import com.mycol.api.service.IPerfilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PerfiService implements IPerfilService {

    @Autowired
    private PerfilRepository repoPerfiles;

    @Override
    public List<Perfil> buscarTodos() {
        return repoPerfiles.findAll();
    }

    @Override
    public Perfil buscarPorId(int idPerfil) {
        Optional<Perfil> optional = repoPerfiles.findById(idPerfil);
        if (optional.isPresent()){
            return optional.get();
        }
        return null;
    }

    @Override
    public Perfil guardar(Perfil perfil) {
        return repoPerfiles.save(perfil);
    }

    @Override
    public void eliminar(Integer idPerfil) {
        repoPerfiles.deleteById(idPerfil);
    }
}
