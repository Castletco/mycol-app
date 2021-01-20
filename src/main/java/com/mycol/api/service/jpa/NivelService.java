package com.mycol.api.service.jpa;

import com.mycol.api.entity.Nivel;
import com.mycol.api.repository.NivelRepository;
import com.mycol.api.service.INivelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NivelService implements INivelService {

    @Autowired
    private NivelRepository repoNiveles;

    @Override
    public List<Nivel> buscarTodos() {
        return repoNiveles.findAll();
    }

    @Override
    public Nivel buscarPorId(int idNivel) {
        Optional<Nivel> optional = repoNiveles.findById(idNivel);
        if (optional.isPresent()){
            return optional.get();
        }
        return null;
    }

    @Override
    public Nivel buscarPorNivel(String nombreNivel) {
        Nivel nivel = repoNiveles.findByNivel(nombreNivel);
        return nivel;
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
