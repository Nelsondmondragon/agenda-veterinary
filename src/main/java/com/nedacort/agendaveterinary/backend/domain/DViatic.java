package com.nedacort.agendaveterinary.backend.domain;

import lombok.Data;

import java.util.List;

@Data
public class DViatic {

    private Integer id;

    private Double RemainingMoney;

    private Double costFreight;

    private Double costGasoline;

    private Double costExtra;

    private Double costTotal;

    private List<DVisit> DVisits;
}
