package com.nedacort.agendaveterinary.backend.domain.repository;

import com.nedacort.agendaveterinary.backend.domain.DVisit;
import com.nedacort.agendaveterinary.backend.persistence.entity.Visit;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface DVisitRepository {
    List<DVisit> getAll();

    Optional<DVisit> getByD();

    DVisit save(DVisit dVisit);

    void delete(Integer id);
}
