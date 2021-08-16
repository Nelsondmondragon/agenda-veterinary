package com.nedacort.agendaveterinary.backend.domain;

import lombok.Data;

@Data
public class DPhotographicEvidence {

    private Integer id;

    private byte[] photo;

    private Integer idVisit;

    private DVisit DVisit;
}
