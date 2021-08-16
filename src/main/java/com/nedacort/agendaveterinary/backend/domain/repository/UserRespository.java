package com.nedacort.agendaveterinary.backend.domain.repository;

import com.nedacort.agendaveterinary.backend.domain.DUser;
import com.nedacort.agendaveterinary.backend.persistence.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface UserRespository {
    List<DUser> getAll();

    Optional<DUser> getByD();

    DUser save(DUser dUser);

    void delete(Integer id);
}
