package com.nedacort.agendaveterinary.backend.domain.repository;

import com.nedacort.agendaveterinary.backend.domain.DProcedure;
import com.nedacort.agendaveterinary.backend.persistence.entity.Procedure;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface DProcedureRepository {
    List<DProcedure> getAll();

    Optional<DProcedure> getByD();

    DProcedure save(DProcedure dProcedure);

    void delete(Integer id);
}
