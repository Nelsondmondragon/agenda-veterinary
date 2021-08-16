package com.nedacort.agendaveterinary.backend.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
public class DFarm {


    private Integer id;
    private String name;
    private String informationExtra;
    private Integer idClient;
    private Integer idVereda;
    private DClient client;
    private DVereda vereda;
}
