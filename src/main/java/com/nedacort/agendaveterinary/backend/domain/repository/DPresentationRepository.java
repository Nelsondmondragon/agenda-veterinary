package com.nedacort.agendaveterinary.backend.domain.repository;

import com.nedacort.agendaveterinary.backend.domain.DPresentation;
import com.nedacort.agendaveterinary.backend.persistence.entity.Presentation;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface DPresentationRepository {
    List<DPresentation> getAll();

    Optional<DPresentation> getByD();

    DPresentation save(DPresentation dPresentation);

    void delete(Integer id);
}
