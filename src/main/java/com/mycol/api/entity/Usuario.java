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
    @JoinColumn(name = "idNacionalidad")
    private Nacionalidad nacionalidad;
    private String nombreUsuario;
    private String apellidoPaternoUsuario;
    private String apellidoMaternoUsuario;
    private String rut;
    private LocalDate fechaNacimiento;
    private Integer edad;
    private Character sexo;
    private String direccion;
    private String telefono;
    @OneToOne
    @JoinColumn(name = "idRegion")
    private Region region;
    @OneToOne
    @JoinColumn(name = "idComuna")
    private Comuna comuna;
    @OneToOne
    @JoinColumn(name = "idEstado")
    private Estado estado;
    private String email;
    private String username;
    private String password;
    @OneToOne
    @JoinColumn(name = "idTipoUsuario")
    private TipoUsuario tipoUsuario;
    @OneToOne
    @JoinColumn(name = "idPerfil")
    private Perfil perfil;
    private LocalDate fechaCreacion;
    private LocalDate fechaModificacion;
    private Integer createdBy;
    private Integer modifiedBy;
}
