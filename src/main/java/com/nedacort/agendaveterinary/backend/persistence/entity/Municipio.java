package com.nedacort.agendaveterinary.backend.persistence.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

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

    @Column(name = "fk_departamento")
    private Integer idDepartamento;

    @ManyToOne
    @JoinColumn(name = "fk_departamento", insertable = false, updatable = false)
    private Departamento departamento;

    @OneToMany(mappedBy = "municipio")
    private List<Company> companies;

    @OneToMany(mappedBy = "municipio")
    private List<Vereda> veredas;

}
