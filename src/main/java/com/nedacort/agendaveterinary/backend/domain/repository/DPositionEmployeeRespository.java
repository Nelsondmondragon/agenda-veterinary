package com.nedacort.agendaveterinary.backend.domain.repository;

import com.nedacort.agendaveterinary.backend.domain.DPositionEmployee;
import com.nedacort.agendaveterinary.backend.persistence.entity.PositionEmployee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface DPositionEmployeeRespository {
    List<DPositionEmployee> getAll();

    Optional<DPositionEmployee> getByD();

    DPositionEmployee save(DPositionEmployee dPositionEmployee);

    void delete(Integer id);
}
