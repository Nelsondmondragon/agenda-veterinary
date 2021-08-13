package com.nedacort.agendaveterinary.backend.persistence.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

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

    @Column(name = "fk_visita")
    private Integer idVisit;

    @ManyToOne
    @JoinColumn(name = "fk_visita", insertable = false, updatable = false)
    private Visit visit;

    @OneToMany(mappedBy = "invoice")
    private List<InvoiceProduct> invoiceProducts;
}
