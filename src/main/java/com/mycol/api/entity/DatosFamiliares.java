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
@Table(name = "DatosFamiliares")
public class DatosFamiliares {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Boolean esPuebloOriginario;
    private String nombrePuebloOriginario;
    private Boolean viveConPadres;
    private Boolean tieneFichaSocialHogares;
    private Integer puntaje;
    @OneToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;
    private LocalDate fechaCreacion;
    private LocalDate fechaModificacion;
    private Integer createdBy;
    private Integer modifiedBy;
}
