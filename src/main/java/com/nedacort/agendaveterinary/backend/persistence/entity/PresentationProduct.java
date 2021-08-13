package com.nedacort.agendaveterinary.backend.persistence.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "presentacion_producto")
public class PresentationProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_presentacion_producto")
    private Integer id;

    private Integer stock;

    @ManyToOne
    @JoinColumn(name = "fk_presentacion",insertable = false, updatable = false)
    private Presentation presentation;

    @ManyToOne
    @JoinColumn(name = "fk_producto",insertable = false, updatable = false)
    private Product product;

}
