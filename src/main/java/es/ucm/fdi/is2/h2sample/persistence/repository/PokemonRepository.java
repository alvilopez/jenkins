package es.ucm.fdi.is2.h2sample.persistence.repository;

import java.util.List;
import java.util.Optional;

import es.ucm.fdi.is2.h2sample.persistence.entity.PokemonEntity;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface PokemonRepository extends CrudRepository<PokemonEntity, Integer> {

    Optional<PokemonEntity> findByName(String name);

    List<PokemonEntity> findAll();

}