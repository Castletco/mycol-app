package com.mycol.api.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "AnioAcademico")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AnioAcademico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer anioCurso;
    private LocalDate fechaInicio;
    private LocalDate fechaTermino;
    private String periodoAcademico;
    private LocalDate fechaInicioV1;
    private LocalDate fechaTerminoV1;
    private LocalDate fechaInicioV2;
    private LocalDate fechaTerminoV2;
    private LocalDate fechaInicioV3;
    private LocalDate fechaTerminoV3;
    @OneToOne
    @JoinColumn(name = "idEstado")
    private Estado estado;
    @OneToOne
    @JoinColumn(name = "idEstablecimiento")
    private Establecimiento establecimiento;
    private Integer cantidadMatriculas;
    private LocalDate fechaCreacion;
    private LocalDate fechaModificacion;
    private Integer createdBy;
    private Integer modifiedBy;
}
