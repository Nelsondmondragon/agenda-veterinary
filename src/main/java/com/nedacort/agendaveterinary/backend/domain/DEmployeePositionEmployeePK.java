package com.nedacort.agendaveterinary.backend.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
public class DEmployeePositionEmployeePK implements Serializable {



    private Integer idPositionEmployee;


    private Integer idEmployee;


}
