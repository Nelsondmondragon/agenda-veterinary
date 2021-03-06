package com.nedacort.agendaveterinary.backend.persistence.entity;

import lombok.Data;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

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

    @Column(name = "fk_visita")
    private Integer idVisit;

    @ManyToOne
    @JoinColumn(name = "fk_visita", insertable = false, updatable = false)
    private Visit visit;
}
