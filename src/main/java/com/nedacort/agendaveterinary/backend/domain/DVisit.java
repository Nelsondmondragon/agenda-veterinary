package com.nedacort.agendaveterinary.backend.domain;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class DVisit {

    private Integer id;
    private LocalDateTime dateVisit;
    private LocalDateTime newDateVisit;
    private Integer idViatic;
    private Integer idFarm;
    private DViatic DViatic;
    private DFarm DFarm;
}
