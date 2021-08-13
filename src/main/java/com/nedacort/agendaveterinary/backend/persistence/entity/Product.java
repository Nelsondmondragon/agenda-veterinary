package com.nedacort.agendaveterinary.backend.persistence.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "producto")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Integer id;

    @Column(name = "precio_producto")
    private Double price;

    @Column(name = "stock")
    private Integer stock;

    @Column(name = "fk_marca")
    private Integer idMark;

    @Column(name = "fk_proveedor")
    private Integer idProvider;

    @ManyToOne
    @JoinColumn(name = "fk_marca", insertable = false, updatable = false)
    private Mark mark;

    @ManyToOne
    @JoinColumn(name = "fk_proveedor", insertable = false, updatable = false)
    private Provider provider;

    @OneToMany(mappedBy = "product")
    private List<PresentationProduct> presentationProducts;

    @OneToMany(mappedBy = "product")
    private List<InvoiceProduct> invoiceProducts;
}
