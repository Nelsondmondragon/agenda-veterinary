package com.nedacort.agendaveterinary.backend.domain;

import lombok.Data;

import java.util.List;

@Data
public class DUser {

    private Integer id;
    private String userAccess;
    private String password;
    private Boolean active;
    private Boolean sessionActive;
    private Integer idCompany;
    private Integer idUser;
    private Integer idEmployee;
    private DCompany DCompany;
    private DUser DUser;
    private DEmployee DEmployee;
}
