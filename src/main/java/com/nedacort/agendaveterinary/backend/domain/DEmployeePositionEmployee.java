package com.nedacort.agendaveterinary.backend.domain;

import lombok.Data;

@Data
public class DEmployeePositionEmployee {

    private DEmployeePositionEmployeePK id;

    private Boolean active;



    private DPositionEmployee DPositionEmployee;


    private DEmployee DEmployee;

}
