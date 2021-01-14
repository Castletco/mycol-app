package com.mycol.api.service.jpa;

import com.mycol.api.entity.Estado;
import com.mycol.api.repository.EstadoRepository;
import com.mycol.api.service.IEstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstadoService implements IEstadoService {

    @Autowired
    private EstadoRepository repoEstados;

    @Override
    public List<Estado> buscarTodos() {
        return repoEstados.findAll();
    }

    @Override
    public Estado guardar(Estado estado) {
        return repoEstados.save(estado);
    }

    @Override
    public void eliminar(Integer idEstado) {
        repoEstados.deleteById(idEstado);
    }
}
