package com.nedacort.agendaveterinary.backend.domain.repository;

import com.nedacort.agendaveterinary.backend.domain.DInvoiceProduct;
import com.nedacort.agendaveterinary.backend.persistence.entity.InvoiceProduct;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface DInvoiceProductRepository {
    List<DInvoiceProduct> getAll();

    Optional<DInvoiceProduct> getByDInvoiceProduct();

    DInvoiceProduct save(DInvoiceProduct dInvoiceProduct);

    void delete(Integer id);
}
