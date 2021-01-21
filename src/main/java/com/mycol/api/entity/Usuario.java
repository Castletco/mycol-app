package com.mycol.api.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne
    @JoinColumn(name = "estado_id")
    private Estado estado;
    @OneToOne
    @JoinColumn(name = "rol_id")
    private Rol rol;
    private String nacionalidad;
    private String nombreUsuario;
    private String apellidoPaternoUsuario;
    private String apellidoMaternoUsuario;
    private String rut;
    private LocalDate fechaNacimiento;
    private Integer edad;
    private Character sexo;
    private String direccion;
    private String telefono;
    private String region;
    private String comuna;
    private String email;
    private String username;
    private String password;
    private Integer created_by;
    private Integer updated_by;
    private LocalDate created_at;
    private LocalDate updated_at;
    private LocalDate deleted_at;
}
