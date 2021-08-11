package com.nedacort.agendaveterinary.backend.persistence.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "empleado_cargo_empleado")
public class EmployeePositionEmployee {

    @EmbeddedId
    private EmployeePositionEmployeePK id;

    @Column(name = "estado")
    private Boolean active;


    @ManyToOne
    @JoinColumn(name = "id_cargo_empleado")
    private PositionEmployee positionEmployee;

    @ManyToOne
    @JoinColumn(name = "id_empleado")
    private Employee employee;

}
