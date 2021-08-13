package com.nedacort.agendaveterinary.backend.persistence.entity;

import lombok.Data;
import org.apache.tomcat.jni.Local;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = "visita")
public class Visit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_visita")
    private Integer id;

    @Column(name = "fecha_visita")
    private LocalDateTime dateVisit;

    @Column(name = "fecha_nueva_visita")
    private LocalDateTime newDateVisit;

    @Column(name = "fk_viatico")
    private Integer idViatic;

    @Column(name = "fk_finca")
    private Integer idFarm;

    @ManyToOne
    @JoinColumn(name = "fk_viatico",insertable = false, updatable = false)
    private Viatic viatic;

    @ManyToOne
    @JoinColumn(name = "fk_finca",insertable = false, updatable = false)
    private Farm farm;

    @OneToMany(mappedBy = "visit")
    private List<VisitProcedureLotEarned> visitProcedureLotEarneds;

    @OneToMany(mappedBy = "visit")
    private List<PhotographicEvidence> photographicEvidences;

    @OneToMany(mappedBy = "visit")
    private List<Invoice> invoices;
}
