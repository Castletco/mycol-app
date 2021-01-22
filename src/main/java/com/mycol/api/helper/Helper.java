package com.mycol.api.helper;

import com.mycol.api.entity.*;
import com.mycol.api.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class Helper {

    @Autowired
    private IEstadoService serviceEstados;

    @Autowired
    private IRolService serviceRoles;

    @Autowired
    private IAnioAcademicoService serviceAnioAcademico;

    @Autowired
    private INivelService serviceNiveles;

    public Usuario generaUsuarioApoderado (FirmaMatricula firma) {
        Usuario userApoderado = new Usuario();
        userApoderado.setEstado(setEstadoInicial());
        userApoderado.setRol(setRolInicial());
        userApoderado.setNacionalidad(firma.getNacionalidadApoderado());
        userApoderado.setNombreUsuario(firma.getNombreApoderado());
        userApoderado.setApellidoPaternoUsuario(firma.getApellidoPatApoderado());
        userApoderado.setApellidoMaternoUsuario(firma.getApellidoMatApoderado());
        userApoderado.setRut(firma.getRutApoderado());
        userApoderado.setFechaNacimiento(firma.getFechaNacimientoApoderado());
        userApoderado.setEdad(firma.getEdadApoderado());
        userApoderado.setSexo(firma.getSexoSApoderado());
        userApoderado.setDireccion(firma.getDireccionApoderado());
        userApoderado.setTelefono(firma.getTelefonoApoderado());
        userApoderado.setRegion(firma.getRegionApoderado());
        userApoderado.setComuna(firma.getComunaApoderado());
        userApoderado.setEmail(firma.getEmailApoderado());
        userApoderado.setUsername(randomAlphaNumeric(3));
        userApoderado.setPassword(null);
        return userApoderado;
    }

    public Apoderado generaApoderadoSinUsuario (int viveConAlumno) {
        Apoderado apoderado = new Apoderado();
        apoderado.setEstado(setEstadoInicial());
        apoderado.setViveConAlumno(viveConAlumno);
        return apoderado;
    }

    public Usuario generaUsuarioAlumno (FirmaMatricula firma) {
        Usuario userAlumno = new Usuario();
        userAlumno.setEstado(setEstadoInicial());
        userAlumno.setRol(setRolInicial());
        userAlumno.setNacionalidad(firma.getNacionalidadAlumno());
        userAlumno.setNombreUsuario(firma.getNombreAlumno());
        userAlumno.setApellidoPaternoUsuario(firma.getApellidoPatAlumno());
        userAlumno.setApellidoMaternoUsuario(firma.getApellidoMatAlumno());
        userAlumno.setRut(firma.getRutAlumno());
        userAlumno.setFechaNacimiento(firma.getFechaNacimientoAlumno());
        userAlumno.setEdad(firma.getEdadAlumno());
        userAlumno.setSexo(firma.getSexoSAlumno());
        userAlumno.setDireccion(firma.getDireccionAlumno());
        userAlumno.setTelefono(firma.getTelefonoAlumno());
        userAlumno.setRegion(firma.getRegionAlumno());
        userAlumno.setComuna(firma.getComunaAlumno());
        userAlumno.setEmail(firma.getEmailAlumno());
        userAlumno.setUsername(randomAlphaNumeric(3));
        userAlumno.setPassword("12345");
        return userAlumno;
    }

    public Matricula generarMatriculaSinUsuario (FirmaMatricula firma) {
        Matricula matricula = new Matricula();
        matricula.setNivel(generaNivel(Integer.parseInt(firma.getNivelMatricula())));
        matricula.setAnioAcademico(generaAnioAcademico(firma.getAnioAcademico_id()));
        matricula.setNumeroMatricula(firma.getNumeroMatricula());
        matricula.setEstado(setEstadoInicial());
        return matricula;
    }

    public DatosFamiliares generaDatosFamiliaresAlumno (FirmaMatricula firma) {
        DatosFamiliares datosFamiliares = new DatosFamiliares();
        datosFamiliares.setConoceSuPuntajeRSH(firma.getConocePuntajeRsh());
        datosFamiliares.setNombrePuebloOriginario(firma.getPuebloOriginarioAlumno());
        datosFamiliares.setPuebloOriginario(firma.getEsPuebloOriginario());
        return datosFamiliares;
    }

    public Estado setEstadoInicial() {
        return serviceEstados.buscarPorId(1);
    }

    public Rol setRolInicial() {
        return serviceRoles.buscarPorId(1);
    }

    public Nivel generaNivel(int idNivel) {
        return serviceNiveles.buscarPorId(idNivel);
    }

    public AnioAcademico generaAnioAcademico(int anioAcademico_id) {
        return serviceAnioAcademico.buscarPorId(anioAcademico_id);
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
