package com.nedacort.agendaveterinary.backend.domain;

import com.nedacort.agendaveterinary.backend.persistence.entity.Municipio;
import lombok.Data;

import java.util.List;

@Data
public class DVereda {

    private Integer id;
    private String name;
    private Integer idMunicipio;
    private Municipio municipio;
}
