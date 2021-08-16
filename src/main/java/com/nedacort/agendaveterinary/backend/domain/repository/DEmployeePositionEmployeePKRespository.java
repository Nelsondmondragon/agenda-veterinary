package com.nedacort.agendaveterinary.backend.domain.repository;

import com.nedacort.agendaveterinary.backend.domain.DEmployeePositionEmployee;
import com.nedacort.agendaveterinary.backend.domain.DEmployeePositionEmployeePK;
import com.nedacort.agendaveterinary.backend.persistence.entity.EmployeePositionEmployeePK;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface DEmployeePositionEmployeePKRespository {
    List<DEmployeePositionEmployeePK> getAll();

    Optional<DEmployeePositionEmployeePK> getByDEmployeePositionEmployeePk();

    DEmployeePositionEmployeePK save(DEmployeePositionEmployeePK dEmployeePositionEmployeePK);

    void delete(Integer id);
}
