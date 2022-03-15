package es.ucm.fdi.is2.h2sample.domain.mapper;

import es.ucm.fdi.is2.h2sample.domain.resource.PokemonResource;
import es.ucm.fdi.is2.h2sample.persistence.entity.PokemonEntity;

public class PokemonResourceToEntityMapper {

    public static PokemonEntity mapPokemonResourceToPokemonEntity(PokemonResource resource) {

        PokemonEntity entity = new PokemonEntity();
        entity.setName(resource.getName());
        entity.setType(resource.getType());
        entity.setAttack(resource.getAttack());

        return entity;
    }

}
