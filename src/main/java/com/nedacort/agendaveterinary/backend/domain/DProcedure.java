package com.nedacort.agendaveterinary.backend.domain;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class DProcedure {

    private Integer id;

    private String name;

    private LocalDateTime periodProcedures;

    private List<DVisitProcedureLotEarned> DVisitProcedureLotEarneds;
}
