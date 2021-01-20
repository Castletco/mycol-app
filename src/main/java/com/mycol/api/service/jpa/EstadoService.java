package com.mycol.api.service.jpa;

import com.mycol.api.entity.Estado;
import com.mycol.api.repository.EstadoRepository;
import com.mycol.api.service.IEstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstadoService implements IEstadoService {

    @Autowired
    private EstadoRepository repoEstados;

    @Override
    public List<Estado> buscarTodos() {
        return repoEstados.findAll();
    }

    @Override
    public Estado buscarPorId(int idEstado) {
        Optional<Estado> optional = repoEstados.findById(idEstado);
        if (optional.isPresent()){
            return optional.get();
        }
        return null;
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
