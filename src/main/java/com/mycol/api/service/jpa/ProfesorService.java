package com.mycol.api.service.jpa;

import com.mycol.api.entity.Profesor;
import com.mycol.api.repository.ProfesorRepository;
import com.mycol.api.service.IProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfesorService implements IProfesorService {

    @Autowired
    private ProfesorRepository repoProfesores;

    @Override
    public List<Profesor> buscarTodos() {
        return repoProfesores.findAll();
    }

    @Override
    public Profesor guardar(Profesor profesor) {
        return repoProfesores.save(profesor);
    }

    @Override
    public Profesor buscarPorNombre(String nombre) {
        return null;
    }

    @Override
    public void eliminar(Integer idProfesor) {
        repoProfesores.deleteById(idProfesor);
    }
}
