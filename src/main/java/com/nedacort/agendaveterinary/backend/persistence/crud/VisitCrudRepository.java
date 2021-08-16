package com.nedacort.agendaveterinary.backend.persistence.crud;

import com.nedacort.agendaveterinary.backend.persistence.entity.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitCrudRepository extends CrudRepository<Visit, Integer> {
}
