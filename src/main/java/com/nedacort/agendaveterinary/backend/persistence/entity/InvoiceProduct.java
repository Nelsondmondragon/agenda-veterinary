package com.nedacort.agendaveterinary.backend.persistence.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "factura_producto")
public class InvoiceProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_factura_prodcuto")
    private Integer id;

    @Column(name = "cantidad_producto")
    private Integer quantity;

    @Column(name = "precio_unitario")
    private Double priceUnitary;

    @Column(name = "fk_producto")
    private Integer idProduct;

    @Column(name = "fk_factura")
    private Integer idInvoice;

    @ManyToOne
    @JoinColumn(name = "fk_producto", insertable = false, updatable = false)
    private Product product;

    @ManyToOne
    @JoinColumn(name = "fk_factura", insertable = false, updatable = false)
    private Invoice invoice;
}
