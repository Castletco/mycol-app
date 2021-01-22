package com.mycol.api.service.jpa;

import com.mycol.api.entity.AnioAcademico;
import com.mycol.api.entity.Estado;
import com.mycol.api.repository.AnioAcademicoRepository;
import com.mycol.api.repository.EstadoRepository;
import com.mycol.api.service.IAnioAcademicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnioAcademicoService implements IAnioAcademicoService {

    @Autowired
    private AnioAcademicoRepository repoAnioAcademico;

    @Autowired
    private EstadoRepository repoEstados;

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
    public List<AnioAcademico> buscarPorEstado(int idEstado) {
        Optional<Estado> optional = repoEstados.findById(idEstado);
        if (optional.isPresent()) {
            return repoAnioAcademico.findByEstado(optional.get());
        }
        return null;
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
