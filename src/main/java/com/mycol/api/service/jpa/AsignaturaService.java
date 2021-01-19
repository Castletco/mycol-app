package com.mycol.api.service.jpa;

import com.mycol.api.entity.Asignatura;
import com.mycol.api.repository.AsignaturaRepository;
import com.mycol.api.service.IAsignaturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AsignaturaService implements IAsignaturaService {

    @Autowired
    private AsignaturaRepository repoAsignaturas;

    @Override
    public List<Asignatura> buscarTodos() {
        return repoAsignaturas.findAll();
    }

    @Override
    public Asignatura buscarPorId(int idAsignatura) {
        Optional<Asignatura> optional = repoAsignaturas.findById(idAsignatura);
        if (optional.isPresent()){
            return optional.get();
        }
        return null;
    }

    @Override
    public Asignatura guardar(Asignatura asignatura) {
        return repoAsignaturas.save(asignatura);
    }

    @Override
    public void eliminar(Integer idAsignatura) {
        repoAsignaturas.deleteById(idAsignatura);
    }
}
