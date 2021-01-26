package com.mycol.api.helper;

import com.mycol.api.entity.*;
import com.mycol.api.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.DecimalFormat;

@Component
public class Helper {

    @Autowired
    private IEstadoService serviceEstados;

    @Autowired
    private IRolService serviceRoles;

    @Autowired
    private IAnioAcademicoService serviceAnioAcademico;

    @Autowired
    private ICursoService serviceCursos;

    @Autowired
    private INivelService serviceNiveles;

    public Usuario generaUsuarioApoderado (FirmaMatricula firma) {
        Usuario userApoderado = new Usuario();
        userApoderado.setEstado(setEstadoInicial());
        userApoderado.setRol(setRolApoderado());
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

    public Apoderado generaApoderadoSinUsuario (boolean viveConAlumno) {
        Apoderado apoderado = new Apoderado();
        apoderado.setEstado(setEstadoInicial());
        apoderado.setViveConAlumno(viveConAlumno ? 1 : 0);
        return apoderado;
    }

    public Usuario generaUsuarioAlumno (FirmaMatricula firma) {
        Usuario userAlumno = new Usuario();
        userAlumno.setEstado(setEstadoInicial());
        userAlumno.setRol(setRolAlumno());
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
        userAlumno.setPassword(null);
        return userAlumno;
    }

    public Matricula generarMatriculaSinUsuario (FirmaMatricula firma) {
        Matricula matricula = new Matricula();
        matricula.setNivel(generaNivel(Integer.parseInt(firma.getNivelMatricula())));
        matricula.setEstado(setEstadoInicial());
        AnioAcademico anioAcademico = serviceAnioAcademico.buscarPorId(firma.getAnioAcademico());
        matricula.setNumeroMatricula(generarNumero(anioAcademico.getAnioAcademicoNumero()));
        return matricula;
    }

    public DatosFamiliares generaDatosFamiliaresAlumno (FirmaMatricula firma) {
        DatosFamiliares datosFamiliares = new DatosFamiliares();
        datosFamiliares.setEsPuebloOriginario(firma.isOriginarioAlumno() ? 1 : 0);
        datosFamiliares.setNombrePuebloOriginario(firma.getPuebloOriginarioAlumno());
        datosFamiliares.setViveConPadres(firma.isApoderadoViveConAlumno() ? 1 : 0);
        datosFamiliares.setTieneFichaSocialHogares(firma.isTieneRsh() ? 1 : 0);
        datosFamiliares.setPuntaje(firma.getPuntajeRsh() == "" ? 0 : Integer.parseInt(firma.getPuntajeRsh()));
        datosFamiliares.setConoceSuPuntajeRSH(firma.isConocePuntajeRsh() ? 1 : 0);
        return datosFamiliares;
    }

    public Estado setEstadoInicial() {
        return serviceEstados.buscarPorId(1);
    }

    public Rol setRolAlumno() {
        return serviceRoles.buscarPorId(2);
    }

    public Rol setRolApoderado() {
        return serviceRoles.buscarPorId(4);
    }

    public Nivel generaNivel(int idNivel) {
        return serviceNiveles.buscarPorId(idNivel);
    }

    public Curso setCursoInicial(int idCurso) {
        return serviceCursos.buscarPorId(idCurso);
    }

    public AnioAcademico getAnioAcademico (int idAnioAcademico) {
        return serviceAnioAcademico.buscarPorId(idAnioAcademico);
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

    //Se recibe como parámetro el número en forma de String que se trae de la consulta.
    private Integer generarNumero(int numero){
        String numeroMatricula = "";
        //Se hace el formato del String.
        DecimalFormat format = new DecimalFormat("00000000");
        //Se realiza la convesión del String recibido como parámetro y se le suma 1.
        numeroMatricula = format.format(Integer.valueOf(numero) + 1);
        return Integer.parseInt(numeroMatricula);
    }
}
