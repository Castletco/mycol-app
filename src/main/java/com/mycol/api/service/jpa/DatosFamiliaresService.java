package com.mycol.api.service.jpa;

import com.mycol.api.entity.DatosFamiliares;
import com.mycol.api.repository.DatosFamiliaresRepositoy;
import com.mycol.api.service.IDatosFamiliaresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DatosFamiliaresService implements IDatosFamiliaresService {

    @Autowired
    private DatosFamiliaresRepositoy repoDatosAdicionales;

    @Override
    public List<DatosFamiliares> buscarTodos() {
        return repoDatosAdicionales.findAll();
    }

    @Override
    public DatosFamiliares buscarPorId(int idDatosAdicionales) {
        Optional<DatosFamiliares> optional = repoDatosAdicionales.findById(idDatosAdicionales);
        if (optional.isPresent()) {
            return optional.get();
        }
        return null;
    }

    @Override
    public DatosFamiliares buscarPorIdAlumno(int idAlumno) {
        return repoDatosAdicionales.findByAlumno(idAlumno);
    }

    @Override
    public DatosFamiliares guardar(DatosFamiliares datosFamiliares) {
        return repoDatosAdicionales.save(datosFamiliares);
    }

    @Override
    public void eliminar(int idDatosAdicionales) {
        repoDatosAdicionales.deleteById(idDatosAdicionales);
    }
}
