package com.nedacort.agendaveterinary.backend.persistence.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
public class Farm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_finca")
    private Integer id;

    @Column(name = "nombre_finca")
    private String name;

    @Column(name = "infomacion_extra")
    private String informationExtra;


    @ManyToOne
    @JoinColumn(name = "fk_cliente")
    private Client client;

    @ManyToOne
    @JoinColumn(name = "fk_vereda")
    private Vereda vereda;

}
