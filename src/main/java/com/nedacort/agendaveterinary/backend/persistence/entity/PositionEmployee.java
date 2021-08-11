package com.nedacort.agendaveterinary.backend.persistence.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "cargo_empleado")
public class PositionEmployee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cargo_empleado")
    private Integer id;

    @Column(name = "cargo_empleado")
    private String namePosition;

    @OneToMany(mappedBy = "positionEmployee")
    private List<EmployeePositionEmployee> employeePositionEmployees;
}
