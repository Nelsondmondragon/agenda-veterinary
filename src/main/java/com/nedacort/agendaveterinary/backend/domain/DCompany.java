package com.nedacort.agendaveterinary.backend.domain;

import com.nedacort.agendaveterinary.backend.persistence.entity.Municipio;
import lombok.Data;

import java.util.List;

@Data
public class DCompany {
    private Long idCompany;
    private String companyName;
    private String nit;
    private String numberPhone;
    private byte[] logo;
    private String email;
    private Integer idMunicipio;
    private Municipio municipio;
    private List<DUser> DUsers;
}
