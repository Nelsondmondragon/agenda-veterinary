package com.nedacort.agendaveterinary.backend.domain;

import lombok.Data;

@Data
public class DMunicipio {

    private Integer id;
    private String name;
    private Integer idDepartamento;
    private DDepartamento departamento;
}
