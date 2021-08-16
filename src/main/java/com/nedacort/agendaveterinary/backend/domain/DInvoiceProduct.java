package com.nedacort.agendaveterinary.backend.domain;

import lombok.Data;

@Data
public class DInvoiceProduct {


    private Integer id;
    private Integer quantity;
    private Double priceUnitary;
    private Integer idProduct;
    private Integer idInvoice;
    private DProduct DProduct;
    private DInvoice invoice;
}
