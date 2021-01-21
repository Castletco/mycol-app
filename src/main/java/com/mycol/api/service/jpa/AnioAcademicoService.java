package com.mycol.api.service.jpa;

import com.mycol.api.entity.AnioAcademico;
import com.mycol.api.repository.AnioAcademicoRepository;
import com.mycol.api.service.IAnioAcademicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnioAcademicoService implements IAnioAcademicoService {

    @Autowired
    private AnioAcademicoRepository repoAnioAcademico;

    @Override
    public List<AnioAcademico> buscarTodos() {
        return repoAnioAcademico.findAll();
    }

    @Override
    public AnioAcademico buscarPorId(int idAnioAcademico) {
        Optional<AnioAcademico> optional = repoAnioAcademico.findById(idAnioAcademico);
        if (optional.isPresent()) {
            return optional.get();
        }
        return null;
    }

    @Override
    public AnioAcademico buscarPorEstado(int idEstado) {
        return repoAnioAcademico.findByEstado(idEstado);
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
