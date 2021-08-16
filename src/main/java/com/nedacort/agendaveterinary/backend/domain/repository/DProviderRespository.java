package com.nedacort.agendaveterinary.backend.domain.repository;

import com.nedacort.agendaveterinary.backend.domain.DProvider;

import java.util.List;
import java.util.Optional;

public interface DProviderRespository {
    List<DProvider> getAll();

    Optional<DProvider> getByD();

    DProvider save(DProvider dProvider);

    void delete(Integer id);
}
