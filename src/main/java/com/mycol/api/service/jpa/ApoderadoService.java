package com.mycol.api.service.jpa;

import com.mycol.api.entity.Apoderado;
import com.mycol.api.repository.ApoderadoRepository;
import com.mycol.api.service.IApoderadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ApoderadoService implements IApoderadoService {

    @Autowired
    private ApoderadoRepository repoApoderados;

    @Override
    public List<Apoderado> buscarTodos() {
        return repoApoderados.findAll();
    }

    @Override
    public Apoderado guardar(Apoderado apoderado) {
        return repoApoderados.save(apoderado);
    }

    @Override
    public Apoderado buscarPorId(Integer idApoderado) {
        Optional<Apoderado> optional = repoApoderados.findById(idApoderado);
        if (optional.isPresent()) {
            return optional.get();
        }
        return null;
    }

    @Override
    public void eliminar(Integer idApoderado) {
        repoApoderados.deleteById(idApoderado);
    }
}
