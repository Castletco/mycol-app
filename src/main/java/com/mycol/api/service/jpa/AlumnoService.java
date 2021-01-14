package com.mycol.api.service.jpa;

import com.mycol.api.entity.Alumno;
import com.mycol.api.repository.AlumnoRepository;
import com.mycol.api.service.IAlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlumnoService implements IAlumnoService {

    @Autowired
    private AlumnoRepository repoAlumnos;

    @Override
    public List<Alumno> buscarTodos() {
        return repoAlumnos.findAll();
    }

    @Override
    public Alumno guardar(Alumno alumno) {
        return repoAlumnos.save(alumno);
    }

    @Override
    public void eliminar(Integer idAlumno) {
        repoAlumnos.deleteById(idAlumno);
    }
}
