package com.nedacort.agendaveterinary.backend.domain.repository;

import com.nedacort.agendaveterinary.backend.domain.DEmployeePositionEmployee;
import com.nedacort.agendaveterinary.backend.domain.DFarm;
import com.nedacort.agendaveterinary.backend.persistence.entity.Farm;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface DFarmRepository {
    List<DFarm> getAll();

    Optional<DFarm> getByDFarm();

    DFarm save(DFarm dFarm);

    void delete(Integer id);
}
