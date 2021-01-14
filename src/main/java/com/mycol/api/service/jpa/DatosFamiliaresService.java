package com.mycol.api.service.jpa;

import com.mycol.api.entity.DatosFamiliares;
import com.mycol.api.repository.DatosFamiliaresRepository;
import com.mycol.api.service.IDatosFamiliaresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DatosFamiliaresService implements IDatosFamiliaresService {

    @Autowired
    private DatosFamiliaresRepository repoDatosFamiliares;

    @Override
    public List<DatosFamiliares> buscarTodos() {
        return repoDatosFamiliares.findAll();
    }

    @Override
    public DatosFamiliares guardar(DatosFamiliares datosFamiliares) {
        return repoDatosFamiliares.save(datosFamiliares);
    }

    @Override
    public DatosFamiliares buscarPorIdUsuario(Integer idUsuario) {
        Optional<DatosFamiliares> optional = repoDatosFamiliares.findById(idUsuario);
        if (optional.isPresent()) {
            return optional.get();
        }
        return null;
    }

    @Override
    public void eliminar(Integer idUsuario) {
        repoDatosFamiliares.deleteById(idUsuario);
    }
}
