package com.nedacort.agendaveterinary.backend.persistence.crud;

import com.nedacort.agendaveterinary.backend.persistence.entity.Departamento;
import org.springframework.data.repository.CrudRepository;

public interface DepartamentoCrudRepository extends CrudRepository<Departamento, Integer> {
}
