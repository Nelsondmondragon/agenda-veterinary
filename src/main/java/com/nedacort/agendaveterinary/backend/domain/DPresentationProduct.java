package com.nedacort.agendaveterinary.backend.domain;

import lombok.Data;

@Data
public class DPresentationProduct {

    private Integer id;
    private Integer idPresentation;
    private Integer idProduct;
    private Integer stock;
    private DPresentation DPresentation;
    private DProduct DProduct;

}
