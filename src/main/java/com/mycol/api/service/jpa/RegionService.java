package com.mycol.api.service.jpa;

import com.mycol.api.entity.Region;
import com.mycol.api.repository.RegionRepository;
import com.mycol.api.service.IRegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegionService implements IRegionService {

    @Autowired
    private RegionRepository repoRegiones;

    @Override
    public List<Region> buscarTodas() {
        return repoRegiones.findAll();
    }

    @Override
    public Region guardar(Region region) {
        return repoRegiones.save(region);
    }

    @Override
    public void elimnar(Integer idRegion) {
        repoRegiones.deleteById(idRegion);
    }
}
