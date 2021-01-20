package com.mycol.api.service;

import com.mycol.api.entity.Comuna;

import java.util.List;

public interface IComunaService {
    List<Comuna> buscarTodas();
    Comuna guardar (Comuna comuna);
    Comuna buscarPorId (int idComuna);
    Comuna buscarPorComuna (String nombreComuna);
    void eliminar (Integer idComuna);
}
