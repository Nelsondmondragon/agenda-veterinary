package com.nedacort.agendaveterinary.backend.persistence;

import com.nedacort.agendaveterinary.backend.domain.DMunicipio;
import com.nedacort.agendaveterinary.backend.domain.repository.RepositoryDMunicipio;
import com.nedacort.agendaveterinary.backend.persistence.crud.MunicipioCrudRepository;
import com.nedacort.agendaveterinary.backend.persistence.entity.Municipio;
import com.nedacort.agendaveterinary.backend.persistence.mapper.DMunicipioMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class MunicipioRepository implements RepositoryDMunicipio {

    @Autowired
    private MunicipioCrudRepository municipioCrudRepository;
    @Autowired
    private DMunicipioMapper mapperMunicipio;

    @Override
    public List<DMunicipio> getAll() {
        return mapperMunicipio.toDMunicipios((List<Municipio>) municipioCrudRepository.findAll());
    }

    @Override
    public Optional<List<DMunicipio>> getByIdDepartamento(Integer id) {
        return Optional.of(mapperMunicipio.toDMunicipios(municipioCrudRepository.findByIdDepartamentoOrderByNameAsc(id)));
    }

    @Override
    public Optional<DMunicipio> getMunicipio(Integer id) {
        return municipioCrudRepository.findById(id).map(municipio -> mapperMunicipio.toDMunicipio(municipio));
    }

    @Override
    public DMunicipio save(DMunicipio dMunicipio) {

        return mapperMunicipio.toDMunicipio(municipioCrudRepository.save(mapperMunicipio.toMunicipio(dMunicipio)));
    }

    @Override
    public void delete(Integer id) {
        municipioCrudRepository.deleteById(id);
    }


}
