package com.mycol.api.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Matriculas")
public class Matricula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne
    @JoinColumn(name = "idApoderado")
    private Apoderado apoderado;
    @OneToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;
    @OneToOne
    @JoinColumn(name = "idCurso")
    private Curso curso;
    private Integer numeroMatricula;
    @OneToOne
    @JoinColumn(name = "idEstado")
    private Estado estado;
    private LocalDate fechaCreacion;
    private LocalDate fechaModificacion;
    private Integer createdBy;
    private Integer modifiedBy;
}
