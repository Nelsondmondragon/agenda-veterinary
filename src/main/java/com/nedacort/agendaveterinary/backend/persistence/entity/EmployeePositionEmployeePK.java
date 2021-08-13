package com.nedacort.agendaveterinary.backend.persistence.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@Embeddable
public class EmployeePositionEmployeePK implements Serializable {


    @Column(name = "id_cargo_empleado")
    private Integer idPositionEmployee;

    @Column(name = "id_empleado")
    private Integer idEmployee;


}
