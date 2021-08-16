package com.nedacort.agendaveterinary.backend.persistence.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "empresa")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empresa")
    private Long id;

    @Column(name = "razon_social")
    private String name;

    private String nit;

    @Column(name = "telefono")
    private String numberPhone;

    private byte[] logo;
    private String email;

    @Column(name = "fk_municipio")
    private Integer idMunicipio;


    @ManyToOne
    @JoinColumn(name = "fk_municipio", insertable = false, updatable = false)
    private Municipio municipio;

    @OneToMany(mappedBy = "company")
    private List<User> users;
}
