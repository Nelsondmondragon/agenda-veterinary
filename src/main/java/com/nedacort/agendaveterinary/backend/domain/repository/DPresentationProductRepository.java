package com.nedacort.agendaveterinary.backend.domain.repository;

import com.nedacort.agendaveterinary.backend.domain.DPresentationProduct;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface DPresentationProductRepository {
    List<DPresentationProduct> getAll();

    Optional<DPresentationProduct> getByD();

    DPresentationProduct save(DPresentationProduct dPresentationProduct);

    void delete(Integer id);
}
