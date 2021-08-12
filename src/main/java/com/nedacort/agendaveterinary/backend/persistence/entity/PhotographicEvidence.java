package com.nedacort.agendaveterinary.backend.persistence.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "evidencia_fotograficas")
public class PhotographicEvidence {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_evidencia")
    private Integer id;

    @Column(name = "evidencias_foto")
    private byte[] photo;

    @ManyToOne
    @JoinColumn(name = "fk_visita")
    private Visit visit;
}
