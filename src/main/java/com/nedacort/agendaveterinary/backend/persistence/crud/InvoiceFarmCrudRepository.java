package com.nedacort.agendaveterinary.backend.persistence.crud;

import com.nedacort.agendaveterinary.backend.persistence.entity.Invoice;
import org.springframework.data.repository.CrudRepository;

public interface InvoiceFarmCrudRepository extends CrudRepository<Invoice, Integer> {
}
