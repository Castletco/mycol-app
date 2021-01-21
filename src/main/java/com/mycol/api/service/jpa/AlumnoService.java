package com.mycol.api.service.jpa;

import com.mycol.api.entity.Alumno;
import com.mycol.api.repository.AlumnoRepository;
import com.mycol.api.service.IAlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlumnoService implements IAlumnoService {

    @Autowired
    private AlumnoRepository repoAlumnos;

    @Override
    public List<Alumno> buscarTodos() {
        return repoAlumnos.findAll();
    }

    @Override
    public Alumno buscarPorId(int idAlummo) {
        Optional<Alumno> optional = repoAlumnos.findById(idAlummo);
        if (optional.isPresent()) {
            return optional.get();
        }
        return null;
    }

    @Override
    public Alumno guardar(Alumno alumno) {
        return repoAlumnos.save(alumno);
    }

    @Override
    public void eliminar(int idAlumno) {
        repoAlumnos.deleteById(idAlumno);
    }
}
