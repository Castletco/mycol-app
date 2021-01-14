package com.mycol.api.service.jpa;

import com.mycol.api.entity.Nacionalidad;
import com.mycol.api.repository.NacionalidadRepository;
import com.mycol.api.service.INacionalidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NacionalidadService implements INacionalidadService {

    @Autowired
    private NacionalidadRepository repoNacionalidad;

    @Override
    public List<Nacionalidad> buscarTodas() {
        return repoNacionalidad.findAll();
    }

    @Override
    public Nacionalidad guardar(Nacionalidad nacionalidad) {
        return repoNacionalidad.save(nacionalidad);
    }

    @Override
    public void eliminar(Integer idNacionalidad) {
        repoNacionalidad.deleteById(idNacionalidad);
    }
}
