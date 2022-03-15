package es.ucm.fdi.is2.h2sample.domain.mapper;

import es.ucm.fdi.is2.h2sample.domain.resource.PokemonResource;
import es.ucm.fdi.is2.h2sample.persistence.entity.PokemonEntity;

public class PokemonEntityToResourceMapper {
    public static PokemonResource mapPokemonEntityToPokemonResource(PokemonEntity entity) {

        PokemonResource resource = new PokemonResource();

        resource.setName(entity.getName());
        resource.setAttack(entity.getAttack());
        resource.setType(entity.getType());

        return resource;
    }
}
