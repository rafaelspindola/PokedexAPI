package com.csv.Pokedexapi.models.PokemonModels.PokemonColors;

import com.csv.Pokedexapi.models.CommonModels.Name;
import com.csv.Pokedexapi.models.CommonModels.NamedAPIResource;
import com.csv.Pokedexapi.models.CommonModels.PokeAPIResource;
import com.csv.Pokedexapi.models.PokemonModels.PokemonSpecies.PokemonSpecies;

import java.util.List;

public class PokemonColor implements PokeAPIResource {

    private int id;
    private String name;
    private List<Name> names;
    private NamedAPIResource<PokemonSpecies> pokemon_species;

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }
}
