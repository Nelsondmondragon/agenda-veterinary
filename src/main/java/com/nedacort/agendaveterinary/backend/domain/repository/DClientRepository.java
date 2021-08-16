package com.nedacort.agendaveterinary.backend.domain.repository;

import com.nedacort.agendaveterinary.backend.domain.DMunicipio;
import com.nedacort.agendaveterinary.backend.persistence.entity.Client;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface DClientRepository {

    List<DMunicipio> getAll();

    Optional<DMunicipio> getByIdDClient();

    DMunicipio save(DMunicipio dMunicipio);

    void delete(Integer id);

}
