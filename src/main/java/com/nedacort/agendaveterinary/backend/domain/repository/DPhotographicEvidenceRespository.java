package com.nedacort.agendaveterinary.backend.domain.repository;

import com.nedacort.agendaveterinary.backend.domain.DPhotographicEvidence;
import com.nedacort.agendaveterinary.backend.persistence.entity.PhotographicEvidence;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface DPhotographicEvidenceRespository {
    List<DPhotographicEvidence> getAll();

    Optional<DPhotographicEvidence> getByD();

    DPhotographicEvidence save(DPhotographicEvidence dPhotographicEvidence);

    void delete(Integer id);
}
