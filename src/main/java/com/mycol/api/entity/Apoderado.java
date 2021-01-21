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
@Table(name = "apoderados")
public class Apoderado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
    @OneToOne
    @JoinColumn(name = "estado_id")
    private Estado estado;
    private int viveConAlumno;
    private Integer created_by;
    private Integer updated_by;
    private LocalDate created_at;
    private LocalDate modified_at;
    private LocalDate deleted_at;
}
