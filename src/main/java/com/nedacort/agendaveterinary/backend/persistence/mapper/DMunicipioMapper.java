package com.nedacort.agendaveterinary.backend.persistence.mapper;

import com.nedacort.agendaveterinary.backend.domain.DMunicipio;
import com.nedacort.agendaveterinary.backend.persistence.entity.Municipio;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DMunicipioMapper {

    DMunicipio toDMunicipio(Municipio municipio);

    List<DMunicipio> toDMunicipios(List<Municipio> municipios);

    @InheritInverseConfiguration

    Municipio toMunicipio(DMunicipio dMunicipio);
}
