package com.nedacort.agendaveterinary.backend.persistence.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "loteGando")
public class LotEarned {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_lote")
    private Integer id;

    @Column(name = "peso_lote")
    private Double pesoLot;

    @Column(name = "tipo_lote")
    private String typeLot;
}
