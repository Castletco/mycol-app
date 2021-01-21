package com.mycol.api.service;

import com.mycol.api.entity.DatosFamiliares;

import java.util.List;

public interface IDatosFamiliaresService {
    List<DatosFamiliares> buscarTodos();
    DatosFamiliares buscarPorId (int idDatosAdicionales);
    DatosFamiliares buscarPorIdAlumno (int idAlumno);
    DatosFamiliares guardar (DatosFamiliares datosFamiliares);
    void eliminar (int idDatosAdicionales);
}
