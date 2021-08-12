package com.nedacort.agendaveterinary.backend.persistence.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Data
@Embeddable
public class VisitProcedureLotEarnedPK {

    @Column(name = "id_visita_procedimiento_lote")
    private Integer idVisitProcedureLotEarned;

    @Column(name = "fk_lote")
    private Integer idLot;

    @Column(name = "fk_visita")
    private Integer idVisit;

    @Column(name = "fk_procedimiento")
    private Integer idProcedure;
}
