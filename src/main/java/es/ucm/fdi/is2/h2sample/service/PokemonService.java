package es.ucm.fdi.is2.h2sample.service;

import static es.ucm.fdi.is2.h2sample.domain.mapper.PokemonEntityToResourceMapper.mapPokemonEntityToPokemonResource;
import static es.ucm.fdi.is2.h2sample.domain.mapper.PokemonResourceToEntityMapper.mapPokemonResourceToPokemonEntity;
import es.ucm.fdi.is2.h2sample.domain.resource.PokemonResource;
import es.ucm.fdi.is2.h2sample.persistence.entity.PokemonEntity;
import es.ucm.fdi.is2.h2sample.persistence.repository.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PokemonService {
    @Autowired
    private PokemonRepository repository;

    public PokemonResource findByName(String name) {
        Optional<PokemonEntity> result = repository.findByName(name);
        PokemonResource resource = result.isPresent()? mapPokemonEntityToPokemonResource(result.get()) : null;
        return resource;
    }

    public List<PokemonResource> findAll() {

        List<PokemonEntity> queryResults = repository.findAll();
        List<PokemonResource> resources = new ArrayList<PokemonResource>();

        for (PokemonEntity result: queryResults) {
            resources.add(mapPokemonEntityToPokemonResource(result));
        }

        return resources;
    }

    public PokemonResource create(PokemonResource pokemon) {
        return mapPokemonEntityToPokemonResource(repository.save(mapPokemonResourceToPokemonEntity(pokemon)));
    }

}
