package com.mycol.api.controller;

import com.mycol.api.entity.*;
import com.mycol.api.helper.Helper;
import com.mycol.api.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
@RequestMapping("/api")
public class MatriculaController {

    @Autowired
    private IMatriculaService serviceMatriculas;

    @Autowired
    private IUsuarioService serviceUsuarios;

    @Autowired
    private IApoderadoService serviceApoderados;

    @Autowired
    private IAlumnoService serviceAlumnos;

    @Autowired
    private INivelService serviceNiveles;

    @Autowired
    private Helper helper;

    @GetMapping("/matriculas")
    public List<Matricula> buscarTodas() { return serviceMatriculas.buscarTodas(); }

    @PostMapping("/matriculas")
    public Matricula guardar (@RequestBody FirmaMatricula firma) {

        Usuario usuarioApoderado = helper.generaUsuarioApoderado(firma);
        usuarioApoderado = serviceUsuarios.guardar(usuarioApoderado);
        Apoderado apoderado = helper.generaApoderadoSinF(firma.getApoderadoViveConAlumno());
        apoderado.setUsuario(usuarioApoderado);
        apoderado = serviceApoderados.guardar(apoderado);
        Usuario usuarioAlumno = helper.generaUsuarioAlumno(firma);
        usuarioAlumno = serviceUsuarios.guardar(usuarioAlumno);
        Alumno alumno = helper.generaAlumnoSinF(firma.getAlumnoNuevo() == "S" ? new Character('S') : new Character('N'));
        alumno.setCurso(helper.generaCursoDummy());
        alumno.setUsuario(usuarioAlumno);
        alumno.setApoderado(apoderado);
        alumno.setEstado(helper.setEstadoInicial());
        alumno = serviceAlumnos.guardar(alumno);
        Matricula matricula = helper.generarMatriculaSinF(firma);
        Nivel nivel = helper.generaNivel(Integer.parseInt(firma.getNivelMatricula()));
        matricula.setNivel(nivel);
        matricula.setApoderado(apoderado);
        matricula.setUsuario(usuarioAlumno);
        serviceMatriculas.guardar(matricula);
        return matricula;
    }

    @PutMapping("/matriculas")
    public Matricula modificar (@RequestBody Matricula matricula) {
        serviceMatriculas.guardar(matricula);
        return matricula;
    }

    @DeleteMapping("/matriculas/{id}")
    public String eliminar (@PathVariable("id") int idMatricula) {
        serviceMatriculas.eliminar(idMatricula);
        return "Registro Matricula Eliminado";
    }
}
