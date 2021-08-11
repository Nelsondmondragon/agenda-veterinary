package com.nedacort.agendaveterinary.backend.persistence.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "vereda")
public class Vereda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_vereda")
    private Integer id;

    @Column(name = "nombre_vereda")
    private String name;

    @ManyToOne
    @JoinColumn(name = "fk_municipio")
    private Municipio municipio;
}
