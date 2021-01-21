package com.mycol.api.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "estados")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Estado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String estado;
    private String descripcion;
    private Integer created_by;
    private Integer updated_by;
    private LocalDate created_at;
    private LocalDate updated_at;
    private LocalDate deleted_at;
}
