package com.nedacort.agendaveterinary.backend.domain;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
public class DPerson {

    private Long id;

    private String identification;

    private String typeIdentification;

    private String nameOne;

    private String nameTwo;

    private String surNameOne;

    private String surNameTwo;

    private String numberPhone;

    private LocalDateTime birthDate;

    private Integer age;

}
