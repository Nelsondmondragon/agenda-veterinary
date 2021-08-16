package com.nedacort.agendaveterinary.backend.persistence.crud;

import com.nedacort.agendaveterinary.backend.persistence.entity.Mark;
import org.springframework.data.repository.CrudRepository;

public interface MarkCrudRepository extends CrudRepository<Mark, Integer> {
}
