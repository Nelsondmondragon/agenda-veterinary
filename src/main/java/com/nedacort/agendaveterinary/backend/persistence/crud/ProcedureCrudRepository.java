package com.nedacort.agendaveterinary.backend.persistence.crud;

import com.nedacort.agendaveterinary.backend.persistence.entity.Procedure;
import org.springframework.data.repository.CrudRepository;

public interface ProcedureCrudRepository extends CrudRepository<Procedure, Integer> {
}
