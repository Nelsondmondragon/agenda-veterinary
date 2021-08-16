package com.nedacort.agendaveterinary.backend.persistence.crud;

import com.nedacort.agendaveterinary.backend.persistence.entity.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonCrudRespository extends CrudRepository<Person, Integer> {
}
