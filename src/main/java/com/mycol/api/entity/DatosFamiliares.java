package com.mycol.api.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "datosfamiliares")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DatosFamiliares {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne
    @JoinColumn(name = "alumno_id")
    private Alumno alumno;
    private int esPuebloOriginario;
    private String nombrePuebloOriginario;
    private int viveConPadres;
    private int tieneFichaSocialHogares;
    private int puntaje;
    private int conoceSuPuntajeRSH;
    private Integer created_by;
    private Integer updated_by;
    private LocalDate created_at;
    private LocalDate updated_at;
    private LocalDate deleted_at;
}
