package com.nedacort.agendaveterinary.backend.persistence.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "presentacion")
public class Presentation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_presentacion")
    private Integer id;

    @Column(name = "tamano_presentacion")
    private String sizePresentation;

    @OneToMany(mappedBy = "presentation")
    private List<PresentationProduct> presentationProducts;
}
