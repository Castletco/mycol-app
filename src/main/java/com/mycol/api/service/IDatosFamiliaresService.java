package com.mycol.api.service;

import com.mycol.api.entity.DatosFamiliares;

import java.util.List;

public interface IDatosFamiliaresService {
    List<DatosFamiliares> buscarTodos();
    DatosFamiliares guardar (DatosFamiliares datosFamiliares);
    DatosFamiliares buscarPorIdUsuario (Integer idUsuario);
    void eliminar (Integer idUsuario);
}
