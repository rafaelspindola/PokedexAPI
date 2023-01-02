package com.csv.Pokedexapi.models.PokemonModels.EggGroups;

import com.csv.Pokedexapi.models.CommonModels.Name;
import com.csv.Pokedexapi.models.CommonModels.PokeAPIResource;

import java.util.List;

public class EggGroup implements PokeAPIResource {

    private int id;
    private String name;
    private List<Name> names;
//    private NamedAPIResource<PokemonSpecies> pokemon_species;

}
