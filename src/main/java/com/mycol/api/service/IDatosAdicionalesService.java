package com.mycol.api.service;

import com.mycol.api.entity.DatosAdicionales;

import java.util.List;

public interface IDatosAdicionalesService {
    List<DatosAdicionales> buscarTodos();
    DatosAdicionales buscarPorId (int idDatosAdicionales);
    DatosAdicionales buscarPorIdAlumno (int idAlumno);
    DatosAdicionales guardar (DatosAdicionales datosAdicionales);
    void eliminar (int idDatosAdicionales);
}
