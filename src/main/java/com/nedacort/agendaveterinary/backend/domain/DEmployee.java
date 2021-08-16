package com.nedacort.agendaveterinary.backend.domain;

import lombok.Data;

import java.util.List;

@Data
public class DEmployee {

    private Integer id;

    private byte[] contract;

    private Boolean active;

    private byte[] professionalCard;

    private DPositionEmployee DPositionEmployee;

    private List<DEmployeePositionEmployee> DEmployeePositionEmployees;

    private List<DUser> DUsers;
}
