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
    private String nombreAlumno;
    private String apellidoPatAlumno;
    private String apellidoMatAlumno;
    private String rutAlumno;
    private LocalDate fechaNacimientoAlumno;
    private int edadAlumno;
    private char sexoSAlumno;
    private String nacionalidadAlumno;
    private Boolean alumnoNuevo;
    private String nivelMatricula;
    private String telefonoAlumno;
    private String emailAlumno;
    private int esPuebloOriginario;
    private String puebloOriginarioAlumno;
    private boolean tipoAlumnoCheck;
    private String tipoAlumnoSeleccionado;
    private String direccionAlumno;
    private String regionAlumno;
    private String comunaAlumno;
    private String parentezcoApoderado;
    private String otroParentezco;
    private String nombreApoderado;
    private String apellidoPatApoderado;
    private String apellidoMatApoderado;
    private String rutApoderado;
    private LocalDate fechaNacimientoApoderado;
    private int edadApoderado;
    private char sexoSApoderado;
    private String nacionalidadApoderado;
    private int apoderadoViveConAlumno;
    private String telefonoApoderado;
    private String emailApoderado;
    private String direccionApoderado;
    private String regionApoderado;
    private String comunaApoderado;
    private String hermanos;
    private String conQuienVive;
    private String nombreConQuienVive;
    private int checkRolJunji;
    private String detalleRolJunji;
    private int tieneRsh;
    private int conocePuntajeRsh;
    private int puntajeRsh;
    private int numeroMatricula;
    private int anioAcademico_id;
    private int curso_id;
}
