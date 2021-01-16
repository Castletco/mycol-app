package com.mycol.api.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Cursos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne
    @JoinColumn(name = "idProfesor")
    private Profesor profesor;
    @OneToOne
    @JoinColumn(name = "idNivel")
    private Nivel nivel;
    @OneToOne
    @JoinColumn(name = "idLetraCurso")
    private LetraCurso letraCurso;
    private String nombre;
    private Integer anio;
    private LocalDate fechaCreacion;
    private LocalDate fechaModificacion;
    private Integer createdBy;
    private Integer modifiedBy;


}
