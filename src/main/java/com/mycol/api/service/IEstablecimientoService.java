package com.mycol.api.service;

import com.mycol.api.entity.Establecimiento;

import java.util.List;

public interface IEstablecimientoService {
    List<Establecimiento> buscarTodos();
    Establecimiento guardar (Establecimiento establecimiento);
    Establecimiento buscarPorId (Integer idEstablecimiento);
    void eliminar (Integer idEstablecimiento);
}
