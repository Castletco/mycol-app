package com.mycol.api.helper;

import com.mycol.api.entity.*;
import com.mycol.api.repository.*;
import com.mycol.api.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class Helper {

    @Autowired
    private INacionalidadService serviceNacionalidad;

    @Autowired
    private IComunaService serviceComunas;

    @Autowired
    private IRegionService serviceRegiones;

    @Autowired
    private IEstadoService serviceEstados;

    @Autowired
    private IPerfilService servicePerfiles;

    @Autowired
    private ITipoUsuarioService serviceTipoUsuarios;

    @Autowired
    private IProfesorService serviceProfesores;

    @Autowired
    private ICursoService serviceCursos;

    @Autowired
    private INivelService serviceNiveles;

    public Usuario generaUsuarioAlumno (FirmaMatricula firma) {
        Usuario userAlumno = new Usuario();
        userAlumno.setNombreUsuario(firma.getNombreAlumno());
        userAlumno.setApellidoPaternoUsuario(firma.getApellidoPatAlumno());
        userAlumno.setApellidoMaternoUsuario(firma.getApellidoMatAlumno());
        userAlumno.setRut(firma.getRutAlumno());
        userAlumno.setFechaNacimiento(firma.getFechaNacimientoAlumno());
        userAlumno.setEdad(firma.getEdadAlumno());
        userAlumno.setSexo(firma.getSexoSAlumno());
        userAlumno.setDireccion(firma.getDireccionAlumno());
        userAlumno.setTelefono(firma.getTelefonoAlumno());
        Nacionalidad nacionalidad = serviceNacionalidad.buscarPorId(firma.getNacionalidadAlumno());
        userAlumno.setNacionalidad(nacionalidad);
        Region region = serviceRegiones.buscarPorId(firma.getRegionAlumno());
        userAlumno.setRegion(region);
        Comuna comuna = serviceComunas.buscarPorId(firma.getComunaAlumno());
        userAlumno.setComuna(comuna);
        userAlumno.setEstado(setEstadoInicial());
        userAlumno.setEmail(firma.getEmailAlumno());
        userAlumno.setTipoUsuario(setTipoUsuarioInicialAlumno());
        userAlumno.setPerfil(setPerfilInicial());
        userAlumno.setFechaCreacion(LocalDate.now());
        userAlumno.setFechaModificacion(null);
        userAlumno.setModifiedBy(null);
        userAlumno.setCreatedBy(null);
        userAlumno.setUsername(randomAlphaNumeric(3));
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
        Nacionalidad nacionalidad = serviceNacionalidad.buscarPorId(firma.getNacionalidadApoderado());
        userApoderado.setNacionalidad(nacionalidad);
        Region region = serviceRegiones.buscarPorId(firma.getRegionApoderado());
        userApoderado.setRegion(region);
        Comuna comuna = serviceComunas.buscarPorId(firma.getComunaApoderado());
        userApoderado.setComuna(comuna);
        userApoderado.setEstado(setEstadoInicial());
        userApoderado.setEmail(firma.getEmailApoderado());
        userApoderado.setPerfil(setPerfilInicial());
        userApoderado.setTipoUsuario(setTipoUsuarioInicialApoderado());
        userApoderado.setFechaCreacion(LocalDate.now());
        userApoderado.setFechaModificacion(null);
        userApoderado.setModifiedBy(null);
        userApoderado.setUsername(randomAlphaNumeric(3));
        userApoderado.setPassword("12345");
        return userApoderado;
    }

    public Apoderado generaApoderadoSinF (int viveAlumno) {
        Apoderado apoderado = new Apoderado();
        apoderado.setViveConAlumno(viveAlumno == 1);
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
        return serviceEstados.buscarPorId(1);
    }

    public Perfil setPerfilInicial() {
        return servicePerfiles.buscarPorId(2);
    }

    public TipoUsuario setTipoUsuarioInicialApoderado() {
        return serviceTipoUsuarios.buscarPorId(6);
    }

    public TipoUsuario setTipoUsuarioInicialAlumno() {
        return serviceTipoUsuarios.buscarPorId(5);
    }

    public Curso generaCursoDummy() {
        return serviceCursos.buscarPorId(1);
    }

    public Profesor generaProfesorDummy() {
        return serviceProfesores.buscarPorId(1);
    }

    public Nivel generaNivel(int idNivel) {
        return serviceNiveles.buscarPorId(idNivel);
    }

    public static String randomAlphaNumeric (int count) {
        String CARACTERES = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder builder = new StringBuilder();
        while(count-- != 0) {
            int character = (int) (Math.random() * CARACTERES.length());
            builder.append(CARACTERES.charAt(character));
        }
        return builder.toString();
    }
}
