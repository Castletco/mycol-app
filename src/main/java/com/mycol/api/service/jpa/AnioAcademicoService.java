package com.mycol.api.service.jpa;

import com.mycol.api.entity.AnioAcademico;
import com.mycol.api.repository.AnioAcademicoRepository;
import com.mycol.api.service.IAnioAcademicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnioAcademicoService implements IAnioAcademicoService {

    @Autowired
    private AnioAcademicoRepository repoAnioAcademico;

    @Override
    public List<AnioAcademico> buscarTodos() {
        return repoAnioAcademico.findAll();
    }

    @Override
    public AnioAcademico guardar(AnioAcademico anioAcademico) {
        return repoAnioAcademico.save(anioAcademico);
    }

    @Override
    public void eliminar(Integer idAnioAcademico) {
        repoAnioAcademico.deleteById(idAnioAcademico);
    }
}
