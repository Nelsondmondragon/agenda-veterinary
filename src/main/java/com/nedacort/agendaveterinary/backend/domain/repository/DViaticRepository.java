package com.nedacort.agendaveterinary.backend.domain.repository;

import com.nedacort.agendaveterinary.backend.domain.DViatic;
import com.nedacort.agendaveterinary.backend.persistence.entity.Viatic;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface DViaticRepository {
    List<DViatic> getAll();

    Optional<DViatic> getByD();

    DViatic save(DViatic dViatic);

    void delete(Integer id);
}
