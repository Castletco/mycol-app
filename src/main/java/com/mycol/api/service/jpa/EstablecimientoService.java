package com.mycol.api.service.jpa;

import com.mycol.api.entity.Establecimiento;
import com.mycol.api.repository.EstablecimientoRepository;
import com.mycol.api.service.IEstablecimientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstablecimientoService implements IEstablecimientoService {

    @Autowired
    private EstablecimientoRepository repoEstablecimientos;

    @Override
    public List<Establecimiento> buscarTodos() {
        return repoEstablecimientos.findAll();
    }

    @Override
    public Establecimiento guardar(Establecimiento establecimiento) {
        return repoEstablecimientos.save(establecimiento);
    }

    @Override
    public Establecimiento buscarPorId(Integer idEstablecimiento) {
        Optional<Establecimiento> optional = repoEstablecimientos.findById(idEstablecimiento);
        if (optional.isPresent()){
            return optional.get();
        }
        return null;
    }

    @Override
    public void eliminar(Integer idEstablecimiento) {
        repoEstablecimientos.deleteById(idEstablecimiento);
    }
}
