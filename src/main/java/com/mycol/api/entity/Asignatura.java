package com.mycol.api.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "asignaturas")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Asignatura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String codigo;
    private Integer created_by;
    private Integer updated_by;
    private LocalDate created_at;
    private LocalDate updated_at;
    private LocalDate deleted_at;
}
