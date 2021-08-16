package com.nedacort.agendaveterinary.backend.domain.repository;

import com.nedacort.agendaveterinary.backend.domain.DMark;
import com.nedacort.agendaveterinary.backend.persistence.entity.Mark;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface DMarkRepository {
    List<DMark> getAll();

    Optional<DMark> getByDMark();

    DMark save(DMark dMark);

    void delete(Integer id);
}
