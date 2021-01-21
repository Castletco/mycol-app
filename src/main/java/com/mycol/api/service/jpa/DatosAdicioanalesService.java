package com.mycol.api.service.jpa;

import com.mycol.api.entity.DatosAdicionales;
import com.mycol.api.repository.DatosAdicionalesRepositoy;
import com.mycol.api.service.IDatosAdicionalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DatosAdicioanalesService implements IDatosAdicionalesService {

    @Autowired
    private DatosAdicionalesRepositoy repoDatosAdicionales;

    @Override
    public List<DatosAdicionales> buscarTodos() {
        return repoDatosAdicionales.findAll();
    }

    @Override
    public DatosAdicionales buscarPorId(int idDatosAdicionales) {
        Optional<DatosAdicionales> optional = repoDatosAdicionales.findById(idDatosAdicionales);
        if (optional.isPresent()) {
            return optional.get();
        }
        return null;
    }

    @Override
    public DatosAdicionales buscarPorIdAlumno(int idAlumno) {
        return repoDatosAdicionales.findByAlumno(idAlumno);
    }

    @Override
    public DatosAdicionales guardar(DatosAdicionales datosAdicionales) {
        return repoDatosAdicionales.save(datosAdicionales);
    }

    @Override
    public void eliminar(int idDatosAdicionales) {
        repoDatosAdicionales.deleteById(idDatosAdicionales);
    }
}
