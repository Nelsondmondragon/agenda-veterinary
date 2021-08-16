package com.nedacort.agendaveterinary.backend.persistence.crud;

import com.nedacort.agendaveterinary.backend.persistence.entity.Company;
import org.springframework.data.repository.CrudRepository;

public interface CompanyCrudRepository extends CrudRepository<Company, Integer> {
}
