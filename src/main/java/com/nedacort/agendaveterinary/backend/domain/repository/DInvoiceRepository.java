package com.nedacort.agendaveterinary.backend.domain.repository;

import com.nedacort.agendaveterinary.backend.domain.DInvoice;
import com.nedacort.agendaveterinary.backend.persistence.entity.Invoice;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface DInvoiceRepository {
    List<DInvoice> getAll();

    Optional<DInvoice> getByDInvoice();

    DInvoice save(DInvoice dInvoice);

    void delete(Integer id);
}
