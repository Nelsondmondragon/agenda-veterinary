package com.nedacort.agendaveterinary.backend.domain.repository;

import com.nedacort.agendaveterinary.backend.domain.DCompany;
import com.nedacort.agendaveterinary.backend.persistence.entity.Company;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface DCompanyRepository {

    List<DCompany> getAll();

    Optional<DCompany> getByIdDCompany();

    DCompany save(DCompany dCompany);

    void delete(Integer id);
}
