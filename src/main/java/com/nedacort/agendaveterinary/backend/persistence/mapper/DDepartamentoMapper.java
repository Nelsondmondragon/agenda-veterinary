package com.nedacort.agendaveterinary.backend.persistence.mapper;

import com.nedacort.agendaveterinary.backend.domain.DDepartamento;
import com.nedacort.agendaveterinary.backend.domain.DMunicipio;
import com.nedacort.agendaveterinary.backend.persistence.entity.Departamento;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface DDepartamentoMapper {

    DDepartamento toDDepartamento(Departamento departamento);


    @InheritInverseConfiguration
  //  @Mapping(target = "municipios", ignore = true)
    Departamento toDepartamento(DDepartamento dDepartamento);
}
