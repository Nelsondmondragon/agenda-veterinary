package com.nedacort.agendaveterinary.backend.domain;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class DInvoice {


    private Integer id;

    private LocalDateTime date;

    private Double priceTotal;

    private Integer idVisit;

    private DVisit visit;

    private List<DInvoiceProduct> invoiceProducts;
}
