package com.mycol.api.service;

import com.mycol.api.entity.Nacionalidad;

import java.util.List;

public interface INacionalidadService {
    List<Nacionalidad> buscarTodas();
    Nacionalidad guardar (Nacionalidad nacionalidad);
    void eliminar (Integer idNacionalidad);
}
