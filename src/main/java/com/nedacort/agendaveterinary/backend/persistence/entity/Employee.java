package com.nedacort.agendaveterinary.backend.persistence.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "empleado")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empleado")
    private Integer id;

    @Column(name = "contrato_empleado")
    private String contract;

    @Column(name = "estado_empleado")
    private Boolean active;

    @Column(name = "tarjeta_profesional")
    private String professionalCard;

    @ManyToOne
    @JoinColumn(name = "fk_cargo_empleado", insertable = false, updatable = false)
    private PositionEmployee positionEmployee;

    @OneToMany(mappedBy = "employee")
    private List<EmployeePositionEmployee> employeePositionEmployees;
}
