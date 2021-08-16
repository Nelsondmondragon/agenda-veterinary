package com.nedacort.agendaveterinary.backend.domain.repository;

import com.nedacort.agendaveterinary.backend.domain.DVisitProcedureLotEarned;
import com.nedacort.agendaveterinary.backend.persistence.entity.VisitProcedureLotEarned;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface DVisitProcedureLotEarnedRepository {
    List<DVisitProcedureLotEarned> getAll();

    Optional<DVisitProcedureLotEarned> getByD();

    DVisitProcedureLotEarned save(DVisitProcedureLotEarned dVisitProcedureLotEarned);

    void delete(Integer id);
}
