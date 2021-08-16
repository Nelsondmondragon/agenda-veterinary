package com.nedacort.agendaveterinary.backend.domain.repository;

import com.nedacort.agendaveterinary.backend.domain.DLotEarned;
import com.nedacort.agendaveterinary.backend.persistence.entity.LotEarned;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface DLotEarnedRepository {
    List<DLotEarned> getAll();

    Optional<DLotEarned> getByD();

    DLotEarned save(DLotEarned dLotEarned);

    void delete(Integer id);
}
