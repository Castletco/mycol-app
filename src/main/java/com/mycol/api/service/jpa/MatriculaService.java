package com.mycol.api.service.jpa;

import com.mycol.api.entity.AnioAcademico;
import com.mycol.api.entity.Matricula;
import com.mycol.api.repository.AnioAcademicoRepository;
import com.mycol.api.repository.MatriculaRepository;
import com.mycol.api.service.IAnioAcademicoService;
import com.mycol.api.service.IMatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MatriculaService implements IMatriculaService {

    @Autowired
    private MatriculaRepository repoMatriculas;

    @Autowired
    private AnioAcademicoRepository repoAnioAcademico;

    @Override
    public List<Matricula> buscarTodas() {
        return repoMatriculas.findAll();
    }

    @Override
    public Matricula buscarPorId(int idMatricula) {
        Optional<Matricula> optional = repoMatriculas.findById(idMatricula);
        if (optional.isPresent()) {
            return optional.get();
        }
        return null;
    }

    @Override
    public List<Matricula> buscarPorAnioAcademico(int idAnioAcademico) {
        Optional<AnioAcademico> optional = repoAnioAcademico.findById(idAnioAcademico);
        if (optional.isPresent()) {
            return repoMatriculas.findByAnioAcademico(optional.get());
        }
        return null;
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
