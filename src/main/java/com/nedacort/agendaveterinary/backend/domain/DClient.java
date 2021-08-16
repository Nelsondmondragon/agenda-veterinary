package com.nedacort.agendaveterinary.backend.domain;

import com.nedacort.agendaveterinary.backend.persistence.entity.Farm;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
public class DClient {


    private Integer id;

    private Boolean active;

    @OneToMany(mappedBy = "client")
    private List<Farm> farms;
}
