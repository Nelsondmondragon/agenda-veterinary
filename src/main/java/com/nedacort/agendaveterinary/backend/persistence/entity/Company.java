package com.nedacort.agendaveterinary.backend.persistence.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "empresa")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empresa")
    private Long idCompany;

    @Column(name = "razon_social")
    private String companyName;

    private String nit;

    @Column(name = "telefono")
    private String numberPhone;

    private String logo;
    private String email;

    @Column(name = "fk_municipio")
    private Municipio municipio;
}
