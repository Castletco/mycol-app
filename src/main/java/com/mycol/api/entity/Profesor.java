package com.mycol.api.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Profesores")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Profesor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;
    @OneToOne
    @JoinColumn(name = "idEstado")
    private Estado estado;
    private LocalDate fechaCreacion;
    private LocalDate fechaModificacion;
    private Integer createdBy;
    private Integer modifiedBy;
}
