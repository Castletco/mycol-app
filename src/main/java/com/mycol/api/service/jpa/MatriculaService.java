package com.mycol.api.service.jpa;

import com.mycol.api.entity.Matricula;
import com.mycol.api.repository.MatriculaRepository;
import com.mycol.api.service.IMatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatriculaService implements IMatriculaService {

    @Autowired
    private MatriculaRepository repoMatriculas;

    @Override
    public List<Matricula> buscarTodas() {
        return repoMatriculas.findAll();
    }

    @Override
    public Matricula guardar(Matricula matricula) {
        return repoMatriculas.save(matricula);
    }

    @Override
    public void eliminar(Integer idMatricula) {
        repoMatriculas.deleteById(idMatricula);
    }
}
