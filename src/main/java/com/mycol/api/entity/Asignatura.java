package com.mycol.api.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Asignaturas")
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
    @OneToOne
    @JoinColumn(name = "idEstablecimiento")
    private Establecimiento establecimiento;
    private LocalDate fechaCreacion;
    private LocalDate fechaModificacion;
    private Integer createdBy;
    private Integer modifiedBy;
}
