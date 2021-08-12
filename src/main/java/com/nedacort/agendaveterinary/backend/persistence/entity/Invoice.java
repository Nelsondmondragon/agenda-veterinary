package com.nedacort.agendaveterinary.backend.persistence.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "factura")
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_factura")
    private Integer id;

    @Column(name = "fecha_factura")
    private LocalDateTime date;

    @Column(name = "precio_total")
    private Double priceTotal;

    @ManyToOne
    @JoinColumn(name = "fk_visita")
    private Visit visit;
}
