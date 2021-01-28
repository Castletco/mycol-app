package com.mycol.api.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FirmaMatricula {
    private boolean alumnoNuevo;
    private int anioAcademico;
    private int anioAcademicoNumero;
    private String apellidoMatAlumno;
    private String apellidoMatApoderado;
    private String apellidoPatAlumno;
    private String apellidoPatApoderado;
    private boolean apoderadoViveConAlumno;
    private boolean checkRolJunji;
    private String comunaAlumno;
    private String comunaApoderado;
    private String conQuienVive;
    private boolean conocePuntajeRsh;
    private int curso;
    private String detalleRolJunji;
    private String direccionAlumno;
    private String direccionApoderado;
    private int edadAlumno;
    private int edadApoderado;
    private String emailAlumno;
    private String emailApoderado;
    private LocalDate fechaNacimientoAlumno;
    private LocalDate fechaNacimientoApoderado;
    private String hermanos;
    private String nacionalidadAlumno;
    private String nacionalidadApoderado;
    private String nivelMatricula;
    private String nombreAlumno;
    private String nombreApoderado;
    private String nombreConQuienVive;
    private boolean originarioAlumno;
    private String otroParentezco;
    private String parentezcoApoderado;
    private String puebloOriginarioAlumno;
    private String puntajeRsh;
    private String regionAlumno;
    private String regionApoderado;
    private String rutAlumno;
    private String rutApoderado;
    private char sexoSAlumno;
    private char sexoSApoderado;
    private String telefonoAlumno;
    private String telefonoApoderado;
    private boolean tieneRsh;
    private boolean tipoAlumnoCheck;
    private String tipoAlumnoSeleccionado;
}
