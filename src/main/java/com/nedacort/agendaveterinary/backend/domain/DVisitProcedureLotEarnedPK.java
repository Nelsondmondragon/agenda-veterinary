package com.nedacort.agendaveterinary.backend.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
public class DVisitProcedureLotEarnedPK implements Serializable {

    private Integer idVisitProcedureLotEarned;

    private Integer idLot;

    private Integer idVisit;

    private Integer idProcedure;
}
