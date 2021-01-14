package com.mycol.api.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "Apoderados")
public class Apoderado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne
    @JoinColumn(name = "idEstablecimiento")
    private Establecimiento establecimiento;
    @OneToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;
    @OneToMany(mappedBy = "Alumnos")
    private List<Alumno> listaAlumnos;
    private Boolean viveConAlumno;
    @OneToOne
    @JoinColumn(name = "idEstado")
    private Estado estado;
    private LocalDate fechaCreacion;
    private LocalDate fechaModificacion;
    private Integer createdBy;
    private Integer modifiedBy;
}
