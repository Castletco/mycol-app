package com.mycol.api.service.jpa;

import com.mycol.api.entity.LetraCurso;
import com.mycol.api.repository.LetraCursoRepository;
import com.mycol.api.service.ILetraCursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LetraCursoService implements ILetraCursoService {

    @Autowired
    private LetraCursoRepository repoLetraCurso;

    @Override
    public List<LetraCurso> buscarTodas() {
        return repoLetraCurso.findAll();
    }

    @Override
    public LetraCurso guardar(LetraCurso letraCurso) {
        return repoLetraCurso.save(letraCurso);
    }

    @Override
    public void eliminar(Integer idLetraCurso) {
        repoLetraCurso.deleteById(idLetraCurso);
    }
}
