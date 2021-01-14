package com.mycol.api.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "Alumnos")
public class Alumno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne
    @JoinColumn(name = "idEstablecimiento")
    private Establecimiento establecimiento;
    @OneToOne
    @JoinColumn(name = "idCurso")
    private Curso curso;
    @OneToOne
    @JoinColumn(name = "idAsignatura")
    private Asignatura asignatura;
    @OneToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;
    @ManyToOne
    @JoinColumn(name = "idApoderado", nullable = false)
    private Apoderado apoderado;
    private Character esNuevo;
    @OneToOne
    @JoinColumn(name = "idEstado")
    private Estado estado;
    private LocalDate fechaCreacion;
    private LocalDate fechaModificacion;
    private Integer createdBy;
    private Integer modifiedBy;
}
