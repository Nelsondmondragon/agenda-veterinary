package com.nedacort.agendaveterinary.backend.domain.repository;

import com.nedacort.agendaveterinary.backend.domain.DMunicipio;

import java.util.List;
import java.util.Optional;

public interface RepositoryDMunicipio {

    List<DMunicipio> getAll();

    Optional<List<DMunicipio>> getByIdDepartamento(Integer id);

    Optional<DMunicipio> getMunicipio(Integer id);

    DMunicipio save(DMunicipio dMunicipio);

    void delete(Integer id);
}
