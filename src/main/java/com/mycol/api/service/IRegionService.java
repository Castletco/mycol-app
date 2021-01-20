package com.mycol.api.service;

import com.mycol.api.entity.Region;

import java.util.List;

public interface IRegionService {
    List<Region> buscarTodas();
    Region buscarPorId (int idRegion);
    Region guardar (Region region);
    void elimnar (Integer idRegion);
}
