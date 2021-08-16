package com.nedacort.agendaveterinary.backend.persistence.crud;

import com.nedacort.agendaveterinary.backend.persistence.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserCrudRespository extends CrudRepository<User, Integer> {
}
