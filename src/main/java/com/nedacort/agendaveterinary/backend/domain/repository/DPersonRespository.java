package com.nedacort.agendaveterinary.backend.domain.repository;

import com.nedacort.agendaveterinary.backend.domain.DPerson;
import com.nedacort.agendaveterinary.backend.persistence.entity.Person;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface DPersonRespository extends CrudRepository<Person, Integer> {
    List<DPerson> getAll();

    Optional<DPerson> getByD();

    DPerson save(DPerson dPerson);

    void delete(Integer id);
}
