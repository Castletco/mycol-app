package com.mycol.api.helper;

import com.mycol.api.entity.Usuario;
import com.mycol.api.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Validator {

    @Autowired
    private IUsuarioService serviceUsuarios;

    public boolean existeUsuarioByRut (String rut) {
        Usuario usuario = serviceUsuarios.buscarPorRut(rut);
        if (usuario != null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean esAlumnoNuevo (Integer esNuevo) {
        if (esNuevo == 1) {
            return true;
        } else {
            return false;
        }
    }
}
