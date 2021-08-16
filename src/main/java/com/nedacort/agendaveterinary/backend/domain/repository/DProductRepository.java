package com.nedacort.agendaveterinary.backend.domain.repository;

import com.nedacort.agendaveterinary.backend.domain.DProduct;
import com.nedacort.agendaveterinary.backend.persistence.entity.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface DProductRepository {
    List<DProduct> getAll();

    Optional<DProduct> getByD();

    DProduct save(DProduct dProduct);

    void delete(Integer id);
}
