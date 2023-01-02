package com.csv.Pokedexapi.models.PokemonModels.PokemonShapes;

import com.csv.Pokedexapi.models.CommonModels.Name;
import com.csv.Pokedexapi.models.CommonModels.NamedAPIResource;

import java.util.List;

public class PokemonShape {

    private int id;
    private String name;
    private List<Name> names;
    private List<AwesomeName> awesome_names;
    private NamedAPIResource<PokemonSpecies> pokemon_species;

}
