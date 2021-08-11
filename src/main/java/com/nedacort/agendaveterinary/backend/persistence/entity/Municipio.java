package com.nedacort.agendaveterinary.backend.persistence.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "municipio")
public class Municipio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_municipio")
    private Integer id;

    @Column(name = "nombre_municipio")
    private String name;

    @ManyToOne
    @JoinColumn(name = "fk_departamento", insertable = false, updatable = false)
    private Departamento departamento;
}
