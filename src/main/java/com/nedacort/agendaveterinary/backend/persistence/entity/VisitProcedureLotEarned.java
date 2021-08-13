package com.nedacort.agendaveterinary.backend.persistence.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "visitaprocediminetolote")
public class VisitProcedureLotEarned {

    @EmbeddedId
    private VisitProcedureLotEarnedPK id;

    @Column(name = "observacion")
    private String observation;

    @ManyToOne
    @JoinColumn(name = "fk_lote",insertable = false, updatable = false)
    private LotEarned lotEarned;

    @ManyToOne
    @JoinColumn(name = "fk_visita",insertable = false, updatable = false)
    private Visit visit;

    @ManyToOne
    @JoinColumn(name = "fk_procedimiento",insertable = false, updatable = false)
    private Procedure procedure;
}
