package com.nedacort.agendaveterinary.backend.persistence.entity;

import lombok.Data;

import javax.persistence.*;

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

    @Column(name = "fk_cargo_empleado")
    private PositionEmployee positionEmployee;
}
