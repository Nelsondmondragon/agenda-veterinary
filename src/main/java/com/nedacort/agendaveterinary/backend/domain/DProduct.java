package com.nedacort.agendaveterinary.backend.domain;

import lombok.Data;

import java.util.List;

@Data
public class DProduct {

    private Integer id;

    private Double price;

    private Integer stock;

    private Integer idMark;

    private Integer idProvider;

    private DMark DMark;

    private DProvider DProvider;

    private List<DPresentationProduct> DPresentationProducts;

    private List<DInvoiceProduct> invoiceProducts;
}
