package com.nedacort.agendaveterinary.backend.domain.repository;

import com.nedacort.agendaveterinary.backend.domain.DVereda;
import com.nedacort.agendaveterinary.backend.persistence.entity.Vereda;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface VeredaRepository {
    List<DVereda> getAll();

    Optional<DVereda> getByD();

    DVereda save(DVereda dVereda);

    void delete(Integer id);
}
