package com.nedacort.agendaveterinary.backend.persistence.entity;

import lombok.Data;
import lombok.extern.apachecommons.CommonsLog;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "persona")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_persona")
    private Long id;

    @Column(name = "identificacion_persona")
    private String identification;

    @Column(name = "tipo_identificacion")
    private String typeIdentification;

    @Column(name = "nombre_persona1")
    private String nameOne;

    @Column(name = "nombre_persona2")
    private String nameTwo;

    @Column(name = "apellido_persona1")
    private String surNameOne;

    @Column(name = "apellido_persona2")
    private String surNameTwo;

    @Column(name = "telefon_persona")
    private String numberPhone;

    @Column(name = "fecha_nacimiento")
    private LocalDateTime birthDate;

    @Column(name = "edad_persona")
    private Integer age;

}
