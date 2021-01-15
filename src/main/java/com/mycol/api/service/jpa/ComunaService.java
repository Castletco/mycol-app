package com.mycol.api.service.jpa;

import com.mycol.api.entity.Comuna;
import com.mycol.api.repository.ComunaRepository;
import com.mycol.api.service.IComunaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ComunaService implements IComunaService {

    @Autowired
    private ComunaRepository repoComunas;

    @Override
    public List<Comuna> buscarTodas() {
        return repoComunas.findAll();
    }

    @Override
    public Comuna guardar(Comuna comuna) {
        return repoComunas.save(comuna);
    }

    @Override
    public Comuna buscarPorComuna(String nombreComuna) {
        return repoComunas.findByComuna(nombreComuna);
    }

    @Override
    public void eliminar(Integer idComuna) {
        repoComunas.deleteById(idComuna);
    }
}
