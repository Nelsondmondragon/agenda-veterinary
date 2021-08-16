package com.nedacort.agendaveterinary.backend.persistence.crud;

import com.nedacort.agendaveterinary.backend.persistence.entity.Municipio;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MunicipioCrudRepository extends CrudRepository<Municipio, Integer> {

    List<Municipio> findByIdDepartamentoOrderByNameAsc(Integer idDepartamento);

}
