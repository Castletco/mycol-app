package com.mycol.api.service.jpa;

import com.mycol.api.entity.Nivel;
import com.mycol.api.repository.NivelRepository;
import com.mycol.api.service.INivelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NivelService implements INivelService {

    @Autowired
    private NivelRepository repoNiveles;

    @Override
    public List<Nivel> buscarTodos() {
        return repoNiveles.findAll();
    }

    @Override
    public Nivel guardar(Nivel nivel) {
        return repoNiveles.save(nivel);
    }

    @Override
    public void eliminar(Integer idNivel) {
        repoNiveles.deleteById(idNivel);
    }
}
