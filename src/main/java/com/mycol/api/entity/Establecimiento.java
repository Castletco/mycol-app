package com.mycol.api.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Establecimientos")
public class Establecimiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombreEstablecimiento;
    private String direccionEstablecimiento;
    private Integer telefonoEstablecimiento;
    private LocalDate fechaCreacion;
    private LocalDate fechaModificacion;
    private Integer createdBy;
    private Integer modifiedBy;
}
