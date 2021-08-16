package com.nedacort.agendaveterinary.backend.domain.repository;

import com.nedacort.agendaveterinary.backend.domain.DEmployeePositionEmployee;
import com.nedacort.agendaveterinary.backend.persistence.entity.EmployeePositionEmployee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface DEmployeePositionEmployeeRepository {

    List<DEmployeePositionEmployee> getAll();

    Optional<DEmployeePositionEmployee> getByDEmployeePositionEmployee();

    DEmployeePositionEmployee save(DEmployeePositionEmployee dEmployeePositionEmployee);

    void delete(Integer id);
}
