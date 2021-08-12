package com.nedacort.agendaveterinary.backend.persistence.entity;

import com.helger.commons.annotation.IsLocked;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "viatico")
public class Viatic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_viatico")
    private Integer id;

    @Column(name = "dinero_sobrante")
    private Double RemainingMoney;

    @Column(name = "costo_flete")
    private Double costFreight;

    @Column(name = "costo_gasoline")
    private Double costGasoline;

    @Column(name = "costo_extra")
    private Double costExtra;

    @Column(name = "costo_total")
    private Double costTotal;

    @OneToMany(mappedBy = "viatic")
    private List<Visit> visits;
}
