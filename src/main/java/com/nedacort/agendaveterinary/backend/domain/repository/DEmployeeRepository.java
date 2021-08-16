package com.nedacort.agendaveterinary.backend.domain.repository;

import com.nedacort.agendaveterinary.backend.domain.DEmployee;
import com.nedacort.agendaveterinary.backend.persistence.entity.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface DEmployeeRepository {

    List<DEmployee> getAll();

    Optional<DEmployee> getByIdDEmployee(Integer id);

    DEmployee save();

    void delete(Integer id);
}
