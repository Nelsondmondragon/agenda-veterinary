package com.nedacort.agendaveterinary.backend.domain;

import lombok.Data;

import java.util.List;

@Data
public class DLotEarned {


    private Integer id;
    private Double pesoLot;
    private String typeLot;
    private List<DVisitProcedureLotEarned> DVisitProcedureLotEarneds;

}
