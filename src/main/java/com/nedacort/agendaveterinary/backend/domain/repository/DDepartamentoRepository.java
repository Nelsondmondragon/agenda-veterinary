package com.nedacort.agendaveterinary.backend.domain.repository;

import com.nedacort.agendaveterinary.backend.domain.DDepartamento;
import com.nedacort.agendaveterinary.backend.persistence.entity.Departamento;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface DDepartamentoRepository {

    List<DDepartamento> getAll();

    Optional<DDepartamento> getByIdDDepartamento(Integer id);

    DDepartamento save(DDepartamento dDepartamento);

    void delete(Integer id);

}
