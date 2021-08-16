package com.nedacort.agendaveterinary.backend.domain;

import lombok.Data;

@Data
public class DVisitProcedureLotEarned {

    private DVisitProcedureLotEarnedPK id;

    private String observation;

    private DLotEarned DLotEarned;

    private DVisit DVisit;

    private DProcedure DProcedure;
}
