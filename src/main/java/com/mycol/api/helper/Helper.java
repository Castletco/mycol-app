package com.mycol.api.helper;

import com.mycol.api.entity.*;
import com.mycol.api.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class Helper {

    @Autowired
    private NacionalidadRepository repoNacionalidades;

    @Autowired
    private ComunaRepository repoComunas;

    @Autowired
    private RegionRepository repoRegiones;

    public Usuario generaUsuarioAlumno (FirmaMatricula firma) {
        Usuario userAlumno = new Usuario();
        userAlumno.setNombreUsuario(firma.getNombreAlumno());
        userAlumno.setApellidoMaternoUsuario(firma.getApellidoPatAlumno());
        userAlumno.setApellidoMaternoUsuario(firma.getApellidoMatAlumno());
        userAlumno.setRut(firma.getRutAlumno());
        userAlumno.setFechaNacimiento(firma.getFechaNacimiento());
        userAlumno.setEdad(firma.getEdadAlumno());
        userAlumno.setSexo(firma.getSexoSAlumno());
        userAlumno.setDireccion(firma.getDireccionAlumno());
        userAlumno.setTelefono(firma.getTelefonoAlumno());
        Nacionalidad nacionalidad = repoNacionalidades.getOne(firma.getNacionalidadAlumno());
        userAlumno.setNacionalidad(nacionalidad);
        Region region = repoRegiones.getOne(firma.getRegionAlumno());
        userAlumno.setRegion(region);
        Comuna comuna = repoComunas.getOne(firma.getComunaAlumno());
        userAlumno.setComuna(comuna);
        userAlumno.setEstado(setEstadoInicial());
        userAlumno.setEmail(firma.getEmailAlumno());
        userAlumno.setTipoUsuario(setTipoUsuarioInicial());
        userAlumno.setPerfil(setPerfilInicial());
        userAlumno.setFechaCreacion(LocalDate.now());
        userAlumno.setFechaModificacion(null);
        userAlumno.setModifiedBy(null);
        userAlumno.setCreatedBy(null);
        userAlumno.setUsername("testUserName");
        userAlumno.setPassword("12345");
        return userAlumno;
    }

    public Usuario generaUsuarioApoderado (FirmaMatricula firma) {
        Usuario userApoderado = new Usuario();
        userApoderado.setNombreUsuario(firma.getNombreApoderado());
        userApoderado.setApellidoPaternoUsuario(firma.getApellidoPatApoderado());
        userApoderado.setApellidoMaternoUsuario(firma.getApellidoMatApoderado());
        userApoderado.setRut(firma.getRutApoderado());
        userApoderado.setFechaNacimiento(firma.getFechaNacimientoApoderado());
        userApoderado.setEdad(firma.getEdadApoderado());
        userApoderado.setSexo(firma.getSexoSApoderado());
        userApoderado.setDireccion(firma.getDireccionApoderado());
        userApoderado.setTelefono(firma.getTelefonoApoderado());
        Nacionalidad nacionalidad = repoNacionalidades.getOne(firma.getNacionalidadApoderado());
        userApoderado.setNacionalidad(nacionalidad);
        Region region = repoRegiones.getOne(firma.getRegionApoderado());
        userApoderado.setRegion(region);
        Comuna comuna = repoComunas.getOne(firma.getComunaApoderado());
        userApoderado.setComuna(comuna);
        userApoderado.setEstado(setEstadoInicial());
        userApoderado.setEmail(firma.getEmailApoderado());
        userApoderado.setPerfil(setPerfilInicial());
        userApoderado.setTipoUsuario(setTipoUsuarioInicial());
        userApoderado.setFechaCreacion(LocalDate.now());
        userApoderado.setFechaModificacion(null);
        userApoderado.setModifiedBy(null);
        return userApoderado;
    }

    public Apoderado generaApoderadoSinF (int viveAlumno) {
        Apoderado apoderado = new Apoderado();
        apoderado.setViveConAlumno(viveAlumno == 1 ? true : false);
        apoderado.setEstado(setEstadoInicial());
        apoderado.setFechaCreacion(LocalDate.now());
        apoderado.setFechaModificacion(null);
        return apoderado;
    }

    public Alumno generaAlumnoSinF (Character esNuevo){
        Alumno alumno = new Alumno();
        alumno.setEsNuevo(esNuevo);
        alumno.setFechaCreacion(LocalDate.now());
        alumno.setFechaModificacion(null);
        alumno.setCreatedBy(null);
        alumno.setModifiedBy(null);
        return alumno;
    }

    public Matricula generarMatriculaSinF (FirmaMatricula firma) {
        Matricula matricula = new Matricula();
        matricula.setNumeroMatricula(firma.getNumeroMatricula());
        matricula.setEstado(setEstadoInicial());
        matricula.setFechaCreacion(LocalDate.now());
        matricula.setFechaModificacion(null);
        matricula.setCreatedBy(null);
        matricula.setModifiedBy(null);
        return matricula;
    }

    public Estado setEstadoInicial() {
        Estado estado = new Estado();
        estado.setId(1);
        return estado;
    }

    public Perfil setPerfilInicial() {
        Perfil perfil = new Perfil();
        perfil.setId(1);
        return perfil;
    }

    public TipoUsuario setTipoUsuarioInicial() {
        TipoUsuario tipoUsuario = new TipoUsuario();
        tipoUsuario.setId(1);
        return tipoUsuario;
    }

    public Asignatura generaAsignaturaDummy () {
        Asignatura asignatura = new Asignatura();
        asignatura.setId(1);
        asignatura.setNombre("Lenguaje y Comunicacion");
        asignatura.setCodigo("LEN123");
        return asignatura;
    }


}
