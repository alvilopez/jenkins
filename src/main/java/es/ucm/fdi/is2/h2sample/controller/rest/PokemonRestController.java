package es.ucm.fdi.is2.h2sample.controller.rest;

import es.ucm.fdi.is2.h2sample.domain.resource.PokemonResource;
import es.ucm.fdi.is2.h2sample.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;


import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class PokemonRestController {

    @Autowired
    private PokemonService service;


    @GetMapping("/pokemon/{name}")
    @ResponseBody
    @Validated
    public ResponseEntity<PokemonResource> findByName(@PathVariable final String name) {

        PokemonResource res = service.findByName(name);
        if(res != null)
            return new ResponseEntity<PokemonResource>(res, HttpStatus.OK);
        else
            return new ResponseEntity<PokemonResource>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/pokemon")
    @ResponseBody
    public ResponseEntity<List<PokemonResource>> findAll() {
        return new ResponseEntity<List<PokemonResource>>(service.findAll(), HttpStatus.OK);
    }

    @PostMapping("/pokemon")
    public ResponseEntity<PokemonResource> createPokemon(@RequestBody PokemonResource pokemon) {
        try {
            PokemonResource newPokemon = service.create(pokemon);
            return new ResponseEntity<PokemonResource>(newPokemon, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
