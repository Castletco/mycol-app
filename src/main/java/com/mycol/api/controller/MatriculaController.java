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
    private IDatosFamiliaresService serviceDatosFamiliares;

    @Autowired
    private Helper helper;

    @GetMapping("/matriculas")
    public List<Matricula> buscarTodas() { return serviceMatriculas.buscarTodas(); }

    @GetMapping("/matriculas/search/{id}")
    public Matricula buscarPorId (@PathVariable("id") int idMatricula) {
        return serviceMatriculas.buscarPorId(idMatricula);
    }

    @GetMapping("/matriculas/searchAnioAcademico/{id}")
    public List<Matricula> buscarMatriculasPorAnioAcademico (@PathVariable("id") int idAnioAcademico) {
        List<Matricula> listaMatricula = serviceMatriculas.buscarPorAnioAcademico(idAnioAcademico);
        return listaMatricula;
    }

    @PostMapping("/matriculas")
    public Matricula guardar (@RequestBody FirmaMatricula firma) {

        Usuario usuarioApoderado = helper.generaUsuarioApoderado(firma);
        usuarioApoderado = serviceUsuarios.guardar(usuarioApoderado);
        Apoderado apoderado = helper.generaApoderadoSinUsuario(firma.isApoderadoViveConAlumno());
        apoderado.setUsuario(usuarioApoderado);
        apoderado = serviceApoderados.guardar(apoderado);
        Usuario usuarioAlumno = helper.generaUsuarioAlumno(firma);
        usuarioAlumno = serviceUsuarios.guardar(usuarioAlumno);
        Alumno alumno = new Alumno();
        alumno.setUsuario(usuarioAlumno);
        alumno.setApoderado(apoderado);
        alumno.setEstado(helper.setEstadoInicial());
        alumno.setCurso(helper.setCursoInicial(firma.getCurso()));
        alumno.setAlumnoNuevo(firma.isAlumnoNuevo() ? 1 : 0);
        alumno = serviceAlumnos.guardar(alumno);
        DatosFamiliares datosFamiliares = helper.generaDatosFamiliaresAlumno(firma);
        datosFamiliares.setAlumno(alumno);
        serviceDatosFamiliares.guardar(datosFamiliares);
        Matricula matricula = helper.generarMatriculaSinUsuario(firma);
        matricula.setApoderado(apoderado);
        matricula.setUsuario(usuarioAlumno);
        matricula.setAnioAcademico(helper.getAnioAcademico(firma.getAnioAcademico()));
        matricula.setAlumno(alumno);
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
