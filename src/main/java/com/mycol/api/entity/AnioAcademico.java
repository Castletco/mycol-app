package com.mycol.api.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "anioacademico")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AnioAcademico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne
    @JoinColumn(name = "estado_id")
    private Estado estado;
    private LocalDate fechaInicio;
    private LocalDate fechaTermino;
    private String periodoAcademico;
    private LocalDate fechaInicioV1;
    private LocalDate fechaTerminoV1;
    private LocalDate fechaInicioV2;
    private LocalDate fechaTerminoV2;
    private LocalDate fechaInicioV3;
    private LocalDate fechaTerminoV3;
    private Integer cantidadMatriculas;
    private Integer created_by;
    private Integer updated_by;
    private LocalDate created_at;
    private LocalDate updated_at;
    private LocalDate deleted_at;
    private Integer anioAcademicoNumero;
}
