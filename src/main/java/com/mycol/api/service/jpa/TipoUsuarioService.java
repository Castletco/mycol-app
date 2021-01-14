package com.mycol.api.service.jpa;

import com.mycol.api.entity.TipoUsuario;
import com.mycol.api.repository.TipoUsuarioRepository;
import com.mycol.api.service.ITipoUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoUsuarioService implements ITipoUsuarioService {

    @Autowired
    private TipoUsuarioRepository repoTipoUsuario;

    @Override
    public List<TipoUsuario> buscarTodos() {
        return repoTipoUsuario.findAll();
    }

    @Override
    public TipoUsuario guardar(TipoUsuario tipoUsuario) {
        return repoTipoUsuario.save(tipoUsuario);
    }

    @Override
    public void eliminar(Integer idTipoUsuario) {
        repoTipoUsuario.deleteById(idTipoUsuario);
    }
}
