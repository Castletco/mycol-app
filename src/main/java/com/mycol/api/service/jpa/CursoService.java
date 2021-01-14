package com.mycol.api.service.jpa;

import com.mycol.api.entity.Curso;
import com.mycol.api.repository.CursoRepository;
import com.mycol.api.service.ICursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService implements ICursoService {

    @Autowired
    private CursoRepository repoCursos;

    @Override
    public List<Curso> buscarTodos() {
        return repoCursos.findAll();
    }

    @Override
    public Curso guardar(Curso curso) {
        return repoCursos.save(curso);
    }

    @Override
    public void eliminar(Integer idCurso) {
        repoCursos.deleteById(idCurso);
    }
}
