package com.mycol.api.service.jpa;

import com.mycol.api.entity.Curso;
import com.mycol.api.repository.CursoRepository;
import com.mycol.api.service.ICursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CursoService implements ICursoService {

    @Autowired
    private CursoRepository repoCursos;

    @Override
    public List<Curso> buscarTodos() {
        return repoCursos.findAll();
    }

    @Override
    public Curso buscarPorId(int idCurso) {
        Optional<Curso> optional = repoCursos.findById(idCurso);
        if (optional.isPresent()) {
            return optional.get();
        }
        return null;
    }

    @Override
    public Curso guardar(Curso curso) {
        return repoCursos.save(curso);
    }

    @Override
    public void eliminar(int idCurso) {
        repoCursos.deleteById(idCurso);
    }
}
