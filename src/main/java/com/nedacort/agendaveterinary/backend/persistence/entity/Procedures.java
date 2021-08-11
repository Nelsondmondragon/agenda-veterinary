package com.nedacort.agendaveterinary.backend.persistence.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "procedimiento")
public class Procedures {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_procedimiento")
    private Integer id;

    @Column(name = "nombre_procedimineto")
    private String name;

    @Column(name = "periodo_procedimiento")
    private LocalDateTime periodProcedures;
}
