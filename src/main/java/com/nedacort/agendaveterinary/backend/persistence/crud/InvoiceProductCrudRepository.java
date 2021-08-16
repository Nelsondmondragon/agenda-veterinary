package com.nedacort.agendaveterinary.backend.persistence.crud;

import com.nedacort.agendaveterinary.backend.persistence.entity.InvoiceProduct;
import org.springframework.data.repository.CrudRepository;

public interface InvoiceProductCrudRepository extends CrudRepository<InvoiceProduct, Integer> {
}
