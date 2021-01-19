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
    private LocalDate fechaNacimiento;
    private int edadAlumno;
    private char sexoSAlumno;
    private int nacionalidadAlumno;
    private String alumnoNuevo;
    private String nivelMatricula;
    private String telefonoAlumno;
    private String emailAlumno;
    private boolean originarioAlumno;
    private String puebloOriginarioAlumno;
    private boolean tipoAlumnoCheck;
    private String tipoAlumnoSeleccionado;
    private String direccionAlumno;
    private int regionAlumno;
    private int comunaAlumno;
    private String parentezcoApoderado;
    private String otroParentezco;
    private String nombreApoderado;
    private String apellidoPatApoderado;
    private String apellidoMatApoderado;
    private String rutApoderado;
    private LocalDate fechaNacimientoApoderado;
    private int edadApoderado;
    private char sexoSApoderado;
    private int nacionalidadApoderado;
    private String apoderadoViveConAlumno;
    private String telefonoApoderado;
    private String emailApoderado;
    private String direccionApoderado;
    private int regionApoderado;
    private int comunaApoderado;
    private String hermanos;
    private String conQuienVive;
    private String nombreConQuienVive;
    private int checkRolJunji;
    private String detalleRolJunji;
    private int tieneRsh;
    private int conocePuntajeRsh;
    private int puntajeRsh;
}
