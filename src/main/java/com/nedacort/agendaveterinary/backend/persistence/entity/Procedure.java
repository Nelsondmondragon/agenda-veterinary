package com.nedacort.agendaveterinary.backend.persistence.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = "procedimiento")
public class Procedure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_procedimiento")
    private Integer id;

    @Column(name = "nombre_procedimineto")
    private String name;

    @Column(name = "periodo_procedimiento")
    private LocalDateTime periodProcedures;

    @OneToMany(mappedBy = "procedure")
    private List<VisitProcedureLotEarned> visitProcedureLotEarneds;
}
