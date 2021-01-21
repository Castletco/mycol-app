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
@Table(name = "matriculas")
public class Matricula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne
    @JoinColumn(name = "apoderado_id")
    private Apoderado apoderado;
    @OneToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
    @OneToOne
    @JoinColumn(name = "nivel_id")
    private Nivel nivel;
    @OneToOne
    @JoinColumn(name = "estado_id")
    private Estado estado;
    @OneToOne
    @JoinColumn(name = "anioacademico_id")
    private AnioAcademico anioAcademico;
    private Integer numeroMatricula;
    private Integer created_by;
    private Integer updated_by;
    private LocalDate created_at;
    private LocalDate updated_at;
    private LocalDate deleted_at;
}
