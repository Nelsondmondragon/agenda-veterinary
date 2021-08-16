package com.nedacort.agendaveterinary.backend.persistence.crud;

import com.nedacort.agendaveterinary.backend.persistence.entity.Farm;
import org.springframework.data.repository.CrudRepository;

public interface FarmCrudRepository extends CrudRepository<Farm, Integer> {
}
