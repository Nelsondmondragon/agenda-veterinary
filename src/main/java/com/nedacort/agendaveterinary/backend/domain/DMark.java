package com.nedacort.agendaveterinary.backend.domain;

import lombok.Data;

import java.util.List;

@Data
public class DMark {

    private Integer id;

    private String name;

    private List<DProduct> DProducts;
}
