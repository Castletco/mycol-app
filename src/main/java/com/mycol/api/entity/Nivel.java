package com.mycol.api.entity;

import lombok.*;
import org.apache.tomcat.jni.Local;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "niveles")
public class Nivel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombreNivel;
    private String codigoNivel;
    private Integer created_by;
    private Integer updated_by;
    private LocalDate created_at;
    private LocalDate updated_at;
    private LocalDate deleted_at;
}
